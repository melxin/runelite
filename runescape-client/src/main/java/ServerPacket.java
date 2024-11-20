import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mg")
@Implements("ServerPacket")
public class ServerPacket {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket NPC_HEADICON_SPECIFIC;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket EVENT_WORLDHOP;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket CLAN_SETTINGS_FULL;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket MINIMAP_TOGGLE;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket CAM_SHAKE;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket OBJ_ADD;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket SET_ACTIVE_WORLD;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket IF_SETCOLOUR;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket IF_SETHIDE;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket CAM_RESET;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket IF_RESYNC;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket IF_SETMODEL;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket RUNCLIENTSCRIPT;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket IF_SET_TEXT;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket field3456;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket MESSAGE_PRIVATE;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket CAM_LOOKAT_EASED_COORD;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket UPDATE_SITE_SETTINGS;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket CAM_TARGET;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket REFLECTION_CHECKER;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket UPDATE_INV_CLEAR;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket IF_SETNPCHEAD_ACTIVE;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket REBUILD_NORMAL;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket SERVER_TICK_END;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket REBUILD_WORLDENTITY;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket UPDATE_RUN_ENERGY;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket VAR_CLAN_ENABLE;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket IF_SETNPCHEAD;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket MIDI_SONG_WITH_SECONDARY;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket SET_PRIVCHATMODE;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket UPDATE_UID192;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket FRIENDS_LIST_LOADED;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket OBJ_COUNT;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket PLAYER_SPOTANIM;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	static final ServerPacket field3476;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket OBJ_DEL;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket field3458;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket HINT_ARROW;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket RESET_CLIENT_VARCACHE;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket UPDATE_FRIENDLIST;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket CLEAR_ENTITIES;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket UPDATE_TRADING_POST;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket IF_MOVESUB;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket UPDATE_ZONE_FULL_FOLLOWS;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket CLAN_CHANNEL_FULL;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket VARP_SMALL;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket PLAYER_INFO;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket LOC_DEL;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket UPDATE_RUN_WEIGHT;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket IF_SETANGLE;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket UPDATE_INV_STOP_TRANSIT;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket IF_SET_PLAYERMODEL_SELF;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket CAM_LOOKAT;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	static final ServerPacket field3495;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket UPDATE_STOCKMARKET_SLOT;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket CAM_MOVE_TO;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket MAP_PROJANIM;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket SET_NPC_UPDATE_ORIGIN;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket SET_PLAYER_OP;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket MESSAGE_CLAN_CHANNEL_SYSTEM;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket IF_SETANIM;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket IF_SETPOSITION;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket CAM_MOVETO;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket MIDI_SWAP;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket VARP_LARGE;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket NPC_SET_SEQUENCE;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket IF_SET_PLAYERMODEL_BASECOLOUR;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket CAM_MODE;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket UPDATE_ZONE_PARTIAL_ENCLOSED;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket TRIGGER_ONDIALOG_ABORT;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket SYNC_CLIENT_VARCACHE;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket MIDI_SONG_STOP;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket REBUILD_REGION;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket HEAT_MAP;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket MAP_ANIM;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket IF_SETOBJECT;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket field3520;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket field3462;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket RESET_ANIMS;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket MIDI_JINGLE;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket UPDATE_IGNORELIST;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket PLAYER_ANIM_SPECIFIC;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket URL_OPEN;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket CAM_MOVETO_EASED_CIRCULAR;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket MESSAGE_GAME;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket IF_SET_EVENTS;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket CLAN_SETTINGS_DELTA;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket UPDATE_STAT;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket CLAN_CHANNEL_DELTA;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket CAM_SMOOTH_RESET;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket IF_SET_PLAYERMODEL_BODYTYPE;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket DYNAMICOBJECT_SPAWN;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket CAM_LOOKAT_EASED_ANGLE_RELATIVE;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket MINIMAP_FLAG_SET;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket CHAT_FILTER_SETTINGS;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket NPC_SPOTANIM;
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket IF_SETPLAYERHEAD;
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket IF_OPENTOP;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket OCULUS_SYNC;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket LOC_MERGEPLAYER;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket IF_CLOSESUB;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket GRAPHICSOBJECT_SPAWN;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket MESSAGE_FRIENDS_CHAT;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket LOGOUT_FULL;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket UPDATE_INV_FULL;
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket VAR_CLAN_DISABLE;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket PROJECTILE_SPAWN;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket field3551;
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket field3471;
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket UPDATE_REBOOT_TIMER;
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket IF_SET_ROTATE_SPEED;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket field3555;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket VAR_CLAN;
	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket PING_STATISTICS_REQUEST;
	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket IF_OPENSUB;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket CAM_SETANGLE;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket MESSAGE_PRIVATE_ECHO;
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket LOGOUT;
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket LOC_ANIM;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket IF_SETSCROLLPOS;
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket field3564;
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket IF_SET_PLAYERMODEL_OBJ;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket UPDATE_INV_PARTIAL;
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket LOC_ADD_CHANGE;
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket MIDI_SONG;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket OBJ_OPFILTER;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket field3457;
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket RESET_INTERACTION_MODE;
	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket field3572;
	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket OBJ_SET_CUSTOMIZATION;
	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket OBJ_RESET_CUSTOMIZATION;
	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket field3550;
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket field3576;
	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	public static final ServerPacket field3511;
	@ObfuscatedName("fj")
	@ObfuscatedGetter(
		intValue = 1745306065
	)
	@Export("id")
	public final int id;
	@ObfuscatedName("fm")
	@ObfuscatedGetter(
		intValue = 491518543
	)
	@Export("length")
	public final int length;

	static {
		NPC_HEADICON_SPECIFIC = new ServerPacket(0, 9);
		EVENT_WORLDHOP = new ServerPacket(1, -1);
		CLAN_SETTINGS_FULL = new ServerPacket(2, -2);
		MINIMAP_TOGGLE = new ServerPacket(3, 1);
		CAM_SHAKE = new ServerPacket(4, 4);
		OBJ_ADD = new ServerPacket(5, 14);
		SET_ACTIVE_WORLD = new ServerPacket(6, 4);
		IF_SETCOLOUR = new ServerPacket(7, 6);
		IF_SETHIDE = new ServerPacket(8, 5);
		CAM_RESET = new ServerPacket(9, 0);
		IF_RESYNC = new ServerPacket(10, -2);
		IF_SETMODEL = new ServerPacket(11, 6);
		RUNCLIENTSCRIPT = new ServerPacket(12, -2);
		IF_SET_TEXT = new ServerPacket(13, -2);
		field3456 = new ServerPacket(14, 1);
		field3458 = new ServerPacket(15, -1);
		CAM_LOOKAT_EASED_COORD = new ServerPacket(16, 7);
		UPDATE_SITE_SETTINGS = new ServerPacket(17, -1);
		CAM_TARGET = new ServerPacket(18, 5);
		REFLECTION_CHECKER = new ServerPacket(19, -2);
		UPDATE_INV_CLEAR = new ServerPacket(20, 4);
		IF_SETNPCHEAD_ACTIVE = new ServerPacket(21, 6);
		REBUILD_NORMAL = new ServerPacket(22, -2);
		SERVER_TICK_END = new ServerPacket(23, 0);
		REBUILD_WORLDENTITY = new ServerPacket(24, -2);
		UPDATE_RUN_ENERGY = new ServerPacket(25, 2);
		VAR_CLAN_ENABLE = new ServerPacket(26, 0);
		IF_SETNPCHEAD = new ServerPacket(27, 6);
		MIDI_SONG_WITH_SECONDARY = new ServerPacket(28, 12);
		SET_PRIVCHATMODE = new ServerPacket(29, 1);
		UPDATE_UID192 = new ServerPacket(30, 28);
		FRIENDS_LIST_LOADED = new ServerPacket(31, 0);
		OBJ_COUNT = new ServerPacket(32, 11);
		PLAYER_SPOTANIM = new ServerPacket(33, 9);
		field3476 = new ServerPacket(34, -2);
		OBJ_DEL = new ServerPacket(35, 7);
		MESSAGE_PRIVATE = new ServerPacket(36, -2);
		HINT_ARROW = new ServerPacket(37, 6);
		RESET_CLIENT_VARCACHE = new ServerPacket(38, 0);
		UPDATE_FRIENDLIST = new ServerPacket(39, -2);
		CLEAR_ENTITIES = new ServerPacket(40, 0);
		UPDATE_TRADING_POST = new ServerPacket(41, -2);
		IF_MOVESUB = new ServerPacket(42, 8);
		UPDATE_ZONE_FULL_FOLLOWS = new ServerPacket(43, 3);
		CLAN_CHANNEL_FULL = new ServerPacket(44, -2);
		VARP_SMALL = new ServerPacket(45, 3);
		PLAYER_INFO = new ServerPacket(46, -2);
		LOC_DEL = new ServerPacket(47, 2);
		UPDATE_RUN_WEIGHT = new ServerPacket(48, 2);
		IF_SETANGLE = new ServerPacket(49, 10);
		UPDATE_INV_STOP_TRANSIT = new ServerPacket(50, 2);
		IF_SET_PLAYERMODEL_SELF = new ServerPacket(51, 5);
		CAM_LOOKAT = new ServerPacket(52, 7);
		field3495 = new ServerPacket(53, 7);
		UPDATE_STOCKMARKET_SLOT = new ServerPacket(54, 20);
		CAM_MOVE_TO = new ServerPacket(55, 6);
		MAP_PROJANIM = new ServerPacket(56, 20);
		SET_NPC_UPDATE_ORIGIN = new ServerPacket(57, 2);
		SET_PLAYER_OP = new ServerPacket(58, -1);
		MESSAGE_CLAN_CHANNEL_SYSTEM = new ServerPacket(59, -1);
		IF_SETANIM = new ServerPacket(60, 6);
		IF_SETPOSITION = new ServerPacket(61, 8);
		UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL = new ServerPacket(62, 3);
		CAM_MOVETO = new ServerPacket(63, 8);
		MIDI_SWAP = new ServerPacket(64, 8);
		VARP_LARGE = new ServerPacket(65, 6);
		NPC_SET_SEQUENCE = new ServerPacket(66, 5);
		IF_SET_PLAYERMODEL_BASECOLOUR = new ServerPacket(67, 6);
		CAM_MODE = new ServerPacket(68, 1);
		UPDATE_ZONE_PARTIAL_ENCLOSED = new ServerPacket(69, -2);
		TRIGGER_ONDIALOG_ABORT = new ServerPacket(70, 0);
		SYNC_CLIENT_VARCACHE = new ServerPacket(71, 0);
		MIDI_SONG_STOP = new ServerPacket(72, 4);
		REBUILD_REGION = new ServerPacket(73, -2);
		HEAT_MAP = new ServerPacket(74, 1);
		MAP_ANIM = new ServerPacket(75, 6);
		IF_SETOBJECT = new ServerPacket(76, 10);
		UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER = new ServerPacket(77, -1);
		field3520 = new ServerPacket(78, -2);
		field3462 = new ServerPacket(79, 1);
		RESET_ANIMS = new ServerPacket(80, 0);
		MIDI_JINGLE = new ServerPacket(81, 5);
		UPDATE_IGNORELIST = new ServerPacket(82, -2);
		PLAYER_ANIM_SPECIFIC = new ServerPacket(83, 3);
		URL_OPEN = new ServerPacket(84, -2);
		CAM_MOVETO_EASED_CIRCULAR = new ServerPacket(85, 10);
		MESSAGE_GAME = new ServerPacket(86, -1);
		IF_SET_EVENTS = new ServerPacket(87, 12);
		CLAN_SETTINGS_DELTA = new ServerPacket(88, -2);
		UPDATE_STAT = new ServerPacket(89, 7);
		CLAN_CHANNEL_DELTA = new ServerPacket(90, -2);
		CAM_SMOOTH_RESET = new ServerPacket(91, 4);
		IF_SET_PLAYERMODEL_BODYTYPE = new ServerPacket(92, 5);
		DYNAMICOBJECT_SPAWN = new ServerPacket(93, 6);
		CAM_LOOKAT_EASED_ANGLE_RELATIVE = new ServerPacket(94, 7);
		MINIMAP_FLAG_SET = new ServerPacket(95, 2);
		CHAT_FILTER_SETTINGS = new ServerPacket(96, 2);
		NPC_SPOTANIM = new ServerPacket(97, 9);
		IF_SETPLAYERHEAD = new ServerPacket(98, 4);
		IF_OPENTOP = new ServerPacket(99, 2);
		OCULUS_SYNC = new ServerPacket(100, 4);
		LOC_MERGEPLAYER = new ServerPacket(101, 14);
		IF_CLOSESUB = new ServerPacket(102, 4);
		GRAPHICSOBJECT_SPAWN = new ServerPacket(103, 8);
		MESSAGE_FRIENDS_CHAT = new ServerPacket(104, -1);
		LOGOUT_FULL = new ServerPacket(105, 0);
		UPDATE_INV_FULL = new ServerPacket(106, -2);
		VAR_CLAN_DISABLE = new ServerPacket(107, 0);
		PROJECTILE_SPAWN = new ServerPacket(108, 22);
		field3551 = new ServerPacket(109, -2);
		field3471 = new ServerPacket(110, -1);
		UPDATE_REBOOT_TIMER = new ServerPacket(111, 2);
		IF_SET_ROTATE_SPEED = new ServerPacket(112, 8);
		field3555 = new ServerPacket(113, 5);
		VAR_CLAN = new ServerPacket(114, -1);
		PING_STATISTICS_REQUEST = new ServerPacket(115, 8);
		IF_OPENSUB = new ServerPacket(116, 7);
		CAM_SETANGLE = new ServerPacket(117, 6);
		MESSAGE_PRIVATE_ECHO = new ServerPacket(118, -2);
		LOGOUT = new ServerPacket(119, 1);
		LOC_ANIM = new ServerPacket(120, 4);
		IF_SETSCROLLPOS = new ServerPacket(121, 6);
		field3564 = new ServerPacket(122, 1);
		IF_SET_PLAYERMODEL_OBJ = new ServerPacket(123, 8);
		UPDATE_INV_PARTIAL = new ServerPacket(124, -2);
		LOC_ADD_CHANGE = new ServerPacket(125, 5);
		MIDI_SONG = new ServerPacket(126, 10);
		OBJ_OPFILTER = new ServerPacket(127, 4);
		field3457 = new ServerPacket(128, 4);
		RESET_INTERACTION_MODE = new ServerPacket(129, 2);
		field3572 = new ServerPacket(130, -2);
		OBJ_SET_CUSTOMIZATION = new ServerPacket(131, 17);
		OBJ_RESET_CUSTOMIZATION = new ServerPacket(132, 7);
		field3550 = new ServerPacket(133, -2);
		field3576 = new ServerPacket(134, 2);
		field3511 = new ServerPacket(135, -2);
	}

	ServerPacket(int var1, int var2) {
		this.id = var1;
		this.length = var2;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-73"
	)
	public static int method6470(int var0) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}
}
