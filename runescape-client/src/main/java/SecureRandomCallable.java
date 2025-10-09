import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("cp")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	@ObfuscatedName("sy")
	@ObfuscatedGetter(
		intValue = 1805255779
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;

	SecureRandomCallable() {
	}

	public Object call() {
		return class29.method462();
	}
}
