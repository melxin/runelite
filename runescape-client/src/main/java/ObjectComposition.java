import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
@Implements("ObjectComposition")
public class ObjectComposition extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public static final class337 field2309;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public static final class337 field2345;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public static final class337 field2313;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("ObjectDefinition_cached")
	static EvictingDualNodeHashTable ObjectDefinition_cached;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("ObjectDefinition_cachedModelData")
	public static EvictingDualNodeHashTable ObjectDefinition_cachedModelData;
	@ObfuscatedName("ai")
	@Export("ObjectDefinition_isLowDetail")
	public static boolean ObjectDefinition_isLowDetail;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("ObjectDefinition_archive")
	public static AbstractArchive ObjectDefinition_archive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("ObjectDefinition_cachedEntities")
	static EvictingDualNodeHashTable ObjectDefinition_cachedEntities;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("ObjectDefinition_cachedModels")
	static EvictingDualNodeHashTable ObjectDefinition_cachedModels;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Liu;"
	)
	@Export("modelDataArray")
	static ModelData[] modelDataArray;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1391704929
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ad")
	@Export("modelIds")
	int[] modelIds;
	@ObfuscatedName("ag")
	@Export("models")
	int[] models;
	@ObfuscatedName("av")
	@Export("name")
	public String name;
	@ObfuscatedName("ah")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("ab")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("ax")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("ak")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 193539187
	)
	@Export("sizeX")
	public int sizeX;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1163164861
	)
	@Export("sizeY")
	public int sizeY;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -163576607
	)
	@Export("interactType")
	public int interactType;
	@ObfuscatedName("bs")
	@Export("boolean1")
	public boolean boolean1;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1351164419
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1094036224
	)
	@Export("clipType")
	int clipType;
	@ObfuscatedName("bd")
	@Export("nonFlatShading")
	boolean nonFlatShading;
	@ObfuscatedName("ba")
	@Export("modelClipped")
	public boolean modelClipped;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -2126342771
	)
	@Export("animationId")
	public int animationId;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -725155053
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1604561457
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 648707825
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("bg")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1883934173
	)
	@Export("mapIconId")
	public int mapIconId;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1949227939
	)
	@Export("mapSceneId")
	public int mapSceneId;
	@ObfuscatedName("bz")
	@Export("isRotated")
	boolean isRotated;
	@ObfuscatedName("bn")
	@Export("clipped")
	public boolean clipped;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1531249079
	)
	@Export("modelSizeX")
	int modelSizeX;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 1126377181
	)
	@Export("modelHeight")
	int modelHeight;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -427517267
	)
	@Export("modelSizeY")
	int modelSizeY;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1744251489
	)
	@Export("offsetX")
	int offsetX;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -46370025
	)
	@Export("offsetHeight")
	int offsetHeight;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1331658955
	)
	@Export("offsetY")
	int offsetY;
	@ObfuscatedName("bj")
	@Export("boolean2")
	public boolean boolean2;
	@ObfuscatedName("bm")
	@Export("isSolid")
	boolean isSolid;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 934255011
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("bw")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1163017357
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 1408297125
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -60709049
	)
	@Export("ambientSoundId")
	public int ambientSoundId;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -2032947591
	)
	@Export("int7")
	public int int7;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -2027149893
	)
	@Export("int8")
	public int int8;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public class337 field2361;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 1030784475
	)
	public int field2362;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -484876243
	)
	public int field2363;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public class337 field2364;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public class337 field2326;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -540001587
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 1634880795
	)
	@Export("int6")
	public int int6;
	@ObfuscatedName("cb")
	@Export("soundEffectIds")
	public int[] soundEffectIds;
	@ObfuscatedName("cu")
	@Export("boolean3")
	public boolean boolean3;
	@ObfuscatedName("cq")
	public boolean field2323;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		field2309 = class337.field3853;
		field2345 = class337.field3853;
		field2313 = class337.field3853;
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
		this.clipType = -256;
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
		this.field2361 = field2309;
		this.field2362 = 300;
		this.field2363 = 300;
		this.field2364 = field2345;
		this.field2326 = field2313;
		this.int5 = 0;
		this.int6 = 0;
		this.boolean3 = true;
		this.field2323 = false;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2082650662"
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lwb;B)V",
		garbageValue = "18"
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwb;IB)V",
		garbageValue = "61"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var4;
		int var7;
		if (var2 == 1) {
			var7 = var1.readUnsignedByte();
			if (var7 > 0) {
				if (this.modelIds != null && !ObjectDefinition_isLowDetail) {
					var1.array += -871231137 * var7;
				} else {
					this.models = new int[var7];
					this.modelIds = new int[var7];

					for (var4 = 0; var4 < var7; ++var4) {
						this.modelIds[var4] = var1.readUnsignedShort();
						this.models[var4] = var1.readUnsignedByte();
					}
				}
			}
		} else if (var2 == 2) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 5) {
			var7 = var1.readUnsignedByte();
			if (var7 > 0) {
				if (this.modelIds != null && !ObjectDefinition_isLowDetail) {
					var1.array += -580820758 * var7;
				} else {
					this.models = null;
					this.modelIds = new int[var7];

					for (var4 = 0; var4 < var7; ++var4) {
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
			var7 = var1.readUnsignedByte();
			this.recolorFrom = new short[var7];
			this.recolorTo = new short[var7];

			for (var4 = 0; var4 < var7; ++var4) {
				this.recolorFrom[var4] = (short)var1.readUnsignedShort();
				this.recolorTo[var4] = (short)var1.readUnsignedShort();
			}
		} else if (var2 == 41) {
			var7 = var1.readUnsignedByte();
			this.retextureFrom = new short[var7];
			this.retextureTo = new short[var7];

			for (var4 = 0; var4 < var7; ++var4) {
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
				var7 = var1.readUnsignedByte();
				this.soundEffectIds = new int[var7];

				for (var4 = 0; var4 < var7; ++var4) {
					this.soundEffectIds[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 81) {
				this.clipType = var1.readUnsignedByte() * 65536;
			} else if (var2 == 82) {
				this.mapIconId = var1.readUnsignedShort();
			} else if (var2 == 89) {
				this.boolean3 = false;
			} else if (var2 == 90) {
				this.field2323 = true;
			} else {
				class337 var3;
				if (var2 == 91) {
					var4 = var1.readUnsignedByte();
					var3 = class337.field3860[var4];
					this.field2361 = var3;
				} else if (var2 == 93) {
					var4 = var1.readUnsignedByte();
					var3 = class337.field3860[var4];
					this.field2364 = var3;
					this.field2362 = var1.readUnsignedShort();
					int var6 = var1.readUnsignedByte();
					class337 var5 = class337.field3860[var6];
					this.field2326 = var5;
					this.field2363 = var1.readUnsignedShort();
				} else if (var2 == 249) {
					this.params = class144.readStringIntParameters(var1, this.params);
				}
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

			var7 = -1;
			if (var2 == 92) {
				var7 = var1.readUnsignedShort();
				if (var7 == 65535) {
					var7 = -1;
				}
			}

			var4 = var1.readUnsignedByte();
			this.transforms = new int[var4 + 2];

			for (int var8 = 0; var8 <= var4; ++var8) {
				this.transforms[var8] = var1.readUnsignedShort();
				if (this.transforms[var8] == 65535) {
					this.transforms[var8] = -1;
				}
			}

			this.transforms[var4 + 1] = var7;
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "101322380"
	)
	public final boolean method4630(int var1) {
		if (this.models != null) {
			for (int var4 = 0; var4 < this.models.length; ++var4) {
				if (this.models[var4] == var1) {
					return WorldMapCacheName.ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var4] & 65535, 0);
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
				var2 &= WorldMapCacheName.ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var3] & 65535, 0);
			}

			return var2;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "115"
	)
	@Export("needsModelFiles")
	public final boolean needsModelFiles() {
		if (this.modelIds == null) {
			return true;
		} else {
			boolean var1 = true;

			for (int var2 = 0; var2 < this.modelIds.length; ++var2) {
				var1 &= WorldMapCacheName.ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var2] & 65535, 0);
			}

			return var1;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIII)Liz;",
		garbageValue = "1181509074"
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

		if (this.clipType * 256 >= 0) {
			if (var9 instanceof Model) {
				var9 = ((Model)var9).contourGround(var3, var4, var5, var6, true, this.clipType * 256);
			} else if (var9 instanceof ModelData) {
				var9 = ((ModelData)var9).method4847(var3, var4, var5, var6, true, this.clipType * 256);
			}
		}

		return (Renderable)var9;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIIB)Ljn;",
		garbageValue = "-79"
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

		if (this.clipType * 256 >= 0) {
			var9 = var9.contourGround(var3, var4, var5, var6, true, this.clipType * 256);
		}

		return var9;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIILij;IB)Ljn;",
		garbageValue = "-39"
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

		if (var7 == null && this.clipType * 256 == -1) {
			return var11;
		} else {
			if (var7 != null) {
				var11 = var7.transformObjectModel(var11, var8, var2);
			} else {
				var11 = var11.toSharedSequenceModel(true);
			}

			if (this.clipType * 256 >= 0) {
				var11 = var11.contourGround(var3, var4, var5, var6, false, this.clipType * 256);
			}

			return var11;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)Liu;",
		garbageValue = "2100021776"
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
					var3 = ModelData.ModelData_get(WorldMapCacheName.ObjectDefinition_modelsArchive, var7 & 65535, 0);
					if (var3 == null) {
						return null;
					}

					if (var4) {
						var3.method4853();
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
				var3 = ModelData.ModelData_get(WorldMapCacheName.ObjectDefinition_modelsArchive, var5 & 65535, 0);
				if (var3 == null) {
					return null;
				}

				if (var10) {
					var3.method4853();
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

		ModelData var8 = new ModelData(var3, var2 == 0 && !var4 && !var11, this.recolorFrom == null, this.retextureFrom == null, true);
		if (var1 == 4 && var2 > 3) {
			var8.method4835(256);
			var8.changeOffset(45, 0, -45);
		}

		var2 &= 3;
		if (var2 == 1) {
			var8.method4843();
		} else if (var2 == 2) {
			var8.method4862();
		} else if (var2 == 3) {
			var8.method4901();
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lib;",
		garbageValue = "1018141127"
	)
	@Export("transform")
	public final ObjectComposition transform() {
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

		return var2 != -1 ? ModeWhere.getObjectDefinition(var2) : null;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1276698333"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return class537.method10547(this.params, var1, var2);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1797372933"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class405.method8274(this.params, var1, var2);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-37"
	)
	@Export("hasSound")
	public boolean hasSound() {
		if (this.transforms == null) {
			return this.ambientSoundId != -1 || this.soundEffectIds != null;
		} else {
			for (int var1 = 0; var1 < this.transforms.length; ++var1) {
				if (this.transforms[var1] != -1) {
					ObjectComposition var2 = ModeWhere.getObjectDefinition(this.transforms[var1]);
					if (var2.ambientSoundId != -1 || var2.soundEffectIds != null) {
						return true;
					}
				}
			}

			return false;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpx;B)V",
		garbageValue = "-69"
	)
	public static void method4632(AbstractArchive var0) {
		class489.field5355 = var0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lfh;",
		garbageValue = "-30466089"
	)
	static class146 method4634(int var0) {
		class146 var2 = SecureUrlRequester.method3516(var0);
		int var1;
		if (var2 == null) {
			var1 = 2;
		} else {
			var1 = var2.method3754() ? 0 : 1;
		}

		return var1 != 0 ? null : SecureUrlRequester.method3516(var0);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)Lbz;",
		garbageValue = "0"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0);
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(IZZZZB)Lpw;",
		garbageValue = "-51"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		ArchiveDisk var5 = null;
		if (JagexCache.JagexCache_dat2File != null) {
			var5 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var5, Actor.masterDisk, WorldMapSectionType.field3418, var0, var1, var2, var3, var4, false);
	}
}
