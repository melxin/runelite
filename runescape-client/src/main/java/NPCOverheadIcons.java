import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wj")
@Implements("NPCOverheadIcons")
public class NPCOverheadIcons {
	@ObfuscatedName("ap")
	@Export("overheadArchiveIds")
	int[] overheadArchiveIds;
	@ObfuscatedName("aj")
	@Export("overheadSpriteIds")
	short[] overheadSpriteIds;

	@ObfuscatedSignature(
		descriptor = "(Lhd;)V"
	)
	public NPCOverheadIcons(NPCComposition var1) {
		this.overheadArchiveIds = new int[8];
		this.overheadSpriteIds = new short[8];
		int var2 = 0;
		if (var1.method4190()) {
			var2 = var1.method4161().length;
			System.arraycopy(var1.method4161(), 0, this.overheadArchiveIds, 0, var2);
			System.arraycopy(var1.method4204(), 0, this.overheadSpriteIds, 0, var2);
		}

		for (int var3 = var2; var3 < 8; ++var3) {
			this.overheadArchiveIds[var3] = -1;
			this.overheadSpriteIds[var3] = -1;
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "47"
	)
	public int[] method11114() {
		return this.overheadArchiveIds;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)[S",
		garbageValue = "-107"
	)
	public short[] method11107() {
		return this.overheadSpriteIds;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "818588856"
	)
	public void method11108(int var1, int var2, short var3) {
		this.overheadArchiveIds[var1] = var2;
		this.overheadSpriteIds[var1] = var3;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "1315554978"
	)
	public void method11109(int[] var1, short[] var2) {
		this.overheadArchiveIds = var1;
		this.overheadSpriteIds = var2;
	}
}
