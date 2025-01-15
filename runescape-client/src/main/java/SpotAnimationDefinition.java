import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	@Export("SpotAnimationDefinition_archive")
	static AbstractArchive SpotAnimationDefinition_archive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	@Export("SpotAnimationDefinition_modelArchive")
	static AbstractArchive SpotAnimationDefinition_modelArchive;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("SpotAnimationDefinition_cached")
	public static EvictingDualNodeHashTable SpotAnimationDefinition_cached;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("SpotAnimationDefinition_cachedModels")
	public static EvictingDualNodeHashTable SpotAnimationDefinition_cachedModels;
	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static Archive field2704;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1301972745
	)
	@Export("id")
	int id;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 141562829
	)
	@Export("archive")
	int archive;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 425218609
	)
	@Export("sequence")
	public int sequence;
	@ObfuscatedName("ax")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("at")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("ac")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("au")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2104753871
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1879181871
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1758727787
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -940508089
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1250873071
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "1007662088"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvy;II)V",
		garbageValue = "-1457934063"
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Lhv;",
		garbageValue = "-1427565975"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		Model var2 = this.method5365();
		if (var2 == null) {
			return null;
		} else {
			Model var3;
			if (this.sequence != -1 && var1 != -1) {
				var3 = class33.SequenceDefinition_get(this.sequence).transformSpotAnimationModel(var2, var1);
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Lhv;",
		garbageValue = "121"
	)
	public final Model method5365() {
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1699365126"
	)
	public static void method5377() {
		class257.field1909.clear();
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZB)I",
		garbageValue = "-13"
	)
	static int method5382(int var0, Script var1, boolean var2) {
		if (var0 == 7108) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Skeleton.method4171() ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(Lda;I)V",
		garbageValue = "-401614943"
	)
	static final void method5375(Actor var0) {
		var0.isWalking = false;
		if (var0.movementSequence != -1) {
			SequenceDefinition var1 = class33.SequenceDefinition_get(var0.movementSequence);
			if (var1 != null) {
				if (!var1.isCachedModelIdSet() && var1.frameIds != null) {
					++var0.movementFrameCycle;
					if (var0.movementFrame < var1.frameIds.length && var0.movementFrameCycle > var1.frameLengths[var0.movementFrame]) {
						var0.movementFrameCycle = 1;
						++var0.movementFrame;
						class271.method5839(var1, var0.movementFrame, var0.x, var0.y, ModeWhere.localPlayer == var0);
					}

					if (var0.movementFrame >= var1.frameIds.length) {
						if (var1.frameCount > 0) {
							var0.movementFrame -= var1.frameCount;
							if (var1.field2940) {
								++var0.field1239;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var1.frameIds.length || var1.field2940 && var0.field1239 >= var1.field2936) {
								var0.movementFrameCycle = 0;
								var0.movementFrame = 0;
								var0.field1239 = 0;
							}
						} else {
							var0.movementFrameCycle = 0;
							var0.movementFrame = 0;
						}

						class271.method5839(var1, var0.movementFrame, var0.x, var0.y, ModeWhere.localPlayer == var0);
					}
				} else if (var1.isCachedModelIdSet()) {
					++var0.movementFrame;
					int var2 = var1.getMayaAnimFrame();
					if (var0.movementFrame < var2) {
						class271.method5839(var1, var0.movementFrame, var0.x, var0.y, ModeWhere.localPlayer == var0);
					} else {
						if (var1.frameCount > 0) {
							var0.movementFrame -= var1.frameCount;
							if (var1.field2940) {
								++var0.field1239;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var2 || var1.field2940 && var0.field1239 >= var1.field2936) {
								var0.movementFrame = 0;
								var0.movementFrameCycle = 0;
								var0.field1239 = 0;
							}
						} else {
							var0.movementFrameCycle = 0;
							var0.movementFrame = 0;
						}

						class271.method5839(var1, var0.movementFrame, var0.x, var0.y, ModeWhere.localPlayer == var0);
					}
				} else {
					var0.movementSequence = -1;
				}
			} else {
				var0.movementSequence = -1;
			}
		}

		IterableNodeHashTableIterator var7 = new IterableNodeHashTableIterator(var0.method2810());

		int var3;
		for (ActorSpotAnim var6 = (ActorSpotAnim)var7.method9951(); var6 != null; var6 = (ActorSpotAnim)var7.next()) {
			if (var6.spotAnimation != -1 && Client.cycle >= var6.field5051) {
				var3 = ObjectComposition.SpotAnimationDefinition_get(var6.spotAnimation).sequence;
				if (var3 == -1) {
					var6.remove();
					--var0.graphicsCount;
				} else {
					var6.spotAnimationFrame = Math.max(var6.spotAnimationFrame, 0);
					SequenceDefinition var4 = class33.SequenceDefinition_get(var3);
					if (var4.frameIds != null && !var4.isCachedModelIdSet()) {
						++var6.spotAnimationFrameCycle;
						if (var6.spotAnimationFrame < var4.frameIds.length && var6.spotAnimationFrameCycle > var4.frameLengths[var6.spotAnimationFrame]) {
							var6.spotAnimationFrameCycle = 1;
							++var6.spotAnimationFrame;
							class271.method5839(var4, var6.spotAnimationFrame, var0.x, var0.y, ModeWhere.localPlayer == var0);
						}

						if (var6.spotAnimationFrame >= var4.frameIds.length) {
							var6.remove();
							--var0.graphicsCount;
						}
					} else if (var4.isCachedModelIdSet()) {
						++var6.spotAnimationFrame;
						int var5 = var4.getMayaAnimFrame();
						if (var6.spotAnimationFrame < var5) {
							class271.method5839(var4, var6.spotAnimationFrame, var0.x, var0.y, ModeWhere.localPlayer == var0);
						} else {
							var6.remove();
							--var0.graphicsCount;
						}
					} else {
						var6.remove();
						--var0.graphicsCount;
					}
				}
			}
		}

		SequenceDefinition var8;
		if (var0.sequence != -1 && var0.sequenceDelay <= 1) {
			var8 = class33.SequenceDefinition_get(var0.sequence);
			if (var8.field2941 == 1 && var0.field1270 > 0 && var0.spotAnimation <= Client.cycle && var0.field1199 < Client.cycle) {
				var0.sequenceDelay = 1;
				return;
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) {
			var8 = class33.SequenceDefinition_get(var0.sequence);
			if (var8 != null) {
				if (!var8.isCachedModelIdSet() && var8.frameIds != null) {
					++var0.sequenceFrameCycle;
					if (var0.sequenceFrame < var8.frameIds.length && var0.sequenceFrameCycle > var8.frameLengths[var0.sequenceFrame]) {
						var0.sequenceFrameCycle = 1;
						++var0.sequenceFrame;
						class271.method5839(var8, var0.sequenceFrame, var0.x, var0.y, ModeWhere.localPlayer == var0);
					}

					if (var0.sequenceFrame >= var8.frameIds.length) {
						var0.sequenceFrame -= var8.frameCount;
						++var0.field1244;
						if (var0.field1244 >= var8.field2936) {
							var0.sequence = -1;
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var8.frameIds.length) {
							class271.method5839(var8, var0.sequenceFrame, var0.x, var0.y, ModeWhere.localPlayer == var0);
						} else {
							var0.sequence = -1;
						}
					}

					var0.isWalking = var8.field2935;
				} else if (var8.isCachedModelIdSet()) {
					++var0.sequenceFrame;
					var3 = var8.getMayaAnimFrame();
					if (var0.sequenceFrame < var3) {
						class271.method5839(var8, var0.sequenceFrame, var0.x, var0.y, ModeWhere.localPlayer == var0);
					} else {
						var0.sequenceFrame -= var8.frameCount;
						++var0.field1244;
						if (var0.field1244 >= var8.field2936) {
							var0.sequence = -1;
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var3) {
							class271.method5839(var8, var0.sequenceFrame, var0.x, var0.y, ModeWhere.localPlayer == var0);
						} else {
							var0.sequence = -1;
						}
					}
				} else {
					var0.sequence = -1;
				}
			} else {
				var0.sequence = -1;
			}
		}

		if (var0.sequenceDelay > 0) {
			--var0.sequenceDelay;
		}

	}
}
