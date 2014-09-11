package xbony2.rubymod;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RubyGem extends Item{

	public RubyGem(){
		super();
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setTextureName("bonyrubymod:rubygem");
		this.setUnlocalizedName("gemRuby");
	}
	
}
