import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
public class class163 extends class167 {
	@ObfuscatedName("av")
	String field1852;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 761278577
	)
	int field1855;
	@ObfuscatedName("ag")
	byte field1854;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	final class168 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgt;)V"
	)
	class163(class168 var1) {
		this.this$0 = var1;
		this.field1852 = null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxa;B)V",
		garbageValue = "23"
	)
	void vmethod4228(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			var1.offset -= 1741769013;
			var1.readLong();
		}

		this.field1852 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1855 = var1.readUnsignedShort();
		this.field1854 = var1.readByte();
		var1.readLong();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgz;B)V",
		garbageValue = "-24"
	)
	void vmethod4229(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember();
		var2.username = new Username(this.field1852);
		var2.world = this.field1855;
		var2.rank = this.field1854;
		var1.addMember(var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Loe;IIIII)Loe;",
		garbageValue = "49319"
	)
	public static WidgetConfigNode method4132(WidgetConfigNode var0, int var1, int var2, int var3, int var4) {
		WidgetConfigNode var5 = var0;

		WidgetConfigNode var6;
		for (var6 = null; var5 != null; var5 = var5.nextWidgetConfigNode) {
			if (var5.end >= var1 && var5.start <= var2) {
				if (var6 != null) {
					var6.nextWidgetConfigNode = var5.nextWidgetConfigNode;
				} else {
					var0 = var5.nextWidgetConfigNode;
				}

				WidgetConfigNode var7;
				if (var5.start < var1) {
					var7 = new WidgetConfigNode(var5.start, var1 - 1, var5.clickMask, var5.opMask);
					if (var6 != null) {
						var7.nextWidgetConfigNode = var6.nextWidgetConfigNode;
					} else {
						var7.nextWidgetConfigNode = var0;
					}

					if (var6 != null) {
						var6.nextWidgetConfigNode = var7;
					} else {
						var0 = var7;
					}

					var6 = var7;
				}

				if (var5.end > var2) {
					var7 = new WidgetConfigNode(var2 + 1, var5.end, var5.clickMask, var5.opMask);
					if (var6 != null) {
						var7.nextWidgetConfigNode = var6.nextWidgetConfigNode;
					} else {
						var7.nextWidgetConfigNode = var0;
					}

					if (var6 != null) {
						var6.nextWidgetConfigNode = var7;
					} else {
						var0 = var7;
					}
				}
			}

			var6 = var5;
		}

		var5 = null;

		for (var6 = var0; var6 != null && var6.start <= var1; var6 = var6.nextWidgetConfigNode) {
			var5 = var6;
		}

		var6 = new WidgetConfigNode(var1, var2, var3, var4);
		if (var5 != null) {
			var6.nextWidgetConfigNode = var5.nextWidgetConfigNode;
		} else {
			var6.nextWidgetConfigNode = var0;
		}

		if (var5 != null) {
			var5.nextWidgetConfigNode = var6;
		} else {
			var0 = var6;
		}

		return var0;
	}
}
