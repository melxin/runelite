import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mi")
@Implements("ClientPacket")
public class ClientPacket implements class324 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket IF_BUTTONX;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPNPC5;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPNPC1;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPNPCE;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket RESUME_COUNTDIALOG;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket CHAT_SENDPRIVATE;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPLOCT;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket MUSIC_PLAYING;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPPLAYER1;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket RESUME_STRINGDIALOG;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket EVENT_CAMERA_POSITION;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket LOGIN_TIMINGS;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket WIDGET_TYPE;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPPLAYER6;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	static final ClientPacket field3468;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPNPC4;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket FREECAM_EXIT;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket CLAN_SETTINGS_SET_MUTED_FROM_CHANNEL;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket MAP_BUILD_COMPLETE;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPOBJ4;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket MINIMAP_CLICK;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket CLAN_CHANNEL_FULL_REQUEST;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket DETECT_MODIFIED_CLIENT;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPOBJE;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket BUG_REPORT;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPPLAYERU;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket RESUME_PAUSEBUTTON;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	static final ClientPacket field3548;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPLOC1;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPLOC2;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket CLAN_CHANNEL_KICK_USER;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPOBJ2;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPLOCE;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	static final ClientPacket field3487;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPPLAYER4;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPPLAYER2;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket FRIEND_DELUSER;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket CLICK_WORLD_MAP;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPPLAYER5;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket MOVE_GAMECLICK;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket MESSAGE_PUBLIC;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPOBJU;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	static final ClientPacket field3496;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket DOCHEAT;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket CLAN_SETTINGS_FULL_REQUEST;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket MOUSE_MOVE;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket EVENT_KEYBOARD;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPPLAYER8;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket EVENT_WINDOW_SETTING;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket MOUSE_WHEEL;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPLOCU;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPLOC3;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket FRIEND_CHAT_JOIN_LEAVE;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket CLAN_KICKUSER;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPPLAYER7;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket RESUME_NAMEDIALOG;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket FRIEND_CHAT_SETRANK;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket RESUME_OBJDIALOG;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket CLAN_SETTINGS_ADD_BANNED_FROM_CHANNEL;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPOBJ3;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPLOC5;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket IGNORE_DELUSER;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket IF_BUTTONT;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket EVENT_MOUSE_CLICK_V2;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPNPCU;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket EVENT_MOUSE_CLICK;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPPLAYER3;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket TELEPORT;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPNPC2;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket SET_HEADING;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPOBJ5;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPOBJ1;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket CHAT_SENDABUSEREPORT;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket FRIEND_ADDUSER;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket IF_RUNSCRIPT;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket CLOSE_MODAL;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPOBJT;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPNPCT;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket IF_SUBOP;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket REFLECTION_CHECK_REPLY;
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket IF_CRMVIEW;
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPHELDD;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPPLAYERT;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPLOC4;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket PING_STATISTICS;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket EVENT_APPLET_FOCUS;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket UPDATE_PLAYER_MODEL;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket EVENT_MOUSE_IDLE;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	static final ClientPacket field3542;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket CHAT_SETFILTER;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket NO_TIMEOUT;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket OPNPC3;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ClientPacket IGNORE_LIST_ADD;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = -675159431
	)
	@Export("id")
	final int id;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = -1642840655
	)
	@Export("length")
	final int length;

	static {
		IF_BUTTONX = new ClientPacket(0, 9);
		OPNPC5 = new ClientPacket(1, 3);
		OPNPC1 = new ClientPacket(2, 3);
		OPNPCE = new ClientPacket(3, 2);
		RESUME_COUNTDIALOG = new ClientPacket(4, 4);
		CHAT_SENDPRIVATE = new ClientPacket(5, -2);
		OPLOCT = new ClientPacket(6, 15);
		MUSIC_PLAYING = new ClientPacket(7, 4);
		OPPLAYER1 = new ClientPacket(8, 3);
		RESUME_STRINGDIALOG = new ClientPacket(9, -1);
		EVENT_CAMERA_POSITION = new ClientPacket(10, 4);
		LOGIN_TIMINGS = new ClientPacket(11, -1);
		WIDGET_TYPE = new ClientPacket(12, 4);
		OPPLAYER6 = new ClientPacket(13, 3);
		field3468 = new ClientPacket(14, -1);
		OPNPC4 = new ClientPacket(15, 3);
		FREECAM_EXIT = new ClientPacket(16, 0);
		CLAN_SETTINGS_SET_MUTED_FROM_CHANNEL = new ClientPacket(17, -1);
		MAP_BUILD_COMPLETE = new ClientPacket(18, 0);
		OPOBJ4 = new ClientPacket(19, 7);
		MINIMAP_CLICK = new ClientPacket(20, -1);
		CLAN_CHANNEL_FULL_REQUEST = new ClientPacket(21, 1);
		DETECT_MODIFIED_CLIENT = new ClientPacket(22, 4);
		OPOBJE = new ClientPacket(23, 6);
		BUG_REPORT = new ClientPacket(24, -2);
		OPPLAYERU = new ClientPacket(25, 11);
		RESUME_PAUSEBUTTON = new ClientPacket(26, 6);
		field3548 = new ClientPacket(27, 1);
		OPLOC1 = new ClientPacket(28, 7);
		OPLOC2 = new ClientPacket(29, 7);
		CLAN_CHANNEL_KICK_USER = new ClientPacket(30, -1);
		OPOBJ2 = new ClientPacket(31, 7);
		OPLOCE = new ClientPacket(32, 2);
		field3487 = new ClientPacket(33, 7);
		OPPLAYER4 = new ClientPacket(34, 3);
		OPPLAYER2 = new ClientPacket(35, 3);
		FRIEND_DELUSER = new ClientPacket(36, -1);
		CLICK_WORLD_MAP = new ClientPacket(37, 4);
		OPPLAYER5 = new ClientPacket(38, 3);
		MOVE_GAMECLICK = new ClientPacket(39, -1);
		MESSAGE_PUBLIC = new ClientPacket(40, -1);
		OPOBJU = new ClientPacket(41, 15);
		field3496 = new ClientPacket(42, 2);
		DOCHEAT = new ClientPacket(43, -1);
		CLAN_SETTINGS_FULL_REQUEST = new ClientPacket(44, 1);
		MOUSE_MOVE = new ClientPacket(45, -1);
		EVENT_KEYBOARD = new ClientPacket(46, -2);
		OPPLAYER8 = new ClientPacket(47, 3);
		EVENT_WINDOW_SETTING = new ClientPacket(48, 5);
		MOUSE_WHEEL = new ClientPacket(49, 2);
		OPLOCU = new ClientPacket(50, 15);
		OPLOC3 = new ClientPacket(51, 7);
		FRIEND_CHAT_JOIN_LEAVE = new ClientPacket(52, -1);
		CLAN_KICKUSER = new ClientPacket(53, -1);
		OPPLAYER7 = new ClientPacket(54, 3);
		RESUME_NAMEDIALOG = new ClientPacket(55, -1);
		FRIEND_CHAT_SETRANK = new ClientPacket(56, -1);
		RESUME_OBJDIALOG = new ClientPacket(57, 2);
		CLAN_SETTINGS_ADD_BANNED_FROM_CHANNEL = new ClientPacket(58, -1);
		OPOBJ3 = new ClientPacket(59, 7);
		OPLOC5 = new ClientPacket(60, 7);
		IGNORE_DELUSER = new ClientPacket(61, -1);
		IF_BUTTONT = new ClientPacket(62, 16);
		EVENT_MOUSE_CLICK_V2 = new ClientPacket(63, 7);
		OPNPCU = new ClientPacket(64, 11);
		EVENT_MOUSE_CLICK = new ClientPacket(65, 6);
		OPPLAYER3 = new ClientPacket(66, 3);
		TELEPORT = new ClientPacket(67, 9);
		OPNPC2 = new ClientPacket(68, 3);
		SET_HEADING = new ClientPacket(69, 1);
		OPOBJ5 = new ClientPacket(70, 7);
		OPOBJ1 = new ClientPacket(71, 7);
		CHAT_SENDABUSEREPORT = new ClientPacket(72, -1);
		FRIEND_ADDUSER = new ClientPacket(73, -1);
		IF_RUNSCRIPT = new ClientPacket(74, -2);
		CLOSE_MODAL = new ClientPacket(75, 0);
		OPOBJT = new ClientPacket(76, 15);
		OPNPCT = new ClientPacket(77, 11);
		IF_SUBOP = new ClientPacket(78, 10);
		REFLECTION_CHECK_REPLY = new ClientPacket(79, -1);
		IF_CRMVIEW = new ClientPacket(80, 22);
		OPHELDD = new ClientPacket(81, 16);
		OPPLAYERT = new ClientPacket(82, 11);
		OPLOC4 = new ClientPacket(83, 7);
		PING_STATISTICS = new ClientPacket(84, 10);
		EVENT_APPLET_FOCUS = new ClientPacket(85, 1);
		UPDATE_PLAYER_MODEL = new ClientPacket(86, 26);
		EVENT_MOUSE_IDLE = new ClientPacket(87, 0);
		field3542 = new ClientPacket(88, -1);
		CHAT_SETFILTER = new ClientPacket(89, 3);
		NO_TIMEOUT = new ClientPacket(90, 0);
		OPNPC3 = new ClientPacket(91, 3);
		IGNORE_LIST_ADD = new ClientPacket(92, -1);
	}

	ClientPacket(int var1, int var2) {
		this.id = var1;
		this.length = var2;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ILce;ZB)I",
		garbageValue = "1"
	)
	static int method7013(int var0, Script var1, boolean var2) {
		Widget var3 = class167.widgetDefinition.method7456(Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = class255.Widget_unpackTargetMask(class516.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.IF_GETOP) {
			if (var0 == ScriptOpcodes.IF_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
			}

			return 1;
		}
	}
}
