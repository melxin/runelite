import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("va")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	static final LoginType field5774;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	static final LoginType field5768;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	static final LoginType field5777;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	static final LoginType field5770;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	static final LoginType field5771;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	static final LoginType field5772;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	static final LoginType field5766;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	public static final LoginType field5769;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -640433825
	)
	final int field5775;
	@ObfuscatedName("ai")
	final String field5776;

	static {
		oldscape = new LoginType(7, 0, "", "");
		field5774 = new LoginType(0, 1, "", "");
		field5768 = new LoginType(6, 2, "", "");
		field5777 = new LoginType(4, 3, "", "");
		field5770 = new LoginType(8, 4, "", "");
		field5771 = new LoginType(1, 5, "", "");
		field5772 = new LoginType(3, 6, "", "");
		field5766 = new LoginType(5, 7, "", "");
		field5769 = new LoginType(2, -1, "", "", true, new LoginType[]{oldscape, field5774, field5768, field5770, field5777});
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field5775 = var1;
		this.field5776 = var4;
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lva;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field5775 = var1;
		this.field5776 = var4;
	}

	public String toString() {
		return this.field5776;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "100"
	)
	public static int method10882(int var0) {
		return (var0 & class580.field5846) - 1;
	}
}
