import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sy")
public class class480 extends SongTask {
	@ObfuscatedName("ry")
	@ObfuscatedGetter(
		intValue = -750344411
	)
	static int field5366;
	@ObfuscatedName("av")
	ArrayList field5365;

	@ObfuscatedSignature(
		descriptor = "(Lsz;Ljava/util/ArrayList;)V"
	)
	public class480(SongTask var1, ArrayList var2) {
		super(var1);
		super.field5378 = "ClearRequestTask";
		this.field5365 = var2;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "111"
	)
	public boolean vmethod9974() {
		if (this.field5365.isEmpty()) {
			return true;
		} else {
			Iterator var1 = this.field5365.iterator();

			while (var1.hasNext()) {
				MidiRequest var2 = (MidiRequest)var1.next();

				try {
					if (class345.midiRequests.contains(var2)) {
						if (var2 == null) {
							class345.midiRequests.remove(var2);
						} else {
							if (var2.midiPcmStream.field3948 > 0) {
								--var2.midiPcmStream.field3948;
							}

							if (var2.midiPcmStream.field3948 == 0) {
								var2.midiPcmStream.clear();
								var2.midiPcmStream.method7462();
								var2.midiPcmStream.setPcmStreamVolume(0);
							}

							int var3 = var2.musicTrackGroupId;
							int var4 = var2.musicTrackFileId;
							Iterator var5 = class345.field3925.iterator();

							while (var5.hasNext()) {
								class351 var6 = (class351)var5.next();
								var6.vmethod7564(var3, var4);
							}

							class345.midiRequests.remove(var2);
						}
					}
				} catch (Exception var8) {
					PlayerType.RunException_sendStackTrace((String)null, var8);
					this.method9950(var8.getMessage());
					class345.midiRequests.clear();
					return true;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "0"
	)
	static final boolean method9927(int var0, int var1) {
		ObjectComposition var2 = AsyncHttpResponse.getObjectDefinition(var0);
		if (var1 == 11) {
			var1 = 10;
		}

		if (var1 >= 5 && var1 <= 8) {
			var1 = 4;
		}

		return var2.method4821(var1);
	}
}
