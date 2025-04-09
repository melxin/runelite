import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("ae")
	public static short[] field3877;
	@ObfuscatedName("af")
	public static short[][] field3878;
	@ObfuscatedName("aq")
	public static short[][] field3879;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("PlayerAppearance_cachedModels")
	public static EvictingDualNodeHashTable PlayerAppearance_cachedModels;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lsc;"
	)
	public static class477 field3881;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -793886967
	)
	public static int field3882;
	@ObfuscatedName("ap")
	int[] field3875;
	@ObfuscatedName("ax")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("aw")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1907853229
	)
	public int field3886;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1159783695
	)
	@Export("gender")
	public int gender;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1842255603
	)
	@Export("npcTransformId")
	int npcTransformId;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = 4292405325156788003L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = 6944808365024098769L
	)
	long field3890;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Lie;"
	)
	@Export("playerCompositionColorTextureOverrides")
	PlayerCompositionColorTextureOverride[] playerCompositionColorTextureOverrides;
	@ObfuscatedName("ak")
	boolean field3892;

	static {
		PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);
		field3881 = new class477(16, class475.field5090);
		field3882 = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Lnz;)V"
	)
	PlayerComposition(PlayerComposition var1) {
		this.field3886 = -1;
		this.gender = 0;
		this.field3892 = false;
		if (var1 != null) {
			int[] var2 = Arrays.copyOf(var1.equipment, var1.equipment.length);
			int[] var3 = Arrays.copyOf(var1.field3875, var1.field3875.length);
			PlayerCompositionColorTextureOverride[] var4 = (PlayerCompositionColorTextureOverride[])(var1.playerCompositionColorTextureOverrides != null ? (PlayerCompositionColorTextureOverride[])Arrays.copyOf(var1.playerCompositionColorTextureOverrides, var1.playerCompositionColorTextureOverrides.length) : null);
			int[] var5 = Arrays.copyOf(var1.bodyColors, var1.bodyColors.length);
			this.method7060(var3, var2, var4, false, var5, var1.gender, var1.npcTransformId, var1.field3886);
		}
	}

	public PlayerComposition() {
		this.field3886 = -1;
		this.gender = 0;
		this.field3892 = false;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([I[I[Lie;Z[IIIII)V",
		garbageValue = "-144778114"
	)
	public void method7060(int[] var1, int[] var2, PlayerCompositionColorTextureOverride[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
		this.playerCompositionColorTextureOverrides = var3;
		this.field3892 = var4;
		this.field3886 = var8;
		this.method6990(var1, var2, var5, var6, var7);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([I[I[IIII)V",
		garbageValue = "-714132626"
	)
	public void method6990(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		if (var1 == null) {
			var1 = this.method6991(var4);
		}

		if (var2 == null) {
			var2 = this.method6991(var4);
		}

		this.field3875 = var1;
		this.equipment = var2;
		this.bodyColors = var3;
		this.gender = var4;
		this.npcTransformId = var5;
		this.setHash();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "1957814013"
	)
	int[] method6991(int var1) {
		int[] var2 = new int[12];

		for (int var3 = 0; var3 < 7; ++var3) {
			for (int var4 = 0; var4 < KitDefinition.KitDefinition_fileCount; ++var4) {
				KitDefinition var5 = class33.method490(var4);
				if (var5 != null && !var5.nonSelectable && var5.method5093(var3, var1)) {
					if (class251.field2773 == null) {
						class251.method5231();
					}

					int var7 = class251.field2773[var3];
					var2[var7] = var4 + 256;
					break;
				}
			}
		}

		return var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-564380897"
	)
	@Export("changeAppearance")
	public void changeAppearance(int var1, boolean var2) {
		int[] var3 = this.equipment;
		if (class251.field2773 == null) {
			class251.method5231();
		}

		int var4 = class251.field2773[var1];
		int var5 = var3[var4];
		if (var5 != 0) {
			var5 -= 256;

			KitDefinition var6;
			do {
				if (!var2) {
					--var5;
					if (var5 < 0) {
						var5 = KitDefinition.KitDefinition_fileCount - 1;
					}
				} else {
					++var5;
					if (var5 >= KitDefinition.KitDefinition_fileCount) {
						var5 = 0;
					}
				}

				var6 = class33.method490(var5);
			} while(var6 == null || var6.nonSelectable || !var6.method5093(var1, this.gender));

			int[] var8 = this.equipment;
			if (class251.field2773 == null) {
				class251.method5231();
			}

			int var7 = class251.field2773[var1];
			var8[var7] = var5 + 256;
			this.setHash();
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IZS)V",
		garbageValue = "-25845"
	)
	public void method6993(int var1, boolean var2) {
		int var3 = this.bodyColors[var1];
		if (!var2) {
			do {
				--var3;
				if (var3 < 0) {
					var3 = field3878[var1].length - 1;
				}
			} while(!class448.method8532(var1, var3));
		} else {
			do {
				++var3;
				if (var3 >= field3878[var1].length) {
					var3 = 0;
				}
			} while(!class448.method8532(var1, var3));
		}

		this.bodyColors[var1] = var3;
		this.setHash();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1758142820"
	)
	public void method7021(int var1) {
		if (this.gender != var1) {
			this.method6990((int[])null, (int[])null, this.bodyColors, var1, -1);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lve;I)V",
		garbageValue = "-1001851691"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.gender);

		int var2;
		for (var2 = 0; var2 < 7; ++var2) {
			int[] var3 = this.equipment;
			if (class251.field2773 == null) {
				class251.method5231();
			}

			int var4 = class251.field2773[var2];
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-120937650"
	)
	@Export("setHash")
	void setHash() {
		long var1 = this.hash;
		long[] var3 = Buffer.field5599;
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
		if (0L != var1 && var1 != this.hash || this.field3892) {
			PlayerAppearance_cachedModels.remove(var1);
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lkm;ILkm;IB)Lhe;",
		garbageValue = "-53"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) {
			return class232.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4, (NpcOverrides)null);
		} else {
			long var5 = this.hash;
			int[] var7 = this.equipment;
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) {
				var7 = new int[12];
				System.arraycopy(this.equipment, 0, var7, 0, var7.length);
				if (var1.shield >= 0) {
					var5 ^= (long)(var1.shield - this.equipment[class267.field3043.field3045]) << 40;
					var7[class267.field3043.field3045] = this.method7009(var1.shield);
				}

				if (var1.weapon >= 0) {
					var5 ^= (long)(var1.weapon - this.equipment[class267.field3036.field3045]) << 48;
					var7[class267.field3036.field3045] = this.method7009(var1.weapon);
				}
			}

			Model var8 = (Model)PlayerAppearance_cachedModels.get(var5);
			if (var8 == null) {
				boolean var9 = false;

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) {
					var11 = var7[var10];
					if (this.method7005(var11)) {
						KitDefinition var18 = this.KitDefinition_get(var11);
						if (var18 != null && !var18.ready()) {
							var9 = true;
						}
					}

					if (this.method6994(var11)) {
						PlayerCompositionColorTextureOverride var22 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var10];
						if (!this.method7008(var11).method5492(this.gender, var22)) {
							var9 = true;
						}
					}
				}

				if (var9) {
					if (-1L != this.field3890) {
						var8 = (Model)PlayerAppearance_cachedModels.get(this.field3890);
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
						if (this.method7005(var13)) {
							KitDefinition var14 = this.KitDefinition_get(var13);
							ModelData var15 = null;
							if (var14 != null) {
								var15 = var14.getModelData();
							}

							if (var15 != null) {
								var17[var11++] = var15;
							}
						}

						if (this.method6994(var13)) {
							ItemComposition var20 = this.method7008(var13);
							PlayerCompositionColorTextureOverride var21 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var12];
							ModelData var16 = var20.method5501(this.gender, var21);
							if (var16 != null) {
								var17[var11++] = var16;
							}
						}
					}

					ModelData var23 = new ModelData(var17, var11);

					for (var13 = 0; var13 < 5; ++var13) {
						if (this.bodyColors[var13] < field3878[var13].length) {
							var23.recolor(field3877[var13], field3878[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < field3879[var13].length) {
							var23.recolor(class172.field1875[var13], field3879[var13][this.bodyColors[var13]]);
						}
					}

					var8 = var23.toModel(64, 850, -30, -50, -30);
					PlayerAppearance_cachedModels.put(var8, var5);
					this.field3890 = var5;
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lgz;",
		garbageValue = "354010093"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) {
			return class232.getNpcDefinition(this.npcTransformId).method5195((NpcOverrides)null);
		} else {
			boolean var1 = false;

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) {
				var3 = this.equipment[var2];
				if (this.method7005(var3)) {
					KitDefinition var9 = this.KitDefinition_get(var3);
					if (var9 != null && !var9.method5096()) {
						var1 = true;
					}
				}

				if (this.method6994(var3)) {
					PlayerCompositionColorTextureOverride var11 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var2];
					if (!this.method7008(var3).method5500(this.gender, var11)) {
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
					if (this.method7005(var5)) {
						KitDefinition var6 = this.KitDefinition_get(var5);
						var7 = null;
						if (var6 != null) {
							var7 = var6.getKitDefinitionModels();
						}

						if (var7 != null) {
							var8[var3++] = var7;
						}
					}

					if (this.method6994(var5)) {
						PlayerCompositionColorTextureOverride var10 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var4];
						var7 = this.method7008(var5).method5542(this.gender, var10);
						if (var7 != null) {
							var8[var3++] = var7;
						}
					}
				}

				ModelData var12 = new ModelData(var8, var3);

				for (var5 = 0; var5 < 5; ++var5) {
					if (this.bodyColors[var5] < field3878[var5].length) {
						var12.recolor(field3877[var5], field3878[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < field3879[var5].length) {
						var12.recolor(class172.field1875[var5], field3879[var5][this.bodyColors[var5]]);
					}
				}

				return var12;
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1367797873"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		long var1 = this.hash;
		if (this.npcTransformId != -1) {
			var1 = -65536L | (long)this.npcTransformId;
		}

		Integer var3 = (Integer)field3881.method9082(var1);
		if (var3 == null) {
			var3 = ++field3882 - 1;
			field3881.method9083(var1, var3);
			field3882 %= 65535;
		}

		return var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1751888060"
	)
	void method7040() {
		this.method6990(this.field3875, this.equipment, this.bodyColors, this.gender, this.npcTransformId);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1875852721"
	)
	public void method7001(int var1, int var2) {
		boolean var3 = var2 != this.gender;
		this.gender = var2;
		if (var3) {
			int var4;
			int var5;
			if (this.gender == var1) {
				for (var4 = 0; var4 < 7; ++var4) {
					if (class251.field2773 == null) {
						class251.method5231();
					}

					var5 = class251.field2773[var4];
					if (this.equipment[var5] > 0 && this.equipment[var5] < 2048) {
						this.equipment[var5] = this.field3875[var5];
					}
				}
			} else {
				if (this.equipment[0] < 2048 || this.method7002()) {
					this.equipment[class267.field3042.field3045] = 1;
				}

				for (var4 = 0; var4 < 7; ++var4) {
					if (class251.field2773 == null) {
						class251.method5231();
					}

					var5 = class251.field2773[var4];
					if (this.equipment[var5] > 0 && this.equipment[var5] < 2048) {
						int[] var7 = this.equipment;

						for (int var8 = 0; var8 < KitDefinition.KitDefinition_fileCount; ++var8) {
							KitDefinition var9 = class33.method490(var8);
							if (var9 != null && !var9.nonSelectable && var9.method5093(var4, var2)) {
								if (class251.field2773 == null) {
									class251.method5231();
								}

								int var11 = class251.field2773[var4];
								var7[var11] = var8 + 256;
								break;
							}
						}
					}
				}
			}
		}

		this.method7040();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "954381125"
	)
	boolean method7002() {
		if (!this.method6994(this.equipment[0])) {
			return false;
		} else {
			ItemComposition var1 = this.method7008(this.equipment[0]);
			return var1.maleModel1 != class267.field3042.field3045 && var1.maleModel2 != class267.field3042.field3045;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1235100250"
	)
	public void method7003(int var1, int var2) {
		this.bodyColors[var1] = var2;
		this.method7040();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "8346"
	)
	public void method7004(int var1) {
		ItemComposition var2 = class231.ItemDefinition_get(var1);
		this.equipment[var2.maleModel] = var1 + 2048;
		if (var2.maleModel1 != -1) {
			this.equipment[var2.maleModel1] = 0;
		}

		if (var2.maleModel2 != -1) {
			this.equipment[var2.maleModel2] = 0;
		}

		this.method7040();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "14"
	)
	boolean method7005(int var1) {
		return var1 >= 256 && var1 < 2048;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IS)Ljy;",
		garbageValue = "28021"
	)
	@Export("KitDefinition_get")
	KitDefinition KitDefinition_get(int var1) {
		return class33.method490(var1 - 256);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "19046"
	)
	boolean method6994(int var1) {
		return var1 >= 2048;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Lkv;",
		garbageValue = "1903127564"
	)
	ItemComposition method7008(int var1) {
		return class231.ItemDefinition_get(var1 - 2048);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "3221"
	)
	int method7009(int var1) {
		return var1 - 512 + 2048;
	}
}
