import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public class class166 {
	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	@Export("archive6")
	static Archive archive6;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = -4938632966518421695L
	)
	long field1846;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = 1135078271159672253L
	)
	public long field1841;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	IterableNodeDeque field1842;

	@ObfuscatedSignature(
		descriptor = "(Lvy;)V"
	)
	public class166(Buffer var1) {
		this.field1841 = -1L;
		this.field1842 = new IterableNodeDeque();
		this.method3644(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-1148066029"
	)
	void method3644(Buffer var1) {
		this.field1846 = var1.readLong();
		this.field1841 = var1.readLong();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 1) {
				var3 = new class161(this);
			} else if (var2 == 4) {
				var3 = new class172(this);
			} else if (var2 == 3) {
				var3 = new class157(this);
			} else if (var2 == 2) {
				var3 = new class155(this);
			} else {
				if (var2 != 5) {
					throw new RuntimeException("");
				}

				var3 = new class162(this);
			}

			((class165)var3).vmethod3695(var1);
			this.field1842.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgd;I)V",
		garbageValue = "1368552627"
	)
	public void method3646(ClanChannel var1) {
		if (var1.key == this.field1846 && var1.field1858 == this.field1841) {
			for (class165 var2 = (class165)this.field1842.last(); var2 != null; var2 = (class165)this.field1842.previous()) {
				var2.vmethod3696(var1);
			}

			++var1.field1858;
		} else {
			throw new RuntimeException("");
		}
	}
}
