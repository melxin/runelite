import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1418999345
	)
	@Export("x")
	int x;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 460667375
	)
	@Export("y")
	int y;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -459371687
	)
	@Export("z")
	int z;

	FaceNormal() {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lhh;",
		garbageValue = "1902005361"
	)
	public static HealthBarDefinition method5454(int var0) {
		HealthBarDefinition var1 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var0);
			var1 = new HealthBarDefinition();
			var1.field2034 = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("py")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "65"
	)
	static void method5453(int var0) {
		Client.oculusOrbState = var0;
	}
}
