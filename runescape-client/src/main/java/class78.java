import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
public final class class78 extends TileItem {
	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	static Archive field996;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1772812479
	)
	int field982;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -2006813189
	)
	int field1007;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 54788331
	)
	int field983;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1416635687
	)
	int field997;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1173903731
	)
	int field985;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 530315563
	)
	int field1000;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1378628045
	)
	int field987;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 459866531
	)
	int field988;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1037752795
	)
	int field989;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -934038291
	)
	int field990;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 829282721
	)
	int field991;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1749876389
	)
	int field992;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -2099677945
	)
	int field1003;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1124979031
	)
	int field994;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1387578407
	)
	int field995;
	@ObfuscatedName("av")
	boolean field1006;
	@ObfuscatedName("ar")
	double field981;
	@ObfuscatedName("ag")
	double field998;
	@ObfuscatedName("az")
	double field999;
	@ObfuscatedName("am")
	double field1010;
	@ObfuscatedName("aq")
	double field1001;
	@ObfuscatedName("aw")
	double field1002;
	@ObfuscatedName("an")
	double field1008;
	@ObfuscatedName("at")
	double field1004;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 279973185
	)
	int field1005;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -2139517277
	)
	int field993;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	SequenceDefinition field984;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1500047213
	)
	int field986;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1666801517
	)
	int field1009;

	class78(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.field1006 = false;
		this.field986 = 0;
		this.field1009 = 0;
		this.field982 = var1;
		this.field1007 = var2;
		this.field983 = var3;
		this.field997 = var4;
		this.field985 = var5;
		this.field990 = var6;
		this.field991 = var7;
		this.field992 = var8;
		this.field1003 = var9;
		this.field995 = var10;
		this.field1000 = var11;
		this.field1006 = false;
		int var12 = class176.method3761(this.field982).sequence;
		if (var12 != -1) {
			this.field984 = WorldMapData_1.SequenceDefinition_get(var12);
		} else {
			this.field984 = null;
		}

	}

	class78(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12);
		this.field994 = var10;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-74512933"
	)
	final void method2300(int var1, int var2, int var3, int var4) {
		this.field987 = var1;
		this.field988 = var2;
		this.field989 = var3;
		double var5;
		if (!this.field1006) {
			var5 = (double)(this.field987 - this.field983);
			double var7 = (double)(this.field988 - this.field997);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			this.field981 = (double)this.field1003 * var5 / var9 + (double)this.field983;
			this.field998 = (double)this.field997 + (double)this.field1003 * var7 / var9;
			this.field999 = (double)this.field985;
		}

		var5 = (double)(this.field991 + 1 - var4);
		this.field1010 = ((double)this.field987 - this.field981) / var5;
		this.field1001 = ((double)this.field988 - this.field998) / var5;
		this.field1002 = Math.sqrt(this.field1010 * this.field1010 + this.field1001 * this.field1001);
		if (!this.field1006) {
			this.field1008 = -this.field1002 * Math.tan((double)this.field992 * 0.02454369D);
		}

		this.field1004 = ((double)this.field989 - this.field999 - this.field1008 * var5) * 2.0D / (var5 * var5);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljf;",
		garbageValue = "-516720946"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = class176.method3761(this.field982);
		Model var2 = var1.getModel(this.field986);
		if (var2 == null) {
			return null;
		} else {
			var2.rotateZ(this.field993);
			return var2;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-87"
	)
	final void method2297(int var1) {
		this.field1006 = true;
		this.field981 += this.field1010 * (double)var1;
		this.field998 += (double)var1 * this.field1001;
		this.field999 += this.field1008 * (double)var1 + (double)var1 * 0.5D * this.field1004 * (double)var1;
		this.field1008 += this.field1004 * (double)var1;
		this.field1005 = (int)(Math.atan2(this.field1010, this.field1001) * 325.949D) + 1024 & 2047;
		this.field993 = (int)(Math.atan2(this.field1008, this.field1002) * 325.949D) & 2047;
		if (this.field984 != null) {
			if (!this.field984.isCachedModelIdSet()) {
				this.field1009 += var1;

				while (true) {
					do {
						do {
							if (this.field1009 <= this.field984.frameLengths[this.field986]) {
								return;
							}

							this.field1009 -= this.field984.frameLengths[this.field986];
							++this.field986;
						} while(this.field986 < this.field984.frameIds.length);

						this.field986 -= this.field984.frameCount;
					} while(this.field986 >= 0 && this.field986 < this.field984.frameIds.length);

					this.field986 = 0;
				}
			} else {
				this.field986 += var1;
				int var2 = this.field984.getMayaAnimFrame();
				if (this.field986 >= var2) {
					this.field986 = var2 - this.field984.frameCount;
				}
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)Ldy;",
		garbageValue = "-1896183295"
	)
	@Export("getScript")
	static Script getScript(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16));
		if (var2 != null) {
			return var2;
		} else {
			String var3 = String.valueOf(var0);
			int var4 = TextureProvider.archive12.getGroupId(var3);
			if (var4 == -1) {
				return null;
			} else {
				byte[] var5 = TextureProvider.archive12.takeFileFlat(var4);
				if (var5 != null) {
					if (var5.length <= 1) {
						return null;
					}

					var2 = class59.newScript(var5);
					if (var2 != null) {
						Script.Script_cached.put(var2, (long)(var0 << 16));
						return var2;
					}
				}

				return null;
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1620007148"
	)
	public static void method2302(int var0, int var1, int var2, int var3) {
		if (class335.midiRequests.size() > 1 && class335.midiRequests.get(0) != null && ((MidiRequest)class335.midiRequests.get(0)).midiPcmStream.isReady() && class335.midiRequests.get(1) != null && ((MidiRequest)class335.midiRequests.get(1)).midiPcmStream.isReady()) {
			ClientPreferences.method2821(var0, var1, var2, var3);
			class335.field3694.add(new SwapSongTask((SongTask)null));
			ArrayList var4 = new ArrayList();
			var4.add(new DelayFadeTask(new FadeInTask((SongTask)null, 1, false, class335.field3684), class335.field3690));
			var4.add(new DelayFadeTask(new FadeOutTask((SongTask)null, 0, false, class335.field3693), class335.musicPlayerStatus));
			class335.field3694.add(new ConcurrentMidiTask((SongTask)null, var4));
			if (class335.field3689.get(0) != null && class335.field3689.get(1) != null) {
				MidiRequest var5 = (MidiRequest)class335.field3689.get(0);
				class335.field3689.set(0, class335.midiRequests.get(1));
				class335.field3689.set(1, var5);
			}
		}

	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-979894773"
	)
	public static final void method2303(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
			if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
				Client.field729[var4] = true;
			}
		}

	}
}
