package com.jambery.hackbimod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Main.MOD_ID)
public class Main {
	
	public static Main instance;
	public static final String MOD_ID = "jackhackbimod";
	public static final Logger LOGGER = LogManager.getLogger();
	
	public Main() { 
		instance = this;
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
	}
	
	private void setup(final FMLCommonSetupEvent event) {
		
	}
	
	private void clientSetup(final FMLClientSetupEvent event) {
		
	}
	
	public void onServerStarting(FMLServerStartingEvent event) {
		
	}
	
}
