import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("SequenceDefinition_animationsArchive")
	public static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("SequenceDefinition_cachedModel")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("bu")
	static boolean field2469;
	@ObfuscatedName("po")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;
	@ObfuscatedName("pa")
	static byte[][] field2494;
	@ObfuscatedName("vk")
	@ObfuscatedGetter(
		intValue = -1632722523
	)
	static int field2487;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1276980385
	)
	@Export("SequenceDefinition_cachedModelId")
	public int SequenceDefinition_cachedModelId;
	@ObfuscatedName("bd")
	public Map field2471;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 741903671
	)
	int field2455;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1648101563
	)
	int field2473;
	@ObfuscatedName("bo")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("bl")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("by")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 873066783
	)
	public int field2477;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1618965207
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("bq")
	int[] field2479;
	@ObfuscatedName("bz")
	boolean[] field2470;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 674107971
	)
	@Export("animationHeightOffset")
	public int animationHeightOffset;
	@ObfuscatedName("be")
	public boolean field2482;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1143323137
	)
	public int field2480;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 562023531
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1931301869
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -986527063
	)
	public int field2486;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -957102913
	)
	public int field2492;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -1503296261
	)
	public int field2485;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 500891711
	)
	@Export("restartMode")
	public int restartMode;
	@ObfuscatedName("bf")
	public boolean field2483;

	static {
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100);
		field2469 = false;
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1;
		this.field2455 = 0;
		this.field2473 = 0;
		this.frameCount = -1;
		this.animationHeightOffset = 0;
		this.field2482 = false;
		this.field2480 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field2486 = 99;
		this.field2492 = -1;
		this.field2485 = -1;
		this.restartMode = 2;
		this.field2483 = false;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "-1526533488"
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
		descriptor = "(Lwb;IB)V",
		garbageValue = "11"
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
			this.field2479 = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2479[var4] = var1.readUnsignedByte();
			}

			this.field2479[var3] = 9999999;
		} else if (var2 == 4) {
			this.field2482 = true;
		} else if (var2 == 5) {
			this.field2480 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field2486 = var1.readUnsignedByte();
		} else if (var2 == 9) {
			this.field2492 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field2485 = var1.readUnsignedByte();
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
			this.SequenceDefinition_cachedModelId = var1.method1958();
		} else if (var2 == 14) {
			var3 = var1.readUnsignedShort();
			if (this.field2471 == null) {
				this.field2471 = new HashMap();
			}

			for (var4 = 0; var4 < var3; ++var4) {
				int var5;
				class211 var6;
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
							var6 = new class211(var13, var14, var15, var16, var17);
							break label162;
						}
					}

					var6 = null;
				}

				if (var6 != null) {
					if (!this.field2471.containsKey(var5)) {
						this.field2471.put(var5, new ArrayList());
					}

					((ArrayList)this.field2471.get(var5)).add(var6);
				}
			}
		} else if (var2 == 15) {
			this.field2455 = var1.readUnsignedShort();
			this.field2473 = var1.readUnsignedShort();
		} else if (var2 == 16) {
			this.animationHeightOffset = var1.readByte();
		} else if (var2 == 17) {
			this.field2470 = new boolean[256];

			for (var3 = 0; var3 < this.field2470.length; ++var3) {
				this.field2470[var3] = false;
			}

			var3 = var1.readUnsignedByte();

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2470[var1.readUnsignedByte()] = true;
			}
		} else if (var2 == 19) {
			this.field2483 = true;
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "288730722"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2492 == -1) {
			if (this.field2479 == null && this.field2470 == null) {
				this.field2492 = 0;
			} else {
				this.field2492 = 2;
			}
		}

		if (this.field2485 == -1) {
			if (this.field2479 == null && this.field2470 == null) {
				this.field2485 = 0;
			} else {
				this.field2485 = 2;
			}
		}

		if (this.frameLengths != null) {
			this.field2477 = 0;

			for (int var1 = 0; var1 < this.frameLengths.length; ++var1) {
				this.field2477 += this.frameLengths[var1];
			}
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljn;IB)Ljn;",
		garbageValue = "31"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var5 = MouseHandler.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var5 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var4.animate(var5, var2);
				return var4;
			}
		} else {
			class146 var3 = ObjectComposition.method4634(this.SequenceDefinition_cachedModelId);
			if (var3 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var3.method3756());
				var4.method5478(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljn;IIB)Ljn;",
		garbageValue = "64"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		Model var5;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var6 = MouseHandler.getFrames(var2 >> 16);
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
			class146 var4 = ObjectComposition.method4634(this.SequenceDefinition_cachedModelId);
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var4.method3756());
				var3 &= 3;
				if (var3 == 1) {
					var5.rotateY270Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY90Ccw();
				}

				var5.method5478(var4, var2);
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljn;II)Ljn;",
		garbageValue = "-1310667162"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var5 = MouseHandler.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var5 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var5.hasAlphaTransform(var2));
				var4.animate(var5, var2);
				return var4;
			}
		} else {
			class146 var3 = ObjectComposition.method4634(this.SequenceDefinition_cachedModelId);
			if (var3 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var3.method3756());
				var4.method5478(var3, var2);
				return var4;
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljn;ILij;II)Ljn;",
		garbageValue = "19841641"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2469 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) {
			return this.method4766(var1, var2, var3, var4);
		} else {
			Model var5 = var1.toSharedSequenceModel(false);
			boolean var6 = false;
			Frames var7 = null;
			Skeleton var8 = null;
			class146 var9;
			if (this.isCachedModelIdSet()) {
				var9 = this.method4771();
				if (var9 == null) {
					return var5;
				}

				if (var3.isCachedModelIdSet() && this.field2470 == null) {
					var5.method5478(var9, var2);
					return var5;
				}

				var8 = var9.field1731;
				var5.method5498(var8, var9, var2, this.field2470, false, !var3.isCachedModelIdSet());
			} else {
				var2 = this.frameIds[var2];
				var7 = MouseHandler.getFrames(var2 >> 16);
				var2 &= 65535;
				if (var7 == null) {
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field2479 == null || var4 == -1)) {
					var5.animate(var7, var2);
					return var5;
				}

				if (this.field2479 == null || var4 == -1) {
					var5.animate(var7, var2);
					return var5;
				}

				var6 = var3.isCachedModelIdSet();
				if (!var6) {
					var5.method5468(var7, var2, this.field2479, false);
				}
			}

			if (var3.isCachedModelIdSet()) {
				var9 = var3.method4771();
				if (var9 == null) {
					return var5;
				}

				if (var8 == null) {
					var8 = var9.field1731;
				}

				var5.method5498(var8, var9, var4, this.field2470, true, true);
			} else {
				var4 = var3.frameIds[var4];
				Frames var10 = MouseHandler.getFrames(var4 >> 16);
				var4 &= 65535;
				if (var10 == null) {
					return this.transformActorModel(var1, var2);
				}

				var5.method5468(var10, var4, this.field2479, true);
			}

			if (var6 && var7 != null) {
				var5.method5468(var7, var2, this.field2479, false);
			}

			var5.resetBounds();
			return var5;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljn;ILij;II)Ljn;",
		garbageValue = "-319149046"
	)
	Model method4766(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = MouseHandler.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = MouseHandler.getFrames(var4 >> 16);
			var4 &= 65535;
			Model var7;
			if (var6 == null) {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var7.animate(var5, var2);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
				var7.animate2(var5, var2, var6, var4, this.field2479);
				return var7;
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljn;II)Ljn;",
		garbageValue = "-764233604"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			int var3 = this.frameIds[var2];
			Frames var4 = MouseHandler.getFrames(var3 >> 16);
			var3 &= 65535;
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null;
				int var6 = 0;
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
					var6 = this.chatFrameIds[var2];
					var5 = MouseHandler.getFrames(var6 >> 16);
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1262124675"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-32"
	)
	@Export("getMayaAnimFrame")
	public int getMayaAnimFrame() {
		return this.field2473 - this.field2455;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "588741928"
	)
	int method4770() {
		if (this.isCachedModelIdSet()) {
			int var2 = this.SequenceDefinition_cachedModelId;
			class146 var3 = SecureUrlRequester.method3516(var2);
			int var1;
			if (var3 == null) {
				var1 = 2;
			} else {
				var1 = var3.method3754() ? 0 : 1;
			}

			return var1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Lfh;",
		garbageValue = "-36"
	)
	class146 method4771() {
		return this.isCachedModelIdSet() ? ObjectComposition.method4634(this.SequenceDefinition_cachedModelId) : null;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1006641339"
	)
	public boolean method4791() {
		if (this.isCachedModelIdSet()) {
			return this.method4770() == 0;
		} else {
			return MouseHandler.getFrames(this.frameIds[0] >> 16) != null;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)D",
		garbageValue = "-874369056"
	)
	public static double method4817(int var0) {
		int var1 = class536.field5574[var0 & 2047];
		return (double)var1 / 65536.0D;
	}
}
