import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("is")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("ItemDefinition_cached")
	public static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("ItemDefinition_cachedModels")
	public static EvictingDualNodeHashTable ItemDefinition_cachedModels;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("ItemDefinition_cachedSprites")
	public static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -899720027
	)
	@Export("id")
	int id;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1958901995
	)
	@Export("model")
	int model;
	@ObfuscatedName("af")
	@Export("name")
	public String name;
	@ObfuscatedName("am")
	@Export("examine")
	public String examine;
	@ObfuscatedName("ao")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("aa")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("aq")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("be")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -433511375
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -299438181
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 488243145
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1738881677
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 68503813
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -680099207
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1515235515
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1824214797
	)
	@Export("price")
	public int price;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1427799695
	)
	@Export("maleModel")
	public int maleModel;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1551751121
	)
	@Export("maleModel1")
	public int maleModel1;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1456474147
	)
	@Export("maleModel2")
	public int maleModel2;
	@ObfuscatedName("ba")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("bi")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("by")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("bw")
	@Export("subOps")
	public String[][] subOps;
	@ObfuscatedName("bf")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("bn")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 98718905
	)
	@Export("note")
	public int note;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 388376999
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -816909667
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 862844559
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -2147134923
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 689590731
	)
	@Export("ambient")
	public int ambient;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1398668579
	)
	@Export("contrast")
	public int contrast;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1635567717
	)
	@Export("team")
	public int team;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 1609347271
	)
	public int field2449;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("cu")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1181026761
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 428085087
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -1134820861
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 413316061
	)
	@Export("placeholderTemplate")
	public int placeholderTemplate;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -705547999
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 1641893811
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 1168834845
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 1704546045
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -2048162279
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -377476775
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 1854849765
	)
	int field2462;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 895590847
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -571365429
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -446638299
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 1093155539
	)
	int field2466;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 1679363463
	)
	int field2467;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -770060021
	)
	int field2468;

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
		this.field2449 = 0;
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
		this.field2462 = 0;
		this.femaleModel2 = -1;
		this.femaleHeadModel = -1;
		this.femaleHeadModel2 = -1;
		this.field2466 = -1;
		this.field2467 = -1;
		this.field2468 = -1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1449464451"
	)
	@Export("post")
	void post() {
		if (this.isStackable == 1) {
			this.field2449 = 0;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lxa;I)V",
		garbageValue = "297032611"
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxa;II)V",
		garbageValue = "-342945755"
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
			this.field2462 = var1.readUnsignedByte();
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
				this.field2449 = var1.readShort();
			} else if (var2 == 78) {
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) {
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 90) {
				this.femaleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 91) {
				this.field2467 = var1.readUnsignedShort();
			} else if (var2 == 92) {
				this.field2466 = var1.readUnsignedShort();
			} else if (var2 == 93) {
				this.field2468 = var1.readUnsignedShort();
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
				this.params = class406.readStringIntParameters(var1, this.params);
			}
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lis;Lis;I)V",
		garbageValue = "381590163"
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lis;Lis;I)V",
		garbageValue = "-263061748"
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
		this.field2466 = var2.field2466;
		this.field2467 = var2.field2467;
		this.field2468 = var2.field2468;
		this.team = var2.team;
		this.groundActions = var2.groundActions;
		this.field2449 = var2.field2449;
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lis;Lis;B)V",
		garbageValue = "111"
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljm;",
		garbageValue = "-16"
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
				return class150.ItemDefinition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(Language.ItemDefinition_modelArchive, this.model, 0);
		if (var4 == null) {
			return null;
		} else {
			if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
				var4.resize(this.resizeX, this.resizeY, this.resizeZ);
			}

			this.method4895(var4, (PlayerCompositionColorTextureOverride)null);
			return var4;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Lky;",
		garbageValue = "326960462"
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
				return class150.ItemDefinition_get(var2).getModel(1);
			}
		}

		Model var4 = (Model)ItemDefinition_cachedModels.get((long)this.id);
		if (var4 != null) {
			return var4;
		} else {
			ModelData var5 = ModelData.ModelData_get(Language.ItemDefinition_modelArchive, this.model, 0);
			if (var5 == null) {
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
					var5.resize(this.resizeX, this.resizeY, this.resizeZ);
				}

				this.method4895(var5, (PlayerCompositionColorTextureOverride)null);
				var4 = var5.toModel(this.ambient + 64, this.contrast * 5 + 768, -50, -10, -50);
				var4.isSingleTile = true;
				ItemDefinition_cachedModels.put(var4, (long)this.id);
				return var4;
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lgx;I)Lky;",
		garbageValue = "-1224258624"
	)
	public final Model method4833(PlayerCompositionColorTextureOverride var1) {
		Model var2 = var1.field1932;
		if (var2 != null) {
			return var2;
		} else {
			ModelData var3 = ModelData.ModelData_get(Language.ItemDefinition_modelArchive, var1.field1940, 0);
			if (var3 == null) {
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
					var3.resize(this.resizeX, this.resizeY, this.resizeZ);
				}

				this.method4895(var3, var1);
				var2 = var3.toModel(this.ambient + 64, this.contrast * 5 + 768, -50, -10, -50);
				var2.isSingleTile = true;
				var1.field1932 = var2;
				return var2;
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)Lis;",
		garbageValue = "1"
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
				return class150.ItemDefinition_get(var2);
			}
		}

		return this;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILgx;I)Z",
		garbageValue = "1343428063"
	)
	public final boolean method4835(int var1, PlayerCompositionColorTextureOverride var2) {
		int var3 = this.femaleModel;
		int var4 = this.femaleModel1;
		int var5 = this.femaleModel2;
		if (var1 == 1) {
			var3 = this.maleHeadModel;
			var4 = this.maleHeadModel2;
			var5 = this.femaleHeadModel;
		}

		if (var2 != null && var2.method4245(var1)) {
			var3 = var2.method4259(var1);
		}

		if (var3 == -1) {
			return true;
		} else {
			boolean var6 = true;
			if (!Language.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var6 = false;
			}

			if (var4 != -1 && !Language.ItemDefinition_modelArchive.tryLoadFile(var4, 0)) {
				var6 = false;
			}

			if (var5 != -1 && !Language.ItemDefinition_modelArchive.tryLoadFile(var5, 0)) {
				var6 = false;
			}

			return var6;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILgx;B)Ljm;",
		garbageValue = "118"
	)
	public final ModelData method4836(int var1, PlayerCompositionColorTextureOverride var2) {
		int var3 = this.femaleModel;
		int var4 = this.femaleModel1;
		int var5 = this.femaleModel2;
		if (var1 == 1) {
			var3 = this.maleHeadModel;
			var4 = this.maleHeadModel2;
			var5 = this.femaleHeadModel;
		}

		if (var2 != null && var2.method4245(var1)) {
			var3 = var2.method4259(var1);
		}

		if (var3 == -1) {
			return null;
		} else {
			ModelData var6 = ModelData.ModelData_get(Language.ItemDefinition_modelArchive, var3, 0);
			if (var4 != -1) {
				ModelData var7 = ModelData.ModelData_get(Language.ItemDefinition_modelArchive, var4, 0);
				if (var5 != -1) {
					ModelData var8 = ModelData.ModelData_get(Language.ItemDefinition_modelArchive, var5, 0);
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

			if (var1 == 1 && this.field2462 != 0) {
				var6.changeOffset(0, this.field2462, 0);
			}

			this.method4895(var6, var2);
			return var6;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILgx;B)Z",
		garbageValue = "9"
	)
	public final boolean method4837(int var1, PlayerCompositionColorTextureOverride var2) {
		int var3 = this.femaleHeadModel2;
		int var4 = this.field2466;
		if (var1 == 1) {
			var3 = this.field2467;
			var4 = this.field2468;
		}

		if (var2 != null && var2.method4254(var1)) {
			var3 = var2.method4248(var1);
		}

		if (var3 == -1) {
			return true;
		} else {
			boolean var5 = true;
			if (!Language.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var5 = false;
			}

			if (var4 != -1 && !Language.ItemDefinition_modelArchive.tryLoadFile(var4, 0)) {
				var5 = false;
			}

			return var5;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILgx;I)Ljm;",
		garbageValue = "2082315204"
	)
	public final ModelData method4838(int var1, PlayerCompositionColorTextureOverride var2) {
		int var3 = this.femaleHeadModel2;
		int var4 = this.field2466;
		if (var1 == 1) {
			var3 = this.field2467;
			var4 = this.field2468;
		}

		if (var2 != null && var2.method4254(var1)) {
			var3 = var2.method4248(var1);
		}

		if (var3 == -1) {
			return null;
		} else {
			ModelData var5 = ModelData.ModelData_get(Language.ItemDefinition_modelArchive, var3, 0);
			if (var4 != -1) {
				ModelData var6 = ModelData.ModelData_get(Language.ItemDefinition_modelArchive, var4, 0);
				ModelData[] var7 = new ModelData[]{var5, var6};
				var5 = new ModelData(var7, 2);
			}

			this.method4895(var5, var2);
			return var5;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljm;Lgx;I)V",
		garbageValue = "-2058229812"
	)
	void method4895(ModelData var1, PlayerCompositionColorTextureOverride var2) {
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2138103929"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return class108.method3518(this.params, var1, var2);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "80"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return Projectile.method2008(this.params, var1, var2);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1650304017"
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-642008539"
	)
	boolean method4843() {
		return this.recolorTo != null;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1574373470"
	)
	boolean method4844() {
		return this.retextureTo != null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lft;FFFFFFFFI)V",
		garbageValue = "707122614"
	)
	static void method4897(class139 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
		if (var0 != null) {
			float var9 = var4 - var1;
			if (0.0F != var9) {
				float var10 = var2 - var1;
				float var11 = var3 - var1;
				float[] var12 = new float[]{var10 / var9, var11 / var9};
				var0.field1660 = var12[0] == 0.33333334F && 0.6666667F == var12[1];
				float var13 = var12[0];
				float var14 = var12[1];
				if (var12[0] < 0.0F) {
					var12[0] = 0.0F;
				}

				if (var12[1] > 1.0F) {
					var12[1] = 1.0F;
				}

				float var15;
				if (var12[0] > 1.0F || var12[1] < -1.0F) {
					var12[1] = 1.0F - var12[1];
					if (var12[0] < 0.0F) {
						var12[0] = 0.0F;
					}

					if (var12[1] < 0.0F) {
						var12[1] = 0.0F;
					}

					if (var12[0] > 1.0F || var12[1] > 1.0F) {
						var15 = (var12[0] - 2.0F + var12[1]) * var12[0] + (var12[1] - 2.0F) * var12[1] + 1.0F;
						if (var15 + class135.field1605 > 0.0F) {
							InterfaceParent.method2181(var12);
						}
					}

					var12[1] = 1.0F - var12[1];
				}

				if (var12[0] != var13) {
					float var10000 = var1 + var12[0] * var9;
					if (var13 != 0.0F) {
						var6 = var5 + var12[0] * (var6 - var5) / var13;
					}
				}

				if (var14 != var12[1]) {
					var3 = var9 * var12[1] + var1;
					if (var14 != 1.0F) {
						var7 = var8 - (1.0F - var12[1]) * (var8 - var7) / (1.0F - var14);
					}
				}

				var0.field1654 = var1;
				var0.field1648 = var4;
				class142.method3886(0.0F, var12[0], var12[1], 1.0F, var0);
				var15 = var6 - var5;
				float var16 = var7 - var6;
				float var17 = var8 - var7;
				float var18 = var16 - var15;
				var0.field1663 = var17 - var16 - var18;
				var0.field1667 = var18 + var18 + var18;
				var0.field1661 = var15 + var15 + var15;
				var0.field1649 = var5;
			}
		}
	}

	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "(Lof;I)Ljava/lang/String;",
		garbageValue = "1761057055"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (LoginPacket.Widget_unpackTargetMask(class191.getWidgetFlags(var0)) == 0) {
			return null;
		} else {
			return var0.spellActionName != null && !var0.spellActionName.trim().isEmpty() ? var0.spellActionName : null;
		}
	}
}
