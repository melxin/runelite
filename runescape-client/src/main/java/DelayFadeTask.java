import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rz")
@Implements("DelayFadeTask")
public class DelayFadeTask extends SongTask {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = 5633598139083014177L
	)
	long field5014;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -58825269
	)
	int field5015;

	@ObfuscatedSignature(
		descriptor = "(Lrt;I)V"
	)
	public DelayFadeTask(SongTask var1, int var2) {
		super(var1);
		this.field5015 = var2;
		super.field5028 = "DelayFadeTask";
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2115930134"
	)
	public boolean vmethod8896() {
		if (this.field5014 < (long)this.field5015) {
			++this.field5014;
			return false;
		} else {
			return true;
		}
	}
}
