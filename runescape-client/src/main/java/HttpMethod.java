import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("an")
@Implements("HttpMethod")
public class HttpMethod implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lan;"
	)
	@Export("POST")
	public static final HttpMethod POST;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lan;"
	)
	@Export("GET")
	public static final HttpMethod GET;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lan;"
	)
	@Export("PUT")
	static final HttpMethod PUT;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lan;"
	)
	@Export("PATCH")
	static final HttpMethod PATCH;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lan;"
	)
	@Export("DELETE")
	static final HttpMethod DELETE;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "[Lvy;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -725617313
	)
	int field39;
	@ObfuscatedName("aj")
	@Export("name")
	String name;
	@ObfuscatedName("av")
	boolean field41;
	@ObfuscatedName("au")
	boolean field42;

	static {
		POST = new HttpMethod(0, "POST", true, true);
		GET = new HttpMethod(1, "GET", true, false);
		PUT = new HttpMethod(2, "PUT", false, true);
		PATCH = new HttpMethod(3, "PATCH", false, true);
		DELETE = new HttpMethod(4, "DELETE", false, true);
	}

	HttpMethod(int var1, String var2, boolean var3, boolean var4) {
		this.field39 = var1;
		this.name = var2;
		this.field41 = var3;
		this.field42 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "97"
	)
	boolean method72() {
		return this.field41;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1071289392"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field39;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-68"
	)
	@Export("getName")
	public String getName() {
		return this.name;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1574704832"
	)
	boolean method83() {
		return this.field42;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lir;",
		garbageValue = "847937127"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0);
			var1 = new ObjectComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			if (var1.isSolid) {
				var1.interactType = 0;
				var1.boolean1 = false;
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
