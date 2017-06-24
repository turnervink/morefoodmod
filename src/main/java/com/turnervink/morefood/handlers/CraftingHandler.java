package com.turnervink.morefood.handlers;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by turner on 2017-06-24.
 */
public class CraftingHandler {

    public static void init() {

        GameRegistry.addShapelessRecipe(new ItemStack(ItemHandler.rawOnionRing, 3), ItemHandler.onion, Items.WHEAT, Items.MILK_BUCKET, Items.EGG);

    }

}
