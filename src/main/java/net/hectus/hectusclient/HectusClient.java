package net.hectus.hectusclient;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.MinecraftClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HectusClient implements ModInitializer {
    public static final String MOD_ID = "hectusclient";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final MinecraftClient MC = MinecraftClient.getInstance();

    @Override
    public void onInitialize() {
        LOGGER.atInfo().log("The Hectus-Client has successfully loaded!");
    }
}
