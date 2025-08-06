import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
public abstract class class149 extends Node {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	public static AbstractArchive field1749;

	class149() {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "1324754926"
	)
	abstract void vmethod4086(Buffer var1);

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lgk;I)V",
		garbageValue = "1924878263"
	)
	abstract void vmethod4088(ClanSettings var1);

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lrk;ILra;B)I",
		garbageValue = "-57"
	)
	static int method3780(AnimationSequence var0, int var1, class464 var2) {
		int var3 = 0;
		SequenceDefinition var4 = var0.getSequenceDefinition();
		if (var4.frameCount > 0 && var4.field2428 > 0) {
			var1 %= var4.field2428;
		}

		int var5 = var0.getFrame();
		int var6 = var0.getFrameCycle();
		int var7 = var0.method9578();
		if (var5 >= var4.frameIds.length) {
			var5 = 0;
			var6 = 0;
		}

		var6 += var1;

		while (true) {
			int var8;
			do {
				if (var6 <= var4.frameLengths[var5]) {
					var0.method9582(var5, var6, var7);
					return var3;
				}

				var6 -= var4.frameLengths[var5];
				++var5;
				var3 |= 4;
				if (var2 != null) {
					var2.vmethod10923(var4, var5);
				}

				var8 = var4.frameCount == -1 ? 1 : var4.field2437;
			} while(var5 < var4.frameIds.length);

			++var7;
			var3 |= 1;
			if (var4.frameCount > 0) {
				var5 -= var4.frameCount;
				if (var5 < 0 || var5 >= var4.frameIds.length) {
					var6 = 0;
					var5 = 0;
				}
			} else {
				var6 = 0;
				var5 = 0;
			}

			if (var7 >= var8) {
				var3 |= 2;
			} else if (var2 != null) {
				var2.vmethod10923(var4, var5);
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "86"
	)
	public static int method3791(int var0) {
		return var0 >> 3 & 2047;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-151019243"
	)
	public static int method3789(int var0) {
		return HttpResponse.method322(ViewportMouse.ViewportMouse_entityTags[var0]);
	}
}
