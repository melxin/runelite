import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("op")
@Implements("StudioGame")
public enum StudioGame implements Enum {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("ao")
	@Export("name")
	public final String name;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -782428977
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3;
		this.id = var5;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1935172756"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZI)I",
		garbageValue = "1767996623"
	)
	static int method8195(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var3 = false;
			boolean var4 = false;
			int var5 = 0;
			int var6 = var0.length();

			for (int var7 = 0; var7 < var6; ++var7) {
				char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if (var8 == '-') {
						var3 = true;
						continue;
					}

					if (var8 == '+') {
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') {
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') {
						throw new NumberFormatException();
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) {
					throw new NumberFormatException();
				}

				if (var3) {
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10;
				if (var9 / var1 != var5) {
					throw new NumberFormatException();
				}

				var5 = var9;
				var4 = true;
			}

			if (!var4) {
				throw new NumberFormatException();
			} else {
				return var5;
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(Ldr;ZLwf;B)V",
		garbageValue = "5"
	)
	static final void method8199(WorldView var0, boolean var1, PacketBuffer var2) {
		while (true) {
			byte var3 = 16;
			int var4 = 1 << var3;
			if (var2.bitsRemaining(Client.packetWriter.serverPacketLength) >= var3 + 12) {
				int var5 = var2.readBits(var3);
				if (var5 != var4 - 1) {
					boolean var6 = false;
					NPC var7 = (NPC)var0.npcs.get((long)var5);
					if (var7 == null) {
						var7 = new NPC(var5);
						var0.npcs.add(var7, (long)var5);
						var6 = true;
					}

					var0.field1161.method9798(var5);
					var7.field1188 = false;
					var7.worldViewId = var0.id;
					int var8 = var2.readBits(1);
					int var11 = var2.readBits(1);
					if (var11 == 1) {
						Client.npcIndices[++Client.npcCount - 1] = var5;
					}

					boolean var12 = var2.readBits(1) == 1;
					if (var12) {
						var2.readBits(32);
					}

					var7.definition = class63.getNpcDefinition(var2.readBits(14));
					int var9;
					if (var1) {
						var9 = var2.readBits(8);
						if (var9 > 127) {
							var9 -= 256;
						}
					} else {
						var9 = var2.readBits(6);
						if (var9 > 31) {
							var9 -= 64;
						}
					}

					int var13 = Client.defaultRotations[var2.readBits(3)];
					if (var6) {
						var7.orientation = var7.rotation = var13;
					}

					int var10;
					if (var1) {
						var10 = var2.readBits(8);
						if (var10 > 127) {
							var10 -= 256;
						}
					} else {
						var10 = var2.readBits(6);
						if (var10 > 31) {
							var10 -= 64;
						}
					}

					HorizontalAlignment.method4319(var7);
					if (var7.field1099 == 0) {
						var7.rotation = 0;
					}

					var7.method2721(var9 + Canvas.field94, var10 + IndexCheck.field3224, var8 == 1);
					continue;
				}
			}

			var2.exportIndex();
			return;
		}
	}
}
