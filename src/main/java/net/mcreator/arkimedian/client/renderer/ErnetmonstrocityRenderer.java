
package net.mcreator.arkimedian.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.arkimedian.entity.ErnetmonstrocityEntity;
import net.mcreator.arkimedian.client.model.ModelAstrophage;

public class ErnetmonstrocityRenderer extends MobRenderer<ErnetmonstrocityEntity, ModelAstrophage<ErnetmonstrocityEntity>> {
	public ErnetmonstrocityRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelAstrophage<ErnetmonstrocityEntity>(context.bakeLayer(ModelAstrophage.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ErnetmonstrocityEntity entity) {
		return new ResourceLocation("arkimedian:textures/entities/astrophage.png");
	}
}
