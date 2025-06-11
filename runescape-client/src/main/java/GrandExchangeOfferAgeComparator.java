import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pd")
@Implements("GrandExchangeOfferAgeComparator")
final class GrandExchangeOfferAgeComparator implements Comparator {
	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("mi")
	@ObfuscatedGetter(
		intValue = -113374809
	)
	@Export("cameraZ")
	static int cameraZ;

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpf;Lpf;I)I",
		garbageValue = "817586189"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.age < var2.age ? -1 : (var1.age == var2.age ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lcs;IIB)V",
		garbageValue = "-44"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args;
		Script var4;
		if (class443.isWorldMapEvent(var0.type)) {
			class383.worldMapEvent = (WorldMapEvent)var3[0];
			WorldMapElement var6 = InvDefinition.WorldMapElement_get(class383.worldMapEvent.mapElement);
			var4 = MoveSpeed.getWorldMapScript(var0.type, var6.objectId, var6.category);
		} else {
			int var5 = (Integer)var3[0];
			var4 = class191.getScript(var5);
		}

		if (var4 != null) {
			class561.runScriptLogic(var0, var4, var1, var2);
		}

	}
}
