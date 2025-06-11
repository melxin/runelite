import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rb")
@Implements("DelayFadeTask")
public class DelayFadeTask extends SongTask {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = -8054695339265180545L
	)
	long field5078;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1336921829
	)
	int field5079;

	@ObfuscatedSignature(
		descriptor = "(Lrh;I)V"
	)
	public DelayFadeTask(SongTask var1, int var2) {
		super(var1);
		this.field5079 = var2;
		super.field5090 = "DelayFadeTask";
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1822823713"
	)
	public boolean vmethod9290() {
		if (this.field5078 < (long)this.field5079) {
			++this.field5078;
			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ltp;Lve;ZI)V",
		garbageValue = "-467274466"
	)
	static void method9245(class509 var0, class563 var1, boolean var2) {
		if (var0 == null) {
			throw new RuntimeException();
		} else if (var1 != null && var0.field5288 != var1) {
			throw new RuntimeException();
		} else if (var2 && !var0.field5293) {
			throw new RuntimeException();
		}
	}
}
