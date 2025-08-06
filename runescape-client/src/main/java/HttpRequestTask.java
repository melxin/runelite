import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ao")
@Implements("HttpRequestTask")
public class HttpRequestTask implements Callable {
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = -671200035
	)
	static int field80;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	final HttpRequest field79;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	final AsyncRestClient this$0;

	@ObfuscatedSignature(
		descriptor = "(Lak;Lag;)V"
	)
	HttpRequestTask(AsyncRestClient var1, HttpRequest var2) {
		this.this$0 = var1;
		this.field79 = var2;
	}

	public Object call() throws Exception {
		try {
			while (this.field79.connect()) {
				UserComparator4.method3477(10L);
			}
		} catch (IOException var2) {
			return new HttpResponse("Error servicing REST query: " + var2.getMessage());
		}

		return this.field79.getResponse();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "0"
	)
	static int method302(String var0) {
		if (var0.equals("centre")) {
			return 1;
		} else {
			return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2;
		}
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(ILce;ZI)I",
		garbageValue = "470686163"
	)
	static int method298(int var0, Script var1, boolean var2) {
		if (var0 == 7108) {
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = class67.method2139() ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}
}
