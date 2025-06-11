import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
@Implements("Task")
public class Task {
	@ObfuscatedName("an")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("ai")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("al")
	@Export("result")
	public volatile Object result;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 218261761
	)
	@Export("type")
	int type;
	@ObfuscatedName("am")
	@Export("objectArgument")
	Object objectArgument;

	Task() {
		this.status = 0;
	}
}
