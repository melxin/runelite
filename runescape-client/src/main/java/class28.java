import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bg")
public class class28 {
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -56379655
	)
	@Export("otpMedium")
	static int otpMedium;
	@ObfuscatedName("um")
	@ObfuscatedGetter(
		intValue = 1039921429
	)
	static int field124;
	@ObfuscatedName("ak")
	int[] field123;
	@ObfuscatedName("aw")
	int[] field122;

	public class28() {
		this.field123 = new int[112];
		this.field122 = new int[192];
		Arrays.fill(this.field123, 3);
		Arrays.fill(this.field122, 3);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1772320261"
	)
	public void method424(int var1, int var2) {
		if (this.method432(var1) && this.method434(var2)) {
			this.field123[var1] = var2;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(CII)V",
		garbageValue = "-371900800"
	)
	public void method460(char var1, int var2) {
		if (this.method435(var1) && this.method434(var2)) {
			this.field122[var1] = var2;
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "12"
	)
	public int method452(int var1) {
		return this.method432(var1) ? this.field123[var1] : 0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(CI)I",
		garbageValue = "1833692068"
	)
	public int method427(char var1) {
		return this.method435(var1) ? this.field122[var1] : 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "292724588"
	)
	public boolean method428(int var1) {
		return this.method432(var1) && (this.field123[var1] == 1 || this.field123[var1] == 3);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-565327984"
	)
	public boolean method431(char var1) {
		return this.method435(var1) && (this.field122[var1] == 1 || this.field122[var1] == 3);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-379544307"
	)
	public boolean method433(int var1) {
		return this.method432(var1) && (this.field123[var1] == 2 || this.field123[var1] == 3);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "931181298"
	)
	public boolean method436(char var1) {
		return this.method435(var1) && (this.field122[var1] == 2 || this.field122[var1] == 3);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-896834913"
	)
	boolean method432(int var1) {
		if (var1 >= 0 && var1 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1005624215"
	)
	boolean method435(char var1) {
		if (var1 >= 0 && var1 < 192) {
			return true;
		} else {
			System.out.println("Invalid keychar: " + var1);
			return false;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "116"
	)
	boolean method434(int var1) {
		if (var1 >= 0 && var1 < 4) {
			return true;
		} else {
			System.out.println("Invalid mode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lqm;Lqm;I)I",
		garbageValue = "-1660319825"
	)
	static int method429(AbstractArchive var0, AbstractArchive var1) {
		int var2 = 0;
		String[] var3 = Login.field712;

		int var4;
		String var5;
		for (var4 = 0; var4 < var3.length; ++var4) {
			var5 = var3[var4];
			if (var0.tryLoadFileByNames(var5, "")) {
				++var2;
			}
		}

		var3 = Login.field701;

		for (var4 = 0; var4 < var3.length; ++var4) {
			var5 = var3[var4];
			if (var1.tryLoadFileByNames(var5, "")) {
				++var2;
			}
		}

		var3 = Login.field714;

		for (var4 = 0; var4 < var3.length; ++var4) {
			var5 = var3[var4];
			if (var1.getGroupId(var5) != -1 && var1.tryLoadFileByNames(var5, "")) {
				++var2;
			}
		}

		return var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IB)V",
		garbageValue = "115"
	)
	public static void method466(String[] var0, int[] var1) {
		WorldMapID.quicksortStringsWithCorrespondingIntegers(var0, var1, 0, var0.length - 1);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lof;B)I",
		garbageValue = "-77"
	)
	static int method465(Widget var0) {
		if (var0.type != 11) {
			Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
			return 1;
		} else {
			String var1 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
			Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var0.method8185(var1);
			return 1;
		}
	}
}
