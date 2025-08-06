import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
public class class164 extends class149 {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = -519071735305173163L
	)
	long field1859;
	@ObfuscatedName("ab")
	String field1858;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -913783153
	)
	int field1860;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfg;)V"
	)
	class164(class152 var1) {
		this.this$0 = var1;
		this.field1859 = -1L;
		this.field1858 = null;
		this.field1860 = 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "1324754926"
	)
	void vmethod4086(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1859 = var1.readLong();
		}

		this.field1858 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1860 = var1.readUnsignedShort();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lgk;I)V",
		garbageValue = "1924878263"
	)
	void vmethod4088(ClanSettings var1) {
		var1.method3897(this.field1859, this.field1858, this.field1860);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([J[IIII)V",
		garbageValue = "192707233"
	)
	public static void method3995(long[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			long var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var8 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var8;
			int var9 = var6 == Long.MAX_VALUE ? 0 : 1;

			for (int var10 = var2; var10 < var3; ++var10) {
				if (var0[var10] < (long)(var10 & var9) + var6) {
					long var11 = var0[var10];
					var0[var10] = var0[var5];
					var0[var5] = var11;
					int var13 = var1[var10];
					var1[var10] = var1[var5];
					var1[var5++] = var13;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var8;
			method3995(var0, var1, var2, var5 - 1);
			method3995(var0, var1, var5 + 1, var3);
		}

	}
}
