import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 121806885
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("au")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("ad")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-817613244"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0);
		if (var4 == null) {
			var4 = new ChatChannel();
			Messages.Messages_channels.put(var0, var4);
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3);
		Messages.Messages_hashTable.put(var5, (long)var5.count);
		Messages.Messages_queue.add(var5);
		Client.chatCycle = Client.cycleCntr;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-869643289"
	)
	static void method1176(int var0, String var1) {
		Login.Login_loadingText = var1;
		Login.Login_loadingPercent = var0;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(ILdy;ZI)I",
		garbageValue = "689864395"
	)
	static int method1175(int var0, Script var1, boolean var2) {
		return 2;
	}

	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "862570306"
	)
	static final void method1178(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0);
		var0 = 100 - var0;
		float var1 = (float)var0 / 200.0F + 0.5F;
		method1177((double)var1);
	}

	@ObfuscatedName("nd")
	static final void method1177(double var0) {
		Rasterizer3D.buildPalette(var0);
		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).setBrightness(var0);
		if (class541.worldMap != null) {
			class541.worldMap.method9736();
		}

		Actor.method2618();
		AbstractWorldMapIcon.clientPreferences.updateBrightness(var0);
	}
}
