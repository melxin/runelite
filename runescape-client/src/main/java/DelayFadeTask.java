import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ss")
@Implements("DelayFadeTask")
public class DelayFadeTask extends SongTask {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = -3477653084176250655L
	)
	long field5289;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -2137312327
	)
	int field5288;

	@ObfuscatedSignature(
		descriptor = "(Lsi;I)V"
	)
	public DelayFadeTask(SongTask var1, int var2) {
		super(var1);
		this.field5288 = var2;
		super.field5303 = "DelayFadeTask";
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "40"
	)
	public boolean vmethod9673() {
		if (this.field5289 < (long)this.field5288) {
			++this.field5289;
			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)J",
		garbageValue = "26"
	)
	public static long method9649(int var0) {
		if (var0 > 63) {
			throw new class457("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[]{var0});
		} else {
			return (long)Math.pow(2.0D, (double)var0) - 1L;
		}
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/String;I)Lti;",
		garbageValue = "650035798"
	)
	static DynamicArray method9647(Object var0, String var1) {
		if (var0 == null) {
			throw new RuntimeException();
		} else {
			return (DynamicArray)var0;
		}
	}
}
