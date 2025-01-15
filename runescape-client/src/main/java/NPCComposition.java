import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	@Export("NpcDefinition_archive")
	static AbstractArchive NpcDefinition_archive;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("NpcDefinition_cached")
	static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("NpcDefinition_cachedModels")
	static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1484728147
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ae")
	@Export("name")
	public String name;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 544480039
	)
	@Export("size")
	public int size;
	@ObfuscatedName("at")
	@Export("models")
	int[] models;
	@ObfuscatedName("ac")
	int[] field2657;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -2100195497
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1466777751
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -957173073
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1423413901
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 826218875
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1547035255
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -777259805
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1418125129
	)
	public int field2659;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -525811383
	)
	public int field2633;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1855644605
	)
	public int field2634;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -9235403
	)
	public int field2623;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 332535463
	)
	public int field2636;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -864477045
	)
	public int field2649;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1501008845
	)
	public int field2660;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1966830645
	)
	public int field2639;
	@ObfuscatedName("aj")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("bu")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("bh")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("bw")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("bb")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("bx")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1351731847
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 257998873
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 953998459
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("bt")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -85195023
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -94221683
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1268584791
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("bp")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1243761615
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -2004054639
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("bv")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("bq")
	@Export("isClipped")
	public boolean isClipped;
	@ObfuscatedName("ba")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("bk")
	@Export("lowPriorityFollowerOps")
	public boolean lowPriorityFollowerOps;
	@ObfuscatedName("bs")
	@Export("headIconArchiveIds")
	int[] headIconArchiveIds;
	@ObfuscatedName("bj")
	@Export("headIconSpriteIndex")
	short[] headIconSpriteIndex;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 879404947
	)
	public int field2662;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lue;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("bn")
	int[] field2664;

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
		this.field2659 = -1;
		this.field2633 = -1;
		this.field2634 = -1;
		this.field2623 = -1;
		this.field2636 = -1;
		this.field2649 = -1;
		this.field2660 = -1;
		this.field2639 = -1;
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
		this.field2662 = -1;
		this.field2664 = new int[]{1, 1, 1, 1, 1, 1};
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-864949448"
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvy;II)V",
		garbageValue = "1091946639"
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
			this.field2657 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2657[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 74) {
			this.field2664[0] = var1.readUnsignedShort();
		} else if (var2 == 75) {
			this.field2664[1] = var1.readUnsignedShort();
		} else if (var2 == 76) {
			this.field2664[2] = var1.readUnsignedShort();
		} else if (var2 == 77) {
			this.field2664[3] = var1.readUnsignedShort();
		} else if (var2 == 78) {
			this.field2664[4] = var1.readUnsignedShort();
		} else if (var2 == 79) {
			this.field2664[5] = var1.readUnsignedShort();
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
					this.field2659 = var1.readUnsignedShort();
				} else if (var2 == 115) {
					this.field2659 = var1.readUnsignedShort();
					this.field2633 = var1.readUnsignedShort();
					this.field2634 = var1.readUnsignedShort();
					this.field2623 = var1.readUnsignedShort();
				} else if (var2 == 116) {
					this.field2636 = var1.readUnsignedShort();
				} else if (var2 == 117) {
					this.field2636 = var1.readUnsignedShort();
					this.field2649 = var1.readUnsignedShort();
					this.field2660 = var1.readUnsignedShort();
					this.field2639 = var1.readUnsignedShort();
				} else if (var2 == 122) {
					this.isFollower = true;
				} else if (var2 == 123) {
					this.lowPriorityFollowerOps = true;
				} else if (var2 == 124) {
					this.field2662 = var1.readUnsignedShort();
				} else if (var2 == 249) {
					this.params = class1.readStringIntParameters(var1, this.params);
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lkb;ILkb;ILjs;B)Lhv;",
		garbageValue = "125"
	)
	@Export("getModel")
	public final Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, NpcOverrides var5) {
		if (this.transforms != null) {
			NPCComposition var10 = this.transform();
			return var10 == null ? null : var10.getModel(var1, var2, var3, var4, var5);
		} else {
			long var6 = (long)this.id;
			if (var5 != null) {
				var6 |= var5.field2613 << 16;
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljs;B)Lgx;",
		garbageValue = "80"
	)
	public final ModelData method5342(NpcOverrides var1) {
		if (this.transforms != null) {
			NPCComposition var2 = this.transform();
			return var2 == null ? null : var2.method5342(var1);
		} else {
			return this.getModelData(this.field2657, var1);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "([ILjs;I)Lgx;",
		garbageValue = "-571439410"
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
				if (var3[var5] != -1 && !class430.field4779.tryLoadFile(var3[var5], 0)) {
					var4 = true;
				}
			}

			if (var4) {
				return null;
			} else {
				ModelData[] var9 = new ModelData[var3.length];

				for (int var6 = 0; var6 < var3.length; ++var6) {
					var9[var6] = ModelData.ModelData_get(class430.field4779, var3[var6], 0);
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Ljz;",
		garbageValue = "112"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = class77.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? FadeOutTask.getNpcDefinition(var2) : null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-96"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) {
			return true;
		} else {
			int var1 = -1;
			if (this.transformVarbit != -1) {
				var1 = class77.getVarbit(this.transformVarbit);
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
		garbageValue = "-2059003076"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return Canvas.method336(this.params, var1, var2);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "2072668217"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class47.method906(this.params, var1, var2);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "53"
	)
	public boolean method5306() {
		return this.headIconArchiveIds != null && this.headIconSpriteIndex != null;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1580797982"
	)
	public int[] method5338() {
		return this.headIconArchiveIds;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "7"
	)
	public int method5330(int var1) {
		return this.headIconArchiveIds != null && var1 < this.headIconArchiveIds.length ? this.headIconArchiveIds[var1] : -1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "829641065"
	)
	public short[] method5308() {
		return this.headIconSpriteIndex;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)S",
		garbageValue = "-2033521077"
	)
	public short method5309(int var1) {
		return this.headIconSpriteIndex != null && var1 < this.headIconSpriteIndex.length ? this.headIconSpriteIndex[var1] : -1;
	}

	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "(Ldt;ZB)V",
		garbageValue = "0"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group;
		int var3 = (int)var0.key;
		var0.remove();
		if (var1) {
			ClanChannel.widgetDefinition.method7021(var2);
		}

		CollisionMap.method5831(var2);
		Widget var4 = ClanChannel.widgetDefinition.method7031(var3);
		if (var4 != null) {
			UserComparator8.invalidateWidget(var4);
		}

		if (Client.rootInterface != -1) {
			Client.runIntfCloseListeners(Client.rootInterface, 1);
		}

	}
}
