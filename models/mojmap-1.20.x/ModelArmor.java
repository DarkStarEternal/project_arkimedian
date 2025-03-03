// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelArmor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "armor"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public ModelArmor(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.6F)).texOffs(96, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.55F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 16)
						.addBox(-4.0F, 1.0F, -2.0F, 8.0F, 11.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(32, 55)
						.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.8F)).texOffs(0, 58)
						.addBox(-1.0F, 8.0F, -2.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.6F)).texOffs(16, 43)
						.addBox(-4.0F, 0.0F, -3.0F, 3.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(46, 61)
						.addBox(-4.0F, 9.0F, -2.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.5F)).texOffs(58, 61)
						.addBox(2.0F, 9.0F, -2.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.5F)).texOffs(34, 43)
						.addBox(1.0F, 0.0F, -3.0F, 3.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(24, 27)
				.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(16, 55)
				.addBox(-3.0F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.4F)).texOffs(48, 0)
				.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.5F)).texOffs(0, 48).mirror()
				.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.6F)).mirror(false),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(24, 27)
				.mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)).mirror(false)
				.texOffs(0, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.6F)).texOffs(16, 55)
				.mirror().addBox(-1.0F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.4F)).mirror(false),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(32, 0)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(52, 52)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.5F)).texOffs(56, 29)
						.addBox(-2.0F, 6.0F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.4F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(32, 0)
				.mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)).mirror(false)
				.texOffs(52, 52).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.5F))
				.mirror(false).texOffs(56, 29).mirror()
				.addBox(-1.0F, 6.0F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.4F)).mirror(false),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}