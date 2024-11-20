import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("ab")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("aw")
	@Export("lock")
	Object lock;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 188543301
	)
	@Export("index")
	int index;
	@ObfuscatedName("ae")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("ao")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("ac")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true;
		this.lock = new Object();
		this.index = 0;
		this.xs = new int[500];
		this.ys = new int[500];
		this.millis = new long[500];
	}

	public void run() {
		for (; this.isRunning; class188.method3857(50L)) {
			synchronized(this.lock) {
				if (this.index < 500) {
					this.xs[this.index] = MouseHandler.MouseHandler_x;
					this.ys[this.index] = MouseHandler.MouseHandler_y;
					this.millis[this.index] = MouseHandler.MouseHandler_millis;
					++this.index;
				}
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "10161551"
	)
	static void method2503() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var0.stream1 != null) {
				class53.pcmStreamMixer.removeSubStream(var0.stream1);
				var0.stream1 = null;
			}

			if (var0.stream2 != null) {
				class53.pcmStreamMixer.removeSubStream(var0.stream2);
				var0.stream2 = null;
			}
		}

		ObjectSound.objectSounds.clear();
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "75271744"
	)
	static int method2502(int var0, Script var1, boolean var2) {
		if (var0 == 6809) {
			int var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
			ObjectComposition var4 = HttpMethod.getObjectDefinition(var3);
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : "";
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	static final void method2504() {
		Client.field707 = Client.cycleCntr;
	}
}
