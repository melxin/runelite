import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1214973283
	)
	static int field2035;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	public static AbstractArchive field2036;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("NpcDefinition_cached")
	public static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("NpcDefinition_cachedModels")
	public static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -299559089
	)
	@Export("id")
	public int id;
	@ObfuscatedName("aj")
	@Export("name")
	public String name;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -658711519
	)
	@Export("size")
	public int size;
	@ObfuscatedName("au")
	@Export("models")
	int[] models;
	@ObfuscatedName("an")
	int[] field1993;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -225422369
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 854945681
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1139649681
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1311512733
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 219841045
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -727609081
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1518239291
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1659198939
	)
	public int field2003;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1722709863
	)
	public int field1999;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1845517273
	)
	public int field2029;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 785250831
	)
	public int field2004;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 853298921
	)
	public int field2005;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 34376483
	)
	public int field2006;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -196142553
	)
	public int field2007;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -793797429
	)
	public int field2008;
	@ObfuscatedName("ag")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("bw")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("bm")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("bv")
	@Export("retextureTo")
	public short[] retextureTo;
	@ObfuscatedName("bt")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("bk")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1996327333
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 2081575675
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1653084159
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("bo")
	@Export("isVisible")
	public boolean isVisible;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1612298679
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 383358959
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1954433125
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("bg")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 133032279
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -929708883
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("bz")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("bx")
	@Export("isClipped")
	public boolean isClipped;
	@ObfuscatedName("br")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("bq")
	@Export("lowPriorityFollowerOps")
	public boolean lowPriorityFollowerOps;
	@ObfuscatedName("bn")
	@Export("headIconArchiveIds")
	int[] headIconArchiveIds;
	@ObfuscatedName("bd")
	@Export("headIconSpriteIndex")
	short[] headIconSpriteIndex;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -2107515917
	)
	public int field2028;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("by")
	int[] field2033;

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
		this.field2003 = -1;
		this.field1999 = -1;
		this.field2029 = -1;
		this.field2004 = -1;
		this.field2005 = -1;
		this.field2006 = -1;
		this.field2007 = -1;
		this.field2008 = -1;
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
		this.field2028 = -1;
		this.field2033 = new int[]{1, 1, 1, 1, 1, 1};
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "7575"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lvj;B)V",
		garbageValue = "2"
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
		descriptor = "(Lvj;II)V",
		garbageValue = "-1698447768"
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
			this.field1993 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field1993[var4] = var1.readUnsignedShort();
			}
		} else if (var2 == 74) {
			this.field2033[0] = var1.readUnsignedShort();
		} else if (var2 == 75) {
			this.field2033[1] = var1.readUnsignedShort();
		} else if (var2 == 76) {
			this.field2033[2] = var1.readUnsignedShort();
		} else if (var2 == 77) {
			this.field2033[3] = var1.readUnsignedShort();
		} else if (var2 == 78) {
			this.field2033[4] = var1.readUnsignedShort();
		} else if (var2 == 79) {
			this.field2033[5] = var1.readUnsignedShort();
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
					this.field2003 = var1.readUnsignedShort();
				} else if (var2 == 115) {
					this.field2003 = var1.readUnsignedShort();
					this.field1999 = var1.readUnsignedShort();
					this.field2029 = var1.readUnsignedShort();
					this.field2004 = var1.readUnsignedShort();
				} else if (var2 == 116) {
					this.field2005 = var1.readUnsignedShort();
				} else if (var2 == 117) {
					this.field2005 = var1.readUnsignedShort();
					this.field2006 = var1.readUnsignedShort();
					this.field2007 = var1.readUnsignedShort();
					this.field2008 = var1.readUnsignedShort();
				} else if (var2 == 122) {
					this.isFollower = true;
				} else if (var2 == 123) {
					this.lowPriorityFollowerOps = true;
				} else if (var2 == 124) {
					this.field2028 = var1.readUnsignedShort();
				} else if (var2 == 249) {
					this.params = class28.readStringIntParameters(var1, this.params);
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Liy;ILiy;ILhn;B)Ljt;",
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
				var6 |= var5.field1984 << 16;
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lhn;I)Ljb;",
		garbageValue = "295014303"
	)
	public final ModelData method3904(NpcOverrides var1) {
		if (this.transforms != null) {
			NPCComposition var2 = this.transform();
			return var2 == null ? null : var2.method3904(var1);
		} else {
			return this.getModelData(this.field1993, var1);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([ILhn;I)Ljb;",
		garbageValue = "1556632639"
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
				if (var3[var5] != -1 && !field2036.tryLoadFile(var3[var5], 0)) {
					var4 = true;
				}
			}

			if (var4) {
				return null;
			} else {
				ModelData[] var9 = new ModelData[var3.length];

				for (int var6 = 0; var6 < var3.length; ++var6) {
					var9[var6] = ModelData.ModelData_get(field2036, var3[var6], 0);
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Lhw;",
		garbageValue = "-994526882"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = Frames.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? DynamicObject.getNpcDefinition(var2) : null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1484332622"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) {
			return true;
		} else {
			int var1 = -1;
			if (this.transformVarbit != -1) {
				var1 = Frames.getVarbit(this.transformVarbit);
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1853246422"
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-25"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params;
		String var3;
		if (var4 == null) {
			var3 = var2;
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1);
			if (var5 == null) {
				var3 = var2;
			} else {
				var3 = (String)var5.obj;
			}
		}

		return var3;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "14"
	)
	public boolean method3940() {
		return this.headIconArchiveIds != null && this.headIconSpriteIndex != null;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "102933772"
	)
	public int[] method3911() {
		return this.headIconArchiveIds;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "606523150"
	)
	public int method3915(int var1) {
		return this.headIconArchiveIds != null && var1 < this.headIconArchiveIds.length ? this.headIconArchiveIds[var1] : -1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "1483119586"
	)
	public short[] method3913() {
		return this.headIconSpriteIndex;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)S",
		garbageValue = "-2053752283"
	)
	public short method3952(int var1) {
		return this.headIconSpriteIndex != null && var1 < this.headIconSpriteIndex.length ? this.headIconSpriteIndex[var1] : -1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Lfv;",
		garbageValue = "-2146746969"
	)
	static class139 method3912(int var0) {
		class139 var1 = (class139)ScriptEvent.findEnumerated(class7.method63(), var0);
		if (var1 == null) {
			var1 = class139.field1615;
		}

		return var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lcu;Lcu;IZB)I",
		garbageValue = "-84"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) {
			int var4 = var0.population;
			int var5 = var1.population;
			if (!var3) {
				if (var4 == -1) {
					var4 = 2001;
				}

				if (var5 == -1) {
					var5 = 2001;
				}
			}

			return var4 - var5;
		} else if (var2 == 2) {
			return var0.location - var1.location;
		} else if (var2 == 3) {
			if (var0.activity.equals("-")) {
				if (var1.activity.equals("-")) {
					return 0;
				} else {
					return var3 ? -1 : 1;
				}
			} else if (var1.activity.equals("-")) {
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity);
			}
		} else if (var2 == 4) {
			return var0.method1896() ? (var1.method1896() ? 0 : 1) : (var1.method1896() ? -1 : 0);
		} else if (var2 == 5) {
			return var0.method1914() ? (var1.method1914() ? 0 : 1) : (var1.method1914() ? -1 : 0);
		} else if (var2 == 6) {
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) {
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id;
		}
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "10"
	)
	static final void method3953(int var0, int var1, int var2, int var3) {
		class191.method3887();
	}
}
