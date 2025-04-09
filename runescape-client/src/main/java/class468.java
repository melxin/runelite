import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("st")
public class class468 {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1812719223
	)
	int field5050;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1852065691
	)
	int field5049;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -361230211
	)
	int field5051;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -304333489
	)
	int field5048;

	public String toString() {
		boolean var1 = true;
		int var2 = 10 - Integer.toString(this.field5050).length();
		int var3 = 10 - Integer.toString(this.field5051).length();
		int var4 = 10 - Integer.toString(this.field5049).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return "    Size: " + this.field5050 + var5 + "Created: " + this.field5049 + var7 + "Total used: " + this.field5051 + var6 + "Max-In-Use: " + this.field5048;
	}
}
