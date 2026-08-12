package com.chinaex123.more_tier_upgrade.dataGen;

import com.chinaex123.more_tier_upgrade.MoreTierUpgrade;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = MoreTierUpgrade.MOD_ID)
public class ModDataGenerator {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client event) {
        event.createProvider(ModRecipesProvider.Runner::new);
        event.createProvider(ModModelsProvider::new);
    }
}