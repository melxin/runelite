import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("km")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("ItemDefinition_cached")
	public static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("ItemDefinition_cachedModels")
	public static EvictingDualNodeHashTable ItemDefinition_cachedModels;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("ItemDefinition_cachedSprites")
	public static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -892737005
	)
	@Export("id")
	int id;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -2136818033
	)
	@Export("model")
	int model;
	@ObfuscatedName("al")
	@Export("name")
	public String name;
	@ObfuscatedName("av")
	@Export("examine")
	public String examine;
	@ObfuscatedName("ag")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("aw")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("ai")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("ar")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 119514159
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 276276175
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 799654401
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1071851413
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1952162727
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -767015285
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 553532525
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1439711833
	)
	@Export("price")
	public int price;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1905187571
	)
	@Export("maleModel")
	public int maleModel;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1125129175
	)
	@Export("maleModel1")
	public int maleModel1;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1417048927
	)
	@Export("maleModel2")
	public int maleModel2;
	@ObfuscatedName("bf")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("by")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("bm")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("bp")
	public String[][] field2872;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1741976857
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1049243131
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -109723523
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 2135044085
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -619364413
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1167900573
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 380180787
	)
	int field2847;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 474682293
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -973052635
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -441648217
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 706978655
	)
	int field2883;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 224115793
	)
	int field2884;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 1891834093
	)
	int field2885;
	@ObfuscatedName("cn")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("cc")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 324168927
	)
	@Export("note")
	public int note;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -2102002821
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -676025685
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -1065577369
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -1443180817
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 1763920749
	)
	@Export("ambient")
	public int ambient;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 1283640709
	)
	@Export("contrast")
	public int contrast;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 600104221
	)
	@Export("team")
	public int team;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 796033429
	)
	public int field2896;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lue;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("ci")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -1385069669
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 1482194655
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -181289213
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 1463720475
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
		this.field2872 = null;
		this.shiftClickIndex = -2;
		this.femaleModel = -1;
		this.femaleModel1 = -1;
		this.femaleOffset = 0;
		this.maleHeadModel = -1;
		this.maleHeadModel2 = -1;
		this.field2847 = 0;
		this.femaleModel2 = -1;
		this.femaleHeadModel = -1;
		this.femaleHeadModel2 = -1;
		this.field2883 = -1;
		this.field2884 = -1;
		this.field2885 = -1;
		this.note = -1;
		this.noteTemplate = -1;
		this.resizeX = 128;
		this.resizeY = 128;
		this.resizeZ = 128;
		this.ambient = 0;
		this.contrast = 0;
		this.team = 0;
		this.field2896 = 0;
		this.isTradable = false;
		this.unnotedId = -1;
		this.notedId = -1;
		this.placeholder = -1;
		this.placeholderTemplate = -1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "164105098"
	)
	@Export("post")
	void post() {
		if (this.isStackable == 1) {
			this.field2896 = 0;
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-625177235"
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
		garbageValue = "1710442107"
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
			this.field2847 = var1.readUnsignedByte();
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
				if (this.field2872 == null) {
					this.field2872 = new String[5][];
				}

				boolean var7 = var3 >= 0 && var3 < 5;
				if (var7 && this.field2872[var3] == null) {
					this.field2872[var3] = new String[20];
				}

				while (true) {
					int var5 = var1.readUnsignedByte() - 1;
					if (var5 == -1) {
						break;
					}

					String var6 = var1.readStringCp1252NullTerminated();
					if (var7 && var5 >= 0 && var5 < 20) {
						this.field2872[var3][var5] = var6;
					}
				}
			} else if (var2 == 65) {
				this.isTradable = true;
			} else if (var2 == 75) {
				this.field2896 = var1.readShort();
			} else if (var2 == 78) {
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) {
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 90) {
				this.femaleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 91) {
				this.field2884 = var1.readUnsignedShort();
			} else if (var2 == 92) {
				this.field2883 = var1.readUnsignedShort();
			} else if (var2 == 93) {
				this.field2885 = var1.readUnsignedShort();
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
				this.params = class1.readStringIntParameters(var1, this.params);
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lkm;Lkm;I)V",
		garbageValue = "-931912257"
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lkm;Lkm;S)V",
		garbageValue = "-5411"
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
		this.field2883 = var2.field2883;
		this.field2884 = var2.field2884;
		this.field2885 = var2.field2885;
		this.team = var2.team;
		this.groundActions = var2.groundActions;
		this.field2896 = var2.field2896;
		this.inventoryActions = new String[5];
		if (var2.inventoryActions != null) {
			for (int var3 = 0; var3 < 4; ++var3) {
				this.inventoryActions[var3] = var2.inventoryActions[var3];
			}
		}

		this.inventoryActions[4] = "Discard";
		if (var2.field2872 != null) {
			this.field2872 = new String[5][];
			System.arraycopy(var2.field2872, 0, this.field2872, 0, 4);
		} else {
			this.field2872 = null;
		}

		this.price = 0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lkm;Lkm;I)V",
		garbageValue = "786881847"
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lgx;",
		garbageValue = "-1768715510"
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
				return FaceNormal.ItemDefinition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(UrlRequester.ItemDefinition_modelArchive, this.model, 0);
		if (var4 == null) {
			return null;
		} else {
			if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
				var4.resize(this.resizeX, this.resizeY, this.resizeZ);
			}

			this.method5574(var4, (PlayerCompositionColorTextureOverride)null);
			return var4;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhv;",
		garbageValue = "-79"
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
				return FaceNormal.ItemDefinition_get(var2).getModel(1);
			}
		}

		Model var4 = (Model)ItemDefinition_cachedModels.get((long)this.id);
		if (var4 != null) {
			return var4;
		} else {
			ModelData var5 = ModelData.ModelData_get(UrlRequester.ItemDefinition_modelArchive, this.model, 0);
			if (var5 == null) {
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
					var5.resize(this.resizeX, this.resizeY, this.resizeZ);
				}

				this.method5574(var5, (PlayerCompositionColorTextureOverride)null);
				var4 = var5.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
				var4.isSingleTile = true;
				ItemDefinition_cachedModels.put(var4, (long)this.id);
				return var4;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lia;I)Lhv;",
		garbageValue = "-1284864010"
	)
	public final Model method5582(PlayerCompositionColorTextureOverride var1) {
		Model var2 = var1.field2483;
		if (var2 != null) {
			return var2;
		} else {
			ModelData var3 = ModelData.ModelData_get(UrlRequester.ItemDefinition_modelArchive, var1.field2474, 0);
			if (var3 == null) {
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
					var3.resize(this.resizeX, this.resizeY, this.resizeZ);
				}

				this.method5574(var3, var1);
				var2 = var3.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
				var2.isSingleTile = true;
				var1.field2483 = var2;
				return var2;
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Lkm;",
		garbageValue = "-100301827"
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
				return FaceNormal.ItemDefinition_get(var2);
			}
		}

		return this;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILia;I)Z",
		garbageValue = "403119401"
	)
	public final boolean method5571(int var1, PlayerCompositionColorTextureOverride var2) {
		int var3 = this.femaleModel;
		int var4 = this.femaleModel1;
		int var5 = this.femaleModel2;
		if (var1 == 1) {
			var3 = this.maleHeadModel;
			var4 = this.maleHeadModel2;
			var5 = this.femaleHeadModel;
		}

		if (var2 != null && var2.method5083(var1)) {
			var3 = var2.method5099(var1);
		}

		if (var3 == -1) {
			return true;
		} else {
			boolean var6 = true;
			if (!UrlRequester.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var6 = false;
			}

			if (var4 != -1 && !UrlRequester.ItemDefinition_modelArchive.tryLoadFile(var4, 0)) {
				var6 = false;
			}

			if (var5 != -1 && !UrlRequester.ItemDefinition_modelArchive.tryLoadFile(var5, 0)) {
				var6 = false;
			}

			return var6;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILia;I)Lgx;",
		garbageValue = "811824866"
	)
	public final ModelData method5572(int var1, PlayerCompositionColorTextureOverride var2) {
		int var3 = this.femaleModel;
		int var4 = this.femaleModel1;
		int var5 = this.femaleModel2;
		if (var1 == 1) {
			var3 = this.maleHeadModel;
			var4 = this.maleHeadModel2;
			var5 = this.femaleHeadModel;
		}

		if (var2 != null && var2.method5083(var1)) {
			var3 = var2.method5099(var1);
		}

		if (var3 == -1) {
			return null;
		} else {
			ModelData var6 = ModelData.ModelData_get(UrlRequester.ItemDefinition_modelArchive, var3, 0);
			if (var4 != -1) {
				ModelData var7 = ModelData.ModelData_get(UrlRequester.ItemDefinition_modelArchive, var4, 0);
				if (var5 != -1) {
					ModelData var8 = ModelData.ModelData_get(UrlRequester.ItemDefinition_modelArchive, var5, 0);
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

			if (var1 == 1 && this.field2847 != 0) {
				var6.changeOffset(0, this.field2847, 0);
			}

			this.method5574(var6, var2);
			return var6;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILia;B)Z",
		garbageValue = "42"
	)
	public final boolean method5630(int var1, PlayerCompositionColorTextureOverride var2) {
		int var3 = this.femaleHeadModel2;
		int var4 = this.field2883;
		if (var1 == 1) {
			var3 = this.field2884;
			var4 = this.field2885;
		}

		if (var2 != null && var2.method5084(var1)) {
			var3 = var2.method5080(var1);
		}

		if (var3 == -1) {
			return true;
		} else {
			boolean var5 = true;
			if (!UrlRequester.ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var5 = false;
			}

			if (var4 != -1 && !UrlRequester.ItemDefinition_modelArchive.tryLoadFile(var4, 0)) {
				var5 = false;
			}

			return var5;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILia;I)Lgx;",
		garbageValue = "1783399362"
	)
	public final ModelData method5573(int var1, PlayerCompositionColorTextureOverride var2) {
		int var3 = this.femaleHeadModel2;
		int var4 = this.field2883;
		if (var1 == 1) {
			var3 = this.field2884;
			var4 = this.field2885;
		}

		if (var2 != null && var2.method5084(var1)) {
			var3 = var2.method5080(var1);
		}

		if (var3 == -1) {
			return null;
		} else {
			ModelData var5 = ModelData.ModelData_get(UrlRequester.ItemDefinition_modelArchive, var3, 0);
			if (var4 != -1) {
				ModelData var6 = ModelData.ModelData_get(UrlRequester.ItemDefinition_modelArchive, var4, 0);
				ModelData[] var7 = new ModelData[]{var5, var6};
				var5 = new ModelData(var7, 2);
			}

			this.method5574(var5, var2);
			return var5;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lgx;Lia;B)V",
		garbageValue = "16"
	)
	void method5574(ModelData var1, PlayerCompositionColorTextureOverride var2) {
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1636243841"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return Canvas.method336(this.params, var1, var2);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "181061069"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class47.method906(this.params, var1, var2);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "69"
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1865588074"
	)
	boolean method5611() {
		return this.recolorTo != null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "101"
	)
	boolean method5579() {
		return this.retextureTo != null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([BZS)Ljava/lang/Object;",
		garbageValue = "-20607"
	)
	public static Object method5587(byte[] var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0.length > 136) {
			DirectByteArrayCopier var2 = new DirectByteArrayCopier();
			var2.set(var0);
			return var2;
		} else {
			return var0;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-62"
	)
	public static int method5643(int var0) {
		return class331.field3612[var0];
	}
}
