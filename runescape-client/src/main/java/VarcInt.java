import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	@Export("VarcInt_archive")
	static AbstractArchive VarcInt_archive;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("VarcInt_cached")
	static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	@Export("ObjectDefinition_archive")
	public static AbstractArchive ObjectDefinition_archive;
	@ObfuscatedName("ip")
	static List field2016;
	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	static Archive field2017;
	@ObfuscatedName("ag")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64);
	}

	VarcInt() {
		this.persist = false;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxa;B)V",
		garbageValue = "0"
	)
	void method4350(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method4354(var1, var2);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxa;II)V",
		garbageValue = "-1788570780"
	)
	void method4354(Buffer var1, int var2) {
		if (var2 == 2) {
			this.persist = true;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z",
		garbageValue = "-2124509071"
	)
	static final boolean method4357(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = ViewportMouse.ViewportMouse_y + var6;
		if (var7 < var0 && var7 < var1 && var7 < var2) {
			return false;
		} else {
			var7 = ViewportMouse.ViewportMouse_y - var6;
			if (var7 > var0 && var7 > var1 && var7 > var2) {
				return false;
			} else {
				var7 = ViewportMouse.ViewportMouse_x + var6;
				if (var7 < var3 && var7 < var4 && var7 < var5) {
					return false;
				} else {
					var7 = ViewportMouse.ViewportMouse_x - var6;
					return var7 <= var3 || var7 <= var4 || var7 <= var5;
				}
			}
		}
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/String;I)Lut;",
		garbageValue = "-1327921751"
	)
	static DynamicArray method4356(Object var0, String var1) {
		if (var0 == null) {
			throw new RuntimeException();
		} else {
			return (DynamicArray)var0;
		}
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "76"
	)
	static final int method4358(int var0) {
		return Math.abs(var0 - WorldMapData_0.cameraYaw) > 1024 ? var0 + 2048 * (var0 < WorldMapData_0.cameraYaw ? 1 : -1) : var0;
	}
}
