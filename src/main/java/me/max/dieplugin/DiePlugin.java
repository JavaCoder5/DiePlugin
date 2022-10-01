package me.max.dieplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class DiePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Dieplugin has started");

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        // /die - kills the player
        if (command.getName().equalsIgnoreCase("die")) {

            if (sender instanceof Player p) {

                p.setHealth(0.0);
                p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "You have died");

            }

        }

        return true;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Dieplugin has stopped");

    }
}
