import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
public class class212 extends DualNode {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("field1909")
	static EvictingDualNodeHashTable field1909;

	static {
		field1909 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1350956682"
	)
	static final int method4685(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(Ldd;Lpw;B)V",
		garbageValue = "27"
	)
	static void method4683(WorldView var0, class400 var1) {
		int var2 = 0;

		for (int var3 = 0; var3 < var0.field1148.method10038(); ++var3) {
			WorldEntity var4 = (WorldEntity)var0.worldEntities.get((long)var0.field1148.method10037(var3));
			if (var4 != null && var4.worldView.id != Client.currentWorldViewId && var4.method10495() == var1) {
				boolean var5 = var2 < Client.field348;
				if (var5) {
					++var2;
					boolean var6 = false;
					if (var1 == class400.field4843) {
						boolean var7;
						label122: {
							int var8;
							for (var8 = 0; var8 < Client.playerUpdateManager.playerCount; ++var8) {
								Player var13 = (Player)var0.players.get((long)Client.playerUpdateManager.playerIndices[var8]);
								if (class495.method10096(var4, var13)) {
									var7 = true;
									break label122;
								}
							}

							var8 = 0;

							label105:
							while (true) {
								if (var8 >= var0.field1130.method10038()) {
									Bounds var12 = DefaultsGroup.method10775(var4.worldEntityCoord, var4.field5538.method4619());

									for (int var9 = 0; var9 < var0.field1148.method10038(); ++var9) {
										WorldEntity var10 = (WorldEntity)var0.worldEntities.get((long)var0.field1148.method10037(var9));
										if (var10 != null && var10 != var4 && var10.worldView.scene.cycle == Client.cycle) {
											Bounds var11 = DefaultsGroup.method10775(var10.worldEntityCoord, var10.field5538.method4619());
											if (var12.method9238(var11)) {
												var12.method9263();
												var11.method9263();
												var7 = true;
												break label105;
											}

											var11.method9263();
										}
									}

									var12.method9263();
									var7 = false;
									break;
								}

								NPC var16 = (NPC)var0.npcs.get((long)var0.field1130.method10037(var8));
								if (var16 != null) {
									boolean var14 = false;

									for (int var15 = 0; var15 < var16.definition.actions.length; ++var15) {
										if (var16.definition.actions[var15] != null) {
											var14 = true;
										}
									}

									if (var14 && class495.method10096(var4, var16)) {
										var7 = true;
										break;
									}
								}

								++var8;
							}
						}

						var6 = var7;
					}

					WorldMapLabelSize.method6575(var0, var4, var6);
				}
			}
		}

	}
}
