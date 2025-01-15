import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rs")
public final class class466 implements Comparable {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("ay")
	Object field4970;
	@ObfuscatedName("ah")
	Object field4967;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = 7941363310758731965L
	)
	long field4969;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = -8628826825301261969L
	)
	long field4966;

	class466(Object var1, Object var2) {
		this.field4970 = var1;
		this.field4967 = var2;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lrs;I)I",
		garbageValue = "-1075640087"
	)
	int method9059(class466 var1) {
		if (this.field4966 < var1.field4966) {
			return -1;
		} else {
			return this.field4966 > var1.field4966 ? 1 : 0;
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class466) {
			return this.field4967.equals(((class466)var1).field4967);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int compareTo(Object var1) {
		return this.method9059((class466)var1);
	}

	public int hashCode() {
		return this.field4967.hashCode();
	}
}
