import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("WorldMapElement_archive")
	public static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Lht;"
	)
	@Export("WorldMapElement_cached")
	public static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 723707593
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 774605925
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1050888313
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -351283919
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("af")
	@Export("name")
	public String name;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -998674695
	)
	public int field1949;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 929505205
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("ax")
	public boolean field1941;
	@ObfuscatedName("ai")
	public boolean field1931;
	@ObfuscatedName("ak")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("aj")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("av")
	int[] field1951;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1951310463
	)
	int field1944;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1134928565
	)
	int field1947;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1710359327
	)
	int field1948;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1841030755
	)
	int field1936;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("an")
	int[] field1952;
	@ObfuscatedName("at")
	byte[] field1953;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 380621951
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
		this.field1941 = true;
		this.field1931 = false;
		this.menuActions = new String[5];
		this.field1944 = Integer.MAX_VALUE;
		this.field1947 = Integer.MAX_VALUE;
		this.field1948 = Integer.MIN_VALUE;
		this.field1936 = Integer.MIN_VALUE;
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
		this.category = -1;
		this.objectId = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-1849737105"
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lvy;IB)V",
		garbageValue = "118"
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
			this.field1949 = var1.readMedium();
		} else if (var2 == 5) {
			var1.readMedium();
		} else if (var2 == 6) {
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) {
				var6 = var1.readUnsignedByte();
				if ((var6 & 1) == 0) {
					this.field1941 = false;
				}

				if ((var6 & 2) == 2) {
					this.field1931 = true;
				}
			} else if (var2 == 8) {
				var1.readUnsignedByte();
			} else if (var2 >= 10 && var2 <= 14) {
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) {
				var6 = var1.readUnsignedByte();
				this.field1951 = new int[var6 * 2];

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) {
					this.field1951[var4] = var1.readShort();
				}

				var1.readInt();
				var4 = var1.readUnsignedByte();
				this.field1952 = new int[var4];

				int var5;
				for (var5 = 0; var5 < this.field1952.length; ++var5) {
					this.field1952[var5] = var1.readInt();
				}

				this.field1953 = new byte[var6];

				for (var5 = 0; var5 < var6; ++var5) {
					this.field1953[var5] = var1.readByte();
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
					HorizontalAlignment[] var3 = new HorizontalAlignment[]{HorizontalAlignment.field2021, HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field2019};
					this.horizontalAlignment = (HorizontalAlignment)class454.findEnumerated(var3, var1.readUnsignedByte());
				} else if (var2 == 30) {
					this.verticalAlignment = (VerticalAlignment)class454.findEnumerated(Decimator.method1111(), var1.readUnsignedByte());
				}
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-8"
	)
	public void method3800() {
		if (this.field1951 != null) {
			for (int var1 = 0; var1 < this.field1951.length; var1 += 2) {
				if (this.field1951[var1] < this.field1944) {
					this.field1944 = this.field1951[var1];
				} else if (this.field1951[var1] > this.field1948) {
					this.field1948 = this.field1951[var1];
				}

				if (this.field1951[var1 + 1] < this.field1947) {
					this.field1947 = this.field1951[var1 + 1];
				} else if (this.field1951[var1 + 1] > this.field1936) {
					this.field1936 = this.field1951[var1 + 1];
				}
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lwg;",
		garbageValue = "-1971623282"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1;
		return this.getSprite(var2);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Lwg;",
		garbageValue = "-503788612"
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
				var2 = class145.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0);
				if (var2 != null) {
					HitSplatDefinition_cached.put(var2, (long)var1);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1213290561"
	)
	public static void method3812() {
		class187.field2007.clear();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1536790991"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var1 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var1 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var1 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var1 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var1;
		}

		return var0 + var1;
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "46"
	)
	@Export("getUserId")
	static long getUserId() {
		return Client.userId;
	}
}
