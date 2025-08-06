import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
public class class171 extends class149 {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = -1399546811371497651L
	)
	long field1899;
	@ObfuscatedName("ab")
	String field1897;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfg;)V"
	)
	class171(class152 var1) {
		this.this$0 = var1;
		this.field1899 = -1L;
		this.field1897 = null;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "1324754926"
	)
	void vmethod4086(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1899 = var1.readLong();
		}

		this.field1897 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lgk;I)V",
		garbageValue = "1924878263"
	)
	void vmethod4088(ClanSettings var1) {
		var1.method3900(this.field1899, this.field1897);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "941839481"
	)
	public static void method4074() {
		VarbitComposition.VarbitDefinition_cached.clear();
	}
}
