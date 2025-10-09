import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("ItemDefinition_archive")
	public static AbstractArchive ItemDefinition_archive;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("ItemDefinition_cached")
	static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("ItemDefinition_cachedModels")
	static EvictingDualNodeHashTable ItemDefinition_cachedModels;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("ItemDefinition_cachedSprites")
	static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lri;"
	)
	@Export("ItemDefinition_fontPlain11")
	public static Font ItemDefinition_fontPlain11;
	@ObfuscatedName("pv")
	@ObfuscatedSignature(
		descriptor = "Lxl;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -125943813
	)
	@Export("id")
	int id;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -967827169
	)
	@Export("model")
	int model;
	@ObfuscatedName("aw")
	@Export("name")
	public String name;
	@ObfuscatedName("ai")
	@Export("examine")
	public String examine;
	@ObfuscatedName("am")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("al")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("ay")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("be")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1557870983
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -1143159319
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -607186159
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1124855009
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -1210490705
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 541934343
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1116883217
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -365313061
	)
	@Export("price")
	public int price;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1880382793
	)
	@Export("maleModel")
	public int maleModel;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -2102249853
	)
	@Export("maleModel1")
	public int maleModel1;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1173982593
	)
	@Export("maleModel2")
	public int maleModel2;
	@ObfuscatedName("bx")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("bp")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("bz")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("bh")
	@Export("subOps")
	public String[][] subOps;
	@ObfuscatedName("bc")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("bv")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1515723247
	)
	@Export("note")
	public int note;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 2140200349
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 342549087
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1045666949
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 598381639
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 861010343
	)
	@Export("ambient")
	public int ambient;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1855889839
	)
	@Export("contrast")
	public int contrast;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 846977509
	)
	@Export("team")
	public int team;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -875102005
	)
	public int field2420;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("cj")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -1649345957
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 317843001
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -812785175
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -1824964929
	)
	@Export("placeholderTemplate")
	public int placeholderTemplate;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -1509138581
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 1886935683
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -934093757
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 351760113
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -1643647251
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 472932447
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -380641427
	)
	int field2442;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 1734417753
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 2033806709
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -1769993575
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 513322051
	)
	int field2384;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 981170267
	)
	int field2438;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -1843517039
	)
	int field2439;

	static {
		ItemDefinition_cached = new EvictingDualNodeHashTable(64);
		ItemDefinition_cachedModels = new EvictingDualNodeHashTable(50);
		ItemDefinition_cachedSprites = new EvictingDualNodeHashTable(200);
	}

	ItemComposition() {
		this.name = "null";
		this.examine = "null";
		this.zoom2d = 2000;
		this.xan2d = 0;
		this.yan2d = 0;
		this.zan2d = 0;
		this.offsetX2d = 0;
		this.offsetY2d = 0;
		this.isStackable = 0;
		this.price = 1;
		this.maleModel = -1;
		this.maleModel1 = -1;
		this.maleModel2 = -1;
		this.isMembersOnly = false;
		this.groundActions = new String[]{null, null, "Take", null, null};
		this.inventoryActions = new String[]{null, null, null, null, "Drop"};
		this.subOps = null;
		this.note = -1;
		this.noteTemplate = -1;
		this.resizeX = 128;
		this.resizeY = 128;
		this.resizeZ = 128;
		this.ambient = 0;
		this.contrast = 0;
		this.team = 0;
		this.field2420 = 0;
		this.isTradable = false;
		this.unnotedId = -1;
		this.notedId = -1;
		this.placeholder = -1;
		this.placeholderTemplate = -1;
		this.shiftClickIndex = -2;
		this.femaleModel = -1;
		this.femaleModel1 = -1;
		this.femaleOffset = 0;
		this.maleHeadModel = -1;
		this.maleHeadModel2 = -1;
		this.field2442 = 0;
		this.femaleModel2 = -1;
		this.femaleHeadModel = -1;
		this.femaleHeadModel2 = -1;
		this.field2384 = -1;
		this.field2438 = -1;
		this.field2439 = -1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1297454930"
	)
	@Export("post")
	void post() {
		if (this.isStackable == 1) {
			this.field2420 = 0;
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwj;B)V",
		garbageValue = "-82"
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
		descriptor = "(Lwj;II)V",
		garbageValue = "2087732414"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.model = var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 3) {
			this.examine = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.zoom2d = var1.readUnsignedShort();
		} else if (var2 == 5) {
			this.xan2d = var1.readUnsignedShort();
		} else if (var2 == 6) {
			this.yan2d = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.offsetX2d = var1.readUnsignedShort();
			if (this.offsetX2d > 32767) {
				this.offsetX2d -= 65536;
			}
		} else if (var2 == 8) {
			this.offsetY2d = var1.readUnsignedShort();
			if (this.offsetY2d > 32767) {
				this.offsetY2d -= 65536;
			}
		} else if (var2 == 9) {
			var1.readStringCp1252NullTerminated();
		} else if (var2 == 11) {
			this.isStackable = 1;
		} else if (var2 == 12) {
			this.price = var1.method11575();
		} else if (var2 == 13) {
			this.maleModel = var1.readUnsignedByte();
		} else if (var2 == 14) {
			this.maleModel1 = var1.readUnsignedByte();
		} else if (var2 == 16) {
			this.isMembersOnly = true;
		} else if (var2 == 23) {
			this.femaleModel = var1.readUnsignedShort();
			this.femaleOffset = var1.readUnsignedByte();
		} else if (var2 == 24) {
			this.femaleModel1 = var1.readUnsignedShort();
		} else if (var2 == 25) {
			this.maleHeadModel = var1.readUnsignedShort();
			this.field2442 = var1.readUnsignedByte();
		} else if (var2 == 26) {
			this.maleHeadModel2 = var1.readUnsignedShort();
		} else if (var2 == 27) {
			this.maleModel2 = var1.readUnsignedByte();
		} else if (var2 >= 30 && var2 < 35) {
			this.groundActions[var2 - 30] = var1.readStringCp1252NullTerminated();
			if (this.groundActions[var2 - 30].equalsIgnoreCase("Hidden")) {
				this.groundActions[var2 - 30] = null;
			}
		} else if (var2 >= 35 && var2 < 40) {
			this.inventoryActions[var2 - 35] = var1.readStringCp1252NullTerminated();
		} else {
			int var3;
			int var4;
			if (var2 == 40) {
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
			} else if (var2 == 42) {
				this.shiftClickIndex = var1.readByte();
			} else if (var2 == 43) {
				var3 = var1.readUnsignedByte();
				if (this.subOps == null) {
					this.subOps = new String[5][];
				}

				boolean var7 = var3 >= 0 && var3 < 5;
				if (var7 && this.subOps[var3] == null) {
					this.subOps[var3] = new String[20];
				}

				while (true) {
					int var5 = var1.readUnsignedByte() - 1;
					if (var5 == -1) {
						break;
					}

					String var6 = var1.readStringCp1252NullTerminated();
					if (var7 && var5 >= 0 && var5 < 20) {
						this.subOps[var3][var5] = var6;
					}
				}
			} else if (var2 == 65) {
				this.isTradable = true;
			} else if (var2 == 75) {
				this.field2420 = var1.readShort();
			} else if (var2 == 78) {
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) {
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 90) {
				this.femaleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 91) {
				this.field2438 = var1.readUnsignedShort();
			} else if (var2 == 92) {
				this.field2384 = var1.readUnsignedShort();
			} else if (var2 == 93) {
				this.field2439 = var1.readUnsignedShort();
			} else if (var2 == 94) {
				var1.readUnsignedShort();
			} else if (var2 == 95) {
				this.zan2d = var1.readUnsignedShort();
			} else if (var2 == 97) {
				this.note = var1.readUnsignedShort();
			} else if (var2 == 98) {
				this.noteTemplate = var1.readUnsignedShort();
			} else if (var2 >= 100 && var2 < 110) {
				if (this.countobj == null) {
					this.countobj = new int[10];
					this.countco = new int[10];
				}

				this.countobj[var2 - 100] = var1.readUnsignedShort();
				this.countco[var2 - 100] = var1.readUnsignedShort();
			} else if (var2 == 110) {
				this.resizeX = var1.readUnsignedShort();
			} else if (var2 == 111) {
				this.resizeY = var1.readUnsignedShort();
			} else if (var2 == 112) {
				this.resizeZ = var1.readUnsignedShort();
			} else if (var2 == 113) {
				this.ambient = var1.readByte();
			} else if (var2 == 114) {
				this.contrast = var1.readByte();
			} else if (var2 == 115) {
				this.team = var1.readUnsignedByte();
			} else if (var2 == 139) {
				this.unnotedId = var1.readUnsignedShort();
			} else if (var2 == 140) {
				this.notedId = var1.readUnsignedShort();
			} else if (var2 == 148) {
				this.placeholder = var1.readUnsignedShort();
			} else if (var2 == 149) {
				this.placeholderTemplate = var1.readUnsignedShort();
			} else if (var2 == 249) {
				this.params = Canvas.readStringIntParameters(var1, this.params);
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lig;Lig;B)V",
		garbageValue = "46"
	)
	@Export("genCert")
	void genCert(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model;
		this.zoom2d = var1.zoom2d;
		this.xan2d = var1.xan2d;
		this.yan2d = var1.yan2d;
		this.zan2d = var1.zan2d;
		this.offsetX2d = var1.offsetX2d;
		this.offsetY2d = var1.offsetY2d;
		this.recolorFrom = var1.recolorFrom;
		this.recolorTo = var1.recolorTo;
		this.retextureFrom = var1.retextureFrom;
		this.retextureTo = var1.retextureTo;
		this.name = var2.name;
		this.examine = "Swap this note at any bank for the equivalent item";
		this.isMembersOnly = var2.isMembersOnly;
		this.price = var2.price;
		this.isStackable = 1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lig;Lig;I)V",
		garbageValue = "878554709"
	)
	@Export("genBought")
	void genBought(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model;
		this.zoom2d = var1.zoom2d;
		this.xan2d = var1.xan2d;
		this.yan2d = var1.yan2d;
		this.zan2d = var1.zan2d;
		this.offsetX2d = var1.offsetX2d;
		this.offsetY2d = var1.offsetY2d;
		this.recolorFrom = var2.recolorFrom;
		this.recolorTo = var2.recolorTo;
		this.retextureFrom = var2.retextureFrom;
		this.retextureTo = var2.retextureTo;
		this.name = var2.name;
		this.examine = var2.examine;
		this.isMembersOnly = var2.isMembersOnly;
		this.isStackable = var2.isStackable;
		this.maleModel = var2.maleModel;
		this.maleModel1 = var2.maleModel1;
		this.maleModel2 = var2.maleModel2;
		this.femaleModel = var2.femaleModel;
		this.femaleModel1 = var2.femaleModel1;
		this.femaleModel2 = var2.femaleModel2;
		this.maleHeadModel = var2.maleHeadModel;
		this.maleHeadModel2 = var2.maleHeadModel2;
		this.femaleHeadModel = var2.femaleHeadModel;
		this.femaleHeadModel2 = var2.femaleHeadModel2;
		this.field2384 = var2.field2384;
		this.field2438 = var2.field2438;
		this.field2439 = var2.field2439;
		this.team = var2.team;
		this.groundActions = var2.groundActions;
		this.field2420 = var2.field2420;
		this.inventoryActions = new String[5];
		if (var2.inventoryActions != null) {
			for (int var3 = 0; var3 < 4; ++var3) {
				this.inventoryActions[var3] = var2.inventoryActions[var3];
			}
		}

		this.inventoryActions[4] = "Discard";
		if (var2.subOps != null) {
			this.subOps = new String[5][];
			System.arraycopy(var2.subOps, 0, this.subOps, 0, 4);
		} else {
			this.subOps = null;
		}

		this.price = 0;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lig;Lig;I)V",
		garbageValue = "771614756"
	)
	@Export("genPlaceholder")
	void genPlaceholder(ItemComposition var1, ItemComposition var2) {
		this.model = var1.model;
		this.zoom2d = var1.zoom2d;
		this.xan2d = var1.xan2d;
		this.yan2d = var1.yan2d;
		this.zan2d = var1.zan2d;
		this.offsetX2d = var1.offsetX2d;
		this.offsetY2d = var1.offsetY2d;
		this.recolorFrom = var1.recolorFrom;
		this.recolorTo = var1.recolorTo;
		this.retextureFrom = var1.retextureFrom;
		this.retextureTo = var1.retextureTo;
		this.isStackable = var1.isStackable;
		this.name = var2.name;
		this.examine = var2.examine;
		this.price = 0;
		this.isMembersOnly = false;
		this.isTradable = false;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Lib;",
		garbageValue = "-255914698"
	)
	@Export("getModelData")
	public final ModelData getModelData(int var1) {
		if (this.countobj != null && var1 > 1) {
			int var2 = -1;

			for (int var3 = 0; var3 < 10; ++var3) {
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) {
				return WorldMapIcon_1.ItemDefinition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(SpriteBufferProperties.ItemDefinition_modelArchive, this.model, 0);
		if (var4 == null) {
			return null;
		} else {
			if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
				var4.resize(this.resizeX, this.resizeY, this.resizeZ);
			}

			this.method4780(var4, (PlayerCompositionColorTextureOverride)null);
			return var4;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Ljd;",
		garbageValue = "1591656362"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		if (this.countobj != null && var1 > 1) {
			int var2 = -1;

			for (int var3 = 0; var3 < 10; ++var3) {
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) {
				return WorldMapIcon_1.ItemDefinition_get(var2).getModel(1);
			}
		}

		Model var4 = (Model)ItemDefinition_cachedModels.get((long)this.id);
		if (var4 != null) {
			return var4;
		} else {
			ModelData var5 = ModelData.ModelData_get(SpriteBufferProperties.ItemDefinition_modelArchive, this.model, 0);
			if (var5 == null) {
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
					var5.resize(this.resizeX, this.resizeY, this.resizeZ);
				}

				this.method4780(var5, (PlayerCompositionColorTextureOverride)null);
				var4 = var5.toModel(this.ambient + 64, this.contrast * 5 + 768, -50, -10, -50);
				var4.isSingleTile = true;
				ItemDefinition_cachedModels.put(var4, (long)this.id);
				return var4;
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lgv;I)Ljd;",
		garbageValue = "1477236120"
	)
	public final Model method4731(PlayerCompositionColorTextureOverride var1) {
		Model var2 = var1.field1942;
		if (var2 != null) {
			return var2;
		} else {
			ModelData var3 = ModelData.ModelData_get(SpriteBufferProperties.ItemDefinition_modelArchive, var1.field1950, 0);
			if (var3 == null) {
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
					var3.resize(this.resizeX, this.resizeY, this.resizeZ);
				}

				this.method4780(var3, var1);
				var2 = var3.toModel(this.ambient + 64, this.contrast * 5 + 768, -50, -10, -50);
				var2.isSingleTile = true;
				var1.field1942 = var2;
				return var2;
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)Lig;",
		garbageValue = "-68"
	)
	@Export("getCountObj")
	public ItemComposition getCountObj(int var1) {
		if (this.countobj != null && var1 > 1) {
			int var2 = -1;

			for (int var3 = 0; var3 < 10; ++var3) {
				if (var1 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3];
				}
			}

			if (var2 != -1) {
				return WorldMapIcon_1.ItemDefinition_get(var2);
			}
		}

		return this;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILgv;I)Z",
		garbageValue = "-202610883"
	)
	public final boolean method4733(int var1, PlayerCompositionColorTextureOverride var2) {
		int var3 = this.femaleModel;
		int var4 = this.femaleModel1;
		int var5 = this.femaleModel2;
		if (var1 == 1) {
			var3 = this.maleHeadModel;
			var4 = this.maleHeadModel2;
			var5 = this.femaleHeadModel;
		}

		if (var2 != null && var2.method4176(var1)) {
			var3 = var2.method4177(var1);
		}

		if (var3 == -1) {
			return true;
		} else {
			boolean var6 = true;
			if (!SpriteBufferProperties.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var6 = false;
			}

			if (var4 != -1 && !SpriteBufferProperties.ItemDefinition_modelArchive.tryLoadFile(var4, 0)) {
				var6 = false;
			}

			if (var5 != -1 && !SpriteBufferProperties.ItemDefinition_modelArchive.tryLoadFile(var5, 0)) {
				var6 = false;
			}

			return var6;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILgv;I)Lib;",
		garbageValue = "-1805529850"
	)
	public final ModelData method4734(int var1, PlayerCompositionColorTextureOverride var2) {
		int var3 = this.femaleModel;
		int var4 = this.femaleModel1;
		int var5 = this.femaleModel2;
		if (var1 == 1) {
			var3 = this.maleHeadModel;
			var4 = this.maleHeadModel2;
			var5 = this.femaleHeadModel;
		}

		if (var2 != null && var2.method4176(var1)) {
			var3 = var2.method4177(var1);
		}

		if (var3 == -1) {
			return null;
		} else {
			ModelData var6 = ModelData.ModelData_get(SpriteBufferProperties.ItemDefinition_modelArchive, var3, 0);
			if (var4 != -1) {
				ModelData var7 = ModelData.ModelData_get(SpriteBufferProperties.ItemDefinition_modelArchive, var4, 0);
				if (var5 != -1) {
					ModelData var8 = ModelData.ModelData_get(SpriteBufferProperties.ItemDefinition_modelArchive, var5, 0);
					ModelData[] var9 = new ModelData[]{var6, var7, var8};
					var6 = new ModelData(var9, 3);
				} else {
					ModelData[] var10 = new ModelData[]{var6, var7};
					var6 = new ModelData(var10, 2);
				}
			}

			if (var1 == 0 && this.femaleOffset != 0) {
				var6.changeOffset(0, this.femaleOffset, 0);
			}

			if (var1 == 1 && this.field2442 != 0) {
				var6.changeOffset(0, this.field2442, 0);
			}

			this.method4780(var6, var2);
			return var6;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILgv;I)Z",
		garbageValue = "675597995"
	)
	public final boolean method4722(int var1, PlayerCompositionColorTextureOverride var2) {
		int var3 = this.femaleHeadModel2;
		int var4 = this.field2384;
		if (var1 == 1) {
			var3 = this.field2438;
			var4 = this.field2439;
		}

		if (var2 != null && var2.method4168(var1)) {
			var3 = var2.method4173(var1);
		}

		if (var3 == -1) {
			return true;
		} else {
			boolean var5 = true;
			if (!SpriteBufferProperties.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var5 = false;
			}

			if (var4 != -1 && !SpriteBufferProperties.ItemDefinition_modelArchive.tryLoadFile(var4, 0)) {
				var5 = false;
			}

			return var5;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILgv;I)Lib;",
		garbageValue = "831632813"
	)
	public final ModelData method4767(int var1, PlayerCompositionColorTextureOverride var2) {
		int var3 = this.femaleHeadModel2;
		int var4 = this.field2384;
		if (var1 == 1) {
			var3 = this.field2438;
			var4 = this.field2439;
		}

		if (var2 != null && var2.method4168(var1)) {
			var3 = var2.method4173(var1);
		}

		if (var3 == -1) {
			return null;
		} else {
			ModelData var5 = ModelData.ModelData_get(SpriteBufferProperties.ItemDefinition_modelArchive, var3, 0);
			if (var4 != -1) {
				ModelData var6 = ModelData.ModelData_get(SpriteBufferProperties.ItemDefinition_modelArchive, var4, 0);
				ModelData[] var7 = new ModelData[]{var5, var6};
				var5 = new ModelData(var7, 2);
			}

			this.method4780(var5, var2);
			return var5;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lib;Lgv;I)V",
		garbageValue = "-1383937191"
	)
	void method4780(ModelData var1, PlayerCompositionColorTextureOverride var2) {
		short[] var3;
		short[] var4;
		int var5;
		if (this.recolorFrom != null) {
			var3 = this.recolorFrom;
			var4 = this.recolorTo;
			if (var2 != null && var2.playerCompositionRecolorTo != null && this.recolorTo.length == var2.playerCompositionRecolorTo.length) {
				var4 = var2.playerCompositionRecolorTo;
			}

			for (var5 = 0; var5 < this.recolorFrom.length; ++var5) {
				var1.recolor(var3[var5], var4[var5]);
			}
		}

		if (this.retextureFrom != null) {
			var3 = this.retextureFrom;
			var4 = this.retextureTo;
			if (var2 != null && var2.playerCompositionRetextureTo != null && this.retextureTo.length == var2.playerCompositionRetextureTo.length) {
				var4 = var2.playerCompositionRetextureTo;
			}

			for (var5 = 0; var5 < this.retextureFrom.length; ++var5) {
				var1.retexture(var3[var5], var4[var5]);
			}
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "8"
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1736092513"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class85.method2923(this.params, var1, var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-947744685"
	)
	@Export("getShiftClickIndex")
	public int getShiftClickIndex() {
		if (this.shiftClickIndex != -1 && this.inventoryActions != null) {
			if (this.shiftClickIndex >= 0) {
				return this.inventoryActions[this.shiftClickIndex] != null ? this.shiftClickIndex : -1;
			} else {
				return "Drop".equalsIgnoreCase(this.inventoryActions[4]) ? 4 : -1;
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-126"
	)
	boolean method4741() {
		return this.recolorTo != null;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-597357829"
	)
	boolean method4789() {
		return this.retextureTo != null;
	}
}
