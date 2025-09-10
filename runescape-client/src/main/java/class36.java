import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bg")
public class class36 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("nq")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("sa")
	@ObfuscatedGetter(
		intValue = 1953671817
	)
	static int field240;

	static {
		reflectionChecks = new IterableNodeDeque();
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(Ldr;ILjn;B)V",
		garbageValue = "-1"
	)
	static void method731(WorldView var0, int var1, Model var2) {
		boolean var3 = true;
		float var4 = (float)Client.viewportHeight / 334.0F;
		float var5 = 4.0F * (float)Client.viewportZoom / var4;
		int var6 = Math.max(512, (int)(1400.0F - var5));
		int var7 = Client.field552 - (int)(SequenceDefinition.method4817(var1) * (double)var6);
		int var8 = Client.field337;
		int var11 = class536.field5571[var1 & 2047];
		double var9 = (double)var11 / 65536.0D;
		var11 = var8 - (int)((double)var6 * var9);
		int var12 = var0.plane;
		int var13 = var7 >> 7;
		int var15 = var11 >> 7;
		long var16 = UserComparator8.calculateTag(var12, var13, var15, 5, false, -1, var0.id);
		var0.scene.drawEntity(var0.plane, var7, var11, Client.field512, 60, var2, var1, var16, false);
	}
}
