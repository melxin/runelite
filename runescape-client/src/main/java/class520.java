import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uu")
public class class520 extends class522 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -16728215
	)
	int field5234;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1491212959
	)
	int field5235;

	public class520(int var1, int var2, int var3, int var4) {
		super(var3, var4);
		this.field5234 = 0;
		this.field5235 = 0;
		this.field5234 = var1;
		this.field5235 = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "45"
	)
	public int method9485() {
		double var1 = this.method9502();
		return (int)Math.round((double)(this.field5235 - this.field5234) * var1 + (double)this.field5234);
	}

	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "([Lnp;II)V",
		garbageValue = "1631211673"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null) {
				if (var3.type == 0) {
					if (var3.children != null) {
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
					if (var4 != null) {
						World.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) {
					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onDialogAbort;
					WorldMapEvent.runScriptEvent(var5);
				}

				if (var1 == 1 && var3.onSubChange != null) {
					if (var3.childIndex >= 0) {
						Widget var6 = class379.widgetDefinition.method6875(var3.id);
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) {
							continue;
						}
					}

					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onSubChange;
					WorldMapEvent.runScriptEvent(var5);
				}
			}
		}

	}
}
