import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rq")
public class class463 {
	@ObfuscatedName("av")
	float field5268;
	@ObfuscatedName("at")
	float field5264;
	@ObfuscatedName("ag")
	float field5265;
	@ObfuscatedName("an")
	float field5266;
	@ObfuscatedName("ae")
	float field5271;
	@ObfuscatedName("aj")
	float field5273;
	@ObfuscatedName("ak")
	float field5269;
	@ObfuscatedName("aw")
	float field5270;
	@ObfuscatedName("ap")
	float field5272;
	@ObfuscatedName("ay")
	float field5267;
	@ObfuscatedName("au")
	float field5263;
	@ObfuscatedName("az")
	float field5274;

	static {
		new class463();
	}

	public class463() {
		this.method9504();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "120877745"
	)
	void method9504() {
		this.field5274 = 0.0F;
		this.field5263 = 0.0F;
		this.field5267 = 0.0F;
		this.field5270 = 0.0F;
		this.field5269 = 0.0F;
		this.field5273 = 0.0F;
		this.field5266 = 0.0F;
		this.field5265 = 0.0F;
		this.field5264 = 0.0F;
		this.field5272 = 1.0F;
		this.field5271 = 1.0F;
		this.field5268 = 1.0F;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-1314816461"
	)
	public void method9500(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field5264;
		float var5 = this.field5271;
		float var6 = this.field5270;
		float var7 = this.field5263;
		this.field5264 = var2 * var4 - this.field5265 * var3;
		this.field5265 = var2 * this.field5265 + var3 * var4;
		this.field5271 = var2 * var5 - var3 * this.field5273;
		this.field5273 = var3 * var5 + var2 * this.field5273;
		this.field5270 = var2 * var6 - var3 * this.field5272;
		this.field5272 = var3 * var6 + var2 * this.field5272;
		this.field5263 = var2 * var7 - this.field5274 * var3;
		this.field5274 = var2 * this.field5274 + var3 * var7;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-1739121717"
	)
	public void method9499(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field5268;
		float var5 = this.field5266;
		float var6 = this.field5269;
		float var7 = this.field5267;
		this.field5268 = var2 * var4 + var3 * this.field5265;
		this.field5265 = this.field5265 * var2 - var4 * var3;
		this.field5266 = this.field5273 * var3 + var2 * var5;
		this.field5273 = this.field5273 * var2 - var5 * var3;
		this.field5269 = var3 * this.field5272 + var2 * var6;
		this.field5272 = this.field5272 * var2 - var3 * var6;
		this.field5267 = this.field5274 * var3 + var2 * var7;
		this.field5274 = this.field5274 * var2 - var3 * var7;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "517638479"
	)
	void method9512(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field5268;
		float var5 = this.field5266;
		float var6 = this.field5269;
		float var7 = this.field5267;
		this.field5268 = var4 * var2 - this.field5264 * var3;
		this.field5264 = var4 * var3 + this.field5264 * var2;
		this.field5266 = var5 * var2 - var3 * this.field5271;
		this.field5271 = var3 * var5 + this.field5271 * var2;
		this.field5269 = var6 * var2 - var3 * this.field5270;
		this.field5270 = var6 * var3 + var2 * this.field5270;
		this.field5267 = var2 * var7 - this.field5263 * var3;
		this.field5263 = var7 * var3 + var2 * this.field5263;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "1932432107"
	)
	public void method9503(float var1, float var2, float var3) {
		this.field5267 += var1;
		this.field5263 += var2;
		this.field5274 += var3;
	}

	public String toString() {
		return this.field5268 + "," + this.field5266 + "," + this.field5269 + "," + this.field5267 + "\n" + this.field5264 + "," + this.field5271 + "," + this.field5270 + "," + this.field5263 + "\n" + this.field5265 + "," + this.field5273 + "," + this.field5272 + "," + this.field5274;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhi;",
		garbageValue = "0"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0);
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "9333"
	)
	static void method9501() {
		class234.accessToken = System.getenv("JX_ACCESS_TOKEN");
		Client.refreshToken = System.getenv("JX_REFRESH_TOKEN");
		PlayerUpdateManager.sessionId = System.getenv("JX_SESSION_ID");
		Message.characterId = System.getenv("JX_CHARACTER_ID");
		String var0 = System.getenv("JX_DISPLAY_NAME");
		String var1;
		if (var0 != null && !var0.isEmpty() && var0.charAt(0) != '#') {
			var1 = var0;
		} else {
			var1 = "";
		}

		Login.displayName = var1;
	}
}
