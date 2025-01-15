import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
public class class36 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;

	static {
		reflectionChecks = new IterableNodeDeque();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;Lks;I)Z",
		garbageValue = "1407636165"
	)
	public static boolean method722(Buffer var0, WorldEntityCoord var1) {
		byte var2 = var0.readByte();
		if (var2 == 0) {
			return false;
		} else {
			int var3 = HttpMethod.method65(var0, var2, 0);
			int var4 = HttpMethod.method65(var0, var2, 2);
			int var5 = HttpMethod.method65(var0, var2, 4);
			int var6 = HttpMethod.method65(var0, var2, 6);
			var1.method5921(var3, var4, var5, var6);
			return true;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "554766994"
	)
	static int method716(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1;
		}
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(Ldz;B)V",
		garbageValue = "0"
	)
	static void method718(WorldView var0) {
		int var1 = Client.menu.menuOptionsCount - 1;
		if (GameEngine.topLevelWorldView == var0 && var1 >= 0 && Client.menu.menuOpcodes[var1] == 60) {
			int var3 = Client.menu.menuIdentifiers[var1] * 128;
			boolean var4 = true;
			int var5 = Math.max(384, 2000 - Client.viewportZoom * 2);
			int var6 = class53.entity.getX() - (int)(GrandExchangeOffer.method7927(var3) * (double)var5);
			int var7 = class53.entity.getY() - (int)(class520.method9685(var3) * (double)var5);
			int var8 = Canvas.getTileHeight(var0, class53.entity.getX(), class53.entity.getY(), class53.entity.getPlane());
			var0.scene.drawEntity(var0.plane, var6, var7, var8, 60, class53.field338, var3, 0L, false);
		}

	}

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(Lcr;IIS)V",
		garbageValue = "512"
	)
	static final void method721(MenuAction var0, int var1, int var2) {
		if (var0 != null) {
			class508.menuAction(var0.param0, var0.param1, var0.opcode, var0.identifier, var0.itemId, var0.worldViewId, var0.action, var0.target, var1, var2);
		}

	}
}
