import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sm")
public class class481 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	final WorldEntityCoord field5037;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -417408189
	)
	int field5038;

	class481() {
		this.field5037 = new WorldEntityCoord();
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "224190195"
	)
	static final void method9355() {
		for (int var0 = 0; var0 < Client.soundEffectCount; ++var0) {
			int var10002 = Client.queuedSoundEffectDelays[var0]--;
			if (Client.queuedSoundEffectDelays[var0] >= -10) {
				SoundEffect var1 = Client.soundEffects[var0];
				if (var1 == null) {
					Object var10000 = null;
					var1 = SoundEffect.readSoundEffect(World.soundEffectsArchive, Client.soundEffectIds[var0], 0);
					if (var1 == null) {
						continue;
					}

					int[] var15 = Client.queuedSoundEffectDelays;
					var15[var0] += var1.calculateDelay();
					Client.soundEffects[var0] = var1;
				}

				if (Client.queuedSoundEffectDelays[var0] < 0) {
					int var2;
					if (Client.soundLocations[var0] != 0) {
						int var3 = (Client.soundLocations[var0] & 255) * 128;
						int var4 = Client.soundLocations[var0] >> 16 & 255;
						int var5 = Math.abs(Coord.method6980(var4) - ModeWhere.localPlayer.x);
						int var6 = Client.soundLocations[var0] >> 8 & 255;
						int var7 = Math.abs(Coord.method6980(var6) - ModeWhere.localPlayer.y);
						int var8 = Math.max(var7 + var5 - 128, 0);
						int var9 = Math.max(((Client.field753[var0] & 31) - 1) * 128, 0);
						if (var8 >= var3) {
							Client.queuedSoundEffectDelays[var0] = -100;
							continue;
						}

						float var10 = var9 < var3 ? Math.min(Math.max((float)(var3 - var8) / (float)(var3 - var9), 0.0F), 1.0F) : 1.0F;
						var2 = (int)(var10 * (float)class544.clientPreferences.getAreaSoundEffectsVolume());
					} else {
						var2 = class544.clientPreferences.getSoundEffectsVolume();
					}

					if (var2 > 0) {
						RawSound var11 = var1.toRawSound().resample(Message.decimator);
						RawPcmStream var12 = RawPcmStream.createRawPcmStream(var11, 100, var2);
						if (var12 != null) {
							var12.setNumLoops(Client.queuedSoundEffectLoops[var0] - 1);
							UserList.pcmStreamMixer.addSubStream(var12);
						}
					}

					Client.queuedSoundEffectDelays[var0] = -100;
				}
			} else {
				--Client.soundEffectCount;

				for (int var13 = var0; var13 < Client.soundEffectCount; ++var13) {
					Client.soundEffectIds[var13] = Client.soundEffectIds[var13 + 1];
					Client.soundEffects[var13] = Client.soundEffects[var13 + 1];
					Client.queuedSoundEffectLoops[var13] = Client.queuedSoundEffectLoops[var13 + 1];
					Client.queuedSoundEffectDelays[var13] = Client.queuedSoundEffectDelays[var13 + 1];
					Client.soundLocations[var13] = Client.soundLocations[var13 + 1];
					Client.field753[var13] = Client.field753[var13 + 1];
				}

				--var0;
			}
		}

		if (Client.playingJingle) {
			boolean var14;
			if (!class333.field3629.isEmpty()) {
				var14 = true;
			} else if (!class333.midiRequests.isEmpty() && class333.midiRequests.get(0) != null && ((MidiRequest)class333.midiRequests.get(0)).midiPcmStream != null) {
				var14 = ((MidiRequest)class333.midiRequests.get(0)).midiPcmStream.isReady();
			} else {
				var14 = false;
			}

			if (!var14) {
				if (class544.clientPreferences.getMusicVolume() != 0 && class153.method3620()) {
					class96.method2709(class544.archive6, class544.clientPreferences.getMusicVolume());
				}

				Client.playingJingle = false;
			}
		}

	}
}
