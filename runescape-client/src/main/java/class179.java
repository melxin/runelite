import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
public class class179 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("field1915")
	static EvictingDualNodeHashTable field1915;
	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;

	static {
		field1915 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ab")
	public static final int method4208(double var0, double var2, double var4) {
		double var6 = var4;
		double var8 = var4;
		double var10 = var4;
		if (0.0D != var2) {
			double var12;
			if (var4 < 0.5D) {
				var12 = var4 * (var2 + 1.0D);
			} else {
				var12 = var2 + var4 - var4 * var2;
			}

			double var14 = var4 * 2.0D - var12;
			double var16 = 0.3333333333333333D + var0;
			if (var16 > 1.0D) {
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D;
			if (var20 < 0.0D) {
				++var20;
			}

			if (var16 * 6.0D < 1.0D) {
				var6 = var16 * (var12 - var14) * 6.0D + var14;
			} else if (2.0D * var16 < 1.0D) {
				var6 = var12;
			} else if (3.0D * var16 < 2.0D) {
				var6 = var14 + 6.0D * (0.6666666666666666D - var16) * (var12 - var14);
			} else {
				var6 = var14;
			}

			if (var0 * 6.0D < 1.0D) {
				var8 = 6.0D * (var12 - var14) * var0 + var14;
			} else if (2.0D * var0 < 1.0D) {
				var8 = var12;
			} else if (3.0D * var0 < 2.0D) {
				var8 = 6.0D * (var12 - var14) * (0.6666666666666666D - var0) + var14;
			} else {
				var8 = var14;
			}

			if (6.0D * var20 < 1.0D) {
				var10 = (var12 - var14) * 6.0D * var20 + var14;
			} else if (var20 * 2.0D < 1.0D) {
				var10 = var12;
			} else if (var20 * 3.0D < 2.0D) {
				var10 = (var12 - var14) * (0.6666666666666666D - var20) * 6.0D + var14;
			} else {
				var10 = var14;
			}
		}

		int var22 = (int)(256.0D * var6);
		int var13 = (int)(var8 * 256.0D);
		int var23 = (int)(var10 * 256.0D);
		int var15 = var23 + (var13 << 8) + (var22 << 16);
		return var15;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "737099831"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (var2 << 5) - var2 + Projectile.charToByteCp1252(var0.charAt(var3));
		}

		return var2;
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;B)V",
		garbageValue = "-29"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		int var5 = var0 >>> 16;
		int var6 = var0 & 65535;
		Widget var7 = class35.widgetDefinition.getWidgetChild(var1, var2);
		if (var7 != null) {
			if (var7.onOp != null) {
				ScriptEvent var8 = new ScriptEvent();
				var8.widget = var7;
				var8.opIndex = var6;
				var8.field876 = var5;
				var8.targetName = var4;
				var8.args = var7.onOp;
				class332.runScriptEvent(var8);
			}

			boolean var13 = true;
			if (var7.contentType > 0) {
				var13 = class113.method3527(var7);
			}

			if (var13) {
				int var10 = class338.getWidgetFlags2(var7);
				int var11 = var6 - 1;
				boolean var9 = (var10 >> var11 & 1) != 0;
				if (var9) {
					PacketBufferNode var12;
					if (var5 == 0) {
						var12 = HorizontalAlignment.getPacketBufferNode(ClientPacket.IF_BUTTONX, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						var12.packetBuffer.writeByte(var6);
						Client.packetWriter.addNode(var12);
					} else {
						var12 = HorizontalAlignment.getPacketBufferNode(ClientPacket.IF_SUBOP, Client.packetWriter.isaacCipher);
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
}
