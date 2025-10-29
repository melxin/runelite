import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ln")
public class class287 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lxa;Ljava/lang/String;I)I",
		garbageValue = "-293496581"
	)
	public static int method6523(Buffer var0, String var1) {
		int var2 = var0.offset * 2108391709;
		byte[] var3 = class300.method6917(var1);
		var0.writeSmartByteShort(var3.length);
		var0.offset += class365.huffman.compress(var3, 0, var3.length, var0.array, var0.offset * 2108391709) * 1741769013;
		return var0.offset * 2108391709 - var2;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "38"
	)
	static ArrayList method6525() {
		ArrayList var0 = new ArrayList();
		Iterator var1 = class345.midiRequests.iterator();

		while (var1.hasNext()) {
			MidiRequest var2 = (MidiRequest)var1.next();
			var0.add(var2);
		}

		return var0;
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "755216306"
	)
	static final void method6521() {
		int[] var0 = Client.playerUpdateManager.playerIndices;
		Iterator var1 = Client.worldViewManager.iterator();

		while (var1.hasNext()) {
			WorldView var2 = (WorldView)var1.next();

			for (int var3 = 0; var3 < Client.playerUpdateManager.playerCount; ++var3) {
				Player var4 = (Player)var2.players.get((long)var0[var3]);
				if (var4 != null && var4.overheadTextCyclesRemaining > 0) {
					--var4.overheadTextCyclesRemaining;
					if (var4.overheadTextCyclesRemaining == 0) {
						var4.overheadText = null;
					}
				}
			}

			Iterator var5 = var2.npcs.iterator();

			while (var5.hasNext()) {
				NPC var6 = (NPC)var5.next();
				if (var6 != null && var6.overheadTextCyclesRemaining > 0) {
					--var6.overheadTextCyclesRemaining;
					if (var6.overheadTextCyclesRemaining == 0) {
						var6.overheadText = null;
					}
				}
			}
		}

	}
}
