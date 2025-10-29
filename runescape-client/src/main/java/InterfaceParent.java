import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("vi")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1385287145
	)
	@Export("group")
	int group;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -953539367
	)
	@Export("type")
	int type;
	@ObfuscatedName("ag")
	boolean field843;

	InterfaceParent() {
		this.field843 = false;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1775805783"
	)
	static void method2179() {
		class33.Tiles_underlays = null;
		class623.Tiles_overlays = null;
		class200.Tiles_shapes = null;
		HttpRequest.field49 = null;
		class148.field1747 = null;
		Tiles.Tiles_underlays2 = null;
		MouseRecorder.field868 = null;
		WorldMapSectionType.Tiles_hue = null;
		class565.Tiles_saturation = null;
		class67.Tiles_lightness = null;
		class161.Tiles_hueMultiplier = null;
		class154.field1785 = null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-568794256"
	)
	public static void method2180() {
		WorldMapElement.HitSplatDefinition_cached.clear();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([FI)V",
		garbageValue = "788950813"
	)
	static void method2181(float[] var0) {
		if (class135.field1605 + var0[0] < 1.3333334F) {
			float var1 = var0[0] - 2.0F;
			float var2 = var0[0] - 1.0F;
			float var3 = (float)Math.sqrt((double)(var1 * var1 - var2 * 4.0F * var2));
			float var4 = (var3 + -var1) * 0.5F;
			if (class135.field1605 + var0[1] > var4) {
				var0[1] = var4 - class135.field1605;
			} else {
				var4 = 0.5F * (-var1 - var3);
				if (var0[1] < var4 + class135.field1605) {
					var0[1] = class135.field1605 + var4;
				}
			}
		} else {
			var0[0] = 1.3333334F - class135.field1605;
			var0[1] = 0.33333334F - class135.field1605;
		}

	}
}
