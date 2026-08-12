package com.chinaex123.more_tier_upgrade;

import com.chinaex123.more_tier_upgrade.item.StickUpgradeItem;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

@Mod(MoreTierUpgrade.MOD_ID)
public class MoreTierUpgrade {
    public static final String MOD_ID = "more_tier_upgrade";
    public static final Logger LOGGER = LogUtils.getLogger();

    public MoreTierUpgrade(IEventBus modEventBus, ModContainer modContainer) {
        ModCreativeTabs.register(modEventBus);
        StickUpgradeItem.register(modEventBus);
    }
}
