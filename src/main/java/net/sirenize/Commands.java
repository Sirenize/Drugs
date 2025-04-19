package net.sirenize;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Commands implements CommandExecutor {

    private final drugs plugin;

    public Commands(drugs plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args.length == 0 || !args[0].equalsIgnoreCase("reload")) {
            sender.sendMessage("§cUsage: /drugs reload");
            return true;
        }

        if (!sender.hasPermission("drugs.admin")) {
            sender.sendMessage("§cYou don’t have permission.");
            return true;
        }

        plugin.reloadConfig();
        Map<String, ItemData> newItems = ItemLoader.loadItems(plugin);
        plugin.setItems(newItems);
        plugin.reRegisterItemListener();

        sender.sendMessage("§a[Drugs] Reloaded " + newItems.size() + " custom item(s).");
        return true;
    }

}
