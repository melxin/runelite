import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("he")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	public static AbstractArchive field1978;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("HealthBarDefinition_cached")
	public static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1065415567
	)
	public int field1980;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -277746591
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1087481631
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 593108275
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1504826967
	)
	public int field1984;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1639116147
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -874201563
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 300501177
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -316020979
	)
	@Export("width")
	public int width;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1553312085
	)
	@Export("widthPadding")
	public int widthPadding;

	static {
		HealthBarDefinition_cached = new EvictingDualNodeHashTable(64);
		HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
	}

	HealthBarDefinition() {
		this.int1 = 255;
		this.int2 = 255;
		this.int3 = -1;
		this.field1984 = 1;
		this.int5 = 70;
		this.frontSpriteID = -1;
		this.backSpriteID = -1;
		this.width = 30;
		this.widthPadding = 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-1868501661"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lvy;II)V",
		garbageValue = "-1926368622"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) {
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) {
			this.int3 = 0;
		} else if (var2 == 5) {
			this.int5 = var1.readUnsignedShort();
		} else if (var2 == 6) {
			var1.readUnsignedByte();
		} else if (var2 == 7) {
			this.frontSpriteID = var1.readNullableLargeSmart();
		} else if (var2 == 8) {
			this.backSpriteID = var1.readNullableLargeSmart();
		} else if (var2 == 11) {
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) {
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) {
			this.widthPadding = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Lwg;",
		garbageValue = "1484979707"
	)
	@Export("getFrontSprite")
	public SpritePixels getFrontSprite() {
		if (this.frontSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class145.SpriteBuffer_getSprite(field1978, this.frontSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Lwg;",
		garbageValue = "-89"
	)
	@Export("getBackSprite")
	public SpritePixels getBackSprite() {
		if (this.backSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class145.SpriteBuffer_getSprite(field1978, this.backSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
				}

				return var1;
			}
		}
	}
}
