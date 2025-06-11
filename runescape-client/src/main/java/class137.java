import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
public class class137 implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	static final class137 field1620;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	static final class137 field1621;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	static final class137 field1618;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	static final class137 field1619;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	static final class137 field1616;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	static final class137 field1627;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -341615853
	)
	final int field1622;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1466475309
	)
	final int field1625;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 636554663
	)
	final int field1623;

	static {
		field1620 = new class137(0, 0, (String)null, 0);
		field1621 = new class137(1, 1, (String)null, 9);
		field1618 = new class137(2, 2, (String)null, 3);
		field1619 = new class137(3, 3, (String)null, 6);
		field1616 = new class137(4, 4, (String)null, 1);
		field1627 = new class137(5, 5, (String)null, 3);
	}

	class137(int var1, int var2, String var3, int var4) {
		this.field1622 = var1;
		this.field1625 = var2;
		this.field1623 = var4;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "26"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1625;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2100454057"
	)
	int method3555() {
		return this.field1623;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-10"
	)
	public static boolean method3565(int var0) {
		return (var0 & 1) != 0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1676140626"
	)
	static void method3553() {
		synchronized(ArchiveDiskActionHandler.field4691) {
			if (ArchiveDiskActionHandler.field4695 == 0) {
				WorldMapSectionType.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
				WorldMapSectionType.ArchiveDiskActionHandler_thread.setDaemon(true);
				WorldMapSectionType.ArchiveDiskActionHandler_thread.start();
				WorldMapSectionType.ArchiveDiskActionHandler_thread.setPriority(5);
			}

			ArchiveDiskActionHandler.field4695 = 600;
		}
	}

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-71363725"
	)
	static final void method3570(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0;
		int var7 = var3 - var1;
		int var8 = var6 >= 0 ? var6 : -var6;
		int var9 = var7 >= 0 ? var7 : -var7;
		int var10 = var8;
		if (var8 < var9) {
			var10 = var9;
		}

		if (var10 != 0) {
			int var11 = (var6 << 16) / var10;
			int var12 = (var7 << 16) / var10;
			if (var12 <= var11) {
				var11 = -var11;
			} else {
				var12 = -var12;
			}

			int var13 = var5 * var12 >> 17;
			int var14 = var5 * var12 + 1 >> 17;
			int var15 = var5 * var11 >> 17;
			int var16 = var5 * var11 + 1 >> 17;
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart;
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart;
			int var17 = var0 + var13;
			int var18 = var0 - var14;
			int var19 = var0 + var6 - var14;
			int var20 = var0 + var13 + var6;
			int var21 = var15 + var1;
			int var22 = var1 - var16;
			int var23 = var7 + var1 - var16;
			int var24 = var15 + var7 + var1;
			Rasterizer3D.setClipping(var17, var18, var19);
			Rasterizer3D.rasterFlat(var21, var22, var23, var17, var18, var19, 0.0F, 0.0F, 0.0F, var4);
			Rasterizer3D.setClipping(var17, var19, var20);
			Rasterizer3D.rasterFlat(var21, var23, var24, var17, var19, var20, 0.0F, 0.0F, 0.0F, var4);
		}
	}
}
