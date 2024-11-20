import java.util.concurrent.locks.ReentrantLock;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bf")
public class class47 {
	@ObfuscatedName("gx")
	@Export("characterId")
	static String characterId;
	@ObfuscatedName("hi")
	static String field323;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	VorbisSample field324;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lbi;"
	)
	RawSound field320;
	@ObfuscatedName("at")
	ReentrantLock field321;

	@ObfuscatedSignature(
		descriptor = "(Lcy;Lbi;)V"
	)
	class47(VorbisSample var1, RawSound var2) {
		this.field324 = var1;
		this.field320 = var2;
		this.field321 = new ReentrantLock();
	}

	@ObfuscatedName("nq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-943992326"
	)
	static final void method866(int var0) {
		if (class379.widgetDefinition.loadInterface(var0)) {
			Widget[] var1 = class379.widgetDefinition.Widget_interfaceComponents[var0];

			for (int var2 = 0; var2 < var1.length; ++var2) {
				Widget var3 = var1[var2];
				if (var3 != null) {
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
				}
			}

		}
	}
}
