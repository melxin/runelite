import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uj")
public abstract class class520 {
	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	static StudioGame field5546;

	class520() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lkb;Lto;II)V",
		garbageValue = "-1824890420"
	)
	abstract void vmethod10584(WorldEntityCoord var1, class519 var2, int var3);

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lkb;IIB)Z",
		garbageValue = "99"
	)
	abstract boolean vmethod10595(WorldEntityCoord var1, int var2, int var3);

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "56"
	)
	abstract void vmethod10586(int var1, int var2);

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lut;Lut;I)V",
		garbageValue = "529503132"
	)
	public static void method10573(DynamicArray var0, DynamicArray var1) {
		if (var0 != null && var0.method10652() > 1) {
			class461.method9375(var0, (class586)null, true);
			if (var1 != null) {
				class461.method9375(var1, (class586)null, true);
			}

			int var2 = var0.method10652();
			if (var1 != null && var1.method10652() < var2) {
				throw new RuntimeException();
			} else {
				if (var0.field5584 == class586.field5937) {
					if (var1 == null) {
						class134.method3758(var0.method10650(), class528.field5595, 0, var2 - 1);
					} else if (class586.field5937 == var1.field5584) {
						class134.method3758(var0.method10650(), var1.method10650(), 0, var2 - 1);
					} else if (class586.field5942 == var1.field5584) {
						class143.method3889(var0.method10650(), var1.method10651(), 0, var2 - 1);
					} else {
						class69.method2285(var0.method10650(), var1.method10681(), 0, var2 - 1);
					}
				} else if (var0.field5584 == class586.field5942) {
					if (var1 == null) {
						Arrays.sort(var0.method10651(), 0, var2);
					} else if (class586.field5937 == var1.field5584) {
						class341.method7294(var0.method10651(), var1.method10650(), 0, var2 - 1);
					} else if (class586.field5942 == var1.field5584) {
						ChatChannel.method2061(var0.method10651(), var1.method10651(), 0, var2 - 1);
					} else {
						HorizontalAlignment.method4463(var0.method10651(), var1.method10681(), 0, var2 - 1);
					}
				} else {
					if (var0.field5584 != class586.field5939) {
						throw new RuntimeException();
					}

					if (var1 == null) {
						Arrays.sort(var0.method10681(), 0, var2);
					} else if (class586.field5937 == var1.field5584) {
						WorldMapID.quicksortStringsWithCorrespondingIntegers((String[])((String[])var0.method10681()), var1.method10650(), 0, var2 - 1);
					} else if (class586.field5942 == var1.field5584) {
						class161.method4049((String[])((String[])var0.method10681()), var1.method10651(), 0, var2 - 1);
					} else {
						Renderable.method5847((String[])((String[])var0.method10681()), var1.method10681(), 0, var2 - 1);
					}
				}

			}
		}
	}

	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1762261826"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (class226.widgetDefinition.loadInterface(var0)) {
			VertexNormal.runComponentCloseListeners(class226.widgetDefinition.Widget_interfaceComponents[var0], var1);
		}
	}
}
