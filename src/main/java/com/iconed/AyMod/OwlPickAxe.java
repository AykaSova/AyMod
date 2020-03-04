package com.iconed.AyMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class OwlPickAxe extends ItemPickaxe {

	protected OwlPickAxe() {
		super(BaseAyMod.OWLTOOL);
		this.setCreativeTab(BaseAyMod.tabAymod);
		this.setTextureName("aymod:owlpickaxe");
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setUnlocalizedName("owlpickaxe");
	}

}