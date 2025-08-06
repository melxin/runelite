import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sb")
public class class470 extends SongTask {
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = -1120464947
	)
	static int field5181;

	@ObfuscatedSignature(
		descriptor = "(Lsj;)V"
	)
	public class470(SongTask var1) {
		super(var1);
		super.field5191 = "StartSongTask";
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1329200530"
	)
	public boolean vmethod9672() {
		Iterator var1 = class337.midiRequests.iterator();

		while (var1.hasNext()) {
			MidiRequest var2 = (MidiRequest)var1.next();
			if (var2 != null && !var2.field3908 && var2.midiPcmStream != null) {
				try {
					var2.midiPcmStream.method7134();
					var2.midiPcmStream.setPcmStreamVolume(0);
					if (var2.field3920 != null) {
						var2.midiPcmStream.setMusicTrack(var2.field3920, var2.musicTrackBoolean);
					}

					var2.field3920 = null;
					var2.field3919 = null;
					var2.musicTrackArchive = null;
					var2.field3908 = true;
				} catch (Exception var4) {
					class559.RunException_sendStackTrace((String)null, var4);
					this.method9654(var4.getMessage());
					return true;
				}
			}
		}

		super.field5188 = true;
		return true;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "14"
	)
	@Export("ByteArrayPool_release")
	public static void ByteArrayPool_release(byte[] var0) {
		synchronized(ByteArrayPool.field5210) {
			if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field5212) {
				ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0;
			} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field5213) {
				ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0;
			} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field5214) {
				ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0;
			} else if (var0.length == 30000 && ByteArrayPool.field5206 < ByteArrayPool.field5215) {
				ByteArrayPool.field5219[++ByteArrayPool.field5206 - 1] = var0;
			} else {
				if (WorldMapData_1.ByteArrayPool_arrays != null) {
					for (int var2 = 0; var2 < class566.ByteArrayPool_alternativeSizes.length; ++var2) {
						if (var0.length == class566.ByteArrayPool_alternativeSizes[var2] && FriendSystem.ByteArrayPool_altSizeArrayCounts[var2] < WorldMapData_1.ByteArrayPool_arrays[var2].length) {
							WorldMapData_1.ByteArrayPool_arrays[var2][FriendSystem.ByteArrayPool_altSizeArrayCounts[var2]++] = var0;
							return;
						}
					}
				}

			}
		}
	}
}
