import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("av")
@Implements("HttpRequestTask")
public class HttpRequestTask implements Callable {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lau;"
	)
	final HttpRequest field80;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	final AsyncRestClient this$0;

	@ObfuscatedSignature(
		descriptor = "(Lak;Lau;)V"
	)
	HttpRequestTask(AsyncRestClient var1, HttpRequest var2) {
		this.this$0 = var1;
		this.field80 = var2;
	}

	public Object call() throws Exception {
		try {
			while (this.field80.connect()) {
				UserComparator8.method3393(10L);
			}
		} catch (IOException var2) {
			return new HttpResponse("Error servicing REST query: " + var2.getMessage());
		}

		return this.field80.getResponse();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ltp;II)V",
		garbageValue = "1222620268"
	)
	static void method290(class509 var0, int var1) {
		if (var1 < 0 || var1 >= var0.method9937()) {
			throw new RuntimeException();
		}
	}
}
