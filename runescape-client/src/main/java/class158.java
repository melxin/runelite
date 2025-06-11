import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
public class class158 extends class149 {
	@ObfuscatedName("ap")
	String field1776;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfp;)V"
	)
	class158(class152 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "-1635342078"
	)
	void vmethod3913(Buffer var1) {
		this.field1776 = var1.readStringCp1252NullTerminated();
		var1.readInt();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lgu;I)V",
		garbageValue = "-1572789515"
	)
	void vmethod3914(ClanSettings var1) {
		var1.name = this.field1776;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([I[JIII)V",
		garbageValue = "-406051341"
	)
	public static void method3730(int[] var0, long[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			int var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			long var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;
			int var9 = var6 == Integer.MAX_VALUE ? 0 : 1;

			for (int var10 = var2; var10 < var3; ++var10) {
				if (var0[var10] < (var10 & var9) + var6) {
					int var11 = var0[var10];
					var0[var10] = var0[var5];
					var0[var5] = var11;
					long var12 = var1[var10];
					var1[var10] = var1[var5];
					var1[var5++] = var12;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method3730(var0, var1, var2, var5 - 1);
			method3730(var0, var1, var5 + 1, var3);
		}

	}
}
