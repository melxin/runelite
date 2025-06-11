import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ip")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("SequenceDefinition_archive")
	static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("SequenceDefinition_animationsArchive")
	static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("SequenceDefinition_cached")
	static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("SequenceDefinition_cachedFrames")
	static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("SequenceDefinition_cachedModel")
	static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("ar")
	static boolean field2365;
	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "Lvh;"
	)
	static class557 field2343;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 641180515
	)
	@Export("SequenceDefinition_cachedModelId")
	public int SequenceDefinition_cachedModelId;
	@ObfuscatedName("af")
	public Map field2349;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -2098148011
	)
	int field2350;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 2077234407
	)
	int field2347;
	@ObfuscatedName("aw")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("at")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("ae")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -153191873
	)
	public int field2368;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1840097905
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("as")
	int[] field2359;
	@ObfuscatedName("ax")
	boolean[] field2358;
	@ObfuscatedName("ab")
	public boolean field2364;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1915224377
	)
	public int field2360;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -459927857
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -603883343
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 956126653
	)
	public int field2363;
	@ObfuscatedName("bl")
	public boolean field2361;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 443579069
	)
	public int field2341;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 428391817
	)
	public int field2366;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -56769107
	)
	@Export("restartMode")
	public int restartMode;
	@ObfuscatedName("bm")
	public boolean field2357;

	static {
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100);
		field2365 = false;
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1;
		this.field2350 = 0;
		this.field2347 = 0;
		this.frameCount = -1;
		this.field2364 = false;
		this.field2360 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field2363 = 99;
		this.field2361 = false;
		this.field2341 = -1;
		this.field2366 = -1;
		this.restartMode = 2;
		this.field2357 = false;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "1871736615"
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
		descriptor = "(Lwt;II)V",
		garbageValue = "99520853"
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
			this.field2359 = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2359[var4] = var1.readUnsignedByte();
			}

			this.field2359[var3] = 9999999;
		} else if (var2 == 4) {
			this.field2364 = true;
		} else if (var2 == 5) {
			this.field2360 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field2363 = var1.readUnsignedByte();
			this.field2361 = true;
		} else if (var2 == 9) {
			this.field2341 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field2366 = var1.readUnsignedByte();
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
			if (this.field2349 == null) {
				this.field2349 = new HashMap();
			}

			for (var4 = 0; var4 < var3; ++var4) {
				int var5 = var1.readUnsignedShort();
				class209 var6 = class150.method3671(var1);
				if (var6 != null) {
					if (!this.field2349.containsKey(var5)) {
						this.field2349.put(var5, new ArrayList());
					}

					((ArrayList)this.field2349.get(var5)).add(var6);
				}
			}
		} else if (var2 == 15) {
			this.field2350 = var1.readUnsignedShort();
			this.field2347 = var1.readUnsignedShort();
		} else if (var2 == 17) {
			this.field2358 = new boolean[256];

			for (var3 = 0; var3 < this.field2358.length; ++var3) {
				this.field2358[var3] = false;
			}

			var3 = var1.readUnsignedByte();

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2358[var1.readUnsignedByte()] = true;
			}
		} else if (var2 == 18) {
			var1.readStringCp1252NullTerminated();
		} else if (var2 == 19) {
			this.field2357 = true;
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1416047302"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2341 == -1) {
			if (this.field2359 == null && this.field2358 == null) {
				this.field2341 = 0;
			} else {
				this.field2341 = 2;
			}
		}

		if (this.field2366 == -1) {
			if (this.field2359 == null && this.field2358 == null) {
				this.field2366 = 0;
			} else {
				this.field2366 = 2;
			}
		}

		if (this.frameLengths != null) {
			this.field2368 = 0;

			for (int var1 = 0; var1 < this.frameLengths.length; ++var1) {
				this.field2368 += this.frameLengths[var1];
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljm;II)Ljm;",
		garbageValue = "557371985"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var8 = class278.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var8 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var7 = var1.toSharedSequenceModel(!var8.hasAlphaTransform(var2));
				var7.animate(var8, var2);
				return var7;
			}
		} else {
			int var4 = this.SequenceDefinition_cachedModelId;
			class143 var3;
			if (class36.method700(var4) != 0) {
				var3 = null;
			} else {
				var3 = UserComparator4.method3387(var4);
			}

			if (var3 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var6 = var1.toSharedSequenceModel(!var3.method3596());
				var6.method5542(var3, var2);
				return var6;
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljm;III)Ljm;",
		garbageValue = "1481576141"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var9 = class278.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var9 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var8 = var1.toSharedSequenceModel(!var9.hasAlphaTransform(var2));
				var3 &= 3;
				if (var3 == 1) {
					var8.rotateY270Ccw();
				} else if (var3 == 2) {
					var8.rotateY180();
				} else if (var3 == 3) {
					var8.rotateY90Ccw();
				}

				var8.animate(var9, var2);
				if (var3 == 1) {
					var8.rotateY90Ccw();
				} else if (var3 == 2) {
					var8.rotateY180();
				} else if (var3 == 3) {
					var8.rotateY270Ccw();
				}

				return var8;
			}
		} else {
			int var5 = this.SequenceDefinition_cachedModelId;
			class143 var4;
			if (class36.method700(var5) != 0) {
				var4 = null;
			} else {
				var4 = UserComparator4.method3387(var5);
			}

			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var7 = var1.toSharedSequenceModel(!var4.method3596());
				var3 &= 3;
				if (var3 == 1) {
					var7.rotateY270Ccw();
				} else if (var3 == 2) {
					var7.rotateY180();
				} else if (var3 == 3) {
					var7.rotateY90Ccw();
				}

				var7.method5542(var4, var2);
				if (var3 == 1) {
					var7.rotateY90Ccw();
				} else if (var3 == 2) {
					var7.rotateY180();
				} else if (var3 == 3) {
					var7.rotateY270Ccw();
				}

				return var7;
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljm;II)Ljm;",
		garbageValue = "-1971453857"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var8 = class278.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var8 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				Model var7 = var1.toSharedSpotAnimationModel(!var8.hasAlphaTransform(var2));
				var7.animate(var8, var2);
				return var7;
			}
		} else {
			int var4 = this.SequenceDefinition_cachedModelId;
			class143 var3;
			if (class36.method700(var4) != 0) {
				var3 = null;
			} else {
				var3 = UserComparator4.method3387(var4);
			}

			if (var3 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				Model var6 = var1.toSharedSpotAnimationModel(!var3.method3596());
				var6.method5542(var3, var2);
				return var6;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljm;ILip;II)Ljm;",
		garbageValue = "-1053294933"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2365 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) {
			return this.method4570(var1, var2, var3, var4);
		} else {
			Model var5 = var1.toSharedSequenceModel(false);
			boolean var6 = false;
			Frames var7 = null;
			Skeleton var8 = null;
			class143 var9;
			if (this.isCachedModelIdSet()) {
				var9 = this.method4574();
				if (var9 == null) {
					return var5;
				}

				if (var3.isCachedModelIdSet() && this.field2358 == null) {
					var5.method5542(var9, var2);
					return var5;
				}

				var8 = var9.field1669;
				var5.method5546(var8, var9, var2, this.field2358, false, !var3.isCachedModelIdSet());
			} else {
				var2 = this.frameIds[var2];
				var7 = class278.getFrames(var2 >> 16);
				var2 &= 65535;
				if (var7 == null) {
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field2359 == null || var4 == -1)) {
					var5.animate(var7, var2);
					return var5;
				}

				if (this.field2359 == null || var4 == -1) {
					var5.animate(var7, var2);
					return var5;
				}

				var6 = var3.isCachedModelIdSet();
				if (!var6) {
					var5.method5547(var7, var2, this.field2359, false);
				}
			}

			if (var3.isCachedModelIdSet()) {
				var9 = var3.method4574();
				if (var9 == null) {
					return var5;
				}

				if (var8 == null) {
					var8 = var9.field1669;
				}

				var5.method5546(var8, var9, var4, this.field2358, true, true);
			} else {
				var4 = var3.frameIds[var4];
				Frames var10 = class278.getFrames(var4 >> 16);
				var4 &= 65535;
				if (var10 == null) {
					return this.transformActorModel(var1, var2);
				}

				var5.method5547(var10, var4, this.field2359, true);
			}

			if (var6 && var7 != null) {
				var5.method5547(var7, var2, this.field2359, false);
			}

			var5.resetBounds();
			return var5;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljm;ILip;IB)Ljm;",
		garbageValue = "2"
	)
	Model method4570(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = class278.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = class278.getFrames(var4 >> 16);
			var4 &= 65535;
			Model var7;
			if (var6 == null) {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var7.animate(var5, var2);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
				var7.animate2(var5, var2, var6, var4, this.field2359);
				return var7;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljm;II)Ljm;",
		garbageValue = "-123374290"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			int var3 = this.frameIds[var2];
			Frames var4 = class278.getFrames(var3 >> 16);
			var3 &= 65535;
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null;
				int var6 = 0;
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
					var6 = this.chatFrameIds[var2];
					var5 = class278.getFrames(var6 >> 16);
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-55"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-749342072"
	)
	@Export("getMayaAnimFrame")
	public int getMayaAnimFrame() {
		return this.field2347 - this.field2350;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Lfj;",
		garbageValue = "3"
	)
	class143 method4574() {
		if (this.isCachedModelIdSet()) {
			int var2 = this.SequenceDefinition_cachedModelId;
			class143 var1;
			if (class36.method700(var2) != 0) {
				var1 = null;
			} else {
				var1 = UserComparator4.method3387(var2);
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("al")
	public static int method4597(long var0) {
		int var2 = (int)(var0 >>> 52 & 4095L);
		if ((long)var2 == 4095L) {
			var2 = -1;
		}

		return var2;
	}
}
