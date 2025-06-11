import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
public class class82 {
	@ObfuscatedName("cr")
	@Export("otp")
	static String otp;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lwy;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1637381969
	)
	int field1188;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -2120145705
	)
	int field1186;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1835601643
	)
	int field1187;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1043069727
	)
	int field1185;

	class82(int var1, int var2, int var3, int var4) {
		this.field1188 = var1;
		this.field1186 = var2;
		this.field1187 = var3;
		this.field1185 = var4;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-434626087"
	)
	int method2651() {
		return this.field1188;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2079588241"
	)
	int method2644() {
		return this.field1186;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1734403917"
	)
	int method2643() {
		return this.field1187;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1692923721"
	)
	int method2646() {
		return this.field1185;
	}
}
