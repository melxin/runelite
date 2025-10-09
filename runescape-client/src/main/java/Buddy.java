import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tu")
@Implements("Buddy")
public class Buddy extends User {
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -143139485
	)
	@Export("world")
	public int world;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 81147133
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1828883265
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-376139408"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1;
		this.int2 = var2;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "127"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1407521019"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0;
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2024416510"
	)
	static final void method10159() {
		int var0 = Client.playerUpdateManager.playerCount;
		int[] var1 = Client.playerUpdateManager.playerIndices;
		Iterator var2 = Client.worldViewManager.iterator();

		while (var2.hasNext()) {
			WorldView var3 = (WorldView)var2.next();

			for (int var4 = 0; var4 < var0; ++var4) {
				Player var5 = (Player)var3.players.get((long)var1[var4]);
				if (var5 != null) {
					HealthBarConfig.updateActorSequence(var3, var5, 1);
				}
			}
		}

	}
}
