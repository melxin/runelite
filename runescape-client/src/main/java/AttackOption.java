import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
@Implements("AttackOption")
public enum AttackOption implements Enum {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	field1188(2),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	field1186(4);

	@ObfuscatedName("ai")
	@Export("osNameLowercase")
	public static String osNameLowercase;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 339226445
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(Ldd;ZLxj;I)V",
		garbageValue = "1969703243"
	)
	@Export("updateNpcs")
	static final void updateNpcs(WorldView var0, boolean var1, PacketBuffer var2) {
		Client.field471 = 0;
		Client.npcCount = 0;
		var2.importIndex();
		int var3 = var2.readBits(8);
		int var4;
		NPC var6;
		int var11;
		if (var3 < var0.field1130.method10038()) {
			for (var4 = var3; var4 < var0.field1130.method10038(); ++var4) {
				var11 = var0.field1130.method10037(var4);
				Client.field472[++Client.field471 - 1] = var11;
				var6 = (NPC)var0.npcs.get((long)var11);
				var6.field1165 = true;
			}
		}

		if (var3 > var0.field1130.method10038()) {
			throw new RuntimeException("");
		} else {
			var0.field1130.method10039();

			for (var4 = 0; var4 < var3; ++var4) {
				var11 = var0.field1130.method10037(var4);
				var6 = (NPC)var0.npcs.get((long)var11);
				int var7 = var2.readBits(1);
				if (var7 == 0) {
					var0.field1130.method10036(var11);
				} else {
					int var8 = var2.readBits(2);
					if (var8 == 0) {
						var0.field1130.method10036(var11);
						Client.npcIndices[++Client.npcCount - 1] = var11;
					} else {
						int var9;
						int var10;
						if (var8 == 1) {
							var0.field1130.method10036(var11);
							var9 = var2.readBits(3);
							var6.method2811(var9, MoveSpeed.field3304);
							var10 = var2.readBits(1);
							if (var10 == 1) {
								Client.npcIndices[++Client.npcCount - 1] = var11;
							}
						} else if (var8 == 2) {
							var0.field1130.method10036(var11);
							if (var2.readBits(1) == 1) {
								var9 = var2.readBits(3);
								var6.method2811(var9, MoveSpeed.field3301);
								var10 = var2.readBits(3);
								var6.method2811(var10, MoveSpeed.field3301);
							} else {
								var9 = var2.readBits(3);
								var6.method2811(var9, MoveSpeed.field3299);
							}

							var9 = var2.readBits(1);
							if (var9 == 1) {
								Client.npcIndices[++Client.npcCount - 1] = var11;
							}
						} else if (var8 == 3) {
							Client.field472[++Client.field471 - 1] = var11;
							var6.field1165 = true;
						}
					}
				}
			}

			class138.method3828(var0, var1, var2);
			FloatProjection.method5819(var0, var2);

			for (var3 = 0; var3 < Client.field471; ++var3) {
				var4 = Client.field472[var3];
				NPC var5 = (NPC)var0.npcs.get((long)var4);
				if (var5.field1165) {
					var5.definition = null;
					var5.detach();
				}
			}

			if (var2.offset * 2108391709 != Client.packetWriter.serverPacketLength) {
				throw new RuntimeException(var2.offset * 2108391709 + "," + Client.packetWriter.serverPacketLength);
			}
		}
	}
}
