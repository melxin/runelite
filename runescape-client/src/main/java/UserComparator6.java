import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
	@ObfuscatedName("ab")
	@Export("reversed")
	final boolean reversed;

	public UserComparator6(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lst;Lst;I)I",
		garbageValue = "-1938495823"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) {
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvy;Lqv;B)Lqv;",
		garbageValue = "-83"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte();
		int var3;
		if (var1 == null) {
			var3 = MoveSpeed.method5791(var2);
			var1 = new IterableNodeHashTable(var3);
		}

		for (var3 = 0; var3 < var2; ++var3) {
			boolean var4 = var0.readUnsignedByte() == 1;
			int var5 = var0.readMedium();
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
			} else {
				var6 = new IntegerNode(var0.readInt());
			}

			var1.put((Node)var6, (long)var5);
		}

		return var1;
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(Ldp;I)V",
		garbageValue = "863488765"
	)
	static void method3265(WorldView var0) {
		int var1 = var0.sizeX / 8;
		int var2 = var0.sizeY / 8;
		boolean var3 = false;
		GameBuild.method7512(false);
		var3 = true;

		int var4;
		for (var4 = 0; var4 < class139.field1661.length; ++var4) {
			if (SecureRandomFuture.field1016[var4] != -1 && class139.field1661[var4] == null) {
				class139.field1661[var4] = class166.archive6.takeFile(SecureRandomFuture.field1016[var4], 0);
				if (class139.field1661[var4] == null) {
					var3 = false;
				}
			}

			if (class450.field4944[var4] != -1 && class159.field1785[var4] == null) {
				class159.field1785[var4] = class166.archive6.takeFileEncrypted(class450.field4944[var4], 0, FriendSystem.field845[var4]);
				if (class159.field1785[var4] == null) {
					var3 = false;
				}
			}
		}

		if (var3) {
			GameBuild.method7512(false);
			var3 = true;

			for (var4 = 0; var4 < class139.field1661.length; ++var4) {
				byte[] var17 = class159.field1785[var4];
				if (var17 != null) {
					byte var6 = 10;
					byte var7 = 10;
					var3 &= ArchiveLoader.method2415(var17, var6, var7);
				}
			}

			if (var3) {
				int var5;
				for (var4 = 0; var4 < 4; ++var4) {
					for (var5 = 0; var5 < var0.tileSettings[var4].length; ++var5) {
						Arrays.fill(var0.tileSettings[var4][var5], (byte)0);
					}
				}

				UrlRequester.method3151();
				HttpRequestTask.method246();
				RouteStrategy.method5690();
				GameBuild.method7512(true);

				int var8;
				int var9;
				int var10;
				int var11;
				int var12;
				int var13;
				int var18;
				for (var4 = 0; var4 < 4; ++var4) {
					UrlRequester.method3151();

					for (var5 = 0; var5 < var1; ++var5) {
						for (var18 = 0; var18 < var2; ++var18) {
							boolean var19 = false;
							var8 = Client.field514[var4][var5][var18];
							if (var8 != -1) {
								var9 = var8 >> 24 & 3;
								var10 = var8 >> 1 & 3;
								var11 = var8 >> 14 & 1023;
								var12 = var8 >> 3 & 2047;
								var13 = (var11 / 8 << 8) + var12 / 8;

								for (int var14 = 0; var14 < UrlRequester.field1504.length; ++var14) {
									if (UrlRequester.field1504[var14] == var13 && class139.field1661[var14] != null) {
										int var15 = (var11 - var5) * 8;
										int var16 = (var12 - var18) * 8;
										class375.method7504(var0, class139.field1661[var14], var4, var5 * 8, var18 * 8, var9, (var11 & 7) * 8, (var12 & 7) * 8, var10, var15, var16);
										var19 = true;
										break;
									}
								}
							}

							if (!var19) {
								ClanChannel.method3672(var0.tileHeights, var4, var5 * 8, var18 * 8);
							}
						}
					}
				}

				for (var4 = 0; var4 < 13; ++var4) {
					for (var5 = 0; var5 < 13; ++var5) {
						var18 = Client.field514[0][var4][var5];
						if (var18 == -1) {
							class448.method8505(var0, var4 * 8, var5 * 8, 8, 8);
						}
					}
				}

				GameBuild.method7512(true);

				for (var4 = 0; var4 < 4; ++var4) {
					UrlRequester.method3151();

					for (var5 = 0; var5 < var1; ++var5) {
						for (var18 = 0; var18 < var2; ++var18) {
							int var20 = Client.field514[var4][var5][var18];
							if (var20 != -1) {
								var8 = var20 >> 24 & 3;
								var9 = var20 >> 1 & 3;
								var10 = var20 >> 14 & 1023;
								var11 = var20 >> 3 & 2047;
								var12 = (var10 / 8 << 8) + var11 / 8;

								for (var13 = 0; var13 < UrlRequester.field1504.length; ++var13) {
									if (UrlRequester.field1504[var13] == var12 && class159.field1785[var13] != null) {
										Tiles.method2354(var0, class159.field1785[var13], var4, var5 * 8, var18 * 8, var8, (var10 & 7) * 8, (var11 & 7) * 8, var9);
										break;
									}
								}
							}
						}
					}
				}

				GameBuild.method7512(true);
				UrlRequester.method3151();
				class197.method3992(var0);
				GameBuild.method7512(true);
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				UrlRequester.method3151();
				WorldView.method2831();
				Client.field520 = false;
			}
		}
	}
}
