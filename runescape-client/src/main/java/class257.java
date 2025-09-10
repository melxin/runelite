import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jg")
public class class257 {
	@ObfuscatedName("vu")
	@ObfuscatedGetter(
		intValue = -149712381
	)
	static int field3087;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	public UrlRequest field3088;
	@ObfuscatedName("aw")
	public float[] field3086;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	final class267 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lkm;)V"
	)
	class257(class267 var1) {
		this.this$0 = var1;
		this.field3086 = new float[4];
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-35"
	)
	public static void method5884(int var0, int var1) {
		LoginState.method791(var0, var1, 0, 0);
		class339.field3889.clear();
		class339.field3892.clear();
		if (class339.midiRequests.isEmpty() || var0 == 0 && var1 == 0) {
			FloatProjection.method5344();
		} else {
			class339.field3892.add(new DelayFadeTask((SongTask)null, class339.musicPlayerStatus));
			class339.field3892.add(new FadeOutTask((SongTask)null, 0, false, class339.field3896));
			ArrayList var3 = new ArrayList();
			Iterator var4 = class339.midiRequests.iterator();

			while (var4.hasNext()) {
				MidiRequest var5 = (MidiRequest)var4.next();
				var3.add(var5);
			}

			class339.field3892.add(new class472((SongTask)null, var3));
		}

	}
}
