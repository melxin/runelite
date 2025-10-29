import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
@Implements("HttpMethod")
public class HttpMethod implements Enum {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	@Export("POST")
	public static final HttpMethod POST;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	@Export("GET")
	public static final HttpMethod GET;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	@Export("PUT")
	static final HttpMethod PUT;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	@Export("PATCH")
	static final HttpMethod PATCH;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	@Export("DELETE")
	static final HttpMethod DELETE;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1731089793
	)
	int field35;
	@ObfuscatedName("ak")
	@Export("name")
	String name;
	@ObfuscatedName("aw")
	boolean field39;
	@ObfuscatedName("ap")
	boolean field37;

	static {
		POST = new HttpMethod(0, "POST", true, true);
		GET = new HttpMethod(1, "GET", true, false);
		PUT = new HttpMethod(2, "PUT", false, true);
		PATCH = new HttpMethod(3, "PATCH", false, true);
		DELETE = new HttpMethod(4, "DELETE", false, true);
	}

	HttpMethod(int var1, String var2, boolean var3, boolean var4) {
		this.field35 = var1;
		this.name = var2;
		this.field39 = var3;
		this.field37 = var4;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field35;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-1"
	)
	boolean method69() {
		return this.field39;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-52"
	)
	@Export("getName")
	public String getName() {
		return this.name;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1232894927"
	)
	boolean method71() {
		return this.field37;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IS)Ljava/lang/String;",
		garbageValue = "-11554"
	)
	static final String method74(int var0) {
		if (var0 < 100000) {
			return "<col=ffff00>" + var0 + "</col>";
		} else {
			return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + "K" + "</col>" : "<col=00ff80>" + var0 / 1000000 + "M" + "</col>";
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZB)Lwn;",
		garbageValue = "61"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(class452.cacheDir, "preferences" + var0 + ".dat");
		if (var3.exists()) {
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L);
				return var10;
			} catch (IOException var9) {
			}
		}

		String var4 = "";
		if (class224.cacheGamebuild == 33) {
			var4 = "_rc";
		} else if (class224.cacheGamebuild == 34) {
			var4 = "_wip";
		}

		File var5 = new File(JagexCache.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
		AccessFile var6;
		if (!var2 && var5.exists()) {
			try {
				var6 = new AccessFile(var5, "rw", 10000L);
				return var6;
			} catch (IOException var8) {
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L);
			return var6;
		} catch (IOException var7) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1649667460"
	)
	static final int method85() {
		return ViewportMouse.ViewportMouse_y;
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-1099797848"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) {
			byte var2 = 4;
			int var3 = var2 + 6;
			int var4 = var2 + 6;
			int var5 = UserComparator5.fontPlain12.lineWidth(var0, 250);
			int var6 = UserComparator5.fontPlain12.lineCount(var0, 250) * 13;
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var2 + var2 + var5, var6 + var2 + var2, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var6 + var2, 16777215);
			UserComparator5.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
			class31.method489(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var6 + var2);
			if (var1) {
				GameEngine.rasterProvider.drawFull(0, 0);
			} else {
				class408.method8493(var3, var4, var5, var6);
			}

		}
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "-14"
	)
	static void method83(int var0, int var1, int var2, int var3, int var4) {
		class1.method10(AsyncHttpResponse.worldView, var0, var1, var2, var3, var4);
	}
}
