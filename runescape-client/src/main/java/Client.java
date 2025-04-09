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
public final class Client extends GameEngine implements Usernamed, OAuthApi, class341 {
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	static final class278 field501;
	@ObfuscatedName("di")
	static final String field502;
	@ObfuscatedName("df")
	static final String field542;
	@ObfuscatedName("eg")
	static final int[] field504;
	@ObfuscatedName("el")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	@Export("playerAppearance")
	static final PlayerComposition playerAppearance;
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "Lct;"
	)
	static final ApproximateRouteStrategy field508;
	@ObfuscatedName("fe")
	static boolean field509;
	@ObfuscatedName("fk")
	@ObfuscatedGetter(
		intValue = 1673881465
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("fq")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("fs")
	@ObfuscatedGetter(
		intValue = -1362284775
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("fg")
	@ObfuscatedGetter(
		intValue = -1542355843
	)
	@Export("cycle")
	public static int cycle;
	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	@Export("authenticationScheme")
	static AuthenticationScheme authenticationScheme;
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "Lwb;"
	)
	static class573 field515;
	@ObfuscatedName("fr")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("ff")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	@Export("worldViewManager")
	public static WorldViewManager worldViewManager;
	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	@Export("playerUpdateManager")
	static PlayerUpdateManager playerUpdateManager;
	@ObfuscatedName("gh")
	@ObfuscatedGetter(
		intValue = -1311153441
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("gw")
	@ObfuscatedGetter(
		intValue = -932170583
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("gm")
	@ObfuscatedGetter(
		intValue = -1875138541
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("gi")
	@ObfuscatedGetter(
		intValue = -744057373
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("ge")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("gy")
	@ObfuscatedGetter(
		intValue = 549071959
	)
	static int field808;
	@ObfuscatedName("gf")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("go")
	@ObfuscatedGetter(
		intValue = 1020825481
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("gl")
	@ObfuscatedGetter(
		intValue = 2088210951
	)
	static int field579;
	@ObfuscatedName("gn")
	static String field703;
	@ObfuscatedName("gq")
	@ObfuscatedGetter(
		intValue = 1172157747
	)
	static int field530;
	@ObfuscatedName("ga")
	@ObfuscatedGetter(
		intValue = 1191401061
	)
	static int field668;
	@ObfuscatedName("gr")
	@ObfuscatedGetter(
		intValue = 1401016197
	)
	static int field532;
	@ObfuscatedName("gz")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("gd")
	@ObfuscatedGetter(
		intValue = 1397892817
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("gs")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("gk")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("gg")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("gu")
	static int[] field538;
	@ObfuscatedName("gv")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("hs")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("hx")
	@ObfuscatedGetter(
		intValue = 2108178259
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("hr")
	@ObfuscatedGetter(
		longValue = -3186671226037306943L
	)
	static long field543;
	@ObfuscatedName("hf")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("hw")
	@ObfuscatedGetter(
		intValue = -1876330405
	)
	static int field545;
	@ObfuscatedName("hu")
	@ObfuscatedGetter(
		intValue = 327911731
	)
	public static int field645;
	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("indexCheck")
	static IndexCheck indexCheck;
	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	static class268 field654;
	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "[Lgw;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "[Lgb;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("hp")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("hz")
	static int[] field552;
	@ObfuscatedName("hm")
	static short field553;
	@ObfuscatedName("hg")
	static short field554;
	@ObfuscatedName("hd")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("hc")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("hj")
	static short field557;
	@ObfuscatedName("hk")
	static short field803;
	@ObfuscatedName("iv")
	static short field527;
	@ObfuscatedName("ii")
	static short field560;
	@ObfuscatedName("is")
	@ObfuscatedGetter(
		intValue = -396614351
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("ij")
	@ObfuscatedGetter(
		intValue = -235992215
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("id")
	@ObfuscatedGetter(
		intValue = 1985968271
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("im")
	@ObfuscatedGetter(
		intValue = 92165351
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("io")
	@ObfuscatedGetter(
		intValue = -1689511425
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "[Lpw;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("it")
	static String field713;
	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "Lck;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("in")
	@ObfuscatedGetter(
		intValue = 301944585
	)
	static int field809;
	@ObfuscatedName("ir")
	@ObfuscatedGetter(
		intValue = 1979237773
	)
	public static int field569;
	@ObfuscatedName("ia")
	@ObfuscatedGetter(
		intValue = 1957735225
	)
	static int field574;
	@ObfuscatedName("ib")
	@ObfuscatedGetter(
		intValue = -1372537075
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("jr")
	@ObfuscatedGetter(
		intValue = -475933431
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("jz")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("js")
	@ObfuscatedGetter(
		intValue = -1393649155
	)
	static int field791;
	@ObfuscatedName("ju")
	@ObfuscatedGetter(
		intValue = -538118465
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("je")
	@ObfuscatedGetter(
		intValue = -1482655129
	)
	static int field576;
	@ObfuscatedName("jt")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("ja")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("jn")
	@ObfuscatedGetter(
		intValue = -515762543
	)
	@Export("serverCycle")
	static int serverCycle;
	@ObfuscatedName("ji")
	@ObfuscatedGetter(
		longValue = 2659337616354654835L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("jw")
	@ObfuscatedGetter(
		intValue = 431179873
	)
	static int field581;
	@ObfuscatedName("jv")
	@ObfuscatedGetter(
		intValue = 113909735
	)
	static int field724;
	@ObfuscatedName("jd")
	@ObfuscatedGetter(
		longValue = 4157562695521334167L
	)
	static long field583;
	@ObfuscatedName("jo")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("jc")
	@ObfuscatedGetter(
		intValue = 2009928321
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("jb")
	@Export("z")
	static boolean z;
	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	static class94 field611;
	@ObfuscatedName("kp")
	@ObfuscatedGetter(
		intValue = -1696444809
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("ke")
	@ObfuscatedGetter(
		intValue = 1819824179
	)
	static int field693;
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = -1386720861
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("la")
	@ObfuscatedGetter(
		intValue = -1956039065
	)
	static int field591;
	@ObfuscatedName("lg")
	@ObfuscatedGetter(
		intValue = -2145100989
	)
	static int field592;
	@ObfuscatedName("ll")
	@ObfuscatedGetter(
		intValue = 42701445
	)
	static int field529;
	@ObfuscatedName("lo")
	@ObfuscatedGetter(
		intValue = -588068809
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("lc")
	@ObfuscatedGetter(
		intValue = 1448901853
	)
	static int field631;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = -1482945255
	)
	static int field601;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = -448658453
	)
	static int field597;
	@ObfuscatedName("lp")
	@ObfuscatedGetter(
		intValue = -1440255025
	)
	static int field549;
	@ObfuscatedName("le")
	@ObfuscatedGetter(
		intValue = -471578573
	)
	static int field599;
	@ObfuscatedName("mf")
	@ObfuscatedGetter(
		intValue = -1078933437
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("mj")
	@ObfuscatedGetter(
		intValue = 1999980363
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("mt")
	@ObfuscatedGetter(
		intValue = 1062510183
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("me")
	@ObfuscatedGetter(
		intValue = -1431539125
	)
	static int field603;
	@ObfuscatedName("ma")
	@ObfuscatedGetter(
		intValue = -28062843
	)
	static int field807;
	@ObfuscatedName("mc")
	@ObfuscatedGetter(
		intValue = -214866245
	)
	static int field605;
	@ObfuscatedName("mn")
	@ObfuscatedGetter(
		intValue = -876691685
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("mq")
	@ObfuscatedGetter(
		intValue = 1147210307
	)
	static int field608;
	@ObfuscatedName("mx")
	@ObfuscatedGetter(
		intValue = 913704477
	)
	static int field609;
	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("ms")
	@ObfuscatedGetter(
		intValue = 1005012413
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("mu")
	@ObfuscatedGetter(
		intValue = -1251466651
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("mg")
	@ObfuscatedGetter(
		intValue = -971791971
	)
	@Export("staffModLevel")
	static int staffModLevel;
	@ObfuscatedName("md")
	@ObfuscatedGetter(
		intValue = -1813753757
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("mi")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("my")
	@ObfuscatedGetter(
		intValue = -1348693371
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("mp")
	@ObfuscatedGetter(
		intValue = -1476242959
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("mz")
	@ObfuscatedGetter(
		intValue = -347137569
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "Lqx;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "Lqx;"
	)
	static NodeDeque field620;
	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "Lqx;"
	)
	static NodeDeque field621;
	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "Lqx;"
	)
	static NodeDeque field622;
	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("nc")
	@ObfuscatedGetter(
		intValue = 2143707167
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("no")
	@ObfuscatedGetter(
		intValue = -1152789565
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("nn")
	static String field802;
	@ObfuscatedName("nl")
	@ObfuscatedGetter(
		intValue = 1360028399
	)
	static int field627;
	@ObfuscatedName("np")
	static int[] field575;
	@ObfuscatedName("nr")
	static int[] field629;
	@ObfuscatedName("nb")
	@ObfuscatedGetter(
		longValue = -5629045223906718847L
	)
	static long field564;
	@ObfuscatedName("nv")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("nt")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("nd")
	static boolean field633;
	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("DBTableIndex_cache")
	static EvictingDualNodeHashTable DBTableIndex_cache;
	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("archive11")
	static EvictingDualNodeHashTable archive11;
	@ObfuscatedName("nj")
	static boolean field706;
	@ObfuscatedName("nk")
	static boolean field637;
	@ObfuscatedName("nq")
	static boolean field638;
	@ObfuscatedName("nz")
	static boolean field639;
	@ObfuscatedName("of")
	@ObfuscatedGetter(
		intValue = 761147681
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("ob")
	@ObfuscatedGetter(
		intValue = 1047087923
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("op")
	@ObfuscatedGetter(
		intValue = 1933093331
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("oj")
	@ObfuscatedGetter(
		intValue = 28686273
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("os")
	@ObfuscatedGetter(
		intValue = 316794691
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("oq")
	@ObfuscatedGetter(
		intValue = -212627260
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("oo")
	@ObfuscatedGetter(
		intValue = -211607232
	)
	static int field747;
	@ObfuscatedName("om")
	@ObfuscatedGetter(
		intValue = -1133260736
	)
	static int field680;
	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "Leg;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("or")
	@ObfuscatedSignature(
		descriptor = "Leg;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "Ldr;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("ok")
	static int[] field651;
	@ObfuscatedName("od")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("on")
	@ObfuscatedGetter(
		intValue = 162770939
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("ot")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("ou")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("pe")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("po")
	static int[][][] field657;
	@ObfuscatedName("pg")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("ps")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("pi")
	@ObfuscatedGetter(
		intValue = -470888663
	)
	static int field660;
	@ObfuscatedName("pt")
	@ObfuscatedGetter(
		intValue = -195692571
	)
	@Export("graphicsCycle")
	static int graphicsCycle;
	@ObfuscatedName("qw")
	@ObfuscatedGetter(
		intValue = -650081591
	)
	static int field662;
	@ObfuscatedName("qa")
	@ObfuscatedGetter(
		intValue = 1759362819
	)
	static int field663;
	@ObfuscatedName("qp")
	@ObfuscatedGetter(
		intValue = 1903060575
	)
	static int field664;
	@ObfuscatedName("qu")
	@ObfuscatedGetter(
		intValue = -556546097
	)
	static int field665;
	@ObfuscatedName("qo")
	static boolean field666;
	@ObfuscatedName("qx")
	@ObfuscatedGetter(
		intValue = 649614823
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("qh")
	@ObfuscatedGetter(
		intValue = -1876644725
	)
	static int field596;
	@ObfuscatedName("qq")
	@ObfuscatedGetter(
		intValue = -1968079501
	)
	static int field774;
	@ObfuscatedName("qn")
	@ObfuscatedGetter(
		intValue = 2082132601
	)
	static int field670;
	@ObfuscatedName("qv")
	@ObfuscatedGetter(
		intValue = -717806793
	)
	public static int field671;
	@ObfuscatedName("qz")
	static boolean field672;
	@ObfuscatedName("qc")
	@ObfuscatedGetter(
		intValue = 923692825
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("qd")
	static boolean field792;
	@ObfuscatedName("qy")
	@ObfuscatedGetter(
		intValue = 167194183
	)
	static int field675;
	@ObfuscatedName("qt")
	@ObfuscatedGetter(
		intValue = -678570869
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("qs")
	@ObfuscatedGetter(
		intValue = 944872785
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("qr")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("qg")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("rz")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("rc")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("rm")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("rw")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("rx")
	static int[][] field646;
	@ObfuscatedName("rg")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("rp")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("ra")
	@ObfuscatedGetter(
		intValue = 983623443
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("rr")
	@ObfuscatedGetter(
		intValue = -294211561
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("rk")
	@ObfuscatedGetter(
		intValue = 766295407
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("re")
	@ObfuscatedGetter(
		intValue = -672632729
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("rt")
	@ObfuscatedGetter(
		intValue = 1438643619
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("ry")
	@ObfuscatedGetter(
		intValue = -503112187
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("ri")
	@ObfuscatedGetter(
		intValue = 606311105
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("rs")
	@ObfuscatedGetter(
		longValue = -9134009394026038845L
	)
	@Export("userId")
	static long userId;
	@ObfuscatedName("rd")
	@ObfuscatedGetter(
		longValue = -6732964644792894533L
	)
	@Export("userHash")
	static long userHash;
	@ObfuscatedName("rv")
	@ObfuscatedGetter(
		intValue = 490851907
	)
	static int field696;
	@ObfuscatedName("rn")
	@ObfuscatedGetter(
		intValue = 970809917
	)
	static int field758;
	@ObfuscatedName("rq")
	@ObfuscatedGetter(
		intValue = -472125267
	)
	static int field697;
	@ObfuscatedName("ro")
	@ObfuscatedGetter(
		intValue = 1682586447
	)
	static int field699;
	@ObfuscatedName("ru")
	static int[] field700;
	@ObfuscatedName("rf")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("rb")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("st")
	static int[] field587;
	@ObfuscatedName("si")
	@ObfuscatedGetter(
		intValue = -1719257275
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("sf")
	@Export("leftClickOpensMenu")
	static boolean leftClickOpensMenu;
	@ObfuscatedName("sx")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("sb")
	@ObfuscatedSignature(
		descriptor = "Lwm;"
	)
	@Export("menu")
	static Menu menu;
	@ObfuscatedName("sw")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("sz")
	@ObfuscatedGetter(
		intValue = 1469552589
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("sv")
	@ObfuscatedGetter(
		intValue = -496953473
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("sp")
	@ObfuscatedGetter(
		intValue = 1100571349
	)
	static int field691;
	@ObfuscatedName("sa")
	@ObfuscatedGetter(
		intValue = -1428645697
	)
	static int field712;
	@ObfuscatedName("so")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("sr")
	@ObfuscatedGetter(
		intValue = 284243771
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("sg")
	@ObfuscatedGetter(
		intValue = -588217879
	)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("sn")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("sk")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("su")
	@ObfuscatedGetter(
		intValue = 1455630483
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("se")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("sd")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("sq")
	@ObfuscatedGetter(
		intValue = -248863435
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("sm")
	@ObfuscatedGetter(
		intValue = 700950753
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("tq")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("tr")
	static boolean field725;
	@ObfuscatedName("ta")
	@ObfuscatedGetter(
		intValue = 1486438387
	)
	static int field726;
	@ObfuscatedName("tz")
	@ObfuscatedGetter(
		intValue = 2047884637
	)
	static int field727;
	@ObfuscatedName("tm")
	static boolean field520;
	@ObfuscatedName("tb")
	@ObfuscatedGetter(
		intValue = 1434563575
	)
	static int field729;
	@ObfuscatedName("tk")
	@ObfuscatedGetter(
		intValue = -1407485601
	)
	static int field790;
	@ObfuscatedName("to")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("tn")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("tl")
	@ObfuscatedGetter(
		intValue = -671803381
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("tf")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("tg")
	@ObfuscatedGetter(
		intValue = 1803694093
	)
	static int field735;
	@ObfuscatedName("tj")
	static int[] field736;
	@ObfuscatedName("tx")
	@ObfuscatedGetter(
		intValue = -1856793147
	)
	static int field737;
	@ObfuscatedName("ts")
	static int[] field738;
	@ObfuscatedName("tc")
	@ObfuscatedGetter(
		intValue = 1881153847
	)
	static int field804;
	@ObfuscatedName("tv")
	@ObfuscatedGetter(
		intValue = 1912254357
	)
	static int field740;
	@ObfuscatedName("tw")
	@ObfuscatedGetter(
		intValue = 169167875
	)
	static int field741;
	@ObfuscatedName("th")
	@ObfuscatedGetter(
		intValue = -696199141
	)
	static int field742;
	@ObfuscatedName("tp")
	@ObfuscatedGetter(
		intValue = 1883212483
	)
	static int field743;
	@ObfuscatedName("td")
	@ObfuscatedGetter(
		intValue = 1263228407
	)
	static int field744;
	@ObfuscatedName("ty")
	@ObfuscatedGetter(
		intValue = 1627072765
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("uc")
	@ObfuscatedGetter(
		intValue = -1878647587
	)
	static int field746;
	@ObfuscatedName("ui")
	@ObfuscatedSignature(
		descriptor = "Lwd;"
	)
	static class587 field623;
	@ObfuscatedName("ud")
	@ObfuscatedGetter(
		intValue = 1603708049
	)
	@Export("rootWidgetCount")
	public static int rootWidgetCount;
	@ObfuscatedName("uj")
	@ObfuscatedGetter(
		intValue = -1476873261
	)
	static int field779;
	@ObfuscatedName("uk")
	@Export("validRootWidgets")
	public static boolean[] validRootWidgets;
	@ObfuscatedName("uh")
	static boolean[] field558;
	@ObfuscatedName("us")
	static boolean[] field752;
	@ObfuscatedName("uv")
	@Export("rootWidgetXs")
	public static int[] rootWidgetXs;
	@ObfuscatedName("uz")
	@Export("rootWidgetYs")
	public static int[] rootWidgetYs;
	@ObfuscatedName("ut")
	@Export("rootWidgetWidths")
	public static int[] rootWidgetWidths;
	@ObfuscatedName("uu")
	@Export("rootWidgetHeights")
	public static int[] rootWidgetHeights;
	@ObfuscatedName("un")
	@ObfuscatedGetter(
		intValue = 1735390475
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("ub")
	static int[] field544;
	@ObfuscatedName("um")
	static long[] field759;
	@ObfuscatedName("uq")
	@ObfuscatedGetter(
		intValue = -1713949793
	)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("ua")
	@ObfuscatedGetter(
		intValue = 2094912231
	)
	static int field761;
	@ObfuscatedName("uy")
	@ObfuscatedGetter(
		intValue = 1083611495
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("ue")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("ux")
	static int[] field684;
	@ObfuscatedName("ug")
	@ObfuscatedSignature(
		descriptor = "[Lwc;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("ul")
	@ObfuscatedGetter(
		intValue = -1773550637
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("uf")
	@ObfuscatedGetter(
		intValue = 53184589
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("ur")
	@ObfuscatedGetter(
		intValue = -2083129417
	)
	static int field768;
	@ObfuscatedName("uw")
	@ObfuscatedGetter(
		intValue = 1379229855
	)
	static int field785;
	@ObfuscatedName("vn")
	@ObfuscatedGetter(
		intValue = -1089151221
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("vf")
	@ObfuscatedGetter(
		intValue = 625311657
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("vs")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("vo")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("vr")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("vl")
	@ObfuscatedSignature(
		descriptor = "[Lbx;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("vm")
	static boolean field681;
	@ObfuscatedName("vc")
	static boolean field582;
	@ObfuscatedName("vt")
	static boolean field778;
	@ObfuscatedName("vu")
	@ObfuscatedSignature(
		descriptor = "Luo;"
	)
	static class535 field754;
	@ObfuscatedName("ve")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	static class534 field780;
	@ObfuscatedName("vx")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	static class534 field674;
	@ObfuscatedName("wj")
	static boolean[] field686;
	@ObfuscatedName("wv")
	static int[] field783;
	@ObfuscatedName("wf")
	static int[] field784;
	@ObfuscatedName("wr")
	static int[] field550;
	@ObfuscatedName("wz")
	static int[] field786;
	@ObfuscatedName("wn")
	@ObfuscatedGetter(
		intValue = 1535434695
	)
	static int field589;
	@ObfuscatedName("wo")
	@ObfuscatedGetter(
		intValue = -351888311
	)
	static int field788;
	@ObfuscatedName("wc")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	static class531 field789;
	@ObfuscatedName("ww")
	@ObfuscatedSignature(
		descriptor = "Lsc;"
	)
	static class477 field770;
	@ObfuscatedName("wm")
	static List field568;
	@ObfuscatedName("wx")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("wa")
	@ObfuscatedGetter(
		intValue = 530471961
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("wp")
	@ObfuscatedGetter(
		intValue = -1290335641
	)
	static int field794;
	@ObfuscatedName("wk")
	static int[] field795;
	@ObfuscatedName("wt")
	static int[] field796;
	@ObfuscatedName("xl")
	@ObfuscatedGetter(
		intValue = -1704918751
	)
	@Export("clientId")
	int clientId;
	@ObfuscatedName("we")
	@Export("otlTokenRequester")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/OtlTokenRequester;"
	)
	OtlTokenRequester otlTokenRequester;
	@ObfuscatedName("xa")
	@ObfuscatedGetter(
		longValue = 671064862094971049L
	)
	@Export("accountHash")
	long accountHash;
	@ObfuscatedName("xp")
	@Export("refreshAccessTokenRequester")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	RefreshAccessTokenRequester refreshAccessTokenRequester;
	@ObfuscatedName("xg")
	@Export("https")
	boolean https;
	@ObfuscatedName("xs")
	@Export("refreshAccessTokenRequestFuture")
	Future refreshAccessTokenRequestFuture;
	@ObfuscatedName("xn")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	@Export("asyncAccessTokenResponse")
	AsyncHttpResponse asyncAccessTokenResponse;
	@ObfuscatedName("xt")
	@Export("otlTokenRequestFuture")
	Future otlTokenRequestFuture;
	@ObfuscatedName("wq")
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	@Export("asyncRestClient")
	AsyncRestClient asyncRestClient;
	@ObfuscatedName("wy")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	@Export("asyncGameSessionTokenResponse")
	AsyncHttpResponse asyncGameSessionTokenResponse;
	@ObfuscatedName("xb")
	@ObfuscatedSignature(
		descriptor = "Lam;"
	)
	class7 field769;
	@ObfuscatedName("xm")
	@ObfuscatedSignature(
		descriptor = "Lve;"
	)
	Buffer field570;
	@ObfuscatedName("wu")
	@Export("token")
	String token;

	static {
		packetWriter = new PacketWriter();
		field501 = new class278();
		int var1 = "com_jagex_auth_desktop_osrs:public".length();
		byte[] var2 = new byte[var1];

		int var3;
		char var4;
		for (var3 = 0; var3 < var1; ++var3) {
			var4 = "com_jagex_auth_desktop_osrs:public".charAt(var3);
			if (var4 > 127) {
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4;
			}
		}

		field502 = GrandExchangeOfferNameComparator.method7852(var2);
		var1 = "com_jagex_auth_desktop_runelite:public".length();
		var2 = new byte[var1];

		for (var3 = 0; var3 < var1; ++var3) {
			var4 = "com_jagex_auth_desktop_runelite:public".charAt(var3);
			if (var4 > 127) {
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4;
			}
		}

		field542 = GrandExchangeOfferNameComparator.method7852(var2);
		field504 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
		playerAppearance = new PlayerComposition();
		field508 = new ApproximateRouteStrategy();
		field509 = true;
		worldId = 1;
		isMembersWorld = false;
		gameState = 0;
		cycle = 0;
		authenticationScheme = AuthenticationScheme.field1684;
		field515 = class573.field5654;
		Login_isUsernameRemembered = false;
		fontsMap = new HashMap();
		worldViewManager = new WorldViewManager();
		playerUpdateManager = new PlayerUpdateManager();
		oculusOrbState = 0;
		camFollowHeight = 50;
		oculusOrbNormalSpeed = 12;
		oculusOrbSlowedSpeed = 6;
		showMouseCross = true;
		field808 = 0;
		showLoadingMessages = true;
		localPlayerIndex = -1;
		field579 = 0;
		field703 = "";
		field530 = -1;
		field668 = -1;
		field532 = -1;
		renderSelf = true;
		drawPlayerNames = 0;
		currentLevels = new int[25];
		levels = new int[25];
		experience = new int[25];
		field538 = new int[25];
		followerOpsLowPriority = false;
		showMouseOverText = true;
		isItemSelected = 0;
		viewportWidget = null;
		field543 = 0L;
		isResizable = true;
		field545 = 600;
		field645 = field545 / GameEngine.cycleDurationMillis;
		indexCheck = new IndexCheck();
		field654 = new class268();
		currentClanSettings = new ClanSettings[4];
		currentClanChannels = new ClanChannel[4];
		soundLocations = new int[50];
		field552 = new int[50];
		field553 = 256;
		field554 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field557 = 1;
		field803 = 32767;
		field527 = 1;
		field560 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		field809 = -1;
		field569 = -1;
		field574 = 30;
		worldProperties = 0;
		gameBuild = 0;
		isLowDetail = false;
		field791 = -1;
		clientType = -1;
		field576 = -1;
		onMobile = false;
		isLoading = true;
		serverCycle = 0;
		mouseLastLastPressedTimeMillis = -1L;
		field581 = -1;
		field724 = -1;
		field583 = -1L;
		hadFocus = true;
		rebootTimer = 0;
		z = false;
		field611 = class94.field1158;
		js5ConnectState = 0;
		field693 = 0;
		js5Errors = 0;
		field591 = 0;
		field592 = 0;
		field529 = 0;
		logoutTimer = 0;
		field631 = 0;
		field601 = 1;
		field597 = 0;
		field549 = 1;
		field599 = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		field603 = 0;
		field807 = 0;
		field605 = 0;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field608 = 0;
		field609 = -1;
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
		field620 = new NodeDeque();
		field621 = new NodeDeque();
		field622 = new NodeDeque();
		widgetFlags = new NodeHashTable(512);
		publicChatMode = 0;
		tradeChatMode = 0;
		field802 = "";
		field627 = 0;
		field575 = new int[128];
		field629 = new int[128];
		field564 = -1L;
		playingJingle = false;
		isCameraLocked = false;
		field633 = false;
		DBTableIndex_cache = new EvictingDualNodeHashTable(64);
		archive11 = new EvictingDualNodeHashTable(64);
		field706 = false;
		field637 = false;
		field638 = false;
		field639 = false;
		hintArrowType = 0;
		hintArrowNpcIndex = 0;
		hintArrowPlayerIndex = 0;
		hintArrowX = 0;
		hintArrowY = 0;
		changedSkillsCount = 0;
		field747 = 0;
		field680 = 0;
		playerAttackOption = AttackOption.AttackOption_hidden;
		npcAttackOption = AttackOption.AttackOption_hidden;
		secureRandomFuture = new SecureRandomFuture();
		field651 = new int[4];
		randomDatData = null;
		npcCount = 0;
		npcIndices = new int[250];
		hadNetworkError = false;
		timer = new Timer();
		field657 = new int[4][13][13];
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		field660 = -1;
		graphicsCycle = 0;
		field662 = 2301979;
		field663 = 5063219;
		field664 = 3353893;
		field665 = 7759444;
		field666 = false;
		alternativeScrollbarWidth = 0;
		field596 = 0;
		field774 = 0;
		field670 = 0;
		field671 = 0;
		field672 = false;
		hintArrowSubX = 0;
		field792 = false;
		field675 = 0;
		overheadTextCount = 0;
		overheadTextLimit = 50;
		overheadTextXs = new int[overheadTextLimit];
		overheadTextYs = new int[overheadTextLimit];
		overheadTextAscents = new int[overheadTextLimit];
		overheadTextXOffsets = new int[overheadTextLimit];
		overheadTextColors = new int[overheadTextLimit];
		overheadTextEffects = new int[overheadTextLimit];
		field646 = new int[overheadTextLimit][];
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
		field696 = 0;
		field758 = 0;
		field697 = 0;
		field699 = 0;
		field700 = new int[1000];
		playerMenuActions = new String[8];
		playerOptionsPriorities = new boolean[8];
		field587 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
		combatTargetPlayerIndex = -1;
		leftClickOpensMenu = false;
		isMenuOpen = false;
		menu = new Menu(true);
		tapToDrop = false;
		viewportX = -1;
		viewportY = -1;
		field691 = 0;
		field712 = 50;
		field713 = null;
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
		field725 = false;
		field726 = -1;
		field727 = -1;
		field520 = false;
		field729 = -1;
		field790 = -1;
		isDraggingWidget = false;
		changedItemContainers = new int[32];
		changedVarpCount = 0;
		defaultRotations = new int[32];
		field735 = 0;
		field736 = new int[32];
		field737 = 0;
		field738 = new int[32];
		field804 = 0;
		field740 = 0;
		field741 = 0;
		field742 = 0;
		field743 = 0;
		field744 = 0;
		hintArrowHeight = 0;
		field746 = 0;
		field623 = new class587();
		rootWidgetCount = 0;
		field779 = -2;
		validRootWidgets = new boolean[100];
		field558 = new boolean[100];
		field752 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field544 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		field759 = new long[100];
		crossWorldMessageIdsIndex = 0;
		field761 = -1;
		mapIconCount = 0;
		mapIconXs = new int[1000];
		field684 = new int[1000];
		mapIcons = new SpritePixels[1000];
		destinationX = 0;
		destinationY = 0;
		field768 = -1;
		field785 = 0;
		minimapState = 0;
		soundEffectCount = 0;
		soundEffectIds = new int[50];
		queuedSoundEffectLoops = new int[50];
		queuedSoundEffectDelays = new int[50];
		soundEffects = new SoundEffect[50];
		field681 = false;
		field582 = false;
		field778 = false;
		field754 = null;
		field780 = null;
		field674 = null;
		field686 = new boolean[5];
		field783 = new int[5];
		field784 = new int[5];
		field550 = new int[5];
		field786 = new int[5];
		field589 = -1;
		field788 = -1;
		field789 = new DesktopPlatformInfoProvider();
		field770 = new class477(8, class475.field5090);
		field568 = new ArrayList();
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field794 = 0;
		field795 = new int[50];
		field796 = new int[50];
		class566.field5590 = 230;
	}

	public Client() {
		this.https = false;
		this.clientId = 0;
		this.accountHash = -1L;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-163541780"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field543 = class282.method5908() + 500L;
		this.resizeJS();
		if (rootInterface != -1) {
			this.method1272(true);
		}

	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1046836309"
	)
	@Export("setUp")
	protected final void setUp() {
		ArchiveDiskActionHandler.method7622(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
		int var2 = worldProperties;
		class563 var3 = class563.field5569;
		boolean var1 = (var2 & var3.rsOrdinal()) != 0;
		LoginScreenAnimation.field1314 = var1;
		WorldMapData_0.worldPort = gameBuild == 0 ? 43594 : worldId + 40000;
		class438.js5Port = gameBuild == 0 ? 443 : worldId + 50000;
		ServerPacket.currentPort = WorldMapData_0.worldPort;
		PlayerComposition.field3877 = class362.field3922;
		PlayerComposition.field3878 = class362.field3923;
		class172.field1875 = class362.field3924;
		PlayerComposition.field3879 = class362.field3925;
		ParamComposition.urlRequester = new SecureUrlRequester(this.https, 230);
		this.setUpKeyboard();
		this.setUpMouse();
		ReflectionCheck.mouseWheel = this.mouseWheel();
		this.method498(field654, 0);
		this.method498(indexCheck, 1);
		this.setUpClipboard();
		class6.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 750000);
		Renderable.clientPreferences = UserComparator9.method3234();
		String var5 = GameEngine.field157;
		class31.field136 = this;
		if (var5 != null) {
			class31.field137 = var5;
		}

		MouseRecorder.setWindowedMode(Renderable.clientPreferences.getWindowMode());
		class223.friendSystem = new FriendSystem(class339.loginType);
		this.asyncRestClient = new AsyncRestClient("tokenRequest", 1, 1);
		class321.method6539(this);
		field501.method5856();
		ModelData var6 = new ModelData(3, 1, 0);
		var6.method3772(-64, -8, 64);
		var6.method3772(64, -8, 64);
		var6.method3772(0, -8, -24);
		var6.method3773(0, 2, 1, (byte)1, (byte)-1, (short)10173, (short)-1);
		class138.field1643 = var6.toModel(1, 32, 0, -128, 0);
		PacketWriter.field1464 = var6.toModel(64, 850, -30, -50, -30);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "13136"
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
				boolean var6 = false;
				boolean var7 = false;
				if (!class335.field3699.isEmpty()) {
					SongTask var4 = (SongTask)class335.field3699.get(0);
					if (var4 == null) {
						class335.field3699.remove(0);
					} else if (var4.vmethod8938()) {
						if (var4.method8916()) {
							System.out.println("Error in midimanager.service: " + var4.method8918());
							var6 = true;
						} else {
							if (var4.method8930() != null) {
								class335.field3699.add(1, var4.method8930());
							}

							var7 = var4.method8917();
						}

						class335.field3699.remove(0);
					} else {
						var7 = var4.method8917();
					}
				}

				if (var6) {
					class335.field3699.clear();
					SoundCache.method864();
				}

				if (var7 && playingJingle && class1.pcmPlayer1 != null) {
					class1.pcmPlayer1.tryDiscard();
				}

				class362.method7337();
				indexCheck.method5672();
				this.method501();
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

				if (ReflectionCheck.mouseWheel != null) {
					int var11 = ReflectionCheck.mouseWheel.useRotation();
					mouseWheelRotation = var11;
				}

				if (gameState == 0) {
					ItemLayer.method3758();
					WorldMapRectangle.method6333();
				} else if (gameState == 5) {
					Canvas.loginScreen(this, class282.fontPlain11, HorizontalAlignment.fontPlain12);
					ItemLayer.method3758();
					WorldMapRectangle.method6333();
				} else if (gameState != 10 && gameState != 11) {
					if (gameState == 20) {
						Canvas.loginScreen(this, class282.fontPlain11, HorizontalAlignment.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState == 50) {
						Canvas.loginScreen(this, class282.fontPlain11, HorizontalAlignment.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState == 25) {
						if (field706) {
							Player.loadRegion();
						}

						if (field637) {
							VarcInt.method5076(class166.field1847);
						}

						if (!field637 && !field706) {
							class325.updateGameState(30);
						}
					}
				} else {
					Canvas.loginScreen(this, class282.fontPlain11, HorizontalAlignment.fontPlain12);
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

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1671757291"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		if ((gameState == 10 || gameState == 20 || gameState == 30) && field543 != 0L && class282.method5908() > field543) {
			MouseRecorder.setWindowedMode(class171.getWindowedMode());
		}

		int var2;
		if (var1) {
			for (var2 = 0; var2 < 100; ++var2) {
				validRootWidgets[var2] = true;
			}
		}

		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1, Clock.field2530);
		} else if (gameState == 5) {
			GameEngine.drawTitle(class440.fontBold12, class282.fontPlain11, HorizontalAlignment.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				GameEngine.drawTitle(class440.fontBold12, class282.fontPlain11, HorizontalAlignment.fontPlain12);
			} else if (gameState == 50) {
				GameEngine.drawTitle(class440.fontBold12, class282.fontPlain11, HorizontalAlignment.fontPlain12);
			} else if (gameState == 25) {
				if (field599 == 1) {
					if (field631 > field601) {
						field601 = field631;
					}

					var2 = (field601 * 50 - field631 * 50) / field601;
					NpcOverrides.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
				} else if (field599 == 2) {
					if (field597 > field549) {
						field549 = field597;
					}

					var2 = (field549 * 50 - field597 * 50) / field549 + 50;
					NpcOverrides.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
				} else {
					NpcOverrides.drawLoadingMessage("Loading - please wait.", false);
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				NpcOverrides.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) {
				NpcOverrides.drawLoadingMessage("Please wait...", false);
			}
		} else {
			GameEngine.drawTitle(class440.fontBold12, class282.fontPlain11, HorizontalAlignment.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				if (field558[var2]) {
					GameEngine.rasterProvider.draw(rootWidgetXs[var2], rootWidgetYs[var2], rootWidgetWidths[var2], rootWidgetHeights[var2]);
					field558[var2] = false;
				}
			}
		} else if (gameState > 0) {
			GameEngine.rasterProvider.drawFull(0, 0);

			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				field558[var2] = false;
			}
		}

	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1773287493"
	)
	@Export("kill0")
	protected final void kill0() {
		if (NPCComposition.varcs != null && NPCComposition.varcs.hasUnwrittenChanges()) {
			NPCComposition.varcs.write();
		}

		if (class433.mouseRecorder != null) {
			class433.mouseRecorder.isRunning = false;
		}

		class433.mouseRecorder = null;
		packetWriter.close();
		RestClientThreadFactory.method209();
		ReflectionCheck.mouseWheel = null;
		if (class1.pcmPlayer1 != null) {
			class1.pcmPlayer1.shutdown();
		}

		ClanSettings.field1791.method7794();
		class274.method5798();
		if (ParamComposition.urlRequester != null) {
			ParamComposition.urlRequester.close();
			ParamComposition.urlRequester = null;
		}

		class449.method8543();
		this.asyncRestClient.shutdown();
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "805796301"
	)
	protected final void vmethod1240() {
	}

	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-447694304"
	)
	@Export("isRuneLite")
	boolean isRuneLite() {
		return this.clientId == 1;
	}

	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1926934064"
	)
	@Export("containsAccessAndRefreshToken")
	boolean containsAccessAndRefreshToken() {
		return WorldMapEvent.accessToken != null && !WorldMapEvent.accessToken.trim().isEmpty() && DynamicObject.refreshToken != null && !DynamicObject.refreshToken.trim().isEmpty();
	}

	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "583860927"
	)
	@Export("containsSessionAndCharacterId")
	boolean containsSessionAndCharacterId() {
		return class320.sessionId != null && !class320.sessionId.trim().isEmpty() && class134.characterId != null && !class134.characterId.trim().isEmpty();
	}

	@ObfuscatedName("ou")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2074034365"
	)
	@Export("otlTokenRequesterInitialized")
	boolean otlTokenRequesterInitialized() {
		return this.otlTokenRequester != null;
	}

	@ObfuscatedName("pe")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "12"
	)
	@Export("requestRefreshAccessToken")
	void requestRefreshAccessToken(String var1) throws IOException {
		HashMap var2 = new HashMap();
		var2.put("grant_type", "refresh_token");
		var2.put("scope", "gamesso.token.create");
		var2.put("refresh_token", var1);
		URL var3 = new URL(FriendLoginUpdate.field5130 + "shield/oauth/token" + (new HttpQueryParams(var2)).encode());
		HttpHeaders var4 = new HttpHeaders();
		if (this.isRuneLite()) {
			var4.basicAuthentication(field542);
		} else {
			var4.basicAuthentication(field502);
		}

		var4.header("Host", (new URL(FriendLoginUpdate.field5130)).getHost());
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
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-16"
	)
	@Export("requestOtlToken")
	void requestOtlToken(String var1) throws IOException {
		URL var2 = new URL(FriendLoginUpdate.field5130 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
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

	@ObfuscatedName("pm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1122141349"
	)
	@Export("authenticate")
	void authenticate(String var1, String var2) throws IOException, JSONException {
		URL var3 = new URL(class160.field1805 + "game-session/v1/tokens");
		HttpRequest var4 = new HttpRequest(var3, HttpMethod.POST, this.https);
		var4.getHeaders().bearerToken(var1);
		var4.getHeaders().accept(HttpContentType.APPLICATION_JSON);
		JSONObject var5 = new JSONObject();
		var5.setProperty("accountId", var2);
		var4.setPayload(new HttpJsonRequestBody(var5));
		this.asyncGameSessionTokenResponse = this.asyncRestClient.submitRequest(var4);
	}

	@ObfuscatedName("pv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "673925099"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			boolean var1 = ClanSettings.field1791.method7785();
			if (!var1) {
				this.method1722();
			}

		}
	}

	@ObfuscatedName("pc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2086813428"
	)
	void method1722() {
		if (ClanSettings.field1791.field4739 >= 4) {
			this.error("js5crc");
			class325.updateGameState(1000);
		} else {
			if (ClanSettings.field1791.field4740 >= 4) {
				if (gameState <= 5) {
					this.error("js5io");
					class325.updateGameState(1000);
					return;
				}

				field693 = 3000;
				ClanSettings.field1791.field4740 = 3;
			}

			if (--field693 + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						ReflectionCheck.js5SocketTask = GameEngine.taskHandler.newSocketTask(class335.worldHost, ServerPacket.currentPort);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (ReflectionCheck.js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (ReflectionCheck.js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						HealthBarDefinition.js5Socket = FriendLoginUpdate.method9178((Socket)ReflectionCheck.js5SocketTask.result, 40000, 5000);
						Buffer var1 = new Buffer(class328.field3650.field3660 + 1);
						var1.writeByte(class328.field3650.field3658);
						var1.writeInt(230);
						var1.writeInt(field651[0]);
						var1.writeInt(field651[1]);
						var1.writeInt(field651[2]);
						var1.writeInt(field651[3]);
						HealthBarDefinition.js5Socket.write(var1.array, 0, class328.field3650.field3660 + 1);
						++js5ConnectState;
						CollisionMap.field3089 = class282.method5908();
					}

					if (js5ConnectState == 3) {
						if (HealthBarDefinition.js5Socket.available() > 0) {
							int var2 = HealthBarDefinition.js5Socket.readUnsignedByte();
							if (var2 != 0) {
								this.js5Error(var2);
								return;
							}

							++js5ConnectState;
						} else if (class282.method5908() - CollisionMap.field3089 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						ClanSettings.field1791.method7798(HealthBarDefinition.js5Socket, gameState > 20);
						ReflectionCheck.js5SocketTask = null;
						HealthBarDefinition.js5Socket = null;
						js5ConnectState = 0;
						js5Errors = 0;
					}
				} catch (IOException var3) {
					this.js5Error(-3);
				}

			}
		}
	}

	@ObfuscatedName("pq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "344538480"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		ReflectionCheck.js5SocketTask = null;
		HealthBarDefinition.js5Socket = null;
		js5ConnectState = 0;
		if (WorldMapData_0.worldPort == ServerPacket.currentPort) {
			ServerPacket.currentPort = class438.js5Port;
		} else {
			ServerPacket.currentPort = WorldMapData_0.worldPort;
		}

		++js5Errors;
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) {
			if (gameState <= 5) {
				this.error("js5connect_full");
				class325.updateGameState(1000);
			} else {
				field693 = 3000;
			}
		} else if (js5Errors >= 2 && var1 == 6) {
			this.error("js5connect_outofdate");
			class325.updateGameState(1000);
		} else if (js5Errors >= 4) {
			if (gameState <= 5) {
				this.error("js5connect");
				class325.updateGameState(1000);
			} else {
				field693 = 3000;
			}
		}

	}

	@ObfuscatedName("pj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1659933305"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		AbstractSocket var1 = packetWriter.getSocket();
		PacketBuffer var2 = packetWriter.packetBuffer;

		try {
			if (LoginState.SHUTDOWN_PREVIOUS_CONNECTION == class4.loginState) {
				if (ModelData0.field2360 == null && (secureRandomFuture.isDone() || field591 > 250)) {
					ModelData0.field2360 = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (ModelData0.field2360 != null) {
					if (var1 != null) {
						var1.close();
						var1 = null;
					}

					class142.field1664 = null;
					hadNetworkError = false;
					field591 = 0;
					if (field515.method10602()) {
						if (this.containsAccessAndRefreshToken()) {
							try {
								this.requestRefreshAccessToken(DynamicObject.refreshToken);
								VarcInt.updateLoginState(LoginState.TOKEN_RESPONSE);
							} catch (Throwable var22) {
								class290.RunException_sendStackTrace((String)null, var22);
								HttpMethod.getLoginError(65);
								return;
							}
						} else {
							if (!this.containsSessionAndCharacterId()) {
								HttpMethod.getLoginError(65);
								return;
							}

							try {
								this.authenticate(class320.sessionId, class134.characterId);
								VarcInt.updateLoginState(LoginState.REFRESHING_TOKEN);
							} catch (Exception var21) {
								class290.RunException_sendStackTrace((String)null, var21);
								HttpMethod.getLoginError(65);
								return;
							}
						}
					} else {
						VarcInt.updateLoginState(LoginState.INIT_MOUSEHANDLER_SOCKET);
					}
				}
			}

			HttpResponse var24;
			if (LoginState.TOKEN_RESPONSE == class4.loginState) {
				if (this.refreshAccessTokenRequestFuture != null) {
					if (!this.refreshAccessTokenRequestFuture.isDone()) {
						return;
					}

					if (this.refreshAccessTokenRequestFuture.isCancelled()) {
						HttpMethod.getLoginError(65);
						this.refreshAccessTokenRequestFuture = null;
						return;
					}

					try {
						RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.refreshAccessTokenRequestFuture.get();
						if (!var3.isSuccess()) {
							HttpMethod.getLoginError(65);
							this.refreshAccessTokenRequestFuture = null;
							return;
						}

						WorldMapEvent.accessToken = var3.getAccessToken();
						DynamicObject.refreshToken = var3.getRefreshToken();
						this.refreshAccessTokenRequestFuture = null;
					} catch (Exception var20) {
						class290.RunException_sendStackTrace((String)null, var20);
						HttpMethod.getLoginError(65);
						this.refreshAccessTokenRequestFuture = null;
						return;
					}
				} else {
					if (this.asyncAccessTokenResponse == null) {
						HttpMethod.getLoginError(65);
						return;
					}

					if (!this.asyncAccessTokenResponse.hasFinished()) {
						return;
					}

					if (this.asyncAccessTokenResponse.hasError()) {
						class290.RunException_sendStackTrace(this.asyncAccessTokenResponse.getErrorMessage(), (Throwable)null);
						HttpMethod.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}

					var24 = this.asyncAccessTokenResponse.await();
					if (var24.getResponseCode() != 200) {
						HttpMethod.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}

					field591 = 0;
					HttpJsonRequestBody var4 = new HttpJsonRequestBody(var24.getResponseBody());

					try {
						WorldMapEvent.accessToken = var4.getBody().getString("access_token");
						DynamicObject.refreshToken = var4.getBody().getString("refresh_token");
					} catch (Exception var19) {
						class290.RunException_sendStackTrace("Error parsing tokens", var19);
						HttpMethod.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}
				}

				this.requestOtlToken(WorldMapEvent.accessToken);
				VarcInt.updateLoginState(LoginState.REFRESHING_TOKEN);
			}

			if (class4.loginState == LoginState.REFRESHING_TOKEN) {
				if (this.otlTokenRequestFuture != null) {
					if (!this.otlTokenRequestFuture.isDone()) {
						return;
					}

					if (this.otlTokenRequestFuture.isCancelled()) {
						HttpMethod.getLoginError(65);
						this.otlTokenRequestFuture = null;
						return;
					}

					try {
						OtlTokenResponse var25 = (OtlTokenResponse)this.otlTokenRequestFuture.get();
						if (!var25.isSuccess()) {
							HttpMethod.getLoginError(65);
							this.otlTokenRequestFuture = null;
							return;
						}

						this.token = var25.getToken();
						this.otlTokenRequestFuture = null;
					} catch (Exception var18) {
						class290.RunException_sendStackTrace((String)null, var18);
						HttpMethod.getLoginError(65);
						this.otlTokenRequestFuture = null;
						return;
					}
				} else {
					if (this.asyncGameSessionTokenResponse == null) {
						HttpMethod.getLoginError(65);
						return;
					}

					if (!this.asyncGameSessionTokenResponse.hasFinished()) {
						return;
					}

					if (this.asyncGameSessionTokenResponse.hasError()) {
						class290.RunException_sendStackTrace(this.asyncGameSessionTokenResponse.getErrorMessage(), (Throwable)null);
						HttpMethod.getLoginError(65);
						this.asyncGameSessionTokenResponse = null;
						return;
					}

					var24 = this.asyncGameSessionTokenResponse.await();
					if (var24.getResponseCode() != 200) {
						class290.RunException_sendStackTrace("Login authentication error. Response code: " + var24.getResponseCode() + " " + var24.method299() + " Response body: " + var24.getResponseBody(), (Throwable)null);
						HttpMethod.getLoginError(65);
						this.asyncGameSessionTokenResponse = null;
						return;
					}

					List var27 = (List)var24.getHeaderFields().get("Content-Type");
					if (var27 != null && var27.contains(HttpContentType.APPLICATION_JSON.getValue())) {
						try {
							JSONObject var5 = new JSONObject(var24.getResponseBody());
							this.token = var5.getString("token");
						} catch (JSONException var17) {
							class290.RunException_sendStackTrace((String)null, var17);
							HttpMethod.getLoginError(65);
							this.asyncGameSessionTokenResponse = null;
							return;
						}
					} else {
						this.token = var24.getResponseBody();
					}

					this.asyncGameSessionTokenResponse = null;
				}

				field591 = 0;
				VarcInt.updateLoginState(LoginState.INIT_MOUSEHANDLER_SOCKET);
			}

			if (LoginState.INIT_MOUSEHANDLER_SOCKET == class4.loginState) {
				if (class142.field1664 == null) {
					class142.field1664 = GameEngine.taskHandler.newSocketTask(class335.worldHost, ServerPacket.currentPort);
				}

				if (class142.field1664.status == 2) {
					throw new IOException();
				}

				if (class142.field1664.status == 1) {
					var1 = FriendLoginUpdate.method9178((Socket)class142.field1664.result, 40000, 5000);
					packetWriter.setSocket(var1);
					class142.field1664 = null;
					VarcInt.updateLoginState(LoginState.UNMAPPED_20);
				}
			}

			PacketBufferNode var26;
			if (LoginState.UNMAPPED_20 == class4.loginState) {
				packetWriter.clearBuffer();
				var26 = class143.method3427();
				var26.packetBuffer.writeByte(class328.field3659.field3658);
				packetWriter.addNode(var26);
				packetWriter.flush();
				var2.offset = 0;
				VarcInt.updateLoginState(LoginState.READ_LOGIN_STATUS);
			}

			int var13;
			if (LoginState.READ_LOGIN_STATUS == class4.loginState) {
				if (class1.pcmPlayer1 != null) {
					class1.pcmPlayer1.method789();
				}

				if (var1.isAvailable(1)) {
					var13 = var1.readUnsignedByte();
					if (class1.pcmPlayer1 != null) {
						class1.pcmPlayer1.method789();
					}

					if (var13 != 0) {
						HttpMethod.getLoginError(var13);
						return;
					}

					var2.offset = 0;
					VarcInt.updateLoginState(LoginState.READ_RANDOM_VERIFICATION_NUMBER);
				}
			}

			if (LoginState.READ_RANDOM_VERIFICATION_NUMBER == class4.loginState) {
				if (var2.offset * -2066221813 < 8) {
					var13 = var1.available();
					if (var13 > 8 - var2.offset * -2066221813) {
						var13 = 8 - var2.offset * -2066221813;
					}

					if (var13 > 0) {
						var1.read(var2.array, var2.offset * -2066221813, var13);
						var2.offset += 29699747 * var13;
					}
				}

				if (var2.offset * -2066221813 == 8) {
					var2.offset = 0;
					RouteStrategy.field3104 = var2.readLong();
					VarcInt.updateLoginState(LoginState.WRITE_INITIAL_LOGIN_PACKET);
				}
			}

			if (LoginState.WRITE_INITIAL_LOGIN_PACKET == class4.loginState) {
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var28 = new PacketBuffer(500);
				int[] var29 = new int[]{ModelData0.field2360.nextInt(), ModelData0.field2360.nextInt(), ModelData0.field2360.nextInt(), ModelData0.field2360.nextInt()};
				var28.offset = 0;
				var28.writeByte(1);
				var28.writeInt(var29[0]);
				var28.writeInt(var29[1]);
				var28.writeInt(var29[2]);
				var28.writeInt(var29[3]);
				var28.writeLong(RouteStrategy.field3104);
				if (gameState == 40) {
					var28.writeInt(field651[0]);
					var28.writeInt(field651[1]);
					var28.writeInt(field651[2]);
					var28.writeInt(field651[3]);
				} else {
					if (gameState == 50) {
						var28.writeByte(AuthenticationScheme.field1686.rsOrdinal());
						var28.writeInt(class387.field4577);
					} else {
						var28.writeByte(authenticationScheme.rsOrdinal());
						switch(authenticationScheme.schemeId) {
						case 0:
							var28.offset += 118798988;
						case 1:
						default:
							break;
						case 2:
						case 4:
							var28.writeMedium(class137.otpMedium);
							var28.offset += 29699747;
							break;
						case 3:
							var28.writeInt(Renderable.clientPreferences.getParameterValue(Login.Login_username));
						}
					}

					if (field515.method10602()) {
						var28.writeByte(class573.field5652.rsOrdinal());
						var28.writeStringCp1252NullTerminated(this.token);
					} else {
						var28.writeByte(class573.field5654.rsOrdinal());
						var28.writeStringCp1252NullTerminated(Login.Login_password);
					}
				}

				var28.encryptRsa(class76.field921, class76.field920);
				field651 = var29;
				PacketBufferNode var32 = class143.method3427();
				var32.packetBuffer.offset = 0;
				if (gameState == 40) {
					var32.packetBuffer.writeByte(class328.field3652.field3658);
				} else {
					var32.packetBuffer.writeByte(class328.field3651.field3658);
				}

				var32.packetBuffer.writeShort(0);
				int var6 = var32.packetBuffer.offset * -2066221813;
				var32.packetBuffer.writeInt(230);
				var32.packetBuffer.writeInt(1);
				var32.packetBuffer.writeByte(clientType);
				var32.packetBuffer.writeByte(field576);
				byte var7 = 0;
				var32.packetBuffer.writeByte(var7);
				var32.packetBuffer.writeBytes(var28.array, 0, var28.offset * -2066221813);
				int var8 = var32.packetBuffer.offset * -2066221813;
				var32.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var32.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var32.packetBuffer.writeShort(GameEngine.canvasWidth);
				var32.packetBuffer.writeShort(class141.canvasHeight);
				PacketBuffer var9 = var32.packetBuffer;
				if (randomDatData != null) {
					var9.writeBytes(randomDatData, 0, randomDatData.length);
				} else {
					byte[] var10 = WorldMapLabelSize.randomDatData2();
					var9.writeBytes(var10, 0, var10.length);
				}

				var32.packetBuffer.writeStringCp1252NullTerminated(SecureRandomFuture.field1003);
				var32.packetBuffer.writeInt(class169.field1863);
				var32.packetBuffer.writeByte(0);
				Buffer var38 = new Buffer(WorldMapAreaData.platformInfo.size());
				WorldMapAreaData.platformInfo.write(var38);
				var32.packetBuffer.writeBytes(var38.array, 0, var38.array.length);
				var32.packetBuffer.writeByte(clientType);
				var32.packetBuffer.writeInt(0);
				if (LoginScreenAnimation.field1314) {
					var32.packetBuffer.writeInt(class456.field5014.hash);
					var32.packetBuffer.writeIntIME(MouseHandler.archive13.hash);
					var32.packetBuffer.method10279(ClientPacket.field3483.hash);
					var32.packetBuffer.writeInt(class330.field3665.hash);
					var32.packetBuffer.writeIntIME(class357.archive8.hash);
					var32.packetBuffer.method10279(FloorDecoration.archive10.hash);
					var32.packetBuffer.writeIntIME(class133.field1576.hash);
				} else {
					RestClientThreadFactory.method207(var32);
				}

				var32.packetBuffer.xteaEncrypt(var29, var8, var32.packetBuffer.offset * -2066221813);
				var32.packetBuffer.writeLengthShort(var32.packetBuffer.offset * -2066221813 - var6);
				packetWriter.addNode(var32);
				packetWriter.flush();
				packetWriter.isaacCipher = new IsaacCipher(var29);
				int[] var11 = new int[4];

				for (int var12 = 0; var12 < 4; ++var12) {
					var11[var12] = var29[var12] + 50;
				}

				var2.newIsaacCipher(var11);
				VarcInt.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			int var14;
			if (LoginState.READ_CLIENT_INFO_STATUS == class4.loginState && var1.available() > 0) {
				var13 = var1.readUnsignedByte();
				if (var13 == 61) {
					var14 = var1.available();
					Occluder.field2185 = var14 == 1 && var1.readUnsignedByte() == 1;
					VarcInt.updateLoginState(LoginState.WRITE_INITIAL_LOGIN_PACKET);
				}

				if (var13 == 21 && gameState == 20) {
					VarcInt.updateLoginState(LoginState.READ_PROFILE_TRANSFER_TIME);
				} else if (var13 == 2) {
					if (LoginScreenAnimation.field1314) {
						VarcInt.updateLoginState(LoginState.UNMAPPED_21);
					} else {
						VarcInt.updateLoginState(LoginState.UNMAPPED);
					}
				} else if (var13 == 15 && gameState == 40) {
					packetWriter.serverPacketLength = -1;
					VarcInt.updateLoginState(LoginState.UNMAPPED_19);
				} else if (var13 == 64) {
					VarcInt.updateLoginState(LoginState.READ_STATE_11_PACKET_SIZE);
				} else if (var13 == 23 && field592 < 1) {
					++field592;
					VarcInt.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				} else if (var13 == 29) {
					VarcInt.updateLoginState(LoginState.UNMAPPED_17);
				} else {
					if (var13 != 69) {
						HttpMethod.getLoginError(var13);
						return;
					}

					VarcInt.updateLoginState(LoginState.READ_DIGEST_PARSER_PACKET_SIZE);
				}
			}

			if (class4.loginState == LoginState.UNMAPPED_21) {
				Clock.field2530 = true;
				class136.method3366(class94.field1154);
				class325.updateGameState(0);
			}

			if (class4.loginState == LoginState.READ_DIGEST_PARSER_PACKET_SIZE && var1.available() >= 2) {
				var1.read(var2.array, 0, 2);
				var2.offset = 0;
				Skeleton.field2034 = var2.readUnsignedShort();
				VarcInt.updateLoginState(LoginState.SUBMIT_DIGEST_PARSER_TASK);
			}

			if (class4.loginState == LoginState.SUBMIT_DIGEST_PARSER_TASK && var1.available() >= Skeleton.field2034) {
				var2.offset = 0;
				var1.read(var2.array, var2.offset * -2066221813, Skeleton.field2034);
				class6[] var30 = new class6[]{class6.field18};
				class6 var31 = var30[var2.readUnsignedByte()];

				try {
					class3 var34 = GraphicsDefaults.method9571(var31);
					this.field769 = new class7(var2, var34);
					VarcInt.updateLoginState(LoginState.WRITE_DIGEST_PARSER_RESULT);
				} catch (Exception var16) {
					HttpMethod.getLoginError(22);
					return;
				}
			}

			if (LoginState.WRITE_DIGEST_PARSER_RESULT == class4.loginState && this.field769.method45()) {
				this.field570 = this.field769.method48();
				this.field769.method54();
				this.field769 = null;
				if (this.field570 == null) {
					HttpMethod.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				var26 = class143.method3427();
				var26.packetBuffer.writeByte(class328.field3653.field3658);
				var26.packetBuffer.writeShort(this.field570.offset * -2066221813);
				var26.packetBuffer.writeBuffer(this.field570);
				packetWriter.addNode(var26);
				packetWriter.flush();
				this.field570 = null;
				VarcInt.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			if (class4.loginState == LoginState.READ_STATE_11_PACKET_SIZE && var1.available() > 0) {
				class7.field26 = var1.readUnsignedByte();
				VarcInt.updateLoginState(LoginState.UNMAPPED_11);
			}

			if (class4.loginState == LoginState.UNMAPPED_11 && var1.available() >= class7.field26) {
				var1.read(var2.array, 0, class7.field26);
				var2.offset = 0;
				VarcInt.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			if (class4.loginState == LoginState.READ_PROFILE_TRANSFER_TIME && var1.available() > 0) {
				field529 = (var1.readUnsignedByte() + 3) * 60;
				VarcInt.updateLoginState(LoginState.PROFILE_TRANSFER);
			}

			if (class4.loginState == LoginState.PROFILE_TRANSFER) {
				field591 = 0;
				TileItem.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field529 / 60 + " seconds.");
				if (--field529 <= 0) {
					VarcInt.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				}

			} else if (LoginState.READ_ACCOUNT_INFO_PACKET_SIZE == class4.loginState) {
				var26 = class143.method3427();
				var26.packetBuffer.writeByte(class328.field3656.field3658);
				var26.packetBuffer.writeShort(class328.field3656.field3660);
				var26.packetBuffer.method10279(class143.archive6.hash);
				var26.packetBuffer.writeIntME(class147.archive4.hash);
				var26.packetBuffer.method10279(AsyncHttpResponse.field66.hash);
				var26.packetBuffer.writeIntIME(UserComparator6.field1532.hash);
				var26.packetBuffer.writeIntME(0);
				var26.packetBuffer.method10279(class161.archive9.hash);
				var26.packetBuffer.method10279(class140.field1650.hash);
				var26.packetBuffer.writeInt(class145.field1696.hash);
				var26.packetBuffer.writeIntME(class171.field1872.hash);
				var26.packetBuffer.writeInt(class342.field3779.hash);
				var26.packetBuffer.writeInt(class231.field2558.hash);
				var26.packetBuffer.method10279(SongTask.field5037.hash);
				var26.packetBuffer.writeIntIME(class33.field150.hash);
				var26.packetBuffer.writeIntIME(HttpMethod.field39.hash);
				var26.packetBuffer.writeInt(WorldMapDecoration.archive12.hash);
				var26.packetBuffer.writeIntME(class521.archive2.hash);
				packetWriter.addNode(var26);
				packetWriter.flush();
				VarcInt.updateLoginState(LoginState.UNMAPPED);
			} else {
				if (LoginState.UNMAPPED == class4.loginState && var1.available() >= 1) {
					class133.field1571 = var1.readUnsignedByte();
					if (class133.field1571 != class328.field3654.field3660) {
						HttpMethod.getLoginError(class133.field1571);
						return;
					}

					VarcInt.updateLoginState(LoginState.READ_ACCOUNT_INFO);
				}

				if (class4.loginState == LoginState.READ_ACCOUNT_INFO && var1.available() >= class133.field1571) {
					boolean var40 = var1.readUnsignedByte() == 1;
					var1.read(var2.array, 0, 4);
					var2.offset = 0;
					boolean var39 = false;
					if (var40) {
						var14 = var2.readByteIsaac() << 24;
						var14 |= var2.readByteIsaac() << 16;
						var14 |= var2.readByteIsaac() << 8;
						var14 |= var2.readByteIsaac();
						Renderable.clientPreferences.put(Login.Login_username, var14);
					}

					if (Login_isUsernameRemembered) {
						Renderable.clientPreferences.updateRememberedUsername(Login.Login_username);
					} else {
						Renderable.clientPreferences.updateRememberedUsername((String)null);
					}

					class72.savePreferences();
					staffModLevel = var1.readUnsignedByte();
					playerMod = var1.readUnsignedByte() == 1;
					localPlayerIndex = var1.readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += var1.readUnsignedByte();
					field579 = var1.readUnsignedByte();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					this.accountHash = var2.readLong();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					userId = var2.readLong();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					userHash = var2.readLong();
					BoundaryObject.method4686().method4873(this.https);
					VarcInt.updateLoginState(LoginState.SET_SERVER_PROTOCOL);
				}

				if (LoginState.SET_SERVER_PROTOCOL == class4.loginState && var1.available() >= packetWriter.serverPacketLength) {
					var1.read(var2.array, 0, 1);
					var2.offset = 0;
					if (var2.method10251()) {
						var1.read(var2.array, 1, 1);
						var2.offset = 0;
					}

					ServerPacket[] var35 = class136.ServerPacket_values();
					var14 = var2.readSmartByteShortIsaac();
					if (var14 < 0 || var14 >= var35.length) {
						throw new IOException("Invalid ServerProt: " + var14 + " at " + var2.offset * -2066221813);
					}

					packetWriter.serverPacket = var35[var14];
					packetWriter.serverPacketLength = packetWriter.serverPacket.length;
					var1.read(var2.array, 0, 2);
					var2.offset = 0;
					packetWriter.serverPacketLength = var2.readUnsignedShort();

					try {
						class26.method393(SecureRandomCallable.client, "zap");
					} catch (Throwable var15) {
					}

					VarcInt.updateLoginState(LoginState.UPDATE_PLAYER_AND_LOAD_REGIONS);
				}

				if (class4.loginState == LoginState.UPDATE_PLAYER_AND_LOAD_REGIONS) {
					if (var1.available() >= packetWriter.serverPacketLength) {
						var2.offset = 0;
						var1.read(var2.array, 0, packetWriter.serverPacketLength);
						timer.method7593();
						WorldMapIcon_1.method5942();
						playerUpdateManager.updatePlayer(var2);
						PcmPlayer.method819();
						class137.field1641 = -1;
						HttpRequest.loadRegions(false, var2);
						packetWriter.serverPacket = null;
						field638 = false;
					}

				} else {
					if (class4.loginState == LoginState.UNMAPPED_17 && var1.available() >= 2) {
						var2.offset = 0;
						var1.read(var2.array, 0, 2);
						var2.offset = 0;
						class250.field2764 = var2.readUnsignedShort();
						VarcInt.updateLoginState(LoginState.UNMAPPED_18);
					}

					if (class4.loginState == LoginState.UNMAPPED_18 && var1.available() >= class250.field2764) {
						var2.offset = 0;
						var1.read(var2.array, 0, class250.field2764);
						var2.offset = 0;
						String var36 = var2.readStringCp1252NullTerminated();
						String var33 = var2.readStringCp1252NullTerminated();
						String var37 = var2.readStringCp1252NullTerminated();
						TileItem.setLoginResponseString(var36, var33, var37);
						class325.updateGameState(10);
						if (field515.method10602()) {
							class137.method3379(9);
						}
					}

					if (LoginState.UNMAPPED_19 == class4.loginState) {
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
							timer.method7595();
							class163.method3662();
							playerUpdateManager.updatePlayer(var2);
							if (var13 != var2.offset * -2066221813) {
								throw new RuntimeException();
							}
						}
					} else {
						++field591;
						if (field591 > 2000) {
							if (field592 < 1) {
								if (ServerPacket.currentPort == WorldMapData_0.worldPort) {
									ServerPacket.currentPort = class438.js5Port;
								} else {
									ServerPacket.currentPort = WorldMapData_0.worldPort;
								}

								++field592;
								VarcInt.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
							} else {
								HttpMethod.getLoginError(-3);
							}
						}
					}
				}
			}
		} catch (IOException var23) {
			if (field592 < 1) {
				if (WorldMapData_0.worldPort == ServerPacket.currentPort) {
					ServerPacket.currentPort = class438.js5Port;
				} else {
					ServerPacket.currentPort = WorldMapData_0.worldPort;
				}

				++field592;
				VarcInt.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
			} else {
				HttpMethod.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("pz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "18"
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
			UrlRequest.method3195();
		} else {
			if (!isMenuOpen) {
				WorldView.addCancelMenuEntry();
			}

			this.method1267();
			if (gameState == 30) {
				PacketBufferNode var1;
				int var2;
				while (class153.method3503()) {
					var1 = FloorDecoration.getPacketBufferNode(ClientPacket.field3401, packetWriter.isaacCipher);
					var1.packetBuffer.writeByte(0);
					var2 = var1.packetBuffer.offset * -2066221813;
					class167.performReflectionCheck(var1.packetBuffer);
					var1.packetBuffer.writeLengthByte(var1.packetBuffer.offset * -2066221813 - var2);
					packetWriter.addNode(var1);
				}

				if (timer.field4623) {
					var1 = FloorDecoration.getPacketBufferNode(ClientPacket.field3392, packetWriter.isaacCipher);
					var1.packetBuffer.writeByte(0);
					var2 = var1.packetBuffer.offset * -2066221813;
					timer.write(var1.packetBuffer);
					var1.packetBuffer.writeLengthByte(var1.packetBuffer.offset * -2066221813 - var2);
					packetWriter.addNode(var1);
					timer.method7606();
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
				PacketBufferNode var15;
				PacketBuffer var10000;
				synchronized(class433.mouseRecorder.lock) {
					if (!field509) {
						class433.mouseRecorder.index = 0;
					} else if (MouseHandler.MouseHandler_lastButton != 0 || class433.mouseRecorder.index >= 40) {
						var15 = null;
						var3 = 0;
						var4 = 0;
						var5 = 0;
						var6 = 0;

						for (var7 = 0; var7 < class433.mouseRecorder.index && (var15 == null || var15.packetBuffer.offset * -2066221813 - var3 < 246); ++var7) {
							var4 = var7;
							var8 = class433.mouseRecorder.ys[var7];
							if (var8 < -1) {
								var8 = -1;
							} else if (var8 > 65534) {
								var8 = 65534;
							}

							var9 = class433.mouseRecorder.xs[var7];
							if (var9 < -1) {
								var9 = -1;
							} else if (var9 > 65534) {
								var9 = 65534;
							}

							if (var9 != field581 || var8 != field724) {
								if (var15 == null) {
									var15 = FloorDecoration.getPacketBufferNode(ClientPacket.field3404, packetWriter.isaacCipher);
									var15.packetBuffer.writeByte(0);
									var3 = var15.packetBuffer.offset * -2066221813;
									var10000 = var15.packetBuffer;
									var10000.offset += 59399494;
									var5 = 0;
									var6 = 0;
								}

								if (field583 != -1L) {
									var10 = var9 - field581;
									var11 = var8 - field724;
									var12 = (int)((class433.mouseRecorder.millis[var7] - field583) / 20L);
									var5 = (int)((long)var5 + (class433.mouseRecorder.millis[var7] - field583) % 20L);
								} else {
									var10 = var9;
									var11 = var8;
									var12 = Integer.MAX_VALUE;
								}

								field581 = var9;
								field724 = var8;
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
								field583 = class433.mouseRecorder.millis[var7];
							}
						}

						if (var15 != null) {
							var15.packetBuffer.writeLengthByte(var15.packetBuffer.offset * -2066221813 - var3);
							var7 = var15.packetBuffer.offset * -2066221813;
							var15.packetBuffer.offset = var3 * 29699747;
							var15.packetBuffer.writeByte(var5 / var6);
							var15.packetBuffer.writeByte(var5 % var6);
							var15.packetBuffer.offset = var7 * 29699747;
							packetWriter.addNode(var15);
						}

						if (var4 >= class433.mouseRecorder.index) {
							class433.mouseRecorder.index = 0;
						} else {
							MouseRecorder var59 = class433.mouseRecorder;
							var59.index -= var4;
							System.arraycopy(class433.mouseRecorder.xs, var4, class433.mouseRecorder.xs, 0, class433.mouseRecorder.index);
							System.arraycopy(class433.mouseRecorder.ys, var4, class433.mouseRecorder.ys, 0, class433.mouseRecorder.index);
							System.arraycopy(class433.mouseRecorder.millis, var4, class433.mouseRecorder.millis, 0, class433.mouseRecorder.index);
						}
					}
				}

				PacketBufferNode var18;
				if (MouseHandler.MouseHandler_lastButton == 1 || !Occluder.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
					long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis;
					if (var16 > 32767L) {
						var16 = 32767L;
					}

					mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis;
					var3 = MouseHandler.MouseHandler_lastPressedY;
					if (var3 < 0) {
						var3 = 0;
					} else if (var3 > class141.canvasHeight) {
						var3 = class141.canvasHeight;
					}

					var4 = MouseHandler.MouseHandler_lastPressedX;
					if (var4 < 0) {
						var4 = 0;
					} else if (var4 > GameEngine.canvasWidth) {
						var4 = GameEngine.canvasWidth;
					}

					var5 = (int)var16;
					var18 = FloorDecoration.getPacketBufferNode(ClientPacket.field3417, packetWriter.isaacCipher);
					var18.packetBuffer.writeShort((var5 << 1) + (MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0));
					var18.packetBuffer.writeShort(var4);
					var18.packetBuffer.writeShort(var3);
					packetWriter.addNode(var18);
				}

				if (mouseWheelRotation != 0) {
					var1 = FloorDecoration.getPacketBufferNode(ClientPacket.field3455, packetWriter.isaacCipher);
					var1.packetBuffer.writeShort(mouseWheelRotation);
					packetWriter.addNode(var1);
				}

				boolean var19 = GameEngine.keyHandler.method356();
				if (var19) {
					var15 = FloorDecoration.getPacketBufferNode(ClientPacket.field3439, packetWriter.isaacCipher);
					var15.packetBuffer.writeShort(0);
					var3 = var15.packetBuffer.offset * -2066221813;
					long var20 = class282.method5908();

					for (var6 = 0; var6 < indexCheck.field3063; ++var6) {
						long var22 = var20 - field564;
						if (var22 > 16777215L) {
							var22 = 16777215L;
						}

						field564 = var20;
						var15.packetBuffer.writeIntLE((int)var22);
						var15.packetBuffer.writeByte(indexCheck.field3062[var6]);
					}

					var15.packetBuffer.writeLengthShort(var15.packetBuffer.offset * -2066221813 - var3);
					packetWriter.addNode(var15);
				}

				if (hintArrowSubX > 0) {
					--hintArrowSubX;
				}

				if (indexCheck.isValidIndexInRange(96) || indexCheck.isValidIndexInRange(97) || indexCheck.isValidIndexInRange(98) || indexCheck.isValidIndexInRange(99)) {
					field792 = true;
				}

				if (field792 && hintArrowSubX <= 0) {
					hintArrowSubX = 20;
					field792 = false;
					var15 = FloorDecoration.getPacketBufferNode(ClientPacket.field3389, packetWriter.isaacCipher);
					var15.packetBuffer.writeShortAddLE(camAngleY);
					var15.packetBuffer.writeShortAdd(camAngleX);
					packetWriter.addNode(var15);
				}

				if (class231.hasFocus && !hadFocus) {
					hadFocus = true;
					var15 = FloorDecoration.getPacketBufferNode(ClientPacket.field3384, packetWriter.isaacCipher);
					var15.packetBuffer.writeByte(1);
					packetWriter.addNode(var15);
				}

				if (!class231.hasFocus && hadFocus) {
					hadFocus = false;
					var15 = FloorDecoration.getPacketBufferNode(ClientPacket.field3384, packetWriter.isaacCipher);
					var15.packetBuffer.writeByte(0);
					packetWriter.addNode(var15);
				}

				if (GameBuild.worldMap != null) {
					GameBuild.worldMap.method9832();
				}

				if (HttpMethod.ClanChat_inClanChat) {
					if (SoundCache.friendsChat != null) {
						SoundCache.friendsChat.sort();
					}

					class442.method8359();
					HttpMethod.ClanChat_inClanChat = false;
				}

				AbstractArchive.method7783();
				int var48;
				if (field761 != class509.topLevelWorldView.plane) {
					field761 = class509.topLevelWorldView.plane;
					var48 = class509.topLevelWorldView.plane;
					int[] var43 = InterfaceParent.sceneMinimapSprite.pixels;
					var3 = var43.length;

					for (var4 = 0; var4 < var3; ++var4) {
						var43[var4] = 0;
					}

					for (var4 = 1; var4 < 103; ++var4) {
						var5 = (103 - var4) * 2048 + 24628;

						for (var6 = 1; var6 < 103; ++var6) {
							if ((class509.topLevelWorldView.tileSettings[var48][var6][var4] & 24) == 0) {
								class509.topLevelWorldView.scene.drawTileMinimap(var43, var5, 512, var48, var6, var4);
							}

							if (var48 < 3 && (class509.topLevelWorldView.tileSettings[var48 + 1][var6][var4] & 8) != 0) {
								class509.topLevelWorldView.scene.drawTileMinimap(var43, var5, 512, var48 + 1, var6, var4);
							}

							var5 += 4;
						}
					}

					var4 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
					var5 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
					InterfaceParent.sceneMinimapSprite.setRaster();

					for (var6 = 1; var6 < 103; ++var6) {
						for (var7 = 1; var7 < 103; ++var7) {
							if ((class509.topLevelWorldView.tileSettings[var48][var7][var6] & 24) == 0) {
								class446.drawObject(var48, var7, var6, var4, var5);
							}

							if (var48 < 3 && (class509.topLevelWorldView.tileSettings[var48 + 1][var7][var6] & 8) != 0) {
								class446.drawObject(var48 + 1, var7, var6, var4, var5);
							}
						}
					}

					mapIconCount = 0;

					for (var6 = 0; var6 < 104; ++var6) {
						for (var7 = 0; var7 < 104; ++var7) {
							long var24 = class509.topLevelWorldView.scene.getFloorDecorationTag(class509.topLevelWorldView.plane, var6, var7);
							if (var24 != 0L) {
								var10 = HttpMethod.Entity_unpackID(var24);
								var11 = class162.getObjectDefinition(var10).mapIconId;
								if (var11 >= 0 && ArchiveDiskAction.WorldMapElement_get(var11).field2594) {
									mapIcons[mapIconCount] = ArchiveDiskAction.WorldMapElement_get(var11).getSpriteBool(false);
									mapIconXs[mapIconCount] = var6;
									field684[mapIconCount] = var7;
									++mapIconCount;
								}
							}
						}
					}

					GameEngine.rasterProvider.apply();
				}

				if (gameState == 30) {
					Iterator var35 = worldViewManager.iterator();

					while (var35.hasNext()) {
						WorldView var45 = (WorldView)var35.next();
						class224.method4943(var45);
					}

					int var10002;
					for (var48 = 0; var48 < soundEffectCount; ++var48) {
						var10002 = queuedSoundEffectDelays[var48]--;
						if (queuedSoundEffectDelays[var48] >= -10) {
							SoundEffect var46 = soundEffects[var48];
							if (var46 == null) {
								var10000 = null;
								var46 = SoundEffect.readSoundEffect(ClientPacket.field3483, soundEffectIds[var48], 0);
								if (var46 == null) {
									continue;
								}

								int[] var60 = queuedSoundEffectDelays;
								var60[var48] += var46.calculateDelay();
								soundEffects[var48] = var46;
							}

							if (queuedSoundEffectDelays[var48] < 0) {
								if (soundLocations[var48] != 0) {
									var4 = (soundLocations[var48] & 255) * 128;
									var5 = soundLocations[var48] >> 16 & 255;
									var6 = Math.abs(Coord.method6897(var5) - Script.localPlayer.x);
									var7 = soundLocations[var48] >> 8 & 255;
									var8 = Math.abs(Coord.method6897(var7) - Script.localPlayer.y);
									var9 = Math.max(var6 + var8 - 128, 0);
									var10 = Math.max(((field552[var48] & 31) - 1) * 128, 0);
									if (var9 >= var4) {
										queuedSoundEffectDelays[var48] = -100;
										continue;
									}

									float var42 = var10 < var4 ? Math.min(Math.max((float)(var4 - var9) / (float)(var4 - var10), 0.0F), 1.0F) : 1.0F;
									var3 = (int)(var42 * (float)Renderable.clientPreferences.getAreaSoundEffectsVolume());
								} else {
									var3 = Renderable.clientPreferences.getSoundEffectsVolume();
								}

								if (var3 > 0) {
									boolean var37 = Renderable.clientPreferences.method2779();
									RawSound var26 = var46.method755(var37).resample(class153.field1736);
									RawPcmStream var44 = RawPcmStream.method895(var26, 100, var3);
									if (var44 != null) {
										var44.setNumLoops(queuedSoundEffectLoops[var48] - 1);
										BufferedSink.pcmStreamMixer.addSubStream(var44);
									}
								}

								queuedSoundEffectDelays[var48] = -100;
							}
						} else {
							--soundEffectCount;

							for (var2 = var48; var2 < soundEffectCount; ++var2) {
								soundEffectIds[var2] = soundEffectIds[var2 + 1];
								soundEffects[var2] = soundEffects[var2 + 1];
								queuedSoundEffectLoops[var2] = queuedSoundEffectLoops[var2 + 1];
								queuedSoundEffectDelays[var2] = queuedSoundEffectDelays[var2 + 1];
								soundLocations[var2] = soundLocations[var2 + 1];
								field552[var2] = field552[var2 + 1];
							}

							--var48;
						}
					}

					if (playingJingle && !SoundSystem.method861()) {
						if (Renderable.clientPreferences.getMusicVolume() != 0) {
							var19 = !class335.field3698.isEmpty();
							if (var19) {
								class230.method5022(class133.field1576, Renderable.clientPreferences.getMusicVolume());
							}
						}

						playingJingle = false;
					}

					++packetWriter.field1475;
					if (packetWriter.field1475 > 750) {
						UrlRequest.method3195();
					} else {
						HealthBarUpdate.method2704();
						class230.method5021();
						class505.method9568();
						HttpRequestTask.method287();
						++graphicsCycle;
						if (mouseCrossColor != 0) {
							mouseCrossState = mouseCrossState * 400 + 20;
							if (mouseCrossState * 400 >= 400) {
								mouseCrossColor = 0;
							}
						}

						if (field785 > 0) {
							--field785;
						}

						Widget var36 = AbstractUserComparator.field5138;
						Widget var50 = class555.field5526;
						AbstractUserComparator.field5138 = null;
						class555.field5526 = null;
						draggedOnWidget = null;
						field520 = false;
						field725 = false;
						field627 = 0;

						while (indexCheck.method5689() && field627 < 128) {
							if (staffModLevel >= 2 && indexCheck.isValidIndexInRange(82) && indexCheck.field3071 == 66) {
								String var27 = class134.method3313();
								SecureRandomCallable.client.method637(var27);
							} else if (oculusOrbState != 1 || indexCheck.field3066 <= 0) {
								field629[field627] = indexCheck.field3071;
								field575[field627] = indexCheck.field3066;
								++field627;
							}
						}

						if (class554.method10138() && indexCheck.isValidIndexInRange(82) && indexCheck.isValidIndexInRange(81) && mouseWheelRotation != 0) {
							var3 = Script.localPlayer.plane - mouseWheelRotation;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > 3) {
								var3 = 3;
							}

							if (var3 != Script.localPlayer.plane) {
								var4 = Script.localPlayer.pathX[0] + class509.topLevelWorldView.baseX;
								var5 = Script.localPlayer.pathY[0] + class509.topLevelWorldView.baseY;
								var18 = FloorDecoration.getPacketBufferNode(ClientPacket.field3386, packetWriter.isaacCipher);
								var18.packetBuffer.writeShortAdd(var5);
								var18.packetBuffer.writeByteAdd(var3);
								var18.packetBuffer.writeIntME(0);
								var18.packetBuffer.writeShortLE(var4);
								packetWriter.addNode(var18);
							}

							mouseWheelRotation = 0;
						}

						if (rootInterface != -1) {
							DynamicObject.updateRootInterface(rootInterface, 0, 0, GameEngine.canvasWidth, class141.canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							Widget var28;
							Widget var51;
							ScriptEvent var52;
							do {
								var52 = (ScriptEvent)field620.removeLast();
								if (var52 == null) {
									while (true) {
										do {
											var52 = (ScriptEvent)field621.removeLast();
											if (var52 == null) {
												while (true) {
													do {
														var52 = (ScriptEvent)scriptEvents.removeLast();
														if (var52 == null) {
															boolean var38 = false;

															while (true) {
																class269 var55 = (class269)field622.removeLast();
																if (var55 == null) {
																	if (!var38 && MouseHandler.MouseHandler_lastButton == 1) {
																		field654.method5641();
																	}

																	this.menu();
																	if (GameBuild.worldMap != null) {
																		GameBuild.worldMap.method9809(class509.topLevelWorldView.plane, (field696 >> 7) + class509.topLevelWorldView.baseX, (field697 >> 7) + class509.topLevelWorldView.baseY, false);
																		GameBuild.worldMap.loadCache();
																	}

																	if (clickedWidget != null) {
																		this.method1274();
																	}

																	Iterator var56 = worldViewManager.iterator();

																	while (var56.hasNext()) {
																		WorldView var53 = (WorldView)var56.next();
																		Scene var47 = var53.scene;
																		if (var47.shouldSendWalk()) {
																			var7 = var47.baseX;
																			var8 = var47.baseY;
																			PacketBufferNode var29 = FloorDecoration.getPacketBufferNode(ClientPacket.field3438, packetWriter.isaacCipher);
																			var29.packetBuffer.writeByte(5);
																			var29.packetBuffer.writeShortAdd(var7 + var53.baseX);
																			var29.packetBuffer.writeByteSub(indexCheck.isValidIndexInRange(82) ? (indexCheck.isValidIndexInRange(81) ? 2 : 1) : 0);
																			var29.packetBuffer.writeShortAdd(var8 + var53.baseY);
																			packetWriter.addNode(var29);
																			mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																			mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																			mouseCrossColor = 1;
																			mouseCrossState = 0;
																			destinationX = var7;
																			destinationY = var8;
																			var47.method4112();
																		}
																	}

																	if (var36 != AbstractUserComparator.field5138) {
																		if (var36 != null) {
																			class139.invalidateWidget(var36);
																		}

																		if (AbstractUserComparator.field5138 != null) {
																			class139.invalidateWidget(AbstractUserComparator.field5138);
																		}
																	}

																	if (var50 != class555.field5526 && field712 == field691) {
																		if (var50 != null) {
																			class139.invalidateWidget(var50);
																		}

																		if (class555.field5526 != null) {
																			class139.invalidateWidget(class555.field5526);
																		}
																	}

																	if (class555.field5526 != null) {
																		if (field691 < field712) {
																			++field691;
																			if (field691 == field712) {
																				class139.invalidateWidget(class555.field5526);
																			}
																		}
																	} else if (field691 > 0) {
																		--field691;
																	}

																	if (oculusOrbState == 0) {
																		WorldView var58 = worldViewManager.getWorldView(field668);
																		if (var58 == null) {
																			var58 = class509.topLevelWorldView;
																		}

																		Object var54 = null;
																		switch(ItemContainer.USERNAME_PASSWORD.field4188) {
																		case 0:
																			var54 = (Entity)var58.players.get((long)field532);
																			break;
																		case 1:
																			var54 = (Entity)var58.npcs.get((long)field532);
																			break;
																		case 2:
																			var54 = (Entity)var58.worldEntities.get((long)field532);
																		}

																		if (var54 == null) {
																			var54 = Script.localPlayer;
																		}

																		field696 = ((Entity)var54).getY();
																		field697 = ((Entity)var54).getPlane();
																		if (var58 != class509.topLevelWorldView) {
																			var7 = ((Entity)var54).getY();
																			var8 = ((Entity)var54).getPlane();
																			class442 var49;
																			if (var58 == class509.topLevelWorldView) {
																				var49 = class219.method4844((float)var7, 0.0F, (float)var8);
																			} else {
																				WorldEntity var57 = (WorldEntity)class509.topLevelWorldView.worldEntities.get((long)var58.id);
																				if (var57 == null) {
																					var49 = class219.method4844((float)var7, 0.0F, (float)var8);
																				} else {
																					var49 = var57.method9358(var7, var8);
																				}
																			}

																			field696 = (int)var49.field4918;
																			field697 = (int)var49.field4922;
																			var49.method8339();
																		}

																		var6 = ((Entity)var54).getX();
																		if (ReflectionCheck.oculusOrbFocalPointX - field696 >= -500 && ReflectionCheck.oculusOrbFocalPointX - field696 <= 500 && KeyHandler.oculusOrbFocalPointY - field697 >= -500 && KeyHandler.oculusOrbFocalPointY - field697 <= 500) {
																			if (field696 != ReflectionCheck.oculusOrbFocalPointX) {
																				ReflectionCheck.oculusOrbFocalPointX += (field696 - ReflectionCheck.oculusOrbFocalPointX) / 16;
																			}

																			if (KeyHandler.oculusOrbFocalPointY != field697) {
																				KeyHandler.oculusOrbFocalPointY += (field697 - KeyHandler.oculusOrbFocalPointY) / 16;
																			}
																		} else {
																			ReflectionCheck.oculusOrbFocalPointX = field696;
																			KeyHandler.oculusOrbFocalPointY = field697;
																		}

																		var7 = ReflectionCheck.oculusOrbFocalPointX >> 7;
																		var8 = KeyHandler.oculusOrbFocalPointY >> 7;
																		var9 = GraphicsObject.getTileHeight(class509.topLevelWorldView, ReflectionCheck.oculusOrbFocalPointX, KeyHandler.oculusOrbFocalPointY, var6);
																		var10 = 0;
																		if (var7 > 3 && var8 > 3 && var7 < 100 && var8 < 100) {
																			for (var11 = var7 - 4; var11 <= var7 + 4; ++var11) {
																				for (var12 = var8 - 4; var12 <= var8 + 4; ++var12) {
																					int var30 = var6;
																					if (var6 < 3 && (class509.topLevelWorldView.tileSettings[1][var11][var12] & 2) == 2) {
																						var30 = var6 + 1;
																					}

																					int var14 = var9 - class509.topLevelWorldView.tileHeights[var30][var11][var12];
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

																		if (var11 > field675) {
																			field675 += (var11 - field675) / 24;
																		} else if (var11 < field675) {
																			field675 += (var11 - field675) / 80;
																		}

																		field758 = GraphicsObject.getTileHeight(var58, ((Entity)var54).getY(), ((Entity)var54).getPlane(), var6);
																		if (var58 != null) {
																			WorldEntity var31 = (WorldEntity)class509.topLevelWorldView.worldEntities.get((long)var58.id);
																			if (var31 != null) {
																				field758 += GraphicsObject.getTileHeight(class509.topLevelWorldView, var31.getY(), var31.getPlane(), var31.getX());
																			}
																		}

																		class165.oculusOrbFocalPointZ = field758 - camFollowHeight;
																	} else if (oculusOrbState == 1) {
																		WorldMapDecorationType.method7544();
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

																		byte var39 = 0;
																		if (indexCheck.isValidIndexInRange(35)) {
																			var39 = -1;
																		} else if (indexCheck.isValidIndexInRange(51)) {
																			var39 = 1;
																		}

																		var6 = 0;
																		if (var40 >= 0 || var39 != 0) {
																			var6 = indexCheck.isValidIndexInRange(81) ? oculusOrbSlowedSpeed : oculusOrbNormalSpeed;
																			var6 *= 16;
																			field774 = var40;
																			field670 = var39;
																		}

																		if (field596 < var6) {
																			field596 += var6 / 8;
																			if (field596 > var6) {
																				field596 = var6;
																			}
																		} else if (field596 > var6) {
																			field596 = field596 * 9 / 10;
																		}

																		if (field596 > 0) {
																			var7 = field596 / 16;
																			if (field774 >= 0) {
																				var4 = field774 - AsyncHttpResponse.cameraYaw & 2047;
																				var8 = Rasterizer3D.Rasterizer3D_sine[var4];
																				var9 = Rasterizer3D.Rasterizer3D_cosine[var4];
																				ReflectionCheck.oculusOrbFocalPointX += var8 * var7 / 65536;
																				KeyHandler.oculusOrbFocalPointY += var7 * var9 / 65536;
																			}

																			if (field670 != 0) {
																				class165.oculusOrbFocalPointZ += var7 * field670;
																				if (class165.oculusOrbFocalPointZ > 0) {
																					class165.oculusOrbFocalPointZ = 0;
																				}
																			}
																		} else {
																			field774 = -1;
																			field670 = -1;
																		}

																		char var41 = '耀';
																		if (var41 > field675) {
																			field675 += (var41 - field675) / 24;
																		} else if (var41 < field675) {
																			field675 += (var41 - field675) / 80;
																		}

																		if (indexCheck.isValidIndexInRange(13)) {
																			packetWriter.addNode(FloorDecoration.getPacketBufferNode(ClientPacket.field3467, packetWriter.isaacCipher));
																			oculusOrbState = 0;
																		}
																	}

																	if (MouseHandler.MouseHandler_currentButton == 4 && Occluder.mouseCam) {
																		var4 = MouseHandler.MouseHandler_y - field605;
																		field603 = var4 * 2;
																		field605 = var4 != -1 && var4 != 1 ? (MouseHandler.MouseHandler_y + field605) / 2 : MouseHandler.MouseHandler_y;
																		var5 = field807 - MouseHandler.MouseHandler_x;
																		camAngleDY = var5 * 2;
																		field807 = var5 != -1 && var5 != 1 ? (field807 + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x;
																	} else {
																		if (indexCheck.isValidIndexInRange(96)) {
																			camAngleDY += (-24 - camAngleDY) / 2;
																		} else if (indexCheck.isValidIndexInRange(97)) {
																			camAngleDY += (24 - camAngleDY) / 2;
																		} else {
																			camAngleDY /= 2;
																		}

																		if (indexCheck.isValidIndexInRange(98)) {
																			field603 += (12 - field603) / 2;
																		} else if (indexCheck.isValidIndexInRange(99)) {
																			field603 += (-12 - field603) / 2;
																		} else {
																			field603 /= 2;
																		}

																		field605 = MouseHandler.MouseHandler_y;
																		field807 = MouseHandler.MouseHandler_x;
																	}

																	camAngleY = camAngleDY / 2 + camAngleY & 2047;
																	camAngleX += field603 / 2;
																	if (camAngleX < 128) {
																		camAngleX = 128;
																	}

																	if (camAngleX > 383) {
																		camAngleX = 383;
																	}

																	if (field633) {
																		WorldMapSectionType.method6302(AddRequestTask.field5021, Projection.field2196, AsyncRestClient.field55);
																		BoundaryObject.method4685(class30.field131, SwapSongTask.field5023);
																		if (AddRequestTask.field5021 == MusicPatchNode2.cameraX && TaskHandler.cameraY == Projection.field2196 && SceneTilePaint.cameraZ == AsyncRestClient.field55 && class258.cameraPitch == class30.field131 && SwapSongTask.field5023 == AsyncHttpResponse.cameraYaw) {
																			field633 = false;
																			isCameraLocked = false;
																			field681 = false;
																			field582 = false;
																			SceneTilePaint.field2331 = 0;
																			class361.field3904 = 0;
																			WorldMapSection1.field3326 = 0;
																			GameBuild.field4198 = 0;
																			Timer.field4632 = 0;
																			class342.field3777 = 0;
																			WorldEntity.field5170 = 0;
																			class346.field3809 = 0;
																			Renderable.field2162 = 0;
																			PlatformInfo.field5362 = 0;
																			field754 = null;
																			field674 = null;
																			field780 = null;
																		}
																	} else if (isCameraLocked) {
																		if (!field681) {
																			var4 = Coord.method6897(class346.field3809);
																			var5 = Coord.method6897(Renderable.field2162);
																			var6 = GraphicsObject.getTileHeight(class509.topLevelWorldView, var4, var5, class509.topLevelWorldView.plane) - PlatformInfo.field5362;
																			WorldMapSectionType.method6302(var4, var6, var5);
																		} else if (field754 != null) {
																			MusicPatchNode2.cameraX = field754.vmethod9768();
																			SceneTilePaint.cameraZ = field754.vmethod9763();
																			if (field778) {
																				TaskHandler.cameraY = field754.vmethod9764();
																			} else {
																				TaskHandler.cameraY = GraphicsObject.getTileHeight(class509.topLevelWorldView, MusicPatchNode2.cameraX, SceneTilePaint.cameraZ, class509.topLevelWorldView.plane) - field754.vmethod9764();
																			}

																			field754.method9771();
																		}

																		if (!field582) {
																			var4 = Coord.method6897(SceneTilePaint.field2331);
																			var5 = Coord.method6897(class361.field3904);
																			var6 = GraphicsObject.getTileHeight(class509.topLevelWorldView, var4, var5, class509.topLevelWorldView.plane) - WorldMapSection1.field3326;
																			var7 = var4 - MusicPatchNode2.cameraX;
																			var8 = var6 - TaskHandler.cameraY;
																			var9 = var5 - SceneTilePaint.cameraZ;
																			var10 = (int)Math.sqrt((double)(var9 * var9 + var7 * var7));
																			var11 = (int)(Math.atan2((double)var8, (double)var10) * 325.9490051269531D) & 2047;
																			var12 = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531D) & 2047;
																			BoundaryObject.method4685(var11, var12);
																		} else {
																			if (field674 != null) {
																				class258.cameraPitch = field674.method9757();
																				class258.cameraPitch = Math.min(Math.max(class258.cameraPitch, 128), 383);
																				field674.method9771();
																			}

																			if (field780 != null) {
																				AsyncHttpResponse.cameraYaw = field780.method9757() & 2047;
																				field780.method9771();
																			}
																		}
																	}

																	for (var4 = 0; var4 < 5; ++var4) {
																		var10002 = field786[var4]++;
																	}

																	NPCComposition.varcs.tryWrite();
																	var4 = ++MouseHandler.MouseHandler_idleCycles - 1;
																	var6 = class148.method3469();
																	PacketBufferNode var32;
																	if (var4 > 15000 && var6 > 15000) {
																		logoutTimer = 250;
																		class256.method5322(14500);
																		var32 = FloorDecoration.getPacketBufferNode(ClientPacket.field3427, packetWriter.isaacCipher);
																		packetWriter.addNode(var32);
																	}

																	class223.friendSystem.processFriendUpdates();
																	class28.method442();
																	++packetWriter.pendingWrites;
																	if (packetWriter.pendingWrites > 50) {
																		var32 = FloorDecoration.getPacketBufferNode(ClientPacket.field3473, packetWriter.isaacCipher);
																		packetWriter.addNode(var32);
																	}

																	try {
																		packetWriter.flush();
																	} catch (IOException var33) {
																		UrlRequest.method3195();
																	}

																	BoundaryObject.method4686().method4853();
																	return;
																}

																if (var55.field3058.type == 12) {
																	var38 = true;
																}

																ConcurrentMidiTask.method8936(var55);
															}
														}

														var28 = var52.widget;
														if (var28.childIndex * -1626125685 < 0) {
															break;
														}

														var51 = class232.widgetDefinition.method6951(var28.parentId);
													} while(var51 == null || var51.children == null || var28.childIndex * -1626125685 >= var51.children.length || var28 != var51.children[var28.childIndex * -1626125685]);

													class60.runScriptEvent(var52);
												}
											}

											var28 = var52.widget;
											if (var28.childIndex * -1626125685 < 0) {
												break;
											}

											var51 = class232.widgetDefinition.method6951(var28.parentId);
										} while(var51 == null || var51.children == null || var28.childIndex * -1626125685 >= var51.children.length || var28 != var51.children[var28.childIndex * -1626125685]);

										class60.runScriptEvent(var52);
									}
								}

								var28 = var52.widget;
								if (var28.childIndex * -1626125685 < 0) {
									break;
								}

								var51 = class232.widgetDefinition.method6951(var28.parentId);
							} while(var51 == null || var51.children == null || var28.childIndex * -1626125685 >= var51.children.length || var28 != var51.children[var28.childIndex * -1626125685]);

							class60.runScriptEvent(var52);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("pn")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1634464213"
	)
	public void vmethod6826(int var1, int var2) {
		if (packetWriter != null && packetWriter.isaacCipher != null) {
			if (var1 > -1 && Renderable.clientPreferences.getMusicVolume() > 0 && !playingJingle) {
				PacketBufferNode var3 = FloorDecoration.getPacketBufferNode(ClientPacket.field3444, packetWriter.isaacCipher);
				var3.packetBuffer.writeInt(var1);
				packetWriter.addNode(var3);
			}

		}
	}

	@ObfuscatedName("px")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1385188409"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = GameEngine.canvasWidth;
		int var2 = class141.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}

		if (Renderable.clientPreferences != null) {
			try {
				class26.method389(SecureRandomCallable.client, "resize", new Object[]{class171.getWindowedMode()});
			} catch (Throwable var4) {
			}
		}

	}

	@ObfuscatedName("pk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1553848381"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) {
			class153.method3511(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (validRootWidgets[var1]) {
				field558[var1] = true;
			}

			field752[var1] = validRootWidgets[var1];
			validRootWidgets[var1] = false;
		}

		field779 = cycle;
		viewportX = -1;
		viewportY = -1;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			class33.drawWidgets(rootInterface, 0, 0, GameEngine.canvasWidth, class141.canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				class240.crossSprites[mouseCrossState * 400 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				class240.crossSprites[mouseCrossState * 400 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}

		int var2;
		int var3;
		if (!isMenuOpen) {
			if (viewportX != -1) {
				var1 = viewportX;
				var2 = viewportY;
				if ((menu.menuOptionsCount >= 2 || isItemSelected != 0 || isSpellSelected) && showMouseOverText) {
					var3 = MenuAction.method2255();
					String var4;
					if (isItemSelected == 1 && menu.menuOptionsCount < 2) {
						var4 = "Use" + " " + field713 + " " + "->";
					} else if (isSpellSelected && menu.menuOptionsCount < 2) {
						var4 = selectedSpellActionName + " " + selectedSpellName + " " + "->";
					} else {
						var4 = menu.method10936(var3);
					}

					if (menu.menuOptionsCount > 2) {
						var4 = var4 + Decimator.colorStartTag(16777215) + " " + '/' + " " + (menu.menuOptionsCount - 2) + " more options";
					}

					class440.fontBold12.drawRandomAlphaAndSpacing(var4, var1 + 4, var2 + 15, 16777215, 0, cycle / 1000);
				}
			}
		} else {
			menu.method10937();
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field752[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field558[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		var1 = class509.topLevelWorldView.plane;
		var2 = Script.localPlayer.x;
		var3 = Script.localPlayer.y;
		int var13 = graphicsCycle;

		for (ObjectSound var5 = (ObjectSound)ObjectSound.objectSounds.last(); var5 != null; var5 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var5.soundEffectId != -1 || var5.soundEffectIds != null) {
				int var6 = 0;
				if (var2 > var5.maxX * 16384) {
					var6 += var2 - var5.maxX * 16384;
				} else if (var2 < var5.x * 16384) {
					var6 += var5.x * 16384 - var2;
				}

				if (var3 > var5.maxY * 16384) {
					var6 += var3 - var5.maxY * 16384;
				} else if (var3 < var5.y * 16384) {
					var6 += var5.y * 16384 - var3;
				}

				var6 = Math.max(var6 - 64, 0);
				if (var6 < var5.field844 && Renderable.clientPreferences.getAreaSoundEffectsVolume() != 0 && var1 == var5.plane) {
					float var7 = var5.field838 < var5.field844 ? Math.min(Math.max((float)(var5.field844 - var6) / (float)(var5.field844 - var5.field838), 0.0F), 1.0F) : 1.0F;
					int var8 = (int)(var7 * (float)Renderable.clientPreferences.getAreaSoundEffectsVolume());
					Object var10000;
					if (var5.stream1 == null) {
						if (var5.soundEffectId >= 0) {
							var10000 = null;
							SoundEffect var9 = SoundEffect.readSoundEffect(ClientPacket.field3483, var5.soundEffectId, 0);
							if (var9 != null) {
								RawSound var10 = var9.method755(Renderable.clientPreferences.method2779()).resample(class153.field1736);
								RawPcmStream var11 = RawPcmStream.method895(var10, 100, var8);
								var11.setNumLoops(-1);
								BufferedSink.pcmStreamMixer.addSubStream(var11);
								var5.stream1 = var11;
							}
						}
					} else {
						var5.stream1.method918(var8);
					}

					if (var5.stream2 == null) {
						if (var5.soundEffectIds != null && (var5.field854 -= var13) <= 0) {
							int var14 = (int)(Math.random() * (double)var5.soundEffectIds.length);
							var10000 = null;
							SoundEffect var15 = SoundEffect.readSoundEffect(ClientPacket.field3483, var5.soundEffectIds[var14], 0);
							if (var15 != null) {
								RawSound var16 = var15.method755(Renderable.clientPreferences.method2779()).resample(class153.field1736);
								RawPcmStream var12 = RawPcmStream.method895(var16, 100, var8);
								var12.setNumLoops(0);
								BufferedSink.pcmStreamMixer.addSubStream(var12);
								var5.stream2 = var12;
								var5.field854 = var5.field848 + (int)(Math.random() * (double)(var5.field849 - var5.field848));
							}
						}
					} else {
						var5.stream2.method918(var8);
						if (!var5.stream2.hasNext()) {
							var5.stream2 = null;
						}
					}
				} else {
					if (var5.stream1 != null) {
						BufferedSink.pcmStreamMixer.removeSubStream(var5.stream1);
						var5.stream1 = null;
					}

					if (var5.stream2 != null) {
						BufferedSink.pcmStreamMixer.removeSubStream(var5.stream2);
						var5.stream2 = null;
					}
				}
			}
		}

		graphicsCycle = 0;
	}

	@ObfuscatedName("pf")
	@ObfuscatedSignature(
		descriptor = "(Leb;I)Z",
		garbageValue = "-154929044"
	)
	boolean method1265(PacketWriter var1) {
		if (var1.serverPacketLength == 0) {
			SoundCache.friendsChat = null;
		} else {
			if (SoundCache.friendsChat == null) {
				SoundCache.friendsChat = new FriendsChat(class339.loginType, SecureRandomCallable.client);
			}

			SoundCache.friendsChat.method9142(var1.packetBuffer);
		}

		field741 = cycleCntr;
		HttpMethod.ClanChat_inClanChat = true;
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("ph")
	@ObfuscatedSignature(
		descriptor = "(Leb;I)Z",
		garbageValue = "733833078"
	)
	boolean method1351(PacketWriter var1) {
		if (SoundCache.friendsChat != null) {
			SoundCache.friendsChat.method9148(var1.packetBuffer);
		}

		field741 = cycleCntr;
		HttpMethod.ClanChat_inClanChat = true;
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("pu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1664627047"
	)
	void method1267() {
		int var1 = 0;
		boolean var2 = packetWriter.field1471 > 0;

		for (int var3 = packetWriter.field1472; var1 < 100 || var2; var2 = packetWriter.field1471 > 0) {
			boolean var4 = this.method1434(packetWriter);
			if (var2) {
				int var5 = packetWriter.field1472 - var3;
				PacketWriter var10000 = packetWriter;
				var10000.field1471 -= var5;
			}

			if (!var4) {
				break;
			}

			++var1;
			var3 = packetWriter.field1472;
		}

	}

	@ObfuscatedName("po")
	@ObfuscatedSignature(
		descriptor = "(Leb;I)Z",
		garbageValue = "-547398595"
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
				if (var1.field1471 > 0 && !var2.isAvailable(var1.field1471)) {
					return false;
				}

				int var5;
				if (var1.serverPacket == null) {
					if (var1.field1468) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var1.field1472 += var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1475 = 0;
						var1.field1468 = false;
					}

					var3.offset = 0;
					if (var3.method10251()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var1.field1472 += var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1475 = 0;
					}

					var1.field1468 = true;
					ServerPacket[] var4 = class136.ServerPacket_values();
					var5 = var3.readSmartByteShortIsaac();
					if (var5 < 0 || var5 >= var4.length) {
						throw new IOException(var5 + " " + var3.offset * -2066221813);
					}

					var1.serverPacket = var4[var5];
					var1.serverPacketLength = var1.serverPacket.length;
				}

				if (var1.serverPacketLength == -1) {
					if (!var2.isAvailable(1)) {
						return false;
					}

					var1.field1472 += var2.read(var3.array, 0, 1);
					var1.serverPacketLength = var3.array[0] & 255;
				}

				if (var1.serverPacketLength == -2) {
					if (!var2.isAvailable(2)) {
						return false;
					}

					var1.field1472 += var2.read(var3.array, 0, 2);
					var3.offset = 0;
					var1.serverPacketLength = var3.readUnsignedShort();
				}

				if (!var2.isAvailable(var1.serverPacketLength)) {
					return false;
				}

				var3.offset = 0;
				var1.field1472 += var2.read(var3.array, 0, var1.serverPacketLength);
				var1.field1475 = 0;
				timer.method7592();
				var1.field1463 = var1.field1474;
				var1.field1474 = var1.field1461;
				var1.field1461 = var1.serverPacket;
				int var21;
				String var58;
				boolean var62;
				if (ServerPacket.field3601 == var1.serverPacket) {
					var21 = var3.readUShortSmart();
					var62 = var3.readUnsignedByte() == 1;
					var58 = "";
					boolean var78 = false;
					if (var62) {
						var58 = var3.readStringCp1252NullTerminated();
						if (class223.friendSystem.isIgnored(new Username(var58, class339.loginType))) {
							var78 = true;
						}
					}

					String var64 = var3.readStringCp1252NullTerminated();
					if (!var78) {
						class279.addGameMessage(var21, var58, var64);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3631 == var1.serverPacket) {
					if (class277.field3140 == null) {
						class277.field3140 = new class509(LoginState.field491);
					}

					class578 var57 = LoginState.field491.method9584(var3);
					class277.field3140.field5268.vmethod10026(var57.field5663, var57.field5662);
					field738[++field804 - 1 & 31] = var57.field5663;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3642 == var1.serverPacket) {
					var21 = var3.readShort();
					worldViewManager.method2611(var21);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3549 == var1.serverPacket) {
					class251.field2775 = var3.readUnsignedByteSub();
					class300.field3306 = var3.readUnsignedByteNeg();
					field660 = var3.readUnsignedByte();

					while (var3.offset * -2066221813 < var1.serverPacketLength) {
						var21 = var3.readUnsignedByte();
						class325 var94 = WorldMapSection2.method5969()[var21];
						class555.method10157(var94);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3633 == var1.serverPacket) {
					class555.method10157(class325.field3489);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3531 == var1.serverPacket) {
					class440.logOut();
					var1.serverPacket = null;
					return false;
				}

				Widget var56;
				if (ServerPacket.field3565 == var1.serverPacket) {
					var21 = var3.readUnsignedShortAdd();
					var5 = var3.method10352();
					var56 = class232.widgetDefinition.method6951(var5);
					if (var56.modelType != 2 || var21 != var56.modelId) {
						var56.modelType = 2;
						var56.modelId = var21;
						class139.invalidateWidget(var56);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3578 == var1.serverPacket) {
					isCameraLocked = true;
					field633 = false;
					field681 = false;
					class346.field3809 = var3.readUnsignedByte();
					Renderable.field2162 = var3.readUnsignedByte();
					PlatformInfo.field5362 = var3.readUnsignedShort();
					WorldEntity.field5170 = var3.readUnsignedByte();
					class342.field3777 = var3.readUnsignedByte();
					if (class342.field3777 >= 100) {
						MusicPatchNode2.cameraX = Coord.method6897(class346.field3809);
						SceneTilePaint.cameraZ = Coord.method6897(Renderable.field2162);
						TaskHandler.cameraY = GraphicsObject.getTileHeight(class509.topLevelWorldView, MusicPatchNode2.cameraX, SceneTilePaint.cameraZ, class509.topLevelWorldView.plane) - PlatformInfo.field5362;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3589 == var1.serverPacket) {
					class555.method10157(class325.field3496);
					var1.serverPacket = null;
					return true;
				}

				int var7;
				int var9;
				int var10;
				int var11;
				int var14;
				int var15;
				int var24;
				if (ServerPacket.field3606 == var1.serverPacket) {
					isCameraLocked = true;
					field633 = false;
					field582 = true;
					SceneTilePaint.field2331 = var3.readUnsignedByte();
					class361.field3904 = var3.readUnsignedByte();
					WorldMapSection1.field3326 = var3.readUnsignedShort();
					var21 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var23 = Coord.method6897(SceneTilePaint.field2331);
					var7 = Coord.method6897(class361.field3904);
					var24 = GraphicsObject.getTileHeight(class509.topLevelWorldView, var23, var7, class509.topLevelWorldView.plane) - WorldMapSection1.field3326;
					var9 = var23 - MusicPatchNode2.cameraX;
					var10 = var24 - TaskHandler.cameraY;
					var11 = var7 - SceneTilePaint.cameraZ;
					double var67 = Math.sqrt((double)(var9 * var9 + var11 * var11));
					var14 = ArchiveLoader.method2433((int)(Math.atan2((double)var10, var67) * 325.9490051269531D) & 2047);
					var15 = class149.method3477((int)(Math.atan2((double)var9, (double)var11) * -325.9490051269531D) & 2047);
					field674 = new class534(class258.cameraPitch, var14, var21, var5);
					field780 = new class534(AsyncHttpResponse.cameraYaw, var15, var21, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3586 == var1.serverPacket) {
					class223.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					SoundCache.FriendSystem_invalidateIgnoreds();
					field740 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3644 == var1.serverPacket) {
					class555.method10157(class325.field3486);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3645 == var1.serverPacket) {
					var21 = var3.readInt();
					if (var21 != field671) {
						field671 = var21;
						ClientPreferences.method2841();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3577 == var1.serverPacket) {
					HttpRequest.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3554 == var1.serverPacket) {
					class555.method10157(class325.field3495);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3624 == var1.serverPacket) {
					class555.method10157(class325.field3488);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3611 == var1.serverPacket) {
					var24 = var3.readUnsignedShortLE();
					var21 = var3.readUnsignedShortAdd();
					if (var21 == 65535) {
						var21 = -1;
					}

					var23 = var3.readUnsignedShort();
					var9 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					var7 = var3.readUnsignedShortAdd();
					ArrayList var96 = new ArrayList();
					var96.add(var21);
					var96.add(var5);
					ItemComposition.playSong(var96, var23, var7, var24, var9);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3600 == var1.serverPacket) {
					var10 = var3.readUnsignedByteSub();
					var11 = var3.readUnsignedShort();
					var23 = var3.readMedium();
					var21 = var23 >> 16;
					var5 = var23 >> 8 & 255;
					var7 = var21 + (var23 >> 4 & 7);
					var24 = var5 + (var23 & 7);
					var9 = var3.readUnsignedShortLE();
					if (var7 >= 0 && var24 >= 0 && var7 < DevicePcmPlayerProvider.worldView.sizeX && var24 < DevicePcmPlayerProvider.worldView.sizeY) {
						var7 = Coord.method6897(var7);
						var24 = Coord.method6897(var24);
						GraphicsObject var90 = new GraphicsObject(var9, DevicePcmPlayerProvider.worldView.plane, var7, var24, GraphicsObject.getTileHeight(DevicePcmPlayerProvider.worldView, var7, var24, DevicePcmPlayerProvider.worldView.plane) - var10, var11, cycle);
						DevicePcmPlayerProvider.worldView.graphicsObjects.addFirst(var90);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3639 == var1.serverPacket) {
					Player var91;
					for (Iterator var55 = DevicePcmPlayerProvider.worldView.players.iterator(); var55.hasNext(); var91.sequence = -1) {
						var91 = (Player)var55.next();
					}

					NPC var76;
					for (Iterator var92 = DevicePcmPlayerProvider.worldView.npcs.iterator(); var92.hasNext(); var76.sequence = -1) {
						var76 = (NPC)var92.next();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3599 == var1.serverPacket) {
					for (var21 = 0; var21 < Varps.Varps_main.length; ++var21) {
						if (Varps.Varps_main[var21] != Varps.Varps_temp[var21]) {
							Varps.Varps_main[var21] = Varps.Varps_temp[var21];
							HttpHeaders.changeGameOptions(var21);
							changedItemContainers[++changedVarpCount - 1 & 31] = var21;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				String var51;
				if (ServerPacket.field3605 == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					var5 = var3.method10378();
					var56 = class232.widgetDefinition.method6951(var5);
					if (!var51.equals(var56.text)) {
						var56.text = var51;
						class139.invalidateWidget(var56);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3635 == var1.serverPacket) {
					DevicePcmPlayerProvider.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3574 == var1.serverPacket) {
					var21 = var3.readInt();
					InterfaceParent var89 = (InterfaceParent)interfaceParents.get((long)var21);
					if (var89 != null) {
						class220.closeInterface(var89, true);
					}

					if (meslayerContinueWidget != null) {
						class139.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3588 == var1.serverPacket) {
					WorldMapData_1.updateWorldEntitiesFromPacketBuffer(DevicePcmPlayerProvider.worldView, var3);
					var1.serverPacket = null;
					return true;
				}

				byte var83;
				if (ServerPacket.field3632 == var1.serverPacket) {
					field743 = cycleCntr;
					var83 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var83 >= 0) {
							currentClanChannels[var83] = null;
						} else {
							class92.guestClanChannel = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var83 >= 0) {
						currentClanChannels[var83] = new ClanChannel(var3);
					} else {
						class92.guestClanChannel = new ClanChannel(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				int var13;
				long var27;
				long var29;
				String var35;
				boolean var98;
				if (ServerPacket.field3590 == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					var27 = (long)var3.readUnsignedShort();
					var29 = (long)var3.readMedium();
					PlayerType var97 = (PlayerType)ArchiveDiskActionHandler.findEnumerated(ClientPreferences.PlayerType_values(), var3.readUnsignedByte());
					long var32 = var29 + (var27 << 32);
					var98 = false;

					for (var13 = 0; var13 < 100; ++var13) {
						if (field759[var13] == var32) {
							var98 = true;
							break;
						}
					}

					if (class223.friendSystem.isIgnored(new Username(var51, class339.loginType))) {
						var98 = true;
					}

					if (!var98 && field808 == 0) {
						field759[crossWorldMessageIdsIndex] = var32;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var35 = AbstractFont.escapeBrackets(HorizontalAlignment.method5170(Script.method2354(var3)));
						byte var77;
						if (var97.isPrivileged) {
							var77 = 7;
						} else {
							var77 = 3;
						}

						if (var97.modIcon != -1) {
							class279.addGameMessage(var77, class233.method5030(var97.modIcon) + var51, var35);
						} else {
							class279.addGameMessage(var77, var51, var35);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3615 == var1.serverPacket) {
					class291.updateNpcs(DevicePcmPlayerProvider.worldView, false, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3538 == var1.serverPacket) {
					var3.readUnsignedByte();
					var3.readShort();
					var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3591 == var1.serverPacket) {
					class300.field3306 = var3.readUnsignedByteAdd();
					field660 = var3.readUnsignedByte();
					class251.field2775 = var3.readUnsignedByteNeg();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3511 == var1.serverPacket) {
					RouteStrategy.method5755();
					runEnergy = var3.readUnsignedShort();
					field746 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				Widget var63;
				if (ServerPacket.field3560 == var1.serverPacket) {
					var21 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedShortAdd();
					var23 = var3.readUnsignedShortLE();
					var7 = var3.readInt();
					var63 = class232.widgetDefinition.method6951(var7);
					if (var21 != var63.modelAngleX || var23 != var63.modelAngleY || var5 != var63.modelZoom) {
						var63.modelAngleX = var21;
						var63.modelAngleY = var23;
						var63.modelZoom = var5;
						class139.invalidateWidget(var63);
					}

					var1.serverPacket = null;
					return true;
				}

				long var36;
				if (ServerPacket.field3558 == var1.serverPacket) {
					var21 = var3.method10352();
					var5 = var3.readUnsignedShortAdd();
					if (var5 == 65535) {
						var5 = -1;
					}

					var23 = var3.method10372();
					var7 = var3.readUnsignedShort();
					if (var7 == 65535) {
						var7 = -1;
					}

					for (var24 = var5; var24 <= var7; ++var24) {
						var36 = ((long)var21 << 32) + (long)var24;
						Node var99 = widgetFlags.get(var36);
						if (var99 != null) {
							var99.remove();
						}

						widgetFlags.put(new IntegerNode(var23), var36);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3584 == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3573 == var1.serverPacket) {
					var21 = var3.readUnsignedShort();
					var23 = var3.readUnsignedShort();
					var7 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedShortAddLE();
					JagexCache.method4816(var21, var5, var23, var7);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3594 == var1.serverPacket) {
					var21 = var3.readShort();
					class505 var88 = (class505)ArchiveDiskActionHandler.findEnumerated(class332.method6574(), var3.readUnsignedByte());
					class503 var74 = (class503)ArchiveDiskActionHandler.findEnumerated(class383.method7567(), var3.readUnsignedByte());
					if (var21 == -2) {
						worldViewManager.method2608(var88, var74);
					} else {
						worldViewManager.method2577(var21, var88, var74);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3527 == var1.serverPacket) {
					VarcInt.privateChatMode = class169.method3725(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3524 == var1.serverPacket) {
					class251.field2775 = var3.readUnsignedByte();
					field660 = var3.readUnsignedByteNeg();
					class300.field3306 = var3.readUnsignedByteNeg();

					for (var21 = class251.field2775; var21 < class251.field2775 + 8; ++var21) {
						for (var5 = class300.field3306; var5 < class300.field3306 + 8; ++var5) {
							if (DevicePcmPlayerProvider.worldView.groundItems[field660][var21][var5] != null) {
								DevicePcmPlayerProvider.worldView.groundItems[field660][var21][var5] = null;
								WorldMapCacheName.updateItemPile(field660, var21, var5);
							}
						}
					}

					for (PendingSpawn var53 = (PendingSpawn)DevicePcmPlayerProvider.worldView.pendingSpawns.last(); var53 != null; var53 = (PendingSpawn)DevicePcmPlayerProvider.worldView.pendingSpawns.previous()) {
						if (var53.x >= class251.field2775 && var53.x < class251.field2775 + 8 && var53.y >= class300.field3306 && var53.y < class300.field3306 + 8 && var53.plane == field660) {
							var53.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3518 == var1.serverPacket) {
					class272.method5750();
					var83 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var83 >= 0) {
							currentClanSettings[var83] = null;
						} else {
							class331.guestClanSettings = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var83 >= 0) {
						currentClanSettings[var83] = new ClanSettings(var3);
					} else {
						class331.guestClanSettings = new ClanSettings(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3543 == var1.serverPacket) {
					class94.method2566(class509.topLevelWorldView, var3);
					var1.serverPacket = null;
					return true;
				}

				InterfaceParent var39;
				if (ServerPacket.field3553 == var1.serverPacket) {
					var21 = var3.method10372();
					var5 = var3.method10372();
					InterfaceParent var73 = (InterfaceParent)interfaceParents.get((long)var5);
					var39 = (InterfaceParent)interfaceParents.get((long)var21);
					if (var39 != null) {
						class220.closeInterface(var39, var73 == null || var39.group != var73.group);
					}

					if (var73 != null) {
						var73.remove();
						interfaceParents.put(var73, (long)var21);
					}

					var63 = class232.widgetDefinition.method6951(var5);
					if (var63 != null) {
						class139.invalidateWidget(var63);
					}

					var63 = class232.widgetDefinition.method6951(var21);
					if (var63 != null) {
						class139.invalidateWidget(var63);
						class170.revalidateWidgetScroll(class232.widgetDefinition.Widget_interfaceComponents[var63.id >>> 16], var63, true);
					}

					if (rootInterface != -1) {
						MoveSpeed.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3551 == var1.serverPacket) {
					ItemContainer.USERNAME_PASSWORD = (class377)ArchiveDiskActionHandler.findEnumerated(RestClientThreadFactory.method208(), var3.readUnsignedByte());
					field668 = var3.readShort();
					field532 = var3.readUnsignedShort();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3637 == var1.serverPacket) {
					RouteStrategy.method5755();
					weight = var3.readShort();
					field746 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3563 == var1.serverPacket) {
					var21 = var3.readInt();
					var5 = var3.readInt();
					var23 = class134.getGcDuration();
					PacketBufferNode var102 = FloorDecoration.getPacketBufferNode(ClientPacket.field3398, packetWriter.isaacCipher);
					var102.packetBuffer.writeInt(var21);
					var102.packetBuffer.writeIntME(var5);
					var102.packetBuffer.writeByteSub(var23);
					var102.packetBuffer.writeByteSub(GameEngine.fps);
					packetWriter.addNode(var102);
					var1.serverPacket = null;
					return true;
				}

				NPC var61;
				if (ServerPacket.field3569 == var1.serverPacket) {
					var21 = var3.readUnsignedShort();
					short var84 = (short)var3.readSignedShort();
					var23 = var3.method10352();
					var7 = var3.readUnsignedByte();
					var61 = (NPC)DevicePcmPlayerProvider.worldView.npcs.get((long)var21);
					if (var61 != null) {
						var61.method2902(var7, var23, var84);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3587 == var1.serverPacket) {
					hintArrowType = var3.readUnsignedByte();
					if (hintArrowType == 1) {
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) {
						if (hintArrowType == 2) {
							field747 = 4096;
							field680 = 4096;
						}

						if (hintArrowType == 3) {
							field747 = 0;
							field680 = 4096;
						}

						if (hintArrowType == 4) {
							field747 = 8192;
							field680 = 4096;
						}

						if (hintArrowType == 5) {
							field747 = 4096;
							field680 = 0;
						}

						if (hintArrowType == 6) {
							field747 = 4096;
							field680 = 8192;
						}

						hintArrowType = 2;
						hintArrowX = var3.readUnsignedShort();
						hintArrowY = var3.readUnsignedShort();
						changedSkillsCount = var3.readUnsignedByte() * 4;
					}

					if (hintArrowType == 10) {
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3627 == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					var22 = AbstractFont.escapeBrackets(HorizontalAlignment.method5170(Script.method2354(var3)));
					class279.addGameMessage(6, var51, var22);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3607 == var1.serverPacket) {
					var21 = var3.readUnsignedByteAdd();
					var5 = var3.method10352();
					var56 = class232.widgetDefinition.method6951(var5);
					var56.field3932.method7001(Script.localPlayer.appearance.gender, var21);
					class139.invalidateWidget(var56);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3519 == var1.serverPacket) {
					var7 = var3.readUnsignedByteSub();
					var23 = var3.readUnsignedShortLE();
					var21 = var3.readUnsignedShort();
					var61 = (NPC)DevicePcmPlayerProvider.worldView.npcs.get((long)var21);
					var5 = var3.method10378();
					if (var61 != null) {
						var61.updateSpotAnimation(var7, var23, var5 >> 16, var5 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3564 == var1.serverPacket) {
					class555.method10157(class325.field3485);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3603 == var1.serverPacket) {
					var3.offset += 831592916;
					if (var3.checkCrc()) {
						AsyncHttpResponse.method282(var3, var3.offset * -2066221813 - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3629 == var1.serverPacket) {
					byte[] var52 = new byte[var1.serverPacketLength];
					var3.method10253(var52, 0, var52.length);
					Buffer var87 = new Buffer(var52);
					var58 = var87.readStringCp1252NullTerminated();
					RestClientThreadFactory.openURL(var58, true, false);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3568 == var1.serverPacket) {
					var5 = var3.readUnsignedShortAdd();
					var23 = var3.readUnsignedShortAdd();
					var7 = var3.readUnsignedShort();
					var21 = var3.readUnsignedShort();
					var24 = var3.readUnsignedShortAddLE();
					if (var21 == 65535) {
						var21 = -1;
					}

					ArrayList var31 = new ArrayList();
					var31.add(var21);
					ItemComposition.playSong(var31, var5, var23, var7, var24);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3525 == var1.serverPacket) {
					var1.field1471 = var3.readShort();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3545 == var1.serverPacket) {
					tradeChatMode = var3.readUnsignedByteNeg();
					publicChatMode = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3567 == var1.serverPacket) {
					class223.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field740 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				long var12;
				String var40;
				if (ServerPacket.field3581 == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					var27 = var3.readLong();
					var29 = (long)var3.readUnsignedShort();
					var36 = (long)var3.readMedium();
					PlayerType var38 = (PlayerType)ArchiveDiskActionHandler.findEnumerated(ClientPreferences.PlayerType_values(), var3.readUnsignedByte());
					var12 = var36 + (var29 << 32);
					boolean var72 = false;

					for (var15 = 0; var15 < 100; ++var15) {
						if (field759[var15] == var12) {
							var72 = true;
							break;
						}
					}

					if (var38.isUser && class223.friendSystem.isIgnored(new Username(var51, class339.loginType))) {
						var72 = true;
					}

					if (!var72 && field808 == 0) {
						field759[crossWorldMessageIdsIndex] = var12;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var40 = AbstractFont.escapeBrackets(HorizontalAlignment.method5170(Script.method2354(var3)));
						if (var38.modIcon != -1) {
							class53.addChatMessage(9, class233.method5030(var38.modIcon) + var51, var40, GrandExchangeOfferUnitPriceComparator.base37DecodeLong(var27));
						} else {
							class53.addChatMessage(9, var51, var40, GrandExchangeOfferUnitPriceComparator.base37DecodeLong(var27));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3580 == var1.serverPacket) {
					class555.method10157(class325.field3492);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3617 == var1.serverPacket && isCameraLocked) {
					field633 = true;
					field582 = false;
					field681 = false;

					for (var21 = 0; var21 < 5; ++var21) {
						field686[var21] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3559 == var1.serverPacket) {
					var21 = var3.readInt();
					var5 = var3.method10378();
					var56 = class232.widgetDefinition.method6951(var21);
					var56.field3932.method7004(var5);
					class139.invalidateWidget(var56);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3535 == var1.serverPacket) {
					isCameraLocked = true;
					field633 = false;
					field681 = true;
					class346.field3809 = var3.readUnsignedByte();
					Renderable.field2162 = var3.readUnsignedByte();
					var21 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShort();
					field778 = var3.readBoolean();
					var23 = var3.readUnsignedByte();
					var7 = Coord.method6897(class346.field3809);
					var24 = Coord.method6897(Renderable.field2162);
					boolean var75 = false;
					boolean var68 = false;
					if (field778) {
						var9 = TaskHandler.cameraY;
						var10 = GraphicsObject.getTileHeight(class509.topLevelWorldView, var7, var24, class509.topLevelWorldView.plane) - var21;
					} else {
						var9 = GraphicsObject.getTileHeight(class509.topLevelWorldView, MusicPatchNode2.cameraX, SceneTilePaint.cameraZ, class509.topLevelWorldView.plane) - TaskHandler.cameraY;
						var10 = var21;
					}

					field754 = new class533(MusicPatchNode2.cameraX, SceneTilePaint.cameraZ, var9, var7, var24, var10, var5, var23);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3576 == var1.serverPacket) {
					var21 = var3.method10378();
					var5 = var3.readSignedShort();
					var56 = class232.widgetDefinition.method6951(var21);
					if (var5 != var56.sequenceId || var5 == -1) {
						var56.sequenceId = var5;
						var56.modelFrame = 0;
						var56.modelFrameCycle = 0;
						class139.invalidateWidget(var56);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3542 == var1.serverPacket) {
					return this.method1265(var1);
				}

				if (ServerPacket.field3640 == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					Object[] var86 = new Object[var51.length() + 1];

					for (var23 = var51.length() - 1; var23 >= 0; --var23) {
						if (var51.charAt(var23) == 's') {
							var86[var23 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var86[var23 + 1] = new Integer(var3.readInt());
						}
					}

					var86[0] = new Integer(var3.readInt());
					ScriptEvent var70 = new ScriptEvent();
					var70.args = var86;
					class60.runScriptEvent(var70);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3552 == var1.serverPacket) {
					var83 = var3.readByteAdd();
					var5 = var3.readUnsignedShortLE();
					Varps.Varps_temp[var5] = var83;
					if (Varps.Varps_main[var5] != var83) {
						Varps.Varps_main[var5] = var83;
					}

					HttpHeaders.changeGameOptions(var5);
					changedItemContainers[++changedVarpCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3613 == var1.serverPacket) {
					var21 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var23 = var3.readUnsignedShort();
					class282.queueSoundEffect(var21, var5, var23);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3616 == var1.serverPacket) {
					class555.method10157(class325.field3484);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3546 == var1.serverPacket) {
					var21 = var3.method10352();
					var5 = var3.readUnsignedShortAddLE();
					var56 = class232.widgetDefinition.method6951(var21);
					if (var56.modelType != 6 || var5 != var56.modelId) {
						var56.modelType = 6;
						var56.modelId = var5;
						class139.invalidateWidget(var56);
					}

					var1.serverPacket = null;
					return true;
				}

				boolean var66;
				if (ServerPacket.field3532 == var1.serverPacket) {
					var83 = var3.readByte();
					var27 = (long)var3.readUnsignedShort();
					var29 = (long)var3.readMedium();
					var36 = (var27 << 32) + var29;
					var66 = false;
					ClanChannel var26 = var83 >= 0 ? currentClanChannels[var83] : class92.guestClanChannel;
					if (var26 == null) {
						var66 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) {
							if (field759[var13] == var36) {
								var66 = true;
								break;
							}
						}
					}

					if (!var66) {
						field759[crossWorldMessageIdsIndex] = var36;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var35 = Script.method2354(var3);
						var14 = var83 >= 0 ? 43 : 46;
						class53.addChatMessage(var14, "", var35, var26.name);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3521 == var1.serverPacket) {
					var21 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var21 < -70000) {
						var5 += 32768;
					}

					if (var21 >= 0) {
						var56 = class232.widgetDefinition.method6951(var21);
					} else {
						var56 = null;
					}

					if (var56 != null) {
						for (var7 = 0; var7 < var56.itemIds.length; ++var7) {
							var56.itemIds[var7] = 0;
							var56.itemQuantities[var7] = 0;
						}
					}

					AABB.clearItemContainer(var5);
					var7 = var3.readUnsignedShort();

					for (var24 = 0; var24 < var7; ++var24) {
						var9 = var3.readUnsignedByteNeg();
						if (var9 == 255) {
							var9 = var3.method10372();
						}

						var10 = var3.readUnsignedShort();
						if (var56 != null && var24 < var56.itemIds.length) {
							var56.itemIds[var24] = var10;
							var56.itemQuantities[var24] = var9;
						}

						WorldMapSection0.itemContainerSetItem(var5, var24, var10 - 1, var9);
					}

					if (var56 != null) {
						class139.invalidateWidget(var56);
					}

					RouteStrategy.method5755();
					defaultRotations[++field735 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				int var16;
				int var34;
				if (ServerPacket.field3608 == var1.serverPacket) {
					var23 = var3.readMedium();
					var21 = var23 >> 16;
					var5 = var23 >> 8 & 255;
					var7 = var21 + (var23 >> 4 & 7);
					var24 = var5 + (var23 & 7);
					var16 = var3.readUnsignedShortLE();
					int var17 = var3.readUnsignedByteSub();
					var11 = var3.readUnsignedIntIME();
					int var18 = var3.readUnsignedShortAdd();
					byte var65 = var3.readByteSub();
					var13 = var3.readUnsignedByteSub() * 4;
					var34 = var3.readUnsignedShort();
					int var19 = var3.readUnsignedIntME();
					var15 = var3.readUnsignedShortAdd();
					var14 = var3.readUnsignedByte() * 4;
					byte var69 = var3.readByteAdd();
					var9 = var69 + var7;
					var10 = var65 + var24;
					if (0 <= var7 && var7 < 104 && 0 <= var24 && var24 < 104 && 0 <= var9 && var9 < 104 && 0 <= var10 && var10 < 104 && var34 != 65535) {
						var7 = Coord.method6897(var7);
						var24 = Coord.method6897(var24);
						var9 = Coord.method6897(var9);
						var10 = Coord.method6897(var10);
						Projectile var20 = new Projectile(var34, DevicePcmPlayerProvider.worldView.plane, var7, var24, GraphicsObject.getTileHeight(DevicePcmPlayerProvider.worldView, var7, var24, DevicePcmPlayerProvider.worldView.plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var19, var11, var14);
						var20.setDestination(var9, var10, GraphicsObject.getTileHeight(DevicePcmPlayerProvider.worldView, var9, var10, DevicePcmPlayerProvider.worldView.plane) - var14, var15 + cycle);
						DevicePcmPlayerProvider.worldView.projectiles.addFirst(var20);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3626 == var1.serverPacket) {
					class269.method5663(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3513 == var1.serverPacket) {
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

				if (ServerPacket.field3598 == var1.serverPacket) {
					isCameraLocked = true;
					field633 = false;
					field582 = true;
					var21 = class149.method3477(var3.readShort() & 2027);
					var5 = ArchiveLoader.method2433(var3.readShort() & 2027);
					var23 = var3.readUnsignedShort();
					var7 = var3.readUnsignedByte();
					field674 = new class534(class258.cameraPitch, var5, var23, var7);
					field780 = new class534(AsyncHttpResponse.cameraYaw, var21, var23, var7);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3575 == var1.serverPacket) {
					class555.method10157(class325.field3487);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3512 == var1.serverPacket) {
					World var50 = new World();
					var50.host = var3.readStringCp1252NullTerminated();
					var50.id = var3.readUnsignedShort();
					var5 = var3.readInt();
					var50.properties = var5;
					if (var50.isDeadman()) {
						var50.field827 = "beta";
						LoginScreenAnimation.field1314 = true;
					} else {
						LoginScreenAnimation.field1314 = false;
					}

					class325.updateGameState(45);
					var2.close();
					var2 = null;
					class254.changeWorld(var50);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field3612 == var1.serverPacket) {
					field703 = var3.readStringCp1252NullTerminated();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3537 == var1.serverPacket) {
					var5 = var3.readUnsignedShortAddLE();
					var21 = var3.readUnsignedShortLE();
					MenuAction.method2254(var21, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3582 == var1.serverPacket) {
					var83 = var3.readByte();
					var22 = var3.readStringCp1252NullTerminated();
					long var41 = (long)var3.readUnsignedShort();
					long var43 = (long)var3.readMedium();
					PlayerType var95 = (PlayerType)ArchiveDiskActionHandler.findEnumerated(ClientPreferences.PlayerType_values(), var3.readUnsignedByte());
					long var45 = var43 + (var41 << 32);
					boolean var71 = false;
					ClanChannel var47 = null;
					var47 = var83 >= 0 ? currentClanChannels[var83] : class92.guestClanChannel;
					if (var47 == null) {
						var71 = true;
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var95.isUser && class223.friendSystem.isIgnored(new Username(var22, class339.loginType))) {
									var71 = true;
								}
								break;
							}

							if (var45 == field759[var15]) {
								var71 = true;
								break;
							}

							++var15;
						}
					}

					if (!var71) {
						field759[crossWorldMessageIdsIndex] = var45;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var40 = AbstractFont.escapeBrackets(Script.method2354(var3));
						var16 = var83 >= 0 ? 41 : 44;
						if (var95.modIcon != -1) {
							class53.addChatMessage(var16, class233.method5030(var95.modIcon) + var22, var40, var47.name);
						} else {
							class53.addChatMessage(var16, var22, var40, var47.name);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3625 == var1.serverPacket) {
					RouteStrategy.method5755();
					var21 = var3.method10352();
					var5 = var3.readUnsignedByteAdd();
					var23 = var3.readUnsignedByteAdd();
					var7 = var3.readUnsignedByteNeg();
					experience[var23] = var21;
					currentLevels[var23] = var5;
					levels[var23] = 1;
					field538[var23] = var7;

					for (var24 = 0; var24 < 98; ++var24) {
						if (var21 >= Skills.Skills_experienceTable[var24]) {
							levels[var23] = var24 + 2;
						}
					}

					field736[++field737 - 1 & 31] = var23;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3604 == var1.serverPacket) {
					var21 = var3.method10352();
					var5 = var3.readUnsignedShort();
					var56 = class232.widgetDefinition.method6951(var21);
					if (var56 != null && var56.type == 0) {
						if (var5 > var56.scrollHeight - var56.height * 1265510039) {
							var5 = var56.scrollHeight - var56.height * 1265510039;
						}

						if (var5 < 0) {
							var5 = 0;
						}

						if (var5 != var56.scrollY) {
							var56.scrollY = var5;
							class139.invalidateWidget(var56);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var101;
				if (ServerPacket.field3597 == var1.serverPacket) {
					var21 = var3.method10378();
					var5 = var3.readSignedShort();
					var23 = var3.readShort();
					var101 = class232.widgetDefinition.method6951(var21);
					if (var5 != var101.rawX || var23 != var101.rawY || var101.xAlignment != 0 || var101.yAlignment != 0) {
						var101.rawX = var5;
						var101.rawY = var23;
						var101.xAlignment = 0;
						var101.yAlignment = 0;
						class139.invalidateWidget(var101);
						this.alignWidget(var101);
						if (var101.type == 0) {
							class170.revalidateWidgetScroll(class232.widgetDefinition.Widget_interfaceComponents[var21 >> 16], var101, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3618 == var1.serverPacket) {
					var21 = var3.method10378();
					var5 = var3.readUnsignedShort();
					var23 = var5 >> 10 & 31;
					var7 = var5 >> 5 & 31;
					var24 = var5 & 31;
					var9 = (var7 << 11) + (var23 << 19) + (var24 << 3);
					Widget var93 = class232.widgetDefinition.method6951(var21);
					if (var9 != var93.color) {
						var93.color = var9;
						class139.invalidateWidget(var93);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3579 == var1.serverPacket) {
					HttpRequest.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3523 == var1.serverPacket) {
					class291.updateNpcs(DevicePcmPlayerProvider.worldView, true, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3514 == var1.serverPacket) {
					var21 = var3.method10352();
					var5 = var3.readInt();
					var23 = var3.readUnsignedShortLE();
					if (var23 == 65535) {
						var23 = -1;
					}

					var101 = class232.widgetDefinition.method6951(var21);
					ItemComposition var59;
					if (!var101.isIf3) {
						if (var23 == -1) {
							var101.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var59 = class231.ItemDefinition_get(var23).getCountObj(var5);
						var101.modelType = 4;
						var101.modelId = var23;
						var101.modelAngleX = var59.xan2d;
						var101.modelAngleY = var59.yan2d;
						var101.modelZoom = var59.zoom2d * 100 / var5;
						class139.invalidateWidget(var101);
					} else {
						var101.itemId = var23;
						var101.itemQuantity = var5;
						var59 = class231.ItemDefinition_get(var23).getCountObj(var5);
						var101.modelAngleX = var59.xan2d;
						var101.modelAngleY = var59.yan2d;
						var101.modelAngleZ = var59.zan2d;
						var101.modelOffsetX = var59.offsetX2d;
						var101.modelOffsetY = var59.offsetY2d;
						var101.modelZoom = var59.zoom2d;
						if (var59.isStackable == 1) {
							var101.itemQuantityMode = 1;
						} else {
							var101.itemQuantityMode = 2;
						}

						if (var101.field3999 > 0) {
							var101.modelZoom = var101.modelZoom * 32 / var101.field3999;
						} else if (var101.rawWidth > 0) {
							var101.modelZoom = var101.modelZoom * 32 / var101.rawWidth;
						}

						class139.invalidateWidget(var101);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3623 == var1.serverPacket) {
					isCameraLocked = true;
					field633 = false;
					field582 = true;
					var21 = var3.readShort();
					var5 = var3.readShort();
					var23 = ArchiveLoader.method2433(var5 + class258.cameraPitch & 2027);
					var7 = var21 + AsyncHttpResponse.cameraYaw;
					var24 = var3.readUnsignedShort();
					var9 = var3.readUnsignedByte();
					field674 = new class534(class258.cameraPitch, var23, var24, var9);
					field780 = new class534(AsyncHttpResponse.cameraYaw, var7, var24, var9);
					var1.serverPacket = null;
					return true;
				}

				boolean var85;
				if (ServerPacket.field3520 == var1.serverPacket) {
					var85 = var3.readBoolean();
					if (var85) {
						if (class224.field2524 == null) {
							class224.field2524 = new class413();
						}
					} else {
						class224.field2524 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3526 == var1.serverPacket) {
					var5 = var3.readUnsignedShort();
					var21 = var3.readUnsignedShortAddLE();
					Player var8;
					if (var21 == localPlayerIndex) {
						var8 = Script.localPlayer;
					} else {
						var8 = (Player)DevicePcmPlayerProvider.worldView.players.get((long)var21);
					}

					var23 = var3.readInt();
					var7 = var3.readUnsignedByte();
					if (var8 != null) {
						var8.updateSpotAnimation(var7, var5, var23 >> 16, var23 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3547 == var1.serverPacket) {
					if (rootInterface != -1) {
						MoveSpeed.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3548 == var1.serverPacket) {
					var21 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var21 < -70000) {
						var5 += 32768;
					}

					if (var21 >= 0) {
						var56 = class232.widgetDefinition.method6951(var21);
					} else {
						var56 = null;
					}

					for (; var3.offset * -2066221813 < var1.serverPacketLength; WorldMapSection0.itemContainerSetItem(var5, var7, var24 - 1, var9)) {
						var7 = var3.readUShortSmart();
						var24 = var3.readUnsignedShort();
						var9 = 0;
						if (var24 != 0) {
							var9 = var3.readUnsignedByte();
							if (var9 == 255) {
								var9 = var3.readInt();
							}
						}

						if (var56 != null && var7 >= 0 && var7 < var56.itemIds.length) {
							var56.itemIds[var7] = var24;
							var56.itemQuantities[var7] = var9;
						}
					}

					if (var56 != null) {
						class139.invalidateWidget(var56);
					}

					RouteStrategy.method5755();
					defaultRotations[++field735 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3557 == var1.serverPacket) {
					class277.field3140 = new class509(LoginState.field491);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3621 == var1.serverPacket) {
					var21 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var23 = var3.readUnsignedByte();
					var7 = var3.readUnsignedByte();
					field686[var21] = true;
					field783[var21] = var5;
					field784[var21] = var23;
					field550[var21] = var7;
					field786[var21] = 0;
					var1.serverPacket = null;
					return true;
				}

				Widget var81;
				if (ServerPacket.field3595 == var1.serverPacket) {
					var21 = var3.method10352();
					var81 = class232.widgetDefinition.method6951(var21);

					for (var23 = 0; var23 < var81.itemIds.length; ++var23) {
						var81.itemIds[var23] = -1;
						var81.itemIds[var23] = 0;
					}

					class139.invalidateWidget(var81);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3630 == var1.serverPacket) {
					class272.method5750();
					var83 = var3.readByte();
					class151 var82 = new class151(var3);
					ClanSettings var60;
					if (var83 >= 0) {
						var60 = currentClanSettings[var83];
					} else {
						var60 = class331.guestClanSettings;
					}

					if (var60 == null) {
						this.method1277(var83);
						var1.serverPacket = null;
						return true;
					}

					if (var82.field1724 > var60.field1779) {
						this.method1277(var83);
						var1.serverPacket = null;
						return true;
					}

					if (var82.field1724 < var60.field1779) {
						var1.serverPacket = null;
						return true;
					}

					var82.method3486(var60);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3533 == var1.serverPacket) {
					var21 = var3.readUnsignedByte();
					if (var3.readUnsignedByte() == 0) {
						grandExchangeOffers[var21] = new GrandExchangeOffer();
						var3.offset += 534595446;
					} else {
						var3.offset -= 29699747;
						grandExchangeOffers[var21] = new GrandExchangeOffer(var3, false);
					}

					field744 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3570 == var1.serverPacket) {
					class555.method10157(class325.field3491);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3530 == var1.serverPacket) {
					var21 = var3.readUnsignedByteAdd();
					var5 = var3.readUnsignedByte();
					var58 = var3.readStringCp1252NullTerminated();
					if (var5 >= 1 && var5 <= 8) {
						if (var58.equalsIgnoreCase("null")) {
							var58 = null;
						}

						playerMenuActions[var5 - 1] = var58;
						playerOptionsPriorities[var5 - 1] = var21 == 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3572 == var1.serverPacket) {
					var21 = var3.method10372();
					var5 = var3.readUnsignedShortLE();
					var23 = var3.readUnsignedShort();
					var101 = class232.widgetDefinition.method6951(var21);
					var101.field4021 = var5 + (var23 << 16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3585 == var1.serverPacket) {
					class555.method10157(class325.field3490);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3602 == var1.serverPacket) {
					isCameraLocked = true;
					field633 = false;
					field681 = true;
					class346.field3809 = var3.readUnsignedByte();
					Renderable.field2162 = var3.readUnsignedByte();
					var21 = var3.readUnsignedShort();
					var5 = Coord.method6897(var3.readUnsignedByte());
					var23 = Coord.method6897(var3.readUnsignedByte());
					var7 = var3.readUnsignedShort();
					field778 = var3.readBoolean();
					var24 = var3.readUnsignedByte();
					var9 = Coord.method6897(class346.field3809);
					var10 = Coord.method6897(Renderable.field2162);
					var66 = false;
					var98 = false;
					if (field778) {
						var11 = TaskHandler.cameraY;
						var34 = GraphicsObject.getTileHeight(class509.topLevelWorldView, var9, var10, class509.topLevelWorldView.plane) - var21;
					} else {
						var11 = GraphicsObject.getTileHeight(class509.topLevelWorldView, MusicPatchNode2.cameraX, SceneTilePaint.cameraZ, class509.topLevelWorldView.plane) - TaskHandler.cameraY;
						var34 = var21;
					}

					field754 = new class532(MusicPatchNode2.cameraX, SceneTilePaint.cameraZ, var11, var9, var10, var34, var5, var23, var7, var24);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3614 == var1.serverPacket) {
					rebootTimer = var3.readUnsignedShortAdd() * 30;
					field746 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3619 == var1.serverPacket) {
					++serverCycle;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3516 == var1.serverPacket) {
					var21 = var3.readUnsignedShort();
					var5 = var3.method10352();
					Varps.Varps_temp[var21] = var5;
					if (Varps.Varps_main[var21] != var5) {
						Varps.Varps_main[var21] = var5;
					}

					HttpHeaders.changeGameOptions(var21);
					changedItemContainers[++changedVarpCount - 1 & 31] = var21;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3592 == var1.serverPacket) {
					var21 = var3.readUnsignedIntLE();
					var5 = var3.readUnsignedShortLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					class92.method2497(var5, var21);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3515 == var1.serverPacket) {
					HttpAuthenticationHeader.field5075 = var3.readBoolean();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3609 == var1.serverPacket) {
					var13 = var3.readUnsignedShortLE();
					var9 = var3.readUnsignedByteAdd();
					var10 = var9 >> 2;
					var11 = var9 & 3;
					var34 = field504[var10];
					var23 = var3.readUnsignedIntLE();
					var21 = var23 >> 16;
					var5 = var23 >> 8 & 255;
					var7 = var21 + (var23 >> 4 & 7);
					var24 = var5 + (var23 & 7);
					if (0 <= var7 && var7 < 103 && 0 <= var24 && var24 < 103) {
						WorldMapLabelSize.method5920(var7, var24, var10, var11, var34, var13);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3583 == var1.serverPacket) {
					class555.method10157(class325.field3493);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3636 == var1.serverPacket) {
					var85 = var3.readUnsignedByte() == 1;
					if (var85) {
						class338.field3757 = class282.method5908() - var3.readLong();
						VarcInt.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						VarcInt.grandExchangeEvents = null;
					}

					hintArrowHeight = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3528 == var1.serverPacket) {
					var21 = var3.readUnsignedShortAdd();
					var5 = var3.method10372();
					var56 = class232.widgetDefinition.method6951(var5);
					if (var56.modelType != 1 || var21 != var56.modelId) {
						var56.modelType = 1;
						var56.modelId = var21;
						class139.invalidateWidget(var56);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3620 == var1.serverPacket) {
					var21 = var3.method10378();
					var62 = var3.readUnsignedByteSub() == 1;
					var56 = class232.widgetDefinition.method6951(var21);
					if (var62 != var56.isHidden) {
						var56.isHidden = var62;
						class139.invalidateWidget(var56);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3571 == var1.serverPacket) {
					var21 = var3.readUnsignedShortLE();
					if (var21 == 65535) {
						var21 = -1;
					}

					rootInterface = var21;
					this.method1272(false);
					JagexCache.method4818(var21);
					class161.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						validRootWidgets[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3641 == var1.serverPacket) {
					AddRequestTask.field5020 = var3.readUnsignedByte();
					class233.field2563 = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3534 == var1.serverPacket) {
					playerUpdateManager.method3005(var3, var1.serverPacketLength);
					TaskHandler.method4791();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3643 == var1.serverPacket) {
					var21 = var1.serverPacketLength + var3.offset * -2066221813;
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					var23 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.method1272(false);
						JagexCache.method4818(rootInterface);
						class161.runWidgetOnLoadListener(rootInterface);

						for (var7 = 0; var7 < 100; ++var7) {
							validRootWidgets[var7] = true;
						}
					}

					InterfaceParent var25;
					for (; var23-- > 0; var25.field1077 = true) {
						var7 = var3.readInt();
						var24 = var3.readUnsignedShort();
						var9 = var3.readUnsignedByte();
						var25 = (InterfaceParent)interfaceParents.get((long)var7);
						if (var25 != null && var24 != var25.group) {
							class220.closeInterface(var25, true);
							var25 = null;
						}

						if (var25 == null) {
							var25 = class381.openInterface(var7, var24, var9);
						}
					}

					for (var39 = (InterfaceParent)interfaceParents.first(); var39 != null; var39 = (InterfaceParent)interfaceParents.next()) {
						if (var39.field1077) {
							var39.field1077 = false;
						} else {
							class220.closeInterface(var39, true);
						}
					}

					widgetFlags = new NodeHashTable(512);

					while (var3.offset * -2066221813 < var21) {
						var7 = var3.readInt();
						var24 = var3.readUnsignedShort();
						var9 = var3.readUnsignedShort();
						var10 = var3.readInt();

						for (var11 = var24; var11 <= var9; ++var11) {
							var12 = (long)var11 + ((long)var7 << 32);
							widgetFlags.put(new IntegerNode(var10), var12);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3634 == var1.serverPacket) {
					var21 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var23 = var3.readInt();
					var101 = class232.widgetDefinition.method6951(var23);
					var101.field3932.method7003(var21, var5);
					class139.invalidateWidget(var101);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3638 == var1.serverPacket) {
					var21 = var3.readUnsignedShort();
					Interpreter.method2160(var21);
					defaultRotations[++field735 - 1 & 31] = var21 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3561 == var1.serverPacket) {
					var21 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedByte();
					if (var21 == 65535) {
						var21 = -1;
					}

					class109.performPlayerAnimation(Script.localPlayer, var21, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3610 == var1.serverPacket) {
					var5 = var3.readUnsignedShortAdd();
					var21 = var3.readUnsignedShortAddLE();
					var23 = var3.readUnsignedByteNeg();
					if (var5 == 65535) {
						var5 = -1;
					}

					NPC var100 = (NPC)DevicePcmPlayerProvider.worldView.npcs.get((long)var21);
					if (var100 != null) {
						if (var5 == var100.sequence && var5 != -1) {
							var24 = class91.SequenceDefinition_get(var5).restartMode;
							if (var24 == 1) {
								var100.sequenceFrame = 0;
								var100.sequenceFrameCycle = 0;
								var100.sequenceDelay = var23;
								var100.field1265 = 0;
							} else if (var24 == 2) {
								var100.field1265 = 0;
							}
						} else if (var5 == -1 || var100.sequence == -1 || class91.SequenceDefinition_get(var5).field3022 >= class91.SequenceDefinition_get(var100.sequence).field3022) {
							var100.sequence = var5;
							var100.sequenceFrame = 0;
							var100.sequenceFrameCycle = 0;
							var100.sequenceDelay = var23;
							var100.field1265 = 0;
							var100.field1284 = var100.pathLength;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3596 == var1.serverPacket) {
					var21 = var3.method10372();
					var81 = class232.widgetDefinition.method6951(var21);
					var81.modelType = 3;
					var81.modelId = Script.localPlayer.appearance.getChatHeadId();
					class139.invalidateWidget(var81);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3566 == var1.serverPacket) {
					class223.friendSystem.method1936();
					field740 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3556 == var1.serverPacket) {
					var85 = var3.readUnsignedByteSub() == 1;
					var5 = var3.method10378();
					var56 = class232.widgetDefinition.method6951(var5);
					var56.method7385(Script.localPlayer.appearance, var85);
					class139.invalidateWidget(var56);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3628 == var1.serverPacket) {
					isCameraLocked = true;
					field633 = false;
					field582 = false;
					SceneTilePaint.field2331 = var3.readUnsignedByte();
					class361.field3904 = var3.readUnsignedByte();
					WorldMapSection1.field3326 = var3.readUnsignedShort();
					GameBuild.field4198 = var3.readUnsignedByte();
					Timer.field4632 = var3.readUnsignedByte();
					if (Timer.field4632 >= 100) {
						var21 = Coord.method6897(SceneTilePaint.field2331);
						var5 = Coord.method6897(class361.field3904);
						var23 = GraphicsObject.getTileHeight(class509.topLevelWorldView, var21, var5, class509.topLevelWorldView.plane) - WorldMapSection1.field3326;
						var7 = var21 - MusicPatchNode2.cameraX;
						var24 = var23 - TaskHandler.cameraY;
						var9 = var5 - SceneTilePaint.cameraZ;
						var10 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9));
						class258.cameraPitch = (int)(Math.atan2((double)var24, (double)var10) * 325.9490051269531D) & 2047;
						AsyncHttpResponse.cameraYaw = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531D) & 2047;
						if (class258.cameraPitch < 128) {
							class258.cameraPitch = 128;
						}

						if (class258.cameraPitch > 383) {
							class258.cameraPitch = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3539 == var1.serverPacket) {
					field743 = cycleCntr;
					var83 = var3.readByte();
					class165 var80 = new class165(var3);
					ClanChannel var54;
					if (var83 >= 0) {
						var54 = currentClanChannels[var83];
					} else {
						var54 = class92.guestClanChannel;
					}

					if (var54 == null) {
						this.method1276(var83);
						var1.serverPacket = null;
						return true;
					}

					if (var80.field1830 > var54.field1854) {
						this.method1276(var83);
						var1.serverPacket = null;
						return true;
					}

					if (var80.field1830 < var54.field1854) {
						var1.serverPacket = null;
						return true;
					}

					var80.method3678(var54);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3562 == var1.serverPacket) {
					SpotAnimationDefinition.field2792 = var3.readBoolean();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3522 == var1.serverPacket) {
					class277.field3140 = null;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3622 == var1.serverPacket) {
					var21 = var3.readShort();
					var5 = var3.readUnsignedByte();
					if (var21 == -1) {
						class509.topLevelWorldView.plane = var5;
						DevicePcmPlayerProvider.worldView = class509.topLevelWorldView;
					} else {
						WorldEntity var6 = (WorldEntity)class509.topLevelWorldView.worldEntities.get((long)var21);
						if (var6 == null) {
							throw new RuntimeException("No valid ClientWorldEntity with ID " + var21);
						}

						var6.worldView.plane = var5;
						DevicePcmPlayerProvider.worldView = var6.worldView;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3536 == var1.serverPacket) {
					class277.field3139 = var3.readBoolean();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3550 == var1.serverPacket) {
					var21 = var3.readUnsignedByte();
					class87.forceDisconnect(var21);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field3541 == var1.serverPacket) {
					var21 = var3.readUnsignedByte();
					var5 = var3.readUnsignedShortAdd();
					var23 = var3.method10352();
					var39 = (InterfaceParent)interfaceParents.get((long)var23);
					if (var39 != null) {
						class220.closeInterface(var39, var5 != var39.group);
					}

					class381.openInterface(var23, var5, var21);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3540 == var1.serverPacket) {
					field633 = false;
					isCameraLocked = false;
					field681 = false;
					field582 = false;
					SceneTilePaint.field2331 = 0;
					class361.field3904 = 0;
					WorldMapSection1.field3326 = 0;
					field778 = false;
					GameBuild.field4198 = 0;
					Timer.field4632 = 0;
					class342.field3777 = 0;
					WorldEntity.field5170 = 0;
					class346.field3809 = 0;
					Renderable.field2162 = 0;
					PlatformInfo.field5362 = 0;
					field754 = null;
					field674 = null;
					field780 = null;

					for (var21 = 0; var21 < 5; ++var21) {
						field686[var21] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3529 == var1.serverPacket) {
					return this.method1351(var1);
				}

				if (ServerPacket.field3593 == var1.serverPacket) {
					for (var21 = 0; var21 < VarpDefinition.field2569; ++var21) {
						VarpDefinition var79 = class139.VarpDefinition_get(var21);
						if (var79 != null) {
							Varps.Varps_temp[var21] = 0;
							Varps.Varps_main[var21] = 0;
						}
					}

					RouteStrategy.method5755();
					changedVarpCount += 32;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3555 == var1.serverPacket) {
					var21 = var3.readUnsignedByte();
					WorldMapScaleHandler.method6479(var21);
					var1.serverPacket = null;
					return true;
				}

				class290.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1474 != null ? var1.field1474.id : -1) + "," + (var1.field1463 != null ? var1.field1463.id : -1) + "," + var1.serverPacketLength, (Throwable)null);
				class440.logOut();
			} catch (IOException var48) {
				UrlRequest.method3195();
			} catch (Exception var49) {
				var22 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1474 != null ? var1.field1474.id : -1) + "," + (var1.field1463 != null ? var1.field1463.id : -1) + "," + var1.serverPacketLength + "," + (Script.localPlayer.pathX[0] + class509.topLevelWorldView.baseX) + "," + (Script.localPlayer.pathY[0] + class509.topLevelWorldView.baseY) + ",";

				for (var23 = 0; var23 < var1.serverPacketLength && var23 < 50; ++var23) {
					var22 = var22 + var3.array[var23] + ",";
				}

				class290.RunException_sendStackTrace(var22, var49);
				class440.logOut();
			}

			return true;
		}
	}

	@ObfuscatedName("pg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-423049582"
	)
	@Export("menu")
	final void menu() {
		class33.method491(menu);
		if (clickedWidget == null) {
			int var1 = MouseHandler.MouseHandler_lastButton;
			if (isMenuOpen) {
				if (var1 != 1 && (Occluder.mouseCam || var1 != 4) && !menu.method10943(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y)) {
					isMenuOpen = false;
					menu.invalidateWidgetsUnder();
				}

				if (var1 == 1 || !Occluder.mouseCam && var1 == 4) {
					menu.method10970(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					isMenuOpen = false;
					menu.invalidateWidgetsUnder();
				}
			} else if (menu.menuOptionsCount > 0) {
				int var2 = MenuAction.method2255();
				if ((var1 == 1 || !Occluder.mouseCam && var1 == 4) && this.shouldLeftClickOpenMenu(menu.menuOpcodes[var2], menu.menuShiftClick[var2])) {
					var1 = 2;
				}

				if (var1 == 1 || !Occluder.mouseCam && var1 == 4) {
					menu.method10942(var2);
				}

				if (var1 == 2) {
					this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}
			}

		}
	}

	@ObfuscatedName("ps")
	@ObfuscatedSignature(
		descriptor = "(IZI)Z",
		garbageValue = "388745103"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu(int var1, boolean var2) {
		return (leftClickOpensMenu && menu.menuOptionsCount > 2 || Login.method2323(var1)) && !var2;
	}

	@ObfuscatedName("pp")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "108"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		menu.method10939(var1, var2);
		Iterator var3 = worldViewManager.iterator();

		while (var3.hasNext()) {
			WorldView var4 = (WorldView)var3.next();
			var4.scene.menuOpen(false);
		}

		isMenuOpen = true;
		menu.method10945();
	}

	@ObfuscatedName("pb")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1088242058"
	)
	final void method1272(boolean var1) {
		int var2 = rootInterface;
		int var3 = GameEngine.canvasWidth;
		int var4 = class141.canvasHeight;
		if (class232.widgetDefinition.loadInterface(var2)) {
			BufferedNetSocket.method9474(class232.widgetDefinition.Widget_interfaceComponents[var2], 0, class232.widgetDefinition.Widget_interfaceComponents[var2].length - 1, -1, -1, var3, var4, var1);
		}

	}

	@ObfuscatedName("pi")
	@ObfuscatedSignature(
		descriptor = "(Lnh;I)V",
		garbageValue = "1072438868"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var4 = var1.parentId == -1 ? null : class232.widgetDefinition.getWidgetChild(var1.parentId, var1.field3960);
		int var2;
		int var3;
		if (var4 == null) {
			var2 = GameEngine.canvasWidth;
			var3 = class141.canvasHeight;
		} else {
			var2 = var4.width * 624892547;
			var3 = var4.height * 1265510039;
		}

		KitDefinition.alignWidgetSize(var1, var2, var3, false);
		TextureProvider.alignWidgetPosition(var1, var2, var3);
	}

	@ObfuscatedName("pt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1847805065"
	)
	final void method1274() {
		class139.invalidateWidget(clickedWidget);
		++class165.widgetDragDuration;
		if (field520 && field725) {
			int var1 = MouseHandler.MouseHandler_x;
			int var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field726) {
				var1 = field726;
			}

			if (var1 + clickedWidget.width * 624892547 > clickedWidgetParent.width * 624892547 + field726) {
				var1 = clickedWidgetParent.width * 624892547 + field726 - clickedWidget.width * 624892547;
			}

			if (var2 < field727) {
				var2 = field727;
			}

			if (var2 + clickedWidget.height * 1265510039 > field727 + clickedWidgetParent.height * 1265510039) {
				var2 = field727 + clickedWidgetParent.height * 1265510039 - clickedWidget.height * 1265510039;
			}

			int var3 = var1 - field729;
			int var4 = var2 - field790;
			int var5 = clickedWidget.dragZoneSize;
			if (class165.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}

			int var6 = var1 - field726 + clickedWidgetParent.scrollX;
			int var7 = var2 - field727 + clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = clickedWidget.onDrag;
				class60.runScriptEvent(var8);
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
						class60.runScriptEvent(var8);
					}

					if (draggedOnWidget != null && class364.method7487(clickedWidget) != null) {
						PacketBufferNode var9 = FloorDecoration.getPacketBufferNode(ClientPacket.field3399, packetWriter.isaacCipher);
						var9.packetBuffer.writeShortLE(clickedWidget.itemId);
						var9.packetBuffer.writeShortLE(draggedOnWidget.itemId);
						var9.packetBuffer.writeIntME(clickedWidget.id);
						var9.packetBuffer.writeShortAddLE(draggedOnWidget.childIndex * -1626125685);
						var9.packetBuffer.writeShortAdd(clickedWidget.childIndex * -1626125685);
						var9.packetBuffer.method10279(draggedOnWidget.id);
						packetWriter.addNode(var9);
					}
				} else if (class6.tempMenuAction != null && !this.shouldLeftClickOpenMenu(class6.tempMenuAction.opcode, class6.tempMenuAction.field916)) {
					if (menu.menuOptionsCount > 0) {
						class322.method6540(field729 + widgetClickX, widgetClickY + field790);
					}
				} else {
					this.openMenu(field729 + widgetClickX, widgetClickY + field790);
				}

				clickedWidget = null;
			}

		} else {
			if (class165.widgetDragDuration > 1) {
				if (!isDraggingWidget && menu.menuOptionsCount > 0) {
					class322.method6540(widgetClickX + field729, widgetClickY + field790);
				}

				clickedWidget = null;
			}

		}
	}

	@ObfuscatedName("pw")
	@ObfuscatedSignature(
		descriptor = "(B)Lwp;",
		garbageValue = "-63"
	)
	@Export("username")
	public Username username() {
		return Script.localPlayer != null ? Script.localPlayer.username : null;
	}

	@ObfuscatedName("py")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-983703821"
	)
	void method1276(int var1) {
		PacketBufferNode var2 = FloorDecoration.getPacketBufferNode(ClientPacket.field3434, packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(var1);
		packetWriter.addNode(var2);
	}

	@ObfuscatedName("pa")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1716819097"
	)
	void method1277(int var1) {
		PacketBufferNode var2 = FloorDecoration.getPacketBufferNode(ClientPacket.field3415, packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(var1);
		packetWriter.addNode(var2);
	}

	protected void finalize() throws Throwable {
		class335.field3695.remove(this);
		super.finalize();
	}

	public void setClient(int var1) {
		this.clientId = var1;
	}

	public boolean isOnLoginScreen() {
		return gameState == 10;
	}

	public long getAccountHash() {
		return this.accountHash;
	}

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V"
	)
	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) {
			this.otlTokenRequester = var1;
			class137.method3379(10);
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

							class248.clientLanguage = var10;
							break;
						case 7:
							IntProjection.field2013 = class30.method462(Integer.parseInt(var2));
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) {
							}
							break;
						case 9:
							SecureRandomFuture.field1003 = var2;
							break;
						case 10:
							StudioGame[] var3 = new StudioGame[]{StudioGame.oldscape, StudioGame.stellardawn, StudioGame.game3, StudioGame.game4, StudioGame.runescape, StudioGame.game5};
							class496.field5187 = (StudioGame)ArchiveDiskActionHandler.findEnumerated(var3, Integer.parseInt(var2));
							if (StudioGame.oldscape == class496.field5187) {
								class339.loginType = LoginType.oldscape;
							} else {
								class339.loginType = LoginType.field5483;
							}
							break;
						case 11:
							FriendLoginUpdate.field5130 = var2;
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
							class169.field1863 = Integer.parseInt(var2);
							break;
						case 15:
							gameBuild = Integer.parseInt(var2);
							break;
						case 17:
							class59.field405 = var2;
							break;
						case 21:
							field791 = Integer.parseInt(var2);
							break;
						case 22:
							class160.field1805 = var2;
							break;
						case 25:
							int var5 = var2.indexOf(".");
							if (var5 == -1) {
								class566.field5590 = Integer.parseInt(var2);
							} else {
								class566.field5590 = Integer.parseInt(var2.substring(0, var5));
								Integer.parseInt(var2.substring(var5 + 1));
							}
						}
					}
				}

				Scene.Scene_isLowDetail = false;
				isLowDetail = false;
				class335.worldHost = this.getCodeBase().getHost();
				ClanSettings.field1791 = new JagNetThread();
				String var6 = IntProjection.field2013.name;
				byte var7 = 0;
				if ((worldProperties & class563.field5569.rsOrdinal()) != 0) {
					HealthBarUpdate.field1292 = "beta";
				}

				try {
					UserComparator7.method3214("oldschool", HealthBarUpdate.field1292, var6, var7, 25);
				} catch (Exception var8) {
					class290.RunException_sendStackTrace((String)null, var8);
				}

				SecureRandomCallable.client = this;
				RunException.field5762 = clientType;
				Varps.method6885();
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
					this.https = true;
				}

				if (field576 == -1) {
					if (!this.containsAccessAndRefreshToken() && !this.containsSessionAndCharacterId()) {
						field576 = 0;
					} else {
						field576 = 5;
					}
				}

				this.startThread(765, 503, 230, 1);
			}
		} catch (RuntimeException var9) {
			throw WorldMapSprite.newRunException(var9, "client.init(" + ')');
		}
	}
}
