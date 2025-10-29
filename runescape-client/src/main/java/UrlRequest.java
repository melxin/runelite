import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1574906825
	)
	static int field1544;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1859359931
	)
	static int field1541;
	@ObfuscatedName("js")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "[Lxm;"
	)
	static IndexedSprite[] field1542;
	@ObfuscatedName("ag")
	final URL field1546;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -546326971
	)
	volatile int field1543;
	@ObfuscatedName("ae")
	@Export("response0")
	volatile byte[] response0;

	static {
		field1544 = -1;
		field1541 = -2;
	}

	UrlRequest(URL var1) {
		this.field1543 = field1544;
		this.field1546 = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1741769013"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.field1543 != field1544;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "125"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-218505900"
	)
	public String method3660() {
		return this.field1546.toString();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Ljt;",
		garbageValue = "1219846436"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			var1 = class142.method3884(class152.SequenceDefinition_animationsArchive, WorldMapIcon_0.SpotAnimationDefinition_archive, var0);
			if (var1 != null) {
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var1, (long)var0);
			}

			return var1;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfi;",
		garbageValue = "2"
	)
	static class137 method3673(int var0) {
		class137 var1 = (class137)GrandExchangeOffer.findEnumerated(PlayerUpdateManager.method2982(), var0);
		if (var1 == null) {
			var1 = class137.field1637;
		}

		return var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ldn;I)V",
		garbageValue = "-4718732"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false;
		if (var0.sound != null) {
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1);
		}

	}
}
