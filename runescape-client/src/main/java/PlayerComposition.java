import java.util.Arrays;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oz")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("ac")
	public static short[][] field4074;
	@ObfuscatedName("ap")
	public static short[] field4075;
	@ObfuscatedName("aq")
	public static short[][] field4076;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("PlayerAppearance_cachedModels")
	static EvictingDualNodeHashTable PlayerAppearance_cachedModels;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	static class490 field4078;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 867479717
	)
	static int field4072;
	@ObfuscatedName("au")
	int[] field4080;
	@ObfuscatedName("ai")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("aa")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1542820987
	)
	public int field4083;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -526446761
	)
	@Export("gender")
	public int gender;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -2061213481
	)
	@Export("npcTransformId")
	int npcTransformId;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = 8189501649223314449L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = 6855535478392845543L
	)
	long field4087;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[Lgq;"
	)
	@Export("playerCompositionColorTextureOverrides")
	PlayerCompositionColorTextureOverride[] playerCompositionColorTextureOverrides;
	@ObfuscatedName("ag")
	boolean field4085;

	static {
		PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);
		field4078 = new class490(16, class488.field5351);
		field4072 = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Loz;)V"
	)
	PlayerComposition(PlayerComposition var1) {
		this.field4083 = -1;
		this.gender = 0;
		this.field4085 = false;
		if (var1 != null) {
			int[] var2 = Arrays.copyOf(var1.equipment, var1.equipment.length);
			int[] var3 = Arrays.copyOf(var1.field4080, var1.field4080.length);
			PlayerCompositionColorTextureOverride[] var4 = (PlayerCompositionColorTextureOverride[])(var1.playerCompositionColorTextureOverrides != null ? (PlayerCompositionColorTextureOverride[])Arrays.copyOf(var1.playerCompositionColorTextureOverrides, var1.playerCompositionColorTextureOverrides.length) : null);
			int[] var5 = Arrays.copyOf(var1.bodyColors, var1.bodyColors.length);
			this.method7526(var3, var2, var4, false, var5, var1.gender, var1.npcTransformId, var1.field4083);
		}
	}

	public PlayerComposition() {
		this.field4083 = -1;
		this.gender = 0;
		this.field4085 = false;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([I[I[Lgq;Z[IIIIB)V",
		garbageValue = "-63"
	)
	public void method7526(int[] var1, int[] var2, PlayerCompositionColorTextureOverride[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
		this.playerCompositionColorTextureOverrides = var3;
		this.field4085 = var4;
		this.field4083 = var8;
		this.method7527(var1, var2, var5, var6, var7);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([I[I[IIIB)V",
		garbageValue = "39"
	)
	public void method7527(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		if (var1 == null) {
			var1 = this.method7528(var4);
		}

		if (var2 == null) {
			var2 = this.method7528(var4);
		}

		this.field4080 = var1;
		this.equipment = var2;
		this.bodyColors = var3;
		this.gender = var4;
		this.npcTransformId = var5;
		this.setHash();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "-1208722266"
	)
	int[] method7528(int var1) {
		int[] var2 = new int[12];

		for (int var3 = 0; var3 < 7; ++var3) {
			class269.method6052(var1, var2, var3);
		}

		return var2;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1082396824"
	)
	@Export("changeAppearance")
	public void changeAppearance(int var1, boolean var2) {
		int[] var3 = this.equipment;
		if (class200.field2182 == null) {
			class200.field2182 = new int[7];
			class200.field2182[class200.field2186.field2189] = class216.field2506.field2509;
			class200.field2182[class200.field2179.field2189] = class216.field2500.field2509;
			class200.field2182[class200.field2180.field2189] = class216.field2499.field2509;
			class200.field2182[class200.field2181.field2189] = class216.field2501.field2509;
			class200.field2182[class200.field2187.field2189] = class216.field2504.field2509;
			class200.field2182[class200.field2183.field2189] = class216.field2495.field2509;
			class200.field2182[class200.field2184.field2189] = class216.field2505.field2509;
		}

		int var4 = class200.field2182[var1];
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

				var7 = class524.method10438(var6);
			} while(var7 == null || var7.nonSelectable || !var7.method4222(var1, this.gender));

			int[] var10 = this.equipment;
			if (class200.field2182 == null) {
				class200.field2182 = new int[7];
				class200.field2182[class200.field2186.field2189] = class216.field2506.field2509;
				class200.field2182[class200.field2179.field2189] = class216.field2500.field2509;
				class200.field2182[class200.field2180.field2189] = class216.field2499.field2509;
				class200.field2182[class200.field2181.field2189] = class216.field2501.field2509;
				class200.field2182[class200.field2187.field2189] = class216.field2504.field2509;
				class200.field2182[class200.field2183.field2189] = class216.field2495.field2509;
				class200.field2182[class200.field2184.field2189] = class216.field2505.field2509;
			}

			int var8 = class200.field2182[var1];
			var10[var8] = var6 + 256;
			this.setHash();
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "949395235"
	)
	public void method7543(int var1, boolean var2) {
		int var3 = this.bodyColors[var1];
		if (!var2) {
			do {
				--var3;
				if (var3 < 0) {
					var3 = field4074[var1].length - 1;
				}
			} while(!NpcOverrides.method4322(var1, var3));
		} else {
			do {
				++var3;
				if (var3 >= field4074[var1].length) {
					var3 = 0;
				}
			} while(!NpcOverrides.method4322(var1, var3));
		}

		this.bodyColors[var1] = var3;
		this.setHash();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1185307361"
	)
	public void method7531(int var1) {
		if (this.gender != var1) {
			this.method7527((int[])null, (int[])null, this.bodyColors, var1, -1);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwb;B)V",
		garbageValue = "-108"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.gender);

		int var2;
		for (var2 = 0; var2 < 7; ++var2) {
			int[] var3 = this.equipment;
			if (class200.field2182 == null) {
				class200.field2182 = new int[7];
				class200.field2182[class200.field2186.field2189] = class216.field2506.field2509;
				class200.field2182[class200.field2179.field2189] = class216.field2500.field2509;
				class200.field2182[class200.field2180.field2189] = class216.field2499.field2509;
				class200.field2182[class200.field2181.field2189] = class216.field2501.field2509;
				class200.field2182[class200.field2187.field2189] = class216.field2504.field2509;
				class200.field2182[class200.field2183.field2189] = class216.field2495.field2509;
				class200.field2182[class200.field2184.field2189] = class216.field2505.field2509;
			}

			int var4 = class200.field2182[var2];
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1164517325"
	)
	@Export("setHash")
	void setHash() {
		long var1 = this.hash;
		long[] var3 = Buffer.SpriteBuffer_spriteHeights;
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
		if (0L != var1 && this.hash != var1 || this.field4085) {
			PlayerAppearance_cachedModels.remove(var1);
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lij;ILij;II)Ljn;",
		garbageValue = "716425386"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) {
			return class63.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4, (NpcOverrides)null);
		} else {
			long var5 = this.hash;
			int[] var7 = this.equipment;
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) {
				var7 = new int[12];
				System.arraycopy(this.equipment, 0, var7, 0, var7.length);
				if (var1.shield >= 0) {
					var5 ^= (long)(var1.shield - this.equipment[class216.field2502.field2509]) << 40;
					var7[class216.field2502.field2509] = this.method7602(var1.shield);
				}

				if (var1.weapon >= 0) {
					var5 ^= (long)(var1.weapon - this.equipment[class216.field2498.field2509]) << 48;
					var7[class216.field2498.field2509] = this.method7602(var1.weapon);
				}
			}

			Model var8 = (Model)PlayerAppearance_cachedModels.get(var5);
			if (var8 == null) {
				boolean var9 = false;

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) {
					var11 = var7[var10];
					if (this.method7542(var11)) {
						KitDefinition var18 = this.KitDefinition_get(var11);
						if (var18 != null && !var18.ready()) {
							var9 = true;
						}
					}

					if (this.method7544(var11)) {
						PlayerCompositionColorTextureOverride var22 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var10];
						if (!this.method7545(var11).method4664(this.gender, var22)) {
							var9 = true;
						}
					}
				}

				if (var9) {
					if (-1L != this.field4087) {
						var8 = (Model)PlayerAppearance_cachedModels.get(this.field4087);
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
						if (this.method7542(var13)) {
							KitDefinition var14 = this.KitDefinition_get(var13);
							ModelData var15 = null;
							if (var14 != null) {
								var15 = var14.getModelData();
							}

							if (var15 != null) {
								var17[var11++] = var15;
							}
						}

						if (this.method7544(var13)) {
							ItemComposition var20 = this.method7545(var13);
							PlayerCompositionColorTextureOverride var21 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var12];
							ModelData var16 = var20.method4665(this.gender, var21);
							if (var16 != null) {
								var17[var11++] = var16;
							}
						}
					}

					ModelData var23 = new ModelData(var17, var11);

					for (var13 = 0; var13 < 5; ++var13) {
						if (this.bodyColors[var13] < field4074[var13].length) {
							var23.recolor(class30.field149[var13], field4074[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < field4076[var13].length) {
							var23.recolor(field4075[var13], field4076[var13][this.bodyColors[var13]]);
						}
					}

					var8 = var23.toModel(64, 850, -30, -50, -30);
					PlayerAppearance_cachedModels.put(var8, var5);
					this.field4087 = var5;
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Liu;",
		garbageValue = "49"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) {
			return class63.getNpcDefinition(this.npcTransformId).method4377((NpcOverrides)null);
		} else {
			boolean var1 = false;

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) {
				var3 = this.equipment[var2];
				if (this.method7542(var3)) {
					KitDefinition var9 = this.KitDefinition_get(var3);
					if (var9 != null && !var9.method4225()) {
						var1 = true;
					}
				}

				if (this.method7544(var3)) {
					PlayerCompositionColorTextureOverride var11 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var2];
					if (!this.method7545(var3).method4666(this.gender, var11)) {
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
					if (this.method7542(var5)) {
						KitDefinition var6 = this.KitDefinition_get(var5);
						var7 = null;
						if (var6 != null) {
							var7 = var6.getKitDefinitionModels();
						}

						if (var7 != null) {
							var8[var3++] = var7;
						}
					}

					if (this.method7544(var5)) {
						PlayerCompositionColorTextureOverride var10 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var4];
						var7 = this.method7545(var5).method4729(this.gender, var10);
						if (var7 != null) {
							var8[var3++] = var7;
						}
					}
				}

				ModelData var12 = new ModelData(var8, var3);

				for (var5 = 0; var5 < 5; ++var5) {
					if (this.bodyColors[var5] < field4074[var5].length) {
						var12.recolor(class30.field149[var5], field4074[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < field4076[var5].length) {
						var12.recolor(field4075[var5], field4076[var5][this.bodyColors[var5]]);
					}
				}

				return var12;
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1107803327"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		long var1 = this.hash;
		if (this.npcTransformId != -1) {
			var1 = -65536L | (long)this.npcTransformId;
		}

		Integer var3 = (Integer)field4078.method9819(var1);
		if (var3 == null) {
			var3 = ++field4072 - 1;
			field4078.method9834(var1, var3);
			field4072 %= 65535;
		}

		return var3;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1024945254"
	)
	void method7525() {
		this.method7527(this.field4080, this.equipment, this.bodyColors, this.gender, this.npcTransformId);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "1"
	)
	public void method7562(int var1, int var2) {
		boolean var3 = var2 != this.gender;
		this.gender = var2;
		if (var3) {
			int var4;
			int var5;
			if (this.gender == var1) {
				for (var4 = 0; var4 < 7; ++var4) {
					if (class200.field2182 == null) {
						class200.field2182 = new int[7];
						class200.field2182[class200.field2186.field2189] = class216.field2506.field2509;
						class200.field2182[class200.field2179.field2189] = class216.field2500.field2509;
						class200.field2182[class200.field2180.field2189] = class216.field2499.field2509;
						class200.field2182[class200.field2181.field2189] = class216.field2501.field2509;
						class200.field2182[class200.field2187.field2189] = class216.field2504.field2509;
						class200.field2182[class200.field2183.field2189] = class216.field2495.field2509;
						class200.field2182[class200.field2184.field2189] = class216.field2505.field2509;
					}

					var5 = class200.field2182[var4];
					if (this.equipment[var5] > 0 && this.equipment[var5] < 2048) {
						this.equipment[var5] = this.field4080[var5];
					}
				}
			} else {
				if (this.equipment[0] < 2048 || this.method7570()) {
					this.equipment[class216.field2500.field2509] = 1;
				}

				for (var4 = 0; var4 < 7; ++var4) {
					if (class200.field2182 == null) {
						class200.field2182 = new int[7];
						class200.field2182[class200.field2186.field2189] = class216.field2506.field2509;
						class200.field2182[class200.field2179.field2189] = class216.field2500.field2509;
						class200.field2182[class200.field2180.field2189] = class216.field2499.field2509;
						class200.field2182[class200.field2181.field2189] = class216.field2501.field2509;
						class200.field2182[class200.field2187.field2189] = class216.field2504.field2509;
						class200.field2182[class200.field2183.field2189] = class216.field2495.field2509;
						class200.field2182[class200.field2184.field2189] = class216.field2505.field2509;
					}

					var5 = class200.field2182[var4];
					if (this.equipment[var5] > 0 && this.equipment[var5] < 2048) {
						class269.method6052(var2, this.equipment, var4);
					}
				}
			}
		}

		this.method7525();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-889709097"
	)
	boolean method7570() {
		if (!this.method7544(this.equipment[0])) {
			return false;
		} else {
			ItemComposition var1 = this.method7545(this.equipment[0]);
			return var1.maleModel1 != class216.field2500.field2509 && var1.maleModel2 != class216.field2500.field2509;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1558025398"
	)
	public void method7533(int var1, int var2) {
		this.bodyColors[var1] = var2;
		this.method7525();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "51"
	)
	public void method7541(int var1) {
		ItemComposition var2 = AttackOption.ItemDefinition_get(var1);
		this.equipment[var2.maleModel] = var1 + 2048;
		if (var2.maleModel1 != -1) {
			this.equipment[var2.maleModel1] = 0;
		}

		if (var2.maleModel2 != -1) {
			this.equipment[var2.maleModel2] = 0;
		}

		this.method7525();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1915861852"
	)
	boolean method7542(int var1) {
		return var1 >= 256 && var1 < 2048;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Lhs;",
		garbageValue = "-803180776"
	)
	@Export("KitDefinition_get")
	KitDefinition KitDefinition_get(int var1) {
		return class524.method10438(var1 - 256);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-73765989"
	)
	boolean method7544(int var1) {
		return var1 >= 2048;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lis;",
		garbageValue = "1001484861"
	)
	ItemComposition method7545(int var1) {
		return AttackOption.ItemDefinition_get(var1 - 2048);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-636594995"
	)
	int method7602(int var1) {
		return var1 - 512 + 2048;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1970936975"
	)
	public static boolean method7600(int var0) {
		return var0 >= WorldMapDecorationType.field4361.id && var0 <= WorldMapDecorationType.field4362.id;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIILco;B)Lre;",
		garbageValue = "69"
	)
	static class452 method7565(int var0, int var1, int var2, int var3, WorldViewManager var4) {
		class452 var5 = null;
		WorldView var6 = null;
		int var9;
		if (class336.method7086(var0)) {
			boolean var8 = var0 > 0;
			Object var7;
			if (!var8) {
				var9 = -var0 - 1;
				var6 = class418.method8493(var9, var4);
				var7 = var6.method2683(var9);
			} else {
				var9 = FileSystem.method5941(var0);
				Iterator var11 = var4.iterator();

				WorldView var10;
				while (true) {
					if (var11.hasNext()) {
						WorldView var12 = (WorldView)var11.next();
						if (var12.npcs.get((long)var9) == null) {
							continue;
						}

						var10 = var12;
						break;
					}

					var10 = var4.method2343();
					break;
				}

				var6 = var10;
				var7 = (Actor)var10.npcs.get((long)var9);
			}

			if (var7 != null) {
				Coord var15 = ((Actor)var7).method2435(var6);
				class452 var20;
				synchronized(class452.field5171) {
					if (class452.field5173 == 0) {
						var20 = new class452();
					} else {
						class452.field5171[--class452.field5173].method9004();
						var20 = class452.field5171[class452.field5173];
					}
				}

				var5 = var20;
				var20.field5175 = (float)var15.x;
				var20.field5169 = (float)var15.y;
			}
		}

		if (var5 == null) {
			var6 = var4.method2345(var1, var2);
			int var16 = var1 - var6.baseX;
			int var19 = var2 - var6.baseY;
			WorldEntity var22 = (WorldEntity)var4.method2343().worldEntities.get((long)var6.id);
			if (var22 != null) {
				var5 = var22.method10084(Coord.method7416(var16), Coord.method7416(var19));
			} else {
				var5 = WorldMapSection0.method6761((float)Coord.method7416(var16), 0.0F, (float)Coord.method7416(var19));
			}
		}

		var9 = (int)var5.field5175;
		int var14 = (int)var5.field5169;
		int var17 = JagNetThread.method8434(var6, var9, var14, var3);
		WorldEntity var21 = (WorldEntity)class333.topLevelWorldView.worldEntities.get((long)var6.id);
		if (var21 != null) {
			var17 += JagNetThread.method8434(class333.topLevelWorldView, var21.getY(), var21.getPlane(), var21.getX());
		}

		var5.field5176 = (float)var17;
		return var5;
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "122"
	)
	static void method7601() {
		Client.mouseLastLastPressedTimeMillis = 1L;
		if (class398.mouseRecorder != null) {
			class398.mouseRecorder.index = 0;
		}

		GameEngine.hasFocus = true;
		Client.hadFocus = true;
		Client.field466 = -1L;
		class36.reflectionChecks = new IterableNodeDeque();
		Client.packetWriter.clearBuffer();
		Client.packetWriter.field1289 = 0;
		Client.packetWriter.packetBuffer.array = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1295 = null;
		Client.packetWriter.field1302 = null;
		Client.packetWriter.field1306 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1297 = 0;
		Client.rebootTimer = 0;
		Client.logoutTimer = 0;
		Client.hintArrowType = 0;
		Widget.method8102();
		ReflectionCheck.method740(0);
		Messages.Messages_channels.clear();
		Messages.Messages_hashTable.clear();
		Messages.Messages_queue.clear();
		Messages.Messages_count = 0;
		Client.isItemSelected = 0;
		Client.isSpellSelected = false;
		class58.soundEffectCount = 0;
		Client.camAngleY = 0;
		Client.oculusOrbState = 0;
		ClanChannelMember.field1780 = null;
		Client.minimapState = 0;
		Client.field576 = -1;
		Client.destinationX = 0;
		Client.destinationY = 0;
		Client.playerAttackOption = AttackOption.AttackOption_hidden;
		Client.npcAttackOption = AttackOption.AttackOption_hidden;
		Client.worldViewManager.clear();
		Client.field346 = -1;
		Client.projectiles.clear();
		Client.playerUpdateManager.clear();
		ApproximateRouteStrategy.friendSystem.method1539();
		Arrays.fill(GrandExchangeOfferUnitPriceComparator.Varps_temp, 0);
		Arrays.fill(Varps.Varps_main, 0);
		if (class516.varcs != null) {
			class516.varcs.clearTransient();
		}

		Client.followerIndex = -1;
		if (Client.rootInterface != -1) {
			UrlRequester.widgetDefinition.method7479(Client.rootInterface);
		}

		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) {
			WorldEntityCoord.closeInterface(var0, true);
		}

		Client.rootInterface = -1;
		Client.interfaceParents = new NodeHashTable(8);
		Client.meslayerContinueWidget = null;
		Widget.method8102();
		Client.playerAppearance.method7527((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1);

		int var1;
		for (var1 = 0; var1 < 8; ++var1) {
			Client.playerMenuActions[var1] = null;
			Client.playerOptionsPriorities[var1] = false;
		}

		ItemContainer.itemContainers = new NodeHashTable(32);
		Client.isLoading = true;

		for (var1 = 0; var1 < 100; ++var1) {
			Client.validRootWidgets[var1] = true;
		}

		if (Client.packetWriter != null && Client.packetWriter.isaacCipher != null) {
			PacketBufferNode var2 = UserComparator6.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
			var2.packetBuffer.writeByte(MouseHandler.getWindowedMode());
			var2.packetBuffer.writeShort(GameEngine.canvasWidth);
			var2.packetBuffer.writeShort(class396.canvasHeight);
			Client.packetWriter.addNode(var2);
		}

		DevicePcmPlayerProvider.friendsChat = null;
		HttpAuthenticationHeader.guestClanSettings = null;
		Arrays.fill(Client.currentClanSettings, (Object)null);
		class86.guestClanChannel = null;
		Arrays.fill(Client.currentClanChannels, (Object)null);

		for (var1 = 0; var1 < 8; ++var1) {
			Client.grandExchangeOffers[var1] = new GrandExchangeOffer();
		}

		SongTask.grandExchangeEvents = null;
		Client.viewportOffsetX = 0;
		Client.viewportOffsetY = 0;
		Client.viewportWidth = 0;
		Client.viewportHeight = 0;
	}
}
