import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("he")
@Implements("StructComposition")
public class StructComposition extends DualNode {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("StructDefinition_archive")
	static AbstractArchive StructDefinition_archive;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("StructDefinition_cached")
	public static EvictingDualNodeHashTable StructDefinition_cached;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
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
		garbageValue = "1659096186"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "-463159214"
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lwj;IB)V",
		garbageValue = "-86"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = class391.readStringIntParameters(var1, this.params);
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1462305799"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return FileSystem.method5911(this.params, var1, var2);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1288460257"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return KeyHandler.method391(this.params, var1, var2);
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(Ldj;Lwk;I)V",
		garbageValue = "1507664363"
	)
	static final void method4518(WorldView var0, PacketBuffer var1) {
		var1.importIndex();
		int var2 = var1.readBits(8);
		int var3;
		int var4;
		NPC var5;
		if (var2 < var0.field1150.method9810()) {
			for (var3 = var2; var3 < var0.field1150.method9810(); ++var3) {
				var4 = var0.field1150.method9817(var3);
				Client.field494[++Client.field370 - 1] = var4;
				var5 = (NPC)var0.npcs.get((long)var4);
				var5.field1165 = true;
			}
		}

		if (var2 > var0.field1150.method9810()) {
			throw new RuntimeException("");
		} else {
			var0.field1150.method9809();

			for (var3 = 0; var3 < var2; ++var3) {
				var4 = var0.field1150.method9817(var3);
				var5 = (NPC)var0.npcs.get((long)var4);
				int var6 = var1.readBits(1);
				if (var6 == 0) {
					var0.field1150.method9808(var4);
				} else {
					int var7 = var1.readBits(2);
					if (var7 == 0) {
						var0.field1150.method9808(var4);
						Client.npcIndices[++Client.npcCount - 1] = var4;
					} else {
						int var8;
						int var9;
						if (var7 == 1) {
							var0.field1150.method9808(var4);
							var8 = var1.readBits(3);
							var5.method2667(var8, MoveSpeed.field3194);
							var9 = var1.readBits(1);
							if (var9 == 1) {
								Client.npcIndices[++Client.npcCount - 1] = var4;
							}
						} else if (var7 == 2) {
							var0.field1150.method9808(var4);
							if (var1.readBits(1) == 1) {
								var8 = var1.readBits(3);
								var5.method2667(var8, MoveSpeed.field3197);
								var9 = var1.readBits(3);
								var5.method2667(var9, MoveSpeed.field3197);
							} else {
								var8 = var1.readBits(3);
								var5.method2667(var8, MoveSpeed.field3192);
							}

							var8 = var1.readBits(1);
							if (var8 == 1) {
								Client.npcIndices[++Client.npcCount - 1] = var4;
							}
						} else if (var7 == 3) {
							Client.field494[++Client.field370 - 1] = var4;
							var5.field1165 = true;
						}
					}
				}
			}

		}
	}
}
