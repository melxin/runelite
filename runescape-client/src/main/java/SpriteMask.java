import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nq")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 143943703
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 298036503
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("at")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("ac")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1;
		this.height = var2;
		this.xWidths = var3;
		this.xStarts = var4;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-124"
	)
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) {
			int var3 = this.xStarts[var2];
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("af")
	static double method7393(double var0) {
		return Math.exp(var0 * -var0 / 2.0D) / Math.sqrt(6.283185307179586D);
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZI)I",
		garbageValue = "-1000290571"
	)
	static int method7397(int var0, Script var1, boolean var2) {
		return 2;
	}

	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "(Loi;IIZI)V",
		garbageValue = "2049495357"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width * 469894397;
		int var5 = var0.height * 1156037777;
		if (var0.widthAlignment == 0) {
			var0.width = var0.rawWidth * 1447114837;
		} else if (var0.widthAlignment == 1) {
			var0.width = (var1 - var0.rawWidth) * 1447114837;
		} else if (var0.widthAlignment == 2) {
			var0.width = (var0.rawWidth * var1 >> 14) * 1447114837;
		}

		if (var0.heightAlignment == 0) {
			var0.height = var0.rawHeight * 978027633;
		} else if (var0.heightAlignment == 1) {
			var0.height = (var2 - var0.rawHeight) * 978027633;
		} else if (var0.heightAlignment == 2) {
			var0.height = (var2 * var0.rawHeight >> 14) * 978027633;
		}

		if (var0.widthAlignment == 4) {
			var0.width = var0.height * var0.field4162 * 1156037777 / var0.field4163 * 1447114837;
		}

		if (var0.heightAlignment == 4) {
			var0.height = var0.width * var0.field4163 * 469894397 / var0.field4162 * 978027633;
		}

		if (var0.contentType == 1337) {
			Client.viewportWidget = var0;
		}

		if (var0.type == 12) {
			var0.method7971().method7880(var0.width * 469894397, var0.height * 1156037777);
		}

		if (var3 && var0.onResize != null && (var4 != var0.width * 469894397 || var5 != var0.height * 1156037777)) {
			ScriptEvent var6 = new ScriptEvent();
			var6.widget = var0;
			var6.args = var0.onResize;
			Client.scriptEvents.addFirst(var6);
		}

	}

	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "(Loi;I)Z",
		garbageValue = "2095244080"
	)
	static final boolean method7398(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 205) {
			Client.logoutTimer = 250;
			return true;
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) {
				var2 = (var1 - 300) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.changeAppearance(var2, var3 == 1);
			}

			if (var1 >= 314 && var1 <= 323) {
				var2 = (var1 - 314) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.method7543(var2, var3 == 1);
			}

			if (var1 == 324) {
				Client.playerAppearance.method7531(0);
			}

			if (var1 == 325) {
				Client.playerAppearance.method7531(1);
			}

			if (var1 == 326) {
				PacketBufferNode var4 = UserComparator6.getPacketBufferNode(ClientPacket.UPDATE_PLAYER_MODEL, Client.packetWriter.isaacCipher);
				Client.playerAppearance.write(var4.packetBuffer);
				Client.packetWriter.addNode(var4);
				return true;
			} else {
				return false;
			}
		}
	}
}
