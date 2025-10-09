import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("SequenceDefinition_cachedModel")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("bj")
	static boolean field2471;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 379971991
	)
	@Export("SequenceDefinition_cachedModelId")
	public int SequenceDefinition_cachedModelId;
	@ObfuscatedName("bn")
	public Map field2473;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -1141448835
	)
	int field2470;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1950638395
	)
	int field2462;
	@ObfuscatedName("bg")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("bu")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("bs")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 119184009
	)
	public int field2479;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1342780677
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("bx")
	int[] field2481;
	@ObfuscatedName("bp")
	boolean[] field2482;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -524928447
	)
	@Export("animationHeightOffset")
	public int animationHeightOffset;
	@ObfuscatedName("bh")
	public boolean field2461;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 846153173
	)
	public int field2485;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1514728211
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1433447449
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1641266097
	)
	public int field2488;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1478325665
	)
	public int field2489;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1591506641
	)
	public int field2490;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1298759387
	)
	@Export("restartMode")
	public int restartMode;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -91889569
	)
	int field2492;
	@ObfuscatedName("bt")
	public boolean field2493;

	static {
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100);
		field2471 = false;
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1;
		this.field2470 = 0;
		this.field2462 = 0;
		this.frameCount = -1;
		this.animationHeightOffset = 0;
		this.field2461 = false;
		this.field2485 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field2488 = 99;
		this.field2489 = -1;
		this.field2490 = -1;
		this.restartMode = 2;
		this.field2493 = false;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "-2121916983"
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwj;II)V",
		garbageValue = "1957496346"
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
			this.field2481 = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2481[var4] = var1.readUnsignedByte();
			}

			this.field2481[var3] = 9999999;
		} else if (var2 == 4) {
			this.field2461 = true;
		} else if (var2 == 5) {
			this.field2485 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field2488 = var1.readUnsignedByte();
		} else if (var2 == 9) {
			this.field2489 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field2490 = var1.readUnsignedByte();
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
			if (this.field2473 == null) {
				this.field2473 = new HashMap();
			}

			for (var4 = 0; var4 < var3; ++var4) {
				int var5;
				class210 var6;
				label162: {
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
							var6 = new class210(var13, var14, var15, var16, var17);
							break label162;
						}
					}

					var6 = null;
				}

				if (var6 != null) {
					if (!this.field2473.containsKey(var5)) {
						this.field2473.put(var5, new ArrayList());
					}

					((ArrayList)this.field2473.get(var5)).add(var6);
				}
			}
		} else if (var2 == 15) {
			this.field2470 = var1.readUnsignedShort();
			this.field2462 = var1.readUnsignedShort();
		} else if (var2 == 16) {
			this.animationHeightOffset = var1.readByte();
		} else if (var2 == 17) {
			this.field2482 = new boolean[256];

			for (var3 = 0; var3 < this.field2482.length; ++var3) {
				this.field2482[var3] = false;
			}

			var3 = var1.readUnsignedByte();

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2482[var1.readUnsignedByte()] = true;
			}
		} else if (var2 == 19) {
			this.field2493 = true;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-264912952"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2489 == -1) {
			if (this.field2481 == null && this.field2482 == null) {
				this.field2489 = 0;
			} else {
				this.field2489 = 2;
			}
		}

		if (this.field2490 == -1) {
			if (this.field2481 == null && this.field2482 == null) {
				this.field2490 = 0;
			} else {
				this.field2490 = 2;
			}
		}

		if (this.frameLengths != null) {
			this.field2479 = 0;

			for (int var1 = 0; var1 < this.frameLengths.length; ++var1) {
				this.field2479 += this.frameLengths[var1];
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljd;IB)Ljd;",
		garbageValue = "112"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var5 = class330.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var5 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var4.animate(var5, var2);
				return var4;
			}
		} else {
			class145 var3 = class171.method4140(this.SequenceDefinition_cachedModelId);
			if (var3 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var3.method3839());
				var4.method5618(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1590666208"
	)
	public boolean method4823(int var1) {
		if (this.shield <= 0 && this.weapon <= 0) {
			if (!this.isCachedModelIdSet()) {
				var1 = this.frameIds[var1];
				Frames var3 = class330.getFrames(var1 >> 16);
				var1 &= 65535;
				return var3 == null ? false : var3.hasAlphaTransform(var1);
			} else {
				class145 var2 = class171.method4140(this.SequenceDefinition_cachedModelId);
				return var2 == null ? false : var2.method3839();
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljd;III)Ljd;",
		garbageValue = "-1614637295"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		Model var5;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var6 = class330.getFrames(var2 >> 16);
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
			class145 var4 = class171.method4140(this.SequenceDefinition_cachedModelId);
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var4.method3839());
				var3 &= 3;
				if (var3 == 1) {
					var5.rotateY270Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY90Ccw();
				}

				var5.method5618(var4, var2);
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
		descriptor = "(Ljd;IB)Ljd;",
		garbageValue = "-25"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var5 = class330.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var5 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var5.hasAlphaTransform(var2));
				var4.animate(var5, var2);
				return var4;
			}
		} else {
			class145 var3 = class171.method4140(this.SequenceDefinition_cachedModelId);
			if (var3 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var3.method3839());
				var4.method5618(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljd;ILit;II)Ljd;",
		garbageValue = "-1187798677"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2471 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) {
			return this.method4860(var1, var2, var3, var4);
		} else {
			Model var5 = var1.toSharedSequenceModel(false);
			boolean var6 = false;
			Frames var7 = null;
			Skeleton var8 = null;
			class145 var9;
			if (this.isCachedModelIdSet()) {
				var9 = this.method4881();
				if (var9 == null) {
					return var5;
				}

				if (var3.isCachedModelIdSet() && this.field2482 == null) {
					var5.method5618(var9, var2);
					return var5;
				}

				var8 = var9.field1731;
				var5.method5542(var8, var9, var2, this.field2482, false, !var3.isCachedModelIdSet());
			} else {
				var2 = this.frameIds[var2];
				var7 = class330.getFrames(var2 >> 16);
				var2 &= 65535;
				if (var7 == null) {
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field2481 == null || var4 == -1)) {
					var5.animate(var7, var2);
					return var5;
				}

				if (this.field2481 == null || var4 == -1) {
					var5.animate(var7, var2);
					return var5;
				}

				var6 = var3.isCachedModelIdSet();
				if (!var6) {
					var5.method5543(var7, var2, this.field2481, false);
				}
			}

			if (var3.isCachedModelIdSet()) {
				var9 = var3.method4881();
				if (var9 == null) {
					return var5;
				}

				if (var8 == null) {
					var8 = var9.field1731;
				}

				var5.method5542(var8, var9, var4, this.field2482, true, true);
			} else {
				var4 = var3.frameIds[var4];
				Frames var10 = class330.getFrames(var4 >> 16);
				var4 &= 65535;
				if (var10 == null) {
					return this.transformActorModel(var1, var2);
				}

				var5.method5543(var10, var4, this.field2481, true);
			}

			if (var6 && var7 != null) {
				var5.method5543(var7, var2, this.field2481, false);
			}

			var5.resetBounds();
			return var5;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljd;ILit;IB)Ljd;",
		garbageValue = "1"
	)
	Model method4860(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = class330.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = class330.getFrames(var4 >> 16);
			var4 &= 65535;
			Model var7;
			if (var6 == null) {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var7.animate(var5, var2);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
				var7.animate2(var5, var2, var6, var4, this.field2481);
				return var7;
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljd;II)Ljd;",
		garbageValue = "-2063297869"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			int var3 = this.frameIds[var2];
			Frames var4 = class330.getFrames(var3 >> 16);
			var3 &= 65535;
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null;
				int var6 = 0;
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
					var6 = this.chatFrameIds[var2];
					var5 = class330.getFrames(var6 >> 16);
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
		garbageValue = "-1497664015"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-493752552"
	)
	@Export("getMayaAnimFrame")
	public int getMayaAnimFrame() {
		return this.field2462 - this.field2470;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-884509099"
	)
	int method4831() {
		return this.isCachedModelIdSet() ? class150.method3908(this.SequenceDefinition_cachedModelId) : 2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lfz;",
		garbageValue = "-2034197465"
	)
	public class145 method4881() {
		return this.isCachedModelIdSet() ? class171.method4140(this.SequenceDefinition_cachedModelId) : null;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	public int method4867() {
		return this.field2492;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1685334115"
	)
	public boolean method4856() {
		if (this.isCachedModelIdSet()) {
			return this.method4831() == 0;
		} else {
			return this.frameIds != null && this.frameIds.length > 0 && class330.getFrames(this.frameIds[0] >> 16) != null;
		}
	}

	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "(Lok;IIIIIIB)V",
		garbageValue = "-55"
	)
	static final void method4851(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field454) {
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0;
		}

		Client.field454 = false;
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !ObjectComposition.mouseCam && MouseHandler.MouseHandler_currentButton == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
				var0.scrollY -= 4;
				class154.invalidateWidget(var0);
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
				var0.scrollY += 4;
				class154.invalidateWidget(var0);
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
				var7 = var3 * (var3 - 32) / var4;
				if (var7 < 8) {
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2;
				int var9 = var3 - 32 - var7;
				var0.scrollY = var8 * (var4 - var3) / var9;
				class154.invalidateWidget(var0);
				Client.field454 = true;
			}
		}

		if (Client.mouseWheelRotation != 0) {
			var7 = var0.width;
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
				var0.scrollY += Client.mouseWheelRotation * 45;
				class154.invalidateWidget(var0);
			}
		}

	}
}
