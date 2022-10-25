package com.aidyn_anton.john;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("john")
public class John {
	
	public static final String MOD_ID = "john";
	
	public static final CreativeModeTab John_Create_Tab = new CreativeModeTab("JohnTab") {
		
		@Override
		public ItemStack makeIcon() {
			// TODO Auto-generated method stub
			return null;
		}
	};
	

	public John() {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
