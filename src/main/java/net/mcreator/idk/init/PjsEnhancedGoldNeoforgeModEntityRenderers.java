/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.idk.init;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class PjsEnhancedGoldNeoforgeModEntityRenderers {
	public static void clientLoad() {
		EntityRendererRegistry.register(PjsEnhancedGoldNeoforgeModEntities.BULLET, ThrownItemRenderer::new);
	}
}