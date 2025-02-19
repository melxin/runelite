import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
public class class138 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class138 field1650;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class138 field1641;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class138 field1640;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class138 field1643;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class138 field1644;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class138 field1648;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class138 field1646;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class138 field1649;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class138 field1658;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class138 field1659;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class138 field1642;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class138 field1651;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class138 field1652;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class138 field1653;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class138 field1654;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class138 field1655;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	static final class138 field1656;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1774938909
	)
	final int field1657;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1472057019
	)
	final int field1647;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -2135852625
	)
	final int field1645;

	static {
		field1650 = new class138(0, 0, (String)null, -1, -1);
		field1641 = new class138(1, 1, (String)null, 0, 2);
		field1640 = new class138(2, 2, (String)null, 1, 2);
		field1643 = new class138(3, 3, (String)null, 2, 2);
		field1644 = new class138(4, 4, (String)null, 3, 1);
		field1648 = new class138(5, 5, (String)null, 4, 1);
		field1646 = new class138(6, 6, (String)null, 5, 1);
		field1649 = new class138(7, 7, (String)null, 6, 3);
		field1658 = new class138(8, 8, (String)null, 7, 3);
		field1659 = new class138(9, 9, (String)null, 8, 3);
		field1642 = new class138(10, 10, (String)null, 0, 7);
		field1651 = new class138(11, 11, (String)null, 1, 7);
		field1652 = new class138(12, 12, (String)null, 2, 7);
		field1653 = new class138(13, 13, (String)null, 3, 7);
		field1654 = new class138(14, 14, (String)null, 4, 7);
		field1655 = new class138(15, 15, (String)null, 5, 7);
		field1656 = new class138(16, 16, (String)null, 0, 5);
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)V",
		garbageValue = "-1"
	)
	class138(int var1, int var2, String var3, int var4, int var5) {
		this.field1657 = var1;
		this.field1647 = var2;
		this.field1645 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1647;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1457453393"
	)
	int method3393() {
		return this.field1645;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "-1532546188"
	)
	public static float method3387(int var0) {
		var0 &= 2047;
		return (float)((double)((float)var0 / 2048.0F) * 6.283185307179586D);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Lin;",
		garbageValue = "-2017878162"
	)
	@Export("ItemDefinition_get")
	public static ItemComposition ItemDefinition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class140.ItemDefinition_archive.takeFile(10, var0);
			var1 = new ItemComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.post();
			if (var1.noteTemplate != -1) {
				var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
			}

			if (var1.notedId != -1) {
				var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) {
				var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
			}

			if (!AuthenticationScheme.ItemDefinition_inMembersWorld && var1.isMembersOnly) {
				if (var1.noteTemplate == -1 && var1.notedId == -1 && var1.placeholderTemplate == -1) {
					var1.name = var1.name + " (Members)";
				}

				var1.examine = "Login to a members' server to use this object.";
				var1.isTradable = false;

				int var3;
				for (var3 = 0; var3 < var1.groundActions.length; ++var3) {
					var1.groundActions[var3] = null;
				}

				for (var3 = 0; var3 < var1.inventoryActions.length; ++var3) {
					if (var3 != 4) {
						if (var1.subOps != null) {
							var1.subOps[var3] = null;
						}

						var1.inventoryActions[var3] = null;
					}
				}

				var1.shiftClickIndex = -2;
				var1.team = 0;
				if (var1.params != null) {
					boolean var6 = false;

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) {
						ParamComposition var5 = class140.getParamDefinition((int)var4.key);
						if (var5.autoDisable) {
							var4.remove();
						} else {
							var6 = true;
						}
					}

					if (!var6) {
						var1.params = null;
					}
				}
			}

			ItemComposition.ItemDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1905471453"
	)
	public static int method3390(int var0) {
		class144 var1 = class144.method3421(var0);
		if (var1 == null) {
			return 2;
		} else {
			return var1.method3412() ? 0 : 1;
		}
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(Ldp;I)V",
		garbageValue = "-515162551"
	)
	static void method3392(WorldView var0) {
		int var1 = Client.playerUpdateManager.playerCount;
		int[] var2 = Client.playerUpdateManager.playerIndices;

		for (int var3 = 0; var3 < var1; ++var3) {
			if (var2[var3] != Client.combatTargetPlayerIndex && var2[var3] != Client.localPlayerIndex) {
				VarbitComposition.addPlayerToScene(var0, var2[var3], true);
			}
		}

	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Ldp;ZI)V",
		garbageValue = "-2031906252"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(WorldView var0, boolean var1) {
		Iterator var2 = var0.npcs.iterator();

		while (true) {
			NPC var3;
			int var4;
			while (true) {
				int var5;
				int var6;
				do {
					do {
						do {
							do {
								do {
									do {
										do {
											do {
												if (!var2.hasNext()) {
													return;
												}

												var3 = (NPC)var2.next();
											} while(var3 == null);
										} while(!var3.isVisible());
									} while(var3.definition.isVisible != var1);
								} while(!var3.definition.transformIsVisible());

								var4 = var0.plane;
								var5 = var3.x >> 7;
								var6 = var3.y >> 7;
							} while(var5 < 0);
						} while(var5 >= var0.sizeX);
					} while(var6 < 0);
				} while(var6 >= var0.sizeY);

				if (var3.size != 1 || (var3.x & 127) != 64 || (var3.y & 127) != 64) {
					break;
				}

				if (var0.tileLastDrawnActor[var5][var6] != Client.viewportDrawCount) {
					var0.tileLastDrawnActor[var5][var6] = Client.viewportDrawCount;
					break;
				}
			}

			long var7 = HttpRequestTask.calculateTag(0, 0, 1, !var3.definition.isInteractable, var3.index, var0.id);
			var3.playerCycle = Client.cycle;
			int var9 = DevicePcmPlayerProvider.getTileHeight(var0, var3.size * 64 - 64 + var3.x, var3.size * 64 - 64 + var3.y, var4);
			int var10 = var3.size * 64 - 64 + 60;
			var0.scene.drawEntity(var4, var3.x, var3.y, var9, var10, var3, var3.rotation, var7, var3.isWalking);
		}
	}
}
