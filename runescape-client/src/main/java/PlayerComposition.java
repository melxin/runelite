import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nv")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("PlayerAppearance_cachedModels")
	static EvictingDualNodeHashTable PlayerAppearance_cachedModels;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	static class465 field3815;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1721616417
	)
	static int field3816;
	@ObfuscatedName("ab")
	int[] field3808;
	@ObfuscatedName("aw")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("at")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -754696613
	)
	public int field3804;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1867769567
	)
	@Export("gender")
	public int gender;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -851870459
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = -958245328315668793L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = 4376886104562815915L
	)
	long field3811;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lgk;"
	)
	@Export("playerCompositionColorTextureOverrides")
	PlayerCompositionColorTextureOverride[] playerCompositionColorTextureOverrides;
	@ObfuscatedName("an")
	boolean field3817;

	static {
		PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);
		field3815 = new class465(16, class463.field4954);
		field3816 = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Lnv;)V"
	)
	PlayerComposition(PlayerComposition var1) {
		this.field3804 = -1;
		this.gender = 0;
		this.field3817 = false;
		if (var1 != null) {
			int[] var2 = Arrays.copyOf(var1.equipment, var1.equipment.length);
			int[] var3 = Arrays.copyOf(var1.field3808, var1.field3808.length);
			PlayerCompositionColorTextureOverride[] var4 = (PlayerCompositionColorTextureOverride[])(var1.playerCompositionColorTextureOverrides != null ? (PlayerCompositionColorTextureOverride[])Arrays.copyOf(var1.playerCompositionColorTextureOverrides, var1.playerCompositionColorTextureOverrides.length) : null);
			int[] var5 = Arrays.copyOf(var1.bodyColors, var1.bodyColors.length);
			this.method6901(var3, var2, var4, false, var5, var1.gender, var1.npcTransformId, var1.field3804);
		}
	}

	public PlayerComposition() {
		this.field3804 = -1;
		this.gender = 0;
		this.field3817 = false;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([I[I[Lgk;Z[IIIII)V",
		garbageValue = "235648169"
	)
	public void method6901(int[] var1, int[] var2, PlayerCompositionColorTextureOverride[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
		this.playerCompositionColorTextureOverrides = var3;
		this.field3817 = var4;
		this.field3804 = var8;
		this.method6902(var1, var2, var5, var6, var7);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([I[I[IIIB)V",
		garbageValue = "0"
	)
	public void method6902(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		if (var1 == null) {
			var1 = this.method6903(var4);
		}

		if (var2 == null) {
			var2 = this.method6903(var4);
		}

		this.field3808 = var1;
		this.equipment = var2;
		this.bodyColors = var3;
		this.gender = var4;
		this.npcTransformId = var5;
		this.setHash();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)[I",
		garbageValue = "0"
	)
	int[] method6903(int var1) {
		int[] var2 = new int[12];

		for (int var3 = 0; var3 < 7; ++var3) {
			class165.method3631(var1, var2, var3);
		}

		return var2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "2145200900"
	)
	@Export("changeAppearance")
	public void changeAppearance(int var1, boolean var2) {
		int[] var3 = this.equipment;
		if (class198.field2055 == null) {
			class198.method3968();
		}

		int var4 = class198.field2055[var1];
		int var5 = var3[var4];
		if (var5 != 0) {
			var5 -= 256;

			KitDefinition var6;
			do {
				if (!var2) {
					--var5;
					if (var5 < 0) {
						var5 = class419.KitDefinition_fileCount - 1;
					}
				} else {
					++var5;
					if (var5 >= class419.KitDefinition_fileCount) {
						var5 = 0;
					}
				}

				KitDefinition var7 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var5);
				if (var7 != null) {
					var6 = var7;
				} else if (KitDefinition.KitDefinition_archive == null) {
					var6 = null;
				} else {
					byte[] var8 = KitDefinition.KitDefinition_archive.takeFile(3, var5);
					var7 = new KitDefinition();
					if (var8 != null) {
						var7.decode(new Buffer(var8));
					}

					KitDefinition.KitDefinition_cached.put(var7, (long)var5);
					var6 = var7;
				}
			} while(var6 == null || var6.nonSelectable || !var6.method3811(var1, this.gender));

			int[] var10 = this.equipment;
			if (class198.field2055 == null) {
				class198.method3968();
			}

			int var9 = class198.field2055[var1];
			var10[var9] = var5 + 256;
			this.setHash();
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "1"
	)
	public void method6905(int var1, boolean var2) {
		int var3 = this.bodyColors[var1];
		boolean var4;
		if (!var2) {
			do {
				--var3;
				if (var3 < 0) {
					var3 = class182.field1880[var1].length - 1;
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
				if (var3 >= class182.field1880[var1].length) {
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "236"
	)
	public void method6906(int var1) {
		if (this.gender != var1) {
			this.method6902((int[])null, (int[])null, this.bodyColors, var1, -1);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lvj;S)V",
		garbageValue = "4412"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.gender);

		int var2;
		for (var2 = 0; var2 < 7; ++var2) {
			int[] var3 = this.equipment;
			if (class198.field2055 == null) {
				class198.method3968();
			}

			int var4 = class198.field2055[var2];
			int var5 = var3[var4];
			if (var5 == 0) {
				var1.writeShort(-1);
			} else {
				var1.writeShort(var5 - 256);
			}
		}

		for (var2 = 0; var2 < 5; ++var2) {
			var1.writeByte(this.bodyColors[var2]);
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "114"
	)
	@Export("setHash")
	void setHash() {
		long var1 = this.hash;
		long[] var3 = Buffer.field5471;
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
		if (var1 != 0L && this.hash != var1 || this.field3817) {
			PlayerAppearance_cachedModels.remove(var1);
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Liy;ILiy;IS)Ljt;",
		garbageValue = "-11835"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) {
			return DynamicObject.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4, (NpcOverrides)null);
		} else {
			long var5 = this.hash;
			int[] var7 = this.equipment;
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) {
				var7 = new int[12];
				System.arraycopy(this.equipment, 0, var7, 0, var7.length);
				if (var1.shield >= 0) {
					var5 ^= (long)(var1.shield - this.equipment[class213.field2328.field2338]) << 40;
					var7[class213.field2328.field2338] = this.method6920(var1.shield);
				}

				if (var1.weapon >= 0) {
					var5 ^= (long)(var1.weapon - this.equipment[class213.field2330.field2338]) << 48;
					var7[class213.field2330.field2338] = this.method6920(var1.weapon);
				}
			}

			Model var8 = (Model)PlayerAppearance_cachedModels.get(var5);
			if (var8 == null) {
				boolean var9 = false;

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) {
					var11 = var7[var10];
					if (this.method6917(var11)) {
						KitDefinition var18 = this.method6911(var11);
						if (var18 != null && !var18.ready()) {
							var9 = true;
						}
					}

					if (this.method6922(var11)) {
						PlayerCompositionColorTextureOverride var22 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var10];
						if (!this.method6919(var11).method4197(this.gender, var22)) {
							var9 = true;
						}
					}
				}

				if (var9) {
					if (-1L != this.field3811) {
						var8 = (Model)PlayerAppearance_cachedModels.get(this.field3811);
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
						if (this.method6917(var13)) {
							KitDefinition var14 = this.method6911(var13);
							ModelData var15 = null;
							if (var14 != null) {
								var15 = var14.getModelData();
							}

							if (var15 != null) {
								var17[var11++] = var15;
							}
						}

						if (this.method6922(var13)) {
							ItemComposition var20 = this.method6919(var13);
							PlayerCompositionColorTextureOverride var21 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var12];
							ModelData var16 = var20.method4161(this.gender, var21);
							if (var16 != null) {
								var17[var11++] = var16;
							}
						}
					}

					ModelData var23 = new ModelData(var17, var11);

					for (var13 = 0; var13 < 5; ++var13) {
						if (this.bodyColors[var13] < class182.field1880[var13].length) {
							var23.recolor(class182.field1879[var13], class182.field1880[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < FloorOverlayDefinition.field2290[var13].length) {
							var23.recolor(KitDefinition.field1924[var13], FloorOverlayDefinition.field2290[var13][this.bodyColors[var13]]);
						}
					}

					var8 = var23.toModel(64, 850, -30, -50, -30);
					PlayerAppearance_cachedModels.put(var8, var5);
					this.field3811 = var5;
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljb;",
		garbageValue = "1840938735"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) {
			return DynamicObject.getNpcDefinition(this.npcTransformId).method3904((NpcOverrides)null);
		} else {
			boolean var1 = false;

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) {
				var3 = this.equipment[var2];
				if (this.method6917(var3)) {
					KitDefinition var9 = this.method6911(var3);
					if (var9 != null && !var9.method3813()) {
						var1 = true;
					}
				}

				if (this.method6922(var3)) {
					PlayerCompositionColorTextureOverride var11 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var2];
					if (!this.method6919(var3).method4166(this.gender, var11)) {
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
					if (this.method6917(var5)) {
						KitDefinition var6 = this.method6911(var5);
						var7 = null;
						if (var6 != null) {
							var7 = var6.getKitDefinitionModels();
						}

						if (var7 != null) {
							var8[var3++] = var7;
						}
					}

					if (this.method6922(var5)) {
						PlayerCompositionColorTextureOverride var10 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var4];
						var7 = this.method6919(var5).method4164(this.gender, var10);
						if (var7 != null) {
							var8[var3++] = var7;
						}
					}
				}

				ModelData var12 = new ModelData(var8, var3);

				for (var5 = 0; var5 < 5; ++var5) {
					if (this.bodyColors[var5] < class182.field1880[var5].length) {
						var12.recolor(class182.field1879[var5], class182.field1880[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < FloorOverlayDefinition.field2290[var5].length) {
						var12.recolor(KitDefinition.field1924[var5], FloorOverlayDefinition.field2290[var5][this.bodyColors[var5]]);
					}
				}

				return var12;
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-7"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		long var1 = this.hash;
		if (this.npcTransformId != -1) {
			var1 = -65536L | (long)this.npcTransformId;
		}

		Integer var3 = (Integer)field3815.method8877(var1);
		if (var3 == null) {
			var3 = ++field3816 - 1;
			field3815.method8882(var1, var3);
			field3816 %= 65535;
		}

		return var3;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1191068535"
	)
	void method6960() {
		this.method6902(this.field3808, this.equipment, this.bodyColors, this.gender, this.npcTransformId);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2065570423"
	)
	public void method6959(int var1, int var2) {
		boolean var3 = var2 != this.gender;
		this.gender = var2;
		if (var3) {
			int var4;
			int var5;
			if (this.gender == var1) {
				for (var4 = 0; var4 < 7; ++var4) {
					if (class198.field2055 == null) {
						class198.method3968();
					}

					var5 = class198.field2055[var4];
					if (this.equipment[var5] > 0 && this.equipment[var5] < 2048) {
						this.equipment[var5] = this.field3808[var5];
					}
				}
			} else {
				if (this.equipment[0] < 2048 || this.method6914()) {
					this.equipment[class213.field2334.field2338] = 1;
				}

				for (var4 = 0; var4 < 7; ++var4) {
					if (class198.field2055 == null) {
						class198.method3968();
					}

					var5 = class198.field2055[var4];
					if (this.equipment[var5] > 0 && this.equipment[var5] < 2048) {
						class165.method3631(var2, this.equipment, var4);
					}
				}
			}
		}

		this.method6960();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "811418375"
	)
	boolean method6914() {
		if (!this.method6922(this.equipment[0])) {
			return false;
		} else {
			ItemComposition var1 = this.method6919(this.equipment[0]);
			return var1.maleModel1 != class213.field2334.field2338 && var1.maleModel2 != class213.field2334.field2338;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1860496016"
	)
	public void method6899(int var1, int var2) {
		this.bodyColors[var1] = var2;
		this.method6960();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-21"
	)
	public void method6916(int var1) {
		ItemComposition var2 = WorldEntityCoord.ItemDefinition_get(var1);
		this.equipment[var2.maleModel] = var1 + 2048;
		if (var2.maleModel1 != -1) {
			this.equipment[var2.maleModel1] = 0;
		}

		if (var2.maleModel2 != -1) {
			this.equipment[var2.maleModel2] = 0;
		}

		this.method6960();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "48"
	)
	boolean method6917(int var1) {
		return var1 >= 256 && var1 < 2048;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Lhv;",
		garbageValue = "-253195904"
	)
	KitDefinition method6911(int var1) {
		int var3 = var1 - 256;
		KitDefinition var4 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var3);
		KitDefinition var2;
		if (var4 != null) {
			var2 = var4;
		} else if (KitDefinition.KitDefinition_archive == null) {
			var2 = null;
		} else {
			byte[] var5 = KitDefinition.KitDefinition_archive.takeFile(3, var3);
			var4 = new KitDefinition();
			if (var5 != null) {
				var4.decode(new Buffer(var5));
			}

			KitDefinition.KitDefinition_cached.put(var4, (long)var3);
			var2 = var4;
		}

		return var2;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "495043014"
	)
	boolean method6922(int var1) {
		return var1 >= 2048;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Liq;",
		garbageValue = "317973375"
	)
	ItemComposition method6919(int var1) {
		return WorldEntityCoord.ItemDefinition_get(var1 - 2048);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1849604980"
	)
	int method6920(int var1) {
		return var1 - 512 + 2048;
	}
}
