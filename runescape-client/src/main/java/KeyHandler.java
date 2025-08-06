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

@ObfuscatedName("ae")
@Implements("KeyHandler")
public class KeyHandler implements KeyListener, FocusListener {
	@ObfuscatedName("ab")
	@Export("KeyHandler_pressedKeys")
	boolean[] KeyHandler_pressedKeys;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lbw;"
	)
	class29[] field110;
	@ObfuscatedName("av")
	Collection field112;
	@ObfuscatedName("au")
	Collection field111;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1380019785
	)
	@Export("KeyHandler_idleCycles")
	volatile int KeyHandler_idleCycles;

	KeyHandler() {
		this.KeyHandler_pressedKeys = new boolean[112];
		this.field110 = new class29[3];
		this.KeyHandler_idleCycles = 0;
		this.field112 = new ArrayList(100);
		this.field111 = new ArrayList(100);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lbw;IB)V",
		garbageValue = "-39"
	)
	void method367(class29 var1, int var2) {
		this.field110[var2] = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1278379411"
	)
	public int method368() {
		return this.KeyHandler_idleCycles;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1430864709"
	)
	boolean method369() {
		return this.KeyHandler_idleCycles <= 1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "5"
	)
	void method370(Component var1) {
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(this);
		var1.addFocusListener(this);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-1882347298"
	)
	synchronized void method371(Component var1) {
		var1.removeKeyListener(this);
		var1.removeFocusListener(this);
		synchronized(this) {
			this.field112.add(new class33(4, 0));
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-40"
	)
	void method372() {
		++this.KeyHandler_idleCycles;
		this.method374();
		Iterator var1 = this.field111.iterator();

		while (var1.hasNext()) {
			class33 var2 = (class33)var1.next();

			for (int var3 = 0; var3 < this.field110.length && !var2.method520(this.field110[var3]); ++var3) {
			}
		}

		this.field111.clear();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1385864560"
	)
	synchronized void method374() {
		Collection var1 = this.field111;
		this.field111 = this.field112;
		this.field112 = var1;
	}

	public final synchronized void keyReleased(KeyEvent var1) {
		int var2;
		label17: {
			var2 = var1.getKeyCode();
			if (var2 >= 0) {
				int var4 = class27.KeyHandler_keyCodes.length;
				if (var2 < var4) {
					var2 = UserComparator5.method3507(var2) & -129;
					break label17;
				}
			}

			var2 = -1;
		}

		if (var2 >= 0) {
			this.KeyHandler_pressedKeys[var2] = false;
			this.field112.add(new class33(2, var2));
		}

		var1.consume();
	}

	public final synchronized void keyTyped(KeyEvent var1) {
		char var2 = var1.getKeyChar();
		if (var2 != 0 && var2 != '\uffff' && StudioGame.method8176(var2)) {
			this.field112.add(new class33(3, var2));
		}

		var1.consume();
	}

	public final synchronized void focusGained(FocusEvent var1) {
		this.field112.add(new class33(4, 1));
	}

	public final synchronized void focusLost(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; ++var2) {
			if (this.KeyHandler_pressedKeys[var2]) {
				this.KeyHandler_pressedKeys[var2] = false;
				this.field112.add(new class33(2, var2));
			}
		}

		this.field112.add(new class33(4, 0));
	}

	public final synchronized void keyPressed(KeyEvent var1) {
		int var2;
		label28: {
			var2 = var1.getKeyCode();
			if (var2 >= 0) {
				int var4 = class27.KeyHandler_keyCodes.length;
				if (var2 < var4) {
					var2 = UserComparator5.method3507(var2);
					boolean var5 = (var2 & 128) != 0;
					if (var5) {
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
			this.field112.add(new class33(1, var2));
		}

		var1.consume();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lqr;ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-2095221453"
	)
	static String method391(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) {
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1);
			return var3 == null ? var2 : (String)var3.obj;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILce;ZI)I",
		garbageValue = "-2080734905"
	)
	static int method375(int var0, Script var1, boolean var2) {
		if (var0 < 1000) {
			return class198.method4385(var0, var1, var2);
		} else if (var0 < 1100) {
			return NpcOverrides.method4305(var0, var1, var2);
		} else if (var0 < 1200) {
			return WorldMapSectionType.method6756(var0, var1, var2);
		} else if (var0 < 1300) {
			return WorldMapData_0.method6351(var0, var1, var2);
		} else if (var0 < 1400) {
			return UserComparator9.method3528(var0, var1, var2);
		} else if (var0 < 1500) {
			return class134.method3631(var0, var1, var2);
		} else if (var0 < 1600) {
			return PlayerComposition.method7524(var0, var1, var2);
		} else if (var0 < 1700) {
			return class400.method8269(var0, var1, var2);
		} else if (var0 < 1800) {
			return class481.method9804(var0, var1, var2);
		} else if (var0 < 1900) {
			return class28.method432(var0, var1, var2);
		} else if (var0 < 2000) {
			return ModeWhere.method8719(var0, var1, var2);
		} else if (var0 < 2100) {
			return NpcOverrides.method4305(var0, var1, var2);
		} else if (var0 < 2200) {
			return WorldMapSectionType.method6756(var0, var1, var2);
		} else if (var0 < 2300) {
			return WorldMapData_0.method6351(var0, var1, var2);
		} else if (var0 < 2400) {
			return UserComparator9.method3528(var0, var1, var2);
		} else if (var0 < 2500) {
			return class134.method3631(var0, var1, var2);
		} else if (var0 < 2600) {
			return FileSystem.method5915(var0, var1, var2);
		} else if (var0 < 2700) {
			return HealthBarConfig.method2651(var0, var1, var2);
		} else if (var0 < 2800) {
			return class487.method9868(var0, var1, var2);
		} else if (var0 < 2900) {
			return ClientPacket.method7013(var0, var1, var2);
		} else if (var0 < 3000) {
			return ModeWhere.method8719(var0, var1, var2);
		} else if (var0 < 3200) {
			return ScriptFrame.method763(var0, var1, var2);
		} else if (var0 < 3300) {
			return class66.method2137(var0, var1, var2);
		} else if (var0 < 3400) {
			return WorldMapAreaData.method6908(var0, var1, var2);
		} else if (var0 < 3500) {
			return class152.method3810(var0, var1, var2);
		} else if (var0 < 3600) {
			return class31.method498(var0, var1, var2);
		} else if (var0 < 3700) {
			return class439.method8907(var0, var1, var2);
		} else if (var0 < 3800) {
			return WorldMapIcon_0.method6721(var0, var1, var2);
		} else if (var0 < 3900) {
			return IntProjection.method4997(var0, var1, var2);
		} else if (var0 < 4000) {
			return ByteArrayPool.method9730(var0, var1, var2);
		} else if (var0 < 4100) {
			return class344.method7318(var0, var1, var2);
		} else if (var0 < 4200) {
			return class135.method3640(var0, var1, var2);
		} else if (var0 < 4300) {
			return HealthBarUpdate.method2477(var0, var1, var2);
		} else if (var0 < 5100) {
			return ConcurrentMidiTask.method9671(var0, var1, var2);
		} else if (var0 < 5400) {
			return class7.method53(var0, var1, var2);
		} else if (var0 < 5600) {
			return class57.method2019(var0, var1, var2);
		} else if (var0 < 5700) {
			return class198.method4389(var0, var1, var2);
		} else if (var0 < 6300) {
			return ObjectComposition.method4612(var0, var1, var2);
		} else if (var0 < 6600) {
			return MouseRecorder.method2129(var0, var1, var2);
		} else if (var0 < 6700) {
			return Tiles.method2073(var0, var1, var2);
		} else if (var0 < 6800) {
			return WorldMapIcon_0.method6723(var0, var1, var2);
		} else if (var0 < 6900) {
			return TileItem.method2782(var0, var1, var2);
		} else if (var0 < 7000) {
			return ApproximateRouteStrategy.method792(var0, var1, var2);
		} else if (var0 < 7100) {
			return WorldMapLabelSize.method6369(var0, var1, var2);
		} else if (var0 < 7200) {
			return HttpRequestTask.method298(var0, var1, var2);
		} else if (var0 < 7500) {
			return class254.method5842(var0, var1, var2);
		} else if (var0 < 7600) {
			return class4.method12(var0, var1, var2);
		} else if (var0 < 7700) {
			return class170.method4064(var0, var1, var2);
		} else if (var0 < 8000) {
			return class28.method453(var0, var1, var2);
		} else {
			return var0 < 8100 ? class381.method8168(var0, var1, var2) : 2;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2093420375"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var1 == null ? 0 : var1.size();
	}
}
