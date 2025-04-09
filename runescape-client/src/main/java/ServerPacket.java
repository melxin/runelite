import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ms")
@Implements("ServerPacket")
public class ServerPacket {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket SET_NPC_UPDATE_ORIGIN;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket EVENT_WORLDHOP;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket MINIMAP_FLAG_SET;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket VAR_CLAN_DISABLE;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3515;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket UPDATE_INV_CLEAR;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket IF_OPENSUB;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket RESET_CLIENT_VARCACHE;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket NPC_SPOTANIM;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket HEAT_MAP;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket UPDATE_INV_FULL;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket IF_SETANIM;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket NPC_INFO_SMALL_VIEWPORT;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3551;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket TRIGGER_ONDIALOG_ABORT;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket FRIENDS_LIST_LOADED;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket SET_PRIVCHATMODE;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket IF_SETNPCHEAD;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket IF_SETCOLOUR;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket LOGOUT_FULL;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket UPDATE_IGNORELIST;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket REFLECTION_CHECKER;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket PLAYER_INFO;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket CAM_MOVETO;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket MIDI_SWAP;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket MIDI_SONG_STOP;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3637;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket CLAN_CHANNEL_DELTA;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket MESSAGE_PRIVATE;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket CAM_SETANGLE;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket REBUILD_WORLDENTITY;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	static final ServerPacket field3544;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3545;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket VARP_SMALL;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket IF_CLOSESUB;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket UPDATE_INV_PARTIAL;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket UPDATE_ZONE_PARTIAL_ENCLOSED;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket LOGOUT;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3575;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket UPDATE_ZONE_FULL_FOLLOWS;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket IF_MOVESUB;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket MAP_ANIM;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket CAM_MODE;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket IF_SETOBJECT;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket VAR_CLAN_ENABLE;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket IF_SET_EVENTS;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket IF_SET_PLAYERMODEL_OBJ;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket IF_SETANGLE;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket PLAYER_ANIM_SPECIFIC;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket NPC_HEADICON_SPECIFIC;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket PING_STATISTICS_REQUEST;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket IF_RESYNC;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket UPDATE_STOCKMARKET_SLOT;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3538;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket UPDATE_FRIENDLIST;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket MIDI_SONG;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket CAM_LOOKAT;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket REBUILD_REGION;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket IF_OPENTOP;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket IF_SET_ROTATE_SPEED;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket IF_SET_PLAYERMODEL_SELF;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket DYNAMICOBJECT_SPAWN;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket IF_SETMODEL;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket CAM_RESET;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket URL_OPEN;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket CAM_MOVE_TO;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket REBUILD_NORMAL;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket LOC_MERGEPLAYER;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket MESSAGE_FRIEND_PRIVATE;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket MESSAGE_FRIENDS_CHAT;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket LOC_ANIM;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket MINIMAP_TOGGLE;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket OBJ_ADD;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket SET_PLAYER_OP;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket HINT_ARROW;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3511;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket IF_SETNPCHEAD_ACTIVE;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3620;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket UPDATE_INV_STOP_TRANSIT;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket MIDI_JINGLE;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket VARP_LARGE;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket MESSAGE_CLAN_CHANNEL_SYSTEM;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket RUNCLIENTSCRIPT;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket IF_SETPLAYERHEAD;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket IF_SETPOSITION;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket CLAN_SETTINGS_FULL;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket SYNC_CLIENT_VARCACHE;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket GRAPHICSOBJECT_SPAWN;
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket MESSAGE_GAME;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket CAM_MOVETO_EASED_CIRCULAR;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket OCULUS_SYNC;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket IF_SETSCROLLPOS;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket IF_SET_TEXT;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket CAM_LOOKAT_EASED_COORD;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket IF_SET_PLAYERMODEL_BODYTYPE;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket PROJECTILE_SPAWN;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	static final ServerPacket field3517;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket NPC_SET_SEQUENCE;
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket MIDI_SONG_WITH_SECONDARY;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3612;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3613;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket UPDATE_REBOOT_TIMER;
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket NPC_INFO_LARGE_VIEWPORT;
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket OBJ_DEL;
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket CAM_SHAKE;
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket SERVER_TICK_END;
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket LOC_DEL;
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket PLAYER_SPOTANIM;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket CAM_SMOOTH_RESET;
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket CAM_LOOKAT_EASED_ANGLE_RELATIVE;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket OBJ_COUNT;
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket UPDATE_STAT;
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket UPDATE_SITE_SETTINGS;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3627;
	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket RESET_ANIMS;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket UPDATE_UID192;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket CLAN_SETTINGS_DELTA;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket VAR_CLAN;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket CLAN_CHANNEL_FULL;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket OBJ_OPFILTER;
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket IF_SET_PLAYERMODEL_BASECOLOUR;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3536;
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket UPDATE_TRADING_POST;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3562;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket MAP_PROJANIM;
	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3588;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket SET_ACTIVE_WORLD;
	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket OBJ_RESET_CUSTOMIZATION;
	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket RESET_INTERACTION_MODE;
	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3594;
	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket OBJ_SET_CUSTOMIZATION;
	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public static final ServerPacket field3525;
	@ObfuscatedName("lj")
	@ObfuscatedGetter(
		intValue = 1211714461
	)
	@Export("currentPort")
	static int currentPort;
	@ObfuscatedName("fm")
	@ObfuscatedGetter(
		intValue = 999050685
	)
	@Export("id")
	public final int id;
	@ObfuscatedName("fu")
	@ObfuscatedGetter(
		intValue = 1345090937
	)
	@Export("length")
	public final int length;

	static {
		SET_NPC_UPDATE_ORIGIN = new ServerPacket(0, 2);
		EVENT_WORLDHOP = new ServerPacket(1, -1);
		MINIMAP_FLAG_SET = new ServerPacket(2, 2);
		VAR_CLAN_DISABLE = new ServerPacket(3, 0);
		field3515 = new ServerPacket(4, 1);
		UPDATE_INV_CLEAR = new ServerPacket(5, 4);
		IF_OPENSUB = new ServerPacket(6, 7);
		RESET_CLIENT_VARCACHE = new ServerPacket(7, 0);
		NPC_SPOTANIM = new ServerPacket(8, 9);
		HEAT_MAP = new ServerPacket(9, 1);
		UPDATE_INV_FULL = new ServerPacket(10, -2);
		IF_SETANIM = new ServerPacket(11, 6);
		NPC_INFO_SMALL_VIEWPORT = new ServerPacket(12, -2);
		field3551 = new ServerPacket(13, 5);
		TRIGGER_ONDIALOG_ABORT = new ServerPacket(14, 0);
		FRIENDS_LIST_LOADED = new ServerPacket(15, 0);
		SET_PRIVCHATMODE = new ServerPacket(16, 1);
		IF_SETNPCHEAD = new ServerPacket(17, 6);
		UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER = new ServerPacket(18, -1);
		IF_SETCOLOUR = new ServerPacket(19, 6);
		LOGOUT_FULL = new ServerPacket(20, 0);
		UPDATE_IGNORELIST = new ServerPacket(21, -2);
		REFLECTION_CHECKER = new ServerPacket(22, -2);
		PLAYER_INFO = new ServerPacket(23, -2);
		CAM_MOVETO = new ServerPacket(24, 8);
		MIDI_SWAP = new ServerPacket(25, 8);
		MIDI_SONG_STOP = new ServerPacket(26, 4);
		field3637 = new ServerPacket(27, 2);
		CLAN_CHANNEL_DELTA = new ServerPacket(28, -2);
		MESSAGE_PRIVATE = new ServerPacket(29, -2);
		CAM_SETANGLE = new ServerPacket(30, 6);
		UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1 = new ServerPacket(31, -2);
		REBUILD_WORLDENTITY = new ServerPacket(32, -2);
		field3544 = new ServerPacket(33, -2);
		field3545 = new ServerPacket(34, 2);
		VARP_SMALL = new ServerPacket(35, 3);
		IF_CLOSESUB = new ServerPacket(36, 4);
		UPDATE_INV_PARTIAL = new ServerPacket(37, -2);
		UPDATE_ZONE_PARTIAL_ENCLOSED = new ServerPacket(38, -2);
		LOGOUT = new ServerPacket(39, 1);
		field3575 = new ServerPacket(40, -2);
		UPDATE_ZONE_FULL_FOLLOWS = new ServerPacket(41, 3);
		IF_MOVESUB = new ServerPacket(42, 8);
		MAP_ANIM = new ServerPacket(43, 6);
		CAM_MODE = new ServerPacket(44, 1);
		IF_SETOBJECT = new ServerPacket(45, 10);
		VAR_CLAN_ENABLE = new ServerPacket(46, 0);
		IF_SET_EVENTS = new ServerPacket(47, 12);
		IF_SET_PLAYERMODEL_OBJ = new ServerPacket(48, 8);
		IF_SETANGLE = new ServerPacket(49, 10);
		PLAYER_ANIM_SPECIFIC = new ServerPacket(50, 3);
		NPC_HEADICON_SPECIFIC = new ServerPacket(51, 9);
		PING_STATISTICS_REQUEST = new ServerPacket(52, 8);
		IF_RESYNC = new ServerPacket(53, -2);
		UPDATE_STOCKMARKET_SLOT = new ServerPacket(54, 20);
		field3538 = new ServerPacket(55, 4);
		UPDATE_FRIENDLIST = new ServerPacket(56, -2);
		MIDI_SONG = new ServerPacket(57, 10);
		CAM_LOOKAT = new ServerPacket(58, 7);
		REBUILD_REGION = new ServerPacket(59, -2);
		IF_OPENTOP = new ServerPacket(60, 2);
		IF_SET_ROTATE_SPEED = new ServerPacket(61, 8);
		IF_SET_PLAYERMODEL_SELF = new ServerPacket(62, 5);
		DYNAMICOBJECT_SPAWN = new ServerPacket(63, 6);
		IF_SETMODEL = new ServerPacket(64, 6);
		CAM_RESET = new ServerPacket(65, 0);
		URL_OPEN = new ServerPacket(66, -2);
		CAM_MOVE_TO = new ServerPacket(67, 6);
		REBUILD_NORMAL = new ServerPacket(68, -2);
		LOC_MERGEPLAYER = new ServerPacket(69, 14);
		MESSAGE_FRIEND_PRIVATE = new ServerPacket(70, -1);
		MESSAGE_FRIENDS_CHAT = new ServerPacket(71, -1);
		LOC_ANIM = new ServerPacket(72, 4);
		MINIMAP_TOGGLE = new ServerPacket(73, 1);
		OBJ_ADD = new ServerPacket(74, 14);
		SET_PLAYER_OP = new ServerPacket(75, -1);
		HINT_ARROW = new ServerPacket(76, 6);
		field3511 = new ServerPacket(77, 2);
		IF_SETNPCHEAD_ACTIVE = new ServerPacket(78, 6);
		field3620 = new ServerPacket(79, 5);
		UPDATE_INV_STOP_TRANSIT = new ServerPacket(80, 2);
		MIDI_JINGLE = new ServerPacket(81, 5);
		VARP_LARGE = new ServerPacket(82, 6);
		MESSAGE_CLAN_CHANNEL_SYSTEM = new ServerPacket(83, -1);
		RUNCLIENTSCRIPT = new ServerPacket(84, -2);
		IF_SETPLAYERHEAD = new ServerPacket(85, 4);
		IF_SETPOSITION = new ServerPacket(86, 8);
		CLAN_SETTINGS_FULL = new ServerPacket(87, -2);
		SYNC_CLIENT_VARCACHE = new ServerPacket(88, 0);
		GRAPHICSOBJECT_SPAWN = new ServerPacket(89, 8);
		MESSAGE_GAME = new ServerPacket(90, -1);
		CAM_MOVETO_EASED_CIRCULAR = new ServerPacket(91, 10);
		OCULUS_SYNC = new ServerPacket(92, 4);
		IF_SETSCROLLPOS = new ServerPacket(93, 6);
		IF_SET_TEXT = new ServerPacket(94, -2);
		CAM_LOOKAT_EASED_COORD = new ServerPacket(95, 7);
		IF_SET_PLAYERMODEL_BODYTYPE = new ServerPacket(96, 5);
		PROJECTILE_SPAWN = new ServerPacket(97, 22);
		field3517 = new ServerPacket(98, 7);
		NPC_SET_SEQUENCE = new ServerPacket(99, 5);
		MIDI_SONG_WITH_SECONDARY = new ServerPacket(100, 12);
		field3612 = new ServerPacket(101, -1);
		field3613 = new ServerPacket(102, 5);
		UPDATE_REBOOT_TIMER = new ServerPacket(103, 2);
		NPC_INFO_LARGE_VIEWPORT = new ServerPacket(104, -2);
		OBJ_DEL = new ServerPacket(105, 7);
		UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL = new ServerPacket(106, 3);
		CAM_SHAKE = new ServerPacket(107, 4);
		SERVER_TICK_END = new ServerPacket(108, 0);
		LOC_DEL = new ServerPacket(109, 2);
		PLAYER_SPOTANIM = new ServerPacket(110, 9);
		CAM_SMOOTH_RESET = new ServerPacket(111, 4);
		CAM_LOOKAT_EASED_ANGLE_RELATIVE = new ServerPacket(112, 7);
		OBJ_COUNT = new ServerPacket(113, 11);
		UPDATE_STAT = new ServerPacket(114, 7);
		UPDATE_SITE_SETTINGS = new ServerPacket(115, -1);
		field3627 = new ServerPacket(116, -2);
		RESET_ANIMS = new ServerPacket(117, 0);
		UPDATE_UID192 = new ServerPacket(118, 28);
		CLAN_SETTINGS_DELTA = new ServerPacket(119, -2);
		VAR_CLAN = new ServerPacket(120, -1);
		CLAN_CHANNEL_FULL = new ServerPacket(121, -2);
		OBJ_OPFILTER = new ServerPacket(122, 4);
		IF_SET_PLAYERMODEL_BASECOLOUR = new ServerPacket(123, 6);
		field3536 = new ServerPacket(124, 1);
		UPDATE_TRADING_POST = new ServerPacket(125, -2);
		field3562 = new ServerPacket(126, 1);
		MAP_PROJANIM = new ServerPacket(127, 20);
		field3588 = new ServerPacket(128, -2);
		SET_ACTIVE_WORLD = new ServerPacket(129, 3);
		OBJ_RESET_CUSTOMIZATION = new ServerPacket(130, 7);
		RESET_INTERACTION_MODE = new ServerPacket(131, 2);
		field3594 = new ServerPacket(132, 4);
		OBJ_SET_CUSTOMIZATION = new ServerPacket(133, 17);
		field3525 = new ServerPacket(134, 2);
	}

	ServerPacket(int var1, int var2) {
		this.id = var1;
		this.length = var2;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ldj;[BIII)V",
		garbageValue = "-675630744"
	)
	static final void method6560(WorldView var0, byte[] var1, int var2, int var3) {
		Buffer var4 = new Buffer(var1);
		int var5 = -1;

		while (true) {
			int var6 = var4.readIncrSmallSmart();
			if (var6 == 0) {
				return;
			}

			var5 += var6;
			int var7 = 0;

			while (true) {
				int var8 = var4.readUShortSmart();
				if (var8 == 0) {
					break;
				}

				var7 += var8 - 1;
				int var9 = var7 & 63;
				int var10 = var7 >> 6 & 63;
				int var11 = var7 >> 12;
				int var12 = var4.readUnsignedByte();
				int var13 = var12 >> 2;
				int var14 = var12 & 3;
				int var15 = var10 + var2;
				int var16 = var3 + var9;
				if (var15 > 0 && var16 > 0 && var15 < var0.tileHeights[0].length - 2 && var16 < var0.tileHeights[0][0].length - 2) {
					int var17 = var11;
					if ((var0.tileSettings[1][var15][var16] & 2) == 2) {
						var17 = var11 - 1;
					}

					CollisionMap var18 = null;
					if (var17 >= 0 && var0.collisionMaps != null) {
						var18 = var0.collisionMaps[var17];
					}

					class361.addObjects(var0, var11, var15, var16, var5, var14, var13, var18);
				}
			}
		}
	}
}
