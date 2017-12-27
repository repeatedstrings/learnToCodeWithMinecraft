package com.repeatedstrings.mods.items;

import com.repeatedstrings.mods.Bohr.Handlers.BohrishItemHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by james on 5/8/17.
 */
public class BohrBlock extends Block {
//    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", BohrBlock.BlockType.class);
    public BohrBlock(Material mat, String name, CreativeTabs locationTab, float hard, float swings, int numGivn, String tool) {
        super(mat);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(locationTab);
        setHardness(hard);
        setResistance(swings);
        setHarvestLevel(tool, numGivn);

    }
//    public BohrBlock(Material mat, String name, CreativeTabs locationTab, float hard, float swings) {
//        super(mat);
//        setUnlocalizedName(name);
//        setRegistryName(name);
//        setCreativeTab(locationTab);
//        setHardness(hard);
//        setResistance(swings);
//    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return BohrishItemHandler.bohrOre;
//        return super.getItemDropped(state, rand, fortune);
    }

    @Override
    public int quantityDropped(IBlockState state, int fortune, Random random) {
        return random.nextInt(6) + 1;
    }
}
