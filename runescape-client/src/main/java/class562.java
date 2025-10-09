import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vl")
public class class562 extends class519 {
	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	@Export("clear")
	static final void clear() {
		class1.method8();
		class365.method7886();
		class136.method3754();
		DbRowType.DBRowType_cache.clear();
		class141.method3821();
		WorldMapCacheName.method6906();
		class113.method3528();
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
		class178.field1913.clear();
		KitDefinition.KitDefinition_cached.clear();
		IntProjection.method5075();
		ObjectComposition.ObjectDefinition_cached.clear();
		ObjectComposition.ObjectDefinition_cachedModelData.clear();
		ObjectComposition.ObjectDefinition_cachedEntities.clear();
		ObjectComposition.ObjectDefinition_cachedModels.clear();
		WidgetDefinition.method7492();
		class191.field2026.clear();
		NPCComposition.NpcDefinition_cached.clear();
		NPCComposition.NpcDefinition_cachedModels.clear();
		class134.method3732();
		ParamComposition.ParamDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cachedFrames.clear();
		SequenceDefinition.SequenceDefinition_cachedModel.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
		StructComposition.StructDefinition_cached.clear();
		class275.method6237();
		Sound.method3956();
		if (class416.field5060 != null) {
			class416.field5060.method11139();
		}

		if (FriendSystem.field624 != null) {
			FriendSystem.field624.method11139();
		}

		class195.field2100.clear();
		Varcs.method2985();
		class29.method457();
		class182.field1864.clear();
		AsyncRestClient.method164();
		class6.method39();
		class206.field1909.clear();
		VarpDefinition.VarpDefinition_cached.clear();
		class141.method3820();
		Client.DBTableIndex_cache.clear();
		Client.archive11.clear();
		MidiRequest.method7398();
		if (class35.widgetDefinition != null) {
			class35.widgetDefinition.method7488();
		}

		if (Rasterizer3D.clips.Rasterizer3D_textureLoader != null) {
			((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).clear();
		}

		Script.Script_cached.clear();
		Client.field473.clearFiles();
		if (class322.field3540 != null) {
			class322.field3540.clearFiles();
		}

		if (RestClientThreadFactory.field67 != null) {
			RestClientThreadFactory.field67.clearFiles();
		}

		if (WorldMapDecoration.field3459 != null) {
			WorldMapDecoration.field3459.clearFiles();
		}

		if (Projection.archive10 != null) {
			Projection.archive10.clearFiles();
		}

		if (class142.archive12 != null) {
			class142.archive12.clearFiles();
		}

		if (class206.archive2 != null) {
			class206.archive2.clearFiles();
		}

		if (WorldMapSprite.field3462 != null) {
			WorldMapSprite.field3462.clearFiles();
		}

		if (Client.field376 != null) {
			Client.field376.clearFiles();
		}

		if (Canvas.archive13 != null) {
			Canvas.archive13.clearFiles();
		}

		if (class416.archive4 != null) {
			class416.archive4.clearFiles();
		}

		if (ViewportMouse.soundEffectsArchive != null) {
			ViewportMouse.soundEffectsArchive.clearFiles();
		}

		if (PacketWriter.field1291 != null) {
			PacketWriter.field1291.clearFiles();
		}

		if (GrandExchangeOffer.archive6 != null) {
			GrandExchangeOffer.archive6.clearFiles();
		}

		if (ItemContainer.archive9 != null) {
			ItemContainer.archive9.clearFiles();
		}

		if (class443.field5180 != null) {
			class443.field5180.clearFiles();
		}

		if (class113.field1508 != null) {
			class113.field1508.clearFiles();
		}

		if (UserComparator4.field1562 != null) {
			UserComparator4.field1562.clearFiles();
		}

		if (BoundaryObject.archive8 != null) {
			BoundaryObject.archive8.clearFiles();
		}

		if (PendingSpawn.field1023 != null) {
			PendingSpawn.field1023.clearFiles();
		}

		if (WorldViewManager.field1001 != null) {
			WorldViewManager.field1001.clearFiles();
		}

		if (WorldMapArea.field3339 != null) {
			WorldMapArea.field3339.clearFiles();
		}

		if (FriendSystem.field621 != null) {
			FriendSystem.field621.clearFiles();
		}

		if (class156.field1814 != null) {
			class156.field1814.clearFiles();
		}

	}

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(Ldt;B)V",
		garbageValue = "-102"
	)
	static void method11051(NPC var0) {
		var0.size = var0.definition.size;
		var0.field1088 = var0.definition.rotation;
		var0.walkSequence = var0.definition.walkSequence;
		var0.walkBackSequence = var0.definition.walkBackSequence;
		var0.walkLeftSequence = var0.definition.walkLeftSequence;
		var0.walkRightSequence = var0.definition.walkRightSequence;
		var0.idleSequence = var0.definition.idleSequence;
		var0.turnLeftSequence = var0.definition.turnLeftSequence;
		var0.turnRightSequence = var0.definition.turnRightSequence;
		var0.runSequence = var0.definition.field2106;
		var0.field1079 = var0.definition.field2107;
		var0.field1058 = var0.definition.field2108;
		var0.field1059 = var0.definition.field2138;
		var0.field1060 = var0.definition.field2110;
		var0.field1046 = var0.definition.field2111;
		var0.field1062 = var0.definition.field2112;
		var0.field1047 = var0.definition.field2104;
	}
}
