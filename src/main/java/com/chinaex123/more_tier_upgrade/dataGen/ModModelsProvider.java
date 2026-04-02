package com.chinaex123.more_tier_upgrade.dataGen;

import com.chinaex123.more_tier_upgrade.MoreTierUpgrade;
import com.chinaex123.more_tier_upgrade.item.StickUpgradeItem;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;

public class ModModelsProvider extends ModelProvider {
    public ModModelsProvider(PackOutput output) {
        super(output, MoreTierUpgrade.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        // ==================== 精妙背包 ====================
        itemModels.generateFlatItem(StickUpgradeItem.STACK_UPGRADE_TIER_SB_5.get(), ModelTemplates.FLAT_ITEM); // 堆叠升级T5
        itemModels.generateFlatItem(StickUpgradeItem.STACK_UPGRADE_TIER_SB_6.get(), ModelTemplates.FLAT_ITEM); //  堆叠升级T6
        itemModels.generateFlatItem(StickUpgradeItem.STACK_UPGRADE_TIER_SB_7.get(), ModelTemplates.FLAT_ITEM); // 堆叠升级T7
        itemModels.generateFlatItem(StickUpgradeItem.STACK_UPGRADE_TIER_SB_8.get(), ModelTemplates.FLAT_ITEM); // 堆叠升级T8
        itemModels.generateFlatItem(StickUpgradeItem.STACK_UPGRADE_TIER_SB_9.get(), ModelTemplates.FLAT_ITEM); // 堆叠升级T9
        itemModels.generateFlatItem(StickUpgradeItem.STACK_UPGRADE_TIER_SB_10.get(), ModelTemplates.FLAT_ITEM); // 堆叠升级T10
        itemModels.generateFlatItem(StickUpgradeItem.STACK_UPGRADE_TIER_SB_11.get(), ModelTemplates.FLAT_ITEM); // 堆叠升级T11

        // ==================== 特殊锤子 ====================
        itemModels.generateFlatItem(StickUpgradeItem.STACK_UPGRADE_TIER_SS_6.get(), ModelTemplates.FLAT_ITEM); // 堆叠升级T6
        itemModels.generateFlatItem(StickUpgradeItem.STACK_UPGRADE_TIER_SS_7.get(), ModelTemplates.FLAT_ITEM); // 堆叠升级T7
        itemModels.generateFlatItem(StickUpgradeItem.STACK_UPGRADE_TIER_SS_8.get(), ModelTemplates.FLAT_ITEM); // 堆叠升级T8
        itemModels.generateFlatItem(StickUpgradeItem.STACK_UPGRADE_TIER_SS_9.get(), ModelTemplates.FLAT_ITEM); // 堆叠升级T9
        itemModels.generateFlatItem(StickUpgradeItem.STACK_UPGRADE_TIER_SS_10.get(), ModelTemplates.FLAT_ITEM); // 堆叠升级T10
        itemModels.generateFlatItem(StickUpgradeItem.STACK_UPGRADE_TIER_SS_11.get(), ModelTemplates.FLAT_ITEM); // 堆叠升级T11
        itemModels.generateFlatItem(StickUpgradeItem.STACK_UPGRADE_TIER_SS_12.get(), ModelTemplates.FLAT_ITEM); // 堆叠升级T12
    }
}
