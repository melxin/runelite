import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("up")
	@ObfuscatedGetter(
		intValue = -972427689
	)
	static int field479;
	@ObfuscatedName("ab")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpk;Lpk;I)I",
		garbageValue = "-2094690442"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) {
			return 0;
		} else {
			if (this.filterWorlds) {
				if (Client.worldId == var1.world) {
					return -1;
				}

				if (var2.world == Client.worldId) {
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1;
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "381340527"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1967982200"
	)
	static final void method1218(String var0) {
		HttpRequestTask.method269("Please remove " + var0 + " from your friend list first");
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "571"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close();
		Huffman.clear();
		Client.worldViewManager.clear();
		Client.playerUpdateManager.method3037();
		Client.field816.method5556();
		System.gc();
		WorldMapSprite.method6235(0, 0);
		FloorOverlayDefinition.method4257();
		Client.playingJingle = false;
		MouseRecorder.method2503();
		class31.updateGameState(10);
		Client.serverCycle = 0;
		Actor.method2671().method4475();
		Actor.method2671().method4463();
	}
}
