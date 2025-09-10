import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mv")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1321013979
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILna;Lna;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1;
		this.coord1 = var2;
		this.coord2 = var3;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-2121206854"
	)
	public static int method6969(int var0, int var1, int var2) {
		int var3 = Client.method1134(var2 - var1 + 1);
		var3 <<= var1;
		var0 |= var3;
		return var0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2088249437"
	)
	static final int method6970(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}
}
