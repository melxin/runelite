import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jb")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -90686671
	)
	@Export("z")
	int z;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1625205487
	)
	@Export("x")
	int x;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -162090531
	)
	@Export("y")
	int y;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		longValue = 4918541364835131357L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 2067113767
	)
	@Export("height")
	int height;

	ItemLayer() {
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "794763681"
	)
	public static int method5258(int var0) {
		return (var0 & class592.field5964) - 1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1241537630"
	)
	public static void method5256(int var0, int var1, int var2, int var3) {
		class345.musicPlayerStatus = var0;
		class345.field3931 = var1;
		class345.field3932 = var2;
		class345.field3926 = var3;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lut;Lut;IIII)V",
		garbageValue = "-44564641"
	)
	public static void method5257(DynamicArray var0, DynamicArray var1, int var2, int var3, int var4) {
		class585.method11429(var0);
		ArchiveDiskActionHandler.method8530(var1, var0.field5584);
		int var5 = var0.method10652();
		int var6 = var1.method10652();
		if (var4 == -1) {
			var4 = var0.method10652() - var2;
		}

		if (var4 != 0 && (var1 != var0 || var3 != var2)) {
			if (var2 >= 0 && var2 + var4 <= var5 && var3 >= 0 && var3 + var4 <= var6) {
				HttpResponse.method296(var0, var2, var1, var3, var4);
			} else {
				throw new RuntimeException();
			}
		}
	}

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1697542444"
	)
	static void method5255(int var0, String var1) {
		int var2 = Client.playerUpdateManager.playerCount;
		int[] var3 = Client.playerUpdateManager.playerIndices;
		boolean var4 = false;
		Username var5 = new Username(var1, LoginScreenAnimation.loginType);
		WorldView var6 = Client.worldViewManager.getWorldView();
		if (var6 == null) {
			class356.addGameMessage(4, "", "Unable to find " + var1 + ", current world null.");
		} else {
			for (int var7 = 0; var7 < var2; ++var7) {
				Player var8 = (Player)var6.players.get((long)var3[var7]);
				if (var8 != null && var8 != class330.localPlayer && var8.username != null && var8.username.equals(var5)) {
					PacketBufferNode var9;
					if (var0 == 1) {
						var9 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeShortLE(0);
						var9.packetBuffer.writeShort(var3[var7]);
						Client.packetWriter.addNode(var9);
					} else if (var0 == 4) {
						var9 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeShort(var3[var7]);
						var9.packetBuffer.writeByteSub(0);
						Client.packetWriter.addNode(var9);
					} else if (var0 == 6) {
						var9 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeShort(var3[var7]);
						var9.packetBuffer.writeByteSub(0);
						Client.packetWriter.addNode(var9);
					} else if (var0 == 7) {
						var9 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeShortAdd(var3[var7]);
						var9.packetBuffer.writeShortLE(0);
						Client.packetWriter.addNode(var9);
					}

					var4 = true;
					break;
				}
			}

			if (!var4) {
				class356.addGameMessage(4, "", "Unable to find " + var1);
			}

		}
	}
}
