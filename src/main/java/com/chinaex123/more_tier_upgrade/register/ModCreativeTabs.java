package com.chinaex123.more_tier_upgrade.register;

import com.chinaex123.more_tier_upgrade.MoreTierUpgrade;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

// 模组创造模式标签页注册类
public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreTierUpgrade.MOD_ID);

    public static final Supplier<CreativeModeTab> MORE_TIER_UPGRADE_TAB =
            CREATIVE_MODE_TAB.register("more_tier_upgrade_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(StickUpgradeItem.STACK_UPGRADE_TIER_SB_5.get()))
                    .title(Component.translatable("itemGroup.more_tier_upgrade_tab"))
                    .displayItems((parameters, output) -> {

                        // 精妙背包
                        output.accept(StickUpgradeItem.STACK_UPGRADE_TIER_SB_5.get()); // 堆叠升级T5
                        output.accept(StickUpgradeItem.STACK_UPGRADE_TIER_SB_6.get()); //  堆叠升级T6
                        output.accept(StickUpgradeItem.STACK_UPGRADE_TIER_SB_7.get()); // 堆叠升级T7
                        output.accept(StickUpgradeItem.STACK_UPGRADE_TIER_SB_8.get()); // 堆叠升级T8
                        output.accept(StickUpgradeItem.STACK_UPGRADE_TIER_SB_9.get()); // 堆叠升级T9
                        output.accept(StickUpgradeItem.STACK_UPGRADE_TIER_SB_10.get()); // 堆叠升级T10
                        output.accept(StickUpgradeItem.STACK_UPGRADE_TIER_SB_11.get()); // 堆叠升级T11

                        // 精妙存储
                        output.accept(StickUpgradeItem.STACK_UPGRADE_TIER_SS_6.get()); // 堆叠升级T6
                        output.accept(StickUpgradeItem.STACK_UPGRADE_TIER_SS_7.get()); // 堆叠升级T7
                        output.accept(StickUpgradeItem.STACK_UPGRADE_TIER_SS_8.get()); // 堆叠升级T8
                        output.accept(StickUpgradeItem.STACK_UPGRADE_TIER_SS_9.get()); // 堆叠升级T9
                        output.accept(StickUpgradeItem.STACK_UPGRADE_TIER_SS_10.get()); // 堆叠升级T10
                        output.accept(StickUpgradeItem.STACK_UPGRADE_TIER_SS_11.get()); // 堆叠升级T11
                        output.accept(StickUpgradeItem.STACK_UPGRADE_TIER_SS_12.get()); // 堆叠升级T12

                    })
                    .build());

    // 注册到NeoForge事件总线里
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
