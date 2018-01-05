package com.repeatedstrings.mods.Bohr.Handlers;

import com.repeatedstrings.mods.items.BohrBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by james on 5/8/17.
 */
public class BohrBlockHandler implements BohrHandlerInterface {
    public static Block bohrBlock;
    public static ItemBlock aBohrBlock;

    public static void init() {
        bohrBlock = new BohrBlock(Material.ROCK, "bohr_block", CreativeTabs.BUILDING_BLOCKS, 1F, 2F, 0, "pickaxe");
        aBohrBlock = (ItemBlock) new ItemBlock(bohrBlock);
    }

    public static void register() {
        GameRegistry.register(aBohrBlock, bohrBlock.getRegistryName());
        GameRegistry.register(bohrBlock);

    }

    public static void registerRenders() {
        registerRenders(bohrBlock);
    }

    public static void registerRenders(Block aBlock) {
        Item aItem = Item.getItemFromBlock(aBlock);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(aItem, 0, new ModelResourceLocation(aItem.getRegistryName(), "inventory"));

    }
}
