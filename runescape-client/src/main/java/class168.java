import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
public class class168 extends class149 {
	@ObfuscatedName("wb")
	@ObfuscatedGetter(
		longValue = -968234157201228495L
	)
	static long field1856;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1570573209
	)
	int field1853;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;)V"
	)
	class168(class152 var1) {
		this.this$0 = var1;
		this.field1853 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvy;B)V",
		garbageValue = "25"
	)
	void vmethod3702(Buffer var1) {
		this.field1853 = var1.readUnsignedShort();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "2011970201"
	)
	void vmethod3705(ClanSettings var1) {
		var1.method3559(this.field1853);
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "1141341522"
	)
	static void method3660(int var0, int var1, int var2, int var3, int var4) {
		NodeDeque var5 = class376.worldView.groundItems[var0][var1][var2];
		if (var5 != null) {
			for (TileItem var6 = (TileItem)var5.last(); var6 != null; var6 = (TileItem)var5.previous()) {
				if ((var3 & 32767) == var6.id && var4 == var6.quantity) {
					var6.method2975();
					break;
				}
			}

			Language.updateItemPile(var0, var1, var2);
		}

	}
}
