import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("nn")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("ac")
	public static short[] field3994;
	@ObfuscatedName("av")
	public static short[][] field3995;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("PlayerAppearance_cachedModels")
	static EvictingDualNodeHashTable PlayerAppearance_cachedModels;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lsk;"
	)
	static class486 field3997;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 154860717
	)
	static int field3998;
	@ObfuscatedName("aj")
	int[] field3992;
	@ObfuscatedName("ag")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("ay")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1497761307
	)
	public int field4002;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 989799293
	)
	@Export("gender")
	public int gender;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 697401271
	)
	@Export("npcTransformId")
	int npcTransformId;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = -7415522420965830209L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = -1411389408114792893L
	)
	long field4006;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Lgi;"
	)
	@Export("playerCompositionColorTextureOverrides")
	PlayerCompositionColorTextureOverride[] playerCompositionColorTextureOverrides;
	@ObfuscatedName("aq")
	boolean field4001;

	static {
		PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);
		field3997 = new class486(16, class484.field5241);
		field3998 = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Lnn;)V"
	)
	PlayerComposition(PlayerComposition var1) {
		this.field4002 = -1;
		this.gender = 0;
		this.field4001 = false;
		if (var1 != null) {
			int[] var2 = Arrays.copyOf(var1.equipment, var1.equipment.length);
			int[] var3 = Arrays.copyOf(var1.field3992, var1.field3992.length);
			PlayerCompositionColorTextureOverride[] var4 = (PlayerCompositionColorTextureOverride[])(var1.playerCompositionColorTextureOverrides != null ? (PlayerCompositionColorTextureOverride[])Arrays.copyOf(var1.playerCompositionColorTextureOverrides, var1.playerCompositionColorTextureOverrides.length) : null);
			int[] var5 = Arrays.copyOf(var1.bodyColors, var1.bodyColors.length);
			this.method7512(var3, var2, var4, false, var5, var1.gender, var1.npcTransformId, var1.field4002);
		}
	}

	public PlayerComposition() {
		this.field4002 = -1;
		this.gender = 0;
		this.field4001 = false;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([I[I[Lgi;Z[IIIIB)V",
		garbageValue = "-100"
	)
	public void method7512(int[] var1, int[] var2, PlayerCompositionColorTextureOverride[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
		this.playerCompositionColorTextureOverrides = var3;
		this.field4001 = var4;
		this.field4002 = var8;
		this.method7513(var1, var2, var5, var6, var7);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([I[I[IIII)V",
		garbageValue = "1658606719"
	)
	public void method7513(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		if (var1 == null) {
			var1 = this.method7514(var4);
		}

		if (var2 == null) {
			var2 = this.method7514(var4);
		}

		this.field3992 = var1;
		this.equipment = var2;
		this.bodyColors = var3;
		this.gender = var4;
		this.npcTransformId = var5;
		this.setHash();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "-558744547"
	)
	int[] method7514(int var1) {
		int[] var2 = new int[12];

		for (int var3 = 0; var3 < 7; ++var3) {
			for (int var4 = 0; var4 < GZipDecompressor.KitDefinition_fileCount; ++var4) {
				KitDefinition var5 = HealthBarConfig.method2654(var4);
				if (var5 != null && !var5.nonSelectable && var5.method4211(var3, var1)) {
					if (class198.field2141 == null) {
						class198.field2141 = new int[7];
						class198.field2141[class198.field2138.field2142] = class214.field2447.field2448;
						class198.field2141[class198.field2135.field2142] = class214.field2444.field2448;
						class198.field2141[class198.field2145.field2142] = class214.field2450.field2448;
						class198.field2141[class198.field2133.field2142] = class214.field2455.field2448;
						class198.field2141[class198.field2143.field2142] = class214.field2453.field2448;
						class198.field2141[class198.field2136.field2142] = class214.field2451.field2448;
						class198.field2141[class198.field2139.field2142] = class214.field2454.field2448;
					}

					int var7 = class198.field2141[var3];
					var2[var7] = var4 + 256;
					break;
				}
			}
		}

		return var2;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1967927845"
	)
	@Export("changeAppearance")
	public void changeAppearance(int var1, boolean var2) {
		int[] var3 = this.equipment;
		if (class198.field2141 == null) {
			class198.field2141 = new int[7];
			class198.field2141[class198.field2138.field2142] = class214.field2447.field2448;
			class198.field2141[class198.field2135.field2142] = class214.field2444.field2448;
			class198.field2141[class198.field2145.field2142] = class214.field2450.field2448;
			class198.field2141[class198.field2133.field2142] = class214.field2455.field2448;
			class198.field2141[class198.field2143.field2142] = class214.field2453.field2448;
			class198.field2141[class198.field2136.field2142] = class214.field2451.field2448;
			class198.field2141[class198.field2139.field2142] = class214.field2454.field2448;
		}

		int var4 = class198.field2141[var1];
		int var6 = var3[var4];
		if (var6 != 0) {
			var6 -= 256;

			KitDefinition var7;
			do {
				if (!var2) {
					--var6;
					if (var6 < 0) {
						var6 = GZipDecompressor.KitDefinition_fileCount - 1;
					}
				} else {
					++var6;
					if (var6 >= GZipDecompressor.KitDefinition_fileCount) {
						var6 = 0;
					}
				}

				var7 = HealthBarConfig.method2654(var6);
			} while(var7 == null || var7.nonSelectable || !var7.method4211(var1, this.gender));

			int[] var10 = this.equipment;
			if (class198.field2141 == null) {
				class198.field2141 = new int[7];
				class198.field2141[class198.field2138.field2142] = class214.field2447.field2448;
				class198.field2141[class198.field2135.field2142] = class214.field2444.field2448;
				class198.field2141[class198.field2145.field2142] = class214.field2450.field2448;
				class198.field2141[class198.field2133.field2142] = class214.field2455.field2448;
				class198.field2141[class198.field2143.field2142] = class214.field2453.field2448;
				class198.field2141[class198.field2136.field2142] = class214.field2451.field2448;
				class198.field2141[class198.field2139.field2142] = class214.field2454.field2448;
			}

			int var8 = class198.field2141[var1];
			var10[var8] = var6 + 256;
			this.setHash();
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1985319380"
	)
	public void method7516(int var1, boolean var2) {
		int var3 = this.bodyColors[var1];
		boolean var4;
		if (!var2) {
			do {
				--var3;
				if (var3 < 0) {
					var3 = field3995[var1].length - 1;
				}

				if (var1 == 4 && var3 >= 8) {
					var4 = false;
				} else {
					var4 = true;
				}
			} while(!var4);
		} else {
			do {
				++var3;
				if (var3 >= field3995[var1].length) {
					var3 = 0;
				}

				if (var1 == 4 && var3 >= 8) {
					var4 = false;
				} else {
					var4 = true;
				}
			} while(!var4);
		}

		this.bodyColors[var1] = var3;
		this.setHash();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-19"
	)
	public void method7517(int var1) {
		if (this.gender != var1) {
			this.method7513((int[])null, (int[])null, this.bodyColors, var1, -1);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "2127059726"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.gender);

		int var2;
		for (var2 = 0; var2 < 7; ++var2) {
			int[] var3 = this.equipment;
			if (class198.field2141 == null) {
				class198.field2141 = new int[7];
				class198.field2141[class198.field2138.field2142] = class214.field2447.field2448;
				class198.field2141[class198.field2135.field2142] = class214.field2444.field2448;
				class198.field2141[class198.field2145.field2142] = class214.field2450.field2448;
				class198.field2141[class198.field2133.field2142] = class214.field2455.field2448;
				class198.field2141[class198.field2143.field2142] = class214.field2453.field2448;
				class198.field2141[class198.field2136.field2142] = class214.field2451.field2448;
				class198.field2141[class198.field2139.field2142] = class214.field2454.field2448;
			}

			int var4 = class198.field2141[var2];
			int var6 = var3[var4];
			if (var6 == 0) {
				var1.writeShort(-1);
			} else {
				var1.writeShort(var6 - 256);
			}
		}

		for (var2 = 0; var2 < 5; ++var2) {
			var1.writeByte(this.bodyColors[var2]);
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "45242999"
	)
	@Export("setHash")
	void setHash() {
		long var1 = this.hash;
		long[] var3 = Buffer.field5814;
		this.hash = -1L;

		int var4;
		for (var4 = 0; var4 < 12; ++var4) {
			this.hash = this.hash >>> 8 ^ var3[(int)((this.hash ^ (long)(this.equipment[var4] >> 24)) & 255L)];
			this.hash = this.hash >>> 8 ^ var3[(int)((this.hash ^ (long)(this.equipment[var4] >> 16)) & 255L)];
			this.hash = this.hash >>> 8 ^ var3[(int)((this.hash ^ (long)(this.equipment[var4] >> 8)) & 255L)];
			this.hash = this.hash >>> 8 ^ var3[(int)((this.hash ^ (long)this.equipment[var4]) & 255L)];
		}

		if (this.playerCompositionColorTextureOverrides != null) {
			for (var4 = 0; var4 < this.playerCompositionColorTextureOverrides.length; ++var4) {
				if (this.playerCompositionColorTextureOverrides[var4] != null) {
					int var5;
					if (this.playerCompositionColorTextureOverrides[var4].playerCompositionRecolorTo != null) {
						for (var5 = 0; var5 < this.playerCompositionColorTextureOverrides[var4].playerCompositionRecolorTo.length; ++var5) {
							this.hash = this.hash >>> 8 ^ var3[(int)((this.hash ^ (long)(this.playerCompositionColorTextureOverrides[var4].playerCompositionRecolorTo[var5] >> 8)) & 255L)];
							this.hash = this.hash >>> 8 ^ var3[(int)((this.hash ^ (long)this.playerCompositionColorTextureOverrides[var4].playerCompositionRecolorTo[var5]) & 255L)];
						}
					}

					if (this.playerCompositionColorTextureOverrides[var4].playerCompositionRetextureTo != null) {
						for (var5 = 0; var5 < this.playerCompositionColorTextureOverrides[var4].playerCompositionRetextureTo.length; ++var5) {
							this.hash = this.hash >>> 8 ^ var3[(int)((this.hash ^ (long)(this.playerCompositionColorTextureOverrides[var4].playerCompositionRetextureTo[var5] >> 8)) & 255L)];
							this.hash = this.hash >>> 8 ^ var3[(int)((this.hash ^ (long)this.playerCompositionColorTextureOverrides[var4].playerCompositionRetextureTo[var5]) & 255L)];
						}
					}
				}
			}
		}

		for (var4 = 0; var4 < 5; ++var4) {
			this.hash = this.hash >>> 8 ^ var3[(int)((this.hash ^ (long)this.bodyColors[var4]) & 255L)];
		}

		this.hash = this.hash >>> 8 ^ var3[(int)((this.hash ^ (long)this.gender) & 255L)];
		if (0L != var1 && this.hash != var1 || this.field4001) {
			PlayerAppearance_cachedModels.remove(var1);
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Liz;ILiz;IB)Ljx;",
		garbageValue = "-25"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) {
			return class191.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4, (NpcOverrides)null);
		} else {
			long var5 = this.hash;
			int[] var7 = this.equipment;
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) {
				var7 = new int[12];
				System.arraycopy(this.equipment, 0, var7, 0, var7.length);
				if (var1.shield >= 0) {
					var5 ^= (long)(var1.shield - this.equipment[class214.field2452.field2448]) << 40;
					var7[class214.field2452.field2448] = this.method7532(var1.shield);
				}

				if (var1.weapon >= 0) {
					var5 ^= (long)(var1.weapon - this.equipment[class214.field2458.field2448]) << 48;
					var7[class214.field2458.field2448] = this.method7532(var1.weapon);
				}
			}

			Model var8 = (Model)PlayerAppearance_cachedModels.get(var5);
			if (var8 == null) {
				boolean var9 = false;

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) {
					var11 = var7[var10];
					if (this.method7526(var11)) {
						KitDefinition var18 = this.KitDefinition_get(var11);
						if (var18 != null && !var18.ready()) {
							var9 = true;
						}
					}

					if (this.method7530(var11)) {
						PlayerCompositionColorTextureOverride var22 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var10];
						if (!this.method7531(var11).method4625(this.gender, var22)) {
							var9 = true;
						}
					}
				}

				if (var9) {
					if (this.field4006 != -1L) {
						var8 = (Model)PlayerAppearance_cachedModels.get(this.field4006);
					}

					if (var8 == null) {
						return null;
					}
				}

				if (var8 == null) {
					ModelData[] var17 = new ModelData[12];
					var11 = 0;

					int var13;
					for (int var12 = 0; var12 < 12; ++var12) {
						var13 = var7[var12];
						if (this.method7526(var13)) {
							KitDefinition var14 = this.KitDefinition_get(var13);
							ModelData var15 = null;
							if (var14 != null) {
								var15 = var14.getModelData();
							}

							if (var15 != null) {
								var17[var11++] = var15;
							}
						}

						if (this.method7530(var13)) {
							ItemComposition var20 = this.method7531(var13);
							PlayerCompositionColorTextureOverride var21 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var12];
							ModelData var16 = var20.method4649(this.gender, var21);
							if (var16 != null) {
								var17[var11++] = var16;
							}
						}
					}

					ModelData var23 = new ModelData(var17, var11);

					for (var13 = 0; var13 < 5; ++var13) {
						if (this.bodyColors[var13] < field3995[var13].length) {
							var23.recolor(field3994[var13], field3995[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < VerticalAlignment.field2127[var13].length) {
							var23.recolor(class168.field1878[var13], VerticalAlignment.field2127[var13][this.bodyColors[var13]]);
						}
					}

					var8 = var23.toModel(64, 850, -30, -50, -30);
					PlayerAppearance_cachedModels.put(var8, var5);
					this.field4006 = var5;
				}
			}

			Model var19;
			if (var1 == null && var3 == null) {
				var19 = var8.toSharedSequenceModel(true);
			} else if (var1 != null && var3 != null) {
				var19 = var1.applyTransformations(var8, var2, var3, var4);
			} else if (var1 != null) {
				var19 = var1.transformActorModel(var8, var2);
			} else {
				var19 = var3.transformActorModel(var8, var4);
			}

			return var19;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lik;",
		garbageValue = "1578181063"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) {
			return class191.getNpcDefinition(this.npcTransformId).method4309((NpcOverrides)null);
		} else {
			boolean var1 = false;

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) {
				var3 = this.equipment[var2];
				if (this.method7526(var3)) {
					KitDefinition var9 = this.KitDefinition_get(var3);
					if (var9 != null && !var9.method4208()) {
						var1 = true;
					}
				}

				if (this.method7530(var3)) {
					PlayerCompositionColorTextureOverride var11 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var2];
					if (!this.method7531(var3).method4626(this.gender, var11)) {
						var1 = true;
					}
				}
			}

			if (var1) {
				return null;
			} else {
				ModelData[] var8 = new ModelData[12];
				var3 = 0;

				int var5;
				for (int var4 = 0; var4 < 12; ++var4) {
					var5 = this.equipment[var4];
					ModelData var7;
					if (this.method7526(var5)) {
						KitDefinition var6 = this.KitDefinition_get(var5);
						var7 = null;
						if (var6 != null) {
							var7 = var6.getKitDefinitionModels();
						}

						if (var7 != null) {
							var8[var3++] = var7;
						}
					}

					if (this.method7530(var5)) {
						PlayerCompositionColorTextureOverride var10 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var4];
						var7 = this.method7531(var5).method4665(this.gender, var10);
						if (var7 != null) {
							var8[var3++] = var7;
						}
					}
				}

				ModelData var12 = new ModelData(var8, var3);

				for (var5 = 0; var5 < 5; ++var5) {
					if (this.bodyColors[var5] < field3995[var5].length) {
						var12.recolor(field3994[var5], field3995[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < VerticalAlignment.field2127[var5].length) {
						var12.recolor(class168.field1878[var5], VerticalAlignment.field2127[var5][this.bodyColors[var5]]);
					}
				}

				return var12;
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1567957019"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		long var1 = this.hash;
		if (this.npcTransformId != -1) {
			var1 = -65536L | (long)this.npcTransformId;
		}

		Integer var3 = (Integer)field3997.method9833(var1);
		if (var3 == null) {
			var3 = ++field3998 - 1;
			field3997.method9836(var1, var3);
			field3998 %= 65535;
		}

		return var3;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method7523() {
		this.method7513(this.field3992, this.equipment, this.bodyColors, this.gender, this.npcTransformId);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-624335441"
	)
	public void method7511(int var1, int var2) {
		boolean var3 = var2 != this.gender;
		this.gender = var2;
		if (var3) {
			int var4;
			int var5;
			if (this.gender == var1) {
				for (var4 = 0; var4 < 7; ++var4) {
					if (class198.field2141 == null) {
						class198.field2141 = new int[7];
						class198.field2141[class198.field2138.field2142] = class214.field2447.field2448;
						class198.field2141[class198.field2135.field2142] = class214.field2444.field2448;
						class198.field2141[class198.field2145.field2142] = class214.field2450.field2448;
						class198.field2141[class198.field2133.field2142] = class214.field2455.field2448;
						class198.field2141[class198.field2143.field2142] = class214.field2453.field2448;
						class198.field2141[class198.field2136.field2142] = class214.field2451.field2448;
						class198.field2141[class198.field2139.field2142] = class214.field2454.field2448;
					}

					var5 = class198.field2141[var4];
					if (this.equipment[var5] > 0 && this.equipment[var5] < 2048) {
						this.equipment[var5] = this.field3992[var5];
					}
				}
			} else {
				if (this.equipment[0] < 2048 || this.method7570()) {
					this.equipment[class214.field2444.field2448] = 1;
				}

				for (var4 = 0; var4 < 7; ++var4) {
					if (class198.field2141 == null) {
						class198.field2141 = new int[7];
						class198.field2141[class198.field2138.field2142] = class214.field2447.field2448;
						class198.field2141[class198.field2135.field2142] = class214.field2444.field2448;
						class198.field2141[class198.field2145.field2142] = class214.field2450.field2448;
						class198.field2141[class198.field2133.field2142] = class214.field2455.field2448;
						class198.field2141[class198.field2143.field2142] = class214.field2453.field2448;
						class198.field2141[class198.field2136.field2142] = class214.field2451.field2448;
						class198.field2141[class198.field2139.field2142] = class214.field2454.field2448;
					}

					var5 = class198.field2141[var4];
					if (this.equipment[var5] > 0 && this.equipment[var5] < 2048) {
						int[] var8 = this.equipment;

						for (int var9 = 0; var9 < GZipDecompressor.KitDefinition_fileCount; ++var9) {
							KitDefinition var10 = HealthBarConfig.method2654(var9);
							if (var10 != null && !var10.nonSelectable && var10.method4211(var4, var2)) {
								if (class198.field2141 == null) {
									class198.field2141 = new int[7];
									class198.field2141[class198.field2138.field2142] = class214.field2447.field2448;
									class198.field2141[class198.field2135.field2142] = class214.field2444.field2448;
									class198.field2141[class198.field2145.field2142] = class214.field2450.field2448;
									class198.field2141[class198.field2133.field2142] = class214.field2455.field2448;
									class198.field2141[class198.field2143.field2142] = class214.field2453.field2448;
									class198.field2141[class198.field2136.field2142] = class214.field2451.field2448;
									class198.field2141[class198.field2139.field2142] = class214.field2454.field2448;
								}

								int var12 = class198.field2141[var4];
								var8[var12] = var9 + 256;
								break;
							}
						}
					}
				}
			}
		}

		this.method7523();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "15326"
	)
	boolean method7570() {
		if (!this.method7530(this.equipment[0])) {
			return false;
		} else {
			ItemComposition var1 = this.method7531(this.equipment[0]);
			return var1.maleModel1 != class214.field2444.field2448 && var1.maleModel2 != class214.field2444.field2448;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-107431972"
	)
	public void method7548(int var1, int var2) {
		this.bodyColors[var1] = var2;
		this.method7523();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "801318714"
	)
	public void method7576(int var1) {
		ItemComposition var2 = ObjectComposition.ItemDefinition_get(var1);
		this.equipment[var2.maleModel] = var1 + 2048;
		if (var2.maleModel1 != -1) {
			this.equipment[var2.maleModel1] = 0;
		}

		if (var2.maleModel2 != -1) {
			this.equipment[var2.maleModel2] = 0;
		}

		this.method7523();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-93"
	)
	boolean method7526(int var1) {
		return var1 >= 256 && var1 < 2048;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lhh;",
		garbageValue = "2030515204"
	)
	@Export("KitDefinition_get")
	KitDefinition KitDefinition_get(int var1) {
		return HealthBarConfig.method2654(var1 - 256);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "613420394"
	)
	boolean method7530(int var1) {
		return var1 >= 2048;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)Lid;",
		garbageValue = "4"
	)
	ItemComposition method7531(int var1) {
		return ObjectComposition.ItemDefinition_get(var1 - 2048);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "10"
	)
	int method7532(int var1) {
		return var1 - 512 + 2048;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILce;ZB)I",
		garbageValue = "-62"
	)
	static int method7524(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class392.scriptDotWidget : Interpreter.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETX) {
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETY) {
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) {
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var3.height * -1326764757;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) {
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) {
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(Lcr;I)Z",
		garbageValue = "478198583"
	)
	static boolean method7577(Player var0) {
		if (Client.drawPlayerNames == 0) {
			return false;
		} else {
			boolean var1;
			if (class27.localPlayer == var0) {
				var1 = (Client.drawPlayerNames & 8) != 0;
				return var1;
			} else {
				var1 = class88.method2839();
				if (!var1) {
					boolean var2 = (Client.drawPlayerNames & 1) != 0;
					var1 = var2 && var0.isFriend();
				}

				return var1 || class358.method7490() && var0.isFriendsChatMember();
			}
		}
	}
}
