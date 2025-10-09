import java.io.UnsupportedEncodingException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ub")
@Implements("HttpPayload")
public interface HttpPayload {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Luw;",
		garbageValue = "48"
	)
	@Export("getContentType")
	HttpContentType getContentType();

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-807473489"
	)
	@Export("toBytes")
	byte[] toBytes() throws UnsupportedEncodingException;
}
