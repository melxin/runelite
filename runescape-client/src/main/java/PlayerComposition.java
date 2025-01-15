import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ny")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("as")
	public static short[][] field3816;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("PlayerAppearance_cachedModels")
	public static EvictingDualNodeHashTable PlayerAppearance_cachedModels;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	public static class465 field3808;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -335860431
	)
	public static int field3821;
	@ObfuscatedName("gw")
	@ObfuscatedGetter(
		intValue = -1676628777
	)
	@Export("worldPort")
	static int worldPort;
	@ObfuscatedName("ay")
	int[] field3814;
	@ObfuscatedName("ah")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("az")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1490652809
	)
	public int field3811;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1245891173
	)
	@Export("gender")
	public int gender;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1334537547
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = 1607323497860284279L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		longValue = 3880144033939998849L
	)
	long field3815;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lia;"
	)
	@Export("playerCompositionColorTextureOverrides")
	PlayerCompositionColorTextureOverride[] playerCompositionColorTextureOverrides;
	@ObfuscatedName("ac")
	boolean field3817;

	static {
		PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);
		field3808 = new class465(16, class463.field4954);
		field3821 = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Lny;)V"
	)
	PlayerComposition(PlayerComposition var1) {
		this.field3811 = -1;
		this.gender = 0;
		this.field3817 = false;
		if (var1 != null) {
			int[] var2 = Arrays.copyOf(var1.equipment, var1.equipment.length);
			int[] var3 = Arrays.copyOf(var1.field3814, var1.field3814.length);
			PlayerCompositionColorTextureOverride[] var4 = (PlayerCompositionColorTextureOverride[])(var1.playerCompositionColorTextureOverrides != null ? (PlayerCompositionColorTextureOverride[])Arrays.copyOf(var1.playerCompositionColorTextureOverrides, var1.playerCompositionColorTextureOverrides.length) : null);
			int[] var5 = Arrays.copyOf(var1.bodyColors, var1.bodyColors.length);
			this.method7095(var3, var2, var4, false, var5, var1.gender, var1.npcTransformId, var1.field3811);
		}
	}

	public PlayerComposition() {
		this.field3811 = -1;
		this.gender = 0;
		this.field3817 = false;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([I[I[Lia;Z[IIIII)V",
		garbageValue = "-1392352981"
	)
	public void method7095(int[] var1, int[] var2, PlayerCompositionColorTextureOverride[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
		this.playerCompositionColorTextureOverrides = var3;
		this.field3817 = var4;
		this.field3811 = var8;
		this.method7056(var1, var2, var5, var6, var7);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([I[I[IIIB)V",
		garbageValue = "-1"
	)
	public void method7056(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		if (var1 == null) {
			var1 = this.method7053(var4);
		}

		if (var2 == null) {
			var2 = this.method7053(var4);
		}

		this.field3814 = var1;
		this.equipment = var2;
		this.bodyColors = var3;
		this.gender = var4;
		this.npcTransformId = var5;
		this.setHash();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IS)[I",
		garbageValue = "-23811"
	)
	int[] method7053(int var1) {
		int[] var2 = new int[12];

		for (int var3 = 0; var3 < 7; ++var3) {
			for (int var4 = 0; var4 < KitDefinition.KitDefinition_fileCount; ++var4) {
				KitDefinition var6 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var4);
				KitDefinition var5;
				if (var6 != null) {
					var5 = var6;
				} else if (KitDefinition.KitDefinition_archive == null) {
					var5 = null;
				} else {
					byte[] var7 = KitDefinition.KitDefinition_archive.takeFile(3, var4);
					var6 = new KitDefinition();
					if (var7 != null) {
						var6.decode(new Buffer(var7));
					}

					KitDefinition.KitDefinition_cached.put(var6, (long)var4);
					var5 = var6;
				}

				if (var5 != null && !var5.nonSelectable && var5.method5207(var3, var1)) {
					if (class251.field2687 == null) {
						class251.field2687 = new int[7];
						class251.field2687[class251.field2681.field2686] = class266.field2953.field2949;
						class251.field2687[class251.field2679.field2686] = class266.field2958.field2949;
						class251.field2687[class251.field2680.field2686] = class266.field2959.field2949;
						class251.field2687[class251.field2683.field2686] = class266.field2951.field2949;
						class251.field2687[class251.field2682.field2686] = class266.field2954.field2949;
						class251.field2687[class251.field2685.field2686] = class266.field2952.field2949;
						class251.field2687[class251.field2684.field2686] = class266.field2947.field2949;
					}

					int var8 = class251.field2687[var3];
					var2[var8] = var4 + 256;
					break;
				}
			}
		}

		return var2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "879068555"
	)
	@Export("changeAppearance")
	public void changeAppearance(int var1, boolean var2) {
		int[] var3 = this.equipment;
		if (class251.field2687 == null) {
			class251.field2687 = new int[7];
			class251.field2687[class251.field2681.field2686] = class266.field2953.field2949;
			class251.field2687[class251.field2679.field2686] = class266.field2958.field2949;
			class251.field2687[class251.field2680.field2686] = class266.field2959.field2949;
			class251.field2687[class251.field2683.field2686] = class266.field2951.field2949;
			class251.field2687[class251.field2682.field2686] = class266.field2954.field2949;
			class251.field2687[class251.field2685.field2686] = class266.field2952.field2949;
			class251.field2687[class251.field2684.field2686] = class266.field2947.field2949;
		}

		int var4 = class251.field2687[var1];
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

				KitDefinition var8 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var6);
				if (var8 != null) {
					var7 = var8;
				} else if (KitDefinition.KitDefinition_archive == null) {
					var7 = null;
				} else {
					byte[] var9 = KitDefinition.KitDefinition_archive.takeFile(3, var6);
					var8 = new KitDefinition();
					if (var9 != null) {
						var8.decode(new Buffer(var9));
					}

					KitDefinition.KitDefinition_cached.put(var8, (long)var6);
					var7 = var8;
				}
			} while(var7 == null || var7.nonSelectable || !var7.method5207(var1, this.gender));

			int[] var12 = this.equipment;
			if (class251.field2687 == null) {
				class251.field2687 = new int[7];
				class251.field2687[class251.field2681.field2686] = class266.field2953.field2949;
				class251.field2687[class251.field2679.field2686] = class266.field2958.field2949;
				class251.field2687[class251.field2680.field2686] = class266.field2959.field2949;
				class251.field2687[class251.field2683.field2686] = class266.field2951.field2949;
				class251.field2687[class251.field2682.field2686] = class266.field2954.field2949;
				class251.field2687[class251.field2685.field2686] = class266.field2952.field2949;
				class251.field2687[class251.field2684.field2686] = class266.field2947.field2949;
			}

			int var11 = class251.field2687[var1];
			var12[var11] = var6 + 256;
			this.setHash();
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "109"
	)
	public void method7055(int var1, boolean var2) {
		int var3 = this.bodyColors[var1];
		boolean var4;
		if (!var2) {
			do {
				--var3;
				if (var3 < 0) {
					var3 = field3816[var1].length - 1;
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
				if (var3 >= field3816[var1].length) {
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-471744688"
	)
	public void method7087(int var1) {
		if (this.gender != var1) {
			this.method7056((int[])null, (int[])null, this.bodyColors, var1, -1);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "31055392"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.gender);

		int var2;
		for (var2 = 0; var2 < 7; ++var2) {
			int[] var3 = this.equipment;
			if (class251.field2687 == null) {
				class251.field2687 = new int[7];
				class251.field2687[class251.field2681.field2686] = class266.field2953.field2949;
				class251.field2687[class251.field2679.field2686] = class266.field2958.field2949;
				class251.field2687[class251.field2680.field2686] = class266.field2959.field2949;
				class251.field2687[class251.field2683.field2686] = class266.field2951.field2949;
				class251.field2687[class251.field2682.field2686] = class266.field2954.field2949;
				class251.field2687[class251.field2685.field2686] = class266.field2952.field2949;
				class251.field2687[class251.field2684.field2686] = class266.field2947.field2949;
			}

			int var4 = class251.field2687[var2];
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "20"
	)
	@Export("setHash")
	void setHash() {
		long var1 = this.hash;
		long[] var3 = Buffer.field5472;
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
		if (0L != var1 && this.hash != var1 || this.field3817) {
			PlayerAppearance_cachedModels.remove(var1);
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lkb;ILkb;II)Lhv;",
		garbageValue = "-31242308"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) {
			return FadeOutTask.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4, (NpcOverrides)null);
		} else {
			long var5 = this.hash;
			int[] var7 = this.equipment;
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) {
				var7 = new int[12];
				System.arraycopy(this.equipment, 0, var7, 0, var7.length);
				if (var1.shield >= 0) {
					var5 ^= (long)(var1.shield - this.equipment[class266.field2950.field2949]) << 40;
					var7[class266.field2950.field2949] = this.method7084(var1.shield);
				}

				if (var1.weapon >= 0) {
					var5 ^= (long)(var1.weapon - this.equipment[class266.field2955.field2949]) << 48;
					var7[class266.field2955.field2949] = this.method7084(var1.weapon);
				}
			}

			Model var8 = (Model)PlayerAppearance_cachedModels.get(var5);
			if (var8 == null) {
				boolean var9 = false;

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) {
					var11 = var7[var10];
					if (this.method7066(var11)) {
						KitDefinition var18 = this.KitDefinition_get(var11);
						if (var18 != null && !var18.ready()) {
							var9 = true;
						}
					}

					if (this.method7068(var11)) {
						PlayerCompositionColorTextureOverride var22 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var10];
						if (!this.method7069(var11).method5571(this.gender, var22)) {
							var9 = true;
						}
					}
				}

				if (var9) {
					if (this.field3815 != -1L) {
						var8 = (Model)PlayerAppearance_cachedModels.get(this.field3815);
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
						if (this.method7066(var13)) {
							KitDefinition var14 = this.KitDefinition_get(var13);
							ModelData var15 = null;
							if (var14 != null) {
								var15 = var14.getModelData();
							}

							if (var15 != null) {
								var17[var11++] = var15;
							}
						}

						if (this.method7068(var13)) {
							ItemComposition var20 = this.method7069(var13);
							PlayerCompositionColorTextureOverride var21 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var12];
							ModelData var16 = var20.method5572(this.gender, var21);
							if (var16 != null) {
								var17[var11++] = var16;
							}
						}
					}

					ModelData var23 = new ModelData(var17, var11);

					for (var13 = 0; var13 < 5; ++var13) {
						if (this.bodyColors[var13] < field3816[var13].length) {
							var23.recolor(FontName.field5323[var13], field3816[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < class7.field30[var13].length) {
							var23.recolor(class169.field1805[var13], class7.field30[var13][this.bodyColors[var13]]);
						}
					}

					var8 = var23.toModel(64, 850, -30, -50, -30);
					PlayerAppearance_cachedModels.put(var8, var5);
					this.field3815 = var5;
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Lgx;",
		garbageValue = "-2033006928"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) {
			return FadeOutTask.getNpcDefinition(this.npcTransformId).method5342((NpcOverrides)null);
		} else {
			boolean var1 = false;

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) {
				var3 = this.equipment[var2];
				if (this.method7066(var3)) {
					KitDefinition var9 = this.KitDefinition_get(var3);
					if (var9 != null && !var9.method5210()) {
						var1 = true;
					}
				}

				if (this.method7068(var3)) {
					PlayerCompositionColorTextureOverride var11 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var2];
					if (!this.method7069(var3).method5630(this.gender, var11)) {
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
					if (this.method7066(var5)) {
						KitDefinition var6 = this.KitDefinition_get(var5);
						var7 = null;
						if (var6 != null) {
							var7 = var6.getKitDefinitionModels();
						}

						if (var7 != null) {
							var8[var3++] = var7;
						}
					}

					if (this.method7068(var5)) {
						PlayerCompositionColorTextureOverride var10 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var4];
						var7 = this.method7069(var5).method5573(this.gender, var10);
						if (var7 != null) {
							var8[var3++] = var7;
						}
					}
				}

				ModelData var12 = new ModelData(var8, var3);

				for (var5 = 0; var5 < 5; ++var5) {
					if (this.bodyColors[var5] < field3816[var5].length) {
						var12.recolor(FontName.field5323[var5], field3816[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < class7.field30[var5].length) {
						var12.recolor(class169.field1805[var5], class7.field30[var5][this.bodyColors[var5]]);
					}
				}

				return var12;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-112654412"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		long var1 = this.hash;
		if (this.npcTransformId != -1) {
			var1 = -65536L | (long)this.npcTransformId;
		}

		Integer var3 = (Integer)field3808.method9037(var1);
		if (var3 == null) {
			var3 = ++field3821 - 1;
			field3808.method9038(var1, var3);
			field3821 %= 65535;
		}

		return var3;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1103442003"
	)
	void method7061() {
		this.method7056(this.field3814, this.equipment, this.bodyColors, this.gender, this.npcTransformId);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1452730156"
	)
	public void method7062(int var1, int var2) {
		boolean var3 = var2 != this.gender;
		this.gender = var2;
		if (var3) {
			int var4;
			int var5;
			if (this.gender == var1) {
				for (var4 = 0; var4 < 7; ++var4) {
					if (class251.field2687 == null) {
						class251.field2687 = new int[7];
						class251.field2687[class251.field2681.field2686] = class266.field2953.field2949;
						class251.field2687[class251.field2679.field2686] = class266.field2958.field2949;
						class251.field2687[class251.field2680.field2686] = class266.field2959.field2949;
						class251.field2687[class251.field2683.field2686] = class266.field2951.field2949;
						class251.field2687[class251.field2682.field2686] = class266.field2954.field2949;
						class251.field2687[class251.field2685.field2686] = class266.field2952.field2949;
						class251.field2687[class251.field2684.field2686] = class266.field2947.field2949;
					}

					var5 = class251.field2687[var4];
					if (this.equipment[var5] > 0 && this.equipment[var5] < 2048) {
						this.equipment[var5] = this.field3814[var5];
					}
				}
			} else {
				if (this.equipment[0] < 2048 || this.method7094()) {
					this.equipment[class266.field2958.field2949] = 1;
				}

				for (var4 = 0; var4 < 7; ++var4) {
					if (class251.field2687 == null) {
						class251.field2687 = new int[7];
						class251.field2687[class251.field2681.field2686] = class266.field2953.field2949;
						class251.field2687[class251.field2679.field2686] = class266.field2958.field2949;
						class251.field2687[class251.field2680.field2686] = class266.field2959.field2949;
						class251.field2687[class251.field2683.field2686] = class266.field2951.field2949;
						class251.field2687[class251.field2682.field2686] = class266.field2954.field2949;
						class251.field2687[class251.field2685.field2686] = class266.field2952.field2949;
						class251.field2687[class251.field2684.field2686] = class266.field2947.field2949;
					}

					var5 = class251.field2687[var4];
					if (this.equipment[var5] > 0 && this.equipment[var5] < 2048) {
						int[] var8 = this.equipment;

						for (int var9 = 0; var9 < KitDefinition.KitDefinition_fileCount; ++var9) {
							KitDefinition var11 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var9);
							KitDefinition var10;
							if (var11 != null) {
								var10 = var11;
							} else if (KitDefinition.KitDefinition_archive == null) {
								var10 = null;
							} else {
								byte[] var12 = KitDefinition.KitDefinition_archive.takeFile(3, var9);
								var11 = new KitDefinition();
								if (var12 != null) {
									var11.decode(new Buffer(var12));
								}

								KitDefinition.KitDefinition_cached.put(var11, (long)var9);
								var10 = var11;
							}

							if (var10 != null && !var10.nonSelectable && var10.method5207(var4, var2)) {
								if (class251.field2687 == null) {
									class251.field2687 = new int[7];
									class251.field2687[class251.field2681.field2686] = class266.field2953.field2949;
									class251.field2687[class251.field2679.field2686] = class266.field2958.field2949;
									class251.field2687[class251.field2680.field2686] = class266.field2959.field2949;
									class251.field2687[class251.field2683.field2686] = class266.field2951.field2949;
									class251.field2687[class251.field2682.field2686] = class266.field2954.field2949;
									class251.field2687[class251.field2685.field2686] = class266.field2952.field2949;
									class251.field2687[class251.field2684.field2686] = class266.field2947.field2949;
								}

								int var13 = class251.field2687[var4];
								var8[var13] = var9 + 256;
								break;
							}
						}
					}
				}
			}
		}

		this.method7061();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1944383974"
	)
	boolean method7094() {
		if (!this.method7068(this.equipment[0])) {
			return false;
		} else {
			ItemComposition var1 = this.method7069(this.equipment[0]);
			return var1.maleModel1 != class266.field2958.field2949 && var1.maleModel2 != class266.field2958.field2949;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "98"
	)
	public void method7064(int var1, int var2) {
		this.bodyColors[var1] = var2;
		this.method7061();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-486751351"
	)
	public void method7080(int var1) {
		ItemComposition var2 = FaceNormal.ItemDefinition_get(var1);
		this.equipment[var2.maleModel] = var1 + 2048;
		if (var2.maleModel1 != -1) {
			this.equipment[var2.maleModel1] = 0;
		}

		if (var2.maleModel2 != -1) {
			this.equipment[var2.maleModel2] = 0;
		}

		this.method7061();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "126025052"
	)
	boolean method7066(int var1) {
		return var1 >= 256 && var1 < 2048;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljx;",
		garbageValue = "0"
	)
	@Export("KitDefinition_get")
	KitDefinition KitDefinition_get(int var1) {
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-79"
	)
	boolean method7068(int var1) {
		return var1 >= 2048;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Lkm;",
		garbageValue = "4"
	)
	ItemComposition method7069(int var1) {
		return FaceNormal.ItemDefinition_get(var1 - 2048);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "688799447"
	)
	int method7084(int var1) {
		return var1 - 512 + 2048;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)[Lsn;",
		garbageValue = "-43"
	)
	public static class492[] method7114() {
		return new class492[]{class492.field5095, class492.field5092, class492.field5094};
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "180"
	)
	static final boolean method7125(int var0) {
		return var0 == 7 || var0 == 8 || var0 >= 9 && var0 <= 13;
	}
}
