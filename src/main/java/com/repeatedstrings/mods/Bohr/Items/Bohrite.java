package com.repeatedstrings.mods.Bohr.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Bohrite extends Item {
    public Bohrite(String bohrite, CreativeTabs materials) {
        setUnlocalizedName(bohrite);
        setRegistryName(bohrite);
        setCreativeTab(materials);
    }
}