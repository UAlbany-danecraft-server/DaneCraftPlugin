package com.danecraft.server.danecraftserver.handlers;

import com.danecraft.server.danecraftserver.Danecraftserver;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.*;
import java.io.*;


/**
 * @author Theo willis
 * @version 1.0.0
 * ~ project outline here ~
 * @Javadoc
 */
public class PlayerHandler implements Listener {
    public PlayerHandler(Danecraftserver plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void playerJoins(PlayerJoinEvent event) {
        Player p = event.getPlayer();
        p.sendMessage("welcome to danecraft server /help for commands");
    }

    @EventHandler
    public void playerDies(PlayerDeathEvent event) {
        Player p = event.getEntity();
        Inventory in = p.getInventory();
        for (int i = 0; i < in.getMaxStackSize(); i++) {
            try {
                ItemStack item = in.getItem(i);
                assert item != null;
                if (item.getType() == Material.STICK && item.getEnchantments().size() > 0) {
                    item.setAmount(0);
                }

            } catch (Exception e) {
                Bukkit.getLogger().info("issue getting the stick");
                Bukkit.getLogger().info(e.getLocalizedMessage());
            }
        }
    }

}
