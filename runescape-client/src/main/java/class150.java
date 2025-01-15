import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
public abstract class class150 extends Node {
	class150() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-1355269794"
	)
	abstract void vmethod3879(Buffer var1);

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgq;B)V",
		garbageValue = "0"
	)
	abstract void vmethod3882(ClanSettings var1);

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ldf;III)V",
		garbageValue = "-2022231235"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args;
		Script var4;
		if (InvDefinition.isWorldMapEvent(var0.type)) {
			UserComparator5.worldMapEvent = (WorldMapEvent)var3[0];
			WorldMapElement var6 = class31.WorldMapElement_get(UserComparator5.worldMapEvent.mapElement);
			var4 = class544.getWorldMapScript(var0.type, var6.objectId, var6.category);
		} else {
			int var5 = (Integer)var3[0];
			var4 = GameEngine.getScript(var5);
		}

		if (var4 != null) {
			class427.runScriptLogic(var0, var4, var1, var2);
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2034697086"
	)
	public static void method3592() {
		try {
			JagexCache.JagexCache_dat2File.close();

			for (int var0 = 0; var0 < class438.field4823; ++var0) {
				UserComparator4.JagexCache_idxFiles[var0].close();
			}

			JagexCache.JagexCache_idx255File.close();
			JagexCache.JagexCache_randomDat.close();
		} catch (Exception var2) {
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "1"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0;
		Login.Login_response2 = var1;
		Login.Login_response3 = var2;
	}

	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1872432444"
	)
	static void method3598() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) {
			int var1 = var0.group;
			if (ClanChannel.widgetDefinition.loadInterface(var1)) {
				boolean var2 = true;
				Widget[] var3 = ClanChannel.widgetDefinition.Widget_interfaceComponents[var1];

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) {
					if (var3[var4] != null) {
						var2 = var3[var4].isIf3;
						break;
					}
				}

				if (!var2) {
					var4 = (int)var0.key;
					Widget var5 = ClanChannel.widgetDefinition.method7031(var4);
					if (var5 != null) {
						UserComparator8.invalidateWidget(var5);
					}
				}
			}
		}

	}
}
