package com.dregath.permaculture.init;

import com.dregath.permaculture.item.ItemBase;
import com.dregath.permaculture.item.ItemIngot;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemBase ingotCobalt = new ItemIngot();

    public static void init()
    {
        GameRegistry.registerItem(ingotCobalt, "ingotCobalt");
    }
}
