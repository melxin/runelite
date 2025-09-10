import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("NpcDefinition_archive")
	static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("NpcDefinition_cached")
	static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("NpcDefinition_cachedModels")
	static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("qb")
	@ObfuscatedSignature(
		descriptor = "[Lxt;"
	)
	@Export("crossSprites")
	static SpritePixels[] crossSprites;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -1790419855
	)
	@Export("id")
	public int id;
	@ObfuscatedName("cz")
	@Export("name")
	public String name;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 45603997
	)
	@Export("size")
	public int size;
	@ObfuscatedName("cg")
	@Export("models")
	int[] models;
	@ObfuscatedName("ci")
	@Export("chatHeadModels")
	int[] chatHeadModels;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -511527785
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -307907269
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 1125217851
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 1911806965
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 1987250643
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -1208682885
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 1589007681
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 1109846521
	)
	public int field2121;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -21535545
	)
	public int field2133;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -1977186269
	)
	public int field2155;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 1589084177
	)
	public int field2124;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 1616932641
	)
	public int field2125;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 1744925333
	)
	public int field2126;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 130377331
	)
	public int field2115;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -869539761
	)
	public int field2122;
	@ObfuscatedName("cd")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("co")
	public short[] field2130;
	@ObfuscatedName("ck")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("ct")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("ch")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("cs")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -1609043253
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = 1114176799
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 1184656681
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -1296222233
	)
	int field2138;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = 1103450485
	)
	int field2139;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = -103900231
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("dp")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = 1007820869
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -1998033281
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("dq")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("dh")
	@Export("isClipped")
	public boolean isClipped;
	@ObfuscatedName("de")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("dy")
	@Export("lowPriorityFollowerOps")
	public boolean lowPriorityFollowerOps;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -830674053
	)
	public int field2118;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("dx")
	@Export("stats")
	int[] stats;
	@ObfuscatedName("di")
	@Export("headIconArchiveIds")
	int[] headIconArchiveIds;
	@ObfuscatedName("dj")
	@Export("headIconSpriteIndex")
	short[] headIconSpriteIndex;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -2061758979
	)
	@Export("footprintSize")
	int footprintSize;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	public class197 field2154;

	static {
		NpcDefinition_cached = new EvictingDualNodeHashTable(64);
		NpcDefinition_cachedModels = new EvictingDualNodeHashTable(50);
	}

	NPCComposition() {
		this.name = "null";
		this.size = 1;
		this.idleSequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.field2121 = -1;
		this.field2133 = -1;
		this.field2155 = -1;
		this.field2124 = -1;
		this.field2125 = -1;
		this.field2126 = -1;
		this.field2115 = -1;
		this.field2122 = -1;
		this.actions = new String[5];
		this.drawMapDot = true;
		this.combatLevel = -1;
		this.widthScale = 128;
		this.heightScale = 128;
		this.field2138 = 0;
		this.field2139 = 0;
		this.rotation = 32;
		this.transformVarbit = -1;
		this.transformVarp = -1;
		this.isInteractable = true;
		this.isClipped = true;
		this.isFollower = false;
		this.lowPriorityFollowerOps = false;
		this.field2118 = -1;
		this.stats = new int[]{1, 1, 1, 1, 1, 1};
		this.headIconArchiveIds = null;
		this.headIconSpriteIndex = null;
		this.footprintSize = -1;
		this.field2154 = class197.field2162;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "18"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.footprintSize == -1) {
			this.footprintSize = (int)(0.4F * (float)(this.size * 128));
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "237110214"
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lwb;II)V",
		garbageValue = "-314209855"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		int var5;
		switch(var2) {
		case 1:
			var3 = var1.readUnsignedByte();
			this.models = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.models[var4] = var1.readUnsignedShort();
			}

			return;
		case 2:
			this.name = var1.readStringCp1252NullTerminated();
			break;
		case 12:
			this.size = var1.readUnsignedByte();
			break;
		case 13:
			this.idleSequence = var1.readUnsignedShort();
			break;
		case 14:
			this.walkSequence = var1.readUnsignedShort();
			break;
		case 15:
			this.turnLeftSequence = var1.readUnsignedShort();
			break;
		case 16:
			this.turnRightSequence = var1.readUnsignedShort();
			break;
		case 17:
			this.walkSequence = var1.readUnsignedShort();
			this.walkBackSequence = var1.readUnsignedShort();
			this.walkLeftSequence = var1.readUnsignedShort();
			this.walkRightSequence = var1.readUnsignedShort();
			break;
		case 18:
			var1.readUnsignedShort();
			break;
		case 30:
		case 31:
		case 32:
		case 33:
		case 34:
			this.actions[var2 - 30] = var1.readStringCp1252NullTerminated();
			if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) {
				this.actions[var2 - 30] = null;
			}
			break;
		case 40:
			var3 = var1.readUnsignedByte();
			this.recolorFrom = new short[var3];
			this.field2130 = new short[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.recolorFrom[var4] = (short)var1.readUnsignedShort();
				this.field2130[var4] = (short)var1.readUnsignedShort();
			}

			return;
		case 41:
			var3 = var1.readUnsignedByte();
			this.retextureFrom = new short[var3];
			this.recolorTo = new short[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.retextureFrom[var4] = (short)var1.readUnsignedShort();
				this.recolorTo[var4] = (short)var1.readUnsignedShort();
			}

			return;
		case 60:
			var3 = var1.readUnsignedByte();
			this.chatHeadModels = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.chatHeadModels[var4] = var1.readUnsignedShort();
			}

			return;
		case 74:
			this.stats[0] = var1.readUnsignedShort();
			break;
		case 75:
			this.stats[1] = var1.readUnsignedShort();
			break;
		case 76:
			this.stats[2] = var1.readUnsignedShort();
			break;
		case 77:
			this.stats[3] = var1.readUnsignedShort();
			break;
		case 78:
			this.stats[4] = var1.readUnsignedShort();
			break;
		case 79:
			this.stats[5] = var1.readUnsignedShort();
			break;
		case 93:
			this.drawMapDot = false;
			break;
		case 95:
			this.combatLevel = var1.readUnsignedShort();
			break;
		case 97:
			this.widthScale = var1.readUnsignedShort();
			break;
		case 98:
			this.heightScale = var1.readUnsignedShort();
			break;
		case 99:
			this.field2154 = class197.field2163;
			break;
		case 100:
			this.field2138 = var1.readByte();
			break;
		case 101:
			this.field2139 = var1.readByte() * 5;
			break;
		case 102:
			var3 = var1.readUnsignedByte();
			var4 = 0;

			for (var5 = var3; var5 != 0; var5 >>= 1) {
				++var4;
			}

			this.headIconArchiveIds = new int[var4];
			this.headIconSpriteIndex = new short[var4];

			for (int var6 = 0; var6 < var4; ++var6) {
				if ((var3 & 1 << var6) == 0) {
					this.headIconArchiveIds[var6] = -1;
					this.headIconSpriteIndex[var6] = -1;
				} else {
					this.headIconArchiveIds[var6] = var1.readVarInt();
					this.headIconSpriteIndex[var6] = (short)var1.readLargeSmart();
				}
			}

			return;
		case 103:
			this.rotation = var1.readUnsignedShort();
			break;
		case 106:
		case 118:
			this.transformVarbit = var1.readUnsignedShort();
			if (this.transformVarbit == 65535) {
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort();
			if (this.transformVarp == 65535) {
				this.transformVarp = -1;
			}

			var3 = -1;
			if (var2 == 118) {
				var3 = var1.readUnsignedShort();
				if (var3 == 65535) {
					var3 = -1;
				}
			}

			var4 = var1.readUnsignedByte();
			this.transforms = new int[var4 + 2];

			for (var5 = 0; var5 <= var4; ++var5) {
				this.transforms[var5] = var1.readUnsignedShort();
				if (this.transforms[var5] == 65535) {
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3;
			break;
		case 107:
			this.isInteractable = false;
			break;
		case 109:
			this.isClipped = false;
			break;
		case 111:
			this.field2154 = class197.field2164;
			break;
		case 114:
			this.field2121 = var1.readUnsignedShort();
			break;
		case 115:
			this.field2121 = var1.readUnsignedShort();
			this.field2133 = var1.readUnsignedShort();
			this.field2155 = var1.readUnsignedShort();
			this.field2124 = var1.readUnsignedShort();
			break;
		case 116:
			this.field2125 = var1.readUnsignedShort();
			break;
		case 117:
			this.field2125 = var1.readUnsignedShort();
			this.field2126 = var1.readUnsignedShort();
			this.field2115 = var1.readUnsignedShort();
			this.field2122 = var1.readUnsignedShort();
			break;
		case 122:
			this.isFollower = true;
			break;
		case 123:
			this.lowPriorityFollowerOps = true;
			break;
		case 124:
			this.field2118 = var1.readUnsignedShort();
			break;
		case 126:
			this.footprintSize = var1.readUnsignedShort();
			break;
		case 249:
			this.params = class144.readStringIntParameters(var1, this.params);
			break;
		default:
			System.out.println("Error unrecognised .npc config code:{ " + var2);
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lij;ILij;ILhq;B)Ljn;",
		garbageValue = "-49"
	)
	@Export("getModel")
	public final Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, NpcOverrides var5) {
		if (this.transforms != null) {
			NPCComposition var10 = this.transform();
			return var10 == null ? null : var10.getModel(var1, var2, var3, var4, var5);
		} else {
			long var6 = (long)this.id;
			if (var5 != null) {
				var6 |= var5.field2093 << 16;
			}

			Model var8 = (Model)NpcDefinition_cachedModels.get(var6);
			if (var8 == null) {
				ModelData var9 = this.getModelData(this.models, var5);
				if (var9 == null) {
					return null;
				}

				var8 = var9.toModel(this.field2138 + 64, this.field2139 + 850, -30, -50, -30);
				NpcDefinition_cachedModels.put(var8, var6);
			}

			Model var11;
			if (var1 != null && var3 != null) {
				var11 = var1.applyTransformations(var8, var2, var3, var4);
			} else if (var1 != null) {
				var11 = var1.transformActorModel(var8, var2);
			} else if (var3 != null) {
				var11 = var3.transformActorModel(var8, var4);
			} else {
				var11 = var8.toSharedSequenceModel(true);
			}

			if (this.widthScale != 128 || this.heightScale != 128) {
				var11.scale(this.widthScale, this.heightScale, this.widthScale);
			}

			return var11;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lhq;B)Liu;",
		garbageValue = "1"
	)
	public final ModelData method4377(NpcOverrides var1) {
		if (this.transforms != null) {
			NPCComposition var2 = this.transform();
			return var2 == null ? null : var2.method4377(var1);
		} else {
			return this.getModelData(this.chatHeadModels, var1);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([ILhq;I)Liu;",
		garbageValue = "-1909254590"
	)
	@Export("getModelData")
	ModelData getModelData(int[] var1, NpcOverrides var2) {
		int[] var3 = var1;
		if (var2 != null && var2.modelIds != null) {
			var3 = var2.modelIds;
		}

		if (var3 == null) {
			return null;
		} else {
			boolean var4 = false;

			for (int var5 = 0; var5 < var3.length; ++var5) {
				if (var3[var5] != -1 && !class150.field1767.tryLoadFile(var3[var5], 0)) {
					var4 = true;
				}
			}

			if (var4) {
				return null;
			} else {
				ModelData[] var9 = new ModelData[var3.length];

				for (int var6 = 0; var6 < var3.length; ++var6) {
					var9[var6] = ModelData.ModelData_get(class150.field1767, var3[var6], 0);
				}

				ModelData var10;
				if (var9.length == 1) {
					var10 = var9[0];
					if (var10 == null) {
						var10 = new ModelData(var9, var9.length);
					}
				} else {
					var10 = new ModelData(var9, var9.length);
				}

				short[] var7;
				int var8;
				if (this.recolorFrom != null) {
					var7 = this.field2130;
					if (var2 != null && var2.recolorTo != null) {
						var7 = var2.recolorTo;
					}

					for (var8 = 0; var8 < this.recolorFrom.length; ++var8) {
						var10.recolor(this.recolorFrom[var8], var7[var8]);
					}
				}

				if (this.retextureFrom != null) {
					var7 = this.recolorTo;
					if (var2 != null && var2.retextureTo != null) {
						var7 = var2.retextureTo;
					}

					for (var8 = 0; var8 < this.retextureFrom.length; ++var8) {
						var10.retexture(this.retextureFrom[var8], var7[var8]);
					}
				}

				return var10;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Lhh;",
		garbageValue = "81"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = class281.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class63.getNpcDefinition(var2) : null;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-59"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) {
			return true;
		} else {
			int var1 = -1;
			if (this.transformVarbit != -1) {
				var1 = class281.getVarbit(this.transformVarbit);
			} else if (this.transformVarp != -1) {
				var1 = Varps.Varps_main[this.transformVarp];
			}

			if (var1 >= 0 && var1 < this.transforms.length) {
				return this.transforms[var1] != -1;
			} else {
				return this.transforms[this.transforms.length - 1] != -1;
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1639473975"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return class537.method10547(this.params, var1, var2);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-968871798"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class405.method8274(this.params, var1, var2);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "241985674"
	)
	public boolean method4334() {
		return this.headIconArchiveIds != null && this.headIconSpriteIndex != null;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-2050596886"
	)
	public int[] method4335() {
		return this.headIconArchiveIds;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "582556216"
	)
	public int method4336(int var1) {
		return this.headIconArchiveIds != null && var1 < this.headIconArchiveIds.length ? this.headIconArchiveIds[var1] : -1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)[S",
		garbageValue = "0"
	)
	public short[] method4333() {
		return this.headIconSpriteIndex;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)S",
		garbageValue = "1826668749"
	)
	public short method4338(int var1) {
		return this.headIconSpriteIndex != null && var1 < this.headIconSpriteIndex.length ? this.headIconSpriteIndex[var1] : -1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-280804741"
	)
	public int method4345() {
		return this.footprintSize;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1990604290"
	)
	static void method4381() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.field1005.last(); var0 != null; var0 = (ObjectSound)ObjectSound.field1005.previous()) {
			var0.method2271();
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1792535058"
	)
	static void method4383() {
		Message.Tiles_underlays = null;
		Tiles.Tiles_overlays = null;
		Tiles.Tiles_shapes = null;
		Tiles.field848 = null;
		PlayerType.field4837 = null;
		Tiles.Tiles_underlays2 = null;
		class159.field1828 = null;
		UserComparator7.Tiles_hue = null;
		class256.Tiles_saturation = null;
		Tiles.Tiles_lightness = null;
		Tiles.Tiles_hueMultiplier = null;
		Frames.field2814 = null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lti;III)V",
		garbageValue = "-2130548851"
	)
	public static void method4339(DynamicArray var0, int var1, int var2) {
		class374.method8144(var0);
		if (var1 != 0) {
			if (var2 >= 0 && var2 < var0.size * -1549457881 && var1 >= 0 && var2 + var1 <= var0.size * -1549457881) {
				if (var2 < var0.size * -1549457881 - var1) {
					class82.method2773(var0, var2 + var1, var0, var2, var0.size * -1549457881 - (var2 + var1));
				}

				var0.method10362(var0.size * -1549457881 - var1);
			} else {
				throw new RuntimeException();
			}
		}
	}
}
