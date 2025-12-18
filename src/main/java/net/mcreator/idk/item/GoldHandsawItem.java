package net.mcreator.idk.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class GoldHandsawItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 50, 12f, 0, 22, TagKey.create(Registries.ITEM, ResourceLocation.parse("pjs_enhanced_gold_neoforge:gold_handsaw_repair_items")));

	public GoldHandsawItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 9f, -1f, properties);
	}
}