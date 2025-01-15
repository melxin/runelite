import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
public class class257 extends DualNode {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("field1909")
	static EvictingDualNodeHashTable field1909;

	static {
		field1909 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "40"
	)
	static final void method5425() {
		int var0 = Client.playerUpdateManager.playerCount;
		int[] var1 = Client.playerUpdateManager.playerIndices;
		Iterator var2 = Client.worldViewManager.iterator();

		while (var2.hasNext()) {
			WorldView var3 = (WorldView)var2.next();

			for (int var4 = 0; var4 < var0; ++var4) {
				Player var5 = var3.players[var1[var4]];
				if (var5 != null) {
					MoveSpeed.updateActorSequence(var3, var5, 1);
				}
			}
		}

	}
}
