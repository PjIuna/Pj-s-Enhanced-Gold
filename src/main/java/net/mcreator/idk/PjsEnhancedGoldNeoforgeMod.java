package net.mcreator.idk;

import net.mcreator.idk.entity.GoldSpiderEntity;
import net.mcreator.idk.init.PjsEnhancedGoldNeoforgeModEntities;
import net.mcreator.idk.init.PjsEnhancedGoldNeoforgeModItems;
import net.mcreator.idk.init.PjsEnhancedGoldNeoforgeModSounds;
import net.mcreator.idk.init.PjsEnhancedGoldNeoforgeModTabs;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;

import java.util.ArrayList;
import java.util.List;

public class PjsEnhancedGoldNeoforgeMod implements ModInitializer {
	public static final String MODID = "pjs_enhanced_gold_neoforge";
	private static final List<ScheduledWork> SERVER_WORK_QUEUE = new ArrayList<>();

	@Override
	public void onInitialize() {
		PjsEnhancedGoldNeoforgeModSounds.load();
		PjsEnhancedGoldNeoforgeModEntities.load();
		PjsEnhancedGoldNeoforgeModItems.load();
		PjsEnhancedGoldNeoforgeModTabs.load();
		GoldSpiderEntity.init();
		ServerTickEvents.END_SERVER_TICK.register(server -> tick());
	}

	public static void queueServerWork(int tick, Runnable action) {
		SERVER_WORK_QUEUE.add(new ScheduledWork(tick, action));
	}

	public static void tick() {
		SERVER_WORK_QUEUE.removeIf(work -> {
			if (work.tick-- <= 0) {
				work.action.run();
				return true;
			}
			return false;
		});
	}

	private static class ScheduledWork {
		private int tick;
		private final Runnable action;

		private ScheduledWork(int tick, Runnable action) {
			this.tick = tick;
			this.action = action;
		}
	}
}
