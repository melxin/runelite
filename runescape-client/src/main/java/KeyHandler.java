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
	@ObfuscatedName("aj")
	@Export("KeyHandler_pressedKeys")
	boolean[] KeyHandler_pressedKeys;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lbi;"
	)
	class29[] field110;
	@ObfuscatedName("ai")
	Collection field113;
	@ObfuscatedName("al")
	Collection field114;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1378413789
	)
	@Export("KeyHandler_idleCycles")
	volatile int KeyHandler_idleCycles;

	KeyHandler() {
		this.KeyHandler_pressedKeys = new boolean[112];
		this.field110 = new class29[3];
		this.KeyHandler_idleCycles = 0;
		this.field113 = new ArrayList(100);
		this.field114 = new ArrayList(100);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lbi;II)V",
		garbageValue = "1433776513"
	)
	void method358(class29 var1, int var2) {
		this.field110[var2] = var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2005320087"
	)
	int method378() {
		return this.KeyHandler_idleCycles;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-18004391"
	)
	public boolean method360() {
		return this.KeyHandler_idleCycles <= 1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-2128998259"
	)
	void method361(Component var1) {
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(this);
		var1.addFocusListener(this);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-1187619590"
	)
	synchronized void method362(Component var1) {
		var1.removeKeyListener(this);
		var1.removeFocusListener(this);
		synchronized(this) {
			this.field113.add(new class33(4, 0));
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1819519107"
	)
	void method363() {
		++this.KeyHandler_idleCycles;
		this.method365();
		Iterator var1 = this.field114.iterator();

		while (var1.hasNext()) {
			class33 var2 = (class33)var1.next();

			for (int var3 = 0; var3 < this.field110.length && !var2.method480(this.field110[var3]); ++var3) {
			}
		}

		this.field114.clear();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1789012292"
	)
	synchronized void method365() {
		Collection var1 = this.field114;
		this.field114 = this.field113;
		this.field113 = var1;
	}

	public final synchronized void keyPressed(KeyEvent var1) {
		int var2;
		label23: {
			var2 = var1.getKeyCode();
			if (var2 >= 0) {
				int var4 = class28.KeyHandler_keyCodes.length;
				if (var2 < var4) {
					int var5 = class28.KeyHandler_keyCodes[var2];
					var2 = var5;
					if (HttpResponse.method308(var5)) {
						var2 = -1;
					}
					break label23;
				}
			}

			var2 = -1;
		}

		if (var2 >= 0) {
			if (!this.KeyHandler_pressedKeys[var2]) {
				this.KeyHandler_idleCycles = 0;
			}

			this.KeyHandler_pressedKeys[var2] = true;
			this.field113.add(new class33(1, var2));
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
			this.field113.add(new class33(2, var2));
		}

		var1.consume();
	}

	public final synchronized void focusGained(FocusEvent var1) {
		this.field113.add(new class33(4, 1));
	}

	public final synchronized void focusLost(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; ++var2) {
			if (this.KeyHandler_pressedKeys[var2]) {
				this.KeyHandler_pressedKeys[var2] = false;
				this.field113.add(new class33(2, var2));
			}
		}

		this.field113.add(new class33(4, 0));
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
						char[] var4 = class436.cp1252AsciiExtension;

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
				this.field113.add(new class33(3, var2));
			}
		}

		var1.consume();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "-1449692965"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2];
		int var4 = 0;

		for (int var5 = 0; var5 < var2; ++var5) {
			int var6 = var0[var5 + var1] & 255;
			if (var6 != 0) {
				if (var6 >= 128 && var6 < 160) {
					char var7 = class436.cp1252AsciiExtension[var6 - 128];
					if (var7 == 0) {
						var7 = '?';
					}

					var6 = var7;
				}

				var3[var4++] = (char)var6;
			}
		}

		return new String(var3, 0, var4);
	}

	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1861496833"
	)
	static final void method373(int var0) {
		if (ClientPreferences.widgetDefinition.loadInterface(var0)) {
			Widget[] var1 = ClientPreferences.widgetDefinition.Widget_interfaceComponents[var0];

			for (int var2 = 0; var2 < var1.length; ++var2) {
				Widget var3 = var1[var2];
				if (var3 != null) {
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
				}
			}

		}
	}
}
