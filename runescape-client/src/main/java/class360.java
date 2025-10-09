import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
public class class360 {
	@ObfuscatedName("af")
	public static short[][] field4079;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	static AbstractArchive HitSplatDefinition_fontsArchive;

	@ObfuscatedName("pi")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-83"
	)
	static void method7519() {
		if (Occluder.field2830 != null) {
			Client.field363 = Client.cycle;
			Occluder.field2830.method8604();
			Iterator var0 = class547.topLevelWorldView.players.iterator();

			while (var0.hasNext()) {
				Player var1 = (Player)var0.next();
				Occluder.field2830.method8608((var1.x >> 7) + class547.topLevelWorldView.baseX, (var1.y >> 7) + class547.topLevelWorldView.baseY);
			}
		}

	}
}
