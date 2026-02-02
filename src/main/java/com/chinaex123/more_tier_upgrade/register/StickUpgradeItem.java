package com.chinaex123.more_tier_upgrade.register;

import com.chinaex123.more_tier_upgrade.MoreTierUpgrade;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.p3pp3rf1y.sophisticatedbackpacks.Config;
import net.p3pp3rf1y.sophisticatedcore.upgrades.stack.StackUpgradeItem;

public class StickUpgradeItem {
    public static final DeferredRegister<Item> ITEMS_REGISTER =
            DeferredRegister.create(BuiltInRegistries.ITEM, MoreTierUpgrade.MOD_ID);

    // ==================== 精妙背包 ====================

    // 堆叠升级T5
    public static final DeferredHolder<Item, StackUpgradeItem> STACK_UPGRADE_TIER_SB_5 =
            ITEMS_REGISTER.register("stack_upgrade_tier_sb_5", () -> new StackUpgradeItem(32, Config.SERVER.maxUpgradesPerStorage));
    // 堆叠升级T6
    public static final DeferredHolder<Item, StackUpgradeItem> STACK_UPGRADE_TIER_SB_6 =
            ITEMS_REGISTER.register("stack_upgrade_tier_sb_6", () -> new StackUpgradeItem(48, Config.SERVER.maxUpgradesPerStorage));
    // 堆叠升级T7
    public static final DeferredHolder<Item, StackUpgradeItem> STACK_UPGRADE_TIER_SB_7 =
            ITEMS_REGISTER.register("stack_upgrade_tier_sb_7", () -> new StackUpgradeItem(64, Config.SERVER.maxUpgradesPerStorage));
    // 堆叠升级T8
    public static final DeferredHolder<Item, StackUpgradeItem> STACK_UPGRADE_TIER_SB_8 =
            ITEMS_REGISTER.register("stack_upgrade_tier_sb_8", () -> new StackUpgradeItem(80, Config.SERVER.maxUpgradesPerStorage));
    // 堆叠升级T9
    public static final DeferredHolder<Item, StackUpgradeItem> STACK_UPGRADE_TIER_SB_9 =
            ITEMS_REGISTER.register("stack_upgrade_tier_sb_9", () -> new StackUpgradeItem(96, Config.SERVER.maxUpgradesPerStorage));
    // 堆叠升级T10
    public static final DeferredHolder<Item, StackUpgradeItem> STACK_UPGRADE_TIER_SB_10 =
            ITEMS_REGISTER.register("stack_upgrade_tier_sb_10", () -> new StackUpgradeItem(128, Config.SERVER.maxUpgradesPerStorage));
    // 堆叠升级T11
    public static final DeferredHolder<Item, StackUpgradeItem> STACK_UPGRADE_TIER_SB_11 =
            ITEMS_REGISTER.register("stack_upgrade_tier_sb_11", () -> new StackUpgradeItem(160, Config.SERVER.maxUpgradesPerStorage));



    // ==================== 精妙存储 ====================

    // 堆叠升级T6
    public static final DeferredHolder<Item, StackUpgradeItem> STACK_UPGRADE_TIER_SS_6 =
            ITEMS_REGISTER.register("stack_upgrade_tier_ss_6", () -> new StackUpgradeItem(48, net.p3pp3rf1y.sophisticatedstorage.Config.SERVER.maxUpgradesPerStorage));
    // 堆叠升级T7
    public static final DeferredHolder<Item, StackUpgradeItem> STACK_UPGRADE_TIER_SS_7 =
            ITEMS_REGISTER.register("stack_upgrade_tier_ss_7", () -> new StackUpgradeItem(64, net.p3pp3rf1y.sophisticatedstorage.Config.SERVER.maxUpgradesPerStorage));
    // 堆叠升级T8
    public static final DeferredHolder<Item, StackUpgradeItem> STACK_UPGRADE_TIER_SS_8 =
            ITEMS_REGISTER.register("stack_upgrade_tier_ss_8", () -> new StackUpgradeItem(80, net.p3pp3rf1y.sophisticatedstorage.Config.SERVER.maxUpgradesPerStorage));
    // 堆叠升级T9
    public static final DeferredHolder<Item, StackUpgradeItem> STACK_UPGRADE_TIER_SS_9 =
            ITEMS_REGISTER.register("stack_upgrade_tier_ss_9", () -> new StackUpgradeItem(96, net.p3pp3rf1y.sophisticatedstorage.Config.SERVER.maxUpgradesPerStorage));
    // 堆叠升级T10
    public static final DeferredHolder<Item, StackUpgradeItem> STACK_UPGRADE_TIER_SS_10 =
            ITEMS_REGISTER.register("stack_upgrade_tier_ss_10", () -> new StackUpgradeItem(128, net.p3pp3rf1y.sophisticatedstorage.Config.SERVER.maxUpgradesPerStorage));
    // 堆叠升级T11
    public static final DeferredHolder<Item, StackUpgradeItem> STACK_UPGRADE_TIER_SS_11 =
            ITEMS_REGISTER.register("stack_upgrade_tier_ss_11", () -> new StackUpgradeItem(160, net.p3pp3rf1y.sophisticatedstorage.Config.SERVER.maxUpgradesPerStorage));
    // 堆叠升级T12
    public static final DeferredHolder<Item, StackUpgradeItem> STACK_UPGRADE_TIER_SS_12 =
            ITEMS_REGISTER.register("stack_upgrade_tier_ss_12", () -> new StackUpgradeItem(176, net.p3pp3rf1y.sophisticatedstorage.Config.SERVER.maxUpgradesPerStorage));


    // 注册到游戏
    public static void register(IEventBus eventBus){
        ITEMS_REGISTER.register(eventBus);
    }
}