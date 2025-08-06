import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ia")
@Implements("ObjectComposition")
public class ObjectComposition extends DualNode {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public static final class335 field2298;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public static final class335 field2299;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public static final class335 field2263;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("ObjectDefinition_cached")
	public static EvictingDualNodeHashTable ObjectDefinition_cached;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("ObjectDefinition_cachedModelData")
	public static EvictingDualNodeHashTable ObjectDefinition_cachedModelData;
	@ObfuscatedName("ag")
	@Export("ObjectDefinition_isLowDetail")
	static boolean ObjectDefinition_isLowDetail;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("ObjectDefinition_modelsArchive")
	static AbstractArchive ObjectDefinition_modelsArchive;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("ObjectDefinition_cachedEntities")
	public static EvictingDualNodeHashTable ObjectDefinition_cachedEntities;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("ObjectDefinition_cachedModels")
	public static EvictingDualNodeHashTable ObjectDefinition_cachedModels;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[Lik;"
	)
	@Export("modelDataArray")
	static ModelData[] modelDataArray;
	@ObfuscatedName("fb")
	static boolean field2301;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -682663959
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ax")
	@Export("modelIds")
	int[] modelIds;
	@ObfuscatedName("aq")
	@Export("models")
	int[] models;
	@ObfuscatedName("ao")
	@Export("name")
	public String name;
	@ObfuscatedName("az")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("ad")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("aw")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("af")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 976061623
	)
	@Export("sizeX")
	public int sizeX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 142094165
	)
	@Export("sizeY")
	public int sizeY;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -1132822887
	)
	@Export("interactType")
	public int interactType;
	@ObfuscatedName("bn")
	@Export("boolean1")
	public boolean boolean1;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1758291351
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 853732947
	)
	@Export("clipType")
	int clipType;
	@ObfuscatedName("bo")
	@Export("nonFlatShading")
	boolean nonFlatShading;
	@ObfuscatedName("be")
	@Export("modelClipped")
	public boolean modelClipped;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 146941513
	)
	@Export("animationId")
	public int animationId;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -158186153
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -341141847
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -2110505465
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("bl")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -2004141811
	)
	@Export("mapIconId")
	public int mapIconId;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -61532939
	)
	@Export("mapSceneId")
	public int mapSceneId;
	@ObfuscatedName("bd")
	@Export("isRotated")
	boolean isRotated;
	@ObfuscatedName("br")
	@Export("clipped")
	public boolean clipped;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -2132074559
	)
	@Export("modelSizeX")
	int modelSizeX;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -115979463
	)
	@Export("modelHeight")
	int modelHeight;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 141122853
	)
	@Export("modelSizeY")
	int modelSizeY;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1536788631
	)
	@Export("offsetX")
	int offsetX;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1601041939
	)
	@Export("offsetHeight")
	int offsetHeight;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 2060706601
	)
	@Export("offsetY")
	int offsetY;
	@ObfuscatedName("bp")
	@Export("boolean2")
	public boolean boolean2;
	@ObfuscatedName("bz")
	@Export("isSolid")
	boolean isSolid;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 935472685
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("bb")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -1642800019
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 254106589
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 1439603373
	)
	@Export("ambientSoundId")
	public int ambientSoundId;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -1670246677
	)
	@Export("int7")
	public int int7;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -385839769
	)
	@Export("int8")
	public int int8;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public class335 field2259;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -29123451
	)
	public int field2313;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -1938663823
	)
	public int field2314;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public class335 field2315;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public class335 field2302;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -572033727
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -329750153
	)
	@Export("int6")
	public int int6;
	@ObfuscatedName("ch")
	@Export("soundEffectIds")
	public int[] soundEffectIds;
	@ObfuscatedName("cx")
	@Export("boolean3")
	public boolean boolean3;
	@ObfuscatedName("cv")
	public boolean field2321;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		field2298 = class335.field3773;
		field2299 = class335.field3773;
		field2263 = class335.field3773;
		ObjectDefinition_cached = new EvictingDualNodeHashTable(4096);
		ObjectDefinition_cachedModelData = new EvictingDualNodeHashTable(500);
		ObjectDefinition_isLowDetail = false;
		ObjectDefinition_cachedEntities = new EvictingDualNodeHashTable(30);
		ObjectDefinition_cachedModels = new EvictingDualNodeHashTable(30);
		modelDataArray = new ModelData[4];
	}

	ObjectComposition() {
		this.name = "null";
		this.sizeX = 1;
		this.sizeY = 1;
		this.interactType = 2;
		this.boolean1 = true;
		this.int1 = -1;
		this.clipType = -1;
		this.nonFlatShading = false;
		this.modelClipped = false;
		this.animationId = -1;
		this.int2 = 16;
		this.ambient = 0;
		this.contrast = 0;
		this.actions = new String[5];
		this.mapIconId = -1;
		this.mapSceneId = -1;
		this.isRotated = false;
		this.clipped = true;
		this.modelSizeX = 128;
		this.modelHeight = 128;
		this.modelSizeY = 128;
		this.offsetX = 0;
		this.offsetHeight = 0;
		this.offsetY = 0;
		this.boolean2 = false;
		this.isSolid = false;
		this.int3 = -1;
		this.transformVarbit = -1;
		this.transformVarp = -1;
		this.ambientSoundId = -1;
		this.int7 = 0;
		this.int8 = 0;
		this.field2259 = field2298;
		this.field2313 = 300;
		this.field2314 = 300;
		this.field2315 = field2299;
		this.field2302 = field2263;
		this.int5 = 0;
		this.int6 = 0;
		this.boolean3 = true;
		this.field2321 = false;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "5"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.int1 == -1) {
			this.int1 = 0;
			if (this.modelIds != null && (this.models == null || this.models[0] == 10)) {
				this.int1 = 1;
			}

			for (int var1 = 0; var1 < 5; ++var1) {
				if (this.actions[var1] != null) {
					this.int1 = 1;
				}
			}
		}

		if (this.int3 == -1) {
			this.int3 = this.interactType != 0 ? 1 : 0;
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lwj;B)V",
		garbageValue = "1"
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lwj;IB)V",
		garbageValue = "47"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.readUnsignedByte();
			if (var3 > 0) {
				if (this.modelIds != null && !ObjectDefinition_isLowDetail) {
					var1.field5818 += var3 * 3;
				} else {
					this.models = new int[var3];
					this.modelIds = new int[var3];

					for (var4 = 0; var4 < var3; ++var4) {
						this.modelIds[var4] = var1.readUnsignedShort();
						this.models[var4] = var1.readUnsignedByte();
					}
				}
			}
		} else if (var2 == 2) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 5) {
			var3 = var1.readUnsignedByte();
			if (var3 > 0) {
				if (this.modelIds != null && !ObjectDefinition_isLowDetail) {
					var1.field5818 += 2 * var3;
				} else {
					this.models = null;
					this.modelIds = new int[var3];

					for (var4 = 0; var4 < var3; ++var4) {
						this.modelIds[var4] = var1.readUnsignedShort();
					}
				}
			}
		} else if (var2 == 14) {
			this.sizeX = var1.readUnsignedByte();
		} else if (var2 == 15) {
			this.sizeY = var1.readUnsignedByte();
		} else if (var2 == 17) {
			this.interactType = 0;
			this.boolean1 = false;
		} else if (var2 == 18) {
			this.boolean1 = false;
		} else if (var2 == 19) {
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 21) {
			this.clipType = 0;
		} else if (var2 == 22) {
			this.nonFlatShading = true;
		} else if (var2 == 23) {
			this.modelClipped = true;
		} else if (var2 == 24) {
			this.animationId = var1.readUnsignedShort();
			if (this.animationId == 65535) {
				this.animationId = -1;
			}
		} else if (var2 == 27) {
			this.interactType = 1;
		} else if (var2 == 28) {
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 29) {
			this.ambient = var1.readByte();
		} else if (var2 == 39) {
			this.contrast = var1.readByte() * 25;
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
		} else if (var2 == 61) {
			var1.readUnsignedShort();
		} else if (var2 == 62) {
			this.isRotated = true;
		} else if (var2 == 64) {
			this.clipped = false;
		} else if (var2 == 65) {
			this.modelSizeX = var1.readUnsignedShort();
		} else if (var2 == 66) {
			this.modelHeight = var1.readUnsignedShort();
		} else if (var2 == 67) {
			this.modelSizeY = var1.readUnsignedShort();
		} else if (var2 == 68) {
			this.mapSceneId = var1.readUnsignedShort();
		} else if (var2 == 69) {
			var1.readUnsignedByte();
		} else if (var2 == 70) {
			this.offsetX = var1.readShort();
		} else if (var2 == 71) {
			this.offsetHeight = var1.readShort();
		} else if (var2 == 72) {
			this.offsetY = var1.readShort();
		} else if (var2 == 73) {
			this.boolean2 = true;
		} else if (var2 == 74) {
			this.isSolid = true;
		} else if (var2 == 75) {
			this.int3 = var1.readUnsignedByte();
		} else if (var2 != 77 && var2 != 92) {
			if (var2 == 78) {
				this.ambientSoundId = var1.readUnsignedShort();
				this.int7 = var1.readUnsignedByte();
				this.int8 = var1.readUnsignedByte();
			} else if (var2 == 79) {
				this.int5 = var1.readUnsignedShort();
				this.int6 = var1.readUnsignedShort();
				this.int7 = var1.readUnsignedByte();
				this.int8 = var1.readUnsignedByte();
				var3 = var1.readUnsignedByte();
				this.soundEffectIds = new int[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.soundEffectIds[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 81) {
				var1.readUnsignedByte();
			} else if (var2 == 82) {
				this.mapIconId = var1.readUnsignedShort();
			} else if (var2 == 89) {
				this.boolean3 = false;
			} else if (var2 == 90) {
				this.field2321 = true;
			} else if (var2 == 91) {
				this.field2259 = Tile.method4883(var1.readUnsignedByte());
			} else if (var2 == 93) {
				this.field2315 = Tile.method4883(var1.readUnsignedByte());
				this.field2313 = var1.readUnsignedShort();
				this.field2302 = Tile.method4883(var1.readUnsignedByte());
				this.field2314 = var1.readUnsignedShort();
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
			if (var2 == 92) {
				var3 = var1.readUnsignedShort();
				if (var3 == 65535) {
					var3 = -1;
				}
			}

			var4 = var1.readUnsignedByte();
			this.transforms = new int[var4 + 2];

			for (int var5 = 0; var5 <= var4; ++var5) {
				this.transforms[var5] = var1.readUnsignedShort();
				if (this.transforms[var5] == 65535) {
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3;
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "93"
	)
	public final boolean method4567(int var1) {
		if (this.models != null) {
			for (int var4 = 0; var4 < this.models.length; ++var4) {
				if (this.models[var4] == var1) {
					return ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var4] & 65535, 0);
				}
			}

			return true;
		} else if (this.modelIds == null) {
			return true;
		} else if (var1 != 10) {
			return true;
		} else {
			boolean var2 = true;

			for (int var3 = 0; var3 < this.modelIds.length; ++var3) {
				var2 &= ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var3] & 65535, 0);
			}

			return var2;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-59579967"
	)
	@Export("needsModelFiles")
	public final boolean needsModelFiles() {
		if (this.modelIds == null) {
			return true;
		} else {
			boolean var1 = true;

			for (int var2 = 0; var2 < this.modelIds.length; ++var2) {
				var1 &= ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var2] & 65535, 0);
			}

			return var1;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIII)Liq;",
		garbageValue = "908637578"
	)
	@Export("getEntity")
	public final Renderable getEntity(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var7;
		if (this.models == null) {
			var7 = (long)(var2 + (this.id << 10));
		} else {
			var7 = (long)(var2 + (var1 << 3) + (this.id << 10));
		}

		Object var9 = (Renderable)ObjectDefinition_cachedEntities.get(var7);
		if (var9 == null) {
			ModelData var10 = this.getModelData(var1, var2);
			if (var10 == null) {
				return null;
			}

			if (!this.nonFlatShading) {
				var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
			} else {
				var10.ambient = (short)(this.ambient + 64);
				var10.contrast = (short)(this.contrast + 768);
				var10.calculateVertexNormals();
				var9 = var10;
			}

			ObjectDefinition_cachedEntities.put((DualNode)var9, var7);
		}

		if (this.nonFlatShading) {
			var9 = ((ModelData)var9).copyModelData();
		}

		if (this.clipType >= 0) {
			if (var9 instanceof Model) {
				var9 = ((Model)var9).contourGround(var3, var4, var5, var6, true, this.clipType);
			} else if (var9 instanceof ModelData) {
				var9 = ((ModelData)var9).method4792(var3, var4, var5, var6, true, this.clipType);
			}
		}

		return (Renderable)var9;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIII)Ljx;",
		garbageValue = "1042137495"
	)
	@Export("getModel")
	public final Model getModel(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var7;
		if (this.models == null) {
			var7 = (long)(var2 + (this.id << 10));
		} else {
			var7 = (long)(var2 + (var1 << 3) + (this.id << 10));
		}

		Model var9 = (Model)ObjectDefinition_cachedModels.get(var7);
		if (var9 == null) {
			ModelData var10 = this.getModelData(var1, var2);
			if (var10 == null) {
				return null;
			}

			var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
			ObjectDefinition_cachedModels.put(var9, var7);
		}

		if (this.clipType >= 0) {
			var9 = var9.contourGround(var3, var4, var5, var6, true, this.clipType);
		}

		return var9;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIILiz;II)Ljx;",
		garbageValue = "1487089270"
	)
	@Export("getModelDynamic")
	public final Model getModelDynamic(int var1, int var2, int[][] var3, int var4, int var5, int var6, SequenceDefinition var7, int var8) {
		long var9;
		if (this.models == null) {
			var9 = (long)(var2 + (this.id << 10));
		} else {
			var9 = (long)(var2 + (var1 << 3) + (this.id << 10));
		}

		Model var11 = (Model)ObjectDefinition_cachedModels.get(var9);
		if (var11 == null) {
			ModelData var12 = this.getModelData(var1, var2);
			if (var12 == null) {
				return null;
			}

			var11 = var12.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
			ObjectDefinition_cachedModels.put(var11, var9);
		}

		if (var7 == null && this.clipType == -1) {
			return var11;
		} else {
			if (var7 != null) {
				var11 = var7.transformObjectModel(var11, var8, var2);
			} else {
				var11 = var11.toSharedSequenceModel(true);
			}

			if (this.clipType >= 0) {
				var11 = var11.contourGround(var3, var4, var5, var6, false, this.clipType);
			}

			return var11;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Lik;",
		garbageValue = "1179147773"
	)
	@Export("getModelData")
	final ModelData getModelData(int var1, int var2) {
		ModelData var3 = null;
		boolean var4;
		int var5;
		int var7;
		if (this.models == null) {
			if (var1 != 10) {
				return null;
			}

			if (this.modelIds == null) {
				return null;
			}

			var4 = this.isRotated;
			if (var1 == 2 && var2 > 3) {
				var4 = !var4;
			}

			var5 = this.modelIds.length;

			for (int var6 = 0; var6 < var5; ++var6) {
				var7 = this.modelIds[var6];
				if (var4) {
					var7 += 65536;
				}

				var3 = (ModelData)ObjectDefinition_cachedModelData.get((long)var7);
				if (var3 == null) {
					var3 = ModelData.ModelData_get(ObjectDefinition_modelsArchive, var7 & 65535, 0);
					if (var3 == null) {
						return null;
					}

					if (var4) {
						var3.method4817();
					}

					ObjectDefinition_cachedModelData.put(var3, (long)var7);
				}

				if (var5 > 1) {
					modelDataArray[var6] = var3;
				}
			}

			if (var5 > 1) {
				var3 = new ModelData(modelDataArray, var5);
			}
		} else {
			int var9 = -1;

			for (var5 = 0; var5 < this.models.length; ++var5) {
				if (this.models[var5] == var1) {
					var9 = var5;
					break;
				}
			}

			if (var9 == -1) {
				return null;
			}

			var5 = this.modelIds[var9];
			boolean var10 = this.isRotated ^ var2 > 3;
			if (var10) {
				var5 += 65536;
			}

			var3 = (ModelData)ObjectDefinition_cachedModelData.get((long)var5);
			if (var3 == null) {
				var3 = ModelData.ModelData_get(ObjectDefinition_modelsArchive, var5 & 65535, 0);
				if (var3 == null) {
					return null;
				}

				if (var10) {
					var3.method4817();
				}

				ObjectDefinition_cachedModelData.put(var3, (long)var5);
			}
		}

		if (this.modelSizeX == 128 && this.modelHeight == 128 && this.modelSizeY == 128) {
			var4 = false;
		} else {
			var4 = true;
		}

		boolean var11;
		if (this.offsetX == 0 && this.offsetHeight == 0 && this.offsetY == 0) {
			var11 = false;
		} else {
			var11 = true;
		}

		ModelData var8 = new ModelData(var3, var2 == 0 && !var4 && !var11, this.recolorFrom == null, null == this.retextureFrom, true);
		if (var1 == 4 && var2 > 3) {
			var8.method4867(256);
			var8.changeOffset(45, 0, -45);
		}

		var2 &= 3;
		if (var2 == 1) {
			var8.method4820();
		} else if (var2 == 2) {
			var8.method4797();
		} else if (var2 == 3) {
			var8.method4798();
		}

		if (this.recolorFrom != null) {
			for (var7 = 0; var7 < this.recolorFrom.length; ++var7) {
				var8.recolor(this.recolorFrom[var7], this.recolorTo[var7]);
			}
		}

		if (this.retextureFrom != null) {
			for (var7 = 0; var7 < this.retextureFrom.length; ++var7) {
				var8.retexture(this.retextureFrom[var7], this.retextureTo[var7]);
			}
		}

		if (var4) {
			var8.resize(this.modelSizeX, this.modelHeight, this.modelSizeY);
		}

		if (var11) {
			var8.changeOffset(this.offsetX, this.offsetHeight, this.offsetY);
		}

		return var8;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lia;",
		garbageValue = "-1814816750"
	)
	@Export("transform")
	public final ObjectComposition transform() {
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

		return var2 != -1 ? SpriteMask.getObjectDefinition(var2) : null;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "583948003"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return FileSystem.method5911(this.params, var1, var2);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "76"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return KeyHandler.method391(this.params, var1, var2);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1032299225"
	)
	@Export("hasSound")
	public boolean hasSound() {
		if (this.transforms == null) {
			return this.ambientSoundId != -1 || this.soundEffectIds != null;
		} else {
			for (int var1 = 0; var1 < this.transforms.length; ++var1) {
				if (this.transforms[var1] != -1) {
					ObjectComposition var2 = SpriteMask.getObjectDefinition(this.transforms[var1]);
					if (var2.ambientSoundId != -1 || var2.soundEffectIds != null) {
						return true;
					}
				}
			}

			return false;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lid;",
		garbageValue = "2104526902"
	)
	@Export("ItemDefinition_get")
	public static ItemComposition ItemDefinition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class329.ItemDefinition_archive.takeFile(10, var0);
			var1 = new ItemComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.post();
			if (var1.noteTemplate != -1) {
				var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
			}

			if (var1.notedId != -1) {
				var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) {
				var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
			}

			if (!ItemComposition.ItemDefinition_inMembersWorld && var1.isMembersOnly) {
				if (var1.noteTemplate == -1 && var1.notedId == -1 && var1.placeholderTemplate == -1) {
					var1.name = var1.name + " (Members)";
				}

				var1.examine = "Login to a members' server to use this object.";
				var1.isTradable = false;

				int var3;
				for (var3 = 0; var3 < var1.groundActions.length; ++var3) {
					var1.groundActions[var3] = null;
				}

				for (var3 = 0; var3 < var1.inventoryActions.length; ++var3) {
					if (var3 != 4) {
						if (var1.subOps != null) {
							var1.subOps[var3] = null;
						}

						var1.inventoryActions[var3] = null;
					}
				}

				var1.shiftClickIndex = -2;
				var1.team = 0;
				if (var1.params != null) {
					boolean var6 = false;

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) {
						ParamComposition var5 = Messages.getParamDefinition((int)var4.key);
						if (var5.autoDisable) {
							var4.vmethod10593();
						} else {
							var6 = true;
						}
					}

					if (!var6) {
						var1.params = null;
					}
				}
			}

			ItemComposition.ItemDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lfn;FFFFFFFFI)V",
		garbageValue = "704047544"
	)
	static void method4568(class137 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
		if (var0 != null) {
			float var9 = var4 - var1;
			if (0.0F != var9) {
				float var10 = var2 - var1;
				float var11 = var3 - var1;
				float[] var12 = new float[]{var10 / var9, var11 / var9};
				var0.field1639 = var12[0] == 0.33333334F && var12[1] == 0.6666667F;
				float var13 = var12[0];
				float var14 = var12[1];
				if (var12[0] < 0.0F) {
					var12[0] = 0.0F;
				}

				if (var12[1] > 1.0F) {
					var12[1] = 1.0F;
				}

				if (var12[0] > 1.0F || var12[1] < -1.0F) {
					class344.method7323(var12);
				}

				if (var13 != var12[0]) {
					var2 = var12[0] * var9 + var1;
					if (0.0F != var13) {
						var6 = var5 + var12[0] * (var6 - var5) / var13;
					}
				}

				if (var14 != var12[1]) {
					float var10000 = var1 + var12[1] * var9;
					if (1.0F != var14) {
						var7 = var8 - (1.0F - var12[1]) * (var8 - var7) / (1.0F - var14);
					}
				}

				var0.field1658 = var1;
				var0.field1641 = var4;
				float var15 = var12[0];
				float var16 = var12[1];
				float var17 = var15 - 0.0F;
				float var18 = var16 - var15;
				float var19 = 1.0F - var16;
				float var20 = var18 - var17;
				var0.field1646 = var19 - var18 - var20;
				var0.field1635 = var20 + var20 + var20;
				var0.field1643 = var17 + var17 + var17;
				var0.field1642 = 0.0F;
				HttpRequest.method102(var5, var6, var7, var8, var0);
			}
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ILce;ZI)I",
		garbageValue = "984027718"
	)
	static int method4612(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
			AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
			Client.field563 = (short)FloorOverlayDefinition.method4704(Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize]);
			if (Client.field563 <= 0) {
				Client.field563 = 256;
			}

			Client.field348 = (short)FloorOverlayDefinition.method4704(Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1]);
			if (Client.field348 <= 0) {
				Client.field348 = 256;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
			AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
			if (Client.zoomHeight <= 0) {
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
			if (Client.zoomWidth <= 0) {
				Client.zoomWidth = 320;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
			AbstractWorldMapIcon.Interpreter_intStackSize -= 4;
			Client.field351 = (short)Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
			if (Client.field351 <= 0) {
				Client.field351 = 1;
			}

			Client.field422 = (short)Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
			if (Client.field422 <= 0) {
				Client.field422 = 32767;
			} else if (Client.field422 < Client.field351) {
				Client.field422 = Client.field351;
			}

			Client.field353 = (short)Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 2];
			if (Client.field353 <= 0) {
				Client.field353 = 1;
			}

			Client.field459 = (short)Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 3];
			if (Client.field459 <= 0) {
				Client.field459 = 32767;
			} else if (Client.field459 < Client.field353) {
				Client.field459 = Client.field353;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
			if (Client.viewportWidget != null) {
				class180.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height * -1326764757, false);
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = Client.viewportWidth;
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = Client.viewportHeight;
			} else {
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = -1;
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = Client.zoomHeight;
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = Client.zoomWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = class7.method37(Client.field563);
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = class7.method37(Client.field348);
			return 1;
		} else if (var0 == 6220) {
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = RestClientThreadFactory.canvasWidth;
			return 1;
		} else if (var0 == 6223) {
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = GameEngine.canvasHeight;
			return 1;
		} else {
			return 2;
		}
	}
}
