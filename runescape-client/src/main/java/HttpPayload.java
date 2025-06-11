import java.io.UnsupportedEncodingException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ue")
@Implements("HttpPayload")
public interface HttpPayload {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lup;",
		garbageValue = "329585455"
	)
	@Export("getContentType")
	HttpContentType getContentType();

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "2037324047"
	)
	@Export("toBytes")
	byte[] toBytes() throws UnsupportedEncodingException;
}
