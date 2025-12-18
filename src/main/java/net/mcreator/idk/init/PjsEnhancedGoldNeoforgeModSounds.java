/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.idk.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.idk.PjsEnhancedGoldNeoforgeMod;

public class PjsEnhancedGoldNeoforgeModSounds {
	public static SoundEvent RIFLE_RELOAD;
	public static SoundEvent RIFLE_SHOOT;

	public static void load() {
		RIFLE_RELOAD = register("rifle_reload", SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("pjs_enhanced_gold_neoforge", "rifle_reload")));
		RIFLE_SHOOT = register("rifle_shoot", SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("pjs_enhanced_gold_neoforge", "rifle_shoot")));
	}

	private static SoundEvent register(String registryname, SoundEvent element) {
		return Registry.register(BuiltInRegistries.SOUND_EVENT, ResourceLocation.fromNamespaceAndPath(PjsEnhancedGoldNeoforgeMod.MODID, registryname), element);
	}
}