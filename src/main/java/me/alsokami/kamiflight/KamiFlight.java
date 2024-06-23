package me.alsokami.kamiflight;

import me.alsokami.kamiflight.commands.FlyCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class KamiFlight extends JavaPlugin {

    @Override
    public void onEnable() {

        getCommand("fly").setExecutor(new FlyCommand());
    }
}