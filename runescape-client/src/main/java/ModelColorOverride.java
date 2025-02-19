import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jb")
@Implements("ModelColorOverride")
public class ModelColorOverride {
	@ObfuscatedName("ab")
	@Export("overrideHue")
	byte overrideHue;
	@ObfuscatedName("ay")
	@Export("overrideSaturation")
	byte overrideSaturation;
	@ObfuscatedName("au")
	@Export("overrideLuminance")
	byte overrideLuminance;
	@ObfuscatedName("ad")
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
		descriptor = "(Ljb;)V"
	)
	void method5434(ModelColorOverride var1) {
		this.overrideHue = var1.overrideHue;
		this.overrideSaturation = var1.overrideSaturation;
		this.overrideLuminance = var1.overrideLuminance;
		this.overrideAmount = var1.overrideAmount;
	}

	@ObfuscatedName("ay")
	public void method5435(byte var1, byte var2, byte var3, byte var4) {
		this.overrideHue = var1;
		this.overrideSaturation = var2;
		this.overrideLuminance = var3;
		this.overrideAmount = var4;
	}

	@ObfuscatedName("au")
	public void method5436() {
		this.overrideHue = -1;
		this.overrideSaturation = -1;
		this.overrideLuminance = -1;
		this.overrideAmount = 0;
	}

	@ObfuscatedName("ad")
	public boolean method5437() {
		return this.overrideAmount > 0;
	}
}
