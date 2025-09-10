import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ku")
@Implements("Task")
public class Task {
	@ObfuscatedName("at")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("ac")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("ap")
	@Export("result")
	public volatile Object result;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1658271469
	)
	@Export("type")
	int type;
	@ObfuscatedName("as")
	@Export("objectArgument")
	Object objectArgument;

	Task() {
		this.status = 0;
	}
}
