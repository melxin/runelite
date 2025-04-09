import java.io.UnsupportedEncodingException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("th")
@Implements("HttpPayload")
public interface HttpPayload {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Ltw;",
		garbageValue = "-1690276926"
	)
	@Export("getContentType")
	HttpContentType getContentType();

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-620592685"
	)
	@Export("toBytes")
	byte[] toBytes() throws UnsupportedEncodingException;
}
