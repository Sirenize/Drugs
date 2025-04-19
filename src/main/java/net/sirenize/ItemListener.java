package net.sirenize;

import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.*;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.*;

import java.util.List;
import java.util.Map;

public class ItemListener implements Listener {

    private final Map<String, ItemData> items;

    public ItemListener(Map<String, ItemData> items) {
        this.items = items;
    }

    @EventHandler
    public void onRightClick(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        ItemStack held = player.getInventory().getItemInMainHand();

        for (ItemData data : items.values()) {
            if (data.item.isSimilar(held)) {
                handleEffects(player, data.rightClickEffects);
            }
        }
    }

    private void handleEffects(Player player, List<Map<String, Object>> effects) {
        for (Map<String, Object> effect : effects) {
            String type = ((String) effect.get("effect")).toLowerCase();

            switch (type) {
                case "potion" -> {
                    String potionType = (String) effect.get("type");
                    int duration = ((Number) effect.getOrDefault("duration", 5)).intValue() * 20;
                    int amplifier = ((Number) effect.getOrDefault("amplifier", 0)).intValue();

                    PotionEffectType pet = PotionEffectType.getByName(potionType.toUpperCase());
                    if (pet != null) {
                        player.addPotionEffect(new PotionEffect(pet, duration, amplifier));
                    } else {
                        player.sendMessage("Unknown potion type: " + potionType);
                    }
                }

                case "sound" -> {
                    String soundName = (String) effect.get("sound");
                    float volume = ((Number) effect.getOrDefault("volume", 1.0)).floatValue();
                    float pitch = ((Number) effect.getOrDefault("pitch", 1.0)).floatValue();

                    try {
                        Sound sound = Sound.valueOf(soundName.toUpperCase());
                        player.playSound(player.getLocation(), sound, volume, pitch);
                    } catch (IllegalArgumentException e) {
                        player.sendMessage("Invalid sound: " + soundName);
                    }
                }

                default -> player.sendMessage("Unknown effect: " + type);
            }
        }
    }
}
