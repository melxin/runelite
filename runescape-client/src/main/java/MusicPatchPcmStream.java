import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nj")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lbe;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Lmp;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque();
		this.mixer = new PcmStreamMixer();
		this.superStream = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lnm;[IIIIB)V",
		garbageValue = "125"
	)
	void method6810(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field3714[var1.field3774] & 4) != 0 && var1.field3788 < 0) {
			int var6 = this.superStream.field3697[var1.field3774] / PcmPlayer.field284;

			while (true) {
				int var7 = (var6 + 1048575 - var1.field3789) / var6;
				if (var7 > var4) {
					var1.field3789 += var4 * var6;
					break;
				}

				var1.stream.fill(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.field3789 += var6 * var7 - 1048576;
				int var8 = PcmPlayer.field284 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream;
				if (this.superStream.field3724[var1.field3774] == 0) {
					var1.stream = RawPcmStream.method866(var1.rawSound, var10.method881(), var10.method872(), var10.method966());
				} else {
					var1.stream = RawPcmStream.method866(var1.rawSound, var10.method881(), 0, var10.method966());
					this.superStream.method6620(var1, var1.table.field3757[var1.field3779] < 0);
					var1.stream.method904(var8, var10.method872());
				}

				if (var1.table.field3757[var1.field3779] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var10.method879(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method883()) {
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lnm;IB)V",
		garbageValue = "14"
	)
	void method6805(MusicPatchNode var1, int var2) {
		if ((this.superStream.field3714[var1.field3774] & 4) != 0 && var1.field3788 < 0) {
			int var3 = this.superStream.field3697[var1.field3774] / PcmPlayer.field284;
			int var4 = (var3 + 1048575 - var1.field3789) / var3;
			var1.field3789 = var3 * var2 + var1.field3789 & 1048575;
			if (var4 <= var2) {
				if (this.superStream.field3724[var1.field3774] == 0) {
					var1.stream = RawPcmStream.method866(var1.rawSound, var1.stream.method881(), var1.stream.method872(), var1.stream.method966());
				} else {
					var1.stream = RawPcmStream.method866(var1.rawSound, var1.stream.method881(), 0, var1.stream.method966());
					this.superStream.method6620(var1, var1.table.field3757[var1.field3779] < 0);
				}

				if (var1.table.field3757[var1.field3779] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field3789 / var3;
			}
		}

		var1.stream.skip(var2);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()Lbr;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		MusicPatchNode var1 = (MusicPatchNode)this.queue.last();
		if (var1 == null) {
			return null;
		} else {
			return (PcmStream)(var1.stream != null ? var1.stream : this.nextSubStream());
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Lbr;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		MusicPatchNode var1;
		do {
			var1 = (MusicPatchNode)this.queue.previous();
			if (var1 == null) {
				return null;
			}
		} while(var1.stream == null);

		return var1.stream;
	}

	@ObfuscatedName("af")
	protected int vmethod6801() {
		return 0;
	}

	@ObfuscatedName("aa")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method6642(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field3793) {
						this.method6810(var6, var1, var4, var5, var4 + var5);
						var6.field3793 -= var5;
						break;
					}

					this.method6810(var6, var1, var4, var6.field3793, var4 + var5);
					var4 += var6.field3793;
					var5 -= var6.field3793;
				} while(!this.superStream.method6643(var6, var1, var4, var5));
			}
		}

	}

	@ObfuscatedName("ae")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1);

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method6642(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field3793) {
						this.method6805(var3, var2);
						var3.field3793 -= var2;
						break;
					}

					this.method6805(var3, var3.field3793);
					var2 -= var3.field3793;
				} while(!this.superStream.method6643(var3, (int[])null, 0, var2));
			}
		}

	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(Liw;IIIZB)V",
		garbageValue = "13"
	)
	static void method6807(SequenceDefinition var0, int var1, int var2, int var3, boolean var4) {
		if (Client.soundEffectCount < 50) {
			if (var0.field2357 != null && var0.field2357.containsKey(var1)) {
				ArrayList var5 = (ArrayList)var0.field2357.get(var1);
				if (!var5.isEmpty()) {
					int var6 = 0;
					int var8;
					if (var5.size() > 1) {
						int var7 = 1 + (int)(Math.random() * 100.0D);
						var8 = 0;

						for (Iterator var9 = var5.iterator(); var9.hasNext(); ++var6) {
							class208 var10 = (class208)var9.next();
							int var11 = var8;
							var8 += var10.field2215;
							if (var11 <= var7 && var7 < var8) {
								break;
							}
						}

						if (var6 >= var5.size()) {
							return;
						}
					}

					class208 var15 = (class208)var5.get(var6);
					var8 = var15.field2217 & 31;
					if ((var8 <= 0 || AbstractWorldMapIcon.clientPreferences.getAreaSoundEffectsVolume() != 0) && (var8 != 0 || AbstractWorldMapIcon.clientPreferences.getSoundEffectsVolume() != 0)) {
						if (var15 != null) {
							if (var15.field2217 == 0) {
								if (!var4) {
									return;
								}

								Client.soundLocations[Client.soundEffectCount] = 0;
							} else {
								int var13 = (var2 - 64) / 128;
								int var14 = (var3 - 64) / 128;
								Client.soundLocations[Client.soundEffectCount] = (var14 << 8) + (var13 << 16) + var15.field2217;
							}

							Client.soundEffectIds[Client.soundEffectCount] = var15.field2218;
							Client.queuedSoundEffectLoops[Client.soundEffectCount] = var15.field2216;
							Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0;
							Client.soundEffects[Client.soundEffectCount] = null;
							Client.field772[Client.soundEffectCount] = var15.field2214;
							++Client.soundEffectCount;
						}

					}
				}
			}
		}
	}
}
