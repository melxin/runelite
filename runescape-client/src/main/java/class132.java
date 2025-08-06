import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
public class class132 {
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lxa;"
	)
	static IndexedSprite field1588;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1696998483
	)
	int field1597;
	@ObfuscatedName("ab")
	float field1589;
	@ObfuscatedName("ac")
	float field1590;
	@ObfuscatedName("av")
	float field1591;
	@ObfuscatedName("au")
	float field1592;
	@ObfuscatedName("as")
	float field1593;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	class132 field1595;

	class132() {
		this.field1590 = Float.MAX_VALUE;
		this.field1591 = Float.MAX_VALUE;
		this.field1592 = Float.MAX_VALUE;
		this.field1593 = Float.MAX_VALUE;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwj;II)V",
		garbageValue = "441301286"
	)
	void method3571(Buffer var1, int var2) {
		this.field1597 = var1.readShort();
		this.field1589 = var1.method11235();
		this.field1590 = var1.method11235();
		this.field1591 = var1.method11235();
		this.field1592 = var1.method11235();
		this.field1593 = var1.method11235();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)[Lpr;",
		garbageValue = "-1456099192"
	)
	public static class392[] method3574() {
		return new class392[]{class392.field4705, class392.field4703, class392.field4701, class392.field4702};
	}
}
