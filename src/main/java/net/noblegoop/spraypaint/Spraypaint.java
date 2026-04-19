package net.noblegoop.spraypaint;

import net.fabricmc.api.ModInitializer;

import net.noblegoop.spraypaint.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Spraypaint implements ModInitializer {
	public static final String MOD_ID = "spraypaint";

	@Override
	public void onInitialize() {
		ModItems.initialize();
	}
}