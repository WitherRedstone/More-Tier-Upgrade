package com.chinaex123.more_tier_upgrade.register.dataGen;

import com.chinaex123.more_tier_upgrade.MoreTierUpgrade;
import com.chinaex123.more_tier_upgrade.register.StickUpgradeItem;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.p3pp3rf1y.sophisticatedbackpacks.init.ModItems;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ModRecipesProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipesProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {

        // ==================== 精妙背包 ====================

        // 堆叠升级T5 - 本体 - 转换
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        StickUpgradeItem.STACK_UPGRADE_TIER_SB_5.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', ModItems.STACK_UPGRADE_TIER_4.get())
                .define('B', Blocks.AMETHYST_BLOCK)
                .unlockedBy("has_stack_upgrade_tier_4", has(ModItems.STACK_UPGRADE_TIER_4.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        StickUpgradeItem.STACK_UPGRADE_TIER_SB_5.get())
                .pattern("CBC")
                .pattern("BAB")
                .pattern("C C")
                .define('A', Items.LEATHER)
                .define('B', StickUpgradeItem.STACK_UPGRADE_TIER_SS_6.get())
                .define('C', Items.STRING)
                .unlockedBy("has_stack_upgrade_tier_4", has(ModItems.STACK_UPGRADE_TIER_4.get()))
                .save(recipeOutput, MoreTierUpgrade.MOD_ID + ":" + "stack_upgrade_tier_sb_5_for_ss");

        // 堆叠升级T6 - 本体 - 转换
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        StickUpgradeItem.STACK_UPGRADE_TIER_SB_6.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', StickUpgradeItem.STACK_UPGRADE_TIER_SB_5.get())
                .define('B', Blocks.HONEY_BLOCK)
                .unlockedBy("has_stack_upgrade_tier_5", has(StickUpgradeItem.STACK_UPGRADE_TIER_SB_5.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        StickUpgradeItem.STACK_UPGRADE_TIER_SB_6.get())
                .pattern("CBC")
                .pattern("BAB")
                .pattern("C C")
                .define('A', Items.LEATHER)
                .define('B', StickUpgradeItem.STACK_UPGRADE_TIER_SS_7.get())
                .define('C', Items.STRING)
                .unlockedBy("has_stack_upgrade_tier_5", has(StickUpgradeItem.STACK_UPGRADE_TIER_SB_5.get()))
                .save(recipeOutput, MoreTierUpgrade.MOD_ID + ":" + "stack_upgrade_tier_sb_6_for_ss");

        // 堆叠升级T7 - 本体 - 转换
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        StickUpgradeItem.STACK_UPGRADE_TIER_SB_7.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', StickUpgradeItem.STACK_UPGRADE_TIER_SB_6.get())
                .define('B', Blocks.SCULK)
                .unlockedBy("has_stack_upgrade_tier_6", has(StickUpgradeItem.STACK_UPGRADE_TIER_SB_6.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        StickUpgradeItem.STACK_UPGRADE_TIER_SB_7.get())
                .pattern("CBC")
                .pattern("BAB")
                .pattern("C C")
                .define('A', Items.LEATHER)
                .define('B', StickUpgradeItem.STACK_UPGRADE_TIER_SS_8.get())
                .define('C', Items.STRING)
                .unlockedBy("has_stack_upgrade_tier_6", has(StickUpgradeItem.STACK_UPGRADE_TIER_SB_6.get()))
                .save(recipeOutput, MoreTierUpgrade.MOD_ID + ":" + "stack_upgrade_tier_sb_7_for_ss");

        // 堆叠升级T8 - 本体 - 转换
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        StickUpgradeItem.STACK_UPGRADE_TIER_SB_8.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', StickUpgradeItem.STACK_UPGRADE_TIER_SB_7.get())
                .define('B', Items.CONDUIT)
                .unlockedBy("has_stack_upgrade_tier_7", has(StickUpgradeItem.STACK_UPGRADE_TIER_SB_7.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        StickUpgradeItem.STACK_UPGRADE_TIER_SB_8.get())
                .pattern("CBC")
                .pattern("BAB")
                .pattern("C C")
                .define('A', Items.LEATHER)
                .define('B', StickUpgradeItem.STACK_UPGRADE_TIER_SS_9.get())
                .define('C', Items.STRING)
                .unlockedBy("has_stack_upgrade_tier_7", has(StickUpgradeItem.STACK_UPGRADE_TIER_SB_7.get()))
                .save(recipeOutput, MoreTierUpgrade.MOD_ID + ":" + "stack_upgrade_tier_sb_8_for_ss");

        // 堆叠升级T9 - 本体 - 转换
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        StickUpgradeItem.STACK_UPGRADE_TIER_SB_9.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', StickUpgradeItem.STACK_UPGRADE_TIER_SB_8.get())
                .define('B', Items.TURTLE_SCUTE)
                .unlockedBy("has_stack_upgrade_tier_8", has(StickUpgradeItem.STACK_UPGRADE_TIER_SB_8.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        StickUpgradeItem.STACK_UPGRADE_TIER_SB_9.get())
                .pattern("CBC")
                .pattern("BAB")
                .pattern("C C")
                .define('A', Items.LEATHER)
                .define('B', StickUpgradeItem.STACK_UPGRADE_TIER_SS_10.get())
                .define('C', Items.STRING)
                .unlockedBy("has_stack_upgrade_tier_8", has(StickUpgradeItem.STACK_UPGRADE_TIER_SB_8.get()))
                .save(recipeOutput, MoreTierUpgrade.MOD_ID + ":" + "stack_upgrade_tier_sb_9_for_ss");

        // 堆叠升级T10 - 本体 - 转换
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        StickUpgradeItem.STACK_UPGRADE_TIER_SB_10.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', StickUpgradeItem.STACK_UPGRADE_TIER_SB_9.get())
                .define('B', Items.NETHER_STAR)
                .unlockedBy("has_stack_upgrade_tier_9", has(StickUpgradeItem.STACK_UPGRADE_TIER_SB_9.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        StickUpgradeItem.STACK_UPGRADE_TIER_SB_10.get())
                .pattern("CBC")
                .pattern("BAB")
                .pattern("C C")
                .define('A', Items.LEATHER)
                .define('B', StickUpgradeItem.STACK_UPGRADE_TIER_SS_11.get())
                .define('C', Items.STRING)
                .unlockedBy("has_stack_upgrade_tier_9", has(StickUpgradeItem.STACK_UPGRADE_TIER_SB_9.get()))
                .save(recipeOutput, MoreTierUpgrade.MOD_ID + ":" + "stack_upgrade_tier_sb_10_for_ss");

        // 堆叠升级T11 - 本体 - 转换
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        StickUpgradeItem.STACK_UPGRADE_TIER_SB_11.get())
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', StickUpgradeItem.STACK_UPGRADE_TIER_SB_10.get())
                .define('B', Blocks.HEAVY_CORE)
                .unlockedBy("has_stack_upgrade_tier_10", has(StickUpgradeItem.STACK_UPGRADE_TIER_SB_10.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        StickUpgradeItem.STACK_UPGRADE_TIER_SB_11.get())
                .pattern("CBC")
                .pattern("BAB")
                .pattern("C C")
                .define('A', Items.LEATHER)
                .define('B', StickUpgradeItem.STACK_UPGRADE_TIER_SS_12.get())
                .define('C', Items.STRING)
                .unlockedBy("has_stack_upgrade_tier_10", has(StickUpgradeItem.STACK_UPGRADE_TIER_SB_10.get()))
                .save(recipeOutput, MoreTierUpgrade.MOD_ID + ":" + "stack_upgrade_tier_sb_11_for_ss");




        // ==================== 精妙存储 ====================

        // 堆叠升级T6 - 本体 - 转换
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        StickUpgradeItem.STACK_UPGRADE_TIER_SS_6.get())
                .pattern("CCC")
                .pattern("CAC")
                .pattern("BCB")
                .define('A', net.p3pp3rf1y.sophisticatedstorage.init.ModItems.STACK_UPGRADE_TIER_5.get())
                .define('B', Blocks.AMETHYST_BLOCK)
                .define('C', Tags.Items.GEMS_AMETHYST)
                .unlockedBy("has_stack_upgrade_tier_5", has(net.p3pp3rf1y.sophisticatedstorage.init.ModItems.STACK_UPGRADE_TIER_5.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        StickUpgradeItem.STACK_UPGRADE_TIER_SS_6.get(), 3)
                .pattern("ABA")
                .pattern(" A ")
                .pattern("A A")
                .define('A', ItemTags.PLANKS)
                .define('B', StickUpgradeItem.STACK_UPGRADE_TIER_SB_5.get())
                .unlockedBy("has_stack_upgrade_tier_5", has(net.p3pp3rf1y.sophisticatedstorage.init.ModItems.STACK_UPGRADE_TIER_5.get()))
                .save(recipeOutput, MoreTierUpgrade.MOD_ID + ":" + "stack_upgrade_tier_ss_6_for_sb");

        // 堆叠升级T7 - 本体 - 转换
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        StickUpgradeItem.STACK_UPGRADE_TIER_SS_7.get())
                .pattern("CCC")
                .pattern("CAC")
                .pattern("BCB")
                .define('A', StickUpgradeItem.STACK_UPGRADE_TIER_SS_6.get())
                .define('B', Blocks.HONEY_BLOCK)
                .define('C', Items.HONEYCOMB)
                .unlockedBy("has_stack_upgrade_tier_6", has(StickUpgradeItem.STACK_UPGRADE_TIER_SS_6.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        StickUpgradeItem.STACK_UPGRADE_TIER_SS_7.get(), 3)
                .pattern("ABA")
                .pattern(" A ")
                .pattern("A A")
                .define('A', ItemTags.PLANKS)
                .define('B', StickUpgradeItem.STACK_UPGRADE_TIER_SB_6.get())
                .unlockedBy("has_stack_upgrade_tier_6", has(StickUpgradeItem.STACK_UPGRADE_TIER_SS_6.get()))
                .save(recipeOutput, MoreTierUpgrade.MOD_ID + ":" + "stack_upgrade_tier_ss_7_for_sb");

        // 堆叠升级T8 - 本体 - 转换
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        StickUpgradeItem.STACK_UPGRADE_TIER_SS_8.get())
                .pattern("CCC")
                .pattern("CAC")
                .pattern("BCB")
                .define('A', StickUpgradeItem.STACK_UPGRADE_TIER_SS_7.get())
                .define('B', Blocks.SCULK)
                .define('C', Items.ECHO_SHARD)
                .unlockedBy("has_stack_upgrade_tier_7", has(StickUpgradeItem.STACK_UPGRADE_TIER_SS_7.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        StickUpgradeItem.STACK_UPGRADE_TIER_SS_8.get(), 3)
                .pattern("ABA")
                .pattern(" A ")
                .pattern("A A")
                .define('A', ItemTags.PLANKS)
                .define('B', StickUpgradeItem.STACK_UPGRADE_TIER_SB_7.get())
                .unlockedBy("has_stack_upgrade_tier_7", has(StickUpgradeItem.STACK_UPGRADE_TIER_SS_7.get()))
                .save(recipeOutput, MoreTierUpgrade.MOD_ID + ":" + "stack_upgrade_tier_ss_8_for_sb");

        // 堆叠升级T9 - 本体 - 转换
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        StickUpgradeItem.STACK_UPGRADE_TIER_SS_9.get())
                .pattern("CCC")
                .pattern("CAC")
                .pattern("BCB")
                .define('A', StickUpgradeItem.STACK_UPGRADE_TIER_SS_8.get())
                .define('B', Items.CONDUIT)
                .define('C', Items.HEART_OF_THE_SEA)
                .unlockedBy("has_stack_upgrade_tier_8", has(StickUpgradeItem.STACK_UPGRADE_TIER_SS_8.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        StickUpgradeItem.STACK_UPGRADE_TIER_SS_9.get(), 3)
                .pattern("ABA")
                .pattern(" A ")
                .pattern("A A")
                .define('A', ItemTags.PLANKS)
                .define('B', StickUpgradeItem.STACK_UPGRADE_TIER_SB_8.get())
                .unlockedBy("has_stack_upgrade_tier_8", has(StickUpgradeItem.STACK_UPGRADE_TIER_SS_8.get()))
                .save(recipeOutput, MoreTierUpgrade.MOD_ID + ":" + "stack_upgrade_tier_ss_9_for_sb");

        // 堆叠升级T10 - 本体 - 转换
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        StickUpgradeItem.STACK_UPGRADE_TIER_SS_10.get())
                .pattern("CCC")
                .pattern("CAC")
                .pattern("BCB")
                .define('A', StickUpgradeItem.STACK_UPGRADE_TIER_SS_9.get())
                .define('B', Items.TURTLE_SCUTE)
                .define('C', Items.GHAST_TEAR)
                .unlockedBy("has_stack_upgrade_tier_9", has(StickUpgradeItem.STACK_UPGRADE_TIER_SS_9.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        StickUpgradeItem.STACK_UPGRADE_TIER_SS_10.get(), 3)
                .pattern("ABA")
                .pattern(" A ")
                .pattern("A A")
                .define('A', ItemTags.PLANKS)
                .define('B', StickUpgradeItem.STACK_UPGRADE_TIER_SB_9.get())
                .unlockedBy("has_stack_upgrade_tier_9", has(StickUpgradeItem.STACK_UPGRADE_TIER_SS_9.get()))
                .save(recipeOutput, MoreTierUpgrade.MOD_ID + ":" + "stack_upgrade_tier_ss_10_for_sb");

        // 堆叠升级T11 - 本体 - 转换
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        StickUpgradeItem.STACK_UPGRADE_TIER_SS_11.get())
                .pattern("CCC")
                .pattern("CAC")
                .pattern("BCB")
                .define('A', StickUpgradeItem.STACK_UPGRADE_TIER_SS_10.get())
                .define('B', Items.NETHER_STAR)
                .define('C', Items.DRAGON_BREATH)
                .unlockedBy("has_stack_upgrade_tier_10", has(StickUpgradeItem.STACK_UPGRADE_TIER_SS_10.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        StickUpgradeItem.STACK_UPGRADE_TIER_SS_11.get(), 3)
                .pattern("ABA")
                .pattern(" A ")
                .pattern("A A")
                .define('A', ItemTags.PLANKS)
                .define('B', StickUpgradeItem.STACK_UPGRADE_TIER_SB_10.get())
                .unlockedBy("has_stack_upgrade_tier_10", has(StickUpgradeItem.STACK_UPGRADE_TIER_SS_10.get()))
                .save(recipeOutput, MoreTierUpgrade.MOD_ID + ":" + "stack_upgrade_tier_ss_11_for_sb");

        // 堆叠升级T12 - 本体 - 转换
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        StickUpgradeItem.STACK_UPGRADE_TIER_SS_12.get())
                .pattern("CCC")
                .pattern("CAC")
                .pattern("BCB")
                .define('A', StickUpgradeItem.STACK_UPGRADE_TIER_SS_11.get())
                .define('B', Items.HEAVY_CORE)
                .define('C', Items.POPPED_CHORUS_FRUIT)
                .unlockedBy("has_stack_upgrade_tier_11", has(StickUpgradeItem.STACK_UPGRADE_TIER_SS_11.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        StickUpgradeItem.STACK_UPGRADE_TIER_SS_12.get(), 3)
                .pattern("ABA")
                .pattern(" A ")
                .pattern("A A")
                .define('A', ItemTags.PLANKS)
                .define('B', StickUpgradeItem.STACK_UPGRADE_TIER_SB_11.get())
                .unlockedBy("has_stack_upgrade_tier_11", has(StickUpgradeItem.STACK_UPGRADE_TIER_SS_11.get()))
                .save(recipeOutput, MoreTierUpgrade.MOD_ID + ":" + "stack_upgrade_tier_ss_12_for_sb");

    }
}
