import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kj")
public class class278 implements Comparator {
	class278() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lkn;Lkn;I)I",
		garbageValue = "-1085068041"
	)
	int method5967(class271 var1, class271 var2) {
		return var1.method5832() - var2.method5832();
	}

	public int compare(Object var1, Object var2) {
		return this.method5967((class271)var1, (class271)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;S)I",
		garbageValue = "-24914"
	)
	public static int method5972(CharSequence var0) {
		return class141.method3510(var0, 10, true);
	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "280658968"
	)
	static void method5969() {
		if (Client.isSpellSelected) {
			Widget var0 = ClanChannel.widgetDefinition.getWidgetChild(class33.selectedSpellWidget, Client.selectedSpellChildIndex);
			if (var0 != null && var0.onTargetLeave != null) {
				ScriptEvent var1 = new ScriptEvent();
				var1.widget = var0;
				var1.args = var0.onTargetLeave;
				Friend.runScriptEvent(var1);
			}

			Client.selectedSpellItemId = -1;
			Client.isSpellSelected = false;
			UserComparator8.invalidateWidget(var0);
		}
	}
}
