import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sq")
@Implements("DelayFadeTask")
public class DelayFadeTask extends SongTask {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = -6215936894117245883L
	)
	long field5368;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -509817991
	)
	int field5367;

	@ObfuscatedSignature(
		descriptor = "(Lsz;I)V"
	)
	public DelayFadeTask(SongTask var1, int var2) {
		super(var1);
		this.field5367 = var2;
		super.field5378 = "DelayFadeTask";
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "111"
	)
	public boolean vmethod9974() {
		if (this.field5368 < (long)this.field5367) {
			++this.field5368;
			return false;
		} else {
			return true;
		}
	}
}
