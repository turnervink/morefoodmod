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
    public static Item popsicle;
    public static Item ketchup;
    public static Item cheese; // I'm just crackers about cheese!
    public static Item hamburger;
    public static Item cheeseburger;

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
        popsicle = new ItemPopsicle("popsicle", 1, 0.5F, false);
        ketchup = new ItemKetchup("ketchup");
        cheese = new ItemCheese("cheese", 2, 2.5F, true);
        hamburger = new ItemHamburger("hamburger");
        cheeseburger = new ItemCheeseburger("cheeseburger");

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
        GameRegistry.register(popsicle);
        GameRegistry.register(ketchup);
        GameRegistry.register(cheese);
        GameRegistry.register(hamburger);
        GameRegistry.register(cheeseburger);

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
        registerRender(popsicle);
        registerRender(ketchup);
        registerRender(cheese);
        registerRender(hamburger);
        registerRender(cheeseburger);

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
