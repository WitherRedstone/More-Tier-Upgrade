package com.chinaex123.more_tier_upgrade;

import com.chinaex123.more_tier_upgrade.register.ModCreativeTabs;
import com.chinaex123.more_tier_upgrade.register.StickUpgradeItem;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// 这里的值应与 META-INF/mods.toml 文件中的条目对应
@Mod(MoreTierUpgrade.MOD_ID)
public class MoreTierUpgrade {
    // 在公共位置定义模组ID，供所有地方引用
    public static final String MOD_ID = "more_tier_upgrade";

    // 模组类的构造函数是模组加载时运行的第一段代码
    // FML 会自动识别某些参数类型并传入
    public MoreTierUpgrade(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

        // 为模组加载注册 commonSetup 方法
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

        // 将物品注册到游戏
        ModCreativeTabs.register(modEventBus); // 创造模式物品栏

        StickUpgradeItem.register(modEventBus); // 注册物品
    }

    private void commonSetup(final FMLCommonSetupEvent event) {}
}
