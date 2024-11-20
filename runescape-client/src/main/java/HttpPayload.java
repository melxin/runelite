import java.io.UnsupportedEncodingException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tc")
@Implements("HttpPayload")
public interface HttpPayload {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lto;",
		garbageValue = "1892648748"
	)
	@Export("getContentType")
	HttpContentType getContentType();

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-1854248554"
	)
	@Export("toBytes")
	byte[] toBytes() throws UnsupportedEncodingException;
}
