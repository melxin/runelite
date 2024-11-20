import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
public class class60 {
	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "[Lvr;"
	)
	@Export("headIconPkSprites")
	static SpritePixels[] headIconPkSprites;
	@ObfuscatedName("ab")
	byte[] field429;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 238692693
	)
	int field427;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 332551393
	)
	int field428;

	class60() {
		this.field429 = null;
		this.field427 = 0;
		this.field428 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-43"
	)
	int method1152(int var1) {
		int var2 = 0;

		int var3;
		int var4;
		for (var3 = 0; var1 >= 8 - this.field428; var1 -= var4) {
			var4 = 8 - this.field428;
			int var5 = (1 << var4) - 1;
			var2 += (this.field429[this.field427] >> this.field428 & var5) << var3;
			this.field428 = 0;
			++this.field427;
			var3 += var4;
		}

		if (var1 > 0) {
			var4 = (1 << var1) - 1;
			var2 += (this.field429[this.field427] >> this.field428 & var4) << var3;
			this.field428 += var1;
		}

		return var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1573770014"
	)
	int method1153() {
		int var1 = this.field429[this.field427] >> this.field428 & 1;
		++this.field428;
		this.field427 += this.field428 >> 3;
		this.field428 &= 7;
		return var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([BIB)V",
		garbageValue = "-42"
	)
	void method1157(byte[] var1, int var2) {
		this.field429 = var1;
		this.field427 = var2;
		this.field428 = 0;
	}

	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "(Ldo;ZI)V",
		garbageValue = "-480018524"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group;
		int var3 = (int)var0.key;
		var0.remove();
		if (var1) {
			class379.widgetDefinition.method6872(var2);
		}

		SoundCache.method844(var2);
		Widget var4 = class379.widgetDefinition.method6875(var3);
		if (var4 != null) {
			class178.invalidateWidget(var4);
		}

		if (Client.rootInterface != -1) {
			World.runIntfCloseListeners(Client.rootInterface, 1);
		}

	}
}
