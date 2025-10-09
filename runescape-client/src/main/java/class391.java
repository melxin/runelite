import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ps")
public enum class391 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	field4828(0, 0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	field4831(1, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("TOKEN")
	TOKEN(2, 2);

	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1853424427
	)
	final int field4825;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1939815089
	)
	final int field4829;

	class391(int var3, int var4) {
		this.field4825 = var3;
		this.field4829 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1012656358"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4829;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpe;I)V",
		garbageValue = "173537748"
	)
	public static void method8226(AbstractArchive var0) {
		EnumComposition.EnumDefinition_archive = var0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ltl;II)V",
		garbageValue = "-191820396"
	)
	static void method8223(DynamicArray var0, int var1) {
		if (var1 < 0 || var1 >= var0.method10433()) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ltl;B)V",
		garbageValue = "66"
	)
	public static void method8225(DynamicArray var0) {
		PacketBufferNode.method7052(var0, (class572)null, true);
		int var1 = var0.method10433();
		if (var1 > 1) {
			if (var0.field5571 == class572.field5879) {
				class167.method4104(var0.method10430(), 0, var1 - 1);
			} else if (var0.field5571 == class572.field5878) {
				class149.method3896(var0.method10431(), 0, var1 - 1);
			} else {
				class67.method2192(var0.method10428(), 0, var1 - 1);
			}

		}
	}

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "([Lok;IIIIIIZI)V",
		garbageValue = "-1228189090"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		for (int var8 = var1; var8 <= var2; ++var8) {
			Widget var9 = var0[var8];
			if (var9 != null && var3 == var9.parentId && var4 == var9.field4173) {
				HitSplatDefinition.alignWidgetSize(var9, var5, var6, var7);
				class361.alignWidgetPosition(var9, var5, var6);
				if (var9.scrollX > var9.scrollWidth - var9.width) {
					var9.scrollX = var9.scrollWidth - var9.width;
				}

				if (var9.scrollX < 0) {
					var9.scrollX = 0;
				}

				if (var9.scrollY > var9.scrollHeight - var9.height * -171267385) {
					var9.scrollY = var9.scrollHeight - var9.height * -171267385;
				}

				if (var9.scrollY < 0) {
					var9.scrollY = 0;
				}

				if (var9.type == 0) {
					VarcInt.revalidateWidgetScroll(var0, var9, var7);
				}
			}
		}

	}
}
