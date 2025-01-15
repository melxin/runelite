import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ms")
public final class class329 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = -4022445036769029259L
	)
	static long field3607;

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lcx;",
		garbageValue = "461656985"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? World.World_worlds[++World.World_listCount - 1] : null;
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(Lda;I)V",
		garbageValue = "171579587"
	)
	static final void method6646(Actor var0) {
		boolean var1 = var0.field1199 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0;
		if (!var1) {
			SequenceDefinition var2 = class33.SequenceDefinition_get(var0.sequence);
			if (var2 != null && !var2.isCachedModelIdSet()) {
				var1 = var0.sequenceFrameCycle + 1 > var2.frameLengths[var0.sequenceFrame];
			} else {
				var1 = true;
			}
		}

		if (var1) {
			int var8 = var0.field1199 - var0.spotAnimation;
			int var3 = Client.cycle - var0.spotAnimation;
			int var4 = var0.field1268 * 936633408 + var0.field1247 * 128;
			int var5 = var0.field1249 * 128 + var0.field1268 * 936633408;
			int var6 = var0.field1268 * 936633408 + var0.field1248 * 128;
			int var7 = var0.field1250 * 128 + var0.field1268 * 936633408;
			var0.x = (var6 * var3 + var4 * (var8 - var3)) / var8;
			var0.y = (var3 * var7 + var5 * (var8 - var3)) / var8;
		}

		var0.field1269 = 0;
		var0.orientation = var0.field1253;
		var0.rotation = var0.orientation;
	}
}
