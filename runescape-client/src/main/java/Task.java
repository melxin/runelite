import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
@Implements("Task")
public class Task {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("ad")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -785247183
	)
	@Export("type")
	int type;
	@ObfuscatedName("ac")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("ao")
	@Export("objectArgument")
	Object objectArgument;
	@ObfuscatedName("af")
	@Export("result")
	public volatile Object result;

	Task() {
		this.status = 0;
	}
}
