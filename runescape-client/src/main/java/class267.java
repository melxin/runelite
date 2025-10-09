import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("km")
public class class267 {
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	public static AbstractArchive field3180;
	@ObfuscatedName("aj")
	public String field3184;
	@ObfuscatedName("ah")
	public float[] field3179;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1309581961
	)
	public int field3178;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1516783267
	)
	public int field3181;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -135027041
	)
	public int field3182;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	final class266 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lkt;)V"
	)
	class267(class266 var1) {
		this.this$0 = var1;
		this.field3179 = new float[4];
		this.field3178 = 1;
		this.field3181 = 1;
		this.field3182 = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1344788049"
	)
	static final boolean method6054(char var0) {
		if (Character.isISOControl(var0)) {
			return false;
		} else if (class292.isAlphaNumeric(var0)) {
			return true;
		} else {
			char[] var1 = class561.field5846;

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			var1 = class561.field5843;

			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			return false;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "891433471"
	)
	public static int method6053(int var0) {
		return class534.field5642[var0 & 2047];
	}
}
