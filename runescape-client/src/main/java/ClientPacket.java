import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mk")
@Implements("ClientPacket")
public class ClientPacket implements class325 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket NO_TIMEOUT;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket EVENT_KEYBOARD;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket FRIEND_CHAT_JOIN_LEAVE;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPWORLDENTITY2;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPWORLDENTITY1;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPNPC2;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket RESUME_OBJDIALOG;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket CLOSE_MODAL;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket UPDATE_PLAYER_MODEL;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket IF_SUBOP;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPWORLDENTITYE;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPOBJT;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket REFLECTION_CHECK_REPLY;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	static final ClientPacket field3561;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket EVENT_CAMERA_POSITION;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPLOCE;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPNPC1;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPLOC4;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPPLAYER7;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket IF_BUTTONT;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket MUSIC_PLAYING;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPLOCU;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPOBJ3;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket CLAN_SETTINGS_FULL_REQUEST;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	static final ClientPacket field3570;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPNPC4;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPNPCU;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket LOGIN_TIMINGS;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket CLICK_WORLD_MAP;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket DOCHEAT;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket field3578;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket CHAT_SENDABUSEREPORT;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPOBJ5;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	static final ClientPacket field3612;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPPLAYER1;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket RESUME_PAUSEBUTTON;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPHELDD;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket TELEPORT;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPOBJE;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket CLAN_SETTINGS_SET_MUTED_FROM_CHANNEL;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket field3601;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPOBJU;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPWORLDENTITY5;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket RESUME_COUNTDIALOG;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPPLAYERT;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket EVENT_MOUSE_IDLE;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPNPC5;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPPLAYER2;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket RESUME_NAMEDIALOG;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPWORLDENTITY3;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPNPCE;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPOBJ2;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPWORLDENTITYU;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket CLAN_KICKUSER;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket EVENT_APPLET_FOCUS;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket FRIEND_CHAT_SETRANK;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket CLAN_CHANNEL_KICK_USER;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket FRIEND_DELUSER;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPLOCT;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPWORLDENTITY4;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	static final ClientPacket field3549;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPPLAYER4;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket IGNORE_DELUSER;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket IGNORE_LIST_ADD;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPLOC1;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket WIDGET_TYPE;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket MOUSE_MOVE;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPLOC5;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPLOC2;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	static final ClientPacket field3617;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket MOUSE_WHEEL;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPPLAYER8;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	static final ClientPacket field3620;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket FRIEND_ADDUSER;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket CLAN_SETTINGS_ADD_BANNED_FROM_CHANNEL;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket IF_RUNSCRIPT;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPLOC3;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPNPCT;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPPLAYER5;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPPLAYER3;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket MAP_BUILD_COMPLETE;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket CLAN_CHANNEL_FULL_REQUEST;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket EVENT_WINDOW_SETTING;
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket MESSAGE_PUBLIC;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPWORLDENTITYT;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket BUG_REPORT;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket CHAT_SENDPRIVATE;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPOBJ1;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket RESUME_STRINGDIALOG;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket SET_HEADING;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPOBJ4;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket IF_BUTTONX;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket PING_STATISTICS;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPPLAYER6;
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPNPC3;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket field3630;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket IF_CRMVIEW;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket CHAT_SETFILTER;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket MOVE_GAMECLICK;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket OPPLAYERU;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final ClientPacket MINIMAP_CLICK;
	@ObfuscatedName("ud")
	@ObfuscatedGetter(
		intValue = -1644948075
	)
	static int field3651;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -2089726319
	)
	@Export("id")
	final int id;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = -812834389
	)
	@Export("length")
	final int length;

	static {
		NO_TIMEOUT = new ClientPacket(0, 0);
		EVENT_KEYBOARD = new ClientPacket(1, -2);
		FRIEND_CHAT_JOIN_LEAVE = new ClientPacket(2, -1);
		OPWORLDENTITY2 = new ClientPacket(3, 3);
		OPWORLDENTITY1 = new ClientPacket(4, 3);
		OPNPC2 = new ClientPacket(5, 3);
		RESUME_OBJDIALOG = new ClientPacket(6, 2);
		CLOSE_MODAL = new ClientPacket(7, 0);
		UPDATE_PLAYER_MODEL = new ClientPacket(8, 26);
		IF_SUBOP = new ClientPacket(9, 10);
		OPWORLDENTITYE = new ClientPacket(10, 2);
		OPOBJT = new ClientPacket(11, 15);
		REFLECTION_CHECK_REPLY = new ClientPacket(12, -1);
		field3561 = new ClientPacket(13, -1);
		EVENT_CAMERA_POSITION = new ClientPacket(14, 4);
		OPLOCE = new ClientPacket(15, 2);
		OPNPC1 = new ClientPacket(16, 3);
		OPLOC4 = new ClientPacket(17, 7);
		OPPLAYER7 = new ClientPacket(18, 3);
		IF_BUTTONT = new ClientPacket(19, 16);
		MUSIC_PLAYING = new ClientPacket(20, 4);
		OPLOCU = new ClientPacket(21, 15);
		OPOBJ3 = new ClientPacket(22, 7);
		CLAN_SETTINGS_FULL_REQUEST = new ClientPacket(23, 1);
		field3570 = new ClientPacket(24, 7);
		OPNPC4 = new ClientPacket(25, 3);
		OPNPCU = new ClientPacket(26, 11);
		LOGIN_TIMINGS = new ClientPacket(27, -1);
		CLICK_WORLD_MAP = new ClientPacket(28, 4);
		DOCHEAT = new ClientPacket(29, -1);
		field3578 = new ClientPacket(30, 4);
		CHAT_SENDABUSEREPORT = new ClientPacket(31, -1);
		OPOBJ5 = new ClientPacket(32, 7);
		field3612 = new ClientPacket(33, -1);
		OPPLAYER1 = new ClientPacket(34, 3);
		RESUME_PAUSEBUTTON = new ClientPacket(35, 6);
		OPHELDD = new ClientPacket(36, 16);
		TELEPORT = new ClientPacket(37, 9);
		OPOBJE = new ClientPacket(38, 6);
		CLAN_SETTINGS_SET_MUTED_FROM_CHANNEL = new ClientPacket(39, -1);
		field3601 = new ClientPacket(40, 7);
		OPOBJU = new ClientPacket(41, 15);
		OPWORLDENTITY5 = new ClientPacket(42, 3);
		RESUME_COUNTDIALOG = new ClientPacket(43, 4);
		OPPLAYERT = new ClientPacket(44, 11);
		EVENT_MOUSE_IDLE = new ClientPacket(45, 0);
		OPNPC5 = new ClientPacket(46, 3);
		OPPLAYER2 = new ClientPacket(47, 3);
		RESUME_NAMEDIALOG = new ClientPacket(48, -1);
		OPWORLDENTITY3 = new ClientPacket(49, 3);
		OPNPCE = new ClientPacket(50, 2);
		OPOBJ2 = new ClientPacket(51, 7);
		OPWORLDENTITYU = new ClientPacket(52, 11);
		CLAN_KICKUSER = new ClientPacket(53, -1);
		EVENT_APPLET_FOCUS = new ClientPacket(54, 1);
		FRIEND_CHAT_SETRANK = new ClientPacket(55, -1);
		CLAN_CHANNEL_KICK_USER = new ClientPacket(56, -1);
		FRIEND_DELUSER = new ClientPacket(57, -1);
		OPLOCT = new ClientPacket(58, 15);
		OPWORLDENTITY4 = new ClientPacket(59, 3);
		field3549 = new ClientPacket(60, 1);
		OPPLAYER4 = new ClientPacket(61, 3);
		IGNORE_DELUSER = new ClientPacket(62, -1);
		IGNORE_LIST_ADD = new ClientPacket(63, -1);
		OPLOC1 = new ClientPacket(64, 7);
		WIDGET_TYPE = new ClientPacket(65, 4);
		MOUSE_MOVE = new ClientPacket(66, -1);
		OPLOC5 = new ClientPacket(67, 7);
		OPLOC2 = new ClientPacket(68, 7);
		field3617 = new ClientPacket(69, 6);
		MOUSE_WHEEL = new ClientPacket(70, 2);
		OPPLAYER8 = new ClientPacket(71, 3);
		field3620 = new ClientPacket(72, 2);
		FRIEND_ADDUSER = new ClientPacket(73, -1);
		CLAN_SETTINGS_ADD_BANNED_FROM_CHANNEL = new ClientPacket(74, -1);
		IF_RUNSCRIPT = new ClientPacket(75, -2);
		OPLOC3 = new ClientPacket(76, 7);
		OPNPCT = new ClientPacket(77, 11);
		OPPLAYER5 = new ClientPacket(78, 3);
		OPPLAYER3 = new ClientPacket(79, 3);
		MAP_BUILD_COMPLETE = new ClientPacket(80, 0);
		CLAN_CHANNEL_FULL_REQUEST = new ClientPacket(81, 1);
		EVENT_WINDOW_SETTING = new ClientPacket(82, 5);
		MESSAGE_PUBLIC = new ClientPacket(83, -1);
		OPWORLDENTITYT = new ClientPacket(84, 11);
		BUG_REPORT = new ClientPacket(85, -2);
		CHAT_SENDPRIVATE = new ClientPacket(86, -2);
		OPOBJ1 = new ClientPacket(87, 7);
		RESUME_STRINGDIALOG = new ClientPacket(88, -1);
		SET_HEADING = new ClientPacket(89, 1);
		OPOBJ4 = new ClientPacket(90, 7);
		IF_BUTTONX = new ClientPacket(91, 9);
		PING_STATISTICS = new ClientPacket(92, 10);
		OPPLAYER6 = new ClientPacket(93, 3);
		OPNPC3 = new ClientPacket(94, 3);
		field3630 = new ClientPacket(95, 0);
		IF_CRMVIEW = new ClientPacket(96, 22);
		CHAT_SETFILTER = new ClientPacket(97, 3);
		MOVE_GAMECLICK = new ClientPacket(98, -1);
		OPPLAYERU = new ClientPacket(99, 11);
		MINIMAP_CLICK = new ClientPacket(100, -1);
	}

	ClientPacket(int var1, int var2) {
		this.id = var1;
		this.length = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpe;Lpe;I)V",
		garbageValue = "2087696174"
	)
	public static void method7037(AbstractArchive var0, AbstractArchive var1) {
		WorldMapElement.WorldMapElement_archive = var1;
		WorldMapElement.WorldMapElement_count = var0.getGroupFileCount(35);
		WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count];

		for (int var2 = 0; var2 < WorldMapElement.WorldMapElement_count; ++var2) {
			byte[] var3 = var0.takeFile(35, var2);
			WorldMapElement.WorldMapElement_cached[var2] = new WorldMapElement(var2);
			if (var3 != null) {
				WorldMapElement.WorldMapElement_cached[var2].decode(new Buffer(var3));
				WorldMapElement.WorldMapElement_cached[var2].method4240();
			}
		}

	}
}
