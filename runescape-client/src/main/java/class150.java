import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
public abstract class class150 extends Node {
	@ObfuscatedName("gw")
	@ObfuscatedGetter(
		intValue = 1968038185
	)
	@Export("worldPort")
	static int worldPort;

	class150() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvj;B)V",
		garbageValue = "-83"
	)
	abstract void vmethod3694(Buffer var1);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgv;I)V",
		garbageValue = "2002935935"
	)
	abstract void vmethod3695(ClanSettings var1);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)I",
		garbageValue = "2096244621"
	)
	public static int method3459(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) {
			int var6 = var3;
			var3 = var4;
			var4 = var6;
		}

		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "86045249"
	)
	public static int method3462(int var0) {
		class145 var2 = (class145)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0);
		class145 var1;
		if (var2 != null) {
			var1 = var2;
		} else {
			var2 = WorldMapID.method6239(SequenceDefinition.SequenceDefinition_animationsArchive, SequenceDefinition.SequenceDefinition_skeletonsArchive, var0, false);
			if (var2 != null) {
				SequenceDefinition.SequenceDefinition_cachedModel.put(var2, (long)var0);
			}

			var1 = var2;
		}

		if (var1 == null) {
			return 2;
		} else {
			return var1.method3404() ? 0 : 1;
		}
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-769430053"
	)
	@Export("getUserId")
	static long getUserId() {
		return Client.userId;
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(Ldy;III)V",
		garbageValue = "-503631143"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) {
			int var3 = HealthBarDefinition.SequenceDefinition_get(var1).restartMode;
			if (var3 == 1) {
				var0.sequenceFrame = 0;
				var0.sequenceFrameCycle = 0;
				var0.sequenceDelay = var2;
				var0.field1195 = 0;
			}

			if (var3 == 2) {
				var0.field1195 = 0;
			}
		} else if (var1 == -1 || var0.sequence == -1 || HealthBarDefinition.SequenceDefinition_get(var1).field2319 >= HealthBarDefinition.SequenceDefinition_get(var0.sequence).field2319) {
			var0.sequence = var1;
			var0.sequenceFrame = 0;
			var0.sequenceFrameCycle = 0;
			var0.sequenceDelay = var2;
			var0.field1195 = 0;
			var0.field1270 = var0.pathLength;
		}

	}
}
