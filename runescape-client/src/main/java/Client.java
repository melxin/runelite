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
public final class Client extends GameEngine implements Usernamed, OAuthApi, class343 {
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	static final class280 field294;
	@ObfuscatedName("dr")
	@Export("BASIC_AUTH_DESKTOP_OSRS")
	static final String BASIC_AUTH_DESKTOP_OSRS;
	@ObfuscatedName("dy")
	@Export("BASIC_AUTH_DESKTOP_RUNELITE")
	static final String BASIC_AUTH_DESKTOP_RUNELITE;
	@ObfuscatedName("ek")
	static final int[] field298;
	@ObfuscatedName("ep")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("playerAppearance")
	static final PlayerComposition playerAppearance;
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "Lbr;"
	)
	static final ApproximateRouteStrategy field590;
	@ObfuscatedName("fa")
	static boolean field304;
	@ObfuscatedName("fw")
	@ObfuscatedGetter(
		intValue = 257721411
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("fp")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("fy")
	@ObfuscatedGetter(
		intValue = 1500592321
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("fh")
	@ObfuscatedGetter(
		intValue = 939764361
	)
	@Export("cycle")
	public static int cycle;
	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	@Export("authenticationScheme")
	static AuthenticationScheme authenticationScheme;
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "Lwp;"
	)
	static class591 field388;
	@ObfuscatedName("fm")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("fs")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("worldViewManager")
	public static final WorldViewManager worldViewManager;
	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	@Export("playerUpdateManager")
	static PlayerUpdateManager playerUpdateManager;
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = 2004291747
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("gh")
	@ObfuscatedGetter(
		intValue = -1883016301
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("gt")
	@ObfuscatedGetter(
		intValue = 572203253
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("gd")
	@ObfuscatedGetter(
		intValue = -352583867
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("gg")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("go")
	@ObfuscatedGetter(
		intValue = 1551610623
	)
	static int field432;
	@ObfuscatedName("gp")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("gq")
	@ObfuscatedGetter(
		intValue = 1094621461
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("gb")
	@ObfuscatedGetter(
		intValue = 1848443641
	)
	static int field538;
	@ObfuscatedName("gw")
	static String field556;
	@ObfuscatedName("gy")
	@ObfuscatedGetter(
		intValue = 1276664445
	)
	static int field326;
	@ObfuscatedName("ga")
	@ObfuscatedGetter(
		intValue = 1758194671
	)
	static int field327;
	@ObfuscatedName("gi")
	@ObfuscatedGetter(
		intValue = 1160609613
	)
	static int field328;
	@ObfuscatedName("gu")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("gx")
	@ObfuscatedGetter(
		intValue = 2119449893
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("gv")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("ge")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("gc")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("hc")
	static int[] field334;
	@ObfuscatedName("ho")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("hm")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("hh")
	@ObfuscatedGetter(
		intValue = -1067017605
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("hf")
	@ObfuscatedGetter(
		longValue = 8391348343585676487L
	)
	static long field596;
	@ObfuscatedName("hn")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("hu")
	@ObfuscatedGetter(
		intValue = -948250543
	)
	static int field341;
	@ObfuscatedName("hg")
	@ObfuscatedGetter(
		intValue = 167467907
	)
	@Export("revision")
	public static int revision;
	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	@Export("indexCheck")
	public static IndexCheck indexCheck;
	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	static class270 field344;
	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "[Lgk;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "[Lgw;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("hd")
	static short field563;
	@ObfuscatedName("hq")
	static short field348;
	@ObfuscatedName("hx")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("ht")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("hi")
	static short field351;
	@ObfuscatedName("he")
	static short field422;
	@ObfuscatedName("ir")
	static short field353;
	@ObfuscatedName("iv")
	static short field459;
	@ObfuscatedName("ia")
	@ObfuscatedGetter(
		intValue = -539543623
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("id")
	@ObfuscatedGetter(
		intValue = 1538339967
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("ij")
	@ObfuscatedGetter(
		intValue = 1154674157
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("iu")
	@ObfuscatedGetter(
		intValue = -59579967
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("im")
	@ObfuscatedGetter(
		intValue = 1182407033
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "[Lqz;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "Lba;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("il")
	@ObfuscatedGetter(
		intValue = 1671383899
	)
	static int field530;
	@ObfuscatedName("iy")
	@ObfuscatedGetter(
		intValue = 962686919
	)
	public static int field372;
	@ObfuscatedName("ic")
	@ObfuscatedGetter(
		intValue = -1452557573
	)
	static int field535;
	@ObfuscatedName("iq")
	@ObfuscatedGetter(
		intValue = 397673201
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("it")
	static String field501;
	@ObfuscatedName("jq")
	@ObfuscatedGetter(
		intValue = 260556295
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("jy")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("ja")
	@ObfuscatedGetter(
		intValue = -1788542515
	)
	static int field368;
	@ObfuscatedName("jt")
	@ObfuscatedGetter(
		intValue = 1739750693
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("jr")
	@ObfuscatedGetter(
		intValue = -2032922837
	)
	static int field320;
	@ObfuscatedName("jz")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("jw")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("jj")
	@ObfuscatedGetter(
		intValue = -1791712417
	)
	@Export("serverCycle")
	static int serverCycle;
	@ObfuscatedName("jp")
	@ObfuscatedGetter(
		longValue = 7881463686914378693L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("jc")
	@ObfuscatedGetter(
		intValue = 1436687769
	)
	static int field375;
	@ObfuscatedName("jk")
	@ObfuscatedGetter(
		intValue = 127368541
	)
	static int field595;
	@ObfuscatedName("jg")
	@ObfuscatedGetter(
		longValue = 6577416444889544771L
	)
	static long field377;
	@ObfuscatedName("jo")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("je")
	@ObfuscatedGetter(
		intValue = -1315040847
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("jm")
	@Export("z")
	static boolean z;
	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	static class69 field477;
	@ObfuscatedName("kd")
	@ObfuscatedGetter(
		intValue = -1450755299
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("kw")
	@ObfuscatedGetter(
		intValue = 218729027
	)
	static int field409;
	@ObfuscatedName("lv")
	@ObfuscatedGetter(
		intValue = 267309459
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("lr")
	@ObfuscatedGetter(
		intValue = -490251915
	)
	static int field498;
	@ObfuscatedName("lc")
	@ObfuscatedGetter(
		intValue = 1879212991
	)
	static int field462;
	@ObfuscatedName("lj")
	@ObfuscatedGetter(
		intValue = -1513133753
	)
	static int field387;
	@ObfuscatedName("lt")
	@ObfuscatedGetter(
		intValue = -221458001
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = 2070376111
	)
	static int field453;
	@ObfuscatedName("lu")
	@ObfuscatedGetter(
		intValue = 1652924799
	)
	static int field390;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = -1544318571
	)
	static int field391;
	@ObfuscatedName("ly")
	@ObfuscatedGetter(
		intValue = 622271891
	)
	static int field539;
	@ObfuscatedName("ll")
	@ObfuscatedGetter(
		intValue = -1198579727
	)
	static int field393;
	@ObfuscatedName("mr")
	@ObfuscatedGetter(
		intValue = 631913163
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("mz")
	@ObfuscatedGetter(
		intValue = 2141292215
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("md")
	@ObfuscatedGetter(
		intValue = 271608931
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("mk")
	@ObfuscatedGetter(
		intValue = -1512246559
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("mw")
	@ObfuscatedGetter(
		intValue = 90103235
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("mg")
	@ObfuscatedGetter(
		intValue = -2140454595
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("ma")
	@ObfuscatedGetter(
		intValue = -1520084451
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "Lqo;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("mu")
	@ObfuscatedGetter(
		intValue = -2118548867
	)
	static int field562;
	@ObfuscatedName("mi")
	@ObfuscatedGetter(
		intValue = -137822261
	)
	static int field424;
	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("mb")
	@ObfuscatedGetter(
		intValue = -511477413
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("mt")
	@ObfuscatedGetter(
		intValue = 532890461
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("mp")
	@ObfuscatedGetter(
		intValue = -834774859
	)
	@Export("staffModLevel")
	static int staffModLevel;
	@ObfuscatedName("mc")
	@ObfuscatedGetter(
		intValue = 1884242995
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("me")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("mf")
	@ObfuscatedGetter(
		intValue = 1594559025
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("ml")
	@ObfuscatedGetter(
		intValue = -1551694737
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("mx")
	@ObfuscatedGetter(
		intValue = 1650377937
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("scriptEvents2")
	static NodeDeque scriptEvents2;
	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("scriptEvents3")
	static NodeDeque scriptEvents3;
	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	static NodeDeque field416;
	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "Lqo;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("ns")
	@ObfuscatedGetter(
		intValue = -1248995411
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("nd")
	@ObfuscatedGetter(
		intValue = -1176909627
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("nl")
	static String field420;
	@ObfuscatedName("nz")
	@ObfuscatedGetter(
		intValue = -236764723
	)
	static int field421;
	@ObfuscatedName("np")
	static int[] field564;
	@ObfuscatedName("nk")
	static int[] field423;
	@ObfuscatedName("ny")
	@ObfuscatedGetter(
		longValue = -9057032310586639783L
	)
	static long field465;
	@ObfuscatedName("nx")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "Lvm;"
	)
	static class554 field426;
	@ObfuscatedName("nu")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("ni")
	static boolean field428;
	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("DBTableIndex_cache")
	static EvictingDualNodeHashTable DBTableIndex_cache;
	@ObfuscatedName("nr")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("archive11")
	static EvictingDualNodeHashTable archive11;
	@ObfuscatedName("nw")
	static boolean field431;
	@ObfuscatedName("na")
	static boolean field418;
	@ObfuscatedName("nj")
	static boolean field433;
	@ObfuscatedName("nn")
	@ObfuscatedGetter(
		intValue = -1091333719
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("oa")
	@ObfuscatedGetter(
		intValue = -15973217
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("ob")
	@ObfuscatedGetter(
		intValue = -1755097653
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("or")
	@ObfuscatedGetter(
		intValue = -249917077
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("ox")
	@ObfuscatedGetter(
		intValue = -932559439
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("ok")
	@ObfuscatedGetter(
		intValue = 1196280434
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("om")
	@ObfuscatedGetter(
		intValue = 819606429
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("oc")
	@ObfuscatedGetter(
		intValue = 1687394123
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "Lcs;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("os")
	static int[] field469;
	@ObfuscatedName("ot")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("op")
	@ObfuscatedGetter(
		intValue = 1355386735
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("oy")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("ol")
	@ObfuscatedGetter(
		longValue = -9065718613199255089L
	)
	static long field346;
	@ObfuscatedName("oo")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("od")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("pp")
	static int[][][] field451;
	@ObfuscatedName("pw")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("po")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("px")
	@ObfuscatedGetter(
		intValue = -2134606117
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("pt")
	@ObfuscatedGetter(
		intValue = -1768378009
	)
	@Export("graphicsCycle")
	static int graphicsCycle;
	@ObfuscatedName("qw")
	@ObfuscatedGetter(
		intValue = -1742858113
	)
	static int field456;
	@ObfuscatedName("qf")
	@ObfuscatedGetter(
		intValue = -1735900849
	)
	static int field411;
	@ObfuscatedName("qr")
	@ObfuscatedGetter(
		intValue = -812994067
	)
	static int field290;
	@ObfuscatedName("qh")
	@ObfuscatedGetter(
		intValue = -1258075377
	)
	static int field354;
	@ObfuscatedName("qo")
	static boolean field460;
	@ObfuscatedName("qi")
	@ObfuscatedGetter(
		intValue = -1623173493
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("qc")
	@ObfuscatedGetter(
		intValue = -1298482391
	)
	static int field457;
	@ObfuscatedName("qy")
	@ObfuscatedGetter(
		intValue = -275343869
	)
	static int field463;
	@ObfuscatedName("qd")
	@ObfuscatedGetter(
		intValue = -526644777
	)
	static int field464;
	@ObfuscatedName("qp")
	@ObfuscatedGetter(
		intValue = 210691517
	)
	static int field429;
	@ObfuscatedName("qt")
	static boolean field541;
	@ObfuscatedName("qm")
	@ObfuscatedGetter(
		intValue = 272351103
	)
	static int field467;
	@ObfuscatedName("qa")
	static boolean field310;
	@ObfuscatedName("qb")
	@ObfuscatedGetter(
		intValue = 1875437039
	)
	static int field363;
	@ObfuscatedName("qg")
	@ObfuscatedGetter(
		intValue = 1730316039
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("qx")
	@ObfuscatedGetter(
		intValue = 1412956261
	)
	static int field526;
	@ObfuscatedName("qv")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("qu")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("ql")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("rl")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("re")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("rp")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("ri")
	static int[][] field478;
	@ObfuscatedName("ro")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("rg")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("rm")
	@ObfuscatedGetter(
		intValue = 768500181
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("rc")
	@ObfuscatedGetter(
		intValue = -93715511
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("rr")
	@ObfuscatedGetter(
		intValue = 886057491
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("rq")
	@ObfuscatedGetter(
		intValue = -1870365521
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("rb")
	@ObfuscatedGetter(
		intValue = -68039821
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("rf")
	@ObfuscatedGetter(
		intValue = -515588809
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("rz")
	@ObfuscatedGetter(
		intValue = 1498558629
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("rx")
	@ObfuscatedGetter(
		longValue = 8542653436285507753L
	)
	@Export("userId")
	static long userId;
	@ObfuscatedName("rw")
	@ObfuscatedGetter(
		longValue = -4658445507242362665L
	)
	@Export("userHash")
	static long userHash;
	@ObfuscatedName("rn")
	@ObfuscatedGetter(
		intValue = 2107480755
	)
	static int field581;
	@ObfuscatedName("ry")
	@ObfuscatedGetter(
		intValue = -1771009949
	)
	static int field352;
	@ObfuscatedName("rh")
	@ObfuscatedGetter(
		intValue = -139590033
	)
	static int field492;
	@ObfuscatedName("rv")
	@ObfuscatedGetter(
		intValue = -1116496431
	)
	static int field370;
	@ObfuscatedName("ra")
	static int[] field494;
	@ObfuscatedName("rk")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("rj")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("rt")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("sl")
	@ObfuscatedGetter(
		intValue = -1958907021
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("sd")
	@Export("leftClickOpensMenu")
	static boolean leftClickOpensMenu;
	@ObfuscatedName("sb")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("sc")
	@ObfuscatedSignature(
		descriptor = "Lxz;"
	)
	@Export("menu")
	static Menu menu;
	@ObfuscatedName("sa")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("sj")
	@ObfuscatedGetter(
		intValue = 2132590995
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("sz")
	@ObfuscatedGetter(
		intValue = -1596910743
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("su")
	@ObfuscatedGetter(
		intValue = -1119045371
	)
	static int field392;
	@ObfuscatedName("si")
	@ObfuscatedGetter(
		intValue = 2053580465
	)
	static int field506;
	@ObfuscatedName("sn")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("ss")
	@ObfuscatedGetter(
		intValue = 1974251651
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("sw")
	@ObfuscatedGetter(
		intValue = -589928191
	)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("sk")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("sv")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("sy")
	@ObfuscatedGetter(
		intValue = 418583157
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("sx")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	@Export("clickedWidget")
	public static Widget clickedWidget;
	@ObfuscatedName("sg")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("sq")
	@ObfuscatedGetter(
		intValue = 206032845
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("se")
	@ObfuscatedGetter(
		intValue = -166213365
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("so")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("ts")
	static boolean field519;
	@ObfuscatedName("tb")
	@ObfuscatedGetter(
		intValue = 402415725
	)
	static int field512;
	@ObfuscatedName("ti")
	@ObfuscatedGetter(
		intValue = -2125285485
	)
	static int field521;
	@ObfuscatedName("tt")
	static boolean field413;
	@ObfuscatedName("tk")
	@ObfuscatedGetter(
		intValue = -1003428501
	)
	static int field523;
	@ObfuscatedName("to")
	@ObfuscatedGetter(
		intValue = 429203937
	)
	static int field524;
	@ObfuscatedName("ta")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("tu")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("ty")
	@ObfuscatedGetter(
		intValue = 1608081833
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("tl")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("tg")
	@ObfuscatedGetter(
		intValue = -1665238999
	)
	@Export("changedItemsCount")
	static int changedItemsCount;
	@ObfuscatedName("tc")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("td")
	@ObfuscatedGetter(
		intValue = -1732472903
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("tp")
	static int[] field5512;
	@ObfuscatedName("te")
	@ObfuscatedGetter(
		intValue = 19485041
	)
	static int field5513;
	@ObfuscatedName("tq")
	@ObfuscatedGetter(
		intValue = 1239612195
	)
	static int field557;
	@ObfuscatedName("tx")
	@ObfuscatedGetter(
		intValue = -1456849427
	)
	static int field514;
	@ObfuscatedName("tn")
	@ObfuscatedGetter(
		intValue = -1287051415
	)
	static int field536;
	@ObfuscatedName("tf")
	@ObfuscatedGetter(
		intValue = -1650077719
	)
	static int field537;
	@ObfuscatedName("tw")
	@ObfuscatedGetter(
		intValue = -479022103
	)
	static int field565;
	@ObfuscatedName("tv")
	@ObfuscatedGetter(
		intValue = -1921543977
	)
	static int field404;
	@ObfuscatedName("th")
	@ObfuscatedGetter(
		intValue = -590559993
	)
	static int field471;
	@ObfuscatedName("ud")
	@ObfuscatedSignature(
		descriptor = "Lxg;"
	)
	static class605 field403;
	@ObfuscatedName("ua")
	@ObfuscatedGetter(
		intValue = -516585421
	)
	@Export("rootWidgetCount")
	public static int rootWidgetCount;
	@ObfuscatedName("uf")
	@ObfuscatedGetter(
		intValue = -1735642619
	)
	static int field543;
	@ObfuscatedName("uz")
	@Export("validRootWidgets")
	static boolean[] validRootWidgets;
	@ObfuscatedName("uv")
	public static boolean[] field545;
	@ObfuscatedName("ur")
	static boolean[] field546;
	@ObfuscatedName("uh")
	@Export("rootWidgetXs")
	public static int[] rootWidgetXs;
	@ObfuscatedName("um")
	@Export("rootWidgetYs")
	public static int[] rootWidgetYs;
	@ObfuscatedName("ue")
	@Export("rootWidgetWidths")
	public static int[] rootWidgetWidths;
	@ObfuscatedName("uy")
	@Export("rootWidgetHeights")
	public static int[] rootWidgetHeights;
	@ObfuscatedName("un")
	@ObfuscatedGetter(
		intValue = 2066432327
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("uq")
	static int[] field534;
	@ObfuscatedName("uu")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("up")
	@ObfuscatedGetter(
		intValue = 1877957219
	)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("ux")
	@ObfuscatedGetter(
		intValue = 1486618197
	)
	static int field1340;
	@ObfuscatedName("ub")
	@ObfuscatedGetter(
		intValue = -116928357
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("uk")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("us")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("uj")
	@ObfuscatedSignature(
		descriptor = "[Lxv;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("ug")
	@ObfuscatedGetter(
		intValue = -1105109915
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("ut")
	@ObfuscatedGetter(
		intValue = -210974483
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("uc")
	@ObfuscatedGetter(
		intValue = 541268227
	)
	static int field308;
	@ObfuscatedName("uw")
	@ObfuscatedGetter(
		intValue = 695491477
	)
	static int field307;
	@ObfuscatedName("vb")
	@ObfuscatedGetter(
		intValue = -1178249461
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("ve")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("vk")
	static boolean field380;
	@ObfuscatedName("vm")
	static boolean field347;
	@ObfuscatedName("vx")
	static boolean field567;
	@ObfuscatedName("vv")
	@ObfuscatedSignature(
		descriptor = "Lve;"
	)
	static class547 field568;
	@ObfuscatedName("vt")
	@ObfuscatedSignature(
		descriptor = "Lvb;"
	)
	static class546 field569;
	@ObfuscatedName("vd")
	@ObfuscatedSignature(
		descriptor = "Lvb;"
	)
	static class546 field570;
	@ObfuscatedName("vq")
	static boolean[] field571;
	@ObfuscatedName("vf")
	static int[] field572;
	@ObfuscatedName("vu")
	static int[] field573;
	@ObfuscatedName("wm")
	static int[] field395;
	@ObfuscatedName("ws")
	static int[] field575;
	@ObfuscatedName("wr")
	@ObfuscatedGetter(
		intValue = 495998735
	)
	static int field468;
	@ObfuscatedName("wf")
	@ObfuscatedGetter(
		intValue = -1573631083
	)
	static int field577;
	@ObfuscatedName("wn")
	@ObfuscatedSignature(
		descriptor = "Luc;"
	)
	static class543 field578;
	@ObfuscatedName("wa")
	@ObfuscatedSignature(
		descriptor = "Lsk;"
	)
	static class486 field579;
	@ObfuscatedName("we")
	static List field407;
	@ObfuscatedName("wi")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("ww")
	@ObfuscatedGetter(
		intValue = 1607092935
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("wk")
	@ObfuscatedGetter(
		intValue = -1703548923
	)
	static int field480;
	@ObfuscatedName("wj")
	static int[] field383;
	@ObfuscatedName("wb")
	static int[] field585;
	@ObfuscatedName("wv")
	@Export("token")
	String token;
	@ObfuscatedName("wc")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	@Export("asyncRestClient")
	AsyncRestClient asyncRestClient;
	@ObfuscatedName("wy")
	@ObfuscatedSignature(
		descriptor = "Laq;"
	)
	@Export("asyncGameSessionTokenResponse")
	AsyncHttpResponse asyncGameSessionTokenResponse;
	@ObfuscatedName("wp")
	@Export("otlTokenRequester")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/OtlTokenRequester;"
	)
	OtlTokenRequester otlTokenRequester;
	@ObfuscatedName("wh")
	@Export("otlTokenRequestFuture")
	Future otlTokenRequestFuture;
	@ObfuscatedName("wl")
	@Export("https")
	boolean https;
	@ObfuscatedName("wu")
	@ObfuscatedGetter(
		intValue = -1197662661
	)
	@Export("clientId")
	int clientId;
	@ObfuscatedName("wg")
	@ObfuscatedSignature(
		descriptor = "Laq;"
	)
	@Export("asyncAccessTokenResponse")
	AsyncHttpResponse asyncAccessTokenResponse;
	@ObfuscatedName("wq")
	@Export("refreshAccessTokenRequester")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	RefreshAccessTokenRequester refreshAccessTokenRequester;
	@ObfuscatedName("wz")
	@Export("refreshAccessTokenRequestFuture")
	Future refreshAccessTokenRequestFuture;
	@ObfuscatedName("xt")
	@ObfuscatedSignature(
		descriptor = "Lwj;"
	)
	Buffer field472;
	@ObfuscatedName("xh")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	class7 field597;
	@ObfuscatedName("xa")
	@ObfuscatedGetter(
		longValue = -4079863043278783679L
	)
	@Export("accountHash")
	long accountHash;

	static {
		packetWriter = new PacketWriter();
		field294 = new class280();
		BASIC_AUTH_DESKTOP_OSRS = class70.method2218(class225.method5020("com_jagex_auth_desktop_osrs:public"));
		BASIC_AUTH_DESKTOP_RUNELITE = class70.method2218(class225.method5020("com_jagex_auth_desktop_runelite:public"));
		field298 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
		playerAppearance = new PlayerComposition();
		field590 = new ApproximateRouteStrategy();
		field304 = true;
		worldId = 1;
		isMembersWorld = false;
		gameState = 0;
		cycle = 0;
		authenticationScheme = AuthenticationScheme.USERNAME_PASSWORD;
		field388 = class591.field5873;
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
		field432 = 0;
		showLoadingMessages = true;
		localPlayerIndex = -1;
		field538 = 0;
		field556 = "";
		field326 = -1;
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
		field596 = 0L;
		isResizable = true;
		field341 = 600;
		revision = field341 / GameEngine.cycleDurationMillis;
		indexCheck = new IndexCheck();
		field344 = new class270();
		currentClanSettings = new ClanSettings[4];
		currentClanChannels = new ClanChannel[4];
		field563 = 256;
		field348 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field351 = 1;
		field422 = 32767;
		field353 = 1;
		field459 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		field530 = -1;
		field372 = -1;
		field535 = 30;
		worldProperties = 0;
		gameBuild = 0;
		isLowDetail = false;
		field368 = -1;
		clientType = -1;
		field320 = -1;
		onMobile = false;
		isLoading = true;
		serverCycle = 0;
		mouseLastLastPressedTimeMillis = -1L;
		field375 = -1;
		field595 = -1;
		field377 = -1L;
		hadFocus = true;
		rebootTimer = 0;
		z = false;
		field477 = class69.field954;
		js5ConnectState = 0;
		field409 = 0;
		js5Errors = 0;
		field498 = 0;
		field462 = 0;
		field387 = 0;
		logoutTimer = 0;
		field453 = 0;
		field390 = 1;
		field391 = 0;
		field539 = 1;
		field393 = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		mouseCamClickedX = 0;
		mouseCamClickedY = 0;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field562 = 0;
		field424 = -1;
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
		field416 = new NodeDeque();
		widgetFlags = new NodeHashTable(512);
		publicChatMode = 0;
		tradeChatMode = 0;
		field420 = "";
		field421 = 0;
		field564 = new int[128];
		field423 = new int[128];
		field465 = -1L;
		playingJingle = false;
		field426 = new class554();
		isCameraLocked = false;
		field428 = false;
		DBTableIndex_cache = new EvictingDualNodeHashTable(64);
		archive11 = new EvictingDualNodeHashTable(64);
		field431 = false;
		field418 = false;
		field433 = false;
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
		field469 = new int[4];
		randomDatData = null;
		npcCount = 0;
		npcIndices = new int[250];
		hadNetworkError = false;
		timer = new Timer();
		field451 = new int[4][13][13];
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		overheadTextLimit = -1;
		graphicsCycle = 0;
		field456 = 2301979;
		field411 = 5063219;
		field290 = 3353893;
		field354 = 7759444;
		field460 = false;
		alternativeScrollbarWidth = 0;
		field457 = 0;
		field463 = 0;
		field464 = 0;
		field429 = 0;
		field541 = false;
		field467 = 0;
		field310 = false;
		field363 = 0;
		overheadTextCount = 0;
		field526 = 50;
		overheadTextXs = new int[field526];
		overheadTextYs = new int[field526];
		overheadTextAscents = new int[field526];
		overheadTextXOffsets = new int[field526];
		overheadTextColors = new int[field526];
		overheadTextEffects = new int[field526];
		field478 = new int[field526][];
		overheadTextCyclesRemaining = new int[field526];
		overheadText = new String[field526];
		viewportDrawCount = 0;
		viewportTempX = -1;
		viewportTempY = -1;
		mouseCrossX = 0;
		mouseCrossY = 0;
		mouseCrossState = 0;
		mouseCrossColor = 0;
		userId = -1L;
		userHash = -1L;
		field581 = 0;
		field352 = 0;
		field492 = 0;
		field370 = 0;
		field494 = new int[1000];
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
		field392 = 0;
		field506 = 50;
		field501 = null;
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
		field519 = false;
		field512 = -1;
		field521 = -1;
		field413 = false;
		field523 = -1;
		field524 = -1;
		isDraggingWidget = false;
		changedVarps = new int[32];
		changedVarpCount = 0;
		changedItemContainers = new int[32];
		changedItemsCount = 0;
		changedSkills = new int[32];
		changedSkillsCount = 0;
		field5512 = new int[32];
		field5513 = 0;
		field557 = 0;
		field514 = 0;
		field536 = 0;
		field537 = 0;
		field565 = 0;
		field404 = 0;
		field471 = 0;
		field403 = new class605();
		rootWidgetCount = 0;
		field543 = -2;
		validRootWidgets = new boolean[100];
		field545 = new boolean[100];
		field546 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field534 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		crossWorldMessageIds = new long[100];
		crossWorldMessageIdsIndex = 0;
		field1340 = -1;
		mapIconCount = 0;
		mapIconXs = new int[1000];
		mapIconYs = new int[1000];
		mapIcons = new SpritePixels[1000];
		destinationX = 0;
		destinationY = 0;
		field308 = -1;
		field307 = 0;
		minimapState = 0;
		field380 = false;
		field347 = false;
		field567 = false;
		field568 = null;
		field569 = null;
		field570 = null;
		field571 = new boolean[5];
		field572 = new int[5];
		field573 = new int[5];
		field395 = new int[5];
		field575 = new int[5];
		field468 = -1;
		field577 = -1;
		field578 = new DesktopPlatformInfoProvider();
		field579 = new class486(8, class484.field5241);
		field407 = new ArrayList();
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field480 = 0;
		field383 = new int[50];
		field585 = new int[50];
		class581.field5790 = 232;
	}

	public Client() {
		this.https = false;
		this.clientId = 0;
		this.accountHash = -1L;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "857834168"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field596 = UserComparator7.method3496() + 500L;
		this.resizeJS();
		if (rootInterface != -1) {
			this.method874(true);
		}

	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-93"
	)
	@Export("setUp")
	protected final void setUp() {
		class440.method8908(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
		int var2 = worldProperties;
		class578 var3 = class578.field5767;
		boolean var1 = (var2 & var3.rsOrdinal()) != 0;
		ObjectComposition.field2301 = var1;
		UserComparator6.worldPort = gameBuild == 0 ? 43594 : worldId + 40000;
		HealthBarDefinition.js5Port = gameBuild == 0 ? 443 : worldId + 50000;
		class341.currentPort = UserComparator6.worldPort;
		PlayerComposition.field3994 = class365.field4042;
		PlayerComposition.field3995 = class365.field4043;
		class168.field1878 = class365.field4041;
		VerticalAlignment.field2127 = class365.field4044;
		class203.urlRequester = new SecureUrlRequester(this.https, 232);
		this.setUpKeyboard();
		this.setUpMouse();
		class159.mouseWheel = this.mouseWheel();
		this.method534(field344, 0);
		this.method534(indexCheck, 1);
		this.setUpClipboard();
		class406.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 750000);
		FriendSystem.clientPreferences = ReflectionCheck.method759();
		class62.method2110(this, class82.field1189);
		FloorUnderlayDefinition.setWindowedMode(FriendSystem.clientPreferences.getWindowMode());
		class137.friendSystem = new FriendSystem(class198.loginType);
		this.asyncRestClient = new AsyncRestClient("tokenRequest", 1, 1);
		if (!class337.field3799.contains(this)) {
			class337.field3799.add(this);
		}

		field294.method6324();
		ModelData var5 = new ModelData(3, 1, 0);
		var5.method4793(-64, -8, 64);
		var5.method4793(64, -8, 64);
		var5.method4793(0, -8, -24);
		var5.method4794(0, 2, 1, (byte)1, (byte)-1, (short)10173, (short)-1);
		class177.field1939 = var5.toModel(1, 32, 0, -128, 0);
		Archive.field4803 = var5.toModel(64, 850, -30, -50, -30);
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "33"
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
				boolean var4 = WorldMapRectangle.method6799();
				if (var4 && playingJingle && pcmPlayer1 != null) {
					pcmPlayer1.tryDiscard();
				}

				MouseHandler.method722();
				indexCheck.method6091();
				this.method617();
				Strings.method8206();
				if (class159.mouseWheel != null) {
					int var5 = class159.mouseWheel.useRotation();
					mouseWheelRotation = var5;
				}

				if (gameState == 0) {
					PrivateChatMode.method11907();
					class62.method2111();
				} else if (gameState == 5) {
					class365.loginScreen(this, Interpreter.fontPlain11, class152.fontPlain12);
					PrivateChatMode.method11907();
					class62.method2111();
				} else if (gameState != 10 && gameState != 11) {
					if (gameState == 20) {
						class365.loginScreen(this, Interpreter.fontPlain11, class152.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState == 50) {
						class365.loginScreen(this, Interpreter.fontPlain11, class152.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState == 25) {
						if (field431) {
							DevicePcmPlayerProvider.loadRegion();
						}

						if (field418) {
							class348.method7363(FriendSystem.field628);
						}

						if (!field418 && !field431) {
							AuthenticationScheme.updateGameState(30);
						}
					}
				} else {
					class365.loginScreen(this, Interpreter.fontPlain11, class152.fontPlain12);
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

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-67"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		for (ObjectSound var2 = (ObjectSound)ObjectSound.field990.last(); var2 != null; var2 = (ObjectSound)ObjectSound.field990.previous()) {
			var2.method2221();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field596 && UserComparator7.method3496() > field596) {
			FloorUnderlayDefinition.setWindowedMode(class31.getWindowedMode());
		}

		int var3;
		if (var1) {
			for (var3 = 0; var3 < 100; ++var3) {
				validRootWidgets[var3] = true;
			}
		}

		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1, AsyncRestClient.field57);
		} else if (gameState == 5) {
			SecureRandomCallable.drawTitle(HttpJsonRequestBody.fontBold12, Interpreter.fontPlain11, class152.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				SecureRandomCallable.drawTitle(HttpJsonRequestBody.fontBold12, Interpreter.fontPlain11, class152.fontPlain12);
			} else if (gameState == 50) {
				SecureRandomCallable.drawTitle(HttpJsonRequestBody.fontBold12, Interpreter.fontPlain11, class152.fontPlain12);
			} else if (gameState == 25) {
				if (field431) {
					if (field393 == 1) {
						if (field453 > field390) {
							field390 = field453;
						}

						var3 = (field390 * 50 - field453 * 50) / field390;
						WorldMapLabel.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false);
					} else if (field393 == 2) {
						if (field391 > field539) {
							field539 = field391;
						}

						var3 = (field539 * 50 - field391 * 50) / field539 + 50;
						WorldMapLabel.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false);
					} else {
						WorldMapLabel.drawLoadingMessage("Loading - please wait.", false);
					}
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				WorldMapLabel.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) {
				WorldMapLabel.drawLoadingMessage("Please wait...", false);
			}
		} else {
			SecureRandomCallable.drawTitle(HttpJsonRequestBody.fontBold12, Interpreter.fontPlain11, class152.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var3 = 0; var3 < rootWidgetCount; ++var3) {
				if (field545[var3]) {
					Interpreter.rasterProvider.draw(rootWidgetXs[var3], rootWidgetYs[var3], rootWidgetWidths[var3], rootWidgetHeights[var3]);
					field545[var3] = false;
				}
			}
		} else if (gameState > 0) {
			Interpreter.rasterProvider.drawFull(0, 0);

			for (var3 = 0; var3 < rootWidgetCount; ++var3) {
				field545[var3] = false;
			}
		}

	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1384501574"
	)
	@Export("kill0")
	protected final void kill0() {
		if (FloorDecoration.varcs != null && FloorDecoration.varcs.hasUnwrittenChanges()) {
			FloorDecoration.varcs.write();
		}

		if (WorldMapLabel.mouseRecorder != null) {
			WorldMapLabel.mouseRecorder.isRunning = false;
		}

		WorldMapLabel.mouseRecorder = null;
		packetWriter.close();
		JagNetThread.method8484();
		class159.mouseWheel = null;
		if (pcmPlayer1 != null) {
			pcmPlayer1.shutdown();
		}

		HorizontalAlignment.field2060.method8455();
		class82.method2751();
		if (class203.urlRequester != null) {
			class203.urlRequester.close();
			class203.urlRequester = null;
		}

		class303.method6823();
		this.asyncRestClient.shutdown();
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1087874578"
	)
	protected final void vmethod818() {
	}

	@ObfuscatedName("pk")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "274341648"
	)
	@Export("isRuneLite")
	boolean isRuneLite() {
		return this.clientId == 1;
	}

	@ObfuscatedName("pv")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1811351461"
	)
	@Export("containsAccessAndRefreshToken")
	boolean containsAccessAndRefreshToken() {
		return WorldView.accessToken != null && !WorldView.accessToken.trim().isEmpty() && class389.refreshToken != null && !class389.refreshToken.trim().isEmpty();
	}

	@ObfuscatedName("px")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "125"
	)
	@Export("containsSessionAndCharacterId")
	boolean containsSessionAndCharacterId() {
		return class523.sessionId != null && !class523.sessionId.trim().isEmpty() && class114.characterId != null && !class114.characterId.trim().isEmpty();
	}

	@ObfuscatedName("pt")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "881112384"
	)
	@Export("otlTokenRequesterInitialized")
	boolean otlTokenRequesterInitialized() {
		return this.otlTokenRequester != null;
	}

	@ObfuscatedName("pc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-6"
	)
	@Export("requestRefreshAccessToken")
	void requestRefreshAccessToken(String var1) throws IOException {
		HashMap var2 = new HashMap();
		var2.put("grant_type", "refresh_token");
		var2.put("scope", "gamesso.token.create");
		var2.put("refresh_token", var1);
		URL var3 = new URL(DelayFadeTask.authServiceBaseUrl + "shield/oauth/token" + (new HttpQueryParams(var2)).encode());
		HttpHeaders var4 = new HttpHeaders();
		if (this.isRuneLite()) {
			var4.basicAuthentication(BASIC_AUTH_DESKTOP_RUNELITE);
		} else {
			var4.basicAuthentication(BASIC_AUTH_DESKTOP_OSRS);
		}

		var4.header("Host", (new URL(DelayFadeTask.authServiceBaseUrl)).getHost());
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

	@ObfuscatedName("pl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-431948745"
	)
	@Export("requestOtlToken")
	void requestOtlToken(String var1) throws IOException {
		URL var2 = new URL(DelayFadeTask.authServiceBaseUrl + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
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

	@ObfuscatedName("ps")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1764473240"
	)
	@Export("authenticate")
	void authenticate(String var1, String var2) throws IOException, JSONException {
		URL var3 = new URL(HttpContentType.gameSessionServiceBaseUrl + "game-session/v1/tokens");
		HttpRequest var4 = new HttpRequest(var3, HttpMethod.POST, this.https);
		var4.getHeaders().bearerToken(var1);
		var4.getHeaders().accept(HttpContentType.APPLICATION_JSON);
		JSONObject var5 = new JSONObject();
		var5.setProperty("accountId", var2);
		var4.setPayload(new HttpJsonRequestBody(var5));
		this.asyncGameSessionTokenResponse = this.asyncRestClient.submitRequest(var4);
	}

	@ObfuscatedName("pb")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-74"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			boolean var1 = HorizontalAlignment.field2060.method8446();
			if (!var1) {
				this.method836();
			}

		}
	}

	@ObfuscatedName("py")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "864430252"
	)
	void method836() {
		if (HorizontalAlignment.field2060.field4873 >= 4) {
			this.error("js5crc");
			AuthenticationScheme.updateGameState(1000);
		} else {
			if (HorizontalAlignment.field2060.field4877 >= 4) {
				if (gameState <= 5) {
					this.error("js5io");
					AuthenticationScheme.updateGameState(1000);
					return;
				}

				field409 = 3000;
				HorizontalAlignment.field2060.field4877 = 3;
			}

			if (--field409 + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						InterfaceParent.js5SocketTask = GameEngine.taskHandler.newSocketTask(Interpreter.worldHost, class341.currentPort);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (InterfaceParent.js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (InterfaceParent.js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						class157.js5Socket = class113.method3390((Socket)InterfaceParent.js5SocketTask.result, 40000, 5000);
						Buffer var1 = new Buffer(class329.field3726.field3725 + 1);
						var1.writeByte(class329.field3726.field3716);
						var1.writeInt(232);
						var1.writeInt(field469[0]);
						var1.writeInt(field469[1]);
						var1.writeInt(field469[2]);
						var1.writeInt(field469[3]);
						class157.js5Socket.write(var1.array, 0, class329.field3726.field3725 + 1);
						++js5ConnectState;
						HttpMethod.field38 = UserComparator7.method3496();
					}

					if (js5ConnectState == 3) {
						if (class157.js5Socket.available() > 0) {
							int var2 = class157.js5Socket.readUnsignedByte();
							if (var2 != 0) {
								this.js5Error(var2);
								return;
							}

							++js5ConnectState;
						} else if (UserComparator7.method3496() - HttpMethod.field38 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						HorizontalAlignment.field2060.method8448(class157.js5Socket, gameState > 20);
						InterfaceParent.js5SocketTask = null;
						class157.js5Socket = null;
						js5ConnectState = 0;
						js5Errors = 0;
					}
				} catch (IOException var3) {
					this.js5Error(-3);
				}

			}
		}
	}

	@ObfuscatedName("pu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1441303115"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		InterfaceParent.js5SocketTask = null;
		class157.js5Socket = null;
		js5ConnectState = 0;
		if (UserComparator6.worldPort == class341.currentPort) {
			class341.currentPort = HealthBarDefinition.js5Port;
		} else {
			class341.currentPort = UserComparator6.worldPort;
		}

		++js5Errors;
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) {
			if (gameState <= 5) {
				this.error("js5connect_full");
				AuthenticationScheme.updateGameState(1000);
			} else {
				field409 = 3000;
			}
		} else if (js5Errors >= 2 && var1 == 6) {
			this.error("js5connect_outofdate");
			AuthenticationScheme.updateGameState(1000);
		} else if (js5Errors >= 4) {
			if (gameState <= 5) {
				this.error("js5connect");
				AuthenticationScheme.updateGameState(1000);
			} else {
				field409 = 3000;
			}
		}

	}

	@ObfuscatedName("qn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-735032766"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		AbstractSocket var1 = packetWriter.getSocket();
		PacketBuffer var2 = packetWriter.packetBuffer;

		try {
			if (LoginState.SHUTDOWN_PREVIOUS_CONNECTION == class444.loginState) {
				if (BuddyRankComparator.field1570 == null && (secureRandomFuture.isDone() || field498 > 250)) {
					BuddyRankComparator.field1570 = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (BuddyRankComparator.field1570 != null) {
					if (var1 != null) {
						var1.close();
						var1 = null;
					}

					FriendLoginUpdate.field5284 = null;
					hadNetworkError = false;
					field498 = 0;
					if (field388.method11517()) {
						if (this.containsAccessAndRefreshToken()) {
							try {
								this.requestRefreshAccessToken(class389.refreshToken);
								BufferedFile.updateLoginState(LoginState.TOKEN_RESPONSE);
							} catch (Throwable var21) {
								class559.RunException_sendStackTrace((String)null, var21);
								class7.getLoginError(65);
								return;
							}
						} else {
							if (!this.containsSessionAndCharacterId()) {
								class7.getLoginError(65);
								return;
							}

							try {
								this.authenticate(class523.sessionId, class114.characterId);
								BufferedFile.updateLoginState(LoginState.REFRESHING_TOKEN);
							} catch (Exception var20) {
								class559.RunException_sendStackTrace((String)null, var20);
								class7.getLoginError(65);
								return;
							}
						}
					} else {
						BufferedFile.updateLoginState(LoginState.INIT_MOUSEHANDLER_SOCKET);
					}
				}
			}

			HttpResponse var23;
			if (class444.loginState == LoginState.TOKEN_RESPONSE) {
				if (this.refreshAccessTokenRequestFuture != null) {
					if (!this.refreshAccessTokenRequestFuture.isDone()) {
						return;
					}

					if (this.refreshAccessTokenRequestFuture.isCancelled()) {
						class7.getLoginError(65);
						this.refreshAccessTokenRequestFuture = null;
						return;
					}

					try {
						RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.refreshAccessTokenRequestFuture.get();
						if (!var3.isSuccess()) {
							class7.getLoginError(65);
							this.refreshAccessTokenRequestFuture = null;
							return;
						}

						WorldView.accessToken = var3.getAccessToken();
						class389.refreshToken = var3.getRefreshToken();
						this.refreshAccessTokenRequestFuture = null;
					} catch (Exception var19) {
						class559.RunException_sendStackTrace((String)null, var19);
						class7.getLoginError(65);
						this.refreshAccessTokenRequestFuture = null;
						return;
					}
				} else {
					if (this.asyncAccessTokenResponse == null) {
						class7.getLoginError(65);
						return;
					}

					if (!this.asyncAccessTokenResponse.hasFinished()) {
						return;
					}

					if (this.asyncAccessTokenResponse.hasError()) {
						class559.RunException_sendStackTrace(this.asyncAccessTokenResponse.getErrorMessage(), (Throwable)null);
						class7.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}

					var23 = this.asyncAccessTokenResponse.await();
					if (var23.getResponseCode() != 200) {
						class7.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}

					field498 = 0;
					HttpJsonRequestBody var4 = new HttpJsonRequestBody(var23.getResponseBody());

					try {
						WorldView.accessToken = var4.getBody().getString("access_token");
						class389.refreshToken = var4.getBody().getString("refresh_token");
					} catch (Exception var18) {
						class559.RunException_sendStackTrace("Error parsing tokens", var18);
						class7.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}
				}

				this.requestOtlToken(WorldView.accessToken);
				BufferedFile.updateLoginState(LoginState.REFRESHING_TOKEN);
			}

			if (LoginState.REFRESHING_TOKEN == class444.loginState) {
				if (this.otlTokenRequestFuture != null) {
					if (!this.otlTokenRequestFuture.isDone()) {
						return;
					}

					if (this.otlTokenRequestFuture.isCancelled()) {
						class7.getLoginError(65);
						this.otlTokenRequestFuture = null;
						return;
					}

					try {
						OtlTokenResponse var24 = (OtlTokenResponse)this.otlTokenRequestFuture.get();
						if (!var24.isSuccess()) {
							class7.getLoginError(65);
							this.otlTokenRequestFuture = null;
							return;
						}

						this.token = var24.getToken();
						this.otlTokenRequestFuture = null;
					} catch (Exception var17) {
						class559.RunException_sendStackTrace((String)null, var17);
						class7.getLoginError(65);
						this.otlTokenRequestFuture = null;
						return;
					}
				} else {
					if (this.asyncGameSessionTokenResponse == null) {
						class7.getLoginError(65);
						return;
					}

					if (!this.asyncGameSessionTokenResponse.hasFinished()) {
						return;
					}

					if (this.asyncGameSessionTokenResponse.hasError()) {
						class559.RunException_sendStackTrace(this.asyncGameSessionTokenResponse.getErrorMessage(), (Throwable)null);
						class7.getLoginError(65);
						this.asyncGameSessionTokenResponse = null;
						return;
					}

					var23 = this.asyncGameSessionTokenResponse.await();
					if (var23.getResponseCode() != 200) {
						class559.RunException_sendStackTrace("Login authentication error. Response code: " + var23.getResponseCode() + " " + var23.method323() + " Response body: " + var23.getResponseBody(), (Throwable)null);
						class7.getLoginError(65);
						this.asyncGameSessionTokenResponse = null;
						return;
					}

					List var26 = (List)var23.getHeaderFields().get("Content-Type");
					if (var26 != null && var26.contains(HttpContentType.APPLICATION_JSON.getValue())) {
						try {
							JSONObject var5 = new JSONObject(var23.getResponseBody());
							this.token = var5.getString("token");
						} catch (JSONException var16) {
							class559.RunException_sendStackTrace((String)null, var16);
							class7.getLoginError(65);
							this.asyncGameSessionTokenResponse = null;
							return;
						}
					} else {
						this.token = var23.getResponseBody();
					}

					this.asyncGameSessionTokenResponse = null;
				}

				field498 = 0;
				BufferedFile.updateLoginState(LoginState.INIT_MOUSEHANDLER_SOCKET);
			}

			if (class444.loginState == LoginState.INIT_MOUSEHANDLER_SOCKET) {
				if (FriendLoginUpdate.field5284 == null) {
					FriendLoginUpdate.field5284 = GameEngine.taskHandler.newSocketTask(Interpreter.worldHost, class341.currentPort);
				}

				if (FriendLoginUpdate.field5284.status == 2) {
					throw new IOException();
				}

				if (FriendLoginUpdate.field5284.status == 1) {
					var1 = class113.method3390((Socket)FriendLoginUpdate.field5284.result, 40000, 5000);
					packetWriter.setSocket(var1);
					FriendLoginUpdate.field5284 = null;
					BufferedFile.updateLoginState(LoginState.UNMAPPED_20);
				}
			}

			PacketBufferNode var25;
			if (LoginState.UNMAPPED_20 == class444.loginState) {
				packetWriter.clearBuffer();
				var25 = MoveSpeed.method6300();
				var25.packetBuffer.writeByte(class329.field3724.field3716);
				packetWriter.addNode(var25);
				packetWriter.flush();
				var2.offset = 0;
				BufferedFile.updateLoginState(LoginState.READ_LOGIN_STATUS);
			}

			int var12;
			if (class444.loginState == LoginState.READ_LOGIN_STATUS) {
				if (pcmPlayer1 != null) {
					pcmPlayer1.method3003();
				}

				if (var1.isAvailable(1)) {
					var12 = var1.readUnsignedByte();
					if (pcmPlayer1 != null) {
						pcmPlayer1.method3003();
					}

					if (var12 != 0) {
						class7.getLoginError(var12);
						return;
					}

					var2.offset = 0;
					BufferedFile.updateLoginState(LoginState.READ_RANDOM_VERIFICATION_NUMBER);
				}
			}

			if (LoginState.READ_RANDOM_VERIFICATION_NUMBER == class444.loginState) {
				if (var2.offset < 8) {
					var12 = var1.available();
					if (var12 > 8 - var2.offset) {
						var12 = 8 - var2.offset;
					}

					if (var12 > 0) {
						var1.read(var2.array, var2.offset, var12);
						var2.offset += var12;
					}
				}

				if (var2.offset == 8) {
					var2.offset = 0;
					field346 = var2.readLong();
					BufferedFile.updateLoginState(LoginState.WRITE_INITIAL_LOGIN_PACKET);
				}
			}

			if (LoginState.WRITE_INITIAL_LOGIN_PACKET == class444.loginState) {
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var27 = new PacketBuffer(500);
				int[] var28 = new int[]{BuddyRankComparator.field1570.nextInt(), BuddyRankComparator.field1570.nextInt(), BuddyRankComparator.field1570.nextInt(), BuddyRankComparator.field1570.nextInt()};
				var27.offset = 0;
				var27.writeByte(1);
				var27.writeInt(var28[0]);
				var27.writeInt(var28[1]);
				var27.writeInt(var28[2]);
				var27.writeInt(var28[3]);
				var27.writeLong(field346);
				if (gameState == 40) {
					var27.writeInt(field469[0]);
					var27.writeInt(field469[1]);
					var27.writeInt(field469[2]);
					var27.writeInt(field469[3]);
				} else {
					if (gameState == 50) {
						var27.writeByte(AuthenticationScheme.field1581.rsOrdinal());
						var27.writeInt(Skeleton.field2625);
					} else {
						var27.writeByte(authenticationScheme.rsOrdinal());
						switch(authenticationScheme.schemeId) {
						case 0:
							var27.writeInt(FriendSystem.clientPreferences.getParameterValue(Login.Login_username));
							break;
						case 1:
						case 2:
							var27.writeMedium(class563.otpMedium);
							++var27.offset;
						case 3:
						default:
							break;
						case 4:
							var27.offset += 4;
						}
					}

					if (field388.method11517()) {
						var27.writeByte(class591.field5874.rsOrdinal());
						var27.writeStringCp1252NullTerminated(this.token);
					} else {
						var27.writeByte(class591.field5873.rsOrdinal());
						var27.writeStringCp1252NullTerminated(Login.Login_password);
					}
				}

				var27.encryptRsa(class50.field698, class50.field697);
				field469 = var28;
				PacketBufferNode var31 = MoveSpeed.method6300();
				var31.packetBuffer.offset = 0;
				if (gameState == 40) {
					var31.packetBuffer.writeByte(class329.field3718.field3716);
				} else {
					var31.packetBuffer.writeByte(class329.field3729.field3716);
				}

				var31.packetBuffer.writeShort(0);
				int var6 = var31.packetBuffer.offset;
				var31.packetBuffer.writeInt(232);
				var31.packetBuffer.writeInt(1);
				if (class581.field5790 >= 232) {
					var31.packetBuffer.writeInt(class581.field5790);
				}

				var31.packetBuffer.writeByte(clientType);
				var31.packetBuffer.writeByte(field320);
				byte var7 = 0;
				var31.packetBuffer.writeByte(var7);
				var31.packetBuffer.writeBytes(var27.array, 0, var27.offset);
				int var8 = var31.packetBuffer.offset;
				var31.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var31.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var31.packetBuffer.writeShort(RestClientThreadFactory.canvasWidth);
				var31.packetBuffer.writeShort(GameEngine.canvasHeight);
				class323.randomDatData2(var31.packetBuffer);
				var31.packetBuffer.writeStringCp1252NullTerminated(ArchiveDiskAction.field4784);
				var31.packetBuffer.writeInt(WorldMapSectionType.field3345);
				var31.packetBuffer.writeByte(0);
				Buffer var9 = new Buffer(ArchiveLoader.platformInfo.size());
				ArchiveLoader.platformInfo.write(var9);
				var31.packetBuffer.writeBytes(var9.array, 0, var9.array.length);
				var31.packetBuffer.writeByte(clientType);
				var31.packetBuffer.writeInt(0);
				if (ObjectComposition.field2301) {
					var31.packetBuffer.writeInt(class4.field6.hash);
					var31.packetBuffer.writeInt(PacketWriter.archive10.hash);
					var31.packetBuffer.writeIntIME(class188.archive8.hash);
					var31.packetBuffer.writeIntIME(class173.field1915.hash);
					var31.packetBuffer.writeIntLE(class36.archive13.hash);
					var31.packetBuffer.writeIntME(CollisionMap.field3159.hash);
					var31.packetBuffer.writeInt(MoveSpeed.field3199.hash);
				} else {
					GrandExchangeOfferTotalQuantityComparator.method8496(var31);
				}

				var31.packetBuffer.xteaEncrypt(var28, var8, var31.packetBuffer.offset);
				var31.packetBuffer.writeLengthShort(var31.packetBuffer.offset - var6);
				packetWriter.addNode(var31);
				packetWriter.flush();
				packetWriter.isaacCipher = new IsaacCipher(var28);
				int[] var10 = new int[4];

				for (int var11 = 0; var11 < 4; ++var11) {
					var10[var11] = var28[var11] + 50;
				}

				var2.newIsaacCipher(var10);
				BufferedFile.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			int var13;
			if (LoginState.READ_CLIENT_INFO_STATUS == class444.loginState && var1.available() > 0) {
				var12 = var1.readUnsignedByte();
				if (var12 == 61) {
					var13 = var1.available();
					class161.field1846 = var13 == 1 && var1.readUnsignedByte() == 1;
					BufferedFile.updateLoginState(LoginState.WRITE_INITIAL_LOGIN_PACKET);
				}

				if (var12 == 21 && gameState == 20) {
					BufferedFile.updateLoginState(LoginState.READ_PROFILE_TRANSFER_TIME);
				} else if (var12 == 2) {
					if (ObjectComposition.field2301) {
						BufferedFile.updateLoginState(LoginState.UNMAPPED_21);
					} else {
						BufferedFile.updateLoginState(LoginState.UNMAPPED);
					}
				} else if (var12 == 15 && gameState == 40) {
					packetWriter.serverPacketLength = -1;
					BufferedFile.updateLoginState(LoginState.UNMAPPED_19);
				} else if (var12 == 64) {
					BufferedFile.updateLoginState(LoginState.READ_STATE_11_PACKET_SIZE);
				} else if (var12 == 23 && field462 < 1) {
					++field462;
					BufferedFile.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				} else if (var12 == 29) {
					BufferedFile.updateLoginState(LoginState.UNMAPPED_17);
				} else {
					if (var12 != 69) {
						class7.getLoginError(var12);
						return;
					}

					BufferedFile.updateLoginState(LoginState.READ_DIGEST_PARSER_PACKET_SIZE);
				}
			}

			if (LoginState.UNMAPPED_21 == class444.loginState) {
				AsyncRestClient.field57 = true;
				class202.method4464(class69.field946);
				AuthenticationScheme.updateGameState(0);
			}

			if (class444.loginState == LoginState.READ_DIGEST_PARSER_PACKET_SIZE && var1.available() >= 2) {
				var1.read(var2.array, 0, 2);
				var2.offset = 0;
				class361.field3982 = var2.readUnsignedShort();
				BufferedFile.updateLoginState(LoginState.SUBMIT_DIGEST_PARSER_TASK);
			}

			if (LoginState.SUBMIT_DIGEST_PARSER_TASK == class444.loginState && var1.available() >= class361.field3982) {
				var2.offset = 0;
				var1.read(var2.array, var2.offset, class361.field3982);
				class6 var29 = class165.method4006()[var2.readUnsignedByte()];

				try {
					switch(var29.field14) {
					case 0:
						class0 var30 = new class0();
						this.field597 = new class7(var2, var30);
						BufferedFile.updateLoginState(LoginState.WRITE_DIGEST_PARSER_RESULT);
						break;
					default:
						throw new IllegalArgumentException();
					}
				} catch (Exception var15) {
					class7.getLoginError(22);
					return;
				}
			}

			if (class444.loginState == LoginState.WRITE_DIGEST_PARSER_RESULT && this.field597.method43()) {
				this.field472 = this.field597.method39();
				this.field597.method38();
				this.field597 = null;
				if (this.field472 == null) {
					class7.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				var25 = MoveSpeed.method6300();
				var25.packetBuffer.writeByte(class329.field3727.field3716);
				var25.packetBuffer.writeShort(this.field472.offset);
				var25.packetBuffer.writeBuffer(this.field472);
				packetWriter.addNode(var25);
				packetWriter.flush();
				this.field472 = null;
				BufferedFile.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			if (class444.loginState == LoginState.READ_STATE_11_PACKET_SIZE && var1.available() > 0) {
				IntProjection.field2597 = var1.readUnsignedByte();
				BufferedFile.updateLoginState(LoginState.UNMAPPED_11);
			}

			if (LoginState.UNMAPPED_11 == class444.loginState && var1.available() >= IntProjection.field2597) {
				var1.read(var2.array, 0, IntProjection.field2597);
				var2.offset = 0;
				BufferedFile.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			if (LoginState.READ_PROFILE_TRANSFER_TIME == class444.loginState && var1.available() > 0) {
				field387 = (var1.readUnsignedByte() + 3) * 60;
				BufferedFile.updateLoginState(LoginState.PROFILE_TRANSFER);
			}

			if (LoginState.PROFILE_TRANSFER == class444.loginState) {
				field498 = 0;
				class460.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field387 / 60 + " seconds.");
				if (--field387 <= 0) {
					BufferedFile.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				}

			} else if (class444.loginState == LoginState.READ_ACCOUNT_INFO_PACKET_SIZE) {
				var25 = MoveSpeed.method6300();
				var25.packetBuffer.writeByte(class329.field3722.field3716);
				var25.packetBuffer.writeShort(class329.field3722.field3725);
				AbstractByteArrayCopier.method8082(var25);
				packetWriter.addNode(var25);
				packetWriter.flush();
				BufferedFile.updateLoginState(LoginState.UNMAPPED);
			} else {
				if (class444.loginState == LoginState.UNMAPPED && var1.available() >= 1) {
					Huffman.field4249 = var1.readUnsignedByte();
					if (Huffman.field4249 != class329.field3720.field3725) {
						class7.getLoginError(Huffman.field4249);
						return;
					}

					BufferedFile.updateLoginState(LoginState.READ_ACCOUNT_INFO);
				}

				if (class444.loginState == LoginState.READ_ACCOUNT_INFO && var1.available() >= Huffman.field4249) {
					boolean var37 = var1.readUnsignedByte() == 1;
					var1.read(var2.array, 0, 4);
					var2.offset = 0;
					boolean var36 = false;
					if (var37) {
						var13 = var2.readByteIsaac() << 24;
						var13 |= var2.readByteIsaac() << 16;
						var13 |= var2.readByteIsaac() << 8;
						var13 |= var2.readByteIsaac();
						FriendSystem.clientPreferences.put(Login.Login_username, var13);
					}

					if (Login_isUsernameRemembered) {
						FriendSystem.clientPreferences.updateRememberedUsername(Login.Login_username);
					} else {
						FriendSystem.clientPreferences.updateRememberedUsername((String)null);
					}

					SceneTilePaint.savePreferences();
					staffModLevel = var1.readUnsignedByte();
					playerMod = var1.readUnsignedByte() == 1;
					localPlayerIndex = var1.readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += var1.readUnsignedByte();
					field538 = var1.readUnsignedByte();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					this.accountHash = var2.readLong();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					userId = var2.readLong();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					userHash = var2.readLong();
					class190.method4289().method5937(this.https);
					BufferedFile.updateLoginState(LoginState.SET_SERVER_PROTOCOL);
				}

				if (class444.loginState == LoginState.SET_SERVER_PROTOCOL && var1.available() >= packetWriter.serverPacketLength) {
					var1.read(var2.array, 0, 1);
					var2.offset = 0;
					if (var2.method11182()) {
						var1.read(var2.array, 1, 1);
						var2.offset = 0;
					}

					ServerPacket[] var33 = MusicPatchNode.ServerPacket_values();
					var13 = var2.readSmartByteShortIsaac();
					if (var13 < 0 || var13 >= var33.length) {
						throw new IOException("Invalid ServerProt: " + var13 + " at " + var2.offset);
					}

					packetWriter.serverPacket = var33[var13];
					packetWriter.serverPacketLength = packetWriter.serverPacket.length;
					var1.read(var2.array, 0, 2);
					var2.offset = 0;
					packetWriter.serverPacketLength = var2.readUnsignedShort();

					try {
						class26.method405(Language.client, "zap");
					} catch (Throwable var14) {
					}

					BufferedFile.updateLoginState(LoginState.UPDATE_PLAYER_AND_LOAD_REGIONS);
				}

				if (class444.loginState == LoginState.UPDATE_PLAYER_AND_LOAD_REGIONS) {
					if (var1.available() >= packetWriter.serverPacketLength) {
						var2.offset = 0;
						var1.read(var2.array, 0, packetWriter.serverPacketLength);
						timer.method8247();
						class62.method2113();
						playerUpdateManager.updatePlayer(var2);
						class292.method6703();
						BuddyRankComparator.field1574 = -1;
						class161.loadRegions(false, var2);
						packetWriter.serverPacket = null;
						field433 = false;
					}

				} else {
					if (LoginState.UNMAPPED_17 == class444.loginState && var1.available() >= 2) {
						var2.offset = 0;
						var1.read(var2.array, 0, 2);
						var2.offset = 0;
						Fonts.field5635 = var2.readUnsignedShort();
						BufferedFile.updateLoginState(LoginState.UNMAPPED_18);
					}

					if (LoginState.UNMAPPED_18 == class444.loginState && var1.available() >= Fonts.field5635) {
						var2.offset = 0;
						var1.read(var2.array, 0, Fonts.field5635);
						var2.offset = 0;
						String var35 = var2.readStringCp1252NullTerminated();
						String var32 = var2.readStringCp1252NullTerminated();
						String var34 = var2.readStringCp1252NullTerminated();
						class460.setLoginResponseString(var35, var32, var34);
						AuthenticationScheme.updateGameState(10);
						if (field388.method11517()) {
							DynamicObject.method1987(9);
						}
					}

					if (class444.loginState != LoginState.UNMAPPED_19) {
						++field498;
						if (field498 > 2000) {
							if (field462 < 1) {
								if (class341.currentPort == UserComparator6.worldPort) {
									class341.currentPort = HealthBarDefinition.js5Port;
								} else {
									class341.currentPort = UserComparator6.worldPort;
								}

								++field462;
								BufferedFile.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
							} else {
								class7.getLoginError(-3);
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
							var12 = packetWriter.serverPacketLength;
							timer.method8249();
							packetWriter.clearBuffer();
							packetWriter.field1275 = 0;
							packetWriter.packetBuffer.offset = 0;
							packetWriter.serverPacket = null;
							packetWriter.field1279 = null;
							packetWriter.field1276 = null;
							packetWriter.field1266 = null;
							packetWriter.serverPacketLength = 0;
							packetWriter.field1274 = 0;
							rebootTimer = 0;
							menu.menuOptionsCount = 0;
							isMenuOpen = false;
							minimapState = 0;
							destinationX = 0;
							class7.topLevelWorldView.method2626();
							AbstractWorldMapData.method6797();
							AuthenticationScheme.updateGameState(30);

							for (var13 = 0; var13 < 100; ++var13) {
								validRootWidgets[var13] = true;
							}

							class101.method3101();
							playerUpdateManager.updatePlayer(var2);
							if (var12 != var2.offset) {
								throw new RuntimeException();
							}
						}
					}
				}
			}
		} catch (IOException var22) {
			if (field462 < 1) {
				if (UserComparator6.worldPort == class341.currentPort) {
					class341.currentPort = HealthBarDefinition.js5Port;
				} else {
					class341.currentPort = UserComparator6.worldPort;
				}

				++field462;
				BufferedFile.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
			} else {
				class7.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("qz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-90"
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
			AsyncRestClient.method161();
		} else {
			if (!isMenuOpen) {
				class166.addCancelMenuEntry();
			}

			this.method848();
			if (gameState == 30) {
				PacketBufferNode var1;
				int var2;
				while (HealthBarUpdate.method2473()) {
					var1 = class291.getPacketBufferNode(ClientPacket.REFLECTION_CHECK_REPLY, packetWriter.isaacCipher);
					var1.packetBuffer.writeByte(0);
					var2 = var1.packetBuffer.offset;
					ItemContainer.performReflectionCheck(var1.packetBuffer);
					var1.packetBuffer.writeLengthByte(var1.packetBuffer.offset - var2);
					packetWriter.addNode(var1);
				}

				if (timer.field4748) {
					var1 = class291.getPacketBufferNode(ClientPacket.LOGIN_TIMINGS, packetWriter.isaacCipher);
					var1.packetBuffer.writeByte(0);
					var2 = var1.packetBuffer.offset;
					timer.write(var1.packetBuffer);
					var1.packetBuffer.writeLengthByte(var1.packetBuffer.offset - var2);
					packetWriter.addNode(var1);
					timer.method8248();
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
				synchronized(WorldMapLabel.mouseRecorder.lock) {
					if (!field304) {
						WorldMapLabel.mouseRecorder.index = 0;
					} else if (MouseHandler.MouseHandler_lastButton != 0 || WorldMapLabel.mouseRecorder.index >= 40) {
						PacketBufferNode var15 = null;
						var3 = 0;
						var4 = 0;
						var5 = 0;
						var6 = 0;

						for (var7 = 0; var7 < WorldMapLabel.mouseRecorder.index && (var15 == null || var15.packetBuffer.offset - var3 < 246); ++var7) {
							var4 = var7;
							var8 = WorldMapLabel.mouseRecorder.ys[var7];
							if (var8 < -1) {
								var8 = -1;
							} else if (var8 > 65534) {
								var8 = 65534;
							}

							var9 = WorldMapLabel.mouseRecorder.xs[var7];
							if (var9 < -1) {
								var9 = -1;
							} else if (var9 > 65534) {
								var9 = 65534;
							}

							if (var9 != field375 || var8 != field595) {
								if (var15 == null) {
									var15 = class291.getPacketBufferNode(ClientPacket.MOUSE_MOVE, packetWriter.isaacCipher);
									var15.packetBuffer.writeByte(0);
									var3 = var15.packetBuffer.offset;
									PacketBuffer var10000 = var15.packetBuffer;
									var10000.offset += 2;
									var5 = 0;
									var6 = 0;
								}

								if (field377 != -1L) {
									var10 = var9 - field375;
									var11 = var8 - field595;
									var12 = (int)((WorldMapLabel.mouseRecorder.millis[var7] - field377) / 20L);
									var5 = (int)((long)var5 + (WorldMapLabel.mouseRecorder.millis[var7] - field377) % 20L);
								} else {
									var10 = var9;
									var11 = var8;
									var12 = Integer.MAX_VALUE;
								}

								field375 = var9;
								field595 = var8;
								if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
									var10 += 32;
									var11 += 32;
									var15.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6));
								} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
									var10 += 128;
									var11 += 128;
									var15.packetBuffer.writeByte(var12 + 128);
									var15.packetBuffer.writeShort(var11 + (var10 << 8));
								} else if (var12 < 32) {
									var15.packetBuffer.writeByte(var12 + 192);
									if (var9 != -1 && var8 != -1) {
										var15.packetBuffer.writeInt(var9 | var8 << 16);
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								} else {
									var15.packetBuffer.writeShort((var12 & 8191) + 57344);
									if (var9 != -1 && var8 != -1) {
										var15.packetBuffer.writeInt(var9 | var8 << 16);
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								}

								++var6;
								field377 = WorldMapLabel.mouseRecorder.millis[var7];
							}
						}

						if (var15 != null) {
							var15.packetBuffer.writeLengthByte(var15.packetBuffer.offset - var3);
							var7 = var15.packetBuffer.offset;
							var15.packetBuffer.offset = var3;
							var15.packetBuffer.writeByte(var5 / var6);
							var15.packetBuffer.writeByte(var5 % var6);
							var15.packetBuffer.offset = var7;
							packetWriter.addNode(var15);
						}

						if (var4 >= WorldMapLabel.mouseRecorder.index) {
							WorldMapLabel.mouseRecorder.index = 0;
						} else {
							MouseRecorder var47 = WorldMapLabel.mouseRecorder;
							var47.index -= var4;
							System.arraycopy(WorldMapLabel.mouseRecorder.xs, var4, WorldMapLabel.mouseRecorder.xs, 0, WorldMapLabel.mouseRecorder.index);
							System.arraycopy(WorldMapLabel.mouseRecorder.ys, var4, WorldMapLabel.mouseRecorder.ys, 0, WorldMapLabel.mouseRecorder.index);
							System.arraycopy(WorldMapLabel.mouseRecorder.millis, var4, WorldMapLabel.mouseRecorder.millis, 0, WorldMapLabel.mouseRecorder.index);
						}
					}
				}

				this.method882();
				if (mouseWheelRotation != 0) {
					var1 = class291.getPacketBufferNode(ClientPacket.MOUSE_WHEEL, packetWriter.isaacCipher);
					var1.packetBuffer.writeShort(mouseWheelRotation);
					packetWriter.addNode(var1);
				}

				if (FloorUnderlayDefinition.method4416()) {
					var1 = class291.getPacketBufferNode(ClientPacket.EVENT_KEYBOARD, packetWriter.isaacCipher);
					var1.packetBuffer.writeShort(0);
					var2 = var1.packetBuffer.offset;
					long var16 = UserComparator7.method3496();

					for (var5 = 0; var5 < indexCheck.field3133; ++var5) {
						long var18 = var16 - field465;
						if (var18 > 16777215L) {
							var18 = 16777215L;
						}

						field465 = var16;
						var1.packetBuffer.writeByte(indexCheck.field3144[var5]);
						var1.packetBuffer.method11276((int)var18);
					}

					var1.packetBuffer.writeLengthShort(var1.packetBuffer.offset - var2);
					packetWriter.addNode(var1);
				}

				if (field467 > 0) {
					--field467;
				}

				if (indexCheck.isValidIndexInRange(96) || indexCheck.isValidIndexInRange(97) || indexCheck.isValidIndexInRange(98) || indexCheck.isValidIndexInRange(99)) {
					field310 = true;
				}

				if (field310 && field467 <= 0) {
					field467 = 20;
					field310 = false;
					var1 = class291.getPacketBufferNode(ClientPacket.EVENT_CAMERA_POSITION, packetWriter.isaacCipher);
					var1.packetBuffer.writeShortLE(camAngleX);
					var1.packetBuffer.writeShortLE(camAngleY);
					packetWriter.addNode(var1);
				}

				if (WorldMapScaleHandler.hasFocus && !hadFocus) {
					hadFocus = true;
					var1 = class291.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
					var1.packetBuffer.writeByte(1);
					packetWriter.addNode(var1);
				}

				if (!WorldMapScaleHandler.hasFocus && hadFocus) {
					hadFocus = false;
					var1 = class291.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
					var1.packetBuffer.writeByte(0);
					packetWriter.addNode(var1);
				}

				if (Skills.worldMap != null) {
					Skills.worldMap.method10859();
				}

				if (MilliClock.ClanChat_inClanChat) {
					if (MusicPatch.friendsChat != null) {
						MusicPatch.friendsChat.sort();
					}

					MidiRequest.method7367();
					MilliClock.ClanChat_inClanChat = false;
				}

				if (class360.field3971) {
					WorldMapSectionType.method6762();
					class360.field3971 = false;
				}

				BuddyRankComparator.method3548();
				if (gameState == 30) {
					ReflectionCheck.method758();
					class108.method3333();
					++packetWriter.field1274;
					if (packetWriter.field1274 > 750) {
						AsyncRestClient.method161();
					} else {
						class481.method9805();
						Iterator var30 = worldViewManager.iterator();

						while (var30.hasNext()) {
							WorldView var36 = (WorldView)var30.next();
							Iterator var20 = var36.npcs.iterator();

							while (var20.hasNext()) {
								NPC var21 = (NPC)var20.next();
								if (var21 != null) {
									Language.updateActorSequence(var36, var21, var21.definition.size);
								}
							}
						}

						class146.method3750();
						KitDefinition.method4232();
						++graphicsCycle;
						if (mouseCrossColor != 0) {
							mouseCrossState = mouseCrossState * 400 + 20;
							if (mouseCrossState * 400 >= 400) {
								mouseCrossColor = 0;
							}
						}

						if (field307 > 0) {
							--field307;
						}

						Widget var31 = JagexCache.mousedOverWidgetIf1;
						Widget var37 = Canvas.field102;
						JagexCache.mousedOverWidgetIf1 = null;
						Canvas.field102 = null;
						draggedOnWidget = null;
						field413 = false;
						field519 = false;
						field421 = 0;

						while (indexCheck.method6092() && field421 < 128) {
							if (staffModLevel >= 2 && indexCheck.isValidIndexInRange(82) && indexCheck.field3137 == 66) {
								String var38 = WidgetDefinition.method7471();
								Language.client.method654(var38);
							} else if (oculusOrbState != 1 || indexCheck.field3136 <= 0) {
								field423[field421] = indexCheck.field3137;
								field564[field421] = indexCheck.field3136;
								++field421;
							}
						}

						if (GrandExchangeOfferTotalQuantityComparator.method8499() && indexCheck.isValidIndexInRange(82) && indexCheck.isValidIndexInRange(81) && mouseWheelRotation != 0) {
							var3 = class27.localPlayer.plane - mouseWheelRotation;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > 3) {
								var3 = 3;
							}

							if (var3 != class27.localPlayer.plane) {
								PcmPlayer.method3004(class27.localPlayer.pathX[0] + class7.topLevelWorldView.baseX, class27.localPlayer.pathY[0] + class7.topLevelWorldView.baseY, var3, false);
							}

							mouseWheelRotation = 0;
						}

						if (rootInterface != -1) {
							AnimationSequence.updateRootInterface(rootInterface, 0, 0, RestClientThreadFactory.canvasWidth, GameEngine.canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							Widget var22;
							ScriptEvent var39;
							Widget var40;
							do {
								var39 = (ScriptEvent) scriptEvents2.removeLast();
								if (var39 == null) {
									while (true) {
										do {
											var39 = (ScriptEvent) scriptEvents3.removeLast();
											if (var39 == null) {
												while (true) {
													do {
														var39 = (ScriptEvent)scriptEvents.removeLast();
														if (var39 == null) {
															boolean var33 = false;

															while (true) {
																class271 var41 = (class271)field416.removeLast();
																if (var41 == null) {
																	if (!var33 && MouseHandler.MouseHandler_lastButton == 1) {
																		field344.method6081();
																	}

																	this.menu();
																	if (Skills.worldMap != null) {
																		Skills.worldMap.method10693(class7.topLevelWorldView.plane, (field581 >> 7) + class7.topLevelWorldView.baseX, (field492 >> 7) + class7.topLevelWorldView.baseY, false);
																		Skills.worldMap.loadCache();
																	}

																	if (clickedWidget != null) {
																		this.method855();
																	}

																	Iterator var42 = worldViewManager.iterator();

																	while (var42.hasNext()) {
																		WorldView var43 = (WorldView)var42.next();
																		Scene var23 = var43.scene;
																		if (var23.shouldSendWalk()) {
																			var7 = var23.baseX;
																			var8 = var23.baseY;
																			PacketBufferNode var24 = class291.getPacketBufferNode(ClientPacket.MOVE_GAMECLICK, packetWriter.isaacCipher);
																			var24.packetBuffer.writeByte(5);
																			var24.packetBuffer.writeShortLE(var7 + var43.baseX);
																			var24.packetBuffer.writeShortLE(var8 + var43.baseY);
																			var24.packetBuffer.writeByte(indexCheck.isValidIndexInRange(82) ? (indexCheck.isValidIndexInRange(81) ? 2 : 1) : 0);
																			packetWriter.addNode(var24);
																			mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																			mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																			mouseCrossColor = 1;
																			mouseCrossState = 0;
																			destinationX = var7;
																			destinationY = var8;
																			var23.method5138();
																		}
																	}

																	if (var31 != JagexCache.mousedOverWidgetIf1) {
																		if (var31 != null) {
																			ApproximateRouteStrategy.invalidateWidget(var31);
																		}

																		if (JagexCache.mousedOverWidgetIf1 != null) {
																			ApproximateRouteStrategy.invalidateWidget(JagexCache.mousedOverWidgetIf1);
																		}
																	}

																	if (var37 != Canvas.field102 && field392 == field506) {
																		if (var37 != null) {
																			ApproximateRouteStrategy.invalidateWidget(var37);
																		}

																		if (Canvas.field102 != null) {
																			ApproximateRouteStrategy.invalidateWidget(Canvas.field102);
																		}
																	}

																	if (Canvas.field102 != null) {
																		if (field392 < field506) {
																			++field392;
																			if (field506 == field392) {
																				ApproximateRouteStrategy.invalidateWidget(Canvas.field102);
																			}
																		}
																	} else if (field392 > 0) {
																		--field392;
																	}

																	if (oculusOrbState == 0) {
																		WorldView var44 = worldViewManager.getWorldView(field327);
																		if (var44 == null) {
																			var44 = class7.topLevelWorldView;
																		}

																		Object var45 = null;
																		switch(BuddyRankComparator.field1571.field4307) {
																		case 0:
																			var45 = (Entity)var44.players.get((long)field328);
																			break;
																		case 1:
																			var45 = (Entity)var44.npcs.get((long)field328);
																			break;
																		case 2:
																			var45 = (Entity)var44.worldEntities.get((long)field328);
																		}

																		if (var45 == null) {
																			var45 = class27.localPlayer;
																		}

																		field581 = ((Entity)var45).getY();
																		field492 = ((Entity)var45).getPlane();
																		if (var44 != class7.topLevelWorldView) {
																			class448 var46 = AttackOption.method2761(var44, ((Entity)var45).getY(), ((Entity)var45).getPlane());
																			field581 = (int)var46.field5059;
																			field492 = (int)var46.field5054;
																			var46.method9038();
																		}

																		var6 = ((Entity)var45).getX();
																		if (class28.oculusOrbFocalPointX - field581 >= -500 && class28.oculusOrbFocalPointX - field581 <= 500 && MusicPatch.oculusOrbFocalPointY - field492 >= -500 && MusicPatch.oculusOrbFocalPointY - field492 <= 500) {
																			if (field581 != class28.oculusOrbFocalPointX) {
																				class28.oculusOrbFocalPointX += (field581 - class28.oculusOrbFocalPointX) / 16;
																			}

																			if (MusicPatch.oculusOrbFocalPointY != field492) {
																				MusicPatch.oculusOrbFocalPointY += (field492 - MusicPatch.oculusOrbFocalPointY) / 16;
																			}
																		} else {
																			class28.oculusOrbFocalPointX = field581;
																			MusicPatch.oculusOrbFocalPointY = field492;
																		}

																		var7 = class28.oculusOrbFocalPointX >> 7;
																		var8 = MusicPatch.oculusOrbFocalPointY >> 7;
																		var9 = class477.getTileHeight(class7.topLevelWorldView, class28.oculusOrbFocalPointX, MusicPatch.oculusOrbFocalPointY, var6);
																		var10 = 0;
																		if (var7 > 3 && var8 > 3 && var7 < 100 && var8 < 100) {
																			for (var11 = var7 - 4; var11 <= var7 + 4; ++var11) {
																				for (var12 = var8 - 4; var12 <= var8 + 4; ++var12) {
																					int var25 = var6;
																					if (var6 < 3 && (class7.topLevelWorldView.tileSettings[1][var11][var12] & 2) == 2) {
																						var25 = var6 + 1;
																					}

																					int var14 = var9 - class7.topLevelWorldView.tileHeights[var25][var11][var12];
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

																		if (var11 > field363) {
																			field363 += (var11 - field363) / 24;
																		} else if (var11 < field363) {
																			field363 += (var11 - field363) / 80;
																		}

																		field352 = class88.method2838(var44, ((Entity)var45).getY(), ((Entity)var45).getPlane(), var6);
																		ClanChannelMember.oculusOrbFocalPointZ = field352 - camFollowHeight;
																	} else if (oculusOrbState == 1) {
																		class36.method752();
																		short var32 = -1;
																		if (indexCheck.isValidIndexInRange(33)) {
																			var32 = 0;
																		} else if (indexCheck.isValidIndexInRange(49)) {
																			var32 = 1024;
																		}

																		if (indexCheck.isValidIndexInRange(48)) {
																			if (var32 == 0) {
																				var32 = 1792;
																			} else if (var32 == 1024) {
																				var32 = 1280;
																			} else {
																				var32 = 1536;
																			}
																		} else if (indexCheck.isValidIndexInRange(50)) {
																			if (var32 == 0) {
																				var32 = 256;
																			} else if (var32 == 1024) {
																				var32 = 768;
																			} else {
																				var32 = 512;
																			}
																		}

																		byte var34 = 0;
																		if (indexCheck.isValidIndexInRange(35)) {
																			var34 = -1;
																		} else if (indexCheck.isValidIndexInRange(51)) {
																			var34 = 1;
																		}

																		var6 = 0;
																		if (var32 >= 0 || var34 != 0) {
																			var6 = indexCheck.isValidIndexInRange(81) ? oculusOrbSlowedSpeed : oculusOrbNormalSpeed;
																			var6 *= 16;
																			field463 = var32;
																			field464 = var34;
																		}

																		if (field457 < var6) {
																			field457 += var6 / 8;
																			if (field457 > var6) {
																				field457 = var6;
																			}
																		} else if (field457 > var6) {
																			field457 = field457 * 9 / 10;
																		}

																		if (field457 > 0) {
																			var7 = field457 / 16;
																			if (field463 >= 0) {
																				var4 = field463 - class28.cameraYaw & 2047;
																				var8 = Rasterizer3D.Rasterizer3D_sine[var4];
																				var9 = Rasterizer3D.Rasterizer3D_cosine[var4];
																				class28.oculusOrbFocalPointX += var8 * var7 / 65536;
																				MusicPatch.oculusOrbFocalPointY += var9 * var7 / 65536;
																			}

																			if (field464 != 0) {
																				ClanChannelMember.oculusOrbFocalPointZ += var7 * field464;
																				if (ClanChannelMember.oculusOrbFocalPointZ > 0) {
																					ClanChannelMember.oculusOrbFocalPointZ = 0;
																				}
																			}
																		} else {
																			field463 = -1;
																			field464 = -1;
																		}

																		char var35 = '耀';
																		if (var35 > field363) {
																			field363 += (var35 - field363) / 24;
																		} else if (var35 < field363) {
																			field363 += (var35 - field363) / 80;
																		}

																		if (indexCheck.isValidIndexInRange(13)) {
																			packetWriter.addNode(class291.getPacketBufferNode(ClientPacket.FREECAM_EXIT, packetWriter.isaacCipher));
																			oculusOrbState = 0;
																		}
																	}

																	if (MouseHandler.MouseHandler_currentButton == 4 && WidgetDefinition.mouseCam) {
																		var4 = MouseHandler.MouseHandler_y - mouseCamClickedY;
																		camAngleDX = var4 * 2;
																		mouseCamClickedY = var4 != -1 && var4 != 1 ? (mouseCamClickedY + MouseHandler.MouseHandler_y) / 2 : MouseHandler.MouseHandler_y;
																		var5 = mouseCamClickedX - MouseHandler.MouseHandler_x;
																		camAngleDY = var5 * 2;
																		mouseCamClickedX = var5 != -1 && var5 != 1 ? (mouseCamClickedX + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x;
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

																	if (field428) {
																		FileSystem.method5914(class50.field700, Login.field743, class66.field894);
																		class374.method8116(class266.field3103, AsyncRestClient.field60);
																		if (Language.cameraX == class50.field700 && Login.field743 == WorldMapCacheName.cameraY && class66.field894 == class66.cameraZ && class187.cameraPitch == class266.field3103 && class28.cameraYaw == AsyncRestClient.field60) {
																			field428 = false;
																			isCameraLocked = false;
																			field380 = false;
																			field347 = false;
																			Sound.field1791 = 0;
																			ClanChannel.field1892 = 0;
																			WorldMapElement.field1981 = 0;
																			EnumComposition.field2034 = 0;
																			class141.field1694 = 0;
																			UserComparator8.field1544 = 0;
																			WorldMapData_0.field3211 = 0;
																			WorldViewManager.field1000 = 0;
																			WorldMapSectionType.field3343 = 0;
																			class329.field3728 = 0;
																			field568 = null;
																			field570 = null;
																			field569 = null;
																		}
																	} else if (isCameraLocked) {
																		ApproximateRouteStrategy.method800();
																	}

																	for (var4 = 0; var4 < 5; ++var4) {
																		int var10002 = field575[var4]++;
																	}

																	FloorDecoration.varcs.tryWrite();
																	var4 = ++MouseHandler.MouseHandler_idleCycles - 1;
																	var6 = GameEngine.keyHandler.method368();
																	PacketBufferNode var26;
																	if (var4 > 15000 && var6 > 15000) {
																		logoutTimer = 250;
																		class182.method4165(14500);
																		var26 = class291.getPacketBufferNode(ClientPacket.EVENT_MOUSE_IDLE, packetWriter.isaacCipher);
																		packetWriter.addNode(var26);
																	}

																	class137.friendSystem.processFriendUpdates();

																	for (var8 = 0; var8 < field407.size(); ++var8) {
																		var10 = (Integer)field407.get(var8);
																		class144 var27 = AttackOption.method2762(var10);
																		if (var27 == null) {
																			var9 = 2;
																		} else {
																			var9 = var27.method3716() ? 0 : 1;
																		}

																		if (var9 != 2) {
																			field407.remove(var8);
																			--var8;
																		}
																	}

																	++packetWriter.pendingWrites;
																	if (packetWriter.pendingWrites > 50) {
																		var26 = class291.getPacketBufferNode(ClientPacket.NO_TIMEOUT, packetWriter.isaacCipher);
																		packetWriter.addNode(var26);
																	}

																	try {
																		packetWriter.flush();
																	} catch (IOException var28) {
																		AsyncRestClient.method161();
																	}

																	class190.method4289().method5942();
																	return;
																}

																if (var41.field3129.type == 12) {
																	var33 = true;
																}

																IntProjection.method4992(var41);
															}
														}

														var40 = var39.widget;
														if (var40.childIndex * -64977777 < 0) {
															break;
														}

														var22 = class167.widgetDefinition.method7456(var40.parentId);
													} while(var22 == null || var22.children == null || var40.childIndex * -64977777 >= var22.children.length || var40 != var22.children[var40.childIndex * -64977777]);

													SequenceDefinition.runScriptEvent(var39);
												}
											}

											var40 = var39.widget;
											if (var40.childIndex * -64977777 < 0) {
												break;
											}

											var22 = class167.widgetDefinition.method7456(var40.parentId);
										} while(var22 == null || var22.children == null || var40.childIndex * -64977777 >= var22.children.length || var40 != var22.children[var40.childIndex * -64977777]);

										SequenceDefinition.runScriptEvent(var39);
									}
								}

								var40 = var39.widget;
								if (var40.childIndex * -64977777 < 0) {
									break;
								}

								var22 = class167.widgetDefinition.method7456(var40.parentId);
							} while(var22 == null || var22.children == null || var40.childIndex * -64977777 >= var22.children.length || var40 != var22.children[var40.childIndex * -64977777]);

							SequenceDefinition.runScriptEvent(var39);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("qs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1357189250"
	)
	void method882() {
		if (MouseHandler.MouseHandler_lastButton == 1 || !WidgetDefinition.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
			long var1 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis;
			if (var1 > 32767L) {
				var1 = 32767L;
			}

			mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis;
			int var3 = MouseHandler.MouseHandler_lastPressedY;
			if (var3 < 0) {
				var3 = 0;
			} else if (var3 > GameEngine.canvasHeight) {
				var3 = GameEngine.canvasHeight;
			}

			int var4 = MouseHandler.MouseHandler_lastPressedX;
			if (var4 < 0) {
				var4 = 0;
			} else if (var4 > RestClientThreadFactory.canvasWidth) {
				var4 = RestClientThreadFactory.canvasWidth;
			}

			int var5 = (int)var1;
			PacketBufferNode var6;
			if (class581.field5790 >= 232) {
				var6 = class291.getPacketBufferNode(ClientPacket.field3517, packetWriter.isaacCipher);
				var6.packetBuffer.writeShortLE(var4);
				var6.packetBuffer.writeShortAdd((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1));
				var6.packetBuffer.writeByte(0);
				var6.packetBuffer.writeShortAdd(var3);
				packetWriter.addNode(var6);
			} else {
				var6 = class291.getPacketBufferNode(ClientPacket.EVENT_MOUSE_CLICK, packetWriter.isaacCipher);
				var6.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1));
				var6.packetBuffer.writeShort(var4);
				var6.packetBuffer.writeShort(var3);
				packetWriter.addNode(var6);
			}
		}

	}

	@ObfuscatedName("qe")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1281544725"
	)
	public void vmethod7316(int var1, int var2) {
		if (packetWriter != null && packetWriter.isaacCipher != null) {
			if (var1 > -1 && FriendSystem.clientPreferences.getMusicVolume() > 0 && !playingJingle) {
				PacketBufferNode var3 = class291.getPacketBufferNode(ClientPacket.MUSIC_PLAYING, packetWriter.isaacCipher);
				var3.packetBuffer.writeInt(var1);
				packetWriter.addNode(var3);
			}

		}
	}

	@ObfuscatedName("qw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "48"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = RestClientThreadFactory.canvasWidth;
		int var2 = GameEngine.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}

		if (FriendSystem.clientPreferences != null) {
			try {
				class26.method412(Language.client, "resize", new Object[]{class31.getWindowedMode()});
			} catch (Throwable var4) {
			}
		}

	}

	@ObfuscatedName("qf")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "15"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) {
			class107.method3306(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (validRootWidgets[var1]) {
				field545[var1] = true;
			}

			field546[var1] = validRootWidgets[var1];
			validRootWidgets[var1] = false;
		}

		field543 = cycle;
		viewportX = -1;
		viewportY = -1;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			Clock.drawWidgets(rootInterface, 0, 0, RestClientThreadFactory.canvasWidth, GameEngine.canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				class360.crossSprites[mouseCrossState * 400 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				class360.crossSprites[mouseCrossState * 400 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}

		if (!isMenuOpen) {
			if (viewportX != -1) {
				class386.method8195(viewportX, viewportY);
			}
		} else {
			menu.method11902();
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field546[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field545[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		this.method845();
	}

	@ObfuscatedName("qr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1429535062"
	)
	void method845() {
		class448 var1 = worldViewManager.method2363();
		class154.method3823(worldViewManager.method2318(), (int)var1.field5060, (int)var1.field5059, (int)var1.field5054, graphicsCycle);
		var1.method9038();
		graphicsCycle = 0;
	}

	@ObfuscatedName("qh")
	@ObfuscatedSignature(
		descriptor = "(Ldw;B)Z",
		garbageValue = "-108"
	)
	boolean method1168(PacketWriter var1) {
		if (var1.serverPacketLength == 0) {
			MusicPatch.friendsChat = null;
		} else {
			if (MusicPatch.friendsChat == null) {
				MusicPatch.friendsChat = new FriendsChat(class198.loginType, Language.client);
			}

			MusicPatch.friendsChat.method9898(var1.packetBuffer);
		}

		AsyncRestClient.method175();
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("qo")
	@ObfuscatedSignature(
		descriptor = "(Ldw;I)Z",
		garbageValue = "-2136144027"
	)
	boolean method914(PacketWriter var1) {
		if (MusicPatch.friendsChat != null) {
			MusicPatch.friendsChat.method9919(var1.packetBuffer);
		}

		AsyncRestClient.method175();
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("qi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2040467540"
	)
	void method848() {
		int var1 = 0;
		boolean var2 = packetWriter.field1275 > 0;

		for (int var3 = packetWriter.field1268; var1 < 100 || var2; var2 = packetWriter.field1275 > 0) {
			boolean var4 = this.method1434(packetWriter);
			if (var2) {
				int var5 = packetWriter.field1268 - var3;
				PacketWriter var10000 = packetWriter;
				var10000.field1275 -= var5;
			}

			if (!var4) {
				break;
			}

			++var1;
			var3 = packetWriter.field1268;
		}

	}

	@ObfuscatedName("qk")
	@ObfuscatedSignature(
		descriptor = "(Ldw;B)Z",
		garbageValue = "71"
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
				if (var1.field1275 > 0 && !var2.isAvailable(var1.field1275)) {
					return false;
				}

				int var5;
				if (var1.serverPacket == null) {
					if (var1.field1273) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var1.field1268 += var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1274 = 0;
						var1.field1273 = false;
					}

					var3.offset = 0;
					if (var3.method11182()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var1.field1268 += var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1274 = 0;
					}

					var1.field1273 = true;
					ServerPacket[] var4 = MusicPatchNode.ServerPacket_values();
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

					var1.field1268 += var2.read(var3.array, 0, 1);
					var1.serverPacketLength = var3.array[0] & 255;
				}

				if (var1.serverPacketLength == -2) {
					if (!var2.isAvailable(2)) {
						return false;
					}

					var1.field1268 += var2.read(var3.array, 0, 2);
					var3.offset = 0;
					var1.serverPacketLength = var3.readUnsignedShort();
				}

				if (!var2.isAvailable(var1.serverPacketLength)) {
					return false;
				}

				var3.offset = 0;
				var1.field1268 += var2.read(var3.array, 0, var1.serverPacketLength);
				var1.field1274 = 0;
				timer.method8243();
				var1.field1266 = var1.field1276;
				var1.field1276 = var1.field1279;
				var1.field1279 = var1.serverPacket;
				int var22;
				if (ServerPacket.IF_CLOSESUB == var1.serverPacket) {
					var22 = var3.readInt();
					InterfaceParent var87 = (InterfaceParent)interfaceParents.get((long)var22);
					if (var87 != null) {
						WorldMapCacheName.closeInterface(var87, true);
					}

					if (meslayerContinueWidget != null) {
						ApproximateRouteStrategy.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				int var59;
				if (ServerPacket.CAM_LOOKAT == var1.serverPacket) {
					isCameraLocked = true;
					field428 = false;
					field347 = true;
					var22 = class321.method7009(var3.readShort() & 2027);
					var5 = GrandExchangeOfferTotalQuantityComparator.method8487(var3.readShort() & 2027);
					var6 = var3.readUnsignedShort();
					var59 = var3.readUnsignedByte();
					field570 = new class546(class187.cameraPitch, var5, var6, var59);
					field569 = new class546(class28.cameraYaw, var22, var6, var59);
					var1.serverPacket = null;
					return true;
				}

				byte var103;
				if (ServerPacket.CLAN_SETTINGS_FULL == var1.serverPacket) {
					Messages.method2904();
					var103 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var103 >= 0) {
							currentClanSettings[var103] = null;
						} else {
							VarcInt.guestClanSettings = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var103 >= 0) {
						currentClanSettings[var103] = new ClanSettings(var3);
					} else {
						VarcInt.guestClanSettings = new ClanSettings(var3);
					}

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

					field565 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OBJ_DEL == var1.serverPacket) {
					class381.method8166(class326.field3562);
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

				Widget var71;
				if (ServerPacket.IF_SETMODEL == var1.serverPacket) {
					var22 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedIntLE();
					var71 = class167.widgetDefinition.method7456(var5);
					if (var71.modelType != 1 || var22 != var71.modelId) {
						var71.modelType = 1;
						var71.modelId = var22;
						ApproximateRouteStrategy.invalidateWidget(var71);
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var75;
				if (ServerPacket.IF_SETPLAYERHEAD == var1.serverPacket) {
					var22 = var3.readInt();
					var75 = class167.widgetDefinition.method7456(var22);
					var75.modelType = 3;
					var75.modelId = class27.localPlayer.appearance.getChatHeadId();
					ApproximateRouteStrategy.invalidateWidget(var75);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OBJ_RESET_CUSTOMIZATION == var1.serverPacket) {
					class381.method8166(class326.field3553);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_INFO_LARGE_VIEWPORT == var1.serverPacket) {
					IndexCheck.updateNpcs(class81.worldView, false, var3);
					var1.serverPacket = null;
					return true;
				}

				int var8;
				int var9;
				int var10;
				int var11;
				int var14;
				int var15;
				if (ServerPacket.CAM_LOOKAT_EASED_COORD == var1.serverPacket) {
					isCameraLocked = true;
					field428 = false;
					field347 = true;
					Sound.field1791 = var3.readUnsignedByte();
					ClanChannel.field1892 = var3.readUnsignedByte();
					WorldMapElement.field1981 = var3.readUnsignedShort();
					var22 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = Coord.method7396(Sound.field1791);
					var59 = Coord.method7396(ClanChannel.field1892);
					var8 = class477.getTileHeight(class7.topLevelWorldView, var6, var59, class7.topLevelWorldView.plane) - WorldMapElement.field1981;
					var9 = var6 - Language.cameraX;
					var10 = var8 - WorldMapCacheName.cameraY;
					var11 = var59 - class66.cameraZ;
					double var62 = Math.sqrt((double)(var11 * var11 + var9 * var9));
					var14 = GrandExchangeOfferTotalQuantityComparator.method8487((int)(Math.atan2((double)var10, var62) * 325.9490051269531D) & 2047);
					var15 = class321.method7009((int)(Math.atan2((double)var9, (double)var11) * -325.9490051269531D) & 2047);
					field570 = new class546(class187.cameraPitch, var14, var22, var5);
					field569 = new class546(class28.cameraYaw, var15, var22, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MINIMAP_TOGGLE == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				boolean var109;
				if (ServerPacket.UPDATE_TRADING_POST == var1.serverPacket) {
					var109 = var3.readUnsignedByte() == 1;
					if (var109) {
						ChatChannel.field804 = UserComparator7.method3496() - var3.readLong();
						SceneTilePaint.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						SceneTilePaint.grandExchangeEvents = null;
					}

					field404 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CHAT_FILTER_SETTINGS == var1.serverPacket) {
					publicChatMode = var3.readUnsignedByteAdd();
					tradeChatMode = var3.readUnsignedByteNeg();
					var1.serverPacket = null;
					return true;
				}

				int var26;
				WorldView var73;
				if (ServerPacket.field3677 == var1.serverPacket) {
					var22 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedShortAddLE();
					var6 = var3.readUnsignedByteAdd();
					var59 = Coord.method7426(var22);
					var8 = Coord.method7392(var22);
					var9 = Coord.method7451(var22);
					var73 = worldViewManager.method2316(var8, var9);
					var11 = var8 - var73.baseX;
					var26 = var9 - var73.baseY;
					if (var11 >= 0 && var26 >= 0 && var11 < var73.sizeX && var26 < var73.sizeY) {
						RestClientThreadFactory.method208(var73, var59, var11, var26, var5, var6);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_RESET == var1.serverPacket) {
					field428 = false;
					isCameraLocked = false;
					field380 = false;
					field347 = false;
					Sound.field1791 = 0;
					ClanChannel.field1892 = 0;
					WorldMapElement.field1981 = 0;
					field567 = false;
					EnumComposition.field2034 = 0;
					class141.field1694 = 0;
					UserComparator8.field1544 = 0;
					WorldMapData_0.field3211 = 0;
					WorldViewManager.field1000 = 0;
					WorldMapSectionType.field3343 = 0;
					class329.field3728 = 0;
					field568 = null;
					field570 = null;
					field569 = null;

					for (var22 = 0; var22 < 5; ++var22) {
						field571[var22] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_NORMAL == var1.serverPacket) {
					class161.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SERVER_TICK_END == var1.serverPacket) {
					++serverCycle;
					var1.serverPacket = null;
					return true;
				}

				int var13;
				int var16;
				int var17;
				WorldView var82;
				short var104;
				if (ServerPacket.field3711 == var1.serverPacket) {
					var104 = (short)var3.readSignedShort();
					var5 = var3.readShort();
					var6 = var3.readInt();
					var59 = var3.readUnsignedIntLE();
					short var66 = (short)var3.method9343();
					var9 = var3.readUnsignedShort();
					var10 = var3.readUnsignedShortAdd();
					var11 = var3.readShortLE();
					var26 = Coord.method7426(var6);
					var13 = Coord.method7392(var6);
					var14 = Coord.method7451(var6);
					var82 = worldViewManager.method2316(var13, var14);
					var16 = var13 - var82.baseX;
					var17 = var14 - var82.baseY;
					if (var16 >= 0 && var17 >= 0 && var16 < var82.sizeX && var17 < var82.sizeY) {
						class27.method418(var82, var26, var16, var17, var9, var59, var104, var11, var66, var5, var10);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_MOVE_TO == var1.serverPacket) {
					isCameraLocked = true;
					field428 = false;
					field380 = false;
					WorldViewManager.field1000 = var3.readUnsignedByte();
					WorldMapSectionType.field3343 = var3.readUnsignedByte();
					class329.field3728 = var3.readUnsignedShort();
					WorldMapData_0.field3211 = var3.readUnsignedByte();
					UserComparator8.field1544 = var3.readUnsignedByte();
					if (UserComparator8.field1544 >= 100) {
						Language.cameraX = Coord.method7396(WorldViewManager.field1000);
						class66.cameraZ = Coord.method7396(WorldMapSectionType.field3343);
						WorldMapCacheName.cameraY = class477.getTileHeight(class7.topLevelWorldView, Language.cameraX, class66.cameraZ, class7.topLevelWorldView.plane) - class329.field3728;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETANIM == var1.serverPacket) {
					var22 = var3.readShort();
					var5 = var3.readUnsignedIntLE();
					var71 = class167.widgetDefinition.method7456(var5);
					if (var22 != var71.sequenceId || var22 == -1) {
						var71.sequenceId = var22;
						var71.modelFrame = 0;
						var71.modelFrameCycle = 0;
						ApproximateRouteStrategy.invalidateWidget(var71);
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
						var71 = class167.widgetDefinition.method7456(var22);
					} else {
						var71 = null;
					}

					for (; var3.offset < var1.serverPacketLength; PendingSpawn.itemContainerSetItem(var5, var59, var8 - 1, var9)) {
						var59 = var3.readUShortSmart();
						var8 = var3.readUnsignedShort();
						var9 = 0;
						if (var8 != 0) {
							var9 = var3.readUnsignedByte();
							if (var9 == 255) {
								var9 = var3.readInt();
							}
						}

						if (var71 != null && var59 >= 0 && var59 < var71.itemIds.length) {
							var71.itemIds[var59] = var8;
							var71.itemQuantities[var59] = var9;
						}
					}

					if (var71 != null) {
						ApproximateRouteStrategy.invalidateWidget(var71);
					}

					class274.method6203();
					changedItemContainers[++changedItemsCount - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_REGION == var1.serverPacket) {
					class161.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SONG_STOP == var1.serverPacket) {
					var5 = var3.readUnsignedShortAddLE();
					var22 = var3.readUnsignedShortLE();
					class267.method6028(var22, var5);
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
							hintArrowSubX = 64;
							hintArrowSubY = 64;
						}

						if (hintArrowType == 3) {
							hintArrowSubX = 0;
							hintArrowSubY = 64;
						}

						if (hintArrowType == 4) {
							hintArrowSubX = 128;
							hintArrowSubY = 64;
						}

						if (hintArrowType == 5) {
							hintArrowSubX = 64;
							hintArrowSubY = 0;
						}

						if (hintArrowType == 6) {
							hintArrowSubX = 64;
							hintArrowSubY = 128;
						}

						hintArrowType = 2;
						hintArrowX = var3.readUnsignedShort();
						hintArrowY = var3.readUnsignedShort();
						hintArrowHeight = var3.readUnsignedByte() * 2;
					}

					if (hintArrowType == 10) {
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null;
					return true;
				}

				String var24;
				if (ServerPacket.SET_PLAYER_OP == var1.serverPacket) {
					var22 = var3.readUnsignedByteAdd();
					var5 = var3.readUnsignedByteSub();
					var24 = var3.readStringCp1252NullTerminated();
					if (var5 >= 1 && var5 <= 8) {
						if (var24.equalsIgnoreCase("null")) {
							var24 = null;
						}

						playerMenuActions[var5 - 1] = var24;
						playerOptionsPriorities[var5 - 1] = var22 == 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3703 == var1.serverPacket) {
					var1.field1275 = var3.readShort();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_PLAYERMODEL_OBJ == var1.serverPacket) {
					var22 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedIntLE();
					var71 = class167.widgetDefinition.method7456(var5);
					var71.field4178.method7576(var22);
					ApproximateRouteStrategy.invalidateWidget(var71);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SONG_WITH_SECONDARY == var1.serverPacket) {
					var59 = var3.readUnsignedShortLE();
					var6 = var3.readUnsignedShort();
					var22 = var3.readUnsignedShort();
					if (var22 == 65535) {
						var22 = -1;
					}

					var8 = var3.readUnsignedShort();
					var9 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedShortLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					ArrayList var85 = new ArrayList();
					var85.add(var22);
					var85.add(var5);
					WorldMapLabelSize.playSong(var85, var6, var59, var8, var9);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3584 == var1.serverPacket) {
					Player.field923 = var3.readBoolean();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED == var1.serverPacket) {
					WorldMapArea.field3255 = var3.readUnsignedByte();
					class67.field906 = var3.readUnsignedByteNeg();
					overheadTextLimit = var3.readUnsignedByteSub();

					while (var3.offset < var1.serverPacketLength) {
						var22 = var3.readUnsignedByte();
						class326 var83 = SwapSongTask.method9633()[var22];
						class381.method8166(var83);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_INFO == var1.serverPacket) {
					playerUpdateManager.method2796(var3, var1.serverPacketLength);
					class375.method8129();
					var1.serverPacket = null;
					return true;
				}

				NPC var91;
				if (ServerPacket.NPC_SPOTANIM == var1.serverPacket) {
					var59 = var3.readUnsignedByteSub();
					var6 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedIntLE();
					var22 = var3.readUnsignedShortAdd();
					var91 = (NPC)class81.worldView.npcs.get((long)var22);
					if (var91 != null) {
						var91.updateSpotAnimation(var59, var6, var5 >> 16, var5 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SONG == var1.serverPacket) {
					var59 = var3.readUnsignedShortAdd();
					var22 = var3.readUnsignedShort();
					var6 = var3.readUnsignedShort();
					var8 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShortAdd();
					if (var22 == 65535) {
						var22 = -1;
					}

					ArrayList var98 = new ArrayList();
					var98.add(var22);
					WorldMapLabelSize.playSong(var98, var5, var6, var59, var8);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_FULL_FOLLOWS == var1.serverPacket) {
					overheadTextLimit = var3.readUnsignedByteAdd();
					WorldMapArea.field3255 = var3.readUnsignedByteSub();
					class67.field906 = var3.readUnsignedByte();

					for (var22 = class67.field906; var22 < class67.field906 + 8; ++var22) {
						for (var5 = WorldMapArea.field3255; var5 < WorldMapArea.field3255 + 8; ++var5) {
							if (class81.worldView.groundItems[overheadTextLimit][var22][var5] != null) {
								class81.worldView.groundItems[overheadTextLimit][var22][var5] = null;
								class167.updateItemPile(overheadTextLimit, var22, var5);
							}
						}
					}

					for (PendingSpawn var57 = (PendingSpawn)class81.worldView.pendingSpawns.last(); var57 != null; var57 = (PendingSpawn)class81.worldView.pendingSpawns.previous()) {
						if (var57.x >= class67.field906 && var57.x < class67.field906 + 8 && var57.y >= WorldMapArea.field3255 && var57.y < WorldMapArea.field3255 + 8 && var57.plane == overheadTextLimit) {
							var57.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var94;
				if (ServerPacket.IF_SETANGLE == var1.serverPacket) {
					var22 = var3.readInt();
					var5 = var3.readUnsignedShortAddLE();
					var6 = var3.readUnsignedShort();
					var59 = var3.readUnsignedShort();
					var94 = class167.widgetDefinition.method7456(var22);
					if (var59 != var94.modelAngleX || var5 != var94.modelAngleY || var6 != var94.modelZoom) {
						var94.modelAngleX = var59;
						var94.modelAngleY = var5;
						var94.modelZoom = var6;
						ApproximateRouteStrategy.invalidateWidget(var94);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_SHAKE == var1.serverPacket) {
					var22 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedByte();
					var59 = var3.readUnsignedByte();
					field571[var22] = true;
					field572[var22] = var5;
					field573[var22] = var6;
					field395[var22] = var59;
					field575[var22] = 0;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OBJ_COUNT == var1.serverPacket) {
					class381.method8166(class326.field3556);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.HEAT_MAP == var1.serverPacket) {
					var109 = var3.readBoolean();
					if (var109) {
						if (class1.field2 == null) {
							class1.field2 = new class419();
						}
					} else {
						class1.field2 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_SMOOTH_RESET == var1.serverPacket && isCameraLocked) {
					field428 = true;
					field347 = false;
					field380 = false;

					for (var22 = 0; var22 < 5; ++var22) {
						field571[var22] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3696 == var1.serverPacket) {
					WorldMapIcon_1.field3231 = var3.readBoolean();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOC_DEL == var1.serverPacket) {
					class381.method8166(class326.field3560);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_STOP_TRANSIT == var1.serverPacket) {
					var22 = var3.readUnsignedShort();
					HttpRequest.method101(var22);
					changedItemContainers[++changedItemsCount - 1 & 31] = var22 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_STAT == var1.serverPacket) {
					class274.method6203();
					var22 = var3.readUnsignedByteAdd();
					var5 = var3.readUnsignedIntLE();
					var6 = var3.readUnsignedByte();
					var59 = var3.readUnsignedByteNeg();
					experience[var59] = var5;
					currentLevels[var59] = var22;
					levels[var59] = 1;
					field334[var59] = var6;

					for (var8 = 0; var8 < 98; ++var8) {
						if (var5 >= Skills.Skills_experienceTable[var8]) {
							levels[var59] = var8 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var59;
					var1.serverPacket = null;
					return true;
				}

				long var30;
				long var32;
				String var36;
				String var51;
				boolean var86;
				if (ServerPacket.MESSAGE_PRIVATE == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					var30 = (long)var3.readUnsignedShort();
					var32 = (long)var3.readMedium();
					PlayerType var96 = (PlayerType)HealthBarConfig.findEnumerated(WorldMapAreaData.PlayerType_values(), var3.readUnsignedByte());
					long var34 = var32 + (var30 << 32);
					var86 = false;

					for (var13 = 0; var13 < 100; ++var13) {
						if (var34 == crossWorldMessageIds[var13]) {
							var86 = true;
							break;
						}
					}

					if (class137.friendSystem.isIgnored(new Username(var51, class198.loginType))) {
						var86 = true;
					}

					if (!var86 && field432 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var34;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var36 = AbstractFont.escapeBrackets(class379.method8155(WorldMapIcon_0.method6722(var3)));
						byte var67;
						if (var96.isPrivileged) {
							var67 = 7;
						} else {
							var67 = 3;
						}

						if (var96.modIcon != -1) {
							AuthenticationScheme.addGameMessage(var67, class82.method2754(var96.modIcon) + var51, var36);
						} else {
							AuthenticationScheme.addGameMessage(var67, var51, var36);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3692 == var1.serverPacket) {
					class36.field225 = var3.readUnsignedByte();
					class364.field4029 = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_TARGET == var1.serverPacket) {
					BuddyRankComparator.field1571 = (class381)HealthBarConfig.findEnumerated(class359.method7492(), var3.readUnsignedByte());
					field327 = var3.readShort();
					field328 = var3.readUnsignedShort();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_INFO_SMALL_VIEWPORT == var1.serverPacket) {
					IndexCheck.updateNpcs(class81.worldView, true, var3);
					var1.serverPacket = null;
					return true;
				}

				boolean var63;
				if (ServerPacket.CAM_MOVETO_EASED_CIRCULAR == var1.serverPacket) {
					isCameraLocked = true;
					field428 = false;
					field380 = true;
					WorldViewManager.field1000 = var3.readUnsignedByte();
					WorldMapSectionType.field3343 = var3.readUnsignedByte();
					var22 = var3.readUnsignedShort();
					var5 = Coord.method7396(var3.readUnsignedByte());
					var6 = Coord.method7396(var3.readUnsignedByte());
					var59 = var3.readUnsignedShort();
					field567 = var3.readBoolean();
					var8 = var3.readUnsignedByte();
					var9 = Coord.method7396(WorldViewManager.field1000);
					var10 = Coord.method7396(WorldMapSectionType.field3343);
					var63 = false;
					var86 = false;
					if (field567) {
						var11 = WorldMapCacheName.cameraY;
						var26 = class477.getTileHeight(class7.topLevelWorldView, var9, var10, class7.topLevelWorldView.plane) - var22;
					} else {
						var11 = class477.getTileHeight(class7.topLevelWorldView, Language.cameraX, class66.cameraZ, class7.topLevelWorldView.plane) - WorldMapCacheName.cameraY;
						var26 = var22;
					}

					field568 = new class544(Language.cameraX, class66.cameraZ, var11, var9, var10, var26, var5, var6, var59, var8);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_SET_SEQUENCE == var1.serverPacket) {
					var5 = var3.readUnsignedShortLE();
					var22 = var3.readUnsignedShort();
					var6 = var3.readUnsignedByteAdd();
					if (var5 == 65535) {
						var5 = -1;
					}

					NPC var108 = (NPC)class81.worldView.npcs.get((long)var22);
					if (var108 != null) {
						SequenceDefinition var102 = var108.animationSequence.getSequenceDefinition();
						if (var5 == var108.method2384() && var5 != -1) {
							var9 = var102.restartMode;
							if (var9 == 1) {
								var108.animationSequence.method9576();
								var108.field1059 = var6;
							} else if (var9 == 2) {
								var108.animationSequence.method9577();
							}
						} else if (var5 == -1 || var102 == null || AsyncHttpResponse.SequenceDefinition_get(var5).field2410 >= var102.field2410) {
							var108.animationSequence.setSequence(var5);
							var108.animationSequence.method9576();
							var108.field1059 = var6;
							var108.field1086 = var108.pathLength;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CLAN_CHANNEL_DELTA == var1.serverPacket) {
					field537 = cycleCntr;
					var103 = var3.readByte();
					class166 var81 = new class166(var3);
					ClanChannel var101;
					if (var103 >= 0) {
						var101 = currentClanChannels[var103];
					} else {
						var101 = class531.guestClanChannel;
					}

					if (var101 == null) {
						this.method1317(var103);
						var1.serverPacket = null;
						return true;
					}

					if (var81.field1867 > var101.field1885) {
						this.method1317(var103);
						var1.serverPacket = null;
						return true;
					}

					if (var81.field1867 < var101.field1885) {
						var1.serverPacket = null;
						return true;
					}

					var81.method4011(var101);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OBJ_ADD == var1.serverPacket) {
					class381.method8166(class326.field3559);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOGOUT_FULL == var1.serverPacket) {
					MilliClock.logOut();
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.LOGOUT == var1.serverPacket) {
					var22 = var3.readUnsignedByte();
					IntProjection.forceDisconnect(var22);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field3706 == var1.serverPacket) {
					var22 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedIntME();
					var6 = var3.readInt();
					var59 = var3.readUnsignedShortLE();
					var8 = Coord.method7426(var5);
					var9 = Coord.method7392(var5);
					var10 = Coord.method7451(var5);
					WorldView var107 = worldViewManager.method2316(var9, var10);
					var26 = var9 - var107.baseX;
					var13 = var10 - var107.baseY;
					if (var26 >= 0 && var13 >= 0 && var26 < var107.sizeX && var13 < var107.sizeY) {
						GrandExchangeOfferOwnWorldComparator.method804(var107, var8, var26, var13, var59, var22, var6);
					}

					var1.serverPacket = null;
					return true;
				}

				String var27;
				if (ServerPacket.MESSAGE_FRIENDS_CHAT == var1.serverPacket) {
					var103 = var3.readByte();
					var23 = var3.readStringCp1252NullTerminated();
					long var39 = (long)var3.readUnsignedShort();
					long var41 = (long)var3.readMedium();
					PlayerType var84 = (PlayerType)HealthBarConfig.findEnumerated(WorldMapAreaData.PlayerType_values(), var3.readUnsignedByte());
					long var43 = var41 + (var39 << 32);
					boolean var64 = false;
					ClanChannel var45 = null;
					var45 = var103 >= 0 ? currentClanChannels[var103] : class531.guestClanChannel;
					if (var45 == null) {
						var64 = true;
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var84.isUser && class137.friendSystem.isIgnored(new Username(var23, class198.loginType))) {
									var64 = true;
								}
								break;
							}

							if (var43 == crossWorldMessageIds[var15]) {
								var64 = true;
								break;
							}

							++var15;
						}
					}

					if (!var64) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var43;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var27 = AbstractFont.escapeBrackets(WorldMapIcon_0.method6722(var3));
						var16 = var103 >= 0 ? 41 : 44;
						if (var84.modIcon != -1) {
							class329.addChatMessage(var16, class82.method2754(var84.modIcon) + var23, var27, var45.name);
						} else {
							class329.addChatMessage(var16, var23, var27, var45.name);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.EVENT_WORLDHOP == var1.serverPacket) {
					World var56 = new World();
					var56.host = var3.readStringCp1252NullTerminated();
					var56.id = var3.readUnsignedShort();
					var5 = var3.readInt();
					var56.properties = var5;
					if (var56.isDeadman()) {
						var56.field617 = "beta";
						ObjectComposition.field2301 = true;
					} else {
						ObjectComposition.field2301 = false;
					}

					AuthenticationScheme.updateGameState(45);
					var2.close();
					var2 = null;
					class155.changeWorld(var56);
					var1.serverPacket = null;
					return false;
				}

				Widget var106;
				if (ServerPacket.IF_SETPOSITION == var1.serverPacket) {
					var22 = var3.readShort();
					var5 = var3.readInt();
					var6 = var3.readSignedShort();
					var106 = class167.widgetDefinition.method7456(var5);
					if (var6 != var106.rawX || var22 != var106.rawY || var106.xAlignment != 0 || var106.yAlignment != 0) {
						var106.rawX = var6;
						var106.rawY = var22;
						var106.xAlignment = 0;
						var106.yAlignment = 0;
						ApproximateRouteStrategy.invalidateWidget(var106);
						this.alignWidget(var106);
						if (var106.type == 0) {
							Tiles.revalidateWidgetScroll(class167.widgetDefinition.Widget_interfaceComponents[var5 >> 16], var106, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				boolean var55;
				if (ServerPacket.IF_SET_PLAYERMODEL_SELF == var1.serverPacket) {
					var22 = var3.readUnsignedIntIME();
					var55 = var3.readUnsignedByteSub() == 1;
					var71 = class167.widgetDefinition.method7456(var22);
					var71.method7934(class27.localPlayer.appearance, var55);
					ApproximateRouteStrategy.invalidateWidget(var71);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_PRIVCHATMODE == var1.serverPacket) {
					ClanChannelMember.privateChatMode = GraphicsDefaults.method10477(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VAR_CLAN_ENABLE == var1.serverPacket) {
					Projection.field2791 = new class521(class270.field3123);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SYNC_CLIENT_VARCACHE == var1.serverPacket) {
					for (var22 = 0; var22 < Varps.Varps_main.length; ++var22) {
						if (Varps.Varps_temp[var22] != Varps.Varps_main[var22]) {
							Varps.Varps_main[var22] = Varps.Varps_temp[var22];
							SpotAnimationDefinition.changeGameOptions(var22);
							changedVarps[++changedVarpCount - 1 & 31] = var22;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_SPOTANIM == var1.serverPacket) {
					var22 = var3.readUnsignedShortAddLE();
					Player var99;
					if (var22 == localPlayerIndex) {
						var99 = class27.localPlayer;
					} else {
						var99 = (Player)class81.worldView.players.get((long)var22);
					}

					var5 = var3.readUnsignedShort();
					var6 = var3.readUnsignedIntLE();
					var59 = var3.readUnsignedByteSub();
					if (var99 != null) {
						var99.updateSpotAnimation(var59, var5, var6 >> 16, var6 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				InterfaceParent var105;
				if (ServerPacket.IF_RESYNC == var1.serverPacket) {
					var22 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.method874(false);
						Tiles.method2077(rootInterface);
						WorldMapRegion.runWidgetOnLoadListener(rootInterface);

						for (var59 = 0; var59 < 100; ++var59) {
							validRootWidgets[var59] = true;
						}
					}

					InterfaceParent var77;
					for (; var6-- > 0; var77.field867 = true) {
						var59 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var9 = var3.readUnsignedByte();
						var77 = (InterfaceParent)interfaceParents.get((long)var59);
						if (var77 != null && var8 != var77.group) {
							WorldMapCacheName.closeInterface(var77, true);
							var77 = null;
						}

						if (var77 == null) {
							var77 = GrandExchangeOfferOwnWorldComparator.openInterface(var59, var8, var9);
						}
					}

					for (var105 = (InterfaceParent)interfaceParents.first(); var105 != null; var105 = (InterfaceParent)interfaceParents.next()) {
						if (var105.field867) {
							var105.field867 = false;
						} else {
							WorldMapCacheName.closeInterface(var105, true);
						}
					}

					widgetFlags = new NodeHashTable(512);

					while (var3.offset < var22) {
						var59 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var9 = var3.readUnsignedShort();
						var10 = var3.readInt();
						var11 = var3.readInt();
						WidgetConfigNode var111 = SoundCache.method3092((WidgetConfigNode)null, var8, var9, var10, var11);
						widgetFlags.put(var111, (long)var59);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_MOVESUB == var1.serverPacket) {
					var22 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedIntIME();
					InterfaceParent var100 = (InterfaceParent)interfaceParents.get((long)var22);
					var105 = (InterfaceParent)interfaceParents.get((long)var5);
					if (var105 != null) {
						WorldMapCacheName.closeInterface(var105, var100 == null || var105.group != var100.group);
					}

					if (var100 != null) {
						var100.remove();
						interfaceParents.put(var100, (long)var5);
					}

					var94 = class167.widgetDefinition.method7456(var22);
					if (var94 != null) {
						ApproximateRouteStrategy.invalidateWidget(var94);
					}

					var94 = class167.widgetDefinition.method7456(var5);
					if (var94 != null) {
						ApproximateRouteStrategy.invalidateWidget(var94);
						Tiles.revalidateWidgetScroll(class167.widgetDefinition.Widget_interfaceComponents[var94.id >>> 16], var94, true);
					}

					if (rootInterface != -1) {
						HttpResponse.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OCULUS_SYNC == var1.serverPacket) {
					var22 = var3.readInt();
					if (var22 != field429) {
						field429 = var22;
						class198.method4386();
					}

					var1.serverPacket = null;
					return true;
				}

				boolean var7;
				if (ServerPacket.field3635 == var1.serverPacket) {
					var22 = var3.readUnsignedByteSub();
					var5 = var3.readUnsignedByteSub();
					var6 = var3.readUnsignedIntLE();
					var7 = var3.readUnsignedByte() == 1;
					var8 = var3.readUnsignedShortAddLE();
					var9 = var3.readUnsignedShort();
					var10 = var3.readUnsignedShort();
					var11 = var3.readUnsignedIntME();
					var26 = Coord.method7426(var11);
					var13 = Coord.method7392(var11);
					var14 = Coord.method7451(var11);
					var82 = worldViewManager.method2316(var13, var14);
					var16 = var13 - var82.baseX;
					var17 = var14 - var82.baseY;
					if (var16 >= 0 && var17 >= 0 && var16 < var82.sizeX && var17 < var82.sizeY) {
						method1485(var82, var26, var16, var17, var9, var6, var5, var8, var10, var22, var7);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETOBJECT == var1.serverPacket) {
					var22 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedIntME();
					var6 = var3.readUnsignedShortLE();
					if (var6 == 65535) {
						var6 = -1;
					}

					var106 = class167.widgetDefinition.method7456(var22);
					ItemComposition var92;
					if (!var106.isIf3) {
						if (var6 == -1) {
							var106.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var92 = ObjectComposition.ItemDefinition_get(var6).getCountObj(var5);
						var106.modelType = 4;
						var106.modelId = var6;
						var106.modelAngleX = var92.xan2d;
						var106.modelAngleY = var92.yan2d;
						var106.modelZoom = var92.zoom2d * 100 / var5;
						ApproximateRouteStrategy.invalidateWidget(var106);
					} else {
						var106.itemId = var6;
						var106.itemQuantity = var5;
						var92 = ObjectComposition.ItemDefinition_get(var6).getCountObj(var5);
						var106.modelAngleX = var92.xan2d;
						var106.modelAngleY = var92.yan2d;
						var106.modelAngleZ = var92.zan2d;
						var106.modelOffsetX = var92.offsetX2d;
						var106.modelOffsetY = var92.offsetY2d;
						var106.modelZoom = var92.zoom2d;
						if (var92.isStackable == 1) {
							var106.itemQuantityMode = 1;
						} else {
							var106.itemQuantityMode = 2;
						}

						if (var106.field4126 > 0) {
							var106.modelZoom = var106.modelZoom * 32 / var106.field4126;
						} else if (var106.rawWidth > 0) {
							var106.modelZoom = var106.modelZoom * 32 / var106.rawWidth;
						}

						ApproximateRouteStrategy.invalidateWidget(var106);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3674 == var1.serverPacket) {
					var22 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedShort();
					class303.queueSoundEffect(var22, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MAP_ANIM == var1.serverPacket) {
					class381.method8166(class326.field3555);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CLAN_CHANNEL_FULL == var1.serverPacket) {
					field537 = cycleCntr;
					var103 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var103 >= 0) {
							currentClanChannels[var103] = null;
						} else {
							class531.guestClanChannel = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var103 >= 0) {
						currentClanChannels[var103] = new ClanChannel(var3);
					} else {
						class531.guestClanChannel = new ClanChannel(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				long var47;
				if (ServerPacket.MESSAGE_FRIEND_PRIVATE == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					var30 = var3.readLong();
					var32 = (long)var3.readUnsignedShort();
					var47 = (long)var3.readMedium();
					PlayerType var38 = (PlayerType)HealthBarConfig.findEnumerated(WorldMapAreaData.PlayerType_values(), var3.readUnsignedByte());
					long var12 = var47 + (var32 << 32);
					boolean var65 = false;

					for (var15 = 0; var15 < 100; ++var15) {
						if (var12 == crossWorldMessageIds[var15]) {
							var65 = true;
							break;
						}
					}

					if (var38.isUser && class137.friendSystem.isIgnored(new Username(var51, class198.loginType))) {
						var65 = true;
					}

					if (!var65 && field432 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var12;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var27 = AbstractFont.escapeBrackets(class379.method8155(WorldMapIcon_0.method6722(var3)));
						if (var38.modIcon != -1) {
							class329.addChatMessage(9, class82.method2754(var38.modIcon) + var51, var27, MilliClock.base37DecodeLong(var30));
						} else {
							class329.addChatMessage(9, var51, var27, MilliClock.base37DecodeLong(var30));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1 == var1.serverPacket) {
					return this.method1168(var1);
				}

				if (ServerPacket.SET_ACTIVE_WORLD == var1.serverPacket) {
					var22 = var3.readShort();
					var5 = var3.readUnsignedByte();
					if (var22 == -1) {
						class7.topLevelWorldView.plane = var5;
						class81.worldView = class7.topLevelWorldView;
					} else {
						WorldEntity var97 = (WorldEntity)class7.topLevelWorldView.worldEntities.get((long)var22);
						if (var97 == null) {
							throw new RuntimeException("No valid ClientWorldEntity with ID " + var22);
						}

						var97.worldView.plane = var5;
						class81.worldView = var97.worldView;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PROJECTILE_SPAWN == var1.serverPacket) {
					var22 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedShortAdd();
					var6 = var3.method11278();
					var59 = var3.readUnsignedShort();
					var8 = var3.readUnsignedIntIME();
					var9 = Coord.method7426(var8);
					var10 = Coord.method7392(var8);
					var11 = Coord.method7451(var8);
					var26 = var3.readUnsignedByteAdd();
					var13 = var3.readUnsignedShortAddLE();
					var14 = var3.method11227();
					var15 = var3.readUnsignedShort();
					var16 = var3.readUnsignedShortLE();
					var17 = var3.readUnsignedIntIME();
					int var18 = Coord.method7426(var17);
					int var19 = Coord.method7392(var17);
					int var20 = Coord.method7451(var17);
					if (var5 != 65535) {
						Projectile var21 = new Projectile(var9, var10, var11, var16, var6, var18, var19, var20, var13, var14, var5, var22 + cycle, var59 + cycle, var26, var15);
						projectiles.addFirst(var21);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETNPCHEAD == var1.serverPacket) {
					var22 = var3.readInt();
					var5 = var3.readUnsignedShortLE();
					var71 = class167.widgetDefinition.method7456(var22);
					if (var71.modelType != 2 || var5 != var71.modelId) {
						var71.modelType = 2;
						var71.modelId = var5;
						ApproximateRouteStrategy.invalidateWidget(var71);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_HEADICON_SPECIFIC == var1.serverPacket) {
					var104 = (short)var3.readShortLE();
					var5 = var3.readUnsignedShortLE();
					var6 = var3.readUnsignedIntIME();
					var59 = var3.readUnsignedByteSub();
					var91 = (NPC)class81.worldView.npcs.get((long)var5);
					if (var91 != null) {
						var91.method2673(var59, var6, var104);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3704 == var1.serverPacket) {
					class30.updateWorldEntitiesFromPacketBuffer(class81.worldView, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_CLAN_CHANNEL_SYSTEM == var1.serverPacket) {
					var103 = var3.readByte();
					var30 = (long)var3.readUnsignedShort();
					var32 = (long)var3.readMedium();
					var47 = var32 + (var30 << 32);
					var63 = false;
					ClanChannel var110 = var103 >= 0 ? currentClanChannels[var103] : class531.guestClanChannel;
					if (var110 == null) {
						var63 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) {
							if (crossWorldMessageIds[var13] == var47) {
								var63 = true;
								break;
							}
						}
					}

					if (!var63) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var47;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var36 = WorldMapIcon_0.method6722(var3);
						var14 = var103 >= 0 ? 43 : 46;
						class329.addChatMessage(var14, "", var36, var110.name);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_PLAYERMODEL_BODYTYPE == var1.serverPacket) {
					var22 = var3.readUnsignedByteNeg();
					var5 = var3.readUnsignedIntME();
					var71 = class167.widgetDefinition.method7456(var5);
					var71.field4178.method7511(class27.localPlayer.appearance.gender, var22);
					ApproximateRouteStrategy.invalidateWidget(var71);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CLAN_SETTINGS_DELTA == var1.serverPacket) {
					Messages.method2904();
					var103 = var3.readByte();
					class152 var80 = new class152(var3);
					ClanSettings var90;
					if (var103 >= 0) {
						var90 = currentClanSettings[var103];
					} else {
						var90 = VarcInt.guestClanSettings;
					}

					if (var90 == null) {
						this.method1303(var103);
						var1.serverPacket = null;
						return true;
					}

					if (var80.field1771 > var90.field1812) {
						this.method1303(var103);
						var1.serverPacket = null;
						return true;
					}

					if (var80.field1771 < var90.field1812) {
						var1.serverPacket = null;
						return true;
					}

					var80.method3809(var90);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RESET_ANIMS == var1.serverPacket) {
					Iterator var54 = class81.worldView.players.iterator();

					while (var54.hasNext()) {
						Player var78 = (Player)var54.next();
						var78.method2385();
					}

					Iterator var79 = class81.worldView.npcs.iterator();

					while (var79.hasNext()) {
						NPC var88 = (NPC)var79.next();
						var88.method2385();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_SETANGLE == var1.serverPacket) {
					isCameraLocked = true;
					field428 = false;
					field347 = false;
					Sound.field1791 = var3.readUnsignedByte();
					ClanChannel.field1892 = var3.readUnsignedByte();
					WorldMapElement.field1981 = var3.readUnsignedShort();
					EnumComposition.field2034 = var3.readUnsignedByte();
					class141.field1694 = var3.readUnsignedByte();
					if (class141.field1694 >= 100) {
						var22 = Coord.method7396(Sound.field1791);
						var5 = Coord.method7396(ClanChannel.field1892);
						var6 = class477.getTileHeight(class7.topLevelWorldView, var22, var5, class7.topLevelWorldView.plane) - WorldMapElement.field1981;
						var59 = var22 - Language.cameraX;
						var8 = var6 - WorldMapCacheName.cameraY;
						var9 = var5 - class66.cameraZ;
						var10 = (int)Math.sqrt((double)(var9 * var9 + var59 * var59));
						class187.cameraPitch = (int)(Math.atan2((double)var8, (double)var10) * 325.9490051269531D) & 2047;
						class28.cameraYaw = (int)(Math.atan2((double)var59, (double)var9) * -325.9490051269531D) & 2047;
						if (class187.cameraPitch < 128) {
							class187.cameraPitch = 128;
						}

						if (class187.cameraPitch > 383) {
							class187.cameraPitch = 383;
						}
					}

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
						var71 = class167.widgetDefinition.method7456(var22);
					} else {
						var71 = null;
					}

					if (var71 != null) {
						for (var59 = 0; var59 < var71.itemIds.length; ++var59) {
							var71.itemIds[var59] = 0;
							var71.itemQuantities[var59] = 0;
						}
					}

					HttpResponse.clearItemContainer(var5);
					var59 = var3.readUnsignedShort();

					for (var8 = 0; var8 < var59; ++var8) {
						var9 = var3.readUnsignedShortLE();
						var10 = var3.readUnsignedByteSub();
						if (var10 == 255) {
							var10 = var3.readUnsignedIntLE();
						}

						if (var71 != null && var8 < var71.itemIds.length) {
							var71.itemIds[var8] = var9;
							var71.itemQuantities[var8] = var10;
						}

						PendingSpawn.itemContainerSetItem(var5, var8, var9 - 1, var10);
					}

					if (var71 != null) {
						ApproximateRouteStrategy.invalidateWidget(var71);
					}

					class274.method6203();
					changedItemContainers[++changedItemsCount - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_UID192 == var1.serverPacket) {
					var3.offset += 28;
					if (var3.checkCrc()) {
						class374.method8127(var3, var3.offset - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER == var1.serverPacket) {
					return this.method914(var1);
				}

				if (ServerPacket.UPDATE_INV_CLEAR == var1.serverPacket) {
					var22 = var3.readUnsignedIntIME();
					var75 = class167.widgetDefinition.method7456(var22);

					for (var6 = 0; var6 < var75.itemIds.length; ++var6) {
						var75.itemIds[var6] = -1;
						var75.itemIds[var6] = 0;
					}

					ApproximateRouteStrategy.invalidateWidget(var75);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.GRAPHICSOBJECT_SPAWN == var1.serverPacket) {
					var6 = var3.readMedium();
					var22 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var59 = var22 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					var9 = var3.readUnsignedShortAddLE();
					var11 = var3.readUnsignedShort();
					var10 = var3.readUnsignedByte();
					if (var59 >= 0 && var8 >= 0 && var59 < class81.worldView.sizeX && var8 < class81.worldView.sizeY) {
						var59 = Coord.method7396(var59);
						var8 = Coord.method7396(var8);
						GraphicsObject var46 = new GraphicsObject(class81.worldView, var9, class81.worldView.plane, var59, var8, class477.getTileHeight(class81.worldView, var59, var8, class81.worldView.plane) - var10, var11, cycle);
						class81.worldView.graphicsObjects.addFirst(var46);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETHIDE == var1.serverPacket) {
					var22 = var3.readUnsignedIntIME();
					var55 = var3.readUnsignedByteAdd() == 1;
					var71 = class167.widgetDefinition.method7456(var22);
					if (var55 != var71.isHidden) {
						var71.isHidden = var55;
						ApproximateRouteStrategy.invalidateWidget(var71);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.URL_OPEN == var1.serverPacket) {
					byte[] var53 = new byte[var1.serverPacketLength];
					var3.method11174(var53, 0, var53.length);
					Buffer var72 = new Buffer(var53);
					var24 = var72.readStringCp1252NullTerminated();
					class441.openURL(var24, true, false);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.FRIENDS_LIST_LOADED == var1.serverPacket) {
					class137.friendSystem.method1570();
					field557 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_PLAYERMODEL_BASECOLOUR == var1.serverPacket) {
					var22 = var3.readInt();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedByteAdd();
					var106 = class167.widgetDefinition.method7456(var22);
					var106.field4178.method7548(var5, var6);
					ApproximateRouteStrategy.invalidateWidget(var106);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3610 == var1.serverPacket) {
					class274.method6203();
					weight = var3.readShort();
					field471 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_ROTATE_SPEED == var1.serverPacket) {
					var22 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedShort();
					var6 = var3.readInt();
					var106 = class167.widgetDefinition.method7456(var6);
					var106.field4127 = var22 + (var5 << 16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_OPENTOP == var1.serverPacket) {
					var22 = var3.readUnsignedShortLE();
					if (var22 == 65535) {
						var22 = -1;
					}

					rootInterface = var22;
					this.method874(false);
					Tiles.method2077(var22);
					WorldMapRegion.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						validRootWidgets[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_OPENSUB == var1.serverPacket) {
					var22 = var3.readUnsignedByteNeg();
					var5 = var3.readUnsignedIntME();
					var6 = var3.readUnsignedShortLE();
					var105 = (InterfaceParent)interfaceParents.get((long)var5);
					if (var105 != null) {
						WorldMapCacheName.closeInterface(var105, var6 != var105.group);
					}

					GrandExchangeOfferOwnWorldComparator.openInterface(var5, var6, var22);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_TEXT == var1.serverPacket) {
					var22 = var3.readUnsignedIntIME();
					var23 = var3.readStringCp1252NullTerminated();
					var71 = class167.widgetDefinition.method7456(var22);
					if (!var23.equals(var71.text)) {
						var71.text = var23;
						ApproximateRouteStrategy.invalidateWidget(var71);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RESET_CLIENT_VARCACHE == var1.serverPacket) {
					for (var22 = 0; var22 < ModelData0.field2962; ++var22) {
						VarpDefinition var70 = Projection.VarpDefinition_get(var22);
						if (var70 != null) {
							Varps.Varps_temp[var22] = 0;
							Varps.Varps_main[var22] = 0;
						}
					}

					class274.method6203();
					changedVarpCount += 32;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_REBOOT_TIMER == var1.serverPacket) {
					rebootTimer = var3.readUnsignedShortAddLE() * 30;
					field471 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3702 == var1.serverPacket) {
					var22 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedIntME();
					var6 = var3.readUnsignedIntIME();
					var59 = Coord.method7426(var5);
					var8 = Coord.method7392(var5);
					var9 = Coord.method7451(var5);
					var73 = worldViewManager.method2316(var8, var9);
					var11 = var8 - var73.baseX;
					var26 = var9 - var73.baseY;
					if (var11 >= 0 && var26 >= 0 && var11 < var73.sizeX && var26 < var73.sizeY) {
						class366.method7885(var73, var59, var11, var26, var22, var6);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REFLECTION_CHECKER == var1.serverPacket) {
					RouteStrategy.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SWAP == var1.serverPacket) {
					var5 = var3.readUnsignedShortLE();
					var6 = var3.readUnsignedShort();
					var22 = var3.readUnsignedShortAddLE();
					var59 = var3.readUnsignedShortAddLE();
					ViewportMouse.method5645(var22, var5, var6, var59);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OBJ_SET_CUSTOMIZATION == var1.serverPacket) {
					class381.method8166(class326.field3550);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3608 == var1.serverPacket) {
					WorldMapRenderer.field3290 = var3.readBoolean();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_LOOKAT_EASED_ANGLE_RELATIVE == var1.serverPacket) {
					isCameraLocked = true;
					field428 = false;
					field347 = true;
					var22 = var3.readShort();
					var5 = var3.readShort();
					var6 = GrandExchangeOfferTotalQuantityComparator.method8487(var5 + class187.cameraPitch & 2027);
					var59 = var22 + class28.cameraYaw;
					var8 = var3.readUnsignedShort();
					var9 = var3.readUnsignedByte();
					field570 = new class546(class187.cameraPitch, var6, var8, var9);
					field569 = new class546(class28.cameraYaw, var59, var8, var9);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PING_STATISTICS_REQUEST == var1.serverPacket) {
					var22 = var3.readInt();
					var5 = var3.readInt();
					var6 = Actor.getGcDuration();
					PacketBufferNode var37 = class291.getPacketBufferNode(ClientPacket.PING_STATISTICS, packetWriter.isaacCipher);
					var37.packetBuffer.writeByteSub(var6);
					var37.packetBuffer.writeInt(var22);
					var37.packetBuffer.writeIntME(var5);
					var37.packetBuffer.writeByteAdd(GameEngine.fps);
					packetWriter.addNode(var37);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RESET_INTERACTION_MODE == var1.serverPacket) {
					var22 = var3.readShort();
					worldViewManager.method2344(var22);
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

				if (ServerPacket.UPDATE_SITE_SETTINGS == var1.serverPacket) {
					UserComparator5.method3511(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VAR_CLAN == var1.serverPacket) {
					if (Projection.field2791 == null) {
						Projection.field2791 = new class521(class270.field3123);
					}

					class596 var52 = class270.field3123.method10492(var3);
					Projection.field2791.field5444.vmethod10930(var52.field5883, var52.field5881);
					field5512[++field5513 - 1 & 31] = var52.field5883;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3686 == var1.serverPacket) {
					class381.method8166(class326.field3558);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3631 == var1.serverPacket) {
					var22 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedIntLE();
					var6 = var3.readUnsignedIntIME();
					var59 = Coord.method7426(var5);
					var8 = Coord.method7392(var5);
					var9 = Coord.method7451(var5);
					var73 = worldViewManager.method2316(var8, var9);
					var11 = var8 - var73.baseX;
					var26 = var9 - var73.baseY;
					if (0 <= var11 && var11 < var73.sizeX && 0 <= var26 && var26 < var73.sizeY) {
						class82.method2750(var73, var59, var11, var26, var22, var6);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_FRIENDLIST == var1.serverPacket) {
					class137.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field557 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3675 == var1.serverPacket) {
					class274.method6203();
					runEnergy = var3.readUnsignedShort();
					field471 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_IGNORELIST == var1.serverPacket) {
					class137.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					class144.FriendSystem_invalidateIgnoreds();
					field557 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETCOLOUR == var1.serverPacket) {
					var22 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShortAdd();
					var6 = var5 >> 10 & 31;
					var59 = var5 >> 5 & 31;
					var8 = var5 & 31;
					var9 = (var59 << 11) + (var6 << 19) + (var8 << 3);
					Widget var25 = class167.widgetDefinition.method7456(var22);
					if (var9 != var25.color) {
						var25.color = var9;
						ApproximateRouteStrategy.invalidateWidget(var25);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_MODE == var1.serverPacket) {
					var22 = var3.readUnsignedByte();
					Calendar.method8098(var22);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VARP_LARGE == var1.serverPacket) {
					var22 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShortAdd();
					Varps.Varps_temp[var5] = var22;
					if (Varps.Varps_main[var5] != var22) {
						Varps.Varps_main[var5] = var22;
					}

					SpotAnimationDefinition.changeGameOptions(var5);
					changedVarps[++changedVarpCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_JINGLE == var1.serverPacket) {
					var22 = var3.readUnsignedShortAdd();
					if (var22 == 65535) {
						var22 = -1;
					}

					var5 = var3.readMedium();
					HttpMethod.method80(var22, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_MOVETO == var1.serverPacket) {
					isCameraLocked = true;
					field428 = false;
					field380 = true;
					WorldViewManager.field1000 = var3.readUnsignedByte();
					WorldMapSectionType.field3343 = var3.readUnsignedByte();
					var22 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShort();
					field567 = var3.readBoolean();
					var6 = var3.readUnsignedByte();
					var59 = Coord.method7396(WorldViewManager.field1000);
					var8 = Coord.method7396(WorldMapSectionType.field3343);
					boolean var60 = false;
					boolean var61 = false;
					if (field567) {
						var9 = WorldMapCacheName.cameraY;
						var10 = class477.getTileHeight(class7.topLevelWorldView, var59, var8, class7.topLevelWorldView.plane) - var22;
					} else {
						var9 = class477.getTileHeight(class7.topLevelWorldView, Language.cameraX, class66.cameraZ, class7.topLevelWorldView.plane) - WorldMapCacheName.cameraY;
						var10 = var22;
					}

					field568 = new class545(Language.cameraX, class66.cameraZ, var9, var59, var8, var10, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETSCROLLPOS == var1.serverPacket) {
					var22 = var3.readInt();
					var5 = var3.readUnsignedShortLE();
					var71 = class167.widgetDefinition.method7456(var22);
					if (var71 != null && var71.type == 0) {
						if (var5 > var71.scrollHeight - var71.height * -1326764757) {
							var5 = var71.scrollHeight - var71.height * -1326764757;
						}

						if (var5 < 0) {
							var5 = 0;
						}

						if (var5 != var71.scrollY) {
							var71.scrollY = var5;
							ApproximateRouteStrategy.invalidateWidget(var71);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VARP_SMALL == var1.serverPacket) {
					var22 = var3.readUnsignedShort();
					byte var58 = var3.readByteSub();
					Varps.Varps_temp[var22] = var58;
					if (Varps.Varps_main[var22] != var58) {
						Varps.Varps_main[var22] = var58;
					}

					SpotAnimationDefinition.changeGameOptions(var22);
					changedVarps[++changedVarpCount - 1 & 31] = var22;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RUNCLIENTSCRIPT == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					Object[] var69 = new Object[var51.length() + 1];

					for (var6 = var51.length() - 1; var6 >= 0; --var6) {
						DynamicArray var89;
						switch(var51.charAt(var6)) {
						case 'W':
							var59 = var3.packBytesToInt();
							var89 = new DynamicArray(class570.field5721, 0, var59, var59);
							int[] var95 = var89.method10348();

							for (var10 = 0; var10 < var59; ++var10) {
								var95[var10] = var3.method11250();
							}

							var69[var6 + 1] = var89;
							break;
						case 'X':
							var59 = var3.packBytesToInt();
							var89 = new DynamicArray(class570.field5718, (Object)null, var59, var59);
							Object[] var93 = var89.method10393();

							for (var10 = 0; var10 < var59; ++var10) {
								var93[var10] = var3.readStringCp1252NullTerminated();
							}

							var69[var6 + 1] = var89;
							break;
						case 's':
							var69[var6 + 1] = var3.readStringCp1252NullTerminated();
							break;
						default:
							var69[var6 + 1] = new Integer(var3.readInt());
						}
					}

					var69[0] = new Integer(var3.readInt());
					ScriptEvent var76 = new ScriptEvent();
					var76.args = var69;
					SequenceDefinition.runScriptEvent(var76);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_EVENTS == var1.serverPacket) {
					var22 = var3.readUnsignedShortAdd();
					if (var22 == 65535) {
						var22 = -1;
					}

					var5 = var3.readUnsignedShortAdd();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.readInt();
					var59 = var3.readUnsignedIntLE();
					var8 = var3.readUnsignedIntLE();
					WidgetConfigNode var29 = (WidgetConfigNode) widgetFlags.get((long)var59);
					if (var29 != null) {
						var29.remove();
					}

					var29 = SoundCache.method3092(var29, var5, var22, var8, var6);
					widgetFlags.put(var29, (long)var59);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3668 == var1.serverPacket) {
					var22 = var3.readShort();
					class514 var68 = (class514)HealthBarConfig.findEnumerated(class427.method8684(), var3.readUnsignedByte());
					class512 var74 = (class512)HealthBarConfig.findEnumerated(AttackOption.method2756(), var3.readUnsignedByte());
					if (var22 == -2) {
						worldViewManager.method2321(var68, var74);
					} else {
						worldViewManager.method2350(var22, var68, var74);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_PRIVATE_ECHO == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					var23 = AbstractFont.escapeBrackets(class379.method8155(WorldMapIcon_0.method6722(var3)));
					AuthenticationScheme.addGameMessage(6, var51, var23);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VAR_CLAN_DISABLE == var1.serverPacket) {
					Projection.field2791 = null;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_WORLDENTITY == var1.serverPacket) {
					class159.method3878(class7.topLevelWorldView, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETNPCHEAD_ACTIVE == var1.serverPacket) {
					var22 = var3.readUnsignedShort();
					var5 = var3.readUnsignedIntLE();
					var71 = class167.widgetDefinition.method7456(var5);
					if (var71.modelType != 6 || var22 != var71.modelId) {
						var71.modelType = 6;
						var71.modelId = var22;
						ApproximateRouteStrategy.invalidateWidget(var71);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOC_ANIM == var1.serverPacket) {
					class381.method8166(class326.field3561);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.DYNAMICOBJECT_SPAWN == var1.serverPacket) {
					var6 = var3.method11277();
					var22 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var59 = var22 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					var13 = var3.readUnsignedShortAdd();
					var9 = var3.readUnsignedByteNeg();
					var10 = var9 >> 2;
					var11 = var9 & 3;
					var26 = field298[var10];
					if (0 <= var59 && var59 < 103 && 0 <= var8 && var8 < 103) {
						class7.method57(var59, var8, var10, var11, var26, var13);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3614 == var1.serverPacket) {
					class381.method8166(class326.field3549);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_GAME == var1.serverPacket) {
					var22 = var3.readUShortSmart();
					var55 = var3.readUnsignedByte() == 1;
					var24 = "";
					var7 = false;
					if (var55) {
						var24 = var3.readStringCp1252NullTerminated();
						if (class137.friendSystem.isIgnored(new Username(var24, class198.loginType))) {
							var7 = true;
						}
					}

					String var28 = var3.readStringCp1252NullTerminated();
					if (!var7) {
						AuthenticationScheme.addGameMessage(var22, var24, var28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL == var1.serverPacket) {
					overheadTextLimit = var3.readUnsignedByteNeg();
					class67.field906 = var3.readUnsignedByteNeg();
					WorldMapArea.field3255 = var3.readUnsignedByteSub();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3669 == var1.serverPacket) {
					class381.method8166(class326.field3552);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3664 == var1.serverPacket) {
					field556 = var3.readStringCp1252NullTerminated();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_ANIM_SPECIFIC == var1.serverPacket) {
					var22 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedByte();
					if (var22 == 65535) {
						var22 = -1;
					}

					class399.performPlayerAnimation(class27.localPlayer, var22, var5);
					var1.serverPacket = null;
					return true;
				}

				class559.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1276 != null ? var1.field1276.id : -1) + "," + (var1.field1266 != null ? var1.field1266.id : -1) + "," + var1.serverPacketLength, (Throwable)null);
				MilliClock.logOut();
			} catch (IOException var49) {
				AsyncRestClient.method161();
			} catch (Exception var50) {
				var23 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1276 != null ? var1.field1276.id : -1) + "," + (var1.field1266 != null ? var1.field1266.id : -1) + "," + var1.serverPacketLength + "," + (class27.localPlayer.pathX[0] + class7.topLevelWorldView.baseX) + "," + (class27.localPlayer.pathY[0] + class7.topLevelWorldView.baseY) + ",";

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) {
					var23 = var23 + var3.array[var6] + ",";
				}

				class559.RunException_sendStackTrace(var23, var50);
				MilliClock.logOut();
			}

			return true;
		}
	}

	@ObfuscatedName("qj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-77877147"
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
				if (var10 != 1 && (WidgetDefinition.mouseCam || var10 != 4) && !menu.method11885(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y)) {
					isMenuOpen = false;
					menu.invalidateWidgetsUnder();
				}

				if (var10 == 1 || !WidgetDefinition.mouseCam && var10 == 4) {
					menu.method11865(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					isMenuOpen = false;
					menu.invalidateWidgetsUnder();
				}
			} else if (menu.menuOptionsCount > 0) {
				var3 = menu.menuOptionsCount - 1;
				if ((var10 == 1 || !WidgetDefinition.mouseCam && var10 == 4) && this.shouldLeftClickOpenMenu(menu.menuOpcodes[var3], menu.menuShiftClick[var3])) {
					var10 = 2;
				}

				if (var10 == 1 || !WidgetDefinition.mouseCam && var10 == 4) {
					menu.method11863(var3);
				}

				if (var10 == 2) {
					this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}
			}

		}
	}

	@ObfuscatedName("qq")
	@ObfuscatedSignature(
		descriptor = "(IZI)Z",
		garbageValue = "1085754698"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu(int var1, boolean var2) {
		return (leftClickOpensMenu && menu.menuOptionsCount > 2 || WorldMapLabelSize.method6370(var1)) && !var2;
	}

	@ObfuscatedName("qc")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "150438863"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		menu.method11877(var1, var2);
		Iterator var3 = worldViewManager.iterator();

		while (var3.hasNext()) {
			WorldView var4 = (WorldView)var3.next();
			var4.scene.menuOpen(false);
		}

		isMenuOpen = true;
		menu.method11866();
	}

	@ObfuscatedName("qy")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "289681368"
	)
	final void method874(boolean var1) {
		HealthBarDefinition.method4255(rootInterface, RestClientThreadFactory.canvasWidth, GameEngine.canvasHeight, var1);
	}

	@ObfuscatedName("qd")
	@ObfuscatedSignature(
		descriptor = "(Lox;B)V",
		garbageValue = "116"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var4 = var1.parentId == -1 ? null : class167.widgetDefinition.getWidgetChild(var1.parentId, var1.field4117);
		int var2;
		int var3;
		if (var4 == null) {
			var2 = RestClientThreadFactory.canvasWidth;
			var3 = GameEngine.canvasHeight;
		} else {
			var2 = var4.width;
			var3 = var4.height * -1326764757;
		}

		ModelData0.alignWidgetSize(var1, var2, var3, false);
		AddRequestTask.alignWidgetPosition(var1, var2, var3);
	}

	@ObfuscatedName("qp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1116812510"
	)
	final void method855() {
		ApproximateRouteStrategy.invalidateWidget(clickedWidget);
		++AnimationSequence.widgetDragDuration;
		if (field413 && field519) {
			int var1 = MouseHandler.MouseHandler_x;
			int var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field512) {
				var1 = field512;
			}

			if (var1 + clickedWidget.width > field512 + clickedWidgetParent.width) {
				var1 = field512 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field521) {
				var2 = field521;
			}

			if (var2 + clickedWidget.height * -1326764757 > clickedWidgetParent.height * -1326764757 + field521) {
				var2 = clickedWidgetParent.height * -1326764757 + field521 - clickedWidget.height * -1326764757;
			}

			int var3 = var1 - field523;
			int var4 = var2 - field524;
			int var5 = clickedWidget.dragZoneSize;
			if (AnimationSequence.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}

			int var6 = var1 - field512 + clickedWidgetParent.scrollX;
			int var7 = var2 - field521 + clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = clickedWidget.onDrag;
				SequenceDefinition.runScriptEvent(var8);
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
						SequenceDefinition.runScriptEvent(var8);
					}

					if (draggedOnWidget != null) {
						Widget var9 = clickedWidget;
						int var11 = class516.getWidgetFlags(var9);
						int var10 = var11 >> 17 & 7;
						int var12 = var10;
						Widget var15;
						if (var10 == 0) {
							var15 = null;
						} else {
							int var13 = 0;

							while (true) {
								if (var13 >= var12) {
									var15 = var9;
									break;
								}

								var9 = class167.widgetDefinition.method7456(var9.parentId);
								if (var9 == null) {
									var15 = null;
									break;
								}

								++var13;
							}
						}

						if (var15 != null) {
							PacketBufferNode var14 = class291.getPacketBufferNode(ClientPacket.OPHELDD, packetWriter.isaacCipher);
							var14.packetBuffer.writeShort(clickedWidget.itemId);
							var14.packetBuffer.writeShortLE(draggedOnWidget.childIndex * -64977777);
							var14.packetBuffer.writeShortLE(draggedOnWidget.itemId);
							var14.packetBuffer.writeIntLE(clickedWidget.id);
							var14.packetBuffer.writeShortAdd(clickedWidget.childIndex * -64977777);
							var14.packetBuffer.writeIntME(draggedOnWidget.id);
							packetWriter.addNode(var14);
						}
					}
				} else if (NPCComposition.tempMenuAction != null && !this.shouldLeftClickOpenMenu(NPCComposition.tempMenuAction.opcode, NPCComposition.tempMenuAction.field691)) {
					if (menu.menuOptionsCount > 0) {
						class455.method9225(field523 + widgetClickX, widgetClickY + field524);
					}
				} else {
					this.openMenu(widgetClickX + field523, widgetClickY + field524);
				}

				clickedWidget = null;
			}

		} else {
			if (AnimationSequence.widgetDragDuration > 1) {
				if (!isDraggingWidget && menu.menuOptionsCount > 0) {
					class455.method9225(widgetClickX + field523, widgetClickY + field524);
				}

				clickedWidget = null;
			}

		}
	}

	@ObfuscatedName("qt")
	@ObfuscatedSignature(
		descriptor = "(I)Lxf;",
		garbageValue = "-483132180"
	)
	@Export("username")
	public Username username() {
		return class27.localPlayer != null ? class27.localPlayer.username : null;
	}

	@ObfuscatedName("qm")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "96"
	)
	void method1317(int var1) {
		PacketBufferNode var2 = class291.getPacketBufferNode(ClientPacket.CLAN_CHANNEL_FULL_REQUEST, packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(var1);
		packetWriter.addNode(var2);
	}

	@ObfuscatedName("qa")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1722563561"
	)
	void method1303(int var1) {
		PacketBufferNode var2 = class291.getPacketBufferNode(ClientPacket.CLAN_SETTINGS_FULL_REQUEST, packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(var1);
		packetWriter.addNode(var2);
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
		class406.method8328(this);
		super.finalize();
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
			DynamicObject.method1987(10);
		}
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
							HorizontalAlignment.clientLanguage = Language.method8690(Integer.parseInt(var2));
							break;
						case 7:
							int var4 = Integer.parseInt(var2);
							GameBuild[] var5 = new GameBuild[]{GameBuild.RC, GameBuild.BUILDLIVE, GameBuild.WIP, GameBuild.LIVE};
							GameBuild[] var6 = var5;
							int var7 = 0;

							GameBuild var9;
							while (true) {
								if (var7 >= var6.length) {
									var9 = null;
									break;
								}

								GameBuild var8 = var6[var7];
								if (var4 == var8.buildId) {
									var9 = var8;
									break;
								}

								++var7;
							}

							class322.field3447 = var9;
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) {
							}
							break;
						case 9:
							ArchiveDiskAction.field4784 = var2;
							break;
						case 10:
							class36.field227 = (StudioGame)HealthBarConfig.findEnumerated(class360.method7503(), Integer.parseInt(var2));
							if (StudioGame.oldscape == class36.field227) {
								class198.loginType = LoginType.oldscape;
							} else {
								class198.loginType = LoginType.field5675;
							}
							break;
						case 11:
							DelayFadeTask.authServiceBaseUrl = var2;
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
							WorldMapSectionType.field3345 = Integer.parseInt(var2);
							break;
						case 15:
							gameBuild = Integer.parseInt(var2);
							break;
						case 17:
							User.field5291 = var2;
							break;
						case 21:
							field368 = Integer.parseInt(var2);
							break;
						case 22:
							HttpContentType.gameSessionServiceBaseUrl = var2;
							break;
						case 25:
							int var3 = var2.indexOf(".");
							if (var3 == -1) {
								class581.field5790 = Integer.parseInt(var2);
							} else {
								class581.field5790 = Integer.parseInt(var2.substring(0, var3));
								Integer.parseInt(var2.substring(var3 + 1));
							}
						}
					}
				}

				Scene.Scene_isLowDetail = false;
				isLowDetail = false;
				Interpreter.worldHost = this.getCodeBase().getHost();
				HorizontalAlignment.field2060 = new JagNetThread();
				String var10 = class322.field3447.name;
				byte var11 = 0;
				if ((worldProperties & class578.field5767.rsOrdinal()) != 0) {
					class31.field148 = "beta";
				}

				try {
					Occluder.method5373("oldschool", class31.field148, var10, var11, 25);
				} catch (Exception var12) {
					class559.RunException_sendStackTrace((String)null, var12);
				}

				Language.client = this;
				RunException.field5988 = clientType;
				UserComparator3.method3516();
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
					this.https = true;
				}

				if (field320 == -1) {
					if (!this.containsAccessAndRefreshToken() && !this.containsSessionAndCharacterId()) {
						field320 = 0;
					} else {
						field320 = 5;
					}
				}

				this.startThread(765, 503, 232, 1);
			}
		} catch (RuntimeException var13) {
			throw class391.newRunException(var13, "client.init(" + ')');
		}
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-740676801"
	)
	static final void method1484(int var0, int var1, boolean var2) {
		if (!var2 || var0 != BuddyRankComparator.field1574 || class140.field1692 != var1) {
			BuddyRankComparator.field1574 = var0;
			class140.field1692 = var1;
			AuthenticationScheme.updateGameState(25);
			field431 = true;
			WorldMapLabel.drawLoadingMessage("Loading - please wait.", true);
			int var3 = class7.topLevelWorldView.baseX;
			int var4 = class7.topLevelWorldView.baseY;
			class7.topLevelWorldView.baseX = (var0 - 6) * 8;
			class7.topLevelWorldView.baseY = (var1 - 6) * 8;
			int var5 = class7.topLevelWorldView.baseX - var3;
			int var6 = class7.topLevelWorldView.baseY - var4;
			int var7 = var5 * 128;
			int var8 = var6 * 128;

			int var11;
			int[] var10000;
			for (int var9 = 0; var9 < 65536; ++var9) {
				NPC var25 = (NPC)class7.topLevelWorldView.npcs.get((long)var9);
				if (var25 != null) {
					for (var11 = 0; var11 < 10; ++var11) {
						var10000 = var25.pathX;
						var10000[var11] -= var5;
						var10000 = var25.pathY;
						var10000[var11] -= var6;
					}

					var25.x -= var7;
					var25.y -= var8;
					var25.field1070 -= var5;
					var25.field1072 -= var6;
					var25.field1071 -= var5;
					var25.field1073 -= var6;
				}
			}

			Iterator var21 = class7.topLevelWorldView.players.iterator();

			while (true) {
				Player var28;
				do {
					if (!var21.hasNext()) {
						for (int var10 = 0; var10 < 4095; ++var10) {
							WorldEntity var24 = (WorldEntity)class7.topLevelWorldView.worldEntities.get((long)var10);
							if (var24 != null) {
								var24.setPosition(-var7, -var8);
							}
						}

						byte var26 = 0;
						byte var27 = 104;
						byte var12 = 1;
						if (var5 < 0) {
							var26 = 103;
							var27 = -1;
							var12 = -1;
						}

						byte var13 = 0;
						byte var14 = 104;
						byte var15 = 1;
						if (var6 < 0) {
							var13 = 103;
							var14 = -1;
							var15 = -1;
						}

						int var18;
						for (int var16 = var26; var27 != var16; var16 += var12) {
							for (int var23 = var13; var23 != var14; var23 += var15) {
								var18 = var5 + var16;
								int var19 = var6 + var23;

								for (int var20 = 0; var20 < 4; ++var20) {
									if (0 <= var18 && var18 < 104 && 0 <= var19 && var19 < 104) {
										class7.topLevelWorldView.groundItems[var20][var16][var23] = class7.topLevelWorldView.groundItems[var20][var18][var19];
									} else {
										class7.topLevelWorldView.groundItems[var20][var16][var23] = null;
									}
								}
							}
						}

						for (PendingSpawn var22 = (PendingSpawn)class7.topLevelWorldView.pendingSpawns.last(); var22 != null; var22 = (PendingSpawn)class7.topLevelWorldView.pendingSpawns.previous()) {
							var22.x -= var5;
							var22.y -= var6;
							if (var22.x < 0 || 104 <= var22.x || var22.y < 0 || 104 <= var22.y) {
								var22.remove();
							}
						}

						if (destinationX != 0) {
							destinationX -= var5;
							destinationY -= var6;
						}

						for (Projectile var17 = (Projectile)projectiles.last(); var17 != null; var17 = (Projectile)projectiles.previous()) {
							var17.method1937(-var5, -var6);
						}

						class57.soundEffectCount = 0;
						isCameraLocked = false;
						Language.cameraX -= var5 << 7;
						class66.cameraZ -= var6 << 7;
						class28.oculusOrbFocalPointX -= var5 << 7;
						MusicPatch.oculusOrbFocalPointY -= var6 << 7;
						field581 -= var5 << 7;
						field492 -= var6 << 7;
						field1340 = -1;
						class7.topLevelWorldView.graphicsObjects.clear();

						for (var18 = 0; var18 < 4; ++var18) {
							class7.topLevelWorldView.collisionMaps[var18].clear();
						}

						return;
					}

					var28 = (Player)var21.next();
				} while(var28 == null);

				for (var11 = 0; var11 < 10; ++var11) {
					var10000 = var28.pathX;
					var10000[var11] -= var5;
					var10000 = var28.pathY;
					var10000[var11] -= var6;
				}

				var28.x -= var7;
				var28.y -= var8;
				var28.field1070 -= var5;
				var28.field1072 -= var6;
				var28.field1071 -= var5;
				var28.field1073 -= var6;
			}
		}
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(Ldj;IIIIIIIIIZI)V",
		garbageValue = "1947857220"
	)
	static void method1485(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10) {
		TileItem var11 = new TileItem();
		var11.id = var4;
		var11.quantity = var5;
		var11.setFlag(var6);
		var11.visibleTime = var7 + serverCycle;
		var11.despawnTime = var8 + serverCycle;
		var11.ownership = var9;
		var11.isPrivate = var10;
		if (var0.groundItems[var1][var2][var3] == null) {
			var0.groundItems[var1][var2][var3] = new NodeDeque();
		}

		var0.groundItems[var1][var2][var3].addFirst(var11);
		class570.updateItemPile2(var0, var1, var2, var3);
	}
}
