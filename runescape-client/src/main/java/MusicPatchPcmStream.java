import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("nm")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("superStream")
	MidiPcmStream superStream;

	@ObfuscatedSignature(
		descriptor = "(Lmt;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque();
		this.mixer = new PcmStreamMixer();
		this.superStream = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lne;[IIIII)V",
		garbageValue = "1355104735"
	)
	void method7125(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field3710[var1.field3784] & 4) != 0 && var1.field3798 < 0) {
			int var6 = this.superStream.field3712[var1.field3784] / UserComparator3.field1521;

			while (true) {
				int var7 = (var6 + 1048575 - var1.field3804) / var6;
				if (var7 > var4) {
					var1.field3804 += var4 * var6;
					break;
				}

				var1.stream.fill(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.field3804 += var6 * var7 - 1048576;
				int var8 = UserComparator3.field1521 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream;
				if (this.superStream.field3711[var1.field3784] == 0) {
					var1.stream = RawPcmStream.method3017(var1.rawSound, var10.method3049(), var10.method3040(), var10.method3152());
				} else {
					var1.stream = RawPcmStream.method3017(var1.rawSound, var10.method3049(), 0, var10.method3152());
					this.superStream.method6933(var1, var1.table.field3771[var1.field3789] < 0);
					var1.stream.method3046(var8, var10.method3040());
				}

				if (var1.table.field3771[var1.field3789] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var10.method3123(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method3052()) {
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lne;II)V",
		garbageValue = "23067036"
	)
	void method7137(MusicPatchNode var1, int var2) {
		if ((this.superStream.field3710[var1.field3784] & 4) != 0 && var1.field3798 < 0) {
			int var3 = this.superStream.field3712[var1.field3784] / UserComparator3.field1521;
			int var4 = (var3 + 1048575 - var1.field3804) / var3;
			var1.field3804 = var3 * var2 + var1.field3804 & 1048575;
			if (var4 <= var2) {
				if (this.superStream.field3711[var1.field3784] == 0) {
					var1.stream = RawPcmStream.method3017(var1.rawSound, var1.stream.method3049(), var1.stream.method3040(), var1.stream.method3152());
				} else {
					var1.stream = RawPcmStream.method3017(var1.rawSound, var1.stream.method3049(), 0, var1.stream.method3152());
					this.superStream.method6933(var1, var1.table.field3771[var1.field3789] < 0);
				}

				if (var1.table.field3771[var1.field3789] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field3804 / var3;
			}
		}

		var1.stream.skip(var2);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()Ldf;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		MusicPatchNode var1 = (MusicPatchNode)this.queue.last();
		if (var1 == null) {
			return null;
		} else {
			return (PcmStream)(var1.stream != null ? var1.stream : this.nextSubStream());
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Ldf;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		MusicPatchNode var1;
		do {
			var1 = (MusicPatchNode)this.queue.previous();
			if (var1 == null) {
				return null;
			}
		} while(var1.stream == null);

		return var1.stream;
	}

	@ObfuscatedName("am")
	protected int vmethod7122() {
		return 0;
	}

	@ObfuscatedName("ah")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method7042(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field3803) {
						this.method7125(var6, var1, var4, var5, var4 + var5);
						var6.field3803 -= var5;
						break;
					}

					this.method7125(var6, var1, var4, var6.field3803, var5 + var4);
					var4 += var6.field3803;
					var5 -= var6.field3803;
				} while(!this.superStream.method6954(var6, var1, var4, var5));
			}
		}

	}

	@ObfuscatedName("au")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1);

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method7042(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field3803) {
						this.method7137(var3, var2);
						var3.field3803 -= var2;
						break;
					}

					this.method7137(var3, var3.field3803);
					var2 -= var3.field3803;
				} while(!this.superStream.method6954(var3, (int[])null, 0, var2));
			}
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "([I[IIII)V",
		garbageValue = "1344331663"
	)
	public static void method7142(int[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			int var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;
			int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;

			for (int var9 = var2; var9 < var3; ++var9) {
				if (var0[var9] < (var9 & var8) + var6) {
					int var10 = var0[var9];
					var0[var9] = var0[var5];
					var0[var5] = var10;
					int var11 = var1[var9];
					var1[var9] = var1[var5];
					var1[var5++] = var11;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method7142(var0, var1, var2, var5 - 1);
			method7142(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZS)I",
		garbageValue = "255"
	)
	static int method7126(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = ClientPreferences.widgetDefinition.method7286(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? class539.scriptDotWidget : Huffman.scriptActiveWidget;
		}

		ScriptFrame.invalidateWidget(var3);
		int var4;
		int var5;
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) {
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) {
				var3.modelType = 2;
				var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) {
				var3.modelType = 3;
				var3.modelId = class152.localPlayer.appearance.getChatHeadId();
				return 1;
			} else if (var0 == 1207) {
				boolean var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
				var3.method7779(class152.localPlayer.appearance, var7);
				return 1;
			} else if (var0 == 1208) {
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (var3.field4111 == null) {
					throw new RuntimeException("");
				} else {
					var3.field4111.method7332(var4);
					return 1;
				}
			} else if (var0 == 1209) {
				Interpreter.Interpreter_intStackSize -= 2;
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				if (var3.field4111 == null) {
					throw new RuntimeException("");
				} else {
					var3.field4111.method7386(var4, var5);
					return 1;
				}
			} else if (var0 == 1210) {
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (var3.field4111 == null) {
					throw new RuntimeException("");
				} else {
					var3.field4111.method7315(class152.localPlayer.appearance.gender, var4);
					return 1;
				}
			} else {
				return 2;
			}
		} else {
			Interpreter.Interpreter_intStackSize -= 2;
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			var3.itemId = var4;
			var3.itemQuantity = var5;
			ItemComposition var6 = SceneTilePaint.ItemDefinition_get(var4);
			var3.modelAngleX = var6.xan2d;
			var3.modelAngleY = var6.yan2d;
			var3.modelAngleZ = var6.zan2d;
			var3.modelOffsetX = var6.offsetX2d;
			var3.modelOffsetY = var6.offsetY2d;
			var3.modelZoom = var6.zoom2d;
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | 1 == var6.isStackable) {
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2;
			}

			if (var3.field4039 > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.field4039;
			} else if (var3.rawWidth > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1;
		}
	}

	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-155564374"
	)
	static void method7141() {
		if (class448.field5001 != null) {
			Client.field346 = Client.cycle;
			class448.field5001.method8281();
			Iterator var0 = Sound.topLevelWorldView.players.iterator();

			while (var0.hasNext()) {
				Player var1 = (Player)var0.next();
				class448.field5001.method8270((var1.x >> 7) + Sound.topLevelWorldView.baseX, (var1.y >> 7) + Sound.topLevelWorldView.baseY);
			}
		}

	}
}
