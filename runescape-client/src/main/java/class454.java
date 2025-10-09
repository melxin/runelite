import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rb")
public class class454 {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	@Export("soundSystem")
	public static SoundSystem soundSystem;
	@ObfuscatedName("qo")
	@ObfuscatedGetter(
		intValue = 1437517671
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("ab")
	float[] field5251;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 825575559
	)
	int field5250;

	class454(float[] var1, int var2) {
		this.field5251 = var1;
		this.field5250 = var2;
	}
}
