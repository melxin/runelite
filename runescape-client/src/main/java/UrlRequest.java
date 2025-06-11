import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2132140187
	)
	static int field1500;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 542409307
	)
	static int field1497;
	@ObfuscatedName("an")
	final URL field1493;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 2047674915
	)
	volatile int field1491;
	@ObfuscatedName("al")
	@Export("response0")
	volatile byte[] response0;

	static {
		field1500 = -1;
		field1497 = -2;
	}

	UrlRequest(URL var1) {
		this.field1491 = field1500;
		this.field1493 = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-520081333"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.field1491 != field1500;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-257518754"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-94"
	)
	public String method3367() {
		return this.field1493.toString();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILvl;I)Z",
		garbageValue = "213901937"
	)
	public static boolean method3377(int var0, class571 var1) {
		return (var0 & var1.rsOrdinal()) != 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1109877326"
	)
	static final void method3375(String var0) {
		GrandExchangeOfferOwnWorldComparator.method760(var0 + " is already on your friend list");
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IZI)Ljava/lang/String;",
		garbageValue = "1327721359"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		return var1 && var0 >= 0 ? class86.method2693(var0, 10, var1) : Integer.toString(var0);
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1531496980"
	)
	@Export("clear")
	static final void clear() {
		NPC.method2638();
		class179.method3971();
		class179.field1915.clear();
		DbRowType.DBRowType_cache.clear();
		SpotAnimationDefinition.method4239();
		class36.method705();
		class291.method6522();
		ChatChannel.method1995();
		ModelData0.method5836();
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
		Client.method1438();
		VarpDefinition.method3989();
		InvDefinition.InvDefinition_cached.clear();
		ObjectComposition.ObjectDefinition_cached.clear();
		ObjectComposition.ObjectDefinition_cachedModelData.clear();
		ObjectComposition.ObjectDefinition_cachedEntities.clear();
		ObjectComposition.ObjectDefinition_cachedModels.clear();
		WorldMapElement.HitSplatDefinition_cached.clear();
		class191.field2026.clear();
		RestClientThreadFactory.method219();
		ItemComposition.ItemDefinition_cached.clear();
		ItemComposition.ItemDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cachedSprites.clear();
		ParamComposition.ParamDefinition_cached.clear();
		class351.method7188();
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
		class114.method3306();
		VarbitComposition.VarbitDefinition_cached.clear();
		if (class27.field129 != null) {
			class27.field129.method10596();
		}

		if (SequenceDefinition.field2343 != null) {
			SequenceDefinition.field2343.method10596();
		}

		WallDecoration.method5860();
		WorldMapSection2.method6224();
		PlayerUpdateManager.method2739();
		class182.field1864.clear();
		class177.field1842.clear();
		class180.field1851.clear();
		NPCComposition.method4155();
		VarpDefinition.VarpDefinition_cached.clear();
		SpotAnimationDefinition.method4249();
		Client.DBTableIndex_cache.clear();
		Client.archive11.clear();
		class273.method5992();
		if (ClientPreferences.widgetDefinition != null) {
			ClientPreferences.widgetDefinition.method7285();
		}

		if (Rasterizer3D.clips.Rasterizer3D_textureLoader != null) {
			((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).clear();
		}

		WallDecoration.method5859();
		Client.field592.clearFiles();
		if (class226.field2467 != null) {
			class226.field2467.clearFiles();
		}

		if (class51.field728 != null) {
			class51.field728.clearFiles();
		}

		if (SoundCache.field1342 != null) {
			SoundCache.field1342.clearFiles();
		}

		if (class198.archive10 != null) {
			class198.archive10.clearFiles();
		}

		if (class526.archive12 != null) {
			class526.archive12.clearFiles();
		}

		if (MusicPatchPcmStream.archive2 != null) {
			MusicPatchPcmStream.archive2.clearFiles();
		}

		if (AbstractByteArrayCopier.field3837 != null) {
			AbstractByteArrayCopier.field3837.clearFiles();
		}

		if (class403.field4745 != null) {
			class403.field4745.clearFiles();
		}

		if (class361.archive13 != null) {
			class361.archive13.clearFiles();
		}

		if (class330.archive4 != null) {
			class330.archive4.clearFiles();
		}

		if (class355.soundEffectsArchive != null) {
			class355.soundEffectsArchive.clearFiles();
		}

		if (WorldMapRectangle.field3283 != null) {
			WorldMapRectangle.field3283.clearFiles();
		}

		if (class217.archive6 != null) {
			class217.archive6.clearFiles();
		}

		if (VerticalAlignment.archive9 != null) {
			VerticalAlignment.archive9.clearFiles();
		}

		if (ModeWhere.field4905 != null) {
			ModeWhere.field4905.clearFiles();
		}

		if (WorldMapArea.field3181 != null) {
			WorldMapArea.field3181.clearFiles();
		}

		if (Varcs.field1254 != null) {
			Varcs.field1254.clearFiles();
		}

		if (GrandExchangeOfferAgeComparator.archive8 != null) {
			GrandExchangeOfferAgeComparator.archive8.clearFiles();
		}

		if (class225.field2457 != null) {
			class225.field2457.clearFiles();
		}

		if (class150.field1717 != null) {
			class150.field1717.clearFiles();
		}

		if (class107.field1386 != null) {
			class107.field1386.clearFiles();
		}

		if (LoginState.field283 != null) {
			LoginState.field283.clearFiles();
		}

		if (ArchiveDiskAction.field4689 != null) {
			ArchiveDiskAction.field4689.clearFiles();
		}

	}
}
