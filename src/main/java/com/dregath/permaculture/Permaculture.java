package com.dregath.permaculture;

import com.dregath.permaculture.proxy.IProxy;
import com.dregath.permaculture.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Permaculture
{
    @Mod.Instance(Reference.MOD_ID)
    public static Permaculture instance;

    @SidedProxy(clientSide = "com.dregath.permaculture.proxy.ClientProxy", serverSide = "com.dregath.permaculture.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
