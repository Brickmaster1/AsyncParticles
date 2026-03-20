package fun.qu_an.minecraft.asyncparticles.client.mixin.particlerain;

import fun.qu_an.minecraft.asyncparticles.client.compat.particlerain.v4.ParticleRainAddon;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import pigcart.particlerain.config.ParticleData;
import pigcart.particlerain.particle.CustomParticle;

@Mixin(CustomParticle.class)
public abstract class MixinCustomParticle implements ParticleRainAddon {
	@Shadow(remap = false)
	public ParticleData opts;

	@Override
	public boolean asyncparticles$isNeedSkyAccess() {
		return opts.needsSkyAccess;
	}
}
