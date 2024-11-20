import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.io.DataInputStream;
import java.net.URI;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dz")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1502918293
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1394304617
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Loa;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0;
		this.archive = var1;
		this.groupCount = var1.getGroupCount();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1648787028"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0;

		for (int var1 = 0; var1 < this.groupCount; ++var1) {
			if (!this.archive.method7522(var1) || this.archive.method7521(var1)) {
				++this.loadedCount;
			}
		}

		return this.loadedCount >= this.groupCount;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V",
		garbageValue = "2056515976"
	)
	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = "";
				if (var1 != null) {
					var2 = WorldMapSection1.method6273(var1);
				}

				if (var0 != null) {
					if (var1 != null) {
						var2 = var2 + " | ";
					}

					var2 = var2 + var0;
				}

				System.out.println("Error: " + var2);
				var2 = var2.replace(':', '.');
				var2 = var2.replace('@', '_');
				var2 = var2.replace('&', '_');
				var2 = var2.replace('#', '_');
				if (RunException.RunException_applet == null) {
					return;
				}

				URL var3 = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?cv=" + RunException.RunException_revision + "&cs=" + RunException.field5642 + "&u=" + RunException.field5640 + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + RunException.field5645 + "&e=" + var2);
				DataInputStream var4 = new DataInputStream(var3.openStream());
				var4.read();
				var4.close();
			} catch (Exception var5) {
			}

		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZLjava/lang/String;ZI)V",
		garbageValue = "-1702318177"
	)
	static void method2442(String var0, boolean var1, String var2, boolean var3) {
		if (var1) {
			if (!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (Exception var5) {
				}
			}

			if (class31.field156.startsWith("win") && !var3) {
				SecureUrlRequester.method3185(var0, 0, "openjs");
				return;
			}

			if (class31.field156.startsWith("mac")) {
				SecureUrlRequester.method3185(var0, 1, var2);
				return;
			}

			SecureUrlRequester.method3185(var0, 2, "openjs");
		} else {
			SecureUrlRequester.method3185(var0, 3, "openjs");
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "-88"
	)
	static int method2443(int var0, Script var1, boolean var2) {
		Widget var3 = class379.widgetDefinition.method6875(Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class202.Widget_unpackTargetMask(Renderable.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.IF_GETOP) {
			if (var0 == ScriptOpcodes.IF_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
	}
}
