import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kx")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 864766503
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1509856945
	)
	@Export("element")
	int element;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -2105074555
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -198317875
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lnp;Lnp;ILle;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2);
		this.objectDefId = var3;
		this.region = var4;
		this.init();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("init")
	void init() {
		this.element = HealthBarConfig.getObjectDefinition(this.objectDefId).transform().mapIconId;
		this.label = this.region.createMapLabel(InvDefinition.WorldMapElement_get(this.element));
		WorldMapElement var1 = InvDefinition.WorldMapElement_get(this.getElement());
		SpritePixels var2 = var1.getSpriteBool(false);
		if (var2 != null) {
			this.subWidth = var2.subWidth;
			this.subHeight = var2.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2005636344"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Llp;",
		garbageValue = "111016802"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-963913416"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-341446402"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/Date;",
		garbageValue = "-76"
	)
	static Date method6196() throws ParseException {
		SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
		var0.setLenient(false);
		StringBuilder var1 = new StringBuilder();
		String[] var2 = Login.field757;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			String var4 = var2[var3];
			if (var4 == null) {
				class113.method3292("Date not valid.", "Please ensure all characters are populated.", "");
				return null;
			}

			var1.append(var4);
		}

		var1.append("12");
		return var0.parse(var1.toString());
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([J[Ljava/lang/Object;III)V",
		garbageValue = "-301953778"
	)
	public static void method6195(long[] var0, Object[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			long var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			Object var8 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var8;
			int var9 = var6 == Long.MAX_VALUE ? 0 : 1;

			for (int var10 = var2; var10 < var3; ++var10) {
				if (var0[var10] < var6 + (long)(var10 & var9)) {
					long var11 = var0[var10];
					var0[var10] = var0[var5];
					var0[var5] = var11;
					Object var13 = var1[var10];
					var1[var10] = var1[var5];
					var1[var5++] = var13;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var8;
			method6195(var0, var1, var2, var5 - 1);
			method6195(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-39130042"
	)
	static void method6192() {
		Iterator var0 = class335.midiRequests.iterator();

		while (var0.hasNext()) {
			MidiRequest var1 = (MidiRequest)var0.next();
			if (var1 != null) {
				var1.midiPcmStream.clear();
				var1.midiPcmStream.method6981();
				var1.midiPcmStream.setPcmStreamVolume(0);
				var1.midiPcmStream.field3739 = 0;
				GameEngine.method578(var1.musicTrackGroupId, var1.musicTrackFileId);
			}
		}

		class335.midiRequests.clear();
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1785959251"
	)
	static int method6194() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			int var0 = 0;

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) {
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount;
			}

			return var0 * 10000 / Client.field309;
		} else {
			return 10000;
		}
	}

	@ObfuscatedName("pb")
	@ObfuscatedSignature(
		descriptor = "(Lbc;I)V",
		garbageValue = "-447441409"
	)
	@Export("updateLoginState")
	static void updateLoginState(LoginState var0) {
		if (class172.loginState != var0) {
			class172.loginState = var0;
		}
	}
}
