import java.awt.Image;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
@Implements("NPCComposition")
public class NPCComposition extends DualNode {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	static AbstractArchive field2140;
	@ObfuscatedName("aw")
	static Image field2141;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("NpcDefinition_cached")
	public static EvictingDualNodeHashTable NpcDefinition_cached;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("NpcDefinition_cachedModels")
	public static EvictingDualNodeHashTable NpcDefinition_cachedModels;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -1897471001
	)
	@Export("id")
	public int id;
	@ObfuscatedName("cy")
	@Export("name")
	public String name;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -1943802719
	)
	@Export("size")
	public int size;
	@ObfuscatedName("ce")
	@Export("models")
	int[] models;
	@ObfuscatedName("cl")
	@Export("chatHeadModels")
	int[] chatHeadModels;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -263565311
	)
	@Export("idleSequence")
	public int idleSequence;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 1728806089
	)
	@Export("turnLeftSequence")
	public int turnLeftSequence;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 1354422131
	)
	@Export("turnRightSequence")
	public int turnRightSequence;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -2091605201
	)
	@Export("walkSequence")
	public int walkSequence;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 1886244265
	)
	@Export("walkBackSequence")
	public int walkBackSequence;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 195509013
	)
	@Export("walkLeftSequence")
	public int walkLeftSequence;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -1664901403
	)
	@Export("walkRightSequence")
	public int walkRightSequence;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 210491859
	)
	public int field2106;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -1497670805
	)
	public int field2107;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 581308827
	)
	public int field2108;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -1439575813
	)
	public int field2138;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 1277060029
	)
	public int field2110;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 940129235
	)
	public int field2111;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1735478467
	)
	public int field2112;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 150006539
	)
	public int field2104;
	@ObfuscatedName("cr")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("cc")
	@Export("recolorTo")
	public short[] recolorTo;
	@ObfuscatedName("cd")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("cm")
	public short[] field2117;
	@ObfuscatedName("co")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("cg")
	@Export("drawMapDot")
	public boolean drawMapDot;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -560977649
	)
	@Export("combatLevel")
	public int combatLevel;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -371590677
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -1054854113
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = 1972664739
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -937508631
	)
	int field2125;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = 1882008991
	)
	@Export("rotation")
	public int rotation;
	@ObfuscatedName("dg")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -1254643411
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 1446169899
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("dy")
	@Export("isInteractable")
	public boolean isInteractable;
	@ObfuscatedName("dn")
	@Export("isClipped")
	public boolean isClipped;
	@ObfuscatedName("dh")
	@Export("isFollower")
	public boolean isFollower;
	@ObfuscatedName("dc")
	@Export("lowPriorityFollowerOps")
	public boolean lowPriorityFollowerOps;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 567993521
	)
	public int field2133;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	@Export("params")
	IterableNodeHashTable params;
	@ObfuscatedName("db")
	@Export("stats")
	int[] stats;
	@ObfuscatedName("de")
	@Export("headIconArchiveIds")
	int[] headIconArchiveIds;
	@ObfuscatedName("dj")
	@Export("headIconSpriteIndex")
	short[] headIconSpriteIndex;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = -1874870359
	)
	@Export("footprintSize")
	int footprintSize;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Lhy;"
	)
	public class196 field2100;

	static {
		NpcDefinition_cached = new EvictingDualNodeHashTable(64);
		NpcDefinition_cachedModels = new EvictingDualNodeHashTable(50);
	}

	NPCComposition() {
		this.name = "null";
		this.size = 1;
		this.idleSequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.field2106 = -1;
		this.field2107 = -1;
		this.field2108 = -1;
		this.field2138 = -1;
		this.field2110 = -1;
		this.field2111 = -1;
		this.field2112 = -1;
		this.field2104 = -1;
		this.actions = new String[5];
		this.drawMapDot = true;
		this.combatLevel = -1;
		this.widthScale = 128;
		this.heightScale = 128;
		this.ambient = 0;
		this.field2125 = 0;
		this.rotation = 32;
		this.transformVarbit = -1;
		this.transformVarp = -1;
		this.isInteractable = true;
		this.isClipped = true;
		this.isFollower = false;
		this.lowPriorityFollowerOps = false;
		this.field2133 = -1;
		this.stats = new int[]{1, 1, 1, 1, 1, 1};
		this.headIconArchiveIds = null;
		this.headIconSpriteIndex = null;
		this.footprintSize = -1;
		this.field2100 = class196.field2147;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.footprintSize == -1) {
			this.footprintSize = (int)((float)(this.size * 128) * 0.4F);
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lwj;B)V",
		garbageValue = "-38"
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
		descriptor = "(Lwj;II)V",
		garbageValue = "1334322608"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		int var5;
		switch(var2) {
		case 1:
			var3 = var1.readUnsignedByte();
			this.models = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.models[var4] = var1.readUnsignedShort();
			}

			return;
		case 2:
			this.name = var1.readStringCp1252NullTerminated();
			break;
		case 12:
			this.size = var1.readUnsignedByte();
			break;
		case 13:
			this.idleSequence = var1.readUnsignedShort();
			break;
		case 14:
			this.walkSequence = var1.readUnsignedShort();
			break;
		case 15:
			this.turnLeftSequence = var1.readUnsignedShort();
			break;
		case 16:
			this.turnRightSequence = var1.readUnsignedShort();
			break;
		case 17:
			this.walkSequence = var1.readUnsignedShort();
			this.walkBackSequence = var1.readUnsignedShort();
			this.walkLeftSequence = var1.readUnsignedShort();
			this.walkRightSequence = var1.readUnsignedShort();
			break;
		case 18:
			var1.readUnsignedShort();
			break;
		case 30:
		case 31:
		case 32:
		case 33:
		case 34:
			this.actions[var2 - 30] = var1.readStringCp1252NullTerminated();
			if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) {
				this.actions[var2 - 30] = null;
			}
			break;
		case 40:
			var3 = var1.readUnsignedByte();
			this.recolorFrom = new short[var3];
			this.recolorTo = new short[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.recolorFrom[var4] = (short)var1.readUnsignedShort();
				this.recolorTo[var4] = (short)var1.readUnsignedShort();
			}

			return;
		case 41:
			var3 = var1.readUnsignedByte();
			this.retextureFrom = new short[var3];
			this.field2117 = new short[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.retextureFrom[var4] = (short)var1.readUnsignedShort();
				this.field2117[var4] = (short)var1.readUnsignedShort();
			}

			return;
		case 60:
			var3 = var1.readUnsignedByte();
			this.chatHeadModels = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.chatHeadModels[var4] = var1.readUnsignedShort();
			}

			return;
		case 74:
			this.stats[0] = var1.readUnsignedShort();
			break;
		case 75:
			this.stats[1] = var1.readUnsignedShort();
			break;
		case 76:
			this.stats[2] = var1.readUnsignedShort();
			break;
		case 77:
			this.stats[3] = var1.readUnsignedShort();
			break;
		case 78:
			this.stats[4] = var1.readUnsignedShort();
			break;
		case 79:
			this.stats[5] = var1.readUnsignedShort();
			break;
		case 93:
			this.drawMapDot = false;
			break;
		case 95:
			this.combatLevel = var1.readUnsignedShort();
			break;
		case 97:
			this.widthScale = var1.readUnsignedShort();
			break;
		case 98:
			this.heightScale = var1.readUnsignedShort();
			break;
		case 99:
			this.field2100 = class196.field2146;
			break;
		case 100:
			this.ambient = var1.readByte();
			break;
		case 101:
			this.field2125 = var1.readByte();
			break;
		case 102:
			var3 = var1.readUnsignedByte();
			var4 = 0;

			for (var5 = var3; var5 != 0; var5 >>= 1) {
				++var4;
			}

			this.headIconArchiveIds = new int[var4];
			this.headIconSpriteIndex = new short[var4];

			for (int var6 = 0; var6 < var4; ++var6) {
				if ((var3 & 1 << var6) == 0) {
					this.headIconArchiveIds[var6] = -1;
					this.headIconSpriteIndex[var6] = -1;
				} else {
					this.headIconArchiveIds[var6] = var1.readNullableLargeSmart();
					this.headIconSpriteIndex[var6] = (short)var1.readShortSmartSub();
				}
			}

			return;
		case 103:
			this.rotation = var1.readUnsignedShort();
			break;
		case 106:
		case 118:
			this.transformVarbit = var1.readUnsignedShort();
			if (this.transformVarbit == 65535) {
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort();
			if (this.transformVarp == 65535) {
				this.transformVarp = -1;
			}

			var3 = -1;
			if (var2 == 118) {
				var3 = var1.readUnsignedShort();
				if (var3 == 65535) {
					var3 = -1;
				}
			}

			var4 = var1.readUnsignedByte();
			this.transforms = new int[var4 + 2];

			for (var5 = 0; var5 <= var4; ++var5) {
				this.transforms[var5] = var1.readUnsignedShort();
				if (this.transforms[var5] == 65535) {
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3;
			break;
		case 107:
			this.isInteractable = false;
			break;
		case 109:
			this.isClipped = false;
			break;
		case 111:
			this.field2100 = class196.field2151;
			break;
		case 114:
			this.field2106 = var1.readUnsignedShort();
			break;
		case 115:
			this.field2106 = var1.readUnsignedShort();
			this.field2107 = var1.readUnsignedShort();
			this.field2108 = var1.readUnsignedShort();
			this.field2138 = var1.readUnsignedShort();
			break;
		case 116:
			this.field2110 = var1.readUnsignedShort();
			break;
		case 117:
			this.field2110 = var1.readUnsignedShort();
			this.field2111 = var1.readUnsignedShort();
			this.field2112 = var1.readUnsignedShort();
			this.field2104 = var1.readUnsignedShort();
			break;
		case 122:
			this.isFollower = true;
			break;
		case 123:
			this.lowPriorityFollowerOps = true;
			break;
		case 124:
			this.field2133 = var1.readUnsignedShort();
			break;
		case 126:
			this.footprintSize = var1.readUnsignedShort();
			break;
		case 249:
			this.params = Canvas.readStringIntParameters(var1, this.params);
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lit;ILit;ILhk;I)Ljd;",
		garbageValue = "-2026388894"
	)
	@Export("getModel")
	public final Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, NpcOverrides var5) {
		if (this.transforms != null) {
			NPCComposition var10 = this.transform();
			return var10 == null ? null : var10.getModel(var1, var2, var3, var4, var5);
		} else {
			long var6 = (long)this.id;
			if (var5 != null) {
				var6 |= var5.field2078 << 16;
			}

			Model var8 = (Model)NpcDefinition_cachedModels.get(var6);
			if (var8 == null) {
				ModelData var9 = this.getModelData(this.models, var5);
				if (var9 == null) {
					return null;
				}

				var8 = var9.toModel(this.ambient + 64, this.field2125 * 5 + 850, -30, -50, -30);
				NpcDefinition_cachedModels.put(var8, var6);
			}

			Model var11;
			if (var1 != null && var3 != null) {
				var11 = var1.applyTransformations(var8, var2, var3, var4);
			} else if (var1 != null) {
				var11 = var1.transformActorModel(var8, var2);
			} else if (var3 != null) {
				var11 = var3.transformActorModel(var8, var4);
			} else {
				var11 = var8.toSharedSequenceModel(true);
			}

			if (this.widthScale != 128 || this.heightScale != 128) {
				var11.scale(this.widthScale, this.heightScale, this.widthScale);
			}

			return var11;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lhk;B)Lib;",
		garbageValue = "-67"
	)
	public final ModelData method4385(NpcOverrides var1) {
		if (this.transforms != null) {
			NPCComposition var2 = this.transform();
			return var2 == null ? null : var2.method4385(var1);
		} else {
			return this.getModelData(this.chatHeadModels, var1);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([ILhk;B)Lib;",
		garbageValue = "-14"
	)
	@Export("getModelData")
	ModelData getModelData(int[] var1, NpcOverrides var2) {
		int[] var3 = var1;
		if (var2 != null && var2.modelIds != null) {
			var3 = var2.modelIds;
		}

		if (var3 == null) {
			return null;
		} else {
			boolean var4 = false;

			for (int var5 = 0; var5 < var3.length; ++var5) {
				if (var3[var5] != -1 && !field2140.tryLoadFile(var3[var5], 0)) {
					var4 = true;
				}
			}

			if (var4) {
				return null;
			} else {
				ModelData[] var9 = new ModelData[var3.length];

				for (int var6 = 0; var6 < var3.length; ++var6) {
					var9[var6] = ModelData.ModelData_get(field2140, var3[var6], 0);
				}

				ModelData var10;
				if (var9.length == 1) {
					var10 = var9[0];
					if (var10 == null) {
						var10 = new ModelData(var9, var9.length);
					}
				} else {
					var10 = new ModelData(var9, var9.length);
				}

				short[] var7;
				int var8;
				if (this.recolorFrom != null) {
					var7 = this.recolorTo;
					if (var2 != null && var2.recolorTo != null) {
						var7 = var2.recolorTo;
					}

					for (var8 = 0; var8 < this.recolorFrom.length; ++var8) {
						var10.recolor(this.recolorFrom[var8], var7[var8]);
					}
				}

				if (this.retextureFrom != null) {
					var7 = this.field2117;
					if (var2 != null && var2.retextureTo != null) {
						var7 = var2.retextureTo;
					}

					for (var8 = 0; var8 < this.retextureFrom.length; ++var8) {
						var10.retexture(this.retextureFrom[var8], var7[var8]);
					}
				}

				return var10;
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Lhr;",
		garbageValue = "-79"
	)
	@Export("transform")
	public final NPCComposition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = MenuAction.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class81.getNpcDefinition(var2) : null;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-27"
	)
	@Export("transformIsVisible")
	public boolean transformIsVisible() {
		if (this.transforms == null) {
			return true;
		} else {
			int var1 = -1;
			if (this.transformVarbit != -1) {
				var1 = MenuAction.getVarbit(this.transformVarbit);
			} else if (this.transformVarp != -1) {
				var1 = Varps.Varps_main[this.transformVarp];
			}

			if (var1 >= 0 && var1 < this.transforms.length) {
				return this.transforms[var1] != -1;
			} else {
				return this.transforms[this.transforms.length - 1] != -1;
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "1"
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
		descriptor = "(ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-1"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class85.method2923(this.params, var1, var2);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-996692204"
	)
	public boolean method4391() {
		return this.headIconArchiveIds != null && this.headIconSpriteIndex != null;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "72078111"
	)
	public int[] method4392() {
		return this.headIconArchiveIds;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-12"
	)
	public int method4393(int var1) {
		return this.headIconArchiveIds != null && var1 < this.headIconArchiveIds.length ? this.headIconArchiveIds[var1] : -1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "2100267571"
	)
	public short[] method4394() {
		return this.headIconSpriteIndex;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)S",
		garbageValue = "-8"
	)
	public short method4395(int var1) {
		return this.headIconSpriteIndex != null && var1 < this.headIconSpriteIndex.length ? this.headIconSpriteIndex[var1] : -1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1771145103"
	)
	public int method4396() {
		return this.footprintSize;
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1907069146"
	)
	static void method4448() {
		ItemComposition.compass = null;
		class445.redHintArrowSprite = null;
		PendingSpawn.mapSceneSprites = null;
		PcmPlayer.headIconPkSprites = null;
		Varcs.headIconPrayerSprites = null;
		ArchiveDisk.headIconHintSprites = null;
		AsyncHttpResponse.mapDotSprites = null;
		class198.crossSprites = null;
		class199.field2176 = null;
		class450.scrollBarSprites = null;
		ViewportMouse.field2951 = null;
	}
}
