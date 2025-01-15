import java.util.BitSet;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ns")
public class class346 extends Node {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1313234445
	)
	int field3751;
	@ObfuscatedName("ah")
	BitSet field3748;

	class346(int var1) {
		this.field3751 = var1;
		this.field3748 = new BitSet(128);
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "49"
	)
	static final void method6950() {
		if (class424.ClanChat_inClanChat) {
			if (WorldMapLabelSize.friendsChat != null) {
				WorldMapLabelSize.friendsChat.sort();
			}

			class397.method7892();
			class424.ClanChat_inClanChat = false;
		}

	}
}
