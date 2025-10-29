import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
@Implements("ObjectComposition")
public class ObjectComposition extends DualNode {
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	public static final class343 field2344;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	public static final class343 field2345;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	public static final class343 field2346;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("ObjectDefinition_cached")
	static EvictingDualNodeHashTable ObjectDefinition_cached;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("ObjectDefinition_cachedModelData")
	public static EvictingDualNodeHashTable ObjectDefinition_cachedModelData;
	@ObfuscatedName("ce")
	@Export("ObjectDefinition_isLowDetail")
	public static boolean ObjectDefinition_isLowDetail;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("ObjectDefinition_cachedEntities")
	static EvictingDualNodeHashTable ObjectDefinition_cachedEntities;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("ObjectDefinition_cachedModels")
	static EvictingDualNodeHashTable ObjectDefinition_cachedModels;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "[Ljm;"
	)
	@Export("modelDataArray")
	static ModelData[] modelDataArray;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -965498101
	)
	@Export("id")
	public int id;
	@ObfuscatedName("cs")
	@Export("modelIds")
	int[] modelIds;
	@ObfuscatedName("cn")
	@Export("models")
	int[] models;
	@ObfuscatedName("co")
	@Export("name")
	public String name;
	@ObfuscatedName("cx")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("cg")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("cp")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("cd")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1813358617
	)
	@Export("sizeX")
	public int sizeX;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -352504863
	)
	@Export("sizeY")
	public int sizeY;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 756705879
	)
	@Export("interactType")
	public int interactType;
	@ObfuscatedName("cy")
	@Export("boolean1")
	public boolean boolean1;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -1900812067
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 135730185
	)
	@Export("clipType")
	int clipType;
	@ObfuscatedName("cw")
	@Export("nonFlatShading")
	boolean nonFlatShading;
	@ObfuscatedName("cr")
	@Export("modelClipped")
	public boolean modelClipped;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 930784507
	)
	@Export("animationId")
	public int animationId;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 854845213
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 69436381
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -706784357
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("dw")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = -2059094647
	)
	@Export("mapIconId")
	public int mapIconId;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 93759001
	)
	@Export("mapSceneId")
	public int mapSceneId;
	@ObfuscatedName("dy")
	@Export("isRotated")
	boolean isRotated;
	@ObfuscatedName("dc")
	@Export("clipped")
	public boolean clipped;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -274284999
	)
	@Export("modelSizeX")
	int modelSizeX;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 848811507
	)
	@Export("modelHeight")
	int modelHeight;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -914257931
	)
	@Export("modelSizeY")
	int modelSizeY;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = -671892153
	)
	@Export("offsetX")
	int offsetX;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -1044268523
	)
	@Export("offsetHeight")
	int offsetHeight;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = 1580309641
	)
	@Export("offsetY")
	int offsetY;
	@ObfuscatedName("da")
	@Export("boolean2")
	public boolean boolean2;
	@ObfuscatedName("dl")
	@Export("isSolid")
	boolean isSolid;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = 1768476057
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("dx")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -753060269
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = 1406043891
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -1194817153
	)
	@Export("ambientSoundId")
	public int ambientSoundId;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = -22639547
	)
	@Export("int7")
	public int int7;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = -1714304273
	)
	@Export("int8")
	public int int8;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	public class343 field2394;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = 1177696105
	)
	public int field2395;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 1851369985
	)
	public int field2396;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	public class343 field2365;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	public class343 field2342;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	public class402 field2334;
	@ObfuscatedName("ea")
	@ObfuscatedGetter(
		intValue = 260597535
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("ee")
	@ObfuscatedGetter(
		intValue = 1031328871
	)
	@Export("int6")
	public int int6;
	@ObfuscatedName("eq")
	@Export("soundEffectIds")
	public int[] soundEffectIds;
	@ObfuscatedName("es")
	@Export("boolean3")
	public boolean boolean3;
	@ObfuscatedName("er")
	public boolean field2397;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		field2344 = class343.field3891;
		field2345 = class343.field3891;
		field2346 = class343.field3891;
		ObjectDefinition_cached = new EvictingDualNodeHashTable(4096);
		ObjectDefinition_cachedModelData = new EvictingDualNodeHashTable(500);
		ObjectDefinition_isLowDetail = false;
		ObjectDefinition_cachedEntities = new EvictingDualNodeHashTable(256);
		ObjectDefinition_cachedModels = new EvictingDualNodeHashTable(256);
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
		this.field2394 = field2344;
		this.field2395 = 300;
		this.field2396 = 300;
		this.field2365 = field2345;
		this.field2342 = field2346;
		this.field2334 = class402.field4861;
		this.int5 = 0;
		this.int6 = 0;
		this.boolean3 = true;
		this.field2397 = false;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "634828876"
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxa;B)V",
		garbageValue = "118"
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
		descriptor = "(Lxa;II)V",
		garbageValue = "-1481714301"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var4;
		int var6;
		if (var2 == 1) {
			var6 = var1.readUnsignedByte();
			if (var6 > 0) {
				if (this.modelIds != null && !ObjectDefinition_isLowDetail) {
					var1.offset += 930339743 * var6;
				} else {
					this.models = new int[var6];
					this.modelIds = new int[var6];

					for (var4 = 0; var4 < var6; ++var4) {
						this.modelIds[var4] = var1.readUnsignedShort();
						this.models[var4] = var1.readUnsignedByte();
					}
				}
			}
		} else if (var2 == 2) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 5) {
			var6 = var1.readUnsignedByte();
			if (var6 > 0) {
				if (this.modelIds != null && !ObjectDefinition_isLowDetail) {
					var1.offset += -811429270 * var6;
				} else {
					this.models = null;
					this.modelIds = new int[var6];

					for (var4 = 0; var4 < var6; ++var4) {
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
			var6 = var1.readUnsignedByte();
			this.recolorFrom = new short[var6];
			this.recolorTo = new short[var6];

			for (var4 = 0; var4 < var6; ++var4) {
				this.recolorFrom[var4] = (short)var1.readUnsignedShort();
				this.recolorTo[var4] = (short)var1.readUnsignedShort();
			}
		} else if (var2 == 41) {
			var6 = var1.readUnsignedByte();
			this.retextureFrom = new short[var6];
			this.retextureTo = new short[var6];

			for (var4 = 0; var4 < var6; ++var4) {
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
				var6 = var1.readUnsignedByte();
				this.soundEffectIds = new int[var6];

				for (var4 = 0; var4 < var6; ++var4) {
					this.soundEffectIds[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 81) {
				this.clipType = var1.readUnsignedByte() * 256;
			} else if (var2 == 82) {
				this.mapIconId = var1.readUnsignedShort();
			} else if (var2 == 89) {
				this.boolean3 = false;
			} else if (var2 == 90) {
				this.field2397 = true;
			} else if (var2 == 91) {
				this.field2394 = class358.method7617(var1.readUnsignedByte());
			} else if (var2 == 93) {
				this.field2365 = class358.method7617(var1.readUnsignedByte());
				this.field2395 = var1.readUnsignedShort();
				this.field2342 = class358.method7617(var1.readUnsignedByte());
				this.field2396 = var1.readUnsignedShort();
			} else if (var2 == 249) {
				this.params = class406.readStringIntParameters(var1, this.params);
			} else if (var2 != 94 && var2 == 95) {
				class402[] var3 = new class402[]{class402.field4863, class402.field4861, class402.field4868};
				this.field2334 = (class402)GrandExchangeOffer.findEnumerated(var3, var1.readUnsignedByte());
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

			var6 = -1;
			if (var2 == 92) {
				var6 = var1.readUnsignedShort();
				if (var6 == 65535) {
					var6 = -1;
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

			this.transforms[var4 + 1] = var6;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "29"
	)
	public final boolean method4821(int var1) {
		if (this.models != null) {
			for (int var4 = 0; var4 < this.models.length; ++var4) {
				if (this.models[var4] == var1) {
					return SecureRandomCallable.ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var4] & 65535, 0);
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
				var2 &= SecureRandomCallable.ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var3] & 65535, 0);
			}

			return var2;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1882603197"
	)
	@Export("needsModelFiles")
	public final boolean needsModelFiles() {
		if (this.modelIds == null) {
			return true;
		} else {
			boolean var1 = true;

			for (int var2 = 0; var2 < this.modelIds.length; ++var2) {
				var1 &= SecureRandomCallable.ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var2] & 65535, 0);
			}

			return var1;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIII)Ljz;",
		garbageValue = "-2065491027"
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

		if (this.clipType * 65536 >= 0) {
			if (var9 instanceof Model) {
				var9 = ((Model)var9).contourGround(var3, var4, var5, var6, true, this.clipType * 65536);
			} else if (var9 instanceof ModelData) {
				var9 = ((ModelData)var9).method5320(var3, var4, var5, var6, true, this.clipType * 65536);
			}
		}

		return (Renderable)var9;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIII)Lky;",
		garbageValue = "-1389358267"
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

		if (this.clipType * 65536 >= 0) {
			var9 = var9.contourGround(var3, var4, var5, var6, true, this.clipType * 65536);
		}

		return var9;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIILiw;IB)Lky;",
		garbageValue = "8"
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

		if (var7 == null && this.clipType * 65536 == -1) {
			return var11;
		} else {
			if (var7 != null) {
				var11 = var7.transformObjectModel(var11, var8, var2);
			} else {
				var11 = var11.toSharedSequenceModel(true);
			}

			if (this.clipType * 65536 >= 0 && var3 != null) {
				var11 = var11.contourGround(var3, var4, var5, var6, false, this.clipType * 65536);
			}

			return var11;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIB)Ljm;",
		garbageValue = "0"
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
					var3 = ModelData.ModelData_get(SecureRandomCallable.ObjectDefinition_modelsArchive, var7 & 65535, 0);
					if (var3 == null) {
						return null;
					}

					if (var4) {
						var3.method5280();
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
				var3 = ModelData.ModelData_get(SecureRandomCallable.ObjectDefinition_modelsArchive, var5 & 65535, 0);
				if (var3 == null) {
					return null;
				}

				if (var10) {
					var3.method5280();
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

		ModelData var8 = new ModelData(var3, var2 == 0 && !var4 && !var11, null == this.recolorFrom, null == this.retextureFrom, true);
		if (var1 == 4 && var2 > 3) {
			var8.method5276(256);
			var8.changeOffset(45, 0, -45);
		}

		var2 &= 3;
		if (var2 == 1) {
			var8.method5273();
		} else if (var2 == 2) {
			var8.method5274();
		} else if (var2 == 3) {
			var8.method5275();
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Liv;",
		garbageValue = "2068375148"
	)
	@Export("transform")
	public final ObjectComposition transform() {
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

		return var2 != -1 ? AsyncHttpResponse.getObjectDefinition(var2) : null;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1043429539"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return class108.method3518(this.params, var1, var2);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1936338420"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return Projectile.method2008(this.params, var1, var2);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "503720603"
	)
	@Export("hasSound")
	public boolean hasSound() {
		if (this.transforms == null) {
			return this.ambientSoundId != -1 || this.soundEffectIds != null;
		} else {
			for (int var1 = 0; var1 < this.transforms.length; ++var1) {
				if (this.transforms[var1] != -1) {
					ObjectComposition var2 = AsyncHttpResponse.getObjectDefinition(this.transforms[var1]);
					if (var2.ambientSoundId != -1 || var2.soundEffectIds != null) {
						return true;
					}
				}
			}

			return false;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "240"
	)
	public static void method4796() {
		FileSystem.FileSystem_cacheFiles.clear();
	}
}
