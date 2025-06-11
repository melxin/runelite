import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kv")
public class class278 {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 733853031
	)
	static int field3123;

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Ljk;",
		garbageValue = "-1289643924"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			AbstractArchive var3 = SequenceDefinition.SequenceDefinition_animationsArchive;
			AbstractArchive var4 = WorldMapSection1.SpotAnimationDefinition_archive;
			boolean var5 = true;
			int var6 = -1;
			int[] var7 = var3.getGroupFileIds(var0);

			for (int var8 = 0; var8 < var7.length; ++var8) {
				byte[] var9 = var3.getFile(var0, var7[var8]);
				if (var9 == null) {
					var5 = false;
				} else if (var6 == -1) {
					var6 = (var9[0] & 255) << 8 | var9[1] & 255;
				}
			}

			if (var6 != -1) {
				byte[] var10 = var4.getFile(var6, 0);
				if (var10 == null) {
					var5 = false;
				}
			} else {
				var5 = false;
			}

			Frames var2;
			if (!var5) {
				var2 = null;
			} else {
				try {
					var2 = new Frames(var3, var4, var0);
				} catch (Exception var11) {
					var2 = null;
				}
			}

			if (var2 != null) {
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var2, (long)var0);
			}

			return var2;
		}
	}

	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "([Lov;IB)V",
		garbageValue = "44"
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

					if (var3.childIndex * -744024149 == -1) {
						InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
						if (var4 != null) {
							UserComparator10.runIntfCloseListeners(var4.group, var1);
						}
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) {
					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onDialogAbort;
					ModeWhere.runScriptEvent(var5);
				}

				if (var1 == 1 && var3.onSubChange != null) {
					if (var3.childIndex * -744024149 >= 0) {
						Widget var6 = ClientPreferences.widgetDefinition.method7286(var3.id);
						if (var6 == null || var6.children == null || var3.childIndex * -744024149 >= var6.children.length || var6.children[var3.childIndex * -744024149] != var3) {
							continue;
						}
					}

					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onSubChange;
					ModeWhere.runScriptEvent(var5);
				}
			}
		}

	}
}
