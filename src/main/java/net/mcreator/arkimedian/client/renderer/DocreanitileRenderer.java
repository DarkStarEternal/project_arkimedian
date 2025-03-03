
package net.mcreator.arkimedian.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.arkimedian.procedures.DocreanitilePlaybackConditionProcedure;
import net.mcreator.arkimedian.entity.DocreanitileEntity;
import net.mcreator.arkimedian.client.model.animations.docreanitileAnimation;
import net.mcreator.arkimedian.client.model.Modeldocreanitile;

public class DocreanitileRenderer extends MobRenderer<DocreanitileEntity, Modeldocreanitile<DocreanitileEntity>> {
	public DocreanitileRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modeldocreanitile.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DocreanitileEntity entity) {
		return new ResourceLocation("arkimedian:textures/entities/docreanitile.png");
	}

	private static final class AnimatedModel extends Modeldocreanitile<DocreanitileEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<DocreanitileEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(DocreanitileEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animateWalk(docreanitileAnimation.Docreanitilewalk, limbSwing, limbSwingAmount, 1f, 1f);
				if (DocreanitilePlaybackConditionProcedure.execute(entity))
					this.animateWalk(docreanitileAnimation.Docreanitileswim, limbSwing, limbSwingAmount, 1f, 1f);
				this.animate(entity.animationState2, docreanitileAnimation.Docreanitiledeath, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(DocreanitileEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
