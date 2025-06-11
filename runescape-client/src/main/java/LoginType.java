import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vf")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	static final LoginType field5555;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	static final LoginType field5556;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	static final LoginType field5551;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	static final LoginType field5552;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	static final LoginType field5553;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	static final LoginType field5554;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	static final LoginType field5558;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	public static final LoginType field5548;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1825474443
	)
	final int field5557;
	@ObfuscatedName("au")
	final String field5549;

	static {
		oldscape = new LoginType(0, 0, "", "");
		field5555 = new LoginType(7, 1, "", "");
		field5556 = new LoginType(2, 2, "", "");
		field5551 = new LoginType(4, 3, "", "");
		field5552 = new LoginType(3, 4, "", "");
		field5553 = new LoginType(8, 5, "", "");
		field5554 = new LoginType(6, 6, "", "");
		field5558 = new LoginType(5, 7, "", "");
		field5548 = new LoginType(1, -1, "", "", true, new LoginType[]{oldscape, field5555, field5556, field5552, field5551});
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field5557 = var1;
		this.field5549 = var4;
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lvf;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field5557 = var1;
		this.field5549 = var4;
	}

	public String toString() {
		return this.field5549;
	}
}
