package com.repeatedstrings.Bohr.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

import javax.tools.Tool;

/**
 * Created by james on 5/19/17.
 */
public class BohrPickAxe extends ItemPickaxe {
    public BohrPickAxe(String name, ToolMaterial mat, CreativeTabs tab) {
        super(mat);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
    }
}
