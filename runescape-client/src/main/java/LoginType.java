import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uo")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Luo;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Luo;"
	)
	static final LoginType field5349;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Luo;"
	)
	static final LoginType field5350;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Luo;"
	)
	static final LoginType field5348;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Luo;"
	)
	static final LoginType field5351;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Luo;"
	)
	static final LoginType field5353;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Luo;"
	)
	static final LoginType field5354;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Luo;"
	)
	static final LoginType field5355;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Luo;"
	)
	public static final LoginType field5358;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1619872421
	)
	final int field5357;
	@ObfuscatedName("au")
	final String field5356;

	static {
		oldscape = new LoginType(6, 0, "", "");
		field5349 = new LoginType(3, 1, "", "");
		field5350 = new LoginType(0, 2, "", "");
		field5348 = new LoginType(2, 3, "", "");
		field5351 = new LoginType(5, 4, "", "");
		field5353 = new LoginType(7, 5, "", "");
		field5354 = new LoginType(1, 6, "", "");
		field5355 = new LoginType(8, 7, "", "");
		field5358 = new LoginType(4, -1, "", "", true, new LoginType[]{oldscape, field5349, field5350, field5351, field5348});
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field5357 = var1;
		this.field5356 = var4;
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Luo;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field5357 = var1;
		this.field5356 = var4;
	}

	public String toString() {
		return this.field5356;
	}
}
