import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tt")
public final class class499 implements Comparable {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[Lxm;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("av")
	Object field5443;
	@ObfuscatedName("at")
	Object field5444;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		longValue = 2286872270706208031L
	)
	long field5445;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = -2975702961368216467L
	)
	long field5446;

	class499(Object var1, Object var2) {
		this.field5443 = var1;
		this.field5444 = var2;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ltt;B)I",
		garbageValue = "-4"
	)
	int method10144(class499 var1) {
		if (this.field5446 < var1.field5446) {
			return -1;
		} else {
			return this.field5446 > var1.field5446 ? 1 : 0;
		}
	}

	public int hashCode() {
		return this.field5444.hashCode();
	}

	public int compareTo(Object var1) {
		return this.method10144((class499)var1);
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class499) {
			return this.field5444.equals(((class499)var1).field5444);
		} else {
			throw new IllegalArgumentException();
		}
	}
}
