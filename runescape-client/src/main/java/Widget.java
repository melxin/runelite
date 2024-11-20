import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("np")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("ag")
	public static boolean field4018;
	@ObfuscatedName("qy")
	@ObfuscatedSignature(
		descriptor = "Luz;"
	)
	static class539 field3962;
	@ObfuscatedName("bw")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1142910703
	)
	@Export("id")
	public int id;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 2106540799
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("bt")
	String field3862;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1320424443
	)
	@Export("type")
	public int type;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 267370013
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1887080719
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1341734957
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 99177361
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1494219683
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1526946059
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -590048205
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -389310495
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1684881519
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 488709477
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1718256525
	)
	@Export("x")
	public int x;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 390829513
	)
	@Export("y")
	public int y;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1063514007
	)
	@Export("width")
	public int width;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1899982693
	)
	@Export("height")
	public int height;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1003923843
	)
	public int field3878;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1278177795
	)
	public int field3879;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -551280523
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("be")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -1600705041
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1673450227
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -929188677
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -1009643487
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -172407863
	)
	@Export("color")
	public int color;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 1638830189
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -1824556509
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 193356289
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("cn")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	@Export("fillMode")
	public FillMode fillMode;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 1550474463
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -385300557
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 671835527
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("cl")
	public boolean field3895;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -894101113
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -2018106161
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("cb")
	public String field3898;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -1100838243
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("cw")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -197977741
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 501510453
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("cm")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("ch")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 1338203565
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -551553839
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -848318177
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1305735823
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 268980489
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -268766065
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 402271377
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = -1994972305
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -164750363
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -1423403727
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 2122152171
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = 1291784909
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = -371282817
	)
	public int field3917;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = 228715915
	)
	public int field3918;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	public PlayerComposition field3932;
	@ObfuscatedName("dc")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("dl")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 1822032665
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = -476546999
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("dp")
	@Export("text")
	public String text;
	@ObfuscatedName("dn")
	@Export("text2")
	public String text2;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -2078943531
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = 1000755909
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = 801413299
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("dx")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("du")
	int[] field3930;
	@ObfuscatedName("da")
	int[] field4003;
	@ObfuscatedName("di")
	int[] field3919;
	@ObfuscatedName("ds")
	String[] field3933;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	class216 field3967;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = 1445816435
	)
	int field3935;
	@ObfuscatedName("dm")
	HashMap field3936;
	@ObfuscatedName("eu")
	HashMap field3880;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	class357 field3970;
	@ObfuscatedName("en")
	@ObfuscatedGetter(
		intValue = 934103427
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("ej")
	public boolean field3940;
	@ObfuscatedName("ez")
	public byte[][] field3941;
	@ObfuscatedName("eh")
	public byte[][] field3942;
	@ObfuscatedName("eb")
	public int[] field3943;
	@ObfuscatedName("ed")
	public int[] field3944;
	@ObfuscatedName("el")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("eq")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("em")
	public String[][] field3948;
	@ObfuscatedName("ee")
	public int field3949;
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("er")
	@ObfuscatedGetter(
		intValue = -528064343
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("es")
	@ObfuscatedGetter(
		intValue = 2066643989
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("ef")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("et")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("ea")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("ek")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("ew")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("fg")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("fh")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("fq")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("fa")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("fe")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("fx")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("fj")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("fm")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("fo")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("fv")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("fr")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("fi")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("ff")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("ft")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("fb")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("fz")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("fw")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("fn")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("fy")
	public Object[] field3976;
	@ObfuscatedName("fu")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("fc")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("fs")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("fp")
	public Object[] field3980;
	@ObfuscatedName("fd")
	public Object[] field3981;
	@ObfuscatedName("fk")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("fl")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("gn")
	public Object[] field3984;
	@ObfuscatedName("ge")
	public Object[] field3965;
	@ObfuscatedName("gw")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("gp")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("gb")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("gv")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("gh")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("gy")
	public Object[] field3991;
	@ObfuscatedName("gt")
	public Object[] field3992;
	@ObfuscatedName("go")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("gj")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("gl")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("gx")
	@ObfuscatedGetter(
		intValue = 1894114869
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("gd")
	public String field3997;
	@ObfuscatedName("gc")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("gs")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("gu")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("gg")
	@ObfuscatedGetter(
		intValue = 671506267
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("gm")
	@ObfuscatedGetter(
		intValue = 845678283
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = -2040980291
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("gz")
	@ObfuscatedGetter(
		intValue = -1863562963
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "[Lnp;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("ga")
	public boolean field4006;
	@ObfuscatedName("gi")
	public boolean field4007;
	@ObfuscatedName("gf")
	@ObfuscatedGetter(
		intValue = 1926686549
	)
	public int field4008;
	@ObfuscatedName("gr")
	@ObfuscatedGetter(
		intValue = -1617539691
	)
	public int field4009;
	@ObfuscatedName("hy")
	@ObfuscatedGetter(
		intValue = 1905729203
	)
	public int field3988;
	@ObfuscatedName("hi")
	@ObfuscatedGetter(
		intValue = 63772883
	)
	public int field4011;
	@ObfuscatedName("hd")
	@ObfuscatedGetter(
		intValue = 36693863
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("hv")
	@ObfuscatedGetter(
		intValue = 736002033
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("hj")
	public int[] field4014;
	@ObfuscatedName("hh")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("hp")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("hm")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		field4018 = false;
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
		this.field3878 = 1;
		this.field3879 = 1;
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
		this.field3895 = false;
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
		this.field3917 = 0;
		this.field3918 = 0;
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
		this.field3935 = -1;
		this.flags = 0;
		this.field3940 = false;
		this.dataText = "";
		this.field3949 = -128772476;
		this.parent = null;
		this.dragZoneSize = 0;
		this.dragThreshold = 0;
		this.isScrollBar = false;
		this.spellActionName = "";
		this.hasListener = false;
		this.mouseOverRedirect = -1;
		this.field3997 = "";
		this.buttonText = "Ok";
		this.itemId = -1;
		this.itemQuantity = 0;
		this.modelFrame = 0;
		this.modelFrameCycle = 0;
		this.field4006 = false;
		this.field4007 = false;
		this.field4008 = -1;
		this.field4009 = 0;
		this.field3988 = 0;
		this.field4011 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
	}

	@ObfuscatedSignature(
		descriptor = "(Lnp;I)V"
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
		this.field3878 = 1;
		this.field3879 = 1;
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
		this.field3895 = false;
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
		this.field3917 = 0;
		this.field3918 = 0;
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
		this.field3935 = -1;
		this.flags = 0;
		this.field3940 = false;
		this.dataText = "";
		this.field3949 = -128772476;
		this.parent = null;
		this.dragZoneSize = 0;
		this.dragThreshold = 0;
		this.isScrollBar = false;
		this.spellActionName = "";
		this.hasListener = false;
		this.mouseOverRedirect = -1;
		this.field3997 = "";
		this.buttonText = "Ok";
		this.itemId = -1;
		this.itemQuantity = 0;
		this.modelFrame = 0;
		this.modelFrameCycle = 0;
		this.field4006 = false;
		this.field4007 = false;
		this.field4008 = -1;
		this.field4009 = 0;
		this.field3988 = 0;
		this.field4011 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
		this.isIf3 = var1.isIf3;
		this.id = var1.id;
		this.childIndex = var2;
		this.field3862 = var1.field3862;
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
		this.field3878 = var1.field3878;
		this.field3879 = var1.field3879;
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
		this.field3895 = var1.field3895;
		this.spriteId2 = var1.spriteId2;
		this.spriteId = var1.spriteId;
		this.field3898 = var1.field3898;
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
		this.field3917 = var1.field3917;
		this.field3918 = var1.field3918;
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
		this.field3930 = this.method7375(var1.field3930);
		this.field4003 = this.method7375(var1.field4003);
		this.field3919 = this.method7375(var1.field3919);
		this.field3933 = (String[])((String[])this.method7242(var1.field3933));
		if (var1.field3967 != null) {
			this.field3967 = new class216(var1.field3967);
		}

		this.field3935 = var1.field3935;
		this.field3936 = var1.field3936;
		if (var1.field3880 != null) {
			this.field3880 = new HashMap();
			this.field3880.putAll(var1.field3880);
		}

		this.field3970 = null;
		this.flags = var1.flags;
		this.field3940 = var1.field3940;
		int var3;
		if (var1.field3941 != null) {
			this.field3941 = new byte[var1.field3941.length][];

			for (var3 = 0; var3 < var1.field3941.length; ++var3) {
				this.field3941[var3] = new byte[var1.field3941[var3].length];
				System.arraycopy(var1.field3941[var3], 0, this.field3941[var3], 0, var1.field3941[var3].length);
			}
		}

		if (var1.field3942 != null) {
			this.field3942 = new byte[var1.field3942.length][];

			for (var3 = 0; var3 < var1.field3942.length; ++var3) {
				this.field3942[var3] = new byte[var1.field3942[var3].length];
				System.arraycopy(var1.field3942[var3], 0, this.field3942[var3], 0, var1.field3942[var3].length);
			}
		}

		this.field3943 = this.method7375(var1.field3943);
		this.field3944 = this.method7375(var1.field3944);
		this.dataText = var1.dataText;
		this.actions = (String[])((String[])this.method7242(var1.actions));
		if (var1.field3948 != null) {
			this.field3948 = new String[var1.field3948.length][];

			for (var3 = 0; var3 < var1.field3948.length; ++var3) {
				this.field3948[var3] = new String[var1.field3948[var3].length];
				System.arraycopy(var1.field3948[var3], 0, this.field3948[var3], 0, var1.field3948[var3].length);
			}
		}

		this.field3949 = var1.field3949;
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
		this.field3976 = var1.field3976;
		this.onScroll = var1.onScroll;
		this.onChatTransmit = var1.onChatTransmit;
		this.onKey = var1.onKey;
		this.field3980 = var1.field3980;
		this.field3981 = var1.field3981;
		this.onFriendTransmit = var1.onFriendTransmit;
		this.onClanTransmit = var1.onClanTransmit;
		this.field3984 = var1.field3984;
		this.field3965 = var1.field3965;
		this.onMiscTransmit = var1.onMiscTransmit;
		this.onDialogAbort = var1.onDialogAbort;
		this.onSubChange = var1.onSubChange;
		this.onResize = var1.onResize;
		this.onStockTransmit = var1.onStockTransmit;
		this.field3991 = var1.field3991;
		this.field3992 = var1.field3992;
		this.cs1Instructions = var1.cs1Instructions;
		this.cs1Comparisons = this.method7375(var1.cs1Comparisons);
		this.cs1ComparisonValues = this.method7375(var1.cs1ComparisonValues);
		this.mouseOverRedirect = var1.mouseOverRedirect;
		this.field3997 = var1.field3997;
		this.buttonText = var1.buttonText;
		this.itemIds = this.method7375(var1.itemIds);
		this.itemQuantities = this.method7375(var1.itemQuantities);
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

		this.field4006 = var1.field4006;
		this.field4007 = var1.field4007;
		this.field4008 = var1.field4008;
		this.field4009 = var1.field4009;
		this.field3988 = var1.field3988;
		this.field4011 = var1.field4011;
		this.rootIndex = var1.rootIndex;
		this.cycle = var1.cycle;
		this.field4014 = this.method7375(var1.field4014);
		this.noClickThrough = var1.noClickThrough;
		this.noScrollThrough = var1.noScrollThrough;
		this.prioritizeMenuEntry = var1.prioritizeMenuEntry;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)[Ljava/lang/Object;",
		garbageValue = "-1338059737"
	)
	Object[] method7242(Object[] var1) {
		return var1 != null ? Arrays.copyOf(var1, var1.length) : null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([II)[I",
		garbageValue = "1084582785"
	)
	int[] method7375(int[] var1) {
		return var1 != null ? Arrays.copyOf(var1, var1.length) : null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lvj;B)V",
		garbageValue = "82"
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
			this.field3997 = var1.readStringCp1252NullTerminated();
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvj;B)V",
		garbageValue = "126"
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
				this.field3917 = var1.readUnsignedShort();
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
			this.field3895 = var1.readUnsignedByte() == 1;
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvj;I)V",
		garbageValue = "959274418"
	)
	void method7246(Buffer var1) {
		this.field3862 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvj;I)[Ljava/lang/Object;",
		garbageValue = "-349054759"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lvj;B)[I",
		garbageValue = "-81"
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lng;ZLel;B)Lvr;",
		garbageValue = "-43"
	)
	@Export("getSprite")
	public SpritePixels getSprite(WidgetDefinition var1, boolean var2, UrlRequester var3) {
		field4018 = false;
		if (this.field3898 != null) {
			SpritePixels var4 = this.method7367(var1, var3);
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
			long var5 = ((this.spriteFlipV ? 1L : 0L) << 38) + (long)var8 + ((long)this.outline << 36) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.spriteShadow << 40);
			SpritePixels var7 = (SpritePixels)var1.Widget_cachedSprites.get(var5);
			if (var7 != null) {
				return var7;
			} else {
				var7 = class53.SpriteBuffer_getSprite(var1.field3784, var8, 0);
				if (var7 == null) {
					field4018 = true;
					return null;
				} else {
					this.method7253(var7);
					var1.Widget_cachedSprites.put(var7, var5);
					return var7;
				}
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lng;Lel;I)Lvr;",
		garbageValue = "-608711880"
	)
	SpritePixels method7367(WidgetDefinition var1, UrlRequester var2) {
		if (!this.method7264()) {
			return this.method7354(var1, var2);
		} else {
			String var3 = this.field3898 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow;
			SpritePixels var4 = (SpritePixels)var1.field3777.method8877(var3);
			if (var4 == null) {
				SpritePixels var5 = this.method7354(var1, var2);
				if (var5 != null) {
					var4 = var5.method10568();
					this.method7253(var4);
					var1.field3777.method8882(var3, var4);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lng;Lel;S)Lvr;",
		garbageValue = "255"
	)
	SpritePixels method7354(WidgetDefinition var1, UrlRequester var2) {
		if (this.field3898 != null && var2 != null) {
			class356 var3 = (class356)var1.field3783.method8877(this.field3898);
			if (var3 == null) {
				var3 = new class356(this.field3898, var2);
				var1.field3783.method8882(this.field3898, var3);
			}

			return var3.method6892();
		} else {
			return null;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1078154697"
	)
	boolean method7264() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lvr;I)V",
		garbageValue = "-397756922"
	)
	void method7253(SpritePixels var1) {
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lng;B)Lqu;",
		garbageValue = "1"
	)
	@Export("getFont")
	public Font getFont(WidgetDefinition var1) {
		field4018 = false;
		if (this.fontId == -1) {
			return null;
		} else {
			Font var2 = (Font)var1.Widget_cachedFonts.get((long)this.fontId);
			if (var2 != null) {
				return var2;
			} else {
				var2 = class166.method3637(var1.field3784, var1.field3776, this.fontId, 0);
				if (var2 != null) {
					var1.Widget_cachedFonts.put(var2, (long)this.fontId);
				} else {
					field4018 = true;
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lng;Liy;IZLnv;Lhw;Lhn;I)Ljt;",
		garbageValue = "2120498082"
	)
	@Export("getModel")
	public Model getModel(WidgetDefinition var1, SequenceDefinition var2, int var3, boolean var4, PlayerComposition var5, NPCComposition var6, NpcOverrides var7) {
		field4018 = false;
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
			if (var7 != null) {
				var10 |= var7.field1984 << 20;
			}

			Model var12 = (Model)var1.Widget_cachedModels.get(var10);
			if (var12 == null) {
				ModelData var13 = null;
				int var14 = 64;
				int var15 = 768;
				switch(var8) {
				case 1:
					var13 = ModelData.ModelData_get(var1.field3775, var9, 0);
					break;
				case 2:
					if (var6 == null) {
						return null;
					}

					var13 = var6.method3904((NpcOverrides)null);
					break;
				case 3:
					var13 = var5 != null ? var5.getModelData() : null;
					break;
				case 4:
					ItemComposition var16 = WorldEntityCoord.ItemDefinition_get(var9);
					var13 = var16.getModelData(10);
					var14 += var16.ambient;
					var15 += var16.contrast;
				case 5:
				default:
					break;
				case 6:
					if (var6 == null) {
						return null;
					}

					var13 = var6.method3904(var7);
				}

				if (var13 == null) {
					field4018 = true;
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lng;ZI)Lna;",
		garbageValue = "1257245462"
	)
	public SpriteMask method7256(WidgetDefinition var1, boolean var2) {
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "836739251"
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
		garbageValue = "2116457195"
	)
	public void method7258(int var1, int var2, String var3) {
		if (this.field3948 == null || this.field3948.length <= var1) {
			String[][] var4 = new String[var1 + 1][];
			if (this.field3948 != null) {
				System.arraycopy(this.field3948, 0, var4, 0, this.field3948.length);
			}

			this.field3948 = var4;
		}

		if (this.field3948[var1] == null || this.field3948[var1].length <= var2) {
			String[] var5 = new String[var2 + 1];
			if (this.field3948[var1] != null) {
				System.arraycopy(this.field3948[var1], 0, var5, 0, this.field3948[var1].length);
			}

			this.field3948[var1] = var5;
		}

		this.field3948[var1][var2] = var3;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1723737325"
	)
	public boolean method7261() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1394720591"
	)
	public boolean method7260() {
		return this.type == 11 || this.type == 12;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Lel;J)V"
	)
	public void method7265(String var1, String var2, UrlRequester var3, long var4) {
		if (this.type == 11 && -1L != var4) {
			var1 = var1.replaceAll("%userid%", Long.toString(var4));
			this.field3967 = new class216();
			if (!this.field3967.method4342(var1, var2, var3)) {
				this.field3967 = null;
			} else {
				if (this.field3936 == null || this.field3880 == null) {
					this.method7352();
				}

			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lel;B)V",
		garbageValue = "112"
	)
	public void method7262(String var1, String var2, String var3, String var4, String var5, UrlRequester var6) {
		this.field3967 = new class216();
		if (!this.field3967.method4342(var1, var3, var6)) {
			this.field3967 = null;
		} else {
			if (this.field3936 == null || this.field3880 == null) {
				this.method7352();
			}

			this.field3967.method4330(var2, var4, var5);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lel;I)V",
		garbageValue = "1687920017"
	)
	public void method7263(String var1, UrlRequester var2) {
		if (this.type == 11 && var1 != null) {
			this.field3967 = new class216();
			this.field3967.method4344(var1, var2);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1156558830"
	)
	void method7352() {
		this.field3936 = new HashMap();
		this.field3880 = new HashMap();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "5"
	)
	public void method7336(int var1, int var2) {
		if (this.type == 11) {
			if (this.field3936 == null) {
				this.method7352();
			}

			this.field3936.put(var1, var2);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-1622851117"
	)
	public void method7266(String var1, int var2) {
		if (this.type == 11) {
			if (this.field3880 == null) {
				this.method7352();
			}

			this.field3880.put(var1, var2);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)Z",
		garbageValue = "25"
	)
	public boolean method7267(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field3967 != null && this.method7331()) {
			var1 -= var3;
			var2 -= var4;
			int var5 = (int)(this.field3967.method4364()[0] * (float)(this.width));
			int var6 = (int)(this.field3967.method4364()[1] * (float)(this.height));
			int var7 = var5 + (int)(this.field3967.method4364()[2] * (float)(this.width));
			int var8 = var6 + (int)(this.field3967.method4364()[3] * (float)(this.height));
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "548998078"
	)
	public boolean method7331() {
		return this.field3935 == 2;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "21"
	)
	public int method7333(String var1) {
		return this.type == 11 && this.field3967 != null && this.method7331() ? this.field3967.method4337(var1) : -1;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1314928661"
	)
	public String method7270(String var1) {
		return this.type == 11 && this.field3967 != null && this.method7331() ? this.field3967.method4338(var1) : null;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "292773594"
	)
	public int method7271() {
		return this.field3880 != null && this.field3880.size() > 0 ? 1 : 0;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-4755"
	)
	public int method7282() {
		if (this.type == 11 && this.field3967 != null && this.field3880 != null && !this.field3880.isEmpty()) {
			String var1 = this.field3967.method4382();
			return var1 != null && this.field3880.containsKey(this.field3967.method4382()) ? (Integer)this.field3880.get(var1) : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1159569939"
	)
	public String method7273() {
		if (this.type == 11 && this.field3967 != null) {
			String var1 = this.field3967.method4382();
			Iterator var2 = this.field3967.method4381().iterator();

			while (var2.hasNext()) {
				class230 var3 = (class230)var2.next();
				String var4 = String.format("%%%S%%", var3.method4558());
				if (var3.vmethod4561() == 0) {
					var1.replaceAll(var4, Integer.toString(var3.vmethod4550()));
				} else {
					var1.replaceAll(var4, var3.vmethod4549());
				}
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-54"
	)
	public int[] method7274() {
		if (this.type == 11 && this.field3967 != null) {
			int[] var1 = new int[3];
			int var2 = 0;
			Iterator var3 = this.field3967.method4381().iterator();

			while (var3.hasNext()) {
				class230 var4 = (class230)var3.next();
				if (!var4.method4558().equals("user_id")) {
					if (var4.vmethod4561() != 0) {
						return null;
					}

					var1[var2++] = var4.vmethod4550();
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

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)Lix;",
		garbageValue = "1111608433"
	)
	public class216 method7276() {
		return this.field3967;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Lng;Lel;I)Z",
		garbageValue = "-883106700"
	)
	public boolean method7348(WidgetDefinition var1, UrlRequester var2) {
		if (this.type == 11 && this.field3967 != null) {
			this.field3967.method4356(var2);
			if (this.field3967.method4335() != this.field3935) {
				this.field3935 = this.field3967.method4335();
				if (this.field3935 >= 3) {
					return true;
				}

				if (this.field3935 == 2) {
					this.method7277(var1);
					return true;
				}
			}

			return false;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lng;I)V",
		garbageValue = "2042742486"
	)
	void method7277(WidgetDefinition var1) {
		this.noClickThrough = true;
		ArrayList var2 = this.field3967.method4339();
		ArrayList var3 = this.field3967.method4340();
		int var4 = var2.size() + var3.size();
		this.children = new Widget[var4];
		int var5 = 0;

		Iterator var6;
		Widget var8;
		for (var6 = var2.iterator(); var6.hasNext(); this.children[var5++] = var8) {
			class217 var7 = (class217)var6.next();
			var8 = IntProjection.method4802(5, this, var5, 0, 0, 0, 0, var7.field2362);
			var8.field3898 = var7.field2361.method3191();
			class356 var9 = new class356(var7.field2361);
			var1.field3783.method8882(var8.field3898, var9);
		}

		for (var6 = var3.iterator(); var6.hasNext(); this.children[var5++] = var8) {
			class228 var10 = (class228)var6.next();
			var8 = IntProjection.method4802(4, this, var5, 0, 0, 0, 0, var10.field2461);
			var8.text = var10.field2455;
			var8.fontId = (Integer)this.field3936.get(var10.field2458);
			var8.textXAlignment = var10.field2452;
			var8.textYAlignment = var10.field2457;
		}

	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1921049656"
	)
	public void method7278() {
		this.field3970 = new class357();

		for (int var1 = 1; var1 <= 12; ++var1) {
			this.field3970.field3798.method387(var1, 0);
		}

		for (char var2 = 0; var2 < ' '; ++var2) {
			this.field3970.field3798.method364(var2, 0);
		}

		this.field3970.field3798.method364('\u0080', 0);
		this.field3970.field3798.method387(82, 2);
		this.field3970.field3798.method387(81, 2);
		this.field3970.field3798.method387(86, 2);
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(B)Lnh;",
		garbageValue = "0"
	)
	public class359 method7284() {
		return this.field3970 != null ? this.field3970.field3796 : null;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)Lnb;",
		garbageValue = "-1926435993"
	)
	public class353 method7240() {
		return this.field3970 != null ? this.field3970.field3797 : null;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)Lbm;",
		garbageValue = "1019866971"
	)
	public class27 method7280() {
		return this.field3970 != null ? this.field3970.field3798 : null;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)Lnj;",
		garbageValue = "1606209795"
	)
	public class357 method7281() {
		return this.field3970;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lnh;I)Z",
		garbageValue = "372734409"
	)
	boolean method7272(class359 var1) {
		boolean var2 = false;
		String var5;
		String var6;
		StringBuilder var7;
		int var8;
		int var9;
		int var10;
		char var11;
		String var12;
		if (this.text != null && !this.text.isEmpty()) {
			var6 = this.text;
			var7 = new StringBuilder(var6.length());
			var8 = 0;
			var9 = -1;

			for (var10 = 0; var10 < var6.length(); ++var10) {
				var11 = var6.charAt(var10);
				if (var11 == '<') {
					var7.append(var6.substring(var8, var10));
					var9 = var10;
				} else if (var11 == '>' && var9 != -1) {
					var12 = var6.substring(var9 + 1, var10);
					var9 = -1;
					if (var12.equals("lt")) {
						var7.append("<");
					} else if (var12.equals("gt")) {
						var7.append(">");
					} else if (var12.equals("br")) {
						var7.append("\n");
					}

					var8 = var10 + 1;
				}
			}

			if (var8 < var6.length()) {
				var7.append(var6.substring(var8, var6.length()));
			}

			var5 = var7.toString();
			var2 |= var1.method6981(var5);
			this.text = "";
		}

		if (this.text2 != null && !this.text2.isEmpty()) {
			var6 = this.text2;
			var7 = new StringBuilder(var6.length());
			var8 = 0;
			var9 = -1;

			for (var10 = 0; var10 < var6.length(); ++var10) {
				var11 = var6.charAt(var10);
				if (var11 == '<') {
					var7.append(var6.substring(var8, var10));
					var9 = var10;
				} else if (var11 == '>' && var9 != -1) {
					var12 = var6.substring(var9 + 1, var10);
					var9 = -1;
					if (var12.equals("lt")) {
						var7.append("<");
					} else if (var12.equals("gt")) {
						var7.append(">");
					} else if (var12.equals("br")) {
						var7.append("\n");
					}

					var8 = var10 + 1;
				}
			}

			if (var8 < var6.length()) {
				var7.append(var6.substring(var8, var6.length()));
			}

			var5 = var7.toString();
			var2 |= var1.method7199(var5);
			this.text2 = "";
		}

		return var2;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lng;B)Z",
		garbageValue = "-76"
	)
	public boolean method7283(WidgetDefinition var1) {
		class359 var2 = this.method7284();
		if (var2 == null) {
			return false;
		} else {
			boolean var3 = false;
			if (!var2.method7035() && this.fontId != -1) {
				int var4 = var2.method7179();
				int var5 = var2.method7037();
				int var6 = var2.method7104();
				int var7 = var2.method7033();
				Font var8 = this.getFont(var1);
				if (var8 != null) {
					var3 |= var2.method7128(var8);
					var3 |= this.method7272(var2);
					var3 |= var2.method7114(var4, var5);
					var3 |= var2.method7003(var6, var7);
				}
			} else if (var2.method7035()) {
				var3 |= this.method7272(var2);
			}

			var2.method6978();
			return var3;
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Lnv;ZI)V",
		garbageValue = "1966652423"
	)
	public void method7340(PlayerComposition var1, boolean var2) {
		this.modelType = 7;
		this.field3932 = new PlayerComposition(var1);
		if (!var2) {
			this.field3932.equipment = Arrays.copyOf(this.field3932.field3808, this.field3932.field3808.length);
			this.field3932.method6960();
		}

	}

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "-265416816"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (class379.widgetDefinition.loadInterface(var0)) {
			class544.field5400 = null;
			class330.drawInterface(class379.widgetDefinition.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (class544.field5400 != null) {
				class330.drawInterface(class544.field5400, -1412584499, var1, var2, var3, var4, GameObject.field2973, class53.field356, var7);
				class544.field5400 = null;
			}

		} else {
			if (var7 != -1) {
				Client.validRootWidgets[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) {
					Client.validRootWidgets[var8] = true;
				}
			}

		}
	}
}
