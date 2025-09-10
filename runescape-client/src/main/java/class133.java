import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
public class class133 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("SequenceDefinition_archive")
	public static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("lv")
	static String field1615;
	@ObfuscatedName("uw")
	static boolean field1614;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1720703541
	)
	int field1612;
	@ObfuscatedName("aw")
	float field1606;
	@ObfuscatedName("at")
	float field1605;
	@ObfuscatedName("ac")
	float field1603;
	@ObfuscatedName("ap")
	float field1613;
	@ObfuscatedName("aq")
	float field1608;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	class133 field1609;

	class133() {
		this.field1605 = Float.MAX_VALUE;
		this.field1603 = Float.MAX_VALUE;
		this.field1613 = Float.MAX_VALUE;
		this.field1608 = Float.MAX_VALUE;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwb;IB)V",
		garbageValue = "22"
	)
	void method3602(Buffer var1, int var2) {
		this.field1612 = var1.readShort();
		this.field1606 = var1.method11362();
		this.field1605 = var1.method11362();
		this.field1603 = var1.method11362();
		this.field1613 = var1.method11362();
		this.field1608 = var1.method11362();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "10"
	)
	public static void method3604() {
		WorldMapRegion.WorldMapRegion_cachedSprites.clear();
	}
}
