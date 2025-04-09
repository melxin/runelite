import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rd")
@Implements("DelayFadeTask")
public class DelayFadeTask extends SongTask {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = 4095446087480563527L
	)
	long field5025;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1234361095
	)
	int field5026;

	@ObfuscatedSignature(
		descriptor = "(Lro;I)V"
	)
	public DelayFadeTask(SongTask var1, int var2) {
		super(var1);
		this.field5026 = var2;
		super.field5039 = "DelayFadeTask";
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1093204820"
	)
	public boolean vmethod8938() {
		if (this.field5025 < (long)this.field5026) {
			++this.field5025;
			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Luw;B)I",
		garbageValue = "98"
	)
	public static final int method8900(LoginType var0) {
		if (var0 == null) {
			return 12;
		} else {
			switch(var0.field5484) {
			case 6:
				return 20;
			default:
				return 12;
			}
		}
	}
}
