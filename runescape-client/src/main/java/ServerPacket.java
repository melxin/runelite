import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mt")
@Implements("ServerPacket")
public class ServerPacket {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket CAM_MODE;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket MIDI_SONG;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket VARP_SMALL;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket MIDI_SONG_WITH_SECONDARY;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket NPC_INFO_SMALL_VIEWPORT;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket UPDATE_INV_STOP_TRANSIT;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	static final ServerPacket field3580;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket UPDATE_INV_PARTIAL;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket NPC_INFO_LARGE_VIEWPORT;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket MIDI_JINGLE;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket field3584;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket PLAYER_SPOTANIM;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket CAM_SMOOTH_RESET;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket EVENT_WORLDHOP;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket IF_SETNPCHEAD_ACTIVE;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket IF_SET_PLAYERMODEL_BASECOLOUR;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket field3668;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket CAM_LOOKAT_EASED_COORD;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket CAM_LOOKAT;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket CLAN_SETTINGS_FULL;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket RESET_ANIMS;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket HEAT_MAP;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket VAR_CLAN_ENABLE;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket VARP_LARGE;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket LOGOUT_FULL;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket UPDATE_INV_FULL;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket PLAYER_ANIM_SPECIFIC;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket field3674;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket UPDATE_STOCKMARKET_SLOT;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket UPDATE_STAT;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket OBJ_COUNT;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket IF_SET_ROTATE_SPEED;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket CAM_MOVETO_EASED_CIRCULAR;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket CAM_RESET;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket field3608;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket PING_STATISTICS_REQUEST;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket field3610;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket VAR_CLAN;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket LOC_ANIM;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket field3664;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket field3614;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket IF_SETNPCHEAD;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket MINIMAP_FLAG_SET;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket field3635;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket field3618;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket IF_SETOBJECT;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket LOGOUT;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket REFLECTION_CHECKER;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket UPDATE_FRIENDLIST;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket MIDI_SONG_STOP;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket IF_SETANGLE;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket IF_SETSCROLLPOS;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket IF_SETPOSITION;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket MESSAGE_CLAN_CHANNEL_SYSTEM;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket IF_MOVESUB;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket SYNC_CLIENT_VARCACHE;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket REBUILD_WORLDENTITY;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket field3631;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket UPDATE_INV_CLEAR;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket UPDATE_ZONE_FULL_FOLLOWS;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket SET_PRIVCHATMODE;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket IF_SETPLAYERHEAD;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket CAM_LOOKAT_EASED_ANGLE_RELATIVE;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket MIDI_SWAP;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket HINT_ARROW;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket OCULUS_SYNC;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket CAM_SETANGLE;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket SET_NPC_UPDATE_ORIGIN;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket MINIMAP_TOGGLE;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket CAM_MOVE_TO;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket IF_SET_PLAYERMODEL_OBJ;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket IF_OPENTOP;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket IF_CLOSESUB;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket FRIENDS_LIST_LOADED;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket NPC_SET_SEQUENCE;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket UPDATE_IGNORELIST;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket NPC_HEADICON_SPECIFIC;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket CAM_MOVETO;
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket RESET_INTERACTION_MODE;
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket URL_OPEN;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket UPDATE_REBOOT_TIMER;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket RESET_CLIENT_VARCACHE;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	static final ServerPacket field3659;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket IF_SET_PLAYERMODEL_SELF;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket VAR_CLAN_DISABLE;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket MAP_ANIM;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket MESSAGE_PRIVATE;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket CAM_TARGET;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket CLAN_CHANNEL_DELTA;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket SERVER_TICK_END;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket UPDATE_TRADING_POST;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket DYNAMICOBJECT_SPAWN;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket field3686;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket UPDATE_ZONE_PARTIAL_ENCLOSED;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket CAM_SHAKE;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket IF_SETMODEL;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket IF_SETANIM;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket REBUILD_REGION;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket field3675;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket MESSAGE_PRIVATE_ECHO;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket field3677;
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket field3669;
	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket GRAPHICSOBJECT_SPAWN;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket LOC_DEL;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket OBJ_DEL;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket MESSAGE_FRIEND_PRIVATE;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket MESSAGE_GAME;
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket IF_SETCOLOUR;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket SET_PLAYER_OP;
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket REBUILD_NORMAL;
	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket IF_OPENSUB;
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket MESSAGE_FRIENDS_CHAT;
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket IF_SET_TEXT;
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket IF_SET_PLAYERMODEL_BODYTYPE;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket UPDATE_UID192;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket field3692;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket RUNCLIENTSCRIPT;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket NPC_SPOTANIM;
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket OBJ_ADD;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket field3696;
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket CLAN_CHANNEL_FULL;
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket TRIGGER_ONDIALOG_ABORT;
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket UPDATE_SITE_SETTINGS;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket PLAYER_INFO;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket CLAN_SETTINGS_DELTA;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket field3702;
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket field3703;
	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket field3704;
	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket IF_SET_EVENTS;
	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket field3706;
	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket SET_ACTIVE_WORLD;
	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket OBJ_RESET_CUSTOMIZATION;
	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket IF_RESYNC;
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket OBJ_SET_CUSTOMIZATION;
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket field3711;
	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public static final ServerPacket PROJECTILE_SPAWN;
	@ObfuscatedName("fw")
	@ObfuscatedGetter(
		intValue = -297629703
	)
	@Export("id")
	public final int id;
	@ObfuscatedName("fp")
	@ObfuscatedGetter(
		intValue = -1819435665
	)
	@Export("length")
	public final int length;

	static {
		CAM_MODE = new ServerPacket(0, 1);
		MIDI_SONG = new ServerPacket(1, 10);
		VARP_SMALL = new ServerPacket(2, 3);
		MIDI_SONG_WITH_SECONDARY = new ServerPacket(3, 12);
		NPC_INFO_SMALL_VIEWPORT = new ServerPacket(4, -2);
		UPDATE_INV_STOP_TRANSIT = new ServerPacket(5, 2);
		field3580 = new ServerPacket(6, -2);
		UPDATE_INV_PARTIAL = new ServerPacket(7, -2);
		NPC_INFO_LARGE_VIEWPORT = new ServerPacket(8, -2);
		MIDI_JINGLE = new ServerPacket(9, 5);
		field3584 = new ServerPacket(10, 1);
		PLAYER_SPOTANIM = new ServerPacket(11, 9);
		CAM_SMOOTH_RESET = new ServerPacket(12, 4);
		EVENT_WORLDHOP = new ServerPacket(13, -1);
		IF_SETNPCHEAD_ACTIVE = new ServerPacket(14, 6);
		IF_SET_PLAYERMODEL_BASECOLOUR = new ServerPacket(15, 6);
		field3668 = new ServerPacket(16, 4);
		CAM_LOOKAT_EASED_COORD = new ServerPacket(17, 7);
		CAM_LOOKAT = new ServerPacket(18, 7);
		CLAN_SETTINGS_FULL = new ServerPacket(19, -2);
		RESET_ANIMS = new ServerPacket(20, 0);
		HEAT_MAP = new ServerPacket(21, 1);
		VAR_CLAN_ENABLE = new ServerPacket(22, 0);
		VARP_LARGE = new ServerPacket(23, 6);
		LOGOUT_FULL = new ServerPacket(24, 0);
		UPDATE_INV_FULL = new ServerPacket(25, -2);
		PLAYER_ANIM_SPECIFIC = new ServerPacket(26, 3);
		field3674 = new ServerPacket(27, 5);
		UPDATE_STOCKMARKET_SLOT = new ServerPacket(28, 20);
		UPDATE_STAT = new ServerPacket(29, 7);
		OBJ_COUNT = new ServerPacket(30, 11);
		IF_SET_ROTATE_SPEED = new ServerPacket(31, 8);
		CAM_MOVETO_EASED_CIRCULAR = new ServerPacket(32, 10);
		CAM_RESET = new ServerPacket(33, 0);
		field3608 = new ServerPacket(34, 1);
		PING_STATISTICS_REQUEST = new ServerPacket(35, 8);
		field3610 = new ServerPacket(36, 2);
		VAR_CLAN = new ServerPacket(37, -1);
		LOC_ANIM = new ServerPacket(38, 4);
		field3664 = new ServerPacket(39, -1);
		field3614 = new ServerPacket(40, -2);
		IF_SETNPCHEAD = new ServerPacket(41, 6);
		MINIMAP_FLAG_SET = new ServerPacket(42, 2);
		field3635 = new ServerPacket(43, 17);
		field3618 = new ServerPacket(44, 5);
		IF_SETOBJECT = new ServerPacket(45, 10);
		LOGOUT = new ServerPacket(46, 1);
		REFLECTION_CHECKER = new ServerPacket(47, -2);
		UPDATE_FRIENDLIST = new ServerPacket(48, -2);
		MIDI_SONG_STOP = new ServerPacket(49, 4);
		IF_SETANGLE = new ServerPacket(50, 10);
		IF_SETSCROLLPOS = new ServerPacket(51, 6);
		IF_SETPOSITION = new ServerPacket(52, 8);
		MESSAGE_CLAN_CHANNEL_SYSTEM = new ServerPacket(53, -1);
		IF_MOVESUB = new ServerPacket(54, 8);
		SYNC_CLIENT_VARCACHE = new ServerPacket(55, 0);
		REBUILD_WORLDENTITY = new ServerPacket(56, -2);
		field3631 = new ServerPacket(57, 10);
		UPDATE_INV_CLEAR = new ServerPacket(58, 4);
		UPDATE_ZONE_FULL_FOLLOWS = new ServerPacket(59, 3);
		SET_PRIVCHATMODE = new ServerPacket(60, 1);
		UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER = new ServerPacket(61, -1);
		IF_SETPLAYERHEAD = new ServerPacket(62, 4);
		CAM_LOOKAT_EASED_ANGLE_RELATIVE = new ServerPacket(63, 7);
		MIDI_SWAP = new ServerPacket(64, 8);
		HINT_ARROW = new ServerPacket(65, 6);
		OCULUS_SYNC = new ServerPacket(66, 4);
		CAM_SETANGLE = new ServerPacket(67, 6);
		SET_NPC_UPDATE_ORIGIN = new ServerPacket(68, 2);
		MINIMAP_TOGGLE = new ServerPacket(69, 1);
		UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1 = new ServerPacket(70, -2);
		CAM_MOVE_TO = new ServerPacket(71, 6);
		IF_SET_PLAYERMODEL_OBJ = new ServerPacket(72, 8);
		IF_OPENTOP = new ServerPacket(73, 2);
		IF_CLOSESUB = new ServerPacket(74, 4);
		FRIENDS_LIST_LOADED = new ServerPacket(75, 0);
		NPC_SET_SEQUENCE = new ServerPacket(76, 5);
		UPDATE_IGNORELIST = new ServerPacket(77, -2);
		NPC_HEADICON_SPECIFIC = new ServerPacket(78, 9);
		CAM_MOVETO = new ServerPacket(79, 8);
		RESET_INTERACTION_MODE = new ServerPacket(80, 2);
		URL_OPEN = new ServerPacket(81, -2);
		UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL = new ServerPacket(82, 3);
		UPDATE_REBOOT_TIMER = new ServerPacket(83, 2);
		RESET_CLIENT_VARCACHE = new ServerPacket(84, 0);
		field3659 = new ServerPacket(85, 7);
		IF_SET_PLAYERMODEL_SELF = new ServerPacket(86, 5);
		VAR_CLAN_DISABLE = new ServerPacket(87, 0);
		MAP_ANIM = new ServerPacket(88, 6);
		MESSAGE_PRIVATE = new ServerPacket(89, -2);
		CAM_TARGET = new ServerPacket(90, 5);
		CLAN_CHANNEL_DELTA = new ServerPacket(91, -2);
		SERVER_TICK_END = new ServerPacket(92, 0);
		UPDATE_TRADING_POST = new ServerPacket(93, -2);
		DYNAMICOBJECT_SPAWN = new ServerPacket(94, 6);
		field3686 = new ServerPacket(95, 4);
		UPDATE_ZONE_PARTIAL_ENCLOSED = new ServerPacket(96, -2);
		CAM_SHAKE = new ServerPacket(97, 4);
		IF_SETMODEL = new ServerPacket(98, 6);
		IF_SETANIM = new ServerPacket(99, 6);
		REBUILD_REGION = new ServerPacket(100, -2);
		field3675 = new ServerPacket(101, 2);
		MESSAGE_PRIVATE_ECHO = new ServerPacket(102, -2);
		field3677 = new ServerPacket(103, 7);
		field3669 = new ServerPacket(104, 14);
		GRAPHICSOBJECT_SPAWN = new ServerPacket(105, 8);
		LOC_DEL = new ServerPacket(106, 2);
		OBJ_DEL = new ServerPacket(107, 7);
		MESSAGE_FRIEND_PRIVATE = new ServerPacket(108, -1);
		MESSAGE_GAME = new ServerPacket(109, -1);
		IF_SETCOLOUR = new ServerPacket(110, 6);
		SET_PLAYER_OP = new ServerPacket(111, -1);
		REBUILD_NORMAL = new ServerPacket(112, -2);
		IF_OPENSUB = new ServerPacket(113, 7);
		MESSAGE_FRIENDS_CHAT = new ServerPacket(114, -1);
		IF_SET_TEXT = new ServerPacket(115, -2);
		IF_SET_PLAYERMODEL_BODYTYPE = new ServerPacket(116, 5);
		UPDATE_UID192 = new ServerPacket(117, 28);
		field3692 = new ServerPacket(118, 2);
		RUNCLIENTSCRIPT = new ServerPacket(119, -2);
		NPC_SPOTANIM = new ServerPacket(120, 9);
		OBJ_ADD = new ServerPacket(121, 14);
		field3696 = new ServerPacket(122, 1);
		CLAN_CHANNEL_FULL = new ServerPacket(123, -2);
		TRIGGER_ONDIALOG_ABORT = new ServerPacket(124, 0);
		UPDATE_SITE_SETTINGS = new ServerPacket(125, -1);
		PLAYER_INFO = new ServerPacket(126, -2);
		CLAN_SETTINGS_DELTA = new ServerPacket(127, -2);
		field3702 = new ServerPacket(128, 10);
		field3703 = new ServerPacket(129, 2);
		field3704 = new ServerPacket(130, -2);
		IF_SET_EVENTS = new ServerPacket(131, 16);
		field3706 = new ServerPacket(132, 14);
		SET_ACTIVE_WORLD = new ServerPacket(133, 3);
		OBJ_RESET_CUSTOMIZATION = new ServerPacket(134, 7);
		IF_RESYNC = new ServerPacket(135, -2);
		OBJ_SET_CUSTOMIZATION = new ServerPacket(136, 17);
		field3711 = new ServerPacket(137, 20);
		PROJECTILE_SPAWN = new ServerPacket(138, 27);
	}

	ServerPacket(int var1, int var2) {
		this.id = var1;
		this.length = var2;
	}
}
