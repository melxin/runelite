import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ko")
public class class279 {
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Lws;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "17"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		class53.addChatMessage(var0, var1, var2, (String)null);
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2075606386"
	)
	@Export("clear")
	static final void clear() {
		class241.field2007.clear();
		class141.method3394();
		class232.field1915.clear();
		GrandExchangeOfferNameComparator.method7853();
		class413.method7928();
		EnumComposition.EnumDefinition_cached.clear();
		PcmPlayer.method842();
		class322.method6543();
		HealthBarDefinition.HealthBarDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
		WorldMapAreaData.method6436();
		class231.field1913.clear();
		class268.method5661();
		class137.method3367();
		ObjectComposition.ObjectDefinition_cached.clear();
		ObjectComposition.ObjectDefinition_cachedModelData.clear();
		ObjectComposition.ObjectDefinition_cachedEntities.clear();
		ObjectComposition.ObjectDefinition_cachedModels.clear();
		DevicePcmPlayerProvider.method323();
		class244.field2026.clear();
		NPCComposition.NpcDefinition_cached.clear();
		NPCComposition.NpcDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cached.clear();
		ItemComposition.ItemDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cachedSprites.clear();
		ParamComposition.ParamDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cachedFrames.clear();
		SequenceDefinition.SequenceDefinition_cachedModel.clear();
		class36.method711();
		UserComparator7.method3219();
		VarbitComposition.VarbitDefinition_cached.clear();
		if (class223.field2517 != null) {
			class223.field2517.method10097();
		}

		if (LoginState.field491 != null) {
			LoginState.field491.method10097();
		}

		class248.field2100.clear();
		class222.method4933();
		TaskHandler.method4803();
		class235.field1864.clear();
		class230.field1842.clear();
		class233.field1851.clear();
		class258.field1909.clear();
		class158.method3553();
		class211.method4778();
		Client.DBTableIndex_cache.clear();
		Client.archive11.clear();
		PlayerComposition.PlayerAppearance_cachedModels.clear();
		PlayerComposition.field3881.clearFiles();
		PlayerComposition.field3882 = 0;
		if (class232.widgetDefinition != null) {
			class232.widgetDefinition.method6955();
		}

		if (Rasterizer3D.clips.Rasterizer3D_textureLoader != null) {
			((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).clear();
		}

		class521.method9685();
		Client.field770.clearFiles();
		if (class145.field1696 != null) {
			class145.field1696.clearFiles();
		}

		if (class231.field2558 != null) {
			class231.field2558.clearFiles();
		}

		if (UserComparator6.field1532 != null) {
			UserComparator6.field1532.clearFiles();
		}

		if (FloorDecoration.archive10 != null) {
			FloorDecoration.archive10.clearFiles();
		}

		if (WorldMapDecoration.archive12 != null) {
			WorldMapDecoration.archive12.clearFiles();
		}

		if (class521.archive2 != null) {
			class521.archive2.clearFiles();
		}

		if (class171.field1872 != null) {
			class171.field1872.clearFiles();
		}

		if (HttpMethod.field39 != null) {
			HttpMethod.field39.clearFiles();
		}

		if (MouseHandler.archive13 != null) {
			MouseHandler.archive13.clearFiles();
		}

		if (class147.archive4 != null) {
			class147.archive4.clearFiles();
		}

		if (Messages.soundEffectsArchive != null) {
			Messages.soundEffectsArchive.clearFiles();
		}

		if (ClientPacket.field3483 != null) {
			ClientPacket.field3483.clearFiles();
		}

		if (class143.archive6 != null) {
			class143.archive6.clearFiles();
		}

		if (class161.archive9 != null) {
			class161.archive9.clearFiles();
		}

		if (class133.field1576 != null) {
			class133.field1576.clearFiles();
		}

		if (SongTask.field5037 != null) {
			SongTask.field5037.clearFiles();
		}

		if (class330.field3665 != null) {
			class330.field3665.clearFiles();
		}

		if (class357.archive8 != null) {
			class357.archive8.clearFiles();
		}

		if (AsyncHttpResponse.field66 != null) {
			AsyncHttpResponse.field66.clearFiles();
		}

		if (class456.field5014 != null) {
			class456.field5014.clearFiles();
		}

		if (class342.field3779 != null) {
			class342.field3779.clearFiles();
		}

		if (class33.field150 != null) {
			class33.field150.clearFiles();
		}

		if (class140.field1650 != null) {
			class140.field1650.clearFiles();
		}

	}
}
