import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
public class class69 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	static final class69 field931;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	static final class69 field935;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	static final class69 field926;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	static final class69 field927;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	static final class69 field924;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	static final class69 field929;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	static final class69 field930;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	static final class69 field928;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	static final class69 field933;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	static final class69 field925;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	static final class69 field934;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	static final class69 field932;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	static final class69 field936;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	static final class69 field937;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	static final class69 field938;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	static final class69 field939;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	static final class69 field940;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	static final class69 field941;

	static {
		field931 = new class69();
		field935 = new class69();
		field926 = new class69();
		field927 = new class69();
		field924 = new class69();
		field929 = new class69();
		field930 = new class69();
		field928 = new class69();
		field933 = new class69();
		field925 = new class69();
		field934 = new class69();
		field932 = new class69();
		field936 = new class69();
		field937 = new class69();
		field938 = new class69();
		field939 = new class69();
		field940 = new class69();
		field941 = new class69();
	}

	class69() {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)I",
		garbageValue = "-1538746252"
	)
	public static int method2286(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) {
			int var6 = var3;
			var3 = var4;
			var4 = var6;
		}

		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0 - (var3 - 1);
		} else {
			return var2 == 2 ? 7 - var1 - (var4 - 1) : var0;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lqm;III)[Lxt;",
		garbageValue = "1805561019"
	)
	public static SpritePixels[] method2287(AbstractArchive var0, int var1, int var2) {
		return !FloorOverlayDefinition.method4919(var0, var1, var2) ? null : class145.method3902();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1240959061"
	)
	static void method2283() {
		Messages.Messages_channels.clear();
		Messages.Messages_hashTable.clear();
		Messages.Messages_queue.clear();
		Messages.Messages_count = 0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "([I[Ljava/lang/Object;III)V",
		garbageValue = "1772939328"
	)
	public static void method2285(int[] var0, Object[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			int var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			Object var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;
			int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;

			for (int var9 = var2; var9 < var3; ++var9) {
				if (var0[var9] < (var9 & var8) + var6) {
					int var10 = var0[var9];
					var0[var9] = var0[var5];
					var0[var5] = var10;
					Object var11 = var1[var9];
					var1[var9] = var1[var5];
					var1[var5++] = var11;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method2285(var0, var1, var2, var5 - 1);
			method2285(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(IZZZZI)Lqn;",
		garbageValue = "1022586388"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		ArchiveDisk var5 = null;
		if (JagexCache.JagexCache_dat2File != null) {
			var5 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, UserComparator9.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var5, InterfaceParent.masterDisk, VarbitComposition.field2279, var0, var1, var2, var3, var4, false);
	}

	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "(Lof;B)I",
		garbageValue = "-5"
	)
	@Export("getWidgetFlags2")
	static int getWidgetFlags2(Widget var0) {
		WidgetConfigNode var1 = (WidgetConfigNode)Client.widgetFlags.get((long)var0.id);
		WidgetConfigNode var2 = WorldMapIcon_0.method6921(var1, var0.childIndex * 2077538819);
		if (var2 != null) {
			return var2.method7745();
		} else {
			int var4 = var0.flags;
			int var3 = var4 >> 1 & 1023;
			return var3;
		}
	}
}
