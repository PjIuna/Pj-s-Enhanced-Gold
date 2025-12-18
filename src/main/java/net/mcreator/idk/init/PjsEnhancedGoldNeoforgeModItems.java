/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.idk.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.idk.item.GoldSpearItem;
import net.mcreator.idk.item.GoldRifleFixedItem;
import net.mcreator.idk.item.GoldHandsawItem;
import net.mcreator.idk.item.GoldHammerItem;
import net.mcreator.idk.item.GoldBattleaxeItem;
import net.mcreator.idk.PjsEnhancedGoldNeoforgeMod;

import java.util.function.Function;

public class PjsEnhancedGoldNeoforgeModItems {
	public static Item GOLD_HAMMER;
	public static Item GOLD_SPEAR;
	public static Item GOLD_BATTLEAXE;
	public static Item GOLD_HANDSAW;
	public static Item GOLD_RIFLE_FIXED;

	public static void load() {
		GOLD_HAMMER = register("gold_hammer", GoldHammerItem::new);
		GOLD_SPEAR = register("gold_spear", GoldSpearItem::new);
		GOLD_BATTLEAXE = register("gold_battleaxe", GoldBattleaxeItem::new);
		GOLD_HANDSAW = register("gold_handsaw", GoldHandsawItem::new);
		GOLD_RIFLE_FIXED = register("gold_rifle_fixed", GoldRifleFixedItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> I register(String name, Function<Item.Properties, ? extends I> supplier) {
		return (I) Items.registerItem(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(PjsEnhancedGoldNeoforgeMod.MODID, name)), (Function<Item.Properties, Item>) supplier);
	}
}