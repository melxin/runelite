import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sa")
public class class479 {
	@ObfuscatedName("vg")
	@ObfuscatedSignature(
		descriptor = "Ltd;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1304244903
	)
	int field5361;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -461220521
	)
	int field5362;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1891554987
	)
	int field5365;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1391706955
	)
	int field5364;

	public String toString() {
		boolean var1 = true;
		int var2 = 10 - Integer.toString(this.field5361).length();
		int var3 = 10 - Integer.toString(this.field5365).length();
		int var4 = 10 - Integer.toString(this.field5362).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return "    Size: " + this.field5361 + var5 + "Created: " + this.field5362 + var7 + "Total used: " + this.field5365 + var6 + "Max-In-Use: " + this.field5364;
	}
}
