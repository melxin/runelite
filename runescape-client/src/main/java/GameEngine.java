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
import java.io.File;
import java.io.IOException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lbo;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -272069443
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = 3292623717968659785L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("ao")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1038896121
	)
	@Export("gameCyclesToDo")
	static int gameCyclesToDo;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1218216637
	)
	@Export("cycleDurationMillis")
	protected static int cycleDurationMillis;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1599371357
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -868636165
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("al")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -74299363
	)
	static int field182;
	@ObfuscatedName("as")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 897102807
	)
	static int field197;
	@ObfuscatedName("bg")
	protected static String field172;
	@ObfuscatedName("br")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	@Export("keyHandler")
	static KeyHandler keyHandler;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		longValue = 2109113262942841897L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		longValue = 9062848207802252483L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("ac")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 703471863
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1624076539
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1753479717
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2075496957
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -748777461
	)
	int field186;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 454964831
	)
	int field205;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1752878903
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -911975631
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("bm")
	protected boolean field171;
	@ObfuscatedName("bk")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("bb")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("ba")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("bu")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("bj")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		longValue = 1662915841357802659L
	)
	volatile long field200;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("bz")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("bx")
	@Export("eventQueue")
	final EventQueue eventQueue;

	static {
		gameEngine = null;
		GameEngine_redundantStartThreadCount = 0;
		stopTimeMs = 0L;
		isKilled = false;
		cycleDurationMillis = 20;
		fiveOrOne = 1;
		fps = 0;
		graphicsTickTimes = new long[32];
		clientTickTimes = new long[32];
		field197 = 500;
		volatileFocus = true;
		keyHandler = new KeyHandler();
		garbageCollectorLastCollectionTime = -1L;
		garbageCollectorLastCheckTimeMs = -1L;
	}

	protected GameEngine() {
		this.hasErrored = false;
		this.canvasX = 0;
		this.canvasY = 0;
		this.field171 = false;
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
		DevicePcmPlayerProvider.method301(new DevicePcmPlayerProvider());
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-434734038"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
			this.method487();
		}

		this.maxCanvasWidth = var1;
		this.maxCanvasHeight = var2;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "1876649656"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) {
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
				class188.method3857(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Lis;",
		garbageValue = "30"
	)
	@Export("mouseWheel")
	protected MouseWheel mouseWheel() {
		if (this.mouseWheelHandler == null) {
			this.mouseWheelHandler = new MouseWheelHandler();
			this.mouseWheelHandler.addTo(this.canvas);
		}

		return this.mouseWheelHandler;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "615839098"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1638679668"
	)
	protected void method469(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "114"
	)
	public Clipboard method535() {
		return this.clipboard;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2089040161"
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

		keyHandler.method334(this.canvas);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-212962644"
	)
	protected final void method472() {
		keyHandler.method355();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lbt;II)V",
		garbageValue = "-1615483904"
	)
	protected void method624(class29 var1, int var2) {
		keyHandler.method344(var1, var2);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "9"
	)
	@Export("setUpMouse")
	protected final void setUpMouse() {
		class198.method3972(this.canvas);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "87"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container();
		if (var1 != null) {
			Bounds var2 = this.getFrameContentBounds();
			this.contentWidth = Math.max(var2.highX, this.field186);
			this.contentHeight = Math.max(var2.highY, this.field205);
			if (this.contentWidth <= 0) {
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) {
				this.contentHeight = 1;
			}

			class329.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
			class535.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
			this.canvasX = (this.contentWidth - class329.canvasWidth) / 2;
			this.canvasY = 0;
			this.canvas.setSize(class329.canvasWidth, class535.canvasHeight);
			class154.rasterProvider = new RasterProvider(class329.canvasWidth, class535.canvasHeight, this.canvas, this.field171);
			if (var1 == this.frame) {
				Insets var3 = this.frame.getInsets();
				this.canvas.setLocation(var3.left + this.canvasX, this.canvasY + var3.top);
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY);
			}

			this.fullRedraw = true;
			this.resizeGame();
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1532432346"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-217663134"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX;
		int var2 = this.canvasY;
		int var3 = this.contentWidth - class329.canvasWidth - var1;
		int var4 = this.contentHeight - class535.canvasHeight - var2;
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1996998550"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		keyHandler.method345(this.canvas);
		java.awt.Canvas var1 = this.canvas;
		var1.removeMouseListener(MouseHandler.MouseHandler_instance);
		var1.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
		var1.removeFocusListener(MouseHandler.MouseHandler_instance);
		MouseHandler.MouseHandler_currentButtonVolatile = 0;
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.method287(this.canvas);
		}

		this.addCanvas();
		keyHandler.method334(this.canvas);
		class198.method3972(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method487();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "32"
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
			class329.canvasWidth = var1;
			class535.canvasHeight = var2;
			RunException.RunException_revision = var3;
			RunException.field5642 = var4;
			RunException.RunException_applet = this;
			if (taskHandler == null) {
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1);
		} catch (Exception var6) {
			ArchiveLoader.RunException_sendStackTrace((String)null, var6);
			this.error("crash");
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container();
		if (this.canvas != null) {
			this.canvas.removeFocusListener(this);
			var1.remove(this.canvas);
		}

		class329.canvasWidth = Math.max(var1.getWidth(), this.field186);
		class535.canvasHeight = Math.max(var1.getHeight(), this.field205);
		Insets var2;
		if (this.frame != null) {
			var2 = this.frame.getInsets();
			class329.canvasWidth -= var2.right + var2.left;
			class535.canvasHeight -= var2.bottom + var2.top;
		}

		this.canvas = new Canvas(this);
		var1.setBackground(Color.BLACK);
		var1.setLayout((LayoutManager)null);
		var1.add(this.canvas);
		this.canvas.setSize(class329.canvasWidth, class535.canvasHeight);
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
		if (class154.rasterProvider != null && class329.canvasWidth == class154.rasterProvider.width && class535.canvasHeight == class154.rasterProvider.height) {
			((RasterProvider)class154.rasterProvider).setComponent(this.canvas);
			class154.rasterProvider.drawFull(0, 0);
		} else {
			class154.rasterProvider = new RasterProvider(class329.canvasWidth, class535.canvasHeight, this.canvas, this.field171);
		}

		this.isCanvasInvalid = false;
		this.field200 = class59.method1150();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "114"
	)
	protected void method481(boolean var1) {
		if (this.field171 != var1) {
			this.field171 = var1;
			class154.rasterProvider.method10523(var1);
			class154.rasterProvider.apply();
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1321255363"
	)
	@Export("checkHost")
	protected final boolean checkHost() {
		String var1 = this.getDocumentBase().getHost().toLowerCase();
		if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) {
			if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) {
				if (var1.endsWith("127.0.0.1")) {
					return true;
				} else {
					while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-87"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = class59.method1150();
		long var3 = clientTickTimes[class27.field124];
		clientTickTimes[class27.field124] = var1;
		class27.field124 = class27.field124 + 1 & 31;
		if (0L != var3 && var1 > var3) {
		}

		synchronized(this) {
			class289.hasFocus = volatileFocus;
		}

		this.doCycle();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-6"
	)
	protected final void method484() {
		this.fullRedraw = true;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1141892382"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container();
		long var2 = class59.method1150();
		long var4 = graphicsTickTimes[field182];
		graphicsTickTimes[field182] = var2;
		field182 = field182 + 1 & 31;
		if (var4 != 0L && var2 > var4) {
			int var6 = (int)(var2 - var4);
			fps = ((var6 >> 1) + 32000) / var6;
		}

		if (++field197 - 1 > 50) {
			field197 -= 50;
			this.fullRedraw = true;
			this.canvas.setSize(class329.canvasWidth, class535.canvasHeight);
			this.canvas.setVisible(true);
			if (var1 == this.frame) {
				Insets var7 = this.frame.getInsets();
				this.canvas.setLocation(this.canvasX + var7.left, var7.top + this.canvasY);
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY);
			}
		}

		if (this.isCanvasInvalid) {
			this.replaceCanvas();
		}

		this.method486();
		this.draw(this.fullRedraw);
		if (this.fullRedraw) {
			this.clearBackground();
		}

		this.fullRedraw = false;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1970951370"
	)
	final void method486() {
		Bounds var1 = this.getFrameContentBounds();
		if (var1.highX != this.contentWidth || var1.highY != this.contentHeight || this.resizeCanvasNextFrame) {
			this.resizeCanvas();
			this.resizeCanvasNextFrame = false;
		}

	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-280618367"
	)
	final void method487() {
		this.resizeCanvasNextFrame = true;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1457220636"
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

			this.vmethod1236();
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1983807399"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1441063551"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "111"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-256295307"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZZI)V",
		garbageValue = "-871780182"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3, boolean var4) {
		try {
			Graphics var5 = this.canvas.getGraphics();
			if (class336.fontHelvetica13 == null) {
				class336.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
				class227.loginScreenFontMetrics = this.canvas.getFontMetrics(class336.fontHelvetica13);
			}

			if (var3 && !var4) {
				var5.setColor(Color.black);
				var5.fillRect(0, 0, class329.canvasWidth, class535.canvasHeight);
			}

			Color var6 = new Color(140, 17, 17);

			try {
				if (HttpResponse.field100 == null) {
					HttpResponse.field100 = this.canvas.createImage(304, 34);
				}

				Graphics var7 = HttpResponse.field100.getGraphics();
				var7.setColor(var6);
				var7.drawRect(0, 0, 303, 33);
				var7.fillRect(2, 2, var1 * 3, 30);
				var7.setColor(Color.black);
				var7.drawRect(1, 1, 301, 31);
				var7.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
				var7.setFont(class336.fontHelvetica13);
				var7.setColor(Color.white);
				var7.drawString(var2, (304 - class227.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
				var5.drawImage(HttpResponse.field100, class329.canvasWidth / 2 - 152, (var4 ? 50 : -18) + class535.canvasHeight / 2, (ImageObserver)null);
			} catch (Exception var10) {
				int var8 = class329.canvasWidth / 2 - 152;
				int var9 = class535.canvasHeight / 2 - 18;
				var5.setColor(var6);
				var5.drawRect(var8, var9, 303, 33);
				var5.fillRect(var8 + 2, var9 + 2, var1 * 3, 30);
				var5.setColor(Color.black);
				var5.drawRect(var8 + 1, var9 + 1, 301, 31);
				var5.fillRect(var1 * 3 + var8 + 2, var9 + 2, 300 - var1 * 3, 30);
				var5.setFont(class336.fontHelvetica13);
				var5.setColor(Color.white);
				var5.drawString(var2, var8 + (304 - class227.loginScreenFontMetrics.stringWidth(var2)) / 2, var9 + 22);
			}
		} catch (Exception var11) {
			this.canvas.repaint();
		}

	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-90"
	)
	protected final void method499() {
		HttpResponse.field100 = null;
		class336.fontHelvetica13 = null;
		class227.loginScreenFontMetrics = null;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-403311310"
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

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/Container;",
		garbageValue = "392982809"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this);
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(B)Lqw;",
		garbageValue = "-3"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container();
		int var2 = Math.max(var1.getWidth(), this.field186);
		int var3 = Math.max(var1.getHeight(), this.field205);
		if (this.frame != null) {
			Insets var4 = this.frame.getInsets();
			var2 -= var4.left + var4.right;
			var3 -= var4.bottom + var4.top;
		}

		return new Bounds(var2, var3);
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "4"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "46"
	)
	protected abstract void vmethod1236();

	public final void destroy() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = class59.method1150();
			class188.method3857(5000L);
			this.kill();
		}
	}

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) {
			this.fullRedraw = true;
			if (class59.method1150() - this.field200 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= class329.canvasWidth && var2.height >= class535.canvasHeight) {
					this.isCanvasInvalid = true;
				}
			}

		}
	}

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) {
				String var1 = TaskHandler.javaVendor.toLowerCase();
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = TaskHandler.javaVersion;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
						this.error("wrongjava");
						return;
					}

					if (var2.startsWith("1.6.0_")) {
						int var3;
						for (var3 = 6; var3 < var2.length() && SoundSystem.isDigit(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (UserComparator3.isNumber(var4) && SecureUrlRequester.method3179(var4) < 10) {
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
			class425.clock = class92.method2513();

			while (stopTimeMs == 0L || class59.method1150() < stopTimeMs) {
				gameCyclesToDo = class425.clock.wait(cycleDurationMillis, fiveOrOne);

				for (int var5 = 0; var5 < gameCyclesToDo; ++var5) {
					this.clientTick();
				}

				this.graphicsTick();
				this.post(this.canvas);
			}
		} catch (Exception var6) {
			ArchiveLoader.RunException_sendStackTrace((String)null, var6);
			this.error("crash");
		}

		this.kill();
	}

	public final void start() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = 0L;
		}
	}

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true;
		this.fullRedraw = true;
	}

	public final void windowClosed(WindowEvent var1) {
	}

	public abstract void init();

	public final void windowDeactivated(WindowEvent var1) {
	}

	public final void windowDeiconified(WindowEvent var1) {
	}

	public final void windowIconified(WindowEvent var1) {
	}

	public final void windowOpened(WindowEvent var1) {
	}

	public final void stop() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = class59.method1150() + 4000L;
		}
	}

	public final void update(Graphics var1) {
		this.paint(var1);
	}

	public final void windowActivated(WindowEvent var1) {
	}

	public final void windowClosing(WindowEvent var1) {
		this.destroy();
	}

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lfm;FS)F",
		garbageValue = "15193"
	)
	static float method637(class137 var0, float var1) {
		if (var0 == null) {
			return 0.0F;
		} else {
			float var2;
			if (var1 == var0.field1576) {
				var2 = 0.0F;
			} else if (var1 == var0.field1578) {
				var2 = 1.0F;
			} else {
				var2 = (var1 - var0.field1576) / (var0.field1578 - var0.field1576);
			}

			float var3;
			if (var0.field1570) {
				var3 = var2;
			} else {
				float[] var4 = new float[]{var0.field1587 - var2, var0.field1579, var0.field1580, var0.field1588};
				float[] var5 = new float[5];
				int var6 = UrlRequest.method3192(var4, 3, 0.0F, true, 1.0F, true, var5);
				if (var6 == 1) {
					var3 = var5[0];
				} else {
					var3 = 0.0F;
				}
			}

			return var3 * (var0.field1583 + (var0.field1584 + var0.field1585 * var3) * var3) + var0.field1582;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZB)Luj;",
		garbageValue = "57"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(WorldMapScaleHandler.cacheDir, "preferences" + var0 + ".dat");
		if (var3.exists()) {
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L);
				return var10;
			} catch (IOException var9) {
			}
		}

		String var4 = "";
		if (class168.cacheGamebuild == 33) {
			var4 = "_rc";
		} else if (class168.cacheGamebuild == 34) {
			var4 = "_wip";
		}

		File var5 = new File(class4.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
		AccessFile var6;
		if (!var2 && var5.exists()) {
			try {
				var6 = new AccessFile(var5, "rw", 10000L);
				return var6;
			} catch (IOException var8) {
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L);
			return var6;
		} catch (IOException var7) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lql;Lql;B)Lql;",
		garbageValue = "17"
	)
	public static final class426 method639(class426 var0, class426 var1) {
		class426 var2 = RouteStrategy.method5650(var0);
		var2.method8109(var1);
		return var2;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-142235310"
	)
	static final void method635() {
		HttpRequestTask.method269("Your ignore list is full. Max of 100 for free users, and 400 for members");
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-37"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		if (!NpcOverrides.client.containsAccessAndRefreshToken() && !NpcOverrides.client.otlTokenRequesterInitialized() && !NpcOverrides.client.containsSessionAndCharacterId()) {
			Login.Login_response1 = "";
			Login.Login_response2 = "Enter your username/email & password.";
			Login.Login_response3 = "";
			class329.updateLoginIndex(2);
			if (var0) {
				Login.Login_password = "";
			}

			FriendSystem.method1964();
			class499.focusPasswordWhenUsernameFilled();
		} else {
			class329.updateLoginIndex(10);
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Lby;I)V",
		garbageValue = "782268736"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false;
		if (var0.sound != null) {
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1);
		}

	}
}
