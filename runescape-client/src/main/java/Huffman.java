import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nw")
@Implements("Huffman")
public class Huffman {
	@ObfuscatedName("ab")
	@Export("masks")
	int[] masks;
	@ObfuscatedName("aw")
	@Export("bits")
	byte[] bits;
	@ObfuscatedName("at")
	@Export("keys")
	int[] keys;

	public Huffman(byte[] var1) {
		int var2 = var1.length;
		this.masks = new int[var2];
		this.bits = var1;
		int[] var3 = new int[33];
		this.keys = new int[8];
		int var4 = 0;

		for (int var5 = 0; var5 < var2; ++var5) {
			byte var6 = var1[var5];
			if (var6 != 0) {
				int var7 = 1 << 32 - var6;
				int var8 = var3[var6];
				this.masks[var5] = var8;
				int var9;
				int var10;
				int var11;
				int var12;
				if ((var8 & var7) != 0) {
					var9 = var3[var6 - 1];
				} else {
					var9 = var8 | var7;

					for (var10 = var6 - 1; var10 >= 1; --var10) {
						var11 = var3[var10];
						if (var8 != var11) {
							break;
						}

						var12 = 1 << 32 - var10;
						if ((var11 & var12) != 0) {
							var3[var10] = var3[var10 - 1];
							break;
						}

						var3[var10] = var11 | var12;
					}
				}

				var3[var6] = var9;

				for (var10 = var6 + 1; var10 <= 32; ++var10) {
					if (var8 == var3[var10]) {
						var3[var10] = var9;
					}
				}

				var10 = 0;

				for (var11 = 0; var11 < var6; ++var11) {
					var12 = Integer.MIN_VALUE >>> var11;
					if ((var8 & var12) != 0) {
						if (this.keys[var10] == 0) {
							this.keys[var10] = var4;
						}

						var10 = this.keys[var10];
					} else {
						++var10;
					}

					if (var10 >= this.keys.length) {
						int[] var13 = new int[this.keys.length * 2];

						for (int var14 = 0; var14 < this.keys.length; ++var14) {
							var13[var14] = this.keys[var14];
						}

						this.keys = var13;
					}

					var12 >>>= 1;
				}

				this.keys[var10] = ~var5;
				if (var10 >= var4) {
					var4 = var10 + 1;
				}
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BII[BIB)I",
		garbageValue = "36"
	)
	@Export("compress")
	int compress(byte[] var1, int var2, int var3, byte[] var4, int var5) {
		int var6 = 0;
		int var7 = var5 << 3;

		for (var3 += var2; var2 < var3; ++var2) {
			int var8 = var1[var2] & 255;
			int var9 = this.masks[var8];
			byte var10 = this.bits[var8];
			if (var10 == 0) {
				throw new RuntimeException("" + var8);
			}

			int var11 = var7 >> 3;
			int var12 = var7 & 7;
			var6 &= -var12 >> 31;
			int var13 = (var10 + var12 - 1 >> 3) + var11;
			var12 += 24;
			var4[var11] = (byte)(var6 |= var9 >>> var12);
			if (var11 < var13) {
				++var11;
				var12 -= 8;
				var4[var11] = (byte)(var6 = var9 >>> var12);
				if (var11 < var13) {
					++var11;
					var12 -= 8;
					var4[var11] = (byte)(var6 = var9 >>> var12);
					if (var11 < var13) {
						++var11;
						var12 -= 8;
						var4[var11] = (byte)(var6 = var9 >>> var12);
						if (var11 < var13) {
							++var11;
							var12 -= 8;
							var4[var11] = (byte)(var6 = var9 << -var12);
						}
					}
				}
			}

			var7 += var10;
		}

		return (var7 + 7 >> 3) - var5;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([BI[BIIB)I",
		garbageValue = "-51"
	)
	@Export("decompress")
	int decompress(byte[] var1, int var2, byte[] var3, int var4, int var5) {
		if (var5 == 0) {
			return 0;
		} else {
			int var6 = 0;
			var5 += var4;
			int var7 = var2;

			while (true) {
				byte var8 = var1[var7];
				if (var8 < 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}

				int var9;
				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 64) != 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}

				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 32) != 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}

				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 16) != 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}

				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 8) != 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}

				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 4) != 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}

				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 2) != 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}

				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 1) != 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}

				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				++var7;
			}

			return var7 + 1 - var2;
		}
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1845536787"
	)
	@Export("clear")
	static final void clear() {
		class188.field2007.clear();
		class190.field2023.clear();
		NPC.method2958();
		SwapSongTask.method8677();
		DbTableType.DBTableType_cache.clear();
		class31.method439();
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
		Projectile.method2345();
		KitDefinition.KitDefinition_cached.clear();
		class143.method3397();
		ObjectComposition.ObjectDefinition_cached.clear();
		ObjectComposition.ObjectDefinition_cachedModelData.clear();
		ObjectComposition.ObjectDefinition_cachedEntities.clear();
		ObjectComposition.ObjectDefinition_cachedModels.clear();
		WorldMapElement.HitSplatDefinition_cached.clear();
		class191.field2026.clear();
		NPCComposition.NpcDefinition_cached.clear();
		NPCComposition.NpcDefinition_cachedModels.clear();
		class464.method8871();
		ParamComposition.ParamDefinition_cached.clear();
		class111.method3024();
		class268.method5563();
		StructComposition.StructDefinition_cached.clear();
		ReflectionCheck.method684();
		if (Widget.field3962 != null) {
			Widget.field3962.method9910();
		}

		if (FloorUnderlayDefinition.field2075 != null) {
			FloorUnderlayDefinition.field2075.method9910();
		}

		class195.field2100.clear();
		RouteStrategy.method5649();
		class133.method3283();
		class182.field1864.clear();
		DevicePcmPlayerProvider.method297();
		class180.field1851.clear();
		class204.field1909.clear();
		HealthBarDefinition.method3849();
		class201.field2136.clear();
		Client.DBTableIndex_cache.clear();
		Client.archive11.clear();
		class331.method6493();
		if (class379.widgetDefinition != null) {
			class379.widgetDefinition.method6873();
		}

		if (Rasterizer3D.clips.Rasterizer3D_textureLoader != null) {
			((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).clear();
		}

		Script.Script_cached.clear();
		Client.field768.clearFiles();
		if (class390.field4572 != null) {
			class390.field4572.clearFiles();
		}

		if (class483.field5042 != null) {
			class483.field5042.clearFiles();
		}

		if (class419.archive10 != null) {
			class419.archive10.clearFiles();
		}

		if (class450.archive12 != null) {
			class450.archive12.clearFiles();
		}

		if (GameEngine.archive2 != null) {
			GameEngine.archive2.clearFiles();
		}

		if (class53.field362 != null) {
			class53.field362.clearFiles();
		}

		if (class204.field2110 != null) {
			class204.field2110.clearFiles();
		}

		if (class213.archive13 != null) {
			class213.archive13.clearFiles();
		}

		if (WorldMapCacheName.archive4 != null) {
			WorldMapCacheName.archive4.clearFiles();
		}

		if (HealthBarConfig.field1344 != null) {
			HealthBarConfig.field1344.clearFiles();
		}

		if (GraphicsObject.soundEffectsArchive != null) {
			GraphicsObject.soundEffectsArchive.clearFiles();
		}

		if (class419.field4733 != null) {
			class419.field4733.clearFiles();
		}

		if (class309.archive9 != null) {
			class309.archive9.clearFiles();
		}

		if (FontName.archive6 != null) {
			FontName.archive6.clearFiles();
		}

		if (Language.field4688 != null) {
			Language.field4688.clearFiles();
		}

		if (class1.field0 != null) {
			class1.field0.clearFiles();
		}

		if (AttackOption.archive8 != null) {
			AttackOption.archive8.clearFiles();
		}

		if (AbstractArchive.field4596 != null) {
			AbstractArchive.field4596.clearFiles();
		}

		if (AsyncHttpResponse.field84 != null) {
			AsyncHttpResponse.field84.clearFiles();
		}

		if (class171.field1814 != null) {
			class171.field1814.clearFiles();
		}

		if (UserComparator10.field1505 != null) {
			UserComparator10.field1505.clearFiles();
		}

		if (ViewportMouse.field2903 != null) {
			ViewportMouse.field2903.clearFiles();
		}

	}

	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "(Lvj;B)V",
		garbageValue = "7"
	)
	static void method7403(Buffer var0) {
		if (Client.randomDatData != null) {
			var0.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
		} else {
			byte[] var2 = new byte[24];

			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.readFully(var2);

				int var3;
				for (var3 = 0; var3 < 24 && var2[var3] == 0; ++var3) {
				}

				if (var3 >= 24) {
					throw new IOException();
				}
			} catch (Exception var6) {
				for (int var4 = 0; var4 < 24; ++var4) {
					var2[var4] = -1;
				}
			}

			var0.writeBytes(var2, 0, var2.length);
		}
	}
}
