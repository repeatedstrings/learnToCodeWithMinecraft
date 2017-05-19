package com.repeatedstrings.Bohr.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

/**
 * Created by james on 5/18/17.
 */
public class BohrAxe extends ItemAxe {

    public BohrAxe(String name, ToolMaterial mat, CreativeTabs tab) {
        super(mat);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
    }
}