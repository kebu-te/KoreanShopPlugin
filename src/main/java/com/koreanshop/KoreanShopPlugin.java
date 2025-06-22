package com.koreanshop;

import org.bukkit.plugin.java.JavaPlugin;

public class KoreanShopPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("KoreanShopPlugin has been enabled.");
    }

    @Override
    public void onDisable() {
        getLogger().info("KoreanShopPlugin has been disabled.");
    }
}
