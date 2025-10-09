import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
final class class85 implements class356 {
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "[Lxl;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "Lri;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	final Widget val$item;

	@ObfuscatedSignature(
		descriptor = "(Lok;)V"
	)
	class85(Widget var1) {
		this.val$item = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "603869602"
	)
	public void vmethod7479() {
		if (this.val$item.method7964().field4088 != null) {
			ScriptEvent var1 = new ScriptEvent();
			var1.method2172(this.val$item);
			var1.setArgs(this.val$item.method7964().field4088);
			class215.method4888().addFirst(var1);
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lqw;ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "0"
	)
	static String method2923(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) {
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1);
			return var3 == null ? var2 : (String)var3.obj;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([I[JIII)V",
		garbageValue = "-1504533849"
	)
	public static void method2918(int[] var0, long[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			int var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			long var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;
			int var9 = var6 == Integer.MAX_VALUE ? 0 : 1;

			for (int var10 = var2; var10 < var3; ++var10) {
				if (var0[var10] < (var10 & var9) + var6) {
					int var11 = var0[var10];
					var0[var10] = var0[var5];
					var0[var5] = var11;
					long var12 = var1[var10];
					var1[var10] = var1[var5];
					var1[var5++] = var12;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method2918(var0, var1, var2, var5 - 1);
			method2918(var0, var1, var5 + 1, var3);
		}

	}
}
