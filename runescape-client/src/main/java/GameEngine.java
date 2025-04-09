import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FontMetrics;
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

@ObfuscatedName("bk")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 398591143
	)
	@Export("cycleDurationMillis")
	protected static int cycleDurationMillis;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1465972895
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1583854869
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("av")
	protected static String field157;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lwn;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lbk;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1763493581
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = -4143410878823288435L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("ar")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 886024471
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("ac")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lbi;"
	)
	@Export("pcmPlayerProvider")
	public static class51 pcmPlayerProvider;
	@ObfuscatedName("ak")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("ai")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("ad")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -820355421
	)
	static int field153;
	@ObfuscatedName("at")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	@Export("keyHandler")
	protected static KeyHandler keyHandler;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		longValue = -7747572156765453943L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		longValue = 4315152768818272323L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("bb")
	@Export("eventQueue")
	final EventQueue eventQueue;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -216610889
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1227078579
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("bh")
	protected boolean field176;
	@ObfuscatedName("ba")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1062796419
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -66448585
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1251301999
	)
	int field180;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1376341179
	)
	int field181;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -781474803
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1487056279
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("bj")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("bv")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("be")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("bm")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("bq")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		longValue = 5344230675594479893L
	)
	volatile long field189;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("bo")
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
		field153 = 500;
		volatileFocus = true;
		keyHandler = new KeyHandler();
		garbageCollectorLastCollectionTime = -1L;
		garbageCollectorLastCheckTimeMs = -1L;
	}

	protected GameEngine() {
		this.field176 = false;
		this.hasErrored = false;
		this.canvasX = 0;
		this.canvasY = 0;
		this.fullRedraw = true;
		this.resizeCanvasNextFrame = false;
		this.isCanvasInvalid = false;
		this.field189 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.eventQueue = var1;
		ApproximateRouteStrategy.method1230(new DevicePcmPlayerProvider());
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-647380085"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
			this.method646();
		}

		this.maxCanvasWidth = var1;
		this.maxCanvasHeight = var2;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "-906507538"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) {
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
				WorldMapRectangle.method6331(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Liy;",
		garbageValue = "114"
	)
	@Export("mouseWheel")
	protected MouseWheel mouseWheel() {
		if (this.mouseWheelHandler == null) {
			this.mouseWheelHandler = new MouseWheelHandler();
			this.mouseWheelHandler.addTo(this.canvas);
		}

		return this.mouseWheelHandler;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-14"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "90636615"
	)
	protected void method637(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "1"
	)
	public Clipboard method574() {
		return this.clipboard;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "218546939"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		HitSplatDefinition.method5424();
		keyHandler.method381(this.canvas);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1033624078"
	)
	protected final void method501() {
		keyHandler.method359();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lbb;II)V",
		garbageValue = "1927757968"
	)
	protected void method498(class29 var1, int var2) {
		keyHandler.method360(var1, var2);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2079791714"
	)
	@Export("setUpMouse")
	protected final void setUpMouse() {
		java.awt.Canvas var1 = this.canvas;
		var1.addMouseListener(MouseHandler.MouseHandler_instance);
		var1.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var1.addFocusListener(MouseHandler.MouseHandler_instance);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container();
		if (var1 != null) {
			Bounds var2 = this.getFrameContentBounds();
			this.contentWidth = Math.max(var2.highX, this.field180);
			this.contentHeight = Math.max(var2.highY, this.field181);
			if (this.contentWidth <= 0) {
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) {
				this.contentHeight = 1;
			}

			canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
			class141.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
			this.canvasX = (this.contentWidth - canvasWidth) / 2;
			this.canvasY = 0;
			this.canvas.setSize(canvasWidth, class141.canvasHeight);
			rasterProvider = new RasterProvider(canvasWidth, class141.canvasHeight, this.canvas, this.field176);
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-163541780"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1923792258"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX;
		int var2 = this.canvasY;
		int var3 = this.contentWidth - canvasWidth - var1;
		int var4 = this.contentHeight - class141.canvasHeight - var2;
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1764990383"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		keyHandler.method358(this.canvas);
		class419.method7999(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.method318(this.canvas);
		}

		this.addCanvas();
		keyHandler.method381(this.canvas);
		java.awt.Canvas var1 = this.canvas;
		var1.addMouseListener(MouseHandler.MouseHandler_instance);
		var1.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var1.addFocusListener(MouseHandler.MouseHandler_instance);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method646();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "417134891"
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
			class141.canvasHeight = var2;
			class493.RunException_revision = var3;
			RunException.field5761 = var4;
			RunException.RunException_applet = this;
			if (taskHandler == null) {
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1);
		} catch (Exception var6) {
			class290.RunException_sendStackTrace((String)null, var6);
			this.error("crash");
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container();
		if (this.canvas != null) {
			this.canvas.removeFocusListener(this);
			var1.remove(this.canvas);
		}

		canvasWidth = Math.max(var1.getWidth(), this.field180);
		class141.canvasHeight = Math.max(var1.getHeight(), this.field181);
		Insets var2;
		if (this.frame != null) {
			var2 = this.frame.getInsets();
			canvasWidth -= var2.right + var2.left;
			class141.canvasHeight -= var2.top + var2.bottom;
		}

		this.canvas = new Canvas(this);
		var1.setBackground(Color.BLACK);
		var1.setLayout((LayoutManager)null);
		var1.add(this.canvas);
		this.canvas.setSize(canvasWidth, class141.canvasHeight);
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
		if (rasterProvider != null && canvasWidth == rasterProvider.width && class141.canvasHeight == rasterProvider.height) {
			((RasterProvider)rasterProvider).setComponent(this.canvas);
			rasterProvider.drawFull(0, 0);
		} else {
			rasterProvider = new RasterProvider(canvasWidth, class141.canvasHeight, this.canvas, this.field176);
		}

		this.isCanvasInvalid = false;
		this.field189 = class282.method5908();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "-11479"
	)
	protected void method510(boolean var1) {
		if (this.field176 != var1) {
			this.field176 = var1;
			rasterProvider.method10728(var1);
			rasterProvider.apply();
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1181897730"
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

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "524495493"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = class282.method5908();
		long var3 = clientTickTimes[class182.field2016];
		clientTickTimes[class182.field2016] = var1;
		class182.field2016 = class182.field2016 + 1 & 31;
		if (0L != var3 && var1 > var3) {
		}

		synchronized(this) {
			class231.hasFocus = volatileFocus;
		}

		this.doCycle();
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-98"
	)
	protected final void method513() {
		this.fullRedraw = true;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2059587014"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container();
		long var2 = class282.method5908();
		long var4 = graphicsTickTimes[HealthBarConfig.field1357];
		graphicsTickTimes[HealthBarConfig.field1357] = var2;
		HealthBarConfig.field1357 = HealthBarConfig.field1357 + 1 & 31;
		if (0L != var4 && var2 > var4) {
			int var6 = (int)(var2 - var4);
			fps = ((var6 >> 1) + 32000) / var6;
		}

		if (++field153 - 1 > 50) {
			field153 -= 50;
			this.fullRedraw = true;
			this.canvas.setSize(canvasWidth, class141.canvasHeight);
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

		this.method515();
		this.draw(this.fullRedraw);
		if (this.fullRedraw) {
			this.clearBackground();
		}

		this.fullRedraw = false;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1095308497"
	)
	final void method515() {
		Bounds var1 = this.getFrameContentBounds();
		if (var1.highX != this.contentWidth || this.contentHeight != var1.highY || this.resizeCanvasNextFrame) {
			this.resizeCanvas();
			this.resizeCanvasNextFrame = false;
		}

	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1506314982"
	)
	final void method646() {
		this.resizeCanvasNextFrame = true;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "18"
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

			this.vmethod1240();
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1046836309"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "13136"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1671757291"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1773287493"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZZI)V",
		garbageValue = "274851067"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3, boolean var4) {
		try {
			Graphics var5 = this.canvas.getGraphics();
			if (fontHelvetica13 == null) {
				fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
				loginScreenFontMetrics = this.canvas.getFontMetrics(fontHelvetica13);
			}

			if (var3 && !var4) {
				var5.setColor(Color.black);
				var5.fillRect(0, 0, canvasWidth, class141.canvasHeight);
			}

			Color var6 = new Color(140, 17, 17);

			try {
				if (class141.field1654 == null) {
					class141.field1654 = this.canvas.createImage(304, 34);
				}

				Graphics var7 = class141.field1654.getGraphics();
				var7.setColor(var6);
				var7.drawRect(0, 0, 303, 33);
				var7.fillRect(2, 2, var1 * 3, 30);
				var7.setColor(Color.black);
				var7.drawRect(1, 1, 301, 31);
				var7.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
				var7.setFont(fontHelvetica13);
				var7.setColor(Color.white);
				var7.drawString(var2, (304 - loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
				var5.drawImage(class141.field1654, canvasWidth / 2 - 152, class141.canvasHeight / 2 + (var4 ? 50 : -18), (ImageObserver)null);
			} catch (Exception var10) {
				int var8 = canvasWidth / 2 - 152;
				int var9 = class141.canvasHeight / 2 - 18;
				var5.setColor(var6);
				var5.drawRect(var8, var9, 303, 33);
				var5.fillRect(var8 + 2, var9 + 2, var1 * 3, 30);
				var5.setColor(Color.black);
				var5.drawRect(var8 + 1, var9 + 1, 301, 31);
				var5.fillRect(var8 + var1 * 3 + 2, var9 + 2, 300 - var1 * 3, 30);
				var5.setFont(fontHelvetica13);
				var5.setColor(Color.white);
				var5.drawString(var2, var8 + (304 - loginScreenFontMetrics.stringWidth(var2)) / 2, var9 + 22);
			}
		} catch (Exception var11) {
			this.canvas.repaint();
		}

	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1357155356"
	)
	protected final void method528() {
		class141.field1654 = null;
		fontHelvetica13 = null;
		loginScreenFontMetrics = null;
	}

	@ObfuscatedName("bj")
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

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/awt/Container;",
		garbageValue = "-33"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this);
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)Lqs;",
		garbageValue = "216306916"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container();
		int var2 = Math.max(var1.getWidth(), this.field180);
		int var3 = Math.max(var1.getHeight(), this.field181);
		if (this.frame != null) {
			Insets var4 = this.frame.getInsets();
			var2 -= var4.left + var4.right;
			var3 -= var4.bottom + var4.top;
		}

		return new Bounds(var2, var3);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "27"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "805796301"
	)
	protected abstract void vmethod1240();

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) {
			this.fullRedraw = true;
			if (class282.method5908() - this.field189 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= canvasWidth && var2.height >= class141.canvasHeight) {
					this.isCanvasInvalid = true;
				}
			}

		}
	}

	public final void destroy() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = class282.method5908();
			WorldMapRectangle.method6331(5000L);
			this.kill();
		}
	}

	public void run() {
		try {
			if (TaskHandler.javaVendor != null) {
				String var1 = TaskHandler.javaVendor.toLowerCase();
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = class447.javaVersion;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
						this.error("wrongjava");
						return;
					}

					if (var2.startsWith("1.6.0_")) {
						int var3;
						for (var3 = 6; var3 < var2.length() && WorldMapData_0.isDigit(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (UserComparator5.isNumber(var4) && HttpQueryParams.method9661(var4) < 10) {
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
			class395.clock = class171.method3743();

			while (0L == stopTimeMs || class282.method5908() < stopTimeMs) {
				class441.gameCyclesToDo = class395.clock.wait(cycleDurationMillis, fiveOrOne);

				for (int var5 = 0; var5 < class441.gameCyclesToDo; ++var5) {
					this.clientTick();
				}

				this.graphicsTick();
				this.post(this.canvas);
			}
		} catch (Exception var6) {
			class290.RunException_sendStackTrace((String)null, var6);
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
			stopTimeMs = class282.method5908() + 4000L;
		}
	}

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false;
	}

	public final void windowActivated(WindowEvent var1) {
	}

	public final void windowClosed(WindowEvent var1) {
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

	public final void windowDeactivated(WindowEvent var1) {
	}

	public final void update(Graphics var1) {
		this.paint(var1);
	}

	public abstract void init();

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true;
		this.fullRedraw = true;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lrk;Lrk;Lrk;I)V",
		garbageValue = "739527516"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (canvasWidth - 765) / 2;
		Login.loginBoxX = Login.xPadding + 202;
		class387.loginBoxCenter = Login.loginBoxX + 180;
		byte var3;
		int var4;
		boolean var15;
		int var17;
		int var26;
		int var27;
		int var28;
		int var35;
		int var37;
		int var44;
		int var46;
		if (Login.worldSelectOpen) {
			if (class222.worldSelectBackSprites == null) {
				Archive var45 = class357.archive8;
				SpritePixels[] var52;
				if (!var45.isValidFileName("sl_back", "")) {
					var52 = null;
				} else {
					var44 = var45.getGroupId("sl_back");
					var27 = var45.getFileId(var44, "");
					var52 = GrandExchangeEvents.method7833(var45, var44, var27);
				}

				class222.worldSelectBackSprites = var52;
			}

			if (Interpreter.worldSelectFlagSprites == null) {
				Interpreter.worldSelectFlagSprites = HttpRequestTask.getFont(class357.archive8, "sl_flags", "");
			}

			if (UserComparator9.worldSelectArrows == null) {
				UserComparator9.worldSelectArrows = HttpRequestTask.getFont(class357.archive8, "sl_arrows", "");
			}

			if (Login.worldSelectStars == null) {
				Login.worldSelectStars = HttpRequestTask.getFont(class357.archive8, "sl_stars", "");
			}

			if (class60.worldSelectLeftSprite == null) {
				class60.worldSelectLeftSprite = UserComparator7.SpriteBuffer_getIndexedSpriteByName(class357.archive8, "leftarrow", "");
			}

			if (PcmPlayer.worldSelectRightSprite == null) {
				PcmPlayer.worldSelectRightSprite = UserComparator7.SpriteBuffer_getIndexedSpriteByName(class357.archive8, "rightarrow", "");
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
			var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
			if (Login.worldSelectStars != null) {
				Login.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
				var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
				Login.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
				var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
			}

			if (UserComparator9.worldSelectArrows != null) {
				var35 = Login.xPadding + 280;
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
					UserComparator9.worldSelectArrows[2].drawAt(var35, 4);
				} else {
					UserComparator9.worldSelectArrows[0].drawAt(var35, 4);
				}

				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
					UserComparator9.worldSelectArrows[3].drawAt(var35 + 15, 4);
				} else {
					UserComparator9.worldSelectArrows[1].drawAt(var35 + 15, 4);
				}

				var0.draw("World", var35 + 32, 17, 16777215, -1);
				var4 = Login.xPadding + 390;
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
					UserComparator9.worldSelectArrows[2].drawAt(var4, 4);
				} else {
					UserComparator9.worldSelectArrows[0].drawAt(var4, 4);
				}

				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
					UserComparator9.worldSelectArrows[3].drawAt(var4 + 15, 4);
				} else {
					UserComparator9.worldSelectArrows[1].drawAt(var4 + 15, 4);
				}

				var0.draw("Players", var4 + 32, 17, 16777215, -1);
				var44 = Login.xPadding + 500;
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
					UserComparator9.worldSelectArrows[2].drawAt(var44, 4);
				} else {
					UserComparator9.worldSelectArrows[0].drawAt(var44, 4);
				}

				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
					UserComparator9.worldSelectArrows[3].drawAt(var44 + 15, 4);
				} else {
					UserComparator9.worldSelectArrows[1].drawAt(var44 + 15, 4);
				}

				var0.draw("Location", var44 + 32, 17, 16777215, -1);
				var27 = Login.xPadding + 610;
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
					UserComparator9.worldSelectArrows[2].drawAt(var27, 4);
				} else {
					UserComparator9.worldSelectArrows[0].drawAt(var27, 4);
				}

				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
					UserComparator9.worldSelectArrows[3].drawAt(var27 + 15, 4);
				} else {
					UserComparator9.worldSelectArrows[1].drawAt(var27 + 15, 4);
				}

				var0.draw("Type", var27 + 32, 17, 16777215, -1);
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
			var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
			Login.hoveredWorldIndex = -1;
			if (class222.worldSelectBackSprites != null) {
				var3 = 88;
				byte var40 = 19;
				var44 = 765 / (var3 + 1) - 1;
				var27 = 480 / (var40 + 1);

				do {
					var46 = var27;
					var26 = var44;
					if (var27 * (var44 - 1) >= World.World_count) {
						--var44;
					}

					if (var44 * (var27 - 1) >= World.World_count) {
						--var27;
					}

					if (var44 * (var27 - 1) >= World.World_count) {
						--var27;
					}
				} while(var46 != var27 || var26 != var44);

				var46 = (765 - var3 * var44) / (var44 + 1);
				if (var46 > 5) {
					var46 = 5;
				}

				var26 = (480 - var40 * var27) / (var27 + 1);
				if (var26 > 5) {
					var26 = 5;
				}

				var28 = (765 - var3 * var44 - var46 * (var44 - 1)) / 2;
				int var30 = (480 - var40 * var27 - var26 * (var27 - 1)) / 2;
				var37 = (var27 + World.World_count - 1) / var27;
				Login.worldSelectPagesCount = var37 - var44;
				if (class60.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
					class60.worldSelectLeftSprite.drawAt(8, class141.canvasHeight / 2 - class60.worldSelectLeftSprite.subHeight / 2);
				}

				if (PcmPlayer.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
					PcmPlayer.worldSelectRightSprite.drawAt(canvasWidth - PcmPlayer.worldSelectRightSprite.subWidth - 8, class141.canvasHeight / 2 - PcmPlayer.worldSelectRightSprite.subHeight / 2);
				}

				int var39 = var30 + 23;
				int var31 = var28 + Login.xPadding;
				int var32 = 0;
				var15 = false;
				int var41 = Login.worldSelectPage;

				for (var17 = var41 * var27; var17 < World.World_count && var41 - Login.worldSelectPage < var44; ++var17) {
					World var33 = World.World_worlds[var17];
					boolean var19 = true;
					String var20 = Integer.toString(var33.population);
					if (var33.population == -1) {
						var20 = "OFF";
						var19 = false;
					} else if (var33.population > 1980) {
						var20 = "FULL";
						var19 = false;
					}

					class112 var21 = null;
					int var22 = 0;
					if (var33.isBeta()) {
						var21 = var33.isMembersOnly() ? class112.field1435 : class112.field1430;
					} else if (var33.isDeadman()) {
						var21 = var33.isMembersOnly() ? class112.field1443 : class112.field1442;
					} else if (var33.method1873()) {
						var22 = 16711680;
						var21 = var33.isMembersOnly() ? class112.field1444 : class112.field1432;
					} else if (var33.method1885()) {
						var21 = var33.isMembersOnly() ? class112.field1437 : class112.field1434;
					} else if (var33.isPvp()) {
						var21 = var33.isMembersOnly() ? class112.field1440 : class112.field1433;
					} else if (var33.method1876()) {
						var21 = var33.isMembersOnly() ? class112.field1439 : class112.field1438;
					} else if (var33.method1877()) {
						var21 = var33.isMembersOnly() ? class112.field1390 : class112.field1428;
					}

					if (var21 == null || var21.field1431 >= class222.worldSelectBackSprites.length) {
						var21 = var33.isMembersOnly() ? class112.field1429 : class112.field1436;
					}

					if (MouseHandler.MouseHandler_x >= var31 && MouseHandler.MouseHandler_y >= var39 && MouseHandler.MouseHandler_x < var31 + var3 && MouseHandler.MouseHandler_y < var40 + var39 && var19) {
						Login.hoveredWorldIndex = var17;
						class222.worldSelectBackSprites[var21.field1431].drawTransOverlayAt(var31, var39, 128, 16777215);
						var15 = true;
					} else {
						class222.worldSelectBackSprites[var21.field1431].drawAt(var31, var39);
					}

					if (Interpreter.worldSelectFlagSprites != null) {
						Interpreter.worldSelectFlagSprites[(var33.isMembersOnly() ? 8 : 0) + var33.location].drawAt(var31 + 29, var39);
					}

					var0.drawCentered(Integer.toString(var33.id), var31 + 15, var40 / 2 + var39 + 5, var22, -1);
					var1.drawCentered(var20, var31 + 60, var40 / 2 + var39 + 5, 268435455, -1);
					var39 = var39 + var26 + var40;
					++var32;
					if (var32 >= var27) {
						var39 = var30 + 23;
						var31 = var31 + var46 + var3;
						var32 = 0;
						++var41;
					}
				}

				if (var15) {
					var17 = var1.stringWidth(World.World_worlds[Login.hoveredWorldIndex].activity) + 6;
					int var42 = var1.ascent + 8;
					int var43 = MouseHandler.MouseHandler_y + 25;
					if (var42 + var43 > 480) {
						var43 = MouseHandler.MouseHandler_y - 25 - var42;
					}

					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var17 / 2, var43, var17, var42, 16777120);
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var17 / 2, var43, var17, var42, 0);
					var1.drawCentered(World.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var43 + var1.ascent + 4, 0, -1);
				}
			}

		} else {
			SequenceDefinition.leftTitleSprite.drawAt(Login.xPadding, 0);
			FloorOverlayDefinition.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			WorldMapDecorationType.logoSprite.drawAt(Login.xPadding + 382 - WorldMapDecorationType.logoSprite.subWidth / 2, 18);
			if (Client.gameState == 0 || Client.gameState == 5) {
				var3 = 20;
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1);
				var4 = 253 - var3;
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409);
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150 + Login.Login_loadingPercent * 3, var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0);
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1);
			}

			String var6;
			String var7;
			String var8;
			short var34;
			short var36;
			if (Client.gameState == 20) {
				ModeWhere.titleboxSprite.drawAt(Login.loginBoxX + 180 - ModeWhere.titleboxSprite.subWidth / 2, 271 - ModeWhere.titleboxSprite.subHeight / 2);
				var34 = 201;
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var34, 16776960, 0);
				var35 = var34 + 15;
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var35, 16776960, 0);
				var35 += 15;
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var35, 16776960, 0);
				var35 += 15;
				var35 += 7;
				if (Login.loginIndex != 4 && Login.loginIndex != 10) {
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var35, 16777215, 0);
					var36 = 200;
					if (Renderable.clientPreferences.isUsernameHidden()) {
						var8 = Login.Login_username;
						var7 = class395.method7611('*', var8.length());
						var6 = var7;
					} else {
						var6 = Login.Login_username;
					}

					for (var6 = var6; var0.stringWidth(var6) > var36; var6 = var6.substring(0, var6.length() - 1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var6), Login.loginBoxX + 180 - 70, var35, 16777215, 0);
					var35 += 15;
					var8 = Login.Login_password;
					var7 = class395.method7611('*', var8.length());

					String var9;
					for (var9 = var7; var0.stringWidth(var9) > var36; var9 = var9.substring(1)) {
					}

					var0.draw("Password: " + var9, Login.loginBoxX + 180 - 108, var35, 16777215, 0);
					var35 += 15;
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) {
				ModeWhere.titleboxSprite.drawAt(Login.loginBoxX, 171);
				short var23;
				if (Login.loginIndex == 0) {
					var34 = 251;
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var34, 16776960, 0);
					var35 = var34 + 30;
					var4 = Login.loginBoxX + 180 - 80;
					var23 = 291;
					class153.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var4 = Login.loginBoxX + 180 + 80;
					class153.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawLines("Existing User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (Login.loginIndex == 1) {
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0);
					var34 = 236;
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var34, 16777215, 0);
					var35 = var34 + 15;
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var35, 16777215, 0);
					var35 += 15;
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var35, 16777215, 0);
					var35 += 15;
					var4 = Login.loginBoxX + 180 - 80;
					var23 = 321;
					class153.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180 + 80;
					class153.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0);
				} else {
					String var5;
					IndexedSprite var10;
					if (Login.loginIndex == 2) {
						var34 = 201;
						var0.drawCentered(Login.Login_response1, class387.loginBoxCenter, var34, 16776960, 0);
						var35 = var34 + 15;
						var0.drawCentered(Login.Login_response2, class387.loginBoxCenter, var35, 16776960, 0);
						var35 += 15;
						var0.drawCentered(Login.Login_response3, class387.loginBoxCenter, var35, 16776960, 0);
						var35 += 15;
						var35 += 7;
						var0.draw("Login: ", class387.loginBoxCenter - 110, var35, 16777215, 0);
						var36 = 200;

						for (var5 = class356.method6975(); var0.stringWidth(var5) > var36; var5 = var5.substring(1)) {
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? Decimator.colorStartTag(16776960) + "|" : ""), class387.loginBoxCenter - 70, var35, 16777215, 0);
						var35 += 15;
						var7 = Login.Login_password;
						var6 = class395.method7611('*', var7.length());

						for (var8 = var6; var0.stringWidth(var8) > var36; var8 = var8.substring(1)) {
						}

						var0.draw("Password: " + var8 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? Decimator.colorStartTag(16776960) + "|" : ""), class387.loginBoxCenter - 108, var35, 16777215, 0);
						var35 += 15;
						var34 = 277;
						var28 = class387.loginBoxCenter + -117;
						boolean var11 = Client.Login_isUsernameRemembered;
						boolean var12 = Login.field943;
						var10 = var11 ? (var12 ? class76.field919 : class279.options_buttons_2Sprite) : (var12 ? class156.field1763 : class147.options_buttons_0Sprite);
						var10.drawAt(var28, var34);
						var28 = var28 + var10.subWidth + 5;
						var1.draw("Remember username", var28, var34 + 13, 16776960, 0);
						var28 = class387.loginBoxCenter + 24;
						var15 = Renderable.clientPreferences.isUsernameHidden();
						boolean var16 = Login.field952;
						IndexedSprite var14 = var15 ? (var16 ? class76.field919 : class279.options_buttons_2Sprite) : (var16 ? class156.field1763 : class147.options_buttons_0Sprite);
						var14.drawAt(var28, var34);
						var28 = var28 + var14.subWidth + 5;
						var1.draw("Hide username", var28, var34 + 13, 16776960, 0);
						var35 = var34 + 15;
						var17 = class387.loginBoxCenter - 80;
						short var18 = 321;
						class153.titlebuttonSprite.drawAt(var17 - 73, var18 - 20);
						var0.drawCentered("Login", var17, var18 + 5, 16777215, 0);
						var17 = class387.loginBoxCenter + 80;
						class153.titlebuttonSprite.drawAt(var17 - 73, var18 - 20);
						var0.drawCentered("Cancel", var17, var18 + 5, 16777215, 0);
						var34 = 357;
						switch(Login.field956) {
						case 2:
							ItemContainer.field1063 = "Having trouble logging in?";
							break;
						default:
							ItemContainer.field1063 = "Can't login? Click here.";
						}

						SoundCache.field299 = new Bounds(class387.loginBoxCenter, var34, var1.stringWidth(ItemContainer.field1063), 11);
						KeyHandler.field93 = new Bounds(class387.loginBoxCenter, var34, var1.stringWidth("Still having trouble logging in?"), 11);
						var1.drawCentered(ItemContainer.field1063, class387.loginBoxCenter, var34, 16777215, 0);
					} else if (Login.loginIndex == 3) {
						var34 = 201;
						var0.drawCentered("Incorrect username or password.", Login.loginBoxX + 180, var34, 16776960, 0);
						var35 = var34 + 20;
						var1.drawCentered("If you have upgraded to a Jagex Account, you", Login.loginBoxX + 180, var35, 16776960, 0);
						var35 += 20;
						var1.drawCentered("need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", Login.loginBoxX + 180, var35, 16776960, 0);
						var35 += 15;
						var4 = Login.loginBoxX + 180;
						var23 = 276;
						class153.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var2.drawCentered("Try again", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var23 = 326;
						class153.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var2.drawCentered("Forgotten password?", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 4) {
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
						var34 = 236;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var34, 16777215, 0);
						var35 = var34 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var35, 16777215, 0);
						var35 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var35, 16777215, 0);
						var35 += 15;
						var5 = "PIN: ";
						var7 = WorldMapIcon_1.otp;
						var6 = class395.method7611('*', var7.length());
						var0.draw(var5 + var6 + (Client.cycle % 40 < 20 ? Decimator.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var35, 16777215, 0);
						var35 -= 8;
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var35, 16776960, 0);
						var35 += 15;
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var35, 16776960, 0);
						var26 = 180 + Login.loginBoxX - 9 + var0.stringWidth("for 30 days: ") + 15;
						var28 = var35 - var0.ascent;
						if (Login.rememberUsername) {
							var10 = class279.options_buttons_2Sprite;
						} else {
							var10 = class147.options_buttons_0Sprite;
						}

						var10.drawAt(var26, var28);
						var35 += 15;
						var37 = Login.loginBoxX + 180 - 80;
						short var38 = 321;
						class153.titlebuttonSprite.drawAt(var37 - 73, var38 - 20);
						var0.drawCentered("Continue", var37, var38 + 5, 16777215, 0);
						var37 = Login.loginBoxX + 180 + 80;
						class153.titlebuttonSprite.drawAt(var37 - 73, var38 - 20);
						var0.drawCentered("Cancel", var37, var38 + 5, 16777215, 0);
						var1.drawCentered("Can't login? Click here.", Login.loginBoxX + 180, var38 + 36, 16777215, 0);
					} else if (Login.loginIndex == 5) {
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0);
						var34 = 221;
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var34, 16776960, 0);
						var35 = var34 + 15;
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var35, 16776960, 0);
						var35 += 15;
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var35, 16776960, 0);
						var35 += 15;
						var35 += 14;
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var35, 16777215, 0);
						var36 = 174;

						for (var5 = class356.method6975(); var0.stringWidth(var5) > var36; var5 = var5.substring(1)) {
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? Decimator.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var35, 16777215, 0);
						var35 += 15;
						var27 = Login.loginBoxX + 180 - 80;
						short var25 = 321;
						class153.titlebuttonSprite.drawAt(var27 - 73, var25 - 20);
						var0.drawCentered("Recover", var27, var25 + 5, 16777215, 0);
						var27 = Login.loginBoxX + 180 + 80;
						class153.titlebuttonSprite.drawAt(var27 - 73, var25 - 20);
						var0.drawCentered("Back", var27, var25 + 5, 16777215, 0);
						var25 = 356;
						var1.drawCentered("Still having trouble logging in?", class387.loginBoxCenter, var25, 268435455, 0);
					} else if (Login.loginIndex == 6) {
						var34 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var34, 16776960, 0);
						var35 = var34 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var35, 16776960, 0);
						var35 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var35, 16776960, 0);
						var35 += 15;
						var4 = Login.loginBoxX + 180;
						var23 = 321;
						class153.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 7) {
						if (Occluder.field2185 && !Client.onMobile) {
							var34 = 201;
							var0.drawCentered(Login.Login_response1, class387.loginBoxCenter, var34, 16776960, 0);
							var35 = var34 + 15;
							var0.drawCentered(Login.Login_response2, class387.loginBoxCenter, var35, 16776960, 0);
							var35 += 15;
							var0.drawCentered(Login.Login_response3, class387.loginBoxCenter, var35, 16776960, 0);
							var4 = class387.loginBoxCenter - 150;
							var35 += 10;

							for (var44 = 0; var44 < 8; ++var44) {
								class153.titlebuttonSprite.method10751(var4, var35, 30, 40);
								boolean var48 = var44 == Login.field940 & Client.cycle % 40 < 20;
								var0.draw((Login.field933[var44] == null ? "" : Login.field933[var44]) + (var48 ? Decimator.colorStartTag(16776960) + "|" : ""), var4 + 10, var35 + 27, 16777215, 0);
								if (var44 != 1 && var44 != 3) {
									var4 += 35;
								} else {
									var4 += 50;
									var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var35 + 27, 16777215, 0);
								}
							}

							var44 = class387.loginBoxCenter - 80;
							short var49 = 321;
							class153.titlebuttonSprite.drawAt(var44 - 73, var49 - 20);
							var0.drawCentered("Submit", var44, var49 + 5, 16777215, 0);
							var44 = class387.loginBoxCenter + 80;
							class153.titlebuttonSprite.drawAt(var44 - 73, var49 - 20);
							var0.drawCentered("Cancel", var44, var49 + 5, 16777215, 0);
						} else {
							var34 = 216;
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var34, 16776960, 0);
							var35 = var34 + 15;
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var35, 16776960, 0);
							var35 += 15;
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var35, 16776960, 0);
							var35 += 15;
							var4 = Login.loginBoxX + 180 - 80;
							var23 = 321;
							class153.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180 + 80;
							class153.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
						}
					} else if (Login.loginIndex == 8) {
						var34 = 216;
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var34, 16776960, 0);
						var35 = var34 + 15;
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var35, 16776960, 0);
						var35 += 15;
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var35, 16776960, 0);
						var35 += 15;
						var4 = Login.loginBoxX + 180 - 80;
						var23 = 321;
						class153.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Privacy Policy", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						class153.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 9) {
						var34 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var34, 16776960, 0);
						var35 = var34 + 25;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var35, 16776960, 0);
						var35 += 25;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var35, 16776960, 0);
						var4 = Login.loginBoxX + 180;
						var23 = 311;
						class153.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Try again", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 10) {
						var35 = Login.loginBoxX + 180;
						var36 = 209;
						var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var36, 16776960, 0);
						var4 = var36 + 20;
						MenuAction.field917.drawAt(var35 - 109, var4);
						if (Login.displayName.isEmpty()) {
							WorldMapEvent.field3356.drawAt(var35 - 48, var4 + 18);
						} else {
							WorldMapEvent.field3356.drawAt(var35 - 48, var4 + 5);
							var0.drawCentered(Login.displayName, var35, var4 + 68 - 15, 16776960, 0);
						}
					} else if (Login.loginIndex == 12) {
						var35 = class387.loginBoxCenter;
						var36 = 216;
						var2.drawCentered("Before using this app, please read and accept our", var35, var36, 16777215, 0);
						var4 = var36 + 17;
						var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var35, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var35, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("By accepting, you agree to these documents.", var35, var4, 16777215, 0);
						var35 = class387.loginBoxCenter - 80;
						var36 = 311;
						class153.titlebuttonSprite.drawAt(var35 - 73, var36 - 20);
						var0.drawCentered("Accept", var35, var36 + 5, 16777215, 0);
						var35 = class387.loginBoxCenter + 80;
						class153.titlebuttonSprite.drawAt(var35 - 73, var36 - 20);
						var0.drawCentered("Decline", var35, var36 + 5, 16777215, 0);
					} else if (Login.loginIndex == 13) {
						var34 = 231;
						var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var34, 16777215, 0);
						var35 = var34 + 20;
						var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var35, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var34 = 311;
						class153.titlebuttonSprite.drawAt(var4 - 73, var34 - 20);
						var0.drawCentered("Back", var4, var34 + 5, 16777215, 0);
					} else if (Login.loginIndex == 14) {
						var34 = 201;
						String var24 = "";
						var5 = "";
						var6 = "";
						switch(Login.Login_banType) {
						case 0:
							var24 = "Your account has been involved";
							var5 = "in serious rule breaking.";
							var6 = "";
							break;
						case 1:
							var24 = "Your account has been locked due to";
							var5 = "suspicious activity.";
							var6 = "Please recover your account.";
							break;
						case 2:
							var24 = "The unpaid balance on your account needs";
							var5 = "to be resolved before you can play.";
							var6 = Strings.field4268;
							break;
						default:
							class396.Login_promptCredentials(false);
						}

						var0.drawCentered(var24, Login.loginBoxX + 180, var34, 16776960, 0);
						var35 = var34 + 20;
						var0.drawCentered(var5, Login.loginBoxX + 180, var35, 16776960, 0);
						var35 += 20;
						var0.drawCentered(var6, Login.loginBoxX + 180, var35, 16776960, 0);
						var46 = Login.loginBoxX + 180;
						short var47 = 276;
						class153.titlebuttonSprite.drawAt(var46 - 73, var47 - 20);
						if (Login.Login_banType == 1) {
							var0.drawCentered("Recover Account", var46, var47 + 5, 16777215, 0);
						} else {
							var0.drawCentered("View Appeal Options", var46, var47 + 5, 16777215, 0);
						}

						var46 = Login.loginBoxX + 180;
						var47 = 326;
						class153.titlebuttonSprite.drawAt(var46 - 73, var47 - 20);
						var0.drawCentered("Back", var46, var47 + 5, 16777215, 0);
					} else if (Login.loginIndex == 24) {
						var34 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var34, 16777215, 0);
						var35 = var34 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var35, 16777215, 0);
						var35 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var35, 16777215, 0);
						var35 += 15;
						var4 = Login.loginBoxX + 180;
						var23 = 301;
						class153.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Ok", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 32) {
						var34 = 216;
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var34, 16776960, 0);
						var35 = var34 + 15;
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var35, 16776960, 0);
						var35 += 15;
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var35, 16776960, 0);
						var35 += 15;
						var4 = Login.loginBoxX + 180 - 80;
						var23 = 321;
						class153.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						class153.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 33) {
						var34 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var34, 16776960, 0);
						var35 = var34 + 20;
						var1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var35, 16776960, 0);
						var35 += 20;
						var1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var35, 16776960, 0);
						var35 += 15;
						var4 = Login.loginBoxX + 180;
						var23 = 276;
						class153.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var2.drawCentered("Download Launcher", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var23 = 326;
						class153.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var2.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 34) {
						var34 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var34, 16776960, 0);
						var35 = var34 + 20;
						var1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var35, 16776960, 0);
						var35 += 20;
						var1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var35, 16776960, 0);
						var4 = Login.loginBoxX + 180;
						var23 = 276;
						class153.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var6 = class33.World_request != null ? "Loading..." : "Switch World";
						var2.drawCentered(var6, var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var23 = 326;
						class153.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var2.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					}
				}
			}

			if (Client.gameState >= 10) {
				int[] var29 = new int[4];
				Rasterizer2D.Rasterizer2D_getClipArray(var29);
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, class141.canvasHeight);
				WorldMapLabelSize.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
				WorldMapLabelSize.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
				Rasterizer2D.Rasterizer2D_setClipArray(var29);
			}

			ClanChannelMember.title_muteSprite[Renderable.clientPreferences.isTitleMusicDisabled() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
			if (Client.gameState > 5 && Language.Language_EN == class248.clientLanguage) {
				if (FriendsChat.field5123 != null) {
					var35 = Login.xPadding + 5;
					var36 = 463;
					byte var51 = 100;
					byte var50 = 35;
					FriendsChat.field5123.drawAt(var35, var36);
					var0.drawCentered("World" + " " + Client.worldId, var51 / 2 + var35, var50 / 2 + var36 - 2, 16777215, 0);
					if (class33.World_request != null) {
						var1.drawCentered("Loading...", var51 / 2 + var35, var50 / 2 + var36 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var51 / 2 + var35, var50 / 2 + var36 + 12, 16777215, 0);
					}
				} else {
					FriendsChat.field5123 = UserComparator7.SpriteBuffer_getIndexedSpriteByName(class357.archive8, "sl_button", "");
				}
			}

		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lby;I)V",
		garbageValue = "823339339"
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
