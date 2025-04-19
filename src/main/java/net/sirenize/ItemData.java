package net.sirenize;

import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Map;

public class ItemData {
    public final String id;
    public final ItemStack item;
    public final List<Map<String, Object>> rightClickEffects;

    public ItemData(String id, ItemStack item,
                    List<Map<String, Object>> rightClickEffects) {
        this.id = id;
        this.item = item;
        this.rightClickEffects = rightClickEffects;
    }
}
