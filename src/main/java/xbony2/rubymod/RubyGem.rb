# RubyGem.rb
require 'java'

class RubyGem
  extend net.minecraft.item.Item
  def RubyGem()
    super
    setCreativeTab(CreativeTabs.tabMaterials)
    setTextureName("bonyrubymod:rubygem")
    setUnlocalizedName("gemRuby")
  end
  
  def registerIcons(register)
    itemIcon = register.registerIcon("bonyrubymod" + ":" + "rubygem")
  end
end