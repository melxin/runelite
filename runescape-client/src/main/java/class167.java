import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
public class class167 {
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = 5893049423313328319L
	)
	long field1787;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		longValue = 1230870611193710827L
	)
	public long field1791;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	IterableNodeDeque field1786;

	@ObfuscatedSignature(
		descriptor = "(Lvy;)V"
	)
	public class167(Buffer var1) {
		this.field1791 = -1L;
		this.field1786 = new IterableNodeDeque();
		this.method3812(var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "1996451817"
	)
	void method3812(Buffer var1) {
		this.field1787 = var1.readLong();
		this.field1791 = var1.readLong();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 1) {
				var3 = new class162(this);
			} else if (var2 == 4) {
				var3 = new class173(this);
			} else if (var2 == 3) {
				var3 = new class158(this);
			} else if (var2 == 2) {
				var3 = new class156(this);
			} else {
				if (var2 != 5) {
					throw new RuntimeException("");
				}

				var3 = new class163(this);
			}

			((class166)var3).vmethod3869(var1);
			this.field1786.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgk;B)V",
		garbageValue = "-15"
	)
	public void method3817(ClanChannel var1) {
		if (this.field1787 == var1.key && var1.field1810 == this.field1791) {
			for (class166 var2 = (class166)this.field1786.last(); var2 != null; var2 = (class166)this.field1786.previous()) {
				var2.vmethod3870(var1);
			}

			++var1.field1810;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lpq;B)V",
		garbageValue = "53"
	)
	public static void method3811(AbstractArchive var0) {
		EnumComposition.EnumDefinition_archive = var0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-87648385"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}
}
