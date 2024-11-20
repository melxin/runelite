import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
@Implements("UserComparator3")
public class UserComparator3 extends AbstractUserComparator {
	@ObfuscatedName("ab")
	@Export("reversed")
	final boolean reversed;

	public UserComparator3(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lsi;Lsi;I)I",
		garbageValue = "1431961330"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.world != var1.world) {
			return this.reversed ? var1.world - var2.world : var2.world - var1.world;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Z",
		garbageValue = "-1488142395"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		return HttpRequest.method105(var0, 10, true);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([BIII)Z",
		garbageValue = "-933804468"
	)
	static final boolean method3233(byte[] var0, int var1, int var2) {
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
						ObjectComposition var15 = HttpMethod.getObjectDefinition(var5);
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) {
							if (!var15.needsModelFiles()) {
								++Client.field581;
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

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2031742916"
	)
	static final void method3232() {
		if (class75.pcmPlayer1 != null) {
			class75.pcmPlayer1.run();
		}

	}

	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "(Lnp;I)Z",
		garbageValue = "-319371586"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden;
	}
}
