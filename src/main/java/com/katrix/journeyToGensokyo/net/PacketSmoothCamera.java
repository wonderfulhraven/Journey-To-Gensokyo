/**
 * This class was created by <Katrix>. It's distributed as
 * part of the Journey To Gensokyo Mod. Get the Source Code in github:
 * https://github.com/Katrix-/JTG
 * 
 * Journey To Gensokyo is Open Source and distributed under the
 * a modifed Botania license: https://github.com/Katrix-/JTG/blob/master/LICENSE.md
 */

package com.katrix.journeyToGensokyo.net;

import io.netty.buffer.ByteBuf;
import cpw.mods.fml.common.network.simpleimpl.IMessage;

public class PacketSmoothCamera implements IMessage {

	public boolean SmoothOn;
	
	public PacketSmoothCamera() {}
	
	public PacketSmoothCamera(boolean SmoothOn) {
		this.SmoothOn = SmoothOn;
	}
	
	@Override
	public void toBytes(ByteBuf buf){
		buf.writeBoolean(SmoothOn);
	}
	
	@Override
	public void fromBytes(ByteBuf buf) {
		this.SmoothOn = buf.readBoolean();
	}
}
