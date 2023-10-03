package io.github.woodiertexas.owolib_patches.mixin;

import io.wispforest.owo.util.Wisdom;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(Wisdom.class)
public class OwolibWisdomMixin {
	/**
	 * @author woodiertexas
	 * @reason owolib's Wisdom.class has advertisements for other mods.
	 */
	@Overwrite(remap = false)
	public static void spread() {
		// no op
	}
}
