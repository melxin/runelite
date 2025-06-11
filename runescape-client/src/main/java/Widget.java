import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ov")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("bm")
	public static boolean field3977;
	@ObfuscatedName("be")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 171818037
	)
	@Export("id")
	public int id;
	@ObfuscatedName("bw")
	@Export("childIndex")
	@ObfuscatedGetter(
		intValue = -744024149
	)
	public int childIndex;
	@ObfuscatedName("bf")
	String field3981;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -985509085
	)
	@Export("type")
	public int type;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1132980169
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1644965835
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 70757019
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -712309907
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -544905355
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 2121853591
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 861798047
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -142438823
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1276950699
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 2112218907
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1720170959
	)
	@Export("x")
	public int x;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -314541625
	)
	@Export("y")
	public int y;
	@ObfuscatedName("bh")
	@Export("width")
	@ObfuscatedGetter(
		intValue = -1805166981
	)
	public int width;
	@ObfuscatedName("bp")
	@Export("height")
	@ObfuscatedGetter(
		intValue = -2133353239
	)
	public int height;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 1140797911
	)
	public int field3997;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 1061256913
	)
	public int field3998;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -795816131
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -1883874225
	)
	public int field4127;
	@ObfuscatedName("cu")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -1093557263
	)
	public int field4002;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -603567659
	)
	public int field4003;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 127427793
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 178093445
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -870665995
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 944072121
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -669158221
	)
	@Export("color")
	public int color;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -685908593
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -824756439
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -2072893333
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("cf")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lwu;"
	)
	@Export("fillMode")
	public FillMode fillMode;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 505347959
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -1269649303
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 1814753599
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("cj")
	public boolean field3983;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -929316875
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 1528347747
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("cv")
	public String field4020;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 1279746735
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("cm")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -505904553
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = 1189051695
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("dk")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("de")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = 1013029805
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = 1537543699
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = -1028840015
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = 347016189
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = 1530023549
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = -372687561
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = 2046893045
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -61880125
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = 633337365
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = 1024831575
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = -334271589
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 1140657255
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 1687014423
	)
	public int field4039;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = 2140261231
	)
	public int field4101;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	public PlayerComposition field4111;
	@ObfuscatedName("dj")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("da")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = -1033802861
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 2117685601
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("dh")
	@Export("text")
	public String text;
	@ObfuscatedName("dw")
	@Export("text2")
	public String text2;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = -415606593
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		intValue = 1177108201
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = -1537574259
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("ep")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("eh")
	int[] field4052;
	@ObfuscatedName("em")
	int[] field4053;
	@ObfuscatedName("ee")
	int[] field4054;
	@ObfuscatedName("en")
	String[] field4132;
	@ObfuscatedName("el")
	@ObfuscatedGetter(
		intValue = 23408241
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("ea")
	public boolean field4057;
	@ObfuscatedName("ew")
	public byte[][] field4058;
	@ObfuscatedName("ef")
	public byte[][] field4059;
	@ObfuscatedName("ey")
	public int[] field4060;
	@ObfuscatedName("eq")
	public int[] field4031;
	@ObfuscatedName("er")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("es")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("ec")
	public String[][] field4064;
	@ObfuscatedName("eo")
	@ObfuscatedGetter(
		intValue = -1196438339
	)
	@Export("targetPriority")
	public int targetPriority;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("eu")
	@ObfuscatedGetter(
		intValue = -1850741621
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("eb")
	@ObfuscatedGetter(
		intValue = -242750207
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("ek")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("ej")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("ex")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("eg")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("ed")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("ev")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("fq")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("fa")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("fw")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("fk")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("fo")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("fu")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("fg")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("fi")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("fx")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("ff")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("fl")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("fd")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("ft")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("fj")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("fb")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("fz")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("fv")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("fe")
	public Object[] field4092;
	@ObfuscatedName("fn")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("fs")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("fy")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("fm")
	public Object[] field4023;
	@ObfuscatedName("fp")
	public Object[] field4097;
	@ObfuscatedName("fh")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("fr")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("fc")
	public Object[] field4100;
	@ObfuscatedName("gr")
	public Object[] field4088;
	@ObfuscatedName("gl")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("gn")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("go")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("gu")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("ga")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("gh")
	public Object[] field4041;
	@ObfuscatedName("gj")
	public Object[] field4005;
	@ObfuscatedName("gw")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("gm")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("gg")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = -898268281
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("gc")
	public String field4113;
	@ObfuscatedName("gd")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("gx")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("gv")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("gs")
	@ObfuscatedGetter(
		intValue = -876976075
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("gp")
	@ObfuscatedGetter(
		intValue = -756517917
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("gi")
	@ObfuscatedGetter(
		intValue = 1852857817
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("gz")
	@ObfuscatedGetter(
		intValue = -816151335
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "[Lov;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("ge")
	public boolean field4122;
	@ObfuscatedName("gt")
	public boolean field4123;
	@ObfuscatedName("gy")
	@ObfuscatedGetter(
		intValue = -241170865
	)
	public int field4124;
	@ObfuscatedName("gb")
	@ObfuscatedGetter(
		intValue = 380780679
	)
	public int field4125;
	@ObfuscatedName("gf")
	@ObfuscatedGetter(
		intValue = 192102523
	)
	public int field4126;
	@ObfuscatedName("hj")
	@ObfuscatedGetter(
		intValue = -587478263
	)
	public int field4141;
	@ObfuscatedName("hm")
	@ObfuscatedGetter(
		intValue = 33779257
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("hi")
	@ObfuscatedGetter(
		intValue = -2040815781
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("ho")
	public int[] field4130;
	@ObfuscatedName("hs")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("hc")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("hk")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;
	@ObfuscatedName("hy")
	HashMap field4116;
	@ObfuscatedName("hx")
	HashMap field4070;
	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	class365 field4136;
	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	class217 field4137;
	@ObfuscatedName("ht")
	@ObfuscatedGetter(
		intValue = 1424273087
	)
	int field4138;
	@ObfuscatedName("hd")
	int[] field4000;
	@ObfuscatedName("hz")
	Object[] field4135;
	@ObfuscatedName("hr")
	@ObfuscatedGetter(
		intValue = 487450423
	)
	int field4134;

	static {
		field3977 = false;
	}

	public Widget() {
		this.isIf3 = false;
		this.id = -1;
		this.childIndex = -926100227;
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
		this.field3997 = 1;
		this.field3998 = 1;
		this.parentId = -1;
		this.field4127 = -1;
		this.isHidden = false;
		this.field4002 = 65535;
		this.field4003 = 0;
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
		this.field3983 = false;
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
		this.field4039 = 0;
		this.field4101 = 0;
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
		this.field4057 = false;
		this.dataText = "";
		this.targetPriority = -209307052;
		this.parent = null;
		this.dragZoneSize = 0;
		this.dragThreshold = 0;
		this.isScrollBar = false;
		this.spellActionName = "";
		this.hasListener = false;
		this.mouseOverRedirect = -1;
		this.field4113 = "";
		this.buttonText = "Ok";
		this.itemId = -1;
		this.itemQuantity = 0;
		this.modelFrame = 0;
		this.modelFrameCycle = 0;
		this.field4122 = false;
		this.field4123 = false;
		this.field4124 = -1;
		this.field4125 = 0;
		this.field4126 = 0;
		this.field4141 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
		this.field4138 = -1;
	}

	@ObfuscatedSignature(
		descriptor = "(Lov;)V"
	)
	public Widget(Widget var1) {
		this.isIf3 = false;
		this.id = -1;
		this.childIndex = -926100227;
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
		this.field3997 = 1;
		this.field3998 = 1;
		this.parentId = -1;
		this.field4127 = -1;
		this.isHidden = false;
		this.field4002 = 65535;
		this.field4003 = 0;
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
		this.field3983 = false;
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
		this.field4039 = 0;
		this.field4101 = 0;
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
		this.field4057 = false;
		this.dataText = "";
		this.targetPriority = -209307052;
		this.parent = null;
		this.dragZoneSize = 0;
		this.dragThreshold = 0;
		this.isScrollBar = false;
		this.spellActionName = "";
		this.hasListener = false;
		this.mouseOverRedirect = -1;
		this.field4113 = "";
		this.buttonText = "Ok";
		this.itemId = -1;
		this.itemQuantity = 0;
		this.modelFrame = 0;
		this.modelFrameCycle = 0;
		this.field4122 = false;
		this.field4123 = false;
		this.field4124 = -1;
		this.field4125 = 0;
		this.field4126 = 0;
		this.field4141 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
		this.field4138 = -1;
		this.isIf3 = var1.isIf3;
		this.id = var1.id;
		this.childIndex = var1.childIndex;
		this.field3981 = var1.field3981;
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
		this.field3997 = var1.field3997;
		this.field3998 = var1.field3998;
		this.parentId = var1.parentId;
		this.field4127 = var1.field4127;
		this.field4002 = var1.field4002;
		this.field4003 = var1.field4003;
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
		this.field3983 = var1.field3983;
		this.spriteId2 = var1.spriteId2;
		this.spriteId = var1.spriteId;
		this.field4020 = var1.field4020;
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
		this.field4039 = var1.field4039;
		this.field4101 = var1.field4101;
		if (var1.field4111 != null) {
			this.field4111 = new PlayerComposition(var1.field4111);
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
		this.field4052 = this.method7814(var1.field4052);
		this.field4053 = this.method7814(var1.field4053);
		this.field4054 = this.method7814(var1.field4054);
		this.field4132 = (String[])((String[])this.method7733(var1.field4132));
		if (var1.field4137 != null) {
			this.field4137 = new class217(var1.field4137);
		}

		this.field4138 = var1.field4138;
		this.field4116 = var1.field4116;
		if (var1.field4070 != null) {
			this.field4070 = new HashMap();
			this.field4070.putAll(var1.field4070);
		}

		this.field4136 = null;
		this.flags = var1.flags;
		this.field4057 = var1.field4057;
		int var2;
		if (var1.field4058 != null) {
			this.field4058 = new byte[var1.field4058.length][];

			for (var2 = 0; var2 < var1.field4058.length; ++var2) {
				this.field4058[var2] = new byte[var1.field4058[var2].length];
				System.arraycopy(var1.field4058[var2], 0, this.field4058[var2], 0, var1.field4058[var2].length);
			}
		}

		if (var1.field4059 != null) {
			this.field4059 = new byte[var1.field4059.length][];

			for (var2 = 0; var2 < var1.field4059.length; ++var2) {
				this.field4059[var2] = new byte[var1.field4059[var2].length];
				System.arraycopy(var1.field4059[var2], 0, this.field4059[var2], 0, var1.field4059[var2].length);
			}
		}

		this.field4060 = this.method7814(var1.field4060);
		this.field4031 = this.method7814(var1.field4031);
		this.dataText = var1.dataText;
		this.actions = (String[])((String[])this.method7733(var1.actions));
		if (var1.field4064 != null) {
			this.field4064 = new String[var1.field4064.length][];

			for (var2 = 0; var2 < var1.field4064.length; ++var2) {
				this.field4064[var2] = new String[var1.field4064[var2].length];
				System.arraycopy(var1.field4064[var2], 0, this.field4064[var2], 0, var1.field4064[var2].length);
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
		this.field4092 = var1.field4092;
		this.onScroll = var1.onScroll;
		this.onChatTransmit = var1.onChatTransmit;
		this.onKey = var1.onKey;
		this.field4023 = var1.field4023;
		this.field4097 = var1.field4097;
		this.onFriendTransmit = var1.onFriendTransmit;
		this.onClanTransmit = var1.onClanTransmit;
		this.field4100 = var1.field4100;
		this.field4088 = var1.field4088;
		this.onMiscTransmit = var1.onMiscTransmit;
		this.onDialogAbort = var1.onDialogAbort;
		this.onSubChange = var1.onSubChange;
		this.onResize = var1.onResize;
		this.onStockTransmit = var1.onStockTransmit;
		this.field4041 = var1.field4041;
		this.field4005 = var1.field4005;
		this.cs1Instructions = var1.cs1Instructions;
		this.cs1Comparisons = this.method7814(var1.cs1Comparisons);
		this.cs1ComparisonValues = this.method7814(var1.cs1ComparisonValues);
		this.mouseOverRedirect = var1.mouseOverRedirect;
		this.field4113 = var1.field4113;
		this.buttonText = var1.buttonText;
		this.itemIds = this.method7814(var1.itemIds);
		this.itemQuantities = this.method7814(var1.itemQuantities);
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

		this.field4122 = var1.field4122;
		this.field4123 = var1.field4123;
		this.field4124 = var1.field4124;
		this.field4125 = var1.field4125;
		this.field4126 = var1.field4126;
		this.field4141 = var1.field4141;
		this.rootIndex = var1.rootIndex;
		this.cycle = var1.cycle;
		this.field4130 = this.method7814(var1.field4130);
		this.noClickThrough = var1.noClickThrough;
		this.noScrollThrough = var1.noScrollThrough;
		this.prioritizeMenuEntry = var1.prioritizeMenuEntry;
		if (var1.field4134 > 0) {
			this.field4000 = this.method7814(var1.field4000);
			this.field4135 = this.method7733(var1.field4135);
			this.field4134 = var1.field4134;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;B)[Ljava/lang/Object;",
		garbageValue = "-1"
	)
	Object[] method7733(Object[] var1) {
		return var1 != null ? Arrays.copyOf(var1, var1.length) : null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([II)[I",
		garbageValue = "-1818166288"
	)
	int[] method7814(int[] var1) {
		return var1 != null ? Arrays.copyOf(var1, var1.length) : null;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "-2136590290"
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
			this.field4113 = var1.readStringCp1252NullTerminated();
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "299879929"
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
				this.field4039 = var1.readUnsignedShort();
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
			this.field3983 = var1.readUnsignedByte() == 1;
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lwt;B)V",
		garbageValue = "83"
	)
	void method7737(Buffer var1) {
		this.field3981 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lwt;B)[Ljava/lang/Object;",
		garbageValue = "0"
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
		descriptor = "(Lwt;B)[I",
		garbageValue = "-1"
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lnn;ZLes;B)Lwd;",
		garbageValue = "-50"
	)
	@Export("getSprite")
	public SpritePixels getSprite(WidgetDefinition var1, boolean var2, UrlRequester var3) {
		field3977 = false;
		if (this.field4020 != null) {
			SpritePixels var4 = this.method7855(var1, var3);
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
				var7 = IntHashTable.SpriteBuffer_getSprite(var1.field3869, var8, 0);
				if (var7 == null) {
					field3977 = true;
					return null;
				} else {
					this.method7744(var7);
					var1.Widget_cachedSprites.put(var7, var5);
					return var7;
				}
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lnn;Les;I)Lwd;",
		garbageValue = "-1697819388"
	)
	SpritePixels method7855(WidgetDefinition var1, UrlRequester var2) {
		if (!this.method7743()) {
			return this.method7742(var1, var2);
		} else {
			String var3 = this.field4020 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow;
			SpritePixels var4 = (SpritePixels)var1.field3881.method9463(var3);
			if (var4 == null) {
				SpritePixels var5 = this.method7742(var1, var2);
				if (var5 != null) {
					var4 = var5.method11321();
					this.method7744(var4);
					var1.field3881.method9464(var3, var4);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnn;Les;I)Lwd;",
		garbageValue = "1183152930"
	)
	SpritePixels method7742(WidgetDefinition var1, UrlRequester var2) {
		if (this.field4020 != null && var2 != null) {
			class364 var3 = (class364)var1.field3877.method9463(this.field4020);
			if (var3 == null) {
				var3 = new class364(this.field4020, var2);
				var1.field3877.method9464(this.field4020, var3);
			}

			return var3.method7309();
		} else {
			return null;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1128701242"
	)
	boolean method7743() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lwd;I)V",
		garbageValue = "-1905997701"
	)
	void method7744(SpritePixels var1) {
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lnn;B)Lrf;",
		garbageValue = "34"
	)
	@Export("getFont")
	public Font getFont(WidgetDefinition var1) {
		field3977 = false;
		if (this.fontId == -1) {
			return null;
		} else {
			Font var2 = (Font)var1.Widget_cachedFonts.get((long)this.fontId);
			if (var2 != null) {
				return var2;
			} else {
				var2 = class384.method7944(var1.field3869, var1.field3867, this.fontId, 0);
				if (var2 != null) {
					var1.Widget_cachedFonts.put(var2, (long)this.fontId);
				} else {
					field3977 = true;
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lnn;Lip;IZLoq;Lhd;Lht;B)Ljm;",
		garbageValue = "-13"
	)
	@Export("getModel")
	public Model getModel(WidgetDefinition var1, SequenceDefinition var2, int var3, boolean var4, PlayerComposition var5, NPCComposition var6, NpcOverrides var7) {
		field3977 = false;
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
				var10 |= var7.field2018 << 20;
			}

			Model var12 = (Model)var1.Widget_cachedModels.get(var10);
			if (var12 == null) {
				ModelData var13 = null;
				int var14 = 64;
				int var15 = 768;
				switch(var8) {
				case 1:
					var13 = ModelData.ModelData_get(var1.field3868, var9, 0);
					break;
				case 2:
					var13 = var6.method4200((NpcOverrides)null);
					break;
				case 3:
					var13 = var5 != null ? var5.getModelData() : null;
					break;
				case 4:
					ItemComposition var16 = SceneTilePaint.ItemDefinition_get(var9);
					var13 = var16.getModelData(10);
					var14 += var16.ambient;
					var15 += var16.contrast;
				case 5:
				default:
					break;
				case 6:
					var13 = var6.method4200(var7);
				}

				if (var13 == null) {
					field3977 = true;
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
		descriptor = "(Lnn;ZI)Lnr;",
		garbageValue = "1528088946"
	)
	public SpriteMask method7762(WidgetDefinition var1, boolean var2) {
		if (this.spriteId == -1) {
			var2 = false;
		}

		int var3 = var2 ? this.spriteId : this.spriteId2;
		if (var3 == -1) {
			return null;
		} else {
			long var4 = ((long)this.spriteShadow << 40) + ((this.spriteFlipV ? 1L : 0L) << 38) + (long)var3 + ((long)this.outline << 36) + ((this.spriteFlipH ? 1L : 0L) << 39);
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-834317854"
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;S)V",
		garbageValue = "8615"
	)
	public void method7794(int var1, int var2, String var3) {
		if (this.field4064 == null || this.field4064.length <= var1) {
			String[][] var4 = new String[var1 + 1][];
			if (this.field4064 != null) {
				System.arraycopy(this.field4064, 0, var4, 0, this.field4064.length);
			}

			this.field4064 = var4;
		}

		if (this.field4064[var1] == null || this.field4064[var1].length <= var2) {
			String[] var5 = new String[var2 + 1];
			if (this.field4064[var1] != null) {
				System.arraycopy(this.field4064[var1], 0, var5, 0, this.field4064[var1].length);
			}

			this.field4064[var1] = var5;
		}

		this.field4064[var1][var2] = var3;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "861115063"
	)
	public boolean method7872() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-161360964"
	)
	public boolean method7849() {
		return this.type == 11 || this.type == 12;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "-2015973166"
	)
	public Object method7752(int var1, Object var2) {
		for (int var3 = 0; var3 < this.field4134; ++var3) {
			if (this.field4000[var3] == var1) {
				return this.field4135[var3];
			}
		}

		return var2;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "92"
	)
	public int method7753(int var1, int var2) {
		for (int var3 = 0; var3 < this.field4134; ++var3) {
			if (this.field4000[var3] == var1) {
				return (Integer)this.field4135[var3];
			}
		}

		return var2;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "-175970997"
	)
	public void method7754(int var1, Object var2) {
		for (int var3 = 0; var3 < this.field4134; ++var3) {
			if (this.field4000[var3] == var1) {
				this.field4135[var3] = var2;
				return;
			}
		}

		if (this.field4135 == null) {
			this.field4000 = new int[4];
			this.field4135 = new Object[4];
		} else if (this.field4135.length == this.field4134) {
			this.field4000 = Arrays.copyOf(this.field4000, this.field4000.length * 2);
			this.field4135 = Arrays.copyOf(this.field4135, this.field4135.length * 2);
		}

		this.field4000[this.field4134] = var1;
		this.field4135[this.field4134] = var2;
		++this.field4134;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Les;J)V"
	)
	public void method7776(String var1, String var2, UrlRequester var3, long var4) {
		if (this.type == 11 && -1L != var4) {
			var1 = var1.replaceAll("%userid%", Long.toString(var4));
			this.field4137 = new class217();
			if (!this.field4137.method4637(var1, var2, var3)) {
				this.field4137 = null;
			} else {
				if (this.field4116 == null || this.field4070 == null) {
					this.method7732();
				}

			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Les;I)V",
		garbageValue = "1347352354"
	)
	public void method7756(String var1, String var2, String var3, String var4, String var5, UrlRequester var6) {
		this.field4137 = new class217();
		if (!this.field4137.method4637(var1, var3, var6)) {
			this.field4137 = null;
		} else {
			if (this.field4116 == null || this.field4070 == null) {
				this.method7732();
			}

			this.field4137.method4688(var2, var4, var5);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Les;I)V",
		garbageValue = "-1758200814"
	)
	public void method7757(String var1, UrlRequester var2) {
		if (this.type == 11 && var1 != null) {
			this.field4137 = new class217();
			this.field4137.method4642(var1, var2);
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-111"
	)
	void method7732() {
		this.field4116 = new HashMap();
		this.field4070 = new HashMap();
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "113"
	)
	public void method7759(int var1, int var2) {
		if (this.type == 11) {
			if (this.field4116 == null) {
				this.method7732();
			}

			this.field4116.put(var1, var2);
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-163677649"
	)
	public void method7760(String var1, int var2) {
		if (this.type == 11) {
			if (this.field4070 == null) {
				this.method7732();
			}

			this.field4070.put(var1, var2);
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "-615899205"
	)
	public boolean method7761(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field4137 != null && this.method7841()) {
			var1 -= var3;
			var2 -= var4;
			int var5 = (int)(this.field4137.method4673()[0] * (float)(this.width * -1805166981));
			int var6 = (int)(this.field4137.method4673()[1] * (float)(this.height * -2133353239));
			int var7 = var5 + (int)(this.field4137.method4673()[2] * (float)(this.width * -1805166981));
			int var8 = var6 + (int)(this.field4137.method4673()[3] * (float)(-2133353239 * this.height));
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1140266216"
	)
	public boolean method7841() {
		return this.field4138 == 2;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "2125431594"
	)
	public int method7763(String var1) {
		return this.type == 11 && this.field4137 != null && this.method7841() ? this.field4137.method4648(var1) : -1;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-64077353"
	)
	public String method7778(String var1) {
		return this.type == 11 && this.field4137 != null && this.method7841() ? this.field4137.method4660(var1) : null;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1593880837"
	)
	public int method7765() {
		return this.field4070 != null && !this.field4070.isEmpty() ? 1 : 0;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-7"
	)
	public int method7766() {
		if (this.type == 11 && this.field4137 != null && this.field4070 != null && !this.field4070.isEmpty()) {
			String var1 = this.field4137.method4670();
			return var1 != null && this.field4070.containsKey(this.field4137.method4670()) ? (Integer)this.field4070.get(var1) : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1652287651"
	)
	public String method7767() {
		if (this.type == 11 && this.field4137 != null) {
			String var1 = this.field4137.method4670();
			Iterator var2 = this.field4137.method4646().iterator();

			while (var2.hasNext()) {
				class231 var3 = (class231)var2.next();
				String var4 = String.format("%%%S%%", var3.method4850());
				if (var3.vmethod4851() == 0) {
					var1.replaceAll(var4, Integer.toString(var3.vmethod4853()));
				} else {
					var1.replaceAll(var4, var3.vmethod4852());
				}
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-13"
	)
	public int[] method7772() {
		if (this.type == 11 && this.field4137 != null) {
			int[] var1 = new int[3];
			int var2 = 0;
			Iterator var3 = this.field4137.method4646().iterator();

			while (var3.hasNext()) {
				class231 var4 = (class231)var3.next();
				if (!var4.method4850().equals("user_id")) {
					if (var4.vmethod4851() != 0) {
						return null;
					}

					var1[var2++] = var4.vmethod4853();
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

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)Lis;",
		garbageValue = "371418279"
	)
	public class217 method7758() {
		return this.field4137;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lnn;Les;I)Z",
		garbageValue = "-2108864829"
	)
	public boolean method7770(WidgetDefinition var1, UrlRequester var2) {
		if (this.type == 11 && this.field4137 != null) {
			this.field4137.method4647(var2);
			if (this.field4137.method4640() != this.field4138) {
				this.field4138 = this.field4137.method4640();
				if (this.field4138 >= 3) {
					return true;
				}

				if (this.field4138 == 2) {
					this.method7771(var1);
					return true;
				}
			}

			return false;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lnn;B)V",
		garbageValue = "0"
	)
	void method7771(WidgetDefinition var1) {
		this.noClickThrough = true;
		ArrayList var2 = this.field4137.method4644();
		ArrayList var3 = this.field4137.method4645();
		int var4 = var2.size() + var3.size();
		this.children = new Widget[var4];
		int var5 = 0;

		Iterator var6;
		Widget var8;
		for (var6 = var2.iterator(); var6.hasNext(); this.children[var5++] = var8) {
			class218 var7 = (class218)var6.next();
			var8 = VarcInt.method4038(5, this, var5, 0, 0, 0, 0, var7.field2405);
			var8.field4020 = var7.field2406.method3367();
			class364 var9 = new class364(var7.field2406);
			var1.field3877.method9464(var8.field4020, var9);
		}

		for (var6 = var3.iterator(); var6.hasNext(); this.children[var5++] = var8) {
			class229 var10 = (class229)var6.next();
			var8 = VarcInt.method4038(4, this, var5, 0, 0, 0, 0, var10.field2505);
			var8.text = var10.field2507;
			var8.fontId = (Integer)this.field4116.get(var10.field2504);
			var8.textXAlignment = var10.field2506;
			var8.textYAlignment = var10.field2502;
		}

	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1531839620"
	)
	public void method7806() {
		this.field4136 = new class365();

		for (int var1 = 1; var1 <= 12; ++var1) {
			this.field4136.field3896.method424(var1, 0);
		}

		for (char var2 = 0; var2 < ' '; ++var2) {
			this.field4136.field3896.method429(var2, 0);
		}

		this.field4136.field3896.method429('\u0080', 0);
		this.field4136.field3896.method424(82, 2);
		this.field4136.field3896.method424(81, 2);
		this.field4136.field3896.method424(86, 2);
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)Lod;",
		garbageValue = "-259608690"
	)
	public class367 method7755() {
		return this.field4136 != null ? this.field4136.field3897 : null;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)Lnf;",
		garbageValue = "719150045"
	)
	public class361 method7774() {
		return this.field4136 != null ? this.field4136.field3901 : null;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)Lbx;",
		garbageValue = "208431443"
	)
	public class27 method7775() {
		return this.field4136 != null ? this.field4136.field3896 : null;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)Lop;",
		garbageValue = "591921840"
	)
	public class365 method7878() {
		return this.field4136;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lod;B)Z",
		garbageValue = "-11"
	)
	boolean method7777(class367 var1) {
		boolean var2 = false;
		if (this.text != null && !this.text.isEmpty()) {
			var2 |= var1.method7462(WorldMapRegion.method6428(this.text));
			this.text = "";
		}

		if (this.text2 != null && !this.text2.isEmpty()) {
			var2 |= var1.method7573(WorldMapRegion.method6428(this.text2));
			this.text2 = "";
		}

		return var2;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)Z",
		garbageValue = "-286543611"
	)
	public boolean method7747(WidgetDefinition var1) {
		class367 var2 = this.method7755();
		if (var2 == null) {
			return false;
		} else {
			boolean var3 = false;
			if (!var2.method7454() && this.fontId != -1) {
				int var4 = var2.method7559();
				int var5 = var2.method7456();
				int var6 = var2.method7615();
				int var7 = var2.method7452();
				Font var8 = this.getFont(var1);
				if (var8 != null) {
					var3 |= var2.method7405(var8);
					var3 |= this.method7777(var2);
					var3 |= var2.method7410(var4, var5);
					var3 |= var2.method7435(var6, var7);
				}
			} else if (var2.method7454()) {
				var3 |= this.method7777(var2);
			}

			var2.method7400();
			return var3;
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Loq;ZB)V",
		garbageValue = "0"
	)
	public void method7779(PlayerComposition var1, boolean var2) {
		this.modelType = 7;
		this.field4111 = new PlayerComposition(var1);
		if (!var2) {
			this.field4111.equipment = Arrays.copyOf(this.field4111.field3907, this.field4111.field3907.length);
			this.field4111.method7364();
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILcj;I)Ldl;",
		garbageValue = "-1332034168"
	)
	public static WorldView method7887(int var0, WorldViewManager var1) {
		Iterator var2 = var1.iterator();

		WorldView var3;
		do {
			if (!var2.hasNext()) {
				return var1.method2221();
			}

			var3 = (WorldView)var2.next();
		} while(var3.npcs.get((long)var0) == null);

		return var3;
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1894285498"
	)
	static boolean method7751() {
		return (Client.drawPlayerNames & 2) != 0;
	}
}
