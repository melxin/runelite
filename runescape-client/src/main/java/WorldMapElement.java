import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hi")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("WorldMapElement_archive")
	public static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lhi;"
	)
	@Export("WorldMapElement_cached")
	public static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 26089841
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2126096943
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -62419353
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1269897031
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("av")
	@Export("name")
	public String name;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -436754749
	)
	public int field1905;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 226207541
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("ai")
	public boolean field1904;
	@ObfuscatedName("al")
	public boolean field1894;
	@ObfuscatedName("ar")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("as")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("az")
	int[] field1885;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1317120047
	)
	int field1898;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 790164349
	)
	int field1899;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1783686569
	)
	int field1900;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 2091724451
	)
	int field1901;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lhf;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("aa")
	int[] field1887;
	@ObfuscatedName("aq")
	byte[] field1902;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 2049435189
	)
	@Export("category")
	public int category;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(256);
	}

	public WorldMapElement(int var1) {
		this.sprite1 = -1;
		this.sprite2 = -1;
		this.textSize = 0;
		this.field1904 = true;
		this.field1894 = false;
		this.menuActions = new String[5];
		this.field1898 = Integer.MAX_VALUE;
		this.field1899 = Integer.MAX_VALUE;
		this.field1900 = Integer.MIN_VALUE;
		this.field1901 = Integer.MIN_VALUE;
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
		this.category = -1;
		this.objectId = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lvj;B)V",
		garbageValue = "68"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lvj;IB)V",
		garbageValue = "44"
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
			this.field1905 = var1.readMedium();
		} else if (var2 == 5) {
			var1.readMedium();
		} else if (var2 == 6) {
			this.textSize = var1.readUnsignedByte();
		} else {
			int var3;
			if (var2 == 7) {
				var3 = var1.readUnsignedByte();
				if ((var3 & 1) == 0) {
					this.field1904 = false;
				}

				if ((var3 & 2) == 2) {
					this.field1894 = true;
				}
			} else if (var2 == 8) {
				var1.readUnsignedByte();
			} else if (var2 >= 10 && var2 <= 14) {
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) {
				var3 = var1.readUnsignedByte();
				this.field1885 = new int[var3 * 2];

				int var4;
				for (var4 = 0; var4 < var3 * 2; ++var4) {
					this.field1885[var4] = var1.readShort();
				}

				var1.readInt();
				var4 = var1.readUnsignedByte();
				this.field1887 = new int[var4];

				int var5;
				for (var5 = 0; var5 < this.field1887.length; ++var5) {
					this.field1887[var5] = var1.readInt();
				}

				this.field1902 = new byte[var3];

				for (var5 = 0; var5 < var3; ++var5) {
					this.field1902[var5] = var1.readByte();
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
					this.horizontalAlignment = (HorizontalAlignment)ScriptEvent.findEnumerated(GraphicsObject.method2242(), var1.readUnsignedByte());
				} else if (var2 == 30) {
					this.verticalAlignment = (VerticalAlignment)ScriptEvent.findEnumerated(class360.method7239(), var1.readUnsignedByte());
				}
			}
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1910046304"
	)
	public void method3777() {
		if (this.field1885 != null) {
			for (int var1 = 0; var1 < this.field1885.length; var1 += 2) {
				if (this.field1885[var1] < this.field1898) {
					this.field1898 = this.field1885[var1];
				} else if (this.field1885[var1] > this.field1900) {
					this.field1900 = this.field1885[var1];
				}

				if (this.field1885[var1 + 1] < this.field1899) {
					this.field1899 = this.field1885[var1 + 1];
				} else if (this.field1885[var1 + 1] > this.field1901) {
					this.field1901 = this.field1885[var1 + 1];
				}
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lvr;",
		garbageValue = "532547119"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1;
		return this.getSprite(var2);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Lvr;",
		garbageValue = "2135547132"
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
				var2 = class53.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0);
				if (var2 != null) {
					HitSplatDefinition_cached.put(var2, (long)var1);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "201"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId;
	}
}
