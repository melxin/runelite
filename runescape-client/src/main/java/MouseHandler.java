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

@ObfuscatedName("bw")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1444120391
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -41687009
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1952176513
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		longValue = -6000464207886188825L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 795827763
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1116192787
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -2083547213
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		longValue = -6451793251839322579L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lbw;"
	)
	@Export("MouseHandler_instance")
	public static MouseHandler MouseHandler_instance;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1137337605
	)
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1205295435
	)
	@Export("MouseHandler_currentButtonVolatile")
	static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -241385397
	)
	@Export("MouseHandler_xVolatile")
	static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1669100459
	)
	@Export("MouseHandler_yVolatile")
	static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = 8820212074249144311L
	)
	@Export("MouseHandler_lastMovedVolatile")
	static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 560166427
	)
	@Export("MouseHandler_lastButtonVolatile")
	static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1195633007
	)
	@Export("MouseHandler_lastPressedXVolatile")
	static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -633123169
	)
	@Export("MouseHandler_lastPressedYVolatile")
	static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = 8488725944337585033L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("pt")
	@ObfuscatedSignature(
		descriptor = "[Lwd;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;

	static {
		MouseHandler_currentButton = 0;
		MouseHandler_x = 0;
		MouseHandler_y = 0;
		MouseHandler_millis = 0L;
		MouseHandler_lastButton = 0;
		MouseHandler_lastPressedX = 0;
		MouseHandler_lastPressedY = 0;
		MouseHandler_lastPressedTimeMillis = 0L;
		MouseHandler_instance = new MouseHandler();
		MouseHandler_idleCycles = 0;
		MouseHandler_currentButtonVolatile = 0;
		MouseHandler_xVolatile = -1;
		MouseHandler_yVolatile = -1;
		MouseHandler_lastMovedVolatile = -1L;
		MouseHandler_lastButtonVolatile = 0;
		MouseHandler_lastPressedXVolatile = 0;
		MouseHandler_lastPressedYVolatile = 0;
		MouseHandler_lastPressedTimeMillisVolatile = 0L;
	}

	MouseHandler() {
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;I)I",
		garbageValue = "-1921088431"
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

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_lastPressedXVolatile = var1.getX();
			MouseHandler_lastPressedYVolatile = var1.getY();
			MouseHandler_lastPressedTimeMillisVolatile = class180.method3973();
			MouseHandler_lastButtonVolatile = this.getButton(var1);
			if (MouseHandler_lastButtonVolatile != 0) {
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

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

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final void focusGained(FocusEvent var1) {
	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_currentButtonVolatile = 0;
		}

	}

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	@ObfuscatedName("ph")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1410406466"
	)
	static void method677(int var0) {
		SequenceDefinition var1 = VarpDefinition.SequenceDefinition_get(var0);
		if (var1.isCachedModelIdSet()) {
			if (class36.method700(var1.SequenceDefinition_cachedModelId) == 2) {
				Client.field593.add(var1.SequenceDefinition_cachedModelId);
			}

		}
	}
}
