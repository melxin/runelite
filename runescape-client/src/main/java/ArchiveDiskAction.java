import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oj")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1776839277
	)
	@Export("type")
	int type;
	@ObfuscatedName("aw")
	@Export("data")
	byte[] data;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("archive")
	Archive archive;

	ArchiveDiskAction() {
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1898432279"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) {
			if (class379.widgetDefinition.loadInterface(var0)) {
				Widget[] var1 = class379.widgetDefinition.Widget_interfaceComponents[var0];

				for (int var2 = 0; var2 < var1.length; ++var2) {
					Widget var3 = var1[var2];
					if (var3.onLoad != null) {
						ScriptEvent var4 = new ScriptEvent();
						var4.widget = var3;
						var4.args = var3.onLoad;
						class53.runScript(var4, 5000000, 0);
					}
				}

			}
		}
	}
}
