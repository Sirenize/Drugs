package net.sirenize;

import org.bukkit.*;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.*;

public class ItemLoader {

    public static Map<String, ItemData> loadItems(JavaPlugin plugin) {
        Map<String, ItemData> loaded = new HashMap<>();
        File itemsFolder = new File(plugin.getDataFolder(), "drugs");
        if (!itemsFolder.exists()) itemsFolder.mkdirs();

        File[] files = itemsFolder.listFiles((dir, name) -> name.endsWith(".yml"));
        if (files == null) return loaded;

        for (File file : files) {
            String itemId = file.getName().replace(".yml", "");
            YamlConfiguration config = YamlConfiguration.loadConfiguration(file);

            Material material = Material.getMaterial(config.getString("material", "STONE"));
            if (material == null) continue;

            ItemStack item = new ItemStack(material);
            ItemMeta meta = item.getItemMeta();
            if (meta != null) {
                if (config.contains("name")) meta.setDisplayName(config.getString("name"));
                if (config.contains("lore")) meta.setLore(config.getStringList("lore"));
                if (config.getBoolean("hide_flags", false)) {
                    meta.addItemFlags(ItemFlag.values());
                }

                List<String> enchants = config.getStringList("enchantments");
                for (String e : enchants) {
                    String[] parts = e.split(":");
                    Enchantment ench = Enchantment.getByName(parts[0].toUpperCase());
                    int level = parts.length > 1 ? Integer.parseInt(parts[1]) : 1;
                    if (ench != null) meta.addEnchant(ench, level, true);
                }

                item.setItemMeta(meta);
            }

            // recipe
            if (config.isConfigurationSection("recipe")) {
                var recipeSec = config.getConfigurationSection("recipe");
                if (recipeSec != null) {
                    List<String> shape = recipeSec.getStringList("shape");
                    var ingredients = recipeSec.getConfigurationSection("ingredients");
                    if (ingredients != null) {
                        ShapedRecipe recipe = new ShapedRecipe(
                                new NamespacedKey(plugin, "custom_" + itemId),
                                item
                        );
                        recipe.shape(shape.toArray(new String[0]));
                        for (String key : ingredients.getKeys(false)) {
                            Material ingMat = Material.getMaterial(ingredients.getString(key));
                            if (ingMat != null) {
                                recipe.setIngredient(key.charAt(0), ingMat);
                            }
                        }
                        Bukkit.addRecipe(recipe);
                    }
                }
            }

            // effects
            List<Map<String, Object>> rightClick = new ArrayList<>();

            if (config.isList("on_right_click")) {
                for (Map<?, ?> obj : config.getMapList("on_right_click")) {
                    rightClick.add((Map<String, Object>) obj);
                }
            }

            loaded.put(itemId, new ItemData(itemId, item, rightClick));
        }

        return loaded;
    }
}
