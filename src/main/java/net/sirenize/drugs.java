package net.sirenize;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Map;

public final class drugs extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        saveDefaultConfig();

        Map<String, ItemData> items = ItemLoader.loadItems(this);
        getServer().getPluginManager().registerEvents(new ItemListener(items), this);

        getLogger().info("Loaded " + items.size() + " drugs.");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
