package net.hectus.hectusclient.client;

import net.fabricmc.api.ClientModInitializer;
import net.hectus.hectusclient.events.KeyInput;

public class HectusClientClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("Hectus Client client side component was started successfully!");

        KeyInput.register();
    }
}
