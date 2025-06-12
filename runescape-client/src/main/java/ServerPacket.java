import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mv")
@Implements("ServerPacket")
public class ServerPacket {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket VARP_SMALL;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket CLAN_CHANNEL_FULL;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	static final ServerPacket field3509;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket VAR_CLAN_ENABLE;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket field3511;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket REFLECTION_CHECKER;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket CLAN_SETTINGS_FULL;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket LOC_ANIM;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket CAM_MOVETO;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket TRIGGER_ONDIALOG_ABORT;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket UPDATE_ZONE_FULL_FOLLOWS;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket NPC_INFO_LARGE_VIEWPORT;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket VARP_LARGE;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket RESET_CLIENT_VARCACHE;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket MESSAGE_FRIEND_PRIVATE;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket UPDATE_INV_STOP_TRANSIT;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket CAM_SMOOTH_RESET;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket CLAN_CHANNEL_DELTA;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket CHAT_FILTER_SETTINGS;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket LOC_ADD_CHANGE;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket field3528;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket OBJ_COUNT;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket REBUILD_NORMAL;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket IF_MOVESUB;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket UPDATE_REBOOT_TIMER;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket LOC_MERGEPLAYER;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket UPDATE_FRIENDLIST;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket REBUILD_REGION;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket MESSAGE_CLAN_CHANNEL_SYSTEM;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket MESSAGE_FRIENDS_CHAT;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket MESSAGE_PRIVATE;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket OBJ_OPFILTER;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	static final ServerPacket field3540;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket IF_SET_PLAYERMODEL_BASECOLOUR;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket UPDATE_INV_PARTIAL;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket RUNCLIENTSCRIPT;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket MESSAGE_PRIVATE_ECHO;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket UPDATE_STAT;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket CAM_LOOKAT_EASED_COORD;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket SERVER_TICK_END;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket IF_SETNPCHEAD;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket field3549;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket IF_SET_TEXT;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket NPC_SPOTANIM;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket NPC_SET_SEQUENCE;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket SET_PRIVCHATMODE;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket REBUILD_WORLDENTITY;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket EVENT_WORLDHOP;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket IF_SETANGLE;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket IF_SETOBJECT;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket MINIMAP_TOGGLE;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket CAM_SHAKE;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket IF_SETNPCHEAD_ACTIVE;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket IF_SETSCROLLPOS;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket UPDATE_ZONE_PARTIAL_ENCLOSED;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket field3563;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket field3564;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket IF_SETPLAYERHEAD;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket HINT_ARROW;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket IF_SETANIM;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket IF_SETCOLOUR;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket URL_OPEN;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket UPDATE_UID192;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket CAM_RESET;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket field3572;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket CAM_SETANGLE;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket MIDI_JINGLE;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket FRIENDS_LIST_LOADED;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket PING_STATISTICS_REQUEST;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket IF_SETMODEL;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket UPDATE_SITE_SETTINGS;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket HEAT_MAP;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket OBJ_ADD;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket MIDI_SWAP;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket SET_PLAYER_OP;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket SET_NPC_UPDATE_ORIGIN;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket NPC_INFO_SMALL_VIEWPORT;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket CAM_MOVE_TO;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket IF_SET_EVENTS;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket IF_OPENTOP;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket IF_SETHIDE;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket IF_SET_PLAYERMODEL_BODYTYPE;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket IF_SET_PLAYERMODEL_OBJ;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket IF_SET_ROTATE_SPEED;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket VAR_CLAN_DISABLE;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket IF_OPENSUB;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket CLAN_SETTINGS_DELTA;
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket MIDI_SONG_STOP;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket IF_CLOSESUB;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket CAM_TARGET;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket PLAYER_ANIM_SPECIFIC;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket UPDATE_INV_FULL;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket MINIMAP_FLAG_SET;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket MESSAGE_GAME;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket LOGOUT_FULL;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket OCULUS_SYNC;
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket field3605;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket CAM_LOOKAT_EASED_ANGLE_RELATIVE;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket SYNC_CLIENT_VARCACHE;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket UPDATE_IGNORELIST;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket MAP_ANIM;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket CAM_LOOKAT;
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket CAM_MOVETO_EASED_CIRCULAR;
	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket IF_SET_PLAYERMODEL_SELF;
	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket MIDI_SONG;
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket RESET_ANIMS;
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket IF_SETPOSITION;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket OBJ_DEL;
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket PLAYER_SPOTANIM;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket LOGOUT;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket NPC_HEADICON_SPECIFIC;
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket VAR_CLAN;
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket PLAYER_INFO;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket CAM_MODE;
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket MAP_PROJANIM;
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket UPDATE_INV_CLEAR;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket GRAPHICSOBJECT_SPAWN;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket UPDATE_STOCKMARKET_SLOT;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket DYNAMICOBJECT_SPAWN;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket UPDATE_FRIEND_CHAT_CHANNEL_FULL_V2;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket MIDI_SONG_WITH_SECONDARY;
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket field3630;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket PROJECTILE_SPAWN;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket UPDATE_TRADING_POST;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket LOC_DEL;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket field3634;
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket RESET_INTERACTION_MODE;
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket OBJ_RESET_CUSTOMIZATION;
	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket field3637;
	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket field3638;
	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket field3639;
	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket OBJ_SET_CUSTOMIZATION;
	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket field3641;
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket SET_ACTIVE_WORLD;
	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final ServerPacket field3643;
	@ObfuscatedName("fi")
	@ObfuscatedGetter(
		intValue = -2131371087
	)
	@Export("id")
	public final int id;
	@ObfuscatedName("fx")
	@ObfuscatedGetter(
		intValue = -1430198149
	)
	@Export("length")
	public final int length;

	static {
		VARP_SMALL = new ServerPacket(0, 3);
		CLAN_CHANNEL_FULL = new ServerPacket(1, -2);
		field3509 = new ServerPacket(2, 7);
		VAR_CLAN_ENABLE = new ServerPacket(3, 0);
		field3511 = new ServerPacket(4, 2);
		REFLECTION_CHECKER = new ServerPacket(5, -2);
		CLAN_SETTINGS_FULL = new ServerPacket(6, -2);
		LOC_ANIM = new ServerPacket(7, 4);
		CAM_MOVETO = new ServerPacket(8, 8);
		TRIGGER_ONDIALOG_ABORT = new ServerPacket(9, 0);
		UPDATE_ZONE_FULL_FOLLOWS = new ServerPacket(10, 3);
		UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL = new ServerPacket(11, 3);
		NPC_INFO_LARGE_VIEWPORT = new ServerPacket(12, -2);
		VARP_LARGE = new ServerPacket(13, 6);
		RESET_CLIENT_VARCACHE = new ServerPacket(14, 0);
		MESSAGE_FRIEND_PRIVATE = new ServerPacket(15, -1);
		UPDATE_INV_STOP_TRANSIT = new ServerPacket(16, 2);
		CAM_SMOOTH_RESET = new ServerPacket(17, 4);
		CLAN_CHANNEL_DELTA = new ServerPacket(18, -2);
		CHAT_FILTER_SETTINGS = new ServerPacket(19, 2);
		LOC_ADD_CHANGE = new ServerPacket(20, -2);
		field3528 = new ServerPacket(21, 1);
		OBJ_COUNT = new ServerPacket(22, 11);
		REBUILD_NORMAL = new ServerPacket(23, -2);
		IF_MOVESUB = new ServerPacket(24, 8);
		UPDATE_REBOOT_TIMER = new ServerPacket(25, 2);
		LOC_MERGEPLAYER = new ServerPacket(26, 14);
		UPDATE_FRIENDLIST = new ServerPacket(27, -2);
		REBUILD_REGION = new ServerPacket(28, -2);
		MESSAGE_CLAN_CHANNEL_SYSTEM = new ServerPacket(29, -1);
		MESSAGE_FRIENDS_CHAT = new ServerPacket(30, -1);
		MESSAGE_PRIVATE = new ServerPacket(31, -2);
		OBJ_OPFILTER = new ServerPacket(32, 4);
		field3540 = new ServerPacket(33, -2);
		IF_SET_PLAYERMODEL_BASECOLOUR = new ServerPacket(34, 6);
		UPDATE_INV_PARTIAL = new ServerPacket(35, -2);
		RUNCLIENTSCRIPT = new ServerPacket(36, -2);
		MESSAGE_PRIVATE_ECHO = new ServerPacket(37, -2);
		UPDATE_STAT = new ServerPacket(38, 7);
		CAM_LOOKAT_EASED_COORD = new ServerPacket(39, 7);
		SERVER_TICK_END = new ServerPacket(40, 0);
		IF_SETNPCHEAD = new ServerPacket(41, 6);
		field3549 = new ServerPacket(42, -2);
		IF_SET_TEXT = new ServerPacket(43, -2);
		NPC_SPOTANIM = new ServerPacket(44, 9);
		NPC_SET_SEQUENCE = new ServerPacket(45, 5);
		SET_PRIVCHATMODE = new ServerPacket(46, 1);
		REBUILD_WORLDENTITY = new ServerPacket(47, -2);
		EVENT_WORLDHOP = new ServerPacket(48, -1);
		IF_SETANGLE = new ServerPacket(49, 10);
		IF_SETOBJECT = new ServerPacket(50, 10);
		MINIMAP_TOGGLE = new ServerPacket(51, 1);
		CAM_SHAKE = new ServerPacket(52, 4);
		IF_SETNPCHEAD_ACTIVE = new ServerPacket(53, 6);
		IF_SETSCROLLPOS = new ServerPacket(54, 6);
		UPDATE_ZONE_PARTIAL_ENCLOSED = new ServerPacket(55, -2);
		field3563 = new ServerPacket(56, 5);
		field3564 = new ServerPacket(57, 4);
		IF_SETPLAYERHEAD = new ServerPacket(58, 4);
		HINT_ARROW = new ServerPacket(59, 6);
		IF_SETANIM = new ServerPacket(60, 6);
		IF_SETCOLOUR = new ServerPacket(61, 6);
		URL_OPEN = new ServerPacket(62, -2);
		UPDATE_UID192 = new ServerPacket(63, 28);
		CAM_RESET = new ServerPacket(64, 0);
		field3572 = new ServerPacket(65, 1);
		CAM_SETANGLE = new ServerPacket(66, 6);
		MIDI_JINGLE = new ServerPacket(67, 5);
		FRIENDS_LIST_LOADED = new ServerPacket(68, 0);
		PING_STATISTICS_REQUEST = new ServerPacket(69, 8);
		IF_SETMODEL = new ServerPacket(70, 6);
		UPDATE_SITE_SETTINGS = new ServerPacket(71, -1);
		HEAT_MAP = new ServerPacket(72, 1);
		OBJ_ADD = new ServerPacket(73, 14);
		MIDI_SWAP = new ServerPacket(74, 8);
		SET_PLAYER_OP = new ServerPacket(75, -1);
		SET_NPC_UPDATE_ORIGIN = new ServerPacket(76, 2);
		NPC_INFO_SMALL_VIEWPORT = new ServerPacket(77, -2);
		CAM_MOVE_TO = new ServerPacket(78, 6);
		IF_SET_EVENTS = new ServerPacket(79, 12);
		IF_OPENTOP = new ServerPacket(80, 2);
		IF_SETHIDE = new ServerPacket(81, 5);
		UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1 = new ServerPacket(82, -1);
		IF_SET_PLAYERMODEL_BODYTYPE = new ServerPacket(83, 5);
		IF_SET_PLAYERMODEL_OBJ = new ServerPacket(84, 8);
		IF_SET_ROTATE_SPEED = new ServerPacket(85, 8);
		VAR_CLAN_DISABLE = new ServerPacket(86, 0);
		IF_OPENSUB = new ServerPacket(87, 7);
		CLAN_SETTINGS_DELTA = new ServerPacket(88, -2);
		MIDI_SONG_STOP = new ServerPacket(89, 4);
		IF_CLOSESUB = new ServerPacket(90, 4);
		CAM_TARGET = new ServerPacket(91, 5);
		PLAYER_ANIM_SPECIFIC = new ServerPacket(92, 3);
		UPDATE_INV_FULL = new ServerPacket(93, -2);
		MINIMAP_FLAG_SET = new ServerPacket(94, 2);
		MESSAGE_GAME = new ServerPacket(95, -1);
		LOGOUT_FULL = new ServerPacket(96, 0);
		OCULUS_SYNC = new ServerPacket(97, 4);
		field3605 = new ServerPacket(98, 2);
		CAM_LOOKAT_EASED_ANGLE_RELATIVE = new ServerPacket(99, 7);
		SYNC_CLIENT_VARCACHE = new ServerPacket(100, 0);
		UPDATE_IGNORELIST = new ServerPacket(101, -2);
		MAP_ANIM = new ServerPacket(102, 6);
		CAM_LOOKAT = new ServerPacket(103, 7);
		CAM_MOVETO_EASED_CIRCULAR = new ServerPacket(104, 10);
		IF_SET_PLAYERMODEL_SELF = new ServerPacket(105, 5);
		MIDI_SONG = new ServerPacket(106, 10);
		RESET_ANIMS = new ServerPacket(107, 0);
		IF_SETPOSITION = new ServerPacket(108, 8);
		OBJ_DEL = new ServerPacket(109, 7);
		PLAYER_SPOTANIM = new ServerPacket(110, 9);
		LOGOUT = new ServerPacket(111, 1);
		NPC_HEADICON_SPECIFIC = new ServerPacket(112, 9);
		VAR_CLAN = new ServerPacket(113, -1);
		PLAYER_INFO = new ServerPacket(114, -2);
		CAM_MODE = new ServerPacket(115, 1);
		MAP_PROJANIM = new ServerPacket(116, 20);
		UPDATE_INV_CLEAR = new ServerPacket(117, 4);
		GRAPHICSOBJECT_SPAWN = new ServerPacket(118, 8);
		UPDATE_STOCKMARKET_SLOT = new ServerPacket(119, 20);
		DYNAMICOBJECT_SPAWN = new ServerPacket(120, 6);
		UPDATE_FRIEND_CHAT_CHANNEL_FULL_V2 = new ServerPacket(121, -2);
		MIDI_SONG_WITH_SECONDARY = new ServerPacket(122, 12);
		field3630 = new ServerPacket(123, -1);
		PROJECTILE_SPAWN = new ServerPacket(124, 22);
		UPDATE_TRADING_POST = new ServerPacket(125, -2);
		LOC_DEL = new ServerPacket(126, 2);
		field3634 = new ServerPacket(127, 1);
		RESET_INTERACTION_MODE = new ServerPacket(128, 2);
		OBJ_RESET_CUSTOMIZATION = new ServerPacket(129, 7);
		field3637 = new ServerPacket(130, 16);
		field3638 = new ServerPacket(131, 2);
		field3639 = new ServerPacket(132, -2);
		OBJ_SET_CUSTOMIZATION = new ServerPacket(133, 17);
		field3641 = new ServerPacket(134, 27);
		SET_ACTIVE_WORLD = new ServerPacket(135, 3);
		field3643 = new ServerPacket(136, -2);
	}

	ServerPacket(int var1, int var2) {
		this.id = var1;
		this.length = var2;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZI)I",
		garbageValue = "1588788298"
	)
	static int method6842(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
			Interpreter.Interpreter_intStackSize -= 2;
			Client.field358 = (short)class511.method10047(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
			if (Client.field358 <= 0) {
				Client.field358 = 256;
			}

			Client.field359 = (short)class511.method10047(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
			if (Client.field359 <= 0) {
				Client.field359 = 256;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
			Interpreter.Interpreter_intStackSize -= 2;
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			if (Client.zoomHeight <= 0) {
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			if (Client.zoomWidth <= 0) {
				Client.zoomWidth = 320;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
			Interpreter.Interpreter_intStackSize -= 4;
			Client.field362 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			if (Client.field362 <= 0) {
				Client.field362 = 1;
			}

			Client.field363 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			if (Client.field363 <= 0) {
				Client.field363 = 32767;
			} else if (Client.field363 < Client.field362) {
				Client.field363 = Client.field362;
			}

			Client.field364 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
			if (Client.field364 <= 0) {
				Client.field364 = 1;
			}

			Client.field365 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
			if (Client.field365 <= 0) {
				Client.field365 = 32767;
			} else if (Client.field365 < Client.field364) {
				Client.field365 = Client.field364;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
			if (Client.viewportWidget != null) {
				class180.setViewportShape(0, 0, Client.viewportWidget.width * -1805166981, Client.viewportWidget.height * -2133353239, false);
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportWidth;
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportHeight;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomHeight;
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ClanMate.method9567(Client.field358);
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ClanMate.method9567(Client.field359);
			return 1;
		} else if (var0 == 6220) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GameEngine.canvasWidth;
			return 1;
		} else if (var0 == 6223) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GameEngine.canvasHeight;
			return 1;
		} else {
			return 2;
		}
	}
}
