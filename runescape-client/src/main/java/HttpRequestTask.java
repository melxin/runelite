import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
@Implements("HttpRequestTask")
public class HttpRequestTask implements Callable {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	final HttpRequest field68;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	final AsyncRestClient this$0;

	@ObfuscatedSignature(
		descriptor = "(Laj;Lax;)V"
	)
	HttpRequestTask(AsyncRestClient var1, HttpRequest var2) {
		this.this$0 = var1;
		this.field68 = var2;
	}

	public Object call() throws Exception {
		try {
			while (this.field68.connect()) {
				WorldMapRectangle.method6331(10L);
			}
		} catch (IOException var2) {
			return new HttpResponse("Error servicing REST query: " + var2.getMessage());
		}

		return this.field68.getResponse();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lph;Ljava/lang/String;Ljava/lang/String;I)[Lws;",
		garbageValue = "1558197257"
	)
	@Export("getFont")
	public static IndexedSprite[] getFont(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			return class223.method4935(var0, var3, var4);
		}
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1966406459"
	)
	static final void method287() {
		int[] var0 = Client.playerUpdateManager.playerIndices;
		Iterator var1 = Client.worldViewManager.iterator();

		while (var1.hasNext()) {
			WorldView var2 = (WorldView)var1.next();

			for (int var3 = 0; var3 < Client.playerUpdateManager.playerCount; ++var3) {
				Player var4 = (Player)var2.players.get((long)var0[var3]);
				if (var4 != null && var4.overheadTextCyclesRemaining > 0) {
					--var4.overheadTextCyclesRemaining;
					if (var4.overheadTextCyclesRemaining == 0) {
						var4.overheadText = null;
					}
				}
			}

			Iterator var5 = var2.npcs.iterator();

			while (var5.hasNext()) {
				NPC var6 = (NPC)var5.next();
				if (var6 != null && var6.overheadTextCyclesRemaining > 0) {
					--var6.overheadTextCyclesRemaining;
					if (var6.overheadTextCyclesRemaining == 0) {
						var6.overheadText = null;
					}
				}
			}
		}

	}

	@ObfuscatedName("nv")
	@ObfuscatedSignature(
		descriptor = "(IIIILwc;Lne;B)V",
		garbageValue = "63"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) {
			int var6 = Client.camAngleY & 2047;
			int var7 = var3 * var3 + var2 * var2;
			if (var7 <= 6400) {
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6];
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6];
				int var10 = var9 * var2 + var3 * var8 >> 16;
				int var11 = var3 * var9 - var8 * var2 >> 16;
				if (var7 > 2500) {
					var4.method10777(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths);
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2);
				}

			}
		}
	}
}
