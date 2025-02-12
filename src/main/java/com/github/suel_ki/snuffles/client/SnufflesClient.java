package com.github.suel_ki.snuffles.client;

import com.github.suel_ki.snuffles.client.particle.SnufflesParticleFactories;
import com.github.suel_ki.snuffles.client.renderer.SnufflesModelLayers;
import com.github.suel_ki.snuffles.client.renderer.SnufflesRenderers;
import com.github.suel_ki.snuffles.core.registry.SnufflesBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class SnufflesClient  implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        SnufflesBlocks.clientInit();
        SnufflesModelLayers.registerLayers();
        SnufflesRenderers.rendererEntityRenderers();
        SnufflesParticleFactories.registerParticleFactories();
    }

}
