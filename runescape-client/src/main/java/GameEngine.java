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

@ObfuscatedName("bm")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1973764755
	)
	@Export("cycleDurationMillis")
	protected static int cycleDurationMillis;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -789935841
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lxf;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lbm;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -695052297
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		longValue = -4464936235612350065L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("az")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1975097745
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("ac")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("ax")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 483945661
	)
	static int field155;
	@ObfuscatedName("ao")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Laq;"
	)
	@Export("keyHandler")
	protected static KeyHandler keyHandler;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		longValue = -2422081617647836193L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		longValue = -948665066413299655L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("bg")
	@Export("eventQueue")
	final EventQueue eventQueue;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1258365107
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 536394127
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("bk")
	protected boolean field171;
	@ObfuscatedName("bb")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -81045837
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 289043297
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 2042370065
	)
	int field147;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -2010281811
	)
	int field168;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -281823465
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1358276921
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("bi")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("by")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("bw")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("bf")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("bn")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		longValue = 3775603242213170231L
	)
	volatile long field176;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("bh")
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
		field155 = 500;
		volatileFocus = true;
		keyHandler = new KeyHandler();
		garbageCollectorLastCollectionTime = -1L;
		garbageCollectorLastCheckTimeMs = -1L;
	}

	protected GameEngine() {
		this.field171 = false;
		this.hasErrored = false;
		this.canvasX = 0;
		this.canvasY = 0;
		this.fullRedraw = true;
		this.resizeCanvasNextFrame = false;
		this.isCanvasInvalid = false;
		this.field176 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.eventQueue = var1;
		DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider();
		class380.pcmPlayerProvider = var2;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "20"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
			this.method542();
		}

		this.maxCanvasWidth = var1;
		this.maxCanvasHeight = var2;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;S)V",
		garbageValue = "29690"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) {
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
				LoginState.method841(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Lih;",
		garbageValue = "0"
	)
	@Export("mouseWheel")
	protected MouseWheel mouseWheel() {
		if (this.mouseWheelHandler == null) {
			this.mouseWheelHandler = new MouseWheelHandler();
			this.mouseWheelHandler.addTo(this.canvas);
		}

		return this.mouseWheelHandler;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "27"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1201993784"
	)
	protected void method525(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "-318851747"
	)
	public Clipboard method526() {
		return this.clipboard;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "115961671"
	)
	@Export("setUpKeyboard")
	protected final void setUpKeyboard() {
		if (class373.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
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

		keyHandler.method403(this.canvas);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "11"
	)
	protected final void method697() {
		keyHandler.method372();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lbs;IB)V",
		garbageValue = "-3"
	)
	protected void method634(class29 var1, int var2) {
		keyHandler.method367(var1, var2);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "58"
	)
	@Export("setUpMouse")
	protected final void setUpMouse() {
		class576.method11319(this.canvas);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "32"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container();
		if (var1 != null) {
			Bounds var2 = this.getFrameContentBounds();
			this.contentWidth = Math.max(var2.highX, this.field147);
			this.contentHeight = Math.max(var2.highY, this.field168);
			if (this.contentWidth <= 0) {
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) {
				this.contentHeight = 1;
			}

			class489.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
			class374.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
			this.canvasX = (this.contentWidth - class489.canvasWidth) / 2;
			this.canvasY = 0;
			this.canvas.setSize(class489.canvasWidth, class374.canvasHeight);
			rasterProvider = new RasterProvider(class489.canvasWidth, class374.canvasHeight, this.canvas, this.field171);
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "43495521"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "95"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX;
		int var2 = this.canvasY;
		int var3 = this.contentWidth - class489.canvasWidth - var1;
		int var4 = this.contentHeight - class374.canvasHeight - var2;
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
		descriptor = "(I)V",
		garbageValue = "2144098864"
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
			this.mouseWheelHandler.method319(this.canvas);
		}

		this.addCanvas();
		keyHandler.method403(this.canvas);
		class576.method11319(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method542();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "411603170"
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
			class489.canvasWidth = var1;
			class374.canvasHeight = var2;
			RunException.RunException_revision = var3;
			class466.field5285 = var4;
			class225.RunException_applet = this.getCodeBase();
			if (taskHandler == null) {
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1);
		} catch (Exception var6) {
			PlayerType.RunException_sendStackTrace((String)null, var6);
			this.error("crash");
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-231674939"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container();
		if (this.canvas != null) {
			this.canvas.removeFocusListener(this);
			var1.remove(this.canvas);
		}

		class489.canvasWidth = Math.max(var1.getWidth(), this.field147);
		class374.canvasHeight = Math.max(var1.getHeight(), this.field168);
		Insets var2;
		if (this.frame != null) {
			var2 = this.frame.getInsets();
			class489.canvasWidth -= var2.right + var2.left;
			class374.canvasHeight -= var2.top + var2.bottom;
		}

		this.canvas = new Canvas(this);
		var1.setBackground(Color.BLACK);
		var1.setLayout((LayoutManager)null);
		var1.add(this.canvas);
		this.canvas.setSize(class489.canvasWidth, class374.canvasHeight);
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
		if (rasterProvider != null && class489.canvasWidth == rasterProvider.width && class374.canvasHeight == rasterProvider.height) {
			((RasterProvider)rasterProvider).setComponent(this.canvas);
			rasterProvider.drawFull(0, 0);
		} else {
			rasterProvider = new RasterProvider(class489.canvasWidth, class374.canvasHeight, this.canvas, this.field171);
		}

		this.isCanvasInvalid = false;
		this.field176 = ParamComposition.method4708();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-31"
	)
	protected void method536(boolean var1) {
		if (this.field171 != var1) {
			this.field171 = var1;
			if (rasterProvider != null) {
				rasterProvider.method12080(var1);
				rasterProvider.apply();
			}
		}

	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2469929"
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

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2130247763"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = ParamComposition.method4708();
		long var3 = clientTickTimes[HorizontalAlignment.field2087];
		clientTickTimes[HorizontalAlignment.field2087] = var1;
		HorizontalAlignment.field2087 = HorizontalAlignment.field2087 + 1 & 31;
		if (0L != var3 && var1 > var3) {
		}

		synchronized(this) {
			class489.hasFocus = volatileFocus;
		}

		this.doCycle();
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1953679235"
	)
	protected final void method539() {
		this.fullRedraw = true;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-154633652"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container();
		long var2 = ParamComposition.method4708();
		long var4 = graphicsTickTimes[FadeOutTask.field5372];
		graphicsTickTimes[FadeOutTask.field5372] = var2;
		FadeOutTask.field5372 = FadeOutTask.field5372 + 1 & 31;
		if (0L != var4 && var2 > var4) {
			int var6 = (int)(var2 - var4);
			fps = ((var6 >> 1) + 32000) / var6;
		}

		if (++field155 - 1 > 50) {
			field155 -= 50;
			this.fullRedraw = true;
			this.canvas.setSize(class489.canvasWidth, class374.canvasHeight);
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

		this.method633();
		this.draw(this.fullRedraw);
		if (this.fullRedraw) {
			this.clearBackground();
		}

		this.fullRedraw = false;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "115"
	)
	final void method633() {
		Bounds var1 = this.getFrameContentBounds();
		if (var1.highX != this.contentWidth || var1.highY != this.contentHeight || this.resizeCanvasNextFrame) {
			this.resizeCanvas();
			this.resizeCanvasNextFrame = false;
		}

	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1595015587"
	)
	final void method542() {
		this.resizeCanvasNextFrame = true;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-316514826"
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

			this.vmethod844();
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1963092833"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "86"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "279644354"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1584049096"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZZB)V",
		garbageValue = "89"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3, boolean var4) {
		try {
			Graphics var5 = this.canvas.getGraphics();
			if (class237.fontHelvetica13 == null) {
				class237.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
				class201.loginScreenFontMetrics = this.canvas.getFontMetrics(class237.fontHelvetica13);
			}

			if (var3 && !var4) {
				var5.setColor(Color.black);
				var5.fillRect(0, 0, class489.canvasWidth, class374.canvasHeight);
			}

			Color var6 = new Color(140, 17, 17);

			try {
				if (class166.field1876 == null) {
					class166.field1876 = this.canvas.createImage(304, 34);
				}

				Graphics var7 = class166.field1876.getGraphics();
				var7.setColor(var6);
				var7.drawRect(0, 0, 303, 33);
				var7.fillRect(2, 2, var1 * 3, 30);
				var7.setColor(Color.black);
				var7.drawRect(1, 1, 301, 31);
				var7.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
				var7.setFont(class237.fontHelvetica13);
				var7.setColor(Color.white);
				var7.drawString(var2, (304 - class201.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
				var5.drawImage(class166.field1876, class489.canvasWidth / 2 - 152, (var4 ? 50 : -18) + class374.canvasHeight / 2, (ImageObserver)null);
			} catch (Exception var10) {
				int var8 = class489.canvasWidth / 2 - 152;
				int var9 = class374.canvasHeight / 2 - 18;
				var5.setColor(var6);
				var5.drawRect(var8, var9, 303, 33);
				var5.fillRect(var8 + 2, var9 + 2, var1 * 3, 30);
				var5.setColor(Color.black);
				var5.drawRect(var8 + 1, var9 + 1, 301, 31);
				var5.fillRect(var1 * 3 + var8 + 2, var9 + 2, 300 - var1 * 3, 30);
				var5.setFont(class237.fontHelvetica13);
				var5.setColor(Color.white);
				var5.drawString(var2, var8 + (304 - class201.loginScreenFontMetrics.stringWidth(var2)) / 2, var9 + 22);
			}
		} catch (Exception var11) {
			this.canvas.repaint();
		}

	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1501290785"
	)
	protected final void method554() {
		class166.field1876 = null;
		class237.fontHelvetica13 = null;
		class201.loginScreenFontMetrics = null;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "1"
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

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/awt/Container;",
		garbageValue = "45"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this);
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)Lrl;",
		garbageValue = "-1821587108"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container();
		int var2 = Math.max(var1.getWidth(), this.field147);
		int var3 = Math.max(var1.getHeight(), this.field168);
		if (this.frame != null) {
			Insets var4 = this.frame.getInsets();
			var2 -= var4.left + var4.right;
			var3 -= var4.top + var4.bottom;
		}

		return new Bounds(var2, var3);
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1151583182"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-40658853"
	)
	protected abstract void vmethod844();

	public final void destroy() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = ParamComposition.method4708();
			LoginState.method841(5000L);
			this.kill();
		}
	}

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) {
			this.fullRedraw = true;
			if (ParamComposition.method4708() - this.field176 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= class489.canvasWidth && var2.height >= class374.canvasHeight) {
					this.isCanvasInvalid = true;
				}
			}

		}
	}

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false;
	}

	public void run() {
		try {
			if (class373.javaVendor != null) {
				String var1 = class373.javaVendor.toLowerCase();
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = TaskHandler.javaVersion;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
						this.error("wrongjava");
						return;
					}

					if (var2.startsWith("1.6.0_")) {
						int var3;
						for (var3 = 6; var3 < var2.length() && class341.isDigit(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (ViewportMouse.isNumber(var4) && Message.method778(var4) < 10) {
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
			class389.clock = class1.method12();

			while (0L == stopTimeMs || ParamComposition.method4708() < stopTimeMs) {
				class142.gameCyclesToDo = class389.clock.wait(cycleDurationMillis, fiveOrOne);

				for (int var5 = 0; var5 < class142.gameCyclesToDo; ++var5) {
					this.clientTick();
				}

				this.graphicsTick();
				this.post(this.canvas);
			}
		} catch (Exception var6) {
			PlayerType.RunException_sendStackTrace((String)null, var6);
			this.error("crash");
		}

		this.kill();
	}

	public final void stop() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = ParamComposition.method4708() + 4000L;
		}
	}

	public final void update(Graphics var1) {
		this.paint(var1);
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

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true;
		this.fullRedraw = true;
	}

	public abstract void init();

	public final void start() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = 0L;
		}
	}

	public final void windowDeactivated(WindowEvent var1) {
	}

	public final void windowOpened(WindowEvent var1) {
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(FFFI)F",
		garbageValue = "637192082"
	)
	public static float method701(float var0, float var1, float var2) {
		if (var1 < var0) {
			throw new IllegalArgumentException("max: " + var1 + " can not be lower than min: " + var0);
		} else {
			return Math.max(var0, Math.min(var2, var1));
		}
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1612957145"
	)
	static boolean method676() {
		return (Client.drawPlayerNames & 4) != 0;
	}
}
