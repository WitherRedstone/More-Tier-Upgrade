package com.chinaex123.more_tier_upgrade.item;

import com.chinaex123.more_tier_upgrade.MoreTierUpgrade;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.p3pp3rf1y.sophisticatedbackpacks.Config;
import net.p3pp3rf1y.sophisticatedcore.upgrades.stack.StackUpgradeItem;
import org.jetbrains.annotations.NotNull;

public class StickUpgradeItem {
    private static final DeferredRegister.Items ITEM_REGISTER = DeferredRegister.createItems(MoreTierUpgrade.MOD_ID);

    // ==================== 精妙背包 ====================
    // 堆叠升级T5
    public static final DeferredHolder<Item, @NotNull StackUpgradeItem> STACK_UPGRADE_TIER_SB_5 =
            ITEM_REGISTER.registerItem("stack_upgrade_tier_sb_5", properties ->
                    new StackUpgradeItem(32, Config.SERVER.maxUpgradesPerStorage, properties.stacksTo(64)));
    // 堆叠升级T6
    public static final DeferredHolder<Item, @NotNull StackUpgradeItem> STACK_UPGRADE_TIER_SB_6 =
            ITEM_REGISTER.registerItem("stack_upgrade_tier_sb_6", properties ->
                    new StackUpgradeItem(48, Config.SERVER.maxUpgradesPerStorage, properties.stacksTo(64)));
    // 堆叠升级T7
    public static final DeferredHolder<Item, @NotNull StackUpgradeItem> STACK_UPGRADE_TIER_SB_7 =
            ITEM_REGISTER.registerItem("stack_upgrade_tier_sb_7", properties ->
                    new StackUpgradeItem(64, Config.SERVER.maxUpgradesPerStorage, properties.stacksTo(64)));
    // 堆叠升级T8
    public static final DeferredHolder<Item, @NotNull StackUpgradeItem> STACK_UPGRADE_TIER_SB_8 =
            ITEM_REGISTER.registerItem("stack_upgrade_tier_sb_8", properties ->
                    new StackUpgradeItem(80, Config.SERVER.maxUpgradesPerStorage, properties.stacksTo(64)));
    // 堆叠升级T9
    public static final DeferredHolder<Item, @NotNull StackUpgradeItem> STACK_UPGRADE_TIER_SB_9 =
            ITEM_REGISTER.registerItem("stack_upgrade_tier_sb_9", properties ->
                    new StackUpgradeItem(96, Config.SERVER.maxUpgradesPerStorage, properties.stacksTo(64)));
    // 堆叠升级T10
    public static final DeferredHolder<Item, @NotNull StackUpgradeItem> STACK_UPGRADE_TIER_SB_10 =
            ITEM_REGISTER.registerItem("stack_upgrade_tier_sb_10", properties ->
                    new StackUpgradeItem(128, Config.SERVER.maxUpgradesPerStorage, properties.stacksTo(64)));
    // 堆叠升级T11
    public static final DeferredHolder<Item, @NotNull StackUpgradeItem> STACK_UPGRADE_TIER_SB_11 =
            ITEM_REGISTER.registerItem("stack_upgrade_tier_sb_11", properties ->
                    new StackUpgradeItem(160, Config.SERVER.maxUpgradesPerStorage, properties.stacksTo(64)));

    // ==================== 精妙存储 ====================
    // 堆叠升级T6
    public static final DeferredHolder<Item, @NotNull StackUpgradeItem> STACK_UPGRADE_TIER_SS_6 =
            ITEM_REGISTER.registerItem("stack_upgrade_tier_ss_6", properties ->
                    new StackUpgradeItem(48, net.p3pp3rf1y.sophisticatedstorage.Config.SERVER.maxUpgradesPerStorage, properties.stacksTo(64)));
    // 堆叠升级T7
    public static final DeferredHolder<Item, @NotNull StackUpgradeItem> STACK_UPGRADE_TIER_SS_7 =
            ITEM_REGISTER.registerItem("stack_upgrade_tier_ss_7", properties ->
                    new StackUpgradeItem(64, net.p3pp3rf1y.sophisticatedstorage.Config.SERVER.maxUpgradesPerStorage, properties.stacksTo(64)));
    // 堆叠升级T8
    public static final DeferredHolder<Item, @NotNull StackUpgradeItem> STACK_UPGRADE_TIER_SS_8 =
            ITEM_REGISTER.registerItem("stack_upgrade_tier_ss_8", properties ->
                    new StackUpgradeItem(80, net.p3pp3rf1y.sophisticatedstorage.Config.SERVER.maxUpgradesPerStorage, properties.stacksTo(64)));
    // 堆叠升级T9
    public static final DeferredHolder<Item, @NotNull StackUpgradeItem> STACK_UPGRADE_TIER_SS_9 =
            ITEM_REGISTER.registerItem("stack_upgrade_tier_ss_9", properties ->
                    new StackUpgradeItem(96, net.p3pp3rf1y.sophisticatedstorage.Config.SERVER.maxUpgradesPerStorage, properties.stacksTo(64)));
    // 堆叠升级T10
    public static final DeferredHolder<Item, @NotNull StackUpgradeItem> STACK_UPGRADE_TIER_SS_10 =
            ITEM_REGISTER.registerItem("stack_upgrade_tier_ss_10", properties ->
                    new StackUpgradeItem(128, net.p3pp3rf1y.sophisticatedstorage.Config.SERVER.maxUpgradesPerStorage, properties.stacksTo(64)));
    // 堆叠升级T11
    public static final DeferredHolder<Item, @NotNull StackUpgradeItem> STACK_UPGRADE_TIER_SS_11 =
            ITEM_REGISTER.registerItem("stack_upgrade_tier_ss_11", properties ->
                    new StackUpgradeItem(160, net.p3pp3rf1y.sophisticatedstorage.Config.SERVER.maxUpgradesPerStorage, properties.stacksTo(64)));
    // 堆叠升级T12
    public static final DeferredHolder<Item, @NotNull StackUpgradeItem> STACK_UPGRADE_TIER_SS_12 =
            ITEM_REGISTER.registerItem("stack_upgrade_tier_ss_12", properties ->
                    new StackUpgradeItem(176, net.p3pp3rf1y.sophisticatedstorage.Config.SERVER.maxUpgradesPerStorage, properties.stacksTo(64)));

    public static void register(IEventBus eventBus) {
        ITEM_REGISTER.register(eventBus);
    }
}
