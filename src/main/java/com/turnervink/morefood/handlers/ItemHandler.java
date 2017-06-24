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
    public static Item onion;
    public static Item tomato;
    public static Item lettuce;
    public static Item rawOnionRing;
    public static Item onionRing;

    public static void init() {

        onion = new ItemOnion("onion", 3, 3.6F);
        tomato = new ItemTomato("tomato", 3, 3.6F);
        lettuce = new ItemLettuce("lettuce", 3, 3.6F);
        rawOnionRing = new ItemRawOnionRing("raw_onion_ring", 3, 2F, false);
        onionRing = new ItemOnionRing("onion_ring", 4, 3F, false);

    }

    public static void register() {

        GameRegistry.register(onion);
        GameRegistry.register(tomato);
        GameRegistry.register(lettuce);
        GameRegistry.register(rawOnionRing);
        GameRegistry.register(onionRing);

    }

    public static void registerRenders() {

        registerRender(onion);
        registerRender(tomato);
        registerRender(lettuce);
        registerRender(rawOnionRing);
        registerRender(onionRing);

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
