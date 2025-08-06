import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cj")
public class class57 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Ldn;"
	)
	@Export("soundEffects")
	static final SoundEffect[] soundEffects;
	@ObfuscatedName("ac")
	static final int[] field808;
	@ObfuscatedName("av")
	@Export("soundEffectIds")
	static final int[] soundEffectIds;
	@ObfuscatedName("au")
	@Export("soundLocations")
	static final int[] soundLocations;
	@ObfuscatedName("as")
	@Export("queuedSoundEffectDelays")
	static final int[] queuedSoundEffectDelays;
	@ObfuscatedName("ah")
	@Export("queuedSoundEffectLoops")
	static final int[] queuedSoundEffectLoops;
	@ObfuscatedName("ap")
	static final int[] field815;
	@ObfuscatedName("am")
	static final boolean[] field812;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1498051649
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("bu")
	static String field819;

	static {
		soundEffects = new SoundEffect[50];
		field808 = new int[50];
		soundEffectIds = new int[50];
		soundLocations = new int[50];
		queuedSoundEffectDelays = new int[50];
		queuedSoundEffectLoops = new int[50];
		field815 = new int[50];
		field812 = new boolean[50];
		soundEffectCount = 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lce;",
		garbageValue = "-2014945864"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = Canvas.archive12.takeFile(var0, 0);
			if (var2 == null) {
				return null;
			} else {
				var1 = class70.newScript(var2);
				Script.Script_cached.put(var1, (long)var0);
				return var1;
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([J[JIII)V",
		garbageValue = "-854865357"
	)
	public static void method2020(long[] var0, long[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			long var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			long var8 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var8;
			long var10 = Long.MAX_VALUE == var6 ? 0L : 1L;

			for (int var12 = var2; var12 < var3; ++var12) {
				if (var0[var12] < ((long)var12 & var10) + var6) {
					long var13 = var0[var12];
					var0[var12] = var0[var5];
					var0[var5] = var13;
					long var15 = var1[var12];
					var1[var12] = var1[var5];
					var1[var5++] = var15;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var8;
			method2020(var0, var1, var2, var5 - 1);
			method2020(var0, var1, var5 + 1, var3);
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ILce;ZI)I",
		garbageValue = "2115914097"
	)
	static int method2019(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) {
			AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
			int var4 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
			if (!Client.isCameraLocked) {
				Client.camAngleX = var3;
				Client.camAngleY = var4;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) {
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = Client.camAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) {
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = Client.camAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) {
			var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
			if (var3 < 0) {
				var3 = 0;
			}

			Client.camFollowHeight = var3;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) {
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = Client.camFollowHeight;
			return 1;
		} else {
			return 2;
		}
	}
}
