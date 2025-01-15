import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rg")
@Implements("DelayFadeTask")
public class DelayFadeTask extends SongTask {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = 575910451997902603L
	)
	long field4857;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -591086789
	)
	int field4858;

	@ObfuscatedSignature(
		descriptor = "(Lrh;I)V"
	)
	public DelayFadeTask(SongTask var1, int var2) {
		super(var1);
		this.field4858 = var2;
		super.field4868 = "DelayFadeTask";
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1892560666"
	)
	public boolean vmethod8883() {
		if (this.field4857 < (long)this.field4858) {
			++this.field4857;
			return false;
		} else {
			return true;
		}
	}
}
