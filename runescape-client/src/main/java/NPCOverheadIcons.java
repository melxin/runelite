import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vx")
@Implements("NPCOverheadIcons")
public class NPCOverheadIcons {
	@ObfuscatedName("ao")
	@Export("overheadArchiveIds")
	int[] overheadArchiveIds;
	@ObfuscatedName("an")
	@Export("overheadSpriteIds")
	short[] overheadSpriteIds;

	@ObfuscatedSignature(
		descriptor = "(Ljn;)V"
	)
	public NPCOverheadIcons(NPCComposition var1) {
		this.overheadArchiveIds = new int[8];
		this.overheadSpriteIds = new short[8];
		int var2 = 0;
		if (var1.method5182()) {
			var2 = var1.method5183().length;
			System.arraycopy(var1.method5183(), 0, this.overheadArchiveIds, 0, var2);
			System.arraycopy(var1.method5172(), 0, this.overheadSpriteIds, 0, var2);
		}

		for (int var3 = var2; var3 < 8; ++var3) {
			this.overheadArchiveIds[var3] = -1;
			this.overheadSpriteIds[var3] = -1;
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-310876704"
	)
	public int[] method10557() {
		return this.overheadArchiveIds;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "1765397739"
	)
	public short[] method10558() {
		return this.overheadSpriteIds;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "842558199"
	)
	public void method10559(int var1, int var2, short var3) {
		this.overheadArchiveIds[var1] = var2;
		this.overheadSpriteIds[var1] = var3;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "818633975"
	)
	public void method10560(int[] var1, short[] var2) {
		this.overheadArchiveIds = var1;
		this.overheadSpriteIds = var2;
	}
}
