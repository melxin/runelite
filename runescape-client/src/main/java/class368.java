import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("on")
public class class368 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	Widget field4128;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 465055831
	)
	int field4129;
	@ObfuscatedName("aq")
	int[] field4126;
	@ObfuscatedName("ao")
	int[] field4130;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1734592813
	)
	int field4132;

	public class368() {
		this.field4126 = new int[32];
		this.field4130 = new int[32];
		this.field4132 = 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILoi;II)V",
		garbageValue = "-1663668246"
	)
	public void method7917(int var1, Widget var2, int var3) {
		this.field4128 = var2;
		this.field4129 = 0;
		this.field4132 = 0;
		if (var1 >= 0 && var1 < 3) {
			if (var2 == null || var2.childIndex * -217986249 == -1 && var2.type == 0) {
				if (var2 != null && var2.children != null) {
					if (var1 == 0) {
						Widget[] var7 = var2.children;

						for (int var5 = 0; var5 < var7.length; ++var5) {
							Widget var6 = var7[var5];
							if (var6 != null) {
								this.method7902(var6.childIndex * -217986249);
							}
						}
					} else {
						boolean var4 = var1 != 1;
						if (var3 == -1) {
							this.method7929(var2, var4);
						} else if (var3 >= 0 && var3 < var2.children.length && var2.children[var3] != null) {
							this.method7929(var2.children[var3], var4);
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1152605675"
	)
	final void method7902(int var1) {
		if (this.field4126.length == this.field4129) {
			this.field4126 = Arrays.copyOf(this.field4126, this.field4126.length * 2);
		}

		this.field4126[++this.field4129 - 1] = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Loi;ZI)V",
		garbageValue = "-852068930"
	)
	final void method7929(Widget var1, boolean var2) {
		int var3 = var1 == this.field4128 ? 0 : var1.field4248;
		int var4 = var1 == this.field4128 ? var1.children.length - 1 : var1.field4214;

		for (int var5 = var3; var5 <= var4; ++var5) {
			Widget var6 = this.field4128.children[var5];
			if (var6 != null && var1.childIndex * -217986249 == var6.field4165) {
				this.method7902(var6.childIndex * -217986249);
				if (var2 && var6.field4248 <= var6.field4214) {
					this.method7929(var6, true);
				}
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1862979349"
	)
	public int method7904() {
		return this.field4129;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Loi;",
		garbageValue = "-2145119140"
	)
	public Widget method7906() {
		int var1 = this.method7919();
		return var1 >= 0 ? this.field4128.children[var1] : null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1976288653"
	)
	public int method7919() {
		return this.field4132 >= this.field4129 ? -1 : this.field4126[++this.field4132 - 1];
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1112860213"
	)
	public int[] method7907() {
		return Arrays.copyOf(this.field4126, this.field4129);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;Ljava/lang/Object;I)V",
		garbageValue = "1894729282"
	)
	public void method7908(int var1, Object var2, Object var3) {
		int[] var4 = this.field4126;
		int var5 = this.field4129;
		this.field4126 = this.field4130;
		this.field4129 = 0;
		this.field4130 = var4;

		for (int var6 = 0; var6 < var5; ++var6) {
			Widget var7 = this.field4128.children[var4[var6]];
			if (var7 != null) {
				Object var8 = var7.method8004(var1, var3);
				if (var2 == var8 || var8 != null && var8.equals(var2)) {
					this.method7902(var4[var6]);
				}
			}
		}

	}
}
