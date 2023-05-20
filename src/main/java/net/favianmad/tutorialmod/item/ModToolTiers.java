package net.favianmad.tutorialmod.item;

import net.favianmad.tutorialmod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {

    public static Tier FLINTSTONE;
    public static Tier BRONZE;
    public static Tier STEEL;

    static {
        FLINTSTONE = TierSortingRegistry.registerTier(new ForgeTier(1, 79, 3.0f,1f,7, ModTags.Blocks.NEEDS_FLINT_TOOL,() -> Ingredient.of(Items.FLINT)

        ), new ResourceLocation("bronze"), List.of(Tiers.WOOD), List.of(Tiers.STONE));
    }

    static {
        BRONZE = TierSortingRegistry.registerTier(new ForgeTier(2, 180, 5.0f,2f,14, ModTags.Blocks.NEEDS_BRONZE_TOOL,() ->
            Ingredient.of(ModItems.BRONZE_INGOT.get())
        ), new ResourceLocation("bronze"), List.of(Tiers.STONE), List.of(Tiers.IRON));
    }
    static {
        STEEL = TierSortingRegistry.registerTier(new ForgeTier(2, 300, 5.0f,2f,14, ModTags.Blocks.NEEDS_STEEL_TOOL,() ->
                Ingredient.of(ModItems.STEEL_INGOT.get())
        ), new ResourceLocation("steel"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
    }
}
