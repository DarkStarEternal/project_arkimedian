// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelgrelhound<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "grelhound"), "main");
	private final ModelPart Body;
	private final ModelPart Tail_part_1;
	private final ModelPart Tail_part_2;
	private final ModelPart Tail_part_3;
	private final ModelPart Head;
	private final ModelPart Right_ear;
	private final ModelPart Left_ear;
	private final ModelPart Lower_yaw;
	private final ModelPart Right_front_leg;
	private final ModelPart Left_front_leg;
	private final ModelPart Right_back_leg;
	private final ModelPart Left_back_leg;

	public Modelgrelhound(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Tail_part_1 = this.Body.getChild("Tail_part_1");
		this.Tail_part_2 = this.Tail_part_1.getChild("Tail_part_2");
		this.Tail_part_3 = this.Tail_part_2.getChild("Tail_part_3");
		this.Head = this.Body.getChild("Head");
		this.Right_ear = this.Head.getChild("Right_ear");
		this.Left_ear = this.Head.getChild("Left_ear");
		this.Lower_yaw = this.Head.getChild("Lower_yaw");
		this.Right_front_leg = this.Body.getChild("Right_front_leg");
		this.Left_front_leg = this.Body.getChild("Left_front_leg");
		this.Right_back_leg = this.Body.getChild("Right_back_leg");
		this.Left_back_leg = this.Body.getChild("Left_back_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 81)
				.addBox(-5.0F, -4.9557F, 6.3538F, 10.0F, 10.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(64, 0)
				.addBox(-6.0F, -5.9557F, -9.6462F, 12.0F, 12.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(0.0F, -17.9557F, -9.6462F, 0.0F, 13.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(0, 45)
				.addBox(-3.0F, -14.9557F, -5.6462F, 0.0F, 10.0F, 26.0F, new CubeDeformation(0.0F)).texOffs(52, 45)
				.addBox(3.0F, -14.9557F, -5.6462F, 0.0F, 10.0F, 26.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tail_part_1 = Body.addOrReplaceChild("Tail_part_1",
				CubeListBuilder.create().texOffs(0, 107)
						.addBox(0.0F, -8.0F, 1.0F, 0.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(102, 28)
						.addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -2.9557F, 21.3538F));

		PartDefinition Tail_part_2 = Tail_part_1.addOrReplaceChild("Tail_part_2", CubeListBuilder.create()
				.texOffs(52, 92).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 11.0F));

		PartDefinition Tail_part_3 = Tail_part_2.addOrReplaceChild("Tail_part_3", CubeListBuilder.create()
				.texOffs(82, 95).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 11.0F));

		PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(92, 110)
				.addBox(-2.0F, -2.1305F, -2.9914F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(104, 43)
				.addBox(-5.0F, -3.1305F, -6.9914F, 10.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 81)
				.addBox(-5.0F, 2.8695F, -15.9914F, 10.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(104, 58)
				.addBox(-4.0F, 4.8695F, -14.9914F, 8.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(90, 81)
				.addBox(-4.0F, -2.1305F, -15.9914F, 8.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, -9.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Right_ear = Head.addOrReplaceChild("Right_ear", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-4.0F, -3.1305F, -4.9914F, 0.0F, 0.0F, 0.0262F));

		PartDefinition cube_r1 = Right_ear.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(116, 75)
						.addBox(-2.0F, 2.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(106, 110)
						.addBox(-3.0F, 4.0F, -2.0F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -8.0F, 1.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition Left_ear = Head.addOrReplaceChild("Left_ear", CubeListBuilder.create(),
				PartPose.offsetAndRotation(4.0F, -3.1305F, -4.9914F, 0.0F, 0.0F, 0.0262F));

		PartDefinition cube_r2 = Left_ear.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(118, 110)
						.addBox(0.0F, 2.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(112, 95)
						.addBox(-1.0F, 4.0F, -2.0F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -8.0F, 1.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition Lower_yaw = Head.addOrReplaceChild("Lower_yaw",
				CubeListBuilder.create().texOffs(104, 67)
						.addBox(-4.0F, -2.0F, -8.0F, 8.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(64, 28)
						.addBox(-5.0F, -1.0F, -9.0F, 10.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.8695F, -6.9914F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Right_front_leg = Body.addOrReplaceChild("Right_front_leg",
				CubeListBuilder.create().texOffs(64, 40)
						.addBox(-4.0F, 8.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 107)
						.addBox(-4.5F, -3.0F, -2.5F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 1.0F, -5.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Right_front_leg.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(108, 117)
						.addBox(-1.0F, -10.0F, -1.0F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(92, 117)
						.addBox(-2.0F, -10.0F, -2.0F, 0.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(112, 102)
						.addBox(-3.0F, -10.0F, -1.0F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 15.0F, -13.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Right_front_leg.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(104, 75).addBox(-2.0F, -9.0F, 0.0F, 4.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 15.0F, -12.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Right_front_leg.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(60, 107).addBox(-2.0F, -9.0F, -2.0F, 4.0F, 9.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 17.0F, -2.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Left_front_leg = Body.addOrReplaceChild("Left_front_leg",
				CubeListBuilder.create().texOffs(64, 40).mirror()
						.addBox(0.0F, 8.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(20, 107).mirror()
						.addBox(-0.5F, -3.0F, -2.5F, 5.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(6.0F, 1.0F, -5.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Left_front_leg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(108, 117)
				.mirror().addBox(1.0F, -10.0F, -1.0F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(92, 117).mirror().addBox(2.0F, -10.0F, -2.0F, 0.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(112, 102).mirror()
				.addBox(3.0F, -10.0F, -1.0F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 15.0F, -13.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Left_front_leg.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(104, 75).mirror()
						.addBox(-2.0F, -9.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, 15.0F, -12.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r8 = Left_front_leg.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(60, 107).mirror()
						.addBox(-2.0F, -9.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, 17.0F, -2.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Right_back_leg = Body.addOrReplaceChild("Right_back_leg",
				CubeListBuilder.create().texOffs(80, 40)
						.addBox(-3.0F, 6.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 107)
						.addBox(-3.5F, -3.0F, -2.5F, 5.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 1.0F, 15.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Right_back_leg.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(118, 102)
						.addBox(-1.0F, -10.0F, -1.0F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(100, 117)
						.addBox(-2.0F, -10.0F, -2.0F, 0.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(114, 117)
						.addBox(-3.0F, -10.0F, -1.0F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(104, 78)
						.addBox(-4.0F, -9.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 12.0F, -12.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Right_back_leg.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(76, 110).addBox(-2.0F, -8.0F, -2.0F, 4.0F, 8.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 14.0F, -2.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Left_back_leg = Body.addOrReplaceChild("Left_back_leg",
				CubeListBuilder.create().texOffs(80, 40).mirror()
						.addBox(-1.0F, 6.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(40, 107).mirror()
						.addBox(-1.5F, -3.0F, -2.5F, 5.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(6.0F, 1.0F, 15.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r11 = Left_back_leg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(118, 102)
				.mirror().addBox(1.0F, -10.0F, -1.0F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(100, 117).mirror().addBox(2.0F, -10.0F, -2.0F, 0.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(114, 117).mirror()
				.addBox(3.0F, -10.0F, -1.0F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(104, 78)
				.mirror().addBox(0.0F, -9.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 12.0F, -12.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r12 = Left_back_leg.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(76, 110).mirror()
						.addBox(-2.0F, -8.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, 14.0F, -2.0F, -0.2618F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}