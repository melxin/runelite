import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ke")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 97383685
	)
	@Export("x")
	int x;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1754978191
	)
	@Export("y")
	int y;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1294340687
	)
	@Export("z")
	int z;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 802759063
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	}

	@ObfuscatedSignature(
		descriptor = "(Lke;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x;
		this.y = var1.y;
		this.z = var1.z;
		this.magnitude = var1.magnitude;
	}

	@ObfuscatedName("nr")
	@ObfuscatedSignature(
		descriptor = "([Lof;II)V",
		garbageValue = "-697477978"
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

					if (var3.childIndex * 2077538819 == -1) {
						InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
						if (var4 != null) {
							class520.runIntfCloseListeners(var4.group, var1);
						}
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) {
					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onDialogAbort;
					class141.runScriptEvent(var5);
				}

				if (var1 == 1 && var3.onSubChange != null) {
					if (var3.childIndex * 2077538819 >= 0) {
						Widget var6 = class226.widgetDefinition.method7728(var3.id);
						if (var6 == null || var6.children == null || var3.childIndex * 2077538819 >= var6.children.length || var3 != var6.children[var3.childIndex * 2077538819]) {
							continue;
						}
					}

					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onSubChange;
					class141.runScriptEvent(var5);
				}
			}
		}

	}
}
