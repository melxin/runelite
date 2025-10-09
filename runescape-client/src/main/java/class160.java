import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
public class class160 extends class150 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2086058735
	)
	int field1836;
	@ObfuscatedName("at")
	String field1837;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class160(class153 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "1804820754"
	)
	void vmethod4162(Buffer var1) {
		this.field1836 = var1.readInt();
		this.field1837 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgh;I)V",
		garbageValue = "1850606911"
	)
	void vmethod4163(ClanSettings var1) {
		var1.method4022(this.field1836, this.field1837);
	}

	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "(Ldm;IIILnt;B)V",
		garbageValue = "0"
	)
	static void method3974(WorldView var0, int var1, int var2, int var3, SpriteMask var4) {
		for (int var5 = 0; var5 < var0.sizeX; ++var5) {
			for (int var6 = 0; var6 < var0.sizeY; ++var6) {
				NodeDeque var7 = var0.groundItems[var0.plane][var5][var6];
				if (var7 != null) {
					int var9;
					if (var0.method2736()) {
						int var13 = var5 * 4 + 2 - Client.field484 / 32;
						var9 = var6 * 4 + 2 - Client.field377 / 32;
						class445.drawSpriteOnMinimap(var1, var2, var13, var9, var3, class199.field2176[0], var4);
					} else {
						class450 var8 = Varcs.method3022(var0, Coord.method7440(var5), Coord.method7440(var6));
						var9 = (int)var8.field5216;
						int var10 = (int)var8.field5219;
						var8.method9065();
						int var11 = var9 / 32 - Client.field484 / 32;
						int var12 = var10 / 32 - Client.field377 / 32;
						class445.drawSpriteOnMinimap(var1, var2, var11, var12, var3, class199.field2176[0], var4);
					}
				}
			}
		}

	}
}
