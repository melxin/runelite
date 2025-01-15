import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vn")
public class class557 {
	@ObfuscatedName("as")
	static int[] field5476;
	@ObfuscatedName("ay")
	int[] field5474;
	@ObfuscatedName("ah")
	short[] field5475;

	@ObfuscatedSignature(
		descriptor = "(Ljz;)V"
	)
	public class557(NPCComposition var1) {
		this.field5474 = new int[8];
		this.field5475 = new short[8];
		int var2 = 0;
		if (var1.method5306()) {
			var2 = var1.method5338().length;
			System.arraycopy(var1.method5338(), 0, this.field5474, 0, var2);
			System.arraycopy(var1.method5308(), 0, this.field5475, 0, var2);
		}

		for (int var3 = var2; var3 < 8; ++var3) {
			this.field5474[var3] = -1;
			this.field5475[var3] = -1;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "2094086716"
	)
	public int[] method10527() {
		return this.field5474;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)[S",
		garbageValue = "47"
	)
	public short[] method10528() {
		return this.field5475;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "-1698545184"
	)
	public void method10531(int var1, int var2, short var3) {
		this.field5474[var1] = var2;
		this.field5475[var1] = var3;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "-1619580615"
	)
	public void method10530(int[] var1, short[] var2) {
		this.field5474 = var1;
		this.field5475 = var2;
	}
}
