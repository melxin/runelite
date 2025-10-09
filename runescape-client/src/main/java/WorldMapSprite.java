import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	static Archive field3462;
	@ObfuscatedName("at")
	@Export("tileColors")
	final int[] tileColors;

	WorldMapSprite() {
		this.tileColors = new int[4096];
	}

	WorldMapSprite(int[] var1) {
		this.tileColors = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-652532999"
	)
	@Export("getTileColor")
	final int getTileColor(int var1, int var2) {
		return this.tileColors[var1 + var2 * 64];
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;ZI)V",
		garbageValue = "818607242"
	)
	static void method6838(ArrayList var0, boolean var1) {
		if (!var1) {
			class338.field3891.clear();
		}

		Iterator var2 = var0.iterator();

		while (var2.hasNext()) {
			MidiRequest var3 = (MidiRequest)var2.next();
			if (var3.musicTrackGroupId != -1 && var3.musicTrackFileId != -1) {
				if (!var1) {
					class338.field3891.add(var3);
				}

				class338.field3893.add(var3);
			}
		}

	}
}
