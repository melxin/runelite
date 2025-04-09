import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("te")
public class class503 implements Enum {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	static final class503 field5230;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	static final class503 field5221;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	static final class503 field5227;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	public static final class503 field5223;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 444677079
	)
	final int field5229;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1789071353
	)
	final int field5225;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 216029657
	)
	final int field5226;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1557696271
	)
	final int field5224;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -632774357
	)
	final int field5228;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1751845183
	)
	final int field5222;

	static {
		field5230 = new class503(0, 0, 0, 0, 0, 0);
		field5221 = new class503(1, 1, 507, 507, 507, 507);
		field5227 = new class503(2, 2, 338, 338, 338, 507);
		field5223 = new class503(3, 3, 499, 499, 499, 507);
	}

	class503(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field5229 = var1;
		this.field5222 = var2;
		this.field5225 = var3;
		this.field5226 = var4;
		this.field5224 = var5;
		this.field5228 = var6;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1746725635"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5222;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IZZZI)Z",
		garbageValue = "552386988"
	)
	boolean method9530(int var1, boolean var2, boolean var3, boolean var4) {
		byte var5 = 0;
		int var6 = var5 | (var3 ? 1 : 0);
		var6 |= var2 ? 8 : 32;
		var6 |= var4 ? 128 : 0;
		return (var1 & var6) != 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IZZZB)Z",
		garbageValue = "27"
	)
	boolean method9531(int var1, boolean var2, boolean var3, boolean var4) {
		byte var5 = 0;
		int var6 = var5 | (var3 ? 2 : 0);
		var6 |= var2 ? 16 : 64;
		var6 |= var4 ? 256 : 0;
		return (var1 & var6) != 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ZZZI)Z",
		garbageValue = "-514736094"
	)
	public boolean method9546(boolean var1, boolean var2, boolean var3) {
		return this.method9530(this.field5225, var1, var2, var3);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ZZZI)Z",
		garbageValue = "1855308654"
	)
	public boolean method9533(boolean var1, boolean var2, boolean var3) {
		return this.method9530(this.field5226, var1, var2, var3);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ZZZI)Z",
		garbageValue = "1602602031"
	)
	public boolean method9534(boolean var1, boolean var2, boolean var3) {
		return this.method9530(this.field5224, var1, var2, var3);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ZZZI)Z",
		garbageValue = "270498834"
	)
	public boolean method9559(boolean var1, boolean var2, boolean var3) {
		return this.method9530(this.field5228, var1, var2, var3);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ZZZI)Z",
		garbageValue = "1221455637"
	)
	public boolean method9536(boolean var1, boolean var2, boolean var3) {
		return this.method9531(this.field5225, var1, var2, var3);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ZZZI)Z",
		garbageValue = "389405663"
	)
	public boolean method9535(boolean var1, boolean var2, boolean var3) {
		return this.method9531(this.field5226, var1, var2, var3);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZZZS)Z",
		garbageValue = "-23800"
	)
	public boolean method9538(boolean var1, boolean var2, boolean var3) {
		return this.method9531(this.field5224, var1, var2, var3);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "1462812786"
	)
	static final float method9561(int var0) {
		float var1 = 10075.0F - (float)var0;
		return (1.0075567F * var1 - 75.56675F) / var1;
	}
}
