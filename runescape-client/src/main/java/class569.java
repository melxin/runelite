import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vx")
public class class569 {
	@ObfuscatedName("ao")
	int[] field5603;
	@ObfuscatedName("an")
	short[] field5604;

	@ObfuscatedSignature(
		descriptor = "(Ljn;)V"
	)
	public class569(NPCComposition var1) {
		this.field5603 = new int[8];
		this.field5604 = new short[8];
		int var2 = 0;
		if (var1.method5182()) {
			var2 = var1.method5183().length;
			System.arraycopy(var1.method5183(), 0, this.field5603, 0, var2);
			System.arraycopy(var1.method5172(), 0, this.field5604, 0, var2);
		}

		for (int var3 = var2; var3 < 8; ++var3) {
			this.field5603[var3] = -1;
			this.field5604[var3] = -1;
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-310876704"
	)
	public int[] method10557() {
		return this.field5603;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "1765397739"
	)
	public short[] method10558() {
		return this.field5604;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "842558199"
	)
	public void method10559(int var1, int var2, short var3) {
		this.field5603[var1] = var2;
		this.field5604[var1] = var3;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "818633975"
	)
	public void method10560(int[] var1, short[] var2) {
		this.field5603 = var1;
		this.field5604 = var2;
	}
}
