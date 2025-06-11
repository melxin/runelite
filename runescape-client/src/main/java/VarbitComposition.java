import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("ap")
	static final int[] field2164;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("VarbitDefinition_cached")
	public static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("pk")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 513673625
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1071189655
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1701175277
	)
	@Export("endBit")
	public int endBit;

	static {
		field2164 = new int[32];
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64);
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			field2164[var1] = var0 - 1;
			var0 += var0;
		}

	}

	VarbitComposition() {
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "-1073178354"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lwt;II)V",
		garbageValue = "291208249"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.baseVar = var1.readUnsignedShort();
			this.startBit = var1.readUnsignedByte();
			this.endBit = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1968824318"
	)
	public static int method4309(int var0) {
		if (var0 > 0) {
			return 1;
		} else {
			return var0 < 0 ? -1 : 0;
		}
	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;I)V",
		garbageValue = "1537085852"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		int var5 = var0 >>> 16;
		int var6 = var0 & 65535;
		Widget var7 = ClientPreferences.widgetDefinition.getWidgetChild(var1, var2);
		if (var7 != null) {
			if (var7.onOp != null) {
				ScriptEvent var8 = new ScriptEvent();
				var8.widget = var7;
				var8.opIndex = var6;
				var8.field895 = var5;
				var8.targetName = var4;
				var8.args = var7.onOp;
				ModeWhere.runScriptEvent(var8);
			}

			boolean var10 = true;
			if (var7.contentType > 0) {
				var10 = HttpMethod.method75(var7);
			}

			if (var10) {
				if (class138.method3579(GrandExchangeOfferOwnWorldComparator.getWidgetFlags2(var7), var6 - 1)) {
					PacketBufferNode var9;
					if (class574.field5666 <= 230) {
						if (var0 == 1) {
							var9 = class139.getPacketBufferNode(ClientPacket.IF_BUTTON1, Client.packetWriter.isaacCipher);
							var9.packetBuffer.writeInt(var1);
							var9.packetBuffer.writeShort(var2);
							var9.packetBuffer.writeShort(var3);
							Client.packetWriter.addNode(var9);
						}

						if (var0 == 2) {
							var9 = class139.getPacketBufferNode(ClientPacket.IF_BUTTON2, Client.packetWriter.isaacCipher);
							var9.packetBuffer.writeInt(var1);
							var9.packetBuffer.writeShort(var2);
							var9.packetBuffer.writeShort(var3);
							Client.packetWriter.addNode(var9);
						}

						if (var0 == 3) {
							var9 = class139.getPacketBufferNode(ClientPacket.IF_BUTTON3, Client.packetWriter.isaacCipher);
							var9.packetBuffer.writeInt(var1);
							var9.packetBuffer.writeShort(var2);
							var9.packetBuffer.writeShort(var3);
							Client.packetWriter.addNode(var9);
						}

						if (var0 == 4) {
							var9 = class139.getPacketBufferNode(ClientPacket.IF_BUTTON4, Client.packetWriter.isaacCipher);
							var9.packetBuffer.writeInt(var1);
							var9.packetBuffer.writeShort(var2);
							var9.packetBuffer.writeShort(var3);
							Client.packetWriter.addNode(var9);
						}

						if (var0 == 5) {
							var9 = class139.getPacketBufferNode(ClientPacket.IF_BUTTON5, Client.packetWriter.isaacCipher);
							var9.packetBuffer.writeInt(var1);
							var9.packetBuffer.writeShort(var2);
							var9.packetBuffer.writeShort(var3);
							Client.packetWriter.addNode(var9);
						}

						if (var0 == 6) {
							var9 = class139.getPacketBufferNode(ClientPacket.IF_BUTTON6, Client.packetWriter.isaacCipher);
							var9.packetBuffer.writeInt(var1);
							var9.packetBuffer.writeShort(var2);
							var9.packetBuffer.writeShort(var3);
							Client.packetWriter.addNode(var9);
						}

						if (var0 == 7) {
							var9 = class139.getPacketBufferNode(ClientPacket.IF_BUTTON7, Client.packetWriter.isaacCipher);
							var9.packetBuffer.writeInt(var1);
							var9.packetBuffer.writeShort(var2);
							var9.packetBuffer.writeShort(var3);
							Client.packetWriter.addNode(var9);
						}

						if (var0 == 8) {
							var9 = class139.getPacketBufferNode(ClientPacket.IF_BUTTON8, Client.packetWriter.isaacCipher);
							var9.packetBuffer.writeInt(var1);
							var9.packetBuffer.writeShort(var2);
							var9.packetBuffer.writeShort(var3);
							Client.packetWriter.addNode(var9);
						}

						if (var0 == 9) {
							var9 = class139.getPacketBufferNode(ClientPacket.IF_BUTTON9, Client.packetWriter.isaacCipher);
							var9.packetBuffer.writeInt(var1);
							var9.packetBuffer.writeShort(var2);
							var9.packetBuffer.writeShort(var3);
							Client.packetWriter.addNode(var9);
						}

						if (var0 == 10) {
							var9 = class139.getPacketBufferNode(ClientPacket.IF_BUTTON10, Client.packetWriter.isaacCipher);
							var9.packetBuffer.writeInt(var1);
							var9.packetBuffer.writeShort(var2);
							var9.packetBuffer.writeShort(var3);
							Client.packetWriter.addNode(var9);
						}
					} else if (var5 == 0) {
						var9 = class139.getPacketBufferNode(ClientPacket.IF_BUTTONX, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeInt(var1);
						var9.packetBuffer.writeShort(var2);
						var9.packetBuffer.writeShort(var3);
						var9.packetBuffer.writeByte(var6);
						Client.packetWriter.addNode(var9);
					}

					if (var5 != 0) {
						var9 = class139.getPacketBufferNode(ClientPacket.IF_SUBOP, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeInt(var1);
						var9.packetBuffer.writeShort(var2);
						var9.packetBuffer.writeShort(var3);
						var9.packetBuffer.writeByte(var6);
						var9.packetBuffer.writeByte(var5 - 1);
						Client.packetWriter.addNode(var9);
					}

				}
			}
		}
	}
}
