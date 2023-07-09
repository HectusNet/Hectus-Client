package net.hectus.hectusclient.events;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.hectus.hectusclient.Configuration;
import net.hectus.hectusclient.util.Zoom;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;

public class KeyInput {
    public static KeyBinding openClientMenuKey;
    public static KeyBinding zoomKey;

    public static void registerKeyInputs() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            ClientPlayerEntity player = client.player;
            if (player == null) return;

            if (openClientMenuKey.wasPressed()) {
                player.sendMessage(Text.of("You pressed the key to open the client menu!"));
            }

            if (Configuration.Zoom.enabled) {
                if (zoomKey.wasPressed() && !Zoom.isZooming) {
                    Zoom.zoom();
                } else if (Zoom.isZooming) {
                    Zoom.endZoom();
                }
            }
        });
    }

    public static void register() {
        openClientMenuKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.hectusclient.open_client_menu",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_RIGHT_SHIFT,
                "key.category.hectusclient.hectusclient"
        ));
        zoomKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.hectusclient.zoom",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_F,
                "key.category.hectusclient.hectusclient"
        ));

        registerKeyInputs();
    }
}
