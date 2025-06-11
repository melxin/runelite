import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pg")
public class class404 extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	Archive field4750;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 568113989
	)
	int field4747;
	@ObfuscatedName("an")
	byte field4748;

	class404() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;IIB)Ltg;",
		garbageValue = "-26"
	)
	public static AbstractSocket method8066(Socket var0, int var1, int var2) throws IOException {
		return new BufferedNetSocket(var0, var1, var2);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lps;Ljava/lang/String;Ljava/lang/String;I)Lwy;",
		garbageValue = "-1867353056"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			return WorldMapRegion.method6429(var0, var3, var4);
		}
	}

	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lcz;",
		garbageValue = "-598932649"
	)
	@Export("openInterface")
	static final InterfaceParent openInterface(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent();
		var3.group = var1;
		var3.type = var2;
		Client.interfaceParents.put(var3, (long)var0);
		KeyHandler.method373(var1);
		Widget var4 = ClientPreferences.widgetDefinition.method7286(var0);
		ScriptFrame.invalidateWidget(var4);
		if (Client.meslayerContinueWidget != null) {
			ScriptFrame.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		ClanSettings.revalidateWidgetScroll(ClientPreferences.widgetDefinition.Widget_interfaceComponents[var0 >> 16], var4, false);
		class182.runWidgetOnLoadListener(var1);
		if (Client.rootInterface != -1) {
			UserComparator10.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3;
	}
}
