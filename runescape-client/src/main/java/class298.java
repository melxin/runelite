import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
public class class298 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	static final class298 field3240;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	static final class298 field3241;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -328264079
	)
	@Export("value")
	final int value;

	static {
		field3240 = new class298(0);
		field3241 = new class298(1);
	}

	class298(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-74"
	)
	static final void method6238() {
		int[] var0 = Client.playerUpdateManager.playerIndices;
		Iterator var1 = Client.worldViewManager.iterator();

		while (var1.hasNext()) {
			WorldView var2 = (WorldView)var1.next();

			int var3;
			for (var3 = 0; var3 < Client.playerUpdateManager.playerCount; ++var3) {
				Player var6 = var2.players[var0[var3]];
				if (var6 != null && var6.overheadTextCyclesRemaining > 0) {
					--var6.overheadTextCyclesRemaining;
					if (var6.overheadTextCyclesRemaining == 0) {
						var6.overheadText = null;
					}
				}
			}

			for (var3 = 0; var3 < var2.npcCount; ++var3) {
				int var4 = var2.npcIndices[var3];
				NPC var5 = var2.npcs[var4];
				if (var5 != null && var5.overheadTextCyclesRemaining > 0) {
					--var5.overheadTextCyclesRemaining;
					if (var5.overheadTextCyclesRemaining == 0) {
						var5.overheadText = null;
					}
				}
			}
		}

	}
}
