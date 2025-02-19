import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("in")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("ItemDefinition_cached")
	public static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("ItemDefinition_cachedModels")
	public static EvictingDualNodeHashTable ItemDefinition_cachedModels;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("ItemDefinition_cachedSprites")
	public static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 712507937
	)
	@Export("id")
	int id;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -643206809
	)
	@Export("model")
	int model;
	@ObfuscatedName("ar")
	@Export("name")
	public String name;
	@ObfuscatedName("ag")
	@Export("examine")
	public String examine;
	@ObfuscatedName("az")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("am")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("aq")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("aw")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1075715471
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -110386271
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 382787719
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1789857765
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 132661455
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1215395515
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 482679283
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -559222991
	)
	@Export("price")
	public int price;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -2072290267
	)
	@Export("maleModel")
	public int maleModel;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 4829839
	)
	@Export("maleModel1")
	public int maleModel1;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1583596783
	)
	@Export("maleModel2")
	public int maleModel2;
	@ObfuscatedName("bu")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("by")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("bh")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("be")
	@Export("subOps")
	public String[][] subOps;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -399408617
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 177389791
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1845041483
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1284230419
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1717131775
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1312685035
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -979768397
	)
	int field2309;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 2070174905
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1135908487
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 285796877
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 727309241
	)
	int field2313;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1241015161
	)
	int field2300;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -591840663
	)
	int field2296;
	@ObfuscatedName("cd")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("cp")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 982636231
	)
	@Export("note")
	public int note;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 935512107
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -1906882619
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -226469301
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -1277493207
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 984147917
	)
	@Export("ambient")
	public int ambient;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1459082497
	)
	@Export("contrast")
	public int contrast;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -181735495
	)
	@Export("team")
	public int team;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -1800481187
	)
	public int field2286;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("cx")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 751484131
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -50468245
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 1333449207
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 803840765
	)
	@Export("placeholderTemplate")
	public int placeholderTemplate;

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
		this.shiftClickIndex = -2;
		this.femaleModel = -1;
		this.femaleModel1 = -1;
		this.femaleOffset = 0;
		this.maleHeadModel = -1;
		this.maleHeadModel2 = -1;
		this.field2309 = 0;
		this.femaleModel2 = -1;
		this.femaleHeadModel = -1;
		this.femaleHeadModel2 = -1;
		this.field2313 = -1;
		this.field2300 = -1;
		this.field2296 = -1;
		this.note = -1;
		this.noteTemplate = -1;
		this.resizeX = 128;
		this.resizeY = 128;
		this.resizeZ = 128;
		this.ambient = 0;
		this.contrast = 0;
		this.team = 0;
		this.field2286 = 0;
		this.isTradable = false;
		this.unnotedId = -1;
		this.notedId = -1;
		this.placeholder = -1;
		this.placeholderTemplate = -1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "16711935"
	)
	@Export("post")
	void post() {
		if (this.isStackable == 1) {
			this.field2286 = 0;
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-303430887"
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lvy;IB)V",
		garbageValue = "-97"
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
			this.field2309 = var1.readUnsignedByte();
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
				this.field2286 = var1.readShort();
			} else if (var2 == 78) {
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) {
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 90) {
				this.femaleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 91) {
				this.field2300 = var1.readUnsignedShort();
			} else if (var2 == 92) {
				this.field2313 = var1.readUnsignedShort();
			} else if (var2 == 93) {
				this.field2296 = var1.readUnsignedShort();
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
				this.params = UserComparator6.readStringIntParameters(var1, this.params);
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lin;Lin;I)V",
		garbageValue = "-851146257"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lin;Lin;I)V",
		garbageValue = "-1924703854"
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
		this.field2313 = var2.field2313;
		this.field2300 = var2.field2300;
		this.field2296 = var2.field2296;
		this.team = var2.team;
		this.groundActions = var2.groundActions;
		this.field2286 = var2.field2286;
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lin;Lin;I)V",
		garbageValue = "-504064882"
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljk;",
		garbageValue = "1"
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
				return class138.ItemDefinition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(HttpAuthenticationHeader.ItemDefinition_modelArchive, this.model, 0);
		if (var4 == null) {
			return null;
		} else {
			if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
				var4.resize(this.resizeX, this.resizeY, this.resizeZ);
			}

			this.method4222(var4, (PlayerCompositionColorTextureOverride)null);
			return var4;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Ljf;",
		garbageValue = "-1960162776"
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
				return class138.ItemDefinition_get(var2).getModel(1);
			}
		}

		Model var4 = (Model)ItemDefinition_cachedModels.get((long)this.id);
		if (var4 != null) {
			return var4;
		} else {
			ModelData var5 = ModelData.ModelData_get(HttpAuthenticationHeader.ItemDefinition_modelArchive, this.model, 0);
			if (var5 == null) {
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
					var5.resize(this.resizeX, this.resizeY, this.resizeZ);
				}

				this.method4222(var5, (PlayerCompositionColorTextureOverride)null);
				var4 = var5.toModel(this.ambient + 64, this.contrast * 5 + 768, -50, -10, -50);
				var4.isSingleTile = true;
				ItemDefinition_cachedModels.put(var4, (long)this.id);
				return var4;
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lgf;I)Ljf;",
		garbageValue = "379136474"
	)
	public final Model method4216(PlayerCompositionColorTextureOverride var1) {
		Model var2 = var1.field1895;
		if (var2 != null) {
			return var2;
		} else {
			ModelData var3 = ModelData.ModelData_get(HttpAuthenticationHeader.ItemDefinition_modelArchive, var1.field1894, 0);
			if (var3 == null) {
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
					var3.resize(this.resizeX, this.resizeY, this.resizeZ);
				}

				this.method4222(var3, var1);
				var2 = var3.toModel(this.ambient + 64, this.contrast * 5 + 768, -50, -10, -50);
				var2.isSingleTile = true;
				var1.field1895 = var2;
				return var2;
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Lin;",
		garbageValue = "805318704"
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
				return class138.ItemDefinition_get(var2);
			}
		}

		return this;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILgf;I)Z",
		garbageValue = "1711900683"
	)
	public final boolean method4254(int var1, PlayerCompositionColorTextureOverride var2) {
		int var3 = this.femaleModel;
		int var4 = this.femaleModel1;
		int var5 = this.femaleModel2;
		if (var1 == 1) {
			var3 = this.maleHeadModel;
			var4 = this.maleHeadModel2;
			var5 = this.femaleHeadModel;
		}

		if (var2 != null && var2.method3731(var1)) {
			var3 = var2.method3708(var1);
		}

		if (var3 == -1) {
			return true;
		} else {
			boolean var6 = true;
			if (!HttpAuthenticationHeader.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var6 = false;
			}

			if (var4 != -1 && !HttpAuthenticationHeader.ItemDefinition_modelArchive.tryLoadFile(var4, 0)) {
				var6 = false;
			}

			if (var5 != -1 && !HttpAuthenticationHeader.ItemDefinition_modelArchive.tryLoadFile(var5, 0)) {
				var6 = false;
			}

			return var6;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILgf;I)Ljk;",
		garbageValue = "1935386794"
	)
	public final ModelData method4268(int var1, PlayerCompositionColorTextureOverride var2) {
		int var3 = this.femaleModel;
		int var4 = this.femaleModel1;
		int var5 = this.femaleModel2;
		if (var1 == 1) {
			var3 = this.maleHeadModel;
			var4 = this.maleHeadModel2;
			var5 = this.femaleHeadModel;
		}

		if (var2 != null && var2.method3731(var1)) {
			var3 = var2.method3708(var1);
		}

		if (var3 == -1) {
			return null;
		} else {
			ModelData var6 = ModelData.ModelData_get(HttpAuthenticationHeader.ItemDefinition_modelArchive, var3, 0);
			if (var4 != -1) {
				ModelData var7 = ModelData.ModelData_get(HttpAuthenticationHeader.ItemDefinition_modelArchive, var4, 0);
				if (var5 != -1) {
					ModelData var8 = ModelData.ModelData_get(HttpAuthenticationHeader.ItemDefinition_modelArchive, var5, 0);
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

			if (var1 == 1 && this.field2309 != 0) {
				var6.changeOffset(0, this.field2309, 0);
			}

			this.method4222(var6, var2);
			return var6;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILgf;I)Z",
		garbageValue = "310801323"
	)
	public final boolean method4220(int var1, PlayerCompositionColorTextureOverride var2) {
		int var3 = this.femaleHeadModel2;
		int var4 = this.field2313;
		if (var1 == 1) {
			var3 = this.field2300;
			var4 = this.field2296;
		}

		if (var2 != null && var2.method3712(var1)) {
			var3 = var2.method3714(var1);
		}

		if (var3 == -1) {
			return true;
		} else {
			boolean var5 = true;
			if (!HttpAuthenticationHeader.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var5 = false;
			}

			if (var4 != -1 && !HttpAuthenticationHeader.ItemDefinition_modelArchive.tryLoadFile(var4, 0)) {
				var5 = false;
			}

			return var5;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILgf;I)Ljk;",
		garbageValue = "-1599804383"
	)
	public final ModelData method4257(int var1, PlayerCompositionColorTextureOverride var2) {
		int var3 = this.femaleHeadModel2;
		int var4 = this.field2313;
		if (var1 == 1) {
			var3 = this.field2300;
			var4 = this.field2296;
		}

		if (var2 != null && var2.method3712(var1)) {
			var3 = var2.method3714(var1);
		}

		if (var3 == -1) {
			return null;
		} else {
			ModelData var5 = ModelData.ModelData_get(HttpAuthenticationHeader.ItemDefinition_modelArchive, var3, 0);
			if (var4 != -1) {
				ModelData var6 = ModelData.ModelData_get(HttpAuthenticationHeader.ItemDefinition_modelArchive, var4, 0);
				ModelData[] var7 = new ModelData[]{var5, var6};
				var5 = new ModelData(var7, 2);
			}

			this.method4222(var5, var2);
			return var5;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljk;Lgf;I)V",
		garbageValue = "-1373324365"
	)
	void method4222(ModelData var1, PlayerCompositionColorTextureOverride var2) {
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1136514864"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return class28.method391(this.params, var1, var2);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-6"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class59.method1133(this.params, var1, var2);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-48"
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "126"
	)
	boolean method4226() {
		return this.recolorTo != null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-66"
	)
	boolean method4227() {
		return this.retextureTo != null;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2082127430"
	)
	static final void method4285() {
		AsyncRestClient.method146("You can't add yourself to your own ignore list");
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/Object;",
		garbageValue = "62"
	)
	static Object method4221(int var0) {
		return WorldMapSection1.method6326((class555)class454.findEnumerated(class555.method10068(), var0));
	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "923421879"
	)
	@Export("menuAction")
	public static final void menuAction(int var0, int var1, int var2, int var3, int var4, int var5, String var6, String var7, int var8, int var9) {
		WorldView var10 = Client.worldViewManager.method2546(var5);
		if (var10 != null) {
			int var11 = var10.baseX;
			int var12 = var10.baseY;
			class414 var13 = var10.field1356;
			class414 var14 = var10.field1353;
			if (var2 >= 2000) {
				var2 -= 2000;
			}

			PacketBufferNode var15;
			if (var2 == 1) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = class272.getPacketBufferNode(ClientPacket.OPLOCU, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShort(class400.field4676);
				var15.packetBuffer.writeShortAdd(class447.field4935);
				var15.packetBuffer.writeIntIME(SoundCache.field309);
				var15.packetBuffer.writeShortAddLE(var12 + var1);
				var15.packetBuffer.writeShortAddLE(var3);
				var15.packetBuffer.writeShortAdd(var0 + var11);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 2) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = class272.getPacketBufferNode(ClientPacket.OPLOCT, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortAdd(var0 + var11);
				var15.packetBuffer.writeShortAddLE(Client.selectedSpellChildIndex);
				var15.packetBuffer.writeShortAddLE(var3);
				var15.packetBuffer.writeShortAddLE(Client.selectedSpellItemId);
				var15.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeIntME(class171.selectedSpellWidget);
				var15.packetBuffer.writeShortLE(var12 + var1);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 3) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = class272.getPacketBufferNode(ClientPacket.OPLOC1, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortAddLE(var0 + var11);
				var15.packetBuffer.writeShort(var3);
				var15.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShortLE(var12 + var1);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 4) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = class272.getPacketBufferNode(ClientPacket.OPLOC2, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortAddLE(var12 + var1);
				var15.packetBuffer.writeShort(var0 + var11);
				var15.packetBuffer.writeShortAdd(var3);
				var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 5) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = class272.getPacketBufferNode(ClientPacket.OPLOC3, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortAddLE(var0 + var11);
				var15.packetBuffer.writeShort(var12 + var1);
				var15.packetBuffer.writeShortAddLE(var3);
				var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 6) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = class272.getPacketBufferNode(ClientPacket.OPLOC4, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShort(var0 + var11);
				var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShortAddLE(var12 + var1);
				var15.packetBuffer.writeShortAddLE(var3);
				Client.packetWriter.addNode(var15);
			} else {
				PacketBufferNode var16;
				NPC var20;
				if (var2 == 7) {
					var20 = (NPC)var13.method7890((long)var3);
					if (var20 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = class272.getPacketBufferNode(ClientPacket.OPNPCU, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var16.packetBuffer.writeShortLE(class447.field4935);
						var16.packetBuffer.writeShortAddLE(class400.field4676);
						var16.packetBuffer.writeShortLE(var3);
						var16.packetBuffer.writeIntLE(SoundCache.field309);
						Client.packetWriter.addNode(var16);
					}
				} else if (var2 == 8) {
					var20 = (NPC)var13.method7890((long)var3);
					if (var20 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = class272.getPacketBufferNode(ClientPacket.OPNPCT, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeShort(Client.selectedSpellChildIndex);
						var16.packetBuffer.writeShortLE(Client.selectedSpellItemId);
						var16.packetBuffer.writeShort(var3);
						var16.packetBuffer.writeIntLE(class171.selectedSpellWidget);
						var16.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var16);
					}
				} else if (var2 == 9) {
					var20 = (NPC)var13.method7890((long)var3);
					if (var20 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = class272.getPacketBufferNode(ClientPacket.OPNPC1, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var16.packetBuffer.writeShortAdd(var3);
						Client.packetWriter.addNode(var16);
					}
				} else if (var2 == 10) {
					var20 = (NPC)var13.method7890((long)var3);
					if (var20 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = class272.getPacketBufferNode(ClientPacket.OPNPC2, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeShortAdd(var3);
						var16.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var16);
					}
				} else if (var2 == 11) {
					var20 = (NPC)var13.method7890((long)var3);
					if (var20 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = class272.getPacketBufferNode(ClientPacket.OPNPC3, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeShortAdd(var3);
						var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var16);
					}
				} else if (var2 == 12) {
					var20 = (NPC)var13.method7890((long)var3);
					if (var20 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = class272.getPacketBufferNode(ClientPacket.OPNPC4, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var16.packetBuffer.writeShortAdd(var3);
						Client.packetWriter.addNode(var16);
					}
				} else if (var2 == 13) {
					var20 = (NPC)var13.method7890((long)var3);
					if (var20 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = class272.getPacketBufferNode(ClientPacket.OPNPC5, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeShortAdd(var3);
						var16.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var16);
					}
				} else {
					Player var22;
					if (var2 == 14) {
						var22 = (Player)var14.method7890((long)var3);
						if (var22 != null) {
							Client.mouseCrossX = var8;
							Client.mouseCrossY = var9;
							Client.mouseCrossColor = 2;
							Client.mouseCrossState = 0;
							Client.destinationX = var0;
							Client.destinationY = var1;
							var16 = class272.getPacketBufferNode(ClientPacket.OPPLAYERU, Client.packetWriter.isaacCipher);
							var16.packetBuffer.writeInt(SoundCache.field309);
							var16.packetBuffer.writeShortAdd(var3);
							var16.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
							var16.packetBuffer.writeShortAddLE(class400.field4676);
							var16.packetBuffer.writeShort(class447.field4935);
							Client.packetWriter.addNode(var16);
						}
					} else if (var2 == 15) {
						var22 = (Player)var14.method7890((long)var3);
						if (var22 != null) {
							Client.mouseCrossX = var8;
							Client.mouseCrossY = var9;
							Client.mouseCrossColor = 2;
							Client.mouseCrossState = 0;
							Client.destinationX = var0;
							Client.destinationY = var1;
							var16 = class272.getPacketBufferNode(ClientPacket.OPPLAYERT, Client.packetWriter.isaacCipher);
							var16.packetBuffer.writeShortAdd(var3);
							var16.packetBuffer.writeIntLE(class171.selectedSpellWidget);
							var16.packetBuffer.writeShortAddLE(Client.selectedSpellItemId);
							var16.packetBuffer.writeShort(Client.selectedSpellChildIndex);
							var16.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
							Client.packetWriter.addNode(var16);
						}
					} else if (var2 == 16) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = class272.getPacketBufferNode(ClientPacket.OPOBJU, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShortAdd(var3);
						var15.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShort(class447.field4935);
						var15.packetBuffer.writeShort(class400.field4676);
						var15.packetBuffer.writeShortLE(var0 + var11);
						var15.packetBuffer.writeShort(var12 + var1);
						var15.packetBuffer.writeIntME(SoundCache.field309);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 17) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = class272.getPacketBufferNode(ClientPacket.OPOBJT, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeInt(class171.selectedSpellWidget);
						var15.packetBuffer.writeShortAddLE(Client.selectedSpellItemId);
						var15.packetBuffer.writeShortLE(var3);
						var15.packetBuffer.writeShortAdd(var0 + var11);
						var15.packetBuffer.writeShort(var12 + var1);
						var15.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 18) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = class272.getPacketBufferNode(ClientPacket.OPOBJ1, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShortAddLE(var3);
						var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShort(var12 + var1);
						var15.packetBuffer.writeShortAddLE(var0 + var11);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 19) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = class272.getPacketBufferNode(ClientPacket.OPOBJ2, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShortAdd(var0 + var11);
						var15.packetBuffer.writeShortAdd(var3);
						var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShortAdd(var12 + var1);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 20) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = class272.getPacketBufferNode(ClientPacket.OPOBJ3, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShortAddLE(var0 + var11);
						var15.packetBuffer.writeShortAdd(var12 + var1);
						var15.packetBuffer.writeShortLE(var3);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 21) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = class272.getPacketBufferNode(ClientPacket.OPOBJ4, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShortAddLE(var0 + var11);
						var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShortAddLE(var3);
						var15.packetBuffer.writeShortLE(var12 + var1);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 22) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = class272.getPacketBufferNode(ClientPacket.OPOBJ5, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShort(var12 + var1);
						var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShortLE(var0 + var11);
						var15.packetBuffer.writeShortLE(var3);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 23) {
						if (Client.isMenuOpen) {
							var10.scene.method5043();
						} else {
							var10.scene.menuOpen(true);
						}
					} else {
						PacketBufferNode var17;
						Widget var23;
						if (var2 == 24) {
							var23 = class376.widgetDefinition.method6918(var1);
							if (var23 != null) {
								boolean var19 = true;
								if (var23.contentType > 0) {
									var19 = class272.method5683(var23);
								}

								if (var19) {
									var17 = class272.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
									var17.packetBuffer.writeInt(var1);
									Client.packetWriter.addNode(var17);
								}
							}
						} else {
							if (var2 == 25) {
								var23 = class376.widgetDefinition.getWidgetChild(var1, var0);
								if (var23 != null) {
									class142.method3403();
									SpriteMask.method6854(var1, var0, ItemLayer.Widget_unpackTargetMask(class441.getWidgetFlags(var23)), var4);
									Client.isItemSelected = 0;
									Client.selectedSpellActionName = PlayerType.Widget_getSpellActionName(var23);
									if (Client.selectedSpellActionName == null) {
										Client.selectedSpellActionName = "null";
									}

									if (var23.isIf3) {
										Client.selectedSpellName = var23.dataText + MilliClock.colorStartTag(16777215);
									} else {
										Client.selectedSpellName = MilliClock.colorStartTag(65280) + var23.field4054 + MilliClock.colorStartTag(16777215);
									}
								}

								return;
							}

							if (var2 == 26) {
								class179.method3771();
							} else {
								int var18;
								Widget var21;
								if (var2 == 28) {
									var15 = class272.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
									var15.packetBuffer.writeInt(var1);
									Client.packetWriter.addNode(var15);
									var21 = class376.widgetDefinition.method6918(var1);
									if (var21 != null && var21.cs1Instructions != null && var21.cs1Instructions[0][0] == 5) {
										var18 = var21.cs1Instructions[0][1];
										Varps.Varps_main[var18] = 1 - Varps.Varps_main[var18];
										DevicePcmPlayerProvider.changeGameOptions(var18);
									}
								} else if (var2 == 29) {
									var15 = class272.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
									var15.packetBuffer.writeInt(var1);
									Client.packetWriter.addNode(var15);
									var21 = class376.widgetDefinition.method6918(var1);
									if (var21 != null && var21.cs1Instructions != null && var21.cs1Instructions[0][0] == 5) {
										var18 = var21.cs1Instructions[0][1];
										if (Varps.Varps_main[var18] != var21.cs1ComparisonValues[0]) {
											Varps.Varps_main[var18] = var21.cs1ComparisonValues[0];
											DevicePcmPlayerProvider.changeGameOptions(var18);
										}
									}
								} else if (var2 == 30) {
									if (Client.meslayerContinueWidget == null) {
										class157.resumePauseWidget(var1, var0);
										Client.meslayerContinueWidget = class376.widgetDefinition.getWidgetChild(var1, var0);
										MilliClock.invalidateWidget(Client.meslayerContinueWidget);
									}
								} else if (var2 == 44) {
									var22 = (Player)var14.method7890((long)var3);
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = class272.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										var16.packetBuffer.writeShortAdd(var3);
										Client.packetWriter.addNode(var16);
									}
								} else if (var2 == 45) {
									var22 = (Player)var14.method7890((long)var3);
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = class272.getPacketBufferNode(ClientPacket.OPPLAYER2, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShortAdd(var3);
										var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										Client.packetWriter.addNode(var16);
									}
								} else if (var2 == 46) {
									var22 = (Player)var14.method7890((long)var3);
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = class272.getPacketBufferNode(ClientPacket.OPPLAYER3, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										var16.packetBuffer.writeShort(var3);
										Client.packetWriter.addNode(var16);
									}
								} else if (var2 == 47) {
									var22 = (Player)var14.method7890((long)var3);
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = class272.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShortAdd(var3);
										var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										Client.packetWriter.addNode(var16);
									}
								} else if (var2 == 48) {
									var22 = (Player)var14.method7890((long)var3);
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = class272.getPacketBufferNode(ClientPacket.OPPLAYER5, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										var16.packetBuffer.writeShort(var3);
										Client.packetWriter.addNode(var16);
									}
								} else if (var2 == 49) {
									var22 = (Player)var14.method7890((long)var3);
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = class272.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShort(var3);
										var16.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										Client.packetWriter.addNode(var16);
									}
								} else if (var2 == 50) {
									var22 = (Player)var14.method7890((long)var3);
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = class272.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										var16.packetBuffer.writeShort(var3);
										Client.packetWriter.addNode(var16);
									}
								} else if (var2 == 51) {
									var22 = (Player)var14.method7890((long)var3);
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = class272.getPacketBufferNode(ClientPacket.OPPLAYER8, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										var16.packetBuffer.writeShortAdd(var3);
										Client.packetWriter.addNode(var16);
									}
								} else {
									label574: {
										if (var2 != 57) {
											if (var2 == 58) {
												var23 = class376.widgetDefinition.getWidgetChild(var1, var0);
												if (var23 != null) {
													if (var23.field4045 != null) {
														ScriptEvent var25 = new ScriptEvent();
														var25.widget = var23;
														var25.opIndex = var3;
														var25.targetName = var7;
														var25.args = var23.field4045;
														MilliClock.runScriptEvent(var25);
													}

													var16 = class272.getPacketBufferNode(ClientPacket.IF_BUTTONT, Client.packetWriter.isaacCipher);
													var16.packetBuffer.writeShortAdd(var4);
													var16.packetBuffer.writeShortAddLE(Client.selectedSpellChildIndex);
													var16.packetBuffer.writeShortLE(var0);
													var16.packetBuffer.writeShort(Client.selectedSpellItemId);
													var16.packetBuffer.writeIntLE(var1);
													var16.packetBuffer.writeIntIME(class171.selectedSpellWidget);
													Client.packetWriter.addNode(var16);
												}
												break label574;
											}

											if (var2 == 60) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 1;
												Client.mouseCrossState = 0;
												Client.field742 = var3;
												Client.field790 = 30;
												var15 = class272.getPacketBufferNode(ClientPacket.SET_HEADING, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeByteNeg(var3);
												Client.packetWriter.addNode(var15);
												break label574;
											}

											if (var2 == 1001) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												Client.destinationX = var0;
												Client.destinationY = var1;
												var15 = class272.getPacketBufferNode(ClientPacket.OPLOC5, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeShortAddLE(var0 + var11);
												var15.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
												var15.packetBuffer.writeShortAdd(var3);
												var15.packetBuffer.writeShortLE(var12 + var1);
												Client.packetWriter.addNode(var15);
												break label574;
											}

											if (var2 == 1002) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var15 = class272.getPacketBufferNode(ClientPacket.OPLOCE, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeShortLE(var3);
												Client.packetWriter.addNode(var15);
												break label574;
											}

											if (var2 == 1003) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var20 = (NPC)var13.method7890((long)var3);
												if (var20 != null) {
													NPCComposition var24 = var20.definition;
													if (var24.transforms != null) {
														var24 = var24.transform();
													}

													if (var24 != null) {
														var17 = class272.getPacketBufferNode(ClientPacket.OPNPCE, Client.packetWriter.isaacCipher);
														var17.packetBuffer.writeShortAdd(var24.id);
														Client.packetWriter.addNode(var17);
													}
												}
												break label574;
											}

											if (var2 == 1004) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var15 = class272.getPacketBufferNode(ClientPacket.OPOBJE, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeShortAddLE(var12 + var1);
												var15.packetBuffer.writeShort(var3);
												var15.packetBuffer.writeShortLE(var0 + var11);
												Client.packetWriter.addNode(var15);
												break label574;
											}

											if (var2 != 1007) {
												if (var2 == 1010 || var2 == 1011 || var2 == 1009 || var2 == 1008 || var2 == 1012) {
													class541.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
												}
												break label574;
											}
										}

										var23 = class376.widgetDefinition.getWidgetChild(var1, var0);
										if (var23 != null) {
											class449.widgetDefaultMenuAction(var3, var1, var0, var4, var7);
										}
									}
								}
							}
						}
					}
				}
			}

			if (Client.isItemSelected != 0) {
				Client.isItemSelected = 0;
				MilliClock.invalidateWidget(class376.widgetDefinition.method6918(SoundCache.field309));
			}

			if (Client.isSpellSelected) {
				class142.method3403();
			}

		}
	}
}
