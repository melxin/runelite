import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("ab")
	static final int[] field2251;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("VarbitDefinition_archive")
	static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("VarbitDefinition_cached")
	static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -424286569
	)
	static int field2252;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 83079267
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 214779061
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1044356817
	)
	@Export("endBit")
	public int endBit;

	static {
		field2251 = new int[32];
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64);
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			field2251[var1] = var0 - 1;
			var0 += var0;
		}

	}

	VarbitComposition() {
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "-646659546"
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lwj;II)V",
		garbageValue = "-347454728"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.baseVar = var1.readUnsignedShort();
			this.startBit = var1.readUnsignedByte();
			this.endBit = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpe;Lpe;Lpe;Ljava/util/ArrayList;I)Z",
		garbageValue = "-392973640"
	)
	public static boolean method4589(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, ArrayList var3) {
		WorldMapEvent.field3518 = var0;
		AsyncHttpResponse.field76 = var1;
		class338.field3895 = var2;
		class338.field3900 = var3;
		return true;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZB)I",
		garbageValue = "1"
	)
	static int method4588(int var0, Script var1, boolean var2) {
		if (var0 == 7463) {
			boolean var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
			class137.method3793(var3);
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(Lwe;I)Ljava/lang/Object;",
		garbageValue = "1871787849"
	)
	static Object method4590(class572 var0) {
		if (var0 == null) {
			throw new IllegalStateException("popValueOfType() failure - null baseVarType");
		} else {
			switch(var0.field5881) {
			case 1:
				return Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
			case 2:
				return Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type");
			}
		}
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "-23"
	)
	static void method4587(int var0, String var1) {
		int var2 = Client.playerUpdateManager.playerCount;
		int[] var3 = Client.playerUpdateManager.playerIndices;
		boolean var4 = false;
		Username var5 = new Username(var1, class147.loginType);
		WorldView var6 = Client.worldViewManager.getWorldView();
		if (var6 == null) {
			class292.addGameMessage(4, "", "Unable to find " + var1 + ", current world null.");
		} else {
			for (int var7 = 0; var7 < var2; ++var7) {
				Player var8 = (Player)var6.players.get((long)var3[var7]);
				if (var8 != null && var8 != class159.localPlayer && var8.username != null && var8.username.equals(var5)) {
					PacketBufferNode var9;
					if (var0 == 1) {
						var9 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeByte(0);
						var9.packetBuffer.writeShort(var3[var7]);
						Client.packetWriter.addNode(var9);
					} else if (var0 == 4) {
						var9 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeByte(0);
						var9.packetBuffer.writeShortAdd(var3[var7]);
						Client.packetWriter.addNode(var9);
					} else if (var0 == 6) {
						var9 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeShortAdd(var3[var7]);
						var9.packetBuffer.writeByteAdd(0);
						Client.packetWriter.addNode(var9);
					} else if (var0 == 7) {
						var9 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeByteAdd(0);
						var9.packetBuffer.writeShort(var3[var7]);
						Client.packetWriter.addNode(var9);
					}

					var4 = true;
					break;
				}
			}

			if (!var4) {
				class292.addGameMessage(4, "", "Unable to find " + var1);
			}

		}
	}
}
