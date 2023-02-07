package net.dypool01.tutorialmod;

import net.dypool01.tutorialmod.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class TutorialModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Below makes the eggplant crop see through
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.EGGPLANT_CROP, RenderLayer.getCutout());
    }
}
