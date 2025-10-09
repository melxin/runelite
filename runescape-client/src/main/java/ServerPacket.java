import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mw")
@Implements("ServerPacket")
public class ServerPacket {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket UPDATE_INV_FULL;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket NPC_INFO_LARGE_VIEWPORT;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket LOGOUT_FULL;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket LOC_ANIM;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket REBUILD_WORLDENTITY;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket LOC_MERGEPLAYER;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket NPC_HEADICON_SPECIFIC;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket IF_OPENTOP;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket LOC_DEL;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket UPDATE_ZONE_PARTIAL_ENCLOSED;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket UPDATE_ZONE_FULL_FOLLOWS;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket CAM_MODE;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	static final ServerPacket field3688;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket SYNC_CLIENT_VARCACHE;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket EVENT_WORLDHOP;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket CLAN_SETTINGS_DELTA;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket UPDATE_IGNORELIST;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket REBUILD_REGION;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket REFLECTION_CHECKER;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket PROJECTILE_SPAWN;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket NPC_SET_SEQUENCE;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket UPDATE_RUN_WEIGHT;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket PLAYER_SPOTANIM;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket IF_SETCOLOUR;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket HINT_ARROW;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket URL_OPEN;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket UPDATE_INV_PARTIAL;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket RESET_ANIMS;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket LOGOUT;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket UPDATE_REBOOT_TIMER;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket RUNCLIENTSCRIPT;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket MINIMAP_TOGGLE;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket MESSAGE_FRIEND_PRIVATE;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket UPDATE_STAT;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket PLAYER_ANIM_SPECIFIC;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket IF_SETPOSITION;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket field3714;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket IF_SETOBJECT;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket OCULUS_SYNC;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket field3717;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket IF_SET_PLAYERMODEL_BODYTYPE;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket field3804;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket HEAT_MAP;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket VARP_SMALL;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket MESSAGE_PRIVATE;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket field3783;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket CLAN_SETTINGS_FULL;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket SERVER_TICK_END;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket CAM_SHAKE;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket IF_SETNPCHEAD;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket IF_CLOSESUB;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket IF_SETNPCHEAD_ACTIVE;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket CAM_MOVE_TO;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket MIDI_SONG_STOP;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket IF_SETPLAYERHEAD;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket IF_MOVESUB;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket MINIMAP_FLAG_SET;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket MIDI_JINGLE;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket field3736;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket UPDATE_UID192;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket CAM_MOVETO;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket UPDATE_INV_CLEAR;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket CAM_SETANGLE;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	static final ServerPacket field3741;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket field3742;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket MAP_ANIM;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket field3676;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket SET_PRIVCHATMODE;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket RESET_CLIENT_VARCACHE;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket VAR_CLAN_DISABLE;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket FRIENDS_LIST_LOADED;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket SET_PLAYER_OP;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket TRIGGER_ONDIALOG_ABORT;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket SYNTH_SOUND;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket CHAT_FILTER_SETTINGS;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket CLAN_CHANNEL_FULL;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket LOC_ADD_CHANGE;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket VAR_CLAN;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket MESSAGE_CLAN_CHANNEL_SYSTEM;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket REBUILD_NORMAL;
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket SET_NPC_UPDATE_ORIGIN;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket PLAYER_INFO;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket NPC_SPOTANIM;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket UPDATE_RUN_ENERGY;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket UPDATE_INV_STOP_TRANSIT;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket IF_SET_PLAYERMODEL_SELF;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket CLAN_CHANNEL_DELTA;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket UNKNOWN_STRING;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket field3785;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket PING_STATISTICS_REQUEST;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket IF_OPENSUB;
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket CAM_TARGET;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket IF_SETANIM;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket MESSAGE_PRIVATE_ECHO;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket UPDATE_FRIENDLIST;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket CAM_LOOKAT_EASED_ANGLE_RELATIVE;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket CAM_LOOKAT;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket IF_SETPOSITION;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket SET_ACTIVE_WORLD;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket IF_SETHIDE;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket MESSAGE_GAME;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket IF_SET_PLAYERMODEL_BASECOLOUR;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket GRAPHICSOBJECT_SPAWN;
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket CAM_RESET;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket UPDATE_STOCKMARKET_SLOT;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket IF_RESYNC;
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket IF_SET_TEXT;
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket RESET_INTERACTION_MODE;
	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket MIDI_SONG_WITH_SECONDARY;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket MIDI_SWAP;
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket IF_SET_PLAYERMODEL_OBJ;
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket VAR_CLAN_ENABLE;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket IF_SETANGLE;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket CAM_LOOKAT_EASED_COORD;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket field3793;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket MESSAGE_FRIENDS_CHAT;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket UPDATE_TRADING_POST;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket CAM_SMOOTH_RESET;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket NPC_INFO_SMALL_VIEWPORT;
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket UPDATE_SITE_SETTINGS;
	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket VARP_LARGE;
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket IF_SETMODEL;
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket CAM_MOVETO_EASED_CIRCULAR;
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket MIDI_SONG;
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket IF_SET_ROTATE_SPEED;
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket WORLDENTITY_INFO;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket field3776;
	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket IF_SET_EVENTS;
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket field3807;
	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket field3808;
	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket field3809;
	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	public static final ServerPacket field3737;
	@ObfuscatedName("vd")
	@ObfuscatedGetter(
		intValue = -484707353
	)
	static int field3813;
	@ObfuscatedName("fw")
	@ObfuscatedGetter(
		intValue = 595860651
	)
	@Export("id")
	public final int id;
	@ObfuscatedName("fq")
	@ObfuscatedGetter(
		intValue = 1056997795
	)
	@Export("length")
	public final int length;

	static {
		UPDATE_INV_FULL = new ServerPacket(0, -2);
		NPC_INFO_LARGE_VIEWPORT = new ServerPacket(1, -2);
		LOGOUT_FULL = new ServerPacket(2, 0);
		LOC_ANIM = new ServerPacket(3, 4);
		REBUILD_WORLDENTITY = new ServerPacket(4, -2);
		LOC_MERGEPLAYER = new ServerPacket(5, 14);
		NPC_HEADICON_SPECIFIC = new ServerPacket(6, 9);
		IF_OPENTOP = new ServerPacket(7, 2);
		LOC_DEL = new ServerPacket(8, 2);
		UPDATE_ZONE_PARTIAL_ENCLOSED = new ServerPacket(9, -2);
		UPDATE_ZONE_FULL_FOLLOWS = new ServerPacket(10, 3);
		CAM_MODE = new ServerPacket(11, 1);
		field3688 = new ServerPacket(12, 7);
		SYNC_CLIENT_VARCACHE = new ServerPacket(13, 0);
		EVENT_WORLDHOP = new ServerPacket(14, -1);
		CLAN_SETTINGS_DELTA = new ServerPacket(15, -2);
		UPDATE_IGNORELIST = new ServerPacket(16, -2);
		REBUILD_REGION = new ServerPacket(17, -2);
		REFLECTION_CHECKER = new ServerPacket(18, -2);
		PROJECTILE_SPAWN = new ServerPacket(19, 27);
		NPC_SET_SEQUENCE = new ServerPacket(20, 5);
		UPDATE_RUN_WEIGHT = new ServerPacket(21, 2);
		PLAYER_SPOTANIM = new ServerPacket(22, 9);
		IF_SETCOLOUR = new ServerPacket(23, 6);
		HINT_ARROW = new ServerPacket(24, 6);
		URL_OPEN = new ServerPacket(25, -2);
		UPDATE_INV_PARTIAL = new ServerPacket(26, -2);
		RESET_ANIMS = new ServerPacket(27, 0);
		LOGOUT = new ServerPacket(28, 1);
		UPDATE_REBOOT_TIMER = new ServerPacket(29, 2);
		UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL = new ServerPacket(30, 3);
		UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1 = new ServerPacket(31, -2);
		RUNCLIENTSCRIPT = new ServerPacket(32, -2);
		MINIMAP_TOGGLE = new ServerPacket(33, 1);
		MESSAGE_FRIEND_PRIVATE = new ServerPacket(34, -1);
		UPDATE_STAT = new ServerPacket(35, 7);
		PLAYER_ANIM_SPECIFIC = new ServerPacket(36, 3);
		IF_SETPOSITION = new ServerPacket(37, 6);
		field3714 = new ServerPacket(38, 7);
		IF_SETOBJECT = new ServerPacket(39, 10);
		OCULUS_SYNC = new ServerPacket(40, 4);
		field3717 = new ServerPacket(41, 4);
		IF_SET_PLAYERMODEL_BODYTYPE = new ServerPacket(42, 5);
		field3804 = new ServerPacket(43, 17);
		HEAT_MAP = new ServerPacket(44, 1);
		VARP_SMALL = new ServerPacket(45, 3);
		MESSAGE_PRIVATE = new ServerPacket(46, -2);
		field3783 = new ServerPacket(47, 1);
		CLAN_SETTINGS_FULL = new ServerPacket(48, -2);
		SERVER_TICK_END = new ServerPacket(49, 0);
		CAM_SHAKE = new ServerPacket(50, 4);
		IF_SETNPCHEAD = new ServerPacket(51, 6);
		IF_CLOSESUB = new ServerPacket(52, 4);
		IF_SETNPCHEAD_ACTIVE = new ServerPacket(53, 6);
		CAM_MOVE_TO = new ServerPacket(54, 6);
		MIDI_SONG_STOP = new ServerPacket(55, 4);
		IF_SETPLAYERHEAD = new ServerPacket(56, 4);
		IF_MOVESUB = new ServerPacket(57, 8);
		MINIMAP_FLAG_SET = new ServerPacket(58, 2);
		MIDI_JINGLE = new ServerPacket(59, 5);
		field3736 = new ServerPacket(60, 2);
		UPDATE_UID192 = new ServerPacket(61, 28);
		CAM_MOVETO = new ServerPacket(62, 8);
		UPDATE_INV_CLEAR = new ServerPacket(63, 4);
		CAM_SETANGLE = new ServerPacket(64, 6);
		field3741 = new ServerPacket(65, -2);
		field3742 = new ServerPacket(66, 6);
		MAP_ANIM = new ServerPacket(67, 6);
		field3676 = new ServerPacket(68, 10);
		SET_PRIVCHATMODE = new ServerPacket(69, 1);
		RESET_CLIENT_VARCACHE = new ServerPacket(70, 0);
		VAR_CLAN_DISABLE = new ServerPacket(71, 0);
		FRIENDS_LIST_LOADED = new ServerPacket(72, 0);
		SET_PLAYER_OP = new ServerPacket(73, -1);
		UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER = new ServerPacket(74, -1);
		TRIGGER_ONDIALOG_ABORT = new ServerPacket(75, 0);
		SYNTH_SOUND = new ServerPacket(76, 5);
		CHAT_FILTER_SETTINGS = new ServerPacket(77, 2);
		CLAN_CHANNEL_FULL = new ServerPacket(78, -2);
		LOC_ADD_CHANGE = new ServerPacket(79, -2);
		VAR_CLAN = new ServerPacket(80, -1);
		MESSAGE_CLAN_CHANNEL_SYSTEM = new ServerPacket(81, -1);
		REBUILD_NORMAL = new ServerPacket(82, -2);
		SET_NPC_UPDATE_ORIGIN = new ServerPacket(83, 2);
		PLAYER_INFO = new ServerPacket(84, -2);
		NPC_SPOTANIM = new ServerPacket(85, 9);
		UPDATE_RUN_ENERGY = new ServerPacket(86, 2);
		UPDATE_INV_STOP_TRANSIT = new ServerPacket(87, 2);
		IF_SET_PLAYERMODEL_SELF = new ServerPacket(88, 5);
		CLAN_CHANNEL_DELTA = new ServerPacket(89, -2);
		UNKNOWN_STRING = new ServerPacket(90, -1);
		field3785 = new ServerPacket(91, 1);
		PING_STATISTICS_REQUEST = new ServerPacket(92, 8);
		IF_OPENSUB = new ServerPacket(93, 7);
		CAM_TARGET = new ServerPacket(94, 5);
		IF_SETANIM = new ServerPacket(95, 6);
		MESSAGE_PRIVATE_ECHO = new ServerPacket(96, -2);
		UPDATE_FRIENDLIST = new ServerPacket(97, -2);
		CAM_LOOKAT_EASED_ANGLE_RELATIVE = new ServerPacket(98, 7);
		CAM_LOOKAT = new ServerPacket(99, 7);
		IF_SETPOSITION = new ServerPacket(100, 8);
		SET_ACTIVE_WORLD = new ServerPacket(101, 3);
		IF_SETHIDE = new ServerPacket(102, 5);
		MESSAGE_GAME = new ServerPacket(103, -1);
		IF_SET_PLAYERMODEL_BASECOLOUR = new ServerPacket(104, 6);
		GRAPHICSOBJECT_SPAWN = new ServerPacket(105, 8);
		CAM_RESET = new ServerPacket(106, 0);
		UPDATE_STOCKMARKET_SLOT = new ServerPacket(107, 20);
		IF_RESYNC = new ServerPacket(108, -2);
		IF_SET_TEXT = new ServerPacket(109, -2);
		RESET_INTERACTION_MODE = new ServerPacket(110, 2);
		MIDI_SONG_WITH_SECONDARY = new ServerPacket(111, 12);
		MIDI_SWAP = new ServerPacket(112, 8);
		IF_SET_PLAYERMODEL_OBJ = new ServerPacket(113, 8);
		VAR_CLAN_ENABLE = new ServerPacket(114, 0);
		IF_SETANGLE = new ServerPacket(115, 10);
		CAM_LOOKAT_EASED_COORD = new ServerPacket(116, 7);
		field3793 = new ServerPacket(117, 1);
		MESSAGE_FRIENDS_CHAT = new ServerPacket(118, -1);
		UPDATE_TRADING_POST = new ServerPacket(119, -2);
		CAM_SMOOTH_RESET = new ServerPacket(120, 4);
		NPC_INFO_SMALL_VIEWPORT = new ServerPacket(121, -2);
		UPDATE_SITE_SETTINGS = new ServerPacket(122, -1);
		VARP_LARGE = new ServerPacket(123, 6);
		IF_SETMODEL = new ServerPacket(124, 6);
		CAM_MOVETO_EASED_CIRCULAR = new ServerPacket(125, 10);
		MIDI_SONG = new ServerPacket(126, 10);
		IF_SET_ROTATE_SPEED = new ServerPacket(127, 8);
		WORLDENTITY_INFO = new ServerPacket(128, -2);
		field3776 = new ServerPacket(129, 8);
		IF_SET_EVENTS = new ServerPacket(130, 16);
		field3807 = new ServerPacket(131, 20);
		field3808 = new ServerPacket(132, 10);
		field3809 = new ServerPacket(133, 1);
		field3737 = new ServerPacket(134, 14);
	}

	ServerPacket(int var1, int var2) {
		this.id = var1;
		this.length = var2;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lrt;B)F",
		garbageValue = "115"
	)
	static final float method7056(class451 var0) {
		float var1 = var0.method9152(var0);
		return (float)Math.sqrt((double)var1);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZI)V",
		garbageValue = "2049654334"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var6 = (var0 + var1) / 2;
			int var7 = var0;
			World var8 = World.World_worlds[var6];
			World.World_worlds[var6] = World.World_worlds[var1];
			World.World_worlds[var1] = var8;

			for (int var9 = var0; var9 < var1; ++var9) {
				World var11 = World.World_worlds[var9];
				int var12 = class195.compareWorlds(var11, var8, var2, var3);
				int var10;
				if (var12 != 0) {
					if (var3) {
						var10 = -var12;
					} else {
						var10 = var12;
					}
				} else if (var4 == -1) {
					var10 = 0;
				} else {
					int var13 = class195.compareWorlds(var11, var8, var4, var5);
					if (var5) {
						var10 = -var13;
					} else {
						var10 = var13;
					}
				}

				if (var10 <= 0) {
					World var14 = World.World_worlds[var9];
					World.World_worlds[var9] = World.World_worlds[var7];
					World.World_worlds[var7++] = var14;
				}
			}

			World.World_worlds[var1] = World.World_worlds[var7];
			World.World_worlds[var7] = var8;
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5);
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5);
		}

	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "65"
	)
	static final void method7053() {
		Sound.method3957();
	}
}
