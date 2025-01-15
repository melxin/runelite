import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jm")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	@Export("WorldMapElement_archive")
	static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Ljm;"
	)
	@Export("WorldMapElement_cached")
	static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1187381095
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("pi")
	@ObfuscatedGetter(
		intValue = -1003000535
	)
	static int field2543;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -418413189
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1044903649
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1717119769
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("ax")
	@Export("name")
	public String name;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1169799285
	)
	public int field2540;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1570467255
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("as")
	public boolean field2533;
	@ObfuscatedName("aq")
	public boolean field2530;
	@ObfuscatedName("af")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("aa")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("ak")
	int[] field2528;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -510614173
	)
	int field2534;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 12256039
	)
	int field2535;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1837550443
	)
	int field2536;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -208336589
	)
	int field2537;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("am")
	int[] field2538;
	@ObfuscatedName("ap")
	byte[] field2542;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1379816205
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
		this.field2533 = true;
		this.field2530 = false;
		this.menuActions = new String[5];
		this.field2534 = Integer.MAX_VALUE;
		this.field2535 = Integer.MAX_VALUE;
		this.field2536 = Integer.MIN_VALUE;
		this.field2537 = Integer.MIN_VALUE;
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
		this.category = -1;
		this.objectId = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-1689056337"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvy;II)V",
		garbageValue = "825746633"
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
			this.field2540 = var1.readMedium();
		} else if (var2 == 5) {
			var1.readMedium();
		} else if (var2 == 6) {
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) {
				var6 = var1.readUnsignedByte();
				if ((var6 & 1) == 0) {
					this.field2533 = false;
				}

				if ((var6 & 2) == 2) {
					this.field2530 = true;
				}
			} else if (var2 == 8) {
				var1.readUnsignedByte();
			} else if (var2 >= 10 && var2 <= 14) {
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) {
				var6 = var1.readUnsignedByte();
				this.field2528 = new int[var6 * 2];

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) {
					this.field2528[var4] = var1.readShort();
				}

				var1.readInt();
				var4 = var1.readUnsignedByte();
				this.field2538 = new int[var4];

				int var5;
				for (var5 = 0; var5 < this.field2538.length; ++var5) {
					this.field2538[var5] = var1.readInt();
				}

				this.field2542 = new byte[var6];

				for (var5 = 0; var5 < var6; ++var5) {
					this.field2542[var5] = var1.readByte();
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
					this.horizontalAlignment = (HorizontalAlignment)StructComposition.findEnumerated(Canvas.method338(), var1.readUnsignedByte());
				} else if (var2 == 30) {
					VerticalAlignment[] var3 = new VerticalAlignment[]{VerticalAlignment.field2670, VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field2673};
					this.verticalAlignment = (VerticalAlignment)StructComposition.findEnumerated(var3, var1.readUnsignedByte());
				}
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1627989215"
	)
	void method5166() {
		if (this.field2528 != null) {
			for (int var1 = 0; var1 < this.field2528.length; var1 += 2) {
				if (this.field2528[var1] < this.field2534) {
					this.field2534 = this.field2528[var1];
				} else if (this.field2528[var1] > this.field2536) {
					this.field2536 = this.field2528[var1];
				}

				if (this.field2528[var1 + 1] < this.field2535) {
					this.field2535 = this.field2528[var1 + 1];
				} else if (this.field2528[var1 + 1] > this.field2537) {
					this.field2537 = this.field2528[var1 + 1];
				}
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lvf;",
		garbageValue = "-100"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1;
		return this.getSprite(var2);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)Lvf;",
		garbageValue = "63"
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
				var2 = ChatChannel.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0);
				if (var2 != null) {
					HitSplatDefinition_cached.put(var2, (long)var1);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-111"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "235760565"
	)
	static String method5195(int var0) {
		return "<img=" + var0 + ">";
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(B)Lpm;",
		garbageValue = "-98"
	)
	public static NodeDeque method5196() {
		return Client.scriptEvents;
	}

	@ObfuscatedName("or")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "437702728"
	)
	@Export("randomDatData2")
	static void randomDatData2(Buffer var0) {
		if (Client.randomDatData != null) {
			var0.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
		} else {
			byte[] var2 = new byte[24];

			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.readFully(var2);

				int var3;
				for (var3 = 0; var3 < 24 && var2[var3] == 0; ++var3) {
				}

				if (var3 >= 24) {
					throw new IOException();
				}
			} catch (Exception var6) {
				for (int var4 = 0; var4 < 24; ++var4) {
					var2[var4] = -1;
				}
			}

			var0.writeBytes(var2, 0, var2.length);
		}
	}
}
