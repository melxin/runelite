import java.awt.Image;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
@Implements("UserComparator3")
public class UserComparator3 extends AbstractUserComparator {
	@ObfuscatedName("aw")
	static Image field1563;
	@ObfuscatedName("al")
	@Export("reversed")
	final boolean reversed;

	public UserComparator3(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lto;Lto;I)I",
		garbageValue = "-2136867333"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.world != var1.world) {
			return this.reversed ? var1.world - var2.world : var2.world - var1.world;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lha;",
		garbageValue = "1875423470"
	)
	public static HealthBarDefinition method3522(int var0) {
		HealthBarDefinition var1 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class505.HealthBarDefinition_archive.takeFile(33, var0);
			var1 = new HealthBarDefinition();
			var1.field2015 = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "67"
	)
	public static void method3523() {
		ViewportMouse.ViewportMouse_false0 = false;
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-127"
	)
	static void method3516() {
		WorldView.accessToken = System.getenv("JX_ACCESS_TOKEN");
		class389.refreshToken = System.getenv("JX_REFRESH_TOKEN");
		class523.sessionId = System.getenv("JX_SESSION_ID");
		class114.characterId = System.getenv("JX_CHARACTER_ID");
		String var0 = System.getenv("JX_DISPLAY_NAME");
		String var1;
		if (var0 != null && !var0.isEmpty() && var0.charAt(0) != '#') {
			var1 = var0;
		} else {
			var1 = "";
		}

		Login.displayName = var1;
	}
}
