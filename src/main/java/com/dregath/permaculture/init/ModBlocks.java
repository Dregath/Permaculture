package com.dregath.permaculture.init;

import com.dregath.permaculture.block.BlockBase;
import com.dregath.permaculture.block.BlockOre;
import com.dregath.permaculture.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockBase oreCobalt = new BlockOre();

    public static void init()
    {
        GameRegistry.registerBlock(oreCobalt, "oreCobalt");
    }
}
