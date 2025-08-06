import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iz")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("SequenceDefinition_cached")
	static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("SequenceDefinition_cachedFrames")
	static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("SequenceDefinition_cachedModel")
	static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("bi")
	static boolean field2420;
	@ObfuscatedName("pe")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 309751295
	)
	@Export("SequenceDefinition_cachedModelId")
	public int SequenceDefinition_cachedModelId;
	@ObfuscatedName("bo")
	public Map field2406;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1119544877
	)
	int field2412;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 592660827
	)
	int field2424;
	@ObfuscatedName("bq")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("bv")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("bx")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1287898425
	)
	public int field2428;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -258050851
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("bc")
	int[] field2430;
	@ObfuscatedName("bd")
	boolean[] field2422;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1419577817
	)
	@Export("animationHeightOffset")
	public int animationHeightOffset;
	@ObfuscatedName("ba")
	public boolean field2409;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -563251451
	)
	public int field2410;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -426065809
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1714746693
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1502412247
	)
	public int field2437;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1684558677
	)
	public int field2438;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 307414035
	)
	public int field2439;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1071401339
	)
	@Export("restartMode")
	public int restartMode;
	@ObfuscatedName("bk")
	public boolean field2441;

	static {
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100);
		field2420 = false;
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1;
		this.field2412 = 0;
		this.field2424 = 0;
		this.frameCount = -1;
		this.animationHeightOffset = 0;
		this.field2409 = false;
		this.field2410 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field2437 = 99;
		this.field2438 = -1;
		this.field2439 = -1;
		this.restartMode = 2;
		this.field2441 = false;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "-26372546"
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
		descriptor = "(Lwj;II)V",
		garbageValue = "-1915398496"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.readUnsignedShort();
			this.frameLengths = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameLengths[var4] = var1.readUnsignedShort();
			}

			this.frameIds = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 2) {
			this.frameCount = var1.readUnsignedShort();
		} else if (var2 == 3) {
			var3 = var1.readUnsignedByte();
			this.field2430 = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2430[var4] = var1.readUnsignedByte();
			}

			this.field2430[var3] = 9999999;
		} else if (var2 == 4) {
			this.field2409 = true;
		} else if (var2 == 5) {
			this.field2410 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field2437 = var1.readUnsignedByte();
		} else if (var2 == 9) {
			this.field2438 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field2439 = var1.readUnsignedByte();
		} else if (var2 == 11) {
			this.restartMode = var1.readUnsignedByte();
		} else if (var2 == 12) {
			var3 = var1.readUnsignedByte();
			this.chatFrameIds = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.chatFrameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) {
				this.chatFrameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 13) {
			this.SequenceDefinition_cachedModelId = var1.readInt();
		} else if (var2 == 14) {
			var3 = var1.readUnsignedShort();
			if (this.field2406 == null) {
				this.field2406 = new HashMap();
			}

			for (var4 = 0; var4 < var3; ++var4) {
				int var5 = var1.readUnsignedShort();
				class209 var6 = ReflectionCheck.method760(var1);
				if (var6 != null) {
					if (!this.field2406.containsKey(var5)) {
						this.field2406.put(var5, new ArrayList());
					}

					((ArrayList)this.field2406.get(var5)).add(var6);
				}
			}
		} else if (var2 == 15) {
			this.field2412 = var1.readUnsignedShort();
			this.field2424 = var1.readUnsignedShort();
		} else if (var2 == 16) {
			this.animationHeightOffset = var1.readByte();
		} else if (var2 == 17) {
			this.field2422 = new boolean[256];

			for (var3 = 0; var3 < this.field2422.length; ++var3) {
				this.field2422[var3] = false;
			}

			var3 = var1.readUnsignedByte();

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2422[var1.readUnsignedByte()] = true;
			}
		} else if (var2 == 19) {
			this.field2441 = true;
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2042754928"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2438 == -1) {
			if (this.field2430 == null && this.field2422 == null) {
				this.field2438 = 0;
			} else {
				this.field2438 = 2;
			}
		}

		if (this.field2439 == -1) {
			if (this.field2430 == null && this.field2422 == null) {
				this.field2439 = 0;
			} else {
				this.field2439 = 2;
			}
		}

		if (this.frameLengths != null) {
			this.field2428 = 0;

			for (int var1 = 0; var1 < this.frameLengths.length; ++var1) {
				this.field2428 += this.frameLengths[var1];
			}
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljx;IB)Ljx;",
		garbageValue = "4"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var5 = class143.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var5 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var4.animate(var5, var2);
				return var4;
			}
		} else {
			class144 var3 = Widget.method7998(this.SequenceDefinition_cachedModelId);
			if (var3 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var3.method3719());
				var4.method5444(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljx;III)Ljx;",
		garbageValue = "-2124713393"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		Model var5;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var6 = class143.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var6 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var6.hasAlphaTransform(var2));
				var3 &= 3;
				if (var3 == 1) {
					var5.rotateY270Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY90Ccw();
				}

				var5.animate(var6, var2);
				if (var3 == 1) {
					var5.rotateY90Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY270Ccw();
				}

				return var5;
			}
		} else {
			class144 var4 = Widget.method7998(this.SequenceDefinition_cachedModelId);
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var4.method3719());
				var3 &= 3;
				if (var3 == 1) {
					var5.rotateY270Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY90Ccw();
				}

				var5.method5444(var4, var2);
				if (var3 == 1) {
					var5.rotateY90Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY270Ccw();
				}

				return var5;
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljx;II)Ljx;",
		garbageValue = "1721438028"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var5 = class143.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var5 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var5.hasAlphaTransform(var2));
				var4.animate(var5, var2);
				return var4;
			}
		} else {
			class144 var3 = Widget.method7998(this.SequenceDefinition_cachedModelId);
			if (var3 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var3.method3719());
				var4.method5444(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljx;ILiz;IB)Ljx;",
		garbageValue = "-84"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2420 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) {
			return this.method4713(var1, var2, var3, var4);
		} else {
			Model var5 = var1.toSharedSequenceModel(false);
			boolean var6 = false;
			Frames var7 = null;
			Skeleton var8 = null;
			class144 var9;
			if (this.isCachedModelIdSet()) {
				var9 = this.method4773();
				if (var9 == null) {
					return var5;
				}

				if (var3.isCachedModelIdSet() && this.field2422 == null) {
					var5.method5444(var9, var2);
					return var5;
				}

				var8 = var9.field1708;
				var5.method5494(var8, var9, var2, this.field2422, false, !var3.isCachedModelIdSet());
			} else {
				var2 = this.frameIds[var2];
				var7 = class143.getFrames(var2 >> 16);
				var2 &= 65535;
				if (var7 == null) {
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field2430 == null || var4 == -1)) {
					var5.animate(var7, var2);
					return var5;
				}

				if (this.field2430 == null || var4 == -1) {
					var5.animate(var7, var2);
					return var5;
				}

				var6 = var3.isCachedModelIdSet();
				if (!var6) {
					var5.method5449(var7, var2, this.field2430, false);
				}
			}

			if (var3.isCachedModelIdSet()) {
				var9 = var3.method4773();
				if (var9 == null) {
					return var5;
				}

				if (var8 == null) {
					var8 = var9.field1708;
				}

				var5.method5494(var8, var9, var4, this.field2422, true, true);
			} else {
				var4 = var3.frameIds[var4];
				Frames var10 = class143.getFrames(var4 >> 16);
				var4 &= 65535;
				if (var10 == null) {
					return this.transformActorModel(var1, var2);
				}

				var5.method5449(var10, var4, this.field2430, true);
			}

			if (var6 && var7 != null) {
				var5.method5449(var7, var2, this.field2430, false);
			}

			var5.resetBounds();
			return var5;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljx;ILiz;IB)Ljx;",
		garbageValue = "8"
	)
	Model method4713(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = class143.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = class143.getFrames(var4 >> 16);
			var4 &= 65535;
			Model var7;
			if (var6 == null) {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var7.animate(var5, var2);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
				var7.animate2(var5, var2, var6, var4, this.field2430);
				return var7;
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljx;IB)Ljx;",
		garbageValue = "-71"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			int var3 = this.frameIds[var2];
			Frames var4 = class143.getFrames(var3 >> 16);
			var3 &= 65535;
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null;
				int var6 = 0;
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
					var6 = this.chatFrameIds[var2];
					var5 = class143.getFrames(var6 >> 16);
					var6 &= 65535;
				}

				Model var7;
				if (var5 != null && var6 != 65535) {
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3) & !var5.hasAlphaTransform(var6));
					var7.animate(var4, var3);
					var7.animate(var5, var6);
					return var7;
				} else {
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3));
					var7.animate(var4, var3);
					return var7;
				}
			}
		} else {
			return this.transformActorModel(var1, var2);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "382464557"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-15785"
	)
	@Export("getMayaAnimFrame")
	public int getMayaAnimFrame() {
		return this.field2424 - this.field2412;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "76449166"
	)
	int method4717() {
		if (this.isCachedModelIdSet()) {
			int var2 = this.SequenceDefinition_cachedModelId;
			class144 var3 = AttackOption.method2762(var2);
			int var1;
			if (var3 == null) {
				var1 = 2;
			} else {
				var1 = var3.method3716() ? 0 : 1;
			}

			return var1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Lfh;",
		garbageValue = "-750251319"
	)
	class144 method4773() {
		return this.isCachedModelIdSet() ? Widget.method7998(this.SequenceDefinition_cachedModelId) : null;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1425662978"
	)
	public boolean method4719() {
		if (this.isCachedModelIdSet()) {
			return this.method4717() == 0;
		} else {
			return class143.getFrames(this.frameIds[0] >> 16) != null;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lcx;B)V",
		garbageValue = "1"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		WorldMapRegion.runScript(var0, 500000, 475000);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "-2044545257"
	)
	public static String method4774(CharSequence var0) {
		int var1 = var0.length();
		StringBuilder var2 = new StringBuilder(var1);

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') {
				if (var4 == ' ') {
					var2.append('+');
				} else {
					byte var5 = Player.charToByteCp1252(var4);
					var2.append('%');
					int var6 = var5 >> 4 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}

					var6 = var5 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}
				}
			} else {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2081052599"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var1 = class107.method3302(var0);
		int var2 = var1.baseVar;
		int var3 = var1.startBit;
		int var4 = var1.endBit;
		int var5 = Varps.Varps_masks[var4 - var3];
		return Varps.Varps_main[var2] >> var3 & var5;
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "93323895"
	)
	static void method4724(int var0, int var1, int var2, int var3, int var4) {
		RestClientThreadFactory.method208(class81.worldView, var0, var1, var2, var3, var4);
	}

	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "(Lox;B)I",
		garbageValue = "73"
	)
	@Export("getWidgetFlags2")
	static int getWidgetFlags2(Widget var0) {
		WidgetConfigNode var1 = (WidgetConfigNode)Client.widgetFlags.get((long)var0.id);
		WidgetConfigNode var2 = Login.method1930(var1, var0.childIndex * -64977777);
		if (var2 != null) {
			return var2.method7474();
		} else {
			int var4 = var0.flags;
			int var3 = var4 >> 1 & 1023;
			return var3;
		}
	}
}
