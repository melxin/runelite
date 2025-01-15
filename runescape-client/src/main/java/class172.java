import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
public class class172 extends class150 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = 7871847390707015403L
	)
	long field1822;
	@ObfuscatedName("ah")
	String field1820;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;)V"
	)
	class172(class153 var1) {
		this.this$0 = var1;
		this.field1822 = -1L;
		this.field1820 = null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-1355269794"
	)
	void vmethod3879(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1822 = var1.readLong();
		}

		this.field1820 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgq;B)V",
		garbageValue = "0"
	)
	void vmethod3882(ClanSettings var1) {
		var1.method3693(this.field1822, this.field1820);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "16433405"
	)
	public static float method3867(int var0) {
		var0 &= 2047;
		return (float)(6.283185307179586D * (double)((float)var0 / 2048.0F));
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(CB)C",
		garbageValue = "2"
	)
	static char method3861(char var0) {
		if (var0 == 198) {
			return 'E';
		} else if (var0 == 230) {
			return 'e';
		} else if (var0 == 223) {
			return 's';
		} else if (var0 == 338) {
			return 'E';
		} else {
			return (char)(var0 == 339 ? 'e' : '\u0000');
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(FFFFLff;B)V",
		garbageValue = "5"
	)
	static void method3866(float var0, float var1, float var2, float var3, class136 var4) {
		float var5 = var1 - var0;
		float var6 = var2 - var1;
		float var7 = var3 - var2;
		float var8 = var6 - var5;
		var4.field1581 = var7 - var6 - var8;
		var4.field1580 = var8 + var8 + var8;
		var4.field1579 = var5 + var5 + var5;
		var4.field1578 = var0;
	}
}
