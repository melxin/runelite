import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("su")
@Implements("DelayFadeTask")
public class DelayFadeTask extends SongTask {
	@ObfuscatedName("ar")
	@Export("PcmPlayer_stereo")
	public static boolean PcmPlayer_stereo;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	@Export("pcmPlayerProvider")
	public static class105 pcmPlayerProvider;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = 8897684534530645139L
	)
	long field5344;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 615467889
	)
	int field5342;

	@ObfuscatedSignature(
		descriptor = "(Lsw;I)V"
	)
	public DelayFadeTask(SongTask var1, int var2) {
		super(var1);
		this.field5342 = var2;
		super.field5350 = "DelayFadeTask";
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1369867803"
	)
	public boolean vmethod9763() {
		if (this.field5344 < (long)this.field5342) {
			++this.field5344;
			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(FFFFIIII)V",
		garbageValue = "-1311152360"
	)
	public static final void method9712(float var0, float var1, float var2, float var3, int var4, int var5, int var6) {
		if (!ViewportMouse.ViewportMouse_false0) {
			float var11 = 50.0F;
			float var12 = (float)AbstractRasterizer.method5112();
			float var13 = (float)(ViewportMouse.ViewportMouse_x - var4) * var11 / (float)var6;
			float var14 = (float)(ViewportMouse.ViewportMouse_y - var5) * var11 / (float)var6;
			float var15 = (float)(ViewportMouse.ViewportMouse_x - var4) * var12 / (float)var6;
			float var16 = var12 * (float)(ViewportMouse.ViewportMouse_y - var5) / (float)var6;
			float var17 = class108.method3469(var14, var11, var1, var0);
			float var18 = var1 * var11 - var14 * var0;
			var14 = var17;
			var17 = class108.method3469(var16, var12, var1, var0);
			float var19 = var12 * var1 - var0 * var16;
			float var20 = var3 * var13 - var18 * var2;
			float var21 = var3 * var18 + var2 * var13;
			float var22 = var3 * var15 - var19 * var2;
			float var23 = var2 * var15 + var3 * var19;
			AttackOption.method2876((int)var20, (int)var14, (int)var21, (int)var22, (int)var17, (int)var23);
		}
	}
}
