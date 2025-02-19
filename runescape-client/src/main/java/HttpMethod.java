import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("as")
@Implements("HttpMethod")
public class HttpMethod implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	@Export("POST")
	public static final HttpMethod POST;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	@Export("GET")
	public static final HttpMethod GET;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	@Export("PUT")
	static final HttpMethod PUT;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	@Export("PATCH")
	static final HttpMethod PATCH;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	@Export("DELETE")
	static final HttpMethod DELETE;
	@ObfuscatedName("sm")
	@ObfuscatedSignature(
		descriptor = "Lgd;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;
	@ObfuscatedName("ul")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("decimator")
	static Decimator decimator;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 616054977
	)
	int field39;
	@ObfuscatedName("ao")
	@Export("name")
	String name;
	@ObfuscatedName("af")
	boolean field43;
	@ObfuscatedName("aa")
	boolean field42;

	static {
		POST = new HttpMethod(0, "POST", true, true);
		GET = new HttpMethod(1, "GET", true, false);
		PUT = new HttpMethod(2, "PUT", false, true);
		PATCH = new HttpMethod(3, "PATCH", false, true);
		DELETE = new HttpMethod(4, "DELETE", false, true);
	}

	HttpMethod(int var1, String var2, boolean var3, boolean var4) {
		this.field39 = var1;
		this.name = var2;
		this.field43 = var3;
		this.field42 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field39;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1778852731"
	)
	boolean method72() {
		return this.field43;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-1"
	)
	@Export("getName")
	public String getName() {
		return this.name;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "123"
	)
	boolean method70() {
		return this.field42;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(DDIS)[D",
		garbageValue = "-559"
	)
	public static double[] method74(double var0, double var2, int var4) {
		int var5 = var4 * 2 + 1;
		double[] var6 = new double[var5];
		int var7 = -var4;

		for (int var8 = 0; var7 <= var4; ++var8) {
			var6[var8] = class387.method7531((double)var7, var0, var2);
			++var7;
		}

		return var6;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)I",
		garbageValue = "-1245925185"
	)
	public static int method73(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) {
			int var6 = var3;
			var3 = var4;
			var4 = var6;
		}

		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;I)[F",
		garbageValue = "674499231"
	)
	static float[] method62(JSONObject var0, String var1) throws JSONException {
		float[] var2 = new float[4];

		try {
			JSONArray var3 = var0.getJSONArray(var1);
			var2[0] = (float)var3.optDouble(0, 0.0D);
			var2[1] = (float)var3.optDouble(1, 0.0D);
			var2[2] = (float)var3.optDouble(2, 1.0D);
			var2[3] = (float)var3.optDouble(3, 1.0D);
		} catch (JSONException var4) {
			var2[0] = 0.0F;
			var2[1] = 0.0F;
			var2[2] = 1.0F;
			var2[3] = 1.0F;
		}

		return var2;
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "10881"
	)
	static final void method67() {
		InvDefinition.method3751(class329.field3661, class190.field2016, FriendsChat.field5114);
		class332.method6532(Language.field4826, class346.field3797);
		if (class181.cameraX == class329.field3661 && class190.field2016 == GrandExchangeOfferUnitPriceComparator.cameraY && ApproximateRouteStrategy.cameraZ == FriendsChat.field5114 && class59.cameraPitch == Language.field4826 && class346.field3797 == FloorDecoration.cameraYaw) {
			Client.field781 = false;
			Client.isCameraLocked = false;
			Client.field552 = false;
			Client.field776 = false;
			Decimator.field399 = 0;
			GameObject.field3039 = 0;
			FloorOverlayDefinition.field2345 = 0;
			User.field5125 = 0;
			MusicPatch.field3764 = 0;
			FloatProjection.field2789 = 0;
			ItemContainer.field1069 = 0;
			ItemLayer.field2525 = 0;
			GraphicsDefaults.field5219 = 0;
			WorldMapSection1.field3329 = 0;
			Client.field779 = null;
			Client.field791 = null;
			Client.field596 = null;
		}

	}
}
