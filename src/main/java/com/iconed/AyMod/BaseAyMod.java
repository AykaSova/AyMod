package com.iconed.AyMod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = "aymod", name = "First Mod of Ayka Sova", version = "1.00.0")


public class BaseAyMod {
	
//	@Mod.Instance("aymod")
	
	public static Block owlblock;
	public static Item owlpickaxe;
	public static Item owlfeather;
	public static Block swampblock;
	public static CreativeTabs tabAymod;
	public static BaseAyMod instance;
	
	@SidedProxy(clientSide = "com.iconed.AyMod.ClientProxy", serverSide = "com.iconed.AyMod.CommonProxy")
	public static CommonProxy proxy;	

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		System.out.println("Ёто јечка шалит! ѕривет");
		
		tabAymod = new TabAymod("40");
		
		owlblock = new OwlBlock();
		GameRegistry.registerBlock(owlblock, "owlblock");
		
//		OwlFeather owlfeather = new OwlFeather();
		owlfeather = new OwlFeather();
		GameRegistry.registerItem(owlfeather, "owlfeather");
		
		owlpickaxe = new OwlPickAxe();
		GameRegistry.registerItem(owlpickaxe, "owlpickaxe");
		GameRegistry.addRecipe(new ItemStack(BaseAyMod.owlpickaxe, 1),
				  new Object[]{
				    "#Q#", " Y ", " Z ",
				    ('Q'), Items.diamond,
				    ('X'), Blocks.air,
				    ('#'), BaseAyMod.owlfeather,
				    ('Y'), Items.blaze_rod,
				    ('Z'), Items.emerald
				  }
				);
		
		swampblock = new SwampBlock();
		GameRegistry.registerBlock(swampblock, "swampblock");
	}
	/**	ќписание нового материала: 
			Ќазвание-константа
			 рутость Ч дл€ кирки 0 до 3
			ћаксимальное количество сломанных блоков (долговечность), дл€ алмазки Ч 1561
			—корость ломани€ Ч дл€ золота 22, дл€ аламазки 8
			”рон дл€ мобов Ч дл€ алмазки 3
			«ачаровываемость, то есть какой шанс хороших чар (у золотой Ч 22, алмазной Ч 10, железной Ч 14).
	*/
	
	public static final ToolMaterial OWLTOOL = EnumHelper.addToolMaterial("OWLTOOL", 3, 12000, 12.0F, 4.0F, 30);	
}
