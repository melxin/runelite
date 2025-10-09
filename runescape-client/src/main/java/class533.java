import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uc")
public class class533 {
	@ObfuscatedName("aj")
	static final int[] field5638;
	@ObfuscatedName("ah")
	static final int[] field5635;
	@ObfuscatedName("af")
	static final float[] field5640;
	@ObfuscatedName("ae")
	static final float[] field5641;

	static {
		field5638 = new int[16384];
		field5635 = new int[16384];
		field5640 = new float[16384];
		field5641 = new float[16384];
		double var0 = 3.834951969714103E-4D;

		for (int var2 = 0; var2 < 16384; ++var2) {
			field5638[var2] = (int)(16384.0D * Math.sin((double)var2 * var0));
			field5635[var2] = (int)(16384.0D * Math.cos(var0 * (double)var2));
			field5640[var2] = (float)Math.sin((double)var2 * var0);
			field5641[var2] = (float)Math.cos(var0 * (double)var2);
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([BIII)Z",
		garbageValue = "1526749422"
	)
	static final boolean method10661(byte[] var0, int var1, int var2) {
		boolean var3 = true;
		Buffer var4 = new Buffer(var0);
		int var5 = -1;

		label71:
		while (true) {
			int var6 = var4.readIncrSmallSmart();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;

			while (true) {
				int var9;
				while (!var8) {
					var9 = var4.readUShortSmart();
					if (var9 == 0) {
						continue label71;
					}

					var7 += var9 - 1;
					int var10 = var7 & 63;
					int var11 = var7 >> 6 & 63;
					int var12 = var4.readUnsignedByte() >> 2;
					int var13 = var11 + var1;
					int var14 = var10 + var2;
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) {
						ObjectComposition var15 = TileItem.getObjectDefinition(var5);
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) {
							if (!var15.needsModelFiles()) {
								++Client.field392;
								var3 = false;
							}

							var8 = true;
						}
					}
				}

				var9 = var4.readUShortSmart();
				if (var9 == 0) {
					break;
				}

				var4.readUnsignedByte();
			}
		}
	}
}
