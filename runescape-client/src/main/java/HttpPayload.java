import java.io.UnsupportedEncodingException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tl")
@Implements("HttpPayload")
public interface HttpPayload {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ltd;",
		garbageValue = "1646819902"
	)
	@Export("getContentType")
	HttpContentType getContentType();

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "31815673"
	)
	@Export("toBytes")
	byte[] toBytes() throws UnsupportedEncodingException;
}
