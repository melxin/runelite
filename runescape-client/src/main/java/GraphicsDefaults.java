import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("th")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static Archive field5117;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1995491485
	)
	public int field5116;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -874753849
	)
	public int field5106;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1285545511
	)
	public int field5102;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1636138719
	)
	public int field5103;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 673540619
	)
	public int field5104;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -819112465
	)
	public int field5105;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1424382797
	)
	public int field5108;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 612064461
	)
	public int field5107;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1264433171
	)
	public int field5100;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -386319745
	)
	public int field5109;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -2093006963
	)
	public int field5110;
	@ObfuscatedName("as")
	final int field5111;
	@ObfuscatedName("aq")
	final int field5112;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1431655765
	)
	final int field5113;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1431655765
	)
	final int field5114;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -858993459
	)
	final int field5115;
	@ObfuscatedName("al")
	public final int[][] field5101;

	public GraphicsDefaults() {
		this.field5116 = -1;
		this.field5106 = -1;
		this.field5102 = -1;
		this.field5103 = -1;
		this.field5104 = -1;
		this.field5105 = -1;
		this.field5108 = -1;
		this.field5107 = -1;
		this.field5100 = -1;
		this.field5109 = -1;
		this.field5110 = -1;
		this.field5111 = 1;
		this.field5112 = 2;
		this.field5113 = 1;
		this.field5114 = 1;
		this.field5115 = 1;
		this.field5101 = new int[3][5];
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lpq;I)V",
		garbageValue = "-1380656931"
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
					this.field5116 = var3.readNullableLargeSmart();
					this.field5106 = var3.readNullableLargeSmart();
					this.field5102 = var3.readNullableLargeSmart();
					this.field5103 = var3.readNullableLargeSmart();
					this.field5104 = var3.readNullableLargeSmart();
					this.field5105 = var3.readNullableLargeSmart();
					this.field5108 = var3.readNullableLargeSmart();
					this.field5107 = var3.readNullableLargeSmart();
					this.field5100 = var3.readNullableLargeSmart();
					this.field5109 = var3.readNullableLargeSmart();
					this.field5110 = var3.readNullableLargeSmart();
					break;
				case 3:
					for (int var5 = 0; var5 < this.field5101.length; ++var5) {
						for (int var6 = 0; var6 < this.field5101[var5].length; ++var6) {
							this.field5101[var5][var6] = var3.readMedium();
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lpq;B)V",
		garbageValue = "88"
	)
	public static void method9495(AbstractArchive var0) {
		DbRowType.field5417 = var0;
	}
}
