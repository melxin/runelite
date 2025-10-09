import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kv")
@Implements("Clock")
public abstract class Clock {
	Clock() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "125"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "1"
	)
	public static void method6092(int var0, int var1) {
		class338.musicPlayerStatus = var0;
		class338.field3899 = var1;
		class338.field3896 = 0;
		class338.field3901 = 0;
		class338.field3891.clear();
		class338.field3897.clear();
		if (class338.midiRequests.isEmpty() || var0 == 0 && var1 == 0) {
			Iterator var2 = class338.midiRequests.iterator();

			while (true) {
				MidiRequest var10;
				do {
					if (!var2.hasNext()) {
						class338.midiRequests.clear();
						return;
					}

					var10 = (MidiRequest)var2.next();
				} while(var10 == null);

				var10.midiPcmStream.clear();
				var10.midiPcmStream.method7225();
				var10.midiPcmStream.setPcmStreamVolume(0);
				var10.midiPcmStream.field3910 = 0;
				int var4 = var10.musicTrackGroupId;
				int var5 = var10.musicTrackFileId;
				Iterator var6 = class338.field3892.iterator();

				while (var6.hasNext()) {
					class344 var7 = (class344)var6.next();
					var7.vmethod7348(var4, var5);
				}
			}
		} else {
			class338.field3897.add(new DelayFadeTask((SongTask)null, class338.musicPlayerStatus));
			class338.field3897.add(new FadeOutTask((SongTask)null, 0, false, class338.field3899));
			ArrayList var3 = new ArrayList();
			Iterator var8 = class338.midiRequests.iterator();

			while (var8.hasNext()) {
				MidiRequest var9 = (MidiRequest)var8.next();
				var3.add(var9);
			}

			class338.field3897.add(new class470((SongTask)null, var3));
		}
	}
}
