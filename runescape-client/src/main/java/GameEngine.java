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

@ObfuscatedName("bg")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 2026420547
	)
	@Export("cycleDurationMillis")
	protected static int cycleDurationMillis;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 31170685
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("aq")
	@Export("hasFocus")
	protected static boolean hasFocus;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lbg;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1393826331
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = -3793842105245213391L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("ad")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -992882423
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("az")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("ak")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("scriptActiveWidget")
	static Widget scriptActiveWidget;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -404836915
	)
	static int field164;
	@ObfuscatedName("am")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	@Export("keyHandler")
	protected static KeyHandler keyHandler;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		longValue = 6554824999819746963L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		longValue = 7865954032724810625L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("vx")
	@ObfuscatedGetter(
		intValue = -1985830419
	)
	static int field187;
	@ObfuscatedName("bj")
	@Export("eventQueue")
	final EventQueue eventQueue;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1869260197
	)
	@Export("contentWidth")
	int contentWidth;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 509924911
	)
	@Export("contentHeight")
	int contentHeight;
	@ObfuscatedName("by")
	protected boolean field172;
	@ObfuscatedName("bm")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1938806401
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1059188249
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1475122893
	)
	int field176;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -2116818745
	)
	int field157;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1458355463
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 428839601
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("bp")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("bz")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("bh")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("bc")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("bv")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		longValue = 5754968404999720327L
	)
	volatile long field185;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Law;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("br")
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
		field164 = 500;
		volatileFocus = true;
		keyHandler = new KeyHandler();
		garbageCollectorLastCollectionTime = -1L;
		garbageCollectorLastCheckTimeMs = -1L;
	}

	protected GameEngine() {
		this.field172 = false;
		this.hasErrored = false;
		this.canvasX = 0;
		this.canvasY = 0;
		this.fullRedraw = true;
		this.resizeCanvasNextFrame = false;
		this.isCanvasInvalid = false;
		this.field185 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.eventQueue = var1;
		DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider();
		DelayFadeTask.pcmPlayerProvider = var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "724554170"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
			this.method522();
		}

		this.maxCanvasWidth = var1;
		this.maxCanvasHeight = var2;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;B)V",
		garbageValue = "41"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) {
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
				GrandExchangeOfferOwnWorldComparator.method789(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Lkh;",
		garbageValue = "-1458886425"
	)
	@Export("mouseWheel")
	protected MouseWheel mouseWheel() {
		if (this.mouseWheelHandler == null) {
			this.mouseWheelHandler = new MouseWheelHandler();
			this.mouseWheelHandler.addTo(this.canvas);
		}

		return this.mouseWheelHandler;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-21"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1977504741"
	)
	protected void method504(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "-1115698748"
	)
	protected Clipboard method505() {
		return this.clipboard;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "988808738"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		MenuAction.method1919();
		keyHandler.method349(this.canvas);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1162412032"
	)
	protected final void method507() {
		keyHandler.method375();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lbj;II)V",
		garbageValue = "1805606081"
	)
	protected void method520(class28 var1, int var2) {
		keyHandler.method365(var1, var2);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "53"
	)
	@Export("setUpMouse")
	protected final void setUpMouse() {
		class519.method10546(this.canvas);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "588392045"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container();
		if (var1 != null) {
			Bounds var2 = this.getFrameContentBounds();
			this.contentWidth = Math.max(var2.highX, this.field176);
			this.contentHeight = Math.max(var2.highY, this.field157);
			if (this.contentWidth <= 0) {
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) {
				this.contentHeight = 1;
			}

			class4.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
			class558.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
			this.canvasX = (this.contentWidth - class4.canvasWidth) / 2;
			this.canvasY = 0;
			this.canvas.setSize(class4.canvasWidth, class558.canvasHeight);
			class409.rasterProvider = new RasterProvider(class4.canvasWidth, class558.canvasHeight, this.canvas, this.field172);
			if (var1 == this.frame) {
				Insets var3 = this.frame.getInsets();
				this.canvas.setLocation(this.canvasX + var3.left, var3.top + this.canvasY);
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY);
			}

			this.fullRedraw = true;
			this.resizeGame();
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1110545204"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX;
		int var2 = this.canvasY;
		int var3 = this.contentWidth - class4.canvasWidth - var1;
		int var4 = this.contentHeight - class558.canvasHeight - var2;
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-872017534"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		keyHandler.method350(this.canvas);
		java.awt.Canvas var1 = this.canvas;
		var1.removeMouseListener(MouseHandler.MouseHandler_instance);
		var1.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
		var1.removeFocusListener(MouseHandler.MouseHandler_instance);
		MouseHandler.MouseHandler_currentButtonVolatile = 0;
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.method309(this.canvas);
		}

		this.addCanvas();
		keyHandler.method349(this.canvas);
		class519.method10546(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method522();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-83"
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
			class4.canvasWidth = var1;
			class558.canvasHeight = var2;
			class32.RunException_revision = var3;
			RunException.field6152 = var4;
			class612.RunException_applet = this.getCodeBase();
			if (taskHandler == null) {
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1);
		} catch (Exception var6) {
			ArchiveDiskActionHandler.RunException_sendStackTrace((String)null, var6);
			this.error("crash");
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1939764198"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container();
		if (this.canvas != null) {
			this.canvas.removeFocusListener(this);
			var1.remove(this.canvas);
		}

		class4.canvasWidth = Math.max(var1.getWidth(), this.field176);
		class558.canvasHeight = Math.max(var1.getHeight(), this.field157);
		Insets var2;
		if (this.frame != null) {
			var2 = this.frame.getInsets();
			class4.canvasWidth -= var2.right + var2.left;
			class558.canvasHeight -= var2.bottom + var2.top;
		}

		this.canvas = new Canvas(this);
		var1.setBackground(Color.BLACK);
		var1.setLayout((LayoutManager)null);
		var1.add(this.canvas);
		this.canvas.setSize(class4.canvasWidth, class558.canvasHeight);
		this.canvas.setVisible(true);
		this.canvas.setBackground(Color.BLACK);
		if (var1 == this.frame) {
			var2 = this.frame.getInsets();
			this.canvas.setLocation(this.canvasX + var2.left, var2.top + this.canvasY);
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY);
		}

		this.canvas.addFocusListener(this);
		this.canvas.requestFocus();
		this.fullRedraw = true;
		if (class409.rasterProvider != null && class4.canvasWidth == class409.rasterProvider.width && class558.canvasHeight == class409.rasterProvider.height) {
			((RasterProvider)class409.rasterProvider).setComponent(this.canvas);
			class409.rasterProvider.drawFull(0, 0);
		} else {
			class409.rasterProvider = new RasterProvider(class4.canvasWidth, class558.canvasHeight, this.canvas, this.field172);
		}

		this.isCanvasInvalid = false;
		this.field185 = class281.method6373();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "111"
	)
	protected void method516(boolean var1) {
		if (this.field172 != var1) {
			this.field172 = var1;
			if (class409.rasterProvider != null) {
				class409.rasterProvider.method11823(var1);
				class409.rasterProvider.apply();
			}
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1761521081"
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-421881843"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = class281.method6373();
		long var3 = clientTickTimes[ModelData0.field3022];
		clientTickTimes[ModelData0.field3022] = var1;
		ModelData0.field3022 = ModelData0.field3022 + 1 & 31;
		if (var3 != 0L && var1 > var3) {
		}

		synchronized(this) {
			hasFocus = volatileFocus;
		}

		this.doCycle();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-40"
	)
	protected final void method519() {
		this.fullRedraw = true;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "28"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container();
		long var2 = class281.method6373();
		long var4 = graphicsTickTimes[class440.field5167];
		graphicsTickTimes[class440.field5167] = var2;
		class440.field5167 = class440.field5167 + 1 & 31;
		if (0L != var4 && var2 > var4) {
			int var6 = (int)(var2 - var4);
			fps = ((var6 >> 1) + 32000) / var6;
		}

		if (++field164 - 1 > 50) {
			field164 -= 50;
			this.fullRedraw = true;
			this.canvas.setSize(class4.canvasWidth, class558.canvasHeight);
			this.canvas.setVisible(true);
			if (var1 == this.frame) {
				Insets var7 = this.frame.getInsets();
				this.canvas.setLocation(var7.left + this.canvasX, var7.top + this.canvasY);
			} else {
				this.canvas.setLocation(this.canvasX, this.canvasY);
			}
		}

		if (this.isCanvasInvalid) {
			this.replaceCanvas();
		}

		this.method501();
		this.draw(this.fullRedraw);
		if (this.fullRedraw) {
			this.clearBackground();
		}

		this.fullRedraw = false;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-32"
	)
	final void method501() {
		Bounds var1 = this.getFrameContentBounds();
		if (var1.highX != this.contentWidth || var1.highY != this.contentHeight || this.resizeCanvasNextFrame) {
			this.resizeCanvas();
			this.resizeCanvasNextFrame = false;
		}

	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2091796905"
	)
	final void method522() {
		this.resizeCanvasNextFrame = true;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-17"
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

			this.vmethod800();
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1885009285"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "32"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-50"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZZI)V",
		garbageValue = "-83931691"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3, boolean var4) {
		try {
			Graphics var5 = this.canvas.getGraphics();
			if (WorldMapSection0.fontHelvetica13 == null) {
				WorldMapSection0.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
				class304.loginScreenFontMetrics = this.canvas.getFontMetrics(WorldMapSection0.fontHelvetica13);
			}

			if (var3 && !var4) {
				var5.setColor(Color.black);
				var5.fillRect(0, 0, class4.canvasWidth, class558.canvasHeight);
			}

			Color var6 = new Color(140, 17, 17);

			try {
				if (NPCComposition.field2141 == null) {
					NPCComposition.field2141 = this.canvas.createImage(304, 34);
				}

				Graphics var7 = NPCComposition.field2141.getGraphics();
				var7.setColor(var6);
				var7.drawRect(0, 0, 303, 33);
				var7.fillRect(2, 2, var1 * 3, 30);
				var7.setColor(Color.black);
				var7.drawRect(1, 1, 301, 31);
				var7.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
				var7.setFont(WorldMapSection0.fontHelvetica13);
				var7.setColor(Color.white);
				var7.drawString(var2, (304 - class304.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
				var5.drawImage(NPCComposition.field2141, class4.canvasWidth / 2 - 152, class558.canvasHeight / 2 + (var4 ? 50 : -18), (ImageObserver)null);
			} catch (Exception var10) {
				int var8 = class4.canvasWidth / 2 - 152;
				int var9 = class558.canvasHeight / 2 - 18;
				var5.setColor(var6);
				var5.drawRect(var8, var9, 303, 33);
				var5.fillRect(var8 + 2, var9 + 2, var1 * 3, 30);
				var5.setColor(Color.black);
				var5.drawRect(var8 + 1, var9 + 1, 301, 31);
				var5.fillRect(var8 + var1 * 3 + 2, var9 + 2, 300 - var1 * 3, 30);
				var5.setFont(WorldMapSection0.fontHelvetica13);
				var5.setColor(Color.white);
				var5.drawString(var2, var8 + (304 - class304.loginScreenFontMetrics.stringWidth(var2)) / 2, var9 + 22);
			}
		} catch (Exception var11) {
			this.canvas.repaint();
		}

	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "835961850"
	)
	protected final void method536() {
		NPCComposition.field2141 = null;
		WorldMapSection0.fontHelvetica13 = null;
		class304.loginScreenFontMetrics = null;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "912684344"
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

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/awt/Container;",
		garbageValue = "-77"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this);
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)Lra;",
		garbageValue = "-168120952"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container();
		int var2 = Math.max(var1.getWidth(), this.field176);
		int var3 = Math.max(var1.getHeight(), this.field157);
		if (this.frame != null) {
			Insets var4 = this.frame.getInsets();
			var2 -= var4.left + var4.right;
			var3 -= var4.bottom + var4.top;
		}

		return new Bounds(var2, var3);
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "765875691"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1314436870"
	)
	protected abstract void vmethod800();

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) {
			this.fullRedraw = true;
			if (class281.method6373() - this.field185 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= class4.canvasWidth && var2.height >= class558.canvasHeight) {
					this.isCanvasInvalid = true;
				}
			}

		}
	}

	public final void destroy() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = class281.method6373();
			GrandExchangeOfferOwnWorldComparator.method789(5000L);
			this.kill();
		}
	}

	public final void windowActivated(WindowEvent var1) {
	}

	public final void start() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = 0L;
		}
	}

	public final void stop() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = class281.method6373() + 4000L;
		}
	}

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) {
				String var1 = TaskHandler.javaVendor.toLowerCase();
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = class107.javaVersion;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
						this.error("wrongjava");
						return;
					}

					if (var2.startsWith("1.6.0_")) {
						int var3;
						for (var3 = 6; var3 < var2.length() && class177.isDigit(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (class464.isNumber(var4) && class349.method7392(var4) < 10) {
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

			UserComparator4.clock = (Clock)var8;

			while (0L == stopTimeMs || class281.method6373() < stopTimeMs) {
				class559.gameCyclesToDo = UserComparator4.clock.wait(cycleDurationMillis, fiveOrOne);

				for (int var5 = 0; var5 < class559.gameCyclesToDo; ++var5) {
					this.clientTick();
				}

				this.graphicsTick();
				this.post(this.canvas);
			}
		} catch (Exception var7) {
			ArchiveDiskActionHandler.RunException_sendStackTrace((String)null, var7);
			this.error("crash");
		}

		this.kill();
	}

	public final void update(Graphics var1) {
		this.paint(var1);
	}

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true;
		this.fullRedraw = true;
	}

	public final void windowClosing(WindowEvent var1) {
		this.destroy();
	}

	public final void windowIconified(WindowEvent var1) {
	}

	public final void windowOpened(WindowEvent var1) {
	}

	public final void windowDeactivated(WindowEvent var1) {
	}

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false;
	}

	public abstract void init();

	public final void windowClosed(WindowEvent var1) {
	}

	public final void windowDeiconified(WindowEvent var1) {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgm;",
		garbageValue = "87"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0);
			var1 = new InvDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-399983116"
	)
	static void method676() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.isEmpty()) {
			class203.setLoginResponseString("", "Please enter your username/email address.", "");
		} else if (Login.Login_password.isEmpty()) {
			class203.setLoginResponseString("", "Please enter your password.", "");
		} else {
			class203.setLoginResponseString("", "Connecting to server...", "");
			class379.method8181(false);
			class135.updateGameState(20);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lok;IZLcj;B)V",
		garbageValue = "-125"
	)
	static void method675(Widget var0, int var1, boolean var2, Script var3) {
		if (var0.children == null) {
			var0.children = new Widget[var1 + 1];
		}

		if (var0.children.length <= var1) {
			Widget[] var4 = new Widget[var1 + 1];
			System.arraycopy(var0.children, 0, var4, 0, var0.children.length);
			var0.children = var4;
		} else {
			Widget var5 = var0.children[var1];
			if (var5 != null) {
				if (var2) {
					throw new RuntimeException("");
				}

				ClientPreferences.method2734(var5, var0);
			}
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lok;I[B[BI)V",
		garbageValue = "-335735831"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field4250 == null) {
			if (var2 == null) {
				return;
			}

			var0.field4250 = new byte[11][];
			var0.field4251 = new byte[11][];
			var0.field4316 = new int[11];
			var0.field4253 = new int[11];
		}

		var0.field4250[var1] = var2;
		if (var2 != null) {
			var0.field4182 = true;
		} else {
			var0.field4182 = false;

			for (int var4 = 0; var4 < var0.field4250.length; ++var4) {
				if (var0.field4250[var4] != null) {
					var0.field4182 = true;
					break;
				}
			}
		}

		var0.field4251[var1] = var3;
	}
}
