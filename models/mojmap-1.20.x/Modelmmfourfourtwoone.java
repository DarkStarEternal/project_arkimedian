// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmmfourfourtwoone<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mmfourfourtwoone"), "main");
	private final ModelPart siderocket;
	private final ModelPart siderocket2;
	private final ModelPart middlerocket;

	public Modelmmfourfourtwoone(ModelPart root) {
		this.siderocket = root.getChild("siderocket");
		this.siderocket2 = root.getChild("siderocket2");
		this.middlerocket = root.getChild("middlerocket");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition siderocket = partdefinition.addOrReplaceChild("siderocket",
				CubeListBuilder.create().texOffs(0, 85)
						.addBox(-6.0F, -47.0F, -6.0F, 12.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(88, 87)
						.addBox(-5.0F, -51.0F, -5.0F, 10.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(24, 100)
						.addBox(-3.0F, -55.0F, -3.0F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(96, 72)
						.addBox(-5.0F, -5.0F, -5.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(64, 0)
						.addBox(-7.0F, -44.0F, -7.0F, 14.0F, 39.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(48, 72)
						.addBox(-6.0F, -3.0F, -6.0F, 12.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-15.0F, 24.0F, 0.0F));

		PartDefinition siderocket2 = partdefinition.addOrReplaceChild("siderocket2",
				CubeListBuilder.create().texOffs(0, 85)
						.addBox(-6.0F, -47.0F, -6.0F, 12.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(88, 87)
						.addBox(-5.0F, -51.0F, -5.0F, 10.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(24, 100)
						.addBox(-3.0F, -55.0F, -3.0F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(96, 72)
						.addBox(-5.0F, -5.0F, -5.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(64, 0)
						.addBox(-7.0F, -44.0F, -7.0F, 14.0F, 39.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(48, 72)
						.addBox(-6.0F, -3.0F, -6.0F, 12.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(15.0F, 24.0F, 0.0F));

		PartDefinition middlerocket = partdefinition.addOrReplaceChild("middlerocket",
				CubeListBuilder.create().texOffs(0, 66)
						.addBox(-6.0F, -65.0F, -6.0F, 12.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(64, 53)
						.addBox(-7.0F, -58.0F, -7.0F, 14.0F, 5.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(48, 87)
						.addBox(-5.0F, -70.0F, -5.0F, 10.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 100)
						.addBox(-3.0F, -75.0F, -3.0F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = middlerocket
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -53.0F, -8.0F, 16.0F, 50.0F, 16.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		siderocket.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		siderocket2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		middlerocket.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}