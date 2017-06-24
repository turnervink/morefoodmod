package com.turnervink.morefood.blocks;

import com.turnervink.morefood.handlers.ItemHandler;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

/**
 * Created by turner on 2017-06-24.
 */
public class BlockOnionCrop extends BlockCrops {

    public BlockOnionCrop(String name) {
        super();
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    @Override
    protected Item getSeed() {
        return ItemHandler.onion;
    }

    @Override
    protected Item getCrop() {
        return ItemHandler.onion;
    }
}
