import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
@Implements("AsyncHttpResponse")
public class AsyncHttpResponse {
	@ObfuscatedName("af")
	@Export("responseFuture")
	Future responseFuture;
	@ObfuscatedName("aw")
	@Export("errorMessage")
	String errorMessage;

	AsyncHttpResponse(Future var1) {
		this.responseFuture = var1;
	}

	AsyncHttpResponse(String var1) {
		this.method290(var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "1"
	)
	@Export("getErrorMessage")
	public final String getErrorMessage() {
		return this.errorMessage;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-964935103"
	)
	void method290(String var1) {
		if (var1 == null) {
			var1 = "";
		}

		this.errorMessage = var1;
		if (this.responseFuture != null) {
			this.responseFuture.cancel(true);
			this.responseFuture = null;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "990287967"
	)
	@Export("hasError")
	public boolean hasError() {
		return this.errorMessage != null || this.responseFuture == null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1948474679"
	)
	@Export("hasFinished")
	public final boolean hasFinished() {
		return this.hasError() ? true : this.responseFuture.isDone();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lah;",
		garbageValue = "970665993"
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
				this.method290(var2);
				return new HttpResponse(var2);
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lff;FI)F",
		garbageValue = "-117745962"
	)
	static float method282(class138 var0, float var1) {
		if (var0 == null) {
			return 0.0F;
		} else {
			float var2;
			if (var1 == var0.field1663) {
				var2 = 0.0F;
			} else if (var0.field1661 == var1) {
				var2 = 1.0F;
			} else {
				var2 = (var1 - var0.field1663) / (var0.field1661 - var0.field1663);
			}

			float var3;
			if (var0.field1662) {
				var3 = var2;
			} else {
				float[] var4 = new float[]{var0.field1664 - var2, var0.field1657, var0.field1667, var0.field1668};
				float[] var5 = new float[5];
				int var6 = MusicPatchNode2.method7104(var4, 3, 0.0F, true, 1.0F, true, var5);
				if (var6 == 1) {
					var3 = var5[0];
				} else {
					var3 = 0.0F;
				}
			}

			return var3 * ((var0.field1671 + var0.field1672 * var3) * var3 + var0.field1670) + var0.field1669;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "39"
	)
	public static void method291() {
		NPCComposition.NpcDefinition_cached.clear();
		NPCComposition.NpcDefinition_cachedModels.clear();
	}
}
