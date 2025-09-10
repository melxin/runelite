import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vb")
class class567 implements Iterator {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1037363109
	)
	int field5805;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lvo;"
	)
	final class568 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lvo;)V"
	)
	class567(class568 var1) {
		this.this$0 = var1;
	}

	public Object next() {
		int var1 = ++this.field5805 - 1;
		class527 var2 = (class527)this.this$0.field5809.get((long)var1);
		return var2 != null ? var2 : this.this$0.method10962(var1);
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public boolean hasNext() {
		return this.field5805 < this.this$0.method10445();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IIIB)V",
		garbageValue = "60"
	)
	@Export("quicksortStringsWithCorrespondingIntegers")
	public static void quicksortStringsWithCorrespondingIntegers(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					int var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			quicksortStringsWithCorrespondingIntegers(var0, var1, var2, var5 - 1);
			quicksortStringsWithCorrespondingIntegers(var0, var1, var5 + 1, var3);
		}

	}
}
