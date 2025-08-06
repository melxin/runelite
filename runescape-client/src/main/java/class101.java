import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
public class class101 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	VorbisSample field1363;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	RawSound field1362;
	@ObfuscatedName("ac")
	ReentrantLock field1365;

	@ObfuscatedSignature(
		descriptor = "(Lek;Ldg;)V"
	)
	class101(VorbisSample var1, RawSound var2) {
		this.field1363 = var1;
		this.field1362 = var2;
		this.field1365 = new ReentrantLock();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1860640761"
	)
	public static int method3102(int var0) {
		return var0 >>> 12;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ltn;IIIII)V",
		garbageValue = "154776791"
	)
	public static void method3098(DynamicArray var0, int var1, int var2, int var3, int var4) {
		WorldMapData_1.method6678(var0, class570.field5721);
		if (var3 < 0) {
			var3 = 0;
		}

		int var5 = var3 + var4;
		if (var4 < 0 || var5 < 0 || var5 > var0.method10351()) {
			var5 = var0.method10351();
		}

		int[] var6 = var0.method10348();
		int var7 = var1;

		for (int var8 = var3; var8 < var5; ++var8) {
			var6[var8] = var7;
			var7 += var2;
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ltn;Ltn;I)V",
		garbageValue = "1578119241"
	)
	public static void method3100(DynamicArray var0, DynamicArray var1) {
		if (var0 != null && var0.method10351() > 1) {
			class150.method3792(var0, (class570)null, true);
			if (var1 != null) {
				class150.method3792(var1, (class570)null, true);
			}

			int var2 = var0.method10351();
			if (var1 != null && var1.method10351() < var2) {
				throw new RuntimeException();
			} else {
				if (var0.field5399 == class570.field5721) {
					if (var1 == null) {
						class446.method9011(var0.method10348(), class516.field5408, 0, var2 - 1);
					} else if (class570.field5721 == var1.field5399) {
						class446.method9011(var0.method10348(), var1.method10348(), 0, var2 - 1);
					} else if (class570.field5724 == var1.field5399) {
						class279.method6302(var0.method10348(), var1.method10377(), 0, var2 - 1);
					} else {
						Bounds.method8984(var0.method10348(), var1.method10393(), 0, var2 - 1);
					}
				} else if (var0.field5399 == class570.field5724) {
					if (var1 == null) {
						Arrays.sort(var0.method10377(), 0, var2);
					} else if (class570.field5721 == var1.field5399) {
						class164.method3995(var0.method10377(), var1.method10348(), 0, var2 - 1);
					} else if (class570.field5724 == var1.field5399) {
						class57.method2020(var0.method10377(), var1.method10377(), 0, var2 - 1);
					} else {
						class330.method7037(var0.method10377(), var1.method10393(), 0, var2 - 1);
					}
				} else {
					if (var0.field5399 != class570.field5718) {
						throw new RuntimeException();
					}

					if (var1 == null) {
						Arrays.sort(var0.method10393(), 0, var2);
					} else if (class570.field5721 == var1.field5399) {
						UrlRequester.quicksortStringsWithCorrespondingIntegers((String[])((String[])var0.method10393()), var1.method10348(), 0, var2 - 1);
					} else if (class570.field5724 == var1.field5399) {
						WidgetDefinition.method7473((String[])((String[])var0.method10393()), var1.method10377(), 0, var2 - 1);
					} else {
						class571.method11083((String[])((String[])var0.method10393()), var1.method10393(), 0, var2 - 1);
					}
				}

			}
		}
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "20"
	)
	static void method3101() {
		if (Client.packetWriter != null && Client.packetWriter.isaacCipher != null) {
			PacketBufferNode var0 = class291.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
			var0.packetBuffer.writeByte(class31.getWindowedMode());
			var0.packetBuffer.writeShort(RestClientThreadFactory.canvasWidth);
			var0.packetBuffer.writeShort(GameEngine.canvasHeight);
			Client.packetWriter.addNode(var0);
		}
	}

	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "82"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var2 = new short[16];
		int var3 = 0;

		for (int var4 = 0; var4 < class142.ItemDefinition_fileCount; ++var4) {
			ItemComposition var9 = ObjectComposition.ItemDefinition_get(var4);
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) {
				if (var3 >= 250) {
					ArchiveDiskActionHandler.foundItemIdCount = -1;
					class157.foundItemIds = null;
					return;
				}

				if (var3 >= var2.length) {
					short[] var6 = new short[var2.length * 2];

					for (int var7 = 0; var7 < var3; ++var7) {
						var6[var7] = var2[var7];
					}

					var2 = var6;
				}

				var2[var3++] = (short)var4;
			}
		}

		class157.foundItemIds = var2;
		class238.foundItemIndex = 0;
		ArchiveDiskActionHandler.foundItemIdCount = var3;
		String[] var8 = new String[ArchiveDiskActionHandler.foundItemIdCount];

		for (int var5 = 0; var5 < ArchiveDiskActionHandler.foundItemIdCount; ++var5) {
			var8[var5] = ObjectComposition.ItemDefinition_get(var2[var5]).name;
		}

		AsyncRestClient.method174(var8, class157.foundItemIds);
	}
}
