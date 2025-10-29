import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cq")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lrt;"
	)
	static final NodeDeque field977;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	static final class343 field978;
	@ObfuscatedName("lp")
	@Export("gameSessionServiceBaseUrl")
	static String gameSessionServiceBaseUrl;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -686711829
	)
	@Export("plane")
	final int plane;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1915964479
	)
	@Export("x")
	final int x;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1252609781
	)
	@Export("y")
	final int y;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1899711959
	)
	@Export("maxX")
	final int maxX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 127429897
	)
	@Export("maxY")
	final int maxY;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1835506585
	)
	final int field966;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 30889521
	)
	int field960;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1922168877
	)
	int field972;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("obj")
	final ObjectComposition obj;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1203626699
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("ad")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -315377807
	)
	int field956;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 282059221
	)
	int field968;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 150622669
	)
	int field957;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	final class402 field970;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	class343 field971;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	class343 field969;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -297601409
	)
	int field975;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	class343 field974;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -590775437
	)
	int field961;
	@ObfuscatedName("am")
	boolean field976;

	static {
		field977 = new NodeDeque();
		field978 = class343.field3891;
	}

	@ObfuscatedSignature(
		descriptor = "(IIIIILiv;)V"
	)
	ObjectSound(int var1, int var2, int var3, int var4, int var5, ObjectComposition var6) {
		this.field976 = false;
		this.plane = var1;
		this.x = var2;
		this.y = Coord.method7702(var3);
		this.maxX = Coord.method7702(var4);
		int var7 = var6.sizeX;
		int var8 = var6.sizeY;
		if (var5 == 1 || var5 == 3) {
			var7 = var6.sizeY;
			var8 = var6.sizeX;
		}

		this.maxY = Coord.method7702(var3 + var7);
		this.field966 = Coord.method7702(var8 + var4);
		this.soundEffectId = var6.ambientSoundId;
		this.field960 = Coord.method7702(var6.int7);
		this.field972 = Math.max(Coord.method7702(var6.int8 - 1), 0);
		this.field956 = var6.int5;
		this.field968 = var6.int6;
		this.soundEffectIds = var6.soundEffectIds;
		if (var6.transforms != null) {
			this.obj = var6;
			this.set();
		} else {
			this.obj = null;
		}

		if (this.soundEffectIds != null) {
			this.field957 = class190.method4416(this.field956, this.field968);
		}

		this.field971 = var6.field2394;
		this.field974 = var6.field2365;
		this.field961 = var6.field2395;
		this.field969 = var6.field2342;
		this.field975 = var6.field2396;
		this.field970 = var6.field2334;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-824061258"
	)
	void method2313() {
		this.method2293(0, this.field975, this.field969);
		this.method2294(0, this.field975, this.field969);
		this.method2295();
		this.method2296();
		if (class189.method4414(this.stream1) == 0 && class189.method4414(this.stream2) == 0) {
			this.method2299();
			this.method2300();
			this.remove();
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lts;IIIII)V",
		garbageValue = "1974484193"
	)
	void method2292(WorldEntity var1, int var2, int var3, int var4, int var5) {
		int var6 = class468.clientPreferences.getAreaSoundEffectsVolume();
		if (this.field976) {
			this.method2293(0, this.field975, this.field969);
			this.method2294(0, this.field975, this.field969);
			this.method2295();
			this.method2296();
			if (class189.method4414(this.stream1) == 0 && class189.method4414(this.stream2) == 0) {
				this.method2299();
				this.method2300();
				this.field976 = false;
			}

		} else if (this.soundEffectId != -1 || this.soundEffectIds != null) {
			WorldEntity var7 = Client.worldViewManager.method2391(this.plane);
			if (var6 != 0) {
				boolean var8;
				int var12;
				int var13;
				label164: {
					int var9 = this.x;
					class402 var10 = this.field970;
					boolean var11 = var7 == var1;
					if (var11) {
						if (var9 != var2) {
							var8 = false;
							break label164;
						}
					} else {
						if (var1 != null && var1.field5538.method4615() != var2) {
							var8 = false;
							break label164;
						}

						if (var7 != null && var7.field5538.method4615() != var9) {
							var8 = false;
							break label164;
						}

						var12 = var1 == null ? var2 : var1.getX();
						var13 = var7 == null ? var9 : var7.getX();
						if (var13 != var12) {
							var8 = false;
							break label164;
						}
					}

					switch(var10.field4862) {
					case 0:
						var8 = true;
						break;
					case 1:
						var8 = var11;
						break;
					case 2:
						var8 = var7 == var1 || var7 == null;
						break;
					default:
						var8 = false;
					}
				}

				if (var8) {
					this.method2295();
					this.method2296();
					int var17 = class204.method4559(var3, var4, this);
					double var15;
					if (this.field972 < this.field960) {
						var15 = LoginScreenAnimation.method2635((long)(this.field960 - var17), (long)(this.field960 - this.field972), this.field971);
					} else {
						var15 = 1.0D;
					}

					int var18 = (int)(var15 * (double)var6);
					var12 = class189.method4414(this.stream1);
					var13 = class189.method4414(this.stream2);
					if (var12 < var18) {
						this.method2293(var18, this.field961, this.field974);
					} else if (var12 > var18) {
						this.method2293(var18, this.field975, this.field969);
					}

					if (var13 < var18) {
						this.method2294(var18, this.field961, this.field974);
					} else if (var13 > var18) {
						this.method2294(var18, this.field975, this.field969);
					}

					if (this.stream1 != null) {
						this.method2295();
					} else if (this.soundEffectId >= 0 && var18 > 0) {
						this.method2297(this.soundEffectId, 0);
					}

					if (this.stream2 != null) {
						this.method2296();
					} else if (this.soundEffectIds != null && (this.field957 -= var5) <= 0 && var18 > 0) {
						this.method2379(this.soundEffectIds, var18);
						this.method2294(var18, this.field961, this.field974);
						this.method2296();
					}

					return;
				}
			}

			this.method2293(0, 150, field978);
			this.method2294(0, 150, field978);
			this.method2295();
			this.method2296();
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IILnb;B)V",
		garbageValue = "-19"
	)
	void method2293(int var1, int var2, class343 var3) {
		if (this.stream1 != null && this.stream1.field1369 != var1) {
			this.stream1.field1381 = this.stream1.method3287();
			this.stream1.field1364 = ParamComposition.method4708();
			this.stream1.field1369 = var1;
			this.stream1.field1380 = HttpRequestTask.method292(var2, Math.abs(this.stream1.field1381 - this.stream1.field1369), class468.clientPreferences.getAreaSoundEffectsVolume());
			this.stream1.field1379 = var3;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IILnb;B)V",
		garbageValue = "-59"
	)
	void method2294(int var1, int var2, class343 var3) {
		if (this.stream2 != null && this.stream2.field1369 != var1) {
			this.stream2.field1381 = this.stream2.method3287();
			this.stream2.field1364 = ParamComposition.method4708();
			int var4 = HttpRequestTask.method292(var2, Math.abs(this.stream2.field1381 - var1), class468.clientPreferences.getAreaSoundEffectsVolume());
			this.stream2.field1380 = var4;
			this.stream2.field1369 = var1;
			this.stream2.field1379 = var3;
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	void method2295() {
		if (this.stream1 != null) {
			int var1 = this.stream1.method3287();
			long var2 = ParamComposition.method4708();
			long var4 = var2 - this.stream1.field1364;
			int var7 = this.stream1.field1381;
			int var8 = this.stream1.field1369;
			class343 var9 = this.stream1.field1379;
			int var10 = this.stream1.field1380;
			int var6;
			if (var8 == var1) {
				var6 = var1;
			} else {
				int var11;
				double var12;
				if (var1 > var8) {
					var12 = 1.0D - LoginScreenAnimation.method2635(var4, (long)var10, var9);
					var11 = var8 + (int)(var12 * (double)(var7 - var8));
				} else {
					var12 = LoginScreenAnimation.method2635(var4, (long)var10, var9);
					var11 = var7 + (int)(var12 * (double)(var8 - var7));
				}

				var6 = var11;
			}

			if (var6 != var1) {
				this.stream1.method3288(var6);
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1784349338"
	)
	void method2296() {
		if (this.stream2 != null) {
			int var1 = this.stream2.method3287();
			long var2 = ParamComposition.method4708();
			long var4 = var2 - this.stream2.field1364;
			int var7 = this.stream2.field1381;
			int var8 = this.stream2.field1369;
			class343 var9 = this.stream2.field1379;
			int var10 = this.stream2.field1380;
			int var6;
			if (var1 == var8) {
				var6 = var1;
			} else {
				int var11;
				double var12;
				if (var1 > var8) {
					var12 = 1.0D - LoginScreenAnimation.method2635(var4, (long)var10, var9);
					var11 = var8 + (int)((double)(var7 - var8) * var12);
				} else {
					var12 = LoginScreenAnimation.method2635(var4, (long)var10, var9);
					var11 = var7 + (int)(var12 * (double)(var8 - var7));
				}

				var6 = var11;
			}

			if (var6 != var1) {
				this.stream2.method3288(var6);
			}

			if (!this.stream2.hasNext()) {
				this.stream2 = null;
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "18"
	)
	void method2297(int var1, int var2) {
		int var3 = class175.field1928.getGroupFileCount(var1) - 1;
		SoundEffect var4 = SoundEffect.readSoundEffect(class175.field1928, var1, var3);
		if (var4 != null) {
			RawSound var5;
			if (var3 == 0) {
				var5 = var4.method3130(class468.clientPreferences.method2671());
			} else {
				if (var3 != 1) {
					return;
				}

				var5 = var4.toRawSound();
			}

			RawPcmStream var6 = RawPcmStream.createRawPcmStream(var5, 100, var2);
			if (var6 == null) {
				return;
			}

			var6.setNumLoops(-1);
			class50.pcmStreamMixer.addSubStream(var6);
			this.stream1 = var6;
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([III)V",
		garbageValue = "341321924"
	)
	void method2379(int[] var1, int var2) {
		int var3 = var1[(int)(Math.random() * (double)var1.length)];
		int var4 = class175.field1928.getGroupFileCount(var3) - 1;
		SoundEffect var5 = SoundEffect.readSoundEffect(class175.field1928, var3, var4);
		if (var5 != null) {
			RawSound var6;
			if (var4 == 0) {
				var6 = var5.method3130(class468.clientPreferences.method2671());
			} else {
				if (var4 != 1) {
					return;
				}

				var6 = var5.toRawSound();
			}

			RawPcmStream var7 = RawPcmStream.createRawPcmStream(var6, 100, var2);
			if (var7 == null) {
				return;
			}

			var7.setNumLoops(0);
			class50.pcmStreamMixer.addSubStream(var7);
			var7.method3292();
			this.stream2 = var7;
			this.field957 = class190.method4416(this.field956, this.field968);
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field960 = Coord.method7702(var2.int7);
			this.field972 = Coord.method7702(var2.int8);
			this.field956 = var2.int5;
			this.field968 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
			this.field971 = var2.field2394;
			this.field974 = var2.field2365;
			this.field961 = var2.field2395;
			this.field969 = var2.field2342;
			this.field975 = var2.field2396;
		} else {
			this.soundEffectId = -1;
			this.field960 = 0;
			this.field972 = 0;
			this.field956 = 0;
			this.field968 = 0;
			this.soundEffectIds = null;
			this.field971 = ObjectComposition.field2344;
			this.field969 = ObjectComposition.field2346;
			this.field975 = 300;
			this.field974 = ObjectComposition.field2345;
			this.field961 = 300;
		}

		if (var1 != this.soundEffectId) {
			this.field976 = true;
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "894587571"
	)
	void method2299() {
		if (this.stream1 != null) {
			class50.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1510917926"
	)
	void method2300() {
		if (this.stream2 != null) {
			class50.pcmStreamMixer.removeSubStream(this.stream2);
			this.stream2 = null;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-687136603"
	)
	void method2301() {
		field977.addFirst(this);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "63"
	)
	int method2302() {
		return this.soundEffectId;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-52580555"
	)
	int method2303() {
		return this.y;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1435659795"
	)
	int method2377() {
		return this.maxY;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1169198172"
	)
	int method2305() {
		return this.maxX;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-845914253"
	)
	int method2306() {
		return this.field966;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2095760655"
	)
	int method2347() {
		return this.x;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-742539409"
	)
	int method2368() {
		return this.field960;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2020781859"
	)
	int method2309() {
		return this.field972;
	}

	@ObfuscatedName("cy")
	@Export("remove")
	public void remove() {
		super.remove();
	}

	public String toString() {
		return super.toString();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxa;I)Ljava/lang/String;",
		garbageValue = "162307969"
	)
	public static String method2380(Buffer var0) {
		return PlayerType.method8476(var0, 32767);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lft;FFFFFFFFI)V",
		garbageValue = "-509240052"
	)
	static void method2336(class139 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
		if (var0 != null) {
			var0.field1654 = var1;
			float var9 = var4 - var1;
			float var10 = var8 - var5;
			float var11 = var2 - var1;
			float var12 = 0.0F;
			float var13 = 0.0F;
			if (0.0F != var11) {
				var12 = (var6 - var5) / var11;
			}

			var11 = var4 - var3;
			if (var11 != 0.0F) {
				var13 = (var8 - var7) / var11;
			}

			float var14 = 1.0F / (var9 * var9);
			float var15 = var12 * var9;
			float var16 = var9 * var13;
			var0.field1655 = var14 * (var16 + var15 - var10 - var10) / var9;
			var0.field1657 = (var10 + var10 + var10 - var15 - var15 - var16) * var14;
			var0.field1658 = var12;
			var0.field1659 = var5;
		}
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(ILcu;ZI)I",
		garbageValue = "2048154668"
	)
	static int method2381(int var0, Script var1, boolean var2) {
		int var3;
		Object var4;
		int var5;
		DbTable var6;
		int var7;
		if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
			var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
			var4 = class39.method816(var3);
			var5 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
			var6 = GraphicsObject.getDbTable(var5);
			if (var6 == null) {
				throw new RuntimeException();
			} else {
				var7 = ItemLayer.method5258(var5);
				VarcInt.field2016 = var6.method11484(var4, var7);
				if (VarcInt.field2016 != null) {
					Client.field497 = Buddy.method10379(var5);
					class291.field3327 = VarcInt.field2016.iterator();
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = VarcInt.field2016.size();
					}
				} else {
					Client.field497 = -1;
					class291.field3327 = null;
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1;
			}
		} else if (var0 != ScriptOpcodes.DB_FINDNEXT) {
			int var19;
			int var20;
			if (var0 == ScriptOpcodes.DB_GETFIELD) {
				class408.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
				var19 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2];
				var20 = Buddy.method10379(var19);
				var7 = class236.method5199(var19);
				int var21 = ItemLayer.method5258(var19);
				DbRowType var26 = class141.getDbRowType(var3);
				DbTableType var27 = ChatChannel.getDbTableType(var20);
				int[] var28 = var27.types[var7];
				int var12 = 0;
				int var13 = var28.length;
				if (var21 >= 0) {
					if (var21 >= var13) {
						throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var21 + ", Max: " + var13);
					}

					var12 = var21;
					var13 = var21 + 1;
				}

				Object[] var14 = var26.getColumnType(var7);
				if (var14 == null && var27.defaultValues != null) {
					var14 = var27.defaultValues[var7];
				}

				int var15;
				int var16;
				if (var14 == null) {
					for (var15 = var12; var15 < var13; ++var15) {
						var16 = var28[var15];
						class586 var22 = class251.method5495(var16);
						if (var22 == class586.field5939) {
							Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
						} else {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class113.method3583(var16);
						}
					}

					return 1;
				} else {
					var15 = var14.length / var28.length;
					if (var5 >= 0 && var5 < var15) {
						for (var16 = var12; var16 < var13; ++var16) {
							int var17 = var16 + var28.length * var5;
							class586 var18 = class251.method5495(var28[var16]);
							if (var18 == class586.field5939) {
								Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var14[var17];
							} else {
								Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = (Integer)var14[var17];
							}
						}

						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			} else if (var0 == ScriptOpcodes.DB_GETFIELDCOUNT) {
				class408.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
				var19 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
				var5 = 0;
				var20 = Buddy.method10379(var19);
				var7 = class236.method5199(var19);
				DbRowType var25 = class141.getDbRowType(var3);
				DbTableType var9 = ChatChannel.getDbTableType(var20);
				int[] var10 = var9.types[var7];
				Object[] var11 = var25.getColumnType(var7);
				if (var11 == null && var9.defaultValues != null) {
					var11 = var9.defaultValues[var7];
				}

				if (var11 != null) {
					var5 = var11.length / var10.length;
				}

				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var5;
				return 1;
			} else if (var0 == ScriptOpcodes.DB_FINDALL_WITH_COUNT) {
				--class408.Interpreter_intStackSize;
				var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
				DbTable var24 = WorldMapDecorationType.getDbTable2(var3);
				if (var24 == null) {
					throw new RuntimeException();
				} else {
					VarcInt.field2016 = var24.method11484(0, 0);
					var5 = 0;
					if (VarcInt.field2016 != null) {
						Client.field497 = var3;
						class291.field3327 = VarcInt.field2016.iterator();
						var5 = VarcInt.field2016.size();
					}

					if (var0 == ScriptOpcodes.DB_FINDALL_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var5;
					}

					return 1;
				}
			} else if (var0 == ScriptOpcodes.DB_GETROWTABLE) {
				var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
				DbRowType var23 = class141.getDbRowType(var3);
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var23.tableId;
				return 1;
			} else if (var0 == ScriptOpcodes.DB_GETROW) {
				var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
				var19 = -1;
				if (VarcInt.field2016 != null && var3 >= 0 && var3 < VarcInt.field2016.size()) {
					var19 = (Integer)VarcInt.field2016.get(var3);
				}

				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var19;
				return 1;
			} else if (var0 == ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT) {
				var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
				var4 = class39.method816(var3);
				var5 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
				var6 = GraphicsObject.getDbTable(var5);
				if (var6 == null) {
					throw new RuntimeException();
				} else if (Buddy.method10379(var5) != Client.field497) {
					throw new RuntimeException();
				} else if (VarcInt.field2016 == null && VarcInt.field2016.isEmpty()) {
					throw new RuntimeException();
				} else {
					var7 = ItemLayer.method5258(var5);
					List var8 = var6.method11484(var4, var7);
					VarcInt.field2016 = new LinkedList(VarcInt.field2016);
					if (var8 != null) {
						VarcInt.field2016.retainAll(var8);
					} else {
						VarcInt.field2016.clear();
					}

					class291.field3327 = VarcInt.field2016.iterator();
					if (var0 == ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = VarcInt.field2016.size();
					}

					return 1;
				}
			} else {
				return 2;
			}
		} else {
			if (class291.field3327 != null && class291.field3327.hasNext()) {
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = (Integer)class291.field3327.next();
			} else {
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		}
	}
}
