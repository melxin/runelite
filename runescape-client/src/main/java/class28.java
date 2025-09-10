import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
public class class28 {
	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;
	@ObfuscatedName("ao")
	int[] field142;
	@ObfuscatedName("as")
	int[] field143;

	public class28() {
		this.field142 = new int[112];
		this.field143 = new int[192];
		Arrays.fill(this.field142, 3);
		Arrays.fill(this.field143, 3);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "28080"
	)
	public void method417(int var1, int var2) {
		if (this.method425(var1) && this.method449(var2)) {
			this.field142[var1] = var2;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(CII)V",
		garbageValue = "-939159971"
	)
	public void method418(char var1, int var2) {
		if (this.method426(var1) && this.method449(var2)) {
			this.field143[var1] = var2;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2096952318"
	)
	public int method419(int var1) {
		return this.method425(var1) ? this.field142[var1] : 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(CI)I",
		garbageValue = "557536955"
	)
	public int method420(char var1) {
		return this.method426(var1) ? this.field143[var1] : 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1858810601"
	)
	public boolean method421(int var1) {
		return this.method425(var1) && (this.field142[var1] == 1 || this.field142[var1] == 3);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "5"
	)
	public boolean method422(char var1) {
		return this.method426(var1) && (this.field143[var1] == 1 || this.field143[var1] == 3);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-634771801"
	)
	public boolean method423(int var1) {
		return this.method425(var1) && (this.field142[var1] == 2 || this.field142[var1] == 3);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1540016245"
	)
	public boolean method424(char var1) {
		return this.method426(var1) && (this.field143[var1] == 2 || this.field143[var1] == 3);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1006641339"
	)
	boolean method425(int var1) {
		if (var1 >= 0 && var1 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "2100154115"
	)
	boolean method426(char var1) {
		if (var1 >= 0 && var1 < 192) {
			return true;
		} else {
			System.out.println("Invalid keychar: " + var1);
			return false;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-547645034"
	)
	boolean method449(int var1) {
		if (var1 >= 0 && var1 < 4) {
			return true;
		} else {
			System.out.println("Invalid mode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "78742150"
	)
	public static void method453(AbstractArchive var0) {
		EnumComposition.EnumDefinition_archive = var0;
	}
}
