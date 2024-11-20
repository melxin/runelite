import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
@Implements("Clock")
public abstract class Clock {
	@ObfuscatedName("os")
	@ObfuscatedGetter(
		intValue = 1275525409
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;

	Clock() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "1927"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1101148912"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);
}
