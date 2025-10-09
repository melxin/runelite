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

@ObfuscatedName("ay")
@Implements("KeyHandler")
public class KeyHandler implements KeyListener, FocusListener {
	@ObfuscatedName("at")
	@Export("KeyHandler_pressedKeys")
	boolean[] KeyHandler_pressedKeys;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Lbj;"
	)
	class28[] field110;
	@ObfuscatedName("aj")
	Collection field107;
	@ObfuscatedName("ah")
	Collection field109;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1910612091
	)
	@Export("KeyHandler_idleCycles")
	volatile int KeyHandler_idleCycles;

	KeyHandler() {
		this.KeyHandler_pressedKeys = new boolean[112];
		this.field110 = new class28[3];
		this.KeyHandler_idleCycles = 0;
		this.field107 = new ArrayList(100);
		this.field109 = new ArrayList(100);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lbj;IS)V",
		garbageValue = "31083"
	)
	void method365(class28 var1, int var2) {
		this.field110[var2] = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1862922686"
	)
	public int method347() {
		return this.KeyHandler_idleCycles;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-302417742"
	)
	boolean method348() {
		return this.KeyHandler_idleCycles <= 1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-326004867"
	)
	void method349(Component var1) {
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(this);
		var1.addFocusListener(this);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-1865595485"
	)
	synchronized void method350(Component var1) {
		var1.removeKeyListener(this);
		var1.removeFocusListener(this);
		synchronized(this) {
			this.field107.add(new class32(4, 0));
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-902158552"
	)
	void method375() {
		++this.KeyHandler_idleCycles;
		this.method353();
		Iterator var1 = this.field109.iterator();

		while (var1.hasNext()) {
			class32 var2 = (class32)var1.next();

			for (int var3 = 0; var3 < this.field110.length && !var2.method490(this.field110[var3]); ++var3) {
			}
		}

		this.field109.clear();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-62"
	)
	synchronized void method353() {
		Collection var1 = this.field109;
		this.field109 = this.field107;
		this.field107 = var1;
	}

	public final synchronized void keyPressed(KeyEvent var1) {
		int var2 = var1.getKeyCode();
		if (var2 >= 0 && var2 < class323.method7031()) {
			var2 = IndexCheck.method6170(var2);
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
			this.field107.add(new class32(1, var2));
		}

		var1.consume();
	}

	public final synchronized void keyTyped(KeyEvent var1) {
		char var2 = var1.getKeyChar();
		if (var2 != 0 && var2 != '\uffff' && class27.method405(var2)) {
			this.field107.add(new class32(3, var2));
		}

		var1.consume();
	}

	public final synchronized void focusGained(FocusEvent var1) {
		this.field107.add(new class32(4, 1));
	}

	public final synchronized void focusLost(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; ++var2) {
			if (this.KeyHandler_pressedKeys[var2]) {
				this.KeyHandler_pressedKeys[var2] = false;
				this.field107.add(new class32(2, var2));
			}
		}

		this.field107.add(new class32(4, 0));
	}

	public final synchronized void keyReleased(KeyEvent var1) {
		int var2 = var1.getKeyCode();
		if (var2 >= 0 && var2 < class323.method7031()) {
			var2 = IndexCheck.method6170(var2) & -129;
		} else {
			var2 = -1;
		}

		if (var2 >= 0) {
			this.KeyHandler_pressedKeys[var2] = false;
			this.field107.add(new class32(2, var2));
		}

		var1.consume();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-2088103809"
	)
	public static int method396(int var0, int var1, int var2) {
		if (var1 < var0) {
			throw new IllegalArgumentException("max: " + var1 + " can not be lower than min: " + var0);
		} else {
			return Math.max(var0, Math.min(var2, var1));
		}
	}
}
