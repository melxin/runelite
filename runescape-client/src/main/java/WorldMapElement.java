import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1840767457
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("WorldMapElement_archive")
	static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Ljk;"
	)
	@Export("WorldMapElement_cached")
	static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1929799239
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 2031393435
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -102549921
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("aa")
	@Export("name")
	public String name;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 221845207
	)
	public int field2591;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -208387875
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("aw")
	public boolean field2600;
	@ObfuscatedName("ar")
	public boolean field2594;
	@ObfuscatedName("au")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("aj")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("al")
	int[] field2603;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -275604981
	)
	int field2593;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1191616137
	)
	int field2599;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 772779163
	)
	int field2582;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -193789489
	)
	int field2601;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ljq;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("ah")
	int[] field2588;
	@ObfuscatedName("az")
	byte[] field2605;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -387932705
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
		this.field2600 = true;
		this.field2594 = false;
		this.menuActions = new String[5];
		this.field2593 = Integer.MAX_VALUE;
		this.field2599 = Integer.MAX_VALUE;
		this.field2582 = Integer.MIN_VALUE;
		this.field2601 = Integer.MIN_VALUE;
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
		this.category = -1;
		this.objectId = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lve;I)V",
		garbageValue = "74976033"
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lve;II)V",
		garbageValue = "1129165622"
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
			this.field2591 = var1.readMedium();
		} else if (var2 == 5) {
			var1.readMedium();
		} else if (var2 == 6) {
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) {
				var6 = var1.readUnsignedByte();
				if ((var6 & 1) == 0) {
					this.field2600 = false;
				}

				if ((var6 & 2) == 2) {
					this.field2594 = true;
				}
			} else if (var2 == 8) {
				var1.readUnsignedByte();
			} else if (var2 >= 10 && var2 <= 14) {
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) {
				var6 = var1.readUnsignedByte();
				this.field2603 = new int[var6 * 2];

				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) {
					this.field2603[var4] = var1.readShort();
				}

				var1.readInt();
				var4 = var1.readUnsignedByte();
				this.field2588 = new int[var4];

				int var5;
				for (var5 = 0; var5 < this.field2588.length; ++var5) {
					this.field2588[var5] = var1.readInt();
				}

				this.field2605 = new byte[var6];

				for (var5 = 0; var5 < var6; ++var5) {
					this.field2605[var5] = var1.readByte();
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
					this.horizontalAlignment = (HorizontalAlignment)ArchiveDiskActionHandler.findEnumerated(UserComparator6.method3251(), var1.readUnsignedByte());
				} else if (var2 == 30) {
					VerticalAlignment[] var3 = new VerticalAlignment[]{VerticalAlignment.field2752, VerticalAlignment.field2750, VerticalAlignment.VerticalAlignment_centered};
					this.verticalAlignment = (VerticalAlignment)ArchiveDiskActionHandler.findEnumerated(var3, var1.readUnsignedByte());
				}
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1815447422"
	)
	void method5052() {
		if (this.field2603 != null) {
			for (int var1 = 0; var1 < this.field2603.length; var1 += 2) {
				if (this.field2603[var1] < this.field2593) {
					this.field2593 = this.field2603[var1];
				} else if (this.field2603[var1] > this.field2582) {
					this.field2582 = this.field2603[var1];
				}

				if (this.field2603[var1 + 1] < this.field2599) {
					this.field2599 = this.field2603[var1 + 1];
				} else if (this.field2603[var1 + 1] > this.field2601) {
					this.field2601 = this.field2603[var1 + 1];
				}
			}
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lwc;",
		garbageValue = "-40"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1;
		return this.getSprite(var2);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Lwc;",
		garbageValue = "-755393777"
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
				var2 = GrandExchangeOfferNameComparator.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0);
				if (var2 != null) {
					HitSplatDefinition_cached.put(var2, (long)var1);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-334403108"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId;
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(Ldj;ZLvu;I)V",
		garbageValue = "-537194846"
	)
	static final void method5075(WorldView var0, boolean var1, PacketBuffer var2) {
		while (true) {
			byte var3 = 16;
			int var4 = 1 << var3;
			if (var2.bitsRemaining(Client.packetWriter.serverPacketLength) >= var3 + 12) {
				int var5 = var2.readBits(var3);
				if (var5 != var4 - 1) {
					boolean var6 = false;
					NPC var7 = (NPC)var0.npcs.get((long)var5);
					if (var7 == null) {
						var7 = new NPC(var5);
						var0.npcs.add(var7, (long)var5);
						var6 = true;
					}

					var0.field1351.method9064(var5);
					var7.field1366 = false;
					var7.worldViewId = var0.id;
					int var9;
					if (var1) {
						var9 = var2.readBits(8);
						if (var9 > 127) {
							var9 -= 256;
						}
					} else {
						var9 = var2.readBits(6);
						if (var9 > 31) {
							var9 -= 64;
						}
					}

					boolean var11 = var2.readBits(1) == 1;
					if (var11) {
						var2.readBits(32);
					}

					var7.definition = class232.getNpcDefinition(var2.readBits(14));
					int var12 = var2.readBits(1);
					if (var12 == 1) {
						Client.npcIndices[++Client.npcCount - 1] = var5;
					}

					int var10;
					if (var1) {
						var10 = var2.readBits(8);
						if (var10 > 127) {
							var10 -= 256;
						}
					} else {
						var10 = var2.readBits(6);
						if (var10 > 31) {
							var10 -= 64;
						}
					}

					int var13 = Client.field587[var2.readBits(3)];
					if (var6) {
						var7.orientation = var7.rotation = var13;
					}

					int var8 = var2.readBits(1);
					class30.method460(var7);
					if (var7.field1241 == 0) {
						var7.rotation = 0;
					}

					var7.method2897(var9 + AddRequestTask.field5020, var10 + class233.field2563, var8 == 1);
					continue;
				}
			}

			var2.exportIndex();
			return;
		}
	}
}
