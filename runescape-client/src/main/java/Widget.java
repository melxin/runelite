import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("of")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("bm")
	public static boolean field4211;
	@ObfuscatedName("bp")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 278777747
	)
	@Export("id")
	public int id;
	@ObfuscatedName("bu")
	@Export("childIndex")
	@ObfuscatedGetter(
		intValue = 2077538819
	)
	public int childIndex;
	@ObfuscatedName("ba")
	String field4215;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 928687775
	)
	@Export("type")
	public int type;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 596322169
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1889823193
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -423647551
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -818525789
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 831546695
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1876325705
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1022258683
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1002768441
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1127299583
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1955156489
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -814361553
	)
	@Export("x")
	public int x;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -286860451
	)
	@Export("y")
	public int y;
	@ObfuscatedName("ch")
	@Export("width")
	@ObfuscatedGetter(
		intValue = -1946208531
	)
	public int width;
	@ObfuscatedName("ce")
	@Export("height")
	@ObfuscatedGetter(
		intValue = -905446999
	)
	public int height;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 105193489
	)
	public int field4231;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -1105373189
	)
	public int field4232;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 794900977
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 1865628485
	)
	public int field4234;
	@ObfuscatedName("ck")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -1516264759
	)
	public int field4236;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -86298045
	)
	public int field4241;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 1068149169
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -497311503
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -111672215
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -1963554889
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 7845467
	)
	@Export("color")
	public int color;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -1402291999
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1479122145
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -2076474873
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("cf")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lxg;"
	)
	@Export("fillMode")
	public class612 fillMode;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -2090288859
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -185564907
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 745861049
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("cr")
	public boolean field4251;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 79747855
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 1395688701
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("cl")
	public String field4254;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -1646072231
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("dw")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = -1211507623
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 771853131
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("dy")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("dc")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = 2124425241
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 94743803
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -1556184641
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = 463905393
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -750054055
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = 1986719883
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -1658952283
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = 656283015
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = 751747207
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = 1629507461
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = 1415481045
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -1417816983
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -209716257
	)
	public int field4334;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = -470641523
	)
	public int field4274;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	public PlayerComposition field4275;
	@ObfuscatedName("ds")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("de")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = -1574117989
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = 137772531
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("dn")
	@Export("text")
	public String text;
	@ObfuscatedName("ec")
	@Export("text2")
	public String text2;
	@ObfuscatedName("ea")
	@ObfuscatedGetter(
		intValue = -1315307335
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("ee")
	@ObfuscatedGetter(
		intValue = 450368173
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("eq")
	@ObfuscatedGetter(
		intValue = 1404399019
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("es")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("er")
	int[] field4288;
	@ObfuscatedName("ek")
	int[] field4287;
	@ObfuscatedName("ef")
	int[] field4216;
	@ObfuscatedName("ej")
	String[] field4261;
	@ObfuscatedName("ew")
	@ObfuscatedGetter(
		intValue = -1862035483
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("em")
	public boolean field4291;
	@ObfuscatedName("eg")
	public byte[][] field4263;
	@ObfuscatedName("el")
	public byte[][] field4293;
	@ObfuscatedName("ep")
	public int[] field4294;
	@ObfuscatedName("et")
	public int[] field4295;
	@ObfuscatedName("ex")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("ei")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("eu")
	public String[][] field4298;
	@ObfuscatedName("ey")
	@Export("targetPriority")
	public int targetPriority;
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("ez")
	@ObfuscatedGetter(
		intValue = -300326087
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = -1635558605
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("eo")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("ed")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("en")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("eb")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("ff")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("fp")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("fb")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("fn")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("fl")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("fh")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("fs")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("fi")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("fg")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("ft")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("fq")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("fz")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("fk")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("fo")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("fe")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("fw")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("fy")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("fu")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("fv")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("fx")
	public Object[] field4326;
	@ObfuscatedName("fj")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("fm")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("fd")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("fa")
	public Object[] field4330;
	@ObfuscatedName("fc")
	public Object[] field4331;
	@ObfuscatedName("fr")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("gn")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("gu")
	public Object[] field4336;
	@ObfuscatedName("gm")
	public Object[] field4335;
	@ObfuscatedName("gf")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("gd")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("go")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("gs")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("gg")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("ga")
	public Object[] field4341;
	@ObfuscatedName("gy")
	public Object[] field4245;
	@ObfuscatedName("gj")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("gk")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("gt")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("gw")
	@ObfuscatedGetter(
		intValue = 1325862771
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("gb")
	public String field4259;
	@ObfuscatedName("gz")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("gv")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("gh")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("gl")
	@ObfuscatedGetter(
		intValue = -231674939
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("ge")
	@ObfuscatedGetter(
		intValue = 1070452379
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("gx")
	@ObfuscatedGetter(
		intValue = 81622619
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("gp")
	@ObfuscatedGetter(
		intValue = 1113141895
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("gi")
	public boolean field4356;
	@ObfuscatedName("gq")
	public boolean field4217;
	@ObfuscatedName("gr")
	@ObfuscatedGetter(
		intValue = 698168635
	)
	public int field4358;
	@ObfuscatedName("he")
	@ObfuscatedGetter(
		intValue = 69055063
	)
	public int field4227;
	@ObfuscatedName("hw")
	@ObfuscatedGetter(
		intValue = -433459891
	)
	public int field4360;
	@ObfuscatedName("hd")
	@ObfuscatedGetter(
		intValue = 2018191091
	)
	public int field4361;
	@ObfuscatedName("hi")
	@ObfuscatedGetter(
		intValue = 321882055
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("hg")
	@ObfuscatedGetter(
		intValue = -728739761
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("hy")
	public int[] field4372;
	@ObfuscatedName("hj")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("hx")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("hq")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;
	@ObfuscatedName("hn")
	HashMap field4368;
	@ObfuscatedName("hz")
	HashMap field4310;
	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	class376 field4249;
	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	class225 field4367;
	@ObfuscatedName("hh")
	@ObfuscatedGetter(
		intValue = -1348354097
	)
	int field4324;
	@ObfuscatedName("hr")
	int[] field4373;
	@ObfuscatedName("hl")
	Object[] field4374;
	@ObfuscatedName("ha")
	@ObfuscatedGetter(
		intValue = -25645663
	)
	int field4375;

	static {
		field4211 = false;
	}

	public Widget() {
		this.isIf3 = false;
		this.id = -1;
		this.childIndex = -1657618603;
		this.buttonType = 0;
		this.contentType = 0;
		this.xAlignment = 0;
		this.yAlignment = 0;
		this.widthAlignment = 0;
		this.heightAlignment = 0;
		this.rawX = 0;
		this.rawY = 0;
		this.rawWidth = 0;
		this.rawHeight = 0;
		this.x = 0;
		this.y = 0;
		this.width = 0;
		this.height = 0;
		this.field4231 = 1;
		this.field4232 = 1;
		this.parentId = -1;
		this.field4234 = -1;
		this.isHidden = false;
		this.field4236 = 65535;
		this.field4241 = 0;
		this.scrollX = 0;
		this.scrollY = 0;
		this.scrollWidth = 0;
		this.scrollHeight = 0;
		this.color = 0;
		this.color2 = 0;
		this.mouseOverColor = 0;
		this.mouseOverColor2 = 0;
		this.fill = false;
		this.fillMode = class612.SOLID;
		this.transparencyTop = 0;
		this.transparencyBot = 0;
		this.lineWid = 1;
		this.field4251 = false;
		this.spriteId2 = -1;
		this.spriteId = -1;
		this.spriteAngle = 0;
		this.spriteTiling = false;
		this.outline = 0;
		this.spriteShadow = 0;
		this.modelType = 1;
		this.modelId = -1;
		this.modelType2 = 1;
		this.modelId2 = -1;
		this.sequenceId = -1;
		this.sequenceId2 = -1;
		this.modelOffsetX = 0;
		this.modelOffsetY = 0;
		this.modelAngleX = 0;
		this.modelAngleY = 0;
		this.modelAngleZ = 0;
		this.modelZoom = 100;
		this.field4334 = 0;
		this.field4274 = 0;
		this.modelOrthog = false;
		this.modelTransparency = false;
		this.itemQuantityMode = 2;
		this.fontId = -1;
		this.text = "";
		this.text2 = "";
		this.textLineHeight = 0;
		this.textXAlignment = 0;
		this.textYAlignment = 0;
		this.textShadowed = false;
		this.flags = 0;
		this.field4291 = false;
		this.dataText = "";
		this.targetPriority = 1300706076;
		this.parent = null;
		this.dragZoneSize = 0;
		this.dragThreshold = 0;
		this.isScrollBar = false;
		this.spellActionName = "";
		this.hasListener = false;
		this.mouseOverRedirect = -1;
		this.field4259 = "";
		this.buttonText = "Ok";
		this.itemId = -1;
		this.itemQuantity = 0;
		this.modelFrame = 0;
		this.modelFrameCycle = 0;
		this.field4356 = false;
		this.field4217 = false;
		this.field4358 = -1;
		this.field4227 = 0;
		this.field4360 = 0;
		this.field4361 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
		this.field4324 = -1;
	}

	@ObfuscatedSignature(
		descriptor = "(Lof;)V"
	)
	public Widget(Widget var1) {
		this.isIf3 = false;
		this.id = -1;
		this.childIndex = -1657618603;
		this.buttonType = 0;
		this.contentType = 0;
		this.xAlignment = 0;
		this.yAlignment = 0;
		this.widthAlignment = 0;
		this.heightAlignment = 0;
		this.rawX = 0;
		this.rawY = 0;
		this.rawWidth = 0;
		this.rawHeight = 0;
		this.x = 0;
		this.y = 0;
		this.width = 0;
		this.height = 0;
		this.field4231 = 1;
		this.field4232 = 1;
		this.parentId = -1;
		this.field4234 = -1;
		this.isHidden = false;
		this.field4236 = 65535;
		this.field4241 = 0;
		this.scrollX = 0;
		this.scrollY = 0;
		this.scrollWidth = 0;
		this.scrollHeight = 0;
		this.color = 0;
		this.color2 = 0;
		this.mouseOverColor = 0;
		this.mouseOverColor2 = 0;
		this.fill = false;
		this.fillMode = class612.SOLID;
		this.transparencyTop = 0;
		this.transparencyBot = 0;
		this.lineWid = 1;
		this.field4251 = false;
		this.spriteId2 = -1;
		this.spriteId = -1;
		this.spriteAngle = 0;
		this.spriteTiling = false;
		this.outline = 0;
		this.spriteShadow = 0;
		this.modelType = 1;
		this.modelId = -1;
		this.modelType2 = 1;
		this.modelId2 = -1;
		this.sequenceId = -1;
		this.sequenceId2 = -1;
		this.modelOffsetX = 0;
		this.modelOffsetY = 0;
		this.modelAngleX = 0;
		this.modelAngleY = 0;
		this.modelAngleZ = 0;
		this.modelZoom = 100;
		this.field4334 = 0;
		this.field4274 = 0;
		this.modelOrthog = false;
		this.modelTransparency = false;
		this.itemQuantityMode = 2;
		this.fontId = -1;
		this.text = "";
		this.text2 = "";
		this.textLineHeight = 0;
		this.textXAlignment = 0;
		this.textYAlignment = 0;
		this.textShadowed = false;
		this.flags = 0;
		this.field4291 = false;
		this.dataText = "";
		this.targetPriority = 1300706076;
		this.parent = null;
		this.dragZoneSize = 0;
		this.dragThreshold = 0;
		this.isScrollBar = false;
		this.spellActionName = "";
		this.hasListener = false;
		this.mouseOverRedirect = -1;
		this.field4259 = "";
		this.buttonText = "Ok";
		this.itemId = -1;
		this.itemQuantity = 0;
		this.modelFrame = 0;
		this.modelFrameCycle = 0;
		this.field4356 = false;
		this.field4217 = false;
		this.field4358 = -1;
		this.field4227 = 0;
		this.field4360 = 0;
		this.field4361 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
		this.field4324 = -1;
		this.isIf3 = var1.isIf3;
		this.id = var1.id;
		this.childIndex = var1.childIndex;
		this.field4215 = var1.field4215;
		this.type = var1.type;
		this.buttonType = var1.buttonType;
		this.contentType = var1.contentType;
		this.xAlignment = var1.xAlignment;
		this.yAlignment = var1.yAlignment;
		this.widthAlignment = var1.widthAlignment;
		this.heightAlignment = var1.heightAlignment;
		this.rawX = var1.rawX;
		this.rawY = var1.rawY;
		this.rawWidth = var1.rawWidth;
		this.rawHeight = var1.rawHeight;
		this.x = var1.x;
		this.y = var1.y;
		this.width = var1.width;
		this.height = var1.height;
		this.field4231 = var1.field4231;
		this.field4232 = var1.field4232;
		this.parentId = var1.parentId;
		this.field4234 = var1.field4234;
		this.field4236 = var1.field4236;
		this.field4241 = var1.field4241;
		this.isHidden = var1.isHidden;
		this.scrollX = var1.scrollX;
		this.scrollY = var1.scrollY;
		this.scrollWidth = var1.scrollWidth;
		this.scrollHeight = var1.scrollHeight;
		this.color = var1.color;
		this.color2 = var1.color2;
		this.mouseOverColor = var1.mouseOverColor;
		this.mouseOverColor2 = var1.mouseOverColor2;
		this.fill = var1.fill;
		this.fillMode = var1.fillMode;
		this.transparencyTop = var1.transparencyTop;
		this.transparencyBot = var1.transparencyBot;
		this.lineWid = var1.lineWid;
		this.field4251 = var1.field4251;
		this.spriteId2 = var1.spriteId2;
		this.spriteId = var1.spriteId;
		this.field4254 = var1.field4254;
		this.spriteAngle = var1.spriteAngle;
		this.spriteTiling = var1.spriteTiling;
		this.outline = var1.outline;
		this.spriteShadow = var1.spriteShadow;
		this.spriteFlipV = var1.spriteFlipV;
		this.spriteFlipH = var1.spriteFlipH;
		this.modelType = var1.modelType;
		this.modelId = var1.modelId;
		this.modelType2 = var1.modelType2;
		this.modelId2 = var1.modelId2;
		this.sequenceId = var1.sequenceId;
		this.sequenceId2 = var1.sequenceId2;
		this.modelOffsetX = var1.modelOffsetX;
		this.modelOffsetY = var1.modelOffsetY;
		this.modelAngleX = var1.modelAngleX;
		this.modelAngleY = var1.modelAngleY;
		this.modelAngleZ = var1.modelAngleZ;
		this.modelZoom = var1.modelZoom;
		this.field4334 = var1.field4334;
		this.field4274 = var1.field4274;
		if (var1.field4275 != null) {
			this.field4275 = new PlayerComposition(var1.field4275);
		}

		this.modelOrthog = var1.modelOrthog;
		this.modelTransparency = var1.modelTransparency;
		this.itemQuantityMode = var1.itemQuantityMode;
		this.fontId = var1.fontId;
		this.text = var1.text;
		this.text2 = var1.text2;
		this.textLineHeight = var1.textLineHeight;
		this.textXAlignment = var1.textXAlignment;
		this.textYAlignment = var1.textYAlignment;
		this.textShadowed = var1.textShadowed;
		this.field4288 = this.method8155(var1.field4288);
		this.field4287 = this.method8155(var1.field4287);
		this.field4216 = this.method8155(var1.field4216);
		this.field4261 = (String[])((String[])this.method8285(var1.field4261));
		if (var1.field4367 != null) {
			this.field4367 = new class225(var1.field4367);
		}

		this.field4324 = var1.field4324;
		this.field4368 = var1.field4368;
		if (var1.field4310 != null) {
			this.field4310 = new HashMap();
			this.field4310.putAll(var1.field4310);
		}

		this.field4249 = null;
		this.flags = var1.flags;
		this.field4291 = var1.field4291;
		int var2;
		if (var1.field4263 != null) {
			this.field4263 = new byte[var1.field4263.length][];

			for (var2 = 0; var2 < var1.field4263.length; ++var2) {
				this.field4263[var2] = new byte[var1.field4263[var2].length];
				System.arraycopy(var1.field4263[var2], 0, this.field4263[var2], 0, var1.field4263[var2].length);
			}
		}

		if (var1.field4293 != null) {
			this.field4293 = new byte[var1.field4293.length][];

			for (var2 = 0; var2 < var1.field4293.length; ++var2) {
				this.field4293[var2] = new byte[var1.field4293[var2].length];
				System.arraycopy(var1.field4293[var2], 0, this.field4293[var2], 0, var1.field4293[var2].length);
			}
		}

		this.field4294 = this.method8155(var1.field4294);
		this.field4295 = this.method8155(var1.field4295);
		this.dataText = var1.dataText;
		this.actions = (String[])((String[])this.method8285(var1.actions));
		if (var1.field4298 != null) {
			this.field4298 = new String[var1.field4298.length][];

			for (var2 = 0; var2 < var1.field4298.length; ++var2) {
				this.field4298[var2] = new String[var1.field4298[var2].length];
				System.arraycopy(var1.field4298[var2], 0, this.field4298[var2], 0, var1.field4298[var2].length);
			}
		}

		this.targetPriority = var1.targetPriority;
		this.parent = var1.parent;
		this.dragZoneSize = var1.dragZoneSize;
		this.dragThreshold = var1.dragThreshold;
		this.isScrollBar = var1.isScrollBar;
		this.spellActionName = var1.spellActionName;
		this.hasListener = var1.hasListener;
		this.onLoad = var1.onLoad;
		this.onClick = var1.onClick;
		this.onClickRepeat = var1.onClickRepeat;
		this.onRelease = var1.onRelease;
		this.onHold = var1.onHold;
		this.onMouseOver = var1.onMouseOver;
		this.onMouseRepeat = var1.onMouseRepeat;
		this.onMouseLeave = var1.onMouseLeave;
		this.onDrag = var1.onDrag;
		this.onDragComplete = var1.onDragComplete;
		this.onTargetEnter = var1.onTargetEnter;
		this.onTargetLeave = var1.onTargetLeave;
		this.onVarTransmit = var1.onVarTransmit;
		this.varTransmitTriggers = var1.varTransmitTriggers;
		this.onInvTransmit = var1.onInvTransmit;
		this.invTransmitTriggers = var1.invTransmitTriggers;
		this.onStatTransmit = var1.onStatTransmit;
		this.statTransmitTriggers = var1.statTransmitTriggers;
		this.onTimer = var1.onTimer;
		this.onOp = var1.onOp;
		this.field4326 = var1.field4326;
		this.onScroll = var1.onScroll;
		this.onChatTransmit = var1.onChatTransmit;
		this.onKey = var1.onKey;
		this.field4330 = var1.field4330;
		this.field4331 = var1.field4331;
		this.onFriendTransmit = var1.onFriendTransmit;
		this.onClanTransmit = var1.onClanTransmit;
		this.field4336 = var1.field4336;
		this.field4335 = var1.field4335;
		this.onMiscTransmit = var1.onMiscTransmit;
		this.onDialogAbort = var1.onDialogAbort;
		this.onSubChange = var1.onSubChange;
		this.onResize = var1.onResize;
		this.onStockTransmit = var1.onStockTransmit;
		this.field4341 = var1.field4341;
		this.field4245 = var1.field4245;
		this.cs1Instructions = var1.cs1Instructions;
		this.cs1Comparisons = this.method8155(var1.cs1Comparisons);
		this.cs1ComparisonValues = this.method8155(var1.cs1ComparisonValues);
		this.mouseOverRedirect = var1.mouseOverRedirect;
		this.field4259 = var1.field4259;
		this.buttonText = var1.buttonText;
		this.itemIds = this.method8155(var1.itemIds);
		this.itemQuantities = this.method8155(var1.itemQuantities);
		this.itemId = var1.itemId;
		this.itemQuantity = var1.itemQuantity;
		this.modelFrame = var1.modelFrame;
		this.modelFrameCycle = var1.modelFrameCycle;
		if (var1.children != null) {
			this.children = new Widget[var1.children.length];

			for (var2 = 0; var2 < var1.children.length; ++var2) {
				this.children[var2] = new Widget(var1.children[var2]);
			}
		}

		this.field4356 = var1.field4356;
		this.field4217 = var1.field4217;
		this.field4358 = var1.field4358;
		this.field4227 = var1.field4227;
		this.field4360 = var1.field4360;
		this.field4361 = var1.field4361;
		this.rootIndex = var1.rootIndex;
		this.cycle = var1.cycle;
		this.field4372 = this.method8155(var1.field4372);
		this.noClickThrough = var1.noClickThrough;
		this.noScrollThrough = var1.noScrollThrough;
		this.prioritizeMenuEntry = var1.prioritizeMenuEntry;
		if (var1.field4375 > 0) {
			this.field4373 = this.method8155(var1.field4373);
			this.field4374 = this.method8285(var1.field4374);
			this.field4375 = var1.field4375;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)[Ljava/lang/Object;",
		garbageValue = "-235863823"
	)
	Object[] method8285(Object[] var1) {
		return var1 != null ? Arrays.copyOf(var1, var1.length) : null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([IB)[I",
		garbageValue = "-79"
	)
	int[] method8155(int[] var1) {
		return var1 != null ? Arrays.copyOf(var1, var1.length) : null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxa;I)V",
		garbageValue = "-1427762751"
	)
	@Export("decodeLegacy")
	void decodeLegacy(Buffer var1) {
		this.isIf3 = false;
		this.type = var1.readUnsignedByte();
		this.buttonType = var1.readUnsignedByte();
		this.contentType = var1.readUnsignedShort();
		this.rawX = var1.readShort();
		this.rawY = var1.readShort();
		this.rawWidth = var1.readUnsignedShort();
		this.rawHeight = var1.readUnsignedShort();
		this.transparencyTop = var1.readUnsignedByte();
		this.parentId = var1.readUnsignedShort();
		if (this.parentId == 65535) {
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536;
		}

		this.mouseOverRedirect = var1.readUnsignedShort();
		if (this.mouseOverRedirect == 65535) {
			this.mouseOverRedirect = -1;
		}

		int var2 = var1.readUnsignedByte();
		int var3;
		if (var2 > 0) {
			this.cs1Comparisons = new int[var2];
			this.cs1ComparisonValues = new int[var2];

			for (var3 = 0; var3 < var2; ++var3) {
				this.cs1Comparisons[var3] = var1.readUnsignedByte();
				this.cs1ComparisonValues[var3] = var1.readUnsignedShort();
			}
		}

		var3 = var1.readUnsignedByte();
		int var4;
		if (var3 > 0) {
			this.cs1Instructions = new int[var3][];

			for (var4 = 0; var4 < var3; ++var4) {
				int var5 = var1.readUnsignedShort();
				this.cs1Instructions[var4] = new int[var5];

				for (int var6 = 0; var6 < var5; ++var6) {
					this.cs1Instructions[var4][var6] = var1.readUnsignedShort();
					if (this.cs1Instructions[var4][var6] == 65535) {
						this.cs1Instructions[var4][var6] = -1;
					}
				}
			}
		}

		if (this.type == 0) {
			this.scrollHeight = var1.readUnsignedShort();
			this.isHidden = var1.readUnsignedByte() == 1;
		}

		if (this.type == 1) {
			var1.readUnsignedShort();
			var1.readUnsignedByte();
		}

		if (this.type == 3) {
			this.fill = var1.readUnsignedByte() == 1;
		}

		if (this.type == 4 || this.type == 1) {
			this.textXAlignment = var1.readUnsignedByte();
			this.textYAlignment = var1.readUnsignedByte();
			this.textLineHeight = var1.readUnsignedByte();
			this.fontId = var1.readUnsignedShort();
			if (this.fontId == 65535) {
				this.fontId = -1;
			}

			this.textShadowed = var1.readUnsignedByte() == 1;
		}

		if (this.type == 4) {
			this.text = var1.readStringCp1252NullTerminated();
			this.text2 = var1.readStringCp1252NullTerminated();
		}

		if (this.type == 1 || this.type == 3 || this.type == 4) {
			this.color = var1.readInt();
		}

		if (this.type == 3 || this.type == 4) {
			this.color2 = var1.readInt();
			this.mouseOverColor = var1.readInt();
			this.mouseOverColor2 = var1.readInt();
		}

		if (this.type == 5) {
			this.spriteId2 = var1.readInt();
			this.spriteId = var1.readInt();
		}

		if (this.type == 6) {
			this.modelType = 1;
			this.modelId = var1.readUnsignedShort();
			if (this.modelId == 65535) {
				this.modelId = -1;
			}

			this.modelType2 = 1;
			this.modelId2 = var1.readUnsignedShort();
			if (this.modelId2 == 65535) {
				this.modelId2 = -1;
			}

			this.sequenceId = var1.readUnsignedShort();
			if (this.sequenceId == 65535) {
				this.sequenceId = -1;
			}

			this.sequenceId2 = var1.readUnsignedShort();
			if (this.sequenceId2 == 65535) {
				this.sequenceId2 = -1;
			}

			this.modelZoom = var1.readUnsignedShort();
			this.modelAngleX = var1.readUnsignedShort();
			this.modelAngleY = var1.readUnsignedShort();
		}

		if (this.type == 8) {
			this.text = var1.readStringCp1252NullTerminated();
		}

		if (this.buttonType == 2) {
			this.spellActionName = var1.readStringCp1252NullTerminated();
			this.field4259 = var1.readStringCp1252NullTerminated();
			var4 = var1.readUnsignedShort() & 63;
			this.flags |= var4 << 11;
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) {
			this.buttonText = var1.readStringCp1252NullTerminated();
			if (this.buttonText.isEmpty()) {
				if (this.buttonType == 1) {
					this.buttonText = "Ok";
				}

				if (this.buttonType == 4) {
					this.buttonText = "Select";
				}

				if (this.buttonType == 5) {
					this.buttonText = "Select";
				}

				if (this.buttonType == 6) {
					this.buttonText = "Continue";
				}
			}
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5) {
			this.flags |= 4194304;
		}

		if (this.buttonType == 6) {
			this.flags |= 1;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxa;I)V",
		garbageValue = "1982972606"
	)
	@Export("decode")
	void decode(Buffer var1) {
		var1.readUnsignedByte();
		this.isIf3 = true;
		this.type = var1.readUnsignedByte();
		this.contentType = var1.readUnsignedShort();
		this.rawX = var1.readShort();
		this.rawY = var1.readShort();
		this.rawWidth = var1.readUnsignedShort();
		if (this.type == 9) {
			this.rawHeight = var1.readShort();
		} else {
			this.rawHeight = var1.readUnsignedShort();
		}

		this.widthAlignment = var1.readByte();
		this.heightAlignment = var1.readByte();
		this.xAlignment = var1.readByte();
		this.yAlignment = var1.readByte();
		this.parentId = var1.readUnsignedShort();
		if (this.parentId == 65535) {
			this.parentId = -1;
		} else {
			this.parentId += this.id & -65536;
		}

		this.isHidden = var1.readUnsignedByte() == 1;
		if (this.type == 0) {
			this.scrollWidth = var1.readUnsignedShort();
			this.scrollHeight = var1.readUnsignedShort();
			this.noClickThrough = var1.readUnsignedByte() == 1;
		}

		if (this.type == 5) {
			this.spriteId2 = var1.readInt();
			this.spriteAngle = var1.readUnsignedShort();
			this.spriteTiling = var1.readUnsignedByte() == 1;
			this.transparencyTop = var1.readUnsignedByte();
			this.outline = var1.readUnsignedByte();
			this.spriteShadow = var1.readInt();
			this.spriteFlipV = var1.readUnsignedByte() == 1;
			this.spriteFlipH = var1.readUnsignedByte() == 1;
		}

		if (this.type == 6) {
			this.modelType = 1;
			this.modelId = var1.readUnsignedShort();
			if (this.modelId == 65535) {
				this.modelId = -1;
			}

			this.modelOffsetX = var1.readShort();
			this.modelOffsetY = var1.readShort();
			this.modelAngleX = var1.readUnsignedShort();
			this.modelAngleY = var1.readUnsignedShort();
			this.modelAngleZ = var1.readUnsignedShort();
			this.modelZoom = var1.readUnsignedShort();
			this.sequenceId = var1.readUnsignedShort();
			if (this.sequenceId == 65535) {
				this.sequenceId = -1;
			}

			this.modelOrthog = var1.readUnsignedByte() == 1;
			var1.readUnsignedShort();
			if (this.widthAlignment != 0) {
				this.field4334 = var1.readUnsignedShort();
			}

			if (this.heightAlignment != 0) {
				var1.readUnsignedShort();
			}
		}

		if (this.type == 4) {
			this.fontId = var1.readUnsignedShort();
			if (this.fontId == 65535) {
				this.fontId = -1;
			}

			this.text = var1.readStringCp1252NullTerminated();
			this.textLineHeight = var1.readUnsignedByte();
			this.textXAlignment = var1.readUnsignedByte();
			this.textYAlignment = var1.readUnsignedByte();
			this.textShadowed = var1.readUnsignedByte() == 1;
			this.color = var1.readInt();
		}

		if (this.type == 3) {
			this.color = var1.readInt();
			this.fill = var1.readUnsignedByte() == 1;
			this.transparencyTop = var1.readUnsignedByte();
		}

		if (this.type == 9) {
			this.lineWid = var1.readUnsignedByte();
			this.color = var1.readInt();
			this.field4251 = var1.readUnsignedByte() == 1;
		}

		this.flags = var1.readMedium();
		this.dataText = var1.readStringCp1252NullTerminated();
		int var2 = var1.readUnsignedByte();
		if (var2 > 0) {
			this.actions = new String[var2];

			for (int var3 = 0; var3 < var2; ++var3) {
				this.actions[var3] = var1.readStringCp1252NullTerminated();
			}
		}

		this.dragZoneSize = var1.readUnsignedByte();
		this.dragThreshold = var1.readUnsignedByte();
		this.isScrollBar = var1.readUnsignedByte() == 1;
		this.spellActionName = var1.readStringCp1252NullTerminated();
		this.onLoad = this.readListener(var1);
		this.onMouseOver = this.readListener(var1);
		this.onMouseLeave = this.readListener(var1);
		this.onTargetLeave = this.readListener(var1);
		this.onTargetEnter = this.readListener(var1);
		this.onVarTransmit = this.readListener(var1);
		this.onInvTransmit = this.readListener(var1);
		this.onStatTransmit = this.readListener(var1);
		this.onTimer = this.readListener(var1);
		this.onOp = this.readListener(var1);
		this.onMouseRepeat = this.readListener(var1);
		this.onClick = this.readListener(var1);
		this.onClickRepeat = this.readListener(var1);
		this.onRelease = this.readListener(var1);
		this.onHold = this.readListener(var1);
		this.onDrag = this.readListener(var1);
		this.onDragComplete = this.readListener(var1);
		this.onScroll = this.readListener(var1);
		this.varTransmitTriggers = this.readListenerTriggers(var1);
		this.invTransmitTriggers = this.readListenerTriggers(var1);
		this.statTransmitTriggers = this.readListenerTriggers(var1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lxa;I)V",
		garbageValue = "-1494150710"
	)
	void method8158(Buffer var1) {
		this.field4215 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lxa;I)[Ljava/lang/Object;",
		garbageValue = "362172302"
	)
	@Export("readListener")
	Object[] readListener(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 == 0) {
			return null;
		} else {
			Object[] var3 = new Object[var2];

			for (int var4 = 0; var4 < var2; ++var4) {
				int var5 = var1.readUnsignedByte();
				if (var5 == 0) {
					var3[var4] = new Integer(var1.readInt());
				} else if (var5 == 1) {
					var3[var4] = var1.readStringCp1252NullTerminated();
				}
			}

			this.hasListener = true;
			return var3;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lxa;B)[I",
		garbageValue = "2"
	)
	@Export("readListenerTriggers")
	int[] readListenerTriggers(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 == 0) {
			return null;
		} else {
			int[] var3 = new int[var2];

			for (int var4 = 0; var4 < var2; ++var4) {
				var3[var4] = var1.readInt();
			}

			return var3;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Loc;ZLei;I)Lxt;",
		garbageValue = "-2067381412"
	)
	@Export("getSprite")
	public SpritePixels getSprite(WidgetDefinition var1, boolean var2, UrlRequester var3) {
		field4211 = false;
		if (this.field4254 != null) {
			SpritePixels var4 = this.method8319(var1, var3);
			if (var4 != null) {
				return var4;
			}
		}

		int var8;
		if (var2) {
			var8 = this.spriteId;
		} else {
			var8 = this.spriteId2;
		}

		if (var8 == -1) {
			return null;
		} else {
			long var5 = ((this.spriteFlipH ? 1L : 0L) << 39) + (long)var8 + ((long)this.outline << 36) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.spriteShadow << 40);
			SpritePixels var7 = (SpritePixels)var1.Widget_cachedSprites.get(var5);
			if (var7 != null) {
				return var7;
			} else {
				var7 = class387.SpriteBuffer_getSprite(var1.field4104, var8, 0);
				if (var7 == null) {
					field4211 = true;
					return null;
				} else {
					this.method8165(var7);
					var1.Widget_cachedSprites.put(var7, var5);
					return var7;
				}
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Loc;Lei;B)Lxt;",
		garbageValue = "0"
	)
	SpritePixels method8319(WidgetDefinition var1, UrlRequester var2) {
		if (!this.method8318()) {
			return this.method8162(var1, var2);
		} else {
			String var3 = this.field4254 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow;
			SpritePixels var4 = (SpritePixels)var1.field4106.method10126(var3);
			if (var4 == null) {
				SpritePixels var5 = this.method8162(var1, var2);
				if (var5 != null) {
					var4 = var5.method12117();
					this.method8165(var4);
					var1.field4106.method10124(var3, var4);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Loc;Lei;I)Lxt;",
		garbageValue = "1264947430"
	)
	SpritePixels method8162(WidgetDefinition var1, UrlRequester var2) {
		if (this.field4254 != null && var2 != null) {
			class375 var3 = (class375)var1.field4103.method10126(this.field4254);
			if (var3 == null) {
				var3 = new class375(this.field4254, var2);
				var1.field4103.method10124(this.field4254, var3);
			}

			return var3.method7765();
		} else {
			return null;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1530880556"
	)
	boolean method8318() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lxt;B)V",
		garbageValue = "-15"
	)
	void method8165(SpritePixels var1) {
		if (this.spriteFlipV) {
			var1.flipVertically();
		}

		if (this.spriteFlipH) {
			var1.flipHorizontally();
		}

		if (this.outline > 0) {
			var1.pad(this.outline);
		}

		if (this.outline >= 1) {
			var1.outline(1);
		}

		if (this.outline >= 2) {
			var1.outline(16777215);
		}

		if (this.spriteShadow != 0) {
			var1.shadow(this.spriteShadow);
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Loc;I)Lsu;",
		garbageValue = "-1094266041"
	)
	@Export("getFont")
	public Font getFont(WidgetDefinition var1) {
		field4211 = false;
		if (this.fontId == -1) {
			return null;
		} else {
			Font var2 = (Font)var1.Widget_cachedFonts.get((long)this.fontId);
			if (var2 != null) {
				return var2;
			} else {
				AbstractArchive var4 = var1.field4104;
				AbstractArchive var5 = var1.field4105;
				int var6 = this.fontId;
				Font var3;
				if (!FloorOverlayDefinition.method4919(var4, var6, 0)) {
					var3 = null;
				} else {
					var3 = class181.method4292(var5.takeFile(var6, 0));
				}

				if (var3 != null) {
					var1.Widget_cachedFonts.put(var3, (long)this.fontId);
				} else {
					field4211 = true;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Loc;Liw;IZLoa;Lhu;Lha;B)Lky;",
		garbageValue = "-70"
	)
	@Export("getModel")
	public Model getModel(WidgetDefinition var1, SequenceDefinition var2, int var3, boolean var4, PlayerComposition var5, NPCComposition var6, NpcOverrides var7) {
		field4211 = false;
		int var8;
		int var9;
		if (var4) {
			var8 = this.modelType2;
			var9 = this.modelId2;
		} else {
			var8 = this.modelType;
			var9 = this.modelId;
		}

		if (var8 == 0) {
			return null;
		} else if (var8 == 1 && var9 == -1) {
			return null;
		} else {
			if (var7 != null && var7.useLocalPlayer && var8 == 6) {
				var8 = 3;
			}

			long var10 = (long)(var9 + (var8 << 16));
			if (var8 == 2 || var8 == 6) {
				if (var6 == null) {
					return null;
				}

				var10 = (long)(var6.id + (var8 << 16));
			}

			if (var7 != null) {
				var10 |= var7.field2099 << 20;
			}

			Model var12 = (Model)var1.Widget_cachedModels.get(var10);
			if (var12 == null) {
				ModelData var13 = null;
				int var14 = 64;
				int var15 = 768;
				switch(var8) {
				case 1:
					var13 = ModelData.ModelData_get(var1.field4113, var9, 0);
					break;
				case 2:
					var13 = var6.method4465((NpcOverrides)null);
					break;
				case 3:
					var13 = var5 != null ? var5.getModelData() : null;
					break;
				case 4:
					ItemComposition var16 = class150.ItemDefinition_get(var9);
					var13 = var16.getModelData(10);
					var14 += var16.ambient;
					var15 += var16.contrast * 5;
				case 5:
				default:
					break;
				case 6:
					var13 = var6.method4465(var7);
				}

				if (var13 == null) {
					field4211 = true;
					return null;
				}

				var12 = var13.toModel(var14, var15, -50, -10, -50);
				var1.Widget_cachedModels.put(var12, var10);
			}

			if (var2 != null) {
				var12 = var2.transformWidgetModel(var12, var3);
			}

			return var12;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Loc;ZI)Loz;",
		garbageValue = "-1798200640"
	)
	public SpriteMask method8168(WidgetDefinition var1, boolean var2) {
		if (this.spriteId == -1) {
			var2 = false;
		}

		int var3 = var2 ? this.spriteId : this.spriteId2;
		if (var3 == -1) {
			return null;
		} else {
			long var4 = ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.outline << 36) + (long)var3 + ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.spriteShadow << 40);
			SpriteMask var6 = (SpriteMask)var1.Widget_cachedSpriteMasks.get(var4);
			if (var6 != null) {
				return var6;
			} else {
				SpritePixels var7 = this.getSprite(var1, var2, (UrlRequester)null);
				if (var7 == null) {
					return null;
				} else {
					SpritePixels var8 = var7.copyNormalized();
					int[] var9 = new int[var8.subHeight];
					int[] var10 = new int[var8.subHeight];

					for (int var11 = 0; var11 < var8.subHeight; ++var11) {
						int var12 = 0;
						int var13 = var8.subWidth;

						int var14;
						for (var14 = 0; var14 < var8.subWidth; ++var14) {
							if (var8.pixels[var14 + var11 * var8.subWidth] == 0) {
								var12 = var14;
								break;
							}
						}

						for (var14 = var8.subWidth - 1; var14 >= var12; --var14) {
							if (var8.pixels[var14 + var11 * var8.subWidth] == 0) {
								var13 = var14 + 1;
								break;
							}
						}

						var9[var11] = var12;
						var10[var11] = var13 - var12;
					}

					var6 = new SpriteMask(var8.subWidth, var8.subHeight, var10, var9, var3);
					var1.Widget_cachedSpriteMasks.put(var6, var4);
					return var6;
				}
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-512958560"
	)
	@Export("setAction")
	public void setAction(int var1, String var2) {
		if (this.actions == null || this.actions.length <= var1) {
			String[] var3 = new String[var1 + 1];
			if (this.actions != null) {
				for (int var4 = 0; var4 < this.actions.length; ++var4) {
					var3[var4] = this.actions[var4];
				}
			}

			this.actions = var3;
		}

		this.actions[var1] = var2;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;I)V",
		garbageValue = "-1128625578"
	)
	public void method8170(int var1, int var2, String var3) {
		if (this.field4298 == null || this.field4298.length <= var1) {
			String[][] var4 = new String[var1 + 1][];
			if (this.field4298 != null) {
				System.arraycopy(this.field4298, 0, var4, 0, this.field4298.length);
			}

			this.field4298 = var4;
		}

		if (this.field4298[var1] == null || this.field4298[var1].length <= var2) {
			String[] var5 = new String[var2 + 1];
			if (this.field4298[var1] != null) {
				System.arraycopy(this.field4298[var1], 0, var5, 0, this.field4298[var1].length);
			}

			this.field4298[var1] = var5;
		}

		this.field4298[var1][var2] = var3;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-219595018"
	)
	public boolean method8171() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "22886"
	)
	public boolean method8239() {
		return this.type == 11 || this.type == 12;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;B)Ljava/lang/Object;",
		garbageValue = "107"
	)
	public Object method8283(int var1, Object var2) {
		for (int var3 = 0; var3 < this.field4375; ++var3) {
			if (this.field4373[var3] == var1) {
				return this.field4374[var3];
			}
		}

		return var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-482568902"
	)
	public int method8315(int var1, int var2) {
		for (int var3 = 0; var3 < this.field4375; ++var3) {
			if (this.field4373[var3] == var1) {
				return (Integer)this.field4374[var3];
			}
		}

		return var2;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;B)V",
		garbageValue = "-28"
	)
	public void method8175(int var1, Object var2) {
		for (int var3 = 0; var3 < this.field4375; ++var3) {
			if (this.field4373[var3] == var1) {
				this.field4374[var3] = var2;
				return;
			}
		}

		if (this.field4374 == null) {
			this.field4373 = new int[4];
			this.field4374 = new Object[4];
		} else if (this.field4374.length == this.field4375) {
			this.field4373 = Arrays.copyOf(this.field4373, this.field4373.length * 2);
			this.field4374 = Arrays.copyOf(this.field4374, this.field4374.length * 2);
		}

		this.field4373[this.field4375] = var1;
		this.field4374[this.field4375] = var2;
		++this.field4375;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Lei;J)V"
	)
	public void method8257(String var1, String var2, UrlRequester var3, long var4) {
		if (this.type == 11 && var4 != -1L) {
			var1 = var1.replaceAll("%userid%", Long.toString(var4));
			this.field4367 = new class225();
			if (!this.field4367.method5005(var1, var2, var3)) {
				this.field4367 = null;
			} else {
				if (this.field4368 == null || this.field4310 == null) {
					this.method8282();
				}

			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lei;B)V",
		garbageValue = "11"
	)
	public void method8177(String var1, String var2, String var3, String var4, String var5, UrlRequester var6) {
		this.field4367 = new class225();
		if (!this.field4367.method5005(var1, var3, var6)) {
			this.field4367 = null;
		} else {
			if (this.field4368 == null || this.field4310 == null) {
				this.method8282();
			}

			this.field4367.method5006(var2, var4, var5);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lei;I)V",
		garbageValue = "1049693640"
	)
	public void method8178(String var1, UrlRequester var2) {
		if (this.type == 11 && var1 != null) {
			this.field4367 = new class225();
			this.field4367.method5042(var1, var2);
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-124"
	)
	void method8282() {
		this.field4368 = new HashMap();
		this.field4310 = new HashMap();
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1163090419"
	)
	public void method8180(int var1, int var2) {
		if (this.type == 11) {
			if (this.field4368 == null) {
				this.method8282();
			}

			this.field4368.put(var1, var2);
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)V",
		garbageValue = "12"
	)
	public void method8181(String var1, int var2) {
		if (this.type == 11) {
			if (this.field4310 == null) {
				this.method8282();
			}

			this.field4310.put(var1, var2);
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "-1635748238"
	)
	public boolean method8182(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field4367 != null && this.method8183()) {
			var1 -= var3;
			var2 -= var4;
			int var5 = (int)(this.field4367.method5016()[0] * (float)(this.width * -1946208531));
			int var6 = (int)(this.field4367.method5016()[1] * (float)(this.height * -905446999));
			int var7 = var5 + (int)(this.field4367.method5016()[2] * (float)(-1946208531 * this.width));
			int var8 = var6 + (int)(this.field4367.method5016()[3] * (float)(this.height * -905446999));
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "14"
	)
	public boolean method8183() {
		return this.field4324 == 2;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-2118773102"
	)
	public int method8184(String var1) {
		return this.type == 11 && this.field4367 != null && this.method8183() ? this.field4367.method5010(var1) : -1;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "689900449"
	)
	public String method8185(String var1) {
		return this.type == 11 && this.field4367 != null && this.method8183() ? this.field4367.method5011(var1) : null;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1955667681"
	)
	public int method8198() {
		return this.field4310 != null && !this.field4310.isEmpty() ? 1 : 0;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1531019798"
	)
	public int method8225() {
		if (this.type == 11 && this.field4367 != null && this.field4310 != null && !this.field4310.isEmpty()) {
			String var1 = this.field4367.method5029();
			return var1 != null && this.field4310.containsKey(this.field4367.method5029()) ? (Integer)this.field4310.get(var1) : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-974116638"
	)
	public String method8231() {
		if (this.type == 11 && this.field4367 != null) {
			String var1 = this.field4367.method5029();
			Iterator var2 = this.field4367.method5014().iterator();

			while (var2.hasNext()) {
				class239 var3 = (class239)var2.next();
				String var4 = String.format("%%%S%%", var3.method5231());
				if (var3.vmethod5235() == 0) {
					var1.replaceAll(var4, Integer.toString(var3.vmethod5232()));
				} else {
					var1.replaceAll(var4, var3.vmethod5233());
				}
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "0"
	)
	public int[] method8189() {
		if (this.type == 11 && this.field4367 != null) {
			int[] var1 = new int[3];
			int var2 = 0;
			Iterator var3 = this.field4367.method5014().iterator();

			while (var3.hasNext()) {
				class239 var4 = (class239)var3.next();
				if (!var4.method5231().equals("user_id")) {
					if (var4.vmethod5235() != 0) {
						return null;
					}

					var1[var2++] = var4.vmethod5232();
					if (var2 > 3) {
						return null;
					}
				}
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)Lix;",
		garbageValue = "1030819063"
	)
	public class225 method8190() {
		return this.field4367;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Loc;Lei;I)Z",
		garbageValue = "-691285690"
	)
	public boolean method8191(WidgetDefinition var1, UrlRequester var2) {
		if (this.type == 11 && this.field4367 != null) {
			this.field4367.method5007(var2);
			if (this.field4367.method5043() != this.field4324) {
				this.field4324 = this.field4367.method5043();
				if (this.field4324 >= 3) {
					return true;
				}

				if (this.field4324 == 2) {
					this.method8192(var1);
					return true;
				}
			}

			return false;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Loc;B)V",
		garbageValue = "0"
	)
	void method8192(WidgetDefinition var1) {
		this.noClickThrough = true;
		ArrayList var2 = this.field4367.method5033();
		ArrayList var3 = this.field4367.method5004();
		int var4 = var2.size() + var3.size();
		this.children = new Widget[var4];
		int var5 = 0;

		Iterator var6;
		Widget var8;
		for (var6 = var2.iterator(); var6.hasNext(); this.children[var5++] = var8) {
			class226 var7 = (class226)var6.next();
			var8 = WorldMapRectangle.method7007(5, this, var5, 0, 0, 0, 0, var7.field2557);
			var8.field4254 = var7.field2559.method3660();
			class375 var9 = new class375(var7.field2559);
			var1.field4103.method10124(var8.field4254, var9);
		}

		for (var6 = var3.iterator(); var6.hasNext(); this.children[var5++] = var8) {
			class237 var10 = (class237)var6.next();
			var8 = WorldMapRectangle.method7007(4, this, var5, 0, 0, 0, 0, var10.field2651);
			var8.text = var10.field2652;
			var8.fontId = (Integer)this.field4368.get(var10.field2657);
			var8.textXAlignment = var10.field2654;
			var8.textYAlignment = var10.field2656;
		}

	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1724614069"
	)
	public void method8193() {
		this.field4249 = new class376();

		for (int var1 = 1; var1 <= 12; ++var1) {
			this.field4249.field4140.method424(var1, 0);
		}

		for (char var2 = 0; var2 < ' '; ++var2) {
			this.field4249.field4140.method460(var2, 0);
		}

		this.field4249.field4140.method460('\u0080', 0);
		this.field4249.field4140.method424(82, 2);
		this.field4249.field4140.method424(81, 2);
		this.field4249.field4140.method424(86, 2);
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)Loo;",
		garbageValue = "2080800876"
	)
	public class378 method8194() {
		return this.field4249 != null ? this.field4249.field4141 : null;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(S)Lom;",
		garbageValue = "16256"
	)
	public class372 method8195() {
		return this.field4249 != null ? this.field4249.field4136 : null;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(B)Lbg;",
		garbageValue = "13"
	)
	public class28 method8280() {
		return this.field4249 != null ? this.field4249.field4140 : null;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(B)Lop;",
		garbageValue = "-68"
	)
	public class376 method8197() {
		return this.field4249;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Loo;B)Z",
		garbageValue = "-27"
	)
	boolean method8279(class378 var1) {
		boolean var2 = false;
		if (this.text != null && !this.text.isEmpty()) {
			var2 |= var1.method7842(MouseRecorder.method2195(this.text));
			this.text = "";
		}

		if (this.text2 != null && !this.text2.isEmpty()) {
			var2 |= var1.method7843(MouseRecorder.method2195(this.text2));
			this.text2 = "";
		}

		return var2;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Loc;B)Z",
		garbageValue = "-17"
	)
	public boolean method8157(WidgetDefinition var1) {
		class378 var2 = this.method8194();
		if (var2 == null) {
			return false;
		} else {
			boolean var3 = false;
			if (!var2.method8105() && this.fontId != -1) {
				int var4 = var2.method7894();
				int var5 = var2.method7895();
				int var6 = var2.method7848();
				int var7 = var2.method8082();
				Font var8 = this.getFont(var1);
				if (var8 != null) {
					var3 |= var2.method7844(var8);
					var3 |= this.method8279(var2);
					var3 |= var2.method7849(var4, var5);
					var3 |= var2.method7861(var6, var7);
				}
			} else if (var2.method8105()) {
				var3 |= this.method8279(var2);
			}

			var2.method8097();
			return var3;
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Loa;ZI)V",
		garbageValue = "-1682372504"
	)
	public void method8200(PlayerComposition var1, boolean var2) {
		this.modelType = 7;
		this.field4275 = new PlayerComposition(var1);
		if (!var2) {
			this.field4275.equipment = Arrays.copyOf(this.field4275.field4150, this.field4275.field4150.length);
			this.field4275.method7794();
		}

	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIZI)V",
		garbageValue = "132153981"
	)
	@Export("addTileItemToGroundItems")
	static void addTileItemToGroundItems(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		class519.method10567(AsyncHttpResponse.worldView, var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
	}
}
