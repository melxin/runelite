import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lbu;"
	)
	@Export("MouseHandler_instance")
	public static MouseHandler MouseHandler_instance;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -2974195
	)
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 454327291
	)
	@Export("MouseHandler_currentButtonVolatile")
	static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 666091219
	)
	@Export("MouseHandler_xVolatile")
	static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1255228043
	)
	@Export("MouseHandler_yVolatile")
	static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		longValue = -8469072579880411045L
	)
	@Export("MouseHandler_lastMovedVolatile")
	static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -208239589
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1942075541
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1640546939
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = -6816916068418454013L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 415930805
	)
	@Export("MouseHandler_lastButtonVolatile")
	static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1244525671
	)
	@Export("MouseHandler_lastPressedXVolatile")
	static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1581095691
	)
	@Export("MouseHandler_lastPressedYVolatile")
	static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		longValue = -4923390982806945225L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 840171479
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -821555279
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 685719415
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = 7589537695064233229L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("jl")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;

	static {
		MouseHandler_instance = new MouseHandler();
		MouseHandler_idleCycles = 0;
		MouseHandler_currentButtonVolatile = 0;
		MouseHandler_xVolatile = -1;
		MouseHandler_yVolatile = -1;
		MouseHandler_lastMovedVolatile = -1L;
		MouseHandler_currentButton = 0;
		MouseHandler_x = 0;
		MouseHandler_y = 0;
		MouseHandler_millis = 0L;
		MouseHandler_lastButtonVolatile = 0;
		MouseHandler_lastPressedXVolatile = 0;
		MouseHandler_lastPressedYVolatile = 0;
		MouseHandler_lastPressedTimeMillisVolatile = 0L;
		MouseHandler_lastButton = 0;
		MouseHandler_lastPressedX = 0;
		MouseHandler_lastPressedY = 0;
		MouseHandler_lastPressedTimeMillis = 0L;
	}

	MouseHandler() {
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;I)I",
		garbageValue = "-1705340679"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton();
		if (!var1.isAltDown() && var2 != 2) {
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2;
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_xVolatile = var1.getX();
			MouseHandler_yVolatile = var1.getY();
			MouseHandler_lastMovedVolatile = var1.getWhen();
		}

	}

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_xVolatile = -1;
			MouseHandler_yVolatile = -1;
			MouseHandler_lastMovedVolatile = var1.getWhen();
		}

	}

	public final void focusGained(FocusEvent var1) {
	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_currentButtonVolatile = 0;
		}

	}

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_lastPressedXVolatile = var1.getX();
			MouseHandler_lastPressedYVolatile = var1.getY();
			MouseHandler_lastPressedTimeMillisVolatile = class59.method1150();
			MouseHandler_lastButtonVolatile = this.getButton(var1);
			if (MouseHandler_lastButtonVolatile != 0) {
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_currentButtonVolatile = 0;
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}
}
