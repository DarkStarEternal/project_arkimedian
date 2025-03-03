
package net.mcreator.arkimedian.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.arkimedian.entity.GrelhoundEntity;
import net.mcreator.arkimedian.client.model.animations.grelhoundAnimation;
import net.mcreator.arkimedian.client.model.Modelgrelhound;

public class GrelhoundRenderer extends MobRenderer<GrelhoundEntity, Modelgrelhound<GrelhoundEntity>> {
	public GrelhoundRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelgrelhound.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GrelhoundEntity entity) {
		return new ResourceLocation("arkimedian:textures/entities/grelhound.png");
	}

	private static final class AnimatedModel extends Modelgrelhound<GrelhoundEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<GrelhoundEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(GrelhoundEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, grelhoundAnimation.grelhounddeath, ageInTicks, 1f);
				this.animateWalk(grelhoundAnimation.grelhoundsprint, limbSwing, limbSwingAmount, 1f, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(GrelhoundEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
