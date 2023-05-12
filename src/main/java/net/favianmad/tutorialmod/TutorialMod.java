package net.favianmad.tutorialmod;

import com.mojang.logging.LogUtils;
import net.favianmad.tutorialmod.block.ModBlocks;
import net.favianmad.tutorialmod.item.ModCreativeModeTabs;
import net.favianmad.tutorialmod.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TutorialMod.MOD_ID)
public class TutorialMod
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "tutorialmod";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    //This is a very important comment
    public TutorialMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);


        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event)
    {
        if(event.getTab() == CreativeModeTabs.INGREDIENTS){

            event.accept(ModItems.Raw_BLACK_OPAL);
            event.accept(ModItems.BLACK_OPAL);

            //List Of Raw Metals:

            event.accept(ModItems.RAW_ALUMINUM);
            event.accept(ModItems.RAW_NICKEL);
            event.accept(ModItems.RAW_PLATINUM);
            event.accept(ModItems.RAW_TIN);
            event.accept(ModItems.RAW_TITANIUM);
            event.accept(ModItems.RAW_TUNGSTEN);
            event.accept(ModItems.RAW_SILVER);

            //List of Raw Alloyed-metals:

            event.accept(ModItems.RAW_BRASS);
            event.accept(ModItems.RAW_BRONZE);
            event.accept(ModItems.RAW_RED_COPPER);

            //List of Ingots:

            //Nonalloyed Ingots:

            event.accept(ModItems.ALUMINUM_INGOT);
            event.accept(ModItems.NICKEL_INGOT);
            event.accept(ModItems.PLATINUM_INGOT);
            event.accept(ModItems.TIN_INGOT);
            event.accept(ModItems.TITANIUM_INGOT);
            event.accept(ModItems.TUNGSTEN_INGOT);
            event.accept(ModItems.SILVER_INGOT);

            //Alloyed Ingots

            event.accept(ModItems.STEEL_INGOT);
            event.accept(ModItems.RED_COPPER_INGOT);
            event.accept(ModItems.BRASS_INGOT);
            event.accept(ModItems.BRONZE_INGOT);
        }

        if(event.getTab() == CreativeModeTabs.BUILDING_BLOCKS){
            event.accept(ModBlocks.BLACK_OPAL_BLOCK);
        }

        if(event.getTab() == ModCreativeModeTabs.TUTORIAL_TAB){

        event.accept(ModItems.Raw_BLACK_OPAL);
        event.accept(ModItems.BLACK_OPAL);
        event.accept(ModBlocks.BLACK_OPAL_BLOCK);
        event.accept(ModBlocks.DEEPSLATE_BLACK_OPAL_ORE);
        event.accept(ModBlocks.NETHERRACK_BLACK_OPAL_ORE);
        event.accept(ModBlocks.BLACK_OPAL_ORE);
        event.accept(ModBlocks.ENDSTONE_BLACK_OPAL_ORE);


    }
        if(event.getTab() == ModCreativeModeTabs.MY_MOD_TAB){

            //List Of Raw Metals:

            event.accept(ModItems.RAW_ALUMINUM);
            event.accept(ModItems.RAW_NICKEL);
            event.accept(ModItems.RAW_PLATINUM);
            event.accept(ModItems.RAW_TIN);
            event.accept(ModItems.RAW_TITANIUM);
            event.accept(ModItems.RAW_TUNGSTEN);
            event.accept(ModItems.RAW_SILVER);

            //List of Raw Alloyed-metals:

            event.accept(ModItems.RAW_BRASS);
            event.accept(ModItems.RAW_BRONZE);
            event.accept(ModItems.RAW_RED_COPPER);

            //List of Ingots:

            //Nonalloyed Ingots:

            event.accept(ModItems.ALUMINUM_INGOT);
            event.accept(ModItems.NICKEL_INGOT);
            event.accept(ModItems.PLATINUM_INGOT);
            event.accept(ModItems.TIN_INGOT);
            event.accept(ModItems.TITANIUM_INGOT);
            event.accept(ModItems.TUNGSTEN_INGOT);
            event.accept(ModItems.SILVER_INGOT);

            //Alloyed Ingots

            event.accept(ModItems.STEEL_INGOT);
            event.accept(ModItems.RED_COPPER_INGOT);
            event.accept(ModItems.BRASS_INGOT);
            event.accept(ModItems.BRONZE_INGOT);



        }
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
