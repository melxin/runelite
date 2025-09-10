import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("VarcInt_archive")
	public static AbstractArchive VarcInt_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("VarcInt_cached")
	public static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("pq")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;
	@ObfuscatedName("at")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64);
	}

	public VarcInt() {
		this.persist = false;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "1113234237"
	)
	public void method4207(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method4208(var1, var2);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lwb;IB)V",
		garbageValue = "107"
	)
	void method4208(Buffer var1, int var2) {
		if (var2 == 2) {
			this.persist = true;
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-945324004"
	)
	public static boolean method4212(int var0, int var1) {
		return (var0 >> var1 & 1) != 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lhy;",
		garbageValue = "-2105276794"
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "895471414"
	)
	public static void method4206() {
		ParamComposition.ParamDefinition_cached.clear();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1558024971"
	)
	static void method4216(int var0) {
		--class58.soundEffectCount;

		for (int var1 = var0; var1 < class58.soundEffectCount; ++var1) {
			class58.soundEffectIds[var1] = class58.soundEffectIds[var1 + 1];
			class58.soundEffects[var1] = class58.soundEffects[var1 + 1];
			class58.soundLocations[var1] = class58.soundLocations[var1 + 1];
			class58.field834[var1] = class58.field834[var1 + 1];
			class58.queuedSoundEffectLoops[var1] = class58.queuedSoundEffectLoops[var1 + 1];
			class58.queuedSoundEffectDelays[var1] = class58.queuedSoundEffectDelays[var1 + 1];
			class58.field829[var1] = class58.field829[var1 + 1];
			class58.field835[var1] = class58.field835[var1 + 1];
		}

	}

	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "749451288"
	)
	static final void method4215(int var0) {
		if (UrlRequester.widgetDefinition.loadInterface(var0)) {
			UserComparator4.drawModelComponents(UrlRequester.widgetDefinition.Widget_interfaceComponents[var0], 0, UrlRequester.widgetDefinition.Widget_interfaceComponents[var0].length - 1, -1, -1);
		}
	}
}
