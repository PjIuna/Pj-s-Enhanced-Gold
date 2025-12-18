package net.mcreator.idk.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class GoldSpearItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 44, 4f, 0, 22, TagKey.create(Registries.ITEM, ResourceLocation.parse("pjs_enhanced_gold_neoforge:gold_spear_repair_items")));

	public GoldSpearItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 4f, -2f));
	}
}