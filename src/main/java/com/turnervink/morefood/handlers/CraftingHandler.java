package com.turnervink.morefood.handlers;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by turner on 2017-06-24.
 */
public class CraftingHandler {

    public static void init() {

        GameRegistry.addShapelessRecipe(new ItemStack(ItemHandler.rawOnionRing, 3),
                ItemHandler.onion,
                Items.WHEAT,
                Items.MILK_BUCKET,
                Items.EGG);

        GameRegistry.addRecipe(new ItemStack(ItemHandler.beefSandwich, 2),
                " B ",
                "LMT",
                " B ",
                'B', Items.BREAD,
                'L', ItemHandler.lettuce,
                'M', Items.COOKED_BEEF,
                'T', ItemHandler.tomato);

        GameRegistry.addRecipe(new ItemStack(ItemHandler.porkSandwich, 2),
                " B ",
                "LMT",
                " B ",
                'B', Items.BREAD,
                'L', ItemHandler.lettuce,
                'M', Items.COOKED_PORKCHOP,
                'T', ItemHandler.tomato);

        GameRegistry.addRecipe(new ItemStack(ItemHandler.chickenSandwich, 2),
                " B ",
                "LMT",
                " B ",
                'B', Items.BREAD,
                'L', ItemHandler.lettuce,
                'M', Items.COOKED_CHICKEN,
                'T', ItemHandler.tomato);

        GameRegistry.addRecipe(new ItemStack(ItemHandler.muttonSandwich, 2),
                " B ",
                "LMT",
                " B ",
                'B', Items.BREAD,
                'L', ItemHandler.lettuce,
                'M', Items.COOKED_MUTTON,
                'T', ItemHandler.tomato);

    }

}
