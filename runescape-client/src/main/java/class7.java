import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
public class class7 {
	@ObfuscatedName("ay")
	@Export("cacheDir")
	static File cacheDir;
	@ObfuscatedName("lq")
	@ObfuscatedGetter(
		intValue = 767589895
	)
	static int field26;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lve;"
	)
	final Buffer field25;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	final class3 field19;
	@ObfuscatedName("ae")
	ExecutorService field21;
	@ObfuscatedName("af")
	Future field23;

	@ObfuscatedSignature(
		descriptor = "(Lve;Laf;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field21 = Executors.newSingleThreadExecutor();
		this.field25 = var1;
		this.field19 = var2;
		this.method49();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "15"
	)
	public boolean method45() {
		return this.field23.isDone();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-487917568"
	)
	public void method54() {
		this.field21.shutdown();
		this.field21 = null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Lve;",
		garbageValue = "75"
	)
	public Buffer method48() {
		try {
			return (Buffer)this.field23.get();
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1494220503"
	)
	void method49() {
		this.field23 = this.field21.submit(new class1(this, this.field25, this.field19));
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ldt;IIB)V",
		garbageValue = "-31"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args;
		Script var4;
		if (class145.isWorldMapEvent(var0.type)) {
			class72.worldMapEvent = (WorldMapEvent)var3[0];
			WorldMapElement var6 = ArchiveDiskAction.WorldMapElement_get(class72.worldMapEvent.mapElement);
			var4 = class162.getWorldMapScript(var0.type, var6.objectId, var6.category);
		} else {
			int var5 = (Integer)var3[0];
			var4 = PacketWriter.getScript(var5);
		}

		if (var4 != null) {
			HealthBarUpdate.runScriptLogic(var0, var4, var1, var2);
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "20"
	)
	@Export("ByteArrayPool_release")
	public static void ByteArrayPool_release(byte[] var0) {
		synchronized(ByteArrayPool.field5056) {
			if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field5061) {
				ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0;
			} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field5063) {
				ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0;
			} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field5060) {
				ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0;
			} else if (var0.length == 30000 && ByteArrayPool.field5059 < ByteArrayPool.field5064) {
				ByteArrayPool.field5068[++ByteArrayPool.field5059 - 1] = var0;
			} else {
				if (class240.ByteArrayPool_arrays != null) {
					for (int var2 = 0; var2 < WorldEntityCoord.ByteArrayPool_alternativeSizes.length; ++var2) {
						if (var0.length == WorldEntityCoord.ByteArrayPool_alternativeSizes[var2] && class149.ByteArrayPool_altSizeArrayCounts[var2] < class240.ByteArrayPool_arrays[var2].length) {
							class240.ByteArrayPool_arrays[var2][class149.ByteArrayPool_altSizeArrayCounts[var2]++] = var0;
							return;
						}
					}
				}

			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)[Lkw;",
		garbageValue = "126"
	)
	public static MoveSpeed[] method47() {
		return new MoveSpeed[]{MoveSpeed.field3127, MoveSpeed.field3130, MoveSpeed.field3129, MoveSpeed.field3132, MoveSpeed.field3125, MoveSpeed.field3128, MoveSpeed.field3133, MoveSpeed.field3124, MoveSpeed.field3126};
	}
}
