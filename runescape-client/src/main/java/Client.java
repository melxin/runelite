import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenRequester;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONException;
import org.json.JSONObject;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed, OAuthApi, class344 {
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lds;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	static final class281 field297;
	@ObfuscatedName("dj")
	@Export("BASIC_AUTH_DESKTOP_OSRS")
	static final String BASIC_AUTH_DESKTOP_OSRS;
	@ObfuscatedName("dp")
	@Export("BASIC_AUTH_DESKTOP_RUNELITE")
	static final String BASIC_AUTH_DESKTOP_RUNELITE;
	@ObfuscatedName("eg")
	static final int[] field351;
	@ObfuscatedName("ea")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	@Export("playerAppearance")
	static final PlayerComposition playerAppearance;
	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "Lbp;"
	)
	static final ApproximateRouteStrategy field303;
	@ObfuscatedName("fu")
	static boolean field435;
	@ObfuscatedName("fk")
	@ObfuscatedGetter(
		intValue = 192099
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("fr")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("fd")
	@ObfuscatedGetter(
		intValue = 594629097
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("fc")
	@ObfuscatedGetter(
		intValue = -1149647067
	)
	@Export("cycle")
	public static int cycle;
	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	@Export("authenticationScheme")
	static AuthenticationScheme authenticationScheme;
	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "Lwz;"
	)
	static class593 field310;
	@ObfuscatedName("fe")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("fs")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "Lcr;"
	)
	@Export("worldViewManager")
	public static final WorldViewManager worldViewManager;
	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	@Export("playerUpdateManager")
	static PlayerUpdateManager playerUpdateManager;
	@ObfuscatedName("gb")
	@ObfuscatedGetter(
		intValue = -945043031
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("ge")
	@ObfuscatedGetter(
		intValue = 2114333311
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("gh")
	@ObfuscatedGetter(
		intValue = -801390087
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("ga")
	@ObfuscatedGetter(
		intValue = -1704846899
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("gl")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("gs")
	@ObfuscatedGetter(
		intValue = -1410398771
	)
	static int field321;
	@ObfuscatedName("gz")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("gy")
	@ObfuscatedGetter(
		intValue = 695919107
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("gc")
	@ObfuscatedGetter(
		intValue = 2006264955
	)
	static int field463;
	@ObfuscatedName("gu")
	static String field325;
	@ObfuscatedName("gr")
	@ObfuscatedGetter(
		intValue = 2110948989
	)
	@Export("currentWorldViewId")
	static int currentWorldViewId;
	@ObfuscatedName("gg")
	@ObfuscatedGetter(
		intValue = 996243437
	)
	static int field327;
	@ObfuscatedName("gw")
	@ObfuscatedGetter(
		intValue = 1573794335
	)
	static int field328;
	@ObfuscatedName("gm")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("gx")
	@ObfuscatedGetter(
		intValue = 393281325
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("gf")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("gq")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("gd")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("gk")
	static int[] field334;
	@ObfuscatedName("hm")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("ha")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("hs")
	@ObfuscatedGetter(
		intValue = 202116745
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("ho")
	@ObfuscatedGetter(
		longValue = -5937227232655119603L
	)
	static long field502;
	@ObfuscatedName("hq")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("hv")
	@ObfuscatedGetter(
		intValue = -28056717
	)
	static int field341;
	@ObfuscatedName("hk")
	@ObfuscatedGetter(
		intValue = -1897551555
	)
	@Export("revision")
	public static int revision;
	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("indexCheck")
	static IndexCheck indexCheck;
	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	static class271 field491;
	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "[Lgh;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "[Lgr;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("hj")
	static short field347;
	@ObfuscatedName("hz")
	static short field348;
	@ObfuscatedName("hi")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("hc")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("hb")
	static short field458;
	@ObfuscatedName("hw")
	static short field352;
	@ObfuscatedName("hx")
	static short field353;
	@ObfuscatedName("iq")
	static short field354;
	@ObfuscatedName("iv")
	@ObfuscatedGetter(
		intValue = 1859672625
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("iw")
	@ObfuscatedGetter(
		intValue = 1685595557
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("ia")
	@ObfuscatedGetter(
		intValue = 1286483331
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("ig")
	@ObfuscatedGetter(
		intValue = 991579481
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("it")
	static String field485;
	@ObfuscatedName("ij")
	@ObfuscatedGetter(
		intValue = -1139461277
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "[Lqe;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "Lbh;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("ic")
	@ObfuscatedGetter(
		intValue = 1364252151
	)
	static int field362;
	@ObfuscatedName("ih")
	@ObfuscatedGetter(
		intValue = -1109882301
	)
	public static int field363;
	@ObfuscatedName("is")
	@ObfuscatedGetter(
		intValue = -346387753
	)
	static int field364;
	@ObfuscatedName("iu")
	@ObfuscatedGetter(
		intValue = 1646404779
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("il")
	@ObfuscatedGetter(
		intValue = -112636545
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("ja")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("jq")
	@ObfuscatedGetter(
		intValue = 1234672651
	)
	static int field368;
	@ObfuscatedName("jj")
	@ObfuscatedGetter(
		intValue = 626734091
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("js")
	@ObfuscatedGetter(
		intValue = -2116020155
	)
	static int field370;
	@ObfuscatedName("jw")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("jl")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("jo")
	@ObfuscatedGetter(
		intValue = 2065057205
	)
	@Export("serverCycle")
	static int serverCycle;
	@ObfuscatedName("jg")
	@ObfuscatedGetter(
		longValue = 1905356474365644959L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("ji")
	@ObfuscatedGetter(
		intValue = -1545917535
	)
	static int field375;
	@ObfuscatedName("jm")
	@ObfuscatedGetter(
		intValue = 758253571
	)
	static int field339;
	@ObfuscatedName("jk")
	@ObfuscatedGetter(
		longValue = 7534348655667279763L
	)
	static long field384;
	@ObfuscatedName("ju")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("jx")
	@ObfuscatedGetter(
		intValue = -895756791
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("jy")
	@Export("z")
	static boolean z;
	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	static class69 field443;
	@ObfuscatedName("jt")
	@ObfuscatedGetter(
		intValue = -1566839861
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("kh")
	@ObfuscatedGetter(
		intValue = 1463298467
	)
	static int field383;
	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	static Archive field376;
	@ObfuscatedName("ka")
	@ObfuscatedGetter(
		intValue = -293288301
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("lz")
	@ObfuscatedGetter(
		intValue = 2115313415
	)
	static int field386;
	@ObfuscatedName("lt")
	@ObfuscatedGetter(
		intValue = -22260137
	)
	static int field387;
	@ObfuscatedName("lh")
	@ObfuscatedGetter(
		intValue = 1144664339
	)
	static int field465;
	@ObfuscatedName("lq")
	@ObfuscatedGetter(
		intValue = 354855273
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = -316632971
	)
	static int field390;
	@ObfuscatedName("lf")
	@ObfuscatedGetter(
		intValue = -206421147
	)
	static int field391;
	@ObfuscatedName("ln")
	@ObfuscatedGetter(
		intValue = -319200521
	)
	static int field392;
	@ObfuscatedName("ll")
	@ObfuscatedGetter(
		intValue = -834789127
	)
	static int field393;
	@ObfuscatedName("lg")
	@ObfuscatedGetter(
		intValue = 605998983
	)
	static int field394;
	@ObfuscatedName("mu")
	@ObfuscatedGetter(
		intValue = 1231950007
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("mg")
	@ObfuscatedGetter(
		intValue = -2134462057
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("my")
	@ObfuscatedGetter(
		intValue = 249680021
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("mi")
	@ObfuscatedGetter(
		intValue = -1995063077
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("me")
	@ObfuscatedGetter(
		intValue = -474026595
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("ms")
	@ObfuscatedGetter(
		intValue = -981639461
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("mo")
	@ObfuscatedGetter(
		intValue = -1118109071
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("ml")
	@ObfuscatedGetter(
		intValue = -1225815769
	)
	static int field403;
	@ObfuscatedName("mz")
	@ObfuscatedGetter(
		intValue = -1927574661
	)
	static int field404;
	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("mk")
	@ObfuscatedGetter(
		intValue = 1327771585
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("mn")
	@ObfuscatedGetter(
		intValue = 194824073
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("mr")
	@ObfuscatedGetter(
		intValue = -164453967
	)
	@Export("staffModLevel")
	static int staffModLevel;
	@ObfuscatedName("mw")
	@ObfuscatedGetter(
		intValue = -1983100829
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("mv")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("mj")
	@ObfuscatedGetter(
		intValue = 1963386881
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("mc")
	@ObfuscatedGetter(
		intValue = 1310712637
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("md")
	@ObfuscatedGetter(
		intValue = 1370924433
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	@Export("scriptEvents2")
	static NodeDeque scriptEvents2;
	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	@Export("scriptEvents3")
	static NodeDeque scriptEvents3;
	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	static NodeDeque field360;
	@ObfuscatedName("nj")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("nq")
	@ObfuscatedGetter(
		intValue = 502589423
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("nb")
	@ObfuscatedGetter(
		intValue = 112663095
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("nu")
	static String field427;
	@ObfuscatedName("nv")
	@ObfuscatedGetter(
		intValue = 25227435
	)
	static int field434;
	@ObfuscatedName("nl")
	static int[] field423;
	@ObfuscatedName("nc")
	static int[] field568;
	@ObfuscatedName("no")
	@ObfuscatedGetter(
		longValue = -22867067092897807L
	)
	static long field425;
	@ObfuscatedName("ng")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	static class556 field472;
	@ObfuscatedName("nf")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("nr")
	static boolean field429;
	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("DBTableIndex_cache")
	static EvictingDualNodeHashTable DBTableIndex_cache;
	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("archive11")
	static EvictingDualNodeHashTable archive11;
	@ObfuscatedName("nx")
	static boolean field476;
	@ObfuscatedName("np")
	static boolean field433;
	@ObfuscatedName("ni")
	static boolean field330;
	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	@Export("hintArrow")
	static final HintArrow hintArrow;
	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("od")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("oo")
	static int[] field439;
	@ObfuscatedName("or")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("ov")
	@ObfuscatedGetter(
		intValue = -1669722705
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("ox")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("oz")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("pn")
	static int[][][] field445;
	@ObfuscatedName("ph")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("py")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("pi")
	@ObfuscatedGetter(
		intValue = 559710253
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("pm")
	@ObfuscatedGetter(
		intValue = 1802328601
	)
	@Export("graphicsCycle")
	static int graphicsCycle;
	@ObfuscatedName("pd")
	@ObfuscatedGetter(
		intValue = -1747234403
	)
	static int field450;
	@ObfuscatedName("pz")
	@ObfuscatedGetter(
		intValue = -1879184549
	)
	static int field451;
	@ObfuscatedName("pf")
	@ObfuscatedGetter(
		intValue = -489842587
	)
	static int field452;
	@ObfuscatedName("pl")
	@ObfuscatedGetter(
		intValue = 657868513
	)
	static int field366;
	@ObfuscatedName("ql")
	static boolean field454;
	@ObfuscatedName("qk")
	@ObfuscatedGetter(
		intValue = -1432753275
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("qu")
	@ObfuscatedGetter(
		intValue = -660368211
	)
	static int field456;
	@ObfuscatedName("qi")
	@ObfuscatedGetter(
		intValue = -1567167703
	)
	static int field432;
	@ObfuscatedName("qb")
	@ObfuscatedGetter(
		intValue = 145065913
	)
	static int field566;
	@ObfuscatedName("qw")
	@ObfuscatedGetter(
		intValue = 1950129479
	)
	static int field459;
	@ObfuscatedName("qa")
	static boolean field440;
	@ObfuscatedName("qp")
	@ObfuscatedGetter(
		intValue = 177770875
	)
	static int field461;
	@ObfuscatedName("qn")
	static boolean field371;
	@ObfuscatedName("qs")
	@ObfuscatedGetter(
		intValue = -54546357
	)
	static int field516;
	@ObfuscatedName("qr")
	@ObfuscatedGetter(
		intValue = 2070755417
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("qd")
	@ObfuscatedGetter(
		intValue = 203842615
	)
	static int field444;
	@ObfuscatedName("qq")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("qg")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("qc")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("qf")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("qt")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("qh")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("qx")
	static int[][] field501;
	@ObfuscatedName("qz")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("qy")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("qv")
	@ObfuscatedGetter(
		intValue = -1150390511
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("qj")
	@ObfuscatedGetter(
		intValue = -995717877
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("rv")
	@ObfuscatedGetter(
		intValue = 1951337775
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("rp")
	@ObfuscatedGetter(
		intValue = -552029901
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("rk")
	@ObfuscatedGetter(
		intValue = -124216983
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("rf")
	@ObfuscatedGetter(
		intValue = 1302281700
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("rx")
	@ObfuscatedGetter(
		intValue = -1393165735
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("re")
	@ObfuscatedGetter(
		longValue = 7453879791624507373L
	)
	@Export("userId")
	static long userId;
	@ObfuscatedName("rt")
	@ObfuscatedGetter(
		longValue = 6521835877996738533L
	)
	@Export("userHash")
	static long userHash;
	@ObfuscatedName("rz")
	@ObfuscatedGetter(
		intValue = -986859555
	)
	static int field484;
	@ObfuscatedName("rr")
	@ObfuscatedGetter(
		intValue = -1493763175
	)
	static int field572;
	@ObfuscatedName("rb")
	@ObfuscatedGetter(
		intValue = 1951668287
	)
	static int field377;
	@ObfuscatedName("rn")
	@ObfuscatedGetter(
		intValue = -388926597
	)
	static int field487;
	@ObfuscatedName("rc")
	static int[] field488;
	@ObfuscatedName("rj")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("rq")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("ri")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("rs")
	@ObfuscatedGetter(
		intValue = 5286717
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("rg")
	@Export("leftClickOpensMenu")
	static boolean leftClickOpensMenu;
	@ObfuscatedName("rd")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("rh")
	@ObfuscatedSignature(
		descriptor = "Lxx;"
	)
	@Export("menu")
	static Menu menu;
	@ObfuscatedName("ru")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("ro")
	@ObfuscatedGetter(
		intValue = -288972531
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("ry")
	@ObfuscatedGetter(
		intValue = 1041918155
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("ss")
	@ObfuscatedGetter(
		intValue = 738745885
	)
	static int field499;
	@ObfuscatedName("su")
	@ObfuscatedGetter(
		intValue = 257347845
	)
	static int field500;
	@ObfuscatedName("si")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("sw")
	@ObfuscatedGetter(
		intValue = 1640977507
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("sm")
	@ObfuscatedGetter(
		intValue = 1692131643
	)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("sk")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("sa")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("so")
	@ObfuscatedGetter(
		intValue = 456787877
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("se")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("clickedWidget")
	public static Widget clickedWidget;
	@ObfuscatedName("sj")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("sb")
	@ObfuscatedGetter(
		intValue = 509124701
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("sr")
	@ObfuscatedGetter(
		intValue = 949625891
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("sl")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("sx")
	static boolean field513;
	@ObfuscatedName("sv")
	@ObfuscatedGetter(
		intValue = -464414341
	)
	static int field514;
	@ObfuscatedName("sf")
	@ObfuscatedGetter(
		intValue = 1658569677
	)
	static int field515;
	@ObfuscatedName("sc")
	static boolean field411;
	@ObfuscatedName("sp")
	@ObfuscatedGetter(
		intValue = -364781525
	)
	static int field537;
	@ObfuscatedName("sq")
	@ObfuscatedGetter(
		intValue = -1107506441
	)
	static int field589;
	@ObfuscatedName("sg")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("tk")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("ty")
	@ObfuscatedGetter(
		intValue = 1404370781
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("tw")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("th")
	@ObfuscatedGetter(
		intValue = -563729351
	)
	@Export("changedItemsCount")
	static int changedItemsCount;
	@ObfuscatedName("tu")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("ti")
	@ObfuscatedGetter(
		intValue = -1381736529
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("tg")
	static int[] field526;
	@ObfuscatedName("tx")
	@ObfuscatedGetter(
		intValue = 1548820347
	)
	static int field527;
	@ObfuscatedName("ta")
	@ObfuscatedGetter(
		intValue = 1244215685
	)
	static int field470;
	@ObfuscatedName("tq")
	@ObfuscatedGetter(
		intValue = -1244040157
	)
	static int field529;
	@ObfuscatedName("tr")
	@ObfuscatedGetter(
		intValue = -65534857
	)
	static int field530;
	@ObfuscatedName("tc")
	@ObfuscatedGetter(
		intValue = -1189374583
	)
	static int field531;
	@ObfuscatedName("tf")
	@ObfuscatedGetter(
		intValue = 1045775469
	)
	static int field532;
	@ObfuscatedName("te")
	@ObfuscatedGetter(
		intValue = -1909044791
	)
	static int field446;
	@ObfuscatedName("tb")
	@ObfuscatedGetter(
		intValue = 2014722803
	)
	static int field428;
	@ObfuscatedName("tv")
	@ObfuscatedSignature(
		descriptor = "Lxd;"
	)
	static class606 field535;
	@ObfuscatedName("td")
	@ObfuscatedGetter(
		intValue = -1072873385
	)
	@Export("rootWidgetCount")
	public static int rootWidgetCount;
	@ObfuscatedName("tj")
	@ObfuscatedGetter(
		intValue = -888749943
	)
	static int field533;
	@ObfuscatedName("ts")
	@Export("validRootWidgets")
	public static boolean[] validRootWidgets;
	@ObfuscatedName("tn")
	static boolean[] field539;
	@ObfuscatedName("tl")
	static boolean[] field540;
	@ObfuscatedName("to")
	@Export("rootWidgetXs")
	public static int[] rootWidgetXs;
	@ObfuscatedName("tz")
	@Export("rootWidgetYs")
	public static int[] rootWidgetYs;
	@ObfuscatedName("uj")
	@Export("rootWidgetWidths")
	public static int[] rootWidgetWidths;
	@ObfuscatedName("un")
	@Export("rootWidgetHeights")
	public static int[] rootWidgetHeights;
	@ObfuscatedName("uo")
	@ObfuscatedGetter(
		intValue = -1185763277
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("uk")
	static int[] field546;
	@ObfuscatedName("ul")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("uf")
	@ObfuscatedGetter(
		intValue = -1425425779
	)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("ua")
	@ObfuscatedGetter(
		intValue = 343231997
	)
	static int field549;
	@ObfuscatedName("uw")
	@ObfuscatedGetter(
		intValue = -16749031
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("ub")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("uq")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("ur")
	@ObfuscatedSignature(
		descriptor = "[Lxl;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("uc")
	@ObfuscatedGetter(
		intValue = -1846625771
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("uh")
	@ObfuscatedGetter(
		intValue = 557279513
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("up")
	@ObfuscatedGetter(
		intValue = -1091366547
	)
	static int field565;
	@ObfuscatedName("ui")
	@ObfuscatedGetter(
		intValue = 1784014281
	)
	static int field557;
	@ObfuscatedName("us")
	@ObfuscatedGetter(
		intValue = 1502231355
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("uz")
	static boolean field559;
	@ObfuscatedName("vf")
	static boolean field560;
	@ObfuscatedName("vr")
	static boolean field561;
	@ObfuscatedName("ve")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	static class549 field494;
	@ObfuscatedName("vq")
	@ObfuscatedSignature(
		descriptor = "Lvw;"
	)
	static class548 field378;
	@ObfuscatedName("vn")
	@ObfuscatedSignature(
		descriptor = "Lvw;"
	)
	static class548 field564;
	@ObfuscatedName("vm")
	static boolean[] field583;
	@ObfuscatedName("vl")
	static int[] field453;
	@ObfuscatedName("vp")
	static int[] field567;
	@ObfuscatedName("vy")
	static int[] field323;
	@ObfuscatedName("va")
	static int[] field569;
	@ObfuscatedName("vv")
	@ObfuscatedGetter(
		intValue = 917391669
	)
	static int field570;
	@ObfuscatedName("vb")
	@ObfuscatedGetter(
		intValue = -863978887
	)
	static int field350;
	@ObfuscatedName("vu")
	@ObfuscatedSignature(
		descriptor = "Luz;"
	)
	static class545 field528;
	@ObfuscatedName("vj")
	@ObfuscatedSignature(
		descriptor = "Lsf;"
	)
	static class488 field473;
	@ObfuscatedName("wv")
	static List field595;
	@ObfuscatedName("wd")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("wa")
	@ObfuscatedGetter(
		intValue = -2132558783
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("wm")
	@ObfuscatedGetter(
		intValue = 12109557
	)
	static int field520;
	@ObfuscatedName("wx")
	static int[] field578;
	@ObfuscatedName("wu")
	static int[] field579;
	@ObfuscatedName("wo")
	@Export("token")
	String token;
	@ObfuscatedName("wi")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	@Export("asyncRestClient")
	AsyncRestClient asyncRestClient;
	@ObfuscatedName("wf")
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	@Export("asyncGameSessionTokenResponse")
	AsyncHttpResponse asyncGameSessionTokenResponse;
	@ObfuscatedName("ws")
	@Export("otlTokenRequester")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/OtlTokenRequester;"
	)
	OtlTokenRequester otlTokenRequester;
	@ObfuscatedName("wq")
	@Export("otlTokenRequestFuture")
	Future otlTokenRequestFuture;
	@ObfuscatedName("wh")
	@Export("https")
	boolean https;
	@ObfuscatedName("wc")
	@ObfuscatedGetter(
		intValue = -29552717
	)
	@Export("clientId")
	int clientId;
	@ObfuscatedName("wn")
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	@Export("asyncAccessTokenResponse")
	AsyncHttpResponse asyncAccessTokenResponse;
	@ObfuscatedName("wj")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	@Export("refreshAccessTokenRequester")
	RefreshAccessTokenRequester refreshAccessTokenRequester;
	@ObfuscatedName("wt")
	@Export("refreshAccessTokenRequestFuture")
	Future refreshAccessTokenRequestFuture;
	@ObfuscatedName("wp")
	@ObfuscatedSignature(
		descriptor = "Lwj;"
	)
	Buffer field590;
	@ObfuscatedName("wg")
	@ObfuscatedSignature(
		descriptor = "Laq;"
	)
	SpriteBufferProperties field591;
	@ObfuscatedName("wk")
	@ObfuscatedGetter(
		longValue = 2099933663878122023L
	)
	@Export("accountHash")
	long accountHash;

	static {
		packetWriter = new PacketWriter();
		field297 = new class281();
		byte[] var1 = class62.method2162("com_jagex_auth_desktop_osrs:public");
		String var0 = class169.method4113(var1, 0, var1.length);
		BASIC_AUTH_DESKTOP_OSRS = var0;
		var1 = class62.method2162("com_jagex_auth_desktop_runelite:public");
		var0 = class169.method4113(var1, 0, var1.length);
		BASIC_AUTH_DESKTOP_RUNELITE = var0;
		field351 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
		playerAppearance = new PlayerComposition();
		field303 = new ApproximateRouteStrategy();
		field435 = true;
		worldId = 1;
		isMembersWorld = false;
		gameState = 0;
		cycle = 0;
		authenticationScheme = AuthenticationScheme.TOKEN;
		field310 = class593.field6035;
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
		field321 = 0;
		showLoadingMessages = true;
		localPlayerIndex = -1;
		field463 = 0;
		field325 = "";
		currentWorldViewId = -1;
		field327 = -1;
		field328 = -1;
		renderSelf = true;
		drawPlayerNames = 0;
		currentLevels = new int[25];
		levels = new int[25];
		experience = new int[25];
		field334 = new int[25];
		followerOpsLowPriority = false;
		showMouseOverText = true;
		isItemSelected = 0;
		viewportWidget = null;
		field502 = 0L;
		isResizable = true;
		field341 = 600;
		revision = field341 / GameEngine.cycleDurationMillis;
		indexCheck = new IndexCheck();
		field491 = new class271();
		currentClanSettings = new ClanSettings[4];
		currentClanChannels = new ClanChannel[4];
		field347 = 256;
		field348 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field458 = 1;
		field352 = 32767;
		field353 = 1;
		field354 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		field362 = -1;
		field363 = -1;
		field364 = 30;
		worldProperties = 0;
		gameBuild = 0;
		isLowDetail = false;
		field368 = -1;
		clientType = -1;
		field370 = -1;
		onMobile = false;
		isLoading = true;
		serverCycle = 0;
		mouseLastLastPressedTimeMillis = -1L;
		field375 = -1;
		field339 = -1;
		field384 = -1L;
		hadFocus = true;
		rebootTimer = 0;
		z = false;
		field443 = class69.field953;
		js5ConnectState = 0;
		field383 = 0;
		js5Errors = 0;
		field386 = 0;
		field387 = 0;
		field465 = 0;
		logoutTimer = 0;
		field390 = 0;
		field391 = 1;
		field392 = 0;
		field393 = 1;
		field394 = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		mouseCamClickedX = 0;
		mouseCamClickedY = 0;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field403 = 0;
		field404 = -1;
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
		field360 = new NodeDeque();
		widgetFlags = new NodeHashTable(512);
		publicChatMode = 0;
		tradeChatMode = 0;
		field427 = "";
		field434 = 0;
		field423 = new int[128];
		field568 = new int[128];
		field425 = -1L;
		playingJingle = false;
		field472 = new class556();
		isCameraLocked = false;
		field429 = false;
		DBTableIndex_cache = new EvictingDualNodeHashTable(64);
		archive11 = new EvictingDualNodeHashTable(64);
		field476 = false;
		field433 = false;
		field330 = false;
		hintArrow = new HintArrow();
		playerAttackOption = AttackOption.AttackOption_hidden;
		npcAttackOption = AttackOption.AttackOption_hidden;
		secureRandomFuture = new SecureRandomFuture();
		field439 = new int[4];
		randomDatData = null;
		npcCount = 0;
		npcIndices = new int[250];
		hadNetworkError = false;
		timer = new Timer();
		field445 = new int[4][13][13];
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		overheadTextLimit = -1;
		graphicsCycle = 0;
		field450 = 2301979;
		field451 = 5063219;
		field452 = 3353893;
		field366 = 7759444;
		field454 = false;
		alternativeScrollbarWidth = 0;
		field456 = 0;
		field432 = 0;
		field566 = 0;
		field459 = 0;
		field440 = false;
		field461 = 0;
		field371 = false;
		field516 = 0;
		overheadTextCount = 0;
		field444 = 50;
		overheadTextXs = new int[field444];
		overheadTextYs = new int[field444];
		overheadTextAscents = new int[field444];
		overheadTextXOffsets = new int[field444];
		overheadTextColors = new int[field444];
		overheadTextEffects = new int[field444];
		field501 = new int[field444][];
		overheadTextCyclesRemaining = new int[field444];
		overheadText = new String[field444];
		viewportDrawCount = 0;
		viewportTempX = -1;
		viewportTempY = -1;
		mouseCrossX = 0;
		mouseCrossY = 0;
		mouseCrossState = 0;
		mouseCrossColor = 0;
		userId = -1L;
		userHash = -1L;
		field484 = 0;
		field572 = 0;
		field377 = 0;
		field487 = 0;
		field488 = new int[1000];
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
		field499 = 0;
		field500 = 50;
		field485 = null;
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
		field513 = false;
		field514 = -1;
		field515 = -1;
		field411 = false;
		field537 = -1;
		field589 = -1;
		isDraggingWidget = false;
		changedVarps = new int[32];
		changedVarpCount = 0;
		changedItemContainers = new int[32];
		changedItemsCount = 0;
		changedSkills = new int[32];
		changedSkillsCount = 0;
		field526 = new int[32];
		field527 = 0;
		field470 = 0;
		field529 = 0;
		field530 = 0;
		field531 = 0;
		field532 = 0;
		field446 = 0;
		field428 = 0;
		field535 = new class606();
		rootWidgetCount = 0;
		field533 = -2;
		validRootWidgets = new boolean[100];
		field539 = new boolean[100];
		field540 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field546 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		crossWorldMessageIds = new long[100];
		crossWorldMessageIdsIndex = 0;
		field549 = -1;
		mapIconCount = 0;
		mapIconXs = new int[1000];
		mapIconYs = new int[1000];
		mapIcons = new SpritePixels[1000];
		destinationX = 0;
		destinationY = 0;
		field565 = -1;
		field557 = 0;
		minimapState = 0;
		field559 = false;
		field560 = false;
		field561 = false;
		field494 = null;
		field378 = null;
		field564 = null;
		field583 = new boolean[5];
		field453 = new int[5];
		field567 = new int[5];
		field323 = new int[5];
		field569 = new int[5];
		field570 = -1;
		field350 = -1;
		field528 = new DesktopPlatformInfoProvider();
		field473 = new class488(8, class486.field5404);
		field595 = new ArrayList();
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field520 = 0;
		field578 = new int[50];
		field579 = new int[50];
		class583.field5952 = 234;
	}

	public Client() {
		this.https = false;
		this.clientId = 0;
		this.accountHash = -1L;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1110545204"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field502 = class281.method6373() + 500L;
		if (rootInterface != -1) {
			this.method972(true);
		}

	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1885009285"
	)
	@Export("setUp")
	protected final void setUp() {
		WorldMapAreaData.method6927(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
		int var2 = worldProperties;
		class580 var3 = class580.field5929;
		boolean var1 = (var2 & var3.rsOrdinal()) != 0;
		MenuAction.field687 = var1;
		HealthBarDefinition.worldPort = gameBuild == 0 ? 43594 : worldId + 40000;
		StudioGame.js5Port = gameBuild == 0 ? 443 : worldId + 50000;
		class199.currentPort = HealthBarDefinition.worldPort;
		PlayerComposition.field4098 = class366.field4144;
		class323.field3544 = class366.field4145;
		class151.field1771 = class366.field4146;
		class360.field4079 = class366.field4147;
		PcmPlayer.urlRequester = new SecureUrlRequester(this.https, 234);
		this.setUpKeyboard();
		this.setUpMouse();
		class81.mouseWheel = this.mouseWheel();
		this.method520(field491, 0);
		this.method520(indexCheck, 1);
		this.setUpClipboard();
		class479.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 750000);
		class154.clientPreferences = class135.method3745();
		Actor.setWindowedMode(class154.clientPreferences.getWindowMode());
		KitDefinition.friendSystem = new FriendSystem(class147.loginType);
		this.asyncRestClient = new AsyncRestClient("tokenRequest", 1, 1);
		if (!class338.field3892.contains(this)) {
			class338.field3892.add(this);
		}

		field297.method6375();
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle;
		this.doCycleJs5();
		class195.method4451();
		boolean var1 = WorldMapArea.method6503();
		if (var1 && playingJingle && class135.pcmPlayer1 != null) {
			class135.pcmPlayer1.tryDiscard();
		}

		StudioGame.method8201();
		indexCheck.method6125();
		this.method507();
		synchronized(MouseHandler.MouseHandler_instance) {
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile;
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile;
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile;
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile;
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile;
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile;
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile;
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile;
			MouseHandler.MouseHandler_lastButtonVolatile = 0;
		}

		if (class81.mouseWheel != null) {
			int var4 = class81.mouseWheel.useRotation();
			mouseWheelRotation = var4;
		}

		if (gameState == 0) {
			class50.method1922();
			ObjectSound.method2358();
		} else if (gameState == 5) {
			class171.loginScreen(this, class85.fontPlain11, Message.fontPlain12);
			class50.method1922();
			ObjectSound.method2358();
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				class171.loginScreen(this, class85.fontPlain11, Message.fontPlain12);
				this.doCycleLoggedOut();
			} else if (gameState == 50) {
				class171.loginScreen(this, class85.fontPlain11, Message.fontPlain12);
				this.doCycleLoggedOut();
			} else if (gameState == 25) {
				if (field476) {
					class146.loadRegion();
				}

				if (field433) {
					PlatformInfo.method10717(Player.field939);
				}

				if (!field433 && !field476) {
					class135.updateGameState(30);
				}
			}
		} else {
			class171.loginScreen(this, class85.fontPlain11, Message.fontPlain12);
		}

		if (gameState == 30) {
			this.doCycleLoggedIn();
		} else if (gameState == 40 || gameState == 45) {
			this.doCycleLoggedOut();
		}

	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "32"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		class204.method4571();
		if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field502 && class281.method6373() > field502) {
			Actor.setWindowedMode(WorldMapRenderer.getWindowedMode());
		}

		int var2;
		if (var1) {
			for (var2 = 0; var2 < 100; ++var2) {
				validRootWidgets[var2] = true;
			}
		}

		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1, class30.field135);
		} else if (gameState == 5) {
			IntHashTable.drawTitle(class70.fontBold12, class85.fontPlain11, Message.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				IntHashTable.drawTitle(class70.fontBold12, class85.fontPlain11, Message.fontPlain12);
			} else if (gameState == 50) {
				IntHashTable.drawTitle(class70.fontBold12, class85.fontPlain11, Message.fontPlain12);
			} else if (gameState == 25) {
				if (field476) {
					if (field394 == 1) {
						if (field390 > field391) {
							field391 = field390;
						}

						var2 = (field391 * 50 - field390 * 50) / field391;
						class88.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
					} else if (field394 == 2) {
						if (field392 > field393) {
							field393 = field392;
						}

						var2 = (field393 * 50 - field392 * 50) / field393 + 50;
						class88.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
					} else {
						class88.drawLoadingMessage("Loading - please wait.", false);
					}
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				class88.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) {
				class88.drawLoadingMessage("Please wait...", false);
			}
		} else {
			IntHashTable.drawTitle(class70.fontBold12, class85.fontPlain11, Message.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				if (field539[var2]) {
					class409.rasterProvider.draw(rootWidgetXs[var2], rootWidgetYs[var2], rootWidgetWidths[var2], rootWidgetHeights[var2]);
					field539[var2] = false;
				}
			}
		} else if (gameState > 0) {
			class409.rasterProvider.drawFull(0, 0);

			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				field539[var2] = false;
			}
		}

	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-50"
	)
	@Export("kill0")
	protected final void kill0() {
		if (ModeWhere.varcs != null && ModeWhere.varcs.hasUnwrittenChanges()) {
			ModeWhere.varcs.write();
		}

		if (MidiRequest.mouseRecorder != null) {
			MidiRequest.mouseRecorder.isRunning = false;
		}

		MidiRequest.mouseRecorder = null;
		packetWriter.close();
		WorldMapArea.method6506();
		class81.mouseWheel = null;
		if (class135.pcmPlayer1 != null) {
			class135.pcmPlayer1.shutdown();
		}

		BufferedNetSocket.field5515.method8497();
		class62.method2163();
		if (PcmPlayer.urlRequester != null) {
			PcmPlayer.urlRequester.close();
			PcmPlayer.urlRequester = null;
		}

		Projection.method5508();
		this.asyncRestClient.shutdown();
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1314436870"
	)
	protected final void vmethod800() {
	}

	@ObfuscatedName("pa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "884474454"
	)
	@Export("isRuneLite")
	boolean isRuneLite() {
		return this.clientId == 1;
	}

	@ObfuscatedName("pd")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-36"
	)
	@Export("containsAccessAndRefreshToken")
	boolean containsAccessAndRefreshToken() {
		return FriendSystem.accessToken != null && !FriendSystem.accessToken.trim().isEmpty() && DevicePcmPlayerProvider.refreshToken != null && !DevicePcmPlayerProvider.refreshToken.trim().isEmpty();
	}

	@ObfuscatedName("pz")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2105635384"
	)
	@Export("containsSessionAndCharacterId")
	boolean containsSessionAndCharacterId() {
		return Archive.sessionId != null && !Archive.sessionId.trim().isEmpty() && class386.characterId != null && !class386.characterId.trim().isEmpty();
	}

	@ObfuscatedName("pf")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1127844625"
	)
	@Export("otlTokenRequesterInitialized")
	boolean otlTokenRequesterInitialized() {
		return this.otlTokenRequester != null;
	}

	@ObfuscatedName("pl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1343625693"
	)
	@Export("requestRefreshAccessToken")
	void requestRefreshAccessToken(String var1) throws IOException {
		HashMap var2 = new HashMap();
		var2.put("grant_type", "refresh_token");
		var2.put("scope", "gamesso.token.create");
		var2.put("refresh_token", var1);
		URL var3 = new URL(class26.authServiceBaseUrl + "shield/oauth/token" + (new HttpQueryParams(var2)).encode());
		HttpHeaders var4 = new HttpHeaders();
		if (this.isRuneLite()) {
			var4.basicAuthentication(BASIC_AUTH_DESKTOP_RUNELITE);
		} else {
			var4.basicAuthentication(BASIC_AUTH_DESKTOP_OSRS);
		}

		var4.header("Host", (new URL(class26.authServiceBaseUrl)).getHost());
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

	@ObfuscatedName("ql")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1477802632"
	)
	@Export("requestOtlToken")
	void requestOtlToken(String var1) throws IOException {
		URL var2 = new URL(class26.authServiceBaseUrl + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
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

	@ObfuscatedName("qk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1753098459"
	)
	@Export("authenticate")
	void authenticate(String var1, String var2) throws IOException, JSONException {
		URL var3 = new URL(SoundSystem.gameSessionServiceBaseUrl + "game-session/v1/tokens");
		HttpRequest var4 = new HttpRequest(var3, HttpMethod.POST, this.https);
		var4.getHeaders().bearerToken(var1);
		var4.getHeaders().accept(HttpContentType.APPLICATION_JSON);
		JSONObject var5 = new JSONObject();
		var5.setProperty("accountId", var2);
		var4.setPayload(new HttpJsonRequestBody(var5));
		this.asyncGameSessionTokenResponse = this.asyncRestClient.submitRequest(var4);
	}

	@ObfuscatedName("qo")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "107"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			boolean var1 = BufferedNetSocket.field5515.method8502();
			if (!var1) {
				this.method814();
			}

		}
	}

	@ObfuscatedName("qe")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "56"
	)
	void method814() {
		if (BufferedNetSocket.field5515.field5014 >= 4) {
			this.error("js5crc");
			class135.updateGameState(1000);
		} else {
			if (BufferedNetSocket.field5515.field5027 >= 4) {
				if (gameState <= 5) {
					this.error("js5io");
					class135.updateGameState(1000);
					return;
				}

				field383 = 3000;
				BufferedNetSocket.field5515.field5027 = 3;
			}

			if (--field383 + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						class322.js5SocketTask = GameEngine.taskHandler.newSocketTask(class401.worldHost, class199.currentPort);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (class322.js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (class322.js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						WorldMapCacheName.js5Socket = LoginScreenAnimation.method2579((Socket)class322.js5SocketTask.result, 40000, 5000);
						Buffer var1 = new Buffer(class330.field3815.field3824 + 1);
						var1.writeByte(class330.field3815.field3823);
						var1.writeInt(234);
						var1.writeInt(field439[0]);
						var1.writeInt(field439[1]);
						var1.writeInt(field439[2]);
						var1.writeInt(field439[3]);
						WorldMapCacheName.js5Socket.write(var1.array, 0, class330.field3815.field3824 + 1);
						++js5ConnectState;
						class461.field5289 = class281.method6373();
					}

					if (js5ConnectState == 3) {
						if (WorldMapCacheName.js5Socket.available() > 0) {
							int var2 = WorldMapCacheName.js5Socket.readUnsignedByte();
							if (var2 != 0) {
								this.js5Error(var2);
								return;
							}

							++js5ConnectState;
						} else if (class281.method6373() - class461.field5289 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						BufferedNetSocket.field5515.method8490(WorldMapCacheName.js5Socket, gameState > 20);
						class322.js5SocketTask = null;
						WorldMapCacheName.js5Socket = null;
						js5ConnectState = 0;
						js5Errors = 0;
					}
				} catch (IOException var3) {
					this.js5Error(-3);
				}

			}
		}
	}

	@ObfuscatedName("qm")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2135350053"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		class322.js5SocketTask = null;
		WorldMapCacheName.js5Socket = null;
		js5ConnectState = 0;
		if (HealthBarDefinition.worldPort == class199.currentPort) {
			class199.currentPort = StudioGame.js5Port;
		} else {
			class199.currentPort = HealthBarDefinition.worldPort;
		}

		++js5Errors;
		if (js5Errors < 2 || var1 != 7 && var1 != 9) {
			if (js5Errors >= 2 && var1 == 6) {
				this.error("js5connect_outofdate");
				class135.updateGameState(1000);
			} else if (js5Errors >= 4) {
				if (gameState <= 5) {
					this.error("js5connect");
					class135.updateGameState(1000);
				} else {
					field383 = 3000;
				}
			}
		} else if (gameState <= 5) {
			this.error("js5connect_full");
			class135.updateGameState(1000);
		} else {
			field383 = 3000;
		}

	}

	@ObfuscatedName("qu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2142986361"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		AbstractSocket var1 = packetWriter.getSocket();
		PacketBuffer var2 = packetWriter.packetBuffer;

		try {
			if (LoginState.SHUTDOWN_PREVIOUS_CONNECTION == class385.loginState) {
				if (class377.field4393 == null && (secureRandomFuture.isDone() || field386 > 250)) {
					class377.field4393 = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (class377.field4393 != null) {
					if (var1 != null) {
						var1.close();
						var1 = null;
					}

					class66.field894 = null;
					hadNetworkError = false;
					field386 = 0;
					if (field310.method11670()) {
						if (this.containsAccessAndRefreshToken()) {
							try {
								this.requestRefreshAccessToken(DevicePcmPlayerProvider.refreshToken);
								class254.updateLoginState(LoginState.TOKEN_RESPONSE);
							} catch (Throwable var24) {
								ArchiveDiskActionHandler.RunException_sendStackTrace((String)null, var24);
								class180.getLoginError(65);
								return;
							}
						} else {
							if (!this.containsSessionAndCharacterId()) {
								class180.getLoginError(65);
								return;
							}

							try {
								this.authenticate(Archive.sessionId, class386.characterId);
								class254.updateLoginState(LoginState.REFRESHING_TOKEN);
							} catch (Exception var23) {
								ArchiveDiskActionHandler.RunException_sendStackTrace((String)null, var23);
								class180.getLoginError(65);
								return;
							}
						}
					} else {
						class254.updateLoginState(LoginState.INIT_MOUSEHANDLER_SOCKET);
					}
				}
			}

			HttpResponse var27;
			if (LoginState.TOKEN_RESPONSE == class385.loginState) {
				if (this.refreshAccessTokenRequestFuture != null) {
					if (!this.refreshAccessTokenRequestFuture.isDone()) {
						return;
					}

					if (this.refreshAccessTokenRequestFuture.isCancelled()) {
						class180.getLoginError(65);
						this.refreshAccessTokenRequestFuture = null;
						return;
					}

					try {
						RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.refreshAccessTokenRequestFuture.get();
						if (!var3.isSuccess()) {
							class180.getLoginError(65);
							this.refreshAccessTokenRequestFuture = null;
							return;
						}

						FriendSystem.accessToken = var3.getAccessToken();
						DevicePcmPlayerProvider.refreshToken = var3.getRefreshToken();
						this.refreshAccessTokenRequestFuture = null;
					} catch (Exception var22) {
						ArchiveDiskActionHandler.RunException_sendStackTrace((String)null, var22);
						class180.getLoginError(65);
						this.refreshAccessTokenRequestFuture = null;
						return;
					}
				} else {
					if (this.asyncAccessTokenResponse == null) {
						class180.getLoginError(65);
						return;
					}

					if (!this.asyncAccessTokenResponse.hasFinished()) {
						return;
					}

					if (this.asyncAccessTokenResponse.hasError()) {
						ArchiveDiskActionHandler.RunException_sendStackTrace(this.asyncAccessTokenResponse.getErrorMessage(), (Throwable)null);
						class180.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}

					var27 = this.asyncAccessTokenResponse.await();
					if (var27.getResponseCode() != 200) {
						class180.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}

					field386 = 0;
					HttpJsonRequestBody var4 = new HttpJsonRequestBody(var27.getResponseBody());

					try {
						FriendSystem.accessToken = var4.getBody().getString("access_token");
						DevicePcmPlayerProvider.refreshToken = var4.getBody().getString("refresh_token");
					} catch (Exception var21) {
						ArchiveDiskActionHandler.RunException_sendStackTrace("Error parsing tokens", var21);
						class180.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}
				}

				this.requestOtlToken(FriendSystem.accessToken);
				class254.updateLoginState(LoginState.REFRESHING_TOKEN);
			}

			if (class385.loginState == LoginState.REFRESHING_TOKEN) {
				if (this.otlTokenRequestFuture != null) {
					if (!this.otlTokenRequestFuture.isDone()) {
						return;
					}

					if (this.otlTokenRequestFuture.isCancelled()) {
						class180.getLoginError(65);
						this.otlTokenRequestFuture = null;
						return;
					}

					try {
						OtlTokenResponse var28 = (OtlTokenResponse)this.otlTokenRequestFuture.get();
						if (!var28.isSuccess()) {
							class180.getLoginError(65);
							this.otlTokenRequestFuture = null;
							return;
						}

						this.token = var28.getToken();
						this.otlTokenRequestFuture = null;
					} catch (Exception var20) {
						ArchiveDiskActionHandler.RunException_sendStackTrace((String)null, var20);
						class180.getLoginError(65);
						this.otlTokenRequestFuture = null;
						return;
					}
				} else {
					if (this.asyncGameSessionTokenResponse == null) {
						class180.getLoginError(65);
						return;
					}

					if (!this.asyncGameSessionTokenResponse.hasFinished()) {
						return;
					}

					if (this.asyncGameSessionTokenResponse.hasError()) {
						ArchiveDiskActionHandler.RunException_sendStackTrace(this.asyncGameSessionTokenResponse.getErrorMessage(), (Throwable)null);
						class180.getLoginError(65);
						this.asyncGameSessionTokenResponse = null;
						return;
					}

					var27 = this.asyncGameSessionTokenResponse.await();
					if (var27.getResponseCode() != 200) {
						ArchiveDiskActionHandler.RunException_sendStackTrace("Login authentication error. Response code: " + var27.getResponseCode() + " " + var27.method291() + " Response body: " + var27.getResponseBody(), (Throwable)null);
						class180.getLoginError(65);
						this.asyncGameSessionTokenResponse = null;
						return;
					}

					List var30 = (List)var27.getHeaderFields().get("Content-Type");
					if (var30 != null && var30.contains(HttpContentType.APPLICATION_JSON.getValue())) {
						try {
							JSONObject var5 = new JSONObject(var27.getResponseBody());
							this.token = var5.getString("token");
						} catch (JSONException var19) {
							ArchiveDiskActionHandler.RunException_sendStackTrace((String)null, var19);
							class180.getLoginError(65);
							this.asyncGameSessionTokenResponse = null;
							return;
						}
					} else {
						this.token = var27.getResponseBody();
					}

					this.asyncGameSessionTokenResponse = null;
				}

				field386 = 0;
				class254.updateLoginState(LoginState.INIT_MOUSEHANDLER_SOCKET);
			}

			if (LoginState.INIT_MOUSEHANDLER_SOCKET == class385.loginState) {
				if (class66.field894 == null) {
					class66.field894 = GameEngine.taskHandler.newSocketTask(class401.worldHost, class199.currentPort);
				}

				if (class66.field894.status == 2) {
					throw new IOException();
				}

				if (class66.field894.status == 1) {
					var1 = LoginScreenAnimation.method2579((Socket)class66.field894.result, 40000, 5000);
					packetWriter.setSocket(var1);
					class66.field894 = null;
					class254.updateLoginState(LoginState.UNMAPPED_20);
				}
			}

			PacketBufferNode var29;
			if (class385.loginState == LoginState.UNMAPPED_20) {
				packetWriter.clearBuffer();
				var29 = World.method1552();
				var29.packetBuffer.writeByte(class330.field3820.field3823);
				packetWriter.addNode(var29);
				packetWriter.flush();
				var2.offset = 0;
				class254.updateLoginState(LoginState.READ_LOGIN_STATUS);
			}

			int var14;
			if (LoginState.READ_LOGIN_STATUS == class385.loginState) {
				if (class135.pcmPlayer1 != null) {
					class135.pcmPlayer1.method3142();
				}

				if (var1.isAvailable(1)) {
					var14 = var1.readUnsignedByte();
					if (class135.pcmPlayer1 != null) {
						class135.pcmPlayer1.method3142();
					}

					if (var14 != 0) {
						class180.getLoginError(var14);
						return;
					}

					var2.offset = 0;
					class254.updateLoginState(LoginState.READ_RANDOM_VERIFICATION_NUMBER);
				}
			}

			if (class385.loginState == LoginState.READ_RANDOM_VERIFICATION_NUMBER) {
				if (var2.offset < 8) {
					var14 = var1.available();
					if (var14 > 8 - var2.offset) {
						var14 = 8 - var2.offset;
					}

					if (var14 > 0) {
						var1.read(var2.array, var2.offset, var14);
						var2.offset += var14;
					}
				}

				if (var2.offset == 8) {
					var2.offset = 0;
					DevicePcmPlayerProvider.field92 = var2.readLong();
					class254.updateLoginState(LoginState.WRITE_INITIAL_LOGIN_PACKET);
				}
			}

			if (class385.loginState == LoginState.WRITE_INITIAL_LOGIN_PACKET) {
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var31 = new PacketBuffer(500);
				int[] var32 = new int[]{class377.field4393.nextInt(), class377.field4393.nextInt(), class377.field4393.nextInt(), class377.field4393.nextInt()};
				var31.offset = 0;
				var31.writeByte(1);
				var31.writeInt(var32[0]);
				var31.writeInt(var32[1]);
				var31.writeInt(var32[2]);
				var31.writeInt(var32[3]);
				var31.writeLong(DevicePcmPlayerProvider.field92);
				if (gameState == 40) {
					var31.writeInt(field439[0]);
					var31.writeInt(field439[1]);
					var31.writeInt(field439[2]);
					var31.writeInt(field439[3]);
				} else {
					if (gameState == 50) {
						var31.writeByte(AuthenticationScheme.field1596.rsOrdinal());
						var31.writeInt(class165.field1886);
					} else {
						var31.writeByte(authenticationScheme.rsOrdinal());
						switch(authenticationScheme.schemeId) {
						case 0:
						case 1:
							var31.writeMedium(AABB.otpMedium);
							++var31.offset;
						case 2:
						default:
							break;
						case 3:
							var31.writeInt(class154.clientPreferences.getParameterValue(Login.Login_username));
							break;
						case 4:
							var31.offset += 4;
						}
					}

					if (field310.method11670()) {
						var31.writeByte(class593.field6034.rsOrdinal());
						var31.writeStringCp1252NullTerminated(this.token);
					} else {
						var31.writeByte(class593.field6035.rsOrdinal());
						var31.writeStringCp1252NullTerminated(Login.Login_password);
					}
				}

				var31.encryptRsa(class50.field692, class50.field693);
				field439 = var32;
				PacketBufferNode var35 = World.method1552();
				var35.packetBuffer.offset = 0;
				if (gameState == 40) {
					var35.packetBuffer.writeByte(class330.field3817.field3823);
				} else {
					var35.packetBuffer.writeByte(class330.field3819.field3823);
				}

				var35.packetBuffer.writeShort(0);
				int var6 = var35.packetBuffer.offset;
				var35.packetBuffer.writeInt(234);
				var35.packetBuffer.writeInt(1);
				var35.packetBuffer.writeInt(class583.field5952);
				var35.packetBuffer.writeByte(clientType);
				var35.packetBuffer.writeByte(field370);
				byte var7 = 0;
				var35.packetBuffer.writeByte(var7);
				var35.packetBuffer.writeBytes(var31.array, 0, var31.offset);
				int var8 = var35.packetBuffer.offset;
				var35.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var35.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var35.packetBuffer.writeShort(class4.canvasWidth);
				var35.packetBuffer.writeShort(class558.canvasHeight);
				PacketBuffer var9 = var35.packetBuffer;
				int var12;
				if (randomDatData != null) {
					var9.writeBytes(randomDatData, 0, randomDatData.length);
				} else {
					byte[] var11 = new byte[24];

					try {
						JagexCache.JagexCache_randomDat.seek(0L);
						JagexCache.JagexCache_randomDat.readFully(var11);

						for (var12 = 0; var12 < 24 && var11[var12] == 0; ++var12) {
						}

						if (var12 >= 24) {
							throw new IOException();
						}
					} catch (Exception var25) {
						for (int var13 = 0; var13 < 24; ++var13) {
							var11[var13] = -1;
						}
					}

					var9.writeBytes(var11, 0, var11.length);
				}

				var35.packetBuffer.writeStringCp1252NullTerminated(HttpAuthenticationHeader.field5389);
				var35.packetBuffer.writeInt(class40.field257);
				var35.packetBuffer.writeByte(0);
				Buffer var10 = new Buffer(class151.platformInfo.size());
				class151.platformInfo.write(var10);
				var35.packetBuffer.writeBytes(var10.array, 0, var10.array.length);
				var35.packetBuffer.writeByte(clientType);
				var35.packetBuffer.writeInt(0);
				if (MenuAction.field687) {
					var35.packetBuffer.writeIntLE(BoundaryObject.archive8.hash);
					var35.packetBuffer.writeIntIME(WorldViewManager.field1001.hash);
					var35.packetBuffer.writeIntLE(Canvas.archive13.hash);
					var35.packetBuffer.writeInt(class443.field5180.hash);
					var35.packetBuffer.writeInt(UserComparator4.field1562.hash);
					var35.packetBuffer.writeInt(Projection.archive10.hash);
					var35.packetBuffer.writeIntME(PacketWriter.field1291.hash);
				} else {
					MusicPatch.method7346(var35);
				}

				var35.packetBuffer.xteaEncrypt(var32, var8, var35.packetBuffer.offset);
				var35.packetBuffer.writeLengthShort(var35.packetBuffer.offset - var6);
				packetWriter.addNode(var35);
				packetWriter.flush();
				packetWriter.isaacCipher = new IsaacCipher(var32);
				int[] var42 = new int[4];

				for (var12 = 0; var12 < 4; ++var12) {
					var42[var12] = var32[var12] + 50;
				}

				var2.newIsaacCipher(var42);
				class254.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			int var16;
			if (LoginState.READ_CLIENT_INFO_STATUS == class385.loginState && var1.available() > 0) {
				var14 = var1.readUnsignedByte();
				if (var14 == 61) {
					var16 = var1.available();
					ModeWhere.field5150 = var16 == 1 && var1.readUnsignedByte() == 1;
					class254.updateLoginState(LoginState.WRITE_INITIAL_LOGIN_PACKET);
				}

				if (var14 == 21 && gameState == 20) {
					class254.updateLoginState(LoginState.READ_PROFILE_TRANSFER_TIME);
				} else if (var14 == 2) {
					if (MenuAction.field687) {
						class254.updateLoginState(LoginState.UNMAPPED_21);
					} else {
						class254.updateLoginState(LoginState.UNMAPPED);
					}
				} else if (var14 == 15 && gameState == 40) {
					packetWriter.serverPacketLength = -1;
					class254.updateLoginState(LoginState.UNMAPPED_19);
				} else if (var14 == 64) {
					class254.updateLoginState(LoginState.READ_STATE_11_PACKET_SIZE);
				} else if (var14 == 23 && field387 < 1) {
					++field387;
					class254.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				} else if (var14 == 29) {
					class254.updateLoginState(LoginState.UNMAPPED_17);
				} else {
					if (var14 != 69) {
						class180.getLoginError(var14);
						return;
					}

					class254.updateLoginState(LoginState.READ_DIGEST_PARSER_PACKET_SIZE);
				}
			}

			if (class385.loginState == LoginState.UNMAPPED_21) {
				class30.field135 = true;
				RestClientThreadFactory.method205(class69.field942);
				class135.updateGameState(0);
			}

			if (LoginState.READ_DIGEST_PARSER_PACKET_SIZE == class385.loginState && var1.available() >= 2) {
				var1.read(var2.array, 0, 2);
				var2.offset = 0;
				LoginScreenAnimation.field1129 = var2.readUnsignedShort();
				class254.updateLoginState(LoginState.SUBMIT_DIGEST_PARSER_TASK);
			}

			if (LoginState.SUBMIT_DIGEST_PARSER_TASK == class385.loginState && var1.available() >= LoginScreenAnimation.field1129) {
				var2.offset = 0;
				var1.read(var2.array, var2.offset, LoginScreenAnimation.field1129);
				class6[] var33 = new class6[]{class6.field16};
				class6 var34 = var33[var2.readUnsignedByte()];

				try {
					switch(var34.field14) {
					case 0:
						class0 var37 = new class0();
						this.field591 = new SpriteBufferProperties(var2, var37);
						class254.updateLoginState(LoginState.WRITE_DIGEST_PARSER_RESULT);
						break;
					default:
						throw new IllegalArgumentException();
					}
				} catch (Exception var18) {
					class180.getLoginError(22);
					return;
				}
			}

			if (class385.loginState == LoginState.WRITE_DIGEST_PARSER_RESULT && this.field591.method42()) {
				this.field590 = this.field591.method43();
				this.field591.method40();
				this.field591 = null;
				if (this.field590 == null) {
					class180.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				var29 = World.method1552();
				var29.packetBuffer.writeByte(class330.field3814.field3823);
				var29.packetBuffer.writeShort(this.field590.offset);
				var29.packetBuffer.writeBuffer(this.field590);
				packetWriter.addNode(var29);
				packetWriter.flush();
				this.field590 = null;
				class254.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			if (LoginState.READ_STATE_11_PACKET_SIZE == class385.loginState && var1.available() > 0) {
				ClanSettings.field1868 = var1.readUnsignedByte();
				class254.updateLoginState(LoginState.UNMAPPED_11);
			}

			if (class385.loginState == LoginState.UNMAPPED_11 && var1.available() >= ClanSettings.field1868) {
				var1.read(var2.array, 0, ClanSettings.field1868);
				var2.offset = 0;
				class254.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			if (LoginState.READ_PROFILE_TRANSFER_TIME == class385.loginState && var1.available() > 0) {
				field465 = (var1.readUnsignedByte() + 3) * 60;
				class254.updateLoginState(LoginState.PROFILE_TRANSFER);
			}

			if (class385.loginState == LoginState.PROFILE_TRANSFER) {
				field386 = 0;
				class203.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field465 / 60 + " seconds.");
				if (--field465 <= 0) {
					class254.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				}

			} else if (class385.loginState == LoginState.READ_ACCOUNT_INFO_PACKET_SIZE) {
				var29 = World.method1552();
				var29.packetBuffer.writeByte(class330.field3821.field3823);
				var29.packetBuffer.writeShort(class330.field3821.field3824);
				var29.packetBuffer.writeInt(FriendSystem.field621.hash);
				var29.packetBuffer.writeIntIME(GrandExchangeOffer.archive6.hash);
				var29.packetBuffer.writeIntIME(class156.field1814.hash);
				var29.packetBuffer.writeIntLE(WorldMapDecoration.field3459.hash);
				var29.packetBuffer.writeInt(WorldMapSprite.field3462.hash);
				var29.packetBuffer.writeInt(class416.archive4.hash);
				var29.packetBuffer.writeIntLE(field376.hash);
				var29.packetBuffer.writeIntIME(class206.archive2.hash);
				var29.packetBuffer.writeIntLE(class113.field1508.hash);
				var29.packetBuffer.writeIntIME(class322.field3540.hash);
				var29.packetBuffer.writeIntME(ItemContainer.archive9.hash);
				var29.packetBuffer.writeIntME(RestClientThreadFactory.field67.hash);
				var29.packetBuffer.writeIntIME(0);
				var29.packetBuffer.writeIntME(PendingSpawn.field1023.hash);
				var29.packetBuffer.writeInt(class142.archive12.hash);
				var29.packetBuffer.writeIntLE(WorldMapArea.field3339.hash);
				packetWriter.addNode(var29);
				packetWriter.flush();
				class254.updateLoginState(LoginState.UNMAPPED);
			} else {
				if (LoginState.UNMAPPED == class385.loginState && var1.available() >= 1) {
					WorldMapEvent.field3520 = var1.readUnsignedByte();
					if (WorldMapEvent.field3520 != class330.field3818.field3824) {
						class180.getLoginError(WorldMapEvent.field3520);
						return;
					}

					class254.updateLoginState(LoginState.READ_ACCOUNT_INFO);
				}

				if (LoginState.READ_ACCOUNT_INFO == class385.loginState && var1.available() >= WorldMapEvent.field3520) {
					boolean var43 = var1.readUnsignedByte() == 1;
					var1.read(var2.array, 0, 4);
					var2.offset = 0;
					boolean var44 = false;
					if (var43) {
						var16 = var2.readByteIsaac() << 24;
						var16 |= var2.readByteIsaac() << 16;
						var16 |= var2.readByteIsaac() << 8;
						var16 |= var2.readByteIsaac();
						class154.clientPreferences.put(Login.Login_username, var16);
					}

					if (Login_isUsernameRemembered) {
						class154.clientPreferences.updateRememberedUsername(Login.Login_username);
					} else {
						class154.clientPreferences.updateRememberedUsername((String)null);
					}

					class404.savePreferences();
					staffModLevel = var1.readUnsignedByte();
					playerMod = var1.readUnsignedByte() == 1;
					localPlayerIndex = var1.readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += var1.readUnsignedByte();
					field463 = var1.readUnsignedByte();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					this.accountHash = var2.readLong();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					userId = var2.readLong();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					userHash = var2.readLong();
					class32.method493().method5986(this.https);
					class254.updateLoginState(LoginState.SET_SERVER_PROTOCOL);
				}

				if (class385.loginState == LoginState.SET_SERVER_PROTOCOL && var1.available() >= packetWriter.serverPacketLength) {
					var1.read(var2.array, 0, 1);
					var2.offset = 0;
					if (var2.method11323()) {
						var1.read(var2.array, 1, 1);
						var2.offset = 0;
					}

					ServerPacket[] var38 = Fonts.ServerPacket_values();
					var16 = var2.readSmartByteShortIsaac();
					if (var16 < 0 || var16 >= var38.length) {
						throw new IOException("Invalid ServerProt: " + var16 + " at " + var2.offset);
					}

					packetWriter.serverPacket = var38[var16];
					packetWriter.serverPacketLength = packetWriter.serverPacket.length;
					var1.read(var2.array, 0, 2);
					var2.offset = 0;
					packetWriter.serverPacketLength = var2.readUnsignedShort();
					class254.updateLoginState(LoginState.UPDATE_PLAYER_AND_LOAD_REGIONS);
				}

				if (class385.loginState == LoginState.UPDATE_PLAYER_AND_LOAD_REGIONS) {
					if (var1.available() >= packetWriter.serverPacketLength) {
						var2.offset = 0;
						var1.read(var2.array, 0, packetWriter.serverPacketLength);
						timer.method8296();
						AsyncRestClient.method174();
						playerUpdateManager.updatePlayer(var2);
						field328 = localPlayerIndex;
						GrandExchangeOffer.USERNAME_PASSWORD = class381.field4430;
						field327 = -1;
						WorldMapIcon_1.field3312 = -1;
						class156.loadRegions(false, var2);
						packetWriter.serverPacket = null;
						field330 = false;
					}

				} else {
					if (class385.loginState == LoginState.UNMAPPED_17 && var1.available() >= 2) {
						var2.offset = 0;
						var1.read(var2.array, 0, 2);
						var2.offset = 0;
						Ignored.field5465 = var2.readUnsignedShort();
						class254.updateLoginState(LoginState.UNMAPPED_18);
					}

					if (class385.loginState == LoginState.UNMAPPED_18 && var1.available() >= Ignored.field5465) {
						var2.offset = 0;
						var1.read(var2.array, 0, Ignored.field5465);
						var2.offset = 0;
						String var40 = var2.readStringCp1252NullTerminated();
						String var36 = var2.readStringCp1252NullTerminated();
						String var41 = var2.readStringCp1252NullTerminated();
						class203.setLoginResponseString(var40, var36, var41);
						class135.updateGameState(10);
						if (field310.method11670()) {
							class146.method3876(9);
						}
					}

					if (LoginState.UNMAPPED_19 != class385.loginState) {
						++field386;
						if (field386 > 2000) {
							if (field387 < 1) {
								if (HealthBarDefinition.worldPort == class199.currentPort) {
									class199.currentPort = StudioGame.js5Port;
								} else {
									class199.currentPort = HealthBarDefinition.worldPort;
								}

								++field387;
								class254.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
							} else {
								class180.getLoginError(-3);
							}
						}
					} else {
						if (packetWriter.serverPacketLength == -1) {
							if (var1.available() < 2) {
								return;
							}

							var1.read(var2.array, 0, 2);
							var2.offset = 0;
							packetWriter.serverPacketLength = var2.readUnsignedShort();
						}

						if (var1.available() >= packetWriter.serverPacketLength) {
							var1.read(var2.array, 0, packetWriter.serverPacketLength);
							var2.offset = 0;
							var14 = packetWriter.serverPacketLength;
							timer.method8301();
							packetWriter.clearBuffer();
							packetWriter.field1301 = 0;
							packetWriter.packetBuffer.offset = 0;
							packetWriter.serverPacket = null;
							packetWriter.field1303 = null;
							packetWriter.field1304 = null;
							packetWriter.field1305 = null;
							packetWriter.serverPacketLength = 0;
							packetWriter.field1294 = 0;
							rebootTimer = 0;
							AbstractUserComparator.method10062();
							minimapState = 0;
							destinationX = 0;
							class547.topLevelWorldView.method2739();
							class107.method3438();
							class135.updateGameState(30);

							for (var16 = 0; var16 < 100; ++var16) {
								validRootWidgets[var16] = true;
							}

							if (packetWriter != null && packetWriter.isaacCipher != null) {
								PacketBufferNode var39 = HorizontalAlignment.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, packetWriter.isaacCipher);
								var39.packetBuffer.writeByte(WorldMapRenderer.getWindowedMode());
								var39.packetBuffer.writeShort(class4.canvasWidth);
								var39.packetBuffer.writeShort(class558.canvasHeight);
								packetWriter.addNode(var39);
							}

							playerUpdateManager.updatePlayer(var2);
							if (var14 != var2.offset) {
								throw new RuntimeException();
							}
						}
					}
				}
			}
		} catch (IOException var26) {
			if (field387 < 1) {
				if (class199.currentPort == HealthBarDefinition.worldPort) {
					class199.currentPort = StudioGame.js5Port;
				} else {
					class199.currentPort = HealthBarDefinition.worldPort;
				}

				++field387;
				class254.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
			} else {
				class180.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("qi")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "95"
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
			class199.method4473();
		} else {
			if (!isMenuOpen) {
				Frames.addCancelMenuEntry();
			}

			this.method825();
			if (gameState == 30) {
				PacketBufferNode var1;
				int var2;
				while (User.method10041()) {
					var1 = HorizontalAlignment.getPacketBufferNode(ClientPacket.REFLECTION_CHECK_REPLY, packetWriter.isaacCipher);
					var1.packetBuffer.writeByte(0);
					var2 = var1.packetBuffer.offset;
					Language.performReflectionCheck(var1.packetBuffer);
					var1.packetBuffer.writeLengthByte(var1.packetBuffer.offset - var2);
					packetWriter.addNode(var1);
				}

				if (timer.field4902) {
					var1 = HorizontalAlignment.getPacketBufferNode(ClientPacket.LOGIN_TIMINGS, packetWriter.isaacCipher);
					var1.packetBuffer.writeByte(0);
					var2 = var1.packetBuffer.offset;
					timer.write(var1.packetBuffer);
					var1.packetBuffer.writeLengthByte(var1.packetBuffer.offset - var2);
					packetWriter.addNode(var1);
					timer.method8294();
				}

				int var3;
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
				synchronized(MidiRequest.mouseRecorder.lock) {
					if (!field435) {
						MidiRequest.mouseRecorder.index = 0;
					} else if (MouseHandler.MouseHandler_lastButton != 0 || MidiRequest.mouseRecorder.index >= 40) {
						PacketBufferNode var26 = null;
						var3 = 0;
						var4 = 0;
						var5 = 0;
						var6 = 0;

						for (var7 = 0; var7 < MidiRequest.mouseRecorder.index && (var26 == null || var26.packetBuffer.offset - var3 < 246); ++var7) {
							var4 = var7;
							var8 = MidiRequest.mouseRecorder.ys[var7];
							if (var8 < -1) {
								var8 = -1;
							} else if (var8 > 65534) {
								var8 = 65534;
							}

							var9 = MidiRequest.mouseRecorder.xs[var7];
							if (var9 < -1) {
								var9 = -1;
							} else if (var9 > 65534) {
								var9 = 65534;
							}

							if (var9 != field375 || var8 != field339) {
								if (var26 == null) {
									var26 = HorizontalAlignment.getPacketBufferNode(ClientPacket.MOUSE_MOVE, packetWriter.isaacCipher);
									var26.packetBuffer.writeByte(0);
									var3 = var26.packetBuffer.offset;
									var10000 = var26.packetBuffer;
									var10000.offset += 2;
									var5 = 0;
									var6 = 0;
								}

								if (-1L != field384) {
									var10 = var9 - field375;
									var11 = var8 - field339;
									var12 = (int)((MidiRequest.mouseRecorder.millis[var7] - field384) / 20L);
									var5 = (int)((long)var5 + (MidiRequest.mouseRecorder.millis[var7] - field384) % 20L);
								} else {
									var10 = var9;
									var11 = var8;
									var12 = Integer.MAX_VALUE;
								}

								field375 = var9;
								field339 = var8;
								if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
									var10 += 32;
									var11 += 32;
									var26.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6));
								} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
									var10 += 128;
									var11 += 128;
									var26.packetBuffer.writeByte(var12 + 128);
									var26.packetBuffer.writeShort(var11 + (var10 << 8));
								} else if (var12 < 32) {
									var26.packetBuffer.writeByte(var12 + 192);
									if (var9 != -1 && var8 != -1) {
										var26.packetBuffer.writeInt(var9 | var8 << 16);
									} else {
										var26.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								} else {
									var26.packetBuffer.writeShort((var12 & 8191) + 57344);
									if (var9 != -1 && var8 != -1) {
										var26.packetBuffer.writeInt(var9 | var8 << 16);
									} else {
										var26.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								}

								++var6;
								field384 = MidiRequest.mouseRecorder.millis[var7];
							}
						}

						if (var26 != null) {
							var26.packetBuffer.writeLengthByte(var26.packetBuffer.offset - var3);
							var7 = var26.packetBuffer.offset;
							var26.packetBuffer.offset = var3;
							var26.packetBuffer.writeByte(var5 / var6);
							var26.packetBuffer.writeByte(var5 % var6);
							var26.packetBuffer.offset = var7;
							packetWriter.addNode(var26);
						}

						if (var4 >= MidiRequest.mouseRecorder.index) {
							MidiRequest.mouseRecorder.index = 0;
						} else {
							MouseRecorder var79 = MidiRequest.mouseRecorder;
							var79.index -= var4;
							System.arraycopy(MidiRequest.mouseRecorder.xs, var4, MidiRequest.mouseRecorder.xs, 0, MidiRequest.mouseRecorder.index);
							System.arraycopy(MidiRequest.mouseRecorder.ys, var4, MidiRequest.mouseRecorder.ys, 0, MidiRequest.mouseRecorder.index);
							System.arraycopy(MidiRequest.mouseRecorder.millis, var4, MidiRequest.mouseRecorder.millis, 0, MidiRequest.mouseRecorder.index);
						}
					}
				}

				this.method818();
				if (mouseWheelRotation != 0) {
					var1 = HorizontalAlignment.getPacketBufferNode(ClientPacket.MOUSE_WHEEL, packetWriter.isaacCipher);
					var1.packetBuffer.writeShort(mouseWheelRotation);
					packetWriter.addNode(var1);
				}

				if (WorldMapLabelSize.method6404()) {
					var1 = HorizontalAlignment.getPacketBufferNode(ClientPacket.EVENT_KEYBOARD, packetWriter.isaacCipher);
					var1.packetBuffer.writeShort(0);
					var2 = var1.packetBuffer.offset;
					long var27 = class281.method6373();

					for (var5 = 0; var5 < indexCheck.field3217; ++var5) {
						long var29 = var27 - field425;
						if (var29 > 16777215L) {
							var29 = 16777215L;
						}

						field425 = var27;
						var1.packetBuffer.writeByteNeg(indexCheck.field3208[var5]);
						var1.packetBuffer.writeMedium((int)var29);
					}

					var1.packetBuffer.writeLengthShort(var1.packetBuffer.offset - var2);
					packetWriter.addNode(var1);
				}

				if (field461 > 0) {
					--field461;
				}

				if (indexCheck.isValidIndexInRange(96) || indexCheck.isValidIndexInRange(97) || indexCheck.isValidIndexInRange(98) || indexCheck.isValidIndexInRange(99)) {
					field371 = true;
				}

				if (field371 && field461 <= 0) {
					field461 = 20;
					field371 = false;
					var1 = HorizontalAlignment.getPacketBufferNode(ClientPacket.EVENT_CAMERA_POSITION, packetWriter.isaacCipher);
					var1.packetBuffer.writeShortAddLE(camAngleY);
					var1.packetBuffer.writeShortAdd(camAngleX);
					packetWriter.addNode(var1);
				}

				if (GameEngine.hasFocus && !hadFocus) {
					hadFocus = true;
					var1 = HorizontalAlignment.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
					var1.packetBuffer.writeByte(1);
					packetWriter.addNode(var1);
				}

				if (!GameEngine.hasFocus && hadFocus) {
					hadFocus = false;
					var1 = HorizontalAlignment.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
					var1.packetBuffer.writeByte(0);
					packetWriter.addNode(var1);
				}

				if (class50.worldMap != null) {
					class50.worldMap.method10836();
				}

				class363.method7535();
				Iterator var44;
				WorldView var54;
				if (Actor.field1066) {
					var44 = worldViewManager.iterator();

					while (var44.hasNext()) {
						var54 = (WorldView)var44.next();

						for (var3 = 0; var3 < playerUpdateManager.playerCount; ++var3) {
							Player var31 = (Player)class547.topLevelWorldView.players.get((long)playerUpdateManager.playerIndices[var3]);
							if (var31 != null) {
								var31.method2246();
							}
						}
					}

					Actor.field1066 = false;
				}

				int var32;
				if (field549 != class547.topLevelWorldView.plane) {
					field549 = class547.topLevelWorldView.plane;
					var32 = class547.topLevelWorldView.plane;
					int[] var55 = class135.sceneMinimapSprite.pixels;
					var3 = var55.length;

					for (var4 = 0; var4 < var3; ++var4) {
						var55[var4] = 1;
					}

					for (var4 = 1; var4 < 103; ++var4) {
						var5 = (103 - var4) * 2048 + 24628;

						for (var6 = 1; var6 < 103; ++var6) {
							if ((class547.topLevelWorldView.tileSettings[var32][var6][var4] & 24) == 0) {
								class547.topLevelWorldView.scene.drawTileMinimap(var55, var5, 512, var32, var6, var4);
							}

							if (var32 < 3 && (class547.topLevelWorldView.tileSettings[var32 + 1][var6][var4] & 8) != 0) {
								class547.topLevelWorldView.scene.drawTileMinimap(var55, var5, 512, var32 + 1, var6, var4);
							}

							var5 += 4;
						}
					}

					var4 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
					var5 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
					class135.sceneMinimapSprite.setRaster();

					for (var6 = 1; var6 < 103; ++var6) {
						for (var7 = 1; var7 < 103; ++var7) {
							if ((class547.topLevelWorldView.tileSettings[var32][var7][var6] & 24) == 0) {
								SongTask.drawObject(var32, var7, var6, var4, var5);
							}

							if (var32 < 3 && (class547.topLevelWorldView.tileSettings[var32 + 1][var7][var6] & 8) != 0) {
								SongTask.drawObject(var32 + 1, var7, var6, var4, var5);
							}
						}
					}

					mapIconCount = 0;

					for (var6 = 0; var6 < 104; ++var6) {
						for (var7 = 0; var7 < 104; ++var7) {
							long var33 = class547.topLevelWorldView.scene.getFloorDecorationTag(class547.topLevelWorldView.plane, var6, var7);
							if (0L != var33) {
								var10 = BuddyRankComparator.Entity_unpackID(var33);
								var11 = TileItem.getObjectDefinition(var10).mapIconId;
								if (var11 >= 0 && LoginState.WorldMapElement_get(var11).field1994) {
									mapIcons[mapIconCount] = LoginState.WorldMapElement_get(var11).getSpriteBool(false);
									mapIconXs[mapIconCount] = var6;
									mapIconYs[mapIconCount] = var7;
									++mapIconCount;
								}
							}
						}
					}

					class409.rasterProvider.apply();
				}

				if (gameState == 30) {
					var44 = worldViewManager.iterator();

					while (var44.hasNext()) {
						var54 = (WorldView)var44.next();

						for (PendingSpawn var35 = (PendingSpawn)var54.pendingSpawns.last(); var35 != null; var35 = (PendingSpawn)var54.pendingSpawns.previous()) {
							if (var35.hitpoints > 0) {
								--var35.hitpoints;
							}

							ObjectComposition var36;
							boolean var47;
							if (var35.hitpoints == 0) {
								if (var35.objectId >= 0) {
									var5 = var35.objectId;
									var6 = var35.field1012;
									var36 = TileItem.getObjectDefinition(var5);
									if (var6 == 11) {
										var6 = 10;
									}

									if (var6 >= 5 && var6 <= 8) {
										var6 = 4;
									}

									var47 = var36.method4676(var6);
									if (!var47) {
										continue;
									}
								}

								FontName.addPendingSpawnToScene(var54, var35.plane, var35.type, var35.x, var35.y, var35.objectId, var35.field1011, var35.field1012, var35.field1009);
								var35.remove();
							} else {
								if (var35.delay > 0) {
									--var35.delay;
								}

								if (var35.delay == 0 && var35.x >= 1 && var35.y >= 1 && var35.x <= 102 && var35.y <= 102) {
									if (var35.field1025 >= 0) {
										var5 = var35.field1025;
										var6 = var35.field1015;
										var36 = TileItem.getObjectDefinition(var5);
										if (var6 == 11) {
											var6 = 10;
										}

										if (var6 >= 5 && var6 <= 8) {
											var6 = 4;
										}

										var47 = var36.method4676(var6);
										if (!var47) {
											continue;
										}
									}

									FontName.addPendingSpawnToScene(var54, var35.plane, var35.type, var35.x, var35.y, var35.field1025, var35.field1019, var35.field1015, var35.field1009);
									var35.delay = -1;
									if (var35.objectId == var35.field1025 && var35.objectId == -1) {
										var35.remove();
									} else if (var35.field1025 == var35.objectId && var35.field1011 == var35.field1019 && var35.field1015 == var35.field1012) {
										var35.remove();
									}
								}
							}
						}
					}

					int var14;
					int var10002;
					int var39;
					for (var32 = 0; var32 < class57.soundEffectCount; ++var32) {
						var10002 = class57.queuedSoundEffectDelays[var32]--;
						if (class57.queuedSoundEffectDelays[var32] < -10) {
							--class57.soundEffectCount;

							for (var3 = var32; var3 < class57.soundEffectCount; ++var3) {
								class57.soundEffectIds[var3] = class57.soundEffectIds[var3 + 1];
								class57.soundEffects[var3] = class57.soundEffects[var3 + 1];
								class57.soundLocations[var3] = class57.soundLocations[var3 + 1];
								class57.field811[var3] = class57.field811[var3 + 1];
								class57.queuedSoundEffectLoops[var3] = class57.queuedSoundEffectLoops[var3 + 1];
								class57.queuedSoundEffectDelays[var3] = class57.queuedSoundEffectDelays[var3 + 1];
								class57.field813[var3] = class57.field813[var3 + 1];
								class57.field812[var3] = class57.field812[var3 + 1];
							}

							--var32;
						} else {
							SoundEffect var56 = class57.soundEffects[var32];
							if (var56 == null) {
								var3 = PacketWriter.field1291.getGroupFileCount(class57.field811[var32]) - 1;
								var10000 = null;
								var56 = SoundEffect.readSoundEffect(PacketWriter.field1291, class57.field811[var32], var3);
								if (var56 == null) {
									continue;
								}

								int[] var80 = class57.queuedSoundEffectDelays;
								var80[var32] += var56.calculateDelay();
								class57.soundEffects[var32] = var56;
							}

							if (class57.queuedSoundEffectDelays[var32] < 0) {
								if (class57.soundLocations[var32] != 0) {
									var4 = Coord.method7440(class57.soundLocations[var32] & 255);
									var5 = class57.soundLocations[var32] >> 16 & 255;
									var6 = class57.soundLocations[var32] >> 8 & 255;
									var7 = class57.soundEffectIds[var32];
									WorldView var37 = worldViewManager.getWorldView(var7);
									class450 var38 = Varcs.method3022(var37, Coord.method7440(var5), Coord.method7440(var6));
									var11 = (int)var38.field5216;
									var10 = var11 >> 7;
									var14 = (int)var38.field5219;
									var39 = var14 >> 7;
									var38.method9065();
									class450 var16 = worldViewManager.method2371();
									int var17 = Math.abs(Coord.method7425(var10) - (int)var16.field5216);
									int var18 = Math.abs(Coord.method7425(var39) - (int)var16.field5219);
									var16.method9065();
									int var19 = Math.max(var18 + var17 - 128, 0);
									int var20 = Math.max(Coord.method7440((class57.field813[var32] & 31) - 1), 0);
									WorldEntity var21 = worldViewManager.method2396();
									WorldEntity var22 = worldViewManager.method2395(var7);
									boolean var23 = class57.field812[var32];
									boolean var24 = class164.method4070(var21, var22, var23);
									if (var19 >= var4 || !var24) {
										class57.queuedSoundEffectDelays[var32] = -100;
										continue;
									}

									float var25 = var20 < var4 ? Math.min(Math.max((float)(var4 - var19) / (float)(var4 - var20), 0.0F), 1.0F) : 1.0F;
									var3 = (int)(var25 * (float)class154.clientPreferences.getAreaSoundEffectsVolume());
								} else {
									var3 = class154.clientPreferences.getSoundEffectsVolume();
								}

								if (var3 > 0) {
									RawSound var58 = var56.method3110(class154.clientPreferences.method2624());
									RawPcmStream var40 = RawPcmStream.createRawPcmStream(var58, 100, var3);
									if (var40 != null) {
										var40.setNumLoops(class57.queuedSoundEffectLoops[var32] - 1);
										class4.pcmStreamMixer.addSubStream(var40);
									}
								}

								class57.queuedSoundEffectDelays[var32] = -100;
							}
						}
					}

					Iterator var59;
					if (playingJingle && !class155.method3939()) {
						if (class154.clientPreferences.getMusicVolume() != 0 && WorldMapAreaData.method6932()) {
							Archive var45 = class443.field5180;
							var2 = class154.clientPreferences.getMusicVolume();
							if (!class338.field3891.isEmpty()) {
								ArrayList var64 = new ArrayList();
								var59 = class338.field3891.iterator();

								while (var59.hasNext()) {
									MidiRequest var71 = (MidiRequest)var59.next();
									var71.field4021 = false;
									var71.field4025 = false;
									var71.field4023 = false;
									var71.field4015 = false;
									var71.musicTrackArchive = var45;
									var71.musicTrackVolume = var2;
									var71.field4019 = 0.0F;
									var64.add(var71);
								}

								TextureProvider.method5489(var64, class338.musicPlayerStatus, class338.field3899, class338.field3896, class338.field3901, false);
							}
						}

						playingJingle = false;
					}

					++packetWriter.field1294;
					if (packetWriter.field1294 > 750) {
						class199.method4473();
					} else {
						Buddy.method10159();
						RouteStrategy.method6248();
						Varcs.method3024();
						class142.method3825();
						++graphicsCycle;
						if (mouseCrossColor != 0) {
							mouseCrossState = mouseCrossState * 400 + 400;
							if (mouseCrossState * 20 >= 400) {
								mouseCrossColor = 0;
							}
						}

						if (field557 > 0) {
							--field557;
						}

						Widget var46 = class280.mousedOverWidgetIf1;
						Widget var57 = ChatChannel.field800;
						class280.mousedOverWidgetIf1 = null;
						ChatChannel.field800 = null;
						draggedOnWidget = null;
						field411 = false;
						field513 = false;
						field434 = 0;

						while (indexCheck.method6130() && field434 < 128) {
							if (staffModLevel >= 2 && indexCheck.isValidIndexInRange(82) && indexCheck.field3213 == 66) {
								StringBuilder var60 = new StringBuilder();

								Message var41;
								for (Iterator var72 = Messages.Messages_hashTable.iterator(); var72.hasNext(); var60.append(var41.text).append('\n')) {
									var41 = (Message)var72.next();
									if (var41.sender != null && !var41.sender.isEmpty()) {
										var60.append(var41.sender).append(':');
									}
								}

								String var65 = var60.toString();
								class32.client.method504(var65);
							} else if (oculusOrbState != 1 || indexCheck.field3207 <= 0) {
								field568[field434] = indexCheck.field3213;
								field423[field434] = indexCheck.field3207;
								++field434;
							}
						}

						if (WorldMapRenderer.method6671() && indexCheck.isValidIndexInRange(82) && indexCheck.isValidIndexInRange(81) && mouseWheelRotation != 0) {
							var3 = class159.localPlayer.plane - mouseWheelRotation;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > 3) {
								var3 = 3;
							}

							if (var3 != class159.localPlayer.plane) {
								FloorOverlayDefinition.method4817(class159.localPlayer.pathX[0] + class547.topLevelWorldView.baseX, class159.localPlayer.pathY[0] + class547.topLevelWorldView.baseY, var3, false);
							}

							mouseWheelRotation = 0;
						}

						if (rootInterface != -1) {
							Projection.updateRootInterface(rootInterface, 0, 0, class4.canvasWidth, class558.canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							Widget var61;
							ScriptEvent var66;
							Widget var73;
							do {
								var66 = (ScriptEvent)scriptEvents2.removeLast();
								if (var66 == null) {
									while (true) {
										do {
											var66 = (ScriptEvent)scriptEvents3.removeLast();
											if (var66 == null) {
												while (true) {
													do {
														var66 = (ScriptEvent)scriptEvents.removeLast();
														if (var66 == null) {
															boolean var49 = false;

															while (true) {
																class272 var62 = (class272)field360.removeLast();
																if (var62 == null) {
																	if (!var49 && MouseHandler.MouseHandler_lastButton == 1) {
																		field491.method6096();
																	}

																	this.menu();
																	if (class50.worldMap != null) {
																		class50.worldMap.method10794(class547.topLevelWorldView.plane, (field484 >> 7) + class547.topLevelWorldView.baseX, (field377 >> 7) + class547.topLevelWorldView.baseY, false);
																		class50.worldMap.loadCache();
																	}

																	if (clickedWidget != null) {
																		this.method832();
																	}

																	var59 = worldViewManager.iterator();

																	while (var59.hasNext()) {
																		WorldView var77 = (WorldView)var59.next();
																		Scene var74 = var77.scene;
																		if (var74.shouldSendWalk()) {
																			var7 = var74.baseX;
																			var8 = var74.baseY;
																			PacketBufferNode var70 = HorizontalAlignment.getPacketBufferNode(ClientPacket.MOVE_GAMECLICK, packetWriter.isaacCipher);
																			var70.packetBuffer.writeByte(5);
																			var70.packetBuffer.writeShortAdd(var8 + var77.baseY);
																			var70.packetBuffer.writeByte(indexCheck.isValidIndexInRange(82) ? (indexCheck.isValidIndexInRange(81) ? 2 : 1) : 0);
																			var70.packetBuffer.writeShortAddLE(var7 + var77.baseX);
																			packetWriter.addNode(var70);
																			mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																			mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																			mouseCrossColor = 1;
																			mouseCrossState = 0;
																			destinationX = var7;
																			destinationY = var8;
																			var74.method5219();
																		}
																	}

																	if (var46 != class280.mousedOverWidgetIf1) {
																		if (var46 != null) {
																			class154.invalidateWidget(var46);
																		}

																		if (class280.mousedOverWidgetIf1 != null) {
																			class154.invalidateWidget(class280.mousedOverWidgetIf1);
																		}
																	}

																	if (var57 != ChatChannel.field800 && field499 == field500) {
																		if (var57 != null) {
																			class154.invalidateWidget(var57);
																		}

																		if (ChatChannel.field800 != null) {
																			class154.invalidateWidget(ChatChannel.field800);
																		}
																	}

																	if (ChatChannel.field800 != null) {
																		if (field499 < field500) {
																			++field499;
																			if (field499 == field500) {
																				class154.invalidateWidget(ChatChannel.field800);
																			}
																		}
																	} else if (field499 > 0) {
																		--field499;
																	}

																	if (oculusOrbState == 0) {
																		WorldView var63 = worldViewManager.getWorldView(field327);
																		if (var63 == null) {
																			var63 = class547.topLevelWorldView;
																		}

																		Object var78 = null;
																		switch(GrandExchangeOffer.USERNAME_PASSWORD.field4428) {
																		case 0:
																			var78 = (Entity)var63.players.get((long)field328);
																			break;
																		case 1:
																			var78 = (Entity)var63.npcs.get((long)field328);
																			break;
																		case 2:
																			var78 = (Entity)var63.worldEntities.get((long)field328);
																		}

																		if (var78 == null) {
																			var78 = class159.localPlayer;
																		}

																		field484 = ((Entity)var78).getY();
																		field377 = ((Entity)var78).getPlane();
																		if (var63 != class547.topLevelWorldView) {
																			class450 var75 = Varcs.method3022(var63, ((Entity)var78).getY(), ((Entity)var78).getPlane());
																			field484 = (int)var75.field5216;
																			field377 = (int)var75.field5219;
																			var75.method9065();
																		}

																		var6 = ((Entity)var78).getX();
																		if (class454.oculusOrbFocalPointX - field484 >= -500 && class454.oculusOrbFocalPointX - field484 <= 500 && WorldMapElement.oculusOrbFocalPointY - field377 >= -500 && WorldMapElement.oculusOrbFocalPointY - field377 <= 500) {
																			if (field484 != class454.oculusOrbFocalPointX) {
																				class454.oculusOrbFocalPointX += (field484 - class454.oculusOrbFocalPointX) / 16;
																			}

																			if (WorldMapElement.oculusOrbFocalPointY != field377) {
																				WorldMapElement.oculusOrbFocalPointY += (field377 - WorldMapElement.oculusOrbFocalPointY) / 16;
																			}
																		} else {
																			class454.oculusOrbFocalPointX = field484;
																			WorldMapElement.oculusOrbFocalPointY = field377;
																		}

																		var7 = class454.oculusOrbFocalPointX >> 7;
																		var8 = WorldMapElement.oculusOrbFocalPointY >> 7;
																		var9 = class280.getTileHeight(class547.topLevelWorldView, class454.oculusOrbFocalPointX, WorldMapElement.oculusOrbFocalPointY, var6);
																		var10 = 0;
																		if (var7 > 3 && var8 > 3 && var7 < 100 && var8 < 100) {
																			for (var11 = var7 - 4; var11 <= var7 + 4; ++var11) {
																				for (var12 = var8 - 4; var12 <= var8 + 4; ++var12) {
																					var39 = var6;
																					if (var6 < 3 && (class547.topLevelWorldView.tileSettings[1][var11][var12] & 2) == 2) {
																						var39 = var6 + 1;
																					}

																					var14 = var9 - class547.topLevelWorldView.tileHeights[var39][var11][var12];
																					if (var14 > var10) {
																						var10 = var14;
																					}
																				}
																			}
																		}

																		var11 = var10 * 192;
																		if (var11 > 98048) {
																			var11 = 98048;
																		}

																		if (var11 < 32768) {
																			var11 = 32768;
																		}

																		if (var11 > field516) {
																			field516 += (var11 - field516) / 24;
																		} else if (var11 < field516) {
																			field516 += (var11 - field516) / 80;
																		}

																		var39 = ((Entity)var78).getY();
																		var14 = ((Entity)var78).getPlane();
																		int var15 = class280.getTileHeight(var63, var39, var14, var6);
																		WorldEntity var53 = (WorldEntity)class547.topLevelWorldView.worldEntities.get((long)var63.id);
																		if (var53 != null) {
																			var15 += class280.getTileHeight(class547.topLevelWorldView, var53.getY(), var53.getPlane(), var53.getX());
																		}

																		field572 = var15;
																		class32.oculusOrbFocalPointZ = field572 - camFollowHeight;
																	} else if (oculusOrbState == 1) {
																		if (field440 && class159.localPlayer != null) {
																			var4 = class159.localPlayer.pathX[0];
																			var5 = class159.localPlayer.pathY[0];
																			if (var4 >= 0 && 104 > var4 && var5 >= 0 && 104 > var5) {
																				class454.oculusOrbFocalPointX = class159.localPlayer.x;
																				var6 = class280.getTileHeight(class547.topLevelWorldView, class159.localPlayer.x, class159.localPlayer.y, class547.topLevelWorldView.plane) - camFollowHeight;
																				if (var6 < class32.oculusOrbFocalPointZ) {
																					class32.oculusOrbFocalPointZ = var6;
																				}

																				WorldMapElement.oculusOrbFocalPointY = class159.localPlayer.y;
																				field440 = false;
																			}
																		}

																		short var48 = -1;
																		if (indexCheck.isValidIndexInRange(33)) {
																			var48 = 0;
																		} else if (indexCheck.isValidIndexInRange(49)) {
																			var48 = 1024;
																		}

																		if (indexCheck.isValidIndexInRange(48)) {
																			if (var48 == 0) {
																				var48 = 1792;
																			} else if (var48 == 1024) {
																				var48 = 1280;
																			} else {
																				var48 = 1536;
																			}
																		} else if (indexCheck.isValidIndexInRange(50)) {
																			if (var48 == 0) {
																				var48 = 256;
																			} else if (var48 == 1024) {
																				var48 = 768;
																			} else {
																				var48 = 512;
																			}
																		}

																		byte var51 = 0;
																		if (indexCheck.isValidIndexInRange(35)) {
																			var51 = -1;
																		} else if (indexCheck.isValidIndexInRange(51)) {
																			var51 = 1;
																		}

																		var6 = 0;
																		if (var48 >= 0 || var51 != 0) {
																			var6 = indexCheck.isValidIndexInRange(81) ? oculusOrbSlowedSpeed : oculusOrbNormalSpeed;
																			var6 *= 16;
																			field432 = var48;
																			field566 = var51;
																		}

																		if (field456 < var6) {
																			field456 += var6 / 8;
																			if (field456 > var6) {
																				field456 = var6;
																			}
																		} else if (field456 > var6) {
																			field456 = field456 * 9 / 10;
																		}

																		if (field456 > 0) {
																			var7 = field456 / 16;
																			if (field432 >= 0) {
																				var4 = field432 - SpriteBufferProperties.cameraYaw & 2047;
																				var8 = Rasterizer3D.Rasterizer3D_sine[var4];
																				var9 = Rasterizer3D.Rasterizer3D_cosine[var4];
																				class454.oculusOrbFocalPointX += var7 * var8 / 65536;
																				WorldMapElement.oculusOrbFocalPointY += var7 * var9 / 65536;
																			}

																			if (field566 != 0) {
																				class32.oculusOrbFocalPointZ += var7 * field566;
																				if (class32.oculusOrbFocalPointZ > 0) {
																					class32.oculusOrbFocalPointZ = 0;
																				}
																			}
																		} else {
																			field432 = -1;
																			field566 = -1;
																		}

																		char var52 = '耀';
																		if (var52 > field516) {
																			field516 += (var52 - field516) / 24;
																		} else if (var52 < field516) {
																			field516 += (var52 - field516) / 80;
																		}

																		if (indexCheck.isValidIndexInRange(13)) {
																			packetWriter.addNode(HorizontalAlignment.getPacketBufferNode(ClientPacket.FREECAM_EXIT, packetWriter.isaacCipher));
																			oculusOrbState = 0;
																		}
																	}

																	if (MouseHandler.MouseHandler_currentButton == 4 && ObjectComposition.mouseCam) {
																		var4 = MouseHandler.MouseHandler_y - mouseCamClickedY;
																		camAngleDX = var4 * 2;
																		mouseCamClickedY = var4 != -1 && var4 != 1 ? (mouseCamClickedY + MouseHandler.MouseHandler_y) / 2 : MouseHandler.MouseHandler_y;
																		var5 = mouseCamClickedX - MouseHandler.MouseHandler_x;
																		camAngleDY = var5 * 2;
																		mouseCamClickedX = var5 != -1 && var5 != 1 ? (MouseHandler.MouseHandler_x + mouseCamClickedX) / 2 : MouseHandler.MouseHandler_x;
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

																	if (field429) {
																		class483.method9883();
																	} else if (isCameraLocked) {
																		HttpQueryParams.method10639();
																	}

																	for (var4 = 0; var4 < 5; ++var4) {
																		var10002 = field569[var4]++;
																	}

																	ModeWhere.varcs.tryWrite();
																	var4 = ClientPreferences.method2732();
																	var5 = GameEngine.keyHandler.method347();
																	PacketBufferNode var68;
																	if (var4 > 15000 && var5 > 15000) {
																		logoutTimer = 250;
																		class40.method771(14500);
																		var68 = HorizontalAlignment.getPacketBufferNode(ClientPacket.EVENT_MOUSE_IDLE, packetWriter.isaacCipher);
																		packetWriter.addNode(var68);
																	}

																	KitDefinition.friendSystem.processFriendUpdates();

																	for (var7 = 0; var7 < field595.size(); ++var7) {
																		if (class150.method3908((Integer)field595.get(var7)) != 2) {
																			field595.remove(var7);
																			--var7;
																		}
																	}

																	++packetWriter.pendingWrites;
																	if (packetWriter.pendingWrites > 50) {
																		var68 = HorizontalAlignment.getPacketBufferNode(ClientPacket.NO_TIMEOUT, packetWriter.isaacCipher);
																		packetWriter.addNode(var68);
																	}

																	try {
																		packetWriter.flush();
																	} catch (IOException var42) {
																		class199.method4473();
																	}

																	class32.method493().method5991();
																	return;
																}

																if (var62.field3206.type == 12) {
																	var49 = true;
																}

																if (var62 != null && var62.field3206 != null) {
																	if (var62.field3206.childIndex * -2066937045 >= 0) {
																		var73 = class35.widgetDefinition.method7496(var62.field3206.parentId);
																		if (var73 == null || var73.children == null || var73.children.length == 0 || var62.field3206.childIndex * -2066937045 >= var73.children.length || var73.children[var62.field3206.childIndex * -2066937045] != var62.field3206) {
																			continue;
																		}
																	}

																	if (var62.field3206.type == 11 && var62.field3205 == 0) {
																		if (var62.field3206.method7950(var62.field3203, var62.field3204, 0, 0)) {
																			var62.field3206.method7957().method5916().method6001(1, var62.field3206.method7957().method5891());
																			switch(var62.field3206.method8025()) {
																			case 0:
																				class114.openURL(var62.field3206.method7956());
																				break;
																			case 1:
																				var6 = MouseRecorder.getWidgetFlags(var62.field3206);
																				boolean var50 = (var6 >> 22 & 1) != 0;
																				if (var50) {
																					int[] var67 = var62.field3206.method8075();
																					if (var67 != null) {
																						PacketBufferNode var69 = HorizontalAlignment.getPacketBufferNode(ClientPacket.IF_CRMVIEW, packetWriter.isaacCipher);
																						var69.packetBuffer.writeShortAddLE(var62.field3206.childIndex * -2066937045);
																						var69.packetBuffer.writeIntIME(var62.field3206.id);
																						var69.packetBuffer.writeIntME(var62.field3206.method7955());
																						var69.packetBuffer.writeIntLE(var67[1]);
																						var69.packetBuffer.writeIntIME(var67[0]);
																						var69.packetBuffer.writeInt(var67[2]);
																						packetWriter.addNode(var69);
																					}
																				}
																			}
																		}
																	} else if (var62.field3206.type == 12) {
																		class365 var76 = var62.field3206.method8041();
																		if (var76 != null && var76.method7660()) {
																			switch(var62.field3205) {
																			case 0:
																				field491.method6116(var62.field3206);
																				var76.method7883(true);
																				var76.method7763(var62.field3203, var62.field3204, indexCheck.isValidIndexInRange(82), indexCheck.isValidIndexInRange(81));
																				break;
																			case 1:
																				var76.method7649(var62.field3203, var62.field3204);
																			}
																		}
																	}
																}
															}
														}

														var61 = var66.widget;
														if (var61.childIndex * -2066937045 < 0) {
															break;
														}

														var73 = class35.widgetDefinition.method7496(var61.parentId);
													} while(var73 == null || var73.children == null || var61.childIndex * -2066937045 >= var73.children.length || var61 != var73.children[var61.childIndex * -2066937045]);

													class332.runScriptEvent(var66);
												}
											}

											var61 = var66.widget;
											if (var61.childIndex * -2066937045 < 0) {
												break;
											}

											var73 = class35.widgetDefinition.method7496(var61.parentId);
										} while(var73 == null || var73.children == null || var61.childIndex * -2066937045 >= var73.children.length || var61 != var73.children[var61.childIndex * -2066937045]);

										class332.runScriptEvent(var66);
									}
								}

								var61 = var66.widget;
								if (var61.childIndex * -2066937045 < 0) {
									break;
								}

								var73 = class35.widgetDefinition.method7496(var61.parentId);
							} while(var73 == null || var73.children == null || var61.childIndex * -2066937045 >= var73.children.length || var61 != var73.children[var61.childIndex * -2066937045]);

							class332.runScriptEvent(var66);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("qb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-807998391"
	)
	void method818() {
		if (MouseHandler.MouseHandler_lastButton == 1 || !ObjectComposition.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
			long var1 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis;
			if (var1 > 32767L) {
				var1 = 32767L;
			}

			mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis;
			int var3 = MouseHandler.MouseHandler_lastPressedY;
			if (var3 < 0) {
				var3 = 0;
			} else if (var3 > class558.canvasHeight) {
				var3 = class558.canvasHeight;
			}

			int var4 = MouseHandler.MouseHandler_lastPressedX;
			if (var4 < 0) {
				var4 = 0;
			} else if (var4 > class4.canvasWidth) {
				var4 = class4.canvasWidth;
			}

			int var5 = (int)var1;
			PacketBufferNode var6 = HorizontalAlignment.getPacketBufferNode(ClientPacket.EVENT_MOUSE_CLICK, packetWriter.isaacCipher);
			var6.packetBuffer.writeByteSub(0);
			var6.packetBuffer.writeShortAdd(var4);
			var6.packetBuffer.writeShortLE((var5 << 1) + (MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0));
			var6.packetBuffer.writeShortLE(var3);
			packetWriter.addNode(var6);
		}

	}

	@ObfuscatedName("qw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-283061629"
	)
	public void vmethod7348(int var1, int var2) {
		if (packetWriter != null && packetWriter.isaacCipher != null) {
			if (var1 > -1 && class154.clientPreferences.getMusicVolume() > 0 && !playingJingle) {
				PacketBufferNode var3 = HorizontalAlignment.getPacketBufferNode(ClientPacket.MUSIC_PLAYING, packetWriter.isaacCipher);
				var3.packetBuffer.writeInt(var1);
				packetWriter.addNode(var3);
			}

		}
	}

	@ObfuscatedName("qa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		int var1;
		if (rootInterface != -1) {
			var1 = rootInterface;
			if (class35.widgetDefinition.loadInterface(var1)) {
				UserComparator9.drawModelComponents(class35.widgetDefinition.Widget_interfaceComponents[var1], 0, class35.widgetDefinition.Widget_interfaceComponents[var1].length - 1, -1, -1);
			}
		}

		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (validRootWidgets[var1]) {
				field539[var1] = true;
			}

			field540[var1] = validRootWidgets[var1];
			validRootWidgets[var1] = false;
		}

		field533 = cycle;
		viewportX = -1;
		viewportY = -1;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			class153.drawWidgets(rootInterface, 0, 0, class4.canvasWidth, class558.canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				class198.crossSprites[mouseCrossState * 20 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				class198.crossSprites[mouseCrossState * 20 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
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
						var5 = "Use" + " " + field485 + " " + "->";
					} else if (isSpellSelected && menu.menuOptionsCount < 2) {
						var5 = selectedSpellActionName + " " + selectedSpellName + " " + "->";
					} else {
						var5 = menu.method12043(var3);
					}

					if (menu.menuOptionsCount > 2) {
						var5 = var5 + class171.colorStartTag(16777215) + " " + '/' + " " + (menu.menuOptionsCount - 2) + " more options";
					}

					class70.fontBold12.drawRandomAlphaAndSpacing(var5, var1 + 4, var2 + 15, 16777215, 0, cycle / 1000);
				}
			}
		} else {
			menu.method12037();
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field540[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field539[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		this.method822();
	}

	@ObfuscatedName("qp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-449362927"
	)
	void method822() {
		class450 var1 = worldViewManager.method2371();
		WorldEntity var2 = worldViewManager.method2396();
		int var3 = (int)var1.field5218;
		int var4 = (int)var1.field5216;
		int var5 = (int)var1.field5219;
		int var6 = graphicsCycle;
		Iterator var7 = worldViewManager.iterator();

		while (var7.hasNext()) {
			WorldView var8 = (WorldView)var7.next();

			for (ObjectSound var9 = (ObjectSound)var8.method2741().last(); var9 != null; var9 = (ObjectSound)var8.method2741().previous()) {
				var9.method2276(var2, var3, var4, var5, var6);
			}
		}

		var1.method9065();
		graphicsCycle = 0;
	}

	@ObfuscatedName("qn")
	@ObfuscatedSignature(
		descriptor = "(Lds;B)Z",
		garbageValue = "0"
	)
	boolean method1377(PacketWriter var1) {
		if (var1.serverPacketLength == 0) {
			class445.friendsChat = null;
		} else {
			if (class445.friendsChat == null) {
				class445.friendsChat = new FriendsChat(class147.loginType, class32.client);
			}

			class445.friendsChat.method9978(var1.packetBuffer);
		}

		SoundCache.method3221();
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("qs")
	@ObfuscatedSignature(
		descriptor = "(Lds;I)Z",
		garbageValue = "1845969337"
	)
	boolean method824(PacketWriter var1) {
		if (class445.friendsChat != null) {
			class445.friendsChat.method9987(var1.packetBuffer);
		}

		SoundCache.method3221();
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("qr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1387936362"
	)
	void method825() {
		int var1 = 0;
		boolean var2 = packetWriter.field1301 > 0;

		for (int var3 = packetWriter.field1302; var1 < 100 || var2; var2 = packetWriter.field1301 > 0) {
			boolean var4 = this.method1434(packetWriter);
			if (var2) {
				int var5 = packetWriter.field1302 - var3;
				PacketWriter var10000 = packetWriter;
				var10000.field1301 -= var5;
			}

			if (!var4) {
				break;
			}

			++var1;
			var3 = packetWriter.field1302;
		}

	}

	@ObfuscatedName("qd")
	@ObfuscatedSignature(
		descriptor = "(Lds;I)Z",
		garbageValue = "-2058286358"
	)
	@Export("method1434")
	final boolean method1434(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket();
		PacketBuffer var3 = var1.packetBuffer;
		if (var2 == null) {
			return false;
		} else {
			int var6;
			String var23;
			try {
				if (var1.field1301 > 0 && !var2.isAvailable(var1.field1301)) {
					return false;
				}

				int var5;
				if (var1.serverPacket == null) {
					if (var1.field1298) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var1.field1302 += var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1294 = 0;
						var1.field1298 = false;
					}

					var3.offset = 0;
					if (var3.method11323()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var1.field1302 += var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1294 = 0;
					}

					var1.field1298 = true;
					ServerPacket[] var4 = Fonts.ServerPacket_values();
					var5 = var3.readSmartByteShortIsaac();
					if (var5 < 0 || var5 >= var4.length) {
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5];
					var1.serverPacketLength = var1.serverPacket.length;
				}

				if (var1.serverPacketLength == -1) {
					if (!var2.isAvailable(1)) {
						return false;
					}

					var1.field1302 += var2.read(var3.array, 0, 1);
					var1.serverPacketLength = var3.array[0] & 255;
				}

				if (var1.serverPacketLength == -2) {
					if (!var2.isAvailable(2)) {
						return false;
					}

					var1.field1302 += var2.read(var3.array, 0, 2);
					var3.offset = 0;
					var1.serverPacketLength = var3.readUnsignedShort();
				}

				if (!var2.isAvailable(var1.serverPacketLength)) {
					return false;
				}

				var3.offset = 0;
				var1.field1302 += var2.read(var3.array, 0, var1.serverPacketLength);
				var1.field1294 = 0;
				timer.method8297();
				var1.field1305 = var1.field1304;
				var1.field1304 = var1.field1303;
				var1.field1303 = var1.serverPacket;
				int var22;
				if (ServerPacket.LOGOUT == var1.serverPacket) {
					var22 = var3.readUnsignedByte();
					class70.forceDisconnect(var22);
					var1.serverPacket = null;
					return false;
				}

				byte var73;
				if (ServerPacket.CLAN_CHANNEL_FULL == var1.serverPacket) {
					field531 = cycleCntr;
					var73 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var73 >= 0) {
							currentClanChannels[var73] = null;
						} else {
							class341.guestClanChannel = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var73 >= 0) {
						currentClanChannels[var73] = new ClanChannel(var3);
					} else {
						class341.guestClanChannel = new ClanChannel(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_FULL_FOLLOWS == var1.serverPacket) {
					WorldMapRenderer.field3375 = var3.readUnsignedByteSub();
					class48.field674 = var3.readUnsignedByteSub();
					overheadTextLimit = var3.readUnsignedByte();

					for (var22 = class48.field674; var22 < class48.field674 + 8; ++var22) {
						for (var5 = WorldMapRenderer.field3375; var5 < WorldMapRenderer.field3375 + 8; ++var5) {
							if (class32.worldView.groundItems[overheadTextLimit][var22][var5] != null) {
								class32.worldView.groundItems[overheadTextLimit][var22][var5] = null;
								class172.updateItemPile(overheadTextLimit, var22, var5);
							}
						}
					}

					for (PendingSpawn var57 = (PendingSpawn)class32.worldView.pendingSpawns.last(); var57 != null; var57 = (PendingSpawn)class32.worldView.pendingSpawns.previous()) {
						if (var57.x >= class48.field674 && var57.x < class48.field674 + 8 && var57.y >= WorldMapRenderer.field3375 && var57.y < WorldMapRenderer.field3375 + 8 && var57.plane == overheadTextLimit) {
							var57.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var80;
				if (ServerPacket.IF_SETPLAYERHEAD == var1.serverPacket) {
					var22 = var3.readUnsignedIntLE();
					var80 = class35.widgetDefinition.method7496(var22);
					var80.modelType = 3;
					var80.modelId = class159.localPlayer.appearance.getChatHeadId();
					class154.invalidateWidget(var80);
					var1.serverPacket = null;
					return true;
				}

				int var7;
				int var8;
				int var9;
				WorldView var10;
				int var11;
				int var12;
				if (ServerPacket.field3808 == var1.serverPacket) {
					var22 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShort();
					var6 = var3.readInt();
					var7 = Coord.method7460(var6);
					var8 = Coord.method7421(var6);
					var9 = Coord.method7469(var6);
					var10 = worldViewManager.method2368(var8, var9);
					var11 = var8 - var10.baseX;
					var12 = var9 - var10.baseY;
					if (var11 >= 0 && var12 >= 0 && var11 < var10.sizeX && var12 < var10.sizeY) {
						class206.method4592(var10, var7, var11, var12, var5, var22);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_WORLDENTITY == var1.serverPacket) {
					WidgetConfigNode.method7516(class547.topLevelWorldView, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PING_STATISTICS_REQUEST == var1.serverPacket) {
					var22 = var3.readInt();
					var5 = var3.readInt();
					var6 = GameBuild.getGcDuration();
					PacketBufferNode var85 = HorizontalAlignment.getPacketBufferNode(ClientPacket.PING_STATISTICS, packetWriter.isaacCipher);
					var85.packetBuffer.writeByte(var6);
					var85.packetBuffer.writeInt(var22);
					var85.packetBuffer.writeIntME(var5);
					var85.packetBuffer.writeByteAdd(GameEngine.fps);
					packetWriter.addNode(var85);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SWAP == var1.serverPacket) {
					var6 = var3.readUnsignedShortAdd();
					var22 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedShortLE();
					var7 = var3.readUnsignedShortAdd();
					AbstractWorldMapIcon.method6885(var22, var5, var6, var7);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VAR_CLAN_DISABLE == var1.serverPacket) {
					class389.field4498 = null;
					var1.serverPacket = null;
					return true;
				}

				int var13;
				int var14;
				WorldView var15;
				int var16;
				int var17;
				if (ServerPacket.field3807 == var1.serverPacket) {
					var22 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedShortLE();
					short var72 = (short)var3.readSignedShort();
					var7 = var3.readUnsignedIntME();
					var8 = var3.readInt();
					var9 = var3.readShortLE();
					short var97 = (short)var3.readShortLE();
					var11 = var3.readShort();
					var12 = Coord.method7460(var7);
					var13 = Coord.method7421(var7);
					var14 = Coord.method7469(var7);
					var15 = worldViewManager.method2368(var13, var14);
					var16 = var13 - var15.baseX;
					var17 = var14 - var15.baseY;
					if (var16 >= 0 && var17 >= 0 && var16 < var15.sizeX && var17 < var15.sizeY) {
						Player.method2203(var15, var12, var16, var17, var22, var8, var72, var11, var97, var9, var5);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_LOOKAT == var1.serverPacket) {
					isCameraLocked = true;
					field429 = false;
					field560 = true;
					var22 = Projection.method5495(var3.readShort() & 2027);
					var5 = class324.method7036(var3.readShort() & 2027);
					var6 = var3.readUnsignedShort();
					var7 = var3.readUnsignedByte();
					field564 = new class548(class386.cameraPitch, var5, var6, var7);
					field378 = new class548(SpriteBufferProperties.cameraYaw, var22, var6, var7);
					var1.serverPacket = null;
					return true;
				}

				int var25;
				if (ServerPacket.CAM_SETANGLE == var1.serverPacket) {
					isCameraLocked = true;
					field429 = false;
					field560 = false;
					class168.field1907 = var3.readUnsignedByte();
					PlayerComposition.field4113 = var3.readUnsignedByte();
					ConcurrentMidiTask.field5357 = var3.readUnsignedShort();
					HealthBarConfig.field1176 = var3.readUnsignedByte();
					MilliClock.field3131 = var3.readUnsignedByte();
					if (MilliClock.field3131 >= 100) {
						var22 = Coord.method7425(class168.field1907);
						var5 = Coord.method7425(PlayerComposition.field4113);
						var6 = class280.getTileHeight(class547.topLevelWorldView, var22, var5, class547.topLevelWorldView.plane) - ConcurrentMidiTask.field5357;
						var7 = var22 - Huffman.cameraX;
						var8 = var6 - class514.cameraY;
						var9 = var5 - ChatChannel.cameraZ;
						var25 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9));
						class386.cameraPitch = (int)(Math.atan2((double)var8, (double)var25) * 325.9490051269531D) & 2047;
						SpriteBufferProperties.cameraYaw = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531D) & 2047;
						if (class386.cameraPitch < 128) {
							class386.cameraPitch = 128;
						}

						if (class386.cameraPitch > 383) {
							class386.cameraPitch = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOC_DEL == var1.serverPacket) {
					class399.method8291(class327.field3661);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_EVENTS == var1.serverPacket) {
					var22 = var3.readUnsignedShortAddLE();
					if (var22 == 65535) {
						var22 = -1;
					}

					var5 = var3.readUnsignedShortLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.readInt();
					var7 = var3.readUnsignedIntIME();
					var8 = var3.readUnsignedIntME();
					WidgetConfigNode var88 = (WidgetConfigNode)widgetFlags.get((long)var7);
					if (var88 != null) {
						var88.remove();
					}

					var88 = class284.method6398(var88, var22, var5, var6, var8);
					widgetFlags.put(var88, (long)var7);
					var1.serverPacket = null;
					return true;
				}

				String var96;
				if (ServerPacket.URL_OPEN == var1.serverPacket) {
					byte[] var56 = new byte[var1.serverPacketLength];
					var3.method11318(var56, 0, var56.length);
					Buffer var95 = new Buffer(var56);
					var96 = var95.readStringCp1252NullTerminated();
					class114.openURL(var96);
					var1.serverPacket = null;
					return true;
				}

				boolean var64;
				boolean var67;
				if (ServerPacket.CAM_MOVETO_EASED_CIRCULAR == var1.serverPacket) {
					isCameraLocked = true;
					field429 = false;
					field559 = true;
					AddRequestTask.field5334 = var3.readUnsignedByte();
					WorldMapSectionType.field3426 = var3.readUnsignedByte();
					var22 = var3.readUnsignedShort();
					var5 = Coord.method7425(var3.readUnsignedByte());
					var6 = Coord.method7425(var3.readUnsignedByte());
					var7 = var3.readUnsignedShort();
					field561 = var3.readBoolean();
					var8 = var3.readUnsignedByte();
					var9 = Coord.method7425(AddRequestTask.field5334);
					var25 = Coord.method7425(WorldMapSectionType.field3426);
					var64 = false;
					var67 = false;
					if (field561) {
						var11 = class514.cameraY;
						var12 = class280.getTileHeight(class547.topLevelWorldView, var9, var25, class547.topLevelWorldView.plane) - var22;
					} else {
						var11 = class280.getTileHeight(class547.topLevelWorldView, Huffman.cameraX, ChatChannel.cameraZ, class547.topLevelWorldView.plane) - class514.cameraY;
						var12 = var22;
					}

					field494 = new class546(Huffman.cameraX, ChatChannel.cameraZ, var11, var9, var25, var12, var5, var6, var7, var8);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.DYNAMICOBJECT_SPAWN == var1.serverPacket) {
					var9 = var3.readUnsignedByteNeg();
					var25 = var9 >> 2;
					var11 = var9 & 3;
					var12 = field351[var25];
					var13 = var3.readUnsignedShort();
					var6 = var3.method11426();
					var22 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var7 = var22 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					if (0 <= var7 && var7 < 103 && 0 <= var8 && var8 < 103) {
						GameBuild.method8193(var7, var8, var25, var11, var12, var13);
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var94;
				if (ServerPacket.IF_SETSCROLLPOS == var1.serverPacket) {
					var22 = var3.readUnsignedShort();
					var5 = var3.readUnsignedIntIME();
					var94 = class35.widgetDefinition.method7496(var5);
					if (var94 != null && var94.type == 0) {
						if (var22 > var94.scrollHeight - var94.height * -171267385) {
							var22 = var94.scrollHeight - var94.height * -171267385;
						}

						if (var22 < 0) {
							var22 = 0;
						}

						if (var22 != var94.scrollY) {
							var94.scrollY = var22;
							class154.invalidateWidget(var94);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				long var28;
				long var30;
				String var34;
				String var52;
				if (ServerPacket.MESSAGE_PRIVATE == var1.serverPacket) {
					var52 = var3.readStringCp1252NullTerminated();
					var28 = (long)var3.readUnsignedShort();
					var30 = (long)var3.readMedium();
					PlayerType var86 = (PlayerType)ScriptFrame.findEnumerated(class113.PlayerType_values(), var3.readUnsignedByte());
					long var32 = var30 + (var28 << 32);
					var67 = false;

					for (var13 = 0; var13 < 100; ++var13) {
						if (var32 == crossWorldMessageIds[var13]) {
							var67 = true;
							break;
						}
					}

					if (KitDefinition.friendSystem.isIgnored(new Username(var52, class147.loginType))) {
						var67 = true;
					}

					if (!var67 && field321 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var32;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var34 = AbstractFont.escapeBrackets(Calendar.method8178(FloorOverlayDefinition.method4815(var3)));
						byte var71;
						if (var86.isPrivileged) {
							var71 = 7;
						} else {
							var71 = 3;
						}

						if (var86.modIcon != -1) {
							class292.addGameMessage(var71, class132.method3671(var86.modIcon) + var52, var34);
						} else {
							class292.addGameMessage(var71, var52, var34);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				InterfaceParent var76;
				Widget var108;
				if (ServerPacket.IF_MOVESUB == var1.serverPacket) {
					var22 = var3.readUnsignedIntLE();
					var5 = var3.readUnsignedIntME();
					InterfaceParent var107 = (InterfaceParent)interfaceParents.get((long)var5);
					var76 = (InterfaceParent)interfaceParents.get((long)var22);
					if (var76 != null) {
						class136.closeInterface(var76, var107 == null || var107.group != var76.group);
					}

					if (var107 != null) {
						var107.remove();
						interfaceParents.put(var107, (long)var22);
					}

					var108 = class35.widgetDefinition.method7496(var5);
					if (var108 != null) {
						class154.invalidateWidget(var108);
					}

					var108 = class35.widgetDefinition.method7496(var22);
					if (var108 != null) {
						class154.invalidateWidget(var108);
						VarcInt.revalidateWidgetScroll(class35.widgetDefinition.Widget_interfaceComponents[var108.id >>> 16], var108, true);
					}

					if (rootInterface != -1) {
						HttpResponse.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SONG_WITH_SECONDARY == var1.serverPacket) {
					var5 = var3.readUnsignedShortAddLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					var8 = var3.readUnsignedShortLE();
					var22 = var3.readUnsignedShort();
					if (var22 == 65535) {
						var22 = -1;
					}

					var6 = var3.readUnsignedShortAddLE();
					var7 = var3.readUnsignedShortAdd();
					var9 = var3.readUnsignedShortAdd();
					ArrayList var65 = new ArrayList();
					var65.add(var22);
					var65.add(var5);
					DynamicObject.playSong(var65, var6, var7, var8, var9);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETNPCHEAD == var1.serverPacket) {
					var22 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShortLE();
					var94 = class35.widgetDefinition.method7496(var22);
					if (var94.modelType != 2 || var5 != var94.modelId) {
						var94.modelType = 2;
						var94.modelId = var5;
						class154.invalidateWidget(var94);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CLAN_SETTINGS_FULL == var1.serverPacket) {
					class187.method4329();
					var73 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var73 >= 0) {
							currentClanSettings[var73] = null;
						} else {
							class377.guestClanSettings = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var73 >= 0) {
						currentClanSettings[var73] = new ClanSettings(var3);
					} else {
						class377.guestClanSettings = new ClanSettings(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_PLAYERMODEL_OBJ == var1.serverPacket) {
					var22 = var3.readUnsignedIntLE();
					var5 = var3.readInt();
					var94 = class35.widgetDefinition.method7496(var22);
					var94.field4233.method7552(var5);
					class154.invalidateWidget(var94);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_INFO_LARGE_VIEWPORT == var1.serverPacket) {
					class404.updateNpcs(class32.worldView, false, var3);
					var1.serverPacket = null;
					return true;
				}

				Widget var24;
				if (ServerPacket.IF_SETPOSITION == var1.serverPacket) {
					var22 = var3.readSignedShort();
					var5 = var3.readUnsignedIntIME();
					var6 = var3.readShort();
					var24 = class35.widgetDefinition.method7496(var5);
					if (var22 != var24.rawX || var6 != var24.rawY || var24.xAlignment != 0 || var24.yAlignment != 0) {
						var24.rawX = var22;
						var24.rawY = var6;
						var24.xAlignment = 0;
						var24.yAlignment = 0;
						class154.invalidateWidget(var24);
						this.alignWidget(var24);
						if (var24.type == 0) {
							VarcInt.revalidateWidgetScroll(class35.widgetDefinition.Widget_interfaceComponents[var5 >> 16], var24, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3737 == var1.serverPacket) {
					var22 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedShortAddLE();
					var6 = var3.readUnsignedIntME();
					var7 = var3.readUnsignedIntLE();
					var8 = Coord.method7460(var6);
					var9 = Coord.method7421(var6);
					var25 = Coord.method7469(var6);
					WorldView var105 = worldViewManager.method2368(var9, var25);
					var12 = var9 - var105.baseX;
					var13 = var25 - var105.baseY;
					if (var12 >= 0 && var13 >= 0 && var12 < var105.sizeX && var13 < var105.sizeY) {
						GrandExchangeOfferNameComparator.method8545(var105, var8, var12, var13, var5, var7, var22);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.GRAPHICSOBJECT_SPAWN == var1.serverPacket) {
					var11 = var3.readUnsignedShortAddLE();
					var9 = var3.readUnsignedShort();
					var25 = var3.readUnsignedByteAdd();
					var6 = var3.readMedium();
					var22 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var7 = var22 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					if (var7 >= 0 && var8 >= 0 && var7 < class32.worldView.sizeX && var8 < class32.worldView.sizeY) {
						var7 = Coord.method7425(var7);
						var8 = Coord.method7425(var8);
						GraphicsObject var111 = new GraphicsObject(class32.worldView, var9, class32.worldView.plane, var7, var8, class280.getTileHeight(class32.worldView, var7, var8, class32.worldView.plane) - var25, var11, cycle);
						class32.worldView.graphicsObjects.addFirst(var111);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VARP_SMALL == var1.serverPacket) {
					var22 = var3.readUnsignedShortAddLE();
					byte var75 = var3.readByteNeg();
					Varps.Varps_temp[var22] = var75;
					if (Varps.Varps_main[var22] != var75) {
						Varps.Varps_main[var22] = var75;
					}

					class271.changeGameOptions(var22);
					changedVarps[++changedVarpCount - 1 & 31] = var22;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_NPC_UPDATE_ORIGIN == var1.serverPacket) {
					GameBuild.field4437 = var3.readUnsignedByte();
					class362.field4087 = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED == var1.serverPacket) {
					class48.field674 = var3.readUnsignedByteSub();
					WorldMapRenderer.field3375 = var3.readUnsignedByteNeg();
					overheadTextLimit = var3.readUnsignedByte();

					while (var3.offset < var1.serverPacketLength) {
						var22 = var3.readUnsignedByte();
						class327 var93 = class455.method9283()[var22];
						class399.method8291(var93);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_RUN_ENERGY == var1.serverPacket) {
					class282.method6383();
					runEnergy = var3.readUnsignedShort();
					field428 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				int var40;
				if (ServerPacket.CAM_LOOKAT_EASED_COORD == var1.serverPacket) {
					isCameraLocked = true;
					field429 = false;
					field560 = true;
					class168.field1907 = var3.readUnsignedByte();
					PlayerComposition.field4113 = var3.readUnsignedByte();
					ConcurrentMidiTask.field5357 = var3.readUnsignedShort();
					var22 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = Coord.method7425(class168.field1907);
					var7 = Coord.method7425(PlayerComposition.field4113);
					var8 = class280.getTileHeight(class547.topLevelWorldView, var6, var7, class547.topLevelWorldView.plane) - ConcurrentMidiTask.field5357;
					var9 = var6 - Huffman.cameraX;
					var25 = var8 - class514.cameraY;
					var11 = var7 - ChatChannel.cameraZ;
					double var112 = Math.sqrt((double)(var9 * var9 + var11 * var11));
					var14 = class324.method7036((int)(Math.atan2((double)var25, var112) * 325.9490051269531D) & 2047);
					var40 = Projection.method5495((int)(Math.atan2((double)var9, (double)var11) * -325.9490051269531D) & 2047);
					field564 = new class548(class386.cameraPitch, var14, var22, var5);
					field378 = new class548(SpriteBufferProperties.cameraYaw, var40, var22, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_TEXT == var1.serverPacket) {
					var52 = var3.readStringCp1252NullTerminated();
					var5 = var3.readInt();
					var94 = class35.widgetDefinition.method7496(var5);
					if (!var52.equals(var94.text)) {
						var94.text = var52;
						class154.invalidateWidget(var94);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_MODE == var1.serverPacket) {
					var22 = var3.readUnsignedByte();
					FaceNormal.method5453(var22);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.WORLDENTITY_INFO == var1.serverPacket) {
					class62.updateWorldEntitiesFromPacketBuffer(class32.worldView, var3, 6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VAR_CLAN == var1.serverPacket) {
					if (class389.field4498 == null) {
						class389.field4498 = new class523(FriendSystem.field624);
					}

					class598 var55 = FriendSystem.field624.method10565(var3);
					class389.field4498.field5619.vmethod11023(var55.field6048, var55.field6046);
					field526[++field527 - 1 & 31] = var55.field6048;
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

				if (ServerPacket.UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1 == var1.serverPacket) {
					return this.method1377(var1);
				}

				if (ServerPacket.MIDI_SONG_STOP == var1.serverPacket) {
					var22 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShortLE();
					Clock.method6092(var22, var5);
					var1.serverPacket = null;
					return true;
				}

				boolean var63;
				if (ServerPacket.IF_SET_PLAYERMODEL_SELF == var1.serverPacket) {
					var22 = var3.readUnsignedIntLE();
					var63 = var3.readUnsignedByteSub() == 1;
					var94 = class35.widgetDefinition.method7496(var22);
					var94.method8094(class159.localPlayer.appearance, var63);
					class154.invalidateWidget(var94);
					var1.serverPacket = null;
					return true;
				}

				long var41;
				if (ServerPacket.MESSAGE_CLAN_CHANNEL_SYSTEM == var1.serverPacket) {
					var73 = var3.readByte();
					var28 = (long)var3.readUnsignedShort();
					var30 = (long)var3.readMedium();
					var41 = (var28 << 32) + var30;
					var64 = false;
					ClanChannel var109 = var73 >= 0 ? currentClanChannels[var73] : class341.guestClanChannel;
					if (var109 == null) {
						var64 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) {
							if (crossWorldMessageIds[var13] == var41) {
								var64 = true;
								break;
							}
						}
					}

					if (!var64) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var41;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var34 = FloorOverlayDefinition.method4815(var3);
						var14 = var73 >= 0 ? 43 : 46;
						Player.addChatMessage(var14, "", var34, var109.name);
					}

					var1.serverPacket = null;
					return true;
				}

				boolean var98;
				if (ServerPacket.HEAT_MAP == var1.serverPacket) {
					var98 = var3.readBoolean();
					if (var98) {
						if (Occluder.field2830 == null) {
							Occluder.field2830 = new class421();
						}
					} else {
						Occluder.field2830 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETHIDE == var1.serverPacket) {
					var22 = var3.readInt();
					var63 = var3.readUnsignedByteNeg() == 1;
					var94 = class35.widgetDefinition.method7496(var22);
					if (var63 != var94.isHidden) {
						var94.isHidden = var63;
						class154.invalidateWidget(var94);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_SHAKE == var1.serverPacket) {
					var22 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedByte();
					var7 = var3.readUnsignedByte();
					field583[var22] = true;
					field453[var22] = var5;
					field567[var22] = var6;
					field323[var22] = var7;
					field569[var22] = 0;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SERVER_TICK_END == var1.serverPacket) {
					++serverCycle;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MINIMAP_TOGGLE == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3793 == var1.serverPacket) {
					MenuAction.field680 = var3.readBoolean();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL == var1.serverPacket) {
					overheadTextLimit = var3.readUnsignedByteAdd();
					class48.field674 = var3.readUnsignedByteAdd();
					WorldMapRenderer.field3375 = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_STOCKMARKET_SLOT == var1.serverPacket) {
					var22 = var3.readUnsignedByte();
					if (var3.readUnsignedByte() == 0) {
						grandExchangeOffers[var22] = new GrandExchangeOffer();
						var3.offset += 18;
					} else {
						--var3.offset;
						grandExchangeOffers[var22] = new GrandExchangeOffer(var3, false);
					}

					field532 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RUNCLIENTSCRIPT == var1.serverPacket) {
					var52 = var3.readStringCp1252NullTerminated();
					Object[] var92 = new Object[var52.length() + 1];

					for (var6 = var52.length() - 1; var6 >= 0; --var6) {
						DynamicArray var113;
						switch(var52.charAt(var6)) {
						case 'W':
							var7 = var3.packBytesToInt();
							var113 = new DynamicArray(class572.field5879, 0, var7, var7);
							int[] var84 = var113.method10430();

							for (var25 = 0; var25 < var7; ++var25) {
								var84[var25] = var3.writeIntME();
							}

							var92[var6 + 1] = var113;
							break;
						case 'X':
							var7 = var3.packBytesToInt();
							var113 = new DynamicArray(class572.field5877, (Object)null, var7, var7);
							Object[] var82 = var113.method10428();

							for (var25 = 0; var25 < var7; ++var25) {
								var82[var25] = var3.readStringCp1252NullTerminated();
							}

							var92[var6 + 1] = var113;
							break;
						case 's':
							var92[var6 + 1] = var3.readStringCp1252NullTerminated();
							break;
						default:
							var92[var6 + 1] = new Integer(var3.readInt());
						}
					}

					var92[0] = new Integer(var3.readInt());
					ScriptEvent var102 = new ScriptEvent();
					var102.args = var92;
					class332.runScriptEvent(var102);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_OPENSUB == var1.serverPacket) {
					var22 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByteAdd();
					var6 = var3.readInt();
					var76 = (InterfaceParent)interfaceParents.get((long)var6);
					if (var76 != null) {
						class136.closeInterface(var76, var22 != var76.group);
					}

					class369.openInterface(var6, var22, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.TRIGGER_ONDIALOG_ABORT == var1.serverPacket) {
					if (rootInterface != -1) {
						HttpResponse.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MAP_ANIM == var1.serverPacket) {
					class399.method8291(class327.field3659);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOC_ANIM == var1.serverPacket) {
					class399.method8291(class327.field3656);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_SPOTANIM == var1.serverPacket) {
					var22 = var3.readUnsignedShort();
					Player var110;
					if (var22 == localPlayerIndex) {
						var110 = class159.localPlayer;
					} else {
						var110 = (Player)class32.worldView.players.get((long)var22);
					}

					var7 = var3.readUnsignedByteSub();
					var6 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShort();
					if (var110 != null) {
						var110.updateSpotAnimation(var7, var5, var6 >> 16, var6 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CHAT_FILTER_SETTINGS == var1.serverPacket) {
					publicChatMode = var3.readUnsignedByteSub();
					tradeChatMode = var3.readUnsignedByteNeg();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_PLAYERMODEL_BODYTYPE == var1.serverPacket) {
					var22 = var3.readUnsignedByteAdd();
					var5 = var3.readUnsignedIntME();
					var94 = class35.widgetDefinition.method7496(var5);
					var94.field4233.method7549(class159.localPlayer.appearance.gender, var22);
					class154.invalidateWidget(var94);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOC_MERGEPLAYER == var1.serverPacket) {
					class399.method8291(class327.field3652);
					var1.serverPacket = null;
					return true;
				}

				NPC var104;
				if (ServerPacket.NPC_HEADICON_SPECIFIC == var1.serverPacket) {
					var22 = var3.readInt();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedShortAdd();
					short var68 = (short)var3.readShortLE();
					var104 = (NPC)class32.worldView.npcs.get((long)var6);
					if (var104 != null) {
						var104.method2789(var5, var22, var68);
					}

					var1.serverPacket = null;
					return true;
				}

				String var70;
				if (ServerPacket.MESSAGE_FRIEND_PRIVATE == var1.serverPacket) {
					var52 = var3.readStringCp1252NullTerminated();
					var28 = var3.readLong();
					var30 = (long)var3.readUnsignedShort();
					var41 = (long)var3.readMedium();
					PlayerType var36 = (PlayerType)ScriptFrame.findEnumerated(class113.PlayerType_values(), var3.readUnsignedByte());
					long var38 = (var30 << 32) + var41;
					boolean var69 = false;

					for (var40 = 0; var40 < 100; ++var40) {
						if (crossWorldMessageIds[var40] == var38) {
							var69 = true;
							break;
						}
					}

					if (var36.isUser && KitDefinition.friendSystem.isIgnored(new Username(var52, class147.loginType))) {
						var69 = true;
					}

					if (!var69 && field321 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var38;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var70 = AbstractFont.escapeBrackets(Calendar.method8178(FloorOverlayDefinition.method4815(var3)));
						if (var36.modIcon != -1) {
							Player.addChatMessage(9, class132.method3671(var36.modIcon) + var52, var70, class277.base37DecodeLong(var28));
						} else {
							Player.addChatMessage(9, var52, var70, class277.base37DecodeLong(var28));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETANGLE == var1.serverPacket) {
					var22 = var3.readUnsignedShortLE();
					var5 = var3.readInt();
					var6 = var3.readUnsignedShortLE();
					var7 = var3.readUnsignedShortAddLE();
					var108 = class35.widgetDefinition.method7496(var5);
					if (var6 != var108.modelAngleX || var22 != var108.modelAngleY || var7 != var108.modelZoom) {
						var108.modelAngleX = var6;
						var108.modelAngleY = var22;
						var108.modelZoom = var7;
						class154.invalidateWidget(var108);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETNPCHEAD_ACTIVE == var1.serverPacket) {
					var22 = var3.readInt();
					var5 = var3.readUnsignedShortAddLE();
					var94 = class35.widgetDefinition.method7496(var22);
					if (var94.modelType != 6 || var5 != var94.modelId) {
						var94.modelType = 6;
						var94.modelId = var5;
						class154.invalidateWidget(var94);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_ROTATE_SPEED == var1.serverPacket) {
					var22 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedShortLE();
					var6 = var3.readUnsignedShortLE();
					var24 = class35.widgetDefinition.method7496(var22);
					var24.field4241 = var5 + (var6 << 16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PROJECTILE_SPAWN == var1.serverPacket) {
					var22 = var3.method11485();
					var5 = var3.readUnsignedShortAddLE();
					var6 = var3.readUnsignedShort();
					var7 = var3.readUnsignedShortLE();
					var8 = var3.readUnsignedShortLE();
					var9 = var3.readUnsignedShortLE();
					var25 = var3.readUnsignedByteSub();
					var11 = var3.method11427();
					var12 = var3.readUnsignedShortAdd();
					var13 = var3.readUnsignedIntIME();
					var14 = Coord.method7460(var13);
					var40 = Coord.method7421(var13);
					var16 = Coord.method7469(var13);
					var17 = var3.readUnsignedIntLE();
					int var18 = Coord.method7460(var17);
					int var19 = Coord.method7421(var17);
					int var20 = Coord.method7469(var17);
					if (var12 != 65535) {
						Projectile var21 = new Projectile(var14, var40, var16, var9, var22, var18, var19, var20, var8, var11, var12, var5 + cycle, var7 + cycle, var25, var6);
						projectiles.addFirst(var21);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VARP_LARGE == var1.serverPacket) {
					var22 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedIntLE();
					Varps.Varps_temp[var22] = var5;
					if (Varps.Varps_main[var22] != var5) {
						Varps.Varps_main[var22] = var5;
					}

					class271.changeGameOptions(var22);
					changedVarps[++changedVarpCount - 1 & 31] = var22;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_JINGLE == var1.serverPacket) {
					var22 = var3.readMedium();
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					SoundSystem.method3199(var5, var22);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REFLECTION_CHECKER == var1.serverPacket) {
					class477.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER == var1.serverPacket) {
					return this.method824(var1);
				}

				if (ServerPacket.EVENT_WORLDHOP == var1.serverPacket) {
					World var54 = new World();
					var54.host = var3.readStringCp1252NullTerminated();
					var54.id = var3.readUnsignedShort();
					var5 = var3.readInt();
					var54.properties = var5;
					if (var54.isDeadman()) {
						var54.field596 = "beta";
						MenuAction.field687 = true;
					} else {
						MenuAction.field687 = false;
					}

					class135.updateGameState(45);
					var2.close();
					var2 = null;
					class489.changeWorld(var54);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field3776 == var1.serverPacket) {
					var3.readLong();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SONG == var1.serverPacket) {
					var7 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedShortLE();
					var8 = var3.readUnsignedShort();
					var6 = var3.readUnsignedShort();
					var22 = var3.readUnsignedShortAddLE();
					if (var22 == 65535) {
						var22 = -1;
					}

					ArrayList var26 = new ArrayList();
					var26.add(var22);
					DynamicObject.playSong(var26, var5, var6, var7, var8);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_INFO == var1.serverPacket) {
					playerUpdateManager.method2933(var3, var1.serverPacketLength);
					class360.method7519();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_ANIM_SPECIFIC == var1.serverPacket) {
					var22 = var3.readUnsignedByteSub();
					var5 = var3.readUnsignedShortLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					class271.performPlayerAnimation(class159.localPlayer, var5, var22);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_REGION == var1.serverPacket) {
					class156.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_NORMAL == var1.serverPacket) {
					class156.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_MOVE_TO == var1.serverPacket) {
					isCameraLocked = true;
					field429 = false;
					field559 = false;
					AddRequestTask.field5334 = var3.readUnsignedByte();
					WorldMapSectionType.field3426 = var3.readUnsignedByte();
					UserComparator10.field1585 = var3.readUnsignedShort();
					ObjectSound.field983 = var3.readUnsignedByte();
					ClientPacket.field3651 = var3.readUnsignedByte();
					if (ClientPacket.field3651 >= 100) {
						Huffman.cameraX = Coord.method7425(AddRequestTask.field5334);
						ChatChannel.cameraZ = Coord.method7425(WorldMapSectionType.field3426);
						class514.cameraY = class280.getTileHeight(class547.topLevelWorldView, Huffman.cameraX, ChatChannel.cameraZ, class547.topLevelWorldView.plane) - UserComparator10.field1585;
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
					this.method972(false);
					class132.method3672(var22);
					class402.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						validRootWidgets[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_SET_SEQUENCE == var1.serverPacket) {
					var22 = var3.readUnsignedShortAdd();
					var6 = var3.readUnsignedByteAdd();
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					NPC var78 = (NPC)class32.worldView.npcs.get((long)var22);
					if (var78 != null) {
						SequenceDefinition var106 = var78.animationSequence.getSequenceDefinition();
						if (var5 == var78.method2445() && var5 != -1) {
							var9 = var106.restartMode;
							if (var9 == 1) {
								var78.animationSequence.method9630();
								var78.field1054 = var6;
							} else if (var9 == 2) {
								var78.animationSequence.method9678();
							}
						} else if (var5 == -1 || var106 == null || class171.SequenceDefinition_get(var5).field2485 >= var106.field2485) {
							var78.animationSequence.setSequence(var5);
							var78.animationSequence.method9630();
							var78.field1054 = var6;
							var78.field1094 = var78.pathLength;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SYNTH_SOUND == var1.serverPacket) {
					var22 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedShort();
					class210.queueSoundEffect(var22, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_RUN_WEIGHT == var1.serverPacket) {
					class282.method6383();
					weight = var3.readShort();
					field428 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_STOP_TRANSIT == var1.serverPacket) {
					var22 = var3.readUnsignedShortAddLE();
					AuthenticationScheme.method3660(var22);
					changedItemContainers[++changedItemsCount - 1 & 31] = var22 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETMODEL == var1.serverPacket) {
					var22 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedIntME();
					var94 = class35.widgetDefinition.method7496(var5);
					if (var94.modelType != 1 || var22 != var94.modelId) {
						var94.modelType = 1;
						var94.modelId = var22;
						class154.invalidateWidget(var94);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VAR_CLAN_ENABLE == var1.serverPacket) {
					class389.field4498 = new class523(FriendSystem.field624);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SYNC_CLIENT_VARCACHE == var1.serverPacket) {
					for (var22 = 0; var22 < Varps.Varps_main.length; ++var22) {
						if (Varps.Varps_temp[var22] != Varps.Varps_main[var22]) {
							Varps.Varps_main[var22] = Varps.Varps_temp[var22];
							class271.changeGameOptions(var22);
							changedVarps[++changedVarpCount - 1 & 31] = var22;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3736 == var1.serverPacket) {
					var1.field1301 = var3.readShort();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UNKNOWN_STRING == var1.serverPacket) {
					field325 = var3.readStringCp1252NullTerminated();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_SMOOTH_RESET == var1.serverPacket && isCameraLocked) {
					field429 = true;
					field560 = false;
					field559 = false;

					for (var22 = 0; var22 < 5; ++var22) {
						field583[var22] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_TARGET == var1.serverPacket) {
					GrandExchangeOffer.USERNAME_PASSWORD = (class381)ScriptFrame.findEnumerated(class151.method3910(), var3.readUnsignedByte());
					field327 = var3.readShort();
					field328 = var3.readUnsignedShort();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETANIM == var1.serverPacket) {
					var22 = var3.readShortLE();
					var5 = var3.readInt();
					var94 = class35.widgetDefinition.method7496(var5);
					if (var22 != var94.sequenceId || var22 == -1) {
						var94.sequenceId = var22;
						var94.modelFrame = 0;
						var94.modelFrameCycle = 0;
						class154.invalidateWidget(var94);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RESET_ANIMS == var1.serverPacket) {
					Iterator var53 = class32.worldView.players.iterator();

					while (var53.hasNext()) {
						Player var89 = (Player)var53.next();
						var89.method2446();
					}

					Iterator var91 = class32.worldView.npcs.iterator();

					while (var91.hasNext()) {
						NPC var101 = (NPC)var91.next();
						var101.method2446();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_TRADING_POST == var1.serverPacket) {
					var98 = var3.readUnsignedByte() == 1;
					if (var98) {
						ClanMate.field5445 = class281.method6373() - var3.readLong();
						HttpQueryParams.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						HttpQueryParams.grandExchangeEvents = null;
					}

					field446 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RESET_INTERACTION_MODE == var1.serverPacket) {
					var22 = var3.readShort();
					worldViewManager.method2375(var22);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_RESYNC == var1.serverPacket) {
					var22 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.method972(false);
						class132.method3672(rootInterface);
						class402.runWidgetOnLoadListener(rootInterface);

						for (var7 = 0; var7 < 100; ++var7) {
							validRootWidgets[var7] = true;
						}
					}

					InterfaceParent var62;
					for (; var6-- > 0; var62.field868 = true) {
						var7 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var9 = var3.readUnsignedByte();
						var62 = (InterfaceParent)interfaceParents.get((long)var7);
						if (var62 != null && var8 != var62.group) {
							class136.closeInterface(var62, true);
							var62 = null;
						}

						if (var62 == null) {
							var62 = class369.openInterface(var7, var8, var9);
						}
					}

					for (var76 = (InterfaceParent)interfaceParents.first(); var76 != null; var76 = (InterfaceParent)interfaceParents.next()) {
						if (var76.field868) {
							var76.field868 = false;
						} else {
							class136.closeInterface(var76, true);
						}
					}

					widgetFlags = new NodeHashTable(512);

					while (var3.offset < var22) {
						var7 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var9 = var3.readUnsignedShort();
						var25 = var3.readInt();
						var11 = var3.readInt();
						WidgetConfigNode var37 = class284.method6398((WidgetConfigNode)null, var8, var9, var25, var11);
						widgetFlags.put(var37, (long)var7);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3717 == var1.serverPacket) {
					var22 = var3.readShort();
					class516 var87 = (class516)ScriptFrame.findEnumerated(class155.method3940(), var3.readUnsignedByte());
					class514 var100 = (class514)ScriptFrame.findEnumerated(class86.method2928(), var3.readUnsignedByte());
					if (var22 == -2) {
						worldViewManager.method2373(var87, var100);
					} else {
						worldViewManager.method2374(var22, var87, var100);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_REBOOT_TIMER == var1.serverPacket) {
					rebootTimer = var3.readUnsignedShortLE() * 30;
					field428 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_FRIENDS_CHAT == var1.serverPacket) {
					var73 = var3.readByte();
					var23 = var3.readStringCp1252NullTerminated();
					long var43 = (long)var3.readUnsignedShort();
					long var45 = (long)var3.readMedium();
					PlayerType var60 = (PlayerType)ScriptFrame.findEnumerated(class113.PlayerType_values(), var3.readUnsignedByte());
					long var47 = var45 + (var43 << 32);
					boolean var66 = false;
					ClanChannel var49 = null;
					var49 = var73 >= 0 ? currentClanChannels[var73] : class341.guestClanChannel;
					if (var49 == null) {
						var66 = true;
					} else {
						var40 = 0;

						while (true) {
							if (var40 >= 100) {
								if (var60.isUser && KitDefinition.friendSystem.isIgnored(new Username(var23, class147.loginType))) {
									var66 = true;
								}
								break;
							}

							if (crossWorldMessageIds[var40] == var47) {
								var66 = true;
								break;
							}

							++var40;
						}
					}

					if (!var66) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var47;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var70 = AbstractFont.escapeBrackets(FloorOverlayDefinition.method4815(var3));
						var16 = var73 >= 0 ? 41 : 44;
						if (var60.modIcon != -1) {
							Player.addChatMessage(var16, class132.method3671(var60.modIcon) + var23, var70, var49.name);
						} else {
							Player.addChatMessage(var16, var23, var70, var49.name);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_SPOTANIM == var1.serverPacket) {
					var7 = var3.readUnsignedByte();
					var5 = var3.readUnsignedIntME();
					var6 = var3.readUnsignedShortAdd();
					var22 = var3.readUnsignedShortAdd();
					var104 = (NPC)class32.worldView.npcs.get((long)var22);
					if (var104 != null) {
						var104.updateSpotAnimation(var7, var6, var5 >> 16, var5 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CLAN_SETTINGS_DELTA == var1.serverPacket) {
					class187.method4329();
					var73 = var3.readByte();
					class153 var83 = new class153(var3);
					ClanSettings var99;
					if (var73 >= 0) {
						var99 = currentClanSettings[var73];
					} else {
						var99 = class377.guestClanSettings;
					}

					if (var99 == null) {
						this.method835(var73);
						var1.serverPacket = null;
						return true;
					}

					if (var83.field1790 > var99.field1842) {
						this.method835(var73);
						var1.serverPacket = null;
						return true;
					}

					if (var83.field1790 < var99.field1842) {
						var1.serverPacket = null;
						return true;
					}

					var83.method3920(var99);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_INFO_SMALL_VIEWPORT == var1.serverPacket) {
					class404.updateNpcs(class32.worldView, true, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_CLOSESUB == var1.serverPacket) {
					var22 = var3.readInt();
					InterfaceParent var81 = (InterfaceParent)interfaceParents.get((long)var22);
					if (var81 != null) {
						class136.closeInterface(var81, true);
					}

					if (meslayerContinueWidget != null) {
						class154.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3783 == var1.serverPacket) {
					AbstractUserComparator.field5455 = var3.readBoolean();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_CLEAR == var1.serverPacket) {
					var22 = var3.readUnsignedIntIME();
					var80 = class35.widgetDefinition.method7496(var22);

					for (var6 = 0; var6 < var80.itemIds.length; ++var6) {
						var80.itemIds[var6] = -1;
						var80.itemIds[var6] = 0;
					}

					class154.invalidateWidget(var80);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3676 == var1.serverPacket) {
					var22 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedShortAdd();
					var6 = var3.readUnsignedIntLE();
					var7 = Coord.method7460(var6);
					var8 = Coord.method7421(var6);
					var9 = Coord.method7469(var6);
					var10 = worldViewManager.method2368(var8, var9);
					var11 = var8 - var10.baseX;
					var12 = var9 - var10.baseY;
					if (0 <= var11 && var11 < var10.sizeX && 0 <= var12 && var12 < var10.sizeY) {
						AsyncHttpResponse.method275(var10, var7, var11, var12, var5, var22);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOC_ADD_CHANGE == var1.serverPacket) {
					class399.method8291(class327.field3663);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOGOUT_FULL == var1.serverPacket) {
					WorldMapElement.logOut();
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field3804 == var1.serverPacket) {
					var22 = var3.readUnsignedShort();
					var63 = var3.readUnsignedByte() == 1;
					var6 = var3.readUnsignedByteAdd();
					var7 = var3.readUnsignedIntLE();
					var8 = var3.readUnsignedShortAddLE();
					var9 = var3.readUnsignedIntLE();
					var25 = var3.readUnsignedShort();
					var11 = var3.readUnsignedByteNeg();
					var12 = Coord.method7460(var7);
					var13 = Coord.method7421(var7);
					var14 = Coord.method7469(var7);
					var15 = worldViewManager.method2368(var13, var14);
					var16 = var13 - var15.baseX;
					var17 = var14 - var15.baseY;
					if (var16 >= 0 && var17 >= 0 && var16 < var15.sizeX && var17 < var15.sizeY) {
						SoundCache.method3216(var15, var12, var16, var17, var22, var9, var11, var25, var8, var6, var63);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_GAME == var1.serverPacket) {
					var22 = var3.readUShortSmart();
					var63 = var3.readUnsignedByte() == 1;
					var96 = "";
					boolean var58 = false;
					if (var63) {
						var96 = var3.readStringCp1252NullTerminated();
						if (KitDefinition.friendSystem.isIgnored(new Username(var96, class147.loginType))) {
							var58 = true;
						}
					}

					String var103 = var3.readStringCp1252NullTerminated();
					if (!var58) {
						class292.addGameMessage(var22, var96, var103);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_PARTIAL == var1.serverPacket) {
					var22 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var22 < -70000) {
						var5 += 32768;
					}

					if (var22 >= 0) {
						var94 = class35.widgetDefinition.method7496(var22);
					} else {
						var94 = null;
					}

					for (; var3.offset < var1.serverPacketLength; class271.itemContainerSetItem(var5, var7, var8 - 1, var9)) {
						var7 = var3.readUShortSmart();
						var8 = var3.readUnsignedShort();
						var9 = 0;
						if (var8 != 0) {
							var9 = var3.readUnsignedByte();
							if (var9 == 255) {
								var9 = var3.readInt();
							}
						}

						if (var94 != null && var7 >= 0 && var7 < var94.itemIds.length) {
							var94.itemIds[var7] = var8;
							var94.itemQuantities[var7] = var9;
						}
					}

					if (var94 != null) {
						class154.invalidateWidget(var94);
					}

					class282.method6383();
					changedItemContainers[++changedItemsCount - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.FRIENDS_LIST_LOADED == var1.serverPacket) {
					KitDefinition.friendSystem.method1598();
					field470 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETCOLOUR == var1.serverPacket) {
					var22 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedShortAddLE();
					var6 = var5 >> 10 & 31;
					var7 = var5 >> 5 & 31;
					var8 = var5 & 31;
					var9 = (var7 << 11) + (var6 << 19) + (var8 << 3);
					Widget var59 = class35.widgetDefinition.method7496(var22);
					if (var9 != var59.color) {
						var59.color = var9;
						class154.invalidateWidget(var59);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_FRIENDLIST == var1.serverPacket) {
					KitDefinition.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field470 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3809 == var1.serverPacket) {
					this.method516(var3.readUnsignedByte() != 0);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_MOVETO == var1.serverPacket) {
					isCameraLocked = true;
					field429 = false;
					field559 = true;
					AddRequestTask.field5334 = var3.readUnsignedByte();
					WorldMapSectionType.field3426 = var3.readUnsignedByte();
					var22 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShort();
					field561 = var3.readBoolean();
					var6 = var3.readUnsignedByte();
					var7 = Coord.method7425(AddRequestTask.field5334);
					var8 = Coord.method7425(WorldMapSectionType.field3426);
					boolean var61 = false;
					boolean var79 = false;
					if (field561) {
						var9 = class514.cameraY;
						var25 = class280.getTileHeight(class547.topLevelWorldView, var7, var8, class547.topLevelWorldView.plane) - var22;
					} else {
						var9 = class280.getTileHeight(class547.topLevelWorldView, Huffman.cameraX, ChatChannel.cameraZ, class547.topLevelWorldView.plane) - class514.cameraY;
						var25 = var22;
					}

					field494 = new class547(Huffman.cameraX, ChatChannel.cameraZ, var9, var7, var8, var25, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3785 == var1.serverPacket) {
					Skills.field4383 = var3.readBoolean();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_RESET == var1.serverPacket) {
					field429 = false;
					isCameraLocked = false;
					field559 = false;
					field560 = false;
					class168.field1907 = 0;
					PlayerComposition.field4113 = 0;
					ConcurrentMidiTask.field5357 = 0;
					field561 = false;
					HealthBarConfig.field1176 = 0;
					MilliClock.field3131 = 0;
					ClientPacket.field3651 = 0;
					ObjectSound.field983 = 0;
					AddRequestTask.field5334 = 0;
					WorldMapSectionType.field3426 = 0;
					UserComparator10.field1585 = 0;
					field494 = null;
					field564 = null;
					field378 = null;

					for (var22 = 0; var22 < 5; ++var22) {
						field583[var22] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.HINT_ARROW == var1.serverPacket) {
					hintArrow.method8236(var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_SITE_SETTINGS == var1.serverPacket) {
					class333.method7077(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OCULUS_SYNC == var1.serverPacket) {
					var22 = var3.readInt();
					if (var22 != field459) {
						field459 = var22;
						class57.method2069();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3714 == var1.serverPacket) {
					var22 = var3.readUnsignedByte();
					var5 = var3.readUnsignedIntME();
					var6 = var3.readUnsignedShortAddLE();
					var7 = Coord.method7460(var5);
					var8 = Coord.method7421(var5);
					var9 = Coord.method7469(var5);
					var10 = worldViewManager.method2368(var8, var9);
					var11 = var8 - var10.baseX;
					var12 = var9 - var10.baseY;
					if (var11 >= 0 && var12 >= 0 && var11 < var10.sizeX && var12 < var10.sizeY) {
						GrandExchangeOfferOwnWorldComparator.method790(var10, var7, var11, var12, var6, var22);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_IGNORELIST == var1.serverPacket) {
					KitDefinition.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					Login.FriendSystem_invalidateIgnoreds();
					field470 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_FULL == var1.serverPacket) {
					var22 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var22 < -70000) {
						var5 += 32768;
					}

					if (var22 >= 0) {
						var94 = class35.widgetDefinition.method7496(var22);
					} else {
						var94 = null;
					}

					if (var94 != null) {
						for (var7 = 0; var7 < var94.itemIds.length; ++var7) {
							var94.itemIds[var7] = 0;
							var94.itemQuantities[var7] = 0;
						}
					}

					VertexNormal.clearItemContainer(var5);
					var7 = var3.readUnsignedShort();

					for (var8 = 0; var8 < var7; ++var8) {
						var9 = var3.readUnsignedByte();
						if (var9 == 255) {
							var9 = var3.readUnsignedIntLE();
						}

						var25 = var3.readUnsignedShortLE();
						if (var94 != null && var8 < var94.itemIds.length) {
							var94.itemIds[var8] = var25;
							var94.itemQuantities[var8] = var9;
						}

						class271.itemContainerSetItem(var5, var8, var25 - 1, var9);
					}

					if (var94 != null) {
						class154.invalidateWidget(var94);
					}

					class282.method6383();
					changedItemContainers[++changedItemsCount - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_LOOKAT_EASED_ANGLE_RELATIVE == var1.serverPacket) {
					isCameraLocked = true;
					field429 = false;
					field560 = true;
					var22 = var3.readShort();
					var5 = var3.readShort();
					var6 = class324.method7036(var5 + class386.cameraPitch & 2027);
					var7 = var22 + SpriteBufferProperties.cameraYaw;
					var8 = var3.readUnsignedShort();
					var9 = var3.readUnsignedByte();
					field564 = new class548(class386.cameraPitch, var6, var8, var9);
					field378 = new class548(SpriteBufferProperties.cameraYaw, var7, var8, var9);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_PRIVATE_ECHO == var1.serverPacket) {
					var52 = var3.readStringCp1252NullTerminated();
					var23 = AbstractFont.escapeBrackets(Calendar.method8178(FloorOverlayDefinition.method4815(var3)));
					class292.addGameMessage(6, var52, var23);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RESET_CLIENT_VARCACHE == var1.serverPacket) {
					for (var22 = 0; var22 < VarpDefinition.field1973; ++var22) {
						VarpDefinition var77 = class70.VarpDefinition_get(var22);
						if (var77 != null) {
							Varps.Varps_temp[var22] = 0;
							Varps.Varps_main[var22] = 0;
						}
					}

					class282.method6383();
					changedVarpCount += 32;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_PRIVCHATMODE == var1.serverPacket) {
					WorldMapRenderer.privateChatMode = Menu.method12069(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_PLAYER_OP == var1.serverPacket) {
					var22 = var3.readUnsignedByteSub();
					var23 = var3.readStringCp1252NullTerminated();
					var6 = var3.readUnsignedByteNeg();
					if (var22 >= 1 && var22 <= 8) {
						if (var23.equalsIgnoreCase("null")) {
							var23 = null;
						}

						playerMenuActions[var22 - 1] = var23;
						playerOptionsPriorities[var22 - 1] = var6 == 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CLAN_CHANNEL_DELTA == var1.serverPacket) {
					field531 = cycleCntr;
					var73 = var3.readByte();
					class167 var74 = new class167(var3);
					ClanChannel var90;
					if (var73 >= 0) {
						var90 = currentClanChannels[var73];
					} else {
						var90 = class341.guestClanChannel;
					}

					if (var90 == null) {
						this.method834(var73);
						var1.serverPacket = null;
						return true;
					}

					if (var74.field1899 > var90.field1913) {
						this.method834(var73);
						var1.serverPacket = null;
						return true;
					}

					if (var74.field1899 < var90.field1913) {
						var1.serverPacket = null;
						return true;
					}

					var74.method4092(var90);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_ACTIVE_WORLD == var1.serverPacket) {
					var22 = var3.readShort();
					var5 = var3.readUnsignedByte();
					if (var22 == -1) {
						class547.topLevelWorldView.plane = var5;
						class32.worldView = class547.topLevelWorldView;
					} else {
						WorldEntity var27 = (WorldEntity)class547.topLevelWorldView.worldEntities.get((long)var22);
						if (var27 == null) {
							throw new RuntimeException("No valid ClientWorldEntity with ID " + var22);
						}

						var27.worldView.plane = var5;
						class32.worldView = var27.worldView;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_UID192 == var1.serverPacket) {
					var3.offset += 28;
					if (var3.checkCrc()) {
						class351.randomDatData2(var3, var3.offset - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_PLAYERMODEL_BASECOLOUR == var1.serverPacket) {
					var22 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByteSub();
					var6 = var3.readInt();
					var24 = class35.widgetDefinition.method7496(var6);
					var24.field4233.method7551(var22, var5);
					class154.invalidateWidget(var24);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETOBJECT == var1.serverPacket) {
					var22 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.readUnsignedIntME();
					var24 = class35.widgetDefinition.method7496(var6);
					ItemComposition var35;
					if (!var24.isIf3) {
						if (var5 == -1) {
							var24.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var35 = WorldMapIcon_1.ItemDefinition_get(var5).getCountObj(var22);
						var24.modelType = 4;
						var24.modelId = var5;
						var24.modelAngleX = var35.xan2d;
						var24.modelAngleY = var35.yan2d;
						var24.modelZoom = var35.zoom2d * 100 / var22;
						class154.invalidateWidget(var24);
					} else {
						var24.itemId = var5;
						var24.itemQuantity = var22;
						var35 = WorldMapIcon_1.ItemDefinition_get(var5).getCountObj(var22);
						var24.modelAngleX = var35.xan2d;
						var24.modelAngleY = var35.yan2d;
						var24.modelAngleZ = var35.zan2d;
						var24.modelOffsetX = var35.offsetX2d;
						var24.modelOffsetY = var35.offsetY2d;
						var24.modelZoom = var35.zoom2d;
						if (var35.isStackable == 1) {
							var24.itemQuantityMode = 1;
						} else {
							var24.itemQuantityMode = 2;
						}

						if (var24.field4196 > 0) {
							var24.modelZoom = var24.modelZoom * 32 / var24.field4196;
						} else if (var24.rawWidth > 0) {
							var24.modelZoom = var24.modelZoom * 32 / var24.rawWidth;
						}

						class154.invalidateWidget(var24);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_STAT == var1.serverPacket) {
					class282.method6383();
					var22 = var3.readUnsignedByteAdd();
					var5 = var3.readUnsignedByteAdd();
					var6 = var3.readUnsignedByteNeg();
					var7 = var3.readUnsignedIntIME();
					experience[var5] = var7;
					currentLevels[var5] = var6;
					levels[var5] = 1;
					field334[var5] = var22;

					for (var8 = 0; var8 < 98; ++var8) {
						if (var7 >= Skills.Skills_experienceTable[var8]) {
							levels[var5] = var8 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				ArchiveDiskActionHandler.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1304 != null ? var1.field1304.id : -1) + "," + (var1.field1305 != null ? var1.field1305.id : -1) + "," + var1.serverPacketLength, (Throwable)null);
				WorldMapElement.logOut();
			} catch (IOException var50) {
				class199.method4473();
			} catch (Exception var51) {
				var23 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1304 != null ? var1.field1304.id : -1) + "," + (var1.field1305 != null ? var1.field1305.id : -1) + "," + var1.serverPacketLength + "," + (class159.localPlayer.pathX[0] + class547.topLevelWorldView.baseX) + "," + (class159.localPlayer.pathY[0] + class547.topLevelWorldView.baseY) + ",";

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) {
					var23 = var23 + var3.array[var6] + ",";
				}

				ArchiveDiskActionHandler.RunException_sendStackTrace(var23, var51);
				WorldMapElement.logOut();
			}

			return true;
		}
	}

	@ObfuscatedName("qq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "22"
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
				if (var10 != 1 && (ObjectComposition.mouseCam || var10 != 4) && !menu.method12031(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y)) {
					isMenuOpen = false;
					menu.invalidateWidgetsUnder();
				}

				if (var10 == 1 || !ObjectComposition.mouseCam && var10 == 4) {
					menu.method12050(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					isMenuOpen = false;
					menu.invalidateWidgetsUnder();
				}
			} else if (menu.menuOptionsCount > 0) {
				var3 = menu.menuOptionsCount - 1;
				if ((var10 == 1 || !ObjectComposition.mouseCam && var10 == 4) && this.shouldLeftClickOpenMenu(menu.menuOpcodes[var3], menu.menuShiftClick[var3])) {
					var10 = 2;
				}

				if (var10 == 1 || !ObjectComposition.mouseCam && var10 == 4) {
					menu.method12030(var3);
				}

				if (var10 == 2) {
					this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}
			}

		}
	}

	@ObfuscatedName("qg")
	@ObfuscatedSignature(
		descriptor = "(IZB)Z",
		garbageValue = "1"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu(int var1, boolean var2) {
		return (leftClickOpensMenu && menu.menuOptionsCount > 2 || MilliClock.method5970(var1)) && !var2;
	}

	@ObfuscatedName("qc")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-399793148"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		menu.method12027(var1, var2);
		Iterator var3 = worldViewManager.iterator();

		while (var3.hasNext()) {
			WorldView var4 = (WorldView)var3.next();
			var4.scene.menuOpen(false);
		}

		isMenuOpen = true;
		menu.method12033();
	}

	@ObfuscatedName("qf")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1487451761"
	)
	final void method972(boolean var1) {
		AsyncRestClient.method175(rootInterface, class4.canvasWidth, class558.canvasHeight, var1);
	}

	@ObfuscatedName("qt")
	@ObfuscatedSignature(
		descriptor = "(Lok;I)V",
		garbageValue = "1437517671"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var4 = var1.parentId == -1 ? null : class35.widgetDefinition.getWidgetChild(var1.parentId, var1.field4173);
		int var2;
		int var3;
		if (var4 == null) {
			var2 = class4.canvasWidth;
			var3 = class558.canvasHeight;
		} else {
			var2 = var4.width;
			var3 = var4.height * -171267385;
		}

		HitSplatDefinition.alignWidgetSize(var1, var2, var3, false);
		class361.alignWidgetPosition(var1, var2, var3);
	}

	@ObfuscatedName("qh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1834786047"
	)
	final void method832() {
		class154.invalidateWidget(clickedWidget);
		++SecureRandomCallable.widgetDragDuration;
		int var1;
		int var2;
		if (field411 && field513) {
			var1 = MouseHandler.MouseHandler_x;
			var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field514) {
				var1 = field514;
			}

			if (var1 + clickedWidget.width > field514 + clickedWidgetParent.width) {
				var1 = field514 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field515) {
				var2 = field515;
			}

			if (clickedWidget.height * -171267385 + var2 > clickedWidgetParent.height * -171267385 + field515) {
				var2 = clickedWidgetParent.height * -171267385 + field515 - clickedWidget.height * -171267385;
			}

			int var3 = var1 - field537;
			int var4 = var2 - field589;
			int var5 = clickedWidget.dragZoneSize;
			if (SecureRandomCallable.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}

			int var6 = var1 - field514 + clickedWidgetParent.scrollX;
			int var7 = var2 - field515 + clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = clickedWidget.onDrag;
				class332.runScriptEvent(var8);
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
						class332.runScriptEvent(var8);
					}

					if (draggedOnWidget != null && class108.method3454(clickedWidget) != null) {
						PacketBufferNode var13 = HorizontalAlignment.getPacketBufferNode(ClientPacket.OPHELDD, packetWriter.isaacCipher);
						var13.packetBuffer.writeShortAdd(draggedOnWidget.childIndex * -2066937045);
						var13.packetBuffer.writeShort(clickedWidget.itemId);
						var13.packetBuffer.writeInt(draggedOnWidget.id);
						var13.packetBuffer.writeIntIME(clickedWidget.id);
						var13.packetBuffer.writeShortLE(clickedWidget.childIndex * -2066937045);
						var13.packetBuffer.writeShortLE(draggedOnWidget.itemId);
						packetWriter.addNode(var13);
					}
				} else if (World.tempMenuAction != null && !this.shouldLeftClickOpenMenu(World.tempMenuAction.opcode, World.tempMenuAction.field685)) {
					if (menu.menuOptionsCount > 0) {
						int var11 = field537 + widgetClickX;
						int var9 = field589 + widgetClickY;
						MenuAction var10 = World.tempMenuAction;
						if (var10 != null) {
							HttpRequestTask.menuAction(var10.param0, var10.param1, var10.opcode, var10.identifier, var10.itemId, var10.worldViewId, var10.action, var10.target, var11, var9);
						}

						World.tempMenuAction = null;
					}
				} else {
					this.openMenu(widgetClickX + field537, field589 + widgetClickY);
				}

				clickedWidget = null;
			}

		} else {
			if (SecureRandomCallable.widgetDragDuration > 1) {
				if (!isDraggingWidget && menu.menuOptionsCount > 0) {
					var1 = widgetClickX + field537;
					var2 = field589 + widgetClickY;
					MenuAction var12 = World.tempMenuAction;
					if (var12 != null) {
						HttpRequestTask.menuAction(var12.param0, var12.param1, var12.opcode, var12.identifier, var12.itemId, var12.worldViewId, var12.action, var12.target, var1, var2);
					}

					World.tempMenuAction = null;
				}

				clickedWidget = null;
			}

		}
	}

	@ObfuscatedName("qx")
	@ObfuscatedSignature(
		descriptor = "(I)Lxp;",
		garbageValue = "-112636545"
	)
	@Export("username")
	public Username username() {
		return class159.localPlayer != null ? class159.localPlayer.username : null;
	}

	@ObfuscatedName("qz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2097029763"
	)
	void method834(int var1) {
		PacketBufferNode var2 = HorizontalAlignment.getPacketBufferNode(ClientPacket.CLAN_CHANNEL_FULL_REQUEST, packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(var1);
		packetWriter.addNode(var2);
	}

	@ObfuscatedName("qy")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1187904560"
	)
	void method835(int var1) {
		PacketBufferNode var2 = HorizontalAlignment.getPacketBufferNode(ClientPacket.CLAN_SETTINGS_FULL_REQUEST, packetWriter.isaacCipher);
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
							class179.clientLanguage = Language.method8701(Integer.parseInt(var2));
							break;
						case 7:
							int var4 = Integer.parseInt(var2);
							GameBuild[] var5 = class335.method7109();
							int var6 = 0;

							GameBuild var3;
							while (true) {
								if (var6 >= var5.length) {
									var3 = null;
									break;
								}

								GameBuild var7 = var5[var6];
								if (var4 == var7.buildId) {
									var3 = var7;
									break;
								}

								++var6;
							}

							class69.field958 = var3;
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) {
							}
							break;
						case 9:
							HttpAuthenticationHeader.field5389 = var2;
							break;
						case 10:
							NpcOverrides.field2082 = (StudioGame)ScriptFrame.findEnumerated(class147.method3886(), Integer.parseInt(var2));
							if (StudioGame.oldscape == NpcOverrides.field2082) {
								class147.loginType = LoginType.oldscape;
							} else {
								class147.loginType = LoginType.field5837;
							}
							break;
						case 11:
							class26.authServiceBaseUrl = var2;
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
							class40.field257 = Integer.parseInt(var2);
							break;
						case 15:
							gameBuild = Integer.parseInt(var2);
							break;
						case 17:
							ClanSettings.field1853 = var2;
							break;
						case 21:
							field368 = Integer.parseInt(var2);
							break;
						case 22:
							SoundSystem.gameSessionServiceBaseUrl = var2;
							break;
						case 25:
							int var8 = var2.indexOf(".");
							if (var8 == -1) {
								class583.field5952 = Integer.parseInt(var2);
							} else {
								class583.field5952 = Integer.parseInt(var2.substring(0, var8));
								Integer.parseInt(var2.substring(var8 + 1));
							}
						}
					}
				}

				TriBool.method10173();
				class401.worldHost = this.getCodeBase().getHost();
				BufferedNetSocket.field5515 = new JagNetThread();
				String var9 = class69.field958.name;
				byte var10 = 0;
				if ((worldProperties & class580.field5929.rsOrdinal()) != 0) {
					IntProjection.field2650 = "beta";
				}

				try {
					ItemLayer.method4893("oldschool", IntProjection.field2650, var9, var10, 25);
				} catch (Exception var11) {
					ArchiveDiskActionHandler.RunException_sendStackTrace((String)null, var11);
				}

				class32.client = this;
				class40.field261 = clientType;
				FriendSystem.accessToken = System.getenv("JX_ACCESS_TOKEN");
				DevicePcmPlayerProvider.refreshToken = System.getenv("JX_REFRESH_TOKEN");
				Archive.sessionId = System.getenv("JX_SESSION_ID");
				class386.characterId = System.getenv("JX_CHARACTER_ID");
				String var13 = System.getenv("JX_DISPLAY_NAME");
				Login.displayName = class359.method7518(var13);
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
					this.https = true;
				}

				if (field370 == -1) {
					if (!this.containsAccessAndRefreshToken() && !this.containsSessionAndCharacterId()) {
						field370 = 0;
					} else {
						field370 = 5;
					}
				}

				this.startThread(765, 503, 234, 1);
			}
		} catch (RuntimeException var12) {
			throw IgnoreList.newRunException(var12, "client.init(" + ')');
		}
	}

	public void setClient(int var1) {
		this.clientId = var1;
	}

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V"
	)
	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) {
			this.otlTokenRequester = var1;
			class146.method3876(10);
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) {
			this.refreshAccessTokenRequester = var1;
		}
	}

	public boolean isOnLoginScreen() {
		return gameState == 10;
	}

	public long getAccountHash() {
		return this.accountHash;
	}

	protected void finalize() throws Throwable {
		class338.field3892.remove(this);
		super.finalize();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[Lph;",
		garbageValue = "-960807027"
	)
	public static class396[] method1500() {
		return new class396[]{class396.field4884, class396.field4882, class396.field4883, class396.field4889};
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "([II)Ltl;",
		garbageValue = "898763874"
	)
	public static DynamicArray method1501(int[] var0) {
		DynamicArray var1 = new DynamicArray(class572.field5879, true);
		var1.array = var0;
		var1.size = var0.length * 1093200759;
		var1.field5572 = var0.length;
		return var1;
	}
}
