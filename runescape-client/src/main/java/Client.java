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
public final class Client extends GameEngine implements Usernamed, OAuthApi, class351 {
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Llw;"
	)
	static final class288 field516;
	@ObfuscatedName("do")
	@Export("BASIC_AUTH_DESKTOP_OSRS")
	static final String BASIC_AUTH_DESKTOP_OSRS;
	@ObfuscatedName("dk")
	@Export("BASIC_AUTH_DESKTOP_RUNELITE")
	static final String BASIC_AUTH_DESKTOP_RUNELITE;
	@ObfuscatedName("es")
	static final int[] field284;
	@ObfuscatedName("ej")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("playerAppearance")
	static final PlayerComposition playerAppearance;
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "Lba;"
	)
	static final ApproximateRouteStrategy field287;
	@ObfuscatedName("fp")
	static boolean field288;
	@ObfuscatedName("fb")
	@ObfuscatedGetter(
		intValue = 1312022025
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("fn")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("fl")
	@ObfuscatedGetter(
		intValue = 1271535343
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("fi")
	@ObfuscatedGetter(
		intValue = 1759706017
	)
	@Export("cycle")
	public static int cycle;
	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	@Export("authenticationScheme")
	static AuthenticationScheme authenticationScheme;
	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "Lxn;"
	)
	static class604 field422;
	@ObfuscatedName("fk")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("fy")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	@Export("worldViewManager")
	public static final WorldViewManager worldViewManager;
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "Lrt;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	@Export("playerUpdateManager")
	static PlayerUpdateManager playerUpdateManager;
	@ObfuscatedName("fa")
	@ObfuscatedGetter(
		intValue = -2124467559
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("fc")
	@ObfuscatedGetter(
		intValue = 249033505
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("fr")
	@ObfuscatedGetter(
		intValue = 1322064827
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("gn")
	@ObfuscatedGetter(
		intValue = -1483410983
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("gu")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("gm")
	@ObfuscatedGetter(
		intValue = 106722889
	)
	static int field305;
	@ObfuscatedName("gf")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("gd")
	@ObfuscatedGetter(
		intValue = -1548864151
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("go")
	@ObfuscatedGetter(
		intValue = -1324427793
	)
	static int field310;
	@ObfuscatedName("gs")
	static String field309;
	@ObfuscatedName("ga")
	@ObfuscatedGetter(
		intValue = 1201323213
	)
	@Export("currentWorldViewId")
	static int currentWorldViewId;
	@ObfuscatedName("gj")
	@ObfuscatedGetter(
		intValue = -1124446329
	)
	@Export("cameraWorldViewId")
	static int cameraWorldViewId;
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = -1317332087
	)
	@Export("cameraTargetIndex")
	static int cameraTargetIndex;
	@ObfuscatedName("gb")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("gz")
	@ObfuscatedGetter(
		intValue = -1459845413
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("gv")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("gh")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("gl")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("ge")
	static int[] field328;
	@ObfuscatedName("gx")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("gp")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("gc")
	@ObfuscatedGetter(
		intValue = -415813337
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("hd")
	@ObfuscatedGetter(
		longValue = -9158754610911612409L
	)
	static long field323;
	@ObfuscatedName("hi")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("hg")
	@ObfuscatedGetter(
		intValue = 580998375
	)
	static int field415;
	@ObfuscatedName("hy")
	@ObfuscatedGetter(
		intValue = -2068848471
	)
	@Export("revision")
	public static int revision;
	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("indexCheck")
	static IndexCheck indexCheck;
	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	static class278 field442;
	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "[Lgs;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "[Lgz;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("hh")
	static short field331;
	@ObfuscatedName("hr")
	static short field519;
	@ObfuscatedName("hl")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("ha")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("hu")
	static short field335;
	@ObfuscatedName("ht")
	static short field332;
	@ObfuscatedName("hp")
	static short field337;
	@ObfuscatedName("hk")
	static short field529;
	@ObfuscatedName("ho")
	@ObfuscatedGetter(
		intValue = -1311789455
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("hs")
	@ObfuscatedGetter(
		intValue = -2071412437
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("hm")
	@ObfuscatedGetter(
		intValue = 164941911
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("hf")
	@ObfuscatedGetter(
		intValue = 620574401
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("hv")
	@ObfuscatedGetter(
		intValue = 1624872185
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "[Lqg;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "Lbw;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("it")
	static String field485;
	@ObfuscatedName("iq")
	@ObfuscatedGetter(
		intValue = -1381956417
	)
	static int field497;
	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "Lqx;"
	)
	public static class431 field571;
	@ObfuscatedName("id")
	@ObfuscatedGetter(
		intValue = 1954026687
	)
	public static int field347;
	@ObfuscatedName("ir")
	@ObfuscatedGetter(
		intValue = -338757497
	)
	static int field348;
	@ObfuscatedName("ie")
	@ObfuscatedGetter(
		intValue = -1330094789
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("ic")
	@ObfuscatedGetter(
		intValue = -423864891
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("ih")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("jp")
	@ObfuscatedGetter(
		intValue = 744188887
	)
	static int field330;
	@ObfuscatedName("jk")
	@ObfuscatedGetter(
		intValue = 1499774163
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("jd")
	@ObfuscatedGetter(
		intValue = 1225137509
	)
	static int field352;
	@ObfuscatedName("ja")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("jo")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("jx")
	@ObfuscatedGetter(
		intValue = 1597664885
	)
	@Export("serverCycle")
	static int serverCycle;
	@ObfuscatedName("jn")
	@ObfuscatedGetter(
		longValue = 1933419656761562415L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("jm")
	@ObfuscatedGetter(
		intValue = -2071788461
	)
	static int field498;
	@ObfuscatedName("jv")
	@ObfuscatedGetter(
		intValue = -1318930041
	)
	static int field360;
	@ObfuscatedName("jf")
	@ObfuscatedGetter(
		longValue = -5040654450895581681L
	)
	static long field361;
	@ObfuscatedName("ju")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("jw")
	@ObfuscatedGetter(
		intValue = 257591815
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("ji")
	@Export("z")
	static boolean z;
	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	static class69 field550;
	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "Ltd;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("jc")
	@ObfuscatedGetter(
		intValue = 1916348341
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("jh")
	@ObfuscatedGetter(
		intValue = 95386849
	)
	static int field367;
	@ObfuscatedName("ki")
	@ObfuscatedGetter(
		intValue = 1529410209
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("kn")
	@ObfuscatedGetter(
		intValue = -1398133501
	)
	static int field561;
	@ObfuscatedName("kk")
	@ObfuscatedGetter(
		intValue = 712691787
	)
	static int field291;
	@ObfuscatedName("kc")
	@ObfuscatedGetter(
		intValue = -129693717
	)
	static int field371;
	@ObfuscatedName("lh")
	@ObfuscatedGetter(
		intValue = -848945929
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("lt")
	@ObfuscatedGetter(
		intValue = 1969800861
	)
	static int field373;
	@ObfuscatedName("lb")
	@ObfuscatedGetter(
		intValue = -678438487
	)
	static int field374;
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = -656767219
	)
	static int field375;
	@ObfuscatedName("lo")
	@ObfuscatedGetter(
		intValue = 80791297
	)
	static int field376;
	@ObfuscatedName("ll")
	@ObfuscatedGetter(
		intValue = 220109933
	)
	static int field356;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = 1016118265
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("lf")
	@ObfuscatedGetter(
		intValue = 1853484313
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("lx")
	@ObfuscatedGetter(
		intValue = -1788831741
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("mn")
	@ObfuscatedGetter(
		intValue = -2066244171
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("ms")
	@ObfuscatedGetter(
		intValue = -1468283605
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("mf")
	@ObfuscatedGetter(
		intValue = 42167005
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("mw")
	@ObfuscatedGetter(
		intValue = -1354500905
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("mr")
	@ObfuscatedGetter(
		intValue = -976706363
	)
	static int field386;
	@ObfuscatedName("mu")
	@ObfuscatedGetter(
		intValue = 1031483927
	)
	static int field333;
	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("mb")
	@ObfuscatedGetter(
		intValue = -1850849067
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("mo")
	@ObfuscatedGetter(
		intValue = -17542531
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("mk")
	@ObfuscatedGetter(
		intValue = 427594063
	)
	@Export("staffModLevel")
	public static int staffModLevel;
	@ObfuscatedName("mq")
	@ObfuscatedGetter(
		intValue = 708717389
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("mg")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("mx")
	@ObfuscatedGetter(
		intValue = -508937381
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("mc")
	@ObfuscatedGetter(
		intValue = -2011583141
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("md")
	@ObfuscatedGetter(
		intValue = -2138892451
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "Lrt;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "Lrt;"
	)
	@Export("scriptEvents2")
	static NodeDeque scriptEvents2;
	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "Lrt;"
	)
	@Export("scriptEvents3")
	static NodeDeque scriptEvents3;
	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "Lrt;"
	)
	static NodeDeque field400;
	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("mm")
	@ObfuscatedGetter(
		intValue = 286094873
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("mz")
	@ObfuscatedGetter(
		intValue = -1546032189
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("my")
	static String field448;
	@ObfuscatedName("nv")
	@ObfuscatedGetter(
		intValue = -1698979265
	)
	static int field405;
	@ObfuscatedName("ny")
	static int[] field424;
	@ObfuscatedName("no")
	static int[] field407;
	@ObfuscatedName("nu")
	@ObfuscatedGetter(
		longValue = -1595208770843564323L
	)
	static long field408;
	@ObfuscatedName("nj")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "Lvw;"
	)
	static class570 field315;
	@ObfuscatedName("nl")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("nc")
	static boolean field412;
	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("DBTableIndex_cache")
	static EvictingDualNodeHashTable DBTableIndex_cache;
	@ObfuscatedName("nr")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("archive11")
	static EvictingDualNodeHashTable archive11;
	@ObfuscatedName("nw")
	static boolean field489;
	@ObfuscatedName("ne")
	static boolean field473;
	@ObfuscatedName("nz")
	static boolean field417;
	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	@Export("hintArrow")
	static final HintArrow hintArrow;
	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("nt")
	@Export("refreshToken")
	static String refreshToken;
	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("ov")
	static int[] field476;
	@ObfuscatedName("oj")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("or")
	@ObfuscatedGetter(
		intValue = 6231661
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("oc")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("ob")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("ot")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("ok")
	static int[][][] field429;
	@ObfuscatedName("pz")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("pv")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("pr")
	@ObfuscatedGetter(
		intValue = -1348022309
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("pd")
	@ObfuscatedGetter(
		intValue = -1533995753
	)
	@Export("graphicsCycle")
	static int graphicsCycle;
	@ObfuscatedName("pu")
	@ObfuscatedGetter(
		intValue = 1259318399
	)
	static int field381;
	@ObfuscatedName("pf")
	@ObfuscatedGetter(
		intValue = -879348827
	)
	static int field435;
	@ObfuscatedName("pq")
	@ObfuscatedGetter(
		intValue = 1137284357
	)
	static int field436;
	@ObfuscatedName("pi")
	@ObfuscatedGetter(
		intValue = 861497495
	)
	static int field437;
	@ObfuscatedName("pn")
	static boolean field482;
	@ObfuscatedName("ps")
	@ObfuscatedGetter(
		intValue = 497360259
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("pc")
	@ObfuscatedGetter(
		intValue = 1219003537
	)
	static int field440;
	@ObfuscatedName("pk")
	@ObfuscatedGetter(
		intValue = 321658857
	)
	static int field441;
	@ObfuscatedName("po")
	@ObfuscatedGetter(
		intValue = 77186093
	)
	static int field450;
	@ObfuscatedName("pa")
	@ObfuscatedGetter(
		intValue = -278553003
	)
	static int field443;
	@ObfuscatedName("pt")
	static boolean field444;
	@ObfuscatedName("qf")
	@ObfuscatedGetter(
		intValue = 1116989945
	)
	static int field445;
	@ObfuscatedName("qn")
	static boolean field446;
	@ObfuscatedName("qw")
	@ObfuscatedGetter(
		intValue = -317552047
	)
	static int field447;
	@ObfuscatedName("qs")
	@ObfuscatedGetter(
		intValue = 814091759
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("qm")
	@ObfuscatedGetter(
		intValue = -1772100551
	)
	static int field449;
	@ObfuscatedName("qy")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("qq")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("qv")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("qp")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("qz")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("qe")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("qc")
	static int[][] field456;
	@ObfuscatedName("qk")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("qg")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("qb")
	@ObfuscatedGetter(
		intValue = 424038787
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("qx")
	@ObfuscatedGetter(
		intValue = -1259541623
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("qu")
	@ObfuscatedGetter(
		intValue = -604800983
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("qt")
	@ObfuscatedGetter(
		intValue = 426080315
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("ql")
	@ObfuscatedGetter(
		intValue = 54869437
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("qo")
	@ObfuscatedGetter(
		intValue = -633390988
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("qi")
	@ObfuscatedGetter(
		intValue = 894923537
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("qd")
	@ObfuscatedGetter(
		longValue = -7723409232129091151L
	)
	@Export("userId")
	static long userId;
	@ObfuscatedName("qa")
	@ObfuscatedGetter(
		longValue = 3891958124439016377L
	)
	@Export("userHash")
	static long userHash;
	@ObfuscatedName("rv")
	@ObfuscatedGetter(
		intValue = -361115983
	)
	static int field468;
	@ObfuscatedName("ru")
	@ObfuscatedGetter(
		intValue = -852488123
	)
	static int field469;
	@ObfuscatedName("rt")
	@ObfuscatedGetter(
		intValue = -291215063
	)
	static int field512;
	@ObfuscatedName("rg")
	@ObfuscatedGetter(
		intValue = -613128647
	)
	static int field471;
	@ObfuscatedName("rm")
	static int[] field472;
	@ObfuscatedName("rj")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("rh")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("rn")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("re")
	@ObfuscatedGetter(
		intValue = 1466770191
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("ro")
	@Export("leftClickOpensMenu")
	static boolean leftClickOpensMenu;
	@ObfuscatedName("ri")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("rc")
	@ObfuscatedSignature(
		descriptor = "Lxk;"
	)
	@Export("menu")
	static Menu menu;
	@ObfuscatedName("rb")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("rp")
	@ObfuscatedGetter(
		intValue = -1829793141
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("rf")
	@ObfuscatedGetter(
		intValue = -965900519
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("rx")
	@ObfuscatedGetter(
		intValue = -950537631
	)
	static int field483;
	@ObfuscatedName("ra")
	@ObfuscatedGetter(
		intValue = -1806931041
	)
	static int field535;
	@ObfuscatedName("rq")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("rr")
	@ObfuscatedGetter(
		intValue = -436571069
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("rz")
	@ObfuscatedGetter(
		intValue = -2111303253
	)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("sb")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("su")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("sf")
	@ObfuscatedGetter(
		intValue = 2100087115
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("sc")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("clickedWidget")
	public static Widget clickedWidget;
	@ObfuscatedName("sw")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("sl")
	@ObfuscatedGetter(
		intValue = -87154783
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("si")
	@ObfuscatedGetter(
		intValue = 1162132169
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("ss")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("se")
	static boolean field465;
	@ObfuscatedName("sj")
	@ObfuscatedGetter(
		intValue = 1023425591
	)
	static int field411;
	@ObfuscatedName("st")
	@ObfuscatedGetter(
		intValue = 1469945113
	)
	static int field292;
	@ObfuscatedName("sh")
	static boolean field500;
	@ObfuscatedName("sy")
	@ObfuscatedGetter(
		intValue = 1009079165
	)
	static int field484;
	@ObfuscatedName("sq")
	@ObfuscatedGetter(
		intValue = 792758383
	)
	static int field527;
	@ObfuscatedName("sa")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("sx")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("sd")
	@ObfuscatedGetter(
		intValue = -191208899
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("sg")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("sm")
	@ObfuscatedGetter(
		intValue = -460472563
	)
	@Export("changedItemsCount")
	static int changedItemsCount;
	@ObfuscatedName("sr")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("sn")
	@ObfuscatedGetter(
		intValue = 407516417
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("so")
	static int[] field510;
	@ObfuscatedName("tx")
	@ObfuscatedGetter(
		intValue = 557159171
	)
	static int field334;
	@ObfuscatedName("tr")
	@ObfuscatedGetter(
		intValue = 897615935
	)
	static int field452;
	@ObfuscatedName("tb")
	@ObfuscatedGetter(
		intValue = -1315253043
	)
	static int field513;
	@ObfuscatedName("te")
	@ObfuscatedGetter(
		intValue = -1633769837
	)
	static int field514;
	@ObfuscatedName("th")
	@ObfuscatedGetter(
		intValue = -1787912091
	)
	static int field515;
	@ObfuscatedName("tt")
	@ObfuscatedGetter(
		intValue = 1556719127
	)
	static int field295;
	@ObfuscatedName("tk")
	@ObfuscatedGetter(
		intValue = 639504709
	)
	static int field517;
	@ObfuscatedName("tp")
	@ObfuscatedGetter(
		intValue = -1975452093
	)
	static int field338;
	@ObfuscatedName("tc")
	@ObfuscatedSignature(
		descriptor = "Lxw;"
	)
	static class618 field317;
	@ObfuscatedName("tv")
	@ObfuscatedGetter(
		intValue = -1020775279
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("ta")
	@ObfuscatedGetter(
		intValue = -1014314483
	)
	static int field490;
	@ObfuscatedName("tj")
	@Export("validRootWidgets")
	static boolean[] validRootWidgets;
	@ObfuscatedName("tl")
	static boolean[] field523;
	@ObfuscatedName("tz")
	static boolean[] field524;
	@ObfuscatedName("tn")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("ti")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("ty")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("tm")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("tq")
	@ObfuscatedGetter(
		intValue = -1637255475
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("td")
	static int[] field530;
	@ObfuscatedName("tu")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("tg")
	@ObfuscatedGetter(
		intValue = -1154218555
	)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("ts")
	@ObfuscatedGetter(
		intValue = 1612605821
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("to")
	@ObfuscatedGetter(
		intValue = 1329452211
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("uj")
	@ObfuscatedGetter(
		intValue = -768977623
	)
	static int field377;
	@ObfuscatedName("uc")
	@ObfuscatedGetter(
		intValue = 740194039
	)
	static int field536;
	@ObfuscatedName("ua")
	static boolean field494;
	@ObfuscatedName("uq")
	static boolean field538;
	@ObfuscatedName("uk")
	static boolean field425;
	@ObfuscatedName("ue")
	@ObfuscatedSignature(
		descriptor = "Lvb;"
	)
	static class559 field540;
	@ObfuscatedName("un")
	@ObfuscatedSignature(
		descriptor = "Lvq;"
	)
	static class558 field541;
	@ObfuscatedName("uy")
	@ObfuscatedSignature(
		descriptor = "Lvq;"
	)
	static class558 field542;
	@ObfuscatedName("ud")
	static boolean[] field543;
	@ObfuscatedName("ug")
	static int[] field362;
	@ObfuscatedName("vr")
	static int[] field545;
	@ObfuscatedName("vc")
	static int[] field546;
	@ObfuscatedName("vo")
	static int[] field547;
	@ObfuscatedName("vf")
	@ObfuscatedGetter(
		intValue = 1420383455
	)
	static int field548;
	@ObfuscatedName("va")
	@ObfuscatedGetter(
		intValue = -514973541
	)
	static int field385;
	@ObfuscatedName("vz")
	@ObfuscatedSignature(
		descriptor = "Lvm;"
	)
	static class555 field391;
	@ObfuscatedName("vn")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	static class498 field363;
	@ObfuscatedName("vk")
	static List field410;
	@ObfuscatedName("vq")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("vb")
	@ObfuscatedGetter(
		intValue = -251416631
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("vl")
	@ObfuscatedGetter(
		intValue = 454442311
	)
	static int field555;
	@ObfuscatedName("vv")
	static int[] field488;
	@ObfuscatedName("vs")
	static int[] field557;
	@ObfuscatedName("vu")
	@Export("token")
	String token;
	@ObfuscatedName("vt")
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	@Export("asyncRestClient")
	AsyncRestClient asyncRestClient;
	@ObfuscatedName("vh")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	@Export("asyncGameSessionTokenResponse")
	AsyncHttpResponse asyncGameSessionTokenResponse;
	@ObfuscatedName("vd")
	@Export("otlTokenRequester")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/OtlTokenRequester;"
	)
	OtlTokenRequester otlTokenRequester;
	@ObfuscatedName("vj")
	@Export("otlTokenRequestFuture")
	Future otlTokenRequestFuture;
	@ObfuscatedName("vy")
	@Export("https")
	boolean https;
	@ObfuscatedName("vp")
	@ObfuscatedGetter(
		intValue = 1207018651
	)
	@Export("clientId")
	int clientId;
	@ObfuscatedName("vw")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	@Export("asyncAccessTokenResponse")
	AsyncHttpResponse asyncAccessTokenResponse;
	@ObfuscatedName("ve")
	@Export("refreshAccessTokenRequester")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	RefreshAccessTokenRequester refreshAccessTokenRequester;
	@ObfuscatedName("wb")
	@Export("refreshAccessTokenRequestFuture")
	Future refreshAccessTokenRequestFuture;
	@ObfuscatedName("wg")
	@ObfuscatedSignature(
		descriptor = "Lxa;"
	)
	Buffer field568;
	@ObfuscatedName("wc")
	@ObfuscatedSignature(
		descriptor = "Law;"
	)
	SpriteBufferProperties field569;
	@ObfuscatedName("wa")
	@ObfuscatedGetter(
		longValue = -2666471702619447155L
	)
	@Export("accountHash")
	long accountHash;

	static {
		packetWriter = new PacketWriter();
		field516 = new class288();
		int var2 = "com_jagex_auth_desktop_osrs:public".length();
		byte[] var3 = new byte[var2];

		int var4;
		char var5;
		for (var4 = 0; var4 < var2; ++var4) {
			var5 = "com_jagex_auth_desktop_osrs:public".charAt(var4);
			if (var5 > 127) {
				var3[var4] = 63;
			} else {
				var3[var4] = (byte)var5;
			}
		}

		String var0 = BufferedSource.method10458(var3, 0, var3.length);
		BASIC_AUTH_DESKTOP_OSRS = var0;
		var2 = "com_jagex_auth_desktop_runelite:public".length();
		var3 = new byte[var2];

		for (var4 = 0; var4 < var2; ++var4) {
			var5 = "com_jagex_auth_desktop_runelite:public".charAt(var4);
			if (var5 > 127) {
				var3[var4] = 63;
			} else {
				var3[var4] = (byte)var5;
			}
		}

		var0 = BufferedSource.method10458(var3, 0, var3.length);
		BASIC_AUTH_DESKTOP_RUNELITE = var0;
		field284 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
		playerAppearance = new PlayerComposition();
		field287 = new ApproximateRouteStrategy();
		field288 = true;
		worldId = 1;
		isMembersWorld = false;
		gameState = 0;
		cycle = 0;
		authenticationScheme = AuthenticationScheme.TOKEN;
		field422 = class604.field6077;
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
		field305 = 0;
		showLoadingMessages = true;
		localPlayerIndex = -1;
		field310 = 0;
		field309 = "";
		currentWorldViewId = -1;
		cameraWorldViewId = -1;
		cameraTargetIndex = -1;
		renderSelf = true;
		drawPlayerNames = 0;
		currentLevels = new int[25];
		levels = new int[25];
		experience = new int[25];
		field328 = new int[25];
		followerOpsLowPriority = false;
		showMouseOverText = true;
		isItemSelected = 0;
		viewportWidget = null;
		field323 = 0L;
		isResizable = true;
		field415 = 600;
		revision = field415 / GameEngine.cycleDurationMillis;
		indexCheck = new IndexCheck();
		field442 = new class278();
		currentClanSettings = new ClanSettings[4];
		currentClanChannels = new ClanChannel[4];
		field331 = 256;
		field519 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field335 = 1;
		field332 = 32767;
		field337 = 1;
		field529 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		field497 = -1;
		field347 = -1;
		field348 = 30;
		worldProperties = 0;
		gameBuild = 0;
		isLowDetail = false;
		field330 = -1;
		clientType = -1;
		field352 = -1;
		onMobile = false;
		isLoading = true;
		serverCycle = 0;
		mouseLastLastPressedTimeMillis = 1L;
		field498 = -1;
		field360 = -1;
		field361 = -1L;
		hadFocus = true;
		rebootTimer = 0;
		z = false;
		field550 = class69.field935;
		js5ConnectState = 0;
		field367 = 0;
		js5Errors = 0;
		field561 = 0;
		field291 = 0;
		field371 = 0;
		logoutTimer = 0;
		field373 = 0;
		field374 = 1;
		field375 = 0;
		field376 = 1;
		field356 = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		mouseCamClickedX = 0;
		mouseCamClickedY = 0;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field386 = 0;
		field333 = -1;
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
		field400 = new NodeDeque();
		widgetFlags = new NodeHashTable(512);
		publicChatMode = 0;
		tradeChatMode = 0;
		field448 = "";
		field405 = 0;
		field424 = new int[128];
		field407 = new int[128];
		field408 = -1L;
		playingJingle = false;
		field315 = new class570();
		isCameraLocked = false;
		field412 = false;
		DBTableIndex_cache = new EvictingDualNodeHashTable(64);
		archive11 = new EvictingDualNodeHashTable(64);
		field489 = false;
		field473 = false;
		field417 = false;
		hintArrow = new HintArrow();
		playerAttackOption = AttackOption.AttackOption_hidden;
		npcAttackOption = AttackOption.AttackOption_hidden;
		secureRandomFuture = new SecureRandomFuture();
		field476 = new int[4];
		randomDatData = null;
		npcCount = 0;
		npcIndices = new int[250];
		hadNetworkError = false;
		timer = new Timer();
		field429 = new int[4][13][13];
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		overheadTextLimit = -1;
		graphicsCycle = 0;
		field381 = 2301979;
		field435 = 5063219;
		field436 = 3353893;
		field437 = 7759444;
		field482 = false;
		alternativeScrollbarWidth = 0;
		field440 = 0;
		field441 = 0;
		field450 = 0;
		field443 = 0;
		field444 = false;
		field445 = 0;
		field446 = false;
		field447 = 0;
		overheadTextCount = 0;
		field449 = 50;
		overheadTextXs = new int[field449];
		overheadTextYs = new int[field449];
		overheadTextAscents = new int[field449];
		overheadTextXOffsets = new int[field449];
		overheadTextColors = new int[field449];
		overheadTextEffects = new int[field449];
		field456 = new int[field449][];
		overheadTextCyclesRemaining = new int[field449];
		overheadText = new String[field449];
		viewportDrawCount = 0;
		viewportTempX = -1;
		viewportTempY = -1;
		mouseCrossX = 0;
		mouseCrossY = 0;
		mouseCrossState = 0;
		mouseCrossColor = 0;
		userId = -1L;
		userHash = -1L;
		field468 = 0;
		field469 = 0;
		field512 = 0;
		field471 = 0;
		field472 = new int[1000];
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
		field483 = 0;
		field535 = 50;
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
		field465 = false;
		field411 = -1;
		field292 = -1;
		field500 = false;
		field484 = -1;
		field527 = -1;
		isDraggingWidget = false;
		changedVarps = new int[32];
		changedVarpCount = 0;
		changedItemContainers = new int[32];
		changedItemsCount = 0;
		changedSkills = new int[32];
		changedSkillsCount = 0;
		field510 = new int[32];
		field334 = 0;
		field452 = 0;
		field513 = 0;
		field514 = 0;
		field515 = 0;
		field295 = 0;
		field517 = 0;
		field338 = 0;
		field317 = new class618();
		rootWidgetCount = 0;
		field490 = -2;
		validRootWidgets = new boolean[100];
		field523 = new boolean[100];
		field524 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field530 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		crossWorldMessageIds = new long[100];
		crossWorldMessageIdsIndex = 0;
		destinationX = 0;
		destinationY = 0;
		field377 = -1;
		field536 = 0;
		field494 = false;
		field538 = false;
		field425 = false;
		field540 = null;
		field541 = null;
		field542 = null;
		field543 = new boolean[5];
		field362 = new int[5];
		field545 = new int[5];
		field546 = new int[5];
		field547 = new int[5];
		field548 = -1;
		field385 = -1;
		field391 = new DesktopPlatformInfoProvider();
		field363 = new class498(8, class496.field5433);
		field410 = new ArrayList();
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field555 = 0;
		field488 = new int[50];
		field557 = new int[50];
		class597.field6010 = 235;
	}

	public Client() {
		this.https = false;
		this.clientId = 0;
		this.accountHash = -1L;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "43495521"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field323 = ParamComposition.method4708() + 500L;
		this.method869();
		if (rootInterface != -1) {
			this.method879(true);
		}

	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1963092833"
	)
	@Export("setUp")
	protected final void setUp() {
		int[] var1 = new int[]{20, 260, 10000};
		int[] var2 = new int[]{1000, 100, 500};
		if (var1 != null && var2 != null) {
			class451.ByteArrayPool_alternativeSizes = var1;
			class70.ByteArrayPool_altSizeArrayCounts = new int[var1.length];
			ByteArrayPool.ByteArrayPool_arrays = new byte[var1.length][][];

			for (int var3 = 0; var3 < class451.ByteArrayPool_alternativeSizes.length; ++var3) {
				ByteArrayPool.ByteArrayPool_arrays[var3] = new byte[var2[var3]][];
				ByteArrayPool.field5413.add(var1[var3]);
			}

			Collections.sort(ByteArrayPool.field5413);
		} else {
			class451.ByteArrayPool_alternativeSizes = null;
			class70.ByteArrayPool_altSizeArrayCounts = null;
			ByteArrayPool.ByteArrayPool_arrays = null;
			class184.method4317();
		}

		class452.field5203 = class320.method7179(worldProperties, class594.field5982);
		WorldMapLabel.worldPort = gameBuild == 0 ? 43594 : worldId + 40000;
		class532.js5Port = gameBuild == 0 ? 443 : worldId + 50000;
		class46.currentPort = WorldMapLabel.worldPort;
		class86.field1212 = class379.field4193;
		ItemContainer.field826 = class379.field4192;
		class358.field4059 = class379.field4195;
		PlayerComposition.field4146 = class379.field4191;
		class164.urlRequester = new SecureUrlRequester(this.https, 235);
		this.setUpKeyboard();
		this.setUpMouse();
		UserComparator6.mouseWheel = this.mouseWheel();
		this.method634(field442, 0);
		this.method634(indexCheck, 1);
		this.setUpClipboard();
		InterfaceParent.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 750000);
		AccessFile var4 = null;
		ClientPreferences var5 = new ClientPreferences();

		try {
			var4 = HttpMethod.getPreferencesFile("", class520.field5546.name, false);
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

		class468.clientPreferences = var5;
		MouseHandler.setWindowedMode(class468.clientPreferences.getWindowMode());
		class320.friendSystem = new FriendSystem(LoginScreenAnimation.loginType);
		this.asyncRestClient = new AsyncRestClient("tokenRequest", 1, 1);
		if (!class345.field3925.contains(this)) {
			class345.field3925.add(this);
		}

		field516.method6527();
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "86"
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
				boolean var5 = ScriptFrame.method748();
				if (var5 && playingJingle && Skills.pcmPlayer1 != null) {
					Skills.pcmPlayer1.tryDiscard();
				}

				HttpRequestTask.method290();
				indexCheck.method6300();
				this.method697();
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

				if (UserComparator6.mouseWheel != null) {
					int var6 = UserComparator6.mouseWheel.useRotation();
					mouseWheelRotation = var6;
				}

				if (gameState == 0) {
					class405.method8482();
					HttpResponse.method314();
				} else if (gameState == 5) {
					class358.loginScreen(this, class498.fontPlain11, UserComparator5.fontPlain12);
					class405.method8482();
					HttpResponse.method314();
				} else if (gameState != 10 && gameState != 11) {
					if (gameState == 20) {
						class358.loginScreen(this, class498.fontPlain11, UserComparator5.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState == 50) {
						class358.loginScreen(this, class498.fontPlain11, UserComparator5.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState == 25) {
						if (field489) {
							class383.loadRegion();
						}

						if (field473) {
							class392.method8383(ClientPacket.field3684);
						}

						if (!field473 && !field489) {
							WorldMapSectionType.updateGameState(30);
						}
					}
				} else {
					class358.loginScreen(this, class498.fontPlain11, UserComparator5.fontPlain12);
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

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "279644354"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		class233.method5126();
		if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field323 && ParamComposition.method4708() > field323) {
			MouseHandler.setWindowedMode(class182.getWindowedMode());
		}

		int var2;
		if (var1) {
			for (var2 = 0; var2 < 100; ++var2) {
				validRootWidgets[var2] = true;
			}
		}

		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1, class134.field1592);
		} else if (gameState == 5) {
			HealthBarUpdate.drawTitle(class234.fontBold12, class498.fontPlain11, UserComparator5.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				HealthBarUpdate.drawTitle(class234.fontBold12, class498.fontPlain11, UserComparator5.fontPlain12);
			} else if (gameState == 50) {
				HealthBarUpdate.drawTitle(class234.fontBold12, class498.fontPlain11, UserComparator5.fontPlain12);
			} else if (gameState == 25) {
				if (field489) {
					if (field356 == 1) {
						if (field373 > field374) {
							field374 = field373;
						}

						var2 = (field374 * 50 - field373 * 50) / field374;
						HttpMethod.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
					} else if (field356 == 2) {
						if (field375 > field376) {
							field376 = field375;
						}

						var2 = (field376 * 50 - field375 * 50) / field376 + 50;
						HttpMethod.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
					} else {
						HttpMethod.drawLoadingMessage("Loading - please wait.", false);
					}
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				HttpMethod.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) {
				HttpMethod.drawLoadingMessage("Please wait...", false);
			}
		} else {
			HealthBarUpdate.drawTitle(class234.fontBold12, class498.fontPlain11, UserComparator5.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				if (field523[var2]) {
					GameEngine.rasterProvider.draw(rootWidgetXs[var2], rootWidgetYs[var2], rootWidgetWidths[var2], rootWidgetHeights[var2]);
					field523[var2] = false;
				}
			}
		} else if (gameState > 0) {
			GameEngine.rasterProvider.drawFull(0, 0);

			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				field523[var2] = false;
			}
		}

	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1584049096"
	)
	@Export("kill0")
	protected final void kill0() {
		if (class166.varcs != null && class166.varcs.hasUnwrittenChanges()) {
			class166.varcs.write();
		}

		if (class535.mouseRecorder != null) {
			class535.mouseRecorder.isRunning = false;
		}

		class535.mouseRecorder = null;
		packetWriter.close();
		if (MouseHandler.MouseHandler_instance != null) {
			synchronized(MouseHandler.MouseHandler_instance) {
				MouseHandler.MouseHandler_instance = null;
			}
		}

		UserComparator6.mouseWheel = null;
		if (Skills.pcmPlayer1 != null) {
			Skills.pcmPlayer1.shutdown();
		}

		VarbitComposition.field2279.method8715();
		class300.method6918();
		if (class164.urlRequester != null) {
			class164.urlRequester.close();
			class164.urlRequester = null;
		}

		UserComparator7.method3702();
		this.asyncRestClient.shutdown();
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-40658853"
	)
	protected final void vmethod844() {
	}

	@ObfuscatedName("pp")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "23"
	)
	@Export("isRuneLite")
	boolean isRuneLite() {
		return this.clientId == 1;
	}

	@ObfuscatedName("px")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2095624683"
	)
	@Export("containsAccessAndRefreshToken")
	boolean containsAccessAndRefreshToken() {
		return class234.accessToken != null && !class234.accessToken.trim().isEmpty() && refreshToken != null && !refreshToken.trim().isEmpty();
	}

	@ObfuscatedName("pb")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "506898298"
	)
	@Export("containsSessionAndCharacterId")
	boolean containsSessionAndCharacterId() {
		return PlayerUpdateManager.sessionId != null && !PlayerUpdateManager.sessionId.trim().isEmpty() && Message.characterId != null && !Message.characterId.trim().isEmpty();
	}

	@ObfuscatedName("pc")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-10"
	)
	@Export("otlTokenRequesterInitialized")
	boolean otlTokenRequesterInitialized() {
		return this.otlTokenRequester != null;
	}

	@ObfuscatedName("pk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-85006034"
	)
	@Export("requestRefreshAccessToken")
	void requestRefreshAccessToken(String var1) throws IOException {
		HashMap var2 = new HashMap();
		var2.put("grant_type", "refresh_token");
		var2.put("scope", "gamesso.token.create");
		var2.put("refresh_token", var1);
		URL var3 = new URL(class431.authServiceBaseUrl + "shield/oauth/token" + (new HttpQueryParams(var2)).encode());
		HttpHeaders var4 = new HttpHeaders();
		if (this.isRuneLite()) {
			var4.basicAuthentication(BASIC_AUTH_DESKTOP_RUNELITE);
		} else {
			var4.basicAuthentication(BASIC_AUTH_DESKTOP_OSRS);
		}

		var4.header("Host", (new URL(class431.authServiceBaseUrl)).getHost());
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

	@ObfuscatedName("po")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1564231752"
	)
	@Export("requestOtlToken")
	void requestOtlToken(String var1) throws IOException {
		URL var2 = new URL(class431.authServiceBaseUrl + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
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

	@ObfuscatedName("pa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-591911008"
	)
	@Export("authenticate")
	void authenticate(String var1, String var2) throws IOException, JSONException {
		URL var3 = new URL(ObjectSound.gameSessionServiceBaseUrl + "game-session/v1/tokens");
		HttpRequest var4 = new HttpRequest(var3, HttpMethod.POST, this.https);
		var4.getHeaders().bearerToken(var1);
		var4.getHeaders().accept(HttpContentType.APPLICATION_JSON);
		JSONObject var5 = new JSONObject();
		var5.setProperty("accountId", var2);
		var4.setPayload(new HttpJsonRequestBody(var5));
		this.asyncGameSessionTokenResponse = this.asyncRestClient.submitRequest(var4);
	}

	@ObfuscatedName("pt")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-19"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			boolean var1 = VarbitComposition.field2279.method8711();
			if (!var1) {
				this.method935();
			}

		}
	}

	@ObfuscatedName("qf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-946388636"
	)
	void method935() {
		if (VarbitComposition.field2279.field5044 >= 4) {
			this.error("js5crc");
			WorldMapSectionType.updateGameState(1000);
		} else {
			if (VarbitComposition.field2279.field5045 >= 4) {
				if (gameState <= 5) {
					this.error("js5io");
					WorldMapSectionType.updateGameState(1000);
					return;
				}

				field367 = 3000;
				VarbitComposition.field2279.field5045 = 3;
			}

			if (--field367 + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						class203.js5SocketTask = GameEngine.taskHandler.newSocketTask(DynamicArray.worldHost, class46.currentPort);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (class203.js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (class203.js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						js5Socket = class489.method10024((Socket)class203.js5SocketTask.result, 40000, 5000);
						Buffer var1 = new Buffer(class337.field3848.field3858 + 1);
						var1.writeByte(class337.field3848.field3857);
						var1.writeInt(235);
						var1.writeInt(field476[0]);
						var1.writeInt(field476[1]);
						var1.writeInt(field476[2]);
						var1.writeInt(field476[3]);
						js5Socket.write(var1.array, 0, class337.field3848.field3858 + 1);
						++js5ConnectState;
						class426.field5085 = ParamComposition.method4708();
					}

					if (js5ConnectState == 3) {
						if (js5Socket.available() > 0) {
							int var2 = js5Socket.readUnsignedByte();
							if (var2 != 0) {
								this.js5Error(var2);
								return;
							}

							++js5ConnectState;
						} else if (ParamComposition.method4708() - class426.field5085 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						VarbitComposition.field2279.method8691(js5Socket, gameState > 20);
						class203.js5SocketTask = null;
						js5Socket = null;
						js5ConnectState = 0;
						js5Errors = 0;
					}
				} catch (IOException var3) {
					this.js5Error(-3);
				}

			}
		}
	}

	@ObfuscatedName("qn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-448759706"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		class203.js5SocketTask = null;
		js5Socket = null;
		js5ConnectState = 0;
		if (WorldMapLabel.worldPort == class46.currentPort) {
			class46.currentPort = class532.js5Port;
		} else {
			class46.currentPort = WorldMapLabel.worldPort;
		}

		++js5Errors;
		if (js5Errors < 2 || var1 != 7 && var1 != 9) {
			if (js5Errors >= 2 && var1 == 6) {
				this.error("js5connect_outofdate");
				WorldMapSectionType.updateGameState(1000);
			} else if (js5Errors >= 4) {
				if (gameState <= 5) {
					this.error("js5connect");
					WorldMapSectionType.updateGameState(1000);
				} else {
					field367 = 3000;
				}
			}
		} else if (gameState <= 5) {
			this.error("js5connect_full");
			WorldMapSectionType.updateGameState(1000);
		} else {
			field367 = 3000;
		}

	}

	@ObfuscatedName("qw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-113"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		AbstractSocket var1 = packetWriter.getSocket();
		PacketBuffer var2 = packetWriter.packetBuffer;

		try {
			if (AbstractWorldMapData.loginState == LoginState.SHUTDOWN_PREVIOUS_CONNECTION) {
				if (SecureRandomFuture.field751 == null && (secureRandomFuture.isDone() || field561 > 250)) {
					SecureRandomFuture.field751 = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (SecureRandomFuture.field751 != null) {
					if (var1 != null) {
						var1.close();
						var1 = null;
					}

					class573.field5888 = null;
					hadNetworkError = false;
					field561 = 0;
					if (field422.method11953()) {
						if (this.containsAccessAndRefreshToken()) {
							try {
								this.requestRefreshAccessToken(refreshToken);
								NpcOverrides.updateLoginState(LoginState.TOKEN_RESPONSE);
							} catch (Throwable var25) {
								PlayerType.RunException_sendStackTrace((String)null, var25);
								class437.getLoginError(65);
								return;
							}
						} else {
							if (!this.containsSessionAndCharacterId()) {
								class437.getLoginError(65);
								return;
							}

							try {
								this.authenticate(PlayerUpdateManager.sessionId, Message.characterId);
								NpcOverrides.updateLoginState(LoginState.REFRESHING_TOKEN);
							} catch (Exception var24) {
								PlayerType.RunException_sendStackTrace((String)null, var24);
								class437.getLoginError(65);
								return;
							}
						}
					} else {
						NpcOverrides.updateLoginState(LoginState.INIT_MOUSEHANDLER_SOCKET);
					}
				}
			}

			HttpResponse var28;
			if (AbstractWorldMapData.loginState == LoginState.TOKEN_RESPONSE) {
				if (this.refreshAccessTokenRequestFuture != null) {
					if (!this.refreshAccessTokenRequestFuture.isDone()) {
						return;
					}

					if (this.refreshAccessTokenRequestFuture.isCancelled()) {
						class437.getLoginError(65);
						this.refreshAccessTokenRequestFuture = null;
						return;
					}

					try {
						RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.refreshAccessTokenRequestFuture.get();
						if (!var3.isSuccess()) {
							class437.getLoginError(65);
							this.refreshAccessTokenRequestFuture = null;
							return;
						}

						class234.accessToken = var3.getAccessToken();
						refreshToken = var3.getRefreshToken();
						this.refreshAccessTokenRequestFuture = null;
					} catch (Exception var23) {
						PlayerType.RunException_sendStackTrace((String)null, var23);
						class437.getLoginError(65);
						this.refreshAccessTokenRequestFuture = null;
						return;
					}
				} else {
					if (this.asyncAccessTokenResponse == null) {
						class437.getLoginError(65);
						return;
					}

					if (!this.asyncAccessTokenResponse.hasFinished()) {
						return;
					}

					if (this.asyncAccessTokenResponse.hasError()) {
						PlayerType.RunException_sendStackTrace(this.asyncAccessTokenResponse.getErrorMessage(), (Throwable)null);
						class437.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}

					var28 = this.asyncAccessTokenResponse.await();
					if (var28.getResponseCode() != 200) {
						class437.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}

					field561 = 0;
					HttpJsonRequestBody var4 = new HttpJsonRequestBody(var28.getResponseBody());

					try {
						class234.accessToken = var4.getBody().getString("access_token");
						refreshToken = var4.getBody().getString("refresh_token");
					} catch (Exception var22) {
						PlayerType.RunException_sendStackTrace("Error parsing tokens", var22);
						class437.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}
				}

				this.requestOtlToken(class234.accessToken);
				NpcOverrides.updateLoginState(LoginState.REFRESHING_TOKEN);
			}

			if (LoginState.REFRESHING_TOKEN == AbstractWorldMapData.loginState) {
				if (this.otlTokenRequestFuture != null) {
					if (!this.otlTokenRequestFuture.isDone()) {
						return;
					}

					if (this.otlTokenRequestFuture.isCancelled()) {
						class437.getLoginError(65);
						this.otlTokenRequestFuture = null;
						return;
					}

					try {
						OtlTokenResponse var29 = (OtlTokenResponse)this.otlTokenRequestFuture.get();
						if (!var29.isSuccess()) {
							class437.getLoginError(65);
							this.otlTokenRequestFuture = null;
							return;
						}

						this.token = var29.getToken();
						this.otlTokenRequestFuture = null;
					} catch (Exception var21) {
						PlayerType.RunException_sendStackTrace((String)null, var21);
						class437.getLoginError(65);
						this.otlTokenRequestFuture = null;
						return;
					}
				} else {
					if (this.asyncGameSessionTokenResponse == null) {
						class437.getLoginError(65);
						return;
					}

					if (!this.asyncGameSessionTokenResponse.hasFinished()) {
						return;
					}

					if (this.asyncGameSessionTokenResponse.hasError()) {
						PlayerType.RunException_sendStackTrace(this.asyncGameSessionTokenResponse.getErrorMessage(), (Throwable)null);
						class437.getLoginError(65);
						this.asyncGameSessionTokenResponse = null;
						return;
					}

					var28 = this.asyncGameSessionTokenResponse.await();
					if (var28.getResponseCode() != 200) {
						PlayerType.RunException_sendStackTrace("Login authentication error. Response code: " + var28.getResponseCode() + " " + var28.method299() + " Response body: " + var28.getResponseBody(), (Throwable)null);
						class437.getLoginError(65);
						this.asyncGameSessionTokenResponse = null;
						return;
					}

					List var30 = (List)var28.getHeaderFields().get("Content-Type");
					if (var30 != null && var30.contains(HttpContentType.APPLICATION_JSON.getValue())) {
						try {
							JSONObject var5 = new JSONObject(var28.getResponseBody());
							this.token = var5.getString("token");
						} catch (JSONException var20) {
							PlayerType.RunException_sendStackTrace((String)null, var20);
							class437.getLoginError(65);
							this.asyncGameSessionTokenResponse = null;
							return;
						}
					} else {
						this.token = var28.getResponseBody();
					}

					this.asyncGameSessionTokenResponse = null;
				}

				field561 = 0;
				NpcOverrides.updateLoginState(LoginState.INIT_MOUSEHANDLER_SOCKET);
			}

			if (AbstractWorldMapData.loginState == LoginState.INIT_MOUSEHANDLER_SOCKET) {
				if (class573.field5888 == null) {
					class573.field5888 = GameEngine.taskHandler.newSocketTask(DynamicArray.worldHost, class46.currentPort);
				}

				if (class573.field5888.status == 2) {
					throw new IOException();
				}

				if (class573.field5888.status == 1) {
					var1 = class489.method10024((Socket)class573.field5888.result, 40000, 5000);
					packetWriter.setSocket(var1);
					class573.field5888 = null;
					NpcOverrides.updateLoginState(LoginState.UNMAPPED_20);
				}
			}

			PacketBufferNode var32;
			if (LoginState.UNMAPPED_20 == AbstractWorldMapData.loginState) {
				packetWriter.clearBuffer();
				var32 = class191.method4420();
				var32.clientPacket = null;
				var32.clientPacketLength = 0;
				var32.packetBuffer = new PacketBuffer(5000);
				var32.packetBuffer.writeByte(class337.field3851.field3857);
				packetWriter.addNode(var32);
				packetWriter.flush();
				var2.offset = 0;
				NpcOverrides.updateLoginState(LoginState.READ_LOGIN_STATUS);
			}

			int var15;
			if (AbstractWorldMapData.loginState == LoginState.READ_LOGIN_STATUS) {
				if (Skills.pcmPlayer1 != null) {
					Skills.pcmPlayer1.method3154();
				}

				if (var1.isAvailable(1)) {
					var15 = var1.readUnsignedByte();
					if (Skills.pcmPlayer1 != null) {
						Skills.pcmPlayer1.method3154();
					}

					if (var15 != 0) {
						class437.getLoginError(var15);
						return;
					}

					var2.offset = 0;
					NpcOverrides.updateLoginState(LoginState.READ_RANDOM_VERIFICATION_NUMBER);
				}
			}

			if (LoginState.READ_RANDOM_VERIFICATION_NUMBER == AbstractWorldMapData.loginState) {
				if (var2.offset * 2108391709 < 8) {
					var15 = var1.available();
					if (var15 > 8 - var2.offset * 2108391709) {
						var15 = 8 - var2.offset * 2108391709;
					}

					if (var15 > 0) {
						var1.read(var2.array, var2.offset * 2108391709, var15);
						var2.offset += var15 * 1741769013;
					}
				}

				if (var2.offset * 2108391709 == 8) {
					var2.offset = 0;
					MouseHandler.field200 = var2.readLong();
					NpcOverrides.updateLoginState(LoginState.WRITE_INITIAL_LOGIN_PACKET);
				}
			}

			if (LoginState.WRITE_INITIAL_LOGIN_PACKET == AbstractWorldMapData.loginState) {
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var31 = new PacketBuffer(500);
				int[] var34 = new int[]{SecureRandomFuture.field751.nextInt(), SecureRandomFuture.field751.nextInt(), SecureRandomFuture.field751.nextInt(), SecureRandomFuture.field751.nextInt()};
				var31.offset = 0;
				var31.writeByte(1);
				var31.writeInt(var34[0]);
				var31.writeInt(var34[1]);
				var31.writeInt(var34[2]);
				var31.writeInt(var34[3]);
				var31.writeLong(MouseHandler.field200);
				if (gameState == 40) {
					var31.writeInt(field476[0]);
					var31.writeInt(field476[1]);
					var31.writeInt(field476[2]);
					var31.writeInt(field476[3]);
				} else {
					if (gameState == 50) {
						var31.writeByte(AuthenticationScheme.field1586.rsOrdinal());
						var31.writeInt(class67.field890);
					} else {
						var31.writeByte(authenticationScheme.rsOrdinal());
						switch(authenticationScheme.schemeId) {
						case 1:
						case 2:
							var31.writeMedium(class28.otpMedium);
							var31.offset += 1741769013;
							break;
						case 3:
							var31.offset += -1622858540;
							break;
						case 4:
							var31.writeInt(class468.clientPreferences.getParameterValue(Login.Login_username));
						}
					}

					if (field422.method11953()) {
						var31.writeByte(class604.field6072.rsOrdinal());
						var31.writeStringCp1252NullTerminated(this.token);
					} else {
						var31.writeByte(class604.field6077.rsOrdinal());
						var31.writeStringCp1252NullTerminated(Login.Login_password);
					}
				}

				var31.encryptRsa(class50.field674, class50.field669);
				field476 = var34;
				PacketBufferNode var6 = class191.method4420();
				var6.clientPacket = null;
				var6.clientPacketLength = 0;
				var6.packetBuffer = new PacketBuffer(5000);
				var6.packetBuffer.offset = 0;
				if (gameState == 40) {
					var6.packetBuffer.writeByte(class337.field3850.field3857);
				} else {
					var6.packetBuffer.writeByte(class337.field3849.field3857);
				}

				var6.packetBuffer.writeShort(0);
				int var7 = var6.packetBuffer.offset * 2108391709;
				var6.packetBuffer.writeInt(235);
				var6.packetBuffer.writeInt(1);
				var6.packetBuffer.writeInt(class597.field6010);
				var6.packetBuffer.writeByte(clientType);
				var6.packetBuffer.writeByte(field352);
				byte var8 = 0;
				var6.packetBuffer.writeByte(var8);
				var6.packetBuffer.writeBytes(var31.array, 0, var31.offset * 2108391709);
				int var9 = var6.packetBuffer.offset * 2108391709;
				var6.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var6.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var6.packetBuffer.writeShort(class489.canvasWidth);
				var6.packetBuffer.writeShort(class374.canvasHeight);
				PacketBuffer var10 = var6.packetBuffer;
				int var13;
				if (randomDatData != null) {
					var10.writeBytes(randomDatData, 0, randomDatData.length);
				} else {
					byte[] var12 = new byte[24];

					try {
						JagexCache.JagexCache_randomDat.seek(0L);
						JagexCache.JagexCache_randomDat.readFully(var12);

						for (var13 = 0; var13 < 24 && var12[var13] == 0; ++var13) {
						}

						if (var13 >= 24) {
							throw new IOException();
						}
					} catch (Exception var26) {
						for (int var14 = 0; var14 < 24; ++var14) {
							var12[var14] = -1;
						}
					}

					var10.writeBytes(var12, 0, var12.length);
				}

				var6.packetBuffer.writeStringCp1252NullTerminated(class39.field241);
				var6.packetBuffer.writeInt(class570.field5884);
				var6.packetBuffer.writeByte(0);
				Buffer var11 = new Buffer(WorldMapLabelSize.platformInfo.size());
				WorldMapLabelSize.platformInfo.write(var11);
				var6.packetBuffer.writeBytes(var11.array, 0, var11.array.length);
				var6.packetBuffer.writeByte(clientType);
				var6.packetBuffer.writeInt(0);
				if (class452.field5203) {
					class345.method7363(var6);
				} else {
					class363.method7636(var6);
				}

				var6.packetBuffer.xteaEncrypt(var34, var9, var6.packetBuffer.offset * 2108391709);
				var6.packetBuffer.writeLengthShort(var6.packetBuffer.offset * 2108391709 - var7);
				packetWriter.addNode(var6);
				packetWriter.flush();
				packetWriter.isaacCipher = new IsaacCipher(var34);
				int[] var42 = new int[4];

				for (var13 = 0; var13 < 4; ++var13) {
					var42[var13] = var34[var13] + 50;
				}

				var2.newIsaacCipher(var42);
				NpcOverrides.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			int var17;
			if (AbstractWorldMapData.loginState == LoginState.READ_CLIENT_INFO_STATUS && var1.available() > 0) {
				var15 = var1.readUnsignedByte();
				if (var15 == 61) {
					var17 = var1.available();
					Frames.field2971 = var17 == 1 && var1.readUnsignedByte() == 1;
					NpcOverrides.updateLoginState(LoginState.WRITE_INITIAL_LOGIN_PACKET);
				}

				if (var15 == 21 && gameState == 20) {
					NpcOverrides.updateLoginState(LoginState.READ_PROFILE_TRANSFER_TIME);
				} else if (var15 == 2) {
					if (class452.field5203) {
						NpcOverrides.updateLoginState(LoginState.UNMAPPED_21);
					} else {
						NpcOverrides.updateLoginState(LoginState.UNMAPPED);
					}
				} else if (var15 == 15 && gameState == 40) {
					packetWriter.serverPacketLength = -1;
					NpcOverrides.updateLoginState(LoginState.UNMAPPED_19);
				} else if (var15 == 64) {
					NpcOverrides.updateLoginState(LoginState.READ_STATE_11_PACKET_SIZE);
				} else if (var15 == 23 && field291 < 1) {
					++field291;
					NpcOverrides.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				} else if (var15 == 29) {
					NpcOverrides.updateLoginState(LoginState.UNMAPPED_17);
				} else {
					if (var15 != 69) {
						class437.getLoginError(var15);
						return;
					}

					NpcOverrides.updateLoginState(LoginState.READ_DIGEST_PARSER_PACKET_SIZE);
				}
			}

			if (AbstractWorldMapData.loginState == LoginState.UNMAPPED_21) {
				class134.field1592 = true;
				HitSplatDefinition.method4773(class69.field926);
				WorldMapSectionType.updateGameState(0);
			}

			if (LoginState.READ_DIGEST_PARSER_PACKET_SIZE == AbstractWorldMapData.loginState && var1.available() >= 2) {
				var1.read(var2.array, 0, 2);
				var2.offset = 0;
				class150.field1757 = var2.readUnsignedShort();
				NpcOverrides.updateLoginState(LoginState.SUBMIT_DIGEST_PARSER_TASK);
			}

			if (AbstractWorldMapData.loginState == LoginState.SUBMIT_DIGEST_PARSER_TASK && var1.available() >= class150.field1757) {
				var2.offset = 0;
				var1.read(var2.array, var2.offset * 2108391709, class150.field1757);
				class6[] var33 = new class6[]{class6.field14};
				class6 var36 = var33[var2.readUnsignedByte()];

				try {
					switch(var36.field9) {
					case 0:
						class0 var37 = new class0();
						this.field569 = new SpriteBufferProperties(var2, var37);
						NpcOverrides.updateLoginState(LoginState.WRITE_DIGEST_PARSER_RESULT);
						break;
					default:
						throw new IllegalArgumentException();
					}
				} catch (Exception var19) {
					class437.getLoginError(22);
					return;
				}
			}

			if (LoginState.WRITE_DIGEST_PARSER_RESULT == AbstractWorldMapData.loginState && this.field569.method50()) {
				this.field568 = this.field569.method52();
				this.field569.method46();
				this.field569 = null;
				if (this.field568 == null) {
					class437.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				var32 = class191.method4420();
				var32.clientPacket = null;
				var32.clientPacketLength = 0;
				var32.packetBuffer = new PacketBuffer(5000);
				var32.packetBuffer.writeByte(class337.field3852.field3857);
				var32.packetBuffer.writeShort(this.field568.offset * 2108391709);
				var32.packetBuffer.writeBuffer(this.field568);
				packetWriter.addNode(var32);
				packetWriter.flush();
				this.field568 = null;
				NpcOverrides.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			if (AbstractWorldMapData.loginState == LoginState.READ_STATE_11_PACKET_SIZE && var1.available() > 0) {
				class155.field1788 = var1.readUnsignedByte();
				NpcOverrides.updateLoginState(LoginState.UNMAPPED_11);
			}

			if (LoginState.UNMAPPED_11 == AbstractWorldMapData.loginState && var1.available() >= class155.field1788) {
				var1.read(var2.array, 0, class155.field1788);
				var2.offset = 0;
				NpcOverrides.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			if (AbstractWorldMapData.loginState == LoginState.READ_PROFILE_TRANSFER_TIME && var1.available() > 0) {
				field371 = (var1.readUnsignedByte() + 3) * 60;
				NpcOverrides.updateLoginState(LoginState.PROFILE_TRANSFER);
			}

			if (AbstractWorldMapData.loginState == LoginState.PROFILE_TRANSFER) {
				field561 = 0;
				class525.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field371 / 60 + " seconds.");
				if (--field371 <= 0) {
					NpcOverrides.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				}

			} else if (LoginState.READ_ACCOUNT_INFO_PACKET_SIZE == AbstractWorldMapData.loginState) {
				var32 = class191.method4420();
				var32.clientPacket = null;
				var32.clientPacketLength = 0;
				var32.packetBuffer = new PacketBuffer(5000);
				var32.packetBuffer.writeByte(class337.field3855.field3857);
				var32.packetBuffer.writeShort(class337.field3855.field3858);
				class468.method9561(var32);
				packetWriter.addNode(var32);
				packetWriter.flush();
				NpcOverrides.updateLoginState(LoginState.UNMAPPED);
			} else {
				if (LoginState.UNMAPPED == AbstractWorldMapData.loginState && var1.available() >= 1) {
					class402.field4864 = var1.readUnsignedByte();
					if (class402.field4864 != class337.field3853.field3858) {
						class437.getLoginError(class402.field4864);
						return;
					}

					NpcOverrides.updateLoginState(LoginState.READ_ACCOUNT_INFO);
				}

				if (AbstractWorldMapData.loginState == LoginState.READ_ACCOUNT_INFO && var1.available() >= class402.field4864) {
					boolean var43 = var1.readUnsignedByte() == 1;
					var1.read(var2.array, 0, 4);
					var2.offset = 0;
					boolean var44 = false;
					if (var43) {
						var17 = var2.readByteIsaac() << 24;
						var17 |= var2.readByteIsaac() << 16;
						var17 |= var2.readByteIsaac() << 8;
						var17 |= var2.readByteIsaac();
						class468.clientPreferences.put(Login.Login_username, var17);
					}

					if (Login_isUsernameRemembered) {
						class468.clientPreferences.updateRememberedUsername(Login.Login_username);
					} else {
						class468.clientPreferences.updateRememberedUsername((String)null);
					}

					Player.savePreferences();
					staffModLevel = var1.readUnsignedByte();
					playerMod = var1.readUnsignedByte() == 1;
					localPlayerIndex = var1.readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += var1.readUnsignedByte();
					field310 = var1.readUnsignedByte();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					this.accountHash = var2.readLong();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					userId = var2.readLong();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					userHash = var2.readLong();
					WorldMapArea.method6664().method5129(this.https);
					NpcOverrides.updateLoginState(LoginState.SET_SERVER_PROTOCOL);
				}

				if (AbstractWorldMapData.loginState == LoginState.SET_SERVER_PROTOCOL && var1.available() >= packetWriter.serverPacketLength) {
					var1.read(var2.array, 0, 1);
					var2.offset = 0;
					if (var2.method11590()) {
						var1.read(var2.array, 1, 1);
						var2.offset = 0;
					}

					ServerPacket[] var35 = class134.ServerPacket_values();
					var17 = var2.readSmartByteShortIsaac();
					if (var17 < 0 || var17 >= var35.length) {
						throw new IOException("Invalid ServerProt: " + var17 + " at " + var2.offset * 2108391709);
					}

					packetWriter.serverPacket = var35[var17];
					packetWriter.serverPacketLength = packetWriter.serverPacket.length;
					var1.read(var2.array, 0, 2);
					var2.offset = 0;
					packetWriter.serverPacketLength = var2.readUnsignedShort();

					try {
						Client var39 = SecureUrlRequester.client;
						JSObject.getWindow(var39).call("zap", (Object[])null);
					} catch (Throwable var18) {
					}

					NpcOverrides.updateLoginState(LoginState.UPDATE_PLAYER_AND_LOAD_REGIONS);
				}

				if (AbstractWorldMapData.loginState == LoginState.UPDATE_PLAYER_AND_LOAD_REGIONS) {
					if (var1.available() >= packetWriter.serverPacketLength) {
						var2.offset = 0;
						var1.read(var2.array, 0, packetWriter.serverPacketLength);
						timer.method8495();
						AbstractSocket.method10404();
						playerUpdateManager.updatePlayer(var2);
						cameraTargetIndex = localPlayerIndex;
						GrandExchangeOfferUnitPriceComparator.cameraViewMode = CameraViewMode.field4455;
						cameraWorldViewId = -1;
						HealthBarUpdate.field1081 = -1;
						class418.loadRegions(false, var2);
						packetWriter.serverPacket = null;
						field417 = false;
					}

				} else {
					if (LoginState.UNMAPPED_17 == AbstractWorldMapData.loginState && var1.available() >= 2) {
						var2.offset = 0;
						var1.read(var2.array, 0, 2);
						var2.offset = 0;
						class582.field5932 = var2.readUnsignedShort();
						NpcOverrides.updateLoginState(LoginState.UNMAPPED_18);
					}

					if (LoginState.UNMAPPED_18 == AbstractWorldMapData.loginState && var1.available() >= class582.field5932) {
						var2.offset = 0;
						var1.read(var2.array, 0, class582.field5932);
						var2.offset = 0;
						String var38 = var2.readStringCp1252NullTerminated();
						String var40 = var2.readStringCp1252NullTerminated();
						String var41 = var2.readStringCp1252NullTerminated();
						class525.setLoginResponseString(var38, var40, var41);
						WorldMapSectionType.updateGameState(10);
						if (field422.method11953()) {
							class30.method484(9);
						}
					}

					if (LoginState.UNMAPPED_19 != AbstractWorldMapData.loginState) {
						++field561;
						if (field561 > 2000) {
							if (field291 < 1) {
								if (class46.currentPort == WorldMapLabel.worldPort) {
									class46.currentPort = class532.js5Port;
								} else {
									class46.currentPort = WorldMapLabel.worldPort;
								}

								++field291;
								NpcOverrides.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
							} else {
								class437.getLoginError(-3);
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
							var15 = packetWriter.serverPacketLength;
							timer.method8496();
							packetWriter.clearBuffer();
							packetWriter.field1262 = 0;
							packetWriter.packetBuffer.offset = 0;
							packetWriter.serverPacket = null;
							packetWriter.field1272 = null;
							packetWriter.field1275 = null;
							packetWriter.field1267 = null;
							packetWriter.serverPacketLength = 0;
							packetWriter.field1270 = 0;
							rebootTimer = 0;
							class177.method4269();
							class39.minimapState = 0;
							destinationX = 0;
							Occluder.topLevelWorldView.method2768();
							Skills.method8356();
							WorldMapSectionType.updateGameState(30);

							for (var17 = 0; var17 < 100; ++var17) {
								validRootWidgets[var17] = true;
							}

							class439.method8922();
							playerUpdateManager.updatePlayer(var2);
							if (var15 != var2.offset * 2108391709) {
								throw new RuntimeException();
							}
						}
					}
				}
			}
		} catch (IOException var27) {
			if (field291 < 1) {
				if (WorldMapLabel.worldPort == class46.currentPort) {
					class46.currentPort = class532.js5Port;
				} else {
					class46.currentPort = WorldMapLabel.worldPort;
				}

				++field291;
				NpcOverrides.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
			} else {
				class437.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("qs")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "42"
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
			class165.method4149();
		} else {
			if (!isMenuOpen) {
				class33.addCancelMenuEntry();
			}

			this.method1357();
			if (gameState == 30) {
				while (true) {
					ReflectionCheck var2 = (ReflectionCheck)class117.reflectionChecks.last();
					boolean var1;
					if (var2 == null) {
						var1 = false;
					} else {
						var1 = true;
					}

					int var3;
					PacketBufferNode var40;
					if (!var1) {
						PacketBufferNode var22;
						if (timer.field4917) {
							var22 = ReflectionCheck.getPacketBufferNode(ClientPacket.LOGIN_TIMINGS, packetWriter.isaacCipher);
							var22.packetBuffer.writeByte(0);
							int var23 = var22.packetBuffer.offset * 2108391709;
							timer.write(var22.packetBuffer);
							var22.packetBuffer.writeLengthByte(var22.packetBuffer.offset * 2108391709 - var23);
							packetWriter.addNode(var22);
							timer.method8503();
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
						synchronized(class535.mouseRecorder.lock) {
							if (!field288) {
								class535.mouseRecorder.index = 0;
							} else if (MouseHandler.MouseHandler_lastButton != 0 || class535.mouseRecorder.index >= 40) {
								var40 = null;
								var3 = 0;
								var4 = 0;
								var5 = 0;
								var6 = 0;

								for (var7 = 0; var7 < class535.mouseRecorder.index && (var40 == null || var40.packetBuffer.offset * 2108391709 - var3 < 246); ++var7) {
									var4 = var7;
									var8 = class535.mouseRecorder.ys[var7];
									if (var8 < -1) {
										var8 = -1;
									} else if (var8 > 65534) {
										var8 = 65534;
									}

									var9 = class535.mouseRecorder.xs[var7];
									if (var9 < -1) {
										var9 = -1;
									} else if (var9 > 65534) {
										var9 = 65534;
									}

									if (var9 != field498 || var8 != field360) {
										if (var40 == null) {
											var40 = ReflectionCheck.getPacketBufferNode(ClientPacket.MOUSE_MOVE, packetWriter.isaacCipher);
											var40.packetBuffer.writeByte(0);
											var3 = var40.packetBuffer.offset * 2108391709;
											var10000 = var40.packetBuffer;
											var10000.offset += -811429270;
											var5 = 0;
											var6 = 0;
										}

										if (field361 != -1L) {
											var10 = var9 - field498;
											var11 = var8 - field360;
											var12 = (int)((class535.mouseRecorder.millis[var7] - field361) / 20L);
											var5 = (int)((long)var5 + (class535.mouseRecorder.millis[var7] - field361) % 20L);
										} else {
											var10 = var9;
											var11 = var8;
											var12 = Integer.MAX_VALUE;
										}

										field498 = var9;
										field360 = var8;
										if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
											var10 += 32;
											var11 += 32;
											var40.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6));
										} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
											var10 += 128;
											var11 += 128;
											var40.packetBuffer.writeByte(var12 + 128);
											var40.packetBuffer.writeShort(var11 + (var10 << 8));
										} else if (var12 < 32) {
											var40.packetBuffer.writeByte(var12 + 192);
											if (var9 != -1 && var8 != -1) {
												var40.packetBuffer.writeInt(var9 | var8 << 16);
											} else {
												var40.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										} else {
											var40.packetBuffer.writeShort((var12 & 8191) + 57344);
											if (var9 != -1 && var8 != -1) {
												var40.packetBuffer.writeInt(var9 | var8 << 16);
											} else {
												var40.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										}

										++var6;
										field361 = class535.mouseRecorder.millis[var7];
									}
								}

								if (var40 != null) {
									var40.packetBuffer.writeLengthByte(var40.packetBuffer.offset * 2108391709 - var3);
									var7 = var40.packetBuffer.offset * 2108391709;
									var40.packetBuffer.offset = var3 * 1741769013;
									var40.packetBuffer.writeByte(var5 / var6);
									var40.packetBuffer.writeByte(var5 % var6);
									var40.packetBuffer.offset = var7 * 1741769013;
									packetWriter.addNode(var40);
								}

								if (var4 >= class535.mouseRecorder.index) {
									class535.mouseRecorder.index = 0;
								} else {
									MouseRecorder var70 = class535.mouseRecorder;
									var70.index -= var4;
									System.arraycopy(class535.mouseRecorder.xs, var4, class535.mouseRecorder.xs, 0, class535.mouseRecorder.index);
									System.arraycopy(class535.mouseRecorder.ys, var4, class535.mouseRecorder.ys, 0, class535.mouseRecorder.index);
									System.arraycopy(class535.mouseRecorder.millis, var4, class535.mouseRecorder.millis, 0, class535.mouseRecorder.index);
								}
							}
						}

						this.method1047();
						if (mouseWheelRotation != 0) {
							var22 = ReflectionCheck.getPacketBufferNode(ClientPacket.MOUSE_WHEEL, packetWriter.isaacCipher);
							var22.packetBuffer.writeShort(mouseWheelRotation);
							packetWriter.addNode(var22);
						}

						var1 = GameEngine.keyHandler.method369();
						if (var1) {
							var40 = ReflectionCheck.getPacketBufferNode(ClientPacket.EVENT_KEYBOARD, packetWriter.isaacCipher);
							var40.packetBuffer.writeShort(0);
							var3 = var40.packetBuffer.offset * 2108391709;
							long var24 = ParamComposition.method4708();

							for (var6 = 0; var6 < indexCheck.field3234; ++var6) {
								long var26 = var24 - field408;
								if (var26 > 16777215L) {
									var26 = 16777215L;
								}

								field408 = var24;
								var40.packetBuffer.writeByteSub(indexCheck.field3247[var6]);
								var40.packetBuffer.writeIntME((int)var26);
							}

							var40.packetBuffer.writeLengthShort(var40.packetBuffer.offset * 2108391709 - var3);
							packetWriter.addNode(var40);
						}

						if (field445 > 0) {
							--field445;
						}

						if (indexCheck.isValidIndexInRange(96) || indexCheck.isValidIndexInRange(97) || indexCheck.isValidIndexInRange(98) || indexCheck.isValidIndexInRange(99)) {
							field446 = true;
						}

						if (field446 && field445 <= 0) {
							field445 = 20;
							field446 = false;
							var40 = ReflectionCheck.getPacketBufferNode(ClientPacket.EVENT_CAMERA_POSITION, packetWriter.isaacCipher);
							var40.packetBuffer.writeShort(camAngleX);
							var40.packetBuffer.writeIntLE(camAngleY);
							packetWriter.addNode(var40);
						}

						if (class489.hasFocus && !hadFocus) {
							hadFocus = true;
							var40 = ReflectionCheck.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
							var40.packetBuffer.writeByte(1);
							packetWriter.addNode(var40);
						}

						if (!class489.hasFocus && hadFocus) {
							hadFocus = false;
							var40 = ReflectionCheck.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
							var40.packetBuffer.writeByte(0);
							packetWriter.addNode(var40);
						}

						if (Skills.worldMap != null) {
							Skills.worldMap.method11005();
						}

						if (HintArrow.ClanChat_inClanChat) {
							if (BuddyRankComparator.friendsChat != null) {
								BuddyRankComparator.friendsChat.sort();
							}

							MouseRecorder.method2189();
							HintArrow.ClanChat_inClanChat = false;
						}

						HealthBarDefinition.method4405();
						class172.method4220();
						if (gameState != 30) {
							return;
						}

						class234.method5133();

						int var14;
						int var15;
						int var16;
						WorldEntity var17;
						int var10002;
						int var31;
						int var41;
						for (var41 = 0; var41 < class57.soundEffectCount; ++var41) {
							var10002 = class57.queuedSoundEffectDelays[var41]--;
							if (class57.queuedSoundEffectDelays[var41] < -10) {
								--class57.soundEffectCount;

								for (var3 = var41; var3 < class57.soundEffectCount; ++var3) {
									class57.soundEffectIds[var3] = class57.soundEffectIds[var3 + 1];
									class57.soundEffects[var3] = class57.soundEffects[var3 + 1];
									class57.soundLocations[var3] = class57.soundLocations[var3 + 1];
									class57.field792[var3] = class57.field792[var3 + 1];
									class57.queuedSoundEffectLoops[var3] = class57.queuedSoundEffectLoops[var3 + 1];
									class57.queuedSoundEffectDelays[var3] = class57.queuedSoundEffectDelays[var3 + 1];
									class57.field787[var3] = class57.field787[var3 + 1];
									class57.field793[var3] = class57.field793[var3 + 1];
								}

								--var41;
							} else {
								SoundEffect var42 = class57.soundEffects[var41];
								if (var42 == null) {
									var3 = class175.field1928.getGroupFileCount(class57.field792[var41]) - 1;
									var10000 = null;
									var42 = SoundEffect.readSoundEffect(class175.field1928, class57.field792[var41], var3);
									if (var42 == null) {
										continue;
									}

									int[] var71 = class57.queuedSoundEffectDelays;
									var71[var41] += var42.calculateDelay();
									class57.soundEffects[var41] = var42;
								}

								if (class57.queuedSoundEffectDelays[var41] < 0) {
									if (class57.soundLocations[var41] != 0) {
										var4 = Coord.method7702(class57.soundLocations[var41] & 255);
										var5 = class57.soundLocations[var41] >> 16 & 255;
										var6 = class57.soundLocations[var41] >> 8 & 255;
										var7 = class57.soundEffectIds[var41];
										WorldView var28 = worldViewManager.getWorldView(var7);
										ProjectionCoord var29 = class86.method2932(var28, Coord.method7702(var5), Coord.method7702(var6));
										var10 = Coord.method7692((int)var29.x);
										var11 = Coord.method7692((int)var29.y);
										var29.release();
										ProjectionCoord var30 = worldViewManager.method2393();
										var31 = Math.abs(Coord.method7679(var10) - (int)var30.x);
										var14 = Math.abs(Coord.method7679(var11) - (int)var30.y);
										var30.release();
										var15 = Math.max(var14 + var31 - 128, 0);
										var16 = Math.max(Coord.method7702((class57.field787[var41] & 31) - 1), 0);
										var17 = worldViewManager.method2411();
										WorldEntity var18 = worldViewManager.method2391(var7);
										boolean var19 = class57.field793[var41];
										boolean var20 = class39.method814(var17, var18, var19);
										if (var15 >= var4 || !var20) {
											class57.queuedSoundEffectDelays[var41] = -100;
											continue;
										}

										float var21 = var16 < var4 ? Math.min(Math.max((float)(var4 - var15) / (float)(var4 - var16), 0.0F), 1.0F) : 1.0F;
										var3 = (int)(var21 * (float)class468.clientPreferences.getAreaSoundEffectsVolume());
									} else {
										var3 = class468.clientPreferences.getSoundEffectsVolume();
									}

									if (var3 > 0) {
										RawSound var32 = var42.method3115(class468.clientPreferences.method2671());
										RawPcmStream var33 = RawPcmStream.createRawPcmStream(var32, 100, var3);
										if (var33 != null) {
											var33.setNumLoops(class57.queuedSoundEffectLoops[var41] - 1);
											class50.pcmStreamMixer.addSubStream(var33);
										}
									}

									class57.queuedSoundEffectDelays[var41] = -100;
								}
							}
						}

						if (playingJingle) {
							if (!class345.field3929.isEmpty()) {
								var1 = true;
							} else if (!class345.midiRequests.isEmpty() && class345.midiRequests.get(0) != null && ((MidiRequest)class345.midiRequests.get(0)).midiPcmStream != null) {
								var1 = ((MidiRequest)class345.midiRequests.get(0)).midiPcmStream.isReady();
							} else {
								var1 = false;
							}

							if (!var1) {
								if (class468.clientPreferences.getMusicVolume() != 0) {
									boolean var52 = !class345.field3928.isEmpty();
									if (var52) {
										GameObject.method6264(GrandExchangeOfferOwnWorldComparator.field248, class468.clientPreferences.getMusicVolume());
									}
								}

								playingJingle = false;
							}
						}

						++packetWriter.field1270;
						if (packetWriter.field1270 > 750) {
							class165.method4149();
							return;
						}

						var41 = playerUpdateManager.playerCount;
						int[] var44 = playerUpdateManager.playerIndices;
						Iterator var34 = worldViewManager.iterator();

						while (var34.hasNext()) {
							WorldView var55 = (WorldView)var34.next();

							for (var5 = 0; var5 < var41; ++var5) {
								Player var35 = (Player)var55.players.get((long)var44[var5]);
								if (var35 != null) {
									class85.updateActorSequence(var55, var35, 1);
								}
							}
						}

						Iterator var51 = worldViewManager.iterator();

						WorldView var46;
						while (var51.hasNext()) {
							var46 = (WorldView)var51.next();
							var34 = var46.npcs.iterator();

							while (var34.hasNext()) {
								NPC var56 = (NPC)var34.next();
								if (var56 != null) {
									class85.updateActorSequence(var46, var56, var56.definition.size);
								}
							}
						}

						var51 = worldViewManager.iterator();

						while (var51.hasNext()) {
							var46 = (WorldView)var51.next();

							for (var3 = 0; var3 < var46.field1148.method10038(); ++var3) {
								var4 = var46.field1148.method10037(var3);
								WorldEntity var58 = (WorldEntity)var46.worldEntities.get((long)var4);
								if (var58 != null) {
									var58.method10492(cycle);
								}

								field315.method11277(var46, var58.getY(), var58.getPlane(), false);
								if (var58.field5537.getSequenceDefinition() != null && var58.field5537.getSequenceDefinition().method4943() != -1) {
									if (var58.field5523 > 0) {
										--var58.field5523;
									} else {
										var6 = GrandExchangeOfferUnitPriceComparator.method8811(var58.field5537, 1, field315);
										if ((var6 & 2) != 0) {
											var58.field5537.reset();
											var58.field5533.method9872();
										}
									}
								}

								if (var58.field5533.getSequenceDefinition() != null && var58.field5533.getSequenceDefinition().method4943() != -1) {
									var6 = GrandExchangeOfferUnitPriceComparator.method8811(var58.field5533, 1, field315);
									if ((var6 & 2) != 0) {
										var58.field5533.method9872();
									}
								}

								field315.method11278();
							}
						}

						class287.method6521();
						++graphicsCycle;
						if (mouseCrossColor != 0) {
							mouseCrossState = mouseCrossState * 400 + 400;
							if (mouseCrossState * 20 >= 400) {
								mouseCrossColor = 0;
							}
						}

						if (field536 > 0) {
							--field536;
						}

						Widget var53 = class330.mousedOverWidgetIf1;
						Widget var48 = WorldView.field1149;
						class330.mousedOverWidgetIf1 = null;
						WorldView.field1149 = null;
						draggedOnWidget = null;
						field500 = false;
						field465 = false;
						field405 = 0;

						Iterator var60;
						while (indexCheck.method6301() && field405 < 128) {
							if (staffModLevel >= 2 && indexCheck.isValidIndexInRange(82) && indexCheck.field3233 == 66) {
								StringBuilder var57 = new StringBuilder();

								Message var64;
								for (var60 = Messages.Messages_hashTable.iterator(); var60.hasNext(); var57.append(var64.text).append('\n')) {
									var64 = (Message)var60.next();
									if (var64.sender != null && !var64.sender.isEmpty()) {
										var57.append(var64.sender).append(':');
									}
								}

								String var62 = var57.toString();
								SecureUrlRequester.client.method525(var62);
							} else if (oculusOrbState != 1 || indexCheck.field3248 <= 0) {
								field407[field405] = indexCheck.field3233;
								field424[field405] = indexCheck.field3248;
								++field405;
							}
						}

						boolean var45 = staffModLevel >= 2;
						if (var45 && indexCheck.isValidIndexInRange(82) && indexCheck.isValidIndexInRange(81) && mouseWheelRotation != 0) {
							var4 = class330.localPlayer.plane - mouseWheelRotation;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > 3) {
								var4 = 3;
							}

							if (var4 != class330.localPlayer.plane) {
								class114.method3598(class330.localPlayer.pathX[0] + Occluder.topLevelWorldView.baseX, class330.localPlayer.pathY[0] + Occluder.topLevelWorldView.baseY, var4, false);
							}

							mouseWheelRotation = 0;
						}

						if (rootInterface != -1) {
							PcmPlayer.updateRootInterface(rootInterface, 0, 0, class489.canvasWidth, class374.canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							ScriptEvent var59;
							Widget var61;
							Widget var65;
							do {
								var59 = (ScriptEvent)scriptEvents2.removeLast();
								if (var59 == null) {
									while (true) {
										do {
											var59 = (ScriptEvent)scriptEvents3.removeLast();
											if (var59 == null) {
												while (true) {
													do {
														var59 = (ScriptEvent)scriptEvents.removeLast();
														if (var59 == null) {
															boolean var43 = false;

															while (true) {
																class279 var63 = (class279)field400.removeLast();
																if (var63 == null) {
																	if (!var43 && MouseHandler.MouseHandler_lastButton == 1) {
																		field442.method6268();
																	}

																	this.menu();
																	if (Skills.worldMap != null) {
																		Skills.worldMap.method11199(Occluder.topLevelWorldView.plane, (field468 >> 7) + Occluder.topLevelWorldView.baseX, (field512 >> 7) + Occluder.topLevelWorldView.baseY, false);
																		Skills.worldMap.loadCache();
																	}

																	if (clickedWidget != null) {
																		this.method1370();
																	}

																	var60 = worldViewManager.iterator();

																	while (var60.hasNext()) {
																		WorldView var68 = (WorldView)var60.next();
																		Scene var36 = var68.scene;
																		if (var36.shouldSendWalk()) {
																			var8 = var36.baseX;
																			var9 = var36.baseY;
																			PacketBufferNode var37 = ReflectionCheck.getPacketBufferNode(ClientPacket.MOVE_GAMECLICK, packetWriter.isaacCipher);
																			var37.packetBuffer.writeByte(5);
																			var37.packetBuffer.writeShortLE(indexCheck.isValidIndexInRange(82) ? (indexCheck.isValidIndexInRange(81) ? 2 : 1) : 0);
																			var37.packetBuffer.writeIntLE(var9 + var68.baseY);
																			var37.packetBuffer.writeIntLE(var8 + var68.baseX);
																			packetWriter.addNode(var37);
																			mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																			mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																			mouseCrossColor = 1;
																			mouseCrossState = 0;
																			destinationX = var8;
																			destinationY = var9;
																			var36.method5646();
																		}
																	}

																	if (var53 != class330.mousedOverWidgetIf1) {
																		if (var53 != null) {
																			class376.invalidateWidget(var53);
																		}

																		if (class330.mousedOverWidgetIf1 != null) {
																			class376.invalidateWidget(class330.mousedOverWidgetIf1);
																		}
																	}

																	if (var48 != WorldView.field1149 && field535 == field483) {
																		if (var48 != null) {
																			class376.invalidateWidget(var48);
																		}

																		if (WorldView.field1149 != null) {
																			class376.invalidateWidget(WorldView.field1149);
																		}
																	}

																	if (WorldView.field1149 != null) {
																		if (field483 < field535) {
																			++field483;
																			if (field483 == field535) {
																				class376.invalidateWidget(WorldView.field1149);
																			}
																		}
																	} else if (field483 > 0) {
																		--field483;
																	}

																	if (oculusOrbState == 0) {
																		WorldView var66 = worldViewManager.getWorldView(cameraWorldViewId);
																		if (var66 == null) {
																			var66 = Occluder.topLevelWorldView;
																		}

																		Object var69 = null;
																		switch(GrandExchangeOfferUnitPriceComparator.cameraViewMode.mode) {
																		case 0:
																			var69 = (CameraFocusableEntity)var66.players.get((long)cameraTargetIndex);
																			break;
																		case 1:
																			var69 = (CameraFocusableEntity)var66.npcs.get((long)cameraTargetIndex);
																			break;
																		case 2:
																			var69 = (CameraFocusableEntity)var66.worldEntities.get((long)cameraTargetIndex);
																		}

																		if (var69 == null) {
																			var69 = class330.localPlayer;
																		}

																		field468 = ((CameraFocusableEntity)var69).getY();
																		field512 = ((CameraFocusableEntity)var69).getPlane();
																		if (var66 != Occluder.topLevelWorldView) {
																			ProjectionCoord var67 = class86.method2932(var66, ((CameraFocusableEntity)var69).getY(), ((CameraFocusableEntity)var69).getPlane());
																			field468 = (int)var67.x;
																			field512 = (int)var67.y;
																			var67.release();
																		}

																		var7 = ((CameraFocusableEntity)var69).getX();
																		if (class40.oculusOrbFocalPointX - field468 >= -500 && class40.oculusOrbFocalPointX - field468 <= 500 && class4.oculusOrbFocalPointY - field512 >= -500 && class4.oculusOrbFocalPointY - field512 <= 500) {
																			if (field468 != class40.oculusOrbFocalPointX) {
																				class40.oculusOrbFocalPointX += (field468 - class40.oculusOrbFocalPointX) / 16;
																			}

																			if (field512 != class4.oculusOrbFocalPointY) {
																				class4.oculusOrbFocalPointY += (field512 - class4.oculusOrbFocalPointY) / 16;
																			}
																		} else {
																			class40.oculusOrbFocalPointX = field468;
																			class4.oculusOrbFocalPointY = field512;
																		}

																		var8 = class40.oculusOrbFocalPointX >> 7;
																		var9 = class4.oculusOrbFocalPointY >> 7;
																		var10 = NPCComposition.getTileHeight(Occluder.topLevelWorldView, class40.oculusOrbFocalPointX, class4.oculusOrbFocalPointY, var7);
																		var11 = 0;
																		if (var8 > 3 && var9 > 3 && var8 < 100 && var9 < 100) {
																			for (var12 = var8 - 4; var12 <= var8 + 4; ++var12) {
																				for (var31 = var9 - 4; var31 <= var9 + 4; ++var31) {
																					var14 = var7;
																					if (var7 < 3 && (Occluder.topLevelWorldView.tileSettings[1][var12][var31] & 2) == 2) {
																						var14 = var7 + 1;
																					}

																					var15 = var10 - Occluder.topLevelWorldView.tileHeights[var14][var12][var31];
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

																		if (var12 > field447) {
																			field447 += (var12 - field447) / 24;
																		} else if (var12 < field447) {
																			field447 += (var12 - field447) / 80;
																		}

																		var14 = ((CameraFocusableEntity)var69).getY();
																		var15 = ((CameraFocusableEntity)var69).getPlane();
																		var16 = NPCComposition.getTileHeight(var66, var14, var15, var7);
																		var17 = (WorldEntity)Occluder.topLevelWorldView.worldEntities.get((long)var66.id);
																		if (var17 != null) {
																			var16 += NPCComposition.getTileHeight(Occluder.topLevelWorldView, var17.getY(), var17.getPlane(), var17.getX());
																		}

																		field469 = var16;
																		class289.oculusOrbFocalPointZ = field469 - camFollowHeight;
																	} else if (oculusOrbState == 1) {
																		SwapSongTask.method9925();
																		short var47 = -1;
																		if (indexCheck.isValidIndexInRange(33)) {
																			var47 = 0;
																		} else if (indexCheck.isValidIndexInRange(49)) {
																			var47 = 1024;
																		}

																		if (indexCheck.isValidIndexInRange(48)) {
																			if (var47 == 0) {
																				var47 = 1792;
																			} else if (var47 == 1024) {
																				var47 = 1280;
																			} else {
																				var47 = 1536;
																			}
																		} else if (indexCheck.isValidIndexInRange(50)) {
																			if (var47 == 0) {
																				var47 = 256;
																			} else if (var47 == 1024) {
																				var47 = 768;
																			} else {
																				var47 = 512;
																			}
																		}

																		byte var49 = 0;
																		if (indexCheck.isValidIndexInRange(35)) {
																			var49 = -1;
																		} else if (indexCheck.isValidIndexInRange(51)) {
																			var49 = 1;
																		}

																		var7 = 0;
																		if (var47 >= 0 || var49 != 0) {
																			var7 = indexCheck.isValidIndexInRange(81) ? oculusOrbSlowedSpeed : oculusOrbNormalSpeed;
																			var7 *= 16;
																			field441 = var47;
																			field450 = var49;
																		}

																		if (field440 < var7) {
																			field440 += var7 / 8;
																			if (field440 > var7) {
																				field440 = var7;
																			}
																		} else if (field440 > var7) {
																			field440 = field440 * 9 / 10;
																		}

																		if (field440 > 0) {
																			var8 = field440 / 16;
																			if (field441 >= 0) {
																				var5 = field441 - WorldMapData_0.cameraYaw & 2047;
																				var9 = Rasterizer3D.Rasterizer3D_sine[var5];
																				var10 = Rasterizer3D.Rasterizer3D_cosine[var5];
																				class40.oculusOrbFocalPointX += var8 * var9 / 65536;
																				class4.oculusOrbFocalPointY += var8 * var10 / 65536;
																			}

																			if (field450 != 0) {
																				class289.oculusOrbFocalPointZ += var8 * field450;
																				if (class289.oculusOrbFocalPointZ > 0) {
																					class289.oculusOrbFocalPointZ = 0;
																				}
																			}
																		} else {
																			field441 = -1;
																			field450 = -1;
																		}

																		char var50 = '耀';
																		if (var50 > field447) {
																			field447 += (var50 - field447) / 24;
																		} else if (var50 < field447) {
																			field447 += (var50 - field447) / 80;
																		}

																		if (indexCheck.isValidIndexInRange(13)) {
																			packetWriter.addNode(ReflectionCheck.getPacketBufferNode(ClientPacket.field3589, packetWriter.isaacCipher));
																			oculusOrbState = 0;
																		}
																	}

																	if (MouseHandler.MouseHandler_currentButton == 4 && UrlRequest.mouseCam) {
																		var5 = MouseHandler.MouseHandler_y - mouseCamClickedY;
																		camAngleDX = var5 * 2;
																		mouseCamClickedY = var5 != -1 && var5 != 1 ? (MouseHandler.MouseHandler_y + mouseCamClickedY) / 2 : MouseHandler.MouseHandler_y;
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

																	if (field412) {
																		UserComparator10.method3733(class207.field2252, class414.field4955, RouteStrategy.field3280);
																		class282.method6403(AsyncHttpResponse.field68, class300.field3420);
																		if (SpriteBufferProperties.cameraX == class207.field2252 && ScriptFrame.cameraY == class414.field4955 && class528.cameraZ == RouteStrategy.field3280 && GraphicsObject.cameraPitch == AsyncHttpResponse.field68 && class300.field3420 == WorldMapData_0.cameraYaw) {
																			field412 = false;
																			isCameraLocked = false;
																			field494 = false;
																			field538 = false;
																			class117.field1517 = 0;
																			AuthenticationScheme.field1589 = 0;
																			MoveSpeed.field3305 = 0;
																			class28.field124 = 0;
																			WorldView.field1142 = 0;
																			class487.field5389 = 0;
																			FloatProjection.field2946 = 0;
																			class278.field3221 = 0;
																			SpriteMask.field4089 = 0;
																			class195.field2078 = 0;
																			field540 = null;
																			field542 = null;
																			field541 = null;
																		}
																	} else if (isCameraLocked) {
																		if (!field494) {
																			var5 = Coord.method7679(class278.field3221);
																			var6 = Coord.method7679(SpriteMask.field4089);
																			var7 = NPCComposition.getTileHeight(Occluder.topLevelWorldView, var5, var6, Occluder.topLevelWorldView.plane) - class195.field2078;
																			UserComparator10.method3733(var5, var7, var6);
																		} else if (field540 != null) {
																			SpriteBufferProperties.cameraX = field540.vmethod10971();
																			class528.cameraZ = field540.vmethod10974();
																			if (field425) {
																				ScriptFrame.cameraY = field540.vmethod10970();
																			} else {
																				ScriptFrame.cameraY = NPCComposition.getTileHeight(Occluder.topLevelWorldView, SpriteBufferProperties.cameraX, class528.cameraZ, Occluder.topLevelWorldView.plane) - field540.vmethod10970();
																			}

																			field540.method10986();
																		}

																		if (!field538) {
																			var5 = Coord.method7679(class117.field1517);
																			var6 = Coord.method7679(AuthenticationScheme.field1589);
																			var7 = NPCComposition.getTileHeight(Occluder.topLevelWorldView, var5, var6, Occluder.topLevelWorldView.plane) - MoveSpeed.field3305;
																			var8 = var5 - SpriteBufferProperties.cameraX;
																			var9 = var7 - ScriptFrame.cameraY;
																			var10 = var6 - class528.cameraZ;
																			var11 = (int)Math.sqrt((double)(var8 * var8 + var10 * var10));
																			var12 = (int)(Math.atan2((double)var9, (double)var11) * 325.9490051269531D) & 2047;
																			var31 = (int)(Math.atan2((double)var8, (double)var10) * -325.9490051269531D) & 2047;
																			class282.method6403(var12, var31);
																		} else {
																			if (field542 != null) {
																				GraphicsObject.cameraPitch = field542.method10969();
																				GraphicsObject.cameraPitch = Math.min(Math.max(GraphicsObject.cameraPitch, 128), 383);
																				field542.method10986();
																			}

																			if (field541 != null) {
																				WorldMapData_0.cameraYaw = field541.method10969() & 2047;
																				field541.method10986();
																			}
																		}
																	}

																	for (var5 = 0; var5 < 5; ++var5) {
																		var10002 = field547[var5]++;
																	}

																	class166.varcs.tryWrite();
																	var5 = FileSystem.method5112();
																	var6 = GameEngine.keyHandler.method397();
																	PacketBufferNode var54;
																	if (var5 > 15000 && var6 > 15000) {
																		logoutTimer = 250;
																		MouseHandler.MouseHandler_idleCycles = 14500;
																		var54 = ReflectionCheck.getPacketBufferNode(ClientPacket.EVENT_MOUSE_IDLE, packetWriter.isaacCipher);
																		packetWriter.addNode(var54);
																	}

																	class320.friendSystem.processFriendUpdates();
																	class394.method8394();
																	++packetWriter.pendingWrites;
																	if (packetWriter.pendingWrites > 50) {
																		var54 = ReflectionCheck.getPacketBufferNode(ClientPacket.NO_TIMEOUT, packetWriter.isaacCipher);
																		packetWriter.addNode(var54);
																	}

																	try {
																		packetWriter.flush();
																	} catch (IOException var38) {
																		class165.method4149();
																	}

																	WorldMapArea.method6664().method5134();
																	return;
																}

																if (var63.field3227.type == 12) {
																	var43 = true;
																}

																class179.method4287(var63);
															}
														}

														var61 = var59.widget;
														if (var61.childIndex * 2077538819 < 0) {
															break;
														}

														var65 = class226.widgetDefinition.method7728(var61.parentId);
													} while(var65 == null || var65.children == null || var61.childIndex * 2077538819 >= var65.children.length || var61 != var65.children[var61.childIndex * 2077538819]);

													class141.runScriptEvent(var59);
												}
											}

											var61 = var59.widget;
											if (var61.childIndex * 2077538819 < 0) {
												break;
											}

											var65 = class226.widgetDefinition.method7728(var61.parentId);
										} while(var65 == null || var65.children == null || var61.childIndex * 2077538819 >= var65.children.length || var61 != var65.children[var61.childIndex * 2077538819]);

										class141.runScriptEvent(var59);
									}
								}

								var61 = var59.widget;
								if (var61.childIndex * 2077538819 < 0) {
									break;
								}

								var65 = class226.widgetDefinition.method7728(var61.parentId);
							} while(var65 == null || var65.children == null || var61.childIndex * 2077538819 >= var65.children.length || var61 != var65.children[var61.childIndex * 2077538819]);

							class141.runScriptEvent(var59);
						}
					}

					var40 = ReflectionCheck.getPacketBufferNode(ClientPacket.REFLECTION_CHECK_REPLY, packetWriter.isaacCipher);
					var40.packetBuffer.writeByte(0);
					var3 = var40.packetBuffer.offset * 2108391709;
					class144.performReflectionCheck(var40.packetBuffer);
					var40.packetBuffer.writeLengthByte(var40.packetBuffer.offset * 2108391709 - var3);
					packetWriter.addNode(var40);
				}
			}
		}
	}

	@ObfuscatedName("qm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1000691922"
	)
	void method1047() {
		if (MouseHandler.MouseHandler_lastButton == 1 || !UrlRequest.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
			long var1 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis * -1L;
			if (var1 > 32767L) {
				var1 = 32767L;
			}

			mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis * -1L;
			int var3 = MouseHandler.MouseHandler_lastPressedY;
			if (var3 < 0) {
				var3 = 0;
			} else if (var3 > class374.canvasHeight) {
				var3 = class374.canvasHeight;
			}

			int var4 = MouseHandler.MouseHandler_lastPressedX;
			if (var4 < 0) {
				var4 = 0;
			} else if (var4 > class489.canvasWidth) {
				var4 = class489.canvasWidth;
			}

			int var5 = (int)var1;
			PacketBufferNode var6 = ReflectionCheck.getPacketBufferNode(ClientPacket.EVENT_MOUSE_CLICK, packetWriter.isaacCipher);
			var6.packetBuffer.writeShort(var4);
			var6.packetBuffer.writeShort(var3);
			var6.packetBuffer.writeByteNeg(0);
			var6.packetBuffer.writeShortAdd((var5 << 1) + (MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0));
			packetWriter.addNode(var6);
		}

	}

	@ObfuscatedName("qy")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "8"
	)
	public void vmethod7564(int var1, int var2) {
		if (packetWriter != null && packetWriter.isaacCipher != null) {
			if (var1 > -1 && class468.clientPreferences.getMusicVolume() > 0 && !playingJingle) {
				PacketBufferNode var3 = ReflectionCheck.getPacketBufferNode(ClientPacket.MUSIC_PLAYING, packetWriter.isaacCipher);
				var3.packetBuffer.writeInt(var1);
				packetWriter.addNode(var3);
			}

		}
	}

	@ObfuscatedName("qq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-472954968"
	)
	void method869() {
		int var1 = class489.canvasWidth;
		int var2 = class374.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}

		if (class468.clientPreferences != null) {
			try {
				Client var3 = SecureUrlRequester.client;
				Object[] var4 = new Object[]{class182.getWindowedMode()};
				JSObject.getWindow(var3).call("resize", var4);
			} catch (Throwable var5) {
			}
		}

	}

	@ObfuscatedName("qv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-747111914"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) {
			class497.method10123(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (validRootWidgets[var1]) {
				field523[var1] = true;
			}

			field524[var1] = validRootWidgets[var1];
			validRootWidgets[var1] = false;
		}

		field490 = cycle;
		viewportX = -1;
		viewportY = -1;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			class150.drawWidgets(rootInterface, 0, 0, class489.canvasWidth, class374.canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				class137.crossSprites[mouseCrossState * 20 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				class137.crossSprites[mouseCrossState * 20 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
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
						var5 = menu.method12288(var3);
					}

					if (menu.menuOptionsCount > 2) {
						var5 = var5 + class144.colorStartTag(16777215) + " " + '/' + " " + (menu.menuOptionsCount - 2) + " more options";
					}

					class234.fontBold12.drawRandomAlphaAndSpacing(var5, var1 + 4, var2 + 15, 16777215, 0, cycle / 1000);
				}
			}
		} else {
			menu.method12287();
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field524[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field523[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		this.method871();
	}

	@ObfuscatedName("qp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1547651279"
	)
	void method871() {
		ProjectionCoord var1 = worldViewManager.method2393();
		WorldEntity var2 = worldViewManager.method2411();
		int var3 = (int)var1.z;
		int var4 = (int)var1.x;
		int var5 = (int)var1.y;
		int var6 = graphicsCycle;
		Iterator var7 = worldViewManager.iterator();

		while (var7.hasNext()) {
			WorldView var8 = (WorldView)var7.next();

			for (ObjectSound var9 = (ObjectSound)var8.method2789().last(); var9 != null; var9 = (ObjectSound)var8.method2789().previous()) {
				var9.method2292(var2, var3, var4, var5, var6);
			}
		}

		var1.release();
		graphicsCycle = 0;
	}

	@ObfuscatedName("qz")
	@ObfuscatedSignature(
		descriptor = "(Ldl;B)Z",
		garbageValue = "48"
	)
	boolean method872(PacketWriter var1) {
		if (var1.serverPacketLength == 0) {
			BuddyRankComparator.friendsChat = null;
		} else {
			if (BuddyRankComparator.friendsChat == null) {
				BuddyRankComparator.friendsChat = new FriendsChat(LoginScreenAnimation.loginType, SecureUrlRequester.client);
			}

			BuddyRankComparator.friendsChat.method10197(var1.packetBuffer);
		}

		field513 = cycleCntr;
		HintArrow.ClanChat_inClanChat = true;
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("qe")
	@ObfuscatedSignature(
		descriptor = "(Ldl;I)Z",
		garbageValue = "-454677931"
	)
	boolean method1310(PacketWriter var1) {
		if (BuddyRankComparator.friendsChat != null) {
			BuddyRankComparator.friendsChat.method10226(var1.packetBuffer);
		}

		field513 = cycleCntr;
		HintArrow.ClanChat_inClanChat = true;
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("qc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-89865448"
	)
	void method1357() {
		int var1 = 0;
		boolean var2 = packetWriter.field1262 > 0;

		for (int var3 = packetWriter.field1273; var1 < 100 || var2; var2 = packetWriter.field1262 > 0) {
			boolean var4 = this.method1434(packetWriter);
			if (var2) {
				int var5 = packetWriter.field1273 - var3;
				PacketWriter var10000 = packetWriter;
				var10000.field1262 -= var5;
			}

			if (!var4) {
				break;
			}

			++var1;
			var3 = packetWriter.field1273;
		}

	}

	@ObfuscatedName("qk")
	@ObfuscatedSignature(
		descriptor = "(Ldl;I)Z",
		garbageValue = "1245806566"
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
				if (var1.field1262 > 0 && !var2.isAvailable(var1.field1262)) {
					return false;
				}

				int var5;
				if (var1.serverPacket == null) {
					if (var1.field1269) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var1.field1273 += var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1270 = 0;
						var1.field1269 = false;
					}

					var3.offset = 0;
					if (var3.method11590()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var1.field1273 += var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1270 = 0;
					}

					var1.field1269 = true;
					ServerPacket[] var4 = class134.ServerPacket_values();
					var5 = var3.readSmartByteShortIsaac();
					if (var5 < 0 || var5 >= var4.length) {
						throw new IOException(var5 + " " + var3.offset * 2108391709);
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
				timer.method8500();
				var1.field1267 = var1.field1275;
				var1.field1275 = var1.field1272;
				var1.field1272 = var1.serverPacket;
				int var9;
				int var22;
				if (ServerPacket.CAM_LOOKAT_EASED_ANGLE_RELATIVE == var1.serverPacket) {
					var22 = var3.readUnsignedShortAddLE();
					var6 = var3.readUnsignedByteSub();
					var5 = var3.readUnsignedShortLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					NPC var63 = (NPC)AsyncHttpResponse.worldView.npcs.get((long)var22);
					if (var63 != null) {
						SequenceDefinition var68 = var63.animationSequence.getSequenceDefinition();
						if (var5 == var63.method2572() && var5 != -1) {
							var9 = var68.restartMode;
							if (var9 == 1) {
								var63.animationSequence.method9872();
								var63.field1017 = var6;
							} else if (var9 == 2) {
								var63.animationSequence.method9890();
							}
						} else if (var5 == -1 || var68 == null || ClientPacket.SequenceDefinition_get(var5).field2512 >= var68.field2512) {
							var63.animationSequence.setSequence(var5);
							var63.animationSequence.method9872();
							var63.field1017 = var6;
							var63.field1075 = var63.pathLength;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_OPENSUB == var1.serverPacket) {
					HealthBarUpdate.method2594(class334.field3694);
					var1.serverPacket = null;
					return true;
				}

				boolean var74;
				String var93;
				if (ServerPacket.CAM_MODE == var1.serverPacket) {
					var22 = var3.readUShortSmart();
					var74 = var3.readUnsignedByte() == 1;
					var93 = "";
					boolean var110 = false;
					if (var74) {
						var93 = var3.readStringCp1252NullTerminated();
						if (class320.friendSystem.isIgnored(new Username(var93, LoginScreenAnimation.loginType))) {
							var110 = true;
						}
					}

					String var67 = var3.readStringCp1252NullTerminated();
					if (!var110) {
						class356.addGameMessage(var22, var93, var67);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_LOOKAT == var1.serverPacket) {
					var1.field1262 = var3.readShort();
					var1.serverPacket = null;
					return true;
				}

				int var10;
				int var24;
				String var53;
				if (ServerPacket.field3837 == var1.serverPacket) {
					var53 = var3.readStringCp1252NullTerminated();
					Object[] var100 = new Object[var53.length() + 1];

					for (var6 = var53.length() - 1; var6 >= 0; --var6) {
						DynamicArray var66;
						switch(var53.charAt(var6)) {
						case 'W':
							var24 = var3.packBytesToInt();
							var66 = new DynamicArray(class586.field5937, 0, var24, var24);
							int[] var86 = var66.method10650();

							for (var10 = 0; var10 < var24; ++var10) {
								var86[var10] = var3.writeIntME();
							}

							var100[var6 + 1] = var66;
							break;
						case 'X':
							var24 = var3.packBytesToInt();
							var66 = new DynamicArray(class586.field5939, (Object)null, var24, var24);
							Object[] var84 = var66.method10681();

							for (var10 = 0; var10 < var24; ++var10) {
								var84[var10] = var3.readStringCp1252NullTerminated();
							}

							var100[var6 + 1] = var66;
							break;
						case 's':
							var100[var6 + 1] = var3.readStringCp1252NullTerminated();
							break;
						default:
							var100[var6 + 1] = new Integer(var3.readInt());
						}
					}

					var100[0] = new Integer(var3.readInt());
					ScriptEvent var108 = new ScriptEvent();
					var108.args = var100;
					class141.runScriptEvent(var108);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OCULUS_SYNC == var1.serverPacket) {
					class184.method4316();
					weight = var3.readShort();
					field338 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOC_DEL == var1.serverPacket) {
					byte[] var57 = new byte[var1.serverPacketLength];
					var3.method11575(var57, 0, var57.length);
					Buffer var98 = new Buffer(var57);
					var93 = var98.readStringCp1252NullTerminated();
					class558.openURL(var93);
					var1.serverPacket = null;
					return true;
				}

				int var11;
				int var12;
				int var27;
				int var71;
				if (ServerPacket.SET_NPC_UPDATE_ORIGIN == var1.serverPacket) {
					var6 = var3.readUnsignedIntIME();
					var22 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var24 = var22 + (var6 >> 4 & 7);
					var27 = var5 + (var6 & 7);
					var9 = var3.readUnsignedByteSub();
					var10 = var9 >> 2;
					var11 = var9 & 3;
					var12 = field284[var10];
					var71 = var3.readUnsignedShort();
					if (0 <= var24 && var24 < 103 && 0 <= var27 && var27 < 103) {
						class179.method4286(var24, var27, var10, var11, var12, var71);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_ACTIVE_WORLD == var1.serverPacket) {
					Iterator var56 = AsyncHttpResponse.worldView.players.iterator();

					while (var56.hasNext()) {
						Player var94 = (Player)var56.next();
						var94.method2486();
					}

					Iterator var96 = AsyncHttpResponse.worldView.npcs.iterator();

					while (var96.hasNext()) {
						NPC var105 = (NPC)var96.next();
						var105.method2486();
					}

					var1.serverPacket = null;
					return true;
				}

				byte var76;
				if (ServerPacket.VAR_CLAN_ENABLE == var1.serverPacket) {
					field515 = cycleCntr;
					var76 = var3.readByte();
					class168 var90 = new class168(var3);
					ClanChannel var104;
					if (var76 >= 0) {
						var104 = currentClanChannels[var76];
					} else {
						var104 = class57.guestClanChannel;
					}

					if (var104 == null) {
						this.method1023(var76);
						var1.serverPacket = null;
						return true;
					}

					if (var90.field1888 > var104.field1899) {
						this.method1023(var76);
						var1.serverPacket = null;
						return true;
					}

					if (var90.field1888 < var104.field1899) {
						var1.serverPacket = null;
						return true;
					}

					var90.method4170(var104);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_RUN_WEIGHT == var1.serverPacket) {
					class31.method492();
					var76 = var3.readByte();
					class154 var88 = new class154(var3);
					ClanSettings var102;
					if (var76 >= 0) {
						var102 = currentClanSettings[var76];
					} else {
						var102 = SecureRandomFuture.guestClanSettings;
					}

					if (var102 == null) {
						this.method884(var76);
						var1.serverPacket = null;
						return true;
					}

					if (var88.field1780 > var102.field1827) {
						this.method884(var76);
						var1.serverPacket = null;
						return true;
					}

					if (var88.field1780 < var102.field1827) {
						var1.serverPacket = null;
						return true;
					}

					var88.method3988(var102);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VAR_CLAN == var1.serverPacket) {
					World var55 = new World();
					var55.host = var3.readStringCp1252NullTerminated();
					var55.id = var3.readUnsignedShort();
					var5 = var3.readInt();
					var55.properties = var5;
					if (var55.isDeadman()) {
						var55.field590 = "beta";
						class452.field5203 = true;
					} else {
						class452.field5203 = false;
					}

					WorldMapSectionType.updateGameState(45);
					var2.close();
					var2 = null;
					EnumComposition.changeWorld(var55);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.IF_SETHIDE == var1.serverPacket) {
					if (rootInterface != -1) {
						class520.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.GRAPHICSOBJECT_SPAWN == var1.serverPacket) {
					AttackOption.updateNpcs(AsyncHttpResponse.worldView, true, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_HEADICON_SPECIFIC == var1.serverPacket) {
					class4.field4 = null;
					var1.serverPacket = null;
					return true;
				}

				Widget var23;
				if (ServerPacket.field3832 == var1.serverPacket) {
					var22 = var3.readUnsignedShortAddLE();
					var5 = var3.method11867();
					var23 = class226.widgetDefinition.method7728(var5);
					if (var23.modelType != 2 || var22 != var23.modelId) {
						var23.modelType = 2;
						var23.modelId = var22;
						class376.invalidateWidget(var23);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MINIMAP_FLAG_SET == var1.serverPacket) {
					field309 = var3.readStringCp1252NullTerminated();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SYNC_CLIENT_VARCACHE == var1.serverPacket) {
					class30.logOut();
					var1.serverPacket = null;
					return false;
				}

				WorldView var89;
				if (ServerPacket.IF_SETANIM == var1.serverPacket) {
					var22 = var3.readUnsignedByteSub();
					var5 = var3.method11867();
					var6 = var3.readUnsignedShortLE();
					var24 = Coord.method7673(var5);
					var27 = Coord.method7674(var5);
					var9 = Coord.method7675(var5);
					var89 = worldViewManager.getWorldViewFromWorldPoint(var27, var9);
					var11 = var27 - var89.baseX;
					var12 = var9 - var89.baseY;
					if (var11 >= 0 && var12 >= 0 && var11 < var89.sizeX && var12 < var89.sizeY) {
						class1.method10(var89, var24, var11, var12, var6, var22);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SYNTH_SOUND == var1.serverPacket) {
					var6 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedShortLE();
					var27 = var3.readUnsignedShort();
					var22 = var3.readUnsignedShortAdd();
					var24 = var3.readUnsignedShortLE();
					if (var22 == 65535) {
						var22 = -1;
					}

					ArrayList var83 = new ArrayList();
					var83.add(var22);
					KitDefinition.playSong(var83, var5, var6, var24, var27);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3842 == var1.serverPacket) {
					var3.readLong();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_INFO_SMALL_VIEWPORT == var1.serverPacket) {
					GrandExchangeOfferUnitPriceComparator.cameraViewMode = (CameraViewMode)GrandExchangeOffer.findEnumerated(class329.method7256(), var3.readUnsignedByte());
					cameraWorldViewId = var3.readShort();
					cameraTargetIndex = var3.readUnsignedShort();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3843 == var1.serverPacket) {
					var22 = var3.readInt();
					var5 = var3.method11867();
					var6 = var3.readUnsignedShortAdd();
					var24 = Coord.method7673(var22);
					var27 = Coord.method7674(var22);
					var9 = Coord.method7675(var22);
					var89 = worldViewManager.getWorldViewFromWorldPoint(var27, var9);
					var11 = var27 - var89.baseX;
					var12 = var9 - var89.baseY;
					if (var11 >= 0 && var12 >= 0 && var11 < var89.sizeX && var12 < var89.sizeY) {
						class136.method3805(var89, var24, var11, var12, var6, var5);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_OPENTOP == var1.serverPacket) {
					var22 = var3.readUnsignedByte();
					class184.forceDisconnect(var22);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.RESET_INTERACTION_MODE == var1.serverPacket) {
					hintArrow.method8455(var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_SMOOTH_RESET == var1.serverPacket) {
					HealthBarUpdate.method2594(class334.field3692);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOC_ANIM == var1.serverPacket) {
					var3.offset += 1524892108;
					if (var3.checkCrc()) {
						HitSplatDefinition.randomDatData2(var3, var3.offset * 2108391709 - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_PLAYERMODEL_BASECOLOUR == var1.serverPacket) {
					var6 = var3.method11686();
					var22 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var24 = var22 + (var6 >> 4 & 7);
					var27 = var5 + (var6 & 7);
					var9 = var3.readUnsignedShortAdd();
					var11 = var3.readUnsignedShortAddLE();
					var10 = var3.readUnsignedByteSub();
					if (var24 >= 0 && var27 >= 0 && var24 < AsyncHttpResponse.worldView.sizeX && var27 < AsyncHttpResponse.worldView.sizeY) {
						var24 = Coord.method7679(var24);
						var27 = Coord.method7679(var27);
						GraphicsObject var99 = new GraphicsObject(AsyncHttpResponse.worldView, var9, AsyncHttpResponse.worldView.plane, var24, var27, NPCComposition.getTileHeight(AsyncHttpResponse.worldView, var24, var27, AsyncHttpResponse.worldView.plane) - var10, var11, cycle);
						AsyncHttpResponse.worldView.graphicsObjects.addFirst(var99);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_PRIVCHATMODE == var1.serverPacket) {
					Messages.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_FRIENDLIST == var1.serverPacket) {
					var22 = var3.readUnsignedShortAddLE();
					if (var22 == 65535) {
						var22 = -1;
					}

					rootInterface = var22;
					this.method879(false);
					class593.method11550(var22);
					MidiPcmStream.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						validRootWidgets[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MINIMAP_TOGGLE == var1.serverPacket) {
					var22 = var3.readShort();
					class526 var87 = (class526)GrandExchangeOffer.findEnumerated(class164.method4141(), var3.readUnsignedByte());
					class524 var101 = (class524)GrandExchangeOffer.findEnumerated(WorldMapSprite.method7016(), var3.readUnsignedByte());
					if (var22 == -2) {
						worldViewManager.method2395(var87, var101);
					} else {
						worldViewManager.method2417(var22, var87, var101);
					}

					var1.serverPacket = null;
					return true;
				}

				int var15;
				long var30;
				long var32;
				long var34;
				String var39;
				if (ServerPacket.CAM_MOVE_TO == var1.serverPacket) {
					var53 = var3.readStringCp1252NullTerminated();
					var30 = var3.readLong();
					var32 = (long)var3.readUnsignedShort();
					var34 = (long)var3.readMedium();
					PlayerType var109 = (PlayerType)GrandExchangeOffer.findEnumerated(Varps.PlayerType_values(), var3.readUnsignedByte());
					long var111 = var34 + (var32 << 32);
					boolean var73 = false;

					for (var15 = 0; var15 < 100; ++var15) {
						if (var111 == crossWorldMessageIds[var15]) {
							var73 = true;
							break;
						}
					}

					if (var109.isUser && class320.friendSystem.isIgnored(new Username(var53, LoginScreenAnimation.loginType))) {
						var73 = true;
					}

					if (!var73 && field305 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var111;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var39 = AbstractFont.escapeBrackets(ClanChannelMember.method3986(ObjectSound.method2380(var3)));
						if (var109.modIcon != -1) {
							class222.addChatMessage(9, SoundSystem.method3226(var109.modIcon) + var53, var39, class27.base37DecodeLong(var30));
						} else {
							class222.addChatMessage(9, var53, var39, class27.base37DecodeLong(var30));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				boolean var69;
				boolean var70;
				if (ServerPacket.MIDI_SONG_STOP == var1.serverPacket) {
					isCameraLocked = true;
					field412 = false;
					field494 = true;
					class278.field3221 = var3.readUnsignedByte();
					SpriteMask.field4089 = var3.readUnsignedByte();
					var22 = var3.readUnsignedShort();
					var5 = Coord.method7679(var3.readUnsignedByte());
					var6 = Coord.method7679(var3.readUnsignedByte());
					var24 = var3.readUnsignedShort();
					field425 = var3.readBoolean();
					var27 = var3.readUnsignedByte();
					var9 = Coord.method7679(class278.field3221);
					var10 = Coord.method7679(SpriteMask.field4089);
					var70 = false;
					var69 = false;
					if (field425) {
						var11 = ScriptFrame.cameraY;
						var12 = NPCComposition.getTileHeight(Occluder.topLevelWorldView, var9, var10, Occluder.topLevelWorldView.plane) - var22;
					} else {
						var11 = NPCComposition.getTileHeight(Occluder.topLevelWorldView, SpriteBufferProperties.cameraX, class528.cameraZ, Occluder.topLevelWorldView.plane) - ScriptFrame.cameraY;
						var12 = var22;
					}

					field540 = new class556(SpriteBufferProperties.cameraX, class528.cameraZ, var11, var9, var10, var12, var5, var6, var24, var27);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.TRIGGER_ONDIALOG_ABORT == var1.serverPacket) {
					class184.method4316();
					var22 = var3.readUnsignedByteAdd();
					var5 = var3.readUnsignedByteSub();
					var6 = var3.readUnsignedByteAdd();
					var24 = var3.readInt();
					experience[var6] = var24;
					currentLevels[var6] = var22;
					levels[var6] = 1;
					field328[var6] = var5;

					for (var27 = 0; var27 < 98; ++var27) {
						if (var24 >= Skills.Skills_experienceTable[var27]) {
							levels[var6] = var27 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var6;
					var1.serverPacket = null;
					return true;
				}

				NPC var64;
				if (ServerPacket.IF_SETOBJECT == var1.serverPacket) {
					var24 = var3.readUnsignedByteNeg();
					var6 = var3.readUnsignedShort();
					var5 = var3.method11867();
					var22 = var3.readUnsignedShort();
					var64 = (NPC)AsyncHttpResponse.worldView.npcs.get((long)var22);
					if (var64 != null) {
						var64.updateSpotAnimation(var24, var6, var5 >> 16, var5 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_SPOTANIM == var1.serverPacket) {
					var22 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedShort();
					class27.queueSoundEffect(var22, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_PLAYER_OP == var1.serverPacket) {
					var22 = var3.readUnsignedByteNeg();
					var5 = var3.readUnsignedByte();
					var93 = var3.readStringCp1252NullTerminated();
					if (var22 >= 1 && var22 <= 8) {
						if (var93.equalsIgnoreCase("null")) {
							var93 = null;
						}

						playerMenuActions[var22 - 1] = var93;
						playerOptionsPriorities[var22 - 1] = var5 == 0;
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var78;
				if (ServerPacket.MESSAGE_PRIVATE == var1.serverPacket) {
					var22 = var3.method11858();
					var78 = class226.widgetDefinition.method7728(var22);

					for (var6 = 0; var6 < var78.itemIds.length; ++var6) {
						var78.itemIds[var6] = -1;
						var78.itemIds[var6] = 0;
					}

					class376.invalidateWidget(var78);
					var1.serverPacket = null;
					return true;
				}

				InterfaceParent var7;
				Widget var59;
				if (ServerPacket.UPDATE_STOCKMARKET_SLOT == var1.serverPacket) {
					var22 = var3.method11804();
					var5 = var3.method11867();
					InterfaceParent var91 = (InterfaceParent)interfaceParents.get((long)var22);
					var7 = (InterfaceParent)interfaceParents.get((long)var5);
					if (var7 != null) {
						class39.closeInterface(var7, var91 == null || var7.group != var91.group);
					}

					if (var91 != null) {
						var91.remove();
						interfaceParents.put(var91, (long)var5);
					}

					var59 = class226.widgetDefinition.method7728(var22);
					if (var59 != null) {
						class376.invalidateWidget(var59);
					}

					var59 = class226.widgetDefinition.method7728(var5);
					if (var59 != null) {
						class376.invalidateWidget(var59);
						class339.revalidateWidgetScroll(class226.widgetDefinition.Widget_interfaceComponents[var59.id >>> 16], var59, true);
					}

					if (rootInterface != -1) {
						class520.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETNPCHEAD_ACTIVE == var1.serverPacket) {
					var22 = var3.readInt();
					InterfaceParent var85 = (InterfaceParent)interfaceParents.get((long)var22);
					if (var85 != null) {
						class39.closeInterface(var85, true);
					}

					if (meslayerContinueWidget != null) {
						class376.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_PARTIAL == var1.serverPacket) {
					var22 = var3.readInt();
					var5 = var3.readInt();
					var6 = class145.getGcDuration();
					PacketBufferNode var60 = ReflectionCheck.getPacketBufferNode(ClientPacket.PING_STATISTICS, packetWriter.isaacCipher);
					var60.packetBuffer.writeIntIME(var22);
					var60.packetBuffer.writeInt(var5);
					var60.packetBuffer.writeByteSub(GameEngine.fps);
					var60.packetBuffer.writeShortLE(var6);
					packetWriter.addNode(var60);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VARP_LARGE == var1.serverPacket) {
					var5 = var3.readUnsignedShort();
					var22 = var3.readUnsignedShortAddLE();
					class167.method4167(var22, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PING_STATISTICS_REQUEST == var1.serverPacket) {
					class418.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_WORLDENTITY == var1.serverPacket) {
					var53 = var3.readStringCp1252NullTerminated();
					var25 = AbstractFont.escapeBrackets(ClanChannelMember.method3986(ObjectSound.method2380(var3)));
					class356.addGameMessage(6, var53, var25);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_MOVETO_EASED_CIRCULAR == var1.serverPacket) {
					var22 = var3.method11804();
					short var75 = (short)var3.readUnsignedIntLE();
					var6 = var3.readUnsignedShortAdd();
					var24 = var3.readUnsignedByteNeg();
					var64 = (NPC)AsyncHttpResponse.worldView.npcs.get((long)var6);
					if (var64 != null) {
						var64.method2818(var24, var22, var75);
					}

					var1.serverPacket = null;
					return true;
				}

				boolean var82;
				if (ServerPacket.IF_CLOSESUB == var1.serverPacket) {
					var82 = var3.readUnsignedByteAdd() == 1;
					var5 = var3.method11867();
					var23 = class226.widgetDefinition.method7728(var5);
					if (var82 != var23.isHidden) {
						var23.isHidden = var82;
						class376.invalidateWidget(var23);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CLAN_SETTINGS_FULL == var1.serverPacket) {
					var22 = var3.method11804();
					var5 = var3.readUnsignedShortLE();
					var23 = class226.widgetDefinition.method7728(var22);
					if (var23.modelType != 6 || var5 != var23.modelId) {
						var23.modelType = 6;
						var23.modelId = var5;
						class376.invalidateWidget(var23);
					}

					var1.serverPacket = null;
					return true;
				}

				String var40;
				int var72;
				if (ServerPacket.IF_SETSCROLLPOS == var1.serverPacket) {
					var76 = var3.readByte();
					var30 = (long)var3.readUnsignedShort();
					var32 = (long)var3.readMedium();
					var34 = var32 + (var30 << 32);
					var70 = false;
					ClanChannel var97 = var76 >= 0 ? currentClanChannels[var76] : class57.guestClanChannel;
					if (var97 == null) {
						var70 = true;
					} else {
						for (var71 = 0; var71 < 100; ++var71) {
							if (crossWorldMessageIds[var71] == var34) {
								var70 = true;
								break;
							}
						}
					}

					if (!var70) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var34;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var40 = ObjectSound.method2380(var3);
						var72 = var76 >= 0 ? 43 : 46;
						class222.addChatMessage(var72, "", var40, var97.name);
					}

					var1.serverPacket = null;
					return true;
				}

				int var16;
				int var17;
				WorldView var112;
				if (ServerPacket.field3773 == var1.serverPacket) {
					var22 = var3.readUnsignedShortAdd();
					var5 = var3.method11858();
					var6 = var3.method11804();
					short var106 = (short)var3.readShortLE();
					short var107 = (short)var3.readShort();
					var9 = var3.readUnsignedShortAdd();
					var10 = var3.readUnsignedIntLE();
					var11 = var3.readSignedShort();
					var12 = Coord.method7673(var6);
					var71 = Coord.method7674(var6);
					var72 = Coord.method7675(var6);
					var112 = worldViewManager.getWorldViewFromWorldPoint(var71, var72);
					var16 = var71 - var112.baseX;
					var17 = var72 - var112.baseY;
					if (var16 >= 0 && var17 >= 0 && var16 < var112.sizeX && var17 < var112.sizeY) {
						WorldMapIcon_1.method6595(var112, var12, var16, var17, var9, var5, var106, var11, var107, var10, var22);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3844 == var1.serverPacket) {
					class340.updateWorldEntitiesFromPacketBuffer(AsyncHttpResponse.worldView, var3, 6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_PLAYERMODEL_OBJ == var1.serverPacket) {
					return this.method872(var1);
				}

				if (ServerPacket.CAM_MOVETO == var1.serverPacket) {
					playerUpdateManager.method2936(var3, var1.serverPacketLength);
					ReflectionCheck.method3625();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PROJECTILE_SPAWN == var1.serverPacket) {
					var22 = var3.readUnsignedShortAddLE();
					var5 = var3.readInt();
					var23 = class226.widgetDefinition.method7728(var5);
					if (var23.modelType != 1 || var22 != var23.modelId) {
						var23.modelType = 1;
						var23.modelId = var22;
						class376.invalidateWidget(var23);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.HEAT_MAP == var1.serverPacket) {
					var6 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedShortAddLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					var9 = var3.readUnsignedShortAddLE();
					var27 = var3.readUnsignedShortLE();
					var24 = var3.readUnsignedShort();
					var22 = var3.readUnsignedShort();
					if (var22 == 65535) {
						var22 = -1;
					}

					ArrayList var103 = new ArrayList();
					var103.add(var22);
					var103.add(var5);
					KitDefinition.playSong(var103, var6, var24, var27, var9);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.WORLDENTITY_INFO == var1.serverPacket) {
					WorldMapRectangle.field3472 = var3.readBoolean();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_CLEAR == var1.serverPacket) {
					ClientPacket.privateChatMode = class461.method9363(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CLAN_CHANNEL_DELTA == var1.serverPacket) {
					AttackOption.updateNpcs(AsyncHttpResponse.worldView, false, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RUNCLIENTSCRIPT == var1.serverPacket) {
					if (class4.field4 == null) {
						class4.field4 = new class533(ScriptFrame.field202);
					}

					class609 var54 = ScriptFrame.field202.method10794(var3);
					class4.field4.field5637.vmethod11305(var54.field6084, var54.field6085);
					field510[++field334 - 1 & 31] = var54.field6084;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED == var1.serverPacket) {
					SceneTilePaint.field3136 = var3.readUnsignedByte();
					GraphicsObject.field645 = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				Widget var58;
				if (ServerPacket.UPDATE_ZONE_FULL_FOLLOWS == var1.serverPacket) {
					var22 = var3.readUnsignedShortAdd();
					if (var22 == 65535) {
						var22 = -1;
					}

					var5 = var3.method11858();
					var6 = var3.method11867();
					var58 = class226.widgetDefinition.method7728(var6);
					ItemComposition var61;
					if (!var58.isIf3) {
						if (var22 == -1) {
							var58.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var61 = class150.ItemDefinition_get(var22).getCountObj(var5);
						var58.modelType = 4;
						var58.modelId = var22;
						var58.modelAngleX = var61.xan2d;
						var58.modelAngleY = var61.yan2d;
						var58.modelZoom = var61.zoom2d * 100 / var5;
						class376.invalidateWidget(var58);
					} else {
						var58.itemId = var22;
						var58.itemQuantity = var5;
						var61 = class150.ItemDefinition_get(var22).getCountObj(var5);
						var58.modelAngleX = var61.xan2d;
						var58.modelAngleY = var61.yan2d;
						var58.modelAngleZ = var61.zan2d;
						var58.modelOffsetX = var61.offsetX2d;
						var58.modelOffsetY = var61.offsetY2d;
						var58.modelZoom = var61.zoom2d;
						if (var61.isStackable == 1) {
							var58.itemQuantityMode = 1;
						} else {
							var58.itemQuantityMode = 2;
						}

						if (var58.field4334 > 0) {
							var58.modelZoom = var58.modelZoom * 32 / var58.field4334;
						} else if (var58.rawWidth > 0) {
							var58.modelZoom = var58.modelZoom * 32 / var58.rawWidth;
						}

						class376.invalidateWidget(var58);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MAP_ANIM == var1.serverPacket) {
					var22 = var3.readInt();
					var5 = var3.method11804();
					var23 = class226.widgetDefinition.method7728(var5);
					var23.field4275.method7801(var22);
					class376.invalidateWidget(var23);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_REGION == var1.serverPacket && isCameraLocked) {
					field412 = true;
					field538 = false;
					field494 = false;

					for (var22 = 0; var22 < 5; ++var22) {
						field543[var22] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_SHAKE == var1.serverPacket) {
					var82 = var3.readUnsignedByteSub() == 1;
					var5 = var3.readInt();
					var23 = class226.widgetDefinition.method7728(var5);
					var23.method8200(class330.localPlayer.appearance, var82);
					class376.invalidateWidget(var23);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_JINGLE == var1.serverPacket) {
					isCameraLocked = true;
					field412 = false;
					field538 = true;
					class117.field1517 = var3.readUnsignedByte();
					AuthenticationScheme.field1589 = var3.readUnsignedByte();
					MoveSpeed.field3305 = var3.readUnsignedShort();
					var22 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = Coord.method7679(class117.field1517);
					var24 = Coord.method7679(AuthenticationScheme.field1589);
					var27 = NPCComposition.getTileHeight(Occluder.topLevelWorldView, var6, var24, Occluder.topLevelWorldView.plane) - MoveSpeed.field3305;
					var9 = var6 - SpriteBufferProperties.cameraX;
					var10 = var27 - ScriptFrame.cameraY;
					var11 = var24 - class528.cameraZ;
					double var37 = Math.sqrt((double)(var9 * var9 + var11 * var11));
					var72 = DynamicArray.method10686((int)(Math.atan2((double)var10, var37) * 325.9490051269531D) & 2047);
					var15 = VarcInt.method4358((int)(Math.atan2((double)var9, (double)var11) * -325.9490051269531D) & 2047);
					field542 = new class558(GraphicsObject.cameraPitch, var72, var22, var5);
					field541 = new class558(WorldMapData_0.cameraYaw, var15, var22, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SWAP == var1.serverPacket) {
					var22 = var3.offset * 2108391709 + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.method879(false);
						class593.method11550(rootInterface);
						MidiPcmStream.runWidgetOnLoadListener(rootInterface);

						for (var24 = 0; var24 < 100; ++var24) {
							validRootWidgets[var24] = true;
						}
					}

					InterfaceParent var95;
					for (; var6-- > 0; var95.field843 = true) {
						var24 = var3.readInt();
						var27 = var3.readUnsignedShort();
						var9 = var3.readUnsignedByte();
						var95 = (InterfaceParent)interfaceParents.get((long)var24);
						if (var95 != null && var27 != var95.group) {
							class39.closeInterface(var95, true);
							var95 = null;
						}

						if (var95 == null) {
							var95 = Message.openInterface(var24, var27, var9);
						}
					}

					for (var7 = (InterfaceParent)interfaceParents.first(); var7 != null; var7 = (InterfaceParent)interfaceParents.next()) {
						if (var7.field843) {
							var7.field843 = false;
						} else {
							class39.closeInterface(var7, true);
						}
					}

					widgetFlags = new NodeHashTable(512);

					while (var3.offset * 2108391709 < var22) {
						var24 = var3.readInt();
						var27 = var3.readUnsignedShort();
						var9 = var3.readUnsignedShort();
						var10 = var3.readInt();
						var11 = var3.readInt();
						WidgetConfigNode var29 = class163.method4132((WidgetConfigNode)null, var27, var9, var10, var11);
						widgetFlags.put(var29, (long)var24);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_FULL == var1.serverPacket) {
					var22 = var3.readShort();
					var5 = var3.readUnsignedByte();
					if (var22 == -1) {
						Occluder.topLevelWorldView.plane = var5;
						AsyncHttpResponse.worldView = Occluder.topLevelWorldView;
					} else {
						WorldEntity var79 = (WorldEntity)Occluder.topLevelWorldView.worldEntities.get((long)var22);
						if (var79 == null) {
							throw new RuntimeException("No valid ClientWorldEntity with ID " + var22);
						}

						var79.worldView.plane = var5;
						AsyncHttpResponse.worldView = var79.worldView;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_SPOTANIM == var1.serverPacket) {
					WorldMapDecoration.method7010(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_MOVESUB == var1.serverPacket) {
					var22 = var3.readUnsignedIntLE();
					var5 = var3.method11867();
					var6 = var3.readSignedShort();
					var58 = class226.widgetDefinition.method7728(var5);
					if (var6 != var58.rawX || var22 != var58.rawY || var58.xAlignment != 0 || var58.yAlignment != 0) {
						var58.rawX = var6;
						var58.rawY = var22;
						var58.xAlignment = 0;
						var58.yAlignment = 0;
						class376.invalidateWidget(var58);
						this.alignWidget(var58);
						if (var58.type == 0) {
							class339.revalidateWidgetScroll(class226.widgetDefinition.Widget_interfaceComponents[var5 >> 16], var58, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETPLAYERHEAD == var1.serverPacket) {
					return this.method1310(var1);
				}

				if (ServerPacket.CAM_LOOKAT_EASED_COORD == var1.serverPacket) {
					class320.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					FriendLoginUpdate.FriendSystem_invalidateIgnoreds();
					field452 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_GAME == var1.serverPacket) {
					class39.minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETMODEL == var1.serverPacket) {
					var22 = var3.readUnsignedShortAddLE();
					var74 = var3.readUnsignedByte() == 1;
					var6 = var3.method11858();
					var24 = var3.readUnsignedShort();
					var27 = var3.readUnsignedShortAdd();
					var9 = var3.readUnsignedByteNeg();
					var10 = var3.readUnsignedByteNeg();
					var11 = var3.readInt();
					var12 = Coord.method7673(var6);
					var71 = Coord.method7674(var6);
					var72 = Coord.method7675(var6);
					var112 = worldViewManager.getWorldViewFromWorldPoint(var71, var72);
					var16 = var71 - var112.baseX;
					var17 = var72 - var112.baseY;
					if (var16 >= 0 && var17 >= 0 && var16 < var112.sizeX && var17 < var112.sizeY) {
						class519.method10567(var112, var12, var16, var17, var24, var11, var9, var27, var22, var10, var74);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_FRIENDS_CHAT == var1.serverPacket) {
					class184.method4316();
					runEnergy = var3.readUnsignedShort();
					field338 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOGOUT == var1.serverPacket) {
					var22 = var3.readUnsignedShortLE();
					HttpJsonRequestBody.method10849(var22);
					changedItemContainers[++changedItemsCount - 1 & 31] = var22 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3833 == var1.serverPacket) {
					var22 = var3.readInt();
					if (var22 != field443) {
						field443 = var22;
						class57.method2090();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RESET_ANIMS == var1.serverPacket) {
					field515 = cycleCntr;
					var76 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var76 >= 0) {
							currentClanChannels[var76] = null;
						} else {
							class57.guestClanChannel = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var76 >= 0) {
						currentClanChannels[var76] = new ClanChannel(var3);
					} else {
						class57.guestClanChannel = new ClanChannel(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOC_ADD_CHANGE == var1.serverPacket) {
					var22 = var3.method11804();
					var5 = var3.readUnsignedShort();
					var23 = class226.widgetDefinition.method7728(var22);
					if (var23 != null && var23.type == 0) {
						if (var5 > var23.scrollHeight - var23.height * -905446999) {
							var5 = var23.scrollHeight - var23.height * -905446999;
						}

						if (var5 < 0) {
							var5 = 0;
						}

						if (var5 != var23.scrollY) {
							var23.scrollY = var5;
							class376.invalidateWidget(var23);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VARP_SMALL == var1.serverPacket) {
					var22 = var3.readUnsignedShortAdd();
					var5 = var3.method11804();
					var6 = var22 >> 10 & 31;
					var24 = var22 >> 5 & 31;
					var27 = var22 & 31;
					var9 = (var24 << 11) + (var6 << 19) + (var27 << 3);
					Widget var92 = class226.widgetDefinition.method7728(var5);
					if (var9 != var92.color) {
						var92.color = var9;
						class376.invalidateWidget(var92);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_PRIVATE_ECHO == var1.serverPacket) {
					class4.field4 = new class533(ScriptFrame.field202);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER == var1.serverPacket) {
					var22 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedByte();
					var24 = var3.readUnsignedByte();
					field543[var22] = true;
					field362[var22] = var5;
					field545[var22] = var6;
					field546[var22] = var24;
					field547[var22] = 0;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SERVER_TICK_END == var1.serverPacket) {
					++serverCycle;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REFLECTION_CHECKER == var1.serverPacket) {
					rebootTimer = var3.readUnsignedShortAddLE() * 30;
					field338 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_PLAYERMODEL_BODYTYPE == var1.serverPacket) {
					class482.field5369 = var3.readUnsignedByteNeg();
					overheadTextLimit = var3.readUnsignedByte();
					SpriteBufferProperties.field23 = var3.readUnsignedByteSub();

					while (var3.offset * 2108391709 < var1.serverPacketLength) {
						var22 = var3.readUnsignedByte();
						class334 var80 = Varps.method7670()[var22];
						HealthBarUpdate.method2594(var80);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETNPCHEAD == var1.serverPacket) {
					isCameraLocked = true;
					field412 = false;
					field494 = false;
					class278.field3221 = var3.readUnsignedByte();
					SpriteMask.field4089 = var3.readUnsignedByte();
					class195.field2078 = var3.readUnsignedShort();
					FloatProjection.field2946 = var3.readUnsignedByte();
					class487.field5389 = var3.readUnsignedByte();
					if (class487.field5389 >= 100) {
						SpriteBufferProperties.cameraX = Coord.method7679(class278.field3221);
						class528.cameraZ = Coord.method7679(SpriteMask.field4089);
						ScriptFrame.cameraY = NPCComposition.getTileHeight(Occluder.topLevelWorldView, SpriteBufferProperties.cameraX, class528.cameraZ, Occluder.topLevelWorldView.plane) - class195.field2078;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETCOLOUR == var1.serverPacket) {
					ApproximateRouteStrategy.field226 = var3.readBoolean();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3757 == var1.serverPacket) {
					var22 = var3.readUnsignedShortLE();
					var5 = var3.method11858();
					Varps.Varps_temp[var22] = var5;
					if (Varps.Varps_main[var22] != var5) {
						Varps.Varps_main[var22] = var5;
					}

					Huffman.changeGameOptions(var22);
					changedVarps[++changedVarpCount - 1 & 31] = var22;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_CLAN_CHANNEL_SYSTEM == var1.serverPacket) {
					var22 = var3.readUnsignedShort();
					if (var22 == 65535) {
						var22 = -1;
					}

					var5 = var3.readUnsignedIntME();
					MouseRecorder.method2194(var22, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.DYNAMICOBJECT_SPAWN == var1.serverPacket) {
					var53 = var3.readStringCp1252NullTerminated();
					var5 = var3.method11804();
					var23 = class226.widgetDefinition.method7728(var5);
					if (!var53.equals(var23.text)) {
						var23.text = var53;
						class376.invalidateWidget(var23);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_PLAYERMODEL_SELF == var1.serverPacket) {
					class418.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3835 == var1.serverPacket) {
					publicChatMode = var3.readUnsignedByte();
					tradeChatMode = var3.readUnsignedByteNeg();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3778 == var1.serverPacket) {
					HealthBarUpdate.method2594(class334.field3690);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_INFO == var1.serverPacket) {
					class175.method4239(Occluder.topLevelWorldView, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_ROTATE_SPEED == var1.serverPacket) {
					class320.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field452 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOC_MERGEPLAYER == var1.serverPacket) {
					var22 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedShortAdd();
					var6 = var3.readUnsignedShortLE();
					var24 = var3.method11858();
					var59 = class226.widgetDefinition.method7728(var24);
					if (var6 != var59.modelAngleX || var5 != var59.modelAngleY || var22 != var59.modelZoom) {
						var59.modelAngleX = var6;
						var59.modelAngleY = var5;
						var59.modelZoom = var22;
						class376.invalidateWidget(var59);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CLAN_CHANNEL_FULL == var1.serverPacket) {
					var22 = var3.readShort();
					worldViewManager.method2389(var22);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_RESET == var1.serverPacket) {
					var22 = var3.method11858();
					var5 = var3.method11867();
					var6 = var3.readUnsignedShortAdd();
					var24 = Coord.method7673(var22);
					var27 = Coord.method7674(var22);
					var9 = Coord.method7675(var22);
					var89 = worldViewManager.getWorldViewFromWorldPoint(var27, var9);
					var11 = var27 - var89.baseX;
					var12 = var9 - var89.baseY;
					if (0 <= var11 && var11 < var89.sizeX && 0 <= var12 && var12 < var89.sizeY) {
						class179.method4283(var89, var24, var11, var12, var6, var5);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_TEXT == var1.serverPacket) {
					for (var22 = 0; var22 < Varps.Varps_main.length; ++var22) {
						if (Varps.Varps_temp[var22] != Varps.Varps_main[var22]) {
							Varps.Varps_main[var22] = Varps.Varps_temp[var22];
							Huffman.changeGameOptions(var22);
							changedVarps[++changedVarpCount - 1 & 31] = var22;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3834 == var1.serverPacket) {
					var22 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var22 < -70000) {
						var5 += 32768;
					}

					if (var22 >= 0) {
						var23 = class226.widgetDefinition.method7728(var22);
					} else {
						var23 = null;
					}

					for (; var3.offset * 2108391709 < var1.serverPacketLength; HttpAuthenticationHeader.itemContainerSetItem(var5, var24, var27 - 1, var9)) {
						var24 = var3.readUShortSmart();
						var27 = var3.readUnsignedShort();
						var9 = 0;
						if (var27 != 0) {
							var9 = var3.readUnsignedByte();
							if (var9 == 255) {
								var9 = var3.readInt();
							}
						}

						if (var23 != null && var24 >= 0 && var24 < var23.itemIds.length) {
							var23.itemIds[var24] = var27;
							var23.itemQuantities[var24] = var9;
						}
					}

					if (var23 != null) {
						class376.invalidateWidget(var23);
					}

					class184.method4316();
					changedItemContainers[++changedItemsCount - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_UID192 == var1.serverPacket) {
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

				if (ServerPacket.NPC_SET_SEQUENCE == var1.serverPacket) {
					isCameraLocked = true;
					field412 = false;
					field538 = false;
					class117.field1517 = var3.readUnsignedByte();
					AuthenticationScheme.field1589 = var3.readUnsignedByte();
					MoveSpeed.field3305 = var3.readUnsignedShort();
					class28.field124 = var3.readUnsignedByte();
					WorldView.field1142 = var3.readUnsignedByte();
					if (WorldView.field1142 >= 100) {
						var22 = Coord.method7679(class117.field1517);
						var5 = Coord.method7679(AuthenticationScheme.field1589);
						var6 = NPCComposition.getTileHeight(Occluder.topLevelWorldView, var22, var5, Occluder.topLevelWorldView.plane) - MoveSpeed.field3305;
						var24 = var22 - SpriteBufferProperties.cameraX;
						var27 = var6 - ScriptFrame.cameraY;
						var9 = var5 - class528.cameraZ;
						var10 = (int)Math.sqrt((double)(var9 * var9 + var24 * var24));
						GraphicsObject.cameraPitch = (int)(Math.atan2((double)var27, (double)var10) * 325.9490051269531D) & 2047;
						WorldMapData_0.cameraYaw = (int)(Math.atan2((double)var24, (double)var9) * -325.9490051269531D) & 2047;
						if (GraphicsObject.cameraPitch < 128) {
							GraphicsObject.cameraPitch = 128;
						}

						if (GraphicsObject.cameraPitch > 383) {
							GraphicsObject.cameraPitch = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3836 == var1.serverPacket) {
					HealthBarUpdate.method2594(class334.field3698);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_RUN_ENERGY == var1.serverPacket) {
					var82 = var3.readUnsignedByte() == 1;
					if (var82) {
						class135.field1607 = ParamComposition.method4708() - var3.readLong();
						class234.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						class234.grandExchangeEvents = null;
					}

					field517 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.EVENT_WORLDHOP == var1.serverPacket) {
					field412 = false;
					isCameraLocked = false;
					field494 = false;
					field538 = false;
					class117.field1517 = 0;
					AuthenticationScheme.field1589 = 0;
					MoveSpeed.field3305 = 0;
					field425 = false;
					class28.field124 = 0;
					WorldView.field1142 = 0;
					class487.field5389 = 0;
					FloatProjection.field2946 = 0;
					class278.field3221 = 0;
					SpriteMask.field4089 = 0;
					class195.field2078 = 0;
					field540 = null;
					field542 = null;
					field541 = null;

					for (var22 = 0; var22 < 5; ++var22) {
						field543[var22] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CHAT_FILTER_SETTINGS == var1.serverPacket) {
					var22 = var3.method11867();
					var78 = class226.widgetDefinition.method7728(var22);
					var78.modelType = 3;
					var78.modelId = class330.localPlayer.appearance.getChatHeadId();
					class376.invalidateWidget(var78);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_INFO_LARGE_VIEWPORT == var1.serverPacket) {
					class482.field5369 = var3.readUnsignedByteAdd();
					overheadTextLimit = var3.readUnsignedByteSub();
					SpriteBufferProperties.field23 = var3.readUnsignedByteNeg();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_FRIEND_PRIVATE == var1.serverPacket) {
					var22 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var22 < -70000) {
						var5 += 32768;
					}

					if (var22 >= 0) {
						var23 = class226.widgetDefinition.method7728(var22);
					} else {
						var23 = null;
					}

					if (var23 != null) {
						for (var24 = 0; var24 < var23.itemIds.length; ++var24) {
							var23.itemIds[var24] = 0;
							var23.itemQuantities[var24] = 0;
						}
					}

					NPC.clearItemContainer(var5);
					var24 = var3.readUnsignedShort();

					for (var27 = 0; var27 < var24; ++var27) {
						var9 = var3.readUnsignedShortLE();
						var10 = var3.readUnsignedByteSub();
						if (var10 == 255) {
							var10 = var3.readInt();
						}

						if (var23 != null && var27 < var23.itemIds.length) {
							var23.itemIds[var27] = var9;
							var23.itemQuantities[var27] = var10;
						}

						HttpAuthenticationHeader.itemContainerSetItem(var5, var27, var9 - 1, var10);
					}

					if (var23 != null) {
						class376.invalidateWidget(var23);
					}

					class184.method4316();
					changedItemContainers[++changedItemsCount - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_ANIM_SPECIFIC == var1.serverPacket) {
					var22 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShortAdd();
					var6 = var3.method11867();
					var24 = Coord.method7673(var6);
					var27 = Coord.method7674(var6);
					var9 = Coord.method7675(var6);
					var10 = var3.readUnsignedShortLE();
					var11 = var3.method11804();
					var12 = Coord.method7673(var11);
					var71 = Coord.method7674(var11);
					var72 = Coord.method7675(var11);
					var15 = var3.method11687();
					var16 = var3.readUnsignedShortAddLE();
					var17 = var3.method11663();
					int var18 = var3.readUnsignedByteNeg();
					int var19 = var3.readUnsignedShortAdd();
					int var20 = var3.readUnsignedShortLE();
					if (var19 != 65535) {
						Projectile var21 = new Projectile(var12, var71, var72, var16, var17, var24, var27, var9, var10, var15, var19, var22 + cycle, var5 + cycle, var18, var20);
						projectiles.addFirst(var21);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_STAT == var1.serverPacket) {
					isCameraLocked = true;
					field412 = false;
					field538 = true;
					var22 = var3.readShort();
					var5 = var3.readShort();
					var6 = DynamicArray.method10686(var5 + GraphicsObject.cameraPitch & 2027);
					var24 = var22 + WorldMapData_0.cameraYaw;
					var27 = var3.readUnsignedShort();
					var9 = var3.readUnsignedByte();
					field542 = new class558(GraphicsObject.cameraPitch, var6, var27, var9);
					field541 = new class558(WorldMapData_0.cameraYaw, var24, var27, var9);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SONG == var1.serverPacket) {
					isCameraLocked = true;
					field412 = false;
					field538 = true;
					var22 = VarcInt.method4358(var3.readShort() & 2027);
					var5 = DynamicArray.method10686(var3.readShort() & 2027);
					var6 = var3.readUnsignedShort();
					var24 = var3.readUnsignedByte();
					field542 = new class558(GraphicsObject.cameraPitch, var5, var6, var24);
					field541 = new class558(WorldMapData_0.cameraYaw, var22, var6, var24);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.FRIENDS_LIST_LOADED == var1.serverPacket) {
					var22 = var3.readUnsignedByte();
					var5 = var3.method11804();
					var6 = var3.readUnsignedByteAdd();
					var58 = class226.widgetDefinition.method7728(var5);
					var58.field4275.method7814(var22, var6);
					class376.invalidateWidget(var58);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETANGLE == var1.serverPacket) {
					isCameraLocked = true;
					field412 = false;
					field494 = true;
					class278.field3221 = var3.readUnsignedByte();
					SpriteMask.field4089 = var3.readUnsignedByte();
					var22 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShort();
					field425 = var3.readBoolean();
					var6 = var3.readUnsignedByte();
					var24 = Coord.method7679(class278.field3221);
					var27 = Coord.method7679(SpriteMask.field4089);
					boolean var62 = false;
					boolean var65 = false;
					if (field425) {
						var9 = ScriptFrame.cameraY;
						var10 = NPCComposition.getTileHeight(Occluder.topLevelWorldView, var24, var27, Occluder.topLevelWorldView.plane) - var22;
					} else {
						var9 = NPCComposition.getTileHeight(Occluder.topLevelWorldView, SpriteBufferProperties.cameraX, class528.cameraZ, Occluder.topLevelWorldView.plane) - ScriptFrame.cameraY;
						var10 = var22;
					}

					field540 = new class557(SpriteBufferProperties.cameraX, class528.cameraZ, var9, var24, var27, var10, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.HINT_ARROW == var1.serverPacket) {
					var22 = var3.readUnsignedByte();
					MouseRecorder.method2196(var22);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VAR_CLAN_DISABLE == var1.serverPacket) {
					for (var22 = 0; var22 < VarpDefinition.field1976; ++var22) {
						VarpDefinition var77 = TileItem.VarpDefinition_get(var22);
						if (var77 != null) {
							Varps.Varps_temp[var22] = 0;
							Varps.Varps_main[var22] = 0;
						}
					}

					class184.method4316();
					changedVarpCount += 32;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_SETANGLE == var1.serverPacket) {
					var53 = var3.readStringCp1252NullTerminated();
					var30 = (long)var3.readUnsignedShort();
					var32 = (long)var3.readMedium();
					PlayerType var81 = (PlayerType)GrandExchangeOffer.findEnumerated(Varps.PlayerType_values(), var3.readUnsignedByte());
					long var41 = var32 + (var30 << 32);
					var69 = false;

					for (var71 = 0; var71 < 100; ++var71) {
						if (crossWorldMessageIds[var71] == var41) {
							var69 = true;
							break;
						}
					}

					if (class320.friendSystem.isIgnored(new Username(var53, LoginScreenAnimation.loginType))) {
						var69 = true;
					}

					if (!var69 && field305 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var41;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var40 = AbstractFont.escapeBrackets(ClanChannelMember.method3986(ObjectSound.method2380(var3)));
						byte var14;
						if (var81.isPrivileged) {
							var14 = 7;
						} else {
							var14 = 3;
						}

						if (var81.modIcon != -1) {
							class356.addGameMessage(var14, SoundSystem.method3226(var81.modIcon) + var53, var40);
						} else {
							class356.addGameMessage(var14, var53, var40);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CLAN_SETTINGS_DELTA == var1.serverPacket) {
					overheadTextLimit = var3.readUnsignedByteSub();
					SpriteBufferProperties.field23 = var3.readUnsignedByteAdd();
					class482.field5369 = var3.readUnsignedByte();

					for (var22 = SpriteBufferProperties.field23; var22 < SpriteBufferProperties.field23 + 8; ++var22) {
						for (var5 = class482.field5369; var5 < class482.field5369 + 8; ++var5) {
							if (AsyncHttpResponse.worldView.groundItems[overheadTextLimit][var22][var5] != null) {
								AsyncHttpResponse.worldView.groundItems[overheadTextLimit][var22][var5] = null;
								class157.updateItemPile(overheadTextLimit, var22, var5);
							}
						}
					}

					for (PendingSpawn var52 = (PendingSpawn)AsyncHttpResponse.worldView.pendingSpawns.last(); var52 != null; var52 = (PendingSpawn)AsyncHttpResponse.worldView.pendingSpawns.previous()) {
						if (var52.x >= SpriteBufferProperties.field23 && var52.x < SpriteBufferProperties.field23 + 8 && var52.y >= class482.field5369 && var52.y < class482.field5369 + 8 && var52.plane == overheadTextLimit) {
							var52.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_SITE_SETTINGS == var1.serverPacket) {
					var22 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedShortAddLE();
					var6 = var3.method11858();
					var58 = class226.widgetDefinition.method7728(var6);
					var58.field4274 = var5 + (var22 << 16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1 == var1.serverPacket) {
					var82 = var3.readBoolean();
					if (var82) {
						if (field571 == null) {
							field571 = new class431();
						}
					} else {
						field571 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_TARGET == var1.serverPacket) {
					var22 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByteSub();
					var6 = var3.method11804();
					var7 = (InterfaceParent)interfaceParents.get((long)var6);
					if (var7 != null) {
						class39.closeInterface(var7, var22 != var7.group);
					}

					Message.openInterface(var6, var22, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_TRADING_POST == var1.serverPacket) {
					var24 = var3.readUnsignedShortAdd();
					var6 = var3.readUnsignedShortAddLE();
					var22 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedShort();
					class182.method4293(var22, var5, var6, var24);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3804 == var1.serverPacket) {
					var22 = var3.readUnsignedShort();
					var5 = var3.method11867();
					var6 = var3.readInt();
					var24 = var3.method11858();
					var27 = Coord.method7673(var6);
					var9 = Coord.method7674(var6);
					var10 = Coord.method7675(var6);
					WorldView var36 = worldViewManager.getWorldViewFromWorldPoint(var9, var10);
					var12 = var9 - var36.baseX;
					var71 = var10 - var36.baseY;
					if (var12 >= 0 && var71 >= 0 && var12 < var36.sizeX && var71 < var36.sizeY) {
						SpriteMask.method7659(var36, var27, var12, var71, var22, var5, var24);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SONG_WITH_SECONDARY == var1.serverPacket) {
					var22 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedByteAdd();
					if (var22 == 65535) {
						var22 = -1;
					}

					CameraViewMode.performPlayerAnimation(class330.localPlayer, var22, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_NORMAL == var1.serverPacket) {
					var76 = var3.readByte();
					var25 = var3.readStringCp1252NullTerminated();
					long var43 = (long)var3.readUnsignedShort();
					long var45 = (long)var3.readMedium();
					PlayerType var28 = (PlayerType)GrandExchangeOffer.findEnumerated(Varps.PlayerType_values(), var3.readUnsignedByte());
					long var47 = (var43 << 32) + var45;
					boolean var13 = false;
					ClanChannel var49 = null;
					var49 = var76 >= 0 ? currentClanChannels[var76] : class57.guestClanChannel;
					if (var49 == null) {
						var13 = true;
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var28.isUser && class320.friendSystem.isIgnored(new Username(var25, LoginScreenAnimation.loginType))) {
									var13 = true;
								}
								break;
							}

							if (crossWorldMessageIds[var15] == var47) {
								var13 = true;
								break;
							}

							++var15;
						}
					}

					if (!var13) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var47;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var39 = AbstractFont.escapeBrackets(ObjectSound.method2380(var3));
						var16 = var76 >= 0 ? 41 : 44;
						if (var28.modIcon != -1) {
							class222.addChatMessage(var16, SoundSystem.method3226(var28.modIcon) + var25, var39, var49.name);
						} else {
							class222.addChatMessage(var16, var25, var39, var49.name);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_STOP_TRANSIT == var1.serverPacket) {
					var76 = var3.readByte();
					var5 = var3.readUnsignedShortAddLE();
					Varps.Varps_temp[var5] = var76;
					if (Varps.Varps_main[var5] != var76) {
						Varps.Varps_main[var5] = var76;
					}

					Huffman.changeGameOptions(var5);
					changedVarps[++changedVarpCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL == var1.serverPacket) {
					class320.friendSystem.method1592();
					field452 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UNKNOWN_STRING == var1.serverPacket) {
					HealthBarUpdate.method2594(class334.field3688);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.URL_OPEN == var1.serverPacket) {
					class349.field3990 = var3.readBoolean();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_EVENTS == var1.serverPacket) {
					var22 = var3.readInt();
					var5 = var3.readUnsignedByteSub();
					var23 = class226.widgetDefinition.method7728(var22);
					var23.field4275.method7780(class330.localPlayer.appearance.gender, var5);
					class376.invalidateWidget(var23);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RESET_CLIENT_VARCACHE == var1.serverPacket) {
					class31.method492();
					var76 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var76 >= 0) {
							currentClanSettings[var76] = null;
						} else {
							SecureRandomFuture.guestClanSettings = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var76 >= 0) {
						currentClanSettings[var76] = new ClanSettings(var3);
					} else {
						SecureRandomFuture.guestClanSettings = new ClanSettings(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_RESYNC == var1.serverPacket) {
					var5 = var3.readUnsignedShortLE();
					var24 = var3.readUnsignedByteAdd();
					var6 = var3.method11867();
					var22 = var3.readUnsignedShortAdd();
					Player var8;
					if (var22 == localPlayerIndex) {
						var8 = class330.localPlayer;
					} else {
						var8 = (Player)AsyncHttpResponse.worldView.players.get((long)var22);
					}

					if (var8 != null) {
						var8.updateSpotAnimation(var24, var5, var6 >> 16, var6 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETPOSITION == var1.serverPacket) {
					var22 = var3.readSignedShort();
					var5 = var3.method11867();
					var23 = class226.widgetDefinition.method7728(var5);
					if (var22 != var23.sequenceId || var22 == -1) {
						var23.sequenceId = var22;
						var23.modelFrame = 0;
						var23.modelFrameCycle = 0;
						class376.invalidateWidget(var23);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3768 == var1.serverPacket) {
					var22 = var3.method11804();
					var5 = var3.method11804();
					var6 = var3.method11858();
					var24 = var3.readUnsignedShortAdd();
					if (var24 == 65535) {
						var24 = -1;
					}

					var27 = var3.readUnsignedShort();
					if (var27 == 65535) {
						var27 = -1;
					}

					WidgetConfigNode var26 = (WidgetConfigNode)widgetFlags.get((long)var5);
					if (var26 != null) {
						var26.remove();
					}

					var26 = class163.method4132(var26, var24, var27, var22, var6);
					widgetFlags.put(var26, (long)var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOGOUT_FULL == var1.serverPacket) {
					var22 = var3.readUnsignedByte();
					if (var3.readUnsignedByte() == 0) {
						grandExchangeOffers[var22] = new GrandExchangeOffer();
						var3.offset += 1287071162;
					} else {
						var3.offset -= 1741769013;
						grandExchangeOffers[var22] = new GrandExchangeOffer(var3, false);
					}

					field295 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3839 == var1.serverPacket) {
					this.method536(var3.readUnsignedByte() != 0);
					var1.serverPacket = null;
					return true;
				}

				PlayerType.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1275 != null ? var1.field1275.id : -1) + "," + (var1.field1267 != null ? var1.field1267.id : -1) + "," + var1.serverPacketLength, (Throwable)null);
				class30.logOut();
			} catch (IOException var50) {
				class165.method4149();
			} catch (Exception var51) {
				var25 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1275 != null ? var1.field1275.id : -1) + "," + (var1.field1267 != null ? var1.field1267.id : -1) + "," + var1.serverPacketLength + "," + (class330.localPlayer.pathX[0] + Occluder.topLevelWorldView.baseX) + "," + (class330.localPlayer.pathY[0] + Occluder.topLevelWorldView.baseY) + ",";

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) {
					var25 = var25 + var3.array[var6] + ",";
				}

				PlayerType.RunException_sendStackTrace(var25, var51);
				class30.logOut();
			}

			return true;
		}
	}

	@ObfuscatedName("qg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-22"
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
				if (var10 != 1 && (UrlRequest.mouseCam || var10 != 4) && !menu.method12294(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y)) {
					isMenuOpen = false;
					menu.invalidateWidgetsUnder();
				}

				if (var10 == 1 || !UrlRequest.mouseCam && var10 == 4) {
					menu.method12312(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					isMenuOpen = false;
					menu.invalidateWidgetsUnder();
				}
			} else if (menu.menuOptionsCount > 0) {
				var3 = menu.menuOptionsCount - 1;
				if ((var10 == 1 || !UrlRequest.mouseCam && var10 == 4) && this.shouldLeftClickOpenMenu(menu.menuOpcodes[var3], menu.menuShiftClick[var3])) {
					var10 = 2;
				}

				if (var10 == 1 || !UrlRequest.mouseCam && var10 == 4) {
					menu.method12293(var3);
				}

				if (var10 == 2) {
					this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}
			}

		}
	}

	@ObfuscatedName("qb")
	@ObfuscatedSignature(
		descriptor = "(IZI)Z",
		garbageValue = "-1008319398"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu(int var1, boolean var2) {
		return (leftClickOpensMenu && menu.menuOptionsCount > 2 || class459.method9292(var1)) && !var2;
	}

	@ObfuscatedName("qx")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-110"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		menu.method12290(var1, var2);
		Iterator var3 = worldViewManager.iterator();

		while (var3.hasNext()) {
			WorldView var4 = (WorldView)var3.next();
			var4.scene.menuOpen(false);
		}

		isMenuOpen = true;
		menu.method12296();
	}

	@ObfuscatedName("qu")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1626459770"
	)
	final void method879(boolean var1) {
		ActorSpotAnim.method10602(rootInterface, class489.canvasWidth, class374.canvasHeight, var1);
	}

	@ObfuscatedName("qt")
	@ObfuscatedSignature(
		descriptor = "(Lof;I)V",
		garbageValue = "1800180690"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var4 = var1.parentId == -1 ? null : class226.widgetDefinition.getWidgetChild(var1.parentId, var1.field4234);
		int var2;
		int var3;
		if (var4 == null) {
			var2 = class489.canvasWidth;
			var3 = class374.canvasHeight;
		} else {
			var2 = var4.width * -1946208531;
			var3 = var4.height * -905446999;
		}

		class70.alignWidgetSize(var1, var2, var3, false);
		Projectile.alignWidgetPosition(var1, var2, var3);
	}

	@ObfuscatedName("ql")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "14"
	)
	final void method1370() {
		class376.invalidateWidget(clickedWidget);
		++class201.widgetDragDuration;
		if (field500 && field465) {
			int var1 = MouseHandler.MouseHandler_x;
			int var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field411) {
				var1 = field411;
			}

			if (var1 + clickedWidget.width * -1946208531 > clickedWidgetParent.width * -1946208531 + field411) {
				var1 = clickedWidgetParent.width * -1946208531 + field411 - clickedWidget.width * -1946208531;
			}

			if (var2 < field292) {
				var2 = field292;
			}

			if (var2 + clickedWidget.height * -905446999 > clickedWidgetParent.height * -905446999 + field292) {
				var2 = clickedWidgetParent.height * -905446999 + field292 - clickedWidget.height * -905446999;
			}

			int var3 = var1 - field484;
			int var4 = var2 - field527;
			int var5 = clickedWidget.dragZoneSize;
			if (class201.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}

			int var6 = var1 - field411 + clickedWidgetParent.scrollX;
			int var7 = var2 - field292 + clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = clickedWidget.onDrag;
				class141.runScriptEvent(var8);
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
						class141.runScriptEvent(var8);
					}

					if (draggedOnWidget != null && class207.method4626(clickedWidget) != null) {
						PacketBufferNode var9 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPHELDD, packetWriter.isaacCipher);
						var9.packetBuffer.writeShortAddLE(draggedOnWidget.itemId);
						var9.packetBuffer.writeIntIME(draggedOnWidget.id);
						var9.packetBuffer.writeShort(clickedWidget.itemId);
						var9.packetBuffer.writeShortAdd(clickedWidget.childIndex * 2077538819);
						var9.packetBuffer.method11690(clickedWidget.id);
						var9.packetBuffer.writeShortAddLE(draggedOnWidget.childIndex * 2077538819);
						packetWriter.addNode(var9);
					}
				} else if (WorldMapSection2.tempMenuAction != null && !this.shouldLeftClickOpenMenu(WorldMapSection2.tempMenuAction.opcode, WorldMapSection2.tempMenuAction.field667)) {
					if (menu.menuOptionsCount > 0) {
						SpriteBufferProperties.method58(widgetClickX + field484, field527 + widgetClickY);
					}
				} else {
					this.openMenu(widgetClickX + field484, field527 + widgetClickY);
				}

				clickedWidget = null;
			}

		} else {
			if (class201.widgetDragDuration > 1) {
				if (!isDraggingWidget && menu.menuOptionsCount > 0) {
					SpriteBufferProperties.method58(widgetClickX + field484, field527 + widgetClickY);
				}

				clickedWidget = null;
			}

		}
	}

	@ObfuscatedName("qo")
	@ObfuscatedSignature(
		descriptor = "(I)Lxv;",
		garbageValue = "-1525411131"
	)
	@Export("username")
	public Username username() {
		return class330.localPlayer != null ? class330.localPlayer.username : null;
	}

	@ObfuscatedName("qi")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1982143636"
	)
	void method1023(int var1) {
		PacketBufferNode var2 = ReflectionCheck.getPacketBufferNode(ClientPacket.CLAN_CHANNEL_FULL_REQUEST, packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(var1);
		packetWriter.addNode(var2);
	}

	@ObfuscatedName("qj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "5"
	)
	void method884(int var1) {
		PacketBufferNode var2 = ReflectionCheck.getPacketBufferNode(ClientPacket.CLAN_SETTINGS_FULL_REQUEST, packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(var1);
		packetWriter.addNode(var2);
	}

	protected void finalize() throws Throwable {
		class345.field3925.remove(this);
		super.finalize();
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

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V"
	)
	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) {
			this.otlTokenRequester = var1;
			class30.method484(10);
		}
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
							Language var13;
							if (var4 >= 0 && var4 < Language.Language_valuesOrdered.length) {
								var13 = Language.Language_valuesOrdered[var4];
							} else {
								var13 = null;
							}

							class352.clientLanguage = var13;
							break;
						case 7:
							var4 = Integer.parseInt(var2);
							GameBuild[] var5 = class288.method6529();
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

							class1.field2 = var3;
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) {
							}
							break;
						case 9:
							class39.field241 = var2;
							break;
						case 10:
							class520.field5546 = (StudioGame)GrandExchangeOffer.findEnumerated(GraphicsObject.method1937(), Integer.parseInt(var2));
							if (StudioGame.oldscape == class520.field5546) {
								LoginScreenAnimation.loginType = LoginType.oldscape;
							} else {
								LoginScreenAnimation.loginType = LoginType.field5899;
							}
							break;
						case 11:
							class431.authServiceBaseUrl = var2;
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
							class570.field5884 = Integer.parseInt(var2);
							break;
						case 15:
							gameBuild = Integer.parseInt(var2);
							break;
						case 17:
							WorldMapEvent.field3547 = var2;
							break;
						case 21:
							field330 = Integer.parseInt(var2);
							break;
						case 22:
							ObjectSound.gameSessionServiceBaseUrl = var2;
							break;
						case 25:
							int var8 = var2.indexOf(".");
							if (var8 == -1) {
								class597.field6010 = Integer.parseInt(var2);
							} else {
								class597.field6010 = Integer.parseInt(var2.substring(0, var8));
								Integer.parseInt(var2.substring(var8 + 1));
							}
						}
					}
				}

				BufferedSink.method10460();
				DynamicArray.worldHost = this.getCodeBase().getHost();
				VarbitComposition.field2279 = new JagNetThread();
				String var9 = class1.field2.name;
				byte var10 = 0;
				if ((worldProperties & class594.field5982.rsOrdinal()) != 0) {
					class365.field4083 = "beta";
				}

				try {
					class62.method2173("oldschool", class365.field4083, var9, var10, 25);
				} catch (Exception var11) {
					PlayerType.RunException_sendStackTrace((String)null, var11);
				}

				SecureUrlRequester.client = this;
				class142.field1705 = clientType;
				class463.method9501();
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
					this.https = true;
				}

				if (field352 == -1) {
					if (!this.containsAccessAndRefreshToken() && !this.containsSessionAndCharacterId()) {
						field352 = 0;
					} else {
						field352 = 5;
					}
				}

				this.startThread(765, 503, 235, 1);
			}
		} catch (RuntimeException var12) {
			throw RestClientThreadFactory.newRunException(var12, "client.init(" + ')');
		}
	}

	public long getAccountHash() {
		return this.accountHash;
	}

	public void setClient(int var1) {
		this.clientId = var1;
	}

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)I",
		garbageValue = "961779449"
	)
	@Export("insertMenuItemNoShift")
	public static final int insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		return ClanChannel.insertMenuItem(var0, var1, var2, var3, var4, var5, -1, false, -1);
	}
}
