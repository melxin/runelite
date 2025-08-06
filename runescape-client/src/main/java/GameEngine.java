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

@ObfuscatedName("bv")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -287344415
	)
	@Export("cycleDurationMillis")
	protected static int cycleDurationMillis;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1745632755
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -984168365
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lbv;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 2131695607
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = 1844134795696425L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("aa")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 782678007
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("clock")
	static Clock clock;
	@ObfuscatedName("at")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("aq")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 2090373983
	)
	static int field171;
	@ObfuscatedName("an")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	@Export("keyHandler")
	protected static KeyHandler keyHandler;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		longValue = -5804595251213292249L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		longValue = -8825570509889612289L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("bw")
	@Export("eventQueue")
	final EventQueue eventQueue;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1914503983
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1246994645
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("bm")
	protected boolean field179;
	@ObfuscatedName("bq")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 396936785
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1866308131
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -804005911
	)
	int field189;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 47819017
	)
	int field184;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -48003935
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1826856097
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("br")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("ba")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("bh")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("bg")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("bt")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		longValue = -793224237259274477L
	)
	volatile long field168;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("bp")
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
		field171 = 500;
		volatileFocus = true;
		keyHandler = new KeyHandler();
		garbageCollectorLastCollectionTime = -1L;
		garbageCollectorLastCheckTimeMs = -1L;
	}

	protected GameEngine() {
		this.field179 = false;
		this.hasErrored = false;
		this.canvasX = 0;
		this.canvasY = 0;
		this.fullRedraw = true;
		this.resizeCanvasNextFrame = false;
		this.isCanvasInvalid = false;
		this.field168 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.eventQueue = var1;
		DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider();
		MoveSpeed.pcmPlayerProvider = var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "11570"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
			this.method575();
		}

		this.maxCanvasWidth = var1;
		this.maxCanvasHeight = var2;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "1081824794"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) {
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
				UserComparator4.method3477(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ljs;",
		garbageValue = "-832398595"
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
		garbageValue = "64"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-114541627"
	)
	protected void method654(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "2050129759"
	)
	protected Clipboard method531() {
		return this.clipboard;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-39"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		class303.method6822();
		keyHandler.method370(this.canvas);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1465188028"
	)
	protected final void method617() {
		keyHandler.method372();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lbw;II)V",
		garbageValue = "-340017510"
	)
	protected void method534(class29 var1, int var2) {
		keyHandler.method367(var1, var2);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1667159788"
	)
	@Export("setUpMouse")
	protected final void setUpMouse() {
		WorldMapDecorationType.method8151(this.canvas);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1415505838"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container();
		if (var1 != null) {
			Bounds var2 = this.getFrameContentBounds();
			this.contentWidth = Math.max(var2.highX, this.field189);
			this.contentHeight = Math.max(var2.highY, this.field184);
			if (this.contentWidth <= 0) {
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) {
				this.contentHeight = 1;
			}

			RestClientThreadFactory.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
			canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
			this.canvasX = (this.contentWidth - RestClientThreadFactory.canvasWidth) / 2;
			this.canvasY = 0;
			this.canvas.setSize(RestClientThreadFactory.canvasWidth, canvasHeight);
			Interpreter.rasterProvider = new RasterProvider(RestClientThreadFactory.canvasWidth, canvasHeight, this.canvas, this.field179);
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "857834168"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "835123016"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX;
		int var2 = this.canvasY;
		int var3 = this.contentWidth - RestClientThreadFactory.canvasWidth - var1;
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-11"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		keyHandler.method371(this.canvas);
		java.awt.Canvas var1 = this.canvas;
		var1.removeMouseListener(MouseHandler.MouseHandler_instance);
		var1.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
		var1.removeFocusListener(MouseHandler.MouseHandler_instance);
		MouseHandler.MouseHandler_currentButtonVolatile = 0;
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.method327(this.canvas);
		}

		this.addCanvas();
		keyHandler.method370(this.canvas);
		WorldMapDecorationType.method8151(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method575();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-183065890"
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
			RestClientThreadFactory.canvasWidth = var1;
			canvasHeight = var2;
			RunException.RunException_revision = var3;
			class557.field5665 = var4;
			RunException.RunException_applet = this;
			if (taskHandler == null) {
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1);
		} catch (Exception var6) {
			class559.RunException_sendStackTrace((String)null, var6);
			this.error("crash");
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2128269090"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container();
		if (this.canvas != null) {
			this.canvas.removeFocusListener(this);
			var1.remove(this.canvas);
		}

		RestClientThreadFactory.canvasWidth = Math.max(var1.getWidth(), this.field189);
		canvasHeight = Math.max(var1.getHeight(), this.field184);
		Insets var2;
		if (this.frame != null) {
			var2 = this.frame.getInsets();
			RestClientThreadFactory.canvasWidth -= var2.right + var2.left;
			canvasHeight -= var2.bottom + var2.top;
		}

		this.canvas = new Canvas(this);
		var1.setBackground(Color.BLACK);
		var1.setLayout((LayoutManager)null);
		var1.add(this.canvas);
		this.canvas.setSize(RestClientThreadFactory.canvasWidth, canvasHeight);
		this.canvas.setVisible(true);
		this.canvas.setBackground(Color.BLACK);
		if (var1 == this.frame) {
			var2 = this.frame.getInsets();
			this.canvas.setLocation(var2.left + this.canvasX, this.canvasY + var2.top);
		} else {
			this.canvas.setLocation(this.canvasX, this.canvasY);
		}

		this.canvas.addFocusListener(this);
		this.canvas.requestFocus();
		this.fullRedraw = true;
		if (Interpreter.rasterProvider != null && RestClientThreadFactory.canvasWidth == Interpreter.rasterProvider.width && canvasHeight == Interpreter.rasterProvider.height) {
			((RasterProvider)Interpreter.rasterProvider).setComponent(this.canvas);
			Interpreter.rasterProvider.drawFull(0, 0);
		} else {
			Interpreter.rasterProvider = new RasterProvider(RestClientThreadFactory.canvasWidth, canvasHeight, this.canvas, this.field179);
		}

		this.isCanvasInvalid = false;
		this.field168 = UserComparator7.method3496();
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1013939130"
	)
	protected void method542(boolean var1) {
		if (this.field179 != var1) {
			this.field179 = var1;
			Interpreter.rasterProvider.method11658(var1);
			Interpreter.rasterProvider.apply();
		}

	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "10"
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

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "24954"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = UserComparator7.method3496();
		long var3 = clientTickTimes[ModeWhere.field4995];
		clientTickTimes[ModeWhere.field4995] = var1;
		ModeWhere.field4995 = ModeWhere.field4995 + 1 & 31;
		if (var3 != 0L && var1 > var3) {
		}

		synchronized(this) {
			WorldMapScaleHandler.hasFocus = volatileFocus;
		}

		this.doCycle();
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "416269589"
	)
	protected final void method546() {
		this.fullRedraw = true;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-78"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container();
		long var2 = UserComparator7.method3496();
		long var4 = graphicsTickTimes[MusicPatchPcmStream.field3876];
		graphicsTickTimes[MusicPatchPcmStream.field3876] = var2;
		MusicPatchPcmStream.field3876 = MusicPatchPcmStream.field3876 + 1 & 31;
		if (0L != var4 && var2 > var4) {
			int var6 = (int)(var2 - var4);
			fps = ((var6 >> 1) + 32000) / var6;
		}

		if (++field171 - 1 > 50) {
			field171 -= 50;
			this.fullRedraw = true;
			this.canvas.setSize(RestClientThreadFactory.canvasWidth, canvasHeight);
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

		this.method548();
		this.draw(this.fullRedraw);
		if (this.fullRedraw) {
			this.clearBackground();
		}

		this.fullRedraw = false;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1553618919"
	)
	final void method548() {
		Bounds var1 = this.getFrameContentBounds();
		if (this.contentWidth != var1.highX || this.contentHeight != var1.highY || this.resizeCanvasNextFrame) {
			this.resizeCanvas();
			this.resizeCanvasNextFrame = false;
		}

	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-273023611"
	)
	final void method575() {
		this.resizeCanvasNextFrame = true;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-8669"
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

			this.vmethod818();
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-93"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "33"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-67"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1384501574"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZZI)V",
		garbageValue = "10433818"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3, boolean var4) {
		try {
			Graphics var5 = this.canvas.getGraphics();
			if (FloorUnderlayDefinition.fontHelvetica13 == null) {
				FloorUnderlayDefinition.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
				class114.loginScreenFontMetrics = this.canvas.getFontMetrics(FloorUnderlayDefinition.fontHelvetica13);
			}

			if (var3 && !var4) {
				var5.setColor(Color.black);
				var5.fillRect(0, 0, RestClientThreadFactory.canvasWidth, canvasHeight);
			}

			Color var6 = new Color(140, 17, 17);

			try {
				if (UserComparator3.field1563 == null) {
					UserComparator3.field1563 = this.canvas.createImage(304, 34);
				}

				Graphics var7 = UserComparator3.field1563.getGraphics();
				var7.setColor(var6);
				var7.drawRect(0, 0, 303, 33);
				var7.fillRect(2, 2, var1 * 3, 30);
				var7.setColor(Color.black);
				var7.drawRect(1, 1, 301, 31);
				var7.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
				var7.setFont(FloorUnderlayDefinition.fontHelvetica13);
				var7.setColor(Color.white);
				var7.drawString(var2, (304 - class114.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
				var5.drawImage(UserComparator3.field1563, RestClientThreadFactory.canvasWidth / 2 - 152, (var4 ? 50 : -18) + canvasHeight / 2, (ImageObserver)null);
			} catch (Exception var10) {
				int var8 = RestClientThreadFactory.canvasWidth / 2 - 152;
				int var9 = canvasHeight / 2 - 18;
				var5.setColor(var6);
				var5.drawRect(var8, var9, 303, 33);
				var5.fillRect(var8 + 2, var9 + 2, var1 * 3, 30);
				var5.setColor(Color.black);
				var5.drawRect(var8 + 1, var9 + 1, 301, 31);
				var5.fillRect(var8 + var1 * 3 + 2, var9 + 2, 300 - var1 * 3, 30);
				var5.setFont(FloorUnderlayDefinition.fontHelvetica13);
				var5.setColor(Color.white);
				var5.drawString(var2, var8 + (304 - class114.loginScreenFontMetrics.stringWidth(var2)) / 2, var9 + 22);
			}
		} catch (Exception var11) {
			this.canvas.repaint();
		}

	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "95421911"
	)
	protected final void method561() {
		UserComparator3.field1563 = null;
		FloorUnderlayDefinition.fontHelvetica13 = null;
		class114.loginScreenFontMetrics = null;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1235949885"
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

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/Container;",
		garbageValue = "235674915"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this);
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)Lri;",
		garbageValue = "-222746026"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container();
		int var2 = Math.max(var1.getWidth(), this.field189);
		int var3 = Math.max(var1.getHeight(), this.field184);
		if (this.frame != null) {
			Insets var4 = this.frame.getInsets();
			var2 -= var4.left + var4.right;
			var3 -= var4.bottom + var4.top;
		}

		return new Bounds(var2, var3);
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1224009012"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1087874578"
	)
	protected abstract void vmethod818();

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) {
			this.fullRedraw = true;
			if (UserComparator7.method3496() - this.field168 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= RestClientThreadFactory.canvasWidth && var2.height >= canvasHeight) {
					this.isCanvasInvalid = true;
				}
			}

		}
	}

	public final void destroy() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = UserComparator7.method3496();
			UserComparator4.method3477(5000L);
			this.kill();
		}
	}

	public final void update(Graphics var1) {
		this.paint(var1);
	}

	public final void stop() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = UserComparator7.method3496() + 4000L;
		}
	}

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true;
		this.fullRedraw = true;
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

	public final void windowOpened(WindowEvent var1) {
	}

	public abstract void init();

	public void run() {
		try {
			if (class358.javaVendor != null) {
				String var1 = class358.javaVendor.toLowerCase();
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = TaskHandler.javaVersion;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
						this.error("wrongjava");
						return;
					}

					if (var2.startsWith("1.6.0_")) {
						int var3;
						for (var3 = 6; var3 < var2.length() && class312.isDigit(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (class427.isNumber(var4) && HttpResponse.method313(var4) < 10) {
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

			while (0L == stopTimeMs || UserComparator7.method3496() < stopTimeMs) {
				VarbitComposition.gameCyclesToDo = clock.wait(cycleDurationMillis, fiveOrOne);

				for (int var5 = 0; var5 < VarbitComposition.gameCyclesToDo; ++var5) {
					this.clientTick();
				}

				this.graphicsTick();
				this.post(this.canvas);
			}
		} catch (Exception var7) {
			class559.RunException_sendStackTrace((String)null, var7);
			this.error("crash");
		}

		this.kill();
	}

	public final void windowIconified(WindowEvent var1) {
	}

	public final void start() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = 0L;
		}
	}

	public final void windowDeactivated(WindowEvent var1) {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lia;I)Z",
		garbageValue = "694910022"
	)
	static boolean method650(ObjectComposition var0) {
		if (var0.transforms != null) {
			int[] var1 = var0.transforms;

			for (int var2 = 0; var2 < var1.length; ++var2) {
				int var3 = var1[var2];
				ObjectComposition var4 = SpriteMask.getObjectDefinition(var3);
				if (var4.mapIconId != -1) {
					return true;
				}
			}
		} else if (var0.mapIconId != -1) {
			return true;
		}

		return false;
	}
}
