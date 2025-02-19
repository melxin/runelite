import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
public class class27 {
	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "[Lwg;"
	)
	static SpritePixels[] field124;
	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;
	@ObfuscatedName("ao")
	int[] field121;
	@ObfuscatedName("af")
	int[] field122;

	public class27() {
		this.field121 = new int[112];
		this.field122 = new int[192];
		Arrays.fill(this.field121, 3);
		Arrays.fill(this.field122, 3);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1381835313"
	)
	public void method341(int var1, int var2) {
		if (this.method349(var1) && this.method351(var2)) {
			this.field121[var1] = var2;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(CIB)V",
		garbageValue = "55"
	)
	public void method342(char var1, int var2) {
		if (this.method350(var1) && this.method351(var2)) {
			this.field122[var1] = var2;
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1905471453"
	)
	public int method368(int var1) {
		return this.method349(var1) ? this.field121[var1] : 0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(CB)I",
		garbageValue = "-6"
	)
	public int method344(char var1) {
		return this.method350(var1) ? this.field122[var1] : 0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "27"
	)
	public boolean method359(int var1) {
		return this.method349(var1) && (this.field121[var1] == 1 || this.field121[var1] == 3);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1146966261"
	)
	public boolean method346(char var1) {
		return this.method350(var1) && (this.field122[var1] == 1 || this.field122[var1] == 3);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1572215071"
	)
	public boolean method347(int var1) {
		return this.method349(var1) && (this.field121[var1] == 2 || this.field121[var1] == 3);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "18"
	)
	public boolean method361(char var1) {
		return this.method350(var1) && (this.field122[var1] == 2 || this.field122[var1] == 3);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-23"
	)
	boolean method349(int var1) {
		if (var1 >= 0 && var1 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-125"
	)
	boolean method350(char var1) {
		if (var1 >= 0 && var1 < 192) {
			return true;
		} else {
			System.out.println("Invalid keychar: " + var1);
			return false;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	boolean method351(int var1) {
		if (var1 >= 0 && var1 < 4) {
			return true;
		} else {
			System.out.println("Invalid mode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ILdy;ZI)I",
		garbageValue = "1958478518"
	)
	static int method383(int var0, Script var1, boolean var2) {
		if (var0 == 7463) {
			boolean var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] == 1;
			WorldView.method2835(var3);
			return 1;
		} else {
			return 2;
		}
	}
}
