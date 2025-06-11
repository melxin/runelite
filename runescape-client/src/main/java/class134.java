import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
public enum class134 implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	field1581(0, 0),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	field1580(1, 1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	field1577(2, 2),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	field1578(3, 3),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	field1579(4, 4);

	@ObfuscatedName("ju")
	@ObfuscatedGetter(
		intValue = -437314813
	)
	static int field1582;
	@ObfuscatedName("vq")
	@ObfuscatedGetter(
		intValue = 654382625
	)
	static int field1583;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -826904545
	)
	final int field1576;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -319902273
	)
	final int field1575;

	class134(int var3, int var4) {
		this.field1576 = var3;
		this.field1575 = var4;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "26"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1575;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1316136223"
	)
	static final void method3519() {
		GrandExchangeOfferOwnWorldComparator.method760("You can't add yourself to your own ignore list");
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1384961115"
	)
	static final void method3523() {
		int var0;
		int var1;
		int var2;
		if (!Client.field578) {
			var0 = Coord.method7242(Interpreter.field676);
			var1 = Coord.method7242(AABB.field2811);
			var2 = DevicePcmPlayerProvider.getTileHeight(Sound.topLevelWorldView, var0, var1, Sound.topLevelWorldView.plane) - class242.field2663;
			class163.method3834(var0, var2, var1);
		} else if (Client.field581 != null) {
			class6.cameraX = Client.field581.vmethod10247();
			GrandExchangeOfferAgeComparator.cameraZ = Client.field581.vmethod10248();
			if (Client.field580) {
				ClientPreferences.cameraY = Client.field581.vmethod10249();
			} else {
				ClientPreferences.cameraY = DevicePcmPlayerProvider.getTileHeight(Sound.topLevelWorldView, class6.cameraX, GrandExchangeOfferAgeComparator.cameraZ, Sound.topLevelWorldView.plane) - Client.field581.vmethod10249();
			}

			Client.field581.method10258();
		}

		if (!Client.field543) {
			var0 = Coord.method7242(Messages.field1260);
			var1 = Coord.method7242(field1583);
			var2 = DevicePcmPlayerProvider.getTileHeight(Sound.topLevelWorldView, var0, var1, Sound.topLevelWorldView.plane) - class27.field131;
			int var3 = var0 - class6.cameraX;
			int var4 = var2 - ClientPreferences.cameraY;
			int var5 = var1 - GrandExchangeOfferAgeComparator.cameraZ;
			int var6 = (int)Math.sqrt((double)(var3 * var3 + var5 * var5));
			int var7 = (int)(Math.atan2((double)var4, (double)var6) * 325.9490051269531D) & 2047;
			int var8 = (int)(Math.atan2((double)var3, (double)var5) * -325.9490051269531D) & 2047;
			MouseRecorder.method2130(var7, var8);
		} else {
			if (Client.field583 != null) {
				WorldMapData_1.cameraPitch = Client.field583.method10243();
				WorldMapData_1.cameraPitch = Math.min(Math.max(WorldMapData_1.cameraPitch, 128), 383);
				Client.field583.method10258();
			}

			if (Client.field582 != null) {
				class455.cameraYaw = Client.field582.method10243() & 2047;
				Client.field582.method10258();
			}
		}

	}

	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1904168238"
	)
	static void method3521() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) {
			int var1 = var0.group;
			if (ClientPreferences.widgetDefinition.loadInterface(var1)) {
				boolean var2 = true;
				Widget[] var3 = ClientPreferences.widgetDefinition.Widget_interfaceComponents[var1];

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) {
					if (var3[var4] != null) {
						var2 = var3[var4].isIf3;
						break;
					}
				}

				if (!var2) {
					var4 = (int)var0.key;
					Widget var5 = ClientPreferences.widgetDefinition.method7286(var4);
					if (var5 != null) {
						ScriptFrame.invalidateWidget(var5);
					}
				}
			}
		}

	}
}
