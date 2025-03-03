
package net.mcreator.arkimedian.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.arkimedian.entity.SynriaEntity;
import net.mcreator.arkimedian.client.model.Modelsynrillic;

public class SynriaRenderer extends MobRenderer<SynriaEntity, Modelsynrillic<SynriaEntity>> {
	public SynriaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsynrillic<SynriaEntity>(context.bakeLayer(Modelsynrillic.LAYER_LOCATION)), 1.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SynriaEntity entity) {
		return new ResourceLocation("arkimedian:textures/entities/synrillic.png");
	}
}
