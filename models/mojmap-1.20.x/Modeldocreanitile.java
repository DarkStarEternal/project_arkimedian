// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeldocreanitile<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "docreanitile"), "main");
	private final ModelPart Body;
	private final ModelPart Right_front_leg;
	private final ModelPart Left_front_leg;
	private final ModelPart Right_back_leg;
	private final ModelPart Left_back_leg;
	private final ModelPart Head;
	private final ModelPart Yaw;
	private final ModelPart Tail_1;
	private final ModelPart Tail_2;

	public Modeldocreanitile(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Right_front_leg = this.Body.getChild("Right_front_leg");
		this.Left_front_leg = this.Body.getChild("Left_front_leg");
		this.Right_back_leg = this.Body.getChild("Right_back_leg");
		this.Left_back_leg = this.Body.getChild("Left_back_leg");
		this.Head = this.Body.getChild("Head");
		this.Yaw = this.Head.getChild("Yaw");
		this.Tail_1 = this.Body.getChild("Tail_1");
		this.Tail_2 = this.Tail_1.getChild("Tail_2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-8.0F, -8.0F, -19.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(114, 81)
						.addBox(-1.0F, -19.0F, 6.0F, 2.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 83)
						.addBox(-1.0F, -18.0F, 9.0F, 2.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(42, 102)
						.addBox(-1.0F, -13.0F, 14.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(64, 27)
						.addBox(-1.0F, -10.0F, 16.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(110, 117)
						.addBox(-1.0F, -16.0F, 12.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 102)
						.addBox(-1.0F, -20.0F, -9.0F, 2.0F, 13.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(116, 36)
						.addBox(-1.0F, -19.0F, -12.0F, 2.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(100, 117)
						.addBox(-1.0F, -17.0F, -15.0F, 2.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(34, 102)
						.addBox(-1.0F, -15.0F, -17.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(116, 51)
						.addBox(-1.0F, -12.0F, -19.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-7.0F, -7.0F, -3.0F, 14.0F, 15.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.0F, -1.0F));

		PartDefinition Right_front_leg = Body.addOrReplaceChild("Right_front_leg",
				CubeListBuilder.create().texOffs(102, 97)
						.addBox(-7.0F, 10.0F, -4.0F, 8.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(116, 0)
						.addBox(-6.0F, -2.0F, -3.0F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, -5.0F, -15.0F));

		PartDefinition Left_front_leg = Body.addOrReplaceChild("Left_front_leg",
				CubeListBuilder.create().texOffs(102, 97).mirror()
						.addBox(-1.0F, 10.0F, -4.0F, 8.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(116, 0).mirror()
						.addBox(0.0F, -2.0F, -3.0F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(4.0F, -5.0F, -15.0F));

		PartDefinition Right_back_leg = Body.addOrReplaceChild("Right_back_leg",
				CubeListBuilder.create().texOffs(34, 112)
						.addBox(-7.0F, 10.0F, -4.0F, 8.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(116, 18)
						.addBox(-6.0F, -1.0F, -3.0F, 6.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, -5.0F, 9.0F));

		PartDefinition Left_back_leg = Body.addOrReplaceChild("Left_back_leg",
				CubeListBuilder.create().texOffs(34, 112).mirror()
						.addBox(-1.0F, 10.0F, -4.0F, 8.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(116, 18).mirror()
						.addBox(0.0F, -1.0F, -3.0F, 6.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(3.0F, -5.0F, 9.0F));

		PartDefinition Head = Body.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 63)
						.addBox(-7.0F, 0.0F, -16.0F, 14.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(50, 97)
						.addBox(-6.0F, 4.0F, -15.0F, 12.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 83)
						.addBox(-6.0F, -6.0F, -16.0F, 12.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(66, 112)
						.addBox(-7.0F, -7.0F, -3.0F, 14.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -1.0F, -19.0F));

		PartDefinition Yaw = Head.addOrReplaceChild("Yaw",
				CubeListBuilder.create().texOffs(60, 61)
						.addBox(-7.0F, 0.0F, -16.0F, 14.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(60, 81)
						.addBox(-6.0F, -1.0F, -15.0F, 12.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 4.0F, 0.0F));

		PartDefinition Tail_1 = Body.addOrReplaceChild("Tail_1", CubeListBuilder.create().texOffs(60, 32).addBox(-6.0F,
				-6.0F, 0.0F, 12.0F, 13.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 13.0F));

		PartDefinition Tail_2 = Tail_1.addOrReplaceChild("Tail_2", CubeListBuilder.create().texOffs(64, 0).addBox(-5.0F,
				-5.0F, 0.0F, 10.0F, 11.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 16.0F));

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