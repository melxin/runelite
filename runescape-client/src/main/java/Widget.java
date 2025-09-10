import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oi")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("bl")
	public static boolean field4142;
	@ObfuscatedName("by")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -852378921
	)
	@Export("id")
	public int id;
	@ObfuscatedName("bx")
	@Export("childIndex")
	@ObfuscatedGetter(
		intValue = -217986249
	)
	public int childIndex;
	@ObfuscatedName("bq")
	String field4257;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1795407049
	)
	@Export("type")
	public int type;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1631043765
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 354780731
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1664977527
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1675272097
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 810595695
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1760746663
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -335909407
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -2001904323
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1931464083
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1296183891
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 748626899
	)
	@Export("x")
	public int x;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1397075659
	)
	@Export("y")
	public int y;
	@ObfuscatedName("cw")
	@Export("width")
	@ObfuscatedGetter(
		intValue = 469894397
	)
	public int width;
	@ObfuscatedName("cz")
	@Export("height")
	@ObfuscatedGetter(
		intValue = 1156037777
	)
	public int height;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 1002891453
	)
	public int field4162;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 680269393
	)
	public int field4163;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 1399008907
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -1993001915
	)
	public int field4165;
	@ObfuscatedName("cm")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -143815995
	)
	public int field4248;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -290949815
	)
	public int field4214;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -1114694847
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -915859377
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 22441875
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -1030638467
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -218821823
	)
	@Export("color")
	public int color;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 601256703
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -598340221
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -964848793
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("cv")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Lxk;"
	)
	@Export("fillMode")
	public FillMode fillMode;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 603122091
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -1744209901
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 1190298503
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("ck")
	public boolean field4182;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -1602805641
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -378928703
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("cs")
	public String field4185;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = 35008369
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("dr")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 338791089
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -1702138187
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("da")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("dc")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = 1818206519
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = 1369103321
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = 1089457503
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -1193696711
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -216608611
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -2060115799
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = -516635403
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -1738240155
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = -719968461
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = -75407291
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -1073008899
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = -454320223
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = 49875309
	)
	public int field4152;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = 1661000345
	)
	public int field4205;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	public PlayerComposition field4206;
	@ObfuscatedName("dx")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("di")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = 1332890435
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -1106746545
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("do")
	@Export("text")
	public String text;
	@ObfuscatedName("ef")
	@Export("text2")
	public String text2;
	@ObfuscatedName("ez")
	@ObfuscatedGetter(
		intValue = -949438365
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("er")
	@ObfuscatedGetter(
		intValue = 2041966399
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("eb")
	@ObfuscatedGetter(
		intValue = 1832118845
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("ec")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("ew")
	int[] field4153;
	@ObfuscatedName("eo")
	int[] field4218;
	@ObfuscatedName("eg")
	int[] field4219;
	@ObfuscatedName("en")
	String[] field4146;
	@ObfuscatedName("ek")
	@ObfuscatedGetter(
		intValue = -446411033
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("es")
	public boolean field4222;
	@ObfuscatedName("ed")
	public byte[][] field4223;
	@ObfuscatedName("ep")
	public byte[][] field4224;
	@ObfuscatedName("eq")
	public int[] field4220;
	@ObfuscatedName("eu")
	public int[] field4233;
	@ObfuscatedName("el")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("ey")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("ea")
	public String[][] field4229;
	@ObfuscatedName("ej")
	@Export("targetPriority")
	public int targetPriority;
	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("ee")
	@ObfuscatedGetter(
		intValue = 1368189609
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("ex")
	@ObfuscatedGetter(
		intValue = 680269161
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("em")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("et")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("eh")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("ev")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("fv")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("fq")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("fi")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("fd")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("ft")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("fa")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("fs")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("fy")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("ff")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("fe")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("fk")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("fo")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("fc")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("fg")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("fj")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("fu")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("fh")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("fm")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("fb")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("fp")
	public Object[] field4302;
	@ObfuscatedName("fn")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("fw")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("fl")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("fx")
	public Object[] field4261;
	@ObfuscatedName("fz")
	public Object[] field4159;
	@ObfuscatedName("fr")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("gb")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("gk")
	public Object[] field4280;
	@ObfuscatedName("gz")
	public Object[] field4266;
	@ObfuscatedName("gn")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("gj")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("gr")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("gs")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("gv")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("ge")
	public Object[] field4273;
	@ObfuscatedName("gx")
	public Object[] field4176;
	@ObfuscatedName("gy")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("gh")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("ga")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("gc")
	@ObfuscatedGetter(
		intValue = -2054325193
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("gw")
	public String field4298;
	@ObfuscatedName("gm")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("go")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("gf")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("gu")
	@ObfuscatedGetter(
		intValue = 220844043
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("gd")
	@ObfuscatedGetter(
		intValue = -1687246149
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("gq")
	@ObfuscatedGetter(
		intValue = 1513291881
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("gt")
	@ObfuscatedGetter(
		intValue = -2128163965
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "[Loi;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("gl")
	public boolean field4265;
	@ObfuscatedName("gp")
	public boolean field4171;
	@ObfuscatedName("gg")
	@ObfuscatedGetter(
		intValue = -530114031
	)
	public int field4289;
	@ObfuscatedName("hd")
	@ObfuscatedGetter(
		intValue = -1390684493
	)
	public int field4290;
	@ObfuscatedName("hj")
	@ObfuscatedGetter(
		intValue = 1590007693
	)
	public int field4287;
	@ObfuscatedName("ha")
	@ObfuscatedGetter(
		intValue = 1752468179
	)
	public int field4292;
	@ObfuscatedName("hg")
	@ObfuscatedGetter(
		intValue = 384776593
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("hs")
	@ObfuscatedGetter(
		intValue = -1641701933
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("hi")
	public int[] field4295;
	@ObfuscatedName("hk")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("hf")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("hy")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;
	@ObfuscatedName("hc")
	HashMap field4299;
	@ObfuscatedName("hm")
	HashMap field4300;
	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	class364 field4155;
	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "Ljo;"
	)
	class256 field4306;
	@ObfuscatedName("hh")
	@ObfuscatedGetter(
		intValue = 365736139
	)
	int field4303;
	@ObfuscatedName("hz")
	int[] field4186;
	@ObfuscatedName("hw")
	Object[] field4305;
	@ObfuscatedName("hx")
	@ObfuscatedGetter(
		intValue = -145833619
	)
	int field4301;

	static {
		field4142 = false;
	}

	public Widget() {
		this.isIf3 = false;
		this.id = -1;
		this.childIndex = 1618486649;
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
		this.field4162 = 1;
		this.field4163 = 1;
		this.parentId = -1;
		this.field4165 = -1;
		this.isHidden = false;
		this.field4248 = 65535;
		this.field4214 = 0;
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
		this.field4182 = false;
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
		this.field4152 = 0;
		this.field4205 = 0;
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
		this.field4222 = false;
		this.dataText = "";
		this.targetPriority = 1195639676;
		this.parent = null;
		this.dragZoneSize = 0;
		this.dragThreshold = 0;
		this.isScrollBar = false;
		this.spellActionName = "";
		this.hasListener = false;
		this.mouseOverRedirect = -1;
		this.field4298 = "";
		this.buttonText = "Ok";
		this.itemId = -1;
		this.itemQuantity = 0;
		this.modelFrame = 0;
		this.modelFrameCycle = 0;
		this.field4265 = false;
		this.field4171 = false;
		this.field4289 = -1;
		this.field4290 = 0;
		this.field4287 = 0;
		this.field4292 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
		this.field4303 = -1;
	}

	@ObfuscatedSignature(
		descriptor = "(Loi;)V"
	)
	public Widget(Widget var1) {
		this.isIf3 = false;
		this.id = -1;
		this.childIndex = 1618486649;
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
		this.field4162 = 1;
		this.field4163 = 1;
		this.parentId = -1;
		this.field4165 = -1;
		this.isHidden = false;
		this.field4248 = 65535;
		this.field4214 = 0;
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
		this.field4182 = false;
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
		this.field4152 = 0;
		this.field4205 = 0;
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
		this.field4222 = false;
		this.dataText = "";
		this.targetPriority = 1195639676;
		this.parent = null;
		this.dragZoneSize = 0;
		this.dragThreshold = 0;
		this.isScrollBar = false;
		this.spellActionName = "";
		this.hasListener = false;
		this.mouseOverRedirect = -1;
		this.field4298 = "";
		this.buttonText = "Ok";
		this.itemId = -1;
		this.itemQuantity = 0;
		this.modelFrame = 0;
		this.modelFrameCycle = 0;
		this.field4265 = false;
		this.field4171 = false;
		this.field4289 = -1;
		this.field4290 = 0;
		this.field4287 = 0;
		this.field4292 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
		this.field4303 = -1;
		this.isIf3 = var1.isIf3;
		this.id = var1.id;
		this.childIndex = var1.childIndex;
		this.field4257 = var1.field4257;
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
		this.field4162 = var1.field4162;
		this.field4163 = var1.field4163;
		this.parentId = var1.parentId;
		this.field4165 = var1.field4165;
		this.field4248 = var1.field4248;
		this.field4214 = var1.field4214;
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
		this.field4182 = var1.field4182;
		this.spriteId2 = var1.spriteId2;
		this.spriteId = var1.spriteId;
		this.field4185 = var1.field4185;
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
		this.field4152 = var1.field4152;
		this.field4205 = var1.field4205;
		if (var1.field4206 != null) {
			this.field4206 = new PlayerComposition(var1.field4206);
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
		this.field4153 = this.method7933(var1.field4153);
		this.field4218 = this.method7933(var1.field4218);
		this.field4219 = this.method7933(var1.field4219);
		this.field4146 = (String[])((String[])this.method8063(var1.field4146));
		if (var1.field4306 != null) {
			this.field4306 = new class256(var1.field4306);
		}

		this.field4303 = var1.field4303;
		this.field4299 = var1.field4299;
		if (var1.field4300 != null) {
			this.field4300 = new HashMap();
			this.field4300.putAll(var1.field4300);
		}

		this.field4155 = null;
		this.flags = var1.flags;
		this.field4222 = var1.field4222;
		int var2;
		if (var1.field4223 != null) {
			this.field4223 = new byte[var1.field4223.length][];

			for (var2 = 0; var2 < var1.field4223.length; ++var2) {
				this.field4223[var2] = new byte[var1.field4223[var2].length];
				System.arraycopy(var1.field4223[var2], 0, this.field4223[var2], 0, var1.field4223[var2].length);
			}
		}

		if (var1.field4224 != null) {
			this.field4224 = new byte[var1.field4224.length][];

			for (var2 = 0; var2 < var1.field4224.length; ++var2) {
				this.field4224[var2] = new byte[var1.field4224[var2].length];
				System.arraycopy(var1.field4224[var2], 0, this.field4224[var2], 0, var1.field4224[var2].length);
			}
		}

		this.field4220 = this.method7933(var1.field4220);
		this.field4233 = this.method7933(var1.field4233);
		this.dataText = var1.dataText;
		this.actions = (String[])((String[])this.method8063(var1.actions));
		if (var1.field4229 != null) {
			this.field4229 = new String[var1.field4229.length][];

			for (var2 = 0; var2 < var1.field4229.length; ++var2) {
				this.field4229[var2] = new String[var1.field4229[var2].length];
				System.arraycopy(var1.field4229[var2], 0, this.field4229[var2], 0, var1.field4229[var2].length);
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
		this.field4302 = var1.field4302;
		this.onScroll = var1.onScroll;
		this.onChatTransmit = var1.onChatTransmit;
		this.onKey = var1.onKey;
		this.field4261 = var1.field4261;
		this.field4159 = var1.field4159;
		this.onFriendTransmit = var1.onFriendTransmit;
		this.onClanTransmit = var1.onClanTransmit;
		this.field4280 = var1.field4280;
		this.field4266 = var1.field4266;
		this.onMiscTransmit = var1.onMiscTransmit;
		this.onDialogAbort = var1.onDialogAbort;
		this.onSubChange = var1.onSubChange;
		this.onResize = var1.onResize;
		this.onStockTransmit = var1.onStockTransmit;
		this.field4273 = var1.field4273;
		this.field4176 = var1.field4176;
		this.cs1Instructions = var1.cs1Instructions;
		this.cs1Comparisons = this.method7933(var1.cs1Comparisons);
		this.cs1ComparisonValues = this.method7933(var1.cs1ComparisonValues);
		this.mouseOverRedirect = var1.mouseOverRedirect;
		this.field4298 = var1.field4298;
		this.buttonText = var1.buttonText;
		this.itemIds = this.method7933(var1.itemIds);
		this.itemQuantities = this.method7933(var1.itemQuantities);
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

		this.field4265 = var1.field4265;
		this.field4171 = var1.field4171;
		this.field4289 = var1.field4289;
		this.field4290 = var1.field4290;
		this.field4287 = var1.field4287;
		this.field4292 = var1.field4292;
		this.rootIndex = var1.rootIndex;
		this.cycle = var1.cycle;
		this.field4295 = this.method7933(var1.field4295);
		this.noClickThrough = var1.noClickThrough;
		this.noScrollThrough = var1.noScrollThrough;
		this.prioritizeMenuEntry = var1.prioritizeMenuEntry;
		if (var1.field4301 > 0) {
			this.field4186 = this.method7933(var1.field4186);
			this.field4305 = this.method8063(var1.field4305);
			this.field4301 = var1.field4301;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;B)[Ljava/lang/Object;",
		garbageValue = "121"
	)
	Object[] method8063(Object[] var1) {
		return var1 != null ? Arrays.copyOf(var1, var1.length) : null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([II)[I",
		garbageValue = "-986510815"
	)
	int[] method7933(int[] var1) {
		return var1 != null ? Arrays.copyOf(var1, var1.length) : null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lwb;B)V",
		garbageValue = "-22"
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
			this.color = var1.readShortSmart();
		}

		if (this.type == 3 || this.type == 4) {
			this.color2 = var1.readShortSmart();
			this.mouseOverColor = var1.readShortSmart();
			this.mouseOverColor2 = var1.readShortSmart();
		}

		if (this.type == 5) {
			this.spriteId2 = var1.readShortSmart();
			this.spriteId = var1.readShortSmart();
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
			this.field4298 = var1.readStringCp1252NullTerminated();
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "-1872037814"
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
			this.spriteId2 = var1.readShortSmart();
			this.spriteAngle = var1.readUnsignedShort();
			this.spriteTiling = var1.readUnsignedByte() == 1;
			this.transparencyTop = var1.readUnsignedByte();
			this.outline = var1.readUnsignedByte();
			this.spriteShadow = var1.readShortSmart();
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
				this.field4152 = var1.readUnsignedShort();
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
			this.color = var1.readShortSmart();
		}

		if (this.type == 3) {
			this.color = var1.readShortSmart();
			this.fill = var1.readUnsignedByte() == 1;
			this.transparencyTop = var1.readUnsignedByte();
		}

		if (this.type == 9) {
			this.lineWid = var1.readUnsignedByte();
			this.color = var1.readShortSmart();
			this.field4182 = var1.readUnsignedByte() == 1;
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
		descriptor = "(Lwb;I)V",
		garbageValue = "1692648137"
	)
	void method7935(Buffer var1) {
		this.field4257 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lwb;B)[Ljava/lang/Object;",
		garbageValue = "26"
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
					var3[var4] = new Integer(var1.readShortSmart());
				} else if (var5 == 1) {
					var3[var4] = var1.readStringCp1252NullTerminated();
				}
			}

			this.hasListener = true;
			return var3;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)[I",
		garbageValue = "2011880333"
	)
	@Export("readListenerTriggers")
	int[] readListenerTriggers(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 == 0) {
			return null;
		} else {
			int[] var3 = new int[var2];

			for (int var4 = 0; var4 < var2; ++var4) {
				var3[var4] = var1.readShortSmart();
			}

			return var3;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lns;ZLel;I)Lxt;",
		garbageValue = "525804673"
	)
	@Export("getSprite")
	public SpritePixels getSprite(WidgetDefinition var1, boolean var2, UrlRequester var3) {
		field4142 = false;
		if (this.field4185 != null) {
			SpritePixels var4 = this.method8050(var1, var3);
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
				var7 = SoundCache.SpriteBuffer_getSprite(var1.field4034, var8, 0);
				if (var7 == null) {
					field4142 = true;
					return null;
				} else {
					this.method8092(var7);
					var1.Widget_cachedSprites.put(var7, var5);
					return var7;
				}
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lns;Lel;I)Lxt;",
		garbageValue = "-1458894014"
	)
	SpritePixels method8050(WidgetDefinition var1, UrlRequester var2) {
		if (!this.method7941()) {
			return this.method7940(var1, var2);
		} else {
			String var3 = this.field4185 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow;
			SpritePixels var4 = (SpritePixels)var1.field4041.method9819(var3);
			if (var4 == null) {
				SpritePixels var5 = this.method7940(var1, var2);
				if (var5 != null) {
					var4 = var5.method11695();
					this.method8092(var4);
					var1.field4041.method9834(var3, var4);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lns;Lel;B)Lxt;",
		garbageValue = "-112"
	)
	SpritePixels method7940(WidgetDefinition var1, UrlRequester var2) {
		if (this.field4185 != null && var2 != null) {
			class363 var3 = (class363)var1.field4040.method9819(this.field4185);
			if (var3 == null) {
				var3 = new class363(this.field4185, var2);
				var1.field4040.method9834(this.field4185, var3);
			}

			return var3.method7519();
		} else {
			return null;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-285675662"
	)
	boolean method7941() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lxt;I)V",
		garbageValue = "-1066997096"
	)
	void method8092(SpritePixels var1) {
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lns;I)Lrv;",
		garbageValue = "-1510649592"
	)
	@Export("getFont")
	public Font getFont(WidgetDefinition var1) {
		field4142 = false;
		if (this.fontId == -1) {
			return null;
		} else {
			Font var2 = (Font)var1.Widget_cachedFonts.get((long)this.fontId);
			if (var2 != null) {
				return var2;
			} else {
				AbstractArchive var4 = var1.field4034;
				AbstractArchive var5 = var1.field4039;
				int var6 = this.fontId;
				Font var3;
				if (!class587.method11132(var4, var6, 0)) {
					var3 = null;
				} else {
					byte[] var8 = var5.takeFile(var6, 0);
					Font var7;
					if (var8 == null) {
						var7 = null;
					} else {
						Font var9 = new Font(var8, LoginPacket.SpriteBuffer_xOffsets, class191.SpriteBuffer_yOffsets, class255.SpriteBuffer_spriteWidths, FriendLoginUpdate.field5390, TriBool.SpriteBuffer_spritePalette, SpriteBufferProperties.SpriteBuffer_pixels);
						class388.method8205();
						var7 = var9;
					}

					var3 = var7;
				}

				if (var3 != null) {
					var1.Widget_cachedFonts.put(var3, (long)this.fontId);
				} else {
					field4142 = true;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lns;Lij;IZLoz;Lhh;Lhq;I)Ljn;",
		garbageValue = "-1709576773"
	)
	@Export("getModel")
	public Model getModel(WidgetDefinition var1, SequenceDefinition var2, int var3, boolean var4, PlayerComposition var5, NPCComposition var6, NpcOverrides var7) {
		field4142 = false;
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
				var10 |= var7.field2093 << 20;
			}

			Model var12 = (Model)var1.Widget_cachedModels.get(var10);
			if (var12 == null) {
				ModelData var13 = null;
				int var14 = 64;
				int var15 = 768;
				switch(var8) {
				case 1:
					var13 = ModelData.ModelData_get(var1.field4031, var9, 0);
					break;
				case 2:
					var13 = var6.method4377((NpcOverrides)null);
					break;
				case 3:
					var13 = var5 != null ? var5.getModelData() : null;
					break;
				case 4:
					ItemComposition var16 = AttackOption.ItemDefinition_get(var9);
					var13 = var16.getModelData(10);
					var14 += var16.ambient;
					var15 += var16.contrast * 5;
				case 5:
				default:
					break;
				case 6:
					var13 = var6.method4377(var7);
				}

				if (var13 == null) {
					field4142 = true;
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lns;ZI)Lnq;",
		garbageValue = "-1469141866"
	)
	public SpriteMask method8005(WidgetDefinition var1, boolean var2) {
		if (this.spriteId == -1) {
			var2 = false;
		}

		int var3 = var2 ? this.spriteId : this.spriteId2;
		if (var3 == -1) {
			return null;
		} else {
			long var4 = ((this.spriteFlipH ? 1L : 0L) << 39) + ((long)this.outline << 36) + (long)var3 + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.spriteShadow << 40);
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1397387715"
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;I)V",
		garbageValue = "-2143835826"
	)
	public void method7947(int var1, int var2, String var3) {
		if (this.field4229 == null || this.field4229.length <= var1) {
			String[][] var4 = new String[var1 + 1][];
			if (this.field4229 != null) {
				System.arraycopy(this.field4229, 0, var4, 0, this.field4229.length);
			}

			this.field4229 = var4;
		}

		if (this.field4229[var1] == null || this.field4229[var1].length <= var2) {
			String[] var5 = new String[var2 + 1];
			if (this.field4229[var1] != null) {
				System.arraycopy(this.field4229[var1], 0, var5, 0, this.field4229[var1].length);
			}

			this.field4229[var1] = var5;
		}

		this.field4229[var1][var2] = var3;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-915947143"
	)
	public boolean method7948() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1570467604"
	)
	public boolean method7945() {
		return this.type == 11 || this.type == 12;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "1465774422"
	)
	public Object method8004(int var1, Object var2) {
		for (int var3 = 0; var3 < this.field4301; ++var3) {
			if (this.field4186[var3] == var1) {
				return this.field4305[var3];
			}
		}

		return var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "0"
	)
	public int method7951(int var1, int var2) {
		for (int var3 = 0; var3 < this.field4301; ++var3) {
			if (this.field4186[var3] == var1) {
				return (Integer)this.field4305[var3];
			}
		}

		return var2;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "1914897270"
	)
	public void method7952(int var1, Object var2) {
		for (int var3 = 0; var3 < this.field4301; ++var3) {
			if (this.field4186[var3] == var1) {
				this.field4305[var3] = var2;
				return;
			}
		}

		if (this.field4305 == null) {
			this.field4186 = new int[4];
			this.field4305 = new Object[4];
		} else if (this.field4305.length == this.field4301) {
			this.field4186 = Arrays.copyOf(this.field4186, this.field4186.length * 2);
			this.field4305 = Arrays.copyOf(this.field4305, this.field4305.length * 2);
		}

		this.field4186[this.field4301] = var1;
		this.field4305[this.field4301] = var2;
		++this.field4301;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Lel;J)V"
	)
	public void method8012(String var1, String var2, UrlRequester var3, long var4) {
		if (this.type == 11 && -1L != var4) {
			var1 = var1.replaceAll("%userid%", Long.toString(var4));
			this.field4306 = new class256();
			if (!this.field4306.method5872(var1, var2, var3)) {
				this.field4306 = null;
			} else {
				if (this.field4299 == null || this.field4300 == null) {
					this.method7956();
				}

			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lel;I)V",
		garbageValue = "-1978289823"
	)
	public void method7932(String var1, String var2, String var3, String var4, String var5, UrlRequester var6) {
		this.field4306 = new class256();
		if (!this.field4306.method5872(var1, var3, var6)) {
			this.field4306 = null;
		} else {
			if (this.field4299 == null || this.field4300 == null) {
				this.method7956();
			}

			this.field4306.method5818(var2, var4, var5);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lel;B)V",
		garbageValue = "56"
	)
	public void method8057(String var1, UrlRequester var2) {
		if (this.type == 11 && var1 != null) {
			this.field4306 = new class256();
			this.field4306.method5832(var1, var2);
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1913654717"
	)
	void method7956() {
		this.field4299 = new HashMap();
		this.field4300 = new HashMap();
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "201"
	)
	public void method7957(int var1, int var2) {
		if (this.type == 11) {
			if (this.field4299 == null) {
				this.method7956();
			}

			this.field4299.put(var1, var2);
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-2086631117"
	)
	public void method8056(String var1, int var2) {
		if (this.type == 11) {
			if (this.field4300 == null) {
				this.method7956();
			}

			this.field4300.put(var1, var2);
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "-1454152511"
	)
	public boolean method7959(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field4306 != null && this.method8100()) {
			var1 -= var3;
			var2 -= var4;
			int var5 = (int)(this.field4306.method5844()[0] * (float)(this.width * 469894397));
			int var6 = (int)(this.field4306.method5844()[1] * (float)(this.height * 1156037777));
			int var7 = var5 + (int)(this.field4306.method5844()[2] * (float)(469894397 * this.width));
			int var8 = var6 + (int)(this.field4306.method5844()[3] * (float)(1156037777 * this.height));
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "42"
	)
	public boolean method8100() {
		return this.field4303 == 2;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-949988151"
	)
	public int method7961(String var1) {
		return this.type == 11 && this.field4306 != null && this.method8100() ? this.field4306.method5828(var1) : -1;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1851666390"
	)
	public String method7962(String var1) {
		return this.type == 11 && this.field4306 != null && this.method8100() ? this.field4306.method5873(var1) : null;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2115383323"
	)
	public int method7963() {
		return this.field4300 != null && !this.field4300.isEmpty() ? 1 : 0;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2011880333"
	)
	public int method7964() {
		if (this.type == 11 && this.field4306 != null && this.field4300 != null && !this.field4300.isEmpty()) {
			String var1 = this.field4306.method5827();
			return var1 != null && this.field4300.containsKey(this.field4306.method5827()) ? (Integer)this.field4300.get(var1) : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-770992961"
	)
	public String method7965() {
		if (this.type == 11 && this.field4306 != null) {
			String var1 = this.field4306.method5827();
			Iterator var2 = this.field4306.method5820().iterator();

			while (var2.hasNext()) {
				class270 var3 = (class270)var2.next();
				String var4 = String.format("%%%S%%", var3.method6057());
				if (var3.vmethod6058() == 0) {
					var1.replaceAll(var4, Integer.toString(var3.vmethod6060()));
				} else {
					var1.replaceAll(var4, var3.vmethod6059());
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
		garbageValue = "810064612"
	)
	public int[] method7966() {
		if (this.type == 11 && this.field4306 != null) {
			int[] var1 = new int[3];
			int var2 = 0;
			Iterator var3 = this.field4306.method5820().iterator();

			while (var3.hasNext()) {
				class270 var4 = (class270)var3.next();
				if (!var4.method6057().equals("user_id")) {
					if (var4.vmethod6058() != 0) {
						return null;
					}

					var1[var2++] = var4.vmethod6060();
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

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(B)Ljo;",
		garbageValue = "105"
	)
	public class256 method7967() {
		return this.field4306;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Lns;Lel;B)Z",
		garbageValue = "9"
	)
	public boolean method7968(WidgetDefinition var1, UrlRequester var2) {
		if (this.type == 11 && this.field4306 != null) {
			this.field4306.method5819(var2);
			if (this.field4306.method5853() != this.field4303) {
				this.field4303 = this.field4306.method5853();
				if (this.field4303 >= 3) {
					return true;
				}

				if (this.field4303 == 2) {
					this.method8046(var1);
					return true;
				}
			}

			return false;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lns;I)V",
		garbageValue = "2072951147"
	)
	void method8046(WidgetDefinition var1) {
		this.noClickThrough = true;
		ArrayList var2 = this.field4306.method5824();
		ArrayList var3 = this.field4306.method5817();
		int var4 = var2.size() + var3.size();
		this.children = new Widget[var4];
		int var5 = 0;

		Iterator var6;
		Widget var8;
		for (var6 = var2.iterator(); var6.hasNext(); this.children[var5++] = var8) {
			class257 var7 = (class257)var6.next();
			var8 = class328.method7045(5, this, var5, 0, 0, 0, 0, var7.field3086);
			var8.field4185 = var7.field3088.method3527();
			class363 var9 = new class363(var7.field3088);
			var1.field4040.method9834(var8.field4185, var9);
		}

		for (var6 = var3.iterator(); var6.hasNext(); this.children[var5++] = var8) {
			class268 var10 = (class268)var6.next();
			var8 = class328.method7045(4, this, var5, 0, 0, 0, 0, var10.field3178);
			var8.text = var10.field3173;
			var8.fontId = (Integer)this.field4299.get(var10.field3177);
			var8.textXAlignment = var10.field3175;
			var8.textYAlignment = var10.field3176;
		}

	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1624369331"
	)
	public void method7970() {
		this.field4155 = new class364();

		for (int var1 = 1; var1 <= 12; ++var1) {
			this.field4155.field4071.method417(var1, 0);
		}

		for (char var2 = 0; var2 < ' '; ++var2) {
			this.field4155.field4071.method418(var2, 0);
		}

		this.field4155.field4071.method418('\u0080', 0);
		this.field4155.field4071.method417(82, 2);
		this.field4155.field4071.method417(81, 2);
		this.field4155.field4071.method417(86, 2);
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)Loq;",
		garbageValue = "-871378038"
	)
	public class366 method7971() {
		return this.field4155 != null ? this.field4155.field4066 : null;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)Lnp;",
		garbageValue = "-302089969"
	)
	public class360 method8088() {
		return this.field4155 != null ? this.field4155.field4065 : null;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)Lbu;",
		garbageValue = "1020557716"
	)
	public class28 method7973() {
		return this.field4155 != null ? this.field4155.field4071 : null;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(B)Loj;",
		garbageValue = "-71"
	)
	public class364 method7974() {
		return this.field4155;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Loq;I)Z",
		garbageValue = "-1695164958"
	)
	boolean method7975(class366 var1) {
		boolean var2 = false;
		if (this.text != null && !this.text.isEmpty()) {
			var2 |= var1.method7607(GrandExchangeEvent.method8505(this.text));
			this.text = "";
		}

		if (this.text2 != null && !this.text2.isEmpty()) {
			var2 |= var1.method7817(GrandExchangeEvent.method8505(this.text2));
			this.text2 = "";
		}

		return var2;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Lns;I)Z",
		garbageValue = "-859036667"
	)
	public boolean method8091(WidgetDefinition var1) {
		class366 var2 = this.method7971();
		if (var2 == null) {
			return false;
		} else {
			boolean var3 = false;
			if (!var2.method7658() && this.fontId != -1) {
				int var4 = var2.method7792();
				int var5 = var2.method7660();
				int var6 = var2.method7857();
				int var7 = var2.method7656();
				Font var8 = this.getFont(var1);
				if (var8 != null) {
					var3 |= var2.method7746(var8);
					var3 |= this.method7975(var2);
					var3 |= var2.method7859(var4, var5);
					var3 |= var2.method7604(var6, var7);
				}
			} else if (var2.method7658()) {
				var3 |= this.method7975(var2);
			}

			var2.method7611();
			return var3;
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Loz;ZI)V",
		garbageValue = "-1676926946"
	)
	public void method7977(PlayerComposition var1, boolean var2) {
		this.modelType = 7;
		this.field4206 = new PlayerComposition(var1);
		if (!var2) {
			this.field4206.equipment = Arrays.copyOf(this.field4206.field4080, this.field4206.field4080.length);
			this.field4206.method7525();
		}

	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZB)I",
		garbageValue = "-57"
	)
	static int method8101(int var0, Script var1, boolean var2) {
		if (var0 == 6809) {
			int var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
			ObjectComposition var4 = ModeWhere.getObjectDefinition(var3);
			Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var4 != null ? var4.name : "";
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1219856131"
	)
	static void method8102() {
		Client.menu.menuOptionsCount = 0;
		Client.isMenuOpen = false;
	}
}
