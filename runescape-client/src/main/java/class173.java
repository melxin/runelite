import java.io.IOException;
import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("gf")
public class class173 extends class151 {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = 4885358522093636575L
	)
	long field1934;
	@ObfuscatedName("aw")
	String field1933;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class154 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;)V"
	)
	class173(class154 var1) {
		this.this$0 = var1;
		this.field1934 = -1L;
		this.field1933 = null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "-2943315"
	)
	void vmethod4111(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			var1.array -= -290410379;
			this.field1934 = var1.readLong();
		}

		this.field1933 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgs;I)V",
		garbageValue = "2108880901"
	)
	void vmethod4112(ClanSettings var1) {
		var1.method3987(this.field1934, this.field1933);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;I)[F",
		garbageValue = "1656120730"
	)
	static float[] method4097(JSONObject var0, String var1) throws JSONException {
		float[] var2 = new float[4];

		try {
			JSONArray var3 = var0.getJSONArray(var1);
			var2[0] = (float)var3.optDouble(0, 0.0D);
			var2[1] = (float)var3.optDouble(1, 0.0D);
			var2[2] = (float)var3.optDouble(2, 1.0D);
			var2[3] = (float)var3.optDouble(3, 1.0D);
		} catch (JSONException var4) {
			var2[0] = 0.0F;
			var2[1] = 0.0F;
			var2[2] = 1.0F;
			var2[3] = 1.0F;
		}

		return var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([Lqc;II)Lqc;",
		garbageValue = "-1006641339"
	)
	@Export("findEnumerated")
	public static Enum findEnumerated(Enum[] var0, int var1) {
		Enum[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Enum var4 = var2[var3];
			if (var1 == var4.rsOrdinal()) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([[[IIIIB)V",
		garbageValue = "101"
	)
	static final void method4095(int[][][] var0, int var1, int var2, int var3) {
		int var4;
		for (var4 = 0; var4 < 8; ++var4) {
			for (int var5 = 0; var5 < 8; ++var5) {
				var0[var1][var4 + var2][var3 + var5] = 0;
			}
		}

		if (var2 > 0) {
			for (var4 = 1; var4 < 8; ++var4) {
				var0[var1][var2][var3 + var4] = var0[var1][var2 - 1][var3 + var4];
			}
		}

		if (var3 > 0) {
			for (var4 = 1; var4 < 8; ++var4) {
				var0[var1][var4 + var2][var3] = var0[var1][var4 + var2][var3 - 1];
			}
		}

		if (var2 > 0 && var0[var1][var2 - 1][var3] != 0) {
			var0[var1][var2][var3] = var0[var1][var2 - 1][var3];
		} else if (var3 > 0 && var0[var1][var2][var3 - 1] != 0) {
			var0[var1][var2][var3] = var0[var1][var2][var3 - 1];
		} else if (var2 > 0 && var3 > 0 && var0[var1][var2 - 1][var3 - 1] != 0) {
			var0[var1][var2][var3] = var0[var1][var2 - 1][var3 - 1];
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1382873766"
	)
	public static void method4098(int var0, int var1, int var2, int var3) {
		if (class339.midiRequests.size() > 1 && class339.midiRequests.get(0) != null && ((MidiRequest)class339.midiRequests.get(0)).midiPcmStream.isReady() && class339.midiRequests.get(1) != null && ((MidiRequest)class339.midiRequests.get(1)).midiPcmStream.isReady()) {
			LoginState.method791(var0, var1, var2, var3);
			class339.field3892.add(new SwapSongTask((SongTask)null));
			ArrayList var4 = new ArrayList();
			var4.add(new DelayFadeTask(new FadeInTask((SongTask)null, 1, false, class339.field3897), class339.field3898));
			var4.add(new DelayFadeTask(new FadeOutTask((SongTask)null, 0, false, class339.field3896), class339.musicPlayerStatus));
			class339.field3892.add(new ConcurrentMidiTask((SongTask)null, var4));
			if (class339.field3889.get(0) != null && class339.field3889.get(1) != null) {
				MidiRequest var5 = (MidiRequest)class339.field3889.get(0);
				class339.field3889.set(0, class339.midiRequests.get(1));
				class339.field3889.set(1, var5);
			}
		}

	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1574950540"
	)
	static void method4099() {
		if (class516.varcs != null && class516.varcs.hasUnwrittenChanges()) {
			class516.varcs.write();
		}

		Login.method1909();
		PlayerComposition.method7601();
		if (class398.mouseRecorder != null) {
			class398.mouseRecorder.isRunning = false;
		}

		class398.mouseRecorder = null;
		Client.packetWriter.close();
		if (UserComparator4.taskHandler != null) {
			try {
				UserComparator4.taskHandler.close();
			} catch (Exception var2) {
			}
		}

		UserComparator4.taskHandler = null;
		FontName.clear();
		MouseHandler.method726();
		Client.worldViewManager.clear();
		Client.projectiles.clear();
		DynamicObject.worldMap = null;
		class257.method5884(0, 0);
		class159.method3892();
		Client.playingJingle = false;
		WorldMapSection0.method6773();
		if (class70.pcmPlayer1 != null) {
			class70.pcmPlayer1.shutdown();
		}

		WorldMapSectionType.field3418.method8454();
		class137.method3667();
		if (class114.urlRequester != null) {
			class114.urlRequester.close();
		}

		DevicePcmPlayerProvider.method326();
		JagexCache.JagexCache_dat2File = null;
		JagexCache.JagexCache_idx255File = null;
		JagexCache.JagexCache_idxFiles = null;
		HorizontalAlignment.method4316();
		Actor.masterDisk = null;
		Client.archiveLoaders.clear();
		Client.field604 = 0;
		WorldMapSectionType.field3418 = new JagNetThread();
		class114.urlRequester = new SecureUrlRequester(class521.client.https, 233);

		try {
			class27.method412("oldschool", WorldMapElement.field1997, class488.field5353.name, 0, 25);
		} catch (IOException var1) {
			throw new RuntimeException(var1);
		}

		Actor.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 750000);
		UserComparator4.taskHandler = new TaskHandler();
		class521.client.method658();
		class68.method2161(class70.field969);
		UrlRequest.updateGameState(0);
	}
}
