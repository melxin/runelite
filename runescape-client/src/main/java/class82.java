import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
public class class82 {
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1754177635
	)
	static int field1206;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1406795957
	)
	int field1204;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1810274137
	)
	int field1203;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 7506833
	)
	int field1207;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -828770687
	)
	int field1205;

	class82(int var1, int var2, int var3, int var4) {
		this.field1204 = var1;
		this.field1203 = var2;
		this.field1207 = var3;
		this.field1205 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "872356554"
	)
	int method2871() {
		return this.field1204;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-38"
	)
	int method2862() {
		return this.field1203;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1030403090"
	)
	int method2863() {
		return this.field1207;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "7"
	)
	int method2864() {
		return this.field1205;
	}

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "224920097"
	)
	static final boolean method2866() {
		return Client.isMenuOpen;
	}
}
