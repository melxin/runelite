import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
@Implements("ModelColorOverride")
public class ModelColorOverride {
	@ObfuscatedName("ab")
	@Export("overrideHue")
	byte overrideHue;
	@ObfuscatedName("at")
	@Export("overrideSaturation")
	byte overrideSaturation;
	@ObfuscatedName("ag")
	@Export("overrideLuminance")
	byte overrideLuminance;
	@ObfuscatedName("aj")
	@Export("overrideAmount")
	byte overrideAmount;

	public ModelColorOverride() {
		this.overrideHue = -1;
		this.overrideSaturation = -1;
		this.overrideLuminance = -1;
		this.overrideAmount = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljs;)V"
	)
	void method5737(ModelColorOverride var1) {
		this.overrideHue = var1.overrideHue;
		this.overrideSaturation = var1.overrideSaturation;
		this.overrideLuminance = var1.overrideLuminance;
		this.overrideAmount = var1.overrideAmount;
	}

	@ObfuscatedName("at")
	public void method5729(byte var1, byte var2, byte var3, byte var4) {
		this.overrideHue = var1;
		this.overrideSaturation = var2;
		this.overrideLuminance = var3;
		this.overrideAmount = var4;
	}

	@ObfuscatedName("ag")
	public void method5728() {
		this.overrideHue = -1;
		this.overrideSaturation = -1;
		this.overrideLuminance = -1;
		this.overrideAmount = 0;
	}

	@ObfuscatedName("aj")
	public boolean method5733() {
		return this.overrideAmount > 0;
	}
}
