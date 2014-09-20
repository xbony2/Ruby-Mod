# RubyGem.rb
require 'java'

class RubyGem
  include net.minecraft.item.Item
  def initialize()
    super
    setCreativeTab(CreativeTabs.tabMaterials)
    setTextureName("bonyrubymod:rubygem")
    setUnlocalizedName("gemRuby")
  end
  
  def registerIcons(register)
    itemIcon = register.registerIcon("bonyrubymod" + ":" + "rubygem")
  end
end