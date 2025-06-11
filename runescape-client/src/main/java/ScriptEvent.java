import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("ap")
	boolean field896;
	@ObfuscatedName("aj")
	@Export("args")
	Object[] args;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -792067793
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1365531889
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 490787829
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 604536963
	)
	int field895;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 974216707
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -457551845
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("au")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1271371653
	)
	int field901;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -2110735437
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;B)V",
		garbageValue = "124"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-81"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lov;I)V",
		garbageValue = "-1876854781"
	)
	public void method2109(Widget var1) {
		this.widget = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lqt;I)I",
		garbageValue = "255327322"
	)
	@Export("compareStrings")
	public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
		int var3 = var0.length();
		int var4 = var1.length();
		int var5 = 0;
		int var6 = 0;
		char var7 = 0;
		char var8 = 0;

		while (var5 - var7 < var3 || var6 - var8 < var4) {
			if (var5 - var7 >= var3) {
				return -1;
			}

			if (var6 - var8 >= var4) {
				return 1;
			}

			char var9;
			if (var7 != 0) {
				var9 = var7;
				boolean var14 = false;
			} else {
				var9 = var0.charAt(var5++);
			}

			char var10;
			if (var8 != 0) {
				var10 = var8;
				boolean var15 = false;
			} else {
				var10 = var1.charAt(var6++);
			}

			var7 = Timer.method8004(var9);
			var8 = Timer.method8004(var10);
			var9 = class6.standardizeChar(var9, var2);
			var10 = class6.standardizeChar(var10, var2);
			if (var9 != var10 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) {
				var9 = Character.toLowerCase(var9);
				var10 = Character.toLowerCase(var10);
				if (var10 != var9) {
					return class398.lowercaseChar(var9, var2) - class398.lowercaseChar(var10, var2);
				}
			}
		}

		int var16 = Math.min(var3, var4);

		char var12;
		int var17;
		for (var17 = 0; var17 < var16; ++var17) {
			if (var2 == Language.Language_FR) {
				var5 = var3 - 1 - var17;
				var6 = var4 - 1 - var17;
			} else {
				var6 = var17;
				var5 = var17;
			}

			char var11 = var0.charAt(var5);
			var12 = var1.charAt(var6);
			if (var12 != var11 && Character.toUpperCase(var11) != Character.toUpperCase(var12)) {
				var11 = Character.toLowerCase(var11);
				var12 = Character.toLowerCase(var12);
				if (var11 != var12) {
					return class398.lowercaseChar(var11, var2) - class398.lowercaseChar(var12, var2);
				}
			}
		}

		var17 = var3 - var4;
		if (var17 != 0) {
			return var17;
		} else {
			for (int var18 = 0; var18 < var16; ++var18) {
				var12 = var0.charAt(var18);
				char var13 = var1.charAt(var18);
				if (var12 != var13) {
					return class398.lowercaseChar(var12, var2) - class398.lowercaseChar(var13, var2);
				}
			}

			return 0;
		}
	}
}
