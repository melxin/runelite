import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uu")
public abstract class class542 {
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1510255345
	)
	int field5452;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1382075685
	)
	int field5450;
	@ObfuscatedName("au")
	double field5449;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1517811763
	)
	int field5448;

	class542(int var1, int var2) {
		this.field5452 = 0;
		this.field5450 = 0;
		this.field5449 = 0.0D;
		this.field5448 = 0;
		this.field5452 = var1;
		this.field5450 = 0;
		this.field5448 = var2 >= 0 && var2 <= 27 ? var2 : 0;
		this.field5449 = class497.method9784(this.field5450, this.field5452, this.field5448);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1728415487"
	)
	public void method10258() {
		if (this.field5450 < this.field5452) {
			++this.field5450;
			this.field5449 = class497.method9784(this.field5450, this.field5452, this.field5448);
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "-208252047"
	)
	double method10259() {
		return this.field5449;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvf;I)I",
		garbageValue = "-786310958"
	)
	static final int method10267(LoginType var0) {
		if (var0 == null) {
			return 12;
		} else {
			switch(var0.field5557) {
			case 8:
				return 20;
			default:
				return 12;
			}
		}
	}
}
