import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
public class class154 extends class150 {
	@ObfuscatedName("as")
	@Export("osNameLowercase")
	public static String osNameLowercase;
	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "Lcg;"
	)
	@Export("clientPreferences")
	public static ClientPreferences clientPreferences;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -569763607
	)
	int field1798;
	@ObfuscatedName("at")
	byte field1795;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class154(class153 var1) {
		this.this$0 = var1;
		this.field1798 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "1804820754"
	)
	void vmethod4162(Buffer var1) {
		this.field1798 = var1.readUnsignedShort();
		this.field1795 = var1.readByte();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgh;I)V",
		garbageValue = "1850606911"
	)
	void vmethod4163(ClanSettings var1) {
		var1.method3992(this.field1798, this.field1795);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lwj;[II)[Ljava/lang/Object;",
		garbageValue = "-1175977284"
	)
	static Object[] method3933(Buffer var0, int[] var1) {
		int var2 = var0.readUShortSmart();
		Object[] var3 = new Object[var1.length * var2];

		for (int var4 = 0; var4 < var2; ++var4) {
			for (int var5 = 0; var5 < var1.length; ++var5) {
				int var6 = var1.length * var4 + var5;
				class572 var7 = Tile.method4986(var1[var5]);
				var3[var6] = var7.method11191(var0);
			}
		}

		return var3;
	}

	@ObfuscatedName("nv")
	@ObfuscatedSignature(
		descriptor = "(Lok;I)V",
		garbageValue = "-1291865600"
	)
	@Export("invalidateWidget")
	public static void invalidateWidget(Widget var0) {
		if (var0 != null && var0.cycle == Client.field533) {
			Client.validRootWidgets[var0.rootIndex] = true;
		}

	}
}
