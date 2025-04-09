import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("av")
public enum class6 implements Enum {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lav;"
	)
	field18(0, 0);

	@ObfuscatedName("sl")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;
	@ObfuscatedName("wh")
	@ObfuscatedSignature(
		descriptor = "Lti;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -770302669
	)
	final int field13;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1134785895
	)
	final int field14;

	class6(int var3, int var4) {
		this.field13 = var3;
		this.field14 = var4;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1746725635"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field14;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnh;I[B[BI)V",
		garbageValue = "-1015097908"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field4018 == null) {
			if (var2 == null) {
				return;
			}

			var0.field4018 = new byte[11][];
			var0.field3944 = new byte[11][];
			var0.field4020 = new int[11];
			var0.field3952 = new int[11];
		}

		var0.field4018[var1] = var2;
		if (var2 != null) {
			var0.field4017 = true;
		} else {
			var0.field4017 = false;

			for (int var4 = 0; var4 < var0.field4018.length; ++var4) {
				if (var0.field4018[var4] != null) {
					var0.field4017 = true;
					break;
				}
			}
		}

		var0.field3944[var1] = var3;
	}
}
