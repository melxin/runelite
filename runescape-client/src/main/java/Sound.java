import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
@Implements("Sound")
public class Sound extends class150 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("KitDefinition_modelsArchive")
	static AbstractArchive KitDefinition_modelsArchive;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lxc;"
	)
	static IndexedSprite field1826;
	@ObfuscatedName("ab")
	boolean field1816;
	@ObfuscatedName("at")
	byte field1824;
	@ObfuscatedName("ag")
	byte field1817;
	@ObfuscatedName("aj")
	byte field1818;
	@ObfuscatedName("ah")
	byte field1819;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	Sound(class153 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "1804820754"
	)
	void vmethod4162(Buffer var1) {
		this.field1816 = var1.readUnsignedByte() == 1;
		this.field1824 = var1.readByte();
		this.field1817 = var1.readByte();
		this.field1818 = var1.readByte();
		this.field1819 = var1.readByte();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgh;I)V",
		garbageValue = "1850606911"
	)
	void vmethod4163(ClanSettings var1) {
		var1.allowGuests = this.field1816;
		var1.field1846 = this.field1824;
		var1.field1857 = this.field1817;
		var1.field1858 = this.field1818;
		var1.field1849 = this.field1819;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "27527"
	)
	public static void method3957() {
		class335.KitDefinition_archive = null;
		KitDefinition_modelsArchive = null;
		KitDefinition.KitDefinition_fileCount = 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-7439"
	)
	public static void method3956() {
		VarbitComposition.VarbitDefinition_cached.clear();
	}

	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILxl;Lnt;II)V",
		garbageValue = "191926"
	)
	static final void method3958(int var0, int var1, int var2, int var3, int var4, int var5, SpritePixels var6, SpriteMask var7, int var8) {
		if (var6 != null) {
			int var9 = var3 * var3 + var2 * var2;
			if (var9 <= 6400) {
				int var10 = Rasterizer3D.Rasterizer3D_sine[var4];
				int var11 = Rasterizer3D.Rasterizer3D_cosine[var4];
				int var12 = var11 * var2 + var3 * var10 >> 16;
				int var13 = var3 * var11 - var10 * var2 >> 16;
				var5 = var4 - var5 & 2047;
				int var14 = var7.width / 2 + var0 + var12;
				int var15 = var7.height / 2 + var1 - var13;
				int var16 = var6.width * var8;
				int var17 = var6.height * var8;
				int var18 = var14 - var16 / 2;
				int var19 = var15 - var17 / 2;
				int var20 = var6.subWidth / 2;
				int var21 = var6.subHeight / 2;
				var6.drawRotatedMaskedCenteredAround(var18, var19, var16, var17, var20, var21, var5, var8 * 256, var0, var1, var7.xStarts, var7.xWidths);
			}
		}
	}
}
