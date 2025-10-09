import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cv")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	static final NodeDeque field990;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	static final class336 field991;
	@ObfuscatedName("ut")
	@ObfuscatedGetter(
		intValue = 2061765167
	)
	static int field983;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1148235011
	)
	@Export("plane")
	final int plane;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -970579483
	)
	@Export("x")
	final int x;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -724579875
	)
	@Export("y")
	final int y;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 133403087
	)
	@Export("maxX")
	final int maxX;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 706729263
	)
	@Export("maxY")
	final int maxY;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -2089022247
	)
	final int field973;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -970084121
	)
	int field974;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 196834719
	)
	int field975;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("obj")
	final ObjectComposition obj;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -2009727527
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("av")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 2117553735
	)
	int field979;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1613026425
	)
	int field982;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 981803739
	)
	int field971;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	class336 field984;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	class336 field970;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 202053869
	)
	int field986;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	class336 field987;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1143461483
	)
	int field988;
	@ObfuscatedName("aw")
	boolean field989;

	static {
		field990 = new NodeDeque();
		field991 = class336.field3851;
	}

	@ObfuscatedSignature(
		descriptor = "(IIIIILia;)V"
	)
	ObjectSound(int var1, int var2, int var3, int var4, int var5, ObjectComposition var6) {
		this.field989 = false;
		this.plane = var1;
		this.x = var2;
		this.y = Coord.method7440(var3);
		this.maxX = Coord.method7440(var4);
		int var7 = var6.sizeX;
		int var8 = var6.sizeY;
		if (var5 == 1 || var5 == 3) {
			var7 = var6.sizeY;
			var8 = var6.sizeX;
		}

		this.maxY = Coord.method7440(var3 + var7);
		this.field973 = Coord.method7440(var8 + var4);
		this.soundEffectId = var6.ambientSoundId;
		this.field974 = Coord.method7440(var6.int7);
		this.field975 = Math.max(Coord.method7440(var6.int8 - 1), 0);
		this.field979 = var6.int5;
		this.field982 = var6.int6;
		this.soundEffectIds = var6.soundEffectIds;
		if (var6.transforms != null) {
			this.obj = var6;
			this.set();
		} else {
			this.obj = null;
		}

		if (this.soundEffectIds != null) {
			this.field971 = class29.method463(this.field979, this.field982);
		}

		this.field984 = var6.field2361;
		this.field987 = var6.field2364;
		this.field988 = var6.field2307;
		this.field970 = var6.field2365;
		this.field986 = var6.field2363;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1964553480"
	)
	void method2275() {
		this.method2347(0, this.field986, this.field970);
		this.method2278(0, this.field986, this.field970);
		this.method2279();
		this.method2350();
		if (class149.method3901(this.stream1) == 0 && class149.method3901(this.stream2) == 0) {
			this.method2284();
			this.method2285();
			this.remove();
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ltg;IIIII)V",
		garbageValue = "649209464"
	)
	void method2276(WorldEntity var1, int var2, int var3, int var4, int var5) {
		int var6 = class154.clientPreferences.getAreaSoundEffectsVolume();
		if (this.field989) {
			this.method2347(0, this.field986, this.field970);
			this.method2278(0, this.field986, this.field970);
			this.method2279();
			this.method2350();
			if (class149.method3901(this.stream1) == 0 && class149.method3901(this.stream2) == 0) {
				this.method2284();
				this.method2285();
				this.field989 = false;
			}

		} else if (this.soundEffectId != -1 || this.soundEffectIds != null) {
			WorldEntity var7 = Client.worldViewManager.method2395(this.plane);
			if (var6 != 0) {
				int var9 = this.x;
				boolean var8;
				if (var7 == var1) {
					var8 = var9 == var2;
				} else if (var1 != null && var7 == null) {
					var8 = var1.field5482.method4539() == var2 && var1.getX() == var9;
				} else {
					var8 = false;
				}

				if (var8) {
					this.method2279();
					this.method2350();
					int var17 = HttpResponse.method302(var3, var4, this);
					double var15;
					if (this.field975 < this.field974) {
						var15 = class147.method3887((long)(this.field974 - var17), (long)(this.field974 - this.field975), this.field984);
					} else {
						var15 = 1.0D;
					}

					int var11 = (int)((double)var6 * var15);
					int var12 = class149.method3901(this.stream1);
					int var13 = class149.method3901(this.stream2);
					if (var12 < var11) {
						this.method2347(var11, this.field988, this.field987);
					} else if (var12 > var11) {
						this.method2347(var11, this.field986, this.field970);
					}

					if (var13 < var11) {
						this.method2278(var11, this.field988, this.field987);
					} else if (var13 > var11) {
						this.method2278(var11, this.field986, this.field970);
					}

					if (this.stream1 != null) {
						this.method2279();
					} else if (this.soundEffectId >= 0 && var11 > 0) {
						this.method2349(this.soundEffectId, 0);
					}

					if (this.stream2 != null) {
						this.method2350();
					} else if (this.soundEffectIds != null && (this.field971 -= var5) <= 0 && var11 > 0) {
						this.method2304(this.soundEffectIds, var11);
						this.method2278(var11, this.field988, this.field987);
						this.method2350();
					}

					return;
				}
			}

			this.method2347(0, 150, field991);
			this.method2278(0, 150, field991);
			this.method2279();
			this.method2350();
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IILma;B)V",
		garbageValue = "1"
	)
	void method2347(int var1, int var2, class336 var3) {
		if (this.stream1 != null && this.stream1.field1409 != var1) {
			this.stream1.field1407 = this.stream1.method3257();
			this.stream1.field1408 = class281.method6373();
			this.stream1.field1409 = var1;
			this.stream1.field1405 = SpotAnimationDefinition.method4494(var2, Math.abs(this.stream1.field1407 - this.stream1.field1409), class154.clientPreferences.getAreaSoundEffectsVolume());
			this.stream1.field1394 = var3;
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IILma;B)V",
		garbageValue = "-102"
	)
	void method2278(int var1, int var2, class336 var3) {
		if (this.stream2 != null && this.stream2.field1409 != var1) {
			this.stream2.field1407 = this.stream2.method3257();
			this.stream2.field1408 = class281.method6373();
			int var4 = SpotAnimationDefinition.method4494(var2, Math.abs(this.stream2.field1407 - var1), class154.clientPreferences.getAreaSoundEffectsVolume());
			this.stream2.field1405 = var4;
			this.stream2.field1409 = var1;
			this.stream2.field1394 = var3;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1645761766"
	)
	void method2279() {
		if (this.stream1 != null) {
			int var1 = this.stream1.method3257();
			long var2 = class281.method6373();
			long var4 = var2 - this.stream1.field1408;
			int var7 = this.stream1.field1407;
			int var8 = this.stream1.field1409;
			class336 var9 = this.stream1.field1394;
			int var10 = this.stream1.field1405;
			int var6;
			if (var1 == var8) {
				var6 = var1;
			} else {
				int var11;
				double var12;
				if (var1 > var8) {
					var12 = 1.0D - class147.method3887(var4, (long)var10, var9);
					var11 = var8 + (int)(var12 * (double)(var7 - var8));
				} else {
					var12 = class147.method3887(var4, (long)var10, var9);
					var11 = var7 + (int)((double)(var8 - var7) * var12);
				}

				var6 = var11;
			}

			if (var6 != var1) {
				this.stream1.method3251(var6);
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2092916623"
	)
	void method2350() {
		if (this.stream2 != null) {
			int var1 = this.stream2.method3257();
			long var2 = class281.method6373();
			long var4 = var2 - this.stream2.field1408;
			int var7 = this.stream2.field1407;
			int var8 = this.stream2.field1409;
			class336 var9 = this.stream2.field1394;
			int var10 = this.stream2.field1405;
			int var6;
			if (var8 == var1) {
				var6 = var1;
			} else {
				int var11;
				double var12;
				if (var1 > var8) {
					var12 = 1.0D - class147.method3887(var4, (long)var10, var9);
					var11 = var8 + (int)((double)(var7 - var8) * var12);
				} else {
					var12 = class147.method3887(var4, (long)var10, var9);
					var11 = var7 + (int)((double)(var8 - var7) * var12);
				}

				var6 = var11;
			}

			if (var6 != var1) {
				this.stream2.method3251(var6);
			}

			if (!this.stream2.hasNext()) {
				this.stream2 = null;
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1836812162"
	)
	void method2349(int var1, int var2) {
		int var3 = PacketWriter.field1291.getGroupFileCount(var1) - 1;
		SoundEffect var4 = SoundEffect.readSoundEffect(PacketWriter.field1291, var1, var3);
		if (var4 != null) {
			RawSound var5;
			if (var3 == 0) {
				var5 = var4.method3108(class154.clientPreferences.method2624());
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
			class4.pcmStreamMixer.addSubStream(var6);
			this.stream1 = var6;
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "([IIB)V",
		garbageValue = "-13"
	)
	void method2304(int[] var1, int var2) {
		int var3 = var1[(int)(Math.random() * (double)var1.length)];
		int var4 = PacketWriter.field1291.getGroupFileCount(var3) - 1;
		SoundEffect var5 = SoundEffect.readSoundEffect(PacketWriter.field1291, var3, var4);
		if (var5 != null) {
			RawSound var6;
			if (var4 == 0) {
				var6 = var5.method3108(class154.clientPreferences.method2624());
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
			class4.pcmStreamMixer.addSubStream(var7);
			var7.method3262();
			this.stream2 = var7;
			this.field971 = class29.method463(this.field979, this.field982);
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field974 = Coord.method7440(var2.int7);
			this.field975 = Coord.method7440(var2.int8);
			this.field979 = var2.int5;
			this.field982 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
			this.field984 = var2.field2361;
			this.field987 = var2.field2364;
			this.field988 = var2.field2307;
			this.field970 = var2.field2365;
			this.field986 = var2.field2363;
		} else {
			this.soundEffectId = -1;
			this.field974 = 0;
			this.field975 = 0;
			this.field979 = 0;
			this.field982 = 0;
			this.soundEffectIds = null;
			this.field984 = ObjectComposition.field2302;
			this.field970 = ObjectComposition.field2370;
			this.field986 = 300;
			this.field987 = ObjectComposition.field2323;
			this.field988 = 300;
		}

		if (var1 != this.soundEffectId) {
			this.field989 = true;
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-26"
	)
	void method2284() {
		if (this.stream1 != null) {
			class4.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "741467234"
	)
	void method2285() {
		if (this.stream2 != null) {
			class4.pcmStreamMixer.removeSubStream(this.stream2);
			this.stream2 = null;
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-761847813"
	)
	void method2286() {
		field990.addFirst(this);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1496122651"
	)
	int method2321() {
		return this.soundEffectId;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-96"
	)
	int method2288() {
		return this.y;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "2"
	)
	int method2289() {
		return this.maxY;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-646244585"
	)
	int method2290() {
		return this.maxX;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1974170587"
	)
	int method2302() {
		return this.field973;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "482878763"
	)
	int method2292() {
		return this.x;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2114996133"
	)
	int method2293() {
		return this.field974;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "919007988"
	)
	int method2294() {
		return this.field975;
	}

	@ObfuscatedName("cu")
	@Export("remove")
	public void remove() {
		super.remove();
	}

	public String toString() {
		return super.toString();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "16711935"
	)
	protected static final void method2358() {
		UserComparator4.clock.mark();

		int var0;
		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.clientTickTimes[var0] = 0L;
		}

		class559.gameCyclesToDo = 0;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZI)I",
		garbageValue = "-1938178294"
	)
	static int method2359(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) {
			UrlRequest.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
			EnumComposition var10 = class195.getEnum(var3);
			if (var10.outputType != 's') {
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) {
				if (var9 == var10.keys[var6]) {
					Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var10.strVals[var6];
					var10 = null;
					break;
				}
			}

			if (var10 != null) {
				Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var10.defaultStr;
			}

			return 1;
		} else if (var0 != ScriptOpcodes.ENUM) {
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) {
				var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
				EnumComposition var4 = class195.getEnum(var3);
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var4.size();
				return 1;
			} else {
				return 2;
			}
		} else {
			UrlRequest.Interpreter_intStackSize -= 4;
			var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2];
			var6 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 3];
			EnumComposition var7 = class195.getEnum(var5);
			if (var3 == var7.inputType && var9 == var7.outputType) {
				for (int var8 = 0; var8 < var7.outputCount; ++var8) {
					if (var6 == var7.keys[var8]) {
						if (var9 == 115) {
							Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var7.intVals[var8];
						}

						var7 = null;
						break;
					}
				}

				if (var7 != null) {
					if (var9 == 115) {
						Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var7.defaultInt;
					}
				}

				return 1;
			} else {
				if (var9 == 115) {
					Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}
}
