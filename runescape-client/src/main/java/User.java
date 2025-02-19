import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sz")
@Implements("User")
public class User implements Comparable {
	@ObfuscatedName("uj")
	@ObfuscatedGetter(
		intValue = 763916117
	)
	static int field5125;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lwm;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lwm;"
	)
	@Export("previousUsername")
	Username previousUsername;

	User() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lsz;I)I",
		garbageValue = "-1986498122"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.username.compareToTyped(var1.username);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lwm;",
		garbageValue = "2072236329"
	)
	@Export("getUsername")
	public Username getUsername() {
		return this.username;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2088624849"
	)
	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName();
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-211071896"
	)
	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName();
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Lwm;Lwm;I)V",
		garbageValue = "-1576055489"
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

	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lnz;I)Ljava/lang/String;",
		garbageValue = "-183013090"
	)
	static String method9174(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) {
			for (int var2 = 1; var2 <= 5; ++var2) {
				while (true) {
					int var3 = var0.indexOf("%" + var2);
					if (var3 == -1) {
						break;
					}

					var0 = var0.substring(0, var3) + class219.method4459(class263.method5541(var1, var2 - 1)) + var0.substring(var3 + 2);
				}
			}
		}

		return var0;
	}
}
