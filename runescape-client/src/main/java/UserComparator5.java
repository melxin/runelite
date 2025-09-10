import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
@Implements("UserComparator5")
public class UserComparator5 extends AbstractUserComparator {
	@ObfuscatedName("af")
	@Export("reversed")
	final boolean reversed;

	public UserComparator5(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lty;Lty;I)I",
		garbageValue = "48925521"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0) {
			if (var2.world == 0) {
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world != 0) {
			return this.reversed ? 1 : -1;
		}

		return this.compareUser(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lpx;IB)V",
		garbageValue = "-85"
	)
	static void method3559(AbstractArchive var0, int var1) {
		if ((var1 & class582.field5881.rsOrdinal()) != 0) {
			class139.logoSprite = ArchiveLoader.SpriteBuffer_getIndexedSpriteByName(var0, "logo_deadman_mode", "");
		} else if ((var1 & class582.field5878.rsOrdinal()) != 0) {
			class139.logoSprite = ArchiveLoader.SpriteBuffer_getIndexedSpriteByName(var0, "logo_seasonal_mode", "");
		} else if ((var1 & class582.field5856.rsOrdinal()) != 0) {
			class139.logoSprite = ArchiveLoader.SpriteBuffer_getIndexedSpriteByName(var0, "logo_speedrunning", "");
		} else if ((var1 & class582.field5852.rsOrdinal()) != 0) {
			class139.logoSprite = ArchiveLoader.SpriteBuffer_getIndexedSpriteByName(var0, "logo_ugc_world", "");
		} else {
			class139.logoSprite = ArchiveLoader.SpriteBuffer_getIndexedSpriteByName(var0, "logo", "");
		}

	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1473110444"
	)
	static final void method3557() {
		if (class70.pcmPlayer1 != null) {
			class70.pcmPlayer1.run();
		}

	}
}
