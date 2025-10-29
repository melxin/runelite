import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ip")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("ParamDefinition_cached")
	public static EvictingDualNodeHashTable ParamDefinition_cached;
	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	static Archive field2290;
	@ObfuscatedName("ag")
	@Export("type")
	char type;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -822826545
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("ae")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("aj")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	ParamComposition() {
		this.autoDisable = true;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "653356064"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxa;B)V",
		garbageValue = "-1"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lxa;II)V",
		garbageValue = "-1884940292"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.type = GrandExchangeOfferUnitPriceComparator.method8810(var1.readByte());
		} else if (var2 == 2) {
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) {
			this.autoDisable = false;
		} else if (var2 == 5) {
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-667029158"
	)
	@Export("isString")
	public boolean isString() {
		return this.type == 's';
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "15"
	)
	public static final synchronized long method4708() {
		long var0 = System.currentTimeMillis();
		if (var0 < class340.field3876) {
			class182.field1969 += class340.field3876 - var0;
		}

		class340.field3876 = var0;
		return class182.field1969 + var0;
	}
}
