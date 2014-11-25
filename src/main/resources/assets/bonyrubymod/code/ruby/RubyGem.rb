# RubyGem.rb
require 'java'

java_package 'xbony2.rubymod.ruby'

class rubymod.ruby.RubyGem < net.minecraft.item.Item
  def initialize()
    super
    setCreativeTab(CreativeTabs.tabMaterials)
    setTextureName("bonyrubymod:rubygem")
    setUnlocalizedName("gemRuby")
  end
  
  public
  def registerIcons(register)
    itemIcon = register.registerIcon("bonyrubymod" + ":" + "rubygem")
  end
end
