import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("as")
	@Export("PcmPlayer_stereo")
	public static boolean PcmPlayer_stereo;
	@ObfuscatedName("oo")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1027021233
	)
	@Export("x")
	int x;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -976363093
	)
	@Export("y")
	int y;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1358705711
	)
	@Export("z")
	int z;

	FaceNormal() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(FFFI)Lrx;",
		garbageValue = "-244409807"
	)
	public static ProjectionCoord method5848(float var0, float var1, float var2) {
		synchronized(ProjectionCoord.field5238) {
			if (ProjectionCoord.field5236 == 0) {
				return new ProjectionCoord(var0, var1, var2);
			} else {
				ProjectionCoord.field5238[--ProjectionCoord.field5236].method9296(var0, var1, var2);
				return ProjectionCoord.field5238[ProjectionCoord.field5236];
			}
		}
	}
}
