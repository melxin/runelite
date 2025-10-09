import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ln")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2132672407
	)
	@Export("screenX")
	int screenX;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1910029121
	)
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(
		descriptor = "(Lny;Lny;)V"
	)
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1;
		this.coord2 = var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2107309996"
	)
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Llb;",
		garbageValue = "-2110053677"
	)
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-59"
	)
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1234453253"
	)
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIS)Z",
		garbageValue = "-18369"
	)
	@Export("fitsScreen")
	boolean fitsScreen(int var1, int var2) {
		if (this.elementFitsScreen(var1, var2)) {
			return true;
		} else {
			return this.labelFitsScreen(var1, var2);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1150427841"
	)
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1284575750"
	)
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) {
			return false;
		} else {
			WorldMapElement var3 = LoginState.WorldMapElement_get(this.getElement());
			int var4 = this.getSubWidth();
			int var5 = this.getSubHeight();
			switch(var3.horizontalAlignment.value) {
			case 0:
				if (var1 < this.screenX || var1 >= var4 + this.screenX) {
					return false;
				}
				break;
			case 1:
				if (var1 <= this.screenX - var4 || var1 > this.screenX) {
					return false;
				}
				break;
			case 2:
				if (var1 < this.screenX - var4 / 2 || var1 > var4 / 2 + this.screenX) {
					return false;
				}
			}

			switch(var3.verticalAlignment.value) {
			case 0:
				if (var2 >= this.screenY && var2 < var5 + this.screenY) {
					break;
				}

				return false;
			case 1:
				if (var2 <= this.screenY - var5 || var2 > this.screenY) {
					return false;
				}
				break;
			case 2:
				if (var2 < this.screenY - var5 / 2 || var2 > var5 / 2 + this.screenY) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-2010221285"
	)
	@Export("labelFitsScreen")
	boolean labelFitsScreen(int var1, int var2) {
		WorldMapLabel var3 = this.getLabel();
		if (var3 == null) {
			return false;
		} else if (var1 >= this.screenX - var3.width / 2 && var1 <= var3.width / 2 + this.screenX) {
			return var2 >= this.screenY && var2 <= this.screenY + var3.height;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1216509476"
	)
	public static boolean method6904(int var0) {
		return (var0 >> 23 & 1) != 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "2048645634"
	)
	public static void method6885(int var0, int var1, int var2, int var3) {
		if (class338.midiRequests.size() > 1 && class338.midiRequests.get(0) != null && ((MidiRequest)class338.midiRequests.get(0)).midiPcmStream.isReady() && class338.midiRequests.get(1) != null && ((MidiRequest)class338.midiRequests.get(1)).midiPcmStream.isReady()) {
			class338.musicPlayerStatus = var0;
			class338.field3899 = var1;
			class338.field3896 = var2;
			class338.field3901 = var3;
			class338.field3897.add(new SwapSongTask((SongTask)null));
			ArrayList var4 = new ArrayList();
			var4.add(new DelayFadeTask(new FadeInTask((SongTask)null, 1, false, class338.field3901), class338.field3896));
			var4.add(new DelayFadeTask(new FadeOutTask((SongTask)null, 0, false, class338.field3899), class338.musicPlayerStatus));
			class338.field3897.add(new ConcurrentMidiTask((SongTask)null, var4));
			if (class338.field3891.get(0) != null && class338.field3891.get(1) != null) {
				MidiRequest var5 = (MidiRequest)class338.field3891.get(0);
				class338.field3891.set(0, class338.midiRequests.get(1));
				class338.field3891.set(1, var5);
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lok;IB)V",
		garbageValue = "-34"
	)
	static void method6902(Widget var0, int var1) {
		if (var0.type == 0 && var0.childIndex * -2066937045 > -1) {
			if (var1 > var0.field4195) {
				var0.field4195 = var1;
			}

			if (var1 < var0.field4228) {
				var0.field4228 = var1;
			}
		}

	}
}
