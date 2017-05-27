package com.repeatedstrings.Bohr.Handlers;

import com.repeatedstrings.BohrBlock.items.BohrBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by james on 5/13/17.
 */
public class PlaceThatBohrBlockHandler {
    public static Block bohrBlock;
    public static ItemBlock aBohrBlock;



    public static void register() {
        GameRegistry.register(aBohrBlock, bohrBlock.getRegistryName());
        GameRegistry.register(bohrBlock);

    }


}
