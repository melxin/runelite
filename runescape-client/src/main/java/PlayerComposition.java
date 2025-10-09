import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("od")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("ag")
	public static short[] field4098;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("PlayerAppearance_cachedModels")
	static EvictingDualNodeHashTable PlayerAppearance_cachedModels;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lsf;"
	)
	static class488 field4100;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -822469863
	)
	static int field4101;
	@ObfuscatedName("oq")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("vi")
	@ObfuscatedGetter(
		intValue = 716667841
	)
	static int field4113;
	@ObfuscatedName("aa")
	int[] field4096;
	@ObfuscatedName("ap")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("ad")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1209594437
	)
	public int field4105;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1632769861
	)
	@Export("gender")
	public int gender;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1549369615
	)
	@Export("npcTransformId")
	int npcTransformId;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = 4347481156194242039L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		longValue = -4359579841229879261L
	)
	long field4109;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Lgv;"
	)
	@Export("playerCompositionColorTextureOverrides")
	PlayerCompositionColorTextureOverride[] playerCompositionColorTextureOverrides;
	@ObfuscatedName("ao")
	boolean field4111;

	static {
		PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);
		field4100 = new class488(16, class486.field5404);
		field4101 = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Lod;)V"
	)
	PlayerComposition(PlayerComposition var1) {
		this.field4105 = -1;
		this.gender = 0;
		this.field4111 = false;
		if (var1 != null) {
			int[] var2 = Arrays.copyOf(var1.equipment, var1.equipment.length);
			int[] var3 = Arrays.copyOf(var1.field4096, var1.field4096.length);
			PlayerCompositionColorTextureOverride[] var4 = (PlayerCompositionColorTextureOverride[])(var1.playerCompositionColorTextureOverrides != null ? (PlayerCompositionColorTextureOverride[])Arrays.copyOf(var1.playerCompositionColorTextureOverrides, var1.playerCompositionColorTextureOverrides.length) : null);
			int[] var5 = Arrays.copyOf(var1.bodyColors, var1.bodyColors.length);
			this.method7536(var3, var2, var4, false, var5, var1.gender, var1.npcTransformId, var1.field4105);
		}
	}

	public PlayerComposition() {
		this.field4105 = -1;
		this.gender = 0;
		this.field4111 = false;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([I[I[Lgv;Z[IIIIB)V",
		garbageValue = "3"
	)
	public void method7536(int[] var1, int[] var2, PlayerCompositionColorTextureOverride[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
		this.playerCompositionColorTextureOverrides = var3;
		this.field4111 = var4;
		this.field4105 = var8;
		this.method7538(var1, var2, var5, var6, var7);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([I[I[IIIB)V",
		garbageValue = "110"
	)
	public void method7538(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		if (var1 == null) {
			var1 = this.method7600(var4);
		}

		if (var2 == null) {
			var2 = this.method7600(var4);
		}

		this.field4096 = var1;
		this.equipment = var2;
		this.bodyColors = var3;
		this.gender = var4;
		this.npcTransformId = var5;
		this.setHash();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)[I",
		garbageValue = "1"
	)
	int[] method7600(int var1) {
		int[] var2 = new int[12];

		for (int var3 = 0; var3 < 7; ++var3) {
			for (int var4 = 0; var4 < KitDefinition.KitDefinition_fileCount; ++var4) {
				KitDefinition var6 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var4);
				KitDefinition var5;
				if (var6 != null) {
					var5 = var6;
				} else if (class335.KitDefinition_archive == null) {
					var5 = null;
				} else {
					byte[] var7 = class335.KitDefinition_archive.takeFile(3, var4);
					var6 = new KitDefinition();
					if (var7 != null) {
						var6.decode(new Buffer(var7));
					}

					KitDefinition.KitDefinition_cached.put(var6, (long)var4);
					var5 = var6;
				}

				if (var5 != null && !var5.nonSelectable && var5.method4266(var3, var1)) {
					var2[class199.method4469(var3)] = var4 + 256;
					break;
				}
			}
		}

		return var2;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1649327474"
	)
	@Export("changeAppearance")
	public void changeAppearance(int var1, boolean var2) {
		int var3 = this.equipment[class199.method4469(var1)];
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

				KitDefinition var5 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var3);
				if (var5 != null) {
					var4 = var5;
				} else if (class335.KitDefinition_archive == null) {
					var4 = null;
				} else {
					byte[] var6 = class335.KitDefinition_archive.takeFile(3, var3);
					var5 = new KitDefinition();
					if (var6 != null) {
						var5.decode(new Buffer(var6));
					}

					KitDefinition.KitDefinition_cached.put(var5, (long)var3);
					var4 = var5;
				}
			} while(var4 == null || var4.nonSelectable || !var4.method4266(var1, this.gender));

			this.equipment[class199.method4469(var1)] = var3 + 256;
			this.setHash();
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1950577867"
	)
	public void method7541(int var1, boolean var2) {
		int var3 = this.bodyColors[var1];
		boolean var4;
		if (!var2) {
			do {
				--var3;
				if (var3 < 0) {
					var3 = class323.field3544[var1].length - 1;
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
				if (var3 >= class323.field3544[var1].length) {
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "8"
	)
	public void method7542(int var1) {
		if (this.gender != var1) {
			this.method7538((int[])null, (int[])null, this.bodyColors, var1, -1);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "-586498027"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.gender);

		int var2;
		for (var2 = 0; var2 < 7; ++var2) {
			int var3 = this.equipment[class199.method4469(var2)];
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-17"
	)
	@Export("setHash")
	void setHash() {
		long var1 = this.hash;
		long[] var3 = Buffer.field5980;
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
		if (0L != var1 && this.hash != var1 || this.field4111) {
			PlayerAppearance_cachedModels.remove(var1);
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lit;ILit;II)Ljd;",
		garbageValue = "2080353402"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) {
			return class81.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4, (NpcOverrides)null);
		} else {
			long var5 = this.hash;
			int[] var7 = this.equipment;
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) {
				var7 = new int[12];
				System.arraycopy(this.equipment, 0, var7, 0, var7.length);
				if (var1.shield >= 0) {
					var5 ^= (long)(var1.shield - this.equipment[class215.field2500.field2504]) << 40;
					var7[class215.field2500.field2504] = this.method7557(var1.shield);
				}

				if (var1.weapon >= 0) {
					var5 ^= (long)(var1.weapon - this.equipment[class215.field2498.field2504]) << 48;
					var7[class215.field2498.field2504] = this.method7557(var1.weapon);
				}
			}

			Model var8 = (Model)PlayerAppearance_cachedModels.get(var5);
			if (var8 == null) {
				boolean var9 = false;

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) {
					var11 = var7[var10];
					if (this.method7605(var11)) {
						KitDefinition var18 = this.KitDefinition_get(var11);
						if (var18 != null && !var18.ready()) {
							var9 = true;
						}
					}

					if (this.method7555(var11)) {
						PlayerCompositionColorTextureOverride var22 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var10];
						if (!this.method7556(var11).method4733(this.gender, var22)) {
							var9 = true;
						}
					}
				}

				if (var9) {
					if (this.field4109 != -1L) {
						var8 = (Model)PlayerAppearance_cachedModels.get(this.field4109);
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
						if (this.method7605(var13)) {
							KitDefinition var14 = this.KitDefinition_get(var13);
							ModelData var15 = null;
							if (var14 != null) {
								var15 = var14.getModelData();
							}

							if (var15 != null) {
								var17[var11++] = var15;
							}
						}

						if (this.method7555(var13)) {
							ItemComposition var20 = this.method7556(var13);
							PlayerCompositionColorTextureOverride var21 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var12];
							ModelData var16 = var20.method4734(this.gender, var21);
							if (var16 != null) {
								var17[var11++] = var16;
							}
						}
					}

					ModelData var23 = new ModelData(var17, var11);

					for (var13 = 0; var13 < 5; ++var13) {
						if (this.bodyColors[var13] < class323.field3544[var13].length) {
							var23.recolor(field4098[var13], class323.field3544[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < class360.field4079[var13].length) {
							var23.recolor(class151.field1771[var13], class360.field4079[var13][this.bodyColors[var13]]);
						}
					}

					var8 = var23.toModel(64, 850, -30, -50, -30);
					PlayerAppearance_cachedModels.put(var8, var5);
					this.field4109 = var5;
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
		descriptor = "(I)Lib;",
		garbageValue = "-658401672"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) {
			return class81.getNpcDefinition(this.npcTransformId).method4385((NpcOverrides)null);
		} else {
			boolean var1 = false;

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) {
				var3 = this.equipment[var2];
				if (this.method7605(var3)) {
					KitDefinition var9 = this.KitDefinition_get(var3);
					if (var9 != null && !var9.method4273()) {
						var1 = true;
					}
				}

				if (this.method7555(var3)) {
					PlayerCompositionColorTextureOverride var11 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var2];
					if (!this.method7556(var3).method4722(this.gender, var11)) {
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
					if (this.method7605(var5)) {
						KitDefinition var6 = this.KitDefinition_get(var5);
						var7 = null;
						if (var6 != null) {
							var7 = var6.getKitDefinitionModels();
						}

						if (var7 != null) {
							var8[var3++] = var7;
						}
					}

					if (this.method7555(var5)) {
						PlayerCompositionColorTextureOverride var10 = this.playerCompositionColorTextureOverrides == null ? null : this.playerCompositionColorTextureOverrides[var4];
						var7 = this.method7556(var5).method4767(this.gender, var10);
						if (var7 != null) {
							var8[var3++] = var7;
						}
					}
				}

				ModelData var12 = new ModelData(var8, var3);

				for (var5 = 0; var5 < 5; ++var5) {
					if (this.bodyColors[var5] < class323.field3544[var5].length) {
						var12.recolor(field4098[var5], class323.field3544[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < class360.field4079[var5].length) {
						var12.recolor(class151.field1771[var5], class360.field4079[var5][this.bodyColors[var5]]);
					}
				}

				return var12;
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-76613485"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		long var1 = this.hash;
		if (this.npcTransformId != -1) {
			var1 = -65536L | (long)this.npcTransformId;
		}

		Integer var3 = (Integer)field4100.method9911(var1);
		if (var3 == null) {
			var3 = ++field4101 - 1;
			field4100.method9921(var1, var3);
			field4101 %= 65535;
		}

		return var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-79"
	)
	void method7548() {
		this.method7538(this.field4096, this.equipment, this.bodyColors, this.gender, this.npcTransformId);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "30"
	)
	public void method7549(int var1, int var2) {
		boolean var3 = var2 != this.gender;
		this.gender = var2;
		if (var3) {
			int var4;
			int var5;
			if (this.gender == var1) {
				for (var4 = 0; var4 < 7; ++var4) {
					var5 = class199.method4469(var4);
					if (this.equipment[var5] > 0 && this.equipment[var5] < 2048) {
						this.equipment[var5] = this.field4096[var5];
					}
				}
			} else {
				if (this.equipment[0] < 2048 || this.method7550()) {
					this.equipment[class215.field2506.field2504] = 1;
				}

				for (var4 = 0; var4 < 7; ++var4) {
					var5 = class199.method4469(var4);
					if (this.equipment[var5] > 0 && this.equipment[var5] < 2048) {
						int[] var6 = this.equipment;

						for (int var7 = 0; var7 < KitDefinition.KitDefinition_fileCount; ++var7) {
							KitDefinition var9 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var7);
							KitDefinition var8;
							if (var9 != null) {
								var8 = var9;
							} else if (class335.KitDefinition_archive == null) {
								var8 = null;
							} else {
								byte[] var10 = class335.KitDefinition_archive.takeFile(3, var7);
								var9 = new KitDefinition();
								if (var10 != null) {
									var9.decode(new Buffer(var10));
								}

								KitDefinition.KitDefinition_cached.put(var9, (long)var7);
								var8 = var9;
							}

							if (var8 != null && !var8.nonSelectable && var8.method4266(var4, var2)) {
								var6[class199.method4469(var4)] = var7 + 256;
								break;
							}
						}
					}
				}
			}
		}

		this.method7548();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1333699265"
	)
	boolean method7550() {
		if (!this.method7555(this.equipment[0])) {
			return false;
		} else {
			ItemComposition var1 = this.method7556(this.equipment[0]);
			return var1.maleModel1 != class215.field2506.field2504 && var1.maleModel2 != class215.field2506.field2504;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1544422180"
	)
	public void method7551(int var1, int var2) {
		this.bodyColors[var1] = var2;
		this.method7548();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1663951106"
	)
	public void method7552(int var1) {
		ItemComposition var2 = WorldMapIcon_1.ItemDefinition_get(var1);
		this.equipment[var2.maleModel] = var1 + 2048;
		if (var2.maleModel1 != -1) {
			this.equipment[var2.maleModel1] = 0;
		}

		if (var2.maleModel2 != -1) {
			this.equipment[var2.maleModel2] = 0;
		}

		this.method7548();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "881320911"
	)
	boolean method7605(int var1) {
		return var1 >= 256 && var1 < 2048;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Lhl;",
		garbageValue = "-204216403"
	)
	@Export("KitDefinition_get")
	KitDefinition KitDefinition_get(int var1) {
		int var3 = var1 - 256;
		KitDefinition var4 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var3);
		KitDefinition var2;
		if (var4 != null) {
			var2 = var4;
		} else if (class335.KitDefinition_archive == null) {
			var2 = null;
		} else {
			byte[] var5 = class335.KitDefinition_archive.takeFile(3, var3);
			var4 = new KitDefinition();
			if (var5 != null) {
				var4.decode(new Buffer(var5));
			}

			KitDefinition.KitDefinition_cached.put(var4, (long)var3);
			var2 = var4;
		}

		return var2;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1848930973"
	)
	boolean method7555(int var1) {
		return var1 >= 2048;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Lig;",
		garbageValue = "1"
	)
	ItemComposition method7556(int var1) {
		return WorldMapIcon_1.ItemDefinition_get(var1 - 2048);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1363070532"
	)
	int method7557(int var1) {
		return var1 - 512 + 2048;
	}
}
