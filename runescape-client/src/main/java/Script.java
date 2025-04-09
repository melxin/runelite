import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "Ldu;"
	)
	@Export("localPlayer")
	static Player localPlayer;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lqf;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;
	@ObfuscatedName("ae")
	String field1008;
	@ObfuscatedName("af")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("as")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("aq")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1630825865
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1778714627
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 574821523
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1793371821
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;

	static {
		Script_cached = new EvictingDualNodeHashTable(128);
	}

	Script() {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lqf;",
		garbageValue = "97"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1];
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lve;I)Ljava/lang/String;",
		garbageValue = "-1375548284"
	)
	public static String method2354(Buffer var0) {
		return MenuAction.method2253(var0, 32767);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1483915757"
	)
	static final int method2356() {
		return ViewportMouse.ViewportMouse_x;
	}

	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "(Lnh;I)V",
		garbageValue = "1218820195"
	)
	static final void method2363(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 324) {
			if (Client.field589 == -1) {
				Client.field589 = var0.spriteId2;
				Client.field788 = var0.spriteId;
			}

			if (Client.playerAppearance.gender == 1) {
				var0.spriteId2 = Client.field589;
			} else {
				var0.spriteId2 = Client.field788;
			}

		} else if (var1 == 325) {
			if (Client.field589 == -1) {
				Client.field589 = var0.spriteId2;
				Client.field788 = var0.spriteId;
			}

			if (Client.playerAppearance.gender == 1) {
				var0.spriteId2 = Client.field788;
			} else {
				var0.spriteId2 = Client.field589;
			}

		} else if (var1 == 327) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 0;
		} else if (var1 == 328) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 1;
		}
	}

	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-41"
	)
	static String method2362(String var0) {
		PlayerType[] var1 = ClientPreferences.PlayerType_values();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			PlayerType var3 = var1[var2];
			if (var3.modIcon != -1 && var0.startsWith(class233.method5030(var3.modIcon))) {
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length());
				break;
			}
		}

		return var0;
	}
}
