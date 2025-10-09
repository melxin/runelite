import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tk")
@Implements("User")
public class User implements Comparable {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lxp;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lxp;"
	)
	@Export("previousUsername")
	Username previousUsername;

	User() {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltk;I)I",
		garbageValue = "1282880775"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.username.compareToTyped(var1.username);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)Lxp;",
		garbageValue = "-746302574"
	)
	@Export("getUsername")
	public Username getUsername() {
		return this.username;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-40"
	)
	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName();
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-7"
	)
	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName();
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lxp;Lxp;I)V",
		garbageValue = "-323269906"
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1780468256"
	)
	public static boolean method10041() {
		ReflectionCheck var0 = (ReflectionCheck)class35.reflectionChecks.last();
		return var0 != null;
	}
}
