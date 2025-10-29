import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hu")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("NpcDefinition_cached")
	static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("NpcDefinition_cachedModels")
	static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 1435750363
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ct")
	@Export("name")
	public String name;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 1880345079
	)
	@Export("size")
	public int size;
	@ObfuscatedName("cb")
	@Export("models")
	int[] models;
	@ObfuscatedName("ck")
	@Export("chatHeadModels")
	int[] chatHeadModels;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -625790299
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 917022203
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 1219249533
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -404134647
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 585856205
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 2027561961
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 1039294955
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -988204857
	)
	public int field2123;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -310965519
	)
	public int field2124;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -786508797
	)
	public int field2105;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -175856555
	)
	public int field2126;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -169103045
	)
	public int field2127;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -834214881
	)
	public int field2120;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -232059351
	)
	public int field2129;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -249279285
	)
	public int field2130;
	@ObfuscatedName("cr")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("cj")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("ca")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("cl")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("dd")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("dw")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = 1601675895
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 1459684331
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = 957368917
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = 1710335081
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = 641405031
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 1078048253
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("dh")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = -277752131
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = 1524408185
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("dj")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("da")
	@Export("isClipped")
	public boolean isClipped;
	@ObfuscatedName("dl")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("dr")
	@Export("lowPriorityFollowerOps")
	public boolean lowPriorityFollowerOps;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = -2071321549
	)
	public int field2150;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("do")
	@Export("stats")
	int[] stats;
	@ObfuscatedName("dk")
	@Export("headIconArchiveIds")
	int[] headIconArchiveIds;
	@ObfuscatedName("dn")
	@Export("headIconSpriteIndex")
	short[] headIconSpriteIndex;
	@ObfuscatedName("ec")
	@ObfuscatedGetter(
		intValue = 964807653
	)
	@Export("footprintSize")
	int footprintSize;
	@ObfuscatedName("ea")
	boolean field2156;
	@ObfuscatedName("ee")
	@ObfuscatedGetter(
		intValue = 254812117
	)
	int field2157;
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	public class201 field2158;

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
		this.field2123 = -1;
		this.field2124 = -1;
		this.field2105 = -1;
		this.field2126 = -1;
		this.field2127 = -1;
		this.field2120 = -1;
		this.field2129 = -1;
		this.field2130 = -1;
		this.actions = new String[5];
		this.drawMapDot = true;
		this.combatLevel = -1;
		this.widthScale = 128;
		this.heightScale = 128;
		this.ambient = 0;
		this.contrast = 0;
		this.rotation = 32;
		this.transformVarbit = -1;
		this.transformVarp = -1;
		this.isInteractable = true;
		this.isClipped = true;
		this.isFollower = false;
		this.lowPriorityFollowerOps = false;
		this.field2150 = -1;
		this.stats = new int[]{1, 1, 1, 1, 1, 1};
		this.headIconArchiveIds = null;
		this.headIconSpriteIndex = null;
		this.footprintSize = -1;
		this.field2156 = false;
		this.field2157 = 39188;
		this.field2158 = class201.field2168;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "85"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.footprintSize == -1) {
			this.footprintSize = (int)(0.4F * (float)(this.size * 128));
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxa;I)V",
		garbageValue = "1108069782"
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
		garbageValue = "-48"
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
			this.recolorTo = new short[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.recolorFrom[var4] = (short)var1.readUnsignedShort();
				this.recolorTo[var4] = (short)var1.readUnsignedShort();
			}

			return;
		case 41:
			var3 = var1.readUnsignedByte();
			this.retextureFrom = new short[var3];
			this.retextureTo = new short[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.retextureFrom[var4] = (short)var1.readUnsignedShort();
				this.retextureTo[var4] = (short)var1.readUnsignedShort();
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
			this.field2158 = class201.field2172;
			break;
		case 100:
			this.ambient = var1.readByte();
			break;
		case 101:
			this.contrast = var1.readByte();
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
					this.headIconArchiveIds[var6] = var1.readNullableLargeSmart();
					this.headIconSpriteIndex[var6] = (short)var1.readShortSmartSub();
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
			this.field2158 = class201.field2167;
			break;
		case 114:
			this.field2123 = var1.readUnsignedShort();
			break;
		case 115:
			this.field2123 = var1.readUnsignedShort();
			this.field2124 = var1.readUnsignedShort();
			this.field2105 = var1.readUnsignedShort();
			this.field2126 = var1.readUnsignedShort();
			break;
		case 116:
			this.field2127 = var1.readUnsignedShort();
			break;
		case 117:
			this.field2127 = var1.readUnsignedShort();
			this.field2120 = var1.readUnsignedShort();
			this.field2129 = var1.readUnsignedShort();
			this.field2130 = var1.readUnsignedShort();
			break;
		case 122:
			this.isFollower = true;
			break;
		case 123:
			this.lowPriorityFollowerOps = true;
			break;
		case 124:
			this.field2150 = var1.readUnsignedShort();
			break;
		case 126:
			this.footprintSize = var1.readUnsignedShort();
			break;
		case 145:
			this.field2156 = true;
			break;
		case 146:
			this.field2157 = var1.readUnsignedShort();
			break;
		case 249:
			this.params = class406.readStringIntParameters(var1, this.params);
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Liw;ILiw;ILha;S)Lky;",
		garbageValue = "8798"
	)
	@Export("getModel")
	public final Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, NpcOverrides var5) {
		if (this.transforms != null) {
			NPCComposition var10 = this.transform();
			return var10 == null ? null : var10.getModel(var1, var2, var3, var4, var5);
		} else {
			long var6 = (long)this.id;
			if (var5 != null) {
				var6 |= var5.field2099 << 16;
			}

			Model var8 = (Model)NpcDefinition_cachedModels.get(var6);
			if (var8 == null) {
				ModelData var9 = this.getModelData(this.models, var5);
				if (var9 == null) {
					return null;
				}

				var8 = var9.toModel(this.ambient + 64, this.contrast * 5 + 850, -30, -50, -30);
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lha;I)Ljm;",
		garbageValue = "196992464"
	)
	public final ModelData method4465(NpcOverrides var1) {
		if (this.transforms != null) {
			NPCComposition var2 = this.transform();
			return var2 == null ? null : var2.method4465(var1);
		} else {
			return this.getModelData(this.chatHeadModels, var1);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([ILha;I)Ljm;",
		garbageValue = "-951352166"
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
				if (var3[var5] != -1 && !class348.field3986.tryLoadFile(var3[var5], 0)) {
					var4 = true;
				}
			}

			if (var4) {
				return null;
			} else {
				ModelData[] var9 = new ModelData[var3.length];

				for (int var6 = 0; var6 < var3.length; ++var6) {
					var9[var6] = ModelData.ModelData_get(class348.field3986, var3[var6], 0);
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
					var7 = this.recolorTo;
					if (var2 != null && var2.recolorTo != null) {
						var7 = var2.recolorTo;
					}

					for (var8 = 0; var8 < this.recolorFrom.length; ++var8) {
						var10.recolor(this.recolorFrom[var8], var7[var8]);
					}
				}

				if (this.retextureFrom != null) {
					var7 = this.retextureTo;
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Lhu;",
		garbageValue = "0"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = WorldMapData_1.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? AsyncHttpResponse.getNpcDefinition(var2) : null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "195711422"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) {
			return true;
		} else {
			int var1 = -1;
			if (this.transformVarbit != -1) {
				var1 = WorldMapData_1.getVarbit(this.transformVarbit);
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "192977228"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return class108.method3518(this.params, var1, var2);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "72"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return Projectile.method2008(this.params, var1, var2);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1627042038"
	)
	public boolean method4476() {
		return this.headIconArchiveIds != null && this.headIconSpriteIndex != null;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1300032824"
	)
	public int[] method4477() {
		return this.headIconArchiveIds;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "486338061"
	)
	public int method4478(int var1) {
		return this.headIconArchiveIds != null && var1 < this.headIconArchiveIds.length ? this.headIconArchiveIds[var1] : -1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)[S",
		garbageValue = "-28"
	)
	public short[] method4487() {
		return this.headIconSpriteIndex;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)S",
		garbageValue = "0"
	)
	public short method4480(int var1) {
		return this.headIconSpriteIndex != null && var1 < this.headIconSpriteIndex.length ? this.headIconSpriteIndex[var1] : -1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1056332581"
	)
	public int method4481() {
		return this.footprintSize;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-203416512"
	)
	public boolean method4482() {
		return this.field2156;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1436123519"
	)
	public int method4483() {
		return this.field2157;
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(Ldd;IIII)I",
		garbageValue = "-253070517"
	)
	@Export("getTileHeight")
	static final int getTileHeight(WorldView var0, int var1, int var2, int var3) {
		int var4 = var1 >> 7;
		int var5 = var2 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 < var0.tileSettings[0].length && var5 < var0.tileSettings[0][0].length) {
			int var6 = var3;
			if (var3 < 3 && (var0.tileSettings[1][var4][var5] & 2) == 2) {
				var6 = var3 + 1;
			}

			int var7 = var1 & 127;
			int var8 = var2 & 127;
			int var9 = var0.tileHeights[var6][var4][var5] * (128 - var7) + var0.tileHeights[var6][var4 + 1][var5] * var7 >> 7;
			int var10 = var7 * var0.tileHeights[var6][var4 + 1][var5 + 1] + var0.tileHeights[var6][var4][var5 + 1] * (128 - var7) >> 7;
			return var10 * var8 + var9 * (128 - var8) >> 7;
		} else {
			return 0;
		}
	}
}
