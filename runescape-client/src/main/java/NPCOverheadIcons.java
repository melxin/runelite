import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xe")
@Implements("NPCOverheadIcons")
public class NPCOverheadIcons {
	@ObfuscatedName("av")
	@Export("overheadArchiveIds")
	int[] overheadArchiveIds;
	@ObfuscatedName("at")
	@Export("overheadSpriteIds")
	short[] overheadSpriteIds;

	@ObfuscatedSignature(
		descriptor = "(Lhu;)V"
	)
	public NPCOverheadIcons(NPCComposition var1) {
		this.overheadArchiveIds = new int[8];
		this.overheadSpriteIds = new short[8];
		int var2 = 0;
		if (var1.method4476()) {
			var2 = var1.method4477().length;
			System.arraycopy(var1.method4477(), 0, this.overheadArchiveIds, 0, var2);
			System.arraycopy(var1.method4487(), 0, this.overheadSpriteIds, 0, var2);
		}

		for (int var3 = var2; var3 < 8; ++var3) {
			this.overheadArchiveIds[var3] = -1;
			this.overheadSpriteIds[var3] = -1;
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-2118783808"
	)
	public int[] method11905() {
		return this.overheadArchiveIds;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(S)[S",
		garbageValue = "32657"
	)
	public short[] method11912() {
		return this.overheadSpriteIds;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IISB)V",
		garbageValue = "67"
	)
	public void method11911(int var1, int var2, short var3) {
		this.overheadArchiveIds[var1] = var2;
		this.overheadSpriteIds[var1] = var3;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "-1410112335"
	)
	public void method11907(int[] var1, short[] var2) {
		this.overheadArchiveIds = var1;
		this.overheadSpriteIds = var2;
	}
}
