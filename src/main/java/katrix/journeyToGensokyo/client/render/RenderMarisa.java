/**
 * This class was created by <Katrix>. It's distributed as
 * part of the Journey To Gensokyo Mod. Get the Source Code in github:
 * https://github.com/Katrix-/JTG
 * 
 * Journey To Gensokyo is Open Source and distributed under the
 * a modifed Botania license: https://github.com/Katrix-/JTG/blob/master/LICENSE.md
 */
package katrix.journeyToGensokyo.client.render;

import katrix.journeyToGensokyo.client.model.ModelKasen;
import katrix.journeyToGensokyo.lib.LibMod;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderMarisa extends RenderTHBoss {
	
	//TODO: Proper texture and model
	ResourceLocation texture = new ResourceLocation(LibMod.MODID.toLowerCase(), "textures/entity/mob/Kasen.png");

	public RenderMarisa() {
		super(new ModelKasen(), 0.25F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return texture;
	}
}