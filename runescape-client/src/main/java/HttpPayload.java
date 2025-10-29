import java.io.UnsupportedEncodingException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uu")
@Implements("HttpPayload")
public interface HttpPayload {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Lur;",
		garbageValue = "1163055413"
	)
	@Export("getContentType")
	HttpContentType getContentType();

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-1948694789"
	)
	@Export("toBytes")
	byte[] toBytes() throws UnsupportedEncodingException;
}
