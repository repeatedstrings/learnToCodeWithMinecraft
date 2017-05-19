package com.repeatedstrings.Bohr.Items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by james on 5/6/17.
 */
public class BohrishHandler {
    public static Item bohrOre;
    public static BohrAxe bohrAxe;

    public static void init() {
        bohrOre = new BohrOre("bohr_ore", CreativeTabs.MATERIALS);
        bohrAxe = new BohrAxe("bohr_axe", MaterialHandler.BOHR, CreativeTabs.TOOLS);
//        bohrHoe = new BohrOre("bohr_hoe", CreativeTabs.TOOLS);
//        bohrPickaxe = new BohrOre("bohr_pickaxe", CreativeTabs.TOOLS);
//        bohrShovel = new BohrOre("bohr_shovel", CreativeTabs.TOOLS);
//        bohrSword = new BohrOre("bohr_sword", CreativeTabs.COMBAT);
    }

    public static void register() {
        GameRegistry.register(bohrOre);
        GameRegistry.register(bohrAxe);
//        GameRegistry.register(bohrHoe);
//        GameRegistry.register(bohrPickaxe);
//        GameRegistry.register(bohrShovel);
//        GameRegistry.register(bohrSword);

    }

    // no item passed in here
    public static void registerRenders() {
        registerRenders(bohrOre);
        registerRenders(bohrAxe);
//        registerRenders(bohrHoe);
//        registerRenders(bohrPickaxe);
//        registerRenders(bohrShovel);
//        registerRenders(bohrSword);
    }

    // an item here overloading
    public static void registerRenders(Item item) {
        // ugly due to newest forge libs
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"  ));
    }

}
