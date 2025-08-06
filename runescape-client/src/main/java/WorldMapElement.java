import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1477128235
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("WorldMapElement_archive")
	static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lho;"
	)
	@Export("WorldMapElement_cached")
	static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("vy")
	@ObfuscatedGetter(
		intValue = -648383669
	)
	static int field1981;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -680855697
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 259744139
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1710391431
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("am")
	@Export("name")
	public String name;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 552725831
	)
	public int field1977;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 594870277
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("ay")
	public boolean field1970;
	@ObfuscatedName("aa")
	public boolean field1967;
	@ObfuscatedName("ai")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("ak")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("ar")
	int[] field1974;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1443079795
	)
	int field1985;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1668039685
	)
	int field1976;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1962867689
	)
	int field1962;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 202242157
	)
	int field1978;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("aw")
	int[] field1979;
	@ObfuscatedName("af")
	byte[] field1982;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -349571747
	)
	@Export("category")
	public int category;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(256);
	}

	WorldMapElement(int var1) {
		this.sprite1 = -1;
		this.sprite2 = -1;
		this.textSize = 0;
		this.field1970 = true;
		this.field1967 = false;
		this.menuActions = new String[5];
		this.field1985 = Integer.MAX_VALUE;
		this.field1976 = Integer.MAX_VALUE;
		this.field1962 = Integer.MIN_VALUE;
		this.field1978 = Integer.MIN_VALUE;
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
		this.category = -1;
		this.objectId = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lwj;B)V",
		garbageValue = "102"
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lwj;II)V",
		garbageValue = "409648686"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.sprite1 = var1.readNullableLargeSmart();
		} else if (var2 == 2) {
			this.sprite2 = var1.readNullableLargeSmart();
		} else if (var2 == 3) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.field1977 = var1.readMedium();
		} else if (var2 == 5) {
			var1.readMedium();
		} else if (var2 == 6) {
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) {
				var6 = var1.readUnsignedByte();
				if ((var6 & 1) == 0) {
					this.field1970 = false;
				}

				if ((var6 & 2) == 2) {
					this.field1967 = true;
				}
			} else if (var2 == 8) {
				var1.readUnsignedByte();
			} else if (var2 >= 10 && var2 <= 14) {
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) {
				var6 = var1.readUnsignedByte();
				this.field1974 = new int[var6 * 2];

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) {
					this.field1974[var4] = var1.readShort();
				}

				var1.readInt();
				var4 = var1.readUnsignedByte();
				this.field1979 = new int[var4];

				int var5;
				for (var5 = 0; var5 < this.field1979.length; ++var5) {
					this.field1979[var5] = var1.readInt();
				}

				this.field1982 = new byte[var6];

				for (var5 = 0; var5 < var6; ++var5) {
					this.field1982[var5] = var1.readByte();
				}
			} else if (var2 != 16) {
				if (var2 == 17) {
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) {
					var1.readNullableLargeSmart();
				} else if (var2 == 19) {
					this.category = var1.readUnsignedShort();
				} else if (var2 == 21) {
					var1.readInt();
				} else if (var2 == 22) {
					var1.readInt();
				} else if (var2 == 23) {
					var1.readUnsignedByte();
					var1.readUnsignedByte();
					var1.readUnsignedByte();
				} else if (var2 == 24) {
					var1.readShort();
					var1.readShort();
				} else if (var2 == 25) {
					var1.readNullableLargeSmart();
				} else if (var2 == 28) {
					var1.readUnsignedByte();
				} else if (var2 == 29) {
					this.horizontalAlignment = (HorizontalAlignment)HealthBarConfig.findEnumerated(class7.method55(), var1.readUnsignedByte());
				} else if (var2 == 30) {
					VerticalAlignment[] var3 = new VerticalAlignment[]{VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field2125, VerticalAlignment.field2124};
					this.verticalAlignment = (VerticalAlignment)HealthBarConfig.findEnumerated(var3, var1.readUnsignedByte());
				}
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1409937382"
	)
	void method4175() {
		if (this.field1974 != null) {
			for (int var1 = 0; var1 < this.field1974.length; var1 += 2) {
				if (this.field1974[var1] < this.field1985) {
					this.field1985 = this.field1974[var1];
				} else if (this.field1974[var1] > this.field1962) {
					this.field1962 = this.field1974[var1];
				}

				if (this.field1974[var1 + 1] < this.field1976) {
					this.field1976 = this.field1974[var1 + 1];
				} else if (this.field1974[var1 + 1] > this.field1978) {
					this.field1978 = this.field1974[var1 + 1];
				}
			}
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lxv;",
		garbageValue = "-942547317"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1;
		return this.getSprite(var2);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Lxv;",
		garbageValue = "684034092"
	)
	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) {
			return null;
		} else {
			SpritePixels var2 = (SpritePixels)HitSplatDefinition_cached.get((long)var1);
			if (var2 != null) {
				return var2;
			} else {
				var2 = class407.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0);
				if (var2 != null) {
					HitSplatDefinition_cached.put(var2, (long)var1);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "12"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId;
	}
}
