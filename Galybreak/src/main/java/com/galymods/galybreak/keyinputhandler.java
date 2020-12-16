package com.galymods.galybreak;

import net.minecraft.client.Minecraft;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;

public class keyinputhandler
{
    @SubscribeEvent
    public void onKeyInput(KeyInputEvent event)
    {
        if (keybinds.dig.isPressed())
        {
            RayTraceResult lookingAt = Minecraft.getMinecraft().objectMouseOver;
            if (lookingAt != null && lookingAt.typeOfHit == RayTraceResult.Type.BLOCK) {
                BlockPos pos = lookingAt.getBlockPos();
                // now the coordinates you want are in pos. Example of use:
                Minecraft.getMinecraft().player.sendMessage(new TextComponentString(String.valueOf(pos.getX()+","+pos.getY()+","+pos.getZ())));
                // this is a bit oversimplified - you have to send a packet to the server, since only the client knows the BlockPos, but only the server can change blocks
            } else {
                // not looking at a block, or too far away from one to tell
            }
        }
    }
}