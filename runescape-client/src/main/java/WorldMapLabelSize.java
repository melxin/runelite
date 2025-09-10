import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lf")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("ar")
	@Export("osName")
	static String osName;
	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	static Archive field3302;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 380295655
	)
	final int field3300;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1695101721
	)
	final int field3301;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 372524171
	)
	final int field3304;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(0, 0, 4);
		WorldMapLabelSize_medium = new WorldMapLabelSize(2, 1, 2);
		WorldMapLabelSize_large = new WorldMapLabelSize(1, 2, 0);
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field3300 = var1;
		this.field3301 = var2;
		this.field3304 = var3;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(FI)Z",
		garbageValue = "2025845268"
	)
	boolean method6364(float var1) {
		return var1 >= (float)this.field3304;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[Llf;",
		garbageValue = "-1417461611"
	)
	static WorldMapLabelSize[] method6375() {
		return new WorldMapLabelSize[]{WorldMapLabelSize_medium, WorldMapLabelSize_large, WorldMapLabelSize_small};
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Llf;",
		garbageValue = "-57"
	)
	static WorldMapLabelSize method6366(int var0) {
		WorldMapLabelSize[] var1 = method6375();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			WorldMapLabelSize var3 = var1[var2];
			if (var0 == var3.field3301) {
				return var3;
			}
		}

		return null;
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "69"
	)
	static final void method6372(boolean var0) {
		UserComparator5.method3557();
		++Client.packetWriter.pendingWrites;
		if (Client.packetWriter.pendingWrites >= 50 || var0) {
			Client.packetWriter.pendingWrites = 0;
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) {
				PacketBufferNode var1 = UserComparator6.getPacketBufferNode(ClientPacket.NO_TIMEOUT, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var1);

				try {
					Client.packetWriter.flush();
				} catch (IOException var3) {
					Client.hadNetworkError = true;
				}
			}

		}
	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIII)I",
		garbageValue = "1342694339"
	)
	static final int method6373(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
		return class423.insertMenuItem(var0, var1, var2, var3, var4, var5, var6, false, -1);
	}

	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-857880315"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (UrlRequester.widgetDefinition.loadInterface(var0)) {
			class293.updateInterface(UrlRequester.widgetDefinition.Widget_interfaceComponents[var0], 0, UrlRequester.widgetDefinition.Widget_interfaceComponents[var0].length - 1, -1, -1, var1, var2, var3, var4, var5, var6);
		}
	}

	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "(Loi;I)Ljava/lang/String;",
		garbageValue = "-1701904132"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (class537.Widget_unpackTargetMask(DirectByteArrayCopier.getWidgetFlags(var0)) == 0) {
			return null;
		} else {
			return var0.spellActionName != null && !var0.spellActionName.trim().isEmpty() ? var0.spellActionName : null;
		}
	}
}
