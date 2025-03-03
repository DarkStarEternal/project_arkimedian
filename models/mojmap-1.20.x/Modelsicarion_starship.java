// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelsicarion_starship<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "sicarion_starship"), "main");
	private final ModelPart Ship_body;
	private final ModelPart Cokpit_glass;
	private final ModelPart Control_panel;
	private final ModelPart Sicarion_engine;
	private final ModelPart Left_wing;
	private final ModelPart Right_wing;
	private final ModelPart Left_wing_back;
	private final ModelPart Top_fin;
	private final ModelPart Right_wing_back;

	public Modelsicarion_starship(ModelPart root) {
		this.Ship_body = root.getChild("Ship_body");
		this.Cokpit_glass = this.Ship_body.getChild("Cokpit_glass");
		this.Control_panel = this.Ship_body.getChild("Control_panel");
		this.Sicarion_engine = this.Ship_body.getChild("Sicarion_engine");
		this.Left_wing = this.Ship_body.getChild("Left_wing");
		this.Right_wing = this.Ship_body.getChild("Right_wing");
		this.Left_wing_back = this.Ship_body.getChild("Left_wing_back");
		this.Top_fin = this.Ship_body.getChild("Top_fin");
		this.Right_wing_back = this.Ship_body.getChild("Right_wing_back");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Ship_body = partdefinition.addOrReplaceChild("Ship_body",
				CubeListBuilder.create().texOffs(222, 268)
						.addBox(6.0F, -5.0F, -30.0F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(252, 319)
						.addBox(-7.0F, -5.0F, -30.0F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, 8.0F, -30.0F, 16.0F, 1.0F, 68.0F, new CubeDeformation(0.0F)).texOffs(232, 193)
						.addBox(-7.0F, 7.0F, 38.0F, 14.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(278, 193)
						.addBox(-6.0F, 6.0F, 47.0F, 12.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(280, 139)
						.addBox(-6.0F, -13.0F, 47.0F, 12.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 214)
						.addBox(-7.0F, -14.0F, 9.0F, 14.0F, 1.0F, 38.0F, new CubeDeformation(0.0F)).texOffs(322, 159)
						.addBox(-6.0F, -12.0F, 56.0F, 12.0F, 19.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(202, 340)
						.addBox(-6.0F, -12.0F, 59.0F, 12.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(314, 341)
						.addBox(-6.0F, 1.0F, 59.0F, 12.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(344, 288)
						.addBox(-4.0F, -7.0F, 59.0F, 8.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(90, 253)
						.addBox(4.0F, -7.0F, 59.0F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(90, 265)
						.addBox(-6.0F, -7.0F, 59.0F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 69)
						.addBox(-9.0F, -6.0F, -30.0F, 2.0F, 14.0F, 68.0F, new CubeDeformation(0.0F)).texOffs(80, 323)
						.addBox(5.0F, -12.0F, 47.0F, 2.0F, 18.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(58, 323)
						.addBox(-7.0F, -12.0F, 47.0F, 2.0F, 18.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(134, 288)
						.addBox(6.0F, -13.0F, 9.0F, 2.0F, 6.0F, 29.0F, new CubeDeformation(0.0F)).texOffs(72, 288)
						.addBox(-8.0F, -13.0F, 9.0F, 2.0F, 6.0F, 29.0F, new CubeDeformation(0.0F)).texOffs(322, 288)
						.addBox(-8.0F, -13.0F, 38.0F, 2.0F, 20.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(104, 214)
						.addBox(6.0F, -13.0F, 38.0F, 2.0F, 20.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(280, 114)
						.addBox(-8.0F, -7.0F, -30.0F, 16.0F, 1.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(102, 323)
						.addBox(7.0F, -7.0F, -6.0F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(134, 323)
						.addBox(-8.0F, -7.0F, -6.0F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(252, 332)
						.addBox(-1.0F, 0.0F, -33.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(166, 323)
						.addBox(-6.0F, -5.0F, -29.0F, 12.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(152, 345)
						.addBox(-2.0F, 0.0F, -32.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(190, 286)
						.addBox(-7.0F, 7.0F, -30.0F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(280, 149)
						.addBox(-7.0F, -6.0F, -30.0F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(344, 298)
						.addBox(-1.0F, -1.0F, -32.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(124, 344)
						.addBox(-2.0F, -1.0F, -30.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(140, 69)
						.addBox(7.0F, -6.0F, -30.0F, 2.0F, 14.0F, 68.0F, new CubeDeformation(0.0F)).texOffs(146, 345)
						.addBox(1.0F, 0.0F, -32.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 253)
						.addBox(-8.0F, -7.0F, 9.0F, 16.0F, 1.0F, 29.0F, new CubeDeformation(0.0F)).texOffs(488, 506)
						.addBox(-6.0F, -13.0F, 10.0F, 12.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 15.0F, -1.0F));

		PartDefinition cube_r1 = Ship_body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(190, 249).addBox(-7.0F, 4.0F, -52.0F, 14.0F, 16.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 61.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Cokpit_glass = Ship_body.addOrReplaceChild("Cokpit_glass", CubeListBuilder.create()
				.texOffs(168, 47).addBox(-8.0F, 0.0F, -16.0F, 16.0F, 6.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -13.0F, 9.0F));

		PartDefinition cube_r2 = Cokpit_glass.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(312, 276)
						.addBox(-8.0F, -6.0F, -8.0F, 16.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(320, 214)
						.addBox(-8.0F, -6.0F, 0.0F, 16.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.4F, -21.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition Control_panel = Ship_body.addOrReplaceChild("Control_panel",
				CubeListBuilder.create().texOffs(58, 316)
						.addBox(-7.0F, -11.0F, -4.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(238, 338)
						.addBox(-10.0F, -11.0F, 1.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(222, 281)
						.addBox(-11.0F, -13.0F, 1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(256, 319)
						.addBox(-2.0F, -13.0F, 1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(268, 45)
						.addBox(-3.0F, -12.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(272, 45)
						.addBox(-3.0F, -9.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(276, 45)
						.addBox(-10.0F, -9.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(310, 149)
						.addBox(-10.0F, -12.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, 9.0F, -5.0F));

		PartDefinition cube_r3 = Control_panel.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(256, 326).addBox(4.0F, -1.0F, -4.0F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.3F, -9.8F, 5.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r4 = Control_panel.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(124, 246).addBox(4.0F, -1.0F, -4.0F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.3F, -10.2F, 5.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r5 = Control_panel.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(256, 329).addBox(-5.0F, -1.0F, -4.0F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.7F, -9.8F, 5.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r6 = Control_panel.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(124, 243).addBox(-5.0F, -1.0F, -4.0F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.7F, -10.2F, 5.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r7 = Control_panel
				.addOrReplaceChild("cube_r7",
						CubeListBuilder.create().texOffs(190, 268).addBox(-13.0F, -16.0F, -1.0F, 14.0F, 16.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Sicarion_engine = Ship_body.addOrReplaceChild("Sicarion_engine",
				CubeListBuilder.create().texOffs(196, 319)
						.addBox(-7.0F, -2.0F, -7.0F, 14.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(232, 47)
						.addBox(-5.0F, -10.0F, -6.0F, 10.0F, 8.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(320, 243)
						.addBox(-5.0F, -4.0F, -7.0F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(344, 304)
						.addBox(-5.0F, -8.0F, -7.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(344, 309)
						.addBox(2.0F, -8.0F, -7.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(344, 314)
						.addBox(-1.0F, -7.0F, -7.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(238, 335)
						.addBox(-5.0F, -10.0F, -7.0F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(320, 228)
						.addBox(-3.0F, -11.0F, -7.0F, 6.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(190, 323)
						.addBox(-7.0F, -8.0F, 6.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 283)
						.addBox(-7.0F, -8.0F, 1.0F, 14.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(166, 335)
						.addBox(-7.0F, -4.0F, -6.0F, 14.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(138, 340)
						.addBox(-7.0F, -9.0F, -6.0F, 14.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(102, 339)
						.addBox(-7.0F, -4.0F, 2.0F, 14.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(202, 335)
						.addBox(-7.0F, -9.0F, 2.0F, 14.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(190, 328)
						.addBox(5.0F, -8.0F, -7.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(140, 345)
						.addBox(5.0F, -8.0F, 6.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(234, 342)
						.addBox(-6.0F, -8.0F, 2.0F, 12.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(266, 342)
						.addBox(-6.0F, -8.0F, -6.0F, 12.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(134, 345)
						.addBox(-7.0F, -8.0F, -7.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 343)
						.addBox(-7.0F, -8.0F, -2.0F, 14.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 8.0F, -18.0F));

		PartDefinition Left_wing = Ship_body.addOrReplaceChild("Left_wing", CubeListBuilder.create().texOffs(268, 0)
				.addBox(-1.0F, -7.0F, -11.0F, 2.0F, 2.0F, 38.0F, new CubeDeformation(0.0F)),
				PartPose.offset(10.0F, 7.0F, 1.0F));

		PartDefinition cube_r8 = Left_wing.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(104, 249)
						.addBox(-29.0F, -7.0F, 2.0F, 6.0F, 2.0F, 37.0F, new CubeDeformation(0.0F)).texOffs(232, 151)
						.addBox(-23.0F, -7.0F, -1.0F, 5.0F, 2.0F, 40.0F, new CubeDeformation(0.0F)).texOffs(226, 203)
						.addBox(-18.0F, -7.0F, -3.0F, 5.0F, 2.0F, 42.0F, new CubeDeformation(0.0F)).texOffs(168, 0)
						.addBox(-13.0F, -7.0F, -6.0F, 5.0F, 2.0F, 45.0F, new CubeDeformation(0.0F)).texOffs(128, 151)
						.addBox(-8.0F, -7.0F, -11.0F, 2.0F, 2.0F, 50.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.0F, 0.0F, -13.0F, 0.0F, 1.0908F, 0.0F));

		PartDefinition cube_r9 = Left_wing.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(280, 78)
						.addBox(-26.0F, -7.0F, -9.0F, 4.0F, 2.0F, 34.0F, new CubeDeformation(0.0F)).texOffs(298, 342)
						.addBox(-29.0F, -7.0F, -20.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(102, 344)
						.addBox(-29.0F, -7.0F, -27.0F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(30, 343)
						.addBox(-29.0F, -7.0F, -34.0F, 6.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(322, 181)
						.addBox(-29.0F, -7.0F, -43.0F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 151)
						.addBox(-32.0F, -7.0F, -43.0F, 3.0F, 2.0F, 61.0F, new CubeDeformation(0.0F)).texOffs(196, 288)
						.addBox(-29.0F, -7.0F, -10.0F, 3.0F, 2.0F, 29.0F, new CubeDeformation(0.0F)).texOffs(280, 40)
						.addBox(-22.0F, -7.0F, -8.0F, 5.0F, 2.0F, 36.0F, new CubeDeformation(0.0F)).texOffs(226, 247)
						.addBox(-17.0F, -7.0F, -7.0F, 4.0F, 2.0F, 39.0F, new CubeDeformation(0.0F)).texOffs(128, 203)
						.addBox(-13.0F, -7.0F, -6.0F, 5.0F, 2.0F, 44.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(47.0F, 0.0F, 3.0F, 0.0F, 1.3963F, 0.0F));

		PartDefinition cube_r10 = Left_wing.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(0, 283).addBox(-22.0F, -7.0F, -8.0F, 5.0F, 2.0F, 31.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(54.0F, 0.0F, 16.0F, 0.0F, 2.1817F, 0.0F));

		PartDefinition Right_wing = Ship_body.addOrReplaceChild("Right_wing",
				CubeListBuilder.create().texOffs(268, 0).mirror()
						.addBox(-1.0F, -7.0F, -11.0F, 2.0F, 2.0F, 38.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-10.0F, 7.0F, 1.0F));

		PartDefinition cube_r11 = Right_wing.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(104, 249)
				.mirror().addBox(23.0F, -7.0F, 2.0F, 6.0F, 2.0F, 37.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(232, 151).mirror().addBox(18.0F, -7.0F, -1.0F, 5.0F, 2.0F, 40.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(226, 203).mirror()
				.addBox(13.0F, -7.0F, -3.0F, 5.0F, 2.0F, 42.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(168, 0)
				.mirror().addBox(8.0F, -7.0F, -6.0F, 5.0F, 2.0F, 45.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(128, 151).mirror().addBox(6.0F, -7.0F, -11.0F, 2.0F, 2.0F, 50.0F, new CubeDeformation(0.0F))
				.mirror(false), PartPose.offsetAndRotation(-10.0F, 0.0F, -13.0F, 0.0F, -1.0908F, 0.0F));

		PartDefinition cube_r12 = Right_wing.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(280, 78)
				.mirror().addBox(22.0F, -7.0F, -9.0F, 4.0F, 2.0F, 34.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(298, 342).mirror().addBox(27.0F, -7.0F, -20.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(102, 344).mirror()
				.addBox(25.0F, -7.0F, -27.0F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(30, 343).mirror().addBox(23.0F, -7.0F, -34.0F, 6.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(322, 181).mirror()
				.addBox(20.0F, -7.0F, -43.0F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 151)
				.mirror().addBox(29.0F, -7.0F, -43.0F, 3.0F, 2.0F, 61.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(196, 288).mirror().addBox(26.0F, -7.0F, -10.0F, 3.0F, 2.0F, 29.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(280, 40).mirror()
				.addBox(17.0F, -7.0F, -8.0F, 5.0F, 2.0F, 36.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(226, 247).mirror().addBox(13.0F, -7.0F, -7.0F, 4.0F, 2.0F, 39.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(128, 203).mirror()
				.addBox(8.0F, -7.0F, -6.0F, 5.0F, 2.0F, 44.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-47.0F, 0.0F, 3.0F, 0.0F, -1.3963F, 0.0F));

		PartDefinition cube_r13 = Right_wing.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(0, 283).mirror()
						.addBox(17.0F, -7.0F, -8.0F, 5.0F, 2.0F, 31.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-54.0F, 0.0F, 16.0F, 0.0F, -2.1817F, 0.0F));

		PartDefinition Left_wing_back = Ship_body.addOrReplaceChild("Left_wing_back", CubeListBuilder.create()
				.texOffs(322, 139).addBox(5.0F, -3.5F, -5.5F, 1.0F, 1.0F, 19.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, -6.0F, 50.0F));

		PartDefinition cube_r14 = Left_wing_back.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(314, 317).addBox(-13.5F, -3.5F, 1.0F, 2.0F, 1.0F, 23.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.4F, 0.0F, -5.6F, 0.0F, 1.0908F, 0.0F));

		PartDefinition cube_r15 = Left_wing_back.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(260, 317).addBox(-12.0F, -3.5F, -0.5F, 3.0F, 1.0F, 24.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.5F, 0.0F, -6.2F, 0.0F, 1.0908F, 0.0F));

		PartDefinition cube_r16 = Left_wing_back.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(0, 316)
						.addBox(-9.5F, -3.5F, -1.5F, 3.0F, 1.0F, 26.0F, new CubeDeformation(0.0F)).texOffs(260, 288)
						.addBox(-7.0F, -3.5F, -3.0F, 3.0F, 1.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(312, 247)
						.addBox(-4.0F, -3.5F, -3.5F, 1.0F, 1.0F, 28.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.5F, 0.0F, -6.5F, 0.0F, 1.0908F, 0.0F));

		PartDefinition cube_r17 = Left_wing_back.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(342, 243)
						.addBox(-14.5F, -3.5F, -10.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(268, 40)
						.addBox(-14.5F, -3.5F, -13.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(90, 277)
						.addBox(-14.5F, -3.5F, -17.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(104, 243)
						.addBox(-15.0F, -3.5F, -21.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(29.0F, 0.0F, 1.5F, 0.0F, 1.3963F, 0.0F));

		PartDefinition cube_r18 = Left_wing_back
				.addOrReplaceChild("cube_r18",
						CubeListBuilder.create().texOffs(320, 193).addBox(-16.5F, -3.5F, -21.5F, 2.0F, 1.0F, 20.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(29.0F, 0.0F, 1.7F, 0.0F, 1.3963F, 0.0F));

		PartDefinition cube_r19 = Left_wing_back
				.addOrReplaceChild("cube_r19",
						CubeListBuilder.create().texOffs(174, 340).addBox(-11.5F, -3.5F, -4.0F, 2.0F, 1.0F, 12.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(18.5F, 0.0F, 9.0F, 0.0F, 2.5744F, 0.0F));

		PartDefinition Top_fin = Ship_body.addOrReplaceChild("Top_fin",
				CubeListBuilder.create().texOffs(322, 139).addBox(5.0F, -3.5F, -5.5F, 1.0F, 1.0F, 19.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 2.0F, 46.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r20 = Top_fin.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(314, 317).addBox(-13.5F, -3.5F, 1.0F, 2.0F, 1.0F, 23.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.4F, 0.0F, -5.6F, 0.0F, 1.0908F, 0.0F));

		PartDefinition cube_r21 = Top_fin.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(260, 317).addBox(-12.0F, -3.5F, -0.5F, 3.0F, 1.0F, 24.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.5F, 0.0F, -6.2F, 0.0F, 1.0908F, 0.0F));

		PartDefinition cube_r22 = Top_fin.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(0, 316)
						.addBox(-9.5F, -3.5F, -1.5F, 3.0F, 1.0F, 26.0F, new CubeDeformation(0.0F)).texOffs(260, 288)
						.addBox(-7.0F, -3.5F, -3.0F, 3.0F, 1.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(312, 247)
						.addBox(-4.0F, -3.5F, -3.5F, 1.0F, 1.0F, 28.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.5F, 0.0F, -6.5F, 0.0F, 1.0908F, 0.0F));

		PartDefinition cube_r23 = Top_fin.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(342, 243)
						.addBox(-14.5F, -3.5F, -10.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(268, 40)
						.addBox(-14.5F, -3.5F, -13.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(90, 277)
						.addBox(-14.5F, -3.5F, -17.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(104, 243)
						.addBox(-15.0F, -3.5F, -21.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(29.0F, 0.0F, 1.5F, 0.0F, 1.3963F, 0.0F));

		PartDefinition cube_r24 = Top_fin
				.addOrReplaceChild("cube_r24",
						CubeListBuilder.create().texOffs(320, 193).addBox(-16.5F, -3.5F, -21.5F, 2.0F, 1.0F, 20.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(29.0F, 0.0F, 1.7F, 0.0F, 1.3963F, 0.0F));

		PartDefinition cube_r25 = Top_fin
				.addOrReplaceChild("cube_r25",
						CubeListBuilder.create().texOffs(174, 340).addBox(-11.5F, -3.5F, -4.0F, 2.0F, 1.0F, 12.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(18.5F, 0.0F, 9.0F, 0.0F, 2.5744F, 0.0F));

		PartDefinition Right_wing_back = Ship_body.addOrReplaceChild("Right_wing_back",
				CubeListBuilder.create().texOffs(322, 139).mirror()
						.addBox(-6.0F, -3.5F, -5.5F, 1.0F, 1.0F, 19.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-1.0F, -6.0F, 50.0F));

		PartDefinition cube_r26 = Right_wing_back.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(314, 317).mirror()
						.addBox(11.5F, -3.5F, 1.0F, 2.0F, 1.0F, 23.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-10.4F, 0.0F, -5.6F, 0.0F, -1.0908F, 0.0F));

		PartDefinition cube_r27 = Right_wing_back.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(260, 317).mirror()
						.addBox(9.0F, -3.5F, -0.5F, 3.0F, 1.0F, 24.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-10.5F, 0.0F, -6.2F, 0.0F, -1.0908F, 0.0F));

		PartDefinition cube_r28 = Right_wing_back.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 316)
				.mirror().addBox(6.5F, -3.5F, -1.5F, 3.0F, 1.0F, 26.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(260, 288).mirror().addBox(4.0F, -3.5F, -3.0F, 3.0F, 1.0F, 28.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(312, 247).mirror()
				.addBox(3.0F, -3.5F, -3.5F, 1.0F, 1.0F, 28.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-10.5F, 0.0F, -6.5F, 0.0F, -1.0908F, 0.0F));

		PartDefinition cube_r29 = Right_wing_back.addOrReplaceChild("cube_r29", CubeListBuilder.create()
				.texOffs(342, 243).mirror().addBox(13.5F, -3.5F, -10.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(268, 40).mirror()
				.addBox(12.5F, -3.5F, -13.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(90, 277).mirror().addBox(11.5F, -3.5F, -17.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(104, 243).mirror()
				.addBox(10.0F, -3.5F, -21.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-29.0F, 0.0F, 1.5F, 0.0F, -1.3963F, 0.0F));

		PartDefinition cube_r30 = Right_wing_back.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(320, 193).mirror()
						.addBox(14.5F, -3.5F, -21.5F, 2.0F, 1.0F, 20.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-29.0F, 0.0F, 1.7F, 0.0F, -1.3963F, 0.0F));

		PartDefinition cube_r31 = Right_wing_back.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(174, 340).mirror()
						.addBox(9.5F, -3.5F, -4.0F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-18.5F, 0.0F, 9.0F, 0.0F, -2.5744F, 0.0F));

		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Ship_body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Ship_body.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Ship_body.xRot = headPitch / (180F / (float) Math.PI);
	}
}