import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qv")
public final class class432 {
	@ObfuscatedName("ab")
	final Object field4795;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -718635291
	)
	int field4796;

	class432(Object var1, int var2) {
		this.field4795 = var1;
		this.field4796 = var2;
	}

	@ObfuscatedName("or")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-997969200"
	)
	static final void method8330() {
		Client.field708 = Client.cycleCntr;
		TransformationMatrix.ClanChat_inClanChat = true;
	}
}
