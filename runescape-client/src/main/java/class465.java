import java.applet.Applet;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ry")
public final class class465 {
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("ab")
	final Comparator field4964;
	@ObfuscatedName("aw")
	final Map field4962;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	final class434 field4960;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	final class434 field4961;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = -1799421662780196785L
	)
	final long field4966;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	final class463 field4963;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 658889573
	)
	final int field4965;

	@ObfuscatedSignature(
		descriptor = "(JILrw;)V"
	)
	class465(long var1, int var3, class463 var4) {
		this.field4964 = new class464(this);
		this.field4966 = var1;
		this.field4965 = var3;
		this.field4963 = var4;
		if (this.field4965 == -1) {
			this.field4962 = new HashMap(64);
			this.field4960 = new class434(64, this.field4964);
			this.field4961 = null;
		} else {
			if (this.field4963 == null) {
				throw new IllegalArgumentException("");
			}

			this.field4962 = new HashMap(this.field4965);
			this.field4960 = new class434(this.field4965, this.field4964);
			this.field4961 = new class434(this.field4965);
		}

	}

	@ObfuscatedSignature(
		descriptor = "(ILrw;)V"
	)
	public class465(int var1, class463 var2) {
		this(-1L, var1, var2);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1668585455"
	)
	boolean method8876() {
		return this.field4965 != -1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "453033614"
	)
	public Object method8877(Object var1) {
		synchronized(this) {
			if (-1L != this.field4966) {
				this.method8879();
			}

			class466 var3 = (class466)this.field4962.get(var1);
			if (var3 == null) {
				return null;
			} else {
				this.method8878(var3, false);
				return var3.field4969;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;B)Ljava/lang/Object;",
		garbageValue = "-66"
	)
	public Object method8882(Object var1, Object var2) {
		synchronized(this) {
			if (this.field4966 != -1L) {
				this.method8879();
			}

			class466 var4 = (class466)this.field4962.get(var1);
			if (var4 != null) {
				Object var8 = var4.field4969;
				var4.field4969 = var2;
				this.method8878(var4, false);
				return var8;
			} else {
				class466 var5;
				if (this.method8876() && this.field4962.size() == this.field4965) {
					var5 = (class466)this.field4961.remove();
					this.field4962.remove(var5.field4967);
					this.field4960.remove(var5);
				}

				var5 = new class466(var2, var1);
				this.field4962.put(var1, var5);
				this.method8878(var5, true);
				return null;
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lrh;ZI)V",
		garbageValue = "-1548982434"
	)
	void method8878(class466 var1, boolean var2) {
		if (!var2) {
			this.field4960.remove(var1);
			if (this.method8876() && !this.field4961.remove(var1)) {
				throw new IllegalStateException("");
			}
		}

		var1.field4968 = System.currentTimeMillis();
		if (this.method8876()) {
			switch(this.field4963.field4955) {
			case 0:
				var1.field4970 = var1.field4968;
				break;
			case 1:
				++var1.field4970;
			}

			this.field4961.add(var1);
		}

		this.field4960.add(var1);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-726623226"
	)
	void method8879() {
		if (-1L == this.field4966) {
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4966;

			while (!this.field4960.isEmpty()) {
				class466 var3 = (class466)this.field4960.peek();
				if (var3.field4968 >= var1) {
					return;
				}

				this.field4962.remove(var3.field4967);
				this.field4960.remove(var3);
				if (this.method8876()) {
					this.field4961.remove(var3);
				}
			}

		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-314645414"
	)
	@Export("clearFiles")
	public void clearFiles() {
		synchronized(this) {
			this.field4962.clear();
			this.field4960.clear();
			if (this.method8876()) {
				this.field4961.clear();
			}

		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V",
		garbageValue = "265132971"
	)
	public static void method8896(Applet var0, String var1) {
		class31.field151 = var0;
		if (var1 != null) {
			class31.field156 = var1;
		}

	}
}
