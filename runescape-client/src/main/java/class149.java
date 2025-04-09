import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
public class class149 extends class148 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("SpotAnimationDefinition_archive")
	public static AbstractArchive SpotAnimationDefinition_archive;
	@ObfuscatedName("ak")
	@Export("ByteArrayPool_altSizeArrayCounts")
	static int[] ByteArrayPool_altSizeArrayCounts;
	@ObfuscatedName("pj")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -228991597
	)
	int field1707;
	@ObfuscatedName("an")
	boolean field1708;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	final class151 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfd;)V"
	)
	class149(class151 var1) {
		this.this$0 = var1;
		this.field1707 = -1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lve;B)V",
		garbageValue = "53"
	)
	void vmethod3749(Buffer var1) {
		this.field1707 = var1.readUnsignedShort();
		this.field1708 = var1.readUnsignedByte() == 1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgw;I)V",
		garbageValue = "1984465176"
	)
	void vmethod3750(ClanSettings var1) {
		var1.method3568(this.field1707, this.field1708);
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(IZZZZI)Lpx;",
		garbageValue = "-328659732"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		ArchiveDisk var5 = null;
		if (JagexCache.JagexCache_dat2File != null) {
			var5 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var5, class6.masterDisk, ClanSettings.field1791, var0, var1, var2, var3, var4, false);
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "117420866"
	)
	static final int method3477(int var0) {
		return Math.abs(var0 - AsyncHttpResponse.cameraYaw) > 1024 ? var0 + 2048 * (var0 < AsyncHttpResponse.cameraYaw ? 1 : -1) : var0;
	}
}
