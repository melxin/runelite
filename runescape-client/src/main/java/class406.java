import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pb")
public class class406 {
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lxt;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1247276113"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9';
	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(III)Lkc;",
		garbageValue = "-1444441186"
	)
	static RouteStrategy method8276(int var0, int var1) {
		Client.field323.approxDestinationX = var0;
		Client.field323.approxDestinationY = var1;
		Client.field323.approxDestinationSizeX = 1;
		Client.field323.approxDestinationSizeY = 1;
		return Client.field323;
	}
}
