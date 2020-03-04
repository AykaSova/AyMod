package com.iconed.AyMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabAymod extends CreativeTabs {

	public TabAymod(String lable) {
		  super(lable);
		}

	@Override
	public Item getTabIconItem() {
		
		  return Item.getItemFromBlock(BaseAyMod.owlblock);
		}
}
