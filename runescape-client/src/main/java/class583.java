import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wx")
final class class583 implements class581 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lxa;I)V",
		garbageValue = "-1722278579"
	)
	public void vmethod11455(Object var1, Buffer var2) {
		this.method11414((DynamicArray)var1, var2);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lxa;B)Ljava/lang/Object;",
		garbageValue = "-20"
	)
	public Object vmethod11459(Buffer var1) {
		int var3 = var1.readUnsignedShort();
		if (var3 >= 0 && var3 <= 5000) {
			int var4 = var1.readUnsignedByte();
			DynamicArray var2;
			int var6;
			DynamicArray var7;
			if (var4 == 0) {
				int[] var5 = new int[var3];

				for (var6 = 0; var6 < var3; ++var6) {
					var5[var6] = var1.readInt();
				}

				var7 = new DynamicArray(class586.field5937, false);
				var7.array = var5;
				var7.size = var5.length * -1205286309;
				var7.field5587 = var5.length;
				var2 = var7;
			} else if (var4 == 1) {
				long[] var9 = new long[var3];

				for (var6 = 0; var6 < var3; ++var6) {
					var9[var6] = var1.readLong();
				}

				var7 = new DynamicArray(class586.field5942, false);
				var7.field5590 = var9;
				var7.size = var9.length * -1205286309;
				var7.field5587 = var9.length;
				var2 = var7;
			} else {
				if (var4 != 2) {
					throw new RuntimeException();
				}

				String[] var10 = new String[var3];

				for (var6 = 0; var6 < var3; ++var6) {
					var10[var6] = var1.readStringCp1252NullTerminated();
				}

				var7 = new DynamicArray(class586.field5939, false);
				var7.field5586 = var10;
				var7.size = var10.length * -1205286309;
				var7.field5587 = var10.length;
				var2 = var7;
			}

			return var2;
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lut;Lxa;I)V",
		garbageValue = "703833178"
	)
	void method11414(DynamicArray var1, Buffer var2) {
		var1.method10670(var2);
	}
}
