import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
@Implements("World")
public class World {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1081999575
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 269994903
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("av")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("au")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1337435201
	)
	@Export("id")
	int id;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -771152021
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1530172407
	)
	@Export("population")
	int population;
	@ObfuscatedName("ar")
	@Export("host")
	String host;
	@ObfuscatedName("as")
	@Export("activity")
	String activity;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1358489909
	)
	@Export("location")
	int location;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -170214931
	)
	@Export("index")
	int index;
	@ObfuscatedName("ap")
	String field822;

	static {
		World_count = 0;
		World_listCount = 0;
		World_sortOption2 = new int[]{1, 1, 1, 1};
		World_sortOption1 = new int[]{0, 1, 2, 3};
	}

	World() {
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "258167913"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (class552.field5437.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1098907175"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (class552.field5440.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "3"
	)
	boolean method1914() {
		return (class552.field5425.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-537639781"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (class552.field5426.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-723015286"
	)
	boolean method1896() {
		return (class552.field5449.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1266629186"
	)
	boolean method1918() {
		return (class552.field5424.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "200536242"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (class552.field5444.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1052839029"
	)
	boolean method1878() {
		return (class552.field5454.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-22"
	)
	boolean method1869() {
		return (class552.field5432.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1592160502"
	)
	boolean method1892() {
		return (class552.field5451.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BI)Lvr;",
		garbageValue = "622862629"
	)
	@Export("readSpritePixelsFromBytes")
	public static final SpritePixels readSpritePixelsFromBytes(byte[] var0) {
		BufferedImage var1 = null;

		try {
			Class var2 = ImageIO.class;
			synchronized(ImageIO.class) {
				var1 = ImageIO.read(new ByteArrayInputStream(var0));
			}

			if (var1 != null) {
				int var6 = var1.getWidth();
				int var7 = var1.getHeight();
				int[] var4 = new int[var6 * var7];
				PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var6, var7, var4, 0, var6);
				var5.grabPixels();
				return new SpritePixels(var4, var6, var7);
			}
		} catch (IOException var9) {
		} catch (InterruptedException var10) {
		}

		return new SpritePixels(0, 0);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(CLpw;B)I",
		garbageValue = "101"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var2 = (var0 << 4) + 1;
		}

		if (var0 == 241 && var1 == Language.Language_ES) {
			var2 = 1762;
		}

		return var2;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)V",
		garbageValue = "31531"
	)
	public static void method1931(int var0, int var1, int var2, int var3) {
		if (class333.musicSongs.size() > 1 && class333.musicSongs.get(0) != null && ((MusicSong)class333.musicSongs.get(0)).midiPcmStream.isReady() && class333.musicSongs.get(1) != null && ((MusicSong)class333.musicSongs.get(1)).midiPcmStream.isReady()) {
			StructComposition.method4069(var0, var1, var2, var3);
			class333.field3627.add(new SwapSongTask((SongTask)null));
			ArrayList var4 = new ArrayList();
			var4.add(new DelayFadeTask(new FadeInTask((SongTask)null, 1, false, class333.field3632), class333.field3622));
			var4.add(new DelayFadeTask(new FadeOutTask((SongTask)null, 0, false, class333.field3630), class333.musicPlayerStatus));
			class333.field3627.add(new ConcurrentMidiTask((SongTask)null, var4));
			if (class333.field3626.get(0) != null && class333.field3626.get(1) != null) {
				MusicSong var5 = (MusicSong)class333.field3626.get(0);
				class333.field3626.set(0, class333.musicSongs.get(1));
				class333.field3626.set(1, var5);
			}
		}

	}

	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "141533316"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (class379.widgetDefinition.loadInterface(var0)) {
			class520.runComponentCloseListeners(class379.widgetDefinition.Widget_interfaceComponents[var0], var1);
		}
	}
}
