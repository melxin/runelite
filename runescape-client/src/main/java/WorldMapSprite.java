import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lr")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
	@ObfuscatedName("aw")
	@Export("tileColors")
	final int[] tileColors;

	WorldMapSprite() {
		this.tileColors = new int[4096];
	}

	WorldMapSprite(int[] var1) {
		this.tileColors = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-415338614"
	)
	@Export("getTileColor")
	final int getTileColor(int var1, int var2) {
		return this.tileColors[var2 * 64 + var1];
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljava/lang/Object;",
		garbageValue = "1767237666"
	)
	static Object[] method6826() {
		String var0 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
		Object[] var1 = new Object[var0.length()];

		for (int var2 = var0.length() - 1; var2 >= 0; --var2) {
			if (var0.charAt(var2) == 'i') {
				var1[var2] = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
			} else {
				var1[var2] = Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
			}
		}

		return var1;
	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(Ldr;ZLwf;I)V",
		garbageValue = "2029327651"
	)
	@Export("updateNpcs")
	static final void updateNpcs(WorldView var0, boolean var1, PacketBuffer var2) {
		Client.field372 = 0;
		Client.npcCount = 0;
		class352.method7392(var0, var2);
		StudioGame.method8199(var0, var1, var2);
		DirectByteArrayCopier.method8141(var0, var2);

		for (int var3 = 0; var3 < Client.field372; ++var3) {
			int var4 = Client.field360[var3];
			NPC var5 = (NPC)var0.npcs.get((long)var4);
			if (var5.field1188) {
				var5.definition = null;
				var5.detach();
			}
		}

		if (var2.offset * 1216585693 != Client.packetWriter.serverPacketLength) {
			throw new RuntimeException(var2.offset * 1216585693 + "," + Client.packetWriter.serverPacketLength);
		}
	}
}
