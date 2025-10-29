import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vy")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	static ClanSettings field5871;
	@ObfuscatedName("ak")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full");
		FontName_plain12 = new FontName("p12_full");
		FontName_bold12 = new FontName("b12_full");
		FontName_verdana11 = new FontName("verdana_11pt_regular");
		FontName_verdana13 = new FontName("verdana_13pt_regular");
		FontName_verdana15 = new FontName("verdana_15pt_regular");
	}

	FontName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-19"
	)
	public static int method11264(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(FFFFS)F",
		garbageValue = "28245"
	)
	static final float method11268(float var0, float var1, float var2, float var3) {
		return var2 * var1 + var3 * var0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ldd;IIILoz;B)V",
		garbageValue = "83"
	)
	static void method11267(WorldView var0, int var1, int var2, int var3, SpriteMask var4) {
		for (int var5 = 0; var5 < var0.field1130.method10038(); ++var5) {
			NPC var6 = (NPC)var0.npcs.get((long)var0.field1130.method10037(var5));
			if (var6 != null && var6.isVisible()) {
				NPCComposition var7 = var6.definition;
				if (var7 != null && var7.transforms != null) {
					var7 = var7.transform();
				}

				if (var7 != null && var7.drawMapDot && var7.isInteractable) {
					ProjectionCoord var8 = class86.method2932(var0, var6.x, var6.y);
					int var9 = (int)var8.x;
					int var10 = (int)var8.y;
					var8.release();
					int var11 = var9 / 32 - Client.field468 / 32;
					int var12 = var10 / 32 - Client.field512 / 32;
					SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var11, var12, var3, class579.field5923[1], var4);
				}
			}
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILcu;ZI)I",
		garbageValue = "-739147715"
	)
	static int method11266(int var0, Script var1, boolean var2) {
		if (var0 < 1000) {
			return class155.method3998(var0, var1, var2);
		} else if (var0 < 1100) {
			return class329.method7258(var0, var1, var2);
		} else if (var0 < 1200) {
			return class575.method11318(var0, var1, var2);
		} else if (var0 < 1300) {
			return Varcs.method3021(var0, var1, var2);
		} else if (var0 < 1400) {
			return class343.method7339(var0, var1, var2);
		} else if (var0 < 1500) {
			return LoginPacket.method3954(var0, var1, var2);
		} else if (var0 < 1600) {
			return EnumComposition.method4440(var0, var1, var2);
		} else if (var0 < 1700) {
			return class413.method8517(var0, var1, var2);
		} else if (var0 < 1800) {
			return HttpResponse.method312(var0, var1, var2);
		} else if (var0 < 1900) {
			return Language.method8940(var0, var1, var2);
		} else if (var0 < 2000) {
			return class39.method813(var0, var1, var2);
		} else if (var0 < 2100) {
			return class329.method7258(var0, var1, var2);
		} else if (var0 < 2200) {
			return class575.method11318(var0, var1, var2);
		} else if (var0 < 2300) {
			return Varcs.method3021(var0, var1, var2);
		} else if (var0 < 2400) {
			return class343.method7339(var0, var1, var2);
		} else if (var0 < 2500) {
			return LoginPacket.method3954(var0, var1, var2);
		} else if (var0 < 2600) {
			return ScriptFrame.method747(var0, var1, var2);
		} else if (var0 < 2700) {
			return class161.method4048(var0, var1, var2);
		} else if (var0 < 2800) {
			return class165.method4147(var0, var1, var2);
		} else if (var0 < 2900) {
			return class180.method4289(var0, var1, var2);
		} else if (var0 < 3000) {
			return class39.method813(var0, var1, var2);
		} else if (var0 < 3200) {
			return class431.method8838(var0, var1, var2);
		} else if (var0 < 3300) {
			return GameObject.method6263(var0, var1, var2);
		} else if (var0 < 3400) {
			return class101.method3259(var0, var1, var2);
		} else if (var0 < 3500) {
			return class379.method8113(var0, var1, var2);
		} else if (var0 < 3600) {
			return RestClientThreadFactory.method208(var0, var1, var2);
		} else if (var0 < 3700) {
			return Buddy.method10385(var0, var1, var2);
		} else if (var0 < 3800) {
			return class138.method3831(var0, var1, var2);
		} else if (var0 < 3900) {
			return FillMode.method12096(var0, var1, var2);
		} else if (var0 < 4000) {
			return AbstractByteArrayCopier.method7620(var0, var1, var2);
		} else if (var0 < 4100) {
			return VerticalAlignment.method4548(var0, var1, var2);
		} else if (var0 < 4200) {
			return Huffman.method7642(var0, var1, var2);
		} else if (var0 < 4300) {
			return class143.method3891(var0, var1, var2);
		} else if (var0 < 5100) {
			return ScriptFrame.method746(var0, var1, var2);
		} else if (var0 < 5400) {
			return FloorOverlayDefinition.method4917(var0, var1, var2);
		} else if (var0 < 5600) {
			return class1.method11(var0, var1, var2);
		} else if (var0 < 5700) {
			return class50.method1943(var0, var1, var2);
		} else if (var0 < 6300) {
			return class338.method7283(var0, var1, var2);
		} else if (var0 < 6600) {
			return HealthBarUpdate.method2589(var0, var1, var2);
		} else if (var0 < 6700) {
			return class291.method6571(var0, var1, var2);
		} else if (var0 < 6800) {
			return class156.method4002(var0, var1, var2);
		} else if (var0 < 6900) {
			return HealthBarConfig.method2806(var0, var1, var2);
		} else if (var0 < 7000) {
			return AsyncRestClient.method174(var0, var1, var2);
		} else if (var0 < 7100) {
			return class545.method10890(var0, var1, var2);
		} else if (var0 < 7200) {
			return UserComparator6.method3747(var0, var1, var2);
		} else if (var0 < 7500) {
			return class207.method4659(var0, var1, var2);
		} else if (var0 < 7600) {
			return ObjectSound.method2381(var0, var1, var2);
		} else if (var0 < 7700) {
			return ArchiveDiskActionHandler.method8529(var0, var1, var2);
		} else if (var0 < 8000) {
			return class342.method7323(var0, var1, var2);
		} else if (var0 < 8100) {
			return class101.method3261(var0, var1, var2);
		} else {
			return var0 >= 13000 && var0 < 14000 ? class209.method4665(var0, var1, var2) : 2;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-103"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count;
		}
	}

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;I)V",
		garbageValue = "-1376442236"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		int var5 = var0 >>> 16;
		int var6 = var0 & 65535;
		Widget var7 = class226.widgetDefinition.getWidgetChild(var1, var2);
		if (var7 != null) {
			if (var7.onOp != null) {
				ScriptEvent var8 = new ScriptEvent();
				var8.widget = var7;
				var8.opIndex = var6;
				var8.field852 = var5;
				var8.targetName = var4;
				var8.args = var7.onOp;
				class141.runScriptEvent(var8);
			}

			boolean var13 = true;
			if (var7.contentType > 0) {
				var13 = class557.method10965(var7);
			}

			if (var13) {
				int var10 = class69.getWidgetFlags2(var7);
				int var11 = var6 - 1;
				boolean var9 = (var10 >> var11 & 1) != 0;
				if (var9) {
					PacketBufferNode var12;
					if (var5 == 0) {
						var12 = ReflectionCheck.getPacketBufferNode(ClientPacket.IF_BUTTONX, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeInt(var1);
						var12.packetBuffer.writeShort(var2);
						var12.packetBuffer.writeShort(var3);
						var12.packetBuffer.writeByte(var6);
						Client.packetWriter.addNode(var12);
					} else {
						var12 = ReflectionCheck.getPacketBufferNode(ClientPacket.IF_SUBOP, Client.packetWriter.isaacCipher);
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
