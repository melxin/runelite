import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
public class class164 extends class167 {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1561273863
	)
	int field1880;
	@ObfuscatedName("aw")
	byte field1879;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 282965887
	)
	int field1881;
	@ObfuscatedName("ac")
	String field1882;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lga;"
	)
	final class168 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lga;)V"
	)
	class164(class168 var1) {
		this.this$0 = var1;
		this.field1880 = -1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "1665789280"
	)
	void vmethod4108(Buffer var1) {
		var1.readUnsignedByte();
		this.field1880 = var1.readUnsignedShort();
		this.field1879 = var1.readByte();
		this.field1881 = var1.readUnsignedShort();
		var1.readLong();
		this.field1882 = var1.readStringCp1252NullTerminated();
		var1.readUnsignedByte();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgm;I)V",
		garbageValue = "-358275379"
	)
	void vmethod4104(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1880);
		var2.rank = this.field1879;
		var2.world = this.field1881;
		var2.username = new Username(this.field1882);
	}

	@ObfuscatedName("af")
	public static final void method4001(long var0) {
		if (var0 > 0L) {
			if (0L == var0 % 10L) {
				long var2 = var0 - 1L;

				try {
					Thread.sleep(var2);
				} catch (InterruptedException var8) {
				}

				try {
					Thread.sleep(1L);
				} catch (InterruptedException var7) {
				}
			} else {
				try {
					Thread.sleep(var0);
				} catch (InterruptedException var6) {
				}
			}

		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "710"
	)
	public static int method4009(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
		var0 = var0 + (var0 >>> 4) & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 255;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[Ljava/lang/Object;III)V",
		garbageValue = "-2128978745"
	)
	public static void method4008(String[] var0, Object[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			Object var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					Object var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method4008(var0, var1, var2, var5 - 1);
			method4008(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIB)V",
		garbageValue = "-49"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (UrlRequester.widgetDefinition.loadInterface(var0)) {
			class152.field1777 = null;
			PendingSpawn.drawInterface(UrlRequester.widgetDefinition.Widget_interfaceComponents[var0], 0, UrlRequester.widgetDefinition.Widget_interfaceComponents[var0].length - 1, -1, -1, var1, var2, var3, var4, var5, var6, var7);
			if (class152.field1777 != null) {
				PendingSpawn.drawInterface(class152.field1777, 0, class152.field1777.length - 1, -1412584499, -1412584499, var1, var2, var3, var4, class163.field1872, WorldMapRenderer.field3375, var7);
				class152.field1777 = null;
			}

		} else {
			if (var7 != -1) {
				Client.validRootWidgets[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) {
					Client.validRootWidgets[var8] = true;
				}
			}

		}
	}
}
