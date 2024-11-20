import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ro")
@Implements("DelayFadeTask")
public class DelayFadeTask extends SongTask {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = 6750607552988642917L
	)
	long field4865;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -241210825
	)
	int field4866;

	@ObfuscatedSignature(
		descriptor = "(Lrg;I)V"
	)
	public DelayFadeTask(SongTask var1, int var2) {
		super(var1);
		this.field4866 = var2;
		super.field4876 = "DelayFadeTask";
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-1"
	)
	public boolean vmethod8722() {
		if (this.field4865 < (long)this.field4866) {
			++this.field4865;
			return false;
		} else {
			return true;
		}
	}
}
