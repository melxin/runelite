import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qa")
@Implements("ModeWhere")
public enum ModeWhere implements Enum {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	field5178("", 0, new class437[]{class437.field5142, class437.field5144}),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	field5167("", 1, new class437[]{class437.field5140, class437.field5142, class437.field5144}),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	field5165("", 2, new class437[]{class437.field5140, class437.field5141, class437.field5142}),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	field5166("", 3, new class437[]{class437.field5140}),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	field5169("", 4),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	field5168("", 5, new class437[]{class437.field5140, class437.field5142}),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	field5170("", 6, new class437[]{class437.field5142}),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	field5177("", 8, new class437[]{class437.field5140, class437.field5142}),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	field5173("", 9, new class437[]{class437.field5140, class437.field5141}),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	field5163("", 10, new class437[]{class437.field5140}),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	field5172("", 11, new class437[]{class437.field5140}),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	field5174("", 12, new class437[]{class437.field5140, class437.field5142}),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	field5175("", 13, new class437[]{class437.field5140});

	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -589936755
	)
	@Export("id")
	final int id;
	@ObfuscatedName("as")
	final Set field5171;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lqj;)V"
	)
	ModeWhere(String var3, int var4, class437[] var5) {
		this.field5171 = new HashSet();
		this.id = var4;
		class437[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class437 var8 = var6[var7];
			this.field5171.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.field5171 = new HashSet();
		this.id = var4;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
