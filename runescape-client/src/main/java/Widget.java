import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ok")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("bu")
	public static boolean field4244;
	@ObfuscatedName("bs")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 533459329
	)
	@Export("id")
	public int id;
	@ObfuscatedName("bo")
	@Export("childIndex")
	@ObfuscatedGetter(
		intValue = -2066937045
	)
	public int childIndex;
	@ObfuscatedName("bx")
	String field4249;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 2142577369
	)
	@Export("type")
	public int type;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1940842635
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -90114151
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 754129723
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 608546909
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 716410813
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -2106718045
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 417314447
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1842558737
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1132497721
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -872174293
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -197149149
	)
	@Export("x")
	public int x;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1419872165
	)
	@Export("y")
	public int y;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -1444040365
	)
	@Export("width")
	public int width;
	@ObfuscatedName("cy")
	@Export("height")
	@ObfuscatedGetter(
		intValue = -171267385
	)
	public int height;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -898085333
	)
	public int field4189;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -1392439829
	)
	public int field4198;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 1515971413
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 1346538289
	)
	public int field4173;
	@ObfuscatedName("cq")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -1498345315
	)
	public int field4228;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -145169885
	)
	public int field4195;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -297344299
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 1865670527
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 1585837195
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -2075941097
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -1063673951
	)
	@Export("color")
	public int color;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -1386710255
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -2145980579
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -914317773
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("cu")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lxt;"
	)
	@Export("fillMode")
	public FillMode fillMode;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 1291880175
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -1658430411
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -1790269679
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("cd")
	public boolean field4180;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -722126333
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -21016229
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("cg")
	public String field4212;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = 13878217
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("dd")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -699180617
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = 127860747
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("du")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("da")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 2053919903
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = 601902903
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = -2130449181
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = -1991121381
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = -606095219
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -598788467
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = 1966802705
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = -1986755569
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = 1391598975
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = 1937933705
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -424152485
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = -1593185213
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = 869217751
	)
	public int field4196;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = -876924861
	)
	public int field4241;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	public PlayerComposition field4233;
	@ObfuscatedName("db")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("de")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -433610479
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = -408694707
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("dw")
	@Export("text")
	public String text;
	@ObfuscatedName("es")
	@Export("text2")
	public String text2;
	@ObfuscatedName("el")
	@ObfuscatedGetter(
		intValue = 1480929857
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("ev")
	@ObfuscatedGetter(
		intValue = 1981836483
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("ey")
	@ObfuscatedGetter(
		intValue = -865459389
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("eg")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("eh")
	int[] field4283;
	@ObfuscatedName("et")
	int[] field4245;
	@ObfuscatedName("ei")
	int[] field4246;
	@ObfuscatedName("ea")
	String[] field4247;
	@ObfuscatedName("em")
	@ObfuscatedGetter(
		intValue = -1921800269
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("ef")
	public boolean field4182;
	@ObfuscatedName("ee")
	public byte[][] field4250;
	@ObfuscatedName("ek")
	public byte[][] field4251;
	@ObfuscatedName("ec")
	public int[] field4316;
	@ObfuscatedName("eu")
	public int[] field4253;
	@ObfuscatedName("ex")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("ez")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("eo")
	public String[][] field4256;
	@ObfuscatedName("ew")
	@Export("targetPriority")
	public int targetPriority;
	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("eb")
	@ObfuscatedGetter(
		intValue = 1277961591
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("ed")
	@ObfuscatedGetter(
		intValue = 110623929
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("eq")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("en")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("er")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("ej")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("fp")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("fn")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("fj")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("fi")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("fa")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("fw")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("fq")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("fu")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("fk")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("fr")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("fd")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("fb")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("fy")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("fc")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("fm")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("fz")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("fv")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("fg")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("fe")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("fx")
	public Object[] field4319;
	@ObfuscatedName("fo")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("ft")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("fs")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("fh")
	public Object[] field4288;
	@ObfuscatedName("ff")
	public Object[] field4289;
	@ObfuscatedName("fl")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("gn")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("gi")
	public Object[] field4292;
	@ObfuscatedName("gt")
	public Object[] field4243;
	@ObfuscatedName("gb")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("ge")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("gh")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("ga")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("gl")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("gs")
	public Object[] field4299;
	@ObfuscatedName("gz")
	public Object[] field4300;
	@ObfuscatedName("gy")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("gc")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("gu")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("gp")
	@ObfuscatedGetter(
		intValue = 711232177
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("gr")
	public String field4305;
	@ObfuscatedName("go")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("gg")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("gw")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("gj")
	@ObfuscatedGetter(
		intValue = -1748663651
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = -1613511747
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("gm")
	@ObfuscatedGetter(
		intValue = 1717789947
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("gx")
	@ObfuscatedGetter(
		intValue = 245645923
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "[Lok;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("gq")
	public boolean field4314;
	@ObfuscatedName("gd")
	public boolean field4315;
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = 1629822699
	)
	public int field4285;
	@ObfuscatedName("hm")
	@ObfuscatedGetter(
		intValue = 1049224591
	)
	public int field4317;
	@ObfuscatedName("ha")
	@ObfuscatedGetter(
		intValue = -661262903
	)
	public int field4318;
	@ObfuscatedName("hs")
	@ObfuscatedGetter(
		intValue = -73738295
	)
	public int field4266;
	@ObfuscatedName("hl")
	@ObfuscatedGetter(
		intValue = -1107037821
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("hh")
	@ObfuscatedGetter(
		intValue = -904807023
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("hu")
	public int[] field4322;
	@ObfuscatedName("hg")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("hd")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("ho")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;
	@ObfuscatedName("hq")
	HashMap field4326;
	@ObfuscatedName("hv")
	HashMap field4327;
	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	class363 field4308;
	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	class255 field4194;
	@ObfuscatedName("hp")
	@ObfuscatedGetter(
		intValue = 1438744005
	)
	int field4177;
	@ObfuscatedName("hy")
	int[] field4209;
	@ObfuscatedName("ht")
	Object[] field4332;
	@ObfuscatedName("hn")
	@ObfuscatedGetter(
		intValue = 997801367
	)
	int field4333;

	static {
		field4244 = false;
	}

	public Widget() {
		this.isIf3 = false;
		this.id = -1;
		this.childIndex = -517036931;
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
		this.field4189 = 1;
		this.field4198 = 1;
		this.parentId = -1;
		this.field4173 = -1;
		this.isHidden = false;
		this.field4228 = 65535;
		this.field4195 = 0;
		this.scrollX = 0;
		this.scrollY = 0;
		this.scrollWidth = 0;
		this.scrollHeight = 0;
		this.color = 0;
		this.color2 = 0;
		this.mouseOverColor = 0;
		this.mouseOverColor2 = 0;
		this.fill = false;
		this.fillMode = FillMode.SOLID;
		this.transparencyTop = 0;
		this.transparencyBot = 0;
		this.lineWid = 1;
		this.field4180 = false;
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
		this.field4196 = 0;
		this.field4241 = 0;
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
		this.field4182 = false;
		this.dataText = "";
		this.targetPriority = -1479148364;
		this.parent = null;
		this.dragZoneSize = 0;
		this.dragThreshold = 0;
		this.isScrollBar = false;
		this.spellActionName = "";
		this.hasListener = false;
		this.mouseOverRedirect = -1;
		this.field4305 = "";
		this.buttonText = "Ok";
		this.itemId = -1;
		this.itemQuantity = 0;
		this.modelFrame = 0;
		this.modelFrameCycle = 0;
		this.field4314 = false;
		this.field4315 = false;
		this.field4285 = -1;
		this.field4317 = 0;
		this.field4318 = 0;
		this.field4266 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
		this.field4177 = -1;
	}

	@ObfuscatedSignature(
		descriptor = "(Lok;)V"
	)
	public Widget(Widget var1) {
		this.isIf3 = false;
		this.id = -1;
		this.childIndex = -517036931;
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
		this.field4189 = 1;
		this.field4198 = 1;
		this.parentId = -1;
		this.field4173 = -1;
		this.isHidden = false;
		this.field4228 = 65535;
		this.field4195 = 0;
		this.scrollX = 0;
		this.scrollY = 0;
		this.scrollWidth = 0;
		this.scrollHeight = 0;
		this.color = 0;
		this.color2 = 0;
		this.mouseOverColor = 0;
		this.mouseOverColor2 = 0;
		this.fill = false;
		this.fillMode = FillMode.SOLID;
		this.transparencyTop = 0;
		this.transparencyBot = 0;
		this.lineWid = 1;
		this.field4180 = false;
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
		this.field4196 = 0;
		this.field4241 = 0;
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
		this.field4182 = false;
		this.dataText = "";
		this.targetPriority = -1479148364;
		this.parent = null;
		this.dragZoneSize = 0;
		this.dragThreshold = 0;
		this.isScrollBar = false;
		this.spellActionName = "";
		this.hasListener = false;
		this.mouseOverRedirect = -1;
		this.field4305 = "";
		this.buttonText = "Ok";
		this.itemId = -1;
		this.itemQuantity = 0;
		this.modelFrame = 0;
		this.modelFrameCycle = 0;
		this.field4314 = false;
		this.field4315 = false;
		this.field4285 = -1;
		this.field4317 = 0;
		this.field4318 = 0;
		this.field4266 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
		this.field4177 = -1;
		this.isIf3 = var1.isIf3;
		this.id = var1.id;
		this.childIndex = var1.childIndex;
		this.field4249 = var1.field4249;
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
		this.field4189 = var1.field4189;
		this.field4198 = var1.field4198;
		this.parentId = var1.parentId;
		this.field4173 = var1.field4173;
		this.field4228 = var1.field4228;
		this.field4195 = var1.field4195;
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
		this.field4180 = var1.field4180;
		this.spriteId2 = var1.spriteId2;
		this.spriteId = var1.spriteId;
		this.field4212 = var1.field4212;
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
		this.field4196 = var1.field4196;
		this.field4241 = var1.field4241;
		if (var1.field4233 != null) {
			this.field4233 = new PlayerComposition(var1.field4233);
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
		this.field4283 = this.method7923(var1.field4283);
		this.field4245 = this.method7923(var1.field4245);
		this.field4246 = this.method7923(var1.field4246);
		this.field4247 = (String[])((String[])this.method7922(var1.field4247));
		if (var1.field4194 != null) {
			this.field4194 = new class255(var1.field4194);
		}

		this.field4177 = var1.field4177;
		this.field4326 = var1.field4326;
		if (var1.field4327 != null) {
			this.field4327 = new HashMap();
			this.field4327.putAll(var1.field4327);
		}

		this.field4308 = null;
		this.flags = var1.flags;
		this.field4182 = var1.field4182;
		int var2;
		if (var1.field4250 != null) {
			this.field4250 = new byte[var1.field4250.length][];

			for (var2 = 0; var2 < var1.field4250.length; ++var2) {
				this.field4250[var2] = new byte[var1.field4250[var2].length];
				System.arraycopy(var1.field4250[var2], 0, this.field4250[var2], 0, var1.field4250[var2].length);
			}
		}

		if (var1.field4251 != null) {
			this.field4251 = new byte[var1.field4251.length][];

			for (var2 = 0; var2 < var1.field4251.length; ++var2) {
				this.field4251[var2] = new byte[var1.field4251[var2].length];
				System.arraycopy(var1.field4251[var2], 0, this.field4251[var2], 0, var1.field4251[var2].length);
			}
		}

		this.field4316 = this.method7923(var1.field4316);
		this.field4253 = this.method7923(var1.field4253);
		this.dataText = var1.dataText;
		this.actions = (String[])((String[])this.method7922(var1.actions));
		if (var1.field4256 != null) {
			this.field4256 = new String[var1.field4256.length][];

			for (var2 = 0; var2 < var1.field4256.length; ++var2) {
				this.field4256[var2] = new String[var1.field4256[var2].length];
				System.arraycopy(var1.field4256[var2], 0, this.field4256[var2], 0, var1.field4256[var2].length);
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
		this.field4319 = var1.field4319;
		this.onScroll = var1.onScroll;
		this.onChatTransmit = var1.onChatTransmit;
		this.onKey = var1.onKey;
		this.field4288 = var1.field4288;
		this.field4289 = var1.field4289;
		this.onFriendTransmit = var1.onFriendTransmit;
		this.onClanTransmit = var1.onClanTransmit;
		this.field4292 = var1.field4292;
		this.field4243 = var1.field4243;
		this.onMiscTransmit = var1.onMiscTransmit;
		this.onDialogAbort = var1.onDialogAbort;
		this.onSubChange = var1.onSubChange;
		this.onResize = var1.onResize;
		this.onStockTransmit = var1.onStockTransmit;
		this.field4299 = var1.field4299;
		this.field4300 = var1.field4300;
		this.cs1Instructions = var1.cs1Instructions;
		this.cs1Comparisons = this.method7923(var1.cs1Comparisons);
		this.cs1ComparisonValues = this.method7923(var1.cs1ComparisonValues);
		this.mouseOverRedirect = var1.mouseOverRedirect;
		this.field4305 = var1.field4305;
		this.buttonText = var1.buttonText;
		this.itemIds = this.method7923(var1.itemIds);
		this.itemQuantities = this.method7923(var1.itemQuantities);
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

		this.field4314 = var1.field4314;
		this.field4315 = var1.field4315;
		this.field4285 = var1.field4285;
		this.field4317 = var1.field4317;
		this.field4318 = var1.field4318;
		this.field4266 = var1.field4266;
		this.rootIndex = var1.rootIndex;
		this.cycle = var1.cycle;
		this.field4322 = this.method7923(var1.field4322);
		this.noClickThrough = var1.noClickThrough;
		this.noScrollThrough = var1.noScrollThrough;
		this.prioritizeMenuEntry = var1.prioritizeMenuEntry;
		if (var1.field4333 > 0) {
			this.field4209 = this.method7923(var1.field4209);
			this.field4332 = this.method7922(var1.field4332);
			this.field4333 = var1.field4333;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;B)[Ljava/lang/Object;",
		garbageValue = "127"
	)
	Object[] method7922(Object[] var1) {
		return var1 != null ? Arrays.copyOf(var1, var1.length) : null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([II)[I",
		garbageValue = "1642470839"
	)
	int[] method7923(int[] var1) {
		return var1 != null ? Arrays.copyOf(var1, var1.length) : null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "512167137"
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
			this.field4305 = var1.readStringCp1252NullTerminated();
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lwj;B)V",
		garbageValue = "-95"
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
				this.field4196 = var1.readUnsignedShort();
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
			this.field4180 = var1.readUnsignedByte() == 1;
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwj;B)V",
		garbageValue = "-4"
	)
	void method8089(Buffer var1) {
		this.field4249 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)[Ljava/lang/Object;",
		garbageValue = "603992387"
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)[I",
		garbageValue = "-1191310504"
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lnp;ZLeu;I)Lxl;",
		garbageValue = "-1375686424"
	)
	@Export("getSprite")
	public SpritePixels getSprite(WidgetDefinition var1, boolean var2, UrlRequester var3) {
		field4244 = false;
		if (this.field4212 != null) {
			SpritePixels var4 = this.method7975(var1, var3);
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
			long var5 = ((this.spriteFlipH ? 1L : 0L) << 39) + ((this.spriteFlipV ? 1L : 0L) << 38) + (long)var8 + ((long)this.outline << 36) + ((long)this.spriteShadow << 40);
			SpritePixels var7 = (SpritePixels)var1.Widget_cachedSprites.get(var5);
			if (var7 != null) {
				return var7;
			} else {
				var7 = class455.SpriteBuffer_getSprite(var1.field4050, var8, 0);
				if (var7 == null) {
					field4244 = true;
					return null;
				} else {
					this.method7933(var7);
					var1.Widget_cachedSprites.put(var7, var5);
					return var7;
				}
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lnp;Leu;B)Lxl;",
		garbageValue = "63"
	)
	SpritePixels method7975(WidgetDefinition var1, UrlRequester var2) {
		if (!this.method7928()) {
			return this.method7931(var1, var2);
		} else {
			String var3 = this.field4212 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow;
			SpritePixels var4 = (SpritePixels)var1.field4059.method9911(var3);
			if (var4 == null) {
				SpritePixels var5 = this.method7931(var1, var2);
				if (var5 != null) {
					var4 = var5.method11907();
					this.method7933(var4);
					var1.field4059.method9921(var3, var4);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lnp;Leu;B)Lxl;",
		garbageValue = "4"
	)
	SpritePixels method7931(WidgetDefinition var1, UrlRequester var2) {
		if (this.field4212 != null && var2 != null) {
			class362 var3 = (class362)var1.field4046.method9911(this.field4212);
			if (var3 == null) {
				var3 = new class362(this.field4212, var2);
				var1.field4046.method9921(this.field4212, var3);
			}

			return var3.method7533();
		} else {
			return null;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "121"
	)
	boolean method7928() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxl;I)V",
		garbageValue = "-1966406403"
	)
	void method7933(SpritePixels var1) {
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lnp;B)Lri;",
		garbageValue = "80"
	)
	@Export("getFont")
	public Font getFont(WidgetDefinition var1) {
		field4244 = false;
		if (this.fontId == -1) {
			return null;
		} else {
			Font var2 = (Font)var1.Widget_cachedFonts.get((long)this.fontId);
			if (var2 != null) {
				return var2;
			} else {
				var2 = class293.method6757(var1.field4050, var1.field4051, this.fontId, 0);
				if (var2 != null) {
					var1.Widget_cachedFonts.put(var2, (long)this.fontId);
				} else {
					field4244 = true;
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lnp;Lit;IZLod;Lhr;Lhk;I)Ljd;",
		garbageValue = "1644722370"
	)
	@Export("getModel")
	public Model getModel(WidgetDefinition var1, SequenceDefinition var2, int var3, boolean var4, PlayerComposition var5, NPCComposition var6, NpcOverrides var7) {
		field4244 = false;
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
				var10 |= var7.field2078 << 20;
			}

			Model var12 = (Model)var1.Widget_cachedModels.get(var10);
			if (var12 == null) {
				ModelData var13 = null;
				int var14 = 64;
				int var15 = 768;
				switch(var8) {
				case 1:
					var13 = ModelData.ModelData_get(var1.field4049, var9, 0);
					break;
				case 2:
					var13 = var6.method4385((NpcOverrides)null);
					break;
				case 3:
					var13 = var5 != null ? var5.getModelData() : null;
					break;
				case 4:
					ItemComposition var16 = WorldMapIcon_1.ItemDefinition_get(var9);
					var13 = var16.getModelData(10);
					var14 += var16.ambient;
					var15 += var16.contrast * 5;
				case 5:
				default:
					break;
				case 6:
					var13 = var6.method4385(var7);
				}

				if (var13 == null) {
					field4244 = true;
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lnp;ZB)Lnt;",
		garbageValue = "53"
	)
	public SpriteMask method8091(WidgetDefinition var1, boolean var2) {
		if (this.spriteId == -1) {
			var2 = false;
		}

		int var3 = var2 ? this.spriteId : this.spriteId2;
		if (var3 == -1) {
			return null;
		} else {
			long var4 = (long)var3 + ((long)this.outline << 36) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.spriteShadow << 40);
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "850943889"
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;I)V",
		garbageValue = "-1706265698"
	)
	public void method7938(int var1, int var2, String var3) {
		if (this.field4256 == null || this.field4256.length <= var1) {
			String[][] var4 = new String[var1 + 1][];
			if (this.field4256 != null) {
				System.arraycopy(this.field4256, 0, var4, 0, this.field4256.length);
			}

			this.field4256 = var4;
		}

		if (this.field4256[var1] == null || this.field4256[var1].length <= var2) {
			String[] var5 = new String[var2 + 1];
			if (this.field4256[var1] != null) {
				System.arraycopy(this.field4256[var1], 0, var5, 0, this.field4256[var1].length);
			}

			this.field4256[var1] = var5;
		}

		this.field4256[var1][var2] = var3;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "804647622"
	)
	public boolean method7939() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1891786000"
	)
	public boolean method7927() {
		return this.type == 11 || this.type == 12;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "2108176373"
	)
	public Object method7941(int var1, Object var2) {
		for (int var3 = 0; var3 < this.field4333; ++var3) {
			if (this.field4209[var3] == var1) {
				return this.field4332[var3];
			}
		}

		return var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2018547967"
	)
	public int method7942(int var1, int var2) {
		for (int var3 = 0; var3 < this.field4333; ++var3) {
			if (this.field4209[var3] == var1) {
				return (Integer)this.field4332[var3];
			}
		}

		return var2;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "1831631022"
	)
	public void method7943(int var1, Object var2) {
		for (int var3 = 0; var3 < this.field4333; ++var3) {
			if (this.field4209[var3] == var1) {
				this.field4332[var3] = var2;
				return;
			}
		}

		if (this.field4332 == null) {
			this.field4209 = new int[4];
			this.field4332 = new Object[4];
		} else if (this.field4332.length == this.field4333) {
			this.field4209 = Arrays.copyOf(this.field4209, this.field4209.length * 2);
			this.field4332 = Arrays.copyOf(this.field4332, this.field4332.length * 2);
		}

		this.field4209[this.field4333] = var1;
		this.field4332[this.field4333] = var2;
		++this.field4333;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Leu;J)V"
	)
	public void method7944(String var1, String var2, UrlRequester var3, long var4) {
		if (this.type == 11 && var4 != -1L) {
			var1 = var1.replaceAll("%userid%", Long.toString(var4));
			this.field4194 = new class255();
			if (!this.field4194.method5871(var1, var2, var3)) {
				this.field4194 = null;
			} else {
				if (this.field4326 == null || this.field4327 == null) {
					this.method8012();
				}

			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Leu;I)V",
		garbageValue = "-329951815"
	)
	public void method7945(String var1, String var2, String var3, String var4, String var5, UrlRequester var6) {
		this.field4194 = new class255();
		if (!this.field4194.method5871(var1, var3, var6)) {
			this.field4194 = null;
		} else {
			if (this.field4326 == null || this.field4327 == null) {
				this.method8012();
			}

			this.field4194.method5896(var2, var4, var5);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Leu;B)V",
		garbageValue = "-57"
	)
	public void method8038(String var1, UrlRequester var2) {
		if (this.type == 11 && var1 != null) {
			this.field4194 = new class255();
			this.field4194.method5911(var1, var2);
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method8012() {
		this.field4326 = new HashMap();
		this.field4327 = new HashMap();
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1431563042"
	)
	public void method7948(int var1, int var2) {
		if (this.type == 11) {
			if (this.field4326 == null) {
				this.method8012();
			}

			this.field4326.put(var1, var2);
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "1663078714"
	)
	public void method7949(String var1, int var2) {
		if (this.type == 11) {
			if (this.field4327 == null) {
				this.method8012();
			}

			this.field4327.put(var1, var2);
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "605610209"
	)
	public boolean method7950(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field4194 != null && this.method7951()) {
			var1 -= var3;
			var2 -= var4;
			int var5 = (int)(this.field4194.method5881()[0] * (float)this.width);
			int var6 = (int)(this.field4194.method5881()[1] * (float)(this.height * -171267385));
			int var7 = var5 + (int)(this.field4194.method5881()[2] * (float)this.width);
			int var8 = var6 + (int)(this.field4194.method5881()[3] * (float)(-171267385 * this.height));
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-61"
	)
	public boolean method7951() {
		return this.field4177 == 2;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1932340615"
	)
	public int method7995(String var1) {
		return this.type == 11 && this.field4194 != null && this.method7951() ? this.field4194.method5901(var1) : -1;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "0"
	)
	public String method7953(String var1) {
		return this.type == 11 && this.field4194 != null && this.method7951() ? this.field4194.method5877(var1) : null;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1154163068"
	)
	public int method8025() {
		return this.field4327 != null && !this.field4327.isEmpty() ? 1 : 0;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2127429065"
	)
	public int method7955() {
		if (this.type == 11 && this.field4194 != null && this.field4327 != null && !this.field4327.isEmpty()) {
			String var1 = this.field4194.method5880();
			return var1 != null && this.field4327.containsKey(this.field4194.method5880()) ? (Integer)this.field4327.get(var1) : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1557802867"
	)
	public String method7956() {
		if (this.type == 11 && this.field4194 != null) {
			String var1 = this.field4194.method5880();
			Iterator var2 = this.field4194.method5879().iterator();

			while (var2.hasNext()) {
				class269 var3 = (class269)var2.next();
				String var4 = String.format("%%%S%%", var3.method6069());
				if (var3.vmethod6072() == 0) {
					var1.replaceAll(var4, Integer.toString(var3.vmethod6070()));
				} else {
					var1.replaceAll(var4, var3.vmethod6071());
				}
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(S)[I",
		garbageValue = "1285"
	)
	public int[] method8075() {
		if (this.type == 11 && this.field4194 != null) {
			int[] var1 = new int[3];
			int var2 = 0;
			Iterator var3 = this.field4194.method5879().iterator();

			while (var3.hasNext()) {
				class269 var4 = (class269)var3.next();
				if (!var4.method6069().equals("user_id")) {
					if (var4.vmethod6072() != 0) {
						return null;
					}

					var1[var2++] = var4.vmethod6070();
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

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(B)Ljy;",
		garbageValue = "-46"
	)
	public class255 method7957() {
		return this.field4194;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lnp;Leu;I)Z",
		garbageValue = "140499425"
	)
	public boolean method7958(WidgetDefinition var1, UrlRequester var2) {
		if (this.type == 11 && this.field4194 != null) {
			this.field4194.method5873(var2);
			if (this.field4194.method5874() != this.field4177) {
				this.field4177 = this.field4194.method5874();
				if (this.field4177 >= 3) {
					return true;
				}

				if (this.field4177 == 2) {
					this.method7959(var1);
					return true;
				}
			}

			return false;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Lnp;I)V",
		garbageValue = "-1044477584"
	)
	void method7959(WidgetDefinition var1) {
		this.noClickThrough = true;
		ArrayList var2 = this.field4194.method5904();
		ArrayList var3 = this.field4194.method5919();
		int var4 = var2.size() + var3.size();
		this.children = new Widget[var4];
		int var5 = 0;

		Iterator var6;
		Widget var8;
		for (var6 = var2.iterator(); var6.hasNext(); this.children[var5++] = var8) {
			class256 var7 = (class256)var6.next();
			var8 = Huffman.method8146(5, this, var5, 0, 0, 0, 0, var7.field3085);
			var8.field4212 = var7.field3091.method3590();
			class362 var9 = new class362(var7.field3091);
			var1.field4046.method9921(var8.field4212, var9);
		}

		for (var6 = var3.iterator(); var6.hasNext(); this.children[var5++] = var8) {
			class267 var10 = (class267)var6.next();
			var8 = Huffman.method8146(4, this, var5, 0, 0, 0, 0, var10.field3179);
			var8.text = var10.field3184;
			var8.fontId = (Integer)this.field4326.get(var10.field3182);
			var8.textXAlignment = var10.field3178;
			var8.textYAlignment = var10.field3181;
		}

	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "30294469"
	)
	public void method7935() {
		this.field4308 = new class363();

		for (int var1 = 1; var1 <= 12; ++var1) {
			this.field4308.field4090.method406(var1, 0);
		}

		for (char var2 = 0; var2 < ' '; ++var2) {
			this.field4308.field4090.method407(var2, 0);
		}

		this.field4308.field4090.method407('\u0080', 0);
		this.field4308.field4090.method406(82, 2);
		this.field4308.field4090.method406(81, 2);
		this.field4308.field4090.method406(86, 2);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)Lom;",
		garbageValue = "-1818954302"
	)
	public class365 method8041() {
		return this.field4308 != null ? this.field4308.field4093 : null;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)Lnd;",
		garbageValue = "1075903740"
	)
	public class359 method7921() {
		return this.field4308 != null ? this.field4308.field4089 : null;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)Lba;",
		garbageValue = "-554774111"
	)
	public class27 method7963() {
		return this.field4308 != null ? this.field4308.field4090 : null;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)Lna;",
		garbageValue = "-368787182"
	)
	public class363 method7964() {
		return this.field4308;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lom;I)Z",
		garbageValue = "-1335306019"
	)
	boolean method8050(class365 var1) {
		boolean var2 = false;
		if (this.text != null && !this.text.isEmpty()) {
			var2 |= var1.method7614(class373.method8154(this.text));
			this.text = "";
		}

		if (this.text2 != null && !this.text2.isEmpty()) {
			var2 |= var1.method7615(class373.method8154(this.text2));
			this.text2 = "";
		}

		return var2;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lnp;I)Z",
		garbageValue = "-1994585927"
	)
	public boolean method7992(WidgetDefinition var1) {
		class365 var2 = this.method8041();
		if (var2 == null) {
			return false;
		} else {
			boolean var3 = false;
			if (!var2.method7664() && this.fontId != -1) {
				int var4 = var2.method7873();
				int var5 = var2.method7666();
				int var6 = var2.method7647();
				int var7 = var2.method7781();
				Font var8 = this.getFont(var1);
				if (var8 != null) {
					var3 |= var2.method7641(var8);
					var3 |= this.method8050(var2);
					var3 |= var2.method7811(var4, var5);
					var3 |= var2.method7718(var6, var7);
				}
			} else if (var2.method7664()) {
				var3 |= this.method8050(var2);
			}

			var2.method7611();
			return var3;
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lod;ZI)V",
		garbageValue = "-1412306662"
	)
	public void method8094(PlayerComposition var1, boolean var2) {
		this.modelType = 7;
		this.field4233 = new PlayerComposition(var1);
		if (!var2) {
			this.field4233.equipment = Arrays.copyOf(this.field4233.field4096, this.field4233.field4096.length);
			this.field4233.method7548();
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1961152139"
	)
	static int method7962(int var0) {
		return var0 - 1;
	}
}
