import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oa")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("aj")
	public static short[][] field4146;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("PlayerAppearance_cachedModels")
	public static EvictingDualNodeHashTable PlayerAppearance_cachedModels;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	public static class498 field4148;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 629514101
	)
	public static int field4153;
	@ObfuscatedName("ay")
	int[] field4150;
	@ObfuscatedName("au")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("az")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1035639301
	)
	public int field4157;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -941255479
	)
	@Export("gender")
	public int gender;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1504383947
	)
	@Export("npcTransformId")
	int npcTransformId;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = 5134927487433058529L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = -2534806694966286359L
	)
	long field4145;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Lgx;"
	)
	@Export("playerCompositionColorTextureOverrides")
	PlayerCompositionColorTextureOverride[] playerCompositionColorTextureOverrides;
	@ObfuscatedName("ar")
	boolean field4159;

	static {
		PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);
		field4148 = new class498(16, class496.field5433);
		field4153 = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Loa;)V"
	)
	PlayerComposition(PlayerComposition var1) {
		this.field4157 = -1;
		this.gender = 0;
		this.field4159 = false;
		if (var1 != null) {
			int[] var2 = Arrays.copyOf(var1.equipment, var1.equipment.length);
			int[] var3 = Arrays.copyOf(var1.field4150, var1.field4150.length);
			PlayerCompositionColorTextureOverride[] var4 = (PlayerCompositionColorTextureOverride[])(var1.playerCompositionColorTextureOverrides != null ? (PlayerCompositionColorTextureOverride[])Arrays.copyOf(var1.playerCompositionColorTextureOverrides, var1.playerCompositionColorTextureOverrides.length) : null);
			int[] var5 = Arrays.copyOf(var1.bodyColors, var1.bodyColors.length);
			this.method7768(var3, var2, var4, false, var5, var1.gender, var1.npcTransformId, var1.field4157);
		}
	}

	public PlayerComposition() {
		this.field4157 = -1;
		this.gender = 0;
		this.field4159 = false;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([I[I[Lgx;Z[IIIII)V",
		garbageValue = "-2025636455"
	)
	public void method7768(int[] var1, int[] var2, PlayerCompositionColorTextureOverride[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
		this.playerCompositionColorTextureOverrides = var3;
		this.field4159 = var4;
		this.field4157 = var8;
		this.method7837(var1, var2, var5, var6, var7);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([I[I[IIIB)V",
		garbageValue = "123"
	)
	public void method7837(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		if (var1 == null) {
			var1 = this.method7770(var4);
		}

		if (var2 == null) {
			var2 = this.method7770(var4);
		}

		this.field4150 = var1;
		this.equipment = var2;
		this.bodyColors = var3;
		this.gender = var4;
		this.npcTransformId = var5;
		this.setHash();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "-833268089"
	)
	int[] method7770(int var1) {
		int[] var2 = new int[12];

		for (int var3 = 0; var3 < 7; ++var3) {
			for (int var4 = 0; var4 < class408.KitDefinition_fileCount; ++var4) {
				KitDefinition var5 = class225.method5030(var4);
				if (var5 != null && !var5.nonSelectable && var5.method4362(var3, var1)) {
					var2[class204.method4553(var3)] = var4 + 256;
					break;
				}
			}
		}

		return var2;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "880471699"
	)
	@Export("changeAppearance")
	public void changeAppearance(int var1, boolean var2) {
		int var3 = this.equipment[class204.method4553(var1)];
		if (var3 != 0) {
			var3 -= 256;

			KitDefinition var4;
			do {
				if (!var2) {
					--var3;
					if (var3 < 0) {
						var3 = class408.KitDefinition_fileCount - 1;
					}
				} else {
					++var3;
					if (var3 >= class408.KitDefinition_fileCount) {
						var3 = 0;
					}
				}

				var4 = class225.method5030(var3);
			} while(var4 == null || var4.nonSelectable || !var4.method4362(var1, this.gender));

			this.equipment[class204.method4553(var1)] = var3 + 256;
			this.setHash();
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-909859953"
	)
	public void method7772(int var1, boolean var2) {
		int var3 = this.bodyColors[var1];
		if (!var2) {
			do {
				--var3;
				if (var3 < 0) {
					var3 = ItemContainer.field826[var1].length - 1;
				}
			} while(!WorldMapRegion.method6746(var1, var3));
		} else {
			do {
				++var3;
				if (var3 >= ItemContainer.field826[var1].length) {
					var3 = 0;
				}
			} while(!WorldMapRegion.method6746(var1, var3));
		}

		this.bodyColors[var1] = var3;
		this.setHash();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1608162426"
	)
	public void method7806(int var1) {
		if (this.gender != var1) {
			this.method7837((int[])null, (int[])null, this.bodyColors, var1, -1);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxa;I)V",
		garbageValue = "-1803734593"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.gender);

		int var2;
		for (var2 = 0; var2 < 7; ++var2) {
			int var3 = this.equipment[class204.method4553(var2)];
			if (var3 == 0) {
				var1.writeShort(-1);
			} else {
				var1.writeShort(var3 - 256);
			}
		}

		for (var2 = 0; var2 < 5; ++var2) {
			var1.writeByte(this.bodyColors[var2]);
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	@Export("setHash")
	void setHash() {
		long var1 = this.hash;
		long[] var3 = Buffer.field6016;
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
		if (0L != var1 && var1 != this.hash || this.field4159) {
			PlayerAppearance_cachedModels.remove(var1);
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Liw;ILiw;IB)Lky;",
		garbageValue = "35"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) {
			return AsyncHttpResponse.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4, (NpcOverrides)null);
		} else {
			long var5 = this.hash;
			int[] var7 = this.equipment;
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) {
				var7 = new int[12];
				System.arraycopy(this.equipment, 0, var7, 0, var7.length);
				if (var1.shield >= 0) {
					var5 ^= (long)(var1.shield - this.equipment[class222.field2527.field2536]) << 40;
					var7[class222.field2527.field2536] = this.method7788(var1.shield);
				}

				if (var1.weapon >= 0) {
					var5 ^= (long)(var1.weapon - this.equipment[class222.field2528.field2536]) << 48;
					var7[class222.field2528.field2536] = this.method7788(var1.weapon);
				}
			}

			Model var8 = (Model)PlayerAppearance_cachedModels.get(var5);
			if (var8 == null) {
				boolean var9 = false;

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) {
					var11 = var7[var10];
					if (this.method7807(var11)) {
						KitDefinition var18 = this.KitDefinition_get(var11);
						if (var18 != null && !var18.ready()) {
							var9 = true;
						}
					}

					if (this.method7786(var11)) {
						PlayerCompositionColorTextureOverride var22 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var10];
						if (!this.method7787(var11).method4835(this.gender, var22)) {
							var9 = true;
						}
					}
				}

				if (var9) {
					if (this.field4145 != -1L) {
						var8 = (Model)PlayerAppearance_cachedModels.get(this.field4145);
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
						if (this.method7807(var13)) {
							KitDefinition var14 = this.KitDefinition_get(var13);
							ModelData var15 = null;
							if (var14 != null) {
								var15 = var14.getModelData();
							}

							if (var15 != null) {
								var17[var11++] = var15;
							}
						}

						if (this.method7786(var13)) {
							ItemComposition var20 = this.method7787(var13);
							PlayerCompositionColorTextureOverride var21 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var12];
							ModelData var16 = var20.method4836(this.gender, var21);
							if (var16 != null) {
								var17[var11++] = var16;
							}
						}
					}

					ModelData var23 = new ModelData(var17, var11);

					for (var13 = 0; var13 < 5; ++var13) {
						if (this.bodyColors[var13] < ItemContainer.field826[var13].length) {
							var23.recolor(class86.field1212[var13], ItemContainer.field826[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < field4146[var13].length) {
							var23.recolor(class358.field4059[var13], field4146[var13][this.bodyColors[var13]]);
						}
					}

					var8 = var23.toModel(64, 850, -30, -50, -30);
					PlayerAppearance_cachedModels.put(var8, var5);
					this.field4145 = var5;
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljm;",
		garbageValue = "-157617356"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) {
			return AsyncHttpResponse.getNpcDefinition(this.npcTransformId).method4465((NpcOverrides)null);
		} else {
			boolean var1 = false;

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) {
				var3 = this.equipment[var2];
				if (this.method7807(var3)) {
					KitDefinition var9 = this.KitDefinition_get(var3);
					if (var9 != null && !var9.method4372()) {
						var1 = true;
					}
				}

				if (this.method7786(var3)) {
					PlayerCompositionColorTextureOverride var11 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var2];
					if (!this.method7787(var3).method4837(this.gender, var11)) {
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
					if (this.method7807(var5)) {
						KitDefinition var6 = this.KitDefinition_get(var5);
						var7 = null;
						if (var6 != null) {
							var7 = var6.getKitDefinitionModels();
						}

						if (var7 != null) {
							var8[var3++] = var7;
						}
					}

					if (this.method7786(var5)) {
						PlayerCompositionColorTextureOverride var10 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var4];
						var7 = this.method7787(var5).method4838(this.gender, var10);
						if (var7 != null) {
							var8[var3++] = var7;
						}
					}
				}

				ModelData var12 = new ModelData(var8, var3);

				for (var5 = 0; var5 < 5; ++var5) {
					if (this.bodyColors[var5] < ItemContainer.field826[var5].length) {
						var12.recolor(class86.field1212[var5], ItemContainer.field826[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < field4146[var5].length) {
						var12.recolor(class358.field4059[var5], field4146[var5][this.bodyColors[var5]]);
					}
				}

				return var12;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		long var1 = this.hash;
		if (this.npcTransformId != -1) {
			var1 = -65536L | (long)this.npcTransformId;
		}

		Integer var3 = (Integer)field4148.method10126(var1);
		if (var3 == null) {
			var3 = ++field4153 - 1;
			field4148.method10124(var1, var3);
			field4153 %= 65535;
		}

		return var3;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "80"
	)
	void method7794() {
		this.method7837(this.field4150, this.equipment, this.bodyColors, this.gender, this.npcTransformId);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1704793879"
	)
	public void method7780(int var1, int var2) {
		boolean var3 = var2 != this.gender;
		this.gender = var2;
		if (var3) {
			int var4;
			int var5;
			if (this.gender == var1) {
				for (var4 = 0; var4 < 7; ++var4) {
					var5 = class204.method4553(var4);
					if (this.equipment[var5] > 0 && this.equipment[var5] < 2048) {
						this.equipment[var5] = this.field4150[var5];
					}
				}
			} else {
				if (this.equipment[0] < 2048 || this.method7833()) {
					this.equipment[class222.field2533.field2536] = 1;
				}

				for (var4 = 0; var4 < 7; ++var4) {
					var5 = class204.method4553(var4);
					if (this.equipment[var5] > 0 && this.equipment[var5] < 2048) {
						int[] var6 = this.equipment;

						for (int var7 = 0; var7 < class408.KitDefinition_fileCount; ++var7) {
							KitDefinition var8 = class225.method5030(var7);
							if (var8 != null && !var8.nonSelectable && var8.method4362(var4, var2)) {
								var6[class204.method4553(var4)] = var7 + 256;
								break;
							}
						}
					}
				}
			}
		}

		this.method7794();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1439515718"
	)
	boolean method7833() {
		if (!this.method7786(this.equipment[0])) {
			return false;
		} else {
			ItemComposition var1 = this.method7787(this.equipment[0]);
			return var1.maleModel1 != class222.field2533.field2536 && var1.maleModel2 != class222.field2533.field2536;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1665628438"
	)
	public void method7814(int var1, int var2) {
		this.bodyColors[var1] = var2;
		this.method7794();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-840792555"
	)
	public void method7801(int var1) {
		ItemComposition var2 = class150.ItemDefinition_get(var1);
		this.equipment[var2.maleModel] = var1 + 2048;
		if (var2.maleModel1 != -1) {
			this.equipment[var2.maleModel1] = 0;
		}

		if (var2.maleModel2 != -1) {
			this.equipment[var2.maleModel2] = 0;
		}

		this.method7794();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "116"
	)
	boolean method7807(int var1) {
		return var1 >= 256 && var1 < 2048;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhy;",
		garbageValue = "69"
	)
	@Export("KitDefinition_get")
	KitDefinition KitDefinition_get(int var1) {
		return class225.method5030(var1 - 256);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	boolean method7786(int var1) {
		return var1 >= 2048;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Lis;",
		garbageValue = "2"
	)
	ItemComposition method7787(int var1) {
		return class150.ItemDefinition_get(var1 - 2048);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-214839257"
	)
	int method7788(int var1) {
		return var1 - 512 + 2048;
	}
}
