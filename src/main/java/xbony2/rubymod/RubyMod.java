package xbony2.rubymod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import org.jruby.Ruby;
import org.jruby.RubyClass;

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
	private final Ruby ruby = Ruby.newInstance();
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		RubyClass rclass = ruby.getClass(rubyGemDirectory + "RubyGem.rb");
		
		rubyOre = new RubyOre(Material.iron);
		//rubyGem = new RubyGem();
		
		GameRegistry.registerBlock(rubyOre, "RubyOre");
		GameRegistry.registerItem(rubyGem, "RubyGem");
	}
}
