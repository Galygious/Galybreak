package com.galymods.galybreak;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldServer;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraft.entity.player.*;

public class breakblocks
{
	public static void breakblock (BlockPos position)
	{
		WorldServer worldServer = FMLCommonHandler.instance().getMinecraftServerInstance().getWorld(EntityPlayerMP.dimension);
		worldServer.destroyBlock(position,true);
	}

}
