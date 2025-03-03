// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmentriolite_golem<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mentriolite_golem"), "main");
	private final ModelPart Body;
	private final ModelPart Crystal4;
	private final ModelPart Crystal7;
	private final ModelPart Crystal3;
	private final ModelPart Crystal2;
	private final ModelPart Right_Arm;
	private final ModelPart Crystal;
	private final ModelPart Crystal5;
	private final ModelPart Left_Arm;
	private final ModelPart Crystal8;
	private final ModelPart Crystal9;
	private final ModelPart Left_leg;
	private final ModelPart Crystal6;
	private final ModelPart Right_leg;

	public Modelmentriolite_golem(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Crystal4 = this.Body.getChild("Crystal4");
		this.Crystal7 = this.Body.getChild("Crystal7");
		this.Crystal3 = this.Body.getChild("Crystal3");
		this.Crystal2 = this.Body.getChild("Crystal2");
		this.Right_Arm = this.Body.getChild("Right_Arm");
		this.Crystal = this.Right_Arm.getChild("Crystal");
		this.Crystal5 = this.Right_Arm.getChild("Crystal5");
		this.Left_Arm = this.Body.getChild("Left_Arm");
		this.Crystal8 = this.Left_Arm.getChild("Crystal8");
		this.Crystal9 = this.Left_Arm.getChild("Crystal9");
		this.Left_leg = this.Body.getChild("Left_leg");
		this.Crystal6 = this.Left_leg.getChild("Crystal6");
		this.Right_leg = this.Body.getChild("Right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(40, 18)
						.addBox(-3.0F, -28.0F, -5.5F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -27.0F, -3.5F, 12.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-5.0F, -17.0F, -3.0F, 10.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Crystal4 = Body.addOrReplaceChild("Crystal4",
				CubeListBuilder.create().texOffs(54, 56).addBox(-2.0F, 0.8F, -2.0F, 4.0F, 7.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -19.8F, -5.0F, 0.5644F, -0.1087F, 0.3415F));

		PartDefinition cube_r1 = Crystal4
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(62, 67).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 3.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Crystal7 = Body.addOrReplaceChild("Crystal7",
				CubeListBuilder.create().texOffs(40, 30).addBox(-2.0F, 0.8F, -2.0F, 4.0F, 11.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -26.8F, 6.0F, -0.443F, -0.2261F, 0.104F));

		PartDefinition cube_r2 = Crystal7
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(70, 47).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 3.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Crystal3 = Body.addOrReplaceChild("Crystal3",
				CubeListBuilder.create().texOffs(56, 30).addBox(-2.0F, 0.8F, -2.0F, 4.0F, 7.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -30.8F, 5.0F, -0.4828F, -0.1087F, 0.3415F));

		PartDefinition cube_r3 = Crystal3
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(48, 67).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 3.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Crystal2 = Body.addOrReplaceChild("Crystal2",
				CubeListBuilder.create().texOffs(54, 45).addBox(-2.0F, 0.8F, -2.0F, 4.0F, 7.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -28.8F, 6.0F, -0.7522F, -0.3463F, -0.189F));

		PartDefinition cube_r4 = Crystal2
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(34, 66).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 3.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Right_Arm = Body.addOrReplaceChild("Right_Arm", CubeListBuilder.create().texOffs(0, 29)
				.addBox(-2.0F, -5.2F, 2.5F, 5.0F, 19.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-9.0F, -20.8F, -5.0F));

		PartDefinition cube_r5 = Right_Arm.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(40, 45)
						.addBox(-2.0F, -5.0F, -4.0F, 2.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(16, 60)
						.addBox(0.0F, -5.0F, -4.0F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -2.2F, 6.5F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r6 = Right_Arm.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(58, 11)
						.addBox(0.0F, -5.0F, -4.0F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(34, 60)
						.addBox(1.0F, -4.0F, -4.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(64, 23)
						.addBox(3.0F, -2.0F, -4.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(64, 17)
						.addBox(2.0F, -3.0F, -4.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -3.5F, 6.5F, 0.0F, 0.0F, -0.7854F));

		PartDefinition Crystal = Right_Arm.addOrReplaceChild("Crystal",
				CubeListBuilder.create().texOffs(40, 30).addBox(-2.0F, -7.0F, -2.0F, 4.0F, 9.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.8F, 4.0F, 0.4331F, 0.0552F, -0.1188F));

		PartDefinition cube_r7 = Crystal
				.addOrReplaceChild("cube_r7",
						CubeListBuilder.create().texOffs(62, 67).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 3.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -7.8F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Crystal5 = Right_Arm.addOrReplaceChild("Crystal5",
				CubeListBuilder.create().texOffs(40, 30).addBox(-2.0F, -7.0F, -2.0F, 4.0F, 9.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.8F, 6.0F, -0.5719F, -0.6897F, -0.6214F));

		PartDefinition cube_r8 = Crystal5
				.addOrReplaceChild("cube_r8",
						CubeListBuilder.create().texOffs(62, 67).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 3.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -7.8F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Left_Arm = Body.addOrReplaceChild("Left_Arm",
				CubeListBuilder.create().texOffs(0, 29).mirror()
						.addBox(-3.0F, -5.2F, 2.5F, 5.0F, 19.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(9.0F, -20.8F, -5.0F));

		PartDefinition cube_r9 = Left_Arm.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(40, 45).mirror()
				.addBox(0.0F, -5.0F, -4.0F, 2.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(16, 60)
				.mirror().addBox(-4.0F, -5.0F, -4.0F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, -2.2F, 6.5F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r10 = Left_Arm.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(58, 11)
				.mirror().addBox(-5.0F, -5.0F, -4.0F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(34, 60).mirror().addBox(-5.0F, -4.0F, -4.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(64, 23).mirror()
				.addBox(-5.0F, -2.0F, -4.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(64, 17)
				.mirror().addBox(-5.0F, -3.0F, -4.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.5F, -3.5F, 6.5F, 0.0F, 0.0F, 0.7854F));

		PartDefinition Crystal8 = Left_Arm.addOrReplaceChild("Crystal8",
				CubeListBuilder.create().texOffs(40, 30).mirror()
						.addBox(-2.0F, -7.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.8F, 4.0F, 0.4331F, -0.0552F, 0.1188F));

		PartDefinition cube_r11 = Crystal8.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(62, 67).mirror()
						.addBox(-2.0F, -1.0F, -2.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -7.8F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Crystal9 = Left_Arm.addOrReplaceChild("Crystal9",
				CubeListBuilder.create().texOffs(40, 30).mirror()
						.addBox(-2.0F, -7.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.8F, 6.0F, -0.5719F, 0.6897F, 0.6214F));

		PartDefinition cube_r12 = Crystal9.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(62, 67).mirror()
						.addBox(-2.0F, -1.0F, -2.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -7.8F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Left_leg = Body.addOrReplaceChild("Left_leg", CubeListBuilder.create().texOffs(38, 0).addBox(
				-2.0F, -13.0F, -3.0F, 5.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 0.0F, 0.5F));

		PartDefinition Crystal6 = Left_leg.addOrReplaceChild("Crystal6",
				CubeListBuilder.create().texOffs(40, 30).addBox(-2.0F, 0.8F, -2.0F, 4.0F, 7.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -10.8F, 4.5F, -0.7086F, -0.3463F, -0.189F));

		PartDefinition cube_r13 = Crystal6
				.addOrReplaceChild("cube_r13",
						CubeListBuilder.create().texOffs(62, 67).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 3.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Right_leg = Body.addOrReplaceChild("Right_leg", CubeListBuilder.create().texOffs(20, 29)
				.addBox(-3.0F, -13.0F, -3.0F, 5.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 0.0F, 0.5F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Left_Arm.yRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.Right_Arm.yRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}