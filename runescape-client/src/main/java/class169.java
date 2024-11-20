import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
public class class169 extends class150 {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1680438605
	)
	int field1797;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfd;)V"
	)
	class169(class153 var1) {
		this.this$0 = var1;
		this.field1797 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvj;B)V",
		garbageValue = "-83"
	)
	void vmethod3694(Buffer var1) {
		this.field1797 = var1.readUnsignedShort();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgv;I)V",
		garbageValue = "2002935935"
	)
	void vmethod3695(ClanSettings var1) {
		var1.method3546(this.field1797);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "0"
	)
	static final int method3658(int var0, int var1) {
		int var2 = HttpResponse.method284(var0 - 1, var1 - 1) + HttpResponse.method284(1 + var0, var1 - 1) + HttpResponse.method284(var0 - 1, 1 + var1) + HttpResponse.method284(var0 + 1, var1 + 1);
		int var3 = HttpResponse.method284(var0 - 1, var1) + HttpResponse.method284(var0 + 1, var1) + HttpResponse.method284(var0, var1 - 1) + HttpResponse.method284(var0, var1 + 1);
		int var4 = HttpResponse.method284(var0, var1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}
}
