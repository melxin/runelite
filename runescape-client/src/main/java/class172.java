import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
public class class172 extends class150 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = 5754332401193467857L
	)
	long field1924;
	@ObfuscatedName("at")
	String field1925;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class172(class153 var1) {
		this.this$0 = var1;
		this.field1924 = -1L;
		this.field1925 = null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "1804820754"
	)
	void vmethod4162(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1924 = var1.readLong();
		}

		this.field1925 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgh;I)V",
		garbageValue = "1850606911"
	)
	void vmethod4163(ClanSettings var1) {
		var1.method3990(this.field1924, this.field1925);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "8"
	)
	public static int method4149(int var0) {
		return class335.field3845[var0];
	}

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "711956568"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1, int var2) {
		class263.updateItemPile2(class32.worldView, var0, var1, var2);
	}
}
