import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
public class class153 {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1240141227
	)
	static int field1788;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = 2958712007568704023L
	)
	long field1781;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1876916741
	)
	public int field1790;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	IterableNodeDeque field1791;

	@ObfuscatedSignature(
		descriptor = "(Lwj;)V"
	)
	public class153(Buffer var1) {
		this.field1790 = -1;
		this.field1791 = new IterableNodeDeque();
		this.method3923(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "-16777216"
	)
	void method3923(Buffer var1) {
		this.field1781 = var1.readLong();
		this.field1790 = var1.readInt();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 3) {
				var3 = new class172(this);
			} else if (var2 == 1) {
				var3 = new LoginPacket(this);
			} else if (var2 == 13) {
				var3 = new class165(this);
			} else if (var2 == 4) {
				var3 = new Sound(this);
			} else if (var2 == 6) {
				var3 = new class164(this);
			} else if (var2 == 5) {
				var3 = new class149(this);
			} else if (var2 == 2) {
				var3 = new class154(this);
			} else if (var2 == 7) {
				var3 = new class147(this);
			} else if (var2 == 14) {
				var3 = new class151(this);
			} else if (var2 == 8) {
				var3 = new class168(this);
			} else if (var2 == 9) {
				var3 = new class174(this);
			} else if (var2 == 10) {
				var3 = new class160(this);
			} else if (var2 == 11) {
				var3 = new class155(this);
			} else if (var2 == 12) {
				var3 = new class159(this);
			} else {
				if (var2 != 15) {
					throw new RuntimeException("");
				}

				var3 = new class169(this);
			}

			((class150)var3).vmethod4162(var1);
			this.field1791.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgh;I)V",
		garbageValue = "-369510317"
	)
	public void method3920(ClanSettings var1) {
		if (var1.field1866 == this.field1781 && this.field1790 == var1.field1842) {
			for (class150 var2 = (class150)this.field1791.last(); var2 != null; var2 = (class150)this.field1791.previous()) {
				var2.vmethod4163(var1);
			}

			++var1.field1842;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "-294683694"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (class35.widgetDefinition.loadInterface(var0)) {
			FontName.field5818 = null;
			GrandExchangeOfferNameComparator.drawInterface(class35.widgetDefinition.Widget_interfaceComponents[var0], 0, class35.widgetDefinition.Widget_interfaceComponents[var0].length - 1, -1, -1, var1, var2, var3, var4, var5, var6, var7);
			if (FontName.field5818 != null) {
				GrandExchangeOfferNameComparator.drawInterface(FontName.field5818, 0, FontName.field5818.length - 1, -1412584499, -1412584499, var1, var2, var3, var4, class362.field4083, Actor.field1097, var7);
				FontName.field5818 = null;
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
