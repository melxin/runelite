import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
public class class150 extends class149 {
	@ObfuscatedName("qv")
	@ObfuscatedGetter(
		intValue = -319975371
	)
	static int field1726;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1850390987
	)
	int field1724;
	@ObfuscatedName("ay")
	boolean field1723;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;)V"
	)
	class150(class152 var1) {
		this.this$0 = var1;
		this.field1724 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvy;B)V",
		garbageValue = "25"
	)
	void vmethod3702(Buffer var1) {
		this.field1724 = var1.readUnsignedShort();
		this.field1723 = var1.readUnsignedByte() == 1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "2011970201"
	)
	void vmethod3705(ClanSettings var1) {
		var1.method3560(this.field1724, this.field1723);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lpl;Lpl;Ltw;ZII)V",
		garbageValue = "1398879843"
	)
	static void method3489(AbstractArchive var0, AbstractArchive var1, GraphicsDefaults var2, boolean var3, int var4) {
		if (Login.clearLoginScreen) {
			if (var4 == 4) {
				ObjectComposition.method4206(4);
			}

		} else {
			if (var4 == 0) {
				MusicPatchNode2.updateLoginStatusUsernameRemembered(var3);
			} else {
				ObjectComposition.method4206(var4);
			}

			Rasterizer2D.Rasterizer2D_clear();
			byte[] var5 = var0.takeFileByNames("title.jpg", "");
			SoundCache.leftTitleSprite = class395.readSpritePixelsFromBytes(var5);
			class155.rightTitleSprite = SoundCache.leftTitleSprite.mirrorHorizontally();
			int var6 = Client.worldProperties;
			if ((var6 & class563.field5529.rsOrdinal()) != 0) {
				class87.logoSprite = ClanChannel.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "");
			} else if ((var6 & class563.field5550.rsOrdinal()) != 0) {
				class87.logoSprite = ClanChannel.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "");
			} else if ((var6 & class563.field5528.rsOrdinal()) != 0) {
				class87.logoSprite = ClanChannel.SpriteBuffer_getIndexedSpriteByName(var1, "logo_speedrunning", "");
			} else {
				class87.logoSprite = ClanChannel.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "");
			}

			Login.titleboxSprite = ClanChannel.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			Login.titlebuttonSprite = ClanChannel.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			Login.field946 = ClanChannel.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "");
			Login.field947 = ClanChannel.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "");
			ClanChannel.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "");
			Login.runesSprite = class282.getFont(var1, "runes", "");
			Login.title_muteSprite = class282.getFont(var1, "title_mute", "");
			WorldMapDecoration.options_buttons_0Sprite = ClanChannel.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			class157.field1774 = ClanChannel.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			class187.options_buttons_2Sprite = ClanChannel.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			SceneTilePaint.field2978 = ClanChannel.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			class241.field2658 = WorldMapDecoration.options_buttons_0Sprite.subWidth;
			class133.field1592 = WorldMapDecoration.options_buttons_0Sprite.subHeight;
			FloorDecoration.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite, var2.field5235);
			if (var3) {
				Login.Login_username = "";
				Login.Login_password = "";
				Login.field963 = new String[8];
				Login.field940 = 0;
			}

			Language.otpMedium = 0;
			Language.otp = "";
			Login.rememberUsername = true;
			Login.worldSelectOpen = false;
			if (!AbstractWorldMapIcon.clientPreferences.isTitleMusicDisabled()) {
				ArrayList var7 = new ArrayList();
				var7.add(new MidiRequest(EnumComposition.field2011, "scape main", "", 255, false));
				UserComparator3.method3219(var7, 0, 0, 0, 100, false);
			} else {
				class177.method3764(0, 0);
			}

			class47.method860();
			JagNetThread var8 = AsyncHttpResponse.field77;
			var8.method7744(false);
			Login.clearLoginScreen = true;
			Login.xPadding = (GameEngine.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			class73.loginBoxCenter = Login.loginBoxX + 180;
			SoundCache.leftTitleSprite.drawAt(Login.xPadding, 0);
			class155.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			class87.logoSprite.drawAt(Login.xPadding + 382 - class87.logoSprite.subWidth / 2, 18);
		}
	}
}
