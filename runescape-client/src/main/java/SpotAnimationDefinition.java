import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("SpotAnimationDefinition_archive")
	static AbstractArchive SpotAnimationDefinition_archive;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("SpotAnimationDefinition_cached")
	static EvictingDualNodeHashTable SpotAnimationDefinition_cached;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("SpotAnimationDefinition_cachedModels")
	static EvictingDualNodeHashTable SpotAnimationDefinition_cachedModels;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -752965949
	)
	@Export("id")
	int id;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1176734879
	)
	@Export("archive")
	int archive;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -178987099
	)
	@Export("sequence")
	public int sequence;
	@ObfuscatedName("av")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("au")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("an")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("af")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 219714337
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1388578141
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1443191599
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 777885749
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 390783667
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lvj;B)V",
		garbageValue = "100"
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
		descriptor = "(Lvj;IS)V",
		garbageValue = "-7577"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Ljt;",
		garbageValue = "-1783715862"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		Model var2 = this.method3977();
		if (var2 == null) {
			return null;
		} else {
			Model var3;
			if (this.sequence != -1 && var1 != -1) {
				var3 = HealthBarDefinition.SequenceDefinition_get(this.sequence).transformSpotAnimationModel(var2, var1);
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ljt;",
		garbageValue = "1731413726"
	)
	public final Model method3977() {
		Model var1 = (Model)SpotAnimationDefinition_cachedModels.get((long)this.id);
		if (var1 == null) {
			ModelData var2 = ModelData.ModelData_get(class36.SpotAnimationDefinition_modelArchive, this.archive, 0);
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

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(IIIIISISIIB)V",
		garbageValue = "120"
	)
	static void method3990(int var0, int var1, int var2, int var3, int var4, short var5, int var6, short var7, int var8, int var9) {
		NodeDeque var10 = Projection.worldView.groundItems[var0][var1][var2];
		if (var10 != null) {
			for (TileItem var11 = (TileItem)var10.last(); var11 != null; var11 = (TileItem)var10.previous()) {
				if ((var3 & 32767) == var11.id && var4 == var11.quantity) {
					PlayerCompositionColorTextureOverride var12 = var11.method2996();
					if (var12 == null) {
						var12 = new PlayerCompositionColorTextureOverride(var3);
					}

					if (var12.method3720() && var6 > -1 && var6 < var12.playerCompositionRecolorTo.length) {
						var12.playerCompositionRecolorTo[var6] = var5;
					}

					if (var12.method3702() && var8 > -1 && var8 < var12.playerCompositionRetextureTo.length) {
						var12.playerCompositionRetextureTo[var8] = var7;
					}

					if (var9 > -1) {
						var12.field1832 = var9;
						var12.field1843 = null;
					}

					var11.method2995(var12);
					break;
				}
			}

			class173.updateItemPile(var0, var1, var2);
		}

	}
}
