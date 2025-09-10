import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mh")
@Implements("ServerPacket")
public class ServerPacket {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket VARP_SMALL;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket MIDI_SONG;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	static final ServerPacket field3684;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket IF_SET_PLAYERMODEL_OBJ;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket IF_SET_PLAYERMODEL_BODYTYPE;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket IF_SETSCROLLPOS;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket OBJ_ADD;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket CAM_SETANGLE;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket UPDATE_REBOOT_TIMER;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket UPDATE_STOCKMARKET_SLOT;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket CAM_MOVE_TO;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket IF_SETOBJECT;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket IF_SETPOSITION;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket IF_SET_ROTATE_SPEED;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket IF_SETHIDE;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket UPDATE_INV_PARTIAL;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket MESSAGE_GAME;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket MIDI_SWAP;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket UPDATE_ZONE_FULL_FOLLOWS;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket RESET_ANIMS;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket UPDATE_IGNORELIST;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket IF_SETNPCHEAD;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket VARP_LARGE;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket RUNCLIENTSCRIPT;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket field3755;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket UPDATE_FRIENDLIST;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket IF_SETNPCHEAD_ACTIVE;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket CLAN_SETTINGS_DELTA;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket NPC_SET_SEQUENCE;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket CLAN_SETTINGS_FULL;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket OBJ_OPFILTER;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket NPC_HEADICON_SPECIFIC;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket MINIMAP_TOGGLE;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket field3762;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket RESET_INTERACTION_MODE;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket REBUILD_NORMAL;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket REBUILD_REGION;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket HINT_ARROW;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket CAM_LOOKAT;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket LOC_DEL;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket field3709;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket MAP_ANIM;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket URL_OPEN;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket field3712;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket IF_CLOSESUB;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket LOC_ANIM;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket CAM_RESET;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket field3772;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket MESSAGE_PRIVATE;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket MINIMAP_FLAG_SET;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket CAM_MODE;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket PLAYER_SPOTANIM;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket CLAN_CHANNEL_DELTA;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket field3722;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket IF_SET_PLAYERMODEL_BASECOLOUR;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket IF_OPENSUB;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket MIDI_SONG_WITH_SECONDARY;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket CAM_SMOOTH_RESET;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket field3696;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket MESSAGE_FRIEND_PRIVATE;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket HEAT_MAP;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket PING_STATISTICS_REQUEST;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket UPDATE_UID192;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket OBJ_COUNT;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket CAM_SHAKE;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket UPDATE_RUN_WEIGHT;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket UPDATE_INV_CLEAR;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket IF_OPENTOP;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket OCULUS_SYNC;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket CAM_MOVETO_EASED_CIRCULAR;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket VAR_CLAN_DISABLE;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket LOC_ADD_CHANGE;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket SET_PRIVCHATMODE;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket LOGOUT_FULL;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket VAR_CLAN_ENABLE;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket SET_PLAYER_OP;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket SYNC_CLIENT_VARCACHE;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket field3746;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket CHAT_FILTER_SETTINGS;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket field3759;
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket IF_SET_TEXT;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket CLAN_CHANNEL_FULL;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket CAM_MOVETO;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket VAR_CLAN;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket IF_MOVESUB;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket IF_SETANGLE;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket UPDATE_RUN_ENERGY;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket PLAYER_ANIM_SPECIFIC;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket CAM_LOOKAT_EASED_ANGLE_RELATIVE;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket GRAPHICSOBJECT_SPAWN;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket REBUILD_WORLDENTITY;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket NPC_INFO_SMALL_VIEWPORT;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket UPDATE_ZONE_PARTIAL_ENCLOSED;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket REFLECTION_CHECKER;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket UPDATE_TRADING_POST;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket UPDATE_STAT;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket MESSAGE_FRIENDS_CHAT;
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket IF_SETPLAYERHEAD;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket CAM_LOOKAT_EASED_COORD;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket LOGOUT;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket CAM_TARGET;
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket EVENT_WORLDHOP;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket TRIGGER_ONDIALOG_ABORT;
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket IF_SET_PLAYERMODEL_SELF;
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket SET_NPC_UPDATE_ORIGIN;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket NPC_SPOTANIM;
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket MESSAGE_PRIVATE_ECHO;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket FRIENDS_LIST_LOADED;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket IF_SETANIM;
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket IF_SETMODEL;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket MESSAGE_CLAN_CHANNEL_SYSTEM;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket MIDI_SONG_STOP;
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket NPC_INFO_LARGE_VIEWPORT;
	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket SERVER_TICK_END;
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	static final ServerPacket field3784;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket IF_SETCOLOUR;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket UPDATE_INV_FULL;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket LOC_MERGEPLAYER;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket PLAYER_INFO;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket OBJ_DEL;
	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket DYNAMICOBJECT_SPAWN;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket UPDATE_SITE_SETTINGS;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket MIDI_JINGLE;
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket RESET_CLIENT_VARCACHE;
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket UPDATE_INV_STOP_TRANSIT;
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket field3795;
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket field3796;
	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket OBJ_RESET_CUSTOMIZATION;
	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket IF_SET_EVENTS;
	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket field3763;
	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket field3800;
	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket IF_RESYNC;
	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket PROJECTILE_SPAWN;
	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket field3697;
	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket field3717;
	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket OBJ_SET_CUSTOMIZATION;
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket field3806;
	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final ServerPacket SET_ACTIVE_WORLD;
	@ObfuscatedName("fo")
	@ObfuscatedGetter(
		intValue = -1309674587
	)
	@Export("id")
	public final int id;
	@ObfuscatedName("fc")
	@ObfuscatedGetter(
		intValue = 1475708737
	)
	@Export("length")
	public final int length;

	static {
		VARP_SMALL = new ServerPacket(0, 3);
		MIDI_SONG = new ServerPacket(1, 10);
		field3684 = new ServerPacket(2, 7);
		IF_SET_PLAYERMODEL_OBJ = new ServerPacket(3, 8);
		IF_SET_PLAYERMODEL_BODYTYPE = new ServerPacket(4, 5);
		IF_SETSCROLLPOS = new ServerPacket(5, 6);
		OBJ_ADD = new ServerPacket(6, 14);
		CAM_SETANGLE = new ServerPacket(7, 6);
		UPDATE_REBOOT_TIMER = new ServerPacket(8, 2);
		UPDATE_STOCKMARKET_SLOT = new ServerPacket(9, 20);
		CAM_MOVE_TO = new ServerPacket(10, 6);
		IF_SETOBJECT = new ServerPacket(11, 10);
		IF_SETPOSITION = new ServerPacket(12, 8);
		IF_SET_ROTATE_SPEED = new ServerPacket(13, 8);
		UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER = new ServerPacket(14, -1);
		IF_SETHIDE = new ServerPacket(15, 5);
		UPDATE_INV_PARTIAL = new ServerPacket(16, -2);
		MESSAGE_GAME = new ServerPacket(17, -1);
		MIDI_SWAP = new ServerPacket(18, 8);
		UPDATE_ZONE_FULL_FOLLOWS = new ServerPacket(19, 3);
		RESET_ANIMS = new ServerPacket(20, 0);
		UPDATE_IGNORELIST = new ServerPacket(21, -2);
		IF_SETNPCHEAD = new ServerPacket(22, 6);
		VARP_LARGE = new ServerPacket(23, 6);
		UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL = new ServerPacket(24, 3);
		RUNCLIENTSCRIPT = new ServerPacket(25, -2);
		field3755 = new ServerPacket(26, 17);
		UPDATE_FRIENDLIST = new ServerPacket(27, -2);
		IF_SETNPCHEAD_ACTIVE = new ServerPacket(28, 6);
		CLAN_SETTINGS_DELTA = new ServerPacket(29, -2);
		NPC_SET_SEQUENCE = new ServerPacket(30, 5);
		CLAN_SETTINGS_FULL = new ServerPacket(31, -2);
		OBJ_OPFILTER = new ServerPacket(32, 4);
		NPC_HEADICON_SPECIFIC = new ServerPacket(33, 9);
		MINIMAP_TOGGLE = new ServerPacket(34, 1);
		field3762 = new ServerPacket(35, 10);
		RESET_INTERACTION_MODE = new ServerPacket(36, 2);
		REBUILD_NORMAL = new ServerPacket(37, -2);
		REBUILD_REGION = new ServerPacket(38, -2);
		HINT_ARROW = new ServerPacket(39, 6);
		CAM_LOOKAT = new ServerPacket(40, 7);
		LOC_DEL = new ServerPacket(41, 2);
		field3709 = new ServerPacket(42, 1);
		MAP_ANIM = new ServerPacket(43, 6);
		URL_OPEN = new ServerPacket(44, -2);
		field3712 = new ServerPacket(45, 4);
		IF_CLOSESUB = new ServerPacket(46, 4);
		LOC_ANIM = new ServerPacket(47, 4);
		CAM_RESET = new ServerPacket(48, 0);
		field3772 = new ServerPacket(49, 1);
		MESSAGE_PRIVATE = new ServerPacket(50, -2);
		MINIMAP_FLAG_SET = new ServerPacket(51, 2);
		CAM_MODE = new ServerPacket(52, 1);
		PLAYER_SPOTANIM = new ServerPacket(53, 9);
		CLAN_CHANNEL_DELTA = new ServerPacket(54, -2);
		field3722 = new ServerPacket(55, 7);
		IF_SET_PLAYERMODEL_BASECOLOUR = new ServerPacket(56, 6);
		IF_OPENSUB = new ServerPacket(57, 7);
		MIDI_SONG_WITH_SECONDARY = new ServerPacket(58, 12);
		CAM_SMOOTH_RESET = new ServerPacket(59, 4);
		field3696 = new ServerPacket(60, 1);
		MESSAGE_FRIEND_PRIVATE = new ServerPacket(61, -1);
		HEAT_MAP = new ServerPacket(62, 1);
		PING_STATISTICS_REQUEST = new ServerPacket(63, 8);
		UPDATE_UID192 = new ServerPacket(64, 28);
		OBJ_COUNT = new ServerPacket(65, 11);
		CAM_SHAKE = new ServerPacket(66, 4);
		UPDATE_RUN_WEIGHT = new ServerPacket(67, 2);
		UPDATE_INV_CLEAR = new ServerPacket(68, 4);
		IF_OPENTOP = new ServerPacket(69, 2);
		OCULUS_SYNC = new ServerPacket(70, 4);
		CAM_MOVETO_EASED_CIRCULAR = new ServerPacket(71, 10);
		VAR_CLAN_DISABLE = new ServerPacket(72, 0);
		LOC_ADD_CHANGE = new ServerPacket(73, -2);
		SET_PRIVCHATMODE = new ServerPacket(74, 1);
		LOGOUT_FULL = new ServerPacket(75, 0);
		VAR_CLAN_ENABLE = new ServerPacket(76, 0);
		SET_PLAYER_OP = new ServerPacket(77, -1);
		SYNC_CLIENT_VARCACHE = new ServerPacket(78, 0);
		field3746 = new ServerPacket(79, 5);
		CHAT_FILTER_SETTINGS = new ServerPacket(80, 2);
		field3759 = new ServerPacket(81, -1);
		IF_SET_TEXT = new ServerPacket(82, -2);
		CLAN_CHANNEL_FULL = new ServerPacket(83, -2);
		CAM_MOVETO = new ServerPacket(84, 8);
		VAR_CLAN = new ServerPacket(85, -1);
		IF_MOVESUB = new ServerPacket(86, 8);
		IF_SETANGLE = new ServerPacket(87, 10);
		UPDATE_RUN_ENERGY = new ServerPacket(88, 2);
		UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1 = new ServerPacket(89, -2);
		PLAYER_ANIM_SPECIFIC = new ServerPacket(90, 3);
		CAM_LOOKAT_EASED_ANGLE_RELATIVE = new ServerPacket(91, 7);
		GRAPHICSOBJECT_SPAWN = new ServerPacket(92, 8);
		REBUILD_WORLDENTITY = new ServerPacket(93, -2);
		NPC_INFO_SMALL_VIEWPORT = new ServerPacket(94, -2);
		UPDATE_ZONE_PARTIAL_ENCLOSED = new ServerPacket(95, -2);
		REFLECTION_CHECKER = new ServerPacket(96, -2);
		UPDATE_TRADING_POST = new ServerPacket(97, -2);
		UPDATE_STAT = new ServerPacket(98, 7);
		MESSAGE_FRIENDS_CHAT = new ServerPacket(99, -1);
		IF_SETPLAYERHEAD = new ServerPacket(100, 4);
		CAM_LOOKAT_EASED_COORD = new ServerPacket(101, 7);
		LOGOUT = new ServerPacket(102, 1);
		CAM_TARGET = new ServerPacket(103, 5);
		EVENT_WORLDHOP = new ServerPacket(104, -1);
		TRIGGER_ONDIALOG_ABORT = new ServerPacket(105, 0);
		IF_SET_PLAYERMODEL_SELF = new ServerPacket(106, 5);
		SET_NPC_UPDATE_ORIGIN = new ServerPacket(107, 2);
		NPC_SPOTANIM = new ServerPacket(108, 9);
		MESSAGE_PRIVATE_ECHO = new ServerPacket(109, -2);
		FRIENDS_LIST_LOADED = new ServerPacket(110, 0);
		IF_SETANIM = new ServerPacket(111, 6);
		IF_SETMODEL = new ServerPacket(112, 6);
		MESSAGE_CLAN_CHANNEL_SYSTEM = new ServerPacket(113, -1);
		MIDI_SONG_STOP = new ServerPacket(114, 4);
		NPC_INFO_LARGE_VIEWPORT = new ServerPacket(115, -2);
		SERVER_TICK_END = new ServerPacket(116, 0);
		field3784 = new ServerPacket(117, -2);
		IF_SETCOLOUR = new ServerPacket(118, 6);
		UPDATE_INV_FULL = new ServerPacket(119, -2);
		LOC_MERGEPLAYER = new ServerPacket(120, 14);
		PLAYER_INFO = new ServerPacket(121, -2);
		OBJ_DEL = new ServerPacket(122, 7);
		DYNAMICOBJECT_SPAWN = new ServerPacket(123, 6);
		UPDATE_SITE_SETTINGS = new ServerPacket(124, -1);
		MIDI_JINGLE = new ServerPacket(125, 5);
		RESET_CLIENT_VARCACHE = new ServerPacket(126, 0);
		UPDATE_INV_STOP_TRANSIT = new ServerPacket(127, 2);
		field3795 = new ServerPacket(128, 2);
		field3796 = new ServerPacket(129, -2);
		OBJ_RESET_CUSTOMIZATION = new ServerPacket(130, 7);
		IF_SET_EVENTS = new ServerPacket(131, 16);
		field3763 = new ServerPacket(132, 10);
		field3800 = new ServerPacket(133, 14);
		IF_RESYNC = new ServerPacket(134, -2);
		PROJECTILE_SPAWN = new ServerPacket(135, 27);
		field3697 = new ServerPacket(136, 8);
		field3717 = new ServerPacket(137, 20);
		OBJ_SET_CUSTOMIZATION = new ServerPacket(138, 17);
		field3806 = new ServerPacket(139, -2);
		SET_ACTIVE_WORLD = new ServerPacket(140, 3);
	}

	ServerPacket(int var1, int var2) {
		this.id = var1;
		this.length = var2;
	}
}
