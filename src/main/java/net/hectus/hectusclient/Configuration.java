package net.hectus.hectusclient;

import java.awt.*;

public class Configuration {
    public static class GUI {
        public static boolean enabled = true;
        public static Color primaryColor;
        public static boolean darkMode = true;
    }

    public static class Zoom {
        public static boolean enabled = true;
        public static float multiplier = 1.5f;
        public static boolean smooth = true;
        public static Mode mode = Mode.FOV;

        public enum Mode { FOV, SCREEN }
    }
}
