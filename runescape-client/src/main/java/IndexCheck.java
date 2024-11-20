import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kx")
@Implements("IndexCheck")
public class IndexCheck implements class29 {
	@ObfuscatedName("dl")
	static boolean field3003;
	@ObfuscatedName("aw")
	char[] field2994;
	@ObfuscatedName("at")
	int[] field2995;
	@ObfuscatedName("ae")
	public int[] field2996;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1542817793
	)
	public int field2997;
	@ObfuscatedName("ac")
	int[] field2998;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1539626359
	)
	int field3000;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -251821251
	)
	int field3008;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1353754949
	)
	int field3001;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1710030237
	)
	int field3002;
	@ObfuscatedName("af")
	boolean[] field2993;
	@ObfuscatedName("ai")
	boolean[] field2999;
	@ObfuscatedName("al")
	boolean[] field3005;
	@ObfuscatedName("ar")
	public char field3006;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -444248135
	)
	public int field3007;

	public IndexCheck() {
		this.field2994 = new char[128];
		this.field2995 = new int[128];
		this.field2996 = new int[128];
		this.field2997 = 0;
		this.field2998 = new int[128];
		this.field3000 = 0;
		this.field3008 = 0;
		this.field3001 = 0;
		this.field3002 = 0;
		this.field2993 = new boolean[112];
		this.field2999 = new boolean[112];
		this.field3005 = new boolean[112];
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-323298608"
	)
	public boolean vmethod5567(int var1) {
		this.method5570(var1);
		this.field2993[var1] = true;
		this.field2999[var1] = true;
		this.field3005[var1] = false;
		if (this.field2997 < 128) {
			this.field2996[++this.field2997 - 1] = var1;
		}

		return true;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1779231332"
	)
	public boolean vmethod5568(int var1) {
		this.field2993[var1] = false;
		this.field2999[var1] = false;
		this.field3005[var1] = true;
		if (this.field3000 < 128) {
			this.field2998[++this.field3000 - 1] = var1;
		}

		return true;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-757953188"
	)
	public boolean vmethod5573(char var1) {
		int var2 = this.field3001 + 1 & 127;
		if (var2 != this.field3008) {
			this.field2995[this.field3001] = -1;
			this.field2994[this.field3001] = var1;
			this.field3001 = var2;
		}

		return false;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "1222125911"
	)
	public boolean vmethod5571(boolean var1) {
		return false;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-822997908"
	)
	void method5570(int var1) {
		int var2 = this.field3001 + 1 & 127;
		if (var2 != this.field3008) {
			this.field2995[this.field3001] = var1;
			this.field2994[this.field3001] = 0;
			this.field3001 = var2;
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "953044870"
	)
	public void method5572() {
		this.field3008 = this.field3002;
		this.field3002 = this.field3001;
		this.field2997 = 0;
		this.field3000 = 0;
		Arrays.fill(this.field2999, false);
		Arrays.fill(this.field3005, false);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1793218663"
	)
	public final boolean method5597() {
		if (this.field3002 == this.field3008) {
			return false;
		} else {
			this.field3007 = this.field2995[this.field3008];
			this.field3006 = this.field2994[this.field3008];
			this.field3008 = this.field3008 + 1 & 127;
			return true;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "862644394"
	)
	public boolean method5574(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2999[var1] : false;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1992215749"
	)
	@Export("isValidIndexInRange")
	public boolean isValidIndexInRange(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2993[var1] : false;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1035887468"
	)
	public boolean method5576(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field3005[var1] : false;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1351973499"
	)
	public int[] method5566() {
		int[] var1 = new int[this.field2997];

		for (int var2 = 0; var2 < this.field2997; ++var2) {
			var1[var2] = this.field2996[var2];
		}

		return var1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "2"
	)
	public int[] method5593() {
		int[] var1 = new int[this.field3000];

		for (int var2 = 0; var2 < this.field3000; ++var2) {
			var1[var2] = this.field2998[var2];
		}

		return var1;
	}
}
