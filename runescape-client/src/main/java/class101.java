import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
public class class101 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	VorbisSample field1352;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lds;"
	)
	RawSound field1353;
	@ObfuscatedName("an")
	ReentrantLock field1354;

	@ObfuscatedSignature(
		descriptor = "(Lem;Lds;)V"
	)
	class101(VorbisSample var1, RawSound var2) {
		this.field1352 = var1;
		this.field1353 = var2;
		this.field1354 = new ReentrantLock();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "1122763603"
	)
	@Export("randomDatData2")
	public static byte[] randomDatData2() {
		byte[] var0 = new byte[24];

		try {
			JagexCache.JagexCache_randomDat.seek(0L);
			JagexCache.JagexCache_randomDat.readFully(var0);

			int var1;
			for (var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) {
			}

			if (var1 >= 24) {
				throw new IOException();
			}
		} catch (Exception var4) {
			for (int var2 = 0; var2 < 24; ++var2) {
				var0[var2] = -1;
			}
		}

		return var0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lre;Lre;I)F",
		garbageValue = "-1022923594"
	)
	public static final float method3009(class445 var0, class445 var1) {
		return var0.method8702(var1);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ldl;IIII)I",
		garbageValue = "1572018423"
	)
	static int method3011(WorldView var0, int var1, int var2, int var3) {
		if ((var0.tileSettings[var1][var2][var3] & 8) != 0) {
			return 0;
		} else {
			return var1 > 0 && (var0.tileSettings[1][var2][var3] & 2) != 0 ? var1 - 1 : var1;
		}
	}
}
