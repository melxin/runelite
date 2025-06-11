import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	public static AbstractArchive field2117;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("SpotAnimationDefinition_modelArchive")
	public static AbstractArchive SpotAnimationDefinition_modelArchive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("SpotAnimationDefinition_cached")
	public static EvictingDualNodeHashTable SpotAnimationDefinition_cached;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("SpotAnimationDefinition_cachedModels")
	public static EvictingDualNodeHashTable SpotAnimationDefinition_cachedModels;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1701957071
	)
	@Export("id")
	int id;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 995465221
	)
	@Export("archive")
	int archive;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1901225809
	)
	@Export("sequence")
	public int sequence;
	@ObfuscatedName("am")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("ah")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("ag")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("au")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 304266475
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 583921253
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 2066928075
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1994917653
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1904574911
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "124018297"
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lwt;IB)V",
		garbageValue = "-1"
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
		} else if (var2 == 9) {
			var1.readStringCp1252NullTerminated();
		} else {
			int var3;
			int var4;
			if (var2 == 40) {
				var3 = var1.readUnsignedByte();
				this.recolorFrom = new short[var3];
				this.retextureTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.recolorFrom[var4] = (short)var1.readUnsignedShort();
					this.retextureTo[var4] = (short)var1.readUnsignedShort();
				}
			} else if (var2 == 41) {
				var3 = var1.readUnsignedByte();
				this.retextureFrom = new short[var3];
				this.recolorTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.retextureFrom[var4] = (short)var1.readUnsignedShort();
					this.recolorTo[var4] = (short)var1.readUnsignedShort();
				}
			}
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljm;",
		garbageValue = "-1"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		Model var2 = this.method4238();
		if (var2 == null) {
			return null;
		} else {
			Model var3;
			if (this.sequence != -1 && var1 != -1) {
				var3 = VarpDefinition.SequenceDefinition_get(this.sequence).transformSpotAnimationModel(var2, var1);
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Ljm;",
		garbageValue = "-625895714"
	)
	public final Model method4238() {
		Model var1 = (Model)SpotAnimationDefinition_cachedModels.get((long)this.id);
		if (var1 == null) {
			ModelData var2 = ModelData.ModelData_get(SpotAnimationDefinition_modelArchive, this.archive, 0);
			if (var2 == null) {
				return null;
			}

			int var3;
			if (this.recolorFrom != null) {
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) {
					var2.recolor(this.recolorFrom[var3], this.retextureTo[var3]);
				}
			}

			if (this.retextureFrom != null) {
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) {
					var2.retexture(this.retextureFrom[var3], this.recolorTo[var3]);
				}
			}

			var1 = var2.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30);
			SpotAnimationDefinition_cachedModels.put(var1, (long)this.id);
		}

		return var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "7076"
	)
	public static void method4239() {
		DbTableType.DBTableType_cache.clear();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "14"
	)
	public static void method4249() {
		class202.field2136.clear();
	}
}
