import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mz")
@Implements("ServerPacket")
public class ServerPacket {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket SERVER_TICK_END;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket SET_PLAYER_OP;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	static final ServerPacket UPDATE_REBOOT_TIMER;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket REFLECTION_CHECKER;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket URL_OPEN;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket SET_PRIVCHATMODE;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket LOC_DEL;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket UPDATE_INV_CLEAR;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket IF_OPENSUB;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket MESSAGE_PRIVATE;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket CAM_LOOKAT;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket CAM_TARGET;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket CAM_SETANGLE;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket IF_SETCOLOUR;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	static final ServerPacket UPDATE_IGNORELIST;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket MIDI_SONG;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket NPC_INFO_SMALL_VIEWPORT;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket NPC_SET_SEQUENCE;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket VARP_SMALL;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket CAM_LOOKAT_EASED_COORD;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket SYNTH_SOUND;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket GRAPHICSOBJECT_SPAWN;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket CAM_LOOKAT_EASED_ANGLE_RELATIVE;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket MINIMAP_TOGGLE;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket UPDATE_INV_STOP_TRANSIT;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket MIDI_JINGLE;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket PLAYER_SPOTANIM;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket IF_SET_PLAYERMODEL_BASECOLOUR;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket UPDATE_STAT;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket IF_SETANIM;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket MESSAGE_GAME;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket LOGOUT;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket MESSAGE_CLAN_CHANNEL_SYSTEM;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket IF_RESYNC;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket FRIENDS_LIST_LOADED;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket TRIGGER_ONDIALOG_ABORT;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket IF_SETPOSITION;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket CAM_MODE;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket IF_OPENTOP;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket IF_SETSCROLLPOS;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket MIDI_SWAP;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket IF_SETHIDE;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket IF_MOVESUB;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket HINT_ARROW;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket UPDATE_FRIENDLIST;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket LOC_ADD_CHANGE;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket UPDATE_TRADING_POST;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket NPC_INFO_LARGE_VIEWPORT;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket IF_CLOSESUB;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket UPDATE_STOCKMARKET_SLOT;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket IF_SETMODEL;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket RESET_INTERACTION_MODE;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket IF_SET_ROTATE_SPEED;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket UNKNOWN_STRING;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket UPDATE_RUN_ENERGY;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket CLAN_CHANNEL_DELTA;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket IF_SETNPCHEAD_ACTIVE;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket LOGOUT_FULL;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket PROJECTILE_SPAWN;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket CLAN_CHANNEL_FULL;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket UPDATE_SITE_SETTINGS;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket MINIMAP_FLAG_SET;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket MESSAGE_FRIENDS_CHAT;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket VAR_CLAN_ENABLE;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket CLAN_SETTINGS_FULL;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket SYNC_CLIENT_VARCACHE;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket PLAYER_ANIM_SPECIFIC;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket RESET_ANIMS;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket NPC_SPOTANIM;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket UPDATE_UID192;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket REBUILD_NORMAL;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket MESSAGE_PRIVATE_ECHO;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket RESET_CLIENT_VARCACHE;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket IF_SET_TEXT;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket MIDI_SONG_WITH_SECONDARY;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket SET_ACTIVE_WORLD;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket IF_SETOBJECT;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket LOC_ANIM;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket IF_SET_PLAYERMODEL_SELF;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket REBUILD_WORLDENTITY;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket VAR_CLAN_DISABLE;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket DYNAMICOBJECT_SPAWN;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket HEAT_MAP;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket UPDATE_INV_FULL;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket UPDATE_ZONE_FULL_FOLLOWS;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket CAM_SMOOTH_RESET;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket CAM_SHAKE;
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket PLAYER_INFO;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket CAM_RESET;
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket NPC_HEADICON_SPECIFIC;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket SET_NPC_UPDATE_ORIGIN;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket MESSAGE_FRIEND_PRIVATE;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket CLAN_SETTINGS_DELTA;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket REBUILD_REGION;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket CAM_MOVETO;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket EVENT_WORLDHOP;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket CAM_MOVETO_EASED_CIRCULAR;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket UPDATE_ZONE_PARTIAL_ENCLOSED;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket IF_SET_PLAYERMODEL_OBJ;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket CAM_MOVE_TO;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket UPDATE_RUN_WEIGHT;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket PING_STATISTICS_REQUEST;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket IF_SETPLAYERHEAD;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket IF_SETANGLE;
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket VAR_CLAN;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket MIDI_SONG_STOP;
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket IF_SET_PLAYERMODEL_BODYTYPE;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket MAP_ANIM;
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket IF_SETNPCHEAD;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket OCULUS_SYNC;
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket UPDATE_INV_PARTIAL;
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket CHAT_FILTER_SETTINGS;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket LOC_MERGEPLAYER;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket RUNCLIENTSCRIPT;
	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket VARP_LARGE;
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket WORLDENTITY_INFO;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket IF_SET_EVENTS;
	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket field3778;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket field3832;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket field3833;
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket field3834;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket field3835;
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket field3836;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket field3837;
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket field3757;
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket field3839;
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket field3773;
	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket field3804;
	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket field3842;
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket field3843;
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket field3844;
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	public static final ServerPacket field3768;
	@ObfuscatedName("fh")
	@ObfuscatedGetter(
		intValue = -2117047939
	)
	@Export("id")
	public final int id;
	@ObfuscatedName("fs")
	@ObfuscatedGetter(
		intValue = 2121918437
	)
	@Export("length")
	public final int length;

	static {
		SERVER_TICK_END = new ServerPacket(0, 0);
		SET_PLAYER_OP = new ServerPacket(1, -1);
		UPDATE_REBOOT_TIMER = new ServerPacket(2, -2);
		REFLECTION_CHECKER = new ServerPacket(3, 2);
		URL_OPEN = new ServerPacket(4, 1);
		SET_PRIVCHATMODE = new ServerPacket(5, -2);
		LOC_DEL = new ServerPacket(6, -2);
		UPDATE_INV_CLEAR = new ServerPacket(7, 1);
		IF_OPENSUB = new ServerPacket(8, 2);
		MESSAGE_PRIVATE = new ServerPacket(9, 4);
		CAM_LOOKAT = new ServerPacket(10, 2);
		CAM_TARGET = new ServerPacket(11, 7);
		CAM_SETANGLE = new ServerPacket(12, -2);
		IF_SETCOLOUR = new ServerPacket(13, 1);
		UPDATE_IGNORELIST = new ServerPacket(14, 7);
		MIDI_SONG = new ServerPacket(15, 7);
		NPC_INFO_SMALL_VIEWPORT = new ServerPacket(16, 5);
		NPC_SET_SEQUENCE = new ServerPacket(17, 6);
		VARP_SMALL = new ServerPacket(18, 6);
		CAM_LOOKAT_EASED_COORD = new ServerPacket(19, -2);
		SYNTH_SOUND = new ServerPacket(20, 10);
		GRAPHICSOBJECT_SPAWN = new ServerPacket(21, -2);
		CAM_LOOKAT_EASED_ANGLE_RELATIVE = new ServerPacket(22, 5);
		MINIMAP_TOGGLE = new ServerPacket(23, 4);
		UPDATE_INV_STOP_TRANSIT = new ServerPacket(24, 3);
		MIDI_JINGLE = new ServerPacket(25, 7);
		PLAYER_SPOTANIM = new ServerPacket(26, 5);
		IF_SET_PLAYERMODEL_BASECOLOUR = new ServerPacket(27, 8);
		UPDATE_STAT = new ServerPacket(28, 7);
		IF_SETANIM = new ServerPacket(29, 7);
		MESSAGE_GAME = new ServerPacket(30, 1);
		LOGOUT = new ServerPacket(31, 2);
		MESSAGE_CLAN_CHANNEL_SYSTEM = new ServerPacket(32, 5);
		IF_RESYNC = new ServerPacket(33, 9);
		FRIENDS_LIST_LOADED = new ServerPacket(34, 6);
		TRIGGER_ONDIALOG_ABORT = new ServerPacket(35, 7);
		IF_SETPOSITION = new ServerPacket(36, 6);
		CAM_MODE = new ServerPacket(37, -1);
		IF_OPENTOP = new ServerPacket(38, 1);
		IF_SETSCROLLPOS = new ServerPacket(39, -1);
		MIDI_SWAP = new ServerPacket(40, -2);
		UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL = new ServerPacket(41, 0);
		IF_SETHIDE = new ServerPacket(42, 0);
		IF_MOVESUB = new ServerPacket(43, 8);
		HINT_ARROW = new ServerPacket(44, 1);
		UPDATE_FRIENDLIST = new ServerPacket(45, 2);
		LOC_ADD_CHANGE = new ServerPacket(46, 6);
		UPDATE_TRADING_POST = new ServerPacket(47, 8);
		NPC_INFO_LARGE_VIEWPORT = new ServerPacket(48, 3);
		IF_CLOSESUB = new ServerPacket(49, 5);
		UPDATE_STOCKMARKET_SLOT = new ServerPacket(50, 8);
		IF_SETMODEL = new ServerPacket(51, 17);
		RESET_INTERACTION_MODE = new ServerPacket(52, 6);
		IF_SET_ROTATE_SPEED = new ServerPacket(53, -2);
		UNKNOWN_STRING = new ServerPacket(54, -2);
		UPDATE_RUN_ENERGY = new ServerPacket(55, -2);
		CLAN_CHANNEL_DELTA = new ServerPacket(56, -2);
		IF_SETNPCHEAD_ACTIVE = new ServerPacket(57, 4);
		LOGOUT_FULL = new ServerPacket(58, 20);
		PROJECTILE_SPAWN = new ServerPacket(59, 6);
		CLAN_CHANNEL_FULL = new ServerPacket(60, 2);
		UPDATE_SITE_SETTINGS = new ServerPacket(61, 8);
		MINIMAP_FLAG_SET = new ServerPacket(62, -1);
		MESSAGE_FRIENDS_CHAT = new ServerPacket(63, 2);
		VAR_CLAN_ENABLE = new ServerPacket(64, -2);
		CLAN_SETTINGS_FULL = new ServerPacket(65, 6);
		SYNC_CLIENT_VARCACHE = new ServerPacket(66, 0);
		PLAYER_ANIM_SPECIFIC = new ServerPacket(67, 27);
		RESET_ANIMS = new ServerPacket(68, -2);
		NPC_SPOTANIM = new ServerPacket(69, -1);
		UPDATE_UID192 = new ServerPacket(70, 2);
		REBUILD_NORMAL = new ServerPacket(71, -1);
		MESSAGE_PRIVATE_ECHO = new ServerPacket(72, 0);
		RESET_CLIENT_VARCACHE = new ServerPacket(73, -2);
		IF_SET_TEXT = new ServerPacket(74, 0);
		MIDI_SONG_WITH_SECONDARY = new ServerPacket(75, 3);
		SET_ACTIVE_WORLD = new ServerPacket(76, 0);
		IF_SETOBJECT = new ServerPacket(77, 9);
		LOC_ANIM = new ServerPacket(78, 28);
		IF_SET_PLAYERMODEL_SELF = new ServerPacket(79, -2);
		REBUILD_WORLDENTITY = new ServerPacket(80, -2);
		VAR_CLAN_DISABLE = new ServerPacket(81, 0);
		DYNAMICOBJECT_SPAWN = new ServerPacket(82, -2);
		HEAT_MAP = new ServerPacket(83, 12);
		UPDATE_INV_FULL = new ServerPacket(84, 3);
		UPDATE_ZONE_FULL_FOLLOWS = new ServerPacket(85, 10);
		CAM_SMOOTH_RESET = new ServerPacket(86, 4);
		CAM_SHAKE = new ServerPacket(87, 5);
		PLAYER_INFO = new ServerPacket(88, -2);
		CAM_RESET = new ServerPacket(89, 10);
		NPC_HEADICON_SPECIFIC = new ServerPacket(90, 0);
		SET_NPC_UPDATE_ORIGIN = new ServerPacket(91, 6);
		UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1 = new ServerPacket(92, 1);
		MESSAGE_FRIEND_PRIVATE = new ServerPacket(93, -2);
		CLAN_SETTINGS_DELTA = new ServerPacket(94, 3);
		REBUILD_REGION = new ServerPacket(95, 4);
		UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER = new ServerPacket(96, 4);
		CAM_MOVETO = new ServerPacket(97, -2);
		EVENT_WORLDHOP = new ServerPacket(98, 0);
		CAM_MOVETO_EASED_CIRCULAR = new ServerPacket(99, 9);
		UPDATE_ZONE_PARTIAL_ENCLOSED = new ServerPacket(100, 2);
		IF_SET_PLAYERMODEL_OBJ = new ServerPacket(101, -2);
		CAM_MOVE_TO = new ServerPacket(102, -1);
		UPDATE_RUN_WEIGHT = new ServerPacket(103, -2);
		PING_STATISTICS_REQUEST = new ServerPacket(104, -2);
		IF_SETPLAYERHEAD = new ServerPacket(105, -1);
		IF_SETANGLE = new ServerPacket(106, 8);
		VAR_CLAN = new ServerPacket(107, -1);
		MIDI_SONG_STOP = new ServerPacket(108, 10);
		IF_SET_PLAYERMODEL_BODYTYPE = new ServerPacket(109, -2);
		MAP_ANIM = new ServerPacket(110, 8);
		IF_SETNPCHEAD = new ServerPacket(111, 6);
		OCULUS_SYNC = new ServerPacket(112, 2);
		UPDATE_INV_PARTIAL = new ServerPacket(113, 8);
		CHAT_FILTER_SETTINGS = new ServerPacket(114, 4);
		LOC_MERGEPLAYER = new ServerPacket(115, 10);
		RUNCLIENTSCRIPT = new ServerPacket(116, -1);
		VARP_LARGE = new ServerPacket(117, 4);
		WORLDENTITY_INFO = new ServerPacket(118, 1);
		IF_SET_EVENTS = new ServerPacket(119, 5);
		field3778 = new ServerPacket(120, 6);
		field3832 = new ServerPacket(121, 6);
		field3833 = new ServerPacket(122, 4);
		field3834 = new ServerPacket(123, -2);
		field3835 = new ServerPacket(124, 2);
		field3836 = new ServerPacket(125, 14);
		field3837 = new ServerPacket(126, -2);
		field3757 = new ServerPacket(127, 6);
		field3839 = new ServerPacket(128, 1);
		field3773 = new ServerPacket(129, 20);
		field3804 = new ServerPacket(130, 14);
		field3842 = new ServerPacket(131, 8);
		field3843 = new ServerPacket(132, 10);
		field3844 = new ServerPacket(133, -2);
		field3768 = new ServerPacket(134, 16);
	}

	ServerPacket(int var1, int var2) {
		this.id = var1;
		this.length = var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "3"
	)
	public static int method7279(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
		var0 = var0 + (var0 >>> 4) & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 255;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(CS)Z",
		garbageValue = "1722"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}
}
