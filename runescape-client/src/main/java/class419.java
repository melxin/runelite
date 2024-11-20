import java.util.regex.Pattern;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qg")
public final class class419 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -862854739
	)
	@Export("KitDefinition_fileCount")
	public static int KitDefinition_fileCount;
	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	static Archive field4733;

	static {
		Pattern.compile("^\\D*(\\d+)\\D*$");
	}
}
