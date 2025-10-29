import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("SequenceDefinition_cachedModel")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("bg")
	static boolean field2494;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -326405849
	)
	@Export("SequenceDefinition_cachedModelId")
	public int SequenceDefinition_cachedModelId;
	@ObfuscatedName("bz")
	public Map field2500;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1612989987
	)
	int field2501;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1967825623
	)
	int field2502;
	@ObfuscatedName("bj")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("bm")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("bp")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1278679125
	)
	public int field2491;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1996641051
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("ba")
	int[] field2508;
	@ObfuscatedName("bi")
	boolean[] field2509;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 89078819
	)
	@Export("animationHeightOffset")
	public int animationHeightOffset;
	@ObfuscatedName("bw")
	public boolean field2486;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1808717695
	)
	public int field2512;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 972490383
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -455776013
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 522964681
	)
	public int field2485;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 1930490603
	)
	public int field2498;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1606113103
	)
	public int field2517;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 564693013
	)
	@Export("restartMode")
	public int restartMode;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -808909293
	)
	int field2519;
	@ObfuscatedName("bx")
	public boolean field2511;

	static {
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100);
		field2494 = false;
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1;
		this.field2501 = 0;
		this.field2502 = 0;
		this.frameCount = -1;
		this.animationHeightOffset = 0;
		this.field2486 = false;
		this.field2512 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field2485 = 99;
		this.field2498 = -1;
		this.field2517 = -1;
		this.restartMode = 2;
		this.field2511 = false;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxa;I)V",
		garbageValue = "982817741"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lxa;II)V",
		garbageValue = "1076101603"
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
			this.field2508 = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2508[var4] = var1.readUnsignedByte();
			}

			this.field2508[var3] = 9999999;
		} else if (var2 == 4) {
			this.field2486 = true;
		} else if (var2 == 5) {
			this.field2512 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field2485 = var1.readUnsignedByte();
		} else if (var2 == 9) {
			this.field2498 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field2517 = var1.readUnsignedByte();
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
			if (this.field2500 == null) {
				this.field2500 = new HashMap();
			}

			for (var4 = 0; var4 < var3; ++var4) {
				int var5;
				class217 var6;
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
							var6 = new class217(var13, var14, var15, var16, var17);
							break label160;
						}
					}

					var6 = null;
				}

				if (var6 != null) {
					if (!this.field2500.containsKey(var5)) {
						this.field2500.put(var5, new ArrayList());
					}

					((ArrayList)this.field2500.get(var5)).add(var6);
				}
			}
		} else if (var2 == 15) {
			this.field2501 = var1.readUnsignedShort();
			this.field2502 = var1.readUnsignedShort();
		} else if (var2 == 16) {
			this.animationHeightOffset = var1.readByte();
		} else if (var2 == 17) {
			this.field2509 = new boolean[256];

			for (var3 = 0; var3 < this.field2509.length; ++var3) {
				this.field2509[var3] = false;
			}

			var3 = var1.readUnsignedByte();

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2509[var1.readUnsignedByte()] = true;
			}
		} else if (var2 == 19) {
			this.field2511 = true;
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-803457323"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2498 == -1) {
			if (this.field2508 == null && this.field2509 == null) {
				this.field2498 = 0;
			} else {
				this.field2498 = 2;
			}
		}

		if (this.field2517 == -1) {
			if (this.field2508 == null && this.field2509 == null) {
				this.field2517 = 0;
			} else {
				this.field2517 = 2;
			}
		}

		if (this.frameLengths != null) {
			this.field2491 = 0;

			for (int var1 = 0; var1 < this.frameLengths.length; ++var1) {
				this.field2491 += this.frameLengths[var1];
			}
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lky;IB)Lky;",
		garbageValue = "45"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var14 = UrlRequest.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var14 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var4 = var1.toSharedSequenceModel(!var14.hasAlphaTransform(var2));
				var4.animate(var14, var2);
				return var4;
			}
		} else {
			int var12 = this.SequenceDefinition_cachedModelId;
			class146 var3;
			if (HitSplatDefinition.method4740(var12) != 0) {
				var3 = null;
			} else {
				class146 var6 = (class146)SequenceDefinition_cachedModel.get((long)var12);
				class146 var5;
				if (var6 != null) {
					var5 = var6;
				} else {
					AbstractArchive var8 = WorldMapData_0.SequenceDefinition_skeletonsArchive;
					AbstractArchive var9 = WorldMapIcon_0.SpotAnimationDefinition_archive;
					boolean var10 = WorldMapSectionType.method6969(var8, var9, var12);
					class146 var7;
					if (!var10) {
						var7 = null;
					} else {
						if (class146.field1722 == null) {
							class146.field1720 = Runtime.getRuntime().availableProcessors();
							class146.field1722 = new ThreadPoolExecutor(0, class146.field1720, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(class146.field1720 * 100 + 100), new class214(this));
						}

						try {
							var7 = new class146(var8, var9, var12);
						} catch (Exception var13) {
							var7 = null;
						}
					}

					if (var7 != null) {
						SequenceDefinition_cachedModel.put(var7, (long)var12);
					}

					var5 = var7;
				}

				var3 = var5;
			}

			if (var3 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var15 = var1.toSharedSequenceModel(!var3.method3935());
				var15.method5924(var3, var2);
				return var15;
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "86176398"
	)
	public boolean method4938(int var1) {
		if (this.shield <= 0 && this.weapon <= 0) {
			if (!this.isCachedModelIdSet()) {
				var1 = this.frameIds[var1];
				Frames var12 = UrlRequest.getFrames(var1 >> 16);
				var1 &= 65535;
				return var12 == null ? false : var12.hasAlphaTransform(var1);
			} else {
				int var3 = this.SequenceDefinition_cachedModelId;
				class146 var2;
				if (HitSplatDefinition.method4740(var3) != 0) {
					var2 = null;
				} else {
					class146 var5 = (class146)SequenceDefinition_cachedModel.get((long)var3);
					class146 var4;
					if (var5 != null) {
						var4 = var5;
					} else {
						AbstractArchive var7 = WorldMapData_0.SequenceDefinition_skeletonsArchive;
						AbstractArchive var8 = WorldMapIcon_0.SpotAnimationDefinition_archive;
						boolean var9 = WorldMapSectionType.method6969(var7, var8, var3);
						class146 var6;
						if (!var9) {
							var6 = null;
						} else {
							if (class146.field1722 == null) {
								class146.field1720 = Runtime.getRuntime().availableProcessors();
								class146.field1722 = new ThreadPoolExecutor(0, class146.field1720, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(class146.field1720 * 100 + 100), new class208(this));
							}

							try {
								var6 = new class146(var7, var8, var3);
							} catch (Exception var11) {
								var6 = null;
							}
						}

						if (var6 != null) {
							SequenceDefinition_cachedModel.put(var6, (long)var3);
						}

						var4 = var6;
					}

					var2 = var4;
				}

				return var2 == null ? false : var2.method3935();
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lky;IIB)Lky;",
		garbageValue = "108"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var15 = UrlRequest.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var15 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var5 = var1.toSharedSequenceModel(!var15.hasAlphaTransform(var2));
				var3 &= 3;
				if (var3 == 1) {
					var5.rotateY270Ccw();
				} else if (var3 == 2) {
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY90Ccw();
				}

				var5.animate(var15, var2);
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
			int var13 = this.SequenceDefinition_cachedModelId;
			class146 var4;
			if (HitSplatDefinition.method4740(var13) != 0) {
				var4 = null;
			} else {
				class146 var7 = (class146)SequenceDefinition_cachedModel.get((long)var13);
				class146 var6;
				if (var7 != null) {
					var6 = var7;
				} else {
					AbstractArchive var9 = WorldMapData_0.SequenceDefinition_skeletonsArchive;
					AbstractArchive var10 = WorldMapIcon_0.SpotAnimationDefinition_archive;
					boolean var11 = WorldMapSectionType.method6969(var9, var10, var13);
					class146 var8;
					if (!var11) {
						var8 = null;
					} else {
						if (class146.field1722 == null) {
							class146.field1720 = Runtime.getRuntime().availableProcessors();
							class146.field1722 = new ThreadPoolExecutor(0, class146.field1720, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(class146.field1720 * 100 + 100), new class190(this));
						}

						try {
							var8 = new class146(var9, var10, var13);
						} catch (Exception var14) {
							var8 = null;
						}
					}

					if (var8 != null) {
						SequenceDefinition_cachedModel.put(var8, (long)var13);
					}

					var6 = var8;
				}

				var4 = var6;
			}

			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var16 = var1.toSharedSequenceModel(!var4.method3935());
				var3 &= 3;
				if (var3 == 1) {
					var16.rotateY270Ccw();
				} else if (var3 == 2) {
					var16.rotateY180();
				} else if (var3 == 3) {
					var16.rotateY90Ccw();
				}

				var16.method5924(var4, var2);
				if (var3 == 1) {
					var16.rotateY90Ccw();
				} else if (var3 == 2) {
					var16.rotateY180();
				} else if (var3 == 3) {
					var16.rotateY270Ccw();
				}

				return var16;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lky;II)Lky;",
		garbageValue = "-1088717506"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var14 = UrlRequest.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var14 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				Model var4 = var1.toSharedSpotAnimationModel(!var14.hasAlphaTransform(var2));
				var4.animate(var14, var2);
				return var4;
			}
		} else {
			int var12 = this.SequenceDefinition_cachedModelId;
			class146 var3;
			if (HitSplatDefinition.method4740(var12) != 0) {
				var3 = null;
			} else {
				class146 var6 = (class146)SequenceDefinition_cachedModel.get((long)var12);
				class146 var5;
				if (var6 != null) {
					var5 = var6;
				} else {
					AbstractArchive var8 = WorldMapData_0.SequenceDefinition_skeletonsArchive;
					AbstractArchive var9 = WorldMapIcon_0.SpotAnimationDefinition_archive;
					boolean var10 = WorldMapSectionType.method6969(var8, var9, var12);
					class146 var7;
					if (!var10) {
						var7 = null;
					} else {
						if (class146.field1722 == null) {
							class146.field1720 = Runtime.getRuntime().availableProcessors();
							class146.field1722 = new ThreadPoolExecutor(0, class146.field1720, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(class146.field1720 * 100 + 100), new class195(this));
						}

						try {
							var7 = new class146(var8, var9, var12);
						} catch (Exception var13) {
							var7 = null;
						}
					}

					if (var7 != null) {
						SequenceDefinition_cachedModel.put(var7, (long)var12);
					}

					var5 = var7;
				}

				var3 = var5;
			}

			if (var3 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				Model var15 = var1.toSharedSpotAnimationModel(!var3.method3935());
				var15.method5924(var3, var2);
				return var15;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lky;ILiw;II)Lky;",
		garbageValue = "1784213328"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2494 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) {
			return this.method4984(var1, var2, var3, var4);
		} else {
			Model var5 = var1.toSharedSequenceModel(false);
			boolean var6 = false;
			Frames var7 = null;
			Skeleton var8 = null;
			class146 var9;
			if (this.isCachedModelIdSet()) {
				var9 = this.method4933();
				if (var9 == null) {
					return var5;
				}

				if (var3.isCachedModelIdSet() && this.field2509 == null) {
					var5.method5924(var9, var2);
					return var5;
				}

				var8 = var9.field1721;
				var5.method6006(var8, var9, var2, this.field2509, false, !var3.isCachedModelIdSet());
			} else {
				var2 = this.frameIds[var2];
				var7 = UrlRequest.getFrames(var2 >> 16);
				var2 &= 65535;
				if (var7 == null) {
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field2508 == null || var4 == -1)) {
					var5.animate(var7, var2);
					return var5;
				}

				if (this.field2508 == null || var4 == -1) {
					var5.animate(var7, var2);
					return var5;
				}

				var6 = var3.isCachedModelIdSet();
				if (!var6) {
					var5.method6053(var7, var2, this.field2508, false);
				}
			}

			if (var3.isCachedModelIdSet()) {
				var9 = var3.method4933();
				if (var9 == null) {
					return var5;
				}

				if (var8 == null) {
					var8 = var9.field1721;
				}

				var5.method6006(var8, var9, var4, this.field2509, true, true);
			} else {
				var4 = var3.frameIds[var4];
				Frames var10 = UrlRequest.getFrames(var4 >> 16);
				var4 &= 65535;
				if (var10 == null) {
					return this.transformActorModel(var1, var2);
				}

				var5.method6053(var10, var4, this.field2508, true);
			}

			if (var6 && var7 != null) {
				var5.method6053(var7, var2, this.field2508, false);
			}

			var5.resetBounds();
			return var5;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lky;ILiw;IB)Lky;",
		garbageValue = "-121"
	)
	Model method4984(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = UrlRequest.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = UrlRequest.getFrames(var4 >> 16);
			var4 &= 65535;
			Model var7;
			if (var6 == null) {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var7.animate(var5, var2);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
				var7.animate2(var5, var2, var6, var4, this.field2508);
				return var7;
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lky;IB)Lky;",
		garbageValue = "0"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			int var3 = this.frameIds[var2];
			Frames var4 = UrlRequest.getFrames(var3 >> 16);
			var3 &= 65535;
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null;
				int var6 = 0;
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
					var6 = this.chatFrameIds[var2];
					var5 = UrlRequest.getFrames(var6 >> 16);
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-68"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "113"
	)
	@Export("getMayaAnimFrame")
	public int getMayaAnimFrame() {
		return this.field2502 - this.field2501;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "456586728"
	)
	int method4932() {
		return this.isCachedModelIdSet() ? HitSplatDefinition.method4740(this.SequenceDefinition_cachedModelId) : 2;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Lfy;",
		garbageValue = "28"
	)
	public class146 method4933() {
		if (this.isCachedModelIdSet()) {
			int var2 = this.SequenceDefinition_cachedModelId;
			class146 var1;
			if (HitSplatDefinition.method4740(var2) != 0) {
				var1 = null;
			} else {
				class146 var4 = (class146)SequenceDefinition_cachedModel.get((long)var2);
				class146 var3;
				if (var4 != null) {
					var3 = var4;
				} else {
					AbstractArchive var6 = WorldMapData_0.SequenceDefinition_skeletonsArchive;
					AbstractArchive var7 = WorldMapIcon_0.SpotAnimationDefinition_archive;
					boolean var8 = WorldMapSectionType.method6969(var6, var7, var2);
					class146 var5;
					if (!var8) {
						var5 = null;
					} else {
						if (class146.field1722 == null) {
							class146.field1720 = Runtime.getRuntime().availableProcessors();
							class146.field1722 = new ThreadPoolExecutor(0, class146.field1720, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(class146.field1720 * 100 + 100), new class192(this));
						}

						try {
							var5 = new class146(var6, var7, var2);
						} catch (Exception var10) {
							var5 = null;
						}
					}

					if (var5 != null) {
						SequenceDefinition_cachedModel.put(var5, (long)var2);
					}

					var3 = var5;
				}

				var1 = var3;
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1133548269"
	)
	public int method4943() {
		return this.field2519;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-72"
	)
	public boolean method4925() {
		if (this.isCachedModelIdSet()) {
			return this.method4932() == 0;
		} else {
			return this.frameIds != null && this.frameIds.length > 0 && UrlRequest.getFrames(this.frameIds[0] >> 16) != null;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ldd;[BIIIIIIIIII)V",
		garbageValue = "-1062878705"
	)
	static final void method4986(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		CollisionMap[] var11 = var0.collisionMaps;
		int var13;
		int var14;
		if (var11 != null && var2 >= 0 && var2 < var11.length) {
			CollisionMap var12 = var11[var2];

			for (var13 = var3; var13 < var3 + 8; ++var13) {
				for (var14 = var4; var14 < var4 + 8; ++var14) {
					if (var12.method6338(var13, var14)) {
						var12.method6355(var13, var14, 1073741824);
					}
				}
			}
		}

		Buffer var25 = new Buffer(var1);

		int var15;
		int var16;
		for (var13 = 0; var13 < 4; ++var13) {
			for (var14 = 0; var14 < 64; ++var14) {
				for (var15 = 0; var15 < 64; ++var15) {
					if (var5 == var13 && var14 >= var6 && var14 < var6 + 8 && var15 >= var7 && var15 < var7 + 8) {
						var16 = var3 + FontName.method11264(var14 & 7, var15 & 7, var8);
						int var19 = var14 & 7;
						int var20 = var15 & 7;
						int var21 = var8 & 3;
						int var18;
						if (var21 == 0) {
							var18 = var20;
						} else if (var21 == 1) {
							var18 = 7 - var19;
						} else if (var21 == 2) {
							var18 = 7 - var20;
						} else {
							var18 = var19;
						}

						int var22 = var4 + var18;
						int var23 = var3 + (var14 & 7) + var9;
						int var24 = var10 + (var15 & 7) + var4;
						class264.loadTerrain(var0, var25, var2, var16, var22, var23, var24, var8);
					} else {
						class264.loadTerrain(var0, var25, 0, -1, -1, 0, 0, 0);
					}
				}
			}
		}

		var13 = var25.offset * 2108391709 < var25.array.length ? var25.readUnsignedByte() : 0;
		boolean var26 = (var13 & 1) != 0;
		if (var26) {
			for (var15 = 0; var15 < 64; ++var15) {
				for (var16 = 0; var16 < 64; ++var16) {
					class148.method3945(var25);
				}
			}
		}

	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-679991811"
	)
	static int method4937(int var0) {
		return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F));
	}
}
