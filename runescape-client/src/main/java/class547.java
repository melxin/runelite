import java.awt.FontMetrics;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vk")
public class class547 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lbg;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("as")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	@ObfuscatedName("ap")
	public final Object field5539;
	@ObfuscatedName("aj")
	public final Object field5538;

	public class547(Object var1, Object var2) {
		this.field5539 = var1;
		this.field5538 = var2;
	}

	public String toString() {
		return this.field5539 + ", " + this.field5538;
	}

	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof class547) {
			class547 var2 = (class547)var1;
			if (this.field5539 == null) {
				if (var2.field5539 != null) {
					return false;
				}
			} else if (!this.field5539.equals(var2.field5539)) {
				return false;
			}

			if (this.field5538 == null) {
				if (var2.field5538 != null) {
					return false;
				}
			} else if (!this.field5538.equals(var2.field5538)) {
				return false;
			}

			return true;
		} else {
			return false;
		}
	}

	public int hashCode() {
		int var1 = 0;
		if (this.field5539 != null) {
			var1 += this.field5539.hashCode();
		}

		if (this.field5538 != null) {
			var1 += 31 * this.field5538.hashCode();
		}

		return var1;
	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		Client.menu.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		Client.menu.menuWorldViewIds[0] = -1;
		Client.menu.menuActions[0] = "Cancel";
		Client.menu.menuTargets[0] = "";
		Client.menu.menuOpcodes[0] = 1006;
		Client.menu.menuShiftClick[0] = false;
		Client.menu.subMenus[0] = null;
		Client.menu.menuOptionsCount = 1;
	}
}
