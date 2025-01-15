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

@ObfuscatedName("aj")
@Implements("KeyHandler")
public class KeyHandler implements KeyListener, FocusListener {
	@ObfuscatedName("ax")
	@Export("SpriteBuffer_spritePalette")
	public static int[] SpriteBuffer_spritePalette;
	@ObfuscatedName("ei")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("ah")
	Collection field102;
	@ObfuscatedName("az")
	Collection field103;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lbb;"
	)
	class29[] field105;
	@ObfuscatedName("ad")
	@Export("KeyHandler_pressedKeys")
	boolean[] KeyHandler_pressedKeys;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1024475951
	)
	@Export("KeyHandler_idleCycles")
	volatile int KeyHandler_idleCycles;

	KeyHandler() {
		this.field105 = new class29[3];
		this.KeyHandler_pressedKeys = new boolean[112];
		this.KeyHandler_idleCycles = 0;
		this.field102 = new ArrayList(100);
		this.field103 = new ArrayList(100);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lbb;IB)V",
		garbageValue = "53"
	)
	void method368(class29 var1, int var2) {
		this.field105[var2] = var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1819629984"
	)
	public int method362() {
		return this.KeyHandler_idleCycles;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-2076398807"
	)
	void method361(Component var1) {
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(this);
		var1.addFocusListener(this);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-528580682"
	)
	synchronized void method363(Component var1) {
		var1.removeKeyListener(this);
		var1.removeFocusListener(this);
		synchronized(this) {
			this.field102.add(new class33(4, 0));
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1798794123"
	)
	void method364() {
		++this.KeyHandler_idleCycles;
		this.method366();
		Iterator var1 = this.field103.iterator();

		while (var1.hasNext()) {
			class33 var2 = (class33)var1.next();

			for (int var3 = 0; var3 < this.field105.length && !var2.method519(this.field105[var3]); ++var3) {
			}
		}

		this.field103.clear();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "4548"
	)
	synchronized void method366() {
		Collection var1 = this.field103;
		this.field103 = this.field102;
		this.field102 = var1;
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
					if (class389.method7722(var5)) {
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
			this.field102.add(new class33(1, var2));
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
			this.field102.add(new class33(2, var2));
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
							if (var2 == var6) {
								var3 = true;
								break label53;
							}
						}
					}

					var3 = false;
				}
			}

			if (var3) {
				this.field102.add(new class33(3, var2));
			}
		}

		var1.consume();
	}

	public final synchronized void focusGained(FocusEvent var1) {
		this.field102.add(new class33(4, 1));
	}

	public final synchronized void focusLost(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; ++var2) {
			if (this.KeyHandler_pressedKeys[var2]) {
				this.KeyHandler_pressedKeys[var2] = false;
				this.field102.add(new class33(2, var2));
			}
		}

		this.field102.add(new class33(4, 0));
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lpq;I)V",
		garbageValue = "-1569725911"
	)
	public static void method373(AbstractArchive var0) {
		InvDefinition.InvDefinition_archive = var0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILsh;Lok;I)V",
		garbageValue = "1442958615"
	)
	static void method401(int var0, ArchiveDisk var1, Archive var2) {
		byte[] var3 = null;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			for (ArchiveDiskAction var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var5 != null; var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) {
				if ((long)var0 == var5.key && var1 == var5.archiveDisk && var5.type == 0) {
					var3 = var5.data;
					break;
				}
			}
		}

		if (var3 != null) {
			var2.load(var1, var0, var3, true);
		} else {
			byte[] var4 = var1.read(var0);
			var2.load(var1, var0, var4, true);
		}
	}
}
