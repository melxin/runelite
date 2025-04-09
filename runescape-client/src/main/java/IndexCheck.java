import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
@Implements("IndexCheck")
public class IndexCheck implements class29 {
	@ObfuscatedName("an")
	public int[] field3062;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 689554153
	)
	public int field3063;
	@ObfuscatedName("af")
	int[] field3067;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1930328333
	)
	int field3065;
	@ObfuscatedName("aq")
	public char field3066;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -2057562869
	)
	public int field3071;
	@ObfuscatedName("am")
	char[] field3069;
	@ObfuscatedName("aa")
	int[] field3064;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1248520975
	)
	int field3070;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1552857143
	)
	int field3061;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1712731969
	)
	int field3072;
	@ObfuscatedName("ar")
	boolean[] field3073;
	@ObfuscatedName("au")
	boolean[] field3068;
	@ObfuscatedName("aj")
	boolean[] field3075;

	public IndexCheck() {
		this.field3062 = new int[128];
		this.field3063 = 0;
		this.field3067 = new int[128];
		this.field3065 = 0;
		this.field3069 = new char[128];
		this.field3064 = new int[128];
		this.field3070 = 0;
		this.field3061 = 0;
		this.field3072 = 0;
		this.field3073 = new boolean[112];
		this.field3068 = new boolean[112];
		this.field3075 = new boolean[112];
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "930049356"
	)
	public boolean vmethod5667(int var1) {
		this.method5699(var1);
		this.field3073[var1] = true;
		this.field3068[var1] = true;
		this.field3075[var1] = false;
		if (this.field3063 < 128) {
			this.field3062[++this.field3063 - 1] = var1;
		}

		return true;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1495097864"
	)
	public boolean vmethod5668(int var1) {
		this.field3073[var1] = false;
		this.field3068[var1] = false;
		this.field3075[var1] = true;
		if (this.field3065 < 128) {
			this.field3067[++this.field3065 - 1] = var1;
		}

		return true;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-3"
	)
	public boolean vmethod5681(char var1) {
		int var2 = this.field3061 + 1 & 127;
		if (var2 != this.field3070) {
			this.field3064[this.field3061] = -1;
			this.field3069[this.field3061] = var1;
			this.field3061 = var2;
		}

		return false;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "51"
	)
	public boolean vmethod5671(boolean var1) {
		return false;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	void method5699(int var1) {
		int var2 = this.field3061 + 1 & 127;
		if (var2 != this.field3070) {
			this.field3064[this.field3061] = var1;
			this.field3069[this.field3061] = 0;
			this.field3061 = var2;
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1850715960"
	)
	public void method5672() {
		this.field3070 = this.field3072;
		this.field3072 = this.field3061;
		this.field3063 = 0;
		this.field3065 = 0;
		Arrays.fill(this.field3068, false);
		Arrays.fill(this.field3075, false);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "643912810"
	)
	public final boolean method5689() {
		if (this.field3072 == this.field3070) {
			return false;
		} else {
			this.field3071 = this.field3064[this.field3070];
			this.field3066 = this.field3069[this.field3070];
			this.field3070 = this.field3070 + 1 & 127;
			return true;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1767086609"
	)
	public boolean method5674(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field3068[var1] : false;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "-28985"
	)
	@Export("isValidIndexInRange")
	public boolean isValidIndexInRange(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field3073[var1] : false;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "65280"
	)
	public boolean method5691(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field3075[var1] : false;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-415666596"
	)
	public int[] method5677() {
		int[] var1 = new int[this.field3063];

		for (int var2 = 0; var2 < this.field3063; ++var2) {
			var1[var2] = this.field3062[var2];
		}

		return var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1730342866"
	)
	public int[] method5678() {
		int[] var1 = new int[this.field3065];

		for (int var2 = 0; var2 < this.field3065; ++var2) {
			var1[var2] = this.field3067[var2];
		}

		return var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)Ljava/lang/String;",
		garbageValue = "-100"
	)
	public static String method5697(CharSequence var0) {
		int var1 = var0.length();
		StringBuilder var2 = new StringBuilder(var1);

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') {
				if (var4 == ' ') {
					var2.append('+');
				} else {
					byte var5 = ItemContainer.charToByteCp1252(var4);
					var2.append('%');
					int var6 = var5 >> 4 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}

					var6 = var5 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}
				}
			} else {
				var2.append(var4);
			}
		}

		return var2.toString();
	}
}
