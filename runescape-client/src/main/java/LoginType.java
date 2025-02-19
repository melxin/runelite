import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uk")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	static final LoginType field5451;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	static final LoginType field5458;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	static final LoginType field5453;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	static final LoginType field5454;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	static final LoginType field5455;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	static final LoginType field5456;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	static final LoginType field5457;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	public static final LoginType field5460;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 2015580187
	)
	final int field5450;
	@ObfuscatedName("ae")
	final String field5452;

	static {
		oldscape = new LoginType(3, 0, "", "");
		field5451 = new LoginType(4, 1, "", "");
		field5458 = new LoginType(8, 2, "", "");
		field5453 = new LoginType(6, 3, "", "");
		field5454 = new LoginType(0, 4, "", "");
		field5455 = new LoginType(1, 5, "", "");
		field5456 = new LoginType(5, 6, "", "");
		field5457 = new LoginType(2, 7, "", "");
		field5460 = new LoginType(7, -1, "", "", true, new LoginType[]{oldscape, field5451, field5458, field5454, field5453});
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field5450 = var1;
		this.field5452 = var4;
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Luk;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field5450 = var1;
		this.field5452 = var4;
	}

	public String toString() {
		return this.field5452;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lpl;Ljava/lang/String;Ljava/lang/String;I)[Lwg;",
		garbageValue = "90891846"
	)
	public static SpritePixels[] method9950(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			return class556.method10080(var0, var3, var4);
		}
	}
}
