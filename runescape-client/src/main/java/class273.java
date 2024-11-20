import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ko")
public class class273 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	static IndexedSprite field3054;
	@ObfuscatedName("ab")
	final int[][] field3052;
	@ObfuscatedName("aw")
	final int[][] field3049;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1842186573
	)
	int field3050;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1198077907
	)
	int field3047;
	@ObfuscatedName("ao")
	final int[] field3051;
	@ObfuscatedName("ac")
	final int[] field3048;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -373159905
	)
	final int field3053;

	class273(int var1, int var2) {
		this.field3052 = new int[var1][var2];
		this.field3049 = new int[var1][var2];
		int var3 = var2 * var1;
		int var4 = ServerPacket.method6470(var3 / 4);
		this.field3051 = new int[var4];
		this.field3048 = new int[var4];
		this.field3053 = var4 - 1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "195180083"
	)
	void method5652() {
		for (int var1 = 0; var1 < this.field3052.length; ++var1) {
			for (int var2 = 0; var2 < this.field3052[var1].length; ++var2) {
				this.field3052[var1][var2] = 0;
				this.field3049[var1][var2] = 99999999;
			}
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "83105754"
	)
	void method5666(int var1, int var2) {
		this.field3050 = var1;
		this.field3047 = var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-96"
	)
	int method5654() {
		return this.field3050;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2026249287"
	)
	int method5665() {
		return this.field3047;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1779887238"
	)
	int method5656() {
		return this.field3052.length;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-35"
	)
	int method5657() {
		return this.field3052[0].length;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "1883549417"
	)
	int[][] method5673() {
		return this.field3052;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)[[I",
		garbageValue = "-117"
	)
	int[][] method5658() {
		return this.field3049;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1025559529"
	)
	int[] method5659() {
		return this.field3051;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-813332152"
	)
	int[] method5660() {
		return this.field3048;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2065745533"
	)
	int method5661() {
		return this.field3053;
	}

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIZI)V",
		garbageValue = "-653134452"
	)
	@Export("addTileItemToGroundItems")
	static void addTileItemToGroundItems(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		TileItem var10 = new TileItem();
		var10.id = var3;
		var10.quantity = var4;
		var10.setFlag(var5);
		var10.visibleTime = Client.serverCycle + var6;
		var10.despawnTime = var7 + Client.serverCycle;
		var10.ownership = var8;
		var10.isPrivate = var9;
		if (Projection.worldView.groundItems[var0][var1][var2] == null) {
			Projection.worldView.groundItems[var0][var1][var2] = new NodeDeque();
		}

		Projection.worldView.groundItems[var0][var1][var2].addFirst(var10);
		class173.updateItemPile(var0, var1, var2);
	}
}
