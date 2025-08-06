import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sd")
@Implements("DelayFadeTask")
public class DelayFadeTask extends SongTask {
	@ObfuscatedName("az")
	static int[] field5175;
	@ObfuscatedName("ld")
	static String field5180;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = 287224077443550231L
	)
	long field5177;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 748008633
	)
	int field5176;

	@ObfuscatedSignature(
		descriptor = "(Lsj;I)V"
	)
	public DelayFadeTask(SongTask var1, int var2) {
		super(var1);
		this.field5176 = var2;
		super.field5191 = "DelayFadeTask";
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1329200530"
	)
	public boolean vmethod9672() {
		if (this.field5177 < (long)this.field5176) {
			++this.field5177;
			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "([Lox;II)V",
		garbageValue = "547382223"
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

					if (var3.childIndex * -64977777 == -1) {
						InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
						if (var4 != null) {
							HttpResponse.runIntfCloseListeners(var4.group, var1);
						}
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) {
					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onDialogAbort;
					SequenceDefinition.runScriptEvent(var5);
				}

				if (var1 == 1 && var3.onSubChange != null) {
					if (var3.childIndex * -64977777 >= 0) {
						Widget var6 = class167.widgetDefinition.method7456(var3.id);
						if (var6 == null || var6.children == null || var3.childIndex * -64977777 >= var6.children.length || var3 != var6.children[var3.childIndex * -64977777]) {
							continue;
						}
					}

					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onSubChange;
					SequenceDefinition.runScriptEvent(var5);
				}
			}
		}

	}
}
