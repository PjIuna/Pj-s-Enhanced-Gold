package net.mcreator.idk.init;

import net.mcreator.idk.PjsEnhancedGoldNeoforgeMod;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;

public class PjsEnhancedGoldNeoforgeModSounds {
	public static final SoundEvent RIFLE_SHOOT = register("rifle_shoot");
	public static final SoundEvent RIFLE_RELOAD = register("rifle_reload");
	public static final SoundEvent RPG_SHOOT = register("rpg_shoot");
	public static final SoundEvent RPG_LAUNCH = register("rpglaunch");
	public static final SoundEvent RPG_HIT = register("rpghit");

	public static void load() {
	}

	private static SoundEvent register(String name) {
		Identifier id = Identifier.fromNamespaceAndPath(PjsEnhancedGoldNeoforgeMod.MODID, name);
		return Registry.register(BuiltInRegistries.SOUND_EVENT, id, SoundEvent.createVariableRangeEvent(id));
	}
}
