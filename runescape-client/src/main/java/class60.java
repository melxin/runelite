import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
public class class60 {
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Lws;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1422266865
	)
	int field412;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -807065367
	)
	int field413;
	@ObfuscatedName("ae")
	byte[] field414;

	class60() {
		this.field412 = 0;
		this.field413 = 0;
		this.field414 = null;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "875343034"
	)
	int method1173(int var1) {
		int var2 = 0;

		int var3;
		int var4;
		for (var3 = 0; var1 >= 8 - this.field413; var1 -= var4) {
			var4 = 8 - this.field413;
			int var5 = (1 << var4) - 1;
			var2 += (this.field414[this.field412] >> this.field413 & var5) << var3;
			this.field413 = 0;
			++this.field412;
			var3 += var4;
		}

		if (var1 > 0) {
			var4 = (1 << var1) - 1;
			var2 += (this.field414[this.field412] >> this.field413 & var4) << var3;
			this.field413 += var1;
		}

		return var2;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1284808911"
	)
	int method1176() {
		int var1 = this.field414[this.field412] >> this.field413 & 1;
		++this.field413;
		this.field412 += this.field413 >> 3;
		this.field413 &= 7;
		return var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([BIB)V",
		garbageValue = "29"
	)
	void method1172(byte[] var1, int var2) {
		this.field414 = var1;
		this.field412 = var2;
		this.field413 = 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ldt;S)V",
		garbageValue = "-5394"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		class7.runScript(var0, 500000, 475000);
	}
}
