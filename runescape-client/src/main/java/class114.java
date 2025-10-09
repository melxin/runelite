import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
public class class114 {
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1289571099
	)
	static int field1517;
	@ObfuscatedName("ie")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1713076229
	)
	int field1514;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1988170621
	)
	int field1515;
	@ObfuscatedName("ag")
	byte[] field1518;

	class114() {
		this.field1514 = 0;
		this.field1515 = 0;
		this.field1518 = null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "17"
	)
	int method3529(int var1) {
		int var2 = 0;

		int var3;
		int var4;
		for (var3 = 0; var1 >= 8 - this.field1515; var1 -= var4) {
			var4 = 8 - this.field1515;
			int var5 = (1 << var4) - 1;
			var2 += (this.field1518[this.field1514] >> this.field1515 & var5) << var3;
			this.field1515 = 0;
			++this.field1514;
			var3 += var4;
		}

		if (var1 > 0) {
			var4 = (1 << var1) - 1;
			var2 += (this.field1518[this.field1514] >> this.field1515 & var4) << var3;
			this.field1515 += var1;
		}

		return var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "57"
	)
	int method3531() {
		int var1 = this.field1518[this.field1514] >> this.field1515 & 1;
		++this.field1515;
		this.field1514 += this.field1515 >> 3;
		this.field1515 &= 7;
		return var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([BII)V",
		garbageValue = "-1052187310"
	)
	void method3532(byte[] var1, int var2) {
		this.field1518 = var1;
		this.field1514 = var2;
		this.field1515 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "27"
	)
	public static void method3540(String var0) {
		if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
			try {
				Desktop.getDesktop().browse(new URI(var0));
			} catch (Exception var2) {
			}
		}

	}
}
