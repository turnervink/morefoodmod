package com.turnervink.morefood.handlers;

import com.turnervink.morefood.blocks.BlockLettuceCrop;
import com.turnervink.morefood.blocks.BlockOnionCrop;
import com.turnervink.morefood.blocks.BlockTomatoCrop;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by turner on 2017-06-24.
 */
public class BlockHandler {

    // Define Block objects
    public static Block onionCrop;
    public static Block tomatoCrop;
    public static Block lettuceCrop;

    public static void init() {

        onionCrop = new BlockOnionCrop("onion_crop");
        tomatoCrop = new BlockTomatoCrop("tomato_crop");
        lettuceCrop = new BlockLettuceCrop("lettuce_crop");

    }

    public static void register() {

        GameRegistry.register(onionCrop);
        GameRegistry.register(tomatoCrop);
        GameRegistry.register(lettuceCrop);

    }

    public static void registerRenders() {

        registerRender(onionCrop);
        registerRender(tomatoCrop);
        registerRender(lettuceCrop);

    }

    public static void registerRender(Block block) {

        Item item = Item.getItemFromBlock(block);

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
