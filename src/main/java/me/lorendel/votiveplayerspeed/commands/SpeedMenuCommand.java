package me.lorendel.votiveplayerspeed.commands;

import me.lorendel.votiveplayerspeed.VotivePlayerSpeed;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;

public class SpeedMenuCommand implements CommandExecutor {

    Plugin plugin = VotivePlayerSpeed.getPlugin(VotivePlayerSpeed.class);

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p = (Player) sender;

        Inventory inventory = Bukkit.createInventory(p, 9, "Speed Menu");

        ItemStack item = new ItemStack(Material.REDSTONE, 1);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName("Up the speed by 0.05");
        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.YELLOW + "Current speed: " + plugin.getConfig().getDouble("WalkingSpeed"));

        itemMeta.setLore(lore);
        item.setItemMeta(itemMeta);
        inventory.setItem(0, item);

        p.openInventory(inventory);

        return true;
    }
}
