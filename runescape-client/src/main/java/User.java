import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tb")
@Implements("User")
public class User implements Comparable {
	@ObfuscatedName("jx")
	static String field5291;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lxf;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lxf;"
	)
	@Export("previousUsername")
	Username previousUsername;

	User() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ltb;B)I",
		garbageValue = "73"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.username.compareToTyped(var1.username);
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(B)Lxf;",
		garbageValue = "-7"
	)
	@Export("getUsername")
	public Username getUsername() {
		return this.username;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-104"
	)
	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName();
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "945"
	)
	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName();
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lxf;Lxf;B)V",
		garbageValue = "3"
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
}
