package net.hectus.hectusclient.mixins;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.hectus.hectusclient.Configuration;
import net.hectus.hectusclient.util.Zoom;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.GameRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin(GameRenderer.class)
public class MixinGameRendererZoom {
    @Inject(method = "getFov", at = @At("RETURN"), cancellable = true)
    private void modifyFOV(Camera camera, float tickDelta, boolean changingFov, CallbackInfoReturnable<Float> cir) {
        if (Zoom.isZooming) {
            float originalFov = cir.getReturnValue();
            float modifiedFov = originalFov / Configuration.Zoom.multiplier;
            cir.setReturnValue(modifiedFov);
        }
    }
}
