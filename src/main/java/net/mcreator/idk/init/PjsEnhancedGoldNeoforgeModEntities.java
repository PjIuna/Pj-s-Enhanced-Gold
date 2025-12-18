/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.idk.init;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.idk.entity.BulletEntity;
import net.mcreator.idk.PjsEnhancedGoldNeoforgeMod;

public class PjsEnhancedGoldNeoforgeModEntities {
	public static EntityType<BulletEntity> BULLET;

	public static void load() {
		BULLET = register("bullet", EntityType.Builder.<BulletEntity>of(BulletEntity::new, MobCategory.MISC).clientTrackingRange(64).updateInterval(1).sized(0.5f, 0.5f));
	}

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return Registry.register(BuiltInRegistries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(PjsEnhancedGoldNeoforgeMod.MODID, registryname),
				(EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(PjsEnhancedGoldNeoforgeMod.MODID, registryname))));
	}
}