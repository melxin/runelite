import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
@Implements("RestClientThreadFactory")
public class RestClientThreadFactory implements ThreadFactory {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 628496281
	)
	static int field73;
	@ObfuscatedName("ap")
	final ThreadGroup field71;
	@ObfuscatedName("aj")
	final AtomicInteger field70;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	final AsyncRestClient this$0;

	@ObfuscatedSignature(
		descriptor = "(Lak;)V"
	)
	RestClientThreadFactory(AsyncRestClient var1) {
		this.this$0 = var1;
		this.field70 = new AtomicInteger(1);
		SecurityManager var2 = System.getSecurityManager();
		this.field71 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
	}

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field71, var1, this.this$0.threadNamePrefix + "-rest-request-" + this.field70.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[Ltz;",
		garbageValue = "1678663593"
	)
	public static class508[] method218() {
		return new class508[]{class508.field5285, class508.field5283, class508.field5284};
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "653081562"
	)
	static final boolean method212(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-';
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	public static void method219() {
		NPCComposition.NpcDefinition_cached.clear();
		NPCComposition.NpcDefinition_cachedModels.clear();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltp;Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "818276252"
	)
	public static String method217(class509 var0, String var1) {
		class563 var2 = class563.field5595;
		DelayFadeTask.method9245(var0, var2, false);
		int var3 = var0.method9937();
		String[] var4 = (String[])((String[])var0.method9936());
		if (var3 == 0) {
			return "";
		} else if (var3 == 1) {
			return var4[0];
		} else {
			int var5 = var1.length();
			int var6 = var5 * (var3 - 1);

			for (int var7 = 0; var7 < var3; ++var7) {
				var6 += var4[var7].length();
			}

			char[] var10 = new char[var6];
			int var8 = 0;

			for (int var9 = 0; var9 < var3; ++var9) {
				if (var9 > 0) {
					var1.getChars(0, var5, var10, var8);
					var8 += var5;
				}

				var4[var9].getChars(0, var4[var9].length(), var10, var8);
				var8 += var4[var9].length();
			}

			return new String(var10);
		}
	}
}
