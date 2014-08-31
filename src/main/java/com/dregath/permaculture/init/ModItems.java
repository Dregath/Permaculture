package com.dregath.permaculture.init;

import com.dregath.permaculture.item.ItemBase;
import com.dregath.permaculture.item.ItemIngot;
import com.dregath.permaculture.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemBase ingotCobalt = new ItemIngot();

    public static void init()
    {
        GameRegistry.registerItem(ingotCobalt, "ingotCobalt");
    }
}
