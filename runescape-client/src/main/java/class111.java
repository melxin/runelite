import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
final class class111 implements class351 {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	final Widget val$item;

	@ObfuscatedSignature(
		descriptor = "(Lna;)V"
	)
	class111(Widget var1) {
		this.val$item = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1894647927"
	)
	public void vmethod7020() {
		if (this.val$item.method7447().field3802 != null) {
			ScriptEvent var1 = new ScriptEvent();
			var1.method2628(this.val$item);
			var1.setArgs(this.val$item.method7447().field3802);
			WorldMapElement.method5196().addFirst(var1);
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lae;B)Lao;",
		garbageValue = "103"
	)
	public static class3 method3126(class6 var0) {
		switch(var0.field15) {
		case 0:
			return new class0();
		default:
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(Ldz;ZLvv;I)V",
		garbageValue = "850337230"
	)
	@Export("updateNpcs")
	static final void updateNpcs(WorldView var0, boolean var1, PacketBuffer var2) {
		Client.field635 = 0;
		Client.npcCount = 0;
		class223.method5008(var0, var2);

		int var4;
		while (true) {
			byte var3 = 16;
			var4 = 1 << var3;
			if (var2.bitsRemaining(Client.packetWriter.serverPacketLength) < var3 + 12) {
				break;
			}

			int var5 = var2.readBits(var3);
			if (var5 == var4 - 1) {
				break;
			}

			int var6 = IntProjection.field1966;
			boolean var7 = false;
			if (var0.npcs[var5] == null) {
				var0.npcs[var5] = new NPC();
				var7 = true;
			}

			NPC var8 = var0.npcs[var5];
			var8.field1350 = var6;
			var0.npcIndices[++var0.npcCount - 1] = var5;
			var8.npcCycle = Client.cycle;
			int var11;
			if (var1) {
				var11 = var2.readBits(8);
				if (var11 > 127) {
					var11 -= 256;
				}
			} else {
				var11 = var2.readBits(6);
				if (var11 > 31) {
					var11 -= 64;
				}
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

			boolean var12 = var2.readBits(1) == 1;
			if (var12) {
				var2.readBits(32);
			}

			var8.definition = FadeOutTask.getNpcDefinition(var2.readBits(14));
			int var9 = var2.readBits(1);
			int var13 = Client.defaultRotations[var2.readBits(3)];
			if (var7) {
				var8.orientation = var8.rotation = var13;
			}

			int var14 = var2.readBits(1);
			if (var14 == 1) {
				Client.npcIndices[++Client.npcCount - 1] = var5;
			}

			WorldViewManager.method2736(var8);
			if (var8.field1200 == 0) {
				var8.rotation = 0;
			}

			var8.method3049(var10 + class277.field3055, var11 + class221.field2426, var9 == 1);
		}

		var2.exportIndex();
		AbstractUserComparator.method9189(var0, var2);

		int var15;
		for (var15 = 0; var15 < Client.field635; ++var15) {
			var4 = Client.field537[var15];
			if (var0.npcs[var4].npcCycle != Client.cycle) {
				var0.npcs[var4].definition = null;
				var0.npcs[var4] = null;
			}
		}

		if (var2.offset != Client.packetWriter.serverPacketLength) {
			throw new RuntimeException(var2.offset + "," + Client.packetWriter.serverPacketLength);
		} else {
			for (var15 = 0; var15 < var0.npcCount; ++var15) {
				if (var0.npcs[var0.npcIndices[var15]] == null) {
					throw new RuntimeException(var15 + "," + var0.npcCount);
				}
			}

		}
	}
}
