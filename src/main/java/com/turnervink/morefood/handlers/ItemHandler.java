package com.turnervink.morefood.handlers;

import com.turnervink.morefood.items.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by turner on 2017-06-24.
 */
public class ItemHandler {

    // Define Item objects
    public static Item kitchenKnife;
    public static Item onion;
    public static Item tomato;
    public static Item lettuce;
    public static Item rawOnionRing;
    public static Item onionRing;
    public static Item rawFrenchFries;
    public static Item frenchFries;
    public static Item beefSandwich;
    public static Item porkSandwich;
    public static Item chickenSandwich;
    public static Item muttonSandwich;

    public static void init() {

        kitchenKnife = new ItemKitchenKnife("kitchen_knife");
        onion = new ItemOnion("onion", 3, 3.6F);
        tomato = new ItemTomato("tomato", 3, 3.6F);
        lettuce = new ItemLettuce("lettuce", 3, 3.6F);
        rawOnionRing = new ItemRawOnionRing("raw_onion_ring", 3, 2F, false);
        onionRing = new ItemOnionRing("onion_ring", 4, 3F, false);
        rawFrenchFries = new ItemRawFrenchFries("raw_french_fries", 3, 2F, false);
        frenchFries = new ItemFrenchFries("french_fries", 4, 3F, true);
        beefSandwich = new ItemBeefSandwich("beef_sandwich");
        porkSandwich = new ItemBeefSandwich("pork_sandwich");
        chickenSandwich = new ItemBeefSandwich("chicken_sandwich");
        muttonSandwich = new ItemBeefSandwich("mutton_sandwich");

    }

    public static void register() {

        GameRegistry.register(kitchenKnife);
        GameRegistry.register(onion);
        GameRegistry.register(tomato);
        GameRegistry.register(lettuce);
        GameRegistry.register(rawOnionRing);
        GameRegistry.register(onionRing);
        GameRegistry.register(rawFrenchFries);
        GameRegistry.register(frenchFries);
        GameRegistry.register(beefSandwich);
        GameRegistry.register(porkSandwich);
        GameRegistry.register(chickenSandwich);
        GameRegistry.register(muttonSandwich);

    }

    public static void registerRenders() {

        registerRender(kitchenKnife);
        registerRender(onion);
        registerRender(tomato);
        registerRender(lettuce);
        registerRender(rawOnionRing);
        registerRender(onionRing);
        registerRender(rawFrenchFries);
        registerRender(frenchFries);
        registerRender(beefSandwich);
        registerRender(porkSandwich);
        registerRender(chickenSandwich);
        registerRender(muttonSandwich);

    }

    public static void registerRender(Item item) {

        Minecraft.getMinecraft()
                .getRenderItem()
                .getItemModelMesher()
                .register(
                        item,
                        0,
                        new ModelResourceLocation(item.getRegistryName(),
                        "inventory"));

    }

}
