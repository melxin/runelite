import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
@Implements("Sound")
public class Sound extends class149 {
	@ObfuscatedName("vj")
	@ObfuscatedGetter(
		intValue = 253812281
	)
	static int field1791;
	@ObfuscatedName("al")
	boolean field1787;
	@ObfuscatedName("ab")
	byte field1790;
	@ObfuscatedName("ac")
	byte field1788;
	@ObfuscatedName("av")
	byte field1786;
	@ObfuscatedName("au")
	byte field1789;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfg;)V"
	)
	Sound(class152 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "1324754926"
	)
	void vmethod4086(Buffer var1) {
		this.field1787 = var1.readUnsignedByte() == 1;
		this.field1790 = var1.readByte();
		this.field1788 = var1.readByte();
		this.field1786 = var1.readByte();
		this.field1789 = var1.readByte();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lgk;I)V",
		garbageValue = "1924878263"
	)
	void vmethod4088(ClanSettings var1) {
		var1.allowGuests = this.field1787;
		var1.field1816 = this.field1790;
		var1.field1817 = this.field1788;
		var1.field1831 = this.field1786;
		var1.field1819 = this.field1789;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1833797404"
	)
	public static int method3856(int var0, int var1) {
		int var2;
		for (var2 = 0; var1 > 0; --var1) {
			var2 = var2 << 1 | var0 & 1;
			var0 >>>= 1;
		}

		return var2;
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "944624261"
	)
	@Export("clear")
	static final void clear() {
		class188.field2007.clear();
		class190.field2023.clear();
		class150.method3801();
		DbRowType.DBRowType_cache.clear();
		DbTableType.DBTableType_cache.clear();
		EnumComposition.EnumDefinition_cached.clear();
		class85.method2787();
		class350.method7370();
		FontName.method10904();
		NPCComposition.method4312();
		ItemContainer.method2106();
		class578.method11153();
		class182.method4164();
		ObjectComposition.ObjectDefinition_cached.clear();
		ObjectComposition.ObjectDefinition_cachedModelData.clear();
		ObjectComposition.ObjectDefinition_cachedEntities.clear();
		ObjectComposition.ObjectDefinition_cachedModels.clear();
		WorldMapElement.HitSplatDefinition_cached.clear();
		class340.method7302();
		NPCComposition.NpcDefinition_cached.clear();
		NPCComposition.NpcDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cached.clear();
		ItemComposition.ItemDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cachedSprites.clear();
		ParamComposition.ParamDefinition_cached.clear();
		StudioGame.method8181();
		NpcOverrides.method4307();
		StructComposition.StructDefinition_cached.clear();
		class171.method4074();
		if (WorldMapEvent.field3424 != null) {
			WorldMapEvent.field3424.method11011();
		}

		if (class270.field3123 != null) {
			class270.field3123.method11011();
		}

		Clock.method6052();
		class168.method4033();
		class292.method6705();
		class182.field1864.clear();
		class177.field1842.clear();
		class180.field1851.clear();
		class205.field1909.clear();
		Tile.method4884();
		class202.field2136.clear();
		Client.DBTableIndex_cache.clear();
		Client.archive11.clear();
		class329.method7033();
		if (class167.widgetDefinition != null) {
			class167.widgetDefinition.method7455();
		}

		if (Rasterizer3D.clips.Rasterizer3D_textureLoader != null) {
			((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).clear();
		}

		Language.method8699();
		Client.field579.clearFiles();
		if (LoginPacket.field1743 != null) {
			LoginPacket.field1743.clearFiles();
		}

		if (MusicPatch.field3868 != null) {
			MusicPatch.field3868.clearFiles();
		}

		if (class381.field4313 != null) {
			class381.field4313.clearFiles();
		}

		if (PacketWriter.archive10 != null) {
			PacketWriter.archive10.clearFiles();
		}

		if (Canvas.archive12 != null) {
			Canvas.archive12.clearFiles();
		}

		if (AsyncRestClient.archive2 != null) {
			AsyncRestClient.archive2.clearFiles();
		}

		if (ScriptEvent.field871 != null) {
			ScriptEvent.field871.clearFiles();
		}

		if (class350.field3925 != null) {
			class350.field3925.clearFiles();
		}

		if (class36.archive13 != null) {
			class36.archive13.clearFiles();
		}

		if (class161.archive4 != null) {
			class161.archive4.clearFiles();
		}

		if (SecureRandomFuture.soundEffectsArchive != null) {
			SecureRandomFuture.soundEffectsArchive.clearFiles();
		}

		if (class4.field6 != null) {
			class4.field6.clearFiles();
		}

		if (MoveSpeed.archive6 != null) {
			MoveSpeed.archive6.clearFiles();
		}

		if (class201.archive9 != null) {
			class201.archive9.clearFiles();
		}

		if (MoveSpeed.field3199 != null) {
			MoveSpeed.field3199.clearFiles();
		}

		if (class197.field2131 != null) {
			class197.field2131.clearFiles();
		}

		if (CollisionMap.field3159 != null) {
			CollisionMap.field3159.clearFiles();
		}

		if (class188.archive8 != null) {
			class188.archive8.clearFiles();
		}

		if (class82.field1191 != null) {
			class82.field1191.clearFiles();
		}

		if (class173.field1915 != null) {
			class173.field1915.clearFiles();
		}

		if (ReflectionCheck.field240 != null) {
			ReflectionCheck.field240.clearFiles();
		}

		if (class175.field1928 != null) {
			class175.field1928.clearFiles();
		}

		if (class46.field666 != null) {
			class46.field666.clearFiles();
		}

	}
}
