import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lb")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	static final WorldMapID field3307;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	static final WorldMapID field3308;
	@ObfuscatedName("ak")
	@Export("osName")
	static String osName;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1167897365
	)
	@Export("value")
	final int value;

	static {
		field3307 = new WorldMapID(0);
		field3308 = new WorldMapID(1);
	}

	WorldMapID(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("aj")
	public static String method6627(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (var0 % 37L == 0L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; 0L != var3; var3 /= 37L) {
					++var2;
				}

				StringBuilder var5 = new StringBuilder(var2);

				while (var0 != 0L) {
					long var6 = var0;
					var0 /= 37L;
					var5.append(class440.base37Table[(int)(var6 - 37L * var0)]);
				}

				return var5.reverse().toString();
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1805360819"
	)
	static void method6628(int var0) {
		PacketBufferNode var1 = class139.getPacketBufferNode(ClientPacket.SET_HEADING, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(var0);
		Client.packetWriter.addNode(var1);
	}
}
