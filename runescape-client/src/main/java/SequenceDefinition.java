import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("ab")
	static boolean field2298;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("SequenceDefinition_archive")
	static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("SequenceDefinition_animationsArchive")
	static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("SequenceDefinition_cached")
	static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("SequenceDefinition_cachedFrames")
	static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("SequenceDefinition_cachedModel")
	static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -880664415
	)
	@Export("SequenceDefinition_cachedModelId")
	public int SequenceDefinition_cachedModelId;
	@ObfuscatedName("ai")
	public Map field2315;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1336197137
	)
	int field2306;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -292086609
	)
	int field2307;
	@ObfuscatedName("as")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("az")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("ak")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1322530263
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("ah")
	int[] field2321;
	@ObfuscatedName("ad")
	boolean[] field2313;
	@ObfuscatedName("ay")
	public boolean field2314;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -648215969
	)
	public int field2319;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -692082349
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -694949763
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -690068257
	)
	public int field2295;
	@ObfuscatedName("ag")
	public boolean field2299;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1180378393
	)
	public int field2320;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1691171973
	)
	public int field2312;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1554960293
	)
	@Export("restartMode")
	public int restartMode;

	static {
		field2298 = false;
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100);
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1;
		this.field2306 = 0;
		this.field2307 = 0;
		this.frameCount = -1;
		this.field2314 = false;
		this.field2319 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field2295 = 99;
		this.field2299 = false;
		this.field2320 = -1;
		this.field2312 = -1;
		this.restartMode = 2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lvj;I)V",
		garbageValue = "422165595"
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvj;II)V",
		garbageValue = "575227238"
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
			this.field2321 = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2321[var4] = var1.readUnsignedByte();
			}

			this.field2321[var3] = 9999999;
		} else if (var2 == 4) {
			this.field2314 = true;
		} else if (var2 == 5) {
			this.field2319 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field2295 = var1.readUnsignedByte();
			this.field2299 = true;
		} else if (var2 == 9) {
			this.field2320 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field2312 = var1.readUnsignedByte();
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
			if (this.field2315 == null) {
				this.field2315 = new HashMap();
			}

			for (var4 = 0; var4 < var3; ++var4) {
				int var5 = var1.readUnsignedShort();
				class208 var6 = class225.method4452(var1);
				if (var6 != null) {
					if (!this.field2315.containsKey(var5)) {
						this.field2315.put(var5, new ArrayList());
					}

					((ArrayList)this.field2315.get(var5)).add(var6);
				}
			}
		} else if (var2 == 15) {
			this.field2306 = var1.readUnsignedShort();
			this.field2307 = var1.readUnsignedShort();
		} else if (var2 == 17) {
			this.field2313 = new boolean[256];

			for (var3 = 0; var3 < this.field2313.length; ++var3) {
				this.field2313[var3] = false;
			}

			var3 = var1.readUnsignedByte();

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2313[var1.readUnsignedByte()] = true;
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1908682735"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2320 == -1) {
			if (this.field2321 == null && this.field2313 == null) {
				this.field2320 = 0;
			} else {
				this.field2320 = 2;
			}
		}

		if (this.field2312 == -1) {
			if (this.field2321 == null && this.field2313 == null) {
				this.field2312 = 0;
			} else {
				this.field2312 = 2;
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljt;IB)Ljt;",
		garbageValue = "6"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var8 = LoginScreenAnimation.getFrames(var2 >> 16);
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
			class145 var3;
			if (class150.method3462(var4) != 0) {
				var3 = null;
			} else {
				class145 var6 = (class145)SequenceDefinition_cachedModel.get((long)var4);
				class145 var5;
				if (var6 != null) {
					var5 = var6;
				} else {
					var6 = WorldMapID.method6239(SequenceDefinition_animationsArchive, SequenceDefinition_skeletonsArchive, var4, false);
					if (var6 != null) {
						SequenceDefinition_cachedModel.put(var6, (long)var4);
					}

					var5 = var6;
				}

				var3 = var5;
			}

			if (var3 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var9 = var1.toSharedSequenceModel(!var3.method3406());
				var9.method5255(var3, var2);
				return var9;
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljt;IIB)Ljt;",
		garbageValue = "126"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var9 = LoginScreenAnimation.getFrames(var2 >> 16);
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
			class145 var4;
			if (class150.method3462(var5) != 0) {
				var4 = null;
			} else {
				class145 var7 = (class145)SequenceDefinition_cachedModel.get((long)var5);
				class145 var6;
				if (var7 != null) {
					var6 = var7;
				} else {
					var7 = WorldMapID.method6239(SequenceDefinition_animationsArchive, SequenceDefinition_skeletonsArchive, var5, false);
					if (var7 != null) {
						SequenceDefinition_cachedModel.put(var7, (long)var5);
					}

					var6 = var7;
				}

				var4 = var6;
			}

			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var10 = var1.toSharedSequenceModel(!var4.method3406());
				var3 &= 3;
				if (var3 == 1) {
					var10.rotateY270Ccw();
				} else if (var3 == 2) {
					var10.rotateY180();
				} else if (var3 == 3) {
					var10.rotateY90Ccw();
				}

				var10.method5255(var4, var2);
				if (var3 == 1) {
					var10.rotateY90Ccw();
				} else if (var3 == 2) {
					var10.rotateY180();
				} else if (var3 == 3) {
					var10.rotateY270Ccw();
				}

				return var10;
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljt;II)Ljt;",
		garbageValue = "1707961966"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var8 = LoginScreenAnimation.getFrames(var2 >> 16);
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
			class145 var3;
			if (class150.method3462(var4) != 0) {
				var3 = null;
			} else {
				class145 var6 = (class145)SequenceDefinition_cachedModel.get((long)var4);
				class145 var5;
				if (var6 != null) {
					var5 = var6;
				} else {
					var6 = WorldMapID.method6239(SequenceDefinition_animationsArchive, SequenceDefinition_skeletonsArchive, var4, false);
					if (var6 != null) {
						SequenceDefinition_cachedModel.put(var6, (long)var4);
					}

					var5 = var6;
				}

				var3 = var5;
			}

			if (var3 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				Model var9 = var1.toSharedSpotAnimationModel(!var3.method3406());
				var9.method5255(var3, var2);
				return var9;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljt;ILiy;IS)Ljt;",
		garbageValue = "20933"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2298 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) {
			return this.method4294(var1, var2, var3, var4);
		} else {
			Model var5 = var1.toSharedSequenceModel(false);
			boolean var6 = false;
			Frames var7 = null;
			Skeleton var8 = null;
			class145 var9;
			if (this.isCachedModelIdSet()) {
				var9 = this.method4270();
				if (var9 == null) {
					return var5;
				}

				if (var3.isCachedModelIdSet() && this.field2313 == null) {
					var5.method5255(var9, var2);
					return var5;
				}

				var8 = var9.field1648;
				var5.method5363(var8, var9, var2, this.field2313, false, !var3.isCachedModelIdSet());
			} else {
				var2 = this.frameIds[var2];
				var7 = LoginScreenAnimation.getFrames(var2 >> 16);
				var2 &= 65535;
				if (var7 == null) {
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field2321 == null || var4 == -1)) {
					var5.animate(var7, var2);
					return var5;
				}

				if (this.field2321 == null || var4 == -1) {
					var5.animate(var7, var2);
					return var5;
				}

				var6 = var3.isCachedModelIdSet();
				if (!var6) {
					var5.method5260(var7, var2, this.field2321, false);
				}
			}

			if (var3.isCachedModelIdSet()) {
				var9 = var3.method4270();
				if (var9 == null) {
					return var5;
				}

				if (var8 == null) {
					var8 = var9.field1648;
				}

				var5.method5363(var8, var9, var4, this.field2313, true, true);
			} else {
				var4 = var3.frameIds[var4];
				Frames var10 = LoginScreenAnimation.getFrames(var4 >> 16);
				var4 &= 65535;
				if (var10 == null) {
					return this.transformActorModel(var1, var2);
				}

				var5.method5260(var10, var4, this.field2321, true);
			}

			if (var6 && var7 != null) {
				var5.method5260(var7, var2, this.field2321, false);
			}

			var5.resetBounds();
			return var5;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljt;ILiy;IB)Ljt;",
		garbageValue = "22"
	)
	Model method4294(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = LoginScreenAnimation.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = LoginScreenAnimation.getFrames(var4 >> 16);
			var4 &= 65535;
			Model var7;
			if (var6 == null) {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var7.animate(var5, var2);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
				var7.animate2(var5, var2, var6, var4, this.field2321);
				return var7;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljt;II)Ljt;",
		garbageValue = "1718742978"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			int var3 = this.frameIds[var2];
			Frames var4 = LoginScreenAnimation.getFrames(var3 >> 16);
			var3 &= 65535;
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null;
				int var6 = 0;
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
					var6 = this.chatFrameIds[var2];
					var5 = LoginScreenAnimation.getFrames(var6 >> 16);
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-17082"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1227566721"
	)
	@Export("getMayaAnimFrame")
	public int getMayaAnimFrame() {
		return this.field2307 - this.field2306;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lfz;",
		garbageValue = "-436390314"
	)
	class145 method4270() {
		if (this.isCachedModelIdSet()) {
			int var2 = this.SequenceDefinition_cachedModelId;
			class145 var1;
			if (class150.method3462(var2) != 0) {
				var1 = null;
			} else {
				class145 var4 = (class145)SequenceDefinition_cachedModel.get((long)var2);
				class145 var3;
				if (var4 != null) {
					var3 = var4;
				} else {
					var4 = WorldMapID.method6239(SequenceDefinition_animationsArchive, SequenceDefinition_skeletonsArchive, var2, false);
					if (var4 != null) {
						SequenceDefinition_cachedModel.put(var4, (long)var2);
					}

					var3 = var4;
				}

				var1 = var3;
			}

			return var1;
		} else {
			return null;
		}
	}
}
