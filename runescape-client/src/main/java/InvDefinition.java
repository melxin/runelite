import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("InvDefinition_archive")
	static AbstractArchive InvDefinition_archive;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("InvDefinition_cached")
	static EvictingDualNodeHashTable InvDefinition_cached;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lxc;"
	)
	static IndexedSprite field1954;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1593634333
	)
	@Export("size")
	public int size;

	static {
		InvDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	InvDefinition() {
		this.size = 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lwj;B)V",
		garbageValue = "71"
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lwj;II)V",
		garbageValue = "547961759"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) {
			this.size = var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("po")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "62"
	)
	static void method4188(int var0) {
		SequenceDefinition var1 = class171.SequenceDefinition_get(var0);
		if (var1.isCachedModelIdSet()) {
			if (class150.method3908(var1.SequenceDefinition_cachedModelId) == 2) {
				Client.field595.add(var1.SequenceDefinition_cachedModelId);
			}

		}
	}
}
