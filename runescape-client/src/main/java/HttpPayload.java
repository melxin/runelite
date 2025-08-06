import java.io.UnsupportedEncodingException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ue")
@Implements("HttpPayload")
public interface HttpPayload {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lum;",
		garbageValue = "2011415999"
	)
	@Export("getContentType")
	HttpContentType getContentType();

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-225917004"
	)
	@Export("toBytes")
	byte[] toBytes() throws UnsupportedEncodingException;
}
