import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kr")
public abstract class class270 {
	@ObfuscatedName("ac")
	String field3188;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	final class267 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lkm;Ljava/lang/String;)V"
	)
	class270(class267 var1, String var2) {
		this.this$0 = var1;
		this.field3188 = var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-11589271"
	)
	public abstract int vmethod6058();

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2108382239"
	)
	public int vmethod6060() {
		return -1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1657302888"
	)
	public String vmethod6059() {
		return null;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1613921693"
	)
	public String method6057() {
		return this.field3188;
	}

	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2089004300"
	)
	static final void method6071(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class36.clientPreferences.updateSoundEffectVolume(var0);
	}

	@ObfuscatedName("pt")
	@ObfuscatedSignature(
		descriptor = "(Lwb;IB)V",
		garbageValue = "35"
	)
	static void method6064(Buffer var0, int var1) {
		PlayerCompositionColorTextureOverride.method4126(var0.array, var1);
		FontName.method10841(var0, var1);
	}
}
