package net.hectus.hectusclient.util;

import net.hectus.hectusclient.Configuration;
import net.hectus.hectusclient.HectusClient;
import net.hectus.hectusclient.mixins.MixinGameRendererZoom;
import net.minecraft.client.option.GameOptions;

public class Zoom {
    public static boolean isZooming = false;
    public static boolean wasSmoothCameraEnabled = false;

    public static void zoom() {
        isZooming = true;
        wasSmoothCameraEnabled = HectusClient.MC.options.smoothCameraEnabled;
        if (Configuration.Zoom.smooth) {
            HectusClient.MC.options.smoothCameraEnabled = true;
        }
    }

    public static void endZoom() {
        isZooming = false;
        if (wasSmoothCameraEnabled) {
            HectusClient.MC.options.smoothCameraEnabled = true;
        }
    }
}
