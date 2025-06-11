import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("si")
@Implements("User")
public class User implements Comparable {
	@ObfuscatedName("ad")
	@Export("Tiles_shapes")
	static byte[][][] Tiles_shapes;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lxm;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lxm;"
	)
	@Export("previousUsername")
	Username previousUsername;

	User() {
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsi;B)I",
		garbageValue = "-27"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.username.compareToTyped(var1.username);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Lxm;",
		garbageValue = "-615704016"
	)
	@Export("getUsername")
	public Username getUsername() {
		return this.username;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1945780872"
	)
	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName();
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "0"
	)
	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName();
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lxm;Lxm;B)V",
		garbageValue = "62"
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIFFFI)F",
		garbageValue = "1914902033"
	)
	public static float method9601(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
		float var11 = (float)((var6 - var7) * (var2 - var4) + (var5 - var7) * (var4 - var3));
		float var12 = (float)((var6 - var7) * (var0 - var4) + (var1 - var7) * (var4 - var3)) / var11;
		float var13 = (float)((var7 - var5) * (var0 - var4) + (var1 - var7) * (var2 - var4)) / var11;
		float var14 = 1.0F - var12 - var13;
		return var10 * var14 + var12 * var8 + var9 * var13;
	}
}
