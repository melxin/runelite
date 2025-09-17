import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
@Implements("StructComposition")
public class StructComposition extends DualNode {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("StructDefinition_archive")
	static AbstractArchive StructDefinition_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("StructDefinition_cached")
	static EvictingDualNodeHashTable StructDefinition_cached;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		StructDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	StructComposition() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1779827996"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwb;B)V",
		garbageValue = "7"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lwb;II)V",
		garbageValue = "-1412795924"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = class144.readStringIntParameters(var1, this.params);
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2136487675"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return class537.method10547(this.params, var1, var2);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-36"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return class405.method8274(this.params, var1, var2);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lit;IIIIIIII)Lre;",
		garbageValue = "-431770858"
	)
	public static final class452 method4561(Scene var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		float var8 = 1.0E-5F;
		ViewportMouse.ViewportMouse_false0 = false;
		EnumComposition.method4304(var0.field2747, var0.field2774, var0.field2732, var0.field2750, var5, var6, var7);
		class452 var9 = WorldMapSection0.method6761(0.0F, 1.0F, 0.0F);
		float var10 = PendingSpawn.method2413(var9, ViewportMouse.field2962);
		if (Math.abs(var10) < 1.0E-5F) {
			var9.method8992();
			return null;
		} else {
			class452 var11 = WorldMapSection0.method6761((float)var2, (float)var3, (float)var4);
			class452 var12 = WorldMapSection0.method6761(var11.field5175, var11.field5176 - (float)var1, var11.field5169);
			float var13 = -PendingSpawn.method2413(var9, var12) / var10;
			var9.method8992();
			if (var13 < 0.0F) {
				var12.method8992();
				var11.method8992();
				return null;
			} else {
				class452 var15 = ViewportMouse.field2962;
				class452 var16 = class334.method7060(var15);
				var16.method9003(var13);
				class452 var17 = class4.method18(var11, var16);
				var16.method8992();
				var12.method8992();
				var11.method8992();
				return var17;
			}
		}
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(Ldr;Lpd;I)V",
		garbageValue = "766324511"
	)
	static void method4564(WorldView var0, class394 var1) {
		int var2 = 0;

		for (int var3 = 0; var3 < var0.field1176.method9790(); ++var3) {
			WorldEntity var4 = (WorldEntity)var0.worldEntities.get((long)var0.field1176.method9787(var3));
			if (var4 != null && var4.worldView.id != Client.currentWorldViewId && var4.method10072() == var1) {
				boolean var5 = var2 < Client.field384;
				if (var5) {
					++var2;
					boolean var6 = false;
					if (var1 == class394.field4801) {
						Bounds var8 = class563.method10884(var4.worldEntityCoord, var4.field5425.method4455());

						boolean var7;
						label119: {
							int var9;
							for (var9 = 0; var9 < Client.playerUpdateManager.playerCount; ++var9) {
								Player var10 = (Player)var0.players.get((long)Client.playerUpdateManager.playerIndices[var9]);
								if (var10 != null && var8.method8976(var10.x, var10.y)) {
									var8.method8941();
									var7 = true;
									break label119;
								}
							}

							var9 = 0;

							label102:
							while (true) {
								if (var9 >= var0.field1161.method9790()) {
									for (var9 = 0; var9 < var0.field1176.method9790(); ++var9) {
										WorldEntity var14 = (WorldEntity)var0.worldEntities.get((long)var0.field1176.method9787(var9));
										if (var14 != null && var14 != var4 && var14.worldView.scene.cycle == Client.cycle) {
											Bounds var11 = class563.method10884(var14.worldEntityCoord, var14.field5425.method4455());
											if (var8.method8944(var11)) {
												var8.method8941();
												var11.method8941();
												var7 = true;
												break label102;
											}

											var11.method8941();
										}
									}

									var8.method8941();
									var7 = false;
									break;
								}

								NPC var13 = (NPC)var0.npcs.get((long)var0.field1161.method9787(var9));
								if (var13 != null && var8.method8976(var13.x, var13.y)) {
									for (int var12 = 0; var12 < var13.definition.actions.length; ++var12) {
										if (var13.definition.actions[var12] != null) {
											var8.method8941();
											var7 = true;
											break label102;
										}
									}
								}

								++var9;
							}
						}

						var6 = var7;
					}

					class192.method4314(var0, var4, var6);
				}
			}
		}

	}
}
