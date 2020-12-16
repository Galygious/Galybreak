package com.galymods.galybreak;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = galybreak.MODID, name = galybreak.NAME, version = galybreak.VERSION)
public class galybreak
{
	@Mod.Instance("galybreak")
	public static galybreak instance;
		
    public static final String MODID = "galymod";
    public static final String NAME = "Galybreak";
    public static final String VERSION = "1.12.2-A1";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        keybinds.register();
        MinecraftForge.EVENT_BUS.register(new keyinputhandler());
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    }
    
    public void postInit(FMLPostInitializationEvent event)
    {
    	
    }
}