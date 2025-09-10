import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	public static class423 field1780;
	@ObfuscatedName("af")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1362145957
	)
	@Export("world")
	public int world;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lxa;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1782630395"
	)
	public static int method3835(int var0) {
		return var0 >> 24 & 3;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;III)V",
		garbageValue = "-1711867357"
	)
	static void method3834(Object[] var0, int var1, int var2) {
		while (var1 < var2) {
			Object var3 = var0[var1];
			var0[var1] = var0[var2];
			var0[var2] = var3;
			++var1;
			--var2;
		}

	}
}
