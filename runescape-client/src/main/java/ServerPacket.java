import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mi")
@Implements("ServerPacket")
public class ServerPacket {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket CAM_RESET;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket IF_OPENTOP;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket LOGOUT_FULL;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket IF_SET_PLAYERMODEL_SELF;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket MESSAGE_PRIVATE_ECHO;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket CLAN_CHANNEL_FULL;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket MAP_ANIM;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket LOC_ANIM;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket UPDATE_STAT;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket field3514;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket NPC_INFO_LARGE_VIEWPORT;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket PROJECTILE_SPAWN;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket URL_OPEN;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket UPDATE_STOCKMARKET_SLOT;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket SET_PRIVCHATMODE;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket MESSAGE_FRIEND_PRIVATE;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket CAM_LOOKAT_EASED_COORD;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket UPDATE_FRIENDLIST;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket field3598;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket field3524;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket field3525;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket CLAN_CHANNEL_DELTA;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket IF_SETHIDE;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket MIDI_SONG;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket UPDATE_INV_FULL;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket UPDATE_INV_PARTIAL;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket RUNCLIENTSCRIPT;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket VARP_LARGE;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket IF_SETOBJECT;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket MIDI_JINGLE;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket CLAN_SETTINGS_DELTA;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket MESSAGE_GAME;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket MESSAGE_FRIENDS_CHAT;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket field3539;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket field3540;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket field3541;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket field3542;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket CAM_SMOOTH_RESET;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	static final ServerPacket field3544;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket UPDATE_UID192;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket LOC_MERGEPLAYER;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket IF_SETPLAYERHEAD;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket field3548;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket IF_CLOSESUB;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket IF_SETANIM;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket CAM_MOVETO;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket PING_STATISTICS_REQUEST;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket field3516;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket OCULUS_SYNC;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket CAM_MOVETO_EASED_CIRCULAR;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket IF_SET_PLAYERMODEL_BASECOLOUR;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket UPDATE_INV_CLEAR;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket IF_SET_TEXT;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket IF_SETMODEL;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket LOC_ADD_CHANGE;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket IF_SETPOSITION;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket NPC_SET_SEQUENCE;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket MIDI_SONG_STOP;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket PLAYER_INFO;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket UPDATE_ZONE_PARTIAL_ENCLOSED;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket MIDI_SWAP;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket IF_OPENSUB;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket SET_PLAYER_OP;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket VAR_CLAN_ENABLE;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket UPDATE_REBOOT_TIMER;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket UPDATE_ZONE_FULL_FOLLOWS;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket UPDATE_IGNORELIST;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket VAR_CLAN;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket HEAT_MAP;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket field3556;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket IF_SETNPCHEAD_ACTIVE;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket field3577;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket MINIMAP_TOGGLE;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket IF_SETSCROLLPOS;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket PLAYER_SPOTANIM;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket UPDATE_INV_STOP_TRANSIT;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket SYNC_CLIENT_VARCACHE;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket UPDATE_SITE_SETTINGS;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket CAM_LOOKAT_EASED_ANGLE_RELATIVE;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket MAP_PROJANIM;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket NPC_SPOTANIM;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket field3587;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket field3596;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket CAM_SHAKE;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket field3632;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket MESSAGE_CLAN_CHANNEL_SYSTEM;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket CLAN_SETTINGS_FULL;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket field3594;
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket CAM_LOOKAT;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket UPDATE_TRADING_POST;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket IF_SET_PLAYERMODEL_BODYTYPE;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket field3559;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket IF_SETNPCHEAD;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket OBJ_OPFILTER;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket VAR_CLAN_DISABLE;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket CAM_MOVE_TO;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket OBJ_COUNT;
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket GRAPHICSOBJECT_SPAWN;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket OBJ_DEL;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket LOGOUT;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket REBUILD_NORMAL;
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket IF_SETCOLOUR;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket REFLECTION_CHECKER;
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket VARP_SMALL;
	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket CAM_MODE;
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket REBUILD_REGION;
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket NPC_HEADICON_SPECIFIC;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket OBJ_ADD;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket LOC_DEL;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket TRIGGER_ONDIALOG_ABORT;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket IF_SETANGLE;
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket DYNAMICOBJECT_SPAWN;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket IF_MOVESUB;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket IF_RESYNC;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket IF_SET_PLAYERMODEL_OBJ;
	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket HINT_ARROW;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket IF_SET_ROTATE_SPEED;
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket IF_SET_EVENTS;
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket SET_NPC_UPDATE_ORIGIN;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket RESET_CLIENT_VARCACHE;
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket MESSAGE_PRIVATE;
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	static final ServerPacket field3580;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket MIDI_SONG_WITH_SECONDARY;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket EVENT_WORLDHOP;
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket CAM_SETANGLE;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket NPC_INFO_SMALL_VIEWPORT;
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket REBUILD_WORLDENTITY;
	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket SET_ACTIVE_WORLD;
	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket field3636;
	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket RESET_INTERACTION_MODE;
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket OBJ_SET_CUSTOMIZATION;
	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket field3639;
	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket OBJ_RESET_CUSTOMIZATION;
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	public static final ServerPacket field3641;
	@ObfuscatedName("fq")
	@ObfuscatedGetter(
		intValue = 122258383
	)
	@Export("id")
	public final int id;
	@ObfuscatedName("fu")
	@ObfuscatedGetter(
		intValue = -954054933
	)
	@Export("length")
	public final int length;

	static {
		CAM_RESET = new ServerPacket(0, 0);
		IF_OPENTOP = new ServerPacket(1, 2);
		LOGOUT_FULL = new ServerPacket(2, 0);
		IF_SET_PLAYERMODEL_SELF = new ServerPacket(3, 5);
		MESSAGE_PRIVATE_ECHO = new ServerPacket(4, -2);
		CLAN_CHANNEL_FULL = new ServerPacket(5, -2);
		MAP_ANIM = new ServerPacket(6, 6);
		LOC_ANIM = new ServerPacket(7, 4);
		UPDATE_STAT = new ServerPacket(8, 7);
		field3514 = new ServerPacket(9, 0);
		NPC_INFO_LARGE_VIEWPORT = new ServerPacket(10, -2);
		PROJECTILE_SPAWN = new ServerPacket(11, 22);
		URL_OPEN = new ServerPacket(12, -2);
		UPDATE_STOCKMARKET_SLOT = new ServerPacket(13, 20);
		SET_PRIVCHATMODE = new ServerPacket(14, 1);
		MESSAGE_FRIEND_PRIVATE = new ServerPacket(15, -1);
		CAM_LOOKAT_EASED_COORD = new ServerPacket(16, 7);
		UPDATE_FRIENDLIST = new ServerPacket(17, -2);
		field3598 = new ServerPacket(18, 2);
		field3524 = new ServerPacket(19, 3);
		field3525 = new ServerPacket(20, 0);
		CLAN_CHANNEL_DELTA = new ServerPacket(21, -2);
		IF_SETHIDE = new ServerPacket(22, 5);
		MIDI_SONG = new ServerPacket(23, 10);
		UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER = new ServerPacket(24, -1);
		UPDATE_INV_FULL = new ServerPacket(25, -2);
		UPDATE_INV_PARTIAL = new ServerPacket(26, -2);
		RUNCLIENTSCRIPT = new ServerPacket(27, -2);
		VARP_LARGE = new ServerPacket(28, 6);
		IF_SETOBJECT = new ServerPacket(29, 10);
		MIDI_JINGLE = new ServerPacket(30, 5);
		CLAN_SETTINGS_DELTA = new ServerPacket(31, -2);
		MESSAGE_GAME = new ServerPacket(32, -1);
		MESSAGE_FRIENDS_CHAT = new ServerPacket(33, -1);
		field3539 = new ServerPacket(34, 1);
		field3540 = new ServerPacket(35, 0);
		field3541 = new ServerPacket(36, 2);
		field3542 = new ServerPacket(37, -1);
		CAM_SMOOTH_RESET = new ServerPacket(38, 4);
		field3544 = new ServerPacket(39, 7);
		UPDATE_UID192 = new ServerPacket(40, 28);
		LOC_MERGEPLAYER = new ServerPacket(41, 14);
		IF_SETPLAYERHEAD = new ServerPacket(42, 4);
		field3548 = new ServerPacket(43, 0);
		IF_CLOSESUB = new ServerPacket(44, 4);
		IF_SETANIM = new ServerPacket(45, 6);
		CAM_MOVETO = new ServerPacket(46, 8);
		PING_STATISTICS_REQUEST = new ServerPacket(47, 8);
		field3516 = new ServerPacket(48, 5);
		OCULUS_SYNC = new ServerPacket(49, 4);
		CAM_MOVETO_EASED_CIRCULAR = new ServerPacket(50, 10);
		IF_SET_PLAYERMODEL_BASECOLOUR = new ServerPacket(51, 6);
		UPDATE_INV_CLEAR = new ServerPacket(52, 4);
		IF_SET_TEXT = new ServerPacket(53, -2);
		IF_SETMODEL = new ServerPacket(54, 6);
		LOC_ADD_CHANGE = new ServerPacket(55, -2);
		IF_SETPOSITION = new ServerPacket(56, 8);
		NPC_SET_SEQUENCE = new ServerPacket(57, 5);
		MIDI_SONG_STOP = new ServerPacket(58, 4);
		PLAYER_INFO = new ServerPacket(59, -2);
		UPDATE_ZONE_PARTIAL_ENCLOSED = new ServerPacket(60, -2);
		MIDI_SWAP = new ServerPacket(61, 8);
		IF_OPENSUB = new ServerPacket(62, 7);
		SET_PLAYER_OP = new ServerPacket(63, -1);
		VAR_CLAN_ENABLE = new ServerPacket(64, 0);
		UPDATE_REBOOT_TIMER = new ServerPacket(65, 2);
		UPDATE_ZONE_FULL_FOLLOWS = new ServerPacket(66, 3);
		UPDATE_IGNORELIST = new ServerPacket(67, -2);
		VAR_CLAN = new ServerPacket(68, -1);
		HEAT_MAP = new ServerPacket(69, 1);
		field3556 = new ServerPacket(70, 4);
		IF_SETNPCHEAD_ACTIVE = new ServerPacket(71, 6);
		field3577 = new ServerPacket(72, 1);
		MINIMAP_TOGGLE = new ServerPacket(73, 1);
		IF_SETSCROLLPOS = new ServerPacket(74, 6);
		PLAYER_SPOTANIM = new ServerPacket(75, 9);
		UPDATE_INV_STOP_TRANSIT = new ServerPacket(76, 2);
		SYNC_CLIENT_VARCACHE = new ServerPacket(77, 0);
		UPDATE_SITE_SETTINGS = new ServerPacket(78, -1);
		CAM_LOOKAT_EASED_ANGLE_RELATIVE = new ServerPacket(79, 7);
		MAP_PROJANIM = new ServerPacket(80, 20);
		NPC_SPOTANIM = new ServerPacket(81, 9);
		field3587 = new ServerPacket(82, -2);
		field3596 = new ServerPacket(83, 1);
		CAM_SHAKE = new ServerPacket(84, 4);
		field3632 = new ServerPacket(85, 5);
		MESSAGE_CLAN_CHANNEL_SYSTEM = new ServerPacket(86, -1);
		CLAN_SETTINGS_FULL = new ServerPacket(87, -2);
		UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1 = new ServerPacket(88, -2);
		field3594 = new ServerPacket(89, 2);
		CAM_LOOKAT = new ServerPacket(90, 7);
		UPDATE_TRADING_POST = new ServerPacket(91, -2);
		IF_SET_PLAYERMODEL_BODYTYPE = new ServerPacket(92, 5);
		field3559 = new ServerPacket(93, 2);
		UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL = new ServerPacket(94, 3);
		IF_SETNPCHEAD = new ServerPacket(95, 6);
		OBJ_OPFILTER = new ServerPacket(96, 4);
		VAR_CLAN_DISABLE = new ServerPacket(97, 0);
		CAM_MOVE_TO = new ServerPacket(98, 6);
		OBJ_COUNT = new ServerPacket(99, 11);
		GRAPHICSOBJECT_SPAWN = new ServerPacket(100, 8);
		OBJ_DEL = new ServerPacket(101, 7);
		LOGOUT = new ServerPacket(102, 1);
		REBUILD_NORMAL = new ServerPacket(103, -2);
		IF_SETCOLOUR = new ServerPacket(104, 6);
		REFLECTION_CHECKER = new ServerPacket(105, -2);
		VARP_SMALL = new ServerPacket(106, 3);
		CAM_MODE = new ServerPacket(107, 1);
		REBUILD_REGION = new ServerPacket(108, -2);
		NPC_HEADICON_SPECIFIC = new ServerPacket(109, 9);
		OBJ_ADD = new ServerPacket(110, 14);
		LOC_DEL = new ServerPacket(111, 2);
		TRIGGER_ONDIALOG_ABORT = new ServerPacket(112, 0);
		IF_SETANGLE = new ServerPacket(113, 10);
		DYNAMICOBJECT_SPAWN = new ServerPacket(114, 6);
		IF_MOVESUB = new ServerPacket(115, 8);
		IF_RESYNC = new ServerPacket(116, -2);
		IF_SET_PLAYERMODEL_OBJ = new ServerPacket(117, 8);
		HINT_ARROW = new ServerPacket(118, 6);
		IF_SET_ROTATE_SPEED = new ServerPacket(119, 8);
		IF_SET_EVENTS = new ServerPacket(120, 12);
		SET_NPC_UPDATE_ORIGIN = new ServerPacket(121, 2);
		RESET_CLIENT_VARCACHE = new ServerPacket(122, 0);
		MESSAGE_PRIVATE = new ServerPacket(123, -2);
		field3580 = new ServerPacket(124, -2);
		MIDI_SONG_WITH_SECONDARY = new ServerPacket(125, 12);
		EVENT_WORLDHOP = new ServerPacket(126, -1);
		CAM_SETANGLE = new ServerPacket(127, 6);
		NPC_INFO_SMALL_VIEWPORT = new ServerPacket(128, -2);
		REBUILD_WORLDENTITY = new ServerPacket(129, -2);
		SET_ACTIVE_WORLD = new ServerPacket(130, 3);
		field3636 = new ServerPacket(131, 2);
		RESET_INTERACTION_MODE = new ServerPacket(132, 2);
		OBJ_SET_CUSTOMIZATION = new ServerPacket(133, 17);
		field3639 = new ServerPacket(134, -2);
		OBJ_RESET_CUSTOMIZATION = new ServerPacket(135, 7);
		field3641 = new ServerPacket(136, 4);
	}

	ServerPacket(int var1, int var2) {
		this.id = var1;
		this.length = var2;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "284592598"
	)
	static SecureRandom method6515() {
		SecureRandom var0 = new SecureRandom();
		var0.nextInt();
		return var0;
	}
}
