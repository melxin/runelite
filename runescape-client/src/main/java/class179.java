import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
public class class179 extends DualNode {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("field1842")
	public static EvictingDualNodeHashTable field1842;
	@ObfuscatedName("ak")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;

	static {
		field1842 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1931393605"
	)
	public static void method4284() {
		class345.field3928.clear();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lky;IIIII)Z",
		garbageValue = "71331398"
	)
	static boolean method4285(Model var0, int var1, int var2, int var3, int var4) {
		AABB var5 = var0.getAABB(var1);
		int var6 = var2 + var5.xMid;
		int var7 = var3 + var5.yMid;
		int var8 = var4 + var5.zMid;
		int var9 = var5.xMidOffset;
		int var10 = var5.yMidOffset;
		int var11 = var5.zMidOffset;
		int var12 = SecureUrlRequester.field1536 - var6;
		int var13 = FloorUnderlayDefinition.field2216 - var7;
		int var14 = class339.field3865 - var8;
		if (Math.abs(var12) > var9 + class108.field1429) {
			return false;
		} else if (Math.abs(var13) > var10 + TileItem.field1203) {
			return false;
		} else if (Math.abs(var14) > var11 + class146.field1726) {
			return false;
		} else if (Math.abs(var14 * VarpDefinition.field1979 - var13 * Varcs.field1254) > var10 * class146.field1726 + var11 * TileItem.field1203) {
			return false;
		} else if (Math.abs(var12 * Varcs.field1254 - var14 * class142.field1704) > var11 * class108.field1429 + var9 * class146.field1726) {
			return false;
		} else {
			return Math.abs(var13 * class142.field1704 - var12 * VarpDefinition.field1979) <= var10 * class108.field1429 + var9 * TileItem.field1203;
		}
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(Lki;I)V",
		garbageValue = "2138742732"
	)
	static void method4287(class279 var0) {
		if (var0 != null && var0.field3227 != null) {
			if (var0.field3227.childIndex * 2077538819 >= 0) {
				Widget var1 = class226.widgetDefinition.method7728(var0.field3227.parentId);
				if (var1 == null || var1.children == null || var1.children.length == 0 || var0.field3227.childIndex * 2077538819 >= var1.children.length || var1.children[var0.field3227.childIndex * 2077538819] != var0.field3227) {
					return;
				}
			}

			if (var0.field3227.type == 11 && var0.field3231 == 0) {
				if (var0.field3227.method8182(var0.field3225, var0.field3226, 0, 0)) {
					var0.field3227.method8190().method5046().method5143(1, var0.field3227.method8190().method5017());
					switch(var0.field3227.method8198()) {
					case 0:
						class558.openURL(var0.field3227.method8231());
						break;
					case 1:
						if (WorldMapCacheName.method7092(class191.getWidgetFlags(var0.field3227))) {
							int[] var4 = var0.field3227.method8189();
							if (var4 != null) {
								PacketBufferNode var2 = ReflectionCheck.getPacketBufferNode(ClientPacket.IF_CRMVIEW, Client.packetWriter.isaacCipher);
								var2.packetBuffer.writeIntLE(var0.field3227.method8225());
								var2.packetBuffer.writeShortLE(var0.field3227.childIndex * 2077538819);
								var2.packetBuffer.writeIntIME(var4[2]);
								var2.packetBuffer.writeIntLE(var4[1]);
								var2.packetBuffer.writeIntIME(var4[0]);
								var2.packetBuffer.writeIntLE(var0.field3227.id);
								Client.packetWriter.addNode(var2);
							}
						}
					}
				}
			} else if (var0.field3227.type == 12) {
				class378 var3 = var0.field3227.method8194();
				if (var3 != null && var3.method7889()) {
					switch(var0.field3231) {
					case 0:
						Client.field442.method6267(var0.field3227);
						var3.method7840(true);
						var3.method8075(var0.field3225, var0.field3226, Client.indexCheck.isValidIndexInRange(82), Client.indexCheck.isValidIndexInRange(81));
						break;
					case 1:
						var3.method8022(var0.field3225, var0.field3226);
					}
				}
			}

		}
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(Ldd;IIIIII)V",
		garbageValue = "-2022739881"
	)
	static void method4283(WorldView var0, int var1, int var2, int var3, int var4, int var5) {
		NodeDeque var6 = var0.groundItems[var1][var2][var3];
		if (var6 != null) {
			for (TileItem var7 = (TileItem)var6.last(); var7 != null; var7 = (TileItem)var6.previous()) {
				if (var4 == var7.id && var5 == var7.quantity) {
					var7.remove();
					break;
				}
			}

			if (var6.last() == null) {
				var0.groundItems[var1][var2][var3] = null;
			}

			class348.updateItemPile2(var0, var1, var2, var3);
		}

	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)Z",
		garbageValue = "1"
	)
	static boolean method4286(int var0, int var1, int var2, int var3, int var4, int var5) {
		return class392.method8382(AsyncHttpResponse.worldView.plane, var0, var1, var2, var3, var4, var5);
	}
}
