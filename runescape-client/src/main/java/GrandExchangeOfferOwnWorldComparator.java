import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("br")
	static String field264;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Lxc;"
	)
	@Export("options_buttons_0Sprite")
	static IndexedSprite options_buttons_0Sprite;
	@ObfuscatedName("ab")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lqo;Lqo;I)I",
		garbageValue = "-1394919724"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) {
			return 0;
		} else {
			if (this.filterWorlds) {
				if (Client.worldId == var1.world) {
					return -1;
				}

				if (var2.world == Client.worldId) {
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1;
		}
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	@ObfuscatedName("ab")
	public static final void method789(long var0) {
		if (var0 > 0L) {
			if (var0 % 10L == 0L) {
				Occluder.method5461(var0 - 1L);
				Occluder.method5461(1L);
			} else {
				Occluder.method5461(var0);
			}

		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1331665502"
	)
	public static int method791(int var0) {
		return var0 >>> 4 & class578.field5909;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ltl;III)V",
		garbageValue = "1379601456"
	)
	public static void method792(DynamicArray var0, int var1, int var2) {
		PacketBufferNode.method7052(var0, (class572)null, true);
		if (var1 >= 0 && var2 >= 0 && var1 < var0.method10433() && var2 < var0.method10433()) {
			if (var2 != var1) {
				if (var0.field5571 == class572.field5879) {
					int[] var3 = var0.method10430();
					int var8 = var3[var1];
					var3[var1] = var3[var2];
					var3[var2] = var8;
				} else if (var0.field5571 == class572.field5878) {
					long[] var9 = var0.method10431();
					long var6 = var9[var1];
					var9[var1] = var9[var2];
					var9[var2] = var6;
				} else {
					Object[] var10 = var0.method10428();
					Object var4 = var10[var1];
					var10[var1] = var10[var2];
					var10[var2] = var4;
				}
			}

		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(Ldm;IIIIIB)V",
		garbageValue = "-54"
	)
	static void method790(WorldView var0, int var1, int var2, int var3, int var4, int var5) {
		NodeDeque var6 = var0.groundItems[var1][var2][var3];
		if (var6 != null) {
			for (TileItem var7 = (TileItem)var6.last(); var7 != null; var7 = (TileItem)var6.previous()) {
				if ((var4 & 32767) == var7.id) {
					var7.setFlag(var5);
					break;
				}
			}
		}

	}
}
