import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
@Implements("UserComparator3")
public class UserComparator3 extends AbstractUserComparator {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;
	@ObfuscatedName("sv")
	@ObfuscatedGetter(
		intValue = -2105059237
	)
	static int field1560;
	@ObfuscatedName("av")
	@Export("reversed")
	final boolean reversed;

	public UserComparator3(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ltm;Ltm;I)I",
		garbageValue = "-791236030"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.world != var1.world) {
			return this.reversed ? var1.world - var2.world : var2.world - var1.world;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([BI)Lcu;",
		garbageValue = "-128596119"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script();
		Buffer var2 = new Buffer(var0);
		var2.offset = (var2.array.length - 2) * 1741769013;
		int var3 = var2.readUnsignedShort();
		int var4 = var2.array.length - 2 - var3 - 12;
		var2.offset = var4 * 1741769013;
		int var5 = var2.readInt();
		var1.localIntCount = var2.readUnsignedShort();
		var1.localStringCount = var2.readUnsignedShort();
		var1.intArgumentCount = var2.readUnsignedShort();
		var1.stringArgumentCount = var2.readUnsignedShort();
		int var6 = var2.readUnsignedByte();
		int var7;
		int var8;
		if (var6 > 0) {
			var1.switches = var1.newIterableNodeHashTable(var6);

			for (var7 = 0; var7 < var6; ++var7) {
				var8 = var2.readUnsignedShort();
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? class161.method4040(var8) : 1);
				var1.switches[var7] = var9;

				while (var8-- > 0) {
					int var10 = var2.readInt();
					int var11 = var2.readInt();
					var9.put(new IntegerNode(var11), (long)var10);
				}
			}
		}

		var2.offset = 0;
		var1.field754 = var2.readStringCp1252NullTerminatedOrNull();
		var1.opcodes = new int[var5];
		var1.intOperands = new int[var5];
		var1.stringOperands = new String[var5];

		for (var7 = 0; var2.offset * 2108391709 < var4; var1.opcodes[var7++] = var8) {
			var8 = var2.readUnsignedShort();
			switch(var8) {
			case 3:
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
				break;
			case 21:
			case 38:
			case 39:
			case 63:
				var1.intOperands[var7] = var2.readUnsignedByte();
				break;
			default:
				if (var8 <= 99) {
					var1.intOperands[var7] = var2.readInt();
				} else {
					var1.intOperands[var7] = var2.readUnsignedByte();
				}
			}
		}

		return var1;
	}

	@ObfuscatedName("nm")
	static final void method3718(double var0) {
		Rasterizer3D.buildPalette(var0);
		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).setBrightness(var0);
		if (Skills.worldMap != null) {
			Skills.worldMap.method11024();
		}

		ItemComposition.ItemDefinition_cachedSprites.clear();
		class468.clientPreferences.updateBrightness(var0);
	}
}
