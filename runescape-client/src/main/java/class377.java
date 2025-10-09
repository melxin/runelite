import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ot")
public enum class377 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	field4387(0, 0, false, false),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	field4386(1, 1, true, false),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	field4395(2, 2, true, true),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	field4392 = field4395;

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;
	@ObfuscatedName("ou")
	static SecureRandom field4393;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -715597647
	)
	final int field4394;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 2121572443
	)
	final int field4388;
	@ObfuscatedName("af")
	public final boolean field4390;
	@ObfuscatedName("ae")
	public final boolean field4391;

	class377(int var3, int var4, boolean var5, boolean var6) {
		this.field4394 = var3;
		this.field4388 = var4;
		this.field4390 = var5;
		this.field4391 = var6;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1012656358"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4388;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-39"
	)
	static final int method8177(int var0, int var1) {
		int var2 = var0 + var1 * 57;
		var2 ^= var2 << 13;
		int var3 = var2 * (var2 * var2 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 255;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ltl;ILjava/lang/Object;S)V",
		garbageValue = "26978"
	)
	public static void method8176(DynamicArray var0, int var1, Object var2) {
		PacketBufferNode.method7052(var0, (class572)null, true);
		if (var1 >= 0 && var1 <= var0.size * 479682119) {
			var0.method10437(var0.size * 479682119 + 1);
			if (var1 < var0.size * 479682119) {
				class167.method4091(var0, var1, var0, var1 + 1, var0.size * 479682119 - var1);
			}

			var0.method10435(var1, var2);
			var0.size += 1093200759;
		} else {
			throw new RuntimeException();
		}
	}
}
