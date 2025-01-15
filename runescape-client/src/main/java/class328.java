import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mq")
public final class class328 {
	@ObfuscatedName("az")
	static final HashMap field3601;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 656922949
	)
	public static int field3605;
	@ObfuscatedName("tk")
	@ObfuscatedSignature(
		descriptor = "Lbq;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("vq")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;

	static {
		field3601 = new HashMap();
		java.util.Calendar.getInstance(method6644("Europe/London"));
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/util/TimeZone;",
		garbageValue = "1996536510"
	)
	static TimeZone method6644(String var0) {
		synchronized(field3601) {
			TimeZone var2 = (TimeZone)field3601.get(var0);
			if (var2 == null) {
				var2 = TimeZone.getTimeZone(var0);
				field3601.put(var0, var2);
			}

			return var2;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Lct;",
		garbageValue = "-61851399"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0);
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-571040366"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) {
			byte var2 = 4;
			int var3 = var2 + 6;
			int var4 = var2 + 6;
			int var5 = HealthBarUpdate.fontPlain12.lineWidth(var0, 250);
			int var6 = HealthBarUpdate.fontPlain12.lineCount(var0, 250) * 13;
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var6 + var2, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var2 + var2 + var5, var6 + var2 + var2, 16777215);
			HealthBarUpdate.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
			int var7 = var3 - var2;
			int var8 = var4 - var2;
			int var9 = var2 + var5 + var2;
			int var10 = var2 + var6 + var2;

			for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) {
				if (Client.rootWidgetWidths[var11] + Client.rootWidgetXs[var11] > var7 && Client.rootWidgetXs[var11] < var7 + var9 && Client.rootWidgetHeights[var11] + Client.rootWidgetYs[var11] > var8 && Client.rootWidgetYs[var11] < var8 + var10) {
					Client.validRootWidgets[var11] = true;
				}
			}

			if (var1) {
				class6.rasterProvider.drawFull(0, 0);
			} else {
				FadeOutTask.method8847(var3, var4, var5, var6);
			}

		}
	}

	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-5805"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		HttpContentType.method9544();
		if (WorldMapLabelSize.friendsChat != null) {
			WorldMapLabelSize.friendsChat.invalidateIgnoreds();
		}

	}
}
