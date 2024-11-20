import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bm")
public class class27 {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 171071981
	)
	static int field124;
	@ObfuscatedName("jr")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;
	@ObfuscatedName("vx")
	@ObfuscatedGetter(
		longValue = 1308044529702660249L
	)
	static long field130;
	@ObfuscatedName("aj")
	int[] field122;
	@ObfuscatedName("av")
	int[] field123;

	public class27() {
		this.field122 = new int[112];
		this.field123 = new int[192];
		Arrays.fill(this.field122, 3);
		Arrays.fill(this.field123, 3);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-535221713"
	)
	public void method387(int var1, int var2) {
		if (this.method384(var1) && this.method374(var2)) {
			this.field122[var1] = var2;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(CII)V",
		garbageValue = "671506267"
	)
	public void method364(char var1, int var2) {
		if (this.method372(var1) && this.method374(var2)) {
			this.field123[var1] = var2;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "94"
	)
	public int method365(int var1) {
		return this.method384(var1) ? this.field122[var1] : 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(CI)I",
		garbageValue = "1830962979"
	)
	public int method366(char var1) {
		return this.method372(var1) ? this.field123[var1] : 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2091924671"
	)
	public boolean method400(int var1) {
		return this.method384(var1) && (this.field122[var1] == 1 || this.field122[var1] == 3);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1451263022"
	)
	public boolean method368(char var1) {
		return this.method372(var1) && (this.field123[var1] == 1 || this.field123[var1] == 3);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2006138044"
	)
	public boolean method369(int var1) {
		return this.method384(var1) && (this.field122[var1] == 2 || this.field122[var1] == 3);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "710623073"
	)
	public boolean method370(char var1) {
		return this.method372(var1) && (this.field123[var1] == 2 || this.field123[var1] == 3);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-483597617"
	)
	boolean method384(int var1) {
		if (var1 >= 0 && var1 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-255080526"
	)
	boolean method372(char var1) {
		if (var1 >= 0 && var1 < 192) {
			return true;
		} else {
			System.out.println("Invalid keychar: " + var1);
			return false;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "55"
	)
	boolean method374(int var1) {
		if (var1 >= 0 && var1 < 4) {
			return true;
		} else {
			System.out.println("Invalid mode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-2"
	)
	static int method402(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 > 127) {
				var1 = 127;
			}

			var1 = 127 - var1;
			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z",
		garbageValue = "-1293117627"
	)
	static boolean method398(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		Scene var7 = Projection.worldView.scene;
		int var9;
		if (var5 == class384.field4492.field4491) {
			BoundaryObject var8 = var7.getBoundaryObject(var0, var1, var2);
			if (var8 != null) {
				var9 = class137.Entity_unpackID(var8.tag);
				if (var3 == WorldMapDecorationType.field4067.id) {
					var8.renderable1 = new DynamicObject(Projection.worldView, var9, 2, var4 + 4, var0, var1, var2, var6, false, var8.renderable1);
					var8.renderable2 = new DynamicObject(Projection.worldView, var9, 2, var4 + 1 & 3, var0, var1, var2, var6, false, var8.renderable2);
				} else {
					var8.renderable1 = new DynamicObject(Projection.worldView, var9, var3, var4, var0, var1, var2, var6, false, var8.renderable1);
				}

				return true;
			}
		} else if (var5 == class384.field4490.field4491) {
			WallDecoration var10 = var7.getWallDecoration(var0, var1, var2);
			if (var10 != null) {
				var9 = class137.Entity_unpackID(var10.tag);
				if (var3 != WorldMapDecorationType.field4053.id && var3 != WorldMapDecorationType.field4054.id) {
					if (var3 == WorldMapDecorationType.field4055.id) {
						var10.renderable1 = new DynamicObject(Projection.worldView, var9, 4, var4 + 4, var0, var1, var2, var6, false, var10.renderable1);
					} else if (var3 == WorldMapDecorationType.field4056.id) {
						var10.renderable1 = new DynamicObject(Projection.worldView, var9, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var10.renderable1);
					} else if (var3 == WorldMapDecorationType.field4057.id) {
						var10.renderable1 = new DynamicObject(Projection.worldView, var9, 4, var4 + 4, var0, var1, var2, var6, false, var10.renderable1);
						var10.renderable2 = new DynamicObject(Projection.worldView, var9, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var10.renderable2);
					}
				} else {
					var10.renderable1 = new DynamicObject(Projection.worldView, var9, 4, var4, var0, var1, var2, var6, false, var10.renderable1);
				}

				return true;
			}
		} else if (var5 == class384.field4494.field4491) {
			GameObject var11 = var7.getGameObject(var0, var1, var2);
			if (var3 == WorldMapDecorationType.field4049.id) {
				var3 = WorldMapDecorationType.field4068.id;
			}

			if (var11 != null) {
				var11.renderable = new DynamicObject(Projection.worldView, class137.Entity_unpackID(var11.tag), var3, var4, var0, var1, var2, var6, false, var11.renderable);
				return true;
			}
		} else if (var5 == class384.field4493.field4491) {
			FloorDecoration var12 = var7.getFloorDecoration(var0, var1, var2);
			if (var12 != null) {
				var12.renderable = new DynamicObject(Projection.worldView, class137.Entity_unpackID(var12.tag), 22, var4, var0, var1, var2, var6, false, var12.renderable);
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "([BII)V",
		garbageValue = "-2141756912"
	)
	static void method377(byte[] var0, int var1) {
		if (Client.randomDatData == null) {
			Client.randomDatData = new byte[24];
		}

		class451.writeRandomDat(var0, var1, Client.randomDatData, 0, 24);
	}

	@ObfuscatedName("pl")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "40"
	)
	static void method382() {
		if (Client.oculusOrbState == 1) {
			Client.field612 = true;
		}

	}

	@ObfuscatedName("pa")
	@ObfuscatedSignature(
		descriptor = "(I)Lpl;",
		garbageValue = "-664248238"
	)
	static JagNetThread method396() {
		return GrandExchangeOfferTotalQuantityComparator.field4633;
	}
}
