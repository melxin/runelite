import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mn")
@Implements("ClientPacket")
public class ClientPacket implements class326 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPLOC3;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPLOCT;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPWORLDENTITY3;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPOBJ4;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket MOUSE_MOVE;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket RESUME_PAUSEBUTTON;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPOBJ5;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket MUSIC_PLAYING;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket CLICK_WORLD_MAP;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket IF_BUTTONX;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket MINIMAP_CLICK;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket EVENT_MOUSE_CLICK_V2;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket CLOSE_MODAL;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket LOGIN_TIMINGS;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket CLAN_SETTINGS_FULL_REQUEST;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPPLAYER2;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPOBJ1;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket BUG_REPORT;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPOBJ3;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket CLAN_SETTINGS_SET_MUTED_FROM_CHANNEL;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket FRIEND_CHAT_SETRANK;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPOBJE;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPOBJT;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPPLAYERU;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket IF_BUTTONT;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPNPC4;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket MESSAGE_PUBLIC;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPWORLDENTITY1;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket EVENT_WINDOW_SETTING;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPNPC5;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPPLAYERT;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPWORLDENTITYT;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPOBJ2;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPWORLDENTITY5;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket MOUSE_WHEEL;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	static final ClientPacket field3575;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket EVENT_KEYBOARD;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket EVENT_APPLET_FOCUS;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	static final ClientPacket field3578;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPOBJU;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket DOCHEAT;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPNPC2;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPPLAYER8;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPPLAYER5;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket CHAT_SETFILTER;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	static final ClientPacket field3585;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket RESUME_STRINGDIALOG;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket MAP_BUILD_COMPLETE;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket EVENT_CAMERA_POSITION;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPPLAYER7;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPPLAYER1;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket RESUME_OBJDIALOG;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket FRIEND_CHAT_JOIN_LEAVE;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPNPC1;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket CHAT_SENDABUSEREPORT;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPWORLDENTITY2;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPLOC5;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPNPCT;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPLOC4;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket FRIEND_ADDUSER;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPWORLDENTITYU;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPPLAYER3;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket CLAN_SETTINGS_ADD_BANNED_FROM_CHANNEL;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket UPDATE_PLAYER_MODEL;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket CLAN_CHANNEL_KICK_USER;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket CHAT_SENDPRIVATE;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket DETECT_MODIFIED_CLIENT;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket IGNORE_DELUSER;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket CLAN_KICKUSER;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket SET_HEADING;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	static final ClientPacket field3610;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket FREECAM_EXIT;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	static final ClientPacket field3540;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPLOCU;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPPLAYER4;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket WIDGET_TYPE;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket PING_STATISTICS;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket IGNORE_LIST_ADD;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPNPCE;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket REFLECTION_CHECK_REPLY;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket IF_CRMVIEW;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket TELEPORT;
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPNPCU;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket FRIEND_DELUSER;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket CLAN_CHANNEL_FULL_REQUEST;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket RESUME_NAMEDIALOG;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPWORLDENTITY4;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket RESUME_COUNTDIALOG;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPWORLDENTITYE;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPLOCE;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket MOVE_GAMECLICK;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPPLAYER6;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket EVENT_MOUSE_CLICK;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPNPC3;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPHELDD;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket IF_RUNSCRIPT;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket EVENT_MOUSE_IDLE;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPLOC1;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket OPLOC2;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket NO_TIMEOUT;
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ClientPacket IF_SUBOP;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = 1056112779
	)
	@Export("id")
	final int id;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -675787743
	)
	@Export("length")
	final int length;

	static {
		OPLOC3 = new ClientPacket(0, 7);
		OPLOCT = new ClientPacket(1, 15);
		OPWORLDENTITY3 = new ClientPacket(2, 3);
		OPOBJ4 = new ClientPacket(3, 7);
		MOUSE_MOVE = new ClientPacket(4, -1);
		RESUME_PAUSEBUTTON = new ClientPacket(5, 6);
		OPOBJ5 = new ClientPacket(6, 7);
		MUSIC_PLAYING = new ClientPacket(7, 4);
		CLICK_WORLD_MAP = new ClientPacket(8, 4);
		IF_BUTTONX = new ClientPacket(9, 9);
		MINIMAP_CLICK = new ClientPacket(10, -1);
		EVENT_MOUSE_CLICK_V2 = new ClientPacket(11, 6);
		CLOSE_MODAL = new ClientPacket(12, 0);
		LOGIN_TIMINGS = new ClientPacket(13, -1);
		CLAN_SETTINGS_FULL_REQUEST = new ClientPacket(14, 1);
		OPPLAYER2 = new ClientPacket(15, 3);
		OPOBJ1 = new ClientPacket(16, 7);
		BUG_REPORT = new ClientPacket(17, -2);
		OPOBJ3 = new ClientPacket(18, 7);
		CLAN_SETTINGS_SET_MUTED_FROM_CHANNEL = new ClientPacket(19, -1);
		FRIEND_CHAT_SETRANK = new ClientPacket(20, -1);
		OPOBJE = new ClientPacket(21, 6);
		OPOBJT = new ClientPacket(22, 15);
		OPPLAYERU = new ClientPacket(23, 11);
		IF_BUTTONT = new ClientPacket(24, 16);
		OPNPC4 = new ClientPacket(25, 3);
		MESSAGE_PUBLIC = new ClientPacket(26, -1);
		OPWORLDENTITY1 = new ClientPacket(27, 3);
		EVENT_WINDOW_SETTING = new ClientPacket(28, 5);
		OPNPC5 = new ClientPacket(29, 3);
		OPPLAYERT = new ClientPacket(30, 11);
		OPWORLDENTITYT = new ClientPacket(31, 11);
		OPOBJ2 = new ClientPacket(32, 7);
		OPWORLDENTITY5 = new ClientPacket(33, 3);
		MOUSE_WHEEL = new ClientPacket(34, 2);
		field3575 = new ClientPacket(35, 1);
		EVENT_KEYBOARD = new ClientPacket(36, -2);
		EVENT_APPLET_FOCUS = new ClientPacket(37, 1);
		field3578 = new ClientPacket(38, -1);
		OPOBJU = new ClientPacket(39, 15);
		DOCHEAT = new ClientPacket(40, -1);
		OPNPC2 = new ClientPacket(41, 3);
		OPPLAYER8 = new ClientPacket(42, 3);
		OPPLAYER5 = new ClientPacket(43, 3);
		CHAT_SETFILTER = new ClientPacket(44, 3);
		field3585 = new ClientPacket(45, 7);
		RESUME_STRINGDIALOG = new ClientPacket(46, -1);
		MAP_BUILD_COMPLETE = new ClientPacket(47, 0);
		EVENT_CAMERA_POSITION = new ClientPacket(48, 4);
		OPPLAYER7 = new ClientPacket(49, 3);
		OPPLAYER1 = new ClientPacket(50, 3);
		RESUME_OBJDIALOG = new ClientPacket(51, 2);
		FRIEND_CHAT_JOIN_LEAVE = new ClientPacket(52, -1);
		OPNPC1 = new ClientPacket(53, 3);
		CHAT_SENDABUSEREPORT = new ClientPacket(54, -1);
		OPWORLDENTITY2 = new ClientPacket(55, 3);
		OPLOC5 = new ClientPacket(56, 7);
		OPNPCT = new ClientPacket(57, 11);
		OPLOC4 = new ClientPacket(58, 7);
		FRIEND_ADDUSER = new ClientPacket(59, -1);
		OPWORLDENTITYU = new ClientPacket(60, 11);
		OPPLAYER3 = new ClientPacket(61, 3);
		CLAN_SETTINGS_ADD_BANNED_FROM_CHANNEL = new ClientPacket(62, -1);
		UPDATE_PLAYER_MODEL = new ClientPacket(63, 26);
		CLAN_CHANNEL_KICK_USER = new ClientPacket(64, -1);
		CHAT_SENDPRIVATE = new ClientPacket(65, -2);
		DETECT_MODIFIED_CLIENT = new ClientPacket(66, 4);
		IGNORE_DELUSER = new ClientPacket(67, -1);
		CLAN_KICKUSER = new ClientPacket(68, -1);
		SET_HEADING = new ClientPacket(69, 1);
		field3610 = new ClientPacket(70, -1);
		FREECAM_EXIT = new ClientPacket(71, 0);
		field3540 = new ClientPacket(72, 2);
		OPLOCU = new ClientPacket(73, 15);
		OPPLAYER4 = new ClientPacket(74, 3);
		WIDGET_TYPE = new ClientPacket(75, 4);
		PING_STATISTICS = new ClientPacket(76, 10);
		IGNORE_LIST_ADD = new ClientPacket(77, -1);
		OPNPCE = new ClientPacket(78, 2);
		REFLECTION_CHECK_REPLY = new ClientPacket(79, -1);
		IF_CRMVIEW = new ClientPacket(80, 22);
		TELEPORT = new ClientPacket(81, 9);
		OPNPCU = new ClientPacket(82, 11);
		FRIEND_DELUSER = new ClientPacket(83, -1);
		CLAN_CHANNEL_FULL_REQUEST = new ClientPacket(84, 1);
		RESUME_NAMEDIALOG = new ClientPacket(85, -1);
		OPWORLDENTITY4 = new ClientPacket(86, 3);
		RESUME_COUNTDIALOG = new ClientPacket(87, 4);
		OPWORLDENTITYE = new ClientPacket(88, 2);
		OPLOCE = new ClientPacket(89, 2);
		MOVE_GAMECLICK = new ClientPacket(90, -1);
		OPPLAYER6 = new ClientPacket(91, 3);
		EVENT_MOUSE_CLICK = new ClientPacket(92, 7);
		OPNPC3 = new ClientPacket(93, 3);
		OPHELDD = new ClientPacket(94, 16);
		IF_RUNSCRIPT = new ClientPacket(95, -2);
		EVENT_MOUSE_IDLE = new ClientPacket(96, 0);
		OPLOC1 = new ClientPacket(97, 7);
		OPLOC2 = new ClientPacket(98, 7);
		NO_TIMEOUT = new ClientPacket(99, 0);
		IF_SUBOP = new ClientPacket(100, 10);
	}

	ClientPacket(int var1, int var2) {
		this.id = var1;
		this.length = var2;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ldr;I)V",
		garbageValue = "-475196296"
	)
	static void method7037(WorldView var0) {
		int var1 = var0.sizeX;
		int var2 = var0.sizeY;
		int[][][] var3 = var0.tileHeights;
		Scene var4 = var0.scene;
		int var5 = 1;
		int var6 = 2;
		int var7 = 4;

		for (int var8 = 0; var8 < 4; ++var8) {
			if (var8 > 0) {
				var5 <<= 3;
				var6 <<= 3;
				var7 <<= 3;
			}

			for (int var9 = 0; var9 <= var8; ++var9) {
				for (int var10 = 0; var10 <= var2; ++var10) {
					for (int var11 = 0; var11 <= var1; ++var11) {
						int var12;
						int var13;
						int var14;
						int var15;
						int var16;
						int[] var10000;
						short var17;
						int var18;
						int var19;
						int var20;
						int var21;
						if ((PlayerType.field4837[var9][var11][var10] & var5) != 0) {
							var12 = var10;
							var13 = var10;
							var14 = var9;

							for (var15 = var9; var12 > 0 && (PlayerType.field4837[var9][var11][var12 - 1] & var5) != 0; --var12) {
							}

							while (var13 < var2 && (PlayerType.field4837[var9][var11][var13 + 1] & var5) != 0) {
								++var13;
							}

							label189:
							while (var14 > 0) {
								for (var16 = var12; var16 <= var13; ++var16) {
									if ((PlayerType.field4837[var14 - 1][var11][var16] & var5) == 0) {
										break label189;
									}
								}

								--var14;
							}

							label178:
							while (var15 < var8) {
								for (var16 = var12; var16 <= var13; ++var16) {
									if ((PlayerType.field4837[var15 + 1][var11][var16] & var5) == 0) {
										break label178;
									}
								}

								++var15;
							}

							var16 = (var13 - var12 + 1) * (var15 + 1 - var14);
							if (var16 >= 8) {
								var17 = 240;
								var18 = var3[var15][var11][var12] - var17;
								var19 = var3[var14][var11][var12];
								var4.Scene_addOccluder(var8, 1, var11 * 128, var11 * 128, var12 * 128, var13 * 128 + 128, var18, var19);

								for (var20 = var14; var20 <= var15; ++var20) {
									for (var21 = var12; var21 <= var13; ++var21) {
										var10000 = PlayerType.field4837[var20][var11];
										var10000[var21] &= ~var5;
									}
								}
							}
						}

						if ((PlayerType.field4837[var9][var11][var10] & var6) != 0) {
							var12 = var11;
							var13 = var11;
							var14 = var9;

							for (var15 = var9; var12 > 0 && (PlayerType.field4837[var9][var12 - 1][var10] & var6) != 0; --var12) {
							}

							while (var13 < var1 && (PlayerType.field4837[var9][var13 + 1][var10] & var6) != 0) {
								++var13;
							}

							label242:
							while (var14 > 0) {
								for (var16 = var12; var16 <= var13; ++var16) {
									if ((PlayerType.field4837[var14 - 1][var16][var10] & var6) == 0) {
										break label242;
									}
								}

								--var14;
							}

							label231:
							while (var15 < var8) {
								for (var16 = var12; var16 <= var13; ++var16) {
									if ((PlayerType.field4837[var15 + 1][var16][var10] & var6) == 0) {
										break label231;
									}
								}

								++var15;
							}

							var16 = (var13 - var12 + 1) * (var15 + 1 - var14);
							if (var16 >= 8) {
								var17 = 240;
								var18 = var3[var15][var12][var10] - var17;
								var19 = var3[var14][var12][var10];
								var4.Scene_addOccluder(var8, 2, var12 * 128, var13 * 128 + 128, var10 * 128, var10 * 128, var18, var19);

								for (var20 = var14; var20 <= var15; ++var20) {
									for (var21 = var12; var21 <= var13; ++var21) {
										var10000 = PlayerType.field4837[var20][var21];
										var10000[var10] &= ~var6;
									}
								}
							}
						}

						if ((PlayerType.field4837[var9][var11][var10] & var7) != 0) {
							var12 = var11;
							var13 = var11;
							var14 = var10;

							for (var15 = var10; var14 > 0 && (PlayerType.field4837[var9][var11][var14 - 1] & var7) != 0; --var14) {
							}

							while (var15 < var2 && (PlayerType.field4837[var9][var11][var15 + 1] & var7) != 0) {
								++var15;
							}

							label295:
							while (var12 > 0) {
								for (var16 = var14; var16 <= var15; ++var16) {
									if ((PlayerType.field4837[var9][var12 - 1][var16] & var7) == 0) {
										break label295;
									}
								}

								--var12;
							}

							label284:
							while (var13 < var1) {
								for (var16 = var14; var16 <= var15; ++var16) {
									if ((PlayerType.field4837[var9][var13 + 1][var16] & var7) == 0) {
										break label284;
									}
								}

								++var13;
							}

							if ((var13 - var12 + 1) * (var15 - var14 + 1) >= 4) {
								var16 = var3[var9][var12][var14];
								var4.Scene_addOccluder(var8, 4, var12 * 128, var13 * 128 + 128, var14 * 128, var15 * 128 + 128, var16, var16);

								for (int var22 = var12; var22 <= var13; ++var22) {
									for (var18 = var14; var18 <= var15; ++var18) {
										var10000 = PlayerType.field4837[var9][var22];
										var10000[var18] &= ~var7;
									}
								}
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "82"
	)
	static final int method7039(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(Ldr;IIIIII)V",
		garbageValue = "-1625778592"
	)
	static void method7040(WorldView var0, int var1, int var2, int var3, int var4, int var5) {
		NodeDeque var6 = var0.groundItems[var1][var2][var3];
		if (var6 != null) {
			for (TileItem var7 = (TileItem)var6.last(); var7 != null; var7 = (TileItem)var6.previous()) {
				if ((var4 & 32767) == var7.id && var5 == var7.quantity) {
					var7.method2818();
					break;
				}
			}

			EnumComposition.updateItemPile(var1, var2, var3);
		}

	}

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z",
		garbageValue = "-86298819"
	)
	static boolean method7038(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		Scene var7 = HttpHeaders.worldView.scene;
		int var9;
		if (var5 == class396.field4813.field4814) {
			BoundaryObject var8 = var7.getBoundaryObject(var0, var1, var2);
			if (var8 != null) {
				var9 = class537.Entity_unpackID(var8.tag);
				if (var3 == WorldMapDecorationType.field4345.id) {
					var8.renderable1 = new DynamicObject(HttpHeaders.worldView, var9, 2, var4 + 4, var0, var1, var2, var6, false, var8.renderable1);
					var8.renderable2 = new DynamicObject(HttpHeaders.worldView, var9, 2, var4 + 1 & 3, var0, var1, var2, var6, false, var8.renderable2);
				} else {
					var8.renderable1 = new DynamicObject(HttpHeaders.worldView, var9, var3, var4, var0, var1, var2, var6, false, var8.renderable1);
				}

				return true;
			}
		} else if (var5 == class396.field4810.field4814) {
			WallDecoration var10 = var7.getWallDecoration(var0, var1, var2);
			if (var10 != null) {
				var9 = class537.Entity_unpackID(var10.tag);
				if (var3 != WorldMapDecorationType.field4348.id && var3 != WorldMapDecorationType.field4363.id) {
					if (var3 == WorldMapDecorationType.field4347.id) {
						var10.renderable1 = new DynamicObject(HttpHeaders.worldView, var9, 4, var4 + 4, var0, var1, var2, var6, false, var10.renderable1);
					} else if (var3 == WorldMapDecorationType.field4349.id) {
						var10.renderable1 = new DynamicObject(HttpHeaders.worldView, var9, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var10.renderable1);
					} else if (var3 == WorldMapDecorationType.field4350.id) {
						var10.renderable1 = new DynamicObject(HttpHeaders.worldView, var9, 4, var4 + 4, var0, var1, var2, var6, false, var10.renderable1);
						var10.renderable2 = new DynamicObject(HttpHeaders.worldView, var9, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var10.renderable2);
					}
				} else {
					var10.renderable1 = new DynamicObject(HttpHeaders.worldView, var9, 4, var4, var0, var1, var2, var6, false, var10.renderable1);
				}

				return true;
			}
		} else if (var5 == class396.field4811.field4814) {
			GameObject var11 = var7.getGameObject(var0, var1, var2);
			if (var3 == WorldMapDecorationType.field4362.id) {
				var3 = WorldMapDecorationType.field4361.id;
			}

			if (var11 != null) {
				var11.renderable = new DynamicObject(HttpHeaders.worldView, class537.Entity_unpackID(var11.tag), var3, var4, var0, var1, var2, var6, false, var11.renderable);
				return true;
			}
		} else if (var5 == class396.field4812.field4814) {
			FloorDecoration var12 = var7.getFloorDecoration(var0, var1, var2);
			if (var12 != null) {
				var12.renderable = new DynamicObject(HttpHeaders.worldView, class537.Entity_unpackID(var12.tag), 22, var4, var0, var1, var2, var6, false, var12.renderable);
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ot")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1436387344"
	)
	static final void method7036() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();

			for (int var2 = 0; var2 < Client.playerUpdateManager.playerCount; ++var2) {
				Player var3 = (Player)class333.topLevelWorldView.players.get((long)Client.playerUpdateManager.playerIndices[var2]);
				if (var3 != null) {
					var3.clearIsInFriendsChat();
				}
			}
		}

	}
}
