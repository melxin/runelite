import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qj")
public class class433 {
	@ObfuscatedName("ab")
	@Export("cp1252AsciiExtension")
	public static final char[] cp1252AsciiExtension;

	static {
		cp1252AsciiExtension = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'};
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lrc;",
		garbageValue = "-1340374633"
	)
	public static class443 method8185() {
		synchronized(class443.field4905) {
			if (class443.field4903 == 0) {
				return new class443();
			} else {
				class443.field4905[--class443.field4903].method8355();
				return class443.field4905[class443.field4903];
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1798900048"
	)
	public static void method8178(int var0) {
		if (!class335.midiRequests.isEmpty()) {
			Iterator var1 = class335.midiRequests.iterator();

			while (var1.hasNext()) {
				MidiRequest var2 = (MidiRequest)var1.next();
				if (var2 != null) {
					var2.musicTrackVolume = var0;
				}
			}

			MidiRequest var3 = (MidiRequest)class335.midiRequests.get(0);
			if (var3 != null && var3.midiPcmStream != null && var3.midiPcmStream.isReady() && !var3.field3807) {
				var3.midiPcmStream.setPcmStreamVolume(var0);
				var3.field3803 = (float)var0;
			}
		}

	}
}
