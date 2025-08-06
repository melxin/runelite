import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("ak")
	@Export("Tiles_underlays2")
	static byte[][][] Tiles_underlays2;
	@ObfuscatedName("uo")
	@ObfuscatedSignature(
		descriptor = "Lxv;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lqr;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;
	@ObfuscatedName("ac")
	String field777;
	@ObfuscatedName("av")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("au")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("as")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 696982785
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1844842555
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1320278685
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1417864765
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;

	static {
		Script_cached = new EvictingDualNodeHashTable(128);
	}

	Script() {
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)[Lqr;",
		garbageValue = "208959378"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1];
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "164348684"
	)
	static void method1980() {
		AABB.Tiles_underlays = null;
		Tiles.Tiles_overlays = null;
		class28.Tiles_shapes = null;
		ChatChannel.field806 = null;
		class81.field1179 = null;
		Tiles_underlays2 = null;
		Timer.field4752 = null;
		SecureRandomFuture.Tiles_hue = null;
		WorldMapSection0.Tiles_saturation = null;
		WorldMapArea.Tiles_lightness = null;
		DbTable.Tiles_hueMultiplier = null;
		DelayFadeTask.field5175 = null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "40"
	)
	static void method1978() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();

			for (ObjectSound var2 = (ObjectSound)var1.method2638().last(); var2 != null; var2 = (ObjectSound)var1.method2638().previous()) {
				var2.method2242();
			}
		}

	}
}
