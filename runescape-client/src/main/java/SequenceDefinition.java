import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kb")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("ay")
	static boolean field2929;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	@Export("SequenceDefinition_archive")
	static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	@Export("SequenceDefinition_animationsArchive")
	static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("SequenceDefinition_cachedModel")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 60028421
	)
	@Export("SequenceDefinition_cachedModelId")
	public int SequenceDefinition_cachedModelId;
	@ObfuscatedName("as")
	public Map field2925;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -678949869
	)
	int field2933;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1744682479
	)
	int field2927;
	@ObfuscatedName("aa")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("ak")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("al")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1098686809
	)
	public int field2931;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1359646447
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("aw")
	int[] field2939;
	@ObfuscatedName("ai")
	boolean[] field2934;
	@ObfuscatedName("ar")
	public boolean field2935;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1521215721
	)
	public int field2930;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 200620891
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1447383493
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1573723465
	)
	public int field2936;
	@ObfuscatedName("bu")
	public boolean field2940;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 1885296837
	)
	public int field2941;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1458237697
	)
	public int field2942;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 94594965
	)
	@Export("restartMode")
	public int restartMode;

	static {
		field2929 = false;
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100);
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1;
		this.field2933 = 0;
		this.field2927 = 0;
		this.frameCount = -1;
		this.field2935 = false;
		this.field2930 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field2936 = 99;
		this.field2940 = false;
		this.field2941 = -1;
		this.field2942 = -1;
		this.restartMode = 2;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-2092056201"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvy;II)V",
		garbageValue = "-807712818"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.readUnsignedShort();
			this.frameLengths = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameLengths[var4] = var1.readUnsignedShort();
			}

			this.frameIds = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 2) {
			this.frameCount = var1.readUnsignedShort();
		} else if (var2 == 3) {
			var3 = var1.readUnsignedByte();
			this.field2939 = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2939[var4] = var1.readUnsignedByte();
			}

			this.field2939[var3] = 9999999;
		} else if (var2 == 4) {
			this.field2935 = true;
		} else if (var2 == 5) {
			this.field2930 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field2936 = var1.readUnsignedByte();
			this.field2940 = true;
		} else if (var2 == 9) {
			this.field2941 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field2942 = var1.readUnsignedByte();
		} else if (var2 == 11) {
			this.restartMode = var1.readUnsignedByte();
		} else if (var2 == 12) {
			var3 = var1.readUnsignedByte();
			this.chatFrameIds = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.chatFrameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) {
				this.chatFrameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 13) {
			this.SequenceDefinition_cachedModelId = var1.readInt();
		} else if (var2 == 14) {
			var3 = var1.readUnsignedShort();
			if (this.field2925 == null) {
				this.field2925 = new HashMap();
			}

			for (var4 = 0; var4 < var3; ++var4) {
				int var5;
				class261 var6;
				label152: {
					var5 = var1.readUnsignedShort();
					if (var1 != null) {
						boolean var7 = false;
						boolean var8 = true;
						boolean var9 = false;
						boolean var10 = false;
						boolean var11 = false;
						int var13 = var1.readUnsignedShort();
						int var14 = var1.readUnsignedByte();
						int var15 = var1.readUnsignedByte();
						int var16 = var1.readUnsignedByte();
						int var17 = var1.readUnsignedByte();
						if (var13 >= 1 && var15 >= 1 && var16 >= 0 && var17 >= 0) {
							var6 = new class261(var13, var14, var15, var16, var17);
							break label152;
						}
					}

					var6 = null;
				}

				if (var6 != null) {
					if (!this.field2925.containsKey(var5)) {
						this.field2925.put(var5, new ArrayList());
					}

					((ArrayList)this.field2925.get(var5)).add(var6);
				}
			}
		} else if (var2 == 15) {
			this.field2933 = var1.readUnsignedShort();
			this.field2927 = var1.readUnsignedShort();
		} else if (var2 == 17) {
			this.field2934 = new boolean[256];

			for (var3 = 0; var3 < this.field2934.length; ++var3) {
				this.field2934[var3] = false;
			}

			var3 = var1.readUnsignedByte();

			for (var4 = 0; var4 < var3; ++var4) {
				this.field2934[var1.readUnsignedByte()] = true;
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "69648"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2941 == -1) {
			if (this.field2939 == null && this.field2934 == null) {
				this.field2941 = 0;
			} else {
				this.field2941 = 2;
			}
		}

		if (this.field2942 == -1) {
			if (this.field2939 == null && this.field2934 == null) {
				this.field2942 = 0;
			} else {
				this.field2942 = 2;
			}
		}

		if (this.frameLengths != null) {
			this.field2931 = 0;

			for (int var1 = 0; var1 < this.frameLengths.length; ++var1) {
				this.field2931 += this.frameLengths[var1];
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lhv;II)Lhv;",
		garbageValue = "638240262"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var8 = ModelData0.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var8 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var7 = var1.toSharedSequenceModel(!var8.hasAlphaTransform(var2));
				var7.animate(var8, var2);
				return var7;
			}
		} else {
			int var4 = this.SequenceDefinition_cachedModelId;
			class144 var3;
			if (class166.method3808(var4) != 0) {
				var3 = null;
			} else {
				var3 = class137.method3480(var4);
			}

			if (var3 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var6 = var1.toSharedSequenceModel(!var3.method3535());
				var6.method4548(var3, var2);
				return var6;
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lhv;III)Lhv;",
		garbageValue = "-2023406835"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var9 = ModelData0.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var9 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var8 = var1.toSharedSequenceModel(!var9.hasAlphaTransform(var2));
				var3 &= 3;
				if (var3 == 1) {
					var8.rotateY270Ccw();
				} else if (var3 == 2) {
					var8.rotateY180();
				} else if (var3 == 3) {
					var8.rotateY90Ccw();
				}

				var8.animate(var9, var2);
				if (var3 == 1) {
					var8.rotateY90Ccw();
				} else if (var3 == 2) {
					var8.rotateY180();
				} else if (var3 == 3) {
					var8.rotateY270Ccw();
				}

				return var8;
			}
		} else {
			int var5 = this.SequenceDefinition_cachedModelId;
			class144 var4;
			if (class166.method3808(var5) != 0) {
				var4 = null;
			} else {
				var4 = class137.method3480(var5);
			}

			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Model var7 = var1.toSharedSequenceModel(!var4.method3535());
				var3 &= 3;
				if (var3 == 1) {
					var7.rotateY270Ccw();
				} else if (var3 == 2) {
					var7.rotateY180();
				} else if (var3 == 3) {
					var7.rotateY90Ccw();
				}

				var7.method4548(var4, var2);
				if (var3 == 1) {
					var7.rotateY90Ccw();
				} else if (var3 == 2) {
					var7.rotateY180();
				} else if (var3 == 3) {
					var7.rotateY270Ccw();
				}

				return var7;
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lhv;II)Lhv;",
		garbageValue = "1769373549"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			var2 = this.frameIds[var2];
			Frames var8 = ModelData0.getFrames(var2 >> 16);
			var2 &= 65535;
			if (var8 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				Model var7 = var1.toSharedSpotAnimationModel(!var8.hasAlphaTransform(var2));
				var7.animate(var8, var2);
				return var7;
			}
		} else {
			int var4 = this.SequenceDefinition_cachedModelId;
			class144 var3;
			if (class166.method3808(var4) != 0) {
				var3 = null;
			} else {
				var3 = class137.method3480(var4);
			}

			if (var3 == null) {
				return var1.toSharedSpotAnimationModel(true);
			} else {
				Model var6 = var1.toSharedSpotAnimationModel(!var3.method3535());
				var6.method4548(var3, var2);
				return var6;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lhv;ILkb;IB)Lhv;",
		garbageValue = "0"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2929 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) {
			return this.method5670(var1, var2, var3, var4);
		} else {
			Model var5 = var1.toSharedSequenceModel(false);
			boolean var6 = false;
			Frames var7 = null;
			Skeleton var8 = null;
			class144 var9;
			if (this.isCachedModelIdSet()) {
				var9 = this.method5705();
				if (var9 == null) {
					return var5;
				}

				if (var3.isCachedModelIdSet() && this.field2934 == null) {
					var5.method4548(var9, var2);
					return var5;
				}

				var8 = var9.field1641;
				var5.method4552(var8, var9, var2, this.field2934, false, !var3.isCachedModelIdSet());
			} else {
				var2 = this.frameIds[var2];
				var7 = ModelData0.getFrames(var2 >> 16);
				var2 &= 65535;
				if (var7 == null) {
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field2939 == null || var4 == -1)) {
					var5.animate(var7, var2);
					return var5;
				}

				if (this.field2939 == null || var4 == -1) {
					var5.animate(var7, var2);
					return var5;
				}

				var6 = var3.isCachedModelIdSet();
				if (!var6) {
					var5.method4598(var7, var2, this.field2939, false);
				}
			}

			if (var3.isCachedModelIdSet()) {
				var9 = var3.method5705();
				if (var9 == null) {
					return var5;
				}

				if (var8 == null) {
					var8 = var9.field1641;
				}

				var5.method4552(var8, var9, var4, this.field2934, true, true);
			} else {
				var4 = var3.frameIds[var4];
				Frames var10 = ModelData0.getFrames(var4 >> 16);
				var4 &= 65535;
				if (var10 == null) {
					return this.transformActorModel(var1, var2);
				}

				var5.method4598(var10, var4, this.field2939, true);
			}

			if (var6 && var7 != null) {
				var5.method4598(var7, var2, this.field2939, false);
			}

			var5.resetBounds();
			return var5;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lhv;ILkb;II)Lhv;",
		garbageValue = "-912603730"
	)
	Model method5670(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = ModelData0.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = ModelData0.getFrames(var4 >> 16);
			var4 &= 65535;
			Model var7;
			if (var6 == null) {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var7.animate(var5, var2);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
				var7.animate2(var5, var2, var6, var4, this.field2939);
				return var7;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lhv;II)Lhv;",
		garbageValue = "-1011483730"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) {
			int var3 = this.frameIds[var2];
			Frames var4 = ModelData0.getFrames(var3 >> 16);
			var3 &= 65535;
			if (var4 == null) {
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null;
				int var6 = 0;
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
					var6 = this.chatFrameIds[var2];
					var5 = ModelData0.getFrames(var6 >> 16);
					var6 &= 65535;
				}

				Model var7;
				if (var5 != null && var6 != 65535) {
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3) & !var5.hasAlphaTransform(var6));
					var7.animate(var4, var3);
					var7.animate(var5, var6);
					return var7;
				} else {
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3));
					var7.animate(var4, var3);
					return var7;
				}
			}
		} else {
			return this.transformActorModel(var1, var2);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1695266658"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2097289927"
	)
	@Export("getMayaAnimFrame")
	public int getMayaAnimFrame() {
		return this.field2927 - this.field2933;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lfl;",
		garbageValue = "-165631079"
	)
	class144 method5705() {
		if (this.isCachedModelIdSet()) {
			int var2 = this.SequenceDefinition_cachedModelId;
			class144 var1;
			if (class166.method3808(var2) != 0) {
				var1 = null;
			} else {
				var1 = class137.method3480(var2);
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "(Lna;II)I",
		garbageValue = "-1403304937"
	)
	static final int method5725(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) {
			try {
				int[] var2 = var0.cs1Instructions[var1];
				int var3 = 0;
				int var4 = 0;
				byte var5 = 0;

				while (true) {
					int var6 = var2[var4++];
					int var7 = 0;
					byte var8 = 0;
					if (var6 == 0) {
						return var3;
					}

					if (var6 == 1) {
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) {
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) {
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = ClanChannel.widgetDefinition.method7031(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!FaceNormal.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) {
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) {
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) {
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) {
						var7 = ModeWhere.localPlayer.combatLevel;
					}

					if (var6 == 9) {
						for (var9 = 0; var9 < 25; ++var9) {
							if (Skills.Skills_enabled[var9]) {
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = ClanChannel.widgetDefinition.method7031(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!FaceNormal.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 = 999999999;
									break;
								}
							}
						}
					}

					if (var6 == 11) {
						var7 = Client.runEnergy;
					}

					if (var6 == 12) {
						var7 = Client.weight;
					}

					if (var6 == 13) {
						var9 = Varps.Varps_main[var2[var4++]];
						int var13 = var2[var4++];
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0;
					}

					if (var6 == 14) {
						var9 = var2[var4++];
						var7 = class77.getVarbit(var9);
					}

					if (var6 == 15) {
						var8 = 1;
					}

					if (var6 == 16) {
						var8 = 2;
					}

					if (var6 == 17) {
						var8 = 3;
					}

					if (var6 == 18) {
						var7 = (ModeWhere.localPlayer.x >> 7) + GameEngine.topLevelWorldView.baseX;
					}

					if (var6 == 19) {
						var7 = (ModeWhere.localPlayer.y >> 7) + GameEngine.topLevelWorldView.baseY;
					}

					if (var6 == 20) {
						var7 = var2[var4++];
					}

					if (var8 == 0) {
						if (var5 == 0) {
							var3 += var7;
						}

						if (var5 == 1) {
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) {
							var3 /= var7;
						}

						if (var5 == 3) {
							var3 *= var7;
						}

						var5 = 0;
					} else {
						var5 = var8;
					}
				}
			} catch (Exception var14) {
				return -1;
			}
		} else {
			return -2;
		}
	}
}
