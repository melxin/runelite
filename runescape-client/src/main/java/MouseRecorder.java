import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("ac")
	static int[][] field868;
	@ObfuscatedName("av")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("at")
	@Export("lock")
	Object lock;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 847414097
	)
	@Export("index")
	int index;
	@ObfuscatedName("an")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("ae")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("aj")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true;
		this.lock = new Object();
		this.index = 0;
		this.xs = new int[500];
		this.ys = new int[500];
		this.millis = new long[500];
	}

	public void run() {
		for (; this.isRunning; LoginState.method841(50L)) {
			synchronized(this.lock) {
				if (this.index < 500) {
					this.xs[this.index] = MouseHandler.MouseHandler_x;
					this.ys[this.index] = MouseHandler.MouseHandler_y;
					this.millis[this.index] = MouseHandler.MouseHandler_millis;
					++this.index;
				}
			}
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldc;",
		garbageValue = "1642043640"
	)
	static AttackOption[] method2193() {
		return new AttackOption[]{AttackOption.AttackOption_alwaysRightClick, AttackOption.field1186, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.field1188, AttackOption.AttackOption_hidden};
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1286111589"
	)
	public static String method2195(String var0) {
		StringBuilder var1 = new StringBuilder(var0.length());
		int var2 = 0;
		int var3 = -1;

		for (int var4 = 0; var4 < var0.length(); ++var4) {
			char var5 = var0.charAt(var4);
			if (var5 == '<') {
				var1.append(var0.substring(var2, var4));
				var3 = var4;
			} else if (var5 == '>' && var3 != -1) {
				String var6 = var0.substring(var3 + 1, var4);
				var3 = -1;
				if (var6.equals("lt")) {
					var1.append("<");
				} else if (var6.equals("gt")) {
					var1.append(">");
				} else if (var6.equals("br")) {
					var1.append("\n");
				}

				var2 = var4 + 1;
			}
		}

		if (var2 < var0.length()) {
			var1.append(var0.substring(var2, var0.length()));
		}

		return var1.toString();
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2084071294"
	)
	static void method2194(int var0, int var1) {
		if (class468.clientPreferences.getMusicVolume() != 0 && var0 != -1) {
			ArrayList var2 = new ArrayList();
			var2.add(new MidiRequest(UserComparator4.archive6, var0, 0, class468.clientPreferences.getMusicVolume(), false));
			class113.method3574(var2, 0, 0, 0, 0, true);
			Client.playingJingle = true;
		}

	}

	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "994891367"
	)
	static final void method2189() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();

			for (int var2 = 0; var2 < Client.playerUpdateManager.playerCount; ++var2) {
				Player var3 = (Player)Occluder.topLevelWorldView.players.get((long)Client.playerUpdateManager.playerIndices[var2]);
				if (var3 != null) {
					var3.clearIsInFriendsChat();
				}
			}
		}

	}

	@ObfuscatedName("pr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-204048001"
	)
	static void method2196(int var0) {
		Client.oculusOrbState = var0;
	}
}
