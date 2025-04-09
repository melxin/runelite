import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("km")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("SequenceDefinition_archive")
	public static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("SequenceDefinition_animationsArchive")
	public static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	public static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("SequenceDefinition_cachedModel")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("ax")
	static boolean field3028;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lwc;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1314775375
	)
	@Export("SequenceDefinition_cachedModelId")
	public int SequenceDefinition_cachedModelId;
	@ObfuscatedName("ar")
	public Map field3011;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1464488901
	)
	int field3012;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1754086699
	)
	int field3013;
	@ObfuscatedName("al")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("ac")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("ay")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 902564175
	)
	public int field3017;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1317991895
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("ai")
	int[] field3019;
	@ObfuscatedName("ad")
	boolean[] field3007;
	@ObfuscatedName("ah")
	public boolean field3009;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 61351155
	)
	public int field3022;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1583207715
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1441530665
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 2110122081
	)
	public int field3025;
	@ObfuscatedName("bp")
	public boolean field3026;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1452521785
	)
	public int field3010;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1178837331
	)
	public int field3000;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1474348511
	)
	@Export("restartMode")
	public int restartMode;

	static {
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100);
		field3028 = false;
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1;
		this.field3012 = 0;
		this.field3013 = 0;
		this.frameCount = -1;
		this.field3009 = false;
		this.field3022 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field3025 = 99;
		this.field3026 = false;
		this.field3010 = -1;
		this.field3000 = -1;
		this.restartMode = 2;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lve;I)V",
		garbageValue = "-2135847390"
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lve;II)V",
		garbageValue = "692912860"
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
			this.field3019 = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field3019[var4] = var1.readUnsignedByte();
			}

			this.field3019[var3] = 9999999;
		} else if (var2 == 4) {
			this.field3009 = true;
		} else if (var2 == 5) {
			this.field3022 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field3025 = var1.readUnsignedByte();
			this.field3026 = true;
		} else if (var2 == 9) {
			this.field3010 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field3000 = var1.readUnsignedByte();
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
			if (this.field3011 == null) {
				this.field3011 = new HashMap();
			}

			for (var4 = 0; var4 < var3; ++var4) {
				int var5;
				class262 var6;
				label160: {
					var5 = var1.readUnsignedShort();
					if (var1 != null) {
						boolean var7 = false;
						boolean var8 = true;
						boolean var9 = false;
						boolean var10 = false;
						boolean var11 = false;
						int var13 = var1.readUnsignedShort();
						int var14 = var1.readUnsignedByte();
						int var15 = var1.readUnsignedByte();
						int var16 = var1.readUnsignedByte();
						int var17 = var1.readUnsignedByte();
						if (var13 >= 1 && var15 >= 1 && var16 >= 0 && var17 >= 0) {
							var6 = new class262(var13, var14, var15, var16, var17);
							break label160;
						}
					}

					var6 = null;
				}

				if (var6 != null) {
					if (!this.field3011.containsKey(var5)) {
						this.field3011.put(var5, new ArrayList());
					}

					((ArrayList)this.field3011.get(var5)).add(var6);
				}
			}
		} else if (var2 == 15) {
			this.field3012 = var1.readUnsignedShort();
			this.field3013 = var1.readUnsignedShort();
		} else if (var2 == 17) {
			this.field3007 = new boolean[256];

			for (var3 = 0; var3 < this.field3007.length; ++var3) {
				this.field3007[var3] = false;
			}

			var3 = var1.readUnsignedByte();

			for (var4 = 0; var4 < var3; ++var4) {
				this.field3007[var1.readUnsignedByte()] = true;
			}
		} else if (var2 == 18) {
			var1.readStringCp1252NullTerminated();
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-606647902"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field3010 == -1) {
			if (this.field3019 == null && this.field3007 == null) {
				this.field3010 = 0;
			} else {
				this.field3010 = 2;
			}
		}

		if (this.field3000 == -1) {
			if (this.field3019 == null && this.field3007 == null) {
				this.field3000 = 0;
			} else {
				this.field3000 = 2;
			}
		}

		if (this.frameLengths != null) {
			this.field3017 = 0;

			for (int var1 = 0; var1 < this.frameLengths.length; ++var1) {
				this.field3017 += this.frameLengths[var1];
			}
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lhe;IB)Lhe;",
		garbageValue = "-97"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var5 = class445.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var5 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var4.animate(var5, var2);
				return var4;
			}
		} else {
			class142 var3 = class224.method4945(this.SequenceDefinition_cachedModelId);
			if (var3 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var3.method3399());
				var4.method4403(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lhe;IIB)Lhe;",
		garbageValue = "-28"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		Model var5;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var6 = class445.getFrames(var2 >> 16);
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
			class142 var4 = class224.method4945(this.SequenceDefinition_cachedModelId);
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var4.method3399());
				var3 &= 3;
				if (var3 == 1) {
					var5.rotateY270Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY90Ccw();
				}

				var5.method4403(var4, var2);
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lhe;II)Lhe;",
		garbageValue = "-1355889299"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var5 = class445.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var5 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var5.hasAlphaTransform(var2));
				var4.animate(var5, var2);
				return var4;
			}
		} else {
			class142 var3 = class224.method4945(this.SequenceDefinition_cachedModelId);
			if (var3 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var3.method3399());
				var4.method4403(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lhe;ILkm;IB)Lhe;",
		garbageValue = "-12"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field3028 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) {
			return this.method5594(var1, var2, var3, var4);
		} else {
			Model var5 = var1.toSharedSequenceModel(false);
			boolean var6 = false;
			Frames var7 = null;
			Skeleton var8 = null;
			class142 var9;
			if (this.isCachedModelIdSet()) {
				var9 = this.method5590();
				if (var9 == null) {
					return var5;
				}

				if (var3.isCachedModelIdSet() && this.field3007 == null) {
					var5.method4403(var9, var2);
					return var5;
				}

				var8 = var9.field1661;
				var5.method4413(var8, var9, var2, this.field3007, false, !var3.isCachedModelIdSet());
			} else {
				var2 = this.frameIds[var2];
				var7 = class445.getFrames(var2 >> 16);
				var2 &= 65535;
				if (var7 == null) {
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field3019 == null || var4 == -1)) {
					var5.animate(var7, var2);
					return var5;
				}

				if (this.field3019 == null || var4 == -1) {
					var5.animate(var7, var2);
					return var5;
				}

				var6 = var3.isCachedModelIdSet();
				if (!var6) {
					var5.method4408(var7, var2, this.field3019, false);
				}
			}

			if (var3.isCachedModelIdSet()) {
				var9 = var3.method5590();
				if (var9 == null) {
					return var5;
				}

				if (var8 == null) {
					var8 = var9.field1661;
				}

				var5.method4413(var8, var9, var4, this.field3007, true, true);
			} else {
				var4 = var3.frameIds[var4];
				Frames var10 = class445.getFrames(var4 >> 16);
				var4 &= 65535;
				if (var10 == null) {
					return this.transformActorModel(var1, var2);
				}

				var5.method4408(var10, var4, this.field3019, true);
			}

			if (var6 && var7 != null) {
				var5.method4408(var7, var2, this.field3019, false);
			}

			var5.resetBounds();
			return var5;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lhe;ILkm;II)Lhe;",
		garbageValue = "20798785"
	)
	Model method5594(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = class445.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = class445.getFrames(var4 >> 16);
			var4 &= 65535;
			Model var7;
			if (var6 == null) {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var7.animate(var5, var2);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
				var7.animate2(var5, var2, var6, var4, this.field3019);
				return var7;
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lhe;IB)Lhe;",
		garbageValue = "125"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			int var3 = this.frameIds[var2];
			Frames var4 = class445.getFrames(var3 >> 16);
			var3 &= 65535;
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null;
				int var6 = 0;
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
					var6 = this.chatFrameIds[var2];
					var5 = class445.getFrames(var6 >> 16);
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "989869578"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1033520277"
	)
	@Export("getMayaAnimFrame")
	public int getMayaAnimFrame() {
		return this.field3013 - this.field3012;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lfy;",
		garbageValue = "-262497938"
	)
	class142 method5590() {
		return this.isCachedModelIdSet() ? class224.method4945(this.SequenceDefinition_cachedModelId) : null;
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;IIIIIII)V",
		garbageValue = "2083053229"
	)
	static final void method5619(int var0, String var1, String var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (!Client.isMenuOpen) {
			if (class408.method7863(var8, var3)) {
				if (var0 >= 0 && var0 < Client.menu.subMenus.length) {
					if (Client.menu.subMenus[var0] == null) {
						Client.menu.subMenus[var0] = new Menu(false);
					}

					Client.menu.subMenus[var0].insertMenuItem(var1, var2, var3, var4, var5, var6, var7, false, var8);
				}
			}
		}
	}
}
