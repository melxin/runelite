import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ko")
@Implements("ModelColorOverride")
public class ModelColorOverride {
	@ObfuscatedName("at")
	@Export("overrideHue")
	byte overrideHue;
	@ObfuscatedName("ag")
	@Export("overrideSaturation")
	byte overrideSaturation;
	@ObfuscatedName("an")
	@Export("overrideLuminance")
	byte overrideLuminance;
	@ObfuscatedName("ae")
	@Export("overrideAmount")
	byte overrideAmount;

	public ModelColorOverride() {
		this.overrideHue = -1;
		this.overrideSaturation = -1;
		this.overrideLuminance = -1;
		this.overrideAmount = 0;
	}

	public ModelColorOverride(byte var1, byte var2, byte var3, byte var4) {
		this.overrideHue = -1;
		this.overrideSaturation = -1;
		this.overrideLuminance = -1;
		this.overrideAmount = 0;
		this.overrideHue = var1;
		this.overrideSaturation = var2;
		this.overrideLuminance = var3;
		this.overrideAmount = var4;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lko;)V"
	)
	void method6119(ModelColorOverride var1) {
		this.overrideHue = var1.overrideHue;
		this.overrideSaturation = var1.overrideSaturation;
		this.overrideLuminance = var1.overrideLuminance;
		this.overrideAmount = var1.overrideAmount;
	}

	@ObfuscatedName("at")
	public void method6123(byte var1, byte var2, byte var3, byte var4) {
		this.overrideHue = var1;
		this.overrideSaturation = var2;
		this.overrideLuminance = var3;
		this.overrideAmount = var4;
	}

	@ObfuscatedName("ag")
	public void method6118() {
		this.overrideHue = -1;
		this.overrideSaturation = -1;
		this.overrideLuminance = -1;
		this.overrideAmount = 0;
	}

	@ObfuscatedName("an")
	public boolean method6121() {
		return this.overrideAmount > 0;
	}
}
