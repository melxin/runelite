import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wt")
@Implements("NPCOverheadIcons")
public class NPCOverheadIcons {
	@ObfuscatedName("af")
	@Export("overheadArchiveIds")
	int[] overheadArchiveIds;
	@ObfuscatedName("aw")
	@Export("overheadSpriteIds")
	short[] overheadSpriteIds;

	@ObfuscatedSignature(
		descriptor = "(Lhh;)V"
	)
	public NPCOverheadIcons(NPCComposition var1) {
		this.overheadArchiveIds = new int[8];
		this.overheadSpriteIds = new short[8];
		int var2 = 0;
		if (var1.method4334()) {
			var2 = var1.method4335().length;
			System.arraycopy(var1.method4335(), 0, this.overheadArchiveIds, 0, var2);
			System.arraycopy(var1.method4333(), 0, this.overheadSpriteIds, 0, var2);
		}

		for (int var3 = var2; var3 < 8; ++var3) {
			this.overheadArchiveIds[var3] = -1;
			this.overheadSpriteIds[var3] = -1;
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-815719240"
	)
	public int[] method11461() {
		return this.overheadArchiveIds;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "-620495878"
	)
	public short[] method11462() {
		return this.overheadSpriteIds;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "-736551268"
	)
	public void method11463(int var1, int var2, short var3) {
		this.overheadArchiveIds[var1] = var2;
		this.overheadSpriteIds[var1] = var3;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([I[SB)V",
		garbageValue = "122"
	)
	public void method11460(int[] var1, short[] var2) {
		this.overheadArchiveIds = var1;
		this.overheadSpriteIds = var2;
	}
}
