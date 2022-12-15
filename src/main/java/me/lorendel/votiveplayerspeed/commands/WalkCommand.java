package me.lorendel.votiveplayerspeed.commands;

import me.lorendel.votiveplayerspeed.VotivePlayerSpeed;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class WalkCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Plugin plugin = VotivePlayerSpeed.getPlugin(VotivePlayerSpeed.class);

        if (sender instanceof Player){

            Double speed = plugin.getConfig().getDouble("WalkingSpeed");
            Player p = (Player) sender;

            p.setWalkSpeed(speed.floatValue());
            p.sendMessage(ChatColor.GREEN + "Режим медленной ходьбы включён.");

        }else{

            System.out.println("Команда может быть использована только игроком!");

        }

        return true;

    }
}
