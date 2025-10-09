import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	public static final WorldMapCacheName field3505;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	public static final WorldMapCacheName field3501;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	public static final WorldMapCacheName field3502;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	static final WorldMapCacheName field3503;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	public static final WorldMapCacheName field3504;
	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("af")
	@Export("name")
	public final String name;

	static {
		field3505 = new WorldMapCacheName("details");
		field3501 = new WorldMapCacheName("compositemap");
		field3502 = new WorldMapCacheName("compositetexture");
		field3503 = new WorldMapCacheName("area");
		field3504 = new WorldMapCacheName("labels");
	}

	WorldMapCacheName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SB)V",
		garbageValue = "126"
	)
	public static void method6908(String[] var0, short[] var1) {
		class324.sortItemsByName(var0, var1, 0, var0.length - 1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-28"
	)
	public static void method6906() {
		EnumComposition.EnumDefinition_cached.clear();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltl;Ltl;II)V",
		garbageValue = "-2112733223"
	)
	public static void method6907(DynamicArray var0, DynamicArray var1, int var2) {
		PacketBufferNode.method7052(var0, (class572)null, true);
		DefaultsGroup.method10548(var1, var0.field5571);
		if (var2 >= 0 && var2 <= var0.size * 479682119) {
			if (var1.size * 479682119 != 0) {
				var0.method10437(var1.size * 479682119 + var0.size * 479682119);
				if (var2 < var0.size * 479682119) {
					class167.method4091(var0, var2, var0, var1.size * 479682119 + var2, var0.size * 479682119 - var2);
				}

				class167.method4091(var1, 0, var0, var2, var1.size * 479682119);
				var0.size += var1.size;
			}
		} else {
			throw new RuntimeException();
		}
	}
}
