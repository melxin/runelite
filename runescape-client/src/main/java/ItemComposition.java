import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kv")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("ar")
	@Export("ItemDefinition_inMembersWorld")
	static boolean ItemDefinition_inMembersWorld;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("ItemDefinition_cached")
	public static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("ItemDefinition_cachedModels")
	public static EvictingDualNodeHashTable ItemDefinition_cachedModels;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("ItemDefinition_cachedSprites")
	public static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2019656833
	)
	@Export("id")
	int id;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1748937603
	)
	@Export("model")
	int model;
	@ObfuscatedName("ag")
	@Export("name")
	public String name;
	@ObfuscatedName("ai")
	@Export("examine")
	public String examine;
	@ObfuscatedName("ad")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("ah")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("az")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("at")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1678895625
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1629177451
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 703959945
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1393419345
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1556206059
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1053890977
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 226299109
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 80915929
	)
	@Export("price")
	public int price;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1294039511
	)
	@Export("maleModel")
	public int maleModel;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 874688619
	)
	@Export("maleModel1")
	public int maleModel1;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 499053879
	)
	@Export("maleModel2")
	public int maleModel2;
	@ObfuscatedName("bu")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("bc")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("bs")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("bx")
	@Export("subOps")
	public String[][] subOps;
	@ObfuscatedName("bj")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("bv")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -2130349613
	)
	@Export("note")
	public int note;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -295588255
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1184488661
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1121202269
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1726841927
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -320201771
	)
	@Export("ambient")
	public int ambient;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 824247275
	)
	@Export("contrast")
	public int contrast;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 616332695
	)
	@Export("team")
	public int team;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1678243603
	)
	public int field2926;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("ci")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 137702001
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 66013373
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 293019419
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 1648901351
	)
	@Export("placeholderTemplate")
	public int placeholderTemplate;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -1825629951
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 168824873
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -323384625
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -123452379
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 731594633
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -348317075
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 696561749
	)
	int field2978;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -2026254895
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1605082201
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 169092771
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -1814078541
	)
	int field2982;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 1277428903
	)
	int field2983;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 2107189581
	)
	int field2951;

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
		this.field2926 = 0;
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
		this.field2978 = 0;
		this.femaleModel2 = -1;
		this.femaleHeadModel = -1;
		this.femaleHeadModel2 = -1;
		this.field2982 = -1;
		this.field2983 = -1;
		this.field2951 = -1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("post")
	void post() {
		if (this.isStackable == 1) {
			this.field2926 = 0;
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lve;B)V",
		garbageValue = "87"
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
		descriptor = "(Lve;IB)V",
		garbageValue = "43"
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
			this.field2978 = var1.readUnsignedByte();
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
				this.field2926 = var1.readShort();
			} else if (var2 == 78) {
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) {
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 90) {
				this.femaleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 91) {
				this.field2983 = var1.readUnsignedShort();
			} else if (var2 == 92) {
				this.field2982 = var1.readUnsignedShort();
			} else if (var2 == 93) {
				this.field2951 = var1.readUnsignedShort();
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
				this.params = Projectile.readStringIntParameters(var1, this.params);
			}
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lkv;Lkv;I)V",
		garbageValue = "-154518479"
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
		descriptor = "(Lkv;Lkv;I)V",
		garbageValue = "516881398"
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
		this.field2982 = var2.field2982;
		this.field2983 = var2.field2983;
		this.field2951 = var2.field2951;
		this.team = var2.team;
		this.groundActions = var2.groundActions;
		this.field2926 = var2.field2926;
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lkv;Lkv;B)V",
		garbageValue = "0"
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lgz;",
		garbageValue = "711089319"
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
				return class231.ItemDefinition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(class166.ItemDefinition_modelArchive, this.model, 0);
		if (var4 == null) {
			return null;
		} else {
			if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
				var4.resize(this.resizeX, this.resizeY, this.resizeZ);
			}

			this.method5498(var4, (PlayerCompositionColorTextureOverride)null);
			return var4;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Lhe;",
		garbageValue = "-280445960"
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
				return class231.ItemDefinition_get(var2).getModel(1);
			}
		}

		Model var4 = (Model)ItemDefinition_cachedModels.get((long)this.id);
		if (var4 != null) {
			return var4;
		} else {
			ModelData var5 = ModelData.ModelData_get(class166.ItemDefinition_modelArchive, this.model, 0);
			if (var5 == null) {
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
					var5.resize(this.resizeX, this.resizeY, this.resizeZ);
				}

				this.method5498(var5, (PlayerCompositionColorTextureOverride)null);
				var4 = var5.toModel(this.ambient + 64, this.contrast * 5 + 768, -50, -10, -50);
				var4.isSingleTile = true;
				ItemDefinition_cachedModels.put(var4, (long)this.id);
				return var4;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lie;I)Lhe;",
		garbageValue = "-1841524650"
	)
	public final Model method5564(PlayerCompositionColorTextureOverride var1) {
		Model var2 = var1.field2533;
		if (var2 != null) {
			return var2;
		} else {
			ModelData var3 = ModelData.ModelData_get(class166.ItemDefinition_modelArchive, var1.field2540, 0);
			if (var3 == null) {
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
					var3.resize(this.resizeX, this.resizeY, this.resizeZ);
				}

				this.method5498(var3, var1);
				var2 = var3.toModel(this.ambient + 64, this.contrast * 5 + 768, -50, -10, -50);
				var2.isSingleTile = true;
				var1.field2533 = var2;
				return var2;
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lkv;",
		garbageValue = "132443886"
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
				return class231.ItemDefinition_get(var2);
			}
		}

		return this;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILie;B)Z",
		garbageValue = "-39"
	)
	public final boolean method5492(int var1, PlayerCompositionColorTextureOverride var2) {
		int var3 = this.femaleModel;
		int var4 = this.femaleModel1;
		int var5 = this.femaleModel2;
		if (var1 == 1) {
			var3 = this.maleHeadModel;
			var4 = this.maleHeadModel2;
			var5 = this.femaleHeadModel;
		}

		if (var2 != null && var2.method4986(var1)) {
			var3 = var2.method4988(var1);
		}

		if (var3 == -1) {
			return true;
		} else {
			boolean var6 = true;
			if (!class166.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var6 = false;
			}

			if (var4 != -1 && !class166.ItemDefinition_modelArchive.tryLoadFile(var4, 0)) {
				var6 = false;
			}

			if (var5 != -1 && !class166.ItemDefinition_modelArchive.tryLoadFile(var5, 0)) {
				var6 = false;
			}

			return var6;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILie;B)Lgz;",
		garbageValue = "-97"
	)
	public final ModelData method5501(int var1, PlayerCompositionColorTextureOverride var2) {
		int var3 = this.femaleModel;
		int var4 = this.femaleModel1;
		int var5 = this.femaleModel2;
		if (var1 == 1) {
			var3 = this.maleHeadModel;
			var4 = this.maleHeadModel2;
			var5 = this.femaleHeadModel;
		}

		if (var2 != null && var2.method4986(var1)) {
			var3 = var2.method4988(var1);
		}

		if (var3 == -1) {
			return null;
		} else {
			ModelData var6 = ModelData.ModelData_get(class166.ItemDefinition_modelArchive, var3, 0);
			if (var4 != -1) {
				ModelData var7 = ModelData.ModelData_get(class166.ItemDefinition_modelArchive, var4, 0);
				if (var5 != -1) {
					ModelData var8 = ModelData.ModelData_get(class166.ItemDefinition_modelArchive, var5, 0);
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

			if (var1 == 1 && this.field2978 != 0) {
				var6.changeOffset(0, this.field2978, 0);
			}

			this.method5498(var6, var2);
			return var6;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILie;B)Z",
		garbageValue = "-50"
	)
	public final boolean method5500(int var1, PlayerCompositionColorTextureOverride var2) {
		int var3 = this.femaleHeadModel2;
		int var4 = this.field2982;
		if (var1 == 1) {
			var3 = this.field2983;
			var4 = this.field2951;
		}

		if (var2 != null && var2.method4987(var1)) {
			var3 = var2.method4993(var1);
		}

		if (var3 == -1) {
			return true;
		} else {
			boolean var5 = true;
			if (!class166.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var5 = false;
			}

			if (var4 != -1 && !class166.ItemDefinition_modelArchive.tryLoadFile(var4, 0)) {
				var5 = false;
			}

			return var5;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILie;B)Lgz;",
		garbageValue = "0"
	)
	public final ModelData method5542(int var1, PlayerCompositionColorTextureOverride var2) {
		int var3 = this.femaleHeadModel2;
		int var4 = this.field2982;
		if (var1 == 1) {
			var3 = this.field2983;
			var4 = this.field2951;
		}

		if (var2 != null && var2.method4987(var1)) {
			var3 = var2.method4993(var1);
		}

		if (var3 == -1) {
			return null;
		} else {
			ModelData var5 = ModelData.ModelData_get(class166.ItemDefinition_modelArchive, var3, 0);
			if (var4 != -1) {
				ModelData var6 = ModelData.ModelData_get(class166.ItemDefinition_modelArchive, var4, 0);
				ModelData[] var7 = new ModelData[]{var5, var6};
				var5 = new ModelData(var7, 2);
			}

			this.method5498(var5, var2);
			return var5;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lgz;Lie;B)V",
		garbageValue = "103"
	)
	void method5498(ModelData var1, PlayerCompositionColorTextureOverride var2) {
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1963912650"
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-2138749273"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return SceneTilePaint.method4586(this.params, var1, var2);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1888429340"
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	boolean method5557() {
		return this.recolorTo != null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "749628820"
	)
	boolean method5549() {
		return this.retextureTo != null;
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIII)V",
		garbageValue = "677099023"
	)
	@Export("playSong")
	static void playSong(ArrayList var0, int var1, int var2, int var3, int var4) {
		if (!var0.isEmpty()) {
			int var5 = (Integer)var0.get(0);
			if (var5 == -1 && !Client.playingJingle) {
				MenuAction.method2254(0, 0);
			} else if (var5 != -1 && !class170.method3729(var5) && Renderable.clientPreferences.getMusicVolume() != 0) {
				ArrayList var6 = new ArrayList();

				for (int var7 = 0; var7 < var0.size(); ++var7) {
					var6.add(new MidiRequest(class133.field1576, (Integer)var0.get(var7), 0, Renderable.clientPreferences.getMusicVolume(), false));
				}

				if (Client.playingJingle) {
					UserComparator8.method3207(var6, var1, var2, var3, var4);
				} else {
					MouseHandler.method665(var6, var1, var2, var3, var4, false);
				}
			}

		}
	}
}
