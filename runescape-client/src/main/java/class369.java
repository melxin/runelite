import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oi")
public class class369 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	Widget field3962;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -2040847243
	)
	int field3964;
	@ObfuscatedName("ac")
	int[] field3959;
	@ObfuscatedName("aa")
	int[] field3965;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -261924801
	)
	int field3961;

	public class369() {
		this.field3959 = new int[32];
		this.field3965 = new int[32];
		this.field3961 = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILov;IB)V",
		garbageValue = "69"
	)
	public void method7693(int var1, Widget var2, int var3) {
		this.field3962 = var2;
		this.field3964 = 0;
		this.field3961 = 0;
		if (var1 >= 0 && var1 < 3) {
			if (var2 == null || var2.childIndex * -744024149 == -1 && var2.type == 0) {
				if (var2 != null && var2.children != null) {
					if (var1 == 0) {
						Widget[] var7 = var2.children;

						for (int var5 = 0; var5 < var7.length; ++var5) {
							Widget var6 = var7[var5];
							if (var6 != null) {
								this.method7694(var6.childIndex * -744024149);
							}
						}
					} else {
						boolean var4 = var1 != 1;
						if (var3 == -1) {
							this.method7695(var2, var4);
						} else if (var3 >= 0 && var3 < var2.children.length && var2.children[var3] != null) {
							this.method7695(var2.children[var3], var4);
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-89"
	)
	final void method7694(int var1) {
		if (this.field3959.length == this.field3964) {
			this.field3959 = Arrays.copyOf(this.field3959, this.field3959.length * 2);
		}

		this.field3959[++this.field3964 - 1] = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lov;ZI)V",
		garbageValue = "-352613320"
	)
	final void method7695(Widget var1, boolean var2) {
		int var3 = var1 == this.field3962 ? 0 : var1.field4002;
		int var4 = var1 == this.field3962 ? var1.children.length - 1 : var1.field4003;

		for (int var5 = var3; var5 <= var4; ++var5) {
			Widget var6 = this.field3962.children[var5];
			if (var6 != null && var6.field4127 == var1.childIndex * -744024149) {
				this.method7694(var6.childIndex * -744024149);
				if (var2 && var6.field4002 <= var6.field4003) {
					this.method7695(var6, true);
				}
			}
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-579241281"
	)
	public int method7696() {
		return this.field3964;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lov;",
		garbageValue = "-1146545487"
	)
	public Widget method7697() {
		int var1 = this.method7705();
		return var1 >= 0 ? this.field3962.children[var1] : null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-94"
	)
	public int method7705() {
		return this.field3961 >= this.field3964 ? -1 : this.field3959[++this.field3961 - 1];
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1975804896"
	)
	public int[] method7700() {
		return Arrays.copyOf(this.field3959, this.field3964);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;Ljava/lang/Object;I)V",
		garbageValue = "-1862676845"
	)
	public void method7713(int var1, Object var2, Object var3) {
		int[] var4 = this.field3959;
		int var5 = this.field3964;
		this.field3959 = this.field3965;
		this.field3964 = 0;
		this.field3965 = var4;

		for (int var6 = 0; var6 < var5; ++var6) {
			Widget var7 = this.field3962.children[var4[var6]];
			if (var7 != null) {
				Object var8 = var7.method7752(var1, var3);
				if (var2 == var8 || var8 != null && var8.equals(var2)) {
					this.method7694(var4[var6]);
				}
			}
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "36"
	)
	static boolean method7722() {
		if ((Client.worldProperties & class571.field5652.rsOrdinal()) != 0) {
			Login.Login_response0 = "";
			Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
			Login.Login_response2 = "Your normal account will not be affected.";
			Login.Login_response3 = "";
			class85.method2689(1);
			return true;
		} else if ((Client.worldProperties & class571.field5629.rsOrdinal()) != 0) {
			if ((Client.worldProperties & class571.field5650.rsOrdinal()) != 0) {
				Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
				Login.Login_response2 = "Players can attack each other almost everywhere";
				Login.Login_response3 = "and the Protect Item prayer won't work.";
			} else {
				Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world.";
				Login.Login_response2 = "Players can attack each other";
				Login.Login_response3 = "almost everywhere.";
			}

			Login.Login_response0 = "Warning!";
			class85.method2689(1);
			return true;
		} else if ((Client.worldProperties & class571.field5650.rsOrdinal()) != 0) {
			Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
			Login.Login_response2 = "The Protect Item prayer will";
			Login.Login_response3 = "not work on this world.";
			Login.Login_response0 = "Warning!";
			class85.method2689(1);
			return true;
		} else {
			return false;
		}
	}
}
