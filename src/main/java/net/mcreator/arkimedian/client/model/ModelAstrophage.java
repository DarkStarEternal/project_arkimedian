package net.mcreator.arkimedian.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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
public class ModelAstrophage<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("arkimedian", "model_astrophage"), "main");
	public final ModelPart Head;
	public final ModelPart leg;
	public final ModelPart leg2;
	public final ModelPart Body;
	public final ModelPart frontbody;
	public final ModelPart Arm;
	public final ModelPart Arm2;

	public ModelAstrophage(ModelPart root) {
		this.Head = root.getChild("Head");
		this.leg = root.getChild("leg");
		this.leg2 = root.getChild("leg2");
		this.Body = root.getChild("Body");
		this.frontbody = this.Body.getChild("frontbody");
		this.Arm = root.getChild("Arm");
		this.Arm2 = root.getChild("Arm2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(59, 0).addBox(-6.4416F, -3.9016F, -10.2181F, 12.8832F, 9.6624F, 10.736F, new CubeDeformation(0.0F)).texOffs(130, 45)
						.addBox(-3.2208F, -3.9016F, -12.3653F, 6.4416F, 9.6624F, 2.1472F, new CubeDeformation(0.0F)).texOffs(122, 92).addBox(-6.4416F, 7.908F, -10.2181F, 12.8832F, 2.1472F, 6.4416F, new CubeDeformation(0.0F)).texOffs(74, 61)
						.addBox(-3.2208F, 7.908F, -12.3653F, 6.4416F, 2.1472F, 2.1472F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(-3.2208F, 6.908F, -12.3653F, 1.4416F, 1.1472F, 1.1472F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(1.7792F, 6.908F, -12.3653F, 1.4416F, 1.1472F, 1.1472F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.6916F, 6.908F, -12.3653F, 1.4416F, 1.1472F, 1.1472F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -17.0F, -29.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(28, 94).addBox(-3.2208F, -9.6624F, -6.9784F, 4.2944F, 2.1472F, 2.1472F, new CubeDeformation(0.0F)).texOffs(0, 105).addBox(-3.2208F, -21.472F,
				-6.9784F, 4.2944F, 9.6624F, 2.1472F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.5704F, -5.9237F, 0.0F, 0.5672F, 0.0F));
		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(20, 0).addBox(-3.2208F, -10.6624F, -7.9784F, 1.2944F, 1.1472F, 1.1472F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 17.5704F, -5.9237F, 0.0F, 0.5672F, 0.0F));
		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(20, 2).addBox(0.9264F, -10.6624F, -6.9784F, 1.2944F, 1.1472F, 1.1472F, new CubeDeformation(0.0F)).texOffs(56, 102)
						.addBox(-1.0736F, -9.6624F, -6.9784F, 4.2944F, 2.1472F, 2.1472F, new CubeDeformation(0.0F)).texOffs(0, 87).addBox(-1.0736F, -21.472F, -6.9784F, 4.2944F, 9.6624F, 2.1472F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 17.5704F, -5.9237F, 0.0F, -0.5672F, 0.0F));
		PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(94, 90).addBox(-3.2208F, -24.6928F, -10.1992F, 4.2944F, 5.368F, 2.1472F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 17.5704F, -5.9237F, -0.1922F, 0.4293F, -0.0808F));
		PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(112, 110).addBox(-1.0736F, -24.6928F, -10.1992F, 4.2944F, 5.368F, 2.1472F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 17.5704F, -5.9237F, -0.1922F, -0.4293F, 0.0808F));
		PartDefinition cube_r6 = Head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(20, 66).addBox(-1.0736F, -26.84F, -14.4936F, 4.2944F, 4.2944F, 2.1472F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 17.5704F, -5.9237F, -0.3819F, 0.4084F, -0.1582F));
		PartDefinition cube_r7 = Head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(86, 27).addBox(-3.2208F, -26.84F, -14.4936F, 4.2944F, 4.2944F, 2.1472F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 17.5704F, -5.9237F, -0.3819F, -0.4084F, 0.1582F));
		PartDefinition cube_r8 = Head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(96, 58).addBox(-3.2208F, -26.84F, -14.4936F, 6.4416F, 4.2944F, 2.1472F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 17.5704F, -5.9237F, -0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r9 = Head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 20).addBox(-3.2208F, -24.6928F, -10.1992F, 6.4416F, 5.368F, 2.1472F, new CubeDeformation(0.0F)).texOffs(69, 65).addBox(-6.4416F, -28.9872F,
				-8.052F, 12.8832F, 9.6624F, 10.736F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.5704F, -5.9237F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r10 = Head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(114, 19).addBox(-6.4416F, -5.368F, -5.368F, 12.8832F, 2.1472F, 6.4416F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 14.3496F, -5.9237F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r11 = Head.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(106, 58).addBox(-6.4416F, -8.5888F, 3.2208F, 12.8832F, 4.2944F, 6.4416F, new CubeDeformation(0.0F)).texOffs(127, 79)
						.addBox(-6.4416F, -3.2208F, 2.1472F, 12.8832F, 1.0736F, 5.368F, new CubeDeformation(0.0F)).texOffs(59, 21).addBox(-6.4416F, -4.2944F, 3.2208F, 12.8832F, 1.0736F, 5.368F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 14.3496F, -5.9237F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r12 = Head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 61).addBox(-6.4416F, 2.684F, 6.4416F, 12.8832F, 0.8052F, 4.2944F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 14.3496F, -5.9237F, 1.1781F, 0.0F, 0.0F));
		PartDefinition cube_r13 = Head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(46, 61).addBox(-6.4416F, -17.1776F, 6.9784F, 12.8832F, 9.6624F, 1.0736F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 14.3496F, -5.9237F, 0.0873F, 0.0F, 0.0F));
		PartDefinition leg = partdefinition.addOrReplaceChild("leg",
				CubeListBuilder.create().texOffs(146, 100).addBox(-5.5786F, 19.9529F, -4.5701F, 7.0595F, 3.0255F, 6.051F, new CubeDeformation(0.0F)).texOffs(142, 142)
						.addBox(-5.5786F, 11.8849F, -6.5871F, 7.0595F, 8.068F, 7.0595F, new CubeDeformation(0.0F)).texOffs(59, 0).addBox(-3.5616F, 18.9444F, 1.4808F, 3.0255F, 4.034F, 2.017F, new CubeDeformation(0.0F)),
				PartPose.offset(-9.0F, 1.0F, 2.0F));
		PartDefinition cube_r14 = leg.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(161, 68).addBox(-5.0425F, -4.034F, 1.0085F, 2.017F, 4.034F, 6.051F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5447F, 22.9784F, -2.5532F, 0.0F, 0.48F, 0.0F));
		PartDefinition cube_r15 = leg.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(80, 162).addBox(3.0255F, -4.034F, 1.0085F, 2.017F, 4.034F, 6.051F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5532F, 22.9784F, -2.5532F, 0.0F, -0.48F, 0.0F));
		PartDefinition cube_r16 = leg.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(46, 160).addBox(-3.0255F, -11.0934F, 3.0255F, 7.0595F, 9.0765F, 1.5127F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5532F, 22.9784F, -2.5532F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r17 = leg.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(136, 119).addBox(1.0085F, -3.0255F, -10.085F, 3.0255F, 5.0425F, 3.0255F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5532F, 22.9784F, -2.5532F, -0.1549F, -0.27F, -0.1446F));
		PartDefinition cube_r18 = leg.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(12, 163).addBox(1.0085F, -2.017F, -8.068F, 3.0255F, 8.068F, 3.0255F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5532F, 22.9784F, -2.5532F, -1.0712F, -0.27F, -0.1446F));
		PartDefinition cube_r19 = leg.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(164, 139).addBox(-3.0255F, -3.0255F, -10.085F, 3.0255F, 5.0425F, 3.0255F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5532F, 22.9784F, -2.5532F, -0.1549F, 0.27F, 0.1446F));
		PartDefinition cube_r20 = leg.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(24, 166).addBox(-3.0255F, -2.017F, -8.068F, 3.0255F, 8.068F, 3.0255F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5532F, 22.9784F, -2.5532F, -1.0712F, 0.27F, 0.1446F));
		PartDefinition cube_r21 = leg.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(62, 122).addBox(-3.0255F, -19.1614F, -20.1699F, 7.0595F, 14.1189F, 7.0595F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5532F, 22.9784F, -2.5532F, -0.9163F, 0.0F, 0.0F));
		PartDefinition cube_r22 = leg.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(96, 0).addBox(-3.0255F, -20.1699F, -7.0595F, 7.0595F, 8.068F, 2.017F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5532F, 22.9784F, -2.5532F, -0.48F, 0.0F, 0.0F));
		PartDefinition cube_r23 = leg.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(139, 0).addBox(-3.0255F, -18.1529F, 0.0F, 7.0595F, 9.0765F, 7.0595F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5532F, 22.9784F, -2.5532F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r24 = leg.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(44, 136).addBox(-3.0255F, -5.0425F, -2.017F, 7.0595F, 4.034F, 2.017F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5532F, 22.9784F, -2.5532F, 0.5236F, 0.0F, 0.0F));
		PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2",
				CubeListBuilder.create().texOffs(146, 100).mirror().addBox(-1.4808F, 19.9529F, -4.5701F, 7.0595F, 3.0255F, 6.051F, new CubeDeformation(0.0F)).mirror(false).texOffs(142, 142).mirror()
						.addBox(-1.4808F, 11.8849F, -6.5871F, 7.0595F, 8.068F, 7.0595F, new CubeDeformation(0.0F)).mirror(false).texOffs(59, 0).mirror().addBox(0.5362F, 18.9444F, 1.4808F, 3.0255F, 4.034F, 2.017F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(9.0F, 1.0F, 2.0F));
		PartDefinition cube_r25 = leg2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(161, 68).mirror().addBox(3.0255F, -4.034F, 1.0085F, 2.017F, 4.034F, 6.051F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.5447F, 22.9784F, -2.5532F, 0.0F, -0.48F, 0.0F));
		PartDefinition cube_r26 = leg2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(80, 162).mirror().addBox(-5.0425F, -4.034F, 1.0085F, 2.017F, 4.034F, 6.051F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.5532F, 22.9784F, -2.5532F, 0.0F, 0.48F, 0.0F));
		PartDefinition cube_r27 = leg2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(46, 160).mirror().addBox(-4.034F, -11.0934F, 3.0255F, 7.0595F, 9.0765F, 1.5127F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.5532F, 22.9784F, -2.5532F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r28 = leg2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(136, 119).mirror().addBox(-4.034F, -3.0255F, -10.085F, 3.0255F, 5.0425F, 3.0255F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.5532F, 22.9784F, -2.5532F, -0.1549F, 0.27F, 0.1446F));
		PartDefinition cube_r29 = leg2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(12, 163).mirror().addBox(-4.034F, -2.017F, -8.068F, 3.0255F, 8.068F, 3.0255F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.5532F, 22.9784F, -2.5532F, -1.0712F, 0.27F, 0.1446F));
		PartDefinition cube_r30 = leg2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(164, 139).mirror().addBox(0.0F, -3.0255F, -10.085F, 3.0255F, 5.0425F, 3.0255F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.5532F, 22.9784F, -2.5532F, -0.1549F, -0.27F, -0.1446F));
		PartDefinition cube_r31 = leg2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(24, 166).mirror().addBox(0.0F, -2.017F, -8.068F, 3.0255F, 8.068F, 3.0255F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.5532F, 22.9784F, -2.5532F, -1.0712F, -0.27F, -0.1446F));
		PartDefinition cube_r32 = leg2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(62, 122).mirror().addBox(-4.034F, -19.1614F, -20.1699F, 7.0595F, 14.1189F, 7.0595F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.5532F, 22.9784F, -2.5532F, -0.9163F, 0.0F, 0.0F));
		PartDefinition cube_r33 = leg2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(96, 0).mirror().addBox(-4.034F, -20.1699F, -7.0595F, 7.0595F, 8.068F, 2.017F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.5532F, 22.9784F, -2.5532F, -0.48F, 0.0F, 0.0F));
		PartDefinition cube_r34 = leg2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(139, 0).mirror().addBox(-4.034F, -18.1529F, 0.0F, 7.0595F, 9.0765F, 7.0595F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.5532F, 22.9784F, -2.5532F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r35 = leg2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(44, 136).mirror().addBox(-4.034F, -5.0425F, -2.017F, 7.0595F, 4.034F, 2.017F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.5532F, 22.9784F, -2.5532F, 0.5236F, 0.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r36 = Body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(116, 134).addBox(-8.0F, -25.0F, -3.0F, 4.0F, 11.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6682F, 0.3879F, -0.2902F));
		PartDefinition cube_r37 = Body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(135, 59).addBox(4.0F, -25.0F, -3.0F, 4.0F, 11.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6682F, -0.3879F, 0.2902F));
		PartDefinition cube_r38 = Body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(66, 86).addBox(-4.0F, 43.0F, -12.0F, 8.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.8798F, 0.0F, 0.0F));
		PartDefinition cube_r39 = Body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 87).addBox(-4.0F, 44.0F, -15.0F, 8.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.7053F, 0.0F, 0.0F));
		PartDefinition cube_r40 = Body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(28, 96).addBox(-4.0F, 40.0F, 13.0F, 8.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.9199F, 0.0F, 0.0F));
		PartDefinition cube_r41 = Body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(94, 92).addBox(-4.0F, 29.0F, 21.0F, 8.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.4399F, 0.0F, 0.0F));
		PartDefinition cube_r42 = Body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(86, 21).addBox(-4.0F, 6.0F, 26.0F, 8.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7418F, 0.0F, 0.0F));
		PartDefinition cube_r43 = Body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(38, 76).addBox(-4.0F, -11.0F, 17.0F, 8.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r44 = Body.addOrReplaceChild("cube_r44",
				CubeListBuilder.create().texOffs(0, 41).addBox(-4.0F, -25.0F, 1.0F, 8.0F, 11.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(46, 41).addBox(-8.0F, -25.0F, -8.0F, 16.0F, 11.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r45 = Body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 76).addBox(-8.0F, -15.0F, -4.0F, 16.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r46 = Body.addOrReplaceChild("cube_r46",
				CubeListBuilder.create().texOffs(0, 41).addBox(-3.0F, -25.0F, -36.0F, 6.0F, 1.0F, 34.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-8.0F, -24.0F, -35.0F, 16.0F, 14.0F, 27.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7418F, 0.0F, 0.0F));
		PartDefinition frontbody = Body.addOrReplaceChild("frontbody", CubeListBuilder.create(), PartPose.offset(0.0F, -8.0F, -9.0F));
		PartDefinition cube_r47 = frontbody.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(107, 0).addBox(10.0F, -19.0F, -28.0F, 6.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7813F, 0.286F, -0.2729F));
		PartDefinition cube_r48 = frontbody.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(118, 30).addBox(-29.0F, -13.0F, -20.0F, 7.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8199F, -0.116F, 0.8601F));
		PartDefinition cube_r49 = frontbody.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(112, 119).addBox(22.0F, -13.0F, -20.0F, 7.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8199F, 0.116F, -0.8601F));
		PartDefinition cube_r50 = frontbody.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(125, 101).addBox(-3.0F, -33.0F, -27.0F, 6.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r51 = frontbody.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 123).addBox(-3.0F, -20.0F, -32.0F, 6.0F, 10.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7418F, 0.0F, 0.0F));
		PartDefinition cube_r52 = frontbody.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(26, 152).addBox(-3.0F, 6.0F, -34.0F, 6.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.7453F, 0.0F, 0.0F));
		PartDefinition cube_r53 = frontbody.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(90, 110).addBox(-16.0F, -19.0F, -28.0F, 6.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7813F, -0.286F, 0.2729F));
		PartDefinition Arm = partdefinition.addOrReplaceChild("Arm", CubeListBuilder.create().texOffs(77, 149).addBox(-2.0F, -4.0F, -3.0F, 5.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -11.0F, -13.0F, 0.7418F, 0.0F, -0.5236F));
		PartDefinition cube_r54 = Arm.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 105).addBox(-3.0F, -2.0F, -15.0F, 5.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4909F, -0.3435F, 0.0631F));
		PartDefinition cube_r55 = Arm.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(157, 79).addBox(-6.9F, 7.0F, -45.0F, 3.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -19.0F, 6.0F, 0.4663F, -0.1001F, -0.3775F));
		PartDefinition cube_r56 = Arm.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(137, 157).addBox(4.1F, 7.0F, -45.0F, 3.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -19.0F, 6.0F, 0.3036F, -0.3727F, 0.2868F));
		PartDefinition cube_r57 = Arm.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(152, 56).addBox(-0.9F, 9.0F, -45.0F, 3.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -19.0F, 6.0F, 0.3993F, -0.2667F, -0.0153F));
		PartDefinition cube_r58 = Arm.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(146, 21).addBox(-3.0F, -13.0F, -33.0F, 7.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2636F, -0.2663F, 0.0205F));
		PartDefinition cube_r59 = Arm.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(146, 39).addBox(-3.0F, -1.0F, -34.0F, 7.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3909F, -0.2663F, 0.0205F));
		PartDefinition cube_r60 = Arm.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(90, 129).addBox(-3.0F, 1.0F, -30.0F, 7.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8708F, -0.2663F, 0.0205F));
		PartDefinition cube_r61 = Arm.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(105, 74).addBox(-2.0F, 1.0F, -26.0F, 5.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6963F, -0.2663F, 0.0205F));
		PartDefinition Arm2 = partdefinition.addOrReplaceChild("Arm2", CubeListBuilder.create().texOffs(77, 149).mirror().addBox(-3.0F, -4.0F, -3.0F, 5.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-8.0F, -11.0F, -13.0F, 0.7418F, 0.0F, 0.5236F));
		PartDefinition cube_r62 = Arm2.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(0, 105).mirror().addBox(-2.0F, -2.0F, -15.0F, 5.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4909F, 0.3435F, -0.0631F));
		PartDefinition cube_r63 = Arm2.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(157, 79).mirror().addBox(3.9F, 7.0F, -45.0F, 3.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, -19.0F, 6.0F, 0.4663F, 0.1001F, 0.3775F));
		PartDefinition cube_r64 = Arm2.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(137, 157).mirror().addBox(-7.1F, 7.0F, -45.0F, 3.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, -19.0F, 6.0F, 0.3036F, 0.3727F, -0.2868F));
		PartDefinition cube_r65 = Arm2.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(152, 56).mirror().addBox(-2.1F, 9.0F, -45.0F, 3.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, -19.0F, 6.0F, 0.3993F, 0.2667F, 0.0153F));
		PartDefinition cube_r66 = Arm2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(146, 21).mirror().addBox(-4.0F, -13.0F, -33.0F, 7.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2636F, 0.2663F, -0.0205F));
		PartDefinition cube_r67 = Arm2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(146, 39).mirror().addBox(-4.0F, -1.0F, -34.0F, 7.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3909F, 0.2663F, -0.0205F));
		PartDefinition cube_r68 = Arm2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(90, 129).mirror().addBox(-4.0F, 1.0F, -30.0F, 7.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8708F, 0.2663F, -0.0205F));
		PartDefinition cube_r69 = Arm2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(105, 74).mirror().addBox(-3.0F, 1.0F, -26.0F, 5.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6963F, 0.2663F, -0.0205F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Arm2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.leg2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Arm2.yRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Arm.yRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
