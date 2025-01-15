import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lf")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements Enum {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(0, (byte)0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(3, (byte)1),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(1, (byte)2),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(2, (byte)3);

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("ju")
	static byte[][] field3193;
	@ObfuscatedName("tq")
	@ObfuscatedGetter(
		intValue = 58883679
	)
	static int field3187;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1870578927
	)
	@Export("type")
	final int type;
	@ObfuscatedName("an")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3;
		this.id = var4;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "118"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[Lmr;",
		garbageValue = "-1935350685"
	)
	public static class323[] method6360() {
		return new class323[]{class323.field3420, class323.field3423, class323.field3421, class323.field3427, class323.field3419, class323.field3424, class323.field3425, class323.field3422, class323.field3429, class323.field3428, class323.field3433, class323.field3430, class323.field3431, class323.field3432};
	}
}
