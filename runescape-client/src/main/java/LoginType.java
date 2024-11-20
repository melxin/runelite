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
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	static final LoginType field5355;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	static final LoginType field5348;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	static final LoginType field5347;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	static final LoginType field5350;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	static final LoginType field5351;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	static final LoginType field5352;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	static final LoginType field5353;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	public static final LoginType field5346;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1724170933
	)
	final int field5357;
	@ObfuscatedName("af")
	final String field5356;

	static {
		oldscape = new LoginType(4, 0, "", "");
		field5355 = new LoginType(8, 1, "", "");
		field5348 = new LoginType(5, 2, "", "");
		field5347 = new LoginType(1, 3, "", "");
		field5350 = new LoginType(6, 4, "", "");
		field5351 = new LoginType(0, 5, "", "");
		field5352 = new LoginType(3, 6, "", "");
		field5353 = new LoginType(7, 7, "", "");
		field5346 = new LoginType(2, -1, "", "", true, new LoginType[]{oldscape, field5355, field5348, field5350, field5347});
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field5357 = var1;
		this.field5356 = var4;
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Luk;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field5357 = var1;
		this.field5356 = var4;
	}

	public String toString() {
		return this.field5356;
	}
}
