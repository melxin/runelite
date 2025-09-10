import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
@Implements("ModelColorOverride")
public class ModelColorOverride {
	@ObfuscatedName("af")
	@Export("overrideHue")
	byte overrideHue;
	@ObfuscatedName("aw")
	@Export("overrideSaturation")
	byte overrideSaturation;
	@ObfuscatedName("at")
	@Export("overrideLuminance")
	byte overrideLuminance;
	@ObfuscatedName("ac")
	@Export("overrideAmount")
	byte overrideAmount;

	public ModelColorOverride() {
		this.overrideHue = -1;
		this.overrideSaturation = -1;
		this.overrideLuminance = -1;
		this.overrideAmount = 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljz;)V"
	)
	void method5648(ModelColorOverride var1) {
		this.overrideHue = var1.overrideHue;
		this.overrideSaturation = var1.overrideSaturation;
		this.overrideLuminance = var1.overrideLuminance;
		this.overrideAmount = var1.overrideAmount;
	}

	@ObfuscatedName("aw")
	public void method5649(byte var1, byte var2, byte var3, byte var4) {
		this.overrideHue = var1;
		this.overrideSaturation = var2;
		this.overrideLuminance = var3;
		this.overrideAmount = var4;
	}

	@ObfuscatedName("at")
	public void method5650() {
		this.overrideHue = -1;
		this.overrideSaturation = -1;
		this.overrideLuminance = -1;
		this.overrideAmount = 0;
	}

	@ObfuscatedName("ac")
	public boolean method5651() {
		return this.overrideAmount > 0;
	}
}
