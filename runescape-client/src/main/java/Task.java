import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ip")
@Implements("Task")
public class Task {
	@ObfuscatedName("ae")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("af")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("as")
	@Export("result")
	public volatile Object result;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 697834537
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
