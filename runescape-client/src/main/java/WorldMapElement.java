import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hi")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 143164541
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lhi;"
	)
	@Export("WorldMapElement_cached")
	static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lrl;"
	)
	static Bounds field2009;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 348284615
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -393425597
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1176539457
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("ap")
	@Export("name")
	public String name;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1733851579
	)
	public int field1993;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1000629255
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("az")
	public boolean field1990;
	@ObfuscatedName("ad")
	public boolean field1996;
	@ObfuscatedName("ai")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("as")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("ac")
	int[] field1999;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2017749879
	)
	int field2000;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -676191921
	)
	int field1985;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 282834999
	)
	int field2002;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 229850989
	)
	int field2003;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("am")
	int[] field1995;
	@ObfuscatedName("ao")
	byte[] field1998;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -629421571
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
		this.field1990 = true;
		this.field1996 = false;
		this.menuActions = new String[5];
		this.field2000 = Integer.MAX_VALUE;
		this.field1985 = Integer.MAX_VALUE;
		this.field2002 = Integer.MIN_VALUE;
		this.field2003 = Integer.MIN_VALUE;
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
		this.category = -1;
		this.objectId = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxa;B)V",
		garbageValue = "88"
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxa;IB)V",
		garbageValue = "-58"
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
			this.field1993 = var1.readMedium();
		} else if (var2 == 5) {
			var1.readMedium();
		} else if (var2 == 6) {
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) {
				var6 = var1.readUnsignedByte();
				if ((var6 & 1) == 0) {
					this.field1990 = false;
				}

				if ((var6 & 2) == 2) {
					this.field1996 = true;
				}
			} else if (var2 == 8) {
				var1.readUnsignedByte();
			} else if (var2 >= 10 && var2 <= 14) {
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) {
				var6 = var1.readUnsignedByte();
				this.field1999 = new int[var6 * 2];

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) {
					this.field1999[var4] = var1.readShort();
				}

				var1.readInt();
				var4 = var1.readUnsignedByte();
				this.field1995 = new int[var4];

				int var5;
				for (var5 = 0; var5 < this.field1995.length; ++var5) {
					this.field1995[var5] = var1.readInt();
				}

				this.field1998 = new byte[var6];

				for (var5 = 0; var5 < var6; ++var5) {
					this.field1998[var5] = var1.readByte();
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
					HorizontalAlignment[] var3 = new HorizontalAlignment[]{HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field2093, HorizontalAlignment.field2086};
					this.horizontalAlignment = (HorizontalAlignment)GrandExchangeOffer.findEnumerated(var3, var1.readUnsignedByte());
				} else if (var2 == 30) {
					VerticalAlignment[] var7 = new VerticalAlignment[]{VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field2180, VerticalAlignment.field2178};
					this.verticalAlignment = (VerticalAlignment)GrandExchangeOffer.findEnumerated(var7, var1.readUnsignedByte());
				}
			}
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method4323() {
		if (this.field1999 != null) {
			for (int var1 = 0; var1 < this.field1999.length; var1 += 2) {
				if (this.field1999[var1] < this.field2000) {
					this.field2000 = this.field1999[var1];
				} else if (this.field1999[var1] > this.field2002) {
					this.field2002 = this.field1999[var1];
				}

				if (this.field1999[var1 + 1] < this.field1985) {
					this.field1985 = this.field1999[var1 + 1];
				} else if (this.field1999[var1 + 1] > this.field2003) {
					this.field2003 = this.field1999[var1 + 1];
				}
			}
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lxt;",
		garbageValue = "-666509786"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1;
		return this.getSprite(var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lxt;",
		garbageValue = "1605595744"
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
				var2 = class387.SpriteBuffer_getSprite(class209.WorldMapElement_archive, var1, 0);
				if (var2 != null) {
					HitSplatDefinition_cached.put(var2, (long)var1);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-460977716"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId;
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-87591057"
	)
	@Export("clear")
	static final void clear() {
		class31.method491();
		class194.field2023.clear();
		class181.field1915.clear();
		WorldViewManager.method2453();
		DbTableType.DBTableType_cache.clear();
		DevicePcmPlayerProvider.method328();
		VerticalAlignment.method4544();
		PendingSpawn.method2476();
		HealthBarDefinition.HealthBarDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
		class180.field1913.clear();
		KitDefinition.KitDefinition_cached.clear();
		GrandExchangeOfferOwnWorldComparator.method840();
		UserComparator7.method3703();
		InterfaceParent.method2180();
		class196.field2026.clear();
		ScriptFrame.method745();
		ItemComposition.ItemDefinition_cached.clear();
		ItemComposition.ItemDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cachedSprites.clear();
		ParamComposition.ParamDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cachedFrames.clear();
		SequenceDefinition.SequenceDefinition_cachedModel.clear();
		KitDefinition.method4385();
		class114.method3599();
		class167.method4166();
		WorldViewManager.method2422();
		if (class86.field1210 != null) {
			class86.field1210.method11387();
		}

		if (ScriptFrame.field202 != null) {
			ScriptFrame.field202.method11387();
		}

		class200.field2100.clear();
		StructComposition.method4736();
		AsyncRestClient.method179();
		class114.method3597();
		class179.field1842.clear();
		WorldMapSection1.method7059();
		class139.method3862();
		VarpDefinition.VarpDefinition_cached.clear();
		class209.field2136.clear();
		Client.DBTableIndex_cache.clear();
		Client.archive11.clear();
		PlayerComposition.PlayerAppearance_cachedModels.clear();
		PlayerComposition.field4148.clearFiles();
		PlayerComposition.field4153 = 0;
		if (class226.widgetDefinition != null) {
			class226.widgetDefinition.method7732();
		}

		if (Rasterizer3D.clips.Rasterizer3D_textureLoader != null) {
			((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).clear();
		}

		Script.Script_cached.clear();
		Client.field363.clearFiles();
		if (AbstractWorldMapIcon.field3529 != null) {
			AbstractWorldMapIcon.field3529.clearFiles();
		}

		if (AsyncHttpResponse.field67 != null) {
			AsyncHttpResponse.field67.clearFiles();
		}

		if (VarcInt.field2017 != null) {
			VarcInt.field2017.clearFiles();
		}

		if (HttpRequestTask.archive10 != null) {
			HttpRequestTask.archive10.clearFiles();
		}

		if (WorldMapRectangle.archive12 != null) {
			WorldMapRectangle.archive12.clearFiles();
		}

		if (StructComposition.archive2 != null) {
			StructComposition.archive2.clearFiles();
		}

		if (class136.field1619 != null) {
			class136.field1619.clearFiles();
		}

		if (Varps.field4092 != null) {
			Varps.field4092.clearFiles();
		}

		if (ActorSpotAnim.archive13 != null) {
			ActorSpotAnim.archive13.clearFiles();
		}

		if (class189.archive4 != null) {
			class189.archive4.clearFiles();
		}

		if (Message.soundEffectsArchive != null) {
			Message.soundEffectsArchive.clearFiles();
		}

		if (class175.field1928 != null) {
			class175.field1928.clearFiles();
		}

		if (UserComparator4.archive6 != null) {
			UserComparator4.archive6.clearFiles();
		}

		if (Tile.archive9 != null) {
			Tile.archive9.clearFiles();
		}

		if (GrandExchangeOfferOwnWorldComparator.field248 != null) {
			GrandExchangeOfferOwnWorldComparator.field248.clearFiles();
		}

		if (Skeleton.field2836 != null) {
			Skeleton.field2836.clearFiles();
		}

		if (class226.field2558 != null) {
			class226.field2558.clearFiles();
		}

		if (class147.archive8 != null) {
			class147.archive8.clearFiles();
		}

		if (class160.field1815 != null) {
			class160.field1815.clearFiles();
		}

		if (class474.field5353 != null) {
			class474.field5353.clearFiles();
		}

		if (class138.field1642 != null) {
			class138.field1642.clearFiles();
		}

		if (ParamComposition.field2290 != null) {
			ParamComposition.field2290.clearFiles();
		}

		if (PcmPlayer.field1328 != null) {
			PcmPlayer.field1328.clearFiles();
		}

	}
}
