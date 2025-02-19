import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
public class class279 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("ObjectDefinition_archive")
	public static AbstractArchive ObjectDefinition_archive;

	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "693584955"
	)
	static final void method5831(int var0) {
		if (class376.widgetDefinition.loadInterface(var0)) {
			class225.drawModelComponents(class376.widgetDefinition.Widget_interfaceComponents[var0], -1);
		}
	}
}
