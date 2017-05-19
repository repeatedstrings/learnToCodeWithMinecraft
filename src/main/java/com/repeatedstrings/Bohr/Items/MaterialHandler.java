package com.repeatedstrings.Bohr.Items;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by james on 5/18/17.
 */
public class MaterialHandler {
    public static ToolMaterial BOHR = EnumHelper.addToolMaterial(
                "bohr material", 3, 2500, 4F, 4F, 16);
}