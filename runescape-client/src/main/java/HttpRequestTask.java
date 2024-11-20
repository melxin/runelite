import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ad")
@Implements("HttpRequestTask")
public class HttpRequestTask implements Callable {
	@ObfuscatedName("av")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("nm")
	@ObfuscatedGetter(
		intValue = -1094704919
	)
	static int field88;
	@ObfuscatedName("qd")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	final HttpRequest field92;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	final AsyncRestClient this$0;

	@ObfuscatedSignature(
		descriptor = "(Las;Laf;)V"
	)
	HttpRequestTask(AsyncRestClient var1, HttpRequest var2) {
		this.this$0 = var1;
		this.field92 = var2;
	}

	public Object call() throws Exception {
		try {
			while (this.field92.connect()) {
				class188.method3857(10L);
			}
		} catch (IOException var2) {
			return new HttpResponse("Error servicing REST query: " + var2.getMessage());
		}

		return this.field92.getResponse();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "18"
	)
	static final void method269(String var0) {
		class289.addGameMessage(30, "", var0);
	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1896399579"
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
