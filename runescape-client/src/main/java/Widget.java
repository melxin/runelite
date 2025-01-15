import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("na")
@Implements("Widget")
public class Widget extends Node {
	@ObfuscatedName("aj")
	public static boolean field3868;
	@ObfuscatedName("vg")
	@ObfuscatedGetter(
		longValue = -8429515795117627941L
	)
	static long field3909;
	@ObfuscatedName("bu")
	@Export("isIf3")
	public boolean isIf3;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 2074413731
	)
	@Export("id")
	public int id;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1554046541
	)
	@Export("childIndex")
	public int childIndex;
	@ObfuscatedName("bb")
	String field3872;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -307708893
	)
	@Export("type")
	public int type;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1695334863
	)
	@Export("buttonType")
	public int buttonType;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1863322819
	)
	@Export("contentType")
	public int contentType;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1878831771
	)
	@Export("xAlignment")
	public int xAlignment;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -827055987
	)
	@Export("yAlignment")
	public int yAlignment;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1295695081
	)
	@Export("widthAlignment")
	public int widthAlignment;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1815658371
	)
	@Export("heightAlignment")
	public int heightAlignment;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -238891885
	)
	@Export("rawX")
	public int rawX;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 737569405
	)
	@Export("rawY")
	public int rawY;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -279349307
	)
	@Export("rawWidth")
	public int rawWidth;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1486081197
	)
	@Export("rawHeight")
	public int rawHeight;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -448464889
	)
	@Export("x")
	public int x;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 424966339
	)
	@Export("y")
	public int y;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 238570419
	)
	@Export("width")
	public int width;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1528330031
	)
	@Export("height")
	public int height;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1610367691
	)
	public int field3888;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 298923057
	)
	public int field4008;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 2112209473
	)
	@Export("parentId")
	public int parentId;
	@ObfuscatedName("be")
	@Export("isHidden")
	public boolean isHidden;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1838023813
	)
	@Export("scrollX")
	public int scrollX;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 850529927
	)
	@Export("scrollY")
	public int scrollY;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 575245429
	)
	@Export("scrollWidth")
	public int scrollWidth;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -1895978207
	)
	@Export("scrollHeight")
	public int scrollHeight;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 94778339
	)
	@Export("color")
	public int color;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 877544811
	)
	@Export("color2")
	public int color2;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 516625493
	)
	@Export("mouseOverColor")
	public int mouseOverColor;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -120009361
	)
	@Export("mouseOverColor2")
	public int mouseOverColor2;
	@ObfuscatedName("cg")
	@Export("fill")
	public boolean fill;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Lvb;"
	)
	@Export("fillMode")
	public FillMode fillMode;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 671833981
	)
	@Export("transparencyTop")
	public int transparencyTop;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 2072081719
	)
	@Export("transparencyBot")
	public int transparencyBot;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -491137507
	)
	@Export("lineWid")
	public int lineWid;
	@ObfuscatedName("cq")
	public boolean field3907;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -1095969399
	)
	@Export("spriteId2")
	public int spriteId2;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1889296109
	)
	@Export("spriteId")
	public int spriteId;
	@ObfuscatedName("ci")
	public String field3908;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 1641091165
	)
	@Export("spriteAngle")
	public int spriteAngle;
	@ObfuscatedName("cw")
	@Export("spriteTiling")
	public boolean spriteTiling;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -593563737
	)
	@Export("outline")
	public int outline;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -1287757995
	)
	@Export("spriteShadow")
	public int spriteShadow;
	@ObfuscatedName("cd")
	@Export("spriteFlipV")
	public boolean spriteFlipV;
	@ObfuscatedName("cv")
	@Export("spriteFlipH")
	public boolean spriteFlipH;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 32495203
	)
	@Export("modelType")
	public int modelType;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -893425207
	)
	@Export("modelId")
	public int modelId;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 1183330481
	)
	@Export("modelType2")
	int modelType2;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -243063387
	)
	@Export("modelId2")
	int modelId2;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -992365821
	)
	@Export("sequenceId")
	public int sequenceId;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 612527205
	)
	@Export("sequenceId2")
	public int sequenceId2;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -834651595
	)
	@Export("modelOffsetX")
	public int modelOffsetX;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = 802276655
	)
	@Export("modelOffsetY")
	public int modelOffsetY;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = 862496725
	)
	@Export("modelAngleX")
	public int modelAngleX;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = 421491339
	)
	@Export("modelAngleY")
	public int modelAngleY;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -752612347
	)
	@Export("modelAngleZ")
	public int modelAngleZ;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = -1730904993
	)
	@Export("modelZoom")
	public int modelZoom;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = -1126089181
	)
	public int field3927;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = -1570591585
	)
	public int field3928;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	public PlayerComposition field3924;
	@ObfuscatedName("do")
	@Export("modelOrthog")
	public boolean modelOrthog;
	@ObfuscatedName("dg")
	@Export("modelTransparency")
	public boolean modelTransparency;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 66306423
	)
	@Export("itemQuantityMode")
	public int itemQuantityMode;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = -571523933
	)
	@Export("fontId")
	public int fontId;
	@ObfuscatedName("de")
	@Export("text")
	public String text;
	@ObfuscatedName("dw")
	@Export("text2")
	public String text2;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = -445810873
	)
	@Export("textLineHeight")
	public int textLineHeight;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = -1101355927
	)
	@Export("textXAlignment")
	public int textXAlignment;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = 1347532343
	)
	@Export("textYAlignment")
	public int textYAlignment;
	@ObfuscatedName("dy")
	@Export("textShadowed")
	public boolean textShadowed;
	@ObfuscatedName("db")
	int[] field3940;
	@ObfuscatedName("du")
	int[] field3941;
	@ObfuscatedName("da")
	int[] field3942;
	@ObfuscatedName("dp")
	String[] field3943;
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	class212 field3962;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = 630542237
	)
	int field3945;
	@ObfuscatedName("dz")
	HashMap field3920;
	@ObfuscatedName("ex")
	HashMap field3947;
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	class357 field3946;
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = -582573061
	)
	@Export("flags")
	public int flags;
	@ObfuscatedName("ej")
	public boolean field3950;
	@ObfuscatedName("eg")
	public byte[][] field3861;
	@ObfuscatedName("ek")
	public byte[][] field3952;
	@ObfuscatedName("et")
	public int[] field3964;
	@ObfuscatedName("ec")
	public int[] field3864;
	@ObfuscatedName("ez")
	@Export("dataText")
	public String dataText;
	@ObfuscatedName("eb")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("en")
	public String[][] field3957;
	@ObfuscatedName("ee")
	public int field3958;
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	@Export("parent")
	public Widget parent;
	@ObfuscatedName("el")
	@ObfuscatedGetter(
		intValue = -89573721
	)
	@Export("dragZoneSize")
	public int dragZoneSize;
	@ObfuscatedName("ea")
	@ObfuscatedGetter(
		intValue = -1300260515
	)
	@Export("dragThreshold")
	public int dragThreshold;
	@ObfuscatedName("eu")
	@Export("isScrollBar")
	public boolean isScrollBar;
	@ObfuscatedName("ey")
	@Export("spellActionName")
	public String spellActionName;
	@ObfuscatedName("eh")
	@Export("hasListener")
	public boolean hasListener;
	@ObfuscatedName("ew")
	@Export("onLoad")
	public Object[] onLoad;
	@ObfuscatedName("ed")
	@Export("onClick")
	public Object[] onClick;
	@ObfuscatedName("fz")
	@Export("onClickRepeat")
	public Object[] onClickRepeat;
	@ObfuscatedName("fn")
	@Export("onRelease")
	public Object[] onRelease;
	@ObfuscatedName("fd")
	@Export("onHold")
	public Object[] onHold;
	@ObfuscatedName("fc")
	@Export("onMouseOver")
	public Object[] onMouseOver;
	@ObfuscatedName("fb")
	@Export("onMouseRepeat")
	public Object[] onMouseRepeat;
	@ObfuscatedName("fg")
	@Export("onMouseLeave")
	public Object[] onMouseLeave;
	@ObfuscatedName("ff")
	@Export("onDrag")
	public Object[] onDrag;
	@ObfuscatedName("fs")
	@Export("onDragComplete")
	public Object[] onDragComplete;
	@ObfuscatedName("fm")
	@Export("onTargetEnter")
	public Object[] onTargetEnter;
	@ObfuscatedName("fx")
	@Export("onTargetLeave")
	public Object[] onTargetLeave;
	@ObfuscatedName("fi")
	@Export("onVarTransmit")
	public Object[] onVarTransmit;
	@ObfuscatedName("fu")
	@Export("varTransmitTriggers")
	public int[] varTransmitTriggers;
	@ObfuscatedName("fq")
	@Export("onInvTransmit")
	public Object[] onInvTransmit;
	@ObfuscatedName("fr")
	@Export("invTransmitTriggers")
	public int[] invTransmitTriggers;
	@ObfuscatedName("fl")
	@Export("onStatTransmit")
	public Object[] onStatTransmit;
	@ObfuscatedName("fe")
	@Export("statTransmitTriggers")
	public int[] statTransmitTriggers;
	@ObfuscatedName("ft")
	@Export("onTimer")
	public Object[] onTimer;
	@ObfuscatedName("fa")
	@Export("onOp")
	public Object[] onOp;
	@ObfuscatedName("fk")
	public Object[] field3985;
	@ObfuscatedName("fo")
	@Export("onScroll")
	public Object[] onScroll;
	@ObfuscatedName("fp")
	@Export("onChatTransmit")
	public Object[] onChatTransmit;
	@ObfuscatedName("fh")
	@Export("onKey")
	public Object[] onKey;
	@ObfuscatedName("fw")
	public Object[] field3989;
	@ObfuscatedName("fv")
	public Object[] field3901;
	@ObfuscatedName("fj")
	@Export("onFriendTransmit")
	public Object[] onFriendTransmit;
	@ObfuscatedName("fy")
	@Export("onClanTransmit")
	public Object[] onClanTransmit;
	@ObfuscatedName("gg")
	public Object[] field3993;
	@ObfuscatedName("gn")
	public Object[] field3988;
	@ObfuscatedName("gw")
	@Export("onMiscTransmit")
	public Object[] onMiscTransmit;
	@ObfuscatedName("gc")
	@Export("onDialogAbort")
	public Object[] onDialogAbort;
	@ObfuscatedName("gb")
	@Export("onSubChange")
	public Object[] onSubChange;
	@ObfuscatedName("gq")
	@Export("onResize")
	public Object[] onResize;
	@ObfuscatedName("gr")
	@Export("onStockTransmit")
	public Object[] onStockTransmit;
	@ObfuscatedName("ga")
	public Object[] field4000;
	@ObfuscatedName("gp")
	public Object[] field4023;
	@ObfuscatedName("gy")
	@Export("cs1Instructions")
	public int[][] cs1Instructions;
	@ObfuscatedName("gt")
	@Export("cs1Comparisons")
	public int[] cs1Comparisons;
	@ObfuscatedName("gv")
	@Export("cs1ComparisonValues")
	public int[] cs1ComparisonValues;
	@ObfuscatedName("gl")
	@ObfuscatedGetter(
		intValue = -524432329
	)
	@Export("mouseOverRedirect")
	public int mouseOverRedirect;
	@ObfuscatedName("gm")
	public String field4006;
	@ObfuscatedName("gk")
	@Export("buttonText")
	public String buttonText;
	@ObfuscatedName("gd")
	@Export("itemIds")
	public int[] itemIds;
	@ObfuscatedName("go")
	@Export("itemQuantities")
	public int[] itemQuantities;
	@ObfuscatedName("gz")
	@ObfuscatedGetter(
		intValue = -1482639407
	)
	@Export("itemId")
	public int itemId;
	@ObfuscatedName("ge")
	@ObfuscatedGetter(
		intValue = -910176587
	)
	@Export("itemQuantity")
	public int itemQuantity;
	@ObfuscatedName("gs")
	@ObfuscatedGetter(
		intValue = 1481692413
	)
	@Export("modelFrame")
	public int modelFrame;
	@ObfuscatedName("gj")
	@ObfuscatedGetter(
		intValue = -966650257
	)
	@Export("modelFrameCycle")
	public int modelFrameCycle;
	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "[Lna;"
	)
	@Export("children")
	public Widget[] children;
	@ObfuscatedName("gi")
	public boolean field3959;
	@ObfuscatedName("gh")
	public boolean field4016;
	@ObfuscatedName("gf")
	@ObfuscatedGetter(
		intValue = -664324339
	)
	public int field4017;
	@ObfuscatedName("gu")
	@ObfuscatedGetter(
		intValue = -1753747975
	)
	public int field4018;
	@ObfuscatedName("hq")
	@ObfuscatedGetter(
		intValue = 1564458011
	)
	public int field4019;
	@ObfuscatedName("hg")
	@ObfuscatedGetter(
		intValue = 1391734537
	)
	public int field3954;
	@ObfuscatedName("hn")
	@ObfuscatedGetter(
		intValue = 1544756993
	)
	@Export("rootIndex")
	public int rootIndex;
	@ObfuscatedName("hx")
	@ObfuscatedGetter(
		intValue = 2000253657
	)
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("hu")
	public int[] field3953;
	@ObfuscatedName("hj")
	@Export("noClickThrough")
	public boolean noClickThrough;
	@ObfuscatedName("hp")
	@Export("noScrollThrough")
	public boolean noScrollThrough;
	@ObfuscatedName("hr")
	@Export("prioritizeMenuEntry")
	public boolean prioritizeMenuEntry;

	static {
		field3868 = false;
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
		this.field3888 = 1;
		this.field4008 = 1;
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
		this.field3907 = false;
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
		this.field3927 = 0;
		this.field3928 = 0;
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
		this.field3945 = -1;
		this.flags = 0;
		this.field3950 = false;
		this.dataText = "";
		this.field3958 = 319558396;
		this.parent = null;
		this.dragZoneSize = 0;
		this.dragThreshold = 0;
		this.isScrollBar = false;
		this.spellActionName = "";
		this.hasListener = false;
		this.mouseOverRedirect = -1;
		this.field4006 = "";
		this.buttonText = "Ok";
		this.itemId = -1;
		this.itemQuantity = 0;
		this.modelFrame = 0;
		this.modelFrameCycle = 0;
		this.field3959 = false;
		this.field4016 = false;
		this.field4017 = -1;
		this.field4018 = 0;
		this.field4019 = 0;
		this.field3954 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
	}

	@ObfuscatedSignature(
		descriptor = "(Lna;I)V"
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
		this.field3888 = 1;
		this.field4008 = 1;
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
		this.field3907 = false;
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
		this.field3927 = 0;
		this.field3928 = 0;
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
		this.field3945 = -1;
		this.flags = 0;
		this.field3950 = false;
		this.dataText = "";
		this.field3958 = 319558396;
		this.parent = null;
		this.dragZoneSize = 0;
		this.dragThreshold = 0;
		this.isScrollBar = false;
		this.spellActionName = "";
		this.hasListener = false;
		this.mouseOverRedirect = -1;
		this.field4006 = "";
		this.buttonText = "Ok";
		this.itemId = -1;
		this.itemQuantity = 0;
		this.modelFrame = 0;
		this.modelFrameCycle = 0;
		this.field3959 = false;
		this.field4016 = false;
		this.field4017 = -1;
		this.field4018 = 0;
		this.field4019 = 0;
		this.field3954 = 0;
		this.rootIndex = -1;
		this.cycle = -1;
		this.noClickThrough = false;
		this.noScrollThrough = false;
		this.prioritizeMenuEntry = false;
		this.isIf3 = var1.isIf3;
		this.id = var1.id;
		this.childIndex = var2;
		this.field3872 = var1.field3872;
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
		this.field3888 = var1.field3888;
		this.field4008 = var1.field4008;
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
		this.field3907 = var1.field3907;
		this.spriteId2 = var1.spriteId2;
		this.spriteId = var1.spriteId;
		this.field3908 = var1.field3908;
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
		this.field3927 = var1.field3927;
		this.field3928 = var1.field3928;
		if (var1.field3924 != null) {
			this.field3924 = new PlayerComposition(var1.field3924);
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
		this.field3940 = this.method7409(var1.field3940);
		this.field3941 = this.method7409(var1.field3941);
		this.field3942 = this.method7409(var1.field3942);
		this.field3943 = (String[])((String[])this.method7408(var1.field3943));
		if (var1.field3962 != null) {
			this.field3962 = new class212(var1.field3962);
		}

		this.field3945 = var1.field3945;
		this.field3920 = var1.field3920;
		if (var1.field3947 != null) {
			this.field3947 = new HashMap();
			this.field3947.putAll(var1.field3947);
		}

		this.field3946 = null;
		this.flags = var1.flags;
		this.field3950 = var1.field3950;
		int var3;
		if (var1.field3861 != null) {
			this.field3861 = new byte[var1.field3861.length][];

			for (var3 = 0; var3 < var1.field3861.length; ++var3) {
				this.field3861[var3] = new byte[var1.field3861[var3].length];
				System.arraycopy(var1.field3861[var3], 0, this.field3861[var3], 0, var1.field3861[var3].length);
			}
		}

		if (var1.field3952 != null) {
			this.field3952 = new byte[var1.field3952.length][];

			for (var3 = 0; var3 < var1.field3952.length; ++var3) {
				this.field3952[var3] = new byte[var1.field3952[var3].length];
				System.arraycopy(var1.field3952[var3], 0, this.field3952[var3], 0, var1.field3952[var3].length);
			}
		}

		this.field3964 = this.method7409(var1.field3964);
		this.field3864 = this.method7409(var1.field3864);
		this.dataText = var1.dataText;
		this.actions = (String[])((String[])this.method7408(var1.actions));
		if (var1.field3957 != null) {
			this.field3957 = new String[var1.field3957.length][];

			for (var3 = 0; var3 < var1.field3957.length; ++var3) {
				this.field3957[var3] = new String[var1.field3957[var3].length];
				System.arraycopy(var1.field3957[var3], 0, this.field3957[var3], 0, var1.field3957[var3].length);
			}
		}

		this.field3958 = var1.field3958;
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
		this.field3985 = var1.field3985;
		this.onScroll = var1.onScroll;
		this.onChatTransmit = var1.onChatTransmit;
		this.onKey = var1.onKey;
		this.field3989 = var1.field3989;
		this.field3901 = var1.field3901;
		this.onFriendTransmit = var1.onFriendTransmit;
		this.onClanTransmit = var1.onClanTransmit;
		this.field3993 = var1.field3993;
		this.field3988 = var1.field3988;
		this.onMiscTransmit = var1.onMiscTransmit;
		this.onDialogAbort = var1.onDialogAbort;
		this.onSubChange = var1.onSubChange;
		this.onResize = var1.onResize;
		this.onStockTransmit = var1.onStockTransmit;
		this.field4000 = var1.field4000;
		this.field4023 = var1.field4023;
		this.cs1Instructions = var1.cs1Instructions;
		this.cs1Comparisons = this.method7409(var1.cs1Comparisons);
		this.cs1ComparisonValues = this.method7409(var1.cs1ComparisonValues);
		this.mouseOverRedirect = var1.mouseOverRedirect;
		this.field4006 = var1.field4006;
		this.buttonText = var1.buttonText;
		this.itemIds = this.method7409(var1.itemIds);
		this.itemQuantities = this.method7409(var1.itemQuantities);
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

		this.field3959 = var1.field3959;
		this.field4016 = var1.field4016;
		this.field4017 = var1.field4017;
		this.field4018 = var1.field4018;
		this.field4019 = var1.field4019;
		this.field3954 = var1.field3954;
		this.rootIndex = var1.rootIndex;
		this.cycle = var1.cycle;
		this.field3953 = this.method7409(var1.field3953);
		this.noClickThrough = var1.noClickThrough;
		this.noScrollThrough = var1.noScrollThrough;
		this.prioritizeMenuEntry = var1.prioritizeMenuEntry;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;B)[Ljava/lang/Object;",
		garbageValue = "86"
	)
	Object[] method7408(Object[] var1) {
		return var1 != null ? Arrays.copyOf(var1, var1.length) : null;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([IB)[I",
		garbageValue = "-20"
	)
	int[] method7409(int[] var1) {
		return var1 != null ? Arrays.copyOf(var1, var1.length) : null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-2144733483"
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
			this.field4006 = var1.readStringCp1252NullTerminated();
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvy;B)V",
		garbageValue = "98"
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
				this.field3927 = var1.readUnsignedShort();
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
			this.field3907 = var1.readUnsignedByte() == 1;
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "688799447"
	)
	void method7552(Buffer var1) {
		this.field3872 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)[Ljava/lang/Object;",
		garbageValue = "1211797701"
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvy;B)[I",
		garbageValue = "-13"
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lnq;ZLez;I)Lvf;",
		garbageValue = "-1673736648"
	)
	@Export("getSprite")
	public SpritePixels getSprite(WidgetDefinition var1, boolean var2, UrlRequester var3) {
		field3868 = false;
		if (this.field3908 != null) {
			SpritePixels var4 = this.method7415(var1, var3);
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
			long var5 = ((long)this.spriteShadow << 40) + ((this.spriteFlipH ? 1L : 0L) << 39) + ((this.spriteFlipV ? 1L : 0L) << 38) + (long)var8 + ((long)this.outline << 36);
			SpritePixels var7 = (SpritePixels)var1.Widget_cachedSprites.get(var5);
			if (var7 != null) {
				return var7;
			} else {
				var7 = ChatChannel.SpriteBuffer_getSprite(var1.field3770, var8, 0);
				if (var7 == null) {
					field3868 = true;
					return null;
				} else {
					this.method7482(var7);
					var1.Widget_cachedSprites.put(var7, var5);
					return var7;
				}
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lnq;Lez;I)Lvf;",
		garbageValue = "-1401249252"
	)
	SpritePixels method7415(WidgetDefinition var1, UrlRequester var2) {
		if (!this.method7416()) {
			return this.method7525(var1, var2);
		} else {
			String var3 = this.field3908 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + this.outline + this.spriteShadow;
			SpritePixels var4 = (SpritePixels)var1.field3780.method9037(var3);
			if (var4 == null) {
				SpritePixels var5 = this.method7525(var1, var2);
				if (var5 != null) {
					var4 = var5.method10732();
					this.method7482(var4);
					var1.field3780.method9038(var3, var4);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lnq;Lez;I)Lvf;",
		garbageValue = "-793269285"
	)
	SpritePixels method7525(WidgetDefinition var1, UrlRequester var2) {
		if (this.field3908 != null && var2 != null) {
			class356 var3 = (class356)var1.field3779.method9037(this.field3908);
			if (var3 == null) {
				var3 = new class356(this.field3908, var2);
				var1.field3779.method9038(this.field3908, var3);
			}

			return var3.method7045();
		} else {
			return null;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-954042597"
	)
	boolean method7416() {
		return this.spriteFlipV || this.spriteFlipH || this.outline != 0 || this.spriteShadow != 0;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lvf;I)V",
		garbageValue = "951843692"
	)
	void method7482(SpritePixels var1) {
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lnq;B)Lqw;",
		garbageValue = "-33"
	)
	@Export("getFont")
	public Font getFont(WidgetDefinition var1) {
		field3868 = false;
		if (this.fontId == -1) {
			return null;
		} else {
			Font var2 = (Font)var1.Widget_cachedFonts.get((long)this.fontId);
			if (var2 != null) {
				return var2;
			} else {
				AbstractArchive var4 = var1.field3770;
				AbstractArchive var5 = var1.field3767;
				int var6 = this.fontId;
				Font var3;
				if (!WorldMapSprite.method6397(var4, var6, 0)) {
					var3 = null;
				} else {
					byte[] var8 = var5.takeFile(var6, 0);
					Font var7;
					if (var8 == null) {
						var7 = null;
					} else {
						Font var9 = new Font(var8, class241.SpriteBuffer_xOffsets, SpriteBufferProperties.SpriteBuffer_yOffsets, SpriteBufferProperties.SpriteBuffer_spriteWidths, class403.SpriteBuffer_spriteHeights, KeyHandler.SpriteBuffer_spritePalette, class240.SpriteBuffer_pixels);
						class241.SpriteBuffer_xOffsets = null;
						SpriteBufferProperties.SpriteBuffer_yOffsets = null;
						SpriteBufferProperties.SpriteBuffer_spriteWidths = null;
						class403.SpriteBuffer_spriteHeights = null;
						KeyHandler.SpriteBuffer_spritePalette = null;
						class240.SpriteBuffer_pixels = null;
						var7 = var9;
					}

					var3 = var7;
				}

				if (var3 != null) {
					var1.Widget_cachedFonts.put(var3, (long)this.fontId);
				} else {
					field3868 = true;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lnq;Lkb;IZLny;Ljz;Ljs;B)Lhv;",
		garbageValue = "5"
	)
	@Export("getModel")
	public Model getModel(WidgetDefinition var1, SequenceDefinition var2, int var3, boolean var4, PlayerComposition var5, NPCComposition var6, NpcOverrides var7) {
		field3868 = false;
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
				var10 |= var7.field2613 << 20;
			}

			Model var12 = (Model)var1.Widget_cachedModels.get(var10);
			if (var12 == null) {
				ModelData var13 = null;
				int var14 = 64;
				int var15 = 768;
				switch(var8) {
				case 1:
					var13 = ModelData.ModelData_get(var1.field3769, var9, 0);
					break;
				case 2:
					var13 = var6.method5342((NpcOverrides)null);
					break;
				case 3:
					var13 = var5 != null ? var5.getModelData() : null;
					break;
				case 4:
					ItemComposition var16 = FaceNormal.ItemDefinition_get(var9);
					var13 = var16.getModelData(10);
					var14 += var16.ambient;
					var15 += var16.contrast;
				case 5:
				default:
					break;
				case 6:
					var13 = var6.method5342(var7);
				}

				if (var13 == null) {
					field3868 = true;
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lnq;ZI)Lnf;",
		garbageValue = "462192621"
	)
	public SpriteMask method7446(WidgetDefinition var1, boolean var2) {
		if (this.spriteId == -1) {
			var2 = false;
		}

		int var3 = var2 ? this.spriteId : this.spriteId2;
		if (var3 == -1) {
			return null;
		} else {
			long var4 = ((long)this.spriteShadow << 40) + ((this.spriteFlipH ? 1L : 0L) << 39) + (long)var3 + ((long)this.outline << 36) + ((this.spriteFlipV ? 1L : 0L) << 38);
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "63"
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;I)V",
		garbageValue = "-138100882"
	)
	public void method7498(int var1, int var2, String var3) {
		if (this.field3957 == null || this.field3957.length <= var1) {
			String[][] var4 = new String[var1 + 1][];
			if (this.field3957 != null) {
				System.arraycopy(this.field3957, 0, var4, 0, this.field3957.length);
			}

			this.field3957 = var4;
		}

		if (this.field3957[var1] == null || this.field3957[var1].length <= var2) {
			String[] var5 = new String[var2 + 1];
			if (this.field3957[var1] != null) {
				System.arraycopy(this.field3957[var1], 0, var5, 0, this.field3957[var1].length);
			}

			this.field3957[var1] = var5;
		}

		this.field3957[var1][var2] = var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2029704733"
	)
	public boolean method7424() {
		return !this.isIf3 || this.type == 0 || this.type == 11 || this.hasListener || this.contentType == 1338 || this.type == 12;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-117"
	)
	public boolean method7425() {
		return this.type == 11 || this.type == 12;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Lez;J)V"
	)
	public void method7426(String var1, String var2, UrlRequester var3, long var4) {
		if (this.type == 11 && -1L != var4) {
			var1 = var1.replaceAll("%userid%", Long.toString(var4));
			this.field3962 = new class212();
			if (!this.field3962.method4862(var1, var2, var3)) {
				this.field3962 = null;
			} else {
				if (this.field3920 == null || this.field3947 == null) {
					this.method7421();
				}

			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lez;B)V",
		garbageValue = "116"
	)
	public void method7427(String var1, String var2, String var3, String var4, String var5, UrlRequester var6) {
		this.field3962 = new class212();
		if (!this.field3962.method4862(var1, var3, var6)) {
			this.field3962 = null;
		} else {
			if (this.field3920 == null || this.field3947 == null) {
				this.method7421();
			}

			this.field3962.method4842(var2, var4, var5);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lez;B)V",
		garbageValue = "40"
	)
	public void method7428(String var1, UrlRequester var2) {
		if (this.type == 11 && var1 != null) {
			this.field3962 = new class212();
			this.field3962.method4857(var1, var2);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-781294477"
	)
	void method7421() {
		this.field3920 = new HashMap();
		this.field3947 = new HashMap();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1544918859"
	)
	public void method7521(int var1, int var2) {
		if (this.type == 11) {
			if (this.field3920 == null) {
				this.method7421();
			}

			this.field3920.put(var1, var2);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-795200663"
	)
	public void method7546(String var1, int var2) {
		if (this.type == 11) {
			if (this.field3947 == null) {
				this.method7421();
			}

			this.field3947.put(var1, var2);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "140898868"
	)
	public boolean method7432(int var1, int var2, int var3, int var4) {
		if (this.type == 11 && this.field3962 != null && this.method7433()) {
			var1 -= var3;
			var2 -= var4;
			int var5 = (int)(this.field3962.method4852()[0] * (float)this.width);
			int var6 = (int)(this.field3962.method4852()[1] * (float)(this.height * -1528330031));
			int var7 = var5 + (int)(this.field3962.method4852()[2] * (float)this.width);
			int var8 = var6 + (int)(this.field3962.method4852()[3] * (float)(this.height * -1528330031));
			return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-110085272"
	)
	public boolean method7433() {
		return this.field3945 == 2;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "102"
	)
	public int method7465(String var1) {
		return this.type == 11 && this.field3962 != null && this.method7433() ? this.field3962.method4846(var1) : -1;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1447744598"
	)
	public String method7548(String var1) {
		return this.type == 11 && this.field3962 != null && this.method7433() ? this.field3962.method4848(var1) : null;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1023157134"
	)
	public int method7441() {
		return this.field3947 != null && this.field3947.size() > 0 ? 1 : 0;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-34"
	)
	public int method7437() {
		if (this.type == 11 && this.field3962 != null && this.field3947 != null && !this.field3947.isEmpty()) {
			String var1 = this.field3962.method4856();
			return var1 != null && this.field3947.containsKey(this.field3962.method4856()) ? (Integer)this.field3947.get(var1) : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2138232535"
	)
	public String method7436() {
		if (this.type == 11 && this.field3962 != null) {
			String var1 = this.field3962.method4856();
			Iterator var2 = this.field3962.method4850().iterator();

			while (var2.hasNext()) {
				class226 var3 = (class226)var2.next();
				String var4 = String.format("%%%S%%", var3.method5059());
				if (var3.vmethod5060() == 0) {
					var1.replaceAll(var4, Integer.toString(var3.vmethod5064()));
				} else {
					var1.replaceAll(var4, var3.vmethod5061());
				}
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "1"
	)
	public int[] method7536() {
		if (this.type == 11 && this.field3962 != null) {
			int[] var1 = new int[3];
			int var2 = 0;
			Iterator var3 = this.field3962.method4850().iterator();

			while (var3.hasNext()) {
				class226 var4 = (class226)var3.next();
				if (!var4.method5059().equals("user_id")) {
					if (var4.vmethod5060() != 0) {
						return null;
					}

					var1[var2++] = var4.vmethod5064();
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

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)Lii;",
		garbageValue = "-1483029632"
	)
	public class212 method7440() {
		return this.field3962;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lnq;Lez;I)Z",
		garbageValue = "1160648095"
	)
	public boolean method7523(WidgetDefinition var1, UrlRequester var2) {
		if (this.type == 11 && this.field3962 != null) {
			this.field3962.method4843(var2);
			if (this.field3962.method4903() != this.field3945) {
				this.field3945 = this.field3962.method4903();
				if (this.field3945 >= 3) {
					return true;
				}

				if (this.field3945 == 2) {
					this.method7526(var1);
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
		descriptor = "(Lnq;I)V",
		garbageValue = "208997219"
	)
	void method7526(WidgetDefinition var1) {
		this.noClickThrough = true;
		ArrayList var2 = this.field3962.method4902();
		ArrayList var3 = this.field3962.method4840();
		int var4 = var2.size() + var3.size();
		this.children = new Widget[var4];
		int var5 = 0;

		Iterator var6;
		Widget var8;
		for (var6 = var2.iterator(); var6.hasNext(); this.children[var5++] = var8) {
			class213 var7 = (class213)var6.next();
			var8 = PlayerType.method7660(5, this, var5, 0, 0, 0, 0, var7.field2372);
			var8.field3908 = var7.field2373.method3308();
			class356 var9 = new class356(var7.field2373);
			var1.field3779.method9038(var8.field3908, var9);
		}

		for (var6 = var3.iterator(); var6.hasNext(); this.children[var5++] = var8) {
			class224 var10 = (class224)var6.next();
			var8 = PlayerType.method7660(4, this, var5, 0, 0, 0, 0, var10.field2447);
			var8.text = var10.field2450;
			var8.fontId = (Integer)this.field3920.get(var10.field2454);
			var8.textXAlignment = var10.field2451;
			var8.textYAlignment = var10.field2453;
		}

	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2104048213"
	)
	public void method7411() {
		this.field3946 = new class357();

		for (int var1 = 1; var1 <= 12; ++var1) {
			this.field3946.field3799.method408(var1, 0);
		}

		for (char var2 = 0; var2 < ' '; ++var2) {
			this.field3946.field3799.method407(var2, 0);
		}

		this.field3946.field3799.method407('\u0080', 0);
		this.field3946.field3799.method408(82, 2);
		this.field3946.field3799.method408(81, 2);
		this.field3946.field3799.method408(86, 2);
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(B)Lnn;",
		garbageValue = "-26"
	)
	public class359 method7444() {
		return this.field3946 != null ? this.field3946.field3801 : null;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)Lnl;",
		garbageValue = "-1682998102"
	)
	public class353 method7445() {
		return this.field3946 != null ? this.field3946.field3800 : null;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)Lbh;",
		garbageValue = "618602681"
	)
	public class27 method7535() {
		return this.field3946 != null ? this.field3946.field3799 : null;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(B)Lnk;",
		garbageValue = "42"
	)
	public class357 method7447() {
		return this.field3946;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Lnn;B)Z",
		garbageValue = "104"
	)
	boolean method7489(class359 var1) {
		boolean var2 = false;
		if (this.text != null && !this.text.isEmpty()) {
			var2 |= var1.method7131(class561.method10574(this.text));
			this.text = "";
		}

		if (this.text2 != null && !this.text2.isEmpty()) {
			var2 |= var1.method7298(class561.method10574(this.text2));
			this.text2 = "";
		}

		return var2;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Lnq;I)Z",
		garbageValue = "-1316055303"
	)
	public boolean method7449(WidgetDefinition var1) {
		class359 var2 = this.method7444();
		if (var2 == null) {
			return false;
		} else {
			boolean var3 = false;
			if (!var2.method7276() && this.fontId != -1) {
				int var4 = var2.method7167();
				int var5 = var2.method7187();
				int var6 = var2.method7184();
				int var7 = var2.method7259();
				Font var8 = this.getFont(var1);
				if (var8 != null) {
					var3 |= var2.method7242(var8);
					var3 |= this.method7489(var2);
					var3 |= var2.method7138(var4, var5);
					var3 |= var2.method7285(var6, var7);
				}
			} else if (var2.method7276()) {
				var3 |= this.method7489(var2);
			}

			var2.method7315();
			return var3;
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lny;ZI)V",
		garbageValue = "134742024"
	)
	public void method7542(PlayerComposition var1, boolean var2) {
		this.modelType = 7;
		this.field3924 = new PlayerComposition(var1);
		if (!var2) {
			this.field3924.equipment = Arrays.copyOf(this.field3924.field3814, this.field3924.field3814.length);
			this.field3924.method7061();
		}

	}
}
