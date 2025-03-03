// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelgnirilion<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "gnirilion"), "main");
	private final ModelPart Rolled;
	private final ModelPart Body;
	private final ModelPart Head;
	private final ModelPart Back_left_leg4;
	private final ModelPart Back_right_leg3;
	private final ModelPart Front_right_leg2;
	private final ModelPart Front_left_leg;

	public Modelgnirilion(ModelPart root) {
		this.Rolled = root.getChild("Rolled");
		this.Body = root.getChild("Body");
		this.Head = this.Body.getChild("Head");
		this.Back_left_leg4 = this.Body.getChild("Back_left_leg4");
		this.Back_right_leg3 = this.Body.getChild("Back_right_leg3");
		this.Front_right_leg2 = this.Body.getChild("Front_right_leg2");
		this.Front_left_leg = this.Body.getChild("Front_left_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Rolled = partdefinition.addOrReplaceChild("Rolled", CubeListBuilder.create().texOffs(0, 35)
				.addBox(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 16.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(64, 35)
						.addBox(-6.0F, -9.0F, -6.0F, 12.0F, 13.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -10.0F, -7.0F, 16.0F, 15.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 18.0F, -3.0F));

		PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(64, 66).addBox(-3.0F,
				-3.0F, -7.0F, 6.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, -6.0F));

		PartDefinition cube_r1 = Head
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(0, 67).addBox(-3.0F, -1.0F, -6.0F, 6.0F, 2.0F, 7.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 2.0F, -1.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Back_left_leg4 = Body.addOrReplaceChild("Back_left_leg4", CubeListBuilder.create()
				.texOffs(72, 13).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, -1.0F, 9.0F));

		PartDefinition Back_right_leg3 = Body.addOrReplaceChild("Back_right_leg3", CubeListBuilder.create()
				.texOffs(72, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, -1.0F, 9.0F));

		PartDefinition Front_right_leg2 = Body.addOrReplaceChild("Front_right_leg2", CubeListBuilder.create()
				.texOffs(42, 67).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, -1.0F, -3.0F));

		PartDefinition Front_left_leg = Body.addOrReplaceChild("Front_left_leg", CubeListBuilder.create()
				.texOffs(26, 67).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, -1.0F, -3.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Rolled.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}