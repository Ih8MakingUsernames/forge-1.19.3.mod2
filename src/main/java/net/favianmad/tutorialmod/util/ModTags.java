package net.favianmad.tutorialmod.util;

import net.favianmad.tutorialmod.TutorialMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_FLINT_TOOL = tagKey("needs_flint_tool");
public static final TagKey<Block> NEEDS_BRONZE_TOOL = tagKey("needs_bronze_tool");
public static final TagKey<Block> NEEDS_STEEL_TOOL = tagKey("needs_steel_tool");
        private static TagKey<Block> tagKey(String name) {
            return BlockTags.create(new ResourceLocation(TutorialMod.MOD_ID, name));
        }

        private static TagKey<Block> blockTagKey(String name){
            return BlockTags.create(new ResourceLocation("forge",name));
        }
    }
}
