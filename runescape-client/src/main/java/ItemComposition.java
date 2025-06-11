import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("id")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("ItemDefinition_cached")
	public static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("ItemDefinition_cachedModels")
	public static EvictingDualNodeHashTable ItemDefinition_cachedModels;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("ItemDefinition_cachedSprites")
	public static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 483187141
	)
	@Export("id")
	int id;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 18126089
	)
	@Export("model")
	int model;
	@ObfuscatedName("av")
	@Export("name")
	public String name;
	@ObfuscatedName("ao")
	@Export("examine")
	public String examine;
	@ObfuscatedName("as")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("ax")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("ab")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("aq")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1188093707
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -116921361
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -227075985
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 466227481
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1772409553
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1080594167
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -309978589
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1622718377
	)
	@Export("price")
	public int price;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1057872141
	)
	@Export("maleModel")
	public int maleModel;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1011807771
	)
	@Export("maleModel1")
	public int maleModel1;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 521009573
	)
	@Export("maleModel2")
	public int maleModel2;
	@ObfuscatedName("bf")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("bj")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("bt")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("bd")
	@Export("subOps")
	public String[][] subOps;
	@ObfuscatedName("bs")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("bn")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1514200885
	)
	@Export("note")
	public int note;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1422682627
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1605875393
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1006328525
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1141974965
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 938521103
	)
	@Export("ambient")
	public int ambient;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1478259561
	)
	@Export("contrast")
	public int contrast;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 949665079
	)
	@Export("team")
	public int team;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 474800435
	)
	public int field2267;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("ck")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -1831816829
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -901362915
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 1059633187
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 802093423
	)
	@Export("placeholderTemplate")
	public int placeholderTemplate;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -1774877811
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 515026627
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 379134213
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 1475272995
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 1774685223
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 1801257085
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 1389931919
	)
	int field2319;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -1471704855
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 1165967277
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -4778767
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 2098570385
	)
	int field2300;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 1680333251
	)
	int field2321;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 456647229
	)
	int field2325;

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
		this.field2267 = 0;
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
		this.field2319 = 0;
		this.femaleModel2 = -1;
		this.femaleHeadModel = -1;
		this.femaleHeadModel2 = -1;
		this.field2300 = -1;
		this.field2321 = -1;
		this.field2325 = -1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-22760"
	)
	@Export("post")
	void post() {
		if (this.isStackable == 1) {
			this.field2267 = 0;
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lwt;B)V",
		garbageValue = "32"
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lwt;II)V",
		garbageValue = "-1662884402"
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
			this.price = var1.readInt();
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
			this.field2319 = var1.readUnsignedByte();
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
				this.field2267 = var1.readShort();
			} else if (var2 == 78) {
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) {
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 90) {
				this.femaleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 91) {
				this.field2321 = var1.readUnsignedShort();
			} else if (var2 == 92) {
				this.field2300 = var1.readUnsignedShort();
			} else if (var2 == 93) {
				this.field2325 = var1.readUnsignedShort();
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
				this.contrast = var1.readByte() * 5;
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
				this.params = UrlRequester.readStringIntParameters(var1, this.params);
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lid;Lid;I)V",
		garbageValue = "-153514255"
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lid;Lid;B)V",
		garbageValue = "-117"
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
		this.field2300 = var2.field2300;
		this.field2321 = var2.field2321;
		this.field2325 = var2.field2325;
		this.team = var2.team;
		this.groundActions = var2.groundActions;
		this.field2267 = var2.field2267;
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lid;Lid;I)V",
		garbageValue = "-278634524"
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IS)Ljj;",
		garbageValue = "-26198"
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
				return SceneTilePaint.ItemDefinition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(FadeInTask.ItemDefinition_modelArchive, this.model, 0);
		if (var4 == null) {
			return null;
		} else {
			if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
				var4.resize(this.resizeX, this.resizeY, this.resizeZ);
			}

			this.method4458(var4, (PlayerCompositionColorTextureOverride)null);
			return var4;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Ljm;",
		garbageValue = "606248190"
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
				return SceneTilePaint.ItemDefinition_get(var2).getModel(1);
			}
		}

		Model var4 = (Model)ItemDefinition_cachedModels.get((long)this.id);
		if (var4 != null) {
			return var4;
		} else {
			ModelData var5 = ModelData.ModelData_get(FadeInTask.ItemDefinition_modelArchive, this.model, 0);
			if (var5 == null) {
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
					var5.resize(this.resizeX, this.resizeY, this.resizeZ);
				}

				this.method4458(var5, (PlayerCompositionColorTextureOverride)null);
				var4 = var5.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
				var4.isSingleTile = true;
				ItemDefinition_cachedModels.put(var4, (long)this.id);
				return var4;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lgi;I)Ljm;",
		garbageValue = "-1800854452"
	)
	public final Model method4455(PlayerCompositionColorTextureOverride var1) {
		Model var2 = var1.field1886;
		if (var2 != null) {
			return var2;
		} else {
			ModelData var3 = ModelData.ModelData_get(FadeInTask.ItemDefinition_modelArchive, var1.field1885, 0);
			if (var3 == null) {
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
					var3.resize(this.resizeX, this.resizeY, this.resizeZ);
				}

				this.method4458(var3, var1);
				var2 = var3.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
				var2.isSingleTile = true;
				var1.field1886 = var2;
				return var2;
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)Lid;",
		garbageValue = "-92"
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
				return SceneTilePaint.ItemDefinition_get(var2);
			}
		}

		return this;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILgi;B)Z",
		garbageValue = "-41"
	)
	public final boolean method4457(int var1, PlayerCompositionColorTextureOverride var2) {
		int var3 = this.femaleModel;
		int var4 = this.femaleModel1;
		int var5 = this.femaleModel2;
		if (var1 == 1) {
			var3 = this.maleHeadModel;
			var4 = this.maleHeadModel2;
			var5 = this.femaleHeadModel;
		}

		if (var2 != null && var2.method3922(var1)) {
			var3 = var2.method3924(var1);
		}

		if (var3 == -1) {
			return true;
		} else {
			boolean var6 = true;
			if (!FadeInTask.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var6 = false;
			}

			if (var4 != -1 && !FadeInTask.ItemDefinition_modelArchive.tryLoadFile(var4, 0)) {
				var6 = false;
			}

			if (var5 != -1 && !FadeInTask.ItemDefinition_modelArchive.tryLoadFile(var5, 0)) {
				var6 = false;
			}

			return var6;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILgi;I)Ljj;",
		garbageValue = "202208235"
	)
	public final ModelData method4477(int var1, PlayerCompositionColorTextureOverride var2) {
		int var3 = this.femaleModel;
		int var4 = this.femaleModel1;
		int var5 = this.femaleModel2;
		if (var1 == 1) {
			var3 = this.maleHeadModel;
			var4 = this.maleHeadModel2;
			var5 = this.femaleHeadModel;
		}

		if (var2 != null && var2.method3922(var1)) {
			var3 = var2.method3924(var1);
		}

		if (var3 == -1) {
			return null;
		} else {
			ModelData var6 = ModelData.ModelData_get(FadeInTask.ItemDefinition_modelArchive, var3, 0);
			if (var4 != -1) {
				ModelData var7 = ModelData.ModelData_get(FadeInTask.ItemDefinition_modelArchive, var4, 0);
				if (var5 != -1) {
					ModelData var8 = ModelData.ModelData_get(FadeInTask.ItemDefinition_modelArchive, var5, 0);
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

			if (var1 == 1 && this.field2319 != 0) {
				var6.changeOffset(0, this.field2319, 0);
			}

			this.method4458(var6, var2);
			return var6;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILgi;B)Z",
		garbageValue = "0"
	)
	public final boolean method4494(int var1, PlayerCompositionColorTextureOverride var2) {
		int var3 = this.femaleHeadModel2;
		int var4 = this.field2300;
		if (var1 == 1) {
			var3 = this.field2321;
			var4 = this.field2325;
		}

		if (var2 != null && var2.method3923(var1)) {
			var3 = var2.method3925(var1);
		}

		if (var3 == -1) {
			return true;
		} else {
			boolean var5 = true;
			if (!FadeInTask.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var5 = false;
			}

			if (var4 != -1 && !FadeInTask.ItemDefinition_modelArchive.tryLoadFile(var4, 0)) {
				var5 = false;
			}

			return var5;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILgi;I)Ljj;",
		garbageValue = "-2141242656"
	)
	public final ModelData method4460(int var1, PlayerCompositionColorTextureOverride var2) {
		int var3 = this.femaleHeadModel2;
		int var4 = this.field2300;
		if (var1 == 1) {
			var3 = this.field2321;
			var4 = this.field2325;
		}

		if (var2 != null && var2.method3923(var1)) {
			var3 = var2.method3925(var1);
		}

		if (var3 == -1) {
			return null;
		} else {
			ModelData var5 = ModelData.ModelData_get(FadeInTask.ItemDefinition_modelArchive, var3, 0);
			if (var4 != -1) {
				ModelData var6 = ModelData.ModelData_get(FadeInTask.ItemDefinition_modelArchive, var4, 0);
				ModelData[] var7 = new ModelData[]{var5, var6};
				var5 = new ModelData(var7, 2);
			}

			this.method4458(var5, var2);
			return var5;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljj;Lgi;B)V",
		garbageValue = "1"
	)
	void method4458(ModelData var1, PlayerCompositionColorTextureOverride var2) {
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1601824715"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return ObjectSound.method1601(this.params, var1, var2);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "71099086"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return TaskHandler.method4701(this.params, var1, var2);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2063274484"
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1190394012"
	)
	boolean method4465() {
		return this.recolorTo != null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-54"
	)
	boolean method4487() {
		return this.retextureTo != null;
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "1"
	)
	static int method4534(int var0, int var1) {
		int var2 = var1 - 334;
		if (var2 < 0) {
			var2 = 0;
		} else if (var2 > 100) {
			var2 = 100;
		}

		int var3 = (Client.zoomWidth - Client.zoomHeight) * var2 / 100 + Client.zoomHeight;
		return var0 * var3 / 256;
	}

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "(Ldk;IIIII)V",
		garbageValue = "-1499314234"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPC var0, int var1, int var2, int var3, int var4) {
		NPCComposition var5 = var0.definition;
		if (Client.menu.menuOptionsCount < 400) {
			if (var5.transforms != null) {
				var5 = var5.transform();
			}

			if (var5 != null) {
				if (var5.isInteractable) {
					if (!var5.isFollower || Client.followerIndex == var1) {
						String var6 = var0.method2636();
						int var7;
						if (var5.combatLevel != 0 && var0.field1086 != 0) {
							var7 = var0.field1086 != -1 ? var0.field1086 : var5.combatLevel;
							var6 = var6 + UserComparator5.method3409(var7, class152.localPlayer.combatLevel) + " " + " (" + "level-" + var7 + ")";
						}

						if (var5.lowPriorityFollowerOps && Client.followerOpsLowPriority) {
							GrandExchangeOfferOwnWorldComparator.insertMenuItem("Examine", AbstractWorldMapIcon.colorStartTag(16776960) + var6, 1003, var1, var2, var3, -1, false, var4);
						}

						if (!UrlRequester.field1487 && Client.isItemSelected == 1) {
							GrandExchangeOfferOwnWorldComparator.insertMenuItem("Use", Client.field520 + " " + "->" + " " + AbstractWorldMapIcon.colorStartTag(16776960) + var6, 7, var1, var2, var3, -1, false, var4);
						} else if (Client.isSpellSelected) {
							if (!UrlRequester.field1487 && (class448.selectedSpellFlags & 2) == 2) {
								GrandExchangeOfferOwnWorldComparator.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + AbstractWorldMapIcon.colorStartTag(16776960) + var6, 8, var1, var2, var3, -1, false, var4);
							}
						} else {
							var7 = var5.lowPriorityFollowerOps && Client.followerOpsLowPriority ? 2000 : 0;
							String[] var8 = var5.actions;
							int var9;
							int var10;
							if (var8 != null) {
								for (var9 = 4; var9 >= 0; --var9) {
									if (!UrlRequester.field1487 && var0.method2574(var9) && var8[var9] != null && !var8[var9].equalsIgnoreCase("Attack")) {
										var10 = 0;
										if (var9 == 0) {
											var10 = var7 + 9;
										}

										if (var9 == 1) {
											var10 = var7 + 10;
										}

										if (var9 == 2) {
											var10 = var7 + 11;
										}

										if (var9 == 3) {
											var10 = var7 + 12;
										}

										if (var9 == 4) {
											var10 = var7 + 13;
										}

										GrandExchangeOfferOwnWorldComparator.insertMenuItem(var8[var9], AbstractWorldMapIcon.colorStartTag(16776960) + var6, var10, var1, var2, var3, -1, false, var4);
									}
								}
							}

							if (var8 != null) {
								for (var9 = 4; var9 >= 0; --var9) {
									if (!UrlRequester.field1487 && var0.method2574(var9) && var8[var9] != null && var8[var9].equalsIgnoreCase("Attack")) {
										short var11 = 0;
										if (AttackOption.AttackOption_hidden != Client.npcAttackOption) {
											if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || Client.npcAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var5.combatLevel > class152.localPlayer.combatLevel) {
												var11 = 2000;
											}

											var10 = 0;
											if (var9 == 0) {
												var10 = var11 + 9;
											}

											if (var9 == 1) {
												var10 = var11 + 10;
											}

											if (var9 == 2) {
												var10 = var11 + 11;
											}

											if (var9 == 3) {
												var10 = var11 + 12;
											}

											if (var9 == 4) {
												var10 = var11 + 13;
											}

											GrandExchangeOfferOwnWorldComparator.insertMenuItem(var8[var9], AbstractWorldMapIcon.colorStartTag(16776960) + var6, var10, var1, var2, var3, -1, false, var4);
										}
									}
								}
							}

							if (!var5.lowPriorityFollowerOps || !Client.followerOpsLowPriority) {
								GrandExchangeOfferOwnWorldComparator.insertMenuItem("Examine", AbstractWorldMapIcon.colorStartTag(16776960) + var6, 1003, var1, var2, var3, -1, false, var4);
							}
						}

					}
				}
			}
		}
	}

	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "442787608"
	)
	public static void method4533(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = class139.getPacketBufferNode(ClientPacket.TELEPORT, Client.packetWriter.isaacCipher);
		var4.packetBuffer.writeShort(var1);
		var4.packetBuffer.writeShortAddLE(var0);
		var4.packetBuffer.writeByteAdd(var2);
		var4.packetBuffer.writeIntLE(var3 ? Client.field477 : 0);
		Client.packetWriter.addNode(var4);
	}
}
