import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("rl")
public class class452 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1412212293
	)
	int field4878;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -2081520757
	)
	int field4877;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 538544891
	)
	int field4876;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -224863995
	)
	int field4879;

	public String toString() {
		boolean var1 = true;
		int var2 = 10 - Integer.toString(this.field4878).length();
		int var3 = 10 - Integer.toString(this.field4876).length();
		int var4 = 10 - Integer.toString(this.field4877).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return "    Size: " + this.field4878 + var5 + "Created: " + this.field4877 + var7 + "Total used: " + this.field4876 + var6 + "Max-In-Use: " + this.field4879;
	}
}
