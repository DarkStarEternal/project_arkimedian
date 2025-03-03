package net.mcreator.arkimedian.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelgvral_solider<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("arkimedian", "modelgvral_solider"), "main");
	public final ModelPart Body;
	public final ModelPart Right_upper_arm;
	public final ModelPart Right_lower_arm;
	public final ModelPart Left_upper_arm;
	public final ModelPart Left_lower_arm;
	public final ModelPart Cape;
	public final ModelPart Cape_string_1;
	public final ModelPart Capestring_1_2;
	public final ModelPart Capestring_1_3;
	public final ModelPart Capestring_1_4;
	public final ModelPart Capestring_1_5;
	public final ModelPart Capestring_1_6;
	public final ModelPart Capestring_1_7;
	public final ModelPart Cape_string_2;
	public final ModelPart Capestring_1_8;
	public final ModelPart Capestring_1_9;
	public final ModelPart Capestring_1_10;
	public final ModelPart Capestring_1_11;
	public final ModelPart Capestring_1_12;
	public final ModelPart Capestring_1_13;
	public final ModelPart Capestring_1_34;
	public final ModelPart Cape_string_3;
	public final ModelPart Capestring_1_14;
	public final ModelPart Capestring_1_15;
	public final ModelPart Capestring_1_16;
	public final ModelPart Capestring_1_17;
	public final ModelPart Capestring_1_18;
	public final ModelPart Capestring_1_19;
	public final ModelPart Capestring_1_33;
	public final ModelPart Cape_string_4;
	public final ModelPart Capestring_1_20;
	public final ModelPart Capestring_1_21;
	public final ModelPart Capestring_1_22;
	public final ModelPart Capestring_1_23;
	public final ModelPart Capestring_1_24;
	public final ModelPart Capestring_1_25;
	public final ModelPart Capestring_1_32;
	public final ModelPart Cape_string_5;
	public final ModelPart Capestring_1_26;
	public final ModelPart Capestring_1_27;
	public final ModelPart Capestring_1_28;
	public final ModelPart Capestring_1_29;
	public final ModelPart Capestring_1_30;
	public final ModelPart Capestring_1_31;
	public final ModelPart Right_upper_leg;
	public final ModelPart Right_lower_leg;
	public final ModelPart Left_upper_leg;
	public final ModelPart Left_lower_leg;
	public final ModelPart Head;
	public final ModelPart bone;
	public final ModelPart Sword;

	public Modelgvral_solider(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Right_upper_arm = this.Body.getChild("Right_upper_arm");
		this.Right_lower_arm = this.Right_upper_arm.getChild("Right_lower_arm");
		this.Left_upper_arm = this.Body.getChild("Left_upper_arm");
		this.Left_lower_arm = this.Left_upper_arm.getChild("Left_lower_arm");
		this.Cape = this.Body.getChild("Cape");
		this.Cape_string_1 = this.Cape.getChild("Cape_string_1");
		this.Capestring_1_2 = this.Cape_string_1.getChild("Capestring_1_2");
		this.Capestring_1_3 = this.Capestring_1_2.getChild("Capestring_1_3");
		this.Capestring_1_4 = this.Capestring_1_3.getChild("Capestring_1_4");
		this.Capestring_1_5 = this.Capestring_1_4.getChild("Capestring_1_5");
		this.Capestring_1_6 = this.Capestring_1_5.getChild("Capestring_1_6");
		this.Capestring_1_7 = this.Capestring_1_6.getChild("Capestring_1_7");
		this.Cape_string_2 = this.Cape.getChild("Cape_string_2");
		this.Capestring_1_8 = this.Cape_string_2.getChild("Capestring_1_8");
		this.Capestring_1_9 = this.Capestring_1_8.getChild("Capestring_1_9");
		this.Capestring_1_10 = this.Capestring_1_9.getChild("Capestring_1_10");
		this.Capestring_1_11 = this.Capestring_1_10.getChild("Capestring_1_11");
		this.Capestring_1_12 = this.Capestring_1_11.getChild("Capestring_1_12");
		this.Capestring_1_13 = this.Capestring_1_12.getChild("Capestring_1_13");
		this.Capestring_1_34 = this.Capestring_1_13.getChild("Capestring_1_34");
		this.Cape_string_3 = this.Cape.getChild("Cape_string_3");
		this.Capestring_1_14 = this.Cape_string_3.getChild("Capestring_1_14");
		this.Capestring_1_15 = this.Capestring_1_14.getChild("Capestring_1_15");
		this.Capestring_1_16 = this.Capestring_1_15.getChild("Capestring_1_16");
		this.Capestring_1_17 = this.Capestring_1_16.getChild("Capestring_1_17");
		this.Capestring_1_18 = this.Capestring_1_17.getChild("Capestring_1_18");
		this.Capestring_1_19 = this.Capestring_1_18.getChild("Capestring_1_19");
		this.Capestring_1_33 = this.Capestring_1_19.getChild("Capestring_1_33");
		this.Cape_string_4 = this.Cape.getChild("Cape_string_4");
		this.Capestring_1_20 = this.Cape_string_4.getChild("Capestring_1_20");
		this.Capestring_1_21 = this.Capestring_1_20.getChild("Capestring_1_21");
		this.Capestring_1_22 = this.Capestring_1_21.getChild("Capestring_1_22");
		this.Capestring_1_23 = this.Capestring_1_22.getChild("Capestring_1_23");
		this.Capestring_1_24 = this.Capestring_1_23.getChild("Capestring_1_24");
		this.Capestring_1_25 = this.Capestring_1_24.getChild("Capestring_1_25");
		this.Capestring_1_32 = this.Capestring_1_25.getChild("Capestring_1_32");
		this.Cape_string_5 = this.Cape.getChild("Cape_string_5");
		this.Capestring_1_26 = this.Cape_string_5.getChild("Capestring_1_26");
		this.Capestring_1_27 = this.Capestring_1_26.getChild("Capestring_1_27");
		this.Capestring_1_28 = this.Capestring_1_27.getChild("Capestring_1_28");
		this.Capestring_1_29 = this.Capestring_1_28.getChild("Capestring_1_29");
		this.Capestring_1_30 = this.Capestring_1_29.getChild("Capestring_1_30");
		this.Capestring_1_31 = this.Capestring_1_30.getChild("Capestring_1_31");
		this.Right_upper_leg = this.Body.getChild("Right_upper_leg");
		this.Right_lower_leg = this.Right_upper_leg.getChild("Right_lower_leg");
		this.Left_upper_leg = this.Body.getChild("Left_upper_leg");
		this.Left_lower_leg = this.Left_upper_leg.getChild("Left_lower_leg");
		this.Head = this.Body.getChild("Head");
		this.bone = this.Head.getChild("bone");
		this.Sword = this.Body.getChild("Sword");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 22).addBox(-4.0F, -18.0F, -2.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(104, 0).addBox(-4.0F, -18.0F, -2.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(-0.1F)).texOffs(0, 0)
						.addBox(-5.0F, -24.0F, -2.0F, 10.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 42).addBox(-3.0F, -24.0F, 1.9F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 42)
						.addBox(-1.0F, -19.0F, -2.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(108, 16).addBox(-6.0F, -6.0F, 1.0F, 4.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -14.0F, -2.8F, 0.0F, -0.2618F, 0.0F));
		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(48, 8).addBox(-6.0F, -6.0F, 1.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -18.0F, -2.7F, 0.0F, -0.2618F, 0.0F));
		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(40, 46).addBox(-3.0F, -6.0F, 1.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -18.0F, -4.0F, 0.0F, 0.2618F, 0.0F));
		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(44, 0).addBox(7.0F, 0.0F, -4.0F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(14, 42).addBox(-7.0F, 0.0F, -4.0F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(24, 19)
						.addBox(-7.0F, 0.0F, 2.0F, 14.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 17).addBox(-7.0F, 0.0F, -4.0F, 14.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -18.0F, 1.0F, 0.0F, 0.0F, 1.0908F));
		PartDefinition Right_upper_arm = Body.addOrReplaceChild("Right_upper_arm", CubeListBuilder.create().texOffs(24, 21).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, -23.0F, 0.0F));
		PartDefinition cube_r5 = Right_upper_arm.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(105, 2).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-2.0F, 9.4F, 0.0F, 0.0F, -0.0436F, 0.0F));
		PartDefinition cube_r6 = Right_upper_arm.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(120, 10).addBox(-2.0F, -6.0F, 0.0F, 4.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(120, 10).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 5.0F, 1.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition cube_r7 = Right_upper_arm.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(112, 17).addBox(-2.0F, -7.0F, -1.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.8F, 5.4F, -1.1F, 0.0F, 0.0F, 0.2182F));
		PartDefinition cube_r8 = Right_upper_arm.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(120, 10).addBox(-2.0F, -6.0F, 0.0F, 4.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 5.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition Right_lower_arm = Right_upper_arm.addOrReplaceChild("Right_lower_arm", CubeListBuilder.create(), PartPose.offset(-2.0F, 6.8F, 0.0F));
		PartDefinition cube_r9 = Right_lower_arm.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(105, 2).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(-0.1F)).texOffs(16, 32).addBox(-2.0F, -5.4F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.4F, 0.0F, 0.0F, -0.0436F, 0.0F));
		PartDefinition Left_upper_arm = Body.addOrReplaceChild("Left_upper_arm", CubeListBuilder.create().texOffs(24, 21).mirror().addBox(0.0F, -1.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(5.0F, -23.0F, 0.0F));
		PartDefinition cube_r10 = Left_upper_arm.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(105, 2).mirror().addBox(-2.0F, -6.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, 9.4F, 0.0F, 0.0F, 0.0436F, 0.0F));
		PartDefinition cube_r11 = Left_upper_arm.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(120, 10).mirror().addBox(-2.0F, -6.0F, 0.0F, 4.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(120, 10).mirror()
				.addBox(-2.0F, -6.0F, -2.0F, 4.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition cube_r12 = Left_upper_arm.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(112, 17).mirror().addBox(-2.0F, -7.0F, -1.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.8F, 5.4F, -1.1F, 0.0F, 0.0F, -0.2182F));
		PartDefinition cube_r13 = Left_upper_arm.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(120, 10).mirror().addBox(-2.0F, -6.0F, 0.0F, 4.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition Left_lower_arm = Left_upper_arm.addOrReplaceChild("Left_lower_arm", CubeListBuilder.create(), PartPose.offset(2.0F, 6.8F, 0.0F));
		PartDefinition cube_r14 = Left_lower_arm.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(105, 2).mirror().addBox(-2.0F, -6.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false).texOffs(16, 32).mirror()
				.addBox(-2.0F, -5.4F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.4F, 0.0F, 0.0F, 0.0436F, 0.0F));
		PartDefinition Cape = Body.addOrReplaceChild("Cape", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -24.0F, 3.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition Cape_string_1 = Cape.addOrReplaceChild("Cape_string_1", CubeListBuilder.create().texOffs(54, 23).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 0.0F, 0.0F));
		PartDefinition Capestring_1_2 = Cape_string_1.addOrReplaceChild("Capestring_1_2", CubeListBuilder.create().texOffs(54, 21).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition Capestring_1_3 = Capestring_1_2.addOrReplaceChild("Capestring_1_3", CubeListBuilder.create().texOffs(54, 25).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition Capestring_1_4 = Capestring_1_3.addOrReplaceChild("Capestring_1_4", CubeListBuilder.create().texOffs(54, 27).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition Capestring_1_5 = Capestring_1_4.addOrReplaceChild("Capestring_1_5", CubeListBuilder.create().texOffs(46, 54).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition Capestring_1_6 = Capestring_1_5.addOrReplaceChild("Capestring_1_6", CubeListBuilder.create().texOffs(0, 55).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition Capestring_1_7 = Capestring_1_6.addOrReplaceChild("Capestring_1_7", CubeListBuilder.create().texOffs(4, 55).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition Cape_string_2 = Cape.addOrReplaceChild("Cape_string_2", CubeListBuilder.create().texOffs(42, 55).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.0F, 0.0F));
		PartDefinition Capestring_1_8 = Cape_string_2.addOrReplaceChild("Capestring_1_8", CubeListBuilder.create().texOffs(8, 55).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition Capestring_1_9 = Capestring_1_8.addOrReplaceChild("Capestring_1_9", CubeListBuilder.create().texOffs(12, 55).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition Capestring_1_10 = Capestring_1_9.addOrReplaceChild("Capestring_1_10", CubeListBuilder.create().texOffs(16, 55).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition Capestring_1_11 = Capestring_1_10.addOrReplaceChild("Capestring_1_11", CubeListBuilder.create().texOffs(20, 55).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition Capestring_1_12 = Capestring_1_11.addOrReplaceChild("Capestring_1_12", CubeListBuilder.create().texOffs(24, 55).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition Capestring_1_13 = Capestring_1_12.addOrReplaceChild("Capestring_1_13", CubeListBuilder.create().texOffs(38, 55).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition Capestring_1_34 = Capestring_1_13.addOrReplaceChild("Capestring_1_34", CubeListBuilder.create().texOffs(58, 23).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition Cape_string_3 = Cape.addOrReplaceChild("Cape_string_3", CubeListBuilder.create().texOffs(0, 57).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Capestring_1_14 = Cape_string_3.addOrReplaceChild("Capestring_1_14", CubeListBuilder.create().texOffs(56, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition Capestring_1_15 = Capestring_1_14.addOrReplaceChild("Capestring_1_15", CubeListBuilder.create().texOffs(56, 2).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition Capestring_1_16 = Capestring_1_15.addOrReplaceChild("Capestring_1_16", CubeListBuilder.create().texOffs(56, 4).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition Capestring_1_17 = Capestring_1_16.addOrReplaceChild("Capestring_1_17", CubeListBuilder.create().texOffs(56, 6).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition Capestring_1_18 = Capestring_1_17.addOrReplaceChild("Capestring_1_18", CubeListBuilder.create().texOffs(56, 19).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition Capestring_1_19 = Capestring_1_18.addOrReplaceChild("Capestring_1_19", CubeListBuilder.create().texOffs(46, 56).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition Capestring_1_33 = Capestring_1_19.addOrReplaceChild("Capestring_1_33", CubeListBuilder.create().texOffs(58, 21).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition Cape_string_4 = Cape.addOrReplaceChild("Cape_string_4", CubeListBuilder.create().texOffs(28, 57).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 0.0F, 0.0F));
		PartDefinition Capestring_1_20 = Cape_string_4.addOrReplaceChild("Capestring_1_20", CubeListBuilder.create().texOffs(4, 57).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition Capestring_1_21 = Capestring_1_20.addOrReplaceChild("Capestring_1_21", CubeListBuilder.create().texOffs(8, 57).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition Capestring_1_22 = Capestring_1_21.addOrReplaceChild("Capestring_1_22", CubeListBuilder.create().texOffs(12, 57).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition Capestring_1_23 = Capestring_1_22.addOrReplaceChild("Capestring_1_23", CubeListBuilder.create().texOffs(16, 57).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition Capestring_1_24 = Capestring_1_23.addOrReplaceChild("Capestring_1_24", CubeListBuilder.create().texOffs(20, 57).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition Capestring_1_25 = Capestring_1_24.addOrReplaceChild("Capestring_1_25", CubeListBuilder.create().texOffs(24, 57).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition Capestring_1_32 = Capestring_1_25.addOrReplaceChild("Capestring_1_32", CubeListBuilder.create().texOffs(58, 16).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition Cape_string_5 = Cape.addOrReplaceChild("Cape_string_5", CubeListBuilder.create().texOffs(58, 14).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 0.0F, 0.0F));
		PartDefinition Capestring_1_26 = Cape_string_5.addOrReplaceChild("Capestring_1_26", CubeListBuilder.create().texOffs(32, 57).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition Capestring_1_27 = Capestring_1_26.addOrReplaceChild("Capestring_1_27", CubeListBuilder.create().texOffs(36, 57).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition Capestring_1_28 = Capestring_1_27.addOrReplaceChild("Capestring_1_28", CubeListBuilder.create().texOffs(40, 57).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition Capestring_1_29 = Capestring_1_28.addOrReplaceChild("Capestring_1_29", CubeListBuilder.create().texOffs(58, 8).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition Capestring_1_30 = Capestring_1_29.addOrReplaceChild("Capestring_1_30", CubeListBuilder.create().texOffs(58, 10).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition Capestring_1_31 = Capestring_1_30.addOrReplaceChild("Capestring_1_31", CubeListBuilder.create().texOffs(58, 12).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition Right_upper_leg = Body.addOrReplaceChild("Right_upper_leg",
				CubeListBuilder.create().texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(107, 2).addBox(-2.0F, 3.7F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.1F)),
				PartPose.offset(-2.0F, -12.0F, 0.0F));
		PartDefinition cube_r15 = Right_upper_leg.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(50, 51).addBox(-2.0F, -1.0F, 2.0F, 4.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 3.0F, -0.1F, -1.5272F, -1.5708F, 1.5708F));
		PartDefinition cube_r16 = Right_upper_leg.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(50, 51).addBox(-2.0F, -1.0F, 2.0F, 4.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, 1.0F, -0.1F, -1.5272F, -1.5708F, 1.5708F));
		PartDefinition cube_r17 = Right_upper_leg.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(50, 44).addBox(-2.0F, -6.0F, 2.0F, 4.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.0F, 0.3F, 0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r18 = Right_upper_leg.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(50, 44).addBox(-2.0F, -6.0F, 2.0F, 4.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.0F, 0.3F, 0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r19 = Right_upper_leg.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(30, 50).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.0F, -0.3F, -0.0436F, 0.0F, 0.0F));
		PartDefinition Right_lower_leg = Right_upper_leg.addOrReplaceChild("Right_lower_leg",
				CubeListBuilder.create().texOffs(28, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(107, 2).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(-0.1F)),
				PartPose.offset(0.0F, 6.5F, 0.0F));
		PartDefinition Left_upper_leg = Body.addOrReplaceChild("Left_upper_leg", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(107, 2).mirror()
				.addBox(-2.0F, 3.7F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offset(2.0F, -12.0F, 0.0F));
		PartDefinition cube_r20 = Left_upper_leg.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(50, 51).mirror().addBox(-2.0F, -1.0F, 2.0F, 4.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.1F, 1.0F, -0.1F, -1.5272F, 1.5708F, -1.5708F));
		PartDefinition cube_r21 = Left_upper_leg.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(50, 44).mirror().addBox(-2.0F, -6.0F, 2.0F, 4.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.0F, 0.3F, 0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r22 = Left_upper_leg.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(30, 50).mirror().addBox(-2.0F, -6.0F, -2.0F, 4.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 8.0F, -0.3F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r23 = Left_upper_leg.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(30, 50).mirror().addBox(-2.0F, -6.0F, -2.0F, 4.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.0F, -0.3F, -0.0436F, 0.0F, 0.0F));
		PartDefinition Left_lower_leg = Left_upper_leg.addOrReplaceChild("Left_lower_leg", CubeListBuilder.create().texOffs(28, 0).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(107, 2).mirror()
				.addBox(-2.0F, -1.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offset(0.0F, 6.5F, 0.0F));
		PartDefinition Head = Body.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(32, 41).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 10).addBox(-3.0F, -7.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(46, 34)
						.addBox(-3.0F, -4.0F, -4.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 10).addBox(-3.0F, -8.0F, -4.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(46, 30)
						.addBox(-3.0F, -7.0F, -4.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 16).addBox(-1.0F, -6.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 32)
						.addBox(-4.0F, -7.0F, -4.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(40, 21).addBox(3.0F, -7.0F, -4.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(48, 38)
						.addBox(-4.0F, -4.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 49).addBox(3.0F, -4.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -24.0F, 1.0F));
		PartDefinition cube_r24 = Head.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(42, 52).addBox(3.0F, -2.0F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 14)
				.addBox(0.0F, -3.0F, 1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 50).addBox(0.0F, 0.0F, 1.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -4.0F, -4.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r25 = Head.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(38, 52).addBox(-4.0F, -2.0F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -4.0F, -4.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition bone = Head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(4.0F, -4.0F, -4.0F));
		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(46, 52).addBox(1.0F, -3.0F, 1.5F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.2F, 1.0F, -0.2F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(52, 19).addBox(-3.0F, -3.0F, 1.5F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2F, 1.0F, -0.2F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(20, 50).addBox(-4.0F, -3.0F, 1.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 8).addBox(-4.0F, -7.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 30)
						.addBox(-4.0F, -7.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 46).addBox(-4.0F, -6.0F, 1.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition Sword = Body.addOrReplaceChild("Sword",
				CubeListBuilder.create().texOffs(124, 45).addBox(-0.7503F, 2.9303F, -0.5F, 2.0F, 19.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(116, 44).addBox(-1.7503F, 2.9303F, -1.0F, 1.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(122, 40)
						.addBox(-0.7503F, 21.9303F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(122, 33).addBox(-0.7503F, -3.0697F, -1.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 44)
						.addBox(1.2497F, 2.9303F, -1.0F, 1.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -26.0F, 4.0F, 0.0F, 0.0F, -0.7418F));
		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
