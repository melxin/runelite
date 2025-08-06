import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
@Implements("Renderable")
public abstract class Renderable extends IndexedObjectNode {
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = 1899900991
	)
	@Export("height")
	public int height;

	protected Renderable() {
		this.height = 1000;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Ljx;",
		garbageValue = "15"
	)
	@Export("getModel")
	protected Model getModel() {
		return null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lif;",
		garbageValue = "1952103211"
	)
	protected class222 vmethod5351() {
		return class222.field2579;
	}

	@ObfuscatedName("fz")
	void vmethod5458(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
		Model var15 = this.getModel();
		if (var15 != null) {
			this.height = var15.height;
			var15.method5474(this.vmethod5351());
			var15.method5537(var1, var2, var3, var4 - var7, var5 - var8, var6 - var9, var10);
			var15.method5474(class222.field2579);
		}

	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(ILrr;IIIJ)V"
	)
	@Export("draw")
	void draw(int var1, TransformationMatrix var2, int var3, int var4, int var5, long var6) {
		Model var8 = this.getModel();
		if (var8 != null) {
			this.height = var8.height;
			var8.method5474(this.vmethod5351());
			var8.draw(var1, var2, var3, var4, var5, var6);
			var8.method5474(class222.field2579);
		}

	}

	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-326504425"
	)
	static final void method5364(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method4045()) {
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				PacketBufferNode var4 = class291.getPacketBufferNode(ClientPacket.CLAN_SETTINGS_SET_MUTED_FROM_CHANNEL, Client.packetWriter.isaacCipher);
				var4.packetBuffer.writeByte(4 + class283.stringCp1252NullTerminatedByteSize(var3.username.getName()));
				var4.packetBuffer.writeByte(var0);
				var4.packetBuffer.writeShort(var1);
				var4.packetBuffer.writeBoolean(var2);
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName());
				Client.packetWriter.addNode(var4);
			}
		}
	}

	@ObfuscatedName("op")
	@ObfuscatedSignature(
		descriptor = "(Lox;IB)Ljava/lang/String;",
		garbageValue = "1"
	)
	static String method5348(Widget var0, int var1) {
		if (!AbstractWorldMapIcon.method6880(SequenceDefinition.method4771(var0), var1) && var0.onOp == null) {
			return null;
		} else {
			return var0.actions != null && var0.actions.length > var1 && var0.actions[var1] != null && !var0.actions[var1].trim().isEmpty() ? var0.actions[var1] : null;
		}
	}
}
