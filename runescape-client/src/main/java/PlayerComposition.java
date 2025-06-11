import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oq")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("an")
	public static short[] field3909;
	@ObfuscatedName("ai")
	public static short[][] field3905;
	@ObfuscatedName("al")
	public static short[] field3916;
	@ObfuscatedName("ac")
	public static short[][] field3914;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("PlayerAppearance_cachedModels")
	static EvictingDualNodeHashTable PlayerAppearance_cachedModels;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lso;"
	)
	static class480 field3911;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1865761999
	)
	static int field3910;
	@ObfuscatedName("ag")
	int[] field3907;
	@ObfuscatedName("au")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("ar")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -2143866431
	)
	public int field3915;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 557987011
	)
	@Export("gender")
	public int gender;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 683520727
	)
	@Export("npcTransformId")
	int npcTransformId;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = 1014142023565190483L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = 3571223231823375005L
	)
	long field3918;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lgi;"
	)
	@Export("playerCompositionColorTextureOverrides")
	PlayerCompositionColorTextureOverride[] playerCompositionColorTextureOverrides;
	@ObfuscatedName("ae")
	boolean field3920;

	static {
		PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);
		field3911 = new class480(16, class478.field5146);
		field3910 = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Loq;)V"
	)
	PlayerComposition(PlayerComposition var1) {
		this.field3915 = -1;
		this.gender = 0;
		this.field3920 = false;
		if (var1 != null) {
			int[] var2 = Arrays.copyOf(var1.equipment, var1.equipment.length);
			int[] var3 = Arrays.copyOf(var1.field3907, var1.field3907.length);
			PlayerCompositionColorTextureOverride[] var4 = (PlayerCompositionColorTextureOverride[])(var1.playerCompositionColorTextureOverrides != null ? (PlayerCompositionColorTextureOverride[])Arrays.copyOf(var1.playerCompositionColorTextureOverrides, var1.playerCompositionColorTextureOverrides.length) : null);
			int[] var5 = Arrays.copyOf(var1.bodyColors, var1.bodyColors.length);
			this.method7317(var3, var2, var4, false, var5, var1.gender, var1.npcTransformId, var1.field3915);
		}
	}

	public PlayerComposition() {
		this.field3915 = -1;
		this.gender = 0;
		this.field3920 = false;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([I[I[Lgi;Z[IIIIB)V",
		garbageValue = "0"
	)
	public void method7317(int[] var1, int[] var2, PlayerCompositionColorTextureOverride[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
		this.playerCompositionColorTextureOverrides = var3;
		this.field3920 = var4;
		this.field3915 = var8;
		this.method7318(var1, var2, var5, var6, var7);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([I[I[IIIB)V",
		garbageValue = "-77"
	)
	public void method7318(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		if (var1 == null) {
			var1 = this.method7319(var4);
		}

		if (var2 == null) {
			var2 = this.method7319(var4);
		}

		this.field3907 = var1;
		this.equipment = var2;
		this.bodyColors = var3;
		this.gender = var4;
		this.npcTransformId = var5;
		this.setHash();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "2070767025"
	)
	int[] method7319(int var1) {
		int[] var2 = new int[12];

		for (int var3 = 0; var3 < 7; ++var3) {
			MilliClock.method4749(var1, var2, var3);
		}

		return var2;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "93"
	)
	@Export("changeAppearance")
	public void changeAppearance(int var1, boolean var2) {
		int[] var3 = this.equipment;
		if (class198.field2098 == null) {
			class198.field2098 = new int[7];
			class198.field2098[class198.field2094.field2099] = class214.field2373.field2372;
			class198.field2098[class198.field2091.field2099] = class214.field2383.field2372;
			class198.field2098[class198.field2092.field2099] = class214.field2376.field2372;
			class198.field2098[class198.field2093.field2099] = class214.field2378.field2372;
			class198.field2098[class198.field2095.field2099] = class214.field2381.field2372;
			class198.field2098[class198.field2096.field2099] = class214.field2379.field2372;
			class198.field2098[class198.field2101.field2099] = class214.field2382.field2372;
		}

		int var4 = class198.field2098[var1];
		int var6 = var3[var4];
		if (var6 != 0) {
			var6 -= 256;

			KitDefinition var7;
			do {
				if (!var2) {
					--var6;
					if (var6 < 0) {
						var6 = KitDefinition.KitDefinition_fileCount - 1;
					}
				} else {
					++var6;
					if (var6 >= KitDefinition.KitDefinition_fileCount) {
						var6 = 0;
					}
				}

				var7 = TileItem.method2686(var6);
			} while(var7 == null || var7.nonSelectable || !var7.method4043(var1, this.gender));

			int[] var10 = this.equipment;
			if (class198.field2098 == null) {
				class198.field2098 = new int[7];
				class198.field2098[class198.field2094.field2099] = class214.field2373.field2372;
				class198.field2098[class198.field2091.field2099] = class214.field2383.field2372;
				class198.field2098[class198.field2092.field2099] = class214.field2376.field2372;
				class198.field2098[class198.field2093.field2099] = class214.field2378.field2372;
				class198.field2098[class198.field2095.field2099] = class214.field2381.field2372;
				class198.field2098[class198.field2096.field2099] = class214.field2379.field2372;
				class198.field2098[class198.field2101.field2099] = class214.field2382.field2372;
			}

			int var8 = class198.field2098[var1];
			var10[var8] = var6 + 256;
			this.setHash();
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "0"
	)
	public void method7321(int var1, boolean var2) {
		int var3 = this.bodyColors[var1];
		boolean var4;
		if (!var2) {
			do {
				--var3;
				if (var3 < 0) {
					var3 = field3905[var1].length - 1;
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
				if (var3 >= field3905[var1].length) {
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	public void method7322(int var1) {
		if (this.gender != var1) {
			this.method7318((int[])null, (int[])null, this.bodyColors, var1, -1);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "-1723457576"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.gender);

		int var2;
		for (var2 = 0; var2 < 7; ++var2) {
			int[] var3 = this.equipment;
			if (class198.field2098 == null) {
				class198.field2098 = new int[7];
				class198.field2098[class198.field2094.field2099] = class214.field2373.field2372;
				class198.field2098[class198.field2091.field2099] = class214.field2383.field2372;
				class198.field2098[class198.field2092.field2099] = class214.field2376.field2372;
				class198.field2098[class198.field2093.field2099] = class214.field2378.field2372;
				class198.field2098[class198.field2095.field2099] = class214.field2381.field2372;
				class198.field2098[class198.field2096.field2099] = class214.field2379.field2372;
				class198.field2098[class198.field2101.field2099] = class214.field2382.field2372;
			}

			int var4 = class198.field2098[var2];
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2136232268"
	)
	@Export("setHash")
	void setHash() {
		long var1 = this.hash;
		long[] var3 = Buffer.field5693;
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
		if (var1 != 0L && this.hash != var1 || this.field3920) {
			PlayerAppearance_cachedModels.remove(var1);
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lip;ILip;II)Ljm;",
		garbageValue = "1778786143"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) {
			return UserComparator3.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4, (NpcOverrides)null);
		} else {
			long var5 = this.hash;
			int[] var7 = this.equipment;
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) {
				var7 = new int[12];
				System.arraycopy(this.equipment, 0, var7, 0, var7.length);
				if (var1.shield >= 0) {
					var5 ^= (long)(var1.shield - this.equipment[class214.field2377.field2372]) << 40;
					var7[class214.field2377.field2372] = this.method7368(var1.shield);
				}

				if (var1.weapon >= 0) {
					var5 ^= (long)(var1.weapon - this.equipment[class214.field2375.field2372]) << 48;
					var7[class214.field2375.field2372] = this.method7368(var1.weapon);
				}
			}

			Model var8 = (Model)PlayerAppearance_cachedModels.get(var5);
			if (var8 == null) {
				boolean var9 = false;

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) {
					var11 = var7[var10];
					if (this.method7331(var11)) {
						KitDefinition var18 = this.KitDefinition_get(var11);
						if (var18 != null && !var18.ready()) {
							var9 = true;
						}
					}

					if (this.method7335(var11)) {
						PlayerCompositionColorTextureOverride var22 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var10];
						if (!this.method7336(var11).method4457(this.gender, var22)) {
							var9 = true;
						}
					}
				}

				if (var9) {
					if (this.field3918 != -1L) {
						var8 = (Model)PlayerAppearance_cachedModels.get(this.field3918);
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
						if (this.method7331(var13)) {
							KitDefinition var14 = this.KitDefinition_get(var13);
							ModelData var15 = null;
							if (var14 != null) {
								var15 = var14.getModelData();
							}

							if (var15 != null) {
								var17[var11++] = var15;
							}
						}

						if (this.method7335(var13)) {
							ItemComposition var20 = this.method7336(var13);
							PlayerCompositionColorTextureOverride var21 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var12];
							ModelData var16 = var20.method4477(this.gender, var21);
							if (var16 != null) {
								var17[var11++] = var16;
							}
						}
					}

					ModelData var23 = new ModelData(var17, var11);

					for (var13 = 0; var13 < 5; ++var13) {
						if (this.bodyColors[var13] < field3905[var13].length) {
							var23.recolor(field3909[var13], field3905[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < field3914[var13].length) {
							var23.recolor(field3916[var13], field3914[var13][this.bodyColors[var13]]);
						}
					}

					var8 = var23.toModel(64, 850, -30, -50, -30);
					PlayerAppearance_cachedModels.put(var8, var5);
					this.field3918 = var5;
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Ljj;",
		garbageValue = "-310207946"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) {
			return UserComparator3.getNpcDefinition(this.npcTransformId).method4200((NpcOverrides)null);
		} else {
			boolean var1 = false;

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) {
				var3 = this.equipment[var2];
				if (this.method7331(var3)) {
					KitDefinition var9 = this.KitDefinition_get(var3);
					if (var9 != null && !var9.method4058()) {
						var1 = true;
					}
				}

				if (this.method7335(var3)) {
					PlayerCompositionColorTextureOverride var11 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var2];
					if (!this.method7336(var3).method4494(this.gender, var11)) {
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
					if (this.method7331(var5)) {
						KitDefinition var6 = this.KitDefinition_get(var5);
						var7 = null;
						if (var6 != null) {
							var7 = var6.getKitDefinitionModels();
						}

						if (var7 != null) {
							var8[var3++] = var7;
						}
					}

					if (this.method7335(var5)) {
						PlayerCompositionColorTextureOverride var10 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var4];
						var7 = this.method7336(var5).method4460(this.gender, var10);
						if (var7 != null) {
							var8[var3++] = var7;
						}
					}
				}

				ModelData var12 = new ModelData(var8, var3);

				for (var5 = 0; var5 < 5; ++var5) {
					if (this.bodyColors[var5] < field3905[var5].length) {
						var12.recolor(field3909[var5], field3905[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < field3914[var5].length) {
						var12.recolor(field3916[var5], field3914[var5][this.bodyColors[var5]]);
					}
				}

				return var12;
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "4803"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		long var1 = this.hash;
		if (this.npcTransformId != -1) {
			var1 = -65536L | (long)this.npcTransformId;
		}

		Integer var3 = (Integer)field3911.method9463(var1);
		if (var3 == null) {
			var3 = ++field3910 - 1;
			field3911.method9464(var1, var3);
			field3910 %= 65535;
		}

		return var3;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "77"
	)
	void method7364() {
		this.method7318(this.field3907, this.equipment, this.bodyColors, this.gender, this.npcTransformId);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-62"
	)
	public void method7315(int var1, int var2) {
		boolean var3 = var2 != this.gender;
		this.gender = var2;
		if (var3) {
			int var4;
			int var5;
			if (this.gender == var1) {
				for (var4 = 0; var4 < 7; ++var4) {
					if (class198.field2098 == null) {
						class198.field2098 = new int[7];
						class198.field2098[class198.field2094.field2099] = class214.field2373.field2372;
						class198.field2098[class198.field2091.field2099] = class214.field2383.field2372;
						class198.field2098[class198.field2092.field2099] = class214.field2376.field2372;
						class198.field2098[class198.field2093.field2099] = class214.field2378.field2372;
						class198.field2098[class198.field2095.field2099] = class214.field2381.field2372;
						class198.field2098[class198.field2096.field2099] = class214.field2379.field2372;
						class198.field2098[class198.field2101.field2099] = class214.field2382.field2372;
					}

					var5 = class198.field2098[var4];
					if (this.equipment[var5] > 0 && this.equipment[var5] < 2048) {
						this.equipment[var5] = this.field3907[var5];
					}
				}
			} else {
				if (this.equipment[0] < 2048 || this.method7324()) {
					this.equipment[class214.field2383.field2372] = 1;
				}

				for (var4 = 0; var4 < 7; ++var4) {
					if (class198.field2098 == null) {
						class198.field2098 = new int[7];
						class198.field2098[class198.field2094.field2099] = class214.field2373.field2372;
						class198.field2098[class198.field2091.field2099] = class214.field2383.field2372;
						class198.field2098[class198.field2092.field2099] = class214.field2376.field2372;
						class198.field2098[class198.field2093.field2099] = class214.field2378.field2372;
						class198.field2098[class198.field2095.field2099] = class214.field2381.field2372;
						class198.field2098[class198.field2096.field2099] = class214.field2379.field2372;
						class198.field2098[class198.field2101.field2099] = class214.field2382.field2372;
					}

					var5 = class198.field2098[var4];
					if (this.equipment[var5] > 0 && this.equipment[var5] < 2048) {
						MilliClock.method4749(var2, this.equipment, var4);
					}
				}
			}
		}

		this.method7364();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1509001314"
	)
	boolean method7324() {
		if (!this.method7335(this.equipment[0])) {
			return false;
		} else {
			ItemComposition var1 = this.method7336(this.equipment[0]);
			return var1.maleModel1 != class214.field2383.field2372 && var1.maleModel2 != class214.field2383.field2372;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "35"
	)
	public void method7386(int var1, int var2) {
		this.bodyColors[var1] = var2;
		this.method7364();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-15"
	)
	public void method7332(int var1) {
		ItemComposition var2 = SceneTilePaint.ItemDefinition_get(var1);
		this.equipment[var2.maleModel] = var1 + 2048;
		if (var2.maleModel1 != -1) {
			this.equipment[var2.maleModel1] = 0;
		}

		if (var2.maleModel2 != -1) {
			this.equipment[var2.maleModel2] = 0;
		}

		this.method7364();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "952013766"
	)
	boolean method7331(int var1) {
		return var1 >= 256 && var1 < 2048;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)Lho;",
		garbageValue = "29"
	)
	@Export("KitDefinition_get")
	KitDefinition KitDefinition_get(int var1) {
		return TileItem.method2686(var1 - 256);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1626682633"
	)
	boolean method7335(int var1) {
		return var1 >= 2048;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)Lid;",
		garbageValue = "-83"
	)
	ItemComposition method7336(int var1) {
		return SceneTilePaint.ItemDefinition_get(var1 - 2048);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-94"
	)
	int method7368(int var1) {
		return var1 - 512 + 2048;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lps;Ljava/lang/String;Ljava/lang/String;I)[Lwy;",
		garbageValue = "-1650720697"
	)
	@Export("getFont")
	public static IndexedSprite[] getFont(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			return DesktopPlatformInfoProvider.method10192(var0, var3, var4);
		}
	}
}
