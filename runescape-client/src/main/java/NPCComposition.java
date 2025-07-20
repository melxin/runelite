import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("NpcDefinition_archive")
	static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	static AbstractArchive field2026;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("NpcDefinition_cached")
	static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("NpcDefinition_cachedModels")
	static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1963982739
	)
	@Export("id")
	public int id;
	@ObfuscatedName("am")
	@Export("name")
	public String name;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1827590503
	)
	@Export("size")
	public int size;
	@ObfuscatedName("ag")
	@Export("models")
	int[] models;
	@ObfuscatedName("au")
	int[] field2033;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1125472619
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1523007705
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 460772513
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 423887139
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 885355689
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1008827151
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1769941051
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1595158801
	)
	public int field2047;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -638182201
	)
	public int field2042;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1799836063
	)
	public int field2043;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 626333513
	)
	public int field2044;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 892926549
	)
	public int field2049;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1556805093
	)
	public int field2046;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1214612727
	)
	public int field2029;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2147369047
	)
	public int field2048;
	@ObfuscatedName("ba")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("bx")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("bl")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("bi")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("bv")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("bq")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1485544619
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 700549413
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 300137053
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("bw")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 816622309
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -1187939191
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -732681031
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("bd")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1371288579
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1154343637
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("bc")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("bg")
	@Export("isClipped")
	public boolean isClipped;
	@ObfuscatedName("bb")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("bu")
	@Export("lowPriorityFollowerOps")
	public boolean lowPriorityFollowerOps;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -985280107
	)
	public int field2069;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("br")
	@Export("stats")
	int[] stats;
	@ObfuscatedName("bk")
	@Export("headIconArchiveIds")
	int[] headIconArchiveIds;
	@ObfuscatedName("bh")
	@Export("headIconSpriteIndex")
	short[] headIconSpriteIndex;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -2074360995
	)
	@Export("footprintSize")
	int footprintSize;

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
		this.field2047 = -1;
		this.field2042 = -1;
		this.field2043 = -1;
		this.field2044 = -1;
		this.field2049 = -1;
		this.field2046 = -1;
		this.field2029 = -1;
		this.field2048 = -1;
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
		this.field2069 = -1;
		this.stats = new int[]{1, 1, 1, 1, 1, 1};
		this.headIconArchiveIds = null;
		this.headIconSpriteIndex = null;
		this.footprintSize = -1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "50"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.footprintSize == -1) {
			this.footprintSize = (int)((float)(this.size * 128) * 0.4F);
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "311274038"
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lwt;II)V",
		garbageValue = "1995331486"
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
			this.field2033 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2033[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 74) {
			this.stats[0] = var1.readUnsignedShort();
		} else if (var2 == 75) {
			this.stats[1] = var1.readUnsignedShort();
		} else if (var2 == 76) {
			this.stats[2] = var1.readUnsignedShort();
		} else if (var2 == 77) {
			this.stats[3] = var1.readUnsignedShort();
		} else if (var2 == 78) {
			this.stats[4] = var1.readUnsignedShort();
		} else if (var2 == 79) {
			this.stats[5] = var1.readUnsignedShort();
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
			this.contrast = var1.readByte() * 5;
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
					this.field2047 = var1.readUnsignedShort();
				} else if (var2 == 115) {
					this.field2047 = var1.readUnsignedShort();
					this.field2042 = var1.readUnsignedShort();
					this.field2043 = var1.readUnsignedShort();
					this.field2044 = var1.readUnsignedShort();
				} else if (var2 == 116) {
					this.field2049 = var1.readUnsignedShort();
				} else if (var2 == 117) {
					this.field2049 = var1.readUnsignedShort();
					this.field2046 = var1.readUnsignedShort();
					this.field2029 = var1.readUnsignedShort();
					this.field2048 = var1.readUnsignedShort();
				} else if (var2 == 122) {
					this.isFollower = true;
				} else if (var2 == 123) {
					this.lowPriorityFollowerOps = true;
				} else if (var2 == 124) {
					this.field2069 = var1.readUnsignedShort();
				} else if (var2 == 126) {
					this.footprintSize = var1.readUnsignedShort();
				} else if (var2 == 249) {
					this.params = UrlRequester.readStringIntParameters(var1, this.params);
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lip;ILip;ILht;I)Ljm;",
		garbageValue = "1783714072"
	)
	@Export("getModel")
	public final Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, NpcOverrides var5) {
		if (this.transforms != null) {
			NPCComposition var10 = this.transform();
			return var10 == null ? null : var10.getModel(var1, var2, var3, var4, var5);
		} else {
			long var6 = (long)this.id;
			if (var5 != null) {
				var6 |= var5.field2018 << 16;
			}

			Model var8 = (Model)NpcDefinition_cachedModels.get(var6);
			if (var8 == null) {
				ModelData var9 = this.getModelData(this.models, var5);
				if (var9 == null) {
					return null;
				}

				var8 = var9.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30);
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lht;I)Ljj;",
		garbageValue = "-2119011705"
	)
	public final ModelData method4200(NpcOverrides var1) {
		if (this.transforms != null) {
			NPCComposition var2 = this.transform();
			return var2 == null ? null : var2.method4200(var1);
		} else {
			return this.getModelData(this.field2033, var1);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([ILht;B)Ljj;",
		garbageValue = "112"
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
				if (var3[var5] != -1 && !field2026.tryLoadFile(var3[var5], 0)) {
					var4 = true;
				}
			}

			if (var4) {
				return null;
			} else {
				ModelData[] var9 = new ModelData[var3.length];

				for (int var6 = 0; var6 < var3.length; ++var6) {
					var9[var6] = ModelData.ModelData_get(field2026, var3[var6], 0);
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lhd;",
		garbageValue = "-1641175501"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = class4.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? UserComparator3.getNpcDefinition(var2) : null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1219421941"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) {
			return true;
		} else {
			int var1 = -1;
			if (this.transformVarbit != -1) {
				var1 = class4.getVarbit(this.transformVarbit);
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-825806141"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return ObjectSound.method1601(this.params, var1, var2);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1540643466"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return TaskHandler.method4701(this.params, var1, var2);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-43"
	)
	public boolean method4190() {
		return this.headIconArchiveIds != null && this.headIconSpriteIndex != null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "29485288"
	)
	public int[] method4161() {
		return this.headIconArchiveIds;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1806788846"
	)
	public int method4156(int var1) {
		return this.headIconArchiveIds != null && var1 < this.headIconArchiveIds.length ? this.headIconArchiveIds[var1] : -1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "1786501000"
	)
	public short[] method4204() {
		return this.headIconSpriteIndex;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)S",
		garbageValue = "0"
	)
	public short method4164(int var1) {
		return this.headIconSpriteIndex != null && var1 < this.headIconSpriteIndex.length ? this.headIconSpriteIndex[var1] : -1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	public int method4165() {
		return this.footprintSize;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "313659595"
	)
	public static void method4155() {
		class205.field1909.clear();
	}

	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lov;I)Ljava/lang/String;",
		garbageValue = "1088774262"
	)
	static String method4219(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) {
			for (int var2 = 1; var2 <= 5; ++var2) {
				while (true) {
					int var3 = var0.indexOf("%" + var2);
					if (var3 == -1) {
						break;
					}

					var0 = var0.substring(0, var3) + class390.method7964(class71.method2212(var1, var2 - 1)) + var0.substring(var3 + 2);
				}
			}
		}

		return var0;
	}
}
