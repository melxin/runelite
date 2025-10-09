import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vu")
final class class569 implements class567 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lwj;I)V",
		garbageValue = "-1304869252"
	)
	public void vmethod11207(Object var1, Buffer var2) {
		this.method11161((DynamicArray)var1, var2);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lwj;S)Ljava/lang/Object;",
		garbageValue = "2047"
	)
	public Object vmethod11209(Buffer var1) {
		int var3 = var1.readUnsignedShort();
		if (var3 >= 0 && var3 <= 5000) {
			int var4 = var1.readUnsignedByte();
			DynamicArray var2;
			int var6;
			if (var4 == 0) {
				int[] var5 = new int[var3];

				for (var6 = 0; var6 < var3; ++var6) {
					var5[var6] = var1.method11575();
				}

				var2 = class151.method3914(var5);
			} else if (var4 == 1) {
				long[] var9 = new long[var3];

				for (var6 = 0; var6 < var3; ++var6) {
					var9[var6] = var1.readLong();
				}

				DynamicArray var7 = new DynamicArray(class572.field5878, false);
				var7.field5575 = var9;
				var7.size = var9.length * 1093200759;
				var7.field5572 = var9.length;
				var2 = var7;
			} else {
				if (var4 != 2) {
					throw new RuntimeException();
				}

				String[] var10 = new String[var3];

				for (var6 = 0; var6 < var3; ++var6) {
					var10[var6] = var1.readStringCp1252NullTerminated();
				}

				var2 = class393.method8268(var10);
			}

			return var2;
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ltl;Lwj;B)V",
		garbageValue = "79"
	)
	void method11161(DynamicArray var1, Buffer var2) {
		var1.method10448(var2);
	}
}
