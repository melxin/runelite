import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
public class class63 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("KitDefinition_modelsArchive")
	public static AbstractArchive KitDefinition_modelsArchive;
	@ObfuscatedName("at")
	@Export("ByteArrayPool_alternativeSizes")
	public static int[] ByteArrayPool_alternativeSizes;

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lnz;I)V",
		garbageValue = "-371964457"
	)
	public static void method2105(class341 var0) {
		if (!class335.field3695.contains(var0)) {
			class335.field3695.add(var0);
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljg;IIIII)Lre;",
		garbageValue = "516505048"
	)
	public static final class445 method2104(Scene var0, int var1, int var2, int var3, int var4) {
		float var5 = 1.0E-5F;
		class217.method4695(var0.field2759, var0.field2760, var0.field2761, var0.field2762);
		class445 var6 = class47.method1781(0.0F, 1.0F, 0.0F);
		float var7 = class101.method3009(var6, ViewportMouse.field2951);
		if (Math.abs(var7) < 1.0E-5F) {
			var6.method8687();
			return null;
		} else {
			class445 var8 = class47.method1781((float)var2, (float)var3, (float)var4);
			class445 var9 = class47.method1781(var8.field4967, var8.field4971 - (float)var1, var8.field4969);
			float var10 = -class101.method3009(var6, var9) / var7;
			var6.method8687();
			if (var10 < 0.0F) {
				var9.method8687();
				var8.method8687();
				return null;
			} else {
				class445 var12 = ViewportMouse.field2951;
				class445 var13 = SecureRandomCallable.method2080(var12);
				var13.method8699(var10);
				class445 var15 = SecureRandomCallable.method2080(var8);
				var15.method8725(var13);
				var13.method8687();
				var9.method8687();
				var8.method8687();
				return var15;
			}
		}
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1062153465"
	)
	static void method2101() {
		Client.packetWriter.clearBuffer();
		Client.packetWriter.field1272 = 0;
		Client.packetWriter.packetBuffer.offset = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1262 = null;
		Client.packetWriter.field1266 = null;
		Client.packetWriter.field1276 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1270 = 0;
		Client.rebootTimer = 0;
		Client.menu.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		Client.minimapState = 0;
		Client.destinationX = 0;
		Sound.topLevelWorldView.method2531();
		ItemContainer.itemContainers = new NodeHashTable(32);
		HealthBarConfig.updateGameState(30);

		for (int var0 = 0; var0 < 100; ++var0) {
			Client.validRootWidgets[var0] = true;
		}

		UserComparator10.method3440();
	}

	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-292490960"
	)
	static void method2103() {
		if (Client.oculusOrbState == 1) {
			Client.field478 = true;
		}

	}

	@ObfuscatedName("pc")
	@ObfuscatedSignature(
		descriptor = "(II)Lvu;",
		garbageValue = "-1387886487"
	)
	static DbTable method2106(int var0) {
		DbTable var1 = (DbTable)Client.archive11.get((long)var0);
		if (var1 == null) {
			var1 = new DbTable(AbstractByteArrayCopier.field3837, var0);
		}

		return var1;
	}
}
