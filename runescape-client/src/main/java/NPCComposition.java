import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("NpcDefinition_archive")
	static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	static AbstractArchive field2034;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("NpcDefinition_cached")
	public static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("NpcDefinition_cachedModels")
	public static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "[Lws;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 519195259
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ao")
	@Export("name")
	public String name;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1046756829
	)
	@Export("size")
	public int size;
	@ObfuscatedName("aa")
	@Export("models")
	int[] models;
	@ObfuscatedName("as")
	int[] field2041;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 731040999
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 961604667
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 754155495
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1441665737
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 587362251
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 509374035
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -604385313
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 13016853
	)
	public int field2049;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1497086311
	)
	public int field2037;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1711791769
	)
	public int field2065;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1963660569
	)
	public int field2052;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1872672341
	)
	public int field2053;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -245946901
	)
	public int field2051;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -474234553
	)
	public int field2055;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -429055175
	)
	public int field2040;
	@ObfuscatedName("al")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("bw")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("bo")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("bs")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("bz")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("bt")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -273208167
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 266251525
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1340370971
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("bk")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1005638485
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -880036721
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1906694567
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("be")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -1513243025
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1705012119
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("bx")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("bf")
	@Export("isClipped")
	public boolean isClipped;
	@ObfuscatedName("bc")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("bb")
	@Export("lowPriorityFollowerOps")
	public boolean lowPriorityFollowerOps;
	@ObfuscatedName("bi")
	@Export("headIconArchiveIds")
	int[] headIconArchiveIds;
	@ObfuscatedName("bn")
	@Export("headIconSpriteIndex")
	short[] headIconSpriteIndex;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1191787129
	)
	public int field2066;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("br")
	int[] field2076;

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
		this.field2049 = -1;
		this.field2037 = -1;
		this.field2065 = -1;
		this.field2052 = -1;
		this.field2053 = -1;
		this.field2051 = -1;
		this.field2055 = -1;
		this.field2040 = -1;
		this.actions = new String[5];
		this.drawMapDot = true;
		this.combatLevel = -1;
		this.widthScale = 128;
		this.heightScale = 128;
		this.isVisible = false;
		this.ambient = 0;
		this.contrast = 0;
		this.rotation = 32;
		this.transformVarbit = -1;
		this.transformVarp = -1;
		this.isInteractable = true;
		this.isClipped = true;
		this.isFollower = false;
		this.lowPriorityFollowerOps = false;
		this.headIconArchiveIds = null;
		this.headIconSpriteIndex = null;
		this.field2066 = -1;
		this.field2076 = new int[]{1, 1, 1, 1, 1, 1};
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-259382860"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-1745088119"
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lvy;IB)V",
		garbageValue = "97"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.readUnsignedByte();
			this.models = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.models[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 2) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 12) {
			this.size = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.idleSequence = var1.readUnsignedShort();
		} else if (var2 == 14) {
			this.walkSequence = var1.readUnsignedShort();
		} else if (var2 == 15) {
			this.turnLeftSequence = var1.readUnsignedShort();
		} else if (var2 == 16) {
			this.turnRightSequence = var1.readUnsignedShort();
		} else if (var2 == 17) {
			this.walkSequence = var1.readUnsignedShort();
			this.walkBackSequence = var1.readUnsignedShort();
			this.walkLeftSequence = var1.readUnsignedShort();
			this.walkRightSequence = var1.readUnsignedShort();
		} else if (var2 == 18) {
			var1.readUnsignedShort();
		} else if (var2 >= 30 && var2 < 35) {
			this.actions[var2 - 30] = var1.readStringCp1252NullTerminated();
			if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) {
				this.actions[var2 - 30] = null;
			}
		} else if (var2 == 40) {
			var3 = var1.readUnsignedByte();
			this.recolorFrom = new short[var3];
			this.recolorTo = new short[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.recolorFrom[var4] = (short)var1.readUnsignedShort();
				this.recolorTo[var4] = (short)var1.readUnsignedShort();
			}
		} else if (var2 == 41) {
			var3 = var1.readUnsignedByte();
			this.retextureFrom = new short[var3];
			this.retextureTo = new short[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.retextureFrom[var4] = (short)var1.readUnsignedShort();
				this.retextureTo[var4] = (short)var1.readUnsignedShort();
			}
		} else if (var2 == 60) {
			var3 = var1.readUnsignedByte();
			this.field2041 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2041[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 74) {
			this.field2076[0] = var1.readUnsignedShort();
		} else if (var2 == 75) {
			this.field2076[1] = var1.readUnsignedShort();
		} else if (var2 == 76) {
			this.field2076[2] = var1.readUnsignedShort();
		} else if (var2 == 77) {
			this.field2076[3] = var1.readUnsignedShort();
		} else if (var2 == 78) {
			this.field2076[4] = var1.readUnsignedShort();
		} else if (var2 == 79) {
			this.field2076[5] = var1.readUnsignedShort();
		} else if (var2 == 93) {
			this.drawMapDot = false;
		} else if (var2 == 95) {
			this.combatLevel = var1.readUnsignedShort();
		} else if (var2 == 97) {
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 98) {
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 99) {
			this.isVisible = true;
		} else if (var2 == 100) {
			this.ambient = var1.readByte();
		} else if (var2 == 101) {
			this.contrast = var1.readByte();
		} else {
			int var5;
			if (var2 == 102) {
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
			} else if (var2 == 103) {
				this.rotation = var1.readUnsignedShort();
			} else if (var2 != 106 && var2 != 118) {
				if (var2 == 107) {
					this.isInteractable = false;
				} else if (var2 == 109) {
					this.isClipped = false;
				} else if (var2 == 114) {
					this.field2049 = var1.readUnsignedShort();
				} else if (var2 == 115) {
					this.field2049 = var1.readUnsignedShort();
					this.field2037 = var1.readUnsignedShort();
					this.field2065 = var1.readUnsignedShort();
					this.field2052 = var1.readUnsignedShort();
				} else if (var2 == 116) {
					this.field2053 = var1.readUnsignedShort();
				} else if (var2 == 117) {
					this.field2053 = var1.readUnsignedShort();
					this.field2051 = var1.readUnsignedShort();
					this.field2055 = var1.readUnsignedShort();
					this.field2040 = var1.readUnsignedShort();
				} else if (var2 == 122) {
					this.isFollower = true;
				} else if (var2 == 123) {
					this.lowPriorityFollowerOps = true;
				} else if (var2 == 124) {
					this.field2066 = var1.readUnsignedShort();
				} else if (var2 == 249) {
					this.params = UserComparator6.readStringIntParameters(var1, this.params);
				}
			} else {
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
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Liw;ILiw;ILhw;B)Ljf;",
		garbageValue = "1"
	)
	@Export("getModel")
	public final Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, NpcOverrides var5) {
		if (this.transforms != null) {
			NPCComposition var10 = this.transform();
			return var10 == null ? null : var10.getModel(var1, var2, var3, var4, var5);
		} else {
			long var6 = (long)this.id;
			if (var5 != null) {
				var6 |= var5.field2029 << 16;
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lhw;B)Ljk;",
		garbageValue = "97"
	)
	public final ModelData method3926(NpcOverrides var1) {
		if (this.transforms != null) {
			NPCComposition var2 = this.transform();
			return var2 == null ? null : var2.method3926(var1);
		} else {
			return this.getModelData(this.field2041, var1);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([ILhw;I)Ljk;",
		garbageValue = "-1493301734"
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
				if (var3[var5] != -1 && !field2034.tryLoadFile(var3[var5], 0)) {
					var4 = true;
				}
			}

			if (var4) {
				return null;
			} else {
				ModelData[] var9 = new ModelData[var3.length];

				for (int var6 = 0; var6 < var3.length; ++var6) {
					var9[var6] = ModelData.ModelData_get(field2034, var3[var6], 0);
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(S)Lhm;",
		garbageValue = "-2302"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = class241.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class91.getNpcDefinition(var2) : null;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) {
			return true;
		} else {
			int var1 = -1;
			if (this.transformVarbit != -1) {
				var1 = class241.getVarbit(this.transformVarbit);
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "807894297"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return class28.method391(this.params, var1, var2);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "953116542"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class59.method1133(this.params, var1, var2);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "377810632"
	)
	public boolean method3931() {
		return this.headIconArchiveIds != null && this.headIconSpriteIndex != null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-167928096"
	)
	public int[] method3947() {
		return this.headIconArchiveIds;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1278917126"
	)
	public int method3933(int var1) {
		return this.headIconArchiveIds != null && var1 < this.headIconArchiveIds.length ? this.headIconArchiveIds[var1] : -1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "872409137"
	)
	public short[] method3934() {
		return this.headIconSpriteIndex;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)S",
		garbageValue = "-1627620889"
	)
	public short method3935(int var1) {
		return this.headIconSpriteIndex != null && var1 < this.headIconSpriteIndex.length ? this.headIconSpriteIndex[var1] : -1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-950712200"
	)
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.ids.length; ++var2) {
				var1.ids[var2] = -1;
				var1.quantities[var2] = 0;
			}

		}
	}
}
