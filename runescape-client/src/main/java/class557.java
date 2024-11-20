import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vi")
public class class557 {
	@ObfuscatedName("ab")
	int[] field5474;
	@ObfuscatedName("aw")
	short[] field5475;

	@ObfuscatedSignature(
		descriptor = "(Lhw;)V"
	)
	public class557(NPCComposition var1) {
		this.field5474 = new int[8];
		this.field5475 = new short[8];
		int var2 = 0;
		if (var1.method3940()) {
			var2 = var1.method3911().length;
			System.arraycopy(var1.method3911(), 0, this.field5474, 0, var2);
			System.arraycopy(var1.method3913(), 0, this.field5475, 0, var2);
		}

		for (int var3 = var2; var3 < 8; ++var3) {
			this.field5474[var3] = -1;
			this.field5475[var3] = -1;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-918743814"
	)
	public int[] method10375() {
		return this.field5474;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "1277210973"
	)
	public short[] method10373() {
		return this.field5475;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IISB)V",
		garbageValue = "19"
	)
	public void method10374(int var1, int var2, short var3) {
		this.field5474[var1] = var2;
		this.field5475[var1] = var3;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "-1254862484"
	)
	public void method10376(int[] var1, short[] var2) {
		this.field5474 = var1;
		this.field5475 = var2;
	}
}
