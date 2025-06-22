package me.kebute.shop;

import org.bukkit.plugin.java.JavaPlugin;

public class KoreanShopPlugin extends JavaPlugin {
    private static KoreanShopPlugin instance;

    public static KoreanShopPlugin getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        getLogger().info("KoreanShopPlugin이 활성화되었습니다.");

        // 명령어, 이벤트 등록 등 여기서 진행
        // 예시: getCommand("거래통계").setExecutor(new StatsCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("KoreanShopPlugin이 비활성화되었습니다.");
    }
}
