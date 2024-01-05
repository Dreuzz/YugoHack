package net.dreuzzz.yugohack;

import net.dreuzzz.yugohack.GUI.ClickGUI;
import net.dreuzzz.yugohack.event.KeyInput;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;

public class YugohackClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        KeyInput.register();

        HudRenderCallback.EVENT.register(new ClickGUI());
    }
}
