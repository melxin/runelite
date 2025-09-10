import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	static AbstractArchive field2203;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("SpotAnimationDefinition_modelArchive")
	static AbstractArchive SpotAnimationDefinition_modelArchive;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("SpotAnimationDefinition_cached")
	static EvictingDualNodeHashTable SpotAnimationDefinition_cached;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("SpotAnimationDefinition_cachedModels")
	static EvictingDualNodeHashTable SpotAnimationDefinition_cachedModels;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 710494713
	)
	static int field2208;
	@ObfuscatedName("lp")
	@ObfuscatedGetter(
		intValue = -1527047515
	)
	static int field2210;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1499698493
	)
	@Export("id")
	int id;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1364881969
	)
	@Export("archive")
	int archive;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -89069183
	)
	@Export("sequence")
	public int sequence;
	@ObfuscatedName("as")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("al")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("au")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("ai")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1110143411
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 2127801363
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1239238851
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 407225999
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 378555605
	)
	@Export("contrast")
	int contrast;

	static {
		SpotAnimationDefinition_cached = new EvictingDualNodeHashTable(64);
		SpotAnimationDefinition_cachedModels = new EvictingDualNodeHashTable(30);
	}

	SpotAnimationDefinition() {
		this.sequence = -1;
		this.widthScale = 128;
		this.heightScale = 128;
		this.orientation = 0;
		this.ambient = 0;
		this.contrast = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lwb;B)V",
		garbageValue = "39"
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
		descriptor = "(Lwb;II)V",
		garbageValue = "720064470"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.archive = var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.sequence = var1.readUnsignedShort();
		} else if (var2 == 4) {
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 5) {
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 6) {
			this.orientation = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.ambient = var1.readUnsignedByte();
		} else if (var2 == 8) {
			this.contrast = var1.readUnsignedByte();
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
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljn;",
		garbageValue = "6"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		Model var2 = this.method4405();
		if (var2 == null) {
			return null;
		} else {
			Model var3;
			if (this.sequence != -1 && var1 != -1) {
				var3 = InvDefinition.SequenceDefinition_get(this.sequence).transformSpotAnimationModel(var2, var1);
			} else {
				var3 = var2.toSharedSpotAnimationModel(true);
			}

			if (this.widthScale != 128 || this.heightScale != 128) {
				var3.scale(this.widthScale, this.heightScale, this.widthScale);
			}

			if (this.orientation != 0) {
				if (this.orientation == 90) {
					var3.rotateY90Ccw();
				}

				if (this.orientation == 180) {
					var3.rotateY90Ccw();
					var3.rotateY90Ccw();
				}

				if (this.orientation == 270) {
					var3.rotateY90Ccw();
					var3.rotateY90Ccw();
					var3.rotateY90Ccw();
				}
			}

			return var3;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Ljn;",
		garbageValue = "1"
	)
	public final Model method4405() {
		Model var1 = (Model)SpotAnimationDefinition_cachedModels.get((long)this.id);
		if (var1 == null) {
			ModelData var2 = ModelData.ModelData_get(SpotAnimationDefinition_modelArchive, this.archive, 0);
			if (var2 == null) {
				return null;
			}

			int var3;
			if (this.recolorFrom != null) {
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) {
					var2.recolor(this.recolorFrom[var3], this.recolorTo[var3]);
				}
			}

			if (this.retextureFrom != null) {
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) {
					var2.retexture(this.retextureFrom[var3], this.retextureTo[var3]);
				}
			}

			var1 = var2.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30);
			SpotAnimationDefinition_cachedModels.put(var1, (long)this.id);
		}

		return var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SI)V",
		garbageValue = "-1205532986"
	)
	public static void method4404(String[] var0, short[] var1) {
		class400.sortItemsByName(var0, var1, 0, var0.length - 1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljn;IIIIFFFFIIII)Z",
		garbageValue = "-2021679335"
	)
	static final boolean method4424(Model var0, int var1, int var2, int var3, int var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11) {
		boolean var12 = ViewportMouse.ViewportMouse_isInViewport;
		if (!var12) {
			return false;
		} else {
			EnumComposition.method4304(var5, var6, var7, var8, var9, var10, var11);
			return class429.method8641(var0, var1, var2, var3, var4);
		}
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(IIIIISISIII)V",
		garbageValue = "-1941298663"
	)
	static void method4425(int var0, int var1, int var2, int var3, int var4, short var5, int var6, short var7, int var8, int var9) {
		class114.method3459(HttpHeaders.worldView, var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
	}
}
