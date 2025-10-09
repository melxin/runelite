import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kr")
public class class263 extends class269 {
	@ObfuscatedName("ab")
	String field3133;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	final class266 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lkt;Ljava/lang/String;Ljava/lang/String;)V"
	)
	class263(class266 var1, String var2, String var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field3133 = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1493842566"
	)
	public int vmethod6072() {
		return 1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "25"
	)
	public String vmethod6071() {
		return this.field3133;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2081778864"
	)
	static int method5980(int var0) {
		return -var0 - 1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "57"
	)
	public static void method5982(int var0, int var1) {
		VarbitComposition var2 = class275.method6241(var0);
		int var3 = var2.baseVar;
		int var4 = var2.startBit;
		int var5 = var2.endBit;
		int var6 = Varps.Varps_masks[var5 - var4];
		if (var1 < 0 || var1 > var6) {
			var1 = 0;
		}

		var6 <<= var4;
		Varps.Varps_main[var3] = Varps.Varps_main[var3] & ~var6 | var1 << var4 & var6;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIZI)Ljava/lang/String;",
		garbageValue = "-1589619253"
	)
	static String method5981(int var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			if (var2 && var0 >= 0) {
				int var3 = 2;

				for (int var4 = var0 / var1; var4 != 0; ++var3) {
					var4 /= var1;
				}

				char[] var5 = new char[var3];
				var5[0] = '+';

				for (int var6 = var3 - 1; var6 > 0; --var6) {
					int var7 = var0;
					var0 /= var1;
					int var8 = var7 - var0 * var1;
					if (var8 >= 10) {
						var5[var6] = (char)(var8 + 87);
					} else {
						var5[var6] = (char)(var8 + 48);
					}
				}

				return new String(var5);
			} else {
				return Integer.toString(var0, var1);
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ltl;II)V",
		garbageValue = "-1234623695"
	)
	public static void method5975(DynamicArray var0, int var1) {
		PacketBufferNode.method7052(var0, (class572)null, true);
		int var2 = var0.method10433();
		if (var2 > 1) {
			var1 %= var2;
			if (var1 != 0) {
				if (var1 < 0) {
					var1 += var2;
				}

				if (var0.field5571 == class572.field5879) {
					int[] var3 = var0.method10430();
					class167.method4104(var3, 0, var2 - 1);
					class167.method4104(var3, 0, var1 - 1);
					class167.method4104(var3, var1, var2 - 1);
				} else if (var0.field5571 == class572.field5878) {
					long[] var4 = var0.method10431();
					class149.method3896(var4, 0, var2 - 1);
					class149.method3896(var4, 0, var1 - 1);
					class149.method3896(var4, var1, var2 - 1);
				} else {
					Object[] var5 = var0.method10428();
					class67.method2192(var5, 0, var2 - 1);
					class67.method2192(var5, 0, var1 - 1);
					class67.method2192(var5, var1, var2 - 1);
				}

			}
		}
	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(Ldm;IIII)V",
		garbageValue = "224458319"
	)
	@Export("updateItemPile2")
	static final void updateItemPile2(WorldView var0, int var1, int var2, int var3) {
		NodeDeque var4 = var0.groundItems[var1][var2][var3];
		if (var4 == null) {
			var0.scene.removeGroundItemPile(var1, var2, var3);
		} else {
			long var5 = -99999999L;
			TileItem var7 = null;

			TileItem var8;
			for (var8 = (TileItem)var4.last(); var8 != null; var8 = (TileItem)var4.previous()) {
				ItemComposition var9 = WorldMapIcon_1.ItemDefinition_get(var8.id);
				long var35 = (long)var9.price;
				if (var9.isStackable == 1) {
					var35 *= var8.quantity < Integer.MAX_VALUE ? (long)(var8.quantity + 1) : (long)var8.quantity;
				}

				if (var35 > var5) {
					var5 = var35;
					var7 = var8;
				}
			}

			if (var7 == null) {
				var0.scene.removeGroundItemPile(var1, var2, var3);
			} else {
				var4.addLast(var7);
				TileItem var37 = null;
				TileItem var10 = null;

				for (var8 = (TileItem)var4.last(); var8 != null; var8 = (TileItem)var4.previous()) {
					if (var7.id != var8.id) {
						if (var37 == null) {
							var37 = var8;
						}

						if (var37.id != var8.id && var10 == null) {
							var10 = var8;
						}
					}
				}

				int var12 = var2 * 128;
				int var13 = var3 * 128;
				class450 var14 = IndexCheck.method6169((float)var12, (float)var0.tileHeights[var1][var2][var3], (float)var13);
				class450 var15 = IndexCheck.method6169((float)(var12 + 128), (float)var0.tileHeights[var1][var2 + 1][var3], (float)var13);
				class450 var16 = IndexCheck.method6169((float)(var12 + 128), (float)var0.tileHeights[var1][var2 + 1][var3 + 1], (float)(var13 + 128));
				class450 var17 = IndexCheck.method6169((float)var12, (float)var0.tileHeights[var1][var2][var3 + 1], (float)(var13 + 128));
				class450 var11;
				if (var15.field5218 == var14.field5218 && var16.field5218 == var14.field5218 && var14.field5218 == var17.field5218) {
					var14.method9065();
					var15.method9065();
					var16.method9065();
					var17.method9065();
					var11 = class450.field5220;
				} else {
					class450 var19 = NPC.method2793(var15);
					var19.method9073(var14);
					class450 var21 = NPC.method2793(var17);
					var21.method9073(var14);
					class450 var22 = NPC.method2851(var19, var21);
					var19.method9065();
					var21.method9065();
					class450 var24 = NPC.method2793(var15);
					var24.method9073(var16);
					class450 var26 = NPC.method2793(var17);
					var26.method9073(var16);
					class450 var27 = NPC.method2851(var26, var24);
					var24.method9065();
					var26.method9065();
					var14.method9065();
					var15.method9065();
					var16.method9065();
					var17.method9065();
					class450 var28 = class302.method6840(var22, var27);
					var22.method9065();
					var27.method9065();
					class450 var30 = class147.method3882();
					float var31 = 1.0F / var28.method9076();
					var30.field5216 = var28.field5216 * var31;
					var30.field5218 = var31 * var28.field5218;
					var30.field5219 = var31 * var28.field5219;
					var28.method9065();
					var11 = var30;
				}

				var7.method2891(var11);
				if (var37 != null) {
					var37.method2891(var11);
				}

				if (var10 != null) {
					var10.method2891(var11);
				}

				long var33 = ClanChannelMember.calculateTag(var1, var2, var3, 3, false, 0, var0.id);
				var0.scene.newGroundItemPile(var1, var2, var3, class280.getTileHeight(var0, Coord.method7425(var2), Coord.method7425(var3), var1), var7, var33, var37, var10);
			}
		}
	}
}
