package net.favianmad.tutorialmod.item;

import net.favianmad.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item>ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> BLACK_OPAL = ITEMS.register("black_opal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Raw_BLACK_OPAL = ITEMS.register("raw_black_opal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLACK_NIGGAZ = ITEMS.register("black_niggaz",
            () -> new Item((new Item.Properties())));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item((new Item.Properties())));
    public static final RegistryObject<Item> RED_COPPER_INGOT = ITEMS.register("red_copper_ingot",
            () -> new Item((new Item.Properties())));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
