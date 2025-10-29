import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
@Implements("Task")
public class Task {
	@ObfuscatedName("ag")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("an")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("ae")
	@Export("result")
	public volatile Object result;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -489720931
	)
	@Export("type")
	int type;
	@ObfuscatedName("aw")
	@Export("objectArgument")
	Object objectArgument;

	Task() {
		this.status = 0;
	}
}
