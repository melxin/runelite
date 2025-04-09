import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ic")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lvn;"
	)
	@Export("JagexCache_dat2File")
	public static AccessFile JagexCache_dat2File;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lvq;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[Lvq;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lvq;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;

	static {
		JagexCache_dat2File = null;
		JagexCache_idx255File = null;
		JagexCache_randomDat = null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lph;Lph;Ltl;ZIB)V",
		garbageValue = "-57"
	)
	static void method4808(AbstractArchive var0, AbstractArchive var1, GraphicsDefaults var2, boolean var3, int var4) {
		if (ItemContainer.clearLoginScreen) {
			if (var4 == 4) {
				class137.method3379(4);
			}

		} else {
			if (var4 == 0) {
				class563.updateLoginStatusUsernameRemembered(var3);
			} else {
				class137.method3379(var4);
			}

			Rasterizer2D.Rasterizer2D_clear();
			byte[] var5 = var0.takeFileByNames("title.jpg", "");
			SequenceDefinition.leftTitleSprite = class387.readSpritePixelsFromBytes(var5);
			FloorOverlayDefinition.rightTitleSprite = SequenceDefinition.leftTitleSprite.mirrorHorizontally();
			int var6 = Client.worldProperties;
			if ((var6 & class563.field5582.rsOrdinal()) != 0) {
				WorldMapDecorationType.logoSprite = UserComparator7.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "");
			} else if ((var6 & class563.field5575.rsOrdinal()) != 0) {
				WorldMapDecorationType.logoSprite = UserComparator7.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "");
			} else if ((var6 & class563.field5565.rsOrdinal()) != 0) {
				WorldMapDecorationType.logoSprite = UserComparator7.SpriteBuffer_getIndexedSpriteByName(var1, "logo_speedrunning", "");
			} else {
				WorldMapDecorationType.logoSprite = UserComparator7.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "");
			}

			ModeWhere.titleboxSprite = UserComparator7.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			class153.titlebuttonSprite = UserComparator7.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			MenuAction.field917 = UserComparator7.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "");
			WorldMapEvent.field3356 = UserComparator7.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "");
			UserComparator7.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "");
			Login.runesSprite = HttpRequestTask.getFont(var1, "runes", "");
			ClanChannelMember.title_muteSprite = HttpRequestTask.getFont(var1, "title_mute", "");
			class147.options_buttons_0Sprite = UserComparator7.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			class156.field1763 = UserComparator7.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			class279.options_buttons_2Sprite = UserComparator7.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			class76.field919 = UserComparator7.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			class138.field1645 = class147.options_buttons_0Sprite.subWidth;
			class95.field1174 = class147.options_buttons_0Sprite.subHeight;
			WorldMapLabelSize.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite, var2.field5257);
			if (var3) {
				Login.Login_username = "";
				Login.Login_password = "";
				Login.field933 = new String[8];
				Login.field940 = 0;
			}

			class137.otpMedium = 0;
			WorldMapIcon_1.otp = "";
			Login.rememberUsername = true;
			Login.worldSelectOpen = false;
			if (Renderable.clientPreferences.isTitleMusicDisabled()) {
				MenuAction.method2254(0, 0);
			} else {
				class532.method9742("scape main", 255);
			}

			class438.method8301();
			JagNetThread var7 = ClanSettings.field1791;
			var7.method7787(false);
			ItemContainer.clearLoginScreen = true;
			Login.xPadding = (GameEngine.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			class387.loginBoxCenter = Login.loginBoxX + 180;
			SequenceDefinition.leftTitleSprite.drawAt(Login.xPadding, 0);
			FloorOverlayDefinition.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			WorldMapDecorationType.logoSprite.drawAt(Login.xPadding + 382 - WorldMapDecorationType.logoSprite.subWidth / 2, 18);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-16"
	)
	public static void method4816(int var0, int var1, int var2, int var3) {
		if (class335.midiRequests.size() > 1 && class335.midiRequests.get(0) != null && ((MidiRequest)class335.midiRequests.get(0)).midiPcmStream.isReady() && class335.midiRequests.get(1) != null && ((MidiRequest)class335.midiRequests.get(1)).midiPcmStream.isReady()) {
			class335.musicPlayerStatus = var0;
			class335.field3692 = var1;
			class335.field3702 = var2;
			class335.field3693 = var3;
			class335.field3699.add(new SwapSongTask((SongTask)null));
			ArrayList var4 = new ArrayList();
			var4.add(new DelayFadeTask(new FadeInTask((SongTask)null, 1, false, class335.field3693), class335.field3702));
			var4.add(new DelayFadeTask(new FadeOutTask((SongTask)null, 0, false, class335.field3692), class335.musicPlayerStatus));
			class335.field3699.add(new ConcurrentMidiTask((SongTask)null, var4));
			if (class335.field3698.get(0) != null && class335.field3698.get(1) != null) {
				MidiRequest var5 = (MidiRequest)class335.field3698.get(0);
				class335.field3698.set(0, class335.midiRequests.get(1));
				class335.field3698.set(1, var5);
			}
		}

	}

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "38"
	)
	static final void method4818(int var0) {
		if (class232.widgetDefinition.loadInterface(var0)) {
			Widget[] var1 = class232.widgetDefinition.Widget_interfaceComponents[var0];

			for (int var2 = 0; var2 < var1.length; ++var2) {
				Widget var3 = var1[var2];
				if (var3 != null) {
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
				}
			}

		}
	}
}
