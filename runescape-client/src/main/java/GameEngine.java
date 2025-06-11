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
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -503622449
	)
	@Export("cycleDurationMillis")
	protected static int cycleDurationMillis;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 156472989
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -250679513
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1725306701
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("aa")
	protected static String field192;
	@ObfuscatedName("ah")
	@Export("hasFocus")
	protected static boolean hasFocus;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lbo;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1216314993
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = -3394630083677305545L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("ad")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -875842449
	)
	@Export("gameCyclesToDo")
	static int gameCyclesToDo;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -688953511
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("clock")
	static Clock clock;
	@ObfuscatedName("aw")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("ae")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("av")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 963049523
	)
	static int field187;
	@ObfuscatedName("aq")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	@Export("keyHandler")
	protected static KeyHandler keyHandler;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		longValue = 9063708969508075451L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		longValue = 6815346372791054049L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Lwy;"
	)
	static IndexedSprite field181;
	@ObfuscatedName("bi")
	@Export("eventQueue")
	final EventQueue eventQueue;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 2115682813
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1012926101
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("bm")
	protected boolean field195;
	@ObfuscatedName("be")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -636978241
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1287674547
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1269953635
	)
	int field199;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1668828603
	)
	int field178;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 2054405243
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -759213961
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("bs")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("bn")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("bc")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("bg")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("bb")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		longValue = -1098752406880014853L
	)
	volatile long field200;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("by")
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
		field187 = 500;
		volatileFocus = true;
		keyHandler = new KeyHandler();
		garbageCollectorLastCollectionTime = -1L;
		garbageCollectorLastCheckTimeMs = -1L;
	}

	protected GameEngine() {
		this.field195 = false;
		this.hasErrored = false;
		this.canvasX = 0;
		this.canvasY = 0;
		this.fullRedraw = true;
		this.resizeCanvasNextFrame = false;
		this.isCanvasInvalid = false;
		this.field200 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.eventQueue = var1;
		class68.method2142(new DevicePcmPlayerProvider());
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "8"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
			this.method510();
		}

		this.maxCanvasWidth = var1;
		this.maxCanvasHeight = var2;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;B)V",
		garbageValue = "-19"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) {
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
				UserComparator8.method3393(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Liu;",
		garbageValue = "1706603053"
	)
	@Export("mouseWheel")
	protected MouseWheel mouseWheel() {
		if (this.mouseWheelHandler == null) {
			this.mouseWheelHandler = new MouseWheelHandler();
			this.mouseWheelHandler.addTo(this.canvas);
		}

		return this.mouseWheelHandler;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2139068152"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "47"
	)
	protected void method574(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "-1835886088"
	)
	public Clipboard method571() {
		return this.clipboard;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1902203741"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
			class28.KeyHandler_keyCodes[186] = 57;
			class28.KeyHandler_keyCodes[187] = 27;
			class28.KeyHandler_keyCodes[188] = 71;
			class28.KeyHandler_keyCodes[189] = 26;
			class28.KeyHandler_keyCodes[190] = 72;
			class28.KeyHandler_keyCodes[191] = 73;
			class28.KeyHandler_keyCodes[192] = 58;
			class28.KeyHandler_keyCodes[219] = 42;
			class28.KeyHandler_keyCodes[220] = 74;
			class28.KeyHandler_keyCodes[221] = 43;
			class28.KeyHandler_keyCodes[222] = 59;
			class28.KeyHandler_keyCodes[223] = 28;
		} else {
			class28.KeyHandler_keyCodes[44] = 71;
			class28.KeyHandler_keyCodes[45] = 26;
			class28.KeyHandler_keyCodes[46] = 72;
			class28.KeyHandler_keyCodes[47] = 73;
			class28.KeyHandler_keyCodes[59] = 57;
			class28.KeyHandler_keyCodes[61] = 27;
			class28.KeyHandler_keyCodes[91] = 42;
			class28.KeyHandler_keyCodes[92] = 74;
			class28.KeyHandler_keyCodes[93] = 43;
			class28.KeyHandler_keyCodes[192] = 28;
			class28.KeyHandler_keyCodes[222] = 58;
			class28.KeyHandler_keyCodes[520] = 59;
		}

		keyHandler.method361(this.canvas);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "14"
	)
	protected final void method526() {
		keyHandler.method363();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lbi;IB)V",
		garbageValue = "-7"
	)
	protected void method496(class29 var1, int var2) {
		keyHandler.method358(var1, var2);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-262953389"
	)
	@Export("setUpMouse")
	protected final void setUpMouse() {
		java.awt.Canvas var1 = this.canvas;
		var1.addMouseListener(MouseHandler.MouseHandler_instance);
		var1.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var1.addFocusListener(MouseHandler.MouseHandler_instance);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1906893125"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container();
		if (var1 != null) {
			Bounds var2 = this.getFrameContentBounds();
			this.contentWidth = Math.max(var2.highX, this.field199);
			this.contentHeight = Math.max(var2.highY, this.field178);
			if (this.contentWidth <= 0) {
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) {
				this.contentHeight = 1;
			}

			canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
			canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
			this.canvasX = (this.contentWidth - canvasWidth) / 2;
			this.canvasY = 0;
			this.canvas.setSize(canvasWidth, canvasHeight);
			ArchiveDiskActionHandler.rasterProvider = new RasterProvider(canvasWidth, canvasHeight, this.canvas, this.field195);
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "13"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1024235231"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX;
		int var2 = this.canvasY;
		int var3 = this.contentWidth - canvasWidth - var1;
		int var4 = this.contentHeight - canvasHeight - var2;
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1841433596"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		keyHandler.method362(this.canvas);
		IsaacCipher.method11481(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.method312(this.canvas);
		}

		this.addCanvas();
		keyHandler.method361(this.canvas);
		java.awt.Canvas var1 = this.canvas;
		var1.addMouseListener(MouseHandler.MouseHandler_instance);
		var1.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var1.addFocusListener(MouseHandler.MouseHandler_instance);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method510();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)V",
		garbageValue = "-13644"
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
			canvasHeight = var2;
			RunException.RunException_revision = var3;
			VarpDefinition.field1914 = var4;
			RunException.RunException_applet = this;
			if (taskHandler == null) {
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1);
		} catch (Exception var6) {
			class569.RunException_sendStackTrace((String)null, var6);
			this.error("crash");
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1243849848"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container();
		if (this.canvas != null) {
			this.canvas.removeFocusListener(this);
			var1.remove(this.canvas);
		}

		canvasWidth = Math.max(var1.getWidth(), this.field199);
		canvasHeight = Math.max(var1.getHeight(), this.field178);
		Insets var2;
		if (this.frame != null) {
			var2 = this.frame.getInsets();
			canvasWidth -= var2.right + var2.left;
			canvasHeight -= var2.bottom + var2.top;
		}

		this.canvas = new Canvas(this);
		var1.setBackground(Color.BLACK);
		var1.setLayout((LayoutManager)null);
		var1.add(this.canvas);
		this.canvas.setSize(canvasWidth, canvasHeight);
		this.canvas.setVisible(true);
		this.canvas.setBackground(Color.BLACK);
		if (var1 == this.frame) {
			var2 = this.frame.getInsets();
			this.canvas.setLocation(var2.left + this.canvasX, var2.top + this.canvasY);
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY);
		}

		this.canvas.addFocusListener(this);
		this.canvas.requestFocus();
		this.fullRedraw = true;
		if (ArchiveDiskActionHandler.rasterProvider != null && canvasWidth == ArchiveDiskActionHandler.rasterProvider.width && canvasHeight == ArchiveDiskActionHandler.rasterProvider.height) {
			((RasterProvider)ArchiveDiskActionHandler.rasterProvider).setComponent(this.canvas);
			ArchiveDiskActionHandler.rasterProvider.drawFull(0, 0);
		} else {
			ArchiveDiskActionHandler.rasterProvider = new RasterProvider(canvasWidth, canvasHeight, this.canvas, this.field195);
		}

		this.isCanvasInvalid = false;
		this.field200 = class180.method3973();
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "100"
	)
	protected void method503(boolean var1) {
		if (this.field195 != var1) {
			this.field195 = var1;
			ArchiveDiskActionHandler.rasterProvider.method11279(var1);
			ArchiveDiskActionHandler.rasterProvider.apply();
		}

	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1128396802"
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

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1715219844"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = class180.method3973();
		long var3 = clientTickTimes[class278.field3123];
		clientTickTimes[class278.field3123] = var1;
		class278.field3123 = class278.field3123 + 1 & 31;
		if (var3 != 0L && var1 > var3) {
		}

		synchronized(this) {
			hasFocus = volatileFocus;
		}

		this.doCycle();
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "64"
	)
	protected final void method507() {
		this.fullRedraw = true;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1267783812"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container();
		long var2 = class180.method3973();
		long var4 = graphicsTickTimes[RestClientThreadFactory.field73];
		graphicsTickTimes[RestClientThreadFactory.field73] = var2;
		RestClientThreadFactory.field73 = RestClientThreadFactory.field73 + 1 & 31;
		if (0L != var4 && var2 > var4) {
			int var6 = (int)(var2 - var4);
			fps = ((var6 >> 1) + 32000) / var6;
		}

		if (++field187 - 1 > 50) {
			field187 -= 50;
			this.fullRedraw = true;
			this.canvas.setSize(canvasWidth, canvasHeight);
			this.canvas.setVisible(true);
			if (var1 == this.frame) {
				Insets var7 = this.frame.getInsets();
				this.canvas.setLocation(var7.left + this.canvasX, this.canvasY + var7.top);
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY);
			}
		}

		if (this.isCanvasInvalid) {
			this.replaceCanvas();
		}

		this.method509();
		this.draw(this.fullRedraw);
		if (this.fullRedraw) {
			this.clearBackground();
		}

		this.fullRedraw = false;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "12"
	)
	final void method509() {
		Bounds var1 = this.getFrameContentBounds();
		if (this.contentWidth != var1.highX || var1.highY != this.contentHeight || this.resizeCanvasNextFrame) {
			this.resizeCanvas();
			this.resizeCanvasNextFrame = false;
		}

	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "773690955"
	)
	final void method510() {
		this.resizeCanvasNextFrame = true;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-41"
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

			if (taskHandler != null) {
				try {
					taskHandler.close();
				} catch (Exception var2) {
				}
			}

			this.vmethod1421();
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1154613150"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-4"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-777762887"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1358247604"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZZI)V",
		garbageValue = "622211240"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3, boolean var4) {
		try {
			Graphics var5 = this.canvas.getGraphics();
			if (class30.fontHelvetica13 == null) {
				class30.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
				class547.loginScreenFontMetrics = this.canvas.getFontMetrics(class30.fontHelvetica13);
			}

			if (var3 && !var4) {
				var5.setColor(Color.black);
				var5.fillRect(0, 0, canvasWidth, canvasHeight);
			}

			Color var6 = new Color(140, 17, 17);

			try {
				if (FloatProjection.field2798 == null) {
					FloatProjection.field2798 = this.canvas.createImage(304, 34);
				}

				Graphics var7 = FloatProjection.field2798.getGraphics();
				var7.setColor(var6);
				var7.drawRect(0, 0, 303, 33);
				var7.fillRect(2, 2, var1 * 3, 30);
				var7.setColor(Color.black);
				var7.drawRect(1, 1, 301, 31);
				var7.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
				var7.setFont(class30.fontHelvetica13);
				var7.setColor(Color.white);
				var7.drawString(var2, (304 - class547.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
				var5.drawImage(FloatProjection.field2798, canvasWidth / 2 - 152, canvasHeight / 2 + (var4 ? 50 : -18), (ImageObserver)null);
			} catch (Exception var10) {
				int var8 = canvasWidth / 2 - 152;
				int var9 = canvasHeight / 2 - 18;
				var5.setColor(var6);
				var5.drawRect(var8, var9, 303, 33);
				var5.fillRect(var8 + 2, var9 + 2, var1 * 3, 30);
				var5.setColor(Color.black);
				var5.drawRect(var8 + 1, var9 + 1, 301, 31);
				var5.fillRect(var8 + var1 * 3 + 2, var9 + 2, 300 - var1 * 3, 30);
				var5.setFont(class30.fontHelvetica13);
				var5.setColor(Color.white);
				var5.drawString(var2, var8 + (304 - class547.loginScreenFontMetrics.stringWidth(var2)) / 2, var9 + 22);
			}
		} catch (Exception var11) {
			this.canvas.repaint();
		}

	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	protected final void method555() {
		FloatProjection.field2798 = null;
		class30.fontHelvetica13 = null;
		class547.loginScreenFontMetrics = null;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "0"
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

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/awt/Container;",
		garbageValue = "10"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this);
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)Lrv;",
		garbageValue = "544156022"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container();
		int var2 = Math.max(var1.getWidth(), this.field199);
		int var3 = Math.max(var1.getHeight(), this.field178);
		if (this.frame != null) {
			Insets var4 = this.frame.getInsets();
			var2 -= var4.left + var4.right;
			var3 -= var4.bottom + var4.top;
		}

		return new Bounds(var2, var3);
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "104"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "128"
	)
	protected abstract void vmethod1421();

	public final void destroy() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = class180.method3973();
			UserComparator8.method3393(5000L);
			this.kill();
		}
	}

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) {
			this.fullRedraw = true;
			if (class180.method3973() - this.field200 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= canvasWidth && var2.height >= canvasHeight) {
					this.isCanvasInvalid = true;
				}
			}

		}
	}

	public final void windowDeactivated(WindowEvent var1) {
	}

	public final void windowClosed(WindowEvent var1) {
	}

	public final void start() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = 0L;
		}
	}

	public final void update(Graphics var1) {
		this.paint(var1);
	}

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false;
	}

	public final void windowActivated(WindowEvent var1) {
	}

	public final void windowClosing(WindowEvent var1) {
		this.destroy();
	}

	public final void windowDeiconified(WindowEvent var1) {
	}

	public final void windowIconified(WindowEvent var1) {
	}

	public final void windowOpened(WindowEvent var1) {
	}

	public abstract void init();

	public final void stop() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = class180.method3973() + 4000L;
		}
	}

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true;
		this.fullRedraw = true;
	}

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) {
				String var1 = TaskHandler.javaVendor.toLowerCase();
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = class332.javaVersion;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
						this.error("wrongjava");
						return;
					}

					if (var2.startsWith("1.6.0_")) {
						int var3;
						for (var3 = 6; var3 < var2.length() && class195.isDigit(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (class300.isNumber(var4) && class146.method3635(var4) < 10) {
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
			clock = FaceNormal.method5455();

			while (0L == stopTimeMs || class180.method3973() < stopTimeMs) {
				gameCyclesToDo = clock.wait(cycleDurationMillis, fiveOrOne);

				for (int var5 = 0; var5 < gameCyclesToDo; ++var5) {
					this.clientTick();
				}

				this.graphicsTick();
				this.post(this.canvas);
			}
		} catch (Exception var6) {
			class569.RunException_sendStackTrace((String)null, var6);
			this.error("crash");
		}

		this.kill();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)[I",
		garbageValue = "-111"
	)
	static int[] method558(int var0, int var1, int var2, int var3, int var4) {
		int[] var5 = new int[256];

		int var6;
		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6] = FriendsList.method9520(var0, var1, var6);
		}

		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6 + 64] = FriendsList.method9520(var1, var2, var6);
		}

		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6 + 128] = FriendsList.method9520(var2, var3, var6);
		}

		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6 + 192] = FriendsList.method9520(var3, var4, var6);
		}

		return var5;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1661712162"
	)
	public static void method578(int var0, int var1) {
		Iterator var2 = class335.field3695.iterator();

		while (var2.hasNext()) {
			class341 var3 = (class341)var2.next();
			var3.vmethod7113(var0, var1);
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)[B",
		garbageValue = "58"
	)
	public static byte[] method666(int var0) {
		return class376.ByteArrayPool_getArrayBool(var0, false);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-1283027464"
	)
	static final void method653(String var0, int var1) {
		PacketBufferNode var2 = class139.getPacketBufferNode(ClientPacket.FRIEND_CHAT_SETRANK, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(FriendsChat.stringCp1252NullTerminatedByteSize(var0) + 1);
		var2.packetBuffer.writeStringCp1252NullTerminated(var0);
		var2.packetBuffer.writeByteAdd(var1);
		Client.packetWriter.addNode(var2);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZB)V",
		garbageValue = "-72"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var6 = (var0 + var1) / 2;
			int var7 = var0;
			World var8 = class547.World_worlds[var6];
			class547.World_worlds[var6] = class547.World_worlds[var1];
			class547.World_worlds[var1] = var8;

			for (int var9 = var0; var9 < var1; ++var9) {
				if (class30.method448(class547.World_worlds[var9], var8, var2, var3, var4, var5) <= 0) {
					World var10 = class547.World_worlds[var9];
					class547.World_worlds[var9] = class547.World_worlds[var7];
					class547.World_worlds[var7++] = var10;
				}
			}

			class547.World_worlds[var1] = class547.World_worlds[var7];
			class547.World_worlds[var7] = var8;
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5);
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5);
		}

	}
}
