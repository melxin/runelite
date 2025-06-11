import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
public class class164 extends class149 {
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lwy;"
	)
	@Export("options_buttons_0Sprite")
	static IndexedSprite options_buttons_0Sprite;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = 1847766597588277827L
	)
	long field1826;
	@ObfuscatedName("aj")
	String field1824;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1713242295
	)
	int field1823;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfp;)V"
	)
	class164(class152 var1) {
		this.this$0 = var1;
		this.field1826 = -1L;
		this.field1824 = null;
		this.field1823 = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "-1635342078"
	)
	void vmethod3913(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1826 = var1.readLong();
		}

		this.field1824 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1823 = var1.readUnsignedShort();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lgu;I)V",
		garbageValue = "-1572789515"
	)
	void vmethod3914(ClanSettings var1) {
		var1.method3747(this.field1826, this.field1824, this.field1823);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIII)J",
		garbageValue = "871737452"
	)
	static long method3844(int var0, int var1, int var2) {
		return (long)(var2 << 16 | var0 << 8 | var1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;ZI)Z",
		garbageValue = "-581170605"
	)
	static boolean method3843(File var0, boolean var1) {
		try {
			RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
			int var3 = var2.read();
			var2.seek(0L);
			var2.write(var3);
			var2.seek(0L);
			var2.close();
			if (var1) {
				var0.delete();
			}

			return true;
		} catch (Exception var4) {
			return false;
		}
	}
}
