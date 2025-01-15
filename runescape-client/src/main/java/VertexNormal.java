import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1397898627
	)
	@Export("x")
	int x;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -396954475
	)
	@Export("y")
	int y;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -411226141
	)
	@Export("z")
	int z;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 507587089
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	}

	@ObfuscatedSignature(
		descriptor = "(Lhd;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x;
		this.y = var1.y;
		this.z = var1.z;
		this.magnitude = var1.magnitude;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Ljr;",
		garbageValue = "-678648084"
	)
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0);
			var1 = new EnumComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
