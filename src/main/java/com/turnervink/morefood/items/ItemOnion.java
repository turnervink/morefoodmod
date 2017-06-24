package com.turnervink.morefood.items;

import com.turnervink.morefood.handlers.BlockHandler;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;

/**
 * Created by turner on 2017-06-24.
 */
public class ItemOnion extends ItemSeedFood {

    public ItemOnion(String name, int restoreAmount, float saturation) {

        super(restoreAmount, saturation, BlockHandler.onionCrop, Blocks.FARMLAND);
        setUnlocalizedName(name);
        setRegistryName(name);

    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn,
                                      BlockPos pos, EnumHand hand, EnumFacing facing,
                                      float hitX, float hitY, float hitZ) {

        ItemStack itemstack = player.getHeldItem(hand);
        net.minecraft.block.state.IBlockState state = worldIn.getBlockState(pos);
        if (facing == EnumFacing.UP && player.canPlayerEdit(pos.offset(facing), facing, itemstack) && state.getBlock().canSustainPlant(state, worldIn, pos, EnumFacing.UP, this) && worldIn.isAirBlock(pos.up()))
        {
            worldIn.setBlockState(pos.up(), BlockHandler.onionCrop.getDefaultState(), 11);
            itemstack.shrink(1);
            return EnumActionResult.SUCCESS;
        }
        else
        {
            return EnumActionResult.FAIL;
        }

    }

    @Override
    public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {

        return EnumPlantType.Crop;

    }

    @Override
    public IBlockState getPlant(IBlockAccess world, BlockPos pos) {

        return BlockHandler.onionCrop.getDefaultState();

    }
}
