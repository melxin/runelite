import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kh")
@Implements("Task")
public class Task {
	@ObfuscatedName("ac")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("av")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("au")
	@Export("result")
	public volatile Object result;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1011980017
	)
	@Export("type")
	int type;
	@ObfuscatedName("ap")
	@Export("objectArgument")
	Object objectArgument;

	Task() {
		this.status = 0;
	}
}
