package com.iconed.AyMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SwampBlock extends Block {
	
	protected SwampBlock() {
		super(Material.ground);
		this.setBlockName("swampblock");
		this.setCreativeTab(BaseAyMod.tabAymod);
		this.setHardness(2F);
		this.setResistance(10F);
		this.setHarvestLevel("spade", 1);
		this.setLightLevel(0F);
		this.setBlockTextureName("aymod:swamp32");
}

}
