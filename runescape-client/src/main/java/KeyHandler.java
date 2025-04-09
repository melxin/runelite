import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
@Implements("KeyHandler")
public class KeyHandler implements KeyListener, FocusListener {
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	static Bounds field93;
	@ObfuscatedName("qf")
	@ObfuscatedSignature(
		descriptor = "[Lwc;"
	)
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSprites;
	@ObfuscatedName("qk")
	@ObfuscatedGetter(
		intValue = -1766774397
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;
	@ObfuscatedName("an")
	@Export("KeyHandler_pressedKeys")
	boolean[] KeyHandler_pressedKeys;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lbb;"
	)
	class29[] field92;
	@ObfuscatedName("af")
	Collection field98;
	@ObfuscatedName("as")
	Collection field101;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -28531903
	)
	@Export("KeyHandler_idleCycles")
	volatile int KeyHandler_idleCycles;

	KeyHandler() {
		this.KeyHandler_pressedKeys = new boolean[112];
		this.field92 = new class29[3];
		this.KeyHandler_idleCycles = 0;
		this.field98 = new ArrayList(100);
		this.field101 = new ArrayList(100);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lbb;II)V",
		garbageValue = "-1708417098"
	)
	void method360(class29 var1, int var2) {
		this.field92[var2] = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-2"
	)
	int method355() {
		return this.KeyHandler_idleCycles;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	public boolean method356() {
		return this.KeyHandler_idleCycles <= 1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-1532299205"
	)
	void method381(Component var1) {
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(this);
		var1.addFocusListener(this);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "-20"
	)
	synchronized void method358(Component var1) {
		var1.removeKeyListener(this);
		var1.removeFocusListener(this);
		synchronized(this) {
			this.field98.add(new class33(4, 0));
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "16"
	)
	void method359() {
		++this.KeyHandler_idleCycles;
		this.method382();
		Iterator var1 = this.field101.iterator();

		while (var1.hasNext()) {
			class33 var2 = (class33)var1.next();

			for (int var3 = 0; var3 < this.field92.length && !var2.method488(this.field92[var3]); ++var3) {
			}
		}

		this.field101.clear();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "65536"
	)
	synchronized void method382() {
		Collection var1 = this.field101;
		this.field101 = this.field98;
		this.field98 = var1;
	}

	public final synchronized void focusGained(FocusEvent var1) {
		this.field98.add(new class33(4, 1));
	}

	public final synchronized void focusLost(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; ++var2) {
			if (this.KeyHandler_pressedKeys[var2]) {
				this.KeyHandler_pressedKeys[var2] = false;
				this.field98.add(new class33(2, var2));
			}
		}

		this.field98.add(new class33(4, 0));
	}

	public final synchronized void keyPressed(KeyEvent var1) {
		int var2 = var1.getKeyCode();
		if (var2 >= 0 && var2 < class219.method4842()) {
			var2 = IntProjection.method3971(var2);
			boolean var3 = (var2 & 128) != 0;
			if (var3) {
				var2 = -1;
			}
		} else {
			var2 = -1;
		}

		if (var2 >= 0) {
			if (!this.KeyHandler_pressedKeys[var2]) {
				this.KeyHandler_idleCycles = 0;
			}

			this.KeyHandler_pressedKeys[var2] = true;
			this.field98.add(new class33(1, var2));
		}

		var1.consume();
	}

	public final synchronized void keyReleased(KeyEvent var1) {
		int var2;
		label17: {
			var2 = var1.getKeyCode();
			if (var2 >= 0) {
				int var4 = class28.KeyHandler_keyCodes.length;
				if (var2 < var4) {
					var2 = IntProjection.method3971(var2) & -129;
					break label17;
				}
			}

			var2 = -1;
		}

		if (var2 >= 0) {
			this.KeyHandler_pressedKeys[var2] = false;
			this.field98.add(new class33(2, var2));
		}

		var1.consume();
	}

	public final synchronized void keyTyped(KeyEvent var1) {
		char var2 = var1.getKeyChar();
		if (var2 != 0 && var2 != '\uffff' && PacketBufferNode.method6559(var2)) {
			this.field98.add(new class33(3, var2));
		}

		var1.consume();
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ILdb;ZI)I",
		garbageValue = "1285307877"
	)
	static int method383(int var0, Script var1, boolean var2) {
		return 2;
	}
}
