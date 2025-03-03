
package net.mcreator.arkimedian.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.Minecraft;

import net.mcreator.arkimedian.procedures.GnirilionDisplayConditionProcedure;
import net.mcreator.arkimedian.entity.GnirilionEntity;
import net.mcreator.arkimedian.client.model.animations.gnirilionAnimation;
import net.mcreator.arkimedian.client.model.Modelgnirilion;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class GnirilionRenderer extends MobRenderer<GnirilionEntity, Modelgnirilion<GnirilionEntity>> {
	public GnirilionRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelgnirilion.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<GnirilionEntity, Modelgnirilion<GnirilionEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("arkimedian:textures/entities/gnirilion_rolled.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, GnirilionEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (GnirilionDisplayConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelgnirilion(Minecraft.getInstance().getEntityModels().bakeLayer(Modelgnirilion.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
				}
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(GnirilionEntity entity) {
		return new ResourceLocation("arkimedian:textures/entities/gnirilion_unrolled.png");
	}

	private static final class AnimatedModel extends Modelgnirilion<GnirilionEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<GnirilionEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(GnirilionEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				if (GnirilionDisplayConditionProcedure.execute(entity))
					this.animateWalk(gnirilionAnimation.Rolling, limbSwing, limbSwingAmount, 1f, 1f);
				this.animateWalk(gnirilionAnimation.Walk, limbSwing, limbSwingAmount, 1f, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(GnirilionEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
