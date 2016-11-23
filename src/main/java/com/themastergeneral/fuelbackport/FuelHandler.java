package com.themastergeneral.fuelbackport;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler 
{
	public int getBurnTime(ItemStack fuel) 
	{
		Item var1 = fuel.getItem();
		if(var1 == Item.getItemFromBlock(Blocks.WOOL))
		{
			return 100;
		}
		else if (var1 == Item.getItemFromBlock(Blocks.CARPET))
		{
			return 33;
		}
		else if (var1 == Item.getItemFromBlock(Blocks.LADDER))
		{
			return 300;
		}
		else if (var1 == Items.BOW)
		{
			return 300;
		}
		else if (var1 == Item.getItemFromBlock(Blocks.WOODEN_BUTTON))
		{
			return 100;
		}
		else if (var1 == Items.FISHING_ROD)
		{
			return 300;
		}
		else if (var1 == Items.SIGN)
		{
			return 200;
		}
		else if (var1 == Items.BOWL)
		{
			return 100;
		}
		else if (var1 == Items.DARK_OAK_DOOR)
		{
			return 200;
		}
		else if (var1 == Items.OAK_DOOR)
		{
			return 200;
		}
		else if (var1 == Items.BIRCH_DOOR)
		{
			return 200;
		}
		else if (var1 == Items.SPRUCE_DOOR)
		{
			return 200;
		}
		else if (var1 == Items.JUNGLE_DOOR)
		{
			return 200;
		}
		else if (var1 == Items.ACACIA_DOOR)
		{
			return 200;
		}
		else if (var1 == Items.ACACIA_BOAT)
		{
			return 400;
		}
		else if (var1 == Items.BOAT)
		{
			return 400;
		}
		else if (var1 == Items.DARK_OAK_BOAT)
		{
			return 400;
		}
		else if (var1 == Items.BIRCH_BOAT)
		{
			return 400;
		}
		else if (var1 == Items.JUNGLE_BOAT)
		{
			return 400;
		}
		else if (var1 == Items.SPRUCE_BOAT)
		{
			return 400;
		}
		else
		{
			return 0;
		}
	}
}
