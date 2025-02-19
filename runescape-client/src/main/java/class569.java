import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vn")
public class class569 {
	@ObfuscatedName("br")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	public static Client client;
	@ObfuscatedName("ab")
	int[] field5575;
	@ObfuscatedName("ay")
	short[] field5576;

	@ObfuscatedSignature(
		descriptor = "(Lhm;)V"
	)
	public class569(NPCComposition var1) {
		this.field5575 = new int[8];
		this.field5576 = new short[8];
		int var2 = 0;
		if (var1.method3931()) {
			var2 = var1.method3947().length;
			System.arraycopy(var1.method3947(), 0, this.field5575, 0, var2);
			System.arraycopy(var1.method3934(), 0, this.field5576, 0, var2);
		}

		for (int var3 = var2; var3 < 8; ++var3) {
			this.field5575[var3] = -1;
			this.field5576[var3] = -1;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1709746736"
	)
	public int[] method10492() {
		return this.field5575;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "-1421284996"
	)
	public short[] method10491() {
		return this.field5576;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "1946951909"
	)
	public void method10494(int var1, int var2, short var3) {
		this.field5575[var1] = var2;
		this.field5576[var1] = var3;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "([I[SB)V",
		garbageValue = "0"
	)
	public void method10495(int[] var1, short[] var2) {
		this.field5575 = var1;
		this.field5576 = var2;
	}

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "(Lnz;IIZI)V",
		garbageValue = "-2102681976"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width * 779142065;
		int var5 = var0.height * 1836304183;
		if (var0.widthAlignment == 0) {
			var0.width = var0.rawWidth * 1149347153;
		} else if (var0.widthAlignment == 1) {
			var0.width = (var1 - var0.rawWidth) * 1149347153;
		} else if (var0.widthAlignment == 2) {
			var0.width = (var0.rawWidth * var1 >> 14) * 1149347153;
		}

		if (var0.heightAlignment == 0) {
			var0.height = var0.rawHeight * 133340807;
		} else if (var0.heightAlignment == 1) {
			var0.height = (var2 - var0.rawHeight) * 133340807;
		} else if (var0.heightAlignment == 2) {
			var0.height = (var2 * var0.rawHeight >> 14) * 133340807;
		}

		if (var0.widthAlignment == 4) {
			var0.width = var0.field4025 * var0.height * 1836304183 / var0.field3949 * 1149347153;
		}

		if (var0.heightAlignment == 4) {
			var0.height = var0.width * var0.field3949 * 779142065 / var0.field4025 * 133340807;
		}

		if (var0.contentType == 1337) {
			Client.viewportWidget = var0;
		}

		if (var0.type == 12) {
			var0.method7331().method7026(var0.width * 779142065, var0.height * 1836304183);
		}

		if (var3 && var0.onResize != null && (var0.width * 779142065 != var4 || var0.height * 1836304183 != var5)) {
			ScriptEvent var6 = new ScriptEvent();
			var6.widget = var0;
			var6.args = var0.onResize;
			Client.scriptEvents.addFirst(var6);
		}

	}
}
