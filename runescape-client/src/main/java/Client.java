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
public final class Client extends GameEngine implements Usernamed, OAuthApi, class339 {
	@ObfuscatedName("wy")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	static final class277 field517;
	@ObfuscatedName("wr")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	static final ApproximateRouteStrategy field809;
	@ObfuscatedName("xi")
	static int[] field810;
	@ObfuscatedName("xn")
	static int[] field811;
	@ObfuscatedName("wc")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("wi")
	@ObfuscatedGetter(
		intValue = 807896699
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("wh")
	@ObfuscatedGetter(
		intValue = 1218954373
	)
	static int field549;
	@ObfuscatedName("ww")
	@ObfuscatedGetter(
		intValue = -1260576525
	)
	static int field805;
	@ObfuscatedName("wn")
	static List field803;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -621101549
	)
	static int field815;
	@ObfuscatedName("bc")
	static boolean field522;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -663064145
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1507962185
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 1002718857
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("ck")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("cs")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 415997191
	)
	static int field788;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 1017146099
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -1072184465
	)
	static int field516;
	@ObfuscatedName("cw")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("cf")
	@Export("otp")
	static String otp;
	@ObfuscatedName("dg")
	static boolean field518;
	@ObfuscatedName("dq")
	static boolean field519;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -41867285
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("dh")
	static boolean field521;
	@ObfuscatedName("dr")
	static boolean field698;
	@ObfuscatedName("dz")
	static boolean field523;
	@ObfuscatedName("do")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = -2073252979
	)
	@Export("cycle")
	public static int cycle;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = -1109345317
	)
	@Export("serverCycle")
	static int serverCycle;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		longValue = 1776220329876054975L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = -1743230141
	)
	static int field528;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -2006725607
	)
	static int field529;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		longValue = 3586115021008909087L
	)
	static long field530;
	@ObfuscatedName("du")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -969427403
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = 711671195
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 681686783
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = 57252941
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -204030547
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = 330163441
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("eu")
	@ObfuscatedGetter(
		intValue = -1451522308
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("ec")
	@ObfuscatedGetter(
		intValue = -1235262400
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("ey")
	@ObfuscatedGetter(
		intValue = 61055453
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("eb")
	@Export("z")
	static boolean z;
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static class95 field544;
	@ObfuscatedName("er")
	@ObfuscatedGetter(
		intValue = -1527311061
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("es")
	@ObfuscatedGetter(
		intValue = 666626309
	)
	static int field532;
	@ObfuscatedName("fy")
	@ObfuscatedGetter(
		intValue = -911645649
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("fp")
	@ObfuscatedGetter(
		intValue = 1865071629
	)
	static int field548;
	@ObfuscatedName("fd")
	@ObfuscatedGetter(
		intValue = 753403715
	)
	static int field696;
	@ObfuscatedName("fk")
	@ObfuscatedGetter(
		intValue = -840232605
	)
	static int field550;
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	@Export("authenticationScheme")
	static AuthenticationScheme authenticationScheme;
	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	static class561 field691;
	@ObfuscatedName("gi")
	@Export("BASIC_AUTH_DESKTOP_OSRS")
	static final String BASIC_AUTH_DESKTOP_OSRS;
	@ObfuscatedName("gf")
	@Export("BASIC_AUTH_DESKTOP_RUNELITE")
	static final String BASIC_AUTH_DESKTOP_RUNELITE;
	@ObfuscatedName("hw")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("hl")
	static int[] field762;
	@ObfuscatedName("hc")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("ht")
	@ObfuscatedGetter(
		intValue = -978281205
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("hb")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("ih")
	@ObfuscatedGetter(
		intValue = 1329582963
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("if")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "Lrn;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("in")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("ie")
	@ObfuscatedGetter(
		intValue = 1479241143
	)
	static int field777;
	@ObfuscatedName("il")
	@ObfuscatedGetter(
		intValue = 468311509
	)
	static int field598;
	@ObfuscatedName("ij")
	@ObfuscatedGetter(
		intValue = 1524741923
	)
	static int field581;
	@ObfuscatedName("ia")
	@ObfuscatedGetter(
		intValue = -56394153
	)
	static int field625;
	@ObfuscatedName("it")
	static String field667;
	@ObfuscatedName("iu")
	@ObfuscatedGetter(
		intValue = 1433552395
	)
	static int field583;
	@ObfuscatedName("ja")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("jk")
	static int[][][] field584;
	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "Ldu;"
	)
	@Export("worldViewManager")
	static WorldViewManager worldViewManager;
	@ObfuscatedName("jv")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("jc")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("jm")
	static final int[] field588;
	@ObfuscatedName("jf")
	@ObfuscatedGetter(
		intValue = -1616839021
	)
	static int field567;
	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	@Export("playerUpdateManager")
	static PlayerUpdateManager playerUpdateManager;
	@ObfuscatedName("jd")
	@ObfuscatedGetter(
		intValue = 1851832823
	)
	@Export("graphicsCycle")
	static int graphicsCycle;
	@ObfuscatedName("kl")
	@ObfuscatedGetter(
		intValue = 1826315945
	)
	static int field592;
	@ObfuscatedName("kz")
	@ObfuscatedGetter(
		intValue = 1679842447
	)
	static int field593;
	@ObfuscatedName("ko")
	@ObfuscatedGetter(
		intValue = -646563825
	)
	static int field793;
	@ObfuscatedName("kj")
	@ObfuscatedGetter(
		intValue = 261255883
	)
	static int field646;
	@ObfuscatedName("kq")
	static boolean field562;
	@ObfuscatedName("kn")
	@ObfuscatedGetter(
		intValue = 858545039
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("kt")
	@ObfuscatedGetter(
		intValue = 244705815
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("kd")
	@ObfuscatedGetter(
		intValue = 15866413
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("lf")
	@ObfuscatedGetter(
		intValue = -1739828503
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("la")
	@ObfuscatedGetter(
		intValue = -1130448623
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("lr")
	@ObfuscatedGetter(
		intValue = 77214933
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("lq")
	@ObfuscatedGetter(
		intValue = -1918475449
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("ly")
	@ObfuscatedGetter(
		intValue = 1433197037
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("lm")
	@ObfuscatedGetter(
		intValue = 10413221
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = -1970729767
	)
	static int field610;
	@ObfuscatedName("lw")
	@ObfuscatedGetter(
		intValue = -1134971503
	)
	static int field758;
	@ObfuscatedName("ln")
	@ObfuscatedGetter(
		intValue = 290072239
	)
	static int field608;
	@ObfuscatedName("lx")
	@ObfuscatedGetter(
		intValue = 766138093
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("lc")
	@ObfuscatedGetter(
		intValue = 124167389
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = -374746263
	)
	@Export("revision")
	static int revision;
	@ObfuscatedName("lh")
	static boolean field612;
	@ObfuscatedName("ld")
	@ObfuscatedGetter(
		intValue = 1248802357
	)
	static int field613;
	@ObfuscatedName("lj")
	static boolean field524;
	@ObfuscatedName("lu")
	@ObfuscatedGetter(
		intValue = -632305277
	)
	static int field678;
	@ObfuscatedName("lv")
	@ObfuscatedGetter(
		intValue = -103449789
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("le")
	@ObfuscatedGetter(
		intValue = 1973599087
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("lz")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("lb")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("lp")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("lt")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("mk")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("mq")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("mx")
	static int[][] field660;
	@ObfuscatedName("me")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("mr")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("ms")
	@ObfuscatedGetter(
		intValue = 1772138529
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("ma")
	@ObfuscatedGetter(
		intValue = 1861140361
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("mf")
	@ObfuscatedGetter(
		intValue = -1965963091
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("mt")
	@ObfuscatedGetter(
		intValue = -2096381795
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("mh")
	@ObfuscatedGetter(
		intValue = -346426953
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("mj")
	@ObfuscatedGetter(
		intValue = -753168741
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("mb")
	@ObfuscatedGetter(
		intValue = -1502180031
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("mg")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("mp")
	@ObfuscatedGetter(
		intValue = -1826635899
	)
	static int field635;
	@ObfuscatedName("mz")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("mn")
	@ObfuscatedGetter(
		intValue = -590900607
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("mw")
	@ObfuscatedGetter(
		intValue = -2011324895
	)
	static int field638;
	@ObfuscatedName("md")
	@ObfuscatedGetter(
		longValue = -750321309751873363L
	)
	@Export("userId")
	static long userId;
	@ObfuscatedName("mu")
	@ObfuscatedGetter(
		longValue = -502172528396371137L
	)
	@Export("userHash")
	static long userHash;
	@ObfuscatedName("mo")
	static String field614;
	@ObfuscatedName("ni")
	@ObfuscatedGetter(
		intValue = -2056493607
	)
	static int field642;
	@ObfuscatedName("no")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("nu")
	@ObfuscatedGetter(
		intValue = 1392225251
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("nz")
	@ObfuscatedGetter(
		intValue = -1474852555
	)
	static int field645;
	@ObfuscatedName("na")
	static int[] field647;
	@ObfuscatedName("ny")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("nc")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("ng")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("nb")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("nt")
	@ObfuscatedGetter(
		intValue = 985758559
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("nf")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("nx")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("nj")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("nv")
	static int[] field655;
	@ObfuscatedName("nh")
	@Export("leftClickOpensMenu")
	static boolean leftClickOpensMenu;
	@ObfuscatedName("nl")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "Lwv;"
	)
	@Export("menu")
	static Menu menu;
	@ObfuscatedName("ns")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("on")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("ow")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("op")
	@ObfuscatedGetter(
		intValue = 2008365177
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("ou")
	@ObfuscatedGetter(
		intValue = -685177999
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("og")
	@ObfuscatedGetter(
		intValue = -1763659451
	)
	static int field664;
	@ObfuscatedName("ot")
	@ObfuscatedGetter(
		intValue = -1405468881
	)
	static int field514;
	@ObfuscatedName("ox")
	@ObfuscatedGetter(
		intValue = 558423307
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("oo")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("oc")
	@ObfuscatedGetter(
		intValue = 1983723723
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("ok")
	@ObfuscatedGetter(
		intValue = -903034657
	)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("od")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("oi")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("ov")
	@ObfuscatedGetter(
		intValue = 132738463
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "Luw;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("oa")
	@ObfuscatedGetter(
		intValue = 1838361087
	)
	static int field710;
	@ObfuscatedName("oq")
	@ObfuscatedGetter(
		intValue = -767856087
	)
	static int field676;
	@ObfuscatedName("px")
	@ObfuscatedGetter(
		intValue = 2014855115
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("pi")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("pl")
	@ObfuscatedGetter(
		intValue = -271597579
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("pf")
	@ObfuscatedGetter(
		intValue = 647911645
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("pj")
	@ObfuscatedGetter(
		intValue = 1771896959
	)
	@Export("staffModLevel")
	public static int staffModLevel;
	@ObfuscatedName("po")
	@ObfuscatedGetter(
		intValue = 1879511657
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("pq")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("py")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("pg")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("clickedWidget")
	public static Widget clickedWidget;
	@ObfuscatedName("pk")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("pp")
	@ObfuscatedGetter(
		intValue = 1936062805
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("pt")
	@ObfuscatedGetter(
		intValue = -794814509
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("pa")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("pu")
	static boolean field690;
	@ObfuscatedName("pr")
	@ObfuscatedGetter(
		intValue = 1620363177
	)
	static int field795;
	@ObfuscatedName("ps")
	@ObfuscatedGetter(
		intValue = 1706822335
	)
	static int field683;
	@ObfuscatedName("pw")
	static boolean field749;
	@ObfuscatedName("pz")
	@ObfuscatedGetter(
		intValue = 1735590265
	)
	static int field694;
	@ObfuscatedName("pb")
	@ObfuscatedGetter(
		intValue = -1490183359
	)
	static int field695;
	@ObfuscatedName("pn")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("pe")
	@ObfuscatedGetter(
		intValue = 658043499
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("qq")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("qf")
	@ObfuscatedGetter(
		intValue = -1926243717
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("qg")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("qr")
	@ObfuscatedGetter(
		intValue = -403061625
	)
	static int field701;
	@ObfuscatedName("qa")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("qk")
	@ObfuscatedGetter(
		intValue = -1978345143
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("qw")
	static int[] field704;
	@ObfuscatedName("qz")
	@ObfuscatedGetter(
		intValue = -284238635
	)
	static int field705;
	@ObfuscatedName("qp")
	@ObfuscatedGetter(
		intValue = -1403607109
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("ql")
	@ObfuscatedGetter(
		intValue = -281506921
	)
	static int field707;
	@ObfuscatedName("qs")
	@ObfuscatedGetter(
		intValue = 303005217
	)
	static int field708;
	@ObfuscatedName("qb")
	@ObfuscatedGetter(
		intValue = -2066879333
	)
	static int field709;
	@ObfuscatedName("qn")
	@ObfuscatedGetter(
		intValue = 1055117655
	)
	static int field798;
	@ObfuscatedName("qc")
	@ObfuscatedGetter(
		intValue = 586217993
	)
	static int field769;
	@ObfuscatedName("qh")
	@ObfuscatedGetter(
		intValue = -388839083
	)
	static int field712;
	@ObfuscatedName("qv")
	@ObfuscatedGetter(
		intValue = 1230131501
	)
	static int field713;
	@ObfuscatedName("qo")
	@ObfuscatedGetter(
		intValue = 1779428153
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("qm")
	@ObfuscatedSignature(
		descriptor = "Lwe;"
	)
	static class574 field715;
	@ObfuscatedName("qt")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("qx")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("scriptEvents2")
	static NodeDeque scriptEvents2;
	@ObfuscatedName("rl")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("scriptEvents3")
	static NodeDeque scriptEvents3;
	@ObfuscatedName("rc")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	static NodeDeque field719;
	@ObfuscatedName("ro")
	@ObfuscatedSignature(
		descriptor = "Luw;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("ra")
	@ObfuscatedGetter(
		intValue = -929237235
	)
	@Export("rootWidgetCount")
	public static int rootWidgetCount;
	@ObfuscatedName("rt")
	@ObfuscatedGetter(
		intValue = -1521410567
	)
	static int field722;
	@ObfuscatedName("rg")
	@Export("validRootWidgets")
	static boolean[] validRootWidgets;
	@ObfuscatedName("re")
	public static boolean[] field724;
	@ObfuscatedName("rf")
	static boolean[] field693;
	@ObfuscatedName("rv")
	@Export("rootWidgetXs")
	public static int[] rootWidgetXs;
	@ObfuscatedName("rk")
	@Export("rootWidgetYs")
	public static int[] rootWidgetYs;
	@ObfuscatedName("rm")
	@Export("rootWidgetWidths")
	public static int[] rootWidgetWidths;
	@ObfuscatedName("rb")
	@Export("rootWidgetHeights")
	public static int[] rootWidgetHeights;
	@ObfuscatedName("rn")
	@ObfuscatedGetter(
		intValue = 769034145
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("rr")
	@ObfuscatedGetter(
		longValue = 423498862684724317L
	)
	static long field731;
	@ObfuscatedName("ri")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("rj")
	@ObfuscatedGetter(
		intValue = 112490199
	)
	static int field688;
	@ObfuscatedName("ry")
	@ObfuscatedGetter(
		intValue = 1824896173
	)
	public static int field689;
	@ObfuscatedName("rh")
	static int[] field723;
	@ObfuscatedName("rp")
	@ObfuscatedGetter(
		intValue = 1325149585
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("sg")
	@ObfuscatedGetter(
		intValue = -1123359343
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("so")
	static String field787;
	@ObfuscatedName("sp")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("sc")
	@ObfuscatedGetter(
		intValue = -1171963393
	)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("sv")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("indexCheck")
	public static IndexCheck indexCheck;
	@ObfuscatedName("su")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	static class267 field816;
	@ObfuscatedName("sy")
	@ObfuscatedGetter(
		intValue = -1729861913
	)
	static int field743;
	@ObfuscatedName("si")
	static int[] field744;
	@ObfuscatedName("sx")
	static int[] field745;
	@ObfuscatedName("sh")
	@ObfuscatedGetter(
		longValue = -5847968740593451849L
	)
	static long field746;
	@ObfuscatedName("sq")
	@ObfuscatedSignature(
		descriptor = "[Lgv;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("sw")
	@ObfuscatedSignature(
		descriptor = "[Lgc;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("sn")
	@ObfuscatedGetter(
		intValue = -1911518687
	)
	static int field700;
	@ObfuscatedName("ss")
	@ObfuscatedGetter(
		intValue = 1289405137
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("sr")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("se")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("sm")
	@ObfuscatedSignature(
		descriptor = "[Lvr;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("sk")
	@ObfuscatedGetter(
		intValue = -1064589619
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("tb")
	@ObfuscatedGetter(
		intValue = 1754051817
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("tn")
	@ObfuscatedGetter(
		intValue = 971140271
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("to")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("ta")
	@ObfuscatedGetter(
		intValue = -883196385
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("te")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("tu")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("ti")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("th")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("ty")
	static int[] field763;
	@ObfuscatedName("tj")
	@ObfuscatedSignature(
		descriptor = "[Lbl;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("tg")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("ua")
	static boolean field596;
	@ObfuscatedName("ud")
	static boolean field512;
	@ObfuscatedName("uo")
	static boolean field575;
	@ObfuscatedName("uq")
	@ObfuscatedGetter(
		intValue = 795943079
	)
	static int field594;
	@ObfuscatedName("ug")
	@ObfuscatedSignature(
		descriptor = "Lua;"
	)
	static class521 field770;
	@ObfuscatedName("uw")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	static class520 field771;
	@ObfuscatedName("ur")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	static class520 field670;
	@ObfuscatedName("um")
	static boolean field773;
	@ObfuscatedName("uh")
	static boolean[] field774;
	@ObfuscatedName("uf")
	static int[] field775;
	@ObfuscatedName("uv")
	static int[] field717;
	@ObfuscatedName("uc")
	static int[] field606;
	@ObfuscatedName("uy")
	static int[] field738;
	@ObfuscatedName("ux")
	static short field797;
	@ObfuscatedName("vv")
	static short field511;
	@ObfuscatedName("vm")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("vp")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("vf")
	static short field783;
	@ObfuscatedName("vh")
	static short field784;
	@ObfuscatedName("vt")
	static short field785;
	@ObfuscatedName("vu")
	static short field786;
	@ObfuscatedName("vl")
	@ObfuscatedGetter(
		intValue = 1284295995
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("ve")
	@ObfuscatedGetter(
		intValue = 1988014405
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("vg")
	@ObfuscatedGetter(
		intValue = 1733751927
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("vj")
	@ObfuscatedGetter(
		intValue = -2145687439
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("vi")
	@ObfuscatedGetter(
		intValue = 675329501
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("vn")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("playerAppearance")
	static final PlayerComposition playerAppearance;
	@ObfuscatedName("vd")
	@ObfuscatedGetter(
		intValue = -780409167
	)
	static int field624;
	@ObfuscatedName("vc")
	@ObfuscatedGetter(
		intValue = 757985289
	)
	static int field794;
	@ObfuscatedName("vb")
	@ObfuscatedSignature(
		descriptor = "Ltq;"
	)
	static class517 field546;
	@ObfuscatedName("vz")
	@ObfuscatedSignature(
		descriptor = "[Lpp;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("va")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("vr")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	static class465 field768;
	@ObfuscatedName("wb")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("DBTableIndex_cache")
	static EvictingDualNodeHashTable DBTableIndex_cache;
	@ObfuscatedName("wu")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("archive11")
	static EvictingDualNodeHashTable archive11;
	@ObfuscatedName("wv")
	static Iterator field813;
	@ObfuscatedName("wm")
	@ObfuscatedGetter(
		intValue = 2057395271
	)
	static int field597;
	@ObfuscatedName("wt")
	@ObfuscatedGetter(
		intValue = -922780067
	)
	public static int field802;
	@ObfuscatedName("gd")
	@Export("token")
	String token;
	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	@Export("asyncRestClient")
	AsyncRestClient asyncRestClient;
	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "Lah;"
	)
	@Export("asyncGameSessionTokenResponse")
	AsyncHttpResponse asyncGameSessionTokenResponse;
	@ObfuscatedName("gu")
	@Export("otlTokenRequester")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/OtlTokenRequester;"
	)
	OtlTokenRequester otlTokenRequester;
	@ObfuscatedName("gg")
	@Export("otlTokenRequestFuture")
	Future otlTokenRequestFuture;
	@ObfuscatedName("gm")
	@Export("https")
	boolean https;
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = -1220799561
	)
	@Export("clientId")
	int clientId;
	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "Lah;"
	)
	@Export("asyncAccessTokenResponse")
	AsyncHttpResponse asyncAccessTokenResponse;
	@ObfuscatedName("gq")
	@Export("refreshAccessTokenRequester")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	RefreshAccessTokenRequester refreshAccessTokenRequester;
	@ObfuscatedName("ga")
	@Export("refreshAccessTokenRequestFuture")
	Future refreshAccessTokenRequestFuture;
	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	Buffer field653;
	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "Lav;"
	)
	class7 field595;
	@ObfuscatedName("ho")
	@ObfuscatedGetter(
		longValue = 8843988486991018211L
	)
	@Export("accountHash")
	long accountHash;

	static {
		field522 = true;
		worldId = 1;
		worldProperties = 0;
		gameBuild = 0;
		isMembersWorld = false;
		isLowDetail = false;
		field788 = -1;
		clientType = -1;
		field516 = -1;
		onMobile = false;
		field518 = false;
		field519 = false;
		gameState = 0;
		field521 = false;
		field698 = false;
		isLoading = true;
		cycle = 0;
		serverCycle = 0;
		mouseLastLastPressedTimeMillis = -1L;
		field528 = -1;
		field529 = -1;
		field530 = -1L;
		hadFocus = true;
		rebootTimer = 0;
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
		z = false;
		field544 = class95.field1151;
		js5ConnectState = 0;
		field532 = 0;
		js5Errors = 0;
		field548 = 0;
		field696 = 0;
		field550 = 0;
		authenticationScheme = AuthenticationScheme.USERNAME_PASSWORD;
		field691 = class561.field5523;
		byte[] var1 = class228.method4528("com_jagex_auth_desktop_osrs:public");
		String var0 = class344.method6790(var1, 0, var1.length);
		BASIC_AUTH_DESKTOP_OSRS = var0;
		var1 = class228.method4528("com_jagex_auth_desktop_runelite:public");
		var0 = class344.method6790(var1, 0, var1.length);
		BASIC_AUTH_DESKTOP_RUNELITE = var0;
		Login_isUsernameRemembered = false;
		secureRandomFuture = new SecureRandomFuture();
		field762 = new int[4];
		randomDatData = null;
		npcCount = 0;
		npcIndices = new int[250];
		packetWriter = new PacketWriter();
		logoutTimer = 0;
		hadNetworkError = false;
		timer = new Timer();
		fontsMap = new HashMap();
		field777 = 0;
		field598 = 1;
		field581 = 0;
		field625 = 1;
		field583 = 0;
		field584 = new int[4][13][13];
		worldViewManager = new WorldViewManager();
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		field588 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		field567 = -1;
		playerUpdateManager = new PlayerUpdateManager();
		graphicsCycle = 0;
		field592 = 2301979;
		field593 = 5063219;
		field793 = 3353893;
		field646 = 7759444;
		field562 = false;
		alternativeScrollbarWidth = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		mouseCamClickedX = 0;
		mouseCamClickedY = 0;
		oculusOrbState = 0;
		camFollowHeight = 50;
		field610 = 0;
		field758 = 0;
		field608 = 0;
		oculusOrbNormalSpeed = 12;
		oculusOrbSlowedSpeed = 6;
		revision = 0;
		field612 = false;
		field613 = 0;
		field524 = false;
		field678 = 0;
		overheadTextCount = 0;
		overheadTextLimit = 50;
		overheadTextXs = new int[overheadTextLimit];
		overheadTextYs = new int[overheadTextLimit];
		overheadTextAscents = new int[overheadTextLimit];
		overheadTextXOffsets = new int[overheadTextLimit];
		overheadTextColors = new int[overheadTextLimit];
		overheadTextEffects = new int[overheadTextLimit];
		field660 = new int[overheadTextLimit][];
		overheadTextCyclesRemaining = new int[overheadTextLimit];
		overheadText = new String[overheadTextLimit];
		viewportDrawCount = 0;
		viewportTempX = -1;
		viewportTempY = -1;
		mouseCrossX = 0;
		mouseCrossY = 0;
		mouseCrossState = 0;
		mouseCrossColor = 0;
		showMouseCross = true;
		field635 = 0;
		showLoadingMessages = true;
		localPlayerIndex = -1;
		field638 = 0;
		userId = -1L;
		userHash = -1L;
		field614 = "";
		field642 = -1;
		renderSelf = true;
		drawPlayerNames = 0;
		field645 = 0;
		field647 = new int[1000];
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
		playerMenuActions = new String[8];
		playerOptionsPriorities = new boolean[8];
		defaultRotations = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
		combatTargetPlayerIndex = -1;
		currentLevels = new int[25];
		levels = new int[25];
		experience = new int[25];
		field655 = new int[25];
		leftClickOpensMenu = false;
		isMenuOpen = false;
		menu = new Menu(true);
		followerOpsLowPriority = false;
		tapToDrop = false;
		showMouseOverText = true;
		viewportX = -1;
		viewportY = -1;
		field664 = 0;
		field514 = 50;
		isItemSelected = 0;
		field667 = null;
		isSpellSelected = false;
		selectedSpellChildIndex = -1;
		selectedSpellItemId = -1;
		selectedSpellActionName = null;
		selectedSpellName = null;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field710 = 0;
		field676 = -1;
		chatEffects = 0;
		meslayerContinueWidget = null;
		runEnergy = 0;
		weight = 0;
		staffModLevel = 0;
		followerIndex = -1;
		playerMod = false;
		viewportWidget = null;
		clickedWidget = null;
		clickedWidgetParent = null;
		widgetClickX = 0;
		widgetClickY = 0;
		draggedOnWidget = null;
		field690 = false;
		field795 = -1;
		field683 = -1;
		field749 = false;
		field694 = -1;
		field695 = -1;
		isDraggingWidget = false;
		cycleCntr = 1;
		changedVarps = new int[32];
		changedVarpCount = 0;
		changedItemContainers = new int[32];
		field701 = 0;
		changedSkills = new int[32];
		changedSkillsCount = 0;
		field704 = new int[32];
		field705 = 0;
		chatCycle = 0;
		field707 = 0;
		field708 = 0;
		field709 = 0;
		field798 = 0;
		field769 = 0;
		field712 = 0;
		field713 = 0;
		mouseWheelRotation = 0;
		field715 = new class574();
		scriptEvents = new NodeDeque();
		scriptEvents2 = new NodeDeque();
		scriptEvents3 = new NodeDeque();
		field719 = new NodeDeque();
		widgetFlags = new NodeHashTable(512);
		rootWidgetCount = 0;
		field722 = -2;
		validRootWidgets = new boolean[100];
		field724 = new boolean[100];
		field693 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field731 = 0L;
		isResizable = true;
		field688 = 600;
		field689 = field688 / GameEngine.cycleDurationMillis;
		field723 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		publicChatMode = 0;
		tradeChatMode = 0;
		field787 = "";
		crossWorldMessageIds = new long[100];
		crossWorldMessageIdsIndex = 0;
		indexCheck = new IndexCheck();
		field816 = new class267();
		field743 = 0;
		field744 = new int[128];
		field745 = new int[128];
		field746 = -1L;
		currentClanSettings = new ClanSettings[4];
		currentClanChannels = new ClanChannel[4];
		field700 = -1;
		mapIconCount = 0;
		mapIconXs = new int[1000];
		mapIconYs = new int[1000];
		mapIcons = new SpritePixels[1000];
		destinationX = 0;
		destinationY = 0;
		minimapState = 0;
		playingJingle = false;
		soundEffectCount = 0;
		soundEffectIds = new int[50];
		queuedSoundEffectLoops = new int[50];
		queuedSoundEffectDelays = new int[50];
		soundLocations = new int[50];
		field763 = new int[50];
		soundEffects = new SoundEffect[50];
		isCameraLocked = false;
		field596 = false;
		field512 = false;
		field575 = false;
		field770 = null;
		field771 = null;
		field670 = null;
		field773 = false;
		field774 = new boolean[5];
		field775 = new int[5];
		field717 = new int[5];
		field606 = new int[5];
		field738 = new int[5];
		field797 = 256;
		field511 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field783 = 1;
		field784 = 32767;
		field785 = 1;
		field786 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		playerAppearance = new PlayerComposition();
		field624 = -1;
		field794 = -1;
		field546 = new DesktopPlatformInfoProvider();
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		field768 = new class465(8, class463.field4954);
		DBTableIndex_cache = new EvictingDualNodeHashTable(64);
		archive11 = new EvictingDualNodeHashTable(64);
		field597 = -1;
		field802 = -1;
		field803 = new ArrayList();
		field517 = new class277();
		field805 = 30;
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field549 = 0;
		field809 = new ApproximateRouteStrategy();
		field810 = new int[50];
		field811 = new int[50];
	}

	public Client() {
		this.https = false;
		this.clientId = 0;
		this.accountHash = -1L;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1532432346"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field731 = class59.method1150() + 500L;
		this.resizeJS();
		if (rootInterface != -1) {
			this.method1268(true);
		}

	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1983807399"
	)
	@Export("setUp")
	protected final void setUp() {
		int[] var1 = new int[]{20, 260, 10000};
		int[] var2 = new int[]{1000, 100, 500};
		if (var1 != null && var2 != null) {
			HealthBarDefinition.ByteArrayPool_alternativeSizes = var1;
			class201.ByteArrayPool_altSizeArrayCounts = new int[var1.length];
			ByteArrayPool.ByteArrayPool_arrays = new byte[var1.length][][];

			for (int var3 = 0; var3 < HealthBarDefinition.ByteArrayPool_alternativeSizes.length; ++var3) {
				ByteArrayPool.ByteArrayPool_arrays[var3] = new byte[var2[var3]][];
				ByteArrayPool.field4911.add(var1[var3]);
			}

			Collections.sort(ByteArrayPool.field4911);
		} else {
			HealthBarDefinition.ByteArrayPool_alternativeSizes = null;
			class201.ByteArrayPool_altSizeArrayCounts = null;
			ByteArrayPool.ByteArrayPool_arrays = null;
			class383.method7487();
		}

		class360.field3847 = class417.method7998(worldProperties, class552.field5440);
		class150.worldPort = gameBuild == 0 ? 43594 : worldId + 40000;
		InvDefinition.js5Port = gameBuild == 0 ? 443 : worldId + 50000;
		class372.currentPort = class150.worldPort;
		class182.field1879 = class360.field3849;
		class182.field1880 = class360.field3845;
		KitDefinition.field1924 = class360.field3846;
		FloorOverlayDefinition.field2290 = class360.field3844;
		class167.urlRequester = new SecureUrlRequester(this.https, 227);
		this.setUpKeyboard();
		this.setUpMouse();
		AsyncHttpResponse.mouseWheel = this.mouseWheel();
		this.method624(field816, 0);
		this.method624(indexCheck, 1);
		this.setUpClipboard();
		class346.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		AccessFile var4 = null;
		ClientPreferences var5 = new ClientPreferences();

		try {
			var4 = GameEngine.getPreferencesFile("", Language.field4687.name, false);
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

		SecureUrlRequester.clientPreferences = var5;
		class465.method8896(this, GameEngine.field172);
		MusicPatchNode.setWindowedMode(SecureUrlRequester.clientPreferences.getWindowMode());
		InterfaceParent.friendSystem = new FriendSystem(class28.loginType);
		this.asyncRestClient = new AsyncRestClient("tokenRequest", 1, 1);
		class227.method4524(this);
		field517.method5744();
		ModelData var12 = new ModelData(3, 1, 0);
		var12.method4591(-64, -8, 64);
		var12.method4591(64, -8, 64);
		var12.method4591(0, -8, -24);
		var12.method4678(0, 2, 1, (byte)1, (byte)-1, (short)-1, (short)-1);
		Occluder.field2779 = var12.toModel(128, 256, 0, -128, 0);
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1441063551"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle;
		this.doCycleJs5();
		class88.method2485();
		boolean var1 = AbstractByteArrayCopier.method7434();
		if (var1 && playingJingle && class75.pcmPlayer1 != null) {
			class75.pcmPlayer1.tryDiscard();
		}

		UserComparator3.method3232();
		indexCheck.method5572();
		this.method472();
		class300.method6247();
		if (AsyncHttpResponse.mouseWheel != null) {
			int var2 = AsyncHttpResponse.mouseWheel.useRotation();
			mouseWheelRotation = var2;
		}

		if (gameState == 0) {
			NPC.method2957();
			Canvas.method310();
		} else if (gameState == 5) {
			HealthBarConfig.loginScreen(this, class336.fontPlain11, class1.fontPlain12);
			NPC.method2957();
			Canvas.method310();
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				HealthBarConfig.loginScreen(this, class336.fontPlain11, class1.fontPlain12);
				this.doCycleLoggedOut();
			} else if (gameState == 50) {
				HealthBarConfig.loginScreen(this, class336.fontPlain11, class1.fontPlain12);
				this.doCycleLoggedOut();
			} else if (gameState == 25) {
				if (field518) {
					class329.loadRegion();
				}

				if (field519) {
					WorldMapID.method6241(HttpQueryParams.field5137);
				}

				if (!field519 && !field518) {
					class31.updateGameState(30);
				}
			}
		} else {
			HealthBarConfig.loginScreen(this, class336.fontPlain11, class1.fontPlain12);
		}

		if (gameState == 30) {
			this.doCycleLoggedIn();
		} else if (gameState == 40 || gameState == 45) {
			this.doCycleLoggedOut();
		}

	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "111"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		if ((gameState == 10 || gameState == 20 || gameState == 30) && field731 != 0L && class59.method1150() > field731) {
			MusicPatchNode.setWindowedMode(class93.getWindowedMode());
		}

		int var2;
		if (var1) {
			for (var2 = 0; var2 < 100; ++var2) {
				validRootWidgets[var2] = true;
			}
		}

		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1, class376.field4116);
		} else if (gameState == 5) {
			HttpHeaders.drawTitle(PacketWriter.fontBold12, class336.fontPlain11, class1.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				HttpHeaders.drawTitle(PacketWriter.fontBold12, class336.fontPlain11, class1.fontPlain12);
			} else if (gameState == 50) {
				HttpHeaders.drawTitle(PacketWriter.fontBold12, class336.fontPlain11, class1.fontPlain12);
			} else if (gameState == 25) {
				if (field583 == 1) {
					if (field777 > field598) {
						field598 = field777;
					}

					var2 = (field598 * 50 - field777 * 50) / field598;
					class135.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
				} else if (field583 == 2) {
					if (field581 > field625) {
						field625 = field581;
					}

					var2 = (field625 * 50 - field581 * 50) / field625 + 50;
					class135.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
				} else {
					class135.drawLoadingMessage("Loading - please wait.", false);
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				class135.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) {
				class135.drawLoadingMessage("Please wait...", false);
			}
		} else {
			HttpHeaders.drawTitle(PacketWriter.fontBold12, class336.fontPlain11, class1.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				if (field724[var2]) {
					class154.rasterProvider.draw(rootWidgetXs[var2], rootWidgetYs[var2], rootWidgetWidths[var2], rootWidgetHeights[var2]);
					field724[var2] = false;
				}
			}
		} else if (gameState > 0) {
			class154.rasterProvider.drawFull(0, 0);

			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				field724[var2] = false;
			}
		}

	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-256295307"
	)
	@Export("kill0")
	protected final void kill0() {
		if (HttpRequestTask.varcs != null && HttpRequestTask.varcs.hasUnwrittenChanges()) {
			HttpRequestTask.varcs.write();
		}

		if (class190.mouseRecorder != null) {
			class190.mouseRecorder.isRunning = false;
		}

		class190.mouseRecorder = null;
		packetWriter.close();
		if (MouseHandler.MouseHandler_instance != null) {
			synchronized(MouseHandler.MouseHandler_instance) {
				MouseHandler.MouseHandler_instance = null;
			}
		}

		AsyncHttpResponse.mouseWheel = null;
		if (class75.pcmPlayer1 != null) {
			class75.pcmPlayer1.shutdown();
		}

		GrandExchangeOfferTotalQuantityComparator.field4633.method7655();
		GameBuild.method7465();
		if (class167.urlRequester != null) {
			class167.urlRequester.close();
			class167.urlRequester = null;
		}

		WorldMapLabelSize.method5789();
		this.asyncRestClient.shutdown();
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "46"
	)
	protected final void vmethod1236() {
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1045166020"
	)
	@Export("isRuneLite")
	boolean isRuneLite() {
		return this.clientId == 1;
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	@Export("containsAccessAndRefreshToken")
	boolean containsAccessAndRefreshToken() {
		return class482.accessToken != null && !class482.accessToken.trim().isEmpty() && WorldMapID.refreshToken != null && !WorldMapID.refreshToken.trim().isEmpty();
	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "127"
	)
	@Export("containsSessionAndCharacterId")
	boolean containsSessionAndCharacterId() {
		return class225.sessionId != null && !class225.sessionId.trim().isEmpty() && class47.characterId != null && !class47.characterId.trim().isEmpty();
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1909315864"
	)
	@Export("otlTokenRequesterInitialized")
	boolean otlTokenRequesterInitialized() {
		return this.otlTokenRequester != null;
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1127246731"
	)
	@Export("requestRefreshAccessToken")
	void requestRefreshAccessToken(String var1) throws IOException {
		HashMap var2 = new HashMap();
		var2.put("grant_type", "refresh_token");
		var2.put("scope", "gamesso.token.create");
		var2.put("refresh_token", var1);
		URL var3 = new URL(Messages.authServiceBaseUrl + "shield/oauth/token" + (new HttpQueryParams(var2)).encode());
		HttpHeaders var4 = new HttpHeaders();
		if (this.isRuneLite()) {
			var4.basicAuthentication(BASIC_AUTH_DESKTOP_RUNELITE);
		} else {
			var4.basicAuthentication(BASIC_AUTH_DESKTOP_OSRS);
		}

		var4.header("Host", (new URL(Messages.authServiceBaseUrl)).getHost());
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

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1569946264"
	)
	@Export("requestOtlToken")
	void requestOtlToken(String var1) throws IOException {
		URL var2 = new URL(Messages.authServiceBaseUrl + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
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

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "119"
	)
	@Export("authenticate")
	void authenticate(String var1, String var2) throws IOException, JSONException {
		URL var3 = new URL(AsyncRestClient.gameSessionServiceBaseUrl + "game-session/v1/tokens");
		HttpRequest var4 = new HttpRequest(var3, HttpMethod.POST, this.https);
		var4.getHeaders().bearerToken(var1);
		var4.getHeaders().accept(HttpContentType.APPLICATION_JSON);
		JSONObject var5 = new JSONObject();
		var5.setProperty("accountId", var2);
		var4.setPayload(new HttpJsonRequestBody(var5));
		this.asyncGameSessionTokenResponse = this.asyncRestClient.submitRequest(var4);
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-85"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			boolean var1 = GrandExchangeOfferTotalQuantityComparator.field4633.method7674();
			if (!var1) {
				this.method1253();
			}

		}
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1442756654"
	)
	void method1253() {
		if (GrandExchangeOfferTotalQuantityComparator.field4633.field4624 >= 4) {
			this.error("js5crc");
			class31.updateGameState(1000);
		} else {
			if (GrandExchangeOfferTotalQuantityComparator.field4633.field4625 >= 4) {
				if (gameState <= 5) {
					this.error("js5io");
					class31.updateGameState(1000);
					return;
				}

				field532 = 3000;
				GrandExchangeOfferTotalQuantityComparator.field4633.field4625 = 3;
			}

			if (--field532 + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						class465.js5SocketTask = GameEngine.taskHandler.newSocketTask(class172.worldHost, class372.currentPort);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (class465.js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (class465.js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						class113.js5Socket = FloatProjection.method5138((Socket)class465.js5SocketTask.result, 40000, 5000);
						Buffer var1 = new Buffer(class326.field3581.field3589 + 1);
						var1.writeByte(class326.field3581.field3588);
						var1.writeInt(227);
						var1.writeInt(field762[0]);
						var1.writeInt(field762[1]);
						var1.writeInt(field762[2]);
						var1.writeInt(field762[3]);
						class113.js5Socket.write(var1.array, 0, class326.field3581.field3589 + 1);
						++js5ConnectState;
						class73.field885 = class59.method1150();
					}

					if (js5ConnectState == 3) {
						if (class113.js5Socket.available() > 0) {
							int var2 = class113.js5Socket.readUnsignedByte();
							if (var2 != 0) {
								this.js5Error(var2);
								return;
							}

							++js5ConnectState;
						} else if (class59.method1150() - class73.field885 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						GrandExchangeOfferTotalQuantityComparator.field4633.method7657(class113.js5Socket, gameState > 20);
						class465.js5SocketTask = null;
						class113.js5Socket = null;
						js5ConnectState = 0;
						js5Errors = 0;
					}
				} catch (IOException var3) {
					this.js5Error(-3);
				}

			}
		}
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-7063"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		class465.js5SocketTask = null;
		class113.js5Socket = null;
		js5ConnectState = 0;
		if (class372.currentPort == class150.worldPort) {
			class372.currentPort = InvDefinition.js5Port;
		} else {
			class372.currentPort = class150.worldPort;
		}

		++js5Errors;
		if (js5Errors < 2 || var1 != 7 && var1 != 9) {
			if (js5Errors >= 2 && var1 == 6) {
				this.error("js5connect_outofdate");
				class31.updateGameState(1000);
			} else if (js5Errors >= 4) {
				if (gameState <= 5) {
					this.error("js5connect");
					class31.updateGameState(1000);
				} else {
					field532 = 3000;
				}
			}
		} else if (gameState <= 5) {
			this.error("js5connect_full");
			class31.updateGameState(1000);
		} else {
			field532 = 3000;
		}

	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1868170334"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		AbstractSocket var1 = packetWriter.getSocket();
		PacketBuffer var2 = packetWriter.packetBuffer;

		try {
			if (LoginState.SHUTDOWN_PREVIOUS_CONNECTION == FloorOverlayDefinition.loginState) {
				if (WorldView.field1335 == null && (secureRandomFuture.isDone() || field548 > 250)) {
					WorldView.field1335 = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (WorldView.field1335 != null) {
					if (var1 != null) {
						var1.close();
						var1 = null;
					}

					class318.field3303 = null;
					hadNetworkError = false;
					field548 = 0;
					if (field691.method10412()) {
						if (this.containsAccessAndRefreshToken()) {
							try {
								this.requestRefreshAccessToken(WorldMapID.refreshToken);
								ViewportMouse.updateLoginState(LoginState.TOKEN_RESPONSE);
							} catch (Throwable var21) {
								ArchiveLoader.RunException_sendStackTrace((String)null, var21);
								WorldMapLabelSize.getLoginError(65);
								return;
							}
						} else {
							if (!this.containsSessionAndCharacterId()) {
								WorldMapLabelSize.getLoginError(65);
								return;
							}

							try {
								this.authenticate(class225.sessionId, class47.characterId);
								ViewportMouse.updateLoginState(LoginState.REFRESHING_TOKEN);
							} catch (Exception var20) {
								ArchiveLoader.RunException_sendStackTrace((String)null, var20);
								WorldMapLabelSize.getLoginError(65);
								return;
							}
						}
					} else {
						ViewportMouse.updateLoginState(LoginState.INIT_MOUSEHANDLER_SOCKET);
					}
				}
			}

			HttpResponse var23;
			if (FloorOverlayDefinition.loginState == LoginState.TOKEN_RESPONSE) {
				if (this.refreshAccessTokenRequestFuture != null) {
					if (!this.refreshAccessTokenRequestFuture.isDone()) {
						return;
					}

					if (this.refreshAccessTokenRequestFuture.isCancelled()) {
						WorldMapLabelSize.getLoginError(65);
						this.refreshAccessTokenRequestFuture = null;
						return;
					}

					try {
						RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.refreshAccessTokenRequestFuture.get();
						if (!var3.isSuccess()) {
							WorldMapLabelSize.getLoginError(65);
							this.refreshAccessTokenRequestFuture = null;
							return;
						}

						class482.accessToken = var3.getAccessToken();
						WorldMapID.refreshToken = var3.getRefreshToken();
						this.refreshAccessTokenRequestFuture = null;
					} catch (Exception var19) {
						ArchiveLoader.RunException_sendStackTrace((String)null, var19);
						WorldMapLabelSize.getLoginError(65);
						this.refreshAccessTokenRequestFuture = null;
						return;
					}
				} else {
					if (this.asyncAccessTokenResponse == null) {
						WorldMapLabelSize.getLoginError(65);
						return;
					}

					if (!this.asyncAccessTokenResponse.hasFinished()) {
						return;
					}

					if (this.asyncAccessTokenResponse.hasError()) {
						ArchiveLoader.RunException_sendStackTrace(this.asyncAccessTokenResponse.getErrorMessage(), (Throwable)null);
						WorldMapLabelSize.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}

					var23 = this.asyncAccessTokenResponse.await();
					if (var23.getResponseCode() != 200) {
						WorldMapLabelSize.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}

					field548 = 0;
					HttpJsonRequestBody var4 = new HttpJsonRequestBody(var23.getResponseBody());

					try {
						class482.accessToken = var4.getBody().getString("access_token");
						WorldMapID.refreshToken = var4.getBody().getString("refresh_token");
					} catch (Exception var18) {
						ArchiveLoader.RunException_sendStackTrace("Error parsing tokens", var18);
						WorldMapLabelSize.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}
				}

				this.requestOtlToken(class482.accessToken);
				ViewportMouse.updateLoginState(LoginState.REFRESHING_TOKEN);
			}

			if (FloorOverlayDefinition.loginState == LoginState.REFRESHING_TOKEN) {
				if (this.otlTokenRequestFuture != null) {
					if (!this.otlTokenRequestFuture.isDone()) {
						return;
					}

					if (this.otlTokenRequestFuture.isCancelled()) {
						WorldMapLabelSize.getLoginError(65);
						this.otlTokenRequestFuture = null;
						return;
					}

					try {
						OtlTokenResponse var24 = (OtlTokenResponse)this.otlTokenRequestFuture.get();
						if (!var24.isSuccess()) {
							WorldMapLabelSize.getLoginError(65);
							this.otlTokenRequestFuture = null;
							return;
						}

						this.token = var24.getToken();
						this.otlTokenRequestFuture = null;
					} catch (Exception var17) {
						ArchiveLoader.RunException_sendStackTrace((String)null, var17);
						WorldMapLabelSize.getLoginError(65);
						this.otlTokenRequestFuture = null;
						return;
					}
				} else {
					if (this.asyncGameSessionTokenResponse == null) {
						WorldMapLabelSize.getLoginError(65);
						return;
					}

					if (!this.asyncGameSessionTokenResponse.hasFinished()) {
						return;
					}

					if (this.asyncGameSessionTokenResponse.hasError()) {
						ArchiveLoader.RunException_sendStackTrace(this.asyncGameSessionTokenResponse.getErrorMessage(), (Throwable)null);
						WorldMapLabelSize.getLoginError(65);
						this.asyncGameSessionTokenResponse = null;
						return;
					}

					var23 = this.asyncGameSessionTokenResponse.await();
					if (var23.getResponseCode() != 200) {
						ArchiveLoader.RunException_sendStackTrace("Login authentication error. Response code: " + var23.getResponseCode() + " " + var23.method273() + " Response body: " + var23.getResponseBody(), (Throwable)null);
						WorldMapLabelSize.getLoginError(65);
						this.asyncGameSessionTokenResponse = null;
						return;
					}

					List var26 = (List)var23.getHeaderFields().get("Content-Type");
					if (var26 != null && var26.contains(HttpContentType.APPLICATION_JSON.getValue())) {
						try {
							JSONObject var5 = new JSONObject(var23.getResponseBody());
							this.token = var5.getString("token");
						} catch (JSONException var16) {
							ArchiveLoader.RunException_sendStackTrace((String)null, var16);
							WorldMapLabelSize.getLoginError(65);
							this.asyncGameSessionTokenResponse = null;
							return;
						}
					} else {
						this.token = var23.getResponseBody();
					}

					this.asyncGameSessionTokenResponse = null;
				}

				field548 = 0;
				ViewportMouse.updateLoginState(LoginState.INIT_MOUSEHANDLER_SOCKET);
			}

			if (LoginState.INIT_MOUSEHANDLER_SOCKET == FloorOverlayDefinition.loginState) {
				if (class318.field3303 == null) {
					class318.field3303 = GameEngine.taskHandler.newSocketTask(class172.worldHost, class372.currentPort);
				}

				if (class318.field3303.status == 2) {
					throw new IOException();
				}

				if (class318.field3303.status == 1) {
					var1 = FloatProjection.method5138((Socket)class318.field3303.result, 40000, 5000);
					packetWriter.setSocket(var1);
					class318.field3303 = null;
					ViewportMouse.updateLoginState(LoginState.UNMAPPED_20);
				}
			}

			PacketBufferNode var25;
			if (FloorOverlayDefinition.loginState == LoginState.UNMAPPED_20) {
				packetWriter.clearBuffer();
				var25 = HealthBarUpdate.method2700();
				var25.packetBuffer.writeByte(class326.field3587.field3588);
				packetWriter.addNode(var25);
				packetWriter.flush();
				var2.offset = 0;
				ViewportMouse.updateLoginState(LoginState.READ_LOGIN_STATUS);
			}

			int var12;
			if (FloorOverlayDefinition.loginState == LoginState.READ_LOGIN_STATUS) {
				if (class75.pcmPlayer1 != null) {
					class75.pcmPlayer1.method775();
				}

				if (var1.isAvailable(1)) {
					var12 = var1.readUnsignedByte();
					if (class75.pcmPlayer1 != null) {
						class75.pcmPlayer1.method775();
					}

					if (var12 != 0) {
						WorldMapLabelSize.getLoginError(var12);
						return;
					}

					var2.offset = 0;
					ViewportMouse.updateLoginState(LoginState.READ_RANDOM_VERIFICATION_NUMBER);
				}
			}

			if (LoginState.READ_RANDOM_VERIFICATION_NUMBER == FloorOverlayDefinition.loginState) {
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
					class156.field1716 = var2.readLong();
					ViewportMouse.updateLoginState(LoginState.WRITE_INITIAL_LOGIN_PACKET);
				}
			}

			if (LoginState.WRITE_INITIAL_LOGIN_PACKET == FloorOverlayDefinition.loginState) {
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var27 = new PacketBuffer(500);
				int[] var28 = new int[]{WorldView.field1335.nextInt(), WorldView.field1335.nextInt(), WorldView.field1335.nextInt(), WorldView.field1335.nextInt()};
				var27.offset = 0;
				var27.writeByte(1);
				var27.writeInt(var28[0]);
				var27.writeInt(var28[1]);
				var27.writeInt(var28[2]);
				var27.writeInt(var28[3]);
				var27.writeLong(class156.field1716);
				if (gameState == 40) {
					var27.writeInt(field762[0]);
					var27.writeInt(field762[1]);
					var27.writeInt(field762[2]);
					var27.writeInt(field762[3]);
				} else {
					if (gameState == 50) {
						var27.writeByte(AuthenticationScheme.field1517.rsOrdinal());
						var27.writeInt(AttackOption.field1381);
					} else {
						var27.writeByte(authenticationScheme.rsOrdinal());
						switch(authenticationScheme.schemeId) {
						case 0:
							var27.offset += 4;
							break;
						case 1:
							var27.writeInt(SecureUrlRequester.clientPreferences.getParameterValue(Login.Login_username));
							break;
						case 2:
						case 4:
							var27.writeMedium(Bounds.otpMedium);
							++var27.offset;
						case 3:
						}
					}

					if (field691.method10412()) {
						var27.writeByte(class561.field5529.rsOrdinal());
						var27.writeStringCp1252NullTerminated(this.token);
					} else {
						var27.writeByte(class561.field5523.rsOrdinal());
						var27.writeStringCp1252NullTerminated(Login.Login_password);
					}
				}

				var27.encryptRsa(class77.field922, class77.field921);
				field762 = var28;
				PacketBufferNode var31 = HealthBarUpdate.method2700();
				var31.packetBuffer.offset = 0;
				if (gameState == 40) {
					var31.packetBuffer.writeByte(class326.field3586.field3588);
				} else {
					var31.packetBuffer.writeByte(class326.field3582.field3588);
				}

				var31.packetBuffer.writeShort(0);
				int var6 = var31.packetBuffer.offset;
				var31.packetBuffer.writeInt(227);
				var31.packetBuffer.writeInt(1);
				var31.packetBuffer.writeByte(clientType);
				var31.packetBuffer.writeByte(field516);
				byte var7 = 0;
				var31.packetBuffer.writeByte(var7);
				var31.packetBuffer.writeBytes(var27.array, 0, var27.offset);
				int var8 = var31.packetBuffer.offset;
				var31.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var31.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var31.packetBuffer.writeShort(class329.canvasWidth);
				var31.packetBuffer.writeShort(class535.canvasHeight);
				Huffman.randomDatData2(var31.packetBuffer);
				var31.packetBuffer.writeStringCp1252NullTerminated(class141.field1630);
				var31.packetBuffer.writeInt(FriendsChat.field4989);
				var31.packetBuffer.writeByte(0);
				Buffer var9 = new Buffer(ObjectComposition.platformInfo.size());
				ObjectComposition.platformInfo.write(var9);
				var31.packetBuffer.writeBytes(var9.array, 0, var9.array.length);
				var31.packetBuffer.writeByte(clientType);
				var31.packetBuffer.writeInt(0);
				if (class360.field3847) {
					HealthBarConfig.method2888(var31);
				} else {
					class544.method9964(var31);
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
				ViewportMouse.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			int var13;
			if (FloorOverlayDefinition.loginState == LoginState.READ_CLIENT_INFO_STATUS && var1.available() > 0) {
				var12 = var1.readUnsignedByte();
				if (var12 == 61) {
					var13 = var1.available();
					IndexCheck.field3003 = var13 == 1 && var1.readUnsignedByte() == 1;
					ViewportMouse.updateLoginState(LoginState.WRITE_INITIAL_LOGIN_PACKET);
				}

				if (var12 == 21 && gameState == 20) {
					ViewportMouse.updateLoginState(LoginState.READ_PROFILE_TRANSFER_TIME);
				} else if (var12 == 2) {
					if (class360.field3847) {
						ViewportMouse.updateLoginState(LoginState.UNMAPPED_21);
					} else {
						ViewportMouse.updateLoginState(LoginState.UNMAPPED);
					}
				} else if (var12 == 15 && gameState == 40) {
					packetWriter.serverPacketLength = -1;
					ViewportMouse.updateLoginState(LoginState.UNMAPPED_19);
				} else if (var12 == 64) {
					ViewportMouse.updateLoginState(LoginState.READ_STATE_11_PACKET_SIZE);
				} else if (var12 == 23 && field696 < 1) {
					++field696;
					ViewportMouse.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				} else if (var12 == 29) {
					ViewportMouse.updateLoginState(LoginState.UNMAPPED_17);
				} else {
					if (var12 != 69) {
						WorldMapLabelSize.getLoginError(var12);
						return;
					}

					ViewportMouse.updateLoginState(LoginState.READ_DIGEST_PARSER_PACKET_SIZE);
				}
			}

			if (FloorOverlayDefinition.loginState == LoginState.UNMAPPED_21) {
				class376.field4116 = true;
				class497.method9339(class95.field1162);
				class31.updateGameState(0);
			}

			if (FloorOverlayDefinition.loginState == LoginState.READ_DIGEST_PARSER_PACKET_SIZE && var1.available() >= 2) {
				var1.read(var2.array, 0, 2);
				var2.offset = 0;
				class7.field24 = var2.readUnsignedShort();
				ViewportMouse.updateLoginState(LoginState.SUBMIT_DIGEST_PARSER_TASK);
			}

			if (FloorOverlayDefinition.loginState == LoginState.SUBMIT_DIGEST_PARSER_TASK && var1.available() >= class7.field24) {
				var2.offset = 0;
				var1.read(var2.array, var2.offset, class7.field24);
				class6 var29 = class191.method3890()[var2.readUnsignedByte()];

				try {
					class3 var30 = class159.method3521(var29);
					this.field595 = new class7(var2, var30);
					ViewportMouse.updateLoginState(LoginState.WRITE_DIGEST_PARSER_RESULT);
				} catch (Exception var15) {
					WorldMapLabelSize.getLoginError(22);
					return;
				}
			}

			if (LoginState.WRITE_DIGEST_PARSER_RESULT == FloorOverlayDefinition.loginState && this.field595.method50()) {
				this.field653 = this.field595.method52();
				this.field595.method51();
				this.field595 = null;
				if (this.field653 == null) {
					WorldMapLabelSize.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				var25 = HealthBarUpdate.method2700();
				var25.packetBuffer.writeByte(class326.field3584.field3588);
				var25.packetBuffer.writeShort(this.field653.offset);
				var25.packetBuffer.writeBuffer(this.field653);
				packetWriter.addNode(var25);
				packetWriter.flush();
				this.field653 = null;
				ViewportMouse.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			if (LoginState.READ_STATE_11_PACKET_SIZE == FloorOverlayDefinition.loginState && var1.available() > 0) {
				HttpResponse.field98 = var1.readUnsignedByte();
				ViewportMouse.updateLoginState(LoginState.UNMAPPED_11);
			}

			if (FloorOverlayDefinition.loginState == LoginState.UNMAPPED_11 && var1.available() >= HttpResponse.field98) {
				var1.read(var2.array, 0, HttpResponse.field98);
				var2.offset = 0;
				ViewportMouse.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			if (LoginState.READ_PROFILE_TRANSFER_TIME == FloorOverlayDefinition.loginState && var1.available() > 0) {
				field550 = (var1.readUnsignedByte() + 3) * 60;
				ViewportMouse.updateLoginState(LoginState.PROFILE_TRANSFER);
			}

			if (FloorOverlayDefinition.loginState == LoginState.PROFILE_TRANSFER) {
				field548 = 0;
				class106.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field550 / 60 + " seconds.");
				if (--field550 <= 0) {
					ViewportMouse.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				}

			} else if (FloorOverlayDefinition.loginState == LoginState.READ_ACCOUNT_INFO_PACKET_SIZE) {
				var25 = HealthBarUpdate.method2700();
				var25.packetBuffer.writeByte(class326.field3585.field3588);
				var25.packetBuffer.writeShort(class326.field3585.field3589);
				class107.method2981(var25);
				packetWriter.addNode(var25);
				packetWriter.flush();
				ViewportMouse.updateLoginState(LoginState.UNMAPPED);
			} else {
				if (LoginState.UNMAPPED == FloorOverlayDefinition.loginState && var1.available() >= 1) {
					class204.field2109 = var1.readUnsignedByte();
					if (class204.field2109 != class326.field3590.field3589) {
						WorldMapLabelSize.getLoginError(class204.field2109);
						return;
					}

					ViewportMouse.updateLoginState(LoginState.READ_ACCOUNT_INFO);
				}

				if (LoginState.READ_ACCOUNT_INFO == FloorOverlayDefinition.loginState && var1.available() >= class204.field2109) {
					boolean var38 = var1.readUnsignedByte() == 1;
					var1.read(var2.array, 0, 4);
					var2.offset = 0;
					boolean var37 = false;
					if (var38) {
						var13 = var2.readByteIsaac() << 24;
						var13 |= var2.readByteIsaac() << 16;
						var13 |= var2.readByteIsaac() << 8;
						var13 |= var2.readByteIsaac();
						SecureUrlRequester.clientPreferences.put(Login.Login_username, var13);
					}

					if (Login_isUsernameRemembered) {
						SecureUrlRequester.clientPreferences.updateRememberedUsername(Login.Login_username);
					} else {
						SecureUrlRequester.clientPreferences.updateRememberedUsername((String)null);
					}

					TaskHandler.savePreferences();
					staffModLevel = var1.readUnsignedByte();
					playerMod = var1.readUnsignedByte() == 1;
					localPlayerIndex = var1.readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += var1.readUnsignedByte();
					field638 = var1.readUnsignedByte();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					this.accountHash = var2.readLong();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					userId = var2.readLong();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					userHash = var2.readLong();
					Actor.method2671().method4464(this.https);
					ViewportMouse.updateLoginState(LoginState.SET_SERVER_PROTOCOL);
				}

				if (LoginState.SET_SERVER_PROTOCOL == FloorOverlayDefinition.loginState && var1.available() >= packetWriter.serverPacketLength) {
					var1.read(var2.array, 0, 1);
					var2.offset = 0;
					if (var2.method10060()) {
						var1.read(var2.array, 1, 1);
						var2.offset = 0;
					}

					ServerPacket[] var33 = Language.ServerPacket_values();
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
						Client var34 = NpcOverrides.client;
						JSObject.getWindow(var34).call("zap", (Object[])null);
					} catch (Throwable var14) {
					}

					ViewportMouse.updateLoginState(LoginState.UPDATE_PLAYER_AND_LOAD_REGIONS);
				}

				if (LoginState.UPDATE_PLAYER_AND_LOAD_REGIONS == FloorOverlayDefinition.loginState) {
					if (var1.available() >= packetWriter.serverPacketLength) {
						var2.offset = 0;
						var1.read(var2.array, 0, packetWriter.serverPacketLength);
						timer.method8789();
						class135.method3320();
						playerUpdateManager.updatePlayer(var2);
						HttpResponse.entity = AsyncHttpResponse.localPlayer;
						class217.field2364 = -1;
						class430.loadRegions(false, var2);
						packetWriter.serverPacket = null;
						field521 = false;
					}

				} else {
					if (LoginState.UNMAPPED_17 == FloorOverlayDefinition.loginState && var1.available() >= 2) {
						var2.offset = 0;
						var1.read(var2.array, 0, 2);
						var2.offset = 0;
						class33.field166 = var2.readUnsignedShort();
						ViewportMouse.updateLoginState(LoginState.UNMAPPED_18);
					}

					if (FloorOverlayDefinition.loginState == LoginState.UNMAPPED_18 && var1.available() >= class33.field166) {
						var2.offset = 0;
						var1.read(var2.array, 0, class33.field166);
						var2.offset = 0;
						String var35 = var2.readStringCp1252NullTerminated();
						String var32 = var2.readStringCp1252NullTerminated();
						String var36 = var2.readStringCp1252NullTerminated();
						class106.setLoginResponseString(var35, var32, var36);
						class31.updateGameState(10);
						if (field691.method10412()) {
							class329.updateLoginIndex(9);
						}
					}

					if (LoginState.UNMAPPED_19 == FloorOverlayDefinition.loginState) {
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
							timer.method8787();
							SecureUrlRequester.method3187();
							playerUpdateManager.updatePlayer(var2);
							if (var12 != var2.offset) {
								throw new RuntimeException();
							}
						}
					} else {
						++field548;
						if (field548 > 2000) {
							if (field696 < 1) {
								if (class150.worldPort == class372.currentPort) {
									class372.currentPort = InvDefinition.js5Port;
								} else {
									class372.currentPort = class150.worldPort;
								}

								++field696;
								ViewportMouse.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
							} else {
								WorldMapLabelSize.getLoginError(-3);
							}
						}
					}
				}
			}
		} catch (IOException var22) {
			if (field696 < 1) {
				if (class150.worldPort == class372.currentPort) {
					class372.currentPort = InvDefinition.js5Port;
				} else {
					class372.currentPort = class150.worldPort;
				}

				++field696;
				ViewportMouse.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
			} else {
				WorldMapLabelSize.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1976561956"
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
			PcmPlayer.method773();
		} else {
			if (!isMenuOpen) {
				HttpRequestTask.addCancelMenuEntry();
			}

			this.method1423();
			if (gameState == 30) {
				PacketBufferNode var1;
				int var2;
				while (class136.method3321()) {
					var1 = Message.getPacketBufferNode(ClientPacket.REFLECTION_CHECK_REPLY, packetWriter.isaacCipher);
					var1.packetBuffer.writeByte(0);
					var2 = var1.packetBuffer.offset;
					UserComparator4.performReflectionCheck(var1.packetBuffer);
					var1.packetBuffer.writeLengthByte(var1.packetBuffer.offset - var2);
					packetWriter.addNode(var1);
				}

				if (timer.field4917) {
					var1 = Message.getPacketBufferNode(ClientPacket.LOGIN_TIMINGS, packetWriter.isaacCipher);
					var1.packetBuffer.writeByte(0);
					var2 = var1.packetBuffer.offset;
					timer.write(var1.packetBuffer);
					var1.packetBuffer.writeLengthByte(var1.packetBuffer.offset - var2);
					packetWriter.addNode(var1);
					timer.method8786();
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
				synchronized(class190.mouseRecorder.lock) {
					if (!field522) {
						class190.mouseRecorder.index = 0;
					} else if (MouseHandler.MouseHandler_lastButton != 0 || class190.mouseRecorder.index >= 40) {
						PacketBufferNode var16 = null;
						var3 = 0;
						var4 = 0;
						var5 = 0;
						var6 = 0;

						for (var7 = 0; var7 < class190.mouseRecorder.index && (var16 == null || var16.packetBuffer.offset - var3 < 246); ++var7) {
							var4 = var7;
							var8 = class190.mouseRecorder.ys[var7];
							if (var8 < -1) {
								var8 = -1;
							} else if (var8 > 65534) {
								var8 = 65534;
							}

							var9 = class190.mouseRecorder.xs[var7];
							if (var9 < -1) {
								var9 = -1;
							} else if (var9 > 65534) {
								var9 = 65534;
							}

							if (var9 != field528 || var8 != field529) {
								if (var16 == null) {
									var16 = Message.getPacketBufferNode(ClientPacket.MOUSE_MOVE, packetWriter.isaacCipher);
									var16.packetBuffer.writeByte(0);
									var3 = var16.packetBuffer.offset;
									var10000 = var16.packetBuffer;
									var10000.offset += 2;
									var5 = 0;
									var6 = 0;
								}

								if (-1L != field530) {
									var10 = var9 - field528;
									var11 = var8 - field529;
									var12 = (int)((class190.mouseRecorder.millis[var7] - field530) / 20L);
									var5 = (int)((long)var5 + (class190.mouseRecorder.millis[var7] - field530) % 20L);
								} else {
									var10 = var9;
									var11 = var8;
									var12 = Integer.MAX_VALUE;
								}

								field528 = var9;
								field529 = var8;
								if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
									var10 += 32;
									var11 += 32;
									var16.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6));
								} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
									var10 += 128;
									var11 += 128;
									var16.packetBuffer.writeByte(var12 + 128);
									var16.packetBuffer.writeShort(var11 + (var10 << 8));
								} else if (var12 < 32) {
									var16.packetBuffer.writeByte(var12 + 192);
									if (var9 != -1 && var8 != -1) {
										var16.packetBuffer.writeInt(var9 | var8 << 16);
									} else {
										var16.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								} else {
									var16.packetBuffer.writeShort((var12 & 8191) + 57344);
									if (var9 != -1 && var8 != -1) {
										var16.packetBuffer.writeInt(var9 | var8 << 16);
									} else {
										var16.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								}

								++var6;
								field530 = class190.mouseRecorder.millis[var7];
							}
						}

						if (var16 != null) {
							var16.packetBuffer.writeLengthByte(var16.packetBuffer.offset - var3);
							var7 = var16.packetBuffer.offset;
							var16.packetBuffer.offset = var3;
							var16.packetBuffer.writeByte(var5 / var6);
							var16.packetBuffer.writeByte(var5 % var6);
							var16.packetBuffer.offset = var7;
							packetWriter.addNode(var16);
						}

						if (var4 >= class190.mouseRecorder.index) {
							class190.mouseRecorder.index = 0;
						} else {
							MouseRecorder var62 = class190.mouseRecorder;
							var62.index -= var4;
							System.arraycopy(class190.mouseRecorder.xs, var4, class190.mouseRecorder.xs, 0, class190.mouseRecorder.index);
							System.arraycopy(class190.mouseRecorder.ys, var4, class190.mouseRecorder.ys, 0, class190.mouseRecorder.index);
							System.arraycopy(class190.mouseRecorder.millis, var4, class190.mouseRecorder.millis, 0, class190.mouseRecorder.index);
						}
					}
				}

				if (MouseHandler.MouseHandler_lastButton == 1 || !class160.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
					long var17 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis;
					if (var17 > 32767L) {
						var17 = 32767L;
					}

					mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis;
					var3 = MouseHandler.MouseHandler_lastPressedY;
					if (var3 < 0) {
						var3 = 0;
					} else if (var3 > class535.canvasHeight) {
						var3 = class535.canvasHeight;
					}

					var4 = MouseHandler.MouseHandler_lastPressedX;
					if (var4 < 0) {
						var4 = 0;
					} else if (var4 > class329.canvasWidth) {
						var4 = class329.canvasWidth;
					}

					var5 = (int)var17;
					PacketBufferNode var19 = Message.getPacketBufferNode(ClientPacket.EVENT_MOUSE_CLICK, packetWriter.isaacCipher);
					var19.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1));
					var19.packetBuffer.writeShort(var4);
					var19.packetBuffer.writeShort(var3);
					packetWriter.addNode(var19);
				}

				if (mouseWheelRotation != 0) {
					var1 = Message.getPacketBufferNode(ClientPacket.MOUSE_WHEEL, packetWriter.isaacCipher);
					var1.packetBuffer.writeShort(mouseWheelRotation);
					packetWriter.addNode(var1);
				}

				if (indexCheck.field2997 > 0) {
					var1 = Message.getPacketBufferNode(ClientPacket.EVENT_KEYBOARD, packetWriter.isaacCipher);
					var1.packetBuffer.writeShort(0);
					var2 = var1.packetBuffer.offset;
					long var20 = class59.method1150();

					for (var5 = 0; var5 < indexCheck.field2997; ++var5) {
						long var22 = var20 - field746;
						if (var22 > 16777215L) {
							var22 = 16777215L;
						}

						field746 = var20;
						var1.packetBuffer.writeByte(indexCheck.field2996[var5]);
						var1.packetBuffer.writeMedium((int)var22);
					}

					var1.packetBuffer.writeLengthShort(var1.packetBuffer.offset - var2);
					packetWriter.addNode(var1);
				}

				if (field613 > 0) {
					--field613;
				}

				if (indexCheck.isValidIndexInRange(96) || indexCheck.isValidIndexInRange(97) || indexCheck.isValidIndexInRange(98) || indexCheck.isValidIndexInRange(99)) {
					field524 = true;
				}

				if (field524 && field613 <= 0) {
					field613 = 20;
					field524 = false;
					var1 = Message.getPacketBufferNode(ClientPacket.EVENT_CAMERA_POSITION, packetWriter.isaacCipher);
					var1.packetBuffer.writeShortAddLE(camAngleY);
					var1.packetBuffer.writeShort(camAngleX);
					packetWriter.addNode(var1);
				}

				if (class289.hasFocus && !hadFocus) {
					hadFocus = true;
					var1 = Message.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
					var1.packetBuffer.writeByte(1);
					packetWriter.addNode(var1);
				}

				if (!class289.hasFocus && hadFocus) {
					hadFocus = false;
					var1 = Message.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
					var1.packetBuffer.writeByte(0);
					packetWriter.addNode(var1);
				}

				if (class158.worldMap != null) {
					class158.worldMap.method9528();
				}

				Iterator var36;
				WorldView var43;
				if (TransformationMatrix.ClanChat_inClanChat) {
					if (class178.friendsChat != null) {
						class178.friendsChat.sort();
					}

					var36 = worldViewManager.iterator();

					while (var36.hasNext()) {
						var43 = (WorldView)var36.next();

						for (var3 = 0; var3 < playerUpdateManager.playerCount; ++var3) {
							Player var24 = HttpRequest.topLevelWorldView.players[playerUpdateManager.playerIndices[var3]];
							if (var24 != null) {
								var24.clearIsInFriendsChat();
							}
						}
					}

					TransformationMatrix.ClanChat_inClanChat = false;
				}

				if (Calendar.field4031) {
					GrandExchangeEvent.method7729();
					Calendar.field4031 = false;
				}

				int var25;
				if (field700 != HttpRequest.topLevelWorldView.plane) {
					field700 = HttpRequest.topLevelWorldView.plane;
					var25 = HttpRequest.topLevelWorldView.plane;
					int[] var44 = VerticalAlignment.sceneMinimapSprite.pixels;
					var3 = var44.length;

					for (var4 = 0; var4 < var3; ++var4) {
						var44[var4] = 0;
					}

					for (var4 = 1; var4 < 103; ++var4) {
						var5 = (103 - var4) * 2048 + 24628;

						for (var6 = 1; var6 < 103; ++var6) {
							if ((HttpRequest.topLevelWorldView.tileSettings[var25][var6][var4] & 24) == 0) {
								HttpRequest.topLevelWorldView.scene.drawTileMinimap(var44, var5, 512, var25, var6, var4);
							}

							if (var25 < 3 && (HttpRequest.topLevelWorldView.tileSettings[var25 + 1][var6][var4] & 8) != 0) {
								HttpRequest.topLevelWorldView.scene.drawTileMinimap(var44, var5, 512, var25 + 1, var6, var4);
							}

							var5 += 4;
						}
					}

					var4 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
					var5 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
					VerticalAlignment.sceneMinimapSprite.setRaster();

					for (var6 = 1; var6 < 103; ++var6) {
						for (var7 = 1; var7 < 103; ++var7) {
							if ((HttpRequest.topLevelWorldView.tileSettings[var25][var7][var6] & 24) == 0) {
								class421.drawObject(var25, var7, var6, var4, var5);
							}

							if (var25 < 3 && (HttpRequest.topLevelWorldView.tileSettings[var25 + 1][var7][var6] & 8) != 0) {
								class421.drawObject(var25 + 1, var7, var6, var4, var5);
							}
						}
					}

					mapIconCount = 0;

					for (var6 = 0; var6 < 104; ++var6) {
						for (var7 = 0; var7 < 104; ++var7) {
							long var26 = HttpRequest.topLevelWorldView.scene.getFloorDecorationTag(HttpRequest.topLevelWorldView.plane, var6, var7);
							if (0L != var26) {
								var10 = class137.Entity_unpackID(var26);
								var11 = HttpMethod.getObjectDefinition(var10).mapIconId;
								if (var11 >= 0 && Tiles.WorldMapElement_get(var11).field1894) {
									mapIcons[mapIconCount] = Tiles.WorldMapElement_get(var11).getSpriteBool(false);
									mapIconXs[mapIconCount] = var6;
									mapIconYs[mapIconCount] = var7;
									++mapIconCount;
								}
							}
						}
					}

					class154.rasterProvider.apply();
				}

				if (gameState == 30) {
					var36 = worldViewManager.iterator();

					while (var36.hasNext()) {
						var43 = (WorldView)var36.next();

						for (PendingSpawn var28 = (PendingSpawn)var43.pendingSpawns.last(); var28 != null; var28 = (PendingSpawn)var43.pendingSpawns.previous()) {
							if (var28.hitpoints > 0) {
								--var28.hitpoints;
							}

							if (var28.hitpoints == 0) {
								if (var28.objectId < 0 || EnumComposition.method3880(var28.objectId, var28.field1185)) {
									Language.addPendingSpawnToScene(var43, var28.plane, var28.type, var28.x, var28.y, var28.objectId, var28.field1184, var28.field1185, var28.field1189);
									var28.remove();
								}
							} else {
								if (var28.delay > 0) {
									--var28.delay;
								}

								if (var28.delay == 0 && var28.x >= 1 && var28.y >= 1 && var28.x <= 102 && var28.y <= 102 && (var28.field1191 < 0 || EnumComposition.method3880(var28.field1191, var28.field1182))) {
									Language.addPendingSpawnToScene(var43, var28.plane, var28.type, var28.x, var28.y, var28.field1191, var28.field1187, var28.field1182, var28.field1189);
									var28.delay = -1;
									if (var28.field1191 == var28.objectId && var28.objectId == -1) {
										var28.remove();
									} else if (var28.field1191 == var28.objectId && var28.field1187 == var28.field1184 && var28.field1182 == var28.field1185) {
										var28.remove();
									}
								}
							}
						}
					}

					int var10002;
					for (var25 = 0; var25 < soundEffectCount; ++var25) {
						var10002 = queuedSoundEffectDelays[var25]--;
						if (queuedSoundEffectDelays[var25] >= -10) {
							SoundEffect var45 = soundEffects[var25];
							if (var45 == null) {
								var10000 = null;
								var45 = SoundEffect.readSoundEffect(GraphicsObject.soundEffectsArchive, soundEffectIds[var25], 0);
								if (var45 == null) {
									continue;
								}

								int[] var63 = queuedSoundEffectDelays;
								var63[var25] += var45.calculateDelay();
								soundEffects[var25] = var45;
							}

							if (queuedSoundEffectDelays[var25] < 0) {
								if (soundLocations[var25] != 0) {
									var4 = (soundLocations[var25] & 255) * 128;
									var5 = soundLocations[var25] >> 16 & 255;
									var6 = Math.abs(Coord.method6843(var5) - AsyncHttpResponse.localPlayer.x);
									var7 = soundLocations[var25] >> 8 & 255;
									var8 = Math.abs(Coord.method6843(var7) - AsyncHttpResponse.localPlayer.y);
									var9 = Math.max(var6 + var8 - 128, 0);
									var10 = Math.max(((field763[var25] & 31) - 1) * 128, 0);
									if (var9 >= var4) {
										queuedSoundEffectDelays[var25] = -100;
										continue;
									}

									float var42 = var10 < var4 ? Math.min(Math.max((float)(var4 - var9) / (float)(var4 - var10), 0.0F), 1.0F) : 1.0F;
									var3 = (int)(var42 * (float)SecureUrlRequester.clientPreferences.getAreaSoundEffectsVolume());
								} else {
									var3 = SecureUrlRequester.clientPreferences.getSoundEffectsVolume();
								}

								if (var3 > 0) {
									RawSound var52 = var45.toRawSound().resample(SongTask.decimator);
									RawPcmStream var29 = RawPcmStream.createRawPcmStream(var52, 100, var3);
									var29.setNumLoops(queuedSoundEffectLoops[var25] - 1);
									class53.pcmStreamMixer.addSubStream(var29);
								}

								queuedSoundEffectDelays[var25] = -100;
							}
						} else {
							--soundEffectCount;

							for (var2 = var25; var2 < soundEffectCount; ++var2) {
								soundEffectIds[var2] = soundEffectIds[var2 + 1];
								soundEffects[var2] = soundEffects[var2 + 1];
								queuedSoundEffectLoops[var2] = queuedSoundEffectLoops[var2 + 1];
								queuedSoundEffectDelays[var2] = queuedSoundEffectDelays[var2 + 1];
								soundLocations[var2] = soundLocations[var2 + 1];
								field763[var2] = field763[var2 + 1];
							}

							--var25;
						}
					}

					if (playingJingle && !ScriptFrame.method1170()) {
						if (SecureUrlRequester.clientPreferences.getMusicVolume() != 0 && class443.method8679()) {
							WorldMapSection0.method6185(FontName.archive6, SecureUrlRequester.clientPreferences.getMusicVolume());
						}

						playingJingle = false;
					}

					++packetWriter.field1455;
					if (packetWriter.field1455 > 750) {
						PcmPlayer.method773();
					} else {
						Varps.method6801();
						class374.method7462();
						var36 = worldViewManager.iterator();

						while (var36.hasNext()) {
							var43 = (WorldView)var36.next();

							for (var3 = 0; var3 < var43.worldEntityCount; ++var3) {
								var4 = var43.worldEntityIndices[var3];
								WorldEntity var56 = var43.worldEntities[var4];
								if (var56 != null) {
									var56.method9149(cycle);
								}
							}
						}

						class298.method6238();
						++graphicsCycle;
						if (mouseCrossColor != 0) {
							mouseCrossState = mouseCrossState * 400 + 20;
							if (mouseCrossState * 400 >= 400) {
								mouseCrossColor = 0;
							}
						}

						Widget var37 = PcmPlayer.mousedOverWidgetIf1;
						Widget var48 = SongTask.field4882;
						PcmPlayer.mousedOverWidgetIf1 = null;
						SongTask.field4882 = null;
						draggedOnWidget = null;
						field749 = false;
						field690 = false;
						field743 = 0;

						Iterator var57;
						while (indexCheck.method5597() && field743 < 128) {
							if (staffModLevel >= 2 && indexCheck.isValidIndexInRange(82) && indexCheck.field3007 == 66) {
								StringBuilder var53 = new StringBuilder();

								Message var46;
								for (var57 = Messages.Messages_hashTable.iterator(); var57.hasNext(); var53.append(var46.text).append('\n')) {
									var46 = (Message)var57.next();
									if (var46.sender != null && !var46.sender.isEmpty()) {
										var53.append(var46.sender).append(':');
									}
								}

								String var55 = var53.toString();
								NpcOverrides.client.method469(var55);
							} else if (oculusOrbState != 1 || indexCheck.field3006 <= 0) {
								field745[field743] = indexCheck.field3007;
								field744[field743] = indexCheck.field3006;
								++field743;
							}
						}

						boolean var38 = staffModLevel >= 2;
						if (var38 && indexCheck.isValidIndexInRange(82) && indexCheck.isValidIndexInRange(81) && mouseWheelRotation != 0) {
							var4 = AsyncHttpResponse.localPlayer.plane - mouseWheelRotation;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > 3) {
								var4 = 3;
							}

							if (var4 != AsyncHttpResponse.localPlayer.plane) {
								UserComparator9.method3238(AsyncHttpResponse.localPlayer.pathX[0] + HttpRequest.topLevelWorldView.baseX, AsyncHttpResponse.localPlayer.pathY[0] + HttpRequest.topLevelWorldView.baseY, var4, false);
							}

							mouseWheelRotation = 0;
						}

						if (rootInterface != -1) {
							class7.updateRootInterface(rootInterface, 0, 0, class329.canvasWidth, class535.canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							Widget var47;
							ScriptEvent var54;
							Widget var58;
							do {
								var54 = (ScriptEvent)scriptEvents2.removeLast();
								if (var54 == null) {
									while (true) {
										do {
											var54 = (ScriptEvent)scriptEvents3.removeLast();
											if (var54 == null) {
												while (true) {
													do {
														var54 = (ScriptEvent)scriptEvents.removeLast();
														if (var54 == null) {
															boolean var39 = false;

															while (true) {
																class268 var61 = (class268)field719.removeLast();
																PacketBufferNode var30;
																if (var61 == null) {
																	if (!var39 && MouseHandler.MouseHandler_lastButton == 1) {
																		field816.method5556();
																	}

																	this.menu();
																	class499.method9354();
																	if (clickedWidget != null) {
																		this.method1360();
																	}

																	var57 = worldViewManager.iterator();

																	while (var57.hasNext()) {
																		WorldView var51 = (WorldView)var57.next();
																		Scene var59 = var51.scene;
																		if (var59.shouldSendWalk()) {
																			var8 = var59.baseX;
																			var9 = var59.baseY;
																			PacketBufferNode var31 = Message.getPacketBufferNode(ClientPacket.MOVE_GAMECLICK, packetWriter.isaacCipher);
																			var31.packetBuffer.writeByte(5);
																			var31.packetBuffer.writeShortAddLE(var9 + var51.baseY);
																			var31.packetBuffer.writeShortAdd(var8 + var51.baseX);
																			var31.packetBuffer.writeByte(indexCheck.isValidIndexInRange(82) ? (indexCheck.isValidIndexInRange(81) ? 2 : 1) : 0);
																			packetWriter.addNode(var31);
																			mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																			mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																			mouseCrossColor = 1;
																			mouseCrossState = 0;
																			destinationX = var8;
																			destinationY = var9;
																			var59.method5037();
																		}
																	}

																	if (var37 != PcmPlayer.mousedOverWidgetIf1) {
																		if (var37 != null) {
																			class178.invalidateWidget(var37);
																		}

																		if (PcmPlayer.mousedOverWidgetIf1 != null) {
																			class178.invalidateWidget(PcmPlayer.mousedOverWidgetIf1);
																		}
																	}

																	if (var48 != SongTask.field4882 && field664 == field514) {
																		if (var48 != null) {
																			class178.invalidateWidget(var48);
																		}

																		if (SongTask.field4882 != null) {
																			class178.invalidateWidget(SongTask.field4882);
																		}
																	}

																	if (SongTask.field4882 != null) {
																		if (field664 < field514) {
																			++field664;
																			if (field514 == field664) {
																				class178.invalidateWidget(SongTask.field4882);
																			}
																		}
																	} else if (field664 > 0) {
																		--field664;
																	}

																	if (oculusOrbState == 0) {
																		var5 = HttpResponse.entity.getX();
																		var6 = HttpResponse.entity.getY();
																		if (field642 != -1) {
																			Player var60 = AsyncHttpResponse.localPlayer.worldView.players[field642];
																			if (var60 != null) {
																				Coord var32 = var60.method2653(AsyncHttpResponse.localPlayer.worldView);
																				var5 = var32.x;
																				var6 = var32.y;
																			}
																		}

																		var7 = HttpResponse.entity.getPlane();
																		if (class443.oculusOrbFocalPointX - var5 < -500 || class443.oculusOrbFocalPointX - var5 > 500 || AsyncRestClient.oculusOrbFocalPointY - var6 < -500 || AsyncRestClient.oculusOrbFocalPointY - var6 > 500) {
																			class443.oculusOrbFocalPointX = var5;
																			AsyncRestClient.oculusOrbFocalPointY = var6;
																		}

																		if (var5 != class443.oculusOrbFocalPointX) {
																			class443.oculusOrbFocalPointX += (var5 - class443.oculusOrbFocalPointX) / 16;
																		}

																		if (var6 != AsyncRestClient.oculusOrbFocalPointY) {
																			AsyncRestClient.oculusOrbFocalPointY += (var6 - AsyncRestClient.oculusOrbFocalPointY) / 16;
																		}

																		var8 = class443.oculusOrbFocalPointX >> 7;
																		var9 = AsyncRestClient.oculusOrbFocalPointY >> 7;
																		var10 = class77.getTileHeight(HttpRequest.topLevelWorldView, class443.oculusOrbFocalPointX, AsyncRestClient.oculusOrbFocalPointY, var7);
																		var11 = 0;
																		if (var8 > 3 && var9 > 3 && var8 < 100 && var9 < 100) {
																			for (var12 = var8 - 4; var12 <= var8 + 4; ++var12) {
																				for (int var33 = var9 - 4; var33 <= var9 + 4; ++var33) {
																					int var14 = var7;
																					if (var7 < 3 && (HttpRequest.topLevelWorldView.tileSettings[1][var12][var33] & 2) == 2) {
																						var14 = var7 + 1;
																					}

																					int var15 = var10 - HttpRequest.topLevelWorldView.tileHeights[var14][var12][var33];
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

																		if (var12 > field678) {
																			field678 += (var12 - field678) / 24;
																		} else if (var12 < field678) {
																			field678 += (var12 - field678) / 80;
																		}

																		UserComparator8.oculusOrbFocalPointZ = class77.getTileHeight(HttpRequest.topLevelWorldView, var5, var6, var7) - camFollowHeight;
																	} else if (oculusOrbState == 1) {
																		if (field612 && AsyncHttpResponse.localPlayer != null) {
																			var5 = AsyncHttpResponse.localPlayer.pathX[0];
																			var6 = AsyncHttpResponse.localPlayer.pathY[0];
																			if (var5 >= 0 && 104 > var5 && var6 >= 0 && 104 > var6) {
																				class443.oculusOrbFocalPointX = AsyncHttpResponse.localPlayer.x;
																				var7 = class77.getTileHeight(HttpRequest.topLevelWorldView, AsyncHttpResponse.localPlayer.x, AsyncHttpResponse.localPlayer.y, HttpRequest.topLevelWorldView.plane) - camFollowHeight;
																				if (var7 < UserComparator8.oculusOrbFocalPointZ) {
																					UserComparator8.oculusOrbFocalPointZ = var7;
																				}

																				AsyncRestClient.oculusOrbFocalPointY = AsyncHttpResponse.localPlayer.y;
																				field612 = false;
																			}
																		}

																		short var40 = -1;
																		if (indexCheck.isValidIndexInRange(33)) {
																			var40 = 0;
																		} else if (indexCheck.isValidIndexInRange(49)) {
																			var40 = 1024;
																		}

																		if (indexCheck.isValidIndexInRange(48)) {
																			if (var40 == 0) {
																				var40 = 1792;
																			} else if (var40 == 1024) {
																				var40 = 1280;
																			} else {
																				var40 = 1536;
																			}
																		} else if (indexCheck.isValidIndexInRange(50)) {
																			if (var40 == 0) {
																				var40 = 256;
																			} else if (var40 == 1024) {
																				var40 = 768;
																			} else {
																				var40 = 512;
																			}
																		}

																		byte var41 = 0;
																		if (indexCheck.isValidIndexInRange(35)) {
																			var41 = -1;
																		} else if (indexCheck.isValidIndexInRange(51)) {
																			var41 = 1;
																		}

																		var7 = 0;
																		if (var40 >= 0 || var41 != 0) {
																			var7 = indexCheck.isValidIndexInRange(81) ? oculusOrbSlowedSpeed : oculusOrbNormalSpeed;
																			var7 *= 16;
																			field758 = var40;
																			field608 = var41;
																		}

																		if (field610 < var7) {
																			field610 += var7 / 8;
																			if (field610 > var7) {
																				field610 = var7;
																			}
																		} else if (field610 > var7) {
																			field610 = field610 * 9 / 10;
																		}

																		if (field610 > 0) {
																			var8 = field610 / 16;
																			if (field758 >= 0) {
																				var5 = field758 - ReflectionCheck.cameraYaw & 2047;
																				var9 = Rasterizer3D.Rasterizer3D_sine[var5];
																				var10 = Rasterizer3D.Rasterizer3D_cosine[var5];
																				class443.oculusOrbFocalPointX += var9 * var8 / 65536;
																				AsyncRestClient.oculusOrbFocalPointY += var10 * var8 / 65536;
																			}

																			if (field608 != 0) {
																				UserComparator8.oculusOrbFocalPointZ += var8 * field608;
																				if (UserComparator8.oculusOrbFocalPointZ > 0) {
																					UserComparator8.oculusOrbFocalPointZ = 0;
																				}
																			}
																		} else {
																			field758 = -1;
																			field608 = -1;
																		}

																		if (indexCheck.isValidIndexInRange(13)) {
																			packetWriter.addNode(Message.getPacketBufferNode(ClientPacket.field3387, packetWriter.isaacCipher));
																			oculusOrbState = 0;
																		}
																	}

																	if (MouseHandler.MouseHandler_currentButton == 4 && class160.mouseCam) {
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

																	if (field773) {
																		class483.method9204();
																	} else if (isCameraLocked) {
																		class36.method683();
																	}

																	for (var5 = 0; var5 < 5; ++var5) {
																		var10002 = field738[var5]++;
																	}

																	HttpRequestTask.varcs.tryWrite();
																	var5 = ClientPreferences.method2745();
																	var6 = VarbitComposition.method4029();
																	if (var5 > 15000 && var6 > 15000) {
																		logoutTimer = 250;
																		MouseHandler.MouseHandler_idleCycles = 14500;
																		var30 = Message.getPacketBufferNode(ClientPacket.EVENT_MOUSE_IDLE, packetWriter.isaacCipher);
																		packetWriter.addNode(var30);
																	}

																	InterfaceParent.friendSystem.processFriendUpdates();

																	for (var7 = 0; var7 < field803.size(); ++var7) {
																		if (class150.method3462((Integer)field803.get(var7)) != 2) {
																			field803.remove(var7);
																			--var7;
																		}
																	}

																	++packetWriter.pendingWrites;
																	if (packetWriter.pendingWrites > 50) {
																		var30 = Message.getPacketBufferNode(ClientPacket.NO_TIMEOUT, packetWriter.isaacCipher);
																		packetWriter.addNode(var30);
																	}

																	try {
																		packetWriter.flush();
																	} catch (IOException var34) {
																		PcmPlayer.method773();
																	}

																	Actor.method2671().method4479();
																	return;
																}

																if (var61.field2988.type == 12) {
																	var39 = true;
																}

																if (var61 != null && var61.field2988 != null) {
																	if (var61.field2988.childIndex >= 0) {
																		var47 = class379.widgetDefinition.method6875(var61.field2988.parentId);
																		if (var47 == null || var47.children == null || var47.children.length == 0 || var61.field2988.childIndex >= var47.children.length || var61.field2988 != var47.children[var61.field2988.childIndex]) {
																			continue;
																		}
																	}

																	if (var61.field2988.type == 11 && var61.field2983 == 0) {
																		if (var61.field2988.method7267(var61.field2985, var61.field2987, 0, 0)) {
																			var61.field2988.method7276().method4366().method4450(1, var61.field2988.method7276().method4343());
																			switch(var61.field2988.method7271()) {
																			case 0:
																				class445.openURL(var61.field2988.method7273(), true, false);
																				break;
																			case 1:
																				if (MusicSong.method6793(Renderable.getWidgetFlags(var61.field2988))) {
																					int[] var50 = var61.field2988.method7274();
																					if (var50 != null) {
																						var30 = Message.getPacketBufferNode(ClientPacket.IF_CRMVIEW, packetWriter.isaacCipher);
																						var30.packetBuffer.writeIntIME(var50[0]);
																						var30.packetBuffer.writeShortAddLE(var61.field2988.childIndex);
																						var30.packetBuffer.writeIntIME(var61.field2988.id);
																						var30.packetBuffer.writeIntME(var50[2]);
																						var30.packetBuffer.writeIntIME(var50[1]);
																						var30.packetBuffer.writeIntME(var61.field2988.method7282());
																						packetWriter.addNode(var30);
																					}
																				}
																			}
																		}
																	} else if (var61.field2988.type == 12) {
																		class359 var49 = var61.field2988.method7284();
																		if (var49 != null && var49.method7139()) {
																			switch(var61.field2983) {
																			case 0:
																				field816.method5541(var61.field2988);
																				var49.method7057(true);
																				var49.method7029(var61.field2985, var61.field2987, indexCheck.isValidIndexInRange(82), indexCheck.isValidIndexInRange(81));
																				break;
																			case 1:
																				var49.method7019(var61.field2985, var61.field2987);
																			}
																		}
																	}
																}
															}
														}

														var58 = var54.widget;
														if (var58.childIndex < 0) {
															break;
														}

														var47 = class379.widgetDefinition.method6875(var58.parentId);
													} while(var47 == null || var47.children == null || var58.childIndex >= var47.children.length || var58 != var47.children[var58.childIndex]);

													WorldMapEvent.runScriptEvent(var54);
												}
											}

											var58 = var54.widget;
											if (var58.childIndex < 0) {
												break;
											}

											var47 = class379.widgetDefinition.method6875(var58.parentId);
										} while(var47 == null || var47.children == null || var58.childIndex >= var47.children.length || var58 != var47.children[var58.childIndex]);

										WorldMapEvent.runScriptEvent(var54);
									}
								}

								var58 = var54.widget;
								if (var58.childIndex < 0) {
									break;
								}

								var47 = class379.widgetDefinition.method6875(var58.parentId);
							} while(var47 == null || var47.children == null || var58.childIndex >= var47.children.length || var58 != var47.children[var58.childIndex]);

							WorldMapEvent.runScriptEvent(var54);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1285648687"
	)
	public void vmethod6746(int var1, int var2) {
		if (packetWriter != null && packetWriter.isaacCipher != null) {
			if (var1 > -1 && SecureUrlRequester.clientPreferences.getMusicVolume() > 0 && !playingJingle) {
				PacketBufferNode var3 = Message.getPacketBufferNode(ClientPacket.MUSIC_PLAYING, packetWriter.isaacCipher);
				var3.packetBuffer.writeInt(var1);
				packetWriter.addNode(var3);
			}

		}
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2146908769"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = class329.canvasWidth;
		int var2 = class535.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}

		if (SecureUrlRequester.clientPreferences != null) {
			try {
				class26.method360(NpcOverrides.client, "resize", new Object[]{class93.getWindowedMode()});
			} catch (Throwable var4) {
			}
		}

	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2026069817"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		int var1;
		if (rootInterface != -1) {
			var1 = rootInterface;
			if (class379.widgetDefinition.loadInterface(var1)) {
				UrlRequester.drawModelComponents(class379.widgetDefinition.Widget_interfaceComponents[var1], -1);
			}
		}

		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (validRootWidgets[var1]) {
				field724[var1] = true;
			}

			field693[var1] = validRootWidgets[var1];
			validRootWidgets[var1] = false;
		}

		field722 = cycle;
		viewportX = -1;
		viewportY = -1;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			Widget.drawWidgets(rootInterface, 0, 0, class329.canvasWidth, class535.canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				class381.crossSprites[mouseCrossState * 400 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				class381.crossSprites[mouseCrossState * 400 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}

		if (!isMenuOpen) {
			if (viewportX != -1) {
				var1 = viewportX;
				int var2 = viewportY;
				if ((menu.menuOptionsCount >= 2 || isItemSelected != 0 || isSpellSelected) && showMouseOverText) {
					int var3 = class217.method4387();
					String var4;
					if (isItemSelected == 1 && menu.menuOptionsCount < 2) {
						var4 = "Use" + " " + field667 + " " + "->";
					} else if (isSpellSelected && menu.menuOptionsCount < 2) {
						var4 = selectedSpellActionName + " " + selectedSpellName + " " + "->";
					} else {
						var4 = menu.method10744(var3);
					}

					if (menu.menuOptionsCount > 2) {
						var4 = var4 + class438.colorStartTag(16777215) + " " + '/' + " " + (menu.menuOptionsCount - 2) + " more options";
					}

					PacketWriter.fontBold12.drawRandomAlphaAndSpacing(var4, var1 + 4, var2 + 15, 16777215, 0, cycle / 1000);
				}
			}
		} else {
			menu.method10742();
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field693[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field724[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		FontName.method9745(HttpRequest.topLevelWorldView.plane, AsyncHttpResponse.localPlayer.x, AsyncHttpResponse.localPlayer.y, graphicsCycle);
		graphicsCycle = 0;
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(Lei;I)Z",
		garbageValue = "-1051504103"
	)
	boolean method1425(PacketWriter var1) {
		if (var1.serverPacketLength == 0) {
			class178.friendsChat = null;
		} else {
			if (class178.friendsChat == null) {
				class178.friendsChat = new FriendsChat(class28.loginType, NpcOverrides.client);
			}

			class178.friendsChat.method8941(var1.packetBuffer);
		}

		class432.method8330();
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(Lei;I)Z",
		garbageValue = "-1395519291"
	)
	boolean method1262(PacketWriter var1) {
		if (class178.friendsChat != null) {
			class178.friendsChat.method8938(var1.packetBuffer);
		}

		class432.method8330();
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "33"
	)
	void method1423() {
		int var1 = 0;
		boolean var2 = packetWriter.field1454 > 0;

		for (int var3 = packetWriter.field1466; var1 < 100 || var2; var2 = packetWriter.field1454 > 0) {
			boolean var4 = this.method1434(packetWriter);
			if (var2) {
				int var5 = packetWriter.field1466 - var3;
				PacketWriter var10000 = packetWriter;
				var10000.field1454 -= var5;
			}

			if (!var4) {
				break;
			}

			++var1;
			var3 = packetWriter.field1466;
		}

	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(Lei;I)Z",
		garbageValue = "-1247208402"
	)
	@Export("method1434")
	final boolean method1434(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket();
		PacketBuffer var3 = var1.packetBuffer;
		if (var2 == null) {
			return false;
		} else {
			String var22;
			int var26;
			try {
				if (var1.field1454 > 0 && !var2.isAvailable(var1.field1454)) {
					return false;
				}

				int var5;
				if (var1.serverPacket == null) {
					if (var1.field1462) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var1.field1466 += var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1455 = 0;
						var1.field1462 = false;
					}

					var3.offset = 0;
					if (var3.method10060()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var1.field1466 += var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1455 = 0;
					}

					var1.field1462 = true;
					ServerPacket[] var4 = Language.ServerPacket_values();
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

					var1.field1466 += var2.read(var3.array, 0, 1);
					var1.serverPacketLength = var3.array[0] & 255;
				}

				if (var1.serverPacketLength == -2) {
					if (!var2.isAvailable(2)) {
						return false;
					}

					var1.field1466 += var2.read(var3.array, 0, 2);
					var3.offset = 0;
					var1.serverPacketLength = var3.readUnsignedShort();
				}

				if (!var2.isAvailable(var1.serverPacketLength)) {
					return false;
				}

				var3.offset = 0;
				var1.field1466 += var2.read(var3.array, 0, var1.serverPacketLength);
				var1.field1455 = 0;
				timer.method8792();
				var1.field1469 = var1.field1471;
				var1.field1471 = var1.field1467;
				var1.field1467 = var1.serverPacket;
				if (ServerPacket.CAM_MOVE_TO == var1.serverPacket) {
					isCameraLocked = true;
					field773 = false;
					field596 = false;
					class153.field1700 = var3.readUnsignedByte();
					PcmPlayer.field290 = var3.readUnsignedByte();
					WorldMapLabelSize.field3089 = var3.readUnsignedShort();
					class53.field357 = var3.readUnsignedByte();
					HttpRequest.field55 = var3.readUnsignedByte();
					if (HttpRequest.field55 >= 100) {
						class403.cameraX = Coord.method6843(class153.field1700);
						class328.cameraZ = Coord.method6843(PcmPlayer.field290);
						class166.cameraY = class77.getTileHeight(HttpRequest.topLevelWorldView, class403.cameraX, class328.cameraZ, HttpRequest.topLevelWorldView.plane) - WorldMapLabelSize.field3089;
					}

					var1.serverPacket = null;
					return true;
				}

				int var21;
				if (ServerPacket.CAM_SMOOTH_RESET == var1.serverPacket && isCameraLocked) {
					field773 = true;
					field512 = false;
					field596 = false;

					for (var21 = 0; var21 < 5; ++var21) {
						field774[var21] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OCULUS_SYNC == var1.serverPacket) {
					var21 = var3.readInt();
					if (var21 != revision) {
						revision = var21;
						class27.method382();
					}

					var1.serverPacket = null;
					return true;
				}

				int var15;
				int var16;
				String var23;
				byte var61;
				if (ServerPacket.MESSAGE_FRIENDS_CHAT == var1.serverPacket) {
					var61 = var3.readByte();
					var22 = var3.readStringCp1252NullTerminated();
					long var6 = (long)var3.readUnsignedShort();
					long var8 = (long)var3.readMedium();
					PlayerType var55 = (PlayerType)ScriptEvent.findEnumerated(ObjectComposition.PlayerType_values(), var3.readUnsignedByte());
					long var11 = (var6 << 32) + var8;
					boolean var58 = false;
					ClanChannel var14 = null;
					var14 = var61 >= 0 ? currentClanChannels[var61] : ObjectComposition.guestClanChannel;
					if (var14 == null) {
						var58 = true;
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var55.isUser && InterfaceParent.friendSystem.isIgnored(new Username(var22, class28.loginType))) {
									var58 = true;
								}
								break;
							}

							if (var11 == crossWorldMessageIds[var15]) {
								var58 = true;
								break;
							}

							++var15;
						}
					}

					if (!var58) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var11;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var23 = AbstractFont.escapeBrackets(class53.method1069(var3));
						var16 = var61 >= 0 ? 41 : 44;
						if (var55.modIcon != -1) {
							class417.addChatMessage(var16, class153.method3479(var55.modIcon) + var22, var23, var14.name);
						} else {
							class417.addChatMessage(var16, var22, var23, var14.name);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MINIMAP_TOGGLE == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_MODE == var1.serverPacket) {
					var21 = var3.readUnsignedByte();
					LoginPacket.method3448(var21);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RESET_ANIMS == var1.serverPacket) {
					for (var21 = 0; var21 < Projection.worldView.players.length; ++var21) {
						if (Projection.worldView.players[var21] != null) {
							Projection.worldView.players[var21].sequence = -1;
						}
					}

					for (var21 = 0; var21 < Projection.worldView.npcs.length; ++var21) {
						if (Projection.worldView.npcs[var21] != null) {
							Projection.worldView.npcs[var21].sequence = -1;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				boolean var52;
				String var67;
				if (ServerPacket.MESSAGE_GAME == var1.serverPacket) {
					var21 = var3.readUShortSmart();
					var52 = var3.readUnsignedByte() == 1;
					var67 = "";
					boolean var59 = false;
					if (var52) {
						var67 = var3.readStringCp1252NullTerminated();
						if (InterfaceParent.friendSystem.isIgnored(new Username(var67, class28.loginType))) {
							var59 = true;
						}
					}

					String var77 = var3.readStringCp1252NullTerminated();
					if (!var59) {
						class289.addGameMessage(var21, var67, var77);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3550 == var1.serverPacket) {
					ItemContainer.updateWorldEntitiesFromPacketBuffer(Projection.worldView, var3, 4);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_OPENTOP == var1.serverPacket) {
					var21 = var3.readUnsignedShortLE();
					if (var21 == 65535) {
						var21 = -1;
					}

					rootInterface = var21;
					this.method1268(false);
					class47.method866(var21);
					ArchiveDiskAction.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						validRootWidgets[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_UID192 == var1.serverPacket) {
					var3.offset += 28;
					if (var3.checkCrc()) {
						HttpResponse.method283(var3, var3.offset - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RESET_INTERACTION_MODE == var1.serverPacket) {
					var21 = var3.readShort();
					worldViewManager.method2598(var21);
					var1.serverPacket = null;
					return true;
				}

				Widget var64;
				if (ServerPacket.UPDATE_INV_CLEAR == var1.serverPacket) {
					var21 = var3.readUnsignedIntME();
					var64 = class379.widgetDefinition.method6875(var21);

					for (var26 = 0; var26 < var64.itemIds.length; ++var26) {
						var64.itemIds[var26] = -1;
						var64.itemIds[var26] = 0;
					}

					class178.invalidateWidget(var64);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_NORMAL == var1.serverPacket) {
					class430.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				Widget var24;
				String var47;
				if (ServerPacket.IF_SET_TEXT == var1.serverPacket) {
					var47 = var3.readStringCp1252NullTerminated();
					var5 = var3.readUnsignedIntME();
					var24 = class379.widgetDefinition.method6875(var5);
					if (!var47.equals(var24.text)) {
						var24.text = var47;
						class178.invalidateWidget(var24);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_REBOOT_TIMER == var1.serverPacket) {
					rebootTimer = var3.readUnsignedShort() * 30;
					field713 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				long var9;
				int var13;
				long var27;
				long var29;
				String var32;
				boolean var80;
				int var83;
				if (ServerPacket.MESSAGE_CLAN_CHANNEL_SYSTEM == var1.serverPacket) {
					var61 = var3.readByte();
					var27 = (long)var3.readUnsignedShort();
					var29 = (long)var3.readMedium();
					var9 = (var27 << 32) + var29;
					var80 = false;
					ClanChannel var56 = var61 >= 0 ? currentClanChannels[var61] : ObjectComposition.guestClanChannel;
					if (var56 == null) {
						var80 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) {
							if (var9 == crossWorldMessageIds[var13]) {
								var80 = true;
								break;
							}
						}
					}

					if (!var80) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var9;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var32 = class53.method1069(var3);
						var83 = var61 >= 0 ? 43 : 46;
						class417.addChatMessage(var83, "", var32, var56.name);
					}

					var1.serverPacket = null;
					return true;
				}

				long var85;
				if (ServerPacket.MESSAGE_PRIVATE == var1.serverPacket) {
					var47 = var3.readStringCp1252NullTerminated();
					var27 = var3.readLong();
					var29 = (long)var3.readUnsignedShort();
					var9 = (long)var3.readMedium();
					PlayerType var82 = (PlayerType)ScriptEvent.findEnumerated(ObjectComposition.PlayerType_values(), var3.readUnsignedByte());
					var85 = (var29 << 32) + var9;
					boolean var84 = false;

					for (var15 = 0; var15 < 100; ++var15) {
						if (var85 == crossWorldMessageIds[var15]) {
							var84 = true;
							break;
						}
					}

					if (var82.isUser && InterfaceParent.friendSystem.isIgnored(new Username(var47, class28.loginType))) {
						var84 = true;
					}

					if (!var84 && field635 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var85;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var23 = AbstractFont.escapeBrackets(class383.method7486(class53.method1069(var3)));
						if (var82.modIcon != -1) {
							class417.addChatMessage(9, class153.method3479(var82.modIcon) + var47, var23, GrandExchangeOffer.base37DecodeLong(var27));
						} else {
							class417.addChatMessage(9, var47, var23, GrandExchangeOffer.base37DecodeLong(var27));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				int var7;
				int var37;
				int var38;
				int var88;
				if (ServerPacket.UPDATE_INV_FULL == var1.serverPacket) {
					var21 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var21 < -70000) {
						var5 += 32768;
					}

					if (var21 >= 0) {
						var24 = class379.widgetDefinition.method6875(var21);
					} else {
						var24 = null;
					}

					if (var24 != null) {
						for (var7 = 0; var7 < var24.itemIds.length; ++var7) {
							var24.itemIds[var7] = 0;
							var24.itemQuantities[var7] = 0;
						}
					}

					class182.clearItemContainer(var5);
					var7 = var3.readUnsignedShort();

					for (var37 = 0; var37 < var7; ++var37) {
						var38 = var3.readUnsignedShortLE();
						var88 = var3.readUnsignedByte();
						if (var88 == 255) {
							var88 = var3.readInt();
						}

						if (var24 != null && var37 < var24.itemIds.length) {
							var24.itemIds[var37] = var38;
							var24.itemQuantities[var37] = var88;
						}

						class168.itemContainerSetItem(var5, var37, var38 - 1, var88);
					}

					if (var24 != null) {
						class178.invalidateWidget(var24);
					}

					FloorDecoration.method4686();
					changedItemContainers[++field701 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				Widget var40;
				if (ServerPacket.IF_SETOBJECT == var1.serverPacket) {
					var21 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedIntME();
					var26 = var3.readUnsignedShortAdd();
					if (var26 == 65535) {
						var26 = -1;
					}

					var40 = class379.widgetDefinition.method6875(var21);
					ItemComposition var75;
					if (!var40.isIf3) {
						if (var26 == -1) {
							var40.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var75 = WorldEntityCoord.ItemDefinition_get(var26).getCountObj(var5);
						var40.modelType = 4;
						var40.modelId = var26;
						var40.modelAngleX = var75.xan2d;
						var40.modelAngleY = var75.yan2d;
						var40.modelZoom = var75.zoom2d * 100 / var5;
						class178.invalidateWidget(var40);
					} else {
						var40.itemId = var26;
						var40.itemQuantity = var5;
						var75 = WorldEntityCoord.ItemDefinition_get(var26).getCountObj(var5);
						var40.modelAngleX = var75.xan2d;
						var40.modelAngleY = var75.yan2d;
						var40.modelAngleZ = var75.zan2d;
						var40.modelOffsetX = var75.offsetX2d;
						var40.modelOffsetY = var75.offsetY2d;
						var40.modelZoom = var75.zoom2d;
						if (var75.isStackable == 1) {
							var40.itemQuantityMode = 1;
						} else {
							var40.itemQuantityMode = 2;
						}

						if (var40.field3917 > 0) {
							var40.modelZoom = var40.modelZoom * 32 / var40.field3917;
						} else if (var40.rawWidth > 0) {
							var40.modelZoom = var40.modelZoom * 32 / var40.rawWidth;
						}

						class178.invalidateWidget(var40);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CLAN_CHANNEL_DELTA == var1.serverPacket) {
					field798 = cycleCntr;
					var61 = var3.readByte();
					class167 var71 = new class167(var3);
					ClanChannel var79;
					if (var61 >= 0) {
						var79 = currentClanChannels[var61];
					} else {
						var79 = ObjectComposition.guestClanChannel;
					}

					if (var79 == null) {
						this.method1272(var61);
						var1.serverPacket = null;
						return true;
					}

					if (var71.field1789 > var79.field1806) {
						this.method1272(var61);
						var1.serverPacket = null;
						return true;
					}

					if (var71.field1789 < var79.field1806) {
						var1.serverPacket = null;
						return true;
					}

					var71.method3639(var79);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETNPCHEAD == var1.serverPacket) {
					var21 = var3.readUnsignedShort();
					var5 = var3.readUnsignedIntME();
					var24 = class379.widgetDefinition.method6875(var5);
					if (var24.modelType != 2 || var21 != var24.modelId) {
						var24.modelType = 2;
						var24.modelId = var21;
						class178.invalidateWidget(var24);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_REGION == var1.serverPacket) {
					class430.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3572 == var1.serverPacket) {
					ItemContainer.updateWorldEntitiesFromPacketBuffer(Projection.worldView, var3, 3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SONG_STOP == var1.serverPacket) {
					var5 = var3.readUnsignedShort();
					var21 = var3.readUnsignedShortAdd();
					WorldMapSprite.method6235(var21, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_SPOTANIM == var1.serverPacket) {
					var21 = var3.readUnsignedShortLE();
					Player var72;
					if (var21 == localPlayerIndex) {
						var72 = AsyncHttpResponse.localPlayer;
					} else {
						var72 = Projection.worldView.players[var21];
					}

					var7 = var3.readUnsignedByteNeg();
					var26 = var3.readUnsignedIntLE();
					var5 = var3.readUnsignedShortAddLE();
					if (var72 != null) {
						var72.updateSpotAnimation(var7, var5, var26 >> 16, var26 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SONG == var1.serverPacket) {
					var26 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedShortAdd();
					var21 = var3.readUnsignedShortLE();
					var37 = var3.readUnsignedShortLE();
					var7 = var3.readUnsignedShortLE();
					if (var21 == 65535) {
						var21 = -1;
					}

					ArrayList var91 = new ArrayList();
					var91.add(var21);
					class278.playSong(var91, var5, var26, var7, var37);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SWAP == var1.serverPacket) {
					var7 = var3.readUnsignedShortAddLE();
					var21 = var3.readUnsignedShortAddLE();
					var26 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedShortLE();
					World.method1931(var21, var5, var26, var7);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_STOCKMARKET_SLOT == var1.serverPacket) {
					var21 = var3.readUnsignedByte();
					if (var3.readUnsignedByte() == 0) {
						grandExchangeOffers[var21] = new GrandExchangeOffer();
						var3.offset += 18;
					} else {
						--var3.offset;
						grandExchangeOffers[var21] = new GrandExchangeOffer(var3, false);
					}

					field769 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				boolean var86;
				if (ServerPacket.HEAT_MAP == var1.serverPacket) {
					var86 = var3.readBoolean();
					if (var86) {
						if (class506.field5147 == null) {
							class506.field5147 = new class402();
						}
					} else {
						class506.field5147 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_PRIVCHATMODE == var1.serverPacket) {
					AsyncHttpResponse.privateChatMode = Projectile.method2339(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OBJ_RESET_CUSTOMIZATION == var1.serverPacket) {
					class159.method3522(class323.field3427);
					var1.serverPacket = null;
					return true;
				}

				int var31;
				if (ServerPacket.GRAPHICSOBJECT_SPAWN == var1.serverPacket) {
					var88 = var3.readUnsignedByteAdd();
					var38 = var3.readUnsignedShortAdd();
					var31 = var3.readUnsignedShortLE();
					var26 = var3.method10184();
					var21 = var26 >> 16;
					var5 = var26 >> 8 & 255;
					var7 = var21 + (var26 >> 4 & 7);
					var37 = var5 + (var26 & 7);
					if (var7 >= 0 && var37 >= 0 && var7 < Projection.worldView.sizeX && var37 < Projection.worldView.sizeY) {
						var7 = Coord.method6843(var7);
						var37 = Coord.method6843(var37);
						GraphicsObject var12 = new GraphicsObject(var38, Projection.worldView.plane, var7, var37, class77.getTileHeight(Projection.worldView, var7, var37, Projection.worldView.plane) - var88, var31, cycle);
						Projection.worldView.graphicsObjects.addFirst(var12);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_STOP_TRANSIT == var1.serverPacket) {
					var21 = var3.readUnsignedShort();
					Script.method2357(var21);
					changedItemContainers[++field701 - 1 & 31] = var21 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MAP_PROJANIM == var1.serverPacket) {
					class159.method3522(class323.field3420);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_LOOKAT == var1.serverPacket) {
					isCameraLocked = true;
					field773 = false;
					field512 = true;
					var21 = CollisionMap.method5635(var3.readShort() & 2027);
					var5 = ClanChannelMember.method3474(var3.readShort() & 2027);
					var26 = var3.readUnsignedShort();
					var7 = var3.readUnsignedByte();
					field670 = new class520(SoundSystem.cameraPitch, var5, var26, var7);
					field771 = new class520(ReflectionCheck.cameraYaw, var21, var26, var7);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3551 == var1.serverPacket) {
					return this.method1425(var1);
				}

				boolean var42;
				int var96;
				if (ServerPacket.CAM_MOVETO_EASED_CIRCULAR == var1.serverPacket) {
					isCameraLocked = true;
					field773 = false;
					field596 = true;
					class153.field1700 = var3.readUnsignedByte();
					PcmPlayer.field290 = var3.readUnsignedByte();
					var21 = var3.readUnsignedShort();
					var5 = Coord.method6843(var3.readUnsignedByte());
					var26 = Coord.method6843(var3.readUnsignedByte());
					var7 = var3.readUnsignedShort();
					field575 = var3.readBoolean();
					var37 = var3.readUnsignedByte();
					var38 = Coord.method6843(class153.field1700);
					var88 = Coord.method6843(PcmPlayer.field290);
					var80 = false;
					var42 = false;
					if (field575) {
						var31 = class166.cameraY;
						var96 = class77.getTileHeight(HttpRequest.topLevelWorldView, var38, var88, HttpRequest.topLevelWorldView.plane) - var21;
					} else {
						var31 = class77.getTileHeight(HttpRequest.topLevelWorldView, class403.cameraX, class328.cameraZ, HttpRequest.topLevelWorldView.plane) - class166.cameraY;
						var96 = var21;
					}

					field770 = new class518(class403.cameraX, class328.cameraZ, var31, var38, var88, var96, var5, var26, var7, var37);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3564 == var1.serverPacket) {
					Language.field4683 = var3.readBoolean();
					var1.serverPacket = null;
					return true;
				}

				InterfaceParent var89;
				if (ServerPacket.IF_OPENSUB == var1.serverPacket) {
					var21 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedIntIME();
					var26 = var3.readUnsignedByteAdd();
					var89 = (InterfaceParent)interfaceParents.get((long)var5);
					if (var89 != null) {
						class60.closeInterface(var89, var21 != var89.group);
					}

					class30.openInterface(var5, var21, var26);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_WORLDENTITY == var1.serverPacket) {
					class195.method3955(HttpRequest.topLevelWorldView, var3);
					var1.serverPacket = null;
					return true;
				}

				Widget var70;
				if (ServerPacket.IF_SETANGLE == var1.serverPacket) {
					var21 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedShortAddLE();
					var26 = var3.readUnsignedShortAddLE();
					var7 = var3.readInt();
					var70 = class379.widgetDefinition.method6875(var7);
					if (var5 != var70.modelAngleX || var21 != var70.modelAngleY || var26 != var70.modelZoom) {
						var70.modelAngleX = var5;
						var70.modelAngleY = var21;
						var70.modelZoom = var26;
						class178.invalidateWidget(var70);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOC_DEL == var1.serverPacket) {
					class159.method3522(class323.field3419);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3520 == var1.serverPacket) {
					GraphicsObject.updateNpcs(Projection.worldView, false, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOGOUT_FULL == var1.serverPacket) {
					GrandExchangeOfferOwnWorldComparator.logOut();
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field3576 == var1.serverPacket) {
					var1.field1454 = var3.readShort();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_INFO == var1.serverPacket) {
					playerUpdateManager.method3027(var3, var1.serverPacketLength);
					class452.method8772();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.URL_OPEN == var1.serverPacket) {
					byte[] var51 = new byte[var1.serverPacketLength];
					var3.method10062(var51, 0, var51.length);
					Buffer var69 = new Buffer(var51);
					var67 = var69.readStringCp1252NullTerminated();
					class445.openURL(var67, true, false);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MAP_ANIM == var1.serverPacket) {
					class159.method3522(class323.field3425);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REFLECTION_CHECKER == var1.serverPacket) {
					WorldMapData_0.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_TARGET == var1.serverPacket) {
					var21 = var3.readUnsignedByte();
					var5 = var3.readUnsignedShort();
					var26 = var3.readShort();
					if (var21 == 0) {
						HttpResponse.entity = HttpRequest.topLevelWorldView.players[var5];
						field642 = -1;
					} else if (var21 == 1) {
						field642 = -1;
						HttpResponse.entity = HttpRequest.topLevelWorldView.npcs[var5];
					} else if (var21 == 2) {
						field642 = var26;
						HttpResponse.entity = HttpRequest.topLevelWorldView.worldEntities[var5];
						this.method481(true);
					}

					if (HttpResponse.entity == null) {
						field642 = -1;
						HttpResponse.entity = AsyncHttpResponse.localPlayer;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_PARTIAL == var1.serverPacket) {
					var21 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var21 < -70000) {
						var5 += 32768;
					}

					if (var21 >= 0) {
						var24 = class379.widgetDefinition.method6875(var21);
					} else {
						var24 = null;
					}

					for (; var3.offset < var1.serverPacketLength; class168.itemContainerSetItem(var5, var7, var37 - 1, var38)) {
						var7 = var3.readUShortSmart();
						var37 = var3.readUnsignedShort();
						var38 = 0;
						if (var37 != 0) {
							var38 = var3.readUnsignedByte();
							if (var38 == 255) {
								var38 = var3.readInt();
							}
						}

						if (var24 != null && var7 >= 0 && var7 < var24.itemIds.length) {
							var24.itemIds[var7] = var37;
							var24.itemQuantities[var7] = var38;
						}
					}

					if (var24 != null) {
						class178.invalidateWidget(var24);
					}

					FloorDecoration.method4686();
					changedItemContainers[++field701 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.EVENT_WORLDHOP == var1.serverPacket) {
					World var50 = new World();
					var50.host = var3.readStringCp1252NullTerminated();
					var50.id = var3.readUnsignedShort();
					var5 = var3.readInt();
					var50.properties = var5;
					if (var50.isDeadman()) {
						var50.field822 = "beta";
						class360.field3847 = true;
					} else {
						class360.field3847 = false;
					}

					class31.updateGameState(45);
					var2.close();
					var2 = null;
					UserComparator10.changeWorld(var50);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.IF_SETPOSITION == var1.serverPacket) {
					var21 = var3.readShortLE();
					var5 = var3.readShortLE();
					var26 = var3.readUnsignedIntME();
					var40 = class379.widgetDefinition.method6875(var26);
					if (var21 != var40.rawX || var5 != var40.rawY || var40.xAlignment != 0 || var40.yAlignment != 0) {
						var40.rawX = var21;
						var40.rawY = var5;
						var40.xAlignment = 0;
						var40.yAlignment = 0;
						class178.invalidateWidget(var40);
						this.alignWidget(var40);
						if (var40.type == 0) {
							GrandExchangeOfferAgeComparator.revalidateWidgetScroll(class379.widgetDefinition.Widget_interfaceComponents[var26 >> 16], var40, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_PLAYERMODEL_BODYTYPE == var1.serverPacket) {
					var21 = var3.readUnsignedByteAdd();
					var5 = var3.readUnsignedIntIME();
					var24 = class379.widgetDefinition.method6875(var5);
					var24.field3932.method6959(AsyncHttpResponse.localPlayer.appearance.gender, var21);
					class178.invalidateWidget(var24);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OBJ_ADD == var1.serverPacket) {
					class159.method3522(class323.field3421);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3456 == var1.serverPacket) {
					WorldMapID.field3249 = var3.readBoolean();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CLAN_SETTINGS_DELTA == var1.serverPacket) {
					WorldMapLabelSize.method5793();
					var61 = var3.readByte();
					class153 var68 = new class153(var3);
					ClanSettings var78;
					if (var61 >= 0) {
						var78 = currentClanSettings[var61];
					} else {
						var78 = class378.guestClanSettings;
					}

					if (var78 == null) {
						this.method1719(var61);
						var1.serverPacket = null;
						return true;
					}

					if (var68.field1697 > var78.field1741) {
						this.method1719(var61);
						var1.serverPacket = null;
						return true;
					}

					if (var68.field1697 < var78.field1741) {
						var1.serverPacket = null;
						return true;
					}

					var68.method3481(var78);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL == var1.serverPacket) {
					field567 = var3.readUnsignedByteSub();
					class178.field1859 = var3.readUnsignedByteAdd();
					class201.field2085 = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VARP_LARGE == var1.serverPacket) {
					var21 = var3.readUnsignedShortAdd();
					var5 = var3.readInt();
					Varps.Varps_temp[var21] = var5;
					if (Varps.Varps_main[var21] != var5) {
						Varps.Varps_main[var21] = var5;
					}

					class145.changeGameOptions(var21);
					changedVarps[++changedVarpCount - 1 & 31] = var21;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_JINGLE == var1.serverPacket) {
					var21 = var3.method10184();
					var5 = var3.readUnsignedShortLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					class328.method6475(var5, var21);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3511 == var1.serverPacket) {
					GraphicsObject.updateNpcs(Projection.worldView, true, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_PRIVATE_ECHO == var1.serverPacket) {
					var47 = var3.readStringCp1252NullTerminated();
					var22 = AbstractFont.escapeBrackets(class383.method7486(class53.method1069(var3)));
					class289.addGameMessage(6, var47, var22);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETHIDE == var1.serverPacket) {
					var86 = var3.readUnsignedByteSub() == 1;
					var5 = var3.readUnsignedIntLE();
					var24 = class379.widgetDefinition.method6875(var5);
					if (var86 != var24.isHidden) {
						var24.isHidden = var86;
						class178.invalidateWidget(var24);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_IGNORELIST == var1.serverPacket) {
					InterfaceParent.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					Occluder.FriendSystem_invalidateIgnoreds();
					field707 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_ROTATE_SPEED == var1.serverPacket) {
					var21 = var3.readInt();
					var5 = var3.readUnsignedShort();
					var26 = var3.readUnsignedShortLE();
					var40 = class379.widgetDefinition.method6875(var21);
					var40.field3918 = var5 + (var26 << 16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_EVENTS == var1.serverPacket) {
					var21 = var3.readUnsignedIntLE();
					var5 = var3.readUnsignedIntLE();
					var26 = var3.readUnsignedShortAddLE();
					if (var26 == 65535) {
						var26 = -1;
					}

					var7 = var3.readUnsignedShortAdd();
					if (var7 == 65535) {
						var7 = -1;
					}

					for (var37 = var7; var37 <= var26; ++var37) {
						var9 = ((long)var5 << 32) + (long)var37;
						Node var34 = widgetFlags.get(var9);
						if (var34 != null) {
							var34.remove();
						}

						widgetFlags.put(new IntegerNode(var21), var9);
					}

					var1.serverPacket = null;
					return true;
				}

				NPC var25;
				if (ServerPacket.NPC_HEADICON_SPECIFIC == var1.serverPacket) {
					var21 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByteSub();
					short var81 = (short)var3.readShortLE();
					var7 = var3.readUnsignedIntIME();
					var25 = Projection.worldView.npcs[var21];
					if (var25 != null) {
						var25.method2900(var5, var7, var81);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_SET_SEQUENCE == var1.serverPacket) {
					var5 = var3.readUnsignedShortAddLE();
					var26 = var3.readUnsignedByteSub();
					var21 = var3.readUnsignedShortAddLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					NPC var95 = Projection.worldView.npcs[var21];
					if (var95 != null) {
						if (var5 == var95.sequence && var5 != -1) {
							var37 = HealthBarDefinition.SequenceDefinition_get(var5).restartMode;
							if (var37 == 1) {
								var95.sequenceFrame = 0;
								var95.sequenceFrameCycle = 0;
								var95.sequenceDelay = var26;
								var95.field1195 = 0;
							} else if (var37 == 2) {
								var95.field1195 = 0;
							}
						} else if (var5 == -1 || var95.sequence == -1 || HealthBarDefinition.SequenceDefinition_get(var5).field2319 >= HealthBarDefinition.SequenceDefinition_get(var95.sequence).field2319) {
							var95.sequence = var5;
							var95.sequenceFrame = 0;
							var95.sequenceFrameCycle = 0;
							var95.sequenceDelay = var26;
							var95.field1195 = 0;
							var95.field1270 = var95.pathLength;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.DYNAMICOBJECT_SPAWN == var1.serverPacket) {
					var38 = var3.readUnsignedByteNeg();
					var88 = var38 >> 2;
					var31 = var38 & 3;
					var96 = field588[var88];
					var13 = var3.readUnsignedShortAdd();
					var26 = var3.method10184();
					var21 = var26 >> 16;
					var5 = var26 >> 8 & 255;
					var7 = var21 + (var26 >> 4 & 7);
					var37 = var5 + (var26 & 7);
					if (0 <= var7 && var7 < 103 && 0 <= var37 && var37 < 103) {
						GrandExchangeOffer.method7736(var7, var37, var88, var31, var96, var13);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_STAT == var1.serverPacket) {
					FloorDecoration.method4686();
					var21 = var3.readInt();
					var5 = var3.readUnsignedByte();
					var26 = var3.readUnsignedByte();
					var7 = var3.readUnsignedByte();
					experience[var7] = var21;
					currentLevels[var7] = var26;
					levels[var7] = 1;
					field655[var7] = var5;

					for (var37 = 0; var37 < 98; ++var37) {
						if (var21 >= Skills.Skills_experienceTable[var37]) {
							levels[var7] = var37 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var7;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_SHAKE == var1.serverPacket) {
					var21 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var26 = var3.readUnsignedByte();
					var7 = var3.readUnsignedByte();
					field774[var21] = true;
					field775[var21] = var5;
					field717[var21] = var26;
					field606[var21] = var7;
					field738[var21] = 0;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SERVER_TICK_END == var1.serverPacket) {
					++serverCycle;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VARP_SMALL == var1.serverPacket) {
					var21 = var3.readUnsignedShort();
					byte var57 = var3.readByte();
					Varps.Varps_temp[var21] = var57;
					if (Varps.Varps_main[var21] != var57) {
						Varps.Varps_main[var21] = var57;
					}

					class145.changeGameOptions(var21);
					changedVarps[++changedVarpCount - 1 & 31] = var21;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_RUN_WEIGHT == var1.serverPacket) {
					FloorDecoration.method4686();
					weight = var3.readShort();
					field713 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VAR_CLAN_ENABLE == var1.serverPacket) {
					class155.field1711 = new class496(FloorUnderlayDefinition.field2075);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RESET_CLIENT_VARCACHE == var1.serverPacket) {
					for (var21 = 0; var21 < VarpDefinition.field1871; ++var21) {
						VarpDefinition var66 = FileSystem.VarpDefinition_get(var21);
						if (var66 != null) {
							Varps.Varps_temp[var21] = 0;
							Varps.Varps_main[var21] = 0;
						}
					}

					FloorDecoration.method4686();
					changedVarpCount += 32;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PROJECTILE_SPAWN == var1.serverPacket) {
					var26 = var3.method10160();
					var21 = var26 >> 16;
					var5 = var26 >> 8 & 255;
					var7 = var21 + (var26 >> 4 & 7);
					var37 = var5 + (var26 & 7);
					byte var92 = var3.readByte();
					var31 = var3.method10244();
					int var18 = var3.readUnsignedShortLE();
					int var17 = var3.readUnsignedByteSub();
					var83 = var3.readUnsignedByteNeg() * 4;
					int var19 = var3.method10309();
					var15 = var3.readUnsignedShortAdd();
					var96 = var3.readUnsignedShortLE();
					byte var94 = var3.readByte();
					var16 = var3.readUnsignedShortLE();
					var13 = var3.readUnsignedByteAdd() * 4;
					var38 = var94 + var7;
					var88 = var92 + var37;
					if (0 <= var7 && var7 < 104 && 0 <= var37 && var37 < 104 && 0 <= var38 && var38 < 104 && 0 <= var88 && var88 < 104 && var96 != 65535) {
						var7 = Coord.method6843(var7);
						var37 = Coord.method6843(var37);
						var38 = Coord.method6843(var38);
						var88 = Coord.method6843(var88);
						Projectile var20 = new Projectile(var96, Projection.worldView.plane, var7, var37, class77.getTileHeight(Projection.worldView, var7, var37, Projection.worldView.plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var19, var31, var83);
						var20.setDestination(var38, var88, class77.getTileHeight(Projection.worldView, var38, var88, Projection.worldView.plane) - var83, var15 + cycle);
						Projection.worldView.projectiles.addFirst(var20);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_MOVESUB == var1.serverPacket) {
					var21 = var3.readUnsignedIntLE();
					var5 = var3.readInt();
					InterfaceParent var76 = (InterfaceParent)interfaceParents.get((long)var21);
					var89 = (InterfaceParent)interfaceParents.get((long)var5);
					if (var89 != null) {
						class60.closeInterface(var89, var76 == null || var76.group != var89.group);
					}

					if (var76 != null) {
						var76.remove();
						interfaceParents.put(var76, (long)var5);
					}

					var70 = class379.widgetDefinition.method6875(var21);
					if (var70 != null) {
						class178.invalidateWidget(var70);
					}

					var70 = class379.widgetDefinition.method6875(var5);
					if (var70 != null) {
						class178.invalidateWidget(var70);
						GrandExchangeOfferAgeComparator.revalidateWidgetScroll(class379.widgetDefinition.Widget_interfaceComponents[var70.id >>> 16], var70, true);
					}

					if (rootInterface != -1) {
						World.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RUNCLIENTSCRIPT == var1.serverPacket) {
					var47 = var3.readStringCp1252NullTerminated();
					Object[] var65 = new Object[var47.length() + 1];

					for (var26 = var47.length() - 1; var26 >= 0; --var26) {
						if (var47.charAt(var26) == 's') {
							var65[var26 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var65[var26 + 1] = new Integer(var3.readInt());
						}
					}

					var65[0] = new Integer(var3.readInt());
					ScriptEvent var74 = new ScriptEvent();
					var74.args = var65;
					WorldMapEvent.runScriptEvent(var74);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETPLAYERHEAD == var1.serverPacket) {
					var21 = var3.readInt();
					var64 = class379.widgetDefinition.method6875(var21);
					var64.modelType = 3;
					var64.modelId = AsyncHttpResponse.localPlayer.appearance.getChatHeadId();
					class178.invalidateWidget(var64);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OBJ_COUNT == var1.serverPacket) {
					class159.method3522(class323.field3418);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_TRADING_POST == var1.serverPacket) {
					var86 = var3.readUnsignedByte() == 1;
					if (var86) {
						class27.field130 = class59.method1150() - var3.readLong();
						AABB.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						AABB.grandExchangeEvents = null;
					}

					field712 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETMODEL == var1.serverPacket) {
					var21 = var3.readUnsignedIntLE();
					var5 = var3.readUnsignedShortLE();
					var24 = class379.widgetDefinition.method6875(var21);
					if (var24.modelType != 1 || var5 != var24.modelId) {
						var24.modelType = 1;
						var24.modelId = var5;
						class178.invalidateWidget(var24);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PING_STATISTICS_REQUEST == var1.serverPacket) {
					var21 = var3.readInt();
					var5 = var3.readInt();
					var26 = class28.getGcDuration();
					PacketBufferNode var93 = Message.getPacketBufferNode(ClientPacket.PING_STATISTICS, packetWriter.isaacCipher);
					var93.packetBuffer.writeByteSub(var26);
					var93.packetBuffer.writeByte(GameEngine.fps);
					var93.packetBuffer.writeIntIME(var21);
					var93.packetBuffer.writeIntLE(var5);
					packetWriter.addNode(var93);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_FRIENDLIST == var1.serverPacket) {
					InterfaceParent.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field707 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SYNC_CLIENT_VARCACHE == var1.serverPacket) {
					for (var21 = 0; var21 < Varps.Varps_main.length; ++var21) {
						if (Varps.Varps_temp[var21] != Varps.Varps_main[var21]) {
							Varps.Varps_main[var21] = Varps.Varps_temp[var21];
							class145.changeGameOptions(var21);
							changedVarps[++changedVarpCount - 1 & 31] = var21;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETCOLOUR == var1.serverPacket) {
					var21 = var3.readInt();
					var5 = var3.readUnsignedShortLE();
					var26 = var5 >> 10 & 31;
					var7 = var5 >> 5 & 31;
					var37 = var5 & 31;
					var38 = (var7 << 11) + (var26 << 19) + (var37 << 3);
					Widget var54 = class379.widgetDefinition.method6875(var21);
					if (var38 != var54.color) {
						var54.color = var38;
						class178.invalidateWidget(var54);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_SETANGLE == var1.serverPacket) {
					isCameraLocked = true;
					field773 = false;
					field512 = false;
					field594 = var3.readUnsignedByte();
					class144.field1638 = var3.readUnsignedByte();
					ApproximateRouteStrategy.field474 = var3.readUnsignedShort();
					GrandExchangeOfferOwnWorldComparator.field479 = var3.readUnsignedByte();
					UserComparator9.field1502 = var3.readUnsignedByte();
					if (UserComparator9.field1502 >= 100) {
						var21 = Coord.method6843(field594);
						var5 = Coord.method6843(class144.field1638);
						var26 = class77.getTileHeight(HttpRequest.topLevelWorldView, var21, var5, HttpRequest.topLevelWorldView.plane) - ApproximateRouteStrategy.field474;
						var7 = var21 - class403.cameraX;
						var37 = var26 - class166.cameraY;
						var38 = var5 - class328.cameraZ;
						var88 = (int)Math.sqrt((double)(var38 * var38 + var7 * var7));
						SoundSystem.cameraPitch = (int)(Math.atan2((double)var37, (double)var88) * 325.9490051269531D) & 2047;
						ReflectionCheck.cameraYaw = (int)(Math.atan2((double)var7, (double)var38) * -325.9490051269531D) & 2047;
						if (SoundSystem.cameraPitch < 128) {
							SoundSystem.cameraPitch = 128;
						}

						if (SoundSystem.cameraPitch > 383) {
							SoundSystem.cameraPitch = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOC_ADD_CHANGE == var1.serverPacket) {
					class159.method3522(class323.field3429);
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

				if (ServerPacket.VAR_CLAN_DISABLE == var1.serverPacket) {
					class155.field1711 = null;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.FRIENDS_LIST_LOADED == var1.serverPacket) {
					InterfaceParent.friendSystem.method1935();
					field707 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_RUN_ENERGY == var1.serverPacket) {
					FloorDecoration.method4686();
					runEnergy = var3.readUnsignedShort();
					field713 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER == var1.serverPacket) {
					return this.method1262(var1);
				}

				if (ServerPacket.MIDI_SONG_WITH_SECONDARY == var1.serverPacket) {
					var37 = var3.readUnsignedShortAdd();
					var38 = var3.readUnsignedShortAddLE();
					var7 = var3.readUnsignedShortLE();
					var21 = var3.readUnsignedShortAdd();
					if (var21 == 65535) {
						var21 = -1;
					}

					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					var26 = var3.readUnsignedShortLE();
					ArrayList var53 = new ArrayList();
					var53.add(var21);
					var53.add(var5);
					class278.playSong(var53, var26, var7, var37, var38);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3457 == var1.serverPacket) {
					var21 = var3.readShort();
					class492 var63 = (class492)ScriptEvent.findEnumerated(class88.method2470(), var3.readUnsignedByte());
					class491 var73 = (class491)ScriptEvent.findEnumerated(class271.method5642(), var3.readUnsignedByte());
					if (var21 == -2) {
						worldViewManager.method2595(var63, var73);
					} else {
						worldViewManager.method2596(var21, var63, var73);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOC_ANIM == var1.serverPacket) {
					class159.method3522(class323.field3430);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETANIM == var1.serverPacket) {
					var21 = var3.readSignedShort();
					var5 = var3.readUnsignedIntLE();
					var24 = class379.widgetDefinition.method6875(var5);
					if (var21 != var24.sequenceId || var21 == -1) {
						var24.sequenceId = var21;
						var24.modelFrame = 0;
						var24.modelFrameCycle = 0;
						class178.invalidateWidget(var24);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_PLAYERMODEL_SELF == var1.serverPacket) {
					var21 = var3.readUnsignedIntIME();
					var52 = var3.readUnsignedByte() == 1;
					var24 = class379.widgetDefinition.method6875(var21);
					var24.method7340(AsyncHttpResponse.localPlayer.appearance, var52);
					class178.invalidateWidget(var24);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED == var1.serverPacket) {
					class201.field2085 = var3.readUnsignedByte();
					field567 = var3.readUnsignedByteSub();
					class178.field1859 = var3.readUnsignedByteNeg();

					while (var3.offset < var1.serverPacketLength) {
						var21 = var3.readUnsignedByte();
						class323 var62 = MidiPcmStream.method6685()[var21];
						class159.method3522(var62);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3462 == var1.serverPacket) {
					field523 = var3.readBoolean();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_ACTIVE_WORLD == var1.serverPacket) {
					var21 = var3.readUnsignedByte();
					var5 = var3.readUnsignedShort();
					var26 = var3.readUnsignedByte();
					class492.field5089 = var26;
					if (var21 == 0) {
						HttpRequest.topLevelWorldView.plane = var26;
						Projection.worldView = HttpRequest.topLevelWorldView;
					} else {
						if (var21 != 1) {
							throw new RuntimeException("Don't know what world we're about to receive updates for, this is bad");
						}

						WorldEntity var90 = HttpRequest.topLevelWorldView.worldEntities[var5];
						var90.worldView.plane = var26;
						Projection.worldView = var90.worldView;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OBJ_SET_CUSTOMIZATION == var1.serverPacket) {
					class159.method3522(class323.field3428);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_RESET == var1.serverPacket) {
					field773 = false;
					isCameraLocked = false;
					field596 = false;
					field512 = false;
					field594 = 0;
					class144.field1638 = 0;
					ApproximateRouteStrategy.field474 = 0;
					field575 = false;
					GrandExchangeOfferOwnWorldComparator.field479 = 0;
					UserComparator9.field1502 = 0;
					HttpRequest.field55 = 0;
					class53.field357 = 0;
					class153.field1700 = 0;
					PcmPlayer.field290 = 0;
					WorldMapLabelSize.field3089 = 0;
					field770 = null;
					field670 = null;
					field771 = null;

					for (var21 = 0; var21 < 5; ++var21) {
						field774[var21] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETSCROLLPOS == var1.serverPacket) {
					var21 = var3.readUnsignedShort();
					var5 = var3.readUnsignedIntLE();
					var24 = class379.widgetDefinition.method6875(var5);
					if (var24 != null && var24.type == 0) {
						if (var21 > var24.scrollHeight - var24.height * 1899982693) {
							var21 = var24.scrollHeight - var24.height * 1899982693;
						}

						if (var21 < 0) {
							var21 = 0;
						}

						if (var21 != var24.scrollY) {
							var24.scrollY = var21;
							class178.invalidateWidget(var24);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_RESYNC == var1.serverPacket) {
					var21 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					var26 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.method1268(false);
						class47.method866(rootInterface);
						ArchiveDiskAction.runWidgetOnLoadListener(rootInterface);

						for (var7 = 0; var7 < 100; ++var7) {
							validRootWidgets[var7] = true;
						}
					}

					InterfaceParent var10;
					for (; var26-- > 0; var10.field1074 = true) {
						var7 = var3.readInt();
						var37 = var3.readUnsignedShort();
						var38 = var3.readUnsignedByte();
						var10 = (InterfaceParent)interfaceParents.get((long)var7);
						if (var10 != null && var37 != var10.group) {
							class60.closeInterface(var10, true);
							var10 = null;
						}

						if (var10 == null) {
							var10 = class30.openInterface(var7, var37, var38);
						}
					}

					for (var89 = (InterfaceParent)interfaceParents.first(); var89 != null; var89 = (InterfaceParent)interfaceParents.next()) {
						if (var89.field1074) {
							var89.field1074 = false;
						} else {
							class60.closeInterface(var89, true);
						}
					}

					widgetFlags = new NodeHashTable(512);

					while (var3.offset < var21) {
						var7 = var3.readInt();
						var37 = var3.readUnsignedShort();
						var38 = var3.readUnsignedShort();
						var88 = var3.readInt();

						for (var31 = var37; var31 <= var38; ++var31) {
							var85 = ((long)var7 << 32) + (long)var31;
							widgetFlags.put(new IntegerNode(var88), var85);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VAR_CLAN == var1.serverPacket) {
					if (class155.field1711 == null) {
						class155.field1711 = new class496(FloorUnderlayDefinition.field2075);
					}

					class565 var49 = FloorUnderlayDefinition.field2075.method9328(var3);
					class155.field1711.field5124.vmethod9822(var49.field5535, var49.field5536);
					field704[++field705 - 1 & 31] = var49.field5535;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CHAT_FILTER_SETTINGS == var1.serverPacket) {
					publicChatMode = var3.readUnsignedByteSub();
					tradeChatMode = var3.readUnsignedByteNeg();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_PLAYERMODEL_BASECOLOUR == var1.serverPacket) {
					var21 = var3.readUnsignedByteAdd();
					var5 = var3.readUnsignedIntME();
					var26 = var3.readUnsignedByte();
					var40 = class379.widgetDefinition.method6875(var5);
					var40.field3932.method6899(var21, var26);
					class178.invalidateWidget(var40);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3555 == var1.serverPacket) {
					var21 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var26 = var3.readUnsignedShort();
					MoveSpeed.queueSoundEffect(var21, var5, var26);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETNPCHEAD_ACTIVE == var1.serverPacket) {
					var21 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedIntIME();
					var24 = class379.widgetDefinition.method6875(var5);
					if (var24.modelType != 6 || var21 != var24.modelId) {
						var24.modelType = 6;
						var24.modelId = var21;
						class178.invalidateWidget(var24);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CLAN_SETTINGS_FULL == var1.serverPacket) {
					WorldMapLabelSize.method5793();
					var61 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var61 >= 0) {
							currentClanSettings[var61] = null;
						} else {
							class378.guestClanSettings = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var61 >= 0) {
						currentClanSettings[var61] = new ClanSettings(var3);
					} else {
						class378.guestClanSettings = new ClanSettings(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_CLOSESUB == var1.serverPacket) {
					var21 = var3.readInt();
					InterfaceParent var60 = (InterfaceParent)interfaceParents.get((long)var21);
					if (var60 != null) {
						class60.closeInterface(var60, true);
					}

					if (meslayerContinueWidget != null) {
						class178.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_FULL_FOLLOWS == var1.serverPacket) {
					field567 = var3.readUnsignedByteAdd();
					class201.field2085 = var3.readUnsignedByte();
					class178.field1859 = var3.readUnsignedByteNeg();

					for (var21 = class178.field1859; var21 < class178.field1859 + 8; ++var21) {
						for (var5 = class201.field2085; var5 < class201.field2085 + 8; ++var5) {
							if (Projection.worldView.groundItems[field567][var21][var5] != null) {
								Projection.worldView.groundItems[field567][var21][var5] = null;
								class173.updateItemPile(field567, var21, var5);
							}
						}
					}

					for (PendingSpawn var48 = (PendingSpawn)Projection.worldView.pendingSpawns.last(); var48 != null; var48 = (PendingSpawn)Projection.worldView.pendingSpawns.previous()) {
						if (var48.x >= class178.field1859 && var48.x < class178.field1859 + 8 && var48.y >= class201.field2085 && var48.y < class201.field2085 + 8 && var48.plane == field567) {
							var48.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_LOOKAT_EASED_COORD == var1.serverPacket) {
					isCameraLocked = true;
					field773 = false;
					field512 = true;
					field594 = var3.readUnsignedByte();
					class144.field1638 = var3.readUnsignedByte();
					ApproximateRouteStrategy.field474 = var3.readUnsignedShort();
					var21 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var26 = Coord.method6843(field594);
					var7 = Coord.method6843(class144.field1638);
					var37 = class77.getTileHeight(HttpRequest.topLevelWorldView, var26, var7, HttpRequest.topLevelWorldView.plane) - ApproximateRouteStrategy.field474;
					var38 = var26 - class403.cameraX;
					var88 = var37 - class166.cameraY;
					var31 = var7 - class328.cameraZ;
					double var35 = Math.sqrt((double)(var31 * var31 + var38 * var38));
					var83 = ClanChannelMember.method3474((int)(Math.atan2((double)var88, var35) * 325.9490051269531D) & 2047);
					var15 = CollisionMap.method5635((int)(Math.atan2((double)var38, (double)var31) * -325.9490051269531D) & 2047);
					field670 = new class520(SoundSystem.cameraPitch, var83, var21, var5);
					field771 = new class520(ReflectionCheck.cameraYaw, var15, var21, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_PLAYER_OP == var1.serverPacket) {
					var21 = var3.readUnsignedByteNeg();
					var5 = var3.readUnsignedByteNeg();
					var67 = var3.readStringCp1252NullTerminated();
					if (var5 >= 1 && var5 <= 8) {
						if (var67.equalsIgnoreCase("null")) {
							var67 = null;
						}

						playerMenuActions[var5 - 1] = var67;
						playerOptionsPriorities[var5 - 1] = var21 == 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_PLAYERMODEL_OBJ == var1.serverPacket) {
					var21 = var3.readUnsignedIntLE();
					var5 = var3.readUnsignedIntLE();
					var24 = class379.widgetDefinition.method6875(var5);
					var24.field3932.method6916(var21);
					class178.invalidateWidget(var24);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOGOUT == var1.serverPacket) {
					var21 = var3.readUnsignedByte();
					class280.forceDisconnect(var21);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.TRIGGER_ONDIALOG_ABORT == var1.serverPacket) {
					if (rootInterface != -1) {
						World.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_SPOTANIM == var1.serverPacket) {
					var7 = var3.readUnsignedByteAdd();
					var26 = var3.readUnsignedShortAdd();
					var21 = var3.readUnsignedShortLE();
					var25 = Projection.worldView.npcs[var21];
					var5 = var3.readInt();
					if (var25 != null) {
						var25.updateSpotAnimation(var7, var26, var5 >> 16, var5 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_NPC_UPDATE_ORIGIN == var1.serverPacket) {
					class319.field3309 = var3.readUnsignedByte();
					HttpRequestTask.field88 = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3471 == var1.serverPacket) {
					field614 = var3.readStringCp1252NullTerminated();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OBJ_DEL == var1.serverPacket) {
					class159.method3522(class323.field3424);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CLEAR_ENTITIES == var1.serverPacket) {
					Projection.worldView.npcCount = 0;
					Projection.worldView.worldEntityCount = 0;

					for (var21 = 0; var21 < 65536; ++var21) {
						Projection.worldView.npcs[var21] = null;
					}

					for (var21 = 0; var21 < 2048; ++var21) {
						Projection.worldView.worldEntities[var21] = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OBJ_OPFILTER == var1.serverPacket) {
					class159.method3522(class323.field3422);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_SITE_SETTINGS == var1.serverPacket) {
					class107.method2973(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_PRIVATE == var1.serverPacket) {
					var47 = var3.readStringCp1252NullTerminated();
					var27 = (long)var3.readUnsignedShort();
					var29 = (long)var3.readMedium();
					PlayerType var41 = (PlayerType)ScriptEvent.findEnumerated(ObjectComposition.PlayerType_values(), var3.readUnsignedByte());
					long var43 = (var27 << 32) + var29;
					var42 = false;

					for (var13 = 0; var13 < 100; ++var13) {
						if (var43 == crossWorldMessageIds[var13]) {
							var42 = true;
							break;
						}
					}

					if (InterfaceParent.friendSystem.isIgnored(new Username(var47, class28.loginType))) {
						var42 = true;
					}

					if (!var42 && field635 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var43;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var32 = AbstractFont.escapeBrackets(class383.method7486(class53.method1069(var3)));
						byte var33;
						if (var41.isPrivileged) {
							var33 = 7;
						} else {
							var33 = 3;
						}

						if (var41.modIcon != -1) {
							class289.addGameMessage(var33, class153.method3479(var41.modIcon) + var47, var32);
						} else {
							class289.addGameMessage(var33, var47, var32);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CLAN_CHANNEL_FULL == var1.serverPacket) {
					field798 = cycleCntr;
					var61 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var61 >= 0) {
							currentClanChannels[var61] = null;
						} else {
							ObjectComposition.guestClanChannel = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var61 >= 0) {
						currentClanChannels[var61] = new ClanChannel(var3);
					} else {
						ObjectComposition.guestClanChannel = new ClanChannel(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_MOVETO == var1.serverPacket) {
					isCameraLocked = true;
					field773 = false;
					field596 = true;
					class153.field1700 = var3.readUnsignedByte();
					PcmPlayer.field290 = var3.readUnsignedByte();
					var21 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShort();
					field575 = var3.readBoolean();
					var26 = var3.readUnsignedByte();
					var7 = Coord.method6843(class153.field1700);
					var37 = Coord.method6843(PcmPlayer.field290);
					boolean var87 = false;
					boolean var39 = false;
					if (field575) {
						var38 = class166.cameraY;
						var88 = class77.getTileHeight(HttpRequest.topLevelWorldView, var7, var37, HttpRequest.topLevelWorldView.plane) - var21;
					} else {
						var38 = class77.getTileHeight(HttpRequest.topLevelWorldView, class403.cameraX, class328.cameraZ, HttpRequest.topLevelWorldView.plane) - class166.cameraY;
						var88 = var21;
					}

					field770 = new class519(class403.cameraX, class328.cameraZ, var38, var7, var37, var88, var5, var26);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_ANIM_SPECIFIC == var1.serverPacket) {
					var21 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedByteSub();
					if (var21 == 65535) {
						var21 = -1;
					}

					class150.performPlayerAnimation(AsyncHttpResponse.localPlayer, var21, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOC_MERGEPLAYER == var1.serverPacket) {
					class159.method3522(class323.field3423);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_LOOKAT_EASED_ANGLE_RELATIVE == var1.serverPacket) {
					isCameraLocked = true;
					field773 = false;
					field512 = true;
					var21 = var3.readShort();
					var5 = var3.readShort();
					var26 = ClanChannelMember.method3474(var5 + SoundSystem.cameraPitch & 2027);
					var7 = var21 + ReflectionCheck.cameraYaw;
					var37 = var3.readUnsignedShort();
					var38 = var3.readUnsignedByte();
					field670 = new class520(SoundSystem.cameraPitch, var26, var37, var38);
					field771 = new class520(ReflectionCheck.cameraYaw, var7, var37, var38);
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
							hintArrowSubY = 64;
						}

						if (hintArrowType == 3) {
							hintArrowSubX = 0;
							hintArrowSubY = 64;
						}

						if (hintArrowType == 4) {
							hintArrowSubX = 8192;
							hintArrowSubY = 64;
						}

						if (hintArrowType == 5) {
							hintArrowSubX = 4096;
							hintArrowSubY = 0;
						}

						if (hintArrowType == 6) {
							hintArrowSubX = 4096;
							hintArrowSubY = 128;
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

				ArchiveLoader.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1471 != null ? var1.field1471.id : -1) + "," + (var1.field1469 != null ? var1.field1469.id : -1) + "," + var1.serverPacketLength, (Throwable)null);
				GrandExchangeOfferOwnWorldComparator.logOut();
			} catch (IOException var45) {
				PcmPlayer.method773();
			} catch (Exception var46) {
				var22 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1471 != null ? var1.field1471.id : -1) + "," + (var1.field1469 != null ? var1.field1469.id : -1) + "," + var1.serverPacketLength + "," + (AsyncHttpResponse.localPlayer.pathX[0] + HttpRequest.topLevelWorldView.baseX) + "," + (AsyncHttpResponse.localPlayer.pathY[0] + HttpRequest.topLevelWorldView.baseY) + ",";

				for (var26 = 0; var26 < var1.serverPacketLength && var26 < 50; ++var26) {
					var22 = var22 + var3.array[var26] + ",";
				}

				ArchiveLoader.RunException_sendStackTrace(var22, var46);
				GrandExchangeOfferOwnWorldComparator.logOut();
			}

			return true;
		}
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-44911688"
	)
	@Export("menu")
	final void menu() {
		WorldMapSection0.method6160(menu);
		if (clickedWidget == null) {
			int var1 = MouseHandler.MouseHandler_lastButton;
			if (isMenuOpen) {
				if (var1 != 1 && (class160.mouseCam || var1 != 4) && !menu.method10736(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y)) {
					isMenuOpen = false;
					menu.invalidateWidgetsUnder();
				}

				if (var1 == 1 || !class160.mouseCam && var1 == 4) {
					menu.method10757(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					isMenuOpen = false;
					menu.invalidateWidgetsUnder();
				}
			} else if (menu.menuOptionsCount > 0) {
				int var2 = class217.method4387();
				if ((var1 == 1 || !class160.mouseCam && var1 == 4) && this.shouldLeftClickOpenMenu(menu.menuOpcodes[var2], menu.menuShiftClick[var2])) {
					var1 = 2;
				}

				if (var1 == 1 || !class160.mouseCam && var1 == 4) {
					menu.method10735(var2);
				}

				if (var1 == 2) {
					this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}
			}

		}
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(IZI)Z",
		garbageValue = "-1738055752"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu(int var1, boolean var2) {
		return (leftClickOpensMenu && menu.menuOptionsCount > 2 || SongTask.method8716(var1)) && !var2;
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-25"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		menu.method10732(var1, var2);
		Iterator var3 = worldViewManager.iterator();

		while (var3.hasNext()) {
			WorldView var4 = (WorldView)var3.next();
			var4.scene.menuOpen(false);
		}

		isMenuOpen = true;
		menu.method10738();
	}

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "0"
	)
	final void method1268(boolean var1) {
		int var2 = rootInterface;
		int var3 = class329.canvasWidth;
		int var4 = class535.canvasHeight;
		if (class379.widgetDefinition.loadInterface(var2)) {
			Tile.resizeInterface(class379.widgetDefinition.Widget_interfaceComponents[var2], -1, var3, var4, var1);
		}

	}

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "(Lnp;B)V",
		garbageValue = "-16"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : class379.widgetDefinition.method6875(var1.parentId);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = class329.canvasWidth;
			var4 = class535.canvasHeight;
		} else {
			var3 = var2.width * 1063514007;
			var4 = var2.height * 1899982693;
		}

		AbstractWorldMapIcon.alignWidgetSize(var1, var3, var4, false);
		LoginScreenAnimation.alignWidgetPosition(var1, var3, var4);
	}

	@ObfuscatedName("nr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "438815094"
	)
	final void method1360() {
		class178.invalidateWidget(clickedWidget);
		++class383.widgetDragDuration;
		if (field749 && field690) {
			int var1 = MouseHandler.MouseHandler_x;
			int var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field795) {
				var1 = field795;
			}

			if (clickedWidget.width * 1063514007 + var1 > clickedWidgetParent.width * 1063514007 + field795) {
				var1 = clickedWidgetParent.width * 1063514007 + field795 - clickedWidget.width * 1063514007;
			}

			if (var2 < field683) {
				var2 = field683;
			}

			if (var2 + clickedWidget.height * 1899982693 > clickedWidgetParent.height * 1899982693 + field683) {
				var2 = clickedWidgetParent.height * 1899982693 + field683 - clickedWidget.height * 1899982693;
			}

			int var3 = var1 - field694;
			int var4 = var2 - field695;
			int var5 = clickedWidget.dragZoneSize;
			if (class383.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}

			int var6 = var1 - field795 + clickedWidgetParent.scrollX;
			int var7 = var2 - field683 + clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = clickedWidget.onDrag;
				WorldMapEvent.runScriptEvent(var8);
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
						WorldMapEvent.runScriptEvent(var8);
					}

					if (draggedOnWidget != null) {
						Widget var9 = clickedWidget;
						int var11 = Renderable.getWidgetFlags(var9);
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

								var9 = class379.widgetDefinition.method6875(var9.parentId);
								if (var9 == null) {
									var15 = null;
									break;
								}

								++var13;
							}
						}

						if (var15 != null) {
							PacketBufferNode var14 = Message.getPacketBufferNode(ClientPacket.OPHELDD, packetWriter.isaacCipher);
							var14.packetBuffer.writeShort(clickedWidget.childIndex);
							var14.packetBuffer.writeIntME(draggedOnWidget.id);
							var14.packetBuffer.writeShortAddLE(draggedOnWidget.childIndex);
							var14.packetBuffer.writeIntLE(clickedWidget.id);
							var14.packetBuffer.writeShortAdd(clickedWidget.itemId);
							var14.packetBuffer.writeShortAdd(draggedOnWidget.itemId);
							packetWriter.addNode(var14);
						}
					}
				} else if (class482.tempMenuAction != null && !this.shouldLeftClickOpenMenu(class482.tempMenuAction.opcode, class482.tempMenuAction.field918)) {
					if (menu.menuOptionsCount > 0) {
						HealthBarDefinition.method3845(widgetClickX + field694, field695 + widgetClickY);
					}
				} else {
					this.openMenu(widgetClickX + field694, widgetClickY + field695);
				}

				clickedWidget = null;
			}

		} else {
			if (class383.widgetDragDuration > 1) {
				if (!isDraggingWidget && menu.menuOptionsCount > 0) {
					HealthBarDefinition.method3845(widgetClickX + field694, field695 + widgetClickY);
				}

				clickedWidget = null;
			}

		}
	}

	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "(B)Lwo;",
		garbageValue = "-67"
	)
	@Export("username")
	public Username username() {
		return AsyncHttpResponse.localPlayer != null ? AsyncHttpResponse.localPlayer.username : null;
	}

	@ObfuscatedName("pu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1260825323"
	)
	void method1272(int var1) {
		PacketBufferNode var2 = Message.getPacketBufferNode(ClientPacket.CLAN_CHANNEL_FULL_REQUEST, packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(var1);
		packetWriter.addNode(var2);
	}

	@ObfuscatedName("pr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "759196212"
	)
	void method1719(int var1) {
		PacketBufferNode var2 = Message.getPacketBufferNode(ClientPacket.CLAN_SETTINGS_FULL_REQUEST, packetWriter.isaacCipher);
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
							Language var13;
							if (var4 >= 0 && var4 < Language.Language_valuesOrdered.length) {
								var13 = Language.Language_valuesOrdered[var4];
							} else {
								var13 = null;
							}

							class276.clientLanguage = var13;
							break;
						case 7:
							var4 = Integer.parseInt(var2);
							GameBuild[] var5 = Sound.method3511();
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

							class4.field10 = var3;
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) {
							}
							break;
						case 9:
							class141.field1630 = var2;
							break;
						case 10:
							Language.field4687 = (StudioGame)ScriptEvent.findEnumerated(class216.method4384(), Integer.parseInt(var2));
							if (Language.field4687 == StudioGame.oldscape) {
								class28.loginType = LoginType.oldscape;
							} else {
								class28.loginType = LoginType.field5346;
							}
							break;
						case 11:
							Messages.authServiceBaseUrl = var2;
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
							FriendsChat.field4989 = Integer.parseInt(var2);
							break;
						case 15:
							gameBuild = Integer.parseInt(var2);
							break;
						case 17:
							BuddyRankComparator.field1509 = var2;
							break;
						case 21:
							field788 = Integer.parseInt(var2);
							break;
						case 22:
							AsyncRestClient.gameSessionServiceBaseUrl = var2;
							break;
						case 25:
							int var8 = var2.indexOf(".");
							if (var8 == -1) {
								Integer.parseInt(var2);
							} else {
								Integer.parseInt(var2.substring(0, var8));
								Integer.parseInt(var2.substring(var8 + 1));
							}
						}
					}
				}

				FileSystem.method4426();
				class172.worldHost = this.getCodeBase().getHost();
				GrandExchangeOfferTotalQuantityComparator.field4633 = new JagNetThread();
				String var9 = class4.field10.name;
				byte var10 = 0;
				if ((worldProperties & class552.field5440.rsOrdinal()) != 0) {
					class47.field323 = "beta";
				}

				try {
					class177.method3741("oldschool", class47.field323, var9, var10, 23);
				} catch (Exception var11) {
					ArchiveLoader.RunException_sendStackTrace((String)null, var11);
				}

				NpcOverrides.client = this;
				RunException.field5645 = clientType;
				class482.accessToken = System.getenv("JX_ACCESS_TOKEN");
				WorldMapID.refreshToken = System.getenv("JX_REFRESH_TOKEN");
				class225.sessionId = System.getenv("JX_SESSION_ID");
				class47.characterId = System.getenv("JX_CHARACTER_ID");
				ModeWhere.method7810(System.getenv("JX_DISPLAY_NAME"));
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
					this.https = true;
				}

				if (field516 == -1) {
					if (!this.containsAccessAndRefreshToken() && !this.containsSessionAndCharacterId()) {
						field516 = 0;
					} else {
						field516 = 5;
					}
				}

				this.startThread(765, 503, 227, 1);
			}
		} catch (RuntimeException var12) {
			throw EnumComposition.newRunException(var12, "client.init(" + ')');
		}
	}

	protected void finalize() throws Throwable {
		Language.method7799(this);
		super.finalize();
	}

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V"
	)
	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) {
			this.otlTokenRequester = var1;
			class329.updateLoginIndex(10);
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

	public void setClient(int var1) {
		this.clientId = var1;
	}

	@ObfuscatedName("ab")
	public static final int method1517(double var0, double var2, double var4) {
		double var6 = var4;
		double var8 = var4;
		double var10 = var4;
		if (0.0D != var2) {
			double var12;
			if (var4 < 0.5D) {
				var12 = (1.0D + var2) * var4;
			} else {
				var12 = var2 + var4 - var4 * var2;
			}

			double var14 = 2.0D * var4 - var12;
			double var16 = var0 + 0.3333333333333333D;
			if (var16 > 1.0D) {
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D;
			if (var20 < 0.0D) {
				++var20;
			}

			if (6.0D * var16 < 1.0D) {
				var6 = 6.0D * (var12 - var14) * var16 + var14;
			} else if (var16 * 2.0D < 1.0D) {
				var6 = var12;
			} else if (3.0D * var16 < 2.0D) {
				var6 = 6.0D * (0.6666666666666666D - var16) * (var12 - var14) + var14;
			} else {
				var6 = var14;
			}

			if (6.0D * var0 < 1.0D) {
				var8 = var14 + var0 * (var12 - var14) * 6.0D;
			} else if (2.0D * var0 < 1.0D) {
				var8 = var12;
			} else if (3.0D * var0 < 2.0D) {
				var8 = 6.0D * (0.6666666666666666D - var0) * (var12 - var14) + var14;
			} else {
				var8 = var14;
			}

			if (6.0D * var20 < 1.0D) {
				var10 = var20 * 6.0D * (var12 - var14) + var14;
			} else if (var20 * 2.0D < 1.0D) {
				var10 = var12;
			} else if (var20 * 3.0D < 2.0D) {
				var10 = var14 + 6.0D * (var12 - var14) * (0.6666666666666666D - var20);
			} else {
				var10 = var14;
			}
		}

		int var22 = (int)(var6 * 256.0D);
		int var13 = (int)(var8 * 256.0D);
		int var23 = (int)(var10 * 256.0D);
		int var15 = var23 + (var13 << 8) + (var22 << 16);
		return var15;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Lpw;II)Lmc;",
		garbageValue = "-1076663541"
	)
	public static PacketBufferNode method1455(int var0, String var1, Language var2, int var3) {
		PacketBufferNode var4 = Message.getPacketBufferNode(ClientPacket.MESSAGE_PUBLIC, packetWriter.isaacCipher);
		var4.packetBuffer.writeByte(0);
		int var5 = var4.packetBuffer.offset;
		var4.packetBuffer.writeByte(var0);
		String var6 = var1.toLowerCase();
		int var7 = 0;
		byte[] var8 = null;
		if (var6.startsWith("yellow:")) {
			var7 = 0;
			var1 = var1.substring("yellow:".length());
		} else if (var6.startsWith("red:")) {
			var7 = 1;
			var1 = var1.substring("red:".length());
		} else if (var6.startsWith("green:")) {
			var7 = 2;
			var1 = var1.substring("green:".length());
		} else if (var6.startsWith("cyan:")) {
			var7 = 3;
			var1 = var1.substring("cyan:".length());
		} else if (var6.startsWith("purple:")) {
			var7 = 4;
			var1 = var1.substring("purple:".length());
		} else if (var6.startsWith("white:")) {
			var7 = 5;
			var1 = var1.substring("white:".length());
		} else if (var6.startsWith("flash1:")) {
			var7 = 6;
			var1 = var1.substring("flash1:".length());
		} else if (var6.startsWith("flash2:")) {
			var7 = 7;
			var1 = var1.substring("flash2:".length());
		} else if (var6.startsWith("flash3:")) {
			var7 = 8;
			var1 = var1.substring("flash3:".length());
		} else if (var6.startsWith("glow1:")) {
			var7 = 9;
			var1 = var1.substring("glow1:".length());
		} else if (var6.startsWith("glow2:")) {
			var7 = 10;
			var1 = var1.substring("glow2:".length());
		} else if (var6.startsWith("glow3:")) {
			var7 = 11;
			var1 = var1.substring("glow3:".length());
		} else if (var6.startsWith("rainbow:")) {
			var7 = 12;
			var1 = var1.substring("rainbow:".length());
		} else if (var6.startsWith("pattern")) {
			var8 = IntHashTable.method10781(var6);
			if (var8 != null) {
				var7 = var8.length + 12;
				var1 = var1.substring("pattern".length() + var8.length + 1);
			}
		}

		var6 = var1.toLowerCase();
		byte var9 = 0;
		if (var6.startsWith("wave:")) {
			var9 = 1;
			var1 = var1.substring("wave:".length());
		} else if (var6.startsWith("wave2:")) {
			var9 = 2;
			var1 = var1.substring("wave2:".length());
		} else if (var6.startsWith("shake:")) {
			var9 = 3;
			var1 = var1.substring("shake:".length());
		} else if (var6.startsWith("scroll:")) {
			var9 = 4;
			var1 = var1.substring("scroll:".length());
		} else if (var6.startsWith("slide:")) {
			var9 = 5;
			var1 = var1.substring("slide:".length());
		}

		var4.packetBuffer.writeByte(var7);
		var4.packetBuffer.writeByte(var9);
		if (var8 != null) {
			for (int var10 = 0; var10 < var8.length; ++var10) {
				var4.packetBuffer.writeByte(var8[var10]);
			}
		}

		ScriptFrame.method1172(var4.packetBuffer, var1);
		if (var0 == class369.field4042.rsOrdinal()) {
			var4.packetBuffer.writeByte(var3);
		}

		var4.packetBuffer.writeLengthByte(var4.packetBuffer.offset - var5);
		return var4;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIILir;II)V",
		garbageValue = "-288284631"
	)
	static void method1865(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		if (var3 != null && var3.hasSound()) {
			int var5 = var3.sizeX;
			int var6 = var3.sizeY;
			if (var4 == 1 || var4 == 3) {
				var5 = var3.sizeY;
				var6 = var3.sizeX;
			}

			int var7 = (var5 + var1) * 128;
			int var8 = (var6 + var2) * 128;
			var1 *= 128;
			var2 *= 128;
			int var9 = var3.ambientSoundId;
			int var10 = var3.int7 * 128;
			int var11 = var3.int8 * 16384;
			if (var3.transforms != null) {
				ObjectComposition var12 = var3.transform();
				if (var12 != null) {
					var9 = var12.ambientSoundId;
					var10 = var12.int7 * 128;
					var11 = var12.int8 * 16384;
				}
			}

			for (ObjectSound var13 = (ObjectSound)ObjectSound.objectSounds.last(); var13 != null; var13 = (ObjectSound)ObjectSound.objectSounds.previous()) {
				if (var0 == var13.plane && var13.x * 16384 == var1 && var2 == var13.y * 16384 && var7 == var13.maxX * 16384 && var8 == var13.maxY * 16384 && var9 == var13.soundEffectId && var10 == var13.field851 && var11 == var13.field847) {
					if (var13.stream1 != null) {
						class53.pcmStreamMixer.removeSubStream(var13.stream1);
						var13.stream1 = null;
					}

					if (var13.stream2 != null) {
						class53.pcmStreamMixer.removeSubStream(var13.stream2);
						var13.stream2 = null;
					}

					var13.remove();
					break;
				}
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([[[IIIIS)V",
		garbageValue = "-3425"
	)
	static final void method1634(int[][][] var0, int var1, int var2, int var3) {
		int var4;
		for (var4 = 0; var4 < 8; ++var4) {
			for (int var5 = 0; var5 < 8; ++var5) {
				var0[var1][var4 + var2][var3 + var5] = 0;
			}
		}

		if (var2 > 0) {
			for (var4 = 1; var4 < 8; ++var4) {
				var0[var1][var2][var3 + var4] = var0[var1][var2 - 1][var3 + var4];
			}
		}

		if (var3 > 0) {
			for (var4 = 1; var4 < 8; ++var4) {
				var0[var1][var4 + var2][var3] = var0[var1][var4 + var2][var3 - 1];
			}
		}

		if (var2 > 0 && var0[var1][var2 - 1][var3] != 0) {
			var0[var1][var2][var3] = var0[var1][var2 - 1][var3];
		} else if (var3 > 0 && var0[var1][var2][var3 - 1] != 0) {
			var0[var1][var2][var3] = var0[var1][var2][var3 - 1];
		} else if (var2 > 0 && var3 > 0 && var0[var1][var2 - 1][var3 - 1] != 0) {
			var0[var1][var2][var3] = var0[var1][var2 - 1][var3 - 1];
		}

	}
}
