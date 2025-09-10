import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -452342813
	)
	@Export("cacheGamebuild")
	static int cacheGamebuild;
	@ObfuscatedName("af")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lty;Lty;I)I",
		garbageValue = "771071997"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) {
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpx;Lpx;I)V",
		garbageValue = "-160103304"
	)
	public static void method3573(AbstractArchive var0, AbstractArchive var1) {
		HealthBarDefinition.HealthBarDefinition_archive = var0;
		HealthBarDefinition.field2039 = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1709069497"
	)
	public static int method3568(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 325.94932345220167D) - 512 & 2047;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IZIB)V",
		garbageValue = "114"
	)
	public static final void method3575(int var0, boolean var1, int var2) {
		if (var0 >= 8000 && var0 <= 48000) {
			PcmPlayer.field1356 = var0;
			PcmPlayer.PcmPlayer_stereo = var1;
			ScriptEvent.field904 = var2;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
