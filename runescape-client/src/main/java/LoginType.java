import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vt")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lvt;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lvt;"
	)
	static final LoginType field5832;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lvt;"
	)
	static final LoginType field5833;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lvt;"
	)
	static final LoginType field5834;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lvt;"
	)
	static final LoginType field5831;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lvt;"
	)
	static final LoginType field5836;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lvt;"
	)
	static final LoginType field5835;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lvt;"
	)
	static final LoginType field5838;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lvt;"
	)
	public static final LoginType field5837;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -76890969
	)
	static int field5842;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -951199051
	)
	final int field5840;
	@ObfuscatedName("ap")
	final String field5841;

	static {
		oldscape = new LoginType(6, 0, "", "");
		field5832 = new LoginType(3, 1, "", "");
		field5833 = new LoginType(5, 2, "", "");
		field5834 = new LoginType(0, 3, "", "");
		field5831 = new LoginType(7, 4, "", "");
		field5836 = new LoginType(4, 5, "", "");
		field5835 = new LoginType(8, 6, "", "");
		field5838 = new LoginType(1, 7, "", "");
		field5837 = new LoginType(2, -1, "", "", true, new LoginType[]{oldscape, field5832, field5833, field5831, field5834});
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field5840 = var1;
		this.field5841 = var4;
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lvt;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field5840 = var1;
		this.field5841 = var4;
	}

	public String toString() {
		return this.field5841;
	}
}
