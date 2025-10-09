import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
public class class132 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1245693589
	)
	int field1607;
	@ObfuscatedName("at")
	float field1605;
	@ObfuscatedName("ag")
	float field1604;
	@ObfuscatedName("aj")
	float field1606;
	@ObfuscatedName("ah")
	float field1608;
	@ObfuscatedName("af")
	float field1609;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	class132 field1613;

	class132() {
		this.field1604 = Float.MAX_VALUE;
		this.field1606 = Float.MAX_VALUE;
		this.field1608 = Float.MAX_VALUE;
		this.field1609 = Float.MAX_VALUE;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;IB)V",
		garbageValue = "-75"
	)
	void method3669(Buffer var1, int var2) {
		this.field1607 = var1.readShort();
		this.field1605 = var1.method11385();
		this.field1604 = var1.method11385();
		this.field1606 = var1.method11385();
		this.field1608 = var1.method11385();
		this.field1609 = var1.method11385();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1996534181"
	)
	static String method3671(int var0) {
		return "<img=" + var0 + ">";
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ltl;IB)Ljava/lang/Object;",
		garbageValue = "-89"
	)
	public static Object method3673(DynamicArray var0, int var1) {
		PacketBufferNode.method7052(var0, (class572)null, true);
		if (var1 >= 0 && var1 < var0.size * 479682119) {
			Object var2 = var0.method10434(var1);
			if (var1 < var0.size * 479682119 - 1) {
				class167.method4091(var0, var1 + 1, var0, var1, var0.size * 479682119 - (var1 + 1));
			}

			var0.method10440(var0.size * 479682119 - 1);
			return var2;
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-862222793"
	)
	static final void method3672(int var0) {
		if (class35.widgetDefinition.loadInterface(var0)) {
			Widget[] var1 = class35.widgetDefinition.Widget_interfaceComponents[var0];

			for (int var2 = 0; var2 < var1.length; ++var2) {
				Widget var3 = var1[var2];
				if (var3 != null) {
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
				}
			}

		}
	}
}
