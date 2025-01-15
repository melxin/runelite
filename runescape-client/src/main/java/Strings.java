import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ox")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("fc")
	public static String field4301;
	@ObfuscatedName("kg")
	public static String field4256;
	@ObfuscatedName("ki")
	public static String field4410;
	@ObfuscatedName("ln")
	public static String field4439;

	static {
		field4301 = "Please visit the support page for assistance.";
		field4256 = "";
		field4410 = "Page has opened in the browser.";
		field4439 = "";
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(Lmb;B)V",
		garbageValue = "71"
	)
	static void method7645(PacketBufferNode var0) {
		var0.packetBuffer.writeIntLE(class221.field2421.hash);
		var0.packetBuffer.writeIntLE(class220.archive13.hash);
		var0.packetBuffer.writeInt(class544.archive6.hash);
		var0.packetBuffer.writeIntME(ClanSettings.field1762.hash);
		var0.packetBuffer.writeIntLE(PcmPlayer.archive8.hash);
		var0.packetBuffer.writeIntLE(class166.archive10.hash);
		var0.packetBuffer.writeIntIME(World.soundEffectsArchive.hash);
	}
}
