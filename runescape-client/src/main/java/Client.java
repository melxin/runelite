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
public final class Client extends GameEngine implements Usernamed, OAuthApi, class341 {
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	static final class279 field307;
	@ObfuscatedName("dh")
	@Export("BASIC_AUTH_DESKTOP_OSRS")
	static final String BASIC_AUTH_DESKTOP_OSRS;
	@ObfuscatedName("dw")
	@Export("BASIC_AUTH_DESKTOP_RUNELITE")
	static final String BASIC_AUTH_DESKTOP_RUNELITE;
	@ObfuscatedName("em")
	static final int[] field524;
	@ObfuscatedName("ea")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	@Export("playerAppearance")
	static final PlayerComposition playerAppearance;
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "Lbs;"
	)
	static final ApproximateRouteStrategy field533;
	@ObfuscatedName("fi")
	static boolean field329;
	@ObfuscatedName("fx")
	@ObfuscatedGetter(
		intValue = -71837669
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("ff")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("fl")
	@ObfuscatedGetter(
		intValue = -1185870791
	)
	static int field434;
	@ObfuscatedName("fd")
	@ObfuscatedGetter(
		intValue = 2062449695
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("fb")
	@ObfuscatedGetter(
		intValue = -195102339
	)
	@Export("cycle")
	public static int cycle;
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	@Export("authenticationScheme")
	static AuthenticationScheme authenticationScheme;
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Lwc;"
	)
	static class584 field438;
	@ObfuscatedName("fs")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("fh")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("worldViewManager")
	public static WorldViewManager worldViewManager;
	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	@Export("playerUpdateManager")
	static PlayerUpdateManager playerUpdateManager;
	@ObfuscatedName("gu")
	@ObfuscatedGetter(
		intValue = -196739047
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("ga")
	@ObfuscatedGetter(
		intValue = 1554066619
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("gh")
	@ObfuscatedGetter(
		intValue = 565632123
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("gj")
	@ObfuscatedGetter(
		intValue = 2034952093
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("gw")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("gm")
	@ObfuscatedGetter(
		intValue = 1499360251
	)
	static int field332;
	@ObfuscatedName("gg")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = 1658742543
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("gc")
	@ObfuscatedGetter(
		intValue = 16308607
	)
	static int field335;
	@ObfuscatedName("gd")
	static String field336;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = 1992130453
	)
	static int field337;
	@ObfuscatedName("gp")
	@ObfuscatedGetter(
		intValue = 1462955479
	)
	static int field338;
	@ObfuscatedName("gi")
	@ObfuscatedGetter(
		intValue = -1603897549
	)
	static int field339;
	@ObfuscatedName("ge")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("gt")
	@ObfuscatedGetter(
		intValue = 364389501
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("gy")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("gb")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("gf")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("hj")
	static int[] field345;
	@ObfuscatedName("hm")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("hi")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("ho")
	@ObfuscatedGetter(
		intValue = 1538387369
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("hh")
	@ObfuscatedGetter(
		longValue = -5744354433194361273L
	)
	static long field398;
	@ObfuscatedName("hv")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("ht")
	@ObfuscatedGetter(
		intValue = 636189453
	)
	static int field352;
	@ObfuscatedName("hd")
	@ObfuscatedGetter(
		intValue = 1513150813
	)
	@Export("revision")
	public static int revision;
	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("indexCheck")
	public static IndexCheck indexCheck;
	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	static class269 field491;
	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "[Lgu;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "[Lgd;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("hq")
	static short field358;
	@ObfuscatedName("ha")
	static short field359;
	@ObfuscatedName("hn")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("hg")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("hl")
	static short field362;
	@ObfuscatedName("he")
	static short field363;
	@ObfuscatedName("ih")
	static short field364;
	@ObfuscatedName("ia")
	static short field365;
	@ObfuscatedName("ik")
	@ObfuscatedGetter(
		intValue = -974710557
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("id")
	@ObfuscatedGetter(
		intValue = -134624175
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("if")
	@ObfuscatedGetter(
		intValue = -8548079
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("ip")
	@ObfuscatedGetter(
		intValue = 819474861
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("im")
	@ObfuscatedGetter(
		intValue = 1874270005
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "[Lpa;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "Lbn;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("it")
	static String field520;
	@ObfuscatedName("ib")
	@ObfuscatedGetter(
		intValue = 236621971
	)
	static int field373;
	@ObfuscatedName("io")
	@ObfuscatedGetter(
		intValue = 2017901863
	)
	public static int field346;
	@ObfuscatedName("iq")
	@ObfuscatedGetter(
		intValue = 1605014271
	)
	static int field375;
	@ObfuscatedName("ie")
	@ObfuscatedGetter(
		intValue = 1852607271
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("jc")
	@ObfuscatedGetter(
		intValue = -221475203
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("jq")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("jp")
	@ObfuscatedGetter(
		intValue = 1539527819
	)
	static int field379;
	@ObfuscatedName("jl")
	@ObfuscatedGetter(
		intValue = -2043107529
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("jx")
	@ObfuscatedGetter(
		intValue = 1955317323
	)
	static int field381;
	@ObfuscatedName("jg")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("ja")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("jz")
	@ObfuscatedGetter(
		intValue = 2116308645
	)
	@Export("serverCycle")
	static int serverCycle;
	@ObfuscatedName("jr")
	@ObfuscatedGetter(
		longValue = -6226946241741619845L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("jk")
	@ObfuscatedGetter(
		intValue = 1885040757
	)
	static int field386;
	@ObfuscatedName("jt")
	@ObfuscatedGetter(
		intValue = 1917232339
	)
	static int field412;
	@ObfuscatedName("jv")
	@ObfuscatedGetter(
		longValue = -452955011114912125L
	)
	static long field305;
	@ObfuscatedName("jh")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("jn")
	@ObfuscatedGetter(
		intValue = -432999495
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("jm")
	@Export("z")
	static boolean z;
	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	static class70 field392;
	@ObfuscatedName("kb")
	@ObfuscatedGetter(
		intValue = -1368824765
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("kk")
	@ObfuscatedGetter(
		intValue = -1731150859
	)
	static int field394;
	@ObfuscatedName("la")
	@ObfuscatedGetter(
		intValue = 135102871
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("le")
	@ObfuscatedGetter(
		intValue = 1340026861
	)
	static int field396;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = 1338362809
	)
	static int field397;
	@ObfuscatedName("lu")
	@ObfuscatedGetter(
		intValue = -1921942229
	)
	static int field503;
	@ObfuscatedName("lb")
	@ObfuscatedGetter(
		intValue = 151075783
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("lc")
	@ObfuscatedGetter(
		intValue = -1451144669
	)
	static int field591;
	@ObfuscatedName("lm")
	@ObfuscatedGetter(
		intValue = 1546065205
	)
	static int field325;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = 1416752211
	)
	static int field576;
	@ObfuscatedName("lf")
	@ObfuscatedGetter(
		intValue = -1502439027
	)
	static int field403;
	@ObfuscatedName("lz")
	@ObfuscatedGetter(
		intValue = -1834884025
	)
	static int field404;
	@ObfuscatedName("mh")
	@ObfuscatedGetter(
		intValue = 583344695
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("mr")
	@ObfuscatedGetter(
		intValue = -822079937
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("mm")
	@ObfuscatedGetter(
		intValue = -2109378139
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("mf")
	@ObfuscatedGetter(
		intValue = -2099093317
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("mc")
	@ObfuscatedGetter(
		intValue = 501138751
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("my")
	@ObfuscatedGetter(
		intValue = -903389231
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("mq")
	@ObfuscatedGetter(
		intValue = 905001027
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("mg")
	@ObfuscatedGetter(
		intValue = 245093981
	)
	static int field413;
	@ObfuscatedName("ml")
	@ObfuscatedGetter(
		intValue = 2080643147
	)
	static int field414;
	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("mv")
	@ObfuscatedGetter(
		intValue = 1650076865
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("mo")
	@ObfuscatedGetter(
		intValue = -1129974461
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("mj")
	@ObfuscatedGetter(
		intValue = 1237270805
	)
	@Export("staffModLevel")
	static int staffModLevel;
	@ObfuscatedName("mw")
	@ObfuscatedGetter(
		intValue = -436531359
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("mn")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("me")
	@ObfuscatedGetter(
		intValue = 813091501
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("ms")
	@ObfuscatedGetter(
		intValue = -507172899
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("mz")
	@ObfuscatedGetter(
		intValue = -1851707445
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	@Export("scriptEvents2")
	static NodeDeque scriptEvents2;
	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	@Export("scriptEvents3")
	static NodeDeque scriptEvents3;
	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	static NodeDeque field427;
	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("nz")
	@ObfuscatedGetter(
		intValue = 1218523195
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("nm")
	@ObfuscatedGetter(
		intValue = -839048141
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("nh")
	static String field431;
	@ObfuscatedName("ne")
	@ObfuscatedGetter(
		intValue = 482014895
	)
	static int field432;
	@ObfuscatedName("nj")
	static int[] field360;
	@ObfuscatedName("no")
	static int[] field425;
	@ObfuscatedName("nv")
	@ObfuscatedGetter(
		longValue = -8185571664505572073L
	)
	static long field435;
	@ObfuscatedName("nx")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("nq")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("ni")
	static boolean field459;
	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("DBTableIndex_cache")
	static EvictingDualNodeHashTable DBTableIndex_cache;
	@ObfuscatedName("nr")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("archive11")
	static EvictingDualNodeHashTable archive11;
	@ObfuscatedName("nd")
	static boolean field441;
	@ObfuscatedName("np")
	static boolean field442;
	@ObfuscatedName("ns")
	static boolean field443;
	@ObfuscatedName("nn")
	static boolean field444;
	@ObfuscatedName("oj")
	@ObfuscatedGetter(
		intValue = 989490365
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("op")
	@ObfuscatedGetter(
		intValue = 211114945
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("oq")
	@ObfuscatedGetter(
		intValue = -463964681
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("od")
	@ObfuscatedGetter(
		intValue = 642095193
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("ox")
	@ObfuscatedGetter(
		intValue = -2075240755
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("oi")
	@ObfuscatedGetter(
		intValue = -249176258
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("of")
	@ObfuscatedGetter(
		intValue = 1098063781
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("ov")
	@ObfuscatedGetter(
		intValue = -1357253696
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("oc")
	@Export("accessToken")
	static String accessToken;
	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("on")
	static int[] field457;
	@ObfuscatedName("og")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("om")
	@ObfuscatedGetter(
		intValue = -2025025225
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("ow")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("oh")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("pb")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("pg")
	static int[][][] field463;
	@ObfuscatedName("ps")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("pm")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("pw")
	@ObfuscatedGetter(
		intValue = -419779743
	)
	static int field405;
	@ObfuscatedName("pd")
	@ObfuscatedGetter(
		intValue = 1608579381
	)
	@Export("graphicsCycle")
	static int graphicsCycle;
	@ObfuscatedName("qq")
	@ObfuscatedGetter(
		intValue = -1350308511
	)
	static int field451;
	@ObfuscatedName("qe")
	@ObfuscatedGetter(
		intValue = 761823401
	)
	static int field448;
	@ObfuscatedName("qd")
	@ObfuscatedGetter(
		intValue = 899368885
	)
	static int field328;
	@ObfuscatedName("qo")
	@ObfuscatedGetter(
		intValue = -808006989
	)
	static int field471;
	@ObfuscatedName("qt")
	static boolean field472;
	@ObfuscatedName("qm")
	@ObfuscatedGetter(
		intValue = 777014125
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("qb")
	@ObfuscatedGetter(
		intValue = -61861077
	)
	static int field474;
	@ObfuscatedName("qh")
	@ObfuscatedGetter(
		intValue = 1615875053
	)
	static int field475;
	@ObfuscatedName("qc")
	@ObfuscatedGetter(
		intValue = 1413436267
	)
	static int field424;
	@ObfuscatedName("qg")
	@ObfuscatedGetter(
		intValue = -776932151
	)
	static int field477;
	@ObfuscatedName("qa")
	static boolean field478;
	@ObfuscatedName("qv")
	@ObfuscatedGetter(
		intValue = 1818888267
	)
	static int field479;
	@ObfuscatedName("qn")
	static boolean field480;
	@ObfuscatedName("qu")
	@ObfuscatedGetter(
		intValue = 81070831
	)
	static int field481;
	@ObfuscatedName("qs")
	@ObfuscatedGetter(
		intValue = -544191107
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("qf")
	@ObfuscatedGetter(
		intValue = -1358914267
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("qy")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("qi")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("rv")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("rn")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("rt")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("re")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("rw")
	static int[][] field490;
	@ObfuscatedName("rz")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("rg")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("ro")
	@ObfuscatedGetter(
		intValue = -1195196699
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("ry")
	@ObfuscatedGetter(
		intValue = 2046643965
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("ri")
	@ObfuscatedGetter(
		intValue = 319882977
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("rr")
	@ObfuscatedGetter(
		intValue = -999186357
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("rq")
	@ObfuscatedGetter(
		intValue = 1550627781
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("rf")
	@ObfuscatedGetter(
		intValue = 1592153852
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("rk")
	@ObfuscatedGetter(
		intValue = -1542697407
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("rl")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;
	@ObfuscatedName("rs")
	@ObfuscatedGetter(
		longValue = 123374758391802337L
	)
	@Export("userId")
	static long userId;
	@ObfuscatedName("ru")
	@ObfuscatedGetter(
		longValue = 5028019790688935047L
	)
	@Export("userHash")
	static long userHash;
	@ObfuscatedName("rd")
	@ObfuscatedGetter(
		intValue = -625832873
	)
	static int field527;
	@ObfuscatedName("rx")
	@ObfuscatedGetter(
		intValue = 1220971317
	)
	static int field429;
	@ObfuscatedName("rb")
	@ObfuscatedGetter(
		intValue = 2087472901
	)
	static int field387;
	@ObfuscatedName("ra")
	@ObfuscatedGetter(
		intValue = 675119733
	)
	static int field506;
	@ObfuscatedName("rm")
	static int[] field507;
	@ObfuscatedName("rp")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("rh")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("sv")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("sm")
	@ObfuscatedGetter(
		intValue = -1617175157
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("su")
	@Export("leftClickOpensMenu")
	static boolean leftClickOpensMenu;
	@ObfuscatedName("sf")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("sj")
	@ObfuscatedSignature(
		descriptor = "Lxy;"
	)
	@Export("menu")
	static Menu menu;
	@ObfuscatedName("sn")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("sx")
	@ObfuscatedGetter(
		intValue = 902149203
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("sp")
	@ObfuscatedGetter(
		intValue = -742557445
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("sg")
	@ObfuscatedGetter(
		intValue = 1897664563
	)
	static int field518;
	@ObfuscatedName("so")
	@ObfuscatedGetter(
		intValue = -1268625889
	)
	static int field519;
	@ObfuscatedName("sk")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("sb")
	@ObfuscatedGetter(
		intValue = -1805685543
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("sq")
	@ObfuscatedGetter(
		intValue = -865398809
	)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("sd")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("sh")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("si")
	@ObfuscatedGetter(
		intValue = -1805320555
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("se")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	@Export("clickedWidget")
	public static Widget clickedWidget;
	@ObfuscatedName("st")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("sy")
	@ObfuscatedGetter(
		intValue = 797543925
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("sl")
	@ObfuscatedGetter(
		intValue = 922603103
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("tc")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("tr")
	static boolean field532;
	@ObfuscatedName("ta")
	@ObfuscatedGetter(
		intValue = -1978424081
	)
	static int field371;
	@ObfuscatedName("tu")
	@ObfuscatedGetter(
		intValue = -1086179825
	)
	static int field568;
	@ObfuscatedName("tq")
	static boolean field535;
	@ObfuscatedName("tn")
	@ObfuscatedGetter(
		intValue = 1616415687
	)
	static int field536;
	@ObfuscatedName("te")
	@ObfuscatedGetter(
		intValue = -2111595511
	)
	static int field537;
	@ObfuscatedName("tg")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("tv")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("to")
	@ObfuscatedGetter(
		intValue = -314106663
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("tz")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("tp")
	@ObfuscatedGetter(
		intValue = 473012747
	)
	@Export("changedItemsCount")
	static int changedItemsCount;
	@ObfuscatedName("tj")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("tw")
	@ObfuscatedGetter(
		intValue = 682163419
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("ty")
	static int[] field545;
	@ObfuscatedName("tx")
	@ObfuscatedGetter(
		intValue = -1242911867
	)
	static int field388;
	@ObfuscatedName("tk")
	@ObfuscatedGetter(
		intValue = 712972335
	)
	static int field534;
	@ObfuscatedName("ts")
	@ObfuscatedGetter(
		intValue = -1525396867
	)
	static int field548;
	@ObfuscatedName("tf")
	@ObfuscatedGetter(
		intValue = 1927736037
	)
	static int field549;
	@ObfuscatedName("tm")
	@ObfuscatedGetter(
		intValue = 28106117
	)
	static int field550;
	@ObfuscatedName("th")
	@ObfuscatedGetter(
		intValue = -811651397
	)
	static int field611;
	@ObfuscatedName("ti")
	@ObfuscatedGetter(
		intValue = -1184427713
	)
	static int field552;
	@ObfuscatedName("un")
	@ObfuscatedGetter(
		intValue = -1832433719
	)
	static int field553;
	@ObfuscatedName("up")
	@ObfuscatedSignature(
		descriptor = "Lxz;"
	)
	static class598 field554;
	@ObfuscatedName("ue")
	@ObfuscatedGetter(
		intValue = 697083101
	)
	@Export("rootWidgetCount")
	public static int rootWidgetCount;
	@ObfuscatedName("uq")
	@ObfuscatedGetter(
		intValue = -486350451
	)
	static int field556;
	@ObfuscatedName("uh")
	@Export("validRootWidgets")
	static boolean[] validRootWidgets;
	@ObfuscatedName("ur")
	public static boolean[] field558;
	@ObfuscatedName("ut")
	static boolean[] field559;
	@ObfuscatedName("ui")
	@Export("rootWidgetXs")
	public static int[] rootWidgetXs;
	@ObfuscatedName("ud")
	@Export("rootWidgetYs")
	public static int[] rootWidgetYs;
	@ObfuscatedName("uw")
	@Export("rootWidgetWidths")
	public static int[] rootWidgetWidths;
	@ObfuscatedName("uv")
	@Export("rootWidgetHeights")
	public static int[] rootWidgetHeights;
	@ObfuscatedName("ug")
	@ObfuscatedGetter(
		intValue = -1356226489
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("uk")
	static int[] field565;
	@ObfuscatedName("ux")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("ub")
	@ObfuscatedGetter(
		intValue = -1591051477
	)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("uz")
	@ObfuscatedGetter(
		intValue = -466443813
	)
	static int field347;
	@ObfuscatedName("uj")
	@ObfuscatedGetter(
		intValue = 1119443611
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("ul")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("um")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("uc")
	@ObfuscatedSignature(
		descriptor = "[Lwd;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("uu")
	@ObfuscatedGetter(
		intValue = 1610442037
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("us")
	@ObfuscatedGetter(
		intValue = 1200409791
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("uy")
	@ObfuscatedGetter(
		intValue = -399042659
	)
	static int field485;
	@ObfuscatedName("uo")
	@ObfuscatedGetter(
		intValue = 1646072177
	)
	static int field312;
	@ObfuscatedName("vk")
	@ObfuscatedGetter(
		intValue = -1166867281
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("vp")
	static boolean field578;
	@ObfuscatedName("vo")
	static boolean field543;
	@ObfuscatedName("vw")
	static boolean field580;
	@ObfuscatedName("vs")
	@ObfuscatedSignature(
		descriptor = "Luc;"
	)
	static class541 field581;
	@ObfuscatedName("ve")
	@ObfuscatedSignature(
		descriptor = "Lum;"
	)
	static class540 field582;
	@ObfuscatedName("vb")
	@ObfuscatedSignature(
		descriptor = "Lum;"
	)
	static class540 field583;
	@ObfuscatedName("vd")
	static boolean[] field584;
	@ObfuscatedName("vl")
	static int[] field585;
	@ObfuscatedName("wq")
	static int[] field586;
	@ObfuscatedName("wl")
	static int[] field587;
	@ObfuscatedName("wi")
	static int[] field588;
	@ObfuscatedName("we")
	@ObfuscatedGetter(
		intValue = 1454406263
	)
	static int field589;
	@ObfuscatedName("wn")
	@ObfuscatedGetter(
		intValue = 1375092225
	)
	static int field590;
	@ObfuscatedName("wx")
	@ObfuscatedSignature(
		descriptor = "Luz;"
	)
	static class537 field499;
	@ObfuscatedName("wj")
	@ObfuscatedSignature(
		descriptor = "Lso;"
	)
	static class480 field592;
	@ObfuscatedName("wf")
	static List field593;
	@ObfuscatedName("wc")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("wg")
	@ObfuscatedGetter(
		intValue = 2034510043
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("wk")
	@ObfuscatedGetter(
		intValue = -892585083
	)
	static int field309;
	@ObfuscatedName("wp")
	static int[] field597;
	@ObfuscatedName("wh")
	static int[] field610;
	@ObfuscatedName("wv")
	@Export("token")
	String token;
	@ObfuscatedName("wm")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	@Export("asyncRestClient")
	AsyncRestClient asyncRestClient;
	@ObfuscatedName("wz")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	@Export("asyncGameSessionTokenResponse")
	AsyncHttpResponse asyncGameSessionTokenResponse;
	@ObfuscatedName("wu")
	@Export("otlTokenRequester")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/OtlTokenRequester;"
	)
	OtlTokenRequester otlTokenRequester;
	@ObfuscatedName("wy")
	@Export("otlTokenRequestFuture")
	Future otlTokenRequestFuture;
	@ObfuscatedName("wd")
	@Export("https")
	boolean https;
	@ObfuscatedName("wa")
	@ObfuscatedGetter(
		intValue = 1174170739
	)
	@Export("clientId")
	int clientId;
	@ObfuscatedName("wb")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	@Export("asyncAccessTokenResponse")
	AsyncHttpResponse asyncAccessTokenResponse;
	@ObfuscatedName("wo")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	@Export("refreshAccessTokenRequester")
	RefreshAccessTokenRequester refreshAccessTokenRequester;
	@ObfuscatedName("xz")
	@Export("refreshAccessTokenRequestFuture")
	Future refreshAccessTokenRequestFuture;
	@ObfuscatedName("xy")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	Buffer field609;
	@ObfuscatedName("xs")
	@ObfuscatedSignature(
		descriptor = "Lam;"
	)
	class7 field544;
	@ObfuscatedName("xg")
	@ObfuscatedGetter(
		longValue = -2719469319638350901L
	)
	@Export("accountHash")
	long accountHash;

	static {
		packetWriter = new PacketWriter();
		field307 = new class279();
		int var2 = "com_jagex_auth_desktop_osrs:public".length();
		byte[] var3 = new byte[var2];

		int var4;
		char var11;
		for (var4 = 0; var4 < var2; ++var4) {
			var11 = "com_jagex_auth_desktop_osrs:public".charAt(var4);
			if (var11 > 127) {
				var3[var4] = 63;
			} else {
				var3[var4] = (byte)var11;
			}
		}

		byte[] var10 = var3;
		var4 = var3.length;
		StringBuilder var5 = new StringBuilder();

		int var6;
		int var7;
		int var8;
		int var9;
		for (var6 = 0; var6 < var4 + 0; var6 += 3) {
			var7 = var10[var6] & 255;
			var5.append(class437.field4937[var7 >>> 2]);
			if (var6 < var4 - 1) {
				var8 = var10[var6 + 1] & 255;
				var5.append(class437.field4937[(var7 & 3) << 4 | var8 >>> 4]);
				if (var6 < var4 - 2) {
					var9 = var10[var6 + 2] & 255;
					var5.append(class437.field4937[(var8 & 15) << 2 | var9 >>> 6]).append(class437.field4937[var9 & 63]);
				} else {
					var5.append(class437.field4937[(var8 & 15) << 2]).append("=");
				}
			} else {
				var5.append(class437.field4937[(var7 & 3) << 4]).append("==");
			}
		}

		String var12 = var5.toString();
		BASIC_AUTH_DESKTOP_OSRS = var12;
		var2 = "com_jagex_auth_desktop_runelite:public".length();
		var3 = new byte[var2];

		for (var4 = 0; var4 < var2; ++var4) {
			var11 = "com_jagex_auth_desktop_runelite:public".charAt(var4);
			if (var11 > 127) {
				var3[var4] = 63;
			} else {
				var3[var4] = (byte)var11;
			}
		}

		var10 = var3;
		var4 = var3.length;
		var5 = new StringBuilder();

		for (var6 = 0; var6 < var4 + 0; var6 += 3) {
			var7 = var10[var6] & 255;
			var5.append(class437.field4937[var7 >>> 2]);
			if (var6 < var4 - 1) {
				var8 = var10[var6 + 1] & 255;
				var5.append(class437.field4937[(var7 & 3) << 4 | var8 >>> 4]);
				if (var6 < var4 - 2) {
					var9 = var10[var6 + 2] & 255;
					var5.append(class437.field4937[(var8 & 15) << 2 | var9 >>> 6]).append(class437.field4937[var9 & 63]);
				} else {
					var5.append(class437.field4937[(var8 & 15) << 2]).append("=");
				}
			} else {
				var5.append(class437.field4937[(var7 & 3) << 4]).append("==");
			}
		}

		var12 = var5.toString();
		BASIC_AUTH_DESKTOP_RUNELITE = var12;
		field524 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
		playerAppearance = new PlayerComposition();
		field533 = new ApproximateRouteStrategy();
		field329 = true;
		worldId = 1;
		isMembersWorld = false;
		field434 = 0;
		gameState = 0;
		cycle = 0;
		authenticationScheme = AuthenticationScheme.USERNAME_PASSWORD;
		field438 = class584.field5746;
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
		field332 = 0;
		showLoadingMessages = true;
		localPlayerIndex = -1;
		field335 = 0;
		field336 = "";
		field337 = -1;
		field338 = -1;
		field339 = -1;
		renderSelf = true;
		drawPlayerNames = 0;
		currentLevels = new int[25];
		levels = new int[25];
		experience = new int[25];
		field345 = new int[25];
		followerOpsLowPriority = false;
		showMouseOverText = true;
		isItemSelected = 0;
		viewportWidget = null;
		field398 = 0L;
		isResizable = true;
		field352 = 600;
		revision = field352 / GameEngine.cycleDurationMillis;
		indexCheck = new IndexCheck();
		field491 = new class269();
		currentClanSettings = new ClanSettings[4];
		currentClanChannels = new ClanChannel[4];
		field358 = 256;
		field359 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field362 = 1;
		field363 = 32767;
		field364 = 1;
		field365 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		field373 = -1;
		field346 = -1;
		field375 = 30;
		worldProperties = 0;
		gameBuild = 0;
		isLowDetail = false;
		field379 = -1;
		clientType = -1;
		field381 = -1;
		onMobile = false;
		isLoading = true;
		serverCycle = 0;
		mouseLastLastPressedTimeMillis = 1L;
		field386 = -1;
		field412 = -1;
		field305 = -1L;
		hadFocus = true;
		rebootTimer = 0;
		z = false;
		field392 = class70.field978;
		js5ConnectState = 0;
		field394 = 0;
		js5Errors = 0;
		field396 = 0;
		field397 = 0;
		field503 = 0;
		logoutTimer = 0;
		field591 = 0;
		field325 = 1;
		field576 = 0;
		field403 = 1;
		field404 = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		mouseCamClickedX = 0;
		mouseCamClickedY = 0;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field413 = 0;
		field414 = -1;
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
		field427 = new NodeDeque();
		widgetFlags = new NodeHashTable(512);
		publicChatMode = 0;
		tradeChatMode = 0;
		field431 = "";
		field432 = 0;
		field360 = new int[128];
		field425 = new int[128];
		field435 = -1L;
		playingJingle = false;
		isCameraLocked = false;
		field459 = false;
		DBTableIndex_cache = new EvictingDualNodeHashTable(64);
		archive11 = new EvictingDualNodeHashTable(64);
		field441 = false;
		field442 = false;
		field443 = false;
		field444 = false;
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
		field457 = new int[4];
		randomDatData = null;
		npcCount = 0;
		npcIndices = new int[250];
		hadNetworkError = false;
		timer = new Timer();
		field463 = new int[4][13][13];
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		field405 = -1;
		graphicsCycle = 0;
		field451 = 2301979;
		field448 = 5063219;
		field328 = 3353893;
		field471 = 7759444;
		field472 = false;
		alternativeScrollbarWidth = 0;
		field474 = 0;
		field475 = 0;
		field424 = 0;
		field477 = 0;
		field478 = false;
		field479 = 0;
		field480 = false;
		field481 = 0;
		overheadTextCount = 0;
		overheadTextLimit = 50;
		overheadTextXs = new int[overheadTextLimit];
		overheadTextYs = new int[overheadTextLimit];
		overheadTextAscents = new int[overheadTextLimit];
		overheadTextXOffsets = new int[overheadTextLimit];
		overheadTextColors = new int[overheadTextLimit];
		overheadTextEffects = new int[overheadTextLimit];
		field490 = new int[overheadTextLimit][];
		overheadTextCyclesRemaining = new int[overheadTextLimit];
		overheadText = new String[overheadTextLimit];
		viewportDrawCount = 0;
		viewportTempX = -1;
		viewportTempY = -1;
		mouseCrossX = 0;
		mouseCrossY = 0;
		mouseCrossState = 0;
		mouseCrossColor = 0;
		userId = -1L;
		userHash = -1L;
		field527 = 0;
		field429 = 0;
		field387 = 0;
		field506 = 0;
		field507 = new int[1000];
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
		field518 = 0;
		field519 = 50;
		field520 = null;
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
		field532 = false;
		field371 = -1;
		field568 = -1;
		field535 = false;
		field536 = -1;
		field537 = -1;
		isDraggingWidget = false;
		changedVarps = new int[32];
		changedVarpCount = 0;
		changedItemContainers = new int[32];
		changedItemsCount = 0;
		changedSkills = new int[32];
		changedSkillsCount = 0;
		field545 = new int[32];
		field388 = 0;
		field534 = 0;
		field548 = 0;
		field549 = 0;
		field550 = 0;
		field611 = 0;
		field552 = 0;
		field553 = 0;
		field554 = new class598();
		rootWidgetCount = 0;
		field556 = -2;
		validRootWidgets = new boolean[100];
		field558 = new boolean[100];
		field559 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field565 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		crossWorldMessageIds = new long[100];
		crossWorldMessageIdsIndex = 0;
		field347 = -1;
		mapIconCount = 0;
		mapIconXs = new int[1000];
		mapIconYs = new int[1000];
		mapIcons = new SpritePixels[1000];
		destinationX = 0;
		destinationY = 0;
		field485 = -1;
		field312 = 0;
		minimapState = 0;
		field578 = false;
		field543 = false;
		field580 = false;
		field581 = null;
		field582 = null;
		field583 = null;
		field584 = new boolean[5];
		field585 = new int[5];
		field586 = new int[5];
		field587 = new int[5];
		field588 = new int[5];
		field589 = -1;
		field590 = -1;
		field499 = new DesktopPlatformInfoProvider();
		field592 = new class480(8, class478.field5146);
		field593 = new ArrayList();
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field309 = 0;
		field597 = new int[50];
		field610 = new int[50];
		class574.field5666 = 231;
	}

	public Client() {
		this.https = false;
		this.clientId = 0;
		this.accountHash = -1L;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "13"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field398 = class180.method3973() + 500L;
		this.resizeJS();
		if (rootInterface != -1) {
			this.method795(true);
		}

	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1154613150"
	)
	@Export("setUp")
	protected final void setUp() {
		int[] var1 = new int[]{20, 260, 10000};
		int[] var2 = new int[]{1000, 100, 500};
		if (var1 != null && var2 != null) {
			class63.ByteArrayPool_alternativeSizes = var1;
			WorldMapDecoration.ByteArrayPool_altSizeArrayCounts = new int[var1.length];
			PlayerUpdateManager.ByteArrayPool_arrays = new byte[var1.length][][];

			for (int var3 = 0; var3 < class63.ByteArrayPool_alternativeSizes.length; ++var3) {
				PlayerUpdateManager.ByteArrayPool_arrays[var3] = new byte[var2[var3]][];
				ByteArrayPool.field5120.add(var1[var3]);
			}

			Collections.sort(ByteArrayPool.field5120);
		} else {
			class63.ByteArrayPool_alternativeSizes = null;
			WorldMapDecoration.ByteArrayPool_altSizeArrayCounts = null;
			PlayerUpdateManager.ByteArrayPool_arrays = null;
			class329.method6845();
		}

		MusicPatch.field3774 = UrlRequest.method3377(worldProperties, class571.field5627);
		class30.worldPort = gameBuild == 0 ? 43594 : worldId + 40000;
		class338.js5Port = gameBuild == 0 ? 443 : worldId + 50000;
		FloatProjection.currentPort = class30.worldPort;
		PlayerComposition.field3909 = class368.field3952;
		PlayerComposition.field3905 = class368.field3958;
		PlayerComposition.field3916 = class368.field3953;
		PlayerComposition.field3914 = class368.field3955;
		class167.urlRequester = new SecureUrlRequester(this.https, 231);
		this.setUpKeyboard();
		this.setUpMouse();
		World.mouseWheel = this.mouseWheel();
		this.method496(field491, 0);
		this.method496(indexCheck, 1);
		this.setUpClipboard();
		Varps.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 750000);
		AccessFile var4 = null;
		ClientPreferences var5 = new ClientPreferences();

		try {
			var4 = HealthBarConfig.getPreferencesFile("", FontName.field5530.name, false);
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

		ClientPacket.clientPreferences = var5;
		String var12 = GameEngine.field192;
		class31.field151 = this;
		if (var12 != null) {
			class31.field155 = var12;
		}

		DefaultsGroup.setWindowedMode(ClientPacket.clientPreferences.getWindowMode());
		Actor.friendSystem = new FriendSystem(AbstractUserComparator.loginType);
		this.asyncRestClient = new AsyncRestClient("tokenRequest", 1, 1);
		class63.method2105(this);
		field307.method6122();
		ModelData var13 = new ModelData(3, 1, 0);
		var13.method4890(-64, -8, 64);
		var13.method4890(64, -8, 64);
		var13.method4890(0, -8, -24);
		var13.method4891(0, 2, 1, (byte)1, (byte)-1, (short)10173, (short)-1);
		class27.field130 = var13.toModel(1, 32, 0, -128, 0);
		class107.field1390 = var13.toModel(64, 850, -30, -50, -30);
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-4"
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
				boolean var4 = Huffman.method7174();
				if (var4 && playingJingle && ClientPreferences.pcmPlayer1 != null) {
					ClientPreferences.pcmPlayer1.tryDiscard();
				}

				MusicPatchNode2.method6884();
				indexCheck.method5921();
				this.method526();
				class6.method33();
				if (World.mouseWheel != null) {
					int var5 = World.mouseWheel.useRotation();
					mouseWheelRotation = var5;
				}

				if (gameState == 0) {
					class190.method4136();
					FontName.method10484();
				} else if (gameState == 5) {
					HorizontalAlignment.loginScreen(this, class290.fontPlain11, Tile.fontPlain12);
					class190.method4136();
					FontName.method10484();
				} else if (gameState != 10 && gameState != 11) {
					if (gameState == 20) {
						HorizontalAlignment.loginScreen(this, class290.fontPlain11, Tile.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState == 50) {
						HorizontalAlignment.loginScreen(this, class290.fontPlain11, Tile.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState == 25) {
						if (field441) {
							class107.loadRegion();
						}

						if (field442) {
							class148.method3653(PlayerCompositionColorTextureOverride.field3434);
						}

						if (!field442 && !field441) {
							HealthBarConfig.updateGameState(30);
						}
					}
				} else {
					HorizontalAlignment.loginScreen(this, class290.fontPlain11, Tile.fontPlain12);
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

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-777762887"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		if ((gameState == 10 || gameState == 20 || gameState == 30) && field398 != 0L && class180.method3973() > field398) {
			DefaultsGroup.setWindowedMode(DirectByteArrayCopier.getWindowedMode());
		}

		int var2;
		if (var1) {
			for (var2 = 0; var2 < 100; ++var2) {
				validRootWidgets[var2] = true;
			}
		}

		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1, class311.field3348);
		} else if (gameState == 5) {
			class464.drawTitle(Friend.fontBold12, class290.fontPlain11, Tile.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				class464.drawTitle(Friend.fontBold12, class290.fontPlain11, Tile.fontPlain12);
			} else if (gameState == 50) {
				class464.drawTitle(Friend.fontBold12, class290.fontPlain11, Tile.fontPlain12);
			} else if (gameState == 25) {
				if (field404 == 1) {
					if (field591 > field325) {
						field325 = field591;
					}

					var2 = (field325 * 50 - field591 * 50) / field325;
					class391.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
				} else if (field404 == 2) {
					if (field576 > field403) {
						field403 = field576;
					}

					var2 = (field403 * 50 - field576 * 50) / field403 + 50;
					class391.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
				} else {
					class391.drawLoadingMessage("Loading - please wait.", false);
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				class391.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) {
				class391.drawLoadingMessage("Please wait...", false);
			}
		} else {
			class464.drawTitle(Friend.fontBold12, class290.fontPlain11, Tile.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				if (field558[var2]) {
					ArchiveDiskActionHandler.rasterProvider.draw(rootWidgetXs[var2], rootWidgetYs[var2], rootWidgetWidths[var2], rootWidgetHeights[var2]);
					field558[var2] = false;
				}
			}
		} else if (gameState > 0) {
			ArchiveDiskActionHandler.rasterProvider.drawFull(0, 0);

			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				field558[var2] = false;
			}
		}

	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1358247604"
	)
	@Export("kill0")
	protected final void kill0() {
		if (class339.varcs != null && class339.varcs.hasUnwrittenChanges()) {
			class339.varcs.write();
		}

		if (class328.mouseRecorder != null) {
			class328.mouseRecorder.isRunning = false;
		}

		class328.mouseRecorder = null;
		packetWriter.close();
		if (MouseHandler.MouseHandler_instance != null) {
			synchronized(MouseHandler.MouseHandler_instance) {
				MouseHandler.MouseHandler_instance = null;
			}
		}

		World.mouseWheel = null;
		if (ClientPreferences.pcmPlayer1 != null) {
			ClientPreferences.pcmPlayer1.shutdown();
		}

		class330.field3669.method8174();
		class300.method6624();
		if (class167.urlRequester != null) {
			class167.urlRequester.close();
			class167.urlRequester = null;
		}

		class172.method3903();
		this.asyncRestClient.shutdown();
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "128"
	)
	protected final void vmethod1421() {
	}

	@ObfuscatedName("pk")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1463602799"
	)
	@Export("isRuneLite")
	boolean isRuneLite() {
		return this.clientId == 1;
	}

	@ObfuscatedName("pv")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1577261101"
	)
	@Export("containsAccessAndRefreshToken")
	boolean containsAccessAndRefreshToken() {
		return accessToken != null && !accessToken.trim().isEmpty() && class150.refreshToken != null && !class150.refreshToken.trim().isEmpty();
	}

	@ObfuscatedName("py")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-127"
	)
	@Export("containsSessionAndCharacterId")
	boolean containsSessionAndCharacterId() {
		return SecureUrlRequester.sessionId != null && !SecureUrlRequester.sessionId.trim().isEmpty() && IntProjection.characterId != null && !IntProjection.characterId.trim().isEmpty();
	}

	@ObfuscatedName("pe")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "268272057"
	)
	@Export("otlTokenRequesterInitialized")
	boolean otlTokenRequesterInitialized() {
		return this.otlTokenRequester != null;
	}

	@ObfuscatedName("px")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1902490506"
	)
	@Export("requestRefreshAccessToken")
	void requestRefreshAccessToken(String var1) throws IOException {
		HashMap var2 = new HashMap();
		var2.put("grant_type", "refresh_token");
		var2.put("scope", "gamesso.token.create");
		var2.put("refresh_token", var1);
		URL var3 = new URL(class464.authServiceBaseUrl + "shield/oauth/token" + (new HttpQueryParams(var2)).encode());
		HttpHeaders var4 = new HttpHeaders();
		if (this.isRuneLite()) {
			var4.basicAuthentication(BASIC_AUTH_DESKTOP_RUNELITE);
		} else {
			var4.basicAuthentication(BASIC_AUTH_DESKTOP_OSRS);
		}

		var4.header("Host", (new URL(class464.authServiceBaseUrl)).getHost());
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

	@ObfuscatedName("pu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-405727278"
	)
	@Export("requestOtlToken")
	void requestOtlToken(String var1) throws IOException {
		URL var2 = new URL(class464.authServiceBaseUrl + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
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

	@ObfuscatedName("pz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1803293038"
	)
	@Export("authenticate")
	void authenticate(String var1, String var2) throws IOException, JSONException {
		URL var3 = new URL(class154.gameSessionServiceBaseUrl + "game-session/v1/tokens");
		HttpRequest var4 = new HttpRequest(var3, HttpMethod.POST, this.https);
		var4.getHeaders().bearerToken(var1);
		var4.getHeaders().accept(HttpContentType.APPLICATION_JSON);
		JSONObject var5 = new JSONObject();
		var5.setProperty("accountId", var2);
		var4.setPayload(new HttpJsonRequestBody(var5));
		this.asyncGameSessionTokenResponse = this.asyncRestClient.submitRequest(var4);
	}

	@ObfuscatedName("pg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-67"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			boolean var1 = class330.field3669.method8166();
			if (!var1) {
				this.method779();
			}

		}
	}

	@ObfuscatedName("ps")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "6"
	)
	void method779() {
		if (class330.field3669.field4783 >= 4) {
			this.error("js5crc");
			HealthBarConfig.updateGameState(1000);
		} else {
			if (class330.field3669.field4774 >= 4) {
				if (gameState <= 5) {
					this.error("js5io");
					HealthBarConfig.updateGameState(1000);
					return;
				}

				field394 = 3000;
				class330.field3669.field4774 = 3;
			}

			if (--field394 + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						InvDefinition.js5SocketTask = GameEngine.taskHandler.newSocketTask(RouteStrategy.worldHost, FloatProjection.currentPort);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (InvDefinition.js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (InvDefinition.js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						AsyncRestClient.js5Socket = class404.method8066((Socket)InvDefinition.js5SocketTask.result, 40000, 5000);
						Buffer var1 = new Buffer(class328.field3647.field3656 + 1);
						var1.writeByte(class328.field3647.field3658);
						var1.writeInt(231);
						var1.writeInt(field457[0]);
						var1.writeInt(field457[1]);
						var1.writeInt(field457[2]);
						var1.writeInt(field457[3]);
						AsyncRestClient.js5Socket.write(var1.array, 0, class328.field3647.field3656 + 1);
						++js5ConnectState;
						class384.field4233 = class180.method3973();
					}

					if (js5ConnectState == 3) {
						if (AsyncRestClient.js5Socket.available() > 0) {
							int var2 = AsyncRestClient.js5Socket.readUnsignedByte();
							if (var2 != 0) {
								this.js5Error(var2);
								return;
							}

							++js5ConnectState;
						} else if (class180.method3973() - class384.field4233 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						class330.field3669.method8184(AsyncRestClient.js5Socket, gameState > 20);
						InvDefinition.js5SocketTask = null;
						AsyncRestClient.js5Socket = null;
						js5ConnectState = 0;
						js5Errors = 0;
					}
				} catch (IOException var3) {
					this.js5Error(-3);
				}

			}
		}
	}

	@ObfuscatedName("pm")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-536944763"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		InvDefinition.js5SocketTask = null;
		AsyncRestClient.js5Socket = null;
		js5ConnectState = 0;
		if (FloatProjection.currentPort == class30.worldPort) {
			FloatProjection.currentPort = class338.js5Port;
		} else {
			FloatProjection.currentPort = class30.worldPort;
		}

		++js5Errors;
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) {
			if (gameState <= 5) {
				this.error("js5connect_full");
				HealthBarConfig.updateGameState(1000);
			} else {
				field394 = 3000;
			}
		} else if (js5Errors >= 2 && var1 == 6) {
			this.error("js5connect_outofdate");
			HealthBarConfig.updateGameState(1000);
		} else if (js5Errors >= 4) {
			if (gameState <= 5) {
				this.error("js5connect");
				HealthBarConfig.updateGameState(1000);
			} else {
				field394 = 3000;
			}
		}

	}

	@ObfuscatedName("pr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "21320804"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		AbstractSocket var1 = packetWriter.getSocket();
		PacketBuffer var2 = packetWriter.packetBuffer;

		try {
			if (LoginState.SHUTDOWN_PREVIOUS_CONNECTION == class172.loginState) {
				if (ChatChannel.field831 == null && (secureRandomFuture.isDone() || field396 > 250)) {
					ChatChannel.field831 = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (ChatChannel.field831 != null) {
					if (var1 != null) {
						var1.close();
						var1 = null;
					}

					MouseRecorder.field909 = null;
					hadNetworkError = false;
					field396 = 0;
					if (field438.method11148()) {
						if (this.containsAccessAndRefreshToken()) {
							try {
								this.requestRefreshAccessToken(class150.refreshToken);
								WorldMapIcon_1.updateLoginState(LoginState.TOKEN_RESPONSE);
							} catch (Throwable var22) {
								class569.RunException_sendStackTrace((String)null, var22);
								AddRequestTask.getLoginError(65);
								return;
							}
						} else {
							if (!this.containsSessionAndCharacterId()) {
								AddRequestTask.getLoginError(65);
								return;
							}

							try {
								this.authenticate(SecureUrlRequester.sessionId, IntProjection.characterId);
								WorldMapIcon_1.updateLoginState(LoginState.REFRESHING_TOKEN);
							} catch (Exception var21) {
								class569.RunException_sendStackTrace((String)null, var21);
								AddRequestTask.getLoginError(65);
								return;
							}
						}
					} else {
						WorldMapIcon_1.updateLoginState(LoginState.INIT_MOUSEHANDLER_SOCKET);
					}
				}
			}

			HttpResponse var24;
			if (class172.loginState == LoginState.TOKEN_RESPONSE) {
				if (this.refreshAccessTokenRequestFuture != null) {
					if (!this.refreshAccessTokenRequestFuture.isDone()) {
						return;
					}

					if (this.refreshAccessTokenRequestFuture.isCancelled()) {
						AddRequestTask.getLoginError(65);
						this.refreshAccessTokenRequestFuture = null;
						return;
					}

					try {
						RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.refreshAccessTokenRequestFuture.get();
						if (!var3.isSuccess()) {
							AddRequestTask.getLoginError(65);
							this.refreshAccessTokenRequestFuture = null;
							return;
						}

						accessToken = var3.getAccessToken();
						class150.refreshToken = var3.getRefreshToken();
						this.refreshAccessTokenRequestFuture = null;
					} catch (Exception var20) {
						class569.RunException_sendStackTrace((String)null, var20);
						AddRequestTask.getLoginError(65);
						this.refreshAccessTokenRequestFuture = null;
						return;
					}
				} else {
					if (this.asyncAccessTokenResponse == null) {
						AddRequestTask.getLoginError(65);
						return;
					}

					if (!this.asyncAccessTokenResponse.hasFinished()) {
						return;
					}

					if (this.asyncAccessTokenResponse.hasError()) {
						class569.RunException_sendStackTrace(this.asyncAccessTokenResponse.getErrorMessage(), (Throwable)null);
						AddRequestTask.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}

					var24 = this.asyncAccessTokenResponse.await();
					if (var24.getResponseCode() != 200) {
						AddRequestTask.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}

					field396 = 0;
					HttpJsonRequestBody var4 = new HttpJsonRequestBody(var24.getResponseBody());

					try {
						accessToken = var4.getBody().getString("access_token");
						class150.refreshToken = var4.getBody().getString("refresh_token");
					} catch (Exception var19) {
						class569.RunException_sendStackTrace("Error parsing tokens", var19);
						AddRequestTask.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}
				}

				this.requestOtlToken(accessToken);
				WorldMapIcon_1.updateLoginState(LoginState.REFRESHING_TOKEN);
			}

			if (class172.loginState == LoginState.REFRESHING_TOKEN) {
				if (this.otlTokenRequestFuture != null) {
					if (!this.otlTokenRequestFuture.isDone()) {
						return;
					}

					if (this.otlTokenRequestFuture.isCancelled()) {
						AddRequestTask.getLoginError(65);
						this.otlTokenRequestFuture = null;
						return;
					}

					try {
						OtlTokenResponse var25 = (OtlTokenResponse)this.otlTokenRequestFuture.get();
						if (!var25.isSuccess()) {
							AddRequestTask.getLoginError(65);
							this.otlTokenRequestFuture = null;
							return;
						}

						this.token = var25.getToken();
						this.otlTokenRequestFuture = null;
					} catch (Exception var18) {
						class569.RunException_sendStackTrace((String)null, var18);
						AddRequestTask.getLoginError(65);
						this.otlTokenRequestFuture = null;
						return;
					}
				} else {
					if (this.asyncGameSessionTokenResponse == null) {
						AddRequestTask.getLoginError(65);
						return;
					}

					if (!this.asyncGameSessionTokenResponse.hasFinished()) {
						return;
					}

					if (this.asyncGameSessionTokenResponse.hasError()) {
						class569.RunException_sendStackTrace(this.asyncGameSessionTokenResponse.getErrorMessage(), (Throwable)null);
						AddRequestTask.getLoginError(65);
						this.asyncGameSessionTokenResponse = null;
						return;
					}

					var24 = this.asyncGameSessionTokenResponse.await();
					if (var24.getResponseCode() != 200) {
						class569.RunException_sendStackTrace("Login authentication error. Response code: " + var24.getResponseCode() + " " + var24.method294() + " Response body: " + var24.getResponseBody(), (Throwable)null);
						AddRequestTask.getLoginError(65);
						this.asyncGameSessionTokenResponse = null;
						return;
					}

					List var26 = (List)var24.getHeaderFields().get("Content-Type");
					if (var26 != null && var26.contains(HttpContentType.APPLICATION_JSON.getValue())) {
						try {
							JSONObject var5 = new JSONObject(var24.getResponseBody());
							this.token = var5.getString("token");
						} catch (JSONException var17) {
							class569.RunException_sendStackTrace((String)null, var17);
							AddRequestTask.getLoginError(65);
							this.asyncGameSessionTokenResponse = null;
							return;
						}
					} else {
						this.token = var24.getResponseBody();
					}

					this.asyncGameSessionTokenResponse = null;
				}

				field396 = 0;
				WorldMapIcon_1.updateLoginState(LoginState.INIT_MOUSEHANDLER_SOCKET);
			}

			if (LoginState.INIT_MOUSEHANDLER_SOCKET == class172.loginState) {
				if (MouseRecorder.field909 == null) {
					MouseRecorder.field909 = GameEngine.taskHandler.newSocketTask(RouteStrategy.worldHost, FloatProjection.currentPort);
				}

				if (MouseRecorder.field909.status == 2) {
					throw new IOException();
				}

				if (MouseRecorder.field909.status == 1) {
					var1 = class404.method8066((Socket)MouseRecorder.field909.result, 40000, 5000);
					packetWriter.setSocket(var1);
					MouseRecorder.field909 = null;
					WorldMapIcon_1.updateLoginState(LoginState.UNMAPPED_20);
				}
			}

			PacketBufferNode var28;
			if (class172.loginState == LoginState.UNMAPPED_20) {
				packetWriter.clearBuffer();
				var28 = class273.method5999();
				var28.clientPacket = null;
				var28.clientPacketLength = 0;
				var28.packetBuffer = new PacketBuffer(5000);
				var28.packetBuffer.writeByte(class328.field3657.field3658);
				packetWriter.addNode(var28);
				packetWriter.flush();
				var2.offset = 0;
				WorldMapIcon_1.updateLoginState(LoginState.READ_LOGIN_STATUS);
			}

			int var13;
			if (class172.loginState == LoginState.READ_LOGIN_STATUS) {
				if (ClientPreferences.pcmPlayer1 != null) {
					ClientPreferences.pcmPlayer1.method2913();
				}

				if (var1.isAvailable(1)) {
					var13 = var1.readUnsignedByte();
					if (ClientPreferences.pcmPlayer1 != null) {
						ClientPreferences.pcmPlayer1.method2913();
					}

					if (var13 != 0) {
						AddRequestTask.getLoginError(var13);
						return;
					}

					var2.offset = 0;
					WorldMapIcon_1.updateLoginState(LoginState.READ_RANDOM_VERIFICATION_NUMBER);
				}
			}

			if (LoginState.READ_RANDOM_VERIFICATION_NUMBER == class172.loginState) {
				if (var2.offset < 8) {
					var13 = var1.available();
					if (var13 > 8 - var2.offset) {
						var13 = 8 - var2.offset;
					}

					if (var13 > 0) {
						var1.read(var2.array, var2.offset, var13);
						var2.offset += var13;
					}
				}

				if (var2.offset == 8) {
					var2.offset = 0;
					ClanSettings.field1809 = var2.readLong();
					WorldMapIcon_1.updateLoginState(LoginState.WRITE_INITIAL_LOGIN_PACKET);
				}
			}

			if (LoginState.WRITE_INITIAL_LOGIN_PACKET == class172.loginState) {
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var27 = new PacketBuffer(500);
				int[] var30 = new int[]{ChatChannel.field831.nextInt(), ChatChannel.field831.nextInt(), ChatChannel.field831.nextInt(), ChatChannel.field831.nextInt()};
				var27.offset = 0;
				var27.writeByte(1);
				var27.writeInt(var30[0]);
				var27.writeInt(var30[1]);
				var27.writeInt(var30[2]);
				var27.writeInt(var30[3]);
				var27.writeLong(ClanSettings.field1809);
				if (gameState == 40) {
					var27.writeInt(field457[0]);
					var27.writeInt(field457[1]);
					var27.writeInt(field457[2]);
					var27.writeInt(field457[3]);
				} else {
					if (gameState == 50) {
						var27.writeByte(AuthenticationScheme.field1692.rsOrdinal());
						var27.writeInt(LoginPacket.field1705);
					} else {
						var27.writeByte(authenticationScheme.rsOrdinal());
						switch(authenticationScheme.schemeId) {
						case 0:
						case 4:
							var27.writeMedium(PcmPlayer.otpMedium);
							++var27.offset;
							break;
						case 1:
							var27.writeInt(ClientPacket.clientPreferences.getParameterValue(Login.Login_username));
							break;
						case 2:
							var27.offset += 4;
						case 3:
						}
					}

					if (field438.method11148()) {
						var27.writeByte(class584.field5748.rsOrdinal());
						var27.writeStringCp1252NullTerminated(this.token);
					} else {
						var27.writeByte(class584.field5746.rsOrdinal());
						var27.writeStringCp1252NullTerminated(Login.Login_password);
					}
				}

				var27.encryptRsa(class51.field726, class51.field730);
				field457 = var30;
				PacketBufferNode var6 = class273.method5999();
				var6.clientPacket = null;
				var6.clientPacketLength = 0;
				var6.packetBuffer = new PacketBuffer(5000);
				var6.packetBuffer.offset = 0;
				if (gameState == 40) {
					var6.packetBuffer.writeByte(class328.field3646.field3658);
				} else {
					var6.packetBuffer.writeByte(class328.field3655.field3658);
				}

				var6.packetBuffer.writeShort(0);
				int var7 = var6.packetBuffer.offset;
				var6.packetBuffer.writeInt(231);
				var6.packetBuffer.writeInt(1);
				var6.packetBuffer.writeByte(clientType);
				var6.packetBuffer.writeByte(field381);
				byte var8 = 0;
				var6.packetBuffer.writeByte(var8);
				var6.packetBuffer.writeBytes(var27.array, 0, var27.offset);
				int var9 = var6.packetBuffer.offset;
				var6.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var6.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var6.packetBuffer.writeShort(GameEngine.canvasWidth);
				var6.packetBuffer.writeShort(GameEngine.canvasHeight);
				class346.method7158(var6.packetBuffer);
				var6.packetBuffer.writeStringCp1252NullTerminated(ApproximateRouteStrategy.field267);
				var6.packetBuffer.writeInt(class134.field1582);
				var6.packetBuffer.writeByte(0);
				Buffer var10 = new Buffer(WorldMapArea.platformInfo.size());
				WorldMapArea.platformInfo.write(var10);
				var6.packetBuffer.writeBytes(var10.array, 0, var10.array.length);
				var6.packetBuffer.writeByte(clientType);
				var6.packetBuffer.writeInt(0);
				if (MusicPatch.field3774) {
					var6.packetBuffer.writeInt(ModeWhere.field4905.hash);
					var6.packetBuffer.writeIntIME(GrandExchangeOfferAgeComparator.archive8.hash);
					var6.packetBuffer.writeIntLE(WorldMapRectangle.field3283.hash);
					var6.packetBuffer.writeIntLE(class361.archive13.hash);
					var6.packetBuffer.writeIntLE(Varcs.field1254.hash);
					var6.packetBuffer.writeIntME(class150.field1717.hash);
					var6.packetBuffer.writeInt(class198.archive10.hash);
				} else {
					class47.method1845(var6);
				}

				var6.packetBuffer.xteaEncrypt(var30, var9, var6.packetBuffer.offset);
				var6.packetBuffer.writeLengthShort(var6.packetBuffer.offset - var7);
				packetWriter.addNode(var6);
				packetWriter.flush();
				packetWriter.isaacCipher = new IsaacCipher(var30);
				int[] var11 = new int[4];

				for (int var12 = 0; var12 < 4; ++var12) {
					var11[var12] = var30[var12] + 50;
				}

				var2.newIsaacCipher(var11);
				WorldMapIcon_1.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			int var14;
			if (LoginState.READ_CLIENT_INFO_STATUS == class172.loginState && var1.available() > 0) {
				var13 = var1.readUnsignedByte();
				if (var13 == 61) {
					var14 = var1.available();
					class435.field4926 = var14 == 1 && var1.readUnsignedByte() == 1;
					WorldMapIcon_1.updateLoginState(LoginState.WRITE_INITIAL_LOGIN_PACKET);
				}

				if (var13 == 21 && gameState == 20) {
					WorldMapIcon_1.updateLoginState(LoginState.READ_PROFILE_TRANSFER_TIME);
				} else if (var13 == 2) {
					if (MusicPatch.field3774) {
						WorldMapIcon_1.updateLoginState(LoginState.UNMAPPED_21);
					} else {
						WorldMapIcon_1.updateLoginState(LoginState.UNMAPPED);
					}
				} else if (var13 == 15 && gameState == 40) {
					packetWriter.serverPacketLength = -1;
					WorldMapIcon_1.updateLoginState(LoginState.UNMAPPED_19);
				} else if (var13 == 64) {
					WorldMapIcon_1.updateLoginState(LoginState.READ_STATE_11_PACKET_SIZE);
				} else if (var13 == 23 && field397 < 1) {
					++field397;
					WorldMapIcon_1.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				} else if (var13 == 29) {
					WorldMapIcon_1.updateLoginState(LoginState.UNMAPPED_17);
				} else {
					if (var13 != 69) {
						AddRequestTask.getLoginError(var13);
						return;
					}

					WorldMapIcon_1.updateLoginState(LoginState.READ_DIGEST_PARSER_PACKET_SIZE);
				}
			}

			if (LoginState.UNMAPPED_21 == class172.loginState) {
				class311.field3348 = true;
				InterfaceParent.method2108(class70.field963);
				HealthBarConfig.updateGameState(0);
			}

			if (class172.loginState == LoginState.READ_DIGEST_PARSER_PACKET_SIZE && var1.available() >= 2) {
				var1.read(var2.array, 0, 2);
				var2.offset = 0;
				class49.field709 = var2.readUnsignedShort();
				WorldMapIcon_1.updateLoginState(LoginState.SUBMIT_DIGEST_PARSER_TASK);
			}

			if (class172.loginState == LoginState.SUBMIT_DIGEST_PARSER_TASK && var1.available() >= class49.field709) {
				var2.offset = 0;
				var1.read(var2.array, var2.offset, class49.field709);
				class6 var29 = ModelData0.method5837()[var2.readUnsignedByte()];

				try {
					switch(var29.field13) {
					case 0:
						class0 var32 = new class0();
						this.field544 = new class7(var2, var32);
						WorldMapIcon_1.updateLoginState(LoginState.WRITE_DIGEST_PARSER_RESULT);
						break;
					default:
						throw new IllegalArgumentException();
					}
				} catch (Exception var16) {
					AddRequestTask.getLoginError(22);
					return;
				}
			}

			if (class172.loginState == LoginState.WRITE_DIGEST_PARSER_RESULT && this.field544.method56()) {
				this.field609 = this.field544.method58();
				this.field544.method45();
				this.field544 = null;
				if (this.field609 == null) {
					AddRequestTask.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				var28 = class273.method5999();
				var28.clientPacket = null;
				var28.clientPacketLength = 0;
				var28.packetBuffer = new PacketBuffer(5000);
				var28.packetBuffer.writeByte(class328.field3650.field3658);
				var28.packetBuffer.writeShort(this.field609.offset);
				var28.packetBuffer.writeBuffer(this.field609);
				packetWriter.addNode(var28);
				packetWriter.flush();
				this.field609 = null;
				WorldMapIcon_1.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			if (LoginState.READ_STATE_11_PACKET_SIZE == class172.loginState && var1.available() > 0) {
				MenuAction.field724 = var1.readUnsignedByte();
				WorldMapIcon_1.updateLoginState(LoginState.UNMAPPED_11);
			}

			if (class172.loginState == LoginState.UNMAPPED_11 && var1.available() >= MenuAction.field724) {
				var1.read(var2.array, 0, MenuAction.field724);
				var2.offset = 0;
				WorldMapIcon_1.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			if (LoginState.READ_PROFILE_TRANSFER_TIME == class172.loginState && var1.available() > 0) {
				field503 = (var1.readUnsignedByte() + 3) * 60;
				WorldMapIcon_1.updateLoginState(LoginState.PROFILE_TRANSFER);
			}

			if (class172.loginState == LoginState.PROFILE_TRANSFER) {
				field396 = 0;
				MenuAction.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field503 / 60 + " seconds.");
				if (--field503 <= 0) {
					WorldMapIcon_1.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				}

			} else if (class172.loginState == LoginState.READ_ACCOUNT_INFO_PACKET_SIZE) {
				var28 = class273.method5999();
				var28.clientPacket = null;
				var28.clientPacketLength = 0;
				var28.packetBuffer = new PacketBuffer(5000);
				var28.packetBuffer.writeByte(class328.field3653.field3658);
				var28.packetBuffer.writeShort(class328.field3653.field3656);
				var28.packetBuffer.writeInt(class225.field2457.hash);
				var28.packetBuffer.writeInt(0);
				var28.packetBuffer.writeIntME(class526.archive12.hash);
				var28.packetBuffer.writeIntIME(MusicPatchPcmStream.archive2.hash);
				var28.packetBuffer.writeIntLE(VerticalAlignment.archive9.hash);
				var28.packetBuffer.writeIntLE(AbstractByteArrayCopier.field3837.hash);
				var28.packetBuffer.writeInt(LoginState.field283.hash);
				var28.packetBuffer.writeInt(SoundCache.field1342.hash);
				var28.packetBuffer.writeInt(class107.field1386.hash);
				var28.packetBuffer.writeIntME(class330.archive4.hash);
				var28.packetBuffer.writeInt(WorldMapArea.field3181.hash);
				var28.packetBuffer.writeInt(class51.field728.hash);
				var28.packetBuffer.writeInt(class403.field4745.hash);
				var28.packetBuffer.writeIntME(class226.field2467.hash);
				var28.packetBuffer.writeIntME(ArchiveDiskAction.field4689.hash);
				var28.packetBuffer.writeIntLE(class217.archive6.hash);
				packetWriter.addNode(var28);
				packetWriter.flush();
				WorldMapIcon_1.updateLoginState(LoginState.UNMAPPED);
			} else {
				if (LoginState.UNMAPPED == class172.loginState && var1.available() >= 1) {
					class394.field4648 = var1.readUnsignedByte();
					if (class394.field4648 != class328.field3651.field3656) {
						AddRequestTask.getLoginError(class394.field4648);
						return;
					}

					WorldMapIcon_1.updateLoginState(LoginState.READ_ACCOUNT_INFO);
				}

				if (LoginState.READ_ACCOUNT_INFO == class172.loginState && var1.available() >= class394.field4648) {
					boolean var37 = var1.readUnsignedByte() == 1;
					var1.read(var2.array, 0, 4);
					var2.offset = 0;
					boolean var36 = false;
					if (var37) {
						var14 = var2.readByteIsaac() << 24;
						var14 |= var2.readByteIsaac() << 16;
						var14 |= var2.readByteIsaac() << 8;
						var14 |= var2.readByteIsaac();
						ClientPacket.clientPreferences.put(Login.Login_username, var14);
					}

					if (Login_isUsernameRemembered) {
						ClientPacket.clientPreferences.updateRememberedUsername(Login.Login_username);
					} else {
						ClientPacket.clientPreferences.updateRememberedUsername((String)null);
					}

					Messages.savePreferences();
					staffModLevel = var1.readUnsignedByte();
					playerMod = var1.readUnsignedByte() == 1;
					localPlayerIndex = var1.readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += var1.readUnsignedByte();
					field335 = var1.readUnsignedByte();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					this.accountHash = var2.readLong();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					userId = var2.readLong();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					userHash = var2.readLong();
					VarcInt.method4037().method4761(this.https);
					WorldMapIcon_1.updateLoginState(LoginState.SET_SERVER_PROTOCOL);
				}

				if (LoginState.SET_SERVER_PROTOCOL == class172.loginState && var1.available() >= packetWriter.serverPacketLength) {
					var1.read(var2.array, 0, 1);
					var2.offset = 0;
					if (var2.method10811()) {
						var1.read(var2.array, 1, 1);
						var2.offset = 0;
					}

					ServerPacket[] var31 = class275.ServerPacket_values();
					var14 = var2.readSmartByteShortIsaac();
					if (var14 < 0 || var14 >= var31.length) {
						throw new IOException("Invalid ServerProt: " + var14 + " at " + var2.offset);
					}

					packetWriter.serverPacket = var31[var14];
					packetWriter.serverPacketLength = packetWriter.serverPacket.length;
					var1.read(var2.array, 0, 2);
					var2.offset = 0;
					packetWriter.serverPacketLength = var2.readUnsignedShort();

					try {
						class26.method387(class36.client, "zap");
					} catch (Throwable var15) {
					}

					WorldMapIcon_1.updateLoginState(LoginState.UPDATE_PLAYER_AND_LOAD_REGIONS);
				}

				if (LoginState.UPDATE_PLAYER_AND_LOAD_REGIONS == class172.loginState) {
					if (var1.available() >= packetWriter.serverPacketLength) {
						var2.offset = 0;
						var1.read(var2.array, 0, packetWriter.serverPacketLength);
						timer.method7988();
						class6.method40();
						playerUpdateManager.updatePlayer(var2);
						field339 = localPlayerIndex;
						class330.field3670 = class379.USERNAME_PASSWORD;
						field338 = -1;
						HttpRequest.field52 = -1;
						SoundCache.loadRegions(false, var2);
						packetWriter.serverPacket = null;
						field443 = false;
					}

				} else {
					if (class172.loginState == LoginState.UNMAPPED_17 && var1.available() >= 2) {
						var2.offset = 0;
						var1.read(var2.array, 0, 2);
						var2.offset = 0;
						PendingSpawn.field992 = var2.readUnsignedShort();
						WorldMapIcon_1.updateLoginState(LoginState.UNMAPPED_18);
					}

					if (LoginState.UNMAPPED_18 == class172.loginState && var1.available() >= PendingSpawn.field992) {
						var2.offset = 0;
						var1.read(var2.array, 0, PendingSpawn.field992);
						var2.offset = 0;
						String var33 = var2.readStringCp1252NullTerminated();
						String var35 = var2.readStringCp1252NullTerminated();
						String var34 = var2.readStringCp1252NullTerminated();
						MenuAction.setLoginResponseString(var33, var35, var34);
						HealthBarConfig.updateGameState(10);
						if (field438.method11148()) {
							class85.method2689(9);
						}
					}

					if (LoginState.UNMAPPED_19 == class172.loginState) {
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
							var13 = packetWriter.serverPacketLength;
							timer.method7984();
							class63.method2101();
							playerUpdateManager.updatePlayer(var2);
							if (var13 != var2.offset) {
								throw new RuntimeException();
							}
						}
					} else {
						++field396;
						if (field396 > 2000) {
							if (field397 < 1) {
								if (class30.worldPort == FloatProjection.currentPort) {
									FloatProjection.currentPort = class338.js5Port;
								} else {
									FloatProjection.currentPort = class30.worldPort;
								}

								++field397;
								WorldMapIcon_1.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
							} else {
								AddRequestTask.getLoginError(-3);
							}
						}
					}
				}
			}
		} catch (IOException var23) {
			if (field397 < 1) {
				if (class30.worldPort == FloatProjection.currentPort) {
					FloatProjection.currentPort = class338.js5Port;
				} else {
					FloatProjection.currentPort = class30.worldPort;
				}

				++field397;
				WorldMapIcon_1.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
			} else {
				AddRequestTask.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("pj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1100399580"
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
			VarpDefinition.method3991();
		} else {
			if (!isMenuOpen) {
				class547.addCancelMenuEntry();
			}

			this.method790();
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
						PacketBufferNode var26;
						if (timer.field4652) {
							var26 = class139.getPacketBufferNode(ClientPacket.LOGIN_TIMINGS, packetWriter.isaacCipher);
							var26.packetBuffer.writeByte(0);
							int var27 = var26.packetBuffer.offset;
							timer.write(var26.packetBuffer);
							var26.packetBuffer.writeLengthByte(var26.packetBuffer.offset - var27);
							packetWriter.addNode(var26);
							timer.method7990();
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
						synchronized(class328.mouseRecorder.lock) {
							if (!field329) {
								class328.mouseRecorder.index = 0;
							} else if (MouseHandler.MouseHandler_lastButton != 0 || class328.mouseRecorder.index >= 40) {
								var46 = null;
								var3 = 0;
								var4 = 0;
								var5 = 0;
								var6 = 0;

								for (var7 = 0; var7 < class328.mouseRecorder.index && (var46 == null || var46.packetBuffer.offset - var3 < 246); ++var7) {
									var4 = var7;
									var8 = class328.mouseRecorder.ys[var7];
									if (var8 < -1) {
										var8 = -1;
									} else if (var8 > 65534) {
										var8 = 65534;
									}

									var9 = class328.mouseRecorder.xs[var7];
									if (var9 < -1) {
										var9 = -1;
									} else if (var9 > 65534) {
										var9 = 65534;
									}

									if (var9 != field386 || var8 != field412) {
										if (var46 == null) {
											var46 = class139.getPacketBufferNode(ClientPacket.MOUSE_MOVE, packetWriter.isaacCipher);
											var46.packetBuffer.writeByte(0);
											var3 = var46.packetBuffer.offset;
											var10000 = var46.packetBuffer;
											var10000.offset += 2;
											var5 = 0;
											var6 = 0;
										}

										if (field305 != -1L) {
											var10 = var9 - field386;
											var11 = var8 - field412;
											var12 = (int)((class328.mouseRecorder.millis[var7] - field305) / 20L);
											var5 = (int)((long)var5 + (class328.mouseRecorder.millis[var7] - field305) % 20L);
										} else {
											var10 = var9;
											var11 = var8;
											var12 = Integer.MAX_VALUE;
										}

										field386 = var9;
										field412 = var8;
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
										field305 = class328.mouseRecorder.millis[var7];
									}
								}

								if (var46 != null) {
									var46.packetBuffer.writeLengthByte(var46.packetBuffer.offset - var3);
									var7 = var46.packetBuffer.offset;
									var46.packetBuffer.offset = var3;
									var46.packetBuffer.writeByte(var5 / var6);
									var46.packetBuffer.writeByte(var5 % var6);
									var46.packetBuffer.offset = var7;
									packetWriter.addNode(var46);
								}

								if (var4 >= class328.mouseRecorder.index) {
									class328.mouseRecorder.index = 0;
								} else {
									MouseRecorder var78 = class328.mouseRecorder;
									var78.index -= var4;
									System.arraycopy(class328.mouseRecorder.xs, var4, class328.mouseRecorder.xs, 0, class328.mouseRecorder.index);
									System.arraycopy(class328.mouseRecorder.ys, var4, class328.mouseRecorder.ys, 0, class328.mouseRecorder.index);
									System.arraycopy(class328.mouseRecorder.millis, var4, class328.mouseRecorder.millis, 0, class328.mouseRecorder.index);
								}
							}
						}

						if (MouseHandler.MouseHandler_lastButton == 1 || !class7.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
							long var28 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis * -1L;
							if (var28 > 32767L) {
								var28 = 32767L;
							}

							mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis * -1L;
							var3 = MouseHandler.MouseHandler_lastPressedY;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > GameEngine.canvasHeight) {
								var3 = GameEngine.canvasHeight;
							}

							var4 = MouseHandler.MouseHandler_lastPressedX;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > GameEngine.canvasWidth) {
								var4 = GameEngine.canvasWidth;
							}

							var5 = (int)var28;
							PacketBufferNode var30 = class139.getPacketBufferNode(ClientPacket.EVENT_MOUSE_CLICK, packetWriter.isaacCipher);
							var30.packetBuffer.writeShort((var5 << 1) + (MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0));
							var30.packetBuffer.writeShort(var4);
							var30.packetBuffer.writeShort(var3);
							packetWriter.addNode(var30);
						}

						if (mouseWheelRotation != 0) {
							var26 = class139.getPacketBufferNode(ClientPacket.MOUSE_WHEEL, packetWriter.isaacCipher);
							var26.packetBuffer.writeShort(mouseWheelRotation);
							packetWriter.addNode(var26);
						}

						var1 = GameEngine.keyHandler.method360();
						if (var1) {
							var46 = class139.getPacketBufferNode(ClientPacket.EVENT_KEYBOARD, packetWriter.isaacCipher);
							var46.packetBuffer.writeShort(0);
							var3 = var46.packetBuffer.offset;
							long var31 = class180.method3973();

							for (var6 = 0; var6 < indexCheck.field3059; ++var6) {
								long var33 = var31 - field435;
								if (var33 > 16777215L) {
									var33 = 16777215L;
								}

								field435 = var31;
								var46.packetBuffer.writeByteAdd(indexCheck.field3058[var6]);
								var46.packetBuffer.method10901((int)var33);
							}

							var46.packetBuffer.writeLengthShort(var46.packetBuffer.offset - var3);
							packetWriter.addNode(var46);
						}

						if (field479 > 0) {
							--field479;
						}

						if (indexCheck.isValidIndexInRange(96) || indexCheck.isValidIndexInRange(97) || indexCheck.isValidIndexInRange(98) || indexCheck.isValidIndexInRange(99)) {
							field480 = true;
						}

						if (field480 && field479 <= 0) {
							field479 = 20;
							field480 = false;
							var46 = class139.getPacketBufferNode(ClientPacket.EVENT_CAMERA_POSITION, packetWriter.isaacCipher);
							var46.packetBuffer.writeShortAdd(camAngleX);
							var46.packetBuffer.writeShortAdd(camAngleY);
							packetWriter.addNode(var46);
						}

						if (GameEngine.hasFocus && !hadFocus) {
							hadFocus = true;
							var46 = class139.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
							var46.packetBuffer.writeByte(1);
							packetWriter.addNode(var46);
						}

						if (!GameEngine.hasFocus && hadFocus) {
							hadFocus = false;
							var46 = class139.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
							var46.packetBuffer.writeByte(0);
							packetWriter.addNode(var46);
						}

						if (class338.worldMap != null) {
							class338.worldMap.method10363();
						}

						if (class159.ClanChat_inClanChat) {
							if (class187.friendsChat != null) {
								class187.friendsChat.sort();
							}

							Iterator var57 = worldViewManager.iterator();

							while (var57.hasNext()) {
								WorldView var48 = (WorldView)var57.next();

								for (var3 = 0; var3 < playerUpdateManager.playerCount; ++var3) {
									Player var35 = (Player)Sound.topLevelWorldView.players.get((long) playerUpdateManager.playerIndices[var3]);
									if (var35 != null) {
										var35.clearIsInFriendsChat();
									}
								}
							}

							class159.ClanChat_inClanChat = false;
						}

						class131.method3459();
						int var47;
						if (field347 != Sound.topLevelWorldView.plane) {
							field347 = Sound.topLevelWorldView.plane;
							var47 = Sound.topLevelWorldView.plane;
							int[] var49 = class328.sceneMinimapSprite.pixels;
							var3 = var49.length;

							for (var4 = 0; var4 < var3; ++var4) {
								var49[var4] = 0;
							}

							for (var4 = 1; var4 < 103; ++var4) {
								var5 = (103 - var4) * 2048 + 24628;

								for (var6 = 1; var6 < 103; ++var6) {
									if ((Sound.topLevelWorldView.tileSettings[var47][var6][var4] & 24) == 0) {
										Sound.topLevelWorldView.scene.drawTileMinimap(var49, var5, 512, var47, var6, var4);
									}

									if (var47 < 3 && (Sound.topLevelWorldView.tileSettings[var47 + 1][var6][var4] & 8) != 0) {
										Sound.topLevelWorldView.scene.drawTileMinimap(var49, var5, 512, var47 + 1, var6, var4);
									}

									var5 += 4;
								}
							}

							var4 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
							var5 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
							class328.sceneMinimapSprite.setRaster();

							for (var6 = 1; var6 < 103; ++var6) {
								for (var7 = 1; var7 < 103; ++var7) {
									if ((Sound.topLevelWorldView.tileSettings[var47][var7][var6] & 24) == 0) {
										DevicePcmPlayerProvider.drawObject(var47, var7, var6, var4, var5);
									}

									if (var47 < 3 && (Sound.topLevelWorldView.tileSettings[var47 + 1][var7][var6] & 8) != 0) {
										DevicePcmPlayerProvider.drawObject(var47 + 1, var7, var6, var4, var5);
									}
								}
							}

							mapIconCount = 0;

							for (var6 = 0; var6 < 104; ++var6) {
								for (var7 = 0; var7 < 104; ++var7) {
									long var36 = Sound.topLevelWorldView.scene.getFloorDecorationTag(Sound.topLevelWorldView.plane, var6, var7);
									if (var36 != 0L) {
										var10 = DirectByteArrayCopier.Entity_unpackID(var36);
										var11 = HealthBarConfig.getObjectDefinition(var10).mapIconId;
										if (var11 >= 0 && InvDefinition.WorldMapElement_get(var11).field1940) {
											mapIcons[mapIconCount] = InvDefinition.WorldMapElement_get(var11).getSpriteBool(false);
											mapIconXs[mapIconCount] = var6;
											mapIconYs[mapIconCount] = var7;
											++mapIconCount;
										}
									}
								}
							}

							ArchiveDiskActionHandler.rasterProvider.apply();
						}

						if (gameState != 30) {
							return;
						}

						class311.method6763();

						int var14;
						int var10002;
						int var40;
						for (var47 = 0; var47 < class58.soundEffectCount; ++var47) {
							var10002 = class58.queuedSoundEffectDelays[var47]--;
							if (class58.queuedSoundEffectDelays[var47] < -10) {
								class175.method3948(var47);
								--var47;
							} else {
								SoundEffect var50 = class58.soundEffects[var47];
								if (var50 == null) {
									var10000 = null;
									var50 = SoundEffect.readSoundEffect(WorldMapRectangle.field3283, class58.field834[var47], 0);
									if (var50 == null) {
										continue;
									}

									int[] var79 = class58.queuedSoundEffectDelays;
									var79[var47] += var50.calculateDelay();
									class58.soundEffects[var47] = var50;
								}

								if (class58.queuedSoundEffectDelays[var47] < 0) {
									if (class58.soundLocations[var47] != 0) {
										var4 = Coord.method7228(class58.soundLocations[var47] & 255);
										var5 = class58.soundLocations[var47] >> 16 & 255;
										var6 = class58.soundLocations[var47] >> 8 & 255;
										var7 = class58.soundEffectIds[var47];
										WorldView var38 = worldViewManager.getWorldView(var7);
										class445 var39 = IgnoreList.method9505(var38, Coord.method7228(var5), Coord.method7228(var6));
										var11 = (int)var39.field4967;
										var10 = var11 >> 7;
										var14 = (int)var39.field4969;
										var40 = var14 >> 7;
										var39.method8687();
										class445 var16 = worldViewManager.method2226();
										int var17 = Math.abs(Coord.method7242(var10) - (int)var16.field4967);
										int var18 = Math.abs(Coord.method7242(var40) - (int)var16.field4969);
										var16.method8687();
										int var19 = Math.max(var18 + var17 - 128, 0);
										int var20 = Math.max(Coord.method7228((class58.field836[var47] & 31) - 1), 0);
										WorldEntity var21 = worldViewManager.method2217();
										WorldEntity var22 = worldViewManager.method2261(var7);
										boolean var23 = class58.field842[var47];
										boolean var24 = class333.method6868(var21, var22, var23);
										if (var19 >= var4 || !var24) {
											class58.queuedSoundEffectDelays[var47] = -100;
											continue;
										}

										float var25 = var20 < var4 ? Math.min(Math.max((float)(var4 - var19) / (float)(var4 - var20), 0.0F), 1.0F) : 1.0F;
										var3 = (int)(var25 * (float)ClientPacket.clientPreferences.getAreaSoundEffectsVolume());
									} else {
										var3 = ClientPacket.clientPreferences.getSoundEffectsVolume();
									}

									if (var3 > 0) {
										RawSound var63 = var50.method2874(ClientPacket.clientPreferences.method2435()).resample(class6.decimator);
										RawPcmStream var41 = RawPcmStream.createRawPcmStream(var63, 100, var3);
										if (var41 != null) {
											var41.setNumLoops(class58.queuedSoundEffectLoops[var47] - 1);
											UserComparator6.pcmStreamMixer.addSubStream(var41);
										}
									}

									class58.queuedSoundEffectDelays[var47] = -100;
								}
							}
						}

						if (playingJingle) {
							if (!class335.field3699.isEmpty()) {
								var1 = true;
							} else if (!class335.midiRequests.isEmpty() && class335.midiRequests.get(0) != null && ((MidiRequest)class335.midiRequests.get(0)).midiPcmStream != null) {
								var1 = ((MidiRequest)class335.midiRequests.get(0)).midiPcmStream.isReady();
							} else {
								var1 = false;
							}

							if (!var1) {
								if (ClientPacket.clientPreferences.getMusicVolume() != 0 && Interpreter.method1758()) {
									class205.method4315(ModeWhere.field4905, ClientPacket.clientPreferences.getMusicVolume());
								}

								playingJingle = false;
							}
						}

						++packetWriter.field1270;
						if (packetWriter.field1270 > 750) {
							VarpDefinition.method3991();
							return;
						}

						HealthBarConfig.method2564();
						WorldMapSectionType.method6569();
						PlayerUpdateManager.method2741();
						int[] var58 = playerUpdateManager.playerIndices;
						Iterator var51 = worldViewManager.iterator();

						Iterator var64;
						while (var51.hasNext()) {
							WorldView var42 = (WorldView)var51.next();

							for (var4 = 0; var4 < playerUpdateManager.playerCount; ++var4) {
								Player var70 = (Player)var42.players.get((long)var58[var4]);
								if (var70 != null && var70.overheadTextCyclesRemaining > 0) {
									--var70.overheadTextCyclesRemaining;
									if (var70.overheadTextCyclesRemaining == 0) {
										var70.overheadText = null;
									}
								}
							}

							var64 = var42.npcs.iterator();

							while (var64.hasNext()) {
								NPC var71 = (NPC)var64.next();
								if (var71 != null && var71.overheadTextCyclesRemaining > 0) {
									--var71.overheadTextCyclesRemaining;
									if (var71.overheadTextCyclesRemaining == 0) {
										var71.overheadText = null;
									}
								}
							}
						}

						++graphicsCycle;
						if (mouseCrossColor != 0) {
							mouseCrossState = mouseCrossState * 400 + 400;
							if (mouseCrossState * 20 >= 400) {
								mouseCrossColor = 0;
							}
						}

						if (field312 > 0) {
							--field312;
						}

						Widget var59 = FloorUnderlayDefinition.mousedOverWidgetIf1;
						Widget var52 = Strings.field4598;
						FloorUnderlayDefinition.mousedOverWidgetIf1 = null;
						Strings.field4598 = null;
						draggedOnWidget = null;
						field535 = false;
						field532 = false;
						field432 = 0;

						while (indexCheck.method5890() && field432 < 128) {
							if (staffModLevel >= 2 && indexCheck.isValidIndexInRange(82) && indexCheck.field3063 == 66) {
								StringBuilder var65 = new StringBuilder();

								Message var60;
								for (Iterator var72 = Messages.Messages_hashTable.iterator(); var72.hasNext(); var65.append(var60.text).append('\n')) {
									var60 = (Message)var72.next();
									if (var60.sender != null && !var60.sender.isEmpty()) {
										var65.append(var60.sender).append(':');
									}
								}

								String var73 = var65.toString();
								class36.client.method574(var73);
							} else if (oculusOrbState != 1 || indexCheck.field3062 <= 0) {
								field425[field432] = indexCheck.field3063;
								field360[field432] = indexCheck.field3062;
								++field432;
							}
						}

						if (class435.method8557() && indexCheck.isValidIndexInRange(82) && indexCheck.isValidIndexInRange(81) && mouseWheelRotation != 0) {
							var3 = class152.localPlayer.plane - mouseWheelRotation;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > 3) {
								var3 = 3;
							}

							if (var3 != class152.localPlayer.plane) {
								ItemComposition.method4533(class152.localPlayer.pathX[0] + Sound.topLevelWorldView.baseX, class152.localPlayer.pathY[0] + Sound.topLevelWorldView.baseY, var3, false);
							}

							mouseWheelRotation = 0;
						}

						if (rootInterface != -1) {
							class163.updateRootInterface(rootInterface, 0, 0, GameEngine.canvasWidth, GameEngine.canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							Widget var66;
							Widget var74;
							ScriptEvent var75;
							do {
								var75 = (ScriptEvent)scriptEvents2.removeLast();
								if (var75 == null) {
									while (true) {
										do {
											var75 = (ScriptEvent)scriptEvents3.removeLast();
											if (var75 == null) {
												while (true) {
													do {
														var75 = (ScriptEvent)scriptEvents.removeLast();
														if (var75 == null) {
															boolean var54 = false;

															while (true) {
																class270 var67 = (class270)field427.removeLast();
																if (var67 == null) {
																	if (!var54 && MouseHandler.MouseHandler_lastButton == 1) {
																		field491.method5864();
																	}

																	this.menu();
																	ClanChannelMember.method3678();
																	if (clickedWidget != null) {
																		this.method922();
																	}

																	var64 = worldViewManager.iterator();

																	while (var64.hasNext()) {
																		WorldView var76 = (WorldView)var64.next();
																		Scene var61 = var76.scene;
																		if (var61.shouldSendWalk()) {
																			var7 = var61.baseX;
																			var8 = var61.baseY;
																			PacketBufferNode var69 = class139.getPacketBufferNode(ClientPacket.MOVE_GAMECLICK, packetWriter.isaacCipher);
																			var69.packetBuffer.writeByte(5);
																			var69.packetBuffer.writeByteNeg(indexCheck.isValidIndexInRange(82) ? (indexCheck.isValidIndexInRange(81) ? 2 : 1) : 0);
																			var69.packetBuffer.writeShortLE(var7 + var76.baseX);
																			var69.packetBuffer.writeShortAdd(var8 + var76.baseY);
																			packetWriter.addNode(var69);
																			mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																			mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																			mouseCrossColor = 1;
																			mouseCrossState = 0;
																			destinationX = var7;
																			destinationY = var8;
																			var61.method5243();
																		}
																	}

																	if (var59 != FloorUnderlayDefinition.mousedOverWidgetIf1) {
																		if (var59 != null) {
																			ScriptFrame.invalidateWidget(var59);
																		}

																		if (FloorUnderlayDefinition.mousedOverWidgetIf1 != null) {
																			ScriptFrame.invalidateWidget(FloorUnderlayDefinition.mousedOverWidgetIf1);
																		}
																	}

																	if (var52 != Strings.field4598 && field518 == field519) {
																		if (var52 != null) {
																			ScriptFrame.invalidateWidget(var52);
																		}

																		if (Strings.field4598 != null) {
																			ScriptFrame.invalidateWidget(Strings.field4598);
																		}
																	}

																	if (Strings.field4598 != null) {
																		if (field518 < field519) {
																			++field518;
																			if (field519 == field518) {
																				ScriptFrame.invalidateWidget(Strings.field4598);
																			}
																		}
																	} else if (field518 > 0) {
																		--field518;
																	}

																	if (oculusOrbState == 0) {
																		WorldView var68 = worldViewManager.getWorldView(field338);
																		if (var68 == null) {
																			var68 = Sound.topLevelWorldView;
																		}

																		Object var77 = null;
																		switch(class330.field3670.field4198) {
																		case 0:
																			var77 = (Entity)var68.players.get((long)field339);
																			break;
																		case 1:
																			var77 = (Entity)var68.npcs.get((long)field339);
																			break;
																		case 2:
																			var77 = (Entity)var68.worldEntities.get((long)field339);
																		}

																		if (var77 == null) {
																			var77 = class152.localPlayer;
																		}

																		field527 = ((Entity)var77).getY();
																		field387 = ((Entity)var77).getPlane();
																		if (var68 != Sound.topLevelWorldView) {
																			class445 var62 = IgnoreList.method9505(var68, ((Entity)var77).getY(), ((Entity)var77).getPlane());
																			field527 = (int)var62.field4967;
																			field387 = (int)var62.field4969;
																			var62.method8687();
																		}

																		var6 = ((Entity)var77).getX();
																		if (UserComparator5.oculusOrbFocalPointX - field527 >= -500 && UserComparator5.oculusOrbFocalPointX - field527 <= 500 && class198.oculusOrbFocalPointY - field387 >= -500 && class198.oculusOrbFocalPointY - field387 <= 500) {
																			if (field527 != UserComparator5.oculusOrbFocalPointX) {
																				UserComparator5.oculusOrbFocalPointX += (field527 - UserComparator5.oculusOrbFocalPointX) / 16;
																			}

																			if (field387 != class198.oculusOrbFocalPointY) {
																				class198.oculusOrbFocalPointY += (field387 - class198.oculusOrbFocalPointY) / 16;
																			}
																		} else {
																			UserComparator5.oculusOrbFocalPointX = field527;
																			class198.oculusOrbFocalPointY = field387;
																		}

																		var7 = UserComparator5.oculusOrbFocalPointX >> 7;
																		var8 = class198.oculusOrbFocalPointY >> 7;
																		var9 = DevicePcmPlayerProvider.getTileHeight(Sound.topLevelWorldView, UserComparator5.oculusOrbFocalPointX, class198.oculusOrbFocalPointY, var6);
																		var10 = 0;
																		if (var7 > 3 && var8 > 3 && var7 < 100 && var8 < 100) {
																			for (var11 = var7 - 4; var11 <= var7 + 4; ++var11) {
																				for (var12 = var8 - 4; var12 <= var8 + 4; ++var12) {
																					var40 = var6;
																					if (var6 < 3 && (Sound.topLevelWorldView.tileSettings[1][var11][var12] & 2) == 2) {
																						var40 = var6 + 1;
																					}

																					var14 = var9 - Sound.topLevelWorldView.tileHeights[var40][var11][var12];
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

																		if (var11 > field481) {
																			field481 += (var11 - field481) / 24;
																		} else if (var11 < field481) {
																			field481 += (var11 - field481) / 80;
																		}

																		field429 = class364.method7313(var68, ((Entity)var77).getY(), ((Entity)var77).getPlane(), var6);
																		class275.oculusOrbFocalPointZ = field429 - camFollowHeight;
																	} else if (oculusOrbState == 1) {
																		if (field478 && class152.localPlayer != null) {
																			var4 = class152.localPlayer.pathX[0];
																			var5 = class152.localPlayer.pathY[0];
																			if (var4 >= 0 && 104 > var4 && var5 >= 0 && 104 > var5) {
																				UserComparator5.oculusOrbFocalPointX = class152.localPlayer.x;
																				var6 = DevicePcmPlayerProvider.getTileHeight(Sound.topLevelWorldView, class152.localPlayer.x, class152.localPlayer.y, Sound.topLevelWorldView.plane) - camFollowHeight;
																				if (var6 < class275.oculusOrbFocalPointZ) {
																					class275.oculusOrbFocalPointZ = var6;
																				}

																				class198.oculusOrbFocalPointY = class152.localPlayer.y;
																				field478 = false;
																			}
																		}

																		short var55 = -1;
																		if (indexCheck.isValidIndexInRange(33)) {
																			var55 = 0;
																		} else if (indexCheck.isValidIndexInRange(49)) {
																			var55 = 1024;
																		}

																		if (indexCheck.isValidIndexInRange(48)) {
																			if (var55 == 0) {
																				var55 = 1792;
																			} else if (var55 == 1024) {
																				var55 = 1280;
																			} else {
																				var55 = 1536;
																			}
																		} else if (indexCheck.isValidIndexInRange(50)) {
																			if (var55 == 0) {
																				var55 = 256;
																			} else if (var55 == 1024) {
																				var55 = 768;
																			} else {
																				var55 = 512;
																			}
																		}

																		byte var53 = 0;
																		if (indexCheck.isValidIndexInRange(35)) {
																			var53 = -1;
																		} else if (indexCheck.isValidIndexInRange(51)) {
																			var53 = 1;
																		}

																		var6 = 0;
																		if (var55 >= 0 || var53 != 0) {
																			var6 = indexCheck.isValidIndexInRange(81) ? oculusOrbSlowedSpeed : oculusOrbNormalSpeed;
																			var6 *= 16;
																			field475 = var55;
																			field424 = var53;
																		}

																		if (field474 < var6) {
																			field474 += var6 / 8;
																			if (field474 > var6) {
																				field474 = var6;
																			}
																		} else if (field474 > var6) {
																			field474 = field474 * 9 / 10;
																		}

																		if (field474 > 0) {
																			var7 = field474 / 16;
																			if (field475 >= 0) {
																				var4 = field475 - class455.cameraYaw & 2047;
																				var8 = Rasterizer3D.Rasterizer3D_sine[var4];
																				var9 = Rasterizer3D.Rasterizer3D_cosine[var4];
																				UserComparator5.oculusOrbFocalPointX += var7 * var8 / 65536;
																				class198.oculusOrbFocalPointY += var7 * var9 / 65536;
																			}

																			if (field424 != 0) {
																				class275.oculusOrbFocalPointZ += var7 * field424;
																				if (class275.oculusOrbFocalPointZ > 0) {
																					class275.oculusOrbFocalPointZ = 0;
																				}
																			}
																		} else {
																			field475 = -1;
																			field424 = -1;
																		}

																		char var56 = '耀';
																		if (var56 > field481) {
																			field481 += (var56 - field481) / 24;
																		} else if (var56 < field481) {
																			field481 += (var56 - field481) / 80;
																		}

																		if (indexCheck.isValidIndexInRange(13)) {
																			packetWriter.addNode(class139.getPacketBufferNode(ClientPacket.field3456, packetWriter.isaacCipher));
																			oculusOrbState = 0;
																		}
																	}

																	if (MouseHandler.MouseHandler_currentButton == 4 && class7.mouseCam) {
																		var4 = MouseHandler.MouseHandler_y - mouseCamClickedY;
																		camAngleDX = var4 * 2;
																		mouseCamClickedY = var4 != -1 && var4 != 1 ? (MouseHandler.MouseHandler_y + mouseCamClickedY) / 2 : MouseHandler.MouseHandler_y;
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

																	if (field459) {
																		class163.method3834(NpcOverrides.field2022, Strings.field4599, ReflectionCheck.field248);
																		MouseRecorder.method2130(ChatChannel.field830, Calendar.field3843);
																		if (class6.cameraX == NpcOverrides.field2022 && Strings.field4599 == ClientPreferences.cameraY && ReflectionCheck.field248 == GrandExchangeOfferAgeComparator.cameraZ && WorldMapData_1.cameraPitch == ChatChannel.field830 && class455.cameraYaw == Calendar.field3843) {
																			field459 = false;
																			isCameraLocked = false;
																			field578 = false;
																			field543 = false;
																			Messages.field1260 = 0;
																			class134.field1583 = 0;
																			class27.field131 = 0;
																			IntHashTable.field5141 = 0;
																			HealthBarUpdate.field1090 = 0;
																			WorldMapData_0.field3133 = 0;
																			class148.field1710 = 0;
																			Interpreter.field676 = 0;
																			AABB.field2811 = 0;
																			class242.field2663 = 0;
																			field581 = null;
																			field583 = null;
																			field582 = null;
																		}
																	} else if (isCameraLocked) {
																		class134.method3523();
																	}

																	for (var4 = 0; var4 < 5; ++var4) {
																		var10002 = field588[var4]++;
																	}

																	class339.varcs.tryWrite();
																	var4 = ++MouseHandler.MouseHandler_idleCycles - 1;
																	var6 = class443.method8682();
																	PacketBufferNode var43;
																	if (var4 > 15000 && var6 > 15000) {
																		logoutTimer = 250;
																		class47.method1767(14500);
																		var43 = class139.getPacketBufferNode(ClientPacket.EVENT_MOUSE_IDLE, packetWriter.isaacCipher);
																		packetWriter.addNode(var43);
																	}

																	Actor.friendSystem.processFriendUpdates();
																	FontName.method10486();
																	++packetWriter.pendingWrites;
																	if (packetWriter.pendingWrites > 50) {
																		var43 = class139.getPacketBufferNode(ClientPacket.NO_TIMEOUT, packetWriter.isaacCipher);
																		packetWriter.addNode(var43);
																	}

																	try {
																		packetWriter.flush();
																	} catch (IOException var44) {
																		VarpDefinition.method3991();
																	}

																	VarcInt.method4037().method4766();
																	return;
																}

																if (var67.field3051.type == 12) {
																	var54 = true;
																}

																Message.method710(var67);
															}
														}

														var66 = var75.widget;
														if (var66.childIndex * -744024149 < 0) {
															break;
														}

														var74 = ClientPreferences.widgetDefinition.method7286(var66.parentId);
													} while(var74 == null || var74.children == null || var66.childIndex * -744024149 >= var74.children.length || var74.children[var66.childIndex * -744024149] != var66);

													ModeWhere.runScriptEvent(var75);
												}
											}

											var66 = var75.widget;
											if (var66.childIndex * -744024149 < 0) {
												break;
											}

											var74 = ClientPreferences.widgetDefinition.method7286(var66.parentId);
										} while(var74 == null || var74.children == null || var66.childIndex * -744024149 >= var74.children.length || var74.children[var66.childIndex * -744024149] != var66);

										ModeWhere.runScriptEvent(var75);
									}
								}

								var66 = var75.widget;
								if (var66.childIndex * -744024149 < 0) {
									break;
								}

								var74 = ClientPreferences.widgetDefinition.method7286(var66.parentId);
							} while(var74 == null || var74.children == null || var66.childIndex * -744024149 >= var74.children.length || var74.children[var66.childIndex * -744024149] != var66);

							ModeWhere.runScriptEvent(var75);
						}
					}

					var46 = class139.getPacketBufferNode(ClientPacket.REFLECTION_CHECK_REPLY, packetWriter.isaacCipher);
					var46.packetBuffer.writeByte(0);
					var3 = var46.packetBuffer.offset;
					class394.performReflectionCheck(var46.packetBuffer);
					var46.packetBuffer.writeLengthByte(var46.packetBuffer.offset - var3);
					packetWriter.addNode(var46);
				}
			}
		}
	}

	@ObfuscatedName("pw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2084170730"
	)
	public void vmethod7113(int var1, int var2) {
		if (packetWriter != null && packetWriter.isaacCipher != null) {
			if (var1 > -1 && ClientPacket.clientPreferences.getMusicVolume() > 0 && !playingJingle) {
				PacketBufferNode var3 = class139.getPacketBufferNode(ClientPacket.MUSIC_PLAYING, packetWriter.isaacCipher);
				var3.packetBuffer.writeInt(var1);
				packetWriter.addNode(var3);
			}

		}
	}

	@ObfuscatedName("pd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-67"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = GameEngine.canvasWidth;
		int var2 = GameEngine.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}

		if (ClientPacket.clientPreferences != null) {
			try {
				Client var3 = class36.client;
				Object[] var4 = new Object[]{DirectByteArrayCopier.getWindowedMode()};
				JSObject.getWindow(var3).call("resize", var4);
			} catch (Throwable var5) {
			}
		}

	}

	@ObfuscatedName("po")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "94"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		int var1;
		if (rootInterface != -1) {
			var1 = rootInterface;
			if (ClientPreferences.widgetDefinition.loadInterface(var1)) {
				class114.drawModelComponents(ClientPreferences.widgetDefinition.Widget_interfaceComponents[var1], 0, ClientPreferences.widgetDefinition.Widget_interfaceComponents[var1].length - 1, -1, -1);
			}
		}

		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (validRootWidgets[var1]) {
				field558[var1] = true;
			}

			field559[var1] = validRootWidgets[var1];
			validRootWidgets[var1] = false;
		}

		field556 = cycle;
		viewportX = -1;
		viewportY = -1;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			class166.drawWidgets(rootInterface, 0, 0, GameEngine.canvasWidth, GameEngine.canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				ScriptFrame.crossSprites[mouseCrossState * 20 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				ScriptFrame.crossSprites[mouseCrossState * 20 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}

		if (!isMenuOpen) {
			if (viewportX != -1) {
				var1 = viewportX;
				int var2 = viewportY;
				if ((menu.menuOptionsCount >= 2 || isItemSelected != 0 || isSpellSelected) && showMouseOverText) {
					int var3 = class571.method10767();
					String var4;
					if (isItemSelected == 1 && menu.menuOptionsCount < 2) {
						var4 = "Use" + " " + field520 + " " + "->";
					} else if (isSpellSelected && menu.menuOptionsCount < 2) {
						var4 = selectedSpellActionName + " " + selectedSpellName + " " + "->";
					} else {
						var4 = menu.method11495(var3);
					}

					if (menu.menuOptionsCount > 2) {
						var4 = var4 + AbstractWorldMapIcon.colorStartTag(16777215) + " " + '/' + " " + (menu.menuOptionsCount - 2) + " more options";
					}

					Friend.fontBold12.drawRandomAlphaAndSpacing(var4, var1 + 4, var2 + 15, 16777215, 0, cycle / 1000);
				}
			}
		} else {
			menu.method11507();
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field559[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field558[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		this.method787();
	}

	@ObfuscatedName("pl")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-103"
	)
	void method787() {
		class445 var1 = worldViewManager.method2226();
		class332.method6853(worldViewManager.method2217(), (int)var1.field4971, (int)var1.field4967, (int)var1.field4969, graphicsCycle);
		var1.method8687();
		graphicsCycle = 0;
	}

	@ObfuscatedName("pf")
	@ObfuscatedSignature(
		descriptor = "(Ldn;I)Z",
		garbageValue = "1872990227"
	)
	boolean method788(PacketWriter var1) {
		if (var1.serverPacketLength == 0) {
			class187.friendsChat = null;
		} else {
			if (class187.friendsChat == null) {
				class187.friendsChat = new FriendsChat(AbstractUserComparator.loginType, class36.client);
			}

			class187.friendsChat.method9527(var1.packetBuffer);
		}

		class166.method3857();
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("pa")
	@ObfuscatedSignature(
		descriptor = "(Ldn;S)Z",
		garbageValue = "-1439"
	)
	boolean method789(PacketWriter var1) {
		if (class187.friendsChat != null) {
			class187.friendsChat.method9528(var1.packetBuffer);
		}

		class166.method3857();
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("pt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1701779732"
	)
	void method790() {
		int var1 = 0;
		boolean var2 = packetWriter.field1272 > 0;

		for (int var3 = packetWriter.field1273; var1 < 100 || var2; var2 = packetWriter.field1272 > 0) {
			boolean var4 = this.method1434(packetWriter);
			if (var2) {
				int var5 = packetWriter.field1273 - var3;
				PacketWriter var10000 = packetWriter;
				var10000.field1272 -= var5;
			}

			if (!var4) {
				break;
			}

			++var1;
			var3 = packetWriter.field1273;
		}

	}

	@ObfuscatedName("ql")
	@ObfuscatedSignature(
		descriptor = "(Ldn;I)Z",
		garbageValue = "2045044446"
	)
	@Export("method1434")
	final boolean method1434(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket();
		PacketBuffer var3 = var1.packetBuffer;
		if (var2 == null) {
			return false;
		} else {
			int var6;
			String var25;
			try {
				if (var1.field1272 > 0 && !var2.isAvailable(var1.field1272)) {
					return false;
				}

				int var5;
				if (var1.serverPacket == null) {
					if (var1.field1271) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var1.field1273 += var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1270 = 0;
						var1.field1271 = false;
					}

					var3.offset = 0;
					if (var3.method10811()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var1.field1273 += var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1270 = 0;
					}

					var1.field1271 = true;
					ServerPacket[] var4 = class275.ServerPacket_values();
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

					var1.field1273 += var2.read(var3.array, 0, 1);
					var1.serverPacketLength = var3.array[0] & 255;
				}

				if (var1.serverPacketLength == -2) {
					if (!var2.isAvailable(2)) {
						return false;
					}

					var1.field1273 += var2.read(var3.array, 0, 2);
					var3.offset = 0;
					var1.serverPacketLength = var3.readUnsignedShort();
				}

				if (!var2.isAvailable(var1.serverPacketLength)) {
					return false;
				}

				var3.offset = 0;
				var1.field1273 += var2.read(var3.array, 0, var1.serverPacketLength);
				var1.field1270 = 0;
				timer.method7999();
				var1.field1276 = var1.field1266;
				var1.field1266 = var1.field1262;
				var1.field1262 = var1.serverPacket;
				if (ServerPacket.field3643 == var1.serverPacket) {
					FontName.updateWorldEntitiesFromPacketBuffer(class330.worldView, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOC_ADD_CHANGE == var1.serverPacket) {
					WallDecoration.method5857(class325.field3480);
					var1.serverPacket = null;
					return true;
				}

				int var7;
				int var8;
				int var9;
				int var10;
				int var11;
				int var12;
				int var22;
				boolean var61;
				boolean var62;
				if (ServerPacket.CAM_MOVETO_EASED_CIRCULAR == var1.serverPacket) {
					isCameraLocked = true;
					field459 = false;
					field578 = true;
					Interpreter.field676 = var3.readUnsignedByte();
					AABB.field2811 = var3.readUnsignedByte();
					var22 = var3.readUnsignedShort();
					var5 = Coord.method7242(var3.readUnsignedByte());
					var6 = Coord.method7242(var3.readUnsignedByte());
					var7 = var3.readUnsignedShort();
					field580 = var3.readBoolean();
					var8 = var3.readUnsignedByte();
					var9 = Coord.method7242(Interpreter.field676);
					var10 = Coord.method7242(AABB.field2811);
					var62 = false;
					var61 = false;
					if (field580) {
						var11 = ClientPreferences.cameraY;
						var12 = DevicePcmPlayerProvider.getTileHeight(Sound.topLevelWorldView, var9, var10, Sound.topLevelWorldView.plane) - var22;
					} else {
						var11 = DevicePcmPlayerProvider.getTileHeight(Sound.topLevelWorldView, class6.cameraX, GrandExchangeOfferAgeComparator.cameraZ, Sound.topLevelWorldView.plane) - ClientPreferences.cameraY;
						var12 = var22;
					}

					field581 = new class538(class6.cameraX, GrandExchangeOfferAgeComparator.cameraZ, var11, var9, var10, var12, var5, var6, var7, var8);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_LOOKAT == var1.serverPacket) {
					isCameraLocked = true;
					field459 = false;
					field543 = true;
					var22 = class475.method9427(var3.readShort() & 2027);
					var5 = HttpResponse.method302(var3.readShort() & 2027);
					var6 = var3.readUnsignedShort();
					var7 = var3.readUnsignedByte();
					field583 = new class540(WorldMapData_1.cameraPitch, var5, var6, var7);
					field582 = new class540(class455.cameraYaw, var22, var6, var7);
					var1.serverPacket = null;
					return true;
				}

				String var73;
				if (ServerPacket.MESSAGE_GAME == var1.serverPacket) {
					var22 = var3.readUShortSmart();
					boolean var97 = var3.readUnsignedByte() == 1;
					var73 = "";
					boolean var70 = false;
					if (var97) {
						var73 = var3.readStringCp1252NullTerminated();
						if (Actor.friendSystem.isIgnored(new Username(var73, AbstractUserComparator.loginType))) {
							var70 = true;
						}
					}

					String var91 = var3.readStringCp1252NullTerminated();
					if (!var70) {
						GrandExchangeOfferWorldComparator.addGameMessage(var22, var73, var91);
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var23;
				if (ServerPacket.IF_SETSCROLLPOS == var1.serverPacket) {
					var22 = var3.readInt();
					var5 = var3.readUnsignedShort();
					var23 = ClientPreferences.widgetDefinition.method7286(var22);
					if (var23 != null && var23.type == 0) {
						if (var5 > var23.scrollHeight - var23.height * -2133353239) {
							var5 = var23.scrollHeight - var23.height * -2133353239;
						}

						if (var5 < 0) {
							var5 = 0;
						}

						if (var5 != var23.scrollY) {
							var23.scrollY = var5;
							ScriptFrame.invalidateWidget(var23);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				String var55;
				if (ServerPacket.field3544 == var1.serverPacket) {
					var55 = var3.readStringCp1252NullTerminated();
					var25 = AbstractFont.escapeBrackets(MoveSpeed.method6102(class162.method3825(var3)));
					GrandExchangeOfferWorldComparator.addGameMessage(6, var55, var25);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3638 == var1.serverPacket) {
					var1.field1272 = var3.readShort();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_NORMAL == var1.serverPacket) {
					SoundCache.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RESET_ANIMS == var1.serverPacket) {
					Player var98;
					for (Iterator var60 = class330.worldView.players.iterator(); var60.hasNext(); var98.sequence = -1) {
						var98 = (Player)var60.next();
					}

					NPC var109;
					for (Iterator var100 = class330.worldView.npcs.iterator(); var100.hasNext(); var109.sequence = -1) {
						var109 = (NPC)var100.next();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OBJ_ADD == var1.serverPacket) {
					WallDecoration.method5857(class325.field3490);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL == var1.serverPacket) {
					Ignored.field5198 = var3.readUnsignedByteAdd();
					HitSplatDefinition.field2180 = var3.readUnsignedByteAdd();
					field405 = var3.readUnsignedByteSub();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_PRIVCHATMODE == var1.serverPacket) {
					class397.privateChatMode = class146.method3642(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RUNCLIENTSCRIPT == var1.serverPacket) {
					var55 = var3.readStringCp1252NullTerminated();
					Object[] var96 = new Object[var55.length() + 1];

					for (var6 = var55.length() - 1; var6 >= 0; --var6) {
						class509 var87;
						switch(var55.charAt(var6)) {
						case 'W':
							var7 = var3.packBytesToInt();
							var87 = new class509(class563.field5600, 0, var7, var7);
							int[] var85 = var87.method9965();

							for (var10 = 0; var10 < var7; ++var10) {
								var85[var10] = var3.method10928();
							}

							var96[var6 + 1] = var87;
							break;
						case 'X':
							var7 = var3.packBytesToInt();
							var87 = new class509(class563.field5595, (Object)null, var7, var7);
							Object[] var81 = var87.method9936();

							for (var10 = 0; var10 < var7; ++var10) {
								var81[var10] = var3.readStringCp1252NullTerminated();
							}

							var96[var6 + 1] = var87;
							break;
						case 's':
							var96[var6 + 1] = var3.readStringCp1252NullTerminated();
							break;
						default:
							var96[var6 + 1] = new Integer(var3.readInt());
						}
					}

					var96[0] = new Integer(var3.readInt());
					ScriptEvent var108 = new ScriptEvent();
					var108.args = var96;
					ModeWhere.runScriptEvent(var108);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SONG_WITH_SECONDARY == var1.serverPacket) {
					var22 = var3.readUnsignedShortAdd();
					if (var22 == 65535) {
						var22 = -1;
					}

					var7 = var3.readUnsignedShort();
					var8 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.readUnsignedShortLE();
					var9 = var3.readUnsignedShortLE();
					ArrayList var105 = new ArrayList();
					var105.add(var22);
					var105.add(var5);
					HealthBarDefinition.playSong(var105, var6, var7, var8, var9);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOGOUT_FULL == var1.serverPacket) {
					class378.logOut();
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.UPDATE_UID192 == var1.serverPacket) {
					var3.offset += 28;
					if (var3.checkCrc()) {
						class197.method4232(var3, var3.offset - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1 == var1.serverPacket) {
					return this.method788(var1);
				}

				Widget var99;
				if (ServerPacket.IF_SETOBJECT == var1.serverPacket) {
					var22 = var3.readUnsignedShortAddLE();
					if (var22 == 65535) {
						var22 = -1;
					}

					var5 = var3.readUnsignedIntIME();
					var6 = var3.readUnsignedIntME();
					var99 = ClientPreferences.widgetDefinition.method7286(var5);
					ItemComposition var82;
					if (!var99.isIf3) {
						if (var22 == -1) {
							var99.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var82 = SceneTilePaint.ItemDefinition_get(var22).getCountObj(var6);
						var99.modelType = 4;
						var99.modelId = var22;
						var99.modelAngleX = var82.xan2d;
						var99.modelAngleY = var82.yan2d;
						var99.modelZoom = var82.zoom2d * 100 / var6;
						ScriptFrame.invalidateWidget(var99);
					} else {
						var99.itemId = var22;
						var99.itemQuantity = var6;
						var82 = SceneTilePaint.ItemDefinition_get(var22).getCountObj(var6);
						var99.modelAngleX = var82.xan2d;
						var99.modelAngleY = var82.yan2d;
						var99.modelAngleZ = var82.zan2d;
						var99.modelOffsetX = var82.offsetX2d;
						var99.modelOffsetY = var82.offsetY2d;
						var99.modelZoom = var82.zoom2d;
						if (var82.isStackable == 1) {
							var99.itemQuantityMode = 1;
						} else {
							var99.itemQuantityMode = 2;
						}

						if (var99.field4039 > 0) {
							var99.modelZoom = var99.modelZoom * 32 / var99.field4039;
						} else if (var99.rawWidth > 0) {
							var99.modelZoom = var99.modelZoom * 32 / var99.rawWidth;
						}

						ScriptFrame.invalidateWidget(var99);
					}

					var1.serverPacket = null;
					return true;
				}

				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				int var65;
				if (ServerPacket.PROJECTILE_SPAWN == var1.serverPacket) {
					byte var69 = var3.readByteSub();
					var16 = var3.readUnsignedShortAddLE();
					var12 = var3.readUnsignedShortAddLE();
					var15 = var3.readUnsignedShort();
					var11 = var3.method10889();
					byte var66 = var3.readByteSub();
					var14 = var3.readUnsignedByteSub() * 4;
					var65 = var3.readUnsignedByteAdd() * 4;
					var19 = var3.method3945();
					var18 = var3.readUnsignedShortAddLE();
					var6 = var3.method10903();
					var22 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var7 = var22 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					var17 = var3.readUnsignedByteAdd();
					if (var12 != 65535) {
						var7 += class330.worldView.baseX;
						var8 += class330.worldView.baseY;
						var9 = var69 + var7;
						var10 = var66 + var8;
						Projectile var20 = new Projectile(class330.worldView.plane, var7, var8, var65, var19, class330.worldView.plane, var9, var10, var14, var11, var12, var15 + cycle, var16 + cycle, var17, var18);
						projectiles.addFirst(var20);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_MODE == var1.serverPacket) {
					var22 = var3.readUnsignedByte();
					class1.method7(var22);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOC_ANIM == var1.serverPacket) {
					WallDecoration.method5857(class325.field3489);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3634 == var1.serverPacket) {
					WorldMapAreaData.field3334 = var3.readBoolean();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VAR_CLAN_ENABLE == var1.serverPacket) {
					class389.field4604 = new class515(SequenceDefinition.field2343);
					var1.serverPacket = null;
					return true;
				}

				byte var71;
				if (ServerPacket.CLAN_SETTINGS_FULL == var1.serverPacket) {
					WorldMapSectionType.method6572();
					var71 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var71 >= 0) {
							currentClanSettings[var71] = null;
						} else {
							HorizontalAlignment.guestClanSettings = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var71 >= 0) {
						currentClanSettings[var71] = new ClanSettings(var3);
					} else {
						HorizontalAlignment.guestClanSettings = new ClanSettings(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_OPENTOP == var1.serverPacket) {
					var22 = var3.readUnsignedShortAdd();
					if (var22 == 65535) {
						var22 = -1;
					}

					rootInterface = var22;
					this.method795(false);
					KeyHandler.method373(var22);
					class182.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						validRootWidgets[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CLAN_CHANNEL_FULL == var1.serverPacket) {
					field550 = cycleCntr;
					var71 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var71 >= 0) {
							currentClanChannels[var71] = null;
						} else {
							PendingSpawn.guestClanChannel = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var71 >= 0) {
						currentClanChannels[var71] = new ClanChannel(var3);
					} else {
						PendingSpawn.guestClanChannel = new ClanChannel(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_SMOOTH_RESET == var1.serverPacket && isCameraLocked) {
					field459 = true;
					field543 = false;
					field578 = false;

					for (var22 = 0; var22 < 5; ++var22) {
						field584[var22] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.GRAPHICSOBJECT_SPAWN == var1.serverPacket) {
					var6 = var3.method10902();
					var22 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var7 = var22 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					var9 = var3.readUnsignedShortLE();
					var10 = var3.readUnsignedByteAdd();
					var11 = var3.readUnsignedShortAdd();
					if (var7 >= 0 && var8 >= 0 && var7 < class330.worldView.sizeX && var8 < class330.worldView.sizeY) {
						var7 = Coord.method7242(var7);
						var8 = Coord.method7242(var8);
						GraphicsObject var102 = new GraphicsObject(class330.worldView, var9, class330.worldView.plane, var7, var8, DevicePcmPlayerProvider.getTileHeight(class330.worldView, var7, var8, class330.worldView.plane) - var10, var11, cycle);
						class330.worldView.graphicsObjects.addFirst(var102);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_FRIENDLIST == var1.serverPacket) {
					Actor.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field534 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				long var30;
				long var32;
				long var34;
				String var36;
				if (ServerPacket.MESSAGE_CLAN_CHANNEL_SYSTEM == var1.serverPacket) {
					var71 = var3.readByte();
					var30 = (long)var3.readUnsignedShort();
					var32 = (long)var3.readMedium();
					var34 = var32 + (var30 << 32);
					var62 = false;
					ClanChannel var101 = var71 >= 0 ? currentClanChannels[var71] : PendingSpawn.guestClanChannel;
					if (var101 == null) {
						var62 = true;
					} else {
						for (var65 = 0; var65 < 100; ++var65) {
							if (crossWorldMessageIds[var65] == var34) {
								var62 = true;
								break;
							}
						}
					}

					if (!var62) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var34;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var36 = class162.method3825(var3);
						var14 = var71 >= 0 ? 43 : 46;
						class518.addChatMessage(var14, "", var36, var101.name);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETNPCHEAD == var1.serverPacket) {
					var22 = var3.readUnsignedIntLE();
					var5 = var3.readUnsignedShort();
					var23 = ClientPreferences.widgetDefinition.method7286(var22);
					if (var23.modelType != 2 || var5 != var23.modelId) {
						var23.modelType = 2;
						var23.modelId = var5;
						ScriptFrame.invalidateWidget(var23);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VARP_SMALL == var1.serverPacket) {
					var71 = var3.readByteSub();
					var5 = var3.readUnsignedShortLE();
					Varps.Varps_temp[var5] = var71;
					if (Varps.Varps_main[var5] != var71) {
						Varps.Varps_main[var5] = var71;
					}

					class172.changeGameOptions(var5);
					changedVarps[++changedVarpCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SONG == var1.serverPacket) {
					var6 = var3.readUnsignedShort();
					var22 = var3.readUnsignedShortAdd();
					var8 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedShort();
					var7 = var3.readUnsignedShort();
					if (var22 == 65535) {
						var22 = -1;
					}

					ArrayList var79 = new ArrayList();
					var79.add(var22);
					HealthBarDefinition.playSong(var79, var5, var6, var7, var8);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_INFO == var1.serverPacket) {
					playerUpdateManager.method2733(var3, var1.serverPacketLength);
					MusicPatchPcmStream.method7141();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_FULL_FOLLOWS == var1.serverPacket) {
					HitSplatDefinition.field2180 = var3.readUnsignedByte();
					Ignored.field5198 = var3.readUnsignedByteSub();
					field405 = var3.readUnsignedByte();

					for (var22 = Ignored.field5198; var22 < Ignored.field5198 + 8; ++var22) {
						for (var5 = HitSplatDefinition.field2180; var5 < HitSplatDefinition.field2180 + 8; ++var5) {
							if (class330.worldView.groundItems[field405][var22][var5] != null) {
								class330.worldView.groundItems[field405][var22][var5] = null;
								WorldMapRectangle.updateItemPile(field405, var22, var5);
							}
						}
					}

					for (PendingSpawn var59 = (PendingSpawn)class330.worldView.pendingSpawns.last(); var59 != null; var59 = (PendingSpawn)class330.worldView.pendingSpawns.previous()) {
						if (var59.x >= Ignored.field5198 && var59.x < Ignored.field5198 + 8 && var59.y >= HitSplatDefinition.field2180 && var59.y < HitSplatDefinition.field2180 + 8 && var59.plane == field405) {
							var59.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				NPC var75;
				if (ServerPacket.NPC_HEADICON_SPECIFIC == var1.serverPacket) {
					var22 = var3.readUnsignedIntME();
					short var72 = (short)var3.readShortLE();
					var6 = var3.readUnsignedByteAdd();
					var7 = var3.readUnsignedShortLE();
					var75 = (NPC)class330.worldView.npcs.get((long)var7);
					if (var75 != null) {
						var75.method2587(var6, var22, var72);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3605 == var1.serverPacket) {
					class134.method3521();
					runEnergy = var3.readUnsignedShort();
					field553 = cycleCntr;
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

					field611 = cycleCntr;
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

				if (ServerPacket.CAM_MOVETO == var1.serverPacket) {
					isCameraLocked = true;
					field459 = false;
					field578 = true;
					Interpreter.field676 = var3.readUnsignedByte();
					AABB.field2811 = var3.readUnsignedByte();
					var22 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShort();
					field580 = var3.readBoolean();
					var6 = var3.readUnsignedByte();
					var7 = Coord.method7242(Interpreter.field676);
					var8 = Coord.method7242(AABB.field2811);
					boolean var67 = false;
					boolean var63 = false;
					if (field580) {
						var9 = ClientPreferences.cameraY;
						var10 = DevicePcmPlayerProvider.getTileHeight(Sound.topLevelWorldView, var7, var8, Sound.topLevelWorldView.plane) - var22;
					} else {
						var9 = DevicePcmPlayerProvider.getTileHeight(Sound.topLevelWorldView, class6.cameraX, GrandExchangeOfferAgeComparator.cameraZ, Sound.topLevelWorldView.plane) - ClientPreferences.cameraY;
						var10 = var22;
					}

					field581 = new class539(class6.cameraX, GrandExchangeOfferAgeComparator.cameraZ, var9, var7, var8, var10, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3528 == var1.serverPacket) {
					UrlRequester.field1487 = var3.readBoolean();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_INFO_LARGE_VIEWPORT == var1.serverPacket) {
					class6.updateNpcs(class330.worldView, false, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_IGNORELIST == var1.serverPacket) {
					Actor.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					WorldMapLabelSize.FriendSystem_invalidateIgnoreds();
					field534 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3526 == var1.serverPacket) {
					publicChatMode = var3.readUnsignedByteAdd();
					tradeChatMode = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				Widget var88;
				if (ServerPacket.IF_SETPLAYERHEAD == var1.serverPacket) {
					var22 = var3.readUnsignedIntME();
					var88 = ClientPreferences.widgetDefinition.method7286(var22);
					var88.modelType = 3;
					var88.modelId = class152.localPlayer.appearance.getChatHeadId();
					ScriptFrame.invalidateWidget(var88);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CLAN_CHANNEL_DELTA == var1.serverPacket) {
					field550 = cycleCntr;
					var71 = var3.readByte();
					class166 var94 = new class166(var3);
					ClanChannel var107;
					if (var71 >= 0) {
						var107 = currentClanChannels[var71];
					} else {
						var107 = PendingSpawn.guestClanChannel;
					}

					if (var107 == null) {
						this.method1382(var71);
						var1.serverPacket = null;
						return true;
					}

					if (var94.field1832 > var107.field1849) {
						this.method1382(var71);
						var1.serverPacket = null;
						return true;
					}

					if (var94.field1832 < var107.field1849) {
						var1.serverPacket = null;
						return true;
					}

					var94.method3858(var107);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_REBOOT_TIMER == var1.serverPacket) {
					rebootTimer = var3.readUnsignedShortAddLE() * 30;
					field553 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				boolean var93;
				if (ServerPacket.field3553 == var1.serverPacket) {
					var93 = var3.readUnsignedByteAdd() == 1;
					var5 = var3.readUnsignedIntME();
					var23 = ClientPreferences.widgetDefinition.method7286(var5);
					if (var93 != var23.isHidden) {
						var23.isHidden = var93;
						ScriptFrame.invalidateWidget(var23);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_TRADING_POST == var1.serverPacket) {
					var93 = var3.readUnsignedByte() == 1;
					if (var93) {
						class6.field12 = class180.method3973() - var3.readLong();
						class143.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						class143.grandExchangeEvents = null;
					}

					field552 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETMODEL == var1.serverPacket) {
					var22 = var3.readUnsignedShort();
					var5 = var3.readUnsignedIntLE();
					var23 = ClientPreferences.widgetDefinition.method7286(var5);
					if (var23.modelType != 1 || var22 != var23.modelId) {
						var23.modelType = 1;
						var23.modelId = var22;
						ScriptFrame.invalidateWidget(var23);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VARP_LARGE == var1.serverPacket) {
					var22 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedIntIME();
					Varps.Varps_temp[var22] = var5;
					if (Varps.Varps_main[var22] != var5) {
						Varps.Varps_main[var22] = var5;
					}

					class172.changeGameOptions(var22);
					changedVarps[++changedVarpCount - 1 & 31] = var22;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_JINGLE == var1.serverPacket) {
					var22 = var3.readUnsignedShortAddLE();
					if (var22 == 65535) {
						var22 = -1;
					}

					var5 = var3.method10903();
					class143.method3620(var22, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_ACTIVE_WORLD == var1.serverPacket) {
					var22 = var3.readShort();
					var5 = var3.readUnsignedByte();
					if (var22 == -1) {
						Sound.topLevelWorldView.plane = var5;
						class330.worldView = Sound.topLevelWorldView;
					} else {
						WorldEntity var103 = (WorldEntity)Sound.topLevelWorldView.worldEntities.get((long)var22);
						if (var103 == null) {
							throw new RuntimeException("No valid ClientWorldEntity with ID " + var22);
						}

						var103.worldView.plane = var5;
						class330.worldView = var103.worldView;
					}

					var1.serverPacket = null;
					return true;
				}

				String var40;
				if (ServerPacket.MESSAGE_FRIEND_PRIVATE == var1.serverPacket) {
					var55 = var3.readStringCp1252NullTerminated();
					var30 = var3.readLong();
					var32 = (long)var3.readUnsignedShort();
					var34 = (long)var3.readMedium();
					PlayerType var37 = (PlayerType)class175.findEnumerated(MusicPatchNode2.PlayerType_values(), var3.readUnsignedByte());
					long var110 = var34 + (var32 << 32);
					boolean var68 = false;

					for (var15 = 0; var15 < 100; ++var15) {
						if (var110 == crossWorldMessageIds[var15]) {
							var68 = true;
							break;
						}
					}

					if (var37.isUser && Actor.friendSystem.isIgnored(new Username(var55, AbstractUserComparator.loginType))) {
						var68 = true;
					}

					if (!var68 && field332 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var110;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var40 = AbstractFont.escapeBrackets(MoveSpeed.method6102(class162.method3825(var3)));
						if (var37.modIcon != -1) {
							class518.addChatMessage(9, TextureProvider.method5483(var37.modIcon) + var55, var40, FloatProjection.base37DecodeLong(var30));
						} else {
							class518.addChatMessage(9, var55, var40, FloatProjection.base37DecodeLong(var30));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETPOSITION == var1.serverPacket) {
					var22 = var3.readShortLE();
					var5 = var3.readUnsignedIntLE();
					var6 = var3.readSignedShort();
					var99 = ClientPreferences.widgetDefinition.method7286(var5);
					if (var6 != var99.rawX || var22 != var99.rawY || var99.xAlignment != 0 || var99.yAlignment != 0) {
						var99.rawX = var6;
						var99.rawY = var22;
						var99.xAlignment = 0;
						var99.yAlignment = 0;
						ScriptFrame.invalidateWidget(var99);
						this.alignWidget(var99);
						if (var99.type == 0) {
							ClanSettings.revalidateWidgetScroll(ClientPreferences.widgetDefinition.Widget_interfaceComponents[var5 >> 16], var99, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OBJ_OPFILTER == var1.serverPacket) {
					WallDecoration.method5857(class325.field3486);
					var1.serverPacket = null;
					return true;
				}

				Node var29;
				long var41;
				if (ServerPacket.IF_SET_EVENTS == var1.serverPacket) {
					var22 = var3.readUnsignedShort();
					if (var22 == 65535) {
						var22 = -1;
					}

					var5 = var3.readUnsignedIntIME();
					var6 = var3.readUnsignedShort();
					if (var6 == 65535) {
						var6 = -1;
					}

					var7 = var3.readInt();
					var8 = class31.method456(var7);

					for (var9 = var22; var9 <= var6; ++var9) {
						var41 = ((long)var5 << 32) + (long)var9;
						var29 = widgetFlags.get(var41);
						if (var29 != null) {
							var29.remove();
						}

						widgetFlags.put(new WidgetConfigNode(var7, var8), var41);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VAR_CLAN == var1.serverPacket) {
					if (class389.field4604 == null) {
						class389.field4604 = new class515(SequenceDefinition.field2343);
					}

					class589 var58 = SequenceDefinition.field2343.method10067(var3);
					class389.field4604.field5336.vmethod10500(var58.field5763, var58.field5761);
					field545[++field388 - 1 & 31] = var58.field5763;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OBJ_DEL == var1.serverPacket) {
					WallDecoration.method5857(class325.field3484);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_CLOSESUB == var1.serverPacket) {
					var22 = var3.readInt();
					InterfaceParent var92 = (InterfaceParent)interfaceParents.get((long)var22);
					if (var92 != null) {
						ApproximateRouteStrategy.closeInterface(var92, true);
					}

					if (meslayerContinueWidget != null) {
						ScriptFrame.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_WORLDENTITY == var1.serverPacket) {
					class113.method3284(Sound.topLevelWorldView, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SYNC_CLIENT_VARCACHE == var1.serverPacket) {
					for (var22 = 0; var22 < Varps.Varps_main.length; ++var22) {
						if (Varps.Varps_main[var22] != Varps.Varps_temp[var22]) {
							Varps.Varps_main[var22] = Varps.Varps_temp[var22];
							class172.changeGameOptions(var22);
							changedVarps[++changedVarpCount - 1 & 31] = var22;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_INFO_SMALL_VIEWPORT == var1.serverPacket) {
					class6.updateNpcs(class330.worldView, true, var3);
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
						var23 = ClientPreferences.widgetDefinition.method7286(var22);
					} else {
						var23 = null;
					}

					if (var23 != null) {
						for (var7 = 0; var7 < var23.itemIds.length; ++var7) {
							var23.itemIds[var7] = 0;
							var23.itemQuantities[var7] = 0;
						}
					}

					UserComparator3.clearItemContainer(var5);
					var7 = var3.readUnsignedShort();

					for (var8 = 0; var8 < var7; ++var8) {
						var9 = var3.readUnsignedShort();
						var10 = var3.readUnsignedByteNeg();
						if (var10 == 255) {
							var10 = var3.readInt();
						}

						if (var23 != null && var8 < var23.itemIds.length) {
							var23.itemIds[var8] = var9;
							var23.itemQuantities[var8] = var10;
						}

						UserComparator9.itemContainerSetItem(var5, var8, var9 - 1, var10);
					}

					if (var23 != null) {
						ScriptFrame.invalidateWidget(var23);
					}

					class134.method3521();
					changedItemContainers[++changedItemsCount - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_SET_SEQUENCE == var1.serverPacket) {
					var6 = var3.readUnsignedByte();
					var22 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShortAddLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					NPC var106 = (NPC)class330.worldView.npcs.get((long)var22);
					if (var106 != null) {
						if (var5 == var106.sequence && var5 != -1) {
							var8 = VarpDefinition.SequenceDefinition_get(var5).restartMode;
							if (var8 == 1) {
								var106.sequenceFrame = 0;
								var106.sequenceFrameCycle = 0;
								var106.sequenceDelay = var6;
								var106.field1066 = 0;
							} else if (var8 == 2) {
								var106.field1066 = 0;
							}
						} else if (var5 == -1 || var106.sequence == -1 || VarpDefinition.SequenceDefinition_get(var5).field2360 >= VarpDefinition.SequenceDefinition_get(var106.sequence).field2360) {
							var106.sequence = var5;
							var106.sequenceFrame = 0;
							var106.sequenceFrameCycle = 0;
							var106.sequenceDelay = var6;
							var106.field1066 = 0;
							var106.field1048 = var106.pathLength;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_SETANGLE == var1.serverPacket) {
					isCameraLocked = true;
					field459 = false;
					field543 = false;
					Messages.field1260 = var3.readUnsignedByte();
					class134.field1583 = var3.readUnsignedByte();
					class27.field131 = var3.readUnsignedShort();
					IntHashTable.field5141 = var3.readUnsignedByte();
					HealthBarUpdate.field1090 = var3.readUnsignedByte();
					if (HealthBarUpdate.field1090 >= 100) {
						var22 = Coord.method7242(Messages.field1260);
						var5 = Coord.method7242(class134.field1583);
						var6 = DevicePcmPlayerProvider.getTileHeight(Sound.topLevelWorldView, var22, var5, Sound.topLevelWorldView.plane) - class27.field131;
						var7 = var22 - class6.cameraX;
						var8 = var6 - ClientPreferences.cameraY;
						var9 = var5 - GrandExchangeOfferAgeComparator.cameraZ;
						var10 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9));
						WorldMapData_1.cameraPitch = (int)(Math.atan2((double)var8, (double)var10) * 325.9490051269531D) & 2047;
						class455.cameraYaw = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531D) & 2047;
						if (WorldMapData_1.cameraPitch < 128) {
							WorldMapData_1.cameraPitch = 128;
						}

						if (WorldMapData_1.cameraPitch > 383) {
							WorldMapData_1.cameraPitch = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var74;
				if (ServerPacket.IF_SETANGLE == var1.serverPacket) {
					var22 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedShortAddLE();
					var6 = var3.readUnsignedShortAdd();
					var7 = var3.readUnsignedIntIME();
					var74 = ClientPreferences.widgetDefinition.method7286(var7);
					if (var6 != var74.modelAngleX || var5 != var74.modelAngleY || var22 != var74.modelZoom) {
						var74.modelAngleX = var6;
						var74.modelAngleY = var5;
						var74.modelZoom = var22;
						ScriptFrame.invalidateWidget(var74);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OCULUS_SYNC == var1.serverPacket) {
					var22 = var3.readInt();
					if (var22 != field477) {
						field477 = var22;
						class63.method2103();
					}

					var1.serverPacket = null;
					return true;
				}

				InterfaceParent var95;
				if (ServerPacket.IF_OPENSUB == var1.serverPacket) {
					var22 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedByteAdd();
					var6 = var3.readUnsignedIntME();
					var95 = (InterfaceParent)interfaceParents.get((long)var6);
					if (var95 != null) {
						ApproximateRouteStrategy.closeInterface(var95, var22 != var95.group);
					}

					class404.openInterface(var6, var22, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETCOLOUR == var1.serverPacket) {
					var22 = var3.readUnsignedShort();
					var5 = var3.readUnsignedIntLE();
					var6 = var22 >> 10 & 31;
					var7 = var22 >> 5 & 31;
					var8 = var22 & 31;
					var9 = (var7 << 11) + (var6 << 19) + (var8 << 3);
					Widget var104 = ClientPreferences.widgetDefinition.method7286(var5);
					if (var9 != var104.color) {
						var104.color = var9;
						ScriptFrame.invalidateWidget(var104);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MINIMAP_TOGGLE == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RESET_INTERACTION_MODE == var1.serverPacket) {
					var22 = var3.readShort();
					worldViewManager.method2230(var22);
					var1.serverPacket = null;
					return true;
				}

				long var43;
				InterfaceParent var89;
				if (ServerPacket.field3549 == var1.serverPacket) {
					var22 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.method795(false);
						KeyHandler.method373(rootInterface);
						class182.runWidgetOnLoadListener(rootInterface);

						for (var7 = 0; var7 < 100; ++var7) {
							validRootWidgets[var7] = true;
						}
					}

					for (; var6-- > 0; var89.field886 = true) {
						var7 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var9 = var3.readUnsignedByte();
						var89 = (InterfaceParent)interfaceParents.get((long)var7);
						if (var89 != null && var8 != var89.group) {
							ApproximateRouteStrategy.closeInterface(var89, true);
							var89 = null;
						}

						if (var89 == null) {
							var89 = class404.openInterface(var7, var8, var9);
						}
					}

					for (var95 = (InterfaceParent)interfaceParents.first(); var95 != null; var95 = (InterfaceParent)interfaceParents.next()) {
						if (var95.field886) {
							var95.field886 = false;
						} else {
							ApproximateRouteStrategy.closeInterface(var95, true);
						}
					}

					widgetFlags = new NodeHashTable(512);

					while (var3.offset < var22) {
						var7 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var9 = var3.readUnsignedShort();
						var10 = var3.readInt();
						var11 = class31.method456(var10);

						for (var12 = var8; var12 <= var9; ++var12) {
							var43 = (long)var12 + ((long)var7 << 32);
							widgetFlags.put(new WidgetConfigNode(var10, var11), var43);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_ROTATE_SPEED == var1.serverPacket) {
					var22 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShort();
					var6 = var3.readUnsignedShortLE();
					var99 = ClientPreferences.widgetDefinition.method7286(var22);
					var99.field4101 = var6 + (var5 << 16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_PLAYERMODEL_BASECOLOUR == var1.serverPacket) {
					var22 = var3.readUnsignedByteAdd();
					var5 = var3.readUnsignedByteNeg();
					var6 = var3.readUnsignedIntIME();
					var99 = ClientPreferences.widgetDefinition.method7286(var6);
					var99.field4111.method7386(var5, var22);
					ScriptFrame.invalidateWidget(var99);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.URL_OPEN == var1.serverPacket) {
					byte[] var57 = new byte[var1.serverPacketLength];
					var3.method10791(var57, 0, var57.length);
					Buffer var90 = new Buffer(var57);
					var73 = var90.readStringCp1252NullTerminated();
					Calendar.openURL(var73, true, false);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETANIM == var1.serverPacket) {
					var22 = var3.readUnsignedIntIME();
					var5 = var3.readShort();
					var23 = ClientPreferences.widgetDefinition.method7286(var22);
					if (var5 != var23.sequenceId || var5 == -1) {
						var23.sequenceId = var5;
						var23.modelFrame = 0;
						var23.modelFrameCycle = 0;
						ScriptFrame.invalidateWidget(var23);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.DYNAMICOBJECT_SPAWN == var1.serverPacket) {
					var9 = var3.readUnsignedByte();
					var10 = var9 >> 2;
					var11 = var9 & 3;
					var12 = field524[var10];
					var6 = var3.method10903();
					var22 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var7 = var22 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					var65 = var3.readUnsignedShort();
					if (0 <= var7 && var7 < 103 && 0 <= var8 && var8 < 103) {
						DirectByteArrayCopier.method7208(var7, var8, var10, var11, var12, var65);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SONG_STOP == var1.serverPacket) {
					var22 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShort();
					HttpResponse.method306(var22, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3639 == var1.serverPacket) {
					var22 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.method795(false);
						KeyHandler.method373(rootInterface);
						class182.runWidgetOnLoadListener(rootInterface);

						for (var7 = 0; var7 < 100; ++var7) {
							validRootWidgets[var7] = true;
						}
					}

					for (; var6-- > 0; var89.field886 = true) {
						var7 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var9 = var3.readUnsignedByte();
						var89 = (InterfaceParent)interfaceParents.get((long)var7);
						if (var89 != null && var8 != var89.group) {
							ApproximateRouteStrategy.closeInterface(var89, true);
							var89 = null;
						}

						if (var89 == null) {
							var89 = class404.openInterface(var7, var8, var9);
						}
					}

					for (var95 = (InterfaceParent)interfaceParents.first(); var95 != null; var95 = (InterfaceParent)interfaceParents.next()) {
						if (var95.field886) {
							var95.field886 = false;
						} else {
							ApproximateRouteStrategy.closeInterface(var95, true);
						}
					}

					widgetFlags = new NodeHashTable(512);

					while (var3.offset < var22) {
						var7 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var9 = var3.readUnsignedShort();
						var10 = var3.readInt();
						var11 = var3.readInt();

						for (var12 = var8; var12 <= var9; ++var12) {
							var43 = ((long)var7 << 32) + (long)var12;
							widgetFlags.put(new WidgetConfigNode(var10, var11), var43);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_CLEAR == var1.serverPacket) {
					var22 = var3.readInt();
					var88 = ClientPreferences.widgetDefinition.method7286(var22);

					for (var6 = 0; var6 < var88.itemIds.length; ++var6) {
						var88.itemIds[var6] = -1;
						var88.itemIds[var6] = 0;
					}

					ScriptFrame.invalidateWidget(var88);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.TRIGGER_ONDIALOG_ABORT == var1.serverPacket) {
					if (rootInterface != -1) {
						UserComparator10.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED == var1.serverPacket) {
					field405 = var3.readUnsignedByteAdd();
					Ignored.field5198 = var3.readUnsignedByte();
					HitSplatDefinition.field2180 = var3.readUnsignedByteNeg();

					while (var3.offset < var1.serverPacketLength) {
						var22 = var3.readUnsignedByte();
						class325 var86 = class139.method3586()[var22];
						WallDecoration.method5857(var86);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_SPOTANIM == var1.serverPacket) {
					var22 = var3.readUnsignedShort();
					var75 = (NPC)class330.worldView.npcs.get((long)var22);
					var7 = var3.readUnsignedByte();
					var6 = var3.readUnsignedShortLE();
					var5 = var3.readInt();
					if (var75 != null) {
						var75.updateSpotAnimation(var7, var6, var5 >> 16, var5 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_PRIVATE == var1.serverPacket) {
					var55 = var3.readStringCp1252NullTerminated();
					var30 = (long)var3.readUnsignedShort();
					var32 = (long)var3.readMedium();
					PlayerType var26 = (PlayerType)class175.findEnumerated(MusicPatchNode2.PlayerType_values(), var3.readUnsignedByte());
					var41 = var32 + (var30 << 32);
					var61 = false;

					for (var65 = 0; var65 < 100; ++var65) {
						if (var41 == crossWorldMessageIds[var65]) {
							var61 = true;
							break;
						}
					}

					if (Actor.friendSystem.isIgnored(new Username(var55, AbstractUserComparator.loginType))) {
						var61 = true;
					}

					if (!var61 && field332 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var41;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var36 = AbstractFont.escapeBrackets(MoveSpeed.method6102(class162.method3825(var3)));
						byte var64;
						if (var26.isPrivileged) {
							var64 = 7;
						} else {
							var64 = 3;
						}

						if (var26.modIcon != -1) {
							GrandExchangeOfferWorldComparator.addGameMessage(var64, TextureProvider.method5483(var26.modIcon) + var55, var36);
						} else {
							GrandExchangeOfferWorldComparator.addGameMessage(var64, var55, var36);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETNPCHEAD_ACTIVE == var1.serverPacket) {
					var22 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShortAddLE();
					var23 = ClientPreferences.widgetDefinition.method7286(var22);
					if (var23.modelType != 6 || var5 != var23.modelId) {
						var23.modelType = 6;
						var23.modelId = var5;
						ScriptFrame.invalidateWidget(var23);
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
						var56.field626 = "beta";
						MusicPatch.field3774 = true;
					} else {
						MusicPatch.field3774 = false;
					}

					HealthBarConfig.updateGameState(45);
					var2.close();
					var2 = null;
					class291.changeWorld(var56);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.HEAT_MAP == var1.serverPacket) {
					var93 = var3.readBoolean();
					if (var93) {
						if (class448.field5001 == null) {
							class448.field5001 = new class416();
						}
					} else {
						class448.field5001 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_ANIM_SPECIFIC == var1.serverPacket) {
					var22 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedByte();
					if (var22 == 65535) {
						var22 = -1;
					}

					GraphicsObject.performPlayerAnimation(class152.localPlayer, var22, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_PLAYERMODEL_BODYTYPE == var1.serverPacket) {
					var22 = var3.readUnsignedIntLE();
					var5 = var3.readUnsignedByteAdd();
					var23 = ClientPreferences.widgetDefinition.method7286(var22);
					var23.field4111.method7315(class152.localPlayer.appearance.gender, var5);
					ScriptFrame.invalidateWidget(var23);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3563 == var1.serverPacket) {
					var22 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedShort();
					class175.queueSoundEffect(var22, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_PLAYERMODEL_OBJ == var1.serverPacket) {
					var22 = var3.readUnsignedIntLE();
					var5 = var3.readUnsignedIntME();
					var23 = ClientPreferences.widgetDefinition.method7286(var22);
					var23.field4111.method7332(var5);
					ScriptFrame.invalidateWidget(var23);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CLAN_SETTINGS_DELTA == var1.serverPacket) {
					WorldMapSectionType.method6572();
					var71 = var3.readByte();
					class152 var83 = new class152(var3);
					ClanSettings var84;
					if (var71 >= 0) {
						var84 = currentClanSettings[var71];
					} else {
						var84 = HorizontalAlignment.guestClanSettings;
					}

					if (var84 == null) {
						this.method1393(var71);
						var1.serverPacket = null;
						return true;
					}

					if (var83.field1741 > var84.field1785) {
						this.method1393(var71);
						var1.serverPacket = null;
						return true;
					}

					if (var83.field1741 < var84.field1785) {
						var1.serverPacket = null;
						return true;
					}

					var83.method3681(var84);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.FRIENDS_LIST_LOADED == var1.serverPacket) {
					Actor.friendSystem.method1498();
					field534 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_TARGET == var1.serverPacket) {
					class330.field3670 = (class379)class175.findEnumerated(class368.method7690(), var3.readUnsignedByte());
					field338 = var3.readShort();
					field339 = var3.readUnsignedShort();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RESET_CLIENT_VARCACHE == var1.serverPacket) {
					for (var22 = 0; var22 < VarpDefinition.field1910; ++var22) {
						VarpDefinition var80 = FriendSystem.VarpDefinition_get(var22);
						if (var80 != null) {
							Varps.Varps_temp[var22] = 0;
							Varps.Varps_main[var22] = 0;
						}
					}

					class134.method3521();
					changedVarpCount += 32;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_PLAYERMODEL_SELF == var1.serverPacket) {
					var93 = var3.readUnsignedByte() == 1;
					var5 = var3.readInt();
					var23 = ClientPreferences.widgetDefinition.method7286(var5);
					var23.method7779(class152.localPlayer.appearance, var93);
					ScriptFrame.invalidateWidget(var23);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VAR_CLAN_DISABLE == var1.serverPacket) {
					class389.field4604 = null;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SWAP == var1.serverPacket) {
					var22 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedShortAddLE();
					var6 = var3.readUnsignedShortLE();
					var7 = var3.readUnsignedShortLE();
					FloorDecoration.method4979(var22, var5, var6, var7);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3572 == var1.serverPacket) {
					class166.field1835 = var3.readBoolean();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_STOP_TRANSIT == var1.serverPacket) {
					var22 = var3.readUnsignedShortAddLE();
					HorizontalAlignment.method4144(var22);
					changedItemContainers[++changedItemsCount - 1 & 31] = var22 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OBJ_RESET_CUSTOMIZATION == var1.serverPacket) {
					WallDecoration.method5857(class325.field3482);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_NPC_UPDATE_ORIGIN == var1.serverPacket) {
					class1.field4 = var3.readUnsignedByte();
					Player.field938 = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_LOOKAT_EASED_COORD == var1.serverPacket) {
					isCameraLocked = true;
					field459 = false;
					field543 = true;
					Messages.field1260 = var3.readUnsignedByte();
					class134.field1583 = var3.readUnsignedByte();
					class27.field131 = var3.readUnsignedShort();
					var22 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = Coord.method7242(Messages.field1260);
					var7 = Coord.method7242(class134.field1583);
					var8 = DevicePcmPlayerProvider.getTileHeight(Sound.topLevelWorldView, var6, var7, Sound.topLevelWorldView.plane) - class27.field131;
					var9 = var6 - class6.cameraX;
					var10 = var8 - ClientPreferences.cameraY;
					var11 = var7 - GrandExchangeOfferAgeComparator.cameraZ;
					double var38 = Math.sqrt((double)(var11 * var11 + var9 * var9));
					var14 = HttpResponse.method302((int)(Math.atan2((double)var10, var38) * 325.9490051269531D) & 2047);
					var15 = class475.method9427((int)(Math.atan2((double)var9, (double)var11) * -325.9490051269531D) & 2047);
					field583 = new class540(WorldMapData_1.cameraPitch, var14, var22, var5);
					field582 = new class540(class455.cameraYaw, var15, var22, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_SHAKE == var1.serverPacket) {
					var22 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedByte();
					var7 = var3.readUnsignedByte();
					field584[var22] = true;
					field585[var22] = var5;
					field586[var22] = var6;
					field587[var22] = var7;
					field588[var22] = 0;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3637 == var1.serverPacket) {
					var22 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedIntME();
					var6 = var3.readUnsignedShort();
					if (var6 == 65535) {
						var6 = -1;
					}

					var7 = var3.readInt();
					var8 = var3.readUnsignedShort();
					if (var8 == 65535) {
						var8 = -1;
					}

					for (var9 = var8; var9 <= var6; ++var9) {
						var41 = ((long)var7 << 32) + (long)var9;
						var29 = widgetFlags.get(var41);
						if (var29 != null) {
							var29.remove();
						}

						widgetFlags.put(new WidgetConfigNode(var22, var5), var41);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3564 == var1.serverPacket) {
					var22 = var3.readShort();
					class508 var77 = (class508)class175.findEnumerated(RestClientThreadFactory.method218(), var3.readUnsignedByte());
					class506 var78 = (class506)class175.findEnumerated(class168.method3866(), var3.readUnsignedByte());
					if (var22 == -2) {
						worldViewManager.method2251(var77, var78);
					} else {
						worldViewManager.method2229(var22, var77, var78);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_REGION == var1.serverPacket) {
					SoundCache.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_MOVESUB == var1.serverPacket) {
					var22 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedIntLE();
					InterfaceParent var76 = (InterfaceParent)interfaceParents.get((long)var22);
					var95 = (InterfaceParent)interfaceParents.get((long)var5);
					if (var95 != null) {
						ApproximateRouteStrategy.closeInterface(var95, var76 == null || var76.group != var95.group);
					}

					if (var76 != null) {
						var76.remove();
						interfaceParents.put(var76, (long)var5);
					}

					var74 = ClientPreferences.widgetDefinition.method7286(var22);
					if (var74 != null) {
						ScriptFrame.invalidateWidget(var74);
					}

					var74 = ClientPreferences.widgetDefinition.method7286(var5);
					if (var74 != null) {
						ScriptFrame.invalidateWidget(var74);
						ClanSettings.revalidateWidgetScroll(ClientPreferences.widgetDefinition.Widget_interfaceComponents[var74.id >>> 16], var74, true);
					}

					if (rootInterface != -1) {
						UserComparator10.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOC_MERGEPLAYER == var1.serverPacket) {
					WallDecoration.method5857(class325.field3491);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_LOOKAT_EASED_ANGLE_RELATIVE == var1.serverPacket) {
					isCameraLocked = true;
					field459 = false;
					field543 = true;
					var22 = var3.readShort();
					var5 = var3.readShort();
					var6 = HttpResponse.method302(var5 + WorldMapData_1.cameraPitch & 2027);
					var7 = var22 + class455.cameraYaw;
					var8 = var3.readUnsignedShort();
					var9 = var3.readUnsignedByte();
					field583 = new class540(WorldMapData_1.cameraPitch, var6, var8, var9);
					field582 = new class540(class455.cameraYaw, var7, var8, var9);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SERVER_TICK_END == var1.serverPacket) {
					++serverCycle;
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
							hintArrowSubY = 4096;
						}

						if (hintArrowType == 3) {
							hintArrowSubX = 0;
							hintArrowSubY = 4096;
						}

						if (hintArrowType == 4) {
							hintArrowSubX = 128;
							hintArrowSubY = 4096;
						}

						if (hintArrowType == 5) {
							hintArrowSubX = 64;
							hintArrowSubY = 0;
						}

						if (hintArrowType == 6) {
							hintArrowSubX = 64;
							hintArrowSubY = 8192;
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

				if (ServerPacket.MAP_ANIM == var1.serverPacket) {
					WallDecoration.method5857(class325.field3488);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_TEXT == var1.serverPacket) {
					var55 = var3.readStringCp1252NullTerminated();
					var5 = var3.readUnsignedIntME();
					var23 = ClientPreferences.widgetDefinition.method7286(var5);
					if (!var55.equals(var23.text)) {
						var23.text = var55;
						ScriptFrame.invalidateWidget(var23);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_FRIEND_CHAT_CHANNEL_FULL_V2 == var1.serverPacket) {
					return this.method789(var1);
				}

				if (ServerPacket.field3511 == var1.serverPacket) {
					class134.method3521();
					weight = var3.readShort();
					field553 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_SPOTANIM == var1.serverPacket) {
					var7 = var3.readUnsignedByteNeg();
					var22 = var3.readUnsignedShortAdd();
					Player var24;
					if (var22 == localPlayerIndex) {
						var24 = class152.localPlayer;
					} else {
						var24 = (Player)class330.worldView.players.get((long)var22);
					}

					var5 = var3.readUnsignedShortAdd();
					var6 = var3.readUnsignedIntIME();
					if (var24 != null) {
						var24.updateSpotAnimation(var7, var5, var6 >> 16, var6 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_MOVE_TO == var1.serverPacket) {
					isCameraLocked = true;
					field459 = false;
					field578 = false;
					Interpreter.field676 = var3.readUnsignedByte();
					AABB.field2811 = var3.readUnsignedByte();
					class242.field2663 = var3.readUnsignedShort();
					class148.field1710 = var3.readUnsignedByte();
					WorldMapData_0.field3133 = var3.readUnsignedByte();
					if (WorldMapData_0.field3133 >= 100) {
						class6.cameraX = Coord.method7242(Interpreter.field676);
						GrandExchangeOfferAgeComparator.cameraZ = Coord.method7242(AABB.field2811);
						ClientPreferences.cameraY = DevicePcmPlayerProvider.getTileHeight(Sound.topLevelWorldView, class6.cameraX, GrandExchangeOfferAgeComparator.cameraZ, Sound.topLevelWorldView.plane) - class242.field2663;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OBJ_COUNT == var1.serverPacket) {
					WallDecoration.method5857(class325.field3487);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_PLAYER_OP == var1.serverPacket) {
					var22 = var3.readUnsignedByteAdd();
					var5 = var3.readUnsignedByte();
					var73 = var3.readStringCp1252NullTerminated();
					if (var5 >= 1 && var5 <= 8) {
						if (var73.equalsIgnoreCase("null")) {
							var73 = null;
						}

						playerMenuActions[var5 - 1] = var73;
						playerOptionsPriorities[var5 - 1] = var22 == 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_RESET == var1.serverPacket) {
					field459 = false;
					isCameraLocked = false;
					field578 = false;
					field543 = false;
					Messages.field1260 = 0;
					class134.field1583 = 0;
					class27.field131 = 0;
					field580 = false;
					IntHashTable.field5141 = 0;
					HealthBarUpdate.field1090 = 0;
					WorldMapData_0.field3133 = 0;
					class148.field1710 = 0;
					Interpreter.field676 = 0;
					AABB.field2811 = 0;
					class242.field2663 = 0;
					field581 = null;
					field583 = null;
					field582 = null;

					for (var22 = 0; var22 < 5; ++var22) {
						field584[var22] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PING_STATISTICS_REQUEST == var1.serverPacket) {
					var22 = var3.readInt();
					var5 = var3.readInt();
					var6 = class190.getGcDuration();
					PacketBufferNode var28 = class139.getPacketBufferNode(ClientPacket.PING_STATISTICS, packetWriter.isaacCipher);
					var28.packetBuffer.writeByte(var6);
					var28.packetBuffer.writeByteNeg(GameEngine.fps);
					var28.packetBuffer.writeIntLE(var22);
					var28.packetBuffer.writeIntLE(var5);
					packetWriter.addNode(var28);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3630 == var1.serverPacket) {
					field336 = var3.readStringCp1252NullTerminated();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOC_DEL == var1.serverPacket) {
					WallDecoration.method5857(class325.field3493);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OBJ_SET_CUSTOMIZATION == var1.serverPacket) {
					WallDecoration.method5857(class325.field3481);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3641 == var1.serverPacket) {
					var22 = var3.readUnsignedIntLE();
					var5 = Coord.method7222(var22);
					var6 = Coord.method7223(var22);
					var7 = Coord.method7224(var22);
					var8 = var3.method10896();
					var9 = var3.readUnsignedShortLE();
					var10 = var3.readUnsignedIntME();
					var11 = Coord.method7222(var10);
					var12 = Coord.method7223(var10);
					var65 = Coord.method7224(var10);
					var14 = var3.readUnsignedByteSub();
					var15 = var3.method10896();
					var16 = var3.readUnsignedShortLE();
					var17 = var3.readUnsignedShortLE();
					var18 = var3.readUnsignedShort();
					var19 = var3.readUnsignedShortLE();
					int var45 = var3.readUnsignedShortLE();
					if (var17 != 65535) {
						Projectile var21 = new Projectile(var5, var6, var7, var9, var15, var11, var12, var65, var18, var8, var17, var16 + cycle, var19 + cycle, var14, var45);
						projectiles.addFirst(var21);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_SITE_SETTINGS == var1.serverPacket) {
					Canvas.method336(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_STAT == var1.serverPacket) {
					class134.method3521();
					var22 = var3.readUnsignedByte();
					var5 = var3.readUnsignedIntIME();
					var6 = var3.readUnsignedByteNeg();
					var7 = var3.readUnsignedByte();
					experience[var22] = var5;
					currentLevels[var22] = var7;
					levels[var22] = 1;
					field345[var22] = var6;

					for (var8 = 0; var8 < 98; ++var8) {
						if (var5 >= Skills.Skills_experienceTable[var8]) {
							levels[var22] = var8 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var22;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MAP_PROJANIM == var1.serverPacket) {
					WallDecoration.method5857(class325.field3485);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REFLECTION_CHECKER == var1.serverPacket) {
					FloatProjection.readReflectionCheck(var3, var1.serverPacketLength);
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
						var23 = ClientPreferences.widgetDefinition.method7286(var22);
					} else {
						var23 = null;
					}

					for (; var3.offset < var1.serverPacketLength; UserComparator9.itemContainerSetItem(var5, var7, var8 - 1, var9)) {
						var7 = var3.readUShortSmart();
						var8 = var3.readUnsignedShort();
						var9 = 0;
						if (var8 != 0) {
							var9 = var3.readUnsignedByte();
							if (var9 == 255) {
								var9 = var3.readInt();
							}
						}

						if (var23 != null && var7 >= 0 && var7 < var23.itemIds.length) {
							var23.itemIds[var7] = var8;
							var23.itemQuantities[var7] = var9;
						}
					}

					if (var23 != null) {
						ScriptFrame.invalidateWidget(var23);
					}

					class134.method3521();
					changedItemContainers[++changedItemsCount - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_FRIENDS_CHAT == var1.serverPacket) {
					var71 = var3.readByte();
					var25 = var3.readStringCp1252NullTerminated();
					long var46 = (long)var3.readUnsignedShort();
					long var48 = (long)var3.readMedium();
					PlayerType var27 = (PlayerType)class175.findEnumerated(MusicPatchNode2.PlayerType_values(), var3.readUnsignedByte());
					long var50 = var48 + (var46 << 32);
					boolean var13 = false;
					ClanChannel var52 = null;
					var52 = var71 >= 0 ? currentClanChannels[var71] : PendingSpawn.guestClanChannel;
					if (var52 == null) {
						var13 = true;
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var27.isUser && Actor.friendSystem.isIgnored(new Username(var25, AbstractUserComparator.loginType))) {
									var13 = true;
								}
								break;
							}

							if (var50 == crossWorldMessageIds[var15]) {
								var13 = true;
								break;
							}

							++var15;
						}
					}

					if (!var13) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var50;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var40 = AbstractFont.escapeBrackets(class162.method3825(var3));
						var16 = var71 >= 0 ? 41 : 44;
						if (var27.modIcon != -1) {
							class518.addChatMessage(var16, TextureProvider.method5483(var27.modIcon) + var25, var40, var52.name);
						} else {
							class518.addChatMessage(var16, var25, var40, var52.name);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOGOUT == var1.serverPacket) {
					var22 = var3.readUnsignedByte();
					Clock.forceDisconnect(var22);
					var1.serverPacket = null;
					return false;
				}

				class569.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1266 != null ? var1.field1266.id : -1) + "," + (var1.field1276 != null ? var1.field1276.id : -1) + "," + var1.serverPacketLength, (Throwable)null);
				class378.logOut();
			} catch (IOException var53) {
				VarpDefinition.method3991();
			} catch (Exception var54) {
				var25 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1266 != null ? var1.field1266.id : -1) + "," + (var1.field1276 != null ? var1.field1276.id : -1) + "," + var1.serverPacketLength + "," + (class152.localPlayer.pathX[0] + Sound.topLevelWorldView.baseX) + "," + (class152.localPlayer.pathY[0] + Sound.topLevelWorldView.baseY) + ",";

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) {
					var25 = var25 + var3.array[var6] + ",";
				}

				class569.RunException_sendStackTrace(var25, var54);
				class378.logOut();
			}

			return true;
		}
	}

	@ObfuscatedName("qx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1254581128"
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
					String var4 = var1.menuTargets[var3];
					var1.menuTargets[var3] = var1.menuTargets[var3 + 1];
					var1.menuTargets[var3 + 1] = var4;
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
			int var9 = MouseHandler.MouseHandler_lastButton;
			if (isMenuOpen) {
				if (var9 != 1 && (class7.mouseCam || var9 != 4) && !menu.method11501(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y)) {
					isMenuOpen = false;
					menu.invalidateWidgetsUnder();
				}

				if (var9 == 1 || !class7.mouseCam && var9 == 4) {
					menu.method11531(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					isMenuOpen = false;
					menu.invalidateWidgetsUnder();
				}
			} else if (menu.menuOptionsCount > 0) {
				var3 = class571.method10767();
				if ((var9 == 1 || !class7.mouseCam && var9 == 4) && this.shouldLeftClickOpenMenu(menu.menuOpcodes[var3], menu.menuShiftClick[var3])) {
					var9 = 2;
				}

				if (var9 == 1 || !class7.mouseCam && var9 == 4) {
					menu.method11500(var3);
				}

				if (var9 == 2) {
					this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}
			}

		}
	}

	@ObfuscatedName("qr")
	@ObfuscatedSignature(
		descriptor = "(IZB)Z",
		garbageValue = "0"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu(int var1, boolean var2) {
		return (leftClickOpensMenu && menu.menuOptionsCount > 2 || class1.method8(var1)) && !var2;
	}

	@ObfuscatedName("qp")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-319782347"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		menu.method11497(var1, var2);
		Iterator var3 = worldViewManager.iterator();

		while (var3.hasNext()) {
			WorldView var4 = (WorldView)var3.next();
			var4.scene.menuOpen(false);
		}

		isMenuOpen = true;
		menu.method11503();
	}

	@ObfuscatedName("qj")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "872661838"
	)
	final void method795(boolean var1) {
		class148.method3662(rootInterface, GameEngine.canvasWidth, GameEngine.canvasHeight, var1);
	}

	@ObfuscatedName("qq")
	@ObfuscatedSignature(
		descriptor = "(Lov;B)V",
		garbageValue = "-18"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var4 = var1.parentId == -1 ? null : ClientPreferences.widgetDefinition.getWidgetChild(var1.parentId, var1.field4127);
		int var2;
		int var3;
		if (var4 == null) {
			var2 = GameEngine.canvasWidth;
			var3 = GameEngine.canvasHeight;
		} else {
			var2 = var4.width * -1805166981;
			var3 = var4.height * -2133353239;
		}

		Occluder.alignWidgetSize(var1, var2, var3, false);
		class228.alignWidgetPosition(var1, var2, var3);
	}

	@ObfuscatedName("qe")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1674166349"
	)
	final void method922() {
		ScriptFrame.invalidateWidget(clickedWidget);
		++UserComparator7.widgetDragDuration;
		int var1;
		int var2;
		if (field535 && field532) {
			var1 = MouseHandler.MouseHandler_x;
			var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field371) {
				var1 = field371;
			}

			if (var1 + clickedWidget.width * -1805166981 > clickedWidgetParent.width * -1805166981 + field371) {
				var1 = clickedWidgetParent.width * -1805166981 + field371 - clickedWidget.width * -1805166981;
			}

			if (var2 < field568) {
				var2 = field568;
			}

			if (var2 + clickedWidget.height * -2133353239 > clickedWidgetParent.height * -2133353239 + field568) {
				var2 = clickedWidgetParent.height * -2133353239 + field568 - clickedWidget.height * -2133353239;
			}

			int var3 = var1 - field536;
			int var4 = var2 - field537;
			int var5 = clickedWidget.dragZoneSize;
			if (UserComparator7.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}

			int var6 = var1 - field371 + clickedWidgetParent.scrollX;
			int var7 = var2 - field568 + clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = clickedWidget.onDrag;
				ModeWhere.runScriptEvent(var8);
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
						ModeWhere.runScriptEvent(var8);
					}

					if (draggedOnWidget != null) {
						Widget var15 = clickedWidget;
						int var11 = class255.getWidgetFlags(var15);
						int var10 = var11 >> 17 & 7;
						int var12 = var10;
						Widget var17;
						if (var10 == 0) {
							var17 = null;
						} else {
							int var13 = 0;

							while (true) {
								if (var13 >= var12) {
									var17 = var15;
									break;
								}

								var15 = ClientPreferences.widgetDefinition.method7286(var15.parentId);
								if (var15 == null) {
									var17 = null;
									break;
								}

								++var13;
							}
						}

						if (var17 != null) {
							PacketBufferNode var16 = class139.getPacketBufferNode(ClientPacket.OPHELDD, packetWriter.isaacCipher);
							var16.packetBuffer.writeInt(draggedOnWidget.id);
							var16.packetBuffer.writeShortLE(draggedOnWidget.childIndex * -744024149);
							var16.packetBuffer.writeShortLE(clickedWidget.childIndex * -744024149);
							var16.packetBuffer.writeShortLE(draggedOnWidget.itemId);
							var16.packetBuffer.writeIntME(clickedWidget.id);
							var16.packetBuffer.writeShortAdd(clickedWidget.itemId);
							packetWriter.addNode(var16);
						}
					}
				} else if (class31.tempMenuAction != null && !this.shouldLeftClickOpenMenu(class31.tempMenuAction.opcode, class31.tempMenuAction.field723)) {
					if (menu.menuOptionsCount > 0) {
						int var14 = field536 + widgetClickX;
						int var9 = widgetClickY + field537;
						ApproximateRouteStrategy.method741(class31.tempMenuAction, var14, var9);
						class31.tempMenuAction = null;
					}
				} else {
					this.openMenu(field536 + widgetClickX, field537 + widgetClickY);
				}

				clickedWidget = null;
			}

		} else {
			if (UserComparator7.widgetDragDuration > 1) {
				if (!isDraggingWidget && menu.menuOptionsCount > 0) {
					var1 = widgetClickX + field536;
					var2 = widgetClickY + field537;
					ApproximateRouteStrategy.method741(class31.tempMenuAction, var1, var2);
					class31.tempMenuAction = null;
				}

				clickedWidget = null;
			}

		}
	}

	@ObfuscatedName("qd")
	@ObfuscatedSignature(
		descriptor = "(B)Lxm;",
		garbageValue = "65"
	)
	@Export("username")
	public Username username() {
		return class152.localPlayer != null ? class152.localPlayer.username : null;
	}

	@ObfuscatedName("qo")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1205150095"
	)
	void method1382(int var1) {
		PacketBufferNode var2 = class139.getPacketBufferNode(ClientPacket.CLAN_CHANNEL_FULL_REQUEST, packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(var1);
		packetWriter.addNode(var2);
	}

	@ObfuscatedName("qt")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1182729375"
	)
	void method1393(int var1) {
		PacketBufferNode var2 = class139.getPacketBufferNode(ClientPacket.CLAN_SETTINGS_FULL_REQUEST, packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(var1);
		packetWriter.addNode(var2);
	}

	public final void init() {
		try {
			if (this.checkHost()) {
				for (int var1 = 0; var1 <= 28; ++var1) {
					String var2 = this.getParameter(Integer.toString(var1));
					if (var2 != null) {
						int var4;
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
							var4 = Integer.parseInt(var2);
							Language var14;
							if (var4 >= 0 && var4 < Language.Language_valuesOrdered.length) {
								var14 = Language.Language_valuesOrdered[var4];
							} else {
								var14 = null;
							}

							class28.clientLanguage = var14;
							break;
						case 7:
							var4 = Integer.parseInt(var2);
							GameBuild[] var5 = Username.method11563();
							int var6 = 0;

							GameBuild var13;
							while (true) {
								if (var6 >= var5.length) {
									var13 = null;
									break;
								}

								GameBuild var7 = var5[var6];
								if (var4 == var7.buildId) {
									var13 = var7;
									break;
								}

								++var6;
							}

							Clock.field2520 = var13;
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) {
							}
							break;
						case 9:
							ApproximateRouteStrategy.field267 = var2;
							break;
						case 10:
							StudioGame[] var3 = new StudioGame[]{StudioGame.game3, StudioGame.game5, StudioGame.game4, StudioGame.oldscape, StudioGame.stellardawn, StudioGame.runescape};
							FontName.field5530 = (StudioGame)class175.findEnumerated(var3, Integer.parseInt(var2));
							if (FontName.field5530 == StudioGame.oldscape) {
								AbstractUserComparator.loginType = LoginType.oldscape;
							} else {
								AbstractUserComparator.loginType = LoginType.field5548;
							}
							break;
						case 11:
							class464.authServiceBaseUrl = var2;
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
							class134.field1582 = Integer.parseInt(var2);
							break;
						case 15:
							gameBuild = Integer.parseInt(var2);
							break;
						case 17:
							AsyncRestClient.field65 = var2;
							break;
						case 21:
							field379 = Integer.parseInt(var2);
							break;
						case 22:
							class154.gameSessionServiceBaseUrl = var2;
							break;
						case 25:
							int var8 = var2.indexOf(".");
							if (var8 == -1) {
								class574.field5666 = Integer.parseInt(var2);
							} else {
								class574.field5666 = Integer.parseInt(var2.substring(0, var8));
								Integer.parseInt(var2.substring(var8 + 1));
							}
						}
					}
				}

				HealthBarConfig.method2569();
				RouteStrategy.worldHost = this.getCodeBase().getHost();
				class330.field3669 = new JagNetThread();
				String var9 = Clock.field2520.name;
				byte var10 = 0;
				if ((worldProperties & class571.field5627.rsOrdinal()) != 0) {
					class399.field4678 = "beta";
				}

				try {
					class201.method4294("oldschool", class399.field4678, var9, var10, 25);
				} catch (Exception var11) {
					class569.RunException_sendStackTrace((String)null, var11);
				}

				class36.client = this;
				TaskHandler.field2409 = clientType;
				accessToken = System.getenv("JX_ACCESS_TOKEN");
				class150.refreshToken = System.getenv("JX_REFRESH_TOKEN");
				SecureUrlRequester.sessionId = System.getenv("JX_SESSION_ID");
				IntProjection.characterId = System.getenv("JX_CHARACTER_ID");
				AbstractSocket.method9822(System.getenv("JX_DISPLAY_NAME"));
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
					this.https = true;
				}

				if (field381 == -1) {
					if (!this.containsAccessAndRefreshToken() && !this.containsSessionAndCharacterId()) {
						field381 = 0;
					} else {
						field381 = 5;
					}
				}

				this.startThread(765, 503, 231, 1);
			}
		} catch (RuntimeException var12) {
			throw Projectile.newRunException(var12, "client.init(" + ')');
		}
	}

	protected void finalize() throws Throwable {
		class335.field3695.remove(this);
		super.finalize();
	}

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V"
	)
	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) {
			this.otlTokenRequester = var1;
			class85.method2689(10);
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

	public long getAccountHash() {
		return this.accountHash;
	}

	public boolean isOnLoginScreen() {
		return gameState == 10;
	}

	public void setClient(int var1) {
		this.clientId = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "609156043"
	)
	public static void method1438() {
		class178.field1913.clear();
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(Ldl;IIIIIIIII)V",
		garbageValue = "-1029185959"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Scene var9 = var0.scene;
		if (var3 >= 1 && var4 >= 1 && var3 <= var0.sizeX - 1 && var4 <= var0.sizeY - 1) {
			if (isLowDetail && var0.plane != var1) {
				return;
			}

			long var10 = 0L;
			boolean var12 = true;
			boolean var13 = false;
			boolean var14 = false;
			if (var2 == 0) {
				var10 = var9.getBoundaryObjectTag(var1, var3, var4);
			}

			if (var2 == 1) {
				var10 = var9.getWallDecorationTag(var1, var3, var4);
			}

			if (var2 == 2) {
				var10 = var9.getGameObjectTag(var1, var3, var4);
			}

			if (var2 == 3) {
				var10 = var9.getFloorDecorationTag(var1, var3, var4);
			}

			int var15;
			if (0L != var10) {
				var15 = var9.getObjectFlags(var1, var3, var4, var10);
				int var42 = DirectByteArrayCopier.Entity_unpackID(var10);
				int var43 = var15 & 31;
				int var44 = var15 >> 6 & 3;
				ObjectComposition var16 = HealthBarConfig.getObjectDefinition(var42);
				var0.method2534(var1, var3, var4, var16, var44);
				if (var2 == 0) {
					var9.removeBoundaryObject(var1, var3, var4);
					if (var16.interactType != 0) {
						var0.collisionMaps[var1].method5941(var3, var4, var43, var44, var16.boolean1);
					}
				}

				if (var2 == 1) {
					var9.removeWallDecoration(var1, var3, var4);
				}

				if (var2 == 2) {
					var9.removeGameObject(var1, var3, var4);
					if (var3 + var16.sizeX > var0.sizeX - 1 || var4 + var16.sizeX > var0.sizeY - 1 || var3 + var16.sizeY > var0.sizeX - 1 || var4 + var16.sizeY > var0.sizeY - 1) {
						return;
					}

					if (var16.interactType != 0) {
						var0.collisionMaps[var1].method5942(var3, var4, var16.sizeX, var16.sizeY, var44, var16.boolean1);
					}
				}

				if (var2 == 3) {
					var9.removeFloorDecoration(var1, var3, var4);
					if (var16.interactType == 1) {
						var0.collisionMaps[var1].method5943(var3, var4);
					}
				}
			}

			if (var5 >= 0) {
				var15 = var1;
				if (var1 < 3 && (var0.tileSettings[1][var3][var4] & 2) == 2) {
					var15 = var1 + 1;
				}

				CollisionMap var45 = var0.collisionMaps[var1];
				ObjectComposition var17 = HealthBarConfig.getObjectDefinition(var5);
				int var18 = var8 >= 0 ? var8 : var17.animationId;
				int var19;
				int var20;
				if (var6 != 1 && var6 != 3) {
					var19 = var17.sizeX;
					var20 = var17.sizeY;
				} else {
					var19 = var17.sizeY;
					var20 = var17.sizeX;
				}

				int var21;
				int var22;
				if (var3 + var19 <= var0.sizeX) {
					var21 = var3 + (var19 >> 1);
					var22 = var3 + (var19 + 1 >> 1);
				} else {
					var21 = var3;
					var22 = var3 + 1;
				}

				int var23;
				int var24;
				if (var20 + var4 <= var0.sizeY) {
					var23 = (var20 >> 1) + var4;
					var24 = (var20 + 1 >> 1) + var4;
				} else {
					var23 = var4;
					var24 = var4 + 1;
				}

				int[][] var25 = var0.tileHeights[var15];
				int var26 = var25[var21][var23] + var25[var22][var23] + var25[var21][var24] + var25[var22][var24] >> 2;
				int var27 = (var3 << 7) + (var19 << 6);
				int var28 = (var4 << 7) + (var20 << 6);
				Scene var29 = var0.scene;
				long var30 = class275.calculateTag(var1, var3, var4, 2, var17.int1 == 0, var5, var0.id);
				int var32 = (var6 << 6) + var7;
				if (var17.int3 == 1) {
					var32 += 256;
				}

				Object var40;
				if (var7 == 22) {
					if (var18 == -1 && var17.transforms == null) {
						var40 = var17.getModel(22, var6, var25, var27, var26, var28);
					} else {
						var40 = new DynamicObject(var0, var5, 22, var6, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
					}

					var29.newFloorDecoration(var1, var3, var4, var26, (Renderable)var40, var30, var32);
					if (var17.interactType == 1 && var45 != null) {
						var45.setBlockedByFloorDec(var3, var4);
					}
				} else if (var7 != 10 && var7 != 11) {
					if (var7 >= 12) {
						if (var18 == -1 && var17.transforms == null) {
							var40 = var17.getModel(var7, var6, var25, var27, var26, var28);
						} else {
							var40 = new DynamicObject(var0, var5, var7, var6, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
						}

						var29.method5192(var1, var3, var4, var26, 1, 1, (Renderable)var40, 0, var30, var32);
						if (var17.interactType != 0 && var45 != null) {
							var45.addGameObject(var3, var4, var19, var20, var17.boolean1);
						}
					} else if (var7 == 0) {
						if (var18 == -1 && var17.transforms == null) {
							var40 = var17.getModel(0, var6, var25, var27, var26, var28);
						} else {
							var40 = new DynamicObject(var0, var5, 0, var6, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
						}

						var29.newBoundaryObject(var1, var3, var4, var26, (Renderable)var40, (Renderable)null, Tiles.field861[var6], 0, var30, var32);
						if (var17.interactType != 0 && var45 != null) {
							var45.method5976(var3, var4, var7, var6, var17.boolean1);
						}
					} else if (var7 == 1) {
						if (var18 == -1 && var17.transforms == null) {
							var40 = var17.getModel(1, var6, var25, var27, var26, var28);
						} else {
							var40 = new DynamicObject(var0, var5, 1, var6, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
						}

						var29.newBoundaryObject(var1, var3, var4, var26, (Renderable)var40, (Renderable)null, Tiles.field850[var6], 0, var30, var32);
						if (var17.interactType != 0 && var45 != null) {
							var45.method5976(var3, var4, var7, var6, var17.boolean1);
						}
					} else {
						int var33;
						if (var7 == 2) {
							var33 = var6 + 1 & 3;
							Object var35;
							Object var41;
							if (var18 == -1 && var17.transforms == null) {
								var41 = var17.getModel(2, var6 + 4, var25, var27, var26, var28);
								var35 = var17.getModel(2, var33, var25, var27, var26, var28);
							} else {
								var41 = new DynamicObject(var0, var5, 2, var6 + 4, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
								var35 = new DynamicObject(var0, var5, 2, var33, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
							}

							var29.newBoundaryObject(var1, var3, var4, var26, (Renderable)var41, (Renderable)var35, Tiles.field861[var6], Tiles.field861[var33], var30, var32);
							if (var17.interactType != 0 && var45 != null) {
								var45.method5976(var3, var4, var7, var6, var17.boolean1);
							}
						} else if (var7 == 3) {
							if (var18 == -1 && var17.transforms == null) {
								var40 = var17.getModel(3, var6, var25, var27, var26, var28);
							} else {
								var40 = new DynamicObject(var0, var5, 3, var6, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
							}

							var29.newBoundaryObject(var1, var3, var4, var26, (Renderable)var40, (Renderable)null, Tiles.field850[var6], 0, var30, var32);
							if (var17.interactType != 0 && var45 != null) {
								var45.method5976(var3, var4, var7, var6, var17.boolean1);
							}
						} else if (var7 == 9) {
							if (var18 == -1 && var17.transforms == null) {
								var40 = var17.getModel(var7, var6, var25, var27, var26, var28);
							} else {
								var40 = new DynamicObject(var0, var5, var7, var6, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
							}

							var29.method5192(var1, var3, var4, var26, 1, 1, (Renderable)var40, 0, var30, var32);
							if (var17.interactType != 0 && var45 != null) {
								var45.addGameObject(var3, var4, var19, var20, var17.boolean1);
							}
						} else if (var7 == 4) {
							if (var18 == -1 && var17.transforms == null) {
								var40 = var17.getModel(4, var6, var25, var27, var26, var28);
							} else {
								var40 = new DynamicObject(var0, var5, 4, var6, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
							}

							var29.newWallDecoration(var1, var3, var4, var26, (Renderable)var40, (Renderable)null, Tiles.field861[var6], 0, 0, 0, var30, var32);
						} else {
							long var34;
							Object var36;
							if (var7 == 5) {
								var33 = 16;
								var34 = var29.getBoundaryObjectTag(var1, var3, var4);
								if (var34 != 0L) {
									var33 = HealthBarConfig.getObjectDefinition(DirectByteArrayCopier.Entity_unpackID(var34)).int2;
								}

								if (var18 == -1 && var17.transforms == null) {
									var36 = var17.getModel(4, var6, var25, var27, var26, var28);
								} else {
									var36 = new DynamicObject(var0, var5, 4, var6, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
								}

								var29.newWallDecoration(var1, var3, var4, var26, (Renderable)var36, (Renderable)null, Tiles.field861[var6], 0, Tiles.field851[var6] * var33, Tiles.field852[var6] * var33, var30, var32);
							} else if (var7 == 6) {
								var33 = 8;
								var34 = var29.getBoundaryObjectTag(var1, var3, var4);
								if (var34 != 0L) {
									var33 = HealthBarConfig.getObjectDefinition(DirectByteArrayCopier.Entity_unpackID(var34)).int2 / 2;
								}

								if (var18 == -1 && var17.transforms == null) {
									var36 = var17.getModel(4, var6 + 4, var25, var27, var26, var28);
								} else {
									var36 = new DynamicObject(var0, var5, 4, var6 + 4, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
								}

								var29.newWallDecoration(var1, var3, var4, var26, (Renderable)var36, (Renderable)null, 256, var6, Tiles.field856[var6] * var33, Tiles.field854[var6] * var33, var30, var32);
							} else if (var7 == 7) {
								int var39 = var6 + 2 & 3;
								if (var18 == -1 && var17.transforms == null) {
									var40 = var17.getModel(4, var39 + 4, var25, var27, var26, var28);
								} else {
									var40 = new DynamicObject(var0, var5, 4, var39 + 4, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
								}

								var29.newWallDecoration(var1, var3, var4, var26, (Renderable)var40, (Renderable)null, 256, var39, 0, 0, var30, var32);
							} else if (var7 == 8) {
								var33 = 8;
								var34 = var29.getBoundaryObjectTag(var1, var3, var4);
								if (0L != var34) {
									var33 = HealthBarConfig.getObjectDefinition(DirectByteArrayCopier.Entity_unpackID(var34)).int2 / 2;
								}

								int var38 = var6 + 2 & 3;
								Object var37;
								if (var18 == -1 && var17.transforms == null) {
									var36 = var17.getModel(4, var6 + 4, var25, var27, var26, var28);
									var37 = var17.getModel(4, var38 + 4, var25, var27, var26, var28);
								} else {
									var36 = new DynamicObject(var0, var5, 4, var6 + 4, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
									var37 = new DynamicObject(var0, var5, 4, var38 + 4, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
								}

								var29.newWallDecoration(var1, var3, var4, var26, (Renderable)var36, (Renderable)var37, 256, var6, Tiles.field856[var6] * var33, Tiles.field854[var6] * var33, var30, var32);
							}
						}
					}
				} else {
					if (var18 == -1 && var17.transforms == null) {
						var40 = var17.getModel(10, var6, var25, var27, var26, var28);
					} else {
						var40 = new DynamicObject(var0, var5, 10, var6, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
					}

					if (var40 != null) {
						var29.method5192(var1, var3, var4, var26, var19, var20, (Renderable)var40, var7 == 11 ? 256 : 0, var30, var32);
					}

					if (var17.interactType != 0 && var45 != null) {
						var45.addGameObject(var3, var4, var19, var20, var17.boolean1);
					}
				}

				var17 = HealthBarConfig.getObjectDefinition(var5);
				if (var17 != null && var17.hasSound()) {
					var0.createObjectSound(var15, var3, var4, var17, var6);
				}
			}
		}

	}
}
