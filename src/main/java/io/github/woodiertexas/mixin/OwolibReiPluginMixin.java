package io.github.woodiertexas.mixin;

import io.wispforest.owo.compat.rei.OwoReiPlugin;
import net.minecraft.client.gui.screen.Screen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(OwoReiPlugin.class)
public class OwolibReiPluginMixin {
	/**
	 * @author woodiertexas
	 * @reason This messes with REI's UI whenever "froge" is written in the searchbar.
	 */
	@Overwrite(remap = false)
	private static void renderOverlay(Screen screen, Runnable renderFunction) {
		// no op
	}
}
