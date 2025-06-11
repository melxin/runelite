import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vb")
final class class564 implements class558 {
	@ObfuscatedName("iu")
	static Iterator field5606;

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lwt;I)V",
		garbageValue = "872276318"
	)
	public void vmethod10652(Object var1, Buffer var2) {
		this.method10654((String)var1, var2);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lwt;B)Ljava/lang/Object;",
		garbageValue = "-108"
	)
	public Object vmethod10657(Buffer var1) {
		return var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lwt;I)V",
		garbageValue = "-991662182"
	)
	void method10654(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1);
	}

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1878851311"
	)
	static void method10658(int var0, int var1, int var2, int var3) {
		Widget var4 = ClientPreferences.widgetDefinition.getWidgetChild(var0, var1);
		if (var4 != null && var4.onTargetEnter != null) {
			ScriptEvent var5 = new ScriptEvent();
			var5.widget = var4;
			var5.args = var4.onTargetEnter;
			ModeWhere.runScriptEvent(var5);
		}

		Client.selectedSpellItemId = var3;
		Client.isSpellSelected = true;
		class394.selectedSpellWidget = var0;
		Client.selectedSpellChildIndex = var1;
		class448.selectedSpellFlags = var2;
		ScriptFrame.invalidateWidget(var4);
	}
}
