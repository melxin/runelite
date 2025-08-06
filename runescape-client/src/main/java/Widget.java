import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ox")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("bv")
	public static boolean field4064;
	@ObfuscatedName("bx")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1992961173
	)
	@Export("id")
	public int id;
	@ObfuscatedName("bf")
	@Export("childIndex")
	@ObfuscatedGetter(
		intValue = -64977777
	)
	public int childIndex;
	@ObfuscatedName("bc")
	String field4206;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1300290173
	)
	@Export("type")
	public int type;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -847669731
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -690426589
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 660959261
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1334640743
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 2028728385
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1400064963
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1533387487
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -862646157
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1849975769
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1775686491
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1685529277
	)
	@Export("x")
	public int x;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1382257165
	)
	@Export("y")
	public int y;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -540565877
	)
	@Export("width")
	public int width;
	@ObfuscatedName("cs")
	@Export("height")
	@ObfuscatedGetter(
		intValue = -1326764757
	)
	public int height;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 315259953
	)
	public int field4084;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -1947934921
	)
	public int field4085;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -8451855
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -502912513
	)
	public int field4117;
	@ObfuscatedName("cm")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -1983617125
	)
	public int field4148;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -32189175
	)
	public int field4090;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -221183769
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -58877143
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 2092449415
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -1336709509
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -1766903527
	)
	@Export("color")
	public int color;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -466734897
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -1361785331
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 474903355
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("cb")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lxh;"
	)
	@Export("fillMode")
	public class599 fillMode;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1986507341
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 975068161
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -420118651
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("ca")
	public boolean field4109;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1958991541
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 644614147
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("cf")
	public String field4069;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -516211205
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("do")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = 1796173045
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -1475932345
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("ds")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("dk")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -205925847
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 1297474565
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -541732573
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = -1698271655
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = 1442885011
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = 275848073
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = -1940378351
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = -578503125
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -1670967949
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = -1139997191
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = -648359643
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = 888631261
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -328233353
	)
	public int field4126;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = -1100893573
	)
	public int field4127;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	public PlayerComposition field4178;
	@ObfuscatedName("dm")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("dl")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = -2117727243
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = 2125747111
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("dy")
	@Export("text")
	public String text;
	@ObfuscatedName("ef")
	@Export("text2")
	public String text2;
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = -1777567141
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("eo")
	@ObfuscatedGetter(
		intValue = -676729309
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = 378779159
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("ee")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("ek")
	int[] field4139;
	@ObfuscatedName("ev")
	int[] field4140;
	@ObfuscatedName("ex")
	int[] field4150;
	@ObfuscatedName("eb")
	String[] field4062;
	@ObfuscatedName("ep")
	@ObfuscatedGetter(
		intValue = 596869997
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("eh")
	public boolean field4068;
	@ObfuscatedName("eq")
	public byte[][] field4145;
	@ObfuscatedName("en")
	public byte[][] field4146;
	@ObfuscatedName("eg")
	public int[] field4147;
	@ObfuscatedName("es")
	public int[] field4055;
	@ObfuscatedName("ez")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("eu")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("et")
	public String[][] field4151;
	@ObfuscatedName("el")
	@Export("targetPriority")
	@ObfuscatedGetter(
		intValue = 773766429
	)
	public int targetPriority;
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("ew")
	@ObfuscatedGetter(
		intValue = 592599473
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("er")
	@ObfuscatedGetter(
		intValue = -1743847673
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("ec")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("ea")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("ey")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("em")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("fc")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("fk")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("fr")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("ft")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("ff")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("fo")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("fu")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("fn")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("fa")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("fw")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("fp")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("fy")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("fb")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("fi")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("fh")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("fe")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("fd")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("fx")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("fl")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("fm")
	public Object[] field4116;
	@ObfuscatedName("fq")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("fv")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("fg")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("fs")
	public Object[] field4183;
	@ObfuscatedName("fz")
	public Object[] field4184;
	@ObfuscatedName("fj")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("gz")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("gj")
	public Object[] field4088;
	@ObfuscatedName("gl")
	public Object[] field4188;
	@ObfuscatedName("gm")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("gk")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("gh")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("gt")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("gd")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("gg")
	public Object[] field4104;
	@ObfuscatedName("go")
	public Object[] field4089;
	@ObfuscatedName("gp")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("gq")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("gb")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("gw")
	@ObfuscatedGetter(
		intValue = -107704631
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("gr")
	public String field4200;
	@ObfuscatedName("gy")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("gf")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("ga")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("gi")
	@ObfuscatedGetter(
		intValue = -23200605
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("gn")
	@ObfuscatedGetter(
		intValue = 1704537035
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("gs")
	@ObfuscatedGetter(
		intValue = 380104199
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("gu")
	@ObfuscatedGetter(
		intValue = 1288930983
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "[Lox;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("gv")
	public boolean field4166;
	@ObfuscatedName("ge")
	public boolean field4202;
	@ObfuscatedName("gc")
	@ObfuscatedGetter(
		intValue = -1357589551
	)
	public int field4211;
	@ObfuscatedName("hc")
	@ObfuscatedGetter(
		intValue = -1734303795
	)
	public int field4212;
	@ObfuscatedName("ho")
	@ObfuscatedGetter(
		intValue = -1878194455
	)
	public int field4213;
	@ObfuscatedName("hm")
	@ObfuscatedGetter(
		intValue = -1631140691
	)
	public int field4214;
	@ObfuscatedName("hh")
	@ObfuscatedGetter(
		intValue = -1518473373
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("ha")
	@ObfuscatedGetter(
		intValue = 817168159
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("hv")
	public int[] field4181;
	@ObfuscatedName("hl")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("hp")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("hw")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;
	@ObfuscatedName("hf")
	HashMap field4221;
	@ObfuscatedName("hn")
	HashMap field4095;
	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	class362 field4217;
	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "Lje;"
	)
	class254 field4224;
	@ObfuscatedName("hr")
	@ObfuscatedGetter(
		intValue = -1416211749
	)
	int field4201;
	@ObfuscatedName("hj")
	int[] field4226;
	@ObfuscatedName("hs")
	Object[] field4227;
	@ObfuscatedName("hy")
	@ObfuscatedGetter(
		intValue = -715055195
	)
	int field4228;

	static {
		field4064 = false;
	}

	public Widget() {
		this.isIf3 = false;
		this.id = -1;
		this.childIndex = -814750319;
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
		this.field4084 = 1;
		this.field4085 = 1;
		this.parentId = -1;
		this.field4117 = -1;
		this.isHidden = false;
		this.field4148 = 65535;
		this.field4090 = 0;
		this.scrollX = 0;
		this.scrollY = 0;
		this.scrollWidth = 0;
		this.scrollHeight = 0;
		this.color = 0;
		this.color2 = 0;
		this.mouseOverColor = 0;
		this.mouseOverColor2 = 0;
		this.fill = false;
		this.fillMode = class599.SOLID;
		this.transparencyTop = 0;
		this.transparencyBot = 0;
		this.lineWid = 1;
		this.field4109 = false;
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
		this.field4126 = 0;
		this.field4127 = 0;
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
		this.field4068 = false;
		this.dataText = "";
		this.targetPriority = 1517270228;
		this.parent = null;
		this.dragZoneSize = 0;
		this.dragThreshold = 0;
		this.isScrollBar = false;
		this.spellActionName = "";
		this.hasListener = false;
		this.mouseOverRedirect = -1;
		this.field4200 = "";
		this.buttonText = "Ok";
		this.itemId = -1;
		this.itemQuantity = 0;
		this.modelFrame = 0;
		this.modelFrameCycle = 0;
		this.field4166 = false;
		this.field4202 = false;
		this.field4211 = -1;
		this.field4212 = 0;
		this.field4213 = 0;
		this.field4214 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
		this.field4201 = -1;
	}

	@ObfuscatedSignature(
		descriptor = "(Lox;)V"
	)
	public Widget(Widget var1) {
		this.isIf3 = false;
		this.id = -1;
		this.childIndex = -814750319;
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
		this.field4084 = 1;
		this.field4085 = 1;
		this.parentId = -1;
		this.field4117 = -1;
		this.isHidden = false;
		this.field4148 = 65535;
		this.field4090 = 0;
		this.scrollX = 0;
		this.scrollY = 0;
		this.scrollWidth = 0;
		this.scrollHeight = 0;
		this.color = 0;
		this.color2 = 0;
		this.mouseOverColor = 0;
		this.mouseOverColor2 = 0;
		this.fill = false;
		this.fillMode = class599.SOLID;
		this.transparencyTop = 0;
		this.transparencyBot = 0;
		this.lineWid = 1;
		this.field4109 = false;
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
		this.field4126 = 0;
		this.field4127 = 0;
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
		this.field4068 = false;
		this.dataText = "";
		this.targetPriority = 1517270228;
		this.parent = null;
		this.dragZoneSize = 0;
		this.dragThreshold = 0;
		this.isScrollBar = false;
		this.spellActionName = "";
		this.hasListener = false;
		this.mouseOverRedirect = -1;
		this.field4200 = "";
		this.buttonText = "Ok";
		this.itemId = -1;
		this.itemQuantity = 0;
		this.modelFrame = 0;
		this.modelFrameCycle = 0;
		this.field4166 = false;
		this.field4202 = false;
		this.field4211 = -1;
		this.field4212 = 0;
		this.field4213 = 0;
		this.field4214 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
		this.field4201 = -1;
		this.isIf3 = var1.isIf3;
		this.id = var1.id;
		this.childIndex = var1.childIndex;
		this.field4206 = var1.field4206;
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
		this.field4084 = var1.field4084;
		this.field4085 = var1.field4085;
		this.parentId = var1.parentId;
		this.field4117 = var1.field4117;
		this.field4148 = var1.field4148;
		this.field4090 = var1.field4090;
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
		this.field4109 = var1.field4109;
		this.spriteId2 = var1.spriteId2;
		this.spriteId = var1.spriteId;
		this.field4069 = var1.field4069;
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
		this.field4126 = var1.field4126;
		this.field4127 = var1.field4127;
		if (var1.field4178 != null) {
			this.field4178 = new PlayerComposition(var1.field4178);
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
		this.field4139 = this.method8005(var1.field4139);
		this.field4140 = this.method8005(var1.field4140);
		this.field4150 = this.method8005(var1.field4150);
		this.field4062 = (String[])((String[])this.method7888(var1.field4062));
		if (var1.field4224 != null) {
			this.field4224 = new class254(var1.field4224);
		}

		this.field4201 = var1.field4201;
		this.field4221 = var1.field4221;
		if (var1.field4095 != null) {
			this.field4095 = new HashMap();
			this.field4095.putAll(var1.field4095);
		}

		this.field4217 = null;
		this.flags = var1.flags;
		this.field4068 = var1.field4068;
		int var2;
		if (var1.field4145 != null) {
			this.field4145 = new byte[var1.field4145.length][];

			for (var2 = 0; var2 < var1.field4145.length; ++var2) {
				this.field4145[var2] = new byte[var1.field4145[var2].length];
				System.arraycopy(var1.field4145[var2], 0, this.field4145[var2], 0, var1.field4145[var2].length);
			}
		}

		if (var1.field4146 != null) {
			this.field4146 = new byte[var1.field4146.length][];

			for (var2 = 0; var2 < var1.field4146.length; ++var2) {
				this.field4146[var2] = new byte[var1.field4146[var2].length];
				System.arraycopy(var1.field4146[var2], 0, this.field4146[var2], 0, var1.field4146[var2].length);
			}
		}

		this.field4147 = this.method8005(var1.field4147);
		this.field4055 = this.method8005(var1.field4055);
		this.dataText = var1.dataText;
		this.actions = (String[])((String[])this.method7888(var1.actions));
		if (var1.field4151 != null) {
			this.field4151 = new String[var1.field4151.length][];

			for (var2 = 0; var2 < var1.field4151.length; ++var2) {
				this.field4151[var2] = new String[var1.field4151[var2].length];
				System.arraycopy(var1.field4151[var2], 0, this.field4151[var2], 0, var1.field4151[var2].length);
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
		this.field4116 = var1.field4116;
		this.onScroll = var1.onScroll;
		this.onChatTransmit = var1.onChatTransmit;
		this.onKey = var1.onKey;
		this.field4183 = var1.field4183;
		this.field4184 = var1.field4184;
		this.onFriendTransmit = var1.onFriendTransmit;
		this.onClanTransmit = var1.onClanTransmit;
		this.field4088 = var1.field4088;
		this.field4188 = var1.field4188;
		this.onMiscTransmit = var1.onMiscTransmit;
		this.onDialogAbort = var1.onDialogAbort;
		this.onSubChange = var1.onSubChange;
		this.onResize = var1.onResize;
		this.onStockTransmit = var1.onStockTransmit;
		this.field4104 = var1.field4104;
		this.field4089 = var1.field4089;
		this.cs1Instructions = var1.cs1Instructions;
		this.cs1Comparisons = this.method8005(var1.cs1Comparisons);
		this.cs1ComparisonValues = this.method8005(var1.cs1ComparisonValues);
		this.mouseOverRedirect = var1.mouseOverRedirect;
		this.field4200 = var1.field4200;
		this.buttonText = var1.buttonText;
		this.itemIds = this.method8005(var1.itemIds);
		this.itemQuantities = this.method8005(var1.itemQuantities);
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

		this.field4166 = var1.field4166;
		this.field4202 = var1.field4202;
		this.field4211 = var1.field4211;
		this.field4212 = var1.field4212;
		this.field4213 = var1.field4213;
		this.field4214 = var1.field4214;
		this.rootIndex = var1.rootIndex;
		this.cycle = var1.cycle;
		this.field4181 = this.method8005(var1.field4181);
		this.noClickThrough = var1.noClickThrough;
		this.noScrollThrough = var1.noScrollThrough;
		this.prioritizeMenuEntry = var1.prioritizeMenuEntry;
		if (var1.field4228 > 0) {
			this.field4226 = this.method8005(var1.field4226);
			this.field4227 = this.method7888(var1.field4227);
			this.field4228 = var1.field4228;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)[Ljava/lang/Object;",
		garbageValue = "628947599"
	)
	Object[] method7888(Object[] var1) {
		return var1 != null ? Arrays.copyOf(var1, var1.length) : null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([IS)[I",
		garbageValue = "-2121"
	)
	int[] method8005(int[] var1) {
		return var1 != null ? Arrays.copyOf(var1, var1.length) : null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lwj;B)V",
		garbageValue = "94"
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
			this.field4200 = var1.readStringCp1252NullTerminated();
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lwj;B)V",
		garbageValue = "-26"
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
				this.field4126 = var1.readUnsignedShort();
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
			this.field4109 = var1.readUnsignedByte() == 1;
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lwj;B)V",
		garbageValue = "98"
	)
	void method7892(Buffer var1) {
		this.field4206 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lwj;B)[Ljava/lang/Object;",
		garbageValue = "86"
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)[I",
		garbageValue = "884371028"
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lnr;ZLes;B)Lxv;",
		garbageValue = "0"
	)
	@Export("getSprite")
	public SpritePixels getSprite(WidgetDefinition var1, boolean var2, UrlRequester var3) {
		field4064 = false;
		if (this.field4069 != null) {
			SpritePixels var4 = this.method7896(var1, var3);
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
			long var5 = ((long)this.spriteShadow << 40) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((this.spriteFlipV ? 1L : 0L) << 38) + ((long)this.outline << 36) + (long)var8;
			SpritePixels var7 = (SpritePixels)var1.Widget_cachedSprites.get(var5);
			if (var7 != null) {
				return var7;
			} else {
				var7 = class407.SpriteBuffer_getSprite(var1.field3943, var8, 0);
				if (var7 == null) {
					field4064 = true;
					return null;
				} else {
					this.method7923(var7);
					var1.Widget_cachedSprites.put(var7, var5);
					return var7;
				}
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lnr;Les;B)Lxv;",
		garbageValue = "1"
	)
	SpritePixels method7896(WidgetDefinition var1, UrlRequester var2) {
		if (!this.method7984()) {
			return this.method7897(var1, var2);
		} else {
			String var3 = this.field4069 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow;
			SpritePixels var4 = (SpritePixels)var1.field3940.method9833(var3);
			if (var4 == null) {
				SpritePixels var5 = this.method7897(var1, var2);
				if (var5 != null) {
					var4 = var5.method11694();
					this.method7923(var4);
					var1.field3940.method9836(var3, var4);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lnr;Les;I)Lxv;",
		garbageValue = "1744984181"
	)
	SpritePixels method7897(WidgetDefinition var1, UrlRequester var2) {
		if (this.field4069 != null && var2 != null) {
			class361 var3 = (class361)var1.field3952.method9833(this.field4069);
			if (var3 == null) {
				var3 = new class361(this.field4069, var2);
				var1.field3952.method9836(this.field4069, var3);
			}

			return var3.method7504();
		} else {
			return null;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1782333325"
	)
	boolean method7984() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lxv;I)V",
		garbageValue = "-443875241"
	)
	void method7923(SpritePixels var1) {
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
		descriptor = "(Lnr;B)Lru;",
		garbageValue = "5"
	)
	@Export("getFont")
	public Font getFont(WidgetDefinition var1) {
		field4064 = false;
		if (this.fontId == -1) {
			return null;
		} else {
			Font var2 = (Font)var1.Widget_cachedFonts.get((long)this.fontId);
			if (var2 != null) {
				return var2;
			} else {
				var2 = WorldMapScaleHandler.method6924(var1.field3943, var1.field3944, this.fontId, 0);
				if (var2 != null) {
					var1.Widget_cachedFonts.put(var2, (long)this.fontId);
				} else {
					field4064 = true;
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lnr;Liz;IZLnn;Lhg;Lhu;B)Ljx;",
		garbageValue = "-125"
	)
	@Export("getModel")
	public Model getModel(WidgetDefinition var1, SequenceDefinition var2, int var3, boolean var4, PlayerComposition var5, NPCComposition var6, NpcOverrides var7) {
		field4064 = false;
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
				var10 |= var7.field2066 << 20;
			}

			Model var12 = (Model)var1.Widget_cachedModels.get(var10);
			if (var12 == null) {
				ModelData var13 = null;
				int var14 = 64;
				int var15 = 768;
				switch(var8) {
				case 1:
					var13 = ModelData.ModelData_get(var1.field3942, var9, 0);
					break;
				case 2:
					var13 = var6.method4309((NpcOverrides)null);
					break;
				case 3:
					var13 = var5 != null ? var5.getModelData() : null;
					break;
				case 4:
					ItemComposition var16 = ObjectComposition.ItemDefinition_get(var9);
					var13 = var16.getModelData(10);
					var14 += var16.ambient;
					var15 += var16.contrast;
				case 5:
				default:
					break;
				case 6:
					var13 = var6.method4309(var7);
				}

				if (var13 == null) {
					field4064 = true;
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lnr;ZI)Lnu;",
		garbageValue = "-1106065950"
	)
	public SpriteMask method7902(WidgetDefinition var1, boolean var2) {
		if (this.spriteId == -1) {
			var2 = false;
		}

		int var3 = var2 ? this.spriteId : this.spriteId2;
		if (var3 == -1) {
			return null;
		} else {
			long var4 = ((long)this.spriteShadow << 40) + ((long)this.outline << 36) + (long)var3 + ((this.spriteFlipV ? 1L : 0L) << 38) + ((this.spriteFlipH ? 1L : 0L) << 39);
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "8"
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
		garbageValue = "1605298331"
	)
	public void method7899(int var1, int var2, String var3) {
		if (this.field4151 == null || this.field4151.length <= var1) {
			String[][] var4 = new String[var1 + 1][];
			if (this.field4151 != null) {
				System.arraycopy(this.field4151, 0, var4, 0, this.field4151.length);
			}

			this.field4151 = var4;
		}

		if (this.field4151[var1] == null || this.field4151[var1].length <= var2) {
			String[] var5 = new String[var2 + 1];
			if (this.field4151[var1] != null) {
				System.arraycopy(this.field4151[var1], 0, var5, 0, this.field4151[var1].length);
			}

			this.field4151[var1] = var5;
		}

		this.field4151[var1][var2] = var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "48"
	)
	public boolean method8047() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1552977262"
	)
	public boolean method7906() {
		return this.type == 11 || this.type == 12;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "1796023896"
	)
	public Object method7907(int var1, Object var2) {
		for (int var3 = 0; var3 < this.field4228; ++var3) {
			if (this.field4226[var3] == var1) {
				return this.field4227[var3];
			}
		}

		return var2;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-478583514"
	)
	public int method7908(int var1, int var2) {
		for (int var3 = 0; var3 < this.field4228; ++var3) {
			if (this.field4226[var3] == var1) {
				return (Integer)this.field4227[var3];
			}
		}

		return var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;I)V",
		garbageValue = "859281649"
	)
	public void method7909(int var1, Object var2) {
		for (int var3 = 0; var3 < this.field4228; ++var3) {
			if (this.field4226[var3] == var1) {
				this.field4227[var3] = var2;
				return;
			}
		}

		if (this.field4227 == null) {
			this.field4226 = new int[4];
			this.field4227 = new Object[4];
		} else if (this.field4227.length == this.field4228) {
			this.field4226 = Arrays.copyOf(this.field4226, this.field4226.length * 2);
			this.field4227 = Arrays.copyOf(this.field4227, this.field4227.length * 2);
		}

		this.field4226[this.field4228] = var1;
		this.field4227[this.field4228] = var2;
		++this.field4228;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Les;J)V"
	)
	public void method7910(String var1, String var2, UrlRequester var3, long var4) {
		if (this.type == 11 && var4 != -1L) {
			var1 = var1.replaceAll("%userid%", Long.toString(var4));
			this.field4224 = new class254();
			if (!this.field4224.method5829(var1, var2, var3)) {
				this.field4224 = null;
			} else {
				if (this.field4221 == null || this.field4095 == null) {
					this.method7913();
				}

			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Les;I)V",
		garbageValue = "-2072404967"
	)
	public void method7911(String var1, String var2, String var3, String var4, String var5, UrlRequester var6) {
		this.field4224 = new class254();
		if (!this.field4224.method5829(var1, var3, var6)) {
			this.field4224 = null;
		} else {
			if (this.field4221 == null || this.field4095 == null) {
				this.method7913();
			}

			this.field4224.method5811(var2, var4, var5);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Les;I)V",
		garbageValue = "-150024263"
	)
	public void method7912(String var1, UrlRequester var2) {
		if (this.type == 11 && var1 != null) {
			this.field4224 = new class254();
			this.field4224.method5826(var1, var2);
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1530300820"
	)
	void method7913() {
		this.field4221 = new HashMap();
		this.field4095 = new HashMap();
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "34"
	)
	public void method8025(int var1, int var2) {
		if (this.type == 11) {
			if (this.field4221 == null) {
				this.method7913();
			}

			this.field4221.put(var1, var2);
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)V",
		garbageValue = "0"
	)
	public void method7946(String var1, int var2) {
		if (this.type == 11) {
			if (this.field4095 == null) {
				this.method7913();
			}

			this.field4095.put(var1, var2);
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "244714379"
	)
	public boolean method7967(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field4224 != null && this.method7917()) {
			var1 -= var3;
			var2 -= var4;
			int var5 = (int)(this.field4224.method5821()[0] * (float)this.width);
			int var6 = (int)(this.field4224.method5821()[1] * (float)(this.height * -1326764757));
			int var7 = var5 + (int)(this.field4224.method5821()[2] * (float)this.width);
			int var8 = var6 + (int)(this.field4224.method5821()[3] * (float)(this.height * -1326764757));
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-1"
	)
	public boolean method7917() {
		return this.field4201 == 2;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "53"
	)
	public int method7918(String var1) {
		return this.type == 11 && this.field4224 != null && this.method7917() ? this.field4224.method5808(var1) : -1;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "489160675"
	)
	public String method7887(String var1) {
		return this.type == 11 && this.field4224 != null && this.method7917() ? this.field4224.method5816(var1) : null;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int method7978() {
		return this.field4095 != null && !this.field4095.isEmpty() ? 1 : 0;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1645145589"
	)
	public int method7921() {
		if (this.type == 11 && this.field4224 != null && this.field4095 != null && !this.field4095.isEmpty()) {
			String var1 = this.field4224.method5815();
			return var1 != null && this.field4095.containsKey(this.field4224.method5815()) ? (Integer)this.field4095.get(var1) : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "44"
	)
	public String method7922() {
		if (this.type == 11 && this.field4224 != null) {
			String var1 = this.field4224.method5815();
			Iterator var2 = this.field4224.method5819().iterator();

			while (var2.hasNext()) {
				class268 var3 = (class268)var2.next();
				String var4 = String.format("%%%S%%", var3.method6041());
				if (var3.vmethod6032() == 0) {
					var1.replaceAll(var4, Integer.toString(var3.vmethod6034()));
				} else {
					var1.replaceAll(var4, var3.vmethod6033());
				}
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "773176071"
	)
	public int[] method7986() {
		if (this.type == 11 && this.field4224 != null) {
			int[] var1 = new int[3];
			int var2 = 0;
			Iterator var3 = this.field4224.method5819().iterator();

			while (var3.hasNext()) {
				class268 var4 = (class268)var3.next();
				if (!var4.method6041().equals("user_id")) {
					if (var4.vmethod6032() != 0) {
						return null;
					}

					var1[var2++] = var4.vmethod6034();
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

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)Lje;",
		garbageValue = "-1900624032"
	)
	public class254 method7924() {
		return this.field4224;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Lnr;Les;I)Z",
		garbageValue = "-1152374099"
	)
	public boolean method7925(WidgetDefinition var1, UrlRequester var2) {
		if (this.type == 11 && this.field4224 != null) {
			this.field4224.method5871(var2);
			if (this.field4224.method5813() != this.field4201) {
				this.field4201 = this.field4224.method5813();
				if (this.field4201 >= 3) {
					return true;
				}

				if (this.field4201 == 2) {
					this.method7926(var1);
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
		descriptor = "(Lnr;I)V",
		garbageValue = "1057690675"
	)
	void method7926(WidgetDefinition var1) {
		this.noClickThrough = true;
		ArrayList var2 = this.field4224.method5817();
		ArrayList var3 = this.field4224.method5818();
		int var4 = var2.size() + var3.size();
		this.children = new Widget[var4];
		int var5 = 0;

		Iterator var6;
		Widget var8;
		for (var6 = var2.iterator(); var6.hasNext(); this.children[var5++] = var8) {
			class255 var7 = (class255)var6.next();
			var8 = FaceNormal.method5365(5, this, var5, 0, 0, 0, 0, var7.field3019);
			var8.field4069 = var7.field3018.method3462();
			class361 var9 = new class361(var7.field3018);
			var1.field3952.method9836(var8.field4069, var9);
		}

		for (var6 = var3.iterator(); var6.hasNext(); this.children[var5++] = var8) {
			class266 var10 = (class266)var6.next();
			var8 = FaceNormal.method5365(4, this, var5, 0, 0, 0, 0, var10.field3098);
			var8.text = var10.field3097;
			var8.fontId = (Integer)this.field4221.get(var10.field3101);
			var8.textXAlignment = var10.field3095;
			var8.textYAlignment = var10.field3096;
		}

	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1802388368"
	)
	public void method7927() {
		this.field4217 = new class362();

		for (int var1 = 1; var1 <= 12; ++var1) {
			this.field4217.field3986.method420(var1, 0);
		}

		for (char var2 = 0; var2 < ' '; ++var2) {
			this.field4217.field3986.method442(var2, 0);
		}

		this.field4217.field3986.method442('\u0080', 0);
		this.field4217.field3986.method420(82, 2);
		this.field4217.field3986.method420(81, 2);
		this.field4217.field3986.method420(86, 2);
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)Loa;",
		garbageValue = "1809119286"
	)
	public class364 method7935() {
		return this.field4217 != null ? this.field4217.field3990 : null;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(B)Lna;",
		garbageValue = "53"
	)
	public class358 method7970() {
		return this.field4217 != null ? this.field4217.field3988 : null;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(B)Lbi;",
		garbageValue = "-61"
	)
	public class28 method8041() {
		return this.field4217 != null ? this.field4217.field3986 : null;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(B)Lnv;",
		garbageValue = "76"
	)
	public class362 method7931() {
		return this.field4217;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Loa;I)Z",
		garbageValue = "-1089160777"
	)
	boolean method7932(class364 var1) {
		boolean var2 = false;
		if (this.text != null && !this.text.isEmpty()) {
			var2 |= var1.method7582(MusicPatch.method7312(this.text));
			this.text = "";
		}

		if (this.text2 != null && !this.text2.isEmpty()) {
			var2 |= var1.method7583(MusicPatch.method7312(this.text2));
			this.text2 = "";
		}

		return var2;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lnr;B)Z",
		garbageValue = "6"
	)
	public boolean method7933(WidgetDefinition var1) {
		class364 var2 = this.method7935();
		if (var2 == null) {
			return false;
		} else {
			boolean var3 = false;
			if (!var2.method7797() && this.fontId != -1) {
				int var4 = var2.method7767();
				int var5 = var2.method7717();
				int var6 = var2.method7631();
				int var7 = var2.method7630();
				Font var8 = this.getFont(var1);
				if (var8 != null) {
					var3 |= var2.method7584(var8);
					var3 |= this.method7932(var2);
					var3 |= var2.method7589(var4, var5);
					var3 |= var2.method7601(var6, var7);
				}
			} else if (var2.method7797()) {
				var3 |= this.method7932(var2);
			}

			var2.method7691();
			return var3;
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Lnn;ZI)V",
		garbageValue = "280197993"
	)
	public void method7934(PlayerComposition var1, boolean var2) {
		this.modelType = 7;
		this.field4178 = new PlayerComposition(var1);
		if (!var2) {
			this.field4178.equipment = Arrays.copyOf(this.field4178.field3992, this.field4178.field3992.length);
			this.field4178.method7523();
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Lfh;",
		garbageValue = "-886797552"
	)
	static class144 method7998(int var0) {
		class144 var2 = AttackOption.method2762(var0);
		int var1;
		if (var2 == null) {
			var1 = 2;
		} else {
			var1 = var2.method3716() ? 0 : 1;
		}

		return var1 != 0 ? null : AttackOption.method2762(var0);
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1568016193"
	)
	static final void method8065() {
		for (PendingSpawn var0 = (PendingSpawn)class7.topLevelWorldView.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)class7.topLevelWorldView.pendingSpawns.previous()) {
			if (var0.hitpoints == -1) {
				var0.delay = 0;
				VarbitComposition.method4480(class7.topLevelWorldView, var0);
			} else {
				var0.vmethod10593();
			}
		}

	}
}
