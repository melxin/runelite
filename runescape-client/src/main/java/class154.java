import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
public class class154 {
	@ObfuscatedName("al")
	static int[] field1785;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = -3197148537381341535L
	)
	long field1772;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1683362631
	)
	public int field1780;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	IterableNodeDeque field1773;

	@ObfuscatedSignature(
		descriptor = "(Lxa;)V"
	)
	public class154(Buffer var1) {
		this.field1780 = -1;
		this.field1773 = new IterableNodeDeque();
		this.method3989(var1);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxa;I)V",
		garbageValue = "-1466956921"
	)
	void method3989(Buffer var1) {
		this.field1772 = var1.readLong();
		this.field1780 = var1.readInt();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 3) {
				var3 = new class173(this);
			} else if (var2 == 1) {
				var3 = new LoginPacket(this);
			} else if (var2 == 13) {
				var3 = new class166(this);
			} else if (var2 == 4) {
				var3 = new Sound(this);
			} else if (var2 == 6) {
				var3 = new class165(this);
			} else if (var2 == 5) {
				var3 = new class150(this);
			} else if (var2 == 2) {
				var3 = new class155(this);
			} else if (var2 == 7) {
				var3 = new class148(this);
			} else if (var2 == 14) {
				var3 = new class152(this);
			} else if (var2 == 8) {
				var3 = new class169(this);
			} else if (var2 == 9) {
				var3 = new class175(this);
			} else if (var2 == 10) {
				var3 = new class161(this);
			} else if (var2 == 11) {
				var3 = new class156(this);
			} else if (var2 == 12) {
				var3 = new class160(this);
			} else {
				if (var2 != 15) {
					throw new RuntimeException("");
				}

				var3 = new class170(this);
			}

			((class151)var3).vmethod4235(var1);
			this.field1773.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgs;B)V",
		garbageValue = "-20"
	)
	public void method3988(ClanSettings var1) {
		if (var1.field1826 == this.field1772 && this.field1780 == var1.field1827) {
			for (class151 var2 = (class151)this.field1773.last(); var2 != null; var2 = (class151)this.field1773.previous()) {
				var2.vmethod4241(var1);
			}

			++var1.field1827;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([Lbn;II[I[IB)V",
		garbageValue = "-98"
	)
	@Export("sortWorlds")
	static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) {
			int var5 = var1 - 1;
			int var6 = var2 + 1;
			int var7 = (var2 + var1) / 2;
			World var8 = var0[var7];
			var0[var7] = var0[var1];
			var0[var1] = var8;

			while (var5 < var6) {
				boolean var9 = true;

				int var10;
				int var11;
				int var12;
				do {
					--var6;

					for (var10 = 0; var10 < 4; ++var10) {
						if (var3[var10] == 2) {
							var11 = var0[var6].index;
							var12 = var8.index;
						} else if (var3[var10] == 1) {
							var11 = var0[var6].population;
							var12 = var8.population;
							if (var11 == -1 && var4[var10] == 1) {
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001;
							}
						} else if (var3[var10] == 3) {
							var11 = var0[var6].isMembersOnly() ? 1 : 0;
							var12 = var8.isMembersOnly() ? 1 : 0;
						} else {
							var11 = var0[var6].id;
							var12 = var8.id;
						}

						if (var12 != var11) {
							if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) {
								var9 = false;
							}
							break;
						}

						if (var10 == 3) {
							var9 = false;
						}
					}
				} while(var9);

				var9 = true;

				do {
					++var5;

					for (var10 = 0; var10 < 4; ++var10) {
						if (var3[var10] == 2) {
							var11 = var0[var5].index;
							var12 = var8.index;
						} else if (var3[var10] == 1) {
							var11 = var0[var5].population;
							var12 = var8.population;
							if (var11 == -1 && var4[var10] == 1) {
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001;
							}
						} else if (var3[var10] == 3) {
							var11 = var0[var5].isMembersOnly() ? 1 : 0;
							var12 = var8.isMembersOnly() ? 1 : 0;
						} else {
							var11 = var0[var5].id;
							var12 = var8.id;
						}

						if (var12 != var11) {
							if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) {
								var9 = false;
							}
							break;
						}

						if (var10 == 3) {
							var9 = false;
						}
					}
				} while(var9);

				if (var5 < var6) {
					World var13 = var0[var5];
					var0[var5] = var0[var6];
					var0[var6] = var13;
				}
			}

			sortWorlds(var0, var1, var6, var3, var4);
			sortWorlds(var0, var6 + 1, var2, var3, var4);
		}

	}
}
