package com.jambery.hackbimod.events;

import org.apache.logging.log4j.Logger;

import com.jambery.hackbimod.Main;
import com.jambery.hackbimod.lists.BlockList;
import com.jambery.hackbimod.lists.ItemList;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class RegistryEvents {
	
	public static final Logger LOGGER = Main.LOGGER;
	public static final String MOD_ID = Main.MOD_ID;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll
		(
			ItemList.ruby = new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("ruby")),
			ItemList.ruby_block = new BlockItem(BlockList.ruby_block, new Item.Properties().group(ItemGroup.MISC)).setRegistryName(BlockList.ruby_block.getRegistryName())
		);
	}
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll
		(	
			BlockList.ruby_block = new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestLevel(3)).setRegistryName(location("ruby_block"))
		);
	}
	
	public static ResourceLocation location(String name) {
		return new ResourceLocation(MOD_ID, name);
	}
}
