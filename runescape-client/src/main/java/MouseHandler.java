import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1613944731
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -450573877
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1848146597
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = -2055966499243041289L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -858766543
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1419942585
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -757780639
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		longValue = -6894950915233318595L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lbd;"
	)
	@Export("MouseHandler_instance")
	public static MouseHandler MouseHandler_instance;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 945169023
	)
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1234743791
	)
	@Export("MouseHandler_currentButtonVolatile")
	public static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -978586589
	)
	@Export("MouseHandler_xVolatile")
	public static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1463096377
	)
	@Export("MouseHandler_yVolatile")
	public static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = -5319917652127724711L
	)
	@Export("MouseHandler_lastMovedVolatile")
	public static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1762133831
	)
	@Export("MouseHandler_lastButtonVolatile")
	public static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 40098551
	)
	@Export("MouseHandler_lastPressedXVolatile")
	public static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -586457439
	)
	@Export("MouseHandler_lastPressedYVolatile")
	public static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = -8968216649017239371L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	public static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("archive13")
	static Archive archive13;

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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;B)I",
		garbageValue = "0"
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

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1);
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

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_lastPressedXVolatile = var1.getX();
			MouseHandler_lastPressedYVolatile = var1.getY();
			MouseHandler_lastPressedTimeMillisVolatile = class282.method5908();
			MouseHandler_lastButtonVolatile = this.getButton(var1);
			if (MouseHandler_lastButtonVolatile != 0) {
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final void focusGained(FocusEvent var1) {
	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_currentButtonVolatile = 0;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIZB)V",
		garbageValue = "-91"
	)
	public static void method665(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (!var0.isEmpty()) {
			class335.field3694.clear();
			class335.field3699.clear();
			MidiRequest var7;
			if (var5) {
				SoundCache.method864();
			} else {
				for (int var6 = 0; var6 < class335.midiRequests.size(); ++var6) {
					var7 = (MidiRequest)class335.midiRequests.get(var6);
					if (var7 == null) {
						class335.midiRequests.remove(var6);
						--var6;
					} else if (var7.field3814) {
						if (var7.midiPcmStream.field3708 > 0) {
							--var7.midiPcmStream.field3708;
						}

						var7.midiPcmStream.clear();
						var7.midiPcmStream.method6637();
						var7.midiPcmStream.setPcmStreamVolume(0);
						class335.midiRequests.remove(var6);
						--var6;
					} else {
						var7.field3814 = true;
					}
				}
			}

			if (!var5) {
				class335.field3698.clear();
			}

			Iterator var12 = var0.iterator();

			while (var12.hasNext()) {
				var7 = (MidiRequest)var12.next();
				if (var7.musicTrackGroupId != -1 && var7.musicTrackFileId != -1) {
					if (!var5) {
						class335.field3698.add(var7);
					}

					class335.field3694.add(var7);
				}
			}

			if (!class335.field3694.isEmpty()) {
				class335.musicPlayerStatus = var1;
				class335.field3692 = var2;
				class335.field3702 = var3;
				class335.field3693 = var4;
				class335.field3699.add(new AddRequestTask((SongTask)null));
				class335.field3699.add(new class466((SongTask)null, class335.field3696, UserComparator4.field1497, class335.field3703));
				ArrayList var14 = new ArrayList();
				var14.add(new class461(new FadeInTask((SongTask)null, 0, true, class335.field3693)));
				if (!class335.midiRequests.isEmpty()) {
					ArrayList var13 = new ArrayList();
					var13.add(new DelayFadeTask(new ConcurrentMidiTask((SongTask)null, var14), class335.field3702));
					ArrayList var9 = new ArrayList();
					Iterator var10 = class335.midiRequests.iterator();

					while (var10.hasNext()) {
						MidiRequest var11 = (MidiRequest)var10.next();
						var9.add(var11);
					}

					var13.add(new DelayFadeTask(new FadeOutTask(new class459((SongTask)null, var9), 0, false, class335.field3692), class335.musicPlayerStatus));
					class335.field3699.add(new ConcurrentMidiTask((SongTask)null, var13));
				} else {
					class335.field3699.add(new DelayFadeTask((SongTask)null, class335.field3702));
					class335.field3699.add(new ConcurrentMidiTask((SongTask)null, var14));
				}

			}
		}
	}

	@ObfuscatedName("as")
	public static int method674(long var0) {
		return (int)(var0 >>> 0 & 127L);
	}
}
