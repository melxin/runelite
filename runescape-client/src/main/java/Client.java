import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenRequester;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;
import org.json.JSONException;
import org.json.JSONObject;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed, OAuthApi, class345 {
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	static final class282 field317;
	@ObfuscatedName("du")
	@Export("BASIC_AUTH_DESKTOP_OSRS")
	static final String BASIC_AUTH_DESKTOP_OSRS;
	@ObfuscatedName("do")
	@Export("BASIC_AUTH_DESKTOP_RUNELITE")
	static final String BASIC_AUTH_DESKTOP_RUNELITE;
	@ObfuscatedName("ew")
	static final int[] field320;
	@ObfuscatedName("ek")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("playerAppearance")
	static final PlayerComposition playerAppearance;
	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "Lbn;"
	)
	static final ApproximateRouteStrategy field323;
	@ObfuscatedName("ff")
	static boolean field427;
	@ObfuscatedName("fe")
	@ObfuscatedGetter(
		intValue = -98902411
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("fk")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("fo")
	@ObfuscatedGetter(
		intValue = 1412765109
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("fj")
	@ObfuscatedGetter(
		intValue = -1422845267
	)
	@Export("cycle")
	public static int cycle;
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	@Export("authenticationScheme")
	static AuthenticationScheme authenticationScheme;
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "Lwz;"
	)
	static class595 field330;
	@ObfuscatedName("fp")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("fx")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "Lco;"
	)
	@Export("worldViewManager")
	public static final WorldViewManager worldViewManager;
	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	@Export("playerUpdateManager")
	static PlayerUpdateManager playerUpdateManager;
	@ObfuscatedName("gj")
	@ObfuscatedGetter(
		intValue = 2024493031
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("gr")
	@ObfuscatedGetter(
		intValue = 1448913591
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("gs")
	@ObfuscatedGetter(
		intValue = -751707649
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = -1335059759
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("ge")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("gx")
	@ObfuscatedGetter(
		intValue = -2054334095
	)
	static int field341;
	@ObfuscatedName("gy")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("gh")
	@ObfuscatedGetter(
		intValue = -968136727
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("ga")
	@ObfuscatedGetter(
		intValue = 1076558369
	)
	static int field344;
	@ObfuscatedName("gc")
	static String field345;
	@ObfuscatedName("gm")
	@ObfuscatedGetter(
		intValue = -458120041
	)
	@Export("currentWorldViewId")
	static int currentWorldViewId;
	@ObfuscatedName("gf")
	@ObfuscatedGetter(
		intValue = 883771343
	)
	static int field347;
	@ObfuscatedName("gu")
	@ObfuscatedGetter(
		intValue = 306795665
	)
	static int field348;
	@ObfuscatedName("gt")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("gi")
	@ObfuscatedGetter(
		intValue = 1038526173
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("gl")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("gp")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("gg")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("hd")
	static int[] field615;
	@ObfuscatedName("hj")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("ha")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("hg")
	@ObfuscatedGetter(
		intValue = 1604730771
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("hc")
	@ObfuscatedGetter(
		longValue = -7548316783498577661L
	)
	static long field359;
	@ObfuscatedName("hm")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("hp")
	@ObfuscatedGetter(
		intValue = -187837221
	)
	static int field361;
	@ObfuscatedName("hq")
	@ObfuscatedGetter(
		intValue = -2017713217
	)
	@Export("revision")
	public static int revision;
	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("indexCheck")
	public static IndexCheck indexCheck;
	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	static class272 field598;
	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "[Lgs;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "[Lgm;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("ho")
	static short field367;
	@ObfuscatedName("hu")
	static short field368;
	@ObfuscatedName("hv")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("hr")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("he")
	static short field371;
	@ObfuscatedName("hb")
	static short field364;
	@ObfuscatedName("im")
	static short field419;
	@ObfuscatedName("il")
	static short field382;
	@ObfuscatedName("ia")
	@ObfuscatedGetter(
		intValue = -626292013
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("if")
	@ObfuscatedGetter(
		intValue = -1852070185
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("ib")
	@ObfuscatedGetter(
		intValue = 1357272997
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("is")
	@ObfuscatedGetter(
		intValue = -1897988279
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("iy")
	@ObfuscatedGetter(
		intValue = -1524432169
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "[Lqt;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "Lbh;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("ip")
	@ObfuscatedGetter(
		intValue = 777676787
	)
	static int field316;
	@ObfuscatedName("ig")
	@ObfuscatedGetter(
		intValue = 1430860259
	)
	public static int field432;
	@ObfuscatedName("ih")
	@ObfuscatedGetter(
		intValue = 377494033
	)
	static int field384;
	@ObfuscatedName("in")
	@ObfuscatedGetter(
		intValue = 2124912467
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("it")
	static String field528;
	@ObfuscatedName("jw")
	@ObfuscatedGetter(
		intValue = -1824175637
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("jb")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("jl")
	@ObfuscatedGetter(
		intValue = 1964749319
	)
	static int field388;
	@ObfuscatedName("je")
	@ObfuscatedGetter(
		intValue = -1253426495
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("jz")
	@ObfuscatedGetter(
		intValue = 1407927851
	)
	static int field390;
	@ObfuscatedName("jt")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("ja")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("jd")
	@ObfuscatedGetter(
		intValue = 2031205381
	)
	@Export("serverCycle")
	static int serverCycle;
	@ObfuscatedName("jy")
	@ObfuscatedGetter(
		longValue = 2032803268009057725L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("jf")
	@ObfuscatedGetter(
		intValue = -35742041
	)
	static int field386;
	@ObfuscatedName("js")
	@ObfuscatedGetter(
		intValue = -1725051333
	)
	static int field396;
	@ObfuscatedName("jr")
	@ObfuscatedGetter(
		longValue = -9212293690311687593L
	)
	static long field397;
	@ObfuscatedName("jm")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("ju")
	@ObfuscatedGetter(
		intValue = 936289107
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("jo")
	@Export("z")
	static boolean z;
	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	static class70 field401;
	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("kw")
	@ObfuscatedGetter(
		intValue = 557022671
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("kx")
	@ObfuscatedGetter(
		intValue = -1515410077
	)
	static int field526;
	@ObfuscatedName("lf")
	@ObfuscatedGetter(
		intValue = -1902543227
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("lo")
	@ObfuscatedGetter(
		intValue = 380087747
	)
	static int field351;
	@ObfuscatedName("la")
	@ObfuscatedGetter(
		intValue = 970024405
	)
	static int field448;
	@ObfuscatedName("ll")
	@ObfuscatedGetter(
		intValue = 1568972813
	)
	static int field464;
	@ObfuscatedName("lr")
	@ObfuscatedGetter(
		intValue = 975524249
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("lu")
	@ObfuscatedGetter(
		intValue = 1218361557
	)
	static int field410;
	@ObfuscatedName("ld")
	@ObfuscatedGetter(
		intValue = 683173837
	)
	static int field411;
	@ObfuscatedName("le")
	@ObfuscatedGetter(
		intValue = 2041456983
	)
	static int field329;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = 1324983587
	)
	static int field413;
	@ObfuscatedName("lz")
	@ObfuscatedGetter(
		intValue = 9248015
	)
	static int field476;
	@ObfuscatedName("ml")
	@ObfuscatedGetter(
		intValue = 33962871
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("mb")
	@ObfuscatedGetter(
		intValue = -2012695269
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("mi")
	@ObfuscatedGetter(
		intValue = -708504693
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("mo")
	@ObfuscatedGetter(
		intValue = -1999461305
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("mu")
	@ObfuscatedGetter(
		intValue = -1184919319
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("mq")
	@ObfuscatedGetter(
		intValue = -1324045149
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("mm")
	@ObfuscatedGetter(
		intValue = 1230015341
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("mw")
	@ObfuscatedGetter(
		intValue = 1835977501
	)
	static int field324;
	@ObfuscatedName("mr")
	@ObfuscatedGetter(
		intValue = 951850989
	)
	static int field573;
	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("mn")
	@ObfuscatedGetter(
		intValue = -1008879337
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("me")
	@ObfuscatedGetter(
		intValue = 1358315405
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("my")
	@ObfuscatedGetter(
		intValue = -1592588023
	)
	@Export("staffModLevel")
	public static int staffModLevel;
	@ObfuscatedName("mh")
	@ObfuscatedGetter(
		intValue = -1181390529
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("mf")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("mg")
	@ObfuscatedGetter(
		intValue = 276515071
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("mj")
	@ObfuscatedGetter(
		intValue = 1863335467
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("mt")
	@ObfuscatedGetter(
		intValue = 168964391
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	@Export("scriptEvents2")
	static NodeDeque scriptEvents2;
	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	@Export("scriptEvents3")
	static NodeDeque scriptEvents3;
	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	static NodeDeque field437;
	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("nr")
	@ObfuscatedGetter(
		intValue = 288419101
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("nb")
	@ObfuscatedGetter(
		intValue = -1906270399
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("ne")
	static String field441;
	@ObfuscatedName("nn")
	@ObfuscatedGetter(
		intValue = 1153945257
	)
	static int field442;
	@ObfuscatedName("nj")
	static int[] field443;
	@ObfuscatedName("nl")
	static int[] field511;
	@ObfuscatedName("nd")
	@ObfuscatedGetter(
		longValue = -2084200378230733539L
	)
	static long field466;
	@ObfuscatedName("no")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "Lvm;"
	)
	static class558 field399;
	@ObfuscatedName("ni")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("nv")
	static boolean field449;
	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("DBTableIndex_cache")
	static EvictingDualNodeHashTable DBTableIndex_cache;
	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("archive11")
	static EvictingDualNodeHashTable archive11;
	@ObfuscatedName("nc")
	static boolean field556;
	@ObfuscatedName("ns")
	static boolean field453;
	@ObfuscatedName("ny")
	static boolean field454;
	@ObfuscatedName("nh")
	@ObfuscatedGetter(
		intValue = 580675769
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("oj")
	@ObfuscatedGetter(
		intValue = 809562193
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("oz")
	@ObfuscatedGetter(
		intValue = -975593265
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("oq")
	@ObfuscatedGetter(
		intValue = 2046626993
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("od")
	@ObfuscatedGetter(
		intValue = -706859121
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("on")
	@ObfuscatedGetter(
		intValue = 61732740
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("oi")
	@ObfuscatedGetter(
		intValue = 667009728
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("om")
	@ObfuscatedGetter(
		intValue = -1073303104
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("ot")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("ov")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("or")
	static int[] field433;
	@ObfuscatedName("os")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("ox")
	@ObfuscatedGetter(
		intValue = 291921519
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("oc")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("oy")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("pp")
	static int[][][] field423;
	@ObfuscatedName("pm")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("ph")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("pl")
	@ObfuscatedGetter(
		intValue = 528483789
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("pw")
	@ObfuscatedGetter(
		intValue = -2086128627
	)
	@Export("graphicsCycle")
	static int graphicsCycle;
	@ObfuscatedName("qi")
	@ObfuscatedGetter(
		intValue = -1579415165
	)
	static int field395;
	@ObfuscatedName("qt")
	@ObfuscatedGetter(
		intValue = 1215737263
	)
	static int field478;
	@ObfuscatedName("qr")
	@ObfuscatedGetter(
		intValue = 1238391243
	)
	static int field513;
	@ObfuscatedName("qv")
	@ObfuscatedGetter(
		intValue = 421950669
	)
	static int field328;
	@ObfuscatedName("qf")
	static boolean field343;
	@ObfuscatedName("qo")
	@ObfuscatedGetter(
		intValue = 2086908927
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("qj")
	@ObfuscatedGetter(
		intValue = -119719139
	)
	static int field599;
	@ObfuscatedName("qc")
	@ObfuscatedGetter(
		intValue = -678540659
	)
	static int field414;
	@ObfuscatedName("qz")
	@ObfuscatedGetter(
		intValue = 1784741237
	)
	static int field548;
	@ObfuscatedName("qh")
	@ObfuscatedGetter(
		intValue = -1566631029
	)
	static int field486;
	@ObfuscatedName("qy")
	static boolean field377;
	@ObfuscatedName("qd")
	@ObfuscatedGetter(
		intValue = -1587427633
	)
	static int field488;
	@ObfuscatedName("qu")
	static boolean field489;
	@ObfuscatedName("qs")
	@ObfuscatedGetter(
		intValue = 331873649
	)
	static int field416;
	@ObfuscatedName("qq")
	@ObfuscatedGetter(
		intValue = 865675167
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("qn")
	@ObfuscatedGetter(
		intValue = 1975872717
	)
	static int field492;
	@ObfuscatedName("qk")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("qx")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("qg")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("rd")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("rz")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("rg")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("rn")
	static int[][] field586;
	@ObfuscatedName("rf")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("rt")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("rq")
	@ObfuscatedGetter(
		intValue = 1067132621
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("rw")
	@ObfuscatedGetter(
		intValue = -704663783
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("rk")
	@ObfuscatedGetter(
		intValue = -161613583
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("rm")
	@ObfuscatedGetter(
		intValue = 1339650577
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("re")
	@ObfuscatedGetter(
		intValue = 1816258559
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("rl")
	@ObfuscatedGetter(
		intValue = 312963301
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("rj")
	@ObfuscatedGetter(
		intValue = -1852195229
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("rr")
	@ObfuscatedGetter(
		longValue = 8524252714124657013L
	)
	@Export("userId")
	static long userId;
	@ObfuscatedName("ru")
	@ObfuscatedGetter(
		longValue = -906534219858289697L
	)
	@Export("userHash")
	static long userHash;
	@ObfuscatedName("ry")
	@ObfuscatedGetter(
		intValue = 211847097
	)
	static int field552;
	@ObfuscatedName("rv")
	@ObfuscatedGetter(
		intValue = 1146048219
	)
	static int field512;
	@ObfuscatedName("rb")
	@ObfuscatedGetter(
		intValue = -1810547151
	)
	static int field337;
	@ObfuscatedName("rs")
	@ObfuscatedGetter(
		intValue = -1962638809
	)
	static int field372;
	@ObfuscatedName("rx")
	static int[] field360;
	@ObfuscatedName("ri")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("rh")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("rp")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("sk")
	@ObfuscatedGetter(
		intValue = -1726867455
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("sp")
	@Export("leftClickOpensMenu")
	static boolean leftClickOpensMenu;
	@ObfuscatedName("sx")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("sc")
	@ObfuscatedSignature(
		descriptor = "Lxx;"
	)
	@Export("menu")
	static Menu menu;
	@ObfuscatedName("sy")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("ss")
	@ObfuscatedGetter(
		intValue = -1133973033
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("sz")
	@ObfuscatedGetter(
		intValue = -889943229
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("su")
	@ObfuscatedGetter(
		intValue = 403913315
	)
	static int field481;
	@ObfuscatedName("sw")
	@ObfuscatedGetter(
		intValue = -909941041
	)
	static int field426;
	@ObfuscatedName("sf")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("st")
	@ObfuscatedGetter(
		intValue = 1167624643
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("sv")
	@ObfuscatedGetter(
		intValue = 290948069
	)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("sn")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("sm")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("sl")
	@ObfuscatedGetter(
		intValue = -1810103421
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("sq")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("clickedWidget")
	public static Widget clickedWidget;
	@ObfuscatedName("sj")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("sr")
	@ObfuscatedGetter(
		intValue = -1669673945
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("sg")
	@ObfuscatedGetter(
		intValue = 917665723
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("se")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("tq")
	static boolean field540;
	@ObfuscatedName("tg")
	@ObfuscatedGetter(
		intValue = 1741851993
	)
	static int field541;
	@ObfuscatedName("td")
	@ObfuscatedGetter(
		intValue = -1398485149
	)
	static int field542;
	@ObfuscatedName("tk")
	static boolean field543;
	@ObfuscatedName("tp")
	@ObfuscatedGetter(
		intValue = -125777565
	)
	static int field544;
	@ObfuscatedName("tl")
	@ObfuscatedGetter(
		intValue = -997930977
	)
	static int field545;
	@ObfuscatedName("tw")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("tj")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("tn")
	@ObfuscatedGetter(
		intValue = 1949112271
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("tm")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("tt")
	@ObfuscatedGetter(
		intValue = 1927380943
	)
	@Export("changedItemsCount")
	static int changedItemsCount;
	@ObfuscatedName("ta")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("tu")
	@ObfuscatedGetter(
		intValue = -529782765
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("tf")
	static int[] field538;
	@ObfuscatedName("ts")
	@ObfuscatedGetter(
		intValue = -1787880695
	)
	static int field554;
	@ObfuscatedName("te")
	@ObfuscatedGetter(
		intValue = 469301589
	)
	static int field555;
	@ObfuscatedName("tx")
	@ObfuscatedGetter(
		intValue = 1487779339
	)
	static int field363;
	@ObfuscatedName("to")
	@ObfuscatedGetter(
		intValue = 736785051
	)
	static int field352;
	@ObfuscatedName("tz")
	@ObfuscatedGetter(
		intValue = -1916481829
	)
	static int field484;
	@ObfuscatedName("tv")
	@ObfuscatedGetter(
		intValue = 63095057
	)
	static int field559;
	@ObfuscatedName("tb")
	@ObfuscatedGetter(
		intValue = 657702577
	)
	static int field560;
	@ObfuscatedName("ti")
	@ObfuscatedGetter(
		intValue = -893776771
	)
	static int field561;
	@ObfuscatedName("uy")
	@ObfuscatedSignature(
		descriptor = "Lxp;"
	)
	static class609 field501;
	@ObfuscatedName("up")
	@ObfuscatedGetter(
		intValue = -1222851675
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("uu")
	@ObfuscatedGetter(
		intValue = 1678776695
	)
	static int field450;
	@ObfuscatedName("ud")
	@Export("validRootWidgets")
	static boolean[] validRootWidgets;
	@ObfuscatedName("uc")
	static boolean[] field566;
	@ObfuscatedName("un")
	static boolean[] field356;
	@ObfuscatedName("ul")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("ux")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("uo")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("ui")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("ut")
	@ObfuscatedGetter(
		intValue = -66048959
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("uj")
	static int[] field425;
	@ObfuscatedName("uz")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("uq")
	@ObfuscatedGetter(
		intValue = 434688723
	)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("ub")
	@ObfuscatedGetter(
		intValue = -1415757783
	)
	static int field576;
	@ObfuscatedName("ue")
	@ObfuscatedGetter(
		intValue = 384858289
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("ug")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("us")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("ua")
	@ObfuscatedSignature(
		descriptor = "[Lxt;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("uf")
	@ObfuscatedGetter(
		intValue = 200099919
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("um")
	@ObfuscatedGetter(
		intValue = -2016141117
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("uh")
	@ObfuscatedGetter(
		intValue = 182080851
	)
	static int field583;
	@ObfuscatedName("uk")
	@ObfuscatedGetter(
		intValue = -1997385273
	)
	static int field584;
	@ObfuscatedName("vj")
	@ObfuscatedGetter(
		intValue = -71360733
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("vr")
	static boolean field553;
	@ObfuscatedName("vi")
	static boolean field587;
	@ObfuscatedName("vc")
	static boolean field588;
	@ObfuscatedName("vl")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	static class551 field589;
	@ObfuscatedName("va")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	static class550 field514;
	@ObfuscatedName("vq")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	static class550 field477;
	@ObfuscatedName("ve")
	static boolean[] field610;
	@ObfuscatedName("vw")
	static int[] field593;
	@ObfuscatedName("vp")
	static int[] field594;
	@ObfuscatedName("wa")
	static int[] field595;
	@ObfuscatedName("wo")
	static int[] field406;
	@ObfuscatedName("wv")
	@ObfuscatedGetter(
		intValue = -1575623101
	)
	static int field479;
	@ObfuscatedName("wj")
	@ObfuscatedGetter(
		intValue = 1980250727
	)
	static int field569;
	@ObfuscatedName("ws")
	@ObfuscatedSignature(
		descriptor = "Lvh;"
	)
	static class547 field418;
	@ObfuscatedName("wr")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	static class490 field603;
	@ObfuscatedName("wu")
	static List field601;
	@ObfuscatedName("wq")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("wi")
	@ObfuscatedGetter(
		intValue = 2664197
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("wl")
	@ObfuscatedGetter(
		intValue = -1433097675
	)
	static int field604;
	@ObfuscatedName("wm")
	static int[] field605;
	@ObfuscatedName("wk")
	static int[] field606;
	@ObfuscatedName("wn")
	@Export("token")
	String token;
	@ObfuscatedName("wf")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	@Export("asyncRestClient")
	AsyncRestClient asyncRestClient;
	@ObfuscatedName("wb")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	@Export("asyncGameSessionTokenResponse")
	AsyncHttpResponse asyncGameSessionTokenResponse;
	@ObfuscatedName("wt")
	@Export("otlTokenRequester")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/OtlTokenRequester;"
	)
	OtlTokenRequester otlTokenRequester;
	@ObfuscatedName("wy")
	@Export("otlTokenRequestFuture")
	Future otlTokenRequestFuture;
	@ObfuscatedName("we")
	@Export("https")
	boolean https;
	@ObfuscatedName("wp")
	@ObfuscatedGetter(
		intValue = 1648047689
	)
	@Export("clientId")
	int clientId;
	@ObfuscatedName("wz")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	@Export("asyncAccessTokenResponse")
	AsyncHttpResponse asyncAccessTokenResponse;
	@ObfuscatedName("wh")
	@Export("refreshAccessTokenRequester")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	RefreshAccessTokenRequester refreshAccessTokenRequester;
	@ObfuscatedName("ww")
	@Export("refreshAccessTokenRequestFuture")
	Future refreshAccessTokenRequestFuture;
	@ObfuscatedName("xf")
	@ObfuscatedSignature(
		descriptor = "Lwb;"
	)
	Buffer field617;
	@ObfuscatedName("xw")
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	SpriteBufferProperties field618;
	@ObfuscatedName("xv")
	@ObfuscatedGetter(
		longValue = 5950739475798124899L
	)
	@Export("accountHash")
	long accountHash;

	static {
		packetWriter = new PacketWriter();
		field317 = new class282();
		BASIC_AUTH_DESKTOP_OSRS = ClanSettings.method3992(class382.method8180("com_jagex_auth_desktop_osrs:public"));
		BASIC_AUTH_DESKTOP_RUNELITE = ClanSettings.method3992(class382.method8180("com_jagex_auth_desktop_runelite:public"));
		field320 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
		playerAppearance = new PlayerComposition();
		field323 = new ApproximateRouteStrategy();
		field427 = true;
		worldId = 1;
		isMembersWorld = false;
		gameState = 0;
		cycle = 0;
		authenticationScheme = AuthenticationScheme.TOKEN;
		field330 = class595.field5970;
		Login_isUsernameRemembered = false;
		fontsMap = new HashMap();
		worldViewManager = new WorldViewManager();
		projectiles = new NodeDeque();
		playerUpdateManager = new PlayerUpdateManager();
		oculusOrbState = 0;
		camFollowHeight = 50;
		oculusOrbNormalSpeed = 12;
		oculusOrbSlowedSpeed = 6;
		showMouseCross = true;
		field341 = 0;
		showLoadingMessages = true;
		localPlayerIndex = -1;
		field344 = 0;
		field345 = "";
		currentWorldViewId = -1;
		field347 = -1;
		field348 = -1;
		renderSelf = true;
		drawPlayerNames = 0;
		currentLevels = new int[25];
		levels = new int[25];
		experience = new int[25];
		field615 = new int[25];
		followerOpsLowPriority = false;
		showMouseOverText = true;
		isItemSelected = 0;
		viewportWidget = null;
		field359 = 0L;
		isResizable = true;
		field361 = 600;
		revision = field361 / GameEngine.cycleDurationMillis;
		indexCheck = new IndexCheck();
		field598 = new class272();
		currentClanSettings = new ClanSettings[4];
		currentClanChannels = new ClanChannel[4];
		field367 = 256;
		field368 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field371 = 1;
		field364 = 32767;
		field419 = 1;
		field382 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		field316 = -1;
		field432 = -1;
		field384 = 30;
		worldProperties = 0;
		gameBuild = 0;
		isLowDetail = false;
		field388 = -1;
		clientType = -1;
		field390 = -1;
		onMobile = false;
		isLoading = true;
		serverCycle = 0;
		mouseLastLastPressedTimeMillis = 1L;
		field386 = -1;
		field396 = -1;
		field397 = -1L;
		hadFocus = true;
		rebootTimer = 0;
		z = false;
		field401 = class70.field969;
		js5ConnectState = 0;
		field526 = 0;
		js5Errors = 0;
		field351 = 0;
		field448 = 0;
		field464 = 0;
		logoutTimer = 0;
		field410 = 0;
		field411 = 1;
		field329 = 0;
		field413 = 1;
		field476 = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		mouseCamClickedX = 0;
		mouseCamClickedY = 0;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field324 = 0;
		field573 = -1;
		meslayerContinueWidget = null;
		runEnergy = 0;
		weight = 0;
		staffModLevel = 0;
		followerIndex = -1;
		playerMod = false;
		cycleCntr = 1;
		chatCycle = 0;
		mouseWheelRotation = 0;
		scriptEvents = new NodeDeque();
		scriptEvents2 = new NodeDeque();
		scriptEvents3 = new NodeDeque();
		field437 = new NodeDeque();
		widgetFlags = new NodeHashTable(512);
		publicChatMode = 0;
		tradeChatMode = 0;
		field441 = "";
		field442 = 0;
		field443 = new int[128];
		field511 = new int[128];
		field466 = -1L;
		playingJingle = false;
		field399 = new class558();
		isCameraLocked = false;
		field449 = false;
		DBTableIndex_cache = new EvictingDualNodeHashTable(64);
		archive11 = new EvictingDualNodeHashTable(64);
		field556 = false;
		field453 = false;
		field454 = false;
		hintArrowType = 0;
		hintArrowNpcIndex = 0;
		hintArrowPlayerIndex = 0;
		hintArrowX = 0;
		hintArrowY = 0;
		hintArrowHeight = 0;
		hintArrowSubX = 0;
		hintArrowSubY = 0;
		playerAttackOption = AttackOption.AttackOption_hidden;
		npcAttackOption = AttackOption.AttackOption_hidden;
		secureRandomFuture = new SecureRandomFuture();
		field433 = new int[4];
		randomDatData = null;
		npcCount = 0;
		npcIndices = new int[250];
		hadNetworkError = false;
		timer = new Timer();
		field423 = new int[4][13][13];
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		overheadTextLimit = -1;
		graphicsCycle = 0;
		field395 = 2301979;
		field478 = 5063219;
		field513 = 3353893;
		field328 = 7759444;
		field343 = false;
		alternativeScrollbarWidth = 0;
		field599 = 0;
		field414 = 0;
		field548 = 0;
		field486 = 0;
		field377 = false;
		field488 = 0;
		field489 = false;
		field416 = 0;
		overheadTextCount = 0;
		field492 = 50;
		overheadTextXs = new int[field492];
		overheadTextYs = new int[field492];
		overheadTextAscents = new int[field492];
		overheadTextXOffsets = new int[field492];
		overheadTextColors = new int[field492];
		overheadTextEffects = new int[field492];
		field586 = new int[field492][];
		overheadTextCyclesRemaining = new int[field492];
		overheadText = new String[field492];
		viewportDrawCount = 0;
		viewportTempX = -1;
		viewportTempY = -1;
		mouseCrossX = 0;
		mouseCrossY = 0;
		mouseCrossState = 0;
		mouseCrossColor = 0;
		userId = -1L;
		userHash = -1L;
		field552 = 0;
		field512 = 0;
		field337 = 0;
		field372 = 0;
		field360 = new int[1000];
		playerMenuActions = new String[8];
		playerOptionsPriorities = new boolean[8];
		defaultRotations = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
		combatTargetPlayerIndex = -1;
		leftClickOpensMenu = false;
		isMenuOpen = false;
		menu = new Menu(true);
		tapToDrop = false;
		viewportX = -1;
		viewportY = -1;
		field481 = 0;
		field426 = 50;
		field528 = null;
		isSpellSelected = false;
		selectedSpellChildIndex = -1;
		selectedSpellItemId = -1;
		selectedSpellActionName = null;
		selectedSpellName = null;
		chatEffects = 0;
		clickedWidget = null;
		clickedWidgetParent = null;
		widgetClickX = 0;
		widgetClickY = 0;
		draggedOnWidget = null;
		field540 = false;
		field541 = -1;
		field542 = -1;
		field543 = false;
		field544 = -1;
		field545 = -1;
		isDraggingWidget = false;
		changedVarps = new int[32];
		changedVarpCount = 0;
		changedItemContainers = new int[32];
		changedItemsCount = 0;
		changedSkills = new int[32];
		changedSkillsCount = 0;
		field538 = new int[32];
		field554 = 0;
		field555 = 0;
		field363 = 0;
		field352 = 0;
		field484 = 0;
		field559 = 0;
		field560 = 0;
		field561 = 0;
		field501 = new class609();
		rootWidgetCount = 0;
		field450 = -2;
		validRootWidgets = new boolean[100];
		field566 = new boolean[100];
		field356 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field425 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		crossWorldMessageIds = new long[100];
		crossWorldMessageIdsIndex = 0;
		field576 = -1;
		mapIconCount = 0;
		mapIconXs = new int[1000];
		mapIconYs = new int[1000];
		mapIcons = new SpritePixels[1000];
		destinationX = 0;
		destinationY = 0;
		field583 = -1;
		field584 = 0;
		minimapState = 0;
		field553 = false;
		field587 = false;
		field588 = false;
		field589 = null;
		field514 = null;
		field477 = null;
		field610 = new boolean[5];
		field593 = new int[5];
		field594 = new int[5];
		field595 = new int[5];
		field406 = new int[5];
		field479 = -1;
		field569 = -1;
		field418 = new DesktopPlatformInfoProvider();
		field603 = new class490(8, class488.field5351);
		field601 = new ArrayList();
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field604 = 0;
		field605 = new int[50];
		field606 = new int[50];
		class585.field5890 = 233;
	}

	public Client() {
		this.https = false;
		this.clientId = 0;
		this.accountHash = -1L;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "19"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field359 = class189.method4284() + 500L;
		this.resizeJS();
		if (rootInterface != -1) {
			this.method1351(true);
		}

	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("setUp")
	protected final void setUp() {
		int[] var1 = new int[]{20, 260, 10000};
		int[] var2 = new int[]{1000, 100, 500};
		if (var1 != null && var2 != null) {
			ByteArrayPool.ByteArrayPool_alternativeSizes = var1;
			FadeInTask.ByteArrayPool_altSizeArrayCounts = new int[var1.length];
			class67.ByteArrayPool_arrays = new byte[var1.length][][];

			for (int var3 = 0; var3 < ByteArrayPool.ByteArrayPool_alternativeSizes.length; ++var3) {
				class67.ByteArrayPool_arrays[var3] = new byte[var2[var3]][];
				ByteArrayPool.field5331.add(var1[var3]);
			}

			Collections.sort(ByteArrayPool.field5331);
		} else {
			ByteArrayPool.ByteArrayPool_alternativeSizes = null;
			FadeInTask.ByteArrayPool_altSizeArrayCounts = null;
			class67.ByteArrayPool_arrays = null;
			ByteArrayPool.field5331.clear();
			ByteArrayPool.field5331.add(100);
			ByteArrayPool.field5331.add(5000);
			ByteArrayPool.field5331.add(10000);
			ByteArrayPool.field5331.add(30000);
		}

		class509.field5441 = WorldEntity.method10134(worldProperties, class582.field5865);
		class431.worldPort = gameBuild == 0 ? 43594 : worldId + 40000;
		DesktopPlatformInfoProvider.js5Port = gameBuild == 0 ? 443 : worldId + 50000;
		class151.currentPort = class431.worldPort;
		class30.field149 = class367.field4125;
		PlayerComposition.field4074 = class367.field4120;
		PlayerComposition.field4075 = class367.field4119;
		PlayerComposition.field4076 = class367.field4121;
		class114.urlRequester = new SecureUrlRequester(this.https, 233);
		this.setUpKeyboard();
		this.setUpMouse();
		class146.mouseWheel = this.mouseWheel();
		this.method547(field598, 0);
		this.method547(indexCheck, 1);
		this.setUpClipboard();
		Actor.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 750000);
		AccessFile var4 = null;
		ClientPreferences var5 = new ClientPreferences();

		try {
			var4 = class33.getPreferencesFile("", class429.field5084.name, false);
			byte[] var6 = new byte[(int)var4.length()];

			int var8;
			for (int var7 = 0; var7 < var6.length; var7 += var8) {
				var8 = var4.read(var6, var7, var6.length - var7);
				if (var8 == -1) {
					throw new IOException();
				}
			}

			var5 = new ClientPreferences(new Buffer(var6));
		} catch (Exception var11) {
		}

		try {
			if (var4 != null) {
				var4.close();
			}
		} catch (Exception var10) {
		}

		class36.clientPreferences = var5;
		String var12 = GameEngine.field180;
		class31.field158 = this;
		if (var12 != null) {
			class31.field159 = var12;
		}

		ParamComposition.setWindowedMode(class36.clientPreferences.getWindowMode());
		ApproximateRouteStrategy.friendSystem = new FriendSystem(PacketWriter.loginType);
		this.asyncRestClient = new AsyncRestClient("tokenRequest", 1, 1);
		WorldMapElement.method4205(this);
		field317.method6343();
		ModelData var13 = new ModelData(3, 1, 0);
		var13.method4840(-64, -8, 64);
		var13.method4840(64, -8, 64);
		var13.method4840(0, -8, -24);
		var13.method4841(0, 2, 1, (byte)1, (byte)-1, (short)10173, (short)-1);
		WorldMapArea.field3341 = var13.toModel(1, 32, 0, -128, 0);
		FontName.field5748 = var13.toModel(64, 850, -30, -50, -30);
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-746677036"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle;
		this.doCycleJs5();

		while (true) {
			ArchiveDiskAction var1;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
				var1 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast();
			}

			if (var1 == null) {
				boolean var5 = false;
				boolean var6 = false;
				if (!class339.field3892.isEmpty()) {
					SongTask var4 = (SongTask)class339.field3892.get(0);
					if (var4 == null) {
						class339.field3892.remove(0);
					} else if (var4.vmethod9673()) {
						if (var4.method9658()) {
							System.out.println("Error in midimanager.service: " + var4.method9662());
							var5 = true;
						} else {
							if (var4.method9664() != null) {
								class339.field3892.add(1, var4.method9664());
							}

							var6 = var4.method9661();
						}

						class339.field3892.remove(0);
					} else {
						var6 = var4.method9661();
					}
				}

				if (var5) {
					class339.field3892.clear();
					FloatProjection.method5344();
				}

				if (var6 && playingJingle && class70.pcmPlayer1 != null) {
					class70.pcmPlayer1.tryDiscard();
				}

				UserComparator5.method3557();
				indexCheck.method6120();
				this.method664();
				class180.method4161();
				if (class146.mouseWheel != null) {
					int var9 = class146.mouseWheel.useRotation();
					mouseWheelRotation = var9;
				}

				if (gameState == 0) {
					FriendSystem.method1534();
					class144.method3738();
				} else if (gameState == 5) {
					class267.loginScreen(this, class342.fontPlain11, class463.fontPlain12);
					FriendSystem.method1534();
					class144.method3738();
				} else if (gameState != 10 && gameState != 11) {
					if (gameState == 20) {
						class267.loginScreen(this, class342.fontPlain11, class463.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState == 50) {
						class267.loginScreen(this, class342.fontPlain11, class463.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState == 25) {
						if (field556) {
							FadeOutTask.loadRegion();
						}

						if (field453) {
							GrandExchangeOfferUnitPriceComparator.method8537(VertexNormal.field2978);
						}

						if (!field453 && !field556) {
							UrlRequest.updateGameState(30);
						}
					}
				} else {
					class267.loginScreen(this, class342.fontPlain11, class463.fontPlain12);
				}

				if (gameState == 30) {
					this.doCycleLoggedIn();
				} else if (gameState == 40 || gameState == 45) {
					this.doCycleLoggedOut();
				}

				return;
			}

			var1.archive.load(var1.archiveDisk, (int)var1.key, var1.data, false);
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2034911949"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		NPCComposition.method4381();
		if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field359 && class189.method4284() > field359) {
			ParamComposition.setWindowedMode(MouseHandler.getWindowedMode());
		}

		int var2;
		if (var1) {
			for (var2 = 0; var2 < 100; ++var2) {
				validRootWidgets[var2] = true;
			}
		}

		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1, Script.field793);
		} else if (gameState == 5) {
			WorldEntity.drawTitle(class333.fontBold12, class342.fontPlain11, class463.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				WorldEntity.drawTitle(class333.fontBold12, class342.fontPlain11, class463.fontPlain12);
			} else if (gameState == 50) {
				WorldEntity.drawTitle(class333.fontBold12, class342.fontPlain11, class463.fontPlain12);
			} else if (gameState == 25) {
				if (field556) {
					if (field476 == 1) {
						if (field410 > field411) {
							field411 = field410;
						}

						var2 = (field411 * 50 - field410 * 50) / field411;
						class464.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
					} else if (field476 == 2) {
						if (field329 > field413) {
							field413 = field329;
						}

						var2 = (field413 * 50 - field329 * 50) / field413 + 50;
						class464.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
					} else {
						class464.drawLoadingMessage("Loading - please wait.", false);
					}
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				class464.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) {
				class464.drawLoadingMessage("Please wait...", false);
			}
		} else {
			WorldEntity.drawTitle(class333.fontBold12, class342.fontPlain11, class463.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				if (field566[var2]) {
					GameEngine.rasterProvider.draw(rootWidgetXs[var2], rootWidgetYs[var2], rootWidgetWidths[var2], rootWidgetHeights[var2]);
					field566[var2] = false;
				}
			}
		} else if (gameState > 0) {
			GameEngine.rasterProvider.drawFull(0, 0);

			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				field566[var2] = false;
			}
		}

	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1798389214"
	)
	@Export("kill0")
	protected final void kill0() {
		if (class516.varcs != null && class516.varcs.hasUnwrittenChanges()) {
			class516.varcs.write();
		}

		if (class398.mouseRecorder != null) {
			class398.mouseRecorder.isRunning = false;
		}

		class398.mouseRecorder = null;
		packetWriter.close();
		if (MouseHandler.MouseHandler_instance != null) {
			synchronized(MouseHandler.MouseHandler_instance) {
				MouseHandler.MouseHandler_instance = null;
			}
		}

		class146.mouseWheel = null;
		if (class70.pcmPlayer1 != null) {
			class70.pcmPlayer1.shutdown();
		}

		WorldMapSectionType.field3418.method8454();
		class137.method3667();
		if (class114.urlRequester != null) {
			class114.urlRequester.close();
			class114.urlRequester = null;
		}

		DevicePcmPlayerProvider.method326();
		this.asyncRestClient.shutdown();
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "6314826"
	)
	protected final void vmethod793() {
	}

	@ObfuscatedName("pb")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2146188991"
	)
	@Export("isRuneLite")
	boolean isRuneLite() {
		return this.clientId == 1;
	}

	@ObfuscatedName("pe")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1275121860"
	)
	@Export("containsAccessAndRefreshToken")
	boolean containsAccessAndRefreshToken() {
		return IndexCheck.accessToken != null && !IndexCheck.accessToken.trim().isEmpty() && MilliClock.refreshToken != null && !MilliClock.refreshToken.trim().isEmpty();
	}

	@ObfuscatedName("pl")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "987459253"
	)
	@Export("containsSessionAndCharacterId")
	boolean containsSessionAndCharacterId() {
		return WorldMapID.sessionId != null && !WorldMapID.sessionId.trim().isEmpty() && KitDefinition.characterId != null && !KitDefinition.characterId.trim().isEmpty();
	}

	@ObfuscatedName("pw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1900067826"
	)
	@Export("otlTokenRequesterInitialized")
	boolean otlTokenRequesterInitialized() {
		return this.otlTokenRequester != null;
	}

	@ObfuscatedName("py")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1032461645"
	)
	@Export("requestRefreshAccessToken")
	void requestRefreshAccessToken(String var1) throws IOException {
		HashMap var2 = new HashMap();
		var2.put("grant_type", "refresh_token");
		var2.put("scope", "gamesso.token.create");
		var2.put("refresh_token", var1);
		URL var3 = new URL(class133.authServiceBaseUrl + "shield/oauth/token" + (new HttpQueryParams(var2)).encode());
		HttpHeaders var4 = new HttpHeaders();
		if (this.isRuneLite()) {
			var4.basicAuthentication(BASIC_AUTH_DESKTOP_RUNELITE);
		} else {
			var4.basicAuthentication(BASIC_AUTH_DESKTOP_OSRS);
		}

		var4.header("Host", (new URL(class133.authServiceBaseUrl)).getHost());
		var4.accept(HttpContentType.APPLICATION_JSON);
		HttpMethod var5 = HttpMethod.POST;
		RefreshAccessTokenRequester var6 = this.refreshAccessTokenRequester;
		if (var6 != null) {
			this.refreshAccessTokenRequestFuture = var6.request(var5.getName(), var3, var4.getHeaders(), "");
		} else {
			HttpRequest var7 = new HttpRequest(var3, var5, var4, this.https);
			this.asyncAccessTokenResponse = this.asyncRestClient.submitRequest(var7);
		}
	}

	@ObfuscatedName("pn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-427787375"
	)
	@Export("requestOtlToken")
	void requestOtlToken(String var1) throws IOException {
		URL var2 = new URL(class133.authServiceBaseUrl + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
		HttpHeaders var3 = new HttpHeaders();
		var3.bearerToken(var1);
		HttpMethod var4 = HttpMethod.GET;
		OtlTokenRequester var5 = this.otlTokenRequester;
		if (var5 != null) {
			this.otlTokenRequestFuture = var5.request(var4.getName(), var2, var3.getHeaders(), "");
		} else {
			HttpRequest var6 = new HttpRequest(var2, var4, var3, this.https);
			this.asyncGameSessionTokenResponse = this.asyncRestClient.submitRequest(var6);
		}
	}

	@ObfuscatedName("px")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "-37"
	)
	@Export("authenticate")
	void authenticate(String var1, String var2) throws IOException, JSONException {
		URL var3 = new URL(class276.gameSessionServiceBaseUrl + "game-session/v1/tokens");
		HttpRequest var4 = new HttpRequest(var3, HttpMethod.POST, this.https);
		var4.getHeaders().bearerToken(var1);
		var4.getHeaders().accept(HttpContentType.APPLICATION_JSON);
		JSONObject var5 = new JSONObject();
		var5.setProperty("accountId", var2);
		var4.setPayload(new HttpJsonRequestBody(var5));
		this.asyncGameSessionTokenResponse = this.asyncRestClient.submitRequest(var4);
	}

	@ObfuscatedName("pk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2109219510"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			boolean var1 = WorldMapSectionType.field3418.method8445();
			if (!var1) {
				this.method951();
			}

		}
	}

	@ObfuscatedName("pf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "433360115"
	)
	void method951() {
		if (WorldMapSectionType.field3418.field4990 >= 4) {
			this.error("js5crc");
			UrlRequest.updateGameState(1000);
		} else {
			if (WorldMapSectionType.field3418.field4986 >= 4) {
				if (gameState <= 5) {
					this.error("js5io");
					UrlRequest.updateGameState(1000);
					return;
				}

				field526 = 3000;
				WorldMapSectionType.field3418.field4986 = 3;
			}

			if (--field526 + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						js5SocketTask = UserComparator4.taskHandler.newSocketTask(MouseHandler.worldHost, class151.currentPort);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						Socket var2 = (Socket)js5SocketTask.result;
						BufferedNetSocket var1 = new BufferedNetSocket(var2, 40000, 5000);
						class114.js5Socket = var1;
						Buffer var3 = new Buffer(class331.field3811.field3820 + 1);
						var3.writeByte(class331.field3811.field3819);
						var3.writeInt(233);
						var3.writeInt(field433[0]);
						var3.writeInt(field433[1]);
						var3.writeInt(field433[2]);
						var3.writeInt(field433[3]);
						class114.js5Socket.write(var3.array, 0, class331.field3811.field3820 + 1);
						++js5ConnectState;
						class179.field1970 = class189.method4284();
					}

					if (js5ConnectState == 3) {
						if (class114.js5Socket.available() > 0) {
							int var4 = class114.js5Socket.readUnsignedByte();
							if (var4 != 0) {
								this.js5Error(var4);
								return;
							}

							++js5ConnectState;
						} else if (class189.method4284() - class179.field1970 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						WorldMapSectionType.field3418.method8451(class114.js5Socket, gameState > 20);
						js5SocketTask = null;
						class114.js5Socket = null;
						js5ConnectState = 0;
						js5Errors = 0;
					}
				} catch (IOException var5) {
					this.js5Error(-3);
				}

			}
		}
	}

	@ObfuscatedName("pv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-987634463"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		js5SocketTask = null;
		class114.js5Socket = null;
		js5ConnectState = 0;
		if (class431.worldPort == class151.currentPort) {
			class151.currentPort = DesktopPlatformInfoProvider.js5Port;
		} else {
			class151.currentPort = class431.worldPort;
		}

		++js5Errors;
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) {
			if (gameState <= 5) {
				this.error("js5connect_full");
				UrlRequest.updateGameState(1000);
			} else {
				field526 = 3000;
			}
		} else if (js5Errors >= 2 && var1 == 6) {
			this.error("js5connect_outofdate");
			UrlRequest.updateGameState(1000);
		} else if (js5Errors >= 4) {
			if (gameState <= 5) {
				this.error("js5connect");
				UrlRequest.updateGameState(1000);
			} else {
				field526 = 3000;
			}
		}

	}

	@ObfuscatedName("ql")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "718805315"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket();
		PacketBuffer var2 = packetWriter.packetBuffer;

		try {
			if (class333.loginState == LoginState.SHUTDOWN_PREVIOUS_CONNECTION) {
				if (UrlRequest.field1561 == null && (secureRandomFuture.isDone() || field351 > 250)) {
					UrlRequest.field1561 = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (UrlRequest.field1561 != null) {
					if (var1 != null) {
						((AbstractSocket)var1).close();
						var1 = null;
					}

					AbstractArchive.field4979 = null;
					hadNetworkError = false;
					field351 = 0;
					if (field330.method11512()) {
						if (this.containsAccessAndRefreshToken()) {
							try {
								this.requestRefreshAccessToken(MilliClock.refreshToken);
								DefaultsGroup.updateLoginState(LoginState.TOKEN_RESPONSE);
							} catch (Throwable var23) {
								class508.RunException_sendStackTrace((String)null, var23);
								class211.getLoginError(65);
								return;
							}
						} else {
							if (!this.containsSessionAndCharacterId()) {
								class211.getLoginError(65);
								return;
							}

							try {
								this.authenticate(WorldMapID.sessionId, KitDefinition.characterId);
								DefaultsGroup.updateLoginState(LoginState.REFRESHING_TOKEN);
							} catch (Exception var22) {
								class508.RunException_sendStackTrace((String)null, var22);
								class211.getLoginError(65);
								return;
							}
						}
					} else {
						DefaultsGroup.updateLoginState(LoginState.INIT_MOUSEHANDLER_SOCKET);
					}
				}
			}

			HttpResponse var25;
			if (LoginState.TOKEN_RESPONSE == class333.loginState) {
				if (this.refreshAccessTokenRequestFuture != null) {
					if (!this.refreshAccessTokenRequestFuture.isDone()) {
						return;
					}

					if (this.refreshAccessTokenRequestFuture.isCancelled()) {
						class211.getLoginError(65);
						this.refreshAccessTokenRequestFuture = null;
						return;
					}

					try {
						RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.refreshAccessTokenRequestFuture.get();
						if (!var3.isSuccess()) {
							class211.getLoginError(65);
							this.refreshAccessTokenRequestFuture = null;
							return;
						}

						IndexCheck.accessToken = var3.getAccessToken();
						MilliClock.refreshToken = var3.getRefreshToken();
						this.refreshAccessTokenRequestFuture = null;
					} catch (Exception var21) {
						class508.RunException_sendStackTrace((String)null, var21);
						class211.getLoginError(65);
						this.refreshAccessTokenRequestFuture = null;
						return;
					}
				} else {
					if (this.asyncAccessTokenResponse == null) {
						class211.getLoginError(65);
						return;
					}

					if (!this.asyncAccessTokenResponse.hasFinished()) {
						return;
					}

					if (this.asyncAccessTokenResponse.hasError()) {
						class508.RunException_sendStackTrace(this.asyncAccessTokenResponse.getErrorMessage(), (Throwable)null);
						class211.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}

					var25 = this.asyncAccessTokenResponse.await();
					if (var25.getResponseCode() != 200) {
						class211.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}

					field351 = 0;
					HttpJsonRequestBody var4 = new HttpJsonRequestBody(var25.getResponseBody());

					try {
						IndexCheck.accessToken = var4.getBody().getString("access_token");
						MilliClock.refreshToken = var4.getBody().getString("refresh_token");
					} catch (Exception var20) {
						class508.RunException_sendStackTrace("Error parsing tokens", var20);
						class211.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}
				}

				this.requestOtlToken(IndexCheck.accessToken);
				DefaultsGroup.updateLoginState(LoginState.REFRESHING_TOKEN);
			}

			if (class333.loginState == LoginState.REFRESHING_TOKEN) {
				if (this.otlTokenRequestFuture != null) {
					if (!this.otlTokenRequestFuture.isDone()) {
						return;
					}

					if (this.otlTokenRequestFuture.isCancelled()) {
						class211.getLoginError(65);
						this.otlTokenRequestFuture = null;
						return;
					}

					try {
						OtlTokenResponse var26 = (OtlTokenResponse)this.otlTokenRequestFuture.get();
						if (!var26.isSuccess()) {
							class211.getLoginError(65);
							this.otlTokenRequestFuture = null;
							return;
						}

						this.token = var26.getToken();
						this.otlTokenRequestFuture = null;
					} catch (Exception var19) {
						class508.RunException_sendStackTrace((String)null, var19);
						class211.getLoginError(65);
						this.otlTokenRequestFuture = null;
						return;
					}
				} else {
					if (this.asyncGameSessionTokenResponse == null) {
						class211.getLoginError(65);
						return;
					}

					if (!this.asyncGameSessionTokenResponse.hasFinished()) {
						return;
					}

					if (this.asyncGameSessionTokenResponse.hasError()) {
						class508.RunException_sendStackTrace(this.asyncGameSessionTokenResponse.getErrorMessage(), (Throwable)null);
						class211.getLoginError(65);
						this.asyncGameSessionTokenResponse = null;
						return;
					}

					var25 = this.asyncGameSessionTokenResponse.await();
					if (var25.getResponseCode() != 200) {
						class508.RunException_sendStackTrace("Login authentication error. Response code: " + var25.getResponseCode() + " " + var25.method302() + " Response body: " + var25.getResponseBody(), (Throwable)null);
						class211.getLoginError(65);
						this.asyncGameSessionTokenResponse = null;
						return;
					}

					List var28 = (List)var25.getHeaderFields().get("Content-Type");
					if (var28 != null && var28.contains(HttpContentType.APPLICATION_JSON.getValue())) {
						try {
							JSONObject var5 = new JSONObject(var25.getResponseBody());
							this.token = var5.getString("token");
						} catch (JSONException var18) {
							class508.RunException_sendStackTrace((String)null, var18);
							class211.getLoginError(65);
							this.asyncGameSessionTokenResponse = null;
							return;
						}
					} else {
						this.token = var25.getResponseBody();
					}

					this.asyncGameSessionTokenResponse = null;
				}

				field351 = 0;
				DefaultsGroup.updateLoginState(LoginState.INIT_MOUSEHANDLER_SOCKET);
			}

			if (class333.loginState == LoginState.INIT_MOUSEHANDLER_SOCKET) {
				if (AbstractArchive.field4979 == null) {
					AbstractArchive.field4979 = UserComparator4.taskHandler.newSocketTask(MouseHandler.worldHost, class151.currentPort);
				}

				if (AbstractArchive.field4979.status == 2) {
					throw new IOException();
				}

				if (AbstractArchive.field4979.status == 1) {
					Socket var29 = (Socket)AbstractArchive.field4979.result;
					BufferedNetSocket var27 = new BufferedNetSocket(var29, 40000, 5000);
					var1 = var27;
					packetWriter.setSocket(var27);
					AbstractArchive.field4979 = null;
					DefaultsGroup.updateLoginState(LoginState.UNMAPPED_20);
				}
			}

			PacketBufferNode var31;
			if (LoginState.UNMAPPED_20 == class333.loginState) {
				packetWriter.clearBuffer();
				if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
					var31 = new PacketBufferNode();
				} else {
					var31 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
				}

				var31.clientPacket = null;
				var31.clientPacketLength = 0;
				var31.packetBuffer = new PacketBuffer(5000);
				var31.packetBuffer.writeByte(class331.field3821.field3819);
				packetWriter.addNode(var31);
				packetWriter.flush();
				var2.offset = 0;
				DefaultsGroup.updateLoginState(LoginState.READ_LOGIN_STATUS);
			}

			int var13;
			if (class333.loginState == LoginState.READ_LOGIN_STATUS) {
				if (class70.pcmPlayer1 != null) {
					class70.pcmPlayer1.method3049();
				}

				if (((AbstractSocket)var1).isAvailable(1)) {
					var13 = ((AbstractSocket)var1).readUnsignedByte();
					if (class70.pcmPlayer1 != null) {
						class70.pcmPlayer1.method3049();
					}

					if (var13 != 0) {
						class211.getLoginError(var13);
						return;
					}

					var2.offset = 0;
					DefaultsGroup.updateLoginState(LoginState.READ_RANDOM_VERIFICATION_NUMBER);
				}
			}

			if (class333.loginState == LoginState.READ_RANDOM_VERIFICATION_NUMBER) {
				if (var2.offset * 1216585693 < 8) {
					var13 = ((AbstractSocket)var1).available();
					if (var13 > 8 - var2.offset * 1216585693) {
						var13 = 8 - var2.offset * 1216585693;
					}

					if (var13 > 0) {
						((AbstractSocket)var1).read(var2.array, var2.offset * 1216585693, var13);
						var2.offset += var13 * -290410379;
					}
				}

				if (var2.offset * 1216585693 == 8) {
					var2.offset = 0;
					TextureProvider.field2846 = var2.readLong();
					DefaultsGroup.updateLoginState(LoginState.WRITE_INITIAL_LOGIN_PACKET);
				}
			}

			if (LoginState.WRITE_INITIAL_LOGIN_PACKET == class333.loginState) {
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var30 = new PacketBuffer(500);
				int[] var37 = new int[]{UrlRequest.field1561.nextInt(), UrlRequest.field1561.nextInt(), UrlRequest.field1561.nextInt(), UrlRequest.field1561.nextInt()};
				var30.offset = 0;
				var30.writeByte(1);
				var30.writeInt(var37[0]);
				var30.writeInt(var37[1]);
				var30.writeInt(var37[2]);
				var30.writeInt(var37[3]);
				var30.writeLong(TextureProvider.field2846);
				if (gameState == 40) {
					var30.writeInt(field433[0]);
					var30.writeInt(field433[1]);
					var30.writeInt(field433[2]);
					var30.writeInt(field433[3]);
				} else {
					if (gameState == 50) {
						var30.writeByte(AuthenticationScheme.field1595.rsOrdinal());
						var30.writeInt(class563.field5778);
					} else {
						var30.writeByte(authenticationScheme.rsOrdinal());
						switch(authenticationScheme.schemeId) {
						case 0:
						case 4:
							var30.writeMedium(ScriptFrame.otpMedium);
							var30.offset += -290410379;
							break;
						case 1:
							var30.writeInt(class36.clientPreferences.getParameterValue(Login.Login_username));
							break;
						case 2:
							var30.offset += -1161641516;
						case 3:
						}
					}

					if (field330.method11512()) {
						var30.writeByte(class595.field5974.rsOrdinal());
						var30.writeStringCp1252NullTerminated(this.token);
					} else {
						var30.writeByte(class595.field5970.rsOrdinal());
						var30.writeStringCp1252NullTerminated(Login.Login_password);
					}
				}

				var30.encryptRsa(class51.field725, class51.field723);
				field433 = var37;
				PacketBufferNode var6;
				if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
					var6 = new PacketBufferNode();
				} else {
					var6 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
				}

				var6.clientPacket = null;
				var6.clientPacketLength = 0;
				var6.packetBuffer = new PacketBuffer(5000);
				var6.packetBuffer.offset = 0;
				if (gameState == 40) {
					var6.packetBuffer.writeByte(class331.field3813.field3819);
				} else {
					var6.packetBuffer.writeByte(class331.field3812.field3819);
				}

				var6.packetBuffer.writeShort(0);
				int var14 = var6.packetBuffer.offset * 1216585693;
				var6.packetBuffer.writeInt(233);
				var6.packetBuffer.writeInt(1);
				if (class585.field5890 >= 232) {
					var6.packetBuffer.writeInt(class585.field5890);
				}

				var6.packetBuffer.writeByte(clientType);
				var6.packetBuffer.writeByte(field390);
				byte var8 = 0;
				var6.packetBuffer.writeByte(var8);
				var6.packetBuffer.writeBytes(var30.array, 0, var30.offset * 1216585693);
				int var9 = var6.packetBuffer.offset * 1216585693;
				var6.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var6.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var6.packetBuffer.writeShort(GameEngine.canvasWidth);
				var6.packetBuffer.writeShort(class396.canvasHeight);
				HttpRequestTask.randomDatData2(var6.packetBuffer);
				var6.packetBuffer.writeStringCp1252NullTerminated(SoundSystem.field1372);
				var6.packetBuffer.writeInt(class293.field3392);
				var6.packetBuffer.writeByte(0);
				Buffer var10 = new Buffer(AbstractWorldMapIcon.platformInfo.size());
				AbstractWorldMapIcon.platformInfo.write(var10);
				var6.packetBuffer.writeBytes(var10.array, 0, var10.array.length);
				var6.packetBuffer.writeByte(clientType);
				var6.packetBuffer.writeInt(0);
				if (class509.field5441) {
					class145.method3748(var6);
				} else {
					var6.packetBuffer.writeIntME(class27.archive10.hash);
					var6.packetBuffer.writeIntLE(class115.field1514.hash);
					var6.packetBuffer.writeIntME(class551.field5661.hash);
					var6.packetBuffer.writeIntLE(WorldMapScaleHandler.field3506.hash);
					var6.packetBuffer.writeInt(class418.field5030.hash);
					var6.packetBuffer.writeIntLE(0);
					var6.packetBuffer.writeIntME(LoginPacket.archive9.hash);
					var6.packetBuffer.writeInt(class159.field1830.hash);
					var6.packetBuffer.writeInt(GraphicsObject.archive4.hash);
					var6.packetBuffer.writeIntIME(VarpDefinition.archive2.hash);
					var6.packetBuffer.writeIntME(GrandExchangeOfferNameComparator.field5019.hash);
					var6.packetBuffer.writeIntIME(WorldMapLabelSize.field3302.hash);
					var6.packetBuffer.writeIntME(class145.archive13.hash);
					var6.packetBuffer.writeIntIME(HorizontalAlignment.field2091.hash);
					var6.packetBuffer.writeIntLE(class334.archive12.hash);
					var6.packetBuffer.writeIntLE(class259.archive6.hash);
					var6.packetBuffer.writeIntLE(MouseRecorder.field913.hash);
					var6.packetBuffer.writeIntME(class273.field3204.hash);
					var6.packetBuffer.writeIntLE(PlayerCompositionColorTextureOverride.field1956.hash);
					var6.packetBuffer.writeIntLE(Friend.archive8.hash);
					var6.packetBuffer.writeIntLE(class485.field5345.hash);
					var6.packetBuffer.writeInt(ApproximateRouteStrategy.field280.hash);
					var6.packetBuffer.writeIntIME(WidgetDefinition.field4042.hash);
				}

				var6.packetBuffer.xteaEncrypt(var37, var9, var6.packetBuffer.offset * 1216585693);
				var6.packetBuffer.writeLengthShort(var6.packetBuffer.offset * 1216585693 - var14);
				packetWriter.addNode(var6);
				packetWriter.flush();
				packetWriter.isaacCipher = new IsaacCipher(var37);
				int[] var11 = new int[4];

				for (int var12 = 0; var12 < 4; ++var12) {
					var11[var12] = var37[var12] + 50;
				}

				var2.newIsaacCipher(var11);
				DefaultsGroup.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			int var15;
			if (class333.loginState == LoginState.READ_CLIENT_INFO_STATUS && ((AbstractSocket)var1).available() > 0) {
				var13 = ((AbstractSocket)var1).readUnsignedByte();
				if (var13 == 61) {
					var15 = ((AbstractSocket)var1).available();
					class563.field5781 = var15 == 1 && ((AbstractSocket)var1).readUnsignedByte() == 1;
					DefaultsGroup.updateLoginState(LoginState.WRITE_INITIAL_LOGIN_PACKET);
				}

				if (var13 == 21 && gameState == 20) {
					DefaultsGroup.updateLoginState(LoginState.READ_PROFILE_TRANSFER_TIME);
				} else if (var13 == 2) {
					if (class509.field5441) {
						DefaultsGroup.updateLoginState(LoginState.UNMAPPED_21);
					} else {
						DefaultsGroup.updateLoginState(LoginState.UNMAPPED);
					}
				} else if (var13 == 15 && gameState == 40) {
					packetWriter.serverPacketLength = -1;
					DefaultsGroup.updateLoginState(LoginState.UNMAPPED_19);
				} else if (var13 == 64) {
					DefaultsGroup.updateLoginState(LoginState.READ_STATE_11_PACKET_SIZE);
				} else if (var13 == 23 && field448 < 1) {
					++field448;
					DefaultsGroup.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				} else if (var13 == 29) {
					DefaultsGroup.updateLoginState(LoginState.UNMAPPED_17);
				} else {
					if (var13 != 69) {
						class211.getLoginError(var13);
						return;
					}

					DefaultsGroup.updateLoginState(LoginState.READ_DIGEST_PARSER_PACKET_SIZE);
				}
			}

			if (class333.loginState == LoginState.UNMAPPED_21) {
				Script.field793 = true;
				class68.method2161(class70.field962);
				UrlRequest.updateGameState(0);
			}

			if (LoginState.READ_DIGEST_PARSER_PACKET_SIZE == class333.loginState && ((AbstractSocket)var1).available() >= 2) {
				((AbstractSocket)var1).read(var2.array, 0, 2);
				var2.offset = 0;
				Frames.field2812 = var2.readUnsignedShort();
				DefaultsGroup.updateLoginState(LoginState.SUBMIT_DIGEST_PARSER_TASK);
			}

			if (LoginState.SUBMIT_DIGEST_PARSER_TASK == class333.loginState && ((AbstractSocket)var1).available() >= Frames.field2812) {
				var2.offset = 0;
				((AbstractSocket)var1).read(var2.array, var2.offset * 1216585693, Frames.field2812);
				class6[] var32 = new class6[]{class6.field14};
				class6 var39 = var32[var2.readUnsignedByte()];

				try {
					switch(var39.field15) {
					case 0:
						class0 var33 = new class0();
						this.field618 = new SpriteBufferProperties(var2, var33);
						DefaultsGroup.updateLoginState(LoginState.WRITE_DIGEST_PARSER_RESULT);
						break;
					default:
						throw new IllegalArgumentException();
					}
				} catch (Exception var17) {
					class211.getLoginError(22);
					return;
				}
			}

			if (class333.loginState == LoginState.WRITE_DIGEST_PARSER_RESULT && this.field618.method43()) {
				this.field617 = this.field618.method54();
				this.field618.method52();
				this.field618 = null;
				if (this.field617 == null) {
					class211.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
					var31 = new PacketBufferNode();
				} else {
					var31 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
				}

				var31.clientPacket = null;
				var31.clientPacketLength = 0;
				var31.packetBuffer = new PacketBuffer(5000);
				var31.packetBuffer.writeByte(class331.field3814.field3819);
				var31.packetBuffer.writeShort(this.field617.offset * 1216585693);
				var31.packetBuffer.writeBuffer(this.field617);
				packetWriter.addNode(var31);
				packetWriter.flush();
				this.field617 = null;
				DefaultsGroup.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			if (class333.loginState == LoginState.READ_STATE_11_PACKET_SIZE && ((AbstractSocket)var1).available() > 0) {
				class108.field1425 = ((AbstractSocket)var1).readUnsignedByte();
				DefaultsGroup.updateLoginState(LoginState.UNMAPPED_11);
			}

			if (LoginState.UNMAPPED_11 == class333.loginState && ((AbstractSocket)var1).available() >= class108.field1425) {
				((AbstractSocket)var1).read(var2.array, 0, class108.field1425);
				var2.offset = 0;
				DefaultsGroup.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			if (class333.loginState == LoginState.READ_PROFILE_TRANSFER_TIME && ((AbstractSocket)var1).available() > 0) {
				field464 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60;
				DefaultsGroup.updateLoginState(LoginState.PROFILE_TRANSFER);
			}

			if (class333.loginState == LoginState.PROFILE_TRANSFER) {
				field351 = 0;
				MouseRecorder.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field464 / 60 + " seconds.");
				if (--field464 <= 0) {
					DefaultsGroup.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				}

			} else if (class333.loginState == LoginState.READ_ACCOUNT_INFO_PACKET_SIZE) {
				if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
					var31 = new PacketBufferNode();
				} else {
					var31 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
				}

				var31.clientPacket = null;
				var31.clientPacketLength = 0;
				var31.packetBuffer = new PacketBuffer(5000);
				var31.packetBuffer.writeByte(class331.field3817.field3819);
				var31.packetBuffer.writeShort(class331.field3817.field3820);
				var31.packetBuffer.writeInt(VarpDefinition.archive2.hash);
				var31.packetBuffer.writeInt(WorldMapLabelSize.field3302.hash);
				var31.packetBuffer.writeIntLE(ApproximateRouteStrategy.field280.hash);
				var31.packetBuffer.writeIntME(PlayerCompositionColorTextureOverride.field1956.hash);
				var31.packetBuffer.writeIntLE(GrandExchangeOfferNameComparator.field5019.hash);
				var31.packetBuffer.writeIntME(class273.field3204.hash);
				var31.packetBuffer.writeIntIME(class418.field5030.hash);
				var31.packetBuffer.writeIntME(LoginPacket.archive9.hash);
				var31.packetBuffer.writeInt(class334.archive12.hash);
				var31.packetBuffer.writeIntLE(MouseRecorder.field913.hash);
				var31.packetBuffer.writeIntLE(class485.field5345.hash);
				var31.packetBuffer.writeIntLE(class259.archive6.hash);
				var31.packetBuffer.writeIntIME(WorldMapScaleHandler.field3506.hash);
				var31.packetBuffer.writeIntME(class551.field5661.hash);
				var31.packetBuffer.writeInt(GraphicsObject.archive4.hash);
				var31.packetBuffer.writeIntIME(0);
				packetWriter.addNode(var31);
				packetWriter.flush();
				DefaultsGroup.updateLoginState(LoginState.UNMAPPED);
			} else {
				if (class333.loginState == LoginState.UNMAPPED && ((AbstractSocket)var1).available() >= 1) {
					class67.field918 = ((AbstractSocket)var1).readUnsignedByte();
					if (class67.field918 != class331.field3816.field3820) {
						class211.getLoginError(class67.field918);
						return;
					}

					DefaultsGroup.updateLoginState(LoginState.READ_ACCOUNT_INFO);
				}

				if (class333.loginState == LoginState.READ_ACCOUNT_INFO && ((AbstractSocket)var1).available() >= class67.field918) {
					boolean var41 = ((AbstractSocket)var1).readUnsignedByte() == 1;
					((AbstractSocket)var1).read(var2.array, 0, 4);
					var2.offset = 0;
					boolean var42 = false;
					if (var41) {
						var15 = var2.readByteIsaac() << 24;
						var15 |= var2.readByteIsaac() << 16;
						var15 |= var2.readByteIsaac() << 8;
						var15 |= var2.readByteIsaac();
						class36.clientPreferences.put(Login.Login_username, var15);
					}

					if (Login_isUsernameRemembered) {
						class36.clientPreferences.updateRememberedUsername(Login.Login_username);
					} else {
						class36.clientPreferences.updateRememberedUsername((String)null);
					}

					ArchiveLoader.savePreferences();
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte();
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1;
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte();
					field344 = ((AbstractSocket)var1).readUnsignedByte();
					((AbstractSocket)var1).read(var2.array, 0, 8);
					var2.offset = 0;
					this.accountHash = var2.readLong();
					((AbstractSocket)var1).read(var2.array, 0, 8);
					var2.offset = 0;
					userId = var2.readLong();
					((AbstractSocket)var1).read(var2.array, 0, 8);
					var2.offset = 0;
					userHash = var2.readLong();
					class259.method5905().method5984(this.https);
					DefaultsGroup.updateLoginState(LoginState.SET_SERVER_PROTOCOL);
				}

				if (class333.loginState == LoginState.SET_SERVER_PROTOCOL && ((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
					((AbstractSocket)var1).read(var2.array, 0, 1);
					var2.offset = 0;
					if (var2.method11142()) {
						((AbstractSocket)var1).read(var2.array, 1, 1);
						var2.offset = 0;
					}

					ServerPacket[] var34 = class174.ServerPacket_values();
					var15 = var2.readSmartByteShortIsaac();
					if (var15 < 0 || var15 >= var34.length) {
						throw new IOException("Invalid ServerProt: " + var15 + " at " + var2.offset * 1216585693);
					}

					packetWriter.serverPacket = var34[var15];
					packetWriter.serverPacketLength = packetWriter.serverPacket.length;
					((AbstractSocket)var1).read(var2.array, 0, 2);
					var2.offset = 0;
					packetWriter.serverPacketLength = var2.readUnsignedShort();

					try {
						Client var35 = class521.client;
						JSObject.getWindow(var35).call("zap", (Object[])null);
					} catch (Throwable var16) {
					}

					DefaultsGroup.updateLoginState(LoginState.UPDATE_PLAYER_AND_LOAD_REGIONS);
				}

				if (class333.loginState == LoginState.UPDATE_PLAYER_AND_LOAD_REGIONS) {
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
						timer.method8250();
						PlayerComposition.method7601();
						playerUpdateManager.updatePlayer(var2);
						WorldMapIcon_0.method6747();
						class269.field3187 = -1;
						UserComparator7.loadRegions(false, var2);
						packetWriter.serverPacket = null;
						field454 = false;
					}

				} else {
					if (LoginState.UNMAPPED_17 == class333.loginState && ((AbstractSocket)var1).available() >= 2) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, 2);
						var2.offset = 0;
						AuthenticationScheme.field1601 = var2.readUnsignedShort();
						DefaultsGroup.updateLoginState(LoginState.UNMAPPED_18);
					}

					if (class333.loginState == LoginState.UNMAPPED_18 && ((AbstractSocket)var1).available() >= AuthenticationScheme.field1601) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, AuthenticationScheme.field1601);
						var2.offset = 0;
						String var36 = var2.readStringCp1252NullTerminated();
						String var40 = var2.readStringCp1252NullTerminated();
						String var38 = var2.readStringCp1252NullTerminated();
						MouseRecorder.setLoginResponseString(var36, var40, var38);
						UrlRequest.updateGameState(10);
						if (field330.method11512()) {
							ClientPreferences.method2677(9);
						}
					}

					if (LoginState.UNMAPPED_19 == class333.loginState) {
						if (packetWriter.serverPacketLength == -1) {
							if (((AbstractSocket)var1).available() < 2) {
								return;
							}

							((AbstractSocket)var1).read(var2.array, 0, 2);
							var2.offset = 0;
							packetWriter.serverPacketLength = var2.readUnsignedShort();
						}

						if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
							((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
							var2.offset = 0;
							var13 = packetWriter.serverPacketLength;
							timer.method8252();
							AbstractWorldMapData.method6784();
							playerUpdateManager.updatePlayer(var2);
							if (var13 != var2.offset * 1216585693) {
								throw new RuntimeException();
							}
						}
					} else {
						++field351;
						if (field351 > 2000) {
							if (field448 < 1) {
								if (class431.worldPort == class151.currentPort) {
									class151.currentPort = DesktopPlatformInfoProvider.js5Port;
								} else {
									class151.currentPort = class431.worldPort;
								}

								++field448;
								DefaultsGroup.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
							} else {
								class211.getLoginError(-3);
							}
						}
					}
				}
			}
		} catch (IOException var24) {
			if (field448 < 1) {
				if (class431.worldPort == class151.currentPort) {
					class151.currentPort = DesktopPlatformInfoProvider.js5Port;
				} else {
					class151.currentPort = class431.worldPort;
				}

				++field448;
				DefaultsGroup.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
			} else {
				class211.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("qb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-716844505"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) {
			--rebootTimer;
		}

		if (logoutTimer > 0) {
			--logoutTimer;
		}

		if (hadNetworkError) {
			hadNetworkError = false;
			class361.method7512();
		} else {
			if (!isMenuOpen) {
				AsyncRestClient.addCancelMenuEntry();
			}

			this.method1381();
			if (gameState == 30) {
				while (true) {
					ReflectionCheck var2 = (ReflectionCheck)class36.reflectionChecks.last();
					boolean var1;
					if (var2 == null) {
						var1 = false;
					} else {
						var1 = true;
					}

					int var3;
					PacketBufferNode var46;
					if (!var1) {
						PacketBufferNode var27;
						if (timer.field4865) {
							var27 = UserComparator6.getPacketBufferNode(ClientPacket.LOGIN_TIMINGS, packetWriter.isaacCipher);
							var27.packetBuffer.writeByte(0);
							int var28 = var27.packetBuffer.offset * 1216585693;
							timer.write(var27.packetBuffer);
							var27.packetBuffer.writeLengthByte(var27.packetBuffer.offset * 1216585693 - var28);
							packetWriter.addNode(var27);
							timer.method8253();
						}

						int var4;
						int var5;
						int var6;
						int var7;
						int var8;
						int var9;
						int var10;
						int var11;
						int var12;
						PacketBuffer var10000;
						synchronized(class398.mouseRecorder.lock) {
							if (!field427) {
								class398.mouseRecorder.index = 0;
							} else if (MouseHandler.MouseHandler_lastButton != 0 || class398.mouseRecorder.index >= 40) {
								var46 = null;
								var3 = 0;
								var4 = 0;
								var5 = 0;
								var6 = 0;

								for (var7 = 0; var7 < class398.mouseRecorder.index && (var46 == null || var46.packetBuffer.offset * 1216585693 - var3 < 246); ++var7) {
									var4 = var7;
									var8 = class398.mouseRecorder.ys[var7];
									if (var8 < -1) {
										var8 = -1;
									} else if (var8 > 65534) {
										var8 = 65534;
									}

									var9 = class398.mouseRecorder.xs[var7];
									if (var9 < -1) {
										var9 = -1;
									} else if (var9 > 65534) {
										var9 = 65534;
									}

									if (var9 != field386 || var8 != field396) {
										if (var46 == null) {
											var46 = UserComparator6.getPacketBufferNode(ClientPacket.MOUSE_MOVE, packetWriter.isaacCipher);
											var46.packetBuffer.writeByte(0);
											var3 = var46.packetBuffer.offset * 1216585693;
											var10000 = var46.packetBuffer;
											var10000.offset += -580820758;
											var5 = 0;
											var6 = 0;
										}

										if (-1L != field397) {
											var10 = var9 - field386;
											var11 = var8 - field396;
											var12 = (int)((class398.mouseRecorder.millis[var7] - field397) / 20L);
											var5 = (int)((long)var5 + (class398.mouseRecorder.millis[var7] - field397) % 20L);
										} else {
											var10 = var9;
											var11 = var8;
											var12 = Integer.MAX_VALUE;
										}

										field386 = var9;
										field396 = var8;
										if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
											var10 += 32;
											var11 += 32;
											var46.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6));
										} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
											var10 += 128;
											var11 += 128;
											var46.packetBuffer.writeByte(var12 + 128);
											var46.packetBuffer.writeShort(var11 + (var10 << 8));
										} else if (var12 < 32) {
											var46.packetBuffer.writeByte(var12 + 192);
											if (var9 != -1 && var8 != -1) {
												var46.packetBuffer.writeInt(var9 | var8 << 16);
											} else {
												var46.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										} else {
											var46.packetBuffer.writeShort((var12 & 8191) + 57344);
											if (var9 != -1 && var8 != -1) {
												var46.packetBuffer.writeInt(var9 | var8 << 16);
											} else {
												var46.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										}

										++var6;
										field397 = class398.mouseRecorder.millis[var7];
									}
								}

								if (var46 != null) {
									var46.packetBuffer.writeLengthByte(var46.packetBuffer.offset * 1216585693 - var3);
									var7 = var46.packetBuffer.offset * 1216585693;
									var46.packetBuffer.offset = var3 * -290410379;
									var46.packetBuffer.writeByte(var5 / var6);
									var46.packetBuffer.writeByte(var5 % var6);
									var46.packetBuffer.offset = var7 * -290410379;
									packetWriter.addNode(var46);
								}

								if (var4 >= class398.mouseRecorder.index) {
									class398.mouseRecorder.index = 0;
								} else {
									MouseRecorder var73 = class398.mouseRecorder;
									var73.index -= var4;
									System.arraycopy(class398.mouseRecorder.xs, var4, class398.mouseRecorder.xs, 0, class398.mouseRecorder.index);
									System.arraycopy(class398.mouseRecorder.ys, var4, class398.mouseRecorder.ys, 0, class398.mouseRecorder.index);
									System.arraycopy(class398.mouseRecorder.millis, var4, class398.mouseRecorder.millis, 0, class398.mouseRecorder.index);
								}
							}
						}

						this.method832();
						if (mouseWheelRotation != 0) {
							var27 = UserComparator6.getPacketBufferNode(ClientPacket.MOUSE_WHEEL, packetWriter.isaacCipher);
							var27.packetBuffer.writeShort(mouseWheelRotation);
							packetWriter.addNode(var27);
						}

						var1 = GameEngine.keyHandler.method375();
						if (var1) {
							var46 = UserComparator6.getPacketBufferNode(ClientPacket.EVENT_KEYBOARD, packetWriter.isaacCipher);
							var46.packetBuffer.writeShort(0);
							var3 = var46.packetBuffer.offset * 1216585693;
							long var29 = class189.method4284();

							for (var6 = 0; var6 < indexCheck.field3206; ++var6) {
								long var31 = var29 - field466;
								if (var31 > 16777215L) {
									var31 = 16777215L;
								}

								field466 = var29;
								var46.packetBuffer.method1276((int)var31);
								var46.packetBuffer.writeByteSub(indexCheck.field3207[var6]);
							}

							var46.packetBuffer.writeLengthShort(var46.packetBuffer.offset * 1216585693 - var3);
							packetWriter.addNode(var46);
						}

						if (field488 > 0) {
							--field488;
						}

						if (indexCheck.isValidIndexInRange(96) || indexCheck.isValidIndexInRange(97) || indexCheck.isValidIndexInRange(98) || indexCheck.isValidIndexInRange(99)) {
							field489 = true;
						}

						if (field489 && field488 <= 0) {
							field488 = 20;
							field489 = false;
							var46 = UserComparator6.getPacketBufferNode(ClientPacket.EVENT_CAMERA_POSITION, packetWriter.isaacCipher);
							var46.packetBuffer.writeShortLE(camAngleY);
							var46.packetBuffer.writeShort(camAngleX);
							packetWriter.addNode(var46);
						}

						if (GameEngine.hasFocus && !hadFocus) {
							hadFocus = true;
							var46 = UserComparator6.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
							var46.packetBuffer.writeByte(1);
							packetWriter.addNode(var46);
						}

						if (!GameEngine.hasFocus && hadFocus) {
							hadFocus = false;
							var46 = UserComparator6.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
							var46.packetBuffer.writeByte(0);
							packetWriter.addNode(var46);
						}

						if (DynamicObject.worldMap != null) {
							DynamicObject.worldMap.method10639();
						}

						if (class159.ClanChat_inClanChat) {
							if (DevicePcmPlayerProvider.friendsChat != null) {
								DevicePcmPlayerProvider.friendsChat.sort();
							}

							ClientPacket.method7036();
							class159.ClanChat_inClanChat = false;
						}

						class63.method2123();
						if (field576 != class333.topLevelWorldView.plane) {
							field576 = class333.topLevelWorldView.plane;
							TileItem.method2823(class333.topLevelWorldView.plane);
						}

						if (gameState != 30) {
							return;
						}

						class150.method3816();

						int var14;
						int var10002;
						int var35;
						for (int var47 = 0; var47 < class58.soundEffectCount; ++var47) {
							var10002 = class58.queuedSoundEffectDelays[var47]--;
							if (class58.queuedSoundEffectDelays[var47] < -10) {
								VarcInt.method4216(var47);
								--var47;
							} else {
								SoundEffect var48 = class58.soundEffects[var47];
								if (var48 == null) {
									var3 = class115.field1514.getGroupFileCount(class58.field834[var47]) - 1;
									var10000 = null;
									var48 = SoundEffect.readSoundEffect(class115.field1514, class58.field834[var47], var3);
									if (var48 == null) {
										continue;
									}

									int[] var74 = class58.queuedSoundEffectDelays;
									var74[var47] += var48.calculateDelay();
									class58.soundEffects[var47] = var48;
								}

								if (class58.queuedSoundEffectDelays[var47] < 0) {
									if (class58.soundLocations[var47] != 0) {
										var4 = Coord.method7417(class58.soundLocations[var47] & 255);
										var5 = class58.soundLocations[var47] >> 16 & 255;
										var6 = class58.soundLocations[var47] >> 8 & 255;
										var7 = class58.soundEffectIds[var47];
										WorldView var33 = worldViewManager.getWorldView(var7);
										class452 var34 = DynamicObject.method2010(var33, Coord.method7417(var5), Coord.method7417(var6));
										var11 = (int)var34.field5175;
										var10 = var11 >> 7;
										var14 = (int)var34.field5169;
										var35 = var14 >> 7;
										var34.method8992();
										class452 var16 = worldViewManager.method2361();
										int var17 = Math.abs(Coord.method7416(var10) - (int)var16.field5175);
										int var18 = Math.abs(Coord.method7416(var35) - (int)var16.field5169);
										var16.method8992();
										int var19 = Math.max(var17 + var18 - 128, 0);
										int var20 = Math.max(Coord.method7417((class58.field829[var47] & 31) - 1), 0);
										WorldEntity var21 = worldViewManager.method2347();
										WorldEntity var22 = worldViewManager.method2346(var7);
										boolean var23 = class58.field835[var47];
										boolean var24;
										if (var22 == var21) {
											var24 = true;
										} else if (var22 == null) {
											var24 = true;
										} else if (var21 == null) {
											var24 = false;
										} else {
											var24 = var23;
										}

										if (var19 >= var4 || !var24) {
											class58.queuedSoundEffectDelays[var47] = -100;
											continue;
										}

										float var26 = var20 < var4 ? Math.min(Math.max((float)(var4 - var19) / (float)(var4 - var20), 0.0F), 1.0F) : 1.0F;
										var3 = (int)(var26 * (float)class36.clientPreferences.getAreaSoundEffectsVolume());
									} else {
										var3 = class36.clientPreferences.getSoundEffectsVolume();
									}

									if (var3 > 0) {
										RawSound var36 = var48.method3013(class36.clientPreferences.method2586());
										RawPcmStream var37 = RawPcmStream.createRawPcmStream(var36, 100, var3);
										if (var37 != null) {
											var37.setNumLoops(class58.queuedSoundEffectLoops[var47] - 1);
											class28.pcmStreamMixer.addSubStream(var37);
										}
									}

									class58.queuedSoundEffectDelays[var47] = -100;
								}
							}
						}

						if (playingJingle && !Tile.method4924()) {
							if (class36.clientPreferences.getMusicVolume() != 0) {
								var1 = !class339.field3889.isEmpty();
								if (var1) {
									class166.method4028(WidgetDefinition.field4042, class36.clientPreferences.getMusicVolume());
								}
							}

							playingJingle = false;
						}

						++packetWriter.field1297;
						if (packetWriter.field1297 > 750) {
							class361.method7512();
							return;
						}

						class453.method9084();
						Iterator var56 = worldViewManager.iterator();

						WorldView var52;
						while (var56.hasNext()) {
							var52 = (WorldView)var56.next();
							Iterator var38 = var52.npcs.iterator();

							while (var38.hasNext()) {
								NPC var58 = (NPC)var38.next();
								if (var58 != null) {
									WorldMapID.updateActorSequence(var52, var58, var58.definition.size);
								}
							}
						}

						var56 = worldViewManager.iterator();

						while (var56.hasNext()) {
							var52 = (WorldView)var56.next();

							for (var3 = 0; var3 < var52.field1176.method9790(); ++var3) {
								var4 = var52.field1176.method9787(var3);
								WorldEntity var61 = (WorldEntity)var52.worldEntities.get((long)var4);
								if (var61 != null) {
									var61.method10083(cycle);
								}
							}
						}

						UrlRequester.method3491();
						++graphicsCycle;
						if (mouseCrossColor != 0) {
							mouseCrossState = mouseCrossState * 400 + 20;
							if (mouseCrossState * 400 >= 400) {
								mouseCrossColor = 0;
							}
						}

						if (field584 > 0) {
							--field584;
						}

						Widget var57 = class343.mousedOverWidgetIf1;
						Widget var53 = class134.field1624;
						class343.mousedOverWidgetIf1 = null;
						class134.field1624 = null;
						draggedOnWidget = null;
						field543 = false;
						field540 = false;
						field442 = 0;

						Iterator var62;
						while (indexCheck.method6121() && field442 < 128) {
							if (staffModLevel >= 2 && indexCheck.isValidIndexInRange(82) && indexCheck.field3212 == 66) {
								StringBuilder var59 = new StringBuilder();

								Message var39;
								for (var62 = Messages.Messages_hashTable.iterator(); var62.hasNext(); var59.append(var39.text).append('\n')) {
									var39 = (Message)var62.next();
									if (var39.sender != null && !var39.sender.isEmpty()) {
										var59.append(var39.sender).append(':');
									}
								}

								String var64 = var59.toString();
								class521.client.method559(var64);
							} else if (oculusOrbState != 1 || indexCheck.field3215 <= 0) {
								field511[field442] = indexCheck.field3212;
								field443[field442] = indexCheck.field3215;
								++field442;
							}
						}

						boolean var49 = staffModLevel >= 2;
						if (var49 && indexCheck.isValidIndexInRange(82) && indexCheck.isValidIndexInRange(81) && mouseWheelRotation != 0) {
							var4 = HealthBarUpdate.localPlayer.plane - mouseWheelRotation;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > 3) {
								var4 = 3;
							}

							if (var4 != HealthBarUpdate.localPlayer.plane) {
								WorldMapSectionType.method6782(HealthBarUpdate.localPlayer.pathX[0] + class333.topLevelWorldView.baseX, HealthBarUpdate.localPlayer.pathY[0] + class333.topLevelWorldView.baseY, var4, false);
							}

							mouseWheelRotation = 0;
						}

						if (rootInterface != -1) {
							WorldMapLabelSize.updateRootInterface(rootInterface, 0, 0, GameEngine.canvasWidth, class396.canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							ScriptEvent var60;
							Widget var63;
							Widget var66;
							do {
								var60 = (ScriptEvent)scriptEvents2.removeLast();
								if (var60 == null) {
									while (true) {
										do {
											var60 = (ScriptEvent)scriptEvents3.removeLast();
											if (var60 == null) {
												while (true) {
													do {
														var60 = (ScriptEvent)scriptEvents.removeLast();
														if (var60 == null) {
															boolean var50 = false;

															while (true) {
																class273 var65 = (class273)field437.removeLast();
																if (var65 == null) {
																	if (!var50 && MouseHandler.MouseHandler_lastButton == 1) {
																		field598.method6085();
																	}

																	this.menu();
																	Strings.method8221();
																	if (clickedWidget != null) {
																		this.method907();
																	}

																	var62 = worldViewManager.iterator();

																	while (var62.hasNext()) {
																		WorldView var68 = (WorldView)var62.next();
																		Scene var40 = var68.scene;
																		if (var40.shouldSendWalk()) {
																			var8 = var40.baseX;
																			var9 = var40.baseY;
																			PacketBufferNode var41 = UserComparator6.getPacketBufferNode(ClientPacket.MOVE_GAMECLICK, packetWriter.isaacCipher);
																			var41.packetBuffer.writeByte(5);
																			var41.packetBuffer.writeByte(indexCheck.isValidIndexInRange(82) ? (indexCheck.isValidIndexInRange(81) ? 2 : 1) : 0);
																			var41.packetBuffer.writeShortAdd(var8 + var68.baseX);
																			var41.packetBuffer.writeShortAdd(var9 + var68.baseY);
																			packetWriter.addNode(var41);
																			mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																			mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																			mouseCrossColor = 1;
																			mouseCrossState = 0;
																			destinationX = var8;
																			destinationY = var9;
																			var40.method5162();
																		}
																	}

																	if (var57 != class343.mousedOverWidgetIf1) {
																		if (var57 != null) {
																			class89.invalidateWidget(var57);
																		}

																		if (class343.mousedOverWidgetIf1 != null) {
																			class89.invalidateWidget(class343.mousedOverWidgetIf1);
																		}
																	}

																	if (var53 != class134.field1624 && field426 == field481) {
																		if (var53 != null) {
																			class89.invalidateWidget(var53);
																		}

																		if (class134.field1624 != null) {
																			class89.invalidateWidget(class134.field1624);
																		}
																	}

																	if (class134.field1624 != null) {
																		if (field481 < field426) {
																			++field481;
																			if (field481 == field426) {
																				class89.invalidateWidget(class134.field1624);
																			}
																		}
																	} else if (field481 > 0) {
																		--field481;
																	}

																	if (oculusOrbState == 0) {
																		WorldView var67 = worldViewManager.getWorldView(field347);
																		if (var67 == null) {
																			var67 = class333.topLevelWorldView;
																		}

																		Object var70 = null;
																		switch(class4.field7.field4399) {
																		case 0:
																			var70 = (Entity)var67.players.get((long)field348);
																			break;
																		case 1:
																			var70 = (Entity)var67.npcs.get((long)field348);
																			break;
																		case 2:
																			var70 = (Entity)var67.worldEntities.get((long)field348);
																		}

																		if (var70 == null) {
																			var70 = HealthBarUpdate.localPlayer;
																		}

																		field552 = ((Entity)var70).getY();
																		field337 = ((Entity)var70).getPlane();
																		if (var67 != class333.topLevelWorldView) {
																			class452 var69 = DynamicObject.method2010(var67, ((Entity)var70).getY(), ((Entity)var70).getPlane());
																			field552 = (int)var69.field5175;
																			field337 = (int)var69.field5169;
																			var69.method8992();
																		}

																		var7 = ((Entity)var70).getX();
																		if (class172.oculusOrbFocalPointX - field552 >= -500 && class172.oculusOrbFocalPointX - field552 <= 500 && BuddyRankComparator.oculusOrbFocalPointY - field337 >= -500 && BuddyRankComparator.oculusOrbFocalPointY - field337 <= 500) {
																			if (class172.oculusOrbFocalPointX != field552) {
																				class172.oculusOrbFocalPointX += (field552 - class172.oculusOrbFocalPointX) / 16;
																			}

																			if (field337 != BuddyRankComparator.oculusOrbFocalPointY) {
																				BuddyRankComparator.oculusOrbFocalPointY += (field337 - BuddyRankComparator.oculusOrbFocalPointY) / 16;
																			}
																		} else {
																			class172.oculusOrbFocalPointX = field552;
																			BuddyRankComparator.oculusOrbFocalPointY = field337;
																		}

																		var8 = class172.oculusOrbFocalPointX >> 7;
																		var9 = BuddyRankComparator.oculusOrbFocalPointY >> 7;
																		var10 = JagNetThread.getTileHeight(class333.topLevelWorldView, class172.oculusOrbFocalPointX, BuddyRankComparator.oculusOrbFocalPointY, var7);
																		var11 = 0;
																		int var15;
																		if (var8 > 3 && var9 > 3 && var8 < 100 && var9 < 100) {
																			for (var12 = var8 - 4; var12 <= var8 + 4; ++var12) {
																				for (var35 = var9 - 4; var35 <= var9 + 4; ++var35) {
																					var14 = var7;
																					if (var7 < 3 && (class333.topLevelWorldView.tileSettings[1][var12][var35] & 2) == 2) {
																						var14 = var7 + 1;
																					}

																					var15 = var10 - class333.topLevelWorldView.tileHeights[var14][var12][var35];
																					if (var15 > var11) {
																						var11 = var15;
																					}
																				}
																			}
																		}

																		var12 = var11 * 192;
																		if (var12 > 98048) {
																			var12 = 98048;
																		}

																		if (var12 < 32768) {
																			var12 = 32768;
																		}

																		if (var12 > field416) {
																			field416 += (var12 - field416) / 24;
																		} else if (var12 < field416) {
																			field416 += (var12 - field416) / 80;
																		}

																		var14 = ((Entity)var70).getY();
																		var15 = ((Entity)var70).getPlane();
																		int var42 = JagNetThread.getTileHeight(var67, var14, var15, var7);
																		WorldEntity var43 = (WorldEntity)class333.topLevelWorldView.worldEntities.get((long)var67.id);
																		if (var43 != null) {
																			var42 += JagNetThread.getTileHeight(class333.topLevelWorldView, var43.getY(), var43.getPlane(), var43.getX());
																		}

																		field512 = var42;
																		class191.oculusOrbFocalPointZ = field512 - camFollowHeight;
																	} else if (oculusOrbState == 1) {
																		class67.method2155();
																		short var51 = -1;
																		if (indexCheck.isValidIndexInRange(33)) {
																			var51 = 0;
																		} else if (indexCheck.isValidIndexInRange(49)) {
																			var51 = 1024;
																		}

																		if (indexCheck.isValidIndexInRange(48)) {
																			if (var51 == 0) {
																				var51 = 1792;
																			} else if (var51 == 1024) {
																				var51 = 1280;
																			} else {
																				var51 = 1536;
																			}
																		} else if (indexCheck.isValidIndexInRange(50)) {
																			if (var51 == 0) {
																				var51 = 256;
																			} else if (var51 == 1024) {
																				var51 = 768;
																			} else {
																				var51 = 512;
																			}
																		}

																		byte var54 = 0;
																		if (indexCheck.isValidIndexInRange(35)) {
																			var54 = -1;
																		} else if (indexCheck.isValidIndexInRange(51)) {
																			var54 = 1;
																		}

																		var7 = 0;
																		if (var51 >= 0 || var54 != 0) {
																			var7 = indexCheck.isValidIndexInRange(81) ? oculusOrbSlowedSpeed : oculusOrbNormalSpeed;
																			var7 *= 16;
																			field414 = var51;
																			field548 = var54;
																		}

																		if (field599 < var7) {
																			field599 += var7 / 8;
																			if (field599 > var7) {
																				field599 = var7;
																			}
																		} else if (field599 > var7) {
																			field599 = field599 * 9 / 10;
																		}

																		if (field599 > 0) {
																			var8 = field599 / 16;
																			if (field414 >= 0) {
																				var5 = field414 - WorldMapLabel.cameraYaw & 2047;
																				var9 = Rasterizer3D.Rasterizer3D_sine[var5];
																				var10 = Rasterizer3D.Rasterizer3D_cosine[var5];
																				class172.oculusOrbFocalPointX += var9 * var8 / 65536;
																				BuddyRankComparator.oculusOrbFocalPointY += var8 * var10 / 65536;
																			}

																			if (field548 != 0) {
																				class191.oculusOrbFocalPointZ += var8 * field548;
																				if (class191.oculusOrbFocalPointZ > 0) {
																					class191.oculusOrbFocalPointZ = 0;
																				}
																			}
																		} else {
																			field414 = -1;
																			field548 = -1;
																		}

																		char var55 = '耀';
																		if (var55 > field416) {
																			field416 += (var55 - field416) / 24;
																		} else if (var55 < field416) {
																			field416 += (var55 - field416) / 80;
																		}

																		if (indexCheck.isValidIndexInRange(13)) {
																			packetWriter.addNode(UserComparator6.getPacketBufferNode(ClientPacket.FREECAM_EXIT, packetWriter.isaacCipher));
																			oculusOrbState = 0;
																		}
																	}

																	if (MouseHandler.MouseHandler_currentButton == 4 && class423.mouseCam) {
																		var5 = MouseHandler.MouseHandler_y - mouseCamClickedY;
																		camAngleDX = var5 * 2;
																		mouseCamClickedY = var5 != -1 && var5 != 1 ? (mouseCamClickedY + MouseHandler.MouseHandler_y) / 2 : MouseHandler.MouseHandler_y;
																		var6 = mouseCamClickedX - MouseHandler.MouseHandler_x;
																		camAngleDY = var6 * 2;
																		mouseCamClickedX = var6 != -1 && var6 != 1 ? (MouseHandler.MouseHandler_x + mouseCamClickedX) / 2 : MouseHandler.MouseHandler_x;
																	} else {
																		if (indexCheck.isValidIndexInRange(96)) {
																			camAngleDY += (-24 - camAngleDY) / 2;
																		} else if (indexCheck.isValidIndexInRange(97)) {
																			camAngleDY += (24 - camAngleDY) / 2;
																		} else {
																			camAngleDY /= 2;
																		}

																		if (indexCheck.isValidIndexInRange(98)) {
																			camAngleDX += (12 - camAngleDX) / 2;
																		} else if (indexCheck.isValidIndexInRange(99)) {
																			camAngleDX += (-12 - camAngleDX) / 2;
																		} else {
																			camAngleDX /= 2;
																		}

																		mouseCamClickedY = MouseHandler.MouseHandler_y;
																		mouseCamClickedX = MouseHandler.MouseHandler_x;
																	}

																	camAngleY = camAngleDY / 2 + camAngleY & 2047;
																	camAngleX += camAngleDX / 2;
																	if (camAngleX < 128) {
																		camAngleX = 128;
																	}

																	if (camAngleX > 383) {
																		camAngleX = 383;
																	}

																	if (field449) {
																		WorldMapLabel.method6829(class257.field3087, class114.field1510, class401.field4853);
																		ClanChannel.method4066(class63.field884, class165.field1886);
																		if (HealthBarDefinition.cameraX == class257.field3087 && class174.cameraY == class114.field1510 && class401.field4853 == HttpRequest.cameraZ && class63.field884 == class401.cameraPitch && WorldMapLabel.cameraYaw == class165.field1886) {
																			field449 = false;
																			isCameraLocked = false;
																			field553 = false;
																			field587 = false;
																			class169.field1909 = 0;
																			class227.field2654 = 0;
																			Buddy.field5413 = 0;
																			class47.field687 = 0;
																			class145.field1725 = 0;
																			class282.field3290 = 0;
																			class265.field3150 = 0;
																			KeyHandler.field114 = 0;
																			SequenceDefinition.field2487 = 0;
																			GrandExchangeOffer.field5046 = 0;
																			field589 = null;
																			field477 = null;
																			field514 = null;
																		}
																	} else if (isCameraLocked) {
																		class27.method409();
																	}

																	for (var5 = 0; var5 < 5; ++var5) {
																		var10002 = field406[var5]++;
																	}

																	class516.varcs.tryWrite();
																	var5 = class464.method9404();
																	var6 = WorldView.method2701();
																	PacketBufferNode var71;
																	if (var5 > 15000 && var6 > 15000) {
																		logoutTimer = 250;
																		ReflectionCheck.method740(14500);
																		var71 = UserComparator6.getPacketBufferNode(ClientPacket.EVENT_MOUSE_IDLE, packetWriter.isaacCipher);
																		packetWriter.addNode(var71);
																	}

																	ApproximateRouteStrategy.friendSystem.processFriendUpdates();

																	for (var7 = 0; var7 < field601.size(); ++var7) {
																		var9 = (Integer)field601.get(var7);
																		class146 var72 = SecureUrlRequester.method3516(var9);
																		if (var72 == null) {
																			var8 = 2;
																		} else {
																			var8 = var72.method3754() ? 0 : 1;
																		}

																		if (var8 != 2) {
																			field601.remove(var7);
																			--var7;
																		}
																	}

																	++packetWriter.pendingWrites;
																	if (packetWriter.pendingWrites > 50) {
																		var71 = UserComparator6.getPacketBufferNode(ClientPacket.NO_TIMEOUT, packetWriter.isaacCipher);
																		packetWriter.addNode(var71);
																	}

																	try {
																		packetWriter.flush();
																	} catch (IOException var44) {
																		class361.method7512();
																	}

																	class259.method5905().method5968();
																	return;
																}

																if (var65.field3196.type == 12) {
																	var50 = true;
																}

																class146.method3781(var65);
															}
														}

														var63 = var60.widget;
														if (var63.childIndex * -217986249 < 0) {
															break;
														}

														var66 = UrlRequester.widgetDefinition.method7476(var63.parentId);
													} while(var66 == null || var66.children == null || var63.childIndex * -217986249 >= var66.children.length || var63 != var66.children[var63.childIndex * -217986249]);

													PacketBufferNode.runScriptEvent(var60);
												}
											}

											var63 = var60.widget;
											if (var63.childIndex * -217986249 < 0) {
												break;
											}

											var66 = UrlRequester.widgetDefinition.method7476(var63.parentId);
										} while(var66 == null || var66.children == null || var63.childIndex * -217986249 >= var66.children.length || var63 != var66.children[var63.childIndex * -217986249]);

										PacketBufferNode.runScriptEvent(var60);
									}
								}

								var63 = var60.widget;
								if (var63.childIndex * -217986249 < 0) {
									break;
								}

								var66 = UrlRequester.widgetDefinition.method7476(var63.parentId);
							} while(var66 == null || var66.children == null || var63.childIndex * -217986249 >= var66.children.length || var63 != var66.children[var63.childIndex * -217986249]);

							PacketBufferNode.runScriptEvent(var60);
						}
					}

					var46 = UserComparator6.getPacketBufferNode(ClientPacket.REFLECTION_CHECK_REPLY, packetWriter.isaacCipher);
					var46.packetBuffer.writeByte(0);
					var3 = var46.packetBuffer.offset * 1216585693;
					ViewportMouse.performReflectionCheck(var46.packetBuffer);
					var46.packetBuffer.writeLengthByte(var46.packetBuffer.offset * 1216585693 - var3);
					packetWriter.addNode(var46);
				}
			}
		}
	}

	@ObfuscatedName("qp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1175201789"
	)
	void method832() {
		if (MouseHandler.MouseHandler_lastButton == 1 || !class423.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
			long var1 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis * -1L;
			if (var1 > 32767L) {
				var1 = 32767L;
			}

			mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis * -1L;
			int var3 = MouseHandler.MouseHandler_lastPressedY;
			if (var3 < 0) {
				var3 = 0;
			} else if (var3 > class396.canvasHeight) {
				var3 = class396.canvasHeight;
			}

			int var4 = MouseHandler.MouseHandler_lastPressedX;
			if (var4 < 0) {
				var4 = 0;
			} else if (var4 > GameEngine.canvasWidth) {
				var4 = GameEngine.canvasWidth;
			}

			int var5 = (int)var1;
			PacketBufferNode var6;
			if (class585.field5890 >= 232) {
				var6 = UserComparator6.getPacketBufferNode(ClientPacket.EVENT_MOUSE_CLICK, packetWriter.isaacCipher);
				var6.packetBuffer.writeShortAdd(var4);
				var6.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1));
				var6.packetBuffer.writeShortLE(var3);
				var6.packetBuffer.writeByteNeg(0);
				packetWriter.addNode(var6);
			} else {
				var6 = UserComparator6.getPacketBufferNode(ClientPacket.EVENT_MOUSE_CLICK_V2, packetWriter.isaacCipher);
				var6.packetBuffer.writeShort((var5 << 1) + (MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0));
				var6.packetBuffer.writeShort(var4);
				var6.packetBuffer.writeShort(var3);
				packetWriter.addNode(var6);
			}
		}

	}

	@ObfuscatedName("qe")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "1"
	)
	public void vmethod7338(int var1, int var2) {
		if (packetWriter != null && packetWriter.isaacCipher != null) {
			if (var1 > -1 && class36.clientPreferences.getMusicVolume() > 0 && !playingJingle) {
				PacketBufferNode var3 = UserComparator6.getPacketBufferNode(ClientPacket.MUSIC_PLAYING, packetWriter.isaacCipher);
				var3.packetBuffer.writeInt(var1);
				packetWriter.addNode(var3);
			}

		}
	}

	@ObfuscatedName("qi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2029993689"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = GameEngine.canvasWidth;
		int var2 = class396.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}

		if (class36.clientPreferences != null) {
			try {
				class26.method406(class521.client, "resize", new Object[]{MouseHandler.getWindowedMode()});
			} catch (Throwable var4) {
			}
		}

	}

	@ObfuscatedName("qt")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) {
			VarcInt.method4215(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (validRootWidgets[var1]) {
				field566[var1] = true;
			}

			field356[var1] = validRootWidgets[var1];
			validRootWidgets[var1] = false;
		}

		field450 = cycle;
		viewportX = -1;
		viewportY = -1;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			class164.drawWidgets(rootInterface, 0, 0, GameEngine.canvasWidth, class396.canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				NPCComposition.crossSprites[mouseCrossState * 400 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				NPCComposition.crossSprites[mouseCrossState * 400 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}

		if (!isMenuOpen) {
			if (viewportX != -1) {
				var1 = viewportX;
				int var2 = viewportY;
				if ((menu.menuOptionsCount >= 2 || isItemSelected != 0 || isSpellSelected) && showMouseOverText) {
					int var3 = menu.menuOptionsCount - 1;
					String var5;
					if (isItemSelected == 1 && menu.menuOptionsCount < 2) {
						var5 = "Use" + " " + field528 + " " + "->";
					} else if (isSpellSelected && menu.menuOptionsCount < 2) {
						var5 = selectedSpellActionName + " " + selectedSpellName + " " + "->";
					} else {
						var5 = menu.method11859(var3);
					}

					if (menu.menuOptionsCount > 2) {
						var5 = var5 + class134.colorStartTag(16777215) + " " + '/' + " " + (menu.menuOptionsCount - 2) + " more options";
					}

					class333.fontBold12.drawRandomAlphaAndSpacing(var5, var1 + 4, var2 + 15, 16777215, 0, cycle / 1000);
				}
			}
		} else {
			menu.method11877();
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field356[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field566[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		this.method818();
	}

	@ObfuscatedName("qr")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "22523"
	)
	void method818() {
		class452 var1 = worldViewManager.method2361();
		WorldEntity var2 = worldViewManager.method2347();
		int var3 = (int)var1.field5176;
		int var4 = (int)var1.field5175;
		int var5 = (int)var1.field5169;
		int var6 = graphicsCycle;
		Iterator var7 = worldViewManager.iterator();

		while (var7.hasNext()) {
			WorldView var8 = (WorldView)var7.next();

			for (ObjectSound var9 = (ObjectSound)var8.method2684().last(); var9 != null; var9 = (ObjectSound)var8.method2684().previous()) {
				var9.method2242(var2, var3, var4, var5, var6);
			}
		}

		var1.method8992();
		graphicsCycle = 0;
	}

	@ObfuscatedName("qv")
	@ObfuscatedSignature(
		descriptor = "(Ldz;B)Z",
		garbageValue = "-62"
	)
	boolean method819(PacketWriter var1) {
		if (var1.serverPacketLength == 0) {
			DevicePcmPlayerProvider.friendsChat = null;
		} else {
			if (DevicePcmPlayerProvider.friendsChat == null) {
				DevicePcmPlayerProvider.friendsChat = new FriendsChat(PacketWriter.loginType, class521.client);
			}

			DevicePcmPlayerProvider.friendsChat.method9886(var1.packetBuffer);
		}

		field363 = cycleCntr;
		class159.ClanChat_inClanChat = true;
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("qf")
	@ObfuscatedSignature(
		descriptor = "(Ldz;I)Z",
		garbageValue = "1657765967"
	)
	boolean method1047(PacketWriter var1) {
		if (DevicePcmPlayerProvider.friendsChat != null) {
			DevicePcmPlayerProvider.friendsChat.method9887(var1.packetBuffer);
		}

		field363 = cycleCntr;
		class159.ClanChat_inClanChat = true;
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("qo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-425772092"
	)
	void method1381() {
		int var1 = 0;
		boolean var2 = packetWriter.field1289 > 0;

		for (int var3 = packetWriter.field1300; var1 < 100 || var2; var2 = packetWriter.field1289 > 0) {
			boolean var4 = this.method1434(packetWriter);
			if (var2) {
				int var5 = packetWriter.field1300 - var3;
				PacketWriter var10000 = packetWriter;
				var10000.field1289 -= var5;
			}

			if (!var4) {
				break;
			}

			++var1;
			var3 = packetWriter.field1300;
		}

	}

	@ObfuscatedName("qm")
	@ObfuscatedSignature(
		descriptor = "(Ldz;I)Z",
		garbageValue = "-1032348597"
	)
	@Export("method1434")
	final boolean method1434(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket();
		PacketBuffer var3 = var1.packetBuffer;
		if (var2 == null) {
			return false;
		} else {
			String var23;
			int var24;
			try {
				if (var1.field1289 > 0 && !var2.isAvailable(var1.field1289)) {
					return false;
				}

				int var5;
				if (var1.serverPacket == null) {
					if (var1.field1296) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var1.field1300 += var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1297 = 0;
						var1.field1296 = false;
					}

					var3.offset = 0;
					if (var3.method11142()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var1.field1300 += var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1297 = 0;
					}

					var1.field1296 = true;
					ServerPacket[] var4 = class174.ServerPacket_values();
					var5 = var3.readSmartByteShortIsaac();
					if (var5 < 0 || var5 >= var4.length) {
						throw new IOException(var5 + " " + var3.offset * 1216585693);
					}

					var1.serverPacket = var4[var5];
					var1.serverPacketLength = var1.serverPacket.length;
				}

				if (var1.serverPacketLength == -1) {
					if (!var2.isAvailable(1)) {
						return false;
					}

					var1.field1300 += var2.read(var3.array, 0, 1);
					var1.serverPacketLength = var3.array[0] & 255;
				}

				if (var1.serverPacketLength == -2) {
					if (!var2.isAvailable(2)) {
						return false;
					}

					var1.field1300 += var2.read(var3.array, 0, 2);
					var3.offset = 0;
					var1.serverPacketLength = var3.readUnsignedShort();
				}

				if (!var2.isAvailable(var1.serverPacketLength)) {
					return false;
				}

				var3.offset = 0;
				var1.field1300 += var2.read(var3.array, 0, var1.serverPacketLength);
				var1.field1297 = 0;
				timer.method8246();
				var1.field1306 = var1.field1302;
				var1.field1302 = var1.field1295;
				var1.field1295 = var1.serverPacket;
				if (ServerPacket.EVENT_WORLDHOP == var1.serverPacket) {
					World var58 = new World();
					var58.host = var3.readStringCp1252NullTerminated();
					var58.id = var3.readUnsignedShort();
					var5 = var3.method1958();
					var58.properties = var5;
					if (var58.isDeadman()) {
						var58.field638 = "beta";
						class509.field5441 = true;
					} else {
						class509.field5441 = false;
					}

					UrlRequest.updateGameState(45);
					var2.close();
					var2 = null;
					VerticalAlignment.changeWorld(var58);
					var1.serverPacket = null;
					return false;
				}

				byte var96;
				if (ServerPacket.CLAN_SETTINGS_DELTA == var1.serverPacket) {
					ItemContainer.method2122();
					var96 = var3.readByte();
					class154 var100 = new class154(var3);
					ClanSettings var84;
					if (var96 >= 0) {
						var84 = currentClanSettings[var96];
					} else {
						var84 = HttpAuthenticationHeader.guestClanSettings;
					}

					if (var84 == null) {
						this.method831(var96);
						var1.serverPacket = null;
						return true;
					}

					if (var100.field1787 > var84.field1870) {
						this.method831(var96);
						var1.serverPacket = null;
						return true;
					}

					if (var100.field1787 < var84.field1870) {
						var1.serverPacket = null;
						return true;
					}

					var100.method3839(var84);
					var1.serverPacket = null;
					return true;
				}

				int var22;
				Widget var98;
				if (ServerPacket.IF_SETPLAYERHEAD == var1.serverPacket) {
					var22 = var3.readUnsignedIntLE();
					var98 = UrlRequester.widgetDefinition.method7476(var22);
					var98.modelType = 3;
					var98.modelId = HealthBarUpdate.localPlayer.appearance.getChatHeadId();
					class89.invalidateWidget(var98);
					var1.serverPacket = null;
					return true;
				}

				int var7;
				NPC var63;
				if (ServerPacket.NPC_HEADICON_SPECIFIC == var1.serverPacket) {
					short var112 = (short)var3.readShortLE();
					var5 = var3.readUnsignedIntME();
					var24 = var3.readUnsignedShortLE();
					var7 = var3.readUnsignedByte();
					var63 = (NPC)HttpHeaders.worldView.npcs.get((long)var24);
					if (var63 != null) {
						var63.method2726(var7, var5, var112);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_ACTIVE_WORLD == var1.serverPacket) {
					var22 = var3.readShort();
					var5 = var3.readUnsignedByte();
					if (var22 == -1) {
						class333.topLevelWorldView.plane = var5;
						HttpHeaders.worldView = class333.topLevelWorldView;
					} else {
						WorldEntity var83 = (WorldEntity)class333.topLevelWorldView.worldEntities.get((long)var22);
						if (var83 == null) {
							throw new RuntimeException("No valid ClientWorldEntity with ID " + var22);
						}

						var83.worldView.plane = var5;
						HttpHeaders.worldView = var83.worldView;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PING_STATISTICS_REQUEST == var1.serverPacket) {
					var22 = var3.method1958();
					var5 = var3.method1958();
					var24 = class264.getGcDuration();
					PacketBufferNode var101 = UserComparator6.getPacketBufferNode(ClientPacket.PING_STATISTICS, packetWriter.isaacCipher);
					var101.packetBuffer.writeByteSub(GameEngine.fps);
					var101.packetBuffer.writeIntIME(var22);
					var101.packetBuffer.writeInt(var5);
					var101.packetBuffer.writeByteNeg(var24);
					packetWriter.addNode(var101);
					var1.serverPacket = null;
					return true;
				}

				Widget var6;
				String var52;
				if (ServerPacket.IF_SET_TEXT == var1.serverPacket) {
					var52 = var3.readStringCp1252NullTerminated();
					var5 = var3.readUnsignedIntLE();
					var6 = UrlRequester.widgetDefinition.method7476(var5);
					if (!var52.equals(var6.text)) {
						var6.text = var52;
						class89.invalidateWidget(var6);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OBJ_ADD == var1.serverPacket) {
					class211.method4600(class328.field3645);
					var1.serverPacket = null;
					return true;
				}

				int var9;
				int var26;
				if (ServerPacket.IF_SETCOLOUR == var1.serverPacket) {
					var22 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedIntLE();
					var24 = var22 >> 10 & 31;
					var7 = var22 >> 5 & 31;
					var26 = var22 & 31;
					var9 = (var7 << 11) + (var24 << 19) + (var26 << 3);
					Widget var75 = UrlRequester.widgetDefinition.method7476(var5);
					if (var9 != var75.color) {
						var75.color = var9;
						class89.invalidateWidget(var75);
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var25;
				if (ServerPacket.IF_SETPOSITION == var1.serverPacket) {
					var22 = var3.readShort();
					var5 = var3.readUnsignedIntME();
					var24 = var3.readShort();
					var25 = UrlRequester.widgetDefinition.method7476(var5);
					if (var24 != var25.rawX || var22 != var25.rawY || var25.xAlignment != 0 || var25.yAlignment != 0) {
						var25.rawX = var24;
						var25.rawY = var22;
						var25.xAlignment = 0;
						var25.yAlignment = 0;
						class89.invalidateWidget(var25);
						this.alignWidget(var25);
						if (var25.type == 0) {
							Canvas.revalidateWidgetScroll(UrlRequester.widgetDefinition.Widget_interfaceComponents[var5 >> 16], var25, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_SET_SEQUENCE == var1.serverPacket) {
					var5 = var3.readUnsignedShortAdd();
					var24 = var3.readUnsignedByteAdd();
					var22 = var3.readUnsignedShortAddLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					NPC var97 = (NPC)HttpHeaders.worldView.npcs.get((long)var22);
					if (var97 != null) {
						SequenceDefinition var71 = var97.animationSequence.getSequenceDefinition();
						if (var5 == var97.method2484() && var5 != -1) {
							var9 = var71.restartMode;
							if (var9 == 1) {
								var97.animationSequence.method9572();
								var97.field1102 = var24;
							} else if (var9 == 2) {
								var97.animationSequence.method9589();
							}
						} else if (var5 == -1 || var71 == null || InvDefinition.SequenceDefinition_get(var5).field2480 >= var71.field2480) {
							var97.animationSequence.setSequence(var5);
							var97.animationSequence.method9572();
							var97.field1102 = var24;
							var97.field1040 = var97.pathLength;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_CLEAR == var1.serverPacket) {
					var22 = var3.method1958();
					var98 = UrlRequester.widgetDefinition.method7476(var22);

					for (var24 = 0; var24 < var98.itemIds.length; ++var24) {
						var98.itemIds[var24] = -1;
						var98.itemIds[var24] = 0;
					}

					class89.invalidateWidget(var98);
					var1.serverPacket = null;
					return true;
				}

				int var27;
				if (ServerPacket.CAM_SETANGLE == var1.serverPacket) {
					isCameraLocked = true;
					field449 = false;
					field587 = false;
					class169.field1909 = var3.readUnsignedByte();
					class227.field2654 = var3.readUnsignedByte();
					Buddy.field5413 = var3.readUnsignedShort();
					class47.field687 = var3.readUnsignedByte();
					class145.field1725 = var3.readUnsignedByte();
					if (class145.field1725 >= 100) {
						var22 = Coord.method7416(class169.field1909);
						var5 = Coord.method7416(class227.field2654);
						var24 = JagNetThread.getTileHeight(class333.topLevelWorldView, var22, var5, class333.topLevelWorldView.plane) - Buddy.field5413;
						var7 = var22 - HealthBarDefinition.cameraX;
						var26 = var24 - class174.cameraY;
						var9 = var5 - HttpRequest.cameraZ;
						var27 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9));
						class401.cameraPitch = (int)(Math.atan2((double)var26, (double)var27) * 325.9490051269531D) & 2047;
						WorldMapLabel.cameraYaw = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531D) & 2047;
						if (class401.cameraPitch < 128) {
							class401.cameraPitch = 128;
						}

						if (class401.cameraPitch > 383) {
							class401.cameraPitch = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_LOOKAT_EASED_ANGLE_RELATIVE == var1.serverPacket) {
					isCameraLocked = true;
					field449 = false;
					field587 = true;
					var22 = var3.readShort();
					var5 = var3.readShort();
					var24 = IndexCheck.method6161(var5 + class401.cameraPitch & 2027);
					var7 = var22 + WorldMapLabel.cameraYaw;
					var26 = var3.readUnsignedShort();
					var9 = var3.readUnsignedByte();
					field477 = new class550(class401.cameraPitch, var24, var26, var9);
					field514 = new class550(WorldMapLabel.cameraYaw, var7, var26, var9);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CLAN_CHANNEL_DELTA == var1.serverPacket) {
					field484 = cycleCntr;
					var96 = var3.readByte();
					class168 var95 = new class168(var3);
					ClanChannel var81;
					if (var96 >= 0) {
						var81 = currentClanChannels[var96];
					} else {
						var81 = class86.guestClanChannel;
					}

					if (var81 == null) {
						this.method830(var96);
						var1.serverPacket = null;
						return true;
					}

					if (var95.field1898 > var81.field1922) {
						this.method830(var96);
						var1.serverPacket = null;
						return true;
					}

					if (var95.field1898 < var81.field1922) {
						var1.serverPacket = null;
						return true;
					}

					var95.method4044(var81);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RUNCLIENTSCRIPT == var1.serverPacket) {
					var52 = var3.readStringCp1252NullTerminated();
					Object[] var94 = new Object[var52.length() + 1];

					for (var24 = var52.length() - 1; var24 >= 0; --var24) {
						DynamicArray var68;
						switch(var52.charAt(var24)) {
						case 'W':
							var7 = var3.packBytesToInt();
							var68 = new DynamicArray(class574.field5820, 0, var7, var7);
							int[] var106 = var68.method10318();

							for (var27 = 0; var27 < var7; ++var27) {
								var106[var27] = var3.writeIntME();
							}

							var94[var24 + 1] = var68;
							break;
						case 'X':
							var7 = var3.packBytesToInt();
							var68 = new DynamicArray(class574.field5824, (Object)null, var7, var7);
							Object[] var104 = var68.method10321();

							for (var27 = 0; var27 < var7; ++var27) {
								var104[var27] = var3.readStringCp1252NullTerminated();
							}

							var94[var24 + 1] = var68;
							break;
						case 's':
							var94[var24 + 1] = var3.readStringCp1252NullTerminated();
							break;
						default:
							var94[var24 + 1] = new Integer(var3.method1958());
						}
					}

					var94[0] = new Integer(var3.method1958());
					ScriptEvent var80 = new ScriptEvent();
					var80.args = var94;
					PacketBufferNode.runScriptEvent(var80);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_INFO == var1.serverPacket) {
					playerUpdateManager.method2854(var3, var1.serverPacketLength);
					class259.method5907();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_SHAKE == var1.serverPacket) {
					var22 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var24 = var3.readUnsignedByte();
					var7 = var3.readUnsignedByte();
					field610[var22] = true;
					field593[var22] = var5;
					field594[var22] = var24;
					field595[var22] = var7;
					field406[var22] = 0;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CLAN_CHANNEL_FULL == var1.serverPacket) {
					field484 = cycleCntr;
					var96 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var96 >= 0) {
							currentClanChannels[var96] = null;
						} else {
							class86.guestClanChannel = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var96 >= 0) {
						currentClanChannels[var96] = new ClanChannel(var3);
					} else {
						class86.guestClanChannel = new ClanChannel(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				int var11;
				InterfaceParent var90;
				if (ServerPacket.IF_RESYNC == var1.serverPacket) {
					var22 = var3.offset * 1216585693 + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					var24 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.method1351(false);
						class1.method10(rootInterface);
						class429.runWidgetOnLoadListener(rootInterface);

						for (var7 = 0; var7 < 100; ++var7) {
							validRootWidgets[var7] = true;
						}
					}

					InterfaceParent var70;
					for (; var24-- > 0; var70.field887 = true) {
						var7 = var3.method1958();
						var26 = var3.readUnsignedShort();
						var9 = var3.readUnsignedByte();
						var70 = (InterfaceParent)interfaceParents.get((long)var7);
						if (var70 != null && var26 != var70.group) {
							WorldEntityCoord.closeInterface(var70, true);
							var70 = null;
						}

						if (var70 == null) {
							var70 = class143.openInterface(var7, var26, var9);
						}
					}

					for (var90 = (InterfaceParent)interfaceParents.first(); var90 != null; var90 = (InterfaceParent)interfaceParents.next()) {
						if (var90.field887) {
							var90.field887 = false;
						} else {
							WorldEntityCoord.closeInterface(var90, true);
						}
					}

					widgetFlags = new NodeHashTable(512);

					while (var3.offset * 1216585693 < var22) {
						var7 = var3.method1958();
						var26 = var3.readUnsignedShort();
						var9 = var3.readUnsignedShort();
						var27 = var3.method1958();
						var11 = var3.method1958();
						WidgetConfigNode var73 = class342.method7325((WidgetConfigNode)null, var26, var9, var27, var11);
						widgetFlags.put(var73, (long)var7);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SERVER_TICK_END == var1.serverPacket) {
					++serverCycle;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OBJ_COUNT == var1.serverPacket) {
					class211.method4600(class328.field3643);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETNPCHEAD == var1.serverPacket) {
					var22 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedIntLE();
					var6 = UrlRequester.widgetDefinition.method7476(var5);
					if (var6.modelType != 2 || var22 != var6.modelId) {
						var6.modelType = 2;
						var6.modelId = var22;
						class89.invalidateWidget(var6);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_MOVE_TO == var1.serverPacket) {
					isCameraLocked = true;
					field449 = false;
					field553 = false;
					KeyHandler.field114 = var3.readUnsignedByte();
					SequenceDefinition.field2487 = var3.readUnsignedByte();
					GrandExchangeOffer.field5046 = var3.readUnsignedShort();
					class265.field3150 = var3.readUnsignedByte();
					class282.field3290 = var3.readUnsignedByte();
					if (class282.field3290 >= 100) {
						HealthBarDefinition.cameraX = Coord.method7416(KeyHandler.field114);
						HttpRequest.cameraZ = Coord.method7416(SequenceDefinition.field2487);
						class174.cameraY = JagNetThread.getTileHeight(class333.topLevelWorldView, HealthBarDefinition.cameraX, HttpRequest.cameraZ, class333.topLevelWorldView.plane) - GrandExchangeOffer.field5046;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OBJ_RESET_CUSTOMIZATION == var1.serverPacket) {
					class211.method4600(class328.field3644);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_NPC_UPDATE_ORIGIN == var1.serverPacket) {
					Canvas.field94 = var3.readUnsignedByte();
					IndexCheck.field3224 = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_INFO_LARGE_VIEWPORT == var1.serverPacket) {
					WorldMapSprite.updateNpcs(HttpHeaders.worldView, false, var3);
					var1.serverPacket = null;
					return true;
				}

				int var13;
				int var15;
				int var16;
				int var17;
				int var29;
				int var82;
				if (ServerPacket.PROJECTILE_SPAWN == var1.serverPacket) {
					var22 = var3.readUnsignedIntLE();
					var5 = Coord.method7413(var22);
					var24 = Coord.method7424(var22);
					var7 = Coord.method7415(var22);
					var26 = var3.readUnsignedShortAdd();
					var9 = var3.readUnsignedShort();
					var27 = var3.readUnsignedShortAddLE();
					var11 = var3.readUnsignedIntIME();
					var29 = Coord.method7413(var11);
					var13 = Coord.method7424(var11);
					var82 = Coord.method7415(var11);
					var15 = var3.readUnsignedByteNeg();
					var16 = var3.readUnsignedShortAdd();
					var17 = var3.method11247();
					int var18 = var3.method11248();
					int var19 = var3.readUnsignedShort();
					int var20 = var3.readUnsignedShortAddLE();
					if (var27 != 65535) {
						Projectile var21 = new Projectile(var5, var24, var7, var26, var17, var29, var13, var82, var9, var18, var27, var16 + cycle, var20 + cycle, var15, var19);
						projectiles.addFirst(var21);
					}

					var1.serverPacket = null;
					return true;
				}

				boolean var108;
				if (ServerPacket.IF_SET_PLAYERMODEL_SELF == var1.serverPacket) {
					var108 = var3.readUnsignedByte() == 1;
					var5 = var3.readUnsignedIntIME();
					var6 = UrlRequester.widgetDefinition.method7476(var5);
					var6.method7977(HealthBarUpdate.localPlayer.appearance, var108);
					class89.invalidateWidget(var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REFLECTION_CHECKER == var1.serverPacket) {
					class71.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOC_ADD_CHANGE == var1.serverPacket) {
					class211.method4600(class328.field3654);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_UID192 == var1.serverPacket) {
					var3.offset += 458443980;
					if (var3.checkCrc()) {
						class270.method6064(var3, var3.offset * 1216585693 - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_OPENSUB == var1.serverPacket) {
					var22 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedIntLE();
					var24 = var3.readUnsignedByte();
					var90 = (InterfaceParent)interfaceParents.get((long)var5);
					if (var90 != null) {
						WorldEntityCoord.closeInterface(var90, var22 != var90.group);
					}

					class143.openInterface(var5, var22, var24);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_TRADING_POST == var1.serverPacket) {
					var108 = var3.readUnsignedByte() == 1;
					if (var108) {
						AbstractByteArrayCopier.field4311 = class189.method4284() - var3.readLong();
						SongTask.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						SongTask.grandExchangeEvents = null;
					}

					field560 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OBJ_DEL == var1.serverPacket) {
					class211.method4600(class328.field3646);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SWAP == var1.serverPacket) {
					var7 = var3.readUnsignedShortLE();
					var22 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShortLE();
					var24 = var3.readUnsignedShortAdd();
					class173.method4098(var22, var5, var24, var7);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.FRIENDS_LIST_LOADED == var1.serverPacket) {
					ApproximateRouteStrategy.friendSystem.method1536();
					field555 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_CLOSESUB == var1.serverPacket) {
					var22 = var3.method1958();
					InterfaceParent var93 = (InterfaceParent)interfaceParents.get((long)var22);
					if (var93 != null) {
						WorldEntityCoord.closeInterface(var93, true);
					}

					if (meslayerContinueWidget != null) {
						class89.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MINIMAP_FLAG_SET == var1.serverPacket) {
					destinationX = var3.readUnsignedByte();
					if (destinationX == 255) {
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte();
					if (destinationY == 255) {
						destinationY = 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CHAT_FILTER_SETTINGS == var1.serverPacket) {
					tradeChatMode = var3.readUnsignedByteNeg();
					publicChatMode = var3.readUnsignedByteNeg();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SONG == var1.serverPacket) {
					var24 = var3.readUnsignedShort();
					var7 = var3.readUnsignedShortLE();
					var26 = var3.readUnsignedShortAddLE();
					var22 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedShort();
					if (var22 == 65535) {
						var22 = -1;
					}

					ArrayList var103 = new ArrayList();
					var103.add(var22);
					class568.playSong(var103, var5, var24, var7, var26);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.GRAPHICSOBJECT_SPAWN == var1.serverPacket) {
					var24 = var3.readMedium();
					var22 = var24 >> 16;
					var5 = var24 >> 8 & 255;
					var7 = var22 + (var24 >> 4 & 7);
					var26 = var5 + (var24 & 7);
					var9 = var3.readUnsignedShort();
					var11 = var3.readUnsignedShortAddLE();
					var27 = var3.readUnsignedByte();
					if (var7 >= 0 && var26 >= 0 && var7 < HttpHeaders.worldView.sizeX && var26 < HttpHeaders.worldView.sizeY) {
						var7 = Coord.method7416(var7);
						var26 = Coord.method7416(var26);
						GraphicsObject var72 = new GraphicsObject(HttpHeaders.worldView, var9, HttpHeaders.worldView.plane, var7, var26, JagNetThread.getTileHeight(HttpHeaders.worldView, var7, var26, HttpHeaders.worldView.plane) - var27, var11, cycle);
						HttpHeaders.worldView.graphicsObjects.addFirst(var72);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RESET_INTERACTION_MODE == var1.serverPacket) {
					var22 = var3.readShort();
					worldViewManager.method2393(var22);
					var1.serverPacket = null;
					return true;
				}

				long var30;
				long var32;
				long var34;
				String var39;
				if (ServerPacket.MESSAGE_FRIEND_PRIVATE == var1.serverPacket) {
					var52 = var3.readStringCp1252NullTerminated();
					var30 = var3.readLong();
					var32 = (long)var3.readUnsignedShort();
					var34 = (long)var3.readMedium();
					PlayerType var109 = (PlayerType)class173.findEnumerated(class446.PlayerType_values(), var3.readUnsignedByte());
					long var110 = var34 + (var32 << 32);
					boolean var85 = false;

					for (var15 = 0; var15 < 100; ++var15) {
						if (var110 == crossWorldMessageIds[var15]) {
							var85 = true;
							break;
						}
					}

					if (var109.isUser && ApproximateRouteStrategy.friendSystem.isIgnored(new Username(var52, PacketWriter.loginType))) {
						var85 = true;
					}

					if (!var85 && field341 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var110;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var39 = AbstractFont.escapeBrackets(Calendar.method8130(ScriptEvent.method2145(var3)));
						if (var109.modIcon != -1) {
							class109.addChatMessage(9, ChatChannel.method2014(var109.modIcon) + var52, var39, class189.base37DecodeLong(var30));
						} else {
							class109.addChatMessage(9, var52, var39, class189.base37DecodeLong(var30));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SONG_WITH_SECONDARY == var1.serverPacket) {
					var24 = var3.readUnsignedShortAdd();
					var26 = var3.readUnsignedShortLE();
					var7 = var3.readUnsignedShortAdd();
					var22 = var3.readUnsignedShortLE();
					if (var22 == 65535) {
						var22 = -1;
					}

					var9 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					ArrayList var69 = new ArrayList();
					var69.add(var22);
					var69.add(var5);
					class568.playSong(var69, var24, var7, var26, var9);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_ROTATE_SPEED == var1.serverPacket) {
					var22 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedIntLE();
					var24 = var3.readUnsignedShortAdd();
					var25 = UrlRequester.widgetDefinition.method7476(var5);
					var25.field4205 = var24 + (var22 << 16);
					var1.serverPacket = null;
					return true;
				}

				String var40;
				boolean var74;
				if (ServerPacket.MESSAGE_CLAN_CHANNEL_SYSTEM == var1.serverPacket) {
					var96 = var3.readByte();
					var30 = (long)var3.readUnsignedShort();
					var32 = (long)var3.readMedium();
					var34 = (var30 << 32) + var32;
					var74 = false;
					ClanChannel var12 = var96 >= 0 ? currentClanChannels[var96] : class86.guestClanChannel;
					if (var12 == null) {
						var74 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) {
							if (crossWorldMessageIds[var13] == var34) {
								var74 = true;
								break;
							}
						}
					}

					if (!var74) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var34;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var40 = ScriptEvent.method2145(var3);
						var82 = var96 >= 0 ? 43 : 46;
						class109.addChatMessage(var82, "", var40, var12.name);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_LOOKAT_EASED_COORD == var1.serverPacket) {
					isCameraLocked = true;
					field449 = false;
					field587 = true;
					class169.field1909 = var3.readUnsignedByte();
					class227.field2654 = var3.readUnsignedByte();
					Buddy.field5413 = var3.readUnsignedShort();
					var22 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var24 = Coord.method7416(class169.field1909);
					var7 = Coord.method7416(class227.field2654);
					var26 = JagNetThread.getTileHeight(class333.topLevelWorldView, var24, var7, class333.topLevelWorldView.plane) - Buddy.field5413;
					var9 = var24 - HealthBarDefinition.cameraX;
					var27 = var26 - class174.cameraY;
					var11 = var7 - HttpRequest.cameraZ;
					double var37 = Math.sqrt((double)(var9 * var9 + var11 * var11));
					var82 = IndexCheck.method6161((int)(Math.atan2((double)var27, var37) * 325.9490051269531D) & 2047);
					var15 = class216.method4818((int)(Math.atan2((double)var9, (double)var11) * -325.9490051269531D) & 2047);
					field477 = new class550(class401.cameraPitch, var82, var22, var5);
					field514 = new class550(WorldMapLabel.cameraYaw, var15, var22, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_STOCKMARKET_SLOT == var1.serverPacket) {
					var22 = var3.readUnsignedByte();
					if (var3.readUnsignedByte() == 0) {
						grandExchangeOffers[var22] = new GrandExchangeOffer();
						var3.offset += -932419526;
					} else {
						var3.offset -= -290410379;
						grandExchangeOffers[var22] = new GrandExchangeOffer(var3, false);
					}

					field559 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_RUN_ENERGY == var1.serverPacket) {
					Message.method768();
					runEnergy = var3.readUnsignedShort();
					field561 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				WorldView var111;
				if (ServerPacket.field3717 == var1.serverPacket) {
					var22 = var3.readShort();
					var5 = var3.readSignedShort();
					var24 = var3.readUnsignedShortAddLE();
					var7 = var3.readUnsignedIntME();
					var26 = var3.readUnsignedIntLE();
					var9 = var3.readUnsignedShortLE();
					short var107 = (short)var3.readShortLE();
					short var77 = (short)var3.method9343();
					var29 = Coord.method7413(var26);
					var13 = Coord.method7424(var26);
					var82 = Coord.method7415(var26);
					var111 = worldViewManager.method2345(var13, var82);
					var16 = var13 - var111.baseX;
					var17 = var82 - var111.baseY;
					if (var16 >= 0 && var17 >= 0 && var16 < var111.sizeX && var17 < var111.sizeY) {
						class114.method3459(var111, var29, var16, var17, var9, var7, var107, var22, var77, var5, var24);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3806 == var1.serverPacket) {
					class156.updateWorldEntitiesFromPacketBuffer(HttpHeaders.worldView, var3, 6);
					var1.serverPacket = null;
					return true;
				}

				Widget var8;
				if (ServerPacket.IF_MOVESUB == var1.serverPacket) {
					var22 = var3.readUnsignedIntIME();
					var5 = var3.method1958();
					InterfaceParent var76 = (InterfaceParent)interfaceParents.get((long)var22);
					var90 = (InterfaceParent)interfaceParents.get((long)var5);
					if (var90 != null) {
						WorldEntityCoord.closeInterface(var90, var76 == null || var90.group != var76.group);
					}

					if (var76 != null) {
						var76.remove();
						interfaceParents.put(var76, (long)var5);
					}

					var8 = UrlRequester.widgetDefinition.method7476(var22);
					if (var8 != null) {
						class89.invalidateWidget(var8);
					}

					var8 = UrlRequester.widgetDefinition.method7476(var5);
					if (var8 != null) {
						class89.invalidateWidget(var8);
						Canvas.revalidateWidgetScroll(UrlRequester.widgetDefinition.Widget_interfaceComponents[var8.id >>> 16], var8, true);
					}

					if (rootInterface != -1) {
						class142.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_FULL_FOLLOWS == var1.serverPacket) {
					class163.field1873 = var3.readUnsignedByte();
					class148.field1756 = var3.readUnsignedByteNeg();
					overheadTextLimit = var3.readUnsignedByteNeg();

					for (var22 = class148.field1756; var22 < class148.field1756 + 8; ++var22) {
						for (var5 = class163.field1873; var5 < class163.field1873 + 8; ++var5) {
							if (HttpHeaders.worldView.groundItems[overheadTextLimit][var22][var5] != null) {
								HttpHeaders.worldView.groundItems[overheadTextLimit][var22][var5] = null;
								EnumComposition.updateItemPile(overheadTextLimit, var22, var5);
							}
						}
					}

					for (PendingSpawn var56 = (PendingSpawn)HttpHeaders.worldView.pendingSpawns.last(); var56 != null; var56 = (PendingSpawn)HttpHeaders.worldView.pendingSpawns.previous()) {
						if (var56.x >= class148.field1756 && var56.x < class148.field1756 + 8 && var56.y >= class163.field1873 && var56.y < class163.field1873 + 8 && var56.plane == overheadTextLimit) {
							var56.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CLAN_SETTINGS_FULL == var1.serverPacket) {
					ItemContainer.method2122();
					var96 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var96 >= 0) {
							currentClanSettings[var96] = null;
						} else {
							HttpAuthenticationHeader.guestClanSettings = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var96 >= 0) {
						currentClanSettings[var96] = new ClanSettings(var3);
					} else {
						HttpAuthenticationHeader.guestClanSettings = new ClanSettings(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RESET_CLIENT_VARCACHE == var1.serverPacket) {
					for (var22 = 0; var22 < class4.field8; ++var22) {
						VarpDefinition var92 = Actor.VarpDefinition_get(var22);
						if (var92 != null) {
							GrandExchangeOfferUnitPriceComparator.Varps_temp[var22] = 0;
							Varps.Varps_main[var22] = 0;
						}
					}

					Message.method768();
					changedVarpCount += 32;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOC_ANIM == var1.serverPacket) {
					class211.method4600(class328.field3653);
					var1.serverPacket = null;
					return true;
				}

				boolean var105;
				if (ServerPacket.CAM_MOVETO_EASED_CIRCULAR == var1.serverPacket) {
					isCameraLocked = true;
					field449 = false;
					field553 = true;
					KeyHandler.field114 = var3.readUnsignedByte();
					SequenceDefinition.field2487 = var3.readUnsignedByte();
					var22 = var3.readUnsignedShort();
					var5 = Coord.method7416(var3.readUnsignedByte());
					var24 = Coord.method7416(var3.readUnsignedByte());
					var7 = var3.readUnsignedShort();
					field588 = var3.readBoolean();
					var26 = var3.readUnsignedByte();
					var9 = Coord.method7416(KeyHandler.field114);
					var27 = Coord.method7416(SequenceDefinition.field2487);
					var74 = false;
					var105 = false;
					if (field588) {
						var11 = class174.cameraY;
						var29 = JagNetThread.getTileHeight(class333.topLevelWorldView, var9, var27, class333.topLevelWorldView.plane) - var22;
					} else {
						var11 = JagNetThread.getTileHeight(class333.topLevelWorldView, HealthBarDefinition.cameraX, HttpRequest.cameraZ, class333.topLevelWorldView.plane) - class174.cameraY;
						var29 = var22;
					}

					field589 = new class548(HealthBarDefinition.cameraX, HttpRequest.cameraZ, var11, var9, var27, var29, var5, var24, var7, var26);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETOBJECT == var1.serverPacket) {
					var22 = var3.readUnsignedShort();
					if (var22 == 65535) {
						var22 = -1;
					}

					var5 = var3.readUnsignedIntIME();
					var24 = var3.readUnsignedIntME();
					var25 = UrlRequester.widgetDefinition.method7476(var5);
					ItemComposition var64;
					if (!var25.isIf3) {
						if (var22 == -1) {
							var25.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var64 = AttackOption.ItemDefinition_get(var22).getCountObj(var24);
						var25.modelType = 4;
						var25.modelId = var22;
						var25.modelAngleX = var64.xan2d;
						var25.modelAngleY = var64.yan2d;
						var25.modelZoom = var64.zoom2d * 100 / var24;
						class89.invalidateWidget(var25);
					} else {
						var25.itemId = var22;
						var25.itemQuantity = var24;
						var64 = AttackOption.ItemDefinition_get(var22).getCountObj(var24);
						var25.modelAngleX = var64.xan2d;
						var25.modelAngleY = var64.yan2d;
						var25.modelAngleZ = var64.zan2d;
						var25.modelOffsetX = var64.offsetX2d;
						var25.modelOffsetY = var64.offsetY2d;
						var25.modelZoom = var64.zoom2d;
						if (var64.isStackable == 1) {
							var25.itemQuantityMode = 1;
						} else {
							var25.itemQuantityMode = 2;
						}

						if (var25.field4152 > 0) {
							var25.modelZoom = var25.modelZoom * 32 / var25.field4152;
						} else if (var25.rawWidth > 0) {
							var25.modelZoom = var25.modelZoom * 32 / var25.rawWidth;
						}

						class89.invalidateWidget(var25);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.HEAT_MAP == var1.serverPacket) {
					var108 = var3.readBoolean();
					if (var108) {
						if (ClanChannelMember.field1780 == null) {
							ClanChannelMember.field1780 = new class423();
						}
					} else {
						ClanChannelMember.field1780 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_STAT == var1.serverPacket) {
					Message.method768();
					var22 = var3.readUnsignedByteNeg();
					var5 = var3.readUnsignedByteNeg();
					var24 = var3.method1958();
					var7 = var3.readUnsignedByteSub();
					experience[var22] = var24;
					currentLevels[var22] = var7;
					levels[var22] = 1;
					field615[var22] = var5;

					for (var26 = 0; var26 < 98; ++var26) {
						if (var24 >= Skills.Skills_experienceTable[var26]) {
							levels[var22] = var26 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var22;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_PRIVCHATMODE == var1.serverPacket) {
					WorldMapElement.privateChatMode = WorldMapSectionType.method6780(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_RUN_WEIGHT == var1.serverPacket) {
					Message.method768();
					weight = var3.readShort();
					field561 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				WorldView var10;
				if (ServerPacket.field3763 == var1.serverPacket) {
					var22 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShortLE();
					var24 = var3.readUnsignedIntLE();
					var7 = Coord.method7413(var22);
					var26 = Coord.method7424(var22);
					var9 = Coord.method7415(var22);
					var10 = worldViewManager.method2345(var26, var9);
					var11 = var26 - var10.baseX;
					var29 = var9 - var10.baseY;
					if (var11 >= 0 && var29 >= 0 && var11 < var10.sizeX && var29 < var10.sizeY) {
						ClientPacket.method7040(var10, var7, var11, var29, var5, var24);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3746 == var1.serverPacket) {
					var22 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var24 = var3.readUnsignedShort();
					class574.queueSoundEffect(var22, var5, var24);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SYNC_CLIENT_VARCACHE == var1.serverPacket) {
					for (var22 = 0; var22 < Varps.Varps_main.length; ++var22) {
						if (GrandExchangeOfferUnitPriceComparator.Varps_temp[var22] != Varps.Varps_main[var22]) {
							Varps.Varps_main[var22] = GrandExchangeOfferUnitPriceComparator.Varps_temp[var22];
							AbstractByteArrayCopier.changeGameOptions(var22);
							changedVarps[++changedVarpCount - 1 & 31] = var22;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_OPENTOP == var1.serverPacket) {
					var22 = var3.readUnsignedShortLE();
					if (var22 == 65535) {
						var22 = -1;
					}

					rootInterface = var22;
					this.method1351(false);
					class1.method10(var22);
					class429.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						validRootWidgets[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_SPOTANIM == var1.serverPacket) {
					var5 = var3.readUnsignedIntME();
					var24 = var3.readUnsignedShortLE();
					var22 = var3.readUnsignedShortAddLE();
					var63 = (NPC)HttpHeaders.worldView.npcs.get((long)var22);
					var7 = var3.readUnsignedByte();
					if (var63 != null) {
						var63.updateSpotAnimation(var7, var24, var5 >> 16, var5 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOGOUT_FULL == var1.serverPacket) {
					class386.logOut();
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.OBJ_SET_CUSTOMIZATION == var1.serverPacket) {
					class211.method4600(class328.field3650);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VARP_SMALL == var1.serverPacket) {
					var96 = var3.readByteNeg();
					var5 = var3.readUnsignedShortLE();
					GrandExchangeOfferUnitPriceComparator.Varps_temp[var5] = var96;
					if (Varps.Varps_main[var5] != var96) {
						Varps.Varps_main[var5] = var96;
					}

					AbstractByteArrayCopier.changeGameOptions(var5);
					changedVarps[++changedVarpCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3796 == var1.serverPacket) {
					class156.updateWorldEntitiesFromPacketBuffer(HttpHeaders.worldView, var3, 5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETHIDE == var1.serverPacket) {
					var108 = var3.readUnsignedByteNeg() == 1;
					var5 = var3.readUnsignedIntME();
					var6 = UrlRequester.widgetDefinition.method7476(var5);
					if (var108 != var6.isHidden) {
						var6.isHidden = var108;
						class89.invalidateWidget(var6);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_TARGET == var1.serverPacket) {
					class4.field7 = (class384)class173.findEnumerated(LoginScreenAnimation.method2550(), var3.readUnsignedByte());
					field347 = var3.readShort();
					field348 = var3.readUnsignedShort();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOC_MERGEPLAYER == var1.serverPacket) {
					class211.method4600(class328.field3647);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER == var1.serverPacket) {
					return this.method1047(var1);
				}

				String var62;
				if (ServerPacket.URL_OPEN == var1.serverPacket) {
					byte[] var55 = new byte[var1.serverPacketLength];
					var3.method11137(var55, 0, var55.length);
					Buffer var91 = new Buffer(var55);
					var62 = var91.readStringCp1252NullTerminated();
					DevicePcmPlayerProvider.openURL(var62, true, false);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OCULUS_SYNC == var1.serverPacket) {
					var22 = var3.method1958();
					if (var22 != field486) {
						field486 = var22;
						GameEngine.method533();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETMODEL == var1.serverPacket) {
					var22 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedIntLE();
					var6 = UrlRequester.widgetDefinition.method7476(var5);
					if (var6.modelType != 1 || var22 != var6.modelId) {
						var6.modelType = 1;
						var6.modelId = var22;
						class89.invalidateWidget(var6);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_FRIENDLIST == var1.serverPacket) {
					ApproximateRouteStrategy.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field555 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_PARTIAL == var1.serverPacket) {
					var22 = var3.method1958();
					var5 = var3.readUnsignedShort();
					if (var22 < -70000) {
						var5 += 32768;
					}

					if (var22 >= 0) {
						var6 = UrlRequester.widgetDefinition.method7476(var22);
					} else {
						var6 = null;
					}

					for (; var3.offset * 1216585693 < var1.serverPacketLength; class115.itemContainerSetItem(var5, var7, var26 - 1, var9)) {
						var7 = var3.readUShortSmart();
						var26 = var3.readUnsignedShort();
						var9 = 0;
						if (var26 != 0) {
							var9 = var3.readUnsignedByte();
							if (var9 == 255) {
								var9 = var3.method1958();
							}
						}

						if (var6 != null && var7 >= 0 && var7 < var6.itemIds.length) {
							var6.itemIds[var7] = var26;
							var6.itemQuantities[var7] = var9;
						}
					}

					if (var6 != null) {
						class89.invalidateWidget(var6);
					}

					Message.method768();
					changedItemContainers[++changedItemsCount - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_EVENTS == var1.serverPacket) {
					var22 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					var24 = var3.readUnsignedShortAdd();
					if (var24 == 65535) {
						var24 = -1;
					}

					var7 = var3.readUnsignedIntLE();
					var26 = var3.readUnsignedIntME();
					WidgetConfigNode var102 = (WidgetConfigNode)widgetFlags.get((long)var7);
					if (var102 != null) {
						var102.remove();
					}

					var102 = class342.method7325(var102, var24, var5, var22, var26);
					widgetFlags.put(var102, (long)var7);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MAP_ANIM == var1.serverPacket) {
					class211.method4600(class328.field3655);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_REGION == var1.serverPacket) {
					UserComparator7.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_GAME == var1.serverPacket) {
					var22 = var3.readUShortSmart();
					boolean var79 = var3.readUnsignedByte() == 1;
					var62 = "";
					boolean var67 = false;
					if (var79) {
						var62 = var3.readStringCp1252NullTerminated();
						if (ApproximateRouteStrategy.friendSystem.isIgnored(new Username(var62, PacketWriter.loginType))) {
							var67 = true;
						}
					}

					String var61 = var3.readStringCp1252NullTerminated();
					if (!var67) {
						Varcs.addGameMessage(var22, var62, var61);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_PLAYER_OP == var1.serverPacket) {
					var22 = var3.readUnsignedByteNeg();
					var5 = var3.readUnsignedByteNeg();
					var62 = var3.readStringCp1252NullTerminated();
					if (var22 >= 1 && var22 <= 8) {
						if (var62.equalsIgnoreCase("null")) {
							var62 = null;
						}

						playerMenuActions[var22 - 1] = var62;
						playerOptionsPriorities[var22 - 1] = var5 == 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_WORLDENTITY == var1.serverPacket) {
					AABB.method5360(class333.topLevelWorldView, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_PLAYERMODEL_BASECOLOUR == var1.serverPacket) {
					var22 = var3.readUnsignedByteNeg();
					var5 = var3.readUnsignedIntME();
					var24 = var3.readUnsignedByte();
					var25 = UrlRequester.widgetDefinition.method7476(var5);
					var25.field4206.method7533(var24, var22);
					class89.invalidateWidget(var25);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_SMOOTH_RESET == var1.serverPacket && isCameraLocked) {
					field449 = true;
					field587 = false;
					field553 = false;

					for (var22 = 0; var22 < 5; ++var22) {
						field610[var22] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3795 == var1.serverPacket) {
					var1.field1289 = var3.readShort();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VAR_CLAN_DISABLE == var1.serverPacket) {
					class256.field3085 = null;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SONG_STOP == var1.serverPacket) {
					var5 = var3.readUnsignedShortAdd();
					var22 = var3.readUnsignedShortLE();
					class257.method5884(var22, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3722 == var1.serverPacket) {
					var22 = var3.readUnsignedByte();
					var5 = var3.readUnsignedShortLE();
					var24 = var3.readUnsignedIntIME();
					var7 = Coord.method7413(var24);
					var26 = Coord.method7424(var24);
					var9 = Coord.method7415(var24);
					var10 = worldViewManager.method2345(var26, var9);
					var11 = var26 - var10.baseX;
					var29 = var9 - var10.baseY;
					if (var11 >= 0 && var29 >= 0 && var11 < var10.sizeX && var29 < var10.sizeY) {
						ArchiveLoader.method2091(var10, var7, var11, var29, var5, var22);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_LOOKAT == var1.serverPacket) {
					isCameraLocked = true;
					field449 = false;
					field587 = true;
					var22 = class216.method4818(var3.readShort() & 2027);
					var5 = IndexCheck.method6161(var3.readShort() & 2027);
					var24 = var3.readUnsignedShort();
					var7 = var3.readUnsignedByte();
					field477 = new class550(class401.cameraPitch, var5, var24, var7);
					field514 = new class550(WorldMapLabel.cameraYaw, var22, var24, var7);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3709 == var1.serverPacket) {
					ArchiveLoader.field860 = var3.readBoolean();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL == var1.serverPacket) {
					class163.field1873 = var3.readUnsignedByte();
					class148.field1756 = var3.readUnsignedByteNeg();
					overheadTextLimit = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_PRIVATE_ECHO == var1.serverPacket) {
					var52 = var3.readStringCp1252NullTerminated();
					var23 = AbstractFont.escapeBrackets(Calendar.method8130(ScriptEvent.method2145(var3)));
					Varcs.addGameMessage(6, var52, var23);
					var1.serverPacket = null;
					return true;
				}

				boolean var99;
				if (ServerPacket.CAM_MOVETO == var1.serverPacket) {
					isCameraLocked = true;
					field449 = false;
					field553 = true;
					KeyHandler.field114 = var3.readUnsignedByte();
					SequenceDefinition.field2487 = var3.readUnsignedByte();
					var22 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShort();
					field588 = var3.readBoolean();
					var24 = var3.readUnsignedByte();
					var7 = Coord.method7416(KeyHandler.field114);
					var26 = Coord.method7416(SequenceDefinition.field2487);
					boolean var66 = false;
					var99 = false;
					if (field588) {
						var9 = class174.cameraY;
						var27 = JagNetThread.getTileHeight(class333.topLevelWorldView, var7, var26, class333.topLevelWorldView.plane) - var22;
					} else {
						var9 = JagNetThread.getTileHeight(class333.topLevelWorldView, HealthBarDefinition.cameraX, HttpRequest.cameraZ, class333.topLevelWorldView.plane) - class174.cameraY;
						var27 = var22;
					}

					field589 = new class549(HealthBarDefinition.cameraX, HttpRequest.cameraZ, var9, var7, var26, var27, var5, var24);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOC_DEL == var1.serverPacket) {
					class211.method4600(class328.field3648);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.DYNAMICOBJECT_SPAWN == var1.serverPacket) {
					var9 = var3.readUnsignedByteNeg();
					var27 = var9 >> 2;
					var11 = var9 & 3;
					var29 = field320[var27];
					var13 = var3.readUnsignedShort();
					var24 = var3.readMedium();
					var22 = var24 >> 16;
					var5 = var24 >> 8 & 255;
					var7 = var22 + (var24 >> 4 & 7);
					var26 = var5 + (var24 & 7);
					if (0 <= var7 && var7 < 103 && 0 <= var26 && var26 < 103) {
						class172.method4086(var7, var26, var27, var11, var29, var13);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1 == var1.serverPacket) {
					return this.method819(var1);
				}

				if (ServerPacket.field3772 == var1.serverPacket) {
					ClanMate.field5394 = var3.readBoolean();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_INFO_SMALL_VIEWPORT == var1.serverPacket) {
					WorldMapSprite.updateNpcs(HttpHeaders.worldView, true, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETNPCHEAD_ACTIVE == var1.serverPacket) {
					var22 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedShortLE();
					var6 = UrlRequester.widgetDefinition.method7476(var22);
					if (var6.modelType != 6 || var5 != var6.modelId) {
						var6.modelType = 6;
						var6.modelId = var5;
						class89.invalidateWidget(var6);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3712 == var1.serverPacket) {
					var22 = var3.readShort();
					class518 var89 = (class518)class173.findEnumerated(AbstractUserComparator.method9969(), var3.readUnsignedByte());
					class516 var60 = (class516)class173.findEnumerated(Varps.method7406(), var3.readUnsignedByte());
					if (var22 == -2) {
						worldViewManager.method2362(var89, var60);
					} else {
						worldViewManager.method2351(var22, var89, var60);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_MODE == var1.serverPacket) {
					var22 = var3.readUnsignedByte();
					WorldMapDecorationType.method8170(var22);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.HINT_ARROW == var1.serverPacket) {
					hintArrowType = var3.readUnsignedByte();
					if (hintArrowType == 1) {
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) {
						if (hintArrowType == 2) {
							hintArrowSubX = 4096;
							hintArrowSubY = 4096;
						}

						if (hintArrowType == 3) {
							hintArrowSubX = 0;
							hintArrowSubY = 4096;
						}

						if (hintArrowType == 4) {
							hintArrowSubX = 8192;
							hintArrowSubY = 4096;
						}

						if (hintArrowType == 5) {
							hintArrowSubX = 4096;
							hintArrowSubY = 0;
						}

						if (hintArrowType == 6) {
							hintArrowSubX = 4096;
							hintArrowSubY = 8192;
						}

						hintArrowType = 2;
						hintArrowX = var3.readUnsignedShort();
						hintArrowY = var3.readUnsignedShort();
						hintArrowHeight = var3.readUnsignedByte() * 4;
					}

					if (hintArrowType == 10) {
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_FULL == var1.serverPacket) {
					var22 = var3.method1958();
					var5 = var3.readUnsignedShort();
					if (var22 < -70000) {
						var5 += 32768;
					}

					if (var22 >= 0) {
						var6 = UrlRequester.widgetDefinition.method7476(var22);
					} else {
						var6 = null;
					}

					if (var6 != null) {
						for (var7 = 0; var7 < var6.itemIds.length; ++var7) {
							var6.itemIds[var7] = 0;
							var6.itemQuantities[var7] = 0;
						}
					}

					SpriteBufferProperties.clearItemContainer(var5);
					var7 = var3.readUnsignedShort();

					for (var26 = 0; var26 < var7; ++var26) {
						var9 = var3.readUnsignedShortAdd();
						var27 = var3.readUnsignedByteNeg();
						if (var27 == 255) {
							var27 = var3.method1958();
						}

						if (var6 != null && var26 < var6.itemIds.length) {
							var6.itemIds[var26] = var9;
							var6.itemQuantities[var26] = var27;
						}

						class115.itemContainerSetItem(var5, var26, var9 - 1, var27);
					}

					if (var6 != null) {
						class89.invalidateWidget(var6);
					}

					Message.method768();
					changedItemContainers[++changedItemsCount - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3755 == var1.serverPacket) {
					var22 = var3.readUnsignedByteNeg();
					var5 = var3.readUnsignedShort();
					var24 = var3.readUnsignedIntLE();
					var7 = var3.readUnsignedByteSub();
					var26 = var3.readUnsignedShortAddLE();
					var9 = var3.readUnsignedIntME();
					var99 = var3.readUnsignedByteNeg() == 1;
					var11 = var3.readUnsignedShort();
					var29 = Coord.method7413(var9);
					var13 = Coord.method7424(var9);
					var82 = Coord.method7415(var9);
					var111 = worldViewManager.method2345(var13, var82);
					var16 = var13 - var111.baseX;
					var17 = var82 - var111.baseY;
					if (var16 >= 0 && var17 >= 0 && var16 < var111.sizeX && var17 < var111.sizeY) {
						FaceNormal.method5375(var111, var29, var16, var17, var5, var24, var7, var11, var26, var22, var99);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_SPOTANIM == var1.serverPacket) {
					var24 = var3.readUnsignedIntIME();
					var22 = var3.readUnsignedShort();
					Player var59;
					if (var22 == localPlayerIndex) {
						var59 = HealthBarUpdate.localPlayer;
					} else {
						var59 = (Player)HttpHeaders.worldView.players.get((long)var22);
					}

					var5 = var3.readUnsignedShortLE();
					var7 = var3.readUnsignedByte();
					if (var59 != null) {
						var59.updateSpotAnimation(var7, var5, var24 >> 16, var24 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_PLAYERMODEL_OBJ == var1.serverPacket) {
					var22 = var3.method1958();
					var5 = var3.method1958();
					var6 = UrlRequester.widgetDefinition.method7476(var22);
					var6.field4206.method7541(var5);
					class89.invalidateWidget(var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_ANIM_SPECIFIC == var1.serverPacket) {
					var22 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedByteNeg();
					if (var22 == 65535) {
						var22 = -1;
					}

					class163.performPlayerAnimation(HealthBarUpdate.localPlayer, var22, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_FRIENDS_CHAT == var1.serverPacket) {
					var96 = var3.readByte();
					var23 = var3.readStringCp1252NullTerminated();
					long var41 = (long)var3.readUnsignedShort();
					long var43 = (long)var3.readMedium();
					PlayerType var65 = (PlayerType)class173.findEnumerated(class446.PlayerType_values(), var3.readUnsignedByte());
					long var45 = (var41 << 32) + var43;
					boolean var78 = false;
					ClanChannel var47 = null;
					var47 = var96 >= 0 ? currentClanChannels[var96] : class86.guestClanChannel;
					if (var47 == null) {
						var78 = true;
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var65.isUser && ApproximateRouteStrategy.friendSystem.isIgnored(new Username(var23, PacketWriter.loginType))) {
									var78 = true;
								}
								break;
							}

							if (crossWorldMessageIds[var15] == var45) {
								var78 = true;
								break;
							}

							++var15;
						}
					}

					if (!var78) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var45;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var39 = AbstractFont.escapeBrackets(ScriptEvent.method2145(var3));
						var16 = var96 >= 0 ? 41 : 44;
						if (var65.modIcon != -1) {
							class109.addChatMessage(var16, ChatChannel.method2014(var65.modIcon) + var23, var39, var47.name);
						} else {
							class109.addChatMessage(var16, var23, var39, var47.name);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_STOP_TRANSIT == var1.serverPacket) {
					var22 = var3.readUnsignedShortAddLE();
					WorldMapElement.method4204(var22);
					changedItemContainers[++changedItemsCount - 1 & 31] = var22 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OBJ_OPFILTER == var1.serverPacket) {
					class211.method4600(class328.field3649);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3696 == var1.serverPacket) {
					WorldMapID.field3470 = var3.readBoolean();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETANIM == var1.serverPacket) {
					var22 = var3.readUnsignedIntLE();
					var5 = var3.readShortLE();
					var6 = UrlRequester.widgetDefinition.method7476(var22);
					if (var5 != var6.sequenceId || var5 == -1) {
						var6.sequenceId = var5;
						var6.modelFrame = 0;
						var6.modelFrameCycle = 0;
						class89.invalidateWidget(var6);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_IGNORELIST == var1.serverPacket) {
					ApproximateRouteStrategy.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					HttpRequestTask.FriendSystem_invalidateIgnoreds();
					field555 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_NORMAL == var1.serverPacket) {
					UserComparator7.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VARP_LARGE == var1.serverPacket) {
					var22 = var3.readUnsignedShortAddLE();
					var5 = var3.method1958();
					GrandExchangeOfferUnitPriceComparator.Varps_temp[var22] = var5;
					if (Varps.Varps_main[var22] != var5) {
						Varps.Varps_main[var22] = var5;
					}

					AbstractByteArrayCopier.changeGameOptions(var22);
					changedVarps[++changedVarpCount - 1 & 31] = var22;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_JINGLE == var1.serverPacket) {
					var22 = var3.readUnsignedShortLE();
					if (var22 == 65535) {
						var22 = -1;
					}

					var5 = var3.method11421();
					class175.method4117(var22, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_RESET == var1.serverPacket) {
					field449 = false;
					isCameraLocked = false;
					field553 = false;
					field587 = false;
					class169.field1909 = 0;
					class227.field2654 = 0;
					Buddy.field5413 = 0;
					field588 = false;
					class47.field687 = 0;
					class145.field1725 = 0;
					class282.field3290 = 0;
					class265.field3150 = 0;
					KeyHandler.field114 = 0;
					SequenceDefinition.field2487 = 0;
					GrandExchangeOffer.field5046 = 0;
					field589 = null;
					field477 = null;
					field514 = null;

					for (var22 = 0; var22 < 5; ++var22) {
						field610[var22] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3697 == var1.serverPacket) {
					var3.readLong();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VAR_CLAN_ENABLE == var1.serverPacket) {
					class256.field3085 = new class525(DynamicObject.field817);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_REBOOT_TIMER == var1.serverPacket) {
					rebootTimer = var3.readUnsignedShort() * 30;
					field561 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_SITE_SETTINGS == var1.serverPacket) {
					class352.method7391(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MINIMAP_TOGGLE == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3759 == var1.serverPacket) {
					field345 = var3.readStringCp1252NullTerminated();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETSCROLLPOS == var1.serverPacket) {
					var22 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShortAddLE();
					var6 = UrlRequester.widgetDefinition.method7476(var22);
					if (var6 != null && var6.type == 0) {
						if (var5 > var6.scrollHeight - var6.height * 1156037777) {
							var5 = var6.scrollHeight - var6.height * 1156037777;
						}

						if (var5 < 0) {
							var5 = 0;
						}

						if (var5 != var6.scrollY) {
							var6.scrollY = var5;
							class89.invalidateWidget(var6);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VAR_CLAN == var1.serverPacket) {
					if (class256.field3085 == null) {
						class256.field3085 = new class525(DynamicObject.field817);
					}

					class600 var54 = DynamicObject.field817.method10449(var3);
					class256.field3085.field5548.vmethod10878(var54.field5986, var54.field5985);
					field538[++field554 - 1 & 31] = var54.field5986;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOGOUT == var1.serverPacket) {
					var22 = var3.readUnsignedByte();
					class361.forceDisconnect(var22);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.RESET_ANIMS == var1.serverPacket) {
					Iterator var53 = HttpHeaders.worldView.players.iterator();

					while (var53.hasNext()) {
						Player var87 = (Player)var53.next();
						var87.method2472();
					}

					Iterator var88 = HttpHeaders.worldView.npcs.iterator();

					while (var88.hasNext()) {
						NPC var57 = (NPC)var88.next();
						var57.method2472();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_PLAYERMODEL_BODYTYPE == var1.serverPacket) {
					var22 = var3.readUnsignedIntLE();
					var5 = var3.readUnsignedByteAdd();
					var6 = UrlRequester.widgetDefinition.method7476(var22);
					var6.field4206.method7562(HealthBarUpdate.localPlayer.appearance.gender, var5);
					class89.invalidateWidget(var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.TRIGGER_ONDIALOG_ABORT == var1.serverPacket) {
					if (rootInterface != -1) {
						class142.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED == var1.serverPacket) {
					class148.field1756 = var3.readUnsignedByteSub();
					class163.field1873 = var3.readUnsignedByteSub();
					overheadTextLimit = var3.readUnsignedByteNeg();

					while (var3.offset * 1216585693 < var1.serverPacketLength) {
						var22 = var3.readUnsignedByte();
						class328 var86 = WorldMapIcon_1.method6393()[var22];
						class211.method4600(var86);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3762 == var1.serverPacket) {
					var22 = var3.readUnsignedIntLE();
					var5 = var3.readUnsignedIntLE();
					var24 = var3.readUnsignedShort();
					var7 = Coord.method7413(var5);
					var26 = Coord.method7424(var5);
					var9 = Coord.method7415(var5);
					var10 = worldViewManager.method2345(var26, var9);
					var11 = var26 - var10.baseX;
					var29 = var9 - var10.baseY;
					if (0 <= var11 && var11 < var10.sizeX && 0 <= var29 && var29 < var10.sizeY) {
						Occluder.method5384(var10, var7, var11, var29, var24, var22);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETANGLE == var1.serverPacket) {
					var22 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedShortAddLE();
					var24 = var3.readUnsignedShortAdd();
					var7 = var3.method1958();
					var8 = UrlRequester.widgetDefinition.method7476(var7);
					if (var22 != var8.modelAngleX || var5 != var8.modelAngleY || var24 != var8.modelZoom) {
						var8.modelAngleX = var22;
						var8.modelAngleY = var5;
						var8.modelZoom = var24;
						class89.invalidateWidget(var8);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_PRIVATE == var1.serverPacket) {
					var52 = var3.readStringCp1252NullTerminated();
					var30 = (long)var3.readUnsignedShort();
					var32 = (long)var3.readMedium();
					PlayerType var28 = (PlayerType)class173.findEnumerated(class446.PlayerType_values(), var3.readUnsignedByte());
					long var48 = (var30 << 32) + var32;
					var105 = false;

					for (var13 = 0; var13 < 100; ++var13) {
						if (var48 == crossWorldMessageIds[var13]) {
							var105 = true;
							break;
						}
					}

					if (ApproximateRouteStrategy.friendSystem.isIgnored(new Username(var52, PacketWriter.loginType))) {
						var105 = true;
					}

					if (!var105 && field341 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var48;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var40 = AbstractFont.escapeBrackets(Calendar.method8130(ScriptEvent.method2145(var3)));
						byte var14;
						if (var28.isPrivileged) {
							var14 = 7;
						} else {
							var14 = 3;
						}

						if (var28.modIcon != -1) {
							Varcs.addGameMessage(var14, ChatChannel.method2014(var28.modIcon) + var52, var40);
						} else {
							Varcs.addGameMessage(var14, var52, var40);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3800 == var1.serverPacket) {
					var22 = var3.readUnsignedShortLE();
					var5 = var3.method1958();
					var24 = var3.readUnsignedIntLE();
					var7 = var3.readUnsignedIntIME();
					var26 = Coord.method7413(var24);
					var9 = Coord.method7424(var24);
					var27 = Coord.method7415(var24);
					WorldView var36 = worldViewManager.method2345(var9, var27);
					var29 = var9 - var36.baseX;
					var13 = var27 - var36.baseY;
					if (var29 >= 0 && var13 >= 0 && var29 < var36.sizeX && var13 < var36.sizeY) {
						NPC.method2771(var36, var26, var29, var13, var22, var5, var7);
					}

					var1.serverPacket = null;
					return true;
				}

				class508.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1302 != null ? var1.field1302.id : -1) + "," + (var1.field1306 != null ? var1.field1306.id : -1) + "," + var1.serverPacketLength, (Throwable)null);
				class386.logOut();
			} catch (IOException var50) {
				class361.method7512();
			} catch (Exception var51) {
				var23 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1302 != null ? var1.field1302.id : -1) + "," + (var1.field1306 != null ? var1.field1306.id : -1) + "," + var1.serverPacketLength + "," + (HealthBarUpdate.localPlayer.pathX[0] + class333.topLevelWorldView.baseX) + "," + (HealthBarUpdate.localPlayer.pathY[0] + class333.topLevelWorldView.baseY) + ",";

				for (var24 = 0; var24 < var1.serverPacketLength && var24 < 50; ++var24) {
					var23 = var23 + var3.array[var24] + ",";
				}

				class508.RunException_sendStackTrace(var23, var51);
				class386.logOut();
			}

			return true;
		}
	}

	@ObfuscatedName("qa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "4"
	)
	@Export("menu")
	final void menu() {
		Menu var1 = menu;
		boolean var2 = false;

		int var3;
		while (!var2) {
			var2 = true;

			for (var3 = 0; var3 < var1.menuOptionsCount - 1; ++var3) {
				if (var1.menuOpcodes[var3] < 1000 && var1.menuOpcodes[var3 + 1] > 1000) {
					String var9 = var1.menuTargets[var3];
					var1.menuTargets[var3] = var1.menuTargets[var3 + 1];
					var1.menuTargets[var3 + 1] = var9;
					String var5 = var1.menuActions[var3];
					var1.menuActions[var3] = var1.menuActions[var3 + 1];
					var1.menuActions[var3 + 1] = var5;
					Menu var6 = var1.subMenus[var3];
					var1.subMenus[var3] = var1.subMenus[var3 + 1];
					var1.subMenus[var3 + 1] = var6;
					int var7 = var1.menuOpcodes[var3];
					var1.menuOpcodes[var3] = var1.menuOpcodes[var3 + 1];
					var1.menuOpcodes[var3 + 1] = var7;
					var7 = var1.menuArguments1[var3];
					var1.menuArguments1[var3] = var1.menuArguments1[var3 + 1];
					var1.menuArguments1[var3 + 1] = var7;
					var7 = var1.menuArguments2[var3];
					var1.menuArguments2[var3] = var1.menuArguments2[var3 + 1];
					var1.menuArguments2[var3 + 1] = var7;
					var7 = var1.menuIdentifiers[var3];
					var1.menuIdentifiers[var3] = var1.menuIdentifiers[var3 + 1];
					var1.menuIdentifiers[var3 + 1] = var7;
					var7 = var1.menuItemIds[var3];
					var1.menuItemIds[var3] = var1.menuItemIds[var3 + 1];
					var1.menuItemIds[var3 + 1] = var7;
					var7 = var1.menuWorldViewIds[var3];
					var1.menuWorldViewIds[var3] = var1.menuWorldViewIds[var3 + 1];
					var1.menuWorldViewIds[var3 + 1] = var7;
					boolean var8 = var1.menuShiftClick[var3];
					var1.menuShiftClick[var3] = var1.menuShiftClick[var3 + 1];
					var1.menuShiftClick[var3 + 1] = var8;
					var2 = false;
				}
			}
		}

		if (clickedWidget == null) {
			int var10 = MouseHandler.MouseHandler_lastButton;
			if (isMenuOpen) {
				if (var10 != 1 && (class423.mouseCam || var10 != 4) && !menu.method11900(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y)) {
					isMenuOpen = false;
					menu.invalidateWidgetsUnder();
				}

				if (var10 == 1 || !class423.mouseCam && var10 == 4) {
					menu.method11865(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					isMenuOpen = false;
					menu.invalidateWidgetsUnder();
				}
			} else if (menu.menuOptionsCount > 0) {
				var3 = menu.menuOptionsCount - 1;
				if ((var10 == 1 || !class423.mouseCam && var10 == 4) && this.shouldLeftClickOpenMenu(menu.menuOpcodes[var3], menu.menuShiftClick[var3])) {
					var10 = 2;
				}

				if (var10 == 1 || !class423.mouseCam && var10 == 4) {
					menu.method11863(var3);
				}

				if (var10 == 2) {
					this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}
			}

		}
	}

	@ObfuscatedName("qw")
	@ObfuscatedSignature(
		descriptor = "(IZI)Z",
		garbageValue = "2004399093"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu(int var1, boolean var2) {
		return (leftClickOpensMenu && menu.menuOptionsCount > 2 || class458.method9209(var1)) && !var2;
	}

	@ObfuscatedName("qj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-947741171"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		menu.method11868(var1, var2);
		Iterator var3 = worldViewManager.iterator();

		while (var3.hasNext()) {
			WorldView var4 = (WorldView)var3.next();
			var4.scene.menuOpen(false);
		}

		isMenuOpen = true;
		menu.method11888();
	}

	@ObfuscatedName("qc")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-331950936"
	)
	final void method1351(boolean var1) {
		class382.method8179(rootInterface, GameEngine.canvasWidth, class396.canvasHeight, var1);
	}

	@ObfuscatedName("qz")
	@ObfuscatedSignature(
		descriptor = "(Loi;B)V",
		garbageValue = "-124"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var4 = var1.parentId == -1 ? null : UrlRequester.widgetDefinition.getWidgetChild(var1.parentId, var1.field4165);
		int var2;
		int var3;
		if (var4 == null) {
			var2 = GameEngine.canvasWidth;
			var3 = class396.canvasHeight;
		} else {
			var2 = var4.width * 469894397;
			var3 = var4.height * 1156037777;
		}

		SpriteMask.alignWidgetSize(var1, var2, var3, false);
		WallDecoration.alignWidgetPosition(var1, var2, var3);
	}

	@ObfuscatedName("qh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "117"
	)
	final void method907() {
		class89.invalidateWidget(clickedWidget);
		++PendingSpawn.widgetDragDuration;
		int var1;
		int var2;
		if (field543 && field540) {
			var1 = MouseHandler.MouseHandler_x;
			var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field541) {
				var1 = field541;
			}

			if (var1 + clickedWidget.width * 469894397 > clickedWidgetParent.width * 469894397 + field541) {
				var1 = clickedWidgetParent.width * 469894397 + field541 - clickedWidget.width * 469894397;
			}

			if (var2 < field542) {
				var2 = field542;
			}

			if (var2 + clickedWidget.height * 1156037777 > clickedWidgetParent.height * 1156037777 + field542) {
				var2 = clickedWidgetParent.height * 1156037777 + field542 - clickedWidget.height * 1156037777;
			}

			int var3 = var1 - field544;
			int var4 = var2 - field545;
			int var5 = clickedWidget.dragZoneSize;
			if (PendingSpawn.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}

			int var6 = var1 - field541 + clickedWidgetParent.scrollX;
			int var7 = var2 - field542 + clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = clickedWidget.onDrag;
				PacketBufferNode.runScriptEvent(var8);
			}

			if (MouseHandler.MouseHandler_currentButton == 0) {
				if (isDraggingWidget) {
					if (clickedWidget.onDragComplete != null) {
						var8 = new ScriptEvent();
						var8.widget = clickedWidget;
						var8.mouseX = var6;
						var8.mouseY = var7;
						var8.dragTarget = draggedOnWidget;
						var8.args = clickedWidget.onDragComplete;
						PacketBufferNode.runScriptEvent(var8);
					}

					if (draggedOnWidget != null && class207.method4518(clickedWidget) != null) {
						PacketBufferNode var13 = UserComparator6.getPacketBufferNode(ClientPacket.OPHELDD, packetWriter.isaacCipher);
						var13.packetBuffer.writeShortAdd(clickedWidget.itemId);
						var13.packetBuffer.writeIntLE(clickedWidget.id);
						var13.packetBuffer.writeShortAdd(draggedOnWidget.childIndex * -217986249);
						var13.packetBuffer.writeShortAddLE(clickedWidget.childIndex * -217986249);
						var13.packetBuffer.writeShortLE(draggedOnWidget.itemId);
						var13.packetBuffer.writeIntIME(draggedOnWidget.id);
						packetWriter.addNode(var13);
					}
				} else if (class537.tempMenuAction != null && !this.shouldLeftClickOpenMenu(class537.tempMenuAction.opcode, class537.tempMenuAction.field720)) {
					if (menu.menuOptionsCount > 0) {
						int var11 = widgetClickX + field544;
						int var9 = widgetClickY + field545;
						MenuAction var10 = class537.tempMenuAction;
						if (var10 != null) {
							ByteArrayPool.menuAction(var10.param0, var10.param1, var10.opcode, var10.identifier, var10.itemId, var10.worldViewId, var10.action, var10.target, var11, var9);
						}

						class537.tempMenuAction = null;
					}
				} else {
					this.openMenu(widgetClickX + field544, widgetClickY + field545);
				}

				clickedWidget = null;
			}

		} else {
			if (PendingSpawn.widgetDragDuration > 1) {
				if (!isDraggingWidget && menu.menuOptionsCount > 0) {
					var1 = widgetClickX + field544;
					var2 = widgetClickY + field545;
					MenuAction var12 = class537.tempMenuAction;
					if (var12 != null) {
						ByteArrayPool.menuAction(var12.param0, var12.param1, var12.opcode, var12.identifier, var12.itemId, var12.worldViewId, var12.action, var12.target, var1, var2);
					}

					class537.tempMenuAction = null;
				}

				clickedWidget = null;
			}

		}
	}

	@ObfuscatedName("qy")
	@ObfuscatedSignature(
		descriptor = "(I)Lxa;",
		garbageValue = "-768699461"
	)
	@Export("username")
	public Username username() {
		return HealthBarUpdate.localPlayer != null ? HealthBarUpdate.localPlayer.username : null;
	}

	@ObfuscatedName("qd")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "8"
	)
	void method830(int var1) {
		PacketBufferNode var2 = UserComparator6.getPacketBufferNode(ClientPacket.CLAN_CHANNEL_FULL_REQUEST, packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(var1);
		packetWriter.addNode(var2);
	}

	@ObfuscatedName("qu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1104271505"
	)
	void method831(int var1) {
		PacketBufferNode var2 = UserComparator6.getPacketBufferNode(ClientPacket.CLAN_SETTINGS_FULL_REQUEST, packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(var1);
		packetWriter.addNode(var2);
	}

	public final void init() {
		try {
			if (this.checkHost()) {
				for (int var1 = 0; var1 <= 28; ++var1) {
					String var2 = this.getParameter(Integer.toString(var1));
					if (var2 != null) {
						switch(var1) {
						case 3:
							if (var2.equalsIgnoreCase("true")) {
								isMembersWorld = true;
							} else {
								isMembersWorld = false;
							}
							break;
						case 4:
							if (clientType == -1) {
								clientType = Integer.parseInt(var2);
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2);
							break;
						case 6:
							ViewportMouse.clientLanguage = Language.method8648(Integer.parseInt(var2));
							break;
						case 7:
							class488.field5353 = HttpRequestTask.method299(Integer.parseInt(var2));
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) {
							}
							break;
						case 9:
							SoundSystem.field1372 = var2;
							break;
						case 10:
							class429.field5084 = (StudioGame)class173.findEnumerated(class68.method2166(), Integer.parseInt(var2));
							if (StudioGame.oldscape == class429.field5084) {
								PacketWriter.loginType = LoginType.oldscape;
							} else {
								PacketWriter.loginType = LoginType.field5769;
							}
							break;
						case 11:
							class133.authServiceBaseUrl = var2;
							break;
						case 12:
							worldId = Integer.parseInt(var2);
						case 13:
						case 16:
						case 18:
						case 19:
						case 20:
						case 23:
						case 24:
						default:
							break;
						case 14:
							class293.field3392 = Integer.parseInt(var2);
							break;
						case 15:
							gameBuild = Integer.parseInt(var2);
							break;
						case 17:
							class268.field3179 = var2;
							break;
						case 21:
							field388 = Integer.parseInt(var2);
							break;
						case 22:
							class276.gameSessionServiceBaseUrl = var2;
							break;
						case 25:
							int var3 = var2.indexOf(".");
							if (var3 == -1) {
								class585.field5890 = Integer.parseInt(var2);
							} else {
								class585.field5890 = Integer.parseInt(var2.substring(0, var3));
								Integer.parseInt(var2.substring(var3 + 1));
							}
						}
					}
				}

				class170.method4057();
				MouseHandler.worldHost = this.getCodeBase().getHost();
				WorldMapSectionType.field3418 = new JagNetThread();
				String var4 = class488.field5353.name;
				byte var5 = 0;
				if ((worldProperties & class582.field5865.rsOrdinal()) != 0) {
					WorldMapElement.field1997 = "beta";
				}

				try {
					class27.method412("oldschool", WorldMapElement.field1997, var4, var5, 25);
				} catch (Exception var7) {
					class508.RunException_sendStackTrace((String)null, var7);
				}

				class521.client = this;
				RunException.field6089 = clientType;
				AsyncRestClient.method188();
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
					this.https = true;
				}

				if (field390 == -1) {
					if (!this.containsAccessAndRefreshToken() && !this.containsSessionAndCharacterId()) {
						field390 = 0;
					} else {
						field390 = 5;
					}
				}

				this.startThread(765, 503, 233, 1);
			}
		} catch (RuntimeException var8) {
			throw RestClientThreadFactory.newRunException(var8, "client.init(" + ')');
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V"
	)
	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) {
			this.otlTokenRequester = var1;
			ClientPreferences.method2677(10);
		}
	}

	public boolean isOnLoginScreen() {
		return gameState == 10;
	}

	public long getAccountHash() {
		return this.accountHash;
	}

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) {
			this.refreshAccessTokenRequester = var1;
		}
	}

	protected void finalize() throws Throwable {
		class339.field3893.remove(this);
		super.finalize();
	}

	public void setClient(int var1) {
		this.clientId = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1720609329"
	)
	public static void method1114() {
		class179.field1913.clear();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Liy;",
		garbageValue = "2"
	)
	public static FloorOverlayDefinition method1287(int var0) {
		FloorOverlayDefinition var1 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class181.FloorOverlayDefinition_archive.takeFile(4, var0);
			var1 = new FloorOverlayDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode();
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-13"
	)
	public static int method1134(int var0) {
		return class336.field3845[var0];
	}
}
