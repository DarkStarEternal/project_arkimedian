// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelsynrillic<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "synrillic"), "main");
	private final ModelPart left_leg;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart bone5;
	private final ModelPart bone6;
	private final ModelPart right_leg;
	private final ModelPart bone7;
	private final ModelPart bone8;
	private final ModelPart bone9;
	private final ModelPart bone10;
	private final ModelPart bone11;
	private final ModelPart left_arm;
	private final ModelPart right_arm;
	private final ModelPart head;
	private final ModelPart bb_main;

	public Modelsynrillic(ModelPart root) {
		this.left_leg = root.getChild("left_leg");
		this.bone2 = this.left_leg.getChild("bone2");
		this.bone3 = this.left_leg.getChild("bone3");
		this.bone4 = this.left_leg.getChild("bone4");
		this.bone5 = this.left_leg.getChild("bone5");
		this.bone6 = this.left_leg.getChild("bone6");
		this.right_leg = root.getChild("right_leg");
		this.bone7 = this.right_leg.getChild("bone7");
		this.bone8 = this.right_leg.getChild("bone8");
		this.bone9 = this.right_leg.getChild("bone9");
		this.bone10 = this.right_leg.getChild("bone10");
		this.bone11 = this.right_leg.getChild("bone11");
		this.left_arm = root.getChild("left_arm");
		this.right_arm = root.getChild("right_arm");
		this.head = root.getChild("head");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(88, 70)
						.addBox(0.0F, 16.0F, -3.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(92, 76)
						.addBox(1.0F, 16.0F, -3.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(92, 82)
						.addBox(2.0F, 16.0F, -3.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 6.0F, -2.0F));

		PartDefinition cube_r1 = left_leg.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(20, 67)
						.addBox(-1.0F, -11.0F, -4.0F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(76, 78)
						.addBox(-2.0F, -11.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 8.5F, 4.5F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r2 = left_leg.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(60, 78).addBox(-2.0F, -11.0F, -2.0F, 4.0F, 11.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 18.0F, 2.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition bone2 = left_leg.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 18.0F, 0.0F));

		PartDefinition bone3 = left_leg.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offset(0.0F, 18.0F, 0.0F));

		PartDefinition bone4 = left_leg.addOrReplaceChild("bone4", CubeListBuilder.create(),
				PartPose.offset(0.0F, 18.0F, 0.0F));

		PartDefinition bone5 = left_leg.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offset(0.0F, 18.0F, 0.0F));

		PartDefinition bone6 = left_leg.addOrReplaceChild("bone6", CubeListBuilder.create(),
				PartPose.offset(0.0F, 18.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create()
				.texOffs(88, 70).mirror().addBox(0.0F, 16.0F, -3.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(92, 76).mirror()
				.addBox(-1.0F, 16.0F, -3.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(92, 82)
				.mirror().addBox(-2.0F, 16.0F, -3.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-5.0F, 6.0F, -2.0F));

		PartDefinition cube_r3 = right_leg.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(20, 67).mirror()
						.addBox(-2.0F, -11.0F, -4.0F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(76, 78).mirror()
						.addBox(-2.0F, -11.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 8.5F, 4.5F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r4 = right_leg.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(60, 78).mirror()
						.addBox(-2.0F, -11.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 18.0F, 2.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition bone7 = right_leg.addOrReplaceChild("bone7", CubeListBuilder.create(),
				PartPose.offset(0.0F, 18.0F, 0.0F));

		PartDefinition bone8 = right_leg.addOrReplaceChild("bone8", CubeListBuilder.create(),
				PartPose.offset(0.0F, 18.0F, 0.0F));

		PartDefinition bone9 = right_leg.addOrReplaceChild("bone9", CubeListBuilder.create(),
				PartPose.offset(0.0F, 18.0F, 0.0F));

		PartDefinition bone10 = right_leg.addOrReplaceChild("bone10", CubeListBuilder.create(),
				PartPose.offset(0.0F, 18.0F, 0.0F));

		PartDefinition bone11 = right_leg.addOrReplaceChild("bone11", CubeListBuilder.create(),
				PartPose.offset(0.0F, 18.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(),
				PartPose.offset(5.0F, 7.0F, -13.0F));

		PartDefinition cube_r5 = left_arm
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(18, 87).addBox(-1.0F, -3.0F, -2.0F, 3.0F, 9.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r6 = left_arm.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(60, 74)
						.addBox(0.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 93)
						.addBox(0.0F, 6.0F, -2.0F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(6, 93)
						.addBox(1.0F, 6.0F, -2.0F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(46, 87)
						.addBox(-1.0F, 0.0F, -2.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, -0.9599F, 0.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(),
				PartPose.offset(-5.0F, 7.0F, -13.0F));

		PartDefinition cube_r7 = right_arm.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(18, 87).mirror()
						.addBox(-2.0F, -3.0F, -2.0F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r8 = right_arm.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(60, 74)
				.mirror().addBox(-2.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 93).mirror().addBox(0.0F, 6.0F, -2.0F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(6, 93).mirror()
				.addBox(-1.0F, 6.0F, -2.0F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(46, 87)
				.mirror().addBox(-2.0F, 0.0F, -2.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, -0.9599F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(36, 50)
						.addBox(-3.5F, -3.0F, -8.0F, 7.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(82, 25)
						.addBox(-1.5F, -3.0F, -13.0F, 3.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 4.0F, -23.0F));

		PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(92, 92).addBox(-2.0F, 3.0F, -11.0F, 3.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.1F, 1.4F, -3.8F, 0.2262F, 0.6855F, 0.1447F));

		PartDefinition cube_r10 = head.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(92, 88).addBox(-1.0F, 3.0F, -11.0F, 3.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.1F, 1.4F, -3.8F, 0.2262F, -0.6855F, -0.1447F));

		PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(84, 21)
						.addBox(-1.0F, 3.0F, -11.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 38)
						.addBox(-3.0F, 3.0F, -9.0F, 7.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 1.0F, -2.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(84, 0).addBox(-2.0F, -3.0F, -4.0F, 3.0F, 7.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3F, 0.0F, -8.3F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r13 = head
				.addOrReplaceChild("cube_r13",
						CubeListBuilder.create().texOffs(82, 37).addBox(-1.0F, -3.0F, -4.0F, 3.0F, 7.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.3F, 0.0F, -8.3F, 0.0F, 0.3054F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 25)
						.addBox(-5.0F, -23.0F, -7.0F, 10.0F, 10.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-5.0F, -22.3F, -15.0F, 10.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(48, 25)
						.addBox(-5.0F, -20.9F, 6.6F, 10.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 81)
						.addBox(-1.6F, -20.9F, 13.6F, 3.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.6F, -19.9F, 19.6F, 3.0F, 4.0F, 21.0F, new CubeDeformation(0.0F)).texOffs(66, 50)
						.addBox(-3.0F, -22.3F, -23.0F, 6.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r14 = bb_main.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(84, 12).mirror()
						.addBox(-6.0F, -22.0F, -5.0F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(8.0F, -6.0F, 7.0F, 0.349F, 0.0038F, -0.5671F));

		PartDefinition cube_r15 = bb_main.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(68, 64).addBox(-3.0F, -22.0F, -1.0F, 2.0F, 6.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3F, -0.3F, -21.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r16 = bb_main.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(0, 67).addBox(1.0F, -22.0F, -1.0F, 2.0F, 6.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3F, -0.3F, -21.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r17 = bb_main.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(88, 64).addBox(-2.0F, 19.0F, 0.0F, 3.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4F, -34.5F, 15.2F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r18 = bb_main.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(30, 87).addBox(-2.0F, -20.0F, 0.0F, 3.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4F, -1.4F, 15.2F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r19 = bb_main.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(40, 74).addBox(-2.0F, -21.0F, 0.0F, 3.0F, 6.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3F, 0.1F, 12.6F, 0.0F, 0.5236F, 0.0F));

		PartDefinition cube_r20 = bb_main.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(20, 74).addBox(-1.0F, -21.0F, 0.0F, 3.0F, 6.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3F, 0.1F, 12.6F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r21 = bb_main.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(84, 12).addBox(2.0F, -22.0F, -5.0F, 4.0F, 4.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -6.0F, 7.0F, 0.349F, -0.0038F, 0.5671F));

		PartDefinition cube_r22 = bb_main.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(0, 58).addBox(-5.0F, -15.0F, -11.0F, 10.0F, 2.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.3F, 20.8F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r23 = bb_main.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(34, 65).addBox(-5.0F, -17.0F, -11.0F, 10.0F, 2.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.5F, 12.3F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r24 = bb_main.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(0, 49).addBox(-5.0F, -17.0F, -8.0F, 10.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.1F, -5.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r25 = bb_main.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(48, 14).addBox(-5.0F, -16.0F, -8.0F, 10.0F, 3.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.2F, -12.5F, -0.4363F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.right_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.left_arm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}