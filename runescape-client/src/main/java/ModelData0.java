import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
@Implements("ModelData0")
public class ModelData0 {
	ModelData0() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Lja;",
		garbageValue = "7"
	)
	public static VarbitComposition method4806(int var0) {
		VarbitComposition var1 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class431.VarbitDefinition_archive.takeFile(14, var0);
			var1 = new VarbitComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			VarbitComposition.VarbitDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Lhb;",
		garbageValue = "-1674690556"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			AbstractArchive var3 = SequenceDefinition.SequenceDefinition_animationsArchive;
			AbstractArchive var4 = class466.SequenceDefinition_skeletonsArchive;
			boolean var5 = true;
			int[] var6 = var3.getGroupFileIds(var0);

			for (int var7 = 0; var7 < var6.length; ++var7) {
				byte[] var8 = var3.getFile(var0, var6[var7]);
				if (var8 == null) {
					var5 = false;
				} else {
					int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
					byte[] var10 = var4.getFile(var9, 0);
					if (var10 == null) {
						var5 = false;
					}
				}
			}

			Frames var2;
			if (!var5) {
				var2 = null;
			} else {
				try {
					var2 = new Frames(var3, var4, var0, false);
				} catch (Exception var12) {
					var2 = null;
				}
			}

			if (var2 != null) {
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var2, (long)var0);
			}

			return var2;
		}
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2138033295"
	)
	static void method4808() {
		Client.field512 = true;
		if (HttpRequestTask.varcs != null && HttpRequestTask.varcs.hasUnwrittenChanges()) {
			HttpRequestTask.varcs.write();
		}

		class92.method2637();
		ScriptFrame.method1230();
		if (class168.mouseRecorder != null) {
			class168.mouseRecorder.isRunning = false;
		}

		class168.mouseRecorder = null;
		Client.packetWriter.close();
		if (GameEngine.taskHandler != null) {
			try {
				GameEngine.taskHandler.close();
			} catch (Exception var2) {
			}
		}

		GameEngine.taskHandler = null;
		class4.clear();
		class240.method5249();
		Client.worldViewManager.clear();
		class420.worldMap = null;
		UserComparator3.method3347(0, 0);
		class153.method3619();
		Client.playingJingle = false;
		World.method1957();
		if (class328.pcmPlayer1 != null) {
			class328.pcmPlayer1.shutdown();
		}

		HitSplatDefinition.field2760.method7855();
		TaskHandler.method4916();
		if (class280.urlRequester != null) {
			class280.urlRequester.close();
		}

		class150.method3592();
		JagexCache.JagexCache_dat2File = null;
		JagexCache.JagexCache_idx255File = null;
		UserComparator4.JagexCache_idxFiles = null;
		class93.method2651();
		ReflectionCheck.masterDisk = null;
		Client.archiveLoaders.clear();
		Client.field692 = 0;
		HitSplatDefinition.field2760 = new JagNetThread();
		class280.urlRequester = new SecureUrlRequester(Client.client.https, 228);

		try {
			class30.method483("oldschool", class255.field2724, class438.field4820.name, 0, 23);
		} catch (IOException var1) {
			throw new RuntimeException(var1);
		}

		ReflectionCheck.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		GameEngine.taskHandler = new TaskHandler();
		Client.client.method544();
		Clock.method5078(class95.field1157);
		class360.updateGameState(0);
	}
}
