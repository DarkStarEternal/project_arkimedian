
package net.mcreator.arkimedian.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.arkimedian.entity.SicarionfighterEntity;
import net.mcreator.arkimedian.client.model.Modelsicarion_starship;

public class SicarionfighterRenderer extends MobRenderer<SicarionfighterEntity, Modelsicarion_starship<SicarionfighterEntity>> {
	public SicarionfighterRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsicarion_starship<SicarionfighterEntity>(context.bakeLayer(Modelsicarion_starship.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SicarionfighterEntity entity) {
		return new ResourceLocation("arkimedian:textures/entities/sicarion_arkimedian.png");
	}
}
