// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelxentanive<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "xentanive"), "main");
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart bone5;
	private final ModelPart bone3;

	public Modelxentanive(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bone2 = this.bone.getChild("bone2");
		this.bone4 = this.bone.getChild("bone4");
		this.bone5 = this.bone.getChild("bone5");
		this.bone3 = this.bone.getChild("bone3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(4, 22)
				.addBox(-3.0F, 1.0F, 2.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 22).mirror()
				.addBox(2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(6, 22)
				.addBox(-3.0F, 1.0F, -1.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(6, 22).mirror()
				.addBox(2.0F, 1.0F, -1.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(8, 22)
				.addBox(-3.0F, 1.0F, 0.5F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(8, 22).mirror()
				.addBox(2.0F, 1.0F, 0.5F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 5)
				.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 21.0F, 0.0F));

		PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(18, 5).addBox(-1.0F,
				-1.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -2.0F));

		PartDefinition cube_r1 = bone2.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(18, 9)
						.addBox(0.0F, -6.0F, -2.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 20)
						.addBox(-1.0F, -6.0F, -2.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
						.addBox(0.0F, 1.0F, -2.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 20)
						.addBox(-1.0F, 1.0F, -2.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 14)
						.addBox(-2.0F, -3.0F, -2.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 1.0F, -2.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition bone4 = bone.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(-7, 25).addBox(-11.0F,
				0.0F, -1.0F, 11.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -1.0F, -1.0F));

		PartDefinition bone5 = bone.addOrReplaceChild("bone5",
				CubeListBuilder.create().texOffs(-7, 25).mirror()
						.addBox(0.0F, 0.0F, -1.0F, 11.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(2.0F, -1.0F, -1.0F));

		PartDefinition bone3 = bone.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offset(0.0F, -1.0F, 3.0F));

		PartDefinition cube_r2 = bone3.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(26, 29).addBox(0.0F, -1.0F, 4.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 1.7F, 0.7F, -0.1301F, 0.0009F, -0.0085F));

		PartDefinition cube_r3 = bone3.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 14).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 3.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 1.7F, 1.7F, -0.1301F, 0.0009F, -0.0085F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}