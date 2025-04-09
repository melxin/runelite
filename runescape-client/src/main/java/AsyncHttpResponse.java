import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
@Implements("AsyncHttpResponse")
public class AsyncHttpResponse {
	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	static Archive field66;
	@ObfuscatedName("mh")
	@ObfuscatedGetter(
		intValue = -1467156381
	)
	@Export("cameraYaw")
	static int cameraYaw;
	@ObfuscatedName("ao")
	@Export("responseFuture")
	Future responseFuture;
	@ObfuscatedName("an")
	@Export("errorMessage")
	String errorMessage;

	AsyncHttpResponse(Future var1) {
		this.responseFuture = var1;
	}

	AsyncHttpResponse(String var1) {
		this.method263(var1);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1701752934"
	)
	@Export("getErrorMessage")
	public final String getErrorMessage() {
		return this.errorMessage;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "47078814"
	)
	void method263(String var1) {
		if (var1 == null) {
			var1 = "";
		}

		this.errorMessage = var1;
		if (this.responseFuture != null) {
			this.responseFuture.cancel(true);
			this.responseFuture = null;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-568454743"
	)
	@Export("hasError")
	public boolean hasError() {
		return this.errorMessage != null || this.responseFuture == null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1251515107"
	)
	@Export("hasFinished")
	public final boolean hasFinished() {
		return this.hasError() ? true : this.responseFuture.isDone();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lai;",
		garbageValue = "-1477257148"
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
				this.method263(var2);
				return new HttpResponse(var2);
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfu;",
		garbageValue = "1583854869"
	)
	static class136[] method267() {
		return new class136[]{class136.field1613, class136.field1609, class136.field1617, class136.field1610, class136.field1611, class136.field1612};
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(Lsq;Ldj;I)Z",
		garbageValue = "2036583831"
	)
	static boolean method280(WorldEntity var0, WorldView var1) {
		Bounds var2 = class254.method5318(var0.getY(), var0.getPlane(), var0.method9346(), var0.field5163);

		int var3;
		for (var3 = 0; var3 < Client.playerUpdateManager.playerCount; ++var3) {
			Player var4 = (Player)var1.players.get((long)Client.playerUpdateManager.playerIndices[var3]);
			if (var4 != null && var2.method8322(var4.x, var4.y)) {
				var2.method8303();
				return true;
			}
		}

		for (var3 = 0; var3 < var1.field1351.method9060(); ++var3) {
			NPC var7 = (NPC)var1.npcs.get((long)var1.field1351.method9056(var3));
			if (var7 != null && var2.method8322(var7.x, var7.y)) {
				for (int var6 = 0; var6 < var7.definition.actions.length; ++var6) {
					if (var7.definition.actions[var6] != null) {
						var2.method8303();
						return true;
					}
				}
			}
		}

		for (var3 = 0; var3 < var1.field1352.method9060(); ++var3) {
			WorldEntity var8 = (WorldEntity)var1.worldEntities.get((long)var1.field1352.method9056(var3));
			if (var8 != null && var8 != var0 && var8.worldView.scene.cycle == Client.cycle) {
				Bounds var5 = class254.method5318(var8.getY(), var8.getPlane(), var8.method9346(), var8.field5163);
				if (var2.method8307(var5)) {
					var2.method8303();
					var5.method8303();
					return true;
				}

				var5.method8303();
			}
		}

		var2.method8303();
		return false;
	}

	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "(Lve;II)V",
		garbageValue = "-2100470983"
	)
	static void method282(Buffer var0, int var1) {
		byte[] var2 = var0.array;
		if (Client.randomDatData == null) {
			Client.randomDatData = new byte[24];
		}

		class467.writeRandomDat(var2, var1, Client.randomDatData, 0, 24);
		if (JagexCache.JagexCache_randomDat != null) {
			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24);
			} catch (Exception var4) {
			}
		}

	}
}
