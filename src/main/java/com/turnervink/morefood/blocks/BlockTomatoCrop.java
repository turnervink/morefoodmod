package com.turnervink.morefood.blocks;

import com.turnervink.morefood.handlers.ItemHandler;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

/**
 * Created by turner on 2017-06-24.
 */
public class BlockTomatoCrop extends BlockCrops {

    public BlockTomatoCrop(String name) {
        super();
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    @Override
    protected Item getSeed() {
        return ItemHandler.tomato;
    }

    @Override
    protected Item getCrop() {
        return ItemHandler.tomato;
    }

}
