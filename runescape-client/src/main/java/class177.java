import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
public class class177 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("field1913")
	public static EvictingDualNodeHashTable field1913;

	static {
		field1913 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lit;",
		garbageValue = "2089769349"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class279.ObjectDefinition_archive.takeFile(6, var0);
			var1 = new ObjectComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			if (var1.isSolid) {
				var1.interactType = 0;
				var1.boolean1 = false;
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "460942908"
	)
	public static void method3764(int var0, int var1) {
		ClientPreferences.method2821(var0, var1, 0, 0);
		class335.field3689.clear();
		class335.field3694.clear();
		if (class335.midiRequests.isEmpty() || var0 == 0 && var1 == 0) {
			GrandExchangeOffer.method7838();
		} else {
			class335.field3694.add(new DelayFadeTask((SongTask)null, class335.musicPlayerStatus));
			class335.field3694.add(new FadeOutTask((SongTask)null, 0, false, class335.field3693));
			ArrayList var2 = AbstractWorldMapData.method6246();
			class335.field3694.add(new class459((SongTask)null, var2));
		}

	}
}
