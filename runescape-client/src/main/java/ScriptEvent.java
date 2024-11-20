import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("ab")
	@Export("args")
	Object[] args;
	@ObfuscatedName("aw")
	boolean field1083;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 134496555
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1267852601
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1344300465
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -790679833
	)
	int field1092;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1436251743
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1895655617
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("af")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 728932453
	)
	int field1094;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -918988159
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)V",
		garbageValue = "-1392355154"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "62"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lnp;I)V",
		garbageValue = "118453991"
	)
	public void method2493(Widget var1) {
		this.widget = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([Lpr;II)Lpr;",
		garbageValue = "-1231068373"
	)
	@Export("findEnumerated")
	public static Enum findEnumerated(Enum[] var0, int var1) {
		Enum[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Enum var4 = var2[var3];
			if (var1 == var4.rsOrdinal()) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "1682660351"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2];
		int var4 = 0;

		for (int var5 = 0; var5 < var2; ++var5) {
			int var6 = var0[var5 + var1] & 255;
			if (var6 != 0) {
				if (var6 >= 128 && var6 < 160) {
					char var7 = class417.cp1252AsciiExtension[var6 - 128];
					if (var7 == 0) {
						var7 = '?';
					}

					var6 = var7;
				}

				var3[var4++] = (char)var6;
			}
		}

		return new String(var3, 0, var4);
	}
}
