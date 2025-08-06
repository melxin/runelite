import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("NpcDefinition_archive")
	public static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	public static AbstractArchive field2071;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("NpcDefinition_cached")
	public static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("NpcDefinition_cachedModels")
	public static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("sh")
	@ObfuscatedSignature(
		descriptor = "Lbk;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1552593921
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ap")
	@Export("name")
	public String name;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1396635903
	)
	@Export("size")
	public int size;
	@ObfuscatedName("aj")
	@Export("models")
	int[] models;
	@ObfuscatedName("ag")
	int[] field2078;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -492206343
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1695057683
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -318289737
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1518584537
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 340627351
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1973893965
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 445382937
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1021772805
	)
	public int field2086;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1632099241
	)
	public int field2101;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1375354901
	)
	public int field2073;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1759914089
	)
	public int field2089;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1374408941
	)
	public int field2090;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -303520339
	)
	public int field2091;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1169827043
	)
	public int field2092;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2122093263
	)
	public int field2093;
	@ObfuscatedName("bj")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("bn")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("bi")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("bw")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("bo")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("be")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1623314349
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 511071835
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1642373519
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("bx")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1440769351
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1758029731
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -2074329477
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("bd")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1881563785
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1626788799
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("bh")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("bg")
	@Export("isClipped")
	public boolean isClipped;
	@ObfuscatedName("bt")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("bs")
	@Export("lowPriorityFollowerOps")
	public boolean lowPriorityFollowerOps;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1210693463
	)
	public int field2114;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("bz")
	@Export("stats")
	int[] stats;
	@ObfuscatedName("bk")
	@Export("headIconArchiveIds")
	int[] headIconArchiveIds;
	@ObfuscatedName("bb")
	@Export("headIconSpriteIndex")
	short[] headIconSpriteIndex;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -1223625765
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
		this.field2086 = -1;
		this.field2101 = -1;
		this.field2073 = -1;
		this.field2089 = -1;
		this.field2090 = -1;
		this.field2091 = -1;
		this.field2092 = -1;
		this.field2093 = -1;
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
		this.field2114 = -1;
		this.stats = new int[]{1, 1, 1, 1, 1, 1};
		this.headIconArchiveIds = null;
		this.headIconSpriteIndex = null;
		this.footprintSize = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "739385201"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.footprintSize == -1) {
			this.footprintSize = (int)((float)(this.size * 128) * 0.4F);
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lwj;B)V",
		garbageValue = "-63"
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
		garbageValue = "2093107081"
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
			this.field2078 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2078[var4] = var1.readUnsignedShort();
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
					this.field2086 = var1.readUnsignedShort();
				} else if (var2 == 115) {
					this.field2086 = var1.readUnsignedShort();
					this.field2101 = var1.readUnsignedShort();
					this.field2073 = var1.readUnsignedShort();
					this.field2089 = var1.readUnsignedShort();
				} else if (var2 == 116) {
					this.field2090 = var1.readUnsignedShort();
				} else if (var2 == 117) {
					this.field2090 = var1.readUnsignedShort();
					this.field2091 = var1.readUnsignedShort();
					this.field2092 = var1.readUnsignedShort();
					this.field2093 = var1.readUnsignedShort();
				} else if (var2 == 122) {
					this.isFollower = true;
				} else if (var2 == 123) {
					this.lowPriorityFollowerOps = true;
				} else if (var2 == 124) {
					this.field2114 = var1.readUnsignedShort();
				} else if (var2 == 126) {
					this.footprintSize = var1.readUnsignedShort();
				} else if (var2 == 249) {
					this.params = class391.readStringIntParameters(var1, this.params);
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Liz;ILiz;ILhu;I)Ljx;",
		garbageValue = "-62934283"
	)
	@Export("getModel")
	public final Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, NpcOverrides var5) {
		if (this.transforms != null) {
			NPCComposition var10 = this.transform();
			return var10 == null ? null : var10.getModel(var1, var2, var3, var4, var5);
		} else {
			long var6 = (long)this.id;
			if (var5 != null) {
				var6 |= var5.field2066 << 16;
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lhu;I)Lik;",
		garbageValue = "16711935"
	)
	public final ModelData method4309(NpcOverrides var1) {
		if (this.transforms != null) {
			NPCComposition var2 = this.transform();
			return var2 == null ? null : var2.method4309(var1);
		} else {
			return this.getModelData(this.field2078, var1);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([ILhu;B)Lik;",
		garbageValue = "103"
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
				if (var3[var5] != -1 && !field2071.tryLoadFile(var3[var5], 0)) {
					var4 = true;
				}
			}

			if (var4) {
				return null;
			} else {
				ModelData[] var9 = new ModelData[var3.length];

				for (int var6 = 0; var6 < var3.length; ++var6) {
					var9[var6] = ModelData.ModelData_get(field2071, var3[var6], 0);
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
		descriptor = "(I)Lhg;",
		garbageValue = "1178203682"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = SequenceDefinition.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class191.getNpcDefinition(var2) : null;
	}

	@ObfuscatedName("am")
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
				var1 = SequenceDefinition.getVarbit(this.transformVarbit);
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-556301517"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return FileSystem.method5911(this.params, var1, var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-85"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return KeyHandler.method391(this.params, var1, var2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "65535"
	)
	public boolean method4342() {
		return this.headIconArchiveIds != null && this.headIconSpriteIndex != null;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(S)[I",
		garbageValue = "-12437"
	)
	public int[] method4320() {
		return this.headIconArchiveIds;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-113"
	)
	public int method4321(int var1) {
		return this.headIconArchiveIds != null && var1 < this.headIconArchiveIds.length ? this.headIconArchiveIds[var1] : -1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)[S",
		garbageValue = "4"
	)
	public short[] method4310() {
		return this.headIconSpriteIndex;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)S",
		garbageValue = "-1863401680"
	)
	public short method4360(int var1) {
		return this.headIconSpriteIndex != null && var1 < this.headIconSpriteIndex.length ? this.headIconSpriteIndex[var1] : -1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "599202151"
	)
	public int method4324() {
		return this.footprintSize;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-2"
	)
	public static void method4312() {
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
	}
}
