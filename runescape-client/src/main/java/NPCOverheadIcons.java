import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wt")
@Implements("NPCOverheadIcons")
public class NPCOverheadIcons {
	@ObfuscatedName("ab")
	@Export("overheadArchiveIds")
	int[] overheadArchiveIds;
	@ObfuscatedName("at")
	@Export("overheadSpriteIds")
	short[] overheadSpriteIds;

	@ObfuscatedSignature(
		descriptor = "(Lhr;)V"
	)
	public NPCOverheadIcons(NPCComposition var1) {
		this.overheadArchiveIds = new int[8];
		this.overheadSpriteIds = new short[8];
		int var2 = 0;
		if (var1.method4391()) {
			var2 = var1.method4392().length;
			System.arraycopy(var1.method4392(), 0, this.overheadArchiveIds, 0, var2);
			System.arraycopy(var1.method4394(), 0, this.overheadSpriteIds, 0, var2);
		}

		for (int var3 = var2; var3 < 8; ++var3) {
			this.overheadArchiveIds[var3] = -1;
			this.overheadSpriteIds[var3] = -1;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1937336338"
	)
	public int[] method11629() {
		return this.overheadArchiveIds;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "1156358252"
	)
	public short[] method11637() {
		return this.overheadSpriteIds;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "772352303"
	)
	public void method11642(int var1, int var2, short var3) {
		this.overheadArchiveIds[var1] = var2;
		this.overheadSpriteIds[var1] = var3;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "-480875219"
	)
	public void method11628(int[] var1, short[] var2) {
		this.overheadArchiveIds = var1;
		this.overheadSpriteIds = var2;
	}
}
