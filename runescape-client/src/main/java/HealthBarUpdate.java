import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1588378783
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -315406619
	)
	@Export("health")
	int health;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -725240035
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 671594577
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-957058473"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;Ljava/io/File;I)V",
		garbageValue = "-1197837625"
	)
	static void method2662(File var0, File var1) {
		try {
			AccessFile var2 = new AccessFile(JagexCache.field2430, "rw", 10000L);
			Buffer var3 = new Buffer(500);
			var3.writeByte(3);
			var3.writeByte(var1 != null ? 1 : 0);
			var3.writeCESU8(var0.getPath());
			if (var1 != null) {
				var3.writeCESU8("");
			}

			var2.write(var3.field5573, 0, var3.field5570);
			var2.close();
		} catch (IOException var4) {
			var4.printStackTrace();
		}

	}
}
