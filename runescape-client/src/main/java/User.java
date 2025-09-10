import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tl")
@Implements("User")
public class User implements Comparable {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lxa;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lxa;"
	)
	@Export("previousUsername")
	Username previousUsername;

	User() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)I",
		garbageValue = "1554225034"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.username.compareToTyped(var1.username);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lxa;",
		garbageValue = "1671722663"
	)
	@Export("getUsername")
	public Username getUsername() {
		return this.username;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-17389022"
	)
	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName();
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "58510979"
	)
	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName();
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lxa;Lxa;I)V",
		garbageValue = "934667381"
	)
	@Export("set")
	void set(Username var1, Username var2) {
		if (var1 == null) {
			throw new NullPointerException();
		} else {
			this.username = var1;
			this.previousUsername = var2;
		}
	}

	public int compareTo(Object var1) {
		return this.compareTo_user((User)var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "36"
	)
	static final int method9952(int var0, int var1, int var2, int var3) {
		return var2 * var1 - var3 * var0 >> 16;
	}
}
