package com.turnervink.morefood.handlers;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by turner on 2017-06-24.
 */
public class SmeltingHandler {

    public static void init() {

        GameRegistry.addSmelting(ItemHandler.rawOnionRing, new ItemStack(ItemHandler.onionRing), 0);
        GameRegistry.addSmelting(ItemHandler.rawFrenchFries, new ItemStack(ItemHandler.frenchFries), 0);
        GameRegistry.addSmelting(Items.MILK_BUCKET, new ItemStack(ItemHandler.cheese, 12), 0);

    }

}
