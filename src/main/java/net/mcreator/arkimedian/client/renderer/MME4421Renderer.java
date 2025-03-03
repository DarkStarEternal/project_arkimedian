
package net.mcreator.arkimedian.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.arkimedian.entity.MME4421Entity;
import net.mcreator.arkimedian.client.model.Modelmmfourfourtwoone;

public class MME4421Renderer extends MobRenderer<MME4421Entity, Modelmmfourfourtwoone<MME4421Entity>> {
	public MME4421Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelmmfourfourtwoone<MME4421Entity>(context.bakeLayer(Modelmmfourfourtwoone.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MME4421Entity entity) {
		return new ResourceLocation("arkimedian:textures/entities/mmfourfourtwoone.png");
	}
}
