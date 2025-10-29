import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("og")
public class class380 {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	@Export("pcmPlayerProvider")
	public static class105 pcmPlayerProvider;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	Widget field4206;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 117389541
	)
	int field4201;
	@ObfuscatedName("aj")
	int[] field4202;
	@ObfuscatedName("ak")
	int[] field4199;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -532148473
	)
	int field4204;

	public class380() {
		this.field4202 = new int[32];
		this.field4199 = new int[32];
		this.field4204 = 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILof;IB)V",
		garbageValue = "93"
	)
	public void method8128(int var1, Widget var2, int var3) {
		this.field4206 = var2;
		this.field4201 = 0;
		this.field4204 = 0;
		if (var1 >= 0 && var1 < 3) {
			if (var2 == null || var2.childIndex * 2077538819 == -1 && var2.type == 0) {
				if (var2 != null && var2.children != null) {
					if (var1 == 0) {
						Widget[] var7 = var2.children;

						for (int var5 = 0; var5 < var7.length; ++var5) {
							Widget var6 = var7[var5];
							if (var6 != null) {
								this.method8118(var6.childIndex * 2077538819);
							}
						}
					} else {
						boolean var4 = var1 != 1;
						if (var3 == -1) {
							this.method8119(var2, var4);
						} else if (var3 >= 0 && var3 < var2.children.length && var2.children[var3] != null) {
							this.method8119(var2.children[var3], var4);
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
		descriptor = "(II)V",
		garbageValue = "-425350419"
	)
	final void method8118(int var1) {
		if (this.field4202.length == this.field4201) {
			this.field4202 = Arrays.copyOf(this.field4202, this.field4202.length * 2);
		}

		this.field4202[++this.field4201 - 1] = var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lof;ZI)V",
		garbageValue = "1442841099"
	)
	final void method8119(Widget var1, boolean var2) {
		int var3 = var1 == this.field4206 ? 0 : var1.field4236;
		int var4 = var1 == this.field4206 ? var1.children.length - 1 : var1.field4241;

		for (int var5 = var3; var5 <= var4; ++var5) {
			Widget var6 = this.field4206.children[var5];
			if (var6 != null && var1.childIndex * 2077538819 == var6.field4234) {
				this.method8118(var6.childIndex * 2077538819);
				if (var2 && var6.field4236 <= var6.field4241) {
					this.method8119(var6, true);
				}
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2055214562"
	)
	public int method8120() {
		return this.field4201;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lof;",
		garbageValue = "-1020629248"
	)
	public Widget method8121() {
		int var1 = this.method8122();
		return var1 >= 0 ? this.field4206.children[var1] : null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "8505"
	)
	public int method8122() {
		return this.field4204 >= this.field4201 ? -1 : this.field4202[++this.field4204 - 1];
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "257628676"
	)
	public int[] method8123() {
		return Arrays.copyOf(this.field4202, this.field4201);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;Ljava/lang/Object;I)V",
		garbageValue = "-651505321"
	)
	public void method8124(int var1, Object var2, Object var3) {
		int[] var4 = this.field4202;
		int var5 = this.field4201;
		this.field4202 = this.field4199;
		this.field4201 = 0;
		this.field4199 = var4;

		for (int var6 = 0; var6 < var5; ++var6) {
			Widget var7 = this.field4206.children[var4[var6]];
			if (var7 != null) {
				Object var8 = var7.method8283(var1, var3);
				if (var2 == var8 || var8 != null && var8.equals(var2)) {
					this.method8118(var4[var6]);
				}
			}
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lqm;Lqm;Lqm;I)V",
		garbageValue = "2092189559"
	)
	public static void method8117(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		GrandExchangeOfferWorldComparator.HitSplatDefinition_archive = var0;
		class573.field5890 = var1;
		class228.HitSplatDefinition_fontsArchive = var2;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lut;IIB)V",
		garbageValue = "1"
	)
	public static void method8145(DynamicArray var0, int var1, int var2) {
		class461.method9375(var0, (class586)null, true);
		if (var1 >= 0 && var2 >= 0 && var1 < var0.method10652() && var2 < var0.method10652()) {
			if (var2 != var1) {
				if (var0.field5584 == class586.field5937) {
					int[] var3 = var0.method10650();
					int var8 = var3[var1];
					var3[var1] = var3[var2];
					var3[var2] = var8;
				} else if (var0.field5584 == class586.field5942) {
					long[] var9 = var0.method10651();
					long var6 = var9[var1];
					var9[var1] = var9[var2];
					var9[var2] = var6;
				} else {
					Object[] var10 = var0.method10681();
					Object var4 = var10[var1];
					var10[var1] = var10[var2];
					var10[var2] = var4;
				}
			}

		} else {
			throw new RuntimeException();
		}
	}
}
