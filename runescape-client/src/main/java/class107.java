import java.awt.datatransfer.Clipboard;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
public class class107 extends Node {
	@ObfuscatedName("ah")
	@Export("javaVersion")
	public static String javaVersion;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1964791523
	)
	static int field1425;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	class101 field1426;

	public class107() {
		this.field1426 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(Leh;)V"
	)
	class107(VorbisSample var1) {
		if (var1 != null) {
			this.field1426 = new class101(var1, (RawSound)null);
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Ldi;)V"
	)
	public class107(RawSound var1) {
		this.field1426 = new class101((VorbisSample)null, var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1994394270"
	)
	public boolean method3422() {
		return this.field1426 == null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ldi;",
		garbageValue = "774403992"
	)
	public RawSound method3423() {
		if (this.field1426 != null && this.field1426.field1386.tryLock()) {
			RawSound var1;
			try {
				var1 = this.method3425();
			} finally {
				this.field1426.field1386.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Ldi;",
		garbageValue = "20232852"
	)
	public RawSound method3424() {
		if (this.field1426 != null) {
			this.field1426.field1386.lock();

			RawSound var1;
			try {
				var1 = this.method3425();
			} finally {
				this.field1426.field1386.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Ldi;",
		garbageValue = "1446277706"
	)
	RawSound method3425() {
		if (this.field1426.field1385 == null) {
			this.field1426.field1385 = this.field1426.field1384.toRawSound((int[])null);
			this.field1426.field1384 = null;
		}

		return this.field1426.field1385;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II)I",
		garbageValue = "1197139194"
	)
	public static int method3434(CharSequence var0, int var1) {
		return AsyncRestClient.method178(var0, var1, true);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "92635524"
	)
	public static boolean method3441(int var0) {
		return var0 == WorldMapDecorationType.field4375.id;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(FFFFLfu;I)V",
		garbageValue = "1943505267"
	)
	static void method3440(float var0, float var1, float var2, float var3, class137 var4) {
		float var5 = var1 - var0;
		float var6 = var2 - var1;
		float var7 = var3 - var2;
		float var8 = var6 - var5;
		var4.field1666 = var7 - var6 - var8;
		var4.field1665 = var8 + var8 + var8;
		var4.field1659 = var5 + var5 + var5;
		var4.field1663 = var0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-984031098"
	)
	static void method3438() {
		ItemContainer.itemContainers = new NodeHashTable(32);
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIIIILcs;I)V",
		garbageValue = "-771064881"
	)
	static void method3442(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Player var13) {
		ObjectComposition var14 = TileItem.getObjectDefinition(var6);
		int var15;
		int var16;
		if (var4 != 1 && var4 != 3) {
			var15 = var14.sizeX;
			var16 = var14.sizeY;
		} else {
			var15 = var14.sizeY;
			var16 = var14.sizeX;
		}

		int var17 = (var15 >> 1) + var1;
		int var18 = (var15 + 1 >> 1) + var1;
		int var19 = (var16 >> 1) + var2;
		int var20 = var2 + (var16 + 1 >> 1);
		int[][] var21 = class32.worldView.tileHeights[var0];
		int var22 = var21[var18][var20] + var21[var17][var20] + var21[var18][var19] + var21[var17][var19] >> 2;
		int var23 = (var1 << 7) + (var15 << 6);
		int var24 = (var2 << 7) + (var16 << 6);
		Model var25 = var14.getModel(var3, var4, var21, var23, var22, var24);
		if (var25 != null) {
			WorldEntity.method10263(class32.worldView, var0, var1, var2, var5, -1, 0, 0, 31, (String[])null, var7 + 1, var8 + 1);
			var13.animationCycleStart = var7 + Client.cycle;
			var13.animationCycleEnd = var8 + Client.cycle;
			var13.model0 = var25;
			var13.field923 = var1 * 128 + var15 * 64;
			var13.field925 = var2 * 128 + var16 * 64;
			var13.tileHeight2 = var22;
			int var26;
			if (var9 > var11) {
				var26 = var9;
				var9 = var11;
				var11 = var26;
			}

			if (var10 > var12) {
				var26 = var10;
				var10 = var12;
				var12 = var26;
			}

			var13.minX = var9 + var1;
			var13.maxX = var11 + var1;
			var13.minY = var10 + var2;
			var13.maxY = var2 + var12;
		}

	}

	@ObfuscatedName("pg")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "-2035776463"
	)
	public static Clipboard method3433() {
		return class32.client.method505();
	}
}
