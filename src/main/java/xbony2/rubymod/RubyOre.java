package xbony2.rubymod;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RubyOre extends Block{

	public RubyOre(Material material) {
		super(material);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(3.0F);
		this.setResistance(5.0F);
		this.setStepSound(soundTypePiston);
		this.setBlockName("oreRuby");
	}

	@Override
	public Item getItemDropped(int I1, Random rand, int I2){
		return RubyMod.rubyGem;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register){
		blockIcon = register.registerIcon("bonyrubymod" + ":" + "rubyblock");
	}
}
