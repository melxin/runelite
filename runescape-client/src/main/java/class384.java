import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oz")
public enum class384 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	field4492(0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	field4490(1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	field4494(2),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	field4493(3);

	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1603803711
	)
	public final int field4491;

	class384(int var3) {
		this.field4491 = var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1071289392"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4491;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "1"
	)
	static final int method7491(int var0, int var1, int var2) {
		int var3 = var0 / var2;
		int var4 = var0 & var2 - 1;
		int var5 = var1 / var2;
		int var6 = var1 & var2 - 1;
		int var7 = class169.method3658(var3, var5);
		int var8 = class169.method3658(var3 + 1, var5);
		int var9 = class169.method3658(var3, var5 + 1);
		int var10 = class169.method3658(var3 + 1, var5 + 1);
		int var11 = Buddy.method9124(var7, var8, var4, var2);
		int var12 = Buddy.method9124(var9, var10, var4, var2);
		return Buddy.method9124(var11, var12, var6, var2);
	}
}
