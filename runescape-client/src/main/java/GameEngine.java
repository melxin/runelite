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

@ObfuscatedName("bk")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lbk;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1091519599
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		longValue = 3034525069173872733L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("ah")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1859543969
	)
	@Export("cycleDurationMillis")
	protected static int cycleDurationMillis;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -289326693
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1909287971
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("clock")
	static Clock clock;
	@ObfuscatedName("ai")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 573987859
	)
	static int field180;
	@ObfuscatedName("aj")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 107929487
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -40946499
	)
	static int field171;
	@ObfuscatedName("bf")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lal;"
	)
	@Export("keyHandler")
	protected static KeyHandler keyHandler;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		longValue = -2418597324391138397L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		longValue = 4094180481007997401L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("pf")
	@ObfuscatedSignature(
		descriptor = "[Lnz;"
	)
	static Widget[] field197;
	@ObfuscatedName("ac")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1423763223
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1049770327
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -2059408057
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -586281273
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1399353263
	)
	int field187;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -58375349
	)
	int field182;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 983285829
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1811390847
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("bw")
	protected boolean field205;
	@ObfuscatedName("bz")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("bt")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("ba")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("bk")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("bu")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		longValue = -357849065179662885L
	)
	volatile long field198;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Law;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("bq")
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
		field171 = 500;
		volatileFocus = true;
		keyHandler = new KeyHandler();
		garbageCollectorLastCollectionTime = -1L;
		garbageCollectorLastCheckTimeMs = -1L;
	}

	protected GameEngine() {
		this.hasErrored = false;
		this.canvasX = 0;
		this.canvasY = 0;
		this.field205 = false;
		this.fullRedraw = true;
		this.resizeCanvasNextFrame = false;
		this.isCanvasInvalid = false;
		this.field198 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.eventQueue = var1;
		DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider();
		PcmPlayer.pcmPlayerProvider = var2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1052928630"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
			this.method479();
		}

		this.maxCanvasWidth = var1;
		this.maxCanvasHeight = var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;B)V",
		garbageValue = "-128"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) {
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
				IntProjection.method4837(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Liv;",
		garbageValue = "95"
	)
	@Export("mouseWheel")
	protected MouseWheel mouseWheel() {
		if (this.mouseWheelHandler == null) {
			this.mouseWheelHandler = new MouseWheelHandler();
			this.mouseWheelHandler.addTo(this.canvas);
		}

		return this.mouseWheelHandler;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1045154572"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1801984998"
	)
	protected void method460(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "89"
	)
	public Clipboard method461() {
		return this.clipboard;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		FadeOutTask.method8862();
		keyHandler.method308(this.canvas);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-789570212"
	)
	protected final void method463() {
		keyHandler.method310();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lbz;II)V",
		garbageValue = "2046271834"
	)
	protected void method585(class29 var1, int var2) {
		keyHandler.method306(var1, var2);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1925819876"
	)
	@Export("setUpMouse")
	protected final void setUpMouse() {
		WidgetDefinition.method6937(this.canvas);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "58"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container();
		if (var1 != null) {
			Bounds var2 = this.getFrameContentBounds();
			this.contentWidth = Math.max(var2.highX, this.field187);
			this.contentHeight = Math.max(var2.highY, this.field182);
			if (this.contentWidth <= 0) {
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) {
				this.contentHeight = 1;
			}

			canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
			SwapSongTask.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
			this.canvasX = (this.contentWidth - canvasWidth) / 2;
			this.canvasY = 0;
			this.canvas.setSize(canvasWidth, SwapSongTask.canvasHeight);
			class159.rasterProvider = new RasterProvider(canvasWidth, SwapSongTask.canvasHeight, this.canvas, this.field205);
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-91"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX;
		int var2 = this.canvasY;
		int var3 = this.contentWidth - canvasWidth - var1;
		int var4 = this.contentHeight - SwapSongTask.canvasHeight - var2;
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-54"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		keyHandler.method309(this.canvas);
		Script.method2327(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.method262(this.canvas);
		}

		this.addCanvas();
		keyHandler.method308(this.canvas);
		WidgetDefinition.method6937(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method479();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1296936357"
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
			SwapSongTask.canvasHeight = var2;
			class176.RunException_revision = var3;
			RunException.field5742 = var4;
			RunException.RunException_applet = this;
			if (class332.taskHandler == null) {
				class332.taskHandler = new TaskHandler();
			}

			class332.taskHandler.newThreadTask(this, 1);
		} catch (Exception var6) {
			class213.RunException_sendStackTrace((String)null, var6);
			this.error("crash");
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1919366770"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container();
		if (this.canvas != null) {
			this.canvas.removeFocusListener(this);
			var1.remove(this.canvas);
		}

		canvasWidth = Math.max(var1.getWidth(), this.field187);
		SwapSongTask.canvasHeight = Math.max(var1.getHeight(), this.field182);
		Insets var2;
		if (this.frame != null) {
			var2 = this.frame.getInsets();
			canvasWidth -= var2.right + var2.left;
			SwapSongTask.canvasHeight -= var2.bottom + var2.top;
		}

		this.canvas = new Canvas(this);
		var1.setBackground(Color.BLACK);
		var1.setLayout((LayoutManager)null);
		var1.add(this.canvas);
		this.canvas.setSize(canvasWidth, SwapSongTask.canvasHeight);
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
		if (class159.rasterProvider != null && canvasWidth == class159.rasterProvider.width && SwapSongTask.canvasHeight == class159.rasterProvider.height) {
			((RasterProvider)class159.rasterProvider).setComponent(this.canvas);
			class159.rasterProvider.drawFull(0, 0);
		} else {
			class159.rasterProvider = new RasterProvider(canvasWidth, SwapSongTask.canvasHeight, this.canvas, this.field205);
		}

		this.isCanvasInvalid = false;
		this.field198 = InterfaceParent.method2434();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-99"
	)
	protected void method472(boolean var1) {
		if (this.field205 != var1) {
			this.field205 = var1;
			class159.rasterProvider.method10675(var1);
			class159.rasterProvider.apply();
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-216181318"
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "84"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = InterfaceParent.method2434();
		long var3 = clientTickTimes[class274.field3111];
		clientTickTimes[class274.field3111] = var1;
		class274.field3111 = class274.field3111 + 1 & 31;
		if (0L != var3 && var1 > var3) {
		}

		synchronized(this) {
			class361.hasFocus = volatileFocus;
		}

		this.doCycle();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2117943233"
	)
	protected final void method606() {
		this.fullRedraw = true;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1267661810"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container();
		long var2 = InterfaceParent.method2434();
		long var4 = graphicsTickTimes[field180];
		graphicsTickTimes[field180] = var2;
		field180 = field180 + 1 & 31;
		if (var4 != 0L && var2 > var4) {
			int var6 = (int)(var2 - var4);
			fps = ((var6 >> 1) + 32000) / var6;
		}

		if (++field171 - 1 > 50) {
			field171 -= 50;
			this.fullRedraw = true;
			this.canvas.setSize(canvasWidth, SwapSongTask.canvasHeight);
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

		this.method541();
		this.draw(this.fullRedraw);
		if (this.fullRedraw) {
			this.clearBackground();
		}

		this.fullRedraw = false;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2100298654"
	)
	final void method541() {
		Bounds var1 = this.getFrameContentBounds();
		if (var1.highX != this.contentWidth || this.contentHeight != var1.highY || this.resizeCanvasNextFrame) {
			this.resizeCanvas();
			this.resizeCanvasNextFrame = false;
		}

	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1565877547"
	)
	final void method479() {
		this.resizeCanvasNextFrame = true;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1635265736"
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

			if (class332.taskHandler != null) {
				try {
					class332.taskHandler.close();
				} catch (Exception var2) {
				}
			}

			this.vmethod1227();
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "500223686"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "642293418"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-987889545"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-65"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZZI)V",
		garbageValue = "313342696"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3, boolean var4) {
		try {
			Graphics var5 = this.canvas.getGraphics();
			if (FaceNormal.fontHelvetica13 == null) {
				FaceNormal.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
				class176.loginScreenFontMetrics = this.canvas.getFontMetrics(FaceNormal.fontHelvetica13);
			}

			if (var3 && !var4) {
				var5.setColor(Color.black);
				var5.fillRect(0, 0, canvasWidth, SwapSongTask.canvasHeight);
			}

			Color var6 = new Color(140, 17, 17);

			try {
				if (ArchiveDiskAction.field4631 == null) {
					ArchiveDiskAction.field4631 = this.canvas.createImage(304, 34);
				}

				Graphics var7 = ArchiveDiskAction.field4631.getGraphics();
				var7.setColor(var6);
				var7.drawRect(0, 0, 303, 33);
				var7.fillRect(2, 2, var1 * 3, 30);
				var7.setColor(Color.black);
				var7.drawRect(1, 1, 301, 31);
				var7.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
				var7.setFont(FaceNormal.fontHelvetica13);
				var7.setColor(Color.white);
				var7.drawString(var2, (304 - class176.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
				var5.drawImage(ArchiveDiskAction.field4631, canvasWidth / 2 - 152, (var4 ? 50 : -18) + SwapSongTask.canvasHeight / 2, (ImageObserver)null);
			} catch (Exception var10) {
				int var8 = canvasWidth / 2 - 152;
				int var9 = SwapSongTask.canvasHeight / 2 - 18;
				var5.setColor(var6);
				var5.drawRect(var8, var9, 303, 33);
				var5.fillRect(var8 + 2, var9 + 2, var1 * 3, 30);
				var5.setColor(Color.black);
				var5.drawRect(var8 + 1, var9 + 1, 301, 31);
				var5.fillRect(var8 + var1 * 3 + 2, var9 + 2, 300 - var1 * 3, 30);
				var5.setFont(FaceNormal.fontHelvetica13);
				var5.setColor(Color.white);
				var5.drawString(var2, var8 + (304 - class176.loginScreenFontMetrics.stringWidth(var2)) / 2, var9 + 22);
			}
		} catch (Exception var11) {
			this.canvas.repaint();
		}

	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "98"
	)
	protected final void method476() {
		ArchiveDiskAction.field4631 = null;
		FaceNormal.fontHelvetica13 = null;
		class176.loginScreenFontMetrics = null;
	}

	@ObfuscatedName("bx")
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

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/awt/Container;",
		garbageValue = "45"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this);
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)Lqn;",
		garbageValue = "1539609909"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container();
		int var2 = Math.max(var1.getWidth(), this.field187);
		int var3 = Math.max(var1.getHeight(), this.field182);
		if (this.frame != null) {
			Insets var4 = this.frame.getInsets();
			var2 -= var4.right + var4.left;
			var3 -= var4.bottom + var4.top;
		}

		return new Bounds(var2, var3);
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-526714288"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "46011481"
	)
	protected abstract void vmethod1227();

	public final void destroy() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = InterfaceParent.method2434();
			IntProjection.method4837(5000L);
			this.kill();
		}
	}

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) {
			this.fullRedraw = true;
			if (InterfaceParent.method2434() - this.field198 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= canvasWidth && var2.height >= SwapSongTask.canvasHeight) {
					this.isCanvasInvalid = true;
				}
			}

		}
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

	public final void windowClosed(WindowEvent var1) {
	}

	public final void windowDeactivated(WindowEvent var1) {
	}

	public final void windowDeiconified(WindowEvent var1) {
	}

	public final void windowIconified(WindowEvent var1) {
	}

	public final void windowOpened(WindowEvent var1) {
	}

	public abstract void init();

	public final void windowClosing(WindowEvent var1) {
		this.destroy();
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
					String var2 = TaskHandler.javaVersion;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
						this.error("wrongjava");
						return;
					}

					if (var2.startsWith("1.6.0_")) {
						int var3;
						for (var3 = 6; var3 < var2.length() && FriendsList.isDigit(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (class36.isNumber(var4) && Tiles.method2370(var4) < 10) {
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

			clock = (Clock)var8;

			while (0L == stopTimeMs || InterfaceParent.method2434() < stopTimeMs) {
				DesktopPlatformInfoProvider.gameCyclesToDo = clock.wait(cycleDurationMillis, fiveOrOne);

				for (int var5 = 0; var5 < DesktopPlatformInfoProvider.gameCyclesToDo; ++var5) {
					this.clientTick();
				}

				this.graphicsTick();
				this.post(this.canvas);
			}
		} catch (Exception var7) {
			class213.RunException_sendStackTrace((String)null, var7);
			this.error("crash");
		}

		this.kill();
	}

	public final void stop() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = InterfaceParent.method2434() + 4000L;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lns;I)V",
		garbageValue = "-921717465"
	)
	public static void method618(class341 var0) {
		class335.field3691.remove(var0);
	}
}
