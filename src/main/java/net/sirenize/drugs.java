package net.sirenize;

import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.Enumeration;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public final class drugs extends JavaPlugin {

    private Map<String, ItemData> items;

    @Override
    public void onEnable() {
        // Plugin startup logic
        saveDefaultConfig();

        loadDrugs();

        Map<String, ItemData> items = ItemLoader.loadItems(this);
        getServer().getPluginManager().registerEvents(new ItemListener(items), this);

        getLogger().info("Loaded " + items.size() + " drugs.");

        getCommand("drugs").setExecutor(new Commands(this));
        getCommand("drugs").setTabCompleter(new DrugsTabCompleter());

        getLogger().info("Plugin Loaded!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private void loadDrugs() {
        File itemsDir = new File(getDataFolder(), "drugs");
        if (!itemsDir.exists()) itemsDir.mkdirs();

        try {
            JarFile jar = new JarFile(getFile());
            Enumeration<JarEntry> entries = jar.entries();

            while (entries.hasMoreElements()) {
                JarEntry entry = entries.nextElement();
                String name = entry.getName();

                if (name.startsWith("drugs/") && name.endsWith(".yml")) {
                    File outFile = new File(getDataFolder(), name);
                    if (!outFile.exists()) {
                        InputStream in = getResource(name);
                        if (in != null) {
                            outFile.getParentFile().mkdirs();
                            Files.copy(in, outFile.toPath());
                        }
                    }
                }
            }
        } catch (IOException e) {
            getLogger().warning("Failed to load drugs.");
            e.printStackTrace();
        }
    }

    public void setItems(Map<String, ItemData> items) {
        this.items = items;
    }

    public void reRegisterItemListener() {
        HandlerList.unregisterAll();
        getServer().getPluginManager().registerEvents(new ItemListener(items), this);
    }



}
