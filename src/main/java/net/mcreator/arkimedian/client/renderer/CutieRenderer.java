
package net.mcreator.arkimedian.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.arkimedian.entity.CutieEntity;
import net.mcreator.arkimedian.client.model.Modelfur_thing;

public class CutieRenderer extends MobRenderer<CutieEntity, Modelfur_thing<CutieEntity>> {
	public CutieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfur_thing<CutieEntity>(context.bakeLayer(Modelfur_thing.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CutieEntity entity) {
		return new ResourceLocation("arkimedian:textures/entities/cutie.png");
	}
}
