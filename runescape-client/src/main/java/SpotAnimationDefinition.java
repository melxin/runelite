import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	static AbstractArchive field2160;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("SpotAnimationDefinition_cached")
	static EvictingDualNodeHashTable SpotAnimationDefinition_cached;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("SpotAnimationDefinition_cachedModels")
	static EvictingDualNodeHashTable SpotAnimationDefinition_cachedModels;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1317510085
	)
	@Export("id")
	int id;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1415075465
	)
	@Export("archive")
	int archive;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 902931601
	)
	@Export("sequence")
	public int sequence;
	@ObfuscatedName("ap")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("am")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("aj")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("ag")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1404875169
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 645173911
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 267545141
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1600288297
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -7749081
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "1101355229"
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
		descriptor = "(Lwj;II)V",
		garbageValue = "1882088755"
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Ljx;",
		garbageValue = "612682082"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		Model var2 = this.method4394();
		if (var2 == null) {
			return null;
		} else {
			Model var3;
			if (this.sequence != -1 && var1 != -1) {
				var3 = AsyncHttpResponse.SequenceDefinition_get(this.sequence).transformSpotAnimationModel(var2, var1);
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljx;",
		garbageValue = "772099472"
	)
	public final Model method4394() {
		Model var1 = (Model)SpotAnimationDefinition_cachedModels.get((long)this.id);
		if (var1 == null) {
			ModelData var2 = ModelData.ModelData_get(class143.SpotAnimationDefinition_modelArchive, this.archive, 0);
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)F",
		garbageValue = "263840986"
	)
	static final float method4410(float var0, float var1, float var2, float var3) {
		return var0 * var2 - var1 * var3;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-825662963"
	)
	public static void method4411() {
		FileSystem.FileSystem_cacheFiles.clear();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "66"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "69"
	)
	static final void method4414() {
		KitDefinition.KitDefinition_archive = null;
		KitDefinition.KitDefinition_modelsArchive = null;
		GZipDecompressor.KitDefinition_fileCount = 0;
	}

	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "790516498"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		class274.method6203();
		class486.method9834();
		int var1 = Projection.VarpDefinition_get(var0).type;
		if (var1 != 0) {
			int var2 = Varps.Varps_main[var0];
			if (var1 == 1) {
				if (var2 == 1) {
					TaskHandler.method5886(0.9D);
				}

				if (var2 == 2) {
					TaskHandler.method5886(0.8D);
				}

				if (var2 == 3) {
					TaskHandler.method5886(0.7D);
				}

				if (var2 == 4) {
					TaskHandler.method5886(0.6D);
				}
			}

			if (var1 == 3) {
				if (var2 == 0) {
					WorldMapSectionType.setMusicVolume(255);
				}

				if (var2 == 1) {
					WorldMapSectionType.setMusicVolume(192);
				}

				if (var2 == 2) {
					WorldMapSectionType.setMusicVolume(128);
				}

				if (var2 == 3) {
					WorldMapSectionType.setMusicVolume(64);
				}

				if (var2 == 4) {
					WorldMapSectionType.setMusicVolume(0);
				}
			}

			if (var1 == 4) {
				if (var2 == 0) {
					PcmPlayer.method3045(127);
				}

				if (var2 == 1) {
					PcmPlayer.method3045(96);
				}

				if (var2 == 2) {
					PcmPlayer.method3045(64);
				}

				if (var2 == 3) {
					PcmPlayer.method3045(32);
				}

				if (var2 == 4) {
					PcmPlayer.method3045(0);
				}
			}

			if (var1 == 5) {
				Client.leftClickOpensMenu = var2 == 1;
			}

			if (var1 == 6) {
				Client.chatEffects = var2;
			}

			if (var1 == 9) {
			}

			if (var1 == 10) {
				if (var2 == 0) {
					class334.method7074(127);
				}

				if (var2 == 1) {
					class334.method7074(96);
				}

				if (var2 == 2) {
					class334.method7074(64);
				}

				if (var2 == 3) {
					class334.method7074(32);
				}

				if (var2 == 4) {
					class334.method7074(0);
				}
			}

			if (var1 == 17) {
				Client.followerIndex = var2 & 65535;
			}

			if (var1 == 18) {
				Client.playerAttackOption = (AttackOption)HealthBarConfig.findEnumerated(class134.method3632(), var2);
				if (Client.playerAttackOption == null) {
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var1 == 19) {
				if (var2 == -1) {
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047;
				}
			}

			if (var1 == 22) {
				Client.npcAttackOption = (AttackOption)HealthBarConfig.findEnumerated(class134.method3632(), var2);
				if (Client.npcAttackOption == null) {
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	}
}
