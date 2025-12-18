package net.mcreator.idk.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class GoldHammerItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, 101, 15f, 0, 22, TagKey.create(Registries.ITEM, ResourceLocation.parse("pjs_enhanced_gold_neoforge:gold_hammer_repair_items")));

	public GoldHammerItem(Item.Properties properties) {
		super(properties.pickaxe(TOOL_MATERIAL, 5.5f, -1.5f));
	}
}