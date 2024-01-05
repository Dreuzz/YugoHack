package net.dreuzzz.yugohack.GUI;

import com.mojang.blaze3d.systems.RenderSystem;
import net.dreuzzz.yugohack.YugoHack;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawableHelper;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

import static net.dreuzzz.yugohack.event.KeyInput.ClickGuiKey;
import static net.dreuzzz.yugohack.event.KeyInput.RegisterKeyInput;

public class ClickGUI implements HudRenderCallback {

    private static final Identifier CLICK_GUI = new Identifier(YugoHack.MOD_ID,
            "textures/gui.png");

    private static boolean guiVisible = true;
    @Override
    public void onHudRender(MatrixStack matrixStack, float tickDelta) {
        while (ClickGuiKey.isPressed()) {
            guiVisible = !guiVisible;
        }
            int x = 0;
            int y = 0;
            MinecraftClient client = MinecraftClient.getInstance();
            if (client != null) {
                int width = client.getWindow().getScaledWidth();
                int height = client.getWindow().getScaledHeight();

                x = width / 2;
                y = height;
            }
            RenderSystem.setShader(GameRenderer::getPositionTexShader);
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
            RenderSystem.setShaderTexture(0, CLICK_GUI);

            for (int i = 0; i < 1; i++) {
                DrawableHelper.drawTexture(matrixStack, x - 94 + (i * 9), y - 54, 0, 0, 128, 128, 128, 128);

                RegisterKeyInput();

            
            }
        }
    }
