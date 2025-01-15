import java.io.UnsupportedEncodingException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tn")
@Implements("HttpPayload")
public interface HttpPayload {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ltw;",
		garbageValue = "-546778474"
	)
	@Export("getContentType")
	HttpContentType getContentType();

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "613600609"
	)
	@Export("toBytes")
	byte[] toBytes() throws UnsupportedEncodingException;
}
