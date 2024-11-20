import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
@Implements("ItemComposition")
public class ItemComposition extends DualNode {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("ItemDefinition_modelArchive")
	static AbstractArchive ItemDefinition_modelArchive;
	@ObfuscatedName("au")
	@Export("ItemDefinition_inMembersWorld")
	public static boolean ItemDefinition_inMembersWorld;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("ItemDefinition_cached")
	public static EvictingDualNodeHashTable ItemDefinition_cached;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("ItemDefinition_cachedModels")
	public static EvictingDualNodeHashTable ItemDefinition_cachedModels;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("ItemDefinition_cachedSprites")
	public static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 905113151
	)
	@Export("id")
	int id;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 272219669
	)
	@Export("model")
	int model;
	@ObfuscatedName("ak")
	@Export("name")
	public String name;
	@ObfuscatedName("ap")
	@Export("examine")
	public String examine;
	@ObfuscatedName("ah")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("ad")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("ay")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("ax")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 517714909
	)
	@Export("zoom2d")
	public int zoom2d;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1964260707
	)
	@Export("xan2d")
	public int xan2d;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1632674509
	)
	@Export("yan2d")
	public int yan2d;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 287308305
	)
	@Export("zan2d")
	public int zan2d;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 468781167
	)
	@Export("offsetX2d")
	public int offsetX2d;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1882461509
	)
	@Export("offsetY2d")
	public int offsetY2d;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1207474331
	)
	@Export("isStackable")
	public int isStackable;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 502078605
	)
	@Export("price")
	public int price;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 644986737
	)
	@Export("maleModel")
	public int maleModel;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1723171981
	)
	@Export("maleModel1")
	public int maleModel1;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 323790609
	)
	@Export("maleModel2")
	public int maleModel2;
	@ObfuscatedName("bu")
	@Export("isMembersOnly")
	public boolean isMembersOnly;
	@ObfuscatedName("bj")
	@Export("groundActions")
	public String[] groundActions;
	@ObfuscatedName("bh")
	@Export("inventoryActions")
	public String[] inventoryActions;
	@ObfuscatedName("bg")
	public String[][] field2249;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -650555239
	)
	@Export("shiftClickIndex")
	int shiftClickIndex;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -2129959797
	)
	@Export("femaleModel")
	int femaleModel;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1230836801
	)
	@Export("femaleModel1")
	int femaleModel1;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -186898483
	)
	@Export("femaleOffset")
	int femaleOffset;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1437848463
	)
	@Export("maleHeadModel")
	int maleHeadModel;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1919001565
	)
	@Export("maleHeadModel2")
	int maleHeadModel2;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -339792757
	)
	int field2251;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 880627893
	)
	@Export("femaleModel2")
	int femaleModel2;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 358483399
	)
	@Export("femaleHeadModel")
	int femaleHeadModel;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 721070835
	)
	@Export("femaleHeadModel2")
	int femaleHeadModel2;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1694369837
	)
	int field2260;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 614678487
	)
	int field2248;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -145746605
	)
	int field2219;
	@ObfuscatedName("ct")
	@Export("countobj")
	int[] countobj;
	@ObfuscatedName("cy")
	@Export("countco")
	int[] countco;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -1380384149
	)
	@Export("note")
	public int note;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -1084077123
	)
	@Export("noteTemplate")
	public int noteTemplate;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -953196601
	)
	@Export("resizeX")
	int resizeX;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 1438969225
	)
	@Export("resizeY")
	int resizeY;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 1533492585
	)
	@Export("resizeZ")
	int resizeZ;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -1534104969
	)
	@Export("ambient")
	public int ambient;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 2045721975
	)
	@Export("contrast")
	public int contrast;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 1057006099
	)
	@Export("team")
	public int team;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 294226919
	)
	public int field2265;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("cb")
	@Export("isTradable")
	public boolean isTradable;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 2041964313
	)
	@Export("unnotedId")
	int unnotedId;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -110163717
	)
	@Export("notedId")
	int notedId;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 872768183
	)
	@Export("placeholder")
	public int placeholder;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -2109081323
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
		this.field2249 = null;
		this.shiftClickIndex = -2;
		this.femaleModel = -1;
		this.femaleModel1 = -1;
		this.femaleOffset = 0;
		this.maleHeadModel = -1;
		this.maleHeadModel2 = -1;
		this.field2251 = 0;
		this.femaleModel2 = -1;
		this.femaleHeadModel = -1;
		this.femaleHeadModel2 = -1;
		this.field2260 = -1;
		this.field2248 = -1;
		this.field2219 = -1;
		this.note = -1;
		this.noteTemplate = -1;
		this.resizeX = 128;
		this.resizeY = 128;
		this.resizeZ = 128;
		this.ambient = 0;
		this.contrast = 0;
		this.team = 0;
		this.field2265 = 0;
		this.isTradable = false;
		this.unnotedId = -1;
		this.notedId = -1;
		this.placeholder = -1;
		this.placeholderTemplate = -1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "6"
	)
	@Export("post")
	void post() {
		if (this.isStackable == 1) {
			this.field2265 = 0;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvj;I)V",
		garbageValue = "-775829103"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvj;IB)V",
		garbageValue = "15"
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
			this.field2251 = var1.readUnsignedByte();
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
				if (this.field2249 == null) {
					this.field2249 = new String[5][];
				}

				boolean var7 = var3 >= 0 && var3 < 5;
				if (var7 && this.field2249[var3] == null) {
					this.field2249[var3] = new String[20];
				}

				while (true) {
					int var5 = var1.readUnsignedByte() - 1;
					if (var5 == -1) {
						break;
					}

					String var6 = var1.readStringCp1252NullTerminated();
					if (var7 && var5 >= 0 && var5 < 20) {
						this.field2249[var3][var5] = var6;
					}
				}
			} else if (var2 == 65) {
				this.isTradable = true;
			} else if (var2 == 75) {
				this.field2265 = var1.readShort();
			} else if (var2 == 78) {
				this.femaleModel2 = var1.readUnsignedShort();
			} else if (var2 == 79) {
				this.femaleHeadModel = var1.readUnsignedShort();
			} else if (var2 == 90) {
				this.femaleHeadModel2 = var1.readUnsignedShort();
			} else if (var2 == 91) {
				this.field2248 = var1.readUnsignedShort();
			} else if (var2 == 92) {
				this.field2260 = var1.readUnsignedShort();
			} else if (var2 == 93) {
				this.field2219 = var1.readUnsignedShort();
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
				this.params = class28.readStringIntParameters(var1, this.params);
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Liq;Liq;I)V",
		garbageValue = "-1643168916"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Liq;Liq;I)V",
		garbageValue = "-1433231486"
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
		this.field2260 = var2.field2260;
		this.field2248 = var2.field2248;
		this.field2219 = var2.field2219;
		this.team = var2.team;
		this.groundActions = var2.groundActions;
		this.field2265 = var2.field2265;
		this.inventoryActions = new String[5];
		if (var2.inventoryActions != null) {
			for (int var3 = 0; var3 < 4; ++var3) {
				this.inventoryActions[var3] = var2.inventoryActions[var3];
			}
		}

		this.inventoryActions[4] = "Discard";
		if (var2.field2249 != null) {
			this.field2249 = new String[5][];
			System.arraycopy(var2.field2249, 0, this.field2249, 0, 4);
		} else {
			this.field2249 = null;
		}

		this.price = 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Liq;Liq;I)V",
		garbageValue = "-2055621650"
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
		descriptor = "(IB)Ljb;",
		garbageValue = "0"
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
				return WorldEntityCoord.ItemDefinition_get(var2).getModelData(1);
			}
		}

		ModelData var4 = ModelData.ModelData_get(ItemDefinition_modelArchive, this.model, 0);
		if (var4 == null) {
			return null;
		} else {
			if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
				var4.resize(this.resizeX, this.resizeY, this.resizeZ);
			}

			this.method4168(var4, (PlayerCompositionColorTextureOverride)null);
			return var4;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljt;",
		garbageValue = "-55"
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
				return WorldEntityCoord.ItemDefinition_get(var2).getModel(1);
			}
		}

		Model var4 = (Model)ItemDefinition_cachedModels.get((long)this.id);
		if (var4 != null) {
			return var4;
		} else {
			ModelData var5 = ModelData.ModelData_get(ItemDefinition_modelArchive, this.model, 0);
			if (var5 == null) {
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
					var5.resize(this.resizeX, this.resizeY, this.resizeZ);
				}

				this.method4168(var5, (PlayerCompositionColorTextureOverride)null);
				var4 = var5.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
				var4.isSingleTile = true;
				ItemDefinition_cachedModels.put(var4, (long)this.id);
				return var4;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lgk;S)Ljt;",
		garbageValue = "8226"
	)
	public final Model method4167(PlayerCompositionColorTextureOverride var1) {
		Model var2 = var1.field1843;
		if (var2 != null) {
			return var2;
		} else {
			ModelData var3 = ModelData.ModelData_get(ItemDefinition_modelArchive, var1.field1832, 0);
			if (var3 == null) {
				return null;
			} else {
				if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
					var3.resize(this.resizeX, this.resizeY, this.resizeZ);
				}

				this.method4168(var3, var1);
				var2 = var3.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
				var2.isSingleTile = true;
				var1.field1843 = var2;
				return var2;
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)Liq;",
		garbageValue = "56"
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
				return WorldEntityCoord.ItemDefinition_get(var2);
			}
		}

		return this;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILgk;B)Z",
		garbageValue = "0"
	)
	public final boolean method4197(int var1, PlayerCompositionColorTextureOverride var2) {
		int var3 = this.femaleModel;
		int var4 = this.femaleModel1;
		int var5 = this.femaleModel2;
		if (var1 == 1) {
			var3 = this.maleHeadModel;
			var4 = this.maleHeadModel2;
			var5 = this.femaleHeadModel;
		}

		if (var2 != null && var2.method3703(var1)) {
			var3 = var2.method3705(var1);
		}

		if (var3 == -1) {
			return true;
		} else {
			boolean var6 = true;
			if (!ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var6 = false;
			}

			if (var4 != -1 && !ItemDefinition_modelArchive.tryLoadFile(var4, 0)) {
				var6 = false;
			}

			if (var5 != -1 && !ItemDefinition_modelArchive.tryLoadFile(var5, 0)) {
				var6 = false;
			}

			return var6;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILgk;S)Ljb;",
		garbageValue = "-1542"
	)
	public final ModelData method4161(int var1, PlayerCompositionColorTextureOverride var2) {
		int var3 = this.femaleModel;
		int var4 = this.femaleModel1;
		int var5 = this.femaleModel2;
		if (var1 == 1) {
			var3 = this.maleHeadModel;
			var4 = this.maleHeadModel2;
			var5 = this.femaleHeadModel;
		}

		if (var2 != null && var2.method3703(var1)) {
			var3 = var2.method3705(var1);
		}

		if (var3 == -1) {
			return null;
		} else {
			ModelData var6 = ModelData.ModelData_get(ItemDefinition_modelArchive, var3, 0);
			if (var4 != -1) {
				ModelData var7 = ModelData.ModelData_get(ItemDefinition_modelArchive, var4, 0);
				if (var5 != -1) {
					ModelData var8 = ModelData.ModelData_get(ItemDefinition_modelArchive, var5, 0);
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

			if (var1 == 1 && this.field2251 != 0) {
				var6.changeOffset(0, this.field2251, 0);
			}

			this.method4168(var6, var2);
			return var6;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILgk;I)Z",
		garbageValue = "1010460937"
	)
	public final boolean method4166(int var1, PlayerCompositionColorTextureOverride var2) {
		int var3 = this.femaleHeadModel2;
		int var4 = this.field2260;
		if (var1 == 1) {
			var3 = this.field2248;
			var4 = this.field2219;
		}

		if (var2 != null && var2.method3706(var1)) {
			var3 = var2.method3707(var1);
		}

		if (var3 == -1) {
			return true;
		} else {
			boolean var5 = true;
			if (!ItemDefinition_modelArchive.tryLoadFile(var3, 0)) {
				var5 = false;
			}

			if (var4 != -1 && !ItemDefinition_modelArchive.tryLoadFile(var4, 0)) {
				var5 = false;
			}

			return var5;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILgk;I)Ljb;",
		garbageValue = "-1232865641"
	)
	public final ModelData method4164(int var1, PlayerCompositionColorTextureOverride var2) {
		int var3 = this.femaleHeadModel2;
		int var4 = this.field2260;
		if (var1 == 1) {
			var3 = this.field2248;
			var4 = this.field2219;
		}

		if (var2 != null && var2.method3706(var1)) {
			var3 = var2.method3707(var1);
		}

		if (var3 == -1) {
			return null;
		} else {
			ModelData var5 = ModelData.ModelData_get(ItemDefinition_modelArchive, var3, 0);
			if (var4 != -1) {
				ModelData var6 = ModelData.ModelData_get(ItemDefinition_modelArchive, var4, 0);
				ModelData[] var7 = new ModelData[]{var5, var6};
				var5 = new ModelData(var7, 2);
			}

			this.method4168(var5, var2);
			return var5;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljb;Lgk;B)V",
		garbageValue = "-43"
	)
	void method4168(ModelData var1, PlayerCompositionColorTextureOverride var2) {
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
		descriptor = "(IIS)I",
		garbageValue = "2048"
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
		garbageValue = "-492024998"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return AsyncRestClient.method162(this.params, var1, var2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1763791797"
	)
	boolean method4172() {
		return this.recolorTo != null;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "94474061"
	)
	boolean method4173() {
		return this.retextureTo != null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lvm;",
		garbageValue = "1457230606"
	)
	@Export("getDbTableType")
	public static DbTableType getDbTableType(int var0) {
		DbTableType var1 = (DbTableType)DbTableType.DBTableType_cache.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DbTableType.field5405.takeFile(39, var0);
			var1 = new DbTableType();
			if (var2 != null) {
				var1.method9992(new Buffer(var2));
			}

			var1.method9982();
			DbTableType.DBTableType_cache.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;Ljava/io/File;I)V",
		garbageValue = "-992019553"
	)
	static void method4193(File var0, File var1) {
		try {
			AccessFile var2 = new AccessFile(class141.field1631, "rw", 10000L);
			Buffer var3 = new Buffer(500);
			var3.writeByte(3);
			var3.writeByte(var1 != null ? 1 : 0);
			var3.writeCESU8(var0.getPath());
			if (var1 != null) {
				var3.writeCESU8("");
			}

			var2.write(var3.array, 0, var3.offset);
			var2.close();
		} catch (IOException var4) {
			var4.printStackTrace();
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lnp;IIIB)V",
		garbageValue = "-63"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3943 == null) {
			throw new RuntimeException();
		} else {
			var0.field3943[var1] = var2;
			var0.field3944[var1] = var3;
		}
	}
}
