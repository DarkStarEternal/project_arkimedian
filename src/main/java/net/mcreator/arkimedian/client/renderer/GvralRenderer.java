
package net.mcreator.arkimedian.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.arkimedian.entity.GvralEntity;
import net.mcreator.arkimedian.client.model.animations.gvral_soliderAnimation;
import net.mcreator.arkimedian.client.model.Modelgvral_solider;

public class GvralRenderer extends MobRenderer<GvralEntity, Modelgvral_solider<GvralEntity>> {
	public GvralRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelgvral_solider.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GvralEntity entity) {
		return new ResourceLocation("arkimedian:textures/entities/gvral_solider.png");
	}

	private static final class AnimatedModel extends Modelgvral_solider<GvralEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<GvralEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(GvralEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, gvral_soliderAnimation.Swordslash, ageInTicks, 1f);
				this.animate(entity.animationState1, gvral_soliderAnimation.Hurt, ageInTicks, 1f);
				this.animate(entity.animationState2, gvral_soliderAnimation.Death, ageInTicks, 2f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(GvralEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
