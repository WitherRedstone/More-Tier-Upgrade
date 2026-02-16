package com.chinaex123.more_tier_upgrade.register;

import com.chinaex123.more_tier_upgrade.MoreTierUpgrade;
import com.chinaex123.more_tier_upgrade.register.StickUpgradeItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreTierUpgrade.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MORE_TIER_UPGRADE_TAB = CREATIVE_MODE_TAB.register("more_tier_upgrade_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.more_tier_upgrade_tab"))
                    .icon(() -> new ItemStack(StickUpgradeItem.STACK_UPGRADE_TIER_SB_5.get()))
                    .displayItems((parameters, output) -> {
                        // 添加所有物品到创造模式物品栏
                        output.accept(StickUpgradeItem.STACK_UPGRADE_TIER_SB_5.get());
                        output.accept(StickUpgradeItem.STACK_UPGRADE_TIER_SB_6.get());
                        output.accept(StickUpgradeItem.STACK_UPGRADE_TIER_SB_7.get());
                        output.accept(StickUpgradeItem.STACK_UPGRADE_TIER_SB_8.get());
                        output.accept(StickUpgradeItem.STACK_UPGRADE_TIER_SB_9.get());
                        output.accept(StickUpgradeItem.STACK_UPGRADE_TIER_SB_10.get());
                        output.accept(StickUpgradeItem.STACK_UPGRADE_TIER_SB_11.get());

                        output.accept(StickUpgradeItem.STACK_UPGRADE_TIER_SS_6.get());
                        output.accept(StickUpgradeItem.STACK_UPGRADE_TIER_SS_7.get());
                        output.accept(StickUpgradeItem.STACK_UPGRADE_TIER_SS_8.get());
                        output.accept(StickUpgradeItem.STACK_UPGRADE_TIER_SS_9.get());
                        output.accept(StickUpgradeItem.STACK_UPGRADE_TIER_SS_10.get());
                        output.accept(StickUpgradeItem.STACK_UPGRADE_TIER_SS_11.get());
                        output.accept(StickUpgradeItem.STACK_UPGRADE_TIER_SS_12.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
