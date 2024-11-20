import java.util.Iterator;
import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
public class class136 implements Callable {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	final class137 field1565;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	final class138 field1562;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class139 field1563;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1181092049
	)
	final int field1569;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;Lfm;Lfo;Lfv;I)V"
	)
	class136(class145 var1, class137 var2, class138 var3, class139 var4, int var5) {
		this.this$0 = var1;
		this.field1565 = var2;
		this.field1562 = var3;
		this.field1563 = var4;
		this.field1569 = var5;
	}

	public Object call() {
		this.field1565.method3328();
		class137[][] var1;
		if (this.field1562 == class138.field1597) {
			var1 = this.this$0.field1642;
		} else {
			var1 = this.this$0.field1644;
		}

		var1[this.field1569][this.field1563.method3379()] = this.field1565;
		return null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1465019677"
	)
	public static boolean method3321() {
		ReflectionCheck var0 = (ReflectionCheck)class36.reflectionChecks.last();
		return var0 != null;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static void method3325() {
		Iterator var0 = class333.musicSongs.iterator();

		while (var0.hasNext()) {
			MusicSong var1 = (MusicSong)var0.next();
			if (var1 != null) {
				var1.midiPcmStream.clear();
				var1.midiPcmStream.method6594();
				var1.midiPcmStream.setPcmStreamVolume(0);
				var1.midiPcmStream.field3667 = 0;
				Projection.method5195(var1.musicTrackGroupId, var1.musicTrackFileId);
			}
		}

		class333.musicSongs.clear();
	}
}
