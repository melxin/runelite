import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
public class class175 extends class151 {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lsu;"
	)
	@Export("ItemDefinition_fontPlain11")
	public static Font ItemDefinition_fontPlain11;
	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	static Archive field1928;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1599912149
	)
	int field1931;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = 7579814683621814707L
	)
	long field1930;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	final class154 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfc;)V"
	)
	class175(class154 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxa;B)V",
		garbageValue = "-11"
	)
	void vmethod4235(Buffer var1) {
		this.field1931 = var1.readInt();
		this.field1930 = var1.readLong();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgs;B)V",
		garbageValue = "-98"
	)
	void vmethod4241(ClanSettings var1) {
		var1.method4068(this.field1931, this.field1930);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lft;FZI)F",
		garbageValue = "-12397854"
	)
	static float method4234(class139 var0, float var1, boolean var2) {
		float var3 = 0.0F;
		if (var0 != null && var0.method3841() != 0) {
			float var4 = (float)var0.field1652[0].field1593;
			float var5 = (float)var0.field1652[var0.method3841() - 1].field1593;
			float var6 = var5 - var4;
			if (0.0F == var6) {
				return var0.field1652[0].field1597;
			} else {
				float var7 = 0.0F;
				if (var1 > var5) {
					var7 = (var1 - var5) / var6;
				} else {
					var7 = (var1 - var4) / var6;
				}

				float var8 = (float)((int)var7);
				float var9 = Math.abs(var7 - var8);
				float var10 = var6 * var9;
				var8 = Math.abs(1.0F + var8);
				float var11 = var8 / 2.0F;
				float var12 = (float)((int)var11);
				var9 = var11 - var12;
				float var13;
				float var14;
				if (var2) {
					if (var0.field1664 == class137.field1634) {
						if (0.0F != var9) {
							var10 += var4;
						} else {
							var10 = var5 - var10;
						}
					} else if (var0.field1664 != class137.field1632 && var0.field1664 != class137.field1633) {
						if (var0.field1664 == class137.field1631) {
							var10 = var4 - var1;
							var13 = var0.field1652[0].field1594;
							var14 = var0.field1652[0].field1595;
							var3 = var0.field1652[0].field1597;
							if (0.0F != var13) {
								var3 -= var14 * var10 / var13;
							}

							return var3;
						}
					} else {
						var10 = var5 - var10;
					}
				} else if (var0.field1653 == class137.field1634) {
					if (0.0F != var9) {
						var10 = var5 - var10;
					} else {
						var10 += var4;
					}
				} else if (var0.field1653 != class137.field1632 && var0.field1653 != class137.field1633) {
					if (var0.field1653 == class137.field1631) {
						var10 = var1 - var5;
						var13 = var0.field1652[var0.method3841() - 1].field1599;
						var14 = var0.field1652[var0.method3841() - 1].field1600;
						var3 = var0.field1652[var0.method3841() - 1].field1597;
						if (var13 != 0.0F) {
							var3 += var14 * var10 / var13;
						}

						return var3;
					}
				} else {
					var10 += var4;
				}

				var3 = HintArrow.method8430(var0, var10);
				float var15;
				if (var2 && var0.field1664 == class137.field1633) {
					var15 = var0.field1652[var0.method3841() - 1].field1597 - var0.field1652[0].field1597;
					var3 -= var8 * var15;
				} else if (!var2 && var0.field1653 == class137.field1633) {
					var15 = var0.field1652[var0.method3841() - 1].field1597 - var0.field1652[0].field1597;
					var3 += var15 * var8;
				}

				return var3;
			}
		} else {
			return var3;
		}
	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(Ldd;Lxj;S)V",
		garbageValue = "-6564"
	)
	static void method4239(WorldView var0, PacketBuffer var1) {
		WorldView var2 = AsyncHttpResponse.worldView;
		var2.baseX = var1.readUnsignedShort();
		var2.baseY = var1.readUnsignedShort();
		int var3 = var2.sizeX / 8;
		int var4 = var2.sizeY / 8;
		int var5 = var1.readUnsignedShort();
		var1.importIndex();

		int var6;
		int var7;
		int var8;
		int var9;
		for (var6 = 0; var6 < 4; ++var6) {
			for (var7 = 0; var7 < var3; ++var7) {
				for (var8 = 0; var8 < var4; ++var8) {
					var9 = var1.readBits(1);
					if (var9 == 1) {
						Client.field429[var6][var7][var8] = var1.readBits(26);
					} else {
						Client.field429[var6][var7][var8] = -1;
					}
				}
			}
		}

		var1.exportIndex();
		Sound.field1803 = new int[var5][4];

		for (var6 = 0; var6 < var5; ++var6) {
			for (var7 = 0; var7 < 4; ++var7) {
				Sound.field1803[var6][var7] = var1.readInt();
			}
		}

		LoginState.field277 = new int[var5];
		DevicePcmPlayerProvider.field86 = new int[var5];
		HealthBarUpdate.field1082 = new int[var5];
		JagexCache.field2586 = new byte[var5][];
		Login.field717 = new byte[var5][];
		var5 = 0;

		for (var6 = 0; var6 < 4; ++var6) {
			for (var7 = 0; var7 < var3; ++var7) {
				for (var8 = 0; var8 < var4; ++var8) {
					var9 = Client.field429[var6][var7][var8];
					if (var9 != -1) {
						int var10 = class498.method10142(var9);
						int var11 = Renderable.method5835(var9);
						int var12 = (var10 / 8 << 8) + var11 / 8;

						int var13;
						for (var13 = 0; var13 < var5; ++var13) {
							if (LoginState.field277[var13] == var12) {
								var12 = -1;
								break;
							}
						}

						if (var12 != -1) {
							LoginState.field277[var5] = var12;
							var13 = var12 >> 8 & 255;
							int var14 = var12 & 255;
							DevicePcmPlayerProvider.field86[var5] = Tile.archive9.getGroupId("m" + var13 + "_" + var14);
							HealthBarUpdate.field1082[var5] = Tile.archive9.getGroupId("l" + var13 + "_" + var14);
							++var5;
						}
					}
				}
			}
		}

		Client.playerUpdateManager.method2943(var2);
		WorldMapSectionType.updateGameState(25);
		Client.field473 = true;
		ClientPacket.field3684 = var2;
		class392.method8383(var2);
	}

	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1673279701"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop;
	}
}
