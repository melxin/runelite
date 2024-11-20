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

@ObfuscatedName("ag")
@Implements("KeyHandler")
public class KeyHandler implements KeyListener, FocusListener {
	@ObfuscatedName("aw")
	Collection field120;
	@ObfuscatedName("at")
	Collection field121;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lbt;"
	)
	class29[] field119;
	@ObfuscatedName("ao")
	@Export("KeyHandler_pressedKeys")
	boolean[] KeyHandler_pressedKeys;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1264277827
	)
	@Export("KeyHandler_idleCycles")
	volatile int KeyHandler_idleCycles;

	KeyHandler() {
		this.field119 = new class29[3];
		this.KeyHandler_pressedKeys = new boolean[112];
		this.KeyHandler_idleCycles = 0;
		this.field120 = new ArrayList(100);
		this.field121 = new ArrayList(100);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lbt;IB)V",
		garbageValue = "43"
	)
	void method344(class29 var1, int var2) {
		this.field119[var2] = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "2"
	)
	int method336() {
		return this.KeyHandler_idleCycles;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "-20"
	)
	void method334(Component var1) {
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(this);
		var1.addFocusListener(this);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "1022060374"
	)
	synchronized void method345(Component var1) {
		var1.removeKeyListener(this);
		var1.removeFocusListener(this);
		synchronized(this) {
			this.field120.add(new class33(4, 0));
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-289593625"
	)
	void method355() {
		++this.KeyHandler_idleCycles;
		this.method337();
		Iterator var1 = this.field121.iterator();

		while (var1.hasNext()) {
			class33 var2 = (class33)var1.next();

			for (int var3 = 0; var3 < this.field119.length && !var2.method458(this.field119[var3]); ++var3) {
			}
		}

		this.field121.clear();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-13"
	)
	synchronized void method337() {
		Collection var1 = this.field121;
		this.field121 = this.field120;
		this.field120 = var1;
	}

	public final synchronized void keyPressed(KeyEvent var1) {
		int var2;
		label28: {
			var2 = var1.getKeyCode();
			if (var2 >= 0) {
				int var4 = class28.KeyHandler_keyCodes.length;
				if (var2 < var4) {
					int var5 = class28.KeyHandler_keyCodes[var2];
					var2 = var5;
					boolean var6 = (var5 & 128) != 0;
					if (var6) {
						var2 = -1;
					}
					break label28;
				}
			}

			var2 = -1;
		}

		if (var2 >= 0) {
			if (!this.KeyHandler_pressedKeys[var2]) {
				this.KeyHandler_idleCycles = 0;
			}

			this.KeyHandler_pressedKeys[var2] = true;
			this.field120.add(new class33(1, var2));
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
					int var5 = class28.KeyHandler_keyCodes[var2];
					var2 = var5 & -129;
					break label17;
				}
			}

			var2 = -1;
		}

		if (var2 >= 0) {
			this.KeyHandler_pressedKeys[var2] = false;
			this.field120.add(new class33(2, var2));
		}

		var1.consume();
	}

	public final synchronized void keyTyped(KeyEvent var1) {
		char var2 = var1.getKeyChar();
		if (var2 != 0 && var2 != '\uffff') {
			boolean var3;
			if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
				var3 = true;
			} else {
				label53: {
					if (var2 != 0) {
						char[] var4 = class417.cp1252AsciiExtension;

						for (int var5 = 0; var5 < var4.length; ++var5) {
							char var6 = var4[var5];
							if (var6 == var2) {
								var3 = true;
								break label53;
							}
						}
					}

					var3 = false;
				}
			}

			if (var3) {
				this.field120.add(new class33(3, var2));
			}
		}

		var1.consume();
	}

	public final synchronized void focusGained(FocusEvent var1) {
		this.field120.add(new class33(4, 1));
	}

	public final synchronized void focusLost(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; ++var2) {
			if (this.KeyHandler_pressedKeys[var2]) {
				this.KeyHandler_pressedKeys[var2] = false;
				this.field120.add(new class33(2, var2));
			}
		}

		this.field120.add(new class33(4, 0));
	}
}
