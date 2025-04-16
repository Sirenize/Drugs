package net.sirenize;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {

    public static ItemStack acid;
    public static ItemStack alcohol;
    public static ItemStack ciggy;
    public static ItemStack coke;
    public static ItemStack dmt;
    public static ItemStack flakka;
    public static ItemStack heroin;
    public static ItemStack ketamine;
    public static ItemStack meth;
    public static ItemStack molly;
    public static ItemStack oxy;
    public static ItemStack pcp;
    public static ItemStack percocet;
    public static ItemStack salvia;
    public static ItemStack shrooms;
    public static ItemStack tussin;
    public static ItemStack weed;
    public static ItemStack xanax;

    public static void init() {
        createAcid();
        createAlcohol();
        createCiggy();
        createCoke();
        createDMT();
        createFlakka();
        createHeroin();
        createKetamine();
        createMeth();
        createMolly();
        createOxy();
        createPcp();
        createPercocet();
        createSalvia();
        createShrooms();
        createTussin();
        createWeed();
        createXanax();
    }

    private static void createAcid() {
        ItemStack item = new ItemStack(Material.PAPER, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§l§bACID");
        List<String> lore = new ArrayList<>();
        lore.add("§l§aEffects:");
        lore.add("§7- §6Nausea");
        lore.add("§7- §6Night Vision");
        lore.add("§7- §6Health Boost");
        lore.add("§7- §6Slow Falling");
        lore.add("§n§7Right-Click To Use");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK_OF_THE_SEA, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        acid = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("acid"), item);
        sr.shape("XYX",
                 "YWY",
                 "XYX");

        sr.setIngredient('X', Material.SPIDER_EYE);
        sr.setIngredient('Y', Material.PAPER);
        sr.setIngredient('W', Material.WATER_BUCKET);

        Bukkit.getServer().addRecipe(sr);

    }

    private static void createAlcohol() {
        ItemStack item = new ItemStack(Material.WATER_BUCKET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§l§6ALCOHOL");
        List<String> lore = new ArrayList<>();
        lore.add("§l§aEffects:");
        lore.add("§7- §6Speed");
        lore.add("§7- §6Night Vision");
        lore.add("§7- §6Hunger");
        lore.add("§7- §6Nausea");
        lore.add("§n§7Right-Click To Use");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK_OF_THE_SEA, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        alcohol = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("alcohol"), item);
        sr.shape(" Y ",
                 "XXX",
                 "WWW");

        sr.setIngredient('X', Material.GUNPOWDER);
        sr.setIngredient('Y', Material.PAPER);
        sr.setIngredient('W', Material.WATER_BUCKET);

        Bukkit.getServer().addRecipe(sr);

    }

    private static void createCiggy() {
        ItemStack item = new ItemStack(Material.REDSTONE_TORCH, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§l§6CIGGY");
        List<String> lore = new ArrayList<>();
        lore.add("§l§aEffects:");
        lore.add("§7- §6Saturation");
        lore.add("§7- §6Damage Resistance");
        lore.add("§7- §6Jump Boost");
        lore.add("§7- §6Mining Fatigue");
        lore.add("§n§7Right-Click To Use");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK_OF_THE_SEA, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        ciggy = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("ciggy"), item);
        sr.shape(" X ",
                 "YWY",
                 "YYY");

        sr.setIngredient('X', Material.GUNPOWDER);
        sr.setIngredient('Y', Material.PAPER);
        sr.setIngredient('W', Material.STICK);

        Bukkit.getServer().addRecipe(sr);

    }

    private static void createCoke() {
        ItemStack item = new ItemStack(Material.SUGAR, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§l§bCOKE");
        List<String> lore = new ArrayList<>();
        lore.add("§l§aEffects:");
        lore.add("§7- §6Strength");
        lore.add("§7- §6Haste");
        lore.add("§7- §6Health Boost");
        lore.add("§7- §6Resistance");
        lore.add("§n§7Right-Click To Use");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK_OF_THE_SEA, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        coke = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("coke"), item);
        sr.shape("XXX",
                "XWX",
                "XXX");

        sr.setIngredient('X', Material.SUGAR);
        sr.setIngredient('W', Material.WATER_BUCKET);

        Bukkit.getServer().addRecipe(sr);

    }

    private static void createDMT() {
        ItemStack item = new ItemStack(Material.GLOWSTONE_DUST, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§l§3DMT");
        List<String> lore = new ArrayList<>();
        lore.add("§l§aEffects:");
        lore.add("§7- §6Resistance");
        lore.add("§7- §6Slow Falling");
        lore.add("§7- §6Slowness");
        lore.add("§7- §6Glowing");
        lore.add("§n§7Right-Click To Use");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK_OF_THE_SEA, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        dmt = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("dmt"), item);
        sr.shape("XXX",
                "XWX",
                "XWX");

        sr.setIngredient('X', Material.SUGAR);
        sr.setIngredient('W', Material.GLOWSTONE_DUST);

        Bukkit.getServer().addRecipe(sr);

    }

    private static void createFlakka() {
        ItemStack item = new ItemStack(Material.QUARTZ, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§l§eFLAKKA");
        List<String> lore = new ArrayList<>();
        lore.add("§l§aEffects:");
        lore.add("§7- §6Speed");
        lore.add("§7- §6Resistance");
        lore.add("§7- §6Unluck");
        lore.add("§7- §6Dolphins Grace");
        lore.add("§n§7Right-Click To Use");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK_OF_THE_SEA, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        flakka = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("flakka"), item);
        sr.shape(" X ",
                "YYY",
                "W W");

        sr.setIngredient('X', Material.BIRCH_DOOR);
        sr.setIngredient('Y', Material.SWEET_BERRIES);
        sr.setIngredient('W', Material.WATER_BUCKET);

        Bukkit.getServer().addRecipe(sr);

    }

    private static void createHeroin() {
        ItemStack item = new ItemStack(Material.WITHER_ROSE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§l§4HEROIN");
        List<String> lore = new ArrayList<>();
        lore.add("§l§aEffects:");
        lore.add("§7- §6Weakness");
        lore.add("§7- §6Slowness");
        lore.add("§7- §6Unluck");
        lore.add("§7- §6Poison");
        lore.add("§n§7Right-Click To Use");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK_OF_THE_SEA, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        heroin = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("heroin"), item);
        sr.shape("XYY",
                " XW",
                " X ");

        sr.setIngredient('X', Material.DIRT);
        sr.setIngredient('Y', Material.RED_MUSHROOM);
        sr.setIngredient('W', Material.WOODEN_SWORD);

        Bukkit.getServer().addRecipe(sr);

    }

    private static void createKetamine() {
        ItemStack item = new ItemStack(Material.POWDER_SNOW_BUCKET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§l§cKETAMINE");
        List<String> lore = new ArrayList<>();
        lore.add("§l§aEffects:");
        lore.add("§7- §6Night Vision");
        lore.add("§7- §6Speed");
        lore.add("§7- §6Haste");
        lore.add("§7- §6Nausea");
        lore.add("§7- §6Slow Falling");
        lore.add("§n§7Right-Click To Use");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK_OF_THE_SEA, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        ketamine = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("ketamine"), item);
        sr.shape("XXX",
                "XYX",
                "XXX");

        sr.setIngredient('X', Material.SNOWBALL);
        sr.setIngredient('Y', Material.LAVA_BUCKET);

        Bukkit.getServer().addRecipe(sr);

    }

    private static void createMeth() {
        ItemStack item = new ItemStack(Material.PRISMARINE_SHARD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§l§bMETH");
        List<String> lore = new ArrayList<>();
        lore.add("§l§aEffects:");
        lore.add("§7- §6Absorption");
        lore.add("§7- §6Resistance");
        lore.add("§7- §6Fire Resistance");
        lore.add("§7- §6Levitation");
        lore.add("§n§7Right-Click To Use");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK_OF_THE_SEA, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        meth = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("meth"), item);
        sr.shape(" X ",
                " Y ",
                " W ");

        sr.setIngredient('X', Material.DIRT);
        sr.setIngredient('Y', Material.PAPER);
        sr.setIngredient('W', Material.GUNPOWDER);

        Bukkit.getServer().addRecipe(sr);

    }

    private static void createMolly() {
        ItemStack item = new ItemStack(Material.IRON_NUGGET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§l§3MOLLY");
        List<String> lore = new ArrayList<>();
        lore.add("§l§aEffects:");
        lore.add("§7- §6Nausea");
        lore.add("§7- §6Speed");
        lore.add("§7- §6Haste");
        lore.add("§7- §6Fire Resistance");
        lore.add("§7- §6Night Vision");
        lore.add("§n§7Right-Click To Use");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK_OF_THE_SEA, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        molly = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("molly"), item);
        sr.shape("XXX",
                "YWY",
                "XXX");

        sr.setIngredient('X', Material.IRON_INGOT);
        sr.setIngredient('Y', Material.GUNPOWDER);
        sr.setIngredient('W', Material.WATER_BUCKET);

        Bukkit.getServer().addRecipe(sr);

    }

    private static void createOxy() {
        ItemStack item = new ItemStack(Material.WHITE_DYE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§l§bOXY");
        List<String> lore = new ArrayList<>();
        lore.add("§l§aEffects:");
        lore.add("§7- §6Absorption");
        lore.add("§7- §6Resistance");
        lore.add("§7- §6Nausea");
        lore.add("§7- §6Glowing");
        lore.add("§n§7Right-Click To Use");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK_OF_THE_SEA, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        oxy = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("oxy"), item);
        sr.shape("XXX",
                "W W",
                " Y ");

        sr.setIngredient('X', Material.WHITE_WOOL);
        sr.setIngredient('Y', Material.LAVA_BUCKET);
        sr.setIngredient('W', Material.WATER_BUCKET);

        Bukkit.getServer().addRecipe(sr);

    }

    private static void createPcp() {
        ItemStack item = new ItemStack(Material.SUNFLOWER, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§l§5PCP");
        List<String> lore = new ArrayList<>();
        lore.add("§l§aEffects:");
        lore.add("§7- §6Resistance");
        lore.add("§7- §6Bad Omen");
        lore.add("§7- §6Nausea");
        lore.add("§n§7Right-Click To Use");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK_OF_THE_SEA, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        pcp = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("pcp"), item);
        sr.shape("XYW",
                "WYX",
                "XYW");

        sr.setIngredient('X', Material.WHEAT_SEEDS);
        sr.setIngredient('Y', Material.MELON_SEEDS);
        sr.setIngredient('W', Material.PUMPKIN_SEEDS);

        Bukkit.getServer().addRecipe(sr);

    }

    private static void createPercocet() {
        ItemStack item = new ItemStack(Material.PUMPKIN_SEEDS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§l§fPERCOCET");
        List<String> lore = new ArrayList<>();
        lore.add("§l§aEffects:");
        lore.add("§7- §6Nausea");
        lore.add("§7- §6Slowness");
        lore.add("§7- §6Luck");
        lore.add("§7- §6Night Vision");
        lore.add("§n§7Right-Click To Use");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK_OF_THE_SEA, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        percocet = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("percocet"), item);
        sr.shape("XXX",
                "YWY",
                "XXX");

        sr.setIngredient('X', Material.ARROW);
        sr.setIngredient('Y', Material.MILK_BUCKET);
        sr.setIngredient('W', Material.WHITE_DYE);

        Bukkit.getServer().addRecipe(sr);

    }

    private static void createSalvia() {
        ItemStack item = new ItemStack(Material.DRIED_KELP, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§l§2SALVIA");
        List<String> lore = new ArrayList<>();
        lore.add("§l§aEffects:");
        lore.add("§7- §6Night Vision");
        lore.add("§7- §6Regeneration");
        lore.add("§7- §6Weakness");
        lore.add("§7- §6Glowing");
        lore.add("§n§7Right-Click To Use");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK_OF_THE_SEA, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        salvia = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("salvia"), item);
        sr.shape(" X ",
                "YYY",
                "W W");

        sr.setIngredient('X', Material.GREEN_BED);
        sr.setIngredient('Y', Material.GREEN_CANDLE);
        sr.setIngredient('W', Material.GREEN_DYE);

        Bukkit.getServer().addRecipe(sr);

    }

    private static void createShrooms() {
        ItemStack item = new ItemStack(Material.CRIMSON_FUNGUS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§l§8SHROOMS");
        List<String> lore = new ArrayList<>();
        lore.add("§l§aEffects:");
        lore.add("§7- §6Luck");
        lore.add("§7- §6Night Vision");
        lore.add("§7- §6Nausea");
        lore.add("§7- §6Glowing");
        lore.add("§n§7Right-Click To Use");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK_OF_THE_SEA, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        shrooms = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("shrooms"), item);
        sr.shape("XXX",
                "Y Y",
                " W ");

        sr.setIngredient('X', Material.DIRT);
        sr.setIngredient('Y', Material.STICK);
        sr.setIngredient('W', Material.BROWN_MUSHROOM);

        Bukkit.getServer().addRecipe(sr);

    }

    private static void createTussin() {
        ItemStack item = new ItemStack(Material.PURPLE_CANDLE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§l§5TUSSIN");
        List<String> lore = new ArrayList<>();
        lore.add("§l§aEffects:");
        lore.add("§7- §6Strength");
        lore.add("§7- §6Haste");
        lore.add("§7- §6Health Boost");
        lore.add("§7- §6Resistance");
        lore.add("§n§7Right-Click To Use");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK_OF_THE_SEA, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        tussin = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("tussin"), item);
        sr.shape("W W",
                "X X",
                "WXW");

        sr.setIngredient('X', Material.GLASS_BOTTLE);
        sr.setIngredient('W', Material.WATER_BUCKET);

        Bukkit.getServer().addRecipe(sr);

    }

    private static void createWeed() {
        ItemStack item = new ItemStack(Material.GREEN_DYE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§l§2WEED");
        List<String> lore = new ArrayList<>();
        lore.add("§l§aEffects:");
        lore.add("§7- §6Slowness");
        lore.add("§7- §6Luck");
        lore.add("§7- §6Slow Falling");
        lore.add("§7- §6Mining Fatigue");
        lore.add("§n§7Right-Click To Use");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK_OF_THE_SEA, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        weed = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("weed"), item);
        sr.shape("XYX",
                " Y ",
                "XXX");

        sr.setIngredient('X', Material.WHEAT);
        sr.setIngredient('Y', Material.DIAMOND);

        Bukkit.getServer().addRecipe(sr);

    }

    private static void createXanax() {
        ItemStack item = new ItemStack(Material.GREEN_CANDLE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§l§2XANAX");
        List<String> lore = new ArrayList<>();
        lore.add("§l§aEffects:");
        lore.add("§7- §6Slowness");
        lore.add("§7- §6Mining Fatigue");
        lore.add("§7- §6Slow Falling");
        lore.add("§7- §6Blindness");
        lore.add("§n§7Right-Click To Use");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK_OF_THE_SEA, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        xanax = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("xanax"), item);
        sr.shape(" Y ",
                "X X",
                " W ");

        sr.setIngredient('X', Material.WHITE_TULIP);
        sr.setIngredient('Y', Material.GREEN_BED);
        sr.setIngredient('W', Material.GUNPOWDER);

        Bukkit.getServer().addRecipe(sr);

    }

}
