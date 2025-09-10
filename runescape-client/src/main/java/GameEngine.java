import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bl")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1169396423
	)
	@Export("cycleDurationMillis")
	protected static int cycleDurationMillis;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1307172027
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1240233703
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("ao")
	protected static String field180;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lxo;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("al")
	@Export("hasFocus")
	protected static boolean hasFocus;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lbl;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -671758833
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		longValue = 3584617927767132481L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("am")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1081140069
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("ay")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -796834517
	)
	static int field189;
	@ObfuscatedName("ag")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1783679815
	)
	static int field191;
	@ObfuscatedName("aj")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	@Export("keyHandler")
	protected static KeyHandler keyHandler;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		longValue = -2203745554587028599L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		longValue = -570430037039674629L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("px")
	@ObfuscatedSignature(
		descriptor = "[Lxc;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("bi")
	@Export("eventQueue")
	final EventQueue eventQueue;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 2040231847
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1689383621
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("bb")
	protected boolean field206;
	@ObfuscatedName("bo")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -2096197807
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -1343377085
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 213583523
	)
	int field176;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -2022529849
	)
	int field210;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1165530793
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 669964059
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("bn")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("be")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("bh")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("bk")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("bp")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		longValue = 2194492845561783507L
	)
	volatile long field212;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("bj")
	@Export("clipboard")
	Clipboard clipboard;

	static {
		cycleDurationMillis = 20;
		fps = 0;
		gameEngine = null;
		GameEngine_redundantStartThreadCount = 0;
		stopTimeMs = 0L;
		isKilled = false;
		fiveOrOne = 1;
		graphicsTickTimes = new long[32];
		clientTickTimes = new long[32];
		field191 = 500;
		volatileFocus = true;
		keyHandler = new KeyHandler();
		garbageCollectorLastCollectionTime = -1L;
		garbageCollectorLastCheckTimeMs = -1L;
	}

	protected GameEngine() {
		this.field206 = false;
		this.hasErrored = false;
		this.canvasX = 0;
		this.canvasY = 0;
		this.fullRedraw = true;
		this.resizeCanvasNextFrame = false;
		this.isCanvasInvalid = false;
		this.field212 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.eventQueue = var1;
		DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider();
		class199.pcmPlayerProvider = var2;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1357739915"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
			this.method529();
		}

		this.maxCanvasWidth = var1;
		this.maxCanvasHeight = var2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;B)V",
		garbageValue = "109"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) {
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
				class164.method4001(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Lkx;",
		garbageValue = "837180285"
	)
	@Export("mouseWheel")
	protected MouseWheel mouseWheel() {
		if (this.mouseWheelHandler == null) {
			this.mouseWheelHandler = new MouseWheelHandler();
			this.mouseWheelHandler.addTo(this.canvas);
		}

		return this.mouseWheelHandler;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "97"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "63"
	)
	protected void method559(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "-535030348"
	)
	protected Clipboard method685() {
		return this.clipboard;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-281659749"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
			class27.KeyHandler_keyCodes[186] = 57;
			class27.KeyHandler_keyCodes[187] = 27;
			class27.KeyHandler_keyCodes[188] = 71;
			class27.KeyHandler_keyCodes[189] = 26;
			class27.KeyHandler_keyCodes[190] = 72;
			class27.KeyHandler_keyCodes[191] = 73;
			class27.KeyHandler_keyCodes[192] = 58;
			class27.KeyHandler_keyCodes[219] = 42;
			class27.KeyHandler_keyCodes[220] = 74;
			class27.KeyHandler_keyCodes[221] = 43;
			class27.KeyHandler_keyCodes[222] = 59;
			class27.KeyHandler_keyCodes[223] = 28;
		} else {
			class27.KeyHandler_keyCodes[44] = 71;
			class27.KeyHandler_keyCodes[45] = 26;
			class27.KeyHandler_keyCodes[46] = 72;
			class27.KeyHandler_keyCodes[47] = 73;
			class27.KeyHandler_keyCodes[59] = 57;
			class27.KeyHandler_keyCodes[61] = 27;
			class27.KeyHandler_keyCodes[91] = 42;
			class27.KeyHandler_keyCodes[92] = 74;
			class27.KeyHandler_keyCodes[93] = 43;
			class27.KeyHandler_keyCodes[192] = 28;
			class27.KeyHandler_keyCodes[222] = 58;
			class27.KeyHandler_keyCodes[520] = 59;
		}

		keyHandler.method360(this.canvas);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1761432429"
	)
	protected final void method664() {
		keyHandler.method362();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lbi;II)V",
		garbageValue = "1095860943"
	)
	protected void method547(class29 var1, int var2) {
		keyHandler.method376(var1, var2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("setUpMouse")
	protected final void setUpMouse() {
		java.awt.Canvas var1 = this.canvas;
		var1.addMouseListener(MouseHandler.MouseHandler_instance);
		var1.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var1.addFocusListener(MouseHandler.MouseHandler_instance);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2054073640"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container();
		if (var1 != null) {
			Bounds var2 = this.getFrameContentBounds();
			this.contentWidth = Math.max(var2.highX, this.field176);
			this.contentHeight = Math.max(var2.highY, this.field210);
			if (this.contentWidth <= 0) {
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) {
				this.contentHeight = 1;
			}

			canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
			class396.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
			this.canvasX = (this.contentWidth - canvasWidth) / 2;
			this.canvasY = 0;
			this.canvas.setSize(canvasWidth, class396.canvasHeight);
			rasterProvider = new RasterProvider(canvasWidth, class396.canvasHeight, this.canvas, this.field206);
			if (var1 == this.frame) {
				Insets var3 = this.frame.getInsets();
				this.canvas.setLocation(var3.left + this.canvasX, var3.top + this.canvasY);
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY);
			}

			this.fullRedraw = true;
			this.resizeGame();
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "19"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1768960839"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX;
		int var2 = this.canvasY;
		int var3 = this.contentWidth - canvasWidth - var1;
		int var4 = this.contentHeight - class396.canvasHeight - var2;
		if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
			try {
				Container var5 = this.container();
				int var6 = 0;
				int var7 = 0;
				if (var5 == this.frame) {
					Insets var8 = this.frame.getInsets();
					var6 = var8.left;
					var7 = var8.top;
				}

				Graphics var10 = var5.getGraphics();
				var10.setColor(Color.black);
				if (var1 > 0) {
					var10.fillRect(var6, var7, var1, this.contentHeight);
				}

				if (var2 > 0) {
					var10.fillRect(var6, var7, this.contentWidth, var2);
				}

				if (var3 > 0) {
					var10.fillRect(var6 + this.contentWidth - var3, var7, var3, this.contentHeight);
				}

				if (var4 > 0) {
					var10.fillRect(var6, var7 + this.contentHeight - var4, this.contentWidth, var4);
				}
			} catch (Exception var9) {
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "75"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		keyHandler.method361(this.canvas);
		class537.method10541(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.method318(this.canvas);
		}

		this.addCanvas();
		keyHandler.method360(this.canvas);
		java.awt.Canvas var1 = this.canvas;
		var1.addMouseListener(MouseHandler.MouseHandler_instance);
		var1.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var1.addFocusListener(MouseHandler.MouseHandler_instance);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method529();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1408244092"
	)
	@Export("startThread")
	protected final void startThread(int var1, int var2, int var3, int var4) {
		try {
			if (gameEngine != null) {
				++GameEngine_redundantStartThreadCount;
				if (GameEngine_redundantStartThreadCount >= 3) {
					this.error("alreadyloaded");
					return;
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				return;
			}

			gameEngine = this;
			canvasWidth = var1;
			class396.canvasHeight = var2;
			RunException.RunException_revision = var3;
			RunException.field6088 = var4;
			RunException.RunException_applet = this;
			if (UserComparator4.taskHandler == null) {
				UserComparator4.taskHandler = new TaskHandler();
			}

			UserComparator4.taskHandler.newThreadTask(this, 1);
		} catch (Exception var6) {
			class508.RunException_sendStackTrace((String)null, var6);
			this.error("crash");
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1519221307"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container();
		if (this.canvas != null) {
			this.canvas.removeFocusListener(this);
			var1.remove(this.canvas);
		}

		canvasWidth = Math.max(var1.getWidth(), this.field176);
		class396.canvasHeight = Math.max(var1.getHeight(), this.field210);
		Insets var2;
		if (this.frame != null) {
			var2 = this.frame.getInsets();
			canvasWidth -= var2.right + var2.left;
			class396.canvasHeight -= var2.top + var2.bottom;
		}

		this.canvas = new Canvas(this);
		var1.setBackground(Color.BLACK);
		var1.setLayout((LayoutManager)null);
		var1.add(this.canvas);
		this.canvas.setSize(canvasWidth, class396.canvasHeight);
		this.canvas.setVisible(true);
		this.canvas.setBackground(Color.BLACK);
		if (var1 == this.frame) {
			var2 = this.frame.getInsets();
			this.canvas.setLocation(this.canvasX + var2.left, this.canvasY + var2.top);
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY);
		}

		this.canvas.addFocusListener(this);
		this.canvas.requestFocus();
		this.fullRedraw = true;
		if (rasterProvider != null && canvasWidth == rasterProvider.width && class396.canvasHeight == rasterProvider.height) {
			((RasterProvider)rasterProvider).setComponent(this.canvas);
			rasterProvider.drawFull(0, 0);
		} else {
			rasterProvider = new RasterProvider(canvasWidth, class396.canvasHeight, this.canvas, this.field206);
		}

		this.isCanvasInvalid = false;
		this.field212 = class189.method4284();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-97086529"
	)
	protected void method523(boolean var1) {
		if (this.field206 != var1) {
			this.field206 = var1;
			rasterProvider.method11643(var1);
			rasterProvider.apply();
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1066016372"
	)
	@Export("checkHost")
	protected final boolean checkHost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase();
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) {
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) {
				if (var1.endsWith("127.0.0.1")) {
					return true;
				} else {
					while (!var1.isEmpty() && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
						var1 = var1.substring(0, var1.length() - 1);
					}

					if (var1.endsWith("192.168.1.")) {
						return true;
					} else {
						this.error("invalidhost");
						return false;
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "5"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = class189.method4284();
		long var3 = clientTickTimes[class204.field2249];
		clientTickTimes[class204.field2249] = var1;
		class204.field2249 = class204.field2249 + 1 & 31;
		if (var3 != 0L && var1 > var3) {
		}

		synchronized(this) {
			hasFocus = volatileFocus;
		}

		this.doCycle();
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	protected final void method658() {
		this.fullRedraw = true;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container();
		long var2 = class189.method4284();
		long var4 = graphicsTickTimes[field189];
		graphicsTickTimes[field189] = var2;
		field189 = field189 + 1 & 31;
		if (var4 != 0L && var2 > var4) {
			int var6 = (int)(var2 - var4);
			fps = ((var6 >> 1) + 32000) / var6;
		}

		if (++field191 - 1 > 50) {
			field191 -= 50;
			this.fullRedraw = true;
			this.canvas.setSize(canvasWidth, class396.canvasHeight);
			this.canvas.setVisible(true);
			if (var1 == this.frame) {
				Insets var7 = this.frame.getInsets();
				this.canvas.setLocation(this.canvasX + var7.left, this.canvasY + var7.top);
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY);
			}
		}

		if (this.isCanvasInvalid) {
			this.replaceCanvas();
		}

		this.method594();
		this.draw(this.fullRedraw);
		if (this.fullRedraw) {
			this.clearBackground();
		}

		this.fullRedraw = false;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	final void method594() {
		Bounds var1 = this.getFrameContentBounds();
		if (var1.highX != this.contentWidth || this.contentHeight != var1.highY || this.resizeCanvasNextFrame) {
			this.resizeCanvas();
			this.resizeCanvasNextFrame = false;
		}

	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "19458"
	)
	final void method529() {
		this.resizeCanvasNextFrame = true;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "14"
	)
	@Export("kill")
	final synchronized void kill() {
		if (!isKilled) {
			isKilled = true;

			try {
				this.canvas.removeFocusListener(this);
			} catch (Exception var5) {
			}

			try {
				this.kill0();
			} catch (Exception var4) {
			}

			if (this.frame != null) {
				try {
					System.exit(0);
				} catch (Throwable var3) {
				}
			}

			if (UserComparator4.taskHandler != null) {
				try {
					UserComparator4.taskHandler.close();
				} catch (Exception var2) {
				}
			}

			this.vmethod793();
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-746677036"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2034911949"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1798389214"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZZI)V",
		garbageValue = "762745119"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3, boolean var4) {
		try {
			Graphics var5 = this.canvas.getGraphics();
			if (EnumComposition.fontHelvetica13 == null) {
				EnumComposition.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
				class180.loginScreenFontMetrics = this.canvas.getFontMetrics(EnumComposition.fontHelvetica13);
			}

			if (var3 && !var4) {
				var5.setColor(Color.black);
				var5.fillRect(0, 0, canvasWidth, class396.canvasHeight);
			}

			Color var6 = new Color(140, 17, 17);

			try {
				if (BufferedSink.field5468 == null) {
					BufferedSink.field5468 = this.canvas.createImage(304, 34);
				}

				Graphics var7 = BufferedSink.field5468.getGraphics();
				var7.setColor(var6);
				var7.drawRect(0, 0, 303, 33);
				var7.fillRect(2, 2, var1 * 3, 30);
				var7.setColor(Color.black);
				var7.drawRect(1, 1, 301, 31);
				var7.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
				var7.setFont(EnumComposition.fontHelvetica13);
				var7.setColor(Color.white);
				var7.drawString(var2, (304 - class180.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
				var5.drawImage(BufferedSink.field5468, canvasWidth / 2 - 152, class396.canvasHeight / 2 + (var4 ? 50 : -18), (ImageObserver)null);
			} catch (Exception var10) {
				int var8 = canvasWidth / 2 - 152;
				int var9 = class396.canvasHeight / 2 - 18;
				var5.setColor(var6);
				var5.drawRect(var8, var9, 303, 33);
				var5.fillRect(var8 + 2, var9 + 2, var1 * 3, 30);
				var5.setColor(Color.black);
				var5.drawRect(var8 + 1, var9 + 1, 301, 31);
				var5.fillRect(var1 * 3 + var8 + 2, var9 + 2, 300 - var1 * 3, 30);
				var5.setFont(EnumComposition.fontHelvetica13);
				var5.setColor(Color.white);
				var5.drawString(var2, var8 + (304 - class180.loginScreenFontMetrics.stringWidth(var2)) / 2, var9 + 22);
			}
		} catch (Exception var11) {
			this.canvas.repaint();
		}

	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1411811965"
	)
	protected final void method541() {
		BufferedSink.field5468 = null;
		EnumComposition.fontHelvetica13 = null;
		class180.loginScreenFontMetrics = null;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-674505337"
	)
	@Export("error")
	protected void error(String var1) {
		if (!this.hasErrored) {
			this.hasErrored = true;
			System.out.println("error_game_" + var1);

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
			} catch (Exception var3) {
			}

		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/Container;",
		garbageValue = "17932105"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this);
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(B)Lrw;",
		garbageValue = "1"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container();
		int var2 = Math.max(var1.getWidth(), this.field176);
		int var3 = Math.max(var1.getHeight(), this.field210);
		if (this.frame != null) {
			Insets var4 = this.frame.getInsets();
			var2 -= var4.left + var4.right;
			var3 -= var4.top + var4.bottom;
		}

		return new Bounds(var2, var3);
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "12507"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "6314826"
	)
	protected abstract void vmethod793();

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) {
			this.fullRedraw = true;
			if (class189.method4284() - this.field212 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= canvasWidth && var2.height >= class396.canvasHeight) {
					this.isCanvasInvalid = true;
				}
			}

		}
	}

	public final void destroy() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = class189.method4284();
			class164.method4001(5000L);
			this.kill();
		}
	}

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) {
				String var1 = TaskHandler.javaVendor.toLowerCase();
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = BuddyRankComparator.javaVersion;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
						this.error("wrongjava");
						return;
					}

					if (var2.startsWith("1.6.0_")) {
						int var3;
						for (var3 = 6; var3 < var2.length() && class406.isDigit(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (FriendSystem.isNumber(var4) && EnumComposition.method4308(var4) < 10) {
							this.error("wrongjava");
							return;
						}
					}

					fiveOrOne = 5;
				}
			}

			this.setFocusCycleRoot(true);
			this.addCanvas();
			this.setUp();

			Object var8;
			try {
				var8 = new NanoClock();
			} catch (Throwable var6) {
				var8 = new MilliClock();
			}

			FontName.clock = (Clock)var8;

			while (0L == stopTimeMs || class189.method4284() < stopTimeMs) {
				class360.gameCyclesToDo = FontName.clock.wait(cycleDurationMillis, fiveOrOne);

				for (int var5 = 0; var5 < class360.gameCyclesToDo; ++var5) {
					this.clientTick();
				}

				this.graphicsTick();
				this.post(this.canvas);
			}
		} catch (Exception var7) {
			class508.RunException_sendStackTrace((String)null, var7);
			this.error("crash");
		}

		this.kill();
	}

	public final void start() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = 0L;
		}
	}

	public final void stop() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = class189.method4284() + 4000L;
		}
	}

	public final void update(Graphics var1) {
		this.paint(var1);
	}

	public final void windowActivated(WindowEvent var1) {
	}

	public final void windowClosed(WindowEvent var1) {
	}

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true;
		this.fullRedraw = true;
	}

	public final void windowIconified(WindowEvent var1) {
	}

	public final void windowOpened(WindowEvent var1) {
	}

	public abstract void init();

	public final void windowDeactivated(WindowEvent var1) {
	}

	public final void windowDeiconified(WindowEvent var1) {
	}

	public final void windowClosing(WindowEvent var1) {
		this.destroy();
	}

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "63"
	)
	public static int method689(int var0) {
		return var0 >> 3 & 2047;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "-672165524"
	)
	static void method684(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (class36.clientPreferences.getAreaSoundEffectsVolume() != 0 && var6 > 0 && class58.soundEffectCount < 50) {
			JagexCache.method5932(HttpHeaders.worldView.id, var1, var2, var3, var4, var5, var6, var7, false);
		}

	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZI)I",
		garbageValue = "133688325"
	)
	static int method528(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = ScriptEvent.loadWorlds() ? 1 : 0;
			return 1;
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) {
				var9 = class517.worldListStart();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
				var9 = class27.getNextWorldListWorld();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
				}

				return 1;
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
					var7 = null;

					for (var8 = 0; var8 < World.World_count; ++var8) {
						if (var3 == World.World_worlds[var8].id) {
							var7 = World.World_worlds[var8];
							break;
						}
					}

					if (var7 != null) {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
					UserComparator7.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
					boolean var10 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1] == 1;
					var8 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2];
					boolean var6 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 3] == 1;
					class172.sortWorldList(var3, var10, var8, var6);
					return 1;
				} else if (var0 != 6511) {
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
						return 1;
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) {
							UserComparator7.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
							var5 = PcmPlayer.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = class63.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = class63.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.LC_PARAM) {
							UserComparator7.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
							var5 = PcmPlayer.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = ModeWhere.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = ModeWhere.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.OC_PARAM) {
							UserComparator7.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
							var5 = PcmPlayer.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = AttackOption.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = AttackOption.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
							UserComparator7.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
							var5 = PcmPlayer.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = Sound.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Sound.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ON_MOBILE) {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Client.clientType;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
							return 1;
						} else if (var0 == 6522) {
							--Interpreter.Interpreter_objectStackSize;
							--UserComparator7.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 6523) {
							--Interpreter.Interpreter_objectStackSize;
							--UserComparator7.Interpreter_intStackSize;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == 6527) {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Client.field390;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
					if (var3 >= 0 && var3 < World.World_count) {
						var7 = World.World_worlds[var3];
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZI)I",
		garbageValue = "-107006704"
	)
	static int method686(int var0, Script var1, boolean var2) {
		return 2;
	}

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "(Ldt;IIIII)V",
		garbageValue = "65280"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPC var0, int var1, int var2, int var3, int var4) {
		NPCComposition var5 = var0.definition;
		if (Client.menu.menuOptionsCount < 400) {
			if (var5.transforms != null) {
				var5 = var5.transform();
			}

			if (var5 != null) {
				if (var5.isInteractable) {
					if (!var5.isFollower || Client.followerIndex == var1) {
						String var6 = var0.method2715();
						int var7;
						if (var5.combatLevel != 0 && var0.field1106 != 0) {
							var7 = var0.field1106 != -1 ? var0.field1106 : var5.combatLevel;
							var6 = var6 + class444.method8880(var7, HealthBarUpdate.localPlayer.combatLevel) + " " + " (" + "level-" + var7 + ")";
						}

						if (var5.lowPriorityFollowerOps && Client.followerOpsLowPriority) {
							class423.insertMenuItem("Examine", class134.colorStartTag(16776960) + var6, 1003, var1, var2, var3, -1, false, var4);
						}

						if (!ClanMate.field5394 && Client.isItemSelected == 1) {
							class423.insertMenuItem("Use", Client.field528 + " " + "->" + " " + class134.colorStartTag(16776960) + var6, 7, var1, var2, var3, -1, false, var4);
						} else if (Client.isSpellSelected) {
							if (!ClanMate.field5394 && (class337.selectedSpellFlags & 2) == 2) {
								class423.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class134.colorStartTag(16776960) + var6, 8, var1, var2, var3, -1, false, var4);
							}
						} else {
							var7 = var5.lowPriorityFollowerOps && Client.followerOpsLowPriority ? 2000 : 0;
							String[] var8 = var5.actions;
							int var9;
							int var10;
							if (var8 != null) {
								for (var9 = 4; var9 >= 0; --var9) {
									if (!ClanMate.field5394 && var0.method2718(var9) && var8[var9] != null && !var8[var9].equalsIgnoreCase("Attack")) {
										var10 = 0;
										if (var9 == 0) {
											var10 = var7 + 9;
										}

										if (var9 == 1) {
											var10 = var7 + 10;
										}

										if (var9 == 2) {
											var10 = var7 + 11;
										}

										if (var9 == 3) {
											var10 = var7 + 12;
										}

										if (var9 == 4) {
											var10 = var7 + 13;
										}

										class423.insertMenuItem(var8[var9], class134.colorStartTag(16776960) + var6, var10, var1, var2, var3, -1, false, var4);
									}
								}
							}

							if (var8 != null) {
								for (var9 = 4; var9 >= 0; --var9) {
									if (!ClanMate.field5394 && var0.method2718(var9) && var8[var9] != null && var8[var9].equalsIgnoreCase("Attack")) {
										short var11 = 0;
										if (Client.npcAttackOption != AttackOption.AttackOption_hidden) {
											if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.npcAttackOption && var5.combatLevel > HealthBarUpdate.localPlayer.combatLevel) {
												var11 = 2000;
											}

											var10 = 0;
											if (var9 == 0) {
												var10 = var11 + 9;
											}

											if (var9 == 1) {
												var10 = var11 + 10;
											}

											if (var9 == 2) {
												var10 = var11 + 11;
											}

											if (var9 == 3) {
												var10 = var11 + 12;
											}

											if (var9 == 4) {
												var10 = var11 + 13;
											}

											class423.insertMenuItem(var8[var9], class134.colorStartTag(16776960) + var6, var10, var1, var2, var3, -1, false, var4);
										}
									}
								}
							}

							if (!var5.lowPriorityFollowerOps || !Client.followerOpsLowPriority) {
								class423.insertMenuItem("Examine", class134.colorStartTag(16776960) + var6, 1003, var1, var2, var3, -1, false, var4);
							}
						}

					}
				}
			}
		}
	}

	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "(Loi;II)I",
		garbageValue = "1489104352"
	)
	static final int method637(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) {
			try {
				int[] var2 = var0.cs1Instructions[var1];
				int var3 = 0;
				int var4 = 0;
				byte var5 = 0;

				while (true) {
					int var6 = var2[var4++];
					int var7 = 0;
					byte var8 = 0;
					if (var6 == 0) {
						return var3;
					}

					if (var6 == 1) {
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) {
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) {
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = UrlRequester.widgetDefinition.method7476(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!AttackOption.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) {
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) {
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) {
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) {
						var7 = HealthBarUpdate.localPlayer.combatLevel;
					}

					if (var6 == 9) {
						for (var9 = 0; var9 < 25; ++var9) {
							if (Skills.Skills_enabled[var9]) {
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = UrlRequester.widgetDefinition.method7476(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!AttackOption.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 = 999999999;
									break;
								}
							}
						}
					}

					if (var6 == 11) {
						var7 = Client.runEnergy;
					}

					if (var6 == 12) {
						var7 = Client.weight;
					}

					if (var6 == 13) {
						var9 = Varps.Varps_main[var2[var4++]];
						int var13 = var2[var4++];
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0;
					}

					if (var6 == 14) {
						var9 = var2[var4++];
						var7 = class281.getVarbit(var9);
					}

					if (var6 == 15) {
						var8 = 1;
					}

					if (var6 == 16) {
						var8 = 2;
					}

					if (var6 == 17) {
						var8 = 3;
					}

					if (var6 == 18) {
						var7 = (HealthBarUpdate.localPlayer.x >> 7) + class333.topLevelWorldView.baseX;
					}

					if (var6 == 19) {
						var7 = (HealthBarUpdate.localPlayer.y >> 7) + class333.topLevelWorldView.baseY;
					}

					if (var6 == 20) {
						var7 = var2[var4++];
					}

					if (var8 == 0) {
						if (var5 == 0) {
							var3 += var7;
						}

						if (var5 == 1) {
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) {
							var3 /= var7;
						}

						if (var5 == 3) {
							var3 *= var7;
						}

						var5 = 0;
					} else {
						var5 = var8;
					}
				}
			} catch (Exception var14) {
				return -1;
			}
		} else {
			return -2;
		}
	}

	@ObfuscatedName("pi")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-81"
	)
	static void method533() {
		if (Client.oculusOrbState == 1) {
			Client.field377 = true;
		}

	}
}
