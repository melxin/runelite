import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mn")
@Implements("ServerPacket")
public class ServerPacket {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket SET_PLAYER_OP;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket CAM_LOOKAT;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket IF_SETNPCHEAD;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket IF_SET_EVENTS;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket GRAPHICSOBJECT_SPAWN;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket DYNAMICOBJECT_SPAWN;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket MIDI_JINGLE;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket LOC_ANIM;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket LOC_DEL;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket IF_SETANGLE;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket UPDATE_RUN_ENERGY;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket IF_SETPOSITION;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket RUNCLIENTSCRIPT;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket IF_SET_PLAYERMODEL_BASECOLOUR;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket CAM_LOOKAT_EASED_ANGLE_RELATIVE;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket UPDATE_FRIENDLIST;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket VAR_CLAN_DISABLE;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket UPDATE_ZONE_PARTIAL_ENCLOSED;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket IF_OPENTOP;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket OBJ_ADD;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket OBJ_DEL;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket REBUILD_WORLDENTITY;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket LOGOUT;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket OCULUS_SYNC;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket IF_RESYNC;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket MIDI_SWAP;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket NPC_SPOTANIM;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket VARP_SMALL;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket MAP_PROJANIM;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket CAM_LOOKAT_EASED_COORD;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket CAM_SHAKE;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket REBUILD_REGION;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket UPDATE_INV_CLEAR;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket PING_STATISTICS_REQUEST;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket IF_SETMODEL;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket MIDI_SONG_WITH_SECONDARY;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket EVENT_WORLDHOP;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket URL_OPEN;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket IF_SETANIM;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket CAM_TARGET;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket field3483;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket HEAT_MAP;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket VAR_CLAN;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket IF_MOVESUB;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket LOC_ADD_CHANGE;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket CAM_RESET;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket OBJ_OPFILTER;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket LOGOUT_FULL;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket MESSAGE_FRIENDS_CHAT;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket UPDATE_RUN_WEIGHT;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket CAM_MOVETO_EASED_CIRCULAR;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket IF_SETSCROLLPOS;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket PLAYER_SPOTANIM;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket field3496;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket IF_SETOBJECT;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket VAR_CLAN_ENABLE;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket MESSAGE_GAME;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket CAM_MODE;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket REBUILD_NORMAL;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket IF_SETPLAYERHEAD;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket CLAN_CHANNEL_FULL;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket IF_SETHIDE;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket MINIMAP_FLAG_SET;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	static final ServerPacket field3506;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket UPDATE_STOCKMARKET_SLOT;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket VARP_LARGE;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket UPDATE_UID192;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket MIDI_SONG_STOP;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket CLAN_SETTINGS_FULL;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket IF_SETCOLOUR;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket IF_SET_PLAYERMODEL_BODYTYPE;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket TRIGGER_ONDIALOG_ABORT;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket UPDATE_SITE_SETTINGS;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket UPDATE_REBOOT_TIMER;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket CAM_MOVETO;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket UPDATE_TRADING_POST;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket UPDATE_INV_PARTIAL;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket HINT_ARROW;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket PLAYER_ANIM_SPECIFIC;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket IF_SET_ROTATE_SPEED;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket CAM_MOVE_TO;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket NPC_HEADICON_SPECIFIC;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket MAP_ANIM;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket field3526;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket CAM_SMOOTH_RESET;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket CLAN_SETTINGS_DELTA;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket SERVER_TICK_END;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket IF_OPENSUB;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket SYNC_CLIENT_VARCACHE;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket SET_ACTIVE_WORLD;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	static final ServerPacket field3533;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket RESET_ANIMS;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket MESSAGE_CLAN_CHANNEL_SYSTEM;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket UPDATE_INV_STOP_TRANSIT;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket FRIENDS_LIST_LOADED;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket IF_CLOSESUB;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket PLAYER_INFO;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket UPDATE_STAT;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket PROJECTILE_SPAWN;
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket IF_SETNPCHEAD_ACTIVE;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket CHAT_FILTER_SETTINGS;
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket SET_PRIVCHATMODE;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket RESET_CLIENT_VARCACHE;
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket MESSAGE_PRIVATE_ECHO;
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket field3549;
	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket IF_SET_PLAYERMODEL_OBJ;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket CAM_SETANGLE;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket MIDI_SONG;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket CLAN_CHANNEL_DELTA;
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket UPDATE_IGNORELIST;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket MESSAGE_PRIVATE;
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket MINIMAP_TOGGLE;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket LOC_MERGEPLAYER;
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket MESSAGE_FRIEND_CHANNEL;
	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket UPDATE_ZONE_FULL_FOLLOWS;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket IF_SET_PLAYERMODEL_SELF;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket REFLECTION_CHECKER;
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket SET_NPC_UPDATE_ORIGIN;
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket UPDATE_INV_FULL;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER;
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket CLEAR_ENTITIES;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket IF_SET_TEXT;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket field3567;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket field3568;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket OBJ_COUNT;
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket NPC_SET_SEQUENCE;
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket field3571;
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket NPC_INFO_SMALL_VIEWPORT;
	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket field3573;
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket OBJ_RESET_CUSTOMIZATION;
	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket RESET_INTERACTION_MODE;
	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket NPC_INFO_LARGE_VIEWPORT;
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket field3505;
	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket OBJ_SET_CUSTOMIZATION;
	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public static final ServerPacket field3453;
	@ObfuscatedName("fs")
	@ObfuscatedGetter(
		intValue = 1163003239
	)
	@Export("id")
	public final int id;
	@ObfuscatedName("fm")
	@ObfuscatedGetter(
		intValue = -315600729
	)
	@Export("length")
	public final int length;

	static {
		SET_PLAYER_OP = new ServerPacket(0, -1);
		CAM_LOOKAT = new ServerPacket(1, 7);
		IF_SETNPCHEAD = new ServerPacket(2, 6);
		IF_SET_EVENTS = new ServerPacket(3, 12);
		GRAPHICSOBJECT_SPAWN = new ServerPacket(4, 8);
		DYNAMICOBJECT_SPAWN = new ServerPacket(5, 6);
		MIDI_JINGLE = new ServerPacket(6, 5);
		LOC_ANIM = new ServerPacket(7, 4);
		LOC_DEL = new ServerPacket(8, 2);
		IF_SETANGLE = new ServerPacket(9, 10);
		UPDATE_RUN_ENERGY = new ServerPacket(10, 2);
		IF_SETPOSITION = new ServerPacket(11, 8);
		RUNCLIENTSCRIPT = new ServerPacket(12, -2);
		IF_SET_PLAYERMODEL_BASECOLOUR = new ServerPacket(13, 6);
		CAM_LOOKAT_EASED_ANGLE_RELATIVE = new ServerPacket(14, 7);
		UPDATE_FRIENDLIST = new ServerPacket(15, -2);
		VAR_CLAN_DISABLE = new ServerPacket(16, 0);
		UPDATE_ZONE_PARTIAL_ENCLOSED = new ServerPacket(17, -2);
		IF_OPENTOP = new ServerPacket(18, 2);
		OBJ_ADD = new ServerPacket(19, 14);
		OBJ_DEL = new ServerPacket(20, 7);
		REBUILD_WORLDENTITY = new ServerPacket(21, -2);
		LOGOUT = new ServerPacket(22, 1);
		OCULUS_SYNC = new ServerPacket(23, 4);
		IF_RESYNC = new ServerPacket(24, -2);
		MIDI_SWAP = new ServerPacket(25, 8);
		NPC_SPOTANIM = new ServerPacket(26, 9);
		VARP_SMALL = new ServerPacket(27, 3);
		MAP_PROJANIM = new ServerPacket(28, 20);
		CAM_LOOKAT_EASED_COORD = new ServerPacket(29, 7);
		CAM_SHAKE = new ServerPacket(30, 4);
		REBUILD_REGION = new ServerPacket(31, -2);
		UPDATE_INV_CLEAR = new ServerPacket(32, 4);
		PING_STATISTICS_REQUEST = new ServerPacket(33, 8);
		IF_SETMODEL = new ServerPacket(34, 6);
		MIDI_SONG_WITH_SECONDARY = new ServerPacket(35, 12);
		EVENT_WORLDHOP = new ServerPacket(36, -1);
		URL_OPEN = new ServerPacket(37, -2);
		IF_SETANIM = new ServerPacket(38, 6);
		CAM_TARGET = new ServerPacket(39, 5);
		field3483 = new ServerPacket(40, 5);
		HEAT_MAP = new ServerPacket(41, 1);
		VAR_CLAN = new ServerPacket(42, -1);
		IF_MOVESUB = new ServerPacket(43, 8);
		LOC_ADD_CHANGE = new ServerPacket(44, 5);
		CAM_RESET = new ServerPacket(45, 0);
		OBJ_OPFILTER = new ServerPacket(46, 4);
		LOGOUT_FULL = new ServerPacket(47, 0);
		MESSAGE_FRIENDS_CHAT = new ServerPacket(48, -1);
		UPDATE_RUN_WEIGHT = new ServerPacket(49, 2);
		CAM_MOVETO_EASED_CIRCULAR = new ServerPacket(50, 10);
		IF_SETSCROLLPOS = new ServerPacket(51, 6);
		PLAYER_SPOTANIM = new ServerPacket(52, 9);
		field3496 = new ServerPacket(53, -1);
		IF_SETOBJECT = new ServerPacket(54, 10);
		VAR_CLAN_ENABLE = new ServerPacket(55, 0);
		MESSAGE_GAME = new ServerPacket(56, -1);
		CAM_MODE = new ServerPacket(57, 1);
		REBUILD_NORMAL = new ServerPacket(58, -2);
		IF_SETPLAYERHEAD = new ServerPacket(59, 4);
		CLAN_CHANNEL_FULL = new ServerPacket(60, -2);
		IF_SETHIDE = new ServerPacket(61, 5);
		MINIMAP_FLAG_SET = new ServerPacket(62, 2);
		field3506 = new ServerPacket(63, -2);
		UPDATE_STOCKMARKET_SLOT = new ServerPacket(64, 20);
		VARP_LARGE = new ServerPacket(65, 6);
		UPDATE_UID192 = new ServerPacket(66, 28);
		MIDI_SONG_STOP = new ServerPacket(67, 4);
		CLAN_SETTINGS_FULL = new ServerPacket(68, -2);
		IF_SETCOLOUR = new ServerPacket(69, 6);
		IF_SET_PLAYERMODEL_BODYTYPE = new ServerPacket(70, 5);
		TRIGGER_ONDIALOG_ABORT = new ServerPacket(71, 0);
		UPDATE_SITE_SETTINGS = new ServerPacket(72, -1);
		UPDATE_REBOOT_TIMER = new ServerPacket(73, 2);
		CAM_MOVETO = new ServerPacket(74, 8);
		UPDATE_TRADING_POST = new ServerPacket(75, -2);
		UPDATE_INV_PARTIAL = new ServerPacket(76, -2);
		HINT_ARROW = new ServerPacket(77, 6);
		PLAYER_ANIM_SPECIFIC = new ServerPacket(78, 3);
		IF_SET_ROTATE_SPEED = new ServerPacket(79, 8);
		CAM_MOVE_TO = new ServerPacket(80, 6);
		NPC_HEADICON_SPECIFIC = new ServerPacket(81, 9);
		MAP_ANIM = new ServerPacket(82, 6);
		field3526 = new ServerPacket(83, -2);
		CAM_SMOOTH_RESET = new ServerPacket(84, 4);
		CLAN_SETTINGS_DELTA = new ServerPacket(85, -2);
		SERVER_TICK_END = new ServerPacket(86, 0);
		IF_OPENSUB = new ServerPacket(87, 7);
		SYNC_CLIENT_VARCACHE = new ServerPacket(88, 0);
		SET_ACTIVE_WORLD = new ServerPacket(89, 4);
		field3533 = new ServerPacket(90, 7);
		RESET_ANIMS = new ServerPacket(91, 0);
		MESSAGE_CLAN_CHANNEL_SYSTEM = new ServerPacket(92, -1);
		UPDATE_INV_STOP_TRANSIT = new ServerPacket(93, 2);
		FRIENDS_LIST_LOADED = new ServerPacket(94, 0);
		IF_CLOSESUB = new ServerPacket(95, 4);
		PLAYER_INFO = new ServerPacket(96, -2);
		UPDATE_STAT = new ServerPacket(97, 7);
		PROJECTILE_SPAWN = new ServerPacket(98, 22);
		IF_SETNPCHEAD_ACTIVE = new ServerPacket(99, 6);
		CHAT_FILTER_SETTINGS = new ServerPacket(100, 2);
		UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL = new ServerPacket(101, 3);
		UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1 = new ServerPacket(102, -2);
		SET_PRIVCHATMODE = new ServerPacket(103, 1);
		RESET_CLIENT_VARCACHE = new ServerPacket(104, 0);
		MESSAGE_PRIVATE_ECHO = new ServerPacket(105, -2);
		field3549 = new ServerPacket(106, 1);
		IF_SET_PLAYERMODEL_OBJ = new ServerPacket(107, 8);
		CAM_SETANGLE = new ServerPacket(108, 6);
		MIDI_SONG = new ServerPacket(109, 10);
		CLAN_CHANNEL_DELTA = new ServerPacket(110, -2);
		UPDATE_IGNORELIST = new ServerPacket(111, -2);
		MESSAGE_PRIVATE = new ServerPacket(112, -2);
		MINIMAP_TOGGLE = new ServerPacket(113, 1);
		LOC_MERGEPLAYER = new ServerPacket(114, 14);
		MESSAGE_FRIEND_CHANNEL = new ServerPacket(115, -1);
		UPDATE_ZONE_FULL_FOLLOWS = new ServerPacket(116, 3);
		IF_SET_PLAYERMODEL_SELF = new ServerPacket(117, 5);
		REFLECTION_CHECKER = new ServerPacket(118, -2);
		SET_NPC_UPDATE_ORIGIN = new ServerPacket(119, 2);
		UPDATE_INV_FULL = new ServerPacket(120, -2);
		UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER = new ServerPacket(121, -1);
		CLEAR_ENTITIES = new ServerPacket(122, 0);
		IF_SET_TEXT = new ServerPacket(123, -2);
		field3567 = new ServerPacket(124, 1);
		field3568 = new ServerPacket(125, 1);
		OBJ_COUNT = new ServerPacket(126, 11);
		NPC_SET_SEQUENCE = new ServerPacket(127, 5);
		field3571 = new ServerPacket(128, -2);
		NPC_INFO_SMALL_VIEWPORT = new ServerPacket(129, -2);
		field3573 = new ServerPacket(130, 4);
		OBJ_RESET_CUSTOMIZATION = new ServerPacket(131, 7);
		RESET_INTERACTION_MODE = new ServerPacket(132, 2);
		NPC_INFO_LARGE_VIEWPORT = new ServerPacket(133, -2);
		field3505 = new ServerPacket(134, -2);
		OBJ_SET_CUSTOMIZATION = new ServerPacket(135, 17);
		field3453 = new ServerPacket(136, 2);
	}

	ServerPacket(int var1, int var2) {
		this.id = var1;
		this.length = var2;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "42"
	)
	public static void method6635() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
	}
}
