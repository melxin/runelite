import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	static IndexedSprite field1690;
	@ObfuscatedName("ab")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1806536569
	)
	@Export("world")
	public int world;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-1842639283"
	)
	public static void method3475(AbstractArchive var0) {
		DbRowType.field5415 = var0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Lht;",
		garbageValue = "2"
	)
	@Export("getParamDefinition")
	public static ParamComposition getParamDefinition(int var0) {
		ParamComposition var1 = (ParamComposition)ParamComposition.ParamDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ParamComposition.ParamDefinition_archive.takeFile(11, var0);
			var1 = new ParamComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			ParamComposition.ParamDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhm;",
		garbageValue = "2"
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

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2047586911"
	)
	static final int method3474(int var0) {
		return Math.min(Math.max(var0, 128), 383);
	}
}
