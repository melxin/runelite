import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aq")
@Implements("AsyncHttpResponse")
public class AsyncHttpResponse {
	@ObfuscatedName("al")
	@Export("responseFuture")
	Future responseFuture;
	@ObfuscatedName("ab")
	@Export("errorMessage")
	String errorMessage;

	AsyncHttpResponse(Future var1) {
		this.responseFuture = var1;
	}

	AsyncHttpResponse(String var1) {
		this.method276(var1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-109"
	)
	@Export("getErrorMessage")
	public final String getErrorMessage() {
		return this.errorMessage;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-58"
	)
	void method276(String var1) {
		if (var1 == null) {
			var1 = "";
		}

		this.errorMessage = var1;
		if (this.responseFuture != null) {
			this.responseFuture.cancel(true);
			this.responseFuture = null;
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1705950708"
	)
	@Export("hasError")
	public boolean hasError() {
		return this.errorMessage != null || this.responseFuture == null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "1460"
	)
	@Export("hasFinished")
	public final boolean hasFinished() {
		return this.hasError() ? true : this.responseFuture.isDone();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Laz;",
		garbageValue = "-1661549847"
	)
	@Export("await")
	public final HttpResponse await() {
		if (this.hasError()) {
			return new HttpResponse(this.errorMessage);
		} else if (!this.hasFinished()) {
			return null;
		} else {
			try {
				return (HttpResponse)this.responseFuture.get();
			} catch (Exception var3) {
				String var2 = "Error retrieving REST request reply";
				System.err.println(var2 + "\r\n" + var3);
				this.method276(var2);
				return new HttpResponse(var2);
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)Liz;",
		garbageValue = "-2"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class172.SequenceDefinition_archive.takeFile(12, var0);
			var1 = new SequenceDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfw;",
		garbageValue = "-77"
	)
	static class139 method284(int var0) {
		class139[] var1 = new class139[]{class139.field1670, class139.field1689, class139.field1671, class139.field1672, class139.field1673, class139.field1685, class139.field1675, class139.field1676, class139.field1677, class139.field1669, class139.field1679, class139.field1680, class139.field1681, class139.field1682, class139.field1683, class139.field1684, class139.field1690};
		class139 var2 = (class139)HealthBarConfig.findEnumerated(var1, var0);
		if (var2 == null) {
			var2 = class139.field1670;
		}

		return var2;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ldj;Lwj;IIIIIII)V",
		garbageValue = "447761742"
	)
	@Export("loadTerrain")
	static final void loadTerrain(WorldView var0, Buffer var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int[][][] var8 = var0.tileHeights;
		byte[][][] var9 = var0.tileSettings;
		if (var2 >= 0 && var2 < 4 && var3 >= 0 && var3 < var8[0].length - 1 && var4 >= 0 && var4 < var8[0][0].length - 1) {
			var9[var2][var3][var4] = 0;

			while (true) {
				int var10 = var1.readUnsignedShort();
				if (var10 == 0) {
					if (var2 == 0) {
						var8[0][var3][var4] = -VarpDefinition.method4155(var5 + 932731, var6 + 556238) * 8;
					} else {
						var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - 240;
					}
					break;
				}

				if (var10 == 1) {
					int var11 = var1.readUnsignedByte();
					if (var11 == 1) {
						var11 = 0;
					}

					if (var2 == 0) {
						var8[0][var3][var4] = -var11 * 8;
					} else {
						var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - var11 * 8;
					}
					break;
				}

				if (var10 <= 49) {
					Tiles.Tiles_overlays[var2][var3][var4] = (short)var1.readShort();
					class28.Tiles_shapes[var2][var3][var4] = (byte)((var10 - 2) / 4);
					ChatChannel.field806[var2][var3][var4] = (byte)(var10 - 2 + var7 & 3);
				} else if (var10 <= 81) {
					var9[var2][var3][var4] = (byte)(var10 - 49);
				} else {
					AABB.Tiles_underlays[var2][var3][var4] = (short)(var10 - 81);
				}
			}
		} else {
			Projectile.method1932(var1);
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1496063891"
	)
	static final int method283(int var0, int var1) {
		int var2 = class366.method7884(var0 - 1, var1 - 1) + class366.method7884(var0 + 1, var1 - 1) + class366.method7884(var0 - 1, var1 + 1) + class366.method7884(1 + var0, var1 + 1);
		int var3 = class366.method7884(var0 - 1, var1) + class366.method7884(1 + var0, var1) + class366.method7884(var0, var1 - 1) + class366.method7884(var0, var1 + 1);
		int var4 = class366.method7884(var0, var1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "56"
	)
	public static final void method297(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
			if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetHeights[var4] + Client.rootWidgetYs[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
				Client.validRootWidgets[var4] = true;
			}
		}

	}

	@ObfuscatedName("pd")
	@ObfuscatedSignature(
		descriptor = "(II)Lwr;",
		garbageValue = "-841948047"
	)
	@Export("getDbTable")
	static DbTable getDbTable(int var0) {
		DbTable var1 = (DbTable)Client.DBTableIndex_cache.get((long)var0);
		if (var1 == null) {
			var1 = new DbTable(ScriptEvent.field871, class101.method3102(var0), ApproximateRouteStrategy.method801(var0));
			Client.DBTableIndex_cache.put(var1, (long)var0);
		}

		return var1;
	}
}
