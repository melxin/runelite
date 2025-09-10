import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
	@ObfuscatedName("af")
	@Export("reversed")
	final boolean reversed;

	public UserComparator8(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lty;Lty;B)I",
		garbageValue = "38"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world) {
			if (var2.world != Client.worldId) {
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world == Client.worldId) {
			return this.reversed ? 1 : -1;
		}

		return this.compareUser(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "45931988"
	)
	public static int method3543(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0];
		int var4 = (int)(var2 >>> 52 & 4095L);
		if ((long)var4 == 4095L) {
			var4 = -1;
		}

		return var4;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIIZIII)J",
		garbageValue = "369312725"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, int var3, boolean var4, int var5, int var6) {
		long var7 = (long)((var1 & 127) << 0 | (var2 & 127) << 7 | (var0 & 3) << 14 | (var3 & 7) << 16) | ((long)var5 & 4294967295L) << 20 | ((long)var6 & 4095L) << 52;
		if (var4) {
			var7 |= 524288L;
		}

		return var7;
	}
}
