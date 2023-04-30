package net.hectus.hectusclient;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HectusClient implements ModInitializer {
    public static final String MOD_ID = "hectusclient";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        System.out.println("Hectus Client main component was started!");
    }
}
