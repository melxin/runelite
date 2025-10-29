import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
public class class204 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	static final class204 field2195;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	static final class204 field2187;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	static final class204 field2197;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	static final class204 field2189;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	static final class204 field2194;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	static final class204 field2191;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	static final class204 field2192;
	@ObfuscatedName("ap")
	static int[] field2186;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 751493525
	)
	final int field2198;

	static {
		field2195 = new class204(0);
		field2187 = new class204(1);
		field2197 = new class204(2);
		field2189 = new class204(3);
		field2194 = new class204(4);
		field2191 = new class204(5);
		field2192 = new class204(6);
		field2186 = null;
	}

	class204(int var1) {
		this.field2198 = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1858130303"
	)
	public static int method4553(int var0) {
		if (field2186 == null) {
			field2186 = new int[7];
			field2186[field2195.field2198] = class222.field2530.field2536;
			field2186[field2187.field2198] = class222.field2533.field2536;
			field2186[field2197.field2198] = class222.field2526.field2536;
			field2186[field2189.field2198] = class222.field2525.field2536;
			field2186[field2194.field2198] = class222.field2531.field2536;
			field2186[field2191.field2198] = class222.field2529.field2536;
			field2186[field2192.field2198] = class222.field2522.field2536;
		}

		return field2186[var0];
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IILcq;I)I",
		garbageValue = "893473998"
	)
	static int method4559(int var0, int var1, ObjectSound var2) {
		WorldView var3 = Client.worldViewManager.getWorldView(var2.plane);
		ProjectionCoord var4 = class86.method2932(var3, var2.y, var2.maxX);
		ProjectionCoord var5 = class86.method2932(var3, var2.maxY, var2.field966);
		int var6 = (int)var4.x;
		int var7 = (int)var4.y;
		int var8 = (int)var5.x;
		int var9 = (int)var5.y;
		var4.release();
		var5.release();
		int var10 = class147.method3941(var0, var1, var6, var7, var8, var9);
		var10 = Math.max(var10 - 64, 0);
		return var10;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IZIZI)V",
		garbageValue = "-264481596"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (World.World_worlds != null) {
			class387.doWorldSorting(0, World.World_worlds.length - 1, var0, var1, var2, var3);
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lqm;II)Lxm;",
		garbageValue = "158856530"
	)
	public static IndexedSprite method4557(AbstractArchive var0, int var1) {
		byte[] var3 = var0.takeFileFlat(var1);
		boolean var2;
		if (var3 == null) {
			var2 = false;
		} else {
			ConcurrentMidiTask.SpriteBuffer_decode(var3);
			var2 = true;
		}

		return !var2 ? null : class209.method4666();
	}
}
