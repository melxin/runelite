import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	static final NodeDeque field990;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1345896941
	)
	@Export("plane")
	final int plane;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1554734207
	)
	@Export("x")
	final int x;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1301913387
	)
	@Export("y")
	final int y;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1338235821
	)
	@Export("maxX")
	final int maxX;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1117571411
	)
	@Export("maxY")
	final int maxY;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1004005739
	)
	final int field973;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 2103591219
	)
	int field974;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -963992055
	)
	int field980;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("obj")
	final ObjectComposition obj;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ldr;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 830634565
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ldr;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("aa")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1658057709
	)
	int field981;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1939783797
	)
	int field982;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 63635851
	)
	int field983;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	class335 field984;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	class335 field985;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1662493227
	)
	int field968;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	class335 field987;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 808136859
	)
	int field986;
	@ObfuscatedName("ad")
	boolean field989;
	@ObfuscatedName("af")
	final int field991;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	final class335 field970;

	static {
		field990 = new NodeDeque();
	}

	@ObfuscatedSignature(
		descriptor = "(IIIIILia;)V"
	)
	ObjectSound(int var1, int var2, int var3, int var4, int var5, ObjectComposition var6) {
		this.field989 = false;
		this.field991 = 150;
		this.field970 = class335.field3773;
		this.plane = var1;
		this.x = var2;
		this.y = Coord.method7393(var3);
		this.maxX = Coord.method7393(var4);
		int var7 = var6.sizeX;
		int var8 = var6.sizeY;
		if (var5 == 1 || var5 == 3) {
			var7 = var6.sizeY;
			var8 = var6.sizeX;
		}

		this.maxY = Coord.method7393(var3 + var7);
		this.field973 = Coord.method7393(var8 + var4);
		this.soundEffectId = var6.ambientSoundId;
		this.field974 = Coord.method7393(var6.int7);
		this.field980 = Math.max(Coord.method7393(var6.int8 - 1), 0);
		this.field981 = var6.int5;
		this.field982 = var6.int6;
		this.soundEffectIds = var6.soundEffectIds;
		if (var6.transforms != null) {
			this.obj = var6;
			this.set();
		} else {
			this.obj = null;
		}

		if (this.soundEffectIds != null) {
			int var11 = this.field981;
			int var12 = this.field982;
			int var10 = var11 + (int)(Math.random() * (double)(var12 - var11));
			this.field983 = var10;
		}

		this.field984 = var6.field2259;
		this.field987 = var6.field2315;
		this.field986 = var6.field2313;
		this.field985 = var6.field2302;
		this.field968 = var6.field2314;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "192027910"
	)
	void method2221() {
		this.method2223(0, this.field968, this.field985);
		this.method2265(0, this.field968, this.field985);
		this.method2289();
		this.method2268();
		RawPcmStream var2 = this.stream1;
		int var1;
		if (var2 != null) {
			var1 = var2.method3129();
		} else {
			var1 = 0;
		}

		if (var1 == 0) {
			RawPcmStream var4 = this.stream2;
			int var3;
			if (var4 != null) {
				var3 = var4.method3129();
			} else {
				var3 = 0;
			}

			if (var3 == 0) {
				this.method2293();
				this.method2231();
				this.remove();
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ltz;IIIII)V",
		garbageValue = "-182298156"
	)
	void method2222(WorldEntity var1, int var2, int var3, int var4, int var5) {
		int var6 = FriendSystem.clientPreferences.getAreaSoundEffectsVolume();
		int var9;
		if (this.field989) {
			this.method2223(0, this.field968, this.field985);
			this.method2265(0, this.field968, this.field985);
			this.method2289();
			this.method2268();
			RawPcmStream var27 = this.stream1;
			int var28;
			if (var27 != null) {
				var28 = var27.method3129();
			} else {
				var28 = 0;
			}

			if (var28 == 0) {
				RawPcmStream var29 = this.stream2;
				if (var29 != null) {
					var9 = var29.method3129();
				} else {
					var9 = 0;
				}

				if (var9 == 0) {
					this.method2293();
					this.method2231();
					this.field989 = false;
				}
			}

		} else if (this.soundEffectId != -1 || this.soundEffectIds != null) {
			WorldEntity var7 = Client.worldViewManager.method2317(this.plane);
			if (var6 != 0) {
				var9 = this.x;
				boolean var8;
				if (var7 == var1) {
					var8 = var9 == var2;
				} else if (var1 != null && var7 == null) {
					var8 = var1.field5320.method4438() == var2 && var1.getX() == var9;
				} else {
					var8 = false;
				}

				if (var8) {
					this.method2289();
					this.method2268();
					WorldView var10 = Client.worldViewManager.getWorldView(this.plane);
					class448 var11 = AttackOption.method2761(var10, this.y, this.maxX);
					class448 var12 = AttackOption.method2761(var10, this.maxY, this.field973);
					int var13 = (int)var11.field5059;
					int var14 = (int)var11.field5054;
					int var15 = (int)var12.field5059;
					int var16 = (int)var12.field5054;
					var11.method9038();
					var12.method9038();
					int var18 = 0;
					if (var3 < var13) {
						var18 += var13 - var3;
					} else if (var3 > var15) {
						var18 += var3 - var15;
					}

					if (var4 < var14) {
						var18 += var14 - var4;
					} else if (var4 > var16) {
						var18 += var4 - var16;
					}

					var18 = Math.max(var18 - 64, 0);
					double var23;
					if (this.field980 < this.field974) {
						var23 = class198.method4387((long)(this.field974 - var18), (long)(this.field974 - this.field980), this.field984);
					} else {
						var23 = 1.0D;
					}

					var13 = (int)((double)var6 * var23);
					RawPcmStream var25 = this.stream1;
					if (var25 != null) {
						var14 = var25.method3129();
					} else {
						var14 = 0;
					}

					RawPcmStream var26 = this.stream2;
					int var17;
					if (var26 != null) {
						var17 = var26.method3129();
					} else {
						var17 = 0;
					}

					if (var14 < var13) {
						this.method2223(var13, this.field986, this.field987);
					} else if (var14 > var13) {
						this.method2223(var13, this.field968, this.field985);
					}

					if (var17 < var13) {
						this.method2265(var13, this.field986, this.field987);
					} else if (var17 > var13) {
						this.method2265(var13, this.field968, this.field985);
					}

					if (this.stream1 != null) {
						this.method2289();
					} else if (this.soundEffectId >= 0 && var13 > 0) {
						this.method2227(this.soundEffectId, 0);
					}

					if (this.stream2 != null) {
						this.method2268();
					} else if (this.soundEffectIds != null && (this.field983 -= var5) <= 0 && var13 > 0) {
						this.method2228(this.soundEffectIds, var13);
						this.method2265(var13, this.field986, this.field987);
						this.method2268();
					}

					return;
				}
			}

			this.method2223(0, 150, this.field970);
			this.method2265(0, 150, this.field970);
			this.method2289();
			this.method2268();
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IILmx;I)V",
		garbageValue = "806626143"
	)
	void method2223(int var1, int var2, class335 var3) {
		if (this.stream1 != null && this.stream1.field1386 != var1) {
			this.stream1.field1384 = this.stream1.method3129();
			this.stream1.field1382 = UserComparator7.method3496();
			this.stream1.field1386 = var1;
			this.stream1.field1385 = Tiles.method2075(var2, Math.abs(this.stream1.field1384 - this.stream1.field1386), FriendSystem.clientPreferences.getAreaSoundEffectsVolume());
			this.stream1.field1367 = var3;
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IILmx;I)V",
		garbageValue = "-2013935430"
	)
	void method2265(int var1, int var2, class335 var3) {
		if (this.stream2 != null && this.stream2.field1386 != var1) {
			this.stream2.field1384 = this.stream2.method3129();
			this.stream2.field1382 = UserComparator7.method3496();
			int var4 = Tiles.method2075(var2, Math.abs(this.stream2.field1384 - var1), FriendSystem.clientPreferences.getAreaSoundEffectsVolume());
			this.stream2.field1385 = var4;
			this.stream2.field1386 = var1;
			this.stream2.field1367 = var3;
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-100"
	)
	void method2289() {
		if (this.stream1 != null) {
			int var1 = this.stream1.method3129();
			long var2 = UserComparator7.method3496();
			long var4 = var2 - this.stream1.field1382;
			int var7 = this.stream1.field1384;
			int var8 = this.stream1.field1386;
			class335 var9 = this.stream1.field1367;
			int var10 = this.stream1.field1385;
			int var6;
			if (var8 == var1) {
				var6 = var1;
			} else {
				int var11;
				double var12;
				if (var1 > var8) {
					var12 = 1.0D - class198.method4387(var4, (long)var10, var9);
					var11 = var8 + (int)((double)(var7 - var8) * var12);
				} else {
					var12 = class198.method4387(var4, (long)var10, var9);
					var11 = var7 + (int)((double)(var8 - var7) * var12);
				}

				var6 = var11;
			}

			if (var6 != var1) {
				this.stream1.method3214(var6);
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1080737913"
	)
	void method2268() {
		if (this.stream2 != null) {
			int var1 = this.stream2.method3129();
			long var2 = UserComparator7.method3496();
			long var4 = var2 - this.stream2.field1382;
			int var7 = this.stream2.field1384;
			int var8 = this.stream2.field1386;
			class335 var9 = this.stream2.field1367;
			int var10 = this.stream2.field1385;
			int var6;
			if (var8 == var1) {
				var6 = var1;
			} else {
				int var11;
				double var12;
				if (var1 > var8) {
					var12 = 1.0D - class198.method4387(var4, (long)var10, var9);
					var11 = var8 + (int)(var12 * (double)(var7 - var8));
				} else {
					var12 = class198.method4387(var4, (long)var10, var9);
					var11 = var7 + (int)((double)(var8 - var7) * var12);
				}

				var6 = var11;
			}

			if (var1 != var6) {
				this.stream2.method3214(var6);
			}

			if (!this.stream2.hasNext()) {
				this.stream2 = null;
			}
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "0"
	)
	void method2227(int var1, int var2) {
		int var3 = class4.field6.getGroupFileCount(var1) - 1;
		SoundEffect var4 = SoundEffect.readSoundEffect(class4.field6, var1, var3);
		if (var4 != null) {
			RawSound var5 = var4.method2969(FriendSystem.clientPreferences.method2548());
			RawPcmStream var6 = RawPcmStream.createRawPcmStream(var5, 100, var2);
			var6.setNumLoops(-1);
			class366.pcmStreamMixer.addSubStream(var6);
			this.stream1 = var6;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([III)V",
		garbageValue = "-1342507440"
	)
	void method2228(int[] var1, int var2) {
		int var3 = var1[(int)(Math.random() * (double)var1.length)];
		int var4 = class4.field6.getGroupFileCount(var3) - 1;
		SoundEffect var5 = SoundEffect.readSoundEffect(class4.field6, var3, var4);
		if (var5 != null) {
			RawSound var6 = var5.method2969(FriendSystem.clientPreferences.method2548());
			RawPcmStream var7 = RawPcmStream.createRawPcmStream(var6, 100, var2);
			var7.setNumLoops(0);
			class366.pcmStreamMixer.addSubStream(var7);
			var7.method3225();
			this.stream2 = var7;
			int var9 = this.field981;
			int var10 = this.field982;
			int var8 = var9 + (int)(Math.random() * (double)(var10 - var9));
			this.field983 = var8;
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-400737697"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field974 = Coord.method7393(var2.int7);
			this.field980 = Coord.method7393(var2.int8);
			this.field981 = var2.int5;
			this.field982 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
			this.field984 = var2.field2259;
			this.field987 = var2.field2315;
			this.field986 = var2.field2313;
			this.field985 = var2.field2302;
			this.field968 = var2.field2314;
		} else {
			this.soundEffectId = -1;
			this.field974 = 0;
			this.field980 = 0;
			this.field981 = 0;
			this.field982 = 0;
			this.soundEffectIds = null;
			this.field984 = ObjectComposition.field2298;
			this.field985 = ObjectComposition.field2263;
			this.field968 = 300;
			this.field987 = ObjectComposition.field2299;
			this.field986 = 300;
		}

		if (var1 != this.soundEffectId) {
			this.field989 = true;
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1812537149"
	)
	void method2293() {
		if (this.stream1 != null) {
			class366.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method2231() {
		if (this.stream2 != null) {
			class366.pcmStreamMixer.removeSubStream(this.stream2);
			this.stream2 = null;
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-45814275"
	)
	void method2242() {
		field990.addFirst(this);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1633299559"
	)
	int method2299() {
		return this.soundEffectId;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-945798593"
	)
	int method2234() {
		return this.y;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "352"
	)
	int method2250() {
		return this.maxY;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1294145359"
	)
	int method2236() {
		return this.maxX;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2006666489"
	)
	int method2287() {
		return this.field973;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "430990942"
	)
	int method2238() {
		return this.x;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1856585365"
	)
	int method2304() {
		return this.field974;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-892658102"
	)
	int method2240() {
		return this.field980;
	}

	@ObfuscatedName("cp")
	public void remove() {
		super.remove();
	}

	public String toString() {
		return super.toString();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1998481877"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}
}
