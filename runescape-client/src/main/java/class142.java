import java.util.Iterator;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
class class142 implements Callable {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	static AbstractArchive field1721;
	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("sd")
	@ObfuscatedGetter(
		intValue = 379518741
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class145 this$0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lwj;"
	)
	final Buffer val$p;
	// $FF: synthetic field
	final int val$version;

	@ObfuscatedSignature(
		descriptor = "(Lfz;Lwj;I)V"
	)
	class142(class145 var1, Buffer var2, int var3) {
		this.this$0 = var1;
		this.val$p = var2;
		this.val$version = var3;
	}

	public Object call() {
		this.this$0.method3836(this.val$p, this.val$version);
		return null;
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1361660674"
	)
	static final void method3825() {
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
