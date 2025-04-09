import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nh")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("bw")
	public static boolean field3937;
	@ObfuscatedName("bh")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1272786511
	)
	@Export("id")
	public int id;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1626125685
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("bd")
	String field3941;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 72144301
	)
	@Export("type")
	public int type;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -558315257
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1611553321
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1797381809
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -903435843
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -353052085
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -974493223
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1671078211
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 2000576485
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1145846507
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1123159847
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 552722723
	)
	@Export("x")
	public int x;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 615948551
	)
	@Export("y")
	public int y;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 624892547
	)
	@Export("width")
	public int width;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1265510039
	)
	@Export("height")
	public int height;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1322769529
	)
	public int field3957;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 307849569
	)
	public int field3958;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 2129317351
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -360011791
	)
	public int field3960;
	@ObfuscatedName("cp")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 1398998085
	)
	public int field3962;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 1145268223
	)
	public int field3968;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -995729201
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -937199437
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 429349927
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 377639309
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -72158781
	)
	@Export("color")
	public int color;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -342507295
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 1922248997
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -1131639995
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("ck")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	@Export("fillMode")
	public FillMode fillMode;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 1715502165
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -1491449197
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 1469316775
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("co")
	public boolean field3977;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 926907965
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -1674016031
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("cn")
	public String field3980;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 654389337
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("ce")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 179450797
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = 896728641
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("dr")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("db")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = -1763834903
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 1051524411
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = -1677709779
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 827665447
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = -707435155
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 2010086741
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = 64517477
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = 882985151
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -872876923
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -1825869539
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = -313599257
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -1634725447
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -778376331
	)
	public int field3999;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = 1048786051
	)
	public int field4021;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	public PlayerComposition field3932;
	@ObfuscatedName("dx")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("dk")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = -1517116737
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = -536891177
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("di")
	@Export("text")
	public String text;
	@ObfuscatedName("df")
	@Export("text2")
	public String text2;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -48133459
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = 1297737947
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		intValue = 157664055
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("ed")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("eh")
	int[] field4012;
	@ObfuscatedName("eg")
	int[] field3991;
	@ObfuscatedName("ew")
	int[] field4014;
	@ObfuscatedName("em")
	String[] field3963;
	@ObfuscatedName("en")
	@ObfuscatedGetter(
		intValue = -2017489947
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("el")
	public boolean field4017;
	@ObfuscatedName("eq")
	public byte[][] field4018;
	@ObfuscatedName("ej")
	public byte[][] field3944;
	@ObfuscatedName("er")
	public int[] field4020;
	@ObfuscatedName("eb")
	public int[] field3952;
	@ObfuscatedName("eo")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("ep")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("es")
	public String[][] field4024;
	@ObfuscatedName("ee")
	public int field4089;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("ea")
	@ObfuscatedGetter(
		intValue = 552514893
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("ey")
	@ObfuscatedGetter(
		intValue = 387322557
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("ef")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("ez")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("ev")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("ek")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("eu")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("ei")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("ex")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("fh")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("fc")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("fv")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("fa")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("fj")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("fm")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("fu")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("fe")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("fk")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("fq")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("fs")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("fx")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("fy")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("fg")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("fw")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("fz")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("ft")
	public Object[] field4052;
	@ObfuscatedName("fl")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("fr")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("fp")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("fi")
	public Object[] field4056;
	@ObfuscatedName("fd")
	public Object[] field4057;
	@ObfuscatedName("ff")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("fb")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("fo")
	public Object[] field4060;
	@ObfuscatedName("fn")
	public Object[] field4010;
	@ObfuscatedName("gj")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("gt")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("gh")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("gw")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("gm")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("gi")
	public Object[] field4015;
	@ObfuscatedName("ge")
	public Object[] field4068;
	@ObfuscatedName("gy")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("gf")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("go")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("gl")
	@ObfuscatedGetter(
		intValue = -1972248983
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("gn")
	public String field4000;
	@ObfuscatedName("gb")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("gq")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("gc")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("ga")
	@ObfuscatedGetter(
		intValue = -924496809
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("gr")
	@ObfuscatedGetter(
		intValue = -1873643307
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("gx")
	@ObfuscatedGetter(
		intValue = 819506223
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("gp")
	@ObfuscatedGetter(
		intValue = -1551263539
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "[Lnh;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("gd")
	public boolean field4082;
	@ObfuscatedName("gs")
	public boolean field4083;
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = 1317585405
	)
	public int field4013;
	@ObfuscatedName("gg")
	@ObfuscatedGetter(
		intValue = -353055499
	)
	public int field4081;
	@ObfuscatedName("gu")
	@ObfuscatedGetter(
		intValue = 1028676397
	)
	public int field4086;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = 756378845
	)
	public int field4077;
	@ObfuscatedName("hs")
	@ObfuscatedGetter(
		intValue = 1591462005
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("hx")
	@ObfuscatedGetter(
		intValue = 1288947373
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("hl")
	public int[] field4090;
	@ObfuscatedName("ho")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("ha")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("hq")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;
	@ObfuscatedName("hy")
	HashMap field4094;
	@ObfuscatedName("hr")
	HashMap field4001;
	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	class359 field4096;
	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	class211 field4070;
	@ObfuscatedName("hu")
	@ObfuscatedGetter(
		intValue = 2073896887
	)
	int field4098;

	static {
		field3937 = false;
	}

	public Widget() {
		this.isIf3 = false;
		this.id = -1;
		this.childIndex = -871583011;
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
		this.field3957 = 1;
		this.field3958 = 1;
		this.parentId = -1;
		this.field3960 = -1;
		this.isHidden = false;
		this.field3962 = 65535;
		this.field3968 = 0;
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
		this.field3977 = false;
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
		this.field3999 = 0;
		this.field4021 = 0;
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
		this.field4017 = false;
		this.dataText = "";
		this.field4089 = -1046377516;
		this.parent = null;
		this.dragZoneSize = 0;
		this.dragThreshold = 0;
		this.isScrollBar = false;
		this.spellActionName = "";
		this.hasListener = false;
		this.mouseOverRedirect = -1;
		this.field4000 = "";
		this.buttonText = "Ok";
		this.itemId = -1;
		this.itemQuantity = 0;
		this.modelFrame = 0;
		this.modelFrameCycle = 0;
		this.field4082 = false;
		this.field4083 = false;
		this.field4013 = -1;
		this.field4081 = 0;
		this.field4086 = 0;
		this.field4077 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
		this.field4098 = -1;
	}

	@ObfuscatedSignature(
		descriptor = "(Lnh;)V"
	)
	public Widget(Widget var1) {
		this.isIf3 = false;
		this.id = -1;
		this.childIndex = -871583011;
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
		this.field3957 = 1;
		this.field3958 = 1;
		this.parentId = -1;
		this.field3960 = -1;
		this.isHidden = false;
		this.field3962 = 65535;
		this.field3968 = 0;
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
		this.field3977 = false;
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
		this.field3999 = 0;
		this.field4021 = 0;
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
		this.field4017 = false;
		this.dataText = "";
		this.field4089 = -1046377516;
		this.parent = null;
		this.dragZoneSize = 0;
		this.dragThreshold = 0;
		this.isScrollBar = false;
		this.spellActionName = "";
		this.hasListener = false;
		this.mouseOverRedirect = -1;
		this.field4000 = "";
		this.buttonText = "Ok";
		this.itemId = -1;
		this.itemQuantity = 0;
		this.modelFrame = 0;
		this.modelFrameCycle = 0;
		this.field4082 = false;
		this.field4083 = false;
		this.field4013 = -1;
		this.field4081 = 0;
		this.field4086 = 0;
		this.field4077 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
		this.field4098 = -1;
		this.isIf3 = var1.isIf3;
		this.id = var1.id;
		this.childIndex = var1.childIndex;
		this.field3941 = var1.field3941;
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
		this.field3957 = var1.field3957;
		this.field3958 = var1.field3958;
		this.parentId = var1.parentId;
		this.field3960 = var1.field3960;
		this.field3962 = var1.field3962;
		this.field3968 = var1.field3968;
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
		this.field3977 = var1.field3977;
		this.spriteId2 = var1.spriteId2;
		this.spriteId = var1.spriteId;
		this.field3980 = var1.field3980;
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
		this.field3999 = var1.field3999;
		this.field4021 = var1.field4021;
		if (var1.field3932 != null) {
			this.field3932 = new PlayerComposition(var1.field3932);
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
		this.field4012 = this.method7341(var1.field4012);
		this.field3991 = this.method7341(var1.field3991);
		this.field4014 = this.method7341(var1.field4014);
		this.field3963 = (String[])((String[])this.method7340(var1.field3963));
		if (var1.field4070 != null) {
			this.field4070 = new class211(var1.field4070);
		}

		this.field4098 = var1.field4098;
		this.field4094 = var1.field4094;
		if (var1.field4001 != null) {
			this.field4001 = new HashMap();
			this.field4001.putAll(var1.field4001);
		}

		this.field4096 = null;
		this.flags = var1.flags;
		this.field4017 = var1.field4017;
		int var2;
		if (var1.field4018 != null) {
			this.field4018 = new byte[var1.field4018.length][];

			for (var2 = 0; var2 < var1.field4018.length; ++var2) {
				this.field4018[var2] = new byte[var1.field4018[var2].length];
				System.arraycopy(var1.field4018[var2], 0, this.field4018[var2], 0, var1.field4018[var2].length);
			}
		}

		if (var1.field3944 != null) {
			this.field3944 = new byte[var1.field3944.length][];

			for (var2 = 0; var2 < var1.field3944.length; ++var2) {
				this.field3944[var2] = new byte[var1.field3944[var2].length];
				System.arraycopy(var1.field3944[var2], 0, this.field3944[var2], 0, var1.field3944[var2].length);
			}
		}

		this.field4020 = this.method7341(var1.field4020);
		this.field3952 = this.method7341(var1.field3952);
		this.dataText = var1.dataText;
		this.actions = (String[])((String[])this.method7340(var1.actions));
		if (var1.field4024 != null) {
			this.field4024 = new String[var1.field4024.length][];

			for (var2 = 0; var2 < var1.field4024.length; ++var2) {
				this.field4024[var2] = new String[var1.field4024[var2].length];
				System.arraycopy(var1.field4024[var2], 0, this.field4024[var2], 0, var1.field4024[var2].length);
			}
		}

		this.field4089 = var1.field4089;
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
		this.field4052 = var1.field4052;
		this.onScroll = var1.onScroll;
		this.onChatTransmit = var1.onChatTransmit;
		this.onKey = var1.onKey;
		this.field4056 = var1.field4056;
		this.field4057 = var1.field4057;
		this.onFriendTransmit = var1.onFriendTransmit;
		this.onClanTransmit = var1.onClanTransmit;
		this.field4060 = var1.field4060;
		this.field4010 = var1.field4010;
		this.onMiscTransmit = var1.onMiscTransmit;
		this.onDialogAbort = var1.onDialogAbort;
		this.onSubChange = var1.onSubChange;
		this.onResize = var1.onResize;
		this.onStockTransmit = var1.onStockTransmit;
		this.field4015 = var1.field4015;
		this.field4068 = var1.field4068;
		this.cs1Instructions = var1.cs1Instructions;
		this.cs1Comparisons = this.method7341(var1.cs1Comparisons);
		this.cs1ComparisonValues = this.method7341(var1.cs1ComparisonValues);
		this.mouseOverRedirect = var1.mouseOverRedirect;
		this.field4000 = var1.field4000;
		this.buttonText = var1.buttonText;
		this.itemIds = this.method7341(var1.itemIds);
		this.itemQuantities = this.method7341(var1.itemQuantities);
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

		this.field4082 = var1.field4082;
		this.field4083 = var1.field4083;
		this.field4013 = var1.field4013;
		this.field4081 = var1.field4081;
		this.field4086 = var1.field4086;
		this.field4077 = var1.field4077;
		this.rootIndex = var1.rootIndex;
		this.cycle = var1.cycle;
		this.field4090 = this.method7341(var1.field4090);
		this.noClickThrough = var1.noClickThrough;
		this.noScrollThrough = var1.noScrollThrough;
		this.prioritizeMenuEntry = var1.prioritizeMenuEntry;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)[Ljava/lang/Object;",
		garbageValue = "-1793509429"
	)
	Object[] method7340(Object[] var1) {
		return var1 != null ? Arrays.copyOf(var1, var1.length) : null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([II)[I",
		garbageValue = "-1104020101"
	)
	int[] method7341(int[] var1) {
		return var1 != null ? Arrays.copyOf(var1, var1.length) : null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lve;B)V",
		garbageValue = "70"
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
			this.field4000 = var1.readStringCp1252NullTerminated();
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lve;B)V",
		garbageValue = "117"
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
				this.field3999 = var1.readUnsignedShort();
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
			this.field3977 = var1.readUnsignedByte() == 1;
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lve;S)V",
		garbageValue = "-6053"
	)
	void method7344(Buffer var1) {
		this.field3941 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lve;I)[Ljava/lang/Object;",
		garbageValue = "-1349875935"
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lve;I)[I",
		garbageValue = "-2055721844"
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lnu;ZLep;B)Lwc;",
		garbageValue = "-62"
	)
	@Export("getSprite")
	public SpritePixels getSprite(WidgetDefinition var1, boolean var2, UrlRequester var3) {
		field3937 = false;
		if (this.field3980 != null) {
			SpritePixels var4 = this.method7348(var1, var3);
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
			long var5 = ((long)this.spriteShadow << 40) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.outline << 36) + (long)var8 + ((this.spriteFlipH ? 1L : 0L) << 39);
			SpritePixels var7 = (SpritePixels)var1.Widget_cachedSprites.get(var5);
			if (var7 != null) {
				return var7;
			} else {
				var7 = GrandExchangeOfferNameComparator.SpriteBuffer_getSprite(var1.field3850, var8, 0);
				if (var7 == null) {
					field3937 = true;
					return null;
				} else {
					this.method7474(var7);
					var1.Widget_cachedSprites.put(var7, var5);
					return var7;
				}
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lnu;Lep;I)Lwc;",
		garbageValue = "196432813"
	)
	SpritePixels method7348(WidgetDefinition var1, UrlRequester var2) {
		if (!this.method7350()) {
			return this.method7383(var1, var2);
		} else {
			String var3 = this.field3980 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow;
			SpritePixels var4 = (SpritePixels)var1.field3855.method9082(var3);
			if (var4 == null) {
				SpritePixels var5 = this.method7383(var1, var2);
				if (var5 != null) {
					var4 = var5.method10776();
					this.method7474(var4);
					var1.field3855.method9083(var3, var4);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lnu;Lep;I)Lwc;",
		garbageValue = "1055698799"
	)
	SpritePixels method7383(WidgetDefinition var1, UrlRequester var2) {
		if (this.field3980 != null && var2 != null) {
			class358 var3 = (class358)var1.field3852.method9082(this.field3980);
			if (var3 == null) {
				var3 = new class358(this.field3980, var2);
				var1.field3852.method9083(this.field3980, var3);
			}

			return var3.method6982();
		} else {
			return null;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1091710059"
	)
	boolean method7350() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lwc;B)V",
		garbageValue = "48"
	)
	void method7474(SpritePixels var1) {
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnu;B)Lrk;",
		garbageValue = "1"
	)
	@Export("getFont")
	public Font getFont(WidgetDefinition var1) {
		field3937 = false;
		if (this.fontId == -1) {
			return null;
		} else {
			Font var2 = (Font)var1.Widget_cachedFonts.get((long)this.fontId);
			if (var2 != null) {
				return var2;
			} else {
				var2 = class255.method5320(var1.field3850, var1.field3847, this.fontId, 0);
				if (var2 != null) {
					var1.Widget_cachedFonts.put(var2, (long)this.fontId);
				} else {
					field3937 = true;
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lnu;Lkm;IZLnz;Ljn;Lja;B)Lhe;",
		garbageValue = "41"
	)
	@Export("getModel")
	public Model getModel(WidgetDefinition var1, SequenceDefinition var2, int var3, boolean var4, PlayerComposition var5, NPCComposition var6, NpcOverrides var7) {
		field3937 = false;
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
				var10 |= var7.field2690 << 20;
			}

			Model var12 = (Model)var1.Widget_cachedModels.get(var10);
			if (var12 == null) {
				ModelData var13 = null;
				int var14 = 64;
				int var15 = 768;
				switch(var8) {
				case 1:
					var13 = ModelData.ModelData_get(var1.field3845, var9, 0);
					break;
				case 2:
					var13 = var6.method5195((NpcOverrides)null);
					break;
				case 3:
					var13 = var5 != null ? var5.getModelData() : null;
					break;
				case 4:
					ItemComposition var16 = class231.ItemDefinition_get(var9);
					var13 = var16.getModelData(10);
					var14 += var16.ambient;
					var15 += var16.contrast * 5;
				case 5:
				default:
					break;
				case 6:
					var13 = var6.method5195(var7);
				}

				if (var13 == null) {
					field3937 = true;
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lnu;ZB)Lne;",
		garbageValue = "-99"
	)
	public SpriteMask method7359(WidgetDefinition var1, boolean var2) {
		if (this.spriteId == -1) {
			var2 = false;
		}

		int var3 = var2 ? this.spriteId : this.spriteId2;
		if (var3 == -1) {
			return null;
		} else {
			long var4 = ((long)this.spriteShadow << 40) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((this.spriteFlipV ? 1L : 0L) << 38) + (long)var3 + ((long)this.outline << 36);
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1947849005"
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;I)V",
		garbageValue = "1915180059"
	)
	public void method7440(int var1, int var2, String var3) {
		if (this.field4024 == null || this.field4024.length <= var1) {
			String[][] var4 = new String[var1 + 1][];
			if (this.field4024 != null) {
				System.arraycopy(this.field4024, 0, var4, 0, this.field4024.length);
			}

			this.field4024 = var4;
		}

		if (this.field4024[var1] == null || this.field4024[var1].length <= var2) {
			String[] var5 = new String[var2 + 1];
			if (this.field4024[var1] != null) {
				System.arraycopy(this.field4024[var1], 0, var5, 0, this.field4024[var1].length);
			}

			this.field4024[var1] = var5;
		}

		this.field4024[var1][var2] = var3;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "6"
	)
	public boolean method7357() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "29699747"
	)
	public boolean method7358() {
		return this.type == 11 || this.type == 12;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Lep;J)V"
	)
	public void method7432(String var1, String var2, UrlRequester var3, long var4) {
		if (this.type == 11 && var4 != -1L) {
			var1 = var1.replaceAll("%userid%", Long.toString(var4));
			this.field4070 = new class211();
			if (!this.field4070.method4720(var1, var2, var3)) {
				this.field4070 = null;
			} else {
				if (this.field4094 == null || this.field4001 == null) {
					this.method7362();
				}

			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lep;I)V",
		garbageValue = "-1018359755"
	)
	public void method7354(String var1, String var2, String var3, String var4, String var5, UrlRequester var6) {
		this.field4070 = new class211();
		if (!this.field4070.method4720(var1, var3, var6)) {
			this.field4070 = null;
		} else {
			if (this.field4094 == null || this.field4001 == null) {
				this.method7362();
			}

			this.field4070.method4765(var2, var4, var5);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lep;B)V",
		garbageValue = "71"
	)
	public void method7365(String var1, UrlRequester var2) {
		if (this.type == 11 && var1 != null) {
			this.field4070 = new class211();
			this.field4070.method4736(var1, var2);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1649387941"
	)
	void method7362() {
		this.field4094 = new HashMap();
		this.field4001 = new HashMap();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-382982512"
	)
	public void method7363(int var1, int var2) {
		if (this.type == 11) {
			if (this.field4094 == null) {
				this.method7362();
			}

			this.field4094.put(var1, var2);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)V",
		garbageValue = "0"
	)
	public void method7364(String var1, int var2) {
		if (this.type == 11) {
			if (this.field4001 == null) {
				this.method7362();
			}

			this.field4001.put(var1, var2);
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "-1616098809"
	)
	public boolean method7446(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field4070 != null && this.method7366()) {
			var1 -= var3;
			var2 -= var4;
			int var5 = (int)(this.field4070.method4769()[0] * (float)(this.width * 624892547));
			int var6 = (int)(this.field4070.method4769()[1] * (float)(this.height * 1265510039));
			int var7 = var5 + (int)(this.field4070.method4769()[2] * (float)(624892547 * this.width));
			int var8 = var6 + (int)(this.field4070.method4769()[3] * (float)(this.height * 1265510039));
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-62"
	)
	public boolean method7366() {
		return this.field4098 == 2;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "650449105"
	)
	public int method7435(String var1) {
		return this.type == 11 && this.field4070 != null && this.method7366() ? this.field4070.method4755(var1) : -1;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-626308683"
	)
	public String method7368(String var1) {
		return this.type == 11 && this.field4070 != null && this.method7366() ? this.field4070.method4777(var1) : null;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2004563060"
	)
	public int method7369() {
		return this.field4001 != null && !this.field4001.isEmpty() ? 1 : 0;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-53375976"
	)
	public int method7339() {
		if (this.type == 11 && this.field4070 != null && this.field4001 != null && !this.field4001.isEmpty()) {
			String var1 = this.field4070.method4730();
			return var1 != null && this.field4001.containsKey(this.field4070.method4730()) ? (Integer)this.field4001.get(var1) : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-462105345"
	)
	public String method7371() {
		if (this.type == 11 && this.field4070 != null) {
			String var1 = this.field4070.method4730();
			Iterator var2 = this.field4070.method4729().iterator();

			while (var2.hasNext()) {
				class225 var3 = (class225)var2.next();
				String var4 = String.format("%%%S%%", var3.method4969());
				if (var3.vmethod4957() == 0) {
					var1.replaceAll(var4, Integer.toString(var3.vmethod4959()));
				} else {
					var1.replaceAll(var4, var3.vmethod4958());
				}
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-2097574210"
	)
	public int[] method7372() {
		if (this.type == 11 && this.field4070 != null) {
			int[] var1 = new int[3];
			int var2 = 0;
			Iterator var3 = this.field4070.method4729().iterator();

			while (var3.hasNext()) {
				class225 var4 = (class225)var3.next();
				if (!var4.method4969().equals("user_id")) {
					if (var4.vmethod4957() != 0) {
						return null;
					}

					var1[var2++] = var4.vmethod4959();
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

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(B)Lij;",
		garbageValue = "-74"
	)
	public class211 method7373() {
		return this.field4070;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lnu;Lep;I)Z",
		garbageValue = "-1141983498"
	)
	public boolean method7374(WidgetDefinition var1, UrlRequester var2) {
		if (this.type == 11 && this.field4070 != null) {
			this.field4070.method4748(var2);
			if (this.field4070.method4723() != this.field4098) {
				this.field4098 = this.field4070.method4723();
				if (this.field4098 >= 3) {
					return true;
				}

				if (this.field4098 == 2) {
					this.method7375(var1);
					return true;
				}
			}

			return false;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-951017691"
	)
	void method7375(WidgetDefinition var1) {
		this.noClickThrough = true;
		ArrayList var2 = this.field4070.method4727();
		ArrayList var3 = this.field4070.method4761();
		int var4 = var2.size() + var3.size();
		this.children = new Widget[var4];
		int var5 = 0;

		Iterator var6;
		Widget var8;
		for (var6 = var2.iterator(); var6.hasNext(); this.children[var5++] = var8) {
			class212 var7 = (class212)var6.next();
			var8 = class222.method4934(5, this, var5, 0, 0, 0, 0, var7.field2419);
			var8.field3980 = var7.field2418.method3192();
			class358 var9 = new class358(var7.field2418);
			var1.field3852.method9083(var8.field3980, var9);
		}

		for (var6 = var3.iterator(); var6.hasNext(); this.children[var5++] = var8) {
			class223 var10 = (class223)var6.next();
			var8 = class222.method4934(4, this, var5, 0, 0, 0, 0, var10.field2519);
			var8.text = var10.field2510;
			var8.fontId = (Integer)this.field4094.get(var10.field2514);
			var8.textXAlignment = var10.field2512;
			var8.textYAlignment = var10.field2509;
		}

	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-277633601"
	)
	public void method7376() {
		this.field4096 = new class359();

		for (int var1 = 1; var1 <= 12; ++var1) {
			this.field4096.field3869.method395(var1, 0);
		}

		for (char var2 = 0; var2 < ' '; ++var2) {
			this.field4096.field3869.method396(var2, 0);
		}

		this.field4096.field3869.method396('\u0080', 0);
		this.field4096.field3869.method395(82, 2);
		this.field4096.field3869.method395(81, 2);
		this.field4096.field3869.method395(86, 2);
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)Lny;",
		garbageValue = "-880622289"
	)
	public class361 method7377() {
		return this.field4096 != null ? this.field4096.field3868 : null;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(B)Lng;",
		garbageValue = "-77"
	)
	public class355 method7378() {
		return this.field4096 != null ? this.field4096.field3872 : null;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)Lbp;",
		garbageValue = "-119807554"
	)
	public class27 method7482() {
		return this.field4096 != null ? this.field4096.field3869 : null;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)Lnq;",
		garbageValue = "-901159640"
	)
	public class359 method7380() {
		return this.field4096;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lny;I)Z",
		garbageValue = "370723154"
	)
	boolean method7397(class361 var1) {
		boolean var2 = false;
		if (this.text != null && !this.text.isEmpty()) {
			var2 |= var1.method7250(class342.method6831(this.text));
			this.text = "";
		}

		if (this.text2 != null && !this.text2.isEmpty()) {
			var2 |= var1.method7068(class342.method6831(this.text2));
			this.text2 = "";
		}

		return var2;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)Z",
		garbageValue = "-1449650393"
	)
	public boolean method7382(WidgetDefinition var1) {
		class361 var2 = this.method7377();
		if (var2 == null) {
			return false;
		} else {
			boolean var3 = false;
			if (!var2.method7118() && this.fontId != -1) {
				int var4 = var2.method7119();
				int var5 = var2.method7120();
				int var6 = var2.method7129();
				int var7 = var2.method7116();
				Font var8 = this.getFont(var1);
				if (var8 != null) {
					var3 |= var2.method7069(var8);
					var3 |= this.method7397(var2);
					var3 |= var2.method7124(var4, var5);
					var3 |= var2.method7251(var6, var7);
				}
			} else if (var2.method7118()) {
				var3 |= this.method7397(var2);
			}

			var2.method7064();
			return var3;
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Lnz;ZI)V",
		garbageValue = "-1512787546"
	)
	public void method7385(PlayerComposition var1, boolean var2) {
		this.modelType = 7;
		this.field3932 = new PlayerComposition(var1);
		if (!var2) {
			this.field3932.equipment = Arrays.copyOf(this.field3932.field3875, this.field3932.field3875.length);
			this.field3932.method7040();
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1896149036"
	)
	static void method7392() {
		DirectByteArrayCopier.Tiles_underlays = null;
		WorldEntityCoord.Tiles_overlays = null;
		class195.Tiles_shapes = null;
		class302.field3316 = null;
		Varps.field3836 = null;
		DevicePcmPlayerProvider.Tiles_underlays2 = null;
		class543.field5472 = null;
		HttpJsonRequestBody.Tiles_hue = null;
		class235.Tiles_saturation = null;
		ScriptEvent.Tiles_lightness = null;
		class28.Tiles_hueMultiplier = null;
		class272.field3094 = null;
	}
}
