import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	static final NodeDeque field1005;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	static final class337 field993;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1159382011
	)
	@Export("plane")
	final int plane;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 406356159
	)
	@Export("x")
	final int x;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1808638607
	)
	@Export("y")
	final int y;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1038091405
	)
	@Export("maxX")
	final int maxX;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -754638065
	)
	@Export("maxY")
	final int maxY;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1685640429
	)
	final int field988;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1587625799
	)
	int field989;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1355258679
	)
	int field1000;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("obj")
	final ObjectComposition obj;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 2037476169
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("am")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 117159047
	)
	int field1006;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1832214017
	)
	int field997;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 59275547
	)
	int field998;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	class337 field992;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	class337 field999;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1676447907
	)
	int field1001;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	class337 field1002;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1192202215
	)
	int field1003;
	@ObfuscatedName("ab")
	boolean field1004;

	static {
		field1005 = new NodeDeque();
		field993 = class337.field3853;
	}

	@ObfuscatedSignature(
		descriptor = "(IIIIILib;)V"
	)
	ObjectSound(int var1, int var2, int var3, int var4, int var5, ObjectComposition var6) {
		this.field1004 = false;
		this.plane = var1;
		this.x = var2;
		this.y = Coord.method7417(var3);
		this.maxX = Coord.method7417(var4);
		int var7 = var6.sizeX;
		int var8 = var6.sizeY;
		if (var5 == 1 || var5 == 3) {
			var7 = var6.sizeY;
			var8 = var6.sizeX;
		}

		this.maxY = Coord.method7417(var3 + var7);
		this.field988 = Coord.method7417(var8 + var4);
		this.soundEffectId = var6.ambientSoundId;
		this.field989 = Coord.method7417(var6.int7);
		this.field1000 = Math.max(Coord.method7417(var6.int8 - 1), 0);
		this.field1006 = var6.int5;
		this.field997 = var6.int6;
		this.soundEffectIds = var6.soundEffectIds;
		if (var6.transforms != null) {
			this.obj = var6;
			this.set();
		} else {
			this.obj = null;
		}

		if (this.soundEffectIds != null) {
			this.field998 = class255.method5805(this.field1006, this.field997);
		}

		this.field992 = var6.field2361;
		this.field1002 = var6.field2364;
		this.field1003 = var6.field2362;
		this.field999 = var6.field2326;
		this.field1001 = var6.field2363;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-59"
	)
	void method2271() {
		this.method2286(0, this.field1001, this.field999);
		this.method2244(0, this.field1001, this.field999);
		this.method2262();
		this.method2246();
		if (DynamicObject.method2007(this.stream1) == 0 && DynamicObject.method2007(this.stream2) == 0) {
			this.method2247();
			this.method2309();
			this.remove();
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltj;IIIIB)V",
		garbageValue = "-49"
	)
	void method2242(WorldEntity var1, int var2, int var3, int var4, int var5) {
		int var6 = class36.clientPreferences.getAreaSoundEffectsVolume();
		if (this.field1004) {
			this.method2286(0, this.field1001, this.field999);
			this.method2244(0, this.field1001, this.field999);
			this.method2262();
			this.method2246();
			if (DynamicObject.method2007(this.stream1) == 0 && DynamicObject.method2007(this.stream2) == 0) {
				this.method2247();
				this.method2309();
				this.field1004 = false;
			}

		} else if (this.soundEffectId != -1 || this.soundEffectIds != null) {
			WorldEntity var7 = Client.worldViewManager.method2346(this.plane);
			if (var6 != 0 && Clock.method6080(var1, var7, var2, this.x)) {
				this.method2262();
				this.method2246();
				WorldView var10 = Client.worldViewManager.getWorldView(this.plane);
				class452 var11 = DynamicObject.method2010(var10, this.y, this.maxX);
				class452 var12 = DynamicObject.method2010(var10, this.maxY, this.field988);
				int var13 = (int)var11.field5175;
				int var14 = (int)var11.field5169;
				int var15 = (int)var12.field5175;
				int var16 = (int)var12.field5169;
				var11.method8992();
				var12.method8992();
				int var17 = class394.method8225(var3, var4, var13, var14, var15, var16);
				var17 = Math.max(var17 - 64, 0);
				double var19;
				if (this.field1000 < this.field989) {
					var19 = class264.method5958((long)(this.field989 - var17), (long)(this.field989 - this.field1000), this.field992);
				} else {
					var19 = 1.0D;
				}

				var13 = (int)((double)var6 * var19);
				var14 = DynamicObject.method2007(this.stream1);
				var15 = DynamicObject.method2007(this.stream2);
				if (var14 < var13) {
					this.method2286(var13, this.field1003, this.field1002);
				} else if (var14 > var13) {
					this.method2286(var13, this.field1001, this.field999);
				}

				if (var15 < var13) {
					this.method2244(var13, this.field1003, this.field1002);
				} else if (var15 > var13) {
					this.method2244(var13, this.field1001, this.field999);
				}

				if (this.stream1 != null) {
					this.method2262();
				} else if (this.soundEffectId >= 0 && var13 > 0) {
					this.method2291(this.soundEffectId, 0);
				}

				if (this.stream2 != null) {
					this.method2246();
				} else if (this.soundEffectIds != null && (this.field998 -= var5) <= 0 && var13 > 0) {
					this.method2251(this.soundEffectIds, var13);
					this.method2244(var13, this.field1003, this.field1002);
					this.method2246();
				}

			} else {
				this.method2286(0, 150, field993);
				this.method2244(0, 150, field993);
				this.method2262();
				this.method2246();
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IILmx;B)V",
		garbageValue = "7"
	)
	void method2286(int var1, int var2, class337 var3) {
		if (this.stream1 != null && this.stream1.field1409 != var1) {
			this.stream1.field1392 = this.stream1.method3175();
			this.stream1.field1393 = class189.method4284();
			this.stream1.field1409 = var1;
			RawPcmStream var4 = this.stream1;
			int var6 = Math.abs(this.stream1.field1392 - this.stream1.field1409);
			int var7 = class36.clientPreferences.getAreaSoundEffectsVolume();
			int var5;
			if (var6 >= var7) {
				var5 = var2;
			} else {
				var5 = (int)((float)var2 * ((float)var6 / (float)var7));
			}

			var4.field1403 = var5;
			this.stream1.field1405 = var3;
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IILmx;S)V",
		garbageValue = "10686"
	)
	void method2244(int var1, int var2, class337 var3) {
		if (this.stream2 != null && this.stream2.field1409 != var1) {
			this.stream2.field1392 = this.stream2.method3175();
			this.stream2.field1393 = class189.method4284();
			int var5 = Math.abs(this.stream2.field1392 - var1);
			int var6 = class36.clientPreferences.getAreaSoundEffectsVolume();
			int var4;
			if (var5 >= var6) {
				var4 = var2;
			} else {
				var4 = (int)((float)var2 * ((float)var5 / (float)var6));
			}

			this.stream2.field1403 = var4;
			this.stream2.field1409 = var1;
			this.stream2.field1405 = var3;
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "13"
	)
	void method2262() {
		if (this.stream1 != null) {
			int var1 = this.stream1.method3175();
			long var2 = class189.method4284();
			long var4 = var2 - this.stream1.field1393;
			int var7 = this.stream1.field1392;
			int var8 = this.stream1.field1409;
			class337 var9 = this.stream1.field1405;
			int var10 = this.stream1.field1403;
			int var6;
			if (var1 == var8) {
				var6 = var1;
			} else {
				int var11;
				double var12;
				if (var1 > var8) {
					var12 = 1.0D - class264.method5958(var4, (long)var10, var9);
					var11 = var8 + (int)((double)(var7 - var8) * var12);
				} else {
					var12 = class264.method5958(var4, (long)var10, var9);
					var11 = var7 + (int)(var12 * (double)(var8 - var7));
				}

				var6 = var11;
			}

			if (var1 != var6) {
				this.stream1.method3282(var6);
			}
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1965504945"
	)
	void method2246() {
		if (this.stream2 != null) {
			int var1 = this.stream2.method3175();
			long var2 = class189.method4284();
			long var4 = var2 - this.stream2.field1393;
			int var7 = this.stream2.field1392;
			int var8 = this.stream2.field1409;
			class337 var9 = this.stream2.field1405;
			int var10 = this.stream2.field1403;
			int var6;
			if (var8 == var1) {
				var6 = var1;
			} else {
				int var11;
				double var12;
				if (var1 > var8) {
					var12 = 1.0D - class264.method5958(var4, (long)var10, var9);
					var11 = var8 + (int)((double)(var7 - var8) * var12);
				} else {
					var12 = class264.method5958(var4, (long)var10, var9);
					var11 = var7 + (int)(var12 * (double)(var8 - var7));
				}

				var6 = var11;
			}

			if (var6 != var1) {
				this.stream2.method3282(var6);
			}

			if (!this.stream2.hasNext()) {
				this.stream2 = null;
			}
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-101"
	)
	void method2291(int var1, int var2) {
		int var3 = class115.field1514.getGroupFileCount(var1) - 1;
		SoundEffect var4 = SoundEffect.readSoundEffect(class115.field1514, var1, var3);
		if (var4 != null) {
			RawSound var5 = var4.method3003(class36.clientPreferences.method2586());
			RawPcmStream var6 = RawPcmStream.createRawPcmStream(var5, 100, var2);
			if (var6 == null) {
				return;
			}

			var6.setNumLoops(-1);
			class28.pcmStreamMixer.addSubStream(var6);
			this.stream1 = var6;
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([III)V",
		garbageValue = "742857566"
	)
	void method2251(int[] var1, int var2) {
		int var3 = var1[(int)(Math.random() * (double)var1.length)];
		int var4 = class115.field1514.getGroupFileCount(var3) - 1;
		SoundEffect var5 = SoundEffect.readSoundEffect(class115.field1514, var3, var4);
		if (var5 != null) {
			RawSound var6 = var5.method3003(class36.clientPreferences.method2586());
			RawPcmStream var7 = RawPcmStream.createRawPcmStream(var6, 100, var2);
			if (var7 == null) {
				return;
			}

			var7.setNumLoops(0);
			class28.pcmStreamMixer.addSubStream(var7);
			var7.method3155();
			this.stream2 = var7;
			this.field998 = class255.method5805(this.field1006, this.field997);
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2074850031"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field989 = Coord.method7417(var2.int7);
			this.field1000 = Coord.method7417(var2.int8);
			this.field1006 = var2.int5;
			this.field997 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
			this.field992 = var2.field2361;
			this.field1002 = var2.field2364;
			this.field1003 = var2.field2362;
			this.field999 = var2.field2326;
			this.field1001 = var2.field2363;
		} else {
			this.soundEffectId = -1;
			this.field989 = 0;
			this.field1000 = 0;
			this.field1006 = 0;
			this.field997 = 0;
			this.soundEffectIds = null;
			this.field992 = ObjectComposition.field2309;
			this.field999 = ObjectComposition.field2313;
			this.field1001 = 300;
			this.field1002 = ObjectComposition.field2345;
			this.field1003 = 300;
		}

		if (var1 != this.soundEffectId) {
			this.field1004 = true;
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "198"
	)
	void method2247() {
		if (this.stream1 != null) {
			class28.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method2309() {
		if (this.stream2 != null) {
			class28.pcmStreamMixer.removeSubStream(this.stream2);
			this.stream2 = null;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "52"
	)
	void method2252() {
		field1005.addFirst(this);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-828185534"
	)
	int method2290() {
		return this.soundEffectId;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-60"
	)
	int method2254() {
		return this.y;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1392783122"
	)
	int method2255() {
		return this.maxY;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "47"
	)
	int method2317() {
		return this.maxX;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "8"
	)
	int method2257() {
		return this.field988;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-393305721"
	)
	int method2260() {
		return this.x;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	int method2259() {
		return this.field989;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "72"
	)
	int method2300() {
		return this.field1000;
	}

	@ObfuscatedName("cv")
	@Export("remove")
	public void remove() {
		super.remove();
	}

	public String toString() {
		return super.toString();
	}

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(Ldr;IIIB)V",
		garbageValue = "14"
	)
	@Export("updateItemPile2")
	static final void updateItemPile2(WorldView var0, int var1, int var2, int var3) {
		NodeDeque var4 = var0.groundItems[var1][var2][var3];
		if (var4 == null) {
			var0.scene.removeGroundItemPile(var1, var2, var3);
		} else {
			long var5 = -99999999L;
			TileItem var7 = null;

			TileItem var8;
			for (var8 = (TileItem)var4.last(); var8 != null; var8 = (TileItem)var4.previous()) {
				ItemComposition var9 = AttackOption.ItemDefinition_get(var8.id);
				long var13 = (long)var9.price;
				if (var9.isStackable == 1) {
					var13 *= var8.quantity < Integer.MAX_VALUE ? (long)(var8.quantity + 1) : (long)var8.quantity;
				}

				if (var13 > var5) {
					var5 = var13;
					var7 = var8;
				}
			}

			if (var7 == null) {
				var0.scene.removeGroundItemPile(var1, var2, var3);
			} else {
				var4.addLast(var7);
				TileItem var15 = null;
				TileItem var10 = null;

				for (var8 = (TileItem)var4.last(); var8 != null; var8 = (TileItem)var4.previous()) {
					if (var8.id != var7.id) {
						if (var15 == null) {
							var15 = var8;
						}

						if (var15.id != var8.id && var10 == null) {
							var10 = var8;
						}
					}
				}

				long var11 = UserComparator8.calculateTag(var1, var2, var3, 3, false, 0, var0.id);
				var0.scene.newGroundItemPile(var1, var2, var3, JagNetThread.method8434(var0, Coord.method7416(var2), Coord.method7416(var3), var1), var7, var11, var15, var10);
			}
		}
	}
}
