package com.iconed.AyMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class OwlBlock extends Block {

	protected OwlBlock() {
		super(Material.rock);
		this.setBlockName("owlblock");
		this.setCreativeTab(BaseAyMod.tabAymod);
		this.setHardness(15F);
		this.setResistance(10F);
		this.setHarvestLevel("pickaxe", 3);
		this.setLightLevel(150F);
		this.setBlockTextureName("aymod:OwlBlock");
	}

}
