package com.wuest.prefab.Items;

import com.wuest.prefab.ModRegistry;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

/**
 * @author WuestMan
 */
public class ItemBundleOfTimber extends Item
{
	public ItemBundleOfTimber(String name)
	{
		super(new Item.Properties().group(ItemGroup.MATERIALS));

		ModRegistry.setItemName(this, name);
	}
}