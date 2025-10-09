import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rg")
public class class461 {
	@ObfuscatedName("kw")
	@ObfuscatedGetter(
		longValue = 6636450612124756897L
	)
	static long field5289;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1605515207
	)
	int field5288;

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "1"
	)
	class461(int var1, boolean var2) {
		this.field5288 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "25358302"
	)
	public int method9463() {
		return this.field5288;
	}

	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1445483308"
	)
	static final int method9466() {
		float var0 = 200.0F * ((float)class154.clientPreferences.getBrightness() - 0.5F);
		return 100 - Math.round(var0);
	}
}
