import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nc")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("PlayerAppearance_cachedModels")
	public static EvictingDualNodeHashTable PlayerAppearance_cachedModels;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	public static class477 field3877;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1789732427
	)
	public static int field3867;
	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "[Lwg;"
	)
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSprites;
	@ObfuscatedName("ab")
	int[] field3878;
	@ObfuscatedName("ay")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("au")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1019939159
	)
	public int field3869;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 2066588403
	)
	@Export("gender")
	public int gender;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1566179833
	)
	@Export("npcTransformId")
	int npcTransformId;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = 1182280877706819799L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = -1836131145657446343L
	)
	long field3873;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[Lgf;"
	)
	@Export("playerCompositionColorTextureOverrides")
	PlayerCompositionColorTextureOverride[] playerCompositionColorTextureOverrides;
	@ObfuscatedName("as")
	boolean field3875;

	static {
		PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);
		field3877 = new class477(16, class475.field5077);
		field3867 = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Lnc;)V"
	)
	PlayerComposition(PlayerComposition var1) {
		this.field3869 = -1;
		this.gender = 0;
		this.field3875 = false;
		if (var1 != null) {
			int[] var2 = Arrays.copyOf(var1.equipment, var1.equipment.length);
			int[] var3 = Arrays.copyOf(var1.field3878, var1.field3878.length);
			PlayerCompositionColorTextureOverride[] var4 = (PlayerCompositionColorTextureOverride[])(var1.playerCompositionColorTextureOverrides != null ? (PlayerCompositionColorTextureOverride[])Arrays.copyOf(var1.playerCompositionColorTextureOverrides, var1.playerCompositionColorTextureOverrides.length) : null);
			int[] var5 = Arrays.copyOf(var1.bodyColors, var1.bodyColors.length);
			this.method6946(var3, var2, var4, false, var5, var1.gender, var1.npcTransformId, var1.field3869);
		}
	}

	public PlayerComposition() {
		this.field3869 = -1;
		this.gender = 0;
		this.field3875 = false;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([I[I[Lgf;Z[IIIII)V",
		garbageValue = "1609943395"
	)
	public void method6946(int[] var1, int[] var2, PlayerCompositionColorTextureOverride[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
		this.playerCompositionColorTextureOverrides = var3;
		this.field3875 = var4;
		this.field3869 = var8;
		this.method6947(var1, var2, var5, var6, var7);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([I[I[IIII)V",
		garbageValue = "2113367265"
	)
	public void method6947(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		if (var1 == null) {
			var1 = this.method6972(var4);
		}

		if (var2 == null) {
			var2 = this.method6972(var4);
		}

		this.field3878 = var1;
		this.equipment = var2;
		this.bodyColors = var3;
		this.gender = var4;
		this.npcTransformId = var5;
		this.setHash();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "-484539537"
	)
	int[] method6972(int var1) {
		int[] var2 = new int[12];

		for (int var3 = 0; var3 < 7; ++var3) {
			SequenceDefinition.method4364(var1, var2, var3);
		}

		return var2;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-1200692789"
	)
	@Export("changeAppearance")
	public void changeAppearance(int var1, boolean var2) {
		int var3 = this.equipment[class197.method3991(var1)];
		if (var3 != 0) {
			var3 -= 256;

			KitDefinition var4;
			do {
				if (!var2) {
					--var3;
					if (var3 < 0) {
						var3 = KitDefinition.KitDefinition_fileCount - 1;
					}
				} else {
					++var3;
					if (var3 >= KitDefinition.KitDefinition_fileCount) {
						var3 = 0;
					}
				}

				var4 = class76.method2222(var3);
			} while(var4 == null || var4.nonSelectable || !var4.method3844(var1, this.gender));

			this.equipment[class197.method3991(var1)] = var3 + 256;
			this.setHash();
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "2075850814"
	)
	public void method6950(int var1, boolean var2) {
		int var3 = this.bodyColors[var1];
		boolean var4;
		if (!var2) {
			do {
				--var3;
				if (var3 < 0) {
					var3 = class140.field1665[var1].length - 1;
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
				if (var3 >= class140.field1665[var1].length) {
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "2"
	)
	public void method6951(int var1) {
		if (this.gender != var1) {
			this.method6947((int[])null, (int[])null, this.bodyColors, var1, -1);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lvy;S)V",
		garbageValue = "-6450"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.gender);

		int var2;
		for (var2 = 0; var2 < 7; ++var2) {
			int var3 = this.equipment[class197.method3991(var2)];
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("setHash")
	void setHash() {
		long var1 = this.hash;
		long[] var3 = Buffer.field5572;
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
		if (0L != var1 && this.hash != var1 || this.field3875) {
			PlayerAppearance_cachedModels.remove(var1);
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Liw;ILiw;IB)Ljf;",
		garbageValue = "25"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) {
			return class91.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4, (NpcOverrides)null);
		} else {
			long var5 = this.hash;
			int[] var7 = this.equipment;
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) {
				var7 = new int[12];
				System.arraycopy(this.equipment, 0, var7, 0, var7.length);
				if (var1.shield >= 0) {
					var5 ^= (long)(var1.shield - this.equipment[class213.field2381.field2390]) << 40;
					var7[class213.field2381.field2390] = this.method6966(var1.shield);
				}

				if (var1.weapon >= 0) {
					var5 ^= (long)(var1.weapon - this.equipment[class213.field2379.field2390]) << 48;
					var7[class213.field2379.field2390] = this.method6966(var1.weapon);
				}
			}

			Model var8 = (Model)PlayerAppearance_cachedModels.get(var5);
			if (var8 == null) {
				boolean var9 = false;

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) {
					var11 = var7[var10];
					if (this.method6962(var11)) {
						KitDefinition var18 = this.KitDefinition_get(var11);
						if (var18 != null && !var18.ready()) {
							var9 = true;
						}
					}

					if (this.method6964(var11)) {
						PlayerCompositionColorTextureOverride var22 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var10];
						if (!this.method6959(var11).method4254(this.gender, var22)) {
							var9 = true;
						}
					}
				}

				if (var9) {
					if (this.field3873 != -1L) {
						var8 = (Model)PlayerAppearance_cachedModels.get(this.field3873);
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
						if (this.method6962(var13)) {
							KitDefinition var14 = this.KitDefinition_get(var13);
							ModelData var15 = null;
							if (var14 != null) {
								var15 = var14.getModelData();
							}

							if (var15 != null) {
								var17[var11++] = var15;
							}
						}

						if (this.method6964(var13)) {
							ItemComposition var20 = this.method6959(var13);
							PlayerCompositionColorTextureOverride var21 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var12];
							ModelData var16 = var20.method4268(this.gender, var21);
							if (var16 != null) {
								var17[var11++] = var16;
							}
						}
					}

					ModelData var23 = new ModelData(var17, var11);

					for (var13 = 0; var13 < 5; ++var13) {
						if (this.bodyColors[var13] < class140.field1665[var13].length) {
							var23.recolor(NPC.field1378[var13], class140.field1665[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < MidiPcmStream.field3729[var13].length) {
							var23.recolor(GrandExchangeOfferOwnWorldComparator.field479[var13], MidiPcmStream.field3729[var13][this.bodyColors[var13]]);
						}
					}

					var8 = var23.toModel(64, 850, -30, -50, -30);
					PlayerAppearance_cachedModels.put(var8, var5);
					this.field3873 = var5;
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Ljk;",
		garbageValue = "82"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) {
			return class91.getNpcDefinition(this.npcTransformId).method3926((NpcOverrides)null);
		} else {
			boolean var1 = false;

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) {
				var3 = this.equipment[var2];
				if (this.method6962(var3)) {
					KitDefinition var9 = this.KitDefinition_get(var3);
					if (var9 != null && !var9.method3836()) {
						var1 = true;
					}
				}

				if (this.method6964(var3)) {
					PlayerCompositionColorTextureOverride var11 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var2];
					if (!this.method6959(var3).method4220(this.gender, var11)) {
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
					if (this.method6962(var5)) {
						KitDefinition var6 = this.KitDefinition_get(var5);
						var7 = null;
						if (var6 != null) {
							var7 = var6.getKitDefinitionModels();
						}

						if (var7 != null) {
							var8[var3++] = var7;
						}
					}

					if (this.method6964(var5)) {
						PlayerCompositionColorTextureOverride var10 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var4];
						var7 = this.method6959(var5).method4257(this.gender, var10);
						if (var7 != null) {
							var8[var3++] = var7;
						}
					}
				}

				ModelData var12 = new ModelData(var8, var3);

				for (var5 = 0; var5 < 5; ++var5) {
					if (this.bodyColors[var5] < class140.field1665[var5].length) {
						var12.recolor(NPC.field1378[var5], class140.field1665[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < MidiPcmStream.field3729[var5].length) {
						var12.recolor(GrandExchangeOfferOwnWorldComparator.field479[var5], MidiPcmStream.field3729[var5][this.bodyColors[var5]]);
					}
				}

				return var12;
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1626588124"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		long var1 = this.hash;
		if (this.npcTransformId != -1) {
			var1 = -65536L | (long)this.npcTransformId;
		}

		Integer var3 = (Integer)field3877.method9042(var1);
		if (var3 == null) {
			var3 = ++field3867 - 1;
			field3877.method9038(var1, var3);
			field3867 %= 65535;
		}

		return var3;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "9"
	)
	void method6954() {
		this.method6947(this.field3878, this.equipment, this.bodyColors, this.gender, this.npcTransformId);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1820696693"
	)
	public void method6974(int var1, int var2) {
		boolean var3 = var2 != this.gender;
		this.gender = var2;
		if (var3) {
			int var4;
			int var5;
			if (this.gender == var1) {
				for (var4 = 0; var4 < 7; ++var4) {
					var5 = class197.method3991(var4);
					if (this.equipment[var5] > 0 && this.equipment[var5] < 2048) {
						this.equipment[var5] = this.field3878[var5];
					}
				}
			} else {
				if (this.equipment[0] < 2048 || this.method6961()) {
					this.equipment[class213.field2389.field2390] = 1;
				}

				for (var4 = 0; var4 < 7; ++var4) {
					var5 = class197.method3991(var4);
					if (this.equipment[var5] > 0 && this.equipment[var5] < 2048) {
						SequenceDefinition.method4364(var2, this.equipment, var4);
					}
				}
			}
		}

		this.method6954();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	boolean method6961() {
		if (!this.method6964(this.equipment[0])) {
			return false;
		} else {
			ItemComposition var1 = this.method6959(this.equipment[0]);
			return var1.maleModel1 != class213.field2389.field2390 && var1.maleModel2 != class213.field2389.field2390;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1914468987"
	)
	public void method6963(int var1, int var2) {
		this.bodyColors[var1] = var2;
		this.method6954();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1073367365"
	)
	public void method6957(int var1) {
		ItemComposition var2 = class138.ItemDefinition_get(var1);
		this.equipment[var2.maleModel] = var1 + 2048;
		if (var2.maleModel1 != -1) {
			this.equipment[var2.maleModel1] = 0;
		}

		if (var2.maleModel2 != -1) {
			this.equipment[var2.maleModel2] = 0;
		}

		this.method6954();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1083071673"
	)
	boolean method6962(int var1) {
		return var1 >= 256 && var1 < 2048;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Lha;",
		garbageValue = "-394225388"
	)
	@Export("KitDefinition_get")
	KitDefinition KitDefinition_get(int var1) {
		return class76.method2222(var1 - 256);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "293032463"
	)
	boolean method6964(int var1) {
		return var1 >= 2048;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)Lin;",
		garbageValue = "-41"
	)
	ItemComposition method6959(int var1) {
		return class138.ItemDefinition_get(var1 - 2048);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-556289106"
	)
	int method6966(int var1) {
		return var1 - 512 + 2048;
	}
}
