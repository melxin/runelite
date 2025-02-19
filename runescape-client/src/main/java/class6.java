import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ao")
public enum class6 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	@Export("USERNAME_PASSWORD_REMEMBER")
	USERNAME_PASSWORD_REMEMBER(0, 0);

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 592035307
	)
	final int field17;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1927951115
	)
	final int field16;

	class6(int var3, int var4) {
		this.field17 = var3;
		this.field16 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field16;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpl;I)V",
		garbageValue = "-1755559997"
	)
	public static void method40(AbstractArchive var0) {
		FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-78"
	)
	public static boolean method39() {
		if (!class335.field3694.isEmpty()) {
			return true;
		} else {
			return !class335.midiRequests.isEmpty() && class335.midiRequests.get(0) != null && ((MidiRequest)class335.midiRequests.get(0)).midiPcmStream != null ? ((MidiRequest)class335.midiRequests.get(0)).midiPcmStream.isReady() : false;
		}
	}
}
