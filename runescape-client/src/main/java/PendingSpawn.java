import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1826074693
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1092815759
	)
	@Export("type")
	int type;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1338651515
	)
	@Export("x")
	int x;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 826749675
	)
	@Export("y")
	int y;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -394823857
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 256387703
	)
	int field1184;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 747731375
	)
	int field1179;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1755676369
	)
	int field1192;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1335351009
	)
	int field1185;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1025770941
	)
	int field1194;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1300377589
	)
	int field1189;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1299297955
	)
	int field1191;
	@ObfuscatedName("af")
	String[] field1193;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -2013521187
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1548016443
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.field1191 = 31;
		this.delay = 0;
		this.hitpoints = -1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-605399033"
	)
	void method2754(int var1) {
		this.field1191 = var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;I)V",
		garbageValue = "-2023751041"
	)
	void method2757(String[] var1) {
		this.field1193 = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-294999815"
	)
	boolean method2756(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1191 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1765665857"
	)
	boolean method2753(int var1) {
		return this.field1193 != null && var1 >= 0 && var1 < this.field1193.length && this.field1193[var1] != null;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1743349630"
	)
	String method2766(int var1) {
		return this.field1193 != null && var1 >= 0 && var1 < this.field1193.length ? this.field1193[var1] : null;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "2111659122"
	)
	static int method2755(int var0, Script var1, boolean var2) {
		if (var0 == 6754) {
			int var5 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
			NPCComposition var6 = FadeOutTask.getNpcDefinition(var5);
			Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var6 != null ? var6.name : "";
			return 1;
		} else {
			NPCComposition var3;
			if (var0 == 6764) {
				ScriptFrame.Interpreter_intStackSize -= 2;
				var3 = FadeOutTask.getNpcDefinition(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize]);
				int var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.method5330(var4);
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.method5309(var4);
				return 1;
			} else if (var0 == 6765) {
				var3 = FadeOutTask.getNpcDefinition(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3 != null ? var3.combatLevel : 0;
				return 1;
			} else {
				return 2;
			}
		}
	}
}
