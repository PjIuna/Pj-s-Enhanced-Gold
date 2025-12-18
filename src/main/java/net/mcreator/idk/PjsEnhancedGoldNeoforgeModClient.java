package net.mcreator.idk;

import net.mcreator.idk.init.PjsEnhancedGoldNeoforgeModEntityRenderers;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.ClientModInitializer;

@Environment(EnvType.CLIENT)
public class PjsEnhancedGoldNeoforgeModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// Start of user code block mod constructor
		// End of user code block mod constructor
		PjsEnhancedGoldNeoforgeModEntityRenderers.clientLoad();
		// Start of user code block mod init
		// End of user code block mod init
	}
	// Start of user code block mod methods
	// End of user code block mod methods
}