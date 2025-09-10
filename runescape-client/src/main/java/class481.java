import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("sf")
public class class481 {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -274269561
	)
	int field5313;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1560321539
	)
	int field5312;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -668090167
	)
	int field5314;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2142894817
	)
	int field5315;

	public String toString() {
		boolean var1 = true;
		int var2 = 10 - Integer.toString(this.field5313).length();
		int var3 = 10 - Integer.toString(this.field5314).length();
		int var4 = 10 - Integer.toString(this.field5312).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return "    Size: " + this.field5313 + var5 + "Created: " + this.field5312 + var7 + "Total used: " + this.field5314 + var6 + "Max-In-Use: " + this.field5315;
	}
}
