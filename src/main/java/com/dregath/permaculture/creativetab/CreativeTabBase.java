package com.dregath.permaculture.creativetab;

import com.dregath.permaculture.init.ModItems;
import com.dregath.permaculture.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabBase
{
    public static final CreativeTabs PERMACULTURE_TAB = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.ingotCobalt;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "Permaculture";
        }


    };
}
