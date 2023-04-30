package net.hectus.hectusclient.events;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.hectus.hectusclient.HectusClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;

public class KeyInput {
    public static final String KEY_CATEGORY_HECTUS_CLIENT = "key.category.hectusclient.hectusclient";
    public static final String KEY_OPEN_CLIENT_MENU = "key.hectusclient.open_client_menu";
    public static final String KEY_OPEN_CLIENT_MENU_FEEDBACK = "key.hectusclient.open_client_menu.feedback";

    public static KeyBinding openClientMenuKey;

    public static void registerKeyInputs() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (openClientMenuKey.wasPressed()) {
                HectusClient.LOGGER.atInfo().log("Client pressed " + KEY_OPEN_CLIENT_MENU);

                if (client.player == null) {
                    HectusClient.LOGGER.atWarn().log("Something went wrong while sending a message to the client!");
                    return;
                }

                client.player.sendMessage(Text.of(KEY_OPEN_CLIENT_MENU_FEEDBACK));
            }
        });
    }

    public static void register() {
        openClientMenuKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                KEY_OPEN_CLIENT_MENU,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_RIGHT_SHIFT,
                KEY_CATEGORY_HECTUS_CLIENT
        ));

        registerKeyInputs();
    }
}
