package net.mcreator.idk.init;

import net.mcreator.idk.PjsEnhancedGoldNeoforgeMod;
import net.mcreator.idk.item.GoldBattleaxeItem;
import net.mcreator.idk.item.GoldHammerItem;
import net.mcreator.idk.item.GoldHandsawItem;
import net.mcreator.idk.item.GoldRifleFixedItem;
import net.mcreator.idk.item.GoldRocketLauncherItem;
import net.mcreator.idk.item.GoldSpearItem;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class PjsEnhancedGoldNeoforgeModItems {
	public static final Item GOLD_HAMMER = register("gold_hammer", GoldHammerItem::new);
	public static final Item GOLD_SPEAR = register("gold_spear", GoldSpearItem::new);
	public static final Item GOLD_BATTLEAXE = register("gold_battleaxe", GoldBattleaxeItem::new);
	public static final Item GOLD_HANDSAW = register("gold_handsaw", GoldHandsawItem::new);
	public static final Item GOLD_RIFLE_FIXED = register("gold_rifle_fixed", GoldRifleFixedItem::new);
	public static final Item GOLD_ROCKET_LAUNCHER = register("gold_rocket_launcher", GoldRocketLauncherItem::new);
	public static final Item GOLD_SPIDER_SPAWN_EGG = register("gold_spider_spawn_egg",
			properties -> new Item(properties.spawnEgg(PjsEnhancedGoldNeoforgeModEntities.GOLD_SPIDER)));

	public static void load() {
	}

	private static Item register(String name, Function<Item.Properties, Item> itemFactory) {
		Identifier id = Identifier.fromNamespaceAndPath(PjsEnhancedGoldNeoforgeMod.MODID, name);
		ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, id);
		return Registry.register(BuiltInRegistries.ITEM, id, itemFactory.apply(new Item.Properties().setId(key)));
	}
}
