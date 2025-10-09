import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kx")
@Implements("Task")
public class Task {
	@ObfuscatedName("ag")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("aj")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("ah")
	@Export("result")
	public volatile Object result;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 96167863
	)
	@Export("type")
	int type;
	@ObfuscatedName("aq")
	@Export("objectArgument")
	Object objectArgument;

	Task() {
		this.status = 0;
	}
}
