
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arkimedian.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.arkimedian.client.model.Modelxentanive;
import net.mcreator.arkimedian.client.model.Modelsynrillic;
import net.mcreator.arkimedian.client.model.Modelsicarion_starship;
import net.mcreator.arkimedian.client.model.Modelmmfourfourtwoone;
import net.mcreator.arkimedian.client.model.Modelmentriolite_golem;
import net.mcreator.arkimedian.client.model.Modelgvral_solider;
import net.mcreator.arkimedian.client.model.Modelgrelhound;
import net.mcreator.arkimedian.client.model.Modelgnirilion;
import net.mcreator.arkimedian.client.model.Modelfur_thing;
import net.mcreator.arkimedian.client.model.Modeldocreanitile;
import net.mcreator.arkimedian.client.model.ModelAstrophage;
import net.mcreator.arkimedian.client.model.ModelArmor;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ArkimedianModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelgrelhound.LAYER_LOCATION, Modelgrelhound::createBodyLayer);
		event.registerLayerDefinition(Modelsicarion_starship.LAYER_LOCATION, Modelsicarion_starship::createBodyLayer);
		event.registerLayerDefinition(Modelmentriolite_golem.LAYER_LOCATION, Modelmentriolite_golem::createBodyLayer);
		event.registerLayerDefinition(Modelmmfourfourtwoone.LAYER_LOCATION, Modelmmfourfourtwoone::createBodyLayer);
		event.registerLayerDefinition(ModelAstrophage.LAYER_LOCATION, ModelAstrophage::createBodyLayer);
		event.registerLayerDefinition(Modelgnirilion.LAYER_LOCATION, Modelgnirilion::createBodyLayer);
		event.registerLayerDefinition(Modeldocreanitile.LAYER_LOCATION, Modeldocreanitile::createBodyLayer);
		event.registerLayerDefinition(Modelxentanive.LAYER_LOCATION, Modelxentanive::createBodyLayer);
		event.registerLayerDefinition(Modelgvral_solider.LAYER_LOCATION, Modelgvral_solider::createBodyLayer);
		event.registerLayerDefinition(Modelsynrillic.LAYER_LOCATION, Modelsynrillic::createBodyLayer);
		event.registerLayerDefinition(ModelArmor.LAYER_LOCATION, ModelArmor::createBodyLayer);
		event.registerLayerDefinition(Modelfur_thing.LAYER_LOCATION, Modelfur_thing::createBodyLayer);
	}
}
