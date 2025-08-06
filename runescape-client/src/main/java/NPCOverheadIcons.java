import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wb")
@Implements("NPCOverheadIcons")
public class NPCOverheadIcons {
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1762798777
	)
	static int field5822;
	@ObfuscatedName("al")
	@Export("overheadArchiveIds")
	int[] overheadArchiveIds;
	@ObfuscatedName("ab")
	@Export("overheadSpriteIds")
	short[] overheadSpriteIds;

	@ObfuscatedSignature(
		descriptor = "(Lhg;)V"
	)
	public NPCOverheadIcons(NPCComposition var1) {
		this.overheadArchiveIds = new int[8];
		this.overheadSpriteIds = new short[8];
		int var2 = 0;
		if (var1.method4342()) {
			var2 = var1.method4320().length;
			System.arraycopy(var1.method4320(), 0, this.overheadArchiveIds, 0, var2);
			System.arraycopy(var1.method4310(), 0, this.overheadSpriteIds, 0, var2);
		}

		for (int var3 = var2; var3 < 8; ++var3) {
			this.overheadArchiveIds[var3] = -1;
			this.overheadSpriteIds[var3] = -1;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "3"
	)
	public int[] method11477() {
		return this.overheadArchiveIds;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "-150456953"
	)
	public short[] method11476() {
		return this.overheadSpriteIds;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "-1577920146"
	)
	public void method11479(int var1, int var2, short var3) {
		this.overheadArchiveIds[var1] = var2;
		this.overheadSpriteIds[var1] = var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "-1809560258"
	)
	public void method11485(int[] var1, short[] var2) {
		this.overheadArchiveIds = var1;
		this.overheadSpriteIds = var2;
	}
}
