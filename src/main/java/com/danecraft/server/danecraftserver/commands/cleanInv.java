package com.danecraft.server.danecraftserver.commands;


import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

/**
 * @author Theo willis
 * @version 1.0.0
 * ~ project outline here ~
 * @Javadoc
 */
public class cleanInv implements CommandExecutor {
    private Material[] a = {Material.COBBLESTONE, Material.GRAVEL, Material.DIRT, Material.ANDESITE, Material.ROTTEN_FLESH
            , Material.DIORITE, Material.GRANITE, Material.TROPICAL_FISH
            , Material.WHEAT_SEEDS, Material.BAMBOO, Material.CHORUS_FRUIT
            , Material.KELP, Material.SNOWBALL};

    public cleanInv() {

    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (!(commandSender instanceof Player)) {
            return false;
        }
        int itemCount = 0;
        Player player = (Player) commandSender;
        Inventory inv = player.getInventory();
        for (int i = 0; i < inv.getMaxStackSize(); i++) {

            try {
                ItemStack item = inv.getItem(i);
                assert item != null;
                if (isIn(item.getType()) && item.getEnchantments() != null) {
                    itemCount += item.getMaxStackSize();
                    item.setAmount(0);
                }
            } catch (Exception e) {
                Bukkit.getLogger().info(e.getLocalizedMessage());
            }

        }
        String itemRemoval = String.format("removed %s items from inventory", itemCount);
        player.sendMessage(String.valueOf(itemCount));
        return false;
    }

    private boolean isIn(Material it) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] == it) {
                return true;
            }
        }
        return false;

    }
}
