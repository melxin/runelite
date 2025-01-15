import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("dr")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	@ObfuscatedName("ah")
	@Export("Tiles_underlays")
	static short[][][] Tiles_underlays;

	SecureRandomCallable() {
	}

	public Object call() {
		return ObjectSound.method2103();
	}
}
