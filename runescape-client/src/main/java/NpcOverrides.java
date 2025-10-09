import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
@Implements("NpcOverrides")
public class NpcOverrides {
	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	static StudioGame field2082;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = -4798029916765434187L
	)
	public long field2078;
	@ObfuscatedName("at")
	@Export("modelIds")
	int[] modelIds;
	@ObfuscatedName("ag")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("aj")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("ah")
	@Export("useLocalPlayer")
	public boolean useLocalPlayer;

	public NpcOverrides(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
		this.useLocalPlayer = false;
		this.field2078 = var1;
		this.modelIds = var3;
		this.recolorTo = var4;
		this.retextureTo = var5;
		this.useLocalPlayer = var6;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-172821925"
	)
	static void method4378() {
		Tiles.Tiles_minPlane = 99;
		Tiles.Tiles_underlays = new short[4][104][104];
		Tiles.Tiles_overlays = new short[4][104][104];
		Frames.Tiles_shapes = new byte[4][104][104];
		GrandExchangeEvents.field5045 = new byte[4][104][104];
		MusicPatch.field3967 = new int[4][105][105];
		Tiles.Tiles_underlays2 = new byte[4][105][105];
		SpriteBufferProperties.field24 = new int[105][105];
		class1.Tiles_hue = new int[104];
		ClanChannel.Tiles_saturation = new int[104];
		class165.Tiles_lightness = new int[104];
		class450.Tiles_hueMultiplier = new int[104];
		Language.field5129 = new int[104];
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1984868359"
	)
	static void method4379() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();

			for (ObjectSound var2 = (ObjectSound)var1.method2741().last(); var2 != null; var2 = (ObjectSound)var1.method2741().previous()) {
				var2.method2286();
			}
		}

	}
}
