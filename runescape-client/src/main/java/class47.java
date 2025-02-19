import java.util.concurrent.locks.ReentrantLock;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bl")
public class class47 {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -9823127
	)
	@Export("cacheGamebuild")
	static int cacheGamebuild;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lcp;"
	)
	VorbisSample field324;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lbq;"
	)
	RawSound field322;
	@ObfuscatedName("au")
	ReentrantLock field323;

	@ObfuscatedSignature(
		descriptor = "(Lcp;Lbq;)V"
	)
	class47(VorbisSample var1, RawSound var2) {
		this.field324 = var1;
		this.field322 = var2;
		this.field323 = new ReentrantLock();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1542998886"
	)
	public static boolean method859(int var0) {
		return var0 >= WorldMapDecorationType.field4131.id && var0 <= WorldMapDecorationType.field4135.id || var0 == WorldMapDecorationType.field4120.id;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ldp;Lvy;IIIIIII)V",
		garbageValue = "973273324"
	)
	@Export("loadTerrain")
	static final void loadTerrain(WorldView var0, Buffer var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int[][][] var8 = var0.tileHeights;
		byte[][][] var9 = var0.tileSettings;
		int var10;
		if (var2 >= 0 && var2 < 4 && var3 >= 0 && var3 < var8[0].length - 1 && var4 >= 0 && var4 < var8[0][0].length - 1) {
			var9[var2][var3][var4] = 0;

			while (true) {
				var10 = var1.readUnsignedShort();
				if (var10 == 0) {
					if (var2 == 0) {
						var8[0][var3][var4] = -class59.method1135(var5 + 932731, var6 + 556238) * 8;
					} else {
						var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - 240;
					}
					break;
				}

				if (var10 == 1) {
					int var11 = var1.readUnsignedByte();
					if (var11 == 1) {
						var11 = 0;
					}

					if (var2 == 0) {
						var8[0][var3][var4] = -var11 * 8;
					} else {
						var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - var11 * 8;
					}
					break;
				}

				if (var10 <= 49) {
					Tiles.Tiles_overlays[var2][var3][var4] = (short)var1.readShort();
					Tiles.Tiles_shapes[var2][var3][var4] = (byte)((var10 - 2) / 4);
					Tiles.field1047[var2][var3][var4] = (byte)(var10 - 2 + var7 & 3);
				} else if (var10 <= 81) {
					var9[var2][var3][var4] = (byte)(var10 - 49);
				} else {
					Tiles.Tiles_underlays[var2][var3][var4] = (short)(var10 - 81);
				}
			}
		} else {
			while (true) {
				var10 = var1.readUnsignedShort();
				if (var10 == 0) {
					break;
				}

				if (var10 == 1) {
					var1.readUnsignedByte();
					break;
				}

				if (var10 <= 49) {
					var1.readShort();
				}
			}
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-13533213"
	)
	public static void method857() {
		KitDefinition.KitDefinition_cached.clear();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2053744818"
	)
	public static void method860() {
		class335.field3689.clear();
	}

	@ObfuscatedName("ov")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "18"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (class7.friendsChat != null) {
			PacketBufferNode var1 = class272.getPacketBufferNode(ClientPacket.CLAN_KICKUSER, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(AsyncRestClient.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
