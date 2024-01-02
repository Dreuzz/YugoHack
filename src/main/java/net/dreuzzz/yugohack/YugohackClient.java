package net.dreuzzz.yugohack;

import net.dreuzzz.yugohack.event.KeyInput;
import net.fabricmc.api.ClientModInitializer;

public class YugohackClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        KeyInput.register();
    }
}
