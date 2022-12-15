package me.lorendel.votiveplayerspeed.commands;

import me.lorendel.votiveplayerspeed.VotivePlayerSpeed;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class NormalSpeedCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Plugin plugin = VotivePlayerSpeed.getPlugin(VotivePlayerSpeed.class);

        if (sender instanceof Player){

            Double speed = plugin.getConfig().getDouble("DefaultSpeed");
            Player p = (Player) sender;
            p.setWalkSpeed(speed.floatValue());
            p.sendMessage(ChatColor.GREEN + "Обычный режим ходьбы включён!");

        }

        return true;
    }
}
