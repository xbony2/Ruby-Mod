package xbony2.rubymod;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import org.jruby.embed.LocalVariableBehavior;
import org.jruby.embed.ScriptingContainer;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "BonyRubyMod", name = "Ruby Mod",version = "1.0.0a")
public class RubyMod {

	@Instance
	public static RubyMod instance;
	
	public static Block rubyOre;
	public static Item rubyGem;
	
	private final String rubyGemDirectory = "xbony2/rubymod/ruby/";
	
	private ScriptEngine jruby;
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		rubyOre = new RubyOre(Material.iron);
		jruby = new ScriptEngineManager().getEngineByName("jruby");
		//ruby = new ScriptingContainer(LocalVariableBehavior.PERSISTENT);
		//ruby.put("main", this);
		rubyGem = new RubyGem();
		
		GameRegistry.registerBlock(rubyOre, "RubyOre");
		GameRegistry.registerItem(rubyGem, "RubyGem");
	}
}
