import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("te")
@Implements("ActorSpotAnim")
public class ActorSpotAnim extends Node {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 265841997
	)
	@Export("spotAnimation")
	public int spotAnimation;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 779185927
	)
	@Export("spotAnimationFrame")
	public int spotAnimationFrame;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 539345293
	)
	@Export("spotAnimationFrameCycle")
	public int spotAnimationFrameCycle;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -986443177
	)
	public int field5237;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -19530335
	)
	@Export("spotAnimationHeight")
	public int spotAnimationHeight;

	public ActorSpotAnim(int var1, int var2, int var3, int var4) {
		this.spotAnimation = -1;
		this.spotAnimationFrame = 0;
		this.spotAnimationFrameCycle = 0;
		this.field5237 = 0;
		this.spotAnimationHeight = 0;
		this.spotAnimation = var1;
		this.spotAnimationHeight = var2;
		this.field5237 = var3;
		this.spotAnimationFrame = var4;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([F[IIII)V",
		garbageValue = "-1214749373"
	)
	static void method9799(float[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			float var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var0[var8] < var6) {
					float var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					int var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method9799(var0, var1, var2, var5 - 1);
			method9799(var0, var1, var5 + 1, var3);
		}

	}
}
