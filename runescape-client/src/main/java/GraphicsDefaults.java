import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tb")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 849823467
	)
	public int field5101;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -543146313
	)
	public int field5109;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -850436881
	)
	public int field5106;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 688630683
	)
	public int field5102;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -153861717
	)
	public int field5103;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -337795767
	)
	public int field5104;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1583883493
	)
	public int field5105;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1333745085
	)
	public int field5113;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 464825913
	)
	public int field5100;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 774560005
	)
	public int field5108;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 664975929
	)
	public int field5107;
	@ObfuscatedName("ai")
	final int field5110;
	@ObfuscatedName("al")
	final int field5099;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1431655765
	)
	final int field5112;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1431655765
	)
	final int field5111;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -858993459
	)
	final int field5114;
	@ObfuscatedName("ak")
	public final int[][] field5115;

	public GraphicsDefaults() {
		this.field5101 = -1;
		this.field5109 = -1;
		this.field5106 = -1;
		this.field5102 = -1;
		this.field5103 = -1;
		this.field5104 = -1;
		this.field5105 = -1;
		this.field5113 = -1;
		this.field5100 = -1;
		this.field5108 = -1;
		this.field5107 = -1;
		this.field5110 = 1;
		this.field5099 = 2;
		this.field5112 = 1;
		this.field5111 = 1;
		this.field5114 = 1;
		this.field5115 = new int[3][5];
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "-1"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field5097.group);
		Buffer var3 = new Buffer(var2);

		while (true) {
			while (true) {
				int var4 = var3.readUnsignedByte();
				if (var4 == 0) {
					return;
				}

				switch(var4) {
				case 1:
					var3.readMedium();
					break;
				case 2:
					this.field5101 = var3.readNullableLargeSmart();
					this.field5109 = var3.readNullableLargeSmart();
					this.field5106 = var3.readNullableLargeSmart();
					this.field5102 = var3.readNullableLargeSmart();
					this.field5103 = var3.readNullableLargeSmart();
					this.field5104 = var3.readNullableLargeSmart();
					this.field5105 = var3.readNullableLargeSmart();
					this.field5113 = var3.readNullableLargeSmart();
					this.field5100 = var3.readNullableLargeSmart();
					this.field5108 = var3.readNullableLargeSmart();
					this.field5107 = var3.readNullableLargeSmart();
					break;
				case 3:
					for (int var5 = 0; var5 < this.field5115.length; ++var5) {
						for (int var6 = 0; var6 < this.field5115[var5].length; ++var6) {
							this.field5115[var5][var6] = var3.readMedium();
						}
					}
				}
			}
		}
	}
}
