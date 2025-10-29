import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		longValue = -7524770072208173231L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1804672227
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 121856729
	)
	@Export("z")
	int z;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -682745183
	)
	@Export("x")
	int x;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1215145581
	)
	@Export("y")
	int y;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1327001075
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1475596409
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 751081245
	)
	int field3194;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1501441925
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1799251127
	)
	int field3196;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 219957667
	)
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-19"
	)
	void method6262(int var1, int var2) {
		this.yOffset = var1;
		this.field3194 = var2;
		switch(this.orientation) {
		case 1:
			++var1;
			break;
		case 2:
			--var2;
		case 3:
		case 5:
		case 6:
		case 7:
		default:
			break;
		case 4:
			--var1;
			break;
		case 8:
			++var2;
		}

		this.xOffset = var1;
		this.field3196 = var2;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Lgc;",
		garbageValue = "-385995351"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0);
			var1 = new InvDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILcv;B)Ldd;",
		garbageValue = "-10"
	)
	public static WorldView method6261(int var0, WorldViewManager var1) {
		Iterator var2 = var1.iterator();

		WorldView var3;
		do {
			if (!var2.hasNext()) {
				return var1.method2394();
			}

			var3 = (WorldView)var2.next();
		} while(var3.npcs.get((long)var0) == null);

		return var3;
	}
}
