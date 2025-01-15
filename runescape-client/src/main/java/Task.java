import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
@Implements("Task")
public class Task {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("ao")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -263238277
	)
	@Export("type")
	int type;
	@ObfuscatedName("an")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("ae")
	@Export("objectArgument")
	Object objectArgument;
	@ObfuscatedName("ax")
	@Export("result")
	public volatile Object result;

	Task() {
		this.status = 0;
	}
}
