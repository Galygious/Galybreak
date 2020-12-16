package com.galymods.galybreak;

import org.lwjgl.input.Keyboard;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


public class keybinds
{
    public static KeyBinding dig;
 
    public static void register()
    {
        dig = new KeyBinding("key.dig", Keyboard.KEY_V, "key.categories.galybreak");
 
        ClientRegistry.registerKeyBinding(dig);
    }
    
    public static void preInit(FMLPreInitializationEvent event)
    {
        keybinds.register();
    }
}
