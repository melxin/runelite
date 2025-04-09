import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ux")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lux;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lux;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lux;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lux;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lux;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lux;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("av")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full");
		FontName_plain12 = new FontName("p12_full");
		FontName_bold12 = new FontName("b12_full");
		FontName_verdana11 = new FontName("verdana_11pt_regular");
		FontName_verdana13 = new FontName("verdana_13pt_regular");
		FontName_verdana15 = new FontName("verdana_15pt_regular");
	}

	FontName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)[Lux;",
		garbageValue = "-2121922467"
	)
	public static FontName[] method10007() {
		return new FontName[]{FontName_verdana13, FontName_verdana15, FontName_plain11, FontName_plain12, FontName_verdana11, FontName_bold12};
	}

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "42"
	)
	static final void method10003(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		Renderable.clientPreferences.updateSoundEffectVolume(var0);
	}

	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-56"
	)
	static final void method10006() {
		Client.field740 = Client.cycleCntr;
	}
}
