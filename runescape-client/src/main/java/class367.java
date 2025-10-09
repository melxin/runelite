import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oy")
public class class367 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	Widget field4149;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1167933739
	)
	int field4152;
	@ObfuscatedName("af")
	int[] field4154;
	@ObfuscatedName("ae")
	int[] field4155;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -283136443
	)
	int field4156;

	public class367() {
		this.field4154 = new int[32];
		this.field4155 = new int[32];
		this.field4156 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILok;II)V",
		garbageValue = "-1457634275"
	)
	public void method7907(int var1, Widget var2, int var3) {
		this.field4149 = var2;
		this.field4152 = 0;
		this.field4156 = 0;
		if (var1 >= 0 && var1 < 3) {
			if (var2 == null || var2.childIndex * -2066937045 == -1 && var2.type == 0) {
				if (var2 != null && var2.children != null) {
					if (var1 == 0) {
						Widget[] var7 = var2.children;

						for (int var5 = 0; var5 < var7.length; ++var5) {
							Widget var6 = var7[var5];
							if (var6 != null) {
								this.method7908(var6.childIndex * -2066937045);
							}
						}
					} else {
						boolean var4 = var1 != 1;
						if (var3 == -1) {
							this.method7891(var2, var4);
						} else if (var3 >= 0 && var3 < var2.children.length && var2.children[var3] != null) {
							this.method7891(var2.children[var3], var4);
						}
					}

				}
			} else {
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "32"
	)
	final void method7908(int var1) {
		if (this.field4154.length == this.field4152) {
			this.field4154 = Arrays.copyOf(this.field4154, this.field4154.length * 2);
		}

		this.field4154[++this.field4152 - 1] = var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lok;ZB)V",
		garbageValue = "-13"
	)
	final void method7891(Widget var1, boolean var2) {
		int var3 = var1 == this.field4149 ? 0 : var1.field4228;
		int var4 = var1 == this.field4149 ? var1.children.length - 1 : var1.field4195;

		for (int var5 = var3; var5 <= var4; ++var5) {
			Widget var6 = this.field4149.children[var5];
			if (var6 != null && var1.childIndex * -2066937045 == var6.field4173) {
				this.method7908(var6.childIndex * -2066937045);
				if (var2 && var6.field4228 <= var6.field4195) {
					this.method7891(var6, true);
				}
			}
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	public int method7893() {
		return this.field4152;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Lok;",
		garbageValue = "-105"
	)
	public Widget method7889() {
		int var1 = this.method7895();
		return var1 >= 0 ? this.field4149.children[var1] : null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1905183698"
	)
	public int method7895() {
		return this.field4156 >= this.field4152 ? -1 : this.field4154[++this.field4156 - 1];
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "2"
	)
	public int[] method7902() {
		return Arrays.copyOf(this.field4154, this.field4152);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;Ljava/lang/Object;B)V",
		garbageValue = "-31"
	)
	public void method7896(int var1, Object var2, Object var3) {
		int[] var4 = this.field4154;
		int var5 = this.field4152;
		this.field4154 = this.field4155;
		this.field4152 = 0;
		this.field4155 = var4;

		for (int var6 = 0; var6 < var5; ++var6) {
			Widget var7 = this.field4149.children[var4[var6]];
			if (var7 != null) {
				Object var8 = var7.method7941(var1, var3);
				if (var2 == var8 || var8 != null && var8.equals(var2)) {
					this.method7908(var4[var6]);
				}
			}
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "39962785"
	)
	public static boolean method7918(int var0) {
		return (var0 >> 21 & 1) != 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([F[II)V",
		garbageValue = "139663953"
	)
	public static void method7919(float[] var0, int[] var1) {
		MusicPatchNode.method7382(var0, var1, 0, var0.length - 1);
	}
}
