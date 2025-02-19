import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("ab")
	static boolean field2362;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("SequenceDefinition_archive")
	public static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("SequenceDefinition_animationsArchive")
	public static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	public static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("SequenceDefinition_cached")
	static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("SequenceDefinition_cachedFrames")
	static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("SequenceDefinition_cachedModel")
	static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -850229003
	)
	@Export("SequenceDefinition_cachedModelId")
	public int SequenceDefinition_cachedModelId;
	@ObfuscatedName("ai")
	public Map field2357;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1772580051
	)
	int field2347;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -2021631151
	)
	int field2359;
	@ObfuscatedName("av")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("ar")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("ag")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1188170597
	)
	public int field2367;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 423871129
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("aq")
	int[] field2365;
	@ObfuscatedName("aw")
	boolean[] field2366;
	@ObfuscatedName("an")
	public boolean field2350;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -407530311
	)
	public int field2368;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 249502549
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1354052711
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 672788745
	)
	public int field2355;
	@ObfuscatedName("bo")
	public boolean field2372;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1975419795
	)
	public int field2373;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -824887351
	)
	public int field2374;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -2141898639
	)
	@Export("restartMode")
	public int restartMode;

	static {
		field2362 = false;
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100);
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1;
		this.field2347 = 0;
		this.field2359 = 0;
		this.frameCount = -1;
		this.field2350 = false;
		this.field2368 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field2355 = 99;
		this.field2372 = false;
		this.field2373 = -1;
		this.field2374 = -1;
		this.restartMode = 2;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;B)V",
		garbageValue = "33"
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lvy;IB)V",
		garbageValue = "0"
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
			this.field2365 = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2365[var4] = var1.readUnsignedByte();
			}

			this.field2365[var3] = 9999999;
		} else if (var2 == 4) {
			this.field2350 = true;
		} else if (var2 == 5) {
			this.field2368 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field2355 = var1.readUnsignedByte();
			this.field2372 = true;
		} else if (var2 == 9) {
			this.field2373 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field2374 = var1.readUnsignedByte();
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
			if (this.field2357 == null) {
				this.field2357 = new HashMap();
			}

			for (var4 = 0; var4 < var3; ++var4) {
				int var5 = var1.readUnsignedShort();
				class208 var6 = MusicPatchNode.method6828(var1);
				if (var6 != null) {
					if (!this.field2357.containsKey(var5)) {
						this.field2357.put(var5, new ArrayList());
					}

					((ArrayList)this.field2357.get(var5)).add(var6);
				}
			}
		} else if (var2 == 15) {
			this.field2347 = var1.readUnsignedShort();
			this.field2359 = var1.readUnsignedShort();
		} else if (var2 == 17) {
			this.field2366 = new boolean[256];

			for (var3 = 0; var3 < this.field2366.length; ++var3) {
				this.field2366[var3] = false;
			}

			var3 = var1.readUnsignedByte();

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2366[var1.readUnsignedByte()] = true;
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1460442588"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2373 == -1) {
			if (this.field2365 == null && this.field2366 == null) {
				this.field2373 = 0;
			} else {
				this.field2373 = 2;
			}
		}

		if (this.field2374 == -1) {
			if (this.field2365 == null && this.field2366 == null) {
				this.field2374 = 0;
			} else {
				this.field2374 = 2;
			}
		}

		if (this.frameLengths != null) {
			this.field2367 = 0;

			for (int var1 = 0; var1 < this.frameLengths.length; ++var1) {
				this.field2367 += this.frameLengths[var1];
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljf;II)Ljf;",
		garbageValue = "-2046395269"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var5 = class473.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var5 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var4.animate(var5, var2);
				return var4;
			}
		} else {
			class144 var3 = HttpRequestTask.method249(this.SequenceDefinition_cachedModelId);
			if (var3 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var3.method3414());
				var4.method5261(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljf;III)Ljf;",
		garbageValue = "1810343353"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		Model var5;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var6 = class473.getFrames(var2 >> 16);
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
			class144 var4 = HttpRequestTask.method249(this.SequenceDefinition_cachedModelId);
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var4.method3414());
				var3 &= 3;
				if (var3 == 1) {
					var5.rotateY270Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY90Ccw();
				}

				var5.method5261(var4, var2);
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljf;II)Ljf;",
		garbageValue = "-89174789"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var5 = class473.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var5 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var5.hasAlphaTransform(var2));
				var4.animate(var5, var2);
				return var4;
			}
		} else {
			class144 var3 = HttpRequestTask.method249(this.SequenceDefinition_cachedModelId);
			if (var3 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var3.method3414());
				var4.method5261(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljf;ILiw;IB)Ljf;",
		garbageValue = "-51"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2362 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) {
			return this.method4332(var1, var2, var3, var4);
		} else {
			Model var5 = var1.toSharedSequenceModel(false);
			boolean var6 = false;
			Frames var7 = null;
			Skeleton var8 = null;
			class144 var9;
			if (this.isCachedModelIdSet()) {
				var9 = this.method4323();
				if (var9 == null) {
					return var5;
				}

				if (var3.isCachedModelIdSet() && this.field2366 == null) {
					var5.method5261(var9, var2);
					return var5;
				}

				var8 = var9.field1683;
				var5.method5273(var8, var9, var2, this.field2366, false, !var3.isCachedModelIdSet());
			} else {
				var2 = this.frameIds[var2];
				var7 = class473.getFrames(var2 >> 16);
				var2 &= 65535;
				if (var7 == null) {
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field2365 == null || var4 == -1)) {
					var5.animate(var7, var2);
					return var5;
				}

				if (this.field2365 == null || var4 == -1) {
					var5.animate(var7, var2);
					return var5;
				}

				var6 = var3.isCachedModelIdSet();
				if (!var6) {
					var5.method5274(var7, var2, this.field2365, false);
				}
			}

			if (var3.isCachedModelIdSet()) {
				var9 = var3.method4323();
				if (var9 == null) {
					return var5;
				}

				if (var8 == null) {
					var8 = var9.field1683;
				}

				var5.method5273(var8, var9, var4, this.field2366, true, true);
			} else {
				var4 = var3.frameIds[var4];
				Frames var10 = class473.getFrames(var4 >> 16);
				var4 &= 65535;
				if (var10 == null) {
					return this.transformActorModel(var1, var2);
				}

				var5.method5274(var10, var4, this.field2365, true);
			}

			if (var6 && var7 != null) {
				var5.method5274(var7, var2, this.field2365, false);
			}

			var5.resetBounds();
			return var5;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljf;ILiw;II)Ljf;",
		garbageValue = "-1769100376"
	)
	Model method4332(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = class473.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = class473.getFrames(var4 >> 16);
			var4 &= 65535;
			Model var7;
			if (var6 == null) {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var7.animate(var5, var2);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
				var7.animate2(var5, var2, var6, var4, this.field2365);
				return var7;
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljf;IB)Ljf;",
		garbageValue = "-85"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			int var3 = this.frameIds[var2];
			Frames var4 = class473.getFrames(var3 >> 16);
			var3 &= 65535;
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null;
				int var6 = 0;
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
					var6 = this.chatFrameIds[var2];
					var5 = class473.getFrames(var6 >> 16);
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1239837232"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-75"
	)
	@Export("getMayaAnimFrame")
	public int getMayaAnimFrame() {
		return this.field2359 - this.field2347;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Lfb;",
		garbageValue = "-115826215"
	)
	class144 method4323() {
		return this.isCachedModelIdSet() ? HttpRequestTask.method249(this.SequenceDefinition_cachedModelId) : null;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I[III)V",
		garbageValue = "-267793424"
	)
	static void method4364(int var0, int[] var1, int var2) {
		for (int var3 = 0; var3 < KitDefinition.KitDefinition_fileCount; ++var3) {
			KitDefinition var4 = class76.method2222(var3);
			if (var4 != null && !var4.nonSelectable && var4.method3844(var2, var0)) {
				var1[class197.method3991(var2)] = var3 + 256;
				break;
			}
		}

	}
}
