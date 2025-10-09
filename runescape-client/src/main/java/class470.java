import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ss")
public class class470 extends SongTask {
	@ObfuscatedName("ab")
	ArrayList field5338;

	@ObfuscatedSignature(
		descriptor = "(Lsw;Ljava/util/ArrayList;)V"
	)
	public class470(SongTask var1, ArrayList var2) {
		super(var1);
		super.field5350 = "ClearRequestTask";
		this.field5338 = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1369867803"
	)
	public boolean vmethod9763() {
		if (this.field5338.isEmpty()) {
			return true;
		} else {
			Iterator var1 = this.field5338.iterator();

			while (var1.hasNext()) {
				MidiRequest var2 = (MidiRequest)var1.next();

				try {
					if (class338.midiRequests.contains(var2)) {
						if (var2 == null) {
							class338.midiRequests.remove(var2);
						} else {
							if (var2.midiPcmStream.field3910 > 0) {
								--var2.midiPcmStream.field3910;
							}

							if (var2.midiPcmStream.field3910 == 0) {
								var2.midiPcmStream.clear();
								var2.midiPcmStream.method7225();
								var2.midiPcmStream.setPcmStreamVolume(0);
							}

							class163.method4069(var2.musicTrackGroupId, var2.musicTrackFileId);
							class338.midiRequests.remove(var2);
						}
					}
				} catch (Exception var4) {
					ArchiveDiskActionHandler.RunException_sendStackTrace((String)null, var4);
					this.method9741(var4.getMessage());
					class338.midiRequests.clear();
					return true;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ltl;B)I",
		garbageValue = "-94"
	)
	public static int method9706(DynamicArray var0) {
		IntHashTable.method9896(var0);
		byte var1 = 0;
		int var2 = var0.method10433();
		int var3 = -1;
		int var8;
		if (var0.field5571 == class572.field5879) {
			int[] var4 = var0.method10430();

			for (var8 = var1; var8 < var2; ++var8) {
				if (var3 == -1 || var4[var8] < var4[var3]) {
					var3 = var8;
				}
			}
		} else if (var0.field5571 == class572.field5878) {
			long[] var9 = var0.method10431();

			for (var8 = var1; var8 < var2; ++var8) {
				if (var3 == -1 || var9[var8] < var9[var3]) {
					var3 = var8;
				}
			}
		} else if (var0.field5571 == class572.field5877) {
			String var10 = null;
			Object[] var5 = var0.method10428();

			for (int var6 = var1; var6 < var2; ++var6) {
				String var7 = (String)var5[var6];
				if (var3 == -1 || var7 != null && var7.compareTo(var10) < 0) {
					var3 = var6;
					var10 = var7;
				}
			}
		}

		return var3;
	}
}
