import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vl")
public abstract class class560 {
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lxt;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -793170329
	)
	int field5758;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -2038307183
	)
	int field5755;
	@ObfuscatedName("au")
	double field5757;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1633079139
	)
	int field5756;

	class560(int var1, int var2) {
		this.field5758 = 0;
		this.field5755 = 0;
		this.field5757 = 0.0D;
		this.field5756 = 0;
		this.field5758 = var1;
		this.field5755 = 0;
		this.field5756 = var2 >= 0 && var2 <= 27 ? var2 : 0;
		this.field5757 = LoginScreenAnimation.method2635((long)this.field5755, (long)this.field5758, class358.method7617(this.field5756));
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "85737980"
	)
	public void method10986() {
		if (this.field5755 < this.field5758) {
			++this.field5755;
			this.field5757 = LoginScreenAnimation.method2635((long)this.field5755, (long)this.field5758, class358.method7617(this.field5756));
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)D",
		garbageValue = "-30"
	)
	double method10984() {
		return this.field5757;
	}
}
