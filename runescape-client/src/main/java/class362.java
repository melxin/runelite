import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ne")
public class class362 {
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = -856805301
	)
	static int field4087;
	@ObfuscatedName("tm")
	@ObfuscatedGetter(
		intValue = -13193731
	)
	static int field4083;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	UrlRequest field4084;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lxl;"
	)
	SpritePixels field4085;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Leu;)V"
	)
	class362(String var1, UrlRequester var2) {
		try {
			this.field4084 = var2.request(new URL(var1));
		} catch (MalformedURLException var4) {
			this.field4084 = null;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Lez;)V"
	)
	class362(UrlRequest var1) {
		this.field4084 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lxl;",
		garbageValue = "-112203336"
	)
	SpritePixels method7533() {
		if (this.field4085 == null && this.field4084 != null && this.field4084.isDone()) {
			if (this.field4084.getResponse() != null) {
				this.field4085 = EnumComposition.readSpritePixelsFromBytes(this.field4084.getResponse());
			}

			this.field4084 = null;
		}

		return this.field4085;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "1906994754"
	)
	static final void method7531(String var0, int var1) {
		PacketBufferNode var2 = HorizontalAlignment.getPacketBufferNode(ClientPacket.FRIEND_CHAT_SETRANK, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(WorldMapArea.stringCp1252NullTerminatedByteSize(var0) + 1);
		var2.packetBuffer.writeStringCp1252NullTerminated(var0);
		var2.packetBuffer.writeByteAdd(var1);
		Client.packetWriter.addNode(var2);
	}
}
