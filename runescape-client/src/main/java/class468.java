import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sy")
public class class468 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -9849425
	)
	int field5040;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1272361045
	)
	int field5041;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 874606427
	)
	int field5042;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 423869557
	)
	int field5043;

	public String toString() {
		boolean var1 = true;
		int var2 = 10 - Integer.toString(this.field5040).length();
		int var3 = 10 - Integer.toString(this.field5042).length();
		int var4 = 10 - Integer.toString(this.field5041).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return "    Size: " + this.field5040 + var5 + "Created: " + this.field5041 + var7 + "Total used: " + this.field5042 + var6 + "Max-In-Use: " + this.field5043;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "884827399"
	)
	public static int method8940(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383;
	}
}
