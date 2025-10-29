import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
@Implements("RestClientThreadFactory")
public class RestClientThreadFactory implements ThreadFactory {
	@ObfuscatedName("av")
	final ThreadGroup field60;
	@ObfuscatedName("at")
	final AtomicInteger field61;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	final AsyncRestClient this$0;

	@ObfuscatedSignature(
		descriptor = "(Las;)V"
	)
	RestClientThreadFactory(AsyncRestClient var1) {
		this.this$0 = var1;
		this.field61 = new AtomicInteger(1);
		SecurityManager var2 = System.getSecurityManager();
		this.field60 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
	}

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field60, var1, this.this$0.threadNamePrefix + "-rest-request-" + this.field61.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lyg;"
	)
	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) {
			var2 = (RunException)var0;
			var2.message = var2.message + ' ' + var1;
		} else {
			var2 = new RunException(var0, var1);
		}

		return var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1383100471"
	)
	static void method206() {
		class57.soundEffectCount = 0;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ILcu;ZI)I",
		garbageValue = "-616650646"
	)
	static int method208(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) {
			var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Client.indexCheck.isValidIndexInRange(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Client.indexCheck.method6311(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3502) {
			var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Client.indexCheck.method6299(var3) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}
}
