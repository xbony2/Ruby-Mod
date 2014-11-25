package xbony2.rubymod;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

import org.jruby.Ruby;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "BonyRubyMod", name = "Ruby Mod", version = "1.0.0a")
public class RubyMod {

	@Instance
	public static RubyMod instance;
	
	public static Block rubyOre;
	public static Item rubyGem;
	
	private final String rubyGemC = "bin/xbony2/rubymod/ruby/RubyGem.rb";
	private final Ruby ruby = Ruby.newInstance();
	public static ScriptEngine jruby;
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		jruby = new ScriptEngineManager().getEngineByName("jruby");
		try {
			jruby.eval(new BufferedReader(new FileReader(rubyGemC)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ScriptException e) {
			e.printStackTrace();
		}
		try {
			rubyGem = (Item) jruby.eval("RubyGem.new");
		} catch (ScriptException e) {
			e.printStackTrace();
		}
		
		rubyOre = new RubyOre(Material.iron);
		
		GameRegistry.registerBlock(rubyOre, "RubyOre");
		GameRegistry.registerItem(rubyGem, "RubyGem");
	}
}
