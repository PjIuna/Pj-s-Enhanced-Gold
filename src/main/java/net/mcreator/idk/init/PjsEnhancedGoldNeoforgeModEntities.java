package net.mcreator.idk.init;

import net.mcreator.idk.PjsEnhancedGoldNeoforgeMod;
import net.mcreator.idk.entity.BulletEntity;
import net.mcreator.idk.entity.GoldRocketProjEntity;
import net.mcreator.idk.entity.GoldSpiderEntity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class PjsEnhancedGoldNeoforgeModEntities {
	public static final EntityType<GoldSpiderEntity> GOLD_SPIDER = register("gold_spider",
			EntityType.Builder.of(GoldSpiderEntity::new, MobCategory.MONSTER).sized(1.4f, 0.9f).clientTrackingRange(8));
	public static final EntityType<BulletEntity> BULLET = register("bullet",
			EntityType.Builder.<BulletEntity>of(BulletEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(64).updateInterval(1));
	public static final EntityType<GoldRocketProjEntity> GOLD_ROCKET_PROJ = register("gold_rocket_proj",
			EntityType.Builder.<GoldRocketProjEntity>of(GoldRocketProjEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(64).updateInterval(1));

	public static void load() {
		FabricDefaultAttributeRegistry.register(GOLD_SPIDER, GoldSpiderEntity.createAttributes());
	}

	private static <T extends net.minecraft.world.entity.Entity> EntityType<T> register(String name, EntityType.Builder<T> builder) {
		Identifier id = Identifier.fromNamespaceAndPath(PjsEnhancedGoldNeoforgeMod.MODID, name);
		ResourceKey<EntityType<?>> key = ResourceKey.create(Registries.ENTITY_TYPE, id);
		return Registry.register(BuiltInRegistries.ENTITY_TYPE, id, builder.build(key));
	}
}
