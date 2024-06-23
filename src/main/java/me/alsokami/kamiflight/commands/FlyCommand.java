package me.alsokami.kamiflight.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class FlyCommand implements CommandExecutor {

    private final ArrayList<Player> list_of_flying_players = new ArrayList<>();

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {

        if (sender instanceof Player){
            Player player = (Player) sender;
            if(player.hasPermission("flyplugin.fly")) {
                if (list_of_flying_players.contains(player)) {
                    list_of_flying_players.remove(player);
                    player.setAllowFlight(false);
                    player.sendMessage("&c[ᴋᴀᴍɪᴋʀᴀꜰᴛ] ʏᴏᴜ ᴀʀᴇ ɴᴏᴛ ꜰʟʏɪɴɢ ᴀɴʏᴍᴏʀᴇ.");
                } else if (!list_of_flying_players.contains(player)){
                    list_of_flying_players.add(player);
                    player.setAllowFlight(true);
                    player.sendMessage("&a[ᴋᴀᴍɪᴋʀᴀꜰᴛ] ʏᴏᴜ ᴀʀᴇ ɴᴏᴡ ꜰʟʏɪɴɢ.");
                }

            }
        }

        return true;
    }
}
