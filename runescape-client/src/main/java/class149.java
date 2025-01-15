import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
public class class149 extends class150 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Len;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 736475757
	)
	int field1677;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;)V"
	)
	class149(class153 var1) {
		this.this$0 = var1;
		this.field1677 = -1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-1355269794"
	)
	void vmethod3879(Buffer var1) {
		this.field1677 = var1.readUnsignedShort();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgq;B)V",
		garbageValue = "0"
	)
	void vmethod3882(ClanSettings var1) {
		var1.method3692(this.field1677);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lpq;II)Lnb;",
		garbageValue = "1271589655"
	)
	static MusicPatch method3586(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1);
		return var2 == null ? null : new MusicPatch(var2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lff;FI)F",
		garbageValue = "-597744766"
	)
	static float method3585(class136 var0, float var1) {
		if (var0 != null && var0.method3455() != 0) {
			if (var1 < (float)var0.field1573[0].field1528) {
				return var0.field1572 == class134.field1561 ? var0.field1573[0].field1527 : SoundCache.method895(var0, var1, true);
			} else if (var1 > (float)var0.field1573[var0.method3455() - 1].field1528) {
				return var0.field1574 == class134.field1561 ? var0.field1573[var0.method3455() - 1].field1527 : SoundCache.method895(var0, var1, false);
			} else if (var0.field1571) {
				return var0.field1573[0].field1527;
			} else {
				class131 var2 = var0.method3460(var1);
				boolean var3 = false;
				boolean var4 = false;
				if (var2 == null) {
					return 0.0F;
				} else {
					float var5;
					float var6;
					if (0.0F == var2.field1530 && var2.field1526 == 0.0F) {
						var3 = true;
					} else if (var2.field1530 == Float.MAX_VALUE && Float.MAX_VALUE == var2.field1526) {
						var4 = true;
					} else if (var2.field1532 != null) {
						if (var0.field1586) {
							var5 = (float)var2.field1528;
							float var9 = var2.field1527;
							var6 = var2.field1530 * 0.33333334F + var5;
							float var10 = var2.field1526 * 0.33333334F + var9;
							float var8 = (float)var2.field1532.field1528;
							float var12 = var2.field1532.field1527;
							float var7 = var8 - var2.field1532.field1531 * 0.33333334F;
							float var11 = var12 - 0.33333334F * var2.field1532.field1529;
							if (var0.field1593) {
								class144.method3550(var0, var5, var6, var7, var8, var9, var10, var11, var12);
							} else if (var0 != null) {
								var0.field1576 = var5;
								float var13 = var8 - var5;
								float var14 = var12 - var9;
								float var15 = var6 - var5;
								float var16 = 0.0F;
								float var17 = 0.0F;
								if (var15 != 0.0F) {
									var16 = (var10 - var9) / var15;
								}

								var15 = var8 - var7;
								if (var15 != 0.0F) {
									var17 = (var12 - var11) / var15;
								}

								float var18 = 1.0F / (var13 * var13);
								float var19 = var16 * var13;
								float var20 = var13 * var17;
								var0.field1578 = var18 * (var19 + var20 - var14 - var14) / var13;
								var0.field1579 = (var14 + var14 + var14 - var19 - var19 - var20) * var18;
								var0.field1580 = var16;
								var0.field1581 = var9;
							}

							var0.field1586 = false;
						}
					} else {
						var3 = true;
					}

					if (var3) {
						return var2.field1527;
					} else if (var4) {
						return (float)var2.field1528 != var1 && var2.field1532 != null ? var2.field1532.field1527 : var2.field1527;
					} else if (var0.field1593) {
						return class141.method3511(var0, var1);
					} else {
						if (var0 == null) {
							var5 = 0.0F;
						} else {
							var6 = var1 - var0.field1576;
							var5 = var6 * ((var0.field1579 + var6 * var0.field1578) * var6 + var0.field1580) + var0.field1581;
						}

						return var5;
					}
				}
			}
		} else {
			return 0.0F;
		}
	}

	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1960898800"
	)
	@Export("setMusicVolume")
	static final void setMusicVolume(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != class544.clientPreferences.getMusicVolume()) {
			if (class544.clientPreferences.getMusicVolume() == 0 && class153.method3620()) {
				class96.method2709(class544.archive6, var0);
				Client.playingJingle = false;
			} else if (var0 == 0) {
				UserComparator3.method3347(0, 0);
				Client.playingJingle = false;
			} else {
				ScriptEvent.method2622(var0);
			}

			class544.clientPreferences.updateMusicVolume(var0);
		}

	}
}
