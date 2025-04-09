import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mq")
@Implements("ClientPacket")
public class ClientPacket implements class323 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket NO_TIMEOUT;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket OPOBJ5;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket SET_HEADING;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket EVENT_APPLET_FOCUS;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket MESSAGE_PUBLIC;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket TELEPORT;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket IF_BUTTON7;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket CLAN_CHANNEL_KICK_USER;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket EVENT_CAMERA_POSITION;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket RESUME_STRINGDIALOG;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket EVENT_WINDOW_SETTING;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket CLAN_SETTINGS_SET_MUTED_FROM_CHANNEL;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket MUSIC_PLAYING;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket LOGIN_TIMINGS;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket OPLOC1;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket FRIEND_CHAT_SETRANK;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket OPPLAYER7;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket PING_STATISTICS;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket OPPLAYERT;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket OPLOCU;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket REFLECTION_CHECK_REPLY;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	static final ClientPacket field3402;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket OPOBJ1;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket BUG_REPORT;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket IF_BUTTON9;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket IF_BUTTON6;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket IF_BUTTON10;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket OPLOCE;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket IF_BUTTONT;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket IF_BUTTON5;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket CLAN_SETTINGS_FULL_REQUEST;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket OPOBJU;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket OPOBJE;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	static final ClientPacket field3414;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket OPLOC4;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket WIDGET_TYPE;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket EVENT_MOUSE_CLICK;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket OPOBJ4;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	static final ClientPacket field3419;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket OPOBJT;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket FRIEND_CHAT_JOIN_LEAVE;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket OPNPCU;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket OPLOC5;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket OPOBJ3;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket OPNPC3;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket field3467;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket EVENT_MOUSE_IDLE;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket OPPLAYER4;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket OPPLAYER5;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket IGNORE_LIST_ADD;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket CHAT_SENDABUSEREPORT;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket OPPLAYER8;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket CLAN_CHANNEL_FULL_REQUEST;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket OPNPC4;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket MAP_BUILD_COMPLETE;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket MINIMAP_CLICK;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket RESUME_NAMEDIALOG;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket OPNPC1;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket EVENT_KEYBOARD;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket FRIEND_DELUSER;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket OPNPC5;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	static final ClientPacket field3442;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket RESUME_PAUSEBUTTON;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket OPOBJ2;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket CLICK_WORLD_MAP;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket OPPLAYER3;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket CLAN_KICKUSER;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket DETECT_MODIFIED_CLIENT;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket field3449;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket IGNORE_DELUSER;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket RESUME_COUNTDIALOG;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket OPNPCT;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket OPPLAYER2;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket OPPLAYER1;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket OPPLAYER6;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	static final ClientPacket field3456;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket IF_BUTTON4;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket FRIEND_ADDUSER;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket IF_BUTTON2;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket CLAN_SETTINGS_ADD_BANNED_FROM_CHANNEL;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket IF_SUBOP;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket UPDATE_PLAYER_MODEL;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket MOUSE_WHEEL;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket OPPLAYERU;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket OPLOC3;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket OPLOC2;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket MOVE_GAMECLICK;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket IF_BUTTON3;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket OPLOCT;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket IF_BUTTON8;
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket IF_CRMVIEW;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket OPNPCE;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket IF_BUTTON1;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket RESUME_OBJDIALOG;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket MOUSE_MOVE;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket CHAT_SETFILTER;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket CHAT_SENDPRIVATE;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket OPNPC2;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket CLOSE_MODAL;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	public static final ClientPacket OPHELDD;
	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	static Archive field3483;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = 1711910853
	)
	@Export("id")
	final int id;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = -945162781
	)
	@Export("length")
	final int length;

	static {
		NO_TIMEOUT = new ClientPacket(0, 0);
		OPOBJ5 = new ClientPacket(1, 7);
		SET_HEADING = new ClientPacket(2, 1);
		EVENT_APPLET_FOCUS = new ClientPacket(3, 1);
		MESSAGE_PUBLIC = new ClientPacket(4, -1);
		TELEPORT = new ClientPacket(5, 9);
		IF_BUTTON7 = new ClientPacket(6, 8);
		CLAN_CHANNEL_KICK_USER = new ClientPacket(7, -1);
		EVENT_CAMERA_POSITION = new ClientPacket(8, 4);
		RESUME_STRINGDIALOG = new ClientPacket(9, -1);
		EVENT_WINDOW_SETTING = new ClientPacket(10, 5);
		CLAN_SETTINGS_SET_MUTED_FROM_CHANNEL = new ClientPacket(11, -1);
		MUSIC_PLAYING = new ClientPacket(12, 4);
		LOGIN_TIMINGS = new ClientPacket(13, -1);
		OPLOC1 = new ClientPacket(14, 7);
		FRIEND_CHAT_SETRANK = new ClientPacket(15, -1);
		OPPLAYER7 = new ClientPacket(16, 3);
		PING_STATISTICS = new ClientPacket(17, 10);
		OPPLAYERT = new ClientPacket(18, 11);
		OPLOCU = new ClientPacket(19, 15);
		REFLECTION_CHECK_REPLY = new ClientPacket(20, -1);
		field3402 = new ClientPacket(21, 7);
		OPOBJ1 = new ClientPacket(22, 7);
		BUG_REPORT = new ClientPacket(23, -2);
		IF_BUTTON9 = new ClientPacket(24, 8);
		IF_BUTTON6 = new ClientPacket(25, 8);
		IF_BUTTON10 = new ClientPacket(26, 8);
		OPLOCE = new ClientPacket(27, 2);
		IF_BUTTONT = new ClientPacket(28, 16);
		IF_BUTTON5 = new ClientPacket(29, 8);
		CLAN_SETTINGS_FULL_REQUEST = new ClientPacket(30, 1);
		OPOBJU = new ClientPacket(31, 15);
		OPOBJE = new ClientPacket(32, 6);
		field3414 = new ClientPacket(33, 1);
		OPLOC4 = new ClientPacket(34, 7);
		WIDGET_TYPE = new ClientPacket(35, 4);
		EVENT_MOUSE_CLICK = new ClientPacket(36, 6);
		OPOBJ4 = new ClientPacket(37, 7);
		field3419 = new ClientPacket(38, 2);
		OPOBJT = new ClientPacket(39, 15);
		FRIEND_CHAT_JOIN_LEAVE = new ClientPacket(40, -1);
		OPNPCU = new ClientPacket(41, 11);
		OPLOC5 = new ClientPacket(42, 7);
		OPOBJ3 = new ClientPacket(43, 7);
		OPNPC3 = new ClientPacket(44, 3);
		field3467 = new ClientPacket(45, 0);
		EVENT_MOUSE_IDLE = new ClientPacket(46, 0);
		OPPLAYER4 = new ClientPacket(47, 3);
		OPPLAYER5 = new ClientPacket(48, 3);
		IGNORE_LIST_ADD = new ClientPacket(49, -1);
		CHAT_SENDABUSEREPORT = new ClientPacket(50, -1);
		OPPLAYER8 = new ClientPacket(51, 3);
		CLAN_CHANNEL_FULL_REQUEST = new ClientPacket(52, 1);
		OPNPC4 = new ClientPacket(53, 3);
		MAP_BUILD_COMPLETE = new ClientPacket(54, 0);
		MINIMAP_CLICK = new ClientPacket(55, -1);
		RESUME_NAMEDIALOG = new ClientPacket(56, -1);
		OPNPC1 = new ClientPacket(57, 3);
		EVENT_KEYBOARD = new ClientPacket(58, -2);
		FRIEND_DELUSER = new ClientPacket(59, -1);
		OPNPC5 = new ClientPacket(60, 3);
		field3442 = new ClientPacket(61, -1);
		RESUME_PAUSEBUTTON = new ClientPacket(62, 6);
		OPOBJ2 = new ClientPacket(63, 7);
		CLICK_WORLD_MAP = new ClientPacket(64, 4);
		OPPLAYER3 = new ClientPacket(65, 3);
		CLAN_KICKUSER = new ClientPacket(66, -1);
		DETECT_MODIFIED_CLIENT = new ClientPacket(67, 4);
		field3449 = new ClientPacket(68, -1);
		IGNORE_DELUSER = new ClientPacket(69, -1);
		RESUME_COUNTDIALOG = new ClientPacket(70, 4);
		OPNPCT = new ClientPacket(71, 11);
		OPPLAYER2 = new ClientPacket(72, 3);
		OPPLAYER1 = new ClientPacket(73, 3);
		OPPLAYER6 = new ClientPacket(74, 3);
		field3456 = new ClientPacket(75, -1);
		IF_BUTTON4 = new ClientPacket(76, 8);
		FRIEND_ADDUSER = new ClientPacket(77, -1);
		IF_BUTTON2 = new ClientPacket(78, 8);
		CLAN_SETTINGS_ADD_BANNED_FROM_CHANNEL = new ClientPacket(79, -1);
		IF_SUBOP = new ClientPacket(80, 10);
		UPDATE_PLAYER_MODEL = new ClientPacket(81, 26);
		MOUSE_WHEEL = new ClientPacket(82, 2);
		OPPLAYERU = new ClientPacket(83, 11);
		OPLOC3 = new ClientPacket(84, 7);
		OPLOC2 = new ClientPacket(85, 7);
		MOVE_GAMECLICK = new ClientPacket(86, -1);
		IF_BUTTON3 = new ClientPacket(87, 8);
		OPLOCT = new ClientPacket(88, 15);
		IF_BUTTON8 = new ClientPacket(89, 8);
		IF_CRMVIEW = new ClientPacket(90, 22);
		OPNPCE = new ClientPacket(91, 2);
		IF_BUTTON1 = new ClientPacket(92, 8);
		RESUME_OBJDIALOG = new ClientPacket(93, 2);
		MOUSE_MOVE = new ClientPacket(94, -1);
		CHAT_SETFILTER = new ClientPacket(95, 3);
		CHAT_SENDPRIVATE = new ClientPacket(96, -2);
		OPNPC2 = new ClientPacket(97, 3);
		CLOSE_MODAL = new ClientPacket(98, 0);
		OPHELDD = new ClientPacket(99, 16);
	}

	ClientPacket(int var1, int var2) {
		this.id = var1;
		this.length = var2;
	}
}
