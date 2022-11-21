package com.example.goofymod.item;

import com.example.goofymod.GoofyMod;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GoofyMod.MODID);

    // mod items

    // end mod items

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
