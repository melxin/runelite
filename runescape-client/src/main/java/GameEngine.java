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

@ObfuscatedName("bt")
@Implements("GameEngine")
public abstract class GameEngine extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	@Export("taskHandler")
	protected static TaskHandler taskHandler;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lbt;"
	)
	@Export("gameEngine")
	static GameEngine gameEngine;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1722620173
	)
	@Export("GameEngine_redundantStartThreadCount")
	static int GameEngine_redundantStartThreadCount;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = 5464962418765997645L
	)
	@Export("stopTimeMs")
	static long stopTimeMs;
	@ObfuscatedName("ad")
	@Export("isKilled")
	static boolean isKilled;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -213826595
	)
	@Export("gameCyclesToDo")
	static int gameCyclesToDo;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -754473845
	)
	@Export("cycleDurationMillis")
	protected static int cycleDurationMillis;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 303838851
	)
	@Export("fiveOrOne")
	static int fiveOrOne;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -572708001
	)
	@Export("fps")
	protected static int fps;
	@ObfuscatedName("aq")
	@Export("graphicsTickTimes")
	static long[] graphicsTickTimes;
	@ObfuscatedName("aa")
	@Export("clientTickTimes")
	static long[] clientTickTimes;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1107754689
	)
	static int field176;
	@ObfuscatedName("ba")
	@Export("volatileFocus")
	static volatile boolean volatileFocus;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	@Export("keyHandler")
	protected static KeyHandler keyHandler;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		longValue = 1088414789088896831L
	)
	@Export("garbageCollectorLastCollectionTime")
	static long garbageCollectorLastCollectionTime;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		longValue = 3858079444675219951L
	)
	@Export("garbageCollectorLastCheckTimeMs")
	static long garbageCollectorLastCheckTimeMs;
	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	@Export("topLevelWorldView")
	static WorldView topLevelWorldView;
	@ObfuscatedName("an")
	@Export("hasErrored")
	boolean hasErrored;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1428336891
	)
	@Export("contentWidth")
	protected int contentWidth;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -812457647
	)
	@Export("contentHeight")
	protected int contentHeight;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -315770341
	)
	@Export("canvasX")
	int canvasX;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1665662357
	)
	@Export("canvasY")
	int canvasY;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2015058129
	)
	int field170;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -587645521
	)
	int field171;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 544990267
	)
	@Export("maxCanvasWidth")
	int maxCanvasWidth;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 2035349253
	)
	@Export("maxCanvasHeight")
	int maxCanvasHeight;
	@ObfuscatedName("bh")
	protected boolean field174;
	@ObfuscatedName("bx")
	@Export("frame")
	Frame frame;
	@ObfuscatedName("bd")
	@Export("canvas")
	java.awt.Canvas canvas;
	@ObfuscatedName("bi")
	@Export("fullRedraw")
	volatile boolean fullRedraw;
	@ObfuscatedName("bf")
	@Export("resizeCanvasNextFrame")
	boolean resizeCanvasNextFrame;
	@ObfuscatedName("by")
	@Export("isCanvasInvalid")
	volatile boolean isCanvasInvalid;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		longValue = 9000124658905312171L
	)
	volatile long field183;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	@Export("mouseWheelHandler")
	MouseWheelHandler mouseWheelHandler;
	@ObfuscatedName("bv")
	@Export("clipboard")
	Clipboard clipboard;
	@ObfuscatedName("bq")
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
		field176 = 500;
		volatileFocus = true;
		keyHandler = new KeyHandler();
		garbageCollectorLastCollectionTime = -1L;
		garbageCollectorLastCheckTimeMs = -1L;
	}

	protected GameEngine() {
		this.hasErrored = false;
		this.canvasX = 0;
		this.canvasY = 0;
		this.field174 = false;
		this.fullRedraw = true;
		this.resizeCanvasNextFrame = false;
		this.isCanvasInvalid = false;
		this.field183 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.eventQueue = var1;
		DevicePcmPlayerProvider var2 = new DevicePcmPlayerProvider();
		class355.pcmPlayerProvider = var2;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "307314874"
	)
	@Export("setMaxCanvasSize")
	protected final void setMaxCanvasSize(int var1, int var2) {
		if (this.maxCanvasWidth != var1 || var2 != this.maxCanvasHeight) {
			this.method640();
		}

		this.maxCanvasWidth = var1;
		this.maxCanvasHeight = var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)V",
		garbageValue = "-1433952013"
	)
	@Export("post")
	final void post(Object var1) {
		if (this.eventQueue != null) {
			for (int var2 = 0; var2 < 50 && this.eventQueue.peekEvent() != null; ++var2) {
				class174.method3881(1L);
			}

			if (var1 != null) {
				this.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Lis;",
		garbageValue = "54929218"
	)
	@Export("mouseWheel")
	protected MouseWheel mouseWheel() {
		if (this.mouseWheelHandler == null) {
			this.mouseWheelHandler = new MouseWheelHandler();
			this.mouseWheelHandler.addTo(this.canvas);
		}

		return this.mouseWheelHandler;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-48"
	)
	@Export("setUpClipboard")
	protected void setUpClipboard() {
		this.clipboard = this.getToolkit().getSystemClipboard();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "64"
	)
	protected void method529(String var1) {
		this.clipboard.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "-1024779189"
	)
	protected Clipboard method551() {
		return this.clipboard;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "41"
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "206898290"
	)
	protected final void method532() {
		keyHandler.method364();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lbb;II)V",
		garbageValue = "-1559149149"
	)
	protected void method533(class29 var1, int var2) {
		keyHandler.method368(var1, var2);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-1839"
	)
	@Export("setUpMouse")
	protected final void setUpMouse() {
		class131.method3379(this.canvas);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-670717205"
	)
	@Export("resizeCanvas")
	final void resizeCanvas() {
		Container var1 = this.container();
		if (var1 != null) {
			Bounds var2 = this.getFrameContentBounds();
			this.contentWidth = Math.max(var2.highX, this.field170);
			this.contentHeight = Math.max(var2.highY, this.field171);
			if (this.contentWidth <= 0) {
				this.contentWidth = 1;
			}

			if (this.contentHeight <= 0) {
				this.contentHeight = 1;
			}

			BuddyRankComparator.canvasWidth = Math.min(this.contentWidth, this.maxCanvasWidth);
			Huffman.canvasHeight = Math.min(this.contentHeight, this.maxCanvasHeight);
			this.canvasX = (this.contentWidth - BuddyRankComparator.canvasWidth) / 2;
			this.canvasY = 0;
			this.canvas.setSize(BuddyRankComparator.canvasWidth, Huffman.canvasHeight);
			class6.rasterProvider = new RasterProvider(BuddyRankComparator.canvasWidth, Huffman.canvasHeight, this.canvas, this.field174);
			if (var1 == this.frame) {
				Insets var3 = this.frame.getInsets();
				this.canvas.setLocation(this.canvasX + var3.left, this.canvasY + var3.top);
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
		garbageValue = "1848806273"
	)
	@Export("resizeGame")
	protected abstract void resizeGame();

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1259549085"
	)
	@Export("clearBackground")
	void clearBackground() {
		int var1 = this.canvasX;
		int var2 = this.canvasY;
		int var3 = this.contentWidth - BuddyRankComparator.canvasWidth - var1;
		int var4 = this.contentHeight - Huffman.canvasHeight - var2;
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "901715879"
	)
	@Export("replaceCanvas")
	final void replaceCanvas() {
		keyHandler.method363(this.canvas);
		ClanChannelMember.method3609(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.method311(this.canvas);
		}

		this.addCanvas();
		keyHandler.method361(this.canvas);
		class131.method3379(this.canvas);
		if (this.mouseWheelHandler != null) {
			this.mouseWheelHandler.addTo(this.canvas);
		}

		this.method640();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1610291587"
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
			BuddyRankComparator.canvasWidth = var1;
			Huffman.canvasHeight = var2;
			RunException.RunException_revision = var3;
			class484.field5050 = var4;
			RunException.RunException_applet = this;
			if (taskHandler == null) {
				taskHandler = new TaskHandler();
			}

			taskHandler.newThreadTask(this, 1);
		} catch (Exception var6) {
			class255.RunException_sendStackTrace((String)null, var6);
			this.error("crash");
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1182885754"
	)
	@Export("addCanvas")
	final synchronized void addCanvas() {
		Container var1 = this.container();
		if (this.canvas != null) {
			this.canvas.removeFocusListener(this);
			var1.remove(this.canvas);
		}

		BuddyRankComparator.canvasWidth = Math.max(var1.getWidth(), this.field170);
		Huffman.canvasHeight = Math.max(var1.getHeight(), this.field171);
		Insets var2;
		if (this.frame != null) {
			var2 = this.frame.getInsets();
			BuddyRankComparator.canvasWidth -= var2.left + var2.right;
			Huffman.canvasHeight -= var2.top + var2.bottom;
		}

		this.canvas = new Canvas(this);
		var1.setBackground(Color.BLACK);
		var1.setLayout((LayoutManager)null);
		var1.add(this.canvas);
		this.canvas.setSize(BuddyRankComparator.canvasWidth, Huffman.canvasHeight);
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
		if (class6.rasterProvider != null && BuddyRankComparator.canvasWidth == class6.rasterProvider.width && Huffman.canvasHeight == class6.rasterProvider.height) {
			((RasterProvider)class6.rasterProvider).setComponent(this.canvas);
			class6.rasterProvider.drawFull(0, 0);
		} else {
			class6.rasterProvider = new RasterProvider(BuddyRankComparator.canvasWidth, Huffman.canvasHeight, this.canvas, this.field174);
		}

		this.isCanvasInvalid = false;
		this.field183 = ReflectionCheck.method724();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "107"
	)
	protected void method541(boolean var1) {
		if (this.field174 != var1) {
			this.field174 = var1;
			class6.rasterProvider.method10691(var1);
			class6.rasterProvider.apply();
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "82"
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
		descriptor = "(I)V",
		garbageValue = "42542346"
	)
	@Export("clientTick")
	void clientTick() {
		long var1 = ReflectionCheck.method724();
		long var3 = clientTickTimes[class561.field5532];
		clientTickTimes[class561.field5532] = var1;
		class561.field5532 = class561.field5532 + 1 & 31;
		if (0L != var3 && var1 > var3) {
		}

		synchronized(this) {
			SecureRandomFuture.hasFocus = volatileFocus;
		}

		this.doCycle();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "706177694"
	)
	protected final void method544() {
		this.fullRedraw = true;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2017959842"
	)
	@Export("graphicsTick")
	void graphicsTick() {
		Container var1 = this.container();
		long var2 = ReflectionCheck.method724();
		long var4 = graphicsTickTimes[Ignored.field5015];
		graphicsTickTimes[Ignored.field5015] = var2;
		Ignored.field5015 = Ignored.field5015 + 1 & 31;
		if (var4 != 0L && var2 > var4) {
			int var6 = (int)(var2 - var4);
			fps = ((var6 >> 1) + 32000) / var6;
		}

		if (++field176 - 1 > 50) {
			field176 -= 50;
			this.fullRedraw = true;
			this.canvas.setSize(BuddyRankComparator.canvasWidth, Huffman.canvasHeight);
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

		this.method546();
		this.draw(this.fullRedraw);
		if (this.fullRedraw) {
			this.clearBackground();
		}

		this.fullRedraw = false;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1446954978"
	)
	final void method546() {
		Bounds var1 = this.getFrameContentBounds();
		if (var1.highX != this.contentWidth || this.contentHeight != var1.highY || this.resizeCanvasNextFrame) {
			this.resizeCanvas();
			this.resizeCanvasNextFrame = false;
		}

	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-124"
	)
	final void method640() {
		this.resizeCanvasNextFrame = true;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "97"
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

			this.vmethod1282();
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-494623143"
	)
	@Export("setUp")
	protected abstract void setUp();

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1077900572"
	)
	@Export("doCycle")
	protected abstract void doCycle();

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-861113109"
	)
	@Export("draw")
	protected abstract void draw(boolean var1);

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-12"
	)
	@Export("kill0")
	protected abstract void kill0();

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;ZZI)V",
		garbageValue = "441069439"
	)
	@Export("drawInitial")
	protected final void drawInitial(int var1, String var2, boolean var3, boolean var4) {
		try {
			Graphics var5 = this.canvas.getGraphics();
			if (class197.fontHelvetica13 == null) {
				class197.fontHelvetica13 = new java.awt.Font("Helvetica", 1, 13);
				UserComparator5.loginScreenFontMetrics = this.canvas.getFontMetrics(class197.fontHelvetica13);
			}

			if (var3 && !var4) {
				var5.setColor(Color.black);
				var5.fillRect(0, 0, BuddyRankComparator.canvasWidth, Huffman.canvasHeight);
			}

			Color var6 = new Color(140, 17, 17);

			try {
				if (class232.field2500 == null) {
					class232.field2500 = this.canvas.createImage(304, 34);
				}

				Graphics var7 = class232.field2500.getGraphics();
				var7.setColor(var6);
				var7.drawRect(0, 0, 303, 33);
				var7.fillRect(2, 2, var1 * 3, 30);
				var7.setColor(Color.black);
				var7.drawRect(1, 1, 301, 31);
				var7.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
				var7.setFont(class197.fontHelvetica13);
				var7.setColor(Color.white);
				var7.drawString(var2, (304 - UserComparator5.loginScreenFontMetrics.stringWidth(var2)) / 2, 22);
				var5.drawImage(class232.field2500, BuddyRankComparator.canvasWidth / 2 - 152, Huffman.canvasHeight / 2 + (var4 ? 50 : -18), (ImageObserver)null);
			} catch (Exception var10) {
				int var8 = BuddyRankComparator.canvasWidth / 2 - 152;
				int var9 = Huffman.canvasHeight / 2 - 18;
				var5.setColor(var6);
				var5.drawRect(var8, var9, 303, 33);
				var5.fillRect(var8 + 2, var9 + 2, var1 * 3, 30);
				var5.setColor(Color.black);
				var5.drawRect(var8 + 1, var9 + 1, 301, 31);
				var5.fillRect(var1 * 3 + var8 + 2, var9 + 2, 300 - var1 * 3, 30);
				var5.setFont(class197.fontHelvetica13);
				var5.setColor(Color.white);
				var5.drawString(var2, var8 + (304 - UserComparator5.loginScreenFontMetrics.stringWidth(var2)) / 2, var9 + 22);
			}
		} catch (Exception var11) {
			this.canvas.repaint();
		}

	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "79"
	)
	protected final void method557() {
		class232.field2500 = null;
		class197.fontHelvetica13 = null;
		UserComparator5.loginScreenFontMetrics = null;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-342460508"
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
		descriptor = "(B)Ljava/awt/Container;",
		garbageValue = "64"
	)
	@Export("container")
	Container container() {
		return (Container)(this.frame != null ? this.frame : this);
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)Lql;",
		garbageValue = "-381002297"
	)
	@Export("getFrameContentBounds")
	Bounds getFrameContentBounds() {
		Container var1 = this.container();
		int var2 = Math.max(var1.getWidth(), this.field170);
		int var3 = Math.max(var1.getHeight(), this.field171);
		if (this.frame != null) {
			Insets var4 = this.frame.getInsets();
			var2 -= var4.right + var4.left;
			var3 -= var4.bottom + var4.top;
		}

		return new Bounds(var2, var3);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "44"
	)
	@Export("hasFrame")
	protected final boolean hasFrame() {
		return this.frame != null;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "26444"
	)
	protected abstract void vmethod1282();

	public final void destroy() {
		if (this == gameEngine && !isKilled) {
			stopTimeMs = ReflectionCheck.method724();
			class174.method3881(5000L);
			this.kill();
		}
	}

	public final synchronized void paint(Graphics var1) {
		if (this == gameEngine && !isKilled) {
			this.fullRedraw = true;
			if (ReflectionCheck.method724() - this.field183 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= BuddyRankComparator.canvasWidth && var2.height >= Huffman.canvasHeight) {
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
						for (var3 = 6; var3 < var2.length() && Huffman.isDigit(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (class426.isNumber(var4) && class278.method5972(var4) < 10) {
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

			RestClientThreadFactory.clock = (Clock)var8;

			while (0L == stopTimeMs || ReflectionCheck.method724() < stopTimeMs) {
				gameCyclesToDo = RestClientThreadFactory.clock.wait(cycleDurationMillis, fiveOrOne);

				for (int var5 = 0; var5 < gameCyclesToDo; ++var5) {
					this.clientTick();
				}

				this.graphicsTick();
				this.post(this.canvas);
			}
		} catch (Exception var7) {
			class255.RunException_sendStackTrace((String)null, var7);
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
			stopTimeMs = ReflectionCheck.method724() + 4000L;
		}
	}

	public final void update(Graphics var1) {
		this.paint(var1);
	}

	public final void focusGained(FocusEvent var1) {
		volatileFocus = true;
		this.fullRedraw = true;
	}

	public final void windowActivated(WindowEvent var1) {
	}

	public final void windowClosing(WindowEvent var1) {
		this.destroy();
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

	public final void windowClosed(WindowEvent var1) {
	}

	public final void focusLost(FocusEvent var1) {
		volatileFocus = false;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Ldm;",
		garbageValue = "1197299643"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class167.archive12.takeFile(var0, 0);
			if (var2 == null) {
				return null;
			} else {
				var1 = GrandExchangeOfferAgeComparator.newScript(var2);
				Script.Script_cached.put(var1, (long)var0);
				return var1;
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZI)[B",
		garbageValue = "2006237067"
	)
	public static byte[] method676(Object var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var6 = (byte[])((byte[])var0);
			if (var1) {
				int var4 = var6.length;
				byte[] var5 = new byte[var4];
				System.arraycopy(var6, 0, var5, 0, var4);
				return var5;
			} else {
				return var6;
			}
		} else if (var0 instanceof AbstractByteArrayCopier) {
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0;
			return var2.get();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIILkl;II)V",
		garbageValue = "2089784113"
	)
	@Export("createObjectSound")
	static void createObjectSound(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		ObjectSound var5 = new ObjectSound();
		var5.plane = var0;
		var5.x = var1 * 16384;
		var5.y = var2 * 128;
		int var6 = var3.sizeX;
		int var7 = var3.sizeY;
		if (var4 == 1 || var4 == 3) {
			var6 = var3.sizeY;
			var7 = var3.sizeX;
		}

		var5.maxX = (var6 + var1) * 128;
		var5.maxY = (var7 + var2) * 128;
		var5.soundEffectId = var3.ambientSoundId;
		var5.field840 = var3.int7 * 128;
		var5.field841 = Math.max(var3.int8 * 16384 - 128, 0);
		var5.field844 = var3.int5;
		var5.field845 = var3.int6;
		var5.soundEffectIds = var3.soundEffectIds;
		if (var3.transforms != null) {
			var5.obj = var3;
			var5.set();
		}

		ObjectSound.objectSounds.addFirst(var5);
		if (var5.soundEffectIds != null) {
			var5.field847 = var5.field844 + (int)(Math.random() * (double)(var5.field845 - var5.field844));
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1884954619"
	)
	public static boolean method673(int var0) {
		return (var0 >> 20 & 1) != 0;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZS)I",
		garbageValue = "128"
	)
	static int method549(int var0, Script var1, boolean var2) {
		return 2;
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(Lok;Ljava/lang/String;B)V",
		garbageValue = "0"
	)
	static void method677(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1);
		Client.archiveLoaders.add(var2);
		Client.field692 += var2.groupCount;
	}
}
