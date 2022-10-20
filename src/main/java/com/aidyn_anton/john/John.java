package com.aidyn_anton.john;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("john")
public class John {

	public John() {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
