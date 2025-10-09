import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uj")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	static final DefaultsGroup field5588;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	static final DefaultsGroup field5587;
	@ObfuscatedName("aw")
	static String[] field5589;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 366987827
	)
	@Export("group")
	final int group;

	static {
		field5588 = new DefaultsGroup(1);
		field5587 = new DefaultsGroup(3);
	}

	DefaultsGroup(int var1) {
		this.group = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ltl;Lwe;I)V",
		garbageValue = "-673397482"
	)
	static void method10548(DynamicArray var0, class572 var1) {
		PacketBufferNode.method7052(var0, var1, false);
	}
}
