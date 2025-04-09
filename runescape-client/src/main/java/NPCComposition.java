import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("NpcDefinition_archive")
	public static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	public static AbstractArchive field2696;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("NpcDefinition_cached")
	public static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("NpcDefinition_cachedModels")
	public static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 301808089
	)
	@Export("id")
	public int id;
	@ObfuscatedName("av")
	@Export("name")
	public String name;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 564678089
	)
	@Export("size")
	public int size;
	@ObfuscatedName("aa")
	@Export("models")
	int[] models;
	@ObfuscatedName("ap")
	int[] field2704;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1086958793
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -48944315
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 838820823
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -825028049
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 168332879
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1380561967
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -817827055
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 334626719
	)
	public int field2712;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 307301969
	)
	public int field2711;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 149220747
	)
	public int field2716;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1837757159
	)
	public int field2715;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 4966457
	)
	public int field2724;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -634818637
	)
	public int field2717;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1370611315
	)
	public int field2718;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 381248087
	)
	public int field2719;
	@ObfuscatedName("ab")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("br")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("bp")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("bz")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("bb")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("bl")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 38262107
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -575477669
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1642600993
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("bk")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1018760121
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 248757721
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 466997823
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("bs")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1461874805
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -1228071009
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("bv")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("be")
	@Export("isClipped")
	public boolean isClipped;
	@ObfuscatedName("bm")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("bq")
	@Export("lowPriorityFollowerOps")
	public boolean lowPriorityFollowerOps;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1392947031
	)
	public int field2695;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("bo")
	int[] field2742;
	@ObfuscatedName("bg")
	@Export("headIconArchiveIds")
	int[] headIconArchiveIds;
	@ObfuscatedName("by")
	@Export("headIconSpriteIndex")
	short[] headIconSpriteIndex;

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
		this.field2712 = -1;
		this.field2711 = -1;
		this.field2716 = -1;
		this.field2715 = -1;
		this.field2724 = -1;
		this.field2717 = -1;
		this.field2718 = -1;
		this.field2719 = -1;
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
		this.field2695 = -1;
		this.field2742 = new int[]{1, 1, 1, 1, 1, 1};
		this.headIconArchiveIds = null;
		this.headIconSpriteIndex = null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1300700023"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lve;I)V",
		garbageValue = "-2124174053"
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lve;II)V",
		garbageValue = "1925846696"
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
			this.field2704 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2704[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 74) {
			this.field2742[0] = var1.readUnsignedShort();
		} else if (var2 == 75) {
			this.field2742[1] = var1.readUnsignedShort();
		} else if (var2 == 76) {
			this.field2742[2] = var1.readUnsignedShort();
		} else if (var2 == 77) {
			this.field2742[3] = var1.readUnsignedShort();
		} else if (var2 == 78) {
			this.field2742[4] = var1.readUnsignedShort();
		} else if (var2 == 79) {
			this.field2742[5] = var1.readUnsignedShort();
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
					this.field2712 = var1.readUnsignedShort();
				} else if (var2 == 115) {
					this.field2712 = var1.readUnsignedShort();
					this.field2711 = var1.readUnsignedShort();
					this.field2716 = var1.readUnsignedShort();
					this.field2715 = var1.readUnsignedShort();
				} else if (var2 == 116) {
					this.field2724 = var1.readUnsignedShort();
				} else if (var2 == 117) {
					this.field2724 = var1.readUnsignedShort();
					this.field2717 = var1.readUnsignedShort();
					this.field2718 = var1.readUnsignedShort();
					this.field2719 = var1.readUnsignedShort();
				} else if (var2 == 122) {
					this.isFollower = true;
				} else if (var2 == 123) {
					this.lowPriorityFollowerOps = true;
				} else if (var2 == 124) {
					this.field2695 = var1.readUnsignedShort();
				} else if (var2 == 249) {
					this.params = Projectile.readStringIntParameters(var1, this.params);
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lkm;ILkm;ILja;I)Lhe;",
		garbageValue = "1704304609"
	)
	@Export("getModel")
	public final Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, NpcOverrides var5) {
		if (this.transforms != null) {
			NPCComposition var10 = this.transform();
			return var10 == null ? null : var10.getModel(var1, var2, var3, var4, var5);
		} else {
			long var6 = (long)this.id;
			if (var5 != null) {
				var6 |= var5.field2690 << 16;
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lja;I)Lgz;",
		garbageValue = "2089464814"
	)
	public final ModelData method5195(NpcOverrides var1) {
		if (this.transforms != null) {
			NPCComposition var2 = this.transform();
			return var2 == null ? null : var2.method5195(var1);
		} else {
			return this.getModelData(this.field2704, var1);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([ILja;I)Lgz;",
		garbageValue = "-262288022"
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
				if (var3[var5] != -1 && !field2696.tryLoadFile(var3[var5], 0)) {
					var4 = true;
				}
			}

			if (var4) {
				return null;
			} else {
				ModelData[] var9 = new ModelData[var3.length];

				for (int var6 = 0; var6 < var3.length; ++var6) {
					var9[var6] = ModelData.ModelData_get(field2696, var3[var6], 0);
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Ljn;",
		garbageValue = "-64"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = class375.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class232.getNpcDefinition(var2) : null;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-91"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) {
			return true;
		} else {
			int var1 = -1;
			if (this.transformVarbit != -1) {
				var1 = class375.getVarbit(this.transformVarbit);
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1892955042"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		IterableNodeHashTable var4 = this.params;
		int var3;
		if (var4 == null) {
			var3 = var2;
		} else {
			IntegerNode var5 = (IntegerNode)var4.get((long)var1);
			if (var5 == null) {
				var3 = var2;
			} else {
				var3 = var5.integer;
			}
		}

		return var3;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "74162229"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return SceneTilePaint.method4586(this.params, var1, var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1692576977"
	)
	public boolean method5182() {
		return this.headIconArchiveIds != null && this.headIconSpriteIndex != null;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "2010058015"
	)
	public int[] method5183() {
		return this.headIconArchiveIds;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "15"
	)
	public int method5184(int var1) {
		return this.headIconArchiveIds != null && var1 < this.headIconArchiveIds.length ? this.headIconArchiveIds[var1] : -1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "977125024"
	)
	public short[] method5172() {
		return this.headIconSpriteIndex;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)S",
		garbageValue = "-32"
	)
	public short method5186(int var1) {
		return this.headIconSpriteIndex != null && var1 < this.headIconSpriteIndex.length ? this.headIconSpriteIndex[var1] : -1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ldj;IIIIIIIILkd;I)V",
		garbageValue = "1342351555"
	)
	static final void method5220(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, CollisionMap var9) {
		ObjectComposition var10 = class162.getObjectDefinition(var5);
		int var11 = var8 >= 0 ? var8 : var10.animationId;
		int var12;
		int var13;
		if (var6 != 1 && var6 != 3) {
			var12 = var10.sizeX;
			var13 = var10.sizeY;
		} else {
			var12 = var10.sizeY;
			var13 = var10.sizeX;
		}

		int var14;
		int var15;
		if (var3 + var12 <= var0.sizeX) {
			var14 = var3 + (var12 >> 1);
			var15 = var3 + (var12 + 1 >> 1);
		} else {
			var14 = var3;
			var15 = var3 + 1;
		}

		int var16;
		int var17;
		if (var13 + var4 <= var0.sizeY) {
			var16 = (var13 >> 1) + var4;
			var17 = (var13 + 1 >> 1) + var4;
		} else {
			var16 = var4;
			var17 = var4 + 1;
		}

		int[][] var18 = var0.tileHeights[var2];
		int var19 = var18[var15][var17] + var18[var14][var17] + var18[var15][var16] + var18[var14][var16] >> 2;
		int var20 = (var3 << 7) + (var12 << 6);
		int var21 = (var4 << 7) + (var13 << 6);
		Scene var22 = var0.scene;
		long var23 = LoginPacket.calculateTag(var1, var3, var4, 2, var10.int1 == 0, var5, var0.id);
		int var25 = (var6 << 6) + var7;
		if (var10.int3 == 1) {
			var25 += 256;
		}

		Object var33;
		if (var7 == 22) {
			if (var11 == -1 && var10.transforms == null) {
				var33 = var10.getModel(22, var6, var18, var20, var19, var21);
			} else {
				var33 = new DynamicObject(var0, var5, 22, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
			}

			var22.newFloorDecoration(var1, var3, var4, var19, (Renderable)var33, var23, var25);
			if (var10.interactType == 1 && var9 != null) {
				var9.setBlockedByFloorDec(var3, var4);
			}

		} else if (var7 != 10 && var7 != 11) {
			if (var7 >= 12) {
				if (var11 == -1 && var10.transforms == null) {
					var33 = var10.getModel(var7, var6, var18, var20, var19, var21);
				} else {
					var33 = new DynamicObject(var0, var5, var7, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
				}

				var22.method4062(var1, var3, var4, var19, 1, 1, (Renderable)var33, 0, var23, var25);
				if (var10.interactType != 0 && var9 != null) {
					var9.addGameObject(var3, var4, var12, var13, var10.boolean1);
				}

			} else if (var7 == 0) {
				if (var11 == -1 && var10.transforms == null) {
					var33 = var10.getModel(0, var6, var18, var20, var19, var21);
				} else {
					var33 = new DynamicObject(var0, var5, 0, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
				}

				var22.newBoundaryObject(var1, var3, var4, var19, (Renderable)var33, (Renderable)null, Tiles.field1037[var6], 0, var23, var25);
				if (var10.interactType != 0 && var9 != null) {
					var9.method5732(var3, var4, var7, var6, var10.boolean1);
				}

			} else if (var7 == 1) {
				if (var11 == -1 && var10.transforms == null) {
					var33 = var10.getModel(1, var6, var18, var20, var19, var21);
				} else {
					var33 = new DynamicObject(var0, var5, 1, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
				}

				var22.newBoundaryObject(var1, var3, var4, var19, (Renderable)var33, (Renderable)null, Tiles.field1035[var6], 0, var23, var25);
				if (var10.interactType != 0 && var9 != null) {
					var9.method5732(var3, var4, var7, var6, var10.boolean1);
				}

			} else {
				int var26;
				if (var7 == 2) {
					var26 = var6 + 1 & 3;
					Object var28;
					Object var34;
					if (var11 == -1 && var10.transforms == null) {
						var34 = var10.getModel(2, var6 + 4, var18, var20, var19, var21);
						var28 = var10.getModel(2, var26, var18, var20, var19, var21);
					} else {
						var34 = new DynamicObject(var0, var5, 2, var6 + 4, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
						var28 = new DynamicObject(var0, var5, 2, var26, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
					}

					var22.newBoundaryObject(var1, var3, var4, var19, (Renderable)var34, (Renderable)var28, Tiles.field1037[var6], Tiles.field1037[var26], var23, var25);
					if (var10.interactType != 0 && var9 != null) {
						var9.method5732(var3, var4, var7, var6, var10.boolean1);
					}

				} else if (var7 == 3) {
					if (var11 == -1 && var10.transforms == null) {
						var33 = var10.getModel(3, var6, var18, var20, var19, var21);
					} else {
						var33 = new DynamicObject(var0, var5, 3, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
					}

					var22.newBoundaryObject(var1, var3, var4, var19, (Renderable)var33, (Renderable)null, Tiles.field1035[var6], 0, var23, var25);
					if (var10.interactType != 0 && var9 != null) {
						var9.method5732(var3, var4, var7, var6, var10.boolean1);
					}

				} else if (var7 == 9) {
					if (var11 == -1 && var10.transforms == null) {
						var33 = var10.getModel(var7, var6, var18, var20, var19, var21);
					} else {
						var33 = new DynamicObject(var0, var5, var7, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
					}

					var22.method4062(var1, var3, var4, var19, 1, 1, (Renderable)var33, 0, var23, var25);
					if (var10.interactType != 0 && var9 != null) {
						var9.addGameObject(var3, var4, var12, var13, var10.boolean1);
					}

				} else if (var7 == 4) {
					if (var11 == -1 && var10.transforms == null) {
						var33 = var10.getModel(4, var6, var18, var20, var19, var21);
					} else {
						var33 = new DynamicObject(var0, var5, 4, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
					}

					var22.newWallDecoration(var1, var3, var4, var19, (Renderable)var33, (Renderable)null, Tiles.field1037[var6], 0, 0, 0, var23, var25);
				} else {
					long var27;
					Object var29;
					if (var7 == 5) {
						var26 = 16;
						var27 = var22.getBoundaryObjectTag(var1, var3, var4);
						if (0L != var27) {
							var26 = class162.getObjectDefinition(HttpMethod.Entity_unpackID(var27)).int2;
						}

						if (var11 == -1 && var10.transforms == null) {
							var29 = var10.getModel(4, var6, var18, var20, var19, var21);
						} else {
							var29 = new DynamicObject(var0, var5, 4, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
						}

						var22.newWallDecoration(var1, var3, var4, var19, (Renderable)var29, (Renderable)null, Tiles.field1037[var6], 0, Tiles.field1038[var6] * var26, Tiles.field1041[var6] * var26, var23, var25);
					} else if (var7 == 6) {
						var26 = 8;
						var27 = var22.getBoundaryObjectTag(var1, var3, var4);
						if (var27 != 0L) {
							var26 = class162.getObjectDefinition(HttpMethod.Entity_unpackID(var27)).int2 / 2;
						}

						if (var11 == -1 && var10.transforms == null) {
							var29 = var10.getModel(4, var6 + 4, var18, var20, var19, var21);
						} else {
							var29 = new DynamicObject(var0, var5, 4, var6 + 4, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
						}

						var22.newWallDecoration(var1, var3, var4, var19, (Renderable)var29, (Renderable)null, 256, var6, Tiles.field1039[var6] * var26, Tiles.field1040[var6] * var26, var23, var25);
					} else if (var7 == 7) {
						int var32 = var6 + 2 & 3;
						if (var11 == -1 && var10.transforms == null) {
							var33 = var10.getModel(4, var32 + 4, var18, var20, var19, var21);
						} else {
							var33 = new DynamicObject(var0, var5, 4, var32 + 4, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
						}

						var22.newWallDecoration(var1, var3, var4, var19, (Renderable)var33, (Renderable)null, 256, var32, 0, 0, var23, var25);
					} else if (var7 == 8) {
						var26 = 8;
						var27 = var22.getBoundaryObjectTag(var1, var3, var4);
						if (var27 != 0L) {
							var26 = class162.getObjectDefinition(HttpMethod.Entity_unpackID(var27)).int2 / 2;
						}

						int var31 = var6 + 2 & 3;
						Object var30;
						if (var11 == -1 && var10.transforms == null) {
							var29 = var10.getModel(4, var6 + 4, var18, var20, var19, var21);
							var30 = var10.getModel(4, var31 + 4, var18, var20, var19, var21);
						} else {
							var29 = new DynamicObject(var0, var5, 4, var6 + 4, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
							var30 = new DynamicObject(var0, var5, 4, var31 + 4, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
						}

						var22.newWallDecoration(var1, var3, var4, var19, (Renderable)var29, (Renderable)var30, 256, var6, Tiles.field1039[var6] * var26, Tiles.field1040[var6] * var26, var23, var25);
					}
				}
			}
		} else {
			if (var11 == -1 && var10.transforms == null) {
				var33 = var10.getModel(10, var6, var18, var20, var19, var21);
			} else {
				var33 = new DynamicObject(var0, var5, 10, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
			}

			if (var33 != null) {
				var22.method4062(var1, var3, var4, var19, var12, var13, (Renderable)var33, var7 == 11 ? 256 : 0, var23, var25);
			}

			if (var10.interactType != 0 && var9 != null) {
				var9.addGameObject(var3, var4, var12, var13, var10.boolean1);
			}

		}
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "42"
	)
	static final boolean method5175() {
		return Client.isMenuOpen;
	}
}
