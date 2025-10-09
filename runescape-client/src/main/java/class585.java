import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("wh")
public class class585 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1452931525
	)
	final int field5964;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1895787889
	)
	final int field5961;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -2139010701
	)
	final int field5962;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1588128873
	)
	final int field5963;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -2106869485
	)
	final int field5960;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -2038155671
	)
	final int field5965;

	class585(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field5964 = var1;
		this.field5961 = var2;
		this.field5960 = var3;
		this.field5965 = var4;
		this.field5962 = var1 / 2;
		this.field5963 = var2 / 2;
	}

	public String toString() {
		return String.format("%dx%d (offset %d,%d)", this.field5964, this.field5961, this.field5960, this.field5965);
	}
}
