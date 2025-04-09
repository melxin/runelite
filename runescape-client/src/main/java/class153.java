import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
public class class153 extends class148 {
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Lws;"
	)
	@Export("titlebuttonSprite")
	static IndexedSprite titlebuttonSprite;
	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "Lcc;"
	)
	@Export("decimator")
	static Decimator decimator;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1373180083
	)
	int field1740;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2007512231
	)
	int field1737;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 672487067
	)
	int field1738;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1073730913
	)
	int field1739;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	final class151 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfd;)V"
	)
	class153(class151 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lve;B)V",
		garbageValue = "53"
	)
	void vmethod3749(Buffer var1) {
		this.field1740 = var1.readInt();
		this.field1739 = var1.readInt();
		this.field1737 = var1.readUnsignedByte();
		this.field1738 = var1.readUnsignedByte();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgw;I)V",
		garbageValue = "1984465176"
	)
	void vmethod3750(ClanSettings var1) {
		var1.method3571(this.field1740, this.field1739, this.field1737, this.field1738);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-659778853"
	)
	public static boolean method3503() {
		ReflectionCheck var0 = (ReflectionCheck)class36.reflectionChecks.last();
		return var0 != null;
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;B)V",
		garbageValue = "-9"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		int var5 = var0 >>> 16;
		int var6 = var0 & 65535;
		Widget var7 = class232.widgetDefinition.getWidgetChild(var1, var2);
		if (var7 != null) {
			if (var7.onOp != null) {
				ScriptEvent var8 = new ScriptEvent();
				var8.widget = var7;
				var8.opIndex = var6;
				var8.field1091 = var5;
				var8.targetName = var4;
				var8.args = var7.onOp;
				class60.runScriptEvent(var8);
			}

			boolean var13 = true;
			if (var7.contentType > 0) {
				var13 = class210.method4717(var7);
			}

			if (var13) {
				int var10 = class31.getWidgetFlags(var7);
				int var11 = var6 - 1;
				boolean var9 = (var10 >> var11 + 1 & 1) != 0;
				if (var9) {
					PacketBufferNode var12;
					if (var0 == 1) {
						var12 = FloorDecoration.getPacketBufferNode(ClientPacket.IF_BUTTON1, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var0 == 2) {
						var12 = FloorDecoration.getPacketBufferNode(ClientPacket.IF_BUTTON2, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var0 == 3) {
						var12 = FloorDecoration.getPacketBufferNode(ClientPacket.IF_BUTTON3, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var0 == 4) {
						var12 = FloorDecoration.getPacketBufferNode(ClientPacket.IF_BUTTON4, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var0 == 5) {
						var12 = FloorDecoration.getPacketBufferNode(ClientPacket.IF_BUTTON5, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var0 == 6) {
						var12 = FloorDecoration.getPacketBufferNode(ClientPacket.IF_BUTTON6, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var0 == 7) {
						var12 = FloorDecoration.getPacketBufferNode(ClientPacket.IF_BUTTON7, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var0 == 8) {
						var12 = FloorDecoration.getPacketBufferNode(ClientPacket.IF_BUTTON8, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var0 == 9) {
						var12 = FloorDecoration.getPacketBufferNode(ClientPacket.IF_BUTTON9, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var0 == 10) {
						var12 = FloorDecoration.getPacketBufferNode(ClientPacket.IF_BUTTON10, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var12);
					}

					if (var5 != 0) {
						var12 = FloorDecoration.getPacketBufferNode(ClientPacket.IF_SUBOP, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						var12.packetBuffer.writeByte(var6);
						var12.packetBuffer.writeByte(var5 - 1);
						Client.packetWriter.addNode(var12);
					}

				}
			}
		}
	}

	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2099870514"
	)
	static final void method3511(int var0) {
		if (class232.widgetDefinition.loadInterface(var0)) {
			WorldViewManager.drawModelComponents(class232.widgetDefinition.Widget_interfaceComponents[var0], 0, class232.widgetDefinition.Widget_interfaceComponents[var0].length - 1, -1, -1);
		}
	}
}
