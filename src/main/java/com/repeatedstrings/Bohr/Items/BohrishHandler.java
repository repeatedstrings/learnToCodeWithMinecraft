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
    public static Item bohrItem;

    public static void init() {
        bohrItem = new BohrItem("bohr_ore", CreativeTabs.MATERIALS);
    }

    public static void register() {
        GameRegistry.register(bohrItem);
    }

    // no item passed in here
    public static void registerRenders() {
        registerRenders(bohrItem);
    }

    // an item here overloading
    public static void registerRenders(Item item) {
        // ugly due to newest forge libs
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"  ));
    }

}
