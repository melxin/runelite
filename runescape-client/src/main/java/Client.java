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
import java.util.Date;
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
	@ObfuscatedName("xa")
	@ObfuscatedSignature(
		descriptor = "Lcx;"
	)
	static final ApproximateRouteStrategy field818;
	@ObfuscatedName("xq")
	static int[] field711;
	@ObfuscatedName("xb")
	static int[] field650;
	@ObfuscatedName("ww")
	@ObfuscatedGetter(
		intValue = -60411697
	)
	static int field708;
	@ObfuscatedName("bm")
	static boolean field618;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1986114405
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -1127303531
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -1636244539
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("cj")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("cy")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -882337331
	)
	static int field515;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -328170511
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 983194877
	)
	static int field517;
	@ObfuscatedName("cu")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("dc")
	static boolean field519;
	@ObfuscatedName("dd")
	static boolean field520;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = 1764426343
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("dj")
	static boolean field629;
	@ObfuscatedName("dr")
	static boolean field575;
	@ObfuscatedName("dl")
	static boolean field524;
	@ObfuscatedName("dn")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -1782001115
	)
	@Export("cycle")
	public static int cycle;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -2018705289
	)
	@Export("serverCycle")
	static int serverCycle;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		longValue = -6703678322237761167L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 1302297153
	)
	static int field529;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -595292589
	)
	static int field530;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		longValue = 1768036328115297689L
	)
	static long field722;
	@ObfuscatedName("dx")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = -1856184765
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = -1615251739
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = 1662263425
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -1771988467
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = -1945492459
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = -32299277
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 1303667180
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("ew")
	@ObfuscatedGetter(
		intValue = 1435845568
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("es")
	@ObfuscatedGetter(
		intValue = 1733188031
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "Lep;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Lep;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("ez")
	@Export("z")
	static boolean z;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	static class94 field545;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = -2124796389
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("en")
	@ObfuscatedGetter(
		intValue = 238054095
	)
	static int field608;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("ft")
	@ObfuscatedGetter(
		intValue = -1165060455
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("fv")
	@ObfuscatedGetter(
		intValue = -750022667
	)
	static int field595;
	@ObfuscatedName("ff")
	@ObfuscatedGetter(
		intValue = 699807023
	)
	static int field551;
	@ObfuscatedName("fa")
	@ObfuscatedGetter(
		intValue = -1093944507
	)
	static int field564;
	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	@Export("authenticationScheme")
	static AuthenticationScheme authenticationScheme;
	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "Lwk;"
	)
	static class573 field554;
	@ObfuscatedName("ga")
	@Export("BASIC_AUTH_DESKTOP_OSRS")
	static final String BASIC_AUTH_DESKTOP_OSRS;
	@ObfuscatedName("gh")
	@Export("BASIC_AUTH_DESKTOP_RUNELITE")
	static final String BASIC_AUTH_DESKTOP_RUNELITE;
	@ObfuscatedName("hz")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("hx")
	static int[] field569;
	@ObfuscatedName("hj")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("hs")
	@ObfuscatedGetter(
		intValue = 1514564031
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("hn")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("it")
	static String field674;
	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("ij")
	@ObfuscatedGetter(
		intValue = -867198165
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("ib")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("id")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("is")
	@ObfuscatedGetter(
		intValue = -1565958373
	)
	static int field553;
	@ObfuscatedName("ic")
	@ObfuscatedGetter(
		intValue = 1904043857
	)
	static int field582;
	@ObfuscatedName("ih")
	@ObfuscatedGetter(
		intValue = 622810553
	)
	static int field583;
	@ObfuscatedName("io")
	@ObfuscatedGetter(
		intValue = 1939300317
	)
	static int field584;
	@ObfuscatedName("iy")
	@ObfuscatedGetter(
		intValue = -2037884001
	)
	static int field585;
	@ObfuscatedName("jl")
	static int[][][] field514;
	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	@Export("worldViewManager")
	public static WorldViewManager worldViewManager;
	@ObfuscatedName("jt")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("jn")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("js")
	static final int[] field509;
	@ObfuscatedName("ja")
	@ObfuscatedGetter(
		intValue = 1876928217
	)
	static int field591;
	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	@Export("playerUpdateManager")
	static PlayerUpdateManager playerUpdateManager;
	@ObfuscatedName("jb")
	@ObfuscatedGetter(
		intValue = -895463339
	)
	@Export("graphicsCycle")
	static int graphicsCycle;
	@ObfuscatedName("kq")
	@ObfuscatedGetter(
		intValue = 1221880035
	)
	static int field594;
	@ObfuscatedName("kj")
	@ObfuscatedGetter(
		intValue = -409098915
	)
	static int field730;
	@ObfuscatedName("ka")
	@ObfuscatedGetter(
		intValue = -516614303
	)
	static int field561;
	@ObfuscatedName("ki")
	@ObfuscatedGetter(
		intValue = -1445900479
	)
	static int field592;
	@ObfuscatedName("kh")
	static boolean field716;
	@ObfuscatedName("ku")
	@ObfuscatedGetter(
		intValue = -274344415
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("ks")
	@ObfuscatedGetter(
		intValue = -118476971
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("kv")
	@ObfuscatedGetter(
		intValue = -1225851743
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("ky")
	@ObfuscatedGetter(
		intValue = -1723561289
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("ly")
	@ObfuscatedGetter(
		intValue = 2024791521
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = 944449345
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("le")
	@ObfuscatedGetter(
		intValue = 1751857709
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("lb")
	@ObfuscatedGetter(
		intValue = 88002771
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("lg")
	@ObfuscatedGetter(
		intValue = -1573787523
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("lw")
	@ObfuscatedGetter(
		intValue = 1527153941
	)
	static int field663;
	@ObfuscatedName("lr")
	@ObfuscatedGetter(
		intValue = 873213779
	)
	static int field609;
	@ObfuscatedName("lz")
	@ObfuscatedGetter(
		intValue = -763362793
	)
	static int field610;
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = 1233065249
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("lj")
	@ObfuscatedGetter(
		intValue = -506565479
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("la")
	@ObfuscatedGetter(
		intValue = -1858321959
	)
	@Export("revision")
	static int revision;
	@ObfuscatedName("ll")
	static boolean field614;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = 68513709
	)
	static int field763;
	@ObfuscatedName("lc")
	static boolean field794;
	@ObfuscatedName("lo")
	@ObfuscatedGetter(
		intValue = -8836719
	)
	static int field617;
	@ObfuscatedName("lh")
	@ObfuscatedGetter(
		intValue = -1965581179
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("ld")
	@ObfuscatedGetter(
		intValue = 1000204933
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("lf")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("lm")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("ln")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("lp")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("lv")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("mf")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("mh")
	static int[][] field547;
	@ObfuscatedName("mg")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("ml")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("mc")
	@ObfuscatedGetter(
		intValue = -845860229
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("mj")
	@ObfuscatedGetter(
		intValue = -925798497
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("mt")
	@ObfuscatedGetter(
		intValue = -1107243457
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("mz")
	@ObfuscatedGetter(
		intValue = 1181131139
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("mq")
	@ObfuscatedGetter(
		intValue = 1734738787
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("mb")
	@ObfuscatedGetter(
		intValue = 2025536004
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("md")
	@ObfuscatedGetter(
		intValue = 1592809345
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("ms")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("mo")
	@ObfuscatedGetter(
		intValue = -1671808859
	)
	static int field637;
	@ObfuscatedName("mm")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("me")
	@ObfuscatedGetter(
		intValue = 1816591673
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("ma")
	@ObfuscatedGetter(
		intValue = -1864511787
	)
	static int field640;
	@ObfuscatedName("my")
	@ObfuscatedGetter(
		longValue = 6662443416545452389L
	)
	@Export("userId")
	static long userId;
	@ObfuscatedName("mw")
	@ObfuscatedGetter(
		longValue = 3796375670071641983L
	)
	@Export("userHash")
	static long userHash;
	@ObfuscatedName("mn")
	static String field643;
	@ObfuscatedName("mp")
	@ObfuscatedGetter(
		intValue = 999219323
	)
	static int field780;
	@ObfuscatedName("nl")
	@ObfuscatedGetter(
		intValue = 615414935
	)
	static int field645;
	@ObfuscatedName("nh")
	@ObfuscatedGetter(
		intValue = -307447559
	)
	static int field646;
	@ObfuscatedName("nk")
	@ObfuscatedGetter(
		intValue = -1152309379
	)
	static int field647;
	@ObfuscatedName("ns")
	@ObfuscatedGetter(
		intValue = 1440959363
	)
	static int field648;
	@ObfuscatedName("no")
	@ObfuscatedGetter(
		intValue = 89923467
	)
	static int field532;
	@ObfuscatedName("nm")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("nu")
	@ObfuscatedGetter(
		intValue = 1714721535
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("nn")
	@ObfuscatedGetter(
		intValue = 816218835
	)
	static int field709;
	@ObfuscatedName("nq")
	static int[] field653;
	@ObfuscatedName("np")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("ni")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("ne")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("ny")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("nt")
	@ObfuscatedGetter(
		intValue = 1955567827
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("nf")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("nc")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("nv")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("nw")
	static int[] field662;
	@ObfuscatedName("nz")
	@Export("leftClickOpensMenu")
	static boolean leftClickOpensMenu;
	@ObfuscatedName("oe")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("ov")
	@ObfuscatedSignature(
		descriptor = "Lwn;"
	)
	@Export("menu")
	static Menu menu;
	@ObfuscatedName("os")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("oh")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("oy")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("ow")
	@ObfuscatedGetter(
		intValue = 660527903
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("op")
	@ObfuscatedGetter(
		intValue = 1264782931
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("oz")
	@ObfuscatedGetter(
		intValue = -728535373
	)
	static int field639;
	@ObfuscatedName("on")
	@ObfuscatedGetter(
		intValue = 1874013753
	)
	static int field706;
	@ObfuscatedName("ol")
	@ObfuscatedGetter(
		intValue = -1640724679
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("od")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("ob")
	@ObfuscatedGetter(
		intValue = 1855630889
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("ox")
	@ObfuscatedGetter(
		intValue = 186839781
	)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("oi")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("or")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("of")
	@ObfuscatedGetter(
		intValue = 2020975375
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("pe")
	@ObfuscatedGetter(
		intValue = -637746887
	)
	static int field820;
	@ObfuscatedName("pv")
	@ObfuscatedGetter(
		intValue = -1607472701
	)
	static int field813;
	@ObfuscatedName("pg")
	@ObfuscatedGetter(
		intValue = 1447020251
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("ps")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("pk")
	@ObfuscatedGetter(
		intValue = -1871839607
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("pz")
	@ObfuscatedGetter(
		intValue = 2133180589
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("pq")
	@ObfuscatedGetter(
		intValue = -1248277365
	)
	@Export("staffModLevel")
	public static int staffModLevel;
	@ObfuscatedName("pn")
	@ObfuscatedGetter(
		intValue = -889333833
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("py")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("pu")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("pl")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	@Export("clickedWidget")
	public static Widget clickedWidget;
	@ObfuscatedName("pw")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("pm")
	@ObfuscatedGetter(
		intValue = 1169135151
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("pd")
	@ObfuscatedGetter(
		intValue = -1875967751
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("pc")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("pa")
	static boolean field697;
	@ObfuscatedName("po")
	@ObfuscatedGetter(
		intValue = -42946115
	)
	static int field565;
	@ObfuscatedName("pr")
	@ObfuscatedGetter(
		intValue = -2005605771
	)
	static int field699;
	@ObfuscatedName("px")
	static boolean field700;
	@ObfuscatedName("ph")
	@ObfuscatedGetter(
		intValue = -1379422379
	)
	static int field701;
	@ObfuscatedName("pt")
	@ObfuscatedGetter(
		intValue = 1431255425
	)
	static int field702;
	@ObfuscatedName("pi")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("qs")
	@ObfuscatedGetter(
		intValue = -426757999
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("qc")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("qt")
	@ObfuscatedGetter(
		intValue = -1872308023
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("qp")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("qg")
	@ObfuscatedGetter(
		intValue = -996705221
	)
	static int field797;
	@ObfuscatedName("qq")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("qb")
	@ObfuscatedGetter(
		intValue = -581711817
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("qf")
	static int[] field531;
	@ObfuscatedName("qk")
	@ObfuscatedGetter(
		intValue = -1016915483
	)
	static int field712;
	@ObfuscatedName("qz")
	@ObfuscatedGetter(
		intValue = -1725973389
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("qh")
	@ObfuscatedGetter(
		intValue = -1009831963
	)
	static int field714;
	@ObfuscatedName("qo")
	@ObfuscatedGetter(
		intValue = -924758233
	)
	static int field715;
	@ObfuscatedName("ql")
	@ObfuscatedGetter(
		intValue = -2025749429
	)
	static int field750;
	@ObfuscatedName("qj")
	@ObfuscatedGetter(
		intValue = -1466348257
	)
	static int field555;
	@ObfuscatedName("qe")
	@ObfuscatedGetter(
		intValue = -1071483861
	)
	static int field718;
	@ObfuscatedName("qw")
	@ObfuscatedGetter(
		intValue = 1206097317
	)
	static int field719;
	@ObfuscatedName("qa")
	@ObfuscatedGetter(
		intValue = -1066112189
	)
	static int field720;
	@ObfuscatedName("rp")
	@ObfuscatedGetter(
		intValue = -1846612399
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("rc")
	@ObfuscatedSignature(
		descriptor = "Lwa;"
	)
	static class587 field805;
	@ObfuscatedName("ro")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("rj")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	@Export("scriptEvents2")
	static NodeDeque scriptEvents2;
	@ObfuscatedName("ri")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	@Export("scriptEvents3")
	static NodeDeque scriptEvents3;
	@ObfuscatedName("rg")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	static NodeDeque field726;
	@ObfuscatedName("rs")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("rx")
	@ObfuscatedGetter(
		intValue = -1535921885
	)
	@Export("rootWidgetCount")
	public static int rootWidgetCount;
	@ObfuscatedName("rf")
	@ObfuscatedGetter(
		intValue = -1592094255
	)
	static int field740;
	@ObfuscatedName("rn")
	@Export("validRootWidgets")
	public static boolean[] validRootWidgets;
	@ObfuscatedName("ru")
	static boolean[] field729;
	@ObfuscatedName("rh")
	static boolean[] field732;
	@ObfuscatedName("rd")
	@Export("rootWidgetXs")
	public static int[] rootWidgetXs;
	@ObfuscatedName("ra")
	@Export("rootWidgetYs")
	public static int[] rootWidgetYs;
	@ObfuscatedName("rk")
	@Export("rootWidgetWidths")
	public static int[] rootWidgetWidths;
	@ObfuscatedName("rq")
	@Export("rootWidgetHeights")
	public static int[] rootWidgetHeights;
	@ObfuscatedName("rv")
	@ObfuscatedGetter(
		intValue = 1192073919
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("rz")
	@ObfuscatedGetter(
		longValue = 6595353388010014895L
	)
	static long field738;
	@ObfuscatedName("rm")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("sy")
	@ObfuscatedGetter(
		intValue = 1788166977
	)
	static int field704;
	@ObfuscatedName("sd")
	@ObfuscatedGetter(
		intValue = -39924829
	)
	public static int field741;
	@ObfuscatedName("sp")
	static int[] field803;
	@ObfuscatedName("sf")
	@ObfuscatedGetter(
		intValue = -1921378283
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("se")
	@ObfuscatedGetter(
		intValue = -1772260497
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("sc")
	static String field745;
	@ObfuscatedName("sn")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("sr")
	@ObfuscatedGetter(
		intValue = 512306061
	)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("sk")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("indexCheck")
	static IndexCheck indexCheck;
	@ObfuscatedName("so")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	static class268 field749;
	@ObfuscatedName("sv")
	@ObfuscatedGetter(
		intValue = 1667753753
	)
	static int field579;
	@ObfuscatedName("su")
	static int[] field751;
	@ObfuscatedName("ss")
	static int[] field752;
	@ObfuscatedName("sg")
	@ObfuscatedGetter(
		longValue = 6371865316787563607L
	)
	static long field753;
	@ObfuscatedName("sh")
	@ObfuscatedSignature(
		descriptor = "[Lgg;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("st")
	@ObfuscatedSignature(
		descriptor = "[Lgd;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("sq")
	@ObfuscatedGetter(
		intValue = -1259432549
	)
	static int field799;
	@ObfuscatedName("sl")
	@ObfuscatedGetter(
		intValue = 250503699
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("tr")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("tk")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("tm")
	@ObfuscatedSignature(
		descriptor = "[Lwg;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("tz")
	@ObfuscatedGetter(
		intValue = 2028358579
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("tj")
	@ObfuscatedGetter(
		intValue = 208125387
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("th")
	@ObfuscatedGetter(
		intValue = 2009465621
	)
	static int field742;
	@ObfuscatedName("tf")
	@ObfuscatedGetter(
		intValue = -1786385883
	)
	static int field790;
	@ObfuscatedName("ta")
	@ObfuscatedGetter(
		intValue = 954041181
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("ti")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("tt")
	@ObfuscatedGetter(
		intValue = 421968307
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("td")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("tl")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("tb")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("tp")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("tq")
	static int[] field772;
	@ObfuscatedName("uh")
	@ObfuscatedSignature(
		descriptor = "[Lbj;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("uc")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("uy")
	static boolean field552;
	@ObfuscatedName("uw")
	static boolean field776;
	@ObfuscatedName("uq")
	static boolean field777;
	@ObfuscatedName("un")
	@ObfuscatedSignature(
		descriptor = "Luo;"
	)
	static class535 field779;
	@ObfuscatedName("uz")
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	static class534 field596;
	@ObfuscatedName("uu")
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	static class534 field791;
	@ObfuscatedName("uf")
	static boolean field781;
	@ObfuscatedName("vm")
	static boolean[] field523;
	@ObfuscatedName("vd")
	static int[] field783;
	@ObfuscatedName("vk")
	static int[] field784;
	@ObfuscatedName("vv")
	static int[] field785;
	@ObfuscatedName("ve")
	static int[] field786;
	@ObfuscatedName("vf")
	static short field787;
	@ObfuscatedName("vc")
	static short field788;
	@ObfuscatedName("vj")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("vg")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("vb")
	static short field782;
	@ObfuscatedName("va")
	static short field675;
	@ObfuscatedName("vh")
	static short field656;
	@ObfuscatedName("vp")
	static short field615;
	@ObfuscatedName("vt")
	@ObfuscatedGetter(
		intValue = -45791357
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("vs")
	@ObfuscatedGetter(
		intValue = 1577771323
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("vo")
	@ObfuscatedGetter(
		intValue = 1078573751
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("vi")
	@ObfuscatedGetter(
		intValue = 370703777
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("vz")
	@ObfuscatedGetter(
		intValue = -1702134339
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("vw")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	@Export("playerAppearance")
	static final PlayerComposition playerAppearance;
	@ObfuscatedName("vu")
	@ObfuscatedGetter(
		intValue = 553242317
	)
	static int field616;
	@ObfuscatedName("vy")
	@ObfuscatedGetter(
		intValue = -822017717
	)
	static int field802;
	@ObfuscatedName("vl")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	static class531 field801;
	@ObfuscatedName("wd")
	@ObfuscatedSignature(
		descriptor = "[Lph;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("wq")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("wr")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	static class477 field806;
	@ObfuscatedName("wv")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("DBTableIndex_cache")
	static EvictingDualNodeHashTable DBTableIndex_cache;
	@ObfuscatedName("wu")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("archive11")
	static EvictingDualNodeHashTable archive11;
	@ObfuscatedName("wg")
	@ObfuscatedGetter(
		intValue = -2075494301
	)
	static int field809;
	@ObfuscatedName("wn")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	public static class413 field810;
	@ObfuscatedName("wj")
	@ObfuscatedGetter(
		intValue = -588726493
	)
	public static int field811;
	@ObfuscatedName("wo")
	static List field812;
	@ObfuscatedName("wm")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	static final class278 field572;
	@ObfuscatedName("wh")
	@ObfuscatedGetter(
		intValue = 1547802267
	)
	static int field778;
	@ObfuscatedName("wl")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("wf")
	@ObfuscatedGetter(
		intValue = -1504511249
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("gd")
	@Export("token")
	String token;
	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	@Export("asyncRestClient")
	AsyncRestClient asyncRestClient;
	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	@Export("asyncGameSessionTokenResponse")
	AsyncHttpResponse asyncGameSessionTokenResponse;
	@ObfuscatedName("gk")
	@Export("otlTokenRequester")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/OtlTokenRequester;"
	)
	OtlTokenRequester otlTokenRequester;
	@ObfuscatedName("gw")
	@Export("otlTokenRequestFuture")
	Future otlTokenRequestFuture;
	@ObfuscatedName("gf")
	@Export("https")
	boolean https;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = 1226548185
	)
	@Export("clientId")
	int clientId;
	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	@Export("asyncAccessTokenResponse")
	AsyncHttpResponse asyncAccessTokenResponse;
	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	@Export("refreshAccessTokenRequester")
	RefreshAccessTokenRequester refreshAccessTokenRequester;
	@ObfuscatedName("gc")
	@Export("refreshAccessTokenRequestFuture")
	Future refreshAccessTokenRequestFuture;
	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	Buffer field570;
	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	class7 field672;
	@ObfuscatedName("hy")
	@ObfuscatedGetter(
		longValue = 3168789108948250515L
	)
	@Export("accountHash")
	long accountHash;

	static {
		field618 = true;
		worldId = 1;
		worldProperties = 0;
		gameBuild = 0;
		isMembersWorld = false;
		isLowDetail = false;
		field515 = -1;
		clientType = -1;
		field517 = -1;
		onMobile = false;
		class566.field5563 = 229;
		field519 = false;
		field520 = false;
		gameState = 0;
		field629 = false;
		field575 = false;
		isLoading = true;
		cycle = 0;
		serverCycle = 0;
		mouseLastLastPressedTimeMillis = 1L;
		field529 = -1;
		field530 = -1;
		field722 = -1L;
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
		field545 = class94.field1161;
		js5ConnectState = 0;
		field608 = 0;
		js5Errors = 0;
		field595 = 0;
		field551 = 0;
		field564 = 0;
		authenticationScheme = AuthenticationScheme.USERNAME_PASSWORD;
		field554 = class573.field5627;
		byte[] var1 = class278.method5826("com_jagex_auth_desktop_osrs:public");
		int var3 = var1.length;
		StringBuilder var4 = new StringBuilder();

		int var5;
		int var6;
		int var7;
		int var8;
		for (var5 = 0; var5 < var3 + 0; var5 += 3) {
			var6 = var1[var5] & 255;
			var4.append(class434.field4872[var6 >>> 2]);
			if (var5 < var3 - 1) {
				var7 = var1[var5 + 1] & 255;
				var4.append(class434.field4872[(var6 & 3) << 4 | var7 >>> 4]);
				if (var5 < var3 - 2) {
					var8 = var1[var5 + 2] & 255;
					var4.append(class434.field4872[(var7 & 15) << 2 | var8 >>> 6]).append(class434.field4872[var8 & 63]);
				} else {
					var4.append(class434.field4872[(var7 & 15) << 2]).append("=");
				}
			} else {
				var4.append(class434.field4872[(var6 & 3) << 4]).append("==");
			}
		}

		String var2 = var4.toString();
		BASIC_AUTH_DESKTOP_OSRS = var2;
		var1 = class278.method5826("com_jagex_auth_desktop_runelite:public");
		var3 = var1.length;
		var4 = new StringBuilder();

		for (var5 = 0; var5 < var3 + 0; var5 += 3) {
			var6 = var1[var5] & 255;
			var4.append(class434.field4872[var6 >>> 2]);
			if (var5 < var3 - 1) {
				var7 = var1[var5 + 1] & 255;
				var4.append(class434.field4872[(var6 & 3) << 4 | var7 >>> 4]);
				if (var5 < var3 - 2) {
					var8 = var1[var5 + 2] & 255;
					var4.append(class434.field4872[(var7 & 15) << 2 | var8 >>> 6]).append(class434.field4872[var8 & 63]);
				} else {
					var4.append(class434.field4872[(var7 & 15) << 2]).append("=");
				}
			} else {
				var4.append(class434.field4872[(var6 & 3) << 4]).append("==");
			}
		}

		var2 = var4.toString();
		BASIC_AUTH_DESKTOP_RUNELITE = var2;
		Login_isUsernameRemembered = false;
		secureRandomFuture = new SecureRandomFuture();
		field569 = new int[4];
		randomDatData = null;
		npcCount = 0;
		npcIndices = new int[250];
		packetWriter = new PacketWriter();
		logoutTimer = 0;
		hadNetworkError = false;
		timer = new Timer();
		fontsMap = new HashMap();
		field553 = 0;
		field582 = 1;
		field583 = 0;
		field584 = 1;
		field585 = 0;
		field514 = new int[4][13][13];
		worldViewManager = new WorldViewManager();
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		field509 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		field591 = -1;
		playerUpdateManager = new PlayerUpdateManager();
		graphicsCycle = 0;
		field594 = 2301979;
		field730 = 5063219;
		field561 = 3353893;
		field592 = 7759444;
		field716 = false;
		alternativeScrollbarWidth = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		mouseCamClickedX = 0;
		mouseCamClickedY = 0;
		oculusOrbState = 0;
		camFollowHeight = 50;
		field663 = 0;
		field609 = 0;
		field610 = 0;
		oculusOrbNormalSpeed = 12;
		oculusOrbSlowedSpeed = 6;
		revision = 0;
		field614 = false;
		field763 = 0;
		field794 = false;
		field617 = 0;
		overheadTextCount = 0;
		overheadTextLimit = 50;
		overheadTextXs = new int[overheadTextLimit];
		overheadTextYs = new int[overheadTextLimit];
		overheadTextAscents = new int[overheadTextLimit];
		overheadTextXOffsets = new int[overheadTextLimit];
		overheadTextColors = new int[overheadTextLimit];
		overheadTextEffects = new int[overheadTextLimit];
		field547 = new int[overheadTextLimit][];
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
		field637 = 0;
		showLoadingMessages = true;
		localPlayerIndex = -1;
		field640 = 0;
		userId = -1L;
		userHash = -1L;
		field643 = "";
		field780 = -1;
		field645 = -1;
		field646 = -1;
		field647 = 0;
		field648 = 0;
		field532 = 0;
		renderSelf = true;
		drawPlayerNames = 0;
		field709 = 0;
		field653 = new int[1000];
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
		playerMenuActions = new String[8];
		playerOptionsPriorities = new boolean[8];
		defaultRotations = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
		combatTargetPlayerIndex = -1;
		currentLevels = new int[25];
		levels = new int[25];
		experience = new int[25];
		field662 = new int[25];
		leftClickOpensMenu = false;
		isMenuOpen = false;
		menu = new Menu(true);
		followerOpsLowPriority = false;
		tapToDrop = false;
		showMouseOverText = true;
		viewportX = -1;
		viewportY = -1;
		field639 = 0;
		field706 = 50;
		isItemSelected = 0;
		field674 = null;
		isSpellSelected = false;
		selectedSpellChildIndex = -1;
		selectedSpellItemId = -1;
		selectedSpellActionName = null;
		selectedSpellName = null;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field820 = 0;
		field813 = -1;
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
		field697 = false;
		field565 = -1;
		field699 = -1;
		field700 = false;
		field701 = -1;
		field702 = -1;
		isDraggingWidget = false;
		cycleCntr = 1;
		changedVarps = new int[32];
		changedVarpCount = 0;
		changedItemContainers = new int[32];
		field797 = 0;
		changedSkills = new int[32];
		changedSkillsCount = 0;
		field531 = new int[32];
		field712 = 0;
		chatCycle = 0;
		field714 = 0;
		field715 = 0;
		field750 = 0;
		field555 = 0;
		field718 = 0;
		field719 = 0;
		field720 = 0;
		mouseWheelRotation = 0;
		field805 = new class587();
		scriptEvents = new NodeDeque();
		scriptEvents2 = new NodeDeque();
		scriptEvents3 = new NodeDeque();
		field726 = new NodeDeque();
		widgetFlags = new NodeHashTable(512);
		rootWidgetCount = 0;
		field740 = -2;
		validRootWidgets = new boolean[100];
		field729 = new boolean[100];
		field732 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field738 = 0L;
		isResizable = true;
		field704 = 600;
		field741 = field704 / GameEngine.cycleDurationMillis;
		field803 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		publicChatMode = 0;
		tradeChatMode = 0;
		field745 = "";
		crossWorldMessageIds = new long[100];
		crossWorldMessageIdsIndex = 0;
		indexCheck = new IndexCheck();
		field749 = new class268();
		field579 = 0;
		field751 = new int[128];
		field752 = new int[128];
		field753 = -1L;
		currentClanSettings = new ClanSettings[4];
		currentClanChannels = new ClanChannel[4];
		field799 = -1;
		mapIconCount = 0;
		mapIconXs = new int[1000];
		mapIconYs = new int[1000];
		mapIcons = new SpritePixels[1000];
		destinationX = 0;
		destinationY = 0;
		field742 = -1;
		field790 = 0;
		minimapState = 0;
		playingJingle = false;
		soundEffectCount = 0;
		soundEffectIds = new int[50];
		queuedSoundEffectLoops = new int[50];
		queuedSoundEffectDelays = new int[50];
		soundLocations = new int[50];
		field772 = new int[50];
		soundEffects = new SoundEffect[50];
		isCameraLocked = false;
		field552 = false;
		field776 = false;
		field777 = false;
		field779 = null;
		field596 = null;
		field791 = null;
		field781 = false;
		field523 = new boolean[5];
		field783 = new int[5];
		field784 = new int[5];
		field785 = new int[5];
		field786 = new int[5];
		field787 = 256;
		field788 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field782 = 1;
		field675 = 32767;
		field656 = 1;
		field615 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		playerAppearance = new PlayerComposition();
		field616 = -1;
		field802 = -1;
		field801 = new DesktopPlatformInfoProvider();
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		field806 = new class477(8, class475.field5077);
		DBTableIndex_cache = new EvictingDualNodeHashTable(64);
		archive11 = new EvictingDualNodeHashTable(64);
		field809 = -1;
		field811 = -1;
		field812 = new ArrayList();
		field572 = new class278();
		field778 = 30;
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field708 = 0;
		field818 = new ApproximateRouteStrategy();
		field711 = new int[50];
		field650 = new int[50];
	}

	public Client() {
		this.https = false;
		this.clientId = 0;
		this.accountHash = -1L;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field738 = InterfaceParent.method2434() + 500L;
		this.resizeJS();
		if (rootInterface != -1) {
			this.method1814(true);
		}

	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "500223686"
	)
	@Export("setUp")
	protected final void setUp() {
		int[] var1 = new int[]{20, 260, 10000};
		int[] var2 = new int[]{1000, 100, 500};
		if (var1 != null && var2 != null) {
			Login.ByteArrayPool_alternativeSizes = var1;
			AddRequestTask.ByteArrayPool_altSizeArrayCounts = new int[var1.length];
			class172.ByteArrayPool_arrays = new byte[var1.length][][];

			for (int var3 = 0; var3 < Login.ByteArrayPool_alternativeSizes.length; ++var3) {
				class172.ByteArrayPool_arrays[var3] = new byte[var2[var3]][];
				ByteArrayPool.field5052.add(var1[var3]);
			}

			Collections.sort(ByteArrayPool.field5052);
		} else {
			Login.ByteArrayPool_alternativeSizes = null;
			AddRequestTask.ByteArrayPool_altSizeArrayCounts = null;
			class172.ByteArrayPool_arrays = null;
			ByteArrayPool.field5052.clear();
			ByteArrayPool.field5052.add(100);
			ByteArrayPool.field5052.add(5000);
			ByteArrayPool.field5052.add(10000);
			ByteArrayPool.field5052.add(30000);
		}

		SecureRandomFuture.field1011 = class493.method9356(worldProperties, class563.field5536);
		class132.worldPort = gameBuild == 0 ? 43594 : worldId + 40000;
		AABB.js5Port = gameBuild == 0 ? 443 : worldId + 50000;
		Frames.currentPort = class132.worldPort;
		NPC.field1378 = class362.field3914;
		class140.field1665 = class362.field3912;
		GrandExchangeOfferOwnWorldComparator.field479 = class362.field3911;
		MidiPcmStream.field3729 = class362.field3913;
		Tiles.urlRequester = new SecureUrlRequester(this.https, 229);
		this.setUpKeyboard();
		this.setUpMouse();
		class87.mouseWheel = this.mouseWheel();
		this.method585(field749, 0);
		this.method585(indexCheck, 1);
		this.setUpClipboard();
		RouteStrategy.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		AccessFile var4 = null;
		ClientPreferences var5 = new ClientPreferences();

		try {
			var4 = UserComparator3.getPreferencesFile("", DevicePcmPlayerProvider.field93.name, false);
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

		AbstractWorldMapIcon.clientPreferences = var5;
		String var12 = SecureRandomCallable.field1061;
		class31.field153 = this;
		if (var12 != null) {
			class31.field144 = var12;
		}

		MidiRequest.setWindowedMode(AbstractWorldMapIcon.clientPreferences.getWindowMode());
		SoundCache.friendSystem = new FriendSystem(class280.loginType);
		this.asyncRestClient = new AsyncRestClient("tokenRequest", 1, 1);
		class338.method6782(this);
		field572.method5807();
		ModelData var13 = new ModelData(3, 1, 0);
		var13.method4700(-64, -8, 64);
		var13.method4700(64, -8, 64);
		var13.method4700(0, -8, -24);
		var13.method4648(0, 2, 1, (byte)1, (byte)-1, (short)10173, (short)-1);
		SongTask.field5033 = var13.toModel(1, 32, 0, -128, 0);
		BoundaryObject.field3009 = var13.toModel(64, 850, -30, -50, -30);
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "642293418"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle;
		this.doCycleJs5();
		WorldMapSectionType.method6245();
		boolean var2 = false;
		boolean var3 = false;
		if (!class335.field3694.isEmpty()) {
			SongTask var4 = (SongTask)class335.field3694.get(0);
			if (var4 == null) {
				class335.field3694.remove(0);
			} else if (var4.vmethod8896()) {
				if (var4.method8880()) {
					System.out.println("Error in midimanager.service: " + var4.method8870());
					var2 = true;
				} else {
					if (var4.method8874() != null) {
						class335.field3694.add(1, var4.method8874());
					}

					var3 = var4.method8883();
				}

				class335.field3694.remove(0);
			} else {
				var3 = var4.method8883();
			}
		}

		if (var2) {
			class335.field3694.clear();
			GrandExchangeOffer.method7838();
		}

		if (var3 && playingJingle && FloorDecoration.pcmPlayer1 != null) {
			FloorDecoration.pcmPlayer1.tryDiscard();
		}

		UrlRequester.method3151();
		indexCheck.method5603();
		this.method463();
		HorizontalAlignment.method3915();
		if (class87.mouseWheel != null) {
			int var5 = class87.mouseWheel.useRotation();
			mouseWheelRotation = var5;
		}

		if (gameState == 0) {
			Language.method7970();
			class162.method3623();
		} else if (gameState == 5) {
			WorldMapScaleHandler.loginScreen(this, SecureRandomCallable.fontPlain11, class187.fontPlain12);
			Language.method7970();
			class162.method3623();
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				WorldMapScaleHandler.loginScreen(this, SecureRandomCallable.fontPlain11, class187.fontPlain12);
				this.doCycleLoggedOut();
			} else if (gameState == 50) {
				WorldMapScaleHandler.loginScreen(this, SecureRandomCallable.fontPlain11, class187.fontPlain12);
				this.doCycleLoggedOut();
			} else if (gameState == 25) {
				if (field519) {
					Language.loadRegion();
				}

				if (field520) {
					UserComparator6.method3265(class105.field1384);
				}

				if (!field520 && !field519) {
					class511.updateGameState(30);
				}
			}
		} else {
			WorldMapScaleHandler.loginScreen(this, SecureRandomCallable.fontPlain11, class187.fontPlain12);
		}

		if (gameState == 30) {
			this.doCycleLoggedIn();
		} else if (gameState == 40 || gameState == 45) {
			this.doCycleLoggedOut();
		}

	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-987889545"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field738 && InterfaceParent.method2434() > field738) {
			MidiRequest.setWindowedMode(DynamicObject.getWindowedMode());
		}

		int var2;
		if (var1) {
			for (var2 = 0; var2 < 100; ++var2) {
				validRootWidgets[var2] = true;
			}
		}

		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1, HttpResponse.field83);
		} else if (gameState == 5) {
			class357.drawTitle(UserComparator7.fontBold12, SecureRandomCallable.fontPlain11, class187.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				class357.drawTitle(UserComparator7.fontBold12, SecureRandomCallable.fontPlain11, class187.fontPlain12);
			} else if (gameState == 50) {
				class357.drawTitle(UserComparator7.fontBold12, SecureRandomCallable.fontPlain11, class187.fontPlain12);
			} else if (gameState == 25) {
				if (field585 == 1) {
					if (field553 > field582) {
						field582 = field553;
					}

					var2 = (field582 * 50 - field553 * 50) / field582;
					TextureProvider.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
				} else if (field585 == 2) {
					if (field583 > field584) {
						field584 = field583;
					}

					var2 = (field584 * 50 - field583 * 50) / field584 + 50;
					TextureProvider.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
				} else {
					TextureProvider.drawLoadingMessage("Loading - please wait.", false);
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				TextureProvider.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) {
				TextureProvider.drawLoadingMessage("Please wait...", false);
			}
		} else {
			class357.drawTitle(UserComparator7.fontBold12, SecureRandomCallable.fontPlain11, class187.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				if (field729[var2]) {
					class159.rasterProvider.draw(rootWidgetXs[var2], rootWidgetYs[var2], rootWidgetWidths[var2], rootWidgetHeights[var2]);
					field729[var2] = false;
				}
			}
		} else if (gameState > 0) {
			class159.rasterProvider.drawFull(0, 0);

			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				field729[var2] = false;
			}
		}

	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-65"
	)
	@Export("kill0")
	protected final void kill0() {
		if (class322.varcs != null && class322.varcs.hasUnwrittenChanges()) {
			class322.varcs.write();
		}

		if (class178.mouseRecorder != null) {
			class178.mouseRecorder.isRunning = false;
		}

		class178.mouseRecorder = null;
		packetWriter.close();
		class1.method14();
		class87.mouseWheel = null;
		if (FloorDecoration.pcmPlayer1 != null) {
			FloorDecoration.pcmPlayer1.shutdown();
		}

		AsyncHttpResponse.field77.method7743();
		VertexNormal.method5432();
		if (Tiles.urlRequester != null) {
			Tiles.urlRequester.close();
			Tiles.urlRequester = null;
		}

		Renderable.method5187();
		this.asyncRestClient.shutdown();
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "46011481"
	)
	protected final void vmethod1227() {
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "51"
	)
	@Export("isRuneLite")
	boolean isRuneLite() {
		return this.clientId == 1;
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	@Export("containsAccessAndRefreshToken")
	boolean containsAccessAndRefreshToken() {
		return class366.accessToken != null && !class366.accessToken.trim().isEmpty() && class269.refreshToken != null && !class269.refreshToken.trim().isEmpty();
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1805755529"
	)
	@Export("containsSessionAndCharacterId")
	boolean containsSessionAndCharacterId() {
		return class132.sessionId != null && !class132.sessionId.trim().isEmpty() && Sound.characterId != null && !Sound.characterId.trim().isEmpty();
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	@Export("otlTokenRequesterInitialized")
	boolean otlTokenRequesterInitialized() {
		return this.otlTokenRequester != null;
	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1740535234"
	)
	@Export("requestRefreshAccessToken")
	void requestRefreshAccessToken(String var1) throws IOException {
		HashMap var2 = new HashMap();
		var2.put("grant_type", "refresh_token");
		var2.put("scope", "gamesso.token.create");
		var2.put("refresh_token", var1);
		URL var3 = new URL(class186.authServiceBaseUrl + "shield/oauth/token" + (new HttpQueryParams(var2)).encode());
		HttpHeaders var4 = new HttpHeaders();
		if (this.isRuneLite()) {
			var4.basicAuthentication(BASIC_AUTH_DESKTOP_RUNELITE);
		} else {
			var4.basicAuthentication(BASIC_AUTH_DESKTOP_OSRS);
		}

		var4.header("Host", (new URL(class186.authServiceBaseUrl)).getHost());
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

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "146996097"
	)
	@Export("requestOtlToken")
	void requestOtlToken(String var1) throws IOException {
		URL var2 = new URL(class186.authServiceBaseUrl + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
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

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "302787957"
	)
	@Export("authenticate")
	void authenticate(String var1, String var2) throws IOException, JSONException {
		URL var3 = new URL(class153.gameSessionServiceBaseUrl + "game-session/v1/tokens");
		HttpRequest var4 = new HttpRequest(var3, HttpMethod.POST, this.https);
		var4.getHeaders().bearerToken(var1);
		var4.getHeaders().accept(HttpContentType.APPLICATION_JSON);
		JSONObject var5 = new JSONObject();
		var5.setProperty("accountId", var2);
		var4.setPayload(new HttpJsonRequestBody(var5));
		this.asyncGameSessionTokenResponse = this.asyncRestClient.submitRequest(var4);
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1654483011"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			boolean var1 = AsyncHttpResponse.field77.method7770();
			if (!var1) {
				this.method1246();
			}

		}
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "47"
	)
	void method1246() {
		if (AsyncHttpResponse.field77.field4736 >= 4) {
			this.error("js5crc");
			class511.updateGameState(1000);
		} else {
			if (AsyncHttpResponse.field77.field4721 >= 4) {
				if (gameState <= 5) {
					this.error("js5io");
					class511.updateGameState(1000);
					return;
				}

				field608 = 3000;
				AsyncHttpResponse.field77.field4721 = 3;
			}

			if (--field608 + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						class33.js5SocketTask = class332.taskHandler.newSocketTask(HttpResponse.worldHost, Frames.currentPort);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (class33.js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (class33.js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						class391.js5Socket = StudioGame.method7513((Socket)class33.js5SocketTask.result, 40000, 5000);
						Buffer var1 = new Buffer(class328.field3645.field3654 + 1);
						var1.writeByte(class328.field3645.field3653);
						var1.writeInt(229);
						var1.writeInt(field569[0]);
						var1.writeInt(field569[1]);
						var1.writeInt(field569[2]);
						var1.writeInt(field569[3]);
						class391.js5Socket.write(var1.array, 0, class328.field3645.field3654 + 1);
						++js5ConnectState;
						WorldMapDecorationType.field4140 = InterfaceParent.method2434();
					}

					if (js5ConnectState == 3) {
						if (class391.js5Socket.available() > 0) {
							int var2 = class391.js5Socket.readUnsignedByte();
							if (var2 != 0) {
								this.js5Error(var2);
								return;
							}

							++js5ConnectState;
						} else if (InterfaceParent.method2434() - WorldMapDecorationType.field4140 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						AsyncHttpResponse.field77.method7745(class391.js5Socket, gameState > 20);
						class33.js5SocketTask = null;
						class391.js5Socket = null;
						js5ConnectState = 0;
						js5Errors = 0;
					}
				} catch (IOException var3) {
					this.js5Error(-3);
				}

			}
		}
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2083840360"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		class33.js5SocketTask = null;
		class391.js5Socket = null;
		js5ConnectState = 0;
		if (class132.worldPort == Frames.currentPort) {
			Frames.currentPort = AABB.js5Port;
		} else {
			Frames.currentPort = class132.worldPort;
		}

		++js5Errors;
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) {
			if (gameState <= 5) {
				this.error("js5connect_full");
				class511.updateGameState(1000);
			} else {
				field608 = 3000;
			}
		} else if (js5Errors >= 2 && var1 == 6) {
			this.error("js5connect_outofdate");
			class511.updateGameState(1000);
		} else if (js5Errors >= 4) {
			if (gameState <= 5) {
				this.error("js5connect");
				class511.updateGameState(1000);
			} else {
				field608 = 3000;
			}
		}

	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "649899785"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		AbstractSocket var1 = packetWriter.getSocket();
		PacketBuffer var2 = packetWriter.packetBuffer;

		try {
			if (ModelData0.loginState == LoginState.SHUTDOWN_PREVIOUS_CONNECTION) {
				if (Buffer.field5574 == null && (secureRandomFuture.isDone() || field595 > 250)) {
					Buffer.field5574 = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (Buffer.field5574 != null) {
					if (var1 != null) {
						var1.close();
						var1 = null;
					}

					class154.field1750 = null;
					hadNetworkError = false;
					field595 = 0;
					if (field554.method10536()) {
						if (this.containsAccessAndRefreshToken()) {
							try {
								this.requestRefreshAccessToken(class269.refreshToken);
								class215.updateLoginState(LoginState.TOKEN_RESPONSE);
							} catch (Throwable var22) {
								class213.RunException_sendStackTrace((String)null, var22);
								Friend.getLoginError(65);
								return;
							}
						} else {
							if (!this.containsSessionAndCharacterId()) {
								Friend.getLoginError(65);
								return;
							}

							try {
								this.authenticate(class132.sessionId, Sound.characterId);
								class215.updateLoginState(LoginState.REFRESHING_TOKEN);
							} catch (Exception var21) {
								class213.RunException_sendStackTrace((String)null, var21);
								Friend.getLoginError(65);
								return;
							}
						}
					} else {
						class215.updateLoginState(LoginState.INIT_MOUSEHANDLER_SOCKET);
					}
				}
			}

			HttpResponse var24;
			if (LoginState.TOKEN_RESPONSE == ModelData0.loginState) {
				if (this.refreshAccessTokenRequestFuture != null) {
					if (!this.refreshAccessTokenRequestFuture.isDone()) {
						return;
					}

					if (this.refreshAccessTokenRequestFuture.isCancelled()) {
						Friend.getLoginError(65);
						this.refreshAccessTokenRequestFuture = null;
						return;
					}

					try {
						RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.refreshAccessTokenRequestFuture.get();
						if (!var3.isSuccess()) {
							Friend.getLoginError(65);
							this.refreshAccessTokenRequestFuture = null;
							return;
						}

						class366.accessToken = var3.getAccessToken();
						class269.refreshToken = var3.getRefreshToken();
						this.refreshAccessTokenRequestFuture = null;
					} catch (Exception var20) {
						class213.RunException_sendStackTrace((String)null, var20);
						Friend.getLoginError(65);
						this.refreshAccessTokenRequestFuture = null;
						return;
					}
				} else {
					if (this.asyncAccessTokenResponse == null) {
						Friend.getLoginError(65);
						return;
					}

					if (!this.asyncAccessTokenResponse.hasFinished()) {
						return;
					}

					if (this.asyncAccessTokenResponse.hasError()) {
						class213.RunException_sendStackTrace(this.asyncAccessTokenResponse.getErrorMessage(), (Throwable)null);
						Friend.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}

					var24 = this.asyncAccessTokenResponse.await();
					if (var24.getResponseCode() != 200) {
						Friend.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}

					field595 = 0;
					HttpJsonRequestBody var4 = new HttpJsonRequestBody(var24.getResponseBody());

					try {
						class366.accessToken = var4.getBody().getString("access_token");
						class269.refreshToken = var4.getBody().getString("refresh_token");
					} catch (Exception var19) {
						class213.RunException_sendStackTrace("Error parsing tokens", var19);
						Friend.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}
				}

				this.requestOtlToken(class366.accessToken);
				class215.updateLoginState(LoginState.REFRESHING_TOKEN);
			}

			if (LoginState.REFRESHING_TOKEN == ModelData0.loginState) {
				if (this.otlTokenRequestFuture != null) {
					if (!this.otlTokenRequestFuture.isDone()) {
						return;
					}

					if (this.otlTokenRequestFuture.isCancelled()) {
						Friend.getLoginError(65);
						this.otlTokenRequestFuture = null;
						return;
					}

					try {
						OtlTokenResponse var25 = (OtlTokenResponse)this.otlTokenRequestFuture.get();
						if (!var25.isSuccess()) {
							Friend.getLoginError(65);
							this.otlTokenRequestFuture = null;
							return;
						}

						this.token = var25.getToken();
						this.otlTokenRequestFuture = null;
					} catch (Exception var18) {
						class213.RunException_sendStackTrace((String)null, var18);
						Friend.getLoginError(65);
						this.otlTokenRequestFuture = null;
						return;
					}
				} else {
					if (this.asyncGameSessionTokenResponse == null) {
						Friend.getLoginError(65);
						return;
					}

					if (!this.asyncGameSessionTokenResponse.hasFinished()) {
						return;
					}

					if (this.asyncGameSessionTokenResponse.hasError()) {
						class213.RunException_sendStackTrace(this.asyncGameSessionTokenResponse.getErrorMessage(), (Throwable)null);
						Friend.getLoginError(65);
						this.asyncGameSessionTokenResponse = null;
						return;
					}

					var24 = this.asyncGameSessionTokenResponse.await();
					if (var24.getResponseCode() != 200) {
						class213.RunException_sendStackTrace("Login authentication error. Response code: " + var24.getResponseCode() + " " + var24.method253() + " Response body: " + var24.getResponseBody(), (Throwable)null);
						Friend.getLoginError(65);
						this.asyncGameSessionTokenResponse = null;
						return;
					}

					List var27 = (List)var24.getHeaderFields().get("Content-Type");
					if (var27 != null && var27.contains(HttpContentType.APPLICATION_JSON.getValue())) {
						try {
							JSONObject var5 = new JSONObject(var24.getResponseBody());
							this.token = var5.getString("token");
						} catch (JSONException var17) {
							class213.RunException_sendStackTrace((String)null, var17);
							Friend.getLoginError(65);
							this.asyncGameSessionTokenResponse = null;
							return;
						}
					} else {
						this.token = var24.getResponseBody();
					}

					this.asyncGameSessionTokenResponse = null;
				}

				field595 = 0;
				class215.updateLoginState(LoginState.INIT_MOUSEHANDLER_SOCKET);
			}

			if (ModelData0.loginState == LoginState.INIT_MOUSEHANDLER_SOCKET) {
				if (class154.field1750 == null) {
					class154.field1750 = class332.taskHandler.newSocketTask(HttpResponse.worldHost, Frames.currentPort);
				}

				if (class154.field1750.status == 2) {
					throw new IOException();
				}

				if (class154.field1750.status == 1) {
					var1 = StudioGame.method7513((Socket)class154.field1750.result, 40000, 5000);
					packetWriter.setSocket(var1);
					class154.field1750 = null;
					class215.updateLoginState(LoginState.UNMAPPED_20);
				}
			}

			PacketBufferNode var26;
			if (LoginState.UNMAPPED_20 == ModelData0.loginState) {
				packetWriter.clearBuffer();
				var26 = EnumComposition.method3907();
				var26.packetBuffer.writeByte(class328.field3651.field3653);
				packetWriter.addNode(var26);
				packetWriter.flush();
				var2.offset = 0;
				class215.updateLoginState(LoginState.READ_LOGIN_STATUS);
			}

			int var13;
			if (ModelData0.loginState == LoginState.READ_LOGIN_STATUS) {
				if (FloorDecoration.pcmPlayer1 != null) {
					FloorDecoration.pcmPlayer1.method754();
				}

				if (var1.isAvailable(1)) {
					var13 = var1.readUnsignedByte();
					if (FloorDecoration.pcmPlayer1 != null) {
						FloorDecoration.pcmPlayer1.method754();
					}

					if (var13 != 0) {
						Friend.getLoginError(var13);
						return;
					}

					var2.offset = 0;
					class215.updateLoginState(LoginState.READ_RANDOM_VERIFICATION_NUMBER);
				}
			}

			if (LoginState.READ_RANDOM_VERIFICATION_NUMBER == ModelData0.loginState) {
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
					class31.field147 = var2.readLong();
					class215.updateLoginState(LoginState.WRITE_INITIAL_LOGIN_PACKET);
				}
			}

			if (LoginState.WRITE_INITIAL_LOGIN_PACKET == ModelData0.loginState) {
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var28 = new PacketBuffer(500);
				int[] var29 = new int[]{Buffer.field5574.nextInt(), Buffer.field5574.nextInt(), Buffer.field5574.nextInt(), Buffer.field5574.nextInt()};
				var28.offset = 0;
				var28.writeByte(1);
				var28.writeInt(var29[0]);
				var28.writeInt(var29[1]);
				var28.writeInt(var29[2]);
				var28.writeInt(var29[3]);
				var28.writeLong(class31.field147);
				if (gameState == 40) {
					var28.writeInt(field569[0]);
					var28.writeInt(field569[1]);
					var28.writeInt(field569[2]);
					var28.writeInt(field569[3]);
				} else {
					if (gameState == 50) {
						var28.writeByte(AuthenticationScheme.field1554.rsOrdinal());
						var28.writeInt(class456.field5001);
					} else {
						var28.writeByte(authenticationScheme.rsOrdinal());
						switch(authenticationScheme.schemeId) {
						case 1:
						case 3:
							var28.writeMedium(Language.otpMedium);
							++var28.offset;
							break;
						case 2:
							var28.offset += 4;
							break;
						case 4:
							var28.writeInt(AbstractWorldMapIcon.clientPreferences.getParameterValue(Login.Login_username));
						}
					}

					if (field554.method10536()) {
						var28.writeByte(class573.field5626.rsOrdinal());
						var28.writeStringCp1252NullTerminated(this.token);
					} else {
						var28.writeByte(class573.field5627.rsOrdinal());
						var28.writeStringCp1252NullTerminated(Login.Login_password);
					}
				}

				var28.encryptRsa(class76.field936, class76.field938);
				field569 = var29;
				PacketBufferNode var32 = EnumComposition.method3907();
				var32.packetBuffer.offset = 0;
				if (gameState == 40) {
					var32.packetBuffer.writeByte(class328.field3647.field3653);
				} else {
					var32.packetBuffer.writeByte(class328.field3656.field3653);
				}

				var32.packetBuffer.writeShort(0);
				int var6 = var32.packetBuffer.offset;
				var32.packetBuffer.writeInt(229);
				var32.packetBuffer.writeInt(1);
				var32.packetBuffer.writeByte(clientType);
				var32.packetBuffer.writeByte(field517);
				byte var7 = 0;
				var32.packetBuffer.writeByte(var7);
				var32.packetBuffer.writeBytes(var28.array, 0, var28.offset);
				int var8 = var32.packetBuffer.offset;
				var32.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var32.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var32.packetBuffer.writeShort(GameEngine.canvasWidth);
				var32.packetBuffer.writeShort(SwapSongTask.canvasHeight);
				PacketBuffer var9 = var32.packetBuffer;
				if (randomDatData != null) {
					var9.writeBytes(randomDatData, 0, randomDatData.length);
				} else {
					byte[] var10 = FontName.randomDatData2();
					var9.writeBytes(var10, 0, var10.length);
				}

				var32.packetBuffer.writeStringCp1252NullTerminated(Sound.field1770);
				var32.packetBuffer.writeInt(class535.field5358);
				var32.packetBuffer.writeByte(0);
				Buffer var40 = new Buffer(Decimator.platformInfo.size());
				Decimator.platformInfo.write(var40);
				var32.packetBuffer.writeBytes(var40.array, 0, var40.array.length);
				var32.packetBuffer.writeByte(clientType);
				var32.packetBuffer.writeInt(0);
				if (SecureRandomFuture.field1011) {
					var32.packetBuffer.writeIntME(EnumComposition.field2011.hash);
					var32.packetBuffer.writeInt(EnumComposition.field2004.hash);
					var32.packetBuffer.writeIntME(class553.field5487.hash);
					var32.packetBuffer.writeInt(MenuAction.field931.hash);
					var32.packetBuffer.writeIntME(PendingSpawn.archive8.hash);
					var32.packetBuffer.writeIntME(JagexCache.archive13.hash);
					var32.packetBuffer.writeIntME(class6.archive10.hash);
				} else if (class566.field5563 >= 229) {
					var32.packetBuffer.writeInt(EnumComposition.field2011.hash);
					var32.packetBuffer.writeIntME(MenuAction.field931.hash);
					var32.packetBuffer.writeIntLE(archive2.hash);
					var32.packetBuffer.writeIntLE(class60.field422.hash);
					var32.packetBuffer.writeIntME(MilliClock.field2452.hash);
					var32.packetBuffer.writeIntIME(PlayerUpdateManager.archive6.hash);
					var32.packetBuffer.writeIntME(class553.field5487.hash);
					var32.packetBuffer.writeIntIME(JagexCache.archive13.hash);
					var32.packetBuffer.writeIntIME(class6.archive10.hash);
					var32.packetBuffer.writeInt(EnumComposition.field2004.hash);
					var32.packetBuffer.writeInt(AsyncHttpResponse.field76.hash);
					var32.packetBuffer.writeIntME(class1.field3.hash);
					var32.packetBuffer.writeIntME(SpriteMask.field3819.hash);
					var32.packetBuffer.writeInt(class189.field2024.hash);
					var32.packetBuffer.writeInt(TextureProvider.archive12.hash);
					var32.packetBuffer.writeIntLE(Projectile.field996.hash);
					var32.packetBuffer.writeIntIME(WorldMapIcon_1.archive4.hash);
					var32.packetBuffer.writeIntME(class166.archive9.hash);
					var32.packetBuffer.writeIntME(0);
					var32.packetBuffer.writeIntIME(ArchiveLoader.field1065.hash);
					var32.packetBuffer.writeInt(PendingSpawn.archive8.hash);
					var32.packetBuffer.writeInt(KeyHandler.field116.hash);
					var32.packetBuffer.writeIntME(GrandExchangeEvents.field4746.hash);
				} else {
					var32.packetBuffer.writeIntLE(MenuAction.field931.hash);
					var32.packetBuffer.writeIntME(MilliClock.field2452.hash);
					var32.packetBuffer.writeIntIME(TextureProvider.archive12.hash);
					var32.packetBuffer.writeInt(class1.field3.hash);
					var32.packetBuffer.writeIntLE(PlayerUpdateManager.archive6.hash);
					var32.packetBuffer.writeInt(PendingSpawn.archive8.hash);
					var32.packetBuffer.writeInt(0);
					var32.packetBuffer.writeIntIME(ArchiveLoader.field1065.hash);
					var32.packetBuffer.writeIntME(JagexCache.archive13.hash);
					var32.packetBuffer.writeIntIME(EnumComposition.field2011.hash);
					var32.packetBuffer.writeIntME(EnumComposition.field2004.hash);
					var32.packetBuffer.writeInt(GrandExchangeEvents.field4746.hash);
					var32.packetBuffer.writeInt(WorldMapIcon_1.archive4.hash);
					var32.packetBuffer.writeInt(class553.field5487.hash);
					var32.packetBuffer.writeIntLE(class6.archive10.hash);
					var32.packetBuffer.writeIntLE(Projectile.field996.hash);
					var32.packetBuffer.writeIntME(KeyHandler.field116.hash);
					var32.packetBuffer.writeIntLE(class189.field2024.hash);
					var32.packetBuffer.writeIntME(archive2.hash);
					var32.packetBuffer.writeInt(class166.archive9.hash);
					var32.packetBuffer.writeIntIME(SpriteMask.field3819.hash);
				}

				var32.packetBuffer.xteaEncrypt(var29, var8, var32.packetBuffer.offset);
				var32.packetBuffer.writeLengthShort(var32.packetBuffer.offset - var6);
				packetWriter.addNode(var32);
				packetWriter.flush();
				packetWriter.isaacCipher = new IsaacCipher(var29);
				int[] var11 = new int[4];

				for (int var12 = 0; var12 < 4; ++var12) {
					var11[var12] = var29[var12] + 50;
				}

				var2.newIsaacCipher(var11);
				class215.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			int var14;
			if (ModelData0.loginState == LoginState.READ_CLIENT_INFO_STATUS && var1.available() > 0) {
				var13 = var1.readUnsignedByte();
				if (var13 == 61) {
					var14 = var1.available();
					field524 = var14 == 1 && var1.readUnsignedByte() == 1;
					class215.updateLoginState(LoginState.WRITE_INITIAL_LOGIN_PACKET);
				}

				if (var13 == 21 && gameState == 20) {
					class215.updateLoginState(LoginState.READ_PROFILE_TRANSFER_TIME);
				} else if (var13 == 2) {
					if (SecureRandomFuture.field1011) {
						class215.updateLoginState(LoginState.UNMAPPED_21);
					} else {
						class215.updateLoginState(LoginState.UNMAPPED);
					}
				} else if (var13 == 15 && gameState == 40) {
					packetWriter.serverPacketLength = -1;
					class215.updateLoginState(LoginState.UNMAPPED_19);
				} else if (var13 == 64) {
					class215.updateLoginState(LoginState.READ_STATE_11_PACKET_SIZE);
				} else if (var13 == 23 && field551 < 1) {
					++field551;
					class215.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				} else if (var13 == 29) {
					class215.updateLoginState(LoginState.UNMAPPED_17);
				} else {
					if (var13 != 69) {
						Friend.getLoginError(var13);
						return;
					}

					class215.updateLoginState(LoginState.READ_DIGEST_PARSER_PACKET_SIZE);
				}
			}

			if (ModelData0.loginState == LoginState.UNMAPPED_21) {
				HttpResponse.field83 = true;
				WorldMapIcon_0.method6208(class94.field1178);
				class511.updateGameState(0);
			}

			if (LoginState.READ_DIGEST_PARSER_PACKET_SIZE == ModelData0.loginState && var1.available() >= 2) {
				var1.read(var2.array, 0, 2);
				var2.offset = 0;
				FadeOutTask.field5023 = var2.readUnsignedShort();
				class215.updateLoginState(LoginState.SUBMIT_DIGEST_PARSER_TASK);
			}

			if (ModelData0.loginState == LoginState.SUBMIT_DIGEST_PARSER_TASK && var1.available() >= FadeOutTask.field5023) {
				var2.offset = 0;
				var1.read(var2.array, var2.offset, FadeOutTask.field5023);
				class6[] var30 = new class6[]{class6.USERNAME_PASSWORD_REMEMBER};
				class6 var31 = var30[var2.readUnsignedByte()];

				try {
					class3 var34 = TransformationMatrix.method8478(var31);
					this.field672 = new class7(var2, var34);
					class215.updateLoginState(LoginState.WRITE_DIGEST_PARSER_RESULT);
				} catch (Exception var16) {
					Friend.getLoginError(22);
					return;
				}
			}

			if (ModelData0.loginState == LoginState.WRITE_DIGEST_PARSER_RESULT && this.field672.method45()) {
				this.field570 = this.field672.method52();
				this.field672.method43();
				this.field672 = null;
				if (this.field570 == null) {
					Friend.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				var26 = EnumComposition.method3907();
				var26.packetBuffer.writeByte(class328.field3648.field3653);
				var26.packetBuffer.writeShort(this.field570.offset);
				var26.packetBuffer.writeBuffer(this.field570);
				packetWriter.addNode(var26);
				packetWriter.flush();
				this.field570 = null;
				class215.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			if (LoginState.READ_STATE_11_PACKET_SIZE == ModelData0.loginState && var1.available() > 0) {
				GrandExchangeOfferOwnWorldComparator.field480 = var1.readUnsignedByte();
				class215.updateLoginState(LoginState.UNMAPPED_11);
			}

			if (LoginState.UNMAPPED_11 == ModelData0.loginState && var1.available() >= GrandExchangeOfferOwnWorldComparator.field480) {
				var1.read(var2.array, 0, GrandExchangeOfferOwnWorldComparator.field480);
				var2.offset = 0;
				class215.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			if (LoginState.READ_PROFILE_TRANSFER_TIME == ModelData0.loginState && var1.available() > 0) {
				field564 = (var1.readUnsignedByte() + 3) * 60;
				class215.updateLoginState(LoginState.PROFILE_TRANSFER);
			}

			if (ModelData0.loginState == LoginState.PROFILE_TRANSFER) {
				field595 = 0;
				class401.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field564 / 60 + " seconds.");
				if (--field564 <= 0) {
					class215.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				}

			} else if (ModelData0.loginState == LoginState.READ_ACCOUNT_INFO_PACKET_SIZE) {
				var26 = EnumComposition.method3907();
				if (class566.field5563 >= 229) {
					var26.packetBuffer.writeByte(class328.field3652.field3653);
					var26.packetBuffer.writeShort(class328.field3652.field3654);
				} else {
					var26.packetBuffer.writeByte(class328.field3649.field3653);
					var26.packetBuffer.writeShort(class328.field3649.field3654);
				}

				if (class566.field5563 >= 229) {
					var26.packetBuffer.writeIntIME(TextureProvider.archive12.hash);
					var26.packetBuffer.writeIntIME(GrandExchangeEvents.field4746.hash);
					var26.packetBuffer.writeIntIME(archive2.hash);
					var26.packetBuffer.writeIntLE(class189.field2024.hash);
					var26.packetBuffer.writeIntLE(class166.archive9.hash);
					var26.packetBuffer.writeIntLE(Projectile.field996.hash);
					var26.packetBuffer.writeInt(PlayerUpdateManager.archive6.hash);
					var26.packetBuffer.writeIntLE(KeyHandler.field116.hash);
					var26.packetBuffer.writeInt(class1.field3.hash);
					var26.packetBuffer.writeIntIME(WorldMapIcon_1.archive4.hash);
					var26.packetBuffer.writeInt(ArchiveLoader.field1065.hash);
					var26.packetBuffer.writeIntLE(MilliClock.field2452.hash);
					var26.packetBuffer.writeIntME(AsyncHttpResponse.field76.hash);
					var26.packetBuffer.writeIntIME(0);
					var26.packetBuffer.writeInt(class60.field422.hash);
					var26.packetBuffer.writeIntME(SpriteMask.field3819.hash);
				} else {
					var26.packetBuffer.writeIntLE(archive2.hash);
					var26.packetBuffer.writeIntME(TextureProvider.archive12.hash);
					var26.packetBuffer.writeIntLE(0);
					var26.packetBuffer.writeIntLE(class189.field2024.hash);
					var26.packetBuffer.writeIntLE(class166.archive9.hash);
					var26.packetBuffer.writeIntLE(PlayerUpdateManager.archive6.hash);
					var26.packetBuffer.writeIntME(SpriteMask.field3819.hash);
					var26.packetBuffer.writeIntIME(WorldMapIcon_1.archive4.hash);
					var26.packetBuffer.writeIntIME(GrandExchangeEvents.field4746.hash);
					var26.packetBuffer.writeIntIME(KeyHandler.field116.hash);
					var26.packetBuffer.writeIntIME(class1.field3.hash);
					var26.packetBuffer.writeIntLE(ArchiveLoader.field1065.hash);
					var26.packetBuffer.writeIntME(Projectile.field996.hash);
					var26.packetBuffer.writeIntLE(MilliClock.field2452.hash);
				}

				packetWriter.addNode(var26);
				packetWriter.flush();
				class215.updateLoginState(LoginState.UNMAPPED);
			} else {
				if (LoginState.UNMAPPED == ModelData0.loginState && var1.available() >= 1) {
					Buffer.field5569 = var1.readUnsignedByte();
					if (Buffer.field5569 != class328.field3646.field3654) {
						Friend.getLoginError(Buffer.field5569);
						return;
					}

					class215.updateLoginState(LoginState.READ_ACCOUNT_INFO);
				}

				if (LoginState.READ_ACCOUNT_INFO == ModelData0.loginState && var1.available() >= Buffer.field5569) {
					boolean var42 = var1.readUnsignedByte() == 1;
					var1.read(var2.array, 0, 4);
					var2.offset = 0;
					boolean var41 = false;
					if (var42) {
						var14 = var2.readByteIsaac() << 24;
						var14 |= var2.readByteIsaac() << 16;
						var14 |= var2.readByteIsaac() << 8;
						var14 |= var2.readByteIsaac();
						AbstractWorldMapIcon.clientPreferences.put(Login.Login_username, var14);
					}

					if (Login_isUsernameRemembered) {
						AbstractWorldMapIcon.clientPreferences.updateRememberedUsername(Login.Login_username);
					} else {
						AbstractWorldMapIcon.clientPreferences.updateRememberedUsername((String)null);
					}

					class274.savePreferences();
					staffModLevel = var1.readUnsignedByte();
					playerMod = var1.readUnsignedByte() == 1;
					localPlayerIndex = var1.readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += var1.readUnsignedByte();
					field640 = var1.readUnsignedByte();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					this.accountHash = var2.readLong();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					userId = var2.readLong();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					userHash = var2.readLong();
					class152.method3501().method4515(this.https);
					class215.updateLoginState(LoginState.SET_SERVER_PROTOCOL);
				}

				if (ModelData0.loginState == LoginState.SET_SERVER_PROTOCOL && var1.available() >= packetWriter.serverPacketLength) {
					var1.read(var2.array, 0, 1);
					var2.offset = 0;
					if (var2.method10171()) {
						var1.read(var2.array, 1, 1);
						var2.offset = 0;
					}

					ServerPacket[] var35 = WorldMapID.ServerPacket_values();
					var14 = var2.readSmartByteShortIsaac();
					if (var14 < 0 || var14 >= var35.length) {
						throw new IOException("Invalid ServerProt: " + var14 + " at " + var2.offset);
					}

					packetWriter.serverPacket = var35[var14];
					packetWriter.serverPacketLength = packetWriter.serverPacket.length;
					var1.read(var2.array, 0, 2);
					var2.offset = 0;
					packetWriter.serverPacketLength = var2.readUnsignedShort();

					try {
						Client var37 = class569.client;
						JSObject.getWindow(var37).call("zap", (Object[])null);
					} catch (Throwable var15) {
					}

					class215.updateLoginState(LoginState.UPDATE_PLAYER_AND_LOAD_REGIONS);
				}

				if (LoginState.UPDATE_PLAYER_AND_LOAD_REGIONS == ModelData0.loginState) {
					if (var1.available() >= packetWriter.serverPacketLength) {
						var2.offset = 0;
						var1.read(var2.array, 0, packetWriter.serverPacketLength);
						timer.method7547();
						WorldMapRectangle.method6283();
						playerUpdateManager.updatePlayer(var2);
						field646 = localPlayerIndex;
						SoundCache.field311 = class377.USERNAME_PASSWORD;
						field645 = -1;
						ApproximateRouteStrategy.field476 = -1;
						class370.loadRegions(false, var2);
						packetWriter.serverPacket = null;
						field629 = false;
					}

				} else {
					if (LoginState.UNMAPPED_17 == ModelData0.loginState && var1.available() >= 2) {
						var2.offset = 0;
						var1.read(var2.array, 0, 2);
						var2.offset = 0;
						WorldMapSectionType.field3272 = var2.readUnsignedShort();
						class215.updateLoginState(LoginState.UNMAPPED_18);
					}

					if (LoginState.UNMAPPED_18 == ModelData0.loginState && var1.available() >= WorldMapSectionType.field3272) {
						var2.offset = 0;
						var1.read(var2.array, 0, WorldMapSectionType.field3272);
						var2.offset = 0;
						String var38 = var2.readStringCp1252NullTerminated();
						String var33 = var2.readStringCp1252NullTerminated();
						String var39 = var2.readStringCp1252NullTerminated();
						class401.setLoginResponseString(var38, var33, var39);
						class511.updateGameState(10);
						if (field554.method10536()) {
							ObjectComposition.method4206(9);
						}
					}

					if (LoginState.UNMAPPED_19 != ModelData0.loginState) {
						++field595;
						if (field595 > 2000) {
							if (field551 < 1) {
								if (Frames.currentPort == class132.worldPort) {
									Frames.currentPort = AABB.js5Port;
								} else {
									Frames.currentPort = class132.worldPort;
								}

								++field551;
								class215.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
							} else {
								Friend.getLoginError(-3);
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
							var13 = packetWriter.serverPacketLength;
							timer.method7554();
							packetWriter.clearBuffer();
							packetWriter.field1492 = 0;
							packetWriter.packetBuffer.offset = 0;
							packetWriter.serverPacket = null;
							packetWriter.field1491 = null;
							packetWriter.field1495 = null;
							packetWriter.field1481 = null;
							packetWriter.serverPacketLength = 0;
							packetWriter.field1490 = 0;
							rebootTimer = 0;
							class435.method8221();
							minimapState = 0;
							destinationX = 0;
							class200.topLevelWorldView.method2824();
							ItemContainer.itemContainers = new NodeHashTable(32);
							class511.updateGameState(30);

							for (var14 = 0; var14 < 100; ++var14) {
								validRootWidgets[var14] = true;
							}

							if (packetWriter != null && packetWriter.isaacCipher != null) {
								PacketBufferNode var36 = class272.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, packetWriter.isaacCipher);
								var36.packetBuffer.writeByte(DynamicObject.getWindowedMode());
								var36.packetBuffer.writeShort(GameEngine.canvasWidth);
								var36.packetBuffer.writeShort(SwapSongTask.canvasHeight);
								packetWriter.addNode(var36);
							}

							playerUpdateManager.updatePlayer(var2);
							if (var13 != var2.offset) {
								throw new RuntimeException();
							}
						}
					}
				}
			}
		} catch (IOException var23) {
			if (field551 < 1) {
				if (class132.worldPort == Frames.currentPort) {
					Frames.currentPort = AABB.js5Port;
				} else {
					Frames.currentPort = class132.worldPort;
				}

				++field551;
				class215.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
			} else {
				Friend.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-179466370"
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
			class31.method413();
		} else {
			if (!isMenuOpen) {
				InterfaceParent.addCancelMenuEntry();
			}

			this.method1365();
			if (gameState == 30) {
				PacketBufferNode var1;
				int var2;
				while (class28.method384()) {
					var1 = class272.getPacketBufferNode(ClientPacket.REFLECTION_CHECK_REPLY, packetWriter.isaacCipher);
					var1.packetBuffer.writeByte(0);
					var2 = var1.packetBuffer.offset;
					RestClientThreadFactory.performReflectionCheck(var1.packetBuffer);
					var1.packetBuffer.writeLengthByte(var1.packetBuffer.offset - var2);
					packetWriter.addNode(var1);
				}

				if (timer.field4600) {
					var1 = class272.getPacketBufferNode(ClientPacket.LOGIN_TIMINGS, packetWriter.isaacCipher);
					var1.packetBuffer.writeByte(0);
					var2 = var1.packetBuffer.offset;
					timer.write(var1.packetBuffer);
					var1.packetBuffer.writeLengthByte(var1.packetBuffer.offset - var2);
					packetWriter.addNode(var1);
					timer.method7549();
				}

				int var3;
				int var4;
				int var5;
				int var6;
				int var7;
				int var8;
				int var9;
				int var10;
				PacketBuffer var10000;
				synchronized(class178.mouseRecorder.lock) {
					if (!field618) {
						class178.mouseRecorder.index = 0;
					} else if (MouseHandler.MouseHandler_lastButton != 0 || class178.mouseRecorder.index >= 40) {
						PacketBufferNode var14 = null;
						var3 = 0;
						var4 = 0;
						var5 = 0;
						var6 = 0;

						for (var7 = 0; var7 < class178.mouseRecorder.index && (var14 == null || var14.packetBuffer.offset - var3 < 246); ++var7) {
							var4 = var7;
							var8 = class178.mouseRecorder.ys[var7];
							if (var8 < -1) {
								var8 = -1;
							} else if (var8 > 65534) {
								var8 = 65534;
							}

							var9 = class178.mouseRecorder.xs[var7];
							if (var9 < -1) {
								var9 = -1;
							} else if (var9 > 65534) {
								var9 = 65534;
							}

							if (var9 != field529 || var8 != field530) {
								if (var14 == null) {
									var14 = class272.getPacketBufferNode(ClientPacket.MOUSE_MOVE, packetWriter.isaacCipher);
									var14.packetBuffer.writeByte(0);
									var3 = var14.packetBuffer.offset;
									var10000 = var14.packetBuffer;
									var10000.offset += 2;
									var5 = 0;
									var6 = 0;
								}

								int var11;
								int var12;
								if (-1L != field722) {
									var10 = var9 - field529;
									var11 = var8 - field530;
									var12 = (int)((class178.mouseRecorder.millis[var7] - field722) / 20L);
									var5 = (int)((long)var5 + (class178.mouseRecorder.millis[var7] - field722) % 20L);
								} else {
									var10 = var9;
									var11 = var8;
									var12 = Integer.MAX_VALUE;
								}

								field529 = var9;
								field530 = var8;
								if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
									var10 += 32;
									var11 += 32;
									var14.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6));
								} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
									var10 += 128;
									var11 += 128;
									var14.packetBuffer.writeByte(var12 + 128);
									var14.packetBuffer.writeShort(var11 + (var10 << 8));
								} else if (var12 < 32) {
									var14.packetBuffer.writeByte(var12 + 192);
									if (var9 != -1 && var8 != -1) {
										var14.packetBuffer.writeInt(var9 | var8 << 16);
									} else {
										var14.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								} else {
									var14.packetBuffer.writeShort((var12 & 8191) + 57344);
									if (var9 != -1 && var8 != -1) {
										var14.packetBuffer.writeInt(var9 | var8 << 16);
									} else {
										var14.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								}

								++var6;
								field722 = class178.mouseRecorder.millis[var7];
							}
						}

						if (var14 != null) {
							var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var3);
							var7 = var14.packetBuffer.offset;
							var14.packetBuffer.offset = var3;
							var14.packetBuffer.writeByte(var5 / var6);
							var14.packetBuffer.writeByte(var5 % var6);
							var14.packetBuffer.offset = var7;
							packetWriter.addNode(var14);
						}

						if (var4 >= class178.mouseRecorder.index) {
							class178.mouseRecorder.index = 0;
						} else {
							MouseRecorder var64 = class178.mouseRecorder;
							var64.index -= var4;
							System.arraycopy(class178.mouseRecorder.xs, var4, class178.mouseRecorder.xs, 0, class178.mouseRecorder.index);
							System.arraycopy(class178.mouseRecorder.ys, var4, class178.mouseRecorder.ys, 0, class178.mouseRecorder.index);
							System.arraycopy(class178.mouseRecorder.millis, var4, class178.mouseRecorder.millis, 0, class178.mouseRecorder.index);
						}
					}
				}

				PacketBufferNode var17;
				if (MouseHandler.MouseHandler_lastButton == 1 || !class466.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
					long var15 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis * -1L;
					if (var15 > 32767L) {
						var15 = 32767L;
					}

					mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis * -1L;
					var3 = MouseHandler.MouseHandler_lastPressedY;
					if (var3 < 0) {
						var3 = 0;
					} else if (var3 > SwapSongTask.canvasHeight) {
						var3 = SwapSongTask.canvasHeight;
					}

					var4 = MouseHandler.MouseHandler_lastPressedX;
					if (var4 < 0) {
						var4 = 0;
					} else if (var4 > GameEngine.canvasWidth) {
						var4 = GameEngine.canvasWidth;
					}

					var5 = (int)var15;
					var17 = class272.getPacketBufferNode(ClientPacket.EVENT_MOUSE_CLICK, packetWriter.isaacCipher);
					var17.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1));
					var17.packetBuffer.writeShort(var4);
					var17.packetBuffer.writeShort(var3);
					packetWriter.addNode(var17);
				}

				if (mouseWheelRotation != 0) {
					var1 = class272.getPacketBufferNode(ClientPacket.MOUSE_WHEEL, packetWriter.isaacCipher);
					var1.packetBuffer.writeShort(mouseWheelRotation);
					packetWriter.addNode(var1);
				}

				if (indexCheck.field3057 > 0) {
					var1 = class272.getPacketBufferNode(ClientPacket.EVENT_KEYBOARD, packetWriter.isaacCipher);
					var1.packetBuffer.writeShort(0);
					var2 = var1.packetBuffer.offset;
					long var18 = InterfaceParent.method2434();

					for (var5 = 0; var5 < indexCheck.field3057; ++var5) {
						long var20 = var18 - field753;
						if (var20 > 16777215L) {
							var20 = 16777215L;
						}

						field753 = var18;
						var1.packetBuffer.writeMedium((int)var20);
						var1.packetBuffer.writeByte(indexCheck.field3059[var5]);
					}

					var1.packetBuffer.writeLengthShort(var1.packetBuffer.offset - var2);
					packetWriter.addNode(var1);
				}

				if (field763 > 0) {
					--field763;
				}

				if (indexCheck.isValidIndexInRange(96) || indexCheck.isValidIndexInRange(97) || indexCheck.isValidIndexInRange(98) || indexCheck.isValidIndexInRange(99)) {
					field794 = true;
				}

				if (field794 && field763 <= 0) {
					field763 = 20;
					field794 = false;
					var1 = class272.getPacketBufferNode(ClientPacket.EVENT_CAMERA_POSITION, packetWriter.isaacCipher);
					var1.packetBuffer.writeShort(camAngleX);
					var1.packetBuffer.writeShortLE(camAngleY);
					packetWriter.addNode(var1);
				}

				if (class361.hasFocus && !hadFocus) {
					hadFocus = true;
					var1 = class272.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
					var1.packetBuffer.writeByte(1);
					packetWriter.addNode(var1);
				}

				if (!class361.hasFocus && hadFocus) {
					hadFocus = false;
					var1 = class272.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
					var1.packetBuffer.writeByte(0);
					packetWriter.addNode(var1);
				}

				if (class541.worldMap != null) {
					class541.worldMap.method9832();
				}

				class59.method1124();
				FaceNormal.method5194();
				class60.method1156();
				if (gameState == 30) {
					Iterator var30 = worldViewManager.iterator();

					WorldView var36;
					while (var30.hasNext()) {
						var36 = (WorldView)var30.next();

						for (PendingSpawn var22 = (PendingSpawn)var36.pendingSpawns.last(); var22 != null; var22 = (PendingSpawn)var36.pendingSpawns.previous()) {
							if (var22.hitpoints > 0) {
								--var22.hitpoints;
							}

							ObjectComposition var23;
							boolean var33;
							if (var22.hitpoints == 0) {
								if (var22.objectId >= 0) {
									var5 = var22.objectId;
									var6 = var22.field1205;
									var23 = class177.getObjectDefinition(var5);
									if (var6 == 11) {
										var6 = 10;
									}

									if (var6 >= 5 && var6 <= 8) {
										var6 = 4;
									}

									var33 = var23.method4201(var6);
									if (!var33) {
										continue;
									}
								}

								GrandExchangeOfferNameComparator.addPendingSpawnToScene(var36, var22.plane, var22.type, var22.x, var22.y, var22.objectId, var22.field1204, var22.field1205, var22.field1210);
								var22.remove();
							} else {
								if (var22.delay > 0) {
									--var22.delay;
								}

								if (var22.delay == 0 && var22.x >= 1 && var22.y >= 1 && var22.x <= 102 && var22.y <= 102) {
									if (var22.field1206 >= 0) {
										var5 = var22.field1206;
										var6 = var22.field1215;
										var23 = class177.getObjectDefinition(var5);
										if (var6 == 11) {
											var6 = 10;
										}

										if (var6 >= 5 && var6 <= 8) {
											var6 = 4;
										}

										var33 = var23.method4201(var6);
										if (!var33) {
											continue;
										}
									}

									GrandExchangeOfferNameComparator.addPendingSpawnToScene(var36, var22.plane, var22.type, var22.x, var22.y, var22.field1206, var22.field1207, var22.field1215, var22.field1210);
									var22.delay = -1;
									if (var22.field1206 == var22.objectId && var22.objectId == -1) {
										var22.remove();
									} else if (var22.field1206 == var22.objectId && var22.field1207 == var22.field1204 && var22.field1215 == var22.field1205) {
										var22.remove();
									}
								}
							}
						}
					}

					int var10002;
					int var24;
					for (var24 = 0; var24 < soundEffectCount; ++var24) {
						var10002 = queuedSoundEffectDelays[var24]--;
						if (queuedSoundEffectDelays[var24] >= -10) {
							SoundEffect var37 = soundEffects[var24];
							if (var37 == null) {
								var10000 = null;
								var37 = SoundEffect.readSoundEffect(class553.field5487, soundEffectIds[var24], 0);
								if (var37 == null) {
									continue;
								}

								int[] var65 = queuedSoundEffectDelays;
								var65[var24] += var37.calculateDelay();
								soundEffects[var24] = var37;
							}

							if (queuedSoundEffectDelays[var24] < 0) {
								if (soundLocations[var24] != 0) {
									var4 = (soundLocations[var24] & 255) * 128;
									var5 = soundLocations[var24] >> 16 & 255;
									var6 = Math.abs(Coord.method6905(var5) - class132.localPlayer.x);
									var7 = soundLocations[var24] >> 8 & 255;
									var8 = Math.abs(Coord.method6905(var7) - class132.localPlayer.y);
									var9 = Math.max(var8 + var6 - 128, 0);
									var10 = Math.max(((field772[var24] & 31) - 1) * 128, 0);
									if (var9 >= var4) {
										queuedSoundEffectDelays[var24] = -100;
										continue;
									}

									float var35 = var10 < var4 ? Math.min(Math.max((float)(var4 - var9) / (float)(var4 - var10), 0.0F), 1.0F) : 1.0F;
									var3 = (int)(var35 * (float)AbstractWorldMapIcon.clientPreferences.getAreaSoundEffectsVolume());
								} else {
									var3 = AbstractWorldMapIcon.clientPreferences.getSoundEffectsVolume();
								}

								if (var3 > 0) {
									RawSound var25 = var37.toRawSound().resample(HttpMethod.decimator);
									RawPcmStream var26 = RawPcmStream.createRawPcmStream(var25, 100, var3);
									if (var26 != null) {
										var26.setNumLoops(queuedSoundEffectLoops[var24] - 1);
										WorldMapIcon_0.pcmStreamMixer.addSubStream(var26);
									}
								}

								queuedSoundEffectDelays[var24] = -100;
							}
						} else {
							--soundEffectCount;

							for (var2 = var24; var2 < soundEffectCount; ++var2) {
								soundEffectIds[var2] = soundEffectIds[var2 + 1];
								soundEffects[var2] = soundEffects[var2 + 1];
								queuedSoundEffectLoops[var2] = queuedSoundEffectLoops[var2 + 1];
								queuedSoundEffectDelays[var2] = queuedSoundEffectDelays[var2 + 1];
								soundLocations[var2] = soundLocations[var2 + 1];
								field772[var2] = field772[var2 + 1];
							}

							--var24;
						}
					}

					if (playingJingle && !class6.method39()) {
						if (AbstractWorldMapIcon.clientPreferences.getMusicVolume() != 0) {
							boolean var49 = !class335.field3689.isEmpty();
							if (var49) {
								class219.method4457(EnumComposition.field2011, AbstractWorldMapIcon.clientPreferences.getMusicVolume());
							}
						}

						playingJingle = false;
					}

					++packetWriter.field1490;
					if (packetWriter.field1490 > 750) {
						class31.method413();
					} else {
						var24 = playerUpdateManager.playerCount;
						int[] var38 = playerUpdateManager.playerIndices;
						Iterator var44 = worldViewManager.iterator();

						while (var44.hasNext()) {
							WorldView var50 = (WorldView)var44.next();

							for (var5 = 0; var5 < var24; ++var5) {
								Player var39 = (Player)var50.players.get((long)var38[var5]);
								if (var39 != null) {
									class272.updateActorSequence(var50, var39, 1);
								}
							}
						}

						var30 = worldViewManager.iterator();

						while (var30.hasNext()) {
							var36 = (WorldView)var30.next();
							var44 = var36.npcs.iterator();

							while (var44.hasNext()) {
								NPC var51 = (NPC)var44.next();
								if (var51 != null) {
									class272.updateActorSequence(var36, var51, var51.definition.size);
								}
							}
						}

						var30 = worldViewManager.iterator();

						while (var30.hasNext()) {
							var36 = (WorldView)var30.next();

							for (var3 = 0; var3 < var36.field1357.method9005(); ++var3) {
								var4 = var36.field1357.method9007(var3);
								WorldEntity var53 = (WorldEntity)var36.worldEntities.get((long)var4);
								if (var53 != null) {
									var53.method9301(cycle);
								}
							}
						}

						int[] var31 = playerUpdateManager.playerIndices;
						Iterator var41 = worldViewManager.iterator();

						Iterator var52;
						while (var41.hasNext()) {
							WorldView var45 = (WorldView)var41.next();

							for (var4 = 0; var4 < playerUpdateManager.playerCount; ++var4) {
								Player var55 = (Player)var45.players.get((long)var31[var4]);
								if (var55 != null && var55.overheadTextCyclesRemaining > 0) {
									--var55.overheadTextCyclesRemaining;
									if (var55.overheadTextCyclesRemaining == 0) {
										var55.overheadText = null;
									}
								}
							}

							var52 = var45.npcs.iterator();

							while (var52.hasNext()) {
								NPC var57 = (NPC)var52.next();
								if (var57 != null && var57.overheadTextCyclesRemaining > 0) {
									--var57.overheadTextCyclesRemaining;
									if (var57.overheadTextCyclesRemaining == 0) {
										var57.overheadText = null;
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

						if (field790 > 0) {
							--field790;
						}

						Widget var32 = class27.mousedOverWidgetIf1;
						Widget var43 = WorldMapLabel.field3311;
						class27.mousedOverWidgetIf1 = null;
						WorldMapLabel.field3311 = null;
						draggedOnWidget = null;
						field700 = false;
						field697 = false;
						field579 = 0;

						while (indexCheck.method5597() && field579 < 128) {
							if (staffModLevel >= 2 && indexCheck.isValidIndexInRange(82) && indexCheck.field3064 == 66) {
								StringBuilder var54 = new StringBuilder();

								Message var40;
								for (Iterator var58 = Messages.Messages_hashTable.iterator(); var58.hasNext(); var54.append(var40.text).append('\n')) {
									var40 = (Message)var58.next();
									if (var40.sender != null && !var40.sender.isEmpty()) {
										var54.append(var40.sender).append(':');
									}
								}

								String var46 = var54.toString();
								class569.client.method460(var46);
							} else if (oculusOrbState != 1 || indexCheck.field3068 <= 0) {
								field752[field579] = indexCheck.field3064;
								field751[field579] = indexCheck.field3068;
								++field579;
							}
						}

						if (MouseHandler.method650() && indexCheck.isValidIndexInRange(82) && indexCheck.isValidIndexInRange(81) && mouseWheelRotation != 0) {
							var3 = class132.localPlayer.plane - mouseWheelRotation;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > 3) {
								var3 = 3;
							}

							if (var3 != class132.localPlayer.plane) {
								SecureUrlRequester.method3159(class132.localPlayer.pathX[0] + class200.topLevelWorldView.baseX, class132.localPlayer.pathY[0] + class200.topLevelWorldView.baseY, var3, false);
							}

							mouseWheelRotation = 0;
						}

						if (rootInterface != -1) {
							MenuAction.updateRootInterface(rootInterface, 0, 0, GameEngine.canvasWidth, SwapSongTask.canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							ScriptEvent var48;
							Widget var56;
							Widget var59;
							do {
								var48 = (ScriptEvent)scriptEvents2.removeLast();
								if (var48 == null) {
									while (true) {
										do {
											var48 = (ScriptEvent)scriptEvents3.removeLast();
											if (var48 == null) {
												while (true) {
													do {
														var48 = (ScriptEvent)scriptEvents.removeLast();
														if (var48 == null) {
															boolean var34 = false;

															while (true) {
																class269 var60 = (class269)field726.removeLast();
																if (var60 == null) {
																	if (!var34 && MouseHandler.MouseHandler_lastButton == 1) {
																		field749.method5559();
																	}

																	this.menu();
																	LoginPacket.method3468();
																	if (clickedWidget != null) {
																		this.method1263();
																	}

																	var52 = worldViewManager.iterator();

																	while (var52.hasNext()) {
																		WorldView var63 = (WorldView)var52.next();
																		Scene var42 = var63.scene;
																		if (var42.shouldSendWalk()) {
																			var7 = var42.baseX;
																			var8 = var42.baseY;
																			PacketBufferNode var27 = class272.getPacketBufferNode(ClientPacket.MOVE_GAMECLICK, packetWriter.isaacCipher);
																			var27.packetBuffer.writeByte(5);
																			var27.packetBuffer.writeByteSub(indexCheck.isValidIndexInRange(82) ? (indexCheck.isValidIndexInRange(81) ? 2 : 1) : 0);
																			var27.packetBuffer.writeShort(var8 + var63.baseY);
																			var27.packetBuffer.writeShortLE(var7 + var63.baseX);
																			packetWriter.addNode(var27);
																			mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																			mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																			mouseCrossColor = 1;
																			mouseCrossState = 0;
																			destinationX = var7;
																			destinationY = var8;
																			var42.method4965();
																		}
																	}

																	if (var32 != class27.mousedOverWidgetIf1) {
																		if (var32 != null) {
																			MilliClock.invalidateWidget(var32);
																		}

																		if (class27.mousedOverWidgetIf1 != null) {
																			MilliClock.invalidateWidget(class27.mousedOverWidgetIf1);
																		}
																	}

																	if (var43 != WorldMapLabel.field3311 && field639 == field706) {
																		if (var43 != null) {
																			MilliClock.invalidateWidget(var43);
																		}

																		if (WorldMapLabel.field3311 != null) {
																			MilliClock.invalidateWidget(WorldMapLabel.field3311);
																		}
																	}

																	if (WorldMapLabel.field3311 != null) {
																		if (field639 < field706) {
																			++field639;
																			if (field706 == field639) {
																				MilliClock.invalidateWidget(WorldMapLabel.field3311);
																			}
																		}
																	} else if (field639 > 0) {
																		--field639;
																	}

																	class92.method2467();
																	if (field781) {
																		HttpMethod.method67();
																	} else if (isCameraLocked) {
																		class374.method7502();
																	}

																	for (var4 = 0; var4 < 5; ++var4) {
																		var10002 = field786[var4]++;
																	}

																	class322.varcs.tryWrite();
																	var4 = DynamicObject.method2337();
																	var5 = GameEngine.keyHandler.method311();
																	PacketBufferNode var47;
																	if (var4 > 15000 && var5 > 15000) {
																		logoutTimer = 250;
																		class330.method6523(14500);
																		var47 = class272.getPacketBufferNode(ClientPacket.EVENT_MOUSE_IDLE, packetWriter.isaacCipher);
																		packetWriter.addNode(var47);
																	}

																	SoundCache.friendSystem.processFriendUpdates();
																	MidiPcmStream.method6671();
																	++packetWriter.pendingWrites;
																	if (packetWriter.pendingWrites > 50) {
																		var47 = class272.getPacketBufferNode(ClientPacket.NO_TIMEOUT, packetWriter.isaacCipher);
																		packetWriter.addNode(var47);
																	}

																	try {
																		packetWriter.flush();
																	} catch (IOException var28) {
																		class31.method413();
																	}

																	class152.method3501().method4520();
																	return;
																}

																if (var60.field3054.type == 12) {
																	var34 = true;
																}

																if (var60 != null && var60.field3054 != null) {
																	if (var60.field3054.childIndex >= 0) {
																		var59 = class376.widgetDefinition.method6918(var60.field3054.parentId);
																		if (var59 == null || var59.children == null || var59.children.length == 0 || var60.field3054.childIndex >= var59.children.length || var60.field3054 != var59.children[var60.field3054.childIndex]) {
																			continue;
																		}
																	}

																	if (var60.field3054.type == 11 && var60.field3051 == 0) {
																		if (var60.field3054.method7319(var60.field3049, var60.field3052, 0, 0)) {
																			var60.field3054.method7327().method4433().method4531(1, var60.field3054.method7327().method4397());
																			switch(var60.field3054.method7323()) {
																			case 0:
																				class91.openURL(var60.field3054.method7325(), true, false);
																				break;
																			case 1:
																				if (class504.method9519(class441.getWidgetFlags(var60.field3054))) {
																					int[] var62 = var60.field3054.method7428();
																					if (var62 != null) {
																						var17 = class272.getPacketBufferNode(ClientPacket.IF_CRMVIEW, packetWriter.isaacCipher);
																						var17.packetBuffer.writeIntIME(var62[1]);
																						var17.packetBuffer.writeIntLE(var62[0]);
																						var17.packetBuffer.writeIntLE(var60.field3054.method7324());
																						var17.packetBuffer.writeIntME(var62[2]);
																						var17.packetBuffer.writeShort(var60.field3054.childIndex);
																						var17.packetBuffer.writeIntME(var60.field3054.id);
																						packetWriter.addNode(var17);
																					}
																				}
																			}
																		}
																	} else if (var60.field3054.type == 12) {
																		class361 var61 = var60.field3054.method7331();
																		if (var61 != null && var61.method7073()) {
																			switch(var60.field3051) {
																			case 0:
																				field749.method5557(var60.field3054);
																				var61.method7021(true);
																				var61.method7178(var60.field3049, var60.field3052, indexCheck.isValidIndexInRange(82), indexCheck.isValidIndexInRange(81));
																				break;
																			case 1:
																				var61.method7061(var60.field3049, var60.field3052);
																			}
																		}
																	}
																}
															}
														}

														var56 = var48.widget;
														if (var56.childIndex < 0) {
															break;
														}

														var59 = class376.widgetDefinition.method6918(var56.parentId);
													} while(var59 == null || var59.children == null || var56.childIndex >= var59.children.length || var56 != var59.children[var56.childIndex]);

													MilliClock.runScriptEvent(var48);
												}
											}

											var56 = var48.widget;
											if (var56.childIndex < 0) {
												break;
											}

											var59 = class376.widgetDefinition.method6918(var56.parentId);
										} while(var59 == null || var59.children == null || var56.childIndex >= var59.children.length || var56 != var59.children[var56.childIndex]);

										MilliClock.runScriptEvent(var48);
									}
								}

								var56 = var48.widget;
								if (var56.childIndex < 0) {
									break;
								}

								var59 = class376.widgetDefinition.method6918(var56.parentId);
							} while(var59 == null || var59.children == null || var56.childIndex >= var59.children.length || var56 != var59.children[var56.childIndex]);

							MilliClock.runScriptEvent(var48);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "96"
	)
	public void vmethod6792(int var1, int var2) {
		if (packetWriter != null && packetWriter.isaacCipher != null) {
			if (var1 > -1 && AbstractWorldMapIcon.clientPreferences.getMusicVolume() > 0 && !playingJingle) {
				PacketBufferNode var3 = class272.getPacketBufferNode(ClientPacket.MUSIC_PLAYING, packetWriter.isaacCipher);
				var3.packetBuffer.writeInt(var1);
				packetWriter.addNode(var3);
			}

		}
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "101"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = GameEngine.canvasWidth;
		int var2 = SwapSongTask.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}

		if (AbstractWorldMapIcon.clientPreferences != null) {
			try {
				class26.method339(class569.client, "resize", new Object[]{DynamicObject.getWindowedMode()});
			} catch (Throwable var4) {
			}
		}

	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) {
			class279.method5831(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (validRootWidgets[var1]) {
				field729[var1] = true;
			}

			field732[var1] = validRootWidgets[var1];
			validRootWidgets[var1] = false;
		}

		field740 = cycle;
		viewportX = -1;
		viewportY = -1;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			class272.drawWidgets(rootInterface, 0, 0, GameEngine.canvasWidth, SwapSongTask.canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				class201.crossSprites[mouseCrossState * 20 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				class201.crossSprites[mouseCrossState * 20 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}

		int var2;
		int var3;
		if (!isMenuOpen) {
			if (viewportX != -1) {
				var1 = viewportX;
				var2 = viewportY;
				if ((menu.menuOptionsCount >= 2 || isItemSelected != 0 || isSpellSelected) && showMouseOverText) {
					var3 = class332.method6534();
					String var4;
					if (isItemSelected == 1 && menu.menuOptionsCount < 2) {
						var4 = "Use" + " " + field674 + " " + "->";
					} else if (isSpellSelected && menu.menuOptionsCount < 2) {
						var4 = selectedSpellActionName + " " + selectedSpellName + " " + "->";
					} else {
						var4 = menu.method10867(var3);
					}

					if (menu.menuOptionsCount > 2) {
						var4 = var4 + MilliClock.colorStartTag(16777215) + " " + '/' + " " + (menu.menuOptionsCount - 2) + " more options";
					}

					UserComparator7.fontBold12.drawRandomAlphaAndSpacing(var4, var1 + 4, var2 + 15, 16777215, 0, cycle / 1000);
				}
			}
		} else {
			menu.method10879();
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field732[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field729[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		var1 = class200.topLevelWorldView.plane;
		var2 = class132.localPlayer.x;
		var3 = class132.localPlayer.y;
		int var13 = graphicsCycle;

		for (ObjectSound var5 = (ObjectSound)ObjectSound.objectSounds.last(); var5 != null; var5 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var5.soundEffectId != -1 || var5.soundEffectIds != null) {
				int var6 = 0;
				if (var2 > var5.maxX * 128) {
					var6 += var2 - var5.maxX * 128;
				} else if (var2 < var5.x * 16384) {
					var6 += var5.x * 16384 - var2;
				}

				if (var3 > var5.maxY * 16384) {
					var6 += var3 - var5.maxY * 16384;
				} else if (var3 < var5.y * 128) {
					var6 += var5.y * 128 - var3;
				}

				var6 = Math.max(var6 - 64, 0);
				if (var6 < var5.field855 && AbstractWorldMapIcon.clientPreferences.getAreaSoundEffectsVolume() != 0 && var1 == var5.plane) {
					float var7 = var5.field856 < var5.field855 ? Math.min(Math.max((float)(var5.field855 - var6) / (float)(var5.field855 - var5.field856), 0.0F), 1.0F) : 1.0F;
					int var8 = (int)(var7 * (float)AbstractWorldMapIcon.clientPreferences.getAreaSoundEffectsVolume());
					Object var10000;
					if (var5.stream1 == null) {
						if (var5.soundEffectId >= 0) {
							var10000 = null;
							SoundEffect var9 = SoundEffect.readSoundEffect(class553.field5487, var5.soundEffectId, 0);
							if (var9 != null) {
								RawSound var10 = var9.toRawSound().resample(HttpMethod.decimator);
								RawPcmStream var11 = RawPcmStream.createRawPcmStream(var10, 100, var8);
								var11.setNumLoops(-1);
								WorldMapIcon_0.pcmStreamMixer.addSubStream(var11);
								var5.stream1 = var11;
							}
						}
					} else {
						var5.stream1.method869(var8);
					}

					if (var5.stream2 == null) {
						if (var5.soundEffectIds != null && (var5.field859 -= var13) <= 0) {
							int var14 = (int)(Math.random() * (double)var5.soundEffectIds.length);
							var10000 = null;
							SoundEffect var15 = SoundEffect.readSoundEffect(class553.field5487, var5.soundEffectIds[var14], 0);
							if (var15 != null) {
								RawSound var16 = var15.toRawSound().resample(HttpMethod.decimator);
								RawPcmStream var12 = RawPcmStream.createRawPcmStream(var16, 100, var8);
								var12.setNumLoops(0);
								WorldMapIcon_0.pcmStreamMixer.addSubStream(var12);
								var5.stream2 = var12;
								var5.field859 = var5.field863 + (int)(Math.random() * (double)(var5.field860 - var5.field863));
							}
						}
					} else {
						var5.stream2.method869(var8);
						if (!var5.stream2.hasNext()) {
							var5.stream2 = null;
						}
					}
				} else {
					if (var5.stream1 != null) {
						WorldMapIcon_0.pcmStreamMixer.removeSubStream(var5.stream1);
						var5.stream1 = null;
					}

					if (var5.stream2 != null) {
						WorldMapIcon_0.pcmStreamMixer.removeSubStream(var5.stream2);
						var5.stream2 = null;
					}
				}
			}
		}

		graphicsCycle = 0;
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(Lee;I)Z",
		garbageValue = "-197234867"
	)
	boolean method1254(PacketWriter var1) {
		if (var1.serverPacketLength == 0) {
			class7.friendsChat = null;
		} else {
			if (class7.friendsChat == null) {
				class7.friendsChat = new FriendsChat(class280.loginType, class569.client);
			}

			class7.friendsChat.method9104(var1.packetBuffer);
		}

		field715 = cycleCntr;
		RestClientThreadFactory.ClanChat_inClanChat = true;
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(Lee;I)Z",
		garbageValue = "1434781137"
	)
	boolean method1554(PacketWriter var1) {
		if (class7.friendsChat != null) {
			class7.friendsChat.method9105(var1.packetBuffer);
		}

		field715 = cycleCntr;
		RestClientThreadFactory.ClanChat_inClanChat = true;
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-78"
	)
	void method1365() {
		int var1 = 0;
		boolean var2 = packetWriter.field1492 > 0;

		for (int var3 = packetWriter.field1493; var1 < 100 || var2; var2 = packetWriter.field1492 > 0) {
			boolean var4 = this.method1434(packetWriter);
			if (var2) {
				int var5 = packetWriter.field1493 - var3;
				PacketWriter var10000 = packetWriter;
				var10000.field1492 -= var5;
			}

			if (!var4) {
				break;
			}

			++var1;
			var3 = packetWriter.field1493;
		}

	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(Lee;B)Z",
		garbageValue = "-77"
	)
	@Export("method1434")
	final boolean method1434(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket();
		PacketBuffer var3 = var1.packetBuffer;
		if (var2 == null) {
			return false;
		} else {
			int var6;
			String var22;
			try {
				if (var1.field1492 > 0 && !var2.isAvailable(var1.field1492)) {
					return false;
				}

				int var5;
				if (var1.serverPacket == null) {
					if (var1.field1489) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var1.field1493 += var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1490 = 0;
						var1.field1489 = false;
					}

					var3.offset = 0;
					if (var3.method10171()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var1.field1493 += var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1490 = 0;
					}

					var1.field1489 = true;
					ServerPacket[] var4 = WorldMapID.ServerPacket_values();
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

					var1.field1493 += var2.read(var3.array, 0, 1);
					var1.serverPacketLength = var3.array[0] & 255;
				}

				if (var1.serverPacketLength == -2) {
					if (!var2.isAvailable(2)) {
						return false;
					}

					var1.field1493 += var2.read(var3.array, 0, 2);
					var3.offset = 0;
					var1.serverPacketLength = var3.readUnsignedShort();
				}

				if (!var2.isAvailable(var1.serverPacketLength)) {
					return false;
				}

				var3.offset = 0;
				var1.field1493 += var2.read(var3.array, 0, var1.serverPacketLength);
				var1.field1490 = 0;
				timer.method7544();
				var1.field1481 = var1.field1495;
				var1.field1495 = var1.field1491;
				var1.field1491 = var1.serverPacket;
				int var7;
				int var8;
				int var9;
				int var10;
				int var11;
				int var12;
				boolean var61;
				boolean var62;
				int var66;
				if (ServerPacket.CAM_MOVETO_EASED_CIRCULAR == var1.serverPacket) {
					isCameraLocked = true;
					field781 = false;
					field552 = true;
					ItemLayer.field2525 = var3.readUnsignedByte();
					GraphicsDefaults.field5219 = var3.readUnsignedByte();
					var66 = var3.readUnsignedShort();
					var5 = Coord.method6905(var3.readUnsignedByte());
					var6 = Coord.method6905(var3.readUnsignedByte());
					var7 = var3.readUnsignedShort();
					field777 = var3.readBoolean();
					var8 = var3.readUnsignedByte();
					var9 = Coord.method6905(ItemLayer.field2525);
					var10 = Coord.method6905(GraphicsDefaults.field5219);
					var61 = false;
					var62 = false;
					if (field777) {
						var11 = GrandExchangeOfferUnitPriceComparator.cameraY;
						var12 = DevicePcmPlayerProvider.getTileHeight(class200.topLevelWorldView, var9, var10, class200.topLevelWorldView.plane) - var66;
					} else {
						var11 = DevicePcmPlayerProvider.getTileHeight(class200.topLevelWorldView, class181.cameraX, ApproximateRouteStrategy.cameraZ, class200.topLevelWorldView.plane) - GrandExchangeOfferUnitPriceComparator.cameraY;
						var12 = var66;
					}

					field779 = new class532(class181.cameraX, ApproximateRouteStrategy.cameraZ, var11, var9, var10, var12, var5, var6, var7, var8);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OBJ_ADD == var1.serverPacket) {
					class72.method2185(class325.field3495);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3636 == var1.serverPacket) {
					var1.field1492 = var3.readShort();
					var1.serverPacket = null;
					return true;
				}

				byte var67;
				if (ServerPacket.CLAN_CHANNEL_FULL == var1.serverPacket) {
					field555 = cycleCntr;
					var67 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var67 >= 0) {
							currentClanChannels[var67] = null;
						} else {
							HttpMethod.guestClanChannel = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var67 >= 0) {
						currentClanChannels[var67] = new ClanChannel(var3);
					} else {
						HttpMethod.guestClanChannel = new ClanChannel(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3641 == var1.serverPacket) {
					var66 = var3.readShort();
					class505 var89 = (class505)class454.findEnumerated(UrlRequest.method3166(), var3.readUnsignedByte());
					class503 var98 = (class503)class454.findEnumerated(UrlRequester.method3150(), var3.readUnsignedByte());
					if (var66 == -2) {
						worldViewManager.method2534(var89, var98);
					} else {
						worldViewManager.method2545(var66, var89, var98);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SYNC_CLIENT_VARCACHE == var1.serverPacket) {
					for (var66 = 0; var66 < Varps.Varps_main.length; ++var66) {
						if (Varps.Varps_main[var66] != Varps.Varps_temp[var66]) {
							Varps.Varps_main[var66] = Varps.Varps_temp[var66];
							DevicePcmPlayerProvider.changeGameOptions(var66);
							changedVarps[++changedVarpCount - 1 & 31] = var66;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_STOCKMARKET_SLOT == var1.serverPacket) {
					var66 = var3.readUnsignedByte();
					if (var3.readUnsignedByte() == 0) {
						grandExchangeOffers[var66] = new GrandExchangeOffer();
						var3.offset += 18;
					} else {
						--var3.offset;
						grandExchangeOffers[var66] = new GrandExchangeOffer(var3, false);
					}

					field718 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				InterfaceParent var78;
				if (ServerPacket.IF_OPENSUB == var1.serverPacket) {
					var66 = var3.readUnsignedShort();
					var5 = var3.readUnsignedIntLE();
					var6 = var3.readUnsignedByteAdd();
					var78 = (InterfaceParent)interfaceParents.get((long)var5);
					if (var78 != null) {
						class33.closeInterface(var78, var66 != var78.group);
					}

					Login.openInterface(var5, var66, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MAP_ANIM == var1.serverPacket) {
					class72.method2185(class325.field3487);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_MOVETO == var1.serverPacket) {
					isCameraLocked = true;
					field781 = false;
					field552 = true;
					ItemLayer.field2525 = var3.readUnsignedByte();
					GraphicsDefaults.field5219 = var3.readUnsignedByte();
					var66 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShort();
					field777 = var3.readBoolean();
					var6 = var3.readUnsignedByte();
					var7 = Coord.method6905(ItemLayer.field2525);
					var8 = Coord.method6905(GraphicsDefaults.field5219);
					boolean var64 = false;
					boolean var63 = false;
					if (field777) {
						var9 = GrandExchangeOfferUnitPriceComparator.cameraY;
						var10 = DevicePcmPlayerProvider.getTileHeight(class200.topLevelWorldView, var7, var8, class200.topLevelWorldView.plane) - var66;
					} else {
						var9 = DevicePcmPlayerProvider.getTileHeight(class200.topLevelWorldView, class181.cameraX, ApproximateRouteStrategy.cameraZ, class200.topLevelWorldView.plane) - GrandExchangeOfferUnitPriceComparator.cameraY;
						var10 = var66;
					}

					field779 = new class533(class181.cameraX, ApproximateRouteStrategy.cameraZ, var9, var7, var8, var10, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_MODE == var1.serverPacket) {
					var66 = var3.readUnsignedByte();
					class106.method2944(var66);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_SPOTANIM == var1.serverPacket) {
					var7 = var3.readUnsignedByteNeg();
					var5 = var3.readUnsignedShort();
					var66 = var3.readUnsignedShort();
					Player var93;
					if (var66 == localPlayerIndex) {
						var93 = class132.localPlayer;
					} else {
						var93 = (Player)class376.worldView.players.get((long)var66);
					}

					var6 = var3.readUnsignedIntME();
					if (var93 != null) {
						var93.updateSpotAnimation(var7, var5, var6 >> 16, var6 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_ACTIVE_WORLD == var1.serverPacket) {
					var66 = var3.readShort();
					var5 = var3.readUnsignedByte();
					if (var66 == -1) {
						class200.topLevelWorldView.plane = var5;
						class376.worldView = class200.topLevelWorldView;
					} else {
						WorldEntity var97 = (WorldEntity)class200.topLevelWorldView.worldEntities.get((long)var66);
						if (var97 == null) {
							throw new RuntimeException("No valid ClientWorldEntity with ID " + var66);
						}

						var97.worldView.plane = var5;
						class376.worldView = var97.worldView;
					}

					var1.serverPacket = null;
					return true;
				}

				long var27;
				if (ServerPacket.IF_RESYNC == var1.serverPacket) {
					var66 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.method1814(false);
						class133.method3315(rootInterface);
						SecureRandomCallable.runWidgetOnLoadListener(rootInterface);

						for (var7 = 0; var7 < 100; ++var7) {
							validRootWidgets[var7] = true;
						}
					}

					InterfaceParent var90;
					for (; var6-- > 0; var90.field1088 = true) {
						var7 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var9 = var3.readUnsignedByte();
						var90 = (InterfaceParent)interfaceParents.get((long)var7);
						if (var90 != null && var8 != var90.group) {
							class33.closeInterface(var90, true);
							var90 = null;
						}

						if (var90 == null) {
							var90 = Login.openInterface(var7, var8, var9);
						}
					}

					for (var78 = (InterfaceParent)interfaceParents.first(); var78 != null; var78 = (InterfaceParent)interfaceParents.next()) {
						if (var78.field1088) {
							var78.field1088 = false;
						} else {
							class33.closeInterface(var78, true);
						}
					}

					widgetFlags = new NodeHashTable(512);

					while (var3.offset < var66) {
						var7 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var9 = var3.readUnsignedShort();
						var10 = var3.readInt();

						for (var11 = var8; var11 <= var9; ++var11) {
							var27 = (long)var11 + ((long)var7 << 32);
							widgetFlags.put(new IntegerNode(var10), var27);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PING_STATISTICS_REQUEST == var1.serverPacket) {
					var66 = var3.readInt();
					var5 = var3.readInt();
					var6 = UserComparator7.getGcDuration();
					PacketBufferNode var83 = class272.getPacketBufferNode(ClientPacket.PING_STATISTICS, packetWriter.isaacCipher);
					var83.packetBuffer.writeByteAdd(GameEngine.fps);
					var83.packetBuffer.writeIntIME(var66);
					var83.packetBuffer.writeIntLE(var5);
					var83.packetBuffer.writeByteNeg(var6);
					packetWriter.addNode(var83);
					var1.serverPacket = null;
					return true;
				}

				Widget var23;
				boolean var59;
				if (ServerPacket.IF_SET_PLAYERMODEL_SELF == var1.serverPacket) {
					var66 = var3.readInt();
					var59 = var3.readUnsignedByteSub() == 1;
					var23 = class376.widgetDefinition.method6918(var66);
					var23.method7337(class132.localPlayer.appearance, var59);
					MilliClock.invalidateWidget(var23);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_FRIENDLIST == var1.serverPacket) {
					SoundCache.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field714 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				NPC var25;
				if (ServerPacket.NPC_SPOTANIM == var1.serverPacket) {
					var66 = var3.readUnsignedShort();
					var25 = (NPC)class376.worldView.npcs.get((long)var66);
					var5 = var3.readUnsignedIntIME();
					var7 = var3.readUnsignedByteSub();
					var6 = var3.readUnsignedShortAddLE();
					if (var25 != null) {
						var25.updateSpotAnimation(var7, var6, var5 >> 16, var5 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_IGNORELIST == var1.serverPacket) {
					SoundCache.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					KeyHandler.FriendSystem_invalidateIgnoreds();
					field714 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CLAN_CHANNEL_DELTA == var1.serverPacket) {
					field555 = cycleCntr;
					var67 = var3.readByte();
					class166 var86 = new class166(var3);
					ClanChannel var96;
					if (var67 >= 0) {
						var96 = currentClanChannels[var67];
					} else {
						var96 = HttpMethod.guestClanChannel;
					}

					if (var96 == null) {
						this.method1760(var67);
						var1.serverPacket = null;
						return true;
					}

					if (var86.field1841 > var96.field1858) {
						this.method1760(var67);
						var1.serverPacket = null;
						return true;
					}

					if (var86.field1841 < var96.field1858) {
						var1.serverPacket = null;
						return true;
					}

					var86.method3646(var96);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETMODEL == var1.serverPacket) {
					var66 = var3.readInt();
					var5 = var3.readUnsignedShort();
					var23 = class376.widgetDefinition.method6918(var66);
					if (var23.modelType != 1 || var5 != var23.modelId) {
						var23.modelType = 1;
						var23.modelId = var5;
						MilliClock.invalidateWidget(var23);
					}

					var1.serverPacket = null;
					return true;
				}

				boolean var21;
				if (ServerPacket.UPDATE_TRADING_POST == var1.serverPacket) {
					var21 = var3.readUnsignedByte() == 1;
					if (var21) {
						class168.field1856 = InterfaceParent.method2434() - var3.readLong();
						AABB.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						AABB.grandExchangeEvents = null;
					}

					field719 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3539 == var1.serverPacket) {
					PendingSpawn.field1200 = var3.readBoolean();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_PARTIAL == var1.serverPacket) {
					var66 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var66 < -70000) {
						var5 += 32768;
					}

					if (var66 >= 0) {
						var23 = class376.widgetDefinition.method6918(var66);
					} else {
						var23 = null;
					}

					for (; var3.offset < var1.serverPacketLength; class173.itemContainerSetItem(var5, var7, var8 - 1, var9)) {
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
						MilliClock.invalidateWidget(var23);
					}

					class478.method9065();
					changedItemContainers[++field797 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_FULL == var1.serverPacket) {
					var66 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var66 < -70000) {
						var5 += 32768;
					}

					if (var66 >= 0) {
						var23 = class376.widgetDefinition.method6918(var66);
					} else {
						var23 = null;
					}

					if (var23 != null) {
						for (var7 = 0; var7 < var23.itemIds.length; ++var7) {
							var23.itemIds[var7] = 0;
							var23.itemQuantities[var7] = 0;
						}
					}

					NPCComposition.clearItemContainer(var5);
					var7 = var3.readUnsignedShort();

					for (var8 = 0; var8 < var7; ++var8) {
						var9 = var3.readUnsignedShortAddLE();
						var10 = var3.readUnsignedByte();
						if (var10 == 255) {
							var10 = var3.readInt();
						}

						if (var23 != null && var8 < var23.itemIds.length) {
							var23.itemIds[var8] = var9;
							var23.itemQuantities[var8] = var10;
						}

						class173.itemContainerSetItem(var5, var8, var9 - 1, var10);
					}

					if (var23 != null) {
						MilliClock.invalidateWidget(var23);
					}

					class478.method9065();
					changedItemContainers[++field797 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3639 == var1.serverPacket) {
					var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOC_ADD_CHANGE == var1.serverPacket) {
					class72.method2185(class325.field3482);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETNPCHEAD == var1.serverPacket) {
					var66 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedIntIME();
					var23 = class376.widgetDefinition.method6918(var5);
					if (var23.modelType != 2 || var66 != var23.modelId) {
						var23.modelType = 2;
						var23.modelId = var66;
						MilliClock.invalidateWidget(var23);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_REBOOT_TIMER == var1.serverPacket) {
					rebootTimer = var3.readUnsignedShortAddLE() * 30;
					field720 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				int var15;
				int var16;
				String var35;
				if (ServerPacket.MESSAGE_FRIENDS_CHAT == var1.serverPacket) {
					var67 = var3.readByte();
					var22 = var3.readStringCp1252NullTerminated();
					long var29 = (long)var3.readUnsignedShort();
					long var31 = (long)var3.readMedium();
					PlayerType var87 = (PlayerType)class454.findEnumerated(SpriteMask.PlayerType_values(), var3.readUnsignedByte());
					long var33 = (var29 << 32) + var31;
					boolean var65 = false;
					ClanChannel var14 = null;
					var14 = var67 >= 0 ? currentClanChannels[var67] : HttpMethod.guestClanChannel;
					if (var14 == null) {
						var65 = true;
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var87.isUser && SoundCache.friendSystem.isIgnored(new Username(var22, class280.loginType))) {
									var65 = true;
								}
								break;
							}

							if (crossWorldMessageIds[var15] == var33) {
								var65 = true;
								break;
							}

							++var15;
						}
					}

					if (!var65) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var33;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var35 = AbstractFont.escapeBrackets(FloorOverlayDefinition.method4294(var3));
						var16 = var67 >= 0 ? 41 : 44;
						if (var87.modIcon != -1) {
							ScriptFrame.addChatMessage(var16, BZip2State.method10506(var87.modIcon) + var22, var35, var14.name);
						} else {
							ScriptFrame.addChatMessage(var16, var22, var35, var14.name);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3587 == var1.serverPacket) {
					Actor.method2603(class200.topLevelWorldView, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_MOVE_TO == var1.serverPacket) {
					isCameraLocked = true;
					field781 = false;
					field552 = false;
					ItemLayer.field2525 = var3.readUnsignedByte();
					GraphicsDefaults.field5219 = var3.readUnsignedByte();
					WorldMapSection1.field3329 = var3.readUnsignedShort();
					ItemContainer.field1069 = var3.readUnsignedByte();
					FloatProjection.field2789 = var3.readUnsignedByte();
					if (FloatProjection.field2789 >= 100) {
						class181.cameraX = Coord.method6905(ItemLayer.field2525);
						ApproximateRouteStrategy.cameraZ = Coord.method6905(GraphicsDefaults.field5219);
						GrandExchangeOfferUnitPriceComparator.cameraY = DevicePcmPlayerProvider.getTileHeight(class200.topLevelWorldView, class181.cameraX, ApproximateRouteStrategy.cameraZ, class200.topLevelWorldView.plane) - WorldMapSection1.field3329;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED == var1.serverPacket) {
					WorldMapSection0.field3263 = var3.readUnsignedByteSub();
					field591 = var3.readUnsignedByte();
					class477.field5082 = var3.readUnsignedByte();

					while (var3.offset < var1.serverPacketLength) {
						var66 = var3.readUnsignedByte();
						class325 var84 = class143.method3406()[var66];
						class72.method2185(var84);
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var24;
				if (ServerPacket.IF_SET_ROTATE_SPEED == var1.serverPacket) {
					var66 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedIntLE();
					var6 = var3.readUnsignedShortAdd();
					var24 = class376.widgetDefinition.method6918(var5);
					var24.field3988 = var66 + (var6 << 16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OCULUS_SYNC == var1.serverPacket) {
					var66 = var3.readInt();
					if (var66 != revision) {
						revision = var66;
						Occluder.method5202();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETOBJECT == var1.serverPacket) {
					var66 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShortAddLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.readUnsignedIntLE();
					var24 = class376.widgetDefinition.method6918(var6);
					ItemComposition var88;
					if (!var24.isIf3) {
						if (var5 == -1) {
							var24.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var88 = class138.ItemDefinition_get(var5).getCountObj(var66);
						var24.modelType = 4;
						var24.modelId = var5;
						var24.modelAngleX = var88.xan2d;
						var24.modelAngleY = var88.yan2d;
						var24.modelZoom = var88.zoom2d * 100 / var66;
						MilliClock.invalidateWidget(var24);
					} else {
						var24.itemId = var5;
						var24.itemQuantity = var66;
						var88 = class138.ItemDefinition_get(var5).getCountObj(var66);
						var24.modelAngleX = var88.xan2d;
						var24.modelAngleY = var88.yan2d;
						var24.modelAngleZ = var88.zan2d;
						var24.modelOffsetX = var88.offsetX2d;
						var24.modelOffsetY = var88.offsetY2d;
						var24.modelZoom = var88.zoom2d;
						if (var88.isStackable == 1) {
							var24.itemQuantityMode = 1;
						} else {
							var24.itemQuantityMode = 2;
						}

						if (var24.field3987 > 0) {
							var24.modelZoom = var24.modelZoom * 32 / var24.field3987;
						} else if (var24.rawWidth > 0) {
							var24.modelZoom = var24.modelZoom * 32 / var24.rawWidth;
						}

						MilliClock.invalidateWidget(var24);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_ANIM_SPECIFIC == var1.serverPacket) {
					var66 = var3.readUnsignedByteNeg();
					var5 = var3.readUnsignedShortAdd();
					if (var5 == 65535) {
						var5 = -1;
					}

					RestClientThreadFactory.performPlayerAnimation(class132.localPlayer, var5, var66);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VAR_CLAN_ENABLE == var1.serverPacket) {
					EnumComposition.field2010 = new class509(class328.field3644);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_PLAYERMODEL_OBJ == var1.serverPacket) {
					var66 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedIntIME();
					var23 = class376.widgetDefinition.method6918(var5);
					var23.field3981.method6957(var66);
					MilliClock.invalidateWidget(var23);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_FRIEND_CHAT_CHANNEL_SINGLE_USER == var1.serverPacket) {
					return this.method1554(var1);
				}

				Widget var82;
				if (ServerPacket.IF_SETANGLE == var1.serverPacket) {
					var66 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedShortAdd();
					var6 = var3.readUnsignedIntIME();
					var7 = var3.readUnsignedShort();
					var82 = class376.widgetDefinition.method6918(var6);
					if (var7 != var82.modelAngleX || var66 != var82.modelAngleY || var5 != var82.modelZoom) {
						var82.modelAngleX = var7;
						var82.modelAngleY = var66;
						var82.modelZoom = var5;
						MilliClock.invalidateWidget(var82);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_PRIVCHATMODE == var1.serverPacket) {
					class521.privateChatMode = DbRowType.method10133(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3556 == var1.serverPacket) {
					var3.readUnsignedByte();
					var3.readShort();
					var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				long var36;
				if (ServerPacket.IF_SET_EVENTS == var1.serverPacket) {
					var66 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShortAdd();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.readUnsignedShortAddLE();
					if (var6 == 65535) {
						var6 = -1;
					}

					var7 = var3.readUnsignedIntIME();

					for (var8 = var6; var8 <= var5; ++var8) {
						var36 = ((long)var66 << 32) + (long)var8;
						Node var99 = widgetFlags.get(var36);
						if (var99 != null) {
							var99.remove();
						}

						widgetFlags.put(new IntegerNode(var7), var36);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VARP_LARGE == var1.serverPacket) {
					var66 = var3.readInt();
					var5 = var3.readUnsignedShort();
					Varps.Varps_temp[var5] = var66;
					if (Varps.Varps_main[var5] != var66) {
						Varps.Varps_main[var5] = var66;
					}

					DevicePcmPlayerProvider.changeGameOptions(var5);
					changedVarps[++changedVarpCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_JINGLE == var1.serverPacket) {
					var66 = var3.readMedium();
					var5 = var3.readUnsignedShortLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					class466.method8895(var5, var66);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_SMOOTH_RESET == var1.serverPacket && isCameraLocked) {
					field781 = true;
					field776 = false;
					field552 = false;

					for (var66 = 0; var66 < 5; ++var66) {
						field523[var66] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.TRIGGER_ONDIALOG_ABORT == var1.serverPacket) {
					if (rootInterface != -1) {
						UrlRequester.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3594 == var1.serverPacket) {
					class519.field5270 = var3.readUnsignedByte();
					Canvas.field100 = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_OPENTOP == var1.serverPacket) {
					var66 = var3.readUnsignedShortLE();
					if (var66 == 65535) {
						var66 = -1;
					}

					rootInterface = var66;
					this.method1814(false);
					class133.method3315(var66);
					SecureRandomCallable.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						validRootWidgets[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_SETANGLE == var1.serverPacket) {
					isCameraLocked = true;
					field781 = false;
					field776 = false;
					Decimator.field399 = var3.readUnsignedByte();
					GameObject.field3039 = var3.readUnsignedByte();
					FloorOverlayDefinition.field2345 = var3.readUnsignedShort();
					User.field5125 = var3.readUnsignedByte();
					MusicPatch.field3764 = var3.readUnsignedByte();
					if (MusicPatch.field3764 >= 100) {
						var66 = Coord.method6905(Decimator.field399);
						var5 = Coord.method6905(GameObject.field3039);
						var6 = DevicePcmPlayerProvider.getTileHeight(class200.topLevelWorldView, var66, var5, class200.topLevelWorldView.plane) - FloorOverlayDefinition.field2345;
						var7 = var66 - class181.cameraX;
						var8 = var6 - GrandExchangeOfferUnitPriceComparator.cameraY;
						var9 = var5 - ApproximateRouteStrategy.cameraZ;
						var10 = (int)Math.sqrt((double)(var9 * var9 + var7 * var7));
						class59.cameraPitch = (int)(Math.atan2((double)var8, (double)var10) * 325.9490051269531D) & 2047;
						FloorDecoration.cameraYaw = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531D) & 2047;
						if (class59.cameraPitch < 128) {
							class59.cameraPitch = 128;
						}

						if (class59.cameraPitch > 383) {
							class59.cameraPitch = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VAR_CLAN_DISABLE == var1.serverPacket) {
					EnumComposition.field2010 = null;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETCOLOUR == var1.serverPacket) {
					var66 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedShortAddLE();
					var6 = var5 >> 10 & 31;
					var7 = var5 >> 5 & 31;
					var8 = var5 & 31;
					var9 = (var7 << 11) + (var6 << 19) + (var8 << 3);
					Widget var85 = class376.widgetDefinition.method6918(var66);
					if (var9 != var85.color) {
						var85.color = var9;
						MilliClock.invalidateWidget(var85);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SWAP == var1.serverPacket) {
					var66 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedShortAdd();
					var6 = var3.readUnsignedShortAddLE();
					var7 = var3.readUnsignedShortAdd();
					Projectile.method2302(var66, var5, var6, var7);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_RUN_WEIGHT == var1.serverPacket) {
					class478.method9065();
					weight = var3.readShort();
					field720 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_STOP_TRANSIT == var1.serverPacket) {
					var66 = var3.readUnsignedShortAddLE();
					AttackOption.method2950(var66);
					changedItemContainers[++field797 - 1 & 31] = var66 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MAP_PROJANIM == var1.serverPacket) {
					class72.method2185(class325.field3494);
					var1.serverPacket = null;
					return true;
				}

				int var13;
				long var39;
				long var41;
				String var44;
				int var102;
				if (ServerPacket.MESSAGE_CLAN_CHANNEL_SYSTEM == var1.serverPacket) {
					var67 = var3.readByte();
					var39 = (long)var3.readUnsignedShort();
					var41 = (long)var3.readMedium();
					var36 = (var39 << 32) + var41;
					var61 = false;
					ClanChannel var100 = var67 >= 0 ? currentClanChannels[var67] : HttpMethod.guestClanChannel;
					if (var100 == null) {
						var61 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) {
							if (crossWorldMessageIds[var13] == var36) {
								var61 = true;
								break;
							}
						}
					}

					if (!var61) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var36;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var44 = FloorOverlayDefinition.method4294(var3);
						var102 = var67 >= 0 ? 43 : 46;
						ScriptFrame.addChatMessage(var102, "", var44, var100.name);
					}

					var1.serverPacket = null;
					return true;
				}

				String var51;
				if (ServerPacket.RUNCLIENTSCRIPT == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					Object[] var81 = new Object[var51.length() + 1];

					for (var6 = var51.length() - 1; var6 >= 0; --var6) {
						if (var51.charAt(var6) == 's') {
							var81[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var81[var6 + 1] = new Integer(var3.readInt());
						}
					}

					var81[0] = new Integer(var3.readInt());
					ScriptEvent var95 = new ScriptEvent();
					var95.args = var81;
					MilliClock.runScriptEvent(var95);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_MOVESUB == var1.serverPacket) {
					var66 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedIntME();
					InterfaceParent var94 = (InterfaceParent)interfaceParents.get((long)var66);
					var78 = (InterfaceParent)interfaceParents.get((long)var5);
					if (var78 != null) {
						class33.closeInterface(var78, var94 == null || var94.group != var78.group);
					}

					if (var94 != null) {
						var94.remove();
						interfaceParents.put(var94, (long)var5);
					}

					var82 = class376.widgetDefinition.method6918(var66);
					if (var82 != null) {
						MilliClock.invalidateWidget(var82);
					}

					var82 = class376.widgetDefinition.method6918(var5);
					if (var82 != null) {
						MilliClock.invalidateWidget(var82);
						class95.revalidateWidgetScroll(class376.widgetDefinition.Widget_interfaceComponents[var82.id >>> 16], var82, true);
					}

					if (rootInterface != -1) {
						UrlRequester.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_PRIVATE == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					var39 = (long)var3.readUnsignedShort();
					var41 = (long)var3.readMedium();
					PlayerType var101 = (PlayerType)class454.findEnumerated(SpriteMask.PlayerType_values(), var3.readUnsignedByte());
					long var47 = (var39 << 32) + var41;
					var62 = false;

					for (var13 = 0; var13 < 100; ++var13) {
						if (crossWorldMessageIds[var13] == var47) {
							var62 = true;
							break;
						}
					}

					if (SoundCache.friendSystem.isIgnored(new Username(var51, class280.loginType))) {
						var62 = true;
					}

					if (!var62 && field637 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var47;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var44 = AbstractFont.escapeBrackets(FloorDecoration.method4731(FloorOverlayDefinition.method4294(var3)));
						byte var103;
						if (var101.isPrivileged) {
							var103 = 7;
						} else {
							var103 = 3;
						}

						if (var101.modIcon != -1) {
							LoginPacket.addGameMessage(var103, BZip2State.method10506(var101.modIcon) + var51, var44);
						} else {
							LoginPacket.addGameMessage(var103, var51, var44);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3516 == var1.serverPacket) {
					var66 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedShort();
					class478.queueSoundEffect(var66, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_PLAYER_OP == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					var5 = var3.readUnsignedByteSub();
					var6 = var3.readUnsignedByteNeg();
					if (var6 >= 1 && var6 <= 8) {
						if (var51.equalsIgnoreCase("null")) {
							var51 = null;
						}

						playerMenuActions[var6 - 1] = var51;
						playerOptionsPriorities[var6 - 1] = var5 == 0;
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
						var56.field836 = "beta";
						SecureRandomFuture.field1011 = true;
					} else {
						SecureRandomFuture.field1011 = false;
					}

					class511.updateGameState(45);
					var2.close();
					var2 = null;
					ApproximateRouteStrategy.changeWorld(var56);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.REBUILD_REGION == var1.serverPacket) {
					class370.loadRegions(true, var1.packetBuffer);
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

				if (ServerPacket.UPDATE_ZONE_FULL_FOLLOWS == var1.serverPacket) {
					field591 = var3.readUnsignedByteAdd();
					class477.field5082 = var3.readUnsignedByteSub();
					WorldMapSection0.field3263 = var3.readUnsignedByteAdd();

					for (var66 = WorldMapSection0.field3263; var66 < WorldMapSection0.field3263 + 8; ++var66) {
						for (var5 = class477.field5082; var5 < class477.field5082 + 8; ++var5) {
							if (class376.worldView.groundItems[field591][var66][var5] != null) {
								class376.worldView.groundItems[field591][var66][var5] = null;
								Language.updateItemPile(field591, var66, var5);
							}
						}
					}

					for (PendingSpawn var55 = (PendingSpawn)class376.worldView.pendingSpawns.last(); var55 != null; var55 = (PendingSpawn)class376.worldView.pendingSpawns.previous()) {
						if (var55.x >= WorldMapSection0.field3263 && var55.x < WorldMapSection0.field3263 + 8 && var55.y >= class477.field5082 && var55.y < class477.field5082 + 8 && var55.plane == field591) {
							var55.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_SHAKE == var1.serverPacket) {
					var66 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedByte();
					var7 = var3.readUnsignedByte();
					field523[var66] = true;
					field783[var66] = var5;
					field784[var66] = var6;
					field785[var66] = var7;
					field786[var66] = 0;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RESET_INTERACTION_MODE == var1.serverPacket) {
					var66 = var3.readShort();
					worldViewManager.method2553(var66);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RESET_CLIENT_VARCACHE == var1.serverPacket) {
					for (var66 = 0; var66 < VarpDefinition.field1924; ++var66) {
						VarpDefinition var79 = Login.VarpDefinition_get(var66);
						if (var79 != null) {
							Varps.Varps_temp[var66] = 0;
							Varps.Varps_main[var66] = 0;
						}
					}

					class478.method9065();
					changedVarpCount += 32;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VAR_CLAN == var1.serverPacket) {
					if (EnumComposition.field2010 == null) {
						EnumComposition.field2010 = new class509(class328.field3644);
					}

					class578 var54 = class328.field3644.method9534(var3);
					EnumComposition.field2010.field5243.vmethod9940(var54.field5637, var54.field5638);
					field531[++field712 - 1 & 31] = var54.field5637;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_PRIVATE_ECHO == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					var22 = AbstractFont.escapeBrackets(FloorDecoration.method4731(FloorOverlayDefinition.method4294(var3)));
					LoginPacket.addGameMessage(6, var51, var22);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETANIM == var1.serverPacket) {
					var66 = var3.readSignedShort();
					var5 = var3.readInt();
					var23 = class376.widgetDefinition.method6918(var5);
					if (var66 != var23.sequenceId || var66 == -1) {
						var23.sequenceId = var66;
						var23.modelFrame = 0;
						var23.modelFrameCycle = 0;
						MilliClock.invalidateWidget(var23);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OBJ_DEL == var1.serverPacket) {
					class72.method2185(class325.field3492);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.HEAT_MAP == var1.serverPacket) {
					var21 = var3.readBoolean();
					if (var21) {
						if (field810 == null) {
							field810 = new class413();
						}
					} else {
						field810 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.GRAPHICSOBJECT_SPAWN == var1.serverPacket) {
					var6 = var3.method10280();
					var66 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var7 = var66 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					var11 = var3.readUnsignedShortAddLE();
					var10 = var3.readUnsignedByte();
					var9 = var3.readUnsignedShortLE();
					if (var7 >= 0 && var8 >= 0 && var7 < class376.worldView.sizeX && var8 < class376.worldView.sizeY) {
						var7 = Coord.method6905(var7);
						var8 = Coord.method6905(var8);
						GraphicsObject var43 = new GraphicsObject(var9, class376.worldView.plane, var7, var8, DevicePcmPlayerProvider.getTileHeight(class376.worldView, var7, var8, class376.worldView.plane) - var10, var11, cycle);
						class376.worldView.graphicsObjects.addFirst(var43);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_LOOKAT == var1.serverPacket) {
					isCameraLocked = true;
					field781 = false;
					field776 = true;
					var66 = class268.method5583(var3.readShort() & 2027);
					var5 = MouseHandler.method649(var3.readShort() & 2027);
					var6 = var3.readUnsignedShort();
					var7 = var3.readUnsignedByte();
					field791 = new class534(class59.cameraPitch, var5, var6, var7);
					field596 = new class534(FloorDecoration.cameraYaw, var66, var6, var7);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_RUN_ENERGY == var1.serverPacket) {
					class478.method9065();
					runEnergy = var3.readUnsignedShort();
					field720 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MINIMAP_TOGGLE == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_PLAYERMODEL_BASECOLOUR == var1.serverPacket) {
					var66 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedByteSub();
					var6 = var3.readUnsignedByteAdd();
					var24 = class376.widgetDefinition.method6918(var66);
					var24.field3981.method6963(var5, var6);
					MilliClock.invalidateWidget(var24);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OBJ_OPFILTER == var1.serverPacket) {
					class72.method2185(class325.field3490);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_INFO_SMALL_VIEWPORT == var1.serverPacket) {
					class145.updateNpcs(class376.worldView, true, var3);
					var1.serverPacket = null;
					return true;
				}

				Widget var69;
				if (ServerPacket.IF_SETPLAYERHEAD == var1.serverPacket) {
					var66 = var3.readInt();
					var69 = class376.widgetDefinition.method6918(var66);
					var69.modelType = 3;
					var69.modelId = class132.localPlayer.appearance.getChatHeadId();
					MilliClock.invalidateWidget(var69);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CLEAR_ENTITIES == var1.serverPacket) {
					class376.worldView.field1357.method9009();
					class376.worldView.field1355.method9009();
					class376.worldView.npcs.clear();
					class376.worldView.worldEntities.clear();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.FRIENDS_LIST_LOADED == var1.serverPacket) {
					SoundCache.friendSystem.method1891();
					field714 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SERVER_TICK_END == var1.serverPacket) {
					++serverCycle;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RESET_ANIMS == var1.serverPacket) {
					Player var75;
					for (Iterator var53 = class376.worldView.players.iterator(); var53.hasNext(); var75.sequence = -1) {
						var75 = (Player)var53.next();
					}

					NPC var91;
					for (Iterator var76 = class376.worldView.npcs.iterator(); var76.hasNext(); var91.sequence = -1) {
						var91 = (NPC)var76.next();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3577 == var1.serverPacket) {
					class7.field23 = var3.readBoolean();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CHAT_FILTER_SETTINGS == var1.serverPacket) {
					publicChatMode = var3.readUnsignedByteAdd();
					tradeChatMode = var3.readUnsignedByteNeg();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETSCROLLPOS == var1.serverPacket) {
					var66 = var3.readUnsignedIntLE();
					var5 = var3.readUnsignedShort();
					var23 = class376.widgetDefinition.method6918(var66);
					if (var23 != null && var23.type == 0) {
						if (var5 > var23.scrollHeight - var23.height * 1836304183) {
							var5 = var23.scrollHeight - var23.height * 1836304183;
						}

						if (var5 < 0) {
							var5 = 0;
						}

						if (var5 != var23.scrollY) {
							var23.scrollY = var5;
							MilliClock.invalidateWidget(var23);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SONG == var1.serverPacket) {
					var6 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedShortLE();
					var66 = var3.readUnsignedShortAdd();
					var8 = var3.readUnsignedShortAdd();
					var7 = var3.readUnsignedShortAddLE();
					if (var66 == 65535) {
						var66 = -1;
					}

					ArrayList var46 = new ArrayList();
					var46.add(var66);
					FloorOverlayDefinition.playSong(var46, var5, var6, var7, var8);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SONG_WITH_SECONDARY == var1.serverPacket) {
					var6 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedShortAddLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					var7 = var3.readUnsignedShortLE();
					var9 = var3.readUnsignedShortAddLE();
					var8 = var3.readUnsignedShortAdd();
					var66 = var3.readUnsignedShortLE();
					if (var66 == 65535) {
						var66 = -1;
					}

					ArrayList var26 = new ArrayList();
					var26.add(var66);
					var26.add(var5);
					FloorOverlayDefinition.playSong(var26, var6, var7, var8, var9);
					var1.serverPacket = null;
					return true;
				}

				String var72;
				if (ServerPacket.MESSAGE_GAME == var1.serverPacket) {
					var66 = var3.readUShortSmart();
					var59 = var3.readUnsignedByte() == 1;
					var72 = "";
					boolean var57 = false;
					if (var59) {
						var72 = var3.readStringCp1252NullTerminated();
						if (SoundCache.friendSystem.isIgnored(new Username(var72, class280.loginType))) {
							var57 = true;
						}
					}

					String var80 = var3.readStringCp1252NullTerminated();
					if (!var57) {
						LoginPacket.addGameMessage(var66, var72, var80);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOC_DEL == var1.serverPacket) {
					class72.method2185(class325.field3484);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PROJECTILE_SPAWN == var1.serverPacket) {
					var13 = var3.readUnsignedByteNeg() * 4;
					var6 = var3.method10416();
					var66 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var7 = var66 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					var11 = var3.method10324();
					var16 = var3.readUnsignedShortAddLE();
					byte var60 = var3.readByte();
					var102 = var3.readUnsignedByteNeg() * 4;
					var12 = var3.readUnsignedShortAdd();
					int var19 = var3.method10324();
					int var18 = var3.readUnsignedShortLE();
					var15 = var3.readUnsignedShortAdd();
					byte var58 = var3.readByteNeg();
					int var17 = var3.readUnsignedByte();
					var9 = var58 + var7;
					var10 = var60 + var8;
					if (0 <= var7 && var7 < 104 && 0 <= var8 && var8 < 104 && 0 <= var9 && var9 < 104 && 0 <= var10 && var10 < 104 && var12 != 65535) {
						var7 = Coord.method6905(var7);
						var8 = Coord.method6905(var8);
						var9 = Coord.method6905(var9);
						var10 = Coord.method6905(var10);
						Projectile var20 = new Projectile(var12, class376.worldView.plane, var7, var8, DevicePcmPlayerProvider.getTileHeight(class376.worldView, var7, var8, class376.worldView.plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var19, var11, var102);
						var20.setDestination(var9, var10, DevicePcmPlayerProvider.getTileHeight(class376.worldView, var9, var10, class376.worldView.plane) - var102, var15 + cycle);
						class376.worldView.projectiles.addFirst(var20);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOC_MERGEPLAYER == var1.serverPacket) {
					class72.method2185(class325.field3491);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_CLOSESUB == var1.serverPacket) {
					var66 = var3.readInt();
					InterfaceParent var73 = (InterfaceParent)interfaceParents.get((long)var66);
					if (var73 != null) {
						class33.closeInterface(var73, true);
					}

					if (meslayerContinueWidget != null) {
						MilliClock.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_RESET == var1.serverPacket) {
					field781 = false;
					isCameraLocked = false;
					field552 = false;
					field776 = false;
					Decimator.field399 = 0;
					GameObject.field3039 = 0;
					FloorOverlayDefinition.field2345 = 0;
					field777 = false;
					User.field5125 = 0;
					MusicPatch.field3764 = 0;
					FloatProjection.field2789 = 0;
					ItemContainer.field1069 = 0;
					ItemLayer.field2525 = 0;
					GraphicsDefaults.field5219 = 0;
					WorldMapSection1.field3329 = 0;
					field779 = null;
					field791 = null;
					field596 = null;

					for (var66 = 0; var66 < 5; ++var66) {
						field523[var66] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_INFO == var1.serverPacket) {
					playerUpdateManager.method2988(var3, var1.serverPacketLength);
					UserComparator4.method3177();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_SITE_SETTINGS == var1.serverPacket) {
					class348.method6848(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_TEXT == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					var5 = var3.readInt();
					var23 = class376.widgetDefinition.method6918(var5);
					if (!var51.equals(var23.text)) {
						var23.text = var51;
						MilliClock.invalidateWidget(var23);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_WORLDENTITY == var1.serverPacket) {
					TileItem.updateWorldEntitiesFromPacketBuffer(class376.worldView, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3596 == var1.serverPacket) {
					class496.field5164 = var3.readBoolean();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETNPCHEAD_ACTIVE == var1.serverPacket) {
					var66 = var3.readInt();
					var5 = var3.readUnsignedShortLE();
					var23 = class376.widgetDefinition.method6918(var66);
					if (var23.modelType != 6 || var5 != var23.modelId) {
						var23.modelType = 6;
						var23.modelId = var5;
						MilliClock.invalidateWidget(var23);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOC_ANIM == var1.serverPacket) {
					class72.method2185(class325.field3485);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_NORMAL == var1.serverPacket) {
					class370.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_SET_SEQUENCE == var1.serverPacket) {
					var66 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedShort();
					var6 = var3.readUnsignedByteSub();
					if (var5 == 65535) {
						var5 = -1;
					}

					NPC var77 = (NPC)class376.worldView.npcs.get((long)var66);
					if (var77 != null) {
						if (var5 == var77.sequence && var5 != -1) {
							var8 = WorldMapData_1.SequenceDefinition_get(var5).restartMode;
							if (var8 == 1) {
								var77.sequenceFrame = 0;
								var77.sequenceFrameCycle = 0;
								var77.sequenceDelay = var6;
								var77.field1255 = 0;
							} else if (var8 == 2) {
								var77.field1255 = 0;
							}
						} else if (var5 == -1 || var77.sequence == -1 || WorldMapData_1.SequenceDefinition_get(var5).field2368 >= WorldMapData_1.SequenceDefinition_get(var77.sequence).field2368) {
							var77.sequence = var5;
							var77.sequenceFrame = 0;
							var77.sequenceFrameCycle = 0;
							var77.sequenceDelay = var6;
							var77.field1255 = 0;
							var77.field1291 = var77.pathLength;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SET_PLAYERMODEL_BODYTYPE == var1.serverPacket) {
					var66 = var3.readUnsignedByte();
					var5 = var3.readUnsignedIntIME();
					var23 = class376.widgetDefinition.method6918(var5);
					var23.field3981.method6974(class132.localPlayer.appearance.gender, var66);
					MilliClock.invalidateWidget(var23);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOGOUT_FULL == var1.serverPacket) {
					class60.logOut();
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.CAM_LOOKAT_EASED_COORD == var1.serverPacket) {
					isCameraLocked = true;
					field781 = false;
					field776 = true;
					Decimator.field399 = var3.readUnsignedByte();
					GameObject.field3039 = var3.readUnsignedByte();
					FloorOverlayDefinition.field2345 = var3.readUnsignedShort();
					var66 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = Coord.method6905(Decimator.field399);
					var7 = Coord.method6905(GameObject.field3039);
					var8 = DevicePcmPlayerProvider.getTileHeight(class200.topLevelWorldView, var6, var7, class200.topLevelWorldView.plane) - FloorOverlayDefinition.field2345;
					var9 = var6 - class181.cameraX;
					var10 = var8 - GrandExchangeOfferUnitPriceComparator.cameraY;
					var11 = var7 - ApproximateRouteStrategy.cameraZ;
					double var92 = Math.sqrt((double)(var9 * var9 + var11 * var11));
					var102 = MouseHandler.method649((int)(Math.atan2((double)var10, var92) * 325.9490051269531D) & 2047);
					var15 = class268.method5583((int)(Math.atan2((double)var9, (double)var11) * -325.9490051269531D) & 2047);
					field791 = new class534(class59.cameraPitch, var102, var66, var5);
					field596 = new class534(FloorDecoration.cameraYaw, var15, var66, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CLAN_SETTINGS_DELTA == var1.serverPacket) {
					PlayerUpdateManager.method3027();
					var67 = var3.readByte();
					class152 var71 = new class152(var3);
					ClanSettings var74;
					if (var67 >= 0) {
						var74 = currentClanSettings[var67];
					} else {
						var74 = class196.guestClanSettings;
					}

					if (var74 == null) {
						this.method1266(var67);
						var1.serverPacket = null;
						return true;
					}

					if (var71.field1739 > var74.field1791) {
						this.method1266(var67);
						var1.serverPacket = null;
						return true;
					}

					if (var71.field1739 < var74.field1791) {
						var1.serverPacket = null;
						return true;
					}

					var71.method3492(var74);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOGOUT == var1.serverPacket) {
					var66 = var3.readUnsignedByte();
					UserComparator9.forceDisconnect(var66);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.UPDATE_STAT == var1.serverPacket) {
					class478.method9065();
					var66 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedByteAdd();
					var6 = var3.readUnsignedByteNeg();
					var7 = var3.readUnsignedByteSub();
					experience[var5] = var66;
					currentLevels[var5] = var7;
					levels[var5] = 1;
					field662[var5] = var6;

					for (var8 = 0; var8 < 98; ++var8) {
						if (var66 >= Skills.Skills_experienceTable[var8]) {
							levels[var5] = var8 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CLAN_SETTINGS_FULL == var1.serverPacket) {
					PlayerUpdateManager.method3027();
					var67 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var67 >= 0) {
							currentClanSettings[var67] = null;
						} else {
							class196.guestClanSettings = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var67 >= 0) {
						currentClanSettings[var67] = new ClanSettings(var3);
					} else {
						class196.guestClanSettings = new ClanSettings(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.URL_OPEN == var1.serverPacket) {
					byte[] var52 = new byte[var1.serverPacketLength];
					var3.method10173(var52, 0, var52.length);
					Buffer var70 = new Buffer(var52);
					var72 = var70.readStringCp1252NullTerminated();
					class91.openURL(var72, true, false);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_LOOKAT_EASED_ANGLE_RELATIVE == var1.serverPacket) {
					isCameraLocked = true;
					field781 = false;
					field776 = true;
					var66 = var3.readShort();
					var5 = var3.readShort();
					var6 = MouseHandler.method649(var5 + class59.cameraPitch & 2027);
					var7 = var66 + FloorDecoration.cameraYaw;
					var8 = var3.readUnsignedShort();
					var9 = var3.readUnsignedByte();
					field791 = new class534(class59.cameraPitch, var6, var8, var9);
					field596 = new class534(FloorDecoration.cameraYaw, var7, var8, var9);
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

				if (ServerPacket.DYNAMICOBJECT_SPAWN == var1.serverPacket) {
					var6 = var3.method10416();
					var66 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var7 = var66 + (var6 >> 4 & 7);
					var8 = var5 + (var6 & 7);
					var9 = var3.readUnsignedByteSub();
					var10 = var9 >> 2;
					var11 = var9 & 3;
					var12 = field509[var10];
					var13 = var3.readUnsignedShortAddLE();
					if (0 <= var7 && var7 < 103 && 0 <= var8 && var8 < 103) {
						MouseRecorder.method2443(var7, var8, var10, var11, var12, var13);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_FRIEND_PRIVATE == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					var39 = var3.readLong();
					var41 = (long)var3.readUnsignedShort();
					var36 = (long)var3.readMedium();
					PlayerType var38 = (PlayerType)class454.findEnumerated(SpriteMask.PlayerType_values(), var3.readUnsignedByte());
					var27 = var36 + (var41 << 32);
					boolean var45 = false;

					for (var15 = 0; var15 < 100; ++var15) {
						if (crossWorldMessageIds[var15] == var27) {
							var45 = true;
							break;
						}
					}

					if (var38.isUser && SoundCache.friendSystem.isIgnored(new Username(var51, class280.loginType))) {
						var45 = true;
					}

					if (!var45 && field637 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var27;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var35 = AbstractFont.escapeBrackets(FloorDecoration.method4731(FloorOverlayDefinition.method4294(var3)));
						if (var38.modIcon != -1) {
							ScriptFrame.addChatMessage(9, BZip2State.method10506(var38.modIcon) + var51, var35, class217.base37DecodeLong(var39));
						} else {
							ScriptFrame.addChatMessage(9, var51, var35, class217.base37DecodeLong(var39));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_PARTIAL_FOLLOWS_LEVEL == var1.serverPacket) {
					class477.field5082 = var3.readUnsignedByteAdd();
					WorldMapSection0.field3263 = var3.readUnsignedByteAdd();
					field591 = var3.readUnsignedByteNeg();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OBJ_RESET_CUSTOMIZATION == var1.serverPacket) {
					class72.method2185(class325.field3489);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_HEADICON_SPECIFIC == var1.serverPacket) {
					short var68 = (short)var3.readShortLE();
					var5 = var3.readUnsignedShort();
					var6 = var3.readUnsignedByte();
					var7 = var3.readUnsignedIntME();
					var25 = (NPC)class376.worldView.npcs.get((long)var5);
					if (var25 != null) {
						var25.method2852(var6, var7, var68);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SONG_STOP == var1.serverPacket) {
					var66 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShort();
					class177.method3764(var66, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_FRIEND_CHAT_CHANNEL_FULL_V1 == var1.serverPacket) {
					return this.method1254(var1);
				}

				if (ServerPacket.VARP_SMALL == var1.serverPacket) {
					var67 = var3.readByteSub();
					var5 = var3.readUnsignedShortAddLE();
					Varps.Varps_temp[var5] = var67;
					if (Varps.Varps_main[var5] != var67) {
						Varps.Varps_main[var5] = var67;
					}

					DevicePcmPlayerProvider.changeGameOptions(var5);
					changedVarps[++changedVarpCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETPOSITION == var1.serverPacket) {
					var66 = var3.readUnsignedIntME();
					var5 = var3.method10278();
					var6 = var3.method10278();
					var24 = class376.widgetDefinition.method6918(var66);
					if (var6 != var24.rawX || var5 != var24.rawY || var24.xAlignment != 0 || var24.yAlignment != 0) {
						var24.rawX = var6;
						var24.rawY = var5;
						var24.xAlignment = 0;
						var24.yAlignment = 0;
						MilliClock.invalidateWidget(var24);
						this.alignWidget(var24);
						if (var24.type == 0) {
							class95.revalidateWidgetScroll(class376.widgetDefinition.Widget_interfaceComponents[var66 >> 16], var24, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_INFO_LARGE_VIEWPORT == var1.serverPacket) {
					class145.updateNpcs(class376.worldView, false, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_CLEAR == var1.serverPacket) {
					var66 = var3.readUnsignedIntIME();
					var69 = class376.widgetDefinition.method6918(var66);

					for (var6 = 0; var6 < var69.itemIds.length; ++var6) {
						var69.itemIds[var6] = -1;
						var69.itemIds[var6] = 0;
					}

					MilliClock.invalidateWidget(var69);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OBJ_COUNT == var1.serverPacket) {
					class72.method2185(class325.field3486);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3542 == var1.serverPacket) {
					field643 = var3.readStringCp1252NullTerminated();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_UID192 == var1.serverPacket) {
					var3.offset += 28;
					if (var3.checkCrc()) {
						SecureRandomCallable.method2411(var3, var3.offset - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3632 == var1.serverPacket) {
					SoundCache.field311 = (class377)class454.findEnumerated(class366.method7456(), var3.readUnsignedByte());
					if (class566.field5563 >= 229) {
						field645 = var3.readShort();
						field646 = var3.readUnsignedShort();
					} else {
						field645 = -1;
						field646 = var3.readUnsignedShort();
						var3.readShort();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.OBJ_SET_CUSTOMIZATION == var1.serverPacket) {
					class72.method2185(class325.field3493);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REFLECTION_CHECKER == var1.serverPacket) {
					class371.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETHIDE == var1.serverPacket) {
					var21 = var3.readUnsignedByteAdd() == 1;
					var5 = var3.readUnsignedIntIME();
					var23 = class376.widgetDefinition.method6918(var5);
					if (var21 != var23.isHidden) {
						var23.isHidden = var21;
						MilliClock.invalidateWidget(var23);
					}

					var1.serverPacket = null;
					return true;
				}

				class213.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1495 != null ? var1.field1495.id : -1) + "," + (var1.field1481 != null ? var1.field1481.id : -1) + "," + var1.serverPacketLength, (Throwable)null);
				class60.logOut();
			} catch (IOException var49) {
				class31.method413();
			} catch (Exception var50) {
				var22 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1495 != null ? var1.field1495.id : -1) + "," + (var1.field1481 != null ? var1.field1481.id : -1) + "," + var1.serverPacketLength + "," + (class132.localPlayer.pathX[0] + class200.topLevelWorldView.baseX) + "," + (class132.localPlayer.pathY[0] + class200.topLevelWorldView.baseY) + ",";

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) {
					var22 = var22 + var3.array[var6] + ",";
				}

				class213.RunException_sendStackTrace(var22, var50);
				class60.logOut();
			}

			return true;
		}
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-47"
	)
	@Export("menu")
	final void menu() {
		PacketBufferNode.method6509(menu);
		if (clickedWidget == null) {
			int var1 = MouseHandler.MouseHandler_lastButton;
			if (isMenuOpen) {
				if (var1 != 1 && (class466.mouseCam || var1 != 4) && !menu.method10873(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y)) {
					isMenuOpen = false;
					menu.invalidateWidgetsUnder();
				}

				if (var1 == 1 || !class466.mouseCam && var1 == 4) {
					menu.method10874(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					isMenuOpen = false;
					menu.invalidateWidgetsUnder();
				}
			} else if (menu.menuOptionsCount > 0) {
				int var2 = class332.method6534();
				if ((var1 == 1 || !class466.mouseCam && var1 == 4) && this.shouldLeftClickOpenMenu(menu.menuOpcodes[var2], menu.menuShiftClick[var2])) {
					var1 = 2;
				}

				if (var1 == 1 || !class466.mouseCam && var1 == 4) {
					menu.method10888(var2);
				}

				if (var1 == 2) {
					this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}
			}

		}
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(IZB)Z",
		garbageValue = "-16"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu(int var1, boolean var2) {
		return (leftClickOpensMenu && menu.menuOptionsCount > 2 || class241.method4853(var1)) && !var2;
	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1598106139"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		menu.method10871(var1, var2);
		Iterator var3 = worldViewManager.iterator();

		while (var3.hasNext()) {
			WorldView var4 = (WorldView)var3.next();
			var4.scene.menuOpen(false);
		}

		isMenuOpen = true;
		menu.method10875();
	}

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "894422949"
	)
	final void method1814(boolean var1) {
		class366.method7455(rootInterface, GameEngine.canvasWidth, SwapSongTask.canvasHeight, var1);
	}

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(Lnz;I)V",
		garbageValue = "-1933434082"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : class376.widgetDefinition.method6918(var1.parentId);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = GameEngine.canvasWidth;
			var4 = SwapSongTask.canvasHeight;
		} else {
			var3 = var2.width * 779142065;
			var4 = var2.height * 1836304183;
		}

		class569.alignWidgetSize(var1, var3, var4, false);
		KitDefinition.alignWidgetPosition(var1, var3, var4);
	}

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1670101793"
	)
	final void method1263() {
		MilliClock.invalidateWidget(clickedWidget);
		++class155.widgetDragDuration;
		int var1;
		int var2;
		if (field700 && field697) {
			var1 = MouseHandler.MouseHandler_x;
			var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field565) {
				var1 = field565;
			}

			if (var1 + clickedWidget.width * 779142065 > clickedWidgetParent.width * 779142065 + field565) {
				var1 = clickedWidgetParent.width * 779142065 + field565 - clickedWidget.width * 779142065;
			}

			if (var2 < field699) {
				var2 = field699;
			}

			if (var2 + clickedWidget.height * 1836304183 > clickedWidgetParent.height * 1836304183 + field699) {
				var2 = clickedWidgetParent.height * 1836304183 + field699 - clickedWidget.height * 1836304183;
			}

			int var3 = var1 - field701;
			int var4 = var2 - field702;
			int var5 = clickedWidget.dragZoneSize;
			if (class155.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}

			int var6 = var1 - field565 + clickedWidgetParent.scrollX;
			int var7 = var2 - field699 + clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = clickedWidget.onDrag;
				MilliClock.runScriptEvent(var8);
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
						MilliClock.runScriptEvent(var8);
					}

					if (draggedOnWidget != null && MusicPatchNode2.method6559(clickedWidget) != null) {
						PacketBufferNode var13 = class272.getPacketBufferNode(ClientPacket.OPHELDD, packetWriter.isaacCipher);
						var13.packetBuffer.writeShortLE(clickedWidget.childIndex);
						var13.packetBuffer.writeIntLE(draggedOnWidget.id);
						var13.packetBuffer.writeIntIME(clickedWidget.id);
						var13.packetBuffer.writeShortLE(clickedWidget.itemId);
						var13.packetBuffer.writeShort(draggedOnWidget.itemId);
						var13.packetBuffer.writeShortAddLE(draggedOnWidget.childIndex);
						packetWriter.addNode(var13);
					}
				} else if (class162.tempMenuAction != null && !this.shouldLeftClickOpenMenu(class162.tempMenuAction.opcode, class162.tempMenuAction.field930)) {
					if (menu.menuOptionsCount > 0) {
						int var11 = widgetClickX + field701;
						int var9 = widgetClickY + field702;
						MenuAction var10 = class162.tempMenuAction;
						if (var10 != null) {
							ItemComposition.menuAction(var10.param0, var10.param1, var10.opcode, var10.identifier, var10.itemId, var10.worldViewId, var10.action, var10.target, var11, var9);
						}

						class162.tempMenuAction = null;
					}
				} else {
					this.openMenu(widgetClickX + field701, field702 + widgetClickY);
				}

				clickedWidget = null;
			}

		} else {
			if (class155.widgetDragDuration > 1) {
				if (!isDraggingWidget && menu.menuOptionsCount > 0) {
					var1 = widgetClickX + field701;
					var2 = widgetClickY + field702;
					MenuAction var12 = class162.tempMenuAction;
					if (var12 != null) {
						ItemComposition.menuAction(var12.param0, var12.param1, var12.opcode, var12.identifier, var12.itemId, var12.worldViewId, var12.action, var12.target, var1, var2);
					}

					class162.tempMenuAction = null;
				}

				clickedWidget = null;
			}

		}
	}

	@ObfuscatedName("od")
	@ObfuscatedSignature(
		descriptor = "(B)Lwm;",
		garbageValue = "-53"
	)
	@Export("username")
	public Username username() {
		return class132.localPlayer != null ? class132.localPlayer.username : null;
	}

	@ObfuscatedName("pe")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-238320632"
	)
	void method1760(int var1) {
		PacketBufferNode var2 = class272.getPacketBufferNode(ClientPacket.CLAN_CHANNEL_FULL_REQUEST, packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(var1);
		packetWriter.addNode(var2);
	}

	@ObfuscatedName("pv")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-2752"
	)
	void method1266(int var1) {
		PacketBufferNode var2 = class272.getPacketBufferNode(ClientPacket.CLAN_SETTINGS_FULL_REQUEST, packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(var1);
		packetWriter.addNode(var2);
	}

	protected void finalize() throws Throwable {
		GameEngine.method618(this);
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

	public long getAccountHash() {
		return this.accountHash;
	}

	public boolean isOnLoginScreen() {
		return gameState == 10;
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
			ObjectComposition.method4206(10);
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
							Language var15;
							if (var4 >= 0 && var4 < Language.Language_valuesOrdered.length) {
								var15 = Language.Language_valuesOrdered[var4];
							} else {
								var15 = null;
							}

							class144.clientLanguage = var15;
							break;
						case 7:
							var4 = Integer.parseInt(var2);
							GameBuild[] var5 = new GameBuild[]{GameBuild.BUILDLIVE, GameBuild.RC, GameBuild.WIP, GameBuild.LIVE};
							GameBuild[] var6 = var5;
							int var7 = 0;

							GameBuild var14;
							while (true) {
								if (var7 >= var6.length) {
									var14 = null;
									break;
								}

								GameBuild var8 = var6[var7];
								if (var4 == var8.buildId) {
									var14 = var8;
									break;
								}

								++var7;
							}

							class241.field2662 = var14;
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) {
							}
							break;
						case 9:
							Sound.field1770 = var2;
							break;
						case 10:
							StudioGame[] var3 = new StudioGame[]{StudioGame.game5, StudioGame.game3, StudioGame.stellardawn, StudioGame.oldscape, StudioGame.runescape, StudioGame.game4};
							DevicePcmPlayerProvider.field93 = (StudioGame)class454.findEnumerated(var3, Integer.parseInt(var2));
							if (DevicePcmPlayerProvider.field93 == StudioGame.oldscape) {
								class280.loginType = LoginType.oldscape;
							} else {
								class280.loginType = LoginType.field5460;
							}
							break;
						case 11:
							class186.authServiceBaseUrl = var2;
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
							class535.field5358 = Integer.parseInt(var2);
							break;
						case 15:
							gameBuild = Integer.parseInt(var2);
							break;
						case 17:
							class510.field5244 = var2;
							break;
						case 21:
							field515 = Integer.parseInt(var2);
							break;
						case 22:
							class153.gameSessionServiceBaseUrl = var2;
							break;
						case 25:
							int var9 = var2.indexOf(".");
							if (var9 == -1) {
								class566.field5563 = Integer.parseInt(var2);
							} else {
								class566.field5563 = Integer.parseInt(var2.substring(0, var9));
								Integer.parseInt(var2.substring(var9 + 1));
							}
						}
					}
				}

				Scene.Scene_isLowDetail = false;
				isLowDetail = false;
				HttpResponse.worldHost = this.getCodeBase().getHost();
				AsyncHttpResponse.field77 = new JagNetThread();
				String var10 = class241.field2662.name;
				byte var11 = 0;
				if ((worldProperties & class563.field5536.rsOrdinal()) != 0) {
					class154.field1752 = "beta";
				}

				try {
					Varps.method6860("oldschool", class154.field1752, var10, var11, 25);
				} catch (Exception var12) {
					class213.RunException_sendStackTrace((String)null, var12);
				}

				class569.client = this;
				RunException.field5743 = clientType;
				class366.accessToken = System.getenv("JX_ACCESS_TOKEN");
				class269.refreshToken = System.getenv("JX_REFRESH_TOKEN");
				class132.sessionId = System.getenv("JX_SESSION_ID");
				Sound.characterId = System.getenv("JX_CHARACTER_ID");
				FriendSystem.method1948(System.getenv("JX_DISPLAY_NAME"));
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
					this.https = true;
				}

				if (field517 == -1) {
					if (!this.containsAccessAndRefreshToken() && !this.containsSessionAndCharacterId()) {
						field517 = 0;
					} else {
						field517 = 5;
					}
				}

				this.startThread(765, 503, 229, 1);
			}
		} catch (RuntimeException var13) {
			throw Script.newRunException(var13, "client.init(" + ')');
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Date;S)Z",
		garbageValue = "-972"
	)
	static boolean method1831(Date var0) {
		java.util.Calendar var1 = java.util.Calendar.getInstance();
		var1.set(1, var1.get(1) - 13);
		var1.set(5, var1.get(5) + 1);
		var1.set(11, 0);
		var1.set(12, 0);
		var1.set(13, 0);
		var1.set(14, 0);
		Date var2 = var1.getTime();
		return var0.before(var2);
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ILdy;ZI)I",
		garbageValue = "1797411235"
	)
	static int method1649(int var0, Script var1, boolean var2) {
		if (var0 == 7108) {
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = GraphicsObject.method2212() ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}
}
