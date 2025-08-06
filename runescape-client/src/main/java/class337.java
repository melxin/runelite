import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mq")
public class class337 {
	@ObfuscatedName("al")
	public static final List field3799;
	@ObfuscatedName("ab")
	public static ArrayList field3794;
	@ObfuscatedName("ac")
	public static LinkedList field3791;
	@ObfuscatedName("av")
	@Export("midiRequests")
	public static ArrayList midiRequests;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	public static AbstractArchive field3793;
	@ObfuscatedName("ap")
	static ArrayList field3790;
	@ObfuscatedName("am")
	static ArrayList field3795;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1172703077
	)
	@Export("musicPlayerStatus")
	static int musicPlayerStatus;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1187913633
	)
	static int field3797;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -410295905
	)
	static int field3798;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 2009020853
	)
	static int field3789;

	static {
		field3799 = new ArrayList();
		field3794 = null;
		field3791 = new LinkedList();
		midiRequests = new ArrayList(3);
		field3790 = new ArrayList(3);
		field3795 = new ArrayList();
		musicPlayerStatus = 0;
		field3797 = 0;
		field3798 = 0;
		field3789 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpx;Lpx;Lth;ZIB)V",
		garbageValue = "93"
	)
	static void method7129(AbstractArchive var0, AbstractArchive var1, GraphicsDefaults var2, boolean var3, int var4) {
		if (class482.clearLoginScreen) {
			if (var4 == 4) {
				DynamicObject.method1987(4);
			}

		} else {
			if (var4 == 0) {
				WorldMapDecoration.updateLoginStatusUsernameRemembered(var3);
			} else {
				DynamicObject.method1987(var4);
			}

			Rasterizer2D.Rasterizer2D_clear();
			byte[] var5 = var0.takeFileByNames("title.jpg", "");
			class372.leftTitleSprite = class177.readSpritePixelsFromBytes(var5);
			class524.rightTitleSprite = class372.leftTitleSprite.mirrorHorizontally();
			class449.method9087(var1, Client.worldProperties);
			Login.titleboxSprite = class484.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			Tile.titlebuttonSprite = class484.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			class163.field1854 = class484.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "");
			class132.field1588 = class484.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "");
			class484.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "");
			class36.runesSprite = WorldEntity.getFont(var1, "runes", "");
			Huffman.title_muteSprite = WorldEntity.getFont(var1, "title_mute", "");
			Interpreter.options_buttons_0Sprite = class484.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			FadeOutTask.field5182 = class484.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			AddRequestTask.options_buttons_2Sprite = class484.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			ClanChannel.field1888 = class484.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			class144.field1717 = Interpreter.options_buttons_0Sprite.subWidth;
			VarpDefinition.field1950 = Interpreter.options_buttons_0Sprite.subHeight;
			MidiPcmStream.loginScreenRunesAnimation = new LoginScreenAnimation(class36.runesSprite, var2.field5426);
			if (var3) {
				Login.Login_username = "";
				Login.Login_password = "";
				Login.field706 = new String[8];
				Login.field708 = 0;
			}

			class563.otpMedium = 0;
			SoundSystem.otp = "";
			Login.rememberUsername = true;
			Login.worldSelectOpen = false;
			if (FriendSystem.clientPreferences.isTitleMusicDisabled()) {
				class267.method6028(0, 0);
			} else {
				class267.method6028(0, 0);
				ArrayList var6 = new ArrayList();
				var6.add(new MidiRequest(MoveSpeed.field3199, "scape main", "", 255, false));
				class30.method486(var6, 0, 0, 0, 100, false);
			}

			class330.method7035();
			JagNetThread var7 = HorizontalAlignment.field2060;
			var7.method8447(false);
			class482.clearLoginScreen = true;
			Login.xPadding = (RestClientThreadFactory.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			class133.loginBoxCenter = Login.loginBoxX + 180;
			class372.leftTitleSprite.drawAt(Login.xPadding, 0);
			class524.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			class205.logoSprite.drawAt(Login.xPadding + 382 - class205.logoSprite.subWidth / 2, 18);
		}
	}
}
