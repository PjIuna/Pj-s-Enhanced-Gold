package net.mcreator.idk.client;

import net.mcreator.idk.client.renderer.GoldSpiderRenderer;
import net.mcreator.idk.init.PjsEnhancedGoldNeoforgeModEntities;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

import net.minecraft.client.renderer.entity.NoopRenderer;

public class PjsEnhancedGoldNeoforgeModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		EntityRendererRegistry.register(PjsEnhancedGoldNeoforgeModEntities.GOLD_SPIDER, GoldSpiderRenderer::new);
		EntityRendererRegistry.register(PjsEnhancedGoldNeoforgeModEntities.BULLET, NoopRenderer::new);
		EntityRendererRegistry.register(PjsEnhancedGoldNeoforgeModEntities.GOLD_ROCKET_PROJ, NoopRenderer::new);
	}
}
