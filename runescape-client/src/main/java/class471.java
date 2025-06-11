import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("sf")
public class class471 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -90947853
	)
	int field5101;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 621640811
	)
	int field5102;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 2139039183
	)
	int field5100;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1879063073
	)
	int field5103;

	public String toString() {
		boolean var1 = true;
		int var2 = 10 - Integer.toString(this.field5101).length();
		int var3 = 10 - Integer.toString(this.field5100).length();
		int var4 = 10 - Integer.toString(this.field5102).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return "    Size: " + this.field5101 + var5 + "Created: " + this.field5102 + var7 + "Total used: " + this.field5100 + var6 + "Max-In-Use: " + this.field5103;
	}
}
