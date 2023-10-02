package io.github.woodiertexas.owolib_annoyance_remover.mixin;

import com.mojang.blaze3d.platform.GlStateManager;
import io.wispforest.owo.compat.rei.OwoReiPlugin;
import io.wispforest.owo.ui.util.ScissorStack;
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
		ScissorStack.pushDirect(0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE);
		renderFunction.run();
		GlStateManager._enableScissorTest();
		ScissorStack.pop();
	}
}
