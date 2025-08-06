import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vy")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	static final LoginType field5668;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	static final LoginType field5669;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	static final LoginType field5670;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	static final LoginType field5671;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	static final LoginType field5672;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	static final LoginType field5676;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	static final LoginType field5674;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	public static final LoginType field5675;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 450161447
	)
	final int field5673;
	@ObfuscatedName("ag")
	final String field5667;

	static {
		oldscape = new LoginType(5, 0, "", "");
		field5668 = new LoginType(6, 1, "", "");
		field5669 = new LoginType(2, 2, "", "");
		field5670 = new LoginType(4, 3, "", "");
		field5671 = new LoginType(0, 4, "", "");
		field5672 = new LoginType(1, 5, "", "");
		field5676 = new LoginType(7, 6, "", "");
		field5674 = new LoginType(3, 7, "", "");
		field5675 = new LoginType(8, -1, "", "", true, new LoginType[]{oldscape, field5668, field5669, field5671, field5670});
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field5673 = var1;
		this.field5667 = var4;
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lvy;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field5673 = var1;
		this.field5667 = var4;
	}

	public String toString() {
		return this.field5667;
	}
}
