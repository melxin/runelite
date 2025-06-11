import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
public class class167 extends class149 {
	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "Les;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 851533751
	)
	int field1843;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1987710141
	)
	int field1841;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfp;)V"
	)
	class167(class152 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "-1635342078"
	)
	void vmethod3913(Buffer var1) {
		this.field1843 = var1.readInt();
		this.field1841 = var1.readInt();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lgu;I)V",
		garbageValue = "-1572789515"
	)
	void vmethod3914(ClanSettings var1) {
		var1.method3756(this.field1843, this.field1841);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lps;IIB)Z",
		garbageValue = "-51"
	)
	static boolean method3865(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2);
		if (var3 == null) {
			return false;
		} else {
			Projectile.SpriteBuffer_decode(var3);
			return true;
		}
	}
}
