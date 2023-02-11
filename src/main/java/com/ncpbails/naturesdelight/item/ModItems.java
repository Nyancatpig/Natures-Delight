package com.ncpbails.naturesdelight.item;

import com.ncpbails.naturesdelight.NaturesDelight;
import com.ncpbails.naturesdelight.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.FarmersDelight;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NaturesDelight.MOD_ID);

    public static final RegistryObject<Item> PINEAPPLE_TOP = ITEMS.register("pineapple_top",
            () -> new ItemNameBlockItem(ModBlocks.PINEAPPLES.get(),
                    new Item.Properties().tab(FarmersDelight.CREATIVE_TAB)));

    public static final RegistryObject<Item> PINEAPPLE = ITEMS.register("pineapple",
            () -> new Item(new Item.Properties().tab(FarmersDelight.CREATIVE_TAB).food(ModFoods.PINEAPPLE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
