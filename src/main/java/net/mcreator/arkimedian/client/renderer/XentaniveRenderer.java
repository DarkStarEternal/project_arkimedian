
package net.mcreator.arkimedian.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.Minecraft;

import net.mcreator.arkimedian.procedures.XentaniveDisplayConditionProcedure;
import net.mcreator.arkimedian.entity.XentaniveEntity;
import net.mcreator.arkimedian.client.model.animations.xentaniveAnimation;
import net.mcreator.arkimedian.client.model.Modelxentanive;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class XentaniveRenderer extends MobRenderer<XentaniveEntity, Modelxentanive<XentaniveEntity>> {
	public XentaniveRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelxentanive.LAYER_LOCATION)), 0.2f);
		this.addLayer(new RenderLayer<XentaniveEntity, Modelxentanive<XentaniveEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("arkimedian:textures/entities/xentanive_tamed.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, XentaniveEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (XentaniveDisplayConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelxentanive(Minecraft.getInstance().getEntityModels().bakeLayer(Modelxentanive.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(XentaniveEntity entity) {
		return new ResourceLocation("arkimedian:textures/entities/xentanive.png");
	}

	private static final class AnimatedModel extends Modelxentanive<XentaniveEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<XentaniveEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(XentaniveEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animateWalk(xentaniveAnimation.Fly, limbSwing, limbSwingAmount, 1f, 2f);
				this.animate(entity.animationState1, xentaniveAnimation.attack, ageInTicks, 1f);
				this.animate(entity.animationState2, xentaniveAnimation.die, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(XentaniveEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}
