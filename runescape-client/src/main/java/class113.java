import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
public class class113 {
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = 1572525395
	)
	static int field1483;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ldu;"
	)
	VorbisFloor field1477;
	@ObfuscatedName("at")
	boolean field1482;
	@ObfuscatedName("ag")
	int[] field1478;
	@ObfuscatedName("an")
	int[] field1479;
	@ObfuscatedName("ae")
	boolean[] field1480;

	@ObfuscatedSignature(
		descriptor = "(Ldu;Z[I[I[Z)V"
	)
	class113(VorbisFloor var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
		this.field1477 = var1;
		this.field1482 = var2;
		this.field1478 = var3;
		this.field1479 = var4;
		this.field1480 = var5;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([FII)V",
		garbageValue = "-479020294"
	)
	void method3579(float[] var1, int var2) {
		int var3 = this.field1477.field1300.length;
		VorbisFloor var10000 = this.field1477;
		int var4 = VorbisFloor.field1302[this.field1477.multiplier - 1];
		boolean[] var5 = this.field1480;
		this.field1480[1] = true;
		var5[0] = true;

		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (var6 = 2; var6 < var3; ++var6) {
			var7 = this.field1477.method3140(this.field1478, var6);
			var8 = this.field1477.method3144(this.field1478, var6);
			var9 = this.field1477.method3139(this.field1478[var7], this.field1479[var7], this.field1478[var8], this.field1479[var8], this.field1478[var6]);
			var10 = this.field1479[var6];
			int var11 = var4 - var9;
			int var13 = (var11 < var9 ? var11 : var9) << 1;
			if (var10 != 0) {
				boolean[] var14 = this.field1480;
				this.field1480[var8] = true;
				var14[var7] = true;
				this.field1480[var6] = true;
				if (var10 >= var13) {
					this.field1479[var6] = var11 > var9 ? var9 + (var10 - var9) : var11 + (var9 - var10) - 1;
				} else {
					this.field1479[var6] = (var10 & 1) != 0 ? var9 - (var10 + 1) / 2 : var10 / 2 + var9;
				}
			} else {
				this.field1480[var6] = false;
				this.field1479[var6] = var9;
			}
		}

		this.VarbisFloor_sort(0, var3 - 1);
		var6 = 0;
		var7 = this.field1477.multiplier * this.field1479[0];

		for (var8 = 1; var8 < var3; ++var8) {
			if (this.field1480[var8]) {
				var9 = this.field1478[var8];
				var10 = this.field1477.multiplier * this.field1479[var8];
				this.field1477.method3143(var6, var7, var9, var10, var1, var2);
				if (var9 >= var2) {
					return;
				}

				var6 = var9;
				var7 = var10;
			}
		}

		var10000 = this.field1477;
		float var16 = VorbisFloor.VorbisFloor_decibelStatics[var7];

		for (var9 = var6; var9 < var2; ++var9) {
			var1[var9] *= var16;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-97"
	)
	boolean method3575() {
		return this.field1482;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1001855073"
	)
	@Export("VarbisFloor_sort")
	void VarbisFloor_sort(int var1, int var2) {
		if (var1 < var2) {
			int var3 = var1;
			int var4 = this.field1478[var1];
			int var5 = this.field1479[var1];
			boolean var6 = this.field1480[var1];

			for (int var7 = var1 + 1; var7 <= var2; ++var7) {
				int var8 = this.field1478[var7];
				if (var8 < var4) {
					this.field1478[var3] = var8;
					this.field1479[var3] = this.field1479[var7];
					this.field1480[var3] = this.field1480[var7];
					++var3;
					this.field1478[var7] = this.field1478[var3];
					this.field1479[var7] = this.field1479[var3];
					this.field1480[var7] = this.field1480[var3];
				}
			}

			this.field1478[var3] = var4;
			this.field1479[var3] = var5;
			this.field1480[var3] = var6;
			this.VarbisFloor_sort(var1, var3 - 1);
			this.VarbisFloor_sort(var3 + 1, var2);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[Lmy;",
		garbageValue = "-1591361979"
	)
	static class337[] method3582() {
		return new class337[]{class337.field3848, class337.field3855, class337.field3853, class337.field3851, class337.field3854, class337.field3850, class337.field3849, class337.field3852};
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIZI)V",
		garbageValue = "-1882065613"
	)
	public static void method3574(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (!var0.isEmpty()) {
			class345.field3933.clear();
			class345.field3929.clear();
			if (var5) {
				class151.method3973();
			} else {
				for (int var6 = 0; var6 < class345.midiRequests.size(); ++var6) {
					MidiRequest var7 = (MidiRequest)class345.midiRequests.get(var6);
					if (var7 == null) {
						class345.midiRequests.remove(var6);
						--var6;
					} else if (var7.field4051) {
						if (var7.midiPcmStream.field3948 > 0) {
							--var7.midiPcmStream.field3948;
						}

						var7.midiPcmStream.clear();
						var7.midiPcmStream.method7462();
						var7.midiPcmStream.setPcmStreamVolume(0);
						class345.midiRequests.remove(var6);
						--var6;
					} else {
						var7.field4051 = true;
					}
				}
			}

			class27.method423(var0, var5);
			if (!class345.field3933.isEmpty()) {
				ItemLayer.method5256(var1, var2, var3, var4);
				class345.field3929.add(new AddRequestTask((SongTask)null));
				class345.field3929.add(new class487((SongTask)null, class345.field3927, WidgetFocusInputManager.field3220, class173.field1921));
				ArrayList var9 = new ArrayList();
				var9.add(new class482(new FadeInTask((SongTask)null, 0, true, class345.field3926)));
				if (!class345.midiRequests.isEmpty()) {
					ArrayList var10 = new ArrayList();
					var10.add(new DelayFadeTask(new ConcurrentMidiTask((SongTask)null, var9), class345.field3932));
					ArrayList var8 = class287.method6525();
					var10.add(new DelayFadeTask(new FadeOutTask(new class480((SongTask)null, var8), 0, false, class345.field3931), class345.musicPlayerStatus));
					class345.field3929.add(new ConcurrentMidiTask((SongTask)null, var10));
				} else {
					class345.field3929.add(new DelayFadeTask((SongTask)null, class345.field3932));
					class345.field3929.add(new ConcurrentMidiTask((SongTask)null, var9));
				}

			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1076424721"
	)
	public static int method3583(int var0) {
		return var0 != 0 && var0 != 1 ? -1 : 0;
	}
}
