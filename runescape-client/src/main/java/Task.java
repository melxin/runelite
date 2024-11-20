import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
@Implements("Task")
public class Task {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("ae")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -380271597
	)
	@Export("type")
	int type;
	@ObfuscatedName("ac")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("aj")
	@Export("objectArgument")
	Object objectArgument;
	@ObfuscatedName("av")
	@Export("result")
	public volatile Object result;

	Task() {
		this.status = 0;
	}
}
