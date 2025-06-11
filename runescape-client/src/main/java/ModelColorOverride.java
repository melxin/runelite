import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jw")
@Implements("ModelColorOverride")
public class ModelColorOverride {
	@ObfuscatedName("ap")
	@Export("overrideHue")
	byte overrideHue;
	@ObfuscatedName("aj")
	@Export("overrideSaturation")
	byte overrideSaturation;
	@ObfuscatedName("an")
	@Export("overrideLuminance")
	byte overrideLuminance;
	@ObfuscatedName("ai")
	@Export("overrideAmount")
	byte overrideAmount;

	public ModelColorOverride() {
		this.overrideHue = -1;
		this.overrideSaturation = -1;
		this.overrideLuminance = -1;
		this.overrideAmount = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljw;)V"
	)
	void method5711(ModelColorOverride var1) {
		this.overrideHue = var1.overrideHue;
		this.overrideSaturation = var1.overrideSaturation;
		this.overrideLuminance = var1.overrideLuminance;
		this.overrideAmount = var1.overrideAmount;
	}

	@ObfuscatedName("aj")
	public void method5715(byte var1, byte var2, byte var3, byte var4) {
		this.overrideHue = var1;
		this.overrideSaturation = var2;
		this.overrideLuminance = var3;
		this.overrideAmount = var4;
	}

	@ObfuscatedName("an")
	public void method5713() {
		this.overrideHue = -1;
		this.overrideSaturation = -1;
		this.overrideLuminance = -1;
		this.overrideAmount = 0;
	}

	@ObfuscatedName("ai")
	public boolean method5714() {
		return this.overrideAmount > 0;
	}
}
