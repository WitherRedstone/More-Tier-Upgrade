package com.chinaex123.more_tier_upgrade;

import com.chinaex123.more_tier_upgrade.init.MUTCreativeTabs;
import com.chinaex123.more_tier_upgrade.init.MTUItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MoreTierUpgrade.MOD_ID)
public class MoreTierUpgrade {
    public static final String MOD_ID = "more_tier_upgrade";

    public MoreTierUpgrade(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

        MinecraftForge.EVENT_BUS.register(this);
        MUTCreativeTabs.register(modEventBus);
        MTUItems.register(modEventBus);
    }
}
