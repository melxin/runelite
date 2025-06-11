import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
public class class166 {
	@ObfuscatedName("nu")
	static boolean field1835;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = -8742692319367184903L
	)
	long field1830;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		longValue = 3274406513398282671L
	)
	public long field1832;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	IterableNodeDeque field1833;

	@ObfuscatedSignature(
		descriptor = "(Lwt;)V"
	)
	public class166(Buffer var1) {
		this.field1832 = -1L;
		this.field1833 = new IterableNodeDeque();
		this.method3853(var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "1564800486"
	)
	void method3853(Buffer var1) {
		this.field1830 = var1.readLong();
		this.field1832 = var1.readLong();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 1) {
				var3 = new class161(this);
			} else if (var2 == 4) {
				var3 = new class172(this);
			} else if (var2 == 3) {
				var3 = new class157(this);
			} else if (var2 == 2) {
				var3 = new class155(this);
			} else {
				if (var2 != 5) {
					throw new RuntimeException("");
				}

				var3 = new class162(this);
			}

			((class165)var3).vmethod3902(var1);
			this.field1833.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lgd;I)V",
		garbageValue = "1556211735"
	)
	public void method3858(ClanChannel var1) {
		if (var1.key == this.field1830 && var1.field1849 == this.field1832) {
			for (class165 var2 = (class165)this.field1833.last(); var2 != null; var2 = (class165)this.field1833.previous()) {
				var2.vmethod3908(var1);
			}

			++var1.field1849;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "1720191634"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (ClientPreferences.widgetDefinition.loadInterface(var0)) {
			Renderable.field2813 = null;
			class171.drawInterface(ClientPreferences.widgetDefinition.Widget_interfaceComponents[var0], 0, ClientPreferences.widgetDefinition.Widget_interfaceComponents[var0].length - 1, -1, -1, var1, var2, var3, var4, var5, var6, var7);
			if (Renderable.field2813 != null) {
				class171.drawInterface(Renderable.field2813, 0, Renderable.field2813.length - 1, -1412584499, -1412584499, var1, var2, var3, var4, class469.field5099, class330.field3668, var7);
				Renderable.field2813 = null;
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

	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-984632497"
	)
	static final void method3857() {
		Client.field548 = Client.cycleCntr;
		class159.ClanChat_inClanChat = true;
	}
}
