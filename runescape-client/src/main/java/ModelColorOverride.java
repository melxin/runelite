import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ja")
@Implements("ModelColorOverride")
public class ModelColorOverride {
	@ObfuscatedName("al")
	@Export("overrideHue")
	byte overrideHue;
	@ObfuscatedName("ab")
	@Export("overrideSaturation")
	byte overrideSaturation;
	@ObfuscatedName("ac")
	@Export("overrideLuminance")
	byte overrideLuminance;
	@ObfuscatedName("av")
	@Export("overrideAmount")
	byte overrideAmount;

	public ModelColorOverride() {
		this.overrideHue = -1;
		this.overrideSaturation = -1;
		this.overrideLuminance = -1;
		this.overrideAmount = 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lja;)V"
	)
	void method5650(ModelColorOverride var1) {
		this.overrideHue = var1.overrideHue;
		this.overrideSaturation = var1.overrideSaturation;
		this.overrideLuminance = var1.overrideLuminance;
		this.overrideAmount = var1.overrideAmount;
	}

	@ObfuscatedName("ab")
	public void method5658(byte var1, byte var2, byte var3, byte var4) {
		this.overrideHue = var1;
		this.overrideSaturation = var2;
		this.overrideLuminance = var3;
		this.overrideAmount = var4;
	}

	@ObfuscatedName("ac")
	public void method5652() {
		this.overrideHue = -1;
		this.overrideSaturation = -1;
		this.overrideLuminance = -1;
		this.overrideAmount = 0;
	}

	@ObfuscatedName("av")
	public boolean method5662() {
		return this.overrideAmount > 0;
	}
}
