import java.io.UnsupportedEncodingException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uz")
@Implements("HttpPayload")
public interface HttpPayload {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Luj;",
		garbageValue = "36"
	)
	@Export("getContentType")
	HttpContentType getContentType();

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-1695762497"
	)
	@Export("toBytes")
	byte[] toBytes() throws UnsupportedEncodingException;
}
