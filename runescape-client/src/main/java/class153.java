import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
public class class153 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = 8826564680902898909L
	)
	long field1692;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 246819445
	)
	public int field1695;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	IterableNodeDeque field1691;

	@ObfuscatedSignature(
		descriptor = "(Lvy;)V"
	)
	public class153(Buffer var1) {
		this.field1695 = -1;
		this.field1691 = new IterableNodeDeque();
		this.method3613(var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;B)V",
		garbageValue = "69"
	)
	void method3613(Buffer var1) {
		this.field1692 = var1.readLong();
		this.field1695 = var1.readInt();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 3) {
				var3 = new class172(this);
			} else if (var2 == 1) {
				var3 = new LoginPacket(this);
			} else if (var2 == 13) {
				var3 = new class165(this);
			} else if (var2 == 4) {
				var3 = new Sound(this);
			} else if (var2 == 6) {
				var3 = new class164(this);
			} else if (var2 == 5) {
				var3 = new class149(this);
			} else if (var2 == 2) {
				var3 = new class154(this);
			} else if (var2 == 7) {
				var3 = new class147(this);
			} else if (var2 == 14) {
				var3 = new class151(this);
			} else if (var2 == 8) {
				var3 = new class168(this);
			} else if (var2 == 9) {
				var3 = new class174(this);
			} else if (var2 == 10) {
				var3 = new class160(this);
			} else if (var2 == 11) {
				var3 = new class155(this);
			} else if (var2 == 12) {
				var3 = new class159(this);
			} else {
				if (var2 != 15) {
					throw new RuntimeException("");
				}

				var3 = new class169(this);
			}

			((class150)var3).vmethod3879(var1);
			this.field1691.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgq;B)V",
		garbageValue = "-28"
	)
	public void method3612(ClanSettings var1) {
		if (var1.field1759 == this.field1692 && this.field1695 == var1.field1738) {
			for (class150 var2 = (class150)this.field1691.last(); var2 != null; var2 = (class150)this.field1691.previous()) {
				var2.vmethod3882(var1);
			}

			++var1.field1738;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1157377129"
	)
	public static void method3618() {
		class235.field1864.clear();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1814785539"
	)
	public static boolean method3620() {
		return !class333.field3626.isEmpty();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-44"
	)
	public static void method3619() {
		class333.field3626.clear();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1352185577"
	)
	static int method3617(String var0) {
		if (var0.equals("centre")) {
			return 1;
		} else {
			return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2;
		}
	}
}
