import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bx")
public class class27 {
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lgd;"
	)
	static ClanChannel field127;
	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "Lvh;"
	)
	static class557 field129;
	@ObfuscatedName("rc")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	static Model field130;
	@ObfuscatedName("vy")
	@ObfuscatedGetter(
		intValue = -1033918905
	)
	static int field131;
	@ObfuscatedName("aa")
	int[] field122;
	@ObfuscatedName("am")
	int[] field125;

	public class27() {
		this.field122 = new int[112];
		this.field125 = new int[192];
		Arrays.fill(this.field122, 3);
		Arrays.fill(this.field125, 3);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "57"
	)
	public void method424(int var1, int var2) {
		if (this.method399(var1) && this.method431(var2)) {
			this.field122[var1] = var2;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(CII)V",
		garbageValue = "-673491557"
	)
	public void method429(char var1, int var2) {
		if (this.method400(var1) && this.method431(var2)) {
			this.field125[var1] = var2;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1497564544"
	)
	public int method428(int var1) {
		return this.method399(var1) ? this.field122[var1] : 0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(CI)I",
		garbageValue = "437049719"
	)
	public int method411(char var1) {
		return this.method400(var1) ? this.field125[var1] : 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-107984970"
	)
	public boolean method395(int var1) {
		return this.method399(var1) && (this.field122[var1] == 1 || this.field122[var1] == 3);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1243263995"
	)
	public boolean method396(char var1) {
		return this.method400(var1) && (this.field125[var1] == 1 || this.field125[var1] == 3);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "78"
	)
	public boolean method393(int var1) {
		return this.method399(var1) && (this.field122[var1] == 2 || this.field122[var1] == 3);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1282664652"
	)
	public boolean method398(char var1) {
		return this.method400(var1) && (this.field125[var1] == 2 || this.field125[var1] == 3);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1184449529"
	)
	boolean method399(int var1) {
		if (var1 >= 0 && var1 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "27"
	)
	boolean method400(char var1) {
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
		garbageValue = "72"
	)
	boolean method431(int var1) {
		if (var1 >= 0 && var1 < 4) {
			return true;
		} else {
			System.out.println("Invalid mode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(Lcn;I)V",
		garbageValue = "-2037594825"
	)
	static final void method394(Actor var0) {
		boolean var1 = var0.field1016 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0;
		if (!var1) {
			SequenceDefinition var2 = VarpDefinition.SequenceDefinition_get(var0.sequence);
			if (var2 != null && !var2.isCachedModelIdSet()) {
				var1 = var0.sequenceFrameCycle + 1 > var2.frameLengths[var0.sequenceFrame];
			} else {
				var1 = true;
			}
		}

		if (var1) {
			int var8 = var0.field1016 - var0.spotAnimation;
			int var3 = Client.cycle - var0.spotAnimation;
			int var4 = var0.size * -343670784 + var0.field1062 * 128;
			int var5 = var0.size * -343670784 + var0.field1065 * 128;
			int var6 = var0.size * -343670784 + var0.field1070 * 128;
			int var7 = var0.size * -343670784 + var0.field1072 * 128;
			var0.x = (var3 * var6 + var4 * (var8 - var3)) / var8;
			var0.y = (var7 * var3 + var5 * (var8 - var3)) / var8;
		}

		var0.field1085 = 0;
		var0.orientation = var0.field1012;
		var0.rotation = var0.orientation;
	}
}
