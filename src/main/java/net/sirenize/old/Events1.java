/*

package net.sirenize.old;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Events1 implements Listener {

    @EventHandler

    public static void onRightClick(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (event.getItem() != null) {
                if (event.getItem().getItemMeta().equals(ItemManager.acid.getItemMeta())) {

                    Player player = event.getPlayer();
                    event.setCancelled(true);

                    player.addPotionEffect(new PotionEffect(PotionEffectType.NAUSEA, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, 20 * 90, 1));

                    player.playSound(player.getLocation(), Sound.ENTITY_GENERIC_DRINK, 1f, 1f);

                    ItemStack item = event.getItem();

                    if (item.getAmount() > 1) {
                        item.setAmount(item.getAmount() - 1);
                    } else {
                        player.getInventory().removeItem(item);
                    }

                }
                if (event.getItem().getItemMeta().equals(ItemManager.alcohol.getItemMeta())) {

                    Player player = event.getPlayer();
                    event.setCancelled(true);

                    player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.NAUSEA, 20 * 90, 1));

                    player.playSound(player.getLocation(), Sound.ENTITY_GENERIC_DRINK, 1f, 1f);

                    ItemStack item = event.getItem();

                    if (item.getAmount() > 1) {
                        item.setAmount(item.getAmount() - 1);
                    } else {
                        player.getInventory().removeItem(item);
                    }

                }
                if (event.getItem().getItemMeta().equals(ItemManager.ciggy.getItemMeta())) {

                    Player player = event.getPlayer();
                    event.setCancelled(true);

                    player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.RESISTANCE, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP_BOOST, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.MINING_FATIGUE, 20 * 90, 1));

                    player.playSound(player.getLocation(), Sound.ENTITY_GENERIC_DRINK, 1f, 1f);

                    ItemStack item = event.getItem();

                    if (item.getAmount() > 1) {
                        item.setAmount(item.getAmount() - 1);
                    } else {
                        player.getInventory().removeItem(item);
                    }

                }
                if (event.getItem().getItemMeta().equals(ItemManager.coke.getItemMeta())) {

                    Player player = event.getPlayer();
                    event.setCancelled(true);

                    player.addPotionEffect(new PotionEffect(PotionEffectType.STRENGTH, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.HASTE, 20 * 90, 9));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.RESISTANCE, 20 * 90, 1));

                    player.playSound(player.getLocation(), Sound.ENTITY_GENERIC_DRINK, 1f, 1f);

                    ItemStack item = event.getItem();

                    if (item.getAmount() > 1) {
                        item.setAmount(item.getAmount() - 1);
                    } else {
                        player.getInventory().removeItem(item);
                    }

                }
                if (event.getItem().getItemMeta().equals(ItemManager.dmt.getItemMeta())) {

                    Player player = event.getPlayer();
                    event.setCancelled(true);

                    player.addPotionEffect(new PotionEffect(PotionEffectType.RESISTANCE, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.SLOWNESS, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 20 * 90, 1));

                    player.playSound(player.getLocation(), Sound.ENTITY_GENERIC_DRINK, 1f, 1f);

                    ItemStack item = event.getItem();

                    if (item.getAmount() > 1) {
                        item.setAmount(item.getAmount() - 1);
                    } else {
                        player.getInventory().removeItem(item);
                    }

                }
                if (event.getItem().getItemMeta().equals(ItemManager.flakka.getItemMeta())) {

                    Player player = event.getPlayer();
                    event.setCancelled(true);

                    player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.RESISTANCE, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.UNLUCK, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, 20 * 90, 1));

                    player.playSound(player.getLocation(), Sound.ENTITY_GENERIC_DRINK, 1f, 1f);

                    ItemStack item = event.getItem();

                    if (item.getAmount() > 1) {
                        item.setAmount(item.getAmount() - 1);
                    } else {
                        player.getInventory().removeItem(item);
                    }

                }
                if (event.getItem().getItemMeta().equals(ItemManager.heroin.getItemMeta())) {

                    Player player = event.getPlayer();
                    event.setCancelled(true);

                    player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.SLOWNESS, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.UNLUCK, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 20 * 90, 1));

                    player.playSound(player.getLocation(), Sound.ENTITY_GENERIC_DRINK, 1f, 1f);

                    ItemStack item = event.getItem();

                    if (item.getAmount() > 1) {
                        item.setAmount(item.getAmount() - 1);
                    } else {
                        player.getInventory().removeItem(item);
                    }

                }
                if (event.getItem().getItemMeta().equals(ItemManager.ketamine.getItemMeta())) {

                    Player player = event.getPlayer();
                    event.setCancelled(true);

                    player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.HASTE, 20 * 90, 9));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.NAUSEA, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, 20 * 90, 1));

                    player.playSound(player.getLocation(), Sound.ENTITY_GENERIC_DRINK, 1f, 1f);

                    ItemStack item = event.getItem();

                    if (item.getAmount() > 1) {
                        item.setAmount(item.getAmount() - 1);
                    } else {
                        player.getInventory().removeItem(item);
                    }

                }
                if (event.getItem().getItemMeta().equals(ItemManager.meth.getItemMeta())) {

                    Player player = event.getPlayer();
                    event.setCancelled(true);

                    player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.RESISTANCE, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 20 * 90, 1));

                    player.playSound(player.getLocation(), Sound.ENTITY_GENERIC_DRINK, 1f, 1f);

                    ItemStack item = event.getItem();

                    if (item.getAmount() > 1) {
                        item.setAmount(item.getAmount() - 1);
                    } else {
                        player.getInventory().removeItem(item);
                    }

                }
                if (event.getItem().getItemMeta().equals(ItemManager.molly.getItemMeta())) {

                    Player player = event.getPlayer();
                    event.setCancelled(true);

                    player.addPotionEffect(new PotionEffect(PotionEffectType.NAUSEA, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.HASTE, 20 * 90, 9));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 20 * 90, 1));

                    player.playSound(player.getLocation(), Sound.ENTITY_GENERIC_DRINK, 1f, 1f);

                    ItemStack item = event.getItem();

                    if (item.getAmount() > 1) {
                        item.setAmount(item.getAmount() - 1);
                    } else {
                        player.getInventory().removeItem(item);
                    }

                }
                if (event.getItem().getItemMeta().equals(ItemManager.oxy.getItemMeta())) {

                    Player player = event.getPlayer();
                    event.setCancelled(true);

                    player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.RESISTANCE, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.NAUSEA, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 20 * 90, 1));

                    player.playSound(player.getLocation(), Sound.ENTITY_GENERIC_DRINK, 1f, 1f);

                    ItemStack item = event.getItem();

                    if (item.getAmount() > 1) {
                        item.setAmount(item.getAmount() - 1);
                    } else {
                        player.getInventory().removeItem(item);
                    }

                }
                if (event.getItem().getItemMeta().equals(ItemManager.pcp.getItemMeta())) {

                    Player player = event.getPlayer();
                    event.setCancelled(true);

                    player.addPotionEffect(new PotionEffect(PotionEffectType.RESISTANCE, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.BAD_OMEN, 20 * 90, 4));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.NAUSEA, 20 * 90, 1));

                    player.playSound(player.getLocation(), Sound.ENTITY_GENERIC_DRINK, 1f, 1f);

                    ItemStack item = event.getItem();

                    if (item.getAmount() > 1) {
                        item.setAmount(item.getAmount() - 1);
                    } else {
                        player.getInventory().removeItem(item);
                    }

                }
                if (event.getItem().getItemMeta().equals(ItemManager.percocet.getItemMeta())) {

                    Player player = event.getPlayer();
                    event.setCancelled(true);

                    player.addPotionEffect(new PotionEffect(PotionEffectType.NAUSEA, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.SLOWNESS, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.LUCK, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 20 * 90, 1));

                    player.playSound(player.getLocation(), Sound.ENTITY_GENERIC_DRINK, 1f, 1f);

                    ItemStack item = event.getItem();

                    if (item.getAmount() > 1) {
                        item.setAmount(item.getAmount() - 1);
                    } else {
                        player.getInventory().removeItem(item);
                    }

                }
                if (event.getItem().getItemMeta().equals(ItemManager.salvia.getItemMeta())) {

                    Player player = event.getPlayer();
                    event.setCancelled(true);

                    player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 20 * 90, 1));

                    player.playSound(player.getLocation(), Sound.ENTITY_GENERIC_DRINK, 1f, 1f);

                    ItemStack item = event.getItem();

                    if (item.getAmount() > 1) {
                        item.setAmount(item.getAmount() - 1);
                    } else {
                        player.getInventory().removeItem(item);
                    }

                }
                if (event.getItem().getItemMeta().equals(ItemManager.shrooms.getItemMeta())) {

                    Player player = event.getPlayer();
                    event.setCancelled(true);

                    player.addPotionEffect(new PotionEffect(PotionEffectType.LUCK, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.NAUSEA, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 20 * 90, 1));

                    player.playSound(player.getLocation(), Sound.ENTITY_GENERIC_DRINK, 1f, 1f);

                    ItemStack item = event.getItem();

                    if (item.getAmount() > 1) {
                        item.setAmount(item.getAmount() - 1);
                    } else {
                        player.getInventory().removeItem(item);
                    }

                }
                if (event.getItem().getItemMeta().equals(ItemManager.tussin.getItemMeta())) {

                    Player player = event.getPlayer();
                    event.setCancelled(true);

                    player.addPotionEffect(new PotionEffect(PotionEffectType.STRENGTH, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.INSTANT_HEALTH, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP_BOOST, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.HASTE, 20 * 90, 9));

                    player.playSound(player.getLocation(), Sound.ENTITY_GENERIC_DRINK, 1f, 1f);

                    ItemStack item = event.getItem();

                    if (item.getAmount() > 1) {
                        item.setAmount(item.getAmount() - 1);
                    } else {
                        player.getInventory().removeItem(item);
                    }

                }
                if (event.getItem().getItemMeta().equals(ItemManager.weed.getItemMeta())) {

                    Player player = event.getPlayer();
                    event.setCancelled(true);

                    player.addPotionEffect(new PotionEffect(PotionEffectType.SLOWNESS, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.LUCK, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.MINING_FATIGUE, 20 * 90, 1));

                    player.playSound(player.getLocation(), Sound.ENTITY_GENERIC_DRINK, 1f, 1f);

                    ItemStack item = event.getItem();

                    if (item.getAmount() > 1) {
                        item.setAmount(item.getAmount() - 1);
                    } else {
                        player.getInventory().removeItem(item);
                    }

                }
                if (event.getItem().getItemMeta().equals(ItemManager.xanax.getItemMeta())) {

                    Player player = event.getPlayer();
                    event.setCancelled(true);

                    player.addPotionEffect(new PotionEffect(PotionEffectType.SLOWNESS, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.MINING_FATIGUE, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, 20 * 90, 1));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 20 * 90, 1));

                    player.playSound(player.getLocation(), Sound.ENTITY_GENERIC_DRINK, 1f, 1f);

                    ItemStack item = event.getItem();

                    if (item.getAmount() > 1) {
                        item.setAmount(item.getAmount() - 1);
                    } else {
                        player.getInventory().removeItem(item);
                    }

                }
            }
        }
    }

}

 */