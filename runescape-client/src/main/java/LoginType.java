import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uw")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Luw;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Luw;"
	)
	static final LoginType field5476;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Luw;"
	)
	static final LoginType field5477;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Luw;"
	)
	static final LoginType field5475;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Luw;"
	)
	static final LoginType field5479;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Luw;"
	)
	static final LoginType field5481;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Luw;"
	)
	static final LoginType field5480;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Luw;"
	)
	static final LoginType field5482;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Luw;"
	)
	public static final LoginType field5483;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1911588577
	)
	final int field5484;
	@ObfuscatedName("ax")
	final String field5485;

	static {
		oldscape = new LoginType(7, 0, "", "");
		field5476 = new LoginType(1, 1, "", "");
		field5477 = new LoginType(3, 2, "", "");
		field5475 = new LoginType(4, 3, "", "");
		field5479 = new LoginType(2, 4, "", "");
		field5481 = new LoginType(6, 5, "", "");
		field5480 = new LoginType(8, 6, "", "");
		field5482 = new LoginType(0, 7, "", "");
		field5483 = new LoginType(5, -1, "", "", true, new LoginType[]{oldscape, field5476, field5477, field5479, field5475});
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field5484 = var1;
		this.field5485 = var4;
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Luw;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field5484 = var1;
		this.field5485 = var4;
	}

	public String toString() {
		return this.field5485;
	}
}
