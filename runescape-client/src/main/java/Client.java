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
import netscape.javascript.JSObject;
import org.json.JSONException;
import org.json.JSONObject;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed, OAuthApi, class339 {
	@ObfuscatedName("wq")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	static final class277 field793;
	@ObfuscatedName("wu")
	@ObfuscatedSignature(
		descriptor = "Lci;"
	)
	static final ApproximateRouteStrategy field798;
	@ObfuscatedName("xj")
	static int[] field799;
	@ObfuscatedName("xd")
	static int[] field800;
	@ObfuscatedName("wy")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("wa")
	@ObfuscatedGetter(
		intValue = 1988557135
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("wp")
	@ObfuscatedGetter(
		intValue = 1265137461
	)
	static int field692;
	@ObfuscatedName("wf")
	@ObfuscatedGetter(
		intValue = -260278961
	)
	static int field794;
	@ObfuscatedName("wo")
	static List field792;
	@ObfuscatedName("br")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	static Client client;
	@ObfuscatedName("bl")
	static boolean field497;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -981379219
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 731808139
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 913157539
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("cp")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("cz")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -848356977
	)
	static int field766;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 204884787
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -65984007
	)
	static int field498;
	@ObfuscatedName("cw")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("dn")
	static boolean field723;
	@ObfuscatedName("dc")
	static boolean field509;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -599201185
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("dj")
	static boolean field511;
	@ObfuscatedName("dk")
	static boolean field512;
	@ObfuscatedName("dt")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = -449024203
	)
	@Export("cycle")
	public static int cycle;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -974439007
	)
	@Export("serverCycle")
	static int serverCycle;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		longValue = 7453357615461186043L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = 1900697591
	)
	static int field517;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -13547589
	)
	static int field518;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		longValue = -3258060289522238341L
	)
	static long field557;
	@ObfuscatedName("db")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -529860643
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -1519497359
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = -1428275919
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = 1526007779
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = 1175894921
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = 222290645
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("ex")
	@ObfuscatedGetter(
		intValue = 1980301462
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("eq")
	@ObfuscatedGetter(
		intValue = 824611008
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("ef")
	@ObfuscatedGetter(
		intValue = -2112979999
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("et")
	@Export("z")
	static boolean z;
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	static class95 field533;
	@ObfuscatedName("el")
	@ObfuscatedGetter(
		intValue = -489561335
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("ea")
	@ObfuscatedGetter(
		intValue = 1587484709
	)
	static int field535;
	@ObfuscatedName("fk")
	@ObfuscatedGetter(
		intValue = -1918509341
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("fp")
	static boolean field765;
	@ObfuscatedName("fw")
	@ObfuscatedGetter(
		intValue = -1693499695
	)
	static int field501;
	@ObfuscatedName("fv")
	@ObfuscatedGetter(
		intValue = 315387193
	)
	static int field743;
	@ObfuscatedName("fj")
	@ObfuscatedGetter(
		intValue = -1356889721
	)
	static int field613;
	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	@Export("authenticationScheme")
	static AuthenticationScheme authenticationScheme;
	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "Lvx;"
	)
	static class561 field741;
	@ObfuscatedName("gh")
	@Export("BASIC_AUTH_DESKTOP_OSRS")
	static final String BASIC_AUTH_DESKTOP_OSRS;
	@ObfuscatedName("gf")
	@Export("BASIC_AUTH_DESKTOP_RUNELITE")
	static final String BASIC_AUTH_DESKTOP_RUNELITE;
	@ObfuscatedName("hy")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("hw")
	static int[] field563;
	@ObfuscatedName("hz")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("hh")
	@ObfuscatedGetter(
		intValue = 2005175169
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("ha")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "Lep;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("iy")
	@ObfuscatedGetter(
		intValue = -753899573
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("in")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("ic")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("it")
	static String field570;
	@ObfuscatedName("ip")
	@ObfuscatedGetter(
		intValue = 1985139729
	)
	static int field760;
	@ObfuscatedName("iw")
	@ObfuscatedGetter(
		intValue = 1320032181
	)
	static int field615;
	@ObfuscatedName("if")
	@ObfuscatedGetter(
		intValue = -845440981
	)
	static int field561;
	@ObfuscatedName("iv")
	@ObfuscatedGetter(
		intValue = 947213209
	)
	static int field572;
	@ObfuscatedName("ib")
	@ObfuscatedGetter(
		intValue = -1520132459
	)
	static int field573;
	@ObfuscatedName("js")
	static int[][][] field574;
	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	@Export("worldViewManager")
	static WorldViewManager worldViewManager;
	@ObfuscatedName("jk")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("jv")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("jg")
	static final int[] field578;
	@ObfuscatedName("jo")
	@ObfuscatedGetter(
		intValue = 8442019
	)
	static int field767;
	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	@Export("playerUpdateManager")
	static PlayerUpdateManager playerUpdateManager;
	@ObfuscatedName("jf")
	@ObfuscatedGetter(
		intValue = 903298571
	)
	@Export("graphicsCycle")
	static int graphicsCycle;
	@ObfuscatedName("kn")
	@ObfuscatedGetter(
		intValue = -1304757713
	)
	static int field582;
	@ObfuscatedName("kv")
	@ObfuscatedGetter(
		intValue = -792412525
	)
	static int field583;
	@ObfuscatedName("ky")
	@ObfuscatedGetter(
		intValue = -1837613567
	)
	static int field584;
	@ObfuscatedName("ks")
	@ObfuscatedGetter(
		intValue = -1169670661
	)
	static int field550;
	@ObfuscatedName("kq")
	static boolean field519;
	@ObfuscatedName("ke")
	@ObfuscatedGetter(
		intValue = 1035169597
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("kg")
	@ObfuscatedGetter(
		intValue = 921200069
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("ki")
	@ObfuscatedGetter(
		intValue = -975398401
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("ln")
	@ObfuscatedGetter(
		intValue = -710504759
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("lz")
	@ObfuscatedGetter(
		intValue = -1749269039
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("lt")
	@ObfuscatedGetter(
		intValue = -1747956069
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("lp")
	@ObfuscatedGetter(
		intValue = 982672521
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("lj")
	@ObfuscatedGetter(
		intValue = 26324039
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("lm")
	@ObfuscatedGetter(
		intValue = 149837393
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("lx")
	@ObfuscatedGetter(
		intValue = 1592670747
	)
	static int field596;
	@ObfuscatedName("ld")
	@ObfuscatedGetter(
		intValue = -1913121689
	)
	static int field539;
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = -845810053
	)
	static int field626;
	@ObfuscatedName("lw")
	@ObfuscatedGetter(
		intValue = -1176492027
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("lc")
	@ObfuscatedGetter(
		intValue = 2007883423
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("lq")
	@ObfuscatedGetter(
		intValue = 1382683315
	)
	@Export("revision")
	public static int revision;
	@ObfuscatedName("ly")
	static boolean field602;
	@ObfuscatedName("le")
	@ObfuscatedGetter(
		intValue = 831365017
	)
	static int field618;
	@ObfuscatedName("lb")
	static boolean field604;
	@ObfuscatedName("lv")
	@ObfuscatedGetter(
		intValue = 1550103637
	)
	static int field679;
	@ObfuscatedName("lr")
	@ObfuscatedGetter(
		intValue = 445822055
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("lo")
	@ObfuscatedGetter(
		intValue = -742333809
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("lh")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("lg")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("ll")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("ls")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("mk")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("mf")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("mt")
	static int[][] field651;
	@ObfuscatedName("mi")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("mp")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("my")
	@ObfuscatedGetter(
		intValue = 706602237
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("mc")
	@ObfuscatedGetter(
		intValue = 1166640163
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("mw")
	@ObfuscatedGetter(
		intValue = -980117309
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("mv")
	@ObfuscatedGetter(
		intValue = 1061273181
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("mo")
	@ObfuscatedGetter(
		intValue = -2049494319
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("mm")
	@ObfuscatedGetter(
		intValue = 1149165949
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("mr")
	@ObfuscatedGetter(
		intValue = 681871339
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("mn")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("me")
	@ObfuscatedGetter(
		intValue = -726804691
	)
	static int field625;
	@ObfuscatedName("mq")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("mg")
	@ObfuscatedGetter(
		intValue = -574230191
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("md")
	@ObfuscatedGetter(
		intValue = -1787460219
	)
	static int field628;
	@ObfuscatedName("mx")
	@ObfuscatedGetter(
		longValue = -936586484931709069L
	)
	@Export("userId")
	static long userId;
	@ObfuscatedName("mh")
	@ObfuscatedGetter(
		longValue = -8661975140875297179L
	)
	@Export("userHash")
	static long userHash;
	@ObfuscatedName("ma")
	static String field631;
	@ObfuscatedName("nb")
	@ObfuscatedGetter(
		intValue = 1592852041
	)
	static int field781;
	@ObfuscatedName("nv")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("ns")
	@ObfuscatedGetter(
		intValue = -845287713
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("np")
	@ObfuscatedGetter(
		intValue = 171921937
	)
	static int field635;
	@ObfuscatedName("nf")
	static int[] field537;
	@ObfuscatedName("nz")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("nd")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("nq")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("nl")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("nc")
	@ObfuscatedGetter(
		intValue = -242142319
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("ng")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("nm")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("nk")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("ny")
	static int[] field645;
	@ObfuscatedName("nn")
	@Export("leftClickOpensMenu")
	static boolean leftClickOpensMenu;
	@ObfuscatedName("nr")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "Lwl;"
	)
	@Export("menu")
	static Menu menu;
	@ObfuscatedName("nj")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("op")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("oi")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("oy")
	@ObfuscatedGetter(
		intValue = -474804625
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("om")
	@ObfuscatedGetter(
		intValue = 1658084859
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("oq")
	@ObfuscatedGetter(
		intValue = -1646391571
	)
	static int field654;
	@ObfuscatedName("ov")
	@ObfuscatedGetter(
		intValue = -1569373373
	)
	static int field655;
	@ObfuscatedName("of")
	@ObfuscatedGetter(
		intValue = -1064135721
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("oe")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("ol")
	@ObfuscatedGetter(
		intValue = -1656983683
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("ob")
	@ObfuscatedGetter(
		intValue = -992202243
	)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("ou")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("oa")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("ox")
	@ObfuscatedGetter(
		intValue = 313611491
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("ok")
	@ObfuscatedGetter(
		intValue = 1520275521
	)
	static int field665;
	@ObfuscatedName("oo")
	@ObfuscatedGetter(
		intValue = 1041490587
	)
	static int field707;
	@ObfuscatedName("pc")
	@ObfuscatedGetter(
		intValue = -1742606525
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("pq")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("pa")
	@ObfuscatedGetter(
		intValue = 1873060579
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("pl")
	@ObfuscatedGetter(
		intValue = 448837437
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("pt")
	@ObfuscatedGetter(
		intValue = 262182137
	)
	@Export("staffModLevel")
	static int staffModLevel;
	@ObfuscatedName("pk")
	@ObfuscatedGetter(
		intValue = 248491471
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("pb")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("pp")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("py")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	@Export("clickedWidget")
	public static Widget clickedWidget;
	@ObfuscatedName("pj")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("pu")
	@ObfuscatedGetter(
		intValue = -717618303
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("pe")
	@ObfuscatedGetter(
		intValue = 2041394719
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("pw")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("po")
	static boolean field523;
	@ObfuscatedName("pd")
	@ObfuscatedGetter(
		intValue = -427170013
	)
	static int field681;
	@ObfuscatedName("pv")
	@ObfuscatedGetter(
		intValue = -191643001
	)
	static int field682;
	@ObfuscatedName("ph")
	static boolean field683;
	@ObfuscatedName("pg")
	@ObfuscatedGetter(
		intValue = 639543253
	)
	static int field721;
	@ObfuscatedName("px")
	@ObfuscatedGetter(
		intValue = 1586560535
	)
	static int field685;
	@ObfuscatedName("pn")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("pf")
	@ObfuscatedGetter(
		intValue = -809719349
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("qu")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("qs")
	@ObfuscatedGetter(
		intValue = 770842345
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("qg")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("qm")
	@ObfuscatedGetter(
		intValue = 1013996033
	)
	static int field749;
	@ObfuscatedName("qj")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("qf")
	@ObfuscatedGetter(
		intValue = -1336364091
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("ql")
	static int[] field694;
	@ObfuscatedName("qb")
	@ObfuscatedGetter(
		intValue = 1745268863
	)
	static int field579;
	@ObfuscatedName("qr")
	@ObfuscatedGetter(
		intValue = -1089100315
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("qh")
	@ObfuscatedGetter(
		intValue = 224198131
	)
	static int field697;
	@ObfuscatedName("qa")
	@ObfuscatedGetter(
		intValue = -477095393
	)
	static int field770;
	@ObfuscatedName("qe")
	@ObfuscatedGetter(
		intValue = 762527647
	)
	static int field699;
	@ObfuscatedName("qp")
	@ObfuscatedGetter(
		intValue = -160645847
	)
	static int field700;
	@ObfuscatedName("qd")
	@ObfuscatedGetter(
		intValue = -1646084199
	)
	static int field701;
	@ObfuscatedName("qv")
	@ObfuscatedGetter(
		intValue = -1620123837
	)
	static int field714;
	@ObfuscatedName("qq")
	@ObfuscatedGetter(
		intValue = 2013497213
	)
	static int field499;
	@ObfuscatedName("qi")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	static class496 field803;
	@ObfuscatedName("qo")
	@ObfuscatedGetter(
		intValue = -619627907
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("qc")
	@ObfuscatedSignature(
		descriptor = "Lww;"
	)
	static class574 field755;
	@ObfuscatedName("qk")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("qt")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("scriptEvents2")
	static NodeDeque scriptEvents2;
	@ObfuscatedName("rp")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("scriptEvents3")
	static NodeDeque scriptEvents3;
	@ObfuscatedName("re")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	static NodeDeque field709;
	@ObfuscatedName("rg")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("rc")
	@ObfuscatedGetter(
		intValue = -1206320977
	)
	@Export("rootWidgetCount")
	public static int rootWidgetCount;
	@ObfuscatedName("rj")
	@ObfuscatedGetter(
		intValue = -1211154273
	)
	static int field619;
	@ObfuscatedName("rh")
	@Export("validRootWidgets")
	public static boolean[] validRootWidgets;
	@ObfuscatedName("rv")
	static boolean[] field732;
	@ObfuscatedName("rw")
	static boolean[] field580;
	@ObfuscatedName("rr")
	@Export("rootWidgetXs")
	public static int[] rootWidgetXs;
	@ObfuscatedName("rl")
	@Export("rootWidgetYs")
	public static int[] rootWidgetYs;
	@ObfuscatedName("ry")
	@Export("rootWidgetWidths")
	public static int[] rootWidgetWidths;
	@ObfuscatedName("rm")
	@Export("rootWidgetHeights")
	public static int[] rootWidgetHeights;
	@ObfuscatedName("rb")
	@ObfuscatedGetter(
		intValue = -92662397
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("rk")
	@ObfuscatedGetter(
		longValue = -4040198743471200231L
	)
	static long field541;
	@ObfuscatedName("rn")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("rf")
	@ObfuscatedGetter(
		intValue = -92434711
	)
	static int field632;
	@ObfuscatedName("ro")
	@ObfuscatedGetter(
		intValue = -1501535167
	)
	public static int field695;
	@ObfuscatedName("rs")
	static int[] field712;
	@ObfuscatedName("ru")
	@ObfuscatedGetter(
		intValue = 854034963
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("si")
	@ObfuscatedGetter(
		intValue = -318548323
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("sa")
	static String field516;
	@ObfuscatedName("ss")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("sc")
	@ObfuscatedGetter(
		intValue = -1085990789
	)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("so")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	@Export("indexCheck")
	static IndexCheck indexCheck;
	@ObfuscatedName("sx")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	static class267 field575;
	@ObfuscatedName("sy")
	@ObfuscatedGetter(
		intValue = -2066543529
	)
	static int field733;
	@ObfuscatedName("su")
	static int[] field589;
	@ObfuscatedName("sb")
	static int[] field735;
	@ObfuscatedName("sg")
	@ObfuscatedGetter(
		longValue = -946525446215822103L
	)
	static long field740;
	@ObfuscatedName("sz")
	@ObfuscatedSignature(
		descriptor = "[Lgq;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("sq")
	@ObfuscatedSignature(
		descriptor = "[Lgk;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("sd")
	@ObfuscatedGetter(
		intValue = 1301726103
	)
	static int field739;
	@ObfuscatedName("sv")
	@ObfuscatedGetter(
		intValue = 1472706269
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("sh")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("sl")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("sn")
	@ObfuscatedSignature(
		descriptor = "[Lvf;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("sj")
	@ObfuscatedGetter(
		intValue = -494910763
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("th")
	@ObfuscatedGetter(
		intValue = 920071481
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("ta")
	@ObfuscatedGetter(
		intValue = -1326480137
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("tw")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("tt")
	@ObfuscatedGetter(
		intValue = 744192101
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("tu")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("tg")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("tm")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("te")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("tv")
	static int[] field753;
	@ObfuscatedName("tj")
	@ObfuscatedSignature(
		descriptor = "[Lbg;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("tz")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("uq")
	static boolean field669;
	@ObfuscatedName("um")
	static boolean field757;
	@ObfuscatedName("ui")
	static boolean field758;
	@ObfuscatedName("us")
	@ObfuscatedGetter(
		intValue = 88628409
	)
	static int field801;
	@ObfuscatedName("ue")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	static class521 field657;
	@ObfuscatedName("ub")
	@ObfuscatedSignature(
		descriptor = "Luh;"
	)
	static class520 field725;
	@ObfuscatedName("ut")
	@ObfuscatedSignature(
		descriptor = "Luh;"
	)
	static class520 field761;
	@ObfuscatedName("up")
	static boolean field762;
	@ObfuscatedName("uj")
	static boolean[] field571;
	@ObfuscatedName("uy")
	static int[] field764;
	@ObfuscatedName("ur")
	static int[] field690;
	@ObfuscatedName("uu")
	static int[] field768;
	@ObfuscatedName("ud")
	static int[] field705;
	@ObfuscatedName("ul")
	static short field609;
	@ObfuscatedName("vj")
	static short field656;
	@ObfuscatedName("vh")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("vr")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("ve")
	static short field772;
	@ObfuscatedName("vd")
	static short field773;
	@ObfuscatedName("vo")
	static short field702;
	@ObfuscatedName("vk")
	static short field775;
	@ObfuscatedName("vw")
	@ObfuscatedGetter(
		intValue = 319242269
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("vt")
	@ObfuscatedGetter(
		intValue = -1835546011
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("vv")
	@ObfuscatedGetter(
		intValue = -1034761467
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("vy")
	@ObfuscatedGetter(
		intValue = 2037360197
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("vn")
	@ObfuscatedGetter(
		intValue = -1463071545
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("vl")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("playerAppearance")
	static final PlayerComposition playerAppearance;
	@ObfuscatedName("vu")
	@ObfuscatedGetter(
		intValue = 853411881
	)
	static int field621;
	@ObfuscatedName("vx")
	@ObfuscatedGetter(
		intValue = 1201978701
	)
	static int field783;
	@ObfuscatedName("vs")
	@ObfuscatedSignature(
		descriptor = "Ltb;"
	)
	static class517 field686;
	@ObfuscatedName("vm")
	@ObfuscatedSignature(
		descriptor = "[Lpu;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("vb")
	@ObfuscatedSignature(
		descriptor = "Lcl;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("vf")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	static class465 field636;
	@ObfuscatedName("wc")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("DBTableIndex_cache")
	static EvictingDualNodeHashTable DBTableIndex_cache;
	@ObfuscatedName("wr")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("archive11")
	static EvictingDualNodeHashTable archive11;
	@ObfuscatedName("wk")
	@ObfuscatedGetter(
		intValue = 918583365
	)
	static int field790;
	@ObfuscatedName("wg")
	@ObfuscatedGetter(
		intValue = 1979575967
	)
	public static int field791;
	@ObfuscatedName("gm")
	@Export("token")
	String token;
	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	@Export("asyncRestClient")
	AsyncRestClient asyncRestClient;
	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	@Export("asyncGameSessionTokenResponse")
	AsyncHttpResponse asyncGameSessionTokenResponse;
	@ObfuscatedName("go")
	@Export("otlTokenRequester")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/OtlTokenRequester;"
	)
	OtlTokenRequester otlTokenRequester;
	@ObfuscatedName("gz")
	@Export("otlTokenRequestFuture")
	Future otlTokenRequestFuture;
	@ObfuscatedName("ge")
	@Export("https")
	boolean https;
	@ObfuscatedName("gs")
	@ObfuscatedGetter(
		intValue = 1470855235
	)
	@Export("clientId")
	int clientId;
	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	@Export("asyncAccessTokenResponse")
	AsyncHttpResponse asyncAccessTokenResponse;
	@ObfuscatedName("gx")
	@Export("refreshAccessTokenRequester")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	RefreshAccessTokenRequester refreshAccessTokenRequester;
	@ObfuscatedName("gi")
	@Export("refreshAccessTokenRequestFuture")
	Future refreshAccessTokenRequestFuture;
	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	Buffer field558;
	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	class7 field559;
	@ObfuscatedName("hd")
	@ObfuscatedGetter(
		longValue = 2255117434739773081L
	)
	@Export("accountHash")
	long accountHash;

	static {
		field497 = true;
		worldId = 1;
		worldProperties = 0;
		gameBuild = 0;
		isMembersWorld = false;
		isLowDetail = false;
		field766 = -1;
		clientType = -1;
		field498 = -1;
		onMobile = false;
		field723 = false;
		field509 = false;
		gameState = 0;
		field511 = false;
		field512 = false;
		isLoading = true;
		cycle = 0;
		serverCycle = 0;
		mouseLastLastPressedTimeMillis = 1L;
		field517 = -1;
		field518 = -1;
		field557 = -1L;
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
		field533 = class95.field1157;
		js5ConnectState = 0;
		field535 = 0;
		js5Errors = 0;
		field501 = 0;
		field743 = 0;
		field613 = 0;
		authenticationScheme = AuthenticationScheme.USERNAME_PASSWORD;
		field741 = class561.field5530;
		BASIC_AUTH_DESKTOP_OSRS = CollisionMap.method5830(method1772("com_jagex_auth_desktop_osrs:public"));
		BASIC_AUTH_DESKTOP_RUNELITE = CollisionMap.method5830(method1772("com_jagex_auth_desktop_runelite:public"));
		Login_isUsernameRemembered = false;
		secureRandomFuture = new SecureRandomFuture();
		field563 = new int[4];
		randomDatData = null;
		npcCount = 0;
		npcIndices = new int[250];
		packetWriter = new PacketWriter();
		logoutTimer = 0;
		hadNetworkError = false;
		timer = new Timer();
		fontsMap = new HashMap();
		field760 = 0;
		field615 = 1;
		field561 = 0;
		field572 = 1;
		field573 = 0;
		field574 = new int[4][13][13];
		worldViewManager = new WorldViewManager();
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		field578 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		field767 = -1;
		playerUpdateManager = new PlayerUpdateManager();
		graphicsCycle = 0;
		field582 = 2301979;
		field583 = 5063219;
		field584 = 3353893;
		field550 = 7759444;
		field519 = false;
		alternativeScrollbarWidth = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		mouseCamClickedX = 0;
		mouseCamClickedY = 0;
		oculusOrbState = 0;
		camFollowHeight = 50;
		field596 = 0;
		field539 = 0;
		field626 = 0;
		oculusOrbNormalSpeed = 12;
		oculusOrbSlowedSpeed = 6;
		revision = 0;
		field602 = false;
		field618 = 0;
		field604 = false;
		field679 = 0;
		overheadTextCount = 0;
		overheadTextLimit = 50;
		overheadTextXs = new int[overheadTextLimit];
		overheadTextYs = new int[overheadTextLimit];
		overheadTextAscents = new int[overheadTextLimit];
		overheadTextXOffsets = new int[overheadTextLimit];
		overheadTextColors = new int[overheadTextLimit];
		overheadTextEffects = new int[overheadTextLimit];
		field651 = new int[overheadTextLimit][];
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
		field625 = 0;
		showLoadingMessages = true;
		localPlayerIndex = -1;
		field628 = 0;
		userId = -1L;
		userHash = -1L;
		field631 = "";
		field781 = -1;
		renderSelf = true;
		drawPlayerNames = 0;
		field635 = 0;
		field537 = new int[1000];
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
		playerMenuActions = new String[8];
		playerOptionsPriorities = new boolean[8];
		defaultRotations = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
		combatTargetPlayerIndex = -1;
		currentLevels = new int[25];
		levels = new int[25];
		experience = new int[25];
		field645 = new int[25];
		leftClickOpensMenu = false;
		isMenuOpen = false;
		menu = new Menu(true);
		followerOpsLowPriority = false;
		tapToDrop = false;
		showMouseOverText = true;
		viewportX = -1;
		viewportY = -1;
		field654 = 0;
		field655 = 50;
		isItemSelected = 0;
		field570 = null;
		isSpellSelected = false;
		selectedSpellChildIndex = -1;
		selectedSpellItemId = -1;
		selectedSpellActionName = null;
		selectedSpellName = null;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field665 = 0;
		field707 = -1;
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
		field523 = false;
		field681 = -1;
		field682 = -1;
		field683 = false;
		field721 = -1;
		field685 = -1;
		isDraggingWidget = false;
		cycleCntr = 1;
		changedVarps = new int[32];
		changedVarpCount = 0;
		changedItemContainers = new int[32];
		field749 = 0;
		changedSkills = new int[32];
		changedSkillsCount = 0;
		field694 = new int[32];
		field579 = 0;
		chatCycle = 0;
		field697 = 0;
		field770 = 0;
		field699 = 0;
		field700 = 0;
		field701 = 0;
		field714 = 0;
		field499 = 0;
		mouseWheelRotation = 0;
		field755 = new class574();
		scriptEvents = new NodeDeque();
		scriptEvents2 = new NodeDeque();
		scriptEvents3 = new NodeDeque();
		field709 = new NodeDeque();
		widgetFlags = new NodeHashTable(512);
		rootWidgetCount = 0;
		field619 = -2;
		validRootWidgets = new boolean[100];
		field732 = new boolean[100];
		field580 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field541 = 0L;
		isResizable = true;
		field632 = 600;
		field695 = field632 / GameEngine.cycleDurationMillis;
		field712 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		publicChatMode = 0;
		tradeChatMode = 0;
		field516 = "";
		crossWorldMessageIds = new long[100];
		crossWorldMessageIdsIndex = 0;
		indexCheck = new IndexCheck();
		field575 = new class267();
		field733 = 0;
		field589 = new int[128];
		field735 = new int[128];
		field740 = -1L;
		currentClanSettings = new ClanSettings[4];
		currentClanChannels = new ClanChannel[4];
		field739 = -1;
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
		field753 = new int[50];
		soundEffects = new SoundEffect[50];
		isCameraLocked = false;
		field669 = false;
		field757 = false;
		field758 = false;
		field657 = null;
		field725 = null;
		field761 = null;
		field762 = false;
		field571 = new boolean[5];
		field764 = new int[5];
		field690 = new int[5];
		field768 = new int[5];
		field705 = new int[5];
		field609 = 256;
		field656 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field772 = 1;
		field773 = 32767;
		field702 = 1;
		field775 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		playerAppearance = new PlayerComposition();
		field621 = -1;
		field783 = -1;
		field686 = new DesktopPlatformInfoProvider();
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		field636 = new class465(8, class463.field4954);
		DBTableIndex_cache = new EvictingDualNodeHashTable(64);
		archive11 = new EvictingDualNodeHashTable(64);
		field790 = -1;
		field791 = -1;
		field792 = new ArrayList();
		field793 = new class277();
		field794 = 30;
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field692 = 0;
		field798 = new ApproximateRouteStrategy();
		field799 = new int[50];
		field800 = new int[50];
	}

	public Client() {
		this.https = false;
		this.clientId = 0;
		this.accountHash = -1L;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1848806273"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field541 = ReflectionCheck.method724() + 500L;
		this.resizeJS();
		if (rootInterface != -1) {
			this.method1317(true);
		}

	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-494623143"
	)
	@Export("setUp")
	protected final void setUp() {
		class163.method3778(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
		int var2 = worldProperties;
		class552 var3 = class552.field5442;
		boolean var1 = (var2 & var3.rsOrdinal()) != 0;
		class273.field3035 = var1;
		PlayerComposition.worldPort = gameBuild == 0 ? 43594 : worldId + 40000;
		class173.js5Port = gameBuild == 0 ? 443 : worldId + 50000;
		class340.currentPort = PlayerComposition.worldPort;
		FontName.field5323 = class360.field3860;
		PlayerComposition.field3816 = class360.field3858;
		class169.field1805 = class360.field3856;
		class7.field30 = class360.field3855;
		class280.urlRequester = new SecureUrlRequester(this.https, 228);
		this.setUpKeyboard();
		this.setUpMouse();
		ClanSettings.mouseWheel = this.mouseWheel();
		this.method533(field575, 0);
		this.method533(indexCheck, 1);
		this.setUpClipboard();
		ReflectionCheck.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		AccessFile var5 = null;
		ClientPreferences var6 = new ClientPreferences();

		try {
			var5 = class31.getPreferencesFile("", StructComposition.field2749.name, false);
			byte[] var7 = new byte[(int)var5.length()];

			int var9;
			for (int var8 = 0; var8 < var7.length; var8 += var9) {
				var9 = var5.read(var7, var8, var7.length - var8);
				if (var9 == -1) {
					throw new IOException();
				}
			}

			var6 = new ClientPreferences(new Buffer(var7));
		} catch (Exception var11) {
		}

		try {
			if (var5 != null) {
				var5.close();
			}
		} catch (Exception var10) {
		}

		class544.clientPreferences = var6;
		GraphicsObject.method2356(this, BufferedNetSocket.field5063);
		PacketBuffer.setWindowedMode(class544.clientPreferences.getWindowMode());
		HttpRequest.friendSystem = new FriendSystem(class383.loginType);
		this.asyncRestClient = new AsyncRestClient("tokenRequest", 1, 1);
		class7.method50(this);
		field793.method5940();
		ModelData var12 = new ModelData(3, 1, 0);
		var12.method3942(-64, -8, 64);
		var12.method3942(64, -8, 64);
		var12.method3942(0, -8, -24);
		var12.method3954(0, 2, 1, (byte)1, (byte)-1, (short)-1, (short)-1);
		class53.field338 = var12.toModel(128, 256, 0, -128, 0);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1077900572"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle;
		this.doCycleJs5();
		WorldMapData_1.method6298();
		boolean var2 = false;
		boolean var3 = false;
		if (!class333.field3629.isEmpty()) {
			SongTask var4 = (SongTask)class333.field3629.get(0);
			if (var4 == null) {
				class333.field3629.remove(0);
			} else if (var4.vmethod8883()) {
				if (var4.method8855()) {
					System.out.println("Error in midimanager.service: " + var4.method8870());
					var2 = true;
				} else {
					if (var4.method8860() != null) {
						class333.field3629.add(1, var4.method8860());
					}

					var3 = var4.method8858();
				}

				class333.field3629.remove(0);
			} else {
				var3 = var4.method8858();
			}
		}

		if (var2) {
			class333.field3629.clear();
			Iterator var10 = class333.musicSongs.iterator();

			label125:
			while (true) {
				MusicSong var5;
				do {
					if (!var10.hasNext()) {
						class333.musicSongs.clear();
						break label125;
					}

					var5 = (MusicSong)var10.next();
				} while(var5 == null);

				var5.midiPcmStream.clear();
				var5.midiPcmStream.method6714();
				var5.midiPcmStream.setPcmStreamVolume(0);
				var5.midiPcmStream.field3668 = 0;
				int var6 = var5.musicTrackGroupId;
				int var7 = var5.musicTrackFileId;
				Iterator var8 = class333.field3627.iterator();

				while (var8.hasNext()) {
					class339 var9 = (class339)var8.next();
					var9.vmethod6894(var6, var7);
				}
			}
		}

		if (var3 && playingJingle && class328.pcmPlayer1 != null) {
			class328.pcmPlayer1.tryDiscard();
		}

		class113.method3178();
		indexCheck.method5763();
		this.method532();
		TaskHandler.method4914();
		if (ClanSettings.mouseWheel != null) {
			int var11 = ClanSettings.mouseWheel.useRotation();
			mouseWheelRotation = var11;
		}

		if (gameState == 0) {
			ArchiveLoader.method2581();
			GrandExchangeOfferWorldComparator.method7902();
		} else if (gameState == 5) {
			class4.loginScreen(this, FontName.fontPlain11, HealthBarUpdate.fontPlain12);
			ArchiveLoader.method2581();
			GrandExchangeOfferWorldComparator.method7902();
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				class4.loginScreen(this, FontName.fontPlain11, HealthBarUpdate.fontPlain12);
				this.doCycleLoggedOut();
			} else if (gameState == 50) {
				class4.loginScreen(this, FontName.fontPlain11, HealthBarUpdate.fontPlain12);
				this.doCycleLoggedOut();
			} else if (gameState == 25) {
				if (field723) {
					class213.loadRegion();
				}

				if (field509) {
					GrandExchangeEvents.method7859(class151.field1683);
				}

				if (!field509 && !field723) {
					class360.updateGameState(30);
				}
			}
		} else {
			class4.loginScreen(this, FontName.fontPlain11, HealthBarUpdate.fontPlain12);
		}

		if (gameState == 30) {
			this.doCycleLoggedIn();
		} else if (gameState == 40 || gameState == 45) {
			this.doCycleLoggedOut();
		}

	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-861113109"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field541 && ReflectionCheck.method724() > field541) {
			PacketBuffer.setWindowedMode(TextureProvider.getWindowedMode());
		}

		int var2;
		if (var1) {
			for (var2 = 0; var2 < 100; ++var2) {
				validRootWidgets[var2] = true;
			}
		}

		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1, field765);
		} else if (gameState == 5) {
			BuddyRankComparator.drawTitle(GraphicsObject.fontBold12, FontName.fontPlain11, HealthBarUpdate.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				BuddyRankComparator.drawTitle(GraphicsObject.fontBold12, FontName.fontPlain11, HealthBarUpdate.fontPlain12);
			} else if (gameState == 50) {
				BuddyRankComparator.drawTitle(GraphicsObject.fontBold12, FontName.fontPlain11, HealthBarUpdate.fontPlain12);
			} else if (gameState == 25) {
				if (field573 == 1) {
					if (field760 > field615) {
						field615 = field760;
					}

					var2 = (field615 * 50 - field760 * 50) / field615;
					class328.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
				} else if (field573 == 2) {
					if (field561 > field572) {
						field572 = field561;
					}

					var2 = (field572 * 50 - field561 * 50) / field572 + 50;
					class328.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
				} else {
					class328.drawLoadingMessage("Loading - please wait.", false);
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				class328.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) {
				class328.drawLoadingMessage("Please wait...", false);
			}
		} else {
			BuddyRankComparator.drawTitle(GraphicsObject.fontBold12, FontName.fontPlain11, HealthBarUpdate.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				if (field732[var2]) {
					class6.rasterProvider.draw(rootWidgetXs[var2], rootWidgetYs[var2], rootWidgetWidths[var2], rootWidgetHeights[var2]);
					field732[var2] = false;
				}
			}
		} else if (gameState > 0) {
			class6.rasterProvider.drawFull(0, 0);

			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				field732[var2] = false;
			}
		}

	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-12"
	)
	@Export("kill0")
	protected final void kill0() {
		if (HttpRequestTask.varcs != null && HttpRequestTask.varcs.hasUnwrittenChanges()) {
			HttpRequestTask.varcs.write();
		}

		if (class168.mouseRecorder != null) {
			class168.mouseRecorder.isRunning = false;
		}

		class168.mouseRecorder = null;
		packetWriter.close();
		if (MouseHandler.MouseHandler_instance != null) {
			synchronized(MouseHandler.MouseHandler_instance) {
				MouseHandler.MouseHandler_instance = null;
			}
		}

		ClanSettings.mouseWheel = null;
		if (class328.pcmPlayer1 != null) {
			class328.pcmPlayer1.shutdown();
		}

		HitSplatDefinition.field2760.method7855();
		TaskHandler.method4916();
		if (class280.urlRequester != null) {
			class280.urlRequester.close();
			class280.urlRequester = null;
		}

		class150.method3592();
		this.asyncRestClient.shutdown();
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "26444"
	)
	protected final void vmethod1282() {
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1866254902"
	)
	@Export("isRuneLite")
	boolean isRuneLite() {
		return this.clientId == 1;
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "167724786"
	)
	@Export("containsAccessAndRefreshToken")
	boolean containsAccessAndRefreshToken() {
		return class431.accessToken != null && !class431.accessToken.trim().isEmpty() && class165.refreshToken != null && !class165.refreshToken.trim().isEmpty();
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "26"
	)
	@Export("containsSessionAndCharacterId")
	boolean containsSessionAndCharacterId() {
		return AsyncHttpResponse.sessionId != null && !AsyncHttpResponse.sessionId.trim().isEmpty() && DevicePcmPlayerProvider.characterId != null && !DevicePcmPlayerProvider.characterId.trim().isEmpty();
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1810219588"
	)
	@Export("otlTokenRequesterInitialized")
	boolean otlTokenRequesterInitialized() {
		return this.otlTokenRequester != null;
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "497391787"
	)
	@Export("requestRefreshAccessToken")
	void requestRefreshAccessToken(String var1) throws IOException {
		HashMap var2 = new HashMap();
		var2.put("grant_type", "refresh_token");
		var2.put("scope", "gamesso.token.create");
		var2.put("refresh_token", var1);
		URL var3 = new URL(FriendLoginUpdate.authServiceBaseUrl + "shield/oauth/token" + (new HttpQueryParams(var2)).encode());
		HttpHeaders var4 = new HttpHeaders();
		if (this.isRuneLite()) {
			var4.basicAuthentication(BASIC_AUTH_DESKTOP_RUNELITE);
		} else {
			var4.basicAuthentication(BASIC_AUTH_DESKTOP_OSRS);
		}

		var4.header("Host", (new URL(FriendLoginUpdate.authServiceBaseUrl)).getHost());
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

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "3"
	)
	@Export("requestOtlToken")
	void requestOtlToken(String var1) throws IOException {
		URL var2 = new URL(FriendLoginUpdate.authServiceBaseUrl + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
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

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;S)V",
		garbageValue = "-9953"
	)
	@Export("authenticate")
	void authenticate(String var1, String var2) throws IOException, JSONException {
		URL var3 = new URL(RouteStrategy.gameSessionServiceBaseUrl + "game-session/v1/tokens");
		HttpRequest var4 = new HttpRequest(var3, HttpMethod.POST, this.https);
		var4.getHeaders().bearerToken(var1);
		var4.getHeaders().accept(HttpContentType.APPLICATION_JSON);
		JSONObject var5 = new JSONObject();
		var5.setProperty("accountId", var2);
		var4.setPayload(new HttpJsonRequestBody(var5));
		this.asyncGameSessionTokenResponse = this.asyncRestClient.submitRequest(var4);
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1900073120"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			boolean var1 = HitSplatDefinition.field2760.method7822();
			if (!var1) {
				this.method1302();
			}

		}
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1705512742"
	)
	void method1302() {
		if (HitSplatDefinition.field2760.field4617 >= 4) {
			this.error("js5crc");
			class360.updateGameState(1000);
		} else {
			if (HitSplatDefinition.field2760.field4622 >= 4) {
				if (gameState <= 5) {
					this.error("js5io");
					class360.updateGameState(1000);
					return;
				}

				field535 = 3000;
				HitSplatDefinition.field2760.field4622 = 3;
			}

			if (--field535 + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						class466.js5SocketTask = GameEngine.taskHandler.newSocketTask(FontName.worldHost, class340.currentPort);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (class466.js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (class466.js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						class369.js5Socket = Skills.method7618((Socket)class466.js5SocketTask.result, 40000, 5000);
						Buffer var1 = new Buffer(class326.field3583.field3591 + 1);
						var1.writeByte(class326.field3583.field3590);
						var1.writeInt(228);
						var1.writeInt(field563[0]);
						var1.writeInt(field563[1]);
						var1.writeInt(field563[2]);
						var1.writeInt(field563[3]);
						class369.js5Socket.write(var1.array, 0, class326.field3583.field3591 + 1);
						++js5ConnectState;
						class133.field1548 = ReflectionCheck.method724();
					}

					if (js5ConnectState == 3) {
						if (class369.js5Socket.available() > 0) {
							int var2 = class369.js5Socket.readUnsignedByte();
							if (var2 != 0) {
								this.js5Error(var2);
								return;
							}

							++js5ConnectState;
						} else if (ReflectionCheck.method724() - class133.field1548 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						HitSplatDefinition.field2760.method7835(class369.js5Socket, gameState > 20);
						class466.js5SocketTask = null;
						class369.js5Socket = null;
						js5ConnectState = 0;
						js5Errors = 0;
					}
				} catch (IOException var3) {
					this.js5Error(-3);
				}

			}
		}
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-97"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		class466.js5SocketTask = null;
		class369.js5Socket = null;
		js5ConnectState = 0;
		if (PlayerComposition.worldPort == class340.currentPort) {
			class340.currentPort = class173.js5Port;
		} else {
			class340.currentPort = PlayerComposition.worldPort;
		}

		++js5Errors;
		if (js5Errors < 2 || var1 != 7 && var1 != 9) {
			if (js5Errors >= 2 && var1 == 6) {
				this.error("js5connect_outofdate");
				class360.updateGameState(1000);
			} else if (js5Errors >= 4) {
				if (gameState <= 5) {
					this.error("js5connect");
					class360.updateGameState(1000);
				} else {
					field535 = 3000;
				}
			}
		} else if (gameState <= 5) {
			this.error("js5connect_full");
			class360.updateGameState(1000);
		} else {
			field535 = 3000;
		}

	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1419144711"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		AbstractSocket var1 = packetWriter.getSocket();
		PacketBuffer var2 = packetWriter.packetBuffer;

		try {
			if (LoginState.SHUTDOWN_PREVIOUS_CONNECTION == VarpDefinition.loginState) {
				if (ReflectionCheck.field228 == null && (secureRandomFuture.isDone() || field501 > 250)) {
					ReflectionCheck.field228 = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (ReflectionCheck.field228 != null) {
					if (var1 != null) {
						var1.close();
						var1 = null;
					}

					class136.field1587 = null;
					hadNetworkError = false;
					field501 = 0;
					if (field741.method10576()) {
						if (this.containsAccessAndRefreshToken()) {
							try {
								this.requestRefreshAccessToken(class165.refreshToken);
								DevicePcmPlayerProvider.updateLoginState(LoginState.TOKEN_RESPONSE);
							} catch (Throwable var24) {
								class255.RunException_sendStackTrace((String)null, var24);
								MouseRecorder.getLoginError(65);
								return;
							}
						} else {
							if (!this.containsSessionAndCharacterId()) {
								MouseRecorder.getLoginError(65);
								return;
							}

							try {
								this.authenticate(AsyncHttpResponse.sessionId, DevicePcmPlayerProvider.characterId);
								DevicePcmPlayerProvider.updateLoginState(LoginState.REFRESHING_TOKEN);
							} catch (Exception var23) {
								class255.RunException_sendStackTrace((String)null, var23);
								MouseRecorder.getLoginError(65);
								return;
							}
						}
					} else {
						DevicePcmPlayerProvider.updateLoginState(LoginState.INIT_MOUSEHANDLER_SOCKET);
					}
				}
			}

			HttpResponse var27;
			if (VarpDefinition.loginState == LoginState.TOKEN_RESPONSE) {
				if (this.refreshAccessTokenRequestFuture != null) {
					if (!this.refreshAccessTokenRequestFuture.isDone()) {
						return;
					}

					if (this.refreshAccessTokenRequestFuture.isCancelled()) {
						MouseRecorder.getLoginError(65);
						this.refreshAccessTokenRequestFuture = null;
						return;
					}

					try {
						RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.refreshAccessTokenRequestFuture.get();
						if (!var3.isSuccess()) {
							MouseRecorder.getLoginError(65);
							this.refreshAccessTokenRequestFuture = null;
							return;
						}

						class431.accessToken = var3.getAccessToken();
						class165.refreshToken = var3.getRefreshToken();
						this.refreshAccessTokenRequestFuture = null;
					} catch (Exception var22) {
						class255.RunException_sendStackTrace((String)null, var22);
						MouseRecorder.getLoginError(65);
						this.refreshAccessTokenRequestFuture = null;
						return;
					}
				} else {
					if (this.asyncAccessTokenResponse == null) {
						MouseRecorder.getLoginError(65);
						return;
					}

					if (!this.asyncAccessTokenResponse.hasFinished()) {
						return;
					}

					if (this.asyncAccessTokenResponse.hasError()) {
						class255.RunException_sendStackTrace(this.asyncAccessTokenResponse.getErrorMessage(), (Throwable)null);
						MouseRecorder.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}

					var27 = this.asyncAccessTokenResponse.await();
					if (var27.getResponseCode() != 200) {
						MouseRecorder.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}

					field501 = 0;
					HttpJsonRequestBody var4 = new HttpJsonRequestBody(var27.getResponseBody());

					try {
						class431.accessToken = var4.getBody().getString("access_token");
						class165.refreshToken = var4.getBody().getString("refresh_token");
					} catch (Exception var21) {
						class255.RunException_sendStackTrace("Error parsing tokens", var21);
						MouseRecorder.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}
				}

				this.requestOtlToken(class431.accessToken);
				DevicePcmPlayerProvider.updateLoginState(LoginState.REFRESHING_TOKEN);
			}

			if (VarpDefinition.loginState == LoginState.REFRESHING_TOKEN) {
				if (this.otlTokenRequestFuture != null) {
					if (!this.otlTokenRequestFuture.isDone()) {
						return;
					}

					if (this.otlTokenRequestFuture.isCancelled()) {
						MouseRecorder.getLoginError(65);
						this.otlTokenRequestFuture = null;
						return;
					}

					try {
						OtlTokenResponse var28 = (OtlTokenResponse)this.otlTokenRequestFuture.get();
						if (!var28.isSuccess()) {
							MouseRecorder.getLoginError(65);
							this.otlTokenRequestFuture = null;
							return;
						}

						this.token = var28.getToken();
						this.otlTokenRequestFuture = null;
					} catch (Exception var20) {
						class255.RunException_sendStackTrace((String)null, var20);
						MouseRecorder.getLoginError(65);
						this.otlTokenRequestFuture = null;
						return;
					}
				} else {
					if (this.asyncGameSessionTokenResponse == null) {
						MouseRecorder.getLoginError(65);
						return;
					}

					if (!this.asyncGameSessionTokenResponse.hasFinished()) {
						return;
					}

					if (this.asyncGameSessionTokenResponse.hasError()) {
						class255.RunException_sendStackTrace(this.asyncGameSessionTokenResponse.getErrorMessage(), (Throwable)null);
						MouseRecorder.getLoginError(65);
						this.asyncGameSessionTokenResponse = null;
						return;
					}

					var27 = this.asyncGameSessionTokenResponse.await();
					if (var27.getResponseCode() != 200) {
						class255.RunException_sendStackTrace("Login authentication error. Response code: " + var27.getResponseCode() + " " + var27.method301() + " Response body: " + var27.getResponseBody(), (Throwable)null);
						MouseRecorder.getLoginError(65);
						this.asyncGameSessionTokenResponse = null;
						return;
					}

					List var30 = (List)var27.getHeaderFields().get("Content-Type");
					if (var30 != null && var30.contains(HttpContentType.APPLICATION_JSON.getValue())) {
						try {
							JSONObject var5 = new JSONObject(var27.getResponseBody());
							this.token = var5.getString("token");
						} catch (JSONException var19) {
							class255.RunException_sendStackTrace((String)null, var19);
							MouseRecorder.getLoginError(65);
							this.asyncGameSessionTokenResponse = null;
							return;
						}
					} else {
						this.token = var27.getResponseBody();
					}

					this.asyncGameSessionTokenResponse = null;
				}

				field501 = 0;
				DevicePcmPlayerProvider.updateLoginState(LoginState.INIT_MOUSEHANDLER_SOCKET);
			}

			if (VarpDefinition.loginState == LoginState.INIT_MOUSEHANDLER_SOCKET) {
				if (class136.field1587 == null) {
					class136.field1587 = GameEngine.taskHandler.newSocketTask(FontName.worldHost, class340.currentPort);
				}

				if (class136.field1587.status == 2) {
					throw new IOException();
				}

				if (class136.field1587.status == 1) {
					var1 = Skills.method7618((Socket)class136.field1587.result, 40000, 5000);
					packetWriter.setSocket(var1);
					class136.field1587 = null;
					DevicePcmPlayerProvider.updateLoginState(LoginState.UNMAPPED_20);
				}
			}

			PacketBufferNode var29;
			if (LoginState.UNMAPPED_20 == VarpDefinition.loginState) {
				packetWriter.clearBuffer();
				var29 = class288.method6320();
				var29.packetBuffer.writeByte(class326.field3593.field3590);
				packetWriter.addNode(var29);
				packetWriter.flush();
				var2.offset = 0;
				DevicePcmPlayerProvider.updateLoginState(LoginState.READ_LOGIN_STATUS);
			}

			int var14;
			if (LoginState.READ_LOGIN_STATUS == VarpDefinition.loginState) {
				if (class328.pcmPlayer1 != null) {
					class328.pcmPlayer1.method807();
				}

				if (var1.isAvailable(1)) {
					var14 = var1.readUnsignedByte();
					if (class328.pcmPlayer1 != null) {
						class328.pcmPlayer1.method807();
					}

					if (var14 != 0) {
						MouseRecorder.getLoginError(var14);
						return;
					}

					var2.offset = 0;
					DevicePcmPlayerProvider.updateLoginState(LoginState.READ_RANDOM_VERIFICATION_NUMBER);
				}
			}

			if (LoginState.READ_RANDOM_VERIFICATION_NUMBER == VarpDefinition.loginState) {
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
					WorldMapRegion.field3124 = var2.readLong();
					DevicePcmPlayerProvider.updateLoginState(LoginState.WRITE_INITIAL_LOGIN_PACKET);
				}
			}

			if (LoginState.WRITE_INITIAL_LOGIN_PACKET == VarpDefinition.loginState) {
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var31 = new PacketBuffer(500);
				int[] var32 = new int[]{ReflectionCheck.field228.nextInt(), ReflectionCheck.field228.nextInt(), ReflectionCheck.field228.nextInt(), ReflectionCheck.field228.nextInt()};
				var31.offset = 0;
				var31.writeByte(1);
				var31.writeInt(var32[0]);
				var31.writeInt(var32[1]);
				var31.writeInt(var32[2]);
				var31.writeInt(var32[3]);
				var31.writeLong(WorldMapRegion.field3124);
				if (gameState == 40) {
					var31.writeInt(field563[0]);
					var31.writeInt(field563[1]);
					var31.writeInt(field563[2]);
					var31.writeInt(field563[3]);
				} else {
					if (gameState == 50) {
						var31.writeByte(AuthenticationScheme.field1663.rsOrdinal());
						var31.writeInt(UserComparator4.field1481);
					} else {
						var31.writeByte(authenticationScheme.rsOrdinal());
						switch(authenticationScheme.schemeId) {
						case 1:
							var31.writeInt(class544.clientPreferences.getParameterValue(Login.Login_username));
							break;
						case 2:
						case 4:
							var31.writeMedium(class326.otpMedium);
							++var31.offset;
							break;
						case 3:
							var31.offset += 4;
						}
					}

					if (field741.method10576()) {
						var31.writeByte(class561.field5525.rsOrdinal());
						var31.writeStringCp1252NullTerminated(this.token);
					} else {
						var31.writeByte(class561.field5530.rsOrdinal());
						var31.writeStringCp1252NullTerminated(Login.Login_password);
					}
				}

				var31.encryptRsa(class77.field916, class77.field917);
				field563 = var32;
				PacketBufferNode var35 = class288.method6320();
				var35.packetBuffer.offset = 0;
				if (gameState == 40) {
					var35.packetBuffer.writeByte(class326.field3582.field3590);
				} else {
					var35.packetBuffer.writeByte(class326.field3584.field3590);
				}

				var35.packetBuffer.writeShort(0);
				int var6 = var35.packetBuffer.offset;
				var35.packetBuffer.writeInt(228);
				var35.packetBuffer.writeInt(1);
				var35.packetBuffer.writeByte(clientType);
				var35.packetBuffer.writeByte(field498);
				byte var7 = 0;
				var35.packetBuffer.writeByte(var7);
				var35.packetBuffer.writeBytes(var31.array, 0, var31.offset);
				int var8 = var35.packetBuffer.offset;
				var35.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var35.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var35.packetBuffer.writeShort(BuddyRankComparator.canvasWidth);
				var35.packetBuffer.writeShort(Huffman.canvasHeight);
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

				var35.packetBuffer.writeStringCp1252NullTerminated(Language.field4674);
				var35.packetBuffer.writeInt(class483.field5046);
				var35.packetBuffer.writeByte(0);
				Buffer var10 = new Buffer(class437.platformInfo.size());
				class437.platformInfo.write(var10);
				var35.packetBuffer.writeBytes(var10.array, 0, var10.array.length);
				var35.packetBuffer.writeByte(clientType);
				var35.packetBuffer.writeInt(0);
				if (class273.field3035) {
					Strings.method7645(var35);
				} else {
					var35.packetBuffer.writeInt(GraphicsDefaults.field5117.hash);
					var35.packetBuffer.writeIntLE(FloatProjection.field2104.hash);
					var35.packetBuffer.writeIntIME(SoundCache.archive4.hash);
					var35.packetBuffer.writeInt(class59.field398.hash);
					var35.packetBuffer.writeInt(PcmPlayer.archive8.hash);
					var35.packetBuffer.writeIntIME(class220.archive13.hash);
					var35.packetBuffer.writeIntIME(class167.archive12.hash);
					var35.packetBuffer.writeInt(SpotAnimationDefinition.field2704.hash);
					var35.packetBuffer.writeIntME(Sound.field1718.hash);
					var35.packetBuffer.writeIntME(StructComposition.field2746.hash);
					var35.packetBuffer.writeIntIME(class268.archive2.hash);
					var35.packetBuffer.writeIntIME(WorldMapSection2.field3102.hash);
					var35.packetBuffer.writeInt(0);
					var35.packetBuffer.writeIntME(class166.archive10.hash);
					var35.packetBuffer.writeInt(class137.field1603.hash);
					var35.packetBuffer.writeIntIME(class544.archive6.hash);
					var35.packetBuffer.writeInt(World.soundEffectsArchive.hash);
					var35.packetBuffer.writeInt(ClanSettings.field1762.hash);
					var35.packetBuffer.writeIntIME(class221.field2421.hash);
					var35.packetBuffer.writeIntME(FaceNormal.field2120.hash);
					var35.packetBuffer.writeInt(LoginState.archive9.hash);
				}

				var35.packetBuffer.xteaEncrypt(var32, var8, var35.packetBuffer.offset);
				var35.packetBuffer.writeLengthShort(var35.packetBuffer.offset - var6);
				packetWriter.addNode(var35);
				packetWriter.flush();
				packetWriter.isaacCipher = new IsaacCipher(var32);
				int[] var41 = new int[4];

				for (var12 = 0; var12 < 4; ++var12) {
					var41[var12] = var32[var12] + 50;
				}

				var2.newIsaacCipher(var41);
				DevicePcmPlayerProvider.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			int var16;
			if (VarpDefinition.loginState == LoginState.READ_CLIENT_INFO_STATUS && var1.available() > 0) {
				var14 = var1.readUnsignedByte();
				if (var14 == 61) {
					var16 = var1.available();
					class380.field4145 = var16 == 1 && var1.readUnsignedByte() == 1;
					DevicePcmPlayerProvider.updateLoginState(LoginState.WRITE_INITIAL_LOGIN_PACKET);
				}

				if (var14 == 21 && gameState == 20) {
					DevicePcmPlayerProvider.updateLoginState(LoginState.READ_PROFILE_TRANSFER_TIME);
				} else if (var14 == 2) {
					if (class273.field3035) {
						DevicePcmPlayerProvider.updateLoginState(LoginState.UNMAPPED_21);
					} else {
						DevicePcmPlayerProvider.updateLoginState(LoginState.UNMAPPED);
					}
				} else if (var14 == 15 && gameState == 40) {
					packetWriter.serverPacketLength = -1;
					DevicePcmPlayerProvider.updateLoginState(LoginState.UNMAPPED_19);
				} else if (var14 == 64) {
					DevicePcmPlayerProvider.updateLoginState(LoginState.READ_STATE_11_PACKET_SIZE);
				} else if (var14 == 23 && field743 < 1) {
					++field743;
					DevicePcmPlayerProvider.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				} else if (var14 == 29) {
					DevicePcmPlayerProvider.updateLoginState(LoginState.UNMAPPED_17);
				} else {
					if (var14 != 69) {
						MouseRecorder.getLoginError(var14);
						return;
					}

					DevicePcmPlayerProvider.updateLoginState(LoginState.READ_DIGEST_PARSER_PACKET_SIZE);
				}
			}

			if (LoginState.UNMAPPED_21 == VarpDefinition.loginState) {
				field765 = true;
				Clock.method5078(class95.field1153);
				class360.updateGameState(0);
			}

			if (VarpDefinition.loginState == LoginState.READ_DIGEST_PARSER_PACKET_SIZE && var1.available() >= 2) {
				var1.read(var2.array, 0, 2);
				var2.offset = 0;
				AsyncHttpResponse.field79 = var2.readUnsignedShort();
				DevicePcmPlayerProvider.updateLoginState(LoginState.SUBMIT_DIGEST_PARSER_TASK);
			}

			if (VarpDefinition.loginState == LoginState.SUBMIT_DIGEST_PARSER_TASK && var1.available() >= AsyncHttpResponse.field79) {
				var2.offset = 0;
				var1.read(var2.array, var2.offset, AsyncHttpResponse.field79);
				class6 var33 = GrandExchangeOfferAgeComparator.method7886()[var2.readUnsignedByte()];

				try {
					class3 var34 = class111.method3126(var33);
					this.field559 = new class7(var2, var34);
					DevicePcmPlayerProvider.updateLoginState(LoginState.WRITE_DIGEST_PARSER_RESULT);
				} catch (Exception var18) {
					MouseRecorder.getLoginError(22);
					return;
				}
			}

			if (VarpDefinition.loginState == LoginState.WRITE_DIGEST_PARSER_RESULT && this.field559.method46()) {
				this.field558 = this.field559.method57();
				this.field559.method47();
				this.field559 = null;
				if (this.field558 == null) {
					MouseRecorder.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				var29 = class288.method6320();
				var29.packetBuffer.writeByte(class326.field3586.field3590);
				var29.packetBuffer.writeShort(this.field558.offset);
				var29.packetBuffer.writeBuffer(this.field558);
				packetWriter.addNode(var29);
				packetWriter.flush();
				this.field558 = null;
				DevicePcmPlayerProvider.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			if (LoginState.READ_STATE_11_PACKET_SIZE == VarpDefinition.loginState && var1.available() > 0) {
				class30.field134 = var1.readUnsignedByte();
				DevicePcmPlayerProvider.updateLoginState(LoginState.UNMAPPED_11);
			}

			if (LoginState.UNMAPPED_11 == VarpDefinition.loginState && var1.available() >= class30.field134) {
				var1.read(var2.array, 0, class30.field134);
				var2.offset = 0;
				DevicePcmPlayerProvider.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			if (LoginState.READ_PROFILE_TRANSFER_TIME == VarpDefinition.loginState && var1.available() > 0) {
				field613 = (var1.readUnsignedByte() + 3) * 60;
				DevicePcmPlayerProvider.updateLoginState(LoginState.PROFILE_TRANSFER);
			}

			if (LoginState.PROFILE_TRANSFER == VarpDefinition.loginState) {
				field501 = 0;
				class150.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field613 / 60 + " seconds.");
				if (--field613 <= 0) {
					DevicePcmPlayerProvider.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				}

			} else if (LoginState.READ_ACCOUNT_INFO_PACKET_SIZE == VarpDefinition.loginState) {
				var29 = class288.method6320();
				var29.packetBuffer.writeByte(class326.field3587.field3590);
				var29.packetBuffer.writeShort(class326.field3587.field3591);
				Calendar.method7597(var29);
				packetWriter.addNode(var29);
				packetWriter.flush();
				DevicePcmPlayerProvider.updateLoginState(LoginState.UNMAPPED);
			} else {
				if (VarpDefinition.loginState == LoginState.UNMAPPED && var1.available() >= 1) {
					UserComparator3.field1506 = var1.readUnsignedByte();
					if (UserComparator3.field1506 != class326.field3588.field3591) {
						MouseRecorder.getLoginError(UserComparator3.field1506);
						return;
					}

					DevicePcmPlayerProvider.updateLoginState(LoginState.READ_ACCOUNT_INFO);
				}

				if (LoginState.READ_ACCOUNT_INFO == VarpDefinition.loginState && var1.available() >= UserComparator3.field1506) {
					boolean var42 = var1.readUnsignedByte() == 1;
					var1.read(var2.array, 0, 4);
					var2.offset = 0;
					boolean var43 = false;
					if (var42) {
						var16 = var2.readByteIsaac() << 24;
						var16 |= var2.readByteIsaac() << 16;
						var16 |= var2.readByteIsaac() << 8;
						var16 |= var2.readByteIsaac();
						class544.clientPreferences.put(Login.Login_username, var16);
					}

					if (Login_isUsernameRemembered) {
						class544.clientPreferences.updateRememberedUsername(Login.Login_username);
					} else {
						class544.clientPreferences.updateRememberedUsername((String)null);
					}

					Projectile.savePreferences();
					staffModLevel = var1.readUnsignedByte();
					playerMod = var1.readUnsignedByte() == 1;
					localPlayerIndex = var1.readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += var1.readUnsignedByte();
					field628 = var1.readUnsignedByte();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					this.accountHash = var2.readLong();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					userId = var2.readLong();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					userHash = var2.readLong();
					class143.method3517().method4977(this.https);
					DevicePcmPlayerProvider.updateLoginState(LoginState.SET_SERVER_PROTOCOL);
				}

				if (LoginState.SET_SERVER_PROTOCOL == VarpDefinition.loginState && var1.available() >= packetWriter.serverPacketLength) {
					var1.read(var2.array, 0, 1);
					var2.offset = 0;
					if (var2.method10224()) {
						var1.read(var2.array, 1, 1);
						var2.offset = 0;
					}

					ServerPacket[] var37 = WorldMapData_0.ServerPacket_values();
					var16 = var2.readSmartByteShortIsaac();
					if (var16 < 0 || var16 >= var37.length) {
						throw new IOException("Invalid ServerProt: " + var16 + " at " + var2.offset);
					}

					packetWriter.serverPacket = var37[var16];
					packetWriter.serverPacketLength = packetWriter.serverPacket.length;
					var1.read(var2.array, 0, 2);
					var2.offset = 0;
					packetWriter.serverPacketLength = var2.readUnsignedShort();

					try {
						Client var38 = client;
						JSObject.getWindow(var38).call("zap", (Object[])null);
					} catch (Throwable var17) {
					}

					DevicePcmPlayerProvider.updateLoginState(LoginState.UPDATE_PLAYER_AND_LOAD_REGIONS);
				}

				if (LoginState.UPDATE_PLAYER_AND_LOAD_REGIONS == VarpDefinition.loginState) {
					if (var1.available() >= packetWriter.serverPacketLength) {
						var2.offset = 0;
						var1.read(var2.array, 0, packetWriter.serverPacketLength);
						timer.method8940();
						ScriptFrame.method1230();
						playerUpdateManager.updatePlayer(var2);
						class53.entity = ModeWhere.localPlayer;
						AsyncRestClient.field62 = -1;
						FriendSystem.loadRegions(false, var2);
						packetWriter.serverPacket = null;
						field511 = false;
					}

				} else {
					if (LoginState.UNMAPPED_17 == VarpDefinition.loginState && var1.available() >= 2) {
						var2.offset = 0;
						var1.read(var2.array, 0, 2);
						var2.offset = 0;
						class298.field3239 = var2.readUnsignedShort();
						DevicePcmPlayerProvider.updateLoginState(LoginState.UNMAPPED_18);
					}

					if (LoginState.UNMAPPED_18 == VarpDefinition.loginState && var1.available() >= class298.field3239) {
						var2.offset = 0;
						var1.read(var2.array, 0, class298.field3239);
						var2.offset = 0;
						String var39 = var2.readStringCp1252NullTerminated();
						String var36 = var2.readStringCp1252NullTerminated();
						String var40 = var2.readStringCp1252NullTerminated();
						class150.setLoginResponseString(var39, var36, var40);
						class360.updateGameState(10);
						if (field741.method10576()) {
							Varcs.method3212(9);
						}
					}

					if (VarpDefinition.loginState == LoginState.UNMAPPED_19) {
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
							timer.method8942();
							AbstractArchive.method7820();
							playerUpdateManager.updatePlayer(var2);
							if (var14 != var2.offset) {
								throw new RuntimeException();
							}
						}
					} else {
						++field501;
						if (field501 > 2000) {
							if (field743 < 1) {
								if (class340.currentPort == PlayerComposition.worldPort) {
									class340.currentPort = class173.js5Port;
								} else {
									class340.currentPort = PlayerComposition.worldPort;
								}

								++field743;
								DevicePcmPlayerProvider.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
							} else {
								MouseRecorder.getLoginError(-3);
							}
						}
					}
				}
			}
		} catch (IOException var26) {
			if (field743 < 1) {
				if (PlayerComposition.worldPort == class340.currentPort) {
					class340.currentPort = class173.js5Port;
				} else {
					class340.currentPort = PlayerComposition.worldPort;
				}

				++field743;
				DevicePcmPlayerProvider.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
			} else {
				MouseRecorder.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1454298274"
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
			MenuAction.method2363();
		} else {
			if (!isMenuOpen) {
				ClientPreferences.addCancelMenuEntry();
			}

			this.method1312();
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
					PacketBufferNode var30;
					if (!var1) {
						PacketBufferNode var14;
						int var15;
						if (timer.field4907) {
							var14 = ScriptEvent.getPacketBufferNode(ClientPacket.LOGIN_TIMINGS, packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(0);
							var15 = var14.packetBuffer.offset;
							timer.write(var14.packetBuffer);
							var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var15);
							packetWriter.addNode(var14);
							timer.method8964();
						}

						int var4;
						int var5;
						int var6;
						int var7;
						int var8;
						synchronized(class168.mouseRecorder.lock) {
							if (!field497) {
								class168.mouseRecorder.index = 0;
							} else if (MouseHandler.MouseHandler_lastButton != 0 || class168.mouseRecorder.index >= 40) {
								var30 = null;
								var3 = 0;
								var4 = 0;
								var5 = 0;
								var6 = 0;

								for (var7 = 0; var7 < class168.mouseRecorder.index && (var30 == null || var30.packetBuffer.offset - var3 < 246); ++var7) {
									var4 = var7;
									var8 = class168.mouseRecorder.ys[var7];
									if (var8 < -1) {
										var8 = -1;
									} else if (var8 > 65534) {
										var8 = 65534;
									}

									int var9 = class168.mouseRecorder.xs[var7];
									if (var9 < -1) {
										var9 = -1;
									} else if (var9 > 65534) {
										var9 = 65534;
									}

									if (var9 != field517 || var8 != field518) {
										if (var30 == null) {
											var30 = ScriptEvent.getPacketBufferNode(ClientPacket.MOUSE_MOVE, packetWriter.isaacCipher);
											var30.packetBuffer.writeByte(0);
											var3 = var30.packetBuffer.offset;
											PacketBuffer var10000 = var30.packetBuffer;
											var10000.offset += 2;
											var5 = 0;
											var6 = 0;
										}

										int var10;
										int var11;
										int var12;
										if (-1L != field557) {
											var10 = var9 - field517;
											var11 = var8 - field518;
											var12 = (int)((class168.mouseRecorder.millis[var7] - field557) / 20L);
											var5 = (int)((long)var5 + (class168.mouseRecorder.millis[var7] - field557) % 20L);
										} else {
											var10 = var9;
											var11 = var8;
											var12 = Integer.MAX_VALUE;
										}

										field517 = var9;
										field518 = var8;
										if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
											var10 += 32;
											var11 += 32;
											var30.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6));
										} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
											var10 += 128;
											var11 += 128;
											var30.packetBuffer.writeByte(var12 + 128);
											var30.packetBuffer.writeShort(var11 + (var10 << 8));
										} else if (var12 < 32) {
											var30.packetBuffer.writeByte(var12 + 192);
											if (var9 != -1 && var8 != -1) {
												var30.packetBuffer.writeInt(var9 | var8 << 16);
											} else {
												var30.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										} else {
											var30.packetBuffer.writeShort((var12 & 8191) + 57344);
											if (var9 != -1 && var8 != -1) {
												var30.packetBuffer.writeInt(var9 | var8 << 16);
											} else {
												var30.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										}

										++var6;
										field557 = class168.mouseRecorder.millis[var7];
									}
								}

								if (var30 != null) {
									var30.packetBuffer.writeLengthByte(var30.packetBuffer.offset - var3);
									var7 = var30.packetBuffer.offset;
									var30.packetBuffer.offset = var3;
									var30.packetBuffer.writeByte(var5 / var6);
									var30.packetBuffer.writeByte(var5 % var6);
									var30.packetBuffer.offset = var7;
									packetWriter.addNode(var30);
								}

								if (var4 >= class168.mouseRecorder.index) {
									class168.mouseRecorder.index = 0;
								} else {
									MouseRecorder var53 = class168.mouseRecorder;
									var53.index -= var4;
									System.arraycopy(class168.mouseRecorder.xs, var4, class168.mouseRecorder.xs, 0, class168.mouseRecorder.index);
									System.arraycopy(class168.mouseRecorder.ys, var4, class168.mouseRecorder.ys, 0, class168.mouseRecorder.index);
									System.arraycopy(class168.mouseRecorder.millis, var4, class168.mouseRecorder.millis, 0, class168.mouseRecorder.index);
								}
							}
						}

						PacketBufferNode var18;
						if (MouseHandler.MouseHandler_lastButton == 1 || !KeyHandler.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
							long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis * -1L;
							if (var16 > 32767L) {
								var16 = 32767L;
							}

							mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis * -1L;
							var3 = MouseHandler.MouseHandler_lastPressedY;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > Huffman.canvasHeight) {
								var3 = Huffman.canvasHeight;
							}

							var4 = MouseHandler.MouseHandler_lastPressedX;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > BuddyRankComparator.canvasWidth) {
								var4 = BuddyRankComparator.canvasWidth;
							}

							var5 = (int)var16;
							var18 = ScriptEvent.getPacketBufferNode(ClientPacket.EVENT_MOUSE_CLICK, packetWriter.isaacCipher);
							var18.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1));
							var18.packetBuffer.writeShort(var4);
							var18.packetBuffer.writeShort(var3);
							packetWriter.addNode(var18);
						}

						if (mouseWheelRotation != 0) {
							var14 = ScriptEvent.getPacketBufferNode(ClientPacket.MOUSE_WHEEL, packetWriter.isaacCipher);
							var14.packetBuffer.writeShort(mouseWheelRotation);
							packetWriter.addNode(var14);
						}

						if (indexCheck.field2979 > 0) {
							var14 = ScriptEvent.getPacketBufferNode(ClientPacket.EVENT_KEYBOARD, packetWriter.isaacCipher);
							var14.packetBuffer.writeShort(0);
							var15 = var14.packetBuffer.offset;
							long var19 = ReflectionCheck.method724();

							for (var5 = 0; var5 < indexCheck.field2979; ++var5) {
								long var21 = var19 - field740;
								if (var21 > 16777215L) {
									var21 = 16777215L;
								}

								field740 = var19;
								var14.packetBuffer.writeByteNeg(indexCheck.field2984[var5]);
								var14.packetBuffer.method10327((int)var21);
							}

							var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var15);
							packetWriter.addNode(var14);
						}

						if (field618 > 0) {
							--field618;
						}

						if (indexCheck.isValidIndexInRange(96) || indexCheck.isValidIndexInRange(97) || indexCheck.isValidIndexInRange(98) || indexCheck.isValidIndexInRange(99)) {
							field604 = true;
						}

						if (field604 && field618 <= 0) {
							field618 = 20;
							field604 = false;
							var14 = ScriptEvent.getPacketBufferNode(ClientPacket.EVENT_CAMERA_POSITION, packetWriter.isaacCipher);
							var14.packetBuffer.writeShortAddLE(camAngleY);
							var14.packetBuffer.writeShortAddLE(camAngleX);
							packetWriter.addNode(var14);
						}

						if (SecureRandomFuture.hasFocus && !hadFocus) {
							hadFocus = true;
							var14 = ScriptEvent.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(1);
							packetWriter.addNode(var14);
						}

						if (!SecureRandomFuture.hasFocus && hadFocus) {
							hadFocus = false;
							var14 = ScriptEvent.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(0);
							packetWriter.addNode(var14);
						}

						if (class420.worldMap != null) {
							class420.worldMap.method9720();
						}

						class346.method6950();
						if (HttpResponse.field91) {
							class450.method8884();
							HttpResponse.field91 = false;
						}

						if (field739 != GameEngine.topLevelWorldView.plane) {
							field739 = GameEngine.topLevelWorldView.plane;
							Archive.method7701(GameEngine.topLevelWorldView.plane);
						}

						if (gameState != 30) {
							return;
						}

						Iterator var36 = worldViewManager.iterator();

						WorldView var31;
						while (var36.hasNext()) {
							var31 = (WorldView)var36.next();

							for (PendingSpawn var23 = (PendingSpawn)var31.pendingSpawns.last(); var23 != null; var23 = (PendingSpawn)var31.pendingSpawns.previous()) {
								if (var23.hitpoints > 0) {
									--var23.hitpoints;
								}

								ObjectComposition var24;
								boolean var34;
								if (var23.hitpoints == 0) {
									if (var23.objectId >= 0) {
										var5 = var23.objectId;
										var6 = var23.field1179;
										var24 = class142.getObjectDefinition(var5);
										if (var6 == 11) {
											var6 = 10;
										}

										if (var6 >= 5 && var6 <= 8) {
											var6 = 4;
										}

										var34 = var24.method5510(var6);
										if (!var34) {
											continue;
										}
									}

									class168.addPendingSpawnToScene(var31, var23.plane, var23.type, var23.x, var23.y, var23.objectId, var23.field1184, var23.field1179, var23.field1189);
									var23.remove();
								} else {
									if (var23.delay > 0) {
										--var23.delay;
									}

									if (var23.delay == 0 && var23.x >= 1 && var23.y >= 1 && var23.x <= 102 && var23.y <= 102) {
										if (var23.field1192 >= 0) {
											var5 = var23.field1192;
											var6 = var23.field1194;
											var24 = class142.getObjectDefinition(var5);
											if (var6 == 11) {
												var6 = 10;
											}

											if (var6 >= 5 && var6 <= 8) {
												var6 = 4;
											}

											var34 = var24.method5510(var6);
											if (!var34) {
												continue;
											}
										}

										class168.addPendingSpawnToScene(var31, var23.plane, var23.type, var23.x, var23.y, var23.field1192, var23.field1185, var23.field1194, var23.field1189);
										var23.delay = -1;
										if (var23.field1192 == var23.objectId && var23.objectId == -1) {
											var23.remove();
										} else if (var23.objectId == var23.field1192 && var23.field1184 == var23.field1185 && var23.field1179 == var23.field1194) {
											var23.remove();
										}
									}
								}
							}
						}

						class481.method9355();
						++packetWriter.field1454;
						if (packetWriter.field1454 > 750) {
							MenuAction.method2363();
							return;
						}

						class257.method5425();
						DynamicObject.method2491();
						var36 = worldViewManager.iterator();

						while (var36.hasNext()) {
							var31 = (WorldView)var36.next();

							for (var3 = 0; var3 < var31.worldEntityCount; ++var3) {
								var4 = var31.worldEntityIndices[var3];
								WorldEntity var25 = var31.worldEntities[var4];
								if (var25 != null) {
									var25.method9301(cycle);
								}
							}
						}

						int[] var37 = playerUpdateManager.playerIndices;
						Iterator var32 = worldViewManager.iterator();

						while (var32.hasNext()) {
							WorldView var42 = (WorldView)var32.next();

							for (var4 = 0; var4 < playerUpdateManager.playerCount; ++var4) {
								Player var46 = var42.players[var37[var4]];
								if (var46 != null && var46.overheadTextCyclesRemaining > 0) {
									--var46.overheadTextCyclesRemaining;
									if (var46.overheadTextCyclesRemaining == 0) {
										var46.overheadText = null;
									}
								}
							}

							for (var4 = 0; var4 < var42.npcCount; ++var4) {
								var5 = var42.npcIndices[var4];
								NPC var39 = var42.npcs[var5];
								if (var39 != null && var39.overheadTextCyclesRemaining > 0) {
									--var39.overheadTextCyclesRemaining;
									if (var39.overheadTextCyclesRemaining == 0) {
										var39.overheadText = null;
									}
								}
							}
						}

						++graphicsCycle;
						if (mouseCrossColor != 0) {
							mouseCrossState = mouseCrossState * 400 + 20;
							if (mouseCrossState * 400 >= 400) {
								mouseCrossColor = 0;
							}
						}

						Widget var38 = class424.mousedOverWidgetIf1;
						Widget var33 = HealthBarConfig.field1346;
						class424.mousedOverWidgetIf1 = null;
						HealthBarConfig.field1346 = null;
						draggedOnWidget = null;
						field683 = false;
						field523 = false;
						field733 = 0;

						while (indexCheck.method5772() && field733 < 128) {
							if (staffModLevel >= 2 && indexCheck.isValidIndexInRange(82) && indexCheck.field2989 == 66) {
								StringBuilder var26 = new StringBuilder();

								Message var40;
								for (Iterator var47 = Messages.Messages_hashTable.iterator(); var47.hasNext(); var26.append(var40.text).append('\n')) {
									var40 = (Message)var47.next();
									if (var40.sender != null && !var40.sender.isEmpty()) {
										var26.append(var40.sender).append(':');
									}
								}

								String var43 = var26.toString();
								client.method529(var43);
							} else if (oculusOrbState != 1 || indexCheck.field2975 <= 0) {
								field735[field733] = indexCheck.field2989;
								field589[field733] = indexCheck.field2975;
								++field733;
							}
						}

						if (class30.method480() && indexCheck.isValidIndexInRange(82) && indexCheck.isValidIndexInRange(81) && mouseWheelRotation != 0) {
							var3 = ModeWhere.localPlayer.plane - mouseWheelRotation;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > 3) {
								var3 = 3;
							}

							if (var3 != ModeWhere.localPlayer.plane) {
								var4 = ModeWhere.localPlayer.pathX[0] + GameEngine.topLevelWorldView.baseX;
								var5 = ModeWhere.localPlayer.pathY[0] + GameEngine.topLevelWorldView.baseY;
								var18 = ScriptEvent.getPacketBufferNode(ClientPacket.TELEPORT, packetWriter.isaacCipher);
								var18.packetBuffer.writeShortAddLE(var4);
								var18.packetBuffer.writeShortAdd(var5);
								var18.packetBuffer.writeIntME(0);
								var18.packetBuffer.writeByteNeg(var3);
								packetWriter.addNode(var18);
							}

							mouseWheelRotation = 0;
						}

						if (rootInterface != -1) {
							DirectByteArrayCopier.updateRootInterface(rootInterface, 0, 0, BuddyRankComparator.canvasWidth, Huffman.canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							ScriptEvent var44;
							Widget var48;
							Widget var49;
							do {
								var44 = (ScriptEvent)scriptEvents2.removeLast();
								if (var44 == null) {
									while (true) {
										do {
											var44 = (ScriptEvent)scriptEvents3.removeLast();
											if (var44 == null) {
												while (true) {
													do {
														var44 = (ScriptEvent)scriptEvents.removeLast();
														if (var44 == null) {
															boolean var35 = false;

															while (true) {
																class268 var51 = (class268)field709.removeLast();
																if (var51 == null) {
																	if (!var35 && MouseHandler.MouseHandler_lastButton == 1) {
																		field575.method5738();
																	}

																	this.menu();
																	if (class420.worldMap != null) {
																		class420.worldMap.method9730(GameEngine.topLevelWorldView.plane, (class53.entity.getX() >> 7) + GameEngine.topLevelWorldView.baseX, (class53.entity.getY() >> 7) + GameEngine.topLevelWorldView.baseY, false);
																		class420.worldMap.loadCache();
																	}

																	if (clickedWidget != null) {
																		this.method1561();
																	}

																	Iterator var52 = worldViewManager.iterator();

																	while (var52.hasNext()) {
																		WorldView var50 = (WorldView)var52.next();
																		Scene var41 = var50.scene;
																		if (var41.shouldSendWalk()) {
																			var7 = var41.baseX;
																			var8 = var41.baseY;
																			PacketBufferNode var27 = ScriptEvent.getPacketBufferNode(ClientPacket.MOVE_GAMECLICK, packetWriter.isaacCipher);
																			var27.packetBuffer.writeByte(5);
																			var27.packetBuffer.writeByte(indexCheck.isValidIndexInRange(82) ? (indexCheck.isValidIndexInRange(81) ? 2 : 1) : 0);
																			var27.packetBuffer.writeShort(var8 + var50.baseY);
																			var27.packetBuffer.writeShortAddLE(var7 + var50.baseX);
																			packetWriter.addNode(var27);
																			mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																			mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																			mouseCrossColor = 1;
																			mouseCrossState = 0;
																			destinationX = var7;
																			destinationY = var8;
																			var41.method4411();
																		}
																	}

																	if (var38 != class424.mousedOverWidgetIf1) {
																		if (var38 != null) {
																			UserComparator8.invalidateWidget(var38);
																		}

																		if (class424.mousedOverWidgetIf1 != null) {
																			UserComparator8.invalidateWidget(class424.mousedOverWidgetIf1);
																		}
																	}

																	if (var33 != HealthBarConfig.field1346 && field654 == field655) {
																		if (var33 != null) {
																			UserComparator8.invalidateWidget(var33);
																		}

																		if (HealthBarConfig.field1346 != null) {
																			UserComparator8.invalidateWidget(HealthBarConfig.field1346);
																		}
																	}

																	if (HealthBarConfig.field1346 != null) {
																		if (field654 < field655) {
																			++field654;
																			if (field655 == field654) {
																				UserComparator8.invalidateWidget(HealthBarConfig.field1346);
																			}
																		}
																	} else if (field654 > 0) {
																		--field654;
																	}

																	Canvas.method335();
																	if (field762) {
																		class92.method2645();
																	} else if (isCameraLocked) {
																		class145.method3555();
																	}

																	for (var4 = 0; var4 < 5; ++var4) {
																		int var10002 = field705[var4]++;
																	}

																	HttpRequestTask.varcs.tryWrite();
																	var4 = SceneTilePaint.method4708();
																	var5 = GameEngine.keyHandler.method362();
																	PacketBufferNode var45;
																	if (var4 > 15000 && var5 > 15000) {
																		logoutTimer = 250;
																		MouseHandler.MouseHandler_idleCycles = 14500;
																		var45 = ScriptEvent.getPacketBufferNode(ClientPacket.EVENT_MOUSE_IDLE, packetWriter.isaacCipher);
																		packetWriter.addNode(var45);
																	}

																	HttpRequest.friendSystem.processFriendUpdates();

																	for (var7 = 0; var7 < field792.size(); ++var7) {
																		if (class166.method3808((Integer)field792.get(var7)) != 2) {
																			field792.remove(var7);
																			--var7;
																		}
																	}

																	++packetWriter.pendingWrites;
																	if (packetWriter.pendingWrites > 50) {
																		var45 = ScriptEvent.getPacketBufferNode(ClientPacket.NO_TIMEOUT, packetWriter.isaacCipher);
																		packetWriter.addNode(var45);
																	}

																	try {
																		packetWriter.flush();
																	} catch (IOException var28) {
																		MenuAction.method2363();
																	}

																	class143.method3517().method4982();
																	return;
																}

																if (var51.field2971.type == 12) {
																	var35 = true;
																}

																WorldMapEvent.method6537(var51);
															}
														}

														var49 = var44.widget;
														if (var49.childIndex < 0) {
															break;
														}

														var48 = ClanChannel.widgetDefinition.method7031(var49.parentId);
													} while(var48 == null || var48.children == null || var49.childIndex >= var48.children.length || var49 != var48.children[var49.childIndex]);

													Friend.runScriptEvent(var44);
												}
											}

											var49 = var44.widget;
											if (var49.childIndex < 0) {
												break;
											}

											var48 = ClanChannel.widgetDefinition.method7031(var49.parentId);
										} while(var48 == null || var48.children == null || var49.childIndex >= var48.children.length || var49 != var48.children[var49.childIndex]);

										Friend.runScriptEvent(var44);
									}
								}

								var49 = var44.widget;
								if (var49.childIndex < 0) {
									break;
								}

								var48 = ClanChannel.widgetDefinition.method7031(var49.parentId);
							} while(var48 == null || var48.children == null || var49.childIndex >= var48.children.length || var49 != var48.children[var49.childIndex]);

							Friend.runScriptEvent(var44);
						}
					}

					var30 = ScriptEvent.getPacketBufferNode(ClientPacket.REFLECTION_CHECK_REPLY, packetWriter.isaacCipher);
					var30.packetBuffer.writeByte(0);
					var3 = var30.packetBuffer.offset;
					BufferedNetSocket.performReflectionCheck(var30.packetBuffer);
					var30.packetBuffer.writeLengthByte(var30.packetBuffer.offset - var3);
					packetWriter.addNode(var30);
				}
			}
		}
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-81"
	)
	public void vmethod6894(int var1, int var2) {
		if (packetWriter != null && packetWriter.isaacCipher != null) {
			if (var1 > -1 && class544.clientPreferences.getMusicVolume() > 0 && !playingJingle) {
				PacketBufferNode var3 = ScriptEvent.getPacketBufferNode(ClientPacket.MUSIC_PLAYING, packetWriter.isaacCipher);
				var3.packetBuffer.writeInt(var1);
				packetWriter.addNode(var3);
			}

		}
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-15"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = BuddyRankComparator.canvasWidth;
		int var2 = Huffman.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}

		if (class544.clientPreferences != null) {
			try {
				class26.method402(client, "resize", new Object[]{TextureProvider.getWindowedMode()});
			} catch (Throwable var4) {
			}
		}

	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1877548934"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) {
			HttpMethod.method83(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (validRootWidgets[var1]) {
				field732[var1] = true;
			}

			field580[var1] = validRootWidgets[var1];
			validRootWidgets[var1] = false;
		}

		field619 = cycle;
		viewportX = -1;
		viewportY = -1;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			Renderable.drawWidgets(rootInterface, 0, 0, BuddyRankComparator.canvasWidth, Huffman.canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				ArchiveLoader.crossSprites[mouseCrossState * 400 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				ArchiveLoader.crossSprites[mouseCrossState * 400 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}

		int var2;
		int var3;
		if (!isMenuOpen) {
			if (viewportX != -1) {
				var1 = viewportX;
				var2 = viewportY;
				if ((menu.menuOptionsCount >= 2 || isItemSelected != 0 || isSpellSelected) && showMouseOverText) {
					var3 = menu.menuOptionsCount - 1;
					String var5;
					if (isItemSelected == 1 && menu.menuOptionsCount < 2) {
						var5 = "Use" + " " + field570 + " " + "->";
					} else if (isSpellSelected && menu.menuOptionsCount < 2) {
						var5 = selectedSpellActionName + " " + selectedSpellName + " " + "->";
					} else {
						var5 = menu.method10916(var3);
					}

					if (menu.menuOptionsCount > 2) {
						var5 = var5 + WorldViewManager.colorStartTag(16777215) + " " + '/' + " " + (menu.menuOptionsCount - 2) + " more options";
					}

					GraphicsObject.fontBold12.drawRandomAlphaAndSpacing(var5, var1 + 4, var2 + 15, 16777215, 0, cycle / 1000);
				}
			}
		} else {
			menu.method10928();
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field580[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field732[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		var1 = GameEngine.topLevelWorldView.plane;
		var2 = ModeWhere.localPlayer.x;
		var3 = ModeWhere.localPlayer.y;
		int var4 = graphicsCycle;

		for (ObjectSound var14 = (ObjectSound)ObjectSound.objectSounds.last(); var14 != null; var14 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var14.soundEffectId != -1 || var14.soundEffectIds != null) {
				int var6 = 0;
				if (var2 > var14.maxX * 16384) {
					var6 += var2 - var14.maxX * 16384;
				} else if (var2 < var14.x * 128) {
					var6 += var14.x * 128 - var2;
				}

				if (var3 > var14.maxY * 16384) {
					var6 += var3 - var14.maxY * 16384;
				} else if (var3 < var14.y * 16384) {
					var6 += var14.y * 16384 - var3;
				}

				var6 = Math.max(var6 - 64, 0);
				if (var6 < var14.field840 && class544.clientPreferences.getAreaSoundEffectsVolume() != 0 && var1 == var14.plane) {
					float var7 = var14.field841 < var14.field840 ? Math.min(Math.max((float)(var14.field840 - var6) / (float)(var14.field840 - var14.field841), 0.0F), 1.0F) : 1.0F;
					int var8 = (int)(var7 * (float)class544.clientPreferences.getAreaSoundEffectsVolume());
					Object var10000;
					if (var14.stream1 == null) {
						if (var14.soundEffectId >= 0) {
							var10000 = null;
							SoundEffect var9 = SoundEffect.readSoundEffect(World.soundEffectsArchive, var14.soundEffectId, 0);
							if (var9 != null) {
								RawSound var10 = var9.toRawSound().resample(Message.decimator);
								RawPcmStream var11 = RawPcmStream.createRawPcmStream(var10, 100, var8);
								var11.setNumLoops(-1);
								UserList.pcmStreamMixer.addSubStream(var11);
								var14.stream1 = var11;
							}
						}
					} else {
						var14.stream1.method914(var8);
					}

					if (var14.stream2 == null) {
						if (var14.soundEffectIds != null && (var14.field847 -= var4) <= 0) {
							int var13 = (int)(Math.random() * (double)var14.soundEffectIds.length);
							var10000 = null;
							SoundEffect var15 = SoundEffect.readSoundEffect(World.soundEffectsArchive, var14.soundEffectIds[var13], 0);
							if (var15 != null) {
								RawSound var16 = var15.toRawSound().resample(Message.decimator);
								RawPcmStream var12 = RawPcmStream.createRawPcmStream(var16, 100, var8);
								var12.setNumLoops(0);
								UserList.pcmStreamMixer.addSubStream(var12);
								var14.stream2 = var12;
								var14.field847 = var14.field844 + (int)(Math.random() * (double)(var14.field845 - var14.field844));
							}
						}
					} else {
						var14.stream2.method914(var8);
						if (!var14.stream2.hasNext()) {
							var14.stream2 = null;
						}
					}
				} else {
					if (var14.stream1 != null) {
						UserList.pcmStreamMixer.removeSubStream(var14.stream1);
						var14.stream1 = null;
					}

					if (var14.stream2 != null) {
						UserList.pcmStreamMixer.removeSubStream(var14.stream2);
						var14.stream2 = null;
					}
				}
			}
		}

		graphicsCycle = 0;
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(Lep;I)Z",
		garbageValue = "-1864848438"
	)
	boolean method1310(PacketWriter var1) {
		if (var1.serverPacketLength == 0) {
			WorldMapLabelSize.friendsChat = null;
		} else {
			if (WorldMapLabelSize.friendsChat == null) {
				WorldMapLabelSize.friendsChat = new FriendsChat(class383.loginType, client);
			}

			WorldMapLabelSize.friendsChat.method9126(var1.packetBuffer);
		}

		field770 = cycleCntr;
		class424.ClanChat_inClanChat = true;
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(Lep;I)Z",
		garbageValue = "-1023516953"
	)
	boolean method1311(PacketWriter var1) {
		if (WorldMapLabelSize.friendsChat != null) {
			WorldMapLabelSize.friendsChat.method9108(var1.packetBuffer);
		}

		field770 = cycleCntr;
		class424.ClanChat_inClanChat = true;
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1611945377"
	)
	void method1312() {
		int var1 = 0;
		boolean var2 = packetWriter.field1456 > 0;

		for (int var3 = packetWriter.field1445; var1 < 100 || var2; var2 = packetWriter.field1456 > 0) {
			boolean var4 = this.method1434(packetWriter);
			if (var2) {
				int var5 = packetWriter.field1445 - var3;
				PacketWriter var10000 = packetWriter;
				var10000.field1456 -= var5;
			}

			if (!var4) {
				break;
			}

			++var1;
			var3 = packetWriter.field1445;
		}

	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Lep;I)Z",
		garbageValue = "-49175667"
	)
	@Export("method1434")
	final boolean method1434(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket();
		PacketBuffer var3 = var1.packetBuffer;
		if (var2 == null) {
			return false;
		} else {
			String var22;
			int var23;
			try {
				if (var1.field1456 > 0 && !var2.isAvailable(var1.field1456)) {
					return false;
				}

				int var5;
				if (var1.serverPacket == null) {
					if (var1.field1457) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var1.field1445 += var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1454 = 0;
						var1.field1457 = false;
					}

					var3.offset = 0;
					if (var3.method10224()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var1.field1445 += var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1454 = 0;
					}

					var1.field1457 = true;
					ServerPacket[] var4 = WorldMapData_0.ServerPacket_values();
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

					var1.field1445 += var2.read(var3.array, 0, 1);
					var1.serverPacketLength = var3.array[0] & 255;
				}

				if (var1.serverPacketLength == -2) {
					if (!var2.isAvailable(2)) {
						return false;
					}

					var1.field1445 += var2.read(var3.array, 0, 2);
					var3.offset = 0;
					var1.serverPacketLength = var3.readUnsignedShort();
				}

				if (!var2.isAvailable(var1.serverPacketLength)) {
					return false;
				}

				var3.offset = 0;
				var1.field1445 += var2.read(var3.array, 0, var1.serverPacketLength);
				var1.field1454 = 0;
				timer.method8937();
				var1.field1460 = var1.field1447;
				var1.field1447 = var1.field1458;
				var1.field1458 = var1.serverPacket;
				int var21;
				String var70;
				if (ServerPacket.MESSAGE_GAME == var1.serverPacket) {
					var21 = var3.readUShortSmart();
					boolean var94 = var3.readUnsignedByte() == 1;
					var70 = "";
					boolean var75 = false;
					if (var94) {
						var70 = var3.readStringCp1252NullTerminated();
						if (HttpRequest.friendSystem.isIgnored(new Username(var70, class383.loginType))) {
							var75 = true;
						}
					}

					String var66 = var3.readStringCp1252NullTerminated();
					if (!var75) {
						Interpreter.addGameMessage(var21, var70, var66);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_PLAYER_OP == var1.serverPacket) {
					var21 = var3.readUnsignedByte();
					var22 = var3.readStringCp1252NullTerminated();
					var23 = var3.readUnsignedByteAdd();
					if (var23 >= 1 && var23 <= 8) {
						if (var22.equalsIgnoreCase("null")) {
							var22 = null;
						}

						playerMenuActions[var23 - 1] = var22;
						playerOptionsPriorities[var23 - 1] = var21 == 0;
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var6;
				if (ServerPacket.IF_SET_PLAYERMODEL_OBJ == var1.serverPacket) {
					var21 = var3.readInt();
					var5 = var3.readUnsignedIntLE();
					var6 = ClanChannel.widgetDefinition.method7031(var5);
					var6.field3924.method7080(var21);
					UserComparator8.invalidateWidget(var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_FRIENDLIST == var1.serverPacket) {
					HttpRequest.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field697 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				byte var89;
				if (ServerPacket.VARP_SMALL == var1.serverPacket) {
					var89 = var3.readByteAdd();
					var5 = var3.readUnsignedShortAddLE();
					Varps.Varps_temp[var5] = var89;
					if (Varps.Varps_main[var5] != var89) {
						Varps.Varps_main[var5] = var89;
					}

					RouteStrategy.changeGameOptions(var5);
					changedVarps[++changedVarpCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				int var7;
				if (ServerPacket.MIDI_SWAP == var1.serverPacket) {
					var5 = var3.readUnsignedShortAdd();
					var7 = var3.readUnsignedShortAdd();
					var23 = var3.readUnsignedShort();
					var21 = var3.readUnsignedShort();
					class309.method6539(var21, var5, var23, var7);
					var1.serverPacket = null;
					return true;
				}

				Widget var87;
				if (ServerPacket.UPDATE_INV_CLEAR == var1.serverPacket) {
					var21 = var3.readInt();
					var87 = ClanChannel.widgetDefinition.method7031(var21);

					for (var23 = 0; var23 < var87.itemIds.length; ++var23) {
						var87.itemIds[var23] = -1;
						var87.itemIds[var23] = 0;
					}

					UserComparator8.invalidateWidget(var87);
					var1.serverPacket = null;
					return true;
				}

				int var9;
				int var11;
				int var24;
				int var26;
				long var68;
				InterfaceParent var84;
				if (ServerPacket.IF_RESYNC == var1.serverPacket) {
					var21 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					var23 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.method1317(false);
						RestClientThreadFactory.method211(rootInterface);
						WorldMapIcon_0.runWidgetOnLoadListener(rootInterface);

						for (var7 = 0; var7 < 100; ++var7) {
							validRootWidgets[var7] = true;
						}
					}

					InterfaceParent var65;
					for (; var23-- > 0; var65.field1071 = true) {
						var7 = var3.readInt();
						var24 = var3.readUnsignedShort();
						var9 = var3.readUnsignedByte();
						var65 = (InterfaceParent)interfaceParents.get((long)var7);
						if (var65 != null && var24 != var65.group) {
							NPCComposition.closeInterface(var65, true);
							var65 = null;
						}

						if (var65 == null) {
							var65 = class6.openInterface(var7, var24, var9);
						}
					}

					for (var84 = (InterfaceParent)interfaceParents.first(); var84 != null; var84 = (InterfaceParent)interfaceParents.next()) {
						if (var84.field1071) {
							var84.field1071 = false;
						} else {
							NPCComposition.closeInterface(var84, true);
						}
					}

					widgetFlags = new NodeHashTable(512);

					while (var3.offset < var21) {
						var7 = var3.readInt();
						var24 = var3.readUnsignedShort();
						var9 = var3.readUnsignedShort();
						var26 = var3.readInt();

						for (var11 = var24; var11 <= var9; ++var11) {
							var68 = (long)var11 + ((long)var7 << 32);
							widgetFlags.put(new IntegerNode(var26), var68);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_SETANGLE == var1.serverPacket) {
					isCameraLocked = true;
					field762 = false;
					field757 = false;
					class280.field3067 = var3.readUnsignedByte();
					field801 = var3.readUnsignedByte();
					class416.field4710 = var3.readUnsignedShort();
					class383.field4491 = var3.readUnsignedByte();
					HttpQueryParams.field5142 = var3.readUnsignedByte();
					if (HttpQueryParams.field5142 >= 100) {
						var21 = Coord.method6980(class280.field3067);
						var5 = Coord.method6980(field801);
						var23 = Canvas.getTileHeight(GameEngine.topLevelWorldView, var21, var5, GameEngine.topLevelWorldView.plane) - class416.field4710;
						var7 = var21 - Buddy.cameraX;
						var24 = var23 - Message.cameraY;
						var9 = var5 - class31.cameraZ;
						var26 = (int)Math.sqrt((double)(var9 * var9 + var7 * var7));
						class159.cameraPitch = (int)(Math.atan2((double)var24, (double)var26) * 325.9490051269531D) & 2047;
						IntProjection.cameraYaw = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531D) & 2047;
						if (class159.cameraPitch < 128) {
							class159.cameraPitch = 128;
						}

						if (class159.cameraPitch > 383) {
							class159.cameraPitch = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_SPOTANIM == var1.serverPacket) {
					var23 = var3.readUnsignedIntME();
					var21 = var3.readUnsignedShortLE();
					Player var61;
					if (var21 == localPlayerIndex) {
						var61 = ModeWhere.localPlayer;
					} else {
						var61 = class30.worldView.players[var21];
					}

					var5 = var3.readUnsignedShortAdd();
					var7 = var3.readUnsignedByteSub();
					if (var61 != null) {
						var61.updateSpotAnimation(var7, var5, var23 >> 16, var23 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				boolean var76;
				if (ServerPacket.UPDATE_TRADING_POST == var1.serverPacket) {
					var76 = var3.readUnsignedByte() == 1;
					if (var76) {
						Widget.field3909 = ReflectionCheck.method724() - var3.readLong();
						class328.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						class328.grandExchangeEvents = null;
					}

					field714 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3567 == var1.serverPacket) {
					class418.field4719 = var3.readBoolean();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_UID192 == var1.serverPacket) {
					var3.offset += 28;
					if (var3.checkCrc()) {
						Sound.method3657(var3, var3.offset - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OBJ_COUNT == var1.serverPacket) {
					class224.method5046(class323.field3433);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OBJ_DEL == var1.serverPacket) {
					class224.method5046(class323.field3420);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PING_STATISTICS_REQUEST == var1.serverPacket) {
					var21 = var3.readInt();
					var5 = var3.readInt();
					var23 = class369.getGcDuration();
					PacketBufferNode var92 = ScriptEvent.getPacketBufferNode(ClientPacket.PING_STATISTICS, packetWriter.isaacCipher);
					var92.packetBuffer.writeByteAdd(var23);
					var92.packetBuffer.writeByteAdd(GameEngine.fps);
					var92.packetBuffer.writeInt(var21);
					var92.packetBuffer.writeInt(var5);
					packetWriter.addNode(var92);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_CLOSESUB == var1.serverPacket) {
					var21 = var3.readInt();
					InterfaceParent var88 = (InterfaceParent)interfaceParents.get((long)var21);
					if (var88 != null) {
						NPCComposition.closeInterface(var88, true);
					}

					if (meslayerContinueWidget != null) {
						UserComparator8.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_REBOOT_TIMER == var1.serverPacket) {
					rebootTimer = var3.readUnsignedShortLE() * 30;
					field499 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETPLAYERHEAD == var1.serverPacket) {
					var21 = var3.readUnsignedIntIME();
					var87 = ClanChannel.widgetDefinition.method7031(var21);
					var87.modelType = 3;
					var87.modelId = ModeWhere.localPlayer.appearance.getChatHeadId();
					UserComparator8.invalidateWidget(var87);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3571 == var1.serverPacket) {
					Language.updateWorldEntitiesFromPacketBuffer(class30.worldView, var3, 4);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SONG == var1.serverPacket) {
					var23 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShort();
					var24 = var3.readUnsignedShort();
					var7 = var3.readUnsignedShortAddLE();
					var21 = var3.readUnsignedShortLE();
					if (var21 == 65535) {
						var21 = -1;
					}

					ArrayList var91 = new ArrayList();
					var91.add(var21);
					class420.playSong(var91, var5, var23, var7, var24);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOC_DEL == var1.serverPacket) {
					class224.method5046(class323.field3427);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3496 == var1.serverPacket) {
					field631 = var3.readStringCp1252NullTerminated();
					var1.serverPacket = null;
					return true;
				}

				Widget var86;
				if (ServerPacket.IF_SET_PLAYERMODEL_BASECOLOUR == var1.serverPacket) {
					var21 = var3.readUnsignedByteSub();
					var5 = var3.readUnsignedIntLE();
					var23 = var3.readUnsignedByteAdd();
					var86 = ClanChannel.widgetDefinition.method7031(var5);
					var86.field3924.method7064(var23, var21);
					UserComparator8.invalidateWidget(var86);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOGOUT == var1.serverPacket) {
					var21 = var3.readUnsignedByte();
					class107.forceDisconnect(var21);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.URL_OPEN == var1.serverPacket) {
					byte[] var55 = new byte[var1.serverPacketLength];
					var3.method10225(var55, 0, var55.length);
					Buffer var85 = new Buffer(var55);
					var70 = var85.readStringCp1252NullTerminated();
					WorldMapRectangle.openURL(var70, true, false);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOGOUT_FULL == var1.serverPacket) {
					logOut();
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.REBUILD_WORLDENTITY == var1.serverPacket) {
					ClanChannel.method3857(GameEngine.topLevelWorldView, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL == var1.serverPacket) {
					AbstractWorldMapData.field3215 = var3.readUnsignedByteSub();
					class360.field3857 = var3.readUnsignedByteNeg();
					field767 = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_SET_SEQUENCE == var1.serverPacket) {
					var5 = var3.readUnsignedShortAdd();
					var21 = var3.readUnsignedShortAddLE();
					var23 = var3.readUnsignedByteAdd();
					if (var5 == 65535) {
						var5 = -1;
					}

					NPC var90 = class30.worldView.npcs[var21];
					if (var90 != null) {
						if (var5 == var90.sequence && var5 != -1) {
							var24 = class33.SequenceDefinition_get(var5).restartMode;
							if (var24 == 1) {
								var90.sequenceFrame = 0;
								var90.sequenceFrameCycle = 0;
								var90.sequenceDelay = var23;
								var90.field1244 = 0;
							} else if (var24 == 2) {
								var90.field1244 = 0;
							}
						} else if (var5 == -1 || var90.sequence == -1 || class33.SequenceDefinition_get(var5).field2930 >= class33.SequenceDefinition_get(var90.sequence).field2930) {
							var90.sequence = var5;
							var90.sequenceFrame = 0;
							var90.sequenceFrameCycle = 0;
							var90.sequenceDelay = var23;
							var90.field1244 = 0;
							var90.field1270 = var90.pathLength;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_NPC_UPDATE_ORIGIN == var1.serverPacket) {
					class277.field3055 = var3.readUnsignedByte();
					class221.field2426 = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_MOVETO == var1.serverPacket) {
					isCameraLocked = true;
					field762 = false;
					field669 = true;
					LoginScreenAnimation.field1293 = var3.readUnsignedByte();
					WorldMapAreaData.field3274 = var3.readUnsignedByte();
					var21 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShort();
					field758 = var3.readBoolean();
					var23 = var3.readUnsignedByte();
					var7 = Coord.method6980(LoginScreenAnimation.field1293);
					var24 = Coord.method6980(WorldMapAreaData.field3274);
					boolean var71 = false;
					boolean var95 = false;
					if (field758) {
						var9 = Message.cameraY;
						var26 = Canvas.getTileHeight(GameEngine.topLevelWorldView, var7, var24, GameEngine.topLevelWorldView.plane) - var21;
					} else {
						var9 = Canvas.getTileHeight(GameEngine.topLevelWorldView, Buddy.cameraX, class31.cameraZ, GameEngine.topLevelWorldView.plane) - Message.cameraY;
						var26 = var21;
					}

					field657 = new class519(Buddy.cameraX, class31.cameraZ, var9, var7, var24, var26, var5, var23);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_ANIM_SPECIFIC == var1.serverPacket) {
					var21 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByteNeg();
					if (var21 == 65535) {
						var21 = -1;
					}

					Decimator.performPlayerAnimation(ModeWhere.localPlayer, var21, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_ROTATE_SPEED == var1.serverPacket) {
					var21 = var3.readInt();
					var5 = var3.readUnsignedShortAdd();
					var23 = var3.readUnsignedShortAdd();
					var86 = ClanChannel.widgetDefinition.method7031(var21);
					var86.field3928 = var23 + (var5 << 16);
					var1.serverPacket = null;
					return true;
				}

				long var28;
				long var30;
				boolean var34;
				String var35;
				String var51;
				int var73;
				if (ServerPacket.MESSAGE_PRIVATE == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					var28 = (long)var3.readUnsignedShort();
					var30 = (long)var3.readMedium();
					PlayerType var27 = (PlayerType)StructComposition.findEnumerated(class151.PlayerType_values(), var3.readUnsignedByte());
					long var32 = var30 + (var28 << 32);
					var34 = false;

					for (var73 = 0; var73 < 100; ++var73) {
						if (var32 == crossWorldMessageIds[var73]) {
							var34 = true;
							break;
						}
					}

					if (HttpRequest.friendSystem.isIgnored(new Username(var51, class383.loginType))) {
						var34 = true;
					}

					if (!var34 && field625 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var32;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var35 = AbstractFont.escapeBrackets(Skills.method7619(class261.method5505(var3)));
						byte var74;
						if (var27.isPrivileged) {
							var74 = 7;
						} else {
							var74 = 3;
						}

						if (var27.modIcon != -1) {
							Interpreter.addGameMessage(var74, WorldMapElement.method5195(var27.modIcon) + var51, var35);
						} else {
							Interpreter.addGameMessage(var74, var51, var35);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				int var14;
				int var15;
				int var16;
				int var96;
				if (ServerPacket.PROJECTILE_SPAWN == var1.serverPacket) {
					var96 = var3.readUnsignedShortLE();
					var23 = var3.readMedium();
					var21 = var23 >> 16;
					var5 = var23 >> 8 & 255;
					var7 = var21 + (var23 >> 4 & 7);
					var24 = var5 + (var23 & 7);
					var15 = var3.readUnsignedShortLE();
					byte var69 = var3.readByteNeg();
					int var18 = var3.readUnsignedShortAdd();
					var14 = var3.readUnsignedByteAdd() * 4;
					byte var93 = var3.readByteNeg();
					var16 = var3.readUnsignedShort();
					int var17 = var3.readUnsignedByteAdd();
					var11 = var3.method10330();
					var73 = var3.readUnsignedByteNeg() * 4;
					int var19 = var3.method10330();
					var9 = var69 + var7;
					var26 = var93 + var24;
					if (0 <= var7 && var7 < 104 && 0 <= var24 && var24 < 104 && 0 <= var9 && var9 < 104 && 0 <= var26 && var26 < 104 && var96 != 65535) {
						var7 = Coord.method6980(var7);
						var24 = Coord.method6980(var24);
						var9 = Coord.method6980(var9);
						var26 = Coord.method6980(var26);
						Projectile var20 = new Projectile(var96, class30.worldView.plane, var7, var24, Canvas.getTileHeight(class30.worldView, var7, var24, class30.worldView.plane) - var73, var15 + cycle, var16 + cycle, var17, var18, var19, var11, var14);
						var20.setDestination(var9, var26, Canvas.getTileHeight(class30.worldView, var9, var26, class30.worldView.plane) - var14, var15 + cycle);
						class30.worldView.projectiles.addFirst(var20);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SONG_STOP == var1.serverPacket) {
					var5 = var3.readUnsignedShort();
					var21 = var3.readUnsignedShortAdd();
					UserComparator3.method3347(var21, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OBJ_ADD == var1.serverPacket) {
					class224.method5046(class323.field3421);
					var1.serverPacket = null;
					return true;
				}

				NPC var8;
				if (ServerPacket.NPC_HEADICON_SPECIFIC == var1.serverPacket) {
					var21 = var3.readInt();
					short var78 = (short)var3.readShortLE();
					var23 = var3.readUnsignedByte();
					var7 = var3.readUnsignedShort();
					var8 = class30.worldView.npcs[var7];
					if (var8 != null) {
						var8.method3068(var23, var21, var78);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOC_ADD_CHANGE == var1.serverPacket) {
					class224.method5046(class323.field3419);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETANIM == var1.serverPacket) {
					var21 = var3.method10325();
					var5 = var3.readUnsignedIntLE();
					var6 = ClanChannel.widgetDefinition.method7031(var5);
					if (var21 != var6.sequenceId || var21 == -1) {
						var6.sequenceId = var21;
						var6.modelFrame = 0;
						var6.modelFrameCycle = 0;
						UserComparator8.invalidateWidget(var6);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_INFO_SMALL_VIEWPORT == var1.serverPacket) {
					class111.updateNpcs(class30.worldView, true, var3);
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
						var6 = ClanChannel.widgetDefinition.method7031(var21);
					} else {
						var6 = null;
					}

					for (; var3.offset < var1.serverPacketLength; class131.itemContainerSetItem(var5, var7, var24 - 1, var9)) {
						var7 = var3.readUShortSmart();
						var24 = var3.readUnsignedShort();
						var9 = 0;
						if (var24 != 0) {
							var9 = var3.readUnsignedByte();
							if (var9 == 255) {
								var9 = var3.readInt();
							}
						}

						if (var6 != null && var7 >= 0 && var7 < var6.itemIds.length) {
							var6.itemIds[var7] = var24;
							var6.itemQuantities[var7] = var9;
						}
					}

					if (var6 != null) {
						UserComparator8.invalidateWidget(var6);
					}

					class150.method3598();
					changedItemContainers[++field749 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1 == var1.serverPacket) {
					return this.method1310(var1);
				}

				if (ServerPacket.field3483 == var1.serverPacket) {
					var21 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var23 = var3.readUnsignedShort();
					class378.queueSoundEffect(var21, var5, var23);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CHAT_FILTER_SETTINGS == var1.serverPacket) {
					publicChatMode = var3.readUnsignedByteNeg();
					tradeChatMode = var3.readUnsignedByteSub();
					var1.serverPacket = null;
					return true;
				}

				long var36;
				if (ServerPacket.IF_SET_EVENTS == var1.serverPacket) {
					var21 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedIntME();
					var23 = var3.readUnsignedShortAddLE();
					if (var23 == 65535) {
						var23 = -1;
					}

					var7 = var3.readUnsignedShort();
					if (var7 == 65535) {
						var7 = -1;
					}

					for (var24 = var7; var24 <= var23; ++var24) {
						var36 = ((long)var5 << 32) + (long)var24;
						Node var97 = widgetFlags.get(var36);
						if (var97 != null) {
							var97.remove();
						}

						widgetFlags.put(new IntegerNode(var21), var36);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETMODEL == var1.serverPacket) {
					var21 = var3.readInt();
					var5 = var3.readUnsignedShortAddLE();
					var6 = ClanChannel.widgetDefinition.method7031(var21);
					if (var6.modelType != 1 || var5 != var6.modelId) {
						var6.modelType = 1;
						var6.modelId = var5;
						UserComparator8.invalidateWidget(var6);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_LOOKAT_EASED_ANGLE_RELATIVE == var1.serverPacket) {
					isCameraLocked = true;
					field762 = false;
					field757 = true;
					var21 = var3.readShort();
					var5 = var3.readShort();
					var23 = MusicSong.method6949(var5 + class159.cameraPitch & 2027);
					var7 = var21 + IntProjection.cameraYaw;
					var24 = var3.readUnsignedShort();
					var9 = var3.readUnsignedByte();
					field761 = new class520(class159.cameraPitch, var23, var24, var9);
					field725 = new class520(IntProjection.cameraYaw, var7, var24, var9);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SERVER_TICK_END == var1.serverPacket) {
					++serverCycle;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OBJ_RESET_CUSTOMIZATION == var1.serverPacket) {
					class224.method5046(class323.field3424);
					var1.serverPacket = null;
					return true;
				}

				Widget var59;
				if (ServerPacket.IF_SETANGLE == var1.serverPacket) {
					var21 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShortAddLE();
					var23 = var3.readUnsignedShortAdd();
					var7 = var3.readUnsignedShortAddLE();
					var59 = ClanChannel.widgetDefinition.method7031(var21);
					if (var7 != var59.modelAngleX || var5 != var59.modelAngleY || var23 != var59.modelZoom) {
						var59.modelAngleX = var7;
						var59.modelAngleY = var5;
						var59.modelZoom = var23;
						UserComparator8.invalidateWidget(var59);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REFLECTION_CHECKER == var1.serverPacket) {
					IgnoreList.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_FULL == var1.serverPacket) {
					var21 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var21 < -70000) {
						var5 += 32768;
					}

					if (var21 >= 0) {
						var6 = ClanChannel.widgetDefinition.method7031(var21);
					} else {
						var6 = null;
					}

					if (var6 != null) {
						for (var7 = 0; var7 < var6.itemIds.length; ++var7) {
							var6.itemIds[var7] = 0;
							var6.itemQuantities[var7] = 0;
						}
					}

					WorldMapCacheName.clearItemContainer(var5);
					var7 = var3.readUnsignedShort();

					for (var24 = 0; var24 < var7; ++var24) {
						var9 = var3.readUnsignedShortAddLE();
						var26 = var3.readUnsignedByteAdd();
						if (var26 == 255) {
							var26 = var3.readUnsignedIntME();
						}

						if (var6 != null && var24 < var6.itemIds.length) {
							var6.itemIds[var24] = var9;
							var6.itemQuantities[var24] = var26;
						}

						class131.itemContainerSetItem(var5, var24, var9 - 1, var26);
					}

					if (var6 != null) {
						UserComparator8.invalidateWidget(var6);
					}

					class150.method3598();
					changedItemContainers[++field749 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OCULUS_SYNC == var1.serverPacket) {
					var21 = var3.readInt();
					if (var21 != revision) {
						revision = var21;
						class142.method3514();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.HEAT_MAP == var1.serverPacket) {
					var76 = var3.readBoolean();
					if (var76) {
						if (class184.field1975 == null) {
							class184.field1975 = new class402();
						}
					} else {
						class184.field1975 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_TARGET == var1.serverPacket) {
					var21 = var3.readUnsignedByte();
					var5 = var3.readUnsignedShort();
					var23 = var3.readShort();
					if (var21 == 0) {
						class53.entity = GameEngine.topLevelWorldView.players[var5];
						field781 = -1;
					} else if (var21 == 1) {
						field781 = -1;
						class53.entity = GameEngine.topLevelWorldView.npcs[var5];
					} else if (var21 == 2) {
						field781 = var23;
						class53.entity = GameEngine.topLevelWorldView.worldEntities[var5];
						this.method541(true);
					}

					if (class53.entity == null) {
						field781 = -1;
						class53.entity = ModeWhere.localPlayer;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OBJ_SET_CUSTOMIZATION == var1.serverPacket) {
					class224.method5046(class323.field3431);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CLAN_CHANNEL_FULL == var1.serverPacket) {
					field700 = cycleCntr;
					var89 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var89 >= 0) {
							currentClanChannels[var89] = null;
						} else {
							class106.guestClanChannel = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var89 >= 0) {
						currentClanChannels[var89] = new ClanChannel(var3);
					} else {
						class106.guestClanChannel = new ClanChannel(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_PRIVATE_ECHO == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					var22 = AbstractFont.escapeBrackets(Skills.method7619(class261.method5505(var3)));
					Interpreter.addGameMessage(6, var51, var22);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_MOVE_TO == var1.serverPacket) {
					isCameraLocked = true;
					field762 = false;
					field669 = false;
					LoginScreenAnimation.field1293 = var3.readUnsignedByte();
					WorldMapAreaData.field3274 = var3.readUnsignedByte();
					class95.field1167 = var3.readUnsignedShort();
					WorldMapSectionType.field3187 = var3.readUnsignedByte();
					class544.field5398 = var3.readUnsignedByte();
					if (class544.field5398 >= 100) {
						Buddy.cameraX = Coord.method6980(LoginScreenAnimation.field1293);
						class31.cameraZ = Coord.method6980(WorldMapAreaData.field3274);
						Message.cameraY = Canvas.getTileHeight(GameEngine.topLevelWorldView, Buddy.cameraX, class31.cameraZ, GameEngine.topLevelWorldView.plane) - class95.field1167;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.EVENT_WORLDHOP == var1.serverPacket) {
					World var53 = new World();
					var53.host = var3.readStringCp1252NullTerminated();
					var53.id = var3.readUnsignedShort();
					var5 = var3.readInt();
					var53.properties = var5;
					if (var53.isDeadman()) {
						var53.field819 = "beta";
						class273.field3035 = true;
					} else {
						class273.field3035 = false;
					}

					class360.updateGameState(45);
					var2.close();
					var2 = null;
					Language.changeWorld(var53);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.UPDATE_INV_STOP_TRANSIT == var1.serverPacket) {
					var21 = var3.readUnsignedShortAdd();
					JagexCache.method4938(var21);
					changedItemContainers[++field749 - 1 & 31] = var21 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3568 == var1.serverPacket) {
					class436.field4815 = var3.readBoolean();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RESET_CLIENT_VARCACHE == var1.serverPacket) {
					for (var21 = 0; var21 < VarpDefinition.field2505; ++var21) {
						VarpDefinition var83 = class254.VarpDefinition_get(var21);
						if (var83 != null) {
							Varps.Varps_temp[var21] = 0;
							Varps.Varps_main[var21] = 0;
						}
					}

					class150.method3598();
					changedVarpCount += 32;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_LOOKAT == var1.serverPacket) {
					isCameraLocked = true;
					field762 = false;
					field757 = true;
					var21 = SecureUrlRequester.method3301(var3.readShort() & 2027);
					var5 = MusicSong.method6949(var3.readShort() & 2027);
					var23 = var3.readUnsignedShort();
					var7 = var3.readUnsignedByte();
					field761 = new class520(class159.cameraPitch, var5, var23, var7);
					field725 = new class520(IntProjection.cameraYaw, var21, var23, var7);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_INFO == var1.serverPacket) {
					playerUpdateManager.method3144(var3, var1.serverPacketLength);
					AbstractUserComparator.method9190();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CLEAR_ENTITIES == var1.serverPacket) {
					class30.worldView.npcCount = 0;
					class30.worldView.worldEntityCount = 0;

					for (var21 = 0; var21 < 65536; ++var21) {
						class30.worldView.npcs[var21] = null;
					}

					for (var21 = 0; var21 < 2048; ++var21) {
						class30.worldView.worldEntities[var21] = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3505 == var1.serverPacket) {
					Language.updateWorldEntitiesFromPacketBuffer(class30.worldView, var3, 3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CLAN_CHANNEL_DELTA == var1.serverPacket) {
					field700 = cycleCntr;
					var89 = var3.readByte();
					class167 var82 = new class167(var3);
					ClanChannel var62;
					if (var89 >= 0) {
						var62 = currentClanChannels[var89];
					} else {
						var62 = class106.guestClanChannel;
					}

					if (var62 == null) {
						this.method1321(var89);
						var1.serverPacket = null;
						return true;
					}

					if (var82.field1791 > var62.field1810) {
						this.method1321(var89);
						var1.serverPacket = null;
						return true;
					}

					if (var82.field1791 < var62.field1810) {
						var1.serverPacket = null;
						return true;
					}

					var82.method3817(var62);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CLAN_SETTINGS_DELTA == var1.serverPacket) {
					FloorUnderlayDefinition.method5403();
					var89 = var3.readByte();
					class153 var81 = new class153(var3);
					ClanSettings var60;
					if (var89 >= 0) {
						var60 = currentClanSettings[var89];
					} else {
						var60 = InvDefinition.guestClanSettings;
					}

					if (var60 == null) {
						this.method1322(var89);
						var1.serverPacket = null;
						return true;
					}

					if (var81.field1695 > var60.field1738) {
						this.method1322(var89);
						var1.serverPacket = null;
						return true;
					}

					if (var81.field1695 < var60.field1738) {
						var1.serverPacket = null;
						return true;
					}

					var81.method3612(var60);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SYNC_CLIENT_VARCACHE == var1.serverPacket) {
					for (var21 = 0; var21 < Varps.Varps_main.length; ++var21) {
						if (Varps.Varps_temp[var21] != Varps.Varps_main[var21]) {
							Varps.Varps_main[var21] = Varps.Varps_temp[var21];
							RouteStrategy.changeGameOptions(var21);
							changedVarps[++changedVarpCount - 1 & 31] = var21;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RESET_INTERACTION_MODE == var1.serverPacket) {
					var21 = var3.readShort();
					worldViewManager.method2749(var21);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MINIMAP_TOGGLE == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MAP_ANIM == var1.serverPacket) {
					class224.method5046(class323.field3432);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_RUN_WEIGHT == var1.serverPacket) {
					class150.method3598();
					weight = var3.readShort();
					field499 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETSCROLLPOS == var1.serverPacket) {
					var21 = var3.readInt();
					var5 = var3.readUnsignedShortAddLE();
					var6 = ClanChannel.widgetDefinition.method7031(var21);
					if (var6 != null && var6.type == 0) {
						if (var5 > var6.scrollHeight - var6.height) {
							var5 = var6.scrollHeight - var6.height;
						}

						if (var5 < 0) {
							var5 = 0;
						}

						if (var5 != var6.scrollY) {
							var6.scrollY = var5;
							UserComparator8.invalidateWidget(var6);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_FULL_FOLLOWS == var1.serverPacket) {
					class360.field3857 = var3.readUnsignedByteAdd();
					field767 = var3.readUnsignedByteAdd();
					AbstractWorldMapData.field3215 = var3.readUnsignedByteAdd();

					for (var21 = AbstractWorldMapData.field3215; var21 < AbstractWorldMapData.field3215 + 8; ++var21) {
						for (var5 = class360.field3857; var5 < class360.field3857 + 8; ++var5) {
							if (class30.worldView.groundItems[field767][var21][var5] != null) {
								class30.worldView.groundItems[field767][var21][var5] = null;
								ByteArrayPool.updateItemPile(field767, var21, var5);
							}
						}
					}

					for (PendingSpawn var52 = (PendingSpawn)class30.worldView.pendingSpawns.last(); var52 != null; var52 = (PendingSpawn)class30.worldView.pendingSpawns.previous()) {
						if (var52.x >= AbstractWorldMapData.field3215 && var52.x < AbstractWorldMapData.field3215 + 8 && var52.y >= class360.field3857 && var52.y < class360.field3857 + 8 && var52.plane == field767) {
							var52.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.DYNAMICOBJECT_SPAWN == var1.serverPacket) {
					var9 = var3.readUnsignedByte();
					var26 = var9 >> 2;
					var11 = var9 & 3;
					var96 = field578[var26];
					var73 = var3.readUnsignedShort();
					var23 = var3.method10354();
					var21 = var23 >> 16;
					var5 = var23 >> 8 & 255;
					var7 = var21 + (var23 >> 4 & 7);
					var24 = var5 + (var23 & 7);
					if (0 <= var7 && var7 < 103 && 0 <= var24 && var24 < 103) {
						class154.method3621(var7, var24, var26, var11, var96, var73);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED == var1.serverPacket) {
					class360.field3857 = var3.readUnsignedByteAdd();
					AbstractWorldMapData.field3215 = var3.readUnsignedByteAdd();
					field767 = var3.readUnsignedByteAdd();

					while (var3.offset < var1.serverPacketLength) {
						var21 = var3.readUnsignedByte();
						class323 var80 = WorldMapSectionType.method6360()[var21];
						class224.method5046(var80);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.GRAPHICSOBJECT_SPAWN == var1.serverPacket) {
					var23 = var3.method10434();
					var21 = var23 >> 16;
					var5 = var23 >> 8 & 255;
					var7 = var21 + (var23 >> 4 & 7);
					var24 = var5 + (var23 & 7);
					var11 = var3.readUnsignedShort();
					var26 = var3.readUnsignedByteSub();
					var9 = var3.readUnsignedShort();
					if (var7 >= 0 && var24 >= 0 && var7 < class30.worldView.sizeX && var24 < class30.worldView.sizeY) {
						var7 = Coord.method6980(var7);
						var24 = Coord.method6980(var24);
						GraphicsObject var98 = new GraphicsObject(var9, class30.worldView.plane, var7, var24, Canvas.getTileHeight(class30.worldView, var7, var24, class30.worldView.plane) - var26, var11, cycle);
						class30.worldView.graphicsObjects.addFirst(var98);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOC_MERGEPLAYER == var1.serverPacket) {
					class224.method5046(class323.field3422);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.TRIGGER_ONDIALOG_ABORT == var1.serverPacket) {
					if (rootInterface != -1) {
						runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETHIDE == var1.serverPacket) {
					var76 = var3.readUnsignedByteNeg() == 1;
					var5 = var3.readUnsignedIntME();
					var6 = ClanChannel.widgetDefinition.method7031(var5);
					if (var76 != var6.isHidden) {
						var6.isHidden = var76;
						UserComparator8.invalidateWidget(var6);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_SMOOTH_RESET == var1.serverPacket && isCameraLocked) {
					field762 = true;
					field757 = false;
					field669 = false;

					for (var21 = 0; var21 < 5; ++var21) {
						field571[var21] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3453 == var1.serverPacket) {
					var1.field1456 = var3.readShort();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_REGION == var1.serverPacket) {
					FriendSystem.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_SITE_SETTINGS == var1.serverPacket) {
					ApproximateRouteStrategy.method1254(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_INFO_LARGE_VIEWPORT == var1.serverPacket) {
					class111.updateNpcs(class30.worldView, false, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3549 == var1.serverPacket) {
					class93.field1111 = var3.readBoolean();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_RESET == var1.serverPacket) {
					field762 = false;
					isCameraLocked = false;
					field669 = false;
					field757 = false;
					class280.field3067 = 0;
					field801 = 0;
					class416.field4710 = 0;
					field758 = false;
					class383.field4491 = 0;
					HttpQueryParams.field5142 = 0;
					class544.field5398 = 0;
					WorldMapSectionType.field3187 = 0;
					LoginScreenAnimation.field1293 = 0;
					WorldMapAreaData.field3274 = 0;
					class95.field1167 = 0;
					field657 = null;
					field761 = null;
					field725 = null;

					for (var21 = 0; var21 < 5; ++var21) {
						field571[var21] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SONG_WITH_SECONDARY == var1.serverPacket) {
					var7 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedShortAddLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					var23 = var3.readUnsignedShortAddLE();
					var24 = var3.readUnsignedShortAddLE();
					var9 = var3.readUnsignedShortAddLE();
					var21 = var3.readUnsignedShortAdd();
					if (var21 == 65535) {
						var21 = -1;
					}

					ArrayList var64 = new ArrayList();
					var64.add(var21);
					var64.add(var5);
					class420.playSong(var64, var23, var7, var24, var9);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETCOLOUR == var1.serverPacket) {
					var21 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedIntIME();
					var23 = var21 >> 10 & 31;
					var7 = var21 >> 5 & 31;
					var24 = var21 & 31;
					var9 = (var7 << 11) + (var23 << 19) + (var24 << 3);
					Widget var63 = ClanChannel.widgetDefinition.method7031(var5);
					if (var9 != var63.color) {
						var63.color = var9;
						UserComparator8.invalidateWidget(var63);
					}

					var1.serverPacket = null;
					return true;
				}

				boolean var67;
				if (ServerPacket.CAM_MOVETO_EASED_CIRCULAR == var1.serverPacket) {
					isCameraLocked = true;
					field762 = false;
					field669 = true;
					LoginScreenAnimation.field1293 = var3.readUnsignedByte();
					WorldMapAreaData.field3274 = var3.readUnsignedByte();
					var21 = var3.readUnsignedShort();
					var5 = Coord.method6980(var3.readUnsignedByte());
					var23 = Coord.method6980(var3.readUnsignedByte());
					var7 = var3.readUnsignedShort();
					field758 = var3.readBoolean();
					var24 = var3.readUnsignedByte();
					var9 = Coord.method6980(LoginScreenAnimation.field1293);
					var26 = Coord.method6980(WorldMapAreaData.field3274);
					var67 = false;
					var34 = false;
					if (field758) {
						var11 = Message.cameraY;
						var96 = Canvas.getTileHeight(GameEngine.topLevelWorldView, var9, var26, GameEngine.topLevelWorldView.plane) - var21;
					} else {
						var11 = Canvas.getTileHeight(GameEngine.topLevelWorldView, Buddy.cameraX, class31.cameraZ, GameEngine.topLevelWorldView.plane) - Message.cameraY;
						var96 = var21;
					}

					field657 = new class518(Buddy.cameraX, class31.cameraZ, var11, var9, var26, var96, var5, var23, var7, var24);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VAR_CLAN_DISABLE == var1.serverPacket) {
					field803 = null;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_CLAN_CHANNEL_SYSTEM == var1.serverPacket) {
					var89 = var3.readByte();
					var28 = (long)var3.readUnsignedShort();
					var30 = (long)var3.readMedium();
					var36 = (var28 << 32) + var30;
					var67 = false;
					ClanChannel var39 = var89 >= 0 ? currentClanChannels[var89] : class106.guestClanChannel;
					if (var39 == null) {
						var67 = true;
					} else {
						for (var73 = 0; var73 < 100; ++var73) {
							if (var36 == crossWorldMessageIds[var73]) {
								var67 = true;
								break;
							}
						}
					}

					if (!var67) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var36;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var35 = class261.method5505(var3);
						var14 = var89 >= 0 ? 43 : 46;
						Script.addChatMessage(var14, "", var35, var39.name);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_MODE == var1.serverPacket) {
					var21 = var3.readUnsignedByte();
					class215.updateLoginIndex(var21);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_MOVESUB == var1.serverPacket) {
					var21 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedIntME();
					InterfaceParent var57 = (InterfaceParent)interfaceParents.get((long)var21);
					var84 = (InterfaceParent)interfaceParents.get((long)var5);
					if (var84 != null) {
						NPCComposition.closeInterface(var84, var57 == null || var84.group != var57.group);
					}

					if (var57 != null) {
						var57.remove();
						interfaceParents.put(var57, (long)var5);
					}

					var59 = ClanChannel.widgetDefinition.method7031(var21);
					if (var59 != null) {
						UserComparator8.invalidateWidget(var59);
					}

					var59 = ClanChannel.widgetDefinition.method7031(var5);
					if (var59 != null) {
						UserComparator8.invalidateWidget(var59);
						class244.revalidateWidgetScroll(ClanChannel.widgetDefinition.Widget_interfaceComponents[var59.id >>> 16], var59, true);
					}

					if (rootInterface != -1) {
						runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETOBJECT == var1.serverPacket) {
					var21 = var3.readUnsignedIntLE();
					var5 = var3.readUnsignedShortAdd();
					if (var5 == 65535) {
						var5 = -1;
					}

					var23 = var3.readUnsignedIntME();
					var86 = ClanChannel.widgetDefinition.method7031(var23);
					ItemComposition var58;
					if (!var86.isIf3) {
						if (var5 == -1) {
							var86.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var58 = FaceNormal.ItemDefinition_get(var5).getCountObj(var21);
						var86.modelType = 4;
						var86.modelId = var5;
						var86.modelAngleX = var58.xan2d;
						var86.modelAngleY = var58.yan2d;
						var86.modelZoom = var58.zoom2d * 100 / var21;
						UserComparator8.invalidateWidget(var86);
					} else {
						var86.itemId = var5;
						var86.itemQuantity = var21;
						var58 = FaceNormal.ItemDefinition_get(var5).getCountObj(var21);
						var86.modelAngleX = var58.xan2d;
						var86.modelAngleY = var58.yan2d;
						var86.modelAngleZ = var58.zan2d;
						var86.modelOffsetX = var58.offsetX2d;
						var86.modelOffsetY = var58.offsetY2d;
						var86.modelZoom = var58.zoom2d;
						if (var58.isStackable == 1) {
							var86.itemQuantityMode = 1;
						} else {
							var86.itemQuantityMode = 2;
						}

						if (var86.field3927 > 0) {
							var86.modelZoom = var86.modelZoom * 32 / var86.field3927;
						} else if (var86.rawWidth > 0) {
							var86.modelZoom = var86.modelZoom * 32 / var86.rawWidth;
						}

						UserComparator8.invalidateWidget(var86);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETPOSITION == var1.serverPacket) {
					var21 = var3.readUnsignedIntIME();
					var5 = var3.readShortLE();
					var23 = var3.readShortLE();
					var86 = ClanChannel.widgetDefinition.method7031(var21);
					if (var23 != var86.rawX || var5 != var86.rawY || var86.xAlignment != 0 || var86.yAlignment != 0) {
						var86.rawX = var23;
						var86.rawY = var5;
						var86.xAlignment = 0;
						var86.yAlignment = 0;
						UserComparator8.invalidateWidget(var86);
						this.alignWidget(var86);
						if (var86.type == 0) {
							class244.revalidateWidgetScroll(ClanChannel.widgetDefinition.Widget_interfaceComponents[var21 >> 16], var86, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_OPENSUB == var1.serverPacket) {
					var21 = var3.readUnsignedIntLE();
					var5 = var3.readUnsignedByteSub();
					var23 = var3.readUnsignedShortLE();
					var84 = (InterfaceParent)interfaceParents.get((long)var21);
					if (var84 != null) {
						NPCComposition.closeInterface(var84, var23 != var84.group);
					}

					class6.openInterface(var21, var23, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_IGNORELIST == var1.serverPacket) {
					HttpRequest.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					class328.FriendSystem_invalidateIgnoreds();
					field697 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				String var40;
				if (ServerPacket.MESSAGE_FRIEND_CHANNEL == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					var28 = var3.readLong();
					var30 = (long)var3.readUnsignedShort();
					var36 = (long)var3.readMedium();
					PlayerType var38 = (PlayerType)StructComposition.findEnumerated(class151.PlayerType_values(), var3.readUnsignedByte());
					var68 = var36 + (var30 << 32);
					boolean var72 = false;

					for (var15 = 0; var15 < 100; ++var15) {
						if (crossWorldMessageIds[var15] == var68) {
							var72 = true;
							break;
						}
					}

					if (var38.isUser && HttpRequest.friendSystem.isIgnored(new Username(var51, class383.loginType))) {
						var72 = true;
					}

					if (!var72 && field625 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var68;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var40 = AbstractFont.escapeBrackets(Skills.method7619(class261.method5505(var3)));
						if (var38.modIcon != -1) {
							Script.addChatMessage(9, WorldMapElement.method5195(var38.modIcon) + var51, var40, WorldMapRectangle.base37DecodeLong(var28));
						} else {
							Script.addChatMessage(9, var51, var40, WorldMapRectangle.base37DecodeLong(var28));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER == var1.serverPacket) {
					return this.method1311(var1);
				}

				if (ServerPacket.NPC_SPOTANIM == var1.serverPacket) {
					var21 = var3.readUnsignedShortAddLE();
					var8 = class30.worldView.npcs[var21];
					var23 = var3.readUnsignedShortAddLE();
					var7 = var3.readUnsignedByteAdd();
					var5 = var3.readUnsignedIntIME();
					if (var8 != null) {
						var8.updateSpotAnimation(var7, var23, var5 >> 16, var5 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MAP_PROJANIM == var1.serverPacket) {
					class224.method5046(class323.field3428);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CLAN_SETTINGS_FULL == var1.serverPacket) {
					FloorUnderlayDefinition.method5403();
					var89 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var89 >= 0) {
							currentClanSettings[var89] = null;
						} else {
							InvDefinition.guestClanSettings = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var89 >= 0) {
						currentClanSettings[var89] = new ClanSettings(var3);
					} else {
						InvDefinition.guestClanSettings = new ClanSettings(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_STAT == var1.serverPacket) {
					class150.method3598();
					var21 = var3.readUnsignedByteNeg();
					var5 = var3.readUnsignedByteNeg();
					var23 = var3.readInt();
					var7 = var3.readUnsignedByte();
					experience[var5] = var23;
					currentLevels[var5] = var7;
					levels[var5] = 1;
					field645[var5] = var21;

					for (var24 = 0; var24 < 98; ++var24) {
						if (var23 >= Skills.Skills_experienceTable[var24]) {
							levels[var5] = var24 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VARP_LARGE == var1.serverPacket) {
					var21 = var3.readUnsignedShort();
					var5 = var3.readInt();
					Varps.Varps_temp[var21] = var5;
					if (Varps.Varps_main[var21] != var5) {
						Varps.Varps_main[var21] = var5;
					}

					RouteStrategy.changeGameOptions(var21);
					changedVarps[++changedVarpCount - 1 & 31] = var21;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_JINGLE == var1.serverPacket) {
					var21 = var3.method10354();
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					DynamicObject.method2494(var5, var21);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_PLAYERMODEL_BODYTYPE == var1.serverPacket) {
					var21 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedByteAdd();
					var6 = ClanChannel.widgetDefinition.method7031(var21);
					var6.field3924.method7062(ModeWhere.localPlayer.appearance.gender, var5);
					UserComparator8.invalidateWidget(var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3526 == var1.serverPacket) {
					class224.method5046(class323.field3425);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OBJ_OPFILTER == var1.serverPacket) {
					class224.method5046(class323.field3423);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_FRIENDS_CHAT == var1.serverPacket) {
					var89 = var3.readByte();
					var22 = var3.readStringCp1252NullTerminated();
					long var41 = (long)var3.readUnsignedShort();
					long var43 = (long)var3.readMedium();
					PlayerType var10 = (PlayerType)StructComposition.findEnumerated(class151.PlayerType_values(), var3.readUnsignedByte());
					long var45 = var43 + (var41 << 32);
					boolean var13 = false;
					ClanChannel var47 = null;
					var47 = var89 >= 0 ? currentClanChannels[var89] : class106.guestClanChannel;
					if (var47 == null) {
						var13 = true;
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var10.isUser && HttpRequest.friendSystem.isIgnored(new Username(var22, class383.loginType))) {
									var13 = true;
								}
								break;
							}

							if (crossWorldMessageIds[var15] == var45) {
								var13 = true;
								break;
							}

							++var15;
						}
					}

					if (!var13) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var45;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var40 = AbstractFont.escapeBrackets(class261.method5505(var3));
						var16 = var89 >= 0 ? 41 : 44;
						if (var10.modIcon != -1) {
							Script.addChatMessage(var16, WorldMapElement.method5195(var10.modIcon) + var22, var40, var47.name);
						} else {
							Script.addChatMessage(var16, var22, var40, var47.name);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RESET_ANIMS == var1.serverPacket) {
					for (var21 = 0; var21 < class30.worldView.players.length; ++var21) {
						if (class30.worldView.players[var21] != null) {
							class30.worldView.players[var21].sequence = -1;
						}
					}

					for (var21 = 0; var21 < class30.worldView.npcs.length; ++var21) {
						if (class30.worldView.npcs[var21] != null) {
							class30.worldView.npcs[var21].sequence = -1;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3573 == var1.serverPacket) {
					var21 = var3.readShort();
					class492 var79 = (class492)StructComposition.findEnumerated(PlayerComposition.method7114(), var3.readUnsignedByte());
					class491 var56 = (class491)StructComposition.findEnumerated(GrandExchangeOfferNameComparator.method7881(), var3.readUnsignedByte());
					if (var21 == -2) {
						worldViewManager.method2739(var79, var56);
					} else {
						worldViewManager.method2718(var21, var79, var56);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOC_ANIM == var1.serverPacket) {
					class224.method5046(class323.field3430);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_TEXT == var1.serverPacket) {
					var21 = var3.readUnsignedIntME();
					var22 = var3.readStringCp1252NullTerminated();
					var6 = ClanChannel.widgetDefinition.method7031(var21);
					if (!var22.equals(var6.text)) {
						var6.text = var22;
						UserComparator8.invalidateWidget(var6);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_PRIVCHATMODE == var1.serverPacket) {
					WorldMapLabelSize.privateChatMode = class463.method9025(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_LOOKAT_EASED_COORD == var1.serverPacket) {
					isCameraLocked = true;
					field762 = false;
					field757 = true;
					class280.field3067 = var3.readUnsignedByte();
					field801 = var3.readUnsignedByte();
					class416.field4710 = var3.readUnsignedShort();
					var21 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var23 = Coord.method6980(class280.field3067);
					var7 = Coord.method6980(field801);
					var24 = Canvas.getTileHeight(GameEngine.topLevelWorldView, var23, var7, GameEngine.topLevelWorldView.plane) - class416.field4710;
					var9 = var23 - Buddy.cameraX;
					var26 = var24 - Message.cameraY;
					var11 = var7 - class31.cameraZ;
					double var12 = Math.sqrt((double)(var11 * var11 + var9 * var9));
					var14 = MusicSong.method6949((int)(Math.atan2((double)var26, var12) * 325.9490051269531D) & 2047);
					var15 = SecureUrlRequester.method3301((int)(Math.atan2((double)var9, (double)var11) * -325.9490051269531D) & 2047);
					field761 = new class520(class159.cameraPitch, var14, var21, var5);
					field725 = new class520(IntProjection.cameraYaw, var15, var21, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_RUN_ENERGY == var1.serverPacket) {
					class150.method3598();
					runEnergy = var3.readUnsignedShort();
					field499 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETNPCHEAD_ACTIVE == var1.serverPacket) {
					var21 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedIntLE();
					var6 = ClanChannel.widgetDefinition.method7031(var5);
					if (var6.modelType != 6 || var21 != var6.modelId) {
						var6.modelType = 6;
						var6.modelId = var21;
						UserComparator8.invalidateWidget(var6);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_SHAKE == var1.serverPacket) {
					var21 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var23 = var3.readUnsignedByte();
					var7 = var3.readUnsignedByte();
					field571[var21] = true;
					field764[var21] = var5;
					field690[var21] = var23;
					field768[var21] = var7;
					field705[var21] = 0;
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

					field701 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_ACTIVE_WORLD == var1.serverPacket) {
					var21 = var3.readUnsignedByte();
					var5 = var3.readUnsignedShort();
					var23 = var3.readUnsignedByte();
					IntProjection.field1966 = var23;
					if (var21 == 0) {
						GameEngine.topLevelWorldView.plane = var23;
						class30.worldView = GameEngine.topLevelWorldView;
					} else {
						if (var21 != 1) {
							throw new RuntimeException("Don't know what world we're about to receive updates for, this is bad");
						}

						WorldEntity var25 = GameEngine.topLevelWorldView.worldEntities[var5];
						var25.worldView.plane = var23;
						class30.worldView = var25.worldView;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.FRIENDS_LIST_LOADED == var1.serverPacket) {
					HttpRequest.friendSystem.method2066();
					field697 = cycleCntr;
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
						hintArrowHeight = var3.readUnsignedByte() * 2;
					}

					if (hintArrowType == 10) {
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VAR_CLAN_ENABLE == var1.serverPacket) {
					field803 = new class496(UserComparator9.field1513);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RUNCLIENTSCRIPT == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					Object[] var77 = new Object[var51.length() + 1];

					for (var23 = var51.length() - 1; var23 >= 0; --var23) {
						if (var51.charAt(var23) == 's') {
							var77[var23 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var77[var23 + 1] = new Integer(var3.readInt());
						}
					}

					var77[0] = new Integer(var3.readInt());
					ScriptEvent var54 = new ScriptEvent();
					var54.args = var77;
					Friend.runScriptEvent(var54);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_PLAYERMODEL_SELF == var1.serverPacket) {
					var76 = var3.readUnsignedByteSub() == 1;
					var5 = var3.readUnsignedIntIME();
					var6 = ClanChannel.widgetDefinition.method7031(var5);
					var6.method7542(ModeWhere.localPlayer.appearance, var76);
					UserComparator8.invalidateWidget(var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_NORMAL == var1.serverPacket) {
					FriendSystem.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_OPENTOP == var1.serverPacket) {
					var21 = var3.readUnsignedShortLE();
					if (var21 == 65535) {
						var21 = -1;
					}

					rootInterface = var21;
					this.method1317(false);
					RestClientThreadFactory.method211(var21);
					WorldMapIcon_0.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						validRootWidgets[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETNPCHEAD == var1.serverPacket) {
					var21 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedIntME();
					var6 = ClanChannel.widgetDefinition.method7031(var5);
					if (var6.modelType != 2 || var21 != var6.modelId) {
						var6.modelType = 2;
						var6.modelId = var21;
						UserComparator8.invalidateWidget(var6);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VAR_CLAN == var1.serverPacket) {
					if (field803 == null) {
						field803 = new class496(UserComparator9.field1513);
					}

					class565 var50 = UserComparator9.field1513.method9513(var3);
					field803.field5127.vmethod10011(var50.field5538, var50.field5539);
					field694[++field579 - 1 & 31] = var50.field5538;
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

				class255.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1447 != null ? var1.field1447.id : -1) + "," + (var1.field1460 != null ? var1.field1460.id : -1) + "," + var1.serverPacketLength, (Throwable)null);
				logOut();
			} catch (IOException var48) {
				MenuAction.method2363();
			} catch (Exception var49) {
				var22 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1447 != null ? var1.field1447.id : -1) + "," + (var1.field1460 != null ? var1.field1460.id : -1) + "," + var1.serverPacketLength + "," + (ModeWhere.localPlayer.pathX[0] + GameEngine.topLevelWorldView.baseX) + "," + (ModeWhere.localPlayer.pathY[0] + GameEngine.topLevelWorldView.baseY) + ",";

				for (var23 = 0; var23 < var1.serverPacketLength && var23 < 50; ++var23) {
					var22 = var22 + var3.array[var23] + ",";
				}

				class255.RunException_sendStackTrace(var22, var49);
				logOut();
			}

			return true;
		}
	}

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1984807253"
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
				if (var10 != 1 && (KeyHandler.mouseCam || var10 != 4) && !menu.method10922(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y)) {
					isMenuOpen = false;
					menu.invalidateWidgetsUnder();
				}

				if (var10 == 1 || !KeyHandler.mouseCam && var10 == 4) {
					menu.method10923(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					isMenuOpen = false;
					menu.invalidateWidgetsUnder();
				}
			} else if (menu.menuOptionsCount > 0) {
				var3 = menu.menuOptionsCount - 1;
				if ((var10 == 1 || !KeyHandler.mouseCam && var10 == 4) && this.shouldLeftClickOpenMenu(menu.menuOpcodes[var3], menu.menuShiftClick[var3])) {
					var10 = 2;
				}

				if (var10 == 1 || !KeyHandler.mouseCam && var10 == 4) {
					menu.method10921(var3);
				}

				if (var10 == 2) {
					this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}
			}

		}
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(IZI)Z",
		garbageValue = "-228881169"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu(int var1, boolean var2) {
		boolean var3 = leftClickOpensMenu && menu.menuOptionsCount > 2;
		if (!var3) {
			int var5 = var1;
			if (var1 >= 2000) {
				var5 = var1 - 2000;
			}

			boolean var4 = var5 == 1007;
			var3 = var4;
		}

		return var3 && !var2;
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1310288417"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		menu.method10920(var1, var2);
		Iterator var3 = worldViewManager.iterator();

		while (var3.hasNext()) {
			WorldView var4 = (WorldView)var3.next();
			var4.scene.menuOpen(false);
		}

		isMenuOpen = true;
		menu.method10924();
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "126"
	)
	final void method1317(boolean var1) {
		int var2 = rootInterface;
		int var3 = BuddyRankComparator.canvasWidth;
		int var4 = Huffman.canvasHeight;
		if (ClanChannel.widgetDefinition.loadInterface(var2)) {
			ArchiveLoader.resizeInterface(ClanChannel.widgetDefinition.Widget_interfaceComponents[var2], -1, var3, var4, var1);
		}

	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(Lna;I)V",
		garbageValue = "2133359849"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : ClanChannel.widgetDefinition.method7031(var1.parentId);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = BuddyRankComparator.canvasWidth;
			var4 = Huffman.canvasHeight;
		} else {
			var3 = var2.width;
			var4 = var2.height;
		}

		GrandExchangeOfferTotalQuantityComparator.alignWidgetSize(var1, var3, var4, false);
		ArchiveLoader.alignWidgetPosition(var1, var3, var4);
	}

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-6921"
	)
	final void method1561() {
		UserComparator8.invalidateWidget(clickedWidget);
		++class243.widgetDragDuration;
		int var1;
		int var2;
		if (field683 && field523) {
			var1 = MouseHandler.MouseHandler_x;
			var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field681) {
				var1 = field681;
			}

			if (var1 + clickedWidget.width > field681 + clickedWidgetParent.width) {
				var1 = field681 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field682) {
				var2 = field682;
			}

			if (var2 + clickedWidget.height > clickedWidgetParent.height + field682) {
				var2 = field682 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field721;
			int var4 = var2 - field685;
			int var5 = clickedWidget.dragZoneSize;
			if (class243.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}

			int var6 = var1 - field681 + clickedWidgetParent.scrollX;
			int var7 = var2 - field682 + clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = clickedWidget.onDrag;
				Friend.runScriptEvent(var8);
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
						Friend.runScriptEvent(var8);
					}

					if (draggedOnWidget != null && class211.method4832(clickedWidget) != null) {
						PacketBufferNode var11 = ScriptEvent.getPacketBufferNode(ClientPacket.OPHELDD, packetWriter.isaacCipher);
						var11.packetBuffer.writeShort(clickedWidget.itemId);
						var11.packetBuffer.writeShortAddLE(draggedOnWidget.childIndex);
						var11.packetBuffer.writeShortAddLE(clickedWidget.childIndex);
						var11.packetBuffer.writeInt(draggedOnWidget.id);
						var11.packetBuffer.writeShort(draggedOnWidget.itemId);
						var11.packetBuffer.writeInt(clickedWidget.id);
						packetWriter.addNode(var11);
					}
				} else if (class318.tempMenuAction != null && !this.shouldLeftClickOpenMenu(class318.tempMenuAction.opcode, class318.tempMenuAction.field912)) {
					if (menu.menuOptionsCount > 0) {
						int var10 = field721 + widgetClickX;
						int var9 = field685 + widgetClickY;
						class36.method721(class318.tempMenuAction, var10, var9);
						class318.tempMenuAction = null;
					}
				} else {
					this.openMenu(field721 + widgetClickX, widgetClickY + field685);
				}

				clickedWidget = null;
			}

		} else {
			if (class243.widgetDragDuration > 1) {
				if (!isDraggingWidget && menu.menuOptionsCount > 0) {
					var1 = field721 + widgetClickX;
					var2 = field685 + widgetClickY;
					class36.method721(class318.tempMenuAction, var1, var2);
					class318.tempMenuAction = null;
				}

				clickedWidget = null;
			}

		}
	}

	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "(B)Lwb;",
		garbageValue = "-23"
	)
	@Export("username")
	public Username username() {
		return ModeWhere.localPlayer != null ? ModeWhere.localPlayer.username : null;
	}

	@ObfuscatedName("pc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1543488022"
	)
	void method1321(int var1) {
		PacketBufferNode var2 = ScriptEvent.getPacketBufferNode(ClientPacket.field3342, packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(var1);
		packetWriter.addNode(var2);
	}

	@ObfuscatedName("pq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1324183200"
	)
	void method1322(int var1) {
		PacketBufferNode var2 = ScriptEvent.getPacketBufferNode(ClientPacket.field3371, packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(var1);
		packetWriter.addNode(var2);
	}

	public void setClient(int var1) {
		this.clientId = var1;
	}

	protected void finalize() throws Throwable {
		class440.method8814(this);
		super.finalize();
	}

	public long getAccountHash() {
		return this.accountHash;
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
							int var4 = Integer.parseInt(var2);
							Language var10;
							if (var4 >= 0 && var4 < Language.Language_valuesOrdered.length) {
								var10 = Language.Language_valuesOrdered[var4];
							} else {
								var10 = null;
							}

							ScriptFrame.clientLanguage = var10;
							break;
						case 7:
							class438.field4820 = ChatChannel.method2508(Integer.parseInt(var2));
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) {
							}
							break;
						case 9:
							Language.field4674 = var2;
							break;
						case 10:
							StudioGame[] var5 = new StudioGame[]{StudioGame.game3, StudioGame.oldscape, StudioGame.runescape, StudioGame.stellardawn, StudioGame.game4, StudioGame.game5};
							StructComposition.field2749 = (StudioGame)StructComposition.findEnumerated(var5, Integer.parseInt(var2));
							if (StructComposition.field2749 == StudioGame.oldscape) {
								class383.loginType = LoginType.oldscape;
							} else {
								class383.loginType = LoginType.field5358;
							}
							break;
						case 11:
							FriendLoginUpdate.authServiceBaseUrl = var2;
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
							class483.field5046 = Integer.parseInt(var2);
							break;
						case 15:
							gameBuild = Integer.parseInt(var2);
							break;
						case 17:
							class28.field121 = var2;
							break;
						case 21:
							field766 = Integer.parseInt(var2);
							break;
						case 22:
							RouteStrategy.gameSessionServiceBaseUrl = var2;
							break;
						case 25:
							int var3 = var2.indexOf(".");
							if (var3 == -1) {
								Integer.parseInt(var2);
							} else {
								Integer.parseInt(var2.substring(0, var3));
								Integer.parseInt(var2.substring(var3 + 1));
							}
						}
					}
				}

				Scene.Scene_isLowDetail = false;
				isLowDetail = false;
				FontName.worldHost = this.getCodeBase().getHost();
				HitSplatDefinition.field2760 = new JagNetThread();
				String var6 = class438.field4820.name;
				byte var7 = 0;
				if ((worldProperties & class552.field5442.rsOrdinal()) != 0) {
					class255.field2724 = "beta";
				}

				try {
					class30.method483("oldschool", class255.field2724, var6, var7, 23);
				} catch (Exception var8) {
					class255.RunException_sendStackTrace((String)null, var8);
				}

				client = this;
				class226.field2468 = clientType;
				class431.accessToken = System.getenv("JX_ACCESS_TOKEN");
				class165.refreshToken = System.getenv("JX_REFRESH_TOKEN");
				AsyncHttpResponse.sessionId = System.getenv("JX_SESSION_ID");
				DevicePcmPlayerProvider.characterId = System.getenv("JX_CHARACTER_ID");
				class174.method3886(System.getenv("JX_DISPLAY_NAME"));
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
					this.https = true;
				}

				if (field498 == -1) {
					if (!this.containsAccessAndRefreshToken() && !this.containsSessionAndCharacterId()) {
						field498 = 0;
					} else {
						field498 = 5;
					}
				}

				this.startThread(765, 503, 228, 1);
			}
		} catch (RuntimeException var9) {
			throw class506.newRunException(var9, "client.init(" + ')');
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V"
	)
	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) {
			this.otlTokenRequester = var1;
			Varcs.method3212(10);
		}
	}

	public boolean isOnLoginScreen() {
		return gameState == 10;
	}

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) {
			this.refreshAccessTokenRequester = var1;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)[B",
		garbageValue = "567852072"
	)
	public static byte[] method1772(CharSequence var0) {
		int var1 = var0.length();
		byte[] var2 = new byte[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if (var4 > 127) {
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4;
			}
		}

		return var2;
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	@Export("logOut")
	static final void logOut() {
		packetWriter.close();
		class4.clear();
		worldViewManager.clear();
		playerUpdateManager.method3139();
		field575.method5738();
		System.gc();
		UserComparator3.method3347(0, 0);
		class153.method3619();
		playingJingle = false;
		World.method1957();
		class360.updateGameState(10);
		serverCycle = 0;
		class143.method3517().method4979();
		class143.method3517().method4980();
	}

	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2001451968"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (ClanChannel.widgetDefinition.loadInterface(var0)) {
			BuddyRankComparator.runComponentCloseListeners(ClanChannel.widgetDefinition.Widget_interfaceComponents[var0], var1);
		}
	}
}
