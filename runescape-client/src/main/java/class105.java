import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
public class class105 {
	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	static WorldView field1384;

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1626758703"
	)
	@Export("clear")
	static final void clear() {
		WorldMapElement.method3812();
		WorldMapData_1.method6149();
		class277.method5803();
		DbRowType.DBRowType_cache.clear();
		class132.method3286();
		EnumComposition.EnumDefinition_cached.clear();
		class149.method3483();
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
		class60.method1155();
		class177.field1913.clear();
		class47.method857();
		VarpDefinition.method3780();
		class322.method6494();
		WorldMapElement.HitSplatDefinition_cached.clear();
		class190.field2026.clear();
		NPCComposition.NpcDefinition_cached.clear();
		NPCComposition.NpcDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cached.clear();
		ItemComposition.ItemDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cachedSprites.clear();
		class145.method3448();
		class144.method3439();
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
		StructComposition.StructDefinition_cached.clear();
		VarbitComposition.VarbitDefinition_cached.clear();
		if (class478.field5096 != null) {
			class478.field5096.method10019();
		}

		if (class328.field3644 != null) {
			class328.field3644.method10019();
		}

		class194.field2100.clear();
		class74.method2219();
		class144.method3438();
		class36.method666();
		class176.field1842.clear();
		class179.field1851.clear();
		ArchiveDiskAction.method7568();
		VarpDefinition.VarpDefinition_cached.clear();
		class59.method1134();
		Client.DBTableIndex_cache.clear();
		Client.archive11.clear();
		PlayerComposition.PlayerAppearance_cachedModels.clear();
		PlayerComposition.field3877.clearFiles();
		PlayerComposition.field3867 = 0;
		if (class376.widgetDefinition != null) {
			class376.widgetDefinition.method6923();
		}

		if (Rasterizer3D.clips.Rasterizer3D_textureLoader != null) {
			((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).clear();
		}

		Script.Script_cached.clear();
		Client.field806.clearFiles();
		if (MilliClock.field2452 != null) {
			MilliClock.field2452.clearFiles();
		}

		if (class60.field422 != null) {
			class60.field422.clearFiles();
		}

		if (class189.archive2 != null) {
			class189.archive2.clearFiles();
		}

		if (class6.archive10 != null) {
			class6.archive10.clearFiles();
		}

		if (TextureProvider.archive12 != null) {
			TextureProvider.archive12.clearFiles();
		}

		if (Client.field548 != null) {
			Client.field548.clearFiles();
		}

		if (AsyncHttpResponse.field76 != null) {
			AsyncHttpResponse.field76.clearFiles();
		}

		if (class78.field996 != null) {
			class78.field996.clearFiles();
		}

		if (JagexCache.archive13 != null) {
			JagexCache.archive13.clearFiles();
		}

		if (WorldMapIcon_1.field3170 != null) {
			WorldMapIcon_1.field3170.clearFiles();
		}

		if (HealthBarConfig.soundEffectsArchive != null) {
			HealthBarConfig.soundEffectsArchive.clearFiles();
		}

		if (class553.field5487 != null) {
			class553.field5487.clearFiles();
		}

		if (PlayerUpdateManager.archive9 != null) {
			PlayerUpdateManager.archive9.clearFiles();
		}

		if (class166.archive6 != null) {
			class166.archive6.clearFiles();
		}

		if (EnumComposition.field2011 != null) {
			EnumComposition.field2011.clearFiles();
		}

		if (class1.field3 != null) {
			class1.field3.clearFiles();
		}

		if (MenuAction.field931 != null) {
			MenuAction.field931.clearFiles();
		}

		if (PendingSpawn.archive8 != null) {
			PendingSpawn.archive8.clearFiles();
		}

		if (SpriteMask.field3819 != null) {
			SpriteMask.field3819.clearFiles();
		}

		if (EnumComposition.field2004 != null) {
			EnumComposition.field2004.clearFiles();
		}

		if (KeyHandler.field116 != null) {
			KeyHandler.field116.clearFiles();
		}

		if (ArchiveLoader.field1065 != null) {
			ArchiveLoader.field1065.clearFiles();
		}

		if (GrandExchangeEvents.field4746 != null) {
			GrandExchangeEvents.field4746.clearFiles();
		}

	}
}
