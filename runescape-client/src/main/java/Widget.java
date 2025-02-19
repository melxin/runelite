import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("al")
	public static boolean field3928;
	@ObfuscatedName("bw")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1224523095
	)
	@Export("id")
	public int id;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -437855421
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("bz")
	String field3942;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1216312981
	)
	@Export("type")
	public int type;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 25536391
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1996250445
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 557439835
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1166378141
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 132269053
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1404099661
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 327665981
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1010374059
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -1107186821
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1701228421
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1890357515
	)
	@Export("x")
	public int x;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -2025199791
	)
	@Export("y")
	public int y;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 779142065
	)
	@Export("width")
	public int width;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1836304183
	)
	@Export("height")
	public int height;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -68051359
	)
	public int field4025;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1501859575
	)
	public int field3949;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1669067037
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("bd")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 936411759
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1861453479
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1767662611
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 1605072473
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 1903614753
	)
	@Export("color")
	public int color;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 1153011849
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -1170738671
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 98225225
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("cj")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lwy;"
	)
	@Export("fillMode")
	public FillMode fillMode;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 1012022625
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 352272375
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1114248153
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("cv")
	public boolean field3965;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 764275677
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -1205603557
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("cx")
	public String field3968;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 1842844301
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("cg")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 164998341
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -1572811845
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("cn")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("ci")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -130985503
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 364526793
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -7339527
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 335560773
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -1335221899
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 1991971727
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = 1099636965
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -1865709407
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = -1900427171
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -1373107747
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = -972546011
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -942410555
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 714045375
	)
	public int field3987;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = 1578713695
	)
	public int field3988;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	public PlayerComposition field3981;
	@ObfuscatedName("dl")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("dn")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -1204658847
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -2141678967
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("dw")
	@Export("text")
	public String text;
	@ObfuscatedName("db")
	@Export("text2")
	public String text2;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 518062857
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = 5558635
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 294811661
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("dx")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("dv")
	int[] field4000;
	@ObfuscatedName("df")
	int[] field4029;
	@ObfuscatedName("de")
	int[] field4002;
	@ObfuscatedName("da")
	String[] field4003;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	class216 field4004;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = -419347805
	)
	int field4034;
	@ObfuscatedName("dg")
	HashMap field4006;
	@ObfuscatedName("ew")
	HashMap field4007;
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	class359 field3991;
	@ObfuscatedName("ep")
	@ObfuscatedGetter(
		intValue = 1468723839
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("et")
	public boolean field3976;
	@ObfuscatedName("er")
	public byte[][] field3939;
	@ObfuscatedName("ez")
	public byte[][] field4012;
	@ObfuscatedName("ex")
	public int[] field4011;
	@ObfuscatedName("ea")
	public int[] field4014;
	@ObfuscatedName("ei")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("ey")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("eh")
	public String[][] field4017;
	@ObfuscatedName("ef")
	public int field4056;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("en")
	@ObfuscatedGetter(
		intValue = -23551309
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("em")
	@ObfuscatedGetter(
		intValue = 1553155195
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("eu")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("el")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("eq")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("eg")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("eb")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("fz")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("fr")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("fk")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("fe")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("fh")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("fg")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("fn")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("fq")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("fu")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("fx")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("fy")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("fp")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("fw")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("fl")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("fb")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("fs")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("fo")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("fm")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("ft")
	public Object[] field4045;
	@ObfuscatedName("fd")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("fc")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("fi")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("fv")
	public Object[] field4053;
	@ObfuscatedName("ff")
	public Object[] field4050;
	@ObfuscatedName("fa")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("fj")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("gu")
	public Object[] field3989;
	@ObfuscatedName("gm")
	public Object[] field4049;
	@ObfuscatedName("gp")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("gs")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("gg")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("gi")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("gr")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("ge")
	public Object[] field3974;
	@ObfuscatedName("gq")
	public Object[] field4061;
	@ObfuscatedName("gn")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("gl")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("gb")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("gt")
	@ObfuscatedGetter(
		intValue = 1272584113
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("gd")
	public String field4054;
	@ObfuscatedName("gx")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("go")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("gk")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("gw")
	@ObfuscatedGetter(
		intValue = 1248876623
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("gf")
	@ObfuscatedGetter(
		intValue = 444367531
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = -1613387829
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("gz")
	@ObfuscatedGetter(
		intValue = -1576482519
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "[Lnz;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("gc")
	public boolean field4075;
	@ObfuscatedName("ga")
	public boolean field4076;
	@ObfuscatedName("gh")
	@ObfuscatedGetter(
		intValue = -176350265
	)
	public int field4040;
	@ObfuscatedName("gy")
	@ObfuscatedGetter(
		intValue = -293770183
	)
	public int field4078;
	@ObfuscatedName("ht")
	@ObfuscatedGetter(
		intValue = -1655477243
	)
	public int field4027;
	@ObfuscatedName("hf")
	@ObfuscatedGetter(
		intValue = 1562837535
	)
	public int field4069;
	@ObfuscatedName("ha")
	@ObfuscatedGetter(
		intValue = -723654593
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("he")
	@ObfuscatedGetter(
		intValue = 633767977
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("hb")
	public int[] field4083;
	@ObfuscatedName("hv")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("hq")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("hi")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		field3928 = false;
	}

	public Widget() {
		this.isIf3 = false;
		this.id = -1;
		this.childIndex = -1;
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
		this.field4025 = 1;
		this.field3949 = 1;
		this.parentId = -1;
		this.isHidden = false;
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
		this.field3965 = false;
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
		this.field3987 = 0;
		this.field3988 = 0;
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
		this.field4034 = -1;
		this.flags = 0;
		this.field3976 = false;
		this.dataText = "";
		this.field4056 = -97278468;
		this.parent = null;
		this.dragZoneSize = 0;
		this.dragThreshold = 0;
		this.isScrollBar = false;
		this.spellActionName = "";
		this.hasListener = false;
		this.mouseOverRedirect = -1;
		this.field4054 = "";
		this.buttonText = "Ok";
		this.itemId = -1;
		this.itemQuantity = 0;
		this.modelFrame = 0;
		this.modelFrameCycle = 0;
		this.field4075 = false;
		this.field4076 = false;
		this.field4040 = -1;
		this.field4078 = 0;
		this.field4027 = 0;
		this.field4069 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
	}

	@ObfuscatedSignature(
		descriptor = "(Lnz;I)V"
	)
	public Widget(Widget var1, int var2) {
		this.isIf3 = false;
		this.id = -1;
		this.childIndex = -1;
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
		this.field4025 = 1;
		this.field3949 = 1;
		this.parentId = -1;
		this.isHidden = false;
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
		this.field3965 = false;
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
		this.field3987 = 0;
		this.field3988 = 0;
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
		this.field4034 = -1;
		this.flags = 0;
		this.field3976 = false;
		this.dataText = "";
		this.field4056 = -97278468;
		this.parent = null;
		this.dragZoneSize = 0;
		this.dragThreshold = 0;
		this.isScrollBar = false;
		this.spellActionName = "";
		this.hasListener = false;
		this.mouseOverRedirect = -1;
		this.field4054 = "";
		this.buttonText = "Ok";
		this.itemId = -1;
		this.itemQuantity = 0;
		this.modelFrame = 0;
		this.modelFrameCycle = 0;
		this.field4075 = false;
		this.field4076 = false;
		this.field4040 = -1;
		this.field4078 = 0;
		this.field4027 = 0;
		this.field4069 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
		this.isIf3 = var1.isIf3;
		this.id = var1.id;
		this.childIndex = var2;
		this.field3942 = var1.field3942;
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
		this.field4025 = var1.field4025;
		this.field3949 = var1.field3949;
		this.parentId = var1.parentId;
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
		this.field3965 = var1.field3965;
		this.spriteId2 = var1.spriteId2;
		this.spriteId = var1.spriteId;
		this.field3968 = var1.field3968;
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
		this.field3987 = var1.field3987;
		this.field3988 = var1.field3988;
		if (var1.field3981 != null) {
			this.field3981 = new PlayerComposition(var1.field3981);
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
		this.field4000 = this.method7315(var1.field4000);
		this.field4029 = this.method7315(var1.field4029);
		this.field4002 = this.method7315(var1.field4002);
		this.field4003 = (String[])((String[])this.method7392(var1.field4003));
		if (var1.field4004 != null) {
			this.field4004 = new class216(var1.field4004);
		}

		this.field4034 = var1.field4034;
		this.field4006 = var1.field4006;
		if (var1.field4007 != null) {
			this.field4007 = new HashMap();
			this.field4007.putAll(var1.field4007);
		}

		this.field3991 = null;
		this.flags = var1.flags;
		this.field3976 = var1.field3976;
		int var3;
		if (var1.field3939 != null) {
			this.field3939 = new byte[var1.field3939.length][];

			for (var3 = 0; var3 < var1.field3939.length; ++var3) {
				this.field3939[var3] = new byte[var1.field3939[var3].length];
				System.arraycopy(var1.field3939[var3], 0, this.field3939[var3], 0, var1.field3939[var3].length);
			}
		}

		if (var1.field4012 != null) {
			this.field4012 = new byte[var1.field4012.length][];

			for (var3 = 0; var3 < var1.field4012.length; ++var3) {
				this.field4012[var3] = new byte[var1.field4012[var3].length];
				System.arraycopy(var1.field4012[var3], 0, this.field4012[var3], 0, var1.field4012[var3].length);
			}
		}

		this.field4011 = this.method7315(var1.field4011);
		this.field4014 = this.method7315(var1.field4014);
		this.dataText = var1.dataText;
		this.actions = (String[])((String[])this.method7392(var1.actions));
		if (var1.field4017 != null) {
			this.field4017 = new String[var1.field4017.length][];

			for (var3 = 0; var3 < var1.field4017.length; ++var3) {
				this.field4017[var3] = new String[var1.field4017[var3].length];
				System.arraycopy(var1.field4017[var3], 0, this.field4017[var3], 0, var1.field4017[var3].length);
			}
		}

		this.field4056 = var1.field4056;
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
		this.field4045 = var1.field4045;
		this.onScroll = var1.onScroll;
		this.onChatTransmit = var1.onChatTransmit;
		this.onKey = var1.onKey;
		this.field4053 = var1.field4053;
		this.field4050 = var1.field4050;
		this.onFriendTransmit = var1.onFriendTransmit;
		this.onClanTransmit = var1.onClanTransmit;
		this.field3989 = var1.field3989;
		this.field4049 = var1.field4049;
		this.onMiscTransmit = var1.onMiscTransmit;
		this.onDialogAbort = var1.onDialogAbort;
		this.onSubChange = var1.onSubChange;
		this.onResize = var1.onResize;
		this.onStockTransmit = var1.onStockTransmit;
		this.field3974 = var1.field3974;
		this.field4061 = var1.field4061;
		this.cs1Instructions = var1.cs1Instructions;
		this.cs1Comparisons = this.method7315(var1.cs1Comparisons);
		this.cs1ComparisonValues = this.method7315(var1.cs1ComparisonValues);
		this.mouseOverRedirect = var1.mouseOverRedirect;
		this.field4054 = var1.field4054;
		this.buttonText = var1.buttonText;
		this.itemIds = this.method7315(var1.itemIds);
		this.itemQuantities = this.method7315(var1.itemQuantities);
		this.itemId = var1.itemId;
		this.itemQuantity = var1.itemQuantity;
		this.modelFrame = var1.modelFrame;
		this.modelFrameCycle = var1.modelFrameCycle;
		if (var1.children != null) {
			this.children = new Widget[var1.children.length];

			for (var3 = 0; var3 < var1.children.length; ++var3) {
				this.children[var3] = new Widget(var1.children[var3], var1.children[var3].childIndex);
			}
		}

		this.field4075 = var1.field4075;
		this.field4076 = var1.field4076;
		this.field4040 = var1.field4040;
		this.field4078 = var1.field4078;
		this.field4027 = var1.field4027;
		this.field4069 = var1.field4069;
		this.rootIndex = var1.rootIndex;
		this.cycle = var1.cycle;
		this.field4083 = this.method7315(var1.field4083);
		this.noClickThrough = var1.noClickThrough;
		this.noScrollThrough = var1.noScrollThrough;
		this.prioritizeMenuEntry = var1.prioritizeMenuEntry;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;B)[Ljava/lang/Object;",
		garbageValue = "-122"
	)
	Object[] method7392(Object[] var1) {
		return var1 != null ? Arrays.copyOf(var1, var1.length) : null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([II)[I",
		garbageValue = "210421827"
	)
	int[] method7315(int[] var1) {
		return var1 != null ? Arrays.copyOf(var1, var1.length) : null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lvy;B)V",
		garbageValue = "100"
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
			this.field4054 = var1.readStringCp1252NullTerminated();
			var4 = var1.readUnsignedShort() & 63;
			this.flags |= var4 << 11;
		}

		if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) {
			this.buttonText = var1.readStringCp1252NullTerminated();
			if (this.buttonText.length() == 0) {
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-1307415567"
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
				this.field3987 = var1.readUnsignedShort();
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
			this.field3965 = var1.readUnsignedByte() == 1;
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-1477632809"
	)
	void method7298(Buffer var1) {
		this.field3942 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvy;B)[Ljava/lang/Object;",
		garbageValue = "-105"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvy;B)[I",
		garbageValue = "6"
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lnp;ZLec;I)Lwg;",
		garbageValue = "-350340940"
	)
	@Export("getSprite")
	public SpritePixels getSprite(WidgetDefinition var1, boolean var2, UrlRequester var3) {
		field3928 = false;
		if (this.field3968 != null) {
			SpritePixels var4 = this.method7352(var1, var3);
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
			long var5 = ((long)this.spriteShadow << 40) + ((this.spriteFlipV ? 1L : 0L) << 38) + (long)var8 + ((long)this.outline << 36) + ((this.spriteFlipH ? 1L : 0L) << 39);
			SpritePixels var7 = (SpritePixels)var1.Widget_cachedSprites.get(var5);
			if (var7 != null) {
				return var7;
			} else {
				var7 = class145.SpriteBuffer_getSprite(var1.field3843, var8, 0);
				if (var7 == null) {
					field3928 = true;
					return null;
				} else {
					this.method7301(var7);
					var1.Widget_cachedSprites.put(var7, var5);
					return var7;
				}
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lnp;Lec;I)Lwg;",
		garbageValue = "797081135"
	)
	SpritePixels method7352(WidgetDefinition var1, UrlRequester var2) {
		if (!this.method7414()) {
			return this.method7303(var1, var2);
		} else {
			String var3 = this.field3968 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow;
			SpritePixels var4 = (SpritePixels)var1.field3845.method9042(var3);
			if (var4 == null) {
				SpritePixels var5 = this.method7303(var1, var2);
				if (var5 != null) {
					var4 = var5.method10716();
					this.method7301(var4);
					var1.field3845.method9038(var3, var4);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lnp;Lec;I)Lwg;",
		garbageValue = "-1697935178"
	)
	SpritePixels method7303(WidgetDefinition var1, UrlRequester var2) {
		if (this.field3968 != null && var2 != null) {
			class358 var3 = (class358)var1.field3844.method9042(this.field3968);
			if (var3 == null) {
				var3 = new class358(this.field3968, var2);
				var1.field3844.method9038(this.field3968, var3);
			}

			return var3.method6943();
		} else {
			return null;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "82468509"
	)
	boolean method7414() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lwg;I)V",
		garbageValue = "-587182182"
	)
	void method7301(SpritePixels var1) {
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
		descriptor = "(Lnp;B)Lrf;",
		garbageValue = "121"
	)
	@Export("getFont")
	public Font getFont(WidgetDefinition var1) {
		field3928 = false;
		if (this.fontId == -1) {
			return null;
		} else {
			Font var2 = (Font)var1.Widget_cachedFonts.get((long)this.fontId);
			if (var2 != null) {
				return var2;
			} else {
				AbstractArchive var4 = var1.field3843;
				AbstractArchive var5 = var1.field3833;
				int var6 = this.fontId;
				byte[] var8 = var4.takeFile(var6, 0);
				boolean var7;
				if (var8 == null) {
					var7 = false;
				} else {
					class478.SpriteBuffer_decode(var8);
					var7 = true;
				}

				Font var3;
				if (!var7) {
					var3 = null;
				} else {
					byte[] var9 = var5.takeFile(var6, 0);
					Font var11;
					if (var9 == null) {
						var11 = null;
					} else {
						Font var10 = new Font(var9, Canvas.SpriteBuffer_xOffsets, class194.SpriteBuffer_yOffsets, SpriteBufferProperties.SpriteBuffer_spriteWidths, class456.SpriteBuffer_spriteHeights, DbTable.SpriteBuffer_spritePalette, SpriteBufferProperties.SpriteBuffer_pixels);
						CollisionMap.method5672();
						var11 = var10;
					}

					var3 = var11;
				}

				if (var3 != null) {
					var1.Widget_cachedFonts.put(var3, (long)this.fontId);
				} else {
					field3928 = true;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lnp;Liw;IZLnc;Lhm;Lhw;I)Ljf;",
		garbageValue = "1632403766"
	)
	@Export("getModel")
	public Model getModel(WidgetDefinition var1, SequenceDefinition var2, int var3, boolean var4, PlayerComposition var5, NPCComposition var6, NpcOverrides var7) {
		field3928 = false;
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
				var10 |= var7.field2029 << 20;
			}

			Model var12 = (Model)var1.Widget_cachedModels.get(var10);
			if (var12 == null) {
				ModelData var13 = null;
				int var14 = 64;
				int var15 = 768;
				switch(var8) {
				case 1:
					var13 = ModelData.ModelData_get(var1.field3835, var9, 0);
					break;
				case 2:
					var13 = var6.method3926((NpcOverrides)null);
					break;
				case 3:
					var13 = var5 != null ? var5.getModelData() : null;
					break;
				case 4:
					ItemComposition var16 = class138.ItemDefinition_get(var9);
					var13 = var16.getModelData(10);
					var14 += var16.ambient;
					var15 += var16.contrast * 5;
				case 5:
				default:
					break;
				case 6:
					var13 = var6.method3926(var7);
				}

				if (var13 == null) {
					field3928 = true;
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lnp;ZI)Lnu;",
		garbageValue = "1810188987"
	)
	public SpriteMask method7308(WidgetDefinition var1, boolean var2) {
		if (this.spriteId == -1) {
			var2 = false;
		}

		int var3 = var2 ? this.spriteId : this.spriteId2;
		if (var3 == -1) {
			return null;
		} else {
			long var4 = ((long)this.spriteShadow << 40) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.outline << 36) + (long)var3;
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-1851992731"
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;I)V",
		garbageValue = "171300655"
	)
	public void method7423(int var1, int var2, String var3) {
		if (this.field4017 == null || this.field4017.length <= var1) {
			String[][] var4 = new String[var1 + 1][];
			if (this.field4017 != null) {
				System.arraycopy(this.field4017, 0, var4, 0, this.field4017.length);
			}

			this.field4017 = var4;
		}

		if (this.field4017[var1] == null || this.field4017[var1].length <= var2) {
			String[] var5 = new String[var2 + 1];
			if (this.field4017[var1] != null) {
				System.arraycopy(this.field4017[var1], 0, var5, 0, this.field4017[var1].length);
			}

			this.field4017[var1] = var5;
		}

		this.field4017[var1][var2] = var3;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1374415971"
	)
	public boolean method7311() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-721263176"
	)
	public boolean method7340() {
		return this.type == 11 || this.type == 12;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Lec;J)V"
	)
	public void method7313(String var1, String var2, UrlRequester var3, long var4) {
		if (this.type == 11 && -1L != var4) {
			var1 = var1.replaceAll("%userid%", Long.toString(var4));
			this.field4004 = new class216();
			if (!this.field4004.method4385(var1, var2, var3)) {
				this.field4004 = null;
			} else {
				if (this.field4006 == null || this.field4007 == null) {
					this.method7346();
				}

			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lec;S)V",
		garbageValue = "176"
	)
	public void method7424(String var1, String var2, String var3, String var4, String var5, UrlRequester var6) {
		this.field4004 = new class216();
		if (!this.field4004.method4385(var1, var3, var6)) {
			this.field4004 = null;
		} else {
			if (this.field4006 == null || this.field4007 == null) {
				this.method7346();
			}

			this.field4004.method4392(var2, var4, var5);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lec;I)V",
		garbageValue = "1750050066"
	)
	public void method7300(String var1, UrlRequester var2) {
		if (this.type == 11 && var1 != null) {
			this.field4004 = new class216();
			this.field4004.method4399(var1, var2);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1952226410"
	)
	void method7346() {
		this.field4006 = new HashMap();
		this.field4007 = new HashMap();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-112"
	)
	public void method7382(int var1, int var2) {
		if (this.type == 11) {
			if (this.field4006 == null) {
				this.method7346();
			}

			this.field4006.put(var1, var2);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "489695632"
	)
	public void method7317(String var1, int var2) {
		if (this.type == 11) {
			if (this.field4007 == null) {
				this.method7346();
			}

			this.field4007.put(var1, var2);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "-956129073"
	)
	public boolean method7319(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field4004 != null && this.method7342()) {
			var1 -= var3;
			var2 -= var4;
			int var5 = (int)(this.field4004.method4389()[0] * (float)(this.width * 779142065));
			int var6 = (int)(this.field4004.method4389()[1] * (float)(this.height * 1836304183));
			int var7 = var5 + (int)(this.field4004.method4389()[2] * (float)(this.width * 779142065));
			int var8 = var6 + (int)(this.field4004.method4389()[3] * (float)(this.height * 1836304183));
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-400579242"
	)
	public boolean method7342() {
		return this.field4034 == 2;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "43"
	)
	public int method7321(String var1) {
		return this.type == 11 && this.field4004 != null && this.method7342() ? this.field4004.method4390(var1) : -1;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-757390104"
	)
	public String method7420(String var1) {
		return this.type == 11 && this.field4004 != null && this.method7342() ? this.field4004.method4391(var1) : null;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "758542823"
	)
	public int method7323() {
		return this.field4007 != null && this.field4007.size() > 0 ? 1 : 0;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2048620590"
	)
	public int method7324() {
		if (this.type == 11 && this.field4004 != null && this.field4007 != null && !this.field4007.isEmpty()) {
			String var1 = this.field4004.method4395();
			return var1 != null && this.field4007.containsKey(this.field4004.method4395()) ? (Integer)this.field4007.get(var1) : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1423082177"
	)
	public String method7325() {
		if (this.type == 11 && this.field4004 != null) {
			String var1 = this.field4004.method4395();
			Iterator var2 = this.field4004.method4394().iterator();

			while (var2.hasNext()) {
				class230 var3 = (class230)var2.next();
				String var4 = String.format("%%%S%%", var3.method4614());
				if (var3.vmethod4622() == 0) {
					var1.replaceAll(var4, Integer.toString(var3.vmethod4616()));
				} else {
					var1.replaceAll(var4, var3.vmethod4620());
				}
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1796591315"
	)
	public int[] method7428() {
		if (this.type == 11 && this.field4004 != null) {
			int[] var1 = new int[3];
			int var2 = 0;
			Iterator var3 = this.field4004.method4394().iterator();

			while (var3.hasNext()) {
				class230 var4 = (class230)var3.next();
				if (!var4.method4614().equals("user_id")) {
					if (var4.vmethod4622() != 0) {
						return null;
					}

					var1[var2++] = var4.vmethod4616();
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

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)Liu;",
		garbageValue = "-1031387128"
	)
	public class216 method7327() {
		return this.field4004;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lnp;Lec;B)Z",
		garbageValue = "97"
	)
	public boolean method7328(WidgetDefinition var1, UrlRequester var2) {
		if (this.type == 11 && this.field4004 != null) {
			this.field4004.method4426(var2);
			if (this.field4004.method4388() != this.field4034) {
				this.field4034 = this.field4004.method4388();
				if (this.field4034 >= 3) {
					return true;
				}

				if (this.field4034 == 2) {
					this.method7329(var1);
					return true;
				}
			}

			return false;
		} else {
			return false;
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lnp;I)V",
		garbageValue = "1553103231"
	)
	void method7329(WidgetDefinition var1) {
		this.noClickThrough = true;
		ArrayList var2 = this.field4004.method4387();
		ArrayList var3 = this.field4004.method4393();
		int var4 = var2.size() + var3.size();
		this.children = new Widget[var4];
		int var5 = 0;

		Iterator var6;
		Widget var8;
		for (var6 = var2.iterator(); var6.hasNext(); this.children[var5++] = var8) {
			class217 var7 = (class217)var6.next();
			var8 = LoginState.method1225(5, this, var5, 0, 0, 0, 0, var7.field2415);
			var8.field3968 = var7.field2414.method3170();
			class358 var9 = new class358(var7.field2414);
			var1.field3844.method9038(var8.field3968, var9);
		}

		for (var6 = var3.iterator(); var6.hasNext(); this.children[var5++] = var8) {
			class228 var10 = (class228)var6.next();
			var8 = LoginState.method1225(4, this, var5, 0, 0, 0, 0, var10.field2495);
			var8.text = var10.field2494;
			var8.fontId = (Integer)this.field4006.get(var10.field2498);
			var8.textXAlignment = var10.field2496;
			var8.textYAlignment = var10.field2497;
		}

	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-952535165"
	)
	public void method7363() {
		this.field3991 = new class359();

		for (int var1 = 1; var1 <= 12; ++var1) {
			this.field3991.field3858.method341(var1, 0);
		}

		for (char var2 = 0; var2 < ' '; ++var2) {
			this.field3991.field3858.method342(var2, 0);
		}

		this.field3991.field3858.method342('\u0080', 0);
		this.field3991.field3858.method341(82, 2);
		this.field3991.field3858.method341(81, 2);
		this.field3991.field3858.method341(86, 2);
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(B)Lnv;",
		garbageValue = "52"
	)
	public class361 method7331() {
		return this.field3991 != null ? this.field3991.field3863 : null;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)Lni;",
		garbageValue = "-642664560"
	)
	public class355 method7332() {
		return this.field3991 != null ? this.field3991.field3859 : null;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)Lbo;",
		garbageValue = "-1706395190"
	)
	public class27 method7333() {
		return this.field3991 != null ? this.field3991.field3858 : null;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(B)Lnf;",
		garbageValue = "32"
	)
	public class359 method7334() {
		return this.field3991;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lnv;I)Z",
		garbageValue = "-1515192521"
	)
	boolean method7335(class361 var1) {
		boolean var2 = false;
		if (this.text != null && !this.text.isEmpty()) {
			var2 |= var1.method7112(Clock.method4631(this.text));
			this.text = "";
		}

		if (this.text2 != null && !this.text2.isEmpty()) {
			var2 |= var1.method7052(Clock.method4631(this.text2));
			this.text2 = "";
		}

		return var2;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Lnp;I)Z",
		garbageValue = "742527179"
	)
	public boolean method7336(WidgetDefinition var1) {
		class361 var2 = this.method7331();
		if (var2 == null) {
			return false;
		} else {
			boolean var3 = false;
			if (!var2.method7077() && this.fontId != -1) {
				int var4 = var2.method7078();
				int var5 = var2.method7079();
				int var6 = var2.method7076();
				int var7 = var2.method7075();
				Font var8 = this.getFont(var1);
				if (var8 != null) {
					var3 |= var2.method7025(var8);
					var3 |= this.method7335(var2);
					var3 |= var2.method7030(var4, var5);
					var3 |= var2.method7213(var6, var7);
				}
			} else if (var2.method7077()) {
				var3 |= this.method7335(var2);
			}

			var2.method7090();
			return var3;
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lnc;ZB)V",
		garbageValue = "-7"
	)
	public void method7337(PlayerComposition var1, boolean var2) {
		this.modelType = 7;
		this.field3981 = new PlayerComposition(var1);
		if (!var2) {
			this.field3981.equipment = Arrays.copyOf(this.field3981.field3878, this.field3981.field3878.length);
			this.field3981.method6954();
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Ldy;",
		garbageValue = "-423799687"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = TextureProvider.archive12.takeFile(var0, 0);
			if (var2 == null) {
				return null;
			} else {
				var1 = class59.newScript(var2);
				Script.Script_cached.put(var1, (long)var0);
				return var1;
			}
		}
	}
}
