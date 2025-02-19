import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
@Implements("KeyHandler")
public class KeyHandler implements KeyListener, FocusListener {
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	static Archive field116;
	@ObfuscatedName("ay")
	Collection field109;
	@ObfuscatedName("au")
	Collection field108;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[Lbz;"
	)
	class29[] field110;
	@ObfuscatedName("ah")
	@Export("KeyHandler_pressedKeys")
	boolean[] KeyHandler_pressedKeys;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -709682969
	)
	@Export("KeyHandler_idleCycles")
	volatile int KeyHandler_idleCycles;

	KeyHandler() {
		this.field110 = new class29[3];
		this.KeyHandler_pressedKeys = new boolean[112];
		this.KeyHandler_idleCycles = 0;
		this.field109 = new ArrayList(100);
		this.field108 = new ArrayList(100);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lbz;II)V",
		garbageValue = "931492589"
	)
	void method306(class29 var1, int var2) {
		this.field110[var2] = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "69"
	)
	public int method311() {
		return this.KeyHandler_idleCycles;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-1215202358"
	)
	void method308(Component var1) {
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(this);
		var1.addFocusListener(this);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "403100520"
	)
	synchronized void method309(Component var1) {
		var1.removeKeyListener(this);
		var1.removeFocusListener(this);
		synchronized(this) {
			this.field109.add(new class33(4, 0));
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-65"
	)
	void method310() {
		++this.KeyHandler_idleCycles;
		this.method318();
		Iterator var1 = this.field108.iterator();

		while (var1.hasNext()) {
			class33 var2 = (class33)var1.next();

			for (int var3 = 0; var3 < this.field110.length && !var2.method451(this.field110[var3]); ++var3) {
			}
		}

		this.field108.clear();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-85"
	)
	synchronized void method318() {
		Collection var1 = this.field108;
		this.field108 = this.field109;
		this.field109 = var1;
	}

	public final synchronized void keyPressed(KeyEvent var1) {
		int var2 = var1.getKeyCode();
		if (var2 >= 0 && var2 < UserComparator10.method3240()) {
			int var3 = class28.KeyHandler_keyCodes[var2];
			var2 = var3;
			if (class208.method4150(var3)) {
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
			this.field109.add(new class33(1, var2));
		}

		var1.consume();
	}

	public final synchronized void keyReleased(KeyEvent var1) {
		int var2 = var1.getKeyCode();
		if (var2 >= 0 && var2 < UserComparator10.method3240()) {
			int var3 = class28.KeyHandler_keyCodes[var2];
			var2 = var3 & -129;
		} else {
			var2 = -1;
		}

		if (var2 >= 0) {
			this.KeyHandler_pressedKeys[var2] = false;
			this.field109.add(new class33(2, var2));
		}

		var1.consume();
	}

	public final synchronized void focusLost(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; ++var2) {
			if (this.KeyHandler_pressedKeys[var2]) {
				this.KeyHandler_pressedKeys[var2] = false;
				this.field109.add(new class33(2, var2));
			}
		}

		this.field109.add(new class33(4, 0));
	}

	public final synchronized void focusGained(FocusEvent var1) {
		this.field109.add(new class33(4, 1));
	}

	public final synchronized void keyTyped(KeyEvent var1) {
		char var2 = var1.getKeyChar();
		if (var2 != 0 && var2 != '\uffff') {
			boolean var3;
			if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
				var3 = true;
			} else {
				label54: {
					if (var2 != 0) {
						char[] var4 = class433.cp1252AsciiExtension;

						for (int var5 = 0; var5 < var4.length; ++var5) {
							char var6 = var4[var5];
							if (var2 == var6) {
								var3 = true;
								break label54;
							}
						}
					}

					var3 = false;
				}
			}

			if (var3) {
				this.field109.add(new class33(3, var2));
			}
		}

		var1.consume();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;ZS)Z",
		garbageValue = "-29557"
	)
	static boolean method319(File var0, boolean var1) {
		try {
			RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
			int var3 = var2.read();
			var2.seek(0L);
			var2.write(var3);
			var2.seek(0L);
			var2.close();
			if (var1) {
				var0.delete();
			}

			return true;
		} catch (Exception var4) {
			return false;
		}
	}

	@ObfuscatedName("nv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1742552715"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next();
			var1.clearIsFromIgnored();
		}

		if (class7.friendsChat != null) {
			class7.friendsChat.invalidateIgnoreds();
		}

	}
}
